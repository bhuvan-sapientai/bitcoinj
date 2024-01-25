package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.nio.BufferUnderflowException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class ServicesSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${3155f475-158f-3510-8516-db6562387204}
    @Test()
    public void ofTest() {

        //Act Statement(s)
        Services result = Services.of(0L);

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${7ef024fb-dd14-348c-bb93-ea4260fa7df5}
    @Test()
    public void noneTest() {

        //Act Statement(s)
        Services result = Services.none();

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${db344e3b-696d-3b02-8e35-1aaa5300bde6}
    @Ignore()
    @Test()
    public void readTest() throws BufferUnderflowException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);

        //Act Statement(s)
        Services result = Services.read(byteBuffer);

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${178b56ae-48d8-313f-b80c-f3a29a972a32}
    @Test()
    public void bitsTest() {
        //Arrange Statement(s)
        Services target = Services.of(0L);

        //Act Statement(s)
        long result = target.bits();

        //Assert statement(s)
        assertThat(result, equalTo(0L));
    }

    //Sapient generated method id: ${93772c36-5780-31a9-9bb7-cc95344eb867}
    @Test()
    public void hasAnyWhenBitsNotEquals0() {
        /* Branches:
         * (bits != 0) : true
         */
        //Arrange Statement(s)
        Services target = Services.of(1L);

        //Act Statement(s)
        boolean result = target.hasAny();

        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${4d3691d1-e797-3ac1-a332-39497c106159}
    @Test()
    public void hasAnyWhenBitsEquals0() {
        /* Branches:
         * (bits != 0) : false
         */
        //Arrange Statement(s)
        Services target = Services.of(0L);

        //Act Statement(s)
        boolean result = target.hasAny();

        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${711c1202-be2f-3257-9a83-1334fa377a87}
    @Test()
    public void hasWhenBitsAndBitmaskEqualsBitmask() {
        /* Branches:
         * ((bits & bitmask) == bitmask) : true
         */
        //Arrange Statement(s)
        Services target = Services.of(0L);

        //Act Statement(s)
        boolean result = target.has(0L);

        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${587bc310-f3bc-3aae-9d37-59e189334df5}
    @Test()
    public void hasWhenBitsAndBitmaskNotEqualsBitmask() {
        /* Branches:
         * ((bits & bitmask) == bitmask) : false
         */
        //Arrange Statement(s)
        Services target = Services.of(0L);

        //Act Statement(s)
        boolean result = target.has(2L);

        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${a9728329-4398-3d9c-b998-05028ef306ac}
    @Test()
    public void anyOfWhenBitsAndBitmaskNotEquals0() {
        /* Branches:
         * ((bits & bitmask) != 0) : true
         */
        //Arrange Statement(s)
        Services target = Services.of(0L);

        //Act Statement(s)
        boolean result = target.anyOf(0L);

        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${ea1f51c5-5cc9-3632-b46f-e3b3b0933a74}
    @Test()
    public void anyOfWhenBitsAndBitmaskEquals0() {
        /* Branches:
         * ((bits & bitmask) != 0) : false
         */
        //Arrange Statement(s)
        Services target = Services.of(0L);

        //Act Statement(s)
        boolean result = target.anyOf(0L);

        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${74367ac6-67d1-3ba8-9bdd-4aafa43d4139}
    @Ignore()
    @Test()
    public void writeTest() throws BufferOverflowException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Services target = Services.of(123456789L);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);

        //Act Statement(s)
        ByteBuffer result = target.write(byteBuffer);

        //Assert statement(s)
        assertThat(result, equalTo(byteBuffer));
    }

    //Sapient generated method id: ${9d328af1-2293-3544-bbbc-a0683c1f9fbe}
    @Ignore()
    @Test()
    public void serializeTest() {
        //Arrange Statement(s)
        Services target = Services.of(1L);

        //Act Statement(s)
        byte[] result = target.serialize();
        byte[] byteResultArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};

        //Assert statement(s)
        assertThat(result, equalTo(byteResultArray));
    }

    //Sapient generated method id: ${de65989e-bf16-36ed-8772-7ccb6b0fc53a}
    @Test()
    public void toStringWhenBitsNotEquals0() {
        /* Branches:
         * ((bits & NODE_NETWORK) == NODE_NETWORK) : true
         * ((bits & NODE_BLOOM) == NODE_BLOOM) : true
         * ((bits & NODE_WITNESS) == NODE_WITNESS) : true
         * ((bits & NODE_NETWORK_LIMITED) == NODE_NETWORK_LIMITED) : true
         * (bits != 0) : true
         */
        //Arrange Statement(s)
        Services target = Services.of(0L);

        //Act Statement(s)
        String result = target.toString();

        //Assert statement(s)
        assertThat(result, equalTo(""));
    }
}
