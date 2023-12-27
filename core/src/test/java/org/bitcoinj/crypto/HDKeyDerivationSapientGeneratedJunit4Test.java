package org.bitcoinj.crypto;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;

import java.math.BigInteger;

import org.bitcoinj.base.internal.ByteUtils;
import org.bouncycastle.crypto.params.ECDomainParameters;

import java.util.ArrayList;

import org.mockito.stubbing.Answer;
import org.bitcoinj.base.internal.Preconditions;

import java.util.stream.Stream;
import java.util.function.Supplier;

import org.mockito.MockedStatic;
import org.bouncycastle.crypto.macs.HMac;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class HDKeyDerivationSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final ChildNumber childNumberMock = mock(ChildNumber.class);

    private final DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);

    private final DeterministicKey deterministicKeyMock2 = mock(DeterministicKey.class);

    private final ECPoint eCPointMock = mock(ECPoint.class);

    private final HDKeyDerivation.RawKeyBytes hDKeyDerivationRawKeyBytesMock = mock(HDKeyDerivation.RawKeyBytes.class);

    private final HMac hMacMock = mock(HMac.class, "UnknownObjectContent{target='org.bouncycastle.crypto.macs.HMac', onlyPojoFunctions=false, builderPattern=false}");

    private final DeterministicKey parentMock = mock(DeterministicKey.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    private final HDPath hDPathMock = mock(HDPath.class);

    private final HDPath hDPathMock2 = mock(HDPath.class);

    //Sapient generated method id: ${86570818-8d4b-3aa8-b29e-b79ed980b8a8}
    @Ignore()
    @Test()
    public void createMasterPrivateKeyWhenILengthEquals64ThrowsIllegalStateException() throws HDDerivationException {
        /* Branches:
         * (seed.length > 8) : true
         * (i.length == 64) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<HDUtils> hDUtils = mockStatic(HDUtils.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{(byte) 66, (byte) 105, (byte) 116, (byte) 99, (byte) 111, (byte) 105, (byte) 110, (byte) 32, (byte) 115, (byte) 101, (byte) 101, (byte) 100};
            hDUtils.when(() -> HDUtils.createHmacSha512Digest(byteArray)).thenReturn(hMacMock);
            byte[] byteArray2 = new byte[]{(byte) 0};
            byte[] byteArray3 = new byte[]{(byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9};
            hDUtils.when(() -> HDUtils.hmacSha512(hMacMock, byteArray3)).thenReturn(byteArray2);
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenThrow(illegalStateException);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            HDKeyDerivation.createMasterPrivateKey(byteArray3);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            hDUtils.verify(() -> HDUtils.createHmacSha512Digest(byteArray), atLeast(1));
            hDUtils.verify(() -> HDUtils.hmacSha512(hMacMock, byteArray3), atLeast(1));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${8f0a9c19-dae7-3ce6-b554-ce30c2e9d62c}
    @Test()
    public void createMasterPrivateKeyWhenSeedLengthNotGreaterThan8AndILengthNotEquals64ThrowsIllegalStateException() throws HDDerivationException {
        /* Branches:
         * (seed.length > 8) : false
         * (i.length == 64) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<HDUtils> hDUtils = mockStatic(HDUtils.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{(byte) 66, (byte) 105, (byte) 116, (byte) 99, (byte) 111, (byte) 105, (byte) 110, (byte) 32, (byte) 115, (byte) 101, (byte) 101, (byte) 100};
            hDUtils.when(() -> HDUtils.createHmacSha512Digest(byteArray)).thenReturn(hMacMock);
            byte[] byteArray2 = new byte[]{(byte) 0};
            byte[] byteArray3 = new byte[]{(byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16};
            hDUtils.when(() -> HDUtils.hmacSha512(hMacMock, byteArray3)).thenReturn(byteArray2);
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenThrow(illegalStateException);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            HDKeyDerivation.createMasterPrivateKey(byteArray3);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            hDUtils.verify(() -> HDUtils.createHmacSha512Digest(byteArray), atLeast(1));
            hDUtils.verify(() -> HDUtils.hmacSha512(hMacMock, byteArray3), atLeast(1));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${f09e6c86-91c2-302e-b830-3598adae1dc5}
    @Test()
    public void createMasterPrivKeyFromBytesWhenIntegerCompareToECKeyCURVEGetNGreaterThan0ThrowsHDDerivationException() throws HDDerivationException {
        /* Branches:
         * (integer.equals(BigInteger.ZERO)) : false  #  inside assertNonZero method
         * (integer.compareTo(ECKey.CURVE.getN()) > 0) : true  #  inside assertLessThanN method
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            byteUtils.when(() -> ByteUtils.bytesToBigInteger(byteArray)).thenReturn(new BigInteger("115792089237316195423570985008687907852837564279074904382605163141518161494338"));
            HDDerivationException hDDerivationException = new HDDerivationException("Generated master key is invalid.");
            thrown.expect(HDDerivationException.class);
            thrown.expectMessage(hDDerivationException.getMessage());
            byte[] byteArray2 = new byte[]{(byte) 0};
            //Act Statement(s)
            HDKeyDerivation.createMasterPrivKeyFromBytes(byteArray, byteArray2);
            //Assert statement(s)
            byteUtils.verify(() -> ByteUtils.bytesToBigInteger(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${8d5a29ba-71f9-3a0e-98b8-1293951e4e31}
    @Ignore()
    @Test()
    public void createMasterPrivKeyFromBytesWhenIntegerCompareToECKeyCURVEGetNNotGreaterThan0() throws HDDerivationException {
        /* Branches:
         * (integer.equals(BigInteger.ZERO)) : false  #  inside assertNonZero method
         * (integer.compareTo(ECKey.CURVE.getN()) > 0) : false  #  inside assertLessThanN method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byte[] byteArray = new byte[]{};
            byteUtils.when(() -> ByteUtils.bytesToBigInteger(byteArray)).thenReturn(new BigInteger("115792089237316195423570985008687907852837564279074904382605163141518161494337"));
            HDPath hDPath2 = HDPath.m();
            hDPath.when(() -> HDPath.m()).thenReturn(hDPath2);
            byte[] byteArray2 = new byte[]{};
            //Act Statement(s)
            DeterministicKey result = HDKeyDerivation.createMasterPrivKeyFromBytes(byteArray, byteArray2);
            DeterministicKey deterministicKey = new DeterministicKey(hDPath2, byteArray2, new BigInteger("115792089237316195423570985008687907852837564279074904382605163141518161494337"), (DeterministicKey) null);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKey));
            byteUtils.verify(() -> ByteUtils.bytesToBigInteger(byteArray), atLeast(1));
            hDPath.verify(() -> HDPath.m(), atLeast(1));
        }
    }

    //Sapient generated method id: ${3292e57a-1198-3307-912f-bcc8ec7db38e}
    @Ignore()
    @Test()
    public void createMasterPubKeyFromBytesTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            List list = new ArrayList<>();
            HDPath hDPath2 = new HDPath(false, list);
            hDPath.when(() -> HDPath.M()).thenReturn(hDPath2);
            byte[] byteArray = new byte[]{(byte) 2, (byte) 63, (byte) 74, (byte) 92, (byte) 110, (byte) 127, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 17, (byte) 34, (byte) 51, (byte) 68, (byte) 85, (byte) 102, (byte) 119, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            byte[] byteArray2 = new byte[]{(byte) 1, (byte) 35, (byte) 69, (byte) 103, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 118, (byte) 84, (byte) 50, (byte) 16};
            //Act Statement(s)
            DeterministicKey result = HDKeyDerivation.createMasterPubKeyFromBytes(byteArray, byteArray2);
            ECDomainParameters eCDomainParameters = ECKey.CURVE;
            ECCurve eCCurve = eCDomainParameters.getCurve();
            LazyECPoint lazyECPoint = new LazyECPoint(eCCurve, byteArray);
            DeterministicKey deterministicKey = new DeterministicKey(hDPath2, byteArray2, lazyECPoint, (BigInteger) null, (DeterministicKey) null);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKey));
            hDPath.verify(() -> HDPath.M(), atLeast(1));
        }
    }

    //Sapient generated method id: ${6845f396-d664-3b2c-bed4-52fe4f57494a}
    @Test()
    public void deriveChildKeyTest() {
        //Arrange Statement(s)
        DeterministicKey deterministicKeyMock2 = mock(DeterministicKey.class);
        try (MockedStatic<HDKeyDerivation> hDKeyDerivation = mockStatic(HDKeyDerivation.class, CALLS_REAL_METHODS)) {
            hDKeyDerivation.when(() -> HDKeyDerivation.deriveChildKey(eq(deterministicKeyMock2), (ChildNumber) any())).thenReturn(deterministicKeyMock);
            //Act Statement(s)
            DeterministicKey result = HDKeyDerivation.deriveChildKey(deterministicKeyMock2, 0);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyMock));
            hDKeyDerivation.verify(() -> HDKeyDerivation.deriveChildKey(eq(deterministicKeyMock2), (ChildNumber) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${8f1362bc-0609-3291-9e07-c7167958b4fe}
    @Test()
    public void deriveThisOrNextChildKeyWhenNAttemptsLessThanMAX_CHILD_DERIVATION_ATTEMPTS() {
        /* Branches:
         * (nAttempts < MAX_CHILD_DERIVATION_ATTEMPTS) : true
         */
        //Arrange Statement(s)
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class, "UnknownObjectContent{target='org.bitcoinj.crypto.DeterministicKey', onlyPojoFunctions=false, builderPattern=false}");
        DeterministicKey deterministicKeyMock2 = mock(DeterministicKey.class, "new DeterministicKey()");
        try (MockedStatic<HDKeyDerivation> hDKeyDerivation = mockStatic(HDKeyDerivation.class, CALLS_REAL_METHODS)) {
            hDKeyDerivation.when(() -> HDKeyDerivation.deriveChildKey(eq(deterministicKeyMock2), (ChildNumber) any())).thenReturn(deterministicKeyMock);
            //Act Statement(s)
            DeterministicKey result = HDKeyDerivation.deriveThisOrNextChildKey(deterministicKeyMock2, 0);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyMock));
            hDKeyDerivation.verify(() -> HDKeyDerivation.deriveChildKey(eq(deterministicKeyMock2), (ChildNumber) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${f5fa0828-5949-301b-8403-fc2d54d898e8}
    @Ignore()
    @Test()
    public void generateTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        Stream<DeterministicKey> result = HDKeyDerivation.generate(deterministicKeyMock, 0);
        Stream stream = Stream.empty();

        //Assert statement(s)
        //TODO: Please implement equals method in Stream for verification to succeed or you need to adjust respective assertion statements
        assertThat(result, equalTo(stream));
    }

    //Sapient generated method id: ${46543bce-0cbc-3f4d-b588-858be8039458}
    @Test()
    public void deriveChildKey1WhenParentNotHasPrivKey() throws HDDerivationException {
        /* Branches:
         * (!parent.hasPrivKey()) : true
         */
        //Arrange Statement(s)
        DeterministicKey parentMock = mock(DeterministicKey.class, "M");
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class, "UnknownObjectContent{target='org.bitcoinj.crypto.DeterministicKey', onlyPojoFunctions=false, builderPattern=false}");
        try (MockedStatic<HDKeyDerivation> hDKeyDerivation = mockStatic(HDKeyDerivation.class, CALLS_REAL_METHODS)) {
            doReturn(false).when(parentMock).hasPrivKey();
            ChildNumber childNumber = new ChildNumber(1);
            hDKeyDerivation.when(() -> HDKeyDerivation.deriveChildKeyFromPublic(parentMock, childNumber, HDKeyDerivation.PublicDeriveMode.NORMAL)).thenReturn(deterministicKeyMock);
            //Act Statement(s)
            DeterministicKey result = HDKeyDerivation.deriveChildKey(parentMock, childNumber);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyMock));
            verify(parentMock, atLeast(1)).hasPrivKey();
            hDKeyDerivation.verify(() -> HDKeyDerivation.deriveChildKeyFromPublic(parentMock, childNumber, HDKeyDerivation.PublicDeriveMode.NORMAL), atLeast(1));
        }
    }

    //Sapient generated method id: ${9a396e6b-6838-3906-85ce-615bc17146b5}
    @Test()
    public void deriveChildKey1WhenParentHasPrivKey() throws HDDerivationException {
        /* Branches:
         * (!parent.hasPrivKey()) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<HDKeyDerivation> hDKeyDerivation = mockStatic(HDKeyDerivation.class, CALLS_REAL_METHODS)) {
            doReturn(true).when(parentMock).hasPrivKey();
            hDKeyDerivation.when(() -> HDKeyDerivation.deriveChildKeyFromPrivate(parentMock, childNumberMock)).thenReturn(deterministicKeyMock);
            //Act Statement(s)
            DeterministicKey result = HDKeyDerivation.deriveChildKey(parentMock, childNumberMock);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyMock));
            verify(parentMock, atLeast(1)).hasPrivKey();
            hDKeyDerivation.verify(() -> HDKeyDerivation.deriveChildKeyFromPrivate(parentMock, childNumberMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${e3c04c0d-aa25-314f-8936-207fbd87f5c0}
    @Ignore()
    @Test()
    public void deriveChildKeyFromPrivateTest() throws HDDerivationException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey parentMock = mock(DeterministicKey.class, "null");
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<HDKeyDerivation> hDKeyDerivation = mockStatic(HDKeyDerivation.class, CALLS_REAL_METHODS)) {
            List list = new ArrayList<>();
            HDPath hDPath = new HDPath(false, list);
            doReturn(hDPath).when(parentMock).getPath();
            ChildNumber childNumber = new ChildNumber(0);
            hDKeyDerivation.when(() -> HDKeyDerivation.deriveChildKeyBytesFromPrivate(parentMock, childNumber)).thenReturn(hDKeyDerivationRawKeyBytesMock);
            byte[] byteArray = new byte[]{};
            byteUtils.when(() -> ByteUtils.bytesToBigInteger(byteArray)).thenReturn(new BigInteger("0"));
            //Act Statement(s)
            DeterministicKey result = HDKeyDerivation.deriveChildKeyFromPrivate(parentMock, childNumber);
            List list2 = new ArrayList<>();
            HDPath hDPath2 = new HDPath(false, list2);
            byte[] byteArray2 = new byte[]{};
            DeterministicKey deterministicKey = new DeterministicKey(hDPath2, byteArray2, new BigInteger("0"), parentMock);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKey));
            verify(parentMock, atLeast(1)).getPath();
            hDKeyDerivation.verify(() -> HDKeyDerivation.deriveChildKeyBytesFromPrivate(parentMock, childNumber), atLeast(1));
            byteUtils.verify(() -> ByteUtils.bytesToBigInteger(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${785e12a0-4928-3829-98c7-9c9c05d4b35c}
    @Ignore()
    @Test()
    public void deriveChildKeyFromPublicTest() throws HDDerivationException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        try (MockedStatic<HDKeyDerivation> hDKeyDerivation = mockStatic(HDKeyDerivation.class, CALLS_REAL_METHODS)) {
            List list = new ArrayList<>();
            HDPath hDPath = new HDPath(false, list);
            doReturn(hDPath).when(parentMock).getPath();
            hDKeyDerivation.when(() -> HDKeyDerivation.deriveChildKeyBytesFromPublic(parentMock, childNumberMock, HDKeyDerivation.PublicDeriveMode.NORMAL)).thenReturn(hDKeyDerivationRawKeyBytesMock);
            //Act Statement(s)
            DeterministicKey result = HDKeyDerivation.deriveChildKeyFromPublic(parentMock, childNumberMock, HDKeyDerivation.PublicDeriveMode.NORMAL);
            List list2 = new ArrayList<>();
            HDPath hDPath2 = new HDPath(false, list2);
            byte[] byteArray = new byte[]{};
            ECDomainParameters eCDomainParameters = ECKey.CURVE;
            ECCurve eCCurve = eCDomainParameters.getCurve();
            byte[] byteArray2 = new byte[]{};
            LazyECPoint lazyECPoint = new LazyECPoint(eCCurve, byteArray2);
            DeterministicKey deterministicKey = new DeterministicKey(hDPath2, byteArray, lazyECPoint, (BigInteger) null, parentMock);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKey));
            verify(parentMock, atLeast(1)).getPath();
            hDKeyDerivation.verify(() -> HDKeyDerivation.deriveChildKeyBytesFromPublic(parentMock, childNumberMock, HDKeyDerivation.PublicDeriveMode.NORMAL), atLeast(1));
        }
    }
}
