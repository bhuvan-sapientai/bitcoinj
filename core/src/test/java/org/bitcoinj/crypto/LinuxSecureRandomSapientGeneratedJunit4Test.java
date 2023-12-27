package org.bitcoinj.crypto;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;

import org.junit.rules.ExpectedException;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.spy;
import static org.hamcrest.Matchers.isA;

import org.junit.Ignore;

import java.io.DataInputStream;

import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;

public class LinuxSecureRandomSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    private final DataInputStream disMock = mock(DataInputStream.class, "dis");

    //Sapient generated method id: ${fb538ea0-a1d8-30d7-986f-c5f6577d88d8}
    @Test()
    public void engineNextBytesTest() throws IOException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        LinuxSecureRandom target = new LinuxSecureRandom();
        byte[] byteArray = new byte[]{};

        //Act Statement(s)
        target.engineNextBytes(byteArray);
    }

    //Sapient generated method id: ${c6c6ba76-88fa-34ee-bd4f-e4d29ed56953}
    @Ignore()
    @Test()
    public void engineNextBytesWhenCaughtIOExceptionThrowsRuntimeException() throws IOException {
        /* Branches:
         * (catch-exception (IOException)) : true
         */
        //Arrange Statement(s)
        LinuxSecureRandom target = new LinuxSecureRandom();
        IOException iOExceptionMock = mock(IOException.class);
        byte[] byteArray = new byte[]{(byte) -84, (byte) 77, (byte) -92, (byte) -85, (byte) -98, (byte) -123, (byte) -70, (byte) -98, (byte) -91, (byte) -117, (byte) 105, (byte) -98, (byte) -124, (byte) -78, (byte) -91, (byte) -98};
        doThrow(iOExceptionMock).when(disMock).readFully(byteArray);
        thrown.expect(RuntimeException.class);
        thrown.expectCause(isA(IOException.class));

        //Act Statement(s)
        target.engineNextBytes(byteArray);
        byte[] byteByteArrayArray = new byte[]{(byte) 75, (byte) -21, (byte) -112, (byte) 123, (byte) 30, (byte) -95, (byte) 61, (byte) -28, (byte) 43, (byte) -56, (byte) -29, (byte) -79, (byte) 100, (byte) 115, (byte) 122, (byte) 97};

        //Assert statement(s)
        assertThat(byteArray, equalTo(byteByteArrayArray));
        verify(disMock).readFully(byteArray);
    }

    //Sapient generated method id: ${3679146c-32e8-3609-a6d6-f4630aa360c9}
    @Test()
    public void engineGenerateSeedTest() throws IOException {
        //Arrange Statement(s)
        LinuxSecureRandom target = spy(new LinuxSecureRandom());
        byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        doNothing().when(target).engineNextBytes(byteArray);

        //Act Statement(s)
        byte[] result = target.engineGenerateSeed(16);

        //Assert statement(s)
        assertThat(result, equalTo(byteArray));
        verify(target).engineNextBytes(byteArray);
    }
}
