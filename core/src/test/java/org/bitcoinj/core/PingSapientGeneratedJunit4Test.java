package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.nio.BufferUnderflowException;
import java.io.IOException;

import org.mockito.stubbing.Answer;
import org.bitcoinj.base.internal.ByteUtils;
import org.mockito.MockedStatic;

import java.nio.ByteBuffer;
import java.io.OutputStream;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

public class PingSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${db344e3b-696d-3b02-8e35-1aaa5300bde6}
    @Test()
    public void readTest() throws BufferUnderflowException, ProtocolException {
        //Arrange Statement(s)
        /*try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
    byteUtils.when(() -> ByteUtils.readInt64((ByteBuffer) any())).thenReturn(1234567890L);
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    //Act Statement(s)
    Ping result = Ping.read(byteBuffer);
    //Assert statement(s)
    assertThat(result, is(notNullValue()));
    byteUtils.verify(() -> ByteUtils.readInt64((ByteBuffer) any()));
}*/
    }

    //Sapient generated method id: ${3155f475-158f-3510-8516-db6562387204}
    @Test()
    public void ofTest() {
        //Act Statement(s)
        Ping result = Ping.of(123456789L);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${db734794-4476-3b9d-94dd-477a1a1aec91}
    @Test()
    public void bitcoinSerializeToStreamTest() throws IOException, BufferUnderflowException, ProtocolException {
        //Arrange Statement(s)
        /*try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
    byteUtils.when(() -> ByteUtils.readInt64((ByteBuffer) any())).thenReturn(0L);
    byteUtils.when(() -> ByteUtils.writeInt64LE(eq(0L), (OutputStream) any())).thenAnswer((Answer<Void>) invocation -> null);
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    Ping target = Ping.read(byteBuffer);
    OutputStream outputStream = OutputStream.nullOutputStream();
    //Act Statement(s)
    target.bitcoinSerializeToStream(outputStream);
    //Assert statement(s)
    byteUtils.verify(() -> ByteUtils.readInt64((ByteBuffer) any()));
    byteUtils.verify(() -> ByteUtils.writeInt64LE(eq(0L), (OutputStream) any()));
}*/
    }

    //Sapient generated method id: ${450fec42-a4ed-3d51-a22e-04fdda8e9492}
    @Test()
    public void hasNonceTest() throws BufferUnderflowException, ProtocolException {
        //Arrange Statement(s)
        /*try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
    byteUtils.when(() -> ByteUtils.readInt64((ByteBuffer) any())).thenReturn(0L);
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    Ping target = Ping.read(byteBuffer);
    //Act Statement(s)
    boolean result = target.hasNonce();
    //Assert statement(s)
    assertThat(result, equalTo(Boolean.TRUE));
    byteUtils.verify(() -> ByteUtils.readInt64((ByteBuffer) any()));
}*/
    }

    //Sapient generated method id: ${0f60a999-74fa-33eb-a2b0-924b88cae48d}
    @Test()
    public void nonceTest() throws BufferUnderflowException, ProtocolException {
        //Arrange Statement(s)
        /*try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
    byteUtils.when(() -> ByteUtils.readInt64((ByteBuffer) any())).thenReturn(123456789L);
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    Ping target = Ping.read(byteBuffer);
    //Act Statement(s)
    long result = target.nonce();
    //Assert statement(s)
    assertThat(result, equalTo(123456789L));
    byteUtils.verify(() -> ByteUtils.readInt64((ByteBuffer) any()));
}*/
    }

    //Sapient generated method id: ${e1b3568b-15cd-3080-88b7-aa9e59b698f0}
    @Test()
    public void pongTest() throws BufferUnderflowException, ProtocolException {
        //Arrange Statement(s)
        /*try (MockedStatic<Pong> pong = mockStatic(Pong.class);
    MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
    byteUtils.when(() -> ByteUtils.readInt64((ByteBuffer) any())).thenReturn(123456789L);
    Pong pong2 = Pong.of(0L);
    pong.when(() -> Pong.of(123456789L)).thenReturn(pong2);
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    Ping target = Ping.read(byteBuffer);
    //Act Statement(s)
    Pong result = target.pong();
    //Assert statement(s)
    assertThat(result, equalTo(pong2));
    byteUtils.verify(() -> ByteUtils.readInt64((ByteBuffer) any()));
    pong.verify(() -> Pong.of(123456789L), atLeast(1));
}*/
    }
}
