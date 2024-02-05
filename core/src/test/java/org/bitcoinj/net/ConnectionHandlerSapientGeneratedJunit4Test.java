package org.bitcoinj.net;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.mockito.InjectMocks;
import org.junit.After;
import org.junit.Test;

import java.io.IOException;

import org.junit.Ignore;
import org.junit.rules.ExpectedException;
import org.mockito.MockitoAnnotations;

import java.util.Set;

import org.bitcoinj.utils.ListenableCompletableFuture;

import java.nio.channels.SelectionKey;
import java.util.HashSet;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.hamcrest.Matchers.isA;

import org.mockito.stubbing.Answer;
import org.bitcoinj.base.internal.Preconditions;

import java.nio.channels.CancelledKeyException;

import org.mockito.MockedStatic;

import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.bitcoinj.utils.Threading;

import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.hamcrest.Matchers.is;

public class ConnectionHandlerSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final StreamConnection connectionMock = mock(StreamConnection.class, "connection");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private ConnectionHandler target;

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    @After()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${9064f274-a506-30bf-be65-c6e849f200e4}
    @Ignore()
    @Test()
    public void writeBytesWhenBytesToWriteRemainingPlusMessageLengthGreaterThanOUTBOUND_BUFFER_BYTE_COUNTThrowsIOException() throws IOException {
        /* Branches:
         * (bytesToWriteRemaining + message.length > OUTBOUND_BUFFER_BYTE_COUNT) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Set<ConnectionHandler> connectionHandlerSet = new HashSet<>();
        target = spy(new ConnectionHandler((StreamConnection) null, (SelectionKey) null, connectionHandlerSet));
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doNothing().when(target).closeConnection();
        IOException iOException = new IOException("Outbound buffer overflowed");
        thrown.expect(IOException.class);
        thrown.expectMessage(iOException.getMessage());
        byte[] byteArray = new byte[]{};

        //Act Statement(s)
        target.writeBytes(byteArray);

        //Assert statement(s)
        verify(target).closeConnection();
    }

    //Sapient generated method id: ${ff0e0c4a-603f-3689-8781-b818ec592a3a}
    @Ignore()
    @Test()
    public void writeBytesWhenCaughtCancelledKeyExceptionThrowsIOException() throws IOException {
        /* Branches:
         * (bytesToWriteRemaining + message.length > OUTBOUND_BUFFER_BYTE_COUNT) : true
         * (catch-exception (CancelledKeyException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Set<ConnectionHandler> connectionHandlerSet = new HashSet<>();
        target = spy(new ConnectionHandler((StreamConnection) null, (SelectionKey) null, connectionHandlerSet));
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doNothing().when(target).closeConnection();
        thrown.expect(IOException.class);
        thrown.expectCause(is(instanceOf(IOException.class)));
        byte[] byteArray = new byte[]{};

        //Act Statement(s)
        target.writeBytes(byteArray);

        //Assert statement(s)
        verify(target).closeConnection();
    }

    //Sapient generated method id: ${32ab6ad4-839f-3192-a507-43ad39ee21c4}
    @Ignore(value = "Potential harmful system call (Selector.wakeup) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void writeBytesWhenBytesToWriteRemainingPlusMessageLengthNotGreaterThanOUTBOUND_BUFFER_BYTE_COUNTAndCaughtCThrowsIOException() throws IOException {
        /* Branches:
         * (bytesToWriteRemaining + message.length > OUTBOUND_BUFFER_BYTE_COUNT) : false
         * (catch-exception (CancelledKeyException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Set<ConnectionHandler> connectionHandlerSet = new HashSet<>();
        connectionHandlerSet.add(target);
        target = spy(new ConnectionHandler((StreamConnection) null, (SelectionKey) null, connectionHandlerSet));
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doNothing().when(target).closeConnection();
        thrown.expect(IOException.class);
        byte[] byteArray = new byte[]{};

        //Act Statement(s)
        target.writeBytes(byteArray);

        //Assert statement(s)
        verify(target).closeConnection();
    }

    //Sapient generated method id: ${d5f77fa9-c783-3382-9284-0e7adc19f566}
    @Ignore(value = "Potential harmful system call (Selector.wakeup) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void writeBytesWhenAndUnlock() throws IOException {
        /* Branches:
         * (bytesToWriteRemaining + message.length > OUTBOUND_BUFFER_BYTE_COUNT) : false
         * (andUnlock) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Set<ConnectionHandler> connectionHandlerSet = new HashSet<>();
        connectionHandlerSet.add(target);
        target = new ConnectionHandler((StreamConnection) null, (SelectionKey) null, connectionHandlerSet);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        byte[] byteArray = new byte[]{};

        //Act Statement(s)
        ListenableCompletableFuture<Void> result = target.writeBytes(byteArray);
        ListenableCompletableFuture<Void> listenableCompletableFuture = new ListenableCompletableFuture<>();

        //Assert statement(s)
        //TODO: Please implement equals method in ListenableCompletableFuture for verification to succeed or you need to adjust respective assertion statements
        assertThat(result, equalTo(listenableCompletableFuture));
    }

    //Sapient generated method id: ${ba15c53d-07b3-3a43-bed0-8662bcd3e061}
    @Ignore()
    @Test()
    public void closeConnectionWhenCaughtIOExceptionThrowsRuntimeException() throws IOException {
        /* Branches:
         * (!lock.isHeldByCurrentThread()) : true
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Set<ConnectionHandler> connectionHandlerSet = new HashSet<>();
        connectionHandlerSet.add(target);
        target = new ConnectionHandler((StreamConnection) null, (SelectionKey) null, connectionHandlerSet);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        thrown.expect(RuntimeException.class);
        thrown.expectCause(is(instanceOf(IOException.class)));

        //Act Statement(s)
        target.closeConnection();
    }

    //Sapient generated method id: ${45eba761-9d43-358e-9382-654546ac97fe}
    @Ignore()
    @Test()
    public void closeConnectionWhenConnectedHandlersIsNull() throws IOException {
        /* Branches:
         * (!lock.isHeldByCurrentThread()) : true
         * (!closeCalled) : true  #  inside connectionClosed method
         * (callClosed) : true  #  inside connectionClosed method
         * (connectedHandlers == null) : true  #  inside connectionClosed method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        target = new ConnectionHandler((StreamConnection) null, (SelectionKey) null, (Set) null);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doNothing().when(connectionMock).connectionClosed();

        //Act Statement(s)
        target.closeConnection();

        //Assert statement(s)
        verify(connectionMock).connectionClosed();
    }

    //Sapient generated method id: ${8cf3a4b5-9dad-3e1b-8fdb-a33cebbd0346}
    @Ignore()
    @Test()
    public void closeConnectionWhenConnectedHandlersNotRemoveThisThrowsIllegalStateException() {
        /* Branches:
         * (!lock.isHeldByCurrentThread()) : true
         * (!closeCalled) : true  #  inside connectionClosed method
         * (callClosed) : true  #  inside connectionClosed method
         * (connectedHandlers == null) : false  #  inside connectionClosed method
         * (connectedHandlers.remove(this)) : false  #  inside connectionClosed method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkState(true)).thenAnswer((Answer<Void>) invocation -> null);
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(false)).thenThrow(illegalStateException);
            Set<ConnectionHandler> connectionHandlerSet = new HashSet<>();
            connectionHandlerSet.add(target);
            target = new ConnectionHandler((StreamConnection) null, (SelectionKey) null, connectionHandlerSet);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.closeConnection();
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkState(true), atLeast(1));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
        }
    }

    //Sapient generated method id: ${c8522d7c-b12e-3760-afe1-4aef4bbe70c2}
    @Test()
    public void handleKeyWhenHandlerIsNull() throws Exception {
        /* Branches:
         * (handler == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        SelectionKey selectionKey = null;

        //Act Statement(s)
        ConnectionHandler.handleKey(selectionKey);
    }

    //Sapient generated method id: ${f30e32c7-b1b1-3dcf-912f-c877c210b02e}
    @Test()
    public void handleKeyWhenKeyNotIsValid() throws Exception {
        /* Branches:
         * (handler == null) : false
         * (!key.isValid()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        SelectionKey selectionKey = null;

        //Act Statement(s)
        ConnectionHandler.handleKey(selectionKey);
    }

    //Sapient generated method id: ${67971760-b8f1-3c37-be69-a46a756e75bb}
    @Test()
    public void handleKeyWhenTGetMessageIsNullThrowsNullPointerException() {
        /* Branches:
         * (handler == null) : true
         * (catch-exception (Exception)) : true
         * (t.getMessage() != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        thrown.expect(NullPointerException.class);
        //TODO: Needs initialization with real value
        SelectionKey selectionKey = null;

        //Act Statement(s)
        ConnectionHandler.handleKey(selectionKey);
    }

    //Sapient generated method id: ${aad79340-20b2-33c9-9cee-b446394c7b76}
    @Test()
    public void handleKeyWhenTGetMessageIsNotNull() throws Exception {
        /* Branches:
         * (handler == null) : false
         * (!key.isValid()) : true
         * (catch-exception (Exception)) : true
         * (t.getMessage() != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        SelectionKey selectionKey = null;

        //Act Statement(s)
        ConnectionHandler.handleKey(selectionKey);
    }

    //Sapient generated method id: ${a452ae3c-d2c6-3071-92b3-079d2d9c1795}
    @Test()
    public void handleKeyWhenKeyIsReadableAndTGetMessageIsNotNull() throws Exception {
        /* Branches:
         * (handler == null) : false
         * (!key.isValid()) : false
         * (key.isReadable()) : true
         * (t.getMessage() != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        SelectionKey selectionKey = null;

        //Act Statement(s)
        ConnectionHandler.handleKey(selectionKey);
    }
}
