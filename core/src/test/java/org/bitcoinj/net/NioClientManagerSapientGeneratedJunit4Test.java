package org.bitcoinj.net;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.stubbing.Answer;

import java.util.concurrent.Executor;
import java.nio.channels.SelectableChannel;
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

    private final SelectionKey selectionKeyMock = mock(SelectionKey.class);

    private final SelectionKey selectionKeyMock2 = mock(SelectionKey.class);

    private final SocketAddress socketAddressMock = mock(SocketAddress.class);

    private final StreamConnection streamConnectionMock = mock(StreamConnection.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${8f655aa5-ff3b-3366-ad66-38bb73867466}, hash: 2F31783C5682C74A5483D81F5604D778
    @Ignore(value = "Potential harmful system call (Selector.select, Selector.close, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
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
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Selector.select, Selector.close, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NioClientManager target = spy(new NioClientManager());
        doReturn(true).when(target).isRunning();

        //Act Statement(s)
        target.run();

        //Assert statement(s)
        verify(target).isRunning();
    }

    //Sapient generated method id: ${8d305d8f-5d55-3db3-99ce-61ed74ec68fd}, hash: 3E07A520B9E38CB0190A7A228AE8B162
    @Ignore(value = "Potential harmful system call (Selector.select, Selector.close, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void runWhenKeyNotIsConnectableAndSelectorKeysIsNotEmptyAndKeyAttachmentInstanceOfConnectionHandler() throws Exception {
        /* Branches:
         * (isRunning()) : true
         * ((conn = newConnectionChannels.poll()) != null) : false
         * (keyIterator.hasNext()) : true
         * (key.isValid()) : true  #  inside handleKey method
         * (key.isConnectable()) : false  #  inside handleKey method
         * (for-each(selector.keys())) : true
         * (key.attachment() instanceof ConnectionHandler) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Selector.select, Selector.close, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConnectionHandler> connectionHandler = mockStatic(ConnectionHandler.class)) {
            connectionHandler.when(() -> ConnectionHandler.handleKey(selectionKeyMock)).thenAnswer((Answer<Void>) invocation -> null);
            connectionHandler.when(() -> ConnectionHandler.handleKey(selectionKeyMock2)).thenAnswer((Answer<Void>) invocation -> null);
            NioClientManager target = spy(new NioClientManager());
            doReturn(true, false).when(target).isRunning();
            //Act Statement(s)
            target.run();
            //Assert statement(s)
            connectionHandler.verify(() -> ConnectionHandler.handleKey(selectionKeyMock), atLeast(1));
            connectionHandler.verify(() -> ConnectionHandler.handleKey(selectionKeyMock2), atLeast(1));
            verify(target, times(2)).isRunning();
        }
    }

    //Sapient generated method id: ${7d7f567a-d796-380f-a7e8-a3c075963831}, hash: A6B67ED9EE66DD29D81B4B6750F7D8D9
    @Ignore(value = "Potential harmful system call (Selector.select, Selector.close, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
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
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Selector.select, Selector.close, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConnectionHandler> connectionHandler = mockStatic(ConnectionHandler.class)) {
            connectionHandler.when(() -> ConnectionHandler.handleKey(selectionKeyMock)).thenAnswer((Answer<Void>) invocation -> null);
            NioClientManager target = spy(new NioClientManager());
            doReturn(true).when(target).isRunning();
            //Act Statement(s)
            target.run();
            //Assert statement(s)
            connectionHandler.verify(() -> ConnectionHandler.handleKey(selectionKeyMock), atLeast(1));
            verify(target).isRunning();
        }
    }

    //Sapient generated method id: ${85955f9f-267e-3a90-a7aa-7d747ff39e80}, hash: F18ED51C9E6AD0A424127B8BB46C4247
    @Ignore(value = "Potential harmful system call (Selector.select, Selector.close, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void runWhenCaughtIOExceptionAndKeyAttachmentInstanceOfConnectionHandler() throws Exception {
        /* Branches:
         * (isRunning()) : true
         * ((conn = newConnectionChannels.poll()) != null) : false
         * (keyIterator.hasNext()) : true
         * (key.isValid()) : true  #  inside handleKey method
         * (key.isConnectable()) : false  #  inside handleKey method
         * (for-each(selector.keys())) : true
         * (catch-exception (IOException)) : true
         * (key.attachment() instanceof ConnectionHandler) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Selector.select, Selector.close, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConnectionHandler> connectionHandler = mockStatic(ConnectionHandler.class)) {
            connectionHandler.when(() -> ConnectionHandler.handleKey(selectionKeyMock)).thenAnswer((Answer<Void>) invocation -> null);
            connectionHandler.when(() -> ConnectionHandler.handleKey(selectionKeyMock2)).thenAnswer((Answer<Void>) invocation -> null);
            NioClientManager target = spy(new NioClientManager());
            doReturn(true, false).when(target).isRunning();
            //Act Statement(s)
            target.run();
            //Assert statement(s)
            connectionHandler.verify(() -> ConnectionHandler.handleKey(selectionKeyMock), atLeast(1));
            connectionHandler.verify(() -> ConnectionHandler.handleKey(selectionKeyMock2), atLeast(1));
            verify(target, times(2)).isRunning();
        }
    }

    //Sapient generated method id: ${8d97eb41-839b-3969-beb7-90027fd744ff}, hash: F76A80F1F4CCBFA0E67D9EC9E51C16D6
    @Ignore(value = "Potential harmful system call (Selector.select, Selector.close, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void runWhenKeyAttachmentInstanceOfConnectionHandlerAndCaughtIOException() throws Exception {
        /* Branches:
         * (isRunning()) : true
         * ((conn = newConnectionChannels.poll()) != null) : false
         * (keyIterator.hasNext()) : true
         * (key.isValid()) : true  #  inside handleKey method
         * (key.isConnectable()) : false  #  inside handleKey method
         * (for-each(selector.keys())) : true
         * (key.attachment() instanceof ConnectionHandler) : true
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Selector.select, Selector.close, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConnectionHandler> connectionHandler = mockStatic(ConnectionHandler.class)) {
            connectionHandler.when(() -> ConnectionHandler.handleKey(selectionKeyMock)).thenAnswer((Answer<Void>) invocation -> null);
            connectionHandler.when(() -> ConnectionHandler.handleKey(selectionKeyMock2)).thenAnswer((Answer<Void>) invocation -> null);
            NioClientManager target = spy(new NioClientManager());
            doReturn(true, false).when(target).isRunning();
            //Act Statement(s)
            target.run();
            //Assert statement(s)
            connectionHandler.verify(() -> ConnectionHandler.handleKey(selectionKeyMock), atLeast(1));
            connectionHandler.verify(() -> ConnectionHandler.handleKey(selectionKeyMock2), atLeast(1));
            verify(target, times(2)).isRunning();
        }
    }

    //Sapient generated method id: ${f7720bd6-817c-328f-b9c6-87a55b404012}, hash: 4198E3014A3EBE610DAC27429E71654A
    @Ignore(value = "Potential harmful system call (Selector.select, Selector.close, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void runWhenKeyIsConnectableAndScFinishConnectAndSelectorKeysIsNotEmptyAndKeyAttachmentInstanceOfConnectionHandler() throws Exception {
        /* Branches:
         * (isRunning()) : true
         * ((conn = newConnectionChannels.poll()) != null) : false
         * (catch-exception (ClosedChannelException)) : true
         * (keyIterator.hasNext()) : true
         * (key.isValid()) : true  #  inside handleKey method
         * (key.isConnectable()) : true  #  inside handleKey method
         * (sc.finishConnect()) : true  #  inside handleKey method
         * (for-each(selector.keys())) : true
         * (key.attachment() instanceof ConnectionHandler) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Selector.select, Selector.close, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConnectionHandler> connectionHandler = mockStatic(ConnectionHandler.class)) {
            connectionHandler.when(() -> ConnectionHandler.handleKey(selectionKeyMock)).thenAnswer((Answer<Void>) invocation -> null);
            NioClientManager target = spy(new NioClientManager());
            doReturn(true).when(target).isRunning();
            //Act Statement(s)
            target.run();
            //Assert statement(s)
            connectionHandler.verify(() -> ConnectionHandler.handleKey(selectionKeyMock), atLeast(1));
            verify(target).isRunning();
        }
    }

    //Sapient generated method id: ${2bb3f3f2-19d9-3686-8409-b9ef5ffc97ff}, hash: 12F8ADA04F22E5D9D7611441EF953072
    @Test()
    public void openConnectionWhenIsRunningNotThrowsIllegalStateException() {
        /* Branches:
         * (!isRunning()) : true
         */
        //Arrange Statement(s)
        NioClientManager target = spy(new NioClientManager());
        doReturn(false).when(target).isRunning();
        thrown.expect(IllegalStateException.class);

        //Act Statement(s)
        target.openConnection(socketAddressMock, streamConnectionMock);

        //Assert statement(s)
        verify(target).isRunning();
    }

    //Sapient generated method id: ${78ebb428-2cae-3916-9c06-f91746d86a49}, hash: 9F324A4DA25E52584F96DFB6DEFF73EE
    @Ignore(value = "Potential harmful system call (Selector.wakeup) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void openConnectionWhenIsRunning() throws Throwable {
        /* Branches:
         * (!isRunning()) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: sc
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ListenableCompletableFuture<SocketAddress> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        try (MockedStatic<ListenableCompletableFuture> listenableCompletableFuture = mockStatic(ListenableCompletableFuture.class)) {
            listenableCompletableFuture.when(() -> ListenableCompletableFuture.of((CompletableFuture) null)).thenReturn(listenableCompletableFutureMock);
            NioClientManager target = spy(new NioClientManager());
            doReturn(true).when(target).isRunning();
            //Act Statement(s)
            ListenableCompletableFuture<SocketAddress> result = target.openConnection(socketAddressMock, streamConnectionMock);
            //Assert statement(s)
            assertThat(result, equalTo(listenableCompletableFutureMock));
            listenableCompletableFuture.verify(() -> ListenableCompletableFuture.of((CompletableFuture) null), atLeast(1));
            verify(target).isRunning();
        }
    }

    //Sapient generated method id: ${c684a778-f95f-3a32-974c-99dde163048d}, hash: E4CF0BCEBE710394315F091C41FA764F
    @Ignore(value = "Potential harmful system call (Selector.wakeup) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void openConnectionWhenCaughtThrowable() throws Throwable {
        /* Branches:
         * (!isRunning()) : false
         * (catch-exception (Throwable)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Selector.wakeup) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        SocketChannel socketChannelMock = mock(SocketChannel.class);
        ListenableCompletableFuture listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        ListenableCompletableFuture<SocketAddress> listenableCompletableFutureMock2 = mock(ListenableCompletableFuture.class);
        try (MockedStatic<ListenableCompletableFuture> listenableCompletableFuture = mockStatic(ListenableCompletableFuture.class);
             MockedStatic<SocketChannel> socketChannel = mockStatic(SocketChannel.class)) {
            socketChannel.when(() -> SocketChannel.open()).thenReturn(socketChannelMock);
            SelectableChannel selectableChannel = socketChannelMock.configureBlocking(false);
            doReturn(selectableChannel).when(socketChannelMock).configureBlocking(false);
            doReturn(false).when(socketChannelMock).connect(socketAddressMock);
            listenableCompletableFuture.when(() -> ListenableCompletableFuture.of((CompletableFuture) null)).thenReturn(listenableCompletableFutureMock);
            Throwable throwable = new Throwable();
            listenableCompletableFuture.when(() -> ListenableCompletableFuture.failedFuture(throwable)).thenReturn(listenableCompletableFutureMock2);
            NioClientManager target = spy(new NioClientManager());
            doReturn(true).when(target).isRunning();
            //Act Statement(s)
            ListenableCompletableFuture<SocketAddress> result = target.openConnection(socketAddressMock, streamConnectionMock);
            //Assert statement(s)
            assertThat(result, equalTo(listenableCompletableFutureMock2));
            socketChannel.verify(() -> SocketChannel.open(), atLeast(1));
            verify(socketChannelMock).configureBlocking(false);
            verify(socketChannelMock).connect(socketAddressMock);
            listenableCompletableFuture.verify(() -> ListenableCompletableFuture.of((CompletableFuture) null), atLeast(1));
            listenableCompletableFuture.verify(() -> ListenableCompletableFuture.failedFuture(throwable), atLeast(1));
            verify(target).isRunning();
        }
    }

    //Sapient generated method id: ${f1f6783d-62f1-37cc-adb3-69889cbd30d0}, hash: 6B431297E250EDBE8CCD673C663881C5
    @Ignore(value = "Potential harmful system call (Selector.wakeup) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void triggerShutdownTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Selector.wakeup) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NioClientManager target = new NioClientManager();

        //Act Statement(s)
        target.triggerShutdown();
    }

    //Sapient generated method id: ${29f86e68-48e9-3bd0-a806-f49162deede6}, hash: 86FF83828B2057E2CA7486E380AB5F0E
    @Test()
    public void getConnectedClientCountTest() {
        //Arrange Statement(s)
        NioClientManager target = new NioClientManager();

        //Act Statement(s)
        int result = target.getConnectedClientCount();

        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${de9c01ce-9f05-3bca-b3e8-176152935f28}, hash: 0C718D7D87B2F70438674530CE60E3A6
    @Test()
    public void closeConnectionsWhenNGreaterThan0ThrowsNoSuchElementException() {
        /* Branches:
         * (n-- > 0) : true
         */
        //Arrange Statement(s)
        NioClientManager target = new NioClientManager();
        thrown.expect(NoSuchElementException.class);

        //Act Statement(s)
        target.closeConnections(1);
    }

    //Sapient generated method id: ${f5239ed7-b6e3-377d-9879-72fa939cb54b}, hash: 2BCB52578F6703F0A3A3FAC5237242C0
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

    //Sapient generated method id: ${cabdabc2-124d-3e29-91c2-485d4aa1de76}, hash: 39C2F111AAA0654E00A337A4610CD735
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
