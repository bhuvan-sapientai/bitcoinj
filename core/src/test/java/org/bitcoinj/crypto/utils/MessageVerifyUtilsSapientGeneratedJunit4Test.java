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
import org.bitcoinj.core.NetworkParameters;
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

    private final Address addressMock = mock(Address.class);

    private final ECKey eCKeyMock = mock(ECKey.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${3a42f168-c241-3fd9-b20e-5f71bb3f99d8}, hash: 719170A3E1D5EE4ED6682142AFDA345A
    @Test()
    public void verifyMessageWhenSwitchScriptTypeCaseDefaultThrowsSignatureException() throws SignatureException {
        /* Branches:
         * (switch(scriptType) = default) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(ScriptType.P2TR).when(addressMock).getOutputScriptType();
        thrown.expect(SignatureException.class);
        //Act Statement(s)
        MessageVerifyUtils.verifyMessage(addressMock, "<String value>", "<String value>");
        //Assert statement(s)
        verify(addressMock).getOutputScriptType();
    }

    //Sapient generated method id: ${7b240af1-9791-3f7f-bb25-2657f0d714b5}, hash: 4FC1990693D6F068C16EB7ED71BFFFDC
    @Test()
    public void verifyMessageWhenArraysNotEqualsScriptHashFromAddressScriptHashDerivedFromSigThrowsSignatureException() throws SignatureException {
        /* Branches:
         * (switch(scriptType) = P2SH) : true
         * (!Arrays.equals(scriptHashFromAddress, scriptHashDerivedFromSig)) : true  #  inside compareP2SHScriptHashDerivedFromPubKey method
         */
        //Arrange Statement(s)
        LegacyAddress addressMock = mock(LegacyAddress.class);
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

    //Sapient generated method id: ${4f619559-8d95-348c-aee2-1ec663b810a8}, hash: 7444FFE05D05BAD0E34E66E87BF5387D
    @Ignore()
    @Test()
    public void verifyMessageWhenArraysEqualsScriptHashFromAddressScriptHashDerivedFromSig() throws Exception {
        /* Branches:
         * (switch(scriptType) = P2SH) : true
         * (!Arrays.equals(scriptHashFromAddress, scriptHashDerivedFromSig)) : false  #  inside compareP2SHScriptHashDerivedFromPubKey method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: address
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        ECKey eCKey2Mock = mock(ECKey.class);
        try (MockedStatic<CryptoUtils> cryptoUtils = mockStatic(CryptoUtils.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            eCKey.when(() -> ECKey.signedMessageToKey("<String_value>", "<String_value>")).thenReturn(eCKeyMock);
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(eCKeyMock).getPubKeyHash();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 20};
            byte[] byteArray3 = new byte[]{(byte) 0, (byte) 20};
            byteUtils.when(() -> ByteUtils.concat(byteArray3, byteArray)).thenReturn(byteArray2);
            byte[] byteArray4 = new byte[]{(byte) 0};
            cryptoUtils.when(() -> CryptoUtils.sha256hash160(byteArray2)).thenReturn(byteArray4);
            LegacyAddress legacyAddress = (LegacyAddress) LegacyAddress.fromKey(networkParametersMock, eCKey2Mock);
            //Act Statement(s)
            MessageVerifyUtils.verifyMessage(legacyAddress, "<String_value>", "<String_value>");
            //Assert statement(s)
            eCKey.verify(() -> ECKey.signedMessageToKey("<String_value>", "<String_value>"), atLeast(1));
            verify(eCKeyMock).getPubKeyHash();
            byteUtils.verify(() -> ByteUtils.concat(byteArray3, byteArray), atLeast(1));
            cryptoUtils.verify(() -> CryptoUtils.sha256hash160(byteArray2), atLeast(1));
        }
    }

    //Sapient generated method id: ${9f9db6b5-7954-3f0c-ad6e-452e28b6b1f8}, hash: 62394F0CF6DE8B33B1A7E7C3E58FB353
    @Test()
    public void verifyMessageWhenCaughtExceptionThrowsSignatureException() throws SignatureException {
        /* Branches:
         * (switch(scriptType) = default) : true
         * (catch-exception (Exception)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(ScriptType.P2TR).when(addressMock).getOutputScriptType();
        thrown.expect(SignatureException.class);
        //Act Statement(s)
        MessageVerifyUtils.verifyMessage(addressMock, "<String value>", "<String value>");
        //Assert statement(s)
        verify(addressMock).getOutputScriptType();
    }

    //Sapient generated method id: ${b65e83a3-33c1-3c14-84b2-a4acf5c0712b}, hash: A09959F8328847E4E4F54098884FCA2C
    @Ignore()
    @Test()
    public void verifyMessageWhenArraysNotEqualsPubKeyHashFromAddressPubKeyHashFromSignatureThrowsSignatureException() throws SignatureException {
        /* Branches:
         * (switch(scriptType) = P2PKH or switch(scriptType) = P2WPKH) : true
         * (address instanceof SegwitAddress) : false  #  inside comparePubKeyHash method
         * (!Arrays.equals(pubKeyHashFromAddress, pubKeyHashFromSignature)) : true  #  inside comparePubKeyHash method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            doReturn(ScriptType.P2PKH).when(addressMock).getOutputScriptType();
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

    //Sapient generated method id: ${a9fb8b3e-b6d0-31c2-a9ed-6fb61bf3289b}, hash: 9A25EBC4F64315A06C538E30639EEC05
    @Test()
    public void verifyMessageWhenArraysEqualsPubKeyHashFromAddressPubKeyHashFromSignature() throws Exception {
        /* Branches:
         * (switch(scriptType) = P2PKH or switch(scriptType) = P2WPKH) : true
         * (address instanceof SegwitAddress) : false  #  inside comparePubKeyHash method
         * (!Arrays.equals(pubKeyHashFromAddress, pubKeyHashFromSignature)) : false  #  inside comparePubKeyHash method
         */
        //Arrange Statement(s)
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

    //Sapient generated method id: ${69ad4824-506d-39a3-aeaf-2f3134ee7a46}, hash: 48F49EAC41F917040EA99F48508BF80E
    @Test()
    public void verifyMessageWhenArraysNotEqualsScriptHashFromAddressScriptHashDerivedFromSigAndCaughtExceptionThrowsSignatureException() throws SignatureException {
        /* Branches:
         * (switch(scriptType) = P2SH) : true
         * (!Arrays.equals(scriptHashFromAddress, scriptHashDerivedFromSig)) : true  #  inside compareP2SHScriptHashDerivedFromPubKey method
         * (catch-exception (Exception)) : true
         */
        //Arrange Statement(s)
        LegacyAddress addressMock = mock(LegacyAddress.class);
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

    //Sapient generated method id: ${5ea295ff-ce6c-3238-bfb9-d29fc2301da5}, hash: 590162049B7270439606500617B7F9B0
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
        RuntimeException runtimeExceptionMock = mock(RuntimeException.class);
        doThrow(runtimeExceptionMock).when(addressMock).getWitnessVersion();
        thrown.expect(SignatureException.class);
        //Act Statement(s)
        MessageVerifyUtils.verifyMessage(addressMock, "<message_value>", "<signatureBase64_value>");
        //Assert statement(s)
        verify(addressMock).getOutputScriptType();
        verify(addressMock).getWitnessVersion();
    }
}
