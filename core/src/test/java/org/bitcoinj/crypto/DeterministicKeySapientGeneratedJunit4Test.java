package org.bitcoinj.crypto;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.base.Network;
import org.junit.rules.ExpectedException;

import java.util.List;

import org.bitcoinj.base.ScriptType;
import org.bitcoinj.crypto.internal.CryptoUtils;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bitcoinj.base.Base58;

import java.math.BigInteger;

import org.bitcoinj.base.internal.ByteUtils;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bitcoinj.core.NetworkParameters;

import java.util.ArrayList;
import java.util.Optional;

import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bitcoinj.base.Address;
import org.mockito.stubbing.Answer;

import java.nio.ByteBuffer;

import org.bitcoinj.base.internal.Preconditions;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bitcoinj.base.Sha256Hash;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

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
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;
import org.mockito.InjectMocks;
import org.junit.After;
import org.mockito.MockitoAnnotations;

public class DeterministicKeySapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final HDPath childNumberPathMock = mock(HDPath.class, "childNumberPath");

    private final DeterministicKey parentMock = mock(DeterministicKey.class, "parent");

    private final AesKey aesKeyMock = mock(AesKey.class);

    private final ChildNumber childNumberMock = mock(ChildNumber.class);

    private final DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);

    private final DeterministicKey deterministicKeyMock2 = mock(DeterministicKey.class);

    private final ECKey.ECDSASignature eCKeyECDSASignatureMock = mock(ECKey.ECDSASignature.class);

    private final ECPoint eCPointMock = mock(ECPoint.class);

    private final ECPoint eCPointMock2 = mock(ECPoint.class);

    private final EncryptedData encryptedDataMock = mock(EncryptedData.class);

    private final HDPath hDPathMock = mock(HDPath.class);

    private final HDPath hDPathMock2 = mock(HDPath.class);

    private final KeyCrypter keyCrypterMock = mock(KeyCrypter.class);

    private final Network networkMock = mock(Network.class);

    private final NetworkParameters networkParametersMock = mock(NetworkParameters.class);

    private final DeterministicKey newParentMock = mock(DeterministicKey.class);

    private final NetworkParameters paramsMock = mock(NetworkParameters.class);

    private final DeterministicKey parentMock2 = mock(DeterministicKey.class);

    private final LazyECPoint publicAsPointMock = mock(LazyECPoint.class);

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    private final LazyECPoint lazyECPointMock = mock(LazyECPoint.class);

    private final LazyECPoint pubMock = mock(LazyECPoint.class, "pub");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private DeterministicKey target;

    @After()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${bf9d95c1-b4c4-3f7d-9e18-c185484c5efc}
    @Ignore()
    @Test()
    public void getPathAsStringTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class);
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            String result = target.getPathAsString();
            //Assert statement(s)
            assertThat(result, equalTo("<init>_hDPath1"));
            hDPath.verify(() -> HDPath.M(anyList()));
        }
    }

    //Sapient generated method id: ${4555ae24-f823-3b8a-b8e8-14af915ea50d}
    @Ignore()
    @Test()
    public void getChildNumberWhenChildNumberPathSizeEquals0() {
        /* Branches:
         * (childNumberPath.size() == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class);
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(0).when(childNumberPathMock).size();
            //Act Statement(s)
            ChildNumber result = target.getChildNumber();
            ChildNumber childNumber = ChildNumber.ZERO;
            //Assert statement(s)
            assertThat(result, equalTo(childNumber));
            hDPath.verify(() -> HDPath.M(anyList()));
            verify(childNumberPathMock).size();
        }
    }

    //Sapient generated method id: ${a28a43ca-fa93-353f-ac61-126d77a8f3cb}
    @Ignore()
    @Test()
    public void getChildNumberWhenChildNumberPathSizeNotEquals0() {
        /* Branches:
         * (childNumberPath.size() == 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class);
        ChildNumber childNumberMock = mock(ChildNumber.class);
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(1).when(childNumberPathMock).size();
            doReturn(childNumberMock).when(childNumberPathMock).get(0);
            //Act Statement(s)
            ChildNumber result = target.getChildNumber();
            //Assert statement(s)
            assertThat(result, equalTo(childNumberMock));
            hDPath.verify(() -> HDPath.M(anyList()));
            verify(childNumberPathMock, times(2)).size();
            verify(childNumberPathMock).get(0);
        }
    }

    //Sapient generated method id: ${53d8d374-4547-39ab-a12c-11162a068214}
    @Ignore()
    @Test()
    public void getIdentifierTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class);
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            byte[] result = target.getIdentifier();
            byte[] byteResultArray = new byte[]{(byte) -76, (byte) 114, (byte) -94, (byte) 102, (byte) -48, (byte) -67, (byte) -119, (byte) -63, (byte) 55, (byte) 6, (byte) -92, (byte) 19, (byte) 44, (byte) -49, (byte) -79, (byte) 111, (byte) 124, (byte) 59, (byte) -97, (byte) -53};
            //Assert statement(s)
            assertThat(result, equalTo(byteResultArray));
            hDPath.verify(() -> HDPath.M(anyList()));
        }
    }

    //Sapient generated method id: ${3216a600-fd04-3e07-89ba-2ac483af98b3}
    @Ignore()
    @Test()
    public void getFingerprintTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class);
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(target).getIdentifier();
            //Act Statement(s)
            int result = target.getFingerprint();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            hDPath.verify(() -> HDPath.M(anyList()));
            verify(target).getIdentifier();
        }
    }

    //Sapient generated method id: ${3505acb3-4be6-3f02-8829-9abc3293c109}
    @Ignore()
    @Test()
    public void getPrivKeyBytes33Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class);
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(target).getPrivKeyBytes();
            //Act Statement(s)
            byte[] result = target.getPrivKeyBytes33();
            byte[] byteResultArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            //Assert statement(s)
            assertThat(result, equalTo(byteResultArray));
            hDPath.verify(() -> HDPath.M(anyList()));
            verify(target).getPrivKeyBytes();
        }
    }

    //Sapient generated method id: ${6e7dc487-7eac-3184-83ef-b60d5c91f780}
    @Ignore()
    @Test()
    public void dropPrivateBytesWhenIsPubKeyOnly() {
        /* Branches:
         * (isPubKeyOnly()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class);
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(true).when(target).isPubKeyOnly();
            //Act Statement(s)
            DeterministicKey result = target.dropPrivateBytes();
            //Assert statement(s)
            assertThat(result, equalTo(target));
            hDPath.verify(() -> HDPath.M(anyList()));
            verify(target).isPubKeyOnly();
        }
    }

    //Sapient generated method id: ${e6f9ebb3-3a61-38e0-af1d-1b4e714cc82a}
    @Ignore()
    @Test()
    public void dropPrivateBytesWhenDefaultBranchThrowsIllegalArgumentException() {
        /* Branches:
         * (isPubKeyOnly()) : false
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 73)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(false)).thenThrow(illegalArgumentException);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(false).when(target).isPubKeyOnly();
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.dropPrivateBytes();
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            verify(target).isPubKeyOnly();
        }
    }

    //Sapient generated method id: ${318ff451-c8b8-345f-813b-dc64e117fcc8}
    @Ignore()
    @Test()
    public void dropPrivateBytesWhenDefaultBranch() {
        /* Branches:
         * (isPubKeyOnly()) : false
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 73)) : false  #  inside <init> method
         * (branch expression (line 77)) : false  #  inside <init> method
         * (branch expression (line 78)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HDPath hDPathMock = mock(HDPath.class);
        ECPoint eCPointMock = mock(ECPoint.class);
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            hDPath.when(() -> HDPath.M(childNumberPathMock)).thenReturn(hDPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(false).when(target).isPubKeyOnly();
            //Act Statement(s)
            DeterministicKey result = target.dropPrivateBytes();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            LazyECPoint lazyECPoint = new LazyECPoint(eCPointMock, false);
            LazyECPoint lazyECPoint2 = lazyECPoint.compress();
            DeterministicKey deterministicKey = new DeterministicKey(childNumberPathMock, byteArray2, lazyECPoint2, (BigInteger) null, (DeterministicKey) null);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKey));
            hDPath.verify(() -> HDPath.M(anyList()));
            hDPath.verify(() -> HDPath.M(childNumberPathMock), atLeast(1));
            verify(target).isPubKeyOnly();
        }
    }

    //Sapient generated method id: ${8c9ba6f2-2db7-3aca-ba88-1fed408458c5}
    @Ignore()
    @Test()
    public void dropParentWhenDefaultBranchThrowsIllegalArgumentException() {
        /* Branches:
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 73)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(false)).thenThrow(illegalArgumentException);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.dropParent();
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
        }
    }

    //Sapient generated method id: ${192de3e2-bc70-3331-8b07-a22813ca46b0}
    @Ignore()
    @Test()
    public void dropParentWhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 73)) : false  #  inside <init> method
         * (branch expression (line 77)) : false  #  inside <init> method
         * (branch expression (line 78)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HDPath hDPathMock = mock(HDPath.class);
        ECPoint eCPointMock = mock(ECPoint.class);
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            hDPath.when(() -> HDPath.M(childNumberPathMock)).thenReturn(hDPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            DeterministicKey result = target.dropParent();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            LazyECPoint lazyECPoint = new LazyECPoint(eCPointMock, false);
            LazyECPoint lazyECPoint2 = lazyECPoint.compress();
            DeterministicKey deterministicKey = new DeterministicKey(childNumberPathMock, byteArray2, lazyECPoint2, (BigInteger) null, (DeterministicKey) null);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKey));
            hDPath.verify(() -> HDPath.M(anyList()));
            hDPath.verify(() -> HDPath.M(childNumberPathMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${0ebb4dc2-13c5-3bff-8619-c21a8ced46f8}
    @Ignore()
    @Test()
    public void addChecksumTest() {
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};

        //Act Statement(s)
        byte[] result = DeterministicKey.addChecksum(byteArray);
        byte[] byteResultArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0};

        //Assert statement(s)
        assertThat(result, equalTo(byteResultArray));
    }

    //Sapient generated method id: ${cd80e3c4-54b9-3a04-b5c0-6816aafaf96d}
    @Ignore()
    @Test()
    public void encrypt1ThrowsUnsupportedOperationException() throws KeyCrypterException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class);
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class);
        AesKey aesKeyMock = mock(AesKey.class);
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Must supply a new parent for encryption");
            thrown.expect(UnsupportedOperationException.class);
            thrown.expectMessage(unsupportedOperationException.getMessage());
            //Act Statement(s)
            target.encrypt(keyCrypterMock, aesKeyMock);
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
        }
    }

    //Sapient generated method id: ${44285398-097a-375d-97a5-58c33b47043d}
    @Ignore()
    @Test()
    public void encrypt2WhenPrivKeyBytesIsNotNullThrowsIllegalStateException() throws KeyCrypterException {
        /* Branches:
         * (newParent != null) : true
         * (privKeyBytes != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey newParentMock = mock(DeterministicKey.class);
        ECPoint eCPointMock = mock(ECPoint.class);
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class);
        AesKey aesKeyMock = mock(AesKey.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            doReturn(false).when(newParentMock).isEncrypted();
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenThrow(illegalStateException);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(target).getPrivKeyBytes();
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.encrypt(keyCrypterMock, aesKeyMock, newParentMock);
            //Assert statement(s)
            verify(newParentMock).isEncrypted();
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
            verify(target).getPrivKeyBytes();
        }
    }

    //Sapient generated method id: ${5fd010fe-3627-31fc-9fb9-9d67fcd77f39}
    @Ignore()
    @Test()
    public void encrypt2WhenPrivKeyBytesIsNullThrowsIllegalStateException() throws KeyCrypterException {
        /* Branches:
         * (newParent != null) : true
         * (privKeyBytes != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey newParentMock = mock(DeterministicKey.class);
        ECPoint eCPointMock = mock(ECPoint.class);
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class);
        AesKey aesKeyMock = mock(AesKey.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            doReturn(false).when(newParentMock).isEncrypted();
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenThrow(illegalStateException);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(null).when(target).getPrivKeyBytes();
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.encrypt(keyCrypterMock, aesKeyMock, newParentMock);
            //Assert statement(s)
            verify(newParentMock).isEncrypted();
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
            verify(target).getPrivKeyBytes();
        }
    }

    //Sapient generated method id: ${63f88a15-f153-3355-8f0b-9452482b4c7d}
    @Ignore()
    @Test()
    public void isPubKeyOnlyWhenParentIsNull() {
        /* Branches:
         * (priv == null) : true  #  inside isPubKeyOnly method
         * (super.isPubKeyOnly()) : true
         * (parent == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class);
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.isPubKeyOnly();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            hDPath.verify(() -> HDPath.M(anyList()));
        }
    }

    //Sapient generated method id: ${299670c8-bb7c-32d4-94a0-e9d9de37f21c}
    @Ignore()
    @Test()
    public void hasPrivKeyWhenFindParentWithPrivKeyIsNotNull() {
        /* Branches:
         * (cursor != null) : true  #  inside findParentWithPrivKey method
         * (cursor.priv != null) : true  #  inside findParentWithPrivKey method
         * (findParentWithPrivKey() != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class);
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.hasPrivKey();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            hDPath.verify(() -> HDPath.M(anyList()));
        }
    }

    //Sapient generated method id: ${f6dc8068-b82e-3f3b-a989-8663e68346c2}
    @Ignore()
    @Test()
    public void hasPrivKeyWhenFindParentWithPrivKeyIsNull() {
        /* Branches:
         * (cursor != null) : true  #  inside findParentWithPrivKey method
         * (cursor.priv != null) : false  #  inside findParentWithPrivKey method
         * (findParentWithPrivKey() != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class);
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.hasPrivKey();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            hDPath.verify(() -> HDPath.M(anyList()));
        }
    }

    //Sapient generated method id: ${9eb0d3d9-1f8e-3a76-b473-e5957133c84b}
    @Ignore()
    @Test()
    public void getSecretBytesWhenPrivIsNull() {
        /* Branches:
         * (priv != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class);
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            byte[] result = target.getSecretBytes();
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            hDPath.verify(() -> HDPath.M(anyList()));
        }
    }

    //Sapient generated method id: ${11ec679c-f610-345e-b1fb-4cd7fc2f0db5}
    @Ignore()
    @Test()
    public void isEncryptedWhenParentIsNull() {
        /* Branches:
         * (priv == null) : true
         * (keyCrypter != null) : false  #  inside isEncrypted method
         * (super.isEncrypted()) : false
         * (parent != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class);
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.isEncrypted();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            hDPath.verify(() -> HDPath.M(anyList()));
        }
    }

    //Sapient generated method id: ${c5e1e484-0645-3a8e-841c-13183e0b0b5b}
    @Ignore()
    @Test()
    public void getKeyCrypterWhenParentIsNull() {
        /* Branches:
         * (keyCrypter != null) : false
         * (parent != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class);
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            KeyCrypter result = target.getKeyCrypter();
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            hDPath.verify(() -> HDPath.M(anyList()));
        }
    }

    //Sapient generated method id: ${691b4cc1-a6de-3b56-b162-e03d34e732de}
    @Ignore()
    @Test()
    public void sign1WhenPrivIsNullThrowsECKeyMissingPrivateKeyException() throws KeyCrypterException {
        /* Branches:
         * (isEncrypted()) : true
         * (crypter != null) : false  #  inside sign method
         * (priv == null) : true  #  inside sign method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        AesKey aesKeyMock = mock(AesKey.class);
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(true).when(target).isEncrypted();
            thrown.expect(ECKey.MissingPrivateKeyException.class);
            //Act Statement(s)
            target.sign(sha256HashMock, aesKeyMock);
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
            verify(target).isEncrypted();
        }
    }

    //Sapient generated method id: ${c242016c-319d-3a46-9a9a-57134e37d4a0}
    @Ignore()
    @Test()
    public void sign1WhenPrivateKeyIsNullThrowsECKeyMissingPrivateKeyException() throws KeyCrypterException {
        /* Branches:
         * (isEncrypted()) : false
         * (cursor != null) : true  #  inside findParentWithPrivKey method
         * (cursor.priv != null) : false  #  inside findParentWithPrivKey method
         * (cursor == null) : true  #  inside findOrDerivePrivateKey method
         * (privateKey == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        AesKey aesKeyMock = mock(AesKey.class);
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(false).when(target).isEncrypted();
            thrown.expect(ECKey.MissingPrivateKeyException.class);
            //Act Statement(s)
            target.sign(sha256HashMock, aesKeyMock);
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
            verify(target).isEncrypted();
        }
    }

    //Sapient generated method id: ${b2394f5a-f932-3b5b-a6dc-bb6f0a2a3f2b}
    @Ignore()
    @Test()
    public void sign1WhenDefaultBranchThrowsIllegalArgumentException() throws KeyCrypterException {
        /* Branches:
         * (isEncrypted()) : false
         * (cursor != null) : true  #  inside findParentWithPrivKey method
         * (cursor.priv != null) : true  #  inside findParentWithPrivKey method
         * (cursor == null) : false  #  inside findOrDerivePrivateKey method
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 73)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        AesKey aesKeyMock = mock(AesKey.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            byte[] byteArray = new byte[]{(byte) 0};
            byteUtils.when(() -> ByteUtils.bytesToBigInteger(byteArray)).thenReturn(null);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(false)).thenThrow(illegalArgumentException);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = spy(new DeterministicKey(childNumberList, byteArray2, eCPointMock, false, (BigInteger) null, (DeterministicKey) null));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(false).when(target).isEncrypted();
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.sign(sha256HashMock, aesKeyMock);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()));
            byteUtils.verify(() -> ByteUtils.bytesToBigInteger(byteArray), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            verify(target).isEncrypted();
        }
    }

    //Sapient generated method id: ${17597353-c78b-3788-b1ba-76d3aa713cdb}
    @Ignore()
    @Test()
    public void sign1WhenDefaultBranchAndDefaultBranchThrowsIllegalArgumentException() throws KeyCrypterException {
        /* Branches:
         * (isEncrypted()) : false
         * (cursor != null) : true  #  inside findParentWithPrivKey method
         * (cursor.priv != null) : true  #  inside findParentWithPrivKey method
         * (cursor == null) : false  #  inside findOrDerivePrivateKey method
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        AesKey aesKeyMock = mock(AesKey.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(false).when(target).isEncrypted();
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.sign(sha256HashMock, aesKeyMock);
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            verify(target, atLeast(1)).isEncrypted();
        }
    }

    //Sapient generated method id: ${e5176521-1a94-3a5e-aae9-6b9fca38e8b5}
    @Ignore()
    @Test()
    public void sign1WhenCursorIsNotNullAndDefaultBranchAndDefaultBranchThrowsIllegalArgumentException() throws KeyCrypterException {
        /* Branches:
         * (isEncrypted()) : false
         * (cursor != null) : true  #  inside findParentWithPrivKey method
         * (cursor.priv != null) : true  #  inside findParentWithPrivKey method
         * (cursor == null) : false  #  inside findOrDerivePrivateKey method
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        AesKey aesKeyMock = mock(AesKey.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(false).when(target).isEncrypted();
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.sign(sha256HashMock, aesKeyMock);
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            verify(target, atLeast(1)).isEncrypted();
        }
    }

    //Sapient generated method id: ${dfb3ab03-6203-3e99-88f6-8c72bbb35178}
    @Ignore()
    @Test()
    public void sign1WhenDefaultBranchAndPathIsEmptyThrowsNullPointerException() throws KeyCrypterException {
        /* Branches:
         * (isEncrypted()) : false
         * (cursor != null) : true  #  inside findParentWithPrivKey method
         * (cursor.priv != null) : true  #  inside findParentWithPrivKey method
         * (cursor == null) : false  #  inside findOrDerivePrivateKey method
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 73)) : false  #  inside <init> method
         * (branch expression (line 77)) : false  #  inside <init> method
         * (branch expression (line 78)) : false  #  inside <init> method
         * (for-each(path)) : false  #  inside derivePrivateKeyDownwards method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HDPath hDPathMock = mock(HDPath.class);
        HDPath hDPathMock2 = mock(HDPath.class);
        ECPoint eCPointMock = mock(ECPoint.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        AesKey aesKeyMock = mock(AesKey.class);
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            byte[] byteArray = new byte[]{(byte) 0};
            byteUtils.when(() -> ByteUtils.bytesToBigInteger(byteArray)).thenReturn(null);
            hDPath.when(() -> HDPath.M(hDPathMock2)).thenReturn(hDPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = spy(new DeterministicKey(childNumberList, byteArray2, eCPointMock, false, (BigInteger) null, (DeterministicKey) null));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(false).when(target).isEncrypted();
            doReturn(0).when(hDPathMock).size();
            List<ChildNumber> childNumberList2 = new ArrayList<>();
            doReturn(childNumberList2).when(hDPathMock).subList(0, 0);
            thrown.expect(NullPointerException.class);
            //Act Statement(s)
            target.sign(sha256HashMock, aesKeyMock);
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
            byteUtils.verify(() -> ByteUtils.bytesToBigInteger(byteArray), atLeast(1));
            hDPath.verify(() -> HDPath.M(hDPathMock2), atLeast(1));
            verify(target).isEncrypted();
            verify(hDPathMock).size();
            verify(hDPathMock).subList(0, 0);
        }
    }

    //Sapient generated method id: ${395f69de-e2da-377c-99b6-e7c77a78b684}
    @Ignore()
    @Test()
    public void sign1WhenDownCursorPubNotEqualsPubThrowsKeyCrypterExceptionPublicPrivateMismatch() throws KeyCrypterException {
        /* Branches:
         * (isEncrypted()) : false
         * (cursor != null) : true  #  inside findParentWithPrivKey method
         * (cursor.priv != null) : true  #  inside findParentWithPrivKey method
         * (cursor == null) : false  #  inside findOrDerivePrivateKey method
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 73)) : false  #  inside <init> method
         * (branch expression (line 77)) : false  #  inside <init> method
         * (branch expression (line 78)) : false  #  inside <init> method
         * (for-each(path)) : true  #  inside derivePrivateKeyDownwards method
         * (!downCursor.pub.equals(pub)) : true  #  inside derivePrivateKeyDownwards method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HDPath hDPathMock = mock(HDPath.class);
        HDPath hDPathMock2 = mock(HDPath.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        ChildNumber childNumberMock = mock(ChildNumber.class);
        LazyECPoint publicAsPointMock = mock(LazyECPoint.class);
        ECPoint eCPointMock = mock(ECPoint.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        AesKey aesKeyMock = mock(AesKey.class);
        try (MockedStatic<HDKeyDerivation> hDKeyDerivation = mockStatic(HDKeyDerivation.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            byte[] byteArray = new byte[]{(byte) 0};
            byteUtils.when(() -> ByteUtils.bytesToBigInteger(byteArray)).thenReturn(null);
            hDPath.when(() -> HDPath.M(hDPathMock2)).thenReturn(hDPathMock);
            hDKeyDerivation.when(() -> HDKeyDerivation.deriveChildKey((DeterministicKey) any(), eq(childNumberMock))).thenReturn(deterministicKeyMock);
            doReturn(pubMock).when(publicAsPointMock).compress();
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = spy(new DeterministicKey(childNumberList, byteArray2, eCPointMock, false, (BigInteger) null, (DeterministicKey) null));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(false).when(target).isEncrypted();
            doReturn(0).when(hDPathMock).size();
            List<ChildNumber> childNumberList2 = new ArrayList<>();
            childNumberList2.add(childNumberMock);
            doReturn(childNumberList2).when(hDPathMock).subList(0, 0);
            KeyCrypterException.PublicPrivateMismatch keyCrypterExceptionPublicPrivateMismatch = new KeyCrypterException.PublicPrivateMismatch("Could not decrypt bytes");
            thrown.expect(KeyCrypterException.PublicPrivateMismatch.class);
            thrown.expectMessage(keyCrypterExceptionPublicPrivateMismatch.getMessage());
            //Act Statement(s)
            target.sign(sha256HashMock, aesKeyMock);
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
            byteUtils.verify(() -> ByteUtils.bytesToBigInteger(byteArray), atLeast(1));
            hDPath.verify(() -> HDPath.M(hDPathMock2), atLeast(1));
            hDKeyDerivation.verify(() -> HDKeyDerivation.deriveChildKey((DeterministicKey) any(), eq(childNumberMock)));
            verify(publicAsPointMock).compress();
            verify(target).isEncrypted();
            verify(hDPathMock).size();
            verify(hDPathMock).subList(0, 0);
        }
    }

    //Sapient generated method id: ${5457b0ea-612c-3305-a5d3-508db22e94b3}
    @Ignore()
    @Test()
    public void sign1WhenPrivateKeyIsNotNull() throws KeyCrypterException {
        /* Branches:
         * (isEncrypted()) : false
         * (cursor != null) : true  #  inside findParentWithPrivKey method
         * (cursor.priv != null) : true  #  inside findParentWithPrivKey method
         * (cursor == null) : false  #  inside findOrDerivePrivateKey method
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 73)) : false  #  inside <init> method
         * (branch expression (line 77)) : false  #  inside <init> method
         * (branch expression (line 78)) : false  #  inside <init> method
         * (for-each(path)) : true  #  inside derivePrivateKeyDownwards method
         * (!downCursor.pub.equals(pub)) : false  #  inside derivePrivateKeyDownwards method
         * (privateKey == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HDPath hDPathMock = mock(HDPath.class);
        HDPath hDPathMock2 = mock(HDPath.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        ChildNumber childNumberMock = mock(ChildNumber.class);
        LazyECPoint publicAsPointMock = mock(LazyECPoint.class);
        LazyECPoint lazyECPointMock = mock(LazyECPoint.class);
        ECPoint eCPointMock = mock(ECPoint.class);
        ECKey.ECDSASignature eCKeyECDSASignatureMock = mock(ECKey.ECDSASignature.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        AesKey aesKeyMock = mock(AesKey.class);
        try (MockedStatic<HDKeyDerivation> hDKeyDerivation = mockStatic(HDKeyDerivation.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            byte[] byteArray = new byte[]{(byte) 0};
            byteUtils.when(() -> ByteUtils.bytesToBigInteger(byteArray)).thenReturn(null);
            hDPath.when(() -> HDPath.M(hDPathMock2)).thenReturn(hDPathMock);
            hDKeyDerivation.when(() -> HDKeyDerivation.deriveChildKey((DeterministicKey) any(), eq(childNumberMock))).thenReturn(deterministicKeyMock);
            doReturn(lazyECPointMock).when(publicAsPointMock).compress();
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = spy(new DeterministicKey(childNumberList, byteArray2, eCPointMock, false, (BigInteger) null, (DeterministicKey) null));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(false).when(target).isEncrypted();
            doReturn(0).when(hDPathMock).size();
            List<ChildNumber> childNumberList2 = new ArrayList<>();
            childNumberList2.add(childNumberMock);
            doReturn(childNumberList2).when(hDPathMock).subList(0, 0);
            doReturn(eCKeyECDSASignatureMock).when(target).doSign(sha256HashMock, new BigInteger("0"));
            //Act Statement(s)
            ECKey.ECDSASignature result = target.sign(sha256HashMock, aesKeyMock);
            //Assert statement(s)
            assertThat(result, equalTo(eCKeyECDSASignatureMock));
            hDPath.verify(() -> HDPath.M(anyList()));
            byteUtils.verify(() -> ByteUtils.bytesToBigInteger(byteArray), atLeast(1));
            hDPath.verify(() -> HDPath.M(hDPathMock2), atLeast(1));
            hDKeyDerivation.verify(() -> HDKeyDerivation.deriveChildKey((DeterministicKey) any(), eq(childNumberMock)));
            verify(publicAsPointMock).compress();
            verify(target).isEncrypted();
            verify(hDPathMock).size();
            verify(hDPathMock).subList(0, 0);
            verify(target).doSign(sha256HashMock, new BigInteger("0"));
        }
    }

    //Sapient generated method id: ${89ba9db8-79db-334b-b0f6-6c178836faa8}
    @Ignore()
    @Test()
    public void decrypt2WhenDecryptedKeyLengthNotEquals32ThrowsKeyCrypterExceptionInvalidCipherText() throws KeyCrypterException {
        /* Branches:
         * (this.keyCrypter != null) : false
         * (encryptedPrivateKey != null) : true  #  inside findOrDeriveEncryptedPrivateKey method
         * (decryptedKey.length != 32) : true  #  inside findOrDeriveEncryptedPrivateKey method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class);
        EncryptedData encryptedDataMock = mock(EncryptedData.class);
        AesKey aesKeyMock = mock(AesKey.class);
        ECPoint eCPointMock = mock(ECPoint.class);
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(keyCrypterMock).decrypt(encryptedDataMock, aesKeyMock);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = new DeterministicKey(childNumberList, byteArray2, eCPointMock, false, (BigInteger) null, (DeterministicKey) null);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            KeyCrypterException.InvalidCipherText keyCrypterExceptionInvalidCipherText = new KeyCrypterException.InvalidCipherText("Decrypted key must be 32 bytes long, but is 0");
            thrown.expect(KeyCrypterException.InvalidCipherText.class);
            thrown.expectMessage(keyCrypterExceptionInvalidCipherText.getMessage());
            //Act Statement(s)
            target.decrypt(keyCrypterMock, aesKeyMock);
            //Assert statement(s)
            verify(keyCrypterMock).decrypt(encryptedDataMock, aesKeyMock);
            hDPath.verify(() -> HDPath.M(anyList()));
        }
    }

    //Sapient generated method id: ${2ab9e0b5-378e-3ba6-8173-3d5a296694bc}
    @Ignore()
    @Test()
    public void decrypt2WhenCursorIsNullThrowsKeyCrypterException() throws KeyCrypterException {
        /* Branches:
         * (this.keyCrypter != null) : false
         * (encryptedPrivateKey != null) : false  #  inside findOrDeriveEncryptedPrivateKey method
         * (cursor != null) : false  #  inside findOrDeriveEncryptedPrivateKey method
         * (cursor == null) : true  #  inside findOrDeriveEncryptedPrivateKey method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class);
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class);
        AesKey aesKeyMock = mock(AesKey.class);
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            KeyCrypterException keyCrypterException = new KeyCrypterException("Neither this key nor its parents have an encrypted private key");
            thrown.expect(KeyCrypterException.class);
            thrown.expectMessage(keyCrypterException.getMessage());
            //Act Statement(s)
            target.decrypt(keyCrypterMock, aesKeyMock);
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
        }
    }

    //Sapient generated method id: ${75ee8550-da18-3360-8835-97661170bff1}
    @Ignore()
    @Test()
    public void decrypt2WhenDefaultBranchThrowsIllegalArgumentException() throws KeyCrypterException {
        /* Branches:
         * (this.keyCrypter != null) : false
         * (encryptedPrivateKey != null) : true  #  inside findOrDeriveEncryptedPrivateKey method
         * (decryptedKey.length != 32) : false  #  inside findOrDeriveEncryptedPrivateKey method
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 96)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class);
        EncryptedData encryptedDataMock = mock(EncryptedData.class);
        AesKey aesKeyMock = mock(AesKey.class);
        ECPoint eCPointMock = mock(ECPoint.class);
        ECPoint eCPointMock2 = mock(ECPoint.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(keyCrypterMock).decrypt(encryptedDataMock, aesKeyMock);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            byteUtils.when(() -> ByteUtils.bytesToBigInteger(byteArray)).thenReturn(null);
            eCKey.when(() -> ECKey.publicPointFromPrivate((BigInteger) null)).thenReturn(eCPointMock);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(false)).thenThrow(illegalArgumentException);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = new DeterministicKey(childNumberList, byteArray2, eCPointMock2, false, (BigInteger) null, (DeterministicKey) null);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.decrypt(keyCrypterMock, aesKeyMock);
            //Assert statement(s)
            verify(keyCrypterMock).decrypt(encryptedDataMock, aesKeyMock);
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()));
            byteUtils.verify(() -> ByteUtils.bytesToBigInteger(byteArray), atLeast(1));
            eCKey.verify(() -> ECKey.publicPointFromPrivate((BigInteger) null), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
        }
    }

    //Sapient generated method id: ${27a95004-2ad6-3604-b461-6aa45e749845}
    @Ignore()
    @Test()
    public void decrypt2WhenDefaultBranchAndDefaultBranchThrowsIllegalArgumentException() throws KeyCrypterException {
        /* Branches:
         * (this.keyCrypter != null) : false
         * (encryptedPrivateKey != null) : true  #  inside findOrDeriveEncryptedPrivateKey method
         * (decryptedKey.length != 32) : false  #  inside findOrDeriveEncryptedPrivateKey method
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class);
        EncryptedData encryptedDataMock = mock(EncryptedData.class);
        AesKey aesKeyMock = mock(AesKey.class);
        ECPoint eCPointMock = mock(ECPoint.class);
        ECPoint eCPointMock2 = mock(ECPoint.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS);
             MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            doReturn(byteArray).when(keyCrypterMock).decrypt(encryptedDataMock, aesKeyMock);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            eCKey.when(() -> ECKey.publicPointFromPrivate(new BigInteger("1780731860627700044960722568376592200742329637303199754547598369979440671"))).thenReturn(eCPointMock);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = new DeterministicKey(childNumberList, byteArray2, eCPointMock2, false, (BigInteger) null, (DeterministicKey) null);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.decrypt(keyCrypterMock, aesKeyMock);
            //Assert statement(s)
            verify(keyCrypterMock, atLeast(1)).decrypt(encryptedDataMock, aesKeyMock);
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
            eCKey.verify(() -> ECKey.publicPointFromPrivate(new BigInteger("1780731860627700044960722568376592200742329637303199754547598369979440671")), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${22e0b722-830a-31c0-95d6-446e52ca05ee}
    @Ignore()
    @Test()
    public void decrypt2WhenDecryptedKeyLengthEquals32AndDefaultBranchAndDefaultBranchThrowsIllegalArgumentException() throws KeyCrypterException {
        /* Branches:
         * (this.keyCrypter != null) : false
         * (encryptedPrivateKey != null) : true  #  inside findOrDeriveEncryptedPrivateKey method
         * (decryptedKey.length != 32) : false  #  inside findOrDeriveEncryptedPrivateKey method
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class);
        EncryptedData encryptedDataMock = mock(EncryptedData.class);
        AesKey aesKeyMock = mock(AesKey.class);
        ECPoint eCPointMock = mock(ECPoint.class);
        ECPoint eCPointMock2 = mock(ECPoint.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS);
             MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            doReturn(byteArray).when(keyCrypterMock).decrypt(encryptedDataMock, aesKeyMock);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            eCKey.when(() -> ECKey.publicPointFromPrivate(new BigInteger("0"))).thenReturn(eCPointMock);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = new DeterministicKey(childNumberList, byteArray2, eCPointMock2, false, (BigInteger) null, (DeterministicKey) null);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.decrypt(keyCrypterMock, aesKeyMock);
            //Assert statement(s)
            verify(keyCrypterMock, atLeast(1)).decrypt(encryptedDataMock, aesKeyMock);
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
            eCKey.verify(() -> ECKey.publicPointFromPrivate(new BigInteger("0")), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${1513f1b5-9971-35f8-8809-94ebe05701c7}
    @Ignore()
    @Test()
    public void decrypt2WhenArraysNotEqualsKeyGetPubKeyGetPubKeyThrowsKeyCrypterExceptionPublicPrivateMismatch() throws KeyCrypterException {
        /* Branches:
         * (this.keyCrypter != null) : false
         * (encryptedPrivateKey != null) : true  #  inside findOrDeriveEncryptedPrivateKey method
         * (decryptedKey.length != 32) : false  #  inside findOrDeriveEncryptedPrivateKey method
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 96)) : false  #  inside <init> method
         * (branch expression (line 100)) : false  #  inside <init> method
         * (branch expression (line 101)) : false  #  inside <init> method
         * (!Arrays.equals(key.getPubKey(), getPubKey())) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: key
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class);
        EncryptedData encryptedDataMock = mock(EncryptedData.class);
        AesKey aesKeyMock = mock(AesKey.class);
        ECPoint eCPointMock = mock(ECPoint.class);
        ECPoint eCPointMock2 = mock(ECPoint.class);
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            doReturn(byteArray).when(keyCrypterMock).decrypt(encryptedDataMock, aesKeyMock);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            byteUtils.when(() -> ByteUtils.bytesToBigInteger(byteArray)).thenReturn(null);
            eCKey.when(() -> ECKey.publicPointFromPrivate((BigInteger) null)).thenReturn(eCPointMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = new DeterministicKey(childNumberList, byteArray2, eCPointMock2, false, (BigInteger) null, (DeterministicKey) null);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            byte[] byteArray3 = new byte[]{};
            doReturn(byteArray3).when(pubMock).getEncoded();
            KeyCrypterException.PublicPrivateMismatch keyCrypterExceptionPublicPrivateMismatch = new KeyCrypterException.PublicPrivateMismatch("Provided AES key is wrong");
            thrown.expect(KeyCrypterException.PublicPrivateMismatch.class);
            thrown.expectMessage(keyCrypterExceptionPublicPrivateMismatch.getMessage());
            //Act Statement(s)
            target.decrypt(keyCrypterMock, aesKeyMock);
            //Assert statement(s)
            verify(keyCrypterMock).decrypt(encryptedDataMock, aesKeyMock);
            hDPath.verify(() -> HDPath.M(anyList()));
            byteUtils.verify(() -> ByteUtils.bytesToBigInteger(byteArray), atLeast(1));
            eCKey.verify(() -> ECKey.publicPointFromPrivate((BigInteger) null), atLeast(1));
            verify(pubMock).getEncoded();
        }
    }

    //Sapient generated method id: ${b505da70-c617-32a4-8e03-9f1051da2f5a}
    @Ignore()
    @Test()
    public void decrypt2WhenCreationTimeIsPresent() throws KeyCrypterException {
        /* Branches:
         * (this.keyCrypter != null) : false
         * (encryptedPrivateKey != null) : true  #  inside findOrDeriveEncryptedPrivateKey method
         * (decryptedKey.length != 32) : false  #  inside findOrDeriveEncryptedPrivateKey method
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 96)) : false  #  inside <init> method
         * (branch expression (line 100)) : false  #  inside <init> method
         * (branch expression (line 101)) : false  #  inside <init> method
         * (!Arrays.equals(key.getPubKey(), getPubKey())) : false
         * (parent == null) : true
         * (creationTime.isPresent()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: key
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class);
        EncryptedData encryptedDataMock = mock(EncryptedData.class);
        AesKey aesKeyMock = mock(AesKey.class);
        ECPoint eCPointMock = mock(ECPoint.class);
        ECPoint eCPointMock2 = mock(ECPoint.class);
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            doReturn(byteArray).when(keyCrypterMock).decrypt(encryptedDataMock, aesKeyMock);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            byteUtils.when(() -> ByteUtils.bytesToBigInteger(byteArray)).thenReturn(null);
            eCKey.when(() -> ECKey.publicPointFromPrivate((BigInteger) null)).thenReturn(eCPointMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = spy(new DeterministicKey(childNumberList, byteArray2, eCPointMock2, false, (BigInteger) null, (DeterministicKey) null));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            byte[] byteArray3 = new byte[]{};
            doReturn(byteArray3).when(pubMock).getEncoded();
            Instant instant = (Instant) Instant.now();
            doReturn(Optional.of(instant)).when(target).creationTime();
            //Act Statement(s)
            DeterministicKey result = target.decrypt(keyCrypterMock, aesKeyMock);
            byte[] byteArray4 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey deterministicKey = new DeterministicKey(childNumberPathMock, byteArray4, (BigInteger) null, (DeterministicKey) null);
            deterministicKey.setCreationTime(instant);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKey));
            verify(keyCrypterMock).decrypt(encryptedDataMock, aesKeyMock);
            hDPath.verify(() -> HDPath.M(anyList()));
            byteUtils.verify(() -> ByteUtils.bytesToBigInteger(byteArray), atLeast(1));
            eCKey.verify(() -> ECKey.publicPointFromPrivate((BigInteger) null), atLeast(1));
            verify(pubMock).getEncoded();
            verify(target).creationTime();
        }
    }

    //Sapient generated method id: ${00ec26ac-e5cf-3fc0-87e7-850c83969b40}
    @Ignore()
    @Test()
    public void decrypt2WhenCreationTimeNotIsPresent() throws KeyCrypterException {
        /* Branches:
         * (this.keyCrypter != null) : false
         * (encryptedPrivateKey != null) : true  #  inside findOrDeriveEncryptedPrivateKey method
         * (decryptedKey.length != 32) : false  #  inside findOrDeriveEncryptedPrivateKey method
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 96)) : false  #  inside <init> method
         * (branch expression (line 100)) : false  #  inside <init> method
         * (branch expression (line 101)) : false  #  inside <init> method
         * (!Arrays.equals(key.getPubKey(), getPubKey())) : false
         * (parent == null) : true
         * (creationTime.isPresent()) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: key
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class);
        EncryptedData encryptedDataMock = mock(EncryptedData.class);
        AesKey aesKeyMock = mock(AesKey.class);
        ECPoint eCPointMock = mock(ECPoint.class);
        ECPoint eCPointMock2 = mock(ECPoint.class);
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            doReturn(byteArray).when(keyCrypterMock).decrypt(encryptedDataMock, aesKeyMock);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            byteUtils.when(() -> ByteUtils.bytesToBigInteger(byteArray)).thenReturn(null);
            eCKey.when(() -> ECKey.publicPointFromPrivate((BigInteger) null)).thenReturn(eCPointMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = spy(new DeterministicKey(childNumberList, byteArray2, eCPointMock2, false, (BigInteger) null, (DeterministicKey) null));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            byte[] byteArray3 = new byte[]{};
            doReturn(byteArray3).when(pubMock).getEncoded();
            doReturn(Optional.empty()).when(target).creationTime();
            //Act Statement(s)
            DeterministicKey result = target.decrypt(keyCrypterMock, aesKeyMock);
            byte[] byteArray4 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey deterministicKey = new DeterministicKey(childNumberPathMock, byteArray4, (BigInteger) null, (DeterministicKey) null);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKey));
            verify(keyCrypterMock).decrypt(encryptedDataMock, aesKeyMock);
            hDPath.verify(() -> HDPath.M(anyList()));
            byteUtils.verify(() -> ByteUtils.bytesToBigInteger(byteArray), atLeast(1));
            eCKey.verify(() -> ECKey.publicPointFromPrivate((BigInteger) null), atLeast(1));
            verify(pubMock).getEncoded();
            verify(target).creationTime();
        }
    }

    //Sapient generated method id: ${fbfe1094-0194-34e7-9c58-34466ad76411}
    @Ignore()
    @Test()
    public void decrypt3WhenCrypterIsNullThrowsKeyCrypterException() throws KeyCrypterException {
        /* Branches:
         * (crypter == null) : true  #  inside decrypt method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class);
        AesKey aesKeyMock = mock(AesKey.class);
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            KeyCrypterException keyCrypterException = new KeyCrypterException("No key crypter available");
            thrown.expect(KeyCrypterException.class);
            thrown.expectMessage(keyCrypterException.getMessage());
            //Act Statement(s)
            target.decrypt(aesKeyMock);
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
        }
    }

    //Sapient generated method id: ${847078d9-f326-3656-881d-1fe9a0715edd}
    @Ignore()
    @Test()
    public void deriveTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        try (MockedStatic<HDKeyDerivation> hDKeyDerivation = mockStatic(HDKeyDerivation.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            hDKeyDerivation.when(() -> HDKeyDerivation.deriveChildKey(eq(target), (ChildNumber) any())).thenReturn(deterministicKeyMock);
            //Act Statement(s)
            DeterministicKey result = target.derive(0);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyMock));
            hDPath.verify(() -> HDPath.M(anyList()));
            hDKeyDerivation.verify(() -> HDKeyDerivation.deriveChildKey(eq(target), (ChildNumber) any()));
        }
    }

    //Sapient generated method id: ${d70b0b85-2a0b-3905-9c82-0e0a249d77f9}
    @Ignore()
    @Test()
    public void getPrivKeyWhenKeyIsNullThrowsIllegalStateException() {
        /* Branches:
         * (cursor != null) : true  #  inside findParentWithPrivKey method
         * (cursor.priv != null) : false  #  inside findParentWithPrivKey method
         * (cursor == null) : true  #  inside findOrDerivePrivateKey method
         * (key != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenThrow(illegalStateException);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.getPrivKey();
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${a2098ae7-3475-320b-a4b5-b031535d13b7}
    @Ignore()
    @Test()
    public void getPrivKeyWhenDefaultBranchThrowsIllegalArgumentException() {
        /* Branches:
         * (cursor != null) : true  #  inside findParentWithPrivKey method
         * (cursor.priv != null) : true  #  inside findParentWithPrivKey method
         * (cursor == null) : false  #  inside findOrDerivePrivateKey method
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 73)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            byte[] byteArray = new byte[]{(byte) 0};
            byteUtils.when(() -> ByteUtils.bytesToBigInteger(byteArray)).thenReturn(null);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(false)).thenThrow(illegalArgumentException);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = new DeterministicKey(childNumberList, byteArray2, eCPointMock, false, (BigInteger) null, (DeterministicKey) null);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.getPrivKey();
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()));
            byteUtils.verify(() -> ByteUtils.bytesToBigInteger(byteArray), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
        }
    }

    //Sapient generated method id: ${88872330-aedc-3e98-9771-21eab913eccc}
    @Ignore()
    @Test()
    public void getPrivKeyWhenDefaultBranchAndDefaultBranchThrowsIllegalArgumentException() {
        /* Branches:
         * (cursor != null) : true  #  inside findParentWithPrivKey method
         * (cursor.priv != null) : true  #  inside findParentWithPrivKey method
         * (cursor == null) : false  #  inside findOrDerivePrivateKey method
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.getPrivKey();
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${0783cf73-663d-3eac-b19b-3ed2921d9d9d}
    @Ignore()
    @Test()
    public void getPrivKeyWhenCursorIsNotNullAndDefaultBranchAndDefaultBranchThrowsIllegalArgumentException() {
        /* Branches:
         * (cursor != null) : true  #  inside findParentWithPrivKey method
         * (cursor.priv != null) : true  #  inside findParentWithPrivKey method
         * (cursor == null) : false  #  inside findOrDerivePrivateKey method
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.getPrivKey();
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${b3f60b5e-8468-35b3-a413-8c911c105b9f}
    @Ignore()
    @Test()
    public void getPrivKeyWhenDefaultBranchAndPathIsEmptyThrowsNullPointerException() {
        /* Branches:
         * (cursor != null) : true  #  inside findParentWithPrivKey method
         * (cursor.priv != null) : true  #  inside findParentWithPrivKey method
         * (cursor == null) : false  #  inside findOrDerivePrivateKey method
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 73)) : false  #  inside <init> method
         * (branch expression (line 77)) : false  #  inside <init> method
         * (branch expression (line 78)) : false  #  inside <init> method
         * (for-each(path)) : false  #  inside derivePrivateKeyDownwards method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HDPath hDPathMock = mock(HDPath.class);
        HDPath hDPathMock2 = mock(HDPath.class);
        ECPoint eCPointMock = mock(ECPoint.class);
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            byte[] byteArray = new byte[]{(byte) 0};
            byteUtils.when(() -> ByteUtils.bytesToBigInteger(byteArray)).thenReturn(null);
            hDPath.when(() -> HDPath.M(hDPathMock2)).thenReturn(hDPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = new DeterministicKey(childNumberList, byteArray2, eCPointMock, false, (BigInteger) null, (DeterministicKey) null);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(0).when(hDPathMock).size();
            List<ChildNumber> childNumberList2 = new ArrayList<>();
            doReturn(childNumberList2).when(hDPathMock).subList(0, 0);
            thrown.expect(NullPointerException.class);
            //Act Statement(s)
            target.getPrivKey();
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
            byteUtils.verify(() -> ByteUtils.bytesToBigInteger(byteArray), atLeast(1));
            hDPath.verify(() -> HDPath.M(hDPathMock2), atLeast(1));
            verify(hDPathMock).size();
            verify(hDPathMock).subList(0, 0);
        }
    }

    //Sapient generated method id: ${09233690-6010-3284-a1eb-8c6a00b334f2}
    @Ignore()
    @Test()
    public void getPrivKeyWhenDownCursorPubNotEqualsPubThrowsKeyCrypterExceptionPublicPrivateMismatch() {
        /* Branches:
         * (cursor != null) : true  #  inside findParentWithPrivKey method
         * (cursor.priv != null) : true  #  inside findParentWithPrivKey method
         * (cursor == null) : false  #  inside findOrDerivePrivateKey method
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 73)) : false  #  inside <init> method
         * (branch expression (line 77)) : false  #  inside <init> method
         * (branch expression (line 78)) : false  #  inside <init> method
         * (for-each(path)) : true  #  inside derivePrivateKeyDownwards method
         * (!downCursor.pub.equals(pub)) : true  #  inside derivePrivateKeyDownwards method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HDPath hDPathMock = mock(HDPath.class);
        HDPath hDPathMock2 = mock(HDPath.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        ChildNumber childNumberMock = mock(ChildNumber.class);
        LazyECPoint publicAsPointMock = mock(LazyECPoint.class);
        ECPoint eCPointMock = mock(ECPoint.class);
        try (MockedStatic<HDKeyDerivation> hDKeyDerivation = mockStatic(HDKeyDerivation.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            byte[] byteArray = new byte[]{(byte) 0};
            byteUtils.when(() -> ByteUtils.bytesToBigInteger(byteArray)).thenReturn(null);
            hDPath.when(() -> HDPath.M(hDPathMock2)).thenReturn(hDPathMock);
            hDKeyDerivation.when(() -> HDKeyDerivation.deriveChildKey((DeterministicKey) any(), eq(childNumberMock))).thenReturn(deterministicKeyMock);
            doReturn(pubMock).when(publicAsPointMock).compress();
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = new DeterministicKey(childNumberList, byteArray2, eCPointMock, false, (BigInteger) null, (DeterministicKey) null);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(0).when(hDPathMock).size();
            List<ChildNumber> childNumberList2 = new ArrayList<>();
            childNumberList2.add(childNumberMock);
            doReturn(childNumberList2).when(hDPathMock).subList(0, 0);
            KeyCrypterException.PublicPrivateMismatch keyCrypterExceptionPublicPrivateMismatch = new KeyCrypterException.PublicPrivateMismatch("Could not decrypt bytes");
            thrown.expect(KeyCrypterException.PublicPrivateMismatch.class);
            thrown.expectMessage(keyCrypterExceptionPublicPrivateMismatch.getMessage());
            //Act Statement(s)
            target.getPrivKey();
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
            byteUtils.verify(() -> ByteUtils.bytesToBigInteger(byteArray), atLeast(1));
            hDPath.verify(() -> HDPath.M(hDPathMock2), atLeast(1));
            hDKeyDerivation.verify(() -> HDKeyDerivation.deriveChildKey((DeterministicKey) any(), eq(childNumberMock)));
            verify(publicAsPointMock).compress();
            verify(hDPathMock).size();
            verify(hDPathMock).subList(0, 0);
        }
    }

    //Sapient generated method id: ${11945bbd-a72e-3c52-9b90-07e76f0fc32c}
    @Ignore()
    @Test()
    public void getPrivKeyWhenKeyIsNotNullThrowsIllegalStateException() {
        /* Branches:
         * (cursor != null) : true  #  inside findParentWithPrivKey method
         * (cursor.priv != null) : true  #  inside findParentWithPrivKey method
         * (cursor == null) : false  #  inside findOrDerivePrivateKey method
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 73)) : false  #  inside <init> method
         * (branch expression (line 77)) : false  #  inside <init> method
         * (branch expression (line 78)) : false  #  inside <init> method
         * (for-each(path)) : true  #  inside derivePrivateKeyDownwards method
         * (!downCursor.pub.equals(pub)) : false  #  inside derivePrivateKeyDownwards method
         * (key != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HDPath hDPathMock = mock(HDPath.class);
        HDPath hDPathMock2 = mock(HDPath.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        ChildNumber childNumberMock = mock(ChildNumber.class);
        LazyECPoint publicAsPointMock = mock(LazyECPoint.class);
        LazyECPoint lazyECPointMock = mock(LazyECPoint.class);
        ECPoint eCPointMock = mock(ECPoint.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS);
             MockedStatic<HDKeyDerivation> hDKeyDerivation = mockStatic(HDKeyDerivation.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            byte[] byteArray = new byte[]{(byte) 0};
            byteUtils.when(() -> ByteUtils.bytesToBigInteger(byteArray)).thenReturn(null);
            hDPath.when(() -> HDPath.M(hDPathMock2)).thenReturn(hDPathMock);
            hDKeyDerivation.when(() -> HDKeyDerivation.deriveChildKey((DeterministicKey) any(), eq(childNumberMock))).thenReturn(deterministicKeyMock);
            doReturn(lazyECPointMock).when(publicAsPointMock).compress();
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenThrow(illegalStateException);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = new DeterministicKey(childNumberList, byteArray2, eCPointMock, false, (BigInteger) null, (DeterministicKey) null);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(0).when(hDPathMock).size();
            List<ChildNumber> childNumberList2 = new ArrayList<>();
            childNumberList2.add(childNumberMock);
            doReturn(childNumberList2).when(hDPathMock).subList(0, 0);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.getPrivKey();
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
            byteUtils.verify(() -> ByteUtils.bytesToBigInteger(byteArray), atLeast(1));
            hDPath.verify(() -> HDPath.M(hDPathMock2), atLeast(1));
            hDKeyDerivation.verify(() -> HDKeyDerivation.deriveChildKey((DeterministicKey) any(), eq(childNumberMock)), atLeast(1));
            verify(publicAsPointMock, atLeast(1)).compress();
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()), atLeast(1));
            verify(hDPathMock, atLeast(1)).size();
            verify(hDPathMock, atLeast(1)).subList(0, 0);
        }
    }

    //Sapient generated method id: ${5c819420-c4fe-3a6c-840e-63dc3657902b}
    @Ignore()
    @Test()
    public void serializeWhenSerPositionEquals78() {
        /* Branches:
         * (outputScriptType == ScriptType.P2PKH) : true  #  inside serialize method
         * (pub) : true  #  inside serialize method
         * (pub) : true  #  inside serialize method
         * (ser.position() == 78) : true  #  inside serialize method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        Network networkMock = mock(Network.class);
        ECPoint eCPointMock = mock(ECPoint.class);
        ChildNumber childNumberMock = mock(ChildNumber.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            doReturn(0).when(networkParametersMock).getBip32HeaderP2PKHpub();
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(childNumberMock).when(target).getChildNumber();
            doReturn(0).when(childNumberMock).i();
            //Act Statement(s)
            byte[] result = target.serialize(networkMock, false);
            byte[] byteResultArray = new byte[]{};
            //Assert statement(s)
            assertThat(result, equalTo(byteResultArray));
            hDPath.verify(() -> HDPath.M(anyList()));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(networkParametersMock).getBip32HeaderP2PKHpub();
            verify(target).getChildNumber();
            verify(childNumberMock).i();
        }
    }

    //Sapient generated method id: ${01b3f761-641d-3b74-927c-1c38b8838cc0}
    @Ignore()
    @Test()
    public void serializeWhenNotPubAndSerPositionNotEquals78ThrowsIllegalStateException() {
        /* Branches:
         * (outputScriptType == ScriptType.P2PKH) : true  #  inside serialize method
         * (pub) : false  #  inside serialize method
         * (pub) : false  #  inside serialize method
         * (ser.position() == 78) : false  #  inside serialize method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        Network networkMock = mock(Network.class);
        ECPoint eCPointMock = mock(ECPoint.class);
        ChildNumber childNumberMock = mock(ChildNumber.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            doReturn(1).when(networkParametersMock).getBip32HeaderP2PKHpriv();
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(false)).thenThrow(illegalStateException);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(childNumberMock).when(target).getChildNumber();
            doReturn(1).when(childNumberMock).i();
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(target).getPrivKeyBytes33();
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.serialize(networkMock, false);
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2PKHpriv();
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            verify(target, atLeast(1)).getChildNumber();
            verify(childNumberMock, atLeast(1)).i();
            verify(target, atLeast(1)).getPrivKeyBytes33();
        }
    }

    //Sapient generated method id: ${aa3027ac-8bca-34c8-a436-b48f639f992a}
    @Ignore()
    @Test()
    public void serialize1Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock = mock(NetworkParameters.class);
        Network networkMock = mock(Network.class);
        ECPoint eCPointMock = mock(ECPoint.class);
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            doReturn(networkMock).when(paramsMock).network();
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(target).serialize(networkMock, false);
            //Act Statement(s)
            byte[] result = target.serialize(paramsMock, false);
            //Assert statement(s)
            assertThat(result, equalTo(byteArray2));
            verify(paramsMock).network();
            hDPath.verify(() -> HDPath.M(anyList()));
            verify(target).serialize(networkMock, false);
        }
    }

    //Sapient generated method id: ${5270cd42-0abd-3719-974f-f1a809e80363}
    @Ignore()
    @Test()
    public void serializePubB58WhenOutputScriptTypeNotEqualsScriptTypeP2WPKHThrowsIllegalStateException() {
        /* Branches:
         * (outputScriptType == ScriptType.P2PKH) : false  #  inside serialize method
         * (outputScriptType == ScriptType.P2WPKH) : false  #  inside serialize method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        Network networkMock = mock(Network.class);
        ECPoint eCPointMock = mock(ECPoint.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            IllegalStateException illegalStateException = new IllegalStateException("P2SH");
            thrown.expect(IllegalStateException.class);
            thrown.expectMessage(illegalStateException.getMessage());
            //Act Statement(s)
            target.serializePubB58(networkMock, ScriptType.P2SH);
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${c41d249c-c7a6-3137-9e43-53666f28382a}
    @Ignore()
    @Test()
    public void serializePubB58WhenSerPositionNotEquals78ThrowsIllegalStateException() {
        /* Branches:
         * (outputScriptType == ScriptType.P2PKH) : true  #  inside serialize method
         * (pub) : true  #  inside serialize method
         * (pub) : true  #  inside serialize method
         * (ser.position() == 78) : false  #  inside serialize method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        Network networkMock = mock(Network.class);
        ECPoint eCPointMock = mock(ECPoint.class);
        ChildNumber childNumberMock = mock(ChildNumber.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            doReturn(1).when(networkParametersMock).getBip32HeaderP2PKHpub();
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(false)).thenThrow(illegalStateException);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(childNumberMock).when(target).getChildNumber();
            doReturn(1).when(childNumberMock).i();
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.serializePubB58(networkMock, ScriptType.P2PKH);
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2PKHpub();
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            verify(target, atLeast(1)).getChildNumber();
            verify(childNumberMock, atLeast(1)).i();
        }
    }

    //Sapient generated method id: ${14f23686-a716-3257-8f67-def07a543220}
    @Ignore()
    @Test()
    public void serializePubB58WhenPubAndSerPositionEquals78() {
        /* Branches:
         * (outputScriptType == ScriptType.P2PKH) : false  #  inside serialize method
         * (outputScriptType == ScriptType.P2WPKH) : true  #  inside serialize method
         * (pub) : true  #  inside serialize method
         * (pub) : true  #  inside serialize method
         * (ser.position() == 78) : true  #  inside serialize method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        Network networkMock = mock(Network.class);
        ECPoint eCPointMock = mock(ECPoint.class);
        ChildNumber childNumberMock = mock(ChildNumber.class);
        try (MockedStatic<DeterministicKey> deterministicKey = mockStatic(DeterministicKey.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            doReturn(0).when(networkParametersMock).getBip32HeaderP2WPKHpub();
            byte[] byteArray = new byte[]{};
            deterministicKey.when(() -> DeterministicKey.toBase58(byteArray)).thenReturn("return_of_toBase58");
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = spy(new DeterministicKey(childNumberList, byteArray2, eCPointMock, false, (BigInteger) null, (DeterministicKey) null));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(childNumberMock).when(target).getChildNumber();
            doReturn(0).when(childNumberMock).i();
            //Act Statement(s)
            String result = target.serializePubB58(networkMock, ScriptType.P2PKH);
            //Assert statement(s)
            assertThat(result, equalTo("return_of_toBase58"));
            hDPath.verify(() -> HDPath.M(anyList()));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(networkParametersMock).getBip32HeaderP2WPKHpub();
            deterministicKey.verify(() -> DeterministicKey.toBase58(byteArray), atLeast(1));
            verify(target).getChildNumber();
            verify(childNumberMock).i();
        }
    }

    //Sapient generated method id: ${ddf64fa1-8426-3847-8c40-1aab6c039588}
    @Ignore()
    @Test()
    public void serializePubB581Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock = mock(NetworkParameters.class);
        Network networkMock = mock(Network.class);
        ECPoint eCPointMock = mock(ECPoint.class);
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            doReturn(networkMock).when(paramsMock).network();
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn("return_of_serializePubB58").when(target).serializePubB58(networkMock, ScriptType.P2PKH);
            //Act Statement(s)
            String result = target.serializePubB58(paramsMock, ScriptType.P2PKH);
            //Assert statement(s)
            assertThat(result, equalTo("return_of_serializePubB58"));
            verify(paramsMock).network();
            hDPath.verify(() -> HDPath.M(anyList()));
            verify(target).serializePubB58(networkMock, ScriptType.P2PKH);
        }
    }

    //Sapient generated method id: ${abcffc8b-d3c7-34ca-8c22-45dc7b23ecc4}
    @Ignore()
    @Test()
    public void serializePrivB58WhenOutputScriptTypeNotEqualsScriptTypeP2WPKHThrowsIllegalStateException() {
        /* Branches:
         * (outputScriptType == ScriptType.P2PKH) : false  #  inside serialize method
         * (outputScriptType == ScriptType.P2WPKH) : false  #  inside serialize method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        Network networkMock = mock(Network.class);
        ECPoint eCPointMock = mock(ECPoint.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            IllegalStateException illegalStateException = new IllegalStateException("P2SH");
            thrown.expect(IllegalStateException.class);
            thrown.expectMessage(illegalStateException.getMessage());
            //Act Statement(s)
            target.serializePrivB58(networkMock, ScriptType.P2SH);
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${1262055f-efa7-3f2b-a871-618f266af6f7}
    @Ignore()
    @Test()
    public void serializePrivB58WhenSerPositionNotEquals78ThrowsIllegalStateException() {
        /* Branches:
         * (outputScriptType == ScriptType.P2PKH) : true  #  inside serialize method
         * (pub) : false  #  inside serialize method
         * (pub) : false  #  inside serialize method
         * (ser.position() == 78) : false  #  inside serialize method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        Network networkMock = mock(Network.class);
        ECPoint eCPointMock = mock(ECPoint.class);
        ChildNumber childNumberMock = mock(ChildNumber.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            doReturn(1).when(networkParametersMock).getBip32HeaderP2PKHpriv();
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(false)).thenThrow(illegalStateException);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(childNumberMock).when(target).getChildNumber();
            doReturn(1).when(childNumberMock).i();
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(target).getPrivKeyBytes33();
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.serializePrivB58(networkMock, ScriptType.P2PKH);
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2PKHpriv();
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            verify(target, atLeast(1)).getChildNumber();
            verify(childNumberMock, atLeast(1)).i();
            verify(target, atLeast(1)).getPrivKeyBytes33();
        }
    }

    //Sapient generated method id: ${1a9aa3f0-1a6e-303c-bc2f-8b870cab3e48}
    @Ignore()
    @Test()
    public void serializePrivB58WhenNotPubAndSerPositionEquals78() {
        /* Branches:
         * (outputScriptType == ScriptType.P2PKH) : false  #  inside serialize method
         * (outputScriptType == ScriptType.P2WPKH) : true  #  inside serialize method
         * (pub) : false  #  inside serialize method
         * (pub) : false  #  inside serialize method
         * (ser.position() == 78) : true  #  inside serialize method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        Network networkMock = mock(Network.class);
        ECPoint eCPointMock = mock(ECPoint.class);
        ChildNumber childNumberMock = mock(ChildNumber.class);
        try (MockedStatic<DeterministicKey> deterministicKey = mockStatic(DeterministicKey.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            doReturn(0).when(networkParametersMock).getBip32HeaderP2WPKHpriv();
            byte[] byteArray = new byte[]{};
            deterministicKey.when(() -> DeterministicKey.toBase58(byteArray)).thenReturn("return_of_toBase58");
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = spy(new DeterministicKey(childNumberList, byteArray2, eCPointMock, false, (BigInteger) null, (DeterministicKey) null));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(childNumberMock).when(target).getChildNumber();
            doReturn(0).when(childNumberMock).i();
            byte[] byteArray3 = new byte[]{};
            doReturn(byteArray3).when(target).getPrivKeyBytes33();
            //Act Statement(s)
            String result = target.serializePrivB58(networkMock, ScriptType.P2PKH);
            //Assert statement(s)
            assertThat(result, equalTo("return_of_toBase58"));
            hDPath.verify(() -> HDPath.M(anyList()));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(networkParametersMock).getBip32HeaderP2WPKHpriv();
            deterministicKey.verify(() -> DeterministicKey.toBase58(byteArray), atLeast(1));
            verify(target).getChildNumber();
            verify(childNumberMock).i();
            verify(target).getPrivKeyBytes33();
        }
    }

    //Sapient generated method id: ${fbc8a622-9415-3e51-98c6-3f907b743939}
    @Ignore()
    @Test()
    public void serializePrivB581Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock = mock(NetworkParameters.class);
        Network networkMock = mock(Network.class);
        ECPoint eCPointMock = mock(ECPoint.class);
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            doReturn(networkMock).when(paramsMock).network();
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn("return_of_serializePrivB58").when(target).serializePrivB58(networkMock, ScriptType.P2PKH);
            //Act Statement(s)
            String result = target.serializePrivB58(paramsMock, ScriptType.P2PKH);
            //Assert statement(s)
            assertThat(result, equalTo("return_of_serializePrivB58"));
            verify(paramsMock).network();
            hDPath.verify(() -> HDPath.M(anyList()));
            verify(target).serializePrivB58(networkMock, ScriptType.P2PKH);
        }
    }

    //Sapient generated method id: ${da12a1c0-a7c5-3eed-bd88-5066c045434e}
    @Ignore()
    @Test()
    public void serializePubB582Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class);
        Network networkMock = mock(Network.class);
        try (MockedStatic<DeterministicKey> deterministicKey = mockStatic(DeterministicKey.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            byte[] byteArray = new byte[]{};
            deterministicKey.when(() -> DeterministicKey.toBase58(byteArray)).thenReturn("return_of_toBase58");
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = spy(new DeterministicKey(childNumberList, byteArray2, eCPointMock, false, (BigInteger) null, (DeterministicKey) null));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(byteArray).when(target).serialize(networkMock, true);
            //Act Statement(s)
            String result = target.serializePubB58(networkMock);
            //Assert statement(s)
            assertThat(result, equalTo("return_of_toBase58"));
            hDPath.verify(() -> HDPath.M(anyList()));
            deterministicKey.verify(() -> DeterministicKey.toBase58(byteArray), atLeast(1));
            verify(target).serialize(networkMock, true);
        }
    }

    //Sapient generated method id: ${39a7af40-75ac-36d7-994f-2851f88810ce}
    @Ignore()
    @Test()
    public void serializePubB583Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock = mock(NetworkParameters.class);
        Network networkMock = mock(Network.class);
        ECPoint eCPointMock = mock(ECPoint.class);
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            doReturn(networkMock).when(paramsMock).network();
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn("return_of_serializePubB58").when(target).serializePubB58(networkMock);
            //Act Statement(s)
            String result = target.serializePubB58(paramsMock);
            //Assert statement(s)
            assertThat(result, equalTo("return_of_serializePubB58"));
            verify(paramsMock).network();
            hDPath.verify(() -> HDPath.M(anyList()));
            verify(target).serializePubB58(networkMock);
        }
    }

    //Sapient generated method id: ${2335c8fa-0740-3487-859b-492a9ea59d39}
    @Ignore()
    @Test()
    public void serializePrivB582Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class);
        Network networkMock = mock(Network.class);
        try (MockedStatic<DeterministicKey> deterministicKey = mockStatic(DeterministicKey.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            byte[] byteArray = new byte[]{};
            deterministicKey.when(() -> DeterministicKey.toBase58(byteArray)).thenReturn("return_of_toBase58");
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = spy(new DeterministicKey(childNumberList, byteArray2, eCPointMock, false, (BigInteger) null, (DeterministicKey) null));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(byteArray).when(target).serialize(networkMock, false);
            //Act Statement(s)
            String result = target.serializePrivB58(networkMock);
            //Assert statement(s)
            assertThat(result, equalTo("return_of_toBase58"));
            hDPath.verify(() -> HDPath.M(anyList()));
            deterministicKey.verify(() -> DeterministicKey.toBase58(byteArray), atLeast(1));
            verify(target).serialize(networkMock, false);
        }
    }

    //Sapient generated method id: ${e4c277b6-7bd7-3193-a96a-ba848319fee0}
    @Ignore()
    @Test()
    public void serializePrivB583Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock = mock(NetworkParameters.class);
        Network networkMock = mock(Network.class);
        ECPoint eCPointMock = mock(ECPoint.class);
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            doReturn(networkMock).when(paramsMock).network();
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn("return_of_serializePrivB58").when(target).serializePrivB58(networkMock);
            //Act Statement(s)
            String result = target.serializePrivB58(paramsMock);
            //Assert statement(s)
            assertThat(result, equalTo("return_of_serializePrivB58"));
            verify(paramsMock).network();
            hDPath.verify(() -> HDPath.M(anyList()));
            verify(target).serializePrivB58(networkMock);
        }
    }

    //Sapient generated method id: ${46194f1b-99a4-3203-97b3-9dfd7f9bcf1d}
    @Ignore()
    @Test()
    public void toBase58Test() {
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};

        //Act Statement(s)
        String result = DeterministicKey.toBase58(byteArray);

        //Assert statement(s)
        assertThat(result, equalTo("1111"));
    }

    //Sapient generated method id: ${df176e4d-2ab9-335d-8be1-04640f184382}
    @Test()
    public void deserializeB58Test() {
        //Arrange Statement(s)
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        Network networkMock = mock(Network.class);
        try (MockedStatic<DeterministicKey> deterministicKey = mockStatic(DeterministicKey.class, CALLS_REAL_METHODS)) {
            deterministicKey.when(() -> DeterministicKey.deserializeB58((DeterministicKey) null, "base58", networkMock)).thenReturn(deterministicKeyMock);
            //Act Statement(s)
            DeterministicKey result = DeterministicKey.deserializeB58("base58", networkMock);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyMock));
            deterministicKey.verify(() -> DeterministicKey.deserializeB58((DeterministicKey) null, "base58", networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${b7e9bbc0-a290-3b4c-9f2c-065fb8175da7}
    @Test()
    public void deserializeB581Test() {
        //Arrange Statement(s)
        NetworkParameters paramsMock = mock(NetworkParameters.class);
        Network networkMock = mock(Network.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        try (MockedStatic<DeterministicKey> deterministicKey = mockStatic(DeterministicKey.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock).when(paramsMock).network();
            deterministicKey.when(() -> DeterministicKey.deserializeB58("base58", networkMock)).thenReturn(deterministicKeyMock);
            //Act Statement(s)
            DeterministicKey result = DeterministicKey.deserializeB58("base58", paramsMock);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyMock));
            verify(paramsMock, atLeast(1)).network();
            deterministicKey.verify(() -> DeterministicKey.deserializeB58("base58", networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${4d0cd708-afd2-30b1-8b99-c94751907f20}
    @Test()
    public void deserializeB582Test() {
        //Arrange Statement(s)
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        Network networkMock = mock(Network.class);
        DeterministicKey deterministicKeyMock2 = mock(DeterministicKey.class);
        try (MockedStatic<DeterministicKey> deterministicKey = mockStatic(DeterministicKey.class, CALLS_REAL_METHODS);
             MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{};
            base58.when(() -> Base58.decodeChecked("A")).thenReturn(byteArray);
            deterministicKey.when(() -> DeterministicKey.deserialize(networkMock, byteArray, deterministicKeyMock2)).thenReturn(deterministicKeyMock);
            //Act Statement(s)
            DeterministicKey result = DeterministicKey.deserializeB58(deterministicKeyMock2, "A", networkMock);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyMock));
            base58.verify(() -> Base58.decodeChecked("A"), atLeast(1));
            deterministicKey.verify(() -> DeterministicKey.deserialize(networkMock, byteArray, deterministicKeyMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${1f55c6b1-ea91-3812-8c46-dbf3f95f5141}
    @Test()
    public void deserializeB583Test() {
        //Arrange Statement(s)
        NetworkParameters paramsMock = mock(NetworkParameters.class);
        Network networkMock = mock(Network.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock2 = mock(DeterministicKey.class);
        try (MockedStatic<DeterministicKey> deterministicKey = mockStatic(DeterministicKey.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock).when(paramsMock).network();
            deterministicKey.when(() -> DeterministicKey.deserializeB58(deterministicKeyMock2, "base58", networkMock)).thenReturn(deterministicKeyMock);
            //Act Statement(s)
            DeterministicKey result = DeterministicKey.deserializeB58(deterministicKeyMock2, "base58", paramsMock);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyMock));
            verify(paramsMock, atLeast(1)).network();
            deterministicKey.verify(() -> DeterministicKey.deserializeB58(deterministicKeyMock2, "base58", networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${9d317733-e6d7-3927-8baa-83a51bcd6892}
    @Test()
    public void deserializeTest() {
        //Arrange Statement(s)
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        Network networkMock = mock(Network.class);
        try (MockedStatic<DeterministicKey> deterministicKey = mockStatic(DeterministicKey.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            deterministicKey.when(() -> DeterministicKey.deserialize(networkMock, byteArray, (DeterministicKey) null)).thenReturn(deterministicKeyMock);
            //Act Statement(s)
            DeterministicKey result = DeterministicKey.deserialize(networkMock, byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyMock));
            deterministicKey.verify(() -> DeterministicKey.deserialize(networkMock, byteArray, (DeterministicKey) null), atLeast(1));
        }
    }

    //Sapient generated method id: ${48f153f8-9f5d-3f80-9a15-fb1715c8b9da}
    @Test()
    public void deserialize1Test() {
        //Arrange Statement(s)
        NetworkParameters paramsMock = mock(NetworkParameters.class);
        Network networkMock = mock(Network.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        try (MockedStatic<DeterministicKey> deterministicKey = mockStatic(DeterministicKey.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock).when(paramsMock).network();
            byte[] byteArray = new byte[]{};
            deterministicKey.when(() -> DeterministicKey.deserialize(networkMock, byteArray)).thenReturn(deterministicKeyMock);
            //Act Statement(s)
            DeterministicKey result = DeterministicKey.deserialize(paramsMock, byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyMock));
            verify(paramsMock, atLeast(1)).network();
            deterministicKey.verify(() -> DeterministicKey.deserialize(networkMock, byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${1d3af5bb-8767-3f8d-bd56-649b58d56d0f}
    @Ignore()
    @Test()
    public void deserialize2WhenNotPubThrowsIllegalArgumentException() {
        /* Branches:
         * (header == params.getBip32HeaderP2PKHpub()) : false
         * (header == params.getBip32HeaderP2WPKHpub()) : false
         * (header == params.getBip32HeaderP2PKHpriv()) : false
         * (header == params.getBip32HeaderP2WPKHpriv()) : false
         * (!(pub || priv)) : true
         * (pub) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        Network networkMock = mock(Network.class, "networkValue");
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class, "parentValue");
        try (MockedStatic<DeterministicKey> deterministicKey = mockStatic(DeterministicKey.class, CALLS_REAL_METHODS);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            doReturn(789).when(networkParametersMock).getBip32HeaderP2PKHpub();
            doReturn(456).when(networkParametersMock).getBip32HeaderP2WPKHpub();
            doReturn(123).when(networkParametersMock).getBip32HeaderP2PKHpriv();
            doReturn(101112).when(networkParametersMock).getBip32HeaderP2WPKHpriv();
            byte[] byteArray = new byte[]{(byte) 0};
            deterministicKey.when(() -> DeterministicKey.toBase58(byteArray)).thenReturn("stringValue");
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unknown header bytes: stri");
            thrown.expect(IllegalArgumentException.class);
            thrown.expectMessage(illegalArgumentException.getMessage());
            //Act Statement(s)
            DeterministicKey.deserialize(networkMock, byteArray, deterministicKeyMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2PKHpub();
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2WPKHpub();
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2PKHpriv();
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2WPKHpriv();
            deterministicKey.verify(() -> DeterministicKey.toBase58(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${891ad14d-c259-3f54-94ac-e96b8d6190ec}
    @Ignore()
    @Test()
    public void deserialize2WhenPubOrPrivAndParentIsNotNullAndParentFingerprintEquals0ThrowsIllegalArgumentException() {
        /* Branches:
         * (header == params.getBip32HeaderP2PKHpub()) : false
         * (header == params.getBip32HeaderP2WPKHpub()) : true
         * (header == params.getBip32HeaderP2PKHpriv()) : false
         * (header == params.getBip32HeaderP2WPKHpriv()) : true
         * (!(pub || priv)) : false
         * (parent != null) : true
         * (parentFingerprint == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        Network networkMock = mock(Network.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            doReturn(1).when(networkParametersMock).getBip32HeaderP2PKHpub();
            doReturn(0).when(networkParametersMock).getBip32HeaderP2WPKHpub();
            doReturn(1).when(networkParametersMock).getBip32HeaderP2PKHpriv();
            doReturn(0).when(networkParametersMock).getBip32HeaderP2WPKHpriv();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Parent was provided but this key doesn't have one");
            thrown.expect(IllegalArgumentException.class);
            thrown.expectMessage(illegalArgumentException.getMessage());
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            DeterministicKey.deserialize(networkMock, byteArray, deterministicKeyMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(networkParametersMock).getBip32HeaderP2PKHpub();
            verify(networkParametersMock).getBip32HeaderP2WPKHpub();
            verify(networkParametersMock).getBip32HeaderP2PKHpriv();
            verify(networkParametersMock).getBip32HeaderP2WPKHpriv();
        }
    }

    //Sapient generated method id: ${65d42a0f-272d-38dc-8433-52bb61cb3186}
    @Ignore()
    @Test()
    public void deserialize2WhenParentFingerprintNotEquals0AndParentGetFingerprintNotEqualsParentFingerpr2ThrowsIllegalArgumentException() {
        /* Branches:
         * (header == params.getBip32HeaderP2PKHpub()) : false
         * (header == params.getBip32HeaderP2WPKHpub()) : true
         * (header == params.getBip32HeaderP2PKHpriv()) : false
         * (header == params.getBip32HeaderP2WPKHpriv()) : true
         * (!(pub || priv)) : false
         * (parent != null) : true
         * (parentFingerprint == 0) : false
         * (parent.getFingerprint() != parentFingerprint) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey parentMock = mock(DeterministicKey.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        Network networkMock = mock(Network.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(1).when(parentMock).getFingerprint();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            doReturn(2).when(networkParametersMock).getBip32HeaderP2PKHpub();
            doReturn(1).when(networkParametersMock).getBip32HeaderP2WPKHpub();
            doReturn(2).when(networkParametersMock).getBip32HeaderP2PKHpriv();
            doReturn(1).when(networkParametersMock).getBip32HeaderP2WPKHpriv();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Parent fingerprints don't match");
            thrown.expect(IllegalArgumentException.class);
            thrown.expectMessage(illegalArgumentException.getMessage());
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            DeterministicKey.deserialize(networkMock, byteArray, parentMock);
            //Assert statement(s)
            verify(parentMock).getFingerprint();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(networkParametersMock).getBip32HeaderP2PKHpub();
            verify(networkParametersMock).getBip32HeaderP2WPKHpub();
            verify(networkParametersMock).getBip32HeaderP2PKHpriv();
            verify(networkParametersMock).getBip32HeaderP2WPKHpriv();
        }
    }

    //Sapient generated method id: ${726b4a65-1d3a-3cde-8b95-801c38f5ce47}
    @Ignore()
    @Test()
    public void deserialize2WhenDepthGreaterThanOrEqualsTo1AndBufferHasRemainingThrowsIllegalArgumentException() {
        /* Branches:
         * (header == params.getBip32HeaderP2PKHpub()) : false
         * (header == params.getBip32HeaderP2WPKHpub()) : true
         * (header == params.getBip32HeaderP2PKHpriv()) : false
         * (header == params.getBip32HeaderP2WPKHpriv()) : true
         * (!(pub || priv)) : false
         * (parent != null) : false
         * (depth >= 1) : true
         * (!buffer.hasRemaining()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        Network networkMock = mock(Network.class);
        HDPath hDPathMock = mock(HDPath.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            doReturn(0).when(networkParametersMock).getBip32HeaderP2PKHpub();
            doReturn(0).when(networkParametersMock).getBip32HeaderP2WPKHpub();
            doReturn(0).when(networkParametersMock).getBip32HeaderP2PKHpriv();
            doReturn(0).when(networkParametersMock).getBip32HeaderP2WPKHpriv();
            hDPath.when(() -> HDPath.M((ChildNumber) any())).thenReturn(hDPathMock);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            thrown.expect(IllegalArgumentException.class);
            byte[] byteArray = new byte[]{};
            DeterministicKey deterministicKey = null;
            //Act Statement(s)
            DeterministicKey.deserialize(networkMock, byteArray, deterministicKey);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(networkParametersMock).getBip32HeaderP2PKHpub();
            verify(networkParametersMock).getBip32HeaderP2WPKHpub();
            verify(networkParametersMock).getBip32HeaderP2PKHpriv();
            verify(networkParametersMock).getBip32HeaderP2WPKHpriv();
            hDPath.verify(() -> HDPath.M((ChildNumber) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${efd004a9-dc91-3990-8ad5-939e3f8f6115}
    @Ignore()
    @Test()
    public void deserialize2WhenParentIsNullAndDepthLessThan1AndBufferNotHasRemainingThrowsIllegalArgumentException() {
        /* Branches:
         * (header == params.getBip32HeaderP2PKHpub()) : false
         * (header == params.getBip32HeaderP2WPKHpub()) : true
         * (header == params.getBip32HeaderP2PKHpriv()) : false
         * (header == params.getBip32HeaderP2WPKHpriv()) : true
         * (!(pub || priv)) : false
         * (parent != null) : false
         * (depth >= 1) : false
         * (!buffer.hasRemaining()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        Network networkMock = mock(Network.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            doReturn(1).when(networkParametersMock).getBip32HeaderP2PKHpub();
            doReturn(0).when(networkParametersMock).getBip32HeaderP2WPKHpub();
            doReturn(1).when(networkParametersMock).getBip32HeaderP2PKHpriv();
            doReturn(0).when(networkParametersMock).getBip32HeaderP2WPKHpriv();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            thrown.expect(IllegalArgumentException.class);
            byte[] byteArray = new byte[]{};
            DeterministicKey deterministicKey = null;
            //Act Statement(s)
            DeterministicKey.deserialize(networkMock, byteArray, deterministicKey);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(networkParametersMock).getBip32HeaderP2PKHpub();
            verify(networkParametersMock).getBip32HeaderP2WPKHpub();
            verify(networkParametersMock).getBip32HeaderP2PKHpriv();
            verify(networkParametersMock).getBip32HeaderP2WPKHpriv();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${207c524e-4f54-3e6e-9a35-0cd48d73a51a}
    @Ignore()
    @Test()
    public void deserialize2WhenParentFingerprintNotEquals0AndParentGetFingerprintEqualsParentFingerprintThrowsIllegalArgumentException() {
        /* Branches:
         * (header == params.getBip32HeaderP2PKHpub()) : false
         * (header == params.getBip32HeaderP2WPKHpub()) : true
         * (header == params.getBip32HeaderP2PKHpriv()) : false
         * (header == params.getBip32HeaderP2WPKHpriv()) : true
         * (!(pub || priv)) : false
         * (parent != null) : true
         * (parentFingerprint == 0) : false
         * (parent.getFingerprint() != parentFingerprint) : false
         * (path.size() != depth) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey parentMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        HDPath hDPathMock2 = mock(HDPath.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        Network networkMock = mock(Network.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(1).when(parentMock).getFingerprint();
            doReturn(hDPathMock).when(parentMock).getPath();
            ChildNumber[] childNumberArray = new ChildNumber[]{};
            doReturn(hDPathMock2).when(hDPathMock).extend((ChildNumber) any(), eq(childNumberArray));
            doReturn(2).when(hDPathMock2).size();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            doReturn(2).when(networkParametersMock).getBip32HeaderP2PKHpub();
            doReturn(1).when(networkParametersMock).getBip32HeaderP2WPKHpub();
            doReturn(2).when(networkParametersMock).getBip32HeaderP2PKHpriv();
            doReturn(1).when(networkParametersMock).getBip32HeaderP2WPKHpriv();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Depth does not match");
            thrown.expect(IllegalArgumentException.class);
            thrown.expectMessage(illegalArgumentException.getMessage());
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            DeterministicKey.deserialize(networkMock, byteArray, parentMock);
            //Assert statement(s)
            verify(parentMock).getFingerprint();
            verify(parentMock).getPath();
            verify(hDPathMock).extend((ChildNumber) any(), eq(childNumberArray));
            verify(hDPathMock2).size();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(networkParametersMock).getBip32HeaderP2PKHpub();
            verify(networkParametersMock).getBip32HeaderP2WPKHpub();
            verify(networkParametersMock).getBip32HeaderP2PKHpriv();
            verify(networkParametersMock).getBip32HeaderP2WPKHpriv();
        }
    }

    //Sapient generated method id: ${fbeecbd7-1075-32a1-a73e-fc3871def50a}
    @Ignore()
    @Test()
    public void deserialize2WhenPathSizeEqualsDepthAndBufferNotHasRemaining5ThrowsIllegalArgumentException() {
        /* Branches:
         * (header == params.getBip32HeaderP2PKHpub()) : false
         * (header == params.getBip32HeaderP2WPKHpub()) : false
         * (header == params.getBip32HeaderP2PKHpriv()) : false
         * (header == params.getBip32HeaderP2WPKHpriv()) : true
         * (!(pub || priv)) : true
         * (pub) : true
         * (parent != null) : true
         * (parentFingerprint == 0) : false
         * (parent.getFingerprint() != parentFingerprint) : false
         * (path.size() != depth) : false
         * (!buffer.hasRemaining()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey parentMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        HDPath hDPathMock2 = mock(HDPath.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        Network networkMock = mock(Network.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(1).when(parentMock).getFingerprint();
            doReturn(hDPathMock).when(parentMock).getPath();
            ChildNumber[] childNumberArray = new ChildNumber[]{};
            doReturn(hDPathMock2).when(hDPathMock).extend((ChildNumber) any(), eq(childNumberArray));
            doReturn(1).when(hDPathMock2).size();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            doReturn(2).when(networkParametersMock).getBip32HeaderP2PKHpub();
            doReturn(2).when(networkParametersMock).getBip32HeaderP2WPKHpub();
            doReturn(2).when(networkParametersMock).getBip32HeaderP2PKHpriv();
            doReturn(1).when(networkParametersMock).getBip32HeaderP2WPKHpriv();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            thrown.expect(IllegalArgumentException.class);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            DeterministicKey.deserialize(networkMock, byteArray, parentMock);
            //Assert statement(s)
            verify(parentMock).getFingerprint();
            verify(parentMock).getPath();
            verify(hDPathMock).extend((ChildNumber) any(), eq(childNumberArray));
            verify(hDPathMock2).size();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(networkParametersMock).getBip32HeaderP2PKHpub();
            verify(networkParametersMock).getBip32HeaderP2WPKHpub();
            verify(networkParametersMock).getBip32HeaderP2PKHpriv();
            verify(networkParametersMock).getBip32HeaderP2WPKHpriv();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${7c5a079f-33a1-3a9e-99d6-7818f6a4d2f6}
    @Test()
    public void deserialize3Test() {
        //Arrange Statement(s)
        NetworkParameters paramsMock = mock(NetworkParameters.class);
        Network networkMock = mock(Network.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock2 = mock(DeterministicKey.class);
        try (MockedStatic<DeterministicKey> deterministicKey = mockStatic(DeterministicKey.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock).when(paramsMock).network();
            byte[] byteArray = new byte[]{};
            deterministicKey.when(() -> DeterministicKey.deserialize(networkMock, byteArray, deterministicKeyMock2)).thenReturn(deterministicKeyMock);
            //Act Statement(s)
            DeterministicKey result = DeterministicKey.deserialize(paramsMock, byteArray, deterministicKeyMock2);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyMock));
            verify(paramsMock, atLeast(1)).network();
            deterministicKey.verify(() -> DeterministicKey.deserialize(networkMock, byteArray, deterministicKeyMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${d097ba19-f4f3-3c41-9f52-c335e6afd28b}
    @Ignore()
    @Test()
    public void creationTimeWhenParentIsNull() {
        /* Branches:
         * (parent != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class);
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            Optional<Instant> result = target.creationTime();
            Optional<Instant> instantOptional = Optional.empty();
            //Assert statement(s)
            assertThat(result, equalTo(instantOptional));
            hDPath.verify(() -> HDPath.M(anyList()));
        }
    }

    //Sapient generated method id: ${2ad6838f-648f-3a8d-8531-a16ed6db9db7}
    @Ignore()
    @Test()
    public void setCreationTimeWhenParentIsNull() {
        /* Branches:
         * (parent != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class);
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            Instant instant = Instant.now();
            //Act Statement(s)
            target.setCreationTime(instant);
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
        }
    }

    //Sapient generated method id: ${b7f79d32-a23e-3b5a-9d0d-3ef21424e43c}
    @Ignore()
    @Test()
    public void clearCreationTimeWhenParentIsNull() {
        /* Branches:
         * (parent != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class);
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.clearCreationTime();
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
        }
    }

    //Sapient generated method id: ${aab7b3ee-0703-3aca-9aba-6676b7a750b3}
    @Ignore()
    @Test()
    public void setCreationTimeSecondsWhenCreationTimeSecsGreaterThan0() {
        /* Branches:
         * (creationTimeSecs > 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class);
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).setCreationTime((Instant) any());
            //Act Statement(s)
            target.setCreationTimeSeconds(1L);
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
            verify(target).setCreationTime((Instant) any());
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
        ECPoint eCPointMock = mock(ECPoint.class);
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).clearCreationTime();
            //Act Statement(s)
            target.setCreationTimeSeconds(0L);
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
            verify(target).clearCreationTime();
        }
    }

    //Sapient generated method id: ${6efdfffb-ab76-3832-8528-819e02d958d6}
    @Ignore()
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
        ECPoint eCPointMock = mock(ECPoint.class);
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{};
            target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("s1");
            thrown.expect(IllegalArgumentException.class);
            thrown.expectMessage(illegalArgumentException.getMessage());
            //Act Statement(s)
            target.setCreationTimeSeconds(0L);
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
        }
    }

    //Sapient generated method id: ${6c7dc047-c4d5-34bd-a75c-5721b506a290}
    @Ignore()
    @Test()
    public void toStringWhenCreationTimeNotIsPresent() {
        /* Branches:
         * (!creationTime.isPresent()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class);
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn("return_of_getPathAsString1").when(target).getPathAsString();
            doReturn(Optional.empty()).when(target).creationTime();
            doReturn(false).when(target).isEncrypted();
            doReturn(false).when(target).isPubKeyOnly();
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("toString_moreObjects.ToStringHelper2"));
            hDPath.verify(() -> HDPath.M(anyList()));
            verify(target).getPathAsString();
            verify(target).creationTime();
            verify(target).isEncrypted();
            verify(target).isPubKeyOnly();
        }
    }

    //Sapient generated method id: ${62a3087a-76bb-3419-b424-41b0ba38daac}
    @Ignore()
    @Test()
    public void toStringWhenParentIsNull() {
        /* Branches:
         * (!creationTime.isPresent()) : false
         * (parent != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class);
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn("return_of_getPathAsString1").when(target).getPathAsString();
            Instant instant = (Instant) Instant.now();
            doReturn(Optional.of(instant)).when(target).creationTime();
            doReturn(false).when(target).isEncrypted();
            doReturn(false).when(target).isPubKeyOnly();
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("toString_moreObjects.ToStringHelper2"));
            hDPath.verify(() -> HDPath.M(anyList()));
            verify(target).getPathAsString();
            verify(target).creationTime();
            verify(target).isEncrypted();
            verify(target).isPubKeyOnly();
        }
    }

    //Sapient generated method id: ${6602eebf-c604-3dd3-9523-fef4c4c9c63e}
    @Ignore()
    @Test()
    public void formatKeyWithAddressWhenIncludePrivateKeys() {
        /* Branches:
         * (comment != null) : true
         * (includePrivateKeys) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECPoint eCPointMock = mock(ECPoint.class);
        Address addressMock = mock(Address.class, "formatKeyWithAddress_address1");
        Network networkMock = mock(Network.class);
        AesKey aesKeyMock = mock(AesKey.class);
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(addressMock).when(target).toAddress(ScriptType.P2PKH, networkMock);
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(target).getPubKeyHash();
            doReturn("builderItem1").when(target).getPathAsString();
            doReturn("builderItem1").when(target).toStringWithPrivate(aesKeyMock, networkMock);
            StringBuilder stringBuilder = new StringBuilder();
            //Act Statement(s)
            target.formatKeyWithAddress(true, aesKeyMock, stringBuilder, networkMock, ScriptType.P2PKH, "builderItem1");
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
            verify(target).toAddress(ScriptType.P2PKH, networkMock);
            verify(target).getPubKeyHash();
            verify(target).getPathAsString();
            verify(target).toStringWithPrivate(aesKeyMock, networkMock);
        }
    }

    //Sapient generated method id: ${259a939d-4f14-3519-95b7-a716f1a53ce8}
    @Ignore()
    @Test()
    public void formatKeyWithAddress1Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock = mock(NetworkParameters.class);
        Network networkMock = mock(Network.class);
        ECPoint eCPointMock = mock(ECPoint.class);
        AesKey aesKeyMock = mock(AesKey.class);
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            doReturn(networkMock).when(paramsMock).network();
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            StringBuilder stringBuilder = new StringBuilder();
            doNothing().when(target).formatKeyWithAddress(false, aesKeyMock, stringBuilder, networkMock, ScriptType.P2PKH, "comment1");
            //Act Statement(s)
            target.formatKeyWithAddress(false, aesKeyMock, stringBuilder, paramsMock, ScriptType.P2PKH, "comment1");
            //Assert statement(s)
            verify(paramsMock).network();
            hDPath.verify(() -> HDPath.M(anyList()));
            verify(target).formatKeyWithAddress(false, aesKeyMock, stringBuilder, networkMock, ScriptType.P2PKH, "comment1");
        }
    }
}
