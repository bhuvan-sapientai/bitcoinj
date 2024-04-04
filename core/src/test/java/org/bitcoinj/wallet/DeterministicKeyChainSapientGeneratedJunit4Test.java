package org.bitcoinj.wallet;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.mockito.InjectMocks;
import org.junit.After;
import org.junit.Test;
import org.bitcoinj.crypto.KeyCrypterException;
import org.bitcoinj.base.Network;
import org.bitcoinj.protobuf.wallet.Protos;
import org.bitcoinj.utils.Threading;
import org.mockito.MockitoAnnotations;
import org.bitcoinj.crypto.ECKey;
import org.bitcoinj.base.internal.ByteUtils;

import java.util.ArrayList;

import org.bitcoinj.crypto.KeyCrypter;
import org.bitcoinj.wallet.listeners.KeyChainEventListener;
import org.mockito.stubbing.Answer;
import org.bitcoinj.crypto.HDPath;
import org.bitcoinj.base.internal.Preconditions;
import org.bitcoinj.crypto.EncryptedData;
import org.bitcoinj.core.BloomFilter;
import org.bitcoinj.crypto.HDKeyDerivation;

import java.time.Instant;

import org.junit.rules.ExpectedException;

import java.util.List;

import org.bitcoinj.base.ScriptType;
import org.bitcoinj.crypto.DeterministicKey;
import org.bitcoinj.core.NetworkParameters;

import java.util.Optional;

import org.bitcoinj.crypto.DeterministicHierarchy;
import org.bitcoinj.crypto.AesKey;

import java.util.concurrent.Executor;

import org.bitcoinj.base.internal.TimeUtils;
import org.bitcoinj.base.internal.StreamUtils;
import org.bitcoinj.crypto.ChildNumber;
import com.google.protobuf.ByteString;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

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
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

