package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.nio.BufferUnderflowException;
import java.nio.BufferOverflowException;

import org.bitcoinj.script.ScriptException;
import org.junit.rules.ExpectedException;

import java.util.List;

import org.bitcoinj.wallet.KeyBag;
import org.bitcoinj.wallet.DefaultRiskAnalysis;
import org.bitcoinj.base.VarInt;
import org.bitcoinj.script.ScriptError;
import org.bitcoinj.base.Coin;

import java.util.Map;

import org.bitcoinj.base.internal.ByteUtils;

import java.util.HashMap;
import java.util.ArrayList;

import org.bitcoinj.script.Script;

import java.util.EnumSet;
import java.nio.ByteBuffer;

import org.bitcoinj.base.internal.Preconditions;
import org.bitcoinj.base.Sha256Hash;
import org.bitcoinj.wallet.RedeemData;
import org.mockito.MockedStatic;
import org.bitcoinj.base.internal.Buffers;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

public class TransactionInputSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final TransactionOutPoint outpointMock = mock(TransactionOutPoint.class, "<init>_transactionOutPoint1");

    private final TransactionOutput outputMock = mock(TransactionOutput.class);

    private final Script scriptMock = mock(Script.class, "toString_script1");

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    private final Transaction transactionMock = mock(Transaction.class);

    private final Transaction transactionMock2 = mock(Transaction.class);

    private final TransactionOutPoint transactionOutPointMock = mock(TransactionOutPoint.class);

    private final TransactionOutput transactionOutputMock = mock(TransactionOutput.class);

    private final Coin valueMock = mock(Coin.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${40f12486-3699-36e2-aaba-be7af4a8b4c1}, hash: BA107ED19F14E8A8480CD1B96C35E7C4
    @Test()
    public void coinbaseInputWhenScriptBytesLengthGreaterThan100ThrowsIllegalArgumentException() {
        /* Branches:
         * (scriptBytes.length >= 2) : true
         * (scriptBytes.length <= 100) : false
         */
        //Arrange Statement(s)
        thrown.expect(IllegalArgumentException.class);
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 37, (byte) 38, (byte) 39, (byte) 40, (byte) 41, (byte) 42, (byte) 43, (byte) 44, (byte) 45, (byte) 46, (byte) 47, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 58, (byte) 59, (byte) 60, (byte) 61, (byte) 62, (byte) 63, (byte) 64, (byte) 65, (byte) 66, (byte) 67, (byte) 68, (byte) 69, (byte) 70, (byte) 71, (byte) 72, (byte) 73, (byte) 74, (byte) 75, (byte) 76, (byte) 77, (byte) 78, (byte) 79, (byte) 80, (byte) 81, (byte) 82, (byte) 83, (byte) 84, (byte) 85, (byte) 86, (byte) 87, (byte) 88, (byte) 89, (byte) 90, (byte) 91, (byte) 92, (byte) 93, (byte) 94, (byte) 95, (byte) 96, (byte) 97, (byte) 98, (byte) 99, (byte) 100};
        //Act Statement(s)
        TransactionInput.coinbaseInput(transactionMock, byteArray);
    }

    //Sapient generated method id: ${e6c4f7c9-4d1c-3565-86c0-168de676a48d}, hash: FBE97CAAE862C3CC35B6D232C248BD74
    @Test()
    public void coinbaseInputWhenDefaultBranch() {
        /* Branches:
         * (scriptBytes.length >= 2) : true
         * (scriptBytes.length <= 100) : true
         * (branch expression (line 133)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1};
        //Act Statement(s)
        TransactionInput result = TransactionInput.coinbaseInput(transactionMock, byteArray);
        TransactionOutPoint transactionOutPoint = TransactionOutPoint.UNCONNECTED;
        TransactionInput transactionInput = new TransactionInput(transactionMock, byteArray, transactionOutPoint);
        //Assert statement(s)
        assertThat(result, equalTo(transactionInput));
    }

    //Sapient generated method id: ${d7d7c181-85f8-3d2b-b5a1-c1ddd262297c}, hash: E92A4BD0A09FEF892D092AE1DBB530CE
    @Test()
    public void readWhenDefaultBranch() throws BufferUnderflowException, ProtocolException {
        /* Branches:
         * (branch expression (line 133)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Buffers> buffers = mockStatic(Buffers.class);
             MockedStatic<TransactionOutPoint> transactionOutPoint = mockStatic(TransactionOutPoint.class)) {
            transactionOutPoint.when(() -> TransactionOutPoint.read((ByteBuffer) any())).thenReturn(transactionOutPointMock);
            byte[] byteArray = new byte[]{};
            buffers.when(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any())).thenReturn(byteArray);
            byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(0L);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            TransactionInput result = TransactionInput.read(byteBuffer, transactionMock);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            transactionOutPoint.verify(() -> TransactionOutPoint.read((ByteBuffer) any()));
            buffers.verify(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any()));
            byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${92ec4297-962b-3285-b020-9fbd4aaa4b81}, hash: DFFF209E0DAB4DF948AA5BC5E09DA762
    @Test()
    public void getIndexWhenMyIndexLessThan0ThrowsIllegalStateException() {
        /* Branches:
         * (myIndex < 0) : true
         */
        //Arrange Statement(s)
        List<TransactionInput> transactionInputList = new ArrayList<>();
        doReturn(transactionInputList).when(transactionMock).getInputs();
        doReturn(1).when(valueMock).signum();
        byte[] byteArray = new byte[]{};
        TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
        IllegalStateException illegalStateException = new IllegalStateException("Input linked to wrong parent transaction?");
        thrown.expect(IllegalStateException.class);
        thrown.expectMessage(illegalStateException.getMessage());
        //Act Statement(s)
        target.getIndex();
        //Assert statement(s)
        verify(transactionMock).getInputs();
        verify(valueMock).signum();
    }

    //Sapient generated method id: ${74367ac6-67d1-3ba8-9bdd-4aafa43d4139}, hash: 6095CC353FBBD34D21234C79EC6E48CF
    @Test()
    public void writeTest() throws BufferOverflowException {
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Buffers> buffers = mockStatic(Buffers.class)) {
            doReturn(0).when(valueMock).signum();
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            byte[] byteArray = new byte[]{};
            buffers.when(() -> Buffers.writeLengthPrefixedBytes((ByteBuffer) any(), eq(byteArray))).thenReturn(byteBuffer);
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(64);
            byteUtils.when(() -> ByteUtils.writeInt32LE(eq(4294967295L), (ByteBuffer) any())).thenReturn(byteBuffer2);
            TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(outpointMock).serialize();
            ByteBuffer byteBuffer3 = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            ByteBuffer result = target.write(byteBuffer3);
            //Assert statement(s)
            assertThat(result, equalTo(byteBuffer3));
            verify(valueMock).signum();
            buffers.verify(() -> Buffers.writeLengthPrefixedBytes((ByteBuffer) any(), eq(byteArray)));
            byteUtils.verify(() -> ByteUtils.writeInt32LE(eq(4294967295L), (ByteBuffer) any()));
            verify(outpointMock).serialize();
        }
    }

    //Sapient generated method id: ${9d328af1-2293-3544-bbbc-a0683c1f9fbe}, hash: 10E38A83AC4AD884C5C6185BCFE86100
    @Test()
    public void serializeTest() {
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Buffers> buffers = mockStatic(Buffers.class)) {
            doReturn(0).when(valueMock).signum();
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            byte[] byteArray = new byte[]{};
            buffers.when(() -> Buffers.writeLengthPrefixedBytes((ByteBuffer) any(), eq(byteArray))).thenReturn(byteBuffer);
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(64);
            byteUtils.when(() -> ByteUtils.writeInt32LE(eq(4294967295L), (ByteBuffer) any())).thenReturn(byteBuffer2);
            TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(outpointMock).serialize();
            //Act Statement(s)
            byte[] result = target.serialize();
            byte[] byteResultArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            //Assert statement(s)
            assertThat(result, equalTo(byteResultArray));
            verify(valueMock).signum();
            buffers.verify(() -> Buffers.writeLengthPrefixedBytes((ByteBuffer) any(), eq(byteArray)));
            byteUtils.verify(() -> ByteUtils.writeInt32LE(eq(4294967295L), (ByteBuffer) any()));
            verify(outpointMock).serialize();
        }
    }

    //Sapient generated method id: ${924fe7c3-f32b-3ad4-96ee-4ebf1903d243}, hash: 7377BE8A25CB444D33A4C85ABF403DD7
    @Test()
    public void bitcoinSerializeTest() {
        //Arrange Statement(s)
        doReturn(1).when(valueMock).signum();
        byte[] byteArray = new byte[]{};
        TransactionInput target = spy(new TransactionInput(transactionMock, byteArray, outpointMock, valueMock));
        byte[] byteArray2 = new byte[]{};
        doReturn(byteArray2).when(target).serialize();
        //Act Statement(s)
        byte[] result = target.bitcoinSerialize();
        //Assert statement(s)
        assertThat(result, equalTo(byteArray2));
        verify(valueMock).signum();
        verify(target).serialize();
    }

    //Sapient generated method id: ${c2057553-a090-359a-8f38-97b151dff7fd}, hash: 354CC3AEE50FAF12420AAA31C1D38E57
    @Test()
    public void messageSizeTest() {
        //Arrange Statement(s)
        doReturn(0).when(valueMock).signum();
        byte[] byteArray = new byte[]{};
        TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
        //Act Statement(s)
        int result = target.messageSize();
        //Assert statement(s)
        assertThat(result, equalTo(41));
        verify(valueMock).signum();
    }

    //Sapient generated method id: ${435d64f5-8fca-31bf-b014-13944bac4d4c}, hash: 7655C8C807FCEB53DA7C592C6D29B49F
    @Test()
    public void getMessageSizeTest() {
        //Arrange Statement(s)
        doReturn(0).when(valueMock).signum();
        byte[] byteArray = new byte[]{};
        TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
        //Act Statement(s)
        int result = target.getMessageSize();
        //Assert statement(s)
        assertThat(result, equalTo(41));
        verify(valueMock).signum();
    }

    //Sapient generated method id: ${be0fa096-1684-3633-8eb3-6476d95e5285}, hash: 15533EDEDF7934D870C8712D99B78F22
    @Ignore()
    @Test()
    public void isCoinBaseWhenOutpointIndexAnd0xFFFFFFFFLEquals0xFFFFFFFFL() {
        /* Branches:
         * (outpoint.hash().equals(Sha256Hash.ZERO_HASH)) : true
         * ((outpoint.index() & 0xFFFFFFFFL) == 0xFFFFFFFFL) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(1).when(valueMock).signum();
        byte[] byteArray = new byte[]{};
        TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
        Sha256Hash sha256Hash = Sha256Hash.ZERO_HASH;
        doReturn(sha256Hash).when(outpointMock).hash();
        doReturn(0L).when(outpointMock).index();
        //Act Statement(s)
        boolean result = target.isCoinBase();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(valueMock).signum();
        verify(outpointMock).hash();
        verify(outpointMock).index();
    }

    //Sapient generated method id: ${6aa2fd7e-04c0-3d5f-81e9-f50072f71b6c}, hash: E4DF8EFE5A7EA64641F4B7A3531A7760
    @Test()
    public void isCoinBaseWhenOutpointIndexAnd0xFFFFFFFFLNotEquals0xFFFFFFFFL() {
        /* Branches:
         * (outpoint.hash().equals(Sha256Hash.ZERO_HASH)) : true
         * ((outpoint.index() & 0xFFFFFFFFL) == 0xFFFFFFFFL) : false
         */
        //Arrange Statement(s)
        Transaction transaction = new Transaction();
        byte[] byteArray = new byte[]{};
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        TransactionOutPoint transactionOutPoint = new TransactionOutPoint(0L, sha256Hash);
        Coin coin = Coin.valueOf(0L);
        TransactionInput target = new TransactionInput(transaction, byteArray, transactionOutPoint, coin);
        //Act Statement(s)
        boolean result = target.isCoinBase();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${89c9d720-cbdf-39bc-a748-ded3adad5df4}, hash: C7018BB0492BF1BFC76C4DF1F1E5A940
    @Test()
    public void getScriptSigWhenScriptIsNull() throws ScriptException {
        /* Branches:
         * (scriptSig == null) : true
         * (script == null) : true
         */
        //Arrange Statement(s)
        Script scriptMock = mock(Script.class);
        try (MockedStatic<Script> script = mockStatic(Script.class)) {
            doReturn(1).when(valueMock).signum();
            byte[] byteArray = new byte[]{};
            script.when(() -> Script.parse(byteArray)).thenReturn(scriptMock);
            TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
            //Act Statement(s)
            Script result = target.getScriptSig();
            //Assert statement(s)
            assertThat(result, equalTo(scriptMock));
            verify(valueMock).signum();
            script.verify(() -> Script.parse(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${59b5efe5-605f-3bb0-8f71-ee61e2f3edac}, hash: D318CCD0AC65EF87E55075D746DA1CA4
    @Test()
    public void setScriptSigTest() {
        //Arrange Statement(s)
        Script scriptSigMock = mock(Script.class);
        byte[] byteArray = new byte[]{};
        doReturn(byteArray).when(scriptSigMock).program();
        doReturn(0).when(valueMock).signum();
        byte[] byteArray2 = new byte[]{};
        TransactionInput target = new TransactionInput(transactionMock, byteArray2, outpointMock, valueMock);
        //Act Statement(s)
        target.setScriptSig(scriptSigMock);
        //Assert statement(s)
        verify(scriptSigMock).program();
        verify(valueMock).signum();
    }

    //Sapient generated method id: ${182e2f8a-e974-34ee-a397-87129a2c7e49}, hash: 54E81AC2132492097581375E52BEE8CD
    @Test()
    public void setSequenceNumberWhenSequenceLessThanOrEqualsToByteUtilsMAX_UNSIGNED_INTEGER() {
        /* Branches:
         * (sequence >= 0) : true
         * (sequence <= ByteUtils.MAX_UNSIGNED_INTEGER) : true
         */
        //Arrange Statement(s)
        doReturn(1).when(valueMock).signum();
        byte[] byteArray = new byte[]{};
        TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
        //Act Statement(s)
        target.setSequenceNumber(0L);
        //Assert statement(s)
        verify(valueMock).signum();
    }

    //Sapient generated method id: ${1056188a-ff6c-3a2e-b712-b608128db79d}, hash: 96A14E3A4E840274892482CAFEDD790D
    @Ignore()
    @Test()
    public void setSequenceNumberWhenSequenceGreaterThanByteUtilsMAX_UNSIGNED_INTEGERThrowsIllegalArgumentException() {
        /* Branches:
         * (sequence >= 0) : true
         * (sequence <= ByteUtils.MAX_UNSIGNED_INTEGER) : false
         */
        //Arrange Statement(s)
        doReturn(1).when(valueMock).signum();
        byte[] byteArray = new byte[]{};
        TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
        thrown.expect(IllegalArgumentException.class);
        //Act Statement(s)
        target.setSequenceNumber(1L);
        //Assert statement(s)
        verify(valueMock).signum();
    }

    //Sapient generated method id: ${a1dbfa94-6d62-35a9-b0ad-2eac49c6a888}, hash: D2F41E969215EA41A13D5DDA0736560D
    @Test()
    public void clearScriptBytesTest() {
        //Arrange Statement(s)
        doReturn(1).when(valueMock).signum();
        byte[] byteArray = new byte[]{};
        TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
        //Act Statement(s)
        target.clearScriptBytes();
        //Assert statement(s)
        verify(valueMock).signum();
    }

    //Sapient generated method id: ${ddffe4ea-c8c6-349e-a521-6f34d6e22f54}, hash: 1191FEDAA1A6A6D9A21DB9E28E85AB4E
    @Test()
    public void setScriptBytesTest() {
        //Arrange Statement(s)
        doReturn(1).when(valueMock).signum();
        byte[] byteArray = new byte[]{};
        TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
        byte[] byteArray2 = new byte[]{};
        //Act Statement(s)
        target.setScriptBytes(byteArray2);
        //Assert statement(s)
        assertThat(target.getScriptBytes().length, equalTo(0));
        verify(valueMock).signum();
    }

    //Sapient generated method id: ${2a1c2288-01af-3923-8d14-ce6954e371cd}, hash: 6950628A04C47628688C5AB3EAA9E4A5
    @Test()
    public void getWitnessWhenWitnessIsNull() {
        /* Branches:
         * (witness != null) : false
         */
        //Arrange Statement(s)
        doReturn(1).when(valueMock).signum();
        byte[] byteArray = new byte[]{};
        TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
        //Act Statement(s)
        TransactionWitness result = target.getWitness();
        TransactionWitness transactionWitness = TransactionWitness.EMPTY;
        //Assert statement(s)
        assertThat(result, equalTo(transactionWitness));
        verify(valueMock).signum();
    }

    //Sapient generated method id: ${ebafeb6a-4522-326e-bcab-1a61636af1c3}, hash: CCAA2209F6D62E21DD7D1EC578C62686
    @Test()
    public void hasWitnessWhenWitnessIsNull() {
        /* Branches:
         * (witness != null) : false
         */
        //Arrange Statement(s)
        doReturn(1).when(valueMock).signum();
        byte[] byteArray = new byte[]{};
        TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
        //Act Statement(s)
        boolean result = target.hasWitness();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(valueMock).signum();
    }

    //Sapient generated method id: ${12545608-6ee4-3b98-a547-7adcea97af66}, hash: 459424C76833AC8FD310D49219281703
    @Test()
    public void getConnectedOutputWhenTxIsNull() {
        /* Branches:
         * (tx == null) : true
         */
        //Arrange Statement(s)
        doReturn(0).when(valueMock).signum();
        byte[] byteArray = new byte[]{};
        TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
        doReturn(sha256HashMock).when(outpointMock).hash();
        Map<Sha256Hash, Transaction> sha256HashTransactionMap = new HashMap<>();
        sha256HashTransactionMap.put(sha256HashMock, (Transaction) null);
        //Act Statement(s)
        TransactionOutput result = target.getConnectedOutput(sha256HashTransactionMap);
        //Assert statement(s)
        assertThat(result, is(nullValue()));
        verify(valueMock).signum();
        verify(outpointMock).hash();
    }

    //Sapient generated method id: ${04a07209-acae-3dad-8ca2-c73721dc26cb}, hash: 6649EE00C54A635EC2953907B0FDDD40
    @Test()
    public void getConnectedOutputWhenTxIsNotNull() {
        /* Branches:
         * (tx == null) : false
         */
        //Arrange Statement(s)
        Transaction txMock = mock(Transaction.class);
        doReturn(transactionOutputMock).when(txMock).getOutput(outpointMock);
        doReturn(0).when(valueMock).signum();
        byte[] byteArray = new byte[]{};
        TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
        doReturn(sha256HashMock).when(outpointMock).hash();
        Map<Sha256Hash, Transaction> sha256HashTransactionMap = new HashMap<>();
        sha256HashTransactionMap.put(sha256HashMock, txMock);
        //Act Statement(s)
        TransactionOutput result = target.getConnectedOutput(sha256HashTransactionMap);
        //Assert statement(s)
        assertThat(result, equalTo(transactionOutputMock));
        verify(txMock).getOutput(outpointMock);
        verify(valueMock).signum();
        verify(outpointMock).hash();
    }

    //Sapient generated method id: ${1951ee9d-5aac-364d-9832-6d9fcf0df2d9}, hash: AF703EBB859208296A12226A2134E6D2
    @Test()
    public void getConnectedRedeemDataTest() throws ScriptException {
        //Arrange Statement(s)
        RedeemData redeemDataMock = mock(RedeemData.class);
        KeyBag keyBagMock = mock(KeyBag.class);
        doReturn(redeemDataMock).when(outpointMock).getConnectedRedeemData(keyBagMock);
        doReturn(1).when(valueMock).signum();
        byte[] byteArray = new byte[]{};
        TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
        //Act Statement(s)
        RedeemData result = target.getConnectedRedeemData(keyBagMock);
        //Assert statement(s)
        assertThat(result, equalTo(redeemDataMock));
        verify(outpointMock).getConnectedRedeemData(keyBagMock);
        verify(valueMock).signum();
    }

    //Sapient generated method id: ${d85af97f-42e1-3b78-bf22-1c200f6e49a8}, hash: 56440FCAE675E847B851294BC47B55EF
    @Test()
    public void connect2Test() {
        //Arrange Statement(s)
        TransactionOutput outMock = mock(TransactionOutput.class);
        doReturn(transactionMock).when(outMock).getParentTransaction();
        Coin coinMock = mock(Coin.class);
        doReturn(coinMock).when(outMock).getValue();
        doReturn(1).when(valueMock).signum();
        byte[] byteArray = new byte[]{};
        TransactionInput target = new TransactionInput(transactionMock2, byteArray, outpointMock, valueMock);
        doReturn(transactionOutPointMock).when(outpointMock).connectTransaction(transactionMock);
        doNothing().when(outMock).markAsSpent(target);
        //Act Statement(s)
        target.connect(outMock);
        //Assert statement(s)
        assertThat(target.getValue(), is(notNullValue()));
        assertThat(target.getOutpoint(), is(notNullValue()));
        verify(outMock).getParentTransaction();
        verify(outMock).getValue();
        verify(valueMock).signum();
        verify(outpointMock).connectTransaction(transactionMock);
        verify(outMock).markAsSpent(target);
    }

    //Sapient generated method id: ${b66710e8-231c-3740-b476-35e7ae432317}, hash: B32341DE30B20CA4F0C40AA1A153D975
    @Test()
    public void disconnectWhenOutpointConnectedOutputIsNull() {
        /* Branches:
         * (outpoint.fromTx != null) : false
         * (outpoint.connectedOutput != null) : false
         */
        //Arrange Statement(s)
        doReturn(1).when(valueMock).signum();
        byte[] byteArray = new byte[]{};
        TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
        //Act Statement(s)
        boolean result = target.disconnect();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(valueMock).signum();
    }

    //Sapient generated method id: ${02687221-b8db-3111-8e5d-ae568d65b884}, hash: 00742F5CF9D152071278E70B43C848C9
    @Ignore()
    @Test()
    public void disconnectWhenConnectedOutputGetSpentByNotEqualsThis() {
        /* Branches:
         * (outpoint.fromTx != null) : true
         * (connectedOutput != null) : true
         * (connectedOutput.getSpentBy() == this) : false
         */
        //Arrange Statement(s)
        doReturn(1).when(valueMock).signum();
        byte[] byteArray = new byte[]{};
        TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
        doReturn(transactionOutPointMock).when(outpointMock).disconnectTransaction();
        //Act Statement(s)
        boolean result = target.disconnect();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        assertThat(target.getOutpoint(), is(notNullValue()));
        verify(valueMock).signum();
        verify(outpointMock).disconnectTransaction();
    }

    //Sapient generated method id: ${69b27b57-fbf3-33a9-b3d0-d1a6c833fbd3}, hash: 2CB04B139B1896023B021232720CA3D3
    @Ignore()
    @Test()
    public void disconnectWhenConnectedOutputIsNotNullAndConnectedOutputGetSpentByEqualsThis() {
        /* Branches:
         * (outpoint.fromTx != null) : false
         * (outpoint.connectedOutput != null) : true
         * (connectedOutput != null) : true
         * (connectedOutput.getSpentBy() == this) : true
         */
        //Arrange Statement(s)
        doReturn(1).when(valueMock).signum();
        byte[] byteArray = new byte[]{};
        TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
        doReturn(transactionOutPointMock).when(outpointMock).disconnectOutput();
        //Act Statement(s)
        boolean result = target.disconnect();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        assertThat(target.getOutpoint(), is(notNullValue()));
        verify(valueMock).signum();
        verify(outpointMock).disconnectOutput();
    }

    //Sapient generated method id: ${80efc5b5-6205-3ad4-bf22-18c5b5c0ddc6}, hash: 81B2220E5D73DC1196E20831A612049F
    @Test()
    public void hasSequenceWhenSequenceEqualsNO_SEQUENCE() {
        /* Branches:
         * (sequence != NO_SEQUENCE) : false
         */
        //Arrange Statement(s)
        doReturn(1).when(valueMock).signum();
        byte[] byteArray = new byte[]{};
        TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
        //Act Statement(s)
        boolean result = target.hasSequence();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(valueMock).signum();
    }

    //Sapient generated method id: ${8ad1aaa3-9d87-33a8-bc54-dc23e9cc0dc8}, hash: B6F0788E148F3B0B580A534C5159A221
    @Test()
    public void isOptInFullRBFWhenSequenceNotLessThanNO_SEQUENCEMinus1() {
        /* Branches:
         * (sequence < NO_SEQUENCE - 1) : false
         */
        //Arrange Statement(s)
        doReturn(1).when(valueMock).signum();
        byte[] byteArray = new byte[]{};
        TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
        //Act Statement(s)
        boolean result = target.isOptInFullRBF();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(valueMock).signum();
    }

    //Sapient generated method id: ${f116c685-1fb4-3350-b96e-cec0b57c0305}, hash: DA2D4D08BE9ED802442B61B1B98B6768
    @Test()
    public void hasRelativeLockTimeWhenSequenceAndSEQUENCE_LOCKTIME_DISABLE_FLAGNotEquals0() {
        /* Branches:
         * ((sequence & SEQUENCE_LOCKTIME_DISABLE_FLAG) == 0) : false
         */
        //Arrange Statement(s)
        doReturn(1).when(valueMock).signum();
        byte[] byteArray = new byte[]{};
        TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
        //Act Statement(s)
        boolean result = target.hasRelativeLockTime();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(valueMock).signum();
    }

    //Sapient generated method id: ${fb3876c8-5280-3a36-97f2-204a8dfec077}, hash: 07DB673422893E0DF34BA9C0304F5683
    @Ignore()
    @Test()
    public void verifyTest() throws VerificationException {
        //Arrange Statement(s)
        doReturn(0).when(valueMock).signum();
        byte[] byteArray = new byte[]{};
        TransactionInput target = spy(new TransactionInput(transactionMock, byteArray, outpointMock, valueMock));
        doNothing().when(target).verify(transactionOutputMock);
        //Act Statement(s)
        target.verify();
        //Assert statement(s)
        verify(valueMock).signum();
        verify(target).verify(transactionOutputMock);
    }

    //Sapient generated method id: ${7086c2bb-1138-33d5-9d30-cdce3f151a4e}, hash: 8363ED7306A12C4C5B38ADE94B05E2EE
    @Ignore()
    @Test()
    public void verify1WhenGetOutpointHashNotEqualsOutputGetParentTransactionGetTxIdThrowsVerificationException() throws VerificationException {
        /* Branches:
         * (output.parent != null) : true
         * (!getOutpoint().hash().equals(output.getParentTransaction().getTxId())) : true
         */
        //Arrange Statement(s)
        doReturn(transactionMock).when(outputMock).getParentTransaction();
        doReturn(sha256HashMock).when(transactionMock).getTxId();
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        doReturn(sha256HashMock2).when(outpointMock).hash();
        doReturn(1).when(valueMock).signum();
        byte[] byteArray = new byte[]{};
        TransactionInput target = new TransactionInput(transactionMock2, byteArray, outpointMock, valueMock);
        thrown.expect(VerificationException.class);
        //Act Statement(s)
        target.verify(outputMock);
        //Assert statement(s)
        verify(outputMock).getParentTransaction();
        verify(transactionMock).getTxId();
        verify(outpointMock).hash();
        verify(valueMock).signum();
    }

    //Sapient generated method id: ${e7be2fa7-ac34-3238-9556-19b995b089fa}, hash: 412C84F8D165A3A720A3CBF73B9170B8
    @Ignore()
    @Test()
    public void verify1WhenGetOutpointIndexNotEqualsOutputGetIndexThrowsVerificationException() throws VerificationException {
        /* Branches:
         * (output.parent != null) : true
         * (!getOutpoint().hash().equals(output.getParentTransaction().getTxId())) : false
         * (getOutpoint().index() != output.getIndex()) : true
         */
        //Arrange Statement(s)
        doReturn(transactionMock).when(outputMock).getParentTransaction();
        doReturn(sha256HashMock).when(transactionMock).getTxId();
        doReturn(2).when(outputMock).getIndex();
        doReturn(sha256HashMock).when(outpointMock).hash();
        doReturn(1L).when(outpointMock).index();
        doReturn(1).when(valueMock).signum();
        byte[] byteArray = new byte[]{};
        TransactionInput target = new TransactionInput(transactionMock2, byteArray, outpointMock, valueMock);
        thrown.expect(VerificationException.class);
        //Act Statement(s)
        target.verify(outputMock);
        //Assert statement(s)
        verify(outputMock).getParentTransaction();
        verify(transactionMock).getTxId();
        verify(outputMock).getIndex();
        verify(outpointMock).hash();
        verify(outpointMock).index();
        verify(valueMock).signum();
    }

    //Sapient generated method id: ${112e73a9-dd4b-38b8-81a5-fe6b3afad428}, hash: 99D405F4052123A9C6504EDF944B85BE
    @Ignore()
    @Test()
    public void verify1WhenGetOutpointIndexEqualsOutputGetIndexAndWitnessIsNull() throws VerificationException, ScriptException {
        /* Branches:
         * (output.parent != null) : true
         * (!getOutpoint().hash().equals(output.getParentTransaction().getTxId())) : false
         * (getOutpoint().index() != output.getIndex()) : false
         * (witness != null) : false  #  inside getWitness method
         */
        //Arrange Statement(s)
        doReturn(transactionMock).when(outputMock).getParentTransaction();
        doReturn(sha256HashMock).when(transactionMock).getTxId();
        doReturn(1).when(outputMock).getIndex();
        Script scriptMock = mock(Script.class);
        doReturn(scriptMock).when(outputMock).getScriptPubKey();
        doReturn(sha256HashMock).when(outpointMock).hash();
        doReturn(1L).when(outpointMock).index();
        doReturn(1).when(valueMock).signum();
        byte[] byteArray = new byte[]{};
        TransactionInput target = spy(new TransactionInput(transactionMock2, byteArray, outpointMock, valueMock));
        Script scriptMock2 = mock(Script.class);
        doReturn(scriptMock2).when(target).getScriptSig();
        TransactionWitness transactionWitness = TransactionWitness.EMPTY;
        EnumSet<Script.VerifyFlag> scriptVerifyFlagSet = EnumSet.noneOf(Script.VerifyFlag.class);
        scriptVerifyFlagSet.add(Script.VerifyFlag.P2SH);
        scriptVerifyFlagSet.add(Script.VerifyFlag.STRICTENC);
        scriptVerifyFlagSet.add(Script.VerifyFlag.DERSIG);
        scriptVerifyFlagSet.add(Script.VerifyFlag.LOW_S);
        scriptVerifyFlagSet.add(Script.VerifyFlag.NULLDUMMY);
        scriptVerifyFlagSet.add(Script.VerifyFlag.SIGPUSHONLY);
        scriptVerifyFlagSet.add(Script.VerifyFlag.MINIMALDATA);
        scriptVerifyFlagSet.add(Script.VerifyFlag.DISCOURAGE_UPGRADABLE_NOPS);
        scriptVerifyFlagSet.add(Script.VerifyFlag.CLEANSTACK);
        scriptVerifyFlagSet.add(Script.VerifyFlag.CHECKLOCKTIMEVERIFY);
        scriptVerifyFlagSet.add(Script.VerifyFlag.CHECKSEQUENCEVERIFY);
        doNothing().when(scriptMock2).correctlySpends(transactionMock2, 0, transactionWitness, valueMock, scriptMock, scriptVerifyFlagSet);
        doReturn(0).when(target).getIndex();
        //Act Statement(s)
        target.verify(outputMock);
        //Assert statement(s)
        verify(outputMock).getParentTransaction();
        verify(transactionMock).getTxId();
        verify(outputMock).getIndex();
        verify(outputMock).getScriptPubKey();
        verify(outpointMock).hash();
        verify(outpointMock).index();
        verify(valueMock).signum();
        verify(target).getScriptSig();
        verify(scriptMock2).correctlySpends(transactionMock2, 0, transactionWitness, valueMock, scriptMock, scriptVerifyFlagSet);
        verify(target).getIndex();
    }

    //Sapient generated method id: ${c85a4b56-cb78-3780-9c35-027971cb545f}, hash: 646D6BFA6AF12310053C7386BF4985AB
    @Test()
    public void getConnectedOutput1Test() {
        //Arrange Statement(s)
        doReturn(transactionOutputMock).when(outpointMock).getConnectedOutput();
        doReturn(1).when(valueMock).signum();
        byte[] byteArray = new byte[]{};
        TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
        //Act Statement(s)
        TransactionOutput result = target.getConnectedOutput();
        //Assert statement(s)
        assertThat(result, equalTo(transactionOutputMock));
        verify(outpointMock).getConnectedOutput();
        verify(valueMock).signum();
    }

    //Sapient generated method id: ${acc384a7-2442-3705-be56-a2d70a22b75d}, hash: 95FBA54CCAAED3BC4B3A3A1C77D6894F
    @Ignore()
    @Test()
    public void getConnectedTransactionTest() {
        //Arrange Statement(s)
        doReturn(1).when(valueMock).signum();
        byte[] byteArray = new byte[]{};
        TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
        //Act Statement(s)
        Transaction result = target.getConnectedTransaction();
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
        verify(valueMock).signum();
    }

    //Sapient generated method id: ${d5320fa5-0772-317f-8c63-a48c3fa3a306}, hash: ED2BD40F349AD49F0E22FB2974021B71
    @Test()
    public void isStandardTest() {
        //Arrange Statement(s)
        try (MockedStatic<DefaultRiskAnalysis> defaultRiskAnalysis = mockStatic(DefaultRiskAnalysis.class)) {
            doReturn(1).when(valueMock).signum();
            byte[] byteArray = new byte[]{};
            TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
            defaultRiskAnalysis.when(() -> DefaultRiskAnalysis.isInputStandard(target)).thenReturn(DefaultRiskAnalysis.RuleViolation.NONE);
            //Act Statement(s)
            DefaultRiskAnalysis.RuleViolation result = target.isStandard();
            //Assert statement(s)
            assertThat(result, equalTo(DefaultRiskAnalysis.RuleViolation.NONE));
            verify(valueMock).signum();
            defaultRiskAnalysis.verify(() -> DefaultRiskAnalysis.isInputStandard(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${ac12355c-5fa5-35ca-8cc8-d6fa6908ea94}, hash: 7695F6C58FD61E46AA033232A9A1C842
    @Test()
    public void toStringWhenIsCoinBase() {
        /* Branches:
         * (isCoinBase()) : true
         */
        //Arrange Statement(s)
        doReturn(1).when(valueMock).signum();
        byte[] byteArray = new byte[]{};
        TransactionInput target = spy(new TransactionInput(transactionMock, byteArray, outpointMock, valueMock));
        doReturn(true).when(target).isCoinBase();
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("TxIn: COINBASE"));
        verify(valueMock).signum();
        verify(target).isCoinBase();
    }

    //Sapient generated method id: ${e24aff67-bfdf-303f-9d47-a79b8b5297ee}, hash: AEF16C1F274085B2F3BDC1C7AD1AEFE0
    @Test()
    public void toStringWhenFlagsNotIsEmpty() throws ScriptException {
        /* Branches:
         * (isCoinBase()) : false
         * (hasWitness()) : true
         * (hasSequence()) : true
         * (isOptInFullRBF()) : true
         * (!flags.isEmpty()) : true
         */
        //Arrange Statement(s)
        doReturn(1).when(valueMock).signum();
        byte[] byteArray = new byte[]{};
        TransactionInput target = spy(new TransactionInput(transactionMock, byteArray, outpointMock, valueMock));
        doReturn(false).when(target).isCoinBase();
        doReturn(scriptMock).when(target).getScriptSig();
        doReturn(true).when(target).hasWitness();
        doReturn(true).when(target).hasSequence();
        doReturn(true).when(target).isOptInFullRBF();
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("TxIn for [<init>_transactionOutPoint1]: toString_script1 (witness, sequence: ffffffff, opts into full RBF)"));
        verify(valueMock).signum();
        verify(target).isCoinBase();
        verify(target).getScriptSig();
        verify(target).hasWitness();
        verify(target).hasSequence();
        verify(target).isOptInFullRBF();
    }

    //Sapient generated method id: ${061b5247-9952-34cf-9a22-22438c844f30}, hash: 7533C59291D3A0B9ED85C007BAE475A6
    @Test()
    public void toStringWhenFlagsIsEmpty() throws ScriptException {
        /* Branches:
         * (isCoinBase()) : false
         * (hasWitness()) : false
         * (hasSequence()) : false
         * (isOptInFullRBF()) : false
         * (!flags.isEmpty()) : false
         */
        //Arrange Statement(s)
        doReturn(1).when(valueMock).signum();
        byte[] byteArray = new byte[]{};
        TransactionInput target = spy(new TransactionInput(transactionMock, byteArray, outpointMock, valueMock));
        doReturn(false).when(target).isCoinBase();
        doReturn(scriptMock).when(target).getScriptSig();
        doReturn(false).when(target).hasWitness();
        doReturn(false).when(target).hasSequence();
        doReturn(false).when(target).isOptInFullRBF();
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("TxIn for [<init>_transactionOutPoint1]: toString_script1"));
        verify(valueMock).signum();
        verify(target).isCoinBase();
        verify(target).getScriptSig();
        verify(target).hasWitness();
        verify(target).hasSequence();
        verify(target).isOptInFullRBF();
    }

    //Sapient generated method id: ${f95e4bba-ad57-3f8a-832e-0bb28c66f6d9}, hash: 869923CE2835FA7DAEFA5B1DB6D6B10E
    @Test()
    public void toStringWhenCaughtScriptException() throws ScriptException {
        /* Branches:
         * (isCoinBase()) : false
         * (hasWitness()) : true
         * (hasSequence()) : true
         * (isOptInFullRBF()) : true
         * (!flags.isEmpty()) : true
         * (catch-exception (ScriptException)) : true
         */
        //Arrange Statement(s)
        doReturn(0).when(valueMock).signum();
        byte[] byteArray = new byte[]{};
        TransactionInput target = spy(new TransactionInput(transactionMock, byteArray, outpointMock, valueMock));
        doReturn(false).when(target).isCoinBase();
        ScriptException scriptException = new ScriptException(ScriptError.SCRIPT_ERR_OK, "A");
        doThrow(scriptException).when(target).getScriptSig();
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("TxIn for [<init>_transactionOutPoint1]:  [exception: A]"));
        verify(valueMock).signum();
        verify(target).isCoinBase();
        verify(target).getScriptSig();
    }

    //Sapient generated method id: ${881d0539-e819-3463-a62e-0cb7f4940bfc}, hash: D0772241E29D9CBB1BE069FD84B758E3
    @Test()
    public void toStringWhenFlagsIsEmptyAndCaughtScriptException() throws ScriptException {
        /* Branches:
         * (isCoinBase()) : false
         * (hasWitness()) : false
         * (hasSequence()) : false
         * (isOptInFullRBF()) : false
         * (!flags.isEmpty()) : false
         * (catch-exception (ScriptException)) : true
         */
        //Arrange Statement(s)
        doReturn(0).when(valueMock).signum();
        byte[] byteArray = new byte[]{};
        TransactionInput target = spy(new TransactionInput(transactionMock, byteArray, outpointMock, valueMock));
        doReturn(false).when(target).isCoinBase();
        ScriptException scriptException = new ScriptException(ScriptError.SCRIPT_ERR_OK, "A");
        doThrow(scriptException).when(target).getScriptSig();
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("TxIn for [<init>_transactionOutPoint1]:  [exception: A]"));
        verify(valueMock).signum();
        verify(target).isCoinBase();
        verify(target).getScriptSig();
    }
}
