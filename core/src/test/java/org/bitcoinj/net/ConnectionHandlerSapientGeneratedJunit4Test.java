package org.bitcoinj.net;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.mockito.InjectMocks;
import org.junit.After;
import org.junit.Test;

import java.io.IOException;

import org.junit.Ignore;
import org.junit.rules.ExpectedException;

import java.nio.channels.SocketChannel;

import org.mockito.MockitoAnnotations;

import java.util.Set;

import org.bitcoinj.utils.ListenableCompletableFuture;

import java.nio.channels.SelectionKey;
import java.util.HashSet;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.hamcrest.Matchers.is;

public class ConnectionHandlerSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final SocketChannel channelMock = mock(SocketChannel.class, "channel");

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

    //Sapient generated method id: ${9064f274-a506-30bf-be65-c6e849f200e4}, hash: CC9BB737FB802D2CDB460C7BC01A1163
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
        SelectionKey selectionKeyMock = mock(SelectionKey.class);
        Set<ConnectionHandler> connectionHandlerSet = new HashSet<>();
        target = spy(new ConnectionHandler((StreamConnection) null, selectionKeyMock, connectionHandlerSet));
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

    //Sapient generated method id: ${ff0e0c4a-603f-3689-8781-b818ec592a3a}, hash: 8B547C4B62E06E94F3CEC4A21D04C9C4
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
        SelectionKey selectionKeyMock = mock(SelectionKey.class);
        Set<ConnectionHandler> connectionHandlerSet = new HashSet<>();
        target = spy(new ConnectionHandler((StreamConnection) null, selectionKeyMock, connectionHandlerSet));
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

    //Sapient generated method id: ${32ab6ad4-839f-3192-a507-43ad39ee21c4}, hash: E21570F07985F6FD0A088E132615B9B9
    @Ignore(value = "Potential harmful system call (Selector.wakeup) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void writeBytesWhenBytesToWriteRemainingPlusMessageLengthNotGreaterThanOUTBOUND_BUFFER_BYTE_COUNTAndCaughtCThrowsIOException() throws IOException {
        /* Branches:
         * (bytesToWriteRemaining + message.length > OUTBOUND_BUFFER_BYTE_COUNT) : false
         * (catch-exception (CancelledKeyException)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Selector.wakeup) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        SelectionKey selectionKeyMock = mock(SelectionKey.class);
        Set<ConnectionHandler> connectionHandlerSet = new HashSet<>();
        connectionHandlerSet.add(target);
        target = spy(new ConnectionHandler((StreamConnection) null, selectionKeyMock, connectionHandlerSet));
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doNothing().when(target).closeConnection();
        thrown.expect(IOException.class);
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        target.writeBytes(byteArray);
        //Assert statement(s)
        verify(target).closeConnection();
    }

    //Sapient generated method id: ${d5f77fa9-c783-3382-9284-0e7adc19f566}, hash: A4EF6B5624FD7DA3D1A61AF0CAC2AF7D
    @Ignore(value = "Potential harmful system call (Selector.wakeup) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void writeBytesWhenAndUnlock() throws IOException {
        /* Branches:
         * (bytesToWriteRemaining + message.length > OUTBOUND_BUFFER_BYTE_COUNT) : false
         * (andUnlock) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Selector.wakeup) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        SelectionKey selectionKeyMock = mock(SelectionKey.class);
        Set<ConnectionHandler> connectionHandlerSet = new HashSet<>();
        connectionHandlerSet.add(target);
        target = new ConnectionHandler((StreamConnection) null, selectionKeyMock, connectionHandlerSet);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        ListenableCompletableFuture<Void> result = target.writeBytes(byteArray);
        //Assert statement(s)
        //TODO: Please implement equals method in ListenableCompletableFuture for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${ba15c53d-07b3-3a43-bed0-8662bcd3e061}, hash: 6A99A1C8D28E8143128DF7054105D414
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
        SelectionKey selectionKeyMock = mock(SelectionKey.class);
        Set<ConnectionHandler> connectionHandlerSet = new HashSet<>();
        connectionHandlerSet.add(target);
        target = new ConnectionHandler((StreamConnection) null, selectionKeyMock, connectionHandlerSet);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doNothing().when(channelMock).close();
        thrown.expect(RuntimeException.class);
        thrown.expectCause(is(instanceOf(IOException.class)));
        //Act Statement(s)
        target.closeConnection();
        //Assert statement(s)
        verify(channelMock).close();
    }

    //Sapient generated method id: ${45eba761-9d43-358e-9382-654546ac97fe}, hash: 4E89E513A04AB9385876CEFB3F4A7294
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
        SelectionKey selectionKeyMock = mock(SelectionKey.class);
        target = new ConnectionHandler((StreamConnection) null, selectionKeyMock, (Set) null);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doNothing().when(connectionMock).connectionClosed();
        //Act Statement(s)
        target.closeConnection();
        //Assert statement(s)
        verify(connectionMock).connectionClosed();
    }

    //Sapient generated method id: ${8cf3a4b5-9dad-3e1b-8fdb-a33cebbd0346}, hash: DF82D0F553341CACF2FEF98ED8DF94F5
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
        SelectionKey selectionKeyMock = mock(SelectionKey.class);
        Set<ConnectionHandler> connectionHandlerSet = new HashSet<>();
        connectionHandlerSet.add(target);
        target = new ConnectionHandler((StreamConnection) null, selectionKeyMock, connectionHandlerSet);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        thrown.expect(IllegalStateException.class);
        //Act Statement(s)
        target.closeConnection();
    }

    //Sapient generated method id: ${c8522d7c-b12e-3760-afe1-4aef4bbe70c2}, hash: 6A4EDBD7FB44364E0E70ABFDE38349B1
    @Test()
    public void handleKeyWhenHandlerIsNull() throws Exception {
        /* Branches:
         * (handler == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        SelectionKey selectionKeyMock = mock(SelectionKey.class);
        //Act Statement(s)
        ConnectionHandler.handleKey(selectionKeyMock);
    }

    //Sapient generated method id: ${f30e32c7-b1b1-3dcf-912f-c877c210b02e}, hash: DFD345F9924A2B1B4622E52E0E0DF610
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
        SelectionKey selectionKeyMock = mock(SelectionKey.class);
        //Act Statement(s)
        ConnectionHandler.handleKey(selectionKeyMock);
    }

    //Sapient generated method id: ${67971760-b8f1-3c37-be69-a46a756e75bb}, hash: 18260A2D5187BC55573FD89B4F13D8E3
    @Ignore()
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
        SelectionKey selectionKeyMock = mock(SelectionKey.class);
        //Act Statement(s)
        ConnectionHandler.handleKey(selectionKeyMock);
    }

    //Sapient generated method id: ${aad79340-20b2-33c9-9cee-b446394c7b76}, hash: 802B37390535984FA604FE098D7DD547
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
        SelectionKey selectionKeyMock = mock(SelectionKey.class);
        //Act Statement(s)
        ConnectionHandler.handleKey(selectionKeyMock);
    }

    //Sapient generated method id: ${a452ae3c-d2c6-3071-92b3-079d2d9c1795}, hash: 4D38AD02A39C4A1FCB7494A5BEEA995F
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
        SelectionKey selectionKeyMock = mock(SelectionKey.class);
        //Act Statement(s)
        ConnectionHandler.handleKey(selectionKeyMock);
    }

    //Sapient generated method id: ${157fcb56-ebdd-3d7a-bbe5-4e46ab692488}, hash: 4FA7E36938BE42907441C9E2F50F525D
    @Test()
    public void handleKeyWhenKeyIsWritable() throws Exception {
        /* Branches:
         * (handler == null) : false
         * (!key.isValid()) : false
         * (key.isReadable()) : false
         * (key.isWritable()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        SelectionKey selectionKeyMock = mock(SelectionKey.class);
        //Act Statement(s)
        ConnectionHandler.handleKey(selectionKeyMock);
    }
}
