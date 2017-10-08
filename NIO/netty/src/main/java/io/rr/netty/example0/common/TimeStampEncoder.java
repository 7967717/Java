package io.rr.netty.example0.common;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * @author romanr on 11/3/2016.
 */
public class TimeStampEncoder extends MessageToByteEncoder<LoopBackTimeStamp> {

    protected void encode(ChannelHandlerContext channelHandlerContext, LoopBackTimeStamp loopBackTimeStamp, ByteBuf byteBuf) throws Exception {
        byteBuf.writeBytes(loopBackTimeStamp.toByteArray());
    }
}
