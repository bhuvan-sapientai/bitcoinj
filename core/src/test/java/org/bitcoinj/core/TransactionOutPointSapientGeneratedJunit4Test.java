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

import java.util.List;
import java.util.ArrayList;

import static org.mockito.Mockito.CALLS_REAL_METHODS;

public class TransactionOutPointSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Sha256Hash hashMock = mock(Sha256Hash.class, "hash");

    private final Transaction fromTxMock = mock(Transaction.class);

    private final ECKey eCKeyMock = mock(ECKey.class);

    private final KeyBag keyBagMock = mock(KeyBag.class, "{}");

    private final RedeemData redeemDataMock = mock(RedeemData.class);

    private final Script scriptMock = mock(Script.class);

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    private final Transaction transactionMock = mock(Transaction.class);

    private final TransactionOutput transactionOutputMock = mock(TransactionOutput.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${d7d7c181-85f8-3d2b-b5a1-c1ddd262297c}
    @Ignore()
    @Test()
    public void readWhenDefaultBranch() throws BufferUnderflowException, ProtocolException {
        /* Branches:
         * (branch expression (line 91)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class)) {
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer);
            sha256Hash.when(() -> Sha256Hash.read((ByteBuffer) any())).thenReturn(sha256Hash2);
            byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(0L);
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            TransactionOutPoint result = TransactionOutPoint.read(byteBuffer2);
            TransactionOutPoint transactionOutPoint = new TransactionOutPoint(0L, sha256Hash2);
            //Assert statement(s)
            assertThat(result, equalTo(transactionOutPoint));
            sha256Hash.verify(() -> Sha256Hash.read((ByteBuffer) any()));
            byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${050305ac-0a9f-3890-80aa-4903ddc32f8d}
    @Ignore()
    @Test()
    public void readWhenDefaultBranch2() throws BufferUnderflowException, ProtocolException {
        /* Branches:
         * (branch expression (line 91)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class)) {
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer);
            sha256Hash.when(() -> Sha256Hash.read((ByteBuffer) any())).thenReturn(sha256Hash2);
            byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(0L);
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            TransactionOutPoint result = TransactionOutPoint.read(byteBuffer2);
            TransactionOutPoint transactionOutPoint = new TransactionOutPoint(0L, sha256Hash2);
            //Assert statement(s)
            assertThat(result, equalTo(transactionOutPoint));
            sha256Hash.verify(() -> Sha256Hash.read((ByteBuffer) any()));
            byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${74367ac6-67d1-3ba8-9bdd-4aafa43d4139}
    @Ignore()
    @Test()
    public void writeTest() throws BufferOverflowException {
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            byteUtils.when(() -> ByteUtils.writeInt32LE(eq(1234567890L), (ByteBuffer) any())).thenReturn(byteBuffer);
            Transaction transaction = new Transaction();
            TransactionOutPoint target = new TransactionOutPoint(1234567890L, transaction);
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            ByteBuffer result = target.write(byteBuffer2);
            //Assert statement(s)
            assertThat(result, equalTo(byteBuffer2));
            byteUtils.verify(() -> ByteUtils.writeInt32LE(eq(1234567890L), (ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${9d328af1-2293-3544-bbbc-a0683c1f9fbe}
    @Test()
    public void serializeTest() {
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            doReturn(hashMock).when(fromTxMock).getTxId();
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
            byteUtils.verify(() -> ByteUtils.writeInt32LE(eq(0L), (ByteBuffer) any()));
            verify(hashMock).serialize();
        }
    }

    //Sapient generated method id: ${924fe7c3-f32b-3ad4-96ee-4ebf1903d243}
    @Test()
    public void bitcoinSerializeTest() {
        //Arrange Statement(s)
        Transaction transaction = new Transaction();
        TransactionOutPoint target = spy(new TransactionOutPoint(12345L, transaction));
        byte[] byteArray = new byte[]{};
        doReturn(byteArray).when(target).serialize();
        //Act Statement(s)
        byte[] result = target.bitcoinSerialize();
        //Assert statement(s)
        assertThat(result, equalTo(byteArray));
        verify(target).serialize();
    }

    //Sapient generated method id: ${94a8e2e1-7e0c-3ee1-8d62-12ae35779fa1}
    @Ignore()
    @Test()
    public void getConnectedOutputWhenFromTxIsNotNull() {
        /* Branches:
         * (fromTx != null) : true
         */
        //Arrange Statement(s)
        Transaction transaction = new Transaction();
        TransactionOutPoint target = new TransactionOutPoint(0L, transaction);
        //Act Statement(s)
        TransactionOutput result = target.getConnectedOutput();
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${80c03b9c-7790-3548-afa9-1b7cc4e2f49c}
    @Ignore()
    @Test()
    public void getConnectedOutputWhenConnectedOutputIsNull() {
        /* Branches:
         * (fromTx != null) : false
         * (connectedOutput != null) : false
         */
        //Arrange Statement(s)
        TransactionOutPoint target = new TransactionOutPoint(1L, (Transaction) null);
        //Act Statement(s)
        TransactionOutput result = target.getConnectedOutput();
        //Assert statement(s)
        assertThat(result, is(nullValue()));
    }

    //Sapient generated method id: ${b4dcaa3d-99dd-3b62-bdef-e6a2fa9a60b8}
    @Test()
    public void getConnectedPubKeyScriptWhenResultLengthGreaterThan0() {
        /* Branches:
         * (result.length > 0) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(false)).thenThrow(illegalStateException);
            Transaction transaction = new Transaction();
            TransactionOutPoint target = spy(new TransactionOutPoint(1L, transaction));
            doReturn(transactionOutputMock).when(target).getConnectedOutput();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(transactionOutputMock).getScriptBytes();
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.getConnectedPubKeyScript();
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            verify(target).getConnectedOutput();
            verify(transactionOutputMock).getScriptBytes();
        }
    }

    //Sapient generated method id: ${51091f3d-de33-355b-afef-7ab78808dac3}
    @Test()
    public void getConnectedPubKeyScriptWhenResultLengthNotGreaterThan0ThrowsIllegalStateException() {
        /* Branches:
         * (result.length > 0) : false
         */
        //Arrange Statement(s)
        Transaction transaction = new Transaction();
        TransactionOutPoint target = spy(new TransactionOutPoint(1L, transaction));
        doReturn(transactionOutputMock).when(target).getConnectedOutput();
        byte[] byteArray = new byte[]{(byte) 0};
        doReturn(byteArray).when(transactionOutputMock).getScriptBytes();
        //Act Statement(s)
        byte[] result = target.getConnectedPubKeyScript();
        //Assert statement(s)
        assertThat(result, equalTo(byteArray));
        verify(target).getConnectedOutput();
        verify(transactionOutputMock).getScriptBytes();
    }

    //Sapient generated method id: ${f85031ff-1a2c-3f30-b29d-9a0e9410815b}
    @Test()
    public void getConnectedKeyWhenScriptPatternIsP2PKHConnectedScript() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(connectedScript)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            ECKey eCKey = new ECKey();
            byte[] byteArray = new byte[]{};
            doReturn(eCKey).when(keyBagMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2PKH);
            scriptPattern.when(() -> ScriptPattern.isP2PKH((Script) any())).thenReturn(true);
            scriptPattern.when(() -> ScriptPattern.extractHashFromP2PKH((Script) any())).thenReturn(byteArray);
            Transaction transaction = new Transaction();
            TransactionOutPoint target = spy(new TransactionOutPoint(0L, transaction));
            doReturn(transactionOutputMock).when(target).getConnectedOutput();
            List list = new ArrayList<>();
            Script script = Script.of(list);
            doReturn(script).when(transactionOutputMock).getScriptPubKey();
            //Act Statement(s)
            ECKey result = target.getConnectedKey(keyBagMock);
            //Assert statement(s)
            assertThat(result, equalTo(eCKey));
            verify(keyBagMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2PKH);
            scriptPattern.verify(() -> ScriptPattern.isP2PKH((Script) any()));
            scriptPattern.verify(() -> ScriptPattern.extractHashFromP2PKH((Script) any()));
            verify(target).getConnectedOutput();
            verify(transactionOutputMock).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${ff7a9419-bdcf-33c6-8f34-b856fe3542a0}
    @Test()
    public void getConnectedKeyWhenScriptPatternIsP2WPKHConnectedScript() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(connectedScript)) : false
         * (ScriptPattern.isP2WPKH(connectedScript)) : true
         */
        //Arrange Statement(s)
        KeyBag keyBagMock = mock(KeyBag.class, "KeyBag");
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class, CALLS_REAL_METHODS)) {
            scriptPattern.when(() -> ScriptPattern.isP2PKH((Script) any())).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH((Script) any())).thenReturn(false);
            Transaction transaction = new Transaction();
            TransactionOutPoint target = spy(new TransactionOutPoint(0L, transaction));
            doReturn(transactionOutputMock).when(target).getConnectedOutput();
            List list = new ArrayList<>();
            Script script = Script.of(list);
            doReturn(script).when(transactionOutputMock).getScriptPubKey();
            thrown.expect(ScriptException.class);
            //Act Statement(s)
            target.getConnectedKey(keyBagMock);
            //Assert statement(s)
            scriptPattern.verify(() -> ScriptPattern.isP2PKH((Script) any()), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH((Script) any()), atLeast(1));
            verify(target, atLeast(1)).getConnectedOutput();
            verify(transactionOutputMock, atLeast(1)).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${97d3daf2-cb95-382a-a8d3-1bcfa404bd35}
    @Ignore()
    @Test()
    public void getConnectedKeyWhenScriptPatternNotIsP2PKConnectedScriptThrowsScriptException() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(connectedScript)) : false
         * (ScriptPattern.isP2WPKH(connectedScript)) : false
         * (ScriptPattern.isP2PK(connectedScript)) : false
         */
        //Arrange Statement(s)
        KeyBag keyBagMock = mock(KeyBag.class);
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            doReturn(sha256Hash).when(fromTxMock).getTxId();
            scriptPattern.when(() -> ScriptPattern.isP2PKH((Script) any())).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH((Script) any())).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK((Script) any())).thenReturn(false);
            TransactionOutPoint target = spy(new TransactionOutPoint(0L, fromTxMock));
            doReturn(transactionOutputMock).when(target).getConnectedOutput();
            List list = new ArrayList<>();
            Script script = Script.of(list);
            doReturn(script).when(transactionOutputMock).getScriptPubKey();
            thrown.expect(ScriptException.class);
            //Act Statement(s)
            target.getConnectedKey(keyBagMock);
            //Assert statement(s)
            verify(fromTxMock).getTxId();
            scriptPattern.verify(() -> ScriptPattern.isP2PKH((Script) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH((Script) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2PK((Script) any()));
            verify(target).getConnectedOutput();
            verify(transactionOutputMock).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${c6b5285d-7302-38ab-bd21-75d13eaa7872}
    @Test()
    public void getConnectedRedeemDataWhenScriptPatternIsP2WPKHConnectedScript() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(connectedScript)) : false
         * (ScriptPattern.isP2WPKH(connectedScript)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<RedeemData> redeemData = mockStatic(RedeemData.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            ECKey eCKey = new ECKey();
            byte[] byteArray = new byte[]{};
            doReturn(eCKey).when(keyBagMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2WPKH);
            scriptPattern.when(() -> ScriptPattern.isP2PKH((Script) any())).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH((Script) any())).thenReturn(true);
            scriptPattern.when(() -> ScriptPattern.extractHashFromP2WH((Script) any())).thenReturn(byteArray);
            List list = new ArrayList<>();
            RedeemData redeemData2 = RedeemData.of(list, scriptMock);
            redeemData.when(() -> RedeemData.of(eq(eCKey), (Script) any())).thenReturn(redeemData2);
            Transaction transaction = new Transaction();
            TransactionOutPoint target = spy(new TransactionOutPoint(123456789L, transaction));
            doReturn(transactionOutputMock).when(target).getConnectedOutput();
            List list2 = new ArrayList<>();
            Script script = Script.of(list2);
            doReturn(script).when(transactionOutputMock).getScriptPubKey();
            //Act Statement(s)
            RedeemData result = target.getConnectedRedeemData(keyBagMock);
            //Assert statement(s)
            assertThat(result, equalTo(redeemData2));
            verify(keyBagMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2WPKH);
            scriptPattern.verify(() -> ScriptPattern.isP2PKH((Script) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH((Script) any()));
            scriptPattern.verify(() -> ScriptPattern.extractHashFromP2WH((Script) any()));
            redeemData.verify(() -> RedeemData.of(eq(eCKey), (Script) any()));
            verify(target).getConnectedOutput();
            verify(transactionOutputMock).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${3eab6edb-f6b0-3ff9-9ef3-d2acf12c9b43}
    @Test()
    public void getConnectedRedeemDataWhenScriptPatternIsP2PKConnectedScript() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(connectedScript)) : false
         * (ScriptPattern.isP2WPKH(connectedScript)) : false
         * (ScriptPattern.isP2PK(connectedScript)) : true
         */
        //Arrange Statement(s)
        KeyBag keyBagMock = mock(KeyBag.class, "ECKey");
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class, CALLS_REAL_METHODS)) {
            scriptPattern.when(() -> ScriptPattern.isP2PKH((Script) any())).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH((Script) any())).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK((Script) any())).thenReturn(false);
            Transaction transaction = new Transaction();
            TransactionOutPoint target = spy(new TransactionOutPoint(0L, transaction));
            doReturn(transactionOutputMock).when(target).getConnectedOutput();
            List list = new ArrayList<>();
            Script script = Script.of(list);
            doReturn(script).when(transactionOutputMock).getScriptPubKey();
            thrown.expect(ScriptException.class);
            //Act Statement(s)
            target.getConnectedRedeemData(keyBagMock);
            //Assert statement(s)
            scriptPattern.verify(() -> ScriptPattern.isP2PKH((Script) any()), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH((Script) any()), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK((Script) any()), atLeast(1));
            verify(target, atLeast(1)).getConnectedOutput();
            verify(transactionOutputMock, atLeast(1)).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${6df325cf-381f-33a4-8db5-97982c48df3b}
    @Test()
    public void getConnectedRedeemDataWhenScriptPatternIsP2SHConnectedScript() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(connectedScript)) : false
         * (ScriptPattern.isP2WPKH(connectedScript)) : false
         * (ScriptPattern.isP2PK(connectedScript)) : false
         * (ScriptPattern.isP2SH(connectedScript)) : true
         */
        //Arrange Statement(s)
        KeyBag keyBagMock = mock(KeyBag.class, "KeyBag");
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            List list = new ArrayList<>();
            RedeemData redeemData = RedeemData.of(list, scriptMock);
            byte[] byteArray = new byte[]{};
            doReturn(redeemData).when(keyBagMock).findRedeemDataFromScriptHash(byteArray);
            scriptPattern.when(() -> ScriptPattern.isP2PKH((Script) any())).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH((Script) any())).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK((Script) any())).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH((Script) any())).thenReturn(true);
            scriptPattern.when(() -> ScriptPattern.extractHashFromP2SH((Script) any())).thenReturn(byteArray);
            Transaction transaction = new Transaction();
            TransactionOutPoint target = spy(new TransactionOutPoint(0L, transaction));
            doReturn(transactionOutputMock).when(target).getConnectedOutput();
            List list2 = new ArrayList<>();
            Script script = Script.of(list2);
            doReturn(script).when(transactionOutputMock).getScriptPubKey();
            //Act Statement(s)
            RedeemData result = target.getConnectedRedeemData(keyBagMock);
            //Assert statement(s)
            assertThat(result, equalTo(redeemData));
            verify(keyBagMock).findRedeemDataFromScriptHash(byteArray);
            scriptPattern.verify(() -> ScriptPattern.isP2PKH((Script) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH((Script) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2PK((Script) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2SH((Script) any()));
            scriptPattern.verify(() -> ScriptPattern.extractHashFromP2SH((Script) any()));
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
         */
        //Arrange Statement(s)
        KeyBag keyBagMock = mock(KeyBag.class);
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            doReturn(hashMock).when(fromTxMock).getTxId();
            scriptPattern.when(() -> ScriptPattern.isP2PKH((Script) any())).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH((Script) any())).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK((Script) any())).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH((Script) any())).thenReturn(false);
            TransactionOutPoint target = spy(new TransactionOutPoint(0L, fromTxMock));
            doReturn(transactionOutputMock).when(target).getConnectedOutput();
            List list = new ArrayList<>();
            Script script = Script.of(list);
            doReturn(script).when(transactionOutputMock).getScriptPubKey();
            thrown.expect(ScriptException.class);
            //Act Statement(s)
            target.getConnectedRedeemData(keyBagMock);
            //Assert statement(s)
            verify(fromTxMock).getTxId();
            scriptPattern.verify(() -> ScriptPattern.isP2PKH((Script) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH((Script) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2PK((Script) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2SH((Script) any()));
            verify(target).getConnectedOutput();
            verify(transactionOutputMock).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${fc20ac21-7d17-3798-af24-ff701446c683}
    @Ignore()
    @Test()
    public void disconnectOutputWhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 91)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        Transaction transaction = new Transaction();
        TransactionOutPoint target = new TransactionOutPoint(-1L, transaction);
        //Act Statement(s)
        TransactionOutPoint result = target.disconnectOutput();
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${2b60077b-6edb-33a8-8d10-7da80944739d}
    @Test()
    public void disconnectOutputWhenDefaultBranch2() {
        /* Branches:
         * (branch expression (line 91)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(hashMock).when(fromTxMock).getTxId();
        TransactionOutPoint target = new TransactionOutPoint(0L, fromTxMock);
        //Act Statement(s)
        TransactionOutPoint result = target.disconnectOutput();
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
        verify(fromTxMock).getTxId();
    }

    //Sapient generated method id: ${34f6ebfd-9fbb-384a-b52e-55f7493f7694}
    @Test()
    public void connectTransactionWhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 91)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        Transaction transaction = new Transaction();
        TransactionOutPoint target = new TransactionOutPoint(0L, transaction);
        Transaction transaction2 = new Transaction();
        //Act Statement(s)
        TransactionOutPoint result = target.connectTransaction(transaction2);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${b870df2d-6e69-3b57-a6ee-bdb692103baa}
    @Test()
    public void connectTransactionWhenDefaultBranch2() {
        /* Branches:
         * (branch expression (line 91)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(hashMock).when(fromTxMock).getTxId();
        TransactionOutPoint target = new TransactionOutPoint(0L, fromTxMock);
        Transaction transactionMock = mock(Transaction.class);
        //Act Statement(s)
        TransactionOutPoint result = target.connectTransaction(transactionMock);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
        verify(fromTxMock).getTxId();
    }

    //Sapient generated method id: ${9ef182bf-a88a-31d6-a7f9-d7728faf735d}
    @Test()
    public void disconnectTransactionWhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 91)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        Transaction transaction = new Transaction();
        TransactionOutPoint target = new TransactionOutPoint(1L, transaction);
        //Act Statement(s)
        TransactionOutPoint result = target.disconnectTransaction();
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${d4963e0f-eb1f-32c4-be5d-3758029b3542}
    @Test()
    public void disconnectTransactionWhenDefaultBranch2() {
        /* Branches:
         * (branch expression (line 91)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(hashMock).when(fromTxMock).getTxId();
        TransactionOutPoint target = new TransactionOutPoint(0L, fromTxMock);
        //Act Statement(s)
        TransactionOutPoint result = target.disconnectTransaction();
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
        verify(fromTxMock).getTxId();
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}
    @Ignore()
    @Test()
    public void toStringTest() {
        //Arrange Statement(s)
        Transaction transaction = new Transaction();
        TransactionOutPoint target = new TransactionOutPoint(123456789L, transaction);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("d21633ba23f70118185227be58a63527675641ad37967e2aa461559f577aec43:123456789"));
    }

    //Sapient generated method id: ${9d300d6c-ecd3-35df-b3af-b16008977eae}
    @Ignore()
    @Test()
    public void hashTest() {
        //Arrange Statement(s)
        Transaction transaction = new Transaction();
        TransactionOutPoint target = new TransactionOutPoint(0L, transaction);
        //Act Statement(s)
        Sha256Hash result = target.hash();
        //Assert statement(s)
        assertThat(result, equalTo(hashMock));
    }

    //Sapient generated method id: ${5f246a97-4870-30c4-9915-ed4b32bcd219}
    @Test()
    public void indexTest() {
        //Arrange Statement(s)
        Transaction transaction = new Transaction();
        TransactionOutPoint target = new TransactionOutPoint(1L, transaction);
        //Act Statement(s)
        long result = target.index();
        //Assert statement(s)
        assertThat(result, equalTo(1L));
    }

    //Sapient generated method id: ${c152b292-9f41-3184-8d0c-c8dacb973313}
    @Test()
    public void getHashTest() {
        //Arrange Statement(s)
        doReturn(hashMock).when(fromTxMock).getTxId();
        TransactionOutPoint target = new TransactionOutPoint(0L, fromTxMock);
        //Act Statement(s)
        Sha256Hash result = target.getHash();
        //Assert statement(s)
        assertThat(result, equalTo(hashMock));
        verify(fromTxMock).getTxId();
    }

    //Sapient generated method id: ${1051d90e-6143-3be9-a736-0083704c4119}
    @Test()
    public void getIndexTest() {
        //Arrange Statement(s)
        Transaction transaction = new Transaction();
        TransactionOutPoint target = new TransactionOutPoint(0L, transaction);
        //Act Statement(s)
        long result = target.getIndex();
        //Assert statement(s)
        assertThat(result, equalTo(0L));
    }
}
