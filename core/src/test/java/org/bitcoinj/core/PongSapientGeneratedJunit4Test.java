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
import java.io.ByteArrayOutputStream;

import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

public class PongSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${db344e3b-696d-3b02-8e35-1aaa5300bde6}
    @Test()
    public void readTest() throws BufferUnderflowException, ProtocolException {
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byteUtils.when(() -> ByteUtils.readInt64((ByteBuffer) any())).thenReturn(0L);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            Pong result = Pong.read(byteBuffer);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            byteUtils.verify(() -> ByteUtils.readInt64((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${3155f475-158f-3510-8516-db6562387204}
    @Test()
    public void ofTest() {

        //Act Statement(s)
        Pong result = Pong.of(0L);

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${db734794-4476-3b9d-94dd-477a1a1aec91}
    @Test()
    public void bitcoinSerializeToStreamTest() throws IOException {
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteUtils.when(() -> ByteUtils.writeInt64LE(0L, byteArrayOutputStream)).thenAnswer((Answer<Void>) invocation -> null);
            Pong target = Pong.of(0L);
            //Act Statement(s)
            target.bitcoinSerializeToStream(byteArrayOutputStream);
            //Assert statement(s)
            byteUtils.verify(() -> ByteUtils.writeInt64LE(0L, byteArrayOutputStream), atLeast(1));
        }
    }

    //Sapient generated method id: ${0f60a999-74fa-33eb-a2b0-924b88cae48d}
    @Test()
    public void nonceTest() {
        //Arrange Statement(s)
        Pong target = Pong.of(0L);

        //Act Statement(s)
        long result = target.nonce();

        //Assert statement(s)
        assertThat(result, equalTo(0L));
    }
}
