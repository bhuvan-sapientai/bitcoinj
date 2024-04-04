package org.bitcoinj.net;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;

import org.junit.rules.ExpectedException;

import javax.net.SocketFactory;
import java.net.SocketAddress;

import org.bitcoinj.utils.ListenableCompletableFuture;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mock;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class BlockingClientManagerSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final SocketAddress socketAddressMock = mock(SocketAddress.class);

    private final StreamConnection streamConnectionMock = mock(StreamConnection.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${2bb3f3f2-19d9-3686-8409-b9ef5ffc97ff}, hash: 242808F1362ADA5ECC48E01C591A5C53
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
        //Act Statement(s)
        target.openConnection(socketAddressMock, streamConnectionMock);
        //Assert statement(s)
        verify(target).isRunning();
    }

    //Sapient generated method id: ${78ebb428-2cae-3916-9c06-f91746d86a49}, hash: 9A0CCC963B0B5413676BD0B1FB76707A
    @Ignore()
    @Test()
    public void openConnectionWhenIsRunning() throws IOException {
        /* Branches:
         * (!isRunning()) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type BlockingClient
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        SocketFactory socketFactory = SocketFactory.getDefault();
        BlockingClientManager target = spy(new BlockingClientManager(socketFactory));
        doReturn(true).when(target).isRunning();
        //Act Statement(s)
        ListenableCompletableFuture<SocketAddress> result = target.openConnection(socketAddressMock, streamConnectionMock);
        //Assert statement(s)
        //TODO: Please implement equals method in ListenableCompletableFuture for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
        verify(target).isRunning();
    }

    //Sapient generated method id: ${2848bd70-59ca-38e3-af92-ac1e0b5d6268}, hash: 0053BAB1ED12BC61B0B968F193E16F91
    @Ignore()
    @Test()
    public void openConnectionWhenCaughtIOExceptionThrowsRuntimeException() throws IOException {
        /* Branches:
         * (!isRunning()) : false
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type BlockingClient
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        SocketFactory socketFactory = SocketFactory.getDefault();
        BlockingClientManager target = spy(new BlockingClientManager(socketFactory));
        doReturn(true).when(target).isRunning();
        thrown.expect(RuntimeException.class);
        thrown.expectCause(is(instanceOf(IOException.class)));
        //Act Statement(s)
        target.openConnection(socketAddressMock, streamConnectionMock);
        //Assert statement(s)
        verify(target).isRunning();
    }

    //Sapient generated method id: ${8117fc59-e007-3a51-9f07-287c570ddca2}, hash: BB46D8E0D8760488BB600A9DB722236F
    @Test()
    public void setConnectTimeoutMillisTest() {
        //Arrange Statement(s)
        SocketFactory socketFactory = SocketFactory.getDefault();
        BlockingClientManager target = new BlockingClientManager(socketFactory);
        //Act Statement(s)
        target.setConnectTimeoutMillis(0);
    }

    //Sapient generated method id: ${2eae9292-3a4e-3aef-a658-61695265ca34}, hash: B65186257B1578627DCF17914B7926E6
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

    //Sapient generated method id: ${29f86e68-48e9-3bd0-a806-f49162deede6}, hash: FD58F0EE7D3C9E8566B2435B01DA9D0A
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

    //Sapient generated method id: ${7dcf31f4-d43b-3c66-8329-8b5ae2429a58}, hash: 3177DA16C830206BBD3A46928F5E157F
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

    //Sapient generated method id: ${586cd0cd-f9a3-335f-91d9-98362a4c8115}, hash: 6FE1373874A8769FB9A517604D6CF641
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
