package org.bitcoinj.net;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;

import org.junit.rules.ExpectedException;

import javax.net.SocketFactory;
import java.net.SocketAddress;
import java.util.Set;

import org.bitcoinj.utils.ListenableCompletableFuture;

import java.util.Objects;
import java.util.HashSet;
import java.time.Duration;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.isA;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.hamcrest.Matchers.is;

public class BlockingClientManagerSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final StreamConnection streamConnectionMock = mock(StreamConnection.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${2bb3f3f2-19d9-3686-8409-b9ef5ffc97ff}
    @Test()
    public void openConnectionWhenIsRunningNotThrowsIllegalStateException() {
        /* Branches:
         * (!isRunning()) : true
         */
        //Arrange Statement(s)
        SocketFactory socketFactory = SocketFactory.getDefault();
        BlockingClientManager target = spy(new BlockingClientManager(socketFactory));
        doReturn(false).when(target).isRunning();
        thrown.expect(IllegalStateException.class);
        //TODO: Needs initialization with real value
        SocketAddress socketAddress = null;
        //Act Statement(s)
        target.openConnection(socketAddress, streamConnectionMock);
        //Assert statement(s)
        verify(target).isRunning();
    }

    //Sapient generated method id: ${78ebb428-2cae-3916-9c06-f91746d86a49}
    @Ignore()
    @Test()
    public void openConnectionWhenIsRunning() throws IOException {
        /* Branches:
         * (!isRunning()) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: org.bitcoinj.net.BlockingClient
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        SocketFactory socketFactory = SocketFactory.getDefault();
        BlockingClientManager target = spy(new BlockingClientManager(socketFactory));
        doReturn(true).when(target).isRunning();
        //TODO: Needs initialization with real value
        SocketAddress socketAddress = null;
        //Act Statement(s)
        ListenableCompletableFuture<SocketAddress> result = target.openConnection(socketAddress, streamConnectionMock);
        Duration duration = Duration.ofSeconds(1L);
        Set<BlockingClient> blockingClientSet = new HashSet<>();
        BlockingClient blockingClient = new BlockingClient((SocketAddress) null, streamConnectionMock, duration, socketFactory, blockingClientSet);
        ListenableCompletableFuture<SocketAddress> listenableCompletableFuture = blockingClient.getConnectFuture();
        //Assert statement(s)
        //TODO: Please implement equals method in ListenableCompletableFuture for verification to succeed or you need to adjust respective assertion statements
        assertThat(result, equalTo(listenableCompletableFuture));
        verify(target).isRunning();
    }

    //Sapient generated method id: ${2848bd70-59ca-38e3-af92-ac1e0b5d6268}
    @Ignore()
    @Test()
    public void openConnectionWhenCaughtIOExceptionThrowsRuntimeException() throws IOException {
        /* Branches:
         * (!isRunning()) : false
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: org.bitcoinj.net.BlockingClient
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        SocketFactory socketFactory = SocketFactory.getDefault();
        BlockingClientManager target = spy(new BlockingClientManager(socketFactory));
        doReturn(true).when(target).isRunning();
        thrown.expect(RuntimeException.class);
        thrown.expectCause(is(instanceOf(IOException.class)));
        //TODO: Needs initialization with real value
        SocketAddress socketAddress = null;
        //Act Statement(s)
        target.openConnection(socketAddress, streamConnectionMock);
        //Assert statement(s)
        verify(target).isRunning();
    }

    //Sapient generated method id: ${8117fc59-e007-3a51-9f07-287c570ddca2}
    @Test()
    public void setConnectTimeoutMillisTest() {
        //Arrange Statement(s)
        SocketFactory socketFactory = SocketFactory.getDefault();
        BlockingClientManager target = new BlockingClientManager(socketFactory);
        //Act Statement(s)
        target.setConnectTimeoutMillis(1);
    }

    //Sapient generated method id: ${2eae9292-3a4e-3aef-a658-61695265ca34}
    @Test()
    public void shutDownWhenClientsIsEmpty() throws Exception {
        /* Branches:
         * (for-each(clients)) : false
         */
        //Arrange Statement(s)
        SocketFactory socketFactory = SocketFactory.getDefault();
        BlockingClientManager target = new BlockingClientManager(socketFactory);
        //Act Statement(s)
        target.shutDown();
    }

    //Sapient generated method id: ${29f86e68-48e9-3bd0-a806-f49162deede6}
    @Test()
    public void getConnectedClientCountTest() {
        //Arrange Statement(s)
        SocketFactory socketFactory = SocketFactory.getDefault();
        BlockingClientManager target = new BlockingClientManager(socketFactory);
        //Act Statement(s)
        int result = target.getConnectedClientCount();
        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${7dcf31f4-d43b-3c66-8329-8b5ae2429a58}
    @Test()
    public void closeConnectionsWhenIsRunningNotThrowsIllegalStateException() {
        /* Branches:
         * (!isRunning()) : true
         */
        //Arrange Statement(s)
        SocketFactory socketFactory = SocketFactory.getDefault();
        BlockingClientManager target = spy(new BlockingClientManager(socketFactory));
        doReturn(false).when(target).isRunning();
        thrown.expect(IllegalStateException.class);
        //Act Statement(s)
        target.closeConnections(0);
        //Assert statement(s)
        verify(target).isRunning();
    }

    //Sapient generated method id: ${586cd0cd-f9a3-335f-91d9-98362a4c8115}
    @Test()
    public void closeConnectionsWhenItNotHasNext() {
        /* Branches:
         * (!isRunning()) : false
         * (n-- > 0) : true
         * (it.hasNext()) : false
         */
        //Arrange Statement(s)
        SocketFactory socketFactory = SocketFactory.getDefault();
        BlockingClientManager target = spy(new BlockingClientManager(socketFactory));
        doReturn(true).when(target).isRunning();
        //Act Statement(s)
        target.closeConnections(1);
        //Assert statement(s)
        verify(target).isRunning();
    }
}
