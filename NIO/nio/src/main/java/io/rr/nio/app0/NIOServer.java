package io.rr.nio.app0;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * @author romanr on 12/28/2016.
 */
public class NIOServer {
    public static void main(String[] args) throws IOException {

        // Selector: multiplexor of SelectableChannel objects
        Selector selector = Selector.open(); // selector is open here

        // ServerSocketChannel: selectable channel for stream-oriented listening sockets
        ServerSocketChannel channel = ServerSocketChannel.open();
        InetSocketAddress address = new InetSocketAddress("localhost", 8082);

        // Binds the channel's socket to a local address and configures the socket to listen for connections
        channel.bind(address);

        // Adjusts this channel's blocking mode.
        channel.configureBlocking(false);

        int ops = channel.validOps();
        SelectionKey key = channel.register(selector, ops, null);

        // Infinite loop..
        // Keep server running
        while (true) {

            log("i'm a server and i'm waiting for new connection and buffer select...");
            // Selects a set of keys whose corresponding channels are ready for I/O operations
            selector.select();

            // token representing the registration of a SelectableChannel with a Selector
            Set<SelectionKey> keys = selector.selectedKeys();
            Iterator<SelectionKey> iterator = keys.iterator();

            while (iterator.hasNext()) {
                SelectionKey myKey = iterator.next();

                // Tests whether this key's channel is ready to accept a new socket connection
                if (myKey.isAcceptable()) {
                    SocketChannel socketChannel = channel.accept();

                    // Adjusts this channel's blocking mode to false
                    socketChannel.configureBlocking(false);

                    // Operation-set bit for read operations
                    socketChannel.register(selector, SelectionKey.OP_READ);
                    log("Connection Accepted: " + socketChannel.getLocalAddress() + "\n");

                    // Tests whether this key's channel is ready for reading
                } else if (myKey.isReadable()) {

                    SocketChannel channel1 = (SocketChannel) myKey.channel();
                    ByteBuffer buffer = ByteBuffer.allocate(256);
                    channel1.read(buffer);
                    String result = new String(buffer.array()).trim();

                    log("Message received: " + result);
                    channel.close();
                }
                iterator.remove();
            }
        }
    }

    private static void log(String str) {
        System.out.println(str);
    }
}
