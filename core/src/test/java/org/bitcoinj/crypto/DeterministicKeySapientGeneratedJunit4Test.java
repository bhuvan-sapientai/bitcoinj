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

import org.bitcoinj.base.Address;
import org.mockito.stubbing.Answer;
import org.bitcoinj.base.internal.Preconditions;
import org.bitcoinj.base.Sha256Hash;
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

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${bf9d95c1-b4c4-3f7d-9e18-c185484c5efc}, hash: DC36DE29AF0419C705173CDFECA8A178
    @Ignore()
    @Test()
    public void getPathAsStringTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("2"), (DeterministicKey) null);
            //Act Statement(s)
            String result = target.getPathAsString();
            //Assert statement(s)
            assertThat(result, equalTo("<init>_hDPath1"));
            hDPath.verify(() -> HDPath.M(anyList()));
        }
    }

    //Sapient generated method id: ${4555ae24-f823-3b8a-b8e8-14af915ea50d}, hash: 5C8091D3B4CBACA3A270A0D2AB8EBCE4
    @Ignore()
    @Test()
    public void getChildNumberWhenChildNumberPathSizeEquals0() {
        /* Branches:
         * (childNumberPath.size() == 0) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("-1"), (DeterministicKey) null);
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

    //Sapient generated method id: ${a28a43ca-fa93-353f-ac61-126d77a8f3cb}, hash: 38DFD93F0E9C9730462E6078C4BDC603
    @Ignore()
    @Test()
    public void getChildNumberWhenChildNumberPathSizeNotEquals0() {
        /* Branches:
         * (childNumberPath.size() == 0) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("2"), (DeterministicKey) null);
            doReturn(-1).when(childNumberPathMock).size();
            doReturn(childNumberMock).when(childNumberPathMock).get(-2);
            //Act Statement(s)
            ChildNumber result = target.getChildNumber();
            //Assert statement(s)
            assertThat(result, equalTo(childNumberMock));
            hDPath.verify(() -> HDPath.M(anyList()));
            verify(childNumberPathMock, times(2)).size();
            verify(childNumberPathMock).get(-2);
        }
    }

    //Sapient generated method id: ${53d8d374-4547-39ab-a12c-11162a068214}, hash: D1D3609210A615B45FB5906AC18992F1
    @Ignore()
    @Test()
    public void getIdentifierTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("2"), (DeterministicKey) null);
            //Act Statement(s)
            byte[] result = target.getIdentifier();
            byte[] byteResultArray = new byte[]{(byte) -76, (byte) 114, (byte) -94, (byte) 102, (byte) -48, (byte) -67, (byte) -119, (byte) -63, (byte) 55, (byte) 6, (byte) -92, (byte) 19, (byte) 44, (byte) -49, (byte) -79, (byte) 111, (byte) 124, (byte) 59, (byte) -97, (byte) -53};
            //Assert statement(s)
            assertThat(result, equalTo(byteResultArray));
            hDPath.verify(() -> HDPath.M(anyList()));
        }
    }

    //Sapient generated method id: ${3216a600-fd04-3e07-89ba-2ac483af98b3}, hash: E273D1A9421B256638607C786E11A7AE
    @Ignore()
    @Test()
    public void getFingerprintTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("2"), (DeterministicKey) null));
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

    //Sapient generated method id: ${3505acb3-4be6-3f02-8829-9abc3293c109}, hash: E87AACF065BDCB9B7526A5505564F4FE
    @Ignore()
    @Test()
    public void getPrivKeyBytes33Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("2"), (DeterministicKey) null));
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

    //Sapient generated method id: ${6e7dc487-7eac-3184-83ef-b60d5c91f780}, hash: 8F0EC49FFD8E0A72B64CAC82B7601679
    @Ignore()
    @Test()
    public void dropPrivateBytesWhenIsPubKeyOnly() {
        /* Branches:
         * (isPubKeyOnly()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("2"), (DeterministicKey) null));
            doReturn(true).when(target).isPubKeyOnly();
            //Act Statement(s)
            DeterministicKey result = target.dropPrivateBytes();
            //Assert statement(s)
            assertThat(result, equalTo(target));
            hDPath.verify(() -> HDPath.M(anyList()));
            verify(target).isPubKeyOnly();
        }
    }

    //Sapient generated method id: ${e6f9ebb3-3a61-38e0-af1d-1b4e714cc82a}, hash: B88D285E1E78F820C6D6BBCBE5B19848
    @Ignore()
    @Test()
    public void dropPrivateBytesWhenDefaultBranchThrowsIllegalArgumentException() {
        /* Branches:
         * (isPubKeyOnly()) : false
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 73)) : false  #  inside <init> method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("0"), (DeterministicKey) null));
            doReturn(false).when(target).isPubKeyOnly();
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.dropPrivateBytes();
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
            verify(target).isPubKeyOnly();
        }
    }

    //Sapient generated method id: ${318ff451-c8b8-345f-813b-dc64e117fcc8}, hash: DE446C63AACDCD457C244A396909432D
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
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            hDPath.when(() -> HDPath.M(childNumberPathMock)).thenReturn(hDPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("-1"), (DeterministicKey) null));
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

    //Sapient generated method id: ${cd6b7e81-9e47-3218-a509-5e3ce6e776fd}, hash: DB9531DDD8E6373CBD87421B8C1CB28C
    @Ignore()
    @Test()
    public void dropParentWhenDefaultBranchAndDefaultBranchThrowsIllegalArgumentException() {
        /* Branches:
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("0"), (DeterministicKey) null);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.dropParent();
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
        }
    }

    //Sapient generated method id: ${87c21d6c-89bd-3423-8b12-54e52b8284c0}, hash: DC836430822AE232DC8D1FCCB47CBDA9
    @Ignore()
    @Test()
    public void dropParentWhenDefaultBranchAndDefaultBranchAndDefaultBranchThrowsIllegalArgumentException() {
        /* Branches:
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : true  #  inside <init> method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("0"), (DeterministicKey) null);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.dropParent();
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
        }
    }

    //Sapient generated method id: ${da82bde8-884f-3cc6-a79a-948e5f417522}, hash: 87FDE5A86F13F147D9F63A3E4F5EB532
    @Ignore()
    @Test()
    public void dropParentWhenDefaultBranchAndDefaultBranchAndDefaultBranchAndDefaultBranchThrowsIllegalArgumentException() {
        /* Branches:
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : false  #  inside <init> method
         * (branch expression (line 197)) : true  #  inside <init> method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("0"), (DeterministicKey) null);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.dropParent();
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
        }
    }

    //Sapient generated method id: ${4bcbd92e-7b2c-331f-bb2b-48a4b8cc397b}, hash: D21825EF7B1E1E0ACB86CDBD141DEC32
    @Ignore()
    @Test()
    public void dropParentWhenDefaultBranchAndDefaultBranchAndDefaultBranchAndDefaultBranchAndDefaultBranThrowsIllegalArgumentException() {
        /* Branches:
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : false  #  inside <init> method
         * (branch expression (line 197)) : false  #  inside <init> method
         * (branch expression (line 73)) : false  #  inside <init> method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("0"), (DeterministicKey) null);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.dropParent();
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
        }
    }

    //Sapient generated method id: ${192de3e2-bc70-3331-8b07-a22813ca46b0}, hash: 9B809E722C40E2166151EA4712F6A71F
    @Ignore()
    @Test()
    public void dropParentWhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : false  #  inside <init> method
         * (branch expression (line 197)) : false  #  inside <init> method
         * (branch expression (line 73)) : false  #  inside <init> method
         * (branch expression (line 77)) : false  #  inside <init> method
         * (branch expression (line 78)) : false  #  inside <init> method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            hDPath.when(() -> HDPath.M(childNumberPathMock)).thenReturn(hDPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("-1"), (DeterministicKey) null);
            //Act Statement(s)
            DeterministicKey result = target.dropParent();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            LazyECPoint lazyECPoint = new LazyECPoint(eCPointMock, false);
            LazyECPoint lazyECPoint2 = lazyECPoint.compress();
            DeterministicKey deterministicKey = new DeterministicKey(childNumberPathMock, byteArray2, lazyECPoint2, new BigInteger("-1"), (DeterministicKey) null);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKey));
            hDPath.verify(() -> HDPath.M(anyList()));
            hDPath.verify(() -> HDPath.M(childNumberPathMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${0ebb4dc2-13c5-3bff-8619-c21a8ced46f8}, hash: 9B131A7598ADE91C26F322B1DDE1ABEB
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

    //Sapient generated method id: ${cd80e3c4-54b9-3a04-b5c0-6816aafaf96d}, hash: A97E78CB604FA2002603511B4907ED5D
    @Ignore()
    @Test()
    public void encrypt1ThrowsUnsupportedOperationException() throws KeyCrypterException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("2"), (DeterministicKey) null);
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Must supply a new parent for encryption");
            thrown.expect(UnsupportedOperationException.class);
            thrown.expectMessage(unsupportedOperationException.getMessage());
            //Act Statement(s)
            target.encrypt(keyCrypterMock, aesKeyMock);
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
        }
    }

    //Sapient generated method id: ${5fd010fe-3627-31fc-9fb9-9d67fcd77f39}, hash: 466C0C4B4CA06761083B523442B2F19E
    @Ignore()
    @Test()
    public void encrypt2WhenPrivKeyBytesIsNullThrowsIllegalStateException() throws KeyCrypterException {
        /* Branches:
         * (newParent != null) : true
         * (privKeyBytes != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            doReturn(false).when(newParentMock).isEncrypted();
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("2"), (DeterministicKey) null));
            doReturn(null).when(target).getPrivKeyBytes();
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.encrypt(keyCrypterMock, aesKeyMock, newParentMock);
            //Assert statement(s)
            verify(newParentMock, atLeast(1)).isEncrypted();
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(3));
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            verify(target, atLeast(1)).getPrivKeyBytes();
        }
    }

    //Sapient generated method id: ${53f60ed0-3bc9-3278-a202-1cecc977fa3b}, hash: C5A513F6D808275D10201C14990FD612
    @Ignore()
    @Test()
    public void encrypt2WhenDefaultBranchThrowsIllegalArgumentException() throws KeyCrypterException {
        /* Branches:
         * (newParent != null) : true
         * (privKeyBytes != null) : true
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 73)) : false  #  inside <init> method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(encryptedDataMock).when(keyCrypterMock).encrypt(byteArray, aesKeyMock);
            doReturn(false).when(newParentMock).isEncrypted();
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(false)).thenThrow(illegalArgumentException);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray2, eCPointMock, false, new BigInteger("0"), (DeterministicKey) null));
            doReturn(byteArray).when(target).getPrivKeyBytes();
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.encrypt(keyCrypterMock, aesKeyMock, newParentMock);
            //Assert statement(s)
            verify(keyCrypterMock, atLeast(1)).encrypt(byteArray, aesKeyMock);
            verify(newParentMock, atLeast(1)).isEncrypted();
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(3));
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(2));
            verify(target, atLeast(1)).getPrivKeyBytes();
        }
    }

    //Sapient generated method id: ${ceafc010-7249-3a39-974f-f00d8f2ed174}, hash: D270FBE198A4B53EE5BA7A6EA84EBDE0
    @Ignore()
    @Test()
    public void encrypt2WhenNewParentIsNotNull() throws KeyCrypterException {
        /* Branches:
         * (newParent != null) : true
         * (privKeyBytes != null) : true
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 73)) : false  #  inside <init> method
         * (branch expression (line 77)) : false  #  inside <init> method
         * (branch expression (line 78)) : false  #  inside <init> method
         * (newParent == null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            doReturn(encryptedDataMock).when(keyCrypterMock).encrypt(byteArray, aesKeyMock);
            doReturn(false).when(newParentMock).isEncrypted();
            doReturn(0).when(newParentMock).getFingerprint();
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(childNumberPathMock)).thenReturn(hDPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray2, eCPointMock, false, new BigInteger("-1"), (DeterministicKey) null));
            doReturn(byteArray).when(target).getPrivKeyBytes();
            //Act Statement(s)
            DeterministicKey result = target.encrypt(keyCrypterMock, aesKeyMock, newParentMock);
            byte[] byteArray3 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            LazyECPoint lazyECPoint = new LazyECPoint(eCPointMock, false);
            LazyECPoint lazyECPoint2 = lazyECPoint.compress();
            DeterministicKey deterministicKey = new DeterministicKey(childNumberPathMock, byteArray3, keyCrypterMock, lazyECPoint2, encryptedDataMock, newParentMock);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKey));
            verify(keyCrypterMock, atLeast(1)).encrypt(byteArray, aesKeyMock);
            verify(newParentMock, atLeast(1)).isEncrypted();
            verify(newParentMock, atLeast(1)).getFingerprint();
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(4));
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            hDPath.verify(() -> HDPath.M(childNumberPathMock), atLeast(1));
            verify(target, atLeast(1)).getPrivKeyBytes();
        }
    }

    //Sapient generated method id: ${689fe557-e38c-3ee6-8fdf-c2e6b3d8791d}, hash: 6AAB3EABA20EB634A6FDF946F2559EB8
    @Ignore()
    @Test()
    public void isPubKeyOnlyWhenSuperNotIsPubKeyOnly() {
        /* Branches:
         * (priv == null) : false  #  inside isPubKeyOnly method
         * (super.isPubKeyOnly()) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("2"), (DeterministicKey) null);
            //Act Statement(s)
            boolean result = target.isPubKeyOnly();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            hDPath.verify(() -> HDPath.M(anyList()));
        }
    }

    //Sapient generated method id: ${63f88a15-f153-3355-8f0b-9452482b4c7d}, hash: 329451D42483003D37639021389F2FCA
    @Ignore()
    @Test()
    public void isPubKeyOnlyWhenParentIsNull() {
        /* Branches:
         * (priv == null) : true  #  inside isPubKeyOnly method
         * (super.isPubKeyOnly()) : true
         * (parent == null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
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

    //Sapient generated method id: ${299670c8-bb7c-32d4-94a0-e9d9de37f21c}, hash: 6C839C1CD3624234674EE1A0FFC96118
    @Ignore()
    @Test()
    public void hasPrivKeyWhenFindParentWithPrivKeyIsNotNull() {
        /* Branches:
         * (cursor != null) : true  #  inside findParentWithPrivKey method
         * (cursor.priv != null) : true  #  inside findParentWithPrivKey method
         * (findParentWithPrivKey() != null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("2"), (DeterministicKey) null);
            //Act Statement(s)
            boolean result = target.hasPrivKey();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            hDPath.verify(() -> HDPath.M(anyList()));
        }
    }

    //Sapient generated method id: ${f6dc8068-b82e-3f3b-a989-8663e68346c2}, hash: 4FE312457D2C350CD13940985C81CAC0
    @Ignore()
    @Test()
    public void hasPrivKeyWhenFindParentWithPrivKeyIsNull() {
        /* Branches:
         * (cursor != null) : true  #  inside findParentWithPrivKey method
         * (cursor.priv != null) : false  #  inside findParentWithPrivKey method
         * (findParentWithPrivKey() != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("2"), (DeterministicKey) null);
            //Act Statement(s)
            boolean result = target.hasPrivKey();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            hDPath.verify(() -> HDPath.M(anyList()));
        }
    }

    //Sapient generated method id: ${df6fb236-86d5-3773-85e6-2ce514bee5e1}, hash: 3E0CB069A253D01EADA05865A6C189F7
    @Ignore()
    @Test()
    public void getSecretBytesWhenPrivIsNotNull() {
        /* Branches:
         * (priv != null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("2"), (DeterministicKey) null));
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(target).getPrivKeyBytes();
            //Act Statement(s)
            byte[] result = target.getSecretBytes();
            //Assert statement(s)
            assertThat(result, equalTo(byteArray2));
            hDPath.verify(() -> HDPath.M(anyList()));
            verify(target).getPrivKeyBytes();
        }
    }

    //Sapient generated method id: ${9eb0d3d9-1f8e-3a76-b473-e5957133c84b}, hash: 7525B7D341CA51566A7BCAB0255FA4D8
    @Ignore()
    @Test()
    public void getSecretBytesWhenPrivIsNull() {
        /* Branches:
         * (priv != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null);
            //Act Statement(s)
            byte[] result = target.getSecretBytes();
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            hDPath.verify(() -> HDPath.M(anyList()));
        }
    }

    //Sapient generated method id: ${11ec679c-f610-345e-b1fb-4cd7fc2f0db5}, hash: 4CBDBCC429ED641AA7E08072AD5AFC3A
    @Ignore()
    @Test()
    public void isEncryptedWhenParentIsNull() {
        /* Branches:
         * (priv == null) : true
         * (keyCrypter != null) : false  #  inside isEncrypted method
         * (super.isEncrypted()) : false
         * (parent != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null);
            //Act Statement(s)
            boolean result = target.isEncrypted();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            hDPath.verify(() -> HDPath.M(anyList()));
        }
    }

    //Sapient generated method id: ${c5e1e484-0645-3a8e-841c-13183e0b0b5b}, hash: 58AFBEED48652E6E7EBCA5476F16B019
    @Ignore()
    @Test()
    public void getKeyCrypterWhenParentIsNull() {
        /* Branches:
         * (keyCrypter != null) : false
         * (parent != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("2"), (DeterministicKey) null);
            //Act Statement(s)
            KeyCrypter result = target.getKeyCrypter();
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            hDPath.verify(() -> HDPath.M(anyList()));
        }
    }

    //Sapient generated method id: ${691b4cc1-a6de-3b56-b162-e03d34e732de}, hash: 63A3C260F82161EB5B6822F483C98FD9
    @Ignore()
    @Test()
    public void sign1WhenPrivIsNullThrowsECKeyMissingPrivateKeyException() throws KeyCrypterException {
        /* Branches:
         * (isEncrypted()) : true
         * (crypter != null) : false  #  inside sign method
         * (priv == null) : true  #  inside sign method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, (BigInteger) null, (DeterministicKey) null));
            doReturn(true).when(target).isEncrypted();
            thrown.expect(ECKey.MissingPrivateKeyException.class);
            //Act Statement(s)
            target.sign(sha256HashMock, aesKeyMock);
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
            verify(target).isEncrypted();
        }
    }

    //Sapient generated method id: ${778deaba-2af1-3e72-9c9b-5a043bff9924}, hash: F936EE87AB15D6831548C039AC6853D7
    @Ignore()
    @Test()
    public void sign1WhenPrivIsNotNull() throws KeyCrypterException {
        /* Branches:
         * (isEncrypted()) : true
         * (crypter != null) : false  #  inside sign method
         * (priv == null) : false  #  inside sign method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("2"), (DeterministicKey) null));
            doReturn(true).when(target).isEncrypted();
            doReturn(eCKeyECDSASignatureMock).when(target).doSign(sha256HashMock, new BigInteger("2"));
            //Act Statement(s)
            ECKey.ECDSASignature result = target.sign(sha256HashMock, aesKeyMock);
            //Assert statement(s)
            assertThat(result, equalTo(eCKeyECDSASignatureMock));
            hDPath.verify(() -> HDPath.M(anyList()));
            verify(target).isEncrypted();
            verify(target).doSign(sha256HashMock, new BigInteger("2"));
        }
    }

    //Sapient generated method id: ${c242016c-319d-3a46-9a9a-57134e37d4a0}, hash: B96ACE9E254F2AB1556C5C37E1897C8B
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
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("2"), (DeterministicKey) null));
            doReturn(false).when(target).isEncrypted();
            thrown.expect(ECKey.MissingPrivateKeyException.class);
            //Act Statement(s)
            target.sign(sha256HashMock, aesKeyMock);
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
            verify(target).isEncrypted();
        }
    }

    //Sapient generated method id: ${17597353-c78b-3788-b1ba-76d3aa713cdb}, hash: 0C8D545297274B3C5547D67CEDA2CC86
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
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("0"), (DeterministicKey) null));
            doReturn(false).when(target).isEncrypted();
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.sign(sha256HashMock, aesKeyMock);
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
            verify(target).isEncrypted();
        }
    }

    //Sapient generated method id: ${0684e218-34a0-3ef2-a476-1547540a321c}, hash: AD4BC80DC4167EB8B67772E98D1D8349
    @Ignore()
    @Test()
    public void sign1WhenDefaultBranchAndDefaultBranchAndDefaultBranchThrowsIllegalArgumentException() throws KeyCrypterException {
        /* Branches:
         * (isEncrypted()) : false
         * (cursor != null) : true  #  inside findParentWithPrivKey method
         * (cursor.priv != null) : true  #  inside findParentWithPrivKey method
         * (cursor == null) : false  #  inside findOrDerivePrivateKey method
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : true  #  inside <init> method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("-1"), (DeterministicKey) null));
            doReturn(false).when(target).isEncrypted();
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.sign(sha256HashMock, aesKeyMock);
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
            verify(target).isEncrypted();
        }
    }

    //Sapient generated method id: ${1bd0dcc0-4aec-33d6-9634-2c32107e6feb}, hash: F8CD30FB0B46E58AD60996DC166E3FF6
    @Ignore()
    @Test()
    public void sign1WhenDefaultBranchAndDefaultBranchAndDefaultBranchAndDefaultBranchThrowsIllegalArgumentException() throws KeyCrypterException {
        /* Branches:
         * (isEncrypted()) : false
         * (cursor != null) : true  #  inside findParentWithPrivKey method
         * (cursor.priv != null) : true  #  inside findParentWithPrivKey method
         * (cursor == null) : false  #  inside findOrDerivePrivateKey method
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : false  #  inside <init> method
         * (branch expression (line 197)) : true  #  inside <init> method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            byte[] byteArray = new byte[]{(byte) 0};
            byteUtils.when(() -> ByteUtils.bytesToBigInteger(byteArray)).thenReturn(new BigInteger("1"));
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray2, eCPointMock, false, new BigInteger("-1"), (DeterministicKey) null));
            doReturn(false).when(target).isEncrypted();
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.sign(sha256HashMock, aesKeyMock);
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
            byteUtils.verify(() -> ByteUtils.bytesToBigInteger(byteArray), atLeast(1));
            verify(target).isEncrypted();
        }
    }

    //Sapient generated method id: ${3d4c27d3-025a-3b70-a511-d5f9f7d42eac}, hash: 4BDB8262FFDE517513FEA61E4F860047
    @Ignore()
    @Test()
    public void sign1WhenDefaultBranchAndDefaultBranchAndDefaultBranchAndDefaultBranchAndDefaultBranchThrowsIllegalArgumentException() throws KeyCrypterException {
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
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("-1"), (DeterministicKey) null));
            doReturn(false).when(target).isEncrypted();
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.sign(sha256HashMock, aesKeyMock);
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
            verify(target).isEncrypted();
        }
    }

    //Sapient generated method id: ${dfb3ab03-6203-3e99-88f6-8c72bbb35178}, hash: 28BC427E03BE3918490C5941D84E6D0B
    @Ignore()
    @Test()
    public void sign1WhenDefaultBranchAndPathIsEmptyThrowsNullPointerException() throws KeyCrypterException {
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
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            hDPath.when(() -> HDPath.M(hDPathMock2)).thenReturn(hDPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("-1"), (DeterministicKey) null));
            doReturn(false).when(target).isEncrypted();
            doReturn(0).when(hDPathMock).size();
            List<ChildNumber> childNumberList2 = new ArrayList<>();
            doReturn(childNumberList2).when(hDPathMock).subList(0, 0);
            thrown.expect(NullPointerException.class);
            //Act Statement(s)
            target.sign(sha256HashMock, aesKeyMock);
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
            hDPath.verify(() -> HDPath.M(hDPathMock2), atLeast(1));
            verify(target).isEncrypted();
            verify(hDPathMock).size();
            verify(hDPathMock).subList(0, 0);
        }
    }

    //Sapient generated method id: ${395f69de-e2da-377c-99b6-e7c77a78b684}, hash: A4C497F6063394F411B70EA415B249F4
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
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDKeyDerivation> hDKeyDerivation = mockStatic(HDKeyDerivation.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            hDPath.when(() -> HDPath.M(hDPathMock2)).thenReturn(hDPathMock);
            hDKeyDerivation.when(() -> HDKeyDerivation.deriveChildKey((DeterministicKey) any(), eq(childNumberMock))).thenReturn(deterministicKeyMock);
            doReturn(lazyECPointMock).when(publicAsPointMock).compress();
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("-1"), (DeterministicKey) null));
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
            hDPath.verify(() -> HDPath.M(hDPathMock2), atLeast(1));
            hDKeyDerivation.verify(() -> HDKeyDerivation.deriveChildKey((DeterministicKey) any(), eq(childNumberMock)));
            verify(publicAsPointMock).compress();
            verify(target).isEncrypted();
            verify(hDPathMock).size();
            verify(hDPathMock).subList(0, 0);
        }
    }

    //Sapient generated method id: ${5457b0ea-612c-3305-a5d3-508db22e94b3}, hash: 4887FB14EF670A5CDB39EDDDA891B3A7
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
         * (branch expression (line 196)) : false  #  inside <init> method
         * (branch expression (line 197)) : false  #  inside <init> method
         * (branch expression (line 73)) : false  #  inside <init> method
         * (branch expression (line 77)) : false  #  inside <init> method
         * (branch expression (line 78)) : false  #  inside <init> method
         * (for-each(path)) : true  #  inside derivePrivateKeyDownwards method
         * (!downCursor.pub.equals(pub)) : false  #  inside derivePrivateKeyDownwards method
         * (privateKey == null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDKeyDerivation> hDKeyDerivation = mockStatic(HDKeyDerivation.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            hDPath.when(() -> HDPath.M(hDPathMock2)).thenReturn(hDPathMock);
            hDKeyDerivation.when(() -> HDKeyDerivation.deriveChildKey((DeterministicKey) any(), eq(childNumberMock))).thenReturn(deterministicKeyMock);
            doReturn(lazyECPointMock).when(publicAsPointMock).compress();
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("-1"), (DeterministicKey) null));
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
            hDPath.verify(() -> HDPath.M(hDPathMock2), atLeast(1));
            hDKeyDerivation.verify(() -> HDKeyDerivation.deriveChildKey((DeterministicKey) any(), eq(childNumberMock)));
            verify(publicAsPointMock).compress();
            verify(target).isEncrypted();
            verify(hDPathMock).size();
            verify(hDPathMock).subList(0, 0);
            verify(target).doSign(sha256HashMock, new BigInteger("0"));
        }
    }

    //Sapient generated method id: ${89ba9db8-79db-334b-b0f6-6c178836faa8}, hash: 98F2711953B9B6FABA721D5401E833D9
    @Ignore()
    @Test()
    public void decrypt2WhenDecryptedKeyLengthNotEquals32ThrowsKeyCrypterExceptionInvalidCipherText() throws KeyCrypterException {
        /* Branches:
         * (this.keyCrypter != null) : false
         * (encryptedPrivateKey != null) : true  #  inside findOrDeriveEncryptedPrivateKey method
         * (decryptedKey.length != 32) : true  #  inside findOrDeriveEncryptedPrivateKey method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(keyCrypterMock).decrypt(encryptedDataMock, aesKeyMock);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray2, eCPointMock, false, new BigInteger("-1"), (DeterministicKey) null);
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

    //Sapient generated method id: ${2ab9e0b5-378e-3ba6-8173-3d5a296694bc}, hash: 6675DAD1956526FE4080003485D34FB7
    @Ignore()
    @Test()
    public void decrypt2WhenCursorIsNullThrowsKeyCrypterException() throws KeyCrypterException {
        /* Branches:
         * (this.keyCrypter != null) : false
         * (encryptedPrivateKey != null) : false  #  inside findOrDeriveEncryptedPrivateKey method
         * (cursor != null) : false  #  inside findOrDeriveEncryptedPrivateKey method
         * (cursor == null) : true  #  inside findOrDeriveEncryptedPrivateKey method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("2"), (DeterministicKey) null);
            KeyCrypterException keyCrypterException = new KeyCrypterException("Neither this key nor its parents have an encrypted private key");
            thrown.expect(KeyCrypterException.class);
            thrown.expectMessage(keyCrypterException.getMessage());
            //Act Statement(s)
            target.decrypt(keyCrypterMock, aesKeyMock);
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
        }
    }

    //Sapient generated method id: ${27a95004-2ad6-3604-b461-6aa45e749845}, hash: FE05E1C508F3036AC6909BB26B64DED0
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
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            doReturn(byteArray).when(keyCrypterMock).decrypt(encryptedDataMock, aesKeyMock);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            eCKey.when(() -> ECKey.publicPointFromPrivate(new BigInteger("0"))).thenReturn(eCPointMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray2, eCPointMock2, false, new BigInteger("0"), (DeterministicKey) null);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.decrypt(keyCrypterMock, aesKeyMock);
            //Assert statement(s)
            verify(keyCrypterMock).decrypt(encryptedDataMock, aesKeyMock);
            hDPath.verify(() -> HDPath.M(anyList()));
            eCKey.verify(() -> ECKey.publicPointFromPrivate(new BigInteger("0")), atLeast(1));
        }
    }

    //Sapient generated method id: ${0cd07923-a086-3b62-b241-31e3b1576c53}, hash: F1BFF7F72E624F7F8BC19970B0308F18
    @Ignore()
    @Test()
    public void decrypt2WhenDefaultBranchAndDefaultBranchAndDefaultBranchThrowsIllegalArgumentException() throws KeyCrypterException {
        /* Branches:
         * (this.keyCrypter != null) : false
         * (encryptedPrivateKey != null) : true  #  inside findOrDeriveEncryptedPrivateKey method
         * (decryptedKey.length != 32) : false  #  inside findOrDeriveEncryptedPrivateKey method
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : true  #  inside <init> method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            doReturn(byteArray).when(keyCrypterMock).decrypt(encryptedDataMock, aesKeyMock);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            byteUtils.when(() -> ByteUtils.bytesToBigInteger(byteArray)).thenReturn(new BigInteger("0"));
            eCKey.when(() -> ECKey.publicPointFromPrivate(new BigInteger("0"))).thenReturn(eCPointMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray2, eCPointMock2, false, new BigInteger("-1"), (DeterministicKey) null);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.decrypt(keyCrypterMock, aesKeyMock);
            //Assert statement(s)
            verify(keyCrypterMock).decrypt(encryptedDataMock, aesKeyMock);
            hDPath.verify(() -> HDPath.M(anyList()));
            byteUtils.verify(() -> ByteUtils.bytesToBigInteger(byteArray), atLeast(1));
            eCKey.verify(() -> ECKey.publicPointFromPrivate(new BigInteger("0")), atLeast(1));
        }
    }

    //Sapient generated method id: ${c96183c6-dd9f-3c84-ac4d-c31b426f37f7}, hash: 77F7744EBD869B5960C94597B2028175
    @Ignore()
    @Test()
    public void decrypt2WhenDefaultBranchAndDefaultBranchAndDefaultBranchAndDefaultBranchThrowsIllegalArgumentException() throws KeyCrypterException {
        /* Branches:
         * (this.keyCrypter != null) : false
         * (encryptedPrivateKey != null) : true  #  inside findOrDeriveEncryptedPrivateKey method
         * (decryptedKey.length != 32) : false  #  inside findOrDeriveEncryptedPrivateKey method
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : false  #  inside <init> method
         * (branch expression (line 197)) : true  #  inside <init> method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            doReturn(byteArray).when(keyCrypterMock).decrypt(encryptedDataMock, aesKeyMock);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            byteUtils.when(() -> ByteUtils.bytesToBigInteger(byteArray)).thenReturn(new BigInteger("1"));
            eCKey.when(() -> ECKey.publicPointFromPrivate(new BigInteger("1"))).thenReturn(eCPointMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray2, eCPointMock2, false, new BigInteger("-1"), (DeterministicKey) null);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.decrypt(keyCrypterMock, aesKeyMock);
            //Assert statement(s)
            verify(keyCrypterMock).decrypt(encryptedDataMock, aesKeyMock);
            hDPath.verify(() -> HDPath.M(anyList()));
            byteUtils.verify(() -> ByteUtils.bytesToBigInteger(byteArray), atLeast(1));
            eCKey.verify(() -> ECKey.publicPointFromPrivate(new BigInteger("1")), atLeast(1));
        }
    }

    //Sapient generated method id: ${4a216aaa-8912-3af1-8696-40fb67c21bf8}, hash: 4F846C3CABA8337E67015F1F6CC1892B
    @Ignore()
    @Test()
    public void decrypt2WhenDefaultBranchAndDefaultBranchAndDefaultBranchAndDefaultBranchAndDefaultBranchThrowsIllegalArgumentException() throws KeyCrypterException {
        /* Branches:
         * (this.keyCrypter != null) : false
         * (encryptedPrivateKey != null) : true  #  inside findOrDeriveEncryptedPrivateKey method
         * (decryptedKey.length != 32) : false  #  inside findOrDeriveEncryptedPrivateKey method
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : false  #  inside <init> method
         * (branch expression (line 197)) : false  #  inside <init> method
         * (branch expression (line 96)) : false  #  inside <init> method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(keyCrypterMock).decrypt(encryptedDataMock, aesKeyMock);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            byteUtils.when(() -> ByteUtils.bytesToBigInteger(byteArray)).thenReturn(new BigInteger("0"));
            eCKey.when(() -> ECKey.publicPointFromPrivate(new BigInteger("0"))).thenReturn(eCPointMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray2, eCPointMock2, false, new BigInteger("0"), (DeterministicKey) null);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.decrypt(keyCrypterMock, aesKeyMock);
            //Assert statement(s)
            verify(keyCrypterMock).decrypt(encryptedDataMock, aesKeyMock);
            hDPath.verify(() -> HDPath.M(anyList()));
            byteUtils.verify(() -> ByteUtils.bytesToBigInteger(byteArray), atLeast(1));
            eCKey.verify(() -> ECKey.publicPointFromPrivate(new BigInteger("0")), atLeast(1));
        }
    }

    //Sapient generated method id: ${1513f1b5-9971-35f8-8809-94ebe05701c7}, hash: 7846DB97EE41E13AC892FCAD104FF5B1
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
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: key
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            doReturn(byteArray).when(keyCrypterMock).decrypt(encryptedDataMock, aesKeyMock);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            eCKey.when(() -> ECKey.publicPointFromPrivate(new BigInteger("0"))).thenReturn(eCPointMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray2, eCPointMock2, false, new BigInteger("0"), (DeterministicKey) null);
            KeyCrypterException.PublicPrivateMismatch keyCrypterExceptionPublicPrivateMismatch = new KeyCrypterException.PublicPrivateMismatch("Provided AES key is wrong");
            thrown.expect(KeyCrypterException.PublicPrivateMismatch.class);
            thrown.expectMessage(keyCrypterExceptionPublicPrivateMismatch.getMessage());
            //Act Statement(s)
            target.decrypt(keyCrypterMock, aesKeyMock);
            //Assert statement(s)
            verify(keyCrypterMock).decrypt(encryptedDataMock, aesKeyMock);
            hDPath.verify(() -> HDPath.M(anyList()));
            eCKey.verify(() -> ECKey.publicPointFromPrivate(new BigInteger("0")), atLeast(1));
        }
    }

    //Sapient generated method id: ${b505da70-c617-32a4-8e03-9f1051da2f5a}, hash: 066349E032186BC40E719A296AA0FBAE
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
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: key
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            doReturn(byteArray).when(keyCrypterMock).decrypt(encryptedDataMock, aesKeyMock);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            eCKey.when(() -> ECKey.publicPointFromPrivate(new BigInteger("1780731860627700044960722568376592200742329637303199754547598369979440671"))).thenReturn(eCPointMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray2, eCPointMock2, false, new BigInteger("-1"), (DeterministicKey) null));
            Instant instant = (Instant) Instant.ofEpochSecond(1700000000);
            doReturn(Optional.of(instant)).when(target).creationTime();
            //Act Statement(s)
            DeterministicKey result = target.decrypt(keyCrypterMock, aesKeyMock);
            byte[] byteArray3 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey deterministicKey = new DeterministicKey(childNumberPathMock, byteArray3, new BigInteger("1780731860627700044960722568376592200742329637303199754547598369979440671"), (DeterministicKey) null);
            deterministicKey.setCreationTime(instant);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKey));
            verify(keyCrypterMock).decrypt(encryptedDataMock, aesKeyMock);
            hDPath.verify(() -> HDPath.M(anyList()));
            eCKey.verify(() -> ECKey.publicPointFromPrivate(new BigInteger("1780731860627700044960722568376592200742329637303199754547598369979440671")), atLeast(1));
            verify(target).creationTime();
        }
    }

    //Sapient generated method id: ${00ec26ac-e5cf-3fc0-87e7-850c83969b40}, hash: 65D206D48DCC0BEB4B8424AE8EF07C80
    @Ignore()
    @Test()
    public void decrypt2WhenCreationTimeNotIsPresent() throws KeyCrypterException {
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
         * (creationTime.isPresent()) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: key
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            doReturn(byteArray).when(keyCrypterMock).decrypt(encryptedDataMock, aesKeyMock);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            eCKey.when(() -> ECKey.publicPointFromPrivate(new BigInteger("1780731860627700044960722568376592200742329637303199754547598369979440671"))).thenReturn(eCPointMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray2, eCPointMock2, false, new BigInteger("-1"), (DeterministicKey) null));
            doReturn(Optional.empty()).when(target).creationTime();
            //Act Statement(s)
            DeterministicKey result = target.decrypt(keyCrypterMock, aesKeyMock);
            byte[] byteArray3 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey deterministicKey = new DeterministicKey(childNumberPathMock, byteArray3, new BigInteger("1780731860627700044960722568376592200742329637303199754547598369979440671"), (DeterministicKey) null);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKey));
            verify(keyCrypterMock).decrypt(encryptedDataMock, aesKeyMock);
            hDPath.verify(() -> HDPath.M(anyList()));
            eCKey.verify(() -> ECKey.publicPointFromPrivate(new BigInteger("1780731860627700044960722568376592200742329637303199754547598369979440671")), atLeast(1));
            verify(target).creationTime();
        }
    }

    //Sapient generated method id: ${fbfe1094-0194-34e7-9c58-34466ad76411}, hash: C19BD1F3EC03DE72D779D6642A1F0794
    @Ignore()
    @Test()
    public void decrypt3WhenCrypterIsNullThrowsKeyCrypterException() throws KeyCrypterException {
        /* Branches:
         * (crypter == null) : true  #  inside decrypt method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("2"), (DeterministicKey) null);
            KeyCrypterException keyCrypterException = new KeyCrypterException("No key crypter available");
            thrown.expect(KeyCrypterException.class);
            thrown.expectMessage(keyCrypterException.getMessage());
            //Act Statement(s)
            target.decrypt(aesKeyMock);
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
        }
    }

    //Sapient generated method id: ${847078d9-f326-3656-881d-1fe9a0715edd}, hash: 7D4EEDA1AF15B3C87682C04232CAD7DA
    @Ignore()
    @Test()
    public void deriveTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDKeyDerivation> hDKeyDerivation = mockStatic(HDKeyDerivation.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("2"), (DeterministicKey) null);
            hDKeyDerivation.when(() -> HDKeyDerivation.deriveChildKey(eq(target), (ChildNumber) any())).thenReturn(deterministicKeyMock);
            //Act Statement(s)
            DeterministicKey result = target.derive(0);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyMock));
            hDPath.verify(() -> HDPath.M(anyList()));
            hDKeyDerivation.verify(() -> HDKeyDerivation.deriveChildKey(eq(target), (ChildNumber) any()));
        }
    }

    //Sapient generated method id: ${d70b0b85-2a0b-3905-9c82-0e0a249d77f9}, hash: BD848AC2338F63CE4B768C216CE515B0
    @Ignore()
    @Test()
    public void getPrivKeyWhenKeyIsNullThrowsIllegalStateException() {
        /* Branches:
         * (cursor != null) : true  #  inside findParentWithPrivKey method
         * (cursor.priv != null) : false  #  inside findParentWithPrivKey method
         * (cursor == null) : true  #  inside findOrDerivePrivateKey method
         * (key != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("2"), (DeterministicKey) null);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.getPrivKey();
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
        }
    }

    //Sapient generated method id: ${88872330-aedc-3e98-9771-21eab913eccc}, hash: 2017F6006117163E02EC50AA27FD6E33
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
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("0"), (DeterministicKey) null);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.getPrivKey();
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
        }
    }

    //Sapient generated method id: ${a5dad75b-1b58-32dc-b200-0bb269a0db3c}, hash: 72EB260C5A0F52D64ECC178024021DF8
    @Ignore()
    @Test()
    public void getPrivKeyWhenDefaultBranchAndDefaultBranchAndDefaultBranchThrowsIllegalArgumentException() {
        /* Branches:
         * (cursor != null) : true  #  inside findParentWithPrivKey method
         * (cursor.priv != null) : true  #  inside findParentWithPrivKey method
         * (cursor == null) : false  #  inside findOrDerivePrivateKey method
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : true  #  inside <init> method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("-1"), (DeterministicKey) null);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.getPrivKey();
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
        }
    }

    //Sapient generated method id: ${2caee99d-7301-39ad-b450-c24965cd5299}, hash: 972A55C27A0A95CD037C7ED202C5CB1D
    @Ignore()
    @Test()
    public void getPrivKeyWhenDefaultBranchAndDefaultBranchAndDefaultBranchAndDefaultBranchThrowsIllegalArgumentException() {
        /* Branches:
         * (cursor != null) : true  #  inside findParentWithPrivKey method
         * (cursor.priv != null) : true  #  inside findParentWithPrivKey method
         * (cursor == null) : false  #  inside findOrDerivePrivateKey method
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : false  #  inside <init> method
         * (branch expression (line 197)) : true  #  inside <init> method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            byte[] byteArray = new byte[]{(byte) 0};
            byteUtils.when(() -> ByteUtils.bytesToBigInteger(byteArray)).thenReturn(new BigInteger("1"));
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray2, eCPointMock, false, new BigInteger("-1"), (DeterministicKey) null);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.getPrivKey();
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
            byteUtils.verify(() -> ByteUtils.bytesToBigInteger(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${52a056a3-2898-3bba-898f-b12c34481588}, hash: 52830F158A63661872BA817B8CBDFEFF
    @Ignore()
    @Test()
    public void getPrivKeyWhenDefaultBranchAndDefaultBranchAndDefaultBranchAndDefaultBranchAndDefaultBranThrowsIllegalArgumentException() {
        /* Branches:
         * (cursor != null) : true  #  inside findParentWithPrivKey method
         * (cursor.priv != null) : true  #  inside findParentWithPrivKey method
         * (cursor == null) : false  #  inside findOrDerivePrivateKey method
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : false  #  inside <init> method
         * (branch expression (line 197)) : false  #  inside <init> method
         * (branch expression (line 73)) : false  #  inside <init> method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("-1"), (DeterministicKey) null);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.getPrivKey();
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
        }
    }

    //Sapient generated method id: ${b3f60b5e-8468-35b3-a413-8c911c105b9f}, hash: E2D9C1A5EDB31DAF8E1323711D9D3E68
    @Ignore()
    @Test()
    public void getPrivKeyWhenDefaultBranchAndPathIsEmptyThrowsNullPointerException() {
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
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            hDPath.when(() -> HDPath.M(hDPathMock2)).thenReturn(hDPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("-1"), (DeterministicKey) null);
            doReturn(0).when(hDPathMock).size();
            List<ChildNumber> childNumberList2 = new ArrayList<>();
            doReturn(childNumberList2).when(hDPathMock).subList(0, 0);
            thrown.expect(NullPointerException.class);
            //Act Statement(s)
            target.getPrivKey();
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
            hDPath.verify(() -> HDPath.M(hDPathMock2), atLeast(1));
            verify(hDPathMock).size();
            verify(hDPathMock).subList(0, 0);
        }
    }

    //Sapient generated method id: ${09233690-6010-3284-a1eb-8c6a00b334f2}, hash: 35A2CEF03B0D709AF3338734A8B13A82
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
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDKeyDerivation> hDKeyDerivation = mockStatic(HDKeyDerivation.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            hDPath.when(() -> HDPath.M(hDPathMock2)).thenReturn(hDPathMock);
            hDKeyDerivation.when(() -> HDKeyDerivation.deriveChildKey((DeterministicKey) any(), eq(childNumberMock))).thenReturn(deterministicKeyMock);
            doReturn(lazyECPointMock).when(publicAsPointMock).compress();
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("-1"), (DeterministicKey) null);
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
            hDPath.verify(() -> HDPath.M(hDPathMock2), atLeast(1));
            hDKeyDerivation.verify(() -> HDKeyDerivation.deriveChildKey((DeterministicKey) any(), eq(childNumberMock)));
            verify(publicAsPointMock).compress();
            verify(hDPathMock).size();
            verify(hDPathMock).subList(0, 0);
        }
    }

    //Sapient generated method id: ${dc20b40d-cb2f-3fcb-ae09-5d64dac11a44}, hash: F928A2D09FD1A09BEFCC70DE29526646
    @Ignore()
    @Test()
    public void getPrivKeyWhenKeyIsNotNull() {
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
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDKeyDerivation> hDKeyDerivation = mockStatic(HDKeyDerivation.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            hDPath.when(() -> HDPath.M(hDPathMock2)).thenReturn(hDPathMock);
            hDKeyDerivation.when(() -> HDKeyDerivation.deriveChildKey((DeterministicKey) any(), eq(childNumberMock))).thenReturn(deterministicKeyMock);
            doReturn(lazyECPointMock).when(publicAsPointMock).compress();
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("-1"), (DeterministicKey) null);
            doReturn(0).when(hDPathMock).size();
            List<ChildNumber> childNumberList2 = new ArrayList<>();
            childNumberList2.add(childNumberMock);
            doReturn(childNumberList2).when(hDPathMock).subList(0, 0);
            //Act Statement(s)
            BigInteger result = target.getPrivKey();
            //Assert statement(s)
            assertThat(result, equalTo(new BigInteger("0")));
            hDPath.verify(() -> HDPath.M(anyList()));
            hDPath.verify(() -> HDPath.M(hDPathMock2), atLeast(1));
            hDKeyDerivation.verify(() -> HDKeyDerivation.deriveChildKey((DeterministicKey) any(), eq(childNumberMock)));
            verify(publicAsPointMock).compress();
            verify(hDPathMock).size();
            verify(hDPathMock).subList(0, 0);
        }
    }

    //Sapient generated method id: ${5c819420-c4fe-3a6c-840e-63dc3657902b}, hash: 0D594B2F66F60F03F16D6AFE73E941FD
    @Ignore()
    @Test()
    public void serializeWhenSerPositionEquals78() {
        /* Branches:
         * (outputScriptType == ScriptType.P2PKH) : true  #  inside serialize method
         * (pub) : true  #  inside serialize method
         * (pub) : true  #  inside serialize method
         * (ser.position() == 78) : true  #  inside serialize method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
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
            //Assert statement(s)
            assertThat(result.length, equalTo(0));
            hDPath.verify(() -> HDPath.M(anyList()));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(networkParametersMock).getBip32HeaderP2PKHpub();
            verify(target).getChildNumber();
            verify(childNumberMock).i();
        }
    }

    //Sapient generated method id: ${01b3f761-641d-3b74-927c-1c38b8838cc0}, hash: FC9232D7C6B84729291FDC90FD139FFB
    @Ignore()
    @Test()
    public void serializeWhenNotPubAndSerPositionNotEquals78ThrowsIllegalStateException() {
        /* Branches:
         * (outputScriptType == ScriptType.P2PKH) : true  #  inside serialize method
         * (pub) : false  #  inside serialize method
         * (pub) : false  #  inside serialize method
         * (ser.position() == 78) : false  #  inside serialize method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            doReturn(-1).when(networkParametersMock).getBip32HeaderP2PKHpriv();
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("-1"), (DeterministicKey) null));
            doReturn(childNumberMock).when(target).getChildNumber();
            doReturn(-1).when(childNumberMock).i();
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(target).getPrivKeyBytes33();
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.serialize(networkMock, false);
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(networkParametersMock).getBip32HeaderP2PKHpriv();
            verify(target).getChildNumber();
            verify(childNumberMock).i();
            verify(target).getPrivKeyBytes33();
        }
    }

    //Sapient generated method id: ${aa3027ac-8bca-34c8-a436-b48f639f992a}, hash: BA0AB7F2089F933D5986AECCB75EC6CC
    @Ignore()
    @Test()
    public void serialize1Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            doReturn(networkMock).when(paramsMock).network();
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("2"), (DeterministicKey) null));
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

    //Sapient generated method id: ${5270cd42-0abd-3719-974f-f1a809e80363}, hash: 6D9E940FF78D090F49B44A2409CF9D57
    @Ignore()
    @Test()
    public void serializePubB58WhenOutputScriptTypeNotEqualsScriptTypeP2WPKHThrowsIllegalStateException() {
        /* Branches:
         * (outputScriptType == ScriptType.P2PKH) : false  #  inside serialize method
         * (outputScriptType == ScriptType.P2WPKH) : false  #  inside serialize method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("-1"), (DeterministicKey) null);
            IllegalStateException illegalStateException = new IllegalStateException("P2PK");
            thrown.expect(IllegalStateException.class);
            thrown.expectMessage(illegalStateException.getMessage());
            //Act Statement(s)
            target.serializePubB58(networkMock, ScriptType.P2PK);
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${c41d249c-c7a6-3137-9e43-53666f28382a}, hash: 183503ED1BB6136A8A0CF952915DAF02
    @Ignore()
    @Test()
    public void serializePubB58WhenSerPositionNotEquals78ThrowsIllegalStateException() {
        /* Branches:
         * (outputScriptType == ScriptType.P2PKH) : true  #  inside serialize method
         * (pub) : true  #  inside serialize method
         * (pub) : true  #  inside serialize method
         * (ser.position() == 78) : false  #  inside serialize method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            doReturn(-1).when(networkParametersMock).getBip32HeaderP2PKHpub();
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("-1"), (DeterministicKey) null));
            doReturn(childNumberMock).when(target).getChildNumber();
            doReturn(-1).when(childNumberMock).i();
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.serializePubB58(networkMock, ScriptType.P2PKH);
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(networkParametersMock).getBip32HeaderP2PKHpub();
            verify(target).getChildNumber();
            verify(childNumberMock).i();
        }
    }

    //Sapient generated method id: ${14f23686-a716-3257-8f67-def07a543220}, hash: 3B1174DE9C7531C0C761F7B651B60D0F
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
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
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
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray2, eCPointMock, false, new BigInteger("0"), (DeterministicKey) null));
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

    //Sapient generated method id: ${ddf64fa1-8426-3847-8c40-1aab6c039588}, hash: 3C88266EFAE6165C60DC2A4B16026EC0
    @Ignore()
    @Test()
    public void serializePubB581Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            doReturn(networkMock).when(paramsMock).network();
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("2"), (DeterministicKey) null));
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

    //Sapient generated method id: ${abcffc8b-d3c7-34ca-8c22-45dc7b23ecc4}, hash: 0E7D5E4DD5E2F861D82FEB1F1F218502
    @Ignore()
    @Test()
    public void serializePrivB58WhenOutputScriptTypeNotEqualsScriptTypeP2WPKHThrowsIllegalStateException() {
        /* Branches:
         * (outputScriptType == ScriptType.P2PKH) : false  #  inside serialize method
         * (outputScriptType == ScriptType.P2WPKH) : false  #  inside serialize method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("-1"), (DeterministicKey) null);
            IllegalStateException illegalStateException = new IllegalStateException("P2PK");
            thrown.expect(IllegalStateException.class);
            thrown.expectMessage(illegalStateException.getMessage());
            //Act Statement(s)
            target.serializePrivB58(networkMock, ScriptType.P2PK);
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${1262055f-efa7-3f2b-a871-618f266af6f7}, hash: 080CA2A4573BFFA61622266B5D7AA1A0
    @Ignore()
    @Test()
    public void serializePrivB58WhenSerPositionNotEquals78ThrowsIllegalStateException() {
        /* Branches:
         * (outputScriptType == ScriptType.P2PKH) : true  #  inside serialize method
         * (pub) : false  #  inside serialize method
         * (pub) : false  #  inside serialize method
         * (ser.position() == 78) : false  #  inside serialize method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            doReturn(-1).when(networkParametersMock).getBip32HeaderP2PKHpriv();
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("-1"), (DeterministicKey) null));
            doReturn(childNumberMock).when(target).getChildNumber();
            doReturn(-1).when(childNumberMock).i();
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(target).getPrivKeyBytes33();
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.serializePrivB58(networkMock, ScriptType.P2PKH);
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(networkParametersMock).getBip32HeaderP2PKHpriv();
            verify(target).getChildNumber();
            verify(childNumberMock).i();
            verify(target).getPrivKeyBytes33();
        }
    }

    //Sapient generated method id: ${1a9aa3f0-1a6e-303c-bc2f-8b870cab3e48}, hash: 2C627F6F387EA3D16162FC60FC10B20B
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
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
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
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray2, eCPointMock, false, new BigInteger("0"), (DeterministicKey) null));
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

    //Sapient generated method id: ${fbc8a622-9415-3e51-98c6-3f907b743939}, hash: 71CE56726D322E02FB19EFBA391ABC41
    @Ignore()
    @Test()
    public void serializePrivB581Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            doReturn(networkMock).when(paramsMock).network();
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("2"), (DeterministicKey) null));
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

    //Sapient generated method id: ${da12a1c0-a7c5-3eed-bd88-5066c045434e}, hash: 0F55D60391FCCBF4A429E786733868DC
    @Ignore()
    @Test()
    public void serializePubB582Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKey> deterministicKey = mockStatic(DeterministicKey.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            byte[] byteArray = new byte[]{};
            deterministicKey.when(() -> DeterministicKey.toBase58(byteArray)).thenReturn("return_of_toBase58");
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray2, eCPointMock, false, new BigInteger("2"), (DeterministicKey) null));
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

    //Sapient generated method id: ${39a7af40-75ac-36d7-994f-2851f88810ce}, hash: F47A0058D3516D13E91C90C3A0A7DC73
    @Ignore()
    @Test()
    public void serializePubB583Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            doReturn(networkMock).when(paramsMock).network();
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("2"), (DeterministicKey) null));
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

    //Sapient generated method id: ${2335c8fa-0740-3487-859b-492a9ea59d39}, hash: 87EA030A045D8A71D95AE01594676B3F
    @Ignore()
    @Test()
    public void serializePrivB582Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKey> deterministicKey = mockStatic(DeterministicKey.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            byte[] byteArray = new byte[]{};
            deterministicKey.when(() -> DeterministicKey.toBase58(byteArray)).thenReturn("return_of_toBase58");
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray2, eCPointMock, false, new BigInteger("2"), (DeterministicKey) null));
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

    //Sapient generated method id: ${e4c277b6-7bd7-3193-a96a-ba848319fee0}, hash: A8A405B2075AAC332A16FCDE93B0CCFA
    @Ignore()
    @Test()
    public void serializePrivB583Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            doReturn(networkMock).when(paramsMock).network();
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("2"), (DeterministicKey) null));
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

    //Sapient generated method id: ${46194f1b-99a4-3203-97b3-9dfd7f9bcf1d}, hash: 1AB8DF63F2E473DF6FC40BEB2A2EC675
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

    //Sapient generated method id: ${df176e4d-2ab9-335d-8be1-04640f184382}, hash: AD7BEC82DD0B0A2831777E2C59A6D054
    @Test()
    public void deserializeB58Test() {
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

    //Sapient generated method id: ${b7e9bbc0-a290-3b4c-9f2c-065fb8175da7}, hash: 7A262E1167FFAEDE0D633B6C7820BBB7
    @Test()
    public void deserializeB581Test() {
        //Arrange Statement(s)
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

    //Sapient generated method id: ${4d0cd708-afd2-30b1-8b99-c94751907f20}, hash: 214E2592A559C0C363348DDC18134C27
    @Test()
    public void deserializeB582Test() {
        //Arrange Statement(s)
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

    //Sapient generated method id: ${1f55c6b1-ea91-3812-8c46-dbf3f95f5141}, hash: FA9AFBFCD64FA221A19EFCB52DE3F4C7
    @Test()
    public void deserializeB583Test() {
        //Arrange Statement(s)
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

    //Sapient generated method id: ${9d317733-e6d7-3927-8baa-83a51bcd6892}, hash: ABA44BA2041FF0544FEBC9C072AC2FCD
    @Test()
    public void deserializeTest() {
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKey> deterministicKey = mockStatic(DeterministicKey.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            deterministicKey.when(() -> DeterministicKey.deserialize(networkMock, byteArray, (DeterministicKey) null)).thenReturn(parentMock);
            //Act Statement(s)
            DeterministicKey result = DeterministicKey.deserialize(networkMock, byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(parentMock));
            deterministicKey.verify(() -> DeterministicKey.deserialize(networkMock, byteArray, (DeterministicKey) null), atLeast(1));
        }
    }

    //Sapient generated method id: ${48f153f8-9f5d-3f80-9a15-fb1715c8b9da}, hash: 18D01927223FC48FD6AA2FDDC78F9B82
    @Test()
    public void deserialize1Test() {
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKey> deterministicKey = mockStatic(DeterministicKey.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock).when(paramsMock).network();
            byte[] byteArray = new byte[]{};
            deterministicKey.when(() -> DeterministicKey.deserialize(networkMock, byteArray)).thenReturn(parentMock);
            //Act Statement(s)
            DeterministicKey result = DeterministicKey.deserialize(paramsMock, byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(parentMock));
            verify(paramsMock, atLeast(1)).network();
            deterministicKey.verify(() -> DeterministicKey.deserialize(networkMock, byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${1d3af5bb-8767-3f8d-bd56-649b58d56d0f}, hash: 84CFF2EE2CC6F2E46C5FE76F67B3E3E6
    @Test()
    public void deserialize2WhenNotPubThrowsIllegalArgumentException() {
        /* Branches:
         * (header == params.getBip32HeaderP2PKHpub()) : false
         * (header == params.getBip32HeaderP2WPKHpub()) : false
         * (header == params.getBip32HeaderP2PKHpriv()) : false
         * (header == params.getBip32HeaderP2WPKHpriv()) : false
         * (!(pub || priv)) : true
         * (pub) : false
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "mainnet");
        try (MockedStatic<DeterministicKey> deterministicKey = mockStatic(DeterministicKey.class, CALLS_REAL_METHODS);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            doReturn(76067358).when(networkParametersMock).getBip32HeaderP2PKHpub();
            doReturn(76067358).when(networkParametersMock).getBip32HeaderP2WPKHpub();
            doReturn(76066276).when(networkParametersMock).getBip32HeaderP2PKHpriv();
            doReturn(76066276).when(networkParametersMock).getBip32HeaderP2WPKHpriv();
            byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5};
            deterministicKey.when(() -> DeterministicKey.toBase58(byteArray)).thenReturn("string");
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unknown header bytes: stri");
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

    //Sapient generated method id: ${891ad14d-c259-3f54-94ac-e96b8d6190ec}, hash: 5E3B2643C92FC1A5ED456C99940876E3
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

    //Sapient generated method id: ${7a5f1d1c-b6fc-3997-a6db-3a1276672ed2}, hash: 7278C8394FAB1E548CB282FFC2CCC085
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

    //Sapient generated method id: ${4dbfdd22-45b1-3573-bcc2-6633cf68a6d8}, hash: 383A7D7FD26F1354FA659E90CC2A5FE9
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

    //Sapient generated method id: ${50d9554d-0121-3111-a91c-f9d79ab5af78}, hash: 8BE08AB6210C85F3905F1049A8448FBF
    @Ignore()
    @Test()
    public void deserialize2WhenParentGetFingerprintEqualsParentFingerprintAndPathSizeEqualsDepthAndBuffeThrowsIllegalArgumentException() {
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
         * (!buffer.hasRemaining()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(0).when(parentMock).getFingerprint();
            doReturn(hDPathMock).when(parentMock).getPath();
            ChildNumber[] childNumberArray = new ChildNumber[]{};
            doReturn(hDPathMock2).when(hDPathMock).extend((ChildNumber) any(), eq(childNumberArray));
            doReturn(0).when(hDPathMock2).size();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            doReturn(0).when(networkParametersMock).getBip32HeaderP2PKHpub();
            doReturn(0).when(networkParametersMock).getBip32HeaderP2WPKHpub();
            doReturn(0).when(networkParametersMock).getBip32HeaderP2PKHpriv();
            doReturn(0).when(networkParametersMock).getBip32HeaderP2WPKHpriv();
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
        }
    }

    //Sapient generated method id: ${d94f6f2e-3e46-3e89-9e61-d2734873653f}, hash: EA7F16E371A8732EDF44B1BC96B3F658
    @Ignore()
    @Test()
    public void deserialize2WhenPubAndDefaultBranchAndDefaultBranchAndParentFingerprintEquals0() {
        /* Branches:
         * (header == params.getBip32HeaderP2PKHpub()) : false
         * (header == params.getBip32HeaderP2WPKHpub()) : true
         * (header == params.getBip32HeaderP2PKHpriv()) : false
         * (header == params.getBip32HeaderP2WPKHpriv()) : true
         * (!(pub || priv)) : false
         * (parent != null) : false
         * (depth >= 1) : false
         * (!buffer.hasRemaining()) : true
         * (pub) : true
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 143)) : false  #  inside <init> method
         * (parentFingerprint != 0) : false  #  inside ascertainParentFingerprint method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class, CALLS_REAL_METHODS);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            doReturn(0).when(networkParametersMock).getBip32HeaderP2PKHpub();
            doReturn(1).when(networkParametersMock).getBip32HeaderP2WPKHpub();
            doReturn(0).when(networkParametersMock).getBip32HeaderP2PKHpriv();
            doReturn(1).when(networkParametersMock).getBip32HeaderP2WPKHpriv();
            List<ChildNumber> childNumberList = new ArrayList<>();
            HDPath hDPath2 = HDPath.M(childNumberList);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(hDPath2);
            byte[] byteArray = new byte[]{(byte) 0};
            DeterministicKey deterministicKey = null;
            //Act Statement(s)
            DeterministicKey result = DeterministicKey.deserialize(networkMock, byteArray, deterministicKey);
            HDPath hDPath3 = HDPath.M();
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            ECDomainParameters eCDomainParameters = ECKey.CURVE;
            ECCurve eCCurve = eCDomainParameters.getCurve();
            byte[] byteArray3 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            LazyECPoint lazyECPoint = new LazyECPoint(eCCurve, byteArray3);
            DeterministicKey deterministicKey2 = new DeterministicKey(hDPath3, byteArray2, lazyECPoint, (DeterministicKey) null, 0, 0);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKey2));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2PKHpub();
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2WPKHpub();
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2PKHpriv();
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2WPKHpriv();
            hDPath.verify(() -> HDPath.M(anyList()), atLeast(1));
        }
    }

    //Sapient generated method id: ${1b2675cc-fbf8-3da2-acb7-de5676b65c52}, hash: E59BE7F9738920845F94728B2BD4F182
    @Ignore()
    @Test()
    public void deserialize2WhenDefaultBranchAndDefaultBranchAndDefaultBranchThrowsIllegalArgumentException() {
        /* Branches:
         * (header == params.getBip32HeaderP2PKHpub()) : false
         * (header == params.getBip32HeaderP2WPKHpub()) : false
         * (header == params.getBip32HeaderP2PKHpriv()) : false
         * (header == params.getBip32HeaderP2WPKHpriv()) : true
         * (!(pub || priv)) : true
         * (pub) : true
         * (parent != null) : false
         * (depth >= 1) : true
         * (!buffer.hasRemaining()) : true
         * (pub) : false
         * (branch expression (line 190)) : false  #  inside <init> method
         * (branch expression (line 191)) : false  #  inside <init> method
         * (branch expression (line 196)) : true  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParametersMock = mock(NetworkParameters.class, "testnet");
        Network networkMock = mock(Network.class, "testnet");
        HDPath hDPathMock = mock(HDPath.class, "0");
        ECPoint eCPointMock = mock(ECPoint.class, "04");
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            doReturn(2).when(networkParametersMock).getBip32HeaderP2PKHpub();
            doReturn(1).when(networkParametersMock).getBip32HeaderP2WPKHpub();
            doReturn(0).when(networkParametersMock).getBip32HeaderP2PKHpriv();
            doReturn(3).when(networkParametersMock).getBip32HeaderP2WPKHpriv();
            hDPath.when(() -> HDPath.M((ChildNumber) any())).thenReturn(hDPathMock);
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            byteUtils.when(() -> ByteUtils.bytesToBigInteger(byteArray)).thenReturn(new BigInteger("0"));
            eCKey.when(() -> ECKey.publicPointFromPrivate(new BigInteger("0"))).thenReturn(eCPointMock);
            thrown.expect(IllegalArgumentException.class);
            byte[] byteArray2 = new byte[]{(byte) 0};
            DeterministicKey deterministicKey = null;
            //Act Statement(s)
            DeterministicKey.deserialize(networkMock, byteArray2, deterministicKey);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(networkParametersMock).getBip32HeaderP2PKHpub();
            verify(networkParametersMock).getBip32HeaderP2WPKHpub();
            verify(networkParametersMock).getBip32HeaderP2PKHpriv();
            verify(networkParametersMock).getBip32HeaderP2WPKHpriv();
            hDPath.verify(() -> HDPath.M((ChildNumber) any()));
            byteUtils.verify(() -> ByteUtils.bytesToBigInteger(byteArray), atLeast(1));
            eCKey.verify(() -> ECKey.publicPointFromPrivate(new BigInteger("0")), atLeast(1));
        }
    }

    //Sapient generated method id: ${2968645b-d35f-31ba-856c-9f7ba5e8cc3f}, hash: 833F4DB22617FAA3AE4E24759604EF59
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
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
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
            hDPath.when(() -> HDPath.M(hDPathMock2)).thenReturn(childNumberPathMock);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            DeterministicKey result = DeterministicKey.deserialize(networkMock, byteArray, parentMock);
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            ECDomainParameters eCDomainParameters = ECKey.CURVE;
            ECCurve eCCurve = eCDomainParameters.getCurve();
            byte[] byteArray3 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            LazyECPoint lazyECPoint = new LazyECPoint(eCCurve, byteArray3);
            DeterministicKey deterministicKey = new DeterministicKey(hDPathMock2, byteArray2, lazyECPoint, parentMock, 1, 1);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKey));
            verify(parentMock, atLeast(2)).getFingerprint();
            verify(parentMock, atLeast(1)).getPath();
            verify(hDPathMock).extend((ChildNumber) any(), eq(childNumberArray));
            verify(hDPathMock2, atLeast(1)).size();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(networkParametersMock).getBip32HeaderP2PKHpub();
            verify(networkParametersMock).getBip32HeaderP2WPKHpub();
            verify(networkParametersMock).getBip32HeaderP2PKHpriv();
            verify(networkParametersMock).getBip32HeaderP2WPKHpriv();
            hDPath.verify(() -> HDPath.M(hDPathMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${1dbe3783-3603-3163-82fe-7ae1850246e0}, hash: CF0966DC20419FD2AFD5B119AF6C3B9E
    @Ignore()
    @Test()
    public void deserialize2WhenParentFingerprintNotEquals0AndParentIsNotNullAndParentGetFingerprintNotEqThrowsIllegalArgumentException() {
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
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
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
            hDPath.when(() -> HDPath.M(hDPathMock2)).thenReturn(childNumberPathMock);
            doReturn(2, 1).when(parentMock).getFingerprint();
            thrown.expect(IllegalArgumentException.class);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            DeterministicKey.deserialize(networkMock, byteArray, parentMock);
            //Assert statement(s)
            verify(parentMock, times(2)).getFingerprint();
            verify(parentMock).getPath();
            verify(hDPathMock).extend((ChildNumber) any(), eq(childNumberArray));
            verify(hDPathMock2).size();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(networkParametersMock).getBip32HeaderP2PKHpub();
            verify(networkParametersMock).getBip32HeaderP2WPKHpub();
            verify(networkParametersMock).getBip32HeaderP2PKHpriv();
            verify(networkParametersMock).getBip32HeaderP2WPKHpriv();
            hDPath.verify(() -> HDPath.M(hDPathMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${7c5a079f-33a1-3a9e-99d6-7818f6a4d2f6}, hash: 1DD63B9E77B1582CAF840D1F940A5304
    @Test()
    public void deserialize3Test() {
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKey> deterministicKey = mockStatic(DeterministicKey.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock).when(paramsMock).network();
            byte[] byteArray = new byte[]{};
            deterministicKey.when(() -> DeterministicKey.deserialize(networkMock, byteArray, parentMock)).thenReturn(deterministicKeyMock);
            //Act Statement(s)
            DeterministicKey result = DeterministicKey.deserialize(paramsMock, byteArray, parentMock);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyMock));
            verify(paramsMock, atLeast(1)).network();
            deterministicKey.verify(() -> DeterministicKey.deserialize(networkMock, byteArray, parentMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${d097ba19-f4f3-3c41-9f52-c335e6afd28b}, hash: 93DBF6C592B757990C245D2A3B15D7C2
    @Ignore()
    @Test()
    public void creationTimeWhenParentIsNull() {
        /* Branches:
         * (parent != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("2"), (DeterministicKey) null);
            //Act Statement(s)
            Optional<Instant> result = target.creationTime();
            Optional<Instant> instantOptional = Optional.empty();
            //Assert statement(s)
            assertThat(result, equalTo(instantOptional));
            hDPath.verify(() -> HDPath.M(anyList()));
        }
    }

    //Sapient generated method id: ${2ad6838f-648f-3a8d-8531-a16ed6db9db7}, hash: 148E1E8F88E1E5FC69C9DD87168E8528
    @Ignore()
    @Test()
    public void setCreationTimeWhenParentIsNull() {
        /* Branches:
         * (parent != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("2"), (DeterministicKey) null);
            Instant instant = Instant.ofEpochSecond(1700000000);
            //Act Statement(s)
            target.setCreationTime(instant);
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
        }
    }

    //Sapient generated method id: ${b7f79d32-a23e-3b5a-9d0d-3ef21424e43c}, hash: 3AA8821EFF991609798B7AAD02A95831
    @Ignore()
    @Test()
    public void clearCreationTimeWhenParentIsNull() {
        /* Branches:
         * (parent != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("2"), (DeterministicKey) null);
            //Act Statement(s)
            target.clearCreationTime();
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
        }
    }

    //Sapient generated method id: ${aab7b3ee-0703-3aca-9aba-6676b7a750b3}, hash: 284179B5960B7FB282FBEFD853067885
    @Ignore()
    @Test()
    public void setCreationTimeSecondsWhenCreationTimeSecsGreaterThan0() {
        /* Branches:
         * (creationTimeSecs > 0) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("-1"), (DeterministicKey) null));
            doNothing().when(target).setCreationTime((Instant) any());
            //Act Statement(s)
            target.setCreationTimeSeconds(1L);
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
            verify(target).setCreationTime((Instant) any());
        }
    }

    //Sapient generated method id: ${bef4381a-288d-3155-9098-6a9016e3326b}, hash: C7323D2DD89E23EFEB2AAB5610728490
    @Ignore()
    @Test()
    public void setCreationTimeSecondsWhenCreationTimeSecsEquals0() {
        /* Branches:
         * (creationTimeSecs > 0) : false
         * (creationTimeSecs == 0) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("-1"), (DeterministicKey) null));
            doNothing().when(target).clearCreationTime();
            //Act Statement(s)
            target.setCreationTimeSeconds(0L);
            //Assert statement(s)
            hDPath.verify(() -> HDPath.M(anyList()));
            verify(target).clearCreationTime();
        }
    }

    //Sapient generated method id: ${6efdfffb-ab76-3832-8528-819e02d958d6}, hash: E16B096FFC54442B4C7B315882630386
    @Ignore()
    @Test()
    public void setCreationTimeSecondsWhenCreationTimeSecsNotEquals0ThrowsIllegalArgumentException() {
        /* Branches:
         * (creationTimeSecs > 0) : false
         * (creationTimeSecs == 0) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
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
            hDPath.verify(() -> HDPath.M(anyList()));
        }
    }

    //Sapient generated method id: ${6c7dc047-c4d5-34bd-a75c-5721b506a290}, hash: 52C876A1CB29BE741E35AE9B65EEAA7C
    @Ignore()
    @Test()
    public void toStringWhenCreationTimeNotIsPresent() {
        /* Branches:
         * (!creationTime.isPresent()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: pub
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("2"), (DeterministicKey) null));
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

    //Sapient generated method id: ${62a3087a-76bb-3419-b424-41b0ba38daac}, hash: C493007E6B4BFDB135853D0D1828004E
    @Ignore()
    @Test()
    public void toStringWhenParentIsNull() {
        /* Branches:
         * (!creationTime.isPresent()) : false
         * (parent != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: pub
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("2"), (DeterministicKey) null));
            doReturn("return_of_getPathAsString1").when(target).getPathAsString();
            Instant instant = (Instant) Instant.ofEpochSecond(1700000000);
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

    //Sapient generated method id: ${6602eebf-c604-3dd3-9523-fef4c4c9c63e}, hash: 18A01FCD585BF19832B2C1F2394AA746
    @Ignore()
    @Test()
    public void formatKeyWithAddressWhenIncludePrivateKeys() {
        /* Branches:
         * (comment != null) : true
         * (includePrivateKeys) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Address addressMock = mock(Address.class, "formatKeyWithAddress_address1");
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("2"), (DeterministicKey) null));
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

    //Sapient generated method id: ${259a939d-4f14-3519-95b7-a716f1a53ce8}, hash: F8A33F4CB1C313857C8B746AC4E2A75C
    @Ignore()
    @Test()
    public void formatKeyWithAddress1Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: publicAsPoint - Method: compress
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class)) {
            doReturn(networkMock).when(paramsMock).network();
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(childNumberPathMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            DeterministicKey target = spy(new DeterministicKey(childNumberList, byteArray, eCPointMock, false, new BigInteger("2"), (DeterministicKey) null));
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
