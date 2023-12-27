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

    private final Address addressMock = mock(Address.class);

    private final ECKey eCKeyMock = mock(ECKey.class);

    private final RuntimeException runtimeExceptionMock = mock(RuntimeException.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${3a42f168-c241-3fd9-b20e-5f71bb3f99d8}
    @Test()
    public void verifyMessageWhenSwitchScriptTypeCaseDefaultThrowsSignatureException() throws Exception {
        /* Branches:
         * (switch(scriptType) = default) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        LegacyAddress addressMock = mock(LegacyAddress.class, "P2SH");
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            doReturn(ScriptType.P2SH).when(addressMock).getOutputScriptType();
            doReturn(null).when(addressMock).getHash();
            eCKey.when(() -> ECKey.signedMessageToKey("Hello World", "abc123")).thenReturn(eCKeyMock);
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(eCKeyMock).getPubKeyHash();
            //Act Statement(s)
            MessageVerifyUtils.verifyMessage(addressMock, "Hello World", "abc123");
            //Assert statement(s)
            verify(addressMock).getOutputScriptType();
            verify(addressMock).getHash();
            eCKey.verify(() -> ECKey.signedMessageToKey("Hello World", "abc123"), atLeast(1));
            verify(eCKeyMock).getPubKeyHash();
        }
    }

    //Sapient generated method id: ${7b240af1-9791-3f7f-bb25-2657f0d714b5}
    @Test()
    public void verifyMessageWhenArraysNotEqualsScriptHashFromAddressScriptHashDerivedFromSigThrowsSignatureException() throws SignatureException {
        /* Branches:
         * (switch(scriptType) = P2SH) : true
         * (!Arrays.equals(scriptHashFromAddress, scriptHashDerivedFromSig)) : true  #  inside compareP2SHScriptHashDerivedFromPubKey method
         */
        //Arrange Statement(s)
        LegacyAddress addressMock = mock(LegacyAddress.class);
        try (MockedStatic<CryptoUtils> cryptoUtils = mockStatic(CryptoUtils.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            doReturn(ScriptType.P2SH).when(addressMock).getOutputScriptType();
            byte[] byteArray = new byte[]{(byte) 0};
            doReturn(byteArray).when(addressMock).getHash();
            ECKey eCKey2 = new ECKey();
            eCKey.when(() -> ECKey.signedMessageToKey("Hello, World!", "Hw+QGj9zJvJv7z7zv9z4z7zv9z4z7zv9z4z7zv9z4z7zv9z4z7zv9z4z7zv9z4z7zv9z4z7zv9z4z7zv9z4z7zv9z4z7zv9z4z7zv9z4z7zv9z4z7zv9z4w==")).thenReturn(eCKey2);
            byte[] byteArray2 = new byte[]{};
            byte[] byteArray3 = new byte[]{(byte) 0, (byte) 20};
            byte[] byteArray4 = new byte[]{};
            byteUtils.when(() -> ByteUtils.concat(byteArray3, byteArray4)).thenReturn(byteArray2);
            byte[] byteArray5 = new byte[]{(byte) 0};
            cryptoUtils.when(() -> CryptoUtils.sha256hash160(byteArray2)).thenReturn(byteArray5);
            thrown.expect(SignatureException.class);
            //Act Statement(s)
            MessageVerifyUtils.verifyMessage(addressMock, "Hello, World!", "Hw+QGj9zJvJv7z7zv9z4z7zv9z4z7zv9z4z7zv9z4z7zv9z4z7zv9z4z7zv9z4z7zv9z4z7zv9z4z7zv9z4z7zv9z4z7zv9z4z7zv9z4z7zv9z4z7zv9z4w==");
            //Assert statement(s)
            verify(addressMock).getOutputScriptType();
            verify(addressMock).getHash();
            eCKey.verify(() -> ECKey.signedMessageToKey("Hello, World!", "Hw+QGj9zJvJv7z7zv9z4z7zv9z4z7zv9z4z7zv9z4z7zv9z4z7zv9z4z7zv9z4z7zv9z4z7zv9z4z7zv9z4z7zv9z4z7zv9z4z7zv9z4z7zv9z4z7zv9z4w=="), atLeast(1));
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
        Address addressMock = mock(Address.class, "P2WSH");
        doThrow(runtimeExceptionMock).when(addressMock).getOutputScriptType();
        thrown.expect(SignatureException.class);

        //Act Statement(s)
        MessageVerifyUtils.verifyMessage(addressMock, "Hello, world!", "abc123");

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
        Address addressMock = mock(Address.class, "P2WPKH");
        doReturn(null).when(addressMock).getOutputScriptType();
        thrown.expect(SignatureException.class);

        //Act Statement(s)
        MessageVerifyUtils.verifyMessage(addressMock, "Hello, World!", "MEUCIQDZzvJQK8vZJQzJQzJQzJQzJQzJQzJQzJQzJQzJQzJQzJQzJQzJQzJQzJQzJQzJQzJQzJQzJQzJQzJQzJQzJQzJQzJQzJQ=");

        //Assert statement(s)
        verify(addressMock).getOutputScriptType();
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
        Address addressMock = mock(Address.class, "f7d5a9b8a1f5c7d1a9f76f4d5c6f1d2f7d5a9b8a");
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            doReturn(ScriptType.P2WPKH).when(addressMock).getOutputScriptType();
            doThrow(runtimeExceptionMock).when(addressMock).getHash();
            eCKey.when(() -> ECKey.signedMessageToKey("Hello, world!", "MEUCIQDj7JjJ1zXvz4zZJqKz5ZQJfQJzVr5zZJ2yZzvLJbJf5AIgZK5XJyQJZz8J5zJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJ")).thenReturn(eCKeyMock);
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(eCKeyMock).getPubKeyHash();
            thrown.expect(SignatureException.class);
            //Act Statement(s)
            MessageVerifyUtils.verifyMessage(addressMock, "Hello, world!", "MEUCIQDj7JjJ1zXvz4zZJqKz5ZQJfQJzVr5zZJ2yZzvLJbJf5AIgZK5XJyQJZz8J5zJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJ");
            //Assert statement(s)
            verify(addressMock).getOutputScriptType();
            verify(addressMock).getHash();
            eCKey.verify(() -> ECKey.signedMessageToKey("Hello, world!", "MEUCIQDj7JjJ1zXvz4zZJqKz5ZQJfQJzVr5zZJ2yZzvLJbJf5AIgZK5XJyQJZz8J5zJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJzvLJ"), atLeast(1));
            verify(eCKeyMock).getPubKeyHash();
        }
    }
}
