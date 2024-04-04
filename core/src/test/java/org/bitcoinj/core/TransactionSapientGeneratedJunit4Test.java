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
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

public class TransactionSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final AbstractBlockChain abstractBlockChainMock = mock(AbstractBlockChain.class);

    private final AbstractBlockChain chainMock = mock(AbstractBlockChain.class);

    private final Coin coinMock = mock(Coin.class);

    private final Coin coinMock2 = mock(Coin.class);

    private final Coin coinMock3 = mock(Coin.class);

    private final Coin coinMock4 = mock(Coin.class);

    private final Coin coinMock5 = mock(Coin.class);

    private final Coin coinMock6 = mock(Coin.class);

    private final Coin coinMock7 = mock(Coin.class);

    private final ECKey eCKeyMock = mock(ECKey.class);

    private final LockTime.HeightLock lockTimeHeightLockMock = mock(LockTime.HeightLock.class, "toString_lockTime1");

    private final LockTime lockTimeMock = mock(LockTime.class);

    private final Network networkMock = mock(Network.class);

    private final NetworkParameters networkParametersMock = mock(NetworkParameters.class);

    private final Script scriptMock = mock(Script.class);

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);

    private final TransactionBag transactionBagMock = mock(TransactionBag.class);

    private final TransactionConfidence transactionConfidenceMock = mock(TransactionConfidence.class);

    private final TransactionInput transactionInputMock = mock(TransactionInput.class);

    private final Transaction transactionMock = mock(Transaction.class);

    private final TransactionOutPoint transactionOutPointMock = mock(TransactionOutPoint.class);

    private final TransactionOutput transactionOutputMock = mock(TransactionOutput.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${d7724841-767b-37a7-bb26-79191cfc5ea3}, hash: A8C2D7BB2974344F86E05C7DD057A87A
    @Ignore()
    @Test()
    public void coinbaseTest() {
        //Act Statement(s)
        Transaction result = Transaction.coinbase();
        Transaction transaction = new Transaction();
        //Assert statement(s)
        assertThat(result, equalTo(transaction));
    }

    //Sapient generated method id: ${18d8e2c4-9760-3f0d-a105-a71337f77d94}, hash: 0FA6BB6D36C648A16F2301799C0162CF
    @Ignore()
    @Test()
    public void coinbase1Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: tx
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<TransactionInput> transactionInput = mockStatic(TransactionInput.class)) {
            byte[] byteArray = new byte[]{};
            transactionInput.when(() -> TransactionInput.coinbaseInput((Transaction) any(), eq(byteArray))).thenReturn(transactionInputMock);
            //Act Statement(s)
            Transaction result = Transaction.coinbase(byteArray);
            Transaction transaction = new Transaction();
            //Assert statement(s)
            assertThat(result, equalTo(transaction));
            transactionInput.verify(() -> TransactionInput.coinbaseInput((Transaction) any(), eq(byteArray)));
        }
    }

    //Sapient generated method id: ${db344e3b-696d-3b02-8e35-1aaa5300bde6}, hash: CBE7EAC081203E24D01AECBAA87B3894
    @Test()
    public void readTest() throws BufferUnderflowException, ProtocolException {
        //Arrange Statement(s)
        try (MockedStatic<Transaction> transaction = mockStatic(Transaction.class, CALLS_REAL_METHODS)) {
            transaction.when(() -> Transaction.read((ByteBuffer) any(), eq(70013))).thenReturn(transactionMock);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            Transaction result = Transaction.read(byteBuffer);
            //Assert statement(s)
            assertThat(result, equalTo(transactionMock));
            transaction.verify(() -> Transaction.read((ByteBuffer) any(), eq(70013)), atLeast(1));
        }
    }

    //Sapient generated method id: ${b93209b6-2271-325c-97b6-3e385224b9ca}, hash: B41F812AD03941D80D5A32C21AD947C5
    @Ignore()
    @Test()
    public void read1WhenProtocolVersionGreaterThanOrEqualsToWITNESS_VERSIONIntValueThrowsNullPointerException() throws BufferUnderflowException, ProtocolException {
        /* Branches:
         * ((protocolVersion & SERIALIZE_TRANSACTION_NO_WITNESS) == 0) : true  #  inside allowWitness method
         * (protocolVersion >= WITNESS_VERSION.intValue()) : true  #  inside allowWitness method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: tx
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(0L);
            thrown.expect(NullPointerException.class);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            Transaction.read(byteBuffer, 70012);
            //Assert statement(s)
            byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${98fe8058-8584-3703-a9c4-157a8a0a858c}, hash: 47665DA1E508C9306EC939391B79A9DE
    @Ignore()
    @Test()
    public void read1WhenProtocolVersionLessThanWITNESS_VERSIONIntValueThrowsNullPointerException() throws BufferUnderflowException, ProtocolException {
        /* Branches:
         * ((protocolVersion & SERIALIZE_TRANSACTION_NO_WITNESS) == 0) : true  #  inside allowWitness method
         * (protocolVersion >= WITNESS_VERSION.intValue()) : false  #  inside allowWitness method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: tx
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(0L);
            thrown.expect(NullPointerException.class);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            Transaction.read(byteBuffer, 1);
            //Assert statement(s)
            byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${70064fbe-1600-3eb5-a297-6246e2eb55ed}, hash: 648ED404A12888C49E7C2D9121FF40BB
    @Test()
    public void getTxIdTest() throws IOException {
        //Arrange Statement(s)
        Transaction target = spy(new Transaction(networkParametersMock));
        doNothing().when(target).bitcoinSerializeToStream((ByteArrayOutputStream) any(), eq(false));
        //Act Statement(s)
        Sha256Hash result = target.getTxId();
        byte[] byteArray = new byte[]{(byte) 93, (byte) -10, (byte) -32, (byte) -30, (byte) 118, (byte) 19, (byte) 89, (byte) -45, (byte) 10, (byte) -126, (byte) 117, (byte) 5, (byte) -114, (byte) 41, (byte) -97, (byte) -52, (byte) 3, (byte) -127, (byte) 83, (byte) 69, (byte) 69, (byte) -11, (byte) 92, (byte) -12, (byte) 62, (byte) 65, (byte) -104, (byte) 63, (byte) 93, (byte) 76, (byte) -108, (byte) 86};
        Sha256Hash sha256Hash = Sha256Hash.wrapReversed(byteArray);
        //Assert statement(s)
        assertThat(result, equalTo(sha256Hash));
        verify(target).bitcoinSerializeToStream((ByteArrayOutputStream) any(), eq(false));
    }

    //Sapient generated method id: ${634f7b11-d7c0-3128-b104-bcd25286ff5f}, hash: FB54BA17798A4778CD827579C11DC21B
    @Test()
    public void getTxIdWhenCaughtIOExceptionThrowsRuntimeException() throws IOException {
        /* Branches:
         * (catch-exception (IOException)) : true
         */
        //Arrange Statement(s)
        Transaction target = spy(new Transaction(networkParametersMock));
        IOException iOException = new IOException();
        doThrow(iOException).when(target).bitcoinSerializeToStream((ByteArrayOutputStream) any(), eq(false));
        thrown.expect(RuntimeException.class);
        thrown.expectCause(is(instanceOf(IOException.class)));
        //Act Statement(s)
        target.getTxId();
        //Assert statement(s)
        verify(target).bitcoinSerializeToStream((ByteArrayOutputStream) any(), eq(false));
    }

    //Sapient generated method id: ${7da74dc5-104e-32c3-9c84-d79184403010}, hash: C11D4452A6A309D4921D65C2B4A73458
    @Test()
    public void getWTxIdTest() throws IOException {
        //Arrange Statement(s)
        Transaction target = spy(new Transaction(networkParametersMock));
        doReturn(false).when(target).hasWitnesses();
        doNothing().when(target).bitcoinSerializeToStream((ByteArrayOutputStream) any(), eq(false));
        //Act Statement(s)
        Sha256Hash result = target.getWTxId();
        byte[] byteArray = new byte[]{(byte) 93, (byte) -10, (byte) -32, (byte) -30, (byte) 118, (byte) 19, (byte) 89, (byte) -45, (byte) 10, (byte) -126, (byte) 117, (byte) 5, (byte) -114, (byte) 41, (byte) -97, (byte) -52, (byte) 3, (byte) -127, (byte) 83, (byte) 69, (byte) 69, (byte) -11, (byte) 92, (byte) -12, (byte) 62, (byte) 65, (byte) -104, (byte) 63, (byte) 93, (byte) 76, (byte) -108, (byte) 86};
        Sha256Hash sha256Hash = Sha256Hash.wrapReversed(byteArray);
        //Assert statement(s)
        assertThat(result, equalTo(sha256Hash));
        verify(target).hasWitnesses();
        verify(target).bitcoinSerializeToStream((ByteArrayOutputStream) any(), eq(false));
    }

    //Sapient generated method id: ${8d0dd178-30a5-3901-8d72-92bdc3dc24c0}, hash: 4B90C11EF83FE6E860190F31C286ED86
    @Test()
    public void getWTxIdWhenCaughtIOExceptionThrowsRuntimeException() throws IOException {
        /* Branches:
         * (catch-exception (IOException)) : true
         */
        //Arrange Statement(s)
        Transaction target = spy(new Transaction(networkParametersMock));
        doReturn(false).when(target).hasWitnesses();
        IOException iOException = new IOException();
        doThrow(iOException).when(target).bitcoinSerializeToStream((ByteArrayOutputStream) any(), eq(false));
        thrown.expect(RuntimeException.class);
        thrown.expectCause(is(instanceOf(IOException.class)));
        //Act Statement(s)
        target.getWTxId();
        //Assert statement(s)
        verify(target).hasWitnesses();
        verify(target).bitcoinSerializeToStream((ByteArrayOutputStream) any(), eq(false));
    }

    //Sapient generated method id: ${3259c157-b0ca-3db1-a45b-037796bc0614}, hash: 85E83ECCAD0924704637A1AE037496D6
    @Test()
    public void getWeightWhenHasWitnessesNot() throws Throwable, IOException {
        /* Branches:
         * (!hasWitnesses()) : true
         */
        //Arrange Statement(s)
        Transaction target = spy(new Transaction(networkParametersMock));
        doReturn(false).when(target).hasWitnesses();
        doReturn(1).when(target).messageSize();
        //Act Statement(s)
        int result = target.getWeight();
        //Assert statement(s)
        assertThat(result, equalTo(4));
        verify(target).hasWitnesses();
        verify(target).messageSize();
    }

    //Sapient generated method id: ${f0aa877f-379a-313b-a38b-6e84f7bde114}, hash: 3C3376455F1E2923CF37FBA689B52E3C
    @Test()
    public void getWeightWhenHasWitnesses() throws Throwable, IOException {
        /* Branches:
         * (!hasWitnesses()) : false
         */
        //Arrange Statement(s)
        Transaction target = spy(new Transaction(networkParametersMock));
        doReturn(true).when(target).hasWitnesses();
        doNothing().when(target).bitcoinSerializeToStream((ByteArrayOutputStream) any(), eq(false));
        doNothing().when(target).bitcoinSerializeToStream((ByteArrayOutputStream) any(), eq(true));
        //Act Statement(s)
        int result = target.getWeight();
        //Assert statement(s)
        assertThat(result, equalTo(0));
        verify(target).hasWitnesses();
        verify(target).bitcoinSerializeToStream((ByteArrayOutputStream) any(), eq(false));
        verify(target).bitcoinSerializeToStream((ByteArrayOutputStream) any(), eq(true));
    }

    //Sapient generated method id: ${95887f29-e162-3eaa-b55a-6c10aba946b6}, hash: EFE6F3659C390E41E33F34A8D9717B87
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
        Transaction target = spy(new Transaction(networkParametersMock));
        doReturn(true).when(target).hasWitnesses();
        doNothing().when(target).bitcoinSerializeToStream((ByteArrayOutputStream) any(), eq(false));
        doNothing().when(target).bitcoinSerializeToStream((ByteArrayOutputStream) any(), eq(true));
        thrown.expect(Throwable.class);
        //Act Statement(s)
        target.getWeight();
        //Assert statement(s)
        verify(target).hasWitnesses();
        verify(target).bitcoinSerializeToStream((ByteArrayOutputStream) any(), eq(false));
        verify(target).bitcoinSerializeToStream((ByteArrayOutputStream) any(), eq(true));
    }

    //Sapient generated method id: ${5195c0d0-e6d6-3ddb-935d-e50b37af56ca}, hash: 3A1B2827504A21D692B66E40E9590932
    @Test()
    public void getWeightWhenCaughtIOExceptionThrowsRuntimeException() throws IOException {
        /* Branches:
         * (!hasWitnesses()) : false
         * (catch-exception (IOException)) : true
         */
        //Arrange Statement(s)
        Transaction target = spy(new Transaction(networkParametersMock));
        doReturn(true).when(target).hasWitnesses();
        IOException iOException = new IOException();
        doThrow(iOException).when(target).bitcoinSerializeToStream((ByteArrayOutputStream) any(), eq(false));
        thrown.expect(RuntimeException.class);
        thrown.expectCause(is(instanceOf(IOException.class)));
        //Act Statement(s)
        target.getWeight();
        //Assert statement(s)
        verify(target).hasWitnesses();
        verify(target).bitcoinSerializeToStream((ByteArrayOutputStream) any(), eq(false));
    }

    //Sapient generated method id: ${2f8ea1fc-5459-337b-bdf1-33c10af6c373}, hash: 9306928CECA823822C2DDC0A2F7704D5
    @Test()
    public void getVsizeWhenHasWitnessesNot() throws Throwable, IOException {
        /* Branches:
         * (!hasWitnesses()) : true
         */
        //Arrange Statement(s)
        Transaction target = spy(new Transaction(networkParametersMock));
        doReturn(false).when(target).hasWitnesses();
        doReturn(0).when(target).messageSize();
        //Act Statement(s)
        int result = target.getVsize();
        //Assert statement(s)
        assertThat(result, equalTo(0));
        verify(target).hasWitnesses();
        verify(target).messageSize();
    }

    //Sapient generated method id: ${069aaf29-0798-3f58-a130-d738e4411129}, hash: 80B8EFFD543F01B3A06059108C974852
    @Test()
    public void getVsizeWhenHasWitnesses() throws Throwable, IOException {
        /* Branches:
         * (!hasWitnesses()) : false
         */
        //Arrange Statement(s)
        Transaction target = spy(new Transaction(networkParametersMock));
        doReturn(true).when(target).hasWitnesses();
        doReturn(1).when(target).getWeight();
        //Act Statement(s)
        int result = target.getVsize();
        //Assert statement(s)
        assertThat(result, equalTo(1));
        verify(target).hasWitnesses();
        verify(target).getWeight();
    }

    //Sapient generated method id: ${50dbb77c-63e0-34bb-8dfc-b0e28c2b83ce}, hash: F5CAC8AEA80B2A9111BE77DDC9BB6CE6
    @Test()
    public void getInputSumTest() {
        /*
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
            Coin result = target.getInputSum();
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
        }
    }

    //Sapient generated method id: ${b6dd36aa-dc4b-37a1-aee3-0aea643da204}, hash: 099A32226D7FB906B9B45C064E83B20F
    @Test()
    public void getValueSentToMeWhenOutputsIsEmpty() {
        /* Branches:
         * (for-each(outputs)) : false
         */
        //Arrange Statement(s)
        Transaction target = new Transaction(networkParametersMock);
        //Act Statement(s)
        Coin result = target.getValueSentToMe(transactionBagMock);
        Coin coin = Coin.ZERO;
        //Assert statement(s)
        assertThat(result, equalTo(coin));
    }

    //Sapient generated method id: ${b8e00296-6f8e-3eca-b867-306b6a31931f}, hash: AFE602D52D33D0D06C80763645F866ED
    @Test()
    public void getAppearsInHashesWhenAppearsInHashesIsNull() {
        /* Branches:
         * (appearsInHashes != null) : false
         */
        //Arrange Statement(s)
        Transaction target = new Transaction(networkParametersMock);
        //Act Statement(s)
        Map<Sha256Hash, Integer> result = target.getAppearsInHashes();
        //Assert statement(s)
        assertThat(result, is(nullValue()));
    }

    //Sapient generated method id: ${0f2bbef0-f1f9-3dde-8f4c-c7e4ee5c6159}, hash: 73040AC6D8D1B8CC45B0913233779535
    @Test()
    public void isPendingWhenGetConfidenceGetConfidenceTypeEqualsTransactionConfidenceConfidenceTypePENDING() throws IOException {
        /* Branches:
         * (getConfidence().getConfidenceType() == TransactionConfidence.ConfidenceType.PENDING) : true
         */
        //Arrange Statement(s)
        Transaction target = spy(new Transaction(networkParametersMock));
        TransactionConfidence transactionConfidence = new TransactionConfidence(sha256HashMock);
        transactionConfidence.setConfidenceType(TransactionConfidence.ConfidenceType.PENDING);
        doReturn(transactionConfidence).when(target).getConfidence();
        //Act Statement(s)
        boolean result = target.isPending();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(target).getConfidence();
    }

    //Sapient generated method id: ${1279a156-d28b-3b18-a12a-5354eaf54861}, hash: 216AF32A0AF056735D574B6D9937E267
    @Test()
    public void isPendingWhenGetConfidenceGetConfidenceTypeNotEqualsTransactionConfidenceConfidenceTypePENDING() throws IOException {
        /* Branches:
         * (getConfidence().getConfidenceType() == TransactionConfidence.ConfidenceType.PENDING) : false
         */
        //Arrange Statement(s)
        Transaction target = spy(new Transaction(networkParametersMock));
        TransactionConfidence transactionConfidence = new TransactionConfidence(sha256HashMock);
        transactionConfidence.setConfidenceType(TransactionConfidence.ConfidenceType.UNKNOWN);
        doReturn(transactionConfidence).when(target).getConfidence();
        //Act Statement(s)
        boolean result = target.isPending();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(target).getConfidence();
    }

    //Sapient generated method id: ${700efa95-5b61-3284-bb79-ee1d2f6cff55}, hash: 64FA5B21A76F711670A3DF68909E886A
    @Test()
    public void setBlockAppearanceWhenBestChain() throws IOException {
        /* Branches:
         * (bestChain) : true
         * (updateTime == null) : true
         * (bestChain) : true
         */
        //Arrange Statement(s)
        Block blockMock = mock(Block.class);
        Instant instant = Instant.ofEpochSecond(1700000000);
        doReturn(instant).when(blockMock).time();
        doReturn(sha256HashMock).when(blockMock).getHash();
        Transaction target = spy(new Transaction(networkParametersMock));
        doNothing().when(target).addBlockAppearance(sha256HashMock, 0);
        TransactionConfidence transactionConfidence = new TransactionConfidence(sha256HashMock2);
        transactionConfidence.setAppearedAtChainHeight(0);
        doReturn(transactionConfidence).when(target).getConfidence();
        StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 0);
        //Act Statement(s)
        target.setBlockAppearance(storedBlock, true, 0);
        //Assert statement(s)
        verify(blockMock).time();
        verify(blockMock).getHash();
        verify(target).addBlockAppearance(sha256HashMock, 0);
        verify(target).getConfidence();
    }

    //Sapient generated method id: ${77b654fd-34bd-3f3b-a273-d2ed74e9be0c}, hash: D8F48FB3950FB93EA86FCBC0269D9033
    @Test()
    public void addBlockAppearanceWhenAppearsInHashesIsNull() {
        /* Branches:
         * (appearsInHashes == null) : true
         */
        //Arrange Statement(s)
        Transaction target = new Transaction(networkParametersMock);
        //Act Statement(s)
        target.addBlockAppearance(sha256HashMock, 1);
    }

    //Sapient generated method id: ${8adc3bcb-b613-3091-adba-9d3700d51cca}, hash: 02EF802FD8055D2E58A462772DB1C795
    @Test()
    public void getValueSentFromMeWhenInputsIsEmpty() throws ScriptException {
        /* Branches:
         * (for-each(inputs)) : false
         */
        //Arrange Statement(s)
        Transaction target = new Transaction(networkParametersMock);
        //Act Statement(s)
        Coin result = target.getValueSentFromMe(transactionBagMock);
        Coin coin = Coin.ZERO;
        //Assert statement(s)
        assertThat(result, equalTo(coin));
    }

    //Sapient generated method id: ${21e03b1c-0c70-3bfc-945c-9e6e7e89523a}, hash: 22CA9C395C4B3262AA99B1DCFAAA0F84
    @Test()
    public void getOutputSumTest() {
        /*
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
            Coin result = target.getOutputSum();
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            lockTime.verify(() -> LockTime.unset(), atLeast(1));
        }
    }

    //Sapient generated method id: ${b0d20fa9-e250-397e-b581-b3faccc5922b}, hash: D1CE58F15FC0FCD0ADE8CD31CBE1B6AF
    @Test()
    public void getValueTest() throws ScriptException {
        //Arrange Statement(s)
        Transaction target = spy(new Transaction(networkParametersMock));
        doReturn(coinMock).when(target).getValueSentToMe(transactionBagMock);
        doReturn(coinMock2).when(coinMock).subtract(coinMock3);
        doReturn(coinMock3).when(target).getValueSentFromMe(transactionBagMock);
        //Act Statement(s)
        Coin result = target.getValue(transactionBagMock);
        //Assert statement(s)
        assertThat(result, equalTo(coinMock2));
        verify(target).getValueSentToMe(transactionBagMock);
        verify(coinMock).subtract(coinMock3);
        verify(target).getValueSentFromMe(transactionBagMock);
    }

    //Sapient generated method id: ${03f64635-e652-313d-94a5-e7a65907a010}, hash: C659BA63C996ED51ED5B146B790ABCEE
    @Test()
    public void getFeeWhenInputsIsEmpty() {
        /* Branches:
         * (inputs.isEmpty()) : true
         */
        //Arrange Statement(s)
        Transaction target = new Transaction(networkParametersMock);
        //Act Statement(s)
        Coin result = target.getFee();
        //Assert statement(s)
        assertThat(result, is(nullValue()));
    }

    //Sapient generated method id: ${fa93ce72-be3a-30cd-a43d-7914f9aa06ec}, hash: 21FAA361868224293935BB08B7E95055
    @Test()
    public void isAnyOutputSpentWhenOutputsIsEmpty() {
        /* Branches:
         * (for-each(outputs)) : false
         */
        //Arrange Statement(s)
        Transaction target = new Transaction(networkParametersMock);
        //Act Statement(s)
        boolean result = target.isAnyOutputSpent();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${086f8051-19bc-3d5b-867b-c4b4e8d65246}, hash: E80D835424B628B61AF81F146A1F9C9A
    @Test()
    public void isEveryOwnedOutputSpentWhenOutputsIsEmpty() {
        /* Branches:
         * (for-each(outputs)) : false
         */
        //Arrange Statement(s)
        Transaction target = new Transaction(networkParametersMock);
        //Act Statement(s)
        boolean result = target.isEveryOwnedOutputSpent(transactionBagMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${e9bfdd36-2450-3fcf-acd3-621fc4aca48a}, hash: 08B1A1A9C63F753EDC0CE9476CDA7720
    @Test()
    public void updateTimeTest() {
        //Arrange Statement(s)
        Transaction target = new Transaction(networkParametersMock);
        //Act Statement(s)
        Optional<Instant> result = target.updateTime();
        Optional<Instant> instantOptional = Optional.empty();
        //Assert statement(s)
        assertThat(result, equalTo(instantOptional));
    }

    //Sapient generated method id: ${cd95d6c4-8aad-3774-a7da-b341d653ceb4}, hash: 5D9AD1AF9CFCD91A58C78CF0C6E62786
    @Test()
    public void getUpdateTimeTest() {
        //Arrange Statement(s)
        Transaction target = new Transaction(networkParametersMock);
        //Act Statement(s)
        Date result = target.getUpdateTime();
        Optional<Instant> instantOptional = Optional.empty();
        Instant instant2 = Instant.EPOCH;
        Instant instant = (Instant) instantOptional.orElse(instant2);
        Date date = Date.from(instant);
        //Assert statement(s)
        assertThat(result, equalTo(date));
    }

    //Sapient generated method id: ${1429f86f-2ba5-352c-945c-da676a2c462d}, hash: 8307B890DE8BD7E120917F008BD65AF1
    @Test()
    public void setUpdateTimeTest() {
        //Arrange Statement(s)
        Transaction target = new Transaction(networkParametersMock);
        Instant instant = Instant.ofEpochSecond(1700000000);
        //Act Statement(s)
        target.setUpdateTime(instant);
    }

    //Sapient generated method id: ${6df2b9d9-5be1-3a7f-bce7-1cbb29778064}, hash: F88D8A0FF1878396450FD3411CED9FCF
    @Test()
    public void clearUpdateTimeTest() {
        //Arrange Statement(s)
        Transaction target = new Transaction(networkParametersMock);
        //Act Statement(s)
        target.clearUpdateTime();
    }

    //Sapient generated method id: ${e392985a-1d96-3a8e-8cca-737e541c5b93}, hash: F80C1DF204067745D2E32A538C943456
    @Test()
    public void setUpdateTime1WhenUpdateTimeGetTimeGreaterThan0() {
        /* Branches:
         * (updateTime != null) : true
         * (updateTime.getTime() > 0) : true
         */
        //Arrange Statement(s)
        Transaction target = new Transaction(networkParametersMock);
        Date date = new Date();
        //Act Statement(s)
        target.setUpdateTime(date);
    }

    //Sapient generated method id: ${b6013fdd-a037-3352-8753-22b3712113c2}, hash: 34B624CEDA5FC065A36BEBD45A2CFAE5
    @Test()
    public void setUpdateTime1WhenUpdateTimeGetTimeNotGreaterThan0() {
        /* Branches:
         * (updateTime != null) : true
         * (updateTime.getTime() > 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Transaction target = new Transaction(networkParametersMock);
        Date date = new Date();
        //Act Statement(s)
        target.setUpdateTime(date);
    }

    //Sapient generated method id: ${7f27a211-a1fa-32ad-acad-9ca68dcca6db}, hash: 96311D745C823C9DC402DA92A8539E32
    @Test()
    public void hasWitnessesTest() {
        //Arrange Statement(s)
        Transaction target = new Transaction(networkParametersMock);
        //Act Statement(s)
        boolean result = target.hasWitnesses();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${04362ea9-04af-3b46-9581-44d5c7b4f0f5}, hash: 970041AC20642BC67C7275121D6A7DF9
    @Test()
    public void getMessageSizeForPriorityCalcWhenInputsIsEmpty() {
        /* Branches:
         * (for-each(inputs)) : false
         */
        //Arrange Statement(s)
        Transaction target = spy(new Transaction(networkParametersMock));
        doReturn(0).when(target).messageSize();
        //Act Statement(s)
        int result = target.getMessageSizeForPriorityCalc();
        //Assert statement(s)
        assertThat(result, equalTo(0));
        verify(target).messageSize();
    }

    //Sapient generated method id: ${7a813015-0212-3a54-94bb-fa837d73c97b}, hash: D9E582C9CC30807DFBB749BD791472FB
    @Test()
    public void isCoinBaseWhenInputsSizeNotEquals1() {
        /* Branches:
         * (inputs.size() == 1) : false
         */
        //Arrange Statement(s)
        Transaction target = new Transaction(networkParametersMock);
        //Act Statement(s)
        boolean result = target.isCoinBase();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: 3F77D0FA8251B8CCCF663A0039625155
    @Test()
    public void toStringTest() throws Throwable, Exception {
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.unset();
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

    //Sapient generated method id: ${cabd8b84-4f2d-339c-9d46-60cffe26dac3}, hash: B9EF5D38813C73FB4EE55D67B3B8819B
    @Test()
    public void toString1Test() throws Throwable, Exception {
        //Arrange Statement(s)
        Transaction target = spy(new Transaction(networkParametersMock));
        doReturn("return_of_toString1").when(target).toString(abstractBlockChainMock, networkMock, "");
        //Act Statement(s)
        String result = target.toString(abstractBlockChainMock, networkMock);
        //Assert statement(s)
        assertThat(result, equalTo("return_of_toString1"));
        verify(target).toString(abstractBlockChainMock, networkMock, "");
    }

    //Sapient generated method id: ${e3b70c71-7dcb-35ee-a4a5-bcd7f8ab379c}, hash: 0DE1B1E3B89E37E12F5B12F150E05853
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
         */
        //Arrange Statement(s)
        Sha256Hash sha256HashMock = mock(Sha256Hash.class, "toString_sha256Hash1");
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class, "toString_sha256Hash2");
        try (MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class)) {
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(chainMock).estimateBlockTimeInstant(0);
            timeUtils.when(() -> TimeUtils.dateTimeFormat((Instant) any())).thenReturn("A");
            Transaction target = spy(new Transaction(networkParametersMock));
            doReturn(sha256HashMock).when(target).getTxId();
            doReturn(sha256HashMock2).when(target).getWTxId();
            doReturn(2).when(target).getWeight();
            doReturn(2).when(target).messageSize();
            doReturn(0).when(target).getVsize();
            doReturn(true).when(target).isTimeLocked();
            doReturn(lockTimeHeightLockMock).when(target).lockTime();
            doReturn(0).when(lockTimeHeightLockMock).blockHeight();
            doReturn(true).when(target).hasRelativeLockTime();
            doReturn(true).when(target).isOptInFullRBF();
            doReturn(true).when(target).isCoinBase();
            doReturn(coinMock).when(target).getFee();
            doReturn(coinMock3).when(coinMock2).divide(2L);
            doReturn("C").when(coinMock3).toFriendlyString();
            doReturn(coinMock5).when(coinMock4).divide(0L);
            doReturn("E").when(coinMock5).toFriendlyString();
            doReturn(coinMock2, coinMock4, coinMock6).when(coinMock).multiply(1000L);
            doReturn(coinMock7).when(coinMock6).divide(2L);
            doReturn("F").when(coinMock7).toFriendlyString();
            doReturn("J").when(coinMock).toFriendlyString();
            //Act Statement(s)
            String result = target.toString(chainMock, networkMock, (CharSequence) "toString_charSequence1");
            //Assert statement(s)
            assertThat(result, equalTo("toString_charSequence1toString_sha256Hash1, wtxid toString_sha256Hash2\ntoString_charSequence1weight: 2 wu, 0 virtual bytes, 2 bytes\ntoString_charSequence1time locked until toString_lockTime1 (estimated to be reached at A)\ntoString_charSequence1has relative lock time\ntoString_charSequence1opts into full replace-by-fee\ntoString_charSequence1purpose: UNKNOWN\ntoString_charSequence1coinbase\ntoString_charSequence1   fee  C/wu, E/vkB, F/kB  J\n"));
            verify(chainMock).estimateBlockTimeInstant(0);
            timeUtils.verify(() -> TimeUtils.dateTimeFormat((Instant) any()));
            verify(target).getTxId();
            verify(target).getWTxId();
            verify(target).getWeight();
            verify(target).messageSize();
            verify(target).getVsize();
            verify(target).isTimeLocked();
            verify(target).lockTime();
            verify(lockTimeHeightLockMock).blockHeight();
            verify(target).hasRelativeLockTime();
            verify(target).isOptInFullRBF();
            verify(target).isCoinBase();
            verify(target).getFee();
            verify(coinMock, times(3)).multiply(1000L);
            verify(coinMock2).divide(2L);
            verify(coinMock3).toFriendlyString();
            verify(coinMock4).divide(0L);
            verify(coinMock5).toFriendlyString();
            verify(coinMock6).divide(2L);
            verify(coinMock7).toFriendlyString();
            verify(coinMock).toFriendlyString();
        }
    }

    //Sapient generated method id: ${9de02018-cf88-3459-9031-5f2fc3d9bc49}, hash: 34D7342C407A839403F12FB22FCF0C5E
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
         */
        //Arrange Statement(s)
        Sha256Hash sha256HashMock = mock(Sha256Hash.class, "toString_sha256Hash1");
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class, "toString_sha256Hash2");
        try (MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class)) {
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(chainMock).estimateBlockTimeInstant(0);
            timeUtils.when(() -> TimeUtils.dateTimeFormat((Instant) any())).thenReturn("A");
            Transaction target = spy(new Transaction(networkParametersMock));
            doReturn(sha256HashMock).when(target).getTxId();
            doReturn(sha256HashMock2).when(target).getWTxId();
            doReturn(8).when(target).getWeight();
            doReturn(8).when(target).messageSize();
            doReturn(2).when(target).getVsize();
            doReturn(true).when(target).isTimeLocked();
            doReturn(lockTimeHeightLockMock).when(target).lockTime();
            doReturn(0).when(lockTimeHeightLockMock).blockHeight();
            doReturn(true).when(target).hasRelativeLockTime();
            doReturn(true).when(target).isOptInFullRBF();
            doReturn(false).when(target).isCoinBase();
            doReturn(coinMock).when(target).getFee();
            doReturn(coinMock3).when(coinMock2).divide(8L);
            doReturn("F").when(coinMock3).toFriendlyString();
            doReturn(coinMock5).when(coinMock4).divide(2L);
            doReturn("J").when(coinMock5).toFriendlyString();
            doReturn(coinMock2, coinMock4, coinMock6).when(coinMock).multiply(1000L);
            doReturn(coinMock7).when(coinMock6).divide(8L);
            doReturn("Q").when(coinMock7).toFriendlyString();
            doReturn("R").when(coinMock).toFriendlyString();
            //Act Statement(s)
            String result = target.toString(chainMock, networkMock, (CharSequence) "toString_charSequence1");
            //Assert statement(s)
            assertThat(result, equalTo("toString_charSequence1toString_sha256Hash1, wtxid toString_sha256Hash2\ntoString_charSequence1weight: 8 wu, 2 virtual bytes, 8 bytes\ntoString_charSequence1time locked until toString_lockTime1 (estimated to be reached at A)\ntoString_charSequence1has relative lock time\ntoString_charSequence1opts into full replace-by-fee\ntoString_charSequence1purpose: UNKNOWN\ntoString_charSequence1   INCOMPLETE: No inputs!\ntoString_charSequence1   fee  F/wu, J/vkB, Q/kB  R\n"));
            verify(chainMock).estimateBlockTimeInstant(0);
            timeUtils.verify(() -> TimeUtils.dateTimeFormat((Instant) any()));
            verify(target).getTxId();
            verify(target).getWTxId();
            verify(target).getWeight();
            verify(target).messageSize();
            verify(target).getVsize();
            verify(target).isTimeLocked();
            verify(target).lockTime();
            verify(lockTimeHeightLockMock).blockHeight();
            verify(target).hasRelativeLockTime();
            verify(target).isOptInFullRBF();
            verify(target).isCoinBase();
            verify(target).getFee();
            verify(coinMock, times(3)).multiply(1000L);
            verify(coinMock2).divide(8L);
            verify(coinMock3).toFriendlyString();
            verify(coinMock4).divide(2L);
            verify(coinMock5).toFriendlyString();
            verify(coinMock6).divide(8L);
            verify(coinMock7).toFriendlyString();
            verify(coinMock).toFriendlyString();
        }
    }

    //Sapient generated method id: ${888c0a3e-e7bf-370f-bec0-a9d7a0d8f2e1}, hash: 097CB1D00D7CA82149B0CAE077DA9F8B
    @Test()
    public void clearInputsWhenInputsIsEmpty() {
        /* Branches:
         * (for-each(inputs)) : false
         */
        //Arrange Statement(s)
        Transaction target = new Transaction(networkParametersMock);
        //Act Statement(s)
        target.clearInputs();
    }

    //Sapient generated method id: ${70ff7054-de11-3427-bd4a-d4421f95d35a}, hash: 96A0A598BE1E14DADEB4F803449464A1
    @Ignore()
    @Test()
    public void addInputTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.bitcoinj.core.TransactionInput
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Transaction target = new Transaction(networkParametersMock);
        //Act Statement(s)
        TransactionInput result = target.addInput(transactionOutputMock);
        TransactionInput transactionInput = new TransactionInput(target, transactionOutputMock);
        //Assert statement(s)
        assertThat(result, equalTo(transactionInput));
    }

    //Sapient generated method id: ${f16f06bd-2857-3ff9-add1-4b6b29f3d087}, hash: 109124DEC60E486D5577B13EDE74437B
    @Test()
    public void addInput1Test() {
        //Arrange Statement(s)
        Transaction target = new Transaction(networkParametersMock);
        TransactionInput inputMock = mock(TransactionInput.class);
        doNothing().when(inputMock).setParent(target);
        //Act Statement(s)
        TransactionInput result = target.addInput(inputMock);
        //Assert statement(s)
        assertThat(result, equalTo(inputMock));
        verify(inputMock, atLeast(1)).setParent(target);
    }

    //Sapient generated method id: ${11928278-ed37-34b3-a179-c2077c8b9a58}, hash: BEE9CC9681685A629E3DC8AC2E742C34
    @Test()
    public void addInput2Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: input - Method: setParent
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        doReturn(byteArray).when(scriptMock).program();
        Transaction target = new Transaction(networkParametersMock);
        //Act Statement(s)
        TransactionInput result = target.addInput(sha256HashMock, 0L, scriptMock);
        TransactionOutPoint transactionOutPoint = new TransactionOutPoint(0L, sha256HashMock);
        TransactionInput transactionInput = new TransactionInput(target, byteArray, transactionOutPoint);
        //Assert statement(s)
        assertThat(result, equalTo(transactionInput));
        verify(scriptMock).program();
    }

    //Sapient generated method id: ${2be9b991-ef95-30f8-aeb2-c44549d46605}, hash: 063FD22290E9E75DA6D42B4871CA33D9
    @Test()
    public void addSignedInputWhenOutputsIsEmptyThrowsIllegalStateException() throws ScriptException {
        /* Branches:
         * (!outputs.isEmpty()) : false
         */
        //Arrange Statement(s)
        Transaction target = new Transaction(networkParametersMock);
        thrown.expect(IllegalStateException.class);
        //Act Statement(s)
        target.addSignedInput(transactionOutPointMock, scriptMock, coinMock, eCKeyMock, Transaction.SigHash.ALL, false);
    }

    //Sapient generated method id: ${b9a12c0e-10e6-3657-ab48-a29779642696}, hash: 5301829D0A7746155F5B3FFB9DF68DB0
    @Test()
    public void addSignedInput1Test() throws ScriptException, IOException {
        //Arrange Statement(s)
        Transaction target = spy(new Transaction(networkParametersMock));
        doReturn(transactionInputMock).when(target).addSignedInput(transactionOutPointMock, scriptMock, (Coin) null, eCKeyMock, Transaction.SigHash.ALL, false);
        //Act Statement(s)
        TransactionInput result = target.addSignedInput(transactionOutPointMock, scriptMock, eCKeyMock, Transaction.SigHash.ALL, false);
        //Assert statement(s)
        assertThat(result, equalTo(transactionInputMock));
        verify(target).addSignedInput(transactionOutPointMock, scriptMock, (Coin) null, eCKeyMock, Transaction.SigHash.ALL, false);
    }

    //Sapient generated method id: ${ab61adec-3dcb-3bba-b31a-e81c8c241c9b}, hash: 2A0B3582F18215FC8FB98F304176F7C2
    @Test()
    public void addSignedInput2Test() throws ScriptException, IOException {
        //Arrange Statement(s)
        Transaction target = spy(new Transaction(networkParametersMock));
        doReturn(transactionInputMock).when(target).addSignedInput(transactionOutPointMock, scriptMock, coinMock, eCKeyMock, Transaction.SigHash.ALL, false);
        //Act Statement(s)
        TransactionInput result = target.addSignedInput(transactionOutPointMock, scriptMock, coinMock, eCKeyMock);
        //Assert statement(s)
        assertThat(result, equalTo(transactionInputMock));
        verify(target).addSignedInput(transactionOutPointMock, scriptMock, coinMock, eCKeyMock, Transaction.SigHash.ALL, false);
    }

    //Sapient generated method id: ${eeb81b1d-a4a2-3f3b-ad6e-4e5264ecc85d}, hash: 6FC756F73C9E20E51A568B798B81B919
    @Test()
    public void addSignedInput3Test() throws ScriptException, IOException {
        //Arrange Statement(s)
        Transaction target = spy(new Transaction(networkParametersMock));
        doReturn(transactionInputMock).when(target).addSignedInput(transactionOutPointMock, scriptMock, (Coin) null, eCKeyMock);
        //Act Statement(s)
        TransactionInput result = target.addSignedInput(transactionOutPointMock, scriptMock, eCKeyMock);
        //Assert statement(s)
        assertThat(result, equalTo(transactionInputMock));
        verify(target).addSignedInput(transactionOutPointMock, scriptMock, (Coin) null, eCKeyMock);
    }

    //Sapient generated method id: ${07a2fea1-5daf-33a2-a532-432e6258d084}, hash: A1986A5C9FF9703F93D9FE31957C894D
    @Test()
    public void addSignedInput4Test() throws IOException {
        //Arrange Statement(s)
        Transaction target = spy(new Transaction(networkParametersMock));
        doReturn(transactionInputMock).when(target).addSignedInput(transactionOutputMock, eCKeyMock, Transaction.SigHash.ALL, false);
        //Act Statement(s)
        TransactionInput result = target.addSignedInput(transactionOutputMock, eCKeyMock);
        //Assert statement(s)
        assertThat(result, equalTo(transactionInputMock));
        verify(target).addSignedInput(transactionOutputMock, eCKeyMock, Transaction.SigHash.ALL, false);
    }

    //Sapient generated method id: ${abd3055c-2b18-3dc9-a8d2-94c81fd9c0aa}, hash: 3C33592547D92C87A870A5F677262D46
    @Test()
    public void clearOutputsWhenOutputsIsEmpty() {
        /* Branches:
         * (for-each(outputs)) : false
         */
        //Arrange Statement(s)
        Transaction target = new Transaction(networkParametersMock);
        //Act Statement(s)
        target.clearOutputs();
    }

    //Sapient generated method id: ${e38c18ec-215c-383a-9e77-1b41668872b0}, hash: 931763C02F6C7A878D6F2CC4025C1E15
    @Test()
    public void addOutputTest() {
        //Arrange Statement(s)
        Transaction target = new Transaction(networkParametersMock);
        TransactionOutput toMock = mock(TransactionOutput.class);
        doNothing().when(toMock).setParent(target);
        //Act Statement(s)
        TransactionOutput result = target.addOutput(toMock);
        //Assert statement(s)
        assertThat(result, equalTo(toMock));
        verify(toMock, atLeast(1)).setParent(target);
    }

    //Sapient generated method id: ${3ea2a2a2-4237-3c0a-a56a-9ba2d5a7639a}, hash: 6C0AFD48B85E7D8F4B0B5AEA23502DA2
    @Ignore()
    @Test()
    public void addOutput1Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.bitcoinj.core.TransactionOutput
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Transaction target = new Transaction(networkParametersMock);
        Address addressMock = mock(Address.class);
        //Act Statement(s)
        TransactionOutput result = target.addOutput(coinMock, addressMock);
        TransactionOutput transactionOutput = new TransactionOutput(target, coinMock, addressMock);
        //Assert statement(s)
        assertThat(result, equalTo(transactionOutput));
    }

    //Sapient generated method id: ${1d0f2b67-a741-3ebf-b21c-cf561cbbd91c}, hash: AF8A7046B015CB26EFFEA6633C8B0CBB
    @Ignore()
    @Test()
    public void addOutput2Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.bitcoinj.core.TransactionOutput
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Transaction target = new Transaction(networkParametersMock);
        //Act Statement(s)
        TransactionOutput result = target.addOutput(coinMock, eCKeyMock);
        TransactionOutput transactionOutput = new TransactionOutput(target, coinMock, eCKeyMock);
        //Assert statement(s)
        assertThat(result, equalTo(transactionOutput));
    }

    //Sapient generated method id: ${85ae1bc5-dae1-3bbb-826d-d8dd978a09a4}, hash: F565E1C4304D34034F067F955E9401BC
    @Ignore()
    @Test()
    public void addOutput3Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: to - Method: setParent
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        doReturn(byteArray).when(scriptMock).program();
        Transaction target = new Transaction(networkParametersMock);
        //Act Statement(s)
        TransactionOutput result = target.addOutput(coinMock, scriptMock);
        TransactionOutput transactionOutput = new TransactionOutput(target, coinMock, byteArray);
        //Assert statement(s)
        assertThat(result, equalTo(transactionOutput));
        verify(scriptMock).program();
    }

    //Sapient generated method id: ${1b6d75f8-462d-35e2-acf4-3142c16b9c1b}, hash: D0EC8BF319870E08DA1D81F82B9BB35E
    @Ignore()
    @Test()
    public void hashForSignature2ThrowsNullPointerException() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Transaction> transaction = mockStatic(Transaction.class)) {
            Transaction transaction2 = new Transaction();
            transaction.when(() -> Transaction.read((ByteBuffer) any())).thenReturn(transaction2);
            Transaction target = spy(new Transaction(networkParametersMock));
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(target).serialize();
            thrown.expect(NullPointerException.class);
            byte[] byteArray2 = new byte[]{};
            //Act Statement(s)
            target.hashForSignature(0, byteArray2, (byte) 0);
            //Assert statement(s)
            transaction.verify(() -> Transaction.read((ByteBuffer) any()));
            verify(target).serialize();
        }
    }

    //Sapient generated method id: ${7fa603de-13bd-38ff-b614-c21a81ba53c1}, hash: 6807101A36B715949F7830FFC740D784
    @Test()
    public void hashForWitnessSignature2WhenInputIndexLessThanOutputsSizeThrowsIndexOutOfBoundsException() {
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
        Transaction target = new Transaction(networkParametersMock);
        thrown.expect(IndexOutOfBoundsException.class);
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        target.hashForWitnessSignature(0, byteArray, coinMock, (byte) 0);
    }

    //Sapient generated method id: ${36379ab5-3a96-3014-a817-ff9bf886e250}, hash: 9FBF882CD3923B85811716BF044F306F
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
         */
        //Arrange Statement(s)
        Transaction target = new Transaction(networkParametersMock);
        thrown.expect(IndexOutOfBoundsException.class);
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        target.hashForWitnessSignature(0, byteArray, coinMock, (byte) 0);
    }

    //Sapient generated method id: ${8625aa71-4b9e-3c3d-acbc-811a62ba21cc}, hash: A75F87B401CC4074DBE6A4CAFBF9823A
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
        Transaction target = spy(new Transaction(networkParametersMock));
        doReturn(false).when(target).hasWitnesses();
        //Act Statement(s)
        int result = target.messageSize();
        //Assert statement(s)
        assertThat(result, equalTo(10));
        verify(target).hasWitnesses();
    }

    //Sapient generated method id: ${ae4bb6f9-d917-3b2e-bd24-dc16ffc7ed71}, hash: CD57E92799AD6CC4CA267D4BA2CDA722
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
        Transaction target = spy(new Transaction(networkParametersMock));
        doReturn(true).when(target).hasWitnesses();
        //Act Statement(s)
        int result = target.messageSize();
        //Assert statement(s)
        assertThat(result, equalTo(12));
        verify(target).hasWitnesses();
    }

    //Sapient generated method id: ${579ab5cb-7ae0-384b-a85d-05035122f633}, hash: EDA9A0A5BDAC198D42637935414E3348
    @Test()
    public void bitcoinSerializeToStreamWhenHasWitnessesNot() throws IOException {
        /* Branches:
         * (hasWitnesses()) : false
         */
        //Arrange Statement(s)
        Transaction target = spy(new Transaction(networkParametersMock));
        doReturn(false).when(target).hasWitnesses();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        doNothing().when(target).bitcoinSerializeToStream(byteArrayOutputStream, false);
        //Act Statement(s)
        target.bitcoinSerializeToStream(byteArrayOutputStream);
        //Assert statement(s)
        verify(target).hasWitnesses();
        verify(target).bitcoinSerializeToStream(byteArrayOutputStream, false);
    }

    //Sapient generated method id: ${6e475e68-a7fb-34de-8130-10d79c0dbac2}, hash: 9B0854BAD34BDFC47B811E0A5E8FBF84
    @Test()
    public void bitcoinSerializeToStreamWhenAllowWitnessProtocolVersion() throws IOException {
        /* Branches:
         * (hasWitnesses()) : true
         * ((protocolVersion & SERIALIZE_TRANSACTION_NO_WITNESS) == 0) : true  #  inside allowWitness method
         * (protocolVersion >= WITNESS_VERSION.intValue()) : true  #  inside allowWitness method
         * (allowWitness(protocolVersion)) : true
         */
        //Arrange Statement(s)
        Transaction target = spy(new Transaction(networkParametersMock));
        doReturn(true).when(target).hasWitnesses();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        doNothing().when(target).bitcoinSerializeToStream(byteArrayOutputStream, true);
        //Act Statement(s)
        target.bitcoinSerializeToStream(byteArrayOutputStream);
        //Assert statement(s)
        verify(target).hasWitnesses();
        verify(target).bitcoinSerializeToStream(byteArrayOutputStream, true);
    }

    //Sapient generated method id: ${12b71ddf-46d3-38c6-91f7-5dda351bef4b}, hash: 6EDA82E707A63687BB9B4DF3F996FF02
    @Test()
    public void bitcoinSerializeToStream1WhenInputsIsEmpty() throws IOException {
        /* Branches:
         * (useSegwit) : true
         * (for-each(inputs)) : false
         * (for-each(outputs)) : false
         * (useSegwit) : true
         * (for-each(inputs)) : false
         */
        //Arrange Statement(s)
        Transaction target = new Transaction(networkParametersMock);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        //Act Statement(s)
        target.bitcoinSerializeToStream(byteArrayOutputStream, true);
    }

    //Sapient generated method id: ${b6bdd736-515d-3ce2-a7b9-aabdc1f56490}, hash: E8A18EA934EFFB0DABBB8337A1E82BBC
    @Test()
    public void lockTimeTest() {
        //Arrange Statement(s)
        Transaction target = new Transaction(networkParametersMock);
        //Act Statement(s)
        LockTime result = target.lockTime();
        LockTime lockTime = LockTime.unset();
        //Assert statement(s)
        assertThat(result, equalTo(lockTime));
    }

    //Sapient generated method id: ${89466d45-82bd-3235-99c6-eb8cea642893}, hash: 18F15F727734F2B02DCFF5A7DF92F394
    @Test()
    public void getLockTimeTest() {
        //Arrange Statement(s)
        Transaction target = spy(new Transaction(networkParametersMock));
        doReturn(lockTimeMock).when(target).lockTime();
        doReturn(0L).when(lockTimeMock).rawValue();
        //Act Statement(s)
        long result = target.getLockTime();
        //Assert statement(s)
        assertThat(result, equalTo(0L));
        verify(target).lockTime();
        verify(lockTimeMock).rawValue();
    }

    //Sapient generated method id: ${3ae04627-d8c8-37fe-956f-f3dd05cd6f42}, hash: 844640AABAA6468396D0530459AD3F0F
    @Test()
    public void setLockTimeWhenNotSeqNumSet() {
        /* Branches:
         * (for-each(inputs)) : false
         * (lockTime != 0) : true
         * (!seqNumSet) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class, CALLS_REAL_METHODS)) {
            lockTime.when(() -> LockTime.of(1L)).thenReturn(lockTimeMock);
            Transaction target = new Transaction(networkParametersMock);
            //Act Statement(s)
            target.setLockTime(1L);
            //Assert statement(s)
            lockTime.verify(() -> LockTime.of(1L), atLeast(1));
        }
    }

    //Sapient generated method id: ${ce0ee48c-549e-3a9e-a70c-6d9610fd4274}, hash: A58E98A3FBDB91B55D1F49A9D6C056AC
    @Test()
    public void setVersionTest() {
        //Arrange Statement(s)
        Transaction target = new Transaction(networkParametersMock);
        //Act Statement(s)
        target.setVersion(1);
        //Assert statement(s)
        assertThat(target.getVersion(), equalTo(1L));
    }

    //Sapient generated method id: ${8dfc1a7b-6904-35a1-9585-80ff6236301f}, hash: A1B4A8ADBC5074163DE167718138C9AC
    @Test()
    public void getInputsTest() {
        //Arrange Statement(s)
        Transaction target = new Transaction(networkParametersMock);
        //Act Statement(s)
        List<TransactionInput> result = target.getInputs();
        //Assert statement(s)
        assertThat(result.size(), equalTo(0));
    }

    //Sapient generated method id: ${3478c670-ca0a-3479-8a43-51792b04008f}, hash: 3AE8CBD46207CE16FD20832AB71A275C
    @Test()
    public void getOutputsTest() {
        //Arrange Statement(s)
        Transaction target = new Transaction(networkParametersMock);
        //Act Statement(s)
        List<TransactionOutput> result = target.getOutputs();
        //Assert statement(s)
        assertThat(result.size(), equalTo(0));
    }

    //Sapient generated method id: ${e128b207-5fbd-35c8-b873-7d7c64ef9f70}, hash: DA5A76247EAB8DC012E2F5CC196083AE
    @Test()
    public void getWalletOutputsWhenOutputsIsEmpty() {
        /* Branches:
         * (for-each(outputs)) : false
         */
        //Arrange Statement(s)
        Transaction target = new Transaction(networkParametersMock);
        //Act Statement(s)
        List<TransactionOutput> result = target.getWalletOutputs(transactionBagMock);
        //Assert statement(s)
        assertThat(result.size(), equalTo(0));
    }

    //Sapient generated method id: ${5a233e5a-dd8b-3414-92f4-8bd1a475d96c}, hash: 54AA956FF2074CB30A7C2757CEC7C83D
    @Test()
    public void shuffleOutputsTest() {
        //Arrange Statement(s)
        Transaction target = new Transaction(networkParametersMock);
        //Act Statement(s)
        target.shuffleOutputs();
    }

    //Sapient generated method id: ${63c6b84d-12ae-39dc-b28a-8f1d9bf24bcd}, hash: 2AE76081FDF1C783BEC33079BA4B9383
    @Test()
    public void getInputThrowsIndexOutOfBoundsException() {
        //Arrange Statement(s)
        Transaction target = new Transaction(networkParametersMock);
        thrown.expect(IndexOutOfBoundsException.class);
        //Act Statement(s)
        target.getInput(0L);
    }

    //Sapient generated method id: ${a2d174cb-a6d9-391f-9a1e-2acc7a32643f}, hash: 2B667F511994DC8B96F2D67A462499E7
    @Test()
    public void getOutputThrowsIndexOutOfBoundsException() {
        //Arrange Statement(s)
        Transaction target = new Transaction(networkParametersMock);
        thrown.expect(IndexOutOfBoundsException.class);
        //Act Statement(s)
        target.getOutput(0L);
    }

    //Sapient generated method id: ${82d66314-9b50-39f0-a4f8-5ea7afe68b7e}, hash: 86C697B3CDED3B49EB59F01BCABD0ED4
    @Test()
    public void getOutput1ThrowsIndexOutOfBoundsException() {
        //Arrange Statement(s)
        TransactionOutPoint outpointMock = mock(TransactionOutPoint.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(sha256HashMock).when(outpointMock).hash();
            doReturn(0L).when(outpointMock).index();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Transaction target = spy(new Transaction(networkParametersMock));
            doReturn(sha256HashMock2).when(target).getTxId();
            thrown.expect(IndexOutOfBoundsException.class);
            //Act Statement(s)
            target.getOutput(outpointMock);
            //Assert statement(s)
            verify(outpointMock).hash();
            verify(outpointMock).index();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            verify(target).getTxId();
        }
    }

    //Sapient generated method id: ${e0f628a0-f995-3333-a61a-03a5a2a7ee43}, hash: A3BF5194873E77B954B820795DCC8605
    @Ignore()
    @Test()
    public void getConfidenceTest() throws IOException {
        //Arrange Statement(s)
        Transaction target = spy(new Transaction(networkParametersMock));
        doReturn(transactionConfidenceMock).when(target).getConfidence((Context) any());
        //Act Statement(s)
        TransactionConfidence result = target.getConfidence();
        //Assert statement(s)
        assertThat(result, equalTo(transactionConfidenceMock));
        verify(target).getConfidence((Context) any());
    }

    //Sapient generated method id: ${6998a3d8-0aaa-3590-8d1e-c5c2d4b882a7}, hash: 7027D9615E5E4A48D69333ADC7E64CC0
    @Test()
    public void getConfidence1Test() throws IOException {
        //Arrange Statement(s)
        Context contextMock = mock(Context.class);
        TxConfidenceTable txConfidenceTableMock = mock(TxConfidenceTable.class);
        doReturn(txConfidenceTableMock).when(contextMock).getConfidenceTable();
        Transaction target = spy(new Transaction(networkParametersMock));
        doReturn(transactionConfidenceMock).when(target).getConfidence(txConfidenceTableMock);
        //Act Statement(s)
        TransactionConfidence result = target.getConfidence(contextMock);
        //Assert statement(s)
        assertThat(result, equalTo(transactionConfidenceMock));
        verify(contextMock).getConfidenceTable();
        verify(target).getConfidence(txConfidenceTableMock);
    }

    //Sapient generated method id: ${8f12b70b-8b65-329c-a64b-4879fa033a83}, hash: A6AE0CC5EBCD6EBF6F48D5C7D7A43AE1
    @Test()
    public void getConfidence2WhenConfidenceIsNull() throws IOException {
        /* Branches:
         * (confidence == null) : true
         */
        //Arrange Statement(s)
        TxConfidenceTable tableMock = mock(TxConfidenceTable.class);
        doReturn(transactionConfidenceMock).when(tableMock).getOrCreate(sha256HashMock);
        Transaction target = spy(new Transaction(networkParametersMock));
        doReturn(sha256HashMock).when(target).getTxId();
        //Act Statement(s)
        TransactionConfidence result = target.getConfidence(tableMock);
        //Assert statement(s)
        assertThat(result, equalTo(transactionConfidenceMock));
        verify(tableMock).getOrCreate(sha256HashMock);
        verify(target).getTxId();
    }

    //Sapient generated method id: ${156136d9-1e9b-36fe-a37e-0ccdaa82232c}, hash: 98FB8DE9B7B0A402C760C36E0E9BC9E6
    @Test()
    public void hasConfidenceWhenGetConfidenceGetConfidenceTypeNotEqualsTransactionConfidenceConfidenceTypeUNKNOWN() throws IOException {
        /* Branches:
         * (getConfidence().getConfidenceType() != TransactionConfidence.ConfidenceType.UNKNOWN) : true
         */
        //Arrange Statement(s)
        Transaction target = spy(new Transaction(networkParametersMock));
        TransactionConfidence transactionConfidence = new TransactionConfidence(sha256HashMock);
        transactionConfidence.setConfidenceType(TransactionConfidence.ConfidenceType.IN_CONFLICT);
        doReturn(transactionConfidence).when(target).getConfidence();
        //Act Statement(s)
        boolean result = target.hasConfidence();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(target).getConfidence();
    }

    //Sapient generated method id: ${0bd2e753-2c9e-39bb-a07f-d82da42e7fda}, hash: 5AE28D4B8E35CA90125E9D704E67751F
    @Test()
    public void hasConfidenceWhenGetConfidenceGetConfidenceTypeEqualsTransactionConfidenceConfidenceTypeUNKNOWN() throws IOException {
        /* Branches:
         * (getConfidence().getConfidenceType() != TransactionConfidence.ConfidenceType.UNKNOWN) : false
         */
        //Arrange Statement(s)
        Transaction target = spy(new Transaction(networkParametersMock));
        TransactionConfidence transactionConfidence = new TransactionConfidence(sha256HashMock);
        transactionConfidence.setConfidenceType(TransactionConfidence.ConfidenceType.UNKNOWN);
        doReturn(transactionConfidence).when(target).getConfidence();
        //Act Statement(s)
        boolean result = target.hasConfidence();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(target).getConfidence();
    }

    //Sapient generated method id: ${9091306c-7701-380b-8798-2877eb2ec6bb}, hash: CF2F006EDBF6D3A6D5F4B23ABC7589C8
    @Test()
    public void getSigOpCountWhenOutputsIsEmpty() throws ScriptException {
        /* Branches:
         * (for-each(inputs)) : false
         * (for-each(outputs)) : false
         */
        //Arrange Statement(s)
        Transaction target = new Transaction(networkParametersMock);
        //Act Statement(s)
        int result = target.getSigOpCount();
        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${98023a58-30e3-317a-a3fd-94d561c3cc36}, hash: 8A2747EA253F47D815AA6ED3E8171490
    @Test()
    public void checkCoinBaseHeightWhenHeightGreaterThanOrEqualsToBlockBLOCK_HEIGHT_GENESISThrowsIndexOutOfBoundsException() throws VerificationException {
        /* Branches:
         * (height >= Block.BLOCK_HEIGHT_GENESIS) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkState(false)).thenAnswer((Answer<Void>) invocation -> null);
            Transaction target = spy(new Transaction(networkParametersMock));
            doReturn(false).when(target).isCoinBase();
            thrown.expect(IndexOutOfBoundsException.class);
            //Act Statement(s)
            target.checkCoinBaseHeight(0);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            verify(target, atLeast(1)).isCoinBase();
        }
    }

    //Sapient generated method id: ${ac97d863-012c-3071-8fae-d1f8a8d3ac4e}, hash: 961D1524C572B80EED98FD828C082DCF
    @Test()
    public void checkCoinBaseHeightWhenHeightLessThanBlockBLOCK_HEIGHT_GENESISThrowsIllegalArgumentException() throws VerificationException {
        /* Branches:
         * (height >= Block.BLOCK_HEIGHT_GENESIS) : false
         */
        //Arrange Statement(s)
        Transaction target = new Transaction(networkParametersMock);
        thrown.expect(IllegalArgumentException.class);
        //Act Statement(s)
        target.checkCoinBaseHeight(-1);
    }

    //Sapient generated method id: ${a66146ab-0650-37a9-b8fc-b38d5ba61f4a}, hash: 696FB1B7CA0E0929A1F69A84AE8E7793
    @Test()
    public void findWitnessCommitmentTest() {
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkState(false)).thenAnswer((Answer<Void>) invocation -> null);
            Transaction target = spy(new Transaction(networkParametersMock));
            doReturn(false).when(target).isCoinBase();
            //Act Statement(s)
            Sha256Hash result = target.findWitnessCommitment();
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            verify(target).isCoinBase();
        }
    }

    //Sapient generated method id: ${b58590c4-202d-3e62-97cc-b121f8cd5f7d}, hash: 22951E8A2B62710504000765EC6D1D7F
    @Test()
    public void isTimeLockedWhenLockTimeNotIsSet() {
        /* Branches:
         * (!lockTime().isSet()) : true
         */
        //Arrange Statement(s)
        Transaction target = spy(new Transaction(networkParametersMock));
        doReturn(lockTimeMock).when(target).lockTime();
        doReturn(false).when(lockTimeMock).isSet();
        //Act Statement(s)
        boolean result = target.isTimeLocked();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(target).lockTime();
        verify(lockTimeMock).isSet();
    }

    //Sapient generated method id: ${93673cac-9b70-3010-92fb-088ea8d0e675}, hash: C9C0C71E02E348E9F55D35BB50A6A3FD
    @Test()
    public void isTimeLockedWhenGetInputsIsEmpty() {
        /* Branches:
         * (!lockTime().isSet()) : false
         * (for-each(getInputs())) : false
         */
        //Arrange Statement(s)
        Transaction target = spy(new Transaction(networkParametersMock));
        doReturn(lockTimeMock).when(target).lockTime();
        doReturn(true).when(lockTimeMock).isSet();
        //Act Statement(s)
        boolean result = target.isTimeLocked();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(target).lockTime();
        verify(lockTimeMock).isSet();
    }

    //Sapient generated method id: ${6cfc9954-7b5f-3147-9690-66b08315924c}, hash: 1EDF8D9B4AD79C4F0608A87A891E878E
    @Test()
    public void hasRelativeLockTimeWhenVersionLessThan2() {
        /* Branches:
         * (version < 2) : true
         */
        //Arrange Statement(s)
        Transaction target = new Transaction(networkParametersMock);
        //Act Statement(s)
        boolean result = target.hasRelativeLockTime();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${b656367b-b883-3b33-bb36-81d1b8360f34}, hash: ED4227EAE72BB2142213DF26A1721441
    @Test()
    public void isOptInFullRBFWhenGetInputsIsEmpty() {
        /* Branches:
         * (for-each(getInputs())) : false
         */
        //Arrange Statement(s)
        Transaction target = new Transaction(networkParametersMock);
        //Act Statement(s)
        boolean result = target.isOptInFullRBF();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${7b02502c-ef46-3f35-b1c9-a5047100e9d7}, hash: 0A0A6E0495B008DE2526725F388CBE4B
    @Test()
    public void isFinalWhenIsTimeLockedNot() {
        /* Branches:
         * (locktime instanceof HeightLock) : false
         * (locktime.rawValue() < (locktime instanceof HeightLock ? height : blockTimeSeconds)) : false
         * (!isTimeLocked()) : true
         */
        //Arrange Statement(s)
        Transaction target = spy(new Transaction(networkParametersMock));
        doReturn(lockTimeMock).when(target).lockTime();
        doReturn(1L).when(lockTimeMock).rawValue();
        doReturn(false).when(target).isTimeLocked();
        //Act Statement(s)
        boolean result = target.isFinal(0, 1L);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(target).lockTime();
        verify(lockTimeMock).rawValue();
        verify(target).isTimeLocked();
    }

    //Sapient generated method id: ${f2740b29-992c-3d3c-bbe7-4e6eb903ad9b}, hash: C746567E8695FA55F831A2A581CB2F30
    @Test()
    public void isFinalWhenIsTimeLocked() {
        /* Branches:
         * (locktime instanceof HeightLock) : false
         * (locktime.rawValue() < (locktime instanceof HeightLock ? height : blockTimeSeconds)) : false
         * (!isTimeLocked()) : false
         */
        //Arrange Statement(s)
        Transaction target = spy(new Transaction(networkParametersMock));
        doReturn(lockTimeMock).when(target).lockTime();
        doReturn(1L).when(lockTimeMock).rawValue();
        doReturn(true).when(target).isTimeLocked();
        //Act Statement(s)
        boolean result = target.isFinal(0, 1L);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(target).lockTime();
        verify(lockTimeMock).rawValue();
        verify(target).isTimeLocked();
    }

    //Sapient generated method id: ${42d406ce-1144-3545-b338-a8512a479e42}, hash: 4EB7B52E6AEBB5C13630AFA15CA55C95
    @Test()
    public void estimateUnlockTimeWhenLocktimeInstanceOfHeightLock() {
        /* Branches:
         * (locktime instanceof HeightLock) : true
         */
        //Arrange Statement(s)
        Instant instant = Instant.ofEpochSecond(1700000000);
        doReturn(instant).when(chainMock).estimateBlockTimeInstant(0);
        Transaction target = spy(new Transaction(networkParametersMock));
        LockTime.HeightLock lockTimeHeightLockMock = mock(LockTime.HeightLock.class);
        doReturn(lockTimeHeightLockMock).when(target).lockTime();
        doReturn(0).when(lockTimeHeightLockMock).blockHeight();
        //Act Statement(s)
        Instant result = target.estimateUnlockTime(chainMock);
        //Assert statement(s)
        assertThat(result, equalTo(instant));
        verify(chainMock).estimateBlockTimeInstant(0);
        verify(target).lockTime();
        verify(lockTimeHeightLockMock).blockHeight();
    }

    //Sapient generated method id: ${9c2c9194-3121-3159-acad-a7f98db99c7c}, hash: 4A72FCF5A7CAE73A8A71DCD3F5E07FDC
    @Test()
    public void estimateUnlockTimeWhenLocktimeNotInstanceOfHeightLock() {
        /* Branches:
         * (locktime instanceof HeightLock) : false
         */
        //Arrange Statement(s)
        Transaction target = spy(new Transaction(networkParametersMock));
        LockTime.TimeLock lockTimeTimeLockMock = mock(LockTime.TimeLock.class);
        doReturn(lockTimeTimeLockMock).when(target).lockTime();
        Instant instant = Instant.ofEpochSecond(1700000000);
        doReturn(instant).when(lockTimeTimeLockMock).timestamp();
        //Act Statement(s)
        Instant result = target.estimateUnlockTime(abstractBlockChainMock);
        //Assert statement(s)
        assertThat(result, equalTo(instant));
        verify(target).lockTime();
        verify(lockTimeTimeLockMock).timestamp();
    }

    //Sapient generated method id: ${d9d5541e-bdaa-3efa-a9e9-6be7a2ab1021}, hash: 271A971279E726368D8EA01278E2BC9F
    @Test()
    public void estimateLockTimeTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        AbstractBlockChain abstractBlockChainMock = mock(AbstractBlockChain.class, "AbstractBlockChain");
        try (MockedStatic<LockTime> lockTime = mockStatic(LockTime.class)) {
            LockTime lockTime2 = LockTime.unset();
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

    //Sapient generated method id: ${643f20a7-23a0-3bf8-b652-405708f718e7}, hash: 555BF8CE85E370A2F1A0F491BD4985AA
    @Ignore()
    @Test()
    public void verifyThrowsNullPointerException() throws VerificationException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        thrown.expect(NullPointerException.class);
        Transaction transaction = new Transaction();
        //Act Statement(s)
        Transaction.verify(networkMock, transaction);
    }

    //Sapient generated method id: ${5868dff5-2474-3edf-9500-5c55898bac2b}, hash: 7CB80C3FAF13DB5B7AB025692FDE92CD
    @Test()
    public void verify1Test() throws VerificationException {
        //Arrange Statement(s)
        NetworkParameters paramsMock = mock(NetworkParameters.class);
        try (MockedStatic<Transaction> transaction = mockStatic(Transaction.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock).when(paramsMock).network();
            transaction.when(() -> Transaction.verify(networkMock, transactionMock)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            Transaction.verify(paramsMock, transactionMock);
            //Assert statement(s)
            verify(paramsMock, atLeast(1)).network();
            transaction.verify(() -> Transaction.verify(networkMock, transactionMock), atLeast(1));
        }
    }
}
