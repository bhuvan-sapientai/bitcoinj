package org.bitcoinj.net;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;

import org.junit.rules.ExpectedException;
import org.mockito.stubbing.Answer;

import java.nio.channels.SelectionKey;

import org.mockito.MockedStatic;

import java.net.InetSocketAddress;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

public class NioServerSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final SelectionKey selectionKeyMock = mock(SelectionKey.class);

    private final SelectionKey selectionKeyMock2 = mock(SelectionKey.class);

    private final StreamConnectionFactory streamConnectionFactoryMock = mock(StreamConnectionFactory.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${93490dfc-5d5b-3fe4-98c5-9445bd5650be}, hash: 9FC0B198202BE0902733C48E652EB175
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
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Selector.select, ServerSocket.bind, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
        NioServer target = spy(new NioServer(streamConnectionFactoryMock, inetSocketAddress));
        doReturn(true).when(target).isRunning();
        thrown.expect(NullPointerException.class);

        //Act Statement(s)
        target.run();

        //Assert statement(s)
        verify(target).isRunning();
    }

    //Sapient generated method id: ${52e4a6f0-2f0c-3161-9a57-889c274878ab}, hash: E76CC5825DF3D5095AAE958CDA49D8A5
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
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Selector.select, Selector.close, ServerSocket.bind, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConnectionHandler> connectionHandler = mockStatic(ConnectionHandler.class)) {
            connectionHandler.when(() -> ConnectionHandler.handleKey(selectionKeyMock)).thenAnswer((Answer<Void>) invocation -> null);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
            NioServer target = spy(new NioServer(streamConnectionFactoryMock, inetSocketAddress));
            doReturn(true).when(target).isRunning();
            //Act Statement(s)
            target.run();
            //Assert statement(s)
            connectionHandler.verify(() -> ConnectionHandler.handleKey(selectionKeyMock), atLeast(1));
            verify(target).isRunning();
        }
    }

    //Sapient generated method id: ${277db267-cabe-3e80-9268-6648cf3f2ae0}, hash: 5C11AD3993A8AC3066D63490A08D64A5
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
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Selector.select, ServerSocket.bind, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConnectionHandler> connectionHandler = mockStatic(ConnectionHandler.class)) {
            connectionHandler.when(() -> ConnectionHandler.handleKey(selectionKeyMock)).thenAnswer((Answer<Void>) invocation -> null);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
            NioServer target = spy(new NioServer(streamConnectionFactoryMock, inetSocketAddress));
            doReturn(true, false).when(target).isRunning();
            thrown.expect(NullPointerException.class);
            //Act Statement(s)
            target.run();
            //Assert statement(s)
            connectionHandler.verify(() -> ConnectionHandler.handleKey(selectionKeyMock), atLeast(1));
            verify(target, times(2)).isRunning();
        }
    }

    //Sapient generated method id: ${32cdf3ab-948b-39ed-b94d-9132dcb65546}, hash: 73D0ACCABF86E0C07C36FE6E68D4A4BA
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
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Selector.select, Selector.close, ServerSocket.bind, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConnectionHandler> connectionHandler = mockStatic(ConnectionHandler.class)) {
            connectionHandler.when(() -> ConnectionHandler.handleKey(selectionKeyMock)).thenAnswer((Answer<Void>) invocation -> null);
            connectionHandler.when(() -> ConnectionHandler.handleKey(selectionKeyMock2)).thenAnswer((Answer<Void>) invocation -> null);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
            NioServer target = spy(new NioServer(streamConnectionFactoryMock, inetSocketAddress));
            doReturn(true, false).when(target).isRunning();
            //Act Statement(s)
            target.run();
            //Assert statement(s)
            connectionHandler.verify(() -> ConnectionHandler.handleKey(selectionKeyMock), atLeast(1));
            connectionHandler.verify(() -> ConnectionHandler.handleKey(selectionKeyMock2), atLeast(1));
            verify(target, times(2)).isRunning();
        }
    }

    //Sapient generated method id: ${7959ce11-b573-3651-9055-8c7028eb61bf}, hash: A6DA6649424FFB61B342343FFD834C22
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
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Selector.select, ServerSocket.bind, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
        NioServer target = spy(new NioServer(streamConnectionFactoryMock, inetSocketAddress));
        doReturn(true).when(target).isRunning();
        thrown.expect(NullPointerException.class);

        //Act Statement(s)
        target.run();

        //Assert statement(s)
        verify(target).isRunning();
    }

    //Sapient generated method id: ${5a9eefe1-12c7-3ce1-86c2-993e6a8ab08b}, hash: 98F8A63AD503A44034D4402AEAA4384D
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
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Selector.select, Selector.close, ServerSocket.bind, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConnectionHandler> connectionHandler = mockStatic(ConnectionHandler.class)) {
            connectionHandler.when(() -> ConnectionHandler.handleKey(selectionKeyMock)).thenAnswer((Answer<Void>) invocation -> null);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
            NioServer target = spy(new NioServer(streamConnectionFactoryMock, inetSocketAddress));
            doReturn(true).when(target).isRunning();
            //Act Statement(s)
            target.run();
            //Assert statement(s)
            connectionHandler.verify(() -> ConnectionHandler.handleKey(selectionKeyMock), atLeast(1));
            verify(target).isRunning();
        }
    }

    //Sapient generated method id: ${177a8204-688b-3d14-8f5d-3eebc792802f}, hash: F0F683B89104519807EC7B85B7EF48E7
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
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Selector.select, ServerSocket.bind, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConnectionHandler> connectionHandler = mockStatic(ConnectionHandler.class)) {
            connectionHandler.when(() -> ConnectionHandler.handleKey(selectionKeyMock)).thenAnswer((Answer<Void>) invocation -> null);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
            NioServer target = spy(new NioServer(streamConnectionFactoryMock, inetSocketAddress));
            doReturn(true, false).when(target).isRunning();
            thrown.expect(NullPointerException.class);
            //Act Statement(s)
            target.run();
            //Assert statement(s)
            connectionHandler.verify(() -> ConnectionHandler.handleKey(selectionKeyMock), atLeast(1));
            verify(target, times(2)).isRunning();
        }
    }

    //Sapient generated method id: ${6a35777e-8b72-3d58-bcb9-07f045187e30}, hash: ECDE662E3A9B4E3B7F9C170FA87EE7F3
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
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Selector.select, Selector.close, ServerSocket.bind, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConnectionHandler> connectionHandler = mockStatic(ConnectionHandler.class)) {
            connectionHandler.when(() -> ConnectionHandler.handleKey(selectionKeyMock)).thenAnswer((Answer<Void>) invocation -> null);
            connectionHandler.when(() -> ConnectionHandler.handleKey(selectionKeyMock2)).thenAnswer((Answer<Void>) invocation -> null);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
            NioServer target = spy(new NioServer(streamConnectionFactoryMock, inetSocketAddress));
            doReturn(true, false).when(target).isRunning();
            //Act Statement(s)
            target.run();
            //Assert statement(s)
            connectionHandler.verify(() -> ConnectionHandler.handleKey(selectionKeyMock), atLeast(1));
            connectionHandler.verify(() -> ConnectionHandler.handleKey(selectionKeyMock2), atLeast(1));
            verify(target, times(2)).isRunning();
        }
    }

    //Sapient generated method id: ${e96b8374-5015-3326-ac4f-491969e4b4de}, hash: C3B18D582496AF022A63C8D9205CCAC1
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
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Selector.select, Selector.close, ServerSocket.bind, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConnectionHandler> connectionHandler = mockStatic(ConnectionHandler.class)) {
            connectionHandler.when(() -> ConnectionHandler.handleKey(selectionKeyMock)).thenAnswer((Answer<Void>) invocation -> null);
            connectionHandler.when(() -> ConnectionHandler.handleKey(selectionKeyMock2)).thenAnswer((Answer<Void>) invocation -> null);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
            NioServer target = spy(new NioServer(streamConnectionFactoryMock, inetSocketAddress));
            doReturn(true, false).when(target).isRunning();
            //Act Statement(s)
            target.run();
            //Assert statement(s)
            connectionHandler.verify(() -> ConnectionHandler.handleKey(selectionKeyMock), atLeast(1));
            connectionHandler.verify(() -> ConnectionHandler.handleKey(selectionKeyMock2), atLeast(1));
            verify(target, times(2)).isRunning();
        }
    }

    //Sapient generated method id: ${f1f6783d-62f1-37cc-adb3-69889cbd30d0}, hash: A373880B064FFF67DDF1FD55E45C758C
    @Ignore(value = "Potential harmful system call (ServerSocket.bind, Selector.wakeup) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void triggerShutdownTest() throws IOException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (ServerSocket.bind, Selector.wakeup) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
        NioServer target = new NioServer(streamConnectionFactoryMock, inetSocketAddress);

        //Act Statement(s)
        target.triggerShutdown();
    }
}
