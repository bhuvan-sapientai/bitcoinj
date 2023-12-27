package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.nio.BufferUnderflowException;
import java.io.IOException;

import org.bitcoinj.script.ScriptException;
import org.bitcoinj.base.Network;
import org.bitcoinj.crypto.ECKey;

import java.math.BigInteger;

import org.bitcoinj.base.Coin;
import org.bitcoinj.base.internal.ByteUtils;

import java.util.ArrayList;

import org.bitcoinj.script.Script;
import org.bitcoinj.base.Address;
import org.mockito.stubbing.Answer;
import org.bitcoinj.base.internal.Preconditions;
import org.bitcoinj.base.Sha256Hash;

import java.time.Instant;

import org.junit.rules.ExpectedException;

import java.util.List;
import java.util.Date;
import java.util.Map;
import java.util.Optional;

import org.bitcoinj.base.internal.TimeUtils;

import java.nio.ByteBuffer;
import java.io.OutputStream;
import java.util.function.Supplier;

import org.mockito.MockedStatic;

import java.io.ByteArrayOutputStream;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.isA;

import org.junit.Ignore;
import org.bitcoinj.base.VarInt;

public class TransactionSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final AbstractBlockChain abstractBlockChainMock = mock(AbstractBlockChain.class, "{}");

    private final AbstractBlockChain chainMock = mock(AbstractBlockChain.class);

    private final Coin coinMock = mock(Coin.class, "1000000");

    private final Coin coinMock2 = mock(Coin.class);

    private final Coin coinMock3 = mock(Coin.class);

    private final Coin coinMock4 = mock(Coin.class);

    private final Coin coinMock5 = mock(Coin.class);

    private final Context contextMock = mock(Context.class);

    private final ECKey eCKeyMock = mock(ECKey.class);

    private final LockTime.HeightLock lockTimeHeightLockMock = mock(LockTime.HeightLock.class, "toString_lockTime1");

    private final LockTime lockTimeMock = mock(LockTime.class);

    private final Network networkMock = mock(Network.class, "{}");

    private final NetworkParameters networkParametersMock = mock(NetworkParameters.class);

    private final Script scriptMock = mock(Script.class);

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);

    private final TransactionBag transactionBagMock = mock(TransactionBag.class, "{}");

    private final TransactionConfidence transactionConfidenceMock = mock(TransactionConfidence.class);

    private final TransactionInput transactionInputMock = mock(TransactionInput.class);

    private final Transaction transactionMock = mock(Transaction.class);

    private final TransactionOutPoint transactionOutPointMock = mock(TransactionOutPoint.class);

    private final TransactionOutput transactionOutputMock = mock(TransactionOutput.class);

    private final Transaction txMock = mock(Transaction.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    private final Coin coinMock6 = mock(Coin.class);

    private final Coin coinMock7 = mock(Coin.class);

    private final Coin valueMock = mock(Coin.class);

    private final IOException iOExceptionMock = mock(IOException.class);

    //Sapient generated method id: ${18d8e2c4-9760-3f0d-a105-a71337f77d94}
    @Test()
    public void coinbase1Test() {
        //Arrange Statement(s)
        /*try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
    LockTime lockTime2 = LockTime.unset();
    lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
    byte[] byteArray = new byte[] { (byte) 1, (byte) 2, (byte) 3 };
    //Act Statement(s)
    Transaction result = Transaction.coinbase(byteArray);
    Transaction transaction = new Transaction();
    //Assert statement(s)
    assertThat(result, equalTo(transaction));
    lockTime.verify(() -> LockTime.unset(), atLeast(1));
}*/
    }

    //Sapient generated method id: ${db344e3b-696d-3b02-8e35-1aaa5300bde6}
    @Test()
    public void readTest() throws BufferUnderflowException, ProtocolException {
        //Arrange Statement(s)
        Transaction transactionMock = mock(Transaction.class);
        try (MockedStatic<Transaction> transaction = mockStatic(Transaction.class, CALLS_REAL_METHODS)) {
            transaction.when(() -> Transaction.read((ByteBuffer) any(), eq(70013))).thenReturn(transactionMock);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            Transaction result = Transaction.read(byteBuffer);
            //Assert statement(s)
            assertThat(result, equalTo(transactionMock));
            transaction.verify(() -> Transaction.read((ByteBuffer) any(), eq(70013)), atLeast(1));
        }
    }

    //Sapient generated method id: ${70efcec2-450a-39b4-a85c-220ca0c1dffb}
    @Ignore()
    @Test()
    public void read1WhenTxHasWitnessesAndFlagsEquals0() throws BufferUnderflowException, ProtocolException {
        /* Branches:
         * ((protocolVersion & SERIALIZE_TRANSACTION_NO_WITNESS) == 0) : true  #  inside allowWitness method
         * (protocolVersion >= WITNESS_VERSION.intValue()) : true  #  inside allowWitness method
         * (tx.inputs.size() == 0) : true
         * (allowWitness) : true
         * (flags != 0) : true
         * ((flags & 1) != 0) : true
         * (allowWitness) : true
         * (!tx.hasWitnesses()) : false
         * (flags != 0) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: tx
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
    byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(0L);
    thrown.expect(ProtocolException.class);
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    //Act Statement(s)
    Transaction.read(byteBuffer, 1073741825);
    //Assert statement(s)
    byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()));
}*/
    }

    //Sapient generated method id: ${70064fbe-1600-3eb5-a297-6246e2eb55ed}
    @Test()
    public void getTxIdTest() throws IOException {
        //Arrange Statement(s)
        /*try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class);
    MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
    LockTime lockTime2 = LockTime.of(0L);
    lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
    byte[] byteArray = new byte[] {};
    byte[] byteArray2 = new byte[] {};
    sha256Hash.when(() -> Sha256Hash.hashTwice(byteArray2)).thenReturn(byteArray);
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer);
    sha256Hash.when(() -> Sha256Hash.wrapReversed(byteArray)).thenReturn(sha256Hash2);
    NetworkParameters networkParameters = NetworkParameters.fromID("id1");
    Transaction target = spy(new Transaction(networkParameters));
    doNothing().when(target).bitcoinSerializeToStream((ByteArrayOutputStream) any(), eq(false));
    //Act Statement(s)
    Sha256Hash result = target.getTxId();
    //Assert statement(s)
    assertThat(result, equalTo(sha256Hash2));
    lockTime.verify(() -> LockTime.unset(), atLeast(1));
    sha256Hash.verify(() -> Sha256Hash.hashTwice(byteArray2), atLeast(1));
    sha256Hash.verify(() -> Sha256Hash.wrapReversed(byteArray), atLeast(1));
    verify(target).bitcoinSerializeToStream((ByteArrayOutputStream) any(), eq(false));
}*/
    }

    //Sapient generated method id: ${634f7b11-d7c0-3128-b104-bcd25286ff5f}
    @Test()
    public void getTxIdWhenCaughtIOExceptionThrowsRuntimeException() throws IOException {
        /* Branches:
         * (catch-exception (IOException)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = spy(new Transaction(networkParameters));
            doThrow(iOExceptionMock).when(target).bitcoinSerializeToStream((ByteArrayOutputStream) any(), eq(false));
            thrown.expect(RuntimeException.class);
            thrown.expectCause(isA(IOException.class));
            //Act Statement(s)
            target.getTxId();
            //Assert statement(s)
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
            verify(target).bitcoinSerializeToStream((ByteArrayOutputStream) any(), eq(false));
        }
    }

    //Sapient generated method id: ${7da74dc5-104e-32c3-9c84-d79184403010}
    @Test()
    public void getWTxIdTest() throws IOException {
        //Arrange Statement(s)
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class);
             MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.hashTwice(byteArray2)).thenReturn(byteArray);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer);
            sha256Hash.when(() -> Sha256Hash.wrapReversed(byteArray)).thenReturn(sha256Hash2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = spy(new Transaction(networkParameters));
            doReturn(false).when(target).hasWitnesses();
            doNothing().when(target).bitcoinSerializeToStream((ByteArrayOutputStream) any(), eq(false));
            //Act Statement(s)
            Sha256Hash result = target.getWTxId();
            //Assert statement(s)
            assertThat(result, equalTo(sha256Hash2));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
            sha256Hash.verify(() -> Sha256Hash.hashTwice(byteArray2), atLeast(1));
            sha256Hash.verify(() -> Sha256Hash.wrapReversed(byteArray), atLeast(1));
            verify(target).hasWitnesses();
            verify(target).bitcoinSerializeToStream((ByteArrayOutputStream) any(), eq(false));
        }
    }

    //Sapient generated method id: ${8d0dd178-30a5-3901-8d72-92bdc3dc24c0}
    @Test()
    public void getWTxIdWhenCaughtIOExceptionThrowsRuntimeException() throws IOException {
        /* Branches:
         * (catch-exception (IOException)) : true
         */
        //Arrange Statement(s)
        /*try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
    LockTime lockTime2 = LockTime.of(0L);
    lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
    NetworkParameters networkParameters = NetworkParameters.fromID("id1");
    Transaction target = spy(new Transaction(networkParameters));
    doReturn(false).when(target).hasWitnesses();
    doThrow(iOExceptionMock).when(target).bitcoinSerializeToStream((ByteArrayOutputStream) any(), eq(false));
    thrown.expect(RuntimeException.class);
    thrown.expectCause(isA(IOException.class));
    //Act Statement(s)
    target.getWTxId();
    //Assert statement(s)
    lockTime.verify(() -> LockTime.unset(), atLeast(1));
    verify(target).hasWitnesses();
    verify(target).bitcoinSerializeToStream((ByteArrayOutputStream) any(), eq(false));
}*/
    }

    //Sapient generated method id: ${3259c157-b0ca-3db1-a45b-037796bc0614}
    @Test()
    public void getWeightWhenHasWitnessesNot() throws Throwable, IOException {
        /* Branches:
         * (!hasWitnesses()) : true
         */
        //Arrange Statement(s)
        /*try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
    LockTime lockTime2 = LockTime.of(0L);
    lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
    NetworkParameters networkParameters = NetworkParameters.fromID("id1");
    Transaction target = spy(new Transaction(networkParameters));
    doReturn(false).when(target).hasWitnesses();
    doReturn(1).when(target).messageSize();
    //Act Statement(s)
    int result = target.getWeight();
    //Assert statement(s)
    assertThat(result, equalTo(4));
    lockTime.verify(() -> LockTime.unset(), atLeast(1));
    verify(target).hasWitnesses();
    verify(target).messageSize();
}*/
    }

    //Sapient generated method id: ${f0aa877f-379a-313b-a38b-6e84f7bde114}
    @Test()
    public void getWeightWhenHasWitnesses() throws Throwable, IOException {
        /* Branches:
         * (!hasWitnesses()) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = spy(new Transaction(networkParameters));
            doReturn(true).when(target).hasWitnesses();
            doNothing().when(target).bitcoinSerializeToStream((ByteArrayOutputStream) any(), eq(false));
            doNothing().when(target).bitcoinSerializeToStream((ByteArrayOutputStream) any(), eq(true));
            //Act Statement(s)
            int result = target.getWeight();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
            verify(target).hasWitnesses();
            verify(target).bitcoinSerializeToStream((ByteArrayOutputStream) any(), eq(false));
            verify(target).bitcoinSerializeToStream((ByteArrayOutputStream) any(), eq(true));
        }
    }

    //Sapient generated method id: ${95887f29-e162-3eaa-b55a-6c10aba946b6}
    @Ignore()
    @Test()
    public void getWeightWhenDefaultBranchThrowsThrowable() throws IOException {
        /* Branches:
         * (!hasWitnesses()) : false
         * (branch expression (line 372)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
    LockTime lockTime2 = LockTime.of(0L);
    lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
    NetworkParameters networkParameters = NetworkParameters.fromID("id1");
    Transaction target = spy(new Transaction(networkParameters));
    doReturn(true).when(target).hasWitnesses();
    doNothing().when(target).bitcoinSerializeToStream((ByteArrayOutputStream) any(), eq(false));
    doNothing().when(target).bitcoinSerializeToStream((ByteArrayOutputStream) any(), eq(true));
    thrown.expect(Throwable.class);
    //Act Statement(s)
    target.getWeight();
    //Assert statement(s)
    lockTime.verify(() -> LockTime.unset(), atLeast(1));
    verify(target).hasWitnesses();
    verify(target).bitcoinSerializeToStream((ByteArrayOutputStream) any(), eq(false));
    verify(target).bitcoinSerializeToStream((ByteArrayOutputStream) any(), eq(true));
}*/
    }

    //Sapient generated method id: ${5195c0d0-e6d6-3ddb-935d-e50b37af56ca}
    @Test()
    public void getWeightWhenCaughtIOExceptionThrowsRuntimeException() throws IOException {
        /* Branches:
         * (!hasWitnesses()) : false
         * (catch-exception (IOException)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = spy(new Transaction(networkParameters));
            doReturn(true).when(target).hasWitnesses();
            doThrow(iOExceptionMock).when(target).bitcoinSerializeToStream((ByteArrayOutputStream) any(), eq(false));
            doNothing().when(target).bitcoinSerializeToStream((ByteArrayOutputStream) any(), eq(true));
            thrown.expect(RuntimeException.class);
            thrown.expectCause(isA(IOException.class));
            //Act Statement(s)
            target.getWeight();
            //Assert statement(s)
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
            verify(target).hasWitnesses();
            verify(target).bitcoinSerializeToStream((ByteArrayOutputStream) any(), eq(false));
            verify(target).bitcoinSerializeToStream((ByteArrayOutputStream) any(), eq(true));
        }
    }

    //Sapient generated method id: ${2f8ea1fc-5459-337b-bdf1-33c10af6c373}
    @Test()
    public void getVsizeWhenHasWitnessesNot() throws Throwable, IOException {
        /* Branches:
         * (!hasWitnesses()) : true
         */
        //Arrange Statement(s)
        /*try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
    LockTime lockTime2 = LockTime.of(0L);
    lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
    NetworkParameters networkParameters = NetworkParameters.fromID("id1");
    Transaction target = spy(new Transaction(networkParameters));
    doReturn(false).when(target).hasWitnesses();
    doReturn(0).when(target).messageSize();
    //Act Statement(s)
    int result = target.getVsize();
    //Assert statement(s)
    assertThat(result, equalTo(0));
    lockTime.verify(() -> LockTime.unset(), atLeast(1));
    verify(target).hasWitnesses();
    verify(target).messageSize();
}*/
    }

    //Sapient generated method id: ${069aaf29-0798-3f58-a130-d738e4411129}
    @Test()
    public void getVsizeWhenHasWitnesses() throws Throwable, IOException {
        /* Branches:
         * (!hasWitnesses()) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = spy(new Transaction(networkParameters));
            doReturn(true).when(target).hasWitnesses();
            doReturn(1).when(target).getWeight();
            //Act Statement(s)
            int result = target.getVsize();
            //Assert statement(s)
            assertThat(result, equalTo(1));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
            verify(target).hasWitnesses();
            verify(target).getWeight();
        }
    }

    //Sapient generated method id: ${50dbb77c-63e0-34bb-8dfc-b0e28c2b83ce}
    @Test()
    public void getInputSumTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = new Transaction(networkParameters);
            //Act Statement(s)
            Coin result = target.getInputSum();
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
        }
    }

    //Sapient generated method id: ${b6dd36aa-dc4b-37a1-aee3-0aea643da204}
    @Test()
    public void getValueSentToMeWhenOutputsIsEmpty() {
        /* Branches:
         * (for-each(outputs)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = new Transaction(networkParameters);
            //Act Statement(s)
            Coin result = target.getValueSentToMe(transactionBagMock);
            Coin coin = Coin.ZERO;
            //Assert statement(s)
            assertThat(result, equalTo(coin));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
        }
    }

    //Sapient generated method id: ${b8e00296-6f8e-3eca-b867-306b6a31931f}
    @Test()
    public void getAppearsInHashesWhenAppearsInHashesIsNull() {
        /* Branches:
         * (appearsInHashes != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = new Transaction(networkParameters);
            //Act Statement(s)
            Map<Sha256Hash, Integer> result = target.getAppearsInHashes();
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
        }
    }

    //Sapient generated method id: ${0f2bbef0-f1f9-3dde-8f4c-c7e4ee5c6159}
    @Test()
    public void isPendingWhenGetConfidenceGetConfidenceTypeEqualsTransactionConfidenceConfidenceTypePENDING() throws IOException {
        /* Branches:
         * (getConfidence().getConfidenceType() == TransactionConfidence.ConfidenceType.PENDING) : true
         */
        //Arrange Statement(s)
        /*try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
    LockTime lockTime2 = LockTime.unset();
    lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
    NetworkParameters networkParameters = NetworkParameters.fromID("id1");
    Transaction target = spy(new Transaction(networkParameters));
    TransactionConfidence transactionConfidence = new TransactionConfidence(sha256HashMock);
    transactionConfidence.setConfidenceType(TransactionConfidence.ConfidenceType.PENDING);
    doReturn(transactionConfidence).when(target).getConfidence();
    //Act Statement(s)
    boolean result = target.isPending();
    //Assert statement(s)
    assertThat(result, equalTo(Boolean.TRUE));
    lockTime.verify(() -> LockTime.unset(), atLeast(1));
    verify(target).getConfidence();
}*/
    }

    //Sapient generated method id: ${1279a156-d28b-3b18-a12a-5354eaf54861}
    @Test()
    public void isPendingWhenGetConfidenceGetConfidenceTypeNotEqualsTransactionConfidenceConfidenceTypePENDING() throws IOException {
        /* Branches:
         * (getConfidence().getConfidenceType() == TransactionConfidence.ConfidenceType.PENDING) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = spy(new Transaction(networkParameters));
            TransactionConfidence transactionConfidence = new TransactionConfidence(sha256HashMock);
            transactionConfidence.setConfidenceType(TransactionConfidence.ConfidenceType.UNKNOWN);
            doReturn(transactionConfidence).when(target).getConfidence();
            //Act Statement(s)
            boolean result = target.isPending();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
            verify(target).getConfidence();
        }
    }

    //Sapient generated method id: ${700efa95-5b61-3284-bb79-ee1d2f6cff55}
    @Test()
    public void setBlockAppearanceWhenBestChain() throws IOException {
        // Branches:         * (bestChain) : true         * (updateTime == null) : true         * (bestChain) : true
        /*try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
    Instant instant = Instant.now();
    doReturn(instant).when(blockMock).time();
    doReturn(null).when(blockMock).getHash();
    LockTime lockTime2 = LockTime.unset();
    lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
    NetworkParameters networkParameters = NetworkParameters.fromID("id1");
    Transaction target = spy(new Transaction(networkParameters));
    doNothing().when(target).addBlockAppearance((Sha256Hash) null, 0);
    TransactionConfidence transactionConfidence = new TransactionConfidence(sha256HashMock);
    transactionConfidence.setAppearedAtChainHeight(1);
    doReturn(transactionConfidence).when(target).getConfidence();
    StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 1);
    //Act Statement(s)
    target.setBlockAppearance(storedBlock, true, 0);
    //Assert statement(s)
    verify(blockMock).time();
    verify(blockMock).getHash();
    lockTime.verify(() -> LockTime.unset(), atLeast(1));
    verify(target).addBlockAppearance((Sha256Hash) null, 0);
    verify(target).getConfidence();
}*/
    }

    //Sapient generated method id: ${77b654fd-34bd-3f3b-a273-d2ed74e9be0c}
    @Ignore()
    @Test()
    public void addBlockAppearanceWhenAppearsInHashesIsNull() {
        /* Branches:
         * (appearsInHashes == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = new Transaction(networkParameters);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            //Act Statement(s)
            target.addBlockAppearance(sha256Hash, 5);
            //Assert statement(s)
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
        }
    }

    //Sapient generated method id: ${8adc3bcb-b613-3091-adba-9d3700d51cca}
    @Test()
    public void getValueSentFromMeWhenInputsIsEmpty() throws ScriptException {
        /* Branches:
         * (for-each(inputs)) : false
         */
        //Arrange Statement(s)
        TransactionBag transactionBagMock = mock(TransactionBag.class, "[]");
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = new Transaction(networkParameters);
            //Act Statement(s)
            Coin result = target.getValueSentFromMe(transactionBagMock);
            Coin coin = Coin.ZERO;
            //Assert statement(s)
            assertThat(result, equalTo(coin));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
        }
    }

    //Sapient generated method id: ${21e03b1c-0c70-3bfc-945c-9e6e7e89523a}
    @Test()
    public void getOutputSumTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
    LockTime lockTime2 = LockTime.of(0L);
    lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
    NetworkParameters networkParameters = NetworkParameters.fromID("id1");
    Transaction target = new Transaction(networkParameters);
    //Act Statement(s)
    Coin result = target.getOutputSum();
    //Assert statement(s)
    assertThat(result, is(notNullValue()));
    lockTime.verify(() -> LockTime.unset(), atLeast(1));
}*/
    }

    //Sapient generated method id: ${b0d20fa9-e250-397e-b581-b3faccc5922b}
    @Test()
    public void getValueTest() throws ScriptException {
        //Arrange Statement(s)
        //Coin coinMock = mock(Coin.class);
        /*try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
    LockTime lockTime2 = LockTime.of(0L);
    lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
    NetworkParameters networkParameters = NetworkParameters.fromID("id1");
    Transaction target = spy(new Transaction(networkParameters));
    doReturn(coinMock).when(target).getValueSentToMe(transactionBagMock);
    Coin coin = Coin.valueOf(0L);
    doReturn(coin).when(coinMock).subtract(coinMock2);
    doReturn(coinMock2).when(target).getValueSentFromMe(transactionBagMock);
    //Act Statement(s)
    Coin result = target.getValue(transactionBagMock);
    //Assert statement(s)
    assertThat(result, equalTo(coin));
    lockTime.verify(() -> LockTime.unset(), atLeast(1));
    verify(target).getValueSentToMe(transactionBagMock);
    verify(coinMock).subtract(coinMock2);
    verify(target).getValueSentFromMe(transactionBagMock);
}*/
    }

    //Sapient generated method id: ${03f64635-e652-313d-94a5-e7a65907a010}
    @Test()
    public void getFeeWhenInputsIsEmpty() {
        /* Branches:
         * (inputs.isEmpty()) : true
         */
        //Arrange Statement(s)
        /*try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
    LockTime lockTime2 = LockTime.unset();
    lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
    Transaction target = new Transaction(networkParametersMock);
    //Act Statement(s)
    Coin result = target.getFee();
    //Assert statement(s)
    assertThat(result, is(nullValue()));
    lockTime.verify(() -> LockTime.unset(), atLeast(1));
}*/
    }

    //Sapient generated method id: ${fa93ce72-be3a-30cd-a43d-7914f9aa06ec}
    @Test()
    public void isAnyOutputSpentWhenOutputsIsEmpty() {
        /* Branches:
         * (for-each(outputs)) : false
         */
        //Arrange Statement(s)
        /*try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
    LockTime lockTime2 = LockTime.of(0L);
    lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
    NetworkParameters networkParameters = NetworkParameters.fromID("id1");
    Transaction target = new Transaction(networkParameters);
    //Act Statement(s)
    boolean result = target.isAnyOutputSpent();
    //Assert statement(s)
    assertThat(result, equalTo(Boolean.FALSE));
    lockTime.verify(() -> LockTime.unset(), atLeast(1));
}*/
    }

    //Sapient generated method id: ${086f8051-19bc-3d5b-867b-c4b4e8d65246}
    @Test()
    public void isEveryOwnedOutputSpentWhenOutputsIsEmpty() {
        /* Branches:
         * (for-each(outputs)) : false
         */
        //Arrange Statement(s)
        /*try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
    LockTime lockTime2 = LockTime.of(0L);
    lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
    NetworkParameters networkParameters = NetworkParameters.fromID("id1");
    Transaction target = new Transaction(networkParameters);
    //Act Statement(s)
    boolean result = target.isEveryOwnedOutputSpent(transactionBagMock);
    //Assert statement(s)
    assertThat(result, equalTo(Boolean.TRUE));
    lockTime.verify(() -> LockTime.unset(), atLeast(1));
}*/
    }

    //Sapient generated method id: ${e9bfdd36-2450-3fcf-acd3-621fc4aca48a}
    @Test()
    public void updateTimeTest() {
        //Arrange Statement(s)
        /*try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
    LockTime lockTime2 = LockTime.of(0L);
    lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
    NetworkParameters networkParameters = NetworkParameters.fromID("id1");
    Transaction target = new Transaction(networkParameters);
    //Act Statement(s)
    Optional<Instant> result = target.updateTime();
    Optional<Instant> instantOptional = Optional.empty();
    //Assert statement(s)
    assertThat(result, equalTo(instantOptional));
    lockTime.verify(() -> LockTime.unset(), atLeast(1));
}*/
    }

    //Sapient generated method id: ${cd95d6c4-8aad-3774-a7da-b341d653ceb4}
    @Test()
    public void getUpdateTimeTest() {
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = new Transaction(networkParameters);
            //Act Statement(s)
            Date result = target.getUpdateTime();
            Optional<Instant> instantOptional = Optional.empty();
            Instant instant2 = Instant.EPOCH;
            Instant instant = (Instant) instantOptional.orElse(instant2);
            Date date = Date.from(instant);
            //Assert statement(s)
            assertThat(result, equalTo(date));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
        }
    }

    //Sapient generated method id: ${1429f86f-2ba5-352c-945c-da676a2c462d}
    @Test()
    public void setUpdateTimeTest() {
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = new Transaction(networkParameters);
            Instant instant = Instant.now();
            //Act Statement(s)
            target.setUpdateTime(instant);
            //Assert statement(s)
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
        }
    }

    //Sapient generated method id: ${6df2b9d9-5be1-3a7f-bce7-1cbb29778064}
    @Test()
    public void clearUpdateTimeTest() {
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = new Transaction(networkParameters);
            //Act Statement(s)
            target.clearUpdateTime();
            //Assert statement(s)
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
        }
    }

    //Sapient generated method id: ${e392985a-1d96-3a8e-8cca-737e541c5b93}
    @Test()
    public void setUpdateTime1WhenUpdateTimeGetTimeGreaterThan0() {
        /* Branches:
         * (updateTime != null) : true
         * (updateTime.getTime() > 0) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.unset();
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = new Transaction(networkParameters);
            Date date = new Date();
            //Act Statement(s)
            target.setUpdateTime(date);
            //Assert statement(s)
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
        }
    }

    //Sapient generated method id: ${b6013fdd-a037-3352-8753-22b3712113c2}
    @Test()
    public void setUpdateTime1WhenUpdateTimeGetTimeNotGreaterThan0() {
        /* Branches:
         * (updateTime != null) : true
         * (updateTime.getTime() > 0) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = new Transaction(networkParameters);
            Date date = new Date();
            //Act Statement(s)
            target.setUpdateTime(date);
            //Assert statement(s)
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
        }
    }

    //Sapient generated method id: ${7f27a211-a1fa-32ad-acad-9ca68dcca6db}
    @Test()
    public void hasWitnessesTest() {
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = new Transaction(networkParameters);
            //Act Statement(s)
            boolean result = target.hasWitnesses();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
        }
    }

    //Sapient generated method id: ${04362ea9-04af-3b46-9581-44d5c7b4f0f5}
    @Test()
    public void getMessageSizeForPriorityCalcWhenInputsIsEmpty() {
        /* Branches:
         * (for-each(inputs)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = spy(new Transaction(networkParameters));
            doReturn(0).when(target).messageSize();
            //Act Statement(s)
            int result = target.getMessageSizeForPriorityCalc();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
            verify(target).messageSize();
        }
    }

    //Sapient generated method id: ${7a813015-0212-3a54-94bb-fa837d73c97b}
    @Test()
    public void isCoinBaseWhenInputsSizeNotEquals1() {
        /* Branches:
         * (inputs.size() == 1) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = new Transaction(networkParameters);
            //Act Statement(s)
            boolean result = target.isCoinBase();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
        }
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}
    @Ignore()
    @Test()
    public void toStringTest() throws Throwable, Exception {
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = spy(new Transaction(networkParameters));
            doReturn("A").when(target).toString((AbstractBlockChain) null, (Network) null);
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("Transaction{A}"));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
            verify(target).toString((AbstractBlockChain) null, (Network) null);
        }
    }

    //Sapient generated method id: ${cabd8b84-4f2d-339c-9d46-60cffe26dac3}
    @Test()
    public void toString1Test() throws Throwable, Exception {
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = spy(new Transaction(networkParameters));
            doReturn("return_of_toString1").when(target).toString(abstractBlockChainMock, networkMock, "");
            //Act Statement(s)
            String result = target.toString(abstractBlockChainMock, networkMock);
            //Assert statement(s)
            assertThat(result, equalTo("return_of_toString1"));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
            verify(target).toString(abstractBlockChainMock, networkMock, "");
        }
    }

    //Sapient generated method id: ${e3b70c71-7dcb-35ee-a4a5-bcd7f8ab379c}
    @Ignore()
    @Test()
    public void toString2WhenFeeIsNotNullAndSizeNotEqualsVsize() throws Throwable, Exception {
        /* Branches:
         * (!wTxId.equals(txId)) : true
         * (size != vsize) : true
         * (version != 1) : false
         * (isTimeLocked()) : true
         * (locktime instanceof HeightLock) : true
         * (chain != null) : true
         * (hasRelativeLockTime()) : true
         * (isOptInFullRBF()) : true
         * (purpose != null) : true
         * (isCoinBase()) : true
         * (for-each(outputs)) : false
         * (fee != null) : true
         * (size != vsize) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin coinMock = mock(Coin.class);
        AbstractBlockChain abstractBlockChainMock = mock(AbstractBlockChain.class, "org.bitcoinj.params.MainNetParams@7d6f77cc");
        Network networkMock = mock(Network.class, "org.bitcoinj.params.MainNetParams@7d6f77cc");
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = spy(new Transaction(networkParameters));
            doReturn(sha256HashMock).when(target).getTxId();
            doReturn(sha256HashMock2).when(target).getWTxId();
            doReturn(1).when(target).getWeight();
            doReturn(1).when(target).messageSize();
            doReturn(2).when(target).getVsize();
            doReturn(true).when(target).isTimeLocked();
            doReturn(true).when(target).hasRelativeLockTime();
            doReturn(true).when(target).isOptInFullRBF();
            doReturn(true).when(target).isCoinBase();
            doReturn(coinMock).when(target).getFee();
            doReturn(coinMock3).when(coinMock2).divide(1L);
            doReturn("String").when(coinMock3).toFriendlyString();
            doReturn(coinMock5).when(coinMock4).divide(2L);
            doReturn("return_of_toFriendlyString1").when(coinMock5).toFriendlyString();
            Coin coin = Coin.valueOf(0L);
            doReturn(coinMock2, coinMock4, coin).when(coinMock).multiply(1000L);
            doReturn("return_of_toFriendlyString1").when(coinMock).toFriendlyString();
            //Act Statement(s)
            String result = target.toString(abstractBlockChainMock, networkMock, (CharSequence) "toString_charSequence1");
            //Assert statement(s)
            assertThat(result, equalTo("String"));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
            verify(target).getTxId();
            verify(target).getWTxId();
            verify(target).getWeight();
            verify(target).messageSize();
            verify(target).getVsize();
            verify(target).isTimeLocked();
            verify(target).hasRelativeLockTime();
            verify(target).isOptInFullRBF();
            verify(target).isCoinBase();
            verify(target).getFee();
            verify(coinMock, times(3)).multiply(1000L);
            verify(coinMock2).divide(1L);
            verify(coinMock3).toFriendlyString();
            verify(coinMock4).divide(2L);
            verify(coinMock5).toFriendlyString();
            verify(coinMock).toFriendlyString();
        }
    }

    //Sapient generated method id: ${9de02018-cf88-3459-9031-5f2fc3d9bc49}
    @Ignore()
    @Test()
    public void toString2WhenInputsIsEmptyAndOutputsIsEmptyAndFeeIsNotNullAndSizeNotEqualsVsize() throws Throwable, Exception {
        /* Branches:
         * (!wTxId.equals(txId)) : true
         * (size != vsize) : true
         * (version != 1) : false
         * (isTimeLocked()) : true
         * (locktime instanceof HeightLock) : true
         * (chain != null) : true
         * (hasRelativeLockTime()) : true
         * (isOptInFullRBF()) : true
         * (purpose != null) : true
         * (isCoinBase()) : false
         * (!inputs.isEmpty()) : false
         * (for-each(outputs)) : false
         * (fee != null) : true
         * (size != vsize) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin coinMock = mock(Coin.class);
        AbstractBlockChain abstractBlockChainMock = mock(AbstractBlockChain.class, "org.bitcoinj.params.MainNetParams@6d06d69c");
        Network networkMock = mock(Network.class, "org.bitcoinj.params.MainNetParams@6d06d69c");
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = spy(new Transaction(networkParameters));
            doReturn(sha256HashMock).when(target).getTxId();
            doReturn(sha256HashMock2).when(target).getWTxId();
            doReturn(1).when(target).getWeight();
            doReturn(1).when(target).messageSize();
            doReturn(2).when(target).getVsize();
            doReturn(true).when(target).isTimeLocked();
            doReturn(true).when(target).hasRelativeLockTime();
            doReturn(true).when(target).isOptInFullRBF();
            doReturn(true).when(target).isCoinBase();
            doReturn(coinMock).when(target).getFee();
            doReturn(coinMock3).when(coinMock2).divide(1L);
            doReturn("1970-01-01T00:00:00Z").when(coinMock3).toFriendlyString();
            doReturn(coinMock5).when(coinMock4).divide(2L);
            doReturn("return_of_toFriendlyString1").when(coinMock5).toFriendlyString();
            Coin coin = Coin.valueOf(0L);
            doReturn(coinMock2, coinMock4, coin).when(coinMock).multiply(1000L);
            doReturn("return_of_toFriendlyString1").when(coinMock).toFriendlyString();
            //Act Statement(s)
            String result = target.toString(abstractBlockChainMock, networkMock, (CharSequence) "toString_charSequence1");
            //Assert statement(s)
            assertThat(result, equalTo("0.00001 BTC"));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
            verify(target).getTxId();
            verify(target).getWTxId();
            verify(target).getWeight();
            verify(target).messageSize();
            verify(target).getVsize();
            verify(target).isTimeLocked();
            verify(target).hasRelativeLockTime();
            verify(target).isOptInFullRBF();
            verify(target).isCoinBase();
            verify(target).getFee();
            verify(coinMock, times(3)).multiply(1000L);
            verify(coinMock2).divide(1L);
            verify(coinMock3).toFriendlyString();
            verify(coinMock4).divide(2L);
            verify(coinMock5).toFriendlyString();
            verify(coinMock).toFriendlyString();
        }
    }

    //Sapient generated method id: ${888c0a3e-e7bf-370f-bec0-a9d7a0d8f2e1}
    @Test()
    public void clearInputsWhenInputsIsEmpty() {
        /* Branches:
         * (for-each(inputs)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = new Transaction(networkParameters);
            //Act Statement(s)
            target.clearInputs();
            //Assert statement(s)
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
        }
    }

    //Sapient generated method id: ${70ff7054-de11-3427-bd4a-d4421f95d35a}
    @Ignore()
    @Test()
    public void addInputTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TransactionOutput transactionOutputMock = mock(TransactionOutput.class, "<value>");
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = new Transaction(networkParameters);
            //Act Statement(s)
            TransactionInput result = target.addInput(transactionOutputMock);
            TransactionInput transactionInput = new TransactionInput(target, transactionOutputMock);
            //Assert statement(s)
            assertThat(result, equalTo(transactionInput));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
        }
    }

    //Sapient generated method id: ${f16f06bd-2857-3ff9-add1-4b6b29f3d087}
    @Test()
    public void addInput1Test() {
        //Arrange Statement(s)
        TransactionInput inputMock = mock(TransactionInput.class, "void");
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = new Transaction(networkParameters);
            doNothing().when(inputMock).setParent(target);
            //Act Statement(s)
            TransactionInput result = target.addInput(inputMock);
            //Assert statement(s)
            assertThat(result, equalTo(inputMock));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
            verify(inputMock).setParent(target);
        }
    }

    //Sapient generated method id: ${11928278-ed37-34b3-a179-c2077c8b9a58}
    @Ignore()
    @Test()
    public void addInput2Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Script scriptMock = mock(Script.class, "[]");
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(scriptMock).program();
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = new Transaction(networkParameters);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            //Act Statement(s)
            TransactionInput result = target.addInput(sha256Hash, 1L, scriptMock);
            TransactionOutPoint transactionOutPoint = new TransactionOutPoint(1L, sha256Hash);
            TransactionInput transactionInput = new TransactionInput(target, byteArray, transactionOutPoint);
            //Assert statement(s)
            assertThat(result, equalTo(transactionInput));
            verify(scriptMock).program();
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
        }
    }

    //Sapient generated method id: ${eeb81b1d-a4a2-3f3b-ad6e-4e5264ecc85d}
    @Test()
    public void addSignedInput3Test() throws ScriptException, IOException {
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = spy(new Transaction(networkParameters));
            TransactionOutPoint transactionOutPoint = new TransactionOutPoint(0L, sha256HashMock);
            ECKey eCKey = new ECKey();
            doReturn(transactionInputMock).when(target).addSignedInput(eq(transactionOutPoint), (Script) any(), eq((Coin) null), eq(eCKey));
            List list = new ArrayList<>();
            Script script = Script.of(list);
            //Act Statement(s)
            TransactionInput result = target.addSignedInput(transactionOutPoint, script, eCKey);
            //Assert statement(s)
            assertThat(result, equalTo(transactionInputMock));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
            verify(target).addSignedInput(eq(transactionOutPoint), (Script) any(), eq((Coin) null), eq(eCKey));
        }
    }

    //Sapient generated method id: ${07a2fea1-5daf-33a2-a532-432e6258d084}
    @Test()
    public void addSignedInput4Test() throws IOException {
        //Arrange Statement(s)
        TransactionOutput transactionOutputMock = mock(TransactionOutput.class, "{}");
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.unset();
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = spy(new Transaction(networkParameters));
            ECKey eCKey = new ECKey();
            doReturn(transactionInputMock).when(target).addSignedInput(transactionOutputMock, eCKey, Transaction.SigHash.ALL, false);
            //Act Statement(s)
            TransactionInput result = target.addSignedInput(transactionOutputMock, eCKey);
            //Assert statement(s)
            assertThat(result, equalTo(transactionInputMock));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
            verify(target).addSignedInput(transactionOutputMock, eCKey, Transaction.SigHash.ALL, false);
        }
    }

    //Sapient generated method id: ${abd3055c-2b18-3dc9-a8d2-94c81fd9c0aa}
    @Test()
    public void clearOutputsWhenOutputsIsEmpty() {
        /* Branches:
         * (for-each(outputs)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = new Transaction(networkParameters);
            //Act Statement(s)
            target.clearOutputs();
            //Assert statement(s)
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
        }
    }

    //Sapient generated method id: ${e38c18ec-215c-383a-9e77-1b41668872b0}
    @Test()
    public void addOutputTest() {
        //Arrange Statement(s)
        TransactionOutput toMock = mock(TransactionOutput.class, "null");
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = new Transaction(networkParameters);
            doNothing().when(toMock).setParent(target);
            //Act Statement(s)
            TransactionOutput result = target.addOutput(toMock);
            //Assert statement(s)
            assertThat(result, equalTo(toMock));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
            verify(toMock).setParent(target);
        }
    }

    //Sapient generated method id: ${1d0f2b67-a741-3ebf-b21c-cf561cbbd91c}
    @Ignore()
    @Test()
    public void addOutput2Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = new Transaction(networkParameters);
            Coin coin = Coin.valueOf(0L);
            ECKey eCKey = new ECKey();
            //Act Statement(s)
            TransactionOutput result = target.addOutput(coin, eCKey);
            TransactionOutput transactionOutput = new TransactionOutput(target, coin, eCKey);
            //Assert statement(s)
            assertThat(result, equalTo(transactionOutput));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
        }
    }

    //Sapient generated method id: ${85ae1bc5-dae1-3bbb-826d-d8dd978a09a4}
    @Ignore()
    @Test()
    public void addOutput3Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.unset();
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = new Transaction(networkParameters);
            Coin coin = Coin.valueOf(0L);
            List list = new ArrayList<>();
            Script script = Script.of(list);
            //Act Statement(s)
            TransactionOutput result = target.addOutput(coin, script);
            byte[] byteArray = new byte[]{};
            TransactionOutput transactionOutput = new TransactionOutput(target, coin, byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(transactionOutput));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
        }
    }

    //Sapient generated method id: ${be555d1b-53c6-32ad-9034-5c59ded576b2}
    @Ignore()
    @Test()
    public void hashForSignature2WhenInputIndexGreaterThanOrEqualsToTxOutputsSize() throws IOException {
        /* Branches:
         * (i < tx.inputs.size()) : true
         * ((sigHashType & 0x1f) == SigHash.NONE.value) : false
         * ((sigHashType & 0x1f) == SigHash.SINGLE.value) : true
         * (inputIndex >= tx.outputs.size()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class);
             MockedStatic<Script> script = mockStatic(Script.class);
             MockedStatic<Transaction> transaction = mockStatic(Transaction.class);
             MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.unset();
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            Transaction transaction2 = new Transaction();
            transaction.when(() -> Transaction.read((ByteBuffer) any())).thenReturn(transaction2);
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 106, (byte) 32, (byte) 0, (byte) 108, (byte) 110, (byte) 122, (byte) 61, (byte) 0, (byte) 29, (byte) 31, (byte) 76, (byte) 60, (byte) 92, (byte) 0, (byte) 127, (byte) 110, (byte) 45, (byte) 44, (byte) 61, (byte) 0, (byte) 61, (byte) 0, (byte) 29, (byte) 31, (byte) 76, (byte) 60, (byte) 92, (byte) 0, (byte) 127, (byte) 110, (byte) 45, (byte) 44, (byte) 61};
            script.when(() -> Script.removeAllInstancesOfOp(byteArray2, 171)).thenReturn(byteArray);
            Sha256Hash sha256Hash2 = Sha256Hash.wrap("0100000000000000000000000000000000000000000000000000000000000000");
            sha256Hash.when(() -> Sha256Hash.wrap("0100000000000000000000000000000000000000000000000000000000000000")).thenReturn(sha256Hash2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = spy(new Transaction(networkParameters));
            byte[] byteArray3 = new byte[]{};
            doReturn(byteArray3).when(target).serialize();
            //Act Statement(s)
            Sha256Hash result = target.hashForSignature(0, byteArray2, (byte) 3);
            //Assert statement(s)
            assertThat(result, equalTo(sha256Hash2));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
            transaction.verify(() -> Transaction.read((ByteBuffer) any()));
            script.verify(() -> Script.removeAllInstancesOfOp(byteArray2, 171), atLeast(1));
            sha256Hash.verify(() -> Sha256Hash.wrap("0100000000000000000000000000000000000000000000000000000000000000"), atLeast(1));
            verify(target).serialize();
        }
    }

    //Sapient generated method id: ${bb426422-ff65-3c60-a9c3-84d620b5608e}
    @Ignore()
    @Test()
    public void hashForSignature2WhenINotEqualsInputIndexAndSigHashTypeAndSigHashANYONECANPAYValueEqualsSigHashANYONECANPAYValue() throws IOException {
        /* Branches:
         * (i < tx.inputs.size()) : true
         * ((sigHashType & 0x1f) == SigHash.NONE.value) : true
         * (i < tx.inputs.size()) : true
         * (i != inputIndex) : true
         * ((sigHashType & SigHash.ANYONECANPAY.value) == SigHash.ANYONECANPAY.value) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: tx
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Script> script = mockStatic(Script.class);
             MockedStatic<Transaction> transaction = mockStatic(Transaction.class);
             MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            Transaction transaction2 = new Transaction();
            transaction.when(() -> Transaction.read((ByteBuffer) any())).thenReturn(transaction2);
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{(byte) 1, (byte) 2, (byte) 3};
            script.when(() -> Script.removeAllInstancesOfOp(byteArray2, 171)).thenReturn(byteArray);
            byteUtils.when(() -> ByteUtils.writeInt32LE(eq(0), (ByteArrayOutputStream) any())).thenAnswer((Answer<Void>) invocation -> null);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer);
            byte[] byteArray3 = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.twiceOf(byteArray3)).thenReturn(sha256Hash2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = spy(new Transaction(networkParameters));
            byte[] byteArray4 = new byte[]{};
            doReturn(byteArray4).when(target).serialize();
            //Act Statement(s)
            Sha256Hash result = target.hashForSignature(0, byteArray2, (byte) 0);
            //Assert statement(s)
            assertThat(result, equalTo(sha256Hash2));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
            transaction.verify(() -> Transaction.read((ByteBuffer) any()));
            script.verify(() -> Script.removeAllInstancesOfOp(byteArray2, 171), atLeast(1));
            byteUtils.verify(() -> ByteUtils.writeInt32LE(eq(0), (ByteArrayOutputStream) any()));
            sha256Hash.verify(() -> Sha256Hash.twiceOf(byteArray3), atLeast(1));
            verify(target).serialize();
        }
    }

    //Sapient generated method id: ${8de91027-c7dc-3c01-b4ff-e793943928ed}
    @Ignore()
    @Test()
    public void hashForSignature2WhenInputIndexGreaterThanOrEqualsToTxOutputsSizeAndCaughtIOExceptionThrowsRuntimeException() {
        /* Branches:
         * (i < tx.inputs.size()) : true
         * ((sigHashType & 0x1f) == SigHash.NONE.value) : false
         * ((sigHashType & 0x1f) == SigHash.SINGLE.value) : true
         * (inputIndex >= tx.outputs.size()) : true
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParametersMock = mock(NetworkParameters.class, "main");
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class);
             MockedStatic<Script> script = mockStatic(Script.class);
             MockedStatic<Transaction> transaction = mockStatic(Transaction.class);
             MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            Transaction transaction2 = new Transaction();
            transaction.when(() -> Transaction.read((ByteBuffer) any())).thenReturn(transaction2);
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{(byte) 1, (byte) 2, (byte) 3};
            script.when(() -> Script.removeAllInstancesOfOp(byteArray2, 171)).thenReturn(byteArray);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer);
            sha256Hash.when(() -> Sha256Hash.wrap("0100000000000000000000000000000000000000000000000000000000000000")).thenReturn(sha256Hash2);
            Transaction target = spy(new Transaction(networkParametersMock));
            byte[] byteArray3 = new byte[]{};
            doReturn(byteArray3).when(target).serialize();
            thrown.expect(RuntimeException.class);
            thrown.expectCause(isA(IOException.class));
            //Act Statement(s)
            target.hashForSignature(0, byteArray2, (byte) 3);
            //Assert statement(s)
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
            transaction.verify(() -> Transaction.read((ByteBuffer) any()));
            script.verify(() -> Script.removeAllInstancesOfOp(byteArray2, 171), atLeast(1));
            sha256Hash.verify(() -> Sha256Hash.wrap("0100000000000000000000000000000000000000000000000000000000000000"), atLeast(1));
            verify(target).serialize();
        }
    }

    //Sapient generated method id: ${4f4169ae-47dc-3ed1-b5d0-3631eef5c173}
    @Ignore()
    @Test()
    public void hashForSignature2WhenSigHashTypeAndSigHashANYONECANPAYValueEqualsSigHashANYONECANPAYValueAndCaugh2ThrowsRuntimeException() throws IOException {
        /* Branches:
         * (i < tx.inputs.size()) : true
         * ((sigHashType & 0x1f) == SigHash.NONE.value) : true
         * (i < tx.inputs.size()) : true
         * (i != inputIndex) : true
         * ((sigHashType & SigHash.ANYONECANPAY.value) == SigHash.ANYONECANPAY.value) : true
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: tx
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Script> script = mockStatic(Script.class);
             MockedStatic<Transaction> transaction = mockStatic(Transaction.class);
             MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            Transaction transaction2 = new Transaction();
            transaction.when(() -> Transaction.read((ByteBuffer) any())).thenReturn(transaction2);
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{(byte) 1, (byte) 2, (byte) 3};
            script.when(() -> Script.removeAllInstancesOfOp(byteArray2, 171)).thenReturn(byteArray);
            byteUtils.when(() -> ByteUtils.writeInt32LE(eq(0), (ByteArrayOutputStream) any())).thenAnswer((Answer<Void>) invocation -> null);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer);
            byte[] byteArray3 = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.twiceOf(byteArray3)).thenReturn(sha256Hash2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = spy(new Transaction(networkParameters));
            byte[] byteArray4 = new byte[]{};
            doReturn(byteArray4).when(target).serialize();
            thrown.expect(RuntimeException.class);
            thrown.expectCause(isA(IOException.class));
            //Act Statement(s)
            target.hashForSignature(0, byteArray2, (byte) 0);
            //Assert statement(s)
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
            transaction.verify(() -> Transaction.read((ByteBuffer) any()));
            script.verify(() -> Script.removeAllInstancesOfOp(byteArray2, 171), atLeast(1));
            byteUtils.verify(() -> ByteUtils.writeInt32LE(eq(0), (ByteArrayOutputStream) any()));
            sha256Hash.verify(() -> Sha256Hash.twiceOf(byteArray3), atLeast(1));
            verify(target).serialize();
        }
    }

    //Sapient generated method id: ${7fa603de-13bd-38ff-b614-c21a81ba53c1}
    @Test()
    public void hashForWitnessSignature2WhenInputIndexLessThanOutputsSizeThrowsIndexOutOfBoundsException() throws IOException {
        /* Branches:
         * ((sigHashType & SigHash.ANYONECANPAY.value) == SigHash.ANYONECANPAY.value) : true
         * (basicSigHashType != SigHash.SINGLE.value) : false
         * (!anyoneCanPay) : false
         * (!anyoneCanPay) : false
         * (signAll) : false
         * (basicSigHashType == SigHash.SINGLE.value) : true
         * (inputIndex < outputs.size()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = new Transaction(networkParameters);
            thrown.expect(IndexOutOfBoundsException.class);
            byte[] byteArray = new byte[]{(byte) 0};
            //Act Statement(s)
            target.hashForWitnessSignature(0, byteArray, coinMock, (byte) 1);
            //Assert statement(s)
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
        }
    }

    //Sapient generated method id: ${36379ab5-3a96-3014-a817-ff9bf886e250}
    @Test()
    public void hashForWitnessSignature2WhenSignAllAndThisOutputsIsEmptyThrowsIndexOutOfBoundsException() throws IOException {
        /* Branches:
         * ((sigHashType & SigHash.ANYONECANPAY.value) == SigHash.ANYONECANPAY.value) : false
         * (basicSigHashType != SigHash.SINGLE.value) : true
         * (basicSigHashType != SigHash.NONE.value) : true
         * (!anyoneCanPay) : true
         * (for-each(this.inputs)) : false
         * (!anyoneCanPay) : true
         * (signAll) : true
         * (for-each(this.inputs)) : false
         * (signAll) : true
         * (for-each(this.outputs)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParametersMock = mock(NetworkParameters.class, "bitcoincash");
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class);
             MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            byte[] byteArray = new byte[]{(byte) 93, (byte) -10, (byte) -32, (byte) -30, (byte) 118, (byte) 19, (byte) 89, (byte) -45, (byte) 10, (byte) -126, (byte) 117, (byte) 5, (byte) -114, (byte) 41, (byte) -97, (byte) -52, (byte) 3, (byte) -127, (byte) 83, (byte) 69, (byte) 69, (byte) -11, (byte) 92, (byte) -12, (byte) 62, (byte) 65, (byte) -104, (byte) 63, (byte) 93, (byte) 76, (byte) -108, (byte) 86};
            byte[] byteArray2 = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.hashTwice(byteArray2)).thenReturn(byteArray);
            byte[] byteArray3 = new byte[]{(byte) 93, (byte) -10, (byte) -32, (byte) -30, (byte) 118, (byte) 19, (byte) 89, (byte) -45, (byte) 10, (byte) -126, (byte) 117, (byte) 5, (byte) -114, (byte) 41, (byte) -97, (byte) -52, (byte) 3, (byte) -127, (byte) 83, (byte) 69, (byte) 69, (byte) -11, (byte) 92, (byte) -12, (byte) 62, (byte) 65, (byte) -104, (byte) 63, (byte) 93, (byte) 76, (byte) -108, (byte) 86};
            byte[] byteArray4 = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.hashTwice(byteArray4)).thenReturn(byteArray3);
            byte[] byteArray5 = new byte[]{};
            byte[] byteArray6 = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.hashTwice(byteArray6)).thenReturn(byteArray5);
            Transaction target = new Transaction(networkParametersMock);
            thrown.expect(IndexOutOfBoundsException.class);
            byte[] byteArray7 = new byte[]{(byte) 1, (byte) 2, (byte) 3};
            //Act Statement(s)
            target.hashForWitnessSignature(0, byteArray7, coinMock, (byte) 1);
            //Assert statement(s)
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
            sha256Hash.verify(() -> Sha256Hash.hashTwice(byteArray2), atLeast(1));
            sha256Hash.verify(() -> Sha256Hash.hashTwice(byteArray4), atLeast(1));
            sha256Hash.verify(() -> Sha256Hash.hashTwice(byteArray6), atLeast(1));
        }
    }

    //Sapient generated method id: ${8625aa71-4b9e-3c3d-acbc-811a62ba21cc}
    @Test()
    public void messageSizeWhenNotUseSegwit() {
        /* Branches:
         * (hasWitnesses()) : false
         * (useSegwit) : false
         * (for-each(inputs)) : false
         * (for-each(outputs)) : false
         * (useSegwit) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = spy(new Transaction(networkParameters));
            doReturn(false).when(target).hasWitnesses();
            //Act Statement(s)
            int result = target.messageSize();
            //Assert statement(s)
            assertThat(result, equalTo(10));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
            verify(target).hasWitnesses();
        }
    }

    //Sapient generated method id: ${ae4bb6f9-d917-3b2e-bd24-dc16ffc7ed71}
    @Test()
    public void messageSizeWhenInputsIsEmpty() {
        /* Branches:
         * (hasWitnesses()) : true
         * ((protocolVersion & SERIALIZE_TRANSACTION_NO_WITNESS) == 0) : true  #  inside allowWitness method
         * (protocolVersion >= WITNESS_VERSION.intValue()) : true  #  inside allowWitness method
         * (allowWitness(protocolVersion)) : true
         * (useSegwit) : true
         * (for-each(inputs)) : false
         * (for-each(outputs)) : false
         * (useSegwit) : true
         * (for-each(inputs)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = spy(new Transaction(networkParameters));
            doReturn(true).when(target).hasWitnesses();
            //Act Statement(s)
            int result = target.messageSize();
            //Assert statement(s)
            assertThat(result, equalTo(12));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
            verify(target).hasWitnesses();
        }
    }

    //Sapient generated method id: ${579ab5cb-7ae0-384b-a85d-05035122f633}
    @Test()
    public void bitcoinSerializeToStreamWhenHasWitnessesNot() throws IOException {
        /* Branches:
         * (hasWitnesses()) : false
         */
        //Arrange Statement(s)
        /*try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
    LockTime lockTime2 = LockTime.of(0L);
    lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
    NetworkParameters networkParameters = NetworkParameters.fromID("id1");
    Transaction target = spy(new Transaction(networkParameters));
    doReturn(false).when(target).hasWitnesses();
    doNothing().when(target).bitcoinSerializeToStream((OutputStream) any(), eq(false));
    OutputStream outputStream = OutputStream.nullOutputStream();
    //Act Statement(s)
    target.bitcoinSerializeToStream(outputStream);
    //Assert statement(s)
    lockTime.verify(() -> LockTime.unset(), atLeast(1));
    verify(target).hasWitnesses();
    verify(target).bitcoinSerializeToStream((OutputStream) any(), eq(false));
}*/
    }

    //Sapient generated method id: ${6e475e68-a7fb-34de-8130-10d79c0dbac2}
    @Test()
    public void bitcoinSerializeToStreamWhenAllowWitnessProtocolVersion() throws IOException {
        /* Branches:
         * (hasWitnesses()) : true
         * ((protocolVersion & SERIALIZE_TRANSACTION_NO_WITNESS) == 0) : true  #  inside allowWitness method
         * (protocolVersion >= WITNESS_VERSION.intValue()) : true  #  inside allowWitness method
         * (allowWitness(protocolVersion)) : true
         */
        //Arrange Statement(s)
        /*try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
    LockTime lockTime2 = LockTime.of(0L);
    lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
    NetworkParameters networkParameters = NetworkParameters.fromID("id1");
    Transaction target = spy(new Transaction(networkParameters));
    doReturn(true).when(target).hasWitnesses();
    doNothing().when(target).bitcoinSerializeToStream((OutputStream) any(), eq(true));
    OutputStream outputStream = OutputStream.nullOutputStream();
    //Act Statement(s)
    target.bitcoinSerializeToStream(outputStream);
    //Assert statement(s)
    lockTime.verify(() -> LockTime.unset(), atLeast(1));
    verify(target).hasWitnesses();
    verify(target).bitcoinSerializeToStream((OutputStream) any(), eq(true));
}*/
    }

    //Sapient generated method id: ${12b71ddf-46d3-38c6-91f7-5dda351bef4b}
    @Test()
    public void bitcoinSerializeToStream1WhenInputsIsEmpty() throws IOException {
        /* Branches:
         * (useSegwit) : true
         * (for-each(inputs)) : false
         * (for-each(outputs)) : false
         * (useSegwit) : true
         * (for-each(inputs)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<VarInt> varInt = mockStatic(VarInt.class);
    MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
    LockTime lockTime2 = LockTime.of(0L);
    lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
    VarInt varInt2 = VarInt.of(0L);
    VarInt varInt3 = new VarInt(0L);
    varInt.when(() -> VarInt.of(0L)).thenReturn(varInt2).thenReturn(varInt3);
    NetworkParameters networkParameters = NetworkParameters.fromID("id1");
    Transaction target = new Transaction(networkParameters);
    OutputStream outputStream = OutputStream.nullOutputStream();
    //Act Statement(s)
    target.bitcoinSerializeToStream(outputStream, true);
    //Assert statement(s)
    lockTime.verify(() -> LockTime.unset(), atLeast(1));
    varInt.verify(() -> VarInt.of(0L), atLeast(2));
}*/
    }

    //Sapient generated method id: ${b6bdd736-515d-3ce2-a7b9-aabdc1f56490}
    @Test()
    public void lockTimeTest() {
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = new Transaction(networkParameters);
            //Act Statement(s)
            LockTime result = target.lockTime();
            //Assert statement(s)
            assertThat(result, equalTo(lockTime2));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
        }
    }

    //Sapient generated method id: ${89466d45-82bd-3235-99c6-eb8cea642893}
    @Test()
    public void getLockTimeTest() {
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.unset();
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = spy(new Transaction(networkParameters));
            doReturn(lockTimeMock).when(target).lockTime();
            doReturn(0L).when(lockTimeMock).rawValue();
            //Act Statement(s)
            long result = target.getLockTime();
            //Assert statement(s)
            assertThat(result, equalTo(0L));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
            verify(target).lockTime();
            verify(lockTimeMock).rawValue();
        }
    }

    //Sapient generated method id: ${3ae04627-d8c8-37fe-956f-f3dd05cd6f42}
    @Test()
    public void setLockTimeWhenNotSeqNumSet() {
        /* Branches:
         * (for-each(inputs)) : false
         * (lockTime != 0) : true
         * (!seqNumSet) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class, CALLS_REAL_METHODS)) {
            LockTime lockTime2 = LockTime.unset();
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = new Transaction(networkParameters);
            //Act Statement(s)
            target.setLockTime(1000L);
            //Assert statement(s)
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
        }
    }

    //Sapient generated method id: ${ce0ee48c-549e-3a9e-a70c-6d9610fd4274}
    @Test()
    public void setVersionTest() {
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.unset();
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            Transaction target = new Transaction(networkParametersMock);
            //Act Statement(s)
            target.setVersion(1);
            //Assert statement(s)
            assertThat(target.getVersion(), equalTo(1L));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
        }
    }

    //Sapient generated method id: ${8dfc1a7b-6904-35a1-9585-80ff6236301f}
    @Test()
    public void getInputsTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = new Transaction(networkParameters);
            //Act Statement(s)
            List<TransactionInput> result = target.getInputs();
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
        }
    }

    //Sapient generated method id: ${3478c670-ca0a-3479-8a43-51792b04008f}
    @Test()
    public void getOutputsTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = new Transaction(networkParameters);
            //Act Statement(s)
            List<TransactionOutput> result = target.getOutputs();
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
        }
    }

    //Sapient generated method id: ${e128b207-5fbd-35c8-b873-7d7c64ef9f70}
    @Test()
    public void getWalletOutputsWhenOutputsIsEmpty() {
        /* Branches:
         * (for-each(outputs)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = new Transaction(networkParameters);
            //Act Statement(s)
            List<TransactionOutput> result = target.getWalletOutputs(transactionBagMock);
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
        }
    }

    //Sapient generated method id: ${5a233e5a-dd8b-3414-92f4-8bd1a475d96c}
    @Test()
    public void shuffleOutputsTest() {
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = new Transaction(networkParameters);
            //Act Statement(s)
            target.shuffleOutputs();
            //Assert statement(s)
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
        }
    }

    //Sapient generated method id: ${63c6b84d-12ae-39dc-b28a-8f1d9bf24bcd}
    @Test()
    public void getInputThrowsIndexOutOfBoundsException() {
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.unset();
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            Transaction target = new Transaction(networkParametersMock);
            thrown.expect(IndexOutOfBoundsException.class);
            //Act Statement(s)
            target.getInput(0L);
            //Assert statement(s)
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
        }
    }

    //Sapient generated method id: ${a2d174cb-a6d9-391f-9a1e-2acc7a32643f}
    @Test()
    public void getOutputThrowsIndexOutOfBoundsException() {
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = new Transaction(networkParameters);
            thrown.expect(IndexOutOfBoundsException.class);
            //Act Statement(s)
            target.getOutput(0L);
            //Assert statement(s)
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
        }
    }

    //Sapient generated method id: ${82d66314-9b50-39f0-a4f8-5ea7afe68b7e}
    @Ignore()
    @Test()
    public void getOutput1ThrowsIndexOutOfBoundsException() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TransactionOutPoint outpointMock = mock(TransactionOutPoint.class, "long");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            doReturn(sha256Hash).when(outpointMock).hash();
            doReturn(0L).when(outpointMock).index();
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = spy(new Transaction(networkParameters));
            doReturn(sha256HashMock).when(target).getTxId();
            thrown.expect(IndexOutOfBoundsException.class);
            //Act Statement(s)
            target.getOutput(outpointMock);
            //Assert statement(s)
            verify(outpointMock).hash();
            verify(outpointMock).index();
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            verify(target).getTxId();
        }
    }

    //Sapient generated method id: ${e0f628a0-f995-3333-a61a-03a5a2a7ee43}
    @Test()
    public void getConfidenceTest() throws IOException {
        //Arrange Statement(s)
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            Context context2 = new Context();
            context.when(() -> Context.get()).thenReturn(context2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = spy(new Transaction(networkParameters));
            doReturn(transactionConfidenceMock).when(target).getConfidence(context2);
            //Act Statement(s)
            TransactionConfidence result = target.getConfidence();
            //Assert statement(s)
            assertThat(result, equalTo(transactionConfidenceMock));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
            context.verify(() -> Context.get(), atLeast(1));
            verify(target).getConfidence(context2);
        }
    }

    //Sapient generated method id: ${6998a3d8-0aaa-3590-8d1e-c5c2d4b882a7}
    @Test()
    public void getConfidence1Test() throws IOException {
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.unset();
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = spy(new Transaction(networkParameters));
            doReturn(transactionConfidenceMock).when(target).getConfidence((TxConfidenceTable) any());
            Context context = new Context();
            //Act Statement(s)
            TransactionConfidence result = target.getConfidence(context);
            //Assert statement(s)
            assertThat(result, equalTo(transactionConfidenceMock));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
            verify(target).getConfidence((TxConfidenceTable) any());
        }
    }

    //Sapient generated method id: ${8f12b70b-8b65-329c-a64b-4879fa033a83}
    @Ignore()
    @Test()
    public void getConfidence2WhenConfidenceIsNull() throws IOException {
        /* Branches:
         * (confidence == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = spy(new Transaction(networkParameters));
            doReturn(sha256HashMock).when(target).getTxId();
            TxConfidenceTable txConfidenceTable = new TxConfidenceTable(0);
            //Act Statement(s)
            TransactionConfidence result = target.getConfidence(txConfidenceTable);
            TransactionConfidence transactionConfidence = new TransactionConfidence(sha256HashMock2);
            //Assert statement(s)
            //TODO: Please implement equals method in TransactionConfidence for verification to succeed or you need to adjust respective assertion statements
            assertThat(result, equalTo(transactionConfidence));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
            verify(target).getTxId();
        }
    }

    //Sapient generated method id: ${156136d9-1e9b-36fe-a37e-0ccdaa82232c}
    @Test()
    public void hasConfidenceWhenGetConfidenceGetConfidenceTypeNotEqualsTransactionConfidenceConfidenceTypeUNKNOWN() throws IOException {
        /* Branches:
         * (getConfidence().getConfidenceType() != TransactionConfidence.ConfidenceType.UNKNOWN) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.unset();
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            Transaction target = spy(new Transaction(networkParametersMock));
            TransactionConfidence transactionConfidence = new TransactionConfidence(sha256HashMock);
            transactionConfidence.setConfidenceType(TransactionConfidence.ConfidenceType.IN_CONFLICT);
            doReturn(transactionConfidence).when(target).getConfidence();
            //Act Statement(s)
            boolean result = target.hasConfidence();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
            verify(target).getConfidence();
        }
    }

    //Sapient generated method id: ${0bd2e753-2c9e-39bb-a07f-d82da42e7fda}
    @Test()
    public void hasConfidenceWhenGetConfidenceGetConfidenceTypeEqualsTransactionConfidenceConfidenceTypeUNKNOWN() throws IOException {
        /* Branches:
         * (getConfidence().getConfidenceType() != TransactionConfidence.ConfidenceType.UNKNOWN) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = spy(new Transaction(networkParameters));
            TransactionConfidence transactionConfidence = new TransactionConfidence(sha256HashMock);
            transactionConfidence.setConfidenceType(TransactionConfidence.ConfidenceType.UNKNOWN);
            doReturn(transactionConfidence).when(target).getConfidence();
            //Act Statement(s)
            boolean result = target.hasConfidence();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
            verify(target).getConfidence();
        }
    }

    //Sapient generated method id: ${9091306c-7701-380b-8798-2877eb2ec6bb}
    @Test()
    public void getSigOpCountWhenOutputsIsEmpty() throws ScriptException {
        /* Branches:
         * (for-each(inputs)) : false
         * (for-each(outputs)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = new Transaction(networkParameters);
            //Act Statement(s)
            int result = target.getSigOpCount();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
        }
    }

    //Sapient generated method id: ${a66146ab-0650-37a9-b8fc-b38d5ba61f4a}
    @Test()
    public void findWitnessCommitmentTest() {
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            preconditions.when(() -> Preconditions.checkState(false)).thenAnswer((Answer<Void>) invocation -> null);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = spy(new Transaction(networkParameters));
            doReturn(false).when(target).isCoinBase();
            //Act Statement(s)
            Sha256Hash result = target.findWitnessCommitment();
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            verify(target).isCoinBase();
        }
    }

    //Sapient generated method id: ${b58590c4-202d-3e62-97cc-b121f8cd5f7d}
    @Ignore()
    @Test()
    public void isTimeLockedWhenLockTimeNotIsSet() {
        /* Branches:
         * (!lockTime().isSet()) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = new Transaction(networkParameters);
            //Act Statement(s)
            boolean result = target.isTimeLocked();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
        }
    }

    //Sapient generated method id: ${ef6faadc-c2b1-32a9-9306-d266dac6b9ac}
    @Ignore()
    @Test()
    public void isTimeLockedWhenInputHasSequence() {
        /* Branches:
         * (!lockTime().isSet()) : false
         * (for-each(getInputs())) : true
         * (input.hasSequence()) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = new Transaction(networkParameters);
            //Act Statement(s)
            boolean result = target.isTimeLocked();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
        }
    }

    //Sapient generated method id: ${0f91b9b8-1582-3510-a852-21054249a1b6}
    @Ignore()
    @Test()
    public void isTimeLockedWhenInputNotHasSequence() {
        /* Branches:
         * (!lockTime().isSet()) : false
         * (for-each(getInputs())) : true
         * (input.hasSequence()) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = new Transaction(networkParameters);
            //Act Statement(s)
            boolean result = target.isTimeLocked();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
        }
    }

    //Sapient generated method id: ${6cfc9954-7b5f-3147-9690-66b08315924c}
    @Test()
    public void hasRelativeLockTimeWhenVersionLessThan2() {
        /* Branches:
         * (version < 2) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = new Transaction(networkParameters);
            //Act Statement(s)
            boolean result = target.hasRelativeLockTime();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
        }
    }

    //Sapient generated method id: ${d0e5a7f7-7138-37fe-ae48-84b45d1d53ff}
    @Ignore()
    @Test()
    public void isOptInFullRBFWhenInputIsOptInFullRBF() {
        /* Branches:
         * (for-each(getInputs())) : true
         * (input.isOptInFullRBF()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = new Transaction(networkParameters);
            //Act Statement(s)
            boolean result = target.isOptInFullRBF();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
        }
    }

    //Sapient generated method id: ${5c387391-9022-37b8-9a57-bb316b1884bc}
    @Test()
    public void isOptInFullRBFWhenInputNotIsOptInFullRBF() {
        /* Branches:
         * (for-each(getInputs())) : true
         * (input.isOptInFullRBF()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.unset();
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = new Transaction(networkParameters);
            //Act Statement(s)
            boolean result = target.isOptInFullRBF();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
        }
    }

    //Sapient generated method id: ${7b02502c-ef46-3f35-b1c9-a5047100e9d7}
    @Ignore()
    @Test()
    public void isFinalWhenIsTimeLockedNot() {
        /* Branches:
         * (locktime instanceof HeightLock) : false
         * (locktime.rawValue() < (locktime instanceof HeightLock ? height : blockTimeSeconds)) : false
         * (!isTimeLocked()) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = new Transaction(networkParameters);
            //Act Statement(s)
            boolean result = target.isFinal(1000, 1609459200L);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
        }
    }

    //Sapient generated method id: ${f2740b29-992c-3d3c-bbe7-4e6eb903ad9b}
    @Test()
    public void isFinalWhenIsTimeLocked() {
        /* Branches:
         * (locktime instanceof HeightLock) : false
         * (locktime.rawValue() < (locktime instanceof HeightLock ? height : blockTimeSeconds)) : false
         * (!isTimeLocked()) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.unset();
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            Transaction target = spy(new Transaction(networkParametersMock));
            doReturn(lockTimeMock).when(target).lockTime();
            doReturn(2L).when(lockTimeMock).rawValue();
            doReturn(true).when(target).isTimeLocked();
            //Act Statement(s)
            boolean result = target.isFinal(0, 1L);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
            verify(target).lockTime();
            verify(lockTimeMock).rawValue();
            verify(target).isTimeLocked();
        }
    }

    //Sapient generated method id: ${42d406ce-1144-3545-b338-a8512a479e42}
    @Test()
    public void estimateUnlockTimeWhenLocktimeInstanceOfHeightLock() {
        /* Branches:
         * (locktime instanceof HeightLock) : true
         */
        //Arrange Statement(s)
        AbstractBlockChain chainMock = mock(AbstractBlockChain.class);
        LockTime.HeightLock lockTimeHeightLockMock = mock(LockTime.HeightLock.class);
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            Instant instant = Instant.now();
            doReturn(instant).when(chainMock).estimateBlockTimeInstant(0);
            LockTime lockTime2 = LockTime.unset();
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            Transaction target = spy(new Transaction(networkParametersMock));
            doReturn(lockTimeHeightLockMock).when(target).lockTime();
            doReturn(0).when(lockTimeHeightLockMock).blockHeight();
            //Act Statement(s)
            Instant result = target.estimateUnlockTime(chainMock);
            //Assert statement(s)
            assertThat(result, equalTo(instant));
            verify(chainMock).estimateBlockTimeInstant(0);
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
            verify(target).lockTime();
            verify(lockTimeHeightLockMock).blockHeight();
        }
    }

    //Sapient generated method id: ${9c2c9194-3121-3159-acad-a7f98db99c7c}
    @Ignore()
    @Test()
    public void estimateUnlockTimeWhenLocktimeNotInstanceOfHeightLock() {
        /* Branches:
         * (locktime instanceof HeightLock) : false
         */
        //Arrange Statement(s)
        AbstractBlockChain abstractBlockChainMock = mock(AbstractBlockChain.class, "<instance of AbstractBlockChain>");
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime.TimeLock timeLock = (LockTime.TimeLock) LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(timeLock);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = new Transaction(networkParameters);
            //Act Statement(s)
            Instant result = target.estimateUnlockTime(abstractBlockChainMock);
            Instant instant = Instant.now();
            //Assert statement(s)
            assertThat(result, equalTo(instant));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
        }
    }

    //Sapient generated method id: ${d9d5541e-bdaa-3efa-a9e9-6be7a2ab1021}
    @Test()
    public void estimateLockTimeTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.of(0L);
            lockTime.when(() -> LockTime.unset()).thenReturn(lockTime2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Transaction target = spy(new Transaction(networkParameters));
            Instant instant = Instant.now();
            doReturn(instant).when(target).estimateUnlockTime(abstractBlockChainMock);
            //Act Statement(s)
            Date result = target.estimateLockTime(abstractBlockChainMock);
            Date date = new Date();
            //Assert statement(s)
            assertThat(result, equalTo(date));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
            verify(target).estimateUnlockTime(abstractBlockChainMock);
        }
    }

    //Sapient generated method id: ${dfe934f6-3583-3f58-b90f-9e02f22f416a}
    @Test()
    public void verifyWhenTxOutputsSizeEquals0ThrowsVerificationExceptionEmptyInputsOrOutputs() throws VerificationException {
        /* Branches:
         * (tx.inputs.size() == 0) : false
         * (tx.outputs.size() == 0) : true
         */
        //Arrange Statement(s)
        thrown.expect(VerificationException.EmptyInputsOrOutputs.class);
        Network networkMock = mock(Network.class);
        Transaction transaction = new Transaction();
        //Act Statement(s)
        Transaction.verify(networkMock, transaction);
    }

    //Sapient generated method id: ${26066fe5-eb71-3cae-bb44-208a310e6d24}
    @Ignore()
    @Test()
    public void verifyWhenTxMessageSizeGreaterThanBlockMAX_BLOCK_SIZEThrowsVerificationExceptionLargerThanMaxBlockSize() throws VerificationException {
        /* Branches:
         * (tx.inputs.size() == 0) : false
         * (tx.outputs.size() == 0) : false
         * (tx.messageSize() > Block.MAX_BLOCK_SIZE) : true
         */
        //Arrange Statement(s)
        Transaction txMock = mock(Transaction.class, "[output1, output2]");
        doReturn(100001).when(txMock).messageSize();
        thrown.expect(VerificationException.NegativeValueOutput.class);
        //Act Statement(s)
        Transaction.verify(networkMock, txMock);
        //Assert statement(s)
        verify(txMock).messageSize();
    }

    //Sapient generated method id: ${f8b2174e-f8f0-3651-9e46-9ecaf9347572}
    @Ignore()
    @Test()
    public void verifyWhenTxOutputsIsNotEmptyAndValueSignumLessThan0ThrowsVerificationExceptionNegativeValueOutput() throws VerificationException {
        /* Branches:
         * (tx.inputs.size() == 0) : false
         * (tx.outputs.size() == 0) : false
         * (tx.messageSize() > Block.MAX_BLOCK_SIZE) : false
         * (for-each(tx.inputs)) : true
         * (outpoints.contains(input.getOutpoint())) : false
         * (for-each(tx.outputs)) : true
         * (value.signum() < 0) : true
         */
        //Arrange Statement(s)
        Transaction txMock = mock(Transaction.class, "[{scriptPubKey={program={resultList=[]}}, value={value=10}}]");
        doReturn(100).when(txMock).messageSize();
        thrown.expect(VerificationException.NegativeValueOutput.class);
        //Act Statement(s)
        Transaction.verify(networkMock, txMock);
        //Assert statement(s)
        verify(txMock).messageSize();
    }

    //Sapient generated method id: ${ca7830f5-2167-31da-a447-be0d77467f4c}
    @Ignore()
    @Test()
    public void verifyWhenValueSignumNotLessThan0AndNetworkExceedsMaxMoneyValueOutThrowsVerificationExceptionExcessiveValue() throws VerificationException {
        /* Branches:
         * (tx.inputs.size() == 0) : false
         * (tx.outputs.size() == 0) : false
         * (tx.messageSize() > Block.MAX_BLOCK_SIZE) : false
         * (for-each(tx.inputs)) : true
         * (outpoints.contains(input.getOutpoint())) : false
         * (for-each(tx.outputs)) : true
         * (value.signum() < 0) : false
         * (network.exceedsMaxMoney(valueOut)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(false).when(networkMock).exceedsMaxMoney((Coin) any());
        thrown.expect(VerificationException.UnexpectedCoinbaseInput.class);
        Transaction transaction = new Transaction();
        //Act Statement(s)
        Transaction.verify(networkMock, transaction);
        //Assert statement(s)
        verify(networkMock).exceedsMaxMoney((Coin) any());
    }

    //Sapient generated method id: ${b06f5aa0-1388-3c45-82a4-f0cb2dd82871}
    @Ignore()
    @Test()
    public void verifyWhenTxInputsGet0GetScriptBytesLengthNotLessThan2AndTxInput3ThrowsVerificationExceptionCoinbaseScriptSizeOutOfRange() throws VerificationException {
        /* Branches:
         * (tx.inputs.size() == 0) : false
         * (tx.outputs.size() == 0) : false
         * (tx.messageSize() > Block.MAX_BLOCK_SIZE) : false
         * (for-each(tx.inputs)) : true
         * (outpoints.contains(input.getOutpoint())) : false
         * (for-each(tx.outputs)) : true
         * (value.signum() < 0) : false
         * (network.exceedsMaxMoney(valueOut)) : false
         * (tx.isCoinBase()) : true
         * (tx.inputs.get(0).getScriptBytes().length < 2) : false
         * (tx.inputs.get(0).getScriptBytes().length > 100) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(false).when(networkMock).exceedsMaxMoney((Coin) any());
        thrown.expect(VerificationException.UnexpectedCoinbaseInput.class);
        Transaction transaction = new Transaction();
        //Act Statement(s)
        Transaction.verify(networkMock, transaction);
        //Assert statement(s)
        verify(networkMock).exceedsMaxMoney((Coin) any());
    }

    //Sapient generated method id: ${0581c399-9565-3fc3-a024-13be534abef3}
    @Ignore()
    @Test()
    public void verifyWhenNetworkNotExceedsMaxMoneyValueOutAndTxNotIsCoinBaseAndTxInpThrowsVerificationExceptionUnexpectedCoinbaseInput() throws VerificationException {
        /* Branches:
         * (tx.inputs.size() == 0) : false
         * (tx.outputs.size() == 0) : false
         * (tx.messageSize() > Block.MAX_BLOCK_SIZE) : false
         * (for-each(tx.inputs)) : true
         * (outpoints.contains(input.getOutpoint())) : false
         * (for-each(tx.outputs)) : true
         * (value.signum() < 0) : false
         * (network.exceedsMaxMoney(valueOut)) : false
         * (tx.isCoinBase()) : false
         * (for-each(tx.inputs)) : true
         * (input.isCoinBase()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(false).when(networkMock).exceedsMaxMoney((Coin) any());
        Transaction transaction = new Transaction();
        //Act Statement(s)
        Transaction.verify(networkMock, transaction);
        //Assert statement(s)
        verify(networkMock).exceedsMaxMoney((Coin) any());
    }

    //Sapient generated method id: ${b2626ba8-7b03-39bc-b077-e34b819fe1b5}
    @Ignore()
    @Test()
    public void verifyWhenNetworkNotExceedsMaxMoneyValueOutAndTxNotIsCoinBaseAndTxInputsIsNotEmptyAndInputNotIsCoinBase() throws VerificationException {
        /* Branches:
         * (tx.inputs.size() == 0) : false
         * (tx.outputs.size() == 0) : false
         * (tx.messageSize() > Block.MAX_BLOCK_SIZE) : false
         * (for-each(tx.inputs)) : true
         * (outpoints.contains(input.getOutpoint())) : false
         * (for-each(tx.outputs)) : true
         * (value.signum() < 0) : false
         * (network.exceedsMaxMoney(valueOut)) : false
         * (tx.isCoinBase()) : false
         * (for-each(tx.inputs)) : true
         * (input.isCoinBase()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(false).when(networkMock).exceedsMaxMoney((Coin) any());
        Transaction transaction = new Transaction();
        //Act Statement(s)
        Transaction.verify(networkMock, transaction);
        //Assert statement(s)
        verify(networkMock).exceedsMaxMoney((Coin) any());
    }

    //Sapient generated method id: ${5868dff5-2474-3edf-9500-5c55898bac2b}
    @Ignore()
    @Test()
    public void verify1Test() throws VerificationException {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        try (MockedStatic<Transaction> transaction = mockStatic(Transaction.class, CALLS_REAL_METHODS)) {
            Transaction transaction2 = new Transaction();
            transaction.when(() -> Transaction.verify(networkMock, transaction2)).thenAnswer((Answer<Void>) invocation -> null);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            //Act Statement(s)
            Transaction.verify(networkParameters, transaction2);
            //Assert statement(s)
            transaction.verify(() -> Transaction.verify(networkMock, transaction2), atLeast(1));
        }
    }
}
