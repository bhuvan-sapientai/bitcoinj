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

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

public class Sha256HashSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final MessageDigest messageDigestMock = mock(MessageDigest.class, "MessageDigest");

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${4df030c0-1a62-3804-8470-eaebd2a652a6}, hash: 6CC931560C979A6E26D2DA3BB66F7DB9
    @Ignore()
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

    //Sapient generated method id: ${8a7c5755-a137-3326-a97b-1044966d9973}, hash: A2C3BADAB4B137D9025373B9758F32DA
    @Ignore()
    @Test()
    public void wrapWhenDefaultBranchThrowsIllegalArgumentException() {
        /* Branches:
         * (branch expression (line 48)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        thrown.expect(IllegalArgumentException.class);
        byte[] _byte = null;
        //Act Statement(s)
        Sha256Hash.wrap(_byte);
    }

    //Sapient generated method id: ${8e6fb3b1-f009-3bdd-83ef-3241bcee11da}, hash: F6016450B3009C0A2D34A0B5E1C0EA00
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

    //Sapient generated method id: ${fd3bec15-10d9-388a-beea-b2e9df9f3abd}, hash: 28C0F5B759E51850AD1E5FFD6675875E
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

    //Sapient generated method id: ${db344e3b-696d-3b02-8e35-1aaa5300bde6}, hash: E6AC3FF46E039A04D0389E6DBBCA9218
    @Test()
    public void readTest() throws BufferUnderflowException {
        //Arrange Statement(s)
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            sha256Hash.when(() -> Sha256Hash.wrapReversed(byteArray)).thenReturn(sha256HashMock);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            Sha256Hash result = Sha256Hash.read(byteBuffer);
            //Assert statement(s)
            assertThat(result, equalTo(sha256HashMock));
            sha256Hash.verify(() -> Sha256Hash.wrapReversed(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${3155f475-158f-3510-8516-db6562387204}, hash: 9955DE8F2AF25F2016635023386ED4AC
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

    //Sapient generated method id: ${4224631c-1351-3487-b57c-83be3d1c5f2a}, hash: 586B02B207DC8F3C65DDAE154FBADFC2
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

    //Sapient generated method id: ${8834aef1-a40b-3166-93a5-4454c46dba80}, hash: 85D1DBC403A1B2160FACCF4004E78D2C
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

    //Sapient generated method id: ${2d9e451b-59ca-3da9-a6c7-f80da9bfa12e}, hash: F2ECA0BE97DF4E631473E7598E8533C3
    @Ignore()
    @Test()
    public void of1Test() throws IOException, NoSuchAlgorithmException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Sha256Hash sha256HashMock = mock(Sha256Hash.class, "Sha256Hash");
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.of(byteArray)).thenReturn(sha256HashMock);
            File file = new File("pathname1");
            //Act Statement(s)
            Sha256Hash result = Sha256Hash.of(file);
            //Assert statement(s)
            assertThat(result, equalTo(sha256HashMock));
            sha256Hash.verify(() -> Sha256Hash.of(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${864b40bf-1d57-3bcc-af03-b58d82f51832}, hash: 78A08C50CD07A402A8446124DC9CD751
    @Test()
    public void newDigestTest() throws NoSuchAlgorithmException {
        //Act Statement(s)
        MessageDigest result = Sha256Hash.newDigest();
        //Assert statement(s)
        //TODO: Please implement equals method in MessageDigest for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${daff8898-8ab8-3bae-a579-334acf567191}, hash: B001EA7BC85D3097FA24032693E79F62
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
            thrown.expectCause(is(instanceOf(NoSuchAlgorithmException.class)));
            //Act Statement(s)
            Sha256Hash.newDigest();
            //Assert statement(s)
            messageDigest.verify(() -> MessageDigest.getInstance("SHA-256"), atLeast(1));
        }
    }

    //Sapient generated method id: ${9d300d6c-ecd3-35df-b3af-b16008977eae}, hash: B6413D62A469A982D273E5F822CC7AF5
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

    //Sapient generated method id: ${9a6afea5-f150-33e0-b814-a790d8114e7d}, hash: 8AF10E4B56ABB09E7C6FBCED57236B9F
    @Test()
    public void hash1Test() throws NoSuchAlgorithmException {
        //Arrange Statement(s)
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class, CALLS_REAL_METHODS)) {
            sha256Hash.when(() -> Sha256Hash.newDigest()).thenReturn(messageDigestMock);
            byte[] byteArray = new byte[]{(byte) 0};
            doNothing().when(messageDigestMock).update(byteArray, 0, 10);
            doReturn(null).when(messageDigestMock).digest();
            //Act Statement(s)
            byte[] result = Sha256Hash.hash(byteArray, 0, 10);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            sha256Hash.verify(() -> Sha256Hash.newDigest(), atLeast(1));
            verify(messageDigestMock, atLeast(1)).update(byteArray, 0, 10);
            verify(messageDigestMock, atLeast(1)).digest();
        }
    }

    //Sapient generated method id: ${78ac4700-6677-322b-be13-ba4d455f88c9}, hash: 2DFD963EE4B20F14E803578EC31A400A
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

    //Sapient generated method id: ${f1ea7207-d566-3229-8475-08f8e2dc7b5b}, hash: EE333A0559B8C8FCBED166891F556F14
    @Test()
    public void hashTwice1Test() throws NoSuchAlgorithmException {
        //Arrange Statement(s)
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class, CALLS_REAL_METHODS)) {
            sha256Hash.when(() -> Sha256Hash.newDigest()).thenReturn(messageDigestMock);
            byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3};
            doNothing().when(messageDigestMock).update(byteArray);
            byte[] byteArray2 = new byte[]{(byte) 4, (byte) 5, (byte) 6};
            doNothing().when(messageDigestMock).update(byteArray2);
            doReturn(null).when(messageDigestMock).digest();
            doReturn(null).when(messageDigestMock).digest((byte[]) null);
            //Act Statement(s)
            byte[] result = Sha256Hash.hashTwice(byteArray, byteArray2);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            sha256Hash.verify(() -> Sha256Hash.newDigest(), atLeast(1));
            verify(messageDigestMock, atLeast(1)).update(byteArray);
            verify(messageDigestMock, atLeast(1)).update(byteArray2);
            verify(messageDigestMock, atLeast(1)).digest();
            verify(messageDigestMock, atLeast(1)).digest((byte[]) null);
        }
    }

    //Sapient generated method id: ${e0cf1989-1a7e-3adc-aa06-c46ee43c16df}, hash: FE04171018FB5B047363F791582437C2
    @Ignore()
    @Test()
    public void hashTwice2Test() throws NoSuchAlgorithmException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        MessageDigest messageDigestMock = mock(MessageDigest.class);
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class, CALLS_REAL_METHODS)) {
            sha256Hash.when(() -> Sha256Hash.newDigest()).thenReturn(messageDigestMock);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            byte[] result = Sha256Hash.hashTwice(byteArray, 0, 0);
            //Assert statement(s)
            assertThat(result.length, equalTo(0));
            sha256Hash.verify(() -> Sha256Hash.newDigest(), atLeast(1));
        }
    }

    //Sapient generated method id: ${53265721-292c-3c17-bad2-9687731ea2a7}, hash: 8517811910EB05FA3EB0B64CE0A449CE
    @Test()
    public void hashTwice3Test() throws NoSuchAlgorithmException {
        //Arrange Statement(s)
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class, CALLS_REAL_METHODS)) {
            sha256Hash.when(() -> Sha256Hash.newDigest()).thenReturn(messageDigestMock);
            byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3};
            doNothing().when(messageDigestMock).update(byteArray, 0, 3);
            byte[] byteArray2 = new byte[]{(byte) 4, (byte) 5, (byte) 6};
            doNothing().when(messageDigestMock).update(byteArray2, 0, 3);
            doReturn(null).when(messageDigestMock).digest();
            doReturn(null).when(messageDigestMock).digest((byte[]) null);
            //Act Statement(s)
            byte[] result = Sha256Hash.hashTwice(byteArray, 0, 3, byteArray2, 0, 3);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            sha256Hash.verify(() -> Sha256Hash.newDigest(), atLeast(1));
            verify(messageDigestMock, atLeast(1)).update(byteArray, 0, 3);
            verify(messageDigestMock, atLeast(1)).update(byteArray2, 0, 3);
            verify(messageDigestMock, atLeast(1)).digest();
            verify(messageDigestMock, atLeast(1)).digest((byte[]) null);
        }
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: 18775C2E440F077E33A188DA6ECB8B06
    @Ignore()
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

    //Sapient generated method id: ${1f842de1-beeb-323a-86bc-a9b438a7a3f9}, hash: FC8CE9AFB6A5F06A58F42394C4F64148
    @Ignore()
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

    //Sapient generated method id: ${9d328af1-2293-3544-bbbc-a0683c1f9fbe}, hash: 8C450E3DBA1567EE0FD65A875884D5B6
    @Ignore()
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

    //Sapient generated method id: ${af8de4b5-d82f-350a-889c-fa470726d745}, hash: B68421F40B5311753813AEC620CA4F24
    @Ignore()
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

    //Sapient generated method id: ${74367ac6-67d1-3ba8-9bdd-4aafa43d4139}, hash: 39A90A4D95D89C2CC2D90EB6481497D6
    @Ignore()
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
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            ByteBuffer result = target.write(byteBuffer);
            //Assert statement(s)
            assertThat(result, equalTo(byteBuffer));
            sha256Hash.verify(() -> Sha256Hash.hashTwice(byteArray2, byteArray3), atLeast(1));
            sha256Hash.verify(() -> Sha256Hash.wrap(byteArray), atLeast(1));
            byteUtils.verify(() -> ByteUtils.reverseBytes((byte[]) null), atLeast(1));
        }
    }

    //Sapient generated method id: ${44e07f67-963f-3a27-9290-b547f1375318}, hash: 9B578A38052F2B3939ED459F4C3DC0F3
    @Ignore()
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
            byte[] byteArray2 = new byte[]{(byte) 0};
            byte[] byteArray3 = new byte[]{(byte) 0};
            sha256Hash.when(() -> Sha256Hash.hashTwice(byteArray2, byteArray3)).thenReturn(byteArray);
            sha256Hash.when(() -> Sha256Hash.wrap(byteArray)).thenReturn(sha256HashMock);
            Sha256Hash target = Sha256Hash.twiceOf(byteArray2, byteArray3);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            Sha256Hash sha256Hash3 = Sha256Hash.read(byteBuffer);
            //Act Statement(s)
            int result = target.compareTo(sha256Hash3);
            //Assert statement(s)
            assertThat(result, equalTo(1));
            sha256Hash.verify(() -> Sha256Hash.hashTwice(byteArray2, byteArray3), atLeast(1));
            sha256Hash.verify(() -> Sha256Hash.wrap(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${e3ac1708-671d-3cbd-a87a-ed5dcaebdffd}, hash: A1AFAC7DC61F0DBA9C2742903A78AD81
    @Ignore()
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
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class)) {
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{(byte) 0};
            byte[] byteArray3 = new byte[]{(byte) 0};
            sha256Hash.when(() -> Sha256Hash.hashTwice(byteArray2, byteArray3)).thenReturn(byteArray);
            sha256Hash.when(() -> Sha256Hash.wrap(byteArray)).thenReturn(sha256HashMock);
            Sha256Hash target = Sha256Hash.twiceOf(byteArray2, byteArray3);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            Sha256Hash sha256Hash3 = Sha256Hash.read(byteBuffer);
            //Act Statement(s)
            int result = target.compareTo(sha256Hash3);
            //Assert statement(s)
            assertThat(result, equalTo(-1));
            sha256Hash.verify(() -> Sha256Hash.hashTwice(byteArray2, byteArray3), atLeast(1));
            sha256Hash.verify(() -> Sha256Hash.wrap(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${51259a53-7681-3584-a930-5f0b5fa7bf75}, hash: 9AF5DC226CE82DF1771C2B7E880E4B3D
    @Ignore()
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
            byte[] byteArray2 = new byte[]{(byte) 0};
            byte[] byteArray3 = new byte[]{(byte) 0};
            sha256Hash.when(() -> Sha256Hash.hashTwice(byteArray2, byteArray3)).thenReturn(byteArray);
            sha256Hash.when(() -> Sha256Hash.wrap(byteArray)).thenReturn(sha256HashMock);
            Sha256Hash target = Sha256Hash.twiceOf(byteArray2, byteArray3);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            Sha256Hash sha256Hash3 = Sha256Hash.read(byteBuffer);
            //Act Statement(s)
            int result = target.compareTo(sha256Hash3);
            //Assert statement(s)
            assertThat(result, equalTo(0));
            sha256Hash.verify(() -> Sha256Hash.hashTwice(byteArray2, byteArray3), atLeast(1));
            sha256Hash.verify(() -> Sha256Hash.wrap(byteArray), atLeast(1));
        }
    }
}
