package org.bitcoinj.net;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;
import java.time.Duration;
import java.net.SocketAddress;

import org.bitcoinj.utils.ListenableCompletableFuture;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.mock;

import org.junit.Ignore;

import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.is;

public class NioClientSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final StreamConnection streamConnectionMock = mock(StreamConnection.class, "{}");

    //Sapient generated method id: ${561998f8-7691-38b6-b1d5-0712aa9b4d77}
    @Ignore()
    @Test()
    public void closeConnectionTest() throws IOException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Duration duration = Duration.ofSeconds(10L);
        NioClient target = new NioClient((SocketAddress) null, streamConnectionMock, duration);

        //Act Statement(s)
        target.closeConnection();
    }

    //Sapient generated method id: ${90b47dad-6d2c-3295-946b-afa0a749fd31}
    @Ignore()
    @Test()
    public void writeBytesTest() throws IOException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Duration duration = Duration.ofSeconds(10L);
        NioClient target = new NioClient((SocketAddress) null, streamConnectionMock, duration);
        byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3};

        //Act Statement(s)
        ListenableCompletableFuture<Void> result = target.writeBytes(byteArray);
        ListenableCompletableFuture<Void> listenableCompletableFuture = new ListenableCompletableFuture<>();

        //Assert statement(s)
        //TODO: Please implement equals method in ListenableCompletableFuture for verification to succeed or you need to adjust respective assertion statements
        assertThat(result, equalTo(listenableCompletableFuture));
    }
}
