package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.base.Sha256Hash;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class TxConfidenceTableSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final TransactionConfidence.Factory confidenceFactoryMock = mock(TransactionConfidence.Factory.class, "confidenceFactory");

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    private final TransactionConfidence transactionConfidenceMock = mock(TransactionConfidence.class);

    //Sapient generated method id: ${e0f628a0-f995-3333-a61a-03a5a2a7ee43}
    @Test()
    public void getConfidenceTest() {
        //Arrange Statement(s)
        TxConfidenceTable target = new TxConfidenceTable(0, confidenceFactoryMock);
        Transaction txMock = mock(Transaction.class);
        doReturn(transactionConfidenceMock).when(txMock).getConfidence(target);
        //Act Statement(s)
        TransactionConfidence result = target.getConfidence(txMock);
        //Assert statement(s)
        assertThat(result, equalTo(transactionConfidenceMock));
        verify(txMock).getConfidence(target);
    }

    //Sapient generated method id: ${33ee1772-af9b-332a-8aaf-1e44b29f63ea}
    @Test()
    public void numBroadcastPeersWhenEntryIsNull() {
        /* Branches:
         * ((ref = referenceQueue.poll()) != null) : false  #  inside cleanTable method
         * (entry == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TxConfidenceTable target = new TxConfidenceTable(0, confidenceFactoryMock);
        //Act Statement(s)
        int result = target.numBroadcastPeers(sha256HashMock);
        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${401ce33d-7342-39b9-b94b-3552b1f4cad8}
    @Test()
    public void numBroadcastPeersWhenConfidenceIsNotNull() {
        /* Branches:
         * ((ref = referenceQueue.poll()) != null) : false  #  inside cleanTable method
         * (entry == null) : false
         * (confidence == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TxConfidenceTable target = new TxConfidenceTable(0, confidenceFactoryMock);
        //Act Statement(s)
        int result = target.numBroadcastPeers(sha256HashMock);
        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${92ee855c-fac6-32c2-b81f-6bdb36bb975d}
    @Test()
    public void seenWhenFresh() {
        /* Branches:
         * ((ref = referenceQueue.poll()) != null) : false  #  inside cleanTable method
         * (fresh) : true
         */
        //Arrange Statement(s)
        TxConfidenceTable target = spy(new TxConfidenceTable(0, confidenceFactoryMock));
        doReturn(transactionConfidenceMock).when(target).getOrCreate(sha256HashMock);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        doReturn(true).when(transactionConfidenceMock).markBroadcastBy(peerAddressMock);
        doNothing().when(transactionConfidenceMock).queueListeners(TransactionConfidence.Listener.ChangeReason.SEEN_PEERS);
        //Act Statement(s)
        TransactionConfidence result = target.seen(sha256HashMock, peerAddressMock);
        //Assert statement(s)
        assertThat(result, equalTo(transactionConfidenceMock));
        verify(target).getOrCreate(sha256HashMock);
        verify(transactionConfidenceMock).markBroadcastBy(peerAddressMock);
        verify(transactionConfidenceMock).queueListeners(TransactionConfidence.Listener.ChangeReason.SEEN_PEERS);
    }

    //Sapient generated method id: ${0ba63ce3-ce65-32f7-9aca-49e3508eaeb2}
    @Ignore()
    @Test()
    public void getOrCreateWhenConfidenceIsNotNull() {
        /* Branches:
         * (ref != null) : true  #  inside getConfidence method
         * (confidence != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TxConfidenceTable target = new TxConfidenceTable(0, confidenceFactoryMock);
        //Act Statement(s)
        TransactionConfidence result = target.getOrCreate(sha256HashMock);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${0612b96e-688d-399d-89cc-93535a129726}
    @Test()
    public void getOrCreateWhenConfidenceIsNull() {
        /* Branches:
         * (ref != null) : true  #  inside getConfidence method
         * (confidence != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TxConfidenceTable target = new TxConfidenceTable(0, confidenceFactoryMock);
        doReturn(transactionConfidenceMock).when(confidenceFactoryMock).createConfidence(sha256HashMock);
        //Act Statement(s)
        TransactionConfidence result = target.getOrCreate(sha256HashMock);
        //Assert statement(s)
        assertThat(result, equalTo(transactionConfidenceMock));
        verify(confidenceFactoryMock).createConfidence(sha256HashMock);
    }

    //Sapient generated method id: ${4d479f5c-8930-32ad-a59c-7acb1d6b6030}
    @Test()
    public void getOrCreateWhenRefIsNullAndConfidenceIsNull() {
        /* Branches:
         * (ref != null) : false  #  inside getConfidence method
         * (confidence != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TxConfidenceTable target = new TxConfidenceTable(0, confidenceFactoryMock);
        doReturn(transactionConfidenceMock).when(confidenceFactoryMock).createConfidence(sha256HashMock);
        //Act Statement(s)
        TransactionConfidence result = target.getOrCreate(sha256HashMock);
        //Assert statement(s)
        assertThat(result, equalTo(transactionConfidenceMock));
        verify(confidenceFactoryMock).createConfidence(sha256HashMock);
    }

    //Sapient generated method id: ${b41355bd-04ce-314d-96dc-4fc8c8a6b5a4}
    @Ignore()
    @Test()
    public void getWhenRefIsNotNull() {
        /* Branches:
         * (ref != null) : true  #  inside getConfidence method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TxConfidenceTable target = new TxConfidenceTable(0, confidenceFactoryMock);
        //Act Statement(s)
        TransactionConfidence result = target.get(sha256HashMock);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${9f0bc527-6f06-32ef-9c0f-30f4d74475bb}
    @Test()
    public void getWhenRefIsNull() {
        /* Branches:
         * (ref != null) : false  #  inside getConfidence method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TxConfidenceTable target = new TxConfidenceTable(0, confidenceFactoryMock);
        //Act Statement(s)
        TransactionConfidence result = target.get(sha256HashMock);
        //Assert statement(s)
        assertThat(result, is(nullValue()));
    }
}
