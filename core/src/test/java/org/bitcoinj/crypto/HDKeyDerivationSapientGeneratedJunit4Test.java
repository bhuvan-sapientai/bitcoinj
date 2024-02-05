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

    private final HMac hMacMock = mock(HMac.class);

    private final DeterministicKey parentMock = mock(DeterministicKey.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    private final HDPath hDPathMock = mock(HDPath.class);

    private final HDPath hDPathMock2 = mock(HDPath.class);

    //Sapient generated method id: ${e8a9027b-6eab-30be-82c4-f781d8c82d21}
    @Ignore()
    @Test()
    public void createMasterPrivateKeyWhenSeedLengthGreaterThan8ThrowsIllegalArgumentException() throws HDDerivationException {
        /* Branches:
         * (seed.length > 8) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            thrown.expect(IllegalArgumentException.class);
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8};
            //Act Statement(s)
            HDKeyDerivation.createMasterPrivateKey(byteArray);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${33e4384f-b340-362b-b436-f8791ed4aa23}
    @Test()
    public void createMasterPrivateKeyWhenSeedLengthNotGreaterThan8ThrowsIllegalArgumentException() throws HDDerivationException {
        /* Branches:
         * (seed.length > 8) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            thrown.expect(IllegalArgumentException.class);
            byte[] byteArray = new byte[]{(byte) 0};
            //Act Statement(s)
            HDKeyDerivation.createMasterPrivateKey(byteArray);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${56333969-2a8b-31b9-b888-f382d7bae6ab}
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

    //Sapient generated method id: ${f09e6c86-91c2-302e-b830-3598adae1dc5}
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

    //Sapient generated method id: ${3292e57a-1198-3307-912f-bcc8ec7db38e}
    @Ignore()
    @Test()
    public void createMasterPubKeyFromBytesTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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

    //Sapient generated method id: ${6845f396-d664-3b2c-bed4-52fe4f57494a}
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

    //Sapient generated method id: ${8f1362bc-0609-3291-9e07-c7167958b4fe}
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

    //Sapient generated method id: ${6f52aab3-2070-3a62-bdd2-7d81073eee98}
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
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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

    //Sapient generated method id: ${f5fa0828-5949-301b-8403-fc2d54d898e8}
    @Ignore()
    @Test()
    public void generateTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class, "<DeterministicKey object>");
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

    //Sapient generated method id: ${be740420-be94-3e4d-aafd-39322b493932}
    @Ignore()
    @Test()
    public void deriveChildKeyBytesFromPrivateWhenParentPublicKeyLengthEquals33ThrowsIllegalStateException() throws HDDerivationException {
        /* Branches:
         * (parentPublicKey.length == 33) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(parentMock).hasPrivKey();
            doReturn(eCPointMock).when(parentMock).getPubKeyPoint();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32};
            doReturn(byteArray).when(eCPointMock).getEncoded(true);
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenThrow(illegalStateException);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            HDKeyDerivation.deriveChildKeyBytesFromPrivate(parentMock, childNumberMock);
            //Assert statement(s)
            verify(parentMock).hasPrivKey();
            verify(parentMock).getPubKeyPoint();
            verify(eCPointMock).getEncoded(true);
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${9b596ad9-989e-3c47-af15-9a26afbe6475}
    @Test()
    public void deriveChildKeyBytesFromPrivateWhenParentPublicKeyLengthNotEquals33ThrowsIllegalStateException() throws HDDerivationException {
        /* Branches:
         * (parentPublicKey.length == 33) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(parentMock).hasPrivKey();
            doReturn(eCPointMock).when(parentMock).getPubKeyPoint();
            byte[] byteArray = new byte[]{(byte) 0};
            doReturn(byteArray).when(eCPointMock).getEncoded(true);
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenThrow(illegalStateException);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            HDKeyDerivation.deriveChildKeyBytesFromPrivate(parentMock, childNumberMock);
            //Assert statement(s)
            verify(parentMock).hasPrivKey();
            verify(parentMock).getPubKeyPoint();
            verify(eCPointMock).getEncoded(true);
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
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

    //Sapient generated method id: ${155cff45-4844-32cd-a54c-3fea1569cee0}
    @Ignore()
    @Test()
    public void deriveChildKeyBytesFromPublicWhenChildNumberNotIsHardenedThrowsIllegalArgumentException() throws HDDerivationException {
        /* Branches:
         * (!childNumber.isHardened()) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(childNumberMock).isHardened();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            HDKeyDerivation.deriveChildKeyBytesFromPublic(deterministicKeyMock, childNumberMock, HDKeyDerivation.PublicDeriveMode.NORMAL);
            //Assert statement(s)
            verify(childNumberMock).isHardened();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${94d8bd42-1e6e-3b07-a45c-da4ec8b7f4cb}
    @Test()
    public void deriveChildKeyBytesFromPublicWhenChildNumberIsHardenedThrowsIllegalArgumentException() throws HDDerivationException {
        /* Branches:
         * (!childNumber.isHardened()) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(true).when(childNumberMock).isHardened();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            HDKeyDerivation.deriveChildKeyBytesFromPublic(deterministicKeyMock, childNumberMock, HDKeyDerivation.PublicDeriveMode.NORMAL);
            //Assert statement(s)
            verify(childNumberMock).isHardened();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }
}
