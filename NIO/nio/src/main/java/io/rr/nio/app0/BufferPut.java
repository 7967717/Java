package io.rr.nio.app0;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author romanr on 12/28/2016.
 */
public class BufferPut {
    public static void main(String[] args) {
        String s = " Java NIO Channels are similar to streams with a few differences:\n" +
                "\n" +
                "    You can both read and write to a Channels. Streams are typically one-way (read or write).\n" +
                "    Channels can be read and written asynchronously.\n" +
                "    Channels always read to, or write from, a Buffer.";
        byte[] bytes = s.getBytes();

        ByteBuffer buf = ByteBuffer.allocate(bytes.length);
        buf.put(bytes);

        buf.flip();

        while (buf.hasRemaining()) {
            System.out.print((char) buf.get());
        }

        buf.clear();
    }
}
