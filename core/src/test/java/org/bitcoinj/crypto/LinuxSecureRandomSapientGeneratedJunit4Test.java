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

public class LinuxSecureRandomSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

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
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        LinuxSecureRandom target = new LinuxSecureRandom();
        thrown.expect(RuntimeException.class);
        thrown.expectCause(isA(IOException.class));
        byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16};
        //Act Statement(s)
        target.engineNextBytes(byteArray);
        byte[] byteByteArrayArray = new byte[]{(byte) 37, (byte) -13, (byte) 82, (byte) 56, (byte) 21, (byte) 64, (byte) 9, (byte) -15, (byte) 104, (byte) -114, (byte) -107, (byte) 84, (byte) 16, (byte) -64, (byte) -76, (byte) 16};
        //Assert statement(s)
        assertThat(byteArray, equalTo(byteByteArrayArray));
    }

    //Sapient generated method id: ${3679146c-32e8-3609-a6d6-f4630aa360c9}
    @Test()
    public void engineGenerateSeedTest() throws IOException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
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
