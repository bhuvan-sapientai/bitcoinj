package org.bitcoinj.net;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;

import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;

import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

import org.junit.rules.ExpectedException;

public class NioServerSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final StreamConnection connectionMock = mock(StreamConnection.class);

    private final StreamConnectionFactory streamConnectionFactoryMock = mock(StreamConnectionFactory.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${93490dfc-5d5b-3fe4-98c5-9445bd5650be}
    @Ignore(value = "Potential harmful system call (Selector.select, ServerSocket.bind, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void runWhenSelectorKeysIsNotEmptyThrowsNullPointerException() throws Exception, IOException {
        /* Branches:
         * (isRunning()) : true
         * (keyIterator.hasNext()) : true
         * (key.isValid()) : true  #  inside handleKey method
         * (key.isAcceptable()) : true  #  inside handleKey method
         * (for-each(selector.keys())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        StreamConnectionFactory streamConnectionFactoryMock = mock(StreamConnectionFactory.class, "StreamConnectionFactory");
        InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
        NioServer target = spy(new NioServer(streamConnectionFactoryMock, inetSocketAddress));
        doReturn(true).when(target).isRunning();
        thrown.expect(NullPointerException.class);

        //Act Statement(s)
        target.run();

        //Assert statement(s)
        verify(target).isRunning();
    }

    //Sapient generated method id: ${52e4a6f0-2f0c-3161-9a57-889c274878ab}
    @Ignore(value = "Potential harmful system call (Selector.select, Selector.close, ServerSocket.bind, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void runWhenSelectorKeysIsNotEmpty() throws Exception {
        /* Branches:
         * (isRunning()) : true
         * (keyIterator.hasNext()) : true
         * (key.isValid()) : true  #  inside handleKey method
         * (key.isAcceptable()) : true  #  inside handleKey method
         * (for-each(selector.keys())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        StreamConnectionFactory streamConnectionFactoryMock = mock(StreamConnectionFactory.class, "<mock implementation>");
        try (MockedStatic<ConnectionHandler> connectionHandler = mockStatic(ConnectionHandler.class)) {
            connectionHandler.when(() -> ConnectionHandler.handleKey((SelectionKey) null)).thenAnswer((Answer<Void>) invocation -> null);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
            NioServer target = spy(new NioServer(streamConnectionFactoryMock, inetSocketAddress));
            doReturn(true).when(target).isRunning();
            //Act Statement(s)
            target.run();
            //Assert statement(s)
            connectionHandler.verify(() -> ConnectionHandler.handleKey((SelectionKey) null), atLeast(1));
            verify(target).isRunning();
        }
    }

    //Sapient generated method id: ${277db267-cabe-3e80-9268-6648cf3f2ae0}
    @Ignore(value = "Potential harmful system call (Selector.select, ServerSocket.bind, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void runWhenKeyNotIsAcceptableAndSelectorKeysIsNotEmptyThrowsNullPointerException() throws Exception, IOException {
        /* Branches:
         * (isRunning()) : true
         * (keyIterator.hasNext()) : true
         * (key.isValid()) : true  #  inside handleKey method
         * (key.isAcceptable()) : false  #  inside handleKey method
         * (for-each(selector.keys())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        StreamConnectionFactory streamConnectionFactoryMock = mock(StreamConnectionFactory.class, "<mock implementation>");
        try (MockedStatic<ConnectionHandler> connectionHandler = mockStatic(ConnectionHandler.class)) {
            connectionHandler.when(() -> ConnectionHandler.handleKey((SelectionKey) null)).thenAnswer((Answer<Void>) invocation -> null);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
            NioServer target = spy(new NioServer(streamConnectionFactoryMock, inetSocketAddress));
            doReturn(true, false).when(target).isRunning();
            thrown.expect(NullPointerException.class);
            //Act Statement(s)
            target.run();
            //Assert statement(s)
            connectionHandler.verify(() -> ConnectionHandler.handleKey((SelectionKey) null), atLeast(1));
            verify(target, times(2)).isRunning();
        }
    }

    //Sapient generated method id: ${32cdf3ab-948b-39ed-b94d-9132dcb65546}
    @Ignore(value = "Potential harmful system call (Selector.select, Selector.close, ServerSocket.bind, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void runWhenKeyNotIsAcceptableAndSelectorKeysIsNotEmpty() throws Exception {
        /* Branches:
         * (isRunning()) : true
         * (keyIterator.hasNext()) : true
         * (key.isValid()) : true  #  inside handleKey method
         * (key.isAcceptable()) : false  #  inside handleKey method
         * (for-each(selector.keys())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        StreamConnectionFactory streamConnectionFactoryMock = mock(StreamConnectionFactory.class, "MyConnectionFactory");
        try (MockedStatic<ConnectionHandler> connectionHandler = mockStatic(ConnectionHandler.class)) {
            connectionHandler.when(() -> ConnectionHandler.handleKey((SelectionKey) null)).thenAnswer((Answer<Void>) invocation -> null);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
            NioServer target = spy(new NioServer(streamConnectionFactoryMock, inetSocketAddress));
            doReturn(true, false).when(target).isRunning();
            //Act Statement(s)
            target.run();
            //Assert statement(s)
            connectionHandler.verify(() -> ConnectionHandler.handleKey((SelectionKey) null), atLeast(2));
            verify(target, times(2)).isRunning();
        }
    }

    //Sapient generated method id: ${7959ce11-b573-3651-9055-8c7028eb61bf}
    @Ignore(value = "Potential harmful system call (Selector.select, ServerSocket.bind, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void runWhenCaughtIOExceptionAndSelectorKeysIsNotEmptyThrowsNullPointerException() throws Exception, IOException {
        /* Branches:
         * (isRunning()) : true
         * (keyIterator.hasNext()) : true
         * (key.isValid()) : true  #  inside handleKey method
         * (key.isAcceptable()) : true  #  inside handleKey method
         * (catch-exception (IOException)) : true
         * (for-each(selector.keys())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        StreamConnectionFactory streamConnectionFactoryMock = mock(StreamConnectionFactory.class, "new StreamConnectionFactory()");
        InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
        NioServer target = spy(new NioServer(streamConnectionFactoryMock, inetSocketAddress));
        doReturn(true).when(target).isRunning();
        thrown.expect(NullPointerException.class);

        //Act Statement(s)
        target.run();

        //Assert statement(s)
        verify(target).isRunning();
    }

    //Sapient generated method id: ${5a9eefe1-12c7-3ce1-86c2-993e6a8ab08b}
    @Ignore(value = "Potential harmful system call (Selector.select, Selector.close, ServerSocket.bind, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void runWhenCaughtIOExceptionAndSelectorKeysIsNotEmpty() throws Exception {
        /* Branches:
         * (isRunning()) : true
         * (keyIterator.hasNext()) : true
         * (key.isValid()) : true  #  inside handleKey method
         * (key.isAcceptable()) : true  #  inside handleKey method
         * (catch-exception (IOException)) : true
         * (for-each(selector.keys())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConnectionHandler> connectionHandler = mockStatic(ConnectionHandler.class)) {
            connectionHandler.when(() -> ConnectionHandler.handleKey((SelectionKey) null)).thenAnswer((Answer<Void>) invocation -> null);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
            NioServer target = spy(new NioServer(streamConnectionFactoryMock, inetSocketAddress));
            doReturn(true).when(target).isRunning();
            //Act Statement(s)
            target.run();
            //Assert statement(s)
            connectionHandler.verify(() -> ConnectionHandler.handleKey((SelectionKey) null), atLeast(1));
            verify(target).isRunning();
        }
    }

    //Sapient generated method id: ${177a8204-688b-3d14-8f5d-3eebc792802f}
    @Ignore(value = "Potential harmful system call (Selector.select, ServerSocket.bind, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void runWhenCaughtIOExceptionThrowsNullPointerException() throws Exception, IOException {
        /* Branches:
         * (isRunning()) : true
         * (keyIterator.hasNext()) : true
         * (key.isValid()) : true  #  inside handleKey method
         * (key.isAcceptable()) : false  #  inside handleKey method
         * (for-each(selector.keys())) : true
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        StreamConnectionFactory streamConnectionFactoryMock = mock(StreamConnectionFactory.class, "StreamConnectionFactory");
        try (MockedStatic<ConnectionHandler> connectionHandler = mockStatic(ConnectionHandler.class)) {
            connectionHandler.when(() -> ConnectionHandler.handleKey((SelectionKey) null)).thenAnswer((Answer<Void>) invocation -> null);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
            NioServer target = spy(new NioServer(streamConnectionFactoryMock, inetSocketAddress));
            doReturn(true, false).when(target).isRunning();
            thrown.expect(NullPointerException.class);
            //Act Statement(s)
            target.run();
            //Assert statement(s)
            connectionHandler.verify(() -> ConnectionHandler.handleKey((SelectionKey) null), atLeast(1));
            verify(target, times(2)).isRunning();
        }
    }

    //Sapient generated method id: ${99c7a02b-c4b1-3825-ae95-1d0be326e2fb}
    @Ignore(value = "Potential harmful system call (Selector.select, Selector.close, ServerSocket.bind, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void runWhenSelectorKeysIsNotEmptyAndCaughtIOException() throws Exception {
        /* Branches:
         * (isRunning()) : true
         * (keyIterator.hasNext()) : true
         * (key.isValid()) : true  #  inside handleKey method
         * (key.isAcceptable()) : false  #  inside handleKey method
         * (for-each(selector.keys())) : true
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConnectionHandler> connectionHandler = mockStatic(ConnectionHandler.class)) {
            connectionHandler.when(() -> ConnectionHandler.handleKey((SelectionKey) null)).thenAnswer((Answer<Void>) invocation -> null);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
            NioServer target = spy(new NioServer(streamConnectionFactoryMock, inetSocketAddress));
            doReturn(true, false).when(target).isRunning();
            //Act Statement(s)
            target.run();
            //Assert statement(s)
            connectionHandler.verify(() -> ConnectionHandler.handleKey((SelectionKey) null), atLeast(2));
            verify(target, times(2)).isRunning();
        }
    }

    //Sapient generated method id: ${6a35777e-8b72-3d58-bcb9-07f045187e30}
    @Ignore(value = "Potential harmful system call (Selector.select, Selector.close, ServerSocket.bind, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void runWhenKeyNotIsAcceptableAndSelectorKeysIsNotEmptyAndCaughtIOException() throws Exception {
        /* Branches:
         * (isRunning()) : true
         * (keyIterator.hasNext()) : true
         * (key.isValid()) : true  #  inside handleKey method
         * (key.isAcceptable()) : false  #  inside handleKey method
         * (for-each(selector.keys())) : true
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        StreamConnectionFactory streamConnectionFactoryMock = mock(StreamConnectionFactory.class, "<StreamConnectionFactory object>");
        try (MockedStatic<ConnectionHandler> connectionHandler = mockStatic(ConnectionHandler.class)) {
            connectionHandler.when(() -> ConnectionHandler.handleKey((SelectionKey) null)).thenAnswer((Answer<Void>) invocation -> null);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
            NioServer target = spy(new NioServer(streamConnectionFactoryMock, inetSocketAddress));
            doReturn(true, false).when(target).isRunning();
            //Act Statement(s)
            target.run();
            //Assert statement(s)
            connectionHandler.verify(() -> ConnectionHandler.handleKey((SelectionKey) null), atLeast(2));
            verify(target, times(2)).isRunning();
        }
    }

    //Sapient generated method id: ${e96b8374-5015-3326-ac4f-491969e4b4de}
    @Ignore(value = "Potential harmful system call (Selector.select, Selector.close, ServerSocket.bind, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void runWhenKeyIsValidAndKeyNotIsAcceptableAndSelectorKeysIsNotEmptyAndCaughtIOException() throws Exception {
        /* Branches:
         * (isRunning()) : true
         * (keyIterator.hasNext()) : true
         * (key.isValid()) : true  #  inside handleKey method
         * (key.isAcceptable()) : false  #  inside handleKey method
         * (for-each(selector.keys())) : true
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        StreamConnectionFactory streamConnectionFactoryMock = mock(StreamConnectionFactory.class, "<value>");
        try (MockedStatic<ConnectionHandler> connectionHandler = mockStatic(ConnectionHandler.class)) {
            connectionHandler.when(() -> ConnectionHandler.handleKey((SelectionKey) null)).thenAnswer((Answer<Void>) invocation -> null);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
            NioServer target = spy(new NioServer(streamConnectionFactoryMock, inetSocketAddress));
            doReturn(true, false).when(target).isRunning();
            //Act Statement(s)
            target.run();
            //Assert statement(s)
            connectionHandler.verify(() -> ConnectionHandler.handleKey((SelectionKey) null), atLeast(2));
            verify(target, times(2)).isRunning();
        }
    }

    //Sapient generated method id: ${e7b9376e-d1e9-3940-a95e-bfcebffd5d24}
    @Ignore(value = "Potential harmful system call (Selector.select, Selector.close, ServerSocket.bind, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void runWhenKeyNotIsAcceptableAndSelectorKeysIsEmptyAndCaughtIOException() throws Exception {
        /* Branches:
         * (isRunning()) : true
         * (keyIterator.hasNext()) : true
         * (key.isValid()) : true  #  inside handleKey method
         * (key.isAcceptable()) : false  #  inside handleKey method
         * (for-each(selector.keys())) : false
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConnectionHandler> connectionHandler = mockStatic(ConnectionHandler.class)) {
            connectionHandler.when(() -> ConnectionHandler.handleKey((SelectionKey) null)).thenAnswer((Answer<Void>) invocation -> null);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
            NioServer target = spy(new NioServer(streamConnectionFactoryMock, inetSocketAddress));
            doReturn(true, false).when(target).isRunning();
            //Act Statement(s)
            target.run();
            //Assert statement(s)
            connectionHandler.verify(() -> ConnectionHandler.handleKey((SelectionKey) null), atLeast(1));
            verify(target, times(2)).isRunning();
        }
    }

    //Sapient generated method id: ${376de6a2-dae5-3ae3-9e8a-5e4c15c5397f}
    @Ignore(value = "Potential harmful system call (Selector.select, Selector.close, ServerSocket.bind, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void runWhenKeyIsValidAndKeyNotIsAcceptableAndSelectorKeysIsEmptyAndCaughtIOException() throws Exception {
        /* Branches:
         * (isRunning()) : true
         * (keyIterator.hasNext()) : true
         * (key.isValid()) : true  #  inside handleKey method
         * (key.isAcceptable()) : false  #  inside handleKey method
         * (for-each(selector.keys())) : false
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConnectionHandler> connectionHandler = mockStatic(ConnectionHandler.class)) {
            connectionHandler.when(() -> ConnectionHandler.handleKey((SelectionKey) null)).thenAnswer((Answer<Void>) invocation -> null);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
            NioServer target = spy(new NioServer(streamConnectionFactoryMock, inetSocketAddress));
            doReturn(true, false).when(target).isRunning();
            //Act Statement(s)
            target.run();
            //Assert statement(s)
            connectionHandler.verify(() -> ConnectionHandler.handleKey((SelectionKey) null), atLeast(1));
            verify(target, times(2)).isRunning();
        }
    }

    //Sapient generated method id: ${7a307582-0afc-32c3-b90e-9359915018eb}
    @Ignore(value = "Potential harmful system call (Selector.select, Selector.close, ServerSocket.bind, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void runWhenKeyIteratorHasNextAndKeyIsValidAndKeyNotIsAcceptableAndSelectorKeysIsEmptyAndCaughtIOException() throws Exception {
        /* Branches:
         * (isRunning()) : true
         * (keyIterator.hasNext()) : true
         * (key.isValid()) : true  #  inside handleKey method
         * (key.isAcceptable()) : false  #  inside handleKey method
         * (for-each(selector.keys())) : false
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConnectionHandler> connectionHandler = mockStatic(ConnectionHandler.class)) {
            connectionHandler.when(() -> ConnectionHandler.handleKey((SelectionKey) null)).thenAnswer((Answer<Void>) invocation -> null);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
            NioServer target = spy(new NioServer(streamConnectionFactoryMock, inetSocketAddress));
            doReturn(true, false).when(target).isRunning();
            //Act Statement(s)
            target.run();
            //Assert statement(s)
            connectionHandler.verify(() -> ConnectionHandler.handleKey((SelectionKey) null), atLeast(1));
            verify(target, times(2)).isRunning();
        }
    }

    //Sapient generated method id: ${f1f6783d-62f1-37cc-adb3-69889cbd30d0}
    @Ignore(value = "Potential harmful system call (ServerSocket.bind, Selector.wakeup) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void triggerShutdownTest() throws IOException {
        //Arrange Statement(s)
        InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
        NioServer target = new NioServer(streamConnectionFactoryMock, inetSocketAddress);

        //Act Statement(s)
        target.triggerShutdown();
    }
}
