package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.utils.Threading;

import java.nio.ByteBuffer;

import org.bitcoinj.base.Sha256Hash;
import org.mockito.MockedStatic;

import java.util.concurrent.locks.ReentrantLock;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

public class TxConfidenceTableSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final TransactionConfidence.Factory confidenceFactoryMock = mock(TransactionConfidence.Factory.class, "confidenceFactory");

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    private final TransactionConfidence transactionConfidenceMock = mock(TransactionConfidence.class);

    //Sapient generated method id: ${e0f628a0-f995-3333-a61a-03a5a2a7ee43}, hash: 3A2FE7206496E81519B75F71EDF079B0
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

    //Sapient generated method id: ${33ee1772-af9b-332a-8aaf-1e44b29f63ea}, hash: 09AAEAF4AB23F2788391FA498D2C7818
    @Test()
    public void numBroadcastPeersWhenEntryIsNull() {
        /* Branches:
         * ((ref = referenceQueue.poll()) != null) : false  #  inside cleanTable method
         * (entry == null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: table
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TxConfidenceTable target = new TxConfidenceTable(0, confidenceFactoryMock);
        //Act Statement(s)
        int result = target.numBroadcastPeers(sha256HashMock);
        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${401ce33d-7342-39b9-b94b-3552b1f4cad8}, hash: 96AFA8C6AABFCA75D4FD644168E70037
    @Test()
    public void numBroadcastPeersWhenConfidenceIsNotNull() {
        /* Branches:
         * ((ref = referenceQueue.poll()) != null) : false  #  inside cleanTable method
         * (entry == null) : false
         * (confidence == null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: table
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TxConfidenceTable target = new TxConfidenceTable(0, confidenceFactoryMock);
        //Act Statement(s)
        int result = target.numBroadcastPeers(sha256HashMock);
        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${92ee855c-fac6-32c2-b81f-6bdb36bb975d}, hash: 5145DEFABF4512F4BD08EB62EE75DE69
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
        verify(transactionConfidenceMock, atLeast(1)).markBroadcastBy(peerAddressMock);
        verify(transactionConfidenceMock, atLeast(1)).queueListeners(TransactionConfidence.Listener.ChangeReason.SEEN_PEERS);
    }

    //Sapient generated method id: ${0ba63ce3-ce65-32f7-9aca-49e3508eaeb2}, hash: C2EA8F38C5F14830F0DF1FF7E02AE044
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
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            ReentrantLock reentrantLock = Threading.lock(TxConfidenceTable.class);
            threading.when(() -> Threading.lock(TxConfidenceTable.class)).thenReturn(reentrantLock);
            TxConfidenceTable target = new TxConfidenceTable(0, confidenceFactoryMock);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            //Act Statement(s)
            TransactionConfidence result = target.getOrCreate(sha256Hash);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            threading.verify(() -> Threading.lock(TxConfidenceTable.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${0612b96e-688d-399d-89cc-93535a129726}, hash: AA868D154DD3E3715C150BE7390F3697
    @Ignore()
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
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            ReentrantLock reentrantLock = Threading.lock(TxConfidenceTable.class);
            threading.when(() -> Threading.lock(TxConfidenceTable.class)).thenReturn(reentrantLock);
            TxConfidenceTable target = new TxConfidenceTable(0, confidenceFactoryMock);
            doReturn(transactionConfidenceMock).when(confidenceFactoryMock).createConfidence((Sha256Hash) any());
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            //Act Statement(s)
            TransactionConfidence result = target.getOrCreate(sha256Hash);
            //Assert statement(s)
            assertThat(result, equalTo(transactionConfidenceMock));
            threading.verify(() -> Threading.lock(TxConfidenceTable.class), atLeast(1));
            verify(confidenceFactoryMock).createConfidence((Sha256Hash) any());
        }
    }

    //Sapient generated method id: ${4d479f5c-8930-32ad-a59c-7acb1d6b6030}, hash: 31669B41779B7FFB8D5D2F4280CCA0C0
    @Ignore()
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
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            ReentrantLock reentrantLock = Threading.lock(TxConfidenceTable.class);
            threading.when(() -> Threading.lock(TxConfidenceTable.class)).thenReturn(reentrantLock);
            TxConfidenceTable target = new TxConfidenceTable(0, confidenceFactoryMock);
            doReturn(transactionConfidenceMock).when(confidenceFactoryMock).createConfidence((Sha256Hash) any());
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            //Act Statement(s)
            TransactionConfidence result = target.getOrCreate(sha256Hash);
            //Assert statement(s)
            assertThat(result, equalTo(transactionConfidenceMock));
            threading.verify(() -> Threading.lock(TxConfidenceTable.class), atLeast(1));
            verify(confidenceFactoryMock).createConfidence((Sha256Hash) any());
        }
    }

    //Sapient generated method id: ${b41355bd-04ce-314d-96dc-4fc8c8a6b5a4}, hash: B36DA27FFA19077DAA9327A4B7C8349A
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
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            ReentrantLock reentrantLock = Threading.lock(TxConfidenceTable.class);
            threading.when(() -> Threading.lock(TxConfidenceTable.class)).thenReturn(reentrantLock);
            TxConfidenceTable target = new TxConfidenceTable(0, confidenceFactoryMock);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            //Act Statement(s)
            TransactionConfidence result = target.get(sha256Hash);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            threading.verify(() -> Threading.lock(TxConfidenceTable.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${9f0bc527-6f06-32ef-9c0f-30f4d74475bb}, hash: C24C49F01A610ED23D4532F454B983A9
    @Ignore()
    @Test()
    public void getWhenRefIsNull() {
        /* Branches:
         * (ref != null) : false  #  inside getConfidence method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            ReentrantLock reentrantLock = Threading.lock(TxConfidenceTable.class);
            threading.when(() -> Threading.lock(TxConfidenceTable.class)).thenReturn(reentrantLock);
            TxConfidenceTable target = new TxConfidenceTable(0, confidenceFactoryMock);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            //Act Statement(s)
            TransactionConfidence result = target.get(sha256Hash);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            threading.verify(() -> Threading.lock(TxConfidenceTable.class), atLeast(1));
        }
    }
}
