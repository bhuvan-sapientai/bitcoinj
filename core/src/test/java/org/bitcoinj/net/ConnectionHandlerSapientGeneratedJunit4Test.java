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
        thrown.expectCause(isA(IOException.class));
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
        thrown.expectCause(isA(IOException.class));
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
        ConnectionHandler connectionHandlerMock = mock(ConnectionHandler.class);
        Set<ConnectionHandler> connectionHandlerSet = new HashSet<>();
        connectionHandlerSet.add(connectionHandlerMock);
        target = new ConnectionHandler((StreamConnection) null, (SelectionKey) null, connectionHandlerSet);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        thrown.expect(RuntimeException.class);
        thrown.expectCause(isA(IOException.class));
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
    public void closeConnectionWhenConnectedHandlersNotRemoveThisThrowsIllegalStateException() throws IOException {
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
        ConnectionHandler connectionHandlerMock = mock(ConnectionHandler.class);
        Set<ConnectionHandler> connectionHandlerSet = new HashSet<>();
        connectionHandlerSet.add(connectionHandlerMock);
        target = new ConnectionHandler((StreamConnection) null, (SelectionKey) null, connectionHandlerSet);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doNothing().when(connectionMock).connectionClosed();
        //Act Statement(s)
        target.closeConnection();
        //Assert statement(s)
        verify(connectionMock).connectionClosed();
    }

    //Sapient generated method id: ${c8522d7c-b12e-3760-afe1-4aef4bbe70c2}
    @Test()
    public void handleKeyWhenHandlerIsNull() {
        /* Branches:
         * (handler == null) : true
         */
        //Arrange Statement(s)
        thrown.expect(NullPointerException.class);
        SelectionKey selectionKey = null;
        //Act Statement(s)
        ConnectionHandler.handleKey(selectionKey);
    }

    //Sapient generated method id: ${f30e32c7-b1b1-3dcf-912f-c877c210b02e}
    @Test()
    public void handleKeyWhenKeyNotIsValid() {
        /* Branches:
         * (handler == null) : false
         * (!key.isValid()) : true
         */
        //Arrange Statement(s)
        thrown.expect(NullPointerException.class);
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

    //Sapient generated method id: ${8dd15228-f18e-36f7-bb3b-0267ba046ba1}
    @Ignore()
    @Test()
    public void handleKeyWhenCaughtExceptionAndTGetMessageIsNotNull() throws Exception {
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

    //Sapient generated method id: ${2b6f46d9-9014-3c84-aea9-8946119c95e2}
    @Test()
    public void handleKeyWhenReadEqualsMinus1() {
        /* Branches:
         * (handler == null) : false
         * (!key.isValid()) : false
         * (key.isReadable()) : true
         * (read == 0) : false
         * (read == -1) : true
         */
        //Arrange Statement(s)
        thrown.expect(NullPointerException.class);
        SelectionKey selectionKey = null;
        //Act Statement(s)
        ConnectionHandler.handleKey(selectionKey);
    }

    //Sapient generated method id: ${ea709432-4919-38c1-b0ec-1c3c03e0aaa8}
    @Ignore()
    @Test()
    public void handleKeyWhenReadEqualsMinus1AndCaughtExceptionAndTGetMessageIsNotNull() throws Exception {
        /* Branches:
         * (handler == null) : false
         * (!key.isValid()) : false
         * (key.isReadable()) : true
         * (read == 0) : false
         * (read == -1) : true
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

    //Sapient generated method id: ${24627816-8d5d-3930-a4db-6b6f12291aff}
    @Test()
    public void handleKeyWhenHandlerReadBuffPositionEqualsBytesConsumedAndKeyIsWritable() {
        /* Branches:
         * (handler == null) : false
         * (!key.isValid()) : false
         * (key.isReadable()) : true
         * (read == 0) : false
         * (read == -1) : false
         * (handler.readBuff.position() == bytesConsumed) : true
         * (key.isWritable()) : true
         */
        //Arrange Statement(s)
        thrown.expect(NullPointerException.class);
        SelectionKey selectionKey = null;
        //Act Statement(s)
        ConnectionHandler.handleKey(selectionKey);
    }

    //Sapient generated method id: ${7f01fbea-3b7d-3ee8-a186-b1ba26d6f395}
    @Test()
    public void handleKeyWhenHandlerReadBuffPositionNotEqualsBytesConsumedAndTGetMessageIsNotNull() {
        /* Branches:
         * (handler == null) : false
         * (!key.isValid()) : false
         * (key.isReadable()) : true
         * (read == 0) : false
         * (read == -1) : false
         * (handler.readBuff.position() == bytesConsumed) : false
         * (t.getMessage() != null) : true
         */
        //Arrange Statement(s)
        thrown.expect(NullPointerException.class);
        SelectionKey selectionKey = null;
        //Act Statement(s)
        ConnectionHandler.handleKey(selectionKey);
    }
}
