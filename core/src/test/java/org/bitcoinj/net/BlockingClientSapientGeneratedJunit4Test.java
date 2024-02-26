package org.bitcoinj.net;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.Ignore;

import java.io.IOException;

import org.junit.rules.ExpectedException;
import org.bitcoinj.core.Context;

import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import javax.net.SocketFactory;
import java.net.SocketAddress;
import java.util.Set;

import org.bitcoinj.utils.ListenableCompletableFuture;

import java.util.HashSet;
import java.time.Duration;

import org.mockito.MockedStatic;

import java.io.InputStream;
import java.io.ByteArrayOutputStream;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;

public class BlockingClientSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final StreamConnection connectionMock = mock(StreamConnection.class);

    private final SocketAddress socketAddressMock = mock(SocketAddress.class, "<init>_socketAddress1");

    private final StreamConnection streamConnectionMock = mock(StreamConnection.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${69cdc266-c62b-3d3b-93ab-567fdddb7bde}
    @Test()
    public void runReadLoopWhenDbufRemainingGreaterThanReadBuffLengthThrowsIllegalStateException() throws Exception {
        /* Branches:
         * (dbuf.remaining() > 0) : true
         * (dbuf.remaining() <= readBuff.length) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(0).when(connectionMock).getMaxMessageSize();
        thrown.expect(IllegalStateException.class);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());

        //Act Statement(s)
        BlockingClient.runReadLoop(inputStream, connectionMock);

        //Assert statement(s)
        verify(connectionMock).getMaxMessageSize();
    }

    //Sapient generated method id: ${5eb93115-729d-31cb-85df-54ea07ce10c3}
    @Test()
    public void runReadLoopWhenReadEqualsMinus1() throws Exception {
        /* Branches:
         * (dbuf.remaining() > 0) : true
         * (dbuf.remaining() <= readBuff.length) : true
         * (read == -1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(0).when(connectionMock).getMaxMessageSize();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());

        //Act Statement(s)
        BlockingClient.runReadLoop(inputStream, connectionMock);

        //Assert statement(s)
        verify(connectionMock).getMaxMessageSize();
    }

    //Sapient generated method id: ${547ee14d-cdf1-3b26-8e42-54547c702e60}
    @Test()
    public void runReadLoopWhenDbufPositionEqualsBytesConsumed() throws Exception {
        /* Branches:
         * (dbuf.remaining() > 0) : true
         * (dbuf.remaining() <= readBuff.length) : true
         * (read == -1) : false
         * (dbuf.position() == bytesConsumed) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(0).when(connectionMock).getMaxMessageSize();
        doReturn(0).when(connectionMock).receiveBytes((ByteBuffer) any());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());

        //Act Statement(s)
        BlockingClient.runReadLoop(inputStream, connectionMock);

        //Assert statement(s)
        verify(connectionMock).getMaxMessageSize();
        verify(connectionMock).receiveBytes((ByteBuffer) any());
    }

    //Sapient generated method id: ${886d77d4-a1e2-30a4-97cb-cb0f1a8e5b34}
    @Test()
    public void runReadLoopWhenDbufPositionNotEqualsBytesConsumedThrowsIllegalStateException() throws Exception {
        /* Branches:
         * (dbuf.remaining() > 0) : true
         * (dbuf.remaining() <= readBuff.length) : true
         * (read == -1) : false
         * (dbuf.position() == bytesConsumed) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(0).when(connectionMock).getMaxMessageSize();
        doReturn(0).when(connectionMock).receiveBytes((ByteBuffer) any());
        thrown.expect(IllegalStateException.class);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());

        //Act Statement(s)
        BlockingClient.runReadLoop(inputStream, connectionMock);

        //Assert statement(s)
        verify(connectionMock).getMaxMessageSize();
        verify(connectionMock).receiveBytes((ByteBuffer) any());
    }

    //Sapient generated method id: ${561998f8-7691-38b6-b1d5-0712aa9b4d77}
    @Ignore(value = "Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void closeConnectionTest() throws IOException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Duration duration = Duration.ofDays(0L);
        SocketFactory socketFactory = SocketFactory.getDefault();
        Set<BlockingClient> blockingClientSet = new HashSet<>();
        BlockingClient target = new BlockingClient(socketAddressMock, streamConnectionMock, duration, socketFactory, blockingClientSet);
        doNothing().when(streamConnectionMock).setWriteTarget(target);

        //Act Statement(s)
        target.closeConnection();

        //Assert statement(s)
        verify(streamConnectionMock).setWriteTarget(target);
    }

    //Sapient generated method id: ${ba15c53d-07b3-3a43-bed0-8662bcd3e061}
    @Ignore(value = "Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void closeConnectionWhenCaughtIOExceptionThrowsRuntimeException() throws IOException {
        /* Branches:
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Duration duration = Duration.ofDays(0L);
        SocketFactory socketFactory = SocketFactory.getDefault();
        Set<BlockingClient> blockingClientSet = new HashSet<>();
        BlockingClient target = new BlockingClient(socketAddressMock, streamConnectionMock, duration, socketFactory, blockingClientSet);
        doNothing().when(streamConnectionMock).setWriteTarget(target);
        thrown.expect(RuntimeException.class);
        thrown.expectCause(is(instanceOf(IOException.class)));

        //Act Statement(s)
        target.closeConnection();

        //Assert statement(s)
        verify(streamConnectionMock).setWriteTarget(target);
    }

    //Sapient generated method id: ${90b47dad-6d2c-3295-946b-afa0a749fd31}
    @Ignore(value = "Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void writeBytesTest() throws IOException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ListenableCompletableFuture<Void> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        try (MockedStatic<ListenableCompletableFuture> listenableCompletableFuture = mockStatic(ListenableCompletableFuture.class)) {
            listenableCompletableFuture.when(() -> ListenableCompletableFuture.completedFuture(null)).thenReturn(listenableCompletableFutureMock);
            Duration duration = Duration.ofDays(0L);
            SocketFactory socketFactory = SocketFactory.getDefault();
            Set<BlockingClient> blockingClientSet = new HashSet<>();
            BlockingClient target = new BlockingClient(socketAddressMock, streamConnectionMock, duration, socketFactory, blockingClientSet);
            doNothing().when(streamConnectionMock).setWriteTarget(target);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            ListenableCompletableFuture<Void> result = target.writeBytes(byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(listenableCompletableFutureMock));
            listenableCompletableFuture.verify(() -> ListenableCompletableFuture.completedFuture(null), atLeast(1));
            verify(streamConnectionMock).setWriteTarget(target);
        }
    }

    //Sapient generated method id: ${d197da93-8eb6-3952-99de-dd3433302555}
    @Ignore(value = "Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void writeBytesWhenCaughtIOExceptionThrowsIOException() throws IOException {
        /* Branches:
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ListenableCompletableFuture listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        try (MockedStatic<ListenableCompletableFuture> listenableCompletableFuture = mockStatic(ListenableCompletableFuture.class)) {
            listenableCompletableFuture.when(() -> ListenableCompletableFuture.completedFuture(null)).thenReturn(listenableCompletableFutureMock);
            Duration duration = Duration.ofDays(0L);
            SocketFactory socketFactory = SocketFactory.getDefault();
            Set<BlockingClient> blockingClientSet = new HashSet<>();
            BlockingClient target = spy(new BlockingClient(socketAddressMock, streamConnectionMock, duration, socketFactory, blockingClientSet));
            doNothing().when(target).closeConnection();
            doNothing().when(streamConnectionMock).setWriteTarget(target);
            thrown.expect(IOException.class);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            target.writeBytes(byteArray);
            //Assert statement(s)
            listenableCompletableFuture.verify(() -> ListenableCompletableFuture.completedFuture(null), atLeast(1));
            verify(target).closeConnection();
            verify(streamConnectionMock).setWriteTarget(target);
        }
    }

    //Sapient generated method id: ${36732ad5-ba24-3fdc-b468-45e041efaa06}
    @Ignore(value = "Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void getConnectFutureTest() throws IOException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Duration duration = Duration.ofDays(0L);
        SocketFactory socketFactory = SocketFactory.getDefault();
        Set<BlockingClient> blockingClientSet = new HashSet<>();
        BlockingClient target = new BlockingClient(socketAddressMock, streamConnectionMock, duration, socketFactory, blockingClientSet);
        doNothing().when(streamConnectionMock).setWriteTarget(target);

        //Act Statement(s)
        ListenableCompletableFuture<SocketAddress> result = target.getConnectFuture();

        //Assert statement(s)
        //TODO: Please implement equals method in ListenableCompletableFuture for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
        verify(streamConnectionMock).setWriteTarget(target);
    }
}
