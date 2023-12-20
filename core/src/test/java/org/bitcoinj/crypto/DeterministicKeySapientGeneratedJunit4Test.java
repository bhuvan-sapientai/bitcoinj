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

    private final LazyECPoint lazyECPointMock = mock(LazyECPoint.class);

    private final Network networkMock = mock(Network.class);

    private final NetworkParameters networkParametersMock = mock(NetworkParameters.class);

    private final DeterministicKey newParentMock = mock(DeterministicKey.class);

    private final NetworkParameters paramsMock = mock(NetworkParameters.class);

    private final LazyECPoint publicAsPointMock = mock(LazyECPoint.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${bf9d95c1-b4c4-3f7d-9e18-c185484c5efc}
    @Ignore()
    @Test()
    public void getPathAsStringTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HDPath hDPathMock = mock(HDPath.class, "getPathAsString_hDPath1");
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            List list = new ArrayList<>();
            HDPath hDPath2 = new HDPath(false, list);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(hDPath2);
            ChildNumber childNumber = new ChildNumber(0);
            ChildNumber childNumber2 = new ChildNumber(1);
            ChildNumber childNumber3 = new ChildNumber(2);
            List<ChildNumber> childNumberList = new ArrayList<>();
            childNumberList.add(childNumber);
            childNumberList.add(childNumber2);
            childNumberList.add(childNumber3);
            byte[] byteArray = new byte[]{(byte) 0};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, true, new BigInteger("123456789"), (DeterministicKey) null));
            doReturn(hDPathMock).when(target).getPath();
            //Act Statement(s)
            String result = target.getPathAsString();
            //Assert statement(s)
            assertThat(result, equalTo("getPathAsString_hDPath1"));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(2));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()));
            verify(target).getPath();
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
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, true, new BigInteger("123456789"), (DeterministicKey) null);
            doReturn(0).when(childNumberPathMock).size();
            //Act Statement(s)
            ChildNumber result = target.getChildNumber();
            ChildNumber childNumber = ChildNumber.ZERO;
            //Assert statement(s)
            assertThat(result, equalTo(childNumber));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(2));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
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
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("-1"), (DeterministicKey) null);
            doReturn(1, -1).when(childNumberPathMock).size();
            doReturn(childNumberMock).when(childNumberPathMock).get(-2);
            //Act Statement(s)
            ChildNumber result = target.getChildNumber();
            //Assert statement(s)
            assertThat(result, equalTo(childNumberMock));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
            verify(childNumberPathMock, times(2)).size();
            verify(childNumberPathMock, atLeast(1)).get(-2);
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
        try (MockedStatic<CryptoUtils> cryptoUtils = mockStatic(CryptoUtils.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            List list = new ArrayList<>();
            HDPath hDPath2 = new HDPath(false, list);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(hDPath2);
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{};
            cryptoUtils.when(() -> CryptoUtils.sha256hash160(byteArray2)).thenReturn(byteArray);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray3 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray3, eCPointMock, false, new BigInteger("1"), (DeterministicKey) null);
            //Act Statement(s)
            byte[] result = target.getIdentifier();
            //Assert statement(s)
            assertThat(result, equalTo(byteArray));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
            cryptoUtils.verify(() -> CryptoUtils.sha256hash160(byteArray2), atLeast(1));
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
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            List list = new ArrayList<>();
            HDPath hDPath2 = new HDPath(false, list);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(hDPath2);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("1"), (DeterministicKey) null));
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(target).getIdentifier();
            //Act Statement(s)
            int result = target.getFingerprint();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(2));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
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
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            ChildNumber childNumber = new ChildNumber(0);
            ChildNumber childNumber2 = new ChildNumber(1);
            List<ChildNumber> childNumberList = new ArrayList<>();
            childNumberList.add(childNumber);
            childNumberList.add(childNumber2);
            byte[] byteArray = new byte[]{(byte) 0};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, true, new BigInteger("10"), (DeterministicKey) null));
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(target).getPrivKeyBytes();
            //Act Statement(s)
            byte[] result = target.getPrivKeyBytes33();
            byte[] byteResultArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            //Assert statement(s)
            assertThat(result, equalTo(byteResultArray));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(2));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
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
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            List list = new ArrayList<>();
            HDPath hDPath2 = new HDPath(false, list);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(hDPath2);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, true, new BigInteger("1"), (DeterministicKey) null));
            doReturn(true).when(target).isPubKeyOnly();
            //Act Statement(s)
            DeterministicKey result = target.dropPrivateBytes();
            //Assert statement(s)
            assertThat(result, equalTo(target));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(2));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()));
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
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            hDPath.when(() -> HDPath.M(childNumberPathMock)).thenReturn(hDPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("0"), (DeterministicKey) null));
            doReturn(false).when(target).isPubKeyOnly();
            //Act Statement(s)
            DeterministicKey result = target.dropPrivateBytes();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            LazyECPoint lazyECPoint = new LazyECPoint(eCPointMock, false);
            LazyECPoint lazyECPoint2 = lazyECPoint.compress();
            DeterministicKey deterministicKey = new DeterministicKey(childNumberPathMock, byteArray2, lazyECPoint2, (BigInteger) null, (DeterministicKey) null);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKey));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
            hDPath.verify(() -> HDPath.M(childNumberPathMock), atLeast(1));
            verify(target, atLeast(1)).isPubKeyOnly();
        }
    }

    //Sapient generated method id: ${63aad837-05dc-309c-a943-fe5787260515}
    @Ignore()
    @Test()
    public void dropPrivateBytesWhenDefaultBranchAndDefaultBranch() {
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
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List list = new ArrayList<>();
            HDPath hDPath2 = new HDPath(false, list);
            hDPath.when(() -> HDPath.M(childNumberPathMock)).thenReturn(hDPath2);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("1"), (DeterministicKey) null));
            doReturn(false).when(target).isPubKeyOnly();
            //Act Statement(s)
            DeterministicKey result = target.dropPrivateBytes();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            LazyECPoint lazyECPoint = new LazyECPoint(eCPointMock, false);
            LazyECPoint lazyECPoint2 = lazyECPoint.compress();
            DeterministicKey deterministicKey = new DeterministicKey(childNumberPathMock, byteArray2, lazyECPoint2, (BigInteger) null, (DeterministicKey) null);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKey));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
            hDPath.verify(() -> HDPath.M(childNumberPathMock), atLeast(1));
            verify(target, atLeast(1)).isPubKeyOnly();
        }
    }

    //Sapient generated method id: ${db9db4d9-218d-3082-b66f-3566cd2df495}
    @Ignore()
    @Test()
    public void dropParentWhenDefaultBranchAndDefaultBranch() {
        /* Branches:
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : true  #  inside <init> method
         * (branch expression (line 197)) : true  #  inside <init> method
         * (branch expression (line 73)) : false  #  inside <init> method
         * (branch expression (line 77)) : false  #  inside <init> method
         * (branch expression (line 78)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class, CALLS_REAL_METHODS);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(hDPathMock2)).thenReturn(hDPathMock);
            ChildNumber childNumber = new ChildNumber(1);
            ChildNumber childNumber2 = new ChildNumber(2);
            List<ChildNumber> childNumberList = new ArrayList<>();
            childNumberList.add(childNumber);
            childNumberList.add(childNumber2);
            byte[] byteArray = new byte[]{(byte) 0};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, true, new BigInteger("10"), (DeterministicKey) null));
            doReturn(hDPathMock2).when(target).getPath();
            //Act Statement(s)
            DeterministicKey result = target.dropParent();
            byte[] byteArray2 = new byte[]{};
            LazyECPoint lazyECPoint = new LazyECPoint(eCPointMock, true);
            LazyECPoint lazyECPoint2 = lazyECPoint.compress();
            DeterministicKey deterministicKey = new DeterministicKey(hDPathMock2, byteArray2, lazyECPoint2, new BigInteger("10"), (DeterministicKey) null);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKey));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(2));
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(4));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(2));
            hDPath.verify(() -> HDPath.M(hDPathMock2), atLeast(1));
            verify(target, atLeast(1)).getPath();
        }
    }

    //Sapient generated method id: ${a9246468-a01e-3194-86d3-40efefc0b34e}
    @Ignore()
    @Test()
    public void dropParentWhenDefaultBranchAndDefaultBranchAndDefaultBranchAndDefaultBranchAndDefaultBranch() {
        /* Branches:
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : false  #  inside <init> method
         * (branch expression (line 197)) : false  #  inside <init> method
         * (branch expression (line 73)) : false  #  inside <init> method
         * (branch expression (line 77)) : false  #  inside <init> method
         * (branch expression (line 78)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class, CALLS_REAL_METHODS);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            List list = new ArrayList<>();
            HDPath hDPath2 = new HDPath(false, list);
            hDPath.when(() -> HDPath.M(hDPathMock)).thenReturn(hDPath2);
            ChildNumber childNumber = new ChildNumber(1);
            List<ChildNumber> childNumberList = new ArrayList<>();
            childNumberList.add(childNumber);
            byte[] byteArray = new byte[]{(byte) 0};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, true, new BigInteger("1"), (DeterministicKey) null));
            doReturn(hDPathMock).when(target).getPath();
            //Act Statement(s)
            DeterministicKey result = target.dropParent();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            LazyECPoint lazyECPoint = new LazyECPoint(eCPointMock, true);
            LazyECPoint lazyECPoint2 = lazyECPoint.compress();
            DeterministicKey deterministicKey = new DeterministicKey(hDPathMock, byteArray2, lazyECPoint2, new BigInteger("1"), (DeterministicKey) null);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKey));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(2));
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(3));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(3));
            hDPath.verify(() -> HDPath.M(hDPathMock), atLeast(1));
            verify(target, atLeast(1)).getPath();
        }
    }

    //Sapient generated method id: ${0ebb4dc2-13c5-3bff-8619-c21a8ced46f8}
    @Ignore()
    @Test()
    public void addChecksumTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class)) {
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.hashTwice(byteArray2)).thenReturn(byteArray);
            //Act Statement(s)
            byte[] result = DeterministicKey.addChecksum(byteArray2);
            byte[] byteResultArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0};
            //Assert statement(s)
            assertThat(result, equalTo(byteResultArray));
            sha256Hash.verify(() -> Sha256Hash.hashTwice(byteArray2), atLeast(1));
        }
    }

    //Sapient generated method id: ${cd80e3c4-54b9-3a04-b5c0-6816aafaf96d}
    @Test()
    public void encrypt1ThrowsUnsupportedOperationException() throws KeyCrypterException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            ChildNumber childNumber = new ChildNumber(1);
            ChildNumber childNumber2 = new ChildNumber(2);
            ChildNumber childNumber3 = new ChildNumber(3);
            List<ChildNumber> childNumberList = new ArrayList<>();
            childNumberList.add(childNumber);
            childNumberList.add(childNumber2);
            childNumberList.add(childNumber3);
            byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, true, new BigInteger("123456789"), (DeterministicKey) null);
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Must supply a new parent for encryption");
            thrown.expect(UnsupportedOperationException.class);
            thrown.expectMessage(unsupportedOperationException.getMessage());
            //Act Statement(s)
            target.encrypt(keyCrypterMock, aesKeyMock);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(2));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
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
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            doReturn(false).when(newParentMock).isEncrypted();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenThrow(illegalStateException);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("0"), (DeterministicKey) null));
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(target).getPrivKeyBytes();
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.encrypt(keyCrypterMock, aesKeyMock, newParentMock);
            //Assert statement(s)
            verify(newParentMock).isEncrypted();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(3));
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
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            doReturn(false).when(newParentMock).isEncrypted();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenThrow(illegalStateException);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("0"), (DeterministicKey) null));
            doReturn(null).when(target).getPrivKeyBytes();
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.encrypt(keyCrypterMock, aesKeyMock, newParentMock);
            //Assert statement(s)
            verify(newParentMock).isEncrypted();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(3));
            hDPath.verify(() -> HDPath.M(anyList()));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
            verify(target).getPrivKeyBytes();
        }
    }

    //Sapient generated method id: ${689fe557-e38c-3ee6-8fdf-c2e6b3d8791d}
    @Ignore()
    @Test()
    public void isPubKeyOnlyWhenSuperNotIsPubKeyOnly() {
        /* Branches:
         * (priv == null) : false  #  inside isPubKeyOnly method
         * (super.isPubKeyOnly()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            List list = new ArrayList<>();
            HDPath hDPath2 = new HDPath(false, list);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(hDPath2);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, true, new BigInteger("123456789"), (DeterministicKey) null);
            //Act Statement(s)
            boolean result = target.isPubKeyOnly();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(2));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()));
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
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            List list = new ArrayList<>();
            HDPath hDPath2 = new HDPath(false, list);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(hDPath2);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null);
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
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("0"), (DeterministicKey) null);
            //Act Statement(s)
            boolean result = target.hasPrivKey();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
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
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("0"), (DeterministicKey) null);
            //Act Statement(s)
            boolean result = target.hasPrivKey();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
        }
    }

    //Sapient generated method id: ${df6fb236-86d5-3773-85e6-2ce514bee5e1}
    @Ignore()
    @Test()
    public void getSecretBytesWhenPrivIsNotNull() {
        /* Branches:
         * (priv != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("0"), (DeterministicKey) null));
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(target).getPrivKeyBytes();
            //Act Statement(s)
            byte[] result = target.getSecretBytes();
            //Assert statement(s)
            assertThat(result, equalTo(byteArray2));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
            verify(target, atLeast(1)).getPrivKeyBytes();
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
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null);
            //Act Statement(s)
            byte[] result = target.getSecretBytes();
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
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
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null);
            //Act Statement(s)
            boolean result = target.isEncrypted();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
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
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("0"), (DeterministicKey) null);
            //Act Statement(s)
            KeyCrypter result = target.getKeyCrypter();
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
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
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            ChildNumber childNumber = new ChildNumber(1);
            List<ChildNumber> childNumberList = new ArrayList<>();
            childNumberList.add(childNumber);
            byte[] byteArray = new byte[]{};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, true, (BigInteger) null, (DeterministicKey) null));
            doReturn(true).when(target).isEncrypted();
            thrown.expect(ECKey.MissingPrivateKeyException.class);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            //Act Statement(s)
            target.sign(sha256Hash, aesKeyMock);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            verify(target).isEncrypted();
        }
    }

    //Sapient generated method id: ${778deaba-2af1-3e72-9c9b-5a043bff9924}
    @Ignore()
    @Test()
    public void sign1WhenPrivIsNotNull() throws KeyCrypterException {
        /* Branches:
         * (isEncrypted()) : true
         * (crypter != null) : false  #  inside sign method
         * (priv == null) : false  #  inside sign method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            List list = new ArrayList<>();
            HDPath hDPath2 = new HDPath(false, list);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(hDPath2);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("1"), (DeterministicKey) null));
            doReturn(true).when(target).isEncrypted();
            doReturn(eCKeyECDSASignatureMock).when(target).doSign(sha256HashMock, new BigInteger("1"));
            //Act Statement(s)
            ECKey.ECDSASignature result = target.sign(sha256HashMock, aesKeyMock);
            //Assert statement(s)
            assertThat(result, equalTo(eCKeyECDSASignatureMock));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
            verify(target, atLeast(1)).isEncrypted();
            verify(target, atLeast(1)).doSign(sha256HashMock, new BigInteger("1"));
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
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            List list = new ArrayList<>();
            HDPath hDPath2 = new HDPath(false, list);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(hDPath2);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("1"), (DeterministicKey) null));
            doReturn(false).when(target).isEncrypted();
            thrown.expect(ECKey.MissingPrivateKeyException.class);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            //Act Statement(s)
            target.sign(sha256Hash, aesKeyMock);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
            verify(target, atLeast(1)).isEncrypted();
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
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : false  #  inside <init> method
         * (branch expression (line 197)) : false  #  inside <init> method
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
        try (MockedStatic<HDKeyDerivation> hDKeyDerivation = mockStatic(HDKeyDerivation.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class, CALLS_REAL_METHODS);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(hDPathMock2)).thenReturn(hDPathMock);
            ChildNumber childNumber = new ChildNumber(0, false);
            hDKeyDerivation.when(() -> HDKeyDerivation.deriveChildKey((DeterministicKey) any(), eq(childNumber))).thenReturn(deterministicKeyMock);
            LazyECPoint lazyECPoint = new LazyECPoint(eCPointMock, false);
            doReturn(lazyECPoint).when(publicAsPointMock).compress();
            ChildNumber childNumber2 = new ChildNumber(0, false);
            hDKeyDerivation.when(() -> HDKeyDerivation.deriveChildKey(deterministicKeyMock, childNumber2)).thenReturn(deterministicKeyMock2);
            ChildNumber childNumber3 = new ChildNumber(1);
            ChildNumber childNumber4 = new ChildNumber(2);
            ChildNumber childNumber5 = new ChildNumber(3);
            List<ChildNumber> childNumberList = new ArrayList<>();
            childNumberList.add(childNumber3);
            childNumberList.add(childNumber4);
            childNumberList.add(childNumber5);
            byte[] byteArray = new byte[]{(byte) 0};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock2, true, new BigInteger("123456789"), (DeterministicKey) null));
            doReturn(false).when(target).isEncrypted();
            doReturn(3).when(hDPathMock).size();
            List<ChildNumber> childNumberList2 = new ArrayList<>();
            childNumberList2.add(childNumber);
            childNumberList2.add(childNumber2);
            doReturn(childNumberList2).when(hDPathMock).subList(0, 3);
            KeyCrypterException.PublicPrivateMismatch keyCrypterExceptionPublicPrivateMismatch = new KeyCrypterException.PublicPrivateMismatch("Could not decrypt bytes");
            thrown.expect(KeyCrypterException.PublicPrivateMismatch.class);
            thrown.expectMessage(keyCrypterExceptionPublicPrivateMismatch.getMessage());
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            //Act Statement(s)
            target.sign(sha256Hash, aesKeyMock);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(2));
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(5));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            hDPath.verify(() -> HDPath.M(hDPathMock2), atLeast(1));
            hDKeyDerivation.verify(() -> HDKeyDerivation.deriveChildKey((DeterministicKey) any(), eq(childNumber)), atLeast(1));
            verify(publicAsPointMock, atLeast(1)).compress();
            hDKeyDerivation.verify(() -> HDKeyDerivation.deriveChildKey(deterministicKeyMock, childNumber2), atLeast(1));
            verify(target, atLeast(1)).isEncrypted();
            verify(hDPathMock, atLeast(1)).size();
            verify(hDPathMock, atLeast(1)).subList(0, 3);
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
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : true  #  inside <init> method
         * (branch expression (line 197)) : true  #  inside <init> method
         * (branch expression (line 73)) : false  #  inside <init> method
         * (branch expression (line 77)) : false  #  inside <init> method
         * (branch expression (line 78)) : false  #  inside <init> method
         * (for-each(path)) : false  #  inside derivePrivateKeyDownwards method
         * (!downCursor.pub.equals(pub)) : false  #  inside derivePrivateKeyDownwards method
         * (privateKey == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class, CALLS_REAL_METHODS);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            byteUtils.when(() -> ByteUtils.bytesToBigInteger(byteArray)).thenReturn(new BigInteger("1"));
            List list = new ArrayList<>();
            HDPath hDPath2 = new HDPath(false, list);
            hDPath.when(() -> HDPath.M(hDPathMock)).thenReturn(hDPath2);
            ChildNumber childNumber = new ChildNumber(0, false);
            List<ChildNumber> childNumberList = new ArrayList<>();
            childNumberList.add(childNumber);
            byte[] byteArray2 = new byte[]{(byte) 0};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray2, eCPointMock, true, new BigInteger("789"), (DeterministicKey) null));
            doReturn(false).when(target).isEncrypted();
            doReturn(eCKeyECDSASignatureMock).when(target).doSign((Sha256Hash) any(), eq(new BigInteger("1")));
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            //Act Statement(s)
            ECKey.ECDSASignature result = target.sign(sha256Hash, aesKeyMock);
            //Assert statement(s)
            assertThat(result, equalTo(eCKeyECDSASignatureMock));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(2));
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(3));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(3));
            byteUtils.verify(() -> ByteUtils.bytesToBigInteger(byteArray), atLeast(1));
            hDPath.verify(() -> HDPath.M(hDPathMock), atLeast(1));
            verify(target, atLeast(1)).isEncrypted();
            verify(target, atLeast(1)).doSign((Sha256Hash) any(), eq(new BigInteger("1")));
        }
    }

    //Sapient generated method id: ${20530f72-515c-38cf-b364-844e8ce04325}
    @Ignore()
    @Test()
    public void sign1WhenPathIsNotEmptyAndDownCursorPubEqualsPubAndPrivateKeyIsNotNull() throws KeyCrypterException {
        /* Branches:
         * (isEncrypted()) : false
         * (cursor != null) : true  #  inside findParentWithPrivKey method
         * (cursor.priv != null) : true  #  inside findParentWithPrivKey method
         * (cursor == null) : false  #  inside findOrDerivePrivateKey method
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : false  #  inside <init> method
         * (branch expression (line 197)) : false  #  inside <init> method
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
        try (MockedStatic<HDKeyDerivation> hDKeyDerivation = mockStatic(HDKeyDerivation.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class, CALLS_REAL_METHODS);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            byteUtils.when(() -> ByteUtils.bytesToBigInteger(byteArray)).thenReturn(new BigInteger("0"));
            hDPath.when(() -> HDPath.M(hDPathMock2)).thenReturn(hDPathMock);
            ChildNumber childNumber = new ChildNumber(0, false);
            hDKeyDerivation.when(() -> HDKeyDerivation.deriveChildKey((DeterministicKey) any(), eq(childNumber))).thenReturn(deterministicKeyMock);
            LazyECPoint lazyECPoint = new LazyECPoint(eCPointMock, false);
            doReturn(lazyECPoint).when(publicAsPointMock).compress();
            ChildNumber childNumber2 = new ChildNumber(0, false);
            hDKeyDerivation.when(() -> HDKeyDerivation.deriveChildKey(deterministicKeyMock, childNumber2)).thenReturn(deterministicKeyMock2);
            ChildNumber childNumber3 = new ChildNumber(1);
            ChildNumber childNumber4 = new ChildNumber(2);
            List<ChildNumber> childNumberList = new ArrayList<>();
            childNumberList.add(childNumber3);
            childNumberList.add(childNumber4);
            byte[] byteArray2 = new byte[]{(byte) 1, (byte) 2, (byte) 3};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray2, eCPointMock2, true, new BigInteger("789"), (DeterministicKey) null));
            doReturn(false).when(target).isEncrypted();
            doReturn(0).when(hDPathMock).size();
            List<ChildNumber> childNumberList2 = new ArrayList<>();
            childNumberList2.add(childNumber);
            childNumberList2.add(childNumber2);
            doReturn(childNumberList2).when(hDPathMock).subList(0, 0);
            KeyCrypterException.PublicPrivateMismatch keyCrypterExceptionPublicPrivateMismatch = new KeyCrypterException.PublicPrivateMismatch("Could not decrypt bytes");
            thrown.expect(KeyCrypterException.PublicPrivateMismatch.class);
            thrown.expectMessage(keyCrypterExceptionPublicPrivateMismatch.getMessage());
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            //Act Statement(s)
            target.sign(sha256Hash, aesKeyMock);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(2));
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(4));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(2));
            byteUtils.verify(() -> ByteUtils.bytesToBigInteger(byteArray), atLeast(1));
            hDPath.verify(() -> HDPath.M(hDPathMock2), atLeast(1));
            hDKeyDerivation.verify(() -> HDKeyDerivation.deriveChildKey((DeterministicKey) any(), eq(childNumber)), atLeast(1));
            verify(publicAsPointMock, atLeast(1)).compress();
            hDKeyDerivation.verify(() -> HDKeyDerivation.deriveChildKey(deterministicKeyMock, childNumber2), atLeast(1));
            verify(target, atLeast(1)).isEncrypted();
            verify(hDPathMock, atLeast(1)).size();
            verify(hDPathMock, atLeast(1)).subList(0, 0);
        }
    }

    //Sapient generated method id: ${9e24fd7e-3066-3620-b7ab-bf73eac2309e}
    @Ignore()
    @Test()
    public void sign1WhenDefaultBranchAndDefaultBranchAndDefaultBranchAndPathIsEmptyAndDownCursorPubEqualsPubAndPrivateKeyIsNotNull2() throws KeyCrypterException {
        /* Branches:
         * (isEncrypted()) : false
         * (cursor != null) : true  #  inside findParentWithPrivKey method
         * (cursor.priv != null) : true  #  inside findParentWithPrivKey method
         * (cursor == null) : false  #  inside findOrDerivePrivateKey method
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : false  #  inside <init> method
         * (branch expression (line 197)) : false  #  inside <init> method
         * (branch expression (line 73)) : false  #  inside <init> method
         * (branch expression (line 77)) : false  #  inside <init> method
         * (branch expression (line 78)) : false  #  inside <init> method
         * (for-each(path)) : false  #  inside derivePrivateKeyDownwards method
         * (!downCursor.pub.equals(pub)) : false  #  inside derivePrivateKeyDownwards method
         * (privateKey == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class, CALLS_REAL_METHODS);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(hDPathMock2)).thenReturn(hDPathMock);
            ChildNumber childNumber = new ChildNumber(1);
            ChildNumber childNumber2 = new ChildNumber(2);
            ChildNumber childNumber3 = new ChildNumber(3);
            List<ChildNumber> childNumberList = new ArrayList<>();
            childNumberList.add(childNumber);
            childNumberList.add(childNumber2);
            childNumberList.add(childNumber3);
            byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, true, new BigInteger("789"), (DeterministicKey) null));
            doReturn(false).when(target).isEncrypted();
            doReturn(3).when(hDPathMock).size();
            List<ChildNumber> childNumberList2 = new ArrayList<>();
            doReturn(childNumberList2).when(hDPathMock).subList(0, 3);
            doReturn(eCKeyECDSASignatureMock).when(target).doSign((Sha256Hash) any(), eq(new BigInteger("0")));
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            //Act Statement(s)
            ECKey.ECDSASignature result = target.sign(sha256Hash, aesKeyMock);
            //Assert statement(s)
            assertThat(result, equalTo(eCKeyECDSASignatureMock));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(2));
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(4));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(2));
            hDPath.verify(() -> HDPath.M(hDPathMock2), atLeast(1));
            verify(target, atLeast(1)).isEncrypted();
            verify(hDPathMock, atLeast(1)).size();
            verify(hDPathMock, atLeast(1)).subList(0, 3);
            verify(target, atLeast(1)).doSign((Sha256Hash) any(), eq(new BigInteger("0")));
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
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(keyCrypterMock).decrypt(encryptedDataMock, aesKeyMock);
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray2, eCPointMock, false, new BigInteger("0"), (DeterministicKey) null);
            KeyCrypterException.InvalidCipherText keyCrypterExceptionInvalidCipherText = new KeyCrypterException.InvalidCipherText("Decrypted key must be 32 bytes long, but is 0");
            thrown.expect(KeyCrypterException.InvalidCipherText.class);
            thrown.expectMessage(keyCrypterExceptionInvalidCipherText.getMessage());
            //Act Statement(s)
            target.decrypt(keyCrypterMock, aesKeyMock);
            //Assert statement(s)
            verify(keyCrypterMock, atLeast(1)).decrypt(encryptedDataMock, aesKeyMock);
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
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
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("0"), (DeterministicKey) null);
            KeyCrypterException keyCrypterException = new KeyCrypterException("Neither this key nor its parents have an encrypted private key");
            thrown.expect(KeyCrypterException.class);
            thrown.expectMessage(keyCrypterException.getMessage());
            //Act Statement(s)
            target.decrypt(keyCrypterMock, aesKeyMock);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
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
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : false  #  inside <init> method
         * (branch expression (line 197)) : false  #  inside <init> method
         * (branch expression (line 96)) : false  #  inside <init> method
         * (branch expression (line 100)) : false  #  inside <init> method
         * (branch expression (line 101)) : false  #  inside <init> method
         * (!Arrays.equals(key.getPubKey(), getPubKey())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(keyCrypterMock).decrypt(encryptedDataMock, aesKeyMock);
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            List list = new ArrayList<>();
            HDPath hDPath2 = new HDPath(false, list);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(hDPath2);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray2 = new byte[]{};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray2, eCPointMock, true, new BigInteger("1"), (DeterministicKey) null);
            KeyCrypterException.InvalidCipherText keyCrypterExceptionInvalidCipherText = new KeyCrypterException.InvalidCipherText("Decrypted key must be 32 bytes long, but is 0");
            thrown.expect(KeyCrypterException.InvalidCipherText.class);
            thrown.expectMessage(keyCrypterExceptionInvalidCipherText.getMessage());
            //Act Statement(s)
            target.decrypt(keyCrypterMock, aesKeyMock);
            //Assert statement(s)
            verify(keyCrypterMock).decrypt(encryptedDataMock, aesKeyMock);
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(2));
            hDPath.verify(() -> HDPath.M(anyList()));
        }
    }

    //Sapient generated method id: ${8b7ad9c7-3ed5-3bab-ba1c-64530a6be44e}
    @Ignore()
    @Test()
    public void decrypt2WhenParentIsNullAndCreationTimeNotIsPresent() throws KeyCrypterException {
        /* Branches:
         * (this.keyCrypter != null) : false
         * (encryptedPrivateKey != null) : true  #  inside findOrDeriveEncryptedPrivateKey method
         * (decryptedKey.length != 32) : false  #  inside findOrDeriveEncryptedPrivateKey method
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : true  #  inside <init> method
         * (branch expression (line 197)) : true  #  inside <init> method
         * (branch expression (line 96)) : false  #  inside <init> method
         * (branch expression (line 100)) : false  #  inside <init> method
         * (branch expression (line 101)) : false  #  inside <init> method
         * (!Arrays.equals(key.getPubKey(), getPubKey())) : false
         * (parent == null) : true
         * (creationTime.isPresent()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(keyCrypterMock).decrypt(encryptedDataMock, aesKeyMock);
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray2 = new byte[]{};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray2, eCPointMock, true, new BigInteger("1234567890"), (DeterministicKey) null);
            KeyCrypterException.InvalidCipherText keyCrypterExceptionInvalidCipherText = new KeyCrypterException.InvalidCipherText("Decrypted key must be 32 bytes long, but is 0");
            thrown.expect(KeyCrypterException.InvalidCipherText.class);
            thrown.expectMessage(keyCrypterExceptionInvalidCipherText.getMessage());
            //Act Statement(s)
            target.decrypt(keyCrypterMock, aesKeyMock);
            //Assert statement(s)
            verify(keyCrypterMock).decrypt(encryptedDataMock, aesKeyMock);
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(2));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
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
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : false  #  inside <init> method
         * (branch expression (line 197)) : false  #  inside <init> method
         * (branch expression (line 96)) : false  #  inside <init> method
         * (branch expression (line 100)) : false  #  inside <init> method
         * (branch expression (line 101)) : false  #  inside <init> method
         * (!Arrays.equals(key.getPubKey(), getPubKey())) : false
         * (parent == null) : true
         * (creationTime.isPresent()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(keyCrypterMock).decrypt(encryptedDataMock, aesKeyMock);
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            List list = new ArrayList<>();
            HDPath hDPath2 = new HDPath(false, list);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(hDPath2);
            ChildNumber childNumber = new ChildNumber(0, false);
            List<ChildNumber> childNumberList = new ArrayList<>();
            childNumberList.add(childNumber);
            byte[] byteArray2 = new byte[]{(byte) 0};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray2, eCPointMock, true, new BigInteger("-1"), (DeterministicKey) null);
            KeyCrypterException.InvalidCipherText keyCrypterExceptionInvalidCipherText = new KeyCrypterException.InvalidCipherText("Decrypted key must be 32 bytes long, but is 0");
            thrown.expect(KeyCrypterException.InvalidCipherText.class);
            thrown.expectMessage(keyCrypterExceptionInvalidCipherText.getMessage());
            //Act Statement(s)
            target.decrypt(keyCrypterMock, aesKeyMock);
            //Assert statement(s)
            verify(keyCrypterMock).decrypt(encryptedDataMock, aesKeyMock);
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(2));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()));
        }
    }

    //Sapient generated method id: ${fbfe1094-0194-34e7-9c58-34466ad76411}
    @Test()
    public void decrypt3WhenCrypterIsNullThrowsKeyCrypterException() throws KeyCrypterException {
        /* Branches:
         * (crypter == null) : true  #  inside decrypt method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            ChildNumber childNumber = new ChildNumber(0);
            List<ChildNumber> childNumberList = new ArrayList<>();
            childNumberList.add(childNumber);
            byte[] byteArray = new byte[]{(byte) 0};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, true, new BigInteger("1"), (DeterministicKey) null);
            KeyCrypterException keyCrypterException = new KeyCrypterException("No key crypter available");
            thrown.expect(KeyCrypterException.class);
            thrown.expectMessage(keyCrypterException.getMessage());
            //Act Statement(s)
            target.decrypt(aesKeyMock);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(2));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
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
        try (MockedStatic<HDKeyDerivation> hDKeyDerivation = mockStatic(HDKeyDerivation.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            List list = new ArrayList<>();
            HDPath hDPath2 = new HDPath(false, list);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(hDPath2);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("-1"), (DeterministicKey) null);
            hDKeyDerivation.when(() -> HDKeyDerivation.deriveChildKey(eq(target), (ChildNumber) any())).thenReturn(deterministicKeyMock);
            //Act Statement(s)
            DeterministicKey result = target.derive(0);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyMock));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
            hDKeyDerivation.verify(() -> HDKeyDerivation.deriveChildKey(eq(target), (ChildNumber) any()), atLeast(1));
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
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenThrow(illegalStateException);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("0"), (DeterministicKey) null);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.getPrivKey();
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()), atLeast(1));
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
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : false  #  inside <init> method
         * (branch expression (line 197)) : false  #  inside <init> method
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
        try (MockedStatic<HDKeyDerivation> hDKeyDerivation = mockStatic(HDKeyDerivation.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            hDPath.when(() -> HDPath.M(hDPathMock2)).thenReturn(hDPathMock);
            hDKeyDerivation.when(() -> HDKeyDerivation.deriveChildKey((DeterministicKey) any(), eq(childNumberMock))).thenReturn(deterministicKeyMock);
            doReturn(lazyECPointMock).when(publicAsPointMock).compress();
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("0"), (DeterministicKey) null);
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
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(2));
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
            hDPath.verify(() -> HDPath.M(hDPathMock2), atLeast(1));
            hDKeyDerivation.verify(() -> HDKeyDerivation.deriveChildKey((DeterministicKey) any(), eq(childNumberMock)), atLeast(1));
            verify(publicAsPointMock, atLeast(1)).compress();
            verify(hDPathMock, atLeast(1)).size();
            verify(hDPathMock, atLeast(1)).subList(0, 0);
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
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : true  #  inside <init> method
         * (branch expression (line 197)) : true  #  inside <init> method
         * (branch expression (line 73)) : false  #  inside <init> method
         * (branch expression (line 77)) : false  #  inside <init> method
         * (branch expression (line 78)) : false  #  inside <init> method
         * (for-each(path)) : false  #  inside derivePrivateKeyDownwards method
         * (!downCursor.pub.equals(pub)) : false  #  inside derivePrivateKeyDownwards method
         * (key != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(hDPathMock2)).thenReturn(hDPathMock);
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenThrow(illegalStateException);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("0"), (DeterministicKey) null);
            doReturn(0).when(hDPathMock).size();
            List<ChildNumber> childNumberList2 = new ArrayList<>();
            doReturn(childNumberList2).when(hDPathMock).subList(0, 0);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.getPrivKey();
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(2));
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(3));
            hDPath.verify(() -> HDPath.M(anyList()));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(3));
            hDPath.verify(() -> HDPath.M(hDPathMock2), atLeast(1));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
            verify(hDPathMock).size();
            verify(hDPathMock).subList(0, 0);
        }
    }

    //Sapient generated method id: ${790d2de0-e820-355a-b088-feafc5208d83}
    @Ignore()
    @Test()
    public void getPrivKeyWhenPathIsNotEmptyAndDownCursorPubEqualsPubAndKeyIsNotNullThrowsIllegalStateException() {
        /* Branches:
         * (cursor != null) : true  #  inside findParentWithPrivKey method
         * (cursor.priv != null) : true  #  inside findParentWithPrivKey method
         * (cursor == null) : false  #  inside findOrDerivePrivateKey method
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : false  #  inside <init> method
         * (branch expression (line 197)) : false  #  inside <init> method
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
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS);
             MockedStatic<HDKeyDerivation> hDKeyDerivation = mockStatic(HDKeyDerivation.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            hDPath.when(() -> HDPath.M(hDPathMock2)).thenReturn(hDPathMock);
            hDKeyDerivation.when(() -> HDKeyDerivation.deriveChildKey((DeterministicKey) any(), eq(childNumberMock))).thenReturn(deterministicKeyMock);
            doReturn(lazyECPointMock).when(publicAsPointMock).compress();
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenThrow(illegalStateException);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("0"), (DeterministicKey) null);
            doReturn(0).when(hDPathMock).size();
            List<ChildNumber> childNumberList2 = new ArrayList<>();
            childNumberList2.add(childNumberMock);
            doReturn(childNumberList2).when(hDPathMock).subList(0, 0);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.getPrivKey();
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(2));
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
            hDPath.verify(() -> HDPath.M(hDPathMock2), atLeast(1));
            hDKeyDerivation.verify(() -> HDKeyDerivation.deriveChildKey((DeterministicKey) any(), eq(childNumberMock)), atLeast(1));
            verify(publicAsPointMock, atLeast(1)).compress();
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()), atLeast(1));
            verify(hDPathMock, atLeast(1)).size();
            verify(hDPathMock, atLeast(1)).subList(0, 0);
        }
    }

    //Sapient generated method id: ${d0c91230-56bd-3c54-9f7a-51b06c13b6b0}
    @Ignore()
    @Test()
    public void getPrivKeyWhenDefaultBranchAndPathIsEmptyAndDownCursorPubEqualsPubAndKeyIsNotNull4ThrowsIllegalStateException() {
        /* Branches:
         * (cursor != null) : true  #  inside findParentWithPrivKey method
         * (cursor.priv != null) : true  #  inside findParentWithPrivKey method
         * (cursor == null) : false  #  inside findOrDerivePrivateKey method
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : false  #  inside <init> method
         * (branch expression (line 197)) : false  #  inside <init> method
         * (branch expression (line 73)) : false  #  inside <init> method
         * (branch expression (line 77)) : false  #  inside <init> method
         * (branch expression (line 78)) : false  #  inside <init> method
         * (for-each(path)) : false  #  inside derivePrivateKeyDownwards method
         * (!downCursor.pub.equals(pub)) : false  #  inside derivePrivateKeyDownwards method
         * (key != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(hDPathMock2)).thenReturn(hDPathMock);
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenThrow(illegalStateException);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("1"), (DeterministicKey) null);
            doReturn(0).when(hDPathMock).size();
            List<ChildNumber> childNumberList2 = new ArrayList<>();
            doReturn(childNumberList2).when(hDPathMock).subList(0, 0);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.getPrivKey();
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(2));
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            hDPath.verify(() -> HDPath.M(hDPathMock2), atLeast(1));
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
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            doReturn(0).when(networkParametersMock).getBip32HeaderP2PKHpub();
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("0"), (DeterministicKey) null));
            doReturn(childNumberMock).when(target).getChildNumber();
            doReturn(0).when(childNumberMock).i();
            //Act Statement(s)
            byte[] result = target.serialize(networkMock, false);
            byte[] byteResultArray = new byte[]{};
            //Assert statement(s)
            assertThat(result, equalTo(byteResultArray));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2PKHpub();
            verify(target, atLeast(1)).getChildNumber();
            verify(childNumberMock, atLeast(1)).i();
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
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            doReturn(0).when(networkParametersMock).getBip32HeaderP2PKHpriv();
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(false)).thenThrow(illegalStateException);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("0"), (DeterministicKey) null));
            doReturn(childNumberMock).when(target).getChildNumber();
            doReturn(0).when(childNumberMock).i();
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(target).getPrivKeyBytes33();
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.serialize(networkMock, false);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
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
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock).when(paramsMock).network();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("0"), (DeterministicKey) null));
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(target).serialize(networkMock, false);
            //Act Statement(s)
            byte[] result = target.serialize(paramsMock, false);
            //Assert statement(s)
            assertThat(result, equalTo(byteArray2));
            verify(paramsMock, atLeast(1)).network();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
            verify(target, atLeast(1)).serialize(networkMock, false);
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
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("0"), (DeterministicKey) null);
            IllegalStateException illegalStateException = new IllegalStateException("P2SH");
            thrown.expect(IllegalStateException.class);
            thrown.expectMessage(illegalStateException.getMessage());
            //Act Statement(s)
            target.serializePubB58(networkMock, ScriptType.P2SH);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
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
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            doReturn(1).when(networkParametersMock).getBip32HeaderP2PKHpub();
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(false)).thenThrow(illegalStateException);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("1"), (DeterministicKey) null));
            doReturn(childNumberMock).when(target).getChildNumber();
            doReturn(1).when(childNumberMock).i();
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.serializePubB58(networkMock, ScriptType.P2PKH);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
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
        try (MockedStatic<DeterministicKey> deterministicKey = mockStatic(DeterministicKey.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            doReturn(0).when(networkParametersMock).getBip32HeaderP2WPKHpub();
            byte[] byteArray = new byte[]{};
            deterministicKey.when(() -> DeterministicKey.toBase58(byteArray)).thenReturn("return_of_toBase58");
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray2, eCPointMock, false, new BigInteger("0"), (DeterministicKey) null));
            doReturn(childNumberMock).when(target).getChildNumber();
            doReturn(0).when(childNumberMock).i();
            //Act Statement(s)
            String result = target.serializePubB58(networkMock, ScriptType.P2PKH);
            //Assert statement(s)
            assertThat(result, equalTo("return_of_toBase58"));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2WPKHpub();
            deterministicKey.verify(() -> DeterministicKey.toBase58(byteArray), atLeast(1));
            verify(target, atLeast(1)).getChildNumber();
            verify(childNumberMock, atLeast(1)).i();
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
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock).when(paramsMock).network();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("1"), (DeterministicKey) null));
            doReturn("return_of_serializePubB58").when(target).serializePubB58(networkMock, ScriptType.P2PKH);
            //Act Statement(s)
            String result = target.serializePubB58(paramsMock, ScriptType.P2PKH);
            //Assert statement(s)
            assertThat(result, equalTo("return_of_serializePubB58"));
            verify(paramsMock, atLeast(1)).network();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
            verify(target, atLeast(1)).serializePubB58(networkMock, ScriptType.P2PKH);
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
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("0"), (DeterministicKey) null);
            IllegalStateException illegalStateException = new IllegalStateException("P2SH");
            thrown.expect(IllegalStateException.class);
            thrown.expectMessage(illegalStateException.getMessage());
            //Act Statement(s)
            target.serializePrivB58(networkMock, ScriptType.P2SH);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
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
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            doReturn(1).when(networkParametersMock).getBip32HeaderP2PKHpriv();
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(false)).thenThrow(illegalStateException);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("1"), (DeterministicKey) null));
            doReturn(childNumberMock).when(target).getChildNumber();
            doReturn(1).when(childNumberMock).i();
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(target).getPrivKeyBytes33();
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.serializePrivB58(networkMock, ScriptType.P2PKH);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
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
        try (MockedStatic<DeterministicKey> deterministicKey = mockStatic(DeterministicKey.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            doReturn(0).when(networkParametersMock).getBip32HeaderP2WPKHpriv();
            byte[] byteArray = new byte[]{};
            deterministicKey.when(() -> DeterministicKey.toBase58(byteArray)).thenReturn("return_of_toBase58");
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray2, eCPointMock, false, new BigInteger("0"), (DeterministicKey) null));
            doReturn(childNumberMock).when(target).getChildNumber();
            doReturn(0).when(childNumberMock).i();
            byte[] byteArray3 = new byte[]{};
            doReturn(byteArray3).when(target).getPrivKeyBytes33();
            //Act Statement(s)
            String result = target.serializePrivB58(networkMock, ScriptType.P2PKH);
            //Assert statement(s)
            assertThat(result, equalTo("return_of_toBase58"));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2WPKHpriv();
            deterministicKey.verify(() -> DeterministicKey.toBase58(byteArray), atLeast(1));
            verify(target, atLeast(1)).getChildNumber();
            verify(childNumberMock, atLeast(1)).i();
            verify(target, atLeast(1)).getPrivKeyBytes33();
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
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock).when(paramsMock).network();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("0"), (DeterministicKey) null));
            doReturn("return_of_serializePrivB58").when(target).serializePrivB58(networkMock, ScriptType.P2PKH);
            //Act Statement(s)
            String result = target.serializePrivB58(paramsMock, ScriptType.P2PKH);
            //Assert statement(s)
            assertThat(result, equalTo("return_of_serializePrivB58"));
            verify(paramsMock, atLeast(1)).network();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
            verify(target, atLeast(1)).serializePrivB58(networkMock, ScriptType.P2PKH);
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
        try (MockedStatic<DeterministicKey> deterministicKey = mockStatic(DeterministicKey.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            byte[] byteArray = new byte[]{};
            deterministicKey.when(() -> DeterministicKey.toBase58(byteArray)).thenReturn("return_of_toBase58");
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray2, eCPointMock, false, new BigInteger("0"), (DeterministicKey) null));
            doReturn(byteArray).when(target).serialize(networkMock, true);
            //Act Statement(s)
            String result = target.serializePubB58(networkMock);
            //Assert statement(s)
            assertThat(result, equalTo("return_of_toBase58"));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
            deterministicKey.verify(() -> DeterministicKey.toBase58(byteArray), atLeast(1));
            verify(target, atLeast(1)).serialize(networkMock, true);
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
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, true, new BigInteger("123456789"), (DeterministicKey) null));
            doReturn("return_of_serializePubB58").when(target).serializePubB58(networkMock);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            //Act Statement(s)
            String result = target.serializePubB58(networkParameters);
            //Assert statement(s)
            assertThat(result, equalTo("return_of_serializePubB58"));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(2));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
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
        try (MockedStatic<DeterministicKey> deterministicKey = mockStatic(DeterministicKey.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            byte[] byteArray = new byte[]{};
            deterministicKey.when(() -> DeterministicKey.toBase58(byteArray)).thenReturn("return_of_toBase58");
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray2, eCPointMock, false, new BigInteger("0"), (DeterministicKey) null));
            doReturn(byteArray).when(target).serialize(networkMock, false);
            //Act Statement(s)
            String result = target.serializePrivB58(networkMock);
            //Assert statement(s)
            assertThat(result, equalTo("return_of_toBase58"));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
            deterministicKey.verify(() -> DeterministicKey.toBase58(byteArray), atLeast(1));
            verify(target, atLeast(1)).serialize(networkMock, false);
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
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, true, new BigInteger("1"), (DeterministicKey) null));
            doReturn("return_of_serializePrivB58").when(target).serializePrivB58(networkMock);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            //Act Statement(s)
            String result = target.serializePrivB58(networkParameters);
            //Assert statement(s)
            assertThat(result, equalTo("return_of_serializePrivB58"));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(2));
            verify(target).serializePrivB58(networkMock);
        }
    }

    //Sapient generated method id: ${46194f1b-99a4-3203-97b3-9dfd7f9bcf1d}
    @Ignore()
    @Test()
    public void toBase58Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class);
             MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            byte[] byteArray2 = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.hashTwice(byteArray2)).thenReturn(byteArray);
            byte[] byteArray3 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0};
            base58.when(() -> Base58.encode(byteArray3)).thenReturn("1111");
            //Act Statement(s)
            String result = DeterministicKey.toBase58(byteArray2);
            //Assert statement(s)
            assertThat(result, equalTo("1111"));
            sha256Hash.verify(() -> Sha256Hash.hashTwice(byteArray2), atLeast(1));
            base58.verify(() -> Base58.encode(byteArray3), atLeast(1));
        }
    }

    //Sapient generated method id: ${df176e4d-2ab9-335d-8be1-04640f184382}
    @Test()
    public void deserializeB58Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
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
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKey> deterministicKey = mockStatic(DeterministicKey.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock).when(paramsMock).network();
            deterministicKey.when(() -> DeterministicKey.deserializeB58("someBase58String", networkMock)).thenReturn(deterministicKeyMock);
            //Act Statement(s)
            DeterministicKey result = DeterministicKey.deserializeB58("someBase58String", paramsMock);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyMock));
            verify(paramsMock, atLeast(1)).network();
            deterministicKey.verify(() -> DeterministicKey.deserializeB58("someBase58String", networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${4d0cd708-afd2-30b1-8b99-c94751907f20}
    @Test()
    public void deserializeB582Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKey> deterministicKey = mockStatic(DeterministicKey.class, CALLS_REAL_METHODS);
             MockedStatic<Base58> base58 = mockStatic(Base58.class)) {
            byte[] byteArray = new byte[]{};
            base58.when(() -> Base58.decodeChecked("String")).thenReturn(byteArray);
            deterministicKey.when(() -> DeterministicKey.deserialize(networkMock, byteArray, deterministicKeyMock2)).thenReturn(deterministicKeyMock);
            //Act Statement(s)
            DeterministicKey result = DeterministicKey.deserializeB58(deterministicKeyMock2, "String", networkMock);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyMock));
            base58.verify(() -> Base58.decodeChecked("String"), atLeast(1));
            deterministicKey.verify(() -> DeterministicKey.deserialize(networkMock, byteArray, deterministicKeyMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${1f55c6b1-ea91-3812-8c46-dbf3f95f5141}
    @Test()
    public void deserializeB583Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKey> deterministicKey = mockStatic(DeterministicKey.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock).when(paramsMock).network();
            deterministicKey.when(() -> DeterministicKey.deserializeB58(deterministicKeyMock2, "abc123", networkMock)).thenReturn(deterministicKeyMock);
            //Act Statement(s)
            DeterministicKey result = DeterministicKey.deserializeB58(deterministicKeyMock2, "abc123", paramsMock);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyMock));
            verify(paramsMock, atLeast(1)).network();
            deterministicKey.verify(() -> DeterministicKey.deserializeB58(deterministicKeyMock2, "abc123", networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${9d317733-e6d7-3927-8baa-83a51bcd6892}
    @Test()
    public void deserializeTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKey> deterministicKey = mockStatic(DeterministicKey.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3, (byte) 4};
            deterministicKey.when(() -> DeterministicKey.deserialize(networkMock, byteArray, (DeterministicKey) null)).thenReturn(parentMock);
            //Act Statement(s)
            DeterministicKey result = DeterministicKey.deserialize(networkMock, byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(parentMock));
            deterministicKey.verify(() -> DeterministicKey.deserialize(networkMock, byteArray, (DeterministicKey) null), atLeast(1));
        }
    }

    //Sapient generated method id: ${48f153f8-9f5d-3f80-9a15-fb1715c8b9da}
    @Test()
    public void deserialize1Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKey> deterministicKey = mockStatic(DeterministicKey.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock).when(paramsMock).network();
            byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3};
            deterministicKey.when(() -> DeterministicKey.deserialize(networkMock, byteArray)).thenReturn(parentMock);
            //Act Statement(s)
            DeterministicKey result = DeterministicKey.deserialize(paramsMock, byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(parentMock));
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
        try (MockedStatic<DeterministicKey> deterministicKey = mockStatic(DeterministicKey.class, CALLS_REAL_METHODS);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            doReturn(2).when(networkParametersMock).getBip32HeaderP2PKHpub();
            doReturn(2).when(networkParametersMock).getBip32HeaderP2WPKHpub();
            doReturn(2).when(networkParametersMock).getBip32HeaderP2PKHpriv();
            doReturn(2).when(networkParametersMock).getBip32HeaderP2WPKHpriv();
            byte[] byteArray = new byte[]{};
            deterministicKey.when(() -> DeterministicKey.toBase58(byteArray)).thenReturn("ABCD");
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unknown header bytes: ABCD");
            thrown.expect(IllegalArgumentException.class);
            thrown.expectMessage(illegalArgumentException.getMessage());
            //Act Statement(s)
            DeterministicKey.deserialize(networkMock, byteArray, parentMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2PKHpub();
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2WPKHpub();
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2PKHpriv();
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2WPKHpriv();
            deterministicKey.verify(() -> DeterministicKey.toBase58(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${dd98236c-efbc-30d2-b1ff-a1bfab91fc19}
    @Ignore()
    @Test()
    public void deserialize2WhenParentIsNotNullAndParentFingerprintEquals0ThrowsIllegalArgumentException() {
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
            DeterministicKey.deserialize(networkMock, byteArray, parentMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(networkParametersMock).getBip32HeaderP2PKHpub();
            verify(networkParametersMock).getBip32HeaderP2WPKHpub();
            verify(networkParametersMock).getBip32HeaderP2PKHpriv();
            verify(networkParametersMock).getBip32HeaderP2WPKHpriv();
        }
    }

    //Sapient generated method id: ${7a5f1d1c-b6fc-3997-a6db-3a1276672ed2}
    @Ignore()
    @Test()
    public void deserialize2WhenParentFingerprintNotEquals0AndParentGetFingerprintNotEqualsParentFingerprThrowsIllegalArgumentException() {
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

    //Sapient generated method id: ${4dbfdd22-45b1-3573-bcc2-6633cf68a6d8}
    @Ignore()
    @Test()
    public void deserialize2WhenParentGetFingerprintEqualsParentFingerprintAndPathSizeNotEqualsDepthThrowsIllegalArgumentException() {
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

    //Sapient generated method id: ${fd59f74c-c42d-357f-81c4-84e110be7382}
    @Ignore()
    @Test()
    public void deserialize2WhenBufferHasRemainingAndPubAndDefaultBranchAndDefaultBranchAndParentFingerprintEquals0() {
        /* Branches:
         * (header == params.getBip32HeaderP2PKHpub()) : false
         * (header == params.getBip32HeaderP2WPKHpub()) : true
         * (header == params.getBip32HeaderP2PKHpriv()) : false
         * (header == params.getBip32HeaderP2WPKHpriv()) : true
         * (!(pub || priv)) : false
         * (parent != null) : false
         * (depth >= 1) : true
         * (!buffer.hasRemaining()) : false
         * (pub) : true
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 143)) : false  #  inside <init> method
         * (parentFingerprint != 0) : false  #  inside ascertainParentFingerprint method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            doReturn(0).when(networkParametersMock).getBip32HeaderP2PKHpub();
            doReturn(0).when(networkParametersMock).getBip32HeaderP2WPKHpub();
            doReturn(0).when(networkParametersMock).getBip32HeaderP2PKHpriv();
            doReturn(0).when(networkParametersMock).getBip32HeaderP2WPKHpriv();
            hDPath.when(() -> HDPath.M((ChildNumber) any())).thenReturn(hDPathMock);
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(hDPathMock)).thenReturn(childNumberPathMock);
            byte[] byteArray = new byte[]{};
            DeterministicKey deterministicKey = null;
            //Act Statement(s)
            DeterministicKey result = DeterministicKey.deserialize(networkMock, byteArray, deterministicKey);
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            X9ECParameters x9ECParameters = CustomNamedCurves.getByName("secp256k1");
            ECCurve eCCurve = x9ECParameters.getCurve();
            ECPoint eCPoint = x9ECParameters.getG();
            ECDomainParameters eCDomainParameters = new ECDomainParameters(eCCurve, eCPoint, new BigInteger("115792089237316195423570985008687907852837564279074904382605163141518161494337"), new BigInteger("1"));
            ECCurve eCCurve2 = eCDomainParameters.getCurve();
            byte[] byteArray3 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            LazyECPoint lazyECPoint = new LazyECPoint(eCCurve2, byteArray3);
            DeterministicKey deterministicKey2 = new DeterministicKey(hDPathMock, byteArray2, lazyECPoint, (DeterministicKey) null, 0, 0);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKey2));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2PKHpub();
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2WPKHpub();
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2PKHpriv();
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2WPKHpriv();
            hDPath.verify(() -> HDPath.M((ChildNumber) any()), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            hDPath.verify(() -> HDPath.M(hDPathMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${2968645b-d35f-31ba-856c-9f7ba5e8cc3f}
    @Ignore()
    @Test()
    public void deserialize2WhenParentGetFingerprintEqualsParentFingerprint() {
        /* Branches:
         * (header == params.getBip32HeaderP2PKHpub()) : false
         * (header == params.getBip32HeaderP2WPKHpub()) : true
         * (header == params.getBip32HeaderP2PKHpriv()) : false
         * (header == params.getBip32HeaderP2WPKHpriv()) : true
         * (!(pub || priv)) : false
         * (parent != null) : true
         * (parentFingerprint == 0) : false
         * (parent.getFingerprint() != parentFingerprint) : false
         * (path.size() != depth) : false
         * (!buffer.hasRemaining()) : true
         * (pub) : true
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 143)) : false  #  inside <init> method
         * (parentFingerprint != 0) : true  #  inside ascertainParentFingerprint method
         * (parent != null) : true  #  inside ascertainParentFingerprint method
         * (parent.getFingerprint() == parentFingerprint) : true  #  inside ascertainParentFingerprint method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(1).when(parentMock).getFingerprint();
            doReturn(hDPathMock).when(parentMock).getPath();
            ChildNumber[] childNumberArray = new ChildNumber[]{};
            doReturn(hDPathMock2).when(hDPathMock).extend((ChildNumber) any(), eq(childNumberArray));
            doReturn(1).when(hDPathMock2).size();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            doReturn(2).when(networkParametersMock).getBip32HeaderP2PKHpub();
            doReturn(1).when(networkParametersMock).getBip32HeaderP2WPKHpub();
            doReturn(2).when(networkParametersMock).getBip32HeaderP2PKHpriv();
            doReturn(1).when(networkParametersMock).getBip32HeaderP2WPKHpriv();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(hDPathMock2)).thenReturn(childNumberPathMock);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            DeterministicKey result = DeterministicKey.deserialize(networkMock, byteArray, parentMock);
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            X9ECParameters x9ECParameters = CustomNamedCurves.getByName("secp256k1");
            ECCurve eCCurve = x9ECParameters.getCurve();
            ECPoint eCPoint = x9ECParameters.getG();
            ECDomainParameters eCDomainParameters = new ECDomainParameters(eCCurve, eCPoint, new BigInteger("115792089237316195423570985008687907852837564279074904382605163141518161494337"), new BigInteger("1"));
            ECCurve eCCurve2 = eCDomainParameters.getCurve();
            byte[] byteArray3 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            LazyECPoint lazyECPoint = new LazyECPoint(eCCurve2, byteArray3);
            DeterministicKey deterministicKey = new DeterministicKey(hDPathMock2, byteArray2, lazyECPoint, parentMock, 1, 1);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKey));
            verify(parentMock, times(2)).getFingerprint();
            verify(parentMock, atLeast(1)).getPath();
            verify(hDPathMock, atLeast(1)).extend((ChildNumber) any(), eq(childNumberArray));
            verify(hDPathMock2, atLeast(1)).size();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2PKHpub();
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2WPKHpub();
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2PKHpriv();
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2WPKHpriv();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(2));
            hDPath.verify(() -> HDPath.M(hDPathMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${89f531b0-6b99-3435-afa1-4e45c79f7992}
    @Ignore()
    @Test()
    public void deserialize2WhenParentFingerprintNotEquals0AndParentIsNotNullAndParentGetFingerprintNotEqualsParentFingerprint() {
        /* Branches:
         * (header == params.getBip32HeaderP2PKHpub()) : false
         * (header == params.getBip32HeaderP2WPKHpub()) : true
         * (header == params.getBip32HeaderP2PKHpriv()) : false
         * (header == params.getBip32HeaderP2WPKHpriv()) : true
         * (!(pub || priv)) : false
         * (parent != null) : true
         * (parentFingerprint == 0) : false
         * (parent.getFingerprint() != parentFingerprint) : false
         * (path.size() != depth) : false
         * (!buffer.hasRemaining()) : true
         * (pub) : true
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 143)) : false  #  inside <init> method
         * (parentFingerprint != 0) : true  #  inside ascertainParentFingerprint method
         * (parent != null) : true  #  inside ascertainParentFingerprint method
         * (parent.getFingerprint() == parentFingerprint) : false  #  inside ascertainParentFingerprint method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(hDPathMock).when(parentMock).getPath();
            ChildNumber[] childNumberArray = new ChildNumber[]{};
            doReturn(hDPathMock2).when(hDPathMock).extend((ChildNumber) any(), eq(childNumberArray));
            doReturn(1).when(hDPathMock2).size();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            doReturn(2).when(networkParametersMock).getBip32HeaderP2PKHpub();
            doReturn(1).when(networkParametersMock).getBip32HeaderP2WPKHpub();
            doReturn(2).when(networkParametersMock).getBip32HeaderP2PKHpriv();
            doReturn(1).when(networkParametersMock).getBip32HeaderP2WPKHpriv();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(hDPathMock2)).thenReturn(childNumberPathMock);
            doReturn(2, 1).when(parentMock).getFingerprint();
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            DeterministicKey result = DeterministicKey.deserialize(networkMock, byteArray, parentMock);
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            X9ECParameters x9ECParameters = CustomNamedCurves.getByName("secp256k1");
            ECCurve eCCurve = x9ECParameters.getCurve();
            ECPoint eCPoint = x9ECParameters.getG();
            ECDomainParameters eCDomainParameters = new ECDomainParameters(eCCurve, eCPoint, new BigInteger("115792089237316195423570985008687907852837564279074904382605163141518161494337"), new BigInteger("1"));
            ECCurve eCCurve2 = eCDomainParameters.getCurve();
            byte[] byteArray3 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            LazyECPoint lazyECPoint = new LazyECPoint(eCCurve2, byteArray3);
            DeterministicKey deterministicKey = new DeterministicKey(hDPathMock2, byteArray2, lazyECPoint, parentMock, 1, 2);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKey));
            verify(parentMock, times(2)).getFingerprint();
            verify(parentMock, atLeast(1)).getPath();
            verify(hDPathMock, atLeast(1)).extend((ChildNumber) any(), eq(childNumberArray));
            verify(hDPathMock2, atLeast(1)).size();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2PKHpub();
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2WPKHpub();
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2PKHpriv();
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2WPKHpriv();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(2));
            hDPath.verify(() -> HDPath.M(hDPathMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${e9591612-e6d0-3e8e-a63e-cb2ef5211589}
    @Ignore()
    @Test()
    public void deserialize2WhenDefaultBranchAndDefaultBranchAndDefaultBranchAndDefaultBranchAndParentFingerprintEquals04() {
        /* Branches:
         * (header == params.getBip32HeaderP2PKHpub()) : false
         * (header == params.getBip32HeaderP2WPKHpub()) : false
         * (header == params.getBip32HeaderP2PKHpriv()) : false
         * (header == params.getBip32HeaderP2WPKHpriv()) : true
         * (!(pub || priv)) : true
         * (pub) : true
         * (parent != null) : false
         * (depth >= 1) : false
         * (!buffer.hasRemaining()) : true
         * (pub) : false
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : true  #  inside <init> method
         * (branch expression (line 197)) : false  #  inside <init> method
         * (branch expression (line 163)) : false  #  inside <init> method
         * (parentFingerprint != 0) : false  #  inside ascertainParentFingerprint method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS);
             MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            doReturn(1).when(networkParametersMock).getBip32HeaderP2PKHpub();
            doReturn(1).when(networkParametersMock).getBip32HeaderP2WPKHpub();
            doReturn(1).when(networkParametersMock).getBip32HeaderP2PKHpriv();
            doReturn(0).when(networkParametersMock).getBip32HeaderP2WPKHpriv();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            eCKey.when(() -> ECKey.publicPointFromPrivate(new BigInteger("0"))).thenReturn(eCPointMock);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            DeterministicKey deterministicKey = null;
            //Act Statement(s)
            DeterministicKey result = DeterministicKey.deserialize(networkMock, byteArray, deterministicKey);
            HDPath hDPath = HDPath.M();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            DeterministicKey deterministicKey2 = new DeterministicKey(hDPath, byteArray2, new BigInteger("0"), (DeterministicKey) null, 0, 0);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKey2));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2PKHpub();
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2WPKHpub();
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2PKHpriv();
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2WPKHpriv();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(2));
            eCKey.verify(() -> ECKey.publicPointFromPrivate(new BigInteger("0")), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(1));
        }
    }

    //Sapient generated method id: ${d3b56570-fb9d-3bdc-bd2d-1921398c948e}
    @Ignore()
    @Test()
    public void deserialize2WhenParentIsNotNullAndParentGetFingerprintEqualsParentFingerprint() {
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
         * (pub) : false
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : true  #  inside <init> method
         * (branch expression (line 197)) : false  #  inside <init> method
         * (branch expression (line 163)) : false  #  inside <init> method
         * (parentFingerprint != 0) : true  #  inside ascertainParentFingerprint method
         * (parent != null) : true  #  inside ascertainParentFingerprint method
         * (parent.getFingerprint() == parentFingerprint) : true  #  inside ascertainParentFingerprint method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
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
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            eCKey.when(() -> ECKey.publicPointFromPrivate(new BigInteger("0"))).thenReturn(eCPointMock);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(hDPathMock2)).thenReturn(childNumberPathMock);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            DeterministicKey result = DeterministicKey.deserialize(networkMock, byteArray, parentMock);
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            DeterministicKey deterministicKey = new DeterministicKey(hDPathMock2, byteArray2, new BigInteger("0"), parentMock, 1, 1);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKey));
            verify(parentMock, times(2)).getFingerprint();
            verify(parentMock, atLeast(1)).getPath();
            verify(hDPathMock, atLeast(1)).extend((ChildNumber) any(), eq(childNumberArray));
            verify(hDPathMock2, atLeast(1)).size();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2PKHpub();
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2WPKHpub();
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2PKHpriv();
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2WPKHpriv();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(3));
            eCKey.verify(() -> ECKey.publicPointFromPrivate(new BigInteger("0")), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(1));
            hDPath.verify(() -> HDPath.M(hDPathMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${b70f942e-9633-3483-a256-21a02869d9b5}
    @Ignore()
    @Test()
    public void deserialize2WhenParentFingerprintNotEquals0AndParentIsNotNullAndParentGetFingerprintNotEqualsParentFingerprint5() {
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
         * (pub) : false
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : true  #  inside <init> method
         * (branch expression (line 197)) : false  #  inside <init> method
         * (branch expression (line 163)) : false  #  inside <init> method
         * (parentFingerprint != 0) : true  #  inside ascertainParentFingerprint method
         * (parent != null) : true  #  inside ascertainParentFingerprint method
         * (parent.getFingerprint() == parentFingerprint) : false  #  inside ascertainParentFingerprint method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(hDPathMock).when(parentMock).getPath();
            ChildNumber[] childNumberArray = new ChildNumber[]{};
            doReturn(hDPathMock2).when(hDPathMock).extend((ChildNumber) any(), eq(childNumberArray));
            doReturn(1).when(hDPathMock2).size();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            doReturn(2).when(networkParametersMock).getBip32HeaderP2PKHpub();
            doReturn(2).when(networkParametersMock).getBip32HeaderP2WPKHpub();
            doReturn(2).when(networkParametersMock).getBip32HeaderP2PKHpriv();
            doReturn(1).when(networkParametersMock).getBip32HeaderP2WPKHpriv();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            eCKey.when(() -> ECKey.publicPointFromPrivate(new BigInteger("0"))).thenReturn(eCPointMock);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(hDPathMock2)).thenReturn(childNumberPathMock);
            doReturn(2, 1).when(parentMock).getFingerprint();
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            DeterministicKey result = DeterministicKey.deserialize(networkMock, byteArray, parentMock);
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            DeterministicKey deterministicKey = new DeterministicKey(hDPathMock2, byteArray2, new BigInteger("0"), parentMock, 1, 2);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKey));
            verify(parentMock, times(2)).getFingerprint();
            verify(parentMock, atLeast(1)).getPath();
            verify(hDPathMock, atLeast(1)).extend((ChildNumber) any(), eq(childNumberArray));
            verify(hDPathMock2, atLeast(1)).size();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2PKHpub();
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2WPKHpub();
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2PKHpriv();
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2WPKHpriv();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(3));
            eCKey.verify(() -> ECKey.publicPointFromPrivate(new BigInteger("0")), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(1));
            hDPath.verify(() -> HDPath.M(hDPathMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${7c5a079f-33a1-3a9e-99d6-7818f6a4d2f6}
    @Ignore()
    @Test()
    public void deserialize3Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKey> deterministicKey = mockStatic(DeterministicKey.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{(byte) 0};
            deterministicKey.when(() -> DeterministicKey.deserialize(networkMock, byteArray, parentMock)).thenReturn(deterministicKeyMock);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            //Act Statement(s)
            DeterministicKey result = DeterministicKey.deserialize(networkParameters, byteArray, parentMock);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyMock));
            deterministicKey.verify(() -> DeterministicKey.deserialize(networkMock, byteArray, parentMock), atLeast(1));
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
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("0"), (DeterministicKey) null);
            //Act Statement(s)
            Optional<Instant> result = target.creationTime();
            Optional<Instant> instantOptional = Optional.empty();
            //Assert statement(s)
            assertThat(result, equalTo(instantOptional));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
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
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("0"), (DeterministicKey) null);
            Instant instant = Instant.now();
            //Act Statement(s)
            target.setCreationTime(instant);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
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
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("0"), (DeterministicKey) null);
            //Act Statement(s)
            target.clearCreationTime();
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
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
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("1"), (DeterministicKey) null));
            doNothing().when(target).setCreationTime((Instant) any());
            //Act Statement(s)
            target.setCreationTimeSeconds(1L);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
            verify(target, atLeast(1)).setCreationTime((Instant) any());
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
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("0"), (DeterministicKey) null));
            doNothing().when(target).clearCreationTime();
            //Act Statement(s)
            target.setCreationTimeSeconds(0L);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
            verify(target, atLeast(1)).clearCreationTime();
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
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("0"), (DeterministicKey) null);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("s1");
            thrown.expect(IllegalArgumentException.class);
            thrown.expectMessage(illegalArgumentException.getMessage());
            //Act Statement(s)
            target.setCreationTimeSeconds(0L);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
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
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            List list = new ArrayList<>();
            HDPath hDPath2 = new HDPath(false, list);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(hDPath2);
            byte[] byteArray = new byte[]{};
            byteUtils.when(() -> ByteUtils.formatHex(byteArray)).thenReturn("");
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            byteUtils.when(() -> ByteUtils.formatHex(byteArray2)).thenReturn("DeterministicKey{pub=03a0f2d5b3f6d8b3d1f6d8b3d1f6d8b3d1f6d8b3d1f6d8b3d1f6d8b3d1f6d8b3, chainCode=f0f1f2f3f4f5f6f7f8f9fafbfcfdfeff, path=m/44'/0'/1', creationTimeSeconds=unknown, isEncrypted=false, isPubKeyOnly=false}");
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray3 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray3, eCPointMock, false, new BigInteger("1"), (DeterministicKey) null));
            doReturn("return_of_getPathAsString1").when(target).getPathAsString();
            doReturn(Optional.empty()).when(target).creationTime();
            doReturn(false).when(target).isEncrypted();
            doReturn(false).when(target).isPubKeyOnly();
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("toString_moreObjects.ToStringHelper2"));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
            byteUtils.verify(() -> ByteUtils.formatHex(byteArray), atLeast(1));
            byteUtils.verify(() -> ByteUtils.formatHex(byteArray2), atLeast(1));
            verify(target, atLeast(1)).getPathAsString();
            verify(target, atLeast(1)).creationTime();
            verify(target, atLeast(1)).isEncrypted();
            verify(target, atLeast(1)).isPubKeyOnly();
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
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            byte[] byteArray = new byte[]{};
            byteUtils.when(() -> ByteUtils.formatHex(byteArray)).thenReturn("");
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            byteUtils.when(() -> ByteUtils.formatHex(byteArray2)).thenReturn("000102030405060708090a0b0c0d0e0f101112131415161718191a1b1c1d1e1f");
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray3 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray3, eCPointMock, false, new BigInteger("1"), (DeterministicKey) null));
            doReturn("return_of_getPathAsString1").when(target).getPathAsString();
            Instant instant = (Instant) Instant.now();
            doReturn(Optional.of(instant)).when(target).creationTime();
            doReturn(false).when(target).isEncrypted();
            doReturn(false).when(target).isPubKeyOnly();
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("toString_moreObjects.ToStringHelper2"));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
            byteUtils.verify(() -> ByteUtils.formatHex(byteArray), atLeast(1));
            byteUtils.verify(() -> ByteUtils.formatHex(byteArray2), atLeast(1));
            verify(target, atLeast(1)).getPathAsString();
            verify(target, atLeast(1)).creationTime();
            verify(target, atLeast(1)).isEncrypted();
            verify(target, atLeast(1)).isPubKeyOnly();
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
        Address addressMock = mock(Address.class, "formatKeyWithAddress_address1");
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("0"), (DeterministicKey) null));
            doReturn(addressMock).when(target).toAddress(ScriptType.P2PKH, networkMock);
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(target).getPubKeyHash();
            doReturn("builderItem1").when(target).getPathAsString();
            doReturn("builderItem1").when(target).toStringWithPrivate(aesKeyMock, networkMock);
            StringBuilder stringBuilder = new StringBuilder();
            //Act Statement(s)
            target.formatKeyWithAddress(true, aesKeyMock, stringBuilder, networkMock, ScriptType.P2PKH, "builderItem1");
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
            verify(target, atLeast(1)).toAddress(ScriptType.P2PKH, networkMock);
            verify(target, atLeast(1)).getPubKeyHash();
            verify(target, atLeast(1)).getPathAsString();
            verify(target, atLeast(1)).toStringWithPrivate(aesKeyMock, networkMock);
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
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, true, new BigInteger("123456789"), (DeterministicKey) null));
            StringBuilder stringBuilder = new StringBuilder();
            doNothing().when(target).formatKeyWithAddress(true, aesKeyMock, stringBuilder, networkMock, ScriptType.P2PKH, "This is a comment");
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            //Act Statement(s)
            target.formatKeyWithAddress(true, aesKeyMock, stringBuilder, networkParameters, ScriptType.P2PKH, "This is a comment");
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(2));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            verify(target).formatKeyWithAddress(true, aesKeyMock, stringBuilder, networkMock, ScriptType.P2PKH, "This is a comment");
        }
    }
}
