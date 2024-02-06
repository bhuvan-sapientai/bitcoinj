package org.bitcoinj.crypto;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;

import org.bitcoinj.core.VerificationException;
import org.junit.rules.ExpectedException;
import org.mockito.stubbing.Answer;
import org.bitcoinj.base.internal.Preconditions;

import java.math.BigInteger;

import org.mockito.MockedStatic;
import org.bitcoinj.core.Transaction;

import java.io.ByteArrayOutputStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.isA;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.hamcrest.Matchers.is;

public class TransactionSignatureSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final ECKey.ECDSASignature eCKeyECDSASignatureMock = mock(ECKey.ECDSASignature.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${3dbfe428-6e56-33c3-8bcb-173a846a51e4}
    @Ignore()
    @Test()
    public void encodeToBitcoinWhenCaughtIOExceptionThrowsRuntimeException() throws IOException {
        /* Branches:
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TransactionSignature target = spy(new TransactionSignature(new BigInteger("0"), new BigInteger("0"), 0));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        doReturn(byteArrayOutputStream).when(target).derByteStream();
        thrown.expect(RuntimeException.class);
        thrown.expectCause(is(instanceOf(IOException.class)));
        //Act Statement(s)
        target.encodeToBitcoin();
        //Assert statement(s)
        verify(target).derByteStream();
    }

    //Sapient generated method id: ${d0af7b12-863b-39db-883e-ba87d0065357}
    @Test()
    public void dummyTest() {
        //Act Statement(s)
        TransactionSignature result = TransactionSignature.dummy();
        TransactionSignature transactionSignature = new TransactionSignature(new BigInteger("57896044618658097711785492504343953926418782139537452191302581570759080747168"), new BigInteger("57896044618658097711785492504343953926418782139537452191302581570759080747168"));
        //Assert statement(s)
        assertThat(result, equalTo(transactionSignature));
    }

    //Sapient generated method id: ${fa4ea5c0-f0d2-3f55-996b-8017c6fb9fad}
    @Test()
    public void calcSigHashValueWhenSigHashSINGLENotEqualsModeThrowsIllegalArgumentException() {
        /* Branches:
         * (SigHash.ALL == mode) : false
         * (SigHash.NONE == mode) : false
         * (SigHash.SINGLE == mode) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(false)).thenThrow(illegalArgumentException);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            TransactionSignature.calcSigHashValue(Transaction.SigHash.UNSET, false);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
        }
    }

    //Sapient generated method id: ${3f92c402-ec5f-3dcd-859a-4b781c72beb5}
    @Ignore()
    @Test()
    public void calcSigHashValueWhenSigHashSINGLEEqualsModeAndAnyoneCanPay() {
        /* Branches:
         * (SigHash.ALL == mode) : false
         * (SigHash.NONE == mode) : false
         * (SigHash.SINGLE == mode) : true
         * (anyoneCanPay) : true
         */
        //Act Statement(s)
        int result = TransactionSignature.calcSigHashValue(Transaction.SigHash.SINGLE, true);
        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${3151afea-b369-3c9b-a240-ac9f853401fe}
    @Test()
    public void isEncodingCanonicalWhenSignatureLengthEquals0() {
        /* Branches:
         * (signature.length == 0) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        boolean result = TransactionSignature.isEncodingCanonical(byteArray);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${4bb63b8a-9ee0-3a6f-acb1-b95fc9bcb0db}
    @Ignore()
    @Test()
    public void isEncodingCanonicalWhenSignatureLengthGreaterThan73() {
        /* Branches:
         * (signature.length == 0) : false
         * (signature.length < 9) : false
         * (signature.length > 73) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        boolean result = TransactionSignature.isEncodingCanonical(byteArray);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${ae550747-ce8f-372e-b692-422295d05881}
    @Test()
    public void isEncodingCanonicalWhenHashTypeGreaterThanTransactionSigHashSINGLEValue() {
        /* Branches:
         * (signature.length == 0) : false
         * (signature.length < 9) : false
         * (signature.length > 73) : false
         * (hashType < Transaction.SigHash.ALL.value) : false
         * (hashType > Transaction.SigHash.SINGLE.value) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8};
        //Act Statement(s)
        boolean result = TransactionSignature.isEncodingCanonical(byteArray);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${81f670df-a6f7-38d1-901a-c398b5cf87e1}
    @Test()
    public void isEncodingCanonicalWhen1IndexOfSignatureAnd255NotEqualsSignatureLengthMinus3() {
        /* Branches:
         * (signature.length == 0) : false
         * (signature.length < 9) : false
         * (signature.length > 73) : false
         * (hashType < Transaction.SigHash.ALL.value) : false
         * (hashType > Transaction.SigHash.SINGLE.value) : false
         * ((signature[0] & 0xff) != 0x30) : false
         * ((signature[1] & 0xff) != signature.length - 3) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8};
        //Act Statement(s)
        boolean result = TransactionSignature.isEncodingCanonical(byteArray);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${925c321d-a199-3a49-b31e-eb0fc860c46c}
    @Test()
    public void isEncodingCanonicalWhenLenREquals0() {
        /* Branches:
         * (signature.length == 0) : false
         * (signature.length < 9) : false
         * (signature.length > 73) : false
         * (hashType < Transaction.SigHash.ALL.value) : false
         * (hashType > Transaction.SigHash.SINGLE.value) : false
         * ((signature[0] & 0xff) != 0x30) : false
         * ((signature[1] & 0xff) != signature.length - 3) : false
         * (5 + lenR >= signature.length) : false
         * (lenR == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8};
        //Act Statement(s)
        boolean result = TransactionSignature.isEncodingCanonical(byteArray);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${91525bbe-c2d6-35b7-a6f0-731dde96fcc9}
    @Test()
    public void isEncodingCanonicalWhenLenSEquals0() {
        /* Branches:
         * (signature.length == 0) : false
         * (signature.length < 9) : false
         * (signature.length > 73) : false
         * (hashType < Transaction.SigHash.ALL.value) : false
         * (hashType > Transaction.SigHash.SINGLE.value) : false
         * ((signature[0] & 0xff) != 0x30) : false
         * ((signature[1] & 0xff) != signature.length - 3) : false
         * (5 + lenR >= signature.length) : false
         * (lenR == 0) : false
         * (lenR + lenS + 7 != signature.length) : false
         * (lenS == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8};
        //Act Statement(s)
        boolean result = TransactionSignature.isEncodingCanonical(byteArray);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${882d22fc-598a-3814-9856-697349d7ec4b}
    @Ignore()
    @Test()
    public void anyoneCanPayWhenSighashFlagsAndTransactionSigHashANYONECANPAYValueNotEquals0() {
        /* Branches:
         * ((sighashFlags & Transaction.SigHash.ANYONECANPAY.value) != 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TransactionSignature target = new TransactionSignature(new BigInteger("0"), new BigInteger("0"), 0);
        //Act Statement(s)
        boolean result = target.anyoneCanPay();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${82c93c3d-e151-3075-a42b-e80a98569726}
    @Test()
    public void anyoneCanPayWhenSighashFlagsAndTransactionSigHashANYONECANPAYValueEquals0() {
        /* Branches:
         * ((sighashFlags & Transaction.SigHash.ANYONECANPAY.value) != 0) : false
         */
        //Arrange Statement(s)
        TransactionSignature target = new TransactionSignature(new BigInteger("0"), new BigInteger("0"), 0);
        //Act Statement(s)
        boolean result = target.anyoneCanPay();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${1320b41a-5189-3d45-90de-22474cf389fc}
    @Ignore()
    @Test()
    public void sigHashModeWhenModeEqualsTransactionSigHashNONEValue() {
        /* Branches:
         * (mode == Transaction.SigHash.NONE.value) : true
         */
        //Arrange Statement(s)
        TransactionSignature target = new TransactionSignature(new BigInteger("0"), new BigInteger("0"), 0);
        //Act Statement(s)
        Transaction.SigHash result = target.sigHashMode();
        //Assert statement(s)
        assertThat(result, equalTo(Transaction.SigHash.NONE));
    }

    //Sapient generated method id: ${8451a845-52b1-3337-b81e-721acf0d002d}
    @Test()
    public void sigHashModeWhenModeNotEqualsTransactionSigHashSINGLEValue() {
        /* Branches:
         * (mode == Transaction.SigHash.NONE.value) : false
         * (mode == Transaction.SigHash.SINGLE.value) : false
         */
        //Arrange Statement(s)
        TransactionSignature target = new TransactionSignature(new BigInteger("10"), new BigInteger("20"), 31);
        //Act Statement(s)
        Transaction.SigHash result = target.sigHashMode();
        //Assert statement(s)
        assertThat(result, equalTo(Transaction.SigHash.ALL));
    }

    //Sapient generated method id: ${77d43dde-b896-3d72-b0a9-88e81eedba16}
    @Ignore()
    @Test()
    public void encodeToBitcoinTest() throws IOException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TransactionSignature target = spy(new TransactionSignature(new BigInteger("0"), new BigInteger("0"), 0));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        doReturn(byteArrayOutputStream).when(target).derByteStream();
        //Act Statement(s)
        byte[] result = target.encodeToBitcoin();
        byte[] byteResultArray = new byte[]{};
        //Assert statement(s)
        assertThat(result, equalTo(byteResultArray));
        verify(target).derByteStream();
    }

    //Sapient generated method id: ${f0096ecd-13f5-32d8-a72d-fa5c2227034f}
    @Test()
    public void toCanonicalisedWhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 466)) : true  #  inside toCanonicalised method
         */
        //Arrange Statement(s)
        try (MockedStatic<TransactionSignature> transactionSignature = mockStatic(TransactionSignature.class)) {
            transactionSignature.when(() -> TransactionSignature.calcSigHashValue(Transaction.SigHash.ALL, false)).thenReturn(0);
            TransactionSignature target = spy(new TransactionSignature(new BigInteger("0"), new BigInteger("0"), 0));
            doReturn(true).when(target).isCanonical();
            doReturn(Transaction.SigHash.ALL).when(target).sigHashMode();
            doReturn(false).when(target).anyoneCanPay();
            //Act Statement(s)
            ECKey.ECDSASignature result = target.toCanonicalised();
            TransactionSignature transactionSignature2 = new TransactionSignature(target, Transaction.SigHash.ALL, false);
            //Assert statement(s)
            assertThat(result, equalTo(transactionSignature2));
            transactionSignature.verify(() -> TransactionSignature.calcSigHashValue(Transaction.SigHash.ALL, false), atLeast(1));
            verify(target).isCanonical();
            verify(target).sigHashMode();
            verify(target).anyoneCanPay();
        }
    }

    //Sapient generated method id: ${813e192c-b126-346d-8189-9eabcf9f774e}
    @Test()
    public void toCanonicalisedWhenDefaultBranch2() {
        /* Branches:
         * (branch expression (line 466)) : false  #  inside toCanonicalised method
         */
        //Arrange Statement(s)
        try (MockedStatic<TransactionSignature> transactionSignature = mockStatic(TransactionSignature.class)) {
            transactionSignature.when(() -> TransactionSignature.calcSigHashValue(Transaction.SigHash.ALL, false)).thenReturn(0);
            TransactionSignature target = spy(new TransactionSignature(new BigInteger("0"), new BigInteger("1"), 0));
            doReturn(false).when(target).isCanonical();
            doReturn(Transaction.SigHash.ALL).when(target).sigHashMode();
            doReturn(false).when(target).anyoneCanPay();
            //Act Statement(s)
            ECKey.ECDSASignature result = target.toCanonicalised();
            ECKey.ECDSASignature eCKeyECDSASignature = new ECKey.ECDSASignature(new BigInteger("0"), new BigInteger("115792089237316195423570985008687907852837564279074904382605163141518161494336"));
            TransactionSignature transactionSignature2 = new TransactionSignature(eCKeyECDSASignature, Transaction.SigHash.ALL, false);
            //Assert statement(s)
            assertThat(result, equalTo(transactionSignature2));
            transactionSignature.verify(() -> TransactionSignature.calcSigHashValue(Transaction.SigHash.ALL, false), atLeast(1));
            verify(target).isCanonical();
            verify(target).sigHashMode();
            verify(target).anyoneCanPay();
        }
    }

    //Sapient generated method id: ${29a36674-78fa-37ab-bc86-8d03db35531a}
    @Ignore()
    @Test()
    public void decodeFromBitcoinWhenIsEncodingCanonicalNotBytesThrowsVerificationExceptionNoncanonicalSignature() throws SignatureDecodeException, VerificationException {
        /* Branches:
         * (requireCanonicalEncoding) : true
         * (!isEncodingCanonical(bytes)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<TransactionSignature> transactionSignature = mockStatic(TransactionSignature.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            transactionSignature.when(() -> TransactionSignature.isEncodingCanonical(byteArray)).thenReturn(false);
            thrown.expect(VerificationException.NoncanonicalSignature.class);
            //Act Statement(s)
            TransactionSignature.decodeFromBitcoin(byteArray, false, false);
            //Assert statement(s)
            transactionSignature.verify(() -> TransactionSignature.isEncodingCanonical(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${f46cd2ea-c6e0-3892-82cc-ef4b05de2bac}
    @Test()
    public void decodeFromBitcoinWhenRequireCanonicalSValueAndSigNotIsCanonicalThrowsVerificationException() throws SignatureDecodeException, VerificationException {
        /* Branches:
         * (requireCanonicalEncoding) : true
         * (!isEncodingCanonical(bytes)) : false
         * (requireCanonicalSValue) : true
         * (!sig.isCanonical()) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey.ECDSASignature> eCKeyECDSASignature = mockStatic(ECKey.ECDSASignature.class);
             MockedStatic<TransactionSignature> transactionSignature = mockStatic(TransactionSignature.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            transactionSignature.when(() -> TransactionSignature.isEncodingCanonical(byteArray)).thenReturn(true);
            eCKeyECDSASignature.when(() -> ECKey.ECDSASignature.decodeFromDER(byteArray)).thenReturn(eCKeyECDSASignatureMock);
            doReturn(false).when(eCKeyECDSASignatureMock).isCanonical();
            thrown.expect(VerificationException.class);
            //Act Statement(s)
            TransactionSignature.decodeFromBitcoin(byteArray, true, true);
            //Assert statement(s)
            transactionSignature.verify(() -> TransactionSignature.isEncodingCanonical(byteArray), atLeast(1));
            eCKeyECDSASignature.verify(() -> ECKey.ECDSASignature.decodeFromDER(byteArray), atLeast(1));
            verify(eCKeyECDSASignatureMock, atLeast(1)).isCanonical();
        }
    }

    //Sapient generated method id: ${5998e257-ed6f-3977-8ed3-bc1b2a744b22}
    @Ignore()
    @Test()
    public void decodeFromBitcoinWhenRequireCanonicalSValueAndSigIsCanonical() throws SignatureDecodeException, VerificationException {
        /* Branches:
         * (requireCanonicalEncoding) : true
         * (!isEncodingCanonical(bytes)) : false
         * (requireCanonicalSValue) : true
         * (!sig.isCanonical()) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey.ECDSASignature> eCKeyECDSASignature = mockStatic(ECKey.ECDSASignature.class);
             MockedStatic<TransactionSignature> transactionSignature = mockStatic(TransactionSignature.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{0};
            transactionSignature.when(() -> TransactionSignature.isEncodingCanonical(byteArray)).thenReturn(true);
            eCKeyECDSASignature.when(() -> ECKey.ECDSASignature.decodeFromDER(byteArray)).thenReturn(eCKeyECDSASignatureMock);
            doReturn(true).when(eCKeyECDSASignatureMock).isCanonical();
            //Act Statement(s)
            TransactionSignature result = TransactionSignature.decodeFromBitcoin(byteArray, true, true);
            TransactionSignature transactionSignature2 = new TransactionSignature((BigInteger) null, (BigInteger) null, 0);
            //Assert statement(s)
            assertThat(result, equalTo(transactionSignature2));
            transactionSignature.verify(() -> TransactionSignature.isEncodingCanonical(byteArray), atLeast(1));
            eCKeyECDSASignature.verify(() -> ECKey.ECDSASignature.decodeFromDER(byteArray), atLeast(1));
            verify(eCKeyECDSASignatureMock, atLeast(1)).isCanonical();
        }
    }
}