public class DeterministicKeyChainSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final DeterministicHierarchy hierarchyMock = mock(DeterministicHierarchy.class, "hierarchy");

    private final DeterministicKey rootKeyMock = mock(DeterministicKey.class, "rootKey");

    private final DeterministicKey internalParentKeyMock = mock(DeterministicKey.class, "internalParentKey");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private DeterministicKeyChain target;

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    @After()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${ed212fe2-2afd-3617-872a-5724a1f34c1c}, hash: 6332784165D2369CC77D95803C3B8DD8
    @Test()
    public void builderTest() {
        //Act Statement(s)
        DeterministicKeyChain.Builder<?> result = DeterministicKeyChain.builder();
        //Assert statement(s)
        //TODO: Please implement equals method in Builder for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${a377c75a-5e17-3222-adbe-6e7d38993c02}, hash: 30B0ABAA17080621B79F94B86D8780FA
    @Ignore()
    @Test()
    public void getKeyTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = spy(new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<DeterministicKey> deterministicKeyList = new ArrayList<>();
            deterministicKeyList.add(deterministicKeyMock);
            doReturn(deterministicKeyList).when(target).getKeys(KeyChain.KeyPurpose.RECEIVE_FUNDS, 1);
            //Act Statement(s)
            DeterministicKey result = target.getKey(KeyChain.KeyPurpose.RECEIVE_FUNDS);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyMock));
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(target).getKeys(KeyChain.KeyPurpose.RECEIVE_FUNDS, 1);
        }
    }

    //Sapient generated method id: ${79d239ec-cbaa-3918-89d4-767bdc24e8a8}, hash: 0D924CD685DA14E7DE1862E7C7CDA2AC
    @Ignore()
    @Test()
    public void markKeyAsUsedWhenIssuedInternalKeysLessThanNumChildren() {
        /* Branches:
         * (k.getParent() == internalParentKey) : true
         * (issuedInternalKeys < numChildren) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey kMock = mock(DeterministicKey.class);
        ChildNumber childNumberMock = mock(ChildNumber.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(childNumberMock).when(kMock).getChildNumber();
            doReturn(0).when(childNumberMock).i();
            doReturn(deterministicKeyMock).when(kMock).getParent();
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = spy(new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).maybeLookAhead();
            //Act Statement(s)
            DeterministicKey result = target.markKeyAsUsed(kMock);
            //Assert statement(s)
            assertThat(result, equalTo(kMock));
            verify(kMock, atLeast(1)).getChildNumber();
            verify(childNumberMock).i();
            verify(kMock, atLeast(1)).getParent();
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(target).maybeLookAhead();
        }
    }

    //Sapient generated method id: ${7d8b3532-bf24-3e02-aeaf-66fc1baecb7c}, hash: 352E25BC7BF0E967947805F8913CE82F
    @Ignore()
    @Test()
    public void markKeyAsUsedWhenIssuedExternalKeysLessThanNumChildren() {
        /* Branches:
         * (k.getParent() == internalParentKey) : false
         * (k.getParent() == externalParentKey) : true
         * (issuedExternalKeys < numChildren) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey kMock = mock(DeterministicKey.class);
        ChildNumber childNumberMock = mock(ChildNumber.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock2 = mock(DeterministicKey.class);
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(childNumberMock).when(kMock).getChildNumber();
            doReturn(0).when(childNumberMock).i();
            doReturn(deterministicKeyMock, deterministicKeyMock2).when(kMock).getParent();
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = spy(new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).maybeLookAhead();
            //Act Statement(s)
            DeterministicKey result = target.markKeyAsUsed(kMock);
            //Assert statement(s)
            assertThat(result, equalTo(kMock));
            verify(kMock, atLeast(1)).getChildNumber();
            verify(childNumberMock).i();
            verify(kMock, atLeast(2)).getParent();
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(target).maybeLookAhead();
        }
    }

    //Sapient generated method id: ${44fa91be-011c-3f0c-ba05-2ff6bddb0b80}, hash: D80476FCD3EA5500AC6466CF573847B3
    @Ignore()
    @Test()
    public void findKeyFromPubHashTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            DeterministicKey result = target.findKeyFromPubHash(byteArray);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${f3262d68-f653-32db-9e91-cc2045869e94}, hash: 22510AD540EEBD7C79F142AD0E1A2866
    @Ignore()
    @Test()
    public void findKeyFromPubKeyTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            DeterministicKey result = target.findKeyFromPubKey(byteArray);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${7226b429-de80-355e-905e-1cd947aafff6}, hash: 11D6C8562890D94FACC23677B0A6E10D
    @Ignore()
    @Test()
    public void markPubHashAsUsedWhenKIsNotNull() {
        /* Branches:
         * (k != null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = spy(new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(deterministicKeyMock).when(target).markKeyAsUsed((DeterministicKey) null);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            DeterministicKey result = target.markPubHashAsUsed(byteArray);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(target).markKeyAsUsed((DeterministicKey) null);
        }
    }

    //Sapient generated method id: ${20841dbd-ee4e-316a-a7a2-aa55a2ea7e63}, hash: 2FDDA793B9B07CCA0878D20193A8D183
    @Ignore()
    @Test()
    public void markPubKeyAsUsedWhenKIsNotNull() {
        /* Branches:
         * (k != null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = spy(new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(deterministicKeyMock).when(target).markKeyAsUsed((DeterministicKey) null);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            DeterministicKey result = target.markPubKeyAsUsed(byteArray);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(target).markKeyAsUsed((DeterministicKey) null);
        }
    }

    //Sapient generated method id: ${1be1eb99-e43d-3b54-a57d-eaf9f09f9137}, hash: 803253E8DB02EF5995DD616A00B05756
    @Ignore()
    @Test()
    public void hasKeyWhenBasicKeyChainHasKeyKey() {
        /* Branches:
         * (basicKeyChain.hasKey(key)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        ECKey eCKeyMock = mock(ECKey.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.hasKey(eCKeyMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${16ee9860-a42b-3307-ba9f-33f80143aacd}, hash: 9719D8A5BEFBC69F719E59EBBD51E43E
    @Ignore()
    @Test()
    public void hasKeyWhenBasicKeyChainNotHasKeyKey() {
        /* Branches:
         * (basicKeyChain.hasKey(key)) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        ECKey eCKeyMock = mock(ECKey.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.hasKey(eCKeyMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${7fa8385f-b24a-3256-a524-6c5be821ba0f}, hash: 268475735C7CE26C39A7FF7DDF8C7C4F
    @Ignore()
    @Test()
    public void getKeyByPathTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        HDPath hDPathMock2 = mock(HDPath.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(hDPathMock2);
            target = spy(new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(deterministicKeyMock).when(target).getKeyByPath(hDPathMock2);
            ChildNumber[] childNumberArray = new ChildNumber[]{};
            //Act Statement(s)
            DeterministicKey result = target.getKeyByPath(childNumberArray);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyMock));
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            hDPath.verify(() -> HDPath.M(anyList()));
            verify(target).getKeyByPath(hDPathMock2);
        }
    }

    //Sapient generated method id: ${419ad45b-e3c6-3107-a625-e0e04b9e277f}, hash: B43E01D322B9E59AD10C5DBEF9430B5A
    @Ignore()
    @Test()
    public void getKeyByPath1Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock2 = mock(DeterministicKey.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ChildNumber childNumber = ChildNumber.ZERO;
            doReturn(deterministicKeyMock).when(hierarchyMock).deriveChild(hDPathMock, false, false, childNumber);
            ChildNumber childNumber2 = ChildNumber.ONE;
            doReturn(internalParentKeyMock).when(hierarchyMock).deriveChild(hDPathMock, false, false, childNumber2);
            List<ChildNumber> childNumberList = new ArrayList<>();
            doReturn(deterministicKeyMock2).when(hierarchyMock).get(childNumberList, false, false);
            //Act Statement(s)
            DeterministicKey result = target.getKeyByPath(childNumberList);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyMock2));
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(hierarchyMock).deriveChild(hDPathMock, false, false, childNumber);
            verify(hierarchyMock).deriveChild(hDPathMock, false, false, childNumber2);
            verify(hierarchyMock).get(childNumberList, false, false);
        }
    }

    //Sapient generated method id: ${7876f634-75e5-3b99-9201-7270dc8f844d}, hash: 9394A1C66DF1F3A21561F7955E005A95
    @Ignore()
    @Test()
    public void getKeyByPath2Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock2 = mock(DeterministicKey.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ChildNumber childNumber = ChildNumber.ZERO;
            doReturn(deterministicKeyMock).when(hierarchyMock).deriveChild(hDPathMock, false, false, childNumber);
            ChildNumber childNumber2 = ChildNumber.ONE;
            doReturn(internalParentKeyMock).when(hierarchyMock).deriveChild(hDPathMock, false, false, childNumber2);
            List<ChildNumber> childNumberList = new ArrayList<>();
            doReturn(deterministicKeyMock2).when(hierarchyMock).get(childNumberList, false, false);
            //Act Statement(s)
            DeterministicKey result = target.getKeyByPath(childNumberList, false);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyMock2));
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(hierarchyMock).deriveChild(hDPathMock, false, false, childNumber);
            verify(hierarchyMock).deriveChild(hDPathMock, false, false, childNumber2);
            verify(hierarchyMock).get(childNumberList, false, false);
        }
    }

    //Sapient generated method id: ${6deda3ec-4706-3e3d-a330-d4ead20687c2}, hash: 3E22DA713B6606DF8F22052885150553
    @Ignore()
    @Test()
    public void getWatchingKeyTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = spy(new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(deterministicKeyMock).when(target).getKeyByPath(hDPathMock);
            //Act Statement(s)
            DeterministicKey result = target.getWatchingKey();
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyMock));
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(target).getKeyByPath(hDPathMock);
        }
    }

    //Sapient generated method id: ${19d70003-1e49-3d4d-a4ab-856eba210b9c}, hash: 6D7D1055E19F4FC656FA61FF3818892C
    @Ignore()
    @Test()
    public void isWatchingWhenGetWatchingKeyIsWatching() {
        /* Branches:
         * (getWatchingKey().isWatching()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = spy(new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(deterministicKeyMock).when(target).getWatchingKey();
            doReturn(true).when(deterministicKeyMock).isWatching();
            //Act Statement(s)
            boolean result = target.isWatching();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(target).getWatchingKey();
            verify(deterministicKeyMock).isWatching();
        }
    }

    //Sapient generated method id: ${2f4e042a-a75d-3f80-8cca-4d50936f9576}, hash: F5D78EE215DFD36712433237E8F6E7EA
    @Ignore()
    @Test()
    public void isWatchingWhenGetWatchingKeyNotIsWatching() {
        /* Branches:
         * (getWatchingKey().isWatching()) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = spy(new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(deterministicKeyMock).when(target).getWatchingKey();
            doReturn(false).when(deterministicKeyMock).isWatching();
            //Act Statement(s)
            boolean result = target.isWatching();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(target).getWatchingKey();
            verify(deterministicKeyMock).isWatching();
        }
    }

    //Sapient generated method id: ${76299944-2002-360a-8bb8-28994d8ad5a4}, hash: BFE926AAB5D49AD6344B904BF97A6724
    @Ignore()
    @Test()
    public void numKeysTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = spy(new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).maybeLookAhead();
            //Act Statement(s)
            int result = target.numKeys();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(target).maybeLookAhead();
        }
    }

    //Sapient generated method id: ${744f8c65-f71f-3db2-b6c8-46ea8149154d}, hash: 59F929D02F26CFCA02C51E78666E5C78
    @Ignore()
    @Test()
    public void numLeafKeysIssuedTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            int result = target.numLeafKeysIssued();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${dc0588e1-d72e-347b-95e0-205cf7068cac}, hash: 4E08CC357D2182977E6C76CB5D43E29E
    @Ignore()
    @Test()
    public void earliestKeyCreationTimeWhenSeedIsNull() {
        /* Branches:
         * (seed != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = spy(new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(deterministicKeyMock).when(target).getWatchingKey();
            doReturn(Optional.empty()).when(deterministicKeyMock).creationTime();
            //Act Statement(s)
            Instant result = target.earliestKeyCreationTime();
            Instant instant = Instant.EPOCH;
            //Assert statement(s)
            assertThat(result, equalTo(instant));
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(target).getWatchingKey();
            verify(deterministicKeyMock).creationTime();
        }
    }

    //Sapient generated method id: ${0b160154-951e-3a14-95bd-e6793a7bce96}, hash: F29C8EE702C66F6C5559F4C8ECFE5401
    @Ignore()
    @Test()
    public void addEventListenerTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        KeyChainEventListener keyChainEventListenerMock = mock(KeyChainEventListener.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.addEventListener(keyChainEventListenerMock);
            //Assert statement(s)
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${283de23e-4782-3528-be05-a980b30b2663}, hash: DF41CB5F6814AE684AC44601489EF211
    @Ignore()
    @Test()
    public void addEventListener1Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        KeyChainEventListener keyChainEventListenerMock = mock(KeyChainEventListener.class);
        Executor executorMock = mock(Executor.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.addEventListener(keyChainEventListenerMock, executorMock);
            //Assert statement(s)
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${8e2dce89-458a-3d3c-9e43-a1613fe3000b}, hash: D0C33B18D209AA8AA55B8F6D313B8D30
    @Ignore()
    @Test()
    public void removeEventListenerWhenBasicKeyChainRemoveEventListenerListener() {
        /* Branches:
         * (basicKeyChain.removeEventListener(listener)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        KeyChainEventListener keyChainEventListenerMock = mock(KeyChainEventListener.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.removeEventListener(keyChainEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${43d19668-0bf6-3a5a-8031-a1dcd2ed2cd7}, hash: 21A6DB34C08989C0AF6071A0A6B273CA
    @Ignore()
    @Test()
    public void removeEventListenerWhenBasicKeyChainNotRemoveEventListenerListener() {
        /* Branches:
         * (basicKeyChain.removeEventListener(listener)) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        KeyChainEventListener keyChainEventListenerMock = mock(KeyChainEventListener.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.removeEventListener(keyChainEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${e594536a-f575-3049-bb93-017fb7b8ca2e}, hash: DB9C62DE3896867DA8DB98B576B8523A
    @Ignore()
    @Test()
    public void getMnemonicCodeWhenSeedIsNull() {
        /* Branches:
         * (seed == null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            List<String> result = target.getMnemonicCode();
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${16b1754a-bfdb-3aa3-bb73-83575a15fdd0}, hash: 8A8EEF4F8E06F2FD99F77AE8F32DDE5E
    @Ignore()
    @Test()
    public void serializeToProtobufTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = spy(new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            doReturn(protosKeyList).when(target).serializeMyselfToProtobuf();
            //Act Statement(s)
            List<Protos.Key> result = target.serializeToProtobuf();
            //Assert statement(s)
            assertThat(result, equalTo(protosKeyList));
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(target).serializeMyselfToProtobuf();
        }
    }

    //Sapient generated method id: ${db150eb7-eaf7-3b91-94a2-983595f0b600}, hash: 38D27828D1B35776908BA88FE3A6E716
    @Ignore()
    @Test()
    public void serializeMyselfToProtobufWhenKeyGetParentIsNotNull() {
        /* Branches:
         * (seed != null) : false
         * (for-each(keys.entrySet())) : true
         * (for-each(key.getPath())) : true
         * (key.equals(externalParentKey)) : true
         * (entries.isEmpty()) : true
         * (isFollowing()) : true
         * (key.getParent() != null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        ByteString byteStringMock = mock(ByteString.class);
        try (MockedStatic<ByteString> byteString = mockStatic(ByteString.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteStringMock);
            target = spy(new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(true).when(target).isFollowing();
            //Act Statement(s)
            List<Protos.Key> result = target.serializeMyselfToProtobuf();
            //Assert statement(s)
            assertThat(result.size(), equalTo(1));
            assertThat(result.get(0), is(instanceOf(Protos.Key.class)));
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            byteString.verify(() -> ByteString.copyFrom(byteArray), atLeast(1));
            verify(target).isFollowing();
        }
    }

    //Sapient generated method id: ${18235e8e-5a7c-3936-afac-8b6dba54d1a1}, hash: 949A9E665A71CD19273AA36C57372CD2
    @Ignore()
    @Test()
    public void serializeMyselfToProtobufWhenEntriesIsEmptyAndIsFollowingAndKeyGetParentIsNull() {
        /* Branches:
         * (seed != null) : false
         * (for-each(keys.entrySet())) : true
         * (for-each(key.getPath())) : true
         * (key.equals(externalParentKey)) : false
         * (key.equals(internalParentKey)) : true
         * (entries.isEmpty()) : true
         * (isFollowing()) : true
         * (key.getParent() != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        ByteString byteStringMock = mock(ByteString.class);
        try (MockedStatic<ByteString> byteString = mockStatic(ByteString.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteStringMock);
            target = spy(new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(true).when(target).isFollowing();
            //Act Statement(s)
            List<Protos.Key> result = target.serializeMyselfToProtobuf();
            //Assert statement(s)
            assertThat(result.size(), equalTo(1));
            assertThat(result.get(0), is(instanceOf(Protos.Key.class)));
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            byteString.verify(() -> ByteString.copyFrom(byteArray), atLeast(1));
            verify(target).isFollowing();
        }
    }

    //Sapient generated method id: ${11581f35-4630-3f5a-88d6-7ac834fd713b}, hash: 2F360C2F1B0A5D20C6C25FD81F4D93A1
    @Test()
    public void fromProtobufTest() throws UnreadableWalletException {
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class);
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class, CALLS_REAL_METHODS)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), (DefaultKeyChainFactory) any())).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            //Act Statement(s)
            List<DeterministicKeyChain> result = DeterministicKeyChain.fromProtobuf(protosKeyList, keyCrypterMock);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyChainList));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), (DefaultKeyChainFactory) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${0deada60-1b11-314f-80e8-30d82e945808}, hash: EC555EAE6D11588AAB75AF50427290ED
    @Test()
    public void fromProtobuf1WhenKeyNotHasDeterministicKeyThrowsUnreadableWalletException() throws UnreadableWalletException {
        /* Branches:
         * (for-each(keys)) : true
         * (t == Protos.Key.Type.DETERMINISTIC_MNEMONIC) : false
         * (t == Protos.Key.Type.DETERMINISTIC_KEY) : true
         * (!key.hasDeterministicKey()) : true
         */
        //Arrange Statement(s)
        Protos.Key keyMock = mock(Protos.Key.class, "fromProtobuf_object1");
        doReturn(Protos.Key.Type.DETERMINISTIC_KEY).when(keyMock).getType();
        doReturn(false).when(keyMock).hasDeterministicKey();
        UnreadableWalletException unreadableWalletException = new UnreadableWalletException("Deterministic key missing extra data: fromProtobuf_object1");
        thrown.expect(UnreadableWalletException.class);
        thrown.expectMessage(unreadableWalletException.getMessage());
        List<Protos.Key> protosKeyList = new ArrayList<>();
        protosKeyList.add(keyMock);
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class);
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class);
        //Act Statement(s)
        DeterministicKeyChain.fromProtobuf(protosKeyList, keyCrypterMock, keyChainFactoryMock);
        //Assert statement(s)
        verify(keyMock).getType();
        verify(keyMock).hasDeterministicKey();
    }

    //Sapient generated method id: ${cf8477b8-3f16-3751-863e-2f5b573602c1}, hash: 225B6EDEAD9E3813FC54DAAE16C3F2CB
    @Test()
    public void fromProtobuf1WhenKeyHasEncryptedDeterministicSeedThrowsUnreadableWalletException() throws UnreadableWalletException {
        /* Branches:
         * (for-each(keys)) : true
         * (t == Protos.Key.Type.DETERMINISTIC_MNEMONIC) : true
         * (path.isEmpty()) : true  #  inside deserializeAccountPath method
         * (chain != null) : false
         * (key.hasSecretBytes()) : true
         * (key.hasEncryptedDeterministicSeed()) : true
         */
        //Arrange Statement(s)
        Protos.Key keyMock = mock(Protos.Key.class, "fromProtobuf_object1");
        HDPath hDPathMock = mock(HDPath.class);
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class);
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class);
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class, CALLS_REAL_METHODS)) {
            doReturn(Protos.Key.Type.DETERMINISTIC_MNEMONIC).when(keyMock).getType();
            List<Integer> integerList = new ArrayList<>();
            doReturn(integerList).when(keyMock).getAccountPathList();
            doReturn(1L).when(keyMock).getCreationTimestamp();
            doReturn(true).when(keyMock).hasSecretBytes();
            doReturn(true).when(keyMock).hasEncryptedDeterministicSeed();
            hDPath.when(() -> HDPath.deserialize(anyList())).thenReturn(hDPathMock);
            doReturn(true).when(hDPathMock).isEmpty();
            UnreadableWalletException unreadableWalletException = new UnreadableWalletException("Malformed key proto: fromProtobuf_object1");
            thrown.expect(UnreadableWalletException.class);
            thrown.expectMessage(unreadableWalletException.getMessage());
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(keyMock);
            //Act Statement(s)
            DeterministicKeyChain.fromProtobuf(protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Assert statement(s)
            verify(keyMock, atLeast(1)).getType();
            verify(keyMock, atLeast(1)).getAccountPathList();
            verify(keyMock, atLeast(1)).getCreationTimestamp();
            verify(keyMock, atLeast(1)).hasSecretBytes();
            verify(keyMock, atLeast(1)).hasEncryptedDeterministicSeed();
            hDPath.verify(() -> HDPath.deserialize(anyList()), atLeast(1));
            verify(hDPathMock, atLeast(1)).isEmpty();
        }
    }

    //Sapient generated method id: ${91111e71-36c8-34a9-8514-ff0e5d1780dd}, hash: 84D807EF63FBC126BD1F05CAB09FBC22
    @Test()
    public void fromProtobuf1WhenKeyNotHasSecretBytesAndKeyNotHasEncryptedDataThrowsUnreadableWalletException() throws UnreadableWalletException {
        /* Branches:
         * (for-each(keys)) : true
         * (t == Protos.Key.Type.DETERMINISTIC_MNEMONIC) : true
         * (path.isEmpty()) : false  #  inside deserializeAccountPath method
         * (chain != null) : false
         * (key.hasSecretBytes()) : false
         * (key.hasEncryptedData()) : false
         */
        //Arrange Statement(s)
        Protos.Key keyMock = mock(Protos.Key.class, "fromProtobuf_object1");
        HDPath hDPathMock = mock(HDPath.class);
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class);
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class);
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class, CALLS_REAL_METHODS)) {
            doReturn(Protos.Key.Type.DETERMINISTIC_MNEMONIC).when(keyMock).getType();
            List<Integer> integerList = new ArrayList<>();
            doReturn(integerList).when(keyMock).getAccountPathList();
            doReturn(1L).when(keyMock).getCreationTimestamp();
            doReturn(false).when(keyMock).hasSecretBytes();
            doReturn(false).when(keyMock).hasEncryptedData();
            hDPath.when(() -> HDPath.deserialize(anyList())).thenReturn(hDPathMock);
            doReturn(false).when(hDPathMock).isEmpty();
            UnreadableWalletException unreadableWalletException = new UnreadableWalletException("Malformed key proto: fromProtobuf_object1");
            thrown.expect(UnreadableWalletException.class);
            thrown.expectMessage(unreadableWalletException.getMessage());
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(keyMock);
            //Act Statement(s)
            DeterministicKeyChain.fromProtobuf(protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Assert statement(s)
            verify(keyMock, atLeast(1)).getType();
            verify(keyMock, atLeast(1)).getAccountPathList();
            verify(keyMock, atLeast(1)).getCreationTimestamp();
            verify(keyMock, atLeast(1)).hasSecretBytes();
            verify(keyMock, atLeast(1)).hasEncryptedData();
            hDPath.verify(() -> HDPath.deserialize(anyList()), atLeast(1));
            verify(hDPathMock, atLeast(1)).isEmpty();
        }
    }

    //Sapient generated method id: ${881b6b86-4df9-367c-b66b-0465b9a1db98}, hash: 014BD39162E81955FF50101AF240F7D2
    @Test()
    public void fromProtobuf1WhenKeyHasDeterministicSeedThrowsUnreadableWalletException() throws UnreadableWalletException {
        /* Branches:
         * (for-each(keys)) : true
         * (t == Protos.Key.Type.DETERMINISTIC_MNEMONIC) : true
         * (path.isEmpty()) : true  #  inside deserializeAccountPath method
         * (chain != null) : false
         * (key.hasSecretBytes()) : false
         * (key.hasEncryptedData()) : true
         * (key.hasDeterministicSeed()) : true
         */
        //Arrange Statement(s)
        Protos.Key keyMock = mock(Protos.Key.class, "fromProtobuf_object1");
        HDPath hDPathMock = mock(HDPath.class);
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class);
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class);
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class, CALLS_REAL_METHODS)) {
            doReturn(Protos.Key.Type.DETERMINISTIC_MNEMONIC).when(keyMock).getType();
            List<Integer> integerList = new ArrayList<>();
            doReturn(integerList).when(keyMock).getAccountPathList();
            doReturn(1L).when(keyMock).getCreationTimestamp();
            doReturn(false).when(keyMock).hasSecretBytes();
            doReturn(true).when(keyMock).hasEncryptedData();
            doReturn(true).when(keyMock).hasDeterministicSeed();
            hDPath.when(() -> HDPath.deserialize(anyList())).thenReturn(hDPathMock);
            doReturn(true).when(hDPathMock).isEmpty();
            UnreadableWalletException unreadableWalletException = new UnreadableWalletException("Malformed key proto: fromProtobuf_object1");
            thrown.expect(UnreadableWalletException.class);
            thrown.expectMessage(unreadableWalletException.getMessage());
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(keyMock);
            //Act Statement(s)
            DeterministicKeyChain.fromProtobuf(protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Assert statement(s)
            verify(keyMock, atLeast(1)).getType();
            verify(keyMock, atLeast(1)).getAccountPathList();
            verify(keyMock, atLeast(1)).getCreationTimestamp();
            verify(keyMock, atLeast(1)).hasSecretBytes();
            verify(keyMock, atLeast(1)).hasEncryptedData();
            verify(keyMock, atLeast(1)).hasDeterministicSeed();
            hDPath.verify(() -> HDPath.deserialize(anyList()), atLeast(1));
            verify(hDPathMock, atLeast(1)).isEmpty();
        }
    }

    //Sapient generated method id: ${f2addb29-9274-3f86-8f54-54330e9e78d9}, hash: 5B4D4A95AA748FCF6A421A52C20CA3BD
    @Test()
    public void fromProtobuf1WhenChainIsNull() throws UnreadableWalletException {
        /* Branches:
         * (for-each(keys)) : true
         * (t == Protos.Key.Type.DETERMINISTIC_MNEMONIC) : true
         * (path.isEmpty()) : true  #  inside deserializeAccountPath method
         * (chain != null) : false
         * (key.hasSecretBytes()) : true
         * (key.hasEncryptedDeterministicSeed()) : false
         * (key.hasDeterministicSeed()) : true
         * (log.isDebugEnabled()) : true
         * (chain != null) : false
         */
        //Arrange Statement(s)
        Protos.Key keyMock = mock(Protos.Key.class);
        ByteString byteStringMock = mock(ByteString.class);
        ByteString byteStringMock2 = mock(ByteString.class);
        HDPath hDPathMock = mock(HDPath.class);
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class);
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class);
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class, CALLS_REAL_METHODS)) {
            doReturn(Protos.Key.Type.DETERMINISTIC_MNEMONIC).when(keyMock).getType();
            List<Integer> integerList = new ArrayList<>();
            doReturn(integerList).when(keyMock).getAccountPathList();
            doReturn(0L).when(keyMock).getCreationTimestamp();
            doReturn(true).when(keyMock).hasSecretBytes();
            doReturn(false).when(keyMock).hasEncryptedDeterministicSeed();
            doReturn(true).when(keyMock).hasDeterministicSeed();
            doReturn(byteStringMock).when(keyMock).getDeterministicSeed();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(byteStringMock).toByteArray();
            doReturn(byteStringMock2).when(keyMock).getSecretBytes();
            doReturn("return_of_toStringUtf8").when(byteStringMock2).toStringUtf8();
            hDPath.when(() -> HDPath.deserialize(anyList())).thenReturn(hDPathMock);
            doReturn(true).when(hDPathMock).isEmpty();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(keyMock);
            //Act Statement(s)
            List<DeterministicKeyChain> result = DeterministicKeyChain.fromProtobuf(protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            assertThat(protosKeyList.size(), equalTo(1));
            assertThat(protosKeyList.get(0), is(instanceOf(Protos.Key.class)));
            verify(keyMock, atLeast(1)).getType();
            verify(keyMock, atLeast(1)).getAccountPathList();
            verify(keyMock, atLeast(1)).getCreationTimestamp();
            verify(keyMock, atLeast(1)).hasSecretBytes();
            verify(keyMock, atLeast(1)).hasEncryptedDeterministicSeed();
            verify(keyMock, atLeast(1)).hasDeterministicSeed();
            verify(keyMock, atLeast(1)).getDeterministicSeed();
            verify(byteStringMock, atLeast(1)).toByteArray();
            verify(keyMock, atLeast(1)).getSecretBytes();
            verify(byteStringMock2, atLeast(1)).toStringUtf8();
            hDPath.verify(() -> HDPath.deserialize(anyList()), atLeast(1));
            verify(hDPathMock, atLeast(1)).isEmpty();
        }
    }

    //Sapient generated method id: ${ae65dad0-3d3a-3729-bfc6-9cccafca039a}, hash: E8D760D4AB254703930E0605B1110232
    @Test()
    public void fromProtobuf1WhenKeyHasEncryptedDeterministicSeedAndLogIsDebugEnabledAndChainIsNull() throws UnreadableWalletException {
        /* Branches:
         * (for-each(keys)) : true
         * (t == Protos.Key.Type.DETERMINISTIC_MNEMONIC) : true
         * (path.isEmpty()) : true  #  inside deserializeAccountPath method
         * (chain != null) : false
         * (key.hasSecretBytes()) : false
         * (key.hasEncryptedData()) : true
         * (key.hasDeterministicSeed()) : false
         * (key.hasEncryptedDeterministicSeed()) : true
         * (log.isDebugEnabled()) : true
         * (chain != null) : false
         */
        //Arrange Statement(s)
        Protos.Key keyMock = mock(Protos.Key.class);
        Protos.EncryptedData protosEncryptedDataMock = mock(Protos.EncryptedData.class);
        ByteString byteStringMock = mock(ByteString.class);
        Protos.EncryptedData protosEncryptedDataMock2 = mock(Protos.EncryptedData.class);
        ByteString byteStringMock2 = mock(ByteString.class);
        Protos.EncryptedData protosEncryptedDataMock3 = mock(Protos.EncryptedData.class);
        ByteString byteStringMock3 = mock(ByteString.class);
        ByteString byteStringMock4 = mock(ByteString.class);
        HDPath hDPathMock = mock(HDPath.class);
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class);
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class);
        try (MockedStatic<HDPath> hDPath = mockStatic(HDPath.class, CALLS_REAL_METHODS)) {
            doReturn(Protos.Key.Type.DETERMINISTIC_MNEMONIC).when(keyMock).getType();
            List<Integer> integerList = new ArrayList<>();
            doReturn(integerList).when(keyMock).getAccountPathList();
            doReturn(0L).when(keyMock).getCreationTimestamp();
            doReturn(false).when(keyMock).hasSecretBytes();
            doReturn(true).when(keyMock).hasEncryptedData();
            doReturn(false).when(keyMock).hasDeterministicSeed();
            doReturn(byteStringMock).when(protosEncryptedDataMock).getInitialisationVector();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(byteStringMock).toByteArray();
            doReturn(protosEncryptedDataMock, protosEncryptedDataMock2).when(keyMock).getEncryptedData();
            doReturn(byteStringMock2).when(protosEncryptedDataMock2).getEncryptedPrivateKey();
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(byteStringMock2).toByteArray();
            doReturn(true).when(keyMock).hasEncryptedDeterministicSeed();
            doReturn(protosEncryptedDataMock3).when(keyMock).getEncryptedDeterministicSeed();
            doReturn(byteStringMock3).when(protosEncryptedDataMock3).getInitialisationVector();
            byte[] byteArray3 = new byte[]{};
            doReturn(byteArray3).when(byteStringMock3).toByteArray();
            doReturn(byteStringMock4).when(protosEncryptedDataMock3).getEncryptedPrivateKey();
            byte[] byteArray4 = new byte[]{};
            doReturn(byteArray4).when(byteStringMock4).toByteArray();
            hDPath.when(() -> HDPath.deserialize(anyList())).thenReturn(hDPathMock);
            doReturn(true).when(hDPathMock).isEmpty();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(keyMock);
            //Act Statement(s)
            List<DeterministicKeyChain> result = DeterministicKeyChain.fromProtobuf(protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            assertThat(protosKeyList.size(), equalTo(1));
            assertThat(protosKeyList.get(0), is(instanceOf(Protos.Key.class)));
            verify(keyMock, atLeast(1)).getType();
            verify(keyMock, atLeast(1)).getAccountPathList();
            verify(keyMock, atLeast(1)).getCreationTimestamp();
            verify(keyMock, atLeast(1)).hasSecretBytes();
            verify(keyMock, atLeast(1)).hasEncryptedData();
            verify(keyMock, atLeast(1)).hasDeterministicSeed();
            verify(keyMock, times(2)).getEncryptedData();
            verify(protosEncryptedDataMock, atLeast(1)).getInitialisationVector();
            verify(byteStringMock, atLeast(1)).toByteArray();
            verify(protosEncryptedDataMock2, atLeast(1)).getEncryptedPrivateKey();
            verify(byteStringMock2, atLeast(1)).toByteArray();
            verify(keyMock, atLeast(1)).hasEncryptedDeterministicSeed();
            verify(keyMock, atLeast(1)).getEncryptedDeterministicSeed();
            verify(protosEncryptedDataMock3, atLeast(1)).getInitialisationVector();
            verify(byteStringMock3, atLeast(1)).toByteArray();
            verify(protosEncryptedDataMock3, atLeast(1)).getEncryptedPrivateKey();
            verify(byteStringMock4, atLeast(1)).toByteArray();
            hDPath.verify(() -> HDPath.deserialize(anyList()), atLeast(1));
            verify(hDPathMock, atLeast(1)).isEmpty();
        }
    }

    //Sapient generated method id: ${0e55dd42-d603-36ad-89f8-8c0d5b9f36c3}, hash: DC462C6759E3E35E0BBB06862379264C
    @Test()
    public void fromProtobuf1WhenLookaheadSizeLessThan0ThrowsIllegalStateException() throws UnreadableWalletException {
        //TODO: Please change the modifier of putKey from private to default to isolate the test case scenario
        //Act Statement(s)
        //Assert statement(s)
        /* Branches:
         * (for-each(keys)) : true
         * (t == Protos.Key.Type.DETERMINISTIC_MNEMONIC) : false
         * (t == Protos.Key.Type.DETERMINISTIC_KEY) : true
         * (!key.hasDeterministicKey()) : false
         * (key.hasOutputScriptType()) : true
         * (key.getDeterministicKey().getIsFollowing()) : true
         * (chain != null) : false
         * (chain == null) : true
         * (seed == null) : true
         * (key.hasSecretBytes()) : true
         * (!path.isEmpty()) : true
         * (!isWatchingAccountKey) : true
         * (!isSpendingKey) : false
         * (key.hasSecretBytes()) : true
         * (key.hasCreationTimestamp()) : true
         * (log.isDebugEnabled()) : true
         * (!isWatchingAccountKey) : true
         * (path.isEmpty()) : true
         * (chain.rootKey == null) : true
         * (chain != null) : true
         * (lookaheadSize >= 0) : false  #  inside addChain method
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.bitcoinj.crypto.LazyECPoint
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //Protos.Key keyMock = mock(Protos.Key.class);
        //Protos.DeterministicKey protosDeterministicKeyMock = mock(Protos.DeterministicKey.class);
        //ByteString byteStringMock = mock(ByteString.class);
        //ByteString byteStringMock2 = mock(ByteString.class);
        //Protos.DeterministicKey protosDeterministicKeyMock2 = mock(Protos.DeterministicKey.class);
        //Protos.DeterministicKey protosDeterministicKeyMock3 = mock(Protos.DeterministicKey.class);
        //ByteString byteStringMock3 = mock(ByteString.class);
        //ByteString byteStringMock4 = mock(ByteString.class);
        //KeyChainFactory factoryMock = mock(KeyChainFactory.class);
        //DeterministicKeyChain deterministicKeyChainMock = mock(DeterministicKeyChain.class);
        //HDPath pathMock = mock(HDPath.class);
        //KeyCrypter keyCrypterMock = mock(KeyCrypter.class);
        //doReturn(Protos.Key.Type.DETERMINISTIC_KEY).when(keyMock).getType();
        //doReturn(true).when(keyMock).hasDeterministicKey();
        //doReturn(byteStringMock).when(protosDeterministicKeyMock).getChainCode();
        //byte[] byteArray = new byte[] {};
        //doReturn(byteArray).when(byteStringMock).toByteArray();
        //doReturn(byteStringMock2).when(keyMock).getPublicKey();
        //byte[] byteArray2 = new byte[] {};
        //doReturn(byteArray2).when(byteStringMock2).toByteArray();
        //List<Integer> integerList = new ArrayList<>();
        //doReturn(integerList).when(protosDeterministicKeyMock2).getPathList();
        //doReturn(true).when(keyMock).hasOutputScriptType();
        //doReturn(Protos.Key.OutputScriptType.P2PKH).when(keyMock).getOutputScriptType();
        //doReturn(protosDeterministicKeyMock, protosDeterministicKeyMock2, protosDeterministicKeyMock3).when(keyMock).getDeterministicKey();
        //doReturn(true).when(protosDeterministicKeyMock3).getIsFollowing();
        //doReturn(true).when(keyMock).hasSecretBytes();
        //byte[] byteArray3 = new byte[] {};
        //doReturn(byteArray3).when(byteStringMock3).toByteArray();
        //doReturn(0L).when(keyMock).getCreationTimestamp();
        //doReturn(byteStringMock3, byteStringMock4).when(keyMock).getSecretBytes();
        //byte[] byteArray4 = new byte[] {};
        //doReturn(byteArray4).when(byteStringMock4).toByteArray();
        //doReturn(true).when(keyMock).hasCreationTimestamp();
        //doReturn(deterministicKeyChainMock).when(factoryMock).makeSpendingKeyChain((DeterministicKey) any(), eq(ScriptType.P2PKH));
        //doNothing().when(deterministicKeyChainMock).putKey((DeterministicKey) any());
        //doReturn(false, true).when(pathMock).isEmpty();
        //hDPath.when(() -> HDPath.deserialize(anyList())).thenReturn(pathMock);
        //thrown.expect(IllegalStateException.class);
        //List<Protos.Key> protosKeyList = new ArrayList<>();
        //protosKeyList.add(keyMock);
        //DeterministicKeyChain.fromProtobuf(protosKeyList, keyCrypterMock, factoryMock);
        //verify(keyMock, atLeast(1)).getType();
        //verify(keyMock, atLeast(1)).hasDeterministicKey();
        //verify(keyMock, times(3)).getDeterministicKey();
        //verify(protosDeterministicKeyMock, atLeast(1)).getChainCode();
        //verify(byteStringMock, atLeast(1)).toByteArray();
        //verify(keyMock, atLeast(1)).getPublicKey();
        //verify(byteStringMock2, atLeast(1)).toByteArray();
        //verify(protosDeterministicKeyMock2, atLeast(1)).getPathList();
        //verify(keyMock, atLeast(1)).hasOutputScriptType();
        //verify(keyMock, atLeast(1)).getOutputScriptType();
        //verify(protosDeterministicKeyMock3, atLeast(1)).getIsFollowing();
        //verify(keyMock, times(2)).hasSecretBytes();
        //verify(keyMock, times(2)).getSecretBytes();
        //verify(byteStringMock3, atLeast(1)).toByteArray();
        //verify(keyMock, times(2)).getCreationTimestamp();
        //verify(byteStringMock4, atLeast(1)).toByteArray();
        //verify(keyMock, atLeast(1)).hasCreationTimestamp();
        //verify(factoryMock, atLeast(1)).makeSpendingKeyChain((DeterministicKey) any(), eq(ScriptType.P2PKH));
        //verify(pathMock, times(2)).isEmpty();
        //hDPath.verify(() -> HDPath.deserialize(anyList()), atLeast(1));
    }

    //Sapient generated method id: ${4ec6d899-764c-33e1-be56-f8ce5990ac3e}, hash: 4979F18CED61BFF6D52622EA7FA16E79
    @Test()
    public void fromProtobuf1WhenLookaheadSizeGreaterThanOrEqualsTo0() throws UnreadableWalletException {
        //TODO: Please change the modifier of putKey from private to default to isolate the test case scenario
        //Act Statement(s)
        //Assert statement(s)
        /* Branches:
         * (for-each(keys)) : true
         * (t == Protos.Key.Type.DETERMINISTIC_MNEMONIC) : false
         * (t == Protos.Key.Type.DETERMINISTIC_KEY) : true
         * (!key.hasDeterministicKey()) : false
         * (key.hasOutputScriptType()) : true
         * (key.getDeterministicKey().getIsFollowing()) : true
         * (chain != null) : false
         * (chain == null) : true
         * (seed == null) : true
         * (key.hasSecretBytes()) : true
         * (!path.isEmpty()) : true
         * (!isWatchingAccountKey) : true
         * (!isSpendingKey) : false
         * (key.hasSecretBytes()) : true
         * (key.hasCreationTimestamp()) : true
         * (log.isDebugEnabled()) : true
         * (!isWatchingAccountKey) : true
         * (path.isEmpty()) : false
         * (path.size() == chain.getAccountPath().size() + 1) : false
         * (isSpendingKey) : true
         * (detkey.getChildNumber().num() == 0) : true
         * (chain != null) : true
         * (lookaheadSize >= 0) : true  #  inside addChain method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type ChildNumber, detkey
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //Protos.Key keyMock = mock(Protos.Key.class);
        //Protos.DeterministicKey protosDeterministicKeyMock = mock(Protos.DeterministicKey.class);
        //ByteString byteStringMock = mock(ByteString.class);
        //ByteString byteStringMock2 = mock(ByteString.class);
        //Protos.DeterministicKey protosDeterministicKeyMock2 = mock(Protos.DeterministicKey.class);
        //Protos.DeterministicKey protosDeterministicKeyMock3 = mock(Protos.DeterministicKey.class);
        //ByteString byteStringMock3 = mock(ByteString.class);
        //ByteString byteStringMock4 = mock(ByteString.class);
        //Protos.DeterministicKey protosDeterministicKeyMock4 = mock(Protos.DeterministicKey.class);
        //Protos.DeterministicKey protosDeterministicKeyMock5 = mock(Protos.DeterministicKey.class);
        //Protos.DeterministicKey protosDeterministicKeyMock6 = mock(Protos.DeterministicKey.class);
        //KeyChainFactory factoryMock = mock(KeyChainFactory.class);
        //DeterministicKeyChain deterministicKeyChainMock = mock(DeterministicKeyChain.class);
        //HDPath hDPathMock = mock(HDPath.class);
        //HDPath pathMock = mock(HDPath.class);
        //KeyCrypter keyCrypterMock = mock(KeyCrypter.class);
        //doReturn(Protos.Key.Type.DETERMINISTIC_KEY).when(keyMock).getType();
        //doReturn(true).when(keyMock).hasDeterministicKey();
        //doReturn(byteStringMock).when(protosDeterministicKeyMock).getChainCode();
        //byte[] byteArray = new byte[] {};
        //doReturn(byteArray).when(byteStringMock).toByteArray();
        //doReturn(byteStringMock2).when(keyMock).getPublicKey();
        //byte[] byteArray2 = new byte[] {};
        //doReturn(byteArray2).when(byteStringMock2).toByteArray();
        //List<Integer> integerList = new ArrayList<>();
        //doReturn(integerList).when(protosDeterministicKeyMock2).getPathList();
        //doReturn(true).when(keyMock).hasOutputScriptType();
        //doReturn(Protos.Key.OutputScriptType.P2WPKH).when(keyMock).getOutputScriptType();
        //doReturn(true).when(protosDeterministicKeyMock3).getIsFollowing();
        //doReturn(true).when(keyMock).hasSecretBytes();
        //byte[] byteArray3 = new byte[] {};
        //doReturn(byteArray3).when(byteStringMock3).toByteArray();
        //doReturn(0L).when(keyMock).getCreationTimestamp();
        //doReturn(byteStringMock3, byteStringMock4).when(keyMock).getSecretBytes();
        //byte[] byteArray4 = new byte[] {};
        //doReturn(byteArray4).when(byteStringMock4).toByteArray();
        //doReturn(true).when(keyMock).hasCreationTimestamp();
        //doReturn(0).when(protosDeterministicKeyMock4).getIssuedSubkeys();
        //doReturn(21237).when(protosDeterministicKeyMock5).getLookaheadSize();
        //doReturn(protosDeterministicKeyMock, protosDeterministicKeyMock2, protosDeterministicKeyMock3, protosDeterministicKeyMock4, protosDeterministicKeyMock5, protosDeterministicKeyMock6).when(keyMock).getDeterministicKey();
        //doReturn(0).when(protosDeterministicKeyMock6).getSigsRequiredToSpend();
        //doReturn(deterministicKeyChainMock).when(factoryMock).makeSpendingKeyChain((DeterministicKey) any(), eq(ScriptType.P2WPKH));
        //doReturn(hDPathMock).when(deterministicKeyChainMock).getAccountPath();
        //doReturn(0).when(hDPathMock).size();
        //doNothing().when(deterministicKeyChainMock).putKey((DeterministicKey) any());
        //doReturn(false).when(pathMock).isEmpty();
        //doReturn(2).when(pathMock).size();
        //doNothing().when(deterministicKeyChainMock).setLookaheadSize(21237);
        //doNothing().when(deterministicKeyChainMock).setSigsRequiredToSpend(0);
        //doNothing().when(deterministicKeyChainMock).maybeLookAhead();
        //hDPath.when(() -> HDPath.deserialize(anyList())).thenReturn(pathMock);
        //List<Protos.Key> protosKeyList = new ArrayList<>();
        //protosKeyList.add(keyMock);
        //List<DeterministicKeyChain> result = DeterministicKeyChain.fromProtobuf(protosKeyList, keyCrypterMock, factoryMock);
        //assertThat(result.size(), equalTo(1));
        //assertThat(result.get(0), is(instanceOf(DeterministicKeyChain.class)));
        //verify(keyMock, atLeast(1)).getType();
        //verify(keyMock, atLeast(1)).hasDeterministicKey();
        //verify(keyMock, times(6)).getDeterministicKey();
        //verify(protosDeterministicKeyMock, atLeast(1)).getChainCode();
        //verify(byteStringMock, atLeast(1)).toByteArray();
        //verify(keyMock, atLeast(1)).getPublicKey();
        //verify(byteStringMock2, atLeast(1)).toByteArray();
        //verify(protosDeterministicKeyMock2, atLeast(1)).getPathList();
        //verify(keyMock, atLeast(1)).hasOutputScriptType();
        //verify(keyMock, atLeast(1)).getOutputScriptType();
        //verify(protosDeterministicKeyMock3, atLeast(1)).getIsFollowing();
        //verify(keyMock, times(2)).hasSecretBytes();
        //verify(keyMock, times(2)).getSecretBytes();
        //verify(byteStringMock3, atLeast(1)).toByteArray();
        //verify(keyMock, times(2)).getCreationTimestamp();
        //verify(byteStringMock4, atLeast(1)).toByteArray();
        //verify(keyMock, atLeast(1)).hasCreationTimestamp();
        //verify(protosDeterministicKeyMock4, atLeast(1)).getIssuedSubkeys();
        //verify(protosDeterministicKeyMock5, atLeast(1)).getLookaheadSize();
        //verify(protosDeterministicKeyMock6, atLeast(1)).getSigsRequiredToSpend();
        //verify(factoryMock, atLeast(1)).makeSpendingKeyChain((DeterministicKey) any(), eq(ScriptType.P2WPKH));
        //verify(deterministicKeyChainMock, atLeast(1)).getAccountPath();
        //verify(hDPathMock, atLeast(1)).size();
        //verify(pathMock, times(2)).isEmpty();
        //verify(pathMock, atLeast(1)).size();
        //verify(deterministicKeyChainMock, atLeast(1)).setLookaheadSize(21237);
        //verify(deterministicKeyChainMock, atLeast(1)).setSigsRequiredToSpend(0);
        //verify(deterministicKeyChainMock, atLeast(1)).maybeLookAhead();
        //hDPath.verify(() -> HDPath.deserialize(anyList()), atLeast(1));
    }

    //Sapient generated method id: ${f00af6b9-e59c-3aef-8ae1-011f875d8af9}, hash: A812445BCF74E93111AB5CD800EDCB97
    @Test()
    public void fromProtobuf1WhenDetkeyGetChildNumberNumEquals1AndChainIsNotNullAndLookaheadSizeLessThan09ThrowsIllegalStateException() throws UnreadableWalletException {
        //TODO: Please change the modifier of putKey from private to default to isolate the test case scenario
        //Act Statement(s)
        //Assert statement(s)
        /* Branches:
         * (for-each(keys)) : true
         * (t == Protos.Key.Type.DETERMINISTIC_MNEMONIC) : false
         * (t == Protos.Key.Type.DETERMINISTIC_KEY) : true
         * (!key.hasDeterministicKey()) : false
         * (key.hasOutputScriptType()) : true
         * (key.getDeterministicKey().getIsFollowing()) : true
         * (chain != null) : false
         * (chain == null) : true
         * (seed == null) : true
         * (key.hasSecretBytes()) : true
         * (!path.isEmpty()) : true
         * (!isWatchingAccountKey) : true
         * (!isSpendingKey) : false
         * (key.hasSecretBytes()) : false
         * (key.hasEncryptedData()) : true
         * (key.hasCreationTimestamp()) : true
         * (log.isDebugEnabled()) : true
         * (!isWatchingAccountKey) : true
         * (path.isEmpty()) : false
         * (path.size() == chain.getAccountPath().size() + 1) : false
         * (isSpendingKey) : true
         * (detkey.getChildNumber().num() == 0) : false
         * (detkey.getChildNumber().num() == 1) : true
         * (chain != null) : true
         * (lookaheadSize >= 0) : false  #  inside addChain method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type ChildNumber, detkey
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //Protos.Key keyMock = mock(Protos.Key.class);
        //Protos.DeterministicKey protosDeterministicKeyMock = mock(Protos.DeterministicKey.class);
        //ByteString byteStringMock = mock(ByteString.class);
        //ByteString byteStringMock2 = mock(ByteString.class);
        //Protos.DeterministicKey protosDeterministicKeyMock2 = mock(Protos.DeterministicKey.class);
        //Protos.DeterministicKey protosDeterministicKeyMock3 = mock(Protos.DeterministicKey.class);
        //ByteString byteStringMock3 = mock(ByteString.class);
        //Protos.EncryptedData protosEncryptedDataMock = mock(Protos.EncryptedData.class);
        //ByteString byteStringMock4 = mock(ByteString.class);
        //ByteString byteStringMock5 = mock(ByteString.class);
        //Protos.DeterministicKey protosDeterministicKeyMock4 = mock(Protos.DeterministicKey.class);
        //KeyChainFactory factoryMock = mock(KeyChainFactory.class);
        //DeterministicKeyChain deterministicKeyChainMock = mock(DeterministicKeyChain.class);
        //HDPath hDPathMock = mock(HDPath.class);
        //HDPath pathMock = mock(HDPath.class);
        //KeyCrypter keyCrypterMock = mock(KeyCrypter.class);
        //doReturn(Protos.Key.Type.DETERMINISTIC_KEY).when(keyMock).getType();
        //doReturn(true).when(keyMock).hasDeterministicKey();
        //doReturn(byteStringMock).when(protosDeterministicKeyMock).getChainCode();
        //byte[] byteArray = new byte[] {};
        //doReturn(byteArray).when(byteStringMock).toByteArray();
        //doReturn(byteStringMock2).when(keyMock).getPublicKey();
        //byte[] byteArray2 = new byte[] {};
        //doReturn(byteArray2).when(byteStringMock2).toByteArray();
        //List<Integer> integerList = new ArrayList<>();
        //doReturn(integerList).when(protosDeterministicKeyMock2).getPathList();
        //doReturn(true).when(keyMock).hasOutputScriptType();
        //doReturn(Protos.Key.OutputScriptType.P2WPKH).when(keyMock).getOutputScriptType();
        //doReturn(true).when(protosDeterministicKeyMock3).getIsFollowing();
        //doReturn(byteStringMock3).when(keyMock).getSecretBytes();
        //byte[] byteArray3 = new byte[] {};
        //doReturn(byteArray3).when(byteStringMock3).toByteArray();
        //doReturn(0L).when(keyMock).getCreationTimestamp();
        //doReturn(true, false).when(keyMock).hasSecretBytes();
        //doReturn(true).when(keyMock).hasEncryptedData();
        //doReturn(protosEncryptedDataMock).when(keyMock).getEncryptedData();
        //doReturn(byteStringMock4).when(protosEncryptedDataMock).getInitialisationVector();
        //byte[] byteArray4 = new byte[] {};
        //doReturn(byteArray4).when(byteStringMock4).toByteArray();
        //doReturn(byteStringMock5).when(protosEncryptedDataMock).getEncryptedPrivateKey();
        //byte[] byteArray5 = new byte[] {};
        //doReturn(byteArray5).when(byteStringMock5).toByteArray();
        //doReturn(true).when(keyMock).hasCreationTimestamp();
        //doReturn(protosDeterministicKeyMock, protosDeterministicKeyMock2, protosDeterministicKeyMock3, protosDeterministicKeyMock4).when(keyMock).getDeterministicKey();
        //doReturn(0).when(protosDeterministicKeyMock4).getIssuedSubkeys();
        //doReturn(deterministicKeyChainMock).when(factoryMock).makeSpendingKeyChain((DeterministicKey) any(), eq(ScriptType.P2WPKH));
        //doReturn(hDPathMock).when(deterministicKeyChainMock).getAccountPath();
        //doReturn(0).when(hDPathMock).size();
        //doNothing().when(deterministicKeyChainMock).putKey((DeterministicKey) any());
        //doReturn(false).when(pathMock).isEmpty();
        //doReturn(2).when(pathMock).size();
        //hDPath.when(() -> HDPath.deserialize(anyList())).thenReturn(pathMock);
        //thrown.expect(IllegalStateException.class);
        //List<Protos.Key> protosKeyList = new ArrayList<>();
        //protosKeyList.add(keyMock);
        //DeterministicKeyChain.fromProtobuf(protosKeyList, keyCrypterMock, factoryMock);
        //verify(keyMock, atLeast(1)).getType();
        //verify(keyMock, atLeast(1)).hasDeterministicKey();
        //verify(keyMock, times(4)).getDeterministicKey();
        //verify(protosDeterministicKeyMock, atLeast(1)).getChainCode();
        //verify(byteStringMock, atLeast(1)).toByteArray();
        //verify(keyMock, atLeast(1)).getPublicKey();
        //verify(byteStringMock2, atLeast(1)).toByteArray();
        //verify(protosDeterministicKeyMock2, atLeast(1)).getPathList();
        //verify(keyMock, atLeast(1)).hasOutputScriptType();
        //verify(keyMock, atLeast(1)).getOutputScriptType();
        //verify(protosDeterministicKeyMock3, atLeast(1)).getIsFollowing();
        //verify(keyMock, times(2)).hasSecretBytes();
        //verify(keyMock, atLeast(1)).getSecretBytes();
        //verify(byteStringMock3, atLeast(1)).toByteArray();
        //verify(keyMock, times(2)).getCreationTimestamp();
        //verify(keyMock, atLeast(1)).hasEncryptedData();
        //verify(keyMock, atLeast(1)).getEncryptedData();
        //verify(protosEncryptedDataMock, atLeast(1)).getInitialisationVector();
        //verify(byteStringMock4, atLeast(1)).toByteArray();
        //verify(protosEncryptedDataMock, atLeast(1)).getEncryptedPrivateKey();
        //verify(byteStringMock5, atLeast(1)).toByteArray();
        //verify(keyMock, atLeast(1)).hasCreationTimestamp();
        //verify(protosDeterministicKeyMock4, atLeast(1)).getIssuedSubkeys();
        //verify(factoryMock, atLeast(1)).makeSpendingKeyChain((DeterministicKey) any(), eq(ScriptType.P2WPKH));
        //verify(deterministicKeyChainMock, atLeast(1)).getAccountPath();
        //verify(hDPathMock, atLeast(1)).size();
        //verify(pathMock, times(2)).isEmpty();
        //verify(pathMock, atLeast(1)).size();
        //hDPath.verify(() -> HDPath.deserialize(anyList()), atLeast(1));
    }

    //Sapient generated method id: ${673767b4-1364-3d7b-b6c6-1badb1541483}, hash: 6E56EDEC653699E7B30D6C04735D1B60
    @Ignore()
    @Test()
    public void toEncryptedWhenPasswordLengthNotGreaterThan0ThrowsIllegalArgumentException() {
        /* Branches:
         * (password.length() > 0) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.toEncrypted("toEncrypted_charSequence1");
            //Assert statement(s)
            verify(keyMock, atLeast(1)).isPubKeyOnly();
            verify(keyMock, atLeast(1)).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${22c652b5-cda5-31cb-b4e0-13ace324f4af}, hash: 4BBA71896D3834463A02741AB037BCF1
    @Ignore()
    @Test()
    public void toEncryptedWhenSeedIsNullThrowsIllegalStateException() {
        /* Branches:
         * (password.length() > 0) : true
         * (seed != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.toEncrypted("toEncrypted_charSequence1");
            //Assert statement(s)
            verify(keyMock, atLeast(1)).isPubKeyOnly();
            verify(keyMock, atLeast(1)).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${36ed680a-df55-3742-a5d9-4a76f4014202}, hash: 1603AE7273072F3E381840A7345AA93C
    @Ignore()
    @Test()
    public void toEncrypted1WhenDefaultBranchThrowsIllegalArgumentException() {
        /* Branches:
         * (branch expression (line 423)) : true  #  inside <init> method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class);
        AesKey aesKeyMock = mock(AesKey.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            target = new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.toEncrypted(keyCrypterMock, aesKeyMock);
            //Assert statement(s)
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(2));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${d43ba78a-a7cc-3039-bd41-beff41bf5d78}, hash: DF2769A5798C097C6F3E00A4A207AA1F
    @Ignore()
    @Test()
    public void toEncrypted1WhenDefaultBranch() throws KeyCrypterException {
        /* Branches:
         * (branch expression (line 423)) : false  #  inside <init> method
         * (branch expression (line 441)) : true  #  inside <init> method
         * (branch expression (line 450)) : true  #  inside <init> method
         * (branch expression (line 453)) : true  #  inside <init> method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        DeterministicHierarchy hierarchyMock2 = mock(DeterministicHierarchy.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        HDPath hDPathMock2 = mock(HDPath.class);
        DeterministicKey deterministicKeyMock2 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock3 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock4 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock5 = mock(DeterministicKey.class);
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class);
        AesKey aesKeyMock = mock(AesKey.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            doReturn(deterministicKeyMock).when(hierarchyMock2).get(hDPathMock2, false, false);
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(hierarchyMock2).putKey(deterministicKeyMock2);
            doNothing().when(hierarchyMock2).putKey(deterministicKeyMock3);
            doNothing().when(hierarchyMock2).putKey(deterministicKeyMock4);
            doNothing().when(hierarchyMock2).putKey(deterministicKeyMock5);
            doNothing().when(hierarchyMock2).putKey((DeterministicKey) any());
            //Act Statement(s)
            DeterministicKeyChain result = target.toEncrypted(keyCrypterMock, aesKeyMock);
            //Assert statement(s)
            //TODO: Please implement equals method in DeterministicKeyChain for verification of the entire object or you need to adjust respective assertion statements
            assertThat(result, is(notNullValue()));
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            verify(hierarchyMock2).get(hDPathMock2, false, false);
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()), atLeast(2));
            verify(hierarchyMock2).putKey(deterministicKeyMock2);
            verify(hierarchyMock2).putKey(deterministicKeyMock3);
            verify(hierarchyMock2).putKey(deterministicKeyMock4);
            verify(hierarchyMock2).putKey(deterministicKeyMock5);
            verify(hierarchyMock2).putKey((DeterministicKey) any());
        }
    }

    //Sapient generated method id: ${933fcbab-a577-3eb3-b0b7-b39bc8cd76d9}, hash: 0E10836294B4EDEB16DAA47D21AC540B
    @Ignore()
    @Test()
    public void toDecryptedWhenPasswordLengthNotGreaterThan0ThrowsIllegalArgumentException() {
        /* Branches:
         * (password.length() > 0) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.toDecrypted("toDecrypted_charSequence1");
            //Assert statement(s)
            verify(keyMock, atLeast(1)).isPubKeyOnly();
            verify(keyMock, atLeast(1)).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${68609e3b-2631-3c0d-a3ed-526982732030}, hash: 2DC0B64B0CE36506F0F1AEA5E408FF34
    @Ignore()
    @Test()
    public void toDecryptedWhenCrypterIsNullThrowsIllegalStateException() {
        /* Branches:
         * (password.length() > 0) : true
         * (crypter != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.toDecrypted("toDecrypted_charSequence1");
            //Assert statement(s)
            verify(keyMock, atLeast(1)).isPubKeyOnly();
            verify(keyMock, atLeast(1)).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${7730acd6-619a-3c71-af95-d545a8ac96af}, hash: 360C038387511437888DA060328586F3
    @Ignore()
    @Test()
    public void toDecrypted1WhenGetKeyCrypterIsNullThrowsIllegalStateException() {
        /* Branches:
         * (getKeyCrypter() != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        AesKey aesKeyMock = mock(AesKey.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.toDecrypted(aesKeyMock);
            //Assert statement(s)
            verify(keyMock, atLeast(1)).isPubKeyOnly();
            verify(keyMock, atLeast(1)).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${8ae212ce-b87d-370a-b4e2-6caf4195d90b}, hash: 113785F72FFA413DE26C279E1BCF6A16
    @Ignore()
    @Test()
    public void makeKeyChainFromSeedWhenDefaultBranchThrowsIllegalArgumentException() {
        /* Branches:
         * (branch expression (line 387)) : false  #  inside <init> method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        DeterministicSeed deterministicSeedMock = mock(DeterministicSeed.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            target = new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(IllegalArgumentException.class);
            List<ChildNumber> childNumberList = new ArrayList<>();
            //Act Statement(s)
            target.makeKeyChainFromSeed(deterministicSeedMock, childNumberList, ScriptType.P2TR);
            //Assert statement(s)
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(2));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${d5afbba0-cf99-3d23-b01c-2e2e04bd587f}, hash: 1069A6545863323DD1C838878091A3A3
    @Ignore()
    @Test()
    public void makeKeyChainFromSeedWhenDefaultBranchAndDefaultBranchAndDefaultBranchAndDefaultBranch() {
        /* Branches:
         * (branch expression (line 387)) : false  #  inside <init> method
         * (branch expression (line 389)) : false  #  inside <init> method
         * (branch expression (line 393)) : false  #  inside <init> method
         * (branch expression (line 396)) : true  #  inside <init> method
         * (branch expression (line 402)) : true  #  inside <init> method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicSeed seedMock = mock(DeterministicSeed.class);
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        HDPath hDPathMock2 = mock(HDPath.class);
        HDPath hDPath2Mock = mock(HDPath.class);
        DeterministicHierarchy hierarchyMock2 = mock(DeterministicHierarchy.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock2 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock3 = mock(DeterministicKey.class);
        try (MockedStatic<HDKeyDerivation> hDKeyDerivation = mockStatic(HDKeyDerivation.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(seedMock).isEncrypted();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(seedMock).getSeedBytes();
            Instant instant = (Instant) Instant.ofEpochSecond(1700000000);
            doReturn(Optional.of(instant)).when(seedMock).creationTime();
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(hDPathMock2);
            List<HDPath> hDPathList = new ArrayList<>();
            hDPathList.add(hDPath2Mock);
            doReturn(hDPathList).when(hDPathMock2).ancestors(true);
            hDKeyDerivation.when(() -> HDKeyDerivation.createMasterPrivateKey(byteArray)).thenReturn(rootKeyMock);
            target = new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(rootKeyMock).setCreationTime((Instant) any());
            doReturn(deterministicKeyMock).when(hierarchyMock2).get(hDPath2Mock, false, true);
            ChildNumber childNumber = ChildNumber.ZERO;
            doReturn(deterministicKeyMock2).when(hierarchyMock2).deriveChild(hDPathMock2, false, false, childNumber);
            ChildNumber childNumber2 = ChildNumber.ONE;
            doReturn(deterministicKeyMock3).when(hierarchyMock2).deriveChild(hDPathMock2, false, false, childNumber2);
            List<ChildNumber> childNumberList = new ArrayList<>();
            //Act Statement(s)
            DeterministicKeyChain result = target.makeKeyChainFromSeed(seedMock, childNumberList, ScriptType.P2WPKH);
            //Assert statement(s)
            //TODO: Please implement equals method in DeterministicKeyChain for verification of the entire object or you need to adjust respective assertion statements
            assertThat(result, is(notNullValue()));
            verify(seedMock, atLeast(1)).isEncrypted();
            verify(seedMock, atLeast(1)).getSeedBytes();
            verify(seedMock, atLeast(1)).creationTime();
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()), atLeast(2));
            hDPath.verify(() -> HDPath.M(anyList()));
            verify(hDPathMock2).ancestors(true);
            hDKeyDerivation.verify(() -> HDKeyDerivation.createMasterPrivateKey(byteArray), atLeast(1));
            verify(rootKeyMock).setCreationTime((Instant) any());
            verify(hierarchyMock2).get(hDPath2Mock, false, true);
            verify(hierarchyMock2).deriveChild(hDPathMock2, false, false, childNumber);
            verify(hierarchyMock2).deriveChild(hDPathMock2, false, false, childNumber2);
        }
    }

    //Sapient generated method id: ${3d3f60fc-8bd8-3710-bc13-add1f9c582b9}, hash: 3FD6FCCAE2B3708E0F384E6076A49697
    @Ignore()
    @Test()
    public void makeKeyChainFromSeedWhenDefaultBranchAndDefaultBranchAndDefaultBranchAndDefaultBranchAndDefaultBranch6() {
        /* Branches:
         * (branch expression (line 387)) : false  #  inside <init> method
         * (branch expression (line 389)) : false  #  inside <init> method
         * (branch expression (line 393)) : false  #  inside <init> method
         * (branch expression (line 396)) : false  #  inside <init> method
         * (branch expression (line 402)) : true  #  inside <init> method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicSeed seedMock = mock(DeterministicSeed.class);
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        HDPath hDPathMock2 = mock(HDPath.class);
        HDPath hDPath2Mock = mock(HDPath.class);
        DeterministicHierarchy hierarchyMock2 = mock(DeterministicHierarchy.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock2 = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock3 = mock(DeterministicKey.class);
        try (MockedStatic<HDKeyDerivation> hDKeyDerivation = mockStatic(HDKeyDerivation.class);
             MockedStatic<HDPath> hDPath = mockStatic(HDPath.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(seedMock).isEncrypted();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(seedMock).getSeedBytes();
            doReturn(Optional.empty()).when(seedMock).creationTime();
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            hDPath.when(() -> HDPath.M(anyList())).thenReturn(hDPathMock2);
            List<HDPath> hDPathList = new ArrayList<>();
            hDPathList.add(hDPath2Mock);
            doReturn(hDPathList).when(hDPathMock2).ancestors(true);
            hDKeyDerivation.when(() -> HDKeyDerivation.createMasterPrivateKey(byteArray)).thenReturn(rootKeyMock);
            target = new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(rootKeyMock).clearCreationTime();
            doReturn(deterministicKeyMock).when(hierarchyMock2).get(hDPath2Mock, false, true);
            ChildNumber childNumber = ChildNumber.ZERO;
            doReturn(deterministicKeyMock2).when(hierarchyMock2).deriveChild(hDPathMock2, false, false, childNumber);
            ChildNumber childNumber2 = ChildNumber.ONE;
            doReturn(deterministicKeyMock3).when(hierarchyMock2).deriveChild(hDPathMock2, false, false, childNumber2);
            List<ChildNumber> childNumberList = new ArrayList<>();
            ScriptType scriptType = null;
            //Act Statement(s)
            DeterministicKeyChain result = target.makeKeyChainFromSeed(seedMock, childNumberList, scriptType);
            //Assert statement(s)
            //TODO: Please implement equals method in DeterministicKeyChain for verification of the entire object or you need to adjust respective assertion statements
            assertThat(result, is(notNullValue()));
            verify(seedMock, atLeast(1)).isEncrypted();
            verify(seedMock, atLeast(1)).getSeedBytes();
            verify(seedMock, atLeast(1)).creationTime();
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()), atLeast(2));
            hDPath.verify(() -> HDPath.M(anyList()));
            verify(hDPathMock2).ancestors(true);
            hDKeyDerivation.verify(() -> HDKeyDerivation.createMasterPrivateKey(byteArray), atLeast(1));
            verify(rootKeyMock).clearCreationTime();
            verify(hierarchyMock2).get(hDPath2Mock, false, true);
            verify(hierarchyMock2).deriveChild(hDPathMock2, false, false, childNumber);
            verify(hierarchyMock2).deriveChild(hDPathMock2, false, false, childNumber2);
        }
    }

    //Sapient generated method id: ${a0a355d6-9438-35de-b0f5-f5927ebfc8e4}, hash: AC2E68A6FA8BD045AB7E427D9CDEF04B
    @Ignore()
    @Test()
    public void checkPasswordWhenGetKeyCrypterIsNullThrowsIllegalStateException() {
        /* Branches:
         * (getKeyCrypter() != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.checkPassword("checkPassword_charSequence1");
            //Assert statement(s)
            verify(keyMock, atLeast(1)).isPubKeyOnly();
            verify(keyMock, atLeast(1)).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${7ee6de01-cd30-3adf-ab44-7dc0722c943e}, hash: 68DC692355E1ACDFB9798C17EF8EE602
    @Ignore()
    @Test()
    public void checkAESKeyWhenRootKeyIsNullThrowsIllegalStateException() {
        /* Branches:
         * (rootKey != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        AesKey aesKeyMock = mock(AesKey.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.checkAESKey(aesKeyMock);
            //Assert statement(s)
            verify(keyMock, atLeast(1)).isPubKeyOnly();
            verify(keyMock, atLeast(1)).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${5263e1c8-6ee4-3528-9e17-7641d8067bcf}, hash: CFCD35AF6277ADE54827461AE2CE6357
    @Ignore()
    @Test()
    public void getKeyCrypterTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            KeyCrypter result = target.getKeyCrypter();
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${bce340de-c9e7-3b09-ae2c-d943d6a73f89}, hash: EDE0CB19F0A987D189F8ECEEB0D2657B
    @Ignore()
    @Test()
    public void numBloomFilterEntriesTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = spy(new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(0).when(target).numKeys();
            //Act Statement(s)
            int result = target.numBloomFilterEntries();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(target).numKeys();
        }
    }

    //Sapient generated method id: ${0c314ea8-a39b-35e6-84ac-8d31aa3e1259}, hash: 1D169E72A96A67C25FFDE079535BE7C3
    @Ignore()
    @Test()
    public void getFilterWhenSizeGreaterThanOrEqualsToNumBloomFilterEntries() {
        /* Branches:
         * (size >= numBloomFilterEntries()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = spy(new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(1).when(target).numBloomFilterEntries();
            doNothing().when(target).maybeLookAhead();
            //Act Statement(s)
            BloomFilter result = target.getFilter(1, Double.parseDouble("0.5"), 1);
            BasicKeyChain basicKeyChain = new BasicKeyChain();
            BloomFilter bloomFilter = basicKeyChain.getFilter(1, Double.parseDouble("0.5"), 1);
            //Assert statement(s)
            assertThat(result, equalTo(bloomFilter));
            verify(keyMock, atLeast(1)).isPubKeyOnly();
            verify(keyMock, atLeast(1)).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()), atLeast(1));
            verify(target, atLeast(1)).numBloomFilterEntries();
            verify(target, atLeast(1)).maybeLookAhead();
        }
    }

    //Sapient generated method id: ${cea97df8-b16a-3f07-a942-73eae3451f1a}, hash: 43BF05A765C1273E4A9983E1BCC98016
    @Ignore()
    @Test()
    public void getFilterWhenSizeLessThanNumBloomFilterEntriesThrowsIllegalArgumentException() {
        /* Branches:
         * (size >= numBloomFilterEntries()) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = spy(new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(2).when(target).numBloomFilterEntries();
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.getFilter(1, Double.parseDouble("0.0"), 0);
            //Assert statement(s)
            verify(keyMock, atLeast(1)).isPubKeyOnly();
            verify(keyMock, atLeast(1)).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()), atLeast(1));
            verify(target, atLeast(1)).numBloomFilterEntries();
        }
    }

    //Sapient generated method id: ${2159584b-7b7b-3556-8b82-f3a9b1f6db15}, hash: 02CDC10C75EEF73D33FA30E2F37BBD0D
    @Ignore()
    @Test()
    public void getLookaheadSizeTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            int result = target.getLookaheadSize();
            //Assert statement(s)
            assertThat(result, equalTo(100));
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${8039b9ff-8cb7-3489-a63f-7eaf57d862bc}, hash: 4720533D5DF303FB0BA6A64A6259B763
    @Ignore()
    @Test()
    public void setLookaheadSizeWhenReadjustThreshold() {
        /* Branches:
         * (this.lookaheadThreshold == calcDefaultLookaheadThreshold()) : true
         * (readjustThreshold) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.setLookaheadSize(0);
            //Assert statement(s)
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${0c5f7ce6-daa8-3e5b-9a07-20c1a0a6c11c}, hash: DFD4657E50019426610ABBC70BDD90CA
    @Ignore()
    @Test()
    public void setLookaheadThresholdWhenNumGreaterThanOrEqualsToLookaheadSizeThrowsIllegalArgumentException() {
        /* Branches:
         * (num >= lookaheadSize) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Threshold larger or equal to the lookaheadSize");
            thrown.expect(IllegalArgumentException.class);
            thrown.expectMessage(illegalArgumentException.getMessage());
            //Act Statement(s)
            target.setLookaheadThreshold(100);
            //Assert statement(s)
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${6cc4e2c9-e1a0-3cc4-a34e-afdea2942438}, hash: B119724EE9A83FDFCD9D58E0182995B1
    @Ignore()
    @Test()
    public void setLookaheadThresholdWhenNumLessThanLookaheadSize() {
        /* Branches:
         * (num >= lookaheadSize) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.setLookaheadThreshold(1);
            //Assert statement(s)
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${86f32f90-7267-3c2a-a55b-b567e02f5f85}, hash: 29B5E032F8F6464D53201F9219F95364
    @Ignore()
    @Test()
    public void getLookaheadThresholdWhenLookaheadThresholdLessThanLookaheadSize() {
        /* Branches:
         * (lookaheadThreshold >= lookaheadSize) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            int result = target.getLookaheadThreshold();
            //Assert statement(s)
            assertThat(result, equalTo(33));
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${eadf6cb0-7c58-35fa-b0ff-3afe92aef8bf}, hash: B8B2F92C328B053F8020AC36E92D6F9D
    @Ignore()
    @Test()
    public void maybeLookAheadThrowsIllegalStateException() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.maybeLookAhead();
            //Assert statement(s)
            verify(keyMock, atLeast(1)).isPubKeyOnly();
            verify(keyMock, atLeast(1)).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${cbfcaee5-a27e-3ce2-ad47-8d7688b8c792}, hash: 2B8D24D3C7B8CF19811066ADA8082F98
    @Ignore()
    @Test()
    public void getIssuedExternalKeysTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            int result = target.getIssuedExternalKeys();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${7a4e6cd2-9cd3-3ec9-af8e-ce3cc8155c5d}, hash: 52BBA157D7E585AFC5F89FE300855E0B
    @Ignore()
    @Test()
    public void getIssuedInternalKeysTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            int result = target.getIssuedInternalKeys();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${d93cdc67-af80-3c82-801b-04cf584a65e7}, hash: 22F1E8316326A83BE4C8F143CEBA5621
    @Ignore()
    @Test()
    public void getSeedTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            DeterministicSeed result = target.getSeed();
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${4e7d2e89-11e9-3e0d-97cb-717109d13dea}, hash: 0AA7FC014AD56E4DB9312928A73573DC
    @Ignore()
    @Test()
    public void getKeys1WhenNotIncludeLookahead() {
        /* Branches:
         * (!includeLookahead) : true  #  inside filterKeys method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        HDPath hDPathMock2 = mock(HDPath.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(hDPathMock2).when(internalParentKeyMock).getPath();
            doReturn(0).when(hDPathMock2).size();
            //Act Statement(s)
            List<DeterministicKey> result = target.getKeys(false, false);
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(internalParentKeyMock).getPath();
            verify(hDPathMock2).size();
        }
    }

    //Sapient generated method id: ${2a70716c-728a-3718-9445-1e79ba221682}, hash: CD15303AB5E4ED6B427694B0297742E4
    @Ignore()
    @Test()
    public void getKeys1WhenIncludeLookahead() {
        /* Branches:
         * (!includeLookahead) : false  #  inside filterKeys method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            List<DeterministicKey> result = target.getKeys(true, false);
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${d6b3087e-d2ea-358c-9a5c-2168a5f23750}, hash: 335956EEACEB58FE399FF2EA598C073D
    @Ignore()
    @Test()
    public void getIssuedReceiveKeysWhenNotIncludeLookahead() {
        /* Branches:
         * (!includeLookahead) : true  #  inside filterKeys method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain, object of type Predicate
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        HDPath hDPathMock2 = mock(HDPath.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(hDPathMock2).when(internalParentKeyMock).getPath();
            doReturn(0).when(hDPathMock2).size();
            //Act Statement(s)
            List<DeterministicKey> result = target.getIssuedReceiveKeys();
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(internalParentKeyMock).getPath();
            verify(hDPathMock2).size();
        }
    }

    //Sapient generated method id: ${3ba5323b-96a8-35a0-9a6f-699bdbb62cdc}, hash: 1AEF72A83366B2D50103DC73A075AB7D
    @Ignore()
    @Test()
    public void getLeafKeysTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            List<DeterministicKey> result = target.getLeafKeys();
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${6c5ffd57-9b40-3d57-9289-1e667f128776}, hash: 6B9C53477CD4476B0A88CF292F9B2A04
    @Ignore()
    @Test()
    public void serializeSeedEncryptableItemWhenSeedGetEncryptionTypeEqualsProtosWalletEncryptionTypeENCRYPTED_SCRYPT_AES() {
        /* Branches:
         * (seed.isEncrypted()) : true
         * (seed.getEncryptedSeedData() != null) : true
         * (seed.getEncryptionType() == Protos.Wallet.EncryptionType.ENCRYPTED_SCRYPT_AES) : true
         */
        //Arrange Statement(s)
        DeterministicSeed seedMock = mock(DeterministicSeed.class);
        EncryptedData encryptedDataMock = mock(EncryptedData.class);
        Protos.Key.Builder protoMock = mock(Protos.Key.Builder.class);
        Protos.EncryptedData protosEncryptedDataMock = mock(Protos.EncryptedData.class);
        Protos.EncryptedData.Builder protosEncryptedDataBuilderMock = mock(Protos.EncryptedData.Builder.class);
        Protos.EncryptedData.Builder protosEncryptedDataBuilderMock2 = mock(Protos.EncryptedData.Builder.class);
        ByteString byteStringMock = mock(ByteString.class);
        Protos.EncryptedData.Builder protosEncryptedDataBuilderMock3 = mock(Protos.EncryptedData.Builder.class);
        ByteString byteStringMock2 = mock(ByteString.class);
        Protos.Key.Builder protosKeyBuilderMock = mock(Protos.Key.Builder.class);
        try (MockedStatic<ByteString> byteString = mockStatic(ByteString.class)) {
            doReturn(true).when(seedMock).isEncrypted();
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{};
            EncryptedData encryptedData = new EncryptedData(byteArray, byteArray2);
            doReturn(encryptedDataMock, encryptedData).when(seedMock).getEncryptedSeedData();
            doReturn(Protos.Wallet.EncryptionType.ENCRYPTED_SCRYPT_AES).when(seedMock).getEncryptionType();
            doReturn(protosEncryptedDataMock).when(protoMock).getEncryptedDeterministicSeed();
            doReturn(protosEncryptedDataBuilderMock).when(protosEncryptedDataMock).toBuilder();
            doReturn(protosEncryptedDataBuilderMock2).when(protosEncryptedDataBuilderMock).setEncryptedPrivateKey(byteStringMock);
            doReturn(protosEncryptedDataBuilderMock3).when(protosEncryptedDataBuilderMock2).setInitialisationVector(byteStringMock2);
            doReturn(protosKeyBuilderMock).when(protoMock).setEncryptedDeterministicSeed(protosEncryptedDataBuilderMock3);
            byteString.when(() -> ByteString.copyFrom(byteArray2)).thenReturn(byteStringMock);
            byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteStringMock2);
            //Act Statement(s)
            DeterministicKeyChain.serializeSeedEncryptableItem(seedMock, protoMock);
            //Assert statement(s)
            verify(seedMock).isEncrypted();
            verify(seedMock, times(2)).getEncryptedSeedData();
            verify(seedMock).getEncryptionType();
            verify(protoMock).getEncryptedDeterministicSeed();
            verify(protosEncryptedDataMock).toBuilder();
            verify(protosEncryptedDataBuilderMock).setEncryptedPrivateKey(byteStringMock);
            verify(protosEncryptedDataBuilderMock2).setInitialisationVector(byteStringMock2);
            verify(protoMock).setEncryptedDeterministicSeed(protosEncryptedDataBuilderMock3);
            byteString.verify(() -> ByteString.copyFrom(byteArray2), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${6bee0f5f-83ed-3585-8033-51cd7dd91bce}, hash: 55066944FFDB4D6AB1A0429A3467E135
    @Ignore()
    @Test()
    public void serializeSeedEncryptableItemWhenSeedGetEncryptionTypeNotEqualsProtosWalletEncryptionTypeENCRThrowsIllegalStateException() {
        /* Branches:
         * (seed.isEncrypted()) : true
         * (seed.getEncryptedSeedData() != null) : true
         * (seed.getEncryptionType() == Protos.Wallet.EncryptionType.ENCRYPTED_SCRYPT_AES) : false
         */
        //Arrange Statement(s)
        DeterministicSeed seedMock = mock(DeterministicSeed.class);
        EncryptedData encryptedDataMock = mock(EncryptedData.class);
        Protos.Key.Builder protoMock = mock(Protos.Key.Builder.class);
        Protos.EncryptedData protosEncryptedDataMock = mock(Protos.EncryptedData.class);
        Protos.EncryptedData.Builder protosEncryptedDataBuilderMock = mock(Protos.EncryptedData.Builder.class);
        Protos.EncryptedData.Builder protosEncryptedDataBuilderMock2 = mock(Protos.EncryptedData.Builder.class);
        ByteString byteStringMock = mock(ByteString.class);
        Protos.EncryptedData.Builder protosEncryptedDataBuilderMock3 = mock(Protos.EncryptedData.Builder.class);
        ByteString byteStringMock2 = mock(ByteString.class);
        Protos.Key.Builder protosKeyBuilderMock = mock(Protos.Key.Builder.class);
        try (MockedStatic<ByteString> byteString = mockStatic(ByteString.class)) {
            doReturn(true).when(seedMock).isEncrypted();
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{};
            EncryptedData encryptedData = new EncryptedData(byteArray, byteArray2);
            doReturn(encryptedDataMock, encryptedData).when(seedMock).getEncryptedSeedData();
            doReturn(Protos.Wallet.EncryptionType.UNENCRYPTED).when(seedMock).getEncryptionType();
            doReturn(protosEncryptedDataMock).when(protoMock).getEncryptedDeterministicSeed();
            doReturn(protosEncryptedDataBuilderMock).when(protosEncryptedDataMock).toBuilder();
            doReturn(protosEncryptedDataBuilderMock2).when(protosEncryptedDataBuilderMock).setEncryptedPrivateKey(byteStringMock);
            doReturn(protosEncryptedDataBuilderMock3).when(protosEncryptedDataBuilderMock2).setInitialisationVector(byteStringMock2);
            doReturn(protosKeyBuilderMock).when(protoMock).setEncryptedDeterministicSeed(protosEncryptedDataBuilderMock3);
            byteString.when(() -> ByteString.copyFrom(byteArray2)).thenReturn(byteStringMock);
            byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteStringMock2);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            DeterministicKeyChain.serializeSeedEncryptableItem(seedMock, protoMock);
            //Assert statement(s)
            verify(seedMock).isEncrypted();
            verify(seedMock, times(2)).getEncryptedSeedData();
            verify(seedMock).getEncryptionType();
            verify(protoMock).getEncryptedDeterministicSeed();
            verify(protosEncryptedDataMock).toBuilder();
            verify(protosEncryptedDataBuilderMock).setEncryptedPrivateKey(byteStringMock);
            verify(protosEncryptedDataBuilderMock2).setInitialisationVector(byteStringMock2);
            verify(protoMock).setEncryptedDeterministicSeed(protosEncryptedDataBuilderMock3);
            byteString.verify(() -> ByteString.copyFrom(byteArray2), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${62f88299-3b33-3584-b09e-c99f8f2ec8de}, hash: 2E8BA9CBF8B9A9510787599DBF6AB174
    @Test()
    public void serializeSeedEncryptableItemWhenSeedGetEncryptedSeedDataIsNullAndSecretIsNotNull() {
        /* Branches:
         * (seed.isEncrypted()) : true
         * (seed.getEncryptedSeedData() != null) : false
         * (secret != null) : true
         */
        //Arrange Statement(s)
        DeterministicSeed seedMock = mock(DeterministicSeed.class);
        Protos.Key.Builder protoMock = mock(Protos.Key.Builder.class);
        Protos.Key.Builder protosKeyBuilderMock = mock(Protos.Key.Builder.class);
        ByteString byteStringMock = mock(ByteString.class);
        try (MockedStatic<ByteString> byteString = mockStatic(ByteString.class)) {
            doReturn(true).when(seedMock).isEncrypted();
            doReturn(null).when(seedMock).getEncryptedSeedData();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(seedMock).getSeedBytes();
            doReturn(protosKeyBuilderMock).when(protoMock).setDeterministicSeed(byteStringMock);
            byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteStringMock);
            //Act Statement(s)
            DeterministicKeyChain.serializeSeedEncryptableItem(seedMock, protoMock);
            //Assert statement(s)
            verify(seedMock).isEncrypted();
            verify(seedMock).getEncryptedSeedData();
            verify(seedMock).getSeedBytes();
            verify(protoMock).setDeterministicSeed(byteStringMock);
            byteString.verify(() -> ByteString.copyFrom(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${d6c376d8-4b0a-34ec-8ea1-1707f5d158b6}, hash: C848B520289097F954DF06CE0BCD17B1
    @Ignore()
    @Test()
    public void getKeyLookaheadEpochTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            int result = target.getKeyLookaheadEpoch();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${097c010e-abd4-3965-b79a-93627adbf8ed}, hash: 5F48755B62454386C4AA4CBE6255014A
    @Ignore()
    @Test()
    public void getRedeemDataThrowsUnsupportedOperationException() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(UnsupportedOperationException.class);
            //Act Statement(s)
            target.getRedeemData(deterministicKeyMock);
            //Assert statement(s)
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${fba8354d-c564-3f4b-a60b-58b97a3bab8d}, hash: 349DDAA4199048139A82A477F2BC19BC
    @Ignore()
    @Test()
    public void freshOutputScriptThrowsUnsupportedOperationException() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(UnsupportedOperationException.class);
            //Act Statement(s)
            target.freshOutputScript(KeyChain.KeyPurpose.RECEIVE_FUNDS);
            //Assert statement(s)
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${4e47ec21-4e46-371c-b640-ecf9872fb62e}, hash: A48AEA4C7C4688916ACBDFEF5975F455
    @Ignore()
    @Test()
    public void toStringWhenIsFollowing() {
        /* Branches:
         * (isFollowing) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = new DeterministicKeyChain(keyMock, true, true, ScriptType.P2PKH);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("toString_moreObjects.ToStringHelper2"));
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${f6f28d8c-4d24-3609-893d-eebec0ac32cc}, hash: C527DDE03931FB43BCE95B1D6A5731D3
    @Ignore()
    @Test()
    public void toString1WhenWatchingKeyCreationTimeIsPresent() {
        /* Branches:
         * (seed != null) : false
         * (watchingKeyCreationTime.isPresent()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        Network networkMock = mock(Network.class);
        AesKey aesKeyMock = mock(AesKey.class);
        try (MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            timeUtils.when(() -> TimeUtils.dateTimeFormat((Instant) any())).thenReturn("A");
            target = spy(new DeterministicKeyChain(keyMock, false, true, ScriptType.P2TR));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(deterministicKeyMock).when(target).getWatchingKey();
            Instant instant = (Instant) Instant.ofEpochSecond(1700000000);
            doReturn(Optional.of(instant)).when(deterministicKeyMock).creationTime();
            doReturn("B").when(deterministicKeyMock).serializePubB58(networkMock, ScriptType.P2TR);
            StringBuilder stringBuilder = new StringBuilder();
            doNothing().when(target).formatAddresses(false, false, aesKeyMock, networkMock, stringBuilder);
            //Act Statement(s)
            String result = target.toString(false, false, aesKeyMock, networkMock);
            //Assert statement(s)
            assertThat(result, equalTo("Key birthday:      2  [A]\nOuput script type: P2TR\nKey to watch:      B\nLookahead siz/thr: 100/33\n"));
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            timeUtils.verify(() -> TimeUtils.dateTimeFormat((Instant) any()));
            verify(target).getWatchingKey();
            verify(deterministicKeyMock).creationTime();
            verify(deterministicKeyMock).serializePubB58(networkMock, ScriptType.P2TR);
            verify(target).formatAddresses(false, false, aesKeyMock, networkMock, stringBuilder);
        }
    }

    //Sapient generated method id: ${90a4c255-4d4a-33b9-85b8-18ab9a088e51}, hash: D65FAA98F177F177DE28FB7E573FA846
    @Ignore()
    @Test()
    public void toString1WhenWatchingKeyCreationTimeNotIsPresent() {
        /* Branches:
         * (seed != null) : false
         * (watchingKeyCreationTime.isPresent()) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        Network networkMock = mock(Network.class);
        AesKey aesKeyMock = mock(AesKey.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = spy(new DeterministicKeyChain(keyMock, false, true, ScriptType.P2TR));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(deterministicKeyMock).when(target).getWatchingKey();
            doReturn(Optional.empty()).when(deterministicKeyMock).creationTime();
            doReturn("A").when(deterministicKeyMock).serializePubB58(networkMock, ScriptType.P2TR);
            StringBuilder stringBuilder = new StringBuilder();
            doNothing().when(target).formatAddresses(false, false, aesKeyMock, networkMock, stringBuilder);
            //Act Statement(s)
            String result = target.toString(false, false, aesKeyMock, networkMock);
            //Assert statement(s)
            assertThat(result, equalTo("Key birthday:      unknown\nOuput script type: P2TR\nKey to watch:      A\nLookahead siz/thr: 100/33\n"));
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(target).getWatchingKey();
            verify(deterministicKeyMock).creationTime();
            verify(deterministicKeyMock).serializePubB58(networkMock, ScriptType.P2TR);
            verify(target).formatAddresses(false, false, aesKeyMock, networkMock, stringBuilder);
        }
    }

    //Sapient generated method id: ${5e3eb7f2-e7a6-3bec-b66d-185c084763b9}, hash: 0AD443F85B617F18962486132F2D3BA6
    @Ignore()
    @Test()
    public void toString2Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock = mock(NetworkParameters.class);
        Network networkMock = mock(Network.class);
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        AesKey aesKeyMock = mock(AesKey.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(networkMock).when(paramsMock).network();
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = spy(new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn("return_of_toString1").when(target).toString(false, false, aesKeyMock, networkMock);
            //Act Statement(s)
            String result = target.toString(false, false, aesKeyMock, paramsMock);
            //Assert statement(s)
            assertThat(result, equalTo("return_of_toString1"));
            verify(paramsMock).network();
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(target).toString(false, false, aesKeyMock, networkMock);
        }
    }

    //Sapient generated method id: ${31bc15ae-5ece-3653-90f2-6c94c8d1e5b1}, hash: 6C87D6AADFC5F42C5298D4E7374FD48F
    @Ignore()
    @Test()
    public void formatAddressesWhenKeyEqualsGetRootKeyThrowsNullPointerException() {
        /* Branches:
         * (for-each(getKeys(includeLookahead, true))) : true
         * (key.equals(getRootKey())) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        AesKey aesKeyMock = mock(AesKey.class);
        Network networkMock = mock(Network.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = spy(new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<DeterministicKey> deterministicKeyList = new ArrayList<>();
            deterministicKeyList.add((DeterministicKey) null);
            doReturn(deterministicKeyList).when(target).getKeys(false, true);
            thrown.expect(NullPointerException.class);
            StringBuilder stringBuilder = new StringBuilder();
            //Act Statement(s)
            target.formatAddresses(false, false, aesKeyMock, networkMock, stringBuilder);
            //Assert statement(s)
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(target).getKeys(false, true);
        }
    }

    //Sapient generated method id: ${9997590a-61d9-32e4-8bd8-29f426ebd23b}, hash: 2A3064C9C4543AA0395E8BF4F606D34D
    @Ignore()
    @Test()
    public void formatAddressesWhenKeyEqualsGetWatchingKey() {
        /* Branches:
         * (for-each(getKeys(includeLookahead, true))) : true
         * (key.equals(getRootKey())) : false
         * (key.equals(getWatchingKey())) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        AesKey aesKeyMock = mock(AesKey.class);
        Network networkMock = mock(Network.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = spy(new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<DeterministicKey> deterministicKeyList = new ArrayList<>();
            deterministicKeyList.add(deterministicKeyMock);
            doReturn(deterministicKeyList).when(target).getKeys(false, true);
            StringBuilder stringBuilder = new StringBuilder();
            doNothing().when(deterministicKeyMock).formatKeyWithAddress(false, aesKeyMock, stringBuilder, networkMock, ScriptType.P2PKH, "account");
            doReturn(deterministicKeyMock).when(target).getWatchingKey();
            //Act Statement(s)
            target.formatAddresses(false, false, aesKeyMock, networkMock, stringBuilder);
            //Assert statement(s)
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(target).getKeys(false, true);
            verify(deterministicKeyMock).formatKeyWithAddress(false, aesKeyMock, stringBuilder, networkMock, ScriptType.P2PKH, "account");
            verify(target).getWatchingKey();
        }
    }

    //Sapient generated method id: ${6d8e7af3-51cd-355f-994b-0e732bcad99f}, hash: 597A23EE9335B901AE9C430CC3B7C65B
    @Ignore()
    @Test()
    public void formatAddressesWhenKeyEqualsInternalParentKey() {
        /* Branches:
         * (for-each(getKeys(includeLookahead, true))) : true
         * (key.equals(getRootKey())) : false
         * (key.equals(getWatchingKey())) : false
         * (key.equals(internalParentKey)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        AesKey aesKeyMock = mock(AesKey.class);
        Network networkMock = mock(Network.class);
        DeterministicKey deterministicKeyMock2 = mock(DeterministicKey.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = spy(new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<DeterministicKey> deterministicKeyList = new ArrayList<>();
            deterministicKeyList.add(deterministicKeyMock);
            doReturn(deterministicKeyList).when(target).getKeys(false, true);
            StringBuilder stringBuilder = new StringBuilder();
            doNothing().when(deterministicKeyMock).formatKeyWithAddress(false, aesKeyMock, stringBuilder, networkMock, ScriptType.P2PKH, "internal");
            doReturn(deterministicKeyMock2).when(target).getWatchingKey();
            //Act Statement(s)
            target.formatAddresses(false, false, aesKeyMock, networkMock, stringBuilder);
            //Assert statement(s)
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(target).getKeys(false, true);
            verify(deterministicKeyMock).formatKeyWithAddress(false, aesKeyMock, stringBuilder, networkMock, ScriptType.P2PKH, "internal");
            verify(target).getWatchingKey();
        }
    }

    //Sapient generated method id: ${47e2c111-df98-3f3a-83e6-e0810abf5825}, hash: 6D4C2DAE9305D7FB5E3E928471A09D27
    @Ignore()
    @Test()
    public void formatAddressesWhenKeyEqualsExternalParentKey() {
        /* Branches:
         * (for-each(getKeys(includeLookahead, true))) : true
         * (key.equals(getRootKey())) : false
         * (key.equals(getWatchingKey())) : false
         * (key.equals(internalParentKey)) : false
         * (key.equals(externalParentKey)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        AesKey aesKeyMock = mock(AesKey.class);
        Network networkMock = mock(Network.class);
        DeterministicKey deterministicKeyMock2 = mock(DeterministicKey.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = spy(new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<DeterministicKey> deterministicKeyList = new ArrayList<>();
            deterministicKeyList.add(deterministicKeyMock);
            doReturn(deterministicKeyList).when(target).getKeys(false, true);
            StringBuilder stringBuilder = new StringBuilder();
            doNothing().when(deterministicKeyMock).formatKeyWithAddress(false, aesKeyMock, stringBuilder, networkMock, ScriptType.P2PKH, "external");
            doReturn(deterministicKeyMock2).when(target).getWatchingKey();
            //Act Statement(s)
            target.formatAddresses(false, false, aesKeyMock, networkMock, stringBuilder);
            //Assert statement(s)
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(target).getKeys(false, true);
            verify(deterministicKeyMock).formatKeyWithAddress(false, aesKeyMock, stringBuilder, networkMock, ScriptType.P2PKH, "external");
            verify(target).getWatchingKey();
        }
    }

    //Sapient generated method id: ${a82df580-40ec-3bb4-96e0-f8e917984645}, hash: E37C67B8DA1B3082703524E93334A159
    @Ignore()
    @Test()
    public void formatAddressesWhenKeyGetChildNumberIGreaterThanOrEqualsToIssuedInternalKeys() {
        /* Branches:
         * (for-each(getKeys(includeLookahead, true))) : true
         * (key.equals(getRootKey())) : false
         * (key.equals(getWatchingKey())) : false
         * (key.equals(internalParentKey)) : false
         * (key.equals(externalParentKey)) : false
         * (internalParentKey.equals(key.getParent())) : true
         * (key.getChildNumber().i() >= issuedInternalKeys) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        ChildNumber childNumberMock = mock(ChildNumber.class);
        AesKey aesKeyMock = mock(AesKey.class);
        Network networkMock = mock(Network.class);
        DeterministicKey deterministicKeyMock2 = mock(DeterministicKey.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = spy(new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<DeterministicKey> deterministicKeyList = new ArrayList<>();
            deterministicKeyList.add(deterministicKeyMock);
            doReturn(deterministicKeyList).when(target).getKeys(false, true);
            doReturn(internalParentKeyMock).when(deterministicKeyMock).getParent();
            doReturn(childNumberMock).when(deterministicKeyMock).getChildNumber();
            doReturn(1).when(childNumberMock).i();
            StringBuilder stringBuilder = new StringBuilder();
            doNothing().when(deterministicKeyMock).formatKeyWithAddress(false, aesKeyMock, stringBuilder, networkMock, ScriptType.P2PKH, "*");
            doReturn(deterministicKeyMock2).when(target).getWatchingKey();
            //Act Statement(s)
            target.formatAddresses(false, false, aesKeyMock, networkMock, stringBuilder);
            //Assert statement(s)
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(target).getKeys(false, true);
            verify(deterministicKeyMock).getParent();
            verify(deterministicKeyMock).getChildNumber();
            verify(childNumberMock).i();
            verify(deterministicKeyMock).formatKeyWithAddress(false, aesKeyMock, stringBuilder, networkMock, ScriptType.P2PKH, "*");
            verify(target).getWatchingKey();
        }
    }

    //Sapient generated method id: ${692cd886-895f-32ff-ac49-c394847eae16}, hash: E1B4E62871BDCBBEA23D3E0EAED23C21
    @Ignore()
    @Test()
    public void formatAddressesWhenExternalParentKeyEqualsKeyGetParentAndKeyGetChildNumberIGreaterThanOrEqualsToIssuedExternalKeys() {
        /* Branches:
         * (for-each(getKeys(includeLookahead, true))) : true
         * (key.equals(getRootKey())) : false
         * (key.equals(getWatchingKey())) : false
         * (key.equals(internalParentKey)) : false
         * (key.equals(externalParentKey)) : false
         * (internalParentKey.equals(key.getParent())) : true
         * (key.getChildNumber().i() >= issuedInternalKeys) : false
         * (externalParentKey.equals(key.getParent())) : true
         * (key.getChildNumber().i() >= issuedExternalKeys) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        ChildNumber childNumberMock = mock(ChildNumber.class);
        DeterministicKey deterministicKeyMock2 = mock(DeterministicKey.class);
        ChildNumber childNumberMock2 = mock(ChildNumber.class);
        AesKey aesKeyMock = mock(AesKey.class);
        Network networkMock = mock(Network.class);
        DeterministicKey deterministicKeyMock3 = mock(DeterministicKey.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = spy(new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<DeterministicKey> deterministicKeyList = new ArrayList<>();
            deterministicKeyList.add(deterministicKeyMock);
            doReturn(deterministicKeyList).when(target).getKeys(false, true);
            doReturn(-1).when(childNumberMock).i();
            doReturn(internalParentKeyMock, deterministicKeyMock2).when(deterministicKeyMock).getParent();
            doReturn(childNumberMock, childNumberMock2).when(deterministicKeyMock).getChildNumber();
            doReturn(0).when(childNumberMock2).i();
            StringBuilder stringBuilder = new StringBuilder();
            doNothing().when(deterministicKeyMock).formatKeyWithAddress(false, aesKeyMock, stringBuilder, networkMock, ScriptType.P2PKH, "*");
            doReturn(deterministicKeyMock3).when(target).getWatchingKey();
            //Act Statement(s)
            target.formatAddresses(false, false, aesKeyMock, networkMock, stringBuilder);
            //Assert statement(s)
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(target).getKeys(false, true);
            verify(deterministicKeyMock, times(2)).getParent();
            verify(deterministicKeyMock, times(2)).getChildNumber();
            verify(childNumberMock).i();
            verify(childNumberMock2).i();
            verify(deterministicKeyMock).formatKeyWithAddress(false, aesKeyMock, stringBuilder, networkMock, ScriptType.P2PKH, "*");
            verify(target).getWatchingKey();
        }
    }

    //Sapient generated method id: ${081890d5-35e0-3cd3-9ffe-818669a4f9b4}, hash: F3E3C8FF2585E088AD92AB158A463C87
    @Ignore()
    @Test()
    public void findRedeemDataByScriptHashTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basicKeyChain
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey keyMock = mock(DeterministicKey.class);
        HDPath hDPathMock = mock(HDPath.class);
        ByteString byteStringMock = mock(ByteString.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isPubKeyOnly();
            doReturn(hDPathMock).when(keyMock).getPath();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = new DeterministicKeyChain(keyMock, false, true, ScriptType.P2PKH);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            RedeemData result = target.findRedeemDataByScriptHash(byteStringMock);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            verify(keyMock).isPubKeyOnly();
            verify(keyMock).getPath();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }
}
