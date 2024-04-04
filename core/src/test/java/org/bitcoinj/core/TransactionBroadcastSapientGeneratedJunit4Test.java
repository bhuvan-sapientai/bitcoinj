package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.Ignore;

import java.util.List;
import java.util.concurrent.Executor;

import org.bitcoinj.utils.Threading;
import org.bitcoinj.utils.ListenableCompletableFuture;

import java.util.function.Function;

import org.mockito.MockedStatic;

import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

public class TransactionBroadcastSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final PeerGroup peerGroupMock = mock(PeerGroup.class, "PeerGroup");

    private final ListenableCompletableFuture<Transaction> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);

    private final TransactionBroadcast.ProgressCallback transactionBroadcastProgressCallbackMock = mock(TransactionBroadcast.ProgressCallback.class, "null");

    private final Transaction transactionMock = mock(Transaction.class);

    //Sapient generated method id: ${927e77df-c1b6-3670-978e-59e7c92ee5b2}, hash: 86A5DAF6AD5E2938FA00B458E5C87C66
    @Test()
    public void transactionTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(1).when(peerGroupMock).getMinBroadcastConnections();
        Transaction transaction = new Transaction();
        TransactionBroadcast target = new TransactionBroadcast(peerGroupMock, transaction);
        //Act Statement(s)
        Transaction result = target.transaction();
        //Assert statement(s)
        assertThat(result, equalTo(transaction));
        verify(peerGroupMock).getMinBroadcastConnections();
    }

    //Sapient generated method id: ${d7e77330-f070-3bc7-9504-6705e6b01f93}, hash: 03B03F94450C6F86FE5E7DFA98FDF3C6
    @Test()
    public void createMockBroadcastTest() {
        //Arrange Statement(s)
        Transaction transaction = new Transaction();
        CompletableFuture<Transaction> completableFuture = new CompletableFuture<>();
        //Act Statement(s)
        TransactionBroadcast result = TransactionBroadcast.createMockBroadcast(transaction, completableFuture);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${498615c2-6f6a-34b5-b210-03ac9d0f99ca}, hash: 04FAA7E0719C946DF3BE34E0F2829998
    @Ignore(value = "Potential harmful system call (CompletableFuture.thenApply) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void futureTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (CompletableFuture.thenApply) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ListenableCompletableFuture> listenableCompletableFuture = mockStatic(ListenableCompletableFuture.class)) {
            doReturn(0).when(peerGroupMock).getMinBroadcastConnections();
            CompletableFuture completableFuture = new CompletableFuture();
            listenableCompletableFuture.when(() -> ListenableCompletableFuture.of(completableFuture)).thenReturn(listenableCompletableFutureMock);
            Transaction transaction = new Transaction();
            TransactionBroadcast target = spy(new TransactionBroadcast(peerGroupMock, transaction));
            CompletableFuture<TransactionBroadcast> completableFuture2 = new CompletableFuture<>();
            doReturn(completableFuture2).when(target).awaitRelayed();
            //Act Statement(s)
            ListenableCompletableFuture<Transaction> result = target.future();
            //Assert statement(s)
            assertThat(result, equalTo(listenableCompletableFutureMock));
            verify(peerGroupMock).getMinBroadcastConnections();
            listenableCompletableFuture.verify(() -> ListenableCompletableFuture.of(completableFuture), atLeast(1));
            verify(target).awaitRelayed();
        }
    }

    //Sapient generated method id: ${1de11617-d9de-392e-9d0d-290cce171c8f}, hash: 105D059A0439830E8D95BE06B1FE8262
    @Ignore(value = "Potential harmful system call (CompletableFuture.thenCompose, CompletableFuture.whenComplete, ListenableCompletableFuture.thenComposeAsync) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void broadcastOnlyTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (CompletableFuture.thenCompose, CompletableFuture.whenComplete, ListenableCompletableFuture.thenComposeAsync) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(0).when(peerGroupMock).getMinBroadcastConnections();
        TransactionBroadcast target = new TransactionBroadcast(peerGroupMock, transactionMock);
        Executor executor = Threading.SAME_THREAD;
        doNothing().when(peerGroupMock).addPreMessageReceivedEventListener(eq(executor), any());
        List<Peer> peerList = new ArrayList<>();
        doReturn(peerList).when(peerGroupMock).getConnectedPeers();
        ListenableCompletableFuture<List<Peer>> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        doReturn(listenableCompletableFutureMock).when(peerGroupMock).waitForPeers(1);
        CompletableFuture completableFuture = new CompletableFuture();
        doReturn(completableFuture).when(listenableCompletableFutureMock).thenComposeAsync((Function) any(), eq(executor));
        //Act Statement(s)
        CompletableFuture<TransactionBroadcast> result = target.broadcastOnly();
        //Assert statement(s)
        //TODO: Please implement equals method in CompletableFuture for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
        verify(peerGroupMock).getMinBroadcastConnections();
        verify(peerGroupMock).addPreMessageReceivedEventListener(eq(executor), any());
        verify(peerGroupMock).getConnectedPeers();
        verify(peerGroupMock).waitForPeers(1);
        verify(listenableCompletableFutureMock).thenComposeAsync((Function) any(), eq(executor));
    }

    //Sapient generated method id: ${e719296f-3655-3e2c-aa33-4e67151418b3}, hash: CA98590EF3D1827B82F2BE3B9B634133
    @Ignore(value = "Potential harmful system call (CompletableFuture.thenCompose, CompletableFuture.whenComplete, ListenableCompletableFuture.thenComposeAsync) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void broadcastAndAwaitRelayTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (CompletableFuture.thenCompose, CompletableFuture.whenComplete, ListenableCompletableFuture.thenComposeAsync) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(0).when(peerGroupMock).getMinBroadcastConnections();
        TransactionBroadcast target = new TransactionBroadcast(peerGroupMock, transactionMock);
        Executor executor = Threading.SAME_THREAD;
        doNothing().when(peerGroupMock).addPreMessageReceivedEventListener(eq(executor), any());
        List<Peer> peerList = new ArrayList<>();
        doReturn(peerList).when(peerGroupMock).getConnectedPeers();
        ListenableCompletableFuture<List<Peer>> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        doReturn(listenableCompletableFutureMock).when(peerGroupMock).waitForPeers(1);
        CompletableFuture completableFuture = new CompletableFuture();
        doReturn(completableFuture).when(listenableCompletableFutureMock).thenComposeAsync((Function) any(), eq(executor));
        //Act Statement(s)
        CompletableFuture<TransactionBroadcast> result = target.broadcastAndAwaitRelay();
        //Assert statement(s)
        //TODO: Please implement equals method in CompletableFuture for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
        verify(peerGroupMock).getMinBroadcastConnections();
        verify(peerGroupMock).addPreMessageReceivedEventListener(eq(executor), any());
        verify(peerGroupMock).getConnectedPeers();
        verify(peerGroupMock).waitForPeers(1);
        verify(listenableCompletableFutureMock).thenComposeAsync((Function) any(), eq(executor));
    }

    //Sapient generated method id: ${fe092c58-5bfb-32e7-8085-7332248b1e54}, hash: 5EAA347E729D3BC5000ADF36467A4A46
    @Test()
    public void awaitRelayedTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(1).when(peerGroupMock).getMinBroadcastConnections();
        Transaction transaction = new Transaction();
        TransactionBroadcast target = new TransactionBroadcast(peerGroupMock, transaction);
        //Act Statement(s)
        CompletableFuture<TransactionBroadcast> result = target.awaitRelayed();
        //Assert statement(s)
        //TODO: Please implement equals method in CompletableFuture for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
        verify(peerGroupMock).getMinBroadcastConnections();
    }

    //Sapient generated method id: ${59a0d6d6-3259-3488-904b-6593cd7ea6c0}, hash: 1788674DCB6B9133574C68D832776906
    @Test()
    public void awaitSentTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(1).when(peerGroupMock).getMinBroadcastConnections();
        Transaction transaction = new Transaction();
        TransactionBroadcast target = new TransactionBroadcast(peerGroupMock, transaction);
        //Act Statement(s)
        CompletableFuture<TransactionBroadcast> result = target.awaitSent();
        //Assert statement(s)
        //TODO: Please implement equals method in CompletableFuture for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
        verify(peerGroupMock).getMinBroadcastConnections();
    }

    //Sapient generated method id: ${4eb7128d-6d35-3535-8be5-c40ff5bd2b32}, hash: 932028A07EEF7F66E234C04C09AEC34B
    @Ignore(value = "Potential harmful system call (CompletableFuture.thenApply) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void broadcastTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (CompletableFuture.thenApply) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ListenableCompletableFuture> listenableCompletableFuture = mockStatic(ListenableCompletableFuture.class)) {
            doReturn(0).when(peerGroupMock).getMinBroadcastConnections();
            CompletableFuture completableFuture = new CompletableFuture();
            listenableCompletableFuture.when(() -> ListenableCompletableFuture.of(completableFuture)).thenReturn(listenableCompletableFutureMock);
            Transaction transaction = new Transaction();
            TransactionBroadcast target = spy(new TransactionBroadcast(peerGroupMock, transaction));
            CompletableFuture<TransactionBroadcast> completableFuture2 = new CompletableFuture<>();
            doReturn(completableFuture2).when(target).broadcastAndAwaitRelay();
            //Act Statement(s)
            ListenableCompletableFuture<Transaction> result = target.broadcast();
            //Assert statement(s)
            assertThat(result, equalTo(listenableCompletableFutureMock));
            verify(peerGroupMock).getMinBroadcastConnections();
            listenableCompletableFuture.verify(() -> ListenableCompletableFuture.of(completableFuture), atLeast(1));
            verify(target).broadcastAndAwaitRelay();
        }
    }

    //Sapient generated method id: ${c2c4c7da-2b22-3c60-867a-84b1fa782b44}, hash: 3A9BC9A39D5236DC758A3078A9BBBD45
    @Ignore()
    @Test()
    public void setProgressCallbackTest() throws Throwable {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(1).when(peerGroupMock).getMinBroadcastConnections();
        Transaction transaction = new Transaction();
        TransactionBroadcast target = spy(new TransactionBroadcast(peerGroupMock, transaction));
        Executor executorMock = mock(Executor.class);
        doNothing().when(target).setProgressCallback(transactionBroadcastProgressCallbackMock, executorMock);
        //Act Statement(s)
        target.setProgressCallback(transactionBroadcastProgressCallbackMock);
        //Assert statement(s)
        verify(peerGroupMock).getMinBroadcastConnections();
        verify(target).setProgressCallback(transactionBroadcastProgressCallbackMock, executorMock);
    }

    //Sapient generated method id: ${e620e18e-8ef2-3844-b03a-dcb75abe0587}, hash: E308583A67478C17DB134CFF5E033CA4
    @Test()
    public void setProgressCallback1WhenNotShouldInvoke() throws Throwable {
        /* Branches:
         * (numWaitingFor > 0) : false
         * (shouldInvoke) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(1).when(peerGroupMock).getMinBroadcastConnections();
        Transaction transaction = new Transaction();
        TransactionBroadcast target = new TransactionBroadcast(peerGroupMock, transaction);
        Executor executorMock = mock(Executor.class, "null");
        //Act Statement(s)
        target.setProgressCallback(transactionBroadcastProgressCallbackMock, executorMock);
        //Assert statement(s)
        verify(peerGroupMock).getMinBroadcastConnections();
    }
}
