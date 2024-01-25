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

import org.junit.Ignore;

import static org.mockito.Mockito.doThrow;

public class ECKeySapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Address addressMock = mock(Address.class);

    private final AesKey aesKeyMock = mock(AesKey.class);

    private final ECKey.ECDSASignature eCKeyECDSASignatureMock = mock(ECKey.ECDSASignature.class);

    private final ECKey eCKeyMock = mock(ECKey.class);

    private final ECPoint eCPointMock = mock(ECPoint.class);

    private final EncryptedData encryptedDataMock = mock(EncryptedData.class);

    private final ECKey encryptedKeyMock = mock(ECKey.class);

    private final KeyCrypter keyCrypterMock = mock(KeyCrypter.class);

    private final Network networkMock = mock(Network.class, "null");

    private final ECKey originalKeyMock = mock(ECKey.class);

    private final VarInt varIntMock = mock(VarInt.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    private final NetworkParameters paramsMock = mock(NetworkParameters.class);

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    private final LazyECPoint pubMock = mock(LazyECPoint.class, "pub");

    private final ECPoint eCPointMock2 = mock(ECPoint.class);

    private final NetworkParameters networkParametersMock = mock(NetworkParameters.class);

    //Sapient generated method id: ${6cb3f375-df6a-3e32-b10e-e8b296f61c57}
    @Test()
    public void fromASN1WhenEncodingGreaterThan4() throws IOException {
        /* Branches:
         * (decoder.readObject() == null) : true  #  inside extractKeyFromASN1 method
         * (seq.size() == 4) : true  #  inside extractKeyFromASN1 method
         * (pubkey.getTagNo() == 1) : true  #  inside extractKeyFromASN1 method
         * (pubkey.getTagClass() == BERTags.CONTEXT_SPECIFIC) : true  #  inside extractKeyFromASN1 method
         * (pubbits.length == 33) : false  #  inside extractKeyFromASN1 method
         * (pubbits.length == 65) : true  #  inside extractKeyFromASN1 method
         * (encoding >= 2) : true  #  inside extractKeyFromASN1 method
         * (encoding <= 4) : false  #  inside extractKeyFromASN1 method
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            thrown.expect(NullPointerException.class);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            ECKey.fromASN1(byteArray);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${83fd36fb-72ab-3eb0-ad82-89eb2c62a29c}
    @Test()
    public void fromASN1WhenPubbitsLengthNotEquals65AndEncodingGreaterThanOrEqualsTo2AndEncodingLessThanOrEqualsTo43() throws IOException {
        /* Branches:
         * (decoder.readObject() == null) : true  #  inside extractKeyFromASN1 method
         * (seq.size() == 4) : true  #  inside extractKeyFromASN1 method
         * (pubkey.getTagNo() == 1) : false  #  inside extractKeyFromASN1 method
         * (pubkey.getTagClass() == BERTags.CONTEXT_SPECIFIC) : false  #  inside extractKeyFromASN1 method
         * (pubbits.length == 33) : false  #  inside extractKeyFromASN1 method
         * (pubbits.length == 65) : false  #  inside extractKeyFromASN1 method
         * (encoding >= 2) : true  #  inside extractKeyFromASN1 method
         * (encoding <= 4) : true  #  inside extractKeyFromASN1 method
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            thrown.expect(NullPointerException.class);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            ECKey.fromASN1(byteArray);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${b4e52286-aca0-37a7-8870-60677dfde40d}
    @Test()
    public void fromASN1WhenPubbitsLengthEquals65AndEncodingGreaterThanOrEqualsTo2AndEncodingLessThanOrEqualsTo43() throws IOException {
        /* Branches:
         * (decoder.readObject() == null) : true  #  inside extractKeyFromASN1 method
         * (seq.size() == 4) : false  #  inside extractKeyFromASN1 method
         * (pubkey.getTagNo() == 1) : true  #  inside extractKeyFromASN1 method
         * (pubkey.getTagClass() == BERTags.CONTEXT_SPECIFIC) : true  #  inside extractKeyFromASN1 method
         * (pubbits.length == 33) : false  #  inside extractKeyFromASN1 method
         * (pubbits.length == 65) : true  #  inside extractKeyFromASN1 method
         * (encoding >= 2) : true  #  inside extractKeyFromASN1 method
         * (encoding <= 4) : true  #  inside extractKeyFromASN1 method
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            thrown.expect(NullPointerException.class);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            ECKey.fromASN1(byteArray);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${25d09108-fbe3-37ad-865b-9bdf9f0e1526}
    @Test()
    public void fromPrivateTest() {
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class, CALLS_REAL_METHODS)) {
            eCKey.when(() -> ECKey.fromPrivate(new BigInteger("0"), true)).thenReturn(eCKeyMock);
            //Act Statement(s)
            ECKey result = ECKey.fromPrivate(new BigInteger("0"));
            //Assert statement(s)
            assertThat(result, equalTo(eCKeyMock));
            eCKey.verify(() -> ECKey.fromPrivate(new BigInteger("0"), true), atLeast(1));
        }
    }

    //Sapient generated method id: ${ba95b407-9a1b-33e0-af12-b971dd90328c}
    @Ignore()
    @Test()
    public void fromPrivate1WhenDefaultBranchAndDefaultBranch() {
        /* Branches:
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : true  #  inside <init> method
         * (branch expression (line 197)) : true  #  inside <init> method
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<ECKey> eCKey = mockStatic(ECKey.class, CALLS_REAL_METHODS)) {
            eCKey.when(() -> ECKey.publicPointFromPrivate(new BigInteger("0"))).thenReturn(eCPointMock);
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ECKey result = ECKey.fromPrivate(new BigInteger("0"), false);
            LazyECPoint lazyECPoint = new LazyECPoint(eCPointMock, false);
            ECKey eCKey2 = new ECKey(new BigInteger("0"), lazyECPoint);
            //Assert statement(s)
            assertThat(result, equalTo(eCKey2));
            eCKey.verify(() -> ECKey.publicPointFromPrivate(new BigInteger("0")), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(1));
        }
    }

    //Sapient generated method id: ${62e1b3df-ca5b-3155-9a9c-359f1632d1f7}
    @Ignore()
    @Test()
    public void fromPrivate1WhenDefaultBranchAndDefaultBranchAndDefaultBranchAndDefaultBranch2() {
        /* Branches:
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : false  #  inside <init> method
         * (branch expression (line 197)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "ECPoint");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS);
             MockedStatic<ECKey> eCKey = mockStatic(ECKey.class, CALLS_REAL_METHODS)) {
            eCKey.when(() -> ECKey.publicPointFromPrivate(new BigInteger("123456789"))).thenReturn(eCPointMock);
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ECKey result = ECKey.fromPrivate(new BigInteger("123456789"), true);
            LazyECPoint lazyECPoint = new LazyECPoint(eCPointMock, true);
            ECKey eCKey2 = new ECKey(new BigInteger("123456789"), lazyECPoint);
            //Assert statement(s)
            assertThat(result, equalTo(eCKey2));
            eCKey.verify(() -> ECKey.publicPointFromPrivate(new BigInteger("123456789")), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${e2d4d2cf-aeac-347b-979c-4a79a20de215}
    @Ignore()
    @Test()
    public void fromPrivate1WhenDefaultBranchAndDefaultBranchAndDefaultBranchAndDefaultBranch3() {
        /* Branches:
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : false  #  inside <init> method
         * (branch expression (line 197)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "ECPoint");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS);
             MockedStatic<ECKey> eCKey = mockStatic(ECKey.class, CALLS_REAL_METHODS)) {
            eCKey.when(() -> ECKey.publicPointFromPrivate(new BigInteger("123456789"))).thenReturn(eCPointMock);
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ECKey result = ECKey.fromPrivate(new BigInteger("123456789"), true);
            LazyECPoint lazyECPoint = new LazyECPoint(eCPointMock, true);
            ECKey eCKey2 = new ECKey(new BigInteger("123456789"), lazyECPoint);
            //Assert statement(s)
            assertThat(result, equalTo(eCKey2));
            eCKey.verify(() -> ECKey.publicPointFromPrivate(new BigInteger("123456789")), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${342c426c-2e9b-3199-b6d2-4312fd897de3}
    @Test()
    public void fromPrivate2Test() {
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class, CALLS_REAL_METHODS)) {
            eCKey.when(() -> ECKey.fromPrivate(new BigInteger("0"))).thenReturn(eCKeyMock);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            ECKey result = ECKey.fromPrivate(byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(eCKeyMock));
            eCKey.verify(() -> ECKey.fromPrivate(new BigInteger("0")), atLeast(1));
        }
    }

    //Sapient generated method id: ${832bcdf8-a61c-3d7f-9fbb-cfb6d120e396}
    @Test()
    public void fromPrivate3Test() {
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class, CALLS_REAL_METHODS)) {
            eCKey.when(() -> ECKey.fromPrivate(new BigInteger("0"), false)).thenReturn(eCKeyMock);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            ECKey result = ECKey.fromPrivate(byteArray, false);
            //Assert statement(s)
            assertThat(result, equalTo(eCKeyMock));
            eCKey.verify(() -> ECKey.fromPrivate(new BigInteger("0"), false), atLeast(1));
        }
    }

    //Sapient generated method id: ${87f54e45-53f5-367e-8d52-94be8e6bc5ba}
    @Ignore()
    @Test()
    public void fromPrivateAndPrecalculatedPublicWhenDefaultBranchAndDefaultBranch() {
        /* Branches:
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : true  #  inside <init> method
         * (branch expression (line 197)) : true  #  inside <init> method
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ECKey result = ECKey.fromPrivateAndPrecalculatedPublic(new BigInteger("0"), eCPointMock, false);
            ECKey eCKey = new ECKey(new BigInteger("0"), eCPointMock, false);
            //Assert statement(s)
            assertThat(result, equalTo(eCKey));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(1));
        }
    }

    //Sapient generated method id: ${fdb35aa2-168f-3fcf-a4d6-4b4bbb9f88ee}
    @Ignore()
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
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ECKey result = ECKey.fromPrivateAndPrecalculatedPublic(new BigInteger("0"), eCPointMock, false);
            ECKey eCKey = new ECKey(new BigInteger("0"), eCPointMock, false);
            //Assert statement(s)
            assertThat(result, equalTo(eCKey));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${4ab28b48-b436-312f-8a62-b5ed8de7cbdf}
    @Ignore()
    @Test()
    public void fromPrivateAndPrecalculatedPublicWhenDefaultBranchAndDefaultBranchAndDefaultBranchAndDefaultBranch3() {
        /* Branches:
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : false  #  inside <init> method
         * (branch expression (line 197)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "123");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ECKey result = ECKey.fromPrivateAndPrecalculatedPublic(new BigInteger("123456789"), eCPointMock, true);
            ECKey eCKey = new ECKey(new BigInteger("123456789"), eCPointMock, true);
            //Assert statement(s)
            assertThat(result, equalTo(eCKey));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${60a1f331-fed0-3fe3-8190-ef1463bdf489}
    @Ignore()
    @Test()
    public void fromPrivateAndPrecalculatedPublic1WhenDefaultBranchAndDefaultBranch() {
        /* Branches:
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : true  #  inside <init> method
         * (branch expression (line 197)) : true  #  inside <init> method
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{};
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
        }
    }

    //Sapient generated method id: ${91d51680-b184-3b70-8a0c-1a4a2e75d53a}
    @Ignore()
    @Test()
    public void fromPrivateAndPrecalculatedPublic1WhenDefaultBranchAndDefaultBranchAndDefaultBranchAndDefaultBranch2() {
        /* Branches:
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : false  #  inside <init> method
         * (branch expression (line 197)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{};
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
        }
    }

    //Sapient generated method id: ${a00fc475-1183-3e87-b9f1-e69e5497ed1e}
    @Ignore()
    @Test()
    public void fromPublicOnlyWhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 190)) : false  #  inside <init> method
         */

        //Act Statement(s)
        ECKey result = ECKey.fromPublicOnly(eCPointMock, false);
        ECKey eCKey = new ECKey((BigInteger) null, eCPointMock, false);

        //Assert statement(s)
        assertThat(result, equalTo(eCKey));
    }

    //Sapient generated method id: ${1878f202-ec74-3894-9150-8f5fb9790081}
    @Ignore()
    @Test()
    public void fromPublicOnly1WhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 190)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};

        //Act Statement(s)
        ECKey result = ECKey.fromPublicOnly(byteArray);
        X9ECParameters x9ECParameters = CustomNamedCurves.getByName("secp256k1");
        ECCurve eCCurve = x9ECParameters.getCurve();
        ECPoint eCPoint = x9ECParameters.getG();
        ECDomainParameters eCDomainParameters = new ECDomainParameters(eCCurve, eCPoint, new BigInteger("115792089237316195423570985008687907852837564279074904382605163141518161494337"), new BigInteger("1"));
        ECCurve eCCurve2 = eCDomainParameters.getCurve();
        LazyECPoint lazyECPoint = new LazyECPoint(eCCurve2, byteArray);
        ECKey eCKey = new ECKey((BigInteger) null, lazyECPoint);

        //Assert statement(s)
        assertThat(result, equalTo(eCKey));
    }

    //Sapient generated method id: ${752bef77-7d79-374f-9d88-5ccff834f939}
    @Test()
    public void fromPublicOnly2Test() {
        //Arrange Statement(s)
        ECKey keyMock = mock(ECKey.class);
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class, CALLS_REAL_METHODS)) {
            doReturn(eCPointMock).when(keyMock).getPubKeyPoint();
            doReturn(false).when(keyMock).isCompressed();
            eCKey.when(() -> ECKey.fromPublicOnly(eCPointMock, false)).thenReturn(eCKeyMock);
            //Act Statement(s)
            ECKey result = ECKey.fromPublicOnly(keyMock);
            //Assert statement(s)
            assertThat(result, equalTo(eCKeyMock));
            verify(keyMock, atLeast(1)).getPubKeyPoint();
            verify(keyMock, atLeast(1)).isCompressed();
            eCKey.verify(() -> ECKey.fromPublicOnly(eCPointMock, false), atLeast(1));
        }
    }

    //Sapient generated method id: ${8c8247a0-01a6-3727-bbc5-78d3109890bb}
    @Ignore()
    @Test()
    public void decompressWhenPubNotIsCompressed() {
        /* Branches:
         * (!pub.isCompressed()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = new ECKey(new BigInteger("0"), eCPointMock, false);
            //Act Statement(s)
            ECKey result = target.decompress();
            //Assert statement(s)
            assertThat(result, equalTo(target));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${2f36375e-8b75-30ef-88ee-71192cffb754}
    @Ignore()
    @Test()
    public void decompressWhenDefaultBranchAndDefaultBranch() {
        /* Branches:
         * (!pub.isCompressed()) : false
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : true  #  inside <init> method
         * (branch expression (line 197)) : true  #  inside <init> method
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = new ECKey(new BigInteger("0"), eCPointMock, false);
            //Act Statement(s)
            ECKey result = target.decompress();
            //Assert statement(s)
            assertThat(result, equalTo(target));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(1));
        }
    }

    //Sapient generated method id: ${456dfef5-d5f2-37de-8aaf-1806e54e458c}
    @Ignore()
    @Test()
    public void decompressWhenPubIsCompressedAndDefaultBranchAndDefaultBranchAndDefaultBranchAndDefaultBranch() {
        /* Branches:
         * (!pub.isCompressed()) : false
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : false  #  inside <init> method
         * (branch expression (line 197)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "1234567890");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = new ECKey(new BigInteger("1234567890"), eCPointMock, true);
            doReturn(true).when(pubMock).isCompressed();
            doReturn(eCPointMock2).when(pubMock).get();
            //Act Statement(s)
            ECKey result = target.decompress();
            LazyECPoint lazyECPoint = new LazyECPoint(eCPointMock2, false);
            ECKey eCKey = new ECKey(new BigInteger("1234567890"), lazyECPoint);
            //Assert statement(s)
            assertThat(result, equalTo(eCKey));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(2));
            verify(pubMock, atLeast(1)).isCompressed();
            verify(pubMock, atLeast(1)).get();
        }
    }

    //Sapient generated method id: ${add836b3-1be9-3d45-a181-20a281dbc13e}
    @Test()
    public void fromEncryptedTest() {
        //Arrange Statement(s)
        EncryptedData encryptedDataMock = mock(EncryptedData.class);
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            eCKey.when(() -> ECKey.fromPublicOnly(byteArray)).thenReturn(eCKeyMock);
            //Act Statement(s)
            ECKey result = ECKey.fromEncrypted(encryptedDataMock, keyCrypterMock, byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(eCKeyMock));
            eCKey.verify(() -> ECKey.fromPublicOnly(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${9a919234-6f53-32dd-8d1d-ce5d51238523}
    @Test()
    public void isPubKeyOnlyWhenPrivIsNull() {
        /* Branches:
         * (priv == null) : true
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "null");
        ECKey target = new ECKey((BigInteger) null, eCPointMock, false);

        //Act Statement(s)
        boolean result = target.isPubKeyOnly();

        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${9b824f02-6df8-3ae7-b5ad-9f74d523320c}
    @Ignore()
    @Test()
    public void isPubKeyOnlyWhenPrivIsNotNull() {
        /* Branches:
         * (priv == null) : false
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "ECPoint{curve=org.bitcoinj.core.ECKey$1@7f560810, x=55066263022277343669578718895168534326250603453777594175500187360389116729240, y=32670510020758816978083085130507043184471273380659243275938904335757337482424}");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = new ECKey(new BigInteger("1"), eCPointMock, true);
            //Act Statement(s)
            boolean result = target.isPubKeyOnly();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
        }
    }

    //Sapient generated method id: ${2b54b47a-1c22-3f30-a104-79b873fb49e9}
    @Ignore()
    @Test()
    public void hasPrivKeyWhenPrivIsNotNull() {
        /* Branches:
         * (priv != null) : true
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "{}");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = new ECKey(new BigInteger("1234567890"), eCPointMock, true);
            //Act Statement(s)
            boolean result = target.hasPrivKey();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${b92815fd-8ef3-37e2-a7e9-f79dd5b10287}
    @Test()
    public void hasPrivKeyWhenPrivIsNull() {
        /* Branches:
         * (priv != null) : false
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "null");
        ECKey target = new ECKey((BigInteger) null, eCPointMock, false);

        //Act Statement(s)
        boolean result = target.hasPrivKey();

        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${9316d872-2d9f-3a68-b8d5-443bdba3ad5c}
    @Ignore()
    @Test()
    public void isWatchingWhenIsEncryptedNot() {
        /* Branches:
         * (isPubKeyOnly()) : true
         * (!isEncrypted()) : true
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "1");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = spy(new ECKey(new BigInteger("123456789"), eCPointMock, true));
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
    @Ignore()
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
        ECPoint eCPointMock = mock(ECPoint.class, "<value>");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = spy(new ECKey(new BigInteger("1"), eCPointMock, true));
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
    @Ignore()
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
        ECPoint eCPointMock = mock(ECPoint.class, "d5a5fcf8b9d5c5c9c9f3c8f8c1f5b7f5d3d3b7b7f7f7f7f7f7f7f7f7f7f7f7f");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = spy(new ECKey(new BigInteger("1"), eCPointMock, true));
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(target).getPrivKeyBytes();
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(pubMock).getEncoded();
            //Act Statement(s)
            byte[] result = target.toASN1();
            byte[] byteResultArray = new byte[]{(byte) 48, (byte) -127, (byte) -23, (byte) 2, (byte) 1, (byte) 1, (byte) -96, (byte) -127, (byte) -29, (byte) 48, (byte) -127, (byte) -32, (byte) 2, (byte) 1, (byte) 1, (byte) 48, (byte) 44, (byte) 6, (byte) 7, (byte) 42, (byte) -122, (byte) 72, (byte) -50, (byte) 61, (byte) 1, (byte) 1, (byte) 2, (byte) 33, (byte) 0, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -2, (byte) -1, (byte) -1, (byte) -4, (byte) 47, (byte) 48, (byte) 68, (byte) 4, (byte) 32, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 4, (byte) 32, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 7, (byte) 4, (byte) 65, (byte) 4, (byte) 121, (byte) -66, (byte) 102, (byte) 126, (byte) -7, (byte) -36, (byte) -69, (byte) -84, (byte) 85, (byte) -96, (byte) 98, (byte) -107, (byte) -50, (byte) -121, (byte) 11, (byte) 7, (byte) 2, (byte) -101, (byte) -4, (byte) -37, (byte) 45, (byte) -50, (byte) 40, (byte) -39, (byte) 89, (byte) -14, (byte) -127, (byte) 91, (byte) 22, (byte) -8, (byte) 23, (byte) -104, (byte) 72, (byte) 58, (byte) -38, (byte) 119, (byte) 38, (byte) -93, (byte) -60, (byte) 101, (byte) 93, (byte) -92, (byte) -5, (byte) -4, (byte) 14, (byte) 17, (byte) 8, (byte) -88, (byte) -3, (byte) 23, (byte) -76, (byte) 72, (byte) -90, (byte) -123, (byte) 84, (byte) 25, (byte) -100, (byte) 71, (byte) -48, (byte) -113, (byte) -5, (byte) 16, (byte) -44, (byte) -72, (byte) 2, (byte) 33, (byte) 0, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -2, (byte) -70, (byte) -82, (byte) -36, (byte) -26, (byte) -81, (byte) 72, (byte) -96, (byte) 59, (byte) -65, (byte) -46, (byte) 94, (byte) -116, (byte) -48, (byte) 54, (byte) 65, (byte) 65, (byte) 2, (byte) 1, (byte) 1};
            //Assert statement(s)
            assertThat(result, equalTo(byteResultArray));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            verify(target, atLeast(1)).getPrivKeyBytes();
            verify(pubMock, atLeast(1)).getEncoded();
        }
    }

    //Sapient generated method id: ${da1fd4f1-0d1c-3720-a478-048f2f9ddb75}
    @Ignore()
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
        ECPoint eCPointMock = mock(ECPoint.class, "ECPoint{x=55066263022277343669578718895168534326250603453777594175500187360389116729240, y=32670510020758816978083085130507043184471273380659243275938904335757337482424}");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = spy(new ECKey(new BigInteger("123456789"), eCPointMock, true));
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(target).getPrivKeyBytes();
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(pubMock).getEncoded();
            thrown.expect(RuntimeException.class);
            thrown.expectCause(isA(IOException.class));
            //Act Statement(s)
            target.toASN1();
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            verify(target, atLeast(1)).getPrivKeyBytes();
            verify(pubMock, atLeast(1)).getEncoded();
        }
    }

    //Sapient generated method id: ${1532c266-8e3a-3cd9-a0fe-36db2b16e014}
    @Test()
    public void publicKeyFromPrivateTest() {
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class, CALLS_REAL_METHODS)) {
            eCKey.when(() -> ECKey.publicPointFromPrivate(new BigInteger("0"))).thenReturn(eCPointMock);
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(eCPointMock).getEncoded(false);
            //Act Statement(s)
            byte[] result = ECKey.publicKeyFromPrivate(new BigInteger("0"), false);
            //Assert statement(s)
            assertThat(result, equalTo(byteArray));
            eCKey.verify(() -> ECKey.publicPointFromPrivate(new BigInteger("0")), atLeast(1));
            verify(eCPointMock, atLeast(1)).getEncoded(false);
        }
    }

    //Sapient generated method id: ${ae547fea-0796-3a4c-862c-4b73aced04ad}
    @Ignore()
    @Test()
    public void publicPointFromPrivateWhenPrivKeyBitLengthGreaterThanCURVEGetNBitLength() {
        /* Branches:
         * (privKey.bitLength() > CURVE.getN().bitLength()) : true
         */

        //Act Statement(s)
        ECPoint result = ECKey.publicPointFromPrivate(new BigInteger("1234567890123456789012345678901234567890123456789012345678901234567890"));
        FixedPointCombMultiplier fixedPointCombMultiplier = new FixedPointCombMultiplier();
        X9ECParameters x9ECParameters = CustomNamedCurves.getByName("secp256k1");
        ECCurve eCCurve = x9ECParameters.getCurve();
        ECPoint eCPoint2 = x9ECParameters.getG();
        ECDomainParameters eCDomainParameters = new ECDomainParameters(eCCurve, eCPoint2, new BigInteger("115792089237316195423570985008687907852837564279074904382605163141518161494337"), new BigInteger("1"));
        ECPoint eCPoint3 = eCDomainParameters.getG();
        ECPoint eCPoint = fixedPointCombMultiplier.multiply(eCPoint3, new BigInteger("1234567890123456789012345678901234567890123456789012345678901234567890"));

        //Assert statement(s)
        assertThat(result, equalTo(eCPoint));
    }

    //Sapient generated method id: ${e86c0be8-0e28-378f-b530-a9805d47f5bd}
    @Ignore()
    @Test()
    public void getPubKeyHashWhenPubKeyHashIsNull() {
        /* Branches:
         * (pubKeyHash == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "03f0f5c4ee4c8f957a14b0c1dabf7b6e1f3e3eb9e15d3d643e6c3f27f8d5f8c7d5c");
        try (MockedStatic<CryptoUtils> cryptoUtils = mockStatic(CryptoUtils.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{(byte) -76, (byte) 114, (byte) -94, (byte) 102, (byte) -48, (byte) -67, (byte) -119, (byte) -63, (byte) 55, (byte) 6, (byte) -92, (byte) 19, (byte) 44, (byte) -49, (byte) -79, (byte) 111, (byte) 124, (byte) 59, (byte) -97, (byte) -53};
            byte[] byteArray2 = new byte[]{};
            cryptoUtils.when(() -> CryptoUtils.sha256hash160(byteArray2)).thenReturn(byteArray);
            ECKey target = new ECKey(new BigInteger("1"), eCPointMock, true);
            doReturn(byteArray2).when(pubMock).getEncoded();
            //Act Statement(s)
            byte[] result = target.getPubKeyHash();
            //Assert statement(s)
            assertThat(result, equalTo(byteArray));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            cryptoUtils.verify(() -> CryptoUtils.sha256hash160(byteArray2), atLeast(1));
            verify(pubMock, atLeast(1)).getEncoded();
        }
    }

    //Sapient generated method id: ${706c1e2f-f6b9-34e6-b206-31e5ff2ddddd}
    @Ignore()
    @Test()
    public void getPubKeyTest() {
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "123");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = new ECKey(new BigInteger("123456789"), eCPointMock, true);
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(pubMock).getEncoded();
            //Act Statement(s)
            byte[] result = target.getPubKey();
            //Assert statement(s)
            assertThat(result, equalTo(byteArray));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            verify(pubMock, atLeast(1)).getEncoded();
        }
    }

    //Sapient generated method id: ${0ae77e04-344f-38ef-aeef-01a98cbbaeb4}
    @Ignore()
    @Test()
    public void getPubKeyPointTest() {
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "0");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = new ECKey(new BigInteger("1234567890"), eCPointMock, true);
            doReturn(eCPointMock2).when(pubMock).get();
            //Act Statement(s)
            ECPoint result = target.getPubKeyPoint();
            //Assert statement(s)
            assertThat(result, equalTo(eCPointMock2));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            verify(pubMock, atLeast(1)).get();
        }
    }

    //Sapient generated method id: ${0156783b-477f-3459-ae43-145d2c10f0e7}
    @Test()
    public void getPrivKeyWhenPrivIsNullThrowsECKeyMissingPrivateKeyException() {
        /* Branches:
         * (priv == null) : true
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "<value>");
        ECKey target = new ECKey((BigInteger) null, eCPointMock, false);
        thrown.expect(ECKey.MissingPrivateKeyException.class);

        //Act Statement(s)
        target.getPrivKey();
    }

    //Sapient generated method id: ${d1a875f3-108f-30e2-a6c3-42cefedbe71c}
    @Ignore()
    @Test()
    public void getPrivKeyWhenPrivIsNotNull() {
        /* Branches:
         * (priv == null) : false
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "0");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = new ECKey(new BigInteger("1"), eCPointMock, false);
            //Act Statement(s)
            BigInteger result = target.getPrivKey();
            //Assert statement(s)
            assertThat(result, equalTo(new BigInteger("1")));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
        }
    }

    //Sapient generated method id: ${c0cf8d11-c721-35e9-bb4f-f7961a9fec2c}
    @Ignore()
    @Test()
    public void isCompressedWhenPubIsCompressed() {
        /* Branches:
         * (pub.isCompressed()) : true
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "INF");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = new ECKey(new BigInteger("0"), eCPointMock, false);
            //Act Statement(s)
            boolean result = target.isCompressed();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(1));
        }
    }

    //Sapient generated method id: ${d083b59d-9fea-304f-ab39-7e2a9fc04539}
    @Ignore()
    @Test()
    public void isCompressedWhenPubNotIsCompressed() {
        /* Branches:
         * (pub.isCompressed()) : false
         */
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = new ECKey(new BigInteger("0"), eCPointMock, false);
            //Act Statement(s)
            boolean result = target.isCompressed();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(1));
        }
    }

    //Sapient generated method id: ${f915d923-84f3-37e4-9953-330fcf98de7b}
    @Ignore()
    @Test()
    public void toAddressWhenScriptTypeEqualsScriptTypeP2PKH() {
        /* Branches:
         * (scriptType == ScriptType.P2PKH) : true
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "MAINNET");
        ECPoint eCPointMock = mock(ECPoint.class, "");
        try (MockedStatic<LegacyAddress> legacyAddress = mockStatic(LegacyAddress.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            LegacyAddress legacyAddress2 = LegacyAddress.fromKey(networkParametersMock, eCKeyMock);
            byte[] byteArray = new byte[]{};
            legacyAddress.when(() -> LegacyAddress.fromPubKeyHash(networkMock, byteArray)).thenReturn(legacyAddress2);
            ECKey target = spy(new ECKey(new BigInteger("123456789"), eCPointMock, true));
            doReturn(byteArray).when(target).getPubKeyHash();
            //Act Statement(s)
            Address result = target.toAddress(ScriptType.P2PKH, networkMock);
            //Assert statement(s)
            assertThat(result, equalTo(legacyAddress2));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            legacyAddress.verify(() -> LegacyAddress.fromPubKeyHash(networkMock, byteArray), atLeast(1));
            verify(target, atLeast(1)).getPubKeyHash();
        }
    }

    //Sapient generated method id: ${3eb0caaf-5f19-3ef7-8fad-29562e68b8ab}
    @Ignore()
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
        Network networkMock = mock(Network.class, "Network.MAINNET");
        ECPoint eCPointMock = mock(ECPoint.class, "<valid ECPoint value>");
        try (MockedStatic<SegwitAddress> segwitAddress = mockStatic(SegwitAddress.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            SegwitAddress segwitAddress2 = SegwitAddress.fromKey(networkParametersMock, eCKeyMock);
            byte[] byteArray = new byte[]{};
            segwitAddress.when(() -> SegwitAddress.fromHash(networkMock, byteArray)).thenReturn(segwitAddress2);
            ECKey target = spy(new ECKey(new BigInteger("1"), eCPointMock, true));
            doReturn(false).when(target).isCompressed();
            doReturn(byteArray).when(target).getPubKeyHash();
            //Act Statement(s)
            Address result = target.toAddress(ScriptType.P2WPKH, networkMock);
            //Assert statement(s)
            assertThat(result, equalTo(segwitAddress2));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(2));
            segwitAddress.verify(() -> SegwitAddress.fromHash(networkMock, byteArray), atLeast(1));
            verify(target, atLeast(1)).isCompressed();
            verify(target, atLeast(1)).getPubKeyHash();
        }
    }

    //Sapient generated method id: ${a3447d4f-e794-3912-8845-7cd8f8e56c5e}
    @Ignore()
    @Test()
    public void toAddressWhenScriptTypeNotEqualsScriptTypeP2WPKHThrowsIllegalArgumentException() {
        /* Branches:
         * (scriptType == ScriptType.P2PKH) : false
         * (scriptType == ScriptType.P2WPKH) : false
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "1");
        Network networkMock = mock(Network.class, "MAINNET");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = new ECKey(new BigInteger("1234567890"), eCPointMock, true);
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
    @Ignore()
    @Test()
    public void signTest() throws KeyCrypterException {
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "1");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = spy(new ECKey(new BigInteger("1234567890"), eCPointMock, true));
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
    @Ignore()
    @Test()
    public void sign1WhenPrivIsNullThrowsECKeyMissingPrivateKeyException() throws KeyCrypterException {
        /* Branches:
         * (crypter != null) : false
         * (priv == null) : true
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "55066263022277343669578718895168534326250603453777594175500187360389116729240");
        ECKey target = new ECKey((BigInteger) null, eCPointMock, true);
        thrown.expect(ECKey.MissingPrivateKeyException.class);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        byte[] byteArray = new byte[]{};
        AesKey aesKey = new AesKey(byteArray);

        //Act Statement(s)
        target.sign(sha256Hash, aesKey);
    }

    //Sapient generated method id: ${778deaba-2af1-3e72-9c9b-5a043bff9924}
    @Ignore()
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
        ECPoint eCPointMock = mock(ECPoint.class, "1");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = spy(new ECKey(new BigInteger("1"), eCPointMock, true));
            doReturn(eCKeyECDSASignatureMock).when(target).doSign((Sha256Hash) any(), eq(new BigInteger("1")));
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            byte[] byteArray = new byte[]{};
            AesKey aesKey = new AesKey(byteArray);
            //Act Statement(s)
            ECKey.ECDSASignature result = target.sign(sha256Hash, aesKey);
            //Assert statement(s)
            assertThat(result, equalTo(eCKeyECDSASignatureMock));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            verify(target, atLeast(1)).doSign((Sha256Hash) any(), eq(new BigInteger("1")));
        }
    }

    //Sapient generated method id: ${9eab79e6-9540-35a1-ab30-7dac56bc7877}
    @Ignore()
    @Test()
    public void doSignTest() {
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "0x0123456789abcdef0123456789abcdef0123456789abcdef0123456789abcdef0123456789abcdef0123456789abcdef");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = new ECKey(new BigInteger("9876543210"), eCPointMock, true);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            //Act Statement(s)
            ECKey.ECDSASignature result = target.doSign(sha256Hash, new BigInteger("1234567890"));
            ECKey.ECDSASignature eCKeyECDSASignature = new ECKey.ECDSASignature(new BigInteger("108342886227538219509516112027486426836194938876363515083127827761400146994500"), new BigInteger("105632036011589148458025825776612256588403461999534667762812390671518934284995"));
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
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class, CALLS_REAL_METHODS);
             MockedStatic<ECKey.ECDSASignature> eCKeyECDSASignature = mockStatic(ECKey.ECDSASignature.class)) {
            byte[] byteArray = new byte[]{};
            eCKeyECDSASignature.when(() -> ECKey.ECDSASignature.decodeFromDER(byteArray)).thenReturn(eCKeyECDSASignatureMock);
            byte[] byteArray2 = new byte[]{};
            byte[] byteArray3 = new byte[]{};
            eCKey.when(() -> ECKey.verify(byteArray2, eCKeyECDSASignatureMock, byteArray3)).thenReturn(true);
            //Act Statement(s)
            boolean result = ECKey.verify(byteArray2, byteArray, byteArray3);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            eCKeyECDSASignature.verify(() -> ECKey.ECDSASignature.decodeFromDER(byteArray), atLeast(1));
            eCKey.verify(() -> ECKey.verify(byteArray2, eCKeyECDSASignatureMock, byteArray3), atLeast(1));
        }
    }

    //Sapient generated method id: ${800aca53-74b1-3c4f-9b61-232c125477a4}
    @Test()
    public void verify1WhenVerifyNotDataECDSASignatureDecodeFromDERSignaturePub() throws SignatureDecodeException {
        /* Branches:
         * (verify(data, ECDSASignature.decodeFromDER(signature), pub)) : false
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
    @Ignore()
    @Test()
    public void verify2WhenECKeyVerifyHashSignatureGetPubKey() throws SignatureDecodeException {
        /* Branches:
         * (ECKey.verify(hash, signature, getPubKey())) : true
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "ECPoint(x=1, y=2)");
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3};
            byte[] byteArray2 = new byte[]{(byte) 4, (byte) 5, (byte) 6};
            byte[] byteArray3 = new byte[]{};
            eCKey.when(() -> ECKey.verify(byteArray, byteArray2, byteArray3)).thenReturn(true);
            ECKey target = new ECKey(new BigInteger("123456789"), eCPointMock, true);
            doReturn(byteArray3).when(pubMock).getEncoded();
            //Act Statement(s)
            boolean result = target.verify(byteArray, byteArray2);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            eCKey.verify(() -> ECKey.verify(byteArray, byteArray2, byteArray3), atLeast(1));
            verify(pubMock, atLeast(1)).getEncoded();
        }
    }

    //Sapient generated method id: ${a24e688a-cbcd-3970-b58a-49bdab5acda1}
    @Ignore()
    @Test()
    public void verify2WhenECKeyNotVerifyHashSignatureGetPubKey() throws SignatureDecodeException {
        /* Branches:
         * (ECKey.verify(hash, signature, getPubKey())) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "<ECPoint>");
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{(byte) 0};
            byte[] byteArray2 = new byte[]{(byte) 0};
            byte[] byteArray3 = new byte[]{};
            eCKey.when(() -> ECKey.verify(byteArray, byteArray2, byteArray3)).thenReturn(false);
            ECKey target = new ECKey(new BigInteger("1"), eCPointMock, false);
            doReturn(byteArray3).when(pubMock).getEncoded();
            //Act Statement(s)
            boolean result = target.verify(byteArray, byteArray2);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            eCKey.verify(() -> ECKey.verify(byteArray, byteArray2, byteArray3), atLeast(1));
            verify(pubMock, atLeast(1)).getEncoded();
        }
    }

    //Sapient generated method id: ${617a78d8-50b3-356c-9eac-3f7ffe9c25d4}
    @Ignore()
    @Test()
    public void verifyOrThrowWhenVerifyNotHashSignatureThrowsSignatureException() throws SignatureDecodeException, SignatureException {
        /* Branches:
         * (!verify(hash, signature)) : true
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "null");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = spy(new ECKey(new BigInteger("0"), eCPointMock, false));
            byte[] byteArray = new byte[]{(byte) 0};
            byte[] byteArray2 = new byte[]{(byte) 0};
            doReturn(false).when(target).verify(byteArray, byteArray2);
            thrown.expect(SignatureException.class);
            //Act Statement(s)
            target.verifyOrThrow(byteArray, byteArray2);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(1));
            verify(target).verify(byteArray, byteArray2);
        }
    }

    //Sapient generated method id: ${4a1d6f4f-4781-3ef3-b351-98b9ab404b66}
    @Ignore()
    @Test()
    public void verifyOrThrowWhenVerifyHashSignature() throws SignatureDecodeException, SignatureException {
        /* Branches:
         * (!verify(hash, signature)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "<value>");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = spy(new ECKey(new BigInteger("1"), eCPointMock, false));
            byte[] byteArray = new byte[]{(byte) 0};
            byte[] byteArray2 = new byte[]{(byte) 0};
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
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0};

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
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 4, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 37, (byte) 38, (byte) 39, (byte) 40, (byte) 41, (byte) 42, (byte) 43, (byte) 44, (byte) 45, (byte) 46, (byte) 47, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 58, (byte) 59, (byte) 60, (byte) 61, (byte) 62, (byte) 63, (byte) 64};

        //Act Statement(s)
        boolean result = ECKey.isPubKeyCanonical(byteArray);

        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${16372af8-edb0-3b93-8b4a-5114df5b867c}
    @Test()
    public void isPubKeyCanonicalWhen0IndexOfPubkeyNotEquals3() {
        /* Branches:
         * (pubkey.length < 33) : false
         * (pubkey[0] == 0x04) : false
         * (pubkey[0] == 0x02) : false
         * (pubkey[0] == 0x03) : false
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 1, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32};

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
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 3, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33};

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
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 3, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32};

        //Act Statement(s)
        boolean result = ECKey.isPubKeyCompressed(byteArray);

        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${52c56dad-1857-3f48-84e4-b815c4c147ee}
    @Test()
    public void isPubKeyCompressedWhen0IndexOfEncodedNotEquals3AndEncodedLengthNotEquals65ThrowsIllegalArgumentException() {
        /* Branches:
         * (encoded.length == 33) : true
         * (encoded[0] == 0x02) : false
         * (encoded[0] == 0x03) : false
         * (encoded.length == 65) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byte[] byteArray = new byte[]{(byte) 1, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32};
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

    //Sapient generated method id: ${1a816620-d0fa-3882-be8d-1aebdd0b2e67}
    @Test()
    public void isPubKeyCompressedWhenEncodedLengthEquals65And0IndexOfEncodedEquals4() {
        /* Branches:
         * (encoded.length == 33) : true
         * (encoded[0] == 0x02) : false
         * (encoded[0] == 0x03) : false
         * (encoded.length == 65) : true
         * (encoded[0] == 0x04) : true
         */
        //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("");
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(illegalArgumentException.getMessage());
        byte[] byteArray = new byte[]{};

        //Act Statement(s)
        ECKey.isPubKeyCompressed(byteArray);
    }

    //Sapient generated method id: ${a2887511-f189-37c6-8d52-b62c3e48ea74}
    @Ignore()
    @Test()
    public void signMessageTest() throws KeyCrypterException, IOException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "<int>");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = spy(new ECKey(new BigInteger("1"), eCPointMock, false));
            doReturn("return_of_signMessage1").when(target).signMessage("<String>", (AesKey) null, ScriptType.P2PKH);
            //Act Statement(s)
            String result = target.signMessage("<String>");
            //Assert statement(s)
            assertThat(result, equalTo("return_of_signMessage1"));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            verify(target, atLeast(1)).signMessage("<String>", (AesKey) null, ScriptType.P2PKH);
        }
    }

    //Sapient generated method id: ${7aae578a-1b75-3254-9519-6a27443efcd7}
    @Ignore()
    @Test()
    public void signMessage1Test() throws KeyCrypterException, IOException {
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "1");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = spy(new ECKey(new BigInteger("1234567890"), eCPointMock, true));
            doReturn("return_of_signMessage1").when(target).signMessage("Hello, World!", (AesKey) null, ScriptType.P2PKH);
            //Act Statement(s)
            String result = target.signMessage("Hello, World!", ScriptType.P2PKH);
            //Assert statement(s)
            assertThat(result, equalTo("return_of_signMessage1"));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            verify(target, atLeast(1)).signMessage("Hello, World!", (AesKey) null, ScriptType.P2PKH);
        }
    }

    //Sapient generated method id: ${27b8a97d-df4d-34a6-a39d-e40f4ea9c8a0}
    @Ignore()
    @Test()
    public void signMessage2Test() throws KeyCrypterException, IOException {
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "{}");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = spy(new ECKey(new BigInteger("123456789"), eCPointMock, true));
            byte[] byteArray = new byte[]{};
            AesKey aesKey = new AesKey(byteArray);
            doReturn("return_of_signMessage1").when(target).signMessage("Hello World", aesKey, ScriptType.P2PKH);
            //Act Statement(s)
            String result = target.signMessage("Hello World", aesKey);
            //Assert statement(s)
            assertThat(result, equalTo("return_of_signMessage1"));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            verify(target, atLeast(1)).signMessage("Hello World", aesKey, ScriptType.P2PKH);
        }
    }

    //Sapient generated method id: ${7d19bab2-8cde-3516-97ba-4a22e0e7cc0f}
    @Ignore()
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
        try (MockedStatic<Base64> base64 = mockStatic(Base64.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class);
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            varInt.when(() -> VarInt.of(0L)).thenReturn(varIntMock);
            byte[] byteArray = new byte[]{(byte) 0};
            doReturn(byteArray).when(varIntMock).serialize();
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer);
            byte[] byteArray2 = new byte[]{(byte) 24, (byte) 66, (byte) 105, (byte) 116, (byte) 99, (byte) 111, (byte) 105, (byte) 110, (byte) 32, (byte) 83, (byte) 105, (byte) 103, (byte) 110, (byte) 101, (byte) 100, (byte) 32, (byte) 77, (byte) 101, (byte) 115, (byte) 115, (byte) 97, (byte) 103, (byte) 101, (byte) 58, (byte) 10};
            sha256Hash.when(() -> Sha256Hash.twiceOf(byteArray2)).thenReturn(sha256Hash2);
            byte[] byteArray3 = new byte[]{};
            byte[] byteArray4 = new byte[]{(byte) 0};
            byteUtils.when(() -> ByteUtils.bigIntegerToBytes(new BigInteger("0"), 32)).thenReturn(byteArray3).thenReturn(byteArray4);
            byte[] byteArray5 = new byte[]{(byte) 0};
            byte[] byteArray6 = new byte[]{(byte) 39, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            base64.when(() -> Base64.encode(byteArray6)).thenReturn(byteArray5);
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
            verify(varIntMock, atLeast(1)).serialize();
            sha256Hash.verify(() -> Sha256Hash.twiceOf(byteArray2), atLeast(1));
            byteUtils.verify(() -> ByteUtils.bigIntegerToBytes(new BigInteger("0"), 32), atLeast(2));
            base64.verify(() -> Base64.encode(byteArray6), atLeast(1));
            verify(target, atLeast(1)).isCompressed();
            verify(target, atLeast(1)).sign((Sha256Hash) any(), eq(aesKeyMock));
            verify(target, atLeast(1)).findRecoveryId((Sha256Hash) any(), eq(eCKeyECDSASignature));
        }
    }

    //Sapient generated method id: ${c7e38118-506a-3b5a-8228-5893f150b7cc}
    @Ignore()
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
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = spy(new ECKey(new BigInteger("0"), eCPointMock, false));
            doReturn(false).when(target).isCompressed();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Segwit P2WPKH and P2SH-P2WPKH script types only can be used with compressed keys. See BIP 141.");
            thrown.expect(IllegalArgumentException.class);
            thrown.expectMessage(illegalArgumentException.getMessage());
            //Act Statement(s)
            target.signMessage("message1", aesKeyMock, ScriptType.P2SH);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            verify(target, atLeast(1)).isCompressed();
        }
    }

    //Sapient generated method id: ${f15961a7-fcc2-3053-9b6b-30454ee8cef8}
    @Ignore()
    @Test()
    public void signMessage3WhenScriptTypeNotEqualsScriptTypeP2SHAndSwitchScriptTypeCaseP2SH() throws KeyCrypterException, IOException {
        /* Branches:
         * (!isCompressed()) : true
         * (scriptType == ScriptType.P2WPKH) : false
         * (scriptType == ScriptType.P2SH) : false
         * (switch(scriptType) = P2SH) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Base64> base64 = mockStatic(Base64.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{};
            byteUtils.when(() -> ByteUtils.bigIntegerToBytes(new BigInteger("1"), 32)).thenReturn(byteArray).thenReturn(byteArray2);
            byte[] byteArray3 = new byte[]{};
            byte[] byteArray4 = new byte[]{(byte) 32, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            base64.when(() -> Base64.encode(byteArray4)).thenReturn(byteArray3);
            ECKey target = spy(new ECKey(new BigInteger("0"), eCPointMock, false));
            ECKey.ECDSASignature eCKeyECDSASignature = new ECKey.ECDSASignature(new BigInteger("1"), new BigInteger("1"));
            doReturn(eCKeyECDSASignature).when(target).sign((Sha256Hash) any(), eq(aesKeyMock));
            doReturn((byte) 1).when(target).findRecoveryId((Sha256Hash) any(), eq(eCKeyECDSASignature));
            doReturn(false, true).when(target).isCompressed();
            //Act Statement(s)
            String result = target.signMessage("message1", aesKeyMock, ScriptType.P2PKH);
            //Assert statement(s)
            assertThat(result, equalTo("result1"));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(1));
            byteUtils.verify(() -> ByteUtils.bigIntegerToBytes(new BigInteger("1"), 32), atLeast(2));
            base64.verify(() -> Base64.encode(byteArray4), atLeast(1));
            verify(target, times(2)).isCompressed();
            verify(target).sign((Sha256Hash) any(), eq(aesKeyMock));
            verify(target).findRecoveryId((Sha256Hash) any(), eq(eCKeyECDSASignature));
        }
    }

    //Sapient generated method id: ${7131f216-9fab-356f-91b1-a2c3eca7e43b}
    @Ignore()
    @Test()
    public void signMessage3WhenScriptTypeNotEqualsScriptTypeP2SHAndSwitchScriptTypeCaseDefaultThrowsIllegalArgumentException() throws KeyCrypterException {
        /* Branches:
         * (!isCompressed()) : true
         * (scriptType == ScriptType.P2WPKH) : false
         * (scriptType == ScriptType.P2SH) : false
         * (switch(scriptType) = default) : true
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "{}");
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class);
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            varInt.when(() -> VarInt.of(11L)).thenReturn(varIntMock);
            byte[] byteArray = new byte[]{(byte) 0};
            doReturn(byteArray).when(varIntMock).serialize();
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer);
            byte[] byteArray2 = new byte[]{(byte) 24, (byte) 66, (byte) 105, (byte) 116, (byte) 99, (byte) 111, (byte) 105, (byte) 110, (byte) 32, (byte) 83, (byte) 105, (byte) 103, (byte) 110, (byte) 101, (byte) 100, (byte) 32, (byte) 77, (byte) 101, (byte) 115, (byte) 115, (byte) 97, (byte) 103, (byte) 101, (byte) 58, (byte) 10, (byte) 72, (byte) 101, (byte) 108, (byte) 108, (byte) 111, (byte) 32, (byte) 87, (byte) 111, (byte) 114, (byte) 108, (byte) 100};
            sha256Hash.when(() -> Sha256Hash.twiceOf(byteArray2)).thenReturn(sha256Hash2);
            ECKey target = spy(new ECKey(new BigInteger("123456789"), eCPointMock, false));
            doReturn(false).when(target).isCompressed();
            byte[] byteArray3 = new byte[]{};
            AesKey aesKey = new AesKey(byteArray3);
            doReturn(eCKeyECDSASignatureMock).when(target).sign((Sha256Hash) any(), eq(aesKey));
            doReturn((byte) 0).when(target).findRecoveryId((Sha256Hash) any(), eq(eCKeyECDSASignatureMock));
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unsupported script type for message signing.");
            thrown.expect(IllegalArgumentException.class);
            thrown.expectMessage(illegalArgumentException.getMessage());
            //Act Statement(s)
            target.signMessage("Hello World", aesKey, ScriptType.P2PK);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            varInt.verify(() -> VarInt.of(11L), atLeast(1));
            verify(varIntMock, atLeast(1)).serialize();
            sha256Hash.verify(() -> Sha256Hash.twiceOf(byteArray2), atLeast(1));
            verify(target, atLeast(1)).isCompressed();
            verify(target, atLeast(1)).sign((Sha256Hash) any(), eq(aesKey));
            verify(target, atLeast(1)).findRecoveryId((Sha256Hash) any(), eq(eCKeyECDSASignatureMock));
        }
    }

    //Sapient generated method id: ${b0d0b032-edbe-3068-9a62-41d512da8a37}
    @Ignore()
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
    @Ignore()
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
            varInt.when(() -> VarInt.of(0L)).thenReturn(varIntMock);
            byte[] byteArray = new byte[]{(byte) 0};
            doReturn(byteArray).when(varIntMock).serialize();
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer);
            byte[] byteArray2 = new byte[]{(byte) 24, (byte) 66, (byte) 105, (byte) 116, (byte) 99, (byte) 111, (byte) 105, (byte) 110, (byte) 32, (byte) 83, (byte) 105, (byte) 103, (byte) 110, (byte) 101, (byte) 100, (byte) 32, (byte) 77, (byte) 101, (byte) 115, (byte) 115, (byte) 97, (byte) 103, (byte) 101, (byte) 58, (byte) 10};
            sha256Hash.when(() -> Sha256Hash.twiceOf(byteArray2)).thenReturn(sha256Hash2);
            byte[] byteArray3 = new byte[]{};
            byte[] byteArray4 = new byte[]{(byte) 0};
            byteUtils.when(() -> ByteUtils.bigIntegerToBytes(new BigInteger("0"), 32)).thenReturn(byteArray3).thenReturn(byteArray4);
            byte[] byteArray5 = new byte[]{(byte) 0};
            byte[] byteArray6 = new byte[]{(byte) 31, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            base64.when(() -> Base64.encode(byteArray6)).thenReturn(byteArray5);
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
            verify(varIntMock, atLeast(1)).serialize();
            sha256Hash.verify(() -> Sha256Hash.twiceOf(byteArray2), atLeast(1));
            byteUtils.verify(() -> ByteUtils.bigIntegerToBytes(new BigInteger("0"), 32), atLeast(2));
            base64.verify(() -> Base64.encode(byteArray6), atLeast(1));
            verify(target, times(2)).isCompressed();
            verify(target, atLeast(1)).sign((Sha256Hash) any(), eq(aesKeyMock));
            verify(target, atLeast(1)).findRecoveryId((Sha256Hash) any(), eq(eCKeyECDSASignature));
        }
    }

    //Sapient generated method id: ${082e46a9-d774-31a2-9f5b-963dc47e457a}
    @Ignore()
    @Test()
    public void signMessage3WhenSwitchScriptTypeCaseP2PKHAndIsCompressedNot() throws KeyCrypterException, IOException {
        /* Branches:
         * (!isCompressed()) : true
         * (scriptType == ScriptType.P2WPKH) : false
         * (scriptType == ScriptType.P2SH) : false
         * (switch(scriptType) = P2PKH) : true
         * (isCompressed()) : false
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "0");
        try (MockedStatic<Base64> base64 = mockStatic(Base64.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class);
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            varInt.when(() -> VarInt.of(13L)).thenReturn(varIntMock);
            byte[] byteArray = new byte[]{(byte) 0};
            doReturn(byteArray).when(varIntMock).serialize();
            byte[] byteArray2 = new byte[]{(byte) 24, (byte) 66, (byte) 105, (byte) 116, (byte) 99, (byte) 111, (byte) 105, (byte) 110, (byte) 32, (byte) 83, (byte) 105, (byte) 103, (byte) 110, (byte) 101, (byte) 100, (byte) 32, (byte) 77, (byte) 101, (byte) 115, (byte) 115, (byte) 97, (byte) 103, (byte) 101, (byte) 58, (byte) 10, (byte) 72, (byte) 101, (byte) 108, (byte) 108, (byte) 111, (byte) 44, (byte) 32, (byte) 119, (byte) 111, (byte) 114, (byte) 108, (byte) 100, (byte) 33};
            sha256Hash.when(() -> Sha256Hash.twiceOf(byteArray2)).thenReturn(sha256HashMock);
            byte[] byteArray3 = new byte[]{};
            byteUtils.when(() -> ByteUtils.bigIntegerToBytes(new BigInteger("1"), 32)).thenReturn(byteArray3);
            byte[] byteArray4 = new byte[]{(byte) 0, (byte) 0, (byte) 0};
            byteUtils.when(() -> ByteUtils.bigIntegerToBytes(new BigInteger("0"), 32)).thenReturn(byteArray4);
            byte[] byteArray5 = new byte[]{(byte) 0};
            byte[] byteArray6 = new byte[]{(byte) 32, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            base64.when(() -> Base64.encode(byteArray6)).thenReturn(byteArray5);
            ECKey target = spy(new ECKey(new BigInteger("1234567890"), eCPointMock, false));
            ECKey.ECDSASignature eCKeyECDSASignature = new ECKey.ECDSASignature(new BigInteger("1"), new BigInteger("0"));
            byte[] byteArray7 = new byte[]{};
            AesKey aesKey = new AesKey(byteArray7);
            doReturn(eCKeyECDSASignature).when(target).sign(sha256HashMock, aesKey);
            doReturn((byte) 1).when(target).findRecoveryId(sha256HashMock, eCKeyECDSASignature);
            doReturn(false, true).when(target).isCompressed();
            //Act Statement(s)
            String result = target.signMessage("Hello, world!", aesKey, ScriptType.P2PKH);
            //Assert statement(s)
            assertThat(result, equalTo("result1"));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            varInt.verify(() -> VarInt.of(13L), atLeast(1));
            verify(varIntMock, atLeast(1)).serialize();
            sha256Hash.verify(() -> Sha256Hash.twiceOf(byteArray2), atLeast(1));
            byteUtils.verify(() -> ByteUtils.bigIntegerToBytes(new BigInteger("1"), 32), atLeast(1));
            byteUtils.verify(() -> ByteUtils.bigIntegerToBytes(new BigInteger("0"), 32), atLeast(1));
            base64.verify(() -> Base64.encode(byteArray6), atLeast(1));
            verify(target, times(2)).isCompressed();
            verify(target, atLeast(1)).sign(sha256HashMock, aesKey);
            verify(target, atLeast(1)).findRecoveryId(sha256HashMock, eCKeyECDSASignature);
        }
    }

    //Sapient generated method id: ${b43704bd-6b80-3c50-a83d-5b7a855ee1c7}
    @Test()
    public void signedMessageToKeyWhenCaughtRuntimeExceptionThrowsSignatureException() throws SignatureException {
        /* Branches:
         * (catch-exception (RuntimeException)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Base64> base64 = mockStatic(Base64.class)) {
            RuntimeException runtimeException = new RuntimeException();
            base64.when(() -> Base64.decode("signatureBase64")).thenThrow(runtimeException);
            SignatureException signatureException = new SignatureException("Could not decode base64", runtimeException);
            thrown.expect(SignatureException.class);
            thrown.expectMessage(signatureException.getMessage());
            thrown.expectCause(isA(RuntimeException.class));
            //Act Statement(s)
            ECKey.signedMessageToKey("message1", "signatureBase64");
            //Assert statement(s)
            base64.verify(() -> Base64.decode("signatureBase64"), atLeast(1));
        }
    }

    //Sapient generated method id: ${f512d003-e768-338c-85bd-55b185a34685}
    @Test()
    public void signedMessageToKeyWhenSignatureEncodedLengthLessThan65ThrowsSignatureException() throws SignatureException {
        /* Branches:
         * (signatureEncoded.length < 65) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Base64> base64 = mockStatic(Base64.class)) {
            byte[] byteArray = new byte[]{};
            base64.when(() -> Base64.decode("A")).thenReturn(byteArray);
            thrown.expect(SignatureException.class);
            //Act Statement(s)
            ECKey.signedMessageToKey("message1", "A");
            //Assert statement(s)
            base64.verify(() -> Base64.decode("A"), atLeast(1));
        }
    }

    //Sapient generated method id: ${6a82a471-3d4a-3676-bcb7-7eef8dadcae0}
    @Test()
    public void signedMessageToKeyWhenHeaderGreaterThan42ThrowsSignatureException() throws SignatureException {
        /* Branches:
         * (signatureEncoded.length < 65) : false
         * (header < 27) : false
         * (header > 42) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Base64> base64 = mockStatic(Base64.class)) {
            byte[] byteArray = new byte[]{};
            base64.when(() -> Base64.decode("MEUCIQDjzJvzqZzJQJzJvzqZzJQJzJvzqZzJQJzJvzqZzJQJzJvzqZzJQJzJvzqZzJQJzJvzqZzJQJzJvzqZzJQJzJvzqZzJQJzJvzqZzJQ=")).thenReturn(byteArray);
            thrown.expect(SignatureException.class);
            //Act Statement(s)
            ECKey.signedMessageToKey("Hello World", "MEUCIQDjzJvzqZzJQJzJvzqZzJQJzJvzqZzJQJzJvzqZzJQJzJvzqZzJQJzJvzqZzJQJzJvzqZzJQJzJvzqZzJQJzJvzqZzJQJzJvzqZzJQ=");
            //Assert statement(s)
            base64.verify(() -> Base64.decode("MEUCIQDjzJvzqZzJQJzJvzqZzJQJzJvzqZzJQJzJvzqZzJQJzJvzqZzJQJzJvzqZzJQJzJvzqZzJQJzJvzqZzJQJzJvzqZzJQJzJvzqZzJQ="), atLeast(1));
        }
    }

    //Sapient generated method id: ${b69a0b40-2dfb-359f-b9e3-69785959e7fe}
    @Ignore()
    @Test()
    public void verifyMessageWhenKeyPubNotEqualsPubThrowsSignatureException() throws SignatureException {
        /* Branches:
         * (!key.pub.equals(pub)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "02d5c1b3a6b6f679f3c3e0a7dce9b4c5e3f9a6f4f1a7f2e9c2f8b2d7f9b8a7f8");
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            eCKey.when(() -> ECKey.signedMessageToKey("Hello World", "dGhpcyBpcyBhIHNpZ25hdHVyZSBiYXNlNjQgZW5jb2RlZA==")).thenReturn(eCKeyMock);
            ECKey target = new ECKey(new BigInteger("1234567890"), eCPointMock, true);
            thrown.expect(SignatureException.class);
            //Act Statement(s)
            target.verifyMessage("Hello World", "dGhpcyBpcyBhIHNpZ25hdHVyZSBiYXNlNjQgZW5jb2RlZA==");
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            eCKey.verify(() -> ECKey.signedMessageToKey("Hello World", "dGhpcyBpcyBhIHNpZ25hdHVyZSBiYXNlNjQgZW5jb2RlZA=="), atLeast(1));
        }
    }

    //Sapient generated method id: ${02e25fdf-c6dd-3c04-9b5a-64ac2bb25f41}
    @Ignore()
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
            eCKey.when(() -> ECKey.signedMessageToKey("message1", "signatureBase64")).thenReturn(eCKeyMock);
            ECKey target = new ECKey(new BigInteger("0"), eCPointMock, false);
            //Act Statement(s)
            target.verifyMessage("message1", "signatureBase64");
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            eCKey.verify(() -> ECKey.signedMessageToKey("message1", "signatureBase64"), atLeast(1));
        }
    }

    //Sapient generated method id: ${27fcc624-a5b4-3096-b6c6-0a756fcc1a67}
    @Ignore()
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
        ECPoint eCPointMock = mock(ECPoint.class, "<valid_public_key_value>");
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey.ECDSASignature eCKeyECDSASignature = new ECKey.ECDSASignature(new BigInteger("0"), new BigInteger("0"));
            eCKey.when(() -> ECKey.recoverFromSignature(eq((byte) 0), eq(eCKeyECDSASignature), (Sha256Hash) any(), eq(false))).thenReturn(eCKeyMock);
            ECKey eCKey2 = new ECKey();
            eCKey.when(() -> ECKey.recoverFromSignature(eq((byte) 1), eq(eCKeyECDSASignature), (Sha256Hash) any(), eq(false))).thenReturn(eCKey2);
            eCKey.when(() -> ECKey.recoverFromSignature(eq((byte) 2), eq(eCKeyECDSASignature), (Sha256Hash) any(), eq(false))).thenReturn(eCKeyMock2);
            ECKey target = spy(new ECKey(new BigInteger("1"), eCPointMock, true));
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
    @Ignore()
    @Test()
    public void recoverFromSignatureWhenSigSSignumGreaterThanOrEqualsTo0AndXCompareToPrimeGreaterThanOrEqualsTo0() {
        /* Branches:
         * (recId >= 0) : true
         * (sig.r.signum() >= 0) : false
         * (sig.s.signum() >= 0) : true
         * (x.compareTo(prime) >= 0) : true
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
    @Ignore()
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
        ECPoint eCPointMock = mock(ECPoint.class, "ECPoint");
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class, CALLS_REAL_METHODS);
             MockedStatic<ECAlgorithms> eCAlgorithms = mockStatic(ECAlgorithms.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            eCAlgorithms.when(() -> ECAlgorithms.sumOfTwoMultiplies((ECPoint) any(), eq(new BigInteger("0")), (ECPoint) any(), eq(new BigInteger("1")))).thenReturn(eCPointMock);
            ECKey eCKey2 = new ECKey();
            eCKey.when(() -> ECKey.fromPublicOnly(eCPointMock, true)).thenReturn(eCKey2);
            ECKey.ECDSASignature eCKeyECDSASignature = new ECKey.ECDSASignature(new BigInteger("1"), new BigInteger("1"));
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            //Act Statement(s)
            ECKey result = ECKey.recoverFromSignature(0, eCKeyECDSASignature, sha256Hash, true);
            //Assert statement(s)
            assertThat(result, equalTo(eCKey2));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(3));
            eCAlgorithms.verify(() -> ECAlgorithms.sumOfTwoMultiplies((ECPoint) any(), eq(new BigInteger("0")), (ECPoint) any(), eq(new BigInteger("1"))), atLeast(1));
            eCKey.verify(() -> ECKey.fromPublicOnly(eCPointMock, true), atLeast(1));
        }
    }

    //Sapient generated method id: ${f1dcb929-af49-36da-bf67-a38d8ab6a7a7}
    @Ignore()
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
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class, CALLS_REAL_METHODS);
             MockedStatic<ECAlgorithms> eCAlgorithms = mockStatic(ECAlgorithms.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            eCAlgorithms.when(() -> ECAlgorithms.sumOfTwoMultiplies((ECPoint) any(), eq(new BigInteger("0")), (ECPoint) any(), eq(new BigInteger("1")))).thenReturn(eCPointMock);
            eCKey.when(() -> ECKey.fromPublicOnly(eCPointMock, false)).thenReturn(eCKeyMock);
            ECKey.ECDSASignature eCKeyECDSASignature = new ECKey.ECDSASignature(new BigInteger("1"), new BigInteger("1"));
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            //Act Statement(s)
            ECKey result = ECKey.recoverFromSignature(-1, eCKeyECDSASignature, sha256Hash, false);
            //Assert statement(s)
            assertThat(result, equalTo(eCKeyMock));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(3));
            eCAlgorithms.verify(() -> ECAlgorithms.sumOfTwoMultiplies((ECPoint) any(), eq(new BigInteger("0")), (ECPoint) any(), eq(new BigInteger("1"))), atLeast(1));
            eCKey.verify(() -> ECKey.fromPublicOnly(eCPointMock, false), atLeast(1));
        }
    }

    //Sapient generated method id: ${76996bb7-705d-33de-802d-b07f0dceae6b}
    @Ignore()
    @Test()
    public void getPrivKeyBytesTest() {
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "123");
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            byteUtils.when(() -> ByteUtils.bigIntegerToBytes(new BigInteger("0"), 32)).thenReturn(byteArray);
            ECKey target = spy(new ECKey(new BigInteger("123456789"), eCPointMock, true));
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
    @Ignore()
    @Test()
    public void getPrivateKeyEncodedTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "null");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = spy(new ECKey(new BigInteger("1234567890"), eCPointMock, true));
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
    @Ignore()
    @Test()
    public void getPrivateKeyEncoded1Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock = mock(NetworkParameters.class, "<value>");
        Network networkMock = mock(Network.class, "<value>");
        ECPoint eCPointMock = mock(ECPoint.class, "<value>");
        DumpedPrivateKey dumpedPrivateKeyMock = mock(DumpedPrivateKey.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock).when(paramsMock).network();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = spy(new ECKey(new BigInteger("1"), eCPointMock, false));
            doReturn(dumpedPrivateKeyMock).when(target).getPrivateKeyEncoded(networkMock);
            //Act Statement(s)
            DumpedPrivateKey result = target.getPrivateKeyEncoded(paramsMock);
            //Assert statement(s)
            assertThat(result, equalTo(dumpedPrivateKeyMock));
            verify(paramsMock, atLeast(1)).network();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            verify(target, atLeast(1)).getPrivateKeyEncoded(networkMock);
        }
    }

    //Sapient generated method id: ${e7ca91d8-c1cc-3fb0-bbfc-9b9ce2ba701e}
    @Ignore()
    @Test()
    public void creationTimeTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "<value>");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = new ECKey(new BigInteger("1"), eCPointMock, false);
            //Act Statement(s)
            Optional<Instant> result = target.creationTime();
            Optional<Instant> instantOptional = Optional.empty();
            //Assert statement(s)
            assertThat(result, equalTo(instantOptional));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${f3f8c93e-4bad-3365-95b7-147d7060a76b}
    @Ignore()
    @Test()
    public void setCreationTimeTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "<value>");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = new ECKey(new BigInteger("1"), eCPointMock, false);
            Instant instant = Instant.now();
            //Act Statement(s)
            target.setCreationTime(instant);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${1cb1776a-16c9-3d5e-abdd-90b3fd00e9dd}
    @Ignore()
    @Test()
    public void clearCreationTimeTest() {
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "55066263022277343669578718895168534326250603453777594175500187360389116729240");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = new ECKey(new BigInteger("1234567890"), eCPointMock, true);
            //Act Statement(s)
            target.clearCreationTime();
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${aab7b3ee-0703-3aca-9aba-6676b7a750b3}
    @Ignore()
    @Test()
    public void setCreationTimeSecondsWhenCreationTimeSecsGreaterThan0() {
        /* Branches:
         * (creationTimeSecs > 0) : true
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "10253594775994597755590489082176066727189924228321621061271704799769313964392");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = new ECKey(new BigInteger("12345678901234567890123456789012345678901234567890123456789012345678901234"), eCPointMock, true);
            //Act Statement(s)
            target.setCreationTimeSeconds(1000000000L);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${bef4381a-288d-3155-9098-6a9016e3326b}
    @Ignore()
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
        ECPoint eCPointMock = mock(ECPoint.class, "null");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = new ECKey(new BigInteger("-1"), eCPointMock, false);
            //Act Statement(s)
            target.setCreationTimeSeconds(0L);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${6efdfffb-ab76-3832-8528-819e02d958d6}
    @Ignore()
    @Test()
    public void setCreationTimeSecondsWhenCreationTimeSecsNotEquals0ThrowsIllegalArgumentException() {
        /* Branches:
         * (creationTimeSecs > 0) : false
         * (creationTimeSecs == 0) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = new ECKey(new BigInteger("0"), eCPointMock, false);
            //Act Statement(s)
            target.setCreationTimeSeconds(0L);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(1));
        }
    }

    //Sapient generated method id: ${4fa75ec5-3836-3310-8cc0-b163c11a74b7}
    @Ignore()
    @Test()
    public void encryptWhenCreationTimeIsNull() throws KeyCrypterException {
        /* Branches:
         * (creationTime != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "new KeyCrypter()");
        ECPoint eCPointMock = mock(ECPoint.class, "pub");
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{};
            EncryptedData encryptedData = new EncryptedData(byteArray, byteArray2);
            byte[] byteArray3 = new byte[]{};
            byte[] byteArray4 = new byte[]{};
            AesKey aesKey = new AesKey(byteArray4);
            doReturn(encryptedData).when(keyCrypterMock).encrypt(byteArray3, aesKey);
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray5 = new byte[]{};
            eCKey.when(() -> ECKey.fromEncrypted(encryptedData, keyCrypterMock, byteArray5)).thenReturn(eCKeyMock);
            doNothing().when(eCKeyMock).clearCreationTime();
            ECKey target = spy(new ECKey(new BigInteger("1"), eCPointMock, false));
            doReturn(byteArray3).when(target).getPrivKeyBytes();
            doReturn(byteArray5).when(pubMock).getEncoded();
            //Act Statement(s)
            ECKey result = target.encrypt(keyCrypterMock, aesKey);
            //Assert statement(s)
            assertThat(result, equalTo(eCKeyMock));
            verify(keyCrypterMock, atLeast(1)).encrypt(byteArray3, aesKey);
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            eCKey.verify(() -> ECKey.fromEncrypted(encryptedData, keyCrypterMock, byteArray5), atLeast(1));
            verify(eCKeyMock, atLeast(1)).clearCreationTime();
            verify(target, atLeast(1)).getPrivKeyBytes();
            verify(pubMock, atLeast(1)).getEncoded();
        }
    }

    //Sapient generated method id: ${2d262fc1-6cef-3ef5-93fc-f437a269acdc}
    @Ignore()
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
    @Ignore()
    @Test()
    public void decrypt1WhenCrypterIsNullThrowsKeyCrypterException() throws KeyCrypterException {
        /* Branches:
         * (crypter == null) : true
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "1");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = new ECKey(new BigInteger("1234567890"), eCPointMock, true);
            KeyCrypterException keyCrypterException = new KeyCrypterException("No key crypter available");
            thrown.expect(KeyCrypterException.class);
            thrown.expectMessage(keyCrypterException.getMessage());
            byte[] byteArray = new byte[]{};
            AesKey aesKey = new AesKey(byteArray);
            //Act Statement(s)
            target.decrypt(aesKey);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${7be6a4f9-5ec5-3e32-bc29-c53e3456afa0}
    @Ignore()
    @Test()
    public void maybeDecryptWhenAesKeyIsNotNull() throws KeyCrypterException {
        /* Branches:
         * (isEncrypted()) : true
         * (aesKey != null) : true
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "0");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = spy(new ECKey(new BigInteger("1"), eCPointMock, true));
            doReturn(true).when(target).isEncrypted();
            byte[] byteArray = new byte[]{};
            AesKey aesKey = new AesKey(byteArray);
            doReturn(eCKeyMock).when(target).decrypt(aesKey);
            //Act Statement(s)
            ECKey result = target.maybeDecrypt(aesKey);
            //Assert statement(s)
            assertThat(result, equalTo(eCKeyMock));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            verify(target).isEncrypted();
            verify(target).decrypt(aesKey);
        }
    }

    //Sapient generated method id: ${ce25b3c6-6733-3d03-8c07-10390fe615ee}
    @Ignore()
    @Test()
    public void maybeDecryptWhenAesKeyIsNull() throws KeyCrypterException {
        /* Branches:
         * (isEncrypted()) : true
         * (aesKey != null) : false
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "1");
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
    @Ignore()
    @Test()
    public void encryptionIsReversibleWhenArraysNotEqualsOriginalPrivateKeyBytesRebornKeyBytes() throws KeyCrypterException {
        /* Branches:
         * (!Arrays.equals(originalPrivateKeyBytes, rebornKeyBytes)) : true
         */
        //Arrange Statement(s)
        ECKey eCKey = new ECKey();
        ECKey eCKey2 = new ECKey();
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "<KeyCrypter object>");
        byte[] byteArray = new byte[]{};
        AesKey aesKey = new AesKey(byteArray);

        //Act Statement(s)
        boolean result = ECKey.encryptionIsReversible(eCKey, eCKey2, keyCrypterMock, aesKey);

        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${6f02d818-da6d-3983-80e1-9ddcd62c21bf}
    @Test()
    public void encryptionIsReversibleWhenArraysEqualsOriginalPrivateKeyBytesRebornKeyBytes() throws KeyCrypterException {
        /* Branches:
         * (!Arrays.equals(originalPrivateKeyBytes, rebornKeyBytes)) : false
         */
        //Arrange Statement(s)
        ECKey originalKeyMock = mock(ECKey.class);
        byte[] byteArray = new byte[]{};
        doReturn(byteArray).when(originalKeyMock).getPrivKeyBytes();
        doReturn(eCKeyMock).when(encryptedKeyMock).decrypt(keyCrypterMock, aesKeyMock);
        byte[] byteArray2 = new byte[]{};
        doReturn(byteArray2).when(eCKeyMock).getPrivKeyBytes();

        //Act Statement(s)
        boolean result = ECKey.encryptionIsReversible(originalKeyMock, encryptedKeyMock, keyCrypterMock, aesKeyMock);

        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(originalKeyMock).getPrivKeyBytes();
        verify(encryptedKeyMock).decrypt(keyCrypterMock, aesKeyMock);
        verify(eCKeyMock).getPrivKeyBytes();
    }

    //Sapient generated method id: ${8b7b5c15-2af0-3998-9c17-f1a5acb97807}
    @Ignore()
    @Test()
    public void encryptionIsReversibleWhenCaughtKeyCrypterException() throws KeyCrypterException {
        /* Branches:
         * (!Arrays.equals(originalPrivateKeyBytes, rebornKeyBytes)) : true
         * (catch-exception (KeyCrypterException)) : true
         */
        //Arrange Statement(s)
        KeyCrypterException keyCrypterExceptionMock = mock(KeyCrypterException.class);
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "null");
        byte[] byteArray = new byte[]{};
        AesKey aesKey = new AesKey(byteArray);
        doThrow(keyCrypterExceptionMock).when(encryptedKeyMock).decrypt(keyCrypterMock, aesKey);
        ECKey rebornUnencryptedKeyMock = mock(ECKey.class);
        byte[] byteArray2 = new byte[]{(byte) 0, (byte) 0, (byte) 0};
        doReturn(byteArray2).when(rebornUnencryptedKeyMock).getPrivKeyBytes();
        ECKey eCKey = new ECKey();

        //Act Statement(s)
        boolean result = ECKey.encryptionIsReversible(eCKey, encryptedKeyMock, keyCrypterMock, aesKey);

        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(encryptedKeyMock).decrypt(keyCrypterMock, aesKey);
        verify(rebornUnencryptedKeyMock).getPrivKeyBytes();
    }

    //Sapient generated method id: ${fb4885d6-9d6e-3304-8242-966497227d83}
    @Ignore()
    @Test()
    public void isEncryptedWhenKeyCrypterIsNull() {
        /* Branches:
         * (keyCrypter != null) : false
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "1");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = new ECKey(new BigInteger("123456789"), eCPointMock, true);
            //Act Statement(s)
            boolean result = target.isEncrypted();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${a8ff216a-be1d-31db-af89-3852ffc456ad}
    @Ignore()
    @Test()
    public void getEncryptionTypeWhenKeyCrypterIsNull() {
        /* Branches:
         * (keyCrypter != null) : false
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "55066263022277343669578718895168534326250603453777594175500187360389116729240");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = new ECKey(new BigInteger("123456789"), eCPointMock, true);
            //Act Statement(s)
            Protos.Wallet.EncryptionType result = target.getEncryptionType();
            //Assert statement(s)
            assertThat(result, equalTo(Protos.Wallet.EncryptionType.UNENCRYPTED));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${f7e39e4d-0f7c-3206-8f36-3a0d284007ed}
    @Ignore()
    @Test()
    public void getSecretBytesWhenHasPrivKey() {
        /* Branches:
         * (hasPrivKey()) : true
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "123");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = spy(new ECKey(new BigInteger("1234567890"), eCPointMock, true));
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
    @Ignore()
    @Test()
    public void getSecretBytesWhenHasPrivKeyNot() {
        /* Branches:
         * (hasPrivKey()) : false
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "0");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = spy(new ECKey(new BigInteger("1"), eCPointMock, false));
            doReturn(false).when(target).hasPrivKey();
            //Act Statement(s)
            byte[] result = target.getSecretBytes();
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            verify(target).hasPrivKey();
        }
    }

    //Sapient generated method id: ${dff58ab7-e6dc-3d37-b2b6-2e523a5c78cd}
    @Ignore()
    @Test()
    public void getEncryptedDataTest() {
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "123");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = new ECKey(new BigInteger("1234567890"), eCPointMock, true);
            //Act Statement(s)
            EncryptedData result = target.getEncryptedData();
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${578644a2-37cc-3bfc-b841-d7e64f012978}
    @Ignore()
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
        ECPoint eCPointMock = mock(ECPoint.class, "ECPoint: 123, 456");
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            byteUtils.when(() -> ByteUtils.formatHex(byteArray)).thenReturn("");
            ECKey target = spy(new ECKey(new BigInteger("1234567890"), eCPointMock, true));
            doReturn(byteArray).when(pubMock).getEncoded();
            doReturn(false).when(target).isEncrypted();
            doReturn(false).when(target).isPubKeyOnly();
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("toString_moreObjects.ToStringHelper2"));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            byteUtils.verify(() -> ByteUtils.formatHex(byteArray), atLeast(1));
            verify(pubMock, atLeast(1)).getEncoded();
            verify(target, atLeast(1)).isEncrypted();
            verify(target, atLeast(1)).isPubKeyOnly();
        }
    }

    //Sapient generated method id: ${bfa400b6-269c-3f50-82d6-2f7c2ddf9df7}
    @Ignore()
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
        ECPoint eCPointMock = mock(ECPoint.class, "<value>");
        Network networkMock = mock(Network.class, "<value>");
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            byteUtils.when(() -> ByteUtils.formatHex(byteArray)).thenReturn("String");
            ECKey target = spy(new ECKey(new BigInteger("1"), eCPointMock, false));
            doReturn(byteArray).when(pubMock).getEncoded();
            doReturn(eCKeyMock).when(target).decrypt((AesKey) any());
            doReturn("String").when(eCKeyMock).getPrivateKeyAsHex();
            doReturn("String").when(eCKeyMock).getPrivateKeyAsWiF(networkMock);
            doReturn(true, false).when(target).isEncrypted();
            doReturn(false).when(target).isPubKeyOnly();
            byte[] byteArray2 = new byte[]{};
            AesKey aesKey = new AesKey(byteArray2);
            //Act Statement(s)
            String result = target.toStringWithPrivate(aesKey, networkMock);
            //Assert statement(s)
            assertThat(result, equalTo("toString_moreObjects.ToStringHelper2"));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            byteUtils.verify(() -> ByteUtils.formatHex(byteArray), atLeast(1));
            verify(pubMock, atLeast(1)).getEncoded();
            verify(target, times(2)).isEncrypted();
            verify(target, atLeast(1)).decrypt((AesKey) any());
            verify(eCKeyMock, atLeast(1)).getPrivateKeyAsHex();
            verify(eCKeyMock, atLeast(1)).getPrivateKeyAsWiF(networkMock);
            verify(target, atLeast(1)).isPubKeyOnly();
        }
    }

    //Sapient generated method id: ${4faebd0e-ce55-326b-b1f6-8d86e7fe9cd3}
    @Ignore()
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
        ECPoint eCPointMock = mock(ECPoint.class, "<value>");
        Network networkMock = mock(Network.class, "<value>");
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            byteUtils.when(() -> ByteUtils.formatHex(byteArray)).thenReturn("<String>");
            ECKey target = spy(new ECKey(new BigInteger("1"), eCPointMock, false));
            doReturn(byteArray).when(pubMock).getEncoded();
            doReturn(false).when(target).isEncrypted();
            doReturn(false).when(target).isPubKeyOnly();
            byte[] byteArray2 = new byte[]{};
            AesKey aesKey = new AesKey(byteArray2);
            //Act Statement(s)
            String result = target.toStringWithPrivate(aesKey, networkMock);
            //Assert statement(s)
            assertThat(result, equalTo("toString_moreObjects.ToStringHelper2"));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            byteUtils.verify(() -> ByteUtils.formatHex(byteArray), atLeast(1));
            verify(pubMock, atLeast(1)).getEncoded();
            verify(target, times(2)).isEncrypted();
            verify(target, atLeast(1)).isPubKeyOnly();
        }
    }

    //Sapient generated method id: ${dad9b6ef-c8da-31a8-9de5-425b2ba97f08}
    @Ignore()
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
        ECPoint eCPointMock = mock(ECPoint.class, "<value>");
        Network networkMock = mock(Network.class, "<value>");
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            byteUtils.when(() -> ByteUtils.formatHex(byteArray)).thenReturn("<String>");
            ECKey target = spy(new ECKey(new BigInteger("1"), eCPointMock, false));
            doReturn(byteArray).when(pubMock).getEncoded();
            doReturn(eCKeyMock).when(target).decrypt((AesKey) any());
            doReturn("<String>").when(eCKeyMock).getPrivateKeyAsHex();
            doReturn("<String>").when(eCKeyMock).getPrivateKeyAsWiF(networkMock);
            doReturn(true, false).when(target).isEncrypted();
            doReturn(false).when(target).isPubKeyOnly();
            byte[] byteArray2 = new byte[]{};
            AesKey aesKey = new AesKey(byteArray2);
            //Act Statement(s)
            String result = target.toStringWithPrivate(aesKey, networkMock);
            //Assert statement(s)
            assertThat(result, equalTo("toString_moreObjects.ToStringHelper2"));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            byteUtils.verify(() -> ByteUtils.formatHex(byteArray), atLeast(1));
            verify(pubMock, atLeast(1)).getEncoded();
            verify(target, times(2)).isEncrypted();
            verify(target, atLeast(1)).decrypt((AesKey) any());
            verify(eCKeyMock, atLeast(1)).getPrivateKeyAsHex();
            verify(eCKeyMock, atLeast(1)).getPrivateKeyAsWiF(networkMock);
            verify(target, atLeast(1)).isPubKeyOnly();
        }
    }

    //Sapient generated method id: ${7d577d7f-cbc6-3d88-bf24-a9520dc25b39}
    @Ignore()
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
        ECPoint eCPointMock = mock(ECPoint.class, "<result of getPublicKeyAsHex() method>");
        Network networkMock = mock(Network.class, "<valid Network object>");
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            byteUtils.when(() -> ByteUtils.formatHex(byteArray)).thenReturn("");
            ECKey target = spy(new ECKey(new BigInteger("0"), eCPointMock, false));
            doReturn(byteArray).when(pubMock).getEncoded();
            doReturn(eCKeyMock).when(target).decrypt((AesKey) any());
            doReturn("return_of_getPrivateKeyAsHex1").when(eCKeyMock).getPrivateKeyAsHex();
            doReturn("return_of_getPrivateKeyAsWiF1").when(eCKeyMock).getPrivateKeyAsWiF(networkMock);
            doReturn(true, false).when(target).isEncrypted();
            doReturn(false).when(target).isPubKeyOnly();
            byte[] byteArray2 = new byte[]{};
            AesKey aesKey = new AesKey(byteArray2);
            //Act Statement(s)
            String result = target.toStringWithPrivate(aesKey, networkMock);
            //Assert statement(s)
            assertThat(result, equalTo("toString_moreObjects.ToStringHelper2"));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            byteUtils.verify(() -> ByteUtils.formatHex(byteArray), atLeast(1));
            verify(pubMock, atLeast(1)).getEncoded();
            verify(target, times(2)).isEncrypted();
            verify(target, atLeast(1)).decrypt((AesKey) any());
            verify(eCKeyMock, atLeast(1)).getPrivateKeyAsHex();
            verify(eCKeyMock, atLeast(1)).getPrivateKeyAsWiF(networkMock);
            verify(target, atLeast(1)).isPubKeyOnly();
        }
    }

    //Sapient generated method id: ${f53b019d-a53e-3c35-9234-a04367bc2912}
    @Ignore()
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
        ECPoint eCPointMock = mock(ECPoint.class, "<ECPoint object>");
        Network networkMock = mock(Network.class, "<Network object>");
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            byteUtils.when(() -> ByteUtils.formatHex(byteArray)).thenReturn("<public key as hexadecimal string>");
            ECKey target = spy(new ECKey(new BigInteger("1234567890"), eCPointMock, true));
            doReturn(byteArray).when(pubMock).getEncoded();
            doReturn(eCKeyMock).when(target).decrypt((AesKey) any());
            doReturn("<private key as hexadecimal string>").when(eCKeyMock).getPrivateKeyAsHex();
            doReturn("<private key as WIF string>").when(eCKeyMock).getPrivateKeyAsWiF(networkMock);
            doReturn(true, false).when(target).isEncrypted();
            doReturn(false).when(target).isPubKeyOnly();
            byte[] byteArray2 = new byte[]{};
            AesKey aesKey = new AesKey(byteArray2);
            //Act Statement(s)
            String result = target.toStringWithPrivate(aesKey, networkMock);
            //Assert statement(s)
            assertThat(result, equalTo("toString_moreObjects.ToStringHelper2"));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            byteUtils.verify(() -> ByteUtils.formatHex(byteArray), atLeast(1));
            verify(pubMock, atLeast(1)).getEncoded();
            verify(target, times(2)).isEncrypted();
            verify(target, atLeast(1)).decrypt((AesKey) any());
            verify(eCKeyMock, atLeast(1)).getPrivateKeyAsHex();
            verify(eCKeyMock, atLeast(1)).getPrivateKeyAsWiF(networkMock);
            verify(target, atLeast(1)).isPubKeyOnly();
        }
    }

    //Sapient generated method id: ${7f603b49-10d4-30e2-9888-4c99700b69fd}
    @Ignore()
    @Test()
    public void toStringWithPrivate1Test() throws Exception {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "<value>");
        Network networkMock = mock(Network.class, "Network");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = spy(new ECKey(new BigInteger("1"), eCPointMock, false));
            byte[] byteArray = new byte[]{};
            AesKey aesKey = new AesKey(byteArray);
            doReturn("return_of_toStringWithPrivate1").when(target).toStringWithPrivate(aesKey, networkMock);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            //Act Statement(s)
            String result = target.toStringWithPrivate(aesKey, networkParameters);
            //Assert statement(s)
            assertThat(result, equalTo("return_of_toStringWithPrivate1"));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            verify(target, atLeast(1)).toStringWithPrivate(aesKey, networkMock);
        }
    }

    //Sapient generated method id: ${278f9d9e-3cb8-34cf-a499-0958a5f74297}
    @Ignore()
    @Test()
    public void getPrivateKeyAsHexTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "<value>");
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            byteUtils.when(() -> ByteUtils.formatHex(byteArray)).thenReturn("");
            ECKey target = spy(new ECKey(new BigInteger("1"), eCPointMock, false));
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
    @Ignore()
    @Test()
    public void getPublicKeyAsHexTest() {
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "");
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            byteUtils.when(() -> ByteUtils.formatHex(byteArray)).thenReturn("");
            ECKey target = new ECKey(new BigInteger("1234567890"), eCPointMock, true);
            doReturn(byteArray).when(pubMock).getEncoded();
            //Act Statement(s)
            String result = target.getPublicKeyAsHex();
            //Assert statement(s)
            assertThat(result, equalTo(""));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            byteUtils.verify(() -> ByteUtils.formatHex(byteArray), atLeast(1));
            verify(pubMock, atLeast(1)).getEncoded();
        }
    }

    //Sapient generated method id: ${5ba3f6bb-a3c2-3448-bce6-5b66b370b8e6}
    @Ignore()
    @Test()
    public void getPrivateKeyAsWiFTest() {
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "0");
        DumpedPrivateKey dumpedPrivateKeyMock = mock(DumpedPrivateKey.class, "getPrivateKeyAsWiF_dumpedPrivateKey1");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = spy(new ECKey(new BigInteger("123456789"), eCPointMock, true));
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
    @Ignore()
    @Test()
    public void getPrivateKeyAsWiF1Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "<ECPoint object>");
        Network networkMock = mock(Network.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = spy(new ECKey(new BigInteger("1"), eCPointMock, false));
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
    @Ignore()
    @Test()
    public void formatKeyWithAddressWhenIncludePrivateKeys() throws Exception {
        /* Branches:
         * (outputScriptType != null) : true
         * (!isCompressed()) : true
         * (creationTime != null) : false
         * (comment != null) : true
         * (includePrivateKeys) : true
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "{}");
        Network networkMock = mock(Network.class, "{}");
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            byteUtils.when(() -> ByteUtils.formatHex(byteArray)).thenReturn("");
            ECKey target = spy(new ECKey(new BigInteger("123456789"), eCPointMock, false));
            doReturn(addressMock).when(target).toAddress(ScriptType.P2PKH, networkMock);
            doReturn(false).when(target).isCompressed();
            doReturn(byteArray).when(target).getPubKeyHash();
            byte[] byteArray2 = new byte[]{};
            AesKey aesKey = new AesKey(byteArray2);
            doReturn("builderItem1").when(target).toStringWithPrivate(aesKey, networkMock);
            StringBuilder stringBuilder = new StringBuilder();
            //Act Statement(s)
            target.formatKeyWithAddress(true, aesKey, stringBuilder, networkMock, ScriptType.P2PKH, "");
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            byteUtils.verify(() -> ByteUtils.formatHex(byteArray), atLeast(1));
            verify(target, atLeast(1)).toAddress(ScriptType.P2PKH, networkMock);
            verify(target, atLeast(1)).isCompressed();
            verify(target, atLeast(1)).getPubKeyHash();
            verify(target, atLeast(1)).toStringWithPrivate(aesKey, networkMock);
        }
    }

    //Sapient generated method id: ${dc218c70-b931-3940-94a6-8902b834f344}
    @Ignore()
    @Test()
    public void formatKeyWithAddressWhenCreationTimeIsNullAndCommentIsNotNullAndIncludePrivateKeys() throws Exception {
        /* Branches:
         * (outputScriptType != null) : false
         * (isCompressed()) : true
         * (!isCompressed()) : true
         * (creationTime != null) : false
         * (comment != null) : true
         * (includePrivateKeys) : true
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "02a8e5c1d7b0f4e3d9f3c3c5d9e6f8c7d9f3c3c5d9e6f8c7d9f3c3c5d9e6f8c7d9f3c3c5d9e6f8c7d9f3c3c5d9e6f8c7d9f3c3c5d9e6f8c7d9f3c3c5d9e6f8c7d9f3c3c5d9e6f8c7d9f3c3c5d9e6f8c7d9f3c3c5d9e6f8c7d9f3c3c5d9e6f8c7");
        Network networkMock = mock(Network.class, "MAINNET");
        Address addressMock2 = mock(Address.class);
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            byteUtils.when(() -> ByteUtils.formatHex(byteArray)).thenReturn("String");
            ECKey target = spy(new ECKey(new BigInteger("1234567890"), eCPointMock, true));
            doReturn(addressMock).when(target).toAddress(ScriptType.P2PKH, networkMock);
            doReturn(addressMock2).when(target).toAddress(ScriptType.P2WPKH, networkMock);
            doReturn(true, false).when(target).isCompressed();
            doReturn(byteArray).when(target).getPubKeyHash();
            byte[] byteArray2 = new byte[]{};
            AesKey aesKey = new AesKey(byteArray2);
            doReturn("builderItem1").when(target).toStringWithPrivate(aesKey, networkMock);
            StringBuilder stringBuilder = new StringBuilder();
            ScriptType scriptType = null;
            //Act Statement(s)
            target.formatKeyWithAddress(true, aesKey, stringBuilder, networkMock, scriptType, "This is a comment");
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            byteUtils.verify(() -> ByteUtils.formatHex(byteArray), atLeast(1));
            verify(target, atLeast(1)).toAddress(ScriptType.P2PKH, networkMock);
            verify(target, times(2)).isCompressed();
            verify(target, atLeast(1)).toAddress(ScriptType.P2WPKH, networkMock);
            verify(target, atLeast(1)).getPubKeyHash();
            verify(target, atLeast(1)).toStringWithPrivate(aesKey, networkMock);
        }
    }

    //Sapient generated method id: ${259a939d-4f14-3519-95b7-a716f1a53ce8}
    @Ignore()
    @Test()
    public void formatKeyWithAddress1Test() throws Exception {
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class, "null");
        Network networkMock = mock(Network.class, "Network");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            ECKey target = spy(new ECKey(new BigInteger("0"), eCPointMock, false));
            byte[] byteArray = new byte[]{};
            AesKey aesKey = new AesKey(byteArray);
            StringBuilder stringBuilder = new StringBuilder();
            doNothing().when(target).formatKeyWithAddress(false, aesKey, stringBuilder, networkMock, ScriptType.P2PKH, "");
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            //Act Statement(s)
            target.formatKeyWithAddress(false, aesKey, stringBuilder, networkParameters, ScriptType.P2PKH, "");
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(1));
            verify(target).formatKeyWithAddress(false, aesKey, stringBuilder, networkMock, ScriptType.P2PKH, "");
        }
    }
}
