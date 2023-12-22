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

public class NioServerSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final StreamConnection connectionMock = mock(StreamConnection.class);

    private final StreamConnectionFactory streamConnectionFactoryMock = mock(StreamConnectionFactory.class);

    //Sapient generated method id: ${52e4a6f0-2f0c-3161-9a57-889c274878ab}
    @Ignore(value = "Potential harmful system call (Selector.select, Selector.close, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
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
        InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
        NioServer target = spy(new NioServer(streamConnectionFactoryMock, inetSocketAddress));
        doNothing().when(connectionMock).connectionOpened();
        doReturn(true, false).when(target).isRunning();

        //Act Statement(s)
        target.run();

        //Assert statement(s)
        verify(target, times(2)).isRunning();
        verify(connectionMock, times(2)).connectionOpened();
    }

    //Sapient generated method id: ${ae01e101-caa1-34eb-9b7a-7fd3426e5a25}
    @Ignore(value = "Potential harmful system call (Selector.select, Selector.close, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void runWhenKeyIsAcceptableAndSelectorKeysIsNotEmpty() throws Exception {
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
        try (MockedStatic<ConnectionHandler> connectionHandler = mockStatic(ConnectionHandler.class)) {
            connectionHandler.when(() -> ConnectionHandler.handleKey((SelectionKey) null)).thenAnswer((Answer<Void>) invocation -> null);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
            NioServer target = spy(new NioServer(streamConnectionFactoryMock, inetSocketAddress));
            doNothing().when(connectionMock).connectionOpened();
            doReturn(true, false).when(target).isRunning();
            //Act Statement(s)
            target.run();
            //Assert statement(s)
            connectionHandler.verify(() -> ConnectionHandler.handleKey((SelectionKey) null), atLeast(1));
            verify(target, times(2)).isRunning();
            verify(connectionMock).connectionOpened();
        }
    }

    //Sapient generated method id: ${0f295ede-4062-3eac-9290-cd9529b29da4}
    @Ignore(value = "Potential harmful system call (Selector.select, Selector.close, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void runWhenKeyNotIsAcceptableAndSelectorKeysIsEmpty() throws Exception {
        /* Branches:
         * (isRunning()) : true
         * (keyIterator.hasNext()) : true
         * (key.isValid()) : true  #  inside handleKey method
         * (key.isAcceptable()) : false  #  inside handleKey method
         * (for-each(selector.keys())) : false
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

    //Sapient generated method id: ${35c0ca33-0f17-3497-878a-9fa3247c3af6}
    @Ignore(value = "Potential harmful system call (Selector.select, Selector.close, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void runWhenCaughtIOExceptionAndKeyNotIsValid() throws Exception {
        /* Branches:
         * (isRunning()) : true
         * (keyIterator.hasNext()) : false
         * (for-each(selector.keys())) : true
         * (catch-exception (IOException)) : true
         * (key.isValid()) : false  #  inside handleKey method
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

    //Sapient generated method id: ${f2d0913e-71a4-3326-abe9-19a8c7a6bf18}
    @Ignore(value = "Potential harmful system call (Selector.select, Selector.close, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void runWhenKeyIsAcceptableAndSelectorKeysIsNotEmptyAndCaughtIOException() throws Exception {
        /* Branches:
         * (isRunning()) : true
         * (keyIterator.hasNext()) : true
         * (key.isValid()) : true  #  inside handleKey method
         * (key.isAcceptable()) : true  #  inside handleKey method
         * (for-each(selector.keys())) : true
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
        NioServer target = spy(new NioServer(streamConnectionFactoryMock, inetSocketAddress));
        doNothing().when(connectionMock).connectionOpened();
        doReturn(true, false).when(target).isRunning();

        //Act Statement(s)
        target.run();

        //Assert statement(s)
        verify(target, times(2)).isRunning();
        verify(connectionMock, times(2)).connectionOpened();
    }

    //Sapient generated method id: ${c28c05db-8665-3384-9ae3-df4831cb4236}
    @Ignore(value = "Potential harmful system call (Selector.select, Selector.close, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void runWhenKeyIsValidAndKeyIsAcceptableAndSelectorKeysIsNotEmptyAndCaughtIOException() throws Exception {
        /* Branches:
         * (isRunning()) : true
         * (keyIterator.hasNext()) : true
         * (key.isValid()) : true  #  inside handleKey method
         * (key.isAcceptable()) : true  #  inside handleKey method
         * (for-each(selector.keys())) : true
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
        NioServer target = spy(new NioServer(streamConnectionFactoryMock, inetSocketAddress));
        doNothing().when(connectionMock).connectionOpened();
        doReturn(true, false).when(target).isRunning();

        //Act Statement(s)
        target.run();

        //Assert statement(s)
        verify(target, times(2)).isRunning();
        verify(connectionMock, times(2)).connectionOpened();
    }

    //Sapient generated method id: ${47fed750-efac-3709-a3bf-df8cca75b4e4}
    @Ignore(value = "Potential harmful system call (Selector.select, Selector.close, Selector.selectedKeys, Selector.keys) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void runWhenKeyIteratorHasNextAndKeyIsValidAndKeyIsAcceptableAndSelectorKeysIsNotEmptyAndCaughtIOException() throws Exception {
        /* Branches:
         * (isRunning()) : true
         * (keyIterator.hasNext()) : true
         * (key.isValid()) : true  #  inside handleKey method
         * (key.isAcceptable()) : true  #  inside handleKey method
         * (for-each(selector.keys())) : true
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
        NioServer target = spy(new NioServer(streamConnectionFactoryMock, inetSocketAddress));
        doNothing().when(connectionMock).connectionOpened();
        doReturn(true, false).when(target).isRunning();

        //Act Statement(s)
        target.run();

        //Assert statement(s)
        verify(target, times(2)).isRunning();
        verify(connectionMock, times(2)).connectionOpened();
    }

    //Sapient generated method id: ${f1f6783d-62f1-37cc-adb3-69889cbd30d0}
    @Ignore(value = "Potential harmful system call (Selector.wakeup) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void triggerShutdownTest() throws IOException {
        //Arrange Statement(s)
        InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
        NioServer target = new NioServer(streamConnectionFactoryMock, inetSocketAddress);

        //Act Statement(s)
        target.triggerShutdown();
    }
}
