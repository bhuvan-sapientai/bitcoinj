package org.bitcoinj.wallet;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.crypto.KeyCrypterException;
import org.junit.rules.ExpectedException;

import java.util.List;

import org.bitcoinj.base.ScriptType;
import org.bitcoinj.crypto.ECKey;
import org.mockito.MockedStatic;

import java.util.ArrayList;

import org.bitcoinj.script.Script;
import org.bitcoinj.crypto.AesKey;

import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class DecryptingKeyBagSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final KeyBag targetMock = mock(KeyBag.class, "target");

    private final AesKey aesKeyMock = mock(AesKey.class);

    private final ECKey eCKeyMock = mock(ECKey.class);

    private final ECKey eCKeyMock2 = mock(ECKey.class);

    private final RedeemData redeemDataMock = mock(RedeemData.class);

    private final RedeemData redeemDataMock2 = mock(RedeemData.class);

    private final Script scriptMock = mock(Script.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${3e0844fc-0454-36bc-ad62-c03333a4359b}
    @Test()
    public void findKeyFromPubKeyHashWhenKeyIsNull() {
        /* Branches:
         * (key == null) : true  #  inside maybeDecrypt method
         */
        //Arrange Statement(s)
        DecryptingKeyBag target = new DecryptingKeyBag(targetMock, aesKeyMock);
        byte[] byteArray = new byte[]{};
        doReturn(null).when(targetMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2PKH);

        //Act Statement(s)
        ECKey result = target.findKeyFromPubKeyHash(byteArray, ScriptType.P2PKH);

        //Assert statement(s)
        assertThat(result, is(nullValue()));
        verify(targetMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2PKH);
    }

    //Sapient generated method id: ${78bbd9b7-7717-3f50-9697-12e79ca26734}
    @Test()
    public void findKeyFromPubKeyHashWhenKeyNotIsEncrypted() {
        /* Branches:
         * (key == null) : false  #  inside maybeDecrypt method
         * (key.isEncrypted()) : false  #  inside maybeDecrypt method
         */
        //Arrange Statement(s)
        DecryptingKeyBag target = new DecryptingKeyBag(targetMock, aesKeyMock);
        byte[] byteArray = new byte[]{};
        doReturn(eCKeyMock).when(targetMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2PKH);
        doReturn(false).when(eCKeyMock).isEncrypted();

        //Act Statement(s)
        ECKey result = target.findKeyFromPubKeyHash(byteArray, ScriptType.P2PKH);

        //Assert statement(s)
        assertThat(result, equalTo(eCKeyMock));
        verify(targetMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2PKH);
        verify(eCKeyMock).isEncrypted();
    }

    //Sapient generated method id: ${abbaf156-aef6-3779-a475-04cbad1d73cf}
    @Test()
    public void findKeyFromPubKeyHashWhenAesKeyIsNullThrowsECKeyKeyIsEncryptedException() {
        /* Branches:
         * (key == null) : false  #  inside maybeDecrypt method
         * (key.isEncrypted()) : true  #  inside maybeDecrypt method
         * (aesKey == null) : true  #  inside maybeDecrypt method
         */
        //Arrange Statement(s)
        DecryptingKeyBag target = new DecryptingKeyBag(targetMock, (AesKey) null);
        byte[] byteArray = new byte[]{};
        doReturn(eCKeyMock).when(targetMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2PKH);
        doReturn(true).when(eCKeyMock).isEncrypted();
        thrown.expect(ECKey.KeyIsEncryptedException.class);

        //Act Statement(s)
        target.findKeyFromPubKeyHash(byteArray, ScriptType.P2PKH);

        //Assert statement(s)
        verify(targetMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2PKH);
        verify(eCKeyMock).isEncrypted();
    }

    //Sapient generated method id: ${82511563-8c7c-3127-9d47-29a79df21ef4}
    @Test()
    public void findKeyFromPubKeyHashWhenAesKeyIsNotNull() throws KeyCrypterException {
        /* Branches:
         * (key == null) : false  #  inside maybeDecrypt method
         * (key.isEncrypted()) : true  #  inside maybeDecrypt method
         * (aesKey == null) : false  #  inside maybeDecrypt method
         */
        //Arrange Statement(s)
        DecryptingKeyBag target = new DecryptingKeyBag(targetMock, aesKeyMock);
        byte[] byteArray = new byte[]{};
        doReturn(eCKeyMock).when(targetMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2PKH);
        doReturn(true).when(eCKeyMock).isEncrypted();
        doReturn(eCKeyMock2).when(eCKeyMock).decrypt(aesKeyMock);

        //Act Statement(s)
        ECKey result = target.findKeyFromPubKeyHash(byteArray, ScriptType.P2PKH);

        //Assert statement(s)
        assertThat(result, equalTo(eCKeyMock2));
        verify(targetMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2PKH);
        verify(eCKeyMock).isEncrypted();
        verify(eCKeyMock).decrypt(aesKeyMock);
    }

    //Sapient generated method id: ${3d7d7bf6-29c5-3904-a6b8-511994e0c3a7}
    @Test()
    public void findKeyFromPubKeyWhenKeyIsNull() {
        /* Branches:
         * (key == null) : true  #  inside maybeDecrypt method
         */
        //Arrange Statement(s)
        DecryptingKeyBag target = new DecryptingKeyBag(targetMock, aesKeyMock);
        byte[] byteArray = new byte[]{};
        doReturn(null).when(targetMock).findKeyFromPubKey(byteArray);

        //Act Statement(s)
        ECKey result = target.findKeyFromPubKey(byteArray);

        //Assert statement(s)
        assertThat(result, is(nullValue()));
        verify(targetMock).findKeyFromPubKey(byteArray);
    }

    //Sapient generated method id: ${4ecc54fc-dd2e-3fa8-80db-d0e24e14dd0e}
    @Test()
    public void findKeyFromPubKeyWhenKeyNotIsEncrypted() {
        /* Branches:
         * (key == null) : false  #  inside maybeDecrypt method
         * (key.isEncrypted()) : false  #  inside maybeDecrypt method
         */
        //Arrange Statement(s)
        DecryptingKeyBag target = new DecryptingKeyBag(targetMock, aesKeyMock);
        byte[] byteArray = new byte[]{};
        doReturn(eCKeyMock).when(targetMock).findKeyFromPubKey(byteArray);
        doReturn(false).when(eCKeyMock).isEncrypted();

        //Act Statement(s)
        ECKey result = target.findKeyFromPubKey(byteArray);

        //Assert statement(s)
        assertThat(result, equalTo(eCKeyMock));
        verify(targetMock).findKeyFromPubKey(byteArray);
        verify(eCKeyMock).isEncrypted();
    }

    //Sapient generated method id: ${1efcc87a-1fa8-39ea-ba9b-2eacdc689274}
    @Test()
    public void findKeyFromPubKeyWhenAesKeyIsNullThrowsECKeyKeyIsEncryptedException() {
        /* Branches:
         * (key == null) : false  #  inside maybeDecrypt method
         * (key.isEncrypted()) : true  #  inside maybeDecrypt method
         * (aesKey == null) : true  #  inside maybeDecrypt method
         */
        //Arrange Statement(s)
        DecryptingKeyBag target = new DecryptingKeyBag(targetMock, (AesKey) null);
        byte[] byteArray = new byte[]{};
        doReturn(eCKeyMock).when(targetMock).findKeyFromPubKey(byteArray);
        doReturn(true).when(eCKeyMock).isEncrypted();
        thrown.expect(ECKey.KeyIsEncryptedException.class);

        //Act Statement(s)
        target.findKeyFromPubKey(byteArray);

        //Assert statement(s)
        verify(targetMock).findKeyFromPubKey(byteArray);
        verify(eCKeyMock).isEncrypted();
    }

    //Sapient generated method id: ${5df3db22-c0f6-37ab-84c0-e993c59b2f74}
    @Test()
    public void findKeyFromPubKeyWhenAesKeyIsNotNull() throws KeyCrypterException {
        /* Branches:
         * (key == null) : false  #  inside maybeDecrypt method
         * (key.isEncrypted()) : true  #  inside maybeDecrypt method
         * (aesKey == null) : false  #  inside maybeDecrypt method
         */
        //Arrange Statement(s)
        DecryptingKeyBag target = new DecryptingKeyBag(targetMock, aesKeyMock);
        byte[] byteArray = new byte[]{};
        doReturn(eCKeyMock).when(targetMock).findKeyFromPubKey(byteArray);
        doReturn(true).when(eCKeyMock).isEncrypted();
        doReturn(eCKeyMock2).when(eCKeyMock).decrypt(aesKeyMock);

        //Act Statement(s)
        ECKey result = target.findKeyFromPubKey(byteArray);

        //Assert statement(s)
        assertThat(result, equalTo(eCKeyMock2));
        verify(targetMock).findKeyFromPubKey(byteArray);
        verify(eCKeyMock).isEncrypted();
        verify(eCKeyMock).decrypt(aesKeyMock);
    }

    //Sapient generated method id: ${0fb967ea-5cf9-3b00-b91a-83e3da7223c3}
    @Ignore()
    @Test()
    public void findRedeemDataFromScriptHashWhenKeyIsNull() {
        /* Branches:
         * (for-each(redeemData.keys)) : true  #  inside maybeDecrypt method
         * (key == null) : true  #  inside maybeDecrypt method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<RedeemData> redeemData = mockStatic(RedeemData.class)) {
            redeemData.when(() -> RedeemData.of(anyList(), eq(scriptMock))).thenReturn(redeemDataMock);
            DecryptingKeyBag target = new DecryptingKeyBag(targetMock, aesKeyMock);
            byte[] byteArray = new byte[]{};
            doReturn(redeemDataMock2).when(targetMock).findRedeemDataFromScriptHash(byteArray);
            //Act Statement(s)
            RedeemData result = target.findRedeemDataFromScriptHash(byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(redeemDataMock));
            redeemData.verify(() -> RedeemData.of(anyList(), eq(scriptMock)));
            verify(targetMock).findRedeemDataFromScriptHash(byteArray);
        }
    }

    //Sapient generated method id: ${e32c1ee9-0c0e-3c15-8bcc-1afa0d2f3717}
    @Ignore()
    @Test()
    public void findRedeemDataFromScriptHashWhenKeyNotIsEncrypted() {
        /* Branches:
         * (for-each(redeemData.keys)) : true  #  inside maybeDecrypt method
         * (key == null) : false  #  inside maybeDecrypt method
         * (key.isEncrypted()) : false  #  inside maybeDecrypt method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECKey keyMock = mock(ECKey.class);
        try (MockedStatic<RedeemData> redeemData = mockStatic(RedeemData.class)) {
            redeemData.when(() -> RedeemData.of(anyList(), eq(scriptMock))).thenReturn(redeemDataMock);
            doReturn(false).when(keyMock).isEncrypted();
            DecryptingKeyBag target = new DecryptingKeyBag(targetMock, aesKeyMock);
            byte[] byteArray = new byte[]{};
            doReturn(redeemDataMock2).when(targetMock).findRedeemDataFromScriptHash(byteArray);
            //Act Statement(s)
            RedeemData result = target.findRedeemDataFromScriptHash(byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(redeemDataMock));
            redeemData.verify(() -> RedeemData.of(anyList(), eq(scriptMock)));
            verify(keyMock).isEncrypted();
            verify(targetMock).findRedeemDataFromScriptHash(byteArray);
        }
    }

    //Sapient generated method id: ${3c1f3b56-8350-39d8-a8d3-99a55c0bd742}
    @Ignore()
    @Test()
    public void findRedeemDataFromScriptHashWhenAesKeyIsNullThrowsECKeyKeyIsEncryptedException() {
        /* Branches:
         * (for-each(redeemData.keys)) : true  #  inside maybeDecrypt method
         * (key == null) : false  #  inside maybeDecrypt method
         * (key.isEncrypted()) : true  #  inside maybeDecrypt method
         * (aesKey == null) : true  #  inside maybeDecrypt method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DecryptingKeyBag target = new DecryptingKeyBag(targetMock, (AesKey) null);
        byte[] byteArray = new byte[]{};
        doReturn(redeemDataMock).when(targetMock).findRedeemDataFromScriptHash(byteArray);
        thrown.expect(ECKey.KeyIsEncryptedException.class);

        //Act Statement(s)
        target.findRedeemDataFromScriptHash(byteArray);

        //Assert statement(s)
        verify(targetMock).findRedeemDataFromScriptHash(byteArray);
    }

    //Sapient generated method id: ${a6d40181-ac68-3236-a9df-d3031ae980dc}
    @Ignore()
    @Test()
    public void findRedeemDataFromScriptHashWhenAesKeyIsNotNull() {
        /* Branches:
         * (for-each(redeemData.keys)) : true  #  inside maybeDecrypt method
         * (key == null) : false  #  inside maybeDecrypt method
         * (key.isEncrypted()) : true  #  inside maybeDecrypt method
         * (aesKey == null) : false  #  inside maybeDecrypt method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DecryptingKeyBag target = new DecryptingKeyBag(targetMock, (AesKey) null);
        byte[] byteArray = new byte[]{};
        doReturn(redeemDataMock).when(targetMock).findRedeemDataFromScriptHash(byteArray);
        thrown.expect(ECKey.KeyIsEncryptedException.class);

        //Act Statement(s)
        target.findRedeemDataFromScriptHash(byteArray);

        //Assert statement(s)
        verify(targetMock).findRedeemDataFromScriptHash(byteArray);
    }
}
