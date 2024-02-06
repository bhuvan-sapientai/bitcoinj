package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.nio.BufferUnderflowException;
import java.nio.BufferOverflowException;

import org.bitcoinj.script.ScriptException;
import org.junit.rules.ExpectedException;
import org.bitcoinj.wallet.KeyBag;
import org.bitcoinj.base.ScriptType;

import java.nio.ByteBuffer;

import org.bitcoinj.base.internal.Preconditions;
import org.bitcoinj.crypto.ECKey;
import org.bitcoinj.base.Sha256Hash;
import org.bitcoinj.script.ScriptPattern;
import org.bitcoinj.wallet.RedeemData;
import org.bitcoinj.base.internal.ByteUtils;
import org.mockito.MockedStatic;
import org.bitcoinj.script.Script;

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
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;
import org.bitcoinj.base.Coin;

import java.util.function.Supplier;

import static org.mockito.Mockito.CALLS_REAL_METHODS;

public class TransactionOutPointSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Sha256Hash hashMock = mock(Sha256Hash.class, "hash");

    private final Transaction fromTxMock = mock(Transaction.class);

    private final ECKey eCKeyMock = mock(ECKey.class);

    private final KeyBag keyBagMock = mock(KeyBag.class);

    private final RedeemData redeemDataMock = mock(RedeemData.class);

    private final Script scriptMock = mock(Script.class);

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    private final Transaction transactionMock = mock(Transaction.class);

    private final TransactionOutput transactionOutputMock = mock(TransactionOutput.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    private final Coin coinMock = mock(Coin.class);

    //Sapient generated method id: ${deec3b8b-bc29-3d32-aa61-00de8060308e}
    @Ignore()
    @Test()
    public void readWhenDefaultBranchThrowsIllegalArgumentException() throws BufferUnderflowException, ProtocolException {
        /* Branches:
         * (branch expression (line 91)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class)) {
            sha256Hash.when(() -> Sha256Hash.read((ByteBuffer) any())).thenReturn(sha256HashMock);
            byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(0L);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            thrown.expect(IllegalArgumentException.class);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            TransactionOutPoint.read(byteBuffer);
            //Assert statement(s)
            sha256Hash.verify(() -> Sha256Hash.read((ByteBuffer) any()));
            byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${08cb91e3-2e12-388e-addd-fe332aabb42f}
    @Ignore()
    @Test()
    public void readWhenDefaultBranch2ThrowsIllegalArgumentException() throws BufferUnderflowException, ProtocolException {
        /* Branches:
         * (branch expression (line 91)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class)) {
            sha256Hash.when(() -> Sha256Hash.read((ByteBuffer) any())).thenReturn(sha256HashMock);
            byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(1L);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            thrown.expect(IllegalArgumentException.class);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            TransactionOutPoint.read(byteBuffer);
            //Assert statement(s)
            sha256Hash.verify(() -> Sha256Hash.read((ByteBuffer) any()));
            byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${74367ac6-67d1-3ba8-9bdd-4aafa43d4139}
    @Ignore()
    @Test()
    public void writeTest() throws BufferOverflowException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(sha256HashMock).when(fromTxMock).getTxId();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            byteUtils.when(() -> ByteUtils.writeInt32LE(eq(0L), (ByteBuffer) any())).thenReturn(byteBuffer);
            TransactionOutPoint target = new TransactionOutPoint(0L, fromTxMock);
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(hashMock).serialize();
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            ByteBuffer result = target.write(byteBuffer2);
            //Assert statement(s)
            assertThat(result, equalTo(byteBuffer2));
            verify(fromTxMock).getTxId();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            byteUtils.verify(() -> ByteUtils.writeInt32LE(eq(0L), (ByteBuffer) any()));
            verify(hashMock).serialize();
        }
    }

    //Sapient generated method id: ${9d328af1-2293-3544-bbbc-a0683c1f9fbe}
    @Ignore()
    @Test()
    public void serializeTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(sha256HashMock).when(fromTxMock).getTxId();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            byteUtils.when(() -> ByteUtils.writeInt32LE(eq(0L), (ByteBuffer) any())).thenReturn(byteBuffer);
            TransactionOutPoint target = new TransactionOutPoint(0L, fromTxMock);
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(hashMock).serialize();
            //Act Statement(s)
            byte[] result = target.serialize();
            byte[] byteResultArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            //Assert statement(s)
            assertThat(result, equalTo(byteResultArray));
            verify(fromTxMock).getTxId();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            byteUtils.verify(() -> ByteUtils.writeInt32LE(eq(0L), (ByteBuffer) any()));
            verify(hashMock).serialize();
        }
    }

    //Sapient generated method id: ${924fe7c3-f32b-3ad4-96ee-4ebf1903d243}
    @Ignore()
    @Test()
    public void bitcoinSerializeTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(sha256HashMock).when(fromTxMock).getTxId();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            TransactionOutPoint target = spy(new TransactionOutPoint(0L, fromTxMock));
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(target).serialize();
            //Act Statement(s)
            byte[] result = target.bitcoinSerialize();
            //Assert statement(s)
            assertThat(result, equalTo(byteArray));
            verify(fromTxMock).getTxId();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            verify(target).serialize();
        }
    }

    //Sapient generated method id: ${80c03b9c-7790-3548-afa9-1b7cc4e2f49c}
    @Ignore()
    @Test()
    public void getConnectedOutputWhenConnectedOutputIsNull() {
        /* Branches:
         * (fromTx != null) : false
         * (connectedOutput != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(sha256HashMock).when(fromTxMock).getTxId();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            TransactionOutPoint target = new TransactionOutPoint(0L, fromTxMock);
            //Act Statement(s)
            TransactionOutput result = target.getConnectedOutput();
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            verify(fromTxMock).getTxId();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${b4dcaa3d-99dd-3b62-bdef-e6a2fa9a60b8}
    @Test()
    public void getConnectedPubKeyScriptWhenResultLengthGreaterThan0() {
        /* Branches:
         * (result.length > 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            doReturn(sha256HashMock).when(fromTxMock).getTxId();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            TransactionOutPoint target = spy(new TransactionOutPoint(0L, fromTxMock));
            byte[] byteArray = new byte[]{(byte) 0};
            TransactionOutput transactionOutput = new TransactionOutput(transactionMock, coinMock, byteArray);
            doReturn(transactionOutput).when(target).getConnectedOutput();
            //Act Statement(s)
            byte[] result = target.getConnectedPubKeyScript();
            //Assert statement(s)
            assertThat(result, equalTo(byteArray));
            verify(fromTxMock, atLeast(1)).getTxId();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            verify(target, atLeast(1)).getConnectedOutput();
        }
    }

    //Sapient generated method id: ${51091f3d-de33-355b-afef-7ab78808dac3}
    @Test()
    public void getConnectedPubKeyScriptWhenResultLengthNotGreaterThan0ThrowsIllegalStateException() {
        /* Branches:
         * (result.length > 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(sha256HashMock).when(fromTxMock).getTxId();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(false)).thenThrow(illegalStateException);
            TransactionOutPoint target = spy(new TransactionOutPoint(0L, fromTxMock));
            byte[] byteArray = new byte[]{};
            TransactionOutput transactionOutput = new TransactionOutput(transactionMock, coinMock, byteArray);
            doReturn(transactionOutput).when(target).getConnectedOutput();
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.getConnectedPubKeyScript();
            //Assert statement(s)
            verify(fromTxMock).getTxId();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            verify(target).getConnectedOutput();
        }
    }

    //Sapient generated method id: ${f85031ff-1a2c-3f30-b29d-9a0e9410815b}
    @Ignore()
    @Test()
    public void getConnectedKeyWhenScriptPatternIsP2PKHConnectedScript() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(connectedScript)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(eCKeyMock).when(keyBagMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2PKH);
            doReturn(sha256HashMock).when(fromTxMock).getTxId();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(true);
            scriptPattern.when(() -> ScriptPattern.extractHashFromP2PKH(scriptMock)).thenReturn(byteArray);
            TransactionOutPoint target = spy(new TransactionOutPoint(0L, fromTxMock));
            doReturn(transactionOutputMock).when(target).getConnectedOutput();
            doReturn(scriptMock).when(transactionOutputMock).getScriptPubKey();
            //Act Statement(s)
            ECKey result = target.getConnectedKey(keyBagMock);
            //Assert statement(s)
            assertThat(result, equalTo(eCKeyMock));
            verify(keyBagMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2PKH);
            verify(fromTxMock).getTxId();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractHashFromP2PKH(scriptMock), atLeast(1));
            verify(target).getConnectedOutput();
            verify(transactionOutputMock).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${ff7a9419-bdcf-33c6-8f34-b856fe3542a0}
    @Ignore()
    @Test()
    public void getConnectedKeyWhenScriptPatternIsP2WPKHConnectedScript() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(connectedScript)) : false
         * (ScriptPattern.isP2WPKH(connectedScript)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(eCKeyMock).when(keyBagMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2WPKH);
            doReturn(sha256HashMock).when(fromTxMock).getTxId();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(true);
            scriptPattern.when(() -> ScriptPattern.extractHashFromP2WH(scriptMock)).thenReturn(byteArray);
            TransactionOutPoint target = spy(new TransactionOutPoint(0L, fromTxMock));
            doReturn(transactionOutputMock).when(target).getConnectedOutput();
            doReturn(scriptMock).when(transactionOutputMock).getScriptPubKey();
            //Act Statement(s)
            ECKey result = target.getConnectedKey(keyBagMock);
            //Assert statement(s)
            assertThat(result, equalTo(eCKeyMock));
            verify(keyBagMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2WPKH);
            verify(fromTxMock).getTxId();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractHashFromP2WH(scriptMock), atLeast(1));
            verify(target).getConnectedOutput();
            verify(transactionOutputMock).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${b651f4d8-ac3d-35b4-853e-f24baf7c71b9}
    @Ignore()
    @Test()
    public void getConnectedKeyWhenScriptPatternIsP2PKConnectedScript() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(connectedScript)) : false
         * (ScriptPattern.isP2WPKH(connectedScript)) : false
         * (ScriptPattern.isP2PK(connectedScript)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(eCKeyMock).when(keyBagMock).findKeyFromPubKey(byteArray);
            doReturn(sha256HashMock).when(fromTxMock).getTxId();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(true);
            scriptPattern.when(() -> ScriptPattern.extractKeyFromP2PK(scriptMock)).thenReturn(byteArray);
            TransactionOutPoint target = spy(new TransactionOutPoint(0L, fromTxMock));
            doReturn(transactionOutputMock).when(target).getConnectedOutput();
            doReturn(scriptMock).when(transactionOutputMock).getScriptPubKey();
            //Act Statement(s)
            ECKey result = target.getConnectedKey(keyBagMock);
            //Assert statement(s)
            assertThat(result, equalTo(eCKeyMock));
            verify(keyBagMock).findKeyFromPubKey(byteArray);
            verify(fromTxMock).getTxId();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractKeyFromP2PK(scriptMock), atLeast(1));
            verify(target).getConnectedOutput();
            verify(transactionOutputMock).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${97d3daf2-cb95-382a-a8d3-1bcfa404bd35}
    @Test()
    public void getConnectedKeyWhenScriptPatternNotIsP2PKConnectedScriptThrowsScriptException() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(connectedScript)) : false
         * (ScriptPattern.isP2WPKH(connectedScript)) : false
         * (ScriptPattern.isP2PK(connectedScript)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Script scriptMock = mock(Script.class, "getConnectedKey_script1");
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(sha256HashMock).when(fromTxMock).getTxId();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            TransactionOutPoint target = spy(new TransactionOutPoint(0L, fromTxMock));
            doReturn(transactionOutputMock).when(target).getConnectedOutput();
            doReturn(scriptMock).when(transactionOutputMock).getScriptPubKey();
            thrown.expect(ScriptException.class);
            //Act Statement(s)
            target.getConnectedKey(keyBagMock);
            //Assert statement(s)
            verify(fromTxMock).getTxId();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            verify(target).getConnectedOutput();
            verify(transactionOutputMock).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${63590fbc-487d-307f-940e-bf3655312e87}
    @Ignore()
    @Test()
    public void getConnectedRedeemDataWhenScriptPatternIsP2PKHConnectedScript() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(connectedScript)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<RedeemData> redeemData = mockStatic(RedeemData.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(eCKeyMock).when(keyBagMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2PKH);
            doReturn(sha256HashMock).when(fromTxMock).getTxId();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(true);
            scriptPattern.when(() -> ScriptPattern.extractHashFromP2PKH(scriptMock)).thenReturn(byteArray);
            redeemData.when(() -> RedeemData.of(eCKeyMock, scriptMock)).thenReturn(redeemDataMock);
            TransactionOutPoint target = spy(new TransactionOutPoint(0L, fromTxMock));
            doReturn(transactionOutputMock).when(target).getConnectedOutput();
            doReturn(scriptMock).when(transactionOutputMock).getScriptPubKey();
            //Act Statement(s)
            RedeemData result = target.getConnectedRedeemData(keyBagMock);
            //Assert statement(s)
            assertThat(result, equalTo(redeemDataMock));
            verify(keyBagMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2PKH);
            verify(fromTxMock).getTxId();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractHashFromP2PKH(scriptMock), atLeast(1));
            redeemData.verify(() -> RedeemData.of(eCKeyMock, scriptMock), atLeast(1));
            verify(target).getConnectedOutput();
            verify(transactionOutputMock).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${c6b5285d-7302-38ab-bd21-75d13eaa7872}
    @Ignore()
    @Test()
    public void getConnectedRedeemDataWhenScriptPatternIsP2WPKHConnectedScript() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(connectedScript)) : false
         * (ScriptPattern.isP2WPKH(connectedScript)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<RedeemData> redeemData = mockStatic(RedeemData.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(eCKeyMock).when(keyBagMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2WPKH);
            doReturn(sha256HashMock).when(fromTxMock).getTxId();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(true);
            scriptPattern.when(() -> ScriptPattern.extractHashFromP2WH(scriptMock)).thenReturn(byteArray);
            redeemData.when(() -> RedeemData.of(eCKeyMock, scriptMock)).thenReturn(redeemDataMock);
            TransactionOutPoint target = spy(new TransactionOutPoint(0L, fromTxMock));
            doReturn(transactionOutputMock).when(target).getConnectedOutput();
            doReturn(scriptMock).when(transactionOutputMock).getScriptPubKey();
            //Act Statement(s)
            RedeemData result = target.getConnectedRedeemData(keyBagMock);
            //Assert statement(s)
            assertThat(result, equalTo(redeemDataMock));
            verify(keyBagMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2WPKH);
            verify(fromTxMock).getTxId();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractHashFromP2WH(scriptMock), atLeast(1));
            redeemData.verify(() -> RedeemData.of(eCKeyMock, scriptMock), atLeast(1));
            verify(target).getConnectedOutput();
            verify(transactionOutputMock).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${3eab6edb-f6b0-3ff9-9ef3-d2acf12c9b43}
    @Ignore()
    @Test()
    public void getConnectedRedeemDataWhenScriptPatternIsP2PKConnectedScript() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(connectedScript)) : false
         * (ScriptPattern.isP2WPKH(connectedScript)) : false
         * (ScriptPattern.isP2PK(connectedScript)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<RedeemData> redeemData = mockStatic(RedeemData.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(eCKeyMock).when(keyBagMock).findKeyFromPubKey(byteArray);
            doReturn(sha256HashMock).when(fromTxMock).getTxId();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(true);
            scriptPattern.when(() -> ScriptPattern.extractKeyFromP2PK(scriptMock)).thenReturn(byteArray);
            redeemData.when(() -> RedeemData.of(eCKeyMock, scriptMock)).thenReturn(redeemDataMock);
            TransactionOutPoint target = spy(new TransactionOutPoint(0L, fromTxMock));
            doReturn(transactionOutputMock).when(target).getConnectedOutput();
            doReturn(scriptMock).when(transactionOutputMock).getScriptPubKey();
            //Act Statement(s)
            RedeemData result = target.getConnectedRedeemData(keyBagMock);
            //Assert statement(s)
            assertThat(result, equalTo(redeemDataMock));
            verify(keyBagMock).findKeyFromPubKey(byteArray);
            verify(fromTxMock).getTxId();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractKeyFromP2PK(scriptMock), atLeast(1));
            redeemData.verify(() -> RedeemData.of(eCKeyMock, scriptMock), atLeast(1));
            verify(target).getConnectedOutput();
            verify(transactionOutputMock).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${6df325cf-381f-33a4-8db5-97982c48df3b}
    @Ignore()
    @Test()
    public void getConnectedRedeemDataWhenScriptPatternIsP2SHConnectedScript() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(connectedScript)) : false
         * (ScriptPattern.isP2WPKH(connectedScript)) : false
         * (ScriptPattern.isP2PK(connectedScript)) : false
         * (ScriptPattern.isP2SH(connectedScript)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(redeemDataMock).when(keyBagMock).findRedeemDataFromScriptHash(byteArray);
            doReturn(sha256HashMock).when(fromTxMock).getTxId();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(true);
            scriptPattern.when(() -> ScriptPattern.extractHashFromP2SH(scriptMock)).thenReturn(byteArray);
            TransactionOutPoint target = spy(new TransactionOutPoint(0L, fromTxMock));
            doReturn(transactionOutputMock).when(target).getConnectedOutput();
            doReturn(scriptMock).when(transactionOutputMock).getScriptPubKey();
            //Act Statement(s)
            RedeemData result = target.getConnectedRedeemData(keyBagMock);
            //Assert statement(s)
            assertThat(result, equalTo(redeemDataMock));
            verify(keyBagMock).findRedeemDataFromScriptHash(byteArray);
            verify(fromTxMock).getTxId();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractHashFromP2SH(scriptMock), atLeast(1));
            verify(target).getConnectedOutput();
            verify(transactionOutputMock).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${4fd40112-5873-3600-b74f-f8a33ad73d09}
    @Test()
    public void getConnectedRedeemDataWhenScriptPatternNotIsP2SHConnectedScriptThrowsScriptException() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(connectedScript)) : false
         * (ScriptPattern.isP2WPKH(connectedScript)) : false
         * (ScriptPattern.isP2PK(connectedScript)) : false
         * (ScriptPattern.isP2SH(connectedScript)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Script scriptMock = mock(Script.class, "getConnectedRedeemData_script1");
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(sha256HashMock).when(fromTxMock).getTxId();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(false);
            TransactionOutPoint target = spy(new TransactionOutPoint(0L, fromTxMock));
            doReturn(transactionOutputMock).when(target).getConnectedOutput();
            doReturn(scriptMock).when(transactionOutputMock).getScriptPubKey();
            thrown.expect(ScriptException.class);
            //Act Statement(s)
            target.getConnectedRedeemData(keyBagMock);
            //Assert statement(s)
            verify(fromTxMock).getTxId();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(1));
            verify(target).getConnectedOutput();
            verify(transactionOutputMock).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${d9e39a67-74c4-3965-ae2b-0a81ca7c754a}
    @Ignore()
    @Test()
    public void disconnectOutputWhenDefaultBranchThrowsIllegalArgumentException() {
        /* Branches:
         * (branch expression (line 91)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(sha256HashMock).when(fromTxMock).getTxId();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException2);
            TransactionOutPoint target = new TransactionOutPoint(0L, fromTxMock);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.disconnectOutput();
            //Assert statement(s)
            verify(fromTxMock).getTxId();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(2));
        }
    }

    //Sapient generated method id: ${4ef19704-57d4-34d5-9e73-70f5b9defd58}
    @Ignore()
    @Test()
    public void connectTransactionWhenDefaultBranchThrowsIllegalArgumentException() {
        /* Branches:
         * (branch expression (line 91)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(sha256HashMock).when(fromTxMock).getTxId();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException2);
            TransactionOutPoint target = new TransactionOutPoint(0L, fromTxMock);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.connectTransaction(transactionMock);
            //Assert statement(s)
            verify(fromTxMock).getTxId();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(2));
        }
    }

    //Sapient generated method id: ${c2b3e60c-c17f-39a6-b50b-883830e40442}
    @Ignore()
    @Test()
    public void disconnectTransactionWhenDefaultBranchThrowsIllegalArgumentException() {
        /* Branches:
         * (branch expression (line 91)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(sha256HashMock).when(fromTxMock).getTxId();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException2);
            TransactionOutPoint target = new TransactionOutPoint(0L, fromTxMock);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.disconnectTransaction();
            //Assert statement(s)
            verify(fromTxMock).getTxId();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(2));
        }
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}
    @Ignore()
    @Test()
    public void toStringTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(sha256HashMock).when(fromTxMock).getTxId();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            TransactionOutPoint target = new TransactionOutPoint(0L, fromTxMock);
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("<init>_sha256Hash6:0"));
            verify(fromTxMock).getTxId();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${9d300d6c-ecd3-35df-b3af-b16008977eae}
    @Ignore()
    @Test()
    public void hashTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(sha256HashMock).when(fromTxMock).getTxId();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            TransactionOutPoint target = new TransactionOutPoint(0L, fromTxMock);
            //Act Statement(s)
            Sha256Hash result = target.hash();
            //Assert statement(s)
            assertThat(result, equalTo(hashMock));
            verify(fromTxMock).getTxId();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${5f246a97-4870-30c4-9915-ed4b32bcd219}
    @Ignore()
    @Test()
    public void indexTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(sha256HashMock).when(fromTxMock).getTxId();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            TransactionOutPoint target = new TransactionOutPoint(0L, fromTxMock);
            //Act Statement(s)
            long result = target.index();
            //Assert statement(s)
            assertThat(result, equalTo(0L));
            verify(fromTxMock).getTxId();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${c152b292-9f41-3184-8d0c-c8dacb973313}
    @Ignore()
    @Test()
    public void getHashTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(sha256HashMock).when(fromTxMock).getTxId();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            TransactionOutPoint target = new TransactionOutPoint(0L, fromTxMock);
            //Act Statement(s)
            Sha256Hash result = target.getHash();
            //Assert statement(s)
            assertThat(result, equalTo(hashMock));
            verify(fromTxMock).getTxId();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${1051d90e-6143-3be9-a736-0083704c4119}
    @Ignore()
    @Test()
    public void getIndexTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(sha256HashMock).when(fromTxMock).getTxId();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            TransactionOutPoint target = new TransactionOutPoint(0L, fromTxMock);
            //Act Statement(s)
            long result = target.getIndex();
            //Assert statement(s)
            assertThat(result, equalTo(0L));
            verify(fromTxMock).getTxId();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }
}
