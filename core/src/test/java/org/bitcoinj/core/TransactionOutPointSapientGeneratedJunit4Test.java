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
import org.bitcoinj.base.Coin;
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

public class TransactionOutPointSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Sha256Hash hashMock = mock(Sha256Hash.class, "hash");

    private final Transaction fromTxMock = mock(Transaction.class, "fromTx");

    private final Coin coinMock = mock(Coin.class);

    private final ECKey eCKeyMock = mock(ECKey.class);

    private final KeyBag keyBagMock = mock(KeyBag.class);

    private final RedeemData redeemDataMock = mock(RedeemData.class);

    private final Script scriptMock = mock(Script.class);

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    private final Transaction transactionMock = mock(Transaction.class);

    private final TransactionOutput transactionOutputMock = mock(TransactionOutput.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${d7d7c181-85f8-3d2b-b5a1-c1ddd262297c}, hash: 6F99FDD0CDF78B9096E9875881BF3EC4
    @Test()
    public void readWhenDefaultBranch() throws BufferUnderflowException, ProtocolException {
        /* Branches:
         * (branch expression (line 91)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class)) {
            sha256Hash.when(() -> Sha256Hash.read((ByteBuffer) any())).thenReturn(sha256HashMock);
            byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(0L);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            TransactionOutPoint result = TransactionOutPoint.read(byteBuffer);
            TransactionOutPoint transactionOutPoint = new TransactionOutPoint(0L, sha256HashMock);
            //Assert statement(s)
            assertThat(result, equalTo(transactionOutPoint));
            sha256Hash.verify(() -> Sha256Hash.read((ByteBuffer) any()));
            byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${deec3b8b-bc29-3d32-aa61-00de8060308e}, hash: FA519E30F95920E10996BA433422CF76
    @Ignore()
    @Test()
    public void readWhenDefaultBranchThrowsIllegalArgumentException() throws BufferUnderflowException, ProtocolException {
        /* Branches:
         * (branch expression (line 91)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class)) {
            sha256Hash.when(() -> Sha256Hash.read((ByteBuffer) any())).thenReturn(sha256HashMock);
            byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(1L);
            thrown.expect(IllegalArgumentException.class);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            TransactionOutPoint.read(byteBuffer);
            //Assert statement(s)
            sha256Hash.verify(() -> Sha256Hash.read((ByteBuffer) any()));
            byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${74367ac6-67d1-3ba8-9bdd-4aafa43d4139}, hash: A05E3F7F8C6C66E50E9C30400BFACFC1
    @Test()
    public void writeTest() throws BufferOverflowException {
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            doReturn(hashMock).when(fromTxMock).getTxId();
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            byteUtils.when(() -> ByteUtils.writeInt32LE(eq(0L), (ByteBuffer) any())).thenReturn(byteBuffer);
            TransactionOutPoint target = new TransactionOutPoint(0L, fromTxMock);
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(hashMock).serialize();
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            ByteBuffer result = target.write(byteBuffer2);
            //Assert statement(s)
            assertThat(result, equalTo(byteBuffer2));
            verify(fromTxMock).getTxId();
            byteUtils.verify(() -> ByteUtils.writeInt32LE(eq(0L), (ByteBuffer) any()));
            verify(hashMock).serialize();
        }
    }

    //Sapient generated method id: ${9d328af1-2293-3544-bbbc-a0683c1f9fbe}, hash: 00F773D5B259DF10469A11E1DC85D066
    @Test()
    public void serializeTest() {
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            doReturn(hashMock).when(fromTxMock).getTxId();
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
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

    //Sapient generated method id: ${924fe7c3-f32b-3ad4-96ee-4ebf1903d243}, hash: 4EF0D7FFC4FDA8865316D78993545CFA
    @Test()
    public void bitcoinSerializeTest() {
        //Arrange Statement(s)
        doReturn(hashMock).when(fromTxMock).getTxId();
        TransactionOutPoint target = spy(new TransactionOutPoint(0L, fromTxMock));
        byte[] byteArray = new byte[]{};
        doReturn(byteArray).when(target).serialize();
        //Act Statement(s)
        byte[] result = target.bitcoinSerialize();
        //Assert statement(s)
        assertThat(result, equalTo(byteArray));
        verify(fromTxMock).getTxId();
        verify(target).serialize();
    }

    //Sapient generated method id: ${94a8e2e1-7e0c-3ee1-8d62-12ae35779fa1}, hash: 5278160C8508AF4F72E959CDAC283CB2
    @Test()
    public void getConnectedOutputWhenFromTxIsNotNull() {
        /* Branches:
         * (fromTx != null) : true
         */
        //Arrange Statement(s)
        doReturn(hashMock).when(fromTxMock).getTxId();
        TransactionOutPoint target = new TransactionOutPoint(0L, fromTxMock);
        doReturn(transactionOutputMock).when(fromTxMock).getOutput(0L);
        //Act Statement(s)
        TransactionOutput result = target.getConnectedOutput();
        //Assert statement(s)
        assertThat(result, equalTo(transactionOutputMock));
        verify(fromTxMock).getTxId();
        verify(fromTxMock).getOutput(0L);
    }

    //Sapient generated method id: ${80c03b9c-7790-3548-afa9-1b7cc4e2f49c}, hash: 984BDD88F5EC8FFA2FD5A91895505F7D
    @Ignore()
    @Test()
    public void getConnectedOutputWhenConnectedOutputIsNull() {
        /* Branches:
         * (fromTx != null) : false
         * (connectedOutput != null) : false
         */
        //Arrange Statement(s)
        TransactionOutPoint target = new TransactionOutPoint(0L, (Transaction) null);
        //Act Statement(s)
        TransactionOutput result = target.getConnectedOutput();
        //Assert statement(s)
        assertThat(result, is(nullValue()));
    }

    //Sapient generated method id: ${b4dcaa3d-99dd-3b62-bdef-e6a2fa9a60b8}, hash: CBA1819D5E57A057BC661C04DF9E9294
    @Test()
    public void getConnectedPubKeyScriptWhenResultLengthGreaterThan0() {
        /* Branches:
         * (result.length > 0) : true
         */
        //Arrange Statement(s)
        doReturn(hashMock).when(fromTxMock).getTxId();
        TransactionOutPoint target = spy(new TransactionOutPoint(0L, fromTxMock));
        byte[] byteArray = new byte[]{(byte) 0};
        TransactionOutput transactionOutput = new TransactionOutput(transactionMock, coinMock, byteArray);
        doReturn(transactionOutput).when(target).getConnectedOutput();
        //Act Statement(s)
        byte[] result = target.getConnectedPubKeyScript();
        //Assert statement(s)
        assertThat(result, equalTo(byteArray));
        verify(fromTxMock).getTxId();
        verify(target).getConnectedOutput();
    }

    //Sapient generated method id: ${51091f3d-de33-355b-afef-7ab78808dac3}, hash: 460799C8A32126B44AA404D021BCE7C5
    @Test()
    public void getConnectedPubKeyScriptWhenResultLengthNotGreaterThan0ThrowsIllegalStateException() {
        /* Branches:
         * (result.length > 0) : false
         */
        //Arrange Statement(s)
        doReturn(hashMock).when(fromTxMock).getTxId();
        TransactionOutPoint target = spy(new TransactionOutPoint(0L, fromTxMock));
        byte[] byteArray = new byte[]{};
        TransactionOutput transactionOutput = new TransactionOutput(transactionMock, coinMock, byteArray);
        doReturn(transactionOutput).when(target).getConnectedOutput();
        thrown.expect(IllegalStateException.class);
        //Act Statement(s)
        target.getConnectedPubKeyScript();
        //Assert statement(s)
        verify(fromTxMock).getTxId();
        verify(target).getConnectedOutput();
    }

    //Sapient generated method id: ${f85031ff-1a2c-3f30-b29d-9a0e9410815b}, hash: 95E2E325B38F284F9BDF46D0458A3F8A
    @Test()
    public void getConnectedKeyWhenScriptPatternIsP2PKHConnectedScript() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(connectedScript)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(eCKeyMock).when(keyBagMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2PKH);
            doReturn(hashMock).when(fromTxMock).getTxId();
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
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractHashFromP2PKH(scriptMock), atLeast(1));
            verify(target).getConnectedOutput();
            verify(transactionOutputMock).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${ff7a9419-bdcf-33c6-8f34-b856fe3542a0}, hash: 2ECEC92D4B6D3098578E781DEDFB796F
    @Test()
    public void getConnectedKeyWhenScriptPatternIsP2WPKHConnectedScript() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(connectedScript)) : false
         * (ScriptPattern.isP2WPKH(connectedScript)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(eCKeyMock).when(keyBagMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2WPKH);
            doReturn(hashMock).when(fromTxMock).getTxId();
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
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractHashFromP2WH(scriptMock), atLeast(1));
            verify(target).getConnectedOutput();
            verify(transactionOutputMock).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${b651f4d8-ac3d-35b4-853e-f24baf7c71b9}, hash: C5C359146F0E4A010CB95C7BF3319097
    @Test()
    public void getConnectedKeyWhenScriptPatternIsP2PKConnectedScript() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(connectedScript)) : false
         * (ScriptPattern.isP2WPKH(connectedScript)) : false
         * (ScriptPattern.isP2PK(connectedScript)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(eCKeyMock).when(keyBagMock).findKeyFromPubKey(byteArray);
            doReturn(hashMock).when(fromTxMock).getTxId();
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
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractKeyFromP2PK(scriptMock), atLeast(1));
            verify(target).getConnectedOutput();
            verify(transactionOutputMock).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${97d3daf2-cb95-382a-a8d3-1bcfa404bd35}, hash: C16F3EA4C7986E4A6CB00CDB28715C86
    @Test()
    public void getConnectedKeyWhenScriptPatternNotIsP2PKConnectedScriptThrowsScriptException() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(connectedScript)) : false
         * (ScriptPattern.isP2WPKH(connectedScript)) : false
         * (ScriptPattern.isP2PK(connectedScript)) : false
         */
        //Arrange Statement(s)
        Script scriptMock = mock(Script.class, "getConnectedKey_script1");
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            doReturn(hashMock).when(fromTxMock).getTxId();
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
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            verify(target).getConnectedOutput();
            verify(transactionOutputMock).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${63590fbc-487d-307f-940e-bf3655312e87}, hash: CD4B97BE01208C503E1305616D0E9961
    @Test()
    public void getConnectedRedeemDataWhenScriptPatternIsP2PKHConnectedScript() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(connectedScript)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<RedeemData> redeemData = mockStatic(RedeemData.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(eCKeyMock).when(keyBagMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2PKH);
            doReturn(hashMock).when(fromTxMock).getTxId();
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
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractHashFromP2PKH(scriptMock), atLeast(1));
            redeemData.verify(() -> RedeemData.of(eCKeyMock, scriptMock), atLeast(1));
            verify(target).getConnectedOutput();
            verify(transactionOutputMock).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${c6b5285d-7302-38ab-bd21-75d13eaa7872}, hash: 865C946E19E40E8F33BF6275F4C8528A
    @Test()
    public void getConnectedRedeemDataWhenScriptPatternIsP2WPKHConnectedScript() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(connectedScript)) : false
         * (ScriptPattern.isP2WPKH(connectedScript)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<RedeemData> redeemData = mockStatic(RedeemData.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(eCKeyMock).when(keyBagMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2WPKH);
            doReturn(hashMock).when(fromTxMock).getTxId();
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
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractHashFromP2WH(scriptMock), atLeast(1));
            redeemData.verify(() -> RedeemData.of(eCKeyMock, scriptMock), atLeast(1));
            verify(target).getConnectedOutput();
            verify(transactionOutputMock).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${3eab6edb-f6b0-3ff9-9ef3-d2acf12c9b43}, hash: 0718A7477785D20280B5F80E07EC3D7E
    @Test()
    public void getConnectedRedeemDataWhenScriptPatternIsP2PKConnectedScript() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(connectedScript)) : false
         * (ScriptPattern.isP2WPKH(connectedScript)) : false
         * (ScriptPattern.isP2PK(connectedScript)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<RedeemData> redeemData = mockStatic(RedeemData.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(eCKeyMock).when(keyBagMock).findKeyFromPubKey(byteArray);
            doReturn(hashMock).when(fromTxMock).getTxId();
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
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractKeyFromP2PK(scriptMock), atLeast(1));
            redeemData.verify(() -> RedeemData.of(eCKeyMock, scriptMock), atLeast(1));
            verify(target).getConnectedOutput();
            verify(transactionOutputMock).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${6df325cf-381f-33a4-8db5-97982c48df3b}, hash: AF3C18451AE811FD89149E5880A1ADB6
    @Test()
    public void getConnectedRedeemDataWhenScriptPatternIsP2SHConnectedScript() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(connectedScript)) : false
         * (ScriptPattern.isP2WPKH(connectedScript)) : false
         * (ScriptPattern.isP2PK(connectedScript)) : false
         * (ScriptPattern.isP2SH(connectedScript)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(redeemDataMock).when(keyBagMock).findRedeemDataFromScriptHash(byteArray);
            doReturn(hashMock).when(fromTxMock).getTxId();
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
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractHashFromP2SH(scriptMock), atLeast(1));
            verify(target).getConnectedOutput();
            verify(transactionOutputMock).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${4fd40112-5873-3600-b74f-f8a33ad73d09}, hash: 83DC2046F7F848C27577FD91D797EB82
    @Test()
    public void getConnectedRedeemDataWhenScriptPatternNotIsP2SHConnectedScriptThrowsScriptException() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(connectedScript)) : false
         * (ScriptPattern.isP2WPKH(connectedScript)) : false
         * (ScriptPattern.isP2PK(connectedScript)) : false
         * (ScriptPattern.isP2SH(connectedScript)) : false
         */
        //Arrange Statement(s)
        Script scriptMock = mock(Script.class, "getConnectedRedeemData_script1");
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            doReturn(hashMock).when(fromTxMock).getTxId();
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
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(1));
            verify(target).getConnectedOutput();
            verify(transactionOutputMock).getScriptPubKey();
        }
    }

    //Sapient generated method id: ${fc20ac21-7d17-3798-af24-ff701446c683}, hash: 8CFB2ADFE698DD0BB8A79548C08E820B
    @Test()
    public void disconnectOutputWhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 91)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        doReturn(hashMock).when(fromTxMock).getTxId();
        TransactionOutPoint target = new TransactionOutPoint(0L, fromTxMock);
        //Act Statement(s)
        TransactionOutPoint result = target.disconnectOutput();
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
        verify(fromTxMock, atLeast(1)).getTxId();
    }

    //Sapient generated method id: ${d9e39a67-74c4-3965-ae2b-0a81ca7c754a}, hash: 3E8F2E9427801B2B1C4C153AB66B1AA6
    @Test()
    public void disconnectOutputWhenDefaultBranchThrowsIllegalArgumentException() {
        /* Branches:
         * (branch expression (line 91)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        doReturn(hashMock).when(fromTxMock).getTxId();
        TransactionOutPoint target = new TransactionOutPoint(0L, fromTxMock);
        //Act Statement(s)
        TransactionOutPoint result = target.disconnectOutput();
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
        verify(fromTxMock, atLeast(1)).getTxId();
    }

    //Sapient generated method id: ${34f6ebfd-9fbb-384a-b52e-55f7493f7694}, hash: D943DB31C769660544D45318A08CE10F
    @Test()
    public void connectTransactionWhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 91)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        doReturn(hashMock).when(fromTxMock).getTxId();
        TransactionOutPoint target = new TransactionOutPoint(0L, fromTxMock);
        //Act Statement(s)
        TransactionOutPoint result = target.connectTransaction(transactionMock);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
        verify(fromTxMock).getTxId();
    }

    //Sapient generated method id: ${4ef19704-57d4-34d5-9e73-70f5b9defd58}, hash: 3EA3763E42A789D614F35EF415B1693E
    @Test()
    public void connectTransactionWhenDefaultBranchThrowsIllegalArgumentException() {
        /* Branches:
         * (branch expression (line 91)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        doReturn(hashMock).when(fromTxMock).getTxId();
        TransactionOutPoint target = new TransactionOutPoint(0L, fromTxMock);
        //Act Statement(s)
        TransactionOutPoint result = target.connectTransaction(transactionMock);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
        verify(fromTxMock).getTxId();
    }

    //Sapient generated method id: ${9ef182bf-a88a-31d6-a7f9-d7728faf735d}, hash: BEF342D1028D5B12366A72E62F1425CE
    @Test()
    public void disconnectTransactionWhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 91)) : false  #  inside <init> method
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

    //Sapient generated method id: ${c2b3e60c-c17f-39a6-b50b-883830e40442}, hash: 60AB0811774AAB4B67B62F65DAA5E2A0
    @Test()
    public void disconnectTransactionWhenDefaultBranchThrowsIllegalArgumentException() {
        /* Branches:
         * (branch expression (line 91)) : false  #  inside <init> method
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

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: 1993408B5726A86F11F0840579130171
    @Ignore()
    @Test()
    public void toStringTest() {
        //Arrange Statement(s)
        doReturn(hashMock).when(fromTxMock).getTxId();
        TransactionOutPoint target = new TransactionOutPoint(0L, fromTxMock);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("<init>_sha256Hash2:0"));
        verify(fromTxMock).getTxId();
    }

    //Sapient generated method id: ${9d300d6c-ecd3-35df-b3af-b16008977eae}, hash: 2A7AFE131D53DABB0A5E0F42E7A650D7
    @Test()
    public void hashTest() {
        //Arrange Statement(s)
        doReturn(hashMock).when(fromTxMock).getTxId();
        TransactionOutPoint target = new TransactionOutPoint(0L, fromTxMock);
        //Act Statement(s)
        Sha256Hash result = target.hash();
        //Assert statement(s)
        assertThat(result, equalTo(hashMock));
        verify(fromTxMock).getTxId();
    }

    //Sapient generated method id: ${5f246a97-4870-30c4-9915-ed4b32bcd219}, hash: C1F45663419C14FABA54B103B9457DA4
    @Test()
    public void indexTest() {
        //Arrange Statement(s)
        doReturn(hashMock).when(fromTxMock).getTxId();
        TransactionOutPoint target = new TransactionOutPoint(0L, fromTxMock);
        //Act Statement(s)
        long result = target.index();
        //Assert statement(s)
        assertThat(result, equalTo(0L));
        verify(fromTxMock).getTxId();
    }

    //Sapient generated method id: ${c152b292-9f41-3184-8d0c-c8dacb973313}, hash: E861CBED739596B6181CF339B7420726
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

    //Sapient generated method id: ${1051d90e-6143-3be9-a736-0083704c4119}, hash: 2BB9880C2DC825CAE6C62602D258550F
    @Test()
    public void getIndexTest() {
        //Arrange Statement(s)
        doReturn(hashMock).when(fromTxMock).getTxId();
        TransactionOutPoint target = new TransactionOutPoint(0L, fromTxMock);
        //Act Statement(s)
        long result = target.getIndex();
        //Assert statement(s)
        assertThat(result, equalTo(0L));
        verify(fromTxMock).getTxId();
    }
}
