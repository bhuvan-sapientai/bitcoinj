package org.bitcoinj.wallet;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.crypto.KeyCrypterException;
import org.bitcoinj.base.Network;
import org.junit.rules.ExpectedException;

import java.util.List;

import org.bitcoinj.base.ScriptType;
import org.bitcoinj.crypto.DeterministicKey;
import org.bitcoinj.crypto.ECKey;
import org.bitcoinj.wallet.listeners.CurrentKeyChangeEventListener;
import org.bitcoinj.core.NetworkParameters;

import java.util.ArrayList;

import org.bitcoinj.protobuf.wallet.Protos;
import org.bitcoinj.crypto.KeyCrypter;
import org.bitcoinj.base.LegacyAddress;
import org.bitcoinj.wallet.listeners.KeyChainEventListener;
import org.bitcoinj.script.Script;
import org.bitcoinj.crypto.AesKey;
import org.bitcoinj.base.Address;
import org.mockito.stubbing.Answer;

import java.util.concurrent.Executor;

import org.bitcoinj.base.internal.TimeUtils;
import org.bitcoinj.crypto.HDPath;
import org.bitcoinj.base.internal.Preconditions;
import org.bitcoinj.utils.ListenerRegistration;

import java.util.concurrent.CopyOnWriteArrayList;

import org.bitcoinj.base.BitcoinNetwork;
import com.google.protobuf.ByteString;
import org.bitcoinj.core.BloomFilter;

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
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

