package org.bitcoinj.net;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.time.Duration;
import java.net.SocketAddress;

import org.bitcoinj.utils.ListenableCompletableFuture;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;

public class NioClientSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final SocketAddress socketAddressMock = mock(SocketAddress.class);

    private final StreamConnection streamConnectionMock = mock(StreamConnection.class);

    //Sapient generated method id: ${561998f8-7691-38b6-b1d5-0712aa9b4d77}, hash: 9E9C4DC8502F9FA48CE05AA438A03B7F
    @Ignore(value = "Potential harmful system call (ListenableCompletableFuture.whenComplete) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void closeConnectionTest() throws IOException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: manager
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Duration duration = Duration.ofDays(0L);
        NioClient target = new NioClient(socketAddressMock, streamConnectionMock, duration);

        //Act Statement(s)
        target.closeConnection();
    }

    //Sapient generated method id: ${90b47dad-6d2c-3295-946b-afa0a749fd31}, hash: 9C9C3CE1646E86641A6746BD85814F36
    @Ignore(value = "Potential harmful system call (ListenableCompletableFuture.whenComplete) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void writeBytesTest() throws IOException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: manager
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Duration duration = Duration.ofDays(0L);
        NioClient target = new NioClient(socketAddressMock, streamConnectionMock, duration);
        byte[] byteArray = new byte[]{};

        //Act Statement(s)
        ListenableCompletableFuture<Void> result = target.writeBytes(byteArray);

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }
}
