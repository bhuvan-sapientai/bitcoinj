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
import org.bitcoinj.utils.Threading;
import org.mockito.MockedStatic;

import java.util.concurrent.locks.ReentrantLock;

import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import java.nio.ByteBuffer;

import static org.mockito.ArgumentMatchers.any;

public class TxConfidenceTableSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final TransactionConfidence.Factory confidenceFactoryMock = mock(TransactionConfidence.Factory.class, "{}");

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    private final TransactionConfidence transactionConfidenceMock = mock(TransactionConfidence.class);

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
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(TxConfidenceTable.class)).thenReturn(reentrantLock);
            TxConfidenceTable target = new TxConfidenceTable(10, confidenceFactoryMock);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            //Act Statement(s)
            TransactionConfidence result = target.getOrCreate(sha256Hash);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            threading.verify(() -> Threading.lock(TxConfidenceTable.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${0612b96e-688d-399d-89cc-93535a129726}
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
        TransactionConfidence transactionConfidenceMock = mock(TransactionConfidence.class);
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            ReentrantLock reentrantLock = Threading.lock(TxConfidenceTable.class);
            threading.when(() -> Threading.lock(TxConfidenceTable.class)).thenReturn(reentrantLock);
            TxConfidenceTable target = new TxConfidenceTable(0, confidenceFactoryMock);
            doReturn(transactionConfidenceMock).when(confidenceFactoryMock).createConfidence(sha256HashMock);
            //Act Statement(s)
            TransactionConfidence result = target.getOrCreate(sha256HashMock);
            //Assert statement(s)
            assertThat(result, equalTo(transactionConfidenceMock));
            threading.verify(() -> Threading.lock(TxConfidenceTable.class), atLeast(1));
            verify(confidenceFactoryMock).createConfidence(sha256HashMock);
        }
    }

    //Sapient generated method id: ${4d479f5c-8930-32ad-a59c-7acb1d6b6030}
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
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(TxConfidenceTable.class)).thenReturn(reentrantLock);
            TxConfidenceTable target = new TxConfidenceTable(10, confidenceFactoryMock);
            TransactionConfidence transactionConfidence = new TransactionConfidence(sha256HashMock);
            doReturn(transactionConfidence).when(confidenceFactoryMock).createConfidence((Sha256Hash) any());
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            //Act Statement(s)
            TransactionConfidence result = target.getOrCreate(sha256Hash);
            //Assert statement(s)
            assertThat(result, equalTo(transactionConfidence));
            threading.verify(() -> Threading.lock(TxConfidenceTable.class), atLeast(1));
            verify(confidenceFactoryMock).createConfidence((Sha256Hash) any());
        }
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
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(TxConfidenceTable.class)).thenReturn(reentrantLock);
            TxConfidenceTable target = new TxConfidenceTable(0, confidenceFactoryMock);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            //Act Statement(s)
            TransactionConfidence result = target.get(sha256Hash);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            threading.verify(() -> Threading.lock(TxConfidenceTable.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${9f0bc527-6f06-32ef-9c0f-30f4d74475bb}
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
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(TxConfidenceTable.class)).thenReturn(reentrantLock);
            TxConfidenceTable target = new TxConfidenceTable(10, confidenceFactoryMock);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            //Act Statement(s)
            TransactionConfidence result = target.get(sha256Hash);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            threading.verify(() -> Threading.lock(TxConfidenceTable.class), atLeast(1));
        }
    }
}