public class KeyChainGroupSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "keyCrypter");

    private final LegacyAddress addressMock = mock(LegacyAddress.class);

    private final AesKey aesKeyMock = mock(AesKey.class);

    private final BasicKeyChain basicKeyChainMock = mock(BasicKeyChain.class);

    private final ByteString byteStringMock = mock(ByteString.class);

    private final CurrentKeyChangeEventListener currentKeyChangeEventListenerMock = mock(CurrentKeyChangeEventListener.class);

    private final DeterministicKeyChain deterministicKeyChainMock = mock(DeterministicKeyChain.class);

    private final DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);

    private final DeterministicSeed deterministicSeedMock = mock(DeterministicSeed.class);

    private final ECKey eCKeyMock = mock(ECKey.class);

    private final Executor executorMock = mock(Executor.class);

    private final KeyChainEventListener keyChainEventListenerMock = mock(KeyChainEventListener.class);

    private final KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class);

    private final KeyChainGroup.Builder keyChainGroupBuilderMock = mock(KeyChainGroup.Builder.class);

    private final KeyChainGroup keyChainGroupMock = mock(KeyChainGroup.class);

    private final KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);

    private final KeyCrypter keyCrypterMock2 = mock(KeyCrypter.class);

    private final Network networkMock = mock(Network.class);

    private final Network networkMock2 = mock(Network.class);

    private final NetworkParameters networkParametersMock = mock(NetworkParameters.class);

    private final NetworkParameters paramsMock = mock(NetworkParameters.class);

    private final Script scriptMock = mock(Script.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${2db419e2-4303-3e7b-b012-60022e96fe83}, hash: 186EFC93068E6B40D1F6F4774193D3EC
    @Test()
    public void createBasicWhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 283)) : false  #  inside <init> method
         * (branch expression (line 284)) : false  #  inside <init> method
         * (branch expression (line 300)) : false  #  inside <init> method
         */
        //Act Statement(s)
        KeyChainGroup result = KeyChainGroup.createBasic(networkMock);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${21cdcafe-93b7-3d27-bab3-f06179abbdbf}, hash: DDD655E1685C7D70A0D85096E944E8BE
    @Test()
    public void createBasic1Test() {
        //Arrange Statement(s)
        try (MockedStatic<KeyChainGroup> keyChainGroup = mockStatic(KeyChainGroup.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock).when(paramsMock).network();
            keyChainGroup.when(() -> KeyChainGroup.createBasic(networkMock)).thenReturn(keyChainGroupMock);
            //Act Statement(s)
            KeyChainGroup result = KeyChainGroup.createBasic(paramsMock);
            //Assert statement(s)
            assertThat(result, equalTo(keyChainGroupMock));
            verify(paramsMock, atLeast(1)).network();
            keyChainGroup.verify(() -> KeyChainGroup.createBasic(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${ed212fe2-2afd-3617-872a-5724a1f34c1c}, hash: 425D964FE5AD2E36B44DFAE857C1856E
    @Test()
    public void builderTest() {
        //Act Statement(s)
        KeyChainGroup.Builder result = KeyChainGroup.builder(networkMock);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${8285b4a2-d634-38d5-81a1-7c26cb7edae1}, hash: DB1101AF0CBA6404D6FE3432D55A796E
    @Test()
    public void builder1Test() {
        //Arrange Statement(s)
        try (MockedStatic<KeyChainGroup> keyChainGroup = mockStatic(KeyChainGroup.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock).when(paramsMock).network();
            keyChainGroup.when(() -> KeyChainGroup.builder(networkMock)).thenReturn(keyChainGroupBuilderMock);
            //Act Statement(s)
            KeyChainGroup.Builder result = KeyChainGroup.builder(paramsMock);
            //Assert statement(s)
            assertThat(result, equalTo(keyChainGroupBuilderMock));
            verify(paramsMock, atLeast(1)).network();
            keyChainGroup.verify(() -> KeyChainGroup.builder(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${8babf19b-4ca2-300c-a3c9-84d88a3e0a37}, hash: CEF9610B52FDAB13C4C898B7B851B6C5
    @Test()
    public void builder2Test() {
        //Act Statement(s)
        KeyChainGroup.Builder result = KeyChainGroup.builder(networkMock, keyChainGroupStructureMock);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${f4b7f558-96b7-3c27-a3ef-61390dff4e9c}, hash: E525B35DB7EC3CB26D48A050BD5B2964
    @Test()
    public void builder3Test() {
        //Arrange Statement(s)
        try (MockedStatic<KeyChainGroup> keyChainGroup = mockStatic(KeyChainGroup.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock).when(paramsMock).network();
            keyChainGroup.when(() -> KeyChainGroup.builder(networkMock, keyChainGroupStructureMock)).thenReturn(keyChainGroupBuilderMock);
            //Act Statement(s)
            KeyChainGroup.Builder result = KeyChainGroup.builder(paramsMock, keyChainGroupStructureMock);
            //Assert statement(s)
            assertThat(result, equalTo(keyChainGroupBuilderMock));
            verify(paramsMock, atLeast(1)).network();
            keyChainGroup.verify(() -> KeyChainGroup.builder(networkMock, keyChainGroupStructureMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${44ea1306-e5d0-3b5a-af55-f79643c6c064}, hash: 09C17194324F4A7FE13F03EE34E7DEBB
    @Test()
    public void supportsDeterministicChainsWhenChainsIsNotNull() throws UnreadableWalletException {
        /* Branches:
         * (chains != null) : true
         */
        //Arrange Statement(s)
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "null");
        Network networkMock = mock(Network.class, "main");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            boolean result = target.supportsDeterministicChains();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${669fd98b-fc1c-3efe-b3e1-b70bf17bce03}, hash: EF398708355111C55A3828845BD62D47
    @Ignore()
    @Test()
    public void supportsDeterministicChainsWhenChainsIsNull() throws UnreadableWalletException {
        /* Branches:
         * (chains != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            boolean result = target.supportsDeterministicChains();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${2b04d907-ee7d-3dd8-b72d-81136fe9daab}, hash: 78189275FB0BEA3ECFE3CAD8C12F0967
    @Test()
    public void isSupportsDeterministicChainsWhenSupportsDeterministicChains() throws UnreadableWalletException {
        /* Branches:
         * (supportsDeterministicChains()) : true
         */
        //Arrange Statement(s)
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "null");
        Network networkMock = mock(Network.class, "main");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(true).when(target).supportsDeterministicChains();
            //Act Statement(s)
            boolean result = target.isSupportsDeterministicChains();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).supportsDeterministicChains();
        }
    }

    //Sapient generated method id: ${0e15db47-1e86-32ab-8e5f-c06189307689}, hash: 95D45F0EA2806B80BCC21F5D72CF711D
    @Test()
    public void isSupportsDeterministicChainsWhenSupportsDeterministicChainsNot() throws UnreadableWalletException {
        /* Branches:
         * (supportsDeterministicChains()) : false
         */
        //Arrange Statement(s)
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "null");
        Network networkMock = mock(Network.class, "main");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(false).when(target).supportsDeterministicChains();
            //Act Statement(s)
            boolean result = target.isSupportsDeterministicChains();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).supportsDeterministicChains();
        }
    }

    //Sapient generated method id: ${1fa5f7b9-bbce-3706-b081-a7df8d4cccc0}, hash: 047C8B20A3A8FABE002480D7B284F9FA
    @Ignore()
    @Test()
    public void addAndActivateHDChainWhenCurrentKeyChangeListenersIsEmpty() throws UnreadableWalletException {
        /* Branches:
         * (for-each(basic.getListeners())) : true
         * (lookaheadSize >= 0) : true
         * (lookaheadThreshold >= 0) : true
         * (for-each(currentKeyChangeListeners)) : false  #  inside queueOnCurrentKeyChanged method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basic
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKeyChain chainMock = mock(DeterministicKeyChain.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            doNothing().when(chainMock).addEventListener(keyChainEventListenerMock, executorMock);
            doNothing().when(chainMock).setLookaheadSize(0);
            doNothing().when(chainMock).setLookaheadThreshold(0);
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(false).when(target).supportsDeterministicChains();
            //Act Statement(s)
            target.addAndActivateHDChain(chainMock);
            //Assert statement(s)
            verify(chainMock).addEventListener(keyChainEventListenerMock, executorMock);
            verify(chainMock).setLookaheadSize(0);
            verify(chainMock).setLookaheadThreshold(0);
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
            verify(target).supportsDeterministicChains();
        }
    }

    //Sapient generated method id: ${1dfc1bae-6da8-39ed-8e8e-10c11856d532}, hash: 7973F8F0E73AD8EEC9518DA7BEA65BF6
    @Test()
    public void currentKeyWhenCurrentIsNull() throws UnreadableWalletException {
        /* Branches:
         * (current == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(deterministicKeyChainMock).when(target).getActiveKeyChain();
            doReturn(deterministicKeyMock).when(target).freshKey(KeyChain.KeyPurpose.RECEIVE_FUNDS);
            //Act Statement(s)
            DeterministicKey result = target.currentKey(KeyChain.KeyPurpose.RECEIVE_FUNDS);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyMock));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).getActiveKeyChain();
            verify(target).freshKey(KeyChain.KeyPurpose.RECEIVE_FUNDS);
        }
    }

    //Sapient generated method id: ${4700d8c0-ad4b-347d-a087-63aa9342de39}, hash: E511A9113CCDEB32BE8F638883676338
    @Ignore()
    @Test()
    public void currentAddressWhenOutputScriptTypeEqualsScriptTypeP2WPKH() throws UnreadableWalletException {
        /* Branches:
         * (outputScriptType == ScriptType.P2PKH) : false
         * (outputScriptType == ScriptType.P2WPKH) : true
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "MAINNET");
        Address addressMock = mock(Address.class, "Address");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            Protos.Key key = Protos.Key.getDefaultInstance();
            Protos.Key key2 = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            protosKeyList.add(key2);
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            DeterministicKeyChain deterministicKeyChain2 = DeterministicKeyChain.builder().outputScriptType(ScriptType.P2WPKH).build();
            doReturn(deterministicKeyChain2).when(target).getActiveKeyChain();
            doReturn(deterministicKeyMock).when(target).currentKey(KeyChain.KeyPurpose.RECEIVE_FUNDS);
            doReturn(addressMock).when(deterministicKeyMock).toAddress(ScriptType.P2WPKH, networkMock);
            //Act Statement(s)
            Address result = target.currentAddress(KeyChain.KeyPurpose.RECEIVE_FUNDS);
            //Assert statement(s)
            assertThat(result, equalTo(addressMock));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).getActiveKeyChain();
            verify(target).currentKey(KeyChain.KeyPurpose.RECEIVE_FUNDS);
            verify(deterministicKeyMock).toAddress(ScriptType.P2WPKH, networkMock);
        }
    }

    //Sapient generated method id: ${39351ac9-8df5-35d1-9baa-eafb246b3330}, hash: 13DC6279A23242D8E4B94F7CE3C62808
    @Ignore()
    @Test()
    public void currentAddressWhenOutputScriptTypeNotEqualsScriptTypeP2WPKHThrowsIllegalStateException() throws UnreadableWalletException {
        /* Branches:
         * (outputScriptType == ScriptType.P2PKH) : false
         * (outputScriptType == ScriptType.P2WPKH) : false
         */
        //Arrange Statement(s)
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "cRjJ4vGZzJ8JZzJ8JZzJ8JZzJ8JZzJ8JZzJ8JZzJ8JZzJ8JZzJ8");
        Network networkMock = mock(Network.class, "MAINNET");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            Protos.Key key = Protos.Key.getDefaultInstance();
            Protos.Key key2 = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            protosKeyList.add(key2);
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            DeterministicKeyChain deterministicKeyChain2 = DeterministicKeyChain.builder().outputScriptType(ScriptType.P2TR).build();
            doReturn(deterministicKeyChain2).when(target).getActiveKeyChain();
            IllegalStateException illegalStateException = new IllegalStateException("P2TR");
            thrown.expect(IllegalStateException.class);
            thrown.expectMessage(illegalStateException.getMessage());
            //Act Statement(s)
            target.currentAddress(KeyChain.KeyPurpose.RECEIVE_FUNDS);
            //Assert statement(s)
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).getActiveKeyChain();
        }
    }

    //Sapient generated method id: ${c7473f39-055c-3be2-a4d9-f5a3918f676a}, hash: 44CD523D0674A6B89EF5E223EAD96F34
    @Test()
    public void freshKeyTest() throws UnreadableWalletException {
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            List<DeterministicKey> deterministicKeyList = new ArrayList<>();
            deterministicKeyList.add(deterministicKeyMock);
            doReturn(deterministicKeyList).when(target).freshKeys(KeyChain.KeyPurpose.RECEIVE_FUNDS, 1);
            //Act Statement(s)
            DeterministicKey result = target.freshKey(KeyChain.KeyPurpose.RECEIVE_FUNDS);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyMock));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).freshKeys(KeyChain.KeyPurpose.RECEIVE_FUNDS, 1);
        }
    }

    //Sapient generated method id: ${b83c3305-ad57-368d-8ec5-b45ffefcdb25}, hash: 33142C03EA0FA7CCAE40EF1E259E7D27
    @Test()
    public void freshKeysTest() throws UnreadableWalletException {
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(deterministicKeyChainMock).when(target).getActiveKeyChain();
            List<DeterministicKey> deterministicKeyList = new ArrayList<>();
            doReturn(deterministicKeyList).when(deterministicKeyChainMock).getKeys(KeyChain.KeyPurpose.RECEIVE_FUNDS, 0);
            //Act Statement(s)
            List<DeterministicKey> result = target.freshKeys(KeyChain.KeyPurpose.RECEIVE_FUNDS, 0);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyList));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).getActiveKeyChain();
            verify(deterministicKeyChainMock).getKeys(KeyChain.KeyPurpose.RECEIVE_FUNDS, 0);
        }
    }

    //Sapient generated method id: ${9fdd0f4f-b541-3f70-a4a5-02f0634c8ead}, hash: 3400E0C039C1325F482E4039F031D93D
    @Ignore()
    @Test()
    public void freshAddress2WhenOutputScriptTypeEqualsScriptTypeP2WPKH() throws UnreadableWalletException {
        /* Branches:
         * (outputScriptType == ScriptType.P2PKH) : false
         * (outputScriptType == ScriptType.P2WPKH) : true
         */
        //Arrange Statement(s)
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "null");
        Network networkMock = mock(Network.class, "MAINNET");
        Address addressMock = mock(Address.class, "Address");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            DeterministicKeyChain deterministicKeyChain2 = DeterministicKeyChain.builder().outputScriptType(ScriptType.P2WPKH).build();
            doReturn(deterministicKeyChain2).when(target).getActiveKeyChain();
            doReturn(deterministicKeyMock).when(target).freshKey(KeyChain.KeyPurpose.RECEIVE_FUNDS);
            doReturn(addressMock).when(deterministicKeyMock).toAddress(ScriptType.P2WPKH, networkMock);
            //Act Statement(s)
            Address result = target.freshAddress(KeyChain.KeyPurpose.RECEIVE_FUNDS);
            //Assert statement(s)
            assertThat(result, equalTo(addressMock));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).getActiveKeyChain();
            verify(target).freshKey(KeyChain.KeyPurpose.RECEIVE_FUNDS);
            verify(deterministicKeyMock).toAddress(ScriptType.P2WPKH, networkMock);
        }
    }

    //Sapient generated method id: ${60869a14-91f0-3f33-b44d-1c81675cb083}, hash: 6C969BDD6066568F9F0199F9556721B5
    @Ignore()
    @Test()
    public void freshAddress2WhenOutputScriptTypeNotEqualsScriptTypeP2WPKHThrowsIllegalStateException() throws UnreadableWalletException {
        /* Branches:
         * (outputScriptType == ScriptType.P2PKH) : false
         * (outputScriptType == ScriptType.P2WPKH) : false
         */
        //Arrange Statement(s)
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "cRjJZ5zJ5zJ5zJ5zJ5zJ5zJ5zJ5zJ5zJ5zJ5zJ5zJ5zJ5zJ5zJ5zJ5zJ5zJ5z");
        Network networkMock = mock(Network.class, "MAINNET");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            Protos.Key key = Protos.Key.getDefaultInstance();
            Protos.Key key2 = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            protosKeyList.add(key2);
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            DeterministicKeyChain deterministicKeyChain2 = DeterministicKeyChain.builder().outputScriptType(ScriptType.P2SH).build();
            doReturn(deterministicKeyChain2).when(target).getActiveKeyChain();
            IllegalStateException illegalStateException = new IllegalStateException("P2SH");
            thrown.expect(IllegalStateException.class);
            thrown.expectMessage(illegalStateException.getMessage());
            //Act Statement(s)
            target.freshAddress(KeyChain.KeyPurpose.RECEIVE_FUNDS);
            //Assert statement(s)
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).getActiveKeyChain();
        }
    }

    //Sapient generated method id: ${97f24622-71df-39e8-85be-67b9a83dc133}, hash: 898B3F9AEE08A624FD64DB875B0AEAD2
    @Ignore()
    @Test()
    public void getActiveKeyChainsWhenChainEarliestKeyCreationTimeCompareToKeyRotationTimeGreaterThanOrEqualsTo0() throws UnreadableWalletException {
        /* Branches:
         * (for-each(chains)) : true
         * (keyRotationTime == null) : false
         * (chain.earliestKeyCreationTime().compareTo(keyRotationTime) >= 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(false).when(target).supportsDeterministicChains();
            Instant instant = Instant.ofEpochSecond(1700000000);
            //Act Statement(s)
            List<DeterministicKeyChain> result = target.getActiveKeyChains(instant);
            //Assert statement(s)
            assertThat(result.size(), equalTo(1));
            assertThat(result.get(0), is(instanceOf(DeterministicKeyChain.class)));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
            verify(target).supportsDeterministicChains();
        }
    }

    //Sapient generated method id: ${b5e3f095-1454-3115-ad95-38ccf7e24207}, hash: B29625D08A62C883AFE74871A32D7806
    @Test()
    public void getActiveKeyChains1WhenKeyRotationTimeSecsGreaterThan0() throws UnreadableWalletException {
        /* Branches:
         * (keyRotationTimeSecs > 0) : true
         */
        //Arrange Statement(s)
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "null");
        Network networkMock = mock(Network.class, "main");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            List<DeterministicKeyChain> deterministicKeyChainList2 = new ArrayList<>();
            doReturn(deterministicKeyChainList2).when(target).getActiveKeyChains((Instant) any());
            //Act Statement(s)
            List<DeterministicKeyChain> result = target.getActiveKeyChains(123456789L);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyChainList2));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).getActiveKeyChains((Instant) any());
        }
    }

    //Sapient generated method id: ${050fb07f-eb48-39ca-8591-13fdad457488}, hash: E90A18631666CF2DB2B6080F874AB60E
    @Test()
    public void getActiveKeyChains1WhenKeyRotationTimeSecsNotGreaterThan0() throws UnreadableWalletException {
        /* Branches:
         * (keyRotationTimeSecs > 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            List<DeterministicKeyChain> deterministicKeyChainList2 = new ArrayList<>();
            doReturn(deterministicKeyChainList2).when(target).getActiveKeyChains((Instant) null);
            //Act Statement(s)
            List<DeterministicKeyChain> result = target.getActiveKeyChains(0L);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyChainList2));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).getActiveKeyChains((Instant) null);
        }
    }

    //Sapient generated method id: ${29188e9d-754b-387d-b776-197cadf31b8b}, hash: AD47C8C1F39CB15A201D1F8A456D47D5
    @Test()
    public void getActiveKeyChainWhenChainsReversedIsEmpty() throws UnreadableWalletException {
        /* Branches:
         * (for-each(chainsReversed)) : false
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "MAINNET");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(false).when(target).supportsDeterministicChains();
            Instant instant = Instant.now();
            //Act Statement(s)
            DeterministicKeyChain result = target.getActiveKeyChain(ScriptType.P2PKH, instant);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
            verify(target).supportsDeterministicChains();
        }
    }

    //Sapient generated method id: ${966f5d82-304d-32de-9c6c-8fb45f771e59}, hash: 1AA5FE8E570F99846EA62DD4B86FFB6D
    @Test()
    public void getActiveKeyChain1WhenKeyRotationTimeSecsGreaterThan0() throws UnreadableWalletException {
        /* Branches:
         * (keyRotationTimeSecs > 0) : true
         */
        //Arrange Statement(s)
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "null");
        Network networkMock = mock(Network.class, "main");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(deterministicKeyChainMock).when(target).getActiveKeyChain(eq(ScriptType.P2PKH), (Instant) any());
            //Act Statement(s)
            DeterministicKeyChain result = target.getActiveKeyChain(ScriptType.P2PKH, 10L);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyChainMock));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).getActiveKeyChain(eq(ScriptType.P2PKH), (Instant) any());
        }
    }

    //Sapient generated method id: ${01ab939c-7a7c-31d5-be54-59e5707b14f7}, hash: D466FA13949E7B0B520B9438099A1835
    @Test()
    public void getActiveKeyChain1WhenKeyRotationTimeSecsNotGreaterThan0() throws UnreadableWalletException {
        /* Branches:
         * (keyRotationTimeSecs > 0) : false
         */
        //Arrange Statement(s)
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "null");
        Network networkMock = mock(Network.class, "main");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(deterministicKeyChainMock).when(target).getActiveKeyChain(ScriptType.P2PKH, (Instant) null);
            //Act Statement(s)
            DeterministicKeyChain result = target.getActiveKeyChain(ScriptType.P2PKH, 0L);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyChainMock));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).getActiveKeyChain(ScriptType.P2PKH, (Instant) null);
        }
    }

    //Sapient generated method id: ${78d4792d-fa4a-3182-867c-25e68b889813}, hash: A27FBBB2C1467C5FEE478E727BF51F3E
    @Test()
    public void getActiveKeyChain2WhenChainsIsEmptyThrowsDeterministicUpgradeRequiredException() throws UnreadableWalletException {
        /* Branches:
         * (chains.isEmpty()) : true
         */
        //Arrange Statement(s)
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "null");
        Network networkMock = mock(Network.class, "Bitcoin");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(false).when(target).supportsDeterministicChains();
            thrown.expect(DeterministicUpgradeRequiredException.class);
            //Act Statement(s)
            target.getActiveKeyChain();
            //Assert statement(s)
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
            verify(target).supportsDeterministicChains();
        }
    }

    //Sapient generated method id: ${a89592e7-6ab5-35c6-ba0d-0d429137b4cd}, hash: 4EEA7C3C6BAA41896456AA8AE39A6E8C
    @Ignore()
    @Test()
    public void getActiveKeyChain2WhenChainsNotIsEmpty() throws UnreadableWalletException {
        /* Branches:
         * (chains.isEmpty()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(false).when(target).supportsDeterministicChains();
            //Act Statement(s)
            DeterministicKeyChain result = target.getActiveKeyChain();
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
            verify(target).supportsDeterministicChains();
        }
    }

    //Sapient generated method id: ${b62f8c5a-a39b-3746-b5cf-04eb01ff2b52}, hash: BFAA20997DCAF4C883725B709365A055
    @Test()
    public void mergeActiveKeyChainsWhenIsEncryptedNotEqualsFromIsEncryptedThrowsIllegalArgumentException() throws UnreadableWalletException {
        /* Branches:
         * (isEncrypted() == from.isEncrypted()) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(true).when(target).isEncrypted();
            thrown.expect(IllegalArgumentException.class);
            KeyChainGroup keyChainGroup = KeyChainGroup.createBasic(networkMock2);
            Instant instant = Instant.now();
            //Act Statement(s)
            target.mergeActiveKeyChains(keyChainGroup, instant);
            //Assert statement(s)
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).isEncrypted();
        }
    }

    //Sapient generated method id: ${4e2d65fd-7050-3827-b040-a06370d6f22d}, hash: 9C20644AD2B10A37A5CB66B05B3E7A73
    @Ignore()
    @Test()
    public void mergeActiveKeyChainsWhenFromGetActiveKeyChainsKeyRotationTimeIsNotEmpty() throws UnreadableWalletException {
        /* Branches:
         * (isEncrypted() == from.isEncrypted()) : true
         * (for-each(from.getActiveKeyChains(keyRotationTime))) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: from
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(false).when(target).isEncrypted();
            doNothing().when(target).addAndActivateHDChain(deterministicKeyChainMock);
            KeyChainGroup keyChainGroup = KeyChainGroup.createBasic(networkMock2);
            Instant instant = Instant.now();
            //Act Statement(s)
            target.mergeActiveKeyChains(keyChainGroup, instant);
            //Assert statement(s)
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).isEncrypted();
            verify(target).addAndActivateHDChain(deterministicKeyChainMock);
        }
    }

    //Sapient generated method id: ${b0efa12f-fcff-38b9-ad68-4dd0532a7f35}, hash: 7865474A890403C02662358664CFFEEC
    @Test()
    public void mergeActiveKeyChains1WhenKeyRotationTimeSecsGreaterThan0() throws UnreadableWalletException {
        /* Branches:
         * (keyRotationTimeSecs > 0) : true
         */
        //Arrange Statement(s)
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "KeyChainFactory");
        Network networkMock = mock(Network.class, "Network");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doNothing().when(target).mergeActiveKeyChains((KeyChainGroup) any(), (Instant) any());
            KeyChainGroup keyChainGroup = KeyChainGroup.createBasic(networkMock2);
            //Act Statement(s)
            target.mergeActiveKeyChains(keyChainGroup, 1L);
            //Assert statement(s)
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).mergeActiveKeyChains((KeyChainGroup) any(), (Instant) any());
        }
    }

    //Sapient generated method id: ${2beb32f3-fb0a-3dc7-926f-cfe04a22ec43}, hash: B1E333D5D85135CE9738F9E34C86A56A
    @Test()
    public void mergeActiveKeyChains1WhenKeyRotationTimeSecsNotGreaterThan0() throws UnreadableWalletException {
        /* Branches:
         * (keyRotationTimeSecs > 0) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doNothing().when(target).mergeActiveKeyChains((KeyChainGroup) any(), eq((Instant) null));
            KeyChainGroup keyChainGroup = KeyChainGroup.createBasic(networkMock2);
            //Act Statement(s)
            target.mergeActiveKeyChains(keyChainGroup, -1L);
            //Assert statement(s)
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).mergeActiveKeyChains((KeyChainGroup) any(), eq((Instant) null));
        }
    }

    //Sapient generated method id: ${83390225-48c7-3f3b-903d-293ea86f8001}, hash: F1F14A986E6F9FE75DFDCD3812B4DA6F
    @Ignore()
    @Test()
    public void getLookaheadSizeWhenLookaheadSizeEqualsMinus1() throws UnreadableWalletException {
        /* Branches:
         * (lookaheadSize == -1) : true
         */
        //Arrange Statement(s)
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "null");
        Network networkMock = mock(Network.class, "main");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(false).when(target).supportsDeterministicChains();
            DeterministicKeyChain deterministicKeyChain2 = DeterministicKeyChain.builder().build();
            deterministicKeyChain2.setLookaheadSize(0);
            doReturn(deterministicKeyChain2).when(target).getActiveKeyChain();
            //Act Statement(s)
            int result = target.getLookaheadSize();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
            verify(target).supportsDeterministicChains();
            verify(target).getActiveKeyChain();
        }
    }

    //Sapient generated method id: ${b9f203a7-b976-32f5-a3b4-6b5e08ef1cf4}, hash: 9843668D4DB51591C62228BAE2DBA67E
    @Ignore()
    @Test()
    public void getLookaheadSizeWhenLookaheadSizeNotEqualsMinus1() throws UnreadableWalletException {
        /* Branches:
         * (lookaheadSize == -1) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(false).when(target).supportsDeterministicChains();
            //Act Statement(s)
            int result = target.getLookaheadSize();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
            verify(target).supportsDeterministicChains();
        }
    }

    //Sapient generated method id: ${c1806282-9020-3437-a0f7-89d22448d68b}, hash: 5D6E46C8490ED4730E24CA4B92A170DB
    @Ignore()
    @Test()
    public void getLookaheadThresholdWhenLookaheadThresholdEqualsMinus1() throws UnreadableWalletException {
        /* Branches:
         * (lookaheadThreshold == -1) : true
         */
        //Arrange Statement(s)
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "HDPath");
        Network networkMock = mock(Network.class, "MainNet");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(false).when(target).supportsDeterministicChains();
            DeterministicKeyChain deterministicKeyChain2 = DeterministicKeyChain.builder().build();
            deterministicKeyChain2.setLookaheadThreshold(0);
            doReturn(deterministicKeyChain2).when(target).getActiveKeyChain();
            //Act Statement(s)
            int result = target.getLookaheadThreshold();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
            verify(target).supportsDeterministicChains();
            verify(target).getActiveKeyChain();
        }
    }

    //Sapient generated method id: ${ab4df4ff-85c2-33f6-8ade-b6a2ebcd41de}, hash: 706B474E7D98CDF04532881D6018164D
    @Ignore()
    @Test()
    public void getLookaheadThresholdWhenLookaheadThresholdNotEqualsMinus1() throws UnreadableWalletException {
        /* Branches:
         * (lookaheadThreshold == -1) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(false).when(target).supportsDeterministicChains();
            //Act Statement(s)
            int result = target.getLookaheadThreshold();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
            verify(target).supportsDeterministicChains();
        }
    }

    //Sapient generated method id: ${3e4f80e0-78f4-3998-b2c2-bf3e665bc4b6}, hash: 4E8AA82455ACE46655040D93654EE992
    @Test()
    public void importKeysTest() throws UnreadableWalletException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basic
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            List<ECKey> eCKeyList = new ArrayList<>();
            //Act Statement(s)
            int result = target.importKeys(eCKeyList);
            //Assert statement(s)
            assertThat(result, equalTo(0));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${04bb7501-6447-3c04-b640-6adae169274f}, hash: DEEA75D7F8940AC42C7F2356913F11DE
    @Test()
    public void importKeys1Test() throws UnreadableWalletException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: basic - Method: importKeys
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            ECKey[] eCKeyArray = new ECKey[]{};
            //Act Statement(s)
            int result = target.importKeys(eCKeyArray);
            //Assert statement(s)
            assertThat(result, equalTo(0));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${985e8ce0-cd93-3186-a94c-5b1bafe74def}, hash: DF56F7D200D39057941AF019EEFFF4DC
    @Ignore()
    @Test()
    public void checkPasswordWhenKeyCrypterIsNullThrowsIllegalStateException() throws UnreadableWalletException {
        /* Branches:
         * (keyCrypter != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Protos.Key key = Protos.Key.getDefaultInstance();
        List<Protos.Key> protosKeyList = new ArrayList<>();
        protosKeyList.add(key);
        KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, (KeyCrypter) null, keyChainFactoryMock);
        thrown.expect(IllegalStateException.class);
        //Act Statement(s)
        target.checkPassword("checkPassword_charSequence1");
    }

    //Sapient generated method id: ${c4b63472-48c0-3d8a-9b07-60a04d8528ed}, hash: F5E01043F3045FC2D93A8494CA35C68C
    @Test()
    public void checkPasswordWhenCheckAESKeyKeyCrypterDeriveKeyPassword() throws KeyCrypterException, UnreadableWalletException {
        /* Branches:
         * (keyCrypter != null) : true
         * (checkAESKey(keyCrypter.deriveKey(password))) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            doReturn(aesKeyMock).when(keyCrypterMock).deriveKey("checkPassword_charSequence1");
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(true).when(target).checkAESKey(aesKeyMock);
            //Act Statement(s)
            boolean result = target.checkPassword("checkPassword_charSequence1");
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            verify(keyCrypterMock).deriveKey("checkPassword_charSequence1");
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).checkAESKey(aesKeyMock);
        }
    }

    //Sapient generated method id: ${452473ca-005e-3b6c-9a22-7487fdbd95e4}, hash: 91EBE247DFAFA81E1522F1B7FB2E7918
    @Test()
    public void checkPasswordWhenCheckAESKeyNotKeyCrypterDeriveKeyPassword() throws KeyCrypterException, UnreadableWalletException {
        /* Branches:
         * (keyCrypter != null) : true
         * (checkAESKey(keyCrypter.deriveKey(password))) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            doReturn(aesKeyMock).when(keyCrypterMock).deriveKey("checkPassword_charSequence1");
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(false).when(target).checkAESKey(aesKeyMock);
            //Act Statement(s)
            boolean result = target.checkPassword("checkPassword_charSequence1");
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(keyCrypterMock).deriveKey("checkPassword_charSequence1");
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).checkAESKey(aesKeyMock);
        }
    }

    //Sapient generated method id: ${b5dcb133-1450-3f2b-947d-659c6f5b38dc}, hash: 5F126EC1D62D43504356B7D874B10290
    @Ignore()
    @Test()
    public void checkAESKeyWhenKeyCrypterIsNullThrowsIllegalStateException() throws UnreadableWalletException {
        /* Branches:
         * (keyCrypter != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Protos.Key key = Protos.Key.getDefaultInstance();
        List<Protos.Key> protosKeyList = new ArrayList<>();
        protosKeyList.add(key);
        KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, (KeyCrypter) null, keyChainFactoryMock);
        thrown.expect(IllegalStateException.class);
        byte[] byteArray = new byte[]{};
        AesKey aesKey = new AesKey(byteArray);
        //Act Statement(s)
        target.checkAESKey(aesKey);
    }

    //Sapient generated method id: ${d9e2271c-6841-3d7e-95a4-477a3c35d3ec}, hash: 174851E66AB213B2033C361593CBA7A1
    @Test()
    public void checkAESKeyWhenGetActiveKeyChainCheckAESKeyAesKey() throws UnreadableWalletException {
        /* Branches:
         * (keyCrypter != null) : true
         * (basic.numKeys() > 0) : false
         * (getActiveKeyChain().checkAESKey(aesKey)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(deterministicKeyChainMock).when(target).getActiveKeyChain();
            byte[] byteArray = new byte[]{};
            AesKey aesKey = new AesKey(byteArray);
            doReturn(true).when(deterministicKeyChainMock).checkAESKey(aesKey);
            //Act Statement(s)
            boolean result = target.checkAESKey(aesKey);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).getActiveKeyChain();
            verify(deterministicKeyChainMock).checkAESKey(aesKey);
        }
    }

    //Sapient generated method id: ${99c549cf-8be6-3db0-84ab-aa062a21387f}, hash: 155000971425E9D321F59B415B81880D
    @Test()
    public void checkAESKeyWhenGetActiveKeyChainNotCheckAESKeyAesKey() throws UnreadableWalletException {
        /* Branches:
         * (keyCrypter != null) : true
         * (basic.numKeys() > 0) : false
         * (getActiveKeyChain().checkAESKey(aesKey)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(deterministicKeyChainMock).when(target).getActiveKeyChain();
            doReturn(false).when(deterministicKeyChainMock).checkAESKey(aesKeyMock);
            //Act Statement(s)
            boolean result = target.checkAESKey(aesKeyMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).getActiveKeyChain();
            verify(deterministicKeyChainMock).checkAESKey(aesKeyMock);
        }
    }

    //Sapient generated method id: ${9866444f-8752-3dd4-a6f9-0e42e357082d}, hash: 251B8FEB9D326343C401E9442ACBAC97
    @Ignore()
    @Test()
    public void importKeysAndEncryptWhenKeyCrypterIsNullThrowsIllegalStateException() throws UnreadableWalletException {
        /* Branches:
         * (keyCrypter != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "Network");
        Protos.Key key = Protos.Key.getDefaultInstance();
        List<Protos.Key> protosKeyList = new ArrayList<>();
        protosKeyList.add(key);
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "KeyChainFactory");
        KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, (KeyCrypter) null, keyChainFactoryMock);
        thrown.expect(IllegalStateException.class);
        ECKey eCKey = new ECKey();
        List<ECKey> eCKeyList = new ArrayList<>();
        eCKeyList.add(eCKey);
        byte[] byteArray = new byte[]{};
        AesKey aesKey = new AesKey(byteArray);
        //Act Statement(s)
        target.importKeysAndEncrypt(eCKeyList, aesKey);
    }

    //Sapient generated method id: ${ccde17cd-6914-3c54-9d0c-c7e1059a73d6}, hash: 98BC5A5F921B485E79AF383242101089
    @Ignore()
    @Test()
    public void importKeysAndEncryptWhenKeyIsEncryptedThrowsIllegalArgumentException() throws UnreadableWalletException {
        /* Branches:
         * (keyCrypter != null) : true
         * (for-each(keys)) : true
         * (key.isEncrypted()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Cannot provide already encrypted keys");
            thrown.expect(IllegalArgumentException.class);
            thrown.expectMessage(illegalArgumentException.getMessage());
            List<ECKey> eCKeyList = new ArrayList<>();
            //Act Statement(s)
            target.importKeysAndEncrypt(eCKeyList, aesKeyMock);
            //Assert statement(s)
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${ad530b50-239f-3cbc-a8df-f8a24ad306ea}, hash: DB05D0C1DFE6AB2167D4C55CCF11B97D
    @Test()
    public void importKeysAndEncryptWhenKeyNotIsEncrypted() throws KeyCrypterException, UnreadableWalletException {
        /* Branches:
         * (keyCrypter != null) : true
         * (for-each(keys)) : true
         * (key.isEncrypted()) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: basic - Method: importKeys
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            List<ECKey> eCKeyList = new ArrayList<>();
            //Act Statement(s)
            int result = target.importKeysAndEncrypt(eCKeyList, aesKeyMock);
            //Assert statement(s)
            assertThat(result, equalTo(0));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${9bf10f2c-8325-326e-af7f-915a2125aa7b}, hash: 4659BB3780E7B418D4872CCA2F461897
    @Ignore()
    @Test()
    public void findRedeemDataFromScriptHashWhenRedeemDataIsNotNull() throws UnreadableWalletException {
        /* Branches:
         * (chains != null) : true
         * (iter.hasNext()) : true
         * (redeemData != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteString> byteString = mockStatic(ByteString.class);
             MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            byte[] byteArray = new byte[]{};
            byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteStringMock);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            RedeemData result = target.findRedeemDataFromScriptHash(byteArray);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            byteString.verify(() -> ByteString.copyFrom(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${bace3084-b106-3c04-a3bc-7879c663f2df}, hash: 33C2BE5BDF108137C6D052EF950BD5F2
    @Ignore()
    @Test()
    public void findRedeemDataFromScriptHashWhenRedeemDataIsNull() throws UnreadableWalletException {
        /* Branches:
         * (chains != null) : true
         * (iter.hasNext()) : true
         * (redeemData != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteString> byteString = mockStatic(ByteString.class);
             MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            byte[] byteArray = new byte[]{};
            byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteStringMock);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            RedeemData result = target.findRedeemDataFromScriptHash(byteArray);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            byteString.verify(() -> ByteString.copyFrom(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${6cfdb038-ea1f-3d38-9757-75f822f279fc}, hash: 4172D88869948E15F70563F5A5D64903
    @Ignore()
    @Test()
    public void markP2SHAddressAsUsedWhenAddressGetOutputScriptTypeNotEqualsScriptTypeP2SHThrowsIllegalArgumentException() throws UnreadableWalletException {
        /* Branches:
         * (address.getOutputScriptType() == ScriptType.P2SH) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: address
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            thrown.expect(IllegalArgumentException.class);
            LegacyAddress legacyAddress = LegacyAddress.fromKey(networkParametersMock, eCKeyMock);
            //Act Statement(s)
            target.markP2SHAddressAsUsed(legacyAddress);
            //Assert statement(s)
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${e3ff4e2b-9110-38e2-80db-0fdda5d2381a}, hash: FFCA43D1D707F87FAE95D4473D1FB017
    @Ignore()
    @Test()
    public void markP2SHAddressAsUsedWhenDataIsNull() throws UnreadableWalletException {
        /* Branches:
         * (address.getOutputScriptType() == ScriptType.P2SH) : true
         * (data == null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: address
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            byte[] byteArray = new byte[]{};
            doReturn(null).when(target).findRedeemDataFromScriptHash(byteArray);
            LegacyAddress legacyAddress = LegacyAddress.fromKey(networkParametersMock, eCKeyMock);
            //Act Statement(s)
            target.markP2SHAddressAsUsed(legacyAddress);
            //Assert statement(s)
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).findRedeemDataFromScriptHash(byteArray);
        }
    }

    //Sapient generated method id: ${d8f90c63-58d4-3155-a3ce-131264fd0dfb}, hash: BBFE2797FA9FB3F88694035476FA3CCC
    @Test()
    public void markP2SHAddressAsUsedWhenKIsNullAndAddressGetOutputScriptTypeNotEqualsScriptTypeP2SHThrowsIllegalArgumentException() throws UnreadableWalletException {
        /* Branches:
         * (address.getOutputScriptType() == ScriptType.P2SH) : true
         * (data == null) : false
         * (for-each(data.keys)) : true
         * (for-each(chains)) : true
         * (k == null) : true
         * (address.getOutputScriptType() == ScriptType.P2SH) : false  #  inside maybeMarkCurrentAddressAsUsed method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            doReturn(ScriptType.P2PKH).when(addressMock).getOutputScriptType();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(addressMock).getHash();
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            List list = new ArrayList<>();
            RedeemData redeemData = RedeemData.of(list, scriptMock);
            doReturn(redeemData).when(target).findRedeemDataFromScriptHash(byteArray);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.markP2SHAddressAsUsed(addressMock);
            //Assert statement(s)
            verify(addressMock, times(2)).getOutputScriptType();
            verify(addressMock).getHash();
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).findRedeemDataFromScriptHash(byteArray);
        }
    }

    //Sapient generated method id: ${0aa42e05-969e-3e03-9170-1f1ea8ec44f2}, hash: 053D35267030392A854DD128D722E16E
    @Ignore()
    @Test()
    public void markP2SHAddressAsUsedWhenCurrentAddressesEntrySetIsEmpty() throws UnreadableWalletException {
        /* Branches:
         * (address.getOutputScriptType() == ScriptType.P2SH) : true
         * (data == null) : false
         * (for-each(data.keys)) : true
         * (for-each(chains)) : true
         * (k == null) : true
         * (address.getOutputScriptType() == ScriptType.P2SH) : true  #  inside maybeMarkCurrentAddressAsUsed method
         * (for-each(currentAddresses.entrySet())) : false  #  inside maybeMarkCurrentAddressAsUsed method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            doReturn(ScriptType.P2PKH).when(addressMock).getOutputScriptType();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(addressMock).getHash();
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            List list = new ArrayList<>();
            RedeemData redeemData = RedeemData.of(list, scriptMock);
            doReturn(redeemData).when(target).findRedeemDataFromScriptHash(byteArray);
            //Act Statement(s)
            target.markP2SHAddressAsUsed(addressMock);
            //Assert statement(s)
            verify(addressMock, times(2)).getOutputScriptType();
            verify(addressMock).getHash();
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).findRedeemDataFromScriptHash(byteArray);
        }
    }

    //Sapient generated method id: ${10b59813-5889-334f-8519-745bae1d0b4a}, hash: 90CE2282DBE05DA304AEC0DBBA29EDCB
    @Test()
    public void findKeyFromPubKeyHashWhenResultAssignedBasicFindKeyFromPubHashPubKeyHashIsNotNull() throws UnreadableWalletException {
        /* Branches:
         * ((result = basic.findKeyFromPubHash(pubKeyHash)) != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            ECKey result = target.findKeyFromPubKeyHash(byteArray, ScriptType.P2PKH);
            BasicKeyChain basicKeyChain2 = new BasicKeyChain();
            ECKey eCKey = basicKeyChain2.findKeyFromPubHash(byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(eCKey));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${e3b99e2d-7038-3fce-b3f9-78c8079fde61}, hash: 5E07FCCF0C5CFBA7DBEF955F14B230A3
    @Test()
    public void findKeyFromPubKeyHashWhenScriptTypeNotEqualsChainGetOutputScriptType() throws UnreadableWalletException {
        /* Branches:
         * ((result = basic.findKeyFromPubHash(pubKeyHash)) != null) : false
         * (chains != null) : true
         * (for-each(chains)) : true
         * (scriptType != null) : true
         * (scriptType != chain.getOutputScriptType()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            ECKey result = target.findKeyFromPubKeyHash(byteArray, ScriptType.P2PKH);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${b96a1840-c429-301a-b872-6adc06b5e32f}, hash: ACE0BF910CA41C24697CDB3259EADC1D
    @Ignore()
    @Test()
    public void findKeyFromPubKeyHashWhenScriptTypeEqualsChainGetOutputScriptTypeAndResultAssignedChainFindKeyFromPubHashPubKeyHashIsNo() throws UnreadableWalletException {
        /* Branches:
         * ((result = basic.findKeyFromPubHash(pubKeyHash)) != null) : false
         * (chains != null) : true
         * (for-each(chains)) : true
         * (scriptType != null) : true
         * (scriptType != chain.getOutputScriptType()) : false
         * ((result = chain.findKeyFromPubHash(pubKeyHash)) != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            ECKey result = target.findKeyFromPubKeyHash(byteArray, ScriptType.P2PKH);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${6d268e74-7000-3632-af00-a8bdff320f1c}, hash: ED82B43E13C0284DF77C64DA0F34C6B0
    @Test()
    public void findKeyFromPubKeyHashWhenScriptTypeEqualsChainGetOutputScriptTypeAndResultAssignedChainFindKeyFromPubHashPubKeyHashIsNu() throws UnreadableWalletException {
        /* Branches:
         * ((result = basic.findKeyFromPubHash(pubKeyHash)) != null) : false
         * (chains != null) : true
         * (for-each(chains)) : true
         * (scriptType != null) : true
         * (scriptType != chain.getOutputScriptType()) : false
         * ((result = chain.findKeyFromPubHash(pubKeyHash)) != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            ECKey result = target.findKeyFromPubKeyHash(byteArray, ScriptType.P2PKH);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${3dd9d7bd-a429-32f2-b8e1-0c155859f661}, hash: 59DCCBEA7C83E808DF34B23DF8492B96
    @Test()
    public void markPubKeyHashAsUsedWhenKeyAssignedChainMarkPubHashAsUsedPubKeyHashIsNull() throws UnreadableWalletException {
        /* Branches:
         * (chains != null) : true
         * (for-each(chains)) : true
         * ((key = chain.markPubHashAsUsed(pubKeyHash)) != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            target.markPubKeyHashAsUsed(byteArray);
            //Assert statement(s)
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${94feeba4-6f6d-3167-9fa1-ab4debbdf004}, hash: 7B8E94B55CDA6BF2E2230E93E3E40199
    @Test()
    public void markPubKeyHashAsUsedWhenCurrentKeysEntrySetIsEmpty() throws UnreadableWalletException {
        /* Branches:
         * (chains != null) : true
         * (for-each(chains)) : true
         * ((key = chain.markPubHashAsUsed(pubKeyHash)) != null) : true
         * (for-each(currentKeys.entrySet())) : false  #  inside maybeMarkCurrentKeyAsUsed method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            target.markPubKeyHashAsUsed(byteArray);
            //Assert statement(s)
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${83e9ae3d-7e65-3d0f-bf8f-f62a26ce6051}, hash: DF5C8A2E8533F0EDEB3984F50AEC54D0
    @Ignore()
    @Test()
    public void hasKeyWhenBasicHasKeyKey() throws UnreadableWalletException {
        /* Branches:
         * (basic.hasKey(key)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basic
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            boolean result = target.hasKey(eCKeyMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${8871e489-92c5-31e0-84f1-f1e773941676}, hash: 5D9C9AF8CA3CCD7539B5E708107953AA
    @Ignore()
    @Test()
    public void hasKeyWhenChainHasKeyKey() throws UnreadableWalletException {
        /* Branches:
         * (basic.hasKey(key)) : false
         * (chains != null) : true
         * (for-each(chains)) : true
         * (chain.hasKey(key)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basic
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            boolean result = target.hasKey(eCKeyMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${6e12a94e-baae-38c1-9954-c468b1a17264}, hash: 537CB351F75F5FEEF2C3EF3FAE37871E
    @Ignore()
    @Test()
    public void hasKeyWhenChainNotHasKeyKey() throws UnreadableWalletException {
        /* Branches:
         * (basic.hasKey(key)) : false
         * (chains != null) : true
         * (for-each(chains)) : true
         * (chain.hasKey(key)) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basic
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            boolean result = target.hasKey(eCKeyMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${e6a786fb-106e-3b81-a712-44349b38ddfe}, hash: C72EFD15BF770C9414EC4AB788C18907
    @Test()
    public void findKeyFromPubKeyWhenResultAssignedBasicFindKeyFromPubKeyPubKeyIsNotNull() throws UnreadableWalletException {
        /* Branches:
         * ((result = basic.findKeyFromPubKey(pubKey)) != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            ECKey result = target.findKeyFromPubKey(byteArray);
            BasicKeyChain basicKeyChain2 = new BasicKeyChain();
            ECKey eCKey = basicKeyChain2.findKeyFromPubKey(byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(eCKey));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${997b6092-b34a-34ba-b491-78d522ca56c8}, hash: 67B42459D38D77152E0C1EBF4AAFB4C0
    @Ignore()
    @Test()
    public void findKeyFromPubKeyWhenResultAssignedChainFindKeyFromPubKeyPubKeyIsNotNull() throws UnreadableWalletException {
        /* Branches:
         * ((result = basic.findKeyFromPubKey(pubKey)) != null) : false
         * (chains != null) : true
         * (for-each(chains)) : true
         * ((result = chain.findKeyFromPubKey(pubKey)) != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            ECKey result = target.findKeyFromPubKey(byteArray);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${2e16d0ef-1ae3-39a3-a54d-f32e61c438f5}, hash: B2B9419CE3119ECF50F082A417A2B514
    @Test()
    public void findKeyFromPubKeyWhenResultAssignedChainFindKeyFromPubKeyPubKeyIsNull() throws UnreadableWalletException {
        /* Branches:
         * ((result = basic.findKeyFromPubKey(pubKey)) != null) : false
         * (chains != null) : true
         * (for-each(chains)) : true
         * ((result = chain.findKeyFromPubKey(pubKey)) != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            ECKey result = target.findKeyFromPubKey(byteArray);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${33c88862-413d-38ab-ba87-77c7512c600f}, hash: BEEC9897355B3CC928AE4F501FED3F72
    @Test()
    public void markPubKeyAsUsedWhenKeyAssignedChainMarkPubKeyAsUsedPubkeyIsNull() throws UnreadableWalletException {
        /* Branches:
         * (chains != null) : true
         * (for-each(chains)) : true
         * ((key = chain.markPubKeyAsUsed(pubkey)) != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            target.markPubKeyAsUsed(byteArray);
            //Assert statement(s)
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${eeae845e-ab84-3e64-b6b6-82fd52a10da5}, hash: 9DC3F3C1172389D13481CFF3DD9CFC0F
    @Test()
    public void markPubKeyAsUsedWhenCurrentKeysEntrySetIsEmpty() throws UnreadableWalletException {
        /* Branches:
         * (chains != null) : true
         * (for-each(chains)) : true
         * ((key = chain.markPubKeyAsUsed(pubkey)) != null) : true
         * (for-each(currentKeys.entrySet())) : false  #  inside maybeMarkCurrentKeyAsUsed method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            target.markPubKeyAsUsed(byteArray);
            //Assert statement(s)
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${afe26067-9822-3797-97c9-583420253848}, hash: B2C681C860AE056073EAB45A1C16A428
    @Test()
    public void numKeysWhenChainsIsNotEmpty() throws UnreadableWalletException {
        /* Branches:
         * (chains != null) : true
         * (for-each(chains)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            int result = target.numKeys();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${2da8e3a6-351b-3fb6-9324-3af2ab183aa8}, hash: C42DDDE5A87B0D88E228D322CC694926
    @Test()
    public void removeImportedKeyWhenKeyInstanceOfDeterministicKeyThrowsIllegalArgumentException() throws UnreadableWalletException {
        /* Branches:
         * (!(key instanceof DeterministicKey)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.removeImportedKey(deterministicKeyMock);
            //Assert statement(s)
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${b479d457-6f68-3403-bcb2-1fcb6f92f479}, hash: F06C6027B0C0A1E9606F4609179915DD
    @Ignore()
    @Test()
    public void removeImportedKeyWhenBasicRemoveKeyKey() throws UnreadableWalletException {
        /* Branches:
         * (!(key instanceof DeterministicKey)) : true
         * (basic.removeKey(key)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basic
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            boolean result = target.removeImportedKey(eCKeyMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${10f2acc4-fe7b-3222-9ced-a71358785ddb}, hash: 609C751DA254D1A2E614C81A5ABEDE67
    @Ignore()
    @Test()
    public void removeImportedKeyWhenBasicNotRemoveKeyKey() throws UnreadableWalletException {
        /* Branches:
         * (!(key instanceof DeterministicKey)) : true
         * (basic.removeKey(key)) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basic
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            boolean result = target.removeImportedKey(eCKeyMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${aa93e0c4-2185-3cdd-99a6-edb499241cf3}, hash: 7BB9B79FF6379B07DB37304B688B3D83
    @Test()
    public void encryptWhenBasicNumKeysEquals0ThrowsIllegalStateException() throws UnreadableWalletException {
        /* Branches:
         * (chains != null) : true
         * (!chains.isEmpty()) : false
         * (basic.numKeys() != 0) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            thrown.expect(IllegalStateException.class);
            byte[] byteArray = new byte[]{};
            AesKey aesKey = new AesKey(byteArray);
            //Act Statement(s)
            target.encrypt(keyCrypterMock2, aesKey);
            //Assert statement(s)
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${6289becc-0d97-3c06-9a09-f38c6d498d86}, hash: 9EE2A6DA0CD75C3A04FFAA4D092931A0
    @Ignore()
    @Test()
    public void encryptWhenChainsIsNotNull() throws UnreadableWalletException {
        /* Branches:
         * (chains != null) : true
         * (!chains.isEmpty()) : true
         * (chains != null) : true
         * (for-each(chains)) : true
         * (chains != null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basic
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            target.encrypt(keyCrypterMock2, aesKeyMock);
            //Assert statement(s)
            assertThat(target.getKeyCrypter(), is(notNullValue()));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${feb58fd9-f666-3d5c-a938-7121a959edef}, hash: 8E3F564BEA5C19D5E21817B6CB4B5220
    @Ignore()
    @Test()
    public void decryptWhenChainsIsNotEmpty() throws UnreadableWalletException {
        /* Branches:
         * (chains != null) : true
         * (for-each(chains)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basic
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            target.decrypt(aesKeyMock);
            //Assert statement(s)
            assertThat(target.getKeyCrypter(), is(nullValue()));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${116ef318-e704-324a-bfe2-51c037b17134}, hash: 208D055C1F944CF0E6EE517353374157
    @Test()
    public void isEncryptedWhenKeyCrypterIsNotNull() throws UnreadableWalletException {
        /* Branches:
         * (keyCrypter != null) : true
         */
        //Arrange Statement(s)
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "BasicKeyChain");
        Network networkMock = mock(Network.class, "MainNet");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            boolean result = target.isEncrypted();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${fb4885d6-9d6e-3304-8242-966497227d83}, hash: 13357AD632D6FE3D0259EAA52E9A065C
    @Ignore()
    @Test()
    public void isEncryptedWhenKeyCrypterIsNull() throws UnreadableWalletException {
        /* Branches:
         * (keyCrypter != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "main");
        List<Protos.Key> protosKeyList = new ArrayList<>();
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "null");
        KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, (KeyCrypter) null, keyChainFactoryMock);
        //Act Statement(s)
        boolean result = target.isEncrypted();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${c58c8bf3-6f2e-3c1f-ae82-cc8bd5cc3049}, hash: 24FCC75181E2309A55B6A9DAA89E28AC
    @Test()
    public void isWatchingWhenActiveStateEqualsBasicKeyChainStateEMPTYThrowsIllegalStateException() throws UnreadableWalletException {
        /* Branches:
         * (chains != null) : true
         * (!chains.isEmpty()) : false
         * (basicState == BasicKeyChain.State.EMPTY) : true
         * (activeState == BasicKeyChain.State.EMPTY) : true
         */
        //Arrange Statement(s)
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "null");
        Network networkMock = mock(Network.class, "MainNet");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            IllegalStateException illegalStateException = new IllegalStateException("Empty key chain group: cannot answer isWatching() query");
            thrown.expect(IllegalStateException.class);
            thrown.expectMessage(illegalStateException.getMessage());
            //Act Statement(s)
            target.isWatching();
            //Assert statement(s)
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${7e6631f3-f0a8-3bdc-adda-0d6e4099b026}, hash: 21637506F2B5F3CA0498CA94F85B0707
    @Ignore()
    @Test()
    public void isWatchingWhenActiveStateEqualsBasicKeyChainStateWATCHING() throws UnreadableWalletException {
        /* Branches:
         * (chains != null) : true
         * (!chains.isEmpty()) : true
         * (getActiveKeyChain().isWatching()) : true
         * (basicState == BasicKeyChain.State.EMPTY) : true
         * (activeState == BasicKeyChain.State.EMPTY) : false
         * (activeState == BasicKeyChain.State.WATCHING) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(deterministicKeyChainMock).when(target).getActiveKeyChain();
            doReturn(false).when(deterministicKeyChainMock).isWatching();
            //Act Statement(s)
            boolean result = target.isWatching();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).getActiveKeyChain();
            verify(deterministicKeyChainMock).isWatching();
        }
    }

    //Sapient generated method id: ${5406ca00-b352-3021-a157-0ca99fb301e8}, hash: 4AA3889E0F0A6BB55D6A0790EE2D6626
    @Ignore()
    @Test()
    public void isWatchingWhenActiveStateNotEqualsBasicKeyChainStateWATCHING() throws UnreadableWalletException {
        /* Branches:
         * (chains != null) : true
         * (!chains.isEmpty()) : true
         * (getActiveKeyChain().isWatching()) : false
         * (basicState == BasicKeyChain.State.EMPTY) : true
         * (activeState == BasicKeyChain.State.EMPTY) : false
         * (activeState == BasicKeyChain.State.WATCHING) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(deterministicKeyChainMock).when(target).getActiveKeyChain();
            doReturn(false).when(deterministicKeyChainMock).isWatching();
            //Act Statement(s)
            boolean result = target.isWatching();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).getActiveKeyChain();
            verify(deterministicKeyChainMock).isWatching();
        }
    }

    //Sapient generated method id: ${b88d93ca-8962-3682-ab2e-c47b2e72b744}, hash: AA5442F8A443AA0F2C58D3EBCE99D663
    @Test()
    public void getImportedKeysTest() throws UnreadableWalletException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basic
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            List<ECKey> result = target.getImportedKeys();
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${12248e23-6ba4-35f1-9c2a-5f6491a8546a}, hash: F34C90F5348D0D66687BEAB8B99D75C6
    @Test()
    public void earliestKeyCreationTimeWhenChainsIsNull() throws UnreadableWalletException {
        /* Branches:
         * (chains == null) : true  #  inside getEarliestChainsCreationTime method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            Instant result = target.earliestKeyCreationTime();
            BasicKeyChain basicKeyChain2 = new BasicKeyChain();
            Instant instant2 = basicKeyChain2.earliestKeyCreationTime();
            Instant instant3 = Instant.MAX;
            Instant instant = TimeUtils.earlier(instant2, instant3);
            //Assert statement(s)
            assertThat(result, equalTo(instant));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${a420d8c8-2318-3573-a179-9e1243bc3aa1}, hash: 1E3BD194FAB6965944621504A4A80493
    @Test()
    public void earliestKeyCreationTimeWhenChainsIsNotNull() throws UnreadableWalletException {
        /* Branches:
         * (chains == null) : false  #  inside getEarliestChainsCreationTime method
         */
        //Arrange Statement(s)
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "null");
        Network networkMock = mock(Network.class, "main");
        try (MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class);
             MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            Instant instant = Instant.ofEpochSecond(1700000000);
            timeUtils.when(() -> TimeUtils.earlier((Instant) any(), (Instant) any())).thenReturn(instant);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            Instant result = target.earliestKeyCreationTime();
            //Assert statement(s)
            assertThat(result, equalTo(instant));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            timeUtils.verify(() -> TimeUtils.earlier((Instant) any(), (Instant) any()));
        }
    }

    //Sapient generated method id: ${1d2e5f85-64cf-3284-bfe2-0d7ca3ca4973}, hash: 3C587945BE64B6CCB834511EAA8417EA
    @Test()
    public void getEarliestKeyCreationTimeWhenEarliestKeyCreationTimeEqualsInstantMAX() throws UnreadableWalletException {
        /* Branches:
         * (earliestKeyCreationTime.equals(Instant.MAX)) : true
         */
        //Arrange Statement(s)
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "BasicKeyChain");
        Network networkMock = mock(Network.class, "MainNet");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            Protos.Key key = Protos.Key.getDefaultInstance();
            Protos.Key key2 = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            protosKeyList.add(key2);
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            Instant instant = Instant.MAX;
            doReturn(instant).when(target).earliestKeyCreationTime();
            //Act Statement(s)
            long result = target.getEarliestKeyCreationTime();
            //Assert statement(s)
            assertThat(result, equalTo(9223372036854775807L));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).earliestKeyCreationTime();
        }
    }

    //Sapient generated method id: ${f839e95b-ccfc-30b9-ac50-5523ad76e2d3}, hash: CA5087A2570171A77CB0B04D7C962D8F
    @Ignore()
    @Test()
    public void getEarliestKeyCreationTimeWhenEarliestKeyCreationTimeNotEqualsInstantMAX() throws UnreadableWalletException {
        /* Branches:
         * (earliestKeyCreationTime.equals(Instant.MAX)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "MainNet");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            Protos.Key key = Protos.Key.getDefaultInstance();
            Protos.Key key2 = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            protosKeyList.add(key2);
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(target).earliestKeyCreationTime();
            //Act Statement(s)
            long result = target.getEarliestKeyCreationTime();
            //Assert statement(s)
            assertThat(result, equalTo(0L));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).earliestKeyCreationTime();
        }
    }

    //Sapient generated method id: ${e8a0d404-00d9-36cb-bbb1-9c8f6fa9f5a3}, hash: 2F17EC8A678C27C0A659A499AC2F59A3
    @Test()
    public void getBloomFilterElementCountWhenChainsIsNotEmpty() throws UnreadableWalletException {
        /* Branches:
         * (chains != null) : true
         * (for-each(chains)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            int result = target.getBloomFilterElementCount();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${7ae3102b-4c69-3d06-9c75-35241ed8175c}, hash: E3DBA0FB82A36A45CD1FB89E5A18D466
    @Test()
    public void getBloomFilterWhenChainsIsNotEmpty() throws UnreadableWalletException {
        /* Branches:
         * (basic.numKeys() > 0) : false
         * (chains != null) : true
         * (for-each(chains)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: filter
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            BloomFilter result = target.getBloomFilter(0, Double.parseDouble("0.0"), 0);
            BloomFilter bloomFilter = new BloomFilter(0, Double.parseDouble("0.0"), 0);
            //Assert statement(s)
            assertThat(result, equalTo(bloomFilter));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${d00db6e5-ccdd-3421-92b6-ef891481d383}, hash: FB210E5E920FDC23F793401E4928D279
    @Test()
    public void isRequiringUpdateAllBloomFilterThrowsUnsupportedOperationException() throws UnreadableWalletException {
        //Arrange Statement(s)
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "keyChainFactory");
        Network networkMock = mock(Network.class, "main");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            thrown.expect(UnsupportedOperationException.class);
            //Act Statement(s)
            target.isRequiringUpdateAllBloomFilter();
            //Assert statement(s)
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${0b160154-951e-3a14-95bd-e6793a7bce96}, hash: 9B5F8D3430449B8E7162CA18421A863C
    @Ignore()
    @Test()
    public void addEventListenerTest() throws UnreadableWalletException {
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doNothing().when(target).addEventListener(keyChainEventListenerMock, executorMock);
            //Act Statement(s)
            target.addEventListener(keyChainEventListenerMock);
            //Assert statement(s)
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).addEventListener(keyChainEventListenerMock, executorMock);
        }
    }

    //Sapient generated method id: ${1aca89a0-f8af-3439-8252-530fa02bc5be}, hash: 7A032F70135D7D03FA7A8D05796FAD53
    @Test()
    public void addEventListener1WhenChainsIsNotEmpty() throws UnreadableWalletException {
        /* Branches:
         * (chains != null) : true
         * (for-each(chains)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basic
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            target.addEventListener(keyChainEventListenerMock, executorMock);
            //Assert statement(s)
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${7f65cc3a-1339-3f5d-a00d-e1560ed9f31f}, hash: DF5512CD9EFA25AACA5EEDCFA4388B90
    @Ignore()
    @Test()
    public void removeEventListenerWhenChainsIsNotEmptyAndBasicRemoveEventListenerListener() throws UnreadableWalletException {
        /* Branches:
         * (chains != null) : true
         * (for-each(chains)) : true
         * (basic.removeEventListener(listener)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basic
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            boolean result = target.removeEventListener(keyChainEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${efe04693-04b0-3b6a-982a-6f9900ccaa8e}, hash: 5CFB5B9E47400F329C8E2C5C76827CC6
    @Test()
    public void removeEventListenerWhenChainsIsNotEmptyAndBasicNotRemoveEventListenerListener() throws UnreadableWalletException {
        /* Branches:
         * (chains != null) : true
         * (for-each(chains)) : true
         * (basic.removeEventListener(listener)) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basic
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            boolean result = target.removeEventListener(keyChainEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${9a3dcec5-b745-3460-bf55-204c7709e4a4}, hash: DE61276927E6FB388D61BE9836A5ED28
    @Ignore()
    @Test()
    public void addCurrentKeyChangeEventListenerTest() throws UnreadableWalletException {
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doNothing().when(target).addCurrentKeyChangeEventListener(currentKeyChangeEventListenerMock, executorMock);
            //Act Statement(s)
            target.addCurrentKeyChangeEventListener(currentKeyChangeEventListenerMock);
            //Assert statement(s)
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).addCurrentKeyChangeEventListener(currentKeyChangeEventListenerMock, executorMock);
        }
    }

    //Sapient generated method id: ${ba857baf-a904-38fa-9ed0-0c7fffc046c9}, hash: B39C933BB6A2FAD26C67EF017F64C24F
    @Test()
    public void addCurrentKeyChangeEventListener1Test() throws UnreadableWalletException {
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            target.addCurrentKeyChangeEventListener(currentKeyChangeEventListenerMock, executorMock);
            //Assert statement(s)
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${8cac5caf-b879-347e-8b89-a1629fa2b1fc}, hash: 3D4850455960E0C1CAD444F2525D2B95
    @Test()
    public void removeCurrentKeyChangeEventListenerWhenListenerRegistrationRemoveFromListListenerCurrentKeyChangeListeners() throws UnreadableWalletException {
        /* Branches:
         * (ListenerRegistration.removeFromList(listener, currentKeyChangeListeners)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(currentKeyChangeEventListenerMock), (CopyOnWriteArrayList) any())).thenReturn(true);
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            boolean result = target.removeCurrentKeyChangeEventListener(currentKeyChangeEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(currentKeyChangeEventListenerMock), (CopyOnWriteArrayList) any()));
        }
    }

    //Sapient generated method id: ${e8cc1833-c7a2-32bb-876e-486738aa8251}, hash: 426E3C7441EE21A7DC30701E857A0E61
    @Test()
    public void removeCurrentKeyChangeEventListenerWhenListenerRegistrationNotRemoveFromListListenerCurrentKeyChangeListeners() throws UnreadableWalletException {
        /* Branches:
         * (ListenerRegistration.removeFromList(listener, currentKeyChangeListeners)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(currentKeyChangeEventListenerMock), (CopyOnWriteArrayList) any())).thenReturn(false);
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            boolean result = target.removeCurrentKeyChangeEventListener(currentKeyChangeEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(currentKeyChangeEventListenerMock), (CopyOnWriteArrayList) any()));
        }
    }

    //Sapient generated method id: ${869e1eb9-de5f-3680-bd6b-36bfdd4e9090}, hash: 59D35813424A08204AC5708CA8D3E538
    @Test()
    public void serializeToProtobufWhenChainsIsNotNull() throws UnreadableWalletException {
        /* Branches:
         * (basic != null) : true
         * (chains != null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basic
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            List<Protos.Key> result = target.serializeToProtobuf();
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${812ffedc-d721-3207-ad73-0c6bbed486bd}, hash: CD116E87885F1BE54668AAF7CB04417E
    @Test()
    public void serializeToProtobufWhenChainsIsNull() throws UnreadableWalletException {
        /* Branches:
         * (basic != null) : true
         * (chains != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basic
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            List<Protos.Key> result = target.serializeToProtobuf();
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${eabd3d02-7d16-38fc-868d-6e8863269a78}, hash: DDC34E6C5CC1BEC0DF9A1C7C51424B63
    @Test()
    public void fromProtobufUnencryptedTest() throws UnreadableWalletException {
        //Arrange Statement(s)
        try (MockedStatic<KeyChainGroup> keyChainGroup = mockStatic(KeyChainGroup.class, CALLS_REAL_METHODS)) {
            keyChainGroup.when(() -> KeyChainGroup.fromProtobufUnencrypted(eq(networkMock), anyList(), (DefaultKeyChainFactory) any())).thenReturn(keyChainGroupMock);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            //Act Statement(s)
            KeyChainGroup result = KeyChainGroup.fromProtobufUnencrypted(networkMock, protosKeyList);
            //Assert statement(s)
            assertThat(result, equalTo(keyChainGroupMock));
            keyChainGroup.verify(() -> KeyChainGroup.fromProtobufUnencrypted(eq(networkMock), anyList(), (DefaultKeyChainFactory) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${c1623082-6ea9-330e-a2b8-cf19b1e01891}, hash: 133098CB9928C8B4AE190E4BF63F072E
    @Ignore()
    @Test()
    public void fromProtobufUnencrypted1WhenDefaultBranchAndDefaultBranch() throws UnreadableWalletException {
        /* Branches:
         * (!chains.isEmpty()) : true
         * (activeChain.getIssuedExternalKeys() > 0) : true  #  inside createCurrentKeysMap method
         * (activeChain.getIssuedInternalKeys() > 0) : true  #  inside createCurrentKeysMap method
         * (branch expression (line 283)) : false  #  inside <init> method
         * (branch expression (line 284)) : false  #  inside <init> method
         * (branch expression (line 300)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufUnencrypted(anyList())).thenReturn(basicKeyChainMock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(null), eq(keyChainFactoryMock))).thenReturn(null);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            //Act Statement(s)
            KeyChainGroup result = KeyChainGroup.fromProtobufUnencrypted(networkMock, protosKeyList, keyChainFactoryMock);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufUnencrypted(anyList()));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(null), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${6bfe2e6b-3cfa-3508-978f-0fb16fa9455b}, hash: 4EED2589777F1F33E1C8DFCD537B1D3E
    @Test()
    public void fromProtobufUnencrypted1WhenDefaultBranchAndDefaultBranchAndDefaultBranchAndDefaultBranchAndDefaultBranch3() throws UnreadableWalletException {
        /* Branches:
         * (!chains.isEmpty()) : true
         * (activeChain.getIssuedExternalKeys() > 0) : true  #  inside createCurrentKeysMap method
         * (activeChain.getIssuedInternalKeys() > 0) : true  #  inside createCurrentKeysMap method
         * (branch expression (line 283)) : false  #  inside <init> method
         * (branch expression (line 284)) : false  #  inside <init> method
         * (branch expression (line 285)) : false  #  inside <init> method
         * (branch expression (line 287)) : false  #  inside <init> method
         * (branch expression (line 290)) : true  #  inside <init> method
         * (branch expression (line 291)) : false  #  inside <init> method
         * (branch expression (line 293)) : false  #  inside <init> method
         * (branch expression (line 300)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufUnencrypted(anyList())).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(null), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            //Act Statement(s)
            KeyChainGroup result = KeyChainGroup.fromProtobufUnencrypted(networkMock, protosKeyList, keyChainFactoryMock);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufUnencrypted(anyList()));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(null), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${fdf441cb-65fe-3b5c-b115-cf990a61aa5e}, hash: 47BE895B9E88342BD82EDD45CE51C72E
    @Test()
    public void fromProtobufEncryptedTest() throws UnreadableWalletException {
        //Arrange Statement(s)
        try (MockedStatic<KeyChainGroup> keyChainGroup = mockStatic(KeyChainGroup.class, CALLS_REAL_METHODS)) {
            keyChainGroup.when(() -> KeyChainGroup.fromProtobufEncrypted(eq(networkMock), anyList(), eq(keyCrypterMock), (DefaultKeyChainFactory) any())).thenReturn(keyChainGroupMock);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            //Act Statement(s)
            KeyChainGroup result = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock);
            //Assert statement(s)
            assertThat(result, equalTo(keyChainGroupMock));
            keyChainGroup.verify(() -> KeyChainGroup.fromProtobufEncrypted(eq(networkMock), anyList(), eq(keyCrypterMock), (DefaultKeyChainFactory) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${1e2f351a-f659-31a8-a17a-d262960954dc}, hash: B25F4046AE8DEF2D45038AFADCD521AB
    @Ignore()
    @Test()
    public void fromProtobufEncrypted1WhenDefaultBranchAndDefaultBranch() throws UnreadableWalletException {
        /* Branches:
         * (!chains.isEmpty()) : true
         * (activeChain.getIssuedExternalKeys() > 0) : true  #  inside createCurrentKeysMap method
         * (activeChain.getIssuedInternalKeys() > 0) : true  #  inside createCurrentKeysMap method
         * (branch expression (line 283)) : false  #  inside <init> method
         * (branch expression (line 284)) : false  #  inside <init> method
         * (branch expression (line 300)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(basicKeyChainMock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(null);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            //Act Statement(s)
            KeyChainGroup result = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${9f1bad58-7eb3-3118-bc45-3fe7f9e94545}, hash: 40D260A846185BFCB4C8947801937DAD
    @Test()
    public void fromProtobufEncrypted1WhenDefaultBranchAndDefaultBranchAndDefaultBranchAndDefaultBranchAndDefaultBranch2() throws UnreadableWalletException {
        /* Branches:
         * (!chains.isEmpty()) : true
         * (activeChain.getIssuedExternalKeys() > 0) : true  #  inside createCurrentKeysMap method
         * (activeChain.getIssuedInternalKeys() > 0) : true  #  inside createCurrentKeysMap method
         * (branch expression (line 283)) : false  #  inside <init> method
         * (branch expression (line 284)) : false  #  inside <init> method
         * (branch expression (line 285)) : false  #  inside <init> method
         * (branch expression (line 287)) : false  #  inside <init> method
         * (branch expression (line 290)) : true  #  inside <init> method
         * (branch expression (line 291)) : false  #  inside <init> method
         * (branch expression (line 293)) : false  #  inside <init> method
         * (branch expression (line 300)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            //Act Statement(s)
            KeyChainGroup result = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${c140f1f5-fd4d-3295-becf-a9919083d28d}, hash: 6AA1D859F43AE25211A11B0A3DA09E31
    @Test()
    public void upgradeToDeterministicWhenIsDeterministicUpgradeRequiredNotPreferredScriptTypeKeyRotationTime() throws DeterministicUpgradeRequiresPassword, UnreadableWalletException {
        /* Branches:
         * (!isDeterministicUpgradeRequired(preferredScriptType, keyRotationTime)) : true
         */
        //Arrange Statement(s)
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "BIP44");
        Network networkMock = mock(Network.class, "TESTNET");
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class, "3");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Protos.Key key = Protos.Key.getDefaultInstance();
            Protos.Key key2 = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            protosKeyList.add(key2);
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(false).when(target).supportsDeterministicChains();
            doReturn(false).when(target).isDeterministicUpgradeRequired(eq(ScriptType.P2PKH), (Instant) any());
            Instant instant = Instant.now();
            byte[] byteArray = new byte[]{};
            AesKey aesKey = new AesKey(byteArray);
            //Act Statement(s)
            target.upgradeToDeterministic(ScriptType.P2PKH, keyChainGroupStructureMock, instant, aesKey);
            //Assert statement(s)
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
            verify(target).supportsDeterministicChains();
            verify(target).isDeterministicUpgradeRequired(eq(ScriptType.P2PKH), (Instant) any());
        }
    }

    //Sapient generated method id: ${7da88ae5-af87-39d0-bfe4-67ff8a6b8c52}, hash: 54A1703259B8610179D555DFAE64A90D
    @Ignore()
    @Test()
    public void upgradeToDeterministicWhenAesKeyIsNullThrowsDeterministicUpgradeRequiresPassword() throws DeterministicUpgradeRequiresPassword, UnreadableWalletException {
        /* Branches:
         * (!isDeterministicUpgradeRequired(preferredScriptType, keyRotationTime)) : false
         * (preferredScriptType == ScriptType.P2WPKH) : true
         * (getActiveKeyChain(ScriptType.P2WPKH, keyRotationTime) == null) : true
         * (seedWasEncrypted) : true
         * (aesKey == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(false).when(target).supportsDeterministicChains();
            doReturn(false).when(target).isDeterministicUpgradeRequired(eq(ScriptType.P2PKH), (Instant) any());
            doReturn(null).when(target).getActiveKeyChain(eq(ScriptType.P2WPKH), (Instant) any());
            DeterministicKeyChain deterministicKeyChain2 = DeterministicKeyChain.builder().seed(deterministicSeedMock).build();
            doReturn(deterministicKeyChain2).when(target).getActiveKeyChain(eq(ScriptType.P2PKH), (Instant) any());
            doReturn(false).when(deterministicSeedMock).isEncrypted();
            thrown.expect(DeterministicUpgradeRequiresPassword.class);
            Instant instant = Instant.ofEpochSecond(1700000000);
            AesKey aesKey = null;
            //Act Statement(s)
            target.upgradeToDeterministic(ScriptType.P2PKH, keyChainGroupStructureMock, instant, aesKey);
            //Assert statement(s)
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
            verify(target).supportsDeterministicChains();
            verify(target).isDeterministicUpgradeRequired(eq(ScriptType.P2PKH), (Instant) any());
            verify(target).getActiveKeyChain(eq(ScriptType.P2WPKH), (Instant) any());
            verify(target).getActiveKeyChain(eq(ScriptType.P2PKH), (Instant) any());
            verify(deterministicSeedMock).isEncrypted();
        }
    }

    //Sapient generated method id: ${2ee5febb-186a-3cb7-ad8d-4898e74e2a25}, hash: 28195B610E9BC465744EE57F46F4B6F1
    @Ignore()
    @Test()
    public void upgradeToDeterministicWhenAesKeyIsNotNullAndSeedWasEncrypted() throws DeterministicUpgradeRequiresPassword, UnreadableWalletException {
        /* Branches:
         * (!isDeterministicUpgradeRequired(preferredScriptType, keyRotationTime)) : false
         * (preferredScriptType == ScriptType.P2WPKH) : true
         * (getActiveKeyChain(ScriptType.P2WPKH, keyRotationTime) == null) : true
         * (seedWasEncrypted) : true
         * (aesKey == null) : false
         * (seedWasEncrypted) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        KeyChainGroupStructure structureMock = mock(KeyChainGroupStructure.class);
        HDPath hDPathMock = mock(HDPath.class);
        DeterministicSeed deterministicSeedMock2 = mock(DeterministicSeed.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            doReturn(hDPathMock).when(structureMock).accountPathFor(ScriptType.P2WPKH, BitcoinNetwork.MAINNET);
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(false).when(target).supportsDeterministicChains();
            doReturn(false).when(target).isDeterministicUpgradeRequired(eq(ScriptType.P2PKH), (Instant) any());
            doReturn(null).when(target).getActiveKeyChain(eq(ScriptType.P2WPKH), (Instant) any());
            DeterministicKeyChain deterministicKeyChain2 = DeterministicKeyChain.builder().seed(deterministicSeedMock).build();
            doReturn(deterministicKeyChain2).when(target).getActiveKeyChain(eq(ScriptType.P2PKH), (Instant) any());
            doReturn(false).when(deterministicSeedMock).isEncrypted();
            doReturn(deterministicSeedMock2).when(deterministicSeedMock).decrypt(keyCrypterMock, "", aesKeyMock);
            doNothing().when(target).addAndActivateHDChain(deterministicKeyChainMock);
            Instant instant = Instant.ofEpochSecond(1700000000);
            //Act Statement(s)
            target.upgradeToDeterministic(ScriptType.P2PKH, structureMock, instant, aesKeyMock);
            //Assert statement(s)
            verify(structureMock).accountPathFor(ScriptType.P2WPKH, BitcoinNetwork.MAINNET);
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
            verify(target).supportsDeterministicChains();
            verify(target).isDeterministicUpgradeRequired(eq(ScriptType.P2PKH), (Instant) any());
            verify(target).getActiveKeyChain(eq(ScriptType.P2WPKH), (Instant) any());
            verify(target).getActiveKeyChain(eq(ScriptType.P2PKH), (Instant) any());
            verify(deterministicSeedMock).isEncrypted();
            verify(deterministicSeedMock).decrypt(keyCrypterMock, "", aesKeyMock);
            verify(target).addAndActivateHDChain(deterministicKeyChainMock);
        }
    }

    //Sapient generated method id: ${f2b86e6d-0e22-333a-82db-1c9f10b03978}, hash: 478AAA59B3033710FAFED6EBF85829A5
    @Test()
    public void upgradeToDeterministic1WhenKeyRotationTimeSecsGreaterThan0() throws DeterministicUpgradeRequiresPassword, UnreadableWalletException {
        /* Branches:
         * (keyRotationTimeSecs > 0) : true
         */
        //Arrange Statement(s)
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "null");
        Network networkMock = mock(Network.class, "MAINNET");
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class, "BIP44");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            byte[] byteArray = new byte[]{};
            AesKey aesKey = new AesKey(byteArray);
            doNothing().when(target).upgradeToDeterministic(eq(ScriptType.P2PKH), eq(keyChainGroupStructureMock), (Instant) any(), eq(aesKey));
            //Act Statement(s)
            target.upgradeToDeterministic(ScriptType.P2PKH, keyChainGroupStructureMock, 1000000000L, aesKey);
            //Assert statement(s)
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).upgradeToDeterministic(eq(ScriptType.P2PKH), eq(keyChainGroupStructureMock), (Instant) any(), eq(aesKey));
        }
    }

    //Sapient generated method id: ${4dadb3cc-fde6-371c-b630-50667d54d0e7}, hash: D4B4DB648F3626DA81398E631604340D
    @Test()
    public void upgradeToDeterministic1WhenKeyRotationTimeSecsNotGreaterThan0() throws DeterministicUpgradeRequiresPassword, UnreadableWalletException {
        /* Branches:
         * (keyRotationTimeSecs > 0) : false
         */
        //Arrange Statement(s)
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "null");
        Network networkMock = mock(Network.class, "MAIN");
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class, "3");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            byte[] byteArray = new byte[]{};
            AesKey aesKey = new AesKey(byteArray);
            doNothing().when(target).upgradeToDeterministic(ScriptType.P2PKH, keyChainGroupStructureMock, (Instant) null, aesKey);
            //Act Statement(s)
            target.upgradeToDeterministic(ScriptType.P2PKH, keyChainGroupStructureMock, 0L, aesKey);
            //Assert statement(s)
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).upgradeToDeterministic(ScriptType.P2PKH, keyChainGroupStructureMock, (Instant) null, aesKey);
        }
    }

    //Sapient generated method id: ${1aec66ef-617f-3def-92bf-9d31fa70becd}, hash: 818F472CFB05C3A8A64515D07BCDBBF5
    @Test()
    public void isDeterministicUpgradeRequiredWhenSupportsDeterministicChainsNot() throws UnreadableWalletException {
        /* Branches:
         * (!supportsDeterministicChains()) : true
         */
        //Arrange Statement(s)
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "null");
        Network networkMock = mock(Network.class, "main");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(false).when(target).supportsDeterministicChains();
            Instant instant = Instant.now();
            //Act Statement(s)
            boolean result = target.isDeterministicUpgradeRequired(ScriptType.P2PKH, instant);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).supportsDeterministicChains();
        }
    }

    //Sapient generated method id: ${b44298f4-ab17-3541-8961-f2a45bc744c6}, hash: A4F86C3B4BF85731670155F0955808CA
    @Test()
    public void isDeterministicUpgradeRequiredWhenGetActiveKeyChainPreferredScriptTypeKeyRotationTimeIsNull() throws UnreadableWalletException {
        /* Branches:
         * (!supportsDeterministicChains()) : false
         * (getActiveKeyChain(preferredScriptType, keyRotationTime) == null) : true
         */
        //Arrange Statement(s)
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "null");
        Network networkMock = mock(Network.class, "main");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(true).when(target).supportsDeterministicChains();
            doReturn(null).when(target).getActiveKeyChain(eq(ScriptType.P2PKH), (Instant) any());
            Instant instant = Instant.now();
            //Act Statement(s)
            boolean result = target.isDeterministicUpgradeRequired(ScriptType.P2PKH, instant);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).supportsDeterministicChains();
            verify(target).getActiveKeyChain(eq(ScriptType.P2PKH), (Instant) any());
        }
    }

    //Sapient generated method id: ${c4a03576-44ea-3099-a9e2-3f1a01957bfb}, hash: 6A7C7647C09CA7B7685AA484A17950BB
    @Test()
    public void isDeterministicUpgradeRequiredWhenGetActiveKeyChainPreferredScriptTypeKeyRotationTimeIsNotNull() throws UnreadableWalletException {
        /* Branches:
         * (!supportsDeterministicChains()) : false
         * (getActiveKeyChain(preferredScriptType, keyRotationTime) == null) : false
         */
        //Arrange Statement(s)
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "null");
        Network networkMock = mock(Network.class, "main");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(true).when(target).supportsDeterministicChains();
            doReturn(deterministicKeyChainMock).when(target).getActiveKeyChain(eq(ScriptType.P2PKH), (Instant) any());
            Instant instant = Instant.now();
            //Act Statement(s)
            boolean result = target.isDeterministicUpgradeRequired(ScriptType.P2PKH, instant);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).supportsDeterministicChains();
            verify(target).getActiveKeyChain(eq(ScriptType.P2PKH), (Instant) any());
        }
    }

    //Sapient generated method id: ${8af15477-3bab-3af5-8017-59042427cd41}, hash: A7BB7E578403B1F378A7D6631D751E21
    @Test()
    public void isDeterministicUpgradeRequired1WhenIsDeterministicUpgradeRequiredPreferredScriptTypeKeyRotationTime() throws UnreadableWalletException {
        /* Branches:
         * (keyRotationTimeSecs > 0) : true
         * (isDeterministicUpgradeRequired(preferredScriptType, keyRotationTime)) : true
         */
        //Arrange Statement(s)
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "null");
        Network networkMock = mock(Network.class, "main");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(true).when(target).isDeterministicUpgradeRequired(eq(ScriptType.P2PKH), (Instant) any());
            //Act Statement(s)
            boolean result = target.isDeterministicUpgradeRequired(ScriptType.P2PKH, 3600L);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).isDeterministicUpgradeRequired(eq(ScriptType.P2PKH), (Instant) any());
        }
    }

    //Sapient generated method id: ${218bb8cc-51d5-314c-affb-e54663443def}, hash: D914E7949A1C6B821EDC1A6DF6FFE2CF
    @Test()
    public void isDeterministicUpgradeRequired1WhenKeyRotationTimeSecsNotGreaterThan0AndIsDeterministicUpgradeRequiredNotPreferredScrip() throws UnreadableWalletException {
        /* Branches:
         * (keyRotationTimeSecs > 0) : false
         * (isDeterministicUpgradeRequired(preferredScriptType, keyRotationTime)) : false
         */
        //Arrange Statement(s)
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "null");
        Network networkMock = mock(Network.class, "main");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(false).when(target).isDeterministicUpgradeRequired(ScriptType.P2PKH, (Instant) null);
            //Act Statement(s)
            boolean result = target.isDeterministicUpgradeRequired(ScriptType.P2PKH, 0L);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).isDeterministicUpgradeRequired(ScriptType.P2PKH, (Instant) null);
        }
    }

    //Sapient generated method id: ${0664a535-91d3-3905-8623-3090432e4b44}, hash: 4D516C80CB2D204848B5AA16ADB6454E
    @Ignore()
    @Test()
    public void toStringWhenChainsIsNotEmpty() throws UnreadableWalletException {
        /* Branches:
         * (basic != null) : true
         * (chains != null) : true
         * (for-each(chains)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basic
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            String result = target.toString(false, false, aesKeyMock);
            //Assert statement(s)
            assertThat(result, equalTo("result1"));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${8d1f030f-dc42-3180-a4da-fb08c8194b69}, hash: 4124B25C6BE8E33645F99EAE3AEB6D8C
    @Test()
    public void getDeterministicKeyChainsTest() throws UnreadableWalletException {
        //Arrange Statement(s)
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "null");
        Network networkMock = mock(Network.class, "main");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(false).when(target).supportsDeterministicChains();
            //Act Statement(s)
            List<DeterministicKeyChain> result = target.getDeterministicKeyChains();
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
            verify(target).supportsDeterministicChains();
        }
    }

    //Sapient generated method id: ${0f2c5a70-b1bb-37b2-b323-4a86fe0b6f58}, hash: 4422ED690CC78CE0A51A6E7F27708DBC
    @Test()
    public void getCombinedKeyLookaheadEpochsWhenChainsIsNotEmpty() throws UnreadableWalletException {
        /* Branches:
         * (for-each(chains)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(false).when(target).supportsDeterministicChains();
            //Act Statement(s)
            int result = target.getCombinedKeyLookaheadEpochs();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
            verify(target).supportsDeterministicChains();
        }
    }
}
