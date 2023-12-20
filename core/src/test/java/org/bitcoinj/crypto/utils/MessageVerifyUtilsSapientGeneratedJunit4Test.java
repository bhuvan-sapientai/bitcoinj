package org.bitcoinj.crypto.utils;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.security.SignatureException;

import org.junit.rules.ExpectedException;
import org.bitcoinj.base.Address;
import org.bitcoinj.base.ScriptType;
import org.bitcoinj.crypto.internal.CryptoUtils;
import org.bitcoinj.crypto.ECKey;
import org.bitcoinj.base.internal.ByteUtils;
import org.mockito.MockedStatic;
import org.bitcoinj.base.SegwitAddress;
import org.bitcoinj.base.LegacyAddress;

import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class MessageVerifyUtilsSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final LegacyAddress addressMock = mock(LegacyAddress.class);

    private final ECKey eCKeyMock = mock(ECKey.class);

    private final RuntimeException runtimeExceptionMock = mock(RuntimeException.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${3a42f168-c241-3fd9-b20e-5f71bb3f99d8}
    @Test()
    public void verifyMessageWhenSwitchScriptTypeCaseDefaultThrowsSignatureException() throws SignatureException {
        /* Branches:
         * (switch(scriptType) = default) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Address addressMock = mock(Address.class);
        doReturn(ScriptType.P2TR).when(addressMock).getOutputScriptType();
        thrown.expect(SignatureException.class);
        //Act Statement(s)
        MessageVerifyUtils.verifyMessage(addressMock, "message1", "signatureBase64");
        //Assert statement(s)
        verify(addressMock).getOutputScriptType();
    }

    //Sapient generated method id: ${7b240af1-9791-3f7f-bb25-2657f0d714b5}
    @Test()
    public void verifyMessageWhenArraysNotEqualsScriptHashFromAddressScriptHashDerivedFromSigThrowsSignatureException() throws SignatureException {
        /* Branches:
         * (switch(scriptType) = P2SH) : true
         * (!Arrays.equals(scriptHashFromAddress, scriptHashDerivedFromSig)) : true  #  inside compareP2SHScriptHashDerivedFromPubKey method
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            doReturn(ScriptType.P2SH).when(addressMock).getOutputScriptType();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(addressMock).getHash();
            eCKey.when(() -> ECKey.signedMessageToKey("message1", "signatureBase64")).thenReturn(eCKeyMock);
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(eCKeyMock).getPubKeyHash();
            thrown.expect(SignatureException.class);
            //Act Statement(s)
            MessageVerifyUtils.verifyMessage(addressMock, "message1", "signatureBase64");
            //Assert statement(s)
            verify(addressMock).getOutputScriptType();
            verify(addressMock).getHash();
            eCKey.verify(() -> ECKey.signedMessageToKey("message1", "signatureBase64"), atLeast(1));
            verify(eCKeyMock).getPubKeyHash();
        }
    }

    //Sapient generated method id: ${4f619559-8d95-348c-aee2-1ec663b810a8}
    @Ignore()
    @Test()
    public void verifyMessageWhenArraysEqualsScriptHashFromAddressScriptHashDerivedFromSig() throws Exception {
        /* Branches:
         * (switch(scriptType) = P2SH) : true
         * (!Arrays.equals(scriptHashFromAddress, scriptHashDerivedFromSig)) : false  #  inside compareP2SHScriptHashDerivedFromPubKey method
         */
        //Arrange Statement(s)
        try (MockedStatic<CryptoUtils> cryptoUtils = mockStatic(CryptoUtils.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            doReturn(ScriptType.P2SH).when(addressMock).getOutputScriptType();
            byte[] byteArray = new byte[]{(byte) 0};
            doReturn(byteArray).when(addressMock).getHash();
            ECKey eCKey2 = new ECKey();
            eCKey.when(() -> ECKey.signedMessageToKey("Hello World", "Hw+Jz9zL0z7zvz3zvz7zvz7zvz7zvz7zvz7zvz7zvz7zvz7zvz7zvz7zvz7zvz7zvz7zvz7zvz7zvz7zvz7zvz7w==")).thenReturn(eCKey2);
            byte[] byteArray2 = new byte[]{};
            byte[] byteArray3 = new byte[]{(byte) 0, (byte) 20};
            byte[] byteArray4 = new byte[]{};
            byteUtils.when(() -> ByteUtils.concat(byteArray3, byteArray4)).thenReturn(byteArray2);
            byte[] byteArray5 = new byte[]{(byte) 0};
            cryptoUtils.when(() -> CryptoUtils.sha256hash160(byteArray2)).thenReturn(byteArray5);
            //Act Statement(s)
            MessageVerifyUtils.verifyMessage(addressMock, "Hello World", "Hw+Jz9zL0z7zvz3zvz7zvz7zvz7zvz7zvz7zvz7zvz7zvz7zvz7zvz7zvz7zvz7zvz7zvz7zvz7zvz7zvz7zvz7w==");
            //Assert statement(s)
            verify(addressMock).getOutputScriptType();
            verify(addressMock).getHash();
            eCKey.verify(() -> ECKey.signedMessageToKey("Hello World", "Hw+Jz9zL0z7zvz3zvz7zvz7zvz7zvz7zvz7zvz7zvz7zvz7zvz7zvz7zvz7zvz7zvz7zvz7zvz7zvz7zvz7zvz7w=="), atLeast(1));
            byteUtils.verify(() -> ByteUtils.concat(byteArray3, byteArray4), atLeast(1));
            cryptoUtils.verify(() -> CryptoUtils.sha256hash160(byteArray2), atLeast(1));
        }
    }

    //Sapient generated method id: ${9f9db6b5-7954-3f0c-ad6e-452e28b6b1f8}
    @Test()
    public void verifyMessageWhenCaughtExceptionThrowsSignatureException() throws SignatureException {
        /* Branches:
         * (switch(scriptType) = default) : true
         * (catch-exception (Exception)) : true
         */
        //Arrange Statement(s)
        Address addressMock = mock(Address.class);
        doThrow(runtimeExceptionMock).when(addressMock).getOutputScriptType();
        thrown.expect(SignatureException.class);
        //Act Statement(s)
        MessageVerifyUtils.verifyMessage(addressMock, "Hello, World!", "Hw+Gjzv1JZ9zQvzJvJ7n3w==");
        //Assert statement(s)
        verify(addressMock).getOutputScriptType();
    }

    //Sapient generated method id: ${b65e83a3-33c1-3c14-84b2-a4acf5c0712b}
    @Test()
    public void verifyMessageWhenArraysNotEqualsPubKeyHashFromAddressPubKeyHashFromSignatureThrowsSignatureException() throws SignatureException {
        /* Branches:
         * (switch(scriptType) = P2PKH or switch(scriptType) = P2WPKH) : true
         * (address instanceof SegwitAddress) : false  #  inside comparePubKeyHash method
         * (!Arrays.equals(pubKeyHashFromAddress, pubKeyHashFromSignature)) : true  #  inside comparePubKeyHash method
         */
        //Arrange Statement(s)
        SegwitAddress addressMock = mock(SegwitAddress.class);
        doReturn(ScriptType.P2PKH).when(addressMock).getOutputScriptType();
        doReturn(1).when(addressMock).getWitnessVersion();
        thrown.expect(SignatureException.class);
        //Act Statement(s)
        MessageVerifyUtils.verifyMessage(addressMock, "Hello World", "<signature in base64 format>");
        //Assert statement(s)
        verify(addressMock).getOutputScriptType();
        verify(addressMock).getWitnessVersion();
    }

    //Sapient generated method id: ${a9fb8b3e-b6d0-31c2-a9ed-6fb61bf3289b}
    @Test()
    public void verifyMessageWhenArraysEqualsPubKeyHashFromAddressPubKeyHashFromSignature() throws Exception {
        /* Branches:
         * (switch(scriptType) = P2PKH or switch(scriptType) = P2WPKH) : true
         * (address instanceof SegwitAddress) : false  #  inside comparePubKeyHash method
         * (!Arrays.equals(pubKeyHashFromAddress, pubKeyHashFromSignature)) : false  #  inside comparePubKeyHash method
         */
        //Arrange Statement(s)
        Address addressMock = mock(Address.class);
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            doReturn(ScriptType.P2PKH).when(addressMock).getOutputScriptType();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(addressMock).getHash();
            eCKey.when(() -> ECKey.signedMessageToKey("message1", "signatureBase64")).thenReturn(eCKeyMock);
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(eCKeyMock).getPubKeyHash();
            //Act Statement(s)
            MessageVerifyUtils.verifyMessage(addressMock, "message1", "signatureBase64");
            //Assert statement(s)
            verify(addressMock).getOutputScriptType();
            verify(addressMock).getHash();
            eCKey.verify(() -> ECKey.signedMessageToKey("message1", "signatureBase64"), atLeast(1));
            verify(eCKeyMock).getPubKeyHash();
        }
    }

    //Sapient generated method id: ${69ad4824-506d-39a3-aeaf-2f3134ee7a46}
    @Test()
    public void verifyMessageWhenArraysNotEqualsScriptHashFromAddressScriptHashDerivedFromSigAndCaughtExceptionThrowsSignatureException() throws SignatureException {
        /* Branches:
         * (switch(scriptType) = P2SH) : true
         * (!Arrays.equals(scriptHashFromAddress, scriptHashDerivedFromSig)) : true  #  inside compareP2SHScriptHashDerivedFromPubKey method
         * (catch-exception (Exception)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<CryptoUtils> cryptoUtils = mockStatic(CryptoUtils.class);
             MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            doReturn(ScriptType.P2SH).when(addressMock).getOutputScriptType();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(addressMock).getHash();
            eCKey.when(() -> ECKey.signedMessageToKey("message1", "signatureBase64")).thenReturn(eCKeyMock);
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(eCKeyMock).getPubKeyHash();
            RuntimeException runtimeException = new RuntimeException();
            byte[] byteArray3 = new byte[]{(byte) 0, (byte) 20};
            cryptoUtils.when(() -> CryptoUtils.sha256hash160(byteArray3)).thenThrow(runtimeException);
            thrown.expect(SignatureException.class);
            //Act Statement(s)
            MessageVerifyUtils.verifyMessage(addressMock, "message1", "signatureBase64");
            //Assert statement(s)
            verify(addressMock).getOutputScriptType();
            verify(addressMock).getHash();
            eCKey.verify(() -> ECKey.signedMessageToKey("message1", "signatureBase64"), atLeast(1));
            verify(eCKeyMock).getPubKeyHash();
            cryptoUtils.verify(() -> CryptoUtils.sha256hash160(byteArray3), atLeast(1));
        }
    }

    //Sapient generated method id: ${5ea295ff-ce6c-3238-bfb9-d29fc2301da5}
    @Test()
    public void verifyMessageWhenArraysNotEqualsPubKeyHashFromAddressPubKeyHashFromSignatureAndCaughtExceptionThrowsSignatureException() throws SignatureException {
        /* Branches:
         * (switch(scriptType) = P2PKH or switch(scriptType) = P2WPKH) : true
         * (address instanceof SegwitAddress) : false  #  inside comparePubKeyHash method
         * (!Arrays.equals(pubKeyHashFromAddress, pubKeyHashFromSignature)) : true  #  inside comparePubKeyHash method
         * (catch-exception (Exception)) : true
         */
        //Arrange Statement(s)
        SegwitAddress addressMock = mock(SegwitAddress.class);
        doReturn(ScriptType.P2PKH).when(addressMock).getOutputScriptType();
        doThrow(runtimeExceptionMock).when(addressMock).getWitnessVersion();
        thrown.expect(SignatureException.class);
        //Act Statement(s)
        MessageVerifyUtils.verifyMessage(addressMock, "Hello, World!", "Hw+QJQz5JmJ6HJ6z8zJzJzJzJzJzJzJzJzJzJzJzJzJzJzJzJzJzJzJzJzJzJzJzJzJzJzJzJzJzJzJzJzJzJzJzJzJzJzJzJzJzJw==");
        //Assert statement(s)
        verify(addressMock).getOutputScriptType();
        verify(addressMock).getWitnessVersion();
    }
}