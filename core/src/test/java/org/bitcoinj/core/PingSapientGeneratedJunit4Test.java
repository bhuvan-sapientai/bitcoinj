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
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

public class PingSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${db344e3b-696d-3b02-8e35-1aaa5300bde6}, hash: 5DEC49CE29FC78F6545D2AD164FA318B
    @Test()
    public void readTest() throws BufferUnderflowException, ProtocolException {
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byteUtils.when(() -> ByteUtils.readInt64((ByteBuffer) any())).thenReturn(0L);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            Ping result = Ping.read(byteBuffer);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            byteUtils.verify(() -> ByteUtils.readInt64((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${3155f475-158f-3510-8516-db6562387204}, hash: 3BCA7615E5A417C2336B0B43883E3F61
    @Test()
    public void ofTest() {
        //Act Statement(s)
        Ping result = Ping.of(0L);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${446635b1-e6fe-3b77-80e0-98a09473e3e2}, hash: 87F161B3D76746BCDBF3B5E59ADFEA89
    @Test()
    public void randomTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Method java.util.Random::nextLong has a unrepeatable behavior
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Ping result = Ping.random();
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${db734794-4476-3b9d-94dd-477a1a1aec91}, hash: 89A06342BA52CFDB546E1FDF2062CCB0
    @Test()
    public void bitcoinSerializeToStreamTest() throws IOException {
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteUtils.when(() -> ByteUtils.writeInt64LE(0L, byteArrayOutputStream)).thenAnswer((Answer<Void>) invocation -> null);
            Ping target = Ping.of(0L);
            //Act Statement(s)
            target.bitcoinSerializeToStream(byteArrayOutputStream);
            //Assert statement(s)
            byteUtils.verify(() -> ByteUtils.writeInt64LE(0L, byteArrayOutputStream), atLeast(1));
        }
    }

    //Sapient generated method id: ${450fec42-a4ed-3d51-a22e-04fdda8e9492}, hash: 495BF361ABA6BF5FC0BE16E5B722EA42
    @Test()
    public void hasNonceTest() {
        //Arrange Statement(s)
        Ping target = Ping.of(0L);
        //Act Statement(s)
        boolean result = target.hasNonce();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${0f60a999-74fa-33eb-a2b0-924b88cae48d}, hash: EFAD03477E30344559493A6D108610C6
    @Test()
    public void nonceTest() {
        //Arrange Statement(s)
        Ping target = Ping.of(0L);
        //Act Statement(s)
        long result = target.nonce();
        //Assert statement(s)
        assertThat(result, equalTo(0L));
    }

    //Sapient generated method id: ${e1b3568b-15cd-3080-88b7-aa9e59b698f0}, hash: AE2B51E4E769C5F71BBFBF27CAF9BF3A
    @Test()
    public void pongTest() {
        //Arrange Statement(s)
        Pong pongMock = mock(Pong.class);
        try (MockedStatic<Pong> pong = mockStatic(Pong.class)) {
            pong.when(() -> Pong.of(0L)).thenReturn(pongMock);
            Ping target = Ping.of(0L);
            //Act Statement(s)
            Pong result = target.pong();
            //Assert statement(s)
            assertThat(result, equalTo(pongMock));
            pong.verify(() -> Pong.of(0L), atLeast(1));
        }
    }
}
