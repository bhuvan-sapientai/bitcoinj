package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.rules.ExpectedException;
import org.bitcoinj.utils.ListenableCompletableFuture;

import java.util.Date;
import java.util.Optional;

import org.mockito.stubbing.Answer;

import java.util.concurrent.Executor;

import org.bitcoinj.base.internal.TimeUtils;

import java.nio.ByteBuffer;

import org.bitcoinj.base.internal.Preconditions;

import java.util.Set;

import org.bitcoinj.utils.ListenerRegistration;
import org.bitcoinj.base.Sha256Hash;

import java.net.InetAddress;
import java.util.function.Supplier;

import org.mockito.MockedStatic;

import java.time.Instant;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

public class TransactionConfidenceSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final PeerAddress peerAddressMock = mock(PeerAddress.class);

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);

    private final TransactionConfidence.Listener transactionConfidenceListenerMock = mock(TransactionConfidence.Listener.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${0b160154-951e-3a14-95bd-e6793a7bce96}
    @Ignore()
    @Test()
    public void addEventListenerTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        TransactionConfidence target = new TransactionConfidence(sha256Hash);
        //TODO: Needs initialization with real value
        Executor executor = null;
        //Act Statement(s)
        target.addEventListener(executor, transactionConfidenceListenerMock);
    }

    //Sapient generated method id: ${283de23e-4782-3528-be05-a980b30b2663}
    @Ignore()
    @Test()
    public void addEventListener1Test() {
        //Arrange Statement(s)
        TransactionConfidence target = spy(new TransactionConfidence(sha256HashMock));
        doNothing().when(target).addEventListener((Executor) null, transactionConfidenceListenerMock);
        //Act Statement(s)
        target.addEventListener(transactionConfidenceListenerMock);
        //Assert statement(s)
        verify(target).addEventListener((Executor) null, transactionConfidenceListenerMock);
    }

    //Sapient generated method id: ${5cc48424-61f6-35f4-8515-5f2d83f249fa}
    @Test()
    public void removeEventListenerWhenRemoved() {
        /* Branches:
         * (listeners.isEmpty()) : true
         * (removed) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class)) {
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(transactionConfidenceListenerMock), any())).thenReturn(true);
            TransactionConfidence target = new TransactionConfidence(sha256HashMock);
            //Act Statement(s)
            boolean result = target.removeEventListener(transactionConfidenceListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(transactionConfidenceListenerMock), any()));
        }
    }

    //Sapient generated method id: ${f0438ea8-958a-3076-af1e-960bcc873d02}
    @Test()
    public void removeEventListenerWhenNotRemoved() {
        /* Branches:
         * (listeners.isEmpty()) : true
         * (removed) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class)) {
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(transactionConfidenceListenerMock), any())).thenReturn(false);
            TransactionConfidence target = new TransactionConfidence(sha256HashMock);
            //Act Statement(s)
            boolean result = target.removeEventListener(transactionConfidenceListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(transactionConfidenceListenerMock), any()));
        }
    }

    //Sapient generated method id: ${643dd53f-9df0-3a76-aa96-fd6311b02111}
    @Test()
    public void getAppearedAtChainHeightWhenGetConfidenceTypeNotEqualsConfidenceTypeBUILDINGThrowsIllegalStateException() {
        /* Branches:
         * (getConfidenceType() != ConfidenceType.BUILDING) : true
         */
        //Arrange Statement(s)
        TransactionConfidence target = new TransactionConfidence(sha256HashMock);
        IllegalStateException illegalStateException = new IllegalStateException("Confidence type is UNKNOWN, not BUILDING");
        thrown.expect(IllegalStateException.class);
        thrown.expectMessage(illegalStateException.getMessage());
        //Act Statement(s)
        target.getAppearedAtChainHeight();
    }

    //Sapient generated method id: ${dcffcc95-1bba-3c36-a6d9-30699e2039cb}
    @Test()
    public void setAppearedAtChainHeightWhenAppearedAtChainHeightLessThan0ThrowsIllegalArgumentException() {
        /* Branches:
         * (appearedAtChainHeight < 0) : true
         */
        //Arrange Statement(s)
        TransactionConfidence target = new TransactionConfidence(sha256HashMock);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("appearedAtChainHeight out of range");
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(illegalArgumentException.getMessage());
        //Act Statement(s)
        target.setAppearedAtChainHeight(-2147483648);
    }

    //Sapient generated method id: ${75079ae9-2e97-3281-9ac5-35462ad24d72}
    @Test()
    public void setAppearedAtChainHeightWhenConfidenceTypeNotEqualsConfidenceTypeIN_CONFLICT() {
        /* Branches:
         * (appearedAtChainHeight < 0) : false
         * (confidenceType == this.confidenceType) : false  #  inside setConfidenceType method
         * (confidenceType != ConfidenceType.DEAD) : true  #  inside setConfidenceType method
         * (confidenceType == ConfidenceType.PENDING) : false  #  inside setConfidenceType method
         * (confidenceType == ConfidenceType.IN_CONFLICT) : false  #  inside setConfidenceType method
         */
        //Arrange Statement(s)
        TransactionConfidence target = new TransactionConfidence(sha256HashMock);
        //Act Statement(s)
        target.setAppearedAtChainHeight(1);
    }

    //Sapient generated method id: ${06ba285b-cf58-3295-aebd-cd8ce1b57257}
    @Test()
    public void setConfidenceTypeWhenConfidenceTypeEqualsThisConfidenceType() {
        /* Branches:
         * (confidenceType == this.confidenceType) : true
         */
        //Arrange Statement(s)
        TransactionConfidence target = new TransactionConfidence(sha256HashMock);
        //Act Statement(s)
        target.setConfidenceType(TransactionConfidence.ConfidenceType.UNKNOWN);
    }

    //Sapient generated method id: ${036f42f8-6926-3eee-81e4-011a9e033264}
    @Test()
    public void setConfidenceTypeWhenConfidenceTypeEqualsConfidenceTypeIN_CONFLICT() {
        /* Branches:
         * (confidenceType == this.confidenceType) : false
         * (confidenceType != ConfidenceType.DEAD) : true
         * (confidenceType == ConfidenceType.PENDING) : false
         * (confidenceType == ConfidenceType.IN_CONFLICT) : true
         */
        //Arrange Statement(s)
        TransactionConfidence target = new TransactionConfidence(sha256HashMock);
        //Act Statement(s)
        target.setConfidenceType(TransactionConfidence.ConfidenceType.IN_CONFLICT);
        //Assert statement(s)
        assertThat(target.getConfidenceType(), equalTo(TransactionConfidence.ConfidenceType.IN_CONFLICT));
    }

    //Sapient generated method id: ${41c19a0e-21cf-3402-9459-2395763fde82}
    @Ignore()
    @Test()
    public void markBroadcastByWhenBroadcastByNotAddIfAbsentAddress() {
        /* Branches:
         * (!broadcastBy.addIfAbsent(address)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class)) {
            //TODO: Needs to return real value
            timeUtils.when(() -> TimeUtils.currentTime()).thenReturn(null);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            TransactionConfidence target = new TransactionConfidence(sha256Hash);
            InetAddress inetAddress = InetAddress.getLoopbackAddress();
            PeerAddress peerAddress = PeerAddress.simple(inetAddress, 0);
            //Act Statement(s)
            boolean result = target.markBroadcastBy(peerAddress);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            timeUtils.verify(() -> TimeUtils.currentTime(), atLeast(1));
        }
    }

    //Sapient generated method id: ${493cfe2b-a3ee-3853-b879-0123136e72d2}
    @Ignore()
    @Test()
    public void markBroadcastByWhenGetConfidenceTypeEqualsConfidenceTypeUNKNOWN() {
        /* Branches:
         * (!broadcastBy.addIfAbsent(address)) : false
         * (getConfidenceType() == ConfidenceType.UNKNOWN) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class)) {
            //TODO: Needs to return real value
            timeUtils.when(() -> TimeUtils.currentTime()).thenReturn(null);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            TransactionConfidence target = new TransactionConfidence(sha256Hash);
            //Act Statement(s)
            boolean result = target.markBroadcastBy(peerAddressMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            assertThat(target.getConfidenceType(), equalTo(TransactionConfidence.ConfidenceType.PENDING));
            timeUtils.verify(() -> TimeUtils.currentTime(), atLeast(1));
        }
    }

    //Sapient generated method id: ${c4ba2c55-3bbc-3045-85e0-80423f48d1de}
    @Test()
    public void numBroadcastPeersTest() {
        //Arrange Statement(s)
        TransactionConfidence target = new TransactionConfidence(sha256HashMock);
        //Act Statement(s)
        int result = target.numBroadcastPeers();
        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${98dab606-30a0-3e94-b27b-95835262ab6c}
    @Test()
    public void getBroadcastByTest() {
        //Arrange Statement(s)
        TransactionConfidence target = new TransactionConfidence(sha256HashMock);
        //Act Statement(s)
        Set<PeerAddress> result = target.getBroadcastBy();
        //Assert statement(s)
        assertThat(result.size(), equalTo(0));
    }

    //Sapient generated method id: ${d5f25f48-a3ed-3405-bbeb-98682596ab62}
    @Test()
    public void wasBroadcastByTest() {
        //Arrange Statement(s)
        TransactionConfidence target = new TransactionConfidence(sha256HashMock);
        //Act Statement(s)
        boolean result = target.wasBroadcastBy(peerAddressMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${7204004c-f46b-3f7c-a610-a9d87e9bbaf2}
    @Test()
    public void lastBroadcastTimeTest() {
        //Arrange Statement(s)
        TransactionConfidence target = new TransactionConfidence(sha256HashMock);
        //Act Statement(s)
        Optional<Instant> result = target.lastBroadcastTime();
        Optional<Instant> instantOptional = Optional.empty();
        //Assert statement(s)
        assertThat(result, equalTo(instantOptional));
    }

    //Sapient generated method id: ${2ab4d696-9cdb-3a18-9284-b6aa8b07c95d}
    @Test()
    public void getLastBroadcastedAtWhenLastBroadcastTimeIsNull() {
        /* Branches:
         * (lastBroadcastTime != null) : false
         */
        //Arrange Statement(s)
        TransactionConfidence target = new TransactionConfidence(sha256HashMock);
        //Act Statement(s)
        Date result = target.getLastBroadcastedAt();
        //Assert statement(s)
        assertThat(result, is(nullValue()));
    }

    //Sapient generated method id: ${e7c4f700-2c72-3810-880c-ad7d32b90b43}
    @Test()
    public void setLastBroadcastTimeTest() {
        //Arrange Statement(s)
        TransactionConfidence target = new TransactionConfidence(sha256HashMock);
        Instant instant = Instant.now();
        //Act Statement(s)
        target.setLastBroadcastTime(instant);
    }

    //Sapient generated method id: ${9f883351-8fa2-31bc-8f53-c298d4cef5df}
    @Test()
    public void setLastBroadcastedAtTest() {
        //Arrange Statement(s)
        TransactionConfidence target = new TransactionConfidence(sha256HashMock);
        Date date = new Date();
        //Act Statement(s)
        target.setLastBroadcastedAt(date);
    }

    //Sapient generated method id: ${088d0cbd-4f55-390b-a46f-028b65b09c8f}
    @Test()
    public void toStringWhenSourceEqualsSourceUNKNOWN() {
        /* Branches:
         * (peers > 0) : false
         * (switch(getConfidenceType()) = UNKNOWN) : true
         * (source != Source.UNKNOWN) : false
         */
        //Arrange Statement(s)
        TransactionConfidence target = new TransactionConfidence(sha256HashMock);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("Unknown confidence level."));
    }

    //Sapient generated method id: ${0eac7e7c-6c40-3bb4-9a3d-b133ae4520c5}
    @Test()
    public void incrementDepthInBlocksTest() {
        //Arrange Statement(s)
        TransactionConfidence target = new TransactionConfidence(sha256HashMock);
        //Act Statement(s)
        int result = target.incrementDepthInBlocks();
        //Assert statement(s)
        assertThat(result, equalTo(1));
    }

    //Sapient generated method id: ${d513e405-d5cd-34ec-8a8c-fce99a9c176e}
    @Test()
    public void clearBroadcastByWhenGetConfidenceTypeNotEqualsConfidenceTypePENDING() {
        /* Branches:
         * (getConfidenceType() != ConfidenceType.PENDING) : true
         */
        //Arrange Statement(s)
        TransactionConfidence target = new TransactionConfidence(sha256HashMock);
        //Act Statement(s)
        target.clearBroadcastBy();
    }

    //Sapient generated method id: ${62d92383-2510-34ca-8654-e4dc8b8eb4a8}
    @Test()
    public void getOverridingTxIdWhenGetConfidenceTypeNotEqualsConfidenceTypeDEADThrowsIllegalStateException() {
        /* Branches:
         * (getConfidenceType() != ConfidenceType.DEAD) : true
         */
        //Arrange Statement(s)
        TransactionConfidence target = new TransactionConfidence(sha256HashMock);
        IllegalStateException illegalStateException = new IllegalStateException("Confidence type is UNKNOWN, not DEAD");
        thrown.expect(IllegalStateException.class);
        thrown.expectMessage(illegalStateException.getMessage());
        //Act Statement(s)
        target.getOverridingTxId();
    }

    //Sapient generated method id: ${2cdc3157-2062-3c7f-a17b-f51ddd1a30bc}
    @Test()
    public void setOverridingTransactionWhenConfidenceTypeNotEqualsConfidenceTypeIN_CONFLICT() {
        /* Branches:
         * (confidenceType == this.confidenceType) : false  #  inside setConfidenceType method
         * (confidenceType != ConfidenceType.DEAD) : false  #  inside setConfidenceType method
         * (confidenceType == ConfidenceType.PENDING) : false  #  inside setConfidenceType method
         * (confidenceType == ConfidenceType.IN_CONFLICT) : false  #  inside setConfidenceType method
         */
        //Arrange Statement(s)
        Transaction overridingTransactionMock = mock(Transaction.class);
        doReturn(sha256HashMock).when(overridingTransactionMock).getTxId();
        TransactionConfidence target = new TransactionConfidence(sha256HashMock2);
        //Act Statement(s)
        target.setOverridingTransaction(overridingTransactionMock);
        //Assert statement(s)
        verify(overridingTransactionMock).getTxId();
    }

    //Sapient generated method id: ${4c46c9c2-5826-3b52-a1a6-7c3fcc5f5977}
    @Test()
    public void setOverridingTxIdWhenConfidenceTypeNotEqualsConfidenceTypeIN_CONFLICT() {
        /* Branches:
         * (confidenceType == this.confidenceType) : false  #  inside setConfidenceType method
         * (confidenceType != ConfidenceType.DEAD) : false  #  inside setConfidenceType method
         * (confidenceType == ConfidenceType.PENDING) : false  #  inside setConfidenceType method
         * (confidenceType == ConfidenceType.IN_CONFLICT) : false  #  inside setConfidenceType method
         */
        //Arrange Statement(s)
        TransactionConfidence target = new TransactionConfidence(sha256HashMock);
        //Act Statement(s)
        target.setOverridingTxId(sha256HashMock2);
    }

    //Sapient generated method id: ${58212c05-0c08-317d-b2fb-ab0a548951e7}
    @Ignore()
    @Test()
    public void duplicateTest() {
        //Arrange Statement(s)
        TransactionConfidence target = new TransactionConfidence(sha256HashMock);
        //Act Statement(s)
        TransactionConfidence result = target.duplicate();
        TransactionConfidence transactionConfidence = new TransactionConfidence(sha256HashMock);
        transactionConfidence.setOverridingTxId((Sha256Hash) null);
        transactionConfidence.setConfidenceType(TransactionConfidence.ConfidenceType.UNKNOWN);
        transactionConfidence.setAppearedAtChainHeight(-1);
        //Assert statement(s)
        //TODO: Please implement equals method in TransactionConfidence for verification to succeed or you need to adjust respective assertion statements
        assertThat(result, equalTo(transactionConfidence));
    }

    //Sapient generated method id: ${368dd007-089c-3686-ad3a-9b314de20630}
    @Test()
    public void queueListenersWhenListenersIsEmpty() {
        /* Branches:
         * (for-each(listeners)) : false
         */
        //Arrange Statement(s)
        TransactionConfidence target = new TransactionConfidence(sha256HashMock);
        //Act Statement(s)
        target.queueListeners(TransactionConfidence.Listener.ChangeReason.TYPE);
    }

    //Sapient generated method id: ${6e988d75-af70-3975-895a-8e9d66265656}
    @Test()
    public void setSourceWhenThisSourceEqualsSourceUNKNOWN() {
        /* Branches:
         * (this.source == Source.UNKNOWN) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkState(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            TransactionConfidence target = new TransactionConfidence(sha256HashMock);
            //Act Statement(s)
            target.setSource(TransactionConfidence.Source.UNKNOWN);
            //Assert statement(s)
            assertThat(target.getSource(), equalTo(TransactionConfidence.Source.UNKNOWN));
            preconditions.verify(() -> Preconditions.checkState(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${51b7ea97-22d4-393c-8f43-9eb9d151fee2}
    @Test()
    public void maybeSetSourceToNetworkWhenSourceEqualsSourceUNKNOWN() {
        /* Branches:
         * (source == Source.UNKNOWN) : true
         */
        //Arrange Statement(s)
        TransactionConfidence target = new TransactionConfidence(sha256HashMock);
        //Act Statement(s)
        target.maybeSetSourceToNetwork();
        //Assert statement(s)
        assertThat(target.getSource(), equalTo(TransactionConfidence.Source.NETWORK));
    }

    //Sapient generated method id: ${c213faf2-f9aa-3f8d-b56e-6b29ea908a06}
    @Ignore(value = "Potential harmful system call (ListenableCompletableFuture.complete) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void getDepthFuture1WhenGetDepthInBlocksGreaterThanOrEqualsToDepth() {
        /* Branches:
         * (getDepthInBlocks() >= depth) : true  #  inside getDepthFuture method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TransactionConfidence target = spy(new TransactionConfidence(sha256HashMock));
        doNothing().when(target).addEventListener(eq((Executor) null), (TransactionConfidence.Listener) any());
        //Act Statement(s)
        ListenableCompletableFuture<TransactionConfidence> result = target.getDepthFuture(-1);
        ListenableCompletableFuture<TransactionConfidence> listenableCompletableFuture = new ListenableCompletableFuture<>();
        //Assert statement(s)
        //TODO: Please implement equals method in ListenableCompletableFuture for verification to succeed or you need to adjust respective assertion statements
        assertThat(result, equalTo(listenableCompletableFuture));
        verify(target).addEventListener(eq((Executor) null), (TransactionConfidence.Listener) any());
    }
}
