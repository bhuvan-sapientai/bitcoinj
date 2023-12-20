package org.bitcoinj.crypto;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;
import java.security.SignatureException;

import org.bitcoinj.base.Network;
import org.junit.rules.ExpectedException;
import org.bitcoinj.base.ScriptType;
import org.bitcoinj.crypto.internal.CryptoUtils;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;
import org.bitcoinj.protobuf.wallet.Protos;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bitcoinj.base.VarInt;

import java.math.BigInteger;

import org.bitcoinj.base.internal.ByteUtils;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bitcoinj.core.NetworkParameters;

import java.util.Optional;

import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bitcoinj.base.LegacyAddress;
import org.bitcoinj.base.Address;
import org.mockito.stubbing.Answer;
import org.bouncycastle.util.encoders.Base64;

import java.nio.ByteBuffer;

import org.bitcoinj.base.internal.Preconditions;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bitcoinj.base.Sha256Hash;

import java.util.function.Supplier;

import org.mockito.MockedStatic;
import org.bitcoinj.base.SegwitAddress;

import java.time.Instant;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.isA;

public class ECKeySapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Address addressMock = mock(Address.class);

    private final AesKey aesKeyMock = mock(AesKey.class);

    private final ECKey.ECDSASignature eCKeyECDSASignatureMock = mock(ECKey.ECDSASignature.class);

    private final ECKey eCKeyMock = mock(ECKey.class);

    private final ECPoint eCPointMock = mock(ECPoint.class);

    private final EncryptedData encryptedDataMock = mock(EncryptedData.class);

    private final KeyCrypter keyCrypterMock = mock(KeyCrypter.class);

    private final Network networkMock = mock(Network.class);

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    private final VarInt varIntMock = mock(VarInt.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${c7ec79eb-cd73-3de6-915c-35a649a77991}
    @Test()
    public void fromASN1WhenPubbitsLengthNotEquals65AndEncodingLessThan2() throws IOException {
        /* Branches:
         * (decoder.readObject() == null) : true  #  inside extractKeyFromASN1 method
         * (seq.size() == 4) : true  #  inside extractKeyFromASN1 method
         * (pubkey.getTagNo() == 1) : true  #  inside extractKeyFromASN1 method
         * (pubkey.getTagClass() == BERTags.CONTEXT_SPECIFIC) : false  #  inside extractKeyFromASN1 method
         * (pubbits.length == 33) : false  #  inside extractKeyFromASN1 method
         * (pubbits.length == 65) : false  #  inside extractKeyFromASN1 method
         * (encoding >= 2) : false  #  inside extractKeyFromASN1 method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
    preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    byte[] byteArray = new byte[] {};
    //Act Statement(s)
    ECKey.fromASN1(byteArray);
    //Assert statement(s)
    preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(5));
    preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
}*/
    }

    //Sapient generated method id: ${79387f8a-b5ee-3149-8a9c-fe54d65b51ff}
    @Test()
    public void fromASN1WhenPubbitsLengthEquals65AndEncodingGreaterThanOrEqualsTo2AndEncodingLessThanOrEqualsTo4() throws IOException {
        /* Branches:
         * (decoder.readObject() == null) : true  #  inside extractKeyFromASN1 method
         * (seq.size() == 4) : true  #  inside extractKeyFromASN1 method
         * (pubkey.getTagNo() == 1) : true  #  inside extractKeyFromASN1 method
         * (pubkey.getTagClass() == BERTags.CONTEXT_SPECIFIC) : true  #  inside extractKeyFromASN1 method
         * (pubbits.length == 33) : false  #  inside extractKeyFromASN1 method
         * (pubbits.length == 65) : true  #  inside extractKeyFromASN1 method
         * (encoding >= 2) : true  #  inside extractKeyFromASN1 method
         * (encoding <= 4) : true  #  inside extractKeyFromASN1 method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
    preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    byte[] byteArray = new byte[] {};
    //Act Statement(s)
    ECKey.fromASN1(byteArray);
    //Assert statement(s)
    preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(5));
    preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
}*/
    }

    //Sapient generated method id: ${20e5f2c9-2a5e-3c36-991b-910c71689f84}
    @Test()
    public void fromASN1WhenPubbitsLengthEquals65AndEncodingGreaterThanOrEqualsTo2AndEncodingLessThanOrEqualsTo42() throws IOException {
        /* Branches:
         * (decoder.readObject() == null) : true  #  inside extractKeyFromASN1 method
         * (seq.size() == 4) : true  #  inside extractKeyFromASN1 method
         * (pubkey.getTagNo() == 1) : false  #  inside extractKeyFromASN1 method
         * (pubkey.getTagClass() == BERTags.CONTEXT_SPECIFIC) : true  #  inside extractKeyFromASN1 method
         * (pubbits.length == 33) : false  #  inside extractKeyFromASN1 method
         * (pubbits.length == 65) : true  #  inside extractKeyFromASN1 method
         * (encoding >= 2) : true  #  inside extractKeyFromASN1 method
         * (encoding <= 4) : true  #  inside extractKeyFromASN1 method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
    preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    byte[] byteArray = new byte[] { (byte) 48, (byte) 69, (byte) 2, (byte) 1, (byte) 1, (byte) 4, (byte) 32, (byte) 48, (byte) 30, (byte) 2, (byte) 1, (byte) 1, (byte) 0, (byte) 11, (byte) 48, (byte) 9, (byte) 6, (byte) 5, (byte) 43, (byte) 0, (byte) 4, (byte) 0, (byte) 10, (byte) 3, (byte) 2, (byte) 1, (byte) 1, (byte) 4, (byte) 20, (byte) 118, (byte) 107, (byte) 98, (byte) 101, (byte) 99, (byte) 111, (byte) 105, (byte) 110, (byte) 45, (byte) 115, (byte) 101, (byte) 99, (byte) 112, (byte) 50, (byte) 53, (byte) 54, (byte) 114, (byte) 49, (byte) 0, (byte) 4, (byte) 32, (byte) 48, (byte) 30, (byte) 2, (byte) 1, (byte) 1, (byte) 0, (byte) 11, (byte) 48, (byte) 9, (byte) 6, (byte) 5, (byte) 43, (byte) 0, (byte) 4, (byte) 0, (byte) 10, (byte) 3, (byte) 2, (byte) 1, (byte) 1, (byte) 4, (byte) 20, (byte) 118, (byte) 107, (byte) 98, (byte) 101, (byte) 99, (byte) 111, (byte) 105, (byte) 110, (byte) 45, (byte) 115, (byte) 101, (byte) 99, (byte) 112, (byte) 50, (byte) 53, (byte) 54, (byte) 114, (byte) 49, (byte) 0, (byte) -96, (byte) 33, (byte) 3, (byte) 32, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) -127, (byte) 1, (byte) 4 };
    //Act Statement(s)
    ECKey.fromASN1(byteArray);
    //Assert statement(s)
    preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(5));
    preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
}*/
    }

    //Sapient generated method id: ${90b33662-9b0a-38cb-b27c-acc7cc00590c}
    @Test()
    public void fromASN1WhenPubbitsLengthEquals65AndEncodingGreaterThanOrEqualsTo2AndEncodingLessThanOrEqualsTo44() throws IOException {
        /* Branches:
         * (decoder.readObject() == null) : true  #  inside extractKeyFromASN1 method
         * (seq.size() == 4) : false  #  inside extractKeyFromASN1 method
         * (pubkey.getTagNo() == 1) : true  #  inside extractKeyFromASN1 method
         * (pubkey.getTagClass() == BERTags.CONTEXT_SPECIFIC) : true  #  inside extractKeyFromASN1 method
         * (pubbits.length == 33) : false  #  inside extractKeyFromASN1 method
         * (pubbits.length == 65) : true  #  inside extractKeyFromASN1 method
         * (encoding >= 2) : true  #  inside extractKeyFromASN1 method
         * (encoding <= 4) : true  #  inside extractKeyFromASN1 method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
    MockedStatic<ECKey> eCKey = mockStatic(ECKey.class, CALLS_REAL_METHODS)) {
    preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    byte[] byteArray = new byte[] { (byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 37, (byte) 38, (byte) 39, (byte) 40, (byte) 41, (byte) 42, (byte) 43, (byte) 44, (byte) 45, (byte) 46, (byte) 47, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 58, (byte) 59, (byte) 60, (byte) 61, (byte) 62, (byte) 63, (byte) 64 };
    eCKey.when(() -> ECKey.isPubKeyCompressed(byteArray)).thenReturn(false);
    eCKey.when(() -> ECKey.fromPrivate(new BigInteger("0"), false)).thenReturn(eCKeyMock);
    byte[] byteArray2 = new byte[] {};
    doReturn(byteArray2).when(eCKeyMock).getPubKey();
    byte[] byteArray3 = new byte[] {};
    //Act Statement(s)
    ECKey result = ECKey.fromASN1(byteArray3);
    //Assert statement(s)
    assertThat(result, equalTo(eCKeyMock));
    preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(7));
    preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()), atLeast(1));
    eCKey.verify(() -> ECKey.isPubKeyCompressed(byteArray), atLeast(1));
    eCKey.verify(() -> ECKey.fromPrivate(new BigInteger("0"), false), atLeast(1));
    verify(eCKeyMock, atLeast(1)).getPubKey();
}*/
    }

    //Sapient generated method id: ${25d09108-fbe3-37ad-865b-9bdf9f0e1526}
    @Test()
    public void fromPrivateTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class, CALLS_REAL_METHODS)) {
    ECKey eCKey2 = new ECKey();
    eCKey.when(() -> ECKey.fromPrivate(new BigInteger("0"), true)).thenReturn(eCKey2);
    //Act Statement(s)
    ECKey result = ECKey.fromPrivate(new BigInteger("0"));
    //Assert statement(s)
    assertThat(result, equalTo(eCKey2));
    eCKey.verify(() -> ECKey.fromPrivate(new BigInteger("0"), true), atLeast(1));
}*/
    }

    //Sapient generated method id: ${ba95b407-9a1b-33e0-af12-b971dd90328c}
    @Test()
    public void fromPrivate1WhenDefaultBranchAndDefaultBranch() {
        /* Branches:
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : true  #  inside <init> method
         * (branch expression (line 197)) : true  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS);
    MockedStatic<ECKey> eCKey = mockStatic(ECKey.class, CALLS_REAL_METHODS)) {
    eCKey.when(() -> ECKey.publicPointFromPrivate(new BigInteger("1234567890"))).thenReturn(eCPointMock);
    preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    //Act Statement(s)
    ECKey result = ECKey.fromPrivate(new BigInteger("1234567890"), true);
    LazyECPoint lazyECPoint = new LazyECPoint(eCPointMock, true);
    ECKey eCKey2 = new ECKey(new BigInteger("1234567890"), lazyECPoint);
    //Assert statement(s)
    assertThat(result, equalTo(eCKey2));
    eCKey.verify(() -> ECKey.publicPointFromPrivate(new BigInteger("1234567890")), atLeast(1));
    preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
}*/
    }

    //Sapient generated method id: ${62e1b3df-ca5b-3155-9a9c-359f1632d1f7}
    @Test()
    public void fromPrivate1WhenDefaultBranchAndDefaultBranchAndDefaultBranchAndDefaultBranch2() {
        /* Branches:
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : false  #  inside <init> method
         * (branch expression (line 197)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS);
    MockedStatic<ECKey> eCKey = mockStatic(ECKey.class, CALLS_REAL_METHODS)) {
    eCKey.when(() -> ECKey.publicPointFromPrivate(new BigInteger("1234567890"))).thenReturn(eCPointMock);
    preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    //Act Statement(s)
    ECKey result = ECKey.fromPrivate(new BigInteger("1234567890"), true);
    LazyECPoint lazyECPoint = new LazyECPoint(eCPointMock, true);
    ECKey eCKey2 = new ECKey(new BigInteger("1234567890"), lazyECPoint);
    //Assert statement(s)
    assertThat(result, equalTo(eCKey2));
    eCKey.verify(() -> ECKey.publicPointFromPrivate(new BigInteger("1234567890")), atLeast(1));
    preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
}*/
    }

    //Sapient generated method id: ${e2d4d2cf-aeac-347b-979c-4a79a20de215}
    @Test()
    public void fromPrivate1WhenDefaultBranchAndDefaultBranchAndDefaultBranchAndDefaultBranch3() {
        /* Branches:
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : false  #  inside <init> method
         * (branch expression (line 197)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS);
    MockedStatic<ECKey> eCKey = mockStatic(ECKey.class, CALLS_REAL_METHODS)) {
    eCKey.when(() -> ECKey.publicPointFromPrivate(new BigInteger("1234567890"))).thenReturn(eCPointMock);
    preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    //Act Statement(s)
    ECKey result = ECKey.fromPrivate(new BigInteger("1234567890"), true);
    LazyECPoint lazyECPoint = new LazyECPoint(eCPointMock, true);
    ECKey eCKey2 = new ECKey(new BigInteger("1234567890"), lazyECPoint);
    //Assert statement(s)
    assertThat(result, equalTo(eCKey2));
    eCKey.verify(() -> ECKey.publicPointFromPrivate(new BigInteger("1234567890")), atLeast(1));
    preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
}*/
    }

    //Sapient generated method id: ${342c426c-2e9b-3199-b6d2-4312fd897de3}
    @Test()
    public void fromPrivate2Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class, CALLS_REAL_METHODS)) {
            ECKey eCKey2 = new ECKey();
            eCKey.when(() -> ECKey.fromPrivate(new BigInteger("0"))).thenReturn(eCKey2);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            ECKey result = ECKey.fromPrivate(byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(eCKey2));
            eCKey.verify(() -> ECKey.fromPrivate(new BigInteger("0")), atLeast(1));
        }
    }

    //Sapient generated method id: ${832bcdf8-a61c-3d7f-9fbb-cfb6d120e396}
    @Test()
    public void fromPrivate3Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class, CALLS_REAL_METHODS);
    MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
    byte[] byteArray = new byte[] {};
    byteUtils.when(() -> ByteUtils.bytesToBigInteger(byteArray)).thenReturn(new BigInteger("0"));
    eCKey.when(() -> ECKey.fromPrivate(new BigInteger("0"), false)).thenReturn(eCKeyMock);
    //Act Statement(s)
    ECKey result = ECKey.fromPrivate(byteArray, false);
    //Assert statement(s)
    assertThat(result, equalTo(eCKeyMock));
    byteUtils.verify(() -> ByteUtils.bytesToBigInteger(byteArray), atLeast(1));
    eCKey.verify(() -> ECKey.fromPrivate(new BigInteger("0"), false), atLeast(1));
}*/
    }

    //Sapient generated method id: ${87f54e45-53f5-367e-8d52-94be8e6bc5ba}
    @Test()
    public void fromPrivateAndPrecalculatedPublicWhenDefaultBranchAndDefaultBranch() {
        /* Branches:
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : true  #  inside <init> method
         * (branch expression (line 197)) : true  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
    preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    //Act Statement(s)
    ECKey result = ECKey.fromPrivateAndPrecalculatedPublic(new BigInteger("1234567890"), eCPointMock, true);
    ECKey eCKey = new ECKey(new BigInteger("1234567890"), eCPointMock, true);
    //Assert statement(s)
    assertThat(result, equalTo(eCKey));
    preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
}*/
    }

    //Sapient generated method id: ${fdb35aa2-168f-3fcf-a4d6-4b4bbb9f88ee}
    @Test()
    public void fromPrivateAndPrecalculatedPublicWhenDefaultBranchAndDefaultBranchAndDefaultBranchAndDefaultBranch2() {
        /* Branches:
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : false  #  inside <init> method
         * (branch expression (line 197)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
    preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    //Act Statement(s)
    ECKey result = ECKey.fromPrivateAndPrecalculatedPublic(new BigInteger("123456789"), eCPointMock, true);
    ECKey eCKey = new ECKey(new BigInteger("123456789"), eCPointMock, true);
    //Assert statement(s)
    assertThat(result, equalTo(eCKey));
    preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
}*/
    }

    //Sapient generated method id: ${4ab28b48-b436-312f-8a62-b5ed8de7cbdf}
    @Test()
    public void fromPrivateAndPrecalculatedPublicWhenDefaultBranchAndDefaultBranchAndDefaultBranchAndDefaultBranch3() {
        /* Branches:
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : false  #  inside <init> method
         * (branch expression (line 197)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
    preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    //Act Statement(s)
    ECKey result = ECKey.fromPrivateAndPrecalculatedPublic(new BigInteger("123456789"), eCPointMock, true);
    ECKey eCKey = new ECKey(new BigInteger("123456789"), eCPointMock, true);
    //Assert statement(s)
    assertThat(result, equalTo(eCKey));
    preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
}*/
    }

    //Sapient generated method id: ${60a1f331-fed0-3fe3-8190-ef1463bdf489}
    @Test()
    public void fromPrivateAndPrecalculatedPublic1WhenDefaultBranchAndDefaultBranch() {
        /* Branches:
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : true  #  inside <init> method
         * (branch expression (line 197)) : true  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
    preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    byte[] byteArray = new byte[] { (byte) 1, (byte) 2, (byte) 3 };
    byte[] byteArray2 = new byte[] { (byte) 4, (byte) 5, (byte) 6 };
    //Act Statement(s)
    ECKey result = ECKey.fromPrivateAndPrecalculatedPublic(byteArray, byteArray2);
    X9ECParameters x9ECParameters = CustomNamedCurves.getByName("secp256k1");
    ECCurve eCCurve = x9ECParameters.getCurve();
    ECPoint eCPoint = x9ECParameters.getG();
    ECDomainParameters eCDomainParameters = new ECDomainParameters(eCCurve, eCPoint, new BigInteger("115792089237316195423570985008687907852837564279074904382605163141518161494337"), new BigInteger("1"));
    ECCurve eCCurve2 = eCDomainParameters.getCurve();
    LazyECPoint lazyECPoint = new LazyECPoint(eCCurve2, byteArray2);
    ECKey eCKey = new ECKey(new BigInteger("66051"), lazyECPoint);
    //Assert statement(s)
    assertThat(result, equalTo(eCKey));
    preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
}*/
    }

    //Sapient generated method id: ${91d51680-b184-3b70-8a0c-1a4a2e75d53a}
    @Test()
    public void fromPrivateAndPrecalculatedPublic1WhenDefaultBranchAndDefaultBranchAndDefaultBranchAndDefaultBranch2() {
        /* Branches:
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : false  #  inside <init> method
         * (branch expression (line 197)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
    preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
    preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
    byte[] byteArray = new byte[] {};
    byte[] byteArray2 = new byte[] {};
    //Act Statement(s)
    ECKey result = ECKey.fromPrivateAndPrecalculatedPublic(byteArray, byteArray2);
    X9ECParameters x9ECParameters = CustomNamedCurves.getByName("secp256k1");
    ECCurve eCCurve = x9ECParameters.getCurve();
    ECPoint eCPoint = x9ECParameters.getG();
    ECDomainParameters eCDomainParameters = new ECDomainParameters(eCCurve, eCPoint, new BigInteger("115792089237316195423570985008687907852837564279074904382605163141518161494337"), new BigInteger("1"));
    ECCurve eCCurve2 = eCDomainParameters.getCurve();
    LazyECPoint lazyECPoint = new LazyECPoint(eCCurve2, byteArray2);
    ECKey eCKey = new ECKey(new BigInteger("0"), lazyECPoint);
    //Assert statement(s)
    assertThat(result, equalTo(eCKey));
    preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
    preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
    preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(1));
}*/
    }

    //Sapient generated method id: ${a00fc475-1183-3e87-b9f1-e69e5497ed1e}
    @Test()
    public void fromPublicOnlyWhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 190)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        //ECKey result = ECKey.fromPublicOnly(eCPointMock, false);
        //ECKey eCKey = new ECKey((BigInteger) null, eCPointMock, false);
        //Assert statement(s)
        //assertThat(result, equalTo(eCKey));
    }

    //Sapient generated method id: ${1878f202-ec74-3894-9150-8f5fb9790081}
    @Test()
    public void fromPublicOnly1WhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 190)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //byte[] byteArray = new byte[] { (byte) 4, (byte) 30, (byte) 47, (byte) 60, (byte) 77, (byte) 90, (byte) 107, (byte) 124, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 22, (byte) 39, (byte) 56, (byte) 73, (byte) 90, (byte) 107, (byte) 124, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 22, (byte) 39, (byte) 56, (byte) 73, (byte) 90, (byte) 107, (byte) 124, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 22, (byte) 39, (byte) 56, (byte) 73, (byte) 90, (byte) 107, (byte) 124, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
        //Act Statement(s)
        //ECKey result = ECKey.fromPublicOnly(byteArray);
        //X9ECParameters x9ECParameters = CustomNamedCurves.getByName("secp256k1");
        //ECCurve eCCurve = x9ECParameters.getCurve();
        //ECPoint eCPoint = x9ECParameters.getG();
        //ECDomainParameters eCDomainParameters = new ECDomainParameters(eCCurve, eCPoint, new BigInteger("115792089237316195423570985008687907852837564279074904382605163141518161494337"), new BigInteger("1"));
        //ECCurve eCCurve2 = eCDomainParameters.getCurve();
        //LazyECPoint lazyECPoint = new LazyECPoint(eCCurve2, byteArray);
        //ECKey eCKey = new ECKey((BigInteger) null, lazyECPoint);
        //Assert statement(s)
        //assertThat(result, equalTo(eCKey));
    }

    //Sapient generated method id: ${752bef77-7d79-374f-9d88-5ccff834f939}
    @Test()
    public void fromPublicOnly2Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class, CALLS_REAL_METHODS)) {
    ECKey eCKey2 = new ECKey();
    eCKey.when(() -> ECKey.fromPublicOnly((ECPoint) any(), eq(false))).thenReturn(eCKey2);
    ECKey eCKey3 = new ECKey();
    //Act Statement(s)
    ECKey result = ECKey.fromPublicOnly(eCKey3);
    //Assert statement(s)
    assertThat(result, equalTo(eCKey2));
    eCKey.verify(() -> ECKey.fromPublicOnly((ECPoint) any(), eq(false)), atLeast(1));
}*/
    }

    //Sapient generated method id: ${8c8247a0-01a6-3727-bbc5-78d3109890bb}
    @Test()
    public void decompressWhenPubNotIsCompressed() {
        /* Branches:
         * (!pub.isCompressed()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
    preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    ECKey target = new ECKey(new BigInteger("123456789"), eCPointMock, false);
    //Act Statement(s)
    ECKey result = target.decompress();
    //Assert statement(s)
    assertThat(result, equalTo(target));
    preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
}*/
    }

    //Sapient generated method id: ${2f36375e-8b75-30ef-88ee-71192cffb754}
    @Test()
    public void decompressWhenDefaultBranchAndDefaultBranch() {
        /* Branches:
         * (!pub.isCompressed()) : false
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : true  #  inside <init> method
         * (branch expression (line 197)) : true  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
    preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    ECKey target = new ECKey(new BigInteger("123456789"), eCPointMock, false);
    //Act Statement(s)
    ECKey result = target.decompress();
    //Assert statement(s)
    assertThat(result, equalTo(target));
    preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
}*/
    }

    //Sapient generated method id: ${456dfef5-d5f2-37de-8aaf-1806e54e458c}
    @Test()
    public void decompressWhenPubIsCompressedAndDefaultBranchAndDefaultBranchAndDefaultBranchAndDefaultBranch() {
        /* Branches:
         * (!pub.isCompressed()) : false
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : false  #  inside <init> method
         * (branch expression (line 197)) : false  #  inside <init> method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: pub
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //ECPoint eCPointMock2 = mock(ECPoint.class);
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
    preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    ECKey target = new ECKey(new BigInteger("0"), eCPointMock, true);
    //Act Statement(s)
    ECKey result = target.decompress();
    LazyECPoint lazyECPoint = new LazyECPoint(eCPointMock2, false);
    ECKey eCKey = new ECKey(new BigInteger("0"), lazyECPoint);
    //Assert statement(s)
    assertThat(result, equalTo(eCKey));
    preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(2));
}*/
    }

    //Sapient generated method id: ${add836b3-1be9-3d45-a181-20a281dbc13e}
    @Test()
    public void fromEncryptedTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class, CALLS_REAL_METHODS)) {
    byte[] byteArray = new byte[] {};
    eCKey.when(() -> ECKey.fromPublicOnly(byteArray)).thenReturn(eCKeyMock);
    //Act Statement(s)
    ECKey result = ECKey.fromEncrypted(encryptedDataMock, keyCrypterMock, byteArray);
    //Assert statement(s)
    assertThat(result, equalTo(eCKeyMock));
    eCKey.verify(() -> ECKey.fromPublicOnly(byteArray), atLeast(1));
}*/
    }

    //Sapient generated method id: ${9a919234-6f53-32dd-8d1d-ce5d51238523}
    @Test()
    public void isPubKeyOnlyWhenPrivIsNull() {
        /* Branches:
         * (priv == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = new ECKey((BigInteger) null, eCPointMock, false);
            //Act Statement(s)
            boolean result = target.isPubKeyOnly();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${9b824f02-6df8-3ae7-b5ad-9f74d523320c}
    @Test()
    public void isPubKeyOnlyWhenPrivIsNotNull() {
        /* Branches:
         * (priv == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
    preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    ECKey target = new ECKey(new BigInteger("0"), eCPointMock, false);
    //Act Statement(s)
    boolean result = target.isPubKeyOnly();
    //Assert statement(s)
    assertThat(result, equalTo(Boolean.FALSE));
    preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
}*/
    }

    //Sapient generated method id: ${2b54b47a-1c22-3f30-a104-79b873fb49e9}
    @Test()
    public void hasPrivKeyWhenPrivIsNotNull() {
        /* Branches:
         * (priv != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
    preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    ECKey target = new ECKey(new BigInteger("0"), eCPointMock, false);
    //Act Statement(s)
    boolean result = target.hasPrivKey();
    //Assert statement(s)
    assertThat(result, equalTo(Boolean.TRUE));
    preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
}*/
    }

    //Sapient generated method id: ${b92815fd-8ef3-37e2-a7e9-f79dd5b10287}
    @Test()
    public void hasPrivKeyWhenPrivIsNull() {
        /* Branches:
         * (priv != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
    preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    ECKey target = new ECKey((BigInteger) null, eCPointMock, false);
    //Act Statement(s)
    boolean result = target.hasPrivKey();
    //Assert statement(s)
    assertThat(result, equalTo(Boolean.FALSE));
    preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
}*/
    }

    //Sapient generated method id: ${9316d872-2d9f-3a68-b8d5-443bdba3ad5c}
    @Test()
    public void isWatchingWhenIsEncryptedNot() {
        /* Branches:
         * (isPubKeyOnly()) : true
         * (!isEncrypted()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = spy(new ECKey(new BigInteger("0"), eCPointMock, false));
            doReturn(true).when(target).isPubKeyOnly();
            doReturn(false).when(target).isEncrypted();
            //Act Statement(s)
            boolean result = target.isWatching();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            verify(target, atLeast(1)).isPubKeyOnly();
            verify(target, atLeast(1)).isEncrypted();
        }
    }

    //Sapient generated method id: ${09ee15f4-b23d-3cc5-ad7a-c6d293da8393}
    @Test()
    public void isWatchingWhenIsEncrypted() {
        /* Branches:
         * (isPubKeyOnly()) : true
         * (!isEncrypted()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = spy(new ECKey(new BigInteger("0"), eCPointMock, false));
            doReturn(true).when(target).isPubKeyOnly();
            doReturn(true).when(target).isEncrypted();
            //Act Statement(s)
            boolean result = target.isWatching();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            verify(target, atLeast(1)).isPubKeyOnly();
            verify(target, atLeast(1)).isEncrypted();
        }
    }

    //Sapient generated method id: ${427ee3e3-fa97-395a-970c-a4f1f7e9f7b2}
    @Test()
    public void toASN1Test() throws IOException {
        /**
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: seq
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = spy(new ECKey(new BigInteger("123456789"), eCPointMock, true));
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(target).getPrivKeyBytes();
            //Act Statement(s)
            byte[] result = target.toASN1();
            byte[] byteResultArray = new byte[]{(byte) 48, (byte) -127, (byte) -23, (byte) 2, (byte) 1, (byte) 1, (byte) -96, (byte) -127, (byte) -29, (byte) 48, (byte) -127, (byte) -32, (byte) 2, (byte) 1, (byte) 1, (byte) 48, (byte) 44, (byte) 6, (byte) 7, (byte) 42, (byte) -122, (byte) 72, (byte) -50, (byte) 61, (byte) 1, (byte) 1, (byte) 2, (byte) 33, (byte) 0, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -2, (byte) -1, (byte) -1, (byte) -4, (byte) 47, (byte) 48, (byte) 68, (byte) 4, (byte) 32, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 4, (byte) 32, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 7, (byte) 4, (byte) 65, (byte) 4, (byte) 121, (byte) -66, (byte) 102, (byte) 126, (byte) -7, (byte) -36, (byte) -69, (byte) -84, (byte) 85, (byte) -96, (byte) 98, (byte) -107, (byte) -50, (byte) -121, (byte) 11, (byte) 7, (byte) 2, (byte) -101, (byte) -4, (byte) -37, (byte) 45, (byte) -50, (byte) 40, (byte) -39, (byte) 89, (byte) -14, (byte) -127, (byte) 91, (byte) 22, (byte) -8, (byte) 23, (byte) -104, (byte) 72, (byte) 58, (byte) -38, (byte) 119, (byte) 38, (byte) -93, (byte) -60, (byte) 101, (byte) 93, (byte) -92, (byte) -5, (byte) -4, (byte) 14, (byte) 17, (byte) 8, (byte) -88, (byte) -3, (byte) 23, (byte) -76, (byte) 72, (byte) -90, (byte) -123, (byte) 84, (byte) 25, (byte) -100, (byte) 71, (byte) -48, (byte) -113, (byte) -5, (byte) 16, (byte) -44, (byte) -72, (byte) 2, (byte) 33, (byte) 0, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -2, (byte) -70, (byte) -82, (byte) -36, (byte) -26, (byte) -81, (byte) 72, (byte) -96, (byte) 59, (byte) -65, (byte) -46, (byte) 94, (byte) -116, (byte) -48, (byte) 54, (byte) 65, (byte) 65, (byte) 2, (byte) 1, (byte) 1};
            //Assert statement(s)
            assertThat(result, equalTo(byteResultArray));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            verify(target, atLeast(1)).getPrivKeyBytes();
        }
    }

    //Sapient generated method id: ${da1fd4f1-0d1c-3720-a478-048f2f9ddb75}
    @Test()
    public void toASN1WhenCaughtIOExceptionThrowsRuntimeException() throws IOException {
        /* Branches:
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: seq
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = spy(new ECKey(new BigInteger("123456789"), eCPointMock, true));
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(target).getPrivKeyBytes();
            thrown.expect(RuntimeException.class);
            thrown.expectCause(isA(IOException.class));
            //Act Statement(s)
            target.toASN1();
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            verify(target, atLeast(1)).getPrivKeyBytes();
        }
    }

    //Sapient generated method id: ${1532c266-8e3a-3cd9-a0fe-36db2b16e014}
    @Test()
    public void publicKeyFromPrivateTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class, CALLS_REAL_METHODS)) {
    eCKey.when(() -> ECKey.publicPointFromPrivate(new BigInteger("123456789"))).thenReturn(eCPointMock);
    byte[] byteArray = new byte[] {};
    doReturn(byteArray).when(eCPointMock).getEncoded(true);
    //Act Statement(s)
    byte[] result = ECKey.publicKeyFromPrivate(new BigInteger("123456789"), true);
    //Assert statement(s)
    assertThat(result, equalTo(byteArray));
    eCKey.verify(() -> ECKey.publicPointFromPrivate(new BigInteger("123456789")), atLeast(1));
    verify(eCPointMock, atLeast(1)).getEncoded(true);
}*/
    }

    //Sapient generated method id: ${ae547fea-0796-3a4c-862c-4b73aced04ad}
    @Test()
    public void publicPointFromPrivateWhenPrivKeyBitLengthGreaterThanCURVEGetNBitLength() {
        /* Branches:
         * (privKey.bitLength() > CURVE.getN().bitLength()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        //ECPoint result = ECKey.publicPointFromPrivate(new BigInteger("115792089237316195423570985008687907853269984665640564039457584007913129639937"));
        //FixedPointCombMultiplier fixedPointCombMultiplier = new FixedPointCombMultiplier();
        //X9ECParameters x9ECParameters = CustomNamedCurves.getByName("secp256k1");
        //ECCurve eCCurve = x9ECParameters.getCurve();
        //ECPoint eCPoint2 = x9ECParameters.getG();
        //ECDomainParameters eCDomainParameters = new ECDomainParameters(eCCurve, eCPoint2, new BigInteger("115792089237316195423570985008687907852837564279074904382605163141518161494337"), new BigInteger("1"));
        //ECPoint eCPoint3 = eCDomainParameters.getG();
        //ECPoint eCPoint = fixedPointCombMultiplier.multiply(eCPoint3, new BigInteger("432420386565659656852420866394968145600"));
        //Assert statement(s)
        //assertThat(result, equalTo(eCPoint));
    }

    //Sapient generated method id: ${e86c0be8-0e28-378f-b530-a9805d47f5bd}
    @Test()
    public void getPubKeyHashWhenPubKeyHashIsNull() {
        /* Branches:
         * (pubKeyHash == null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: pub
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
    preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    ECKey target = new ECKey(new BigInteger("0"), eCPointMock, false);
    //Act Statement(s)
    byte[] result = target.getPubKeyHash();
    byte[] byteResultArray = new byte[] { (byte) -76, (byte) 114, (byte) -94, (byte) 102, (byte) -48, (byte) -67, (byte) -119, (byte) -63, (byte) 55, (byte) 6, (byte) -92, (byte) 19, (byte) 44, (byte) -49, (byte) -79, (byte) 111, (byte) 124, (byte) 59, (byte) -97, (byte) -53 };
    //Assert statement(s)
    assertThat(result, equalTo(byteResultArray));
    preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
}*/
    }

    //Sapient generated method id: ${706c1e2f-f6b9-34e6-b206-31e5ff2ddddd}
    @Test()
    public void getPubKeyTest() {
        /**
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: pub
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
    preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    ECKey target = new ECKey(new BigInteger("1234567890"), eCPointMock, true);
    //Act Statement(s)
    byte[] result = target.getPubKey();
    byte[] byteResultArray = new byte[] {};
    //Assert statement(s)
    assertThat(result, equalTo(byteResultArray));
    preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
}*/
    }

    //Sapient generated method id: ${0ae77e04-344f-38ef-aeef-01a98cbbaeb4}
    @Test()
    public void getPubKeyPointTest() {
        /**
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: pub
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
    preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    ECKey target = new ECKey(new BigInteger("1234567890"), eCPointMock, true);
    //Act Statement(s)
    ECPoint result = target.getPubKeyPoint();
    //Assert statement(s)
    assertThat(result, is(notNullValue()));
    preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
}*/
    }

    //Sapient generated method id: ${0156783b-477f-3459-ae43-145d2c10f0e7}
    @Test()
    public void getPrivKeyWhenPrivIsNullThrowsECKeyMissingPrivateKeyException() {
        /* Branches:
         * (priv == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
    preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    ECKey target = new ECKey((BigInteger) null, eCPointMock, false);
    thrown.expect(ECKey.MissingPrivateKeyException.class);
    //Act Statement(s)
    target.getPrivKey();
    //Assert statement(s)
    preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
}*/
    }

    //Sapient generated method id: ${d1a875f3-108f-30e2-a6c3-42cefedbe71c}
    @Test()
    public void getPrivKeyWhenPrivIsNotNull() {
        /* Branches:
         * (priv == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = new ECKey(new BigInteger("0"), eCPointMock, false);
            //Act Statement(s)
            BigInteger result = target.getPrivKey();
            //Assert statement(s)
            assertThat(result, equalTo(new BigInteger("0")));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${c0cf8d11-c721-35e9-bb4f-f7961a9fec2c}
    @Test()
    public void isCompressedWhenPubIsCompressed() {
        /* Branches:
         * (pub.isCompressed()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = new ECKey(new BigInteger("123456789"), eCPointMock, true);
            //Act Statement(s)
            boolean result = target.isCompressed();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${d083b59d-9fea-304f-ab39-7e2a9fc04539}
    @Test()
    public void isCompressedWhenPubNotIsCompressed() {
        /* Branches:
         * (pub.isCompressed()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = new ECKey(new BigInteger("0"), eCPointMock, false);
            //Act Statement(s)
            boolean result = target.isCompressed();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${f915d923-84f3-37e4-9953-330fcf98de7b}
    @Test()
    public void toAddressWhenScriptTypeEqualsScriptTypeP2PKH() {
        /* Branches:
         * (scriptType == ScriptType.P2PKH) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        LegacyAddress legacyAddressMock = mock(LegacyAddress.class);
        try (MockedStatic<LegacyAddress> legacyAddress = mockStatic(LegacyAddress.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            legacyAddress.when(() -> LegacyAddress.fromPubKeyHash(networkMock, byteArray)).thenReturn(legacyAddressMock);
            ECKey target = spy(new ECKey(new BigInteger("0"), eCPointMock, false));
            doReturn(byteArray).when(target).getPubKeyHash();
            //Act Statement(s)
            Address result = target.toAddress(ScriptType.P2PKH, networkMock);
            //Assert statement(s)
            assertThat(result, equalTo(legacyAddressMock));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            legacyAddress.verify(() -> LegacyAddress.fromPubKeyHash(networkMock, byteArray), atLeast(1));
            verify(target, atLeast(1)).getPubKeyHash();
        }
    }

    //Sapient generated method id: ${3eb0caaf-5f19-3ef7-8fad-29562e68b8ab}
    @Test()
    public void toAddressWhenScriptTypeEqualsScriptTypeP2WPKH() {
        /* Branches:
         * (scriptType == ScriptType.P2PKH) : false
         * (scriptType == ScriptType.P2WPKH) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        SegwitAddress segwitAddressMock = mock(SegwitAddress.class);
        try (MockedStatic<SegwitAddress> segwitAddress = mockStatic(SegwitAddress.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            segwitAddress.when(() -> SegwitAddress.fromHash(networkMock, byteArray)).thenReturn(segwitAddressMock);
            ECKey target = spy(new ECKey(new BigInteger("0"), eCPointMock, false));
            doReturn(false).when(target).isCompressed();
            doReturn(byteArray).when(target).getPubKeyHash();
            //Act Statement(s)
            Address result = target.toAddress(ScriptType.P2WPKH, networkMock);
            //Assert statement(s)
            assertThat(result, equalTo(segwitAddressMock));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(2));
            segwitAddress.verify(() -> SegwitAddress.fromHash(networkMock, byteArray), atLeast(1));
            verify(target, atLeast(1)).isCompressed();
            verify(target, atLeast(1)).getPubKeyHash();
        }
    }

    //Sapient generated method id: ${a3447d4f-e794-3912-8845-7cd8f8e56c5e}
    @Test()
    public void toAddressWhenScriptTypeNotEqualsScriptTypeP2WPKHThrowsIllegalArgumentException() {
        /* Branches:
         * (scriptType == ScriptType.P2PKH) : false
         * (scriptType == ScriptType.P2WPKH) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = new ECKey(new BigInteger("0"), eCPointMock, false);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("P2SH");
            thrown.expect(IllegalArgumentException.class);
            thrown.expectMessage(illegalArgumentException.getMessage());
            //Act Statement(s)
            target.toAddress(ScriptType.P2SH, networkMock);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${381450a6-adb7-397a-96a9-7c4e699a5dea}
    @Test()
    public void signTest() throws KeyCrypterException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = spy(new ECKey(new BigInteger("123456789"), eCPointMock, true));
            doReturn(eCKeyECDSASignatureMock).when(target).sign((Sha256Hash) any(), eq((AesKey) null));
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            //Act Statement(s)
            ECKey.ECDSASignature result = target.sign(sha256Hash);
            //Assert statement(s)
            assertThat(result, equalTo(eCKeyECDSASignatureMock));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            verify(target, atLeast(1)).sign((Sha256Hash) any(), eq((AesKey) null));
        }
    }

    //Sapient generated method id: ${691b4cc1-a6de-3b56-b162-e03d34e732de}
    @Test()
    public void sign1WhenPrivIsNullThrowsECKeyMissingPrivateKeyException() throws KeyCrypterException {
        /* Branches:
         * (crypter != null) : false
         * (priv == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = new ECKey((BigInteger) null, eCPointMock, false);
            thrown.expect(ECKey.MissingPrivateKeyException.class);
            //Act Statement(s)
            target.sign(sha256HashMock, aesKeyMock);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${778deaba-2af1-3e72-9c9b-5a043bff9924}
    @Test()
    public void sign1WhenPrivIsNotNull() throws KeyCrypterException {
        /* Branches:
         * (crypter != null) : false
         * (priv == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = spy(new ECKey(new BigInteger("0"), eCPointMock, false));
            doReturn(eCKeyECDSASignatureMock).when(target).doSign(sha256HashMock, new BigInteger("0"));
            //Act Statement(s)
            ECKey.ECDSASignature result = target.sign(sha256HashMock, aesKeyMock);
            //Assert statement(s)
            assertThat(result, equalTo(eCKeyECDSASignatureMock));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            verify(target, atLeast(1)).doSign(sha256HashMock, new BigInteger("0"));
        }
    }

    //Sapient generated method id: ${9eab79e6-9540-35a1-ab30-7dac56bc7877}
    @Test()
    public void doSignTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = new ECKey(new BigInteger("987654321"), eCPointMock, true);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            //Act Statement(s)
            ECKey.ECDSASignature result = target.doSign(sha256Hash, new BigInteger("123456789"));
            ECKey.ECDSASignature eCKeyECDSASignature = new ECKey.ECDSASignature(new BigInteger("102426413757104329552954056774352809989599031959741882756279261201990286477115"), new BigInteger("24109381490211576431981556388810585764788598992064144935848418742299005000878"));
            ECKey.ECDSASignature eCDSASignature = eCKeyECDSASignature.toCanonicalised();
            //Assert statement(s)
            assertThat(result, equalTo(eCDSASignature));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${0c6fadbc-1478-3b4b-8ca0-9b6e32de2f71}
    @Test()
    public void verify1WhenVerifyDataECDSASignatureDecodeFromDERSignaturePub() throws SignatureDecodeException {
        /* Branches:
         * (verify(data, ECDSASignature.decodeFromDER(signature), pub)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class, CALLS_REAL_METHODS);
             MockedStatic<ECKey.ECDSASignature> eCKeyECDSASignature = mockStatic(ECKey.ECDSASignature.class)) {
            ECKey.ECDSASignature eCKeyECDSASignature2 = new ECKey.ECDSASignature(new BigInteger("0"), new BigInteger("0"));
            byte[] byteArray = new byte[]{(byte) 4, (byte) 5, (byte) 6};
            eCKeyECDSASignature.when(() -> ECKey.ECDSASignature.decodeFromDER(byteArray)).thenReturn(eCKeyECDSASignature2);
            byte[] byteArray2 = new byte[]{(byte) 1, (byte) 2, (byte) 3};
            byte[] byteArray3 = new byte[]{(byte) 7, (byte) 8, (byte) 9};
            eCKey.when(() -> ECKey.verify(byteArray2, eCKeyECDSASignature2, byteArray3)).thenReturn(true);
            //Act Statement(s)
            boolean result = ECKey.verify(byteArray2, byteArray, byteArray3);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            eCKeyECDSASignature.verify(() -> ECKey.ECDSASignature.decodeFromDER(byteArray), atLeast(1));
            eCKey.verify(() -> ECKey.verify(byteArray2, eCKeyECDSASignature2, byteArray3), atLeast(1));
        }
    }

    //Sapient generated method id: ${800aca53-74b1-3c4f-9b61-232c125477a4}
    @Test()
    public void verify1WhenVerifyNotDataECDSASignatureDecodeFromDERSignaturePub() throws SignatureDecodeException {
        /* Branches:
         * (verify(data, ECDSASignature.decodeFromDER(signature), pub)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class, CALLS_REAL_METHODS);
             MockedStatic<ECKey.ECDSASignature> eCKeyECDSASignature = mockStatic(ECKey.ECDSASignature.class)) {
            byte[] byteArray = new byte[]{};
            eCKeyECDSASignature.when(() -> ECKey.ECDSASignature.decodeFromDER(byteArray)).thenReturn(eCKeyECDSASignatureMock);
            byte[] byteArray2 = new byte[]{};
            byte[] byteArray3 = new byte[]{};
            eCKey.when(() -> ECKey.verify(byteArray2, eCKeyECDSASignatureMock, byteArray3)).thenReturn(false);
            //Act Statement(s)
            boolean result = ECKey.verify(byteArray2, byteArray, byteArray3);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            eCKeyECDSASignature.verify(() -> ECKey.ECDSASignature.decodeFromDER(byteArray), atLeast(1));
            eCKey.verify(() -> ECKey.verify(byteArray2, eCKeyECDSASignatureMock, byteArray3), atLeast(1));
        }
    }

    //Sapient generated method id: ${97234ccc-b4fd-30c6-8c0e-f7bcd2b3141d}
    @Test()
    public void verify2WhenECKeyVerifyHashSignatureGetPubKey() throws SignatureDecodeException {
        /* Branches:
         * (ECKey.verify(hash, signature, getPubKey())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3};
            byte[] byteArray2 = new byte[]{(byte) 4, (byte) 5, (byte) 6};
            byte[] byteArray3 = new byte[]{};
            eCKey.when(() -> ECKey.verify(byteArray, byteArray2, byteArray3)).thenReturn(true);
            ECKey target = new ECKey(new BigInteger("123456789"), eCPointMock, true);
            //Act Statement(s)
            boolean result = target.verify(byteArray, byteArray2);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            eCKey.verify(() -> ECKey.verify(byteArray, byteArray2, byteArray3), atLeast(1));
        }
    }

    //Sapient generated method id: ${a24e688a-cbcd-3970-b58a-49bdab5acda1}
    @Test()
    public void verify2WhenECKeyNotVerifyHashSignatureGetPubKey() throws SignatureDecodeException {
        /* Branches:
         * (ECKey.verify(hash, signature, getPubKey())) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3};
            byte[] byteArray2 = new byte[]{(byte) 4, (byte) 5, (byte) 6};
            byte[] byteArray3 = new byte[]{};
            eCKey.when(() -> ECKey.verify(byteArray, byteArray2, byteArray3)).thenReturn(false);
            ECKey target = new ECKey(new BigInteger("123456789"), eCPointMock, true);
            //Act Statement(s)
            boolean result = target.verify(byteArray, byteArray2);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            eCKey.verify(() -> ECKey.verify(byteArray, byteArray2, byteArray3), atLeast(1));
        }
    }

    //Sapient generated method id: ${617a78d8-50b3-356c-9eac-3f7ffe9c25d4}
    @Test()
    public void verifyOrThrowWhenVerifyNotHashSignatureThrowsSignatureException() throws SignatureDecodeException, SignatureException {
        /* Branches:
         * (!verify(hash, signature)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = spy(new ECKey(new BigInteger("0"), eCPointMock, false));
            byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3};
            byte[] byteArray2 = new byte[]{(byte) 4, (byte) 5, (byte) 6};
            doReturn(false).when(target).verify(byteArray, byteArray2);
            thrown.expect(SignatureException.class);
            //Act Statement(s)
            target.verifyOrThrow(byteArray, byteArray2);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            verify(target, atLeast(1)).verify(byteArray, byteArray2);
        }
    }

    //Sapient generated method id: ${4a1d6f4f-4781-3ef3-b351-98b9ab404b66}
    @Test()
    public void verifyOrThrowWhenVerifyHashSignature() throws SignatureDecodeException, SignatureException {
        /* Branches:
         * (!verify(hash, signature)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = spy(new ECKey(new BigInteger("1234567890"), eCPointMock, true));
            byte[] byteArray = new byte[]{(byte) 18, (byte) 52, (byte) 86, (byte) 120};
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0};
            doReturn(true).when(target).verify(byteArray, byteArray2);
            //Act Statement(s)
            target.verifyOrThrow(byteArray, byteArray2);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            verify(target, atLeast(1)).verify(byteArray, byteArray2);
        }
    }

    //Sapient generated method id: ${611299da-5d56-3844-b1ba-2a7a4b64ae11}
    @Test()
    public void isPubKeyCanonicalWhenPubkeyLengthLessThan33() {
        /* Branches:
         * (pubkey.length < 33) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        //Act Statement(s)
        boolean result = ECKey.isPubKeyCanonical(byteArray);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${efd6b7eb-5375-3ff4-985e-6aefdaeb8123}
    @Test()
    public void isPubKeyCanonicalWhenPubkeyLengthNotEquals65() {
        /* Branches:
         * (pubkey.length < 33) : false
         * (pubkey[0] == 0x04) : true
         * (pubkey.length != 65) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 4, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32};
        //Act Statement(s)
        boolean result = ECKey.isPubKeyCanonical(byteArray);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${68733ac9-45e5-3c95-a145-57e6bab220b6}
    @Test()
    public void isPubKeyCanonicalWhenPubkeyLengthEquals65() {
        /* Branches:
         * (pubkey.length < 33) : false
         * (pubkey[0] == 0x04) : true
         * (pubkey.length != 65) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 4, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 37, (byte) 38, (byte) 39, (byte) 40, (byte) 41, (byte) 42, (byte) 43, (byte) 44, (byte) 45, (byte) 46, (byte) 47, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 58, (byte) 59, (byte) 60, (byte) 61, (byte) 62, (byte) 63, (byte) 64, (byte) 65};
        //Act Statement(s)
        boolean result = ECKey.isPubKeyCanonical(byteArray);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${16372af8-edb0-3b93-8b4a-5114df5b867c}
    @Test()
    public void isPubKeyCanonicalWhen0IndexOfPubkeyNotEquals3() {
        /* Branches:
         * (pubkey.length < 33) : false
         * (pubkey[0] == 0x04) : false
         * (pubkey[0] == 0x02) : false
         * (pubkey[0] == 0x03) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 5, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32};
        //Act Statement(s)
        boolean result = ECKey.isPubKeyCanonical(byteArray);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${e039f512-0c57-3bd9-8f2c-32b5ee9215c6}
    @Test()
    public void isPubKeyCanonicalWhen0IndexOfPubkeyEquals3AndPubkeyLengthNotEquals33() {
        /* Branches:
         * (pubkey.length < 33) : false
         * (pubkey[0] == 0x04) : false
         * (pubkey[0] == 0x02) : false
         * (pubkey[0] == 0x03) : true
         * (pubkey.length != 33) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 3, (byte) 18, (byte) 52, (byte) 86, (byte) 120, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 18, (byte) 52, (byte) 86, (byte) 120, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 18, (byte) 52, (byte) 86, (byte) 120, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 18, (byte) 52, (byte) 86, (byte) 120, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        //Act Statement(s)
        boolean result = ECKey.isPubKeyCanonical(byteArray);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${8a7622c1-ad2a-3eb1-be80-1ab787cc7041}
    @Test()
    public void isPubKeyCompressedWhen0IndexOfEncodedEquals3() {
        /* Branches:
         * (encoded.length == 33) : true
         * (encoded[0] == 0x02) : false
         * (encoded[0] == 0x03) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byte[] byteArray = new byte[]{(byte) 3, (byte) 17, (byte) 34, (byte) 51, (byte) 68, (byte) 85, (byte) 102, (byte) 119, (byte) 0, (byte) 0, (byte) 0, (byte) 17, (byte) 34, (byte) 51, (byte) 68, (byte) 85, (byte) 102, (byte) 119, (byte) 0, (byte) 0, (byte) 0, (byte) 17, (byte) 34, (byte) 51, (byte) 68, (byte) 85, (byte) 102, (byte) 119, (byte) 0, (byte) 0, (byte) 0, (byte) 17, (byte) 34};
            byteUtils.when(() -> ByteUtils.formatHex(byteArray)).thenReturn("return_of_formatHex1");
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("return_of_formatHex1");
            thrown.expect(IllegalArgumentException.class);
            thrown.expectMessage(illegalArgumentException.getMessage());
            //Act Statement(s)
            ECKey.isPubKeyCompressed(byteArray);
            //Assert statement(s)
            byteUtils.verify(() -> ByteUtils.formatHex(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${52c56dad-1857-3f48-84e4-b815c4c147ee}
    @Test()
    public void isPubKeyCompressedWhen0IndexOfEncodedNotEquals3AndEncodedLengthNotEquals65ThrowsIllegalArgumentException() {
        /* Branches:
         * (encoded.length == 33) : true
         * (encoded[0] == 0x02) : false
         * (encoded[0] == 0x03) : false
         * (encoded.length == 65) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33};
            byteUtils.when(() -> ByteUtils.formatHex(byteArray)).thenReturn("0102030405060708090a0b0c0d0e0f101112131415161718191a1b1c1d1e1f20");
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("0102030405060708090a0b0c0d0e0f101112131415161718191a1b1c1d1e1f20");
            thrown.expect(IllegalArgumentException.class);
            thrown.expectMessage(illegalArgumentException.getMessage());
            //Act Statement(s)
            ECKey.isPubKeyCompressed(byteArray);
            //Assert statement(s)
            byteUtils.verify(() -> ByteUtils.formatHex(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${1a816620-d0fa-3882-be8d-1aebdd0b2e67}
    @Test()
    public void isPubKeyCompressedWhenEncodedLengthEquals65And0IndexOfEncodedEquals4() {
        /* Branches:
         * (encoded.length == 33) : true
         * (encoded[0] == 0x02) : false
         * (encoded[0] == 0x03) : false
         * (encoded.length == 65) : true
         * (encoded[0] == 0x04) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("040102030405060708090a0b0c0d0e0f101112131415161718191a1b1c1d1e1f");
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(illegalArgumentException.getMessage());
        byte[] byteArray = new byte[]{(byte) 4, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
        //Act Statement(s)
        ECKey.isPubKeyCompressed(byteArray);
    }

    //Sapient generated method id: ${a2887511-f189-37c6-8d52-b62c3e48ea74}
    @Test()
    public void signMessageTest() throws KeyCrypterException, IOException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = spy(new ECKey(new BigInteger("0"), eCPointMock, false));
            doReturn("return_of_signMessage1").when(target).signMessage("<input value>", (AesKey) null, ScriptType.P2PKH);
            //Act Statement(s)
            String result = target.signMessage("<input value>");
            //Assert statement(s)
            assertThat(result, equalTo("return_of_signMessage1"));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            verify(target, atLeast(1)).signMessage("<input value>", (AesKey) null, ScriptType.P2PKH);
        }
    }

    //Sapient generated method id: ${7aae578a-1b75-3254-9519-6a27443efcd7}
    @Test()
    public void signMessage1Test() throws KeyCrypterException, IOException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = spy(new ECKey(new BigInteger("123456789"), eCPointMock, true));
            doReturn("return_of_signMessage1").when(target).signMessage("Hello World", (AesKey) null, ScriptType.P2PKH);
            //Act Statement(s)
            String result = target.signMessage("Hello World", ScriptType.P2PKH);
            //Assert statement(s)
            assertThat(result, equalTo("return_of_signMessage1"));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            verify(target, atLeast(1)).signMessage("Hello World", (AesKey) null, ScriptType.P2PKH);
        }
    }

    //Sapient generated method id: ${27b8a97d-df4d-34a6-a39d-e40f4ea9c8a0}
    @Test()
    public void signMessage2Test() throws KeyCrypterException, IOException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = spy(new ECKey(new BigInteger("0"), eCPointMock, false));
            doReturn("return_of_signMessage1").when(target).signMessage("Hello, World!", aesKeyMock, ScriptType.P2PKH);
            //Act Statement(s)
            String result = target.signMessage("Hello, World!", aesKeyMock);
            //Assert statement(s)
            assertThat(result, equalTo("return_of_signMessage1"));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            verify(target, atLeast(1)).signMessage("Hello, World!", aesKeyMock, ScriptType.P2PKH);
        }
    }

    //Sapient generated method id: ${7d19bab2-8cde-3516-97ba-4a22e0e7cc0f}
    @Test()
    public void signMessage3WhenSwitchScriptTypeCaseP2WPKH() throws KeyCrypterException, IOException {
        /* Branches:
         * (!isCompressed()) : false
         * (switch(scriptType) = P2WPKH) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Base64> base64 = mockStatic(Base64.class);
    MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
    MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class);
    MockedStatic<VarInt> varInt = mockStatic(VarInt.class);
    MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
    preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    VarInt varInt2 = new VarInt(0L);
    varInt.when(() -> VarInt.of(0L)).thenReturn(varInt2);
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer);
    byte[] byteArray = new byte[] { (byte) 24, (byte) 66, (byte) 105, (byte) 116, (byte) 99, (byte) 111, (byte) 105, (byte) 110, (byte) 32, (byte) 83, (byte) 105, (byte) 103, (byte) 110, (byte) 101, (byte) 100, (byte) 32, (byte) 77, (byte) 101, (byte) 115, (byte) 115, (byte) 97, (byte) 103, (byte) 101, (byte) 58, (byte) 10 };
    sha256Hash.when(() -> Sha256Hash.twiceOf(byteArray)).thenReturn(sha256Hash2);
    byte[] byteArray2 = new byte[] {};
    byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
    byteUtils.when(() -> ByteUtils.bigIntegerToBytes(new BigInteger("0"), 32)).thenReturn(byteArray2).thenReturn(byteArray3);
    byte[] byteArray4 = new byte[] { (byte) 0, (byte) 0 };
    byte[] byteArray5 = new byte[] { (byte) 39, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
    base64.when(() -> Base64.encode(byteArray5)).thenReturn(byteArray4);
    ECKey target = spy(new ECKey(new BigInteger("0"), eCPointMock, false));
    doReturn(true).when(target).isCompressed();
    ECKey.ECDSASignature eCKeyECDSASignature = new ECKey.ECDSASignature(new BigInteger("0"), new BigInteger("0"));
    doReturn(eCKeyECDSASignature).when(target).sign((Sha256Hash) any(), eq(aesKeyMock));
    doReturn((byte) 0).when(target).findRecoveryId((Sha256Hash) any(), eq(eCKeyECDSASignature));
    //Act Statement(s)
    String result = target.signMessage("message1", aesKeyMock, ScriptType.P2WPKH);
    //Assert statement(s)
    assertThat(result, equalTo("result1"));
    preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
    varInt.verify(() -> VarInt.of(0L), atLeast(1));
    sha256Hash.verify(() -> Sha256Hash.twiceOf(byteArray), atLeast(1));
    byteUtils.verify(() -> ByteUtils.bigIntegerToBytes(new BigInteger("0"), 32), atLeast(2));
    base64.verify(() -> Base64.encode(byteArray5), atLeast(1));
    verify(target, atLeast(1)).isCompressed();
    verify(target, atLeast(1)).sign((Sha256Hash) any(), eq(aesKeyMock));
    verify(target, atLeast(1)).findRecoveryId((Sha256Hash) any(), eq(eCKeyECDSASignature));
}*/
    }

    //Sapient generated method id: ${c7e38118-506a-3b5a-8228-5893f150b7cc}
    @Test()
    public void signMessage3WhenScriptTypeEqualsScriptTypeP2SHThrowsIllegalArgumentException() throws KeyCrypterException {
        /* Branches:
         * (!isCompressed()) : true
         * (scriptType == ScriptType.P2WPKH) : false
         * (scriptType == ScriptType.P2SH) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
    preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    ECKey target = spy(new ECKey(new BigInteger("123456789"), eCPointMock, true));
    doReturn(false).when(target).isCompressed();
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Segwit P2WPKH and P2SH-P2WPKH script types only can be used with compressed keys. See BIP 141.");
    thrown.expect(IllegalArgumentException.class);
    thrown.expectMessage(illegalArgumentException.getMessage());
    //Act Statement(s)
    target.signMessage("Hello World", aesKeyMock, ScriptType.P2SH);
    //Assert statement(s)
    preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
    verify(target, atLeast(1)).isCompressed();
}*/
    }

    //Sapient generated method id: ${f15961a7-fcc2-3053-9b6b-30454ee8cef8}
    @Test()
    public void signMessage3WhenScriptTypeNotEqualsScriptTypeP2SHAndSwitchScriptTypeCaseP2SH() throws KeyCrypterException, IOException {
        /* Branches:
         * (!isCompressed()) : true
         * (scriptType == ScriptType.P2WPKH) : false
         * (scriptType == ScriptType.P2SH) : false
         * (switch(scriptType) = P2SH) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Base64> base64 = mockStatic(Base64.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class);
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            VarInt varInt2 = new VarInt(0L);
            varInt.when(() -> VarInt.of(0L)).thenReturn(varInt2);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer);
            byte[] byteArray = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.twiceOf(byteArray)).thenReturn(sha256Hash2);
            byte[] byteArray2 = new byte[]{};
            byte[] byteArray3 = new byte[]{(byte) 0};
            byteUtils.when(() -> ByteUtils.bigIntegerToBytes(new BigInteger("0"), 32)).thenReturn(byteArray2).thenReturn(byteArray3);
            byte[] byteArray4 = new byte[]{(byte) 0};
            byte[] byteArray5 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            base64.when(() -> Base64.encode(byteArray5)).thenReturn(byteArray4);
            ECKey target = spy(new ECKey(new BigInteger("0"), eCPointMock, false));
            doReturn(false).when(target).isCompressed();
            ECKey.ECDSASignature eCKeyECDSASignature = new ECKey.ECDSASignature(new BigInteger("0"), new BigInteger("0"));
            doReturn(eCKeyECDSASignature).when(target).sign((Sha256Hash) any(), eq(aesKeyMock));
            doReturn((byte) 0).when(target).findRecoveryId((Sha256Hash) any(), eq(eCKeyECDSASignature));
            //Act Statement(s)
            String result = target.signMessage("message1", aesKeyMock, ScriptType.P2PKH);
            //Assert statement(s)
            assertThat(result, equalTo("result1"));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            varInt.verify(() -> VarInt.of(0L), atLeast(1));
            sha256Hash.verify(() -> Sha256Hash.twiceOf(byteArray), atLeast(1));
            byteUtils.verify(() -> ByteUtils.bigIntegerToBytes(new BigInteger("0"), 32), atLeast(2));
            base64.verify(() -> Base64.encode(byteArray5), atLeast(1));
            verify(target, atLeast(1)).isCompressed();
            verify(target, atLeast(1)).sign((Sha256Hash) any(), eq(aesKeyMock));
            verify(target, atLeast(1)).findRecoveryId((Sha256Hash) any(), eq(eCKeyECDSASignature));
        }
    }

    //Sapient generated method id: ${7131f216-9fab-356f-91b1-a2c3eca7e43b}
    @Test()
    public void signMessage3WhenScriptTypeNotEqualsScriptTypeP2SHAndSwitchScriptTypeCaseDefaultThrowsIllegalArgumentException() throws KeyCrypterException {
        /* Branches:
         * (!isCompressed()) : true
         * (scriptType == ScriptType.P2WPKH) : false
         * (scriptType == ScriptType.P2SH) : false
         * (switch(scriptType) = default) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class);
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            varInt.when(() -> VarInt.of(0L)).thenReturn(varIntMock);
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(varIntMock).serialize();
            byte[] byteArray2 = new byte[]{(byte) 24, (byte) 66, (byte) 105, (byte) 116, (byte) 99, (byte) 111, (byte) 105, (byte) 110, (byte) 32, (byte) 83, (byte) 105, (byte) 103, (byte) 110, (byte) 101, (byte) 100, (byte) 32, (byte) 77, (byte) 101, (byte) 115, (byte) 115, (byte) 97, (byte) 103, (byte) 101, (byte) 58, (byte) 10};
            sha256Hash.when(() -> Sha256Hash.twiceOf(byteArray2)).thenReturn(sha256HashMock);
            ECKey target = spy(new ECKey(new BigInteger("0"), eCPointMock, false));
            doReturn(false).when(target).isCompressed();
            doReturn(eCKeyECDSASignatureMock).when(target).sign(sha256HashMock, aesKeyMock);
            doReturn((byte) 0).when(target).findRecoveryId(sha256HashMock, eCKeyECDSASignatureMock);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unsupported script type for message signing.");
            thrown.expect(IllegalArgumentException.class);
            thrown.expectMessage(illegalArgumentException.getMessage());
            //Act Statement(s)
            target.signMessage("message1", aesKeyMock, ScriptType.P2TR);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            varInt.verify(() -> VarInt.of(0L), atLeast(1));
            verify(varIntMock, atLeast(1)).serialize();
            sha256Hash.verify(() -> Sha256Hash.twiceOf(byteArray2), atLeast(1));
            verify(target, atLeast(1)).isCompressed();
            verify(target, atLeast(1)).sign(sha256HashMock, aesKeyMock);
            verify(target, atLeast(1)).findRecoveryId(sha256HashMock, eCKeyECDSASignatureMock);
        }
    }

    //Sapient generated method id: ${b0d0b032-edbe-3068-9a62-41d512da8a37}
    @Test()
    public void signMessage3WhenCaughtIOExceptionThrowsRuntimeException() throws KeyCrypterException, IOException {
        /* Branches:
         * (!isCompressed()) : true
         * (scriptType == ScriptType.P2WPKH) : false
         * (scriptType == ScriptType.P2SH) : false
         * (catch-exception (IOException)) : true  #  inside formatMessageForSigning method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<VarInt> varInt = mockStatic(VarInt.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            varInt.when(() -> VarInt.of(0L)).thenReturn(varIntMock);
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(varIntMock).serialize();
            ECKey target = spy(new ECKey(new BigInteger("0"), eCPointMock, false));
            doReturn(false).when(target).isCompressed();
            thrown.expect(RuntimeException.class);
            thrown.expectCause(isA(IOException.class));
            //Act Statement(s)
            target.signMessage("message1", aesKeyMock, ScriptType.P2PK);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            varInt.verify(() -> VarInt.of(0L), atLeast(1));
            verify(varIntMock, atLeast(1)).serialize();
            verify(target, atLeast(1)).isCompressed();
        }
    }

    //Sapient generated method id: ${e2d11369-4569-307e-99f3-0cdfc4e8f925}
    @Test()
    public void signMessage3WhenSwitchScriptTypeCaseP2PKHAndIsCompressed() throws KeyCrypterException, IOException {
        /* Branches:
         * (!isCompressed()) : true
         * (scriptType == ScriptType.P2WPKH) : false
         * (scriptType == ScriptType.P2SH) : false
         * (switch(scriptType) = P2PKH) : true
         * (isCompressed()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Base64> base64 = mockStatic(Base64.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class);
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            VarInt varInt2 = new VarInt(0L);
            varInt.when(() -> VarInt.of(0L)).thenReturn(varInt2);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer);
            byte[] byteArray = new byte[]{(byte) 24, (byte) 66, (byte) 105, (byte) 116, (byte) 99, (byte) 111, (byte) 105, (byte) 110, (byte) 32, (byte) 83, (byte) 105, (byte) 103, (byte) 110, (byte) 101, (byte) 100, (byte) 32, (byte) 77, (byte) 101, (byte) 115, (byte) 115, (byte) 97, (byte) 103, (byte) 101, (byte) 58, (byte) 10};
            sha256Hash.when(() -> Sha256Hash.twiceOf(byteArray)).thenReturn(sha256Hash2);
            byte[] byteArray2 = new byte[]{};
            byte[] byteArray3 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0};
            byteUtils.when(() -> ByteUtils.bigIntegerToBytes(new BigInteger("0"), 32)).thenReturn(byteArray2).thenReturn(byteArray3);
            byte[] byteArray4 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            byte[] byteArray5 = new byte[]{(byte) 31, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            base64.when(() -> Base64.encode(byteArray5)).thenReturn(byteArray4);
            ECKey target = spy(new ECKey(new BigInteger("0"), eCPointMock, false));
            ECKey.ECDSASignature eCKeyECDSASignature = new ECKey.ECDSASignature(new BigInteger("0"), new BigInteger("0"));
            doReturn(eCKeyECDSASignature).when(target).sign((Sha256Hash) any(), eq(aesKeyMock));
            doReturn((byte) 0).when(target).findRecoveryId((Sha256Hash) any(), eq(eCKeyECDSASignature));
            doReturn(false, true).when(target).isCompressed();
            //Act Statement(s)
            String result = target.signMessage("message1", aesKeyMock, ScriptType.P2PKH);
            //Assert statement(s)
            assertThat(result, equalTo("result1"));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            varInt.verify(() -> VarInt.of(0L), atLeast(1));
            sha256Hash.verify(() -> Sha256Hash.twiceOf(byteArray), atLeast(1));
            byteUtils.verify(() -> ByteUtils.bigIntegerToBytes(new BigInteger("0"), 32), atLeast(2));
            base64.verify(() -> Base64.encode(byteArray5), atLeast(1));
            verify(target, times(2)).isCompressed();
            verify(target, atLeast(1)).sign((Sha256Hash) any(), eq(aesKeyMock));
            verify(target, atLeast(1)).findRecoveryId((Sha256Hash) any(), eq(eCKeyECDSASignature));
        }
    }

    //Sapient generated method id: ${082e46a9-d774-31a2-9f5b-963dc47e457a}
    @Test()
    public void signMessage3WhenSwitchScriptTypeCaseP2PKHAndIsCompressedNot() throws KeyCrypterException, IOException {
        /* Branches:
         * (!isCompressed()) : true
         * (scriptType == ScriptType.P2WPKH) : false
         * (scriptType == ScriptType.P2SH) : false
         * (switch(scriptType) = P2PKH) : true
         * (isCompressed()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Base64> base64 = mockStatic(Base64.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class);
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            varInt.when(() -> VarInt.of(0L)).thenReturn(varIntMock);
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(varIntMock).serialize();
            byte[] byteArray2 = new byte[]{(byte) 24, (byte) 66, (byte) 105, (byte) 116, (byte) 99, (byte) 111, (byte) 105, (byte) 110, (byte) 32, (byte) 83, (byte) 105, (byte) 103, (byte) 110, (byte) 101, (byte) 100, (byte) 32, (byte) 77, (byte) 101, (byte) 115, (byte) 115, (byte) 97, (byte) 103, (byte) 101, (byte) 58, (byte) 10};
            sha256Hash.when(() -> Sha256Hash.twiceOf(byteArray2)).thenReturn(sha256HashMock);
            byte[] byteArray3 = new byte[]{};
            byte[] byteArray4 = new byte[]{};
            byteUtils.when(() -> ByteUtils.bigIntegerToBytes(new BigInteger("0"), 32)).thenReturn(byteArray3).thenReturn(byteArray4);
            byte[] byteArray5 = new byte[]{};
            byte[] byteArray6 = new byte[]{(byte) 27, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            base64.when(() -> Base64.encode(byteArray6)).thenReturn(byteArray5);
            ECKey target = spy(new ECKey(new BigInteger("0"), eCPointMock, false));
            doReturn(false).when(target).isCompressed();
            ECKey.ECDSASignature eCKeyECDSASignature = new ECKey.ECDSASignature(new BigInteger("0"), new BigInteger("0"));
            doReturn(eCKeyECDSASignature).when(target).sign(sha256HashMock, aesKeyMock);
            doReturn((byte) 0).when(target).findRecoveryId(sha256HashMock, eCKeyECDSASignature);
            //Act Statement(s)
            String result = target.signMessage("message1", aesKeyMock, ScriptType.P2PKH);
            //Assert statement(s)
            assertThat(result, equalTo("result1"));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            varInt.verify(() -> VarInt.of(0L), atLeast(1));
            verify(varIntMock, atLeast(1)).serialize();
            sha256Hash.verify(() -> Sha256Hash.twiceOf(byteArray2), atLeast(1));
            byteUtils.verify(() -> ByteUtils.bigIntegerToBytes(new BigInteger("0"), 32), atLeast(2));
            base64.verify(() -> Base64.encode(byteArray6), atLeast(1));
            verify(target, times(2)).isCompressed();
            verify(target, atLeast(1)).sign(sha256HashMock, aesKeyMock);
            verify(target, atLeast(1)).findRecoveryId(sha256HashMock, eCKeyECDSASignature);
        }
    }

    //Sapient generated method id: ${b43704bd-6b80-3c50-a83d-5b7a855ee1c7}
    @Test()
    public void signedMessageToKeyWhenCaughtRuntimeExceptionThrowsSignatureException() throws SignatureException {
        /* Branches:
         * (catch-exception (RuntimeException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Base64> base64 = mockStatic(Base64.class)) {
    byte[] byteArray = new byte[] { (byte) 0 };
    base64.when(() -> Base64.decode("SGVsbG8gV29ybGQh")).thenReturn(byteArray);
    SignatureException signatureException = new SignatureException("Could not decode base64", byteArray);
    thrown.expect(SignatureException.class);
    thrown.expectMessage(signatureException.getMessage());
    thrown.expectCause(isA(byte[].class));
    //Act Statement(s)
    ECKey.signedMessageToKey("Hello World!", "SGVsbG8gV29ybGQh");
    //Assert statement(s)
    base64.verify(() -> Base64.decode("SGVsbG8gV29ybGQh"), atLeast(1));
}*/
    }

    //Sapient generated method id: ${f512d003-e768-338c-85bd-55b185a34685}
    @Test()
    public void signedMessageToKeyWhenSignatureEncodedLengthLessThan65ThrowsSignatureException() throws SignatureException {
        /* Branches:
         * (signatureEncoded.length < 65) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Base64> base64 = mockStatic(Base64.class)) {
            byte[] byteArray = new byte[]{};
            base64.when(() -> Base64.decode("SGVsbG8gV29ybGQh")).thenReturn(byteArray);
            thrown.expect(SignatureException.class);
            //Act Statement(s)
            ECKey.signedMessageToKey("Hello World!", "SGVsbG8gV29ybGQh");
            //Assert statement(s)
            base64.verify(() -> Base64.decode("SGVsbG8gV29ybGQh"), atLeast(1));
        }
    }

    //Sapient generated method id: ${6a82a471-3d4a-3676-bcb7-7eef8dadcae0}
    @Test()
    public void signedMessageToKeyWhenHeaderGreaterThan42ThrowsSignatureException() throws SignatureException {
        /* Branches:
         * (signatureEncoded.length < 65) : false
         * (header < 27) : false
         * (header > 42) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Base64> base64 = mockStatic(Base64.class)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 37, (byte) 38, (byte) 39, (byte) 40, (byte) 41, (byte) 42, (byte) 43, (byte) 44, (byte) 45, (byte) 46, (byte) 47, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 58, (byte) 59, (byte) 60, (byte) 61, (byte) 62, (byte) 63, (byte) 64};
            base64.when(() -> Base64.decode("")).thenReturn(byteArray);
            thrown.expect(SignatureException.class);
            //Act Statement(s)
            ECKey.signedMessageToKey("message1", "");
            //Assert statement(s)
            base64.verify(() -> Base64.decode(""), atLeast(1));
        }
    }

    //Sapient generated method id: ${efa39cad-40d9-37b5-8df2-24fd4184689a}
    @Test()
    public void signedMessageToKeyWhenCaughtIOExceptionThrowsRuntimeException() throws SignatureException, IOException {
        /* Branches:
         * (signatureEncoded.length < 65) : false
         * (header < 27) : false
         * (header > 42) : false
         * (catch-exception (IOException)) : true  #  inside formatMessageForSigning method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<VarInt> varInt = mockStatic(VarInt.class);
             MockedStatic<Base64> base64 = mockStatic(Base64.class)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 37, (byte) 38, (byte) 39, (byte) 40, (byte) 41, (byte) 42, (byte) 43, (byte) 44, (byte) 45, (byte) 46, (byte) 47, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 58, (byte) 59, (byte) 60, (byte) 61, (byte) 62, (byte) 63, (byte) 64};
            base64.when(() -> Base64.decode("")).thenReturn(byteArray);
            varInt.when(() -> VarInt.of(0L)).thenReturn(varIntMock);
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(varIntMock).serialize();
            thrown.expect(RuntimeException.class);
            thrown.expectCause(isA(IOException.class));
            //Act Statement(s)
            ECKey.signedMessageToKey("message1", "");
            //Assert statement(s)
            base64.verify(() -> Base64.decode(""), atLeast(1));
            varInt.verify(() -> VarInt.of(0L), atLeast(1));
            verify(varIntMock).serialize();
        }
    }

    //Sapient generated method id: ${6b645a88-0cc7-32de-a31e-4cb081bf8b5e}
    @Test()
    public void signedMessageToKeyWhenKeyIsNotNull() throws SignatureException, IOException {
        /* Branches:
         * (signatureEncoded.length < 65) : false
         * (header < 27) : false
         * (header > 42) : false
         * (header >= 39) : true
         * (key == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class, CALLS_REAL_METHODS);
             MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class);
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class);
             MockedStatic<Base64> base64 = mockStatic(Base64.class)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 37, (byte) 38, (byte) 39, (byte) 40, (byte) 41, (byte) 42, (byte) 43, (byte) 44, (byte) 45, (byte) 46, (byte) 47, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 58, (byte) 59, (byte) 60, (byte) 61, (byte) 62, (byte) 63, (byte) 64};
            base64.when(() -> Base64.decode("")).thenReturn(byteArray);
            varInt.when(() -> VarInt.of(0L)).thenReturn(varIntMock);
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(varIntMock).serialize();
            byte[] byteArray3 = new byte[]{(byte) 24, (byte) 66, (byte) 105, (byte) 116, (byte) 99, (byte) 111, (byte) 105, (byte) 110, (byte) 32, (byte) 83, (byte) 105, (byte) 103, (byte) 110, (byte) 101, (byte) 100, (byte) 32, (byte) 77, (byte) 101, (byte) 115, (byte) 115, (byte) 97, (byte) 103, (byte) 101, (byte) 58, (byte) 10};
            sha256Hash.when(() -> Sha256Hash.twiceOf(byteArray3)).thenReturn(sha256HashMock);
            eCKey.when(() -> ECKey.recoverFromSignature(eq(0), (ECKey.ECDSASignature) any(), eq(sha256HashMock), eq(true))).thenReturn(eCKeyMock);
            //Act Statement(s)
            ECKey result = ECKey.signedMessageToKey("message1", "");
            //Assert statement(s)
            assertThat(result, equalTo(eCKeyMock));
            base64.verify(() -> Base64.decode(""), atLeast(1));
            varInt.verify(() -> VarInt.of(0L), atLeast(1));
            verify(varIntMock, atLeast(1)).serialize();
            sha256Hash.verify(() -> Sha256Hash.twiceOf(byteArray3), atLeast(1));
            eCKey.verify(() -> ECKey.recoverFromSignature(eq(0), (ECKey.ECDSASignature) any(), eq(sha256HashMock), eq(true)), atLeast(1));
        }
    }

    //Sapient generated method id: ${f599d1e5-19db-310b-b23b-f4756d2b58d4}
    @Test()
    public void signedMessageToKeyWhenHeaderGreaterThanOrEqualsTo31AndKeyIsNullThrowsSignatureException() throws SignatureException {
        /* Branches:
         * (signatureEncoded.length < 65) : false
         * (header < 27) : false
         * (header > 42) : false
         * (header >= 39) : false
         * (header >= 35) : false
         * (header >= 31) : true
         * (key == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Base64> base64 = mockStatic(Base64.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            base64.when(() -> Base64.decode("HwXQ6zvJzjz6zjz6zjz6zjz6zjz6zjz6zjz6zjz6zjz6zjz6zjz6zjz6zjz6zjz6zjz6zjz6zjz6zjz6zg==")).thenReturn(byteArray);
            thrown.expect(SignatureException.class);
            //Act Statement(s)
            ECKey.signedMessageToKey("Hello, world!", "HwXQ6zvJzjz6zjz6zjz6zjz6zjz6zjz6zjz6zjz6zjz6zjz6zjz6zjz6zjz6zjz6zjz6zjz6zjz6zjz6zg==");
            //Assert statement(s)
            base64.verify(() -> Base64.decode("HwXQ6zvJzjz6zjz6zjz6zjz6zjz6zjz6zjz6zjz6zjz6zjz6zjz6zjz6zjz6zjz6zjz6zjz6zjz6zjz6zg=="), atLeast(1));
        }
    }

    //Sapient generated method id: ${b69a0b40-2dfb-359f-b9e3-69785959e7fe}
    @Test()
    public void verifyMessageWhenKeyPubNotEqualsPubThrowsSignatureException() throws SignatureException {
        /* Branches:
         * (!key.pub.equals(pub)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            eCKey.when(() -> ECKey.signedMessageToKey("message1", "signatureBase64")).thenReturn(eCKeyMock);
            ECKey target = new ECKey(new BigInteger("0"), eCPointMock, false);
            thrown.expect(SignatureException.class);
            //Act Statement(s)
            target.verifyMessage("message1", "signatureBase64");
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            eCKey.verify(() -> ECKey.signedMessageToKey("message1", "signatureBase64"), atLeast(1));
        }
    }

    //Sapient generated method id: ${02e25fdf-c6dd-3c04-9b5a-64ac2bb25f41}
    @Test()
    public void verifyMessageWhenKeyPubEqualsPub() throws SignatureException, IOException {
        /* Branches:
         * (!key.pub.equals(pub)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            eCKey.when(() -> ECKey.signedMessageToKey("Hello World", "dGhpcyBpcyBhIHNpZ25hdHVyZQ==")).thenReturn(eCKeyMock);
            ECKey target = new ECKey(new BigInteger("123456789"), eCPointMock, true);
            //Act Statement(s)
            target.verifyMessage("Hello World", "dGhpcyBpcyBhIHNpZ25hdHVyZQ==");
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            eCKey.verify(() -> ECKey.signedMessageToKey("Hello World", "dGhpcyBpcyBhIHNpZ25hdHVyZQ=="), atLeast(1));
        }
    }

    //Sapient generated method id: ${27fcc624-a5b4-3096-b6c6-0a756fcc1a67}
    @Test()
    public void findRecoveryIdWhenKPubNotEqualsPubAndRecIdNotEqualsMinus1() {
        /* Branches:
         * (i < 4) : true
         * (k != null) : true
         * (k.pub.equals(pub)) : false
         * (recId == -1) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECKey eCKeyMock2 = mock(ECKey.class);
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey.ECDSASignature eCKeyECDSASignature = new ECKey.ECDSASignature(new BigInteger("1234567890"), new BigInteger("1234567890"));
            eCKey.when(() -> ECKey.recoverFromSignature(eq((byte) 0), eq(eCKeyECDSASignature), (Sha256Hash) any(), eq(false))).thenReturn(eCKeyMock);
            ECKey eCKey2 = new ECKey();
            eCKey.when(() -> ECKey.recoverFromSignature(eq((byte) 1), eq(eCKeyECDSASignature), (Sha256Hash) any(), eq(false))).thenReturn(eCKey2);
            eCKey.when(() -> ECKey.recoverFromSignature(eq((byte) 2), eq(eCKeyECDSASignature), (Sha256Hash) any(), eq(false))).thenReturn(eCKeyMock2);
            ECKey target = spy(new ECKey(new BigInteger("1234567890"), eCPointMock, true));
            doReturn(false).when(target).isCompressed();
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            //Act Statement(s)
            byte result = target.findRecoveryId(sha256Hash, eCKeyECDSASignature);
            //Assert statement(s)
            assertThat(result, equalTo((byte) 2));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            eCKey.verify(() -> ECKey.recoverFromSignature(eq((byte) 0), eq(eCKeyECDSASignature), (Sha256Hash) any(), eq(false)), atLeast(1));
            eCKey.verify(() -> ECKey.recoverFromSignature(eq((byte) 1), eq(eCKeyECDSASignature), (Sha256Hash) any(), eq(false)), atLeast(1));
            eCKey.verify(() -> ECKey.recoverFromSignature(eq((byte) 2), eq(eCKeyECDSASignature), (Sha256Hash) any(), eq(false)), atLeast(1));
            verify(target, times(3)).isCompressed();
        }
    }

    //Sapient generated method id: ${4b7f5c18-f1cb-3a88-a29f-b298d9d169cb}
    @Test()
    public void recoverFromSignatureWhenSigSSignumGreaterThanOrEqualsTo0AndXCompareToPrimeGreaterThanOrEqualsTo0() {
        /* Branches:
         * (recId >= 0) : true
         * (sig.r.signum() >= 0) : false
         * (sig.s.signum() >= 0) : true
         * (x.compareTo(prime) >= 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey.ECDSASignature eCKeyECDSASignature = new ECKey.ECDSASignature(new BigInteger("0"), new BigInteger("0"));
            //Act Statement(s)
            ECKey result = ECKey.recoverFromSignature(0, eCKeyECDSASignature, sha256HashMock, false);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(3));
        }
    }

    //Sapient generated method id: ${29274203-85a5-3873-b1c1-38ebd6618710}
    @Test()
    public void recoverFromSignatureWhenRMultiplyNIsInfinity() {
        /* Branches:
         * (recId >= 0) : true
         * (sig.r.signum() >= 0) : true
         * (sig.s.signum() >= 0) : true
         * (x.compareTo(prime) >= 0) : false
         * ((recId & 1) == 1) : true
         * (yBit) : true  #  inside decompressKey method
         * (!R.multiply(n).isInfinity()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Sha256Hash messageMock = mock(Sha256Hash.class);
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class, CALLS_REAL_METHODS);
             MockedStatic<ECAlgorithms> eCAlgorithms = mockStatic(ECAlgorithms.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(new BigInteger("1")).when(messageMock).toBigInteger();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            eCAlgorithms.when(() -> ECAlgorithms.sumOfTwoMultiplies((ECPoint) any(), eq(new BigInteger("0")), (ECPoint) any(), eq(new BigInteger("0")))).thenReturn(eCPointMock);
            eCKey.when(() -> ECKey.fromPublicOnly(eCPointMock, false)).thenReturn(eCKeyMock);
            ECKey.ECDSASignature eCKeyECDSASignature = new ECKey.ECDSASignature(new BigInteger("1"), new BigInteger("1"));
            //Act Statement(s)
            ECKey result = ECKey.recoverFromSignature(2, eCKeyECDSASignature, messageMock, false);
            //Assert statement(s)
            assertThat(result, equalTo(eCKeyMock));
            verify(messageMock, atLeast(1)).toBigInteger();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(3));
            eCAlgorithms.verify(() -> ECAlgorithms.sumOfTwoMultiplies((ECPoint) any(), eq(new BigInteger("0")), (ECPoint) any(), eq(new BigInteger("0"))), atLeast(1));
            eCKey.verify(() -> ECKey.fromPublicOnly(eCPointMock, false), atLeast(1));
        }
    }

    //Sapient generated method id: ${f1dcb929-af49-36da-bf67-a38d8ab6a7a7}
    @Test()
    public void recoverFromSignatureWhenSigSSignumLessThan0AndXCompareToPrimeLessThan0AndRecIdAnd1NotEquals1AndNotYBitAndRMultiplyNNotI() {
        /* Branches:
         * (recId >= 0) : false
         * (sig.r.signum() >= 0) : true
         * (sig.s.signum() >= 0) : false
         * (x.compareTo(prime) >= 0) : false
         * ((recId & 1) == 1) : false
         * (yBit) : false  #  inside decompressKey method
         * (!R.multiply(n).isInfinity()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey.ECDSASignature eCKeyECDSASignature = new ECKey.ECDSASignature(new BigInteger("0"), new BigInteger("-2147483648"));
            //Act Statement(s)
            ECKey result = ECKey.recoverFromSignature(-1, eCKeyECDSASignature, sha256HashMock, false);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(3));
        }
    }

    //Sapient generated method id: ${76996bb7-705d-33de-802d-b07f0dceae6b}
    @Test()
    public void getPrivKeyBytesTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            byteUtils.when(() -> ByteUtils.bigIntegerToBytes(new BigInteger("0"), 32)).thenReturn(byteArray);
            ECKey target = spy(new ECKey(new BigInteger("0"), eCPointMock, false));
            doReturn(new BigInteger("0")).when(target).getPrivKey();
            //Act Statement(s)
            byte[] result = target.getPrivKeyBytes();
            //Assert statement(s)
            assertThat(result, equalTo(byteArray));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            byteUtils.verify(() -> ByteUtils.bigIntegerToBytes(new BigInteger("0"), 32), atLeast(1));
            verify(target, atLeast(1)).getPrivKey();
        }
    }

    //Sapient generated method id: ${a0210d11-6e1e-30a9-ae1c-ff8119ab2165}
    @Test()
    public void getPrivateKeyEncodedTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = spy(new ECKey(new BigInteger("0"), eCPointMock, false));
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(target).getPrivKeyBytes();
            doReturn(false).when(target).isCompressed();
            //Act Statement(s)
            DumpedPrivateKey result = target.getPrivateKeyEncoded(networkMock);
            DumpedPrivateKey dumpedPrivateKey = new DumpedPrivateKey(networkMock, byteArray, false);
            //Assert statement(s)
            assertThat(result, equalTo(dumpedPrivateKey));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            verify(target, atLeast(1)).getPrivKeyBytes();
            verify(target, atLeast(1)).isCompressed();
        }
    }

    //Sapient generated method id: ${c0262be0-93fe-3c0b-8681-a322c3a97a80}
    @Test()
    public void getPrivateKeyEncoded1Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DumpedPrivateKey dumpedPrivateKeyMock = mock(DumpedPrivateKey.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = spy(new ECKey(new BigInteger("123456789"), eCPointMock, true));
            doReturn(dumpedPrivateKeyMock).when(target).getPrivateKeyEncoded(networkMock);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            //Act Statement(s)
            DumpedPrivateKey result = target.getPrivateKeyEncoded(networkParameters);
            //Assert statement(s)
            assertThat(result, equalTo(dumpedPrivateKeyMock));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            verify(target, atLeast(1)).getPrivateKeyEncoded(networkMock);
        }
    }

    //Sapient generated method id: ${e7ca91d8-c1cc-3fb0-bbfc-9b9ce2ba701e}
    @Test()
    public void creationTimeTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = new ECKey(new BigInteger("0"), eCPointMock, true);
            //Act Statement(s)
            Optional<Instant> result = target.creationTime();
            Optional<Instant> instantOptional = Optional.empty();
            //Assert statement(s)
            assertThat(result, equalTo(instantOptional));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${f3f8c93e-4bad-3365-95b7-147d7060a76b}
    @Test()
    public void setCreationTimeTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = new ECKey(new BigInteger("0"), eCPointMock, false);
            Instant instant = Instant.now();
            //Act Statement(s)
            target.setCreationTime(instant);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${1cb1776a-16c9-3d5e-abdd-90b3fd00e9dd}
    @Test()
    public void clearCreationTimeTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = new ECKey(new BigInteger("123456789"), eCPointMock, true);
            //Act Statement(s)
            target.clearCreationTime();
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${aab7b3ee-0703-3aca-9aba-6676b7a750b3}
    @Test()
    public void setCreationTimeSecondsWhenCreationTimeSecsGreaterThan0() {
        /* Branches:
         * (creationTimeSecs > 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = new ECKey(new BigInteger("0"), eCPointMock, false);
            //Act Statement(s)
            target.setCreationTimeSeconds(1L);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${bef4381a-288d-3155-9098-6a9016e3326b}
    @Test()
    public void setCreationTimeSecondsWhenCreationTimeSecsEquals0() {
        /* Branches:
         * (creationTimeSecs > 0) : false
         * (creationTimeSecs == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = new ECKey(new BigInteger("0"), eCPointMock, false);
            //Act Statement(s)
            target.setCreationTimeSeconds(0L);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${6efdfffb-ab76-3832-8528-819e02d958d6}
    @Test()
    public void setCreationTimeSecondsWhenCreationTimeSecsNotEquals0ThrowsIllegalArgumentException() {
        /* Branches:
         * (creationTimeSecs > 0) : false
         * (creationTimeSecs == 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = new ECKey(new BigInteger("0"), eCPointMock, false);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("s1");
            thrown.expect(IllegalArgumentException.class);
            thrown.expectMessage(illegalArgumentException.getMessage());
            //Act Statement(s)
            target.setCreationTimeSeconds(0L);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${4fa75ec5-3836-3310-8cc0-b163c11a74b7}
    @Test()
    public void encryptWhenCreationTimeIsNull() throws KeyCrypterException {
        /* Branches:
         * (creationTime != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            doReturn(encryptedDataMock).when(keyCrypterMock).encrypt(byteArray, aesKeyMock);
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray2 = new byte[]{};
            eCKey.when(() -> ECKey.fromEncrypted(encryptedDataMock, keyCrypterMock, byteArray2)).thenReturn(eCKeyMock);
            doNothing().when(eCKeyMock).clearCreationTime();
            ECKey target = spy(new ECKey(new BigInteger("0"), eCPointMock, false));
            doReturn(byteArray).when(target).getPrivKeyBytes();
            //Act Statement(s)
            ECKey result = target.encrypt(keyCrypterMock, aesKeyMock);
            //Assert statement(s)
            assertThat(result, equalTo(eCKeyMock));
            verify(keyCrypterMock, atLeast(1)).encrypt(byteArray, aesKeyMock);
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            eCKey.verify(() -> ECKey.fromEncrypted(encryptedDataMock, keyCrypterMock, byteArray2), atLeast(1));
            verify(eCKeyMock, atLeast(1)).clearCreationTime();
            verify(target, atLeast(1)).getPrivKeyBytes();
        }
    }

    //Sapient generated method id: ${2d262fc1-6cef-3ef5-93fc-f437a269acdc}
    @Test()
    public void decryptWhenEncryptedPrivateKeyIsNotNullThrowsIllegalStateException() throws KeyCrypterException {
        /* Branches:
         * (this.keyCrypter != null) : false
         * (encryptedPrivateKey != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenThrow(illegalStateException);
            ECKey target = new ECKey(new BigInteger("0"), eCPointMock, false);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.decrypt(keyCrypterMock, aesKeyMock);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${5d22f1ed-7e4b-3c31-a3e9-a69b4ab64a1e}
    @Test()
    public void decrypt1WhenCrypterIsNullThrowsKeyCrypterException() throws KeyCrypterException {
        /* Branches:
         * (crypter == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = new ECKey(new BigInteger("0"), eCPointMock, false);
            KeyCrypterException keyCrypterException = new KeyCrypterException("No key crypter available");
            thrown.expect(KeyCrypterException.class);
            thrown.expectMessage(keyCrypterException.getMessage());
            //Act Statement(s)
            target.decrypt(aesKeyMock);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${7be6a4f9-5ec5-3e32-bc29-c53e3456afa0}
    @Test()
    public void maybeDecryptWhenAesKeyIsNotNull() throws KeyCrypterException {
        /* Branches:
         * (isEncrypted()) : true
         * (aesKey != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = spy(new ECKey(new BigInteger("1234567890"), eCPointMock, true));
            doReturn(true).when(target).isEncrypted();
            doReturn(eCKeyMock).when(target).decrypt(aesKeyMock);
            //Act Statement(s)
            ECKey result = target.maybeDecrypt(aesKeyMock);
            //Assert statement(s)
            assertThat(result, equalTo(eCKeyMock));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            verify(target, atLeast(1)).isEncrypted();
            verify(target, atLeast(1)).decrypt(aesKeyMock);
        }
    }

    //Sapient generated method id: ${ce25b3c6-6733-3d03-8c07-10390fe615ee}
    @Test()
    public void maybeDecryptWhenAesKeyIsNull() throws KeyCrypterException {
        /* Branches:
         * (isEncrypted()) : true
         * (aesKey != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = spy(new ECKey(new BigInteger("123456789"), eCPointMock, true));
            doReturn(true).when(target).isEncrypted();
            AesKey aesKey = null;
            //Act Statement(s)
            ECKey result = target.maybeDecrypt(aesKey);
            //Assert statement(s)
            assertThat(result, equalTo(target));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            verify(target, atLeast(1)).isEncrypted();
        }
    }

    //Sapient generated method id: ${a5c95947-b68f-3e15-9e5c-137707dcc458}
    @Test()
    public void encryptionIsReversibleWhenArraysNotEqualsOriginalPrivateKeyBytesRebornKeyBytes() throws KeyCrypterException {
        /* Branches:
         * (!Arrays.equals(originalPrivateKeyBytes, rebornKeyBytes)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECKey eCKey = new ECKey();
        ECKey eCKey2 = new ECKey();
        //Act Statement(s)
        boolean result = ECKey.encryptionIsReversible(eCKey, eCKey2, keyCrypterMock, aesKeyMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${6f02d818-da6d-3983-80e1-9ddcd62c21bf}
    @Test()
    public void encryptionIsReversibleWhenArraysEqualsOriginalPrivateKeyBytesRebornKeyBytes() throws KeyCrypterException {
        /* Branches:
         * (!Arrays.equals(originalPrivateKeyBytes, rebornKeyBytes)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECKey eCKey = new ECKey();
        ECKey eCKey2 = new ECKey();
        //Act Statement(s)
        boolean result = ECKey.encryptionIsReversible(eCKey, eCKey2, keyCrypterMock, aesKeyMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${8b7b5c15-2af0-3998-9c17-f1a5acb97807}
    @Test()
    public void encryptionIsReversibleWhenCaughtKeyCrypterException() throws KeyCrypterException {
        /* Branches:
         * (!Arrays.equals(originalPrivateKeyBytes, rebornKeyBytes)) : true
         * (catch-exception (KeyCrypterException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECKey eCKey = new ECKey();
        ECKey eCKey2 = new ECKey();
        //Act Statement(s)
        boolean result = ECKey.encryptionIsReversible(eCKey, eCKey2, keyCrypterMock, aesKeyMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${fb4885d6-9d6e-3304-8242-966497227d83}
    @Test()
    public void isEncryptedWhenKeyCrypterIsNull() {
        /* Branches:
         * (keyCrypter != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = new ECKey(new BigInteger("0"), eCPointMock, false);
            //Act Statement(s)
            boolean result = target.isEncrypted();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${a8ff216a-be1d-31db-af89-3852ffc456ad}
    @Test()
    public void getEncryptionTypeWhenKeyCrypterIsNull() {
        /* Branches:
         * (keyCrypter != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = new ECKey(new BigInteger("0"), eCPointMock, false);
            //Act Statement(s)
            Protos.Wallet.EncryptionType result = target.getEncryptionType();
            //Assert statement(s)
            assertThat(result, equalTo(Protos.Wallet.EncryptionType.UNENCRYPTED));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${f7e39e4d-0f7c-3206-8f36-3a0d284007ed}
    @Test()
    public void getSecretBytesWhenHasPrivKey() {
        /* Branches:
         * (hasPrivKey()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = spy(new ECKey(new BigInteger("123456789"), eCPointMock, true));
            doReturn(true).when(target).hasPrivKey();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(target).getPrivKeyBytes();
            //Act Statement(s)
            byte[] result = target.getSecretBytes();
            //Assert statement(s)
            assertThat(result, equalTo(byteArray));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            verify(target, atLeast(1)).hasPrivKey();
            verify(target, atLeast(1)).getPrivKeyBytes();
        }
    }

    //Sapient generated method id: ${69bb2ef4-4d14-3a9d-bfd4-727fabbddc9f}
    @Test()
    public void getSecretBytesWhenHasPrivKeyNot() {
        /* Branches:
         * (hasPrivKey()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = spy(new ECKey(new BigInteger("0"), eCPointMock, true));
            doReturn(false).when(target).hasPrivKey();
            //Act Statement(s)
            byte[] result = target.getSecretBytes();
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            verify(target, atLeast(1)).hasPrivKey();
        }
    }

    //Sapient generated method id: ${dff58ab7-e6dc-3d37-b2b6-2e523a5c78cd}
    @Test()
    public void getEncryptedDataTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = new ECKey(new BigInteger("123456789"), eCPointMock, true);
            //Act Statement(s)
            EncryptedData result = target.getEncryptedData();
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${578644a2-37cc-3bfc-b841-d7e64f012978}
    @Test()
    public void toStringWhenNotIncludePrivate() throws Exception {
        /* Branches:
         * (includePrivate) : false  #  inside toString method
         * (creationTime != null) : false  #  inside toString method
         * (includePrivate) : false  #  inside toString method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = spy(new ECKey(new BigInteger("0"), eCPointMock, false));
            doReturn(false).when(target).isEncrypted();
            doReturn(false).when(target).isPubKeyOnly();
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("toString_moreObjects.ToStringHelper2"));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            verify(target, atLeast(1)).isEncrypted();
            verify(target, atLeast(1)).isPubKeyOnly();
        }
    }

    //Sapient generated method id: ${bfa400b6-269c-3f50-82d6-2f7c2ddf9df7}
    @Test()
    public void toStringWithPrivateWhenIncludePrivate() throws Exception {
        /* Branches:
         * (includePrivate) : true  #  inside toString method
         * (isEncrypted()) : true  #  inside toString method
         * (creationTime != null) : false  #  inside toString method
         * (includePrivate) : true  #  inside toString method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = spy(new ECKey(new BigInteger("0"), eCPointMock, false));
            doReturn(eCKeyMock).when(target).decrypt(aesKeyMock);
            doReturn("return_of_getPrivateKeyAsHex1").when(eCKeyMock).getPrivateKeyAsHex();
            doReturn("return_of_getPrivateKeyAsWiF1").when(eCKeyMock).getPrivateKeyAsWiF(networkMock);
            doReturn(true, false).when(target).isEncrypted();
            doReturn(false).when(target).isPubKeyOnly();
            //Act Statement(s)
            String result = target.toStringWithPrivate(aesKeyMock, networkMock);
            //Assert statement(s)
            assertThat(result, equalTo("toString_moreObjects.ToStringHelper2"));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            verify(target, times(2)).isEncrypted();
            verify(target, atLeast(1)).decrypt(aesKeyMock);
            verify(eCKeyMock, atLeast(1)).getPrivateKeyAsHex();
            verify(eCKeyMock, atLeast(1)).getPrivateKeyAsWiF(networkMock);
            verify(target, atLeast(1)).isPubKeyOnly();
        }
    }

    //Sapient generated method id: ${4faebd0e-ce55-326b-b1f6-8d86e7fe9cd3}
    @Test()
    public void toStringWithPrivateWhenCreationTimeIsNullAndIncludePrivate() throws Exception {
        /* Branches:
         * (includePrivate) : true  #  inside toString method
         * (isEncrypted()) : false  #  inside toString method
         * (creationTime != null) : false  #  inside toString method
         * (includePrivate) : true  #  inside toString method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            byteUtils.when(() -> ByteUtils.formatHex(byteArray)).thenReturn("myFormattedHex");
            ECKey target = spy(new ECKey(new BigInteger("123456789"), eCPointMock, true));
            doReturn(false).when(target).isEncrypted();
            doReturn(false).when(target).isPubKeyOnly();
            //Act Statement(s)
            String result = target.toStringWithPrivate(aesKeyMock, networkMock);
            //Assert statement(s)
            assertThat(result, equalTo("toString_moreObjects.ToStringHelper2"));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            byteUtils.verify(() -> ByteUtils.formatHex(byteArray), atLeast(1));
            verify(target, times(2)).isEncrypted();
            verify(target, atLeast(1)).isPubKeyOnly();
        }
    }

    //Sapient generated method id: ${dad9b6ef-c8da-31a8-9de5-425b2ba97f08}
    @Test()
    public void toStringWithPrivateWhenCaughtIllegalStateExceptionAndCreationTimeIsNullAndIncludePrivate() throws Exception {
        /* Branches:
         * (includePrivate) : true  #  inside toString method
         * (isEncrypted()) : true  #  inside toString method
         * (catch-exception (IllegalStateException)) : true  #  inside toString method
         * (creationTime != null) : false  #  inside toString method
         * (includePrivate) : true  #  inside toString method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            byteUtils.when(() -> ByteUtils.formatHex(byteArray)).thenReturn("010A");
            ECKey target = spy(new ECKey(new BigInteger("0"), eCPointMock, false));
            doReturn(eCKeyMock).when(target).decrypt(aesKeyMock);
            doReturn("075BCD15").when(eCKeyMock).getPrivateKeyAsHex();
            doReturn("5JZz8j5f8J7z9z1z7z5z").when(eCKeyMock).getPrivateKeyAsWiF(networkMock);
            doReturn(true, false).when(target).isEncrypted();
            doReturn(false).when(target).isPubKeyOnly();
            //Act Statement(s)
            String result = target.toStringWithPrivate(aesKeyMock, networkMock);
            //Assert statement(s)
            assertThat(result, equalTo("toString_moreObjects.ToStringHelper2"));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            byteUtils.verify(() -> ByteUtils.formatHex(byteArray), atLeast(1));
            verify(target, times(2)).isEncrypted();
            verify(target, atLeast(1)).decrypt(aesKeyMock);
            verify(eCKeyMock, atLeast(1)).getPrivateKeyAsHex();
            verify(eCKeyMock, atLeast(1)).getPrivateKeyAsWiF(networkMock);
            verify(target, atLeast(1)).isPubKeyOnly();
        }
    }

    //Sapient generated method id: ${7d577d7f-cbc6-3d88-bf24-a9520dc25b39}
    @Test()
    public void toStringWithPrivateWhenMessageIsNotNullAndCreationTimeIsNullAndIncludePrivate() throws Exception {
        /* Branches:
         * (includePrivate) : true  #  inside toString method
         * (isEncrypted()) : true  #  inside toString method
         * (catch-exception (Exception)) : true  #  inside toString method
         * (message != null) : true  #  inside toString method
         * (creationTime != null) : false  #  inside toString method
         * (includePrivate) : true  #  inside toString method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            byteUtils.when(() -> ByteUtils.formatHex(byteArray)).thenReturn("<value>");
            ECKey target = spy(new ECKey(new BigInteger("123456789"), eCPointMock, true));
            doReturn(eCKeyMock).when(target).decrypt(aesKeyMock);
            doReturn("<value>").when(eCKeyMock).getPrivateKeyAsHex();
            doReturn("<value>").when(eCKeyMock).getPrivateKeyAsWiF(networkMock);
            doReturn(true, false).when(target).isEncrypted();
            doReturn(false).when(target).isPubKeyOnly();
            //Act Statement(s)
            String result = target.toStringWithPrivate(aesKeyMock, networkMock);
            //Assert statement(s)
            assertThat(result, equalTo("toString_moreObjects.ToStringHelper2"));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            byteUtils.verify(() -> ByteUtils.formatHex(byteArray), atLeast(1));
            verify(target, times(2)).isEncrypted();
            verify(target, atLeast(1)).decrypt(aesKeyMock);
            verify(eCKeyMock, atLeast(1)).getPrivateKeyAsHex();
            verify(eCKeyMock, atLeast(1)).getPrivateKeyAsWiF(networkMock);
            verify(target, atLeast(1)).isPubKeyOnly();
        }
    }

    //Sapient generated method id: ${f53b019d-a53e-3c35-9234-a04367bc2912}
    @Test()
    public void toStringWithPrivateWhenMessageIsNullAndCreationTimeIsNullAndIncludePrivate() throws Exception {
        /* Branches:
         * (includePrivate) : true  #  inside toString method
         * (isEncrypted()) : true  #  inside toString method
         * (catch-exception (Exception)) : true  #  inside toString method
         * (message != null) : false  #  inside toString method
         * (creationTime != null) : false  #  inside toString method
         * (includePrivate) : true  #  inside toString method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            byteUtils.when(() -> ByteUtils.formatHex(byteArray)).thenReturn("String");
            ECKey target = spy(new ECKey(new BigInteger("123456789"), eCPointMock, true));
            doReturn(eCKeyMock).when(target).decrypt(aesKeyMock);
            doReturn("String").when(eCKeyMock).getPrivateKeyAsHex();
            doReturn("String").when(eCKeyMock).getPrivateKeyAsWiF(networkMock);
            doReturn(true, false).when(target).isEncrypted();
            doReturn(false).when(target).isPubKeyOnly();
            //Act Statement(s)
            String result = target.toStringWithPrivate(aesKeyMock, networkMock);
            //Assert statement(s)
            assertThat(result, equalTo("toString_moreObjects.ToStringHelper2"));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            byteUtils.verify(() -> ByteUtils.formatHex(byteArray), atLeast(1));
            verify(target, times(2)).isEncrypted();
            verify(target, atLeast(1)).decrypt(aesKeyMock);
            verify(eCKeyMock, atLeast(1)).getPrivateKeyAsHex();
            verify(eCKeyMock, atLeast(1)).getPrivateKeyAsWiF(networkMock);
            verify(target, atLeast(1)).isPubKeyOnly();
        }
    }

    //Sapient generated method id: ${7f603b49-10d4-30e2-9888-4c99700b69fd}
    @Test()
    public void toStringWithPrivate1Test() throws Exception {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = spy(new ECKey(new BigInteger("123456789"), eCPointMock, true));
            doReturn("return_of_toStringWithPrivate1").when(target).toStringWithPrivate(aesKeyMock, networkMock);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            //Act Statement(s)
            String result = target.toStringWithPrivate(aesKeyMock, networkParameters);
            //Assert statement(s)
            assertThat(result, equalTo("return_of_toStringWithPrivate1"));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            verify(target, atLeast(1)).toStringWithPrivate(aesKeyMock, networkMock);
        }
    }

    //Sapient generated method id: ${278f9d9e-3cb8-34cf-a499-0958a5f74297}
    @Test()
    public void getPrivateKeyAsHexTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            byteUtils.when(() -> ByteUtils.formatHex(byteArray)).thenReturn("");
            ECKey target = spy(new ECKey(new BigInteger("0"), eCPointMock, false));
            doReturn(byteArray).when(target).getPrivKeyBytes();
            //Act Statement(s)
            String result = target.getPrivateKeyAsHex();
            //Assert statement(s)
            assertThat(result, equalTo(""));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            byteUtils.verify(() -> ByteUtils.formatHex(byteArray), atLeast(1));
            verify(target, atLeast(1)).getPrivKeyBytes();
        }
    }

    //Sapient generated method id: ${3628b8b6-a397-351e-a16b-fb228296a785}
    @Test()
    public void getPublicKeyAsHexTest() {
        /**
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: pub
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            byteUtils.when(() -> ByteUtils.formatHex(byteArray)).thenReturn("String");
            ECKey target = new ECKey(new BigInteger("1234567890"), eCPointMock, true);
            //Act Statement(s)
            String result = target.getPublicKeyAsHex();
            //Assert statement(s)
            assertThat(result, equalTo("String"));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            byteUtils.verify(() -> ByteUtils.formatHex(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${5ba3f6bb-a3c2-3448-bce6-5b66b370b8e6}
    @Test()
    public void getPrivateKeyAsWiFTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DumpedPrivateKey dumpedPrivateKeyMock = mock(DumpedPrivateKey.class, "getPrivateKeyAsWiF_dumpedPrivateKey1");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = spy(new ECKey(new BigInteger("0"), eCPointMock, true));
            doReturn(dumpedPrivateKeyMock).when(target).getPrivateKeyEncoded(networkMock);
            //Act Statement(s)
            String result = target.getPrivateKeyAsWiF(networkMock);
            //Assert statement(s)
            assertThat(result, equalTo("getPrivateKeyAsWiF_dumpedPrivateKey1"));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            verify(target, atLeast(1)).getPrivateKeyEncoded(networkMock);
        }
    }

    //Sapient generated method id: ${22af13d9-1721-3197-940b-41a3b694654d}
    @Test()
    public void getPrivateKeyAsWiF1Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = spy(new ECKey(new BigInteger("0"), eCPointMock, false));
            doReturn("return_of_getPrivateKeyAsWiF1").when(target).getPrivateKeyAsWiF(networkMock);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            //Act Statement(s)
            String result = target.getPrivateKeyAsWiF(networkParameters);
            //Assert statement(s)
            assertThat(result, equalTo("return_of_getPrivateKeyAsWiF1"));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            verify(target, atLeast(1)).getPrivateKeyAsWiF(networkMock);
        }
    }

    //Sapient generated method id: ${6602eebf-c604-3dd3-9523-fef4c4c9c63e}
    @Test()
    public void formatKeyWithAddressWhenIncludePrivateKeys() throws Exception {
        /* Branches:
         * (outputScriptType != null) : true
         * (!isCompressed()) : true
         * (creationTime != null) : false
         * (comment != null) : true
         * (includePrivateKeys) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = spy(new ECKey(new BigInteger("0"), eCPointMock, false));
            doReturn(addressMock).when(target).toAddress(ScriptType.P2PKH, networkMock);
            doReturn(false).when(target).isCompressed();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(target).getPubKeyHash();
            doReturn("builderItem1").when(target).toStringWithPrivate(aesKeyMock, networkMock);
            StringBuilder stringBuilder = new StringBuilder();
            //Act Statement(s)
            target.formatKeyWithAddress(true, aesKeyMock, stringBuilder, networkMock, ScriptType.P2PKH, "builderItem1");
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            verify(target, atLeast(1)).toAddress(ScriptType.P2PKH, networkMock);
            verify(target, atLeast(1)).isCompressed();
            verify(target, atLeast(1)).getPubKeyHash();
            verify(target, atLeast(1)).toStringWithPrivate(aesKeyMock, networkMock);
        }
    }

    //Sapient generated method id: ${dc218c70-b931-3940-94a6-8902b834f344}
    @Test()
    public void formatKeyWithAddressWhenCreationTimeIsNullAndCommentIsNotNullAndIncludePrivateKeys() throws Exception {
        /* Branches:
         * (outputScriptType != null) : false
         * (isCompressed()) : true
         * (!isCompressed()) : true
         * (creationTime != null) : false
         * (comment != null) : true
         * (includePrivateKeys) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Address addressMock2 = mock(Address.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = spy(new ECKey(new BigInteger("0"), eCPointMock, false));
            doReturn(addressMock).when(target).toAddress(ScriptType.P2PKH, networkMock);
            doReturn(addressMock2).when(target).toAddress(ScriptType.P2WPKH, networkMock);
            doReturn(true, false).when(target).isCompressed();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(target).getPubKeyHash();
            doReturn("builderItem1").when(target).toStringWithPrivate(aesKeyMock, networkMock);
            StringBuilder stringBuilder = new StringBuilder();
            ScriptType scriptType = null;
            //Act Statement(s)
            target.formatKeyWithAddress(true, aesKeyMock, stringBuilder, networkMock, scriptType, "builderItem1");
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            verify(target, atLeast(1)).toAddress(ScriptType.P2PKH, networkMock);
            verify(target, times(2)).isCompressed();
            verify(target, atLeast(1)).toAddress(ScriptType.P2WPKH, networkMock);
            verify(target, atLeast(1)).getPubKeyHash();
            verify(target, atLeast(1)).toStringWithPrivate(aesKeyMock, networkMock);
        }
    }

    //Sapient generated method id: ${259a939d-4f14-3519-95b7-a716f1a53ce8}
    @Test()
    public void formatKeyWithAddress1Test() throws Exception {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock = mock(NetworkParameters.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock).when(paramsMock).network();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = spy(new ECKey(new BigInteger("0"), eCPointMock, false));
            StringBuilder stringBuilder = new StringBuilder();
            doNothing().when(target).formatKeyWithAddress(false, aesKeyMock, stringBuilder, networkMock, ScriptType.P2PKH, "comment1");
            //Act Statement(s)
            target.formatKeyWithAddress(false, aesKeyMock, stringBuilder, paramsMock, ScriptType.P2PKH, "comment1");
            //Assert statement(s)
            verify(paramsMock, atLeast(1)).network();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            verify(target, atLeast(1)).formatKeyWithAddress(false, aesKeyMock, stringBuilder, networkMock, ScriptType.P2PKH, "comment1");
        }
    }
}
