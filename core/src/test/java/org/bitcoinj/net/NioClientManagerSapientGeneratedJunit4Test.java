package org.bitcoinj.net;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.stubbing.Answer;

import java.util.concurrent.Executor;
import java.nio.channels.SocketChannel;
import java.net.SocketAddress;

import org.bitcoinj.utils.ListenableCompletableFuture;

import java.nio.channels.SelectionKey;
import java.util.NoSuchElementException;

import org.mockito.MockedStatic;

import java.util.concurrent.CompletableFuture;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;

public class NioClientManagerSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final StreamConnection streamConnectionMock = mock(StreamConnection.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${74b04750-80f4-3db9-ae1e-53f5953be4b0}
    @Ignore(value = "Potential harmful system call (Selector.select, Selector.close, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void runWhenKeyNotIsConnectableAndSelectorKeysIsEmpty() throws Exception {
        /* Branches:
         * (isRunning()) : true
         * ((conn = newConnectionChannels.poll()) != null) : false
         * (keyIterator.hasNext()) : true
         * (key.isValid()) : true  #  inside handleKey method
         * (key.isConnectable()) : false  #  inside handleKey method
         * (for-each(selector.keys())) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConnectionHandler> connectionHandler = mockStatic(ConnectionHandler.class)) {
            connectionHandler.when(() -> ConnectionHandler.handleKey((SelectionKey) null)).thenAnswer((Answer<Void>) invocation -> null);
            NioClientManager target = spy(new NioClientManager());
            doReturn(true, false).when(target).isRunning();
            //Act Statement(s)
            target.run();
            //Assert statement(s)
            connectionHandler.verify(() -> ConnectionHandler.handleKey((SelectionKey) null), atLeast(1));
            verify(target, times(2)).isRunning();
        }
    }

    //Sapient generated method id: ${8f655aa5-ff3b-3366-ad66-38bb73867466}
    @Ignore(value = "Potential harmful system call (Selector.select, CompletableFuture.completeExceptionally, Selector.close, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void runWhenScNotFinishConnectAndSelectorKeysIsEmpty() throws Exception {
        /* Branches:
         * (isRunning()) : true
         * ((conn = newConnectionChannels.poll()) != null) : false
         * (keyIterator.hasNext()) : true
         * (key.isValid()) : true  #  inside handleKey method
         * (key.isConnectable()) : true  #  inside handleKey method
         * (sc.finishConnect()) : false  #  inside handleKey method
         * (for-each(selector.keys())) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NioClientManager target = spy(new NioClientManager());
        doReturn(true, false).when(target).isRunning();

        //Act Statement(s)
        target.run();

        //Assert statement(s)
        verify(target, times(2)).isRunning();
    }

    //Sapient generated method id: ${7d7f567a-d796-380f-a7e8-a3c075963831}
    @Ignore(value = "Potential harmful system call (Selector.select, CompletableFuture.completeExceptionally, Selector.close, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void runWhenScFinishConnectAndSelectorKeysIsNotEmptyAndKeyAttachmentInstanceOfConnectionHandler() throws Exception {
        /* Branches:
         * (isRunning()) : true
         * ((conn = newConnectionChannels.poll()) != null) : false
         * (keyIterator.hasNext()) : true
         * (key.isValid()) : true  #  inside handleKey method
         * (key.isConnectable()) : true  #  inside handleKey method
         * (sc.finishConnect()) : true  #  inside handleKey method
         * (for-each(selector.keys())) : true
         * (key.attachment() instanceof ConnectionHandler) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConnectionHandler> connectionHandler = mockStatic(ConnectionHandler.class)) {
            connectionHandler.when(() -> ConnectionHandler.handleKey((SelectionKey) null)).thenAnswer((Answer<Void>) invocation -> null);
            NioClientManager target = spy(new NioClientManager());
            doReturn(true, false).when(target).isRunning();
            //Act Statement(s)
            target.run();
            //Assert statement(s)
            connectionHandler.verify(() -> ConnectionHandler.handleKey((SelectionKey) null), atLeast(1));
            verify(target, times(2)).isRunning();
        }
    }

    //Sapient generated method id: ${eb566ab1-87e8-371f-9e6f-3e9260b95322}
    @Ignore(value = "Potential harmful system call (Selector.select, CompletableFuture.completeExceptionally, Selector.close, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void runWhenCaughtExceptionAndSelectorKeysIsNotEmptyAndKeyAttachmentInstanceOfConnectionHandler() throws Exception {
        /* Branches:
         * (isRunning()) : true
         * ((conn = newConnectionChannels.poll()) != null) : false
         * (keyIterator.hasNext()) : true
         * (key.isValid()) : true  #  inside handleKey method
         * (key.isConnectable()) : true  #  inside handleKey method
         * (sc.finishConnect()) : true  #  inside handleKey method
         * (catch-exception (Exception)) : true
         * (for-each(selector.keys())) : true
         * (key.attachment() instanceof ConnectionHandler) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConnectionHandler> connectionHandler = mockStatic(ConnectionHandler.class)) {
            connectionHandler.when(() -> ConnectionHandler.handleKey((SelectionKey) null)).thenAnswer((Answer<Void>) invocation -> null);
            NioClientManager target = spy(new NioClientManager());
            doReturn(true, false).when(target).isRunning();
            //Act Statement(s)
            target.run();
            //Assert statement(s)
            connectionHandler.verify(() -> ConnectionHandler.handleKey((SelectionKey) null), atLeast(1));
            verify(target, times(2)).isRunning();
        }
    }

    //Sapient generated method id: ${85955f9f-267e-3a90-a7aa-7d747ff39e80}
    @Ignore(value = "Potential harmful system call (Selector.select, CompletableFuture.completeExceptionally, Selector.close, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void runWhenCaughtIOExceptionAndKeyAttachmentInstanceOfConnectionHandler() throws Exception {
        /* Branches:
         * (isRunning()) : true
         * ((conn = newConnectionChannels.poll()) != null) : false
         * (keyIterator.hasNext()) : true
         * (key.isValid()) : true  #  inside handleKey method
         * (key.isConnectable()) : true  #  inside handleKey method
         * (sc.finishConnect()) : true  #  inside handleKey method
         * (for-each(selector.keys())) : true
         * (catch-exception (IOException)) : true
         * (key.attachment() instanceof ConnectionHandler) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConnectionHandler> connectionHandler = mockStatic(ConnectionHandler.class)) {
            connectionHandler.when(() -> ConnectionHandler.handleKey((SelectionKey) null)).thenAnswer((Answer<Void>) invocation -> null);
            NioClientManager target = spy(new NioClientManager());
            doReturn(true, false).when(target).isRunning();
            //Act Statement(s)
            target.run();
            //Assert statement(s)
            connectionHandler.verify(() -> ConnectionHandler.handleKey((SelectionKey) null), atLeast(1));
            verify(target, times(2)).isRunning();
        }
    }

    //Sapient generated method id: ${8d97eb41-839b-3969-beb7-90027fd744ff}
    @Ignore(value = "Potential harmful system call (Selector.select, CompletableFuture.completeExceptionally, Selector.close, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void runWhenKeyAttachmentInstanceOfConnectionHandlerAndCaughtIOException() throws Exception {
        /* Branches:
         * (isRunning()) : true
         * ((conn = newConnectionChannels.poll()) != null) : false
         * (keyIterator.hasNext()) : true
         * (key.isValid()) : true  #  inside handleKey method
         * (key.isConnectable()) : true  #  inside handleKey method
         * (sc.finishConnect()) : true  #  inside handleKey method
         * (for-each(selector.keys())) : true
         * (key.attachment() instanceof ConnectionHandler) : true
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConnectionHandler> connectionHandler = mockStatic(ConnectionHandler.class)) {
            connectionHandler.when(() -> ConnectionHandler.handleKey((SelectionKey) null)).thenAnswer((Answer<Void>) invocation -> null);
            NioClientManager target = spy(new NioClientManager());
            doReturn(true, false).when(target).isRunning();
            //Act Statement(s)
            target.run();
            //Assert statement(s)
            connectionHandler.verify(() -> ConnectionHandler.handleKey((SelectionKey) null), atLeast(1));
            verify(target, times(2)).isRunning();
        }
    }

    //Sapient generated method id: ${2bb3f3f2-19d9-3686-8409-b9ef5ffc97ff}
    @Test()
    public void openConnectionWhenIsRunningNotThrowsIllegalStateException() {
        /* Branches:
         * (!isRunning()) : true
         */
        //Arrange Statement(s)
        NioClientManager target = spy(new NioClientManager());
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
    @Ignore(value = "Potential harmful system call (Selector.wakeup) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void openConnectionWhenIsRunning() throws Throwable {
        /* Branches:
         * (!isRunning()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ListenableCompletableFuture<SocketAddress> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        try (MockedStatic<ListenableCompletableFuture> listenableCompletableFuture = mockStatic(ListenableCompletableFuture.class)) {
            listenableCompletableFuture.when(() -> ListenableCompletableFuture.of((CompletableFuture) null)).thenReturn(listenableCompletableFutureMock);
            NioClientManager target = spy(new NioClientManager());
            doReturn(true).when(target).isRunning();
            //TODO: Needs initialization with real value
            SocketAddress socketAddress = null;
            //Act Statement(s)
            ListenableCompletableFuture<SocketAddress> result = target.openConnection(socketAddress, streamConnectionMock);
            //Assert statement(s)
            assertThat(result, equalTo(listenableCompletableFutureMock));
            listenableCompletableFuture.verify(() -> ListenableCompletableFuture.of((CompletableFuture) null), atLeast(1));
            verify(target).isRunning();
        }
    }

    //Sapient generated method id: ${c684a778-f95f-3a32-974c-99dde163048d}
    @Ignore(value = "Potential harmful system call (Selector.wakeup) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void openConnectionWhenCaughtThrowable() throws Throwable {
        /* Branches:
         * (!isRunning()) : false
         * (catch-exception (Throwable)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ListenableCompletableFuture> listenableCompletableFuture = mockStatic(ListenableCompletableFuture.class);
             MockedStatic<SocketChannel> socketChannel = mockStatic(SocketChannel.class)) {
            SocketChannel socketChannel2 = SocketChannel.open();
            socketChannel.when(() -> SocketChannel.open()).thenReturn(socketChannel2);
            ListenableCompletableFuture listenableCompletableFuture2 = new ListenableCompletableFuture();
            listenableCompletableFuture.when(() -> ListenableCompletableFuture.of((CompletableFuture) null)).thenReturn(listenableCompletableFuture2);
            ListenableCompletableFuture<SocketAddress> listenableCompletableFuture3 = new ListenableCompletableFuture<>();
            Throwable throwable = new Throwable();
            listenableCompletableFuture.when(() -> ListenableCompletableFuture.failedFuture(throwable)).thenReturn(listenableCompletableFuture3);
            NioClientManager target = spy(new NioClientManager());
            doReturn(true).when(target).isRunning();
            //TODO: Needs initialization with real value
            SocketAddress socketAddress = null;
            //Act Statement(s)
            ListenableCompletableFuture<SocketAddress> result = target.openConnection(socketAddress, streamConnectionMock);
            //Assert statement(s)
            assertThat(result, equalTo(listenableCompletableFuture3));
            socketChannel.verify(() -> SocketChannel.open(), atLeast(1));
            listenableCompletableFuture.verify(() -> ListenableCompletableFuture.of((CompletableFuture) null), atLeast(1));
            listenableCompletableFuture.verify(() -> ListenableCompletableFuture.failedFuture(throwable), atLeast(1));
            verify(target).isRunning();
        }
    }

    //Sapient generated method id: ${f1f6783d-62f1-37cc-adb3-69889cbd30d0}
    @Ignore(value = "Potential harmful system call (Selector.wakeup) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void triggerShutdownTest() {
        //Arrange Statement(s)
        NioClientManager target = new NioClientManager();

        //Act Statement(s)
        target.triggerShutdown();
    }

    //Sapient generated method id: ${29f86e68-48e9-3bd0-a806-f49162deede6}
    @Test()
    public void getConnectedClientCountTest() {
        //Arrange Statement(s)
        NioClientManager target = new NioClientManager();

        //Act Statement(s)
        int result = target.getConnectedClientCount();

        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${de9c01ce-9f05-3bca-b3e8-176152935f28}
    @Test()
    public void closeConnectionsWhenNGreaterThan0ThrowsNoSuchElementException() {
        /* Branches:
         * (n-- > 0) : true
         */
        //Arrange Statement(s)
        NioClientManager target = new NioClientManager();
        thrown.expect(NoSuchElementException.class);

        //Act Statement(s)
        target.closeConnections(2147483647);
    }

    //Sapient generated method id: ${f5239ed7-b6e3-377d-9879-72fa939cb54b}
    @Test()
    public void closeConnectionsWhenNNotGreaterThan0() {
        /* Branches:
         * (n-- > 0) : false
         */
        //Arrange Statement(s)
        NioClientManager target = new NioClientManager();

        //Act Statement(s)
        target.closeConnections(-1);
    }

    //Sapient generated method id: ${cabdabc2-124d-3e29-91c2-485d4aa1de76}
    @Test()
    public void executorTest() {
        //Arrange Statement(s)
        NioClientManager target = new NioClientManager();

        //Act Statement(s)
        Executor result = target.executor();

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }
}
