package org.bitcoinj.base;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.nio.BufferUnderflowException;
import java.security.NoSuchAlgorithmException;
import java.io.IOException;
import java.nio.BufferOverflowException;

import org.junit.rules.ExpectedException;

import java.nio.ByteBuffer;
import java.math.BigInteger;

import org.bitcoinj.base.internal.ByteUtils;

import java.security.MessageDigest;

import org.mockito.MockedStatic;

import java.io.File;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.isA;
import static org.hamcrest.Matchers.is;

public class Sha256HashSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${4df030c0-1a62-3804-8470-eaebd2a652a6}
    @Test()
    public void wrapWhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 48)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        byte[] _byte = null;
        //Act Statement(s)
        Sha256Hash result = Sha256Hash.wrap(_byte);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${8e6fb3b1-f009-3bdd-83ef-3241bcee11da}
    @Test()
    public void wrap1Test() {
        //Arrange Statement(s)
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class, CALLS_REAL_METHODS);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byte[] byteArray = new byte[]{};
            byteUtils.when(() -> ByteUtils.parseHex("A")).thenReturn(byteArray);
            sha256Hash.when(() -> Sha256Hash.wrap(byteArray)).thenReturn(sha256HashMock);
            //Act Statement(s)
            Sha256Hash result = Sha256Hash.wrap("A");
            //Assert statement(s)
            assertThat(result, equalTo(sha256HashMock));
            byteUtils.verify(() -> ByteUtils.parseHex("A"), atLeast(1));
            sha256Hash.verify(() -> Sha256Hash.wrap(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${fd3bec15-10d9-388a-beea-b2e9df9f3abd}
    @Test()
    public void wrapReversedTest() {
        //Arrange Statement(s)
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.wrap(byteArray)).thenReturn(sha256HashMock);
            byte[] byteArray2 = new byte[]{};
            //Act Statement(s)
            Sha256Hash result = Sha256Hash.wrapReversed(byteArray2);
            //Assert statement(s)
            assertThat(result, equalTo(sha256HashMock));
            sha256Hash.verify(() -> Sha256Hash.wrap(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${db344e3b-696d-3b02-8e35-1aaa5300bde6}
    @Test()
    public void readTest() throws BufferUnderflowException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class, CALLS_REAL_METHODS)) {
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer);
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            sha256Hash.when(() -> Sha256Hash.wrapReversed(byteArray)).thenReturn(sha256Hash2);
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            Sha256Hash result = Sha256Hash.read(byteBuffer2);
            //Assert statement(s)
            assertThat(result, equalTo(sha256Hash2));
            sha256Hash.verify(() -> Sha256Hash.wrapReversed(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${3155f475-158f-3510-8516-db6562387204}
    @Test()
    public void ofTest() throws NoSuchAlgorithmException {
        //Arrange Statement(s)
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.hash(byteArray2)).thenReturn(byteArray);
            sha256Hash.when(() -> Sha256Hash.wrap(byteArray)).thenReturn(sha256HashMock);
            //Act Statement(s)
            Sha256Hash result = Sha256Hash.of(byteArray2);
            //Assert statement(s)
            assertThat(result, equalTo(sha256HashMock));
            sha256Hash.verify(() -> Sha256Hash.hash(byteArray2), atLeast(1));
            sha256Hash.verify(() -> Sha256Hash.wrap(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${4224631c-1351-3487-b57c-83be3d1c5f2a}
    @Test()
    public void twiceOfTest() throws NoSuchAlgorithmException {
        //Arrange Statement(s)
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.hashTwice(byteArray2)).thenReturn(byteArray);
            sha256Hash.when(() -> Sha256Hash.wrap(byteArray)).thenReturn(sha256HashMock);
            //Act Statement(s)
            Sha256Hash result = Sha256Hash.twiceOf(byteArray2);
            //Assert statement(s)
            assertThat(result, equalTo(sha256HashMock));
            sha256Hash.verify(() -> Sha256Hash.hashTwice(byteArray2), atLeast(1));
            sha256Hash.verify(() -> Sha256Hash.wrap(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${8834aef1-a40b-3166-93a5-4454c46dba80}
    @Test()
    public void twiceOf1Test() throws NoSuchAlgorithmException {
        //Arrange Statement(s)
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{};
            byte[] byteArray3 = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.hashTwice(byteArray2, byteArray3)).thenReturn(byteArray);
            sha256Hash.when(() -> Sha256Hash.wrap(byteArray)).thenReturn(sha256HashMock);
            //Act Statement(s)
            Sha256Hash result = Sha256Hash.twiceOf(byteArray2, byteArray3);
            //Assert statement(s)
            assertThat(result, equalTo(sha256HashMock));
            sha256Hash.verify(() -> Sha256Hash.hashTwice(byteArray2, byteArray3), atLeast(1));
            sha256Hash.verify(() -> Sha256Hash.wrap(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${2d9e451b-59ca-3da9-a6c7-f80da9bfa12e}
    @Test()
    public void of1Test() throws IOException, NoSuchAlgorithmException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class, CALLS_REAL_METHODS)) {
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer);
            byte[] byteArray = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.of(byteArray)).thenReturn(sha256Hash2);
            File file = new File("pathname1");
            //Act Statement(s)
            Sha256Hash result = Sha256Hash.of(file);
            //Assert statement(s)
            assertThat(result, equalTo(sha256Hash2));
            sha256Hash.verify(() -> Sha256Hash.of(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${864b40bf-1d57-3bcc-af03-b58d82f51832}
    @Test()
    public void newDigestTest() throws NoSuchAlgorithmException {
        //Act Statement(s)
        MessageDigest result = Sha256Hash.newDigest();
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        //Assert statement(s)
        //TODO: Please implement equals method in MessageDigest for verification to succeed or you need to adjust respective assertion statements
        assertThat(result, equalTo(messageDigest));
    }

    //Sapient generated method id: ${daff8898-8ab8-3bae-a579-334acf567191}
    @Test()
    public void newDigestWhenCaughtNoSuchAlgorithmExceptionThrowsRuntimeException() throws NoSuchAlgorithmException {
        /* Branches:
         * (catch-exception (NoSuchAlgorithmException)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<MessageDigest> messageDigest = mockStatic(MessageDigest.class)) {
            NoSuchAlgorithmException noSuchAlgorithmException = new NoSuchAlgorithmException();
            messageDigest.when(() -> MessageDigest.getInstance("SHA-256")).thenThrow(noSuchAlgorithmException);
            thrown.expect(RuntimeException.class);
            thrown.expectCause(isA(NoSuchAlgorithmException.class));
            //Act Statement(s)
            Sha256Hash.newDigest();
            //Assert statement(s)
            messageDigest.verify(() -> MessageDigest.getInstance("SHA-256"), atLeast(1));
        }
    }

    //Sapient generated method id: ${9d300d6c-ecd3-35df-b3af-b16008977eae}
    @Test()
    public void hashTest() throws NoSuchAlgorithmException {
        //Arrange Statement(s)
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.hash(byteArray2, 0, 0)).thenReturn(byteArray);
            //Act Statement(s)
            byte[] result = Sha256Hash.hash(byteArray2);
            //Assert statement(s)
            assertThat(result, equalTo(byteArray));
            sha256Hash.verify(() -> Sha256Hash.hash(byteArray2, 0, 0), atLeast(1));
        }
    }

    //Sapient generated method id: ${9a6afea5-f150-33e0-b814-a790d8114e7d}
    @Test()
    public void hash1Test() {
        //Arrange Statement(s)
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class, CALLS_REAL_METHODS)) {
            //TODO: Needs to return real value
            sha256Hash.when(() -> Sha256Hash.newDigest()).thenReturn(null);
            thrown.expect(NullPointerException.class);
            byte[] byteArray = new byte[]{(byte) 0};
            //Act Statement(s)
            Sha256Hash.hash(byteArray, 0, 11);
            //Assert statement(s)
            sha256Hash.verify(() -> Sha256Hash.newDigest(), atLeast(1));
        }
    }

    //Sapient generated method id: ${78ac4700-6677-322b-be13-ba4d455f88c9}
    @Test()
    public void hashTwiceTest() throws NoSuchAlgorithmException {
        //Arrange Statement(s)
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.hashTwice(byteArray2, 0, 0)).thenReturn(byteArray);
            //Act Statement(s)
            byte[] result = Sha256Hash.hashTwice(byteArray2);
            //Assert statement(s)
            assertThat(result, equalTo(byteArray));
            sha256Hash.verify(() -> Sha256Hash.hashTwice(byteArray2, 0, 0), atLeast(1));
        }
    }

    //Sapient generated method id: ${f1ea7207-d566-3229-8475-08f8e2dc7b5b}
    @Test()
    public void hashTwice1Test() {
        //Arrange Statement(s)
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class, CALLS_REAL_METHODS)) {
            //TODO: Needs to return real value
            sha256Hash.when(() -> Sha256Hash.newDigest()).thenReturn(null);
            thrown.expect(NullPointerException.class);
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{};
            //Act Statement(s)
            Sha256Hash.hashTwice(byteArray, byteArray2);
            //Assert statement(s)
            sha256Hash.verify(() -> Sha256Hash.newDigest(), atLeast(1));
        }
    }

    //Sapient generated method id: ${e0cf1989-1a7e-3adc-aa06-c46ee43c16df}
    @Test()
    public void hashTwice2Test() {
        //Arrange Statement(s)
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class, CALLS_REAL_METHODS)) {
            //TODO: Needs to return real value
            sha256Hash.when(() -> Sha256Hash.newDigest()).thenReturn(null);
            thrown.expect(NullPointerException.class);
            byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3};
            //Act Statement(s)
            Sha256Hash.hashTwice(byteArray, 0, 3);
            //Assert statement(s)
            sha256Hash.verify(() -> Sha256Hash.newDigest(), atLeast(1));
        }
    }

    //Sapient generated method id: ${53265721-292c-3c17-bad2-9687731ea2a7}
    @Test()
    public void hashTwice3Test() {
        //Arrange Statement(s)
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class, CALLS_REAL_METHODS)) {
            //TODO: Needs to return real value
            sha256Hash.when(() -> Sha256Hash.newDigest()).thenReturn(null);
            thrown.expect(NullPointerException.class);
            byte[] byteArray = new byte[]{(byte) 0};
            byte[] byteArray2 = new byte[]{(byte) 0};
            //Act Statement(s)
            Sha256Hash.hashTwice(byteArray, 0, 5, byteArray2, 0, 5);
            //Assert statement(s)
            sha256Hash.verify(() -> Sha256Hash.newDigest(), atLeast(1));
        }
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}
    @Test()
    public void toStringTest() {
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class)) {
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{};
            byte[] byteArray3 = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.hashTwice(byteArray2, byteArray3)).thenReturn(byteArray);
            sha256Hash.when(() -> Sha256Hash.wrap(byteArray)).thenReturn(sha256HashMock);
            byteUtils.when(() -> ByteUtils.formatHex((byte[]) null)).thenReturn("return_of_formatHex1");
            Sha256Hash target = Sha256Hash.twiceOf(byteArray2, byteArray3);
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("return_of_formatHex1"));
            sha256Hash.verify(() -> Sha256Hash.hashTwice(byteArray2, byteArray3), atLeast(1));
            sha256Hash.verify(() -> Sha256Hash.wrap(byteArray), atLeast(1));
            byteUtils.verify(() -> ByteUtils.formatHex((byte[]) null), atLeast(1));
        }
    }

    //Sapient generated method id: ${1f842de1-beeb-323a-86bc-a9b438a7a3f9}
    @Test()
    public void toBigIntegerTest() {
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class)) {
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{};
            byte[] byteArray3 = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.hashTwice(byteArray2, byteArray3)).thenReturn(byteArray);
            sha256Hash.when(() -> Sha256Hash.wrap(byteArray)).thenReturn(sha256HashMock);
            byteUtils.when(() -> ByteUtils.bytesToBigInteger((byte[]) null)).thenReturn(new BigInteger("0"));
            Sha256Hash target = Sha256Hash.twiceOf(byteArray2, byteArray3);
            //Act Statement(s)
            BigInteger result = target.toBigInteger();
            //Assert statement(s)
            assertThat(result, equalTo(new BigInteger("0")));
            sha256Hash.verify(() -> Sha256Hash.hashTwice(byteArray2, byteArray3), atLeast(1));
            sha256Hash.verify(() -> Sha256Hash.wrap(byteArray), atLeast(1));
            byteUtils.verify(() -> ByteUtils.bytesToBigInteger((byte[]) null), atLeast(1));
        }
    }

    //Sapient generated method id: ${9d328af1-2293-3544-bbbc-a0683c1f9fbe}
    @Test()
    public void serializeTest() {
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class)) {
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{};
            byte[] byteArray3 = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.hashTwice(byteArray2, byteArray3)).thenReturn(byteArray);
            sha256Hash.when(() -> Sha256Hash.wrap(byteArray)).thenReturn(sha256HashMock);
            byte[] byteArray4 = new byte[]{};
            byteUtils.when(() -> ByteUtils.reverseBytes((byte[]) null)).thenReturn(byteArray4);
            Sha256Hash target = Sha256Hash.twiceOf(byteArray2, byteArray3);
            //Act Statement(s)
            byte[] result = target.serialize();
            //Assert statement(s)
            assertThat(result, equalTo(byteArray4));
            sha256Hash.verify(() -> Sha256Hash.hashTwice(byteArray2, byteArray3), atLeast(1));
            sha256Hash.verify(() -> Sha256Hash.wrap(byteArray), atLeast(1));
            byteUtils.verify(() -> ByteUtils.reverseBytes((byte[]) null), atLeast(1));
        }
    }

    //Sapient generated method id: ${af8de4b5-d82f-350a-889c-fa470726d745}
    @Test()
    public void getReversedBytesTest() {
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class)) {
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{};
            byte[] byteArray3 = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.hashTwice(byteArray2, byteArray3)).thenReturn(byteArray);
            sha256Hash.when(() -> Sha256Hash.wrap(byteArray)).thenReturn(sha256HashMock);
            byte[] byteArray4 = new byte[]{};
            byteUtils.when(() -> ByteUtils.reverseBytes((byte[]) null)).thenReturn(byteArray4);
            Sha256Hash target = Sha256Hash.twiceOf(byteArray2, byteArray3);
            //Act Statement(s)
            byte[] result = target.getReversedBytes();
            //Assert statement(s)
            assertThat(result, equalTo(byteArray4));
            sha256Hash.verify(() -> Sha256Hash.hashTwice(byteArray2, byteArray3), atLeast(1));
            sha256Hash.verify(() -> Sha256Hash.wrap(byteArray), atLeast(1));
            byteUtils.verify(() -> ByteUtils.reverseBytes((byte[]) null), atLeast(1));
        }
    }

    //Sapient generated method id: ${74367ac6-67d1-3ba8-9bdd-4aafa43d4139}
    @Test()
    public void writeTest() throws BufferOverflowException {
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class)) {
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{};
            byte[] byteArray3 = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.hashTwice(byteArray2, byteArray3)).thenReturn(byteArray);
            sha256Hash.when(() -> Sha256Hash.wrap(byteArray)).thenReturn(sha256HashMock);
            byte[] byteArray4 = new byte[]{};
            byteUtils.when(() -> ByteUtils.reverseBytes((byte[]) null)).thenReturn(byteArray4);
            Sha256Hash target = Sha256Hash.twiceOf(byteArray2, byteArray3);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            ByteBuffer result = target.write(byteBuffer);
            //Assert statement(s)
            assertThat(result, equalTo(byteBuffer));
            sha256Hash.verify(() -> Sha256Hash.hashTwice(byteArray2, byteArray3), atLeast(1));
            sha256Hash.verify(() -> Sha256Hash.wrap(byteArray), atLeast(1));
            byteUtils.verify(() -> ByteUtils.reverseBytes((byte[]) null), atLeast(1));
        }
    }

    //Sapient generated method id: ${44e07f67-963f-3a27-9290-b547f1375318}
    @Test()
    public void compareToWhenThisByteGreaterThanOtherByte() {
        /* Branches:
         * (i >= 0) : true
         * (thisByte > otherByte) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class)) {
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{(byte) 4, (byte) 5, (byte) 6};
            byte[] byteArray3 = new byte[]{(byte) 7, (byte) 8, (byte) 9};
            sha256Hash.when(() -> Sha256Hash.hashTwice(byteArray2, byteArray3)).thenReturn(byteArray);
            sha256Hash.when(() -> Sha256Hash.wrap(byteArray)).thenReturn(sha256HashMock);
            Sha256Hash target = Sha256Hash.twiceOf(byteArray2, byteArray3);
            //Act Statement(s)
            int result = target.compareTo(sha256HashMock2);
            //Assert statement(s)
            assertThat(result, equalTo(1));
            sha256Hash.verify(() -> Sha256Hash.hashTwice(byteArray2, byteArray3), atLeast(1));
            sha256Hash.verify(() -> Sha256Hash.wrap(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${e3ac1708-671d-3cbd-a87a-ed5dcaebdffd}
    @Test()
    public void compareToWhenThisByteLessThanOtherByte() {
        /* Branches:
         * (i >= 0) : true
         * (thisByte > otherByte) : false
         * (thisByte < otherByte) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class)) {
    byte[] byteArray = new byte[] {};
    byte[][] byteArray4 = new byte[][] { (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5 };
    byte[] byteArray3 = new byte[] { byteArray4 };
    byte[] byteArray2 = new byte[] { byteArray3 };
    byte[][] byteArray7 = new byte[][] { (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10 };
    byte[] byteArray6 = new byte[] { byteArray7 };
    byte[] byteArray5 = new byte[] { byteArray6 };
    sha256Hash.when(() -> Sha256Hash.hashTwice(byteArray2, byteArray5)).thenReturn(byteArray);
    sha256Hash.when(() -> Sha256Hash.wrap(byteArray)).thenReturn(sha256HashMock);
    Sha256Hash target = Sha256Hash.twiceOf(byteArray2, byteArray5);
    //Act Statement(s)
    int result = target.compareTo(sha256HashMock2);
    //Assert statement(s)
    assertThat(result, equalTo(-1));
    sha256Hash.verify(() -> Sha256Hash.hashTwice(byteArray2, byteArray5), atLeast(1));
    sha256Hash.verify(() -> Sha256Hash.wrap(byteArray), atLeast(1));
}*/
    }

    //Sapient generated method id: ${51259a53-7681-3584-a930-5f0b5fa7bf75}
    @Test()
    public void compareToWhenThisByteNotLessThanOtherByte() {
        /* Branches:
         * (i >= 0) : true
         * (thisByte > otherByte) : false
         * (thisByte < otherByte) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class)) {
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{};
            byte[] byteArray3 = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.hashTwice(byteArray2, byteArray3)).thenReturn(byteArray);
            sha256Hash.when(() -> Sha256Hash.wrap(byteArray)).thenReturn(sha256HashMock);
            Sha256Hash target = Sha256Hash.twiceOf(byteArray2, byteArray3);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer);
            //Act Statement(s)
            int result = target.compareTo(sha256Hash2);
            //Assert statement(s)
            assertThat(result, equalTo(0));
            sha256Hash.verify(() -> Sha256Hash.hashTwice(byteArray2, byteArray3), atLeast(1));
            sha256Hash.verify(() -> Sha256Hash.wrap(byteArray), atLeast(1));
        }
    }
}
