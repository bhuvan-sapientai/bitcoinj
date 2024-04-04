package org.bitcoinj.crypto;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;

import org.junit.rules.ExpectedException;

import java.io.DataInputStream;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mock;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class LinuxSecureRandomSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final DataInputStream disMock = mock(DataInputStream.class, "dis");

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${fb538ea0-a1d8-30d7-986f-c5f6577d88d8}, hash: 232C39EC047B7329E5E2F254A8671B7A
    @Test()
    public void engineNextBytesTest() throws IOException {
        //Arrange Statement(s)
        LinuxSecureRandom target = new LinuxSecureRandom();
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        target.engineNextBytes(byteArray);
    }

    //Sapient generated method id: ${c6c6ba76-88fa-34ee-bd4f-e4d29ed56953}, hash: 45AB8933E958CC75BAA077B6371D8F3C
    @Ignore()
    @Test()
    public void engineNextBytesWhenCaughtIOExceptionThrowsRuntimeException() throws IOException {
        /* Branches:
         * (catch-exception (IOException)) : true
         */
        //Arrange Statement(s)
        LinuxSecureRandom target = new LinuxSecureRandom();
        IOException iOExceptionMock = mock(IOException.class);
        byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3};
        doThrow(iOExceptionMock).when(disMock).readFully(byteArray);
        thrown.expect(RuntimeException.class);
        thrown.expectCause(is(instanceOf(IOException.class)));
        //Act Statement(s)
        target.engineNextBytes(byteArray);
        byte[] byteByteArrayArray = new byte[]{(byte) 96, (byte) -50, (byte) 20};
        //Assert statement(s)
        assertThat(byteArray, equalTo(byteByteArrayArray));
        verify(disMock).readFully(byteArray);
    }

    //Sapient generated method id: ${3679146c-32e8-3609-a6d6-f4630aa360c9}, hash: 6E7650A20CB3EF6BE0F3EA45B59C6B7A
    @Test()
    public void engineGenerateSeedTest() throws IOException {
        //Arrange Statement(s)
        LinuxSecureRandom target = spy(new LinuxSecureRandom());
        byte[] byteArray = new byte[]{};
        doNothing().when(target).engineNextBytes(byteArray);
        //Act Statement(s)
        byte[] result = target.engineGenerateSeed(0);
        //Assert statement(s)
        assertThat(result, equalTo(byteArray));
        verify(target).engineNextBytes(byteArray);
    }
}
