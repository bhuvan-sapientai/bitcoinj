package org.bitcoinj.crypto;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;

import java.math.BigInteger;

import org.bitcoinj.base.internal.ByteUtils;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.mockito.stubbing.Answer;
import org.bitcoinj.base.internal.TimeUtils;
import org.bitcoinj.base.internal.Preconditions;

import java.util.stream.Stream;
import java.util.function.Supplier;

import org.mockito.MockedStatic;
import org.bouncycastle.crypto.macs.HMac;

import java.time.Instant;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

public class HDKeyDerivationSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final ChildNumber childNumberMock = mock(ChildNumber.class);

    private final DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);

    private final DeterministicKey deterministicKeyMock2 = mock(DeterministicKey.class);

    private final ECPoint eCPointMock = mock(ECPoint.class);

    private final ECPoint eCPointMock2 = mock(ECPoint.class);

    private final ECPoint eCPointMock3 = mock(ECPoint.class);

    private final HDPath hDPathMock = mock(HDPath.class);

    private final HDPath hDPathMock2 = mock(HDPath.class);

    private final HMac hMacMock = mock(HMac.class);

    private final DeterministicKey parentMock = mock(DeterministicKey.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${33e4384f-b340-362b-b436-f8791ed4aa23}, hash: 2566D1D11810ABB52CC3F0E5AB22F51D
    @Test()
    public void createMasterPrivateKeyWhenSeedLengthNotGreaterThan8ThrowsIllegalArgumentException() throws HDDerivationException {
        /* Branches:
         * (seed.length > 8) : false
         */
        //Arrange Statement(s)
        thrown.expect(IllegalArgumentException.class);
        byte[] byteArray = new byte[]{(byte) 0};
        //Act Statement(s)
        HDKeyDerivation.createMasterPrivateKey(byteArray);
    }

    //Sapient generated method id: ${df36f5c5-24e9-331d-868c-0ca59c300dd6}, hash: 6985A4A5EF9290536D85AE4126239EF9
    @Ignore()
    @Test()
    public void createMasterPrivateKeyWhenILengthEquals64() throws HDDerivationException {
        /* Branches:
         * (seed.length > 8) : true
         * (i.length == 64) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<HDKeyDerivation> hDKeyDerivation = mockStatic(HDKeyDerivation.class, CALLS_REAL_METHODS);
             MockedStatic<HDUtils> hDUtils = mockStatic(HDUtils.class)) {
            byte[] byteArray = new byte[]{(byte) 66, (byte) 105, (byte) 116, (byte) 99, (byte) 111, (byte) 105, (byte) 110, (byte) 32, (byte) 115, (byte) 101, (byte) 101, (byte) 100};
            hDUtils.when(() -> HDUtils.createHmacSha512Digest(byteArray)).thenReturn(hMacMock);
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 37, (byte) 38, (byte) 39, (byte) 40, (byte) 41, (byte) 42, (byte) 43, (byte) 44, (byte) 45, (byte) 46, (byte) 47, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 58, (byte) 59, (byte) 60, (byte) 61, (byte) 62, (byte) 63};
            byte[] byteArray3 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8};
            hDUtils.when(() -> HDUtils.hmacSha512(hMacMock, byteArray3)).thenReturn(byteArray2);
            byte[] byteArray4 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            byte[] byteArray5 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            hDKeyDerivation.when(() -> HDKeyDerivation.createMasterPrivKeyFromBytes(byteArray4, byteArray5)).thenReturn(deterministicKeyMock);
            doNothing().when(deterministicKeyMock).setCreationTime((Instant) any());
            //Act Statement(s)
            DeterministicKey result = HDKeyDerivation.createMasterPrivateKey(byteArray3);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyMock));
            hDUtils.verify(() -> HDUtils.createHmacSha512Digest(byteArray), atLeast(1));
            hDUtils.verify(() -> HDUtils.hmacSha512(hMacMock, byteArray3), atLeast(1));
            hDKeyDerivation.verify(() -> HDKeyDerivation.createMasterPrivKeyFromBytes(byteArray4, byteArray5), atLeast(1));
            verify(deterministicKeyMock, atLeast(1)).setCreationTime((Instant) any());
        }
    }

    //Sapient generated method id: ${e13ebcb2-943c-31dc-8491-f815809e7e5b}, hash: A084177FED60DB725A0D68B346D832F8
    @Test()
    public void createMasterPrivateKeyWhenILengthNotEquals64ThrowsIllegalStateException() throws HDDerivationException {
        /* Branches:
         * (seed.length > 8) : true
         * (i.length == 64) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<HDUtils> hDUtils = mockStatic(HDUtils.class)) {
            byte[] byteArray = new byte[]{(byte) 66, (byte) 105, (byte) 116, (byte) 99, (byte) 111, (byte) 105, (byte) 110, (byte) 32, (byte) 115, (byte) 101, (byte) 101, (byte) 100};
            hDUtils.when(() -> HDUtils.createHmacSha512Digest(byteArray)).thenReturn(hMacMock);
            byte[] byteArray2 = new byte[]{(byte) 0};
            byte[] byteArray3 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8};
            hDUtils.when(() -> HDUtils.hmacSha512(hMacMock, byteArray3)).thenReturn(byteArray2);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            HDKeyDerivation.createMasterPrivateKey(byteArray3);
            //Assert statement(s)
            hDUtils.verify(() -> HDUtils.createHmacSha512Digest(byteArray), atLeast(1));
            hDUtils.verify(() -> HDUtils.hmacSha512(hMacMock, byteArray3), atLeast(1));
        }
    }

    //Sapient generated method id: ${56333969-2a8b-31b9-b888-f382d7bae6ab}, hash: A7795F9A51EFAF04AD250EECB34286EC
    @Test()
    public void createMasterPrivKeyFromBytesWhenIntegerEqualsBigIntegerZEROThrowsHDDerivationException() throws HDDerivationException {
        /* Branches:
         * (integer.equals(BigInteger.ZERO)) : true  #  inside assertNonZero method
         */
        //Arrange Statement(s)
        HDDerivationException hDDerivationException = new HDDerivationException("Generated master key is invalid.");
        thrown.expect(HDDerivationException.class);
        thrown.expectMessage(hDDerivationException.getMessage());
        byte[] byteArray = new byte[]{};
        byte[] byteArray2 = new byte[]{};
        //Act Statement(s)
        HDKeyDerivation.createMasterPrivKeyFromBytes(byteArray, byteArray2);
    }

    //Sapient generated method id: ${f09e6c86-91c2-302e-b830-3598adae1dc5}, hash: 38B6D66503436974BAB77CD836352844
    @Test()
    public void createMasterPrivKeyFromBytesWhenIntegerCompareToECKeyCURVEGetNGreaterThan0ThrowsHDDerivationException() throws HDDerivationException {
        /* Branches:
         * (integer.equals(BigInteger.ZERO)) : false  #  inside assertNonZero method
         * (integer.compareTo(ECKey.CURVE.getN()) > 0) : true  #  inside assertLessThanN method
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byte[] byteArray = new byte[]{};
            byteUtils.when(() -> ByteUtils.bytesToBigInteger(byteArray)).thenReturn(new BigInteger("115792089237316195423570985008687907852837564279074904382605163141518161494338"));
            HDDerivationException hDDerivationException = new HDDerivationException("Generated master key is invalid.");
            thrown.expect(HDDerivationException.class);
            thrown.expectMessage(hDDerivationException.getMessage());
            byte[] byteArray2 = new byte[]{};
            //Act Statement(s)
            HDKeyDerivation.createMasterPrivKeyFromBytes(byteArray, byteArray2);
            //Assert statement(s)
            byteUtils.verify(() -> ByteUtils.bytesToBigInteger(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${8d5a29ba-71f9-3a0e-98b8-1293951e4e31}, hash: 28CC23AB7C62F9D8306D57555336C604
    @Ignore()
    @Test()
    public void createMasterPrivKeyFromBytesWhenIntegerCompareToECKeyCURVEGetNNotGreaterThan0() throws HDDerivationException {
        /* Branches:
         * (integer.equals(BigInteger.ZERO)) : false  #  inside assertNonZero method
         * (integer.compareTo(ECKey.CURVE.getN()) > 0) : false  #  inside assertLessThanN method
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.bitcoinj.crypto.DeterministicKey
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byte[] byteArray = new byte[]{};
            byteUtils.when(() -> ByteUtils.bytesToBigInteger(byteArray)).thenReturn(new BigInteger("1"));
            byte[] byteArray2 = new byte[]{};
            //Act Statement(s)
            DeterministicKey result = HDKeyDerivation.createMasterPrivKeyFromBytes(byteArray, byteArray2);
            HDPath hDPath = HDPath.m();
            DeterministicKey deterministicKey = new DeterministicKey(hDPath, byteArray2, new BigInteger("1"), (DeterministicKey) null);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKey));
            byteUtils.verify(() -> ByteUtils.bytesToBigInteger(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${3292e57a-1198-3307-912f-bcc8ec7db38e}, hash: C2DFF238DA9BD32741982E40D8553AEB
    @Ignore()
    @Test()
    public void createMasterPubKeyFromBytesTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.bitcoinj.crypto.LazyECPoint
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        byte[] byteArray2 = new byte[]{};
        //Act Statement(s)
        DeterministicKey result = HDKeyDerivation.createMasterPubKeyFromBytes(byteArray, byteArray2);
        HDPath hDPath = HDPath.M();
        ECDomainParameters eCDomainParameters = ECKey.CURVE;
        ECCurve eCCurve = eCDomainParameters.getCurve();
        LazyECPoint lazyECPoint = new LazyECPoint(eCCurve, byteArray);
        DeterministicKey deterministicKey = new DeterministicKey(hDPath, byteArray2, lazyECPoint, (BigInteger) null, (DeterministicKey) null);
        //Assert statement(s)
        assertThat(result, equalTo(deterministicKey));
    }

    //Sapient generated method id: ${6845f396-d664-3b2c-bed4-52fe4f57494a}, hash: 53410E2874E49B288E6A659CD8934BB5
    @Test()
    public void deriveChildKeyTest() {
        //Arrange Statement(s)
        try (MockedStatic<HDKeyDerivation> hDKeyDerivation = mockStatic(HDKeyDerivation.class, CALLS_REAL_METHODS)) {
            hDKeyDerivation.when(() -> HDKeyDerivation.deriveChildKey(eq(deterministicKeyMock2), (ChildNumber) any())).thenReturn(deterministicKeyMock);
            //Act Statement(s)
            DeterministicKey result = HDKeyDerivation.deriveChildKey(deterministicKeyMock2, 0);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyMock));
            hDKeyDerivation.verify(() -> HDKeyDerivation.deriveChildKey(eq(deterministicKeyMock2), (ChildNumber) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${8f1362bc-0609-3291-9e07-c7167958b4fe}, hash: CC789AFDA4C14FE1A91CABF6A2DADC0F
    @Test()
    public void deriveThisOrNextChildKeyWhenNAttemptsLessThanMAX_CHILD_DERIVATION_ATTEMPTS() {
        /* Branches:
         * (nAttempts < MAX_CHILD_DERIVATION_ATTEMPTS) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<HDKeyDerivation> hDKeyDerivation = mockStatic(HDKeyDerivation.class, CALLS_REAL_METHODS)) {
            hDKeyDerivation.when(() -> HDKeyDerivation.deriveChildKey(eq(deterministicKeyMock2), (ChildNumber) any())).thenReturn(deterministicKeyMock);
            //Act Statement(s)
            DeterministicKey result = HDKeyDerivation.deriveThisOrNextChildKey(deterministicKeyMock2, 0);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyMock));
            hDKeyDerivation.verify(() -> HDKeyDerivation.deriveChildKey(eq(deterministicKeyMock2), (ChildNumber) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${6f52aab3-2070-3a62-bdd2-7d81073eee98}, hash: D38A012A336DD85DD12F11F86FBF6686
    @Ignore()
    @Test()
    public void deriveThisOrNextChildKeyWhenCaughtHDDerivationExceptionThrowsHDDerivationException() {
        /* Branches:
         * (nAttempts < MAX_CHILD_DERIVATION_ATTEMPTS) : true
         * (catch-exception (HDDerivationException)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: child
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey deterministicKeyMock3 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock4 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock5 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock6 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock7 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock8 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock9 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock10 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock11 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock12 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock13 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock14 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock15 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock16 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock17 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock18 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock19 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock20 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock21 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock22 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock23 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock24 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock25 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock26 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock27 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock28 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock29 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock30 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock31 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock32 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock33 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock34 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock35 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock36 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock37 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock38 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock39 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock40 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock41 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock42 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock43 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock44 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock45 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock46 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock47 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock48 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock49 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock50 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock51 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock52 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock53 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock54 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock55 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock56 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock57 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock58 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock59 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock60 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock61 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock62 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock63 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock64 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock65 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock66 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock67 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock68 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock69 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock70 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock71 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock72 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock73 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock74 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock75 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock76 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock77 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock78 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock79 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock80 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock81 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock82 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock83 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock84 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock85 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock86 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock87 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock88 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock89 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock90 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock91 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock92 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock93 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock94 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock95 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock96 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock97 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock98 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock99 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock100 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock101 = mock(DeterministicKey.class);
        try (MockedStatic<HDKeyDerivation> hDKeyDerivation = mockStatic(HDKeyDerivation.class, CALLS_REAL_METHODS)) {
            hDKeyDerivation.when(() -> HDKeyDerivation.deriveChildKey(eq(deterministicKeyMock2), (ChildNumber) any())).thenReturn(deterministicKeyMock).thenReturn(deterministicKeyMock3).thenReturn(deterministicKeyMock4).thenReturn(deterministicKeyMock5).thenReturn(deterministicKeyMock6).thenReturn(deterministicKeyMock7).thenReturn(deterministicKeyMock8).thenReturn(deterministicKeyMock9).thenReturn(deterministicKeyMock10).thenReturn(deterministicKeyMock11).thenReturn(deterministicKeyMock12).thenReturn(deterministicKeyMock13).thenReturn(deterministicKeyMock14).thenReturn(deterministicKeyMock15).thenReturn(deterministicKeyMock16).thenReturn(deterministicKeyMock17).thenReturn(deterministicKeyMock18).thenReturn(deterministicKeyMock19).thenReturn(deterministicKeyMock20).thenReturn(deterministicKeyMock21).thenReturn(deterministicKeyMock22).thenReturn(deterministicKeyMock23).thenReturn(deterministicKeyMock24).thenReturn(deterministicKeyMock25).thenReturn(deterministicKeyMock26).thenReturn(deterministicKeyMock27).thenReturn(deterministicKeyMock28).thenReturn(deterministicKeyMock29).thenReturn(deterministicKeyMock30).thenReturn(deterministicKeyMock31).thenReturn(deterministicKeyMock32).thenReturn(deterministicKeyMock33).thenReturn(deterministicKeyMock34).thenReturn(deterministicKeyMock35).thenReturn(deterministicKeyMock36).thenReturn(deterministicKeyMock37).thenReturn(deterministicKeyMock38).thenReturn(deterministicKeyMock39).thenReturn(deterministicKeyMock40).thenReturn(deterministicKeyMock41).thenReturn(deterministicKeyMock42).thenReturn(deterministicKeyMock43).thenReturn(deterministicKeyMock44).thenReturn(deterministicKeyMock45).thenReturn(deterministicKeyMock46).thenReturn(deterministicKeyMock47).thenReturn(deterministicKeyMock48).thenReturn(deterministicKeyMock49).thenReturn(deterministicKeyMock50).thenReturn(deterministicKeyMock51).thenReturn(deterministicKeyMock52).thenReturn(deterministicKeyMock53).thenReturn(deterministicKeyMock54).thenReturn(deterministicKeyMock55).thenReturn(deterministicKeyMock56).thenReturn(deterministicKeyMock57).thenReturn(deterministicKeyMock58).thenReturn(deterministicKeyMock59).thenReturn(deterministicKeyMock60).thenReturn(deterministicKeyMock61).thenReturn(deterministicKeyMock62).thenReturn(deterministicKeyMock63).thenReturn(deterministicKeyMock64).thenReturn(deterministicKeyMock65).thenReturn(deterministicKeyMock66).thenReturn(deterministicKeyMock67).thenReturn(deterministicKeyMock68).thenReturn(deterministicKeyMock69).thenReturn(deterministicKeyMock70).thenReturn(deterministicKeyMock71).thenReturn(deterministicKeyMock72).thenReturn(deterministicKeyMock73).thenReturn(deterministicKeyMock74).thenReturn(deterministicKeyMock75).thenReturn(deterministicKeyMock76).thenReturn(deterministicKeyMock77).thenReturn(deterministicKeyMock78).thenReturn(deterministicKeyMock79).thenReturn(deterministicKeyMock80).thenReturn(deterministicKeyMock81).thenReturn(deterministicKeyMock82).thenReturn(deterministicKeyMock83).thenReturn(deterministicKeyMock84).thenReturn(deterministicKeyMock85).thenReturn(deterministicKeyMock86).thenReturn(deterministicKeyMock87).thenReturn(deterministicKeyMock88).thenReturn(deterministicKeyMock89).thenReturn(deterministicKeyMock90).thenReturn(deterministicKeyMock91).thenReturn(deterministicKeyMock92).thenReturn(deterministicKeyMock93).thenReturn(deterministicKeyMock94).thenReturn(deterministicKeyMock95).thenReturn(deterministicKeyMock96).thenReturn(deterministicKeyMock97).thenReturn(deterministicKeyMock98).thenReturn(deterministicKeyMock99).thenReturn(deterministicKeyMock100).thenReturn(deterministicKeyMock101);
            HDDerivationException hDDerivationException = new HDDerivationException("Maximum number of child derivation attempts reached, this is probably an indication of a bug.");
            thrown.expect(HDDerivationException.class);
            thrown.expectMessage(hDDerivationException.getMessage());
            //Act Statement(s)
            HDKeyDerivation.deriveThisOrNextChildKey(deterministicKeyMock2, 0);
            //Assert statement(s)
            hDKeyDerivation.verify(() -> HDKeyDerivation.deriveChildKey(eq(deterministicKeyMock2), (ChildNumber) any()), atLeast(100));
        }
    }

    //Sapient generated method id: ${f5fa0828-5949-301b-8403-fc2d54d898e8}, hash: 0CB766AEC4FBE7B5EED97203E7070491
    @Test()
    public void generateTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Stream<DeterministicKey> result = HDKeyDerivation.generate(deterministicKeyMock, 0);
        //Assert statement(s)
        //TODO: Please implement equals method in Stream for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${46543bce-0cbc-3f4d-b588-858be8039458}, hash: 27566D25B3B610280053C309A546EA25
    @Test()
    public void deriveChildKey1WhenParentNotHasPrivKey() throws HDDerivationException {
        /* Branches:
         * (!parent.hasPrivKey()) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<HDKeyDerivation> hDKeyDerivation = mockStatic(HDKeyDerivation.class, CALLS_REAL_METHODS)) {
            doReturn(false).when(parentMock).hasPrivKey();
            hDKeyDerivation.when(() -> HDKeyDerivation.deriveChildKeyFromPublic(parentMock, childNumberMock, HDKeyDerivation.PublicDeriveMode.NORMAL)).thenReturn(deterministicKeyMock);
            //Act Statement(s)
            DeterministicKey result = HDKeyDerivation.deriveChildKey(parentMock, childNumberMock);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyMock));
            verify(parentMock, atLeast(1)).hasPrivKey();
            hDKeyDerivation.verify(() -> HDKeyDerivation.deriveChildKeyFromPublic(parentMock, childNumberMock, HDKeyDerivation.PublicDeriveMode.NORMAL), atLeast(1));
        }
    }

    //Sapient generated method id: ${9a396e6b-6838-3906-85ce-615bc17146b5}, hash: 55DCD60875F9F195AF08DE1203889886
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

    //Sapient generated method id: ${e3c04c0d-aa25-314f-8936-207fbd87f5c0}, hash: 627FA9964ECF22641619DDF57EDBF26A
    @Ignore()
    @Test()
    public void deriveChildKeyFromPrivateTest() throws HDDerivationException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.bitcoinj.crypto.DeterministicKey
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDKeyDerivation> hDKeyDerivation = mockStatic(HDKeyDerivation.class, CALLS_REAL_METHODS)) {
            doReturn(hDPathMock).when(parentMock).getPath();
            ChildNumber[] childNumberArray = new ChildNumber[]{};
            doReturn(hDPathMock2).when(hDPathMock).extend(childNumberMock, childNumberArray);
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{};
            HDKeyDerivation.RawKeyBytes hDKeyDerivationRawKeyBytes = new HDKeyDerivation.RawKeyBytes(byteArray, byteArray2);
            hDKeyDerivation.when(() -> HDKeyDerivation.deriveChildKeyBytesFromPrivate(parentMock, childNumberMock)).thenReturn(hDKeyDerivationRawKeyBytes);
            //Act Statement(s)
            DeterministicKey result = HDKeyDerivation.deriveChildKeyFromPrivate(parentMock, childNumberMock);
            DeterministicKey deterministicKey = new DeterministicKey(hDPathMock2, byteArray2, new BigInteger("0"), parentMock);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKey));
            verify(parentMock, atLeast(1)).getPath();
            verify(hDPathMock, atLeast(1)).extend(childNumberMock, childNumberArray);
            hDKeyDerivation.verify(() -> HDKeyDerivation.deriveChildKeyBytesFromPrivate(parentMock, childNumberMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${9b596ad9-989e-3c47-af15-9a26afbe6475}, hash: EB6EA605AFB3FA754CC1F742BAAA01C7
    @Test()
    public void deriveChildKeyBytesFromPrivateWhenParentPublicKeyLengthNotEquals33ThrowsIllegalStateException() throws HDDerivationException {
        /* Branches:
         * (parentPublicKey.length == 33) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            doReturn(false).when(parentMock).hasPrivKey();
            doReturn(eCPointMock).when(parentMock).getPubKeyPoint();
            byte[] byteArray = new byte[]{(byte) 0};
            doReturn(byteArray).when(eCPointMock).getEncoded(true);
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            HDKeyDerivation.deriveChildKeyBytesFromPrivate(parentMock, childNumberMock);
            //Assert statement(s)
            verify(parentMock, atLeast(1)).hasPrivKey();
            verify(parentMock, atLeast(1)).getPubKeyPoint();
            verify(eCPointMock, atLeast(1)).getEncoded(true);
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${7caaec38-9f62-3376-b906-1dec40a8a8cc}, hash: 6648D89E75B04B9B0DD77A29C156767F
    @Ignore()
    @Test()
    public void deriveChildKeyBytesFromPrivateWhenChildNumberNotIsHardenedAndILengthNotEquals64ThrowsIllegalStateException() throws HDDerivationException {
        /* Branches:
         * (parentPublicKey.length == 33) : true
         * (childNumber.isHardened()) : false
         * (i.length == 64) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS);
             MockedStatic<HDUtils> hDUtils = mockStatic(HDUtils.class)) {
            doReturn(false).when(parentMock).hasPrivKey();
            doReturn(eCPointMock).when(parentMock).getPubKeyPoint();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32};
            doReturn(byteArray).when(eCPointMock).getEncoded(true);
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(parentMock).getChainCode();
            doReturn(false).when(childNumberMock).isHardened();
            doReturn(0).when(childNumberMock).i();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray3 = new byte[]{};
            byte[] byteArray4 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33, (byte) 34, (byte) 35, (byte) 36};
            hDUtils.when(() -> HDUtils.hmacSha512(byteArray2, byteArray4)).thenReturn(byteArray3);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            HDKeyDerivation.deriveChildKeyBytesFromPrivate(parentMock, childNumberMock);
            //Assert statement(s)
            verify(parentMock, atLeast(1)).hasPrivKey();
            verify(parentMock, atLeast(1)).getPubKeyPoint();
            verify(eCPointMock, atLeast(1)).getEncoded(true);
            verify(parentMock, atLeast(1)).getChainCode();
            verify(childNumberMock, atLeast(1)).isHardened();
            verify(childNumberMock, atLeast(1)).i();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            hDUtils.verify(() -> HDUtils.hmacSha512(byteArray2, byteArray4), atLeast(1));
        }
    }

    //Sapient generated method id: ${887ec1c5-4e77-3c6a-a90c-a73e31b851a7}, hash: 3C8ED9485F0DB5A23F2601A111637732
    @Ignore()
    @Test()
    public void deriveChildKeyBytesFromPrivateWhenIntegerCompareToECKeyCURVEGetNGreaterThan0ThrowsHDDerivationException() throws HDDerivationException {
        /* Branches:
         * (parentPublicKey.length == 33) : true
         * (childNumber.isHardened()) : true
         * (i.length == 64) : true
         * (integer.compareTo(ECKey.CURVE.getN()) > 0) : true  #  inside assertLessThanN method
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            doReturn(false).when(parentMock).hasPrivKey();
            doReturn(eCPointMock).when(parentMock).getPubKeyPoint();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32};
            doReturn(byteArray).when(eCPointMock).getEncoded(true);
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(parentMock).getPrivKeyBytes33();
            byte[] byteArray3 = new byte[]{};
            doReturn(byteArray3).when(parentMock).getChainCode();
            doReturn(true).when(childNumberMock).isHardened();
            doReturn(1).when(childNumberMock).i();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray4 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            byteUtils.when(() -> ByteUtils.bytesToBigInteger(byteArray4)).thenReturn(new BigInteger("115792089237316195423570985008687907852837564279074904382605163141518161494338"));
            HDDerivationException hDDerivationException = new HDDerivationException("Illegal derived key: I_L >= n");
            thrown.expect(HDDerivationException.class);
            thrown.expectMessage(hDDerivationException.getMessage());
            //Act Statement(s)
            HDKeyDerivation.deriveChildKeyBytesFromPrivate(parentMock, childNumberMock);
            //Assert statement(s)
            verify(parentMock, atLeast(1)).hasPrivKey();
            verify(parentMock, atLeast(1)).getPubKeyPoint();
            verify(eCPointMock, atLeast(1)).getEncoded(true);
            verify(parentMock, atLeast(1)).getPrivKeyBytes33();
            verify(parentMock, atLeast(1)).getChainCode();
            verify(childNumberMock, atLeast(1)).isHardened();
            verify(childNumberMock, atLeast(1)).i();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            byteUtils.verify(() -> ByteUtils.bytesToBigInteger(byteArray4), atLeast(1));
        }
    }

    //Sapient generated method id: ${5c8fc085-8e3a-313b-b2c6-3306aeb402e4}, hash: 51F438C00F85CC0CBEF6E5134DCDCFDD
    @Ignore()
    @Test()
    public void deriveChildKeyBytesFromPrivateWhenIntegerEqualsBigIntegerZEROThrowsHDDerivationException() throws HDDerivationException {
        /* Branches:
         * (parentPublicKey.length == 33) : true
         * (childNumber.isHardened()) : true
         * (i.length == 64) : true
         * (integer.compareTo(ECKey.CURVE.getN()) > 0) : false  #  inside assertLessThanN method
         * (integer.equals(BigInteger.ZERO)) : true  #  inside assertNonZero method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            doReturn(false).when(parentMock).hasPrivKey();
            doReturn(eCPointMock).when(parentMock).getPubKeyPoint();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(eCPointMock).getEncoded(true);
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(parentMock).getPrivKeyBytes33();
            byte[] byteArray3 = new byte[]{};
            doReturn(byteArray3).when(parentMock).getChainCode();
            doReturn(new BigInteger("0")).when(parentMock).getPrivKey();
            doReturn(false).when(childNumberMock).isHardened();
            doReturn(0).when(childNumberMock).i();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            HDDerivationException hDDerivationException = new HDDerivationException("Illegal derived key: derived private key equals 0.");
            thrown.expect(HDDerivationException.class);
            thrown.expectMessage(hDDerivationException.getMessage());
            //Act Statement(s)
            HDKeyDerivation.deriveChildKeyBytesFromPrivate(parentMock, childNumberMock);
            //Assert statement(s)
            verify(parentMock, atLeast(1)).hasPrivKey();
            verify(parentMock, atLeast(1)).getPubKeyPoint();
            verify(eCPointMock, atLeast(1)).getEncoded(true);
            verify(parentMock, atLeast(1)).getPrivKeyBytes33();
            verify(parentMock, atLeast(1)).getChainCode();
            verify(parentMock, atLeast(1)).getPrivKey();
            verify(childNumberMock, atLeast(1)).isHardened();
            verify(childNumberMock, atLeast(1)).i();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${76460239-fd76-37ad-b40a-420b2d0f27e8}, hash: 1DFF51F68044B818ECCBCA1C56BCCC1A
    @Test()
    public void deriveChildKeyBytesFromPrivateWhenIntegerNotEqualsBigIntegerZERO() throws HDDerivationException {
        /* Branches:
         * (parentPublicKey.length == 33) : true
         * (childNumber.isHardened()) : true
         * (i.length == 64) : true
         * (integer.compareTo(ECKey.CURVE.getN()) > 0) : false  #  inside assertLessThanN method
         * (integer.equals(BigInteger.ZERO)) : false  #  inside assertNonZero method
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            doReturn(false).when(parentMock).hasPrivKey();
            doReturn(eCPointMock).when(parentMock).getPubKeyPoint();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32};
            doReturn(byteArray).when(eCPointMock).getEncoded(true);
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(parentMock).getPrivKeyBytes33();
            byte[] byteArray3 = new byte[]{};
            doReturn(byteArray3).when(parentMock).getChainCode();
            doReturn(new BigInteger("-1")).when(parentMock).getPrivKey();
            doReturn(true).when(childNumberMock).isHardened();
            doReturn(-1).when(childNumberMock).i();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            HDKeyDerivation.RawKeyBytes result = HDKeyDerivation.deriveChildKeyBytesFromPrivate(parentMock, childNumberMock);
            //Assert statement(s)
            //TODO: Please implement equals method in RawKeyBytes for verification of the entire object or you need to adjust respective assertion statements
            assertThat(result, is(notNullValue()));
            verify(parentMock, atLeast(1)).hasPrivKey();
            verify(parentMock, atLeast(1)).getPubKeyPoint();
            verify(eCPointMock, atLeast(1)).getEncoded(true);
            verify(parentMock, atLeast(1)).getPrivKeyBytes33();
            verify(parentMock, atLeast(1)).getChainCode();
            verify(parentMock, atLeast(1)).getPrivKey();
            verify(childNumberMock, atLeast(1)).isHardened();
            verify(childNumberMock, atLeast(1)).i();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${785e12a0-4928-3829-98c7-9c9c05d4b35c}, hash: F835580DEA483120DFFB6B58CD3AB161
    @Ignore()
    @Test()
    public void deriveChildKeyFromPublicTest() throws HDDerivationException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.bitcoinj.crypto.LazyECPoint
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDKeyDerivation> hDKeyDerivation = mockStatic(HDKeyDerivation.class, CALLS_REAL_METHODS)) {
            doReturn(hDPathMock).when(parentMock).getPath();
            ChildNumber[] childNumberArray = new ChildNumber[]{};
            doReturn(hDPathMock2).when(hDPathMock).extend(childNumberMock, childNumberArray);
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{};
            HDKeyDerivation.RawKeyBytes hDKeyDerivationRawKeyBytes = new HDKeyDerivation.RawKeyBytes(byteArray, byteArray2);
            hDKeyDerivation.when(() -> HDKeyDerivation.deriveChildKeyBytesFromPublic(parentMock, childNumberMock, HDKeyDerivation.PublicDeriveMode.NORMAL)).thenReturn(hDKeyDerivationRawKeyBytes);
            //Act Statement(s)
            DeterministicKey result = HDKeyDerivation.deriveChildKeyFromPublic(parentMock, childNumberMock, HDKeyDerivation.PublicDeriveMode.NORMAL);
            ECDomainParameters eCDomainParameters = ECKey.CURVE;
            ECCurve eCCurve = eCDomainParameters.getCurve();
            LazyECPoint lazyECPoint = new LazyECPoint(eCCurve, byteArray);
            DeterministicKey deterministicKey = new DeterministicKey(hDPathMock2, byteArray2, lazyECPoint, (BigInteger) null, parentMock);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKey));
            verify(parentMock, atLeast(1)).getPath();
            verify(hDPathMock, atLeast(1)).extend(childNumberMock, childNumberArray);
            hDKeyDerivation.verify(() -> HDKeyDerivation.deriveChildKeyBytesFromPublic(parentMock, childNumberMock, HDKeyDerivation.PublicDeriveMode.NORMAL), atLeast(1));
        }
    }

    //Sapient generated method id: ${94d8bd42-1e6e-3b07-a45c-da4ec8b7f4cb}, hash: 5E7CD21A40B6BE758722168854099EA4
    @Test()
    public void deriveChildKeyBytesFromPublicWhenChildNumberIsHardenedThrowsIllegalArgumentException() throws HDDerivationException {
        /* Branches:
         * (!childNumber.isHardened()) : false
         */
        //Arrange Statement(s)
        doReturn(true).when(childNumberMock).isHardened();
        thrown.expect(IllegalArgumentException.class);
        //Act Statement(s)
        HDKeyDerivation.deriveChildKeyBytesFromPublic(deterministicKeyMock, childNumberMock, HDKeyDerivation.PublicDeriveMode.NORMAL);
        //Assert statement(s)
        verify(childNumberMock).isHardened();
    }

    //Sapient generated method id: ${fd54074d-cfbf-3186-80df-7b0591849b7e}, hash: 153DC6A9149671BFC11860D4727A7B0A
    @Test()
    public void deriveChildKeyBytesFromPublicWhenParentPublicKeyLengthNotEquals33ThrowsIllegalStateException() throws HDDerivationException {
        /* Branches:
         * (!childNumber.isHardened()) : true
         * (parentPublicKey.length == 33) : false
         */
        //Arrange Statement(s)
        doReturn(eCPointMock).when(parentMock).getPubKeyPoint();
        byte[] byteArray = new byte[]{(byte) 0};
        doReturn(byteArray).when(eCPointMock).getEncoded(true);
        doReturn(false).when(childNumberMock).isHardened();
        thrown.expect(IllegalStateException.class);
        //Act Statement(s)
        HDKeyDerivation.deriveChildKeyBytesFromPublic(parentMock, childNumberMock, HDKeyDerivation.PublicDeriveMode.NORMAL);
        //Assert statement(s)
        verify(parentMock).getPubKeyPoint();
        verify(eCPointMock).getEncoded(true);
        verify(childNumberMock).isHardened();
    }

    //Sapient generated method id: ${7bb40d3d-8ac4-3b6a-b022-d1ffdde5f124}, hash: 461F3A6EB27C707AA6BC4C85AE5EE616
    @Ignore()
    @Test()
    public void deriveChildKeyBytesFromPublicWhenILengthNotEquals64ThrowsIllegalStateException() throws HDDerivationException {
        /* Branches:
         * (!childNumber.isHardened()) : true
         * (parentPublicKey.length == 33) : true
         * (i.length == 64) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<HDUtils> hDUtils = mockStatic(HDUtils.class)) {
            doReturn(eCPointMock).when(parentMock).getPubKeyPoint();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32};
            doReturn(byteArray).when(eCPointMock).getEncoded(true);
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(parentMock).getChainCode();
            doReturn(false).when(childNumberMock).isHardened();
            doReturn(0).when(childNumberMock).i();
            byte[] byteArray3 = new byte[]{};
            byte[] byteArray4 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33, (byte) 34, (byte) 35, (byte) 36};
            hDUtils.when(() -> HDUtils.hmacSha512(byteArray2, byteArray4)).thenReturn(byteArray3);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            HDKeyDerivation.deriveChildKeyBytesFromPublic(parentMock, childNumberMock, HDKeyDerivation.PublicDeriveMode.NORMAL);
            //Assert statement(s)
            verify(parentMock).getPubKeyPoint();
            verify(eCPointMock).getEncoded(true);
            verify(parentMock).getChainCode();
            verify(childNumberMock).isHardened();
            verify(childNumberMock).i();
            hDUtils.verify(() -> HDUtils.hmacSha512(byteArray2, byteArray4), atLeast(1));
        }
    }

    //Sapient generated method id: ${5a30f159-34ae-39fc-af31-68be4cadcbd8}, hash: 23EDB4C1BF621212299A3B1147133648
    @Ignore()
    @Test()
    public void deriveChildKeyBytesFromPublicWhenIntegerCompareToECKeyCURVEGetNGreaterThan0ThrowsHDDerivationException() throws HDDerivationException {
        /* Branches:
         * (!childNumber.isHardened()) : true
         * (parentPublicKey.length == 33) : true
         * (i.length == 64) : true
         * (integer.compareTo(ECKey.CURVE.getN()) > 0) : true  #  inside assertLessThanN method
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            doReturn(eCPointMock).when(parentMock).getPubKeyPoint();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32};
            doReturn(byteArray).when(eCPointMock).getEncoded(true);
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(parentMock).getChainCode();
            doReturn(false).when(childNumberMock).isHardened();
            doReturn(1).when(childNumberMock).i();
            byte[] byteArray3 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            byteUtils.when(() -> ByteUtils.bytesToBigInteger(byteArray3)).thenReturn(new BigInteger("115792089237316195423570985008687907852837564279074904382605163141518161494338"));
            HDDerivationException hDDerivationException = new HDDerivationException("Illegal derived key: I_L >= n");
            thrown.expect(HDDerivationException.class);
            thrown.expectMessage(hDDerivationException.getMessage());
            //Act Statement(s)
            HDKeyDerivation.deriveChildKeyBytesFromPublic(parentMock, childNumberMock, HDKeyDerivation.PublicDeriveMode.NORMAL);
            //Assert statement(s)
            verify(parentMock).getPubKeyPoint();
            verify(eCPointMock).getEncoded(true);
            verify(parentMock).getChainCode();
            verify(childNumberMock).isHardened();
            verify(childNumberMock).i();
            byteUtils.verify(() -> ByteUtils.bytesToBigInteger(byteArray3), atLeast(1));
        }
    }

    //Sapient generated method id: ${12397fc1-e9c9-340a-a96c-7061796d9eb4}, hash: DA3D1FB3623518A23A42C41D444BF866
    @Ignore()
    @Test()
    public void deriveChildKeyBytesFromPublicWhenSwitchModeCaseDefaultThrowsAssertionError() throws HDDerivationException {
        /* Branches:
         * (!childNumber.isHardened()) : true
         * (parentPublicKey.length == 33) : true
         * (i.length == 64) : true
         * (integer.compareTo(ECKey.CURVE.getN()) > 0) : false  #  inside assertLessThanN method
         * (switch(mode) = default) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(eCPointMock).when(parentMock).getPubKeyPoint();
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32};
        doReturn(byteArray).when(eCPointMock).getEncoded(true);
        byte[] byteArray2 = new byte[]{};
        doReturn(byteArray2).when(parentMock).getChainCode();
        doReturn(false).when(childNumberMock).isHardened();
        doReturn(0).when(childNumberMock).i();
        thrown.expect(AssertionError.class);
        //Act Statement(s)
        HDKeyDerivation.deriveChildKeyBytesFromPublic(parentMock, childNumberMock, HDKeyDerivation.PublicDeriveMode.NORMAL);
        //Assert statement(s)
        verify(parentMock).getPubKeyPoint();
        verify(eCPointMock).getEncoded(true);
        verify(parentMock).getChainCode();
        verify(childNumberMock).isHardened();
        verify(childNumberMock).i();
    }

    //Sapient generated method id: ${919c2f68-b6e3-38df-93e8-91736c801fd2}, hash: 9959B32A1B4D094383333E25252FC43F
    @Test()
    public void deriveChildKeyBytesFromPublicWhenPointEqualsECKeyCURVEGetCurveGetInfinityThrowsHDDerivationException() throws HDDerivationException {
        /* Branches:
         * (!childNumber.isHardened()) : true
         * (parentPublicKey.length == 33) : true
         * (i.length == 64) : true
         * (integer.compareTo(ECKey.CURVE.getN()) > 0) : false  #  inside assertLessThanN method
         * (switch(mode) = NORMAL) : true
         * (point.equals(ECKey.CURVE.getCurve().getInfinity())) : true  #  inside assertNonInfinity method
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32};
            doReturn(byteArray).when(eCPointMock).getEncoded(true);
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(parentMock).getChainCode();
            doReturn(eCPointMock, eCPointMock2).when(parentMock).getPubKeyPoint();
            doReturn(false).when(childNumberMock).isHardened();
            doReturn(0).when(childNumberMock).i();
            eCKey.when(() -> ECKey.publicPointFromPrivate(new BigInteger("16382458513567587855675555786540199037381810580783420436401059148847613364953"))).thenReturn(eCPointMock3);
            ECDomainParameters eCDomainParameters = ECKey.CURVE;
            ECCurve eCCurve = eCDomainParameters.getCurve();
            ECPoint eCPoint = eCCurve.getInfinity();
            doReturn(eCPoint).when(eCPointMock3).add(eCPointMock2);
            HDDerivationException hDDerivationException = new HDDerivationException("Illegal derived key: derived public key equals infinity.");
            thrown.expect(HDDerivationException.class);
            thrown.expectMessage(hDDerivationException.getMessage());
            //Act Statement(s)
            HDKeyDerivation.deriveChildKeyBytesFromPublic(parentMock, childNumberMock, HDKeyDerivation.PublicDeriveMode.NORMAL);
            //Assert statement(s)
            verify(parentMock, times(2)).getPubKeyPoint();
            verify(eCPointMock).getEncoded(true);
            verify(parentMock).getChainCode();
            verify(childNumberMock).isHardened();
            verify(childNumberMock).i();
            eCKey.verify(() -> ECKey.publicPointFromPrivate(new BigInteger("16382458513567587855675555786540199037381810580783420436401059148847613364953")), atLeast(1));
            verify(eCPointMock3).add(eCPointMock2);
        }
    }

    //Sapient generated method id: ${f78da902-b321-35cd-bdf4-d1d5d8b549f6}, hash: 7D1B7D0F857C71678DEB53C94D5ECA9C
    @Ignore()
    @Test()
    public void deriveChildKeyBytesFromPublicWhenSwitchModeCaseWITH_INVERSIONAndPointNotEqualsECKeyCURVEGetCurveGetInfinity() throws HDDerivationException {
        /* Branches:
         * (!childNumber.isHardened()) : true
         * (parentPublicKey.length == 33) : true
         * (i.length == 64) : true
         * (integer.compareTo(ECKey.CURVE.getN()) > 0) : false  #  inside assertLessThanN method
         * (switch(mode) = WITH_INVERSION) : true
         * (point.equals(ECKey.CURVE.getCurve().getInfinity())) : false  #  inside assertNonInfinity method
         */
        //Arrange Statement(s)
        ECPoint eCPointMock4 = mock(ECPoint.class);
        ECPoint eCPointMock5 = mock(ECPoint.class);
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32};
            doReturn(byteArray).when(eCPointMock).getEncoded(true);
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(parentMock).getChainCode();
            doReturn(eCPointMock, eCPointMock2).when(parentMock).getPubKeyPoint();
            doReturn(false).when(childNumberMock).isHardened();
            doReturn(1).when(childNumberMock).i();
            eCKey.when(() -> ECKey.publicPointFromPrivate(new BigInteger("18150536398752079810832977150565885107456680686684109397969301655748103251508"))).thenReturn(eCPointMock3);
            doReturn(eCPointMock4).when(eCPointMock3).add((ECPoint) any());
            doReturn(eCPointMock5).when(eCPointMock4).add(eCPointMock2);
            byte[] byteArray3 = new byte[]{};
            doReturn(byteArray3).when(eCPointMock5).getEncoded(true);
            ECPoint eCPoint = ECKey.publicPointFromPrivate(new BigInteger("86110950168365102782209425634177890887308109314782588708953239963403820118729"));
            eCKey.when(() -> ECKey.publicPointFromPrivate(new BigInteger("86110950168365102782209425634177890887308109314782588708953239963403820118729"))).thenReturn(eCPoint);
            //Act Statement(s)
            HDKeyDerivation.RawKeyBytes result = HDKeyDerivation.deriveChildKeyBytesFromPublic(parentMock, childNumberMock, HDKeyDerivation.PublicDeriveMode.WITH_INVERSION);
            //Assert statement(s)
            //TODO: Please implement equals method in RawKeyBytes for verification of the entire object or you need to adjust respective assertion statements
            assertThat(result, is(notNullValue()));
            verify(parentMock, times(2)).getPubKeyPoint();
            verify(eCPointMock).getEncoded(true);
            verify(parentMock).getChainCode();
            verify(childNumberMock).isHardened();
            verify(childNumberMock).i();
            eCKey.verify(() -> ECKey.publicPointFromPrivate(new BigInteger("18150536398752079810832977150565885107456680686684109397969301655748103251508")), atLeast(1));
            verify(eCPointMock3).add((ECPoint) any());
            verify(eCPointMock4).add(eCPointMock2);
            verify(eCPointMock5).getEncoded(true);
            eCKey.verify(() -> ECKey.publicPointFromPrivate(new BigInteger("86110950168365102782209425634177890887308109314782588708953239963403820118729")), atLeast(1));
        }
    }
}
