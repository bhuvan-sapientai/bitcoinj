package org.bitcoinj.crypto;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;

import org.bitcoinj.core.VerificationException;
import org.junit.rules.ExpectedException;

import java.math.BigInteger;

import org.mockito.MockedStatic;
import org.bitcoinj.core.Transaction;

import java.io.ByteArrayOutputStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class TransactionSignatureSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final ECKey.ECDSASignature eCKeyECDSASignatureMock = mock(ECKey.ECDSASignature.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${d0af7b12-863b-39db-883e-ba87d0065357}, hash: 6B7ADEE281B0DE11AD07A0C984D60E72
    @Test()
    public void dummyTest() {
        //Act Statement(s)
        TransactionSignature result = TransactionSignature.dummy();
        TransactionSignature transactionSignature = new TransactionSignature(new BigInteger("57896044618658097711785492504343953926418782139537452191302581570759080747168"), new BigInteger("57896044618658097711785492504343953926418782139537452191302581570759080747168"));
        //Assert statement(s)
        assertThat(result, equalTo(transactionSignature));
    }

    //Sapient generated method id: ${fa4ea5c0-f0d2-3f55-996b-8017c6fb9fad}, hash: 152D63C1BFF14B2C834E39DBBB5F05A3
    @Test()
    public void calcSigHashValueWhenSigHashSINGLENotEqualsModeThrowsIllegalArgumentException() {
        /* Branches:
         * (SigHash.ALL == mode) : false
         * (SigHash.NONE == mode) : false
         * (SigHash.SINGLE == mode) : false
         */
        //Arrange Statement(s)
        thrown.expect(IllegalArgumentException.class);
        //Act Statement(s)
        TransactionSignature.calcSigHashValue(Transaction.SigHash.UNSET, false);
    }

    //Sapient generated method id: ${3f92c402-ec5f-3dcd-859a-4b781c72beb5}, hash: 1EB74D539A38BD41DD10FFA1D0C02E4B
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
        assertThat(result, equalTo(131));
    }

    //Sapient generated method id: ${3151afea-b369-3c9b-a240-ac9f853401fe}, hash: E8755CC17BA1F5CB45270E74C19E5B04
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

    //Sapient generated method id: ${4bb63b8a-9ee0-3a6f-acb1-b95fc9bcb0db}, hash: 50EB28646F28098D666CEEB843935067
    @Test()
    public void isEncodingCanonicalWhenSignatureLengthGreaterThan73() {
        /* Branches:
         * (signature.length == 0) : false
         * (signature.length < 9) : false
         * (signature.length > 73) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 37, (byte) 38, (byte) 39, (byte) 40, (byte) 41, (byte) 42, (byte) 43, (byte) 44, (byte) 45, (byte) 46, (byte) 47, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 58, (byte) 59, (byte) 60, (byte) 61, (byte) 62, (byte) 63, (byte) 64, (byte) 65, (byte) 66, (byte) 67, (byte) 68, (byte) 69, (byte) 70, (byte) 71, (byte) 72, (byte) 73};
        //Act Statement(s)
        boolean result = TransactionSignature.isEncodingCanonical(byteArray);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${ae550747-ce8f-372e-b692-422295d05881}, hash: C80A038BF8A5E05368A8FDD58FED949E
    @Test()
    public void isEncodingCanonicalWhenHashTypeGreaterThanTransactionSigHashSINGLEValue() {
        /* Branches:
         * (signature.length == 0) : false
         * (signature.length < 9) : false
         * (signature.length > 73) : false
         * (hashType < Transaction.SigHash.ALL.value) : false
         * (hashType > Transaction.SigHash.SINGLE.value) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8};
        //Act Statement(s)
        boolean result = TransactionSignature.isEncodingCanonical(byteArray);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${81f670df-a6f7-38d1-901a-c398b5cf87e1}, hash: 225054E69E527788BE261260303FD99B
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

    //Sapient generated method id: ${925c321d-a199-3a49-b31e-eb0fc860c46c}, hash: 351C088D743A2DF0458C1E5BF01AFFCD
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

    //Sapient generated method id: ${91525bbe-c2d6-35b7-a6f0-731dde96fcc9}, hash: 6462FBBC075FC78726FE5343C166AC12
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

    //Sapient generated method id: ${2e36f6ae-29d5-3900-9449-a0fb3cf7f5de}, hash: 94C69D498618CADC3FAB17954A9D0C32
    @Test()
    public void isEncodingCanonicalWhen4IndexOfSignatureAnd128Equals128() {
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
         * (lenS == 0) : false
         * (signature[4 - 2] != 0x02) : false
         * ((signature[4] & 0x80) == 0x80) : true
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

    //Sapient generated method id: ${fb675832-8fa9-39d9-9fea-84cad0c337bb}, hash: 9A15209A0A71D6E1E3A426CD78D45A5A
    @Test()
    public void isEncodingCanonicalWhen4Plus1IndexOfSignatureAnd128NotEquals128() {
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
         * (lenS == 0) : false
         * (signature[4 - 2] != 0x02) : false
         * ((signature[4] & 0x80) == 0x80) : false
         * (lenR > 1) : true
         * (signature[4] == 0x00) : true
         * ((signature[4 + 1] & 0x80) != 0x80) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 0, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9};
        //Act Statement(s)
        boolean result = TransactionSignature.isEncodingCanonical(byteArray);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${532335fa-a47f-3f3e-b298-a91d13d1ac5b}, hash: 0881AD8CD8DAA63A0446E6CD1E867BDA
    @Test()
    public void isEncodingCanonicalWhen4Plus1IndexOfSignatureAnd128Equals128And6PlusLenRMinus2IndexOfSignatureEquals2And6PlusLenRIndexO() {
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
         * (lenS == 0) : false
         * (signature[4 - 2] != 0x02) : false
         * ((signature[4] & 0x80) == 0x80) : false
         * (lenR > 1) : true
         * (signature[4] == 0x00) : true
         * ((signature[4 + 1] & 0x80) != 0x80) : false
         * (signature[6 + lenR - 2] != 0x02) : false
         * ((signature[6 + lenR] & 0x80) == 0x80) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 0, (byte) 5, (byte) 2, (byte) 7, (byte) 8, (byte) 9};
        //Act Statement(s)
        boolean result = TransactionSignature.isEncodingCanonical(byteArray);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${66b9a231-2bf0-3797-958b-70798cd020d7}, hash: 6A27EC61EB555EAAF458611A3475A943
    @Test()
    public void isEncodingCanonicalWhenLenSGreaterThan1And6PlusLenRIndexOfSignatureEquals0And6PlusLenRPlus1IndexOfSignatureAnd128NotEqu() {
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
         * (lenS == 0) : false
         * (signature[4 - 2] != 0x02) : false
         * ((signature[4] & 0x80) == 0x80) : false
         * (lenR > 1) : true
         * (signature[4] == 0x00) : true
         * ((signature[4 + 1] & 0x80) != 0x80) : false
         * (signature[6 + lenR - 2] != 0x02) : false
         * ((signature[6 + lenR] & 0x80) == 0x80) : false
         * (lenS > 1) : true
         * (signature[6 + lenR] == 0x00) : true
         * ((signature[6 + lenR + 1] & 0x80) != 0x80) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 0, (byte) 5, (byte) 2, (byte) 7, (byte) 0, (byte) 9, (byte) 10};
        //Act Statement(s)
        boolean result = TransactionSignature.isEncodingCanonical(byteArray);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${892643da-9a14-3e26-8906-fad1f7d6431f}, hash: 24CA4BC62C06CD904E54A2AD8A0C479D
    @Ignore()
    @Test()
    public void isEncodingCanonicalWhenLenSGreaterThan1And6PlusLenRIndexOfSignatureEquals0And6PlusLenRPlus1IndexOfSignatureAnd128Equals() {
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
         * (lenS == 0) : false
         * (signature[4 - 2] != 0x02) : false
         * ((signature[4] & 0x80) == 0x80) : false
         * (lenR > 1) : true
         * (signature[4] == 0x00) : true
         * ((signature[4 + 1] & 0x80) != 0x80) : false
         * (signature[6 + lenR - 2] != 0x02) : false
         * ((signature[6 + lenR] & 0x80) == 0x80) : false
         * (lenS > 1) : true
         * (signature[6 + lenR] == 0x00) : true
         * ((signature[6 + lenR + 1] & 0x80) != 0x80) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 0, (byte) 5, (byte) 2, (byte) 7, (byte) 0, (byte) 9, (byte) 10};
        //Act Statement(s)
        boolean result = TransactionSignature.isEncodingCanonical(byteArray);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${882d22fc-598a-3814-9856-697349d7ec4b}, hash: 073756CE62D49B7BFF4EBC9B8D90A08F
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

    //Sapient generated method id: ${82c93c3d-e151-3075-a42b-e80a98569726}, hash: F7C6E1C4F7224CA65A379DDD8F9B421A
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

    //Sapient generated method id: ${1320b41a-5189-3d45-90de-22474cf389fc}, hash: 29136763B47CE6CF14A48B0AB145D63A
    @Ignore()
    @Test()
    public void sigHashModeWhenModeEqualsTransactionSigHashNONEValue() {
        /* Branches:
         * (mode == Transaction.SigHash.NONE.value) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TransactionSignature target = new TransactionSignature(new BigInteger("0"), new BigInteger("0"), 0);
        //Act Statement(s)
        Transaction.SigHash result = target.sigHashMode();
        //Assert statement(s)
        assertThat(result, equalTo(Transaction.SigHash.NONE));
    }

    //Sapient generated method id: ${b82d4700-3569-3fa1-8308-c46904f67194}, hash: 79B0E30B1E6A2FE0C3F7C87E73945365
    @Ignore()
    @Test()
    public void sigHashModeWhenModeEqualsTransactionSigHashSINGLEValue() {
        /* Branches:
         * (mode == Transaction.SigHash.NONE.value) : false
         * (mode == Transaction.SigHash.SINGLE.value) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TransactionSignature target = new TransactionSignature(new BigInteger("0"), new BigInteger("0"), 0);
        //Act Statement(s)
        Transaction.SigHash result = target.sigHashMode();
        //Assert statement(s)
        assertThat(result, equalTo(Transaction.SigHash.SINGLE));
    }

    //Sapient generated method id: ${8451a845-52b1-3337-b81e-721acf0d002d}, hash: 98ABD1DBB4732D5107677CE49EC995DA
    @Test()
    public void sigHashModeWhenModeNotEqualsTransactionSigHashSINGLEValue() {
        /* Branches:
         * (mode == Transaction.SigHash.NONE.value) : false
         * (mode == Transaction.SigHash.SINGLE.value) : false
         */
        //Arrange Statement(s)
        TransactionSignature target = new TransactionSignature(new BigInteger("0"), new BigInteger("0"), 0);
        //Act Statement(s)
        Transaction.SigHash result = target.sigHashMode();
        //Assert statement(s)
        assertThat(result, equalTo(Transaction.SigHash.ALL));
    }

    //Sapient generated method id: ${77d43dde-b896-3d72-b0a9-88e81eedba16}, hash: FF1A1E13FFC480B4D60921173C977286
    @Test()
    public void encodeToBitcoinTest() throws IOException {
        //Arrange Statement(s)
        TransactionSignature target = spy(new TransactionSignature(new BigInteger("0"), new BigInteger("0"), 1));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        doReturn(byteArrayOutputStream).when(target).derByteStream();
        //Act Statement(s)
        byte[] result = target.encodeToBitcoin();
        byte[] byteResultArray = new byte[]{(byte) 1};
        //Assert statement(s)
        assertThat(result, equalTo(byteResultArray));
        verify(target).derByteStream();
    }

    //Sapient generated method id: ${3dbfe428-6e56-33c3-8bcb-173a846a51e4}, hash: BD85A6D73F3E930ACA6BB914E1CCBC4D
    @Test()
    public void encodeToBitcoinWhenCaughtIOExceptionThrowsRuntimeException() throws IOException {
        /* Branches:
         * (catch-exception (IOException)) : true
         */
        //Arrange Statement(s)
        TransactionSignature target = spy(new TransactionSignature(new BigInteger("0"), new BigInteger("0"), 0));
        IOException iOException = new IOException();
        doThrow(iOException).when(target).derByteStream();
        thrown.expect(RuntimeException.class);
        thrown.expectCause(is(instanceOf(IOException.class)));
        //Act Statement(s)
        target.encodeToBitcoin();
        //Assert statement(s)
        verify(target).derByteStream();
    }

    //Sapient generated method id: ${f0096ecd-13f5-32d8-a72d-fa5c2227034f}, hash: B640CBB87C136044806BA30961F4E363
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

    //Sapient generated method id: ${813e192c-b126-346d-8189-9eabcf9f774e}, hash: 28018C0526C22B45168243651704A9BE
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

    //Sapient generated method id: ${29a36674-78fa-37ab-bc86-8d03db35531a}, hash: 28DF44DD3F39EA9CF1E5B18235EAEAC0
    @Test()
    public void decodeFromBitcoinWhenIsEncodingCanonicalNotBytesThrowsVerificationExceptionNoncanonicalSignature() throws SignatureDecodeException, VerificationException {
        /* Branches:
         * (requireCanonicalEncoding) : true
         * (!isEncodingCanonical(bytes)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<TransactionSignature> transactionSignature = mockStatic(TransactionSignature.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            transactionSignature.when(() -> TransactionSignature.isEncodingCanonical(byteArray)).thenReturn(false);
            thrown.expect(VerificationException.NoncanonicalSignature.class);
            //Act Statement(s)
            TransactionSignature.decodeFromBitcoin(byteArray, true, false);
            //Assert statement(s)
            transactionSignature.verify(() -> TransactionSignature.isEncodingCanonical(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${f46cd2ea-c6e0-3892-82cc-ef4b05de2bac}, hash: D082C2CC3A8D81CEB8D2E18BA666F6F8
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

    //Sapient generated method id: ${5998e257-ed6f-3977-8ed3-bc1b2a744b22}, hash: F6D849FCE453B75552D47E46F41B39B1
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
            byte[] byteArray = new byte[]{(byte) 0};
            transactionSignature.when(() -> TransactionSignature.isEncodingCanonical(byteArray)).thenReturn(true);
            eCKeyECDSASignature.when(() -> ECKey.ECDSASignature.decodeFromDER(byteArray)).thenReturn(eCKeyECDSASignatureMock);
            doReturn(true).when(eCKeyECDSASignatureMock).isCanonical();
            //Act Statement(s)
            TransactionSignature result = TransactionSignature.decodeFromBitcoin(byteArray, true, true);
            TransactionSignature transactionSignature2 = new TransactionSignature((BigInteger) null, (BigInteger) null, (byte) 0);
            //Assert statement(s)
            assertThat(result, equalTo(transactionSignature2));
            transactionSignature.verify(() -> TransactionSignature.isEncodingCanonical(byteArray), atLeast(1));
            eCKeyECDSASignature.verify(() -> ECKey.ECDSASignature.decodeFromDER(byteArray), atLeast(1));
            verify(eCKeyECDSASignatureMock, atLeast(1)).isCanonical();
        }
    }
}
