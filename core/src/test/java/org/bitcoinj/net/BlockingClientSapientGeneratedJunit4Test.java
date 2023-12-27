package org.bitcoinj.net;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;

import org.junit.rules.ExpectedException;
import org.bitcoinj.core.Context;

import java.io.ByteArrayInputStream;

import org.bitcoinj.utils.ListenableCompletableFuture;

import java.util.HashSet;
import java.time.Duration;
import java.io.InputStream;

import org.mockito.stubbing.Answer;

import java.nio.ByteBuffer;
import javax.net.SocketFactory;

import org.bitcoinj.base.internal.Preconditions;

import java.net.SocketAddress;
import java.util.Set;

import org.mockito.MockedStatic;

import java.util.concurrent.CompletableFuture;
import java.io.ByteArrayOutputStream;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.isA;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class BlockingClientSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final BlockingClient blockingClientMock = mock(BlockingClient.class);

    private final StreamConnection connectionMock = mock(StreamConnection.class);

    private final StreamConnection streamConnectionMock = mock(StreamConnection.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    private final Context contextMock = mock(Context.class);

    //Sapient generated method id: ${561998f8-7691-38b6-b1d5-0712aa9b4d77}
    @Test()
    public void closeConnectionTest() throws IOException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        StreamConnection streamConnectionMock = mock(StreamConnection.class, "null");
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            Context context2 = new Context();
            context.when(() -> Context.get()).thenReturn(context2);
            Duration duration = Duration.ofDays(0L);
            SocketFactory socketFactory = SocketFactory.getDefault();
            Set<BlockingClient> blockingClientSet = new HashSet<>();
            BlockingClient target = new BlockingClient((SocketAddress) null, streamConnectionMock, duration, socketFactory, blockingClientSet);
            doNothing().when(streamConnectionMock).setWriteTarget(target);
            //Act Statement(s)
            target.closeConnection();
            //Assert statement(s)
            context.verify(() -> Context.get(), atLeast(1));
            verify(streamConnectionMock).setWriteTarget(target);
        }
    }

    //Sapient generated method id: ${ba15c53d-07b3-3a43-bed0-8662bcd3e061}
    @Ignore()
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
        BlockingClient target = new BlockingClient((SocketAddress) null, streamConnectionMock, duration, socketFactory, blockingClientSet);
        doNothing().when(streamConnectionMock).setWriteTarget(target);
        thrown.expect(RuntimeException.class);
        thrown.expectCause(isA(IOException.class));

        //Act Statement(s)
        target.closeConnection();

        //Assert statement(s)
        verify(streamConnectionMock).setWriteTarget(target);
    }

    //Sapient generated method id: ${90b47dad-6d2c-3295-946b-afa0a749fd31}
    @Ignore()
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
            BlockingClient target = new BlockingClient((SocketAddress) null, streamConnectionMock, duration, socketFactory, blockingClientSet);
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
            BlockingClient target = spy(new BlockingClient((SocketAddress) null, streamConnectionMock, duration, socketFactory, blockingClientSet));
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
    @Ignore()
    @Test()
    public void getConnectFutureTest() throws IOException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        StreamConnection streamConnectionMock = mock(StreamConnection.class, "{}");
        try (MockedStatic<ListenableCompletableFuture> listenableCompletableFuture = mockStatic(ListenableCompletableFuture.class);
             MockedStatic<Context> context = mockStatic(Context.class)) {
            Context context2 = new Context();
            context.when(() -> Context.get()).thenReturn(context2);
            ListenableCompletableFuture<SocketAddress> listenableCompletableFuture2 = new ListenableCompletableFuture<>();
            listenableCompletableFuture.when(() -> ListenableCompletableFuture.of((CompletableFuture) any())).thenReturn(listenableCompletableFuture2);
            Duration duration = Duration.ofDays(0L);
            SocketFactory socketFactory = SocketFactory.getDefault();
            Set<BlockingClient> blockingClientSet = new HashSet<>();
            BlockingClient target = new BlockingClient((SocketAddress) null, streamConnectionMock, duration, socketFactory, blockingClientSet);
            doNothing().when(streamConnectionMock).setWriteTarget(target);
            //Act Statement(s)
            ListenableCompletableFuture<SocketAddress> result = target.getConnectFuture();
            //Assert statement(s)
            assertThat(result, equalTo(listenableCompletableFuture2));
            context.verify(() -> Context.get(), atLeast(1));
            listenableCompletableFuture.verify(() -> ListenableCompletableFuture.of((CompletableFuture) any()));
            verify(streamConnectionMock).setWriteTarget(target);
        }
    }
}
