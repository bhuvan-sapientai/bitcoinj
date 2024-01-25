package org.bitcoinj.wallet;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
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
import org.bitcoinj.base.LegacyAddress;
import org.bitcoinj.crypto.KeyCrypter;
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
import org.bitcoinj.crypto.EncryptedData;
import org.bitcoinj.base.BitcoinNetwork;
import org.bitcoinj.crypto.ChildNumber;
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
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

import java.util.Arrays;

public class KeyChainGroupSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final LegacyAddress addressMock = mock(LegacyAddress.class);

    private final AesKey aesKeyMock = mock(AesKey.class);

    private final BasicKeyChain basicKeyChainMock = mock(BasicKeyChain.class);

    private final CurrentKeyChangeEventListener currentKeyChangeEventListenerMock = mock(CurrentKeyChangeEventListener.class, "CurrentKeyChangeEventListener");

    private final DeterministicKeyChain deterministicKeyChain2Mock = mock(DeterministicKeyChain.class, "List<DeterministicKeyChain>");

    private final DeterministicKeyChain deterministicKeyChainMock = mock(DeterministicKeyChain.class);

    private final DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);

    private final DeterministicKey deterministicKeyMock2 = mock(DeterministicKey.class);

    private final DeterministicKey deterministicKeyMock3 = mock(DeterministicKey.class);

    private final ECKey eCKeyMock = mock(ECKey.class);

    private final HDPath hDPathMock = mock(HDPath.class);

    private final HDPath hDPathMock2 = mock(HDPath.class);

    private final HDPath hDPathMock3 = mock(HDPath.class);

    private final HDPath hDPathMock4 = mock(HDPath.class);

    private final KeyChainEventListener keyChainEventListenerMock = mock(KeyChainEventListener.class);

    private final KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class);

    private final KeyChainGroup.Builder keyChainGroupBuilderMock = mock(KeyChainGroup.Builder.class);

    private final KeyChainGroup keyChainGroupMock = mock(KeyChainGroup.class);

    private final KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);

    private final KeyCrypter keyCrypterMock = mock(KeyCrypter.class);

    private final KeyCrypter keyCrypterMock2 = mock(KeyCrypter.class);

    private final Network networkMock = mock(Network.class);

    private final Network networkMock2 = mock(Network.class);

    private final NetworkParameters paramsMock = mock(NetworkParameters.class);

    private final RedeemData redeemDataMock = mock(RedeemData.class);

    private final KeyChainGroupStructure structureMock = mock(KeyChainGroupStructure.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    private final DeterministicSeed deterministicSeedMock = mock(DeterministicSeed.class);

    //Sapient generated method id: ${2db419e2-4303-3e7b-b012-60022e96fe83}
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

    //Sapient generated method id: ${21cdcafe-93b7-3d27-bab3-f06179abbdbf}
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

    //Sapient generated method id: ${ed212fe2-2afd-3617-872a-5724a1f34c1c}
    @Test()
    public void builderTest() {
        //Act Statement(s)
        KeyChainGroup.Builder result = KeyChainGroup.builder(networkMock);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${8285b4a2-d634-38d5-81a1-7c26cb7edae1}
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

    //Sapient generated method id: ${8babf19b-4ca2-300c-a3c9-84d88a3e0a37}
    @Test()
    public void builder2Test() {
        //Act Statement(s)
        KeyChainGroup.Builder result = KeyChainGroup.builder(networkMock, keyChainGroupStructureMock);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${f4b7f558-96b7-3c27-a3ef-61390dff4e9c}
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

    //Sapient generated method id: ${44ea1306-e5d0-3b5a-af55-f79643c6c064}
    @Test()
    public void supportsDeterministicChainsWhenChainsIsNotNull() throws UnreadableWalletException {
        /* Branches:
         * (chains != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            boolean result = target.supportsDeterministicChains();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${669fd98b-fc1c-3efe-b3e1-b70bf17bce03}
    @Ignore()
    @Test()
    public void supportsDeterministicChainsWhenChainsIsNull() throws UnreadableWalletException {
        /* Branches:
         * (chains != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            boolean result = target.supportsDeterministicChains();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${2b04d907-ee7d-3dd8-b72d-81136fe9daab}
    @Ignore()
    @Test()
    public void isSupportsDeterministicChainsWhenSupportsDeterministicChains() throws UnreadableWalletException {
        /* Branches:
         * (supportsDeterministicChains()) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(true).when(target).supportsDeterministicChains();
            //Act Statement(s)
            boolean result = target.isSupportsDeterministicChains();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).supportsDeterministicChains();
        }
    }

    //Sapient generated method id: ${0e15db47-1e86-32ab-8e5f-c06189307689}
    @Ignore()
    @Test()
    public void isSupportsDeterministicChainsWhenSupportsDeterministicChainsNot() throws UnreadableWalletException {
        /* Branches:
         * (supportsDeterministicChains()) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(false).when(target).supportsDeterministicChains();
            //Act Statement(s)
            boolean result = target.isSupportsDeterministicChains();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).supportsDeterministicChains();
        }
    }

    //Sapient generated method id: ${1fa5f7b9-bbce-3706-b081-a7df8d4cccc0}
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
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKeyChain chainMock = mock(DeterministicKeyChain.class, "DeterministicKeyChain");
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "KeyCrypter");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "KeyChainFactory");
        Network networkMock = mock(Network.class, "Network");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            doNothing().when(chainMock).addEventListener(keyChainEventListenerMock, (Executor) null);
            doNothing().when(chainMock).setLookaheadSize(0);
            doNothing().when(chainMock).setLookaheadThreshold(0);
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(false).when(target).supportsDeterministicChains();
            //Act Statement(s)
            target.addAndActivateHDChain(chainMock);
            //Assert statement(s)
            verify(chainMock).addEventListener(keyChainEventListenerMock, (Executor) null);
            verify(chainMock).setLookaheadSize(0);
            verify(chainMock).setLookaheadThreshold(0);
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
            verify(target).supportsDeterministicChains();
        }
    }

    //Sapient generated method id: ${1dfc1bae-6da8-39ed-8e8e-10c11856d532}
    @Ignore()
    @Test()
    public void currentKeyWhenCurrentIsNull() throws UnreadableWalletException {
        /* Branches:
         * (current == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "null");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "KeyChainFactory");
        Network networkMock = mock(Network.class, "MAIN");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(deterministicKeyChainMock).when(target).getActiveKeyChain();
            doReturn(deterministicKeyMock).when(target).freshKey(KeyChain.KeyPurpose.RECEIVE_FUNDS);
            //Act Statement(s)
            DeterministicKey result = target.currentKey(KeyChain.KeyPurpose.RECEIVE_FUNDS);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyMock));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).getActiveKeyChain();
            verify(target).freshKey(KeyChain.KeyPurpose.RECEIVE_FUNDS);
        }
    }

    //Sapient generated method id: ${4700d8c0-ad4b-347d-a087-63aa9342de39}
    @Ignore()
    @Test()
    public void currentAddressWhenOutputScriptTypeEqualsScriptTypeP2WPKH() throws UnreadableWalletException {
        /* Branches:
         * (outputScriptType == ScriptType.P2PKH) : false
         * (outputScriptType == ScriptType.P2WPKH) : true
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "null");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "{}");
        Network networkMock = mock(Network.class, "org.bitcoinj.params.MainNetParams@4d8f7e27");
        Address addressMock = mock(Address.class, "{}");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            DeterministicKeyChain deterministicKeyChain2 = DeterministicKeyChain.builder().outputScriptType(ScriptType.P2WPKH).build();
            doReturn(deterministicKeyChain2).when(target).getActiveKeyChain();
            doReturn(deterministicKeyMock).when(target).currentKey(KeyChain.KeyPurpose.RECEIVE_FUNDS);
            doReturn(addressMock).when(deterministicKeyMock).toAddress(ScriptType.P2WPKH, networkMock);
            //Act Statement(s)
            Address result = target.currentAddress(KeyChain.KeyPurpose.RECEIVE_FUNDS);
            //Assert statement(s)
            assertThat(result, equalTo(addressMock));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).getActiveKeyChain();
            verify(target).currentKey(KeyChain.KeyPurpose.RECEIVE_FUNDS);
            verify(deterministicKeyMock).toAddress(ScriptType.P2WPKH, networkMock);
        }
    }

    //Sapient generated method id: ${39351ac9-8df5-35d1-9baa-eafb246b3330}
    @Ignore()
    @Test()
    public void currentAddressWhenOutputScriptTypeNotEqualsScriptTypeP2WPKHThrowsIllegalStateException() throws UnreadableWalletException {
        /* Branches:
         * (outputScriptType == ScriptType.P2PKH) : false
         * (outputScriptType == ScriptType.P2WPKH) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
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

    //Sapient generated method id: ${c7473f39-055c-3be2-a4d9-f5a3918f676a}
    @Ignore()
    @Test()
    public void freshKeyTest() throws UnreadableWalletException {
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "KeyCrypter");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "KeyChainFactory");
        Network networkMock = mock(Network.class, "Network");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
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

    //Sapient generated method id: ${b83c3305-ad57-368d-8ec5-b45ffefcdb25}
    @Ignore()
    @Test()
    public void freshKeysTest() throws UnreadableWalletException {
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "<value>");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "<value>");
        Network networkMock = mock(Network.class, "<value>");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(deterministicKeyChainMock).when(target).getActiveKeyChain();
            List<DeterministicKey> deterministicKeyList = new ArrayList<>();
            doReturn(deterministicKeyList).when(deterministicKeyChainMock).getKeys(KeyChain.KeyPurpose.RECEIVE_FUNDS, 1);
            //Act Statement(s)
            List<DeterministicKey> result = target.freshKeys(KeyChain.KeyPurpose.RECEIVE_FUNDS, 1);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyList));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).getActiveKeyChain();
            verify(deterministicKeyChainMock).getKeys(KeyChain.KeyPurpose.RECEIVE_FUNDS, 1);
        }
    }

    //Sapient generated method id: ${9fdd0f4f-b541-3f70-a4a5-02f0634c8ead}
    @Ignore()
    @Test()
    public void freshAddress2WhenOutputScriptTypeEqualsScriptTypeP2WPKH() throws UnreadableWalletException {
        /* Branches:
         * (outputScriptType == ScriptType.P2PKH) : false
         * (outputScriptType == ScriptType.P2WPKH) : true
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "<KeyCrypter>");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "<KeyChainFactory>");
        Network networkMock = mock(Network.class, "<Network>");
        Address addressMock = mock(Address.class);
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            DeterministicKeyChain deterministicKeyChain2 = DeterministicKeyChain.builder().outputScriptType(ScriptType.P2PKH).build();
            doReturn(deterministicKeyChain2).when(target).getActiveKeyChain();
            doReturn(deterministicKeyMock).when(target).freshKey(KeyChain.KeyPurpose.RECEIVE_FUNDS);
            doReturn(addressMock).when(deterministicKeyMock).toAddress(ScriptType.P2PKH, networkMock);
            //Act Statement(s)
            Address result = target.freshAddress(KeyChain.KeyPurpose.RECEIVE_FUNDS);
            //Assert statement(s)
            assertThat(result, equalTo(addressMock));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).getActiveKeyChain();
            verify(target).freshKey(KeyChain.KeyPurpose.RECEIVE_FUNDS);
            verify(deterministicKeyMock).toAddress(ScriptType.P2PKH, networkMock);
        }
    }

    //Sapient generated method id: ${60869a14-91f0-3f33-b44d-1c81675cb083}
    @Ignore()
    @Test()
    public void freshAddress2WhenOutputScriptTypeNotEqualsScriptTypeP2WPKHThrowsIllegalStateException() throws UnreadableWalletException {
        /* Branches:
         * (outputScriptType == ScriptType.P2PKH) : false
         * (outputScriptType == ScriptType.P2WPKH) : false
         */
        //Arrange Statement(s)
        DeterministicKeyChain deterministicKeyChain2Mock = mock(DeterministicKeyChain.class, "DeterministicKeyChain{seed=Unencrypted seed: 000102030405060708090a0b0c0d0e0f, path=M/0H, outputScriptType=P2SH_P2WPKH, lookaheadSize=5, numChildren=0, purpose=RECEIVE_FUNDS, issuedExternalKeys=0, issuedInternalKeys=0, lookaheadThreshold=100, isFollowing=false, isMarried=false}");
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "null");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "org.bitcoinj.wallet.DefaultKeyChainFactory@6d311334");
        Network networkMock = mock(Network.class, "org.bitcoinj.params.MainNetParams@4f3f5b24");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            DeterministicKeyChain deterministicKeyChain2 = DeterministicKeyChain.builder().outputScriptType(ScriptType.P2TR).build();
            doReturn(deterministicKeyChain2).when(target).getActiveKeyChain();
            IllegalStateException illegalStateException = new IllegalStateException("P2TR");
            thrown.expect(IllegalStateException.class);
            thrown.expectMessage(illegalStateException.getMessage());
            //Act Statement(s)
            target.freshAddress(KeyChain.KeyPurpose.RECEIVE_FUNDS);
            //Assert statement(s)
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).getActiveKeyChain();
        }
    }

    //Sapient generated method id: ${97f24622-71df-39e8-85be-67b9a83dc133}
    @Ignore()
    @Test()
    public void getActiveKeyChainsWhenChainEarliestKeyCreationTimeCompareToKeyRotationTimeGreaterThanOrEqualsTo0() throws UnreadableWalletException {
        /* Branches:
         * (for-each(chains)) : true
         * (keyRotationTime == null) : false
         * (chain.earliestKeyCreationTime().compareTo(keyRotationTime) >= 0) : true
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "<value>");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "<value>");
        Network networkMock = mock(Network.class, "<value>");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            //TODO: Needs to return real value
            doReturn(null).when(deterministicKeyChain2Mock).earliestKeyCreationTime();
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(false).when(target).supportsDeterministicChains();
            thrown.expect(NullPointerException.class);
            Instant instant = Instant.now();
            //Act Statement(s)
            target.getActiveKeyChains(instant);
            //Assert statement(s)
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(deterministicKeyChain2Mock).earliestKeyCreationTime();
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
            verify(target).supportsDeterministicChains();
        }
    }

    //Sapient generated method id: ${b5e3f095-1454-3115-ad95-38ccf7e24207}
    @Ignore()
    @Test()
    public void getActiveKeyChains1WhenKeyRotationTimeSecsGreaterThan0() throws UnreadableWalletException {
        /* Branches:
         * (keyRotationTimeSecs > 0) : true
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "{}");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "{}");
        Network networkMock = mock(Network.class, "{}");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            List<DeterministicKeyChain> deterministicKeyChainList2 = new ArrayList<>();
            doReturn(deterministicKeyChainList2).when(target).getActiveKeyChains((Instant) any());
            //Act Statement(s)
            List<DeterministicKeyChain> result = target.getActiveKeyChains(10L);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyChainList2));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).getActiveKeyChains((Instant) any());
        }
    }

    //Sapient generated method id: ${050fb07f-eb48-39ca-8591-13fdad457488}
    @Ignore()
    @Test()
    public void getActiveKeyChains1WhenKeyRotationTimeSecsNotGreaterThan0() throws UnreadableWalletException {
        /* Branches:
         * (keyRotationTimeSecs > 0) : false
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "null");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "null");
        Network networkMock = mock(Network.class, "null");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            List<DeterministicKeyChain> deterministicKeyChainList2 = new ArrayList<>();
            doReturn(deterministicKeyChainList2).when(target).getActiveKeyChains((Instant) null);
            //Act Statement(s)
            List<DeterministicKeyChain> result = target.getActiveKeyChains(0L);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyChainList2));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).getActiveKeyChains((Instant) null);
        }
    }

    //Sapient generated method id: ${29188e9d-754b-387d-b776-197cadf31b8b}
    @Test()
    public void getActiveKeyChainWhenChainsReversedIsEmpty() throws UnreadableWalletException {
        /* Branches:
         * (for-each(chainsReversed)) : false
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "Scrypt");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "BasicKeyChainFactory");
        Network networkMock = mock(Network.class, "MAINNET");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(false).when(target).supportsDeterministicChains();
            Instant instant = Instant.now();
            //Act Statement(s)
            DeterministicKeyChain result = target.getActiveKeyChain(ScriptType.P2PKH, instant);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
            verify(target).supportsDeterministicChains();
        }
    }

    //Sapient generated method id: ${966f5d82-304d-32de-9c6c-8fb45f771e59}
    @Ignore()
    @Test()
    public void getActiveKeyChain1WhenKeyRotationTimeSecsGreaterThan0() throws UnreadableWalletException {
        /* Branches:
         * (keyRotationTimeSecs > 0) : true
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "{}");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "{}");
        Network networkMock = mock(Network.class, "MAINNET");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(deterministicKeyChainMock).when(target).getActiveKeyChain(eq(ScriptType.P2PKH), (Instant) any());
            //Act Statement(s)
            DeterministicKeyChain result = target.getActiveKeyChain(ScriptType.P2PKH, 1000L);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyChainMock));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).getActiveKeyChain(eq(ScriptType.P2PKH), (Instant) any());
        }
    }

    //Sapient generated method id: ${01ab939c-7a7c-31d5-be54-59e5707b14f7}
    @Ignore()
    @Test()
    public void getActiveKeyChain1WhenKeyRotationTimeSecsNotGreaterThan0() throws UnreadableWalletException {
        /* Branches:
         * (keyRotationTimeSecs > 0) : false
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "KeyCrypter");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "KeyChainFactory");
        Network networkMock = mock(Network.class, "Network");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(deterministicKeyChainMock).when(target).getActiveKeyChain(ScriptType.P2PKH, (Instant) null);
            //Act Statement(s)
            DeterministicKeyChain result = target.getActiveKeyChain(ScriptType.P2PKH, 0L);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyChainMock));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).getActiveKeyChain(ScriptType.P2PKH, (Instant) null);
        }
    }

    //Sapient generated method id: ${78d4792d-fa4a-3182-867c-25e68b889813}
    @Test()
    public void getActiveKeyChain2WhenChainsIsEmptyThrowsDeterministicUpgradeRequiredException() throws UnreadableWalletException {
        /* Branches:
         * (chains.isEmpty()) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(false).when(target).supportsDeterministicChains();
            //Act Statement(s)
            DeterministicKeyChain result = target.getActiveKeyChain();
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyChain2Mock));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
            verify(target).supportsDeterministicChains();
        }
    }

    //Sapient generated method id: ${a89592e7-6ab5-35c6-ba0d-0d429137b4cd}
    @Ignore()
    @Test()
    public void getActiveKeyChain2WhenChainsNotIsEmpty() throws UnreadableWalletException {
        /* Branches:
         * (chains.isEmpty()) : false
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "null");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "org.bitcoinj.wallet.BasicKeyChainFactory@7f31245a");
        Network networkMock = mock(Network.class, "org.bitcoinj.params.MainNetParams@4e25154f");
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

    //Sapient generated method id: ${4e2d65fd-7050-3827-b040-a06370d6f22d}
    @Ignore()
    @Test()
    public void mergeActiveKeyChainsWhenFromGetActiveKeyChainsKeyRotationTimeIsNotEmpty() throws UnreadableWalletException {
        /* Branches:
         * (isEncrypted() == from.isEncrypted()) : true
         * (for-each(from.getActiveKeyChains(keyRotationTime))) : true
         */
        //Arrange Statement(s)
        KeyChainGroup fromMock = mock(KeyChainGroup.class, "{}");
        DeterministicKeyChain deterministicKeyChain2Mock2 = mock(DeterministicKeyChain.class, "List<DeterministicKeyChain>");
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "{}");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "{}");
        Network networkMock = mock(Network.class, "{}");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            doReturn(false).when(fromMock).isEncrypted();
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            doReturn(deterministicKeyChainList).when(fromMock).getActiveKeyChains((Instant) any());
            List<DeterministicKeyChain> deterministicKeyChainList2 = new ArrayList<>();
            deterministicKeyChainList2.add(deterministicKeyChain2Mock2);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList2);
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(false).when(target).isEncrypted();
            doNothing().when(target).addAndActivateHDChain(deterministicKeyChain2Mock);
            Instant instant = Instant.now();
            //Act Statement(s)
            target.mergeActiveKeyChains(fromMock, instant);
            //Assert statement(s)
            verify(fromMock).isEncrypted();
            verify(fromMock).getActiveKeyChains((Instant) any());
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            verify(target).isEncrypted();
            verify(target).addAndActivateHDChain(deterministicKeyChain2Mock);
        }
    }

    //Sapient generated method id: ${b0efa12f-fcff-38b9-ad68-4dd0532a7f35}
    @Test()
    public void mergeActiveKeyChains1WhenKeyRotationTimeSecsGreaterThan0() throws UnreadableWalletException {
        /* Branches:
         * (keyRotationTimeSecs > 0) : true
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "{}");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "{}");
        Network networkMock = mock(Network.class, "{}");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doNothing().when(target).mergeActiveKeyChains((KeyChainGroup) any(), (Instant) any());
            KeyChainGroup keyChainGroup = KeyChainGroup.createBasic(networkMock2);
            //Act Statement(s)
            target.mergeActiveKeyChains(keyChainGroup, 10L);
            //Assert statement(s)
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).mergeActiveKeyChains((KeyChainGroup) any(), (Instant) any());
        }
    }

    //Sapient generated method id: ${2beb32f3-fb0a-3dc7-926f-cfe04a22ec43}
    @Test()
    public void mergeActiveKeyChains1WhenKeyRotationTimeSecsNotGreaterThan0() throws UnreadableWalletException {
        /* Branches:
         * (keyRotationTimeSecs > 0) : false
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "null");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "null");
        Network networkMock = mock(Network.class, "null");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doNothing().when(target).mergeActiveKeyChains((KeyChainGroup) any(), eq((Instant) null));
            KeyChainGroup keyChainGroup = KeyChainGroup.createBasic(networkMock2);
            //Act Statement(s)
            target.mergeActiveKeyChains(keyChainGroup, 0L);
            //Assert statement(s)
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).mergeActiveKeyChains((KeyChainGroup) any(), eq((Instant) null));
        }
    }

    //Sapient generated method id: ${83390225-48c7-3f3b-903d-293ea86f8001}
    @Ignore()
    @Test()
    public void getLookaheadSizeWhenLookaheadSizeEqualsMinus1() throws UnreadableWalletException {
        /* Branches:
         * (lookaheadSize == -1) : true
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "null");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "HDPath");
        Network networkMock = mock(Network.class, "mainnet");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(false).when(target).supportsDeterministicChains();
            //Act Statement(s)
            int result = target.getLookaheadSize();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
            verify(target).supportsDeterministicChains();
        }
    }

    //Sapient generated method id: ${b9f203a7-b976-32f5-a3b4-6b5e08ef1cf4}
    @Ignore()
    @Test()
    public void getLookaheadSizeWhenLookaheadSizeNotEqualsMinus1() throws UnreadableWalletException {
        /* Branches:
         * (lookaheadSize == -1) : false
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "KeyCrypter");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "BasicKeyChainFactory");
        Network networkMock = mock(Network.class, "Network");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(false).when(target).supportsDeterministicChains();
            //Act Statement(s)
            int result = target.getLookaheadSize();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
            verify(target).supportsDeterministicChains();
        }
    }

    //Sapient generated method id: ${c1806282-9020-3437-a0f7-89d22448d68b}
    @Ignore()
    @Test()
    public void getLookaheadThresholdWhenLookaheadThresholdEqualsMinus1() throws UnreadableWalletException {
        /* Branches:
         * (lookaheadThreshold == -1) : true
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "KeyCrypterScrypt");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "BasicKeyChainFactory");
        Network networkMock = mock(Network.class, "MAINNET");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(false).when(target).supportsDeterministicChains();
            //Act Statement(s)
            int result = target.getLookaheadThreshold();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
            verify(target).supportsDeterministicChains();
        }
    }

    //Sapient generated method id: ${ab4df4ff-85c2-33f6-8ade-b6a2ebcd41de}
    @Ignore()
    @Test()
    public void getLookaheadThresholdWhenLookaheadThresholdNotEqualsMinus1() throws UnreadableWalletException {
        /* Branches:
         * (lookaheadThreshold == -1) : false
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "KeyCrypter");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "KeyChainFactory");
        Network networkMock = mock(Network.class, "Network");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(false).when(target).supportsDeterministicChains();
            //Act Statement(s)
            int result = target.getLookaheadThreshold();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
            verify(target).supportsDeterministicChains();
        }
    }

    //Sapient generated method id: ${3e4f80e0-78f4-3998-b2c2-bf3e665bc4b6}
    @Ignore()
    @Test()
    public void importKeysTest() throws UnreadableWalletException {
        /**
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basic
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
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

    //Sapient generated method id: ${04bb7501-6447-3c04-b640-6adae169274f}
    @Test()
    public void importKeys1Test() throws UnreadableWalletException {
        /**
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
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

    //Sapient generated method id: ${2571c489-32ab-35c1-bd4a-d0b0f5d4d34d}
    @Ignore()
    @Test()
    public void checkPasswordWhenKeyCrypterIsNotNullThrowsIllegalStateException() throws UnreadableWalletException {
        /* Branches:
         * (keyCrypter != null) : true
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "<object>");
        DeterministicKeyChain deterministicKeyChain2Mock = mock(DeterministicKeyChain.class, "<List<DeterministicKeyChain>>");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "<object>");
        Network networkMock = mock(Network.class, "<string>");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenThrow(illegalStateException);
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.checkPassword("checkPassword_charSequence1");
            //Assert statement(s)
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${985e8ce0-cd93-3186-a94c-5b1bafe74def}
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
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenThrow(illegalStateException);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, (KeyCrypter) null, keyChainFactoryMock);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.checkPassword("checkPassword_charSequence1");
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${caa7f04e-4a90-3da7-8ac5-ea207885e967}
    @Ignore()
    @Test()
    public void checkAESKeyWhenKeyCrypterIsNotNullThrowsIllegalStateException() throws UnreadableWalletException {
        /* Branches:
         * (keyCrypter != null) : true
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
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenThrow(illegalStateException);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.checkAESKey(aesKeyMock);
            //Assert statement(s)
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${b5dcb133-1450-3f2b-947d-659c6f5b38dc}
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
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq((KeyCrypter) null))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq((KeyCrypter) null), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenThrow(illegalStateException);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, (KeyCrypter) null, keyChainFactoryMock);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.checkAESKey(aesKeyMock);
            //Assert statement(s)
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq((KeyCrypter) null)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq((KeyCrypter) null), eq(keyChainFactoryMock)));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${29fc98eb-3b52-3073-a010-9730a8098f60}
    @Ignore()
    @Test()
    public void importKeysAndEncryptWhenKeyCrypterIsNotNullThrowsIllegalStateException() throws UnreadableWalletException {
        /* Branches:
         * (keyCrypter != null) : true
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
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenThrow(illegalStateException);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            thrown.expect(IllegalStateException.class);
            List<ECKey> eCKeyList = new ArrayList<>();
            //Act Statement(s)
            target.importKeysAndEncrypt(eCKeyList, aesKeyMock);
            //Assert statement(s)
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${9866444f-8752-3dd4-a6f9-0e42e357082d}
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
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq((KeyCrypter) null))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq((KeyCrypter) null), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenThrow(illegalStateException);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, (KeyCrypter) null, keyChainFactoryMock);
            thrown.expect(IllegalStateException.class);
            List<ECKey> eCKeyList = new ArrayList<>();
            //Act Statement(s)
            target.importKeysAndEncrypt(eCKeyList, aesKeyMock);
            //Assert statement(s)
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq((KeyCrypter) null)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq((KeyCrypter) null), eq(keyChainFactoryMock)));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${9bf10f2c-8325-326e-af7f-915a2125aa7b}
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
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "null");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "null");
        Network networkMock = mock(Network.class, "null");
        Script scriptMock = mock(Script.class);
        try (MockedStatic<ByteString> byteString = mockStatic(ByteString.class);
             MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            ByteString byteString2 = ByteString.empty();
            byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3};
            byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteString2);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            RedeemData result = target.findRedeemDataFromScriptHash(byteArray);
            List list = new ArrayList<>();
            RedeemData redeemData = RedeemData.of(list, scriptMock);
            //Assert statement(s)
            //TODO: Please implement equals method in RedeemData for verification to succeed or you need to adjust respective assertion statements
            assertThat(result, equalTo(redeemData));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            byteString.verify(() -> ByteString.copyFrom(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${bace3084-b106-3c04-a3bc-7879c663f2df}
    @Ignore()
    @Test()
    public void findRedeemDataFromScriptHashWhenRedeemDataIsNull() throws UnreadableWalletException {
        /* Branches:
         * (chains != null) : true
         * (iter.hasNext()) : true
         * (redeemData != null) : false
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "null");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "null");
        Network networkMock = mock(Network.class, "null");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3};
            //Act Statement(s)
            RedeemData result = target.findRedeemDataFromScriptHash(byteArray);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${feeddffe-ca8a-3294-a802-a756b6c5a819}
    @Ignore()
    @Test()
    public void markP2SHAddressAsUsedWhenAddressGetOutputScriptTypeNotEqualsScriptTypeP2SHAndDataIsNull() throws UnreadableWalletException {
        /* Branches:
         * (address.getOutputScriptType() == ScriptType.P2SH) : false
         * (data == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            doReturn(ScriptType.P2TR).when(addressMock).getOutputScriptType();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(addressMock).getHash();
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(null).when(target).findRedeemDataFromScriptHash(byteArray);
            //Act Statement(s)
            target.markP2SHAddressAsUsed(addressMock);
            //Assert statement(s)
            verify(addressMock).getOutputScriptType();
            verify(addressMock).getHash();
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            verify(target).findRedeemDataFromScriptHash(byteArray);
        }
    }

    //Sapient generated method id: ${61d3b6a4-f88f-3128-8e42-2612726dccf9}
    @Ignore()
    @Test()
    public void markP2SHAddressAsUsedWhenEntryGetValueIsNotNullAndEntryGetValueNotEqualsAddress() throws UnreadableWalletException {
        /* Branches:
         * (address.getOutputScriptType() == ScriptType.P2SH) : true
         * (data == null) : false
         * (for-each(data.keys)) : true
         * (for-each(chains)) : true
         * (k == null) : true
         * (address.getOutputScriptType() == ScriptType.P2SH) : false  #  inside maybeMarkCurrentAddressAsUsed method
         * (for-each(currentAddresses.entrySet())) : true  #  inside maybeMarkCurrentAddressAsUsed method
         * (entry.getValue() != null) : true  #  inside maybeMarkCurrentAddressAsUsed method
         * (entry.getValue().equals(address)) : false  #  inside maybeMarkCurrentAddressAsUsed method
         */
        //Arrange Statement(s)
        LegacyAddress addressMock = mock(LegacyAddress.class, "33zUJZyRzCnJiWV2J9xG5XtB3FgjzkoutJ");
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "null");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "BASIC");
        Network networkMock = mock(Network.class, "MAIN_NET");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            doReturn(null).when(addressMock).getOutputScriptType();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(addressMock).getHash();
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(null).when(target).findRedeemDataFromScriptHash(byteArray);
            //Act Statement(s)
            target.markP2SHAddressAsUsed(addressMock);
            //Assert statement(s)
            verify(addressMock).getOutputScriptType();
            verify(addressMock).getHash();
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            verify(target).findRedeemDataFromScriptHash(byteArray);
        }
    }

    //Sapient generated method id: ${6649b901-5dc0-3424-bcf5-df4ca9e2b34a}
    @Ignore()
    @Test()
    public void markP2SHAddressAsUsedWhenCurrentKeyChangeListenersIsEmpty() throws UnreadableWalletException {
        /* Branches:
         * (address.getOutputScriptType() == ScriptType.P2SH) : true
         * (data == null) : false
         * (for-each(data.keys)) : true
         * (for-each(chains)) : true
         * (k == null) : true
         * (address.getOutputScriptType() == ScriptType.P2SH) : true  #  inside maybeMarkCurrentAddressAsUsed method
         * (for-each(currentAddresses.entrySet())) : true  #  inside maybeMarkCurrentAddressAsUsed method
         * (entry.getValue() != null) : true  #  inside maybeMarkCurrentAddressAsUsed method
         * (entry.getValue().equals(address)) : true  #  inside maybeMarkCurrentAddressAsUsed method
         * (for-each(currentKeyChangeListeners)) : false  #  inside queueOnCurrentKeyChanged method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        RedeemData redeemDataMock = mock(RedeemData.class);
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            doReturn(ScriptType.P2SH).when(addressMock).getOutputScriptType();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(addressMock).getHash();
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            byte[] byteArray2 = new byte[]{};
            doReturn(null).when(deterministicKeyChain2Mock).findKeyFromPubKey(byteArray2);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(redeemDataMock).when(target).findRedeemDataFromScriptHash(byteArray);
            //Act Statement(s)
            target.markP2SHAddressAsUsed(addressMock);
            //Assert statement(s)
            verify(addressMock).getOutputScriptType();
            verify(addressMock).getHash();
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(deterministicKeyChain2Mock).findKeyFromPubKey(byteArray2);
            verify(target).findRedeemDataFromScriptHash(byteArray);
        }
    }

    //Sapient generated method id: ${10b59813-5889-334f-8519-745bae1d0b4a}
    @Test()
    public void findKeyFromPubKeyHashWhenResultAssignedBasicFindKeyFromPubHashPubKeyHashIsNotNull() throws UnreadableWalletException {
        /* Branches:
         * ((result = basic.findKeyFromPubHash(pubKeyHash)) != null) : true
         *
         * */
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

    //Sapient generated method id: ${e3b99e2d-7038-3fce-b3f9-78c8079fde61}
    @Test()
    public void findKeyFromPubKeyHashWhenScriptTypeNotEqualsChainGetOutputScriptType() throws UnreadableWalletException {
        /* Branches:
         * ((result = basic.findKeyFromPubHash(pubKeyHash)) != null) : false
         * (chains != null) : true
         * (for-each(chains)) : true
         * (scriptType != null) : true
         * (scriptType != chain.getOutputScriptType()) : true
         *
         * */
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

    //Sapient generated method id: ${b96a1840-c429-301a-b872-6adc06b5e32f}
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

    //Sapient generated method id: ${6d268e74-7000-3632-af00-a8bdff320f1c}
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
         * */
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

    //Sapient generated method id: ${3dd9d7bd-a429-32f2-b8e1-0c155859f661}
    @Ignore()
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

    //Sapient generated method id: ${5ac20818-b371-3f28-b847-6639b6946ba8}
    @Ignore()
    @Test()
    public void markPubKeyHashAsUsedWhenEntryGetValueNotEqualsKey() throws UnreadableWalletException {
        /* Branches:
         * (chains != null) : true
         * (for-each(chains)) : true
         * ((key = chain.markPubHashAsUsed(pubKeyHash)) != null) : true
         * (for-each(currentKeys.entrySet())) : true  #  inside maybeMarkCurrentKeyAsUsed method
         * (entry.getValue() != null) : true  #  inside maybeMarkCurrentKeyAsUsed method
         * (entry.getValue().equals(key)) : false  #  inside maybeMarkCurrentKeyAsUsed method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "null");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "null");
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class, "DeterministicKey");
        Network networkMock = mock(Network.class, "null");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            byte[] byteArray = new byte[]{(byte) 0};
            doReturn(deterministicKeyMock).when(deterministicKeyChain2Mock).markPubHashAsUsed(byteArray);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            target.markPubKeyHashAsUsed(byteArray);
            //Assert statement(s)
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(deterministicKeyChain2Mock).markPubHashAsUsed(byteArray);
        }
    }

    //Sapient generated method id: ${9621cab0-842c-37fb-8f2c-0fafe143869e}
    @Ignore()
    @Test()
    public void markPubKeyHashAsUsedWhenCurrentKeyChangeListenersIsEmpty() throws UnreadableWalletException {
        /* Branches:
         * (chains != null) : true
         * (for-each(chains)) : true
         * ((key = chain.markPubHashAsUsed(pubKeyHash)) != null) : true
         * (for-each(currentKeys.entrySet())) : true  #  inside maybeMarkCurrentKeyAsUsed method
         * (entry.getValue() != null) : true  #  inside maybeMarkCurrentKeyAsUsed method
         * (entry.getValue().equals(key)) : true  #  inside maybeMarkCurrentKeyAsUsed method
         * (for-each(currentKeyChangeListeners)) : false  #  inside queueOnCurrentKeyChanged method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "{}");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "{}");
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class, "DeterministicKey");
        Network networkMock = mock(Network.class, "MAIN");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3};
            doReturn(deterministicKeyMock).when(deterministicKeyChain2Mock).markPubHashAsUsed(byteArray);
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(deterministicKeyMock2).when(target).freshKey(KeyChain.KeyPurpose.RECEIVE_FUNDS);
            //Act Statement(s)
            target.markPubKeyHashAsUsed(byteArray);
            //Assert statement(s)
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(deterministicKeyChain2Mock).markPubHashAsUsed(byteArray);
            verify(target).freshKey(KeyChain.KeyPurpose.RECEIVE_FUNDS);
        }
    }

    //Sapient generated method id: ${83e9ae3d-7e65-3d0f-bf8f-f62a26ce6051}
    @Ignore()
    @Test()
    public void hasKeyWhenBasicHasKeyKey() throws UnreadableWalletException {
        /* Branches:
         * (basic.hasKey(key)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basic
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
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

    //Sapient generated method id: ${8871e489-92c5-31e0-84f1-f1e773941676}
    @Ignore()
    @Test()
    public void hasKeyWhenChainHasKeyKey() throws UnreadableWalletException {
        /* Branches:
         * (basic.hasKey(key)) : false
         * (chains != null) : true
         * (for-each(chains)) : true
         * (chain.hasKey(key)) : true
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "<value>");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "<value>");
        Network networkMock = mock(Network.class, "<value>");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            ECKey eCKey = new ECKey();
            doReturn(false).when(deterministicKeyChain2Mock).hasKey(eCKey);
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            boolean result = target.hasKey(eCKey);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(deterministicKeyChain2Mock).hasKey(eCKey);
        }
    }

    //Sapient generated method id: ${6e12a94e-baae-38c1-9954-c468b1a17264}
    @Ignore()
    @Test()
    public void hasKeyWhenChainNotHasKeyKey() throws UnreadableWalletException {
        /* Branches:
         * (basic.hasKey(key)) : false
         * (chains != null) : true
         * (for-each(chains)) : true
         * (chain.hasKey(key)) : false
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "<value>");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "<value>");
        Network networkMock = mock(Network.class, "<value>");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            ECKey eCKey = new ECKey();
            doReturn(false).when(deterministicKeyChain2Mock).hasKey(eCKey);
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            boolean result = target.hasKey(eCKey);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(deterministicKeyChain2Mock).hasKey(eCKey);
        }
    }

    //Sapient generated method id: ${e6a786fb-106e-3b81-a712-44349b38ddfe}
    @Test()
    public void findKeyFromPubKeyWhenResultAssignedBasicFindKeyFromPubKeyPubKeyIsNotNull() throws UnreadableWalletException {
        /* Branches:
         * ((result = basic.findKeyFromPubKey(pubKey)) != null) : true
         *
         * */
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

    //Sapient generated method id: ${997b6092-b34a-34ba-b491-78d522ca56c8}
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

    //Sapient generated method id: ${2e16d0ef-1ae3-39a3-a54d-f32e61c438f5}
    @Test()
    public void findKeyFromPubKeyWhenResultAssignedChainFindKeyFromPubKeyPubKeyIsNull() throws UnreadableWalletException {
        /* Branches:
         * ((result = basic.findKeyFromPubKey(pubKey)) != null) : false
         * (chains != null) : true
         * (for-each(chains)) : true
         * ((result = chain.findKeyFromPubKey(pubKey)) != null) : false
         *
         * */
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

    //Sapient generated method id: ${33c88862-413d-38ab-ba87-77c7512c600f}
    @Ignore()
    @Test()
    public void markPubKeyAsUsedWhenKeyAssignedChainMarkPubKeyAsUsedPubkeyIsNull() throws UnreadableWalletException {
        /* Branches:
         * (chains != null) : true
         * (for-each(chains)) : true
         * ((key = chain.markPubKeyAsUsed(pubkey)) != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3};
            doReturn(null).when(deterministicKeyChain2Mock).markPubKeyAsUsed(byteArray);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            target.markPubKeyAsUsed(byteArray);
            //Assert statement(s)
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(deterministicKeyChain2Mock).markPubKeyAsUsed(byteArray);
        }
    }

    //Sapient generated method id: ${629255e1-6111-3265-bca4-d15527fcda09}
    @Test()
    public void markPubKeyAsUsedWhenEntryGetValueNotEqualsKey() throws UnreadableWalletException {
        /* Branches:
         * (chains != null) : true
         * (for-each(chains)) : true
         * ((key = chain.markPubKeyAsUsed(pubkey)) != null) : true
         * (for-each(currentKeys.entrySet())) : true  #  inside maybeMarkCurrentKeyAsUsed method
         * (entry.getValue() != null) : true  #  inside maybeMarkCurrentKeyAsUsed method
         * (entry.getValue().equals(key)) : false  #  inside maybeMarkCurrentKeyAsUsed method
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "{}");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "{}");
        Network networkMock = mock(Network.class, "MAINNET");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3, (byte) 4};
            //Act Statement(s)
            target.markPubKeyAsUsed(byteArray);
            //Assert statement(s)
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${2fabdf36-4935-315e-8807-afcb0ab1fe19}
    @Ignore()
    @Test()
    public void markPubKeyAsUsedWhenCurrentKeyChangeListenersIsEmpty() throws UnreadableWalletException {
        /* Branches:
         * (chains != null) : true
         * (for-each(chains)) : true
         * ((key = chain.markPubKeyAsUsed(pubkey)) != null) : true
         * (for-each(currentKeys.entrySet())) : true  #  inside maybeMarkCurrentKeyAsUsed method
         * (entry.getValue() != null) : true  #  inside maybeMarkCurrentKeyAsUsed method
         * (entry.getValue().equals(key)) : true  #  inside maybeMarkCurrentKeyAsUsed method
         * (for-each(currentKeyChangeListeners)) : false  #  inside queueOnCurrentKeyChanged method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "KeyCrypter.AES");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "BasicKeyChainFactory");
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class, "DeterministicKey");
        Network networkMock = mock(Network.class, "Network.MAINNET");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            byte[] byteArray = new byte[]{(byte) 0};
            doReturn(deterministicKeyMock).when(deterministicKeyChain2Mock).markPubKeyAsUsed(byteArray);
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(deterministicKeyMock2).when(target).freshKey(KeyChain.KeyPurpose.RECEIVE_FUNDS);
            //Act Statement(s)
            target.markPubKeyAsUsed(byteArray);
            //Assert statement(s)
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(deterministicKeyChain2Mock).markPubKeyAsUsed(byteArray);
            verify(target).freshKey(KeyChain.KeyPurpose.RECEIVE_FUNDS);
        }
    }

    //Sapient generated method id: ${afe26067-9822-3797-97c9-583420253848}
    @Test()
    public void numKeysWhenChainsIsNotEmpty() throws UnreadableWalletException {
        /* Branches:
         * (chains != null) : true
         * (for-each(chains)) : true
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "{}");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "{}");
        Network networkMock = mock(Network.class, "MAINNET");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            doReturn(0).when(deterministicKeyChain2Mock).numKeys();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            int result = target.numKeys();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(deterministicKeyChain2Mock).numKeys();
        }
    }

    //Sapient generated method id: ${b479d457-6f68-3403-bcb2-1fcb6f92f479}
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
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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

    //Sapient generated method id: ${c02a531d-02c2-3090-9e3a-84ecf1bd21cb}
    @Ignore()
    @Test()
    public void removeImportedKeyWhenKeyInstanceOfDeterministicKeyAndBasicNotRemoveKeyKey() throws UnreadableWalletException {
        /* Branches:
         * (!(key instanceof DeterministicKey)) : false
         * (basic.removeKey(key)) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basic
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            boolean result = target.removeImportedKey(deterministicKeyMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
        }
    }

    //Sapient generated method id: ${af1eba2c-6545-3701-afc9-a05d6ef33424}
    @Test()
    public void encryptWhenChainsNotIsEmptyThrowsIllegalStateException() throws UnreadableWalletException {
        /* Branches:
         * (chains != null) : true
         * (!chains.isEmpty()) : true
         *
         * */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenThrow(illegalStateException);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.encrypt(keyCrypterMock2, aesKeyMock);
            //Assert statement(s)
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${aa93e0c4-2185-3cdd-99a6-edb499241cf3}
    @Test()
    public void encryptWhenBasicNumKeysEquals0ThrowsIllegalStateException() throws UnreadableWalletException {
        /* Branches:
         * (chains != null) : true
         * (!chains.isEmpty()) : false
         * (basic.numKeys() != 0) : false
         *
         * */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenThrow(illegalStateException);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.encrypt(keyCrypterMock2, aesKeyMock);
            //Assert statement(s)
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${feb58fd9-f666-3d5c-a938-7121a959edef}
    @Ignore()
    @Test()
    public void decryptWhenChainsIsNotEmpty() throws UnreadableWalletException {
        /* Branches:
         * (chains != null) : true
         * (for-each(chains)) : true
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "{}");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "{}");
        Network networkMock = mock(Network.class, "MAIN");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            byte[] byteArray = new byte[]{};
            AesKey aesKey = new AesKey(byteArray);
            //Act Statement(s)
            target.decrypt(aesKey);
            //Assert statement(s)
            assertThat(target.getKeyCrypter(), is(nullValue()));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${116ef318-e704-324a-bfe2-51c037b17134}
    @Ignore()
    @Test()
    public void isEncryptedWhenKeyCrypterIsNotNull() throws UnreadableWalletException {
        /* Branches:
         * (keyCrypter != null) : true
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "{}");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "{}");
        Network networkMock = mock(Network.class, "{}");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            boolean result = target.isEncrypted();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${fb4885d6-9d6e-3304-8242-966497227d83}
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
        Network networkMock = mock(Network.class, "<value>");
        Protos.Key key = Protos.Key.getDefaultInstance();
        List<Protos.Key> protosKeyList = new ArrayList<>();
        protosKeyList.add(key);
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "<value>");
        KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, (KeyCrypter) null, keyChainFactoryMock);
        //Act Statement(s)
        boolean result = target.isEncrypted();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${c58c8bf3-6f2e-3c1f-ae82-cc8bd5cc3049}
    @Test()
    public void isWatchingWhenActiveStateEqualsBasicKeyChainStateEMPTYThrowsIllegalStateException() throws UnreadableWalletException {
        /* Branches:
         * (chains != null) : true
         * (!chains.isEmpty()) : false
         * (basicState == BasicKeyChain.State.EMPTY) : true
         * (activeState == BasicKeyChain.State.EMPTY) : true
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "KeyCrypter");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "KeyChainFactory");
        Network networkMock = mock(Network.class, "Network");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(deterministicKeyChainMock).when(target).getActiveKeyChain();
            doReturn(true).when(deterministicKeyChainMock).isWatching();
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

    //Sapient generated method id: ${7e6631f3-f0a8-3bdc-adda-0d6e4099b026}
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
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "KeyCrypter");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "KeyChainFactory");
        Network networkMock = mock(Network.class, "Network");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
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

    //Sapient generated method id: ${5406ca00-b352-3021-a157-0ca99fb301e8}
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
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
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

    //Sapient generated method id: ${b88d93ca-8962-3682-ab2e-c47b2e72b744}
    @Ignore()
    @Test()
    public void getImportedKeysTest() throws UnreadableWalletException {
        /**
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basic
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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

    //Sapient generated method id: ${12248e23-6ba4-35f1-9c2a-5f6491a8546a}
    @Ignore()
    @Test()
    public void earliestKeyCreationTimeWhenChainsIsNull() throws UnreadableWalletException {
        /* Branches:
         * (chains == null) : true  #  inside getEarliestChainsCreationTime method
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "KeyCrypter");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "KeyChainFactory");
        Network networkMock = mock(Network.class, "Bitcoin");
        try (MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class);
             MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            doReturn(null).when(deterministicKeyChain2Mock).earliestKeyCreationTime();
            BasicKeyChain basicKeyChain2 = new BasicKeyChain();
            Instant instant2 = basicKeyChain2.earliestKeyCreationTime();
            Instant instant3 = Instant.MAX;
            Instant instant = TimeUtils.earlier(instant2, instant3);
            timeUtils.when(() -> TimeUtils.earlier((Instant) any(), (Instant) any())).thenReturn(instant);
            Protos.Key key = Protos.Key.getDefaultInstance();
            Protos.Key key2 = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            protosKeyList.add(key2);
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            Instant result = target.earliestKeyCreationTime();
            //Assert statement(s)
            assertThat(result, equalTo(instant));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(deterministicKeyChain2Mock).earliestKeyCreationTime();
            timeUtils.verify(() -> TimeUtils.earlier((Instant) any(), (Instant) any()));
        }
    }

    //Sapient generated method id: ${a420d8c8-2318-3573-a179-9e1243bc3aa1}
    @Ignore()
    @Test()
    public void earliestKeyCreationTimeWhenChainsIsNotNull() throws UnreadableWalletException {
        /* Branches:
         * (chains == null) : false  #  inside getEarliestChainsCreationTime method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class);
             MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            Instant instant = Instant.now();
            timeUtils.when(() -> TimeUtils.earlier((Instant) any(), (Instant) any())).thenReturn(instant);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            Instant result = target.earliestKeyCreationTime();
            //Assert statement(s)
            assertThat(result, equalTo(instant));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            timeUtils.verify(() -> TimeUtils.earlier((Instant) any(), (Instant) any()));
        }
    }

    //Sapient generated method id: ${1d2e5f85-64cf-3284-bfe2-0d7ca3ca4973}
    @Ignore()
    @Test()
    public void getEarliestKeyCreationTimeWhenEarliestKeyCreationTimeEqualsInstantMAX() throws UnreadableWalletException {
        /* Branches:
         * (earliestKeyCreationTime.equals(Instant.MAX)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "{}");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "{}");
        Network networkMock = mock(Network.class, "MAINNET");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            Instant instant = Instant.now();
            doReturn(instant).when(target).earliestKeyCreationTime();
            //Act Statement(s)
            long result = target.getEarliestKeyCreationTime();
            //Assert statement(s)
            assertThat(result, equalTo(9223372036854775807L));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).earliestKeyCreationTime();
        }
    }

    //Sapient generated method id: ${f839e95b-ccfc-30b9-ac50-5523ad76e2d3}
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
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "new KeyCrypter()");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "new KeyChainFactory()");
        Network networkMock = mock(Network.class, "Network.MAINNET");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            Instant instant = Instant.now();
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

    //Sapient generated method id: ${e8a0d404-00d9-36cb-bbb1-9c8f6fa9f5a3}
    @Ignore()
    @Test()
    public void getBloomFilterElementCountWhenChainsIsNotEmpty() throws UnreadableWalletException {
        /* Branches:
         * (chains != null) : true
         * (for-each(chains)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            doReturn(0).when(deterministicKeyChain2Mock).numBloomFilterEntries();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            int result = target.getBloomFilterElementCount();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(deterministicKeyChain2Mock).numBloomFilterEntries();
        }
    }

    //Sapient generated method id: ${7ae3102b-4c69-3d06-9c75-35241ed8175c}
    @Ignore()
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
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "{}");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "{}");
        Network networkMock = mock(Network.class, "{}");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            BloomFilter bloomFilter = new BloomFilter(0, Double.parseDouble("0.0"), 0);
            doReturn(bloomFilter).when(deterministicKeyChain2Mock).getFilter(100, Double.parseDouble("0.01"), 10);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            BloomFilter result = target.getBloomFilter(100, Double.parseDouble("0.01"), 10);
            BloomFilter bloomFilter2 = new BloomFilter(100, Double.parseDouble("0.01"), 10);
            //Assert statement(s)
            assertThat(result, equalTo(bloomFilter2));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(deterministicKeyChain2Mock).getFilter(100, Double.parseDouble("0.01"), 10);
        }
    }

    //Sapient generated method id: ${d00db6e5-ccdd-3421-92b6-ef891481d383}
    @Ignore()
    @Test()
    public void isRequiringUpdateAllBloomFilterThrowsUnsupportedOperationException() throws UnreadableWalletException {
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "KeyCrypter");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "KeyChainFactory");
        Network networkMock = mock(Network.class, "Network");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
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

    //Sapient generated method id: ${0b160154-951e-3a14-95bd-e6793a7bce96}
    @Ignore()
    @Test()
    public void addEventListenerTest() throws UnreadableWalletException {
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "<KeyCrypter object>");
        DeterministicKeyChain deterministicKeyChain2Mock = mock(DeterministicKeyChain.class, "<List<DeterministicKeyChain> object>");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "<KeyChainFactory object>");
        Network networkMock = mock(Network.class, "<Network object>");
        KeyChainEventListener keyChainEventListenerMock = mock(KeyChainEventListener.class, "<KeyChainEventListener object>");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doNothing().when(target).addEventListener(keyChainEventListenerMock, (Executor) null);
            //Act Statement(s)
            target.addEventListener(keyChainEventListenerMock);
            //Assert statement(s)
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).addEventListener(keyChainEventListenerMock, (Executor) null);
        }
    }

    //Sapient generated method id: ${1aca89a0-f8af-3439-8252-530fa02bc5be}
    @Ignore()
    @Test()
    public void addEventListener1WhenChainsIsNotEmpty() throws UnreadableWalletException {
        /* Branches:
         * (chains != null) : true
         * (for-each(chains)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "KeyCrypter");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "KeyChainFactory");
        Network networkMock = mock(Network.class, "Network");
        KeyChainEventListener keyChainEventListenerMock = mock(KeyChainEventListener.class, "KeyChainEventListener");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            thrown.expect(NullPointerException.class);
            //TODO: Needs initialization with real value
            Executor executor = null;
            //Act Statement(s)
            target.addEventListener(keyChainEventListenerMock, executor);
            //Assert statement(s)
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${7f65cc3a-1339-3f5d-a00d-e1560ed9f31f}
    @Ignore()
    @Test()
    public void removeEventListenerWhenChainsIsNotEmptyAndBasicRemoveEventListenerListener() throws UnreadableWalletException {
        /* Branches:
         * (chains != null) : true
         * (for-each(chains)) : true
         * (basic.removeEventListener(listener)) : true
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "<KeyCrypter>");
        DeterministicKeyChain deterministicKeyChain2Mock = mock(DeterministicKeyChain.class, "<List<DeterministicKeyChain>>");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "<KeyChainFactory>");
        KeyChainEventListener keyChainEventListenerMock = mock(KeyChainEventListener.class, "<KeyChainEventListener>");
        Network networkMock = mock(Network.class, "<Network>");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            doReturn(false).when(deterministicKeyChain2Mock).removeEventListener(keyChainEventListenerMock);
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            boolean result = target.removeEventListener(keyChainEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(deterministicKeyChain2Mock).removeEventListener(keyChainEventListenerMock);
        }
    }

    //Sapient generated method id: ${efe04693-04b0-3b6a-982a-6f9900ccaa8e}
    @Ignore()
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
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            doReturn(false).when(deterministicKeyChain2Mock).removeEventListener(keyChainEventListenerMock);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            boolean result = target.removeEventListener(keyChainEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(deterministicKeyChain2Mock).removeEventListener(keyChainEventListenerMock);
        }
    }

    //Sapient generated method id: ${9a3dcec5-b745-3460-bf55-204c7709e4a4}
    @Ignore()
    @Test()
    public void addCurrentKeyChangeEventListenerTest() throws UnreadableWalletException {
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "<mock KeyCrypter object>");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "BasicKeyChainFactory");
        Network networkMock = mock(Network.class, "MainNetParams");
        CurrentKeyChangeEventListener currentKeyChangeEventListenerMock = mock(CurrentKeyChangeEventListener.class, "<mock CurrentKeyChangeEventListener object>");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doNothing().when(target).addCurrentKeyChangeEventListener(currentKeyChangeEventListenerMock, (Executor) null);
            //Act Statement(s)
            target.addCurrentKeyChangeEventListener(currentKeyChangeEventListenerMock);
            //Assert statement(s)
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).addCurrentKeyChangeEventListener(currentKeyChangeEventListenerMock, (Executor) null);
        }
    }

    //Sapient generated method id: ${ba857baf-a904-38fa-9ed0-0c7fffc046c9}
    @Ignore()
    @Test()
    public void addCurrentKeyChangeEventListener1Test() throws UnreadableWalletException {
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "int");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "BasicKeyChain");
        Network networkMock = mock(Network.class, "DeterministicKey");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //TODO: Needs initialization with real value
            Executor executor = null;
            //Act Statement(s)
            target.addCurrentKeyChangeEventListener(currentKeyChangeEventListenerMock, executor);
            //Assert statement(s)
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${8cac5caf-b879-347e-8b89-a1629fa2b1fc}
    @Ignore()
    @Test()
    public void removeCurrentKeyChangeEventListenerWhenListenerRegistrationRemoveFromListListenerCurrentKeyChangeListeners() throws UnreadableWalletException {
        /* Branches:
         * (ListenerRegistration.removeFromList(listener, currentKeyChangeListeners)) : true
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "<KeyCrypter object>");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "<KeyChainFactory object>");
        Network networkMock = mock(Network.class, "<Network object>");
        CurrentKeyChangeEventListener currentKeyChangeEventListenerMock = mock(CurrentKeyChangeEventListener.class, "<CurrentKeyChangeEventListener object>");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
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
        }
    }

    //Sapient generated method id: ${e8cc1833-c7a2-32bb-876e-486738aa8251}
    @Ignore()
    @Test()
    public void removeCurrentKeyChangeEventListenerWhenListenerRegistrationNotRemoveFromListListenerCurrentKeyChangeListeners() throws UnreadableWalletException {
        /* Branches:
         * (ListenerRegistration.removeFromList(listener, currentKeyChangeListeners)) : false
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "KeyCrypter");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "KeyChainFactory");
        Network networkMock = mock(Network.class, "Network");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            boolean result = target.removeCurrentKeyChangeEventListener(currentKeyChangeEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${869e1eb9-de5f-3680-bd6b-36bfdd4e9090}
    @Ignore()
    @Test()
    public void serializeToProtobufWhenChainsIsNotNull() throws UnreadableWalletException {
        /* Branches:
         * (basic != null) : true
         * (chains != null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basic
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            doReturn(protosKeyList).when(deterministicKeyChain2Mock).serializeToProtobuf();
            List<Protos.Key> protosKeyList2 = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList2, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            List<Protos.Key> result = target.serializeToProtobuf();
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(deterministicKeyChain2Mock).serializeToProtobuf();
        }
    }

    //Sapient generated method id: ${812ffedc-d721-3207-ad73-0c6bbed486bd}
    @Ignore()
    @Test()
    public void serializeToProtobufWhenChainsIsNull() throws UnreadableWalletException {
        /* Branches:
         * (basic != null) : true
         * (chains != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: basic
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Protos.Key keyMock = mock(Protos.Key.class);
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>(Arrays.asList(keyMock));
            doReturn(protosKeyList).when(deterministicKeyChain2Mock).serializeToProtobuf();
            List<Protos.Key> protosKeyList2 = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList2, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            List<Protos.Key> result = target.serializeToProtobuf();
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(deterministicKeyChain2Mock).serializeToProtobuf();
        }
    }

    //Sapient generated method id: ${eabd3d02-7d16-38fc-868d-6e8863269a78}
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

    //Sapient generated method id: ${83533679-99fb-3a13-9d65-c5b7e6322cf6}
    @Ignore()
    @Test()
    public void fromProtobufUnencrypted1WhenDefaultBranch() throws UnreadableWalletException {
        /* Branches:
         * (!chains.isEmpty()) : false
         * (branch expression (line 283)) : false  #  inside <init> method
         * (branch expression (line 284)) : false  #  inside <init> method
         * (branch expression (line 300)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufUnencrypted(anyList())).thenReturn(basicKeyChainMock);
            //TODO: Needs to return real value
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

    //Sapient generated method id: ${161454a7-b0e1-3582-8cf3-2f6b41fe6e6e}
    @Test()
    public void fromProtobufUnencrypted1WhenDefaultBranchAndDefaultBranchAndDefaultBranchAndDefaultBranch() throws UnreadableWalletException {
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

    //Sapient generated method id: ${fdf441cb-65fe-3b5c-b115-cf990a61aa5e}
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

    //Sapient generated method id: ${298b4cd7-a74f-37bc-9b50-62815f325433}
    @Ignore()
    @Test()
    public void fromProtobufEncrypted1WhenDefaultBranch() throws UnreadableWalletException {
        /* Branches:
         * (!chains.isEmpty()) : false
         * (branch expression (line 283)) : false  #  inside <init> method
         * (branch expression (line 284)) : false  #  inside <init> method
         * (branch expression (line 300)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(basicKeyChainMock);
            //TODO: Needs to return real value
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

    //Sapient generated method id: ${f6bd2f9a-5bc3-360e-b082-a19aa564d48d}
    @Test()
    public void fromProtobufEncrypted1WhenDefaultBranchAndDefaultBranchAndDefaultBranchAndDefaultBranch() throws UnreadableWalletException {
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
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "KeyCrypter");
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
            //Act Statement(s)
            KeyChainGroup result = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
        }
    }

    //Sapient generated method id: ${c140f1f5-fd4d-3295-becf-a9919083d28d}
    @Ignore()
    @Test()
    public void upgradeToDeterministicWhenIsDeterministicUpgradeRequiredNotPreferredScriptTypeKeyRotationTime() throws DeterministicUpgradeRequiresPassword, UnreadableWalletException {
        /* Branches:
         * (!isDeterministicUpgradeRequired(preferredScriptType, keyRotationTime)) : true
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "null");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "null");
        Network networkMock = mock(Network.class, "null");
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class, "null");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(false).when(target).supportsDeterministicChains();
            doReturn(false).when(target).isDeterministicUpgradeRequired(eq(ScriptType.P2PKH), (Instant) any());
            Instant instant = Instant.now();
            byte[] byteArray = new byte[]{};
            AesKey aesKey = new AesKey(byteArray);
            //Act Statement(s)
            target.upgradeToDeterministic(ScriptType.P2PKH, keyChainGroupStructureMock, instant, aesKey);
            //Assert statement(s)
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
            verify(target).supportsDeterministicChains();
            verify(target).isDeterministicUpgradeRequired(eq(ScriptType.P2PKH), (Instant) any());
        }
    }

    //Sapient generated method id: ${7da88ae5-af87-39d0-bfe4-67ff8a6b8c52}
    @Ignore()
    @Test()
    public void upgradeToDeterministicWhenAesKeyIsNullThrowsDeterministicUpgradeRequiresPassword() throws DeterministicUpgradeRequiresPassword, UnreadableWalletException {
        /* Branches:
         * (!isDeterministicUpgradeRequired(preferredScriptType, keyRotationTime)) : false
         * (preferredScriptType == ScriptType.P2WPKH) : true
         * (getActiveKeyChain(ScriptType.P2WPKH, keyRotationTime) == null) : true
         * (seedWasEncrypted) : true
         * (aesKey == null) : true
         */
        //Arrange Statement(s)
        KeyChainGroupStructure structureMock = mock(KeyChainGroupStructure.class, "KeyChainGroupStructure");
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "KeyCrypter");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "KeyChainFactory");
        Network networkMock = mock(Network.class, "Network");
        DeterministicSeed deterministicSeedMock = mock(DeterministicSeed.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            doReturn(null).when(structureMock).accountPathFor(ScriptType.P2WPKH, BitcoinNetwork.MAINNET);
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(false).when(target).supportsDeterministicChains();
            doReturn(true).when(target).isDeterministicUpgradeRequired(eq(ScriptType.P2WPKH), (Instant) any());
            doReturn(null).when(target).getActiveKeyChain(eq(ScriptType.P2WPKH), (Instant) any());
            DeterministicKeyChain deterministicKeyChain2 = DeterministicKeyChain.builder().seed(deterministicSeedMock).build();
            doReturn(deterministicKeyChain2).when(target).getActiveKeyChain(eq(ScriptType.P2PKH), (Instant) any());
            doReturn(false).when(deterministicSeedMock).isEncrypted();
            DeterministicKeyChain deterministicKeyChain3 = DeterministicKeyChain.builder().seed(deterministicSeedMock).outputScriptType(ScriptType.P2WPKH).accountPath((HDPath) null).build();
            doNothing().when(target).addAndActivateHDChain(deterministicKeyChain3);
            Instant instant = Instant.now();
            AesKey aesKey = null;
            //Act Statement(s)
            target.upgradeToDeterministic(ScriptType.P2WPKH, structureMock, instant, aesKey);
            //Assert statement(s)
            verify(structureMock).accountPathFor(ScriptType.P2WPKH, BitcoinNetwork.MAINNET);
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
            verify(target).supportsDeterministicChains();
            verify(target).isDeterministicUpgradeRequired(eq(ScriptType.P2WPKH), (Instant) any());
            verify(target).getActiveKeyChain(eq(ScriptType.P2WPKH), (Instant) any());
            verify(target).getActiveKeyChain(eq(ScriptType.P2PKH), (Instant) any());
            verify(deterministicSeedMock).isEncrypted();
            verify(target).addAndActivateHDChain(deterministicKeyChain3);
        }
    }

    //Sapient generated method id: ${2ee5febb-186a-3cb7-ad8d-4898e74e2a25}
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
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "<valid KeyCrypter object>");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "<valid KeyChainFactory object>");
        Network networkMock = mock(Network.class, "<valid Network object>");
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class, "<valid KeyChainGroupStructure object>");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(false).when(target).supportsDeterministicChains();
            doReturn(true).when(target).isDeterministicUpgradeRequired(eq(ScriptType.P2PKH), (Instant) any());
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

    //Sapient generated method id: ${f2b86e6d-0e22-333a-82db-1c9f10b03978}
    @Ignore()
    @Test()
    public void upgradeToDeterministic1WhenKeyRotationTimeSecsGreaterThan0() throws DeterministicUpgradeRequiresPassword, UnreadableWalletException {
        /* Branches:
         * (keyRotationTimeSecs > 0) : true
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "HDPath");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "BasicKeyChain");
        Network networkMock = mock(Network.class, "DeterministicKey");
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class, "KeyChainGroupStructure");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            byte[] byteArray = new byte[]{};
            AesKey aesKey = new AesKey(byteArray);
            doNothing().when(target).upgradeToDeterministic(eq(ScriptType.P2PKH), eq(keyChainGroupStructureMock), (Instant) any(), eq(aesKey));
            //Act Statement(s)
            target.upgradeToDeterministic(ScriptType.P2PKH, keyChainGroupStructureMock, 1L, aesKey);
            //Assert statement(s)
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).upgradeToDeterministic(eq(ScriptType.P2PKH), eq(keyChainGroupStructureMock), (Instant) any(), eq(aesKey));
        }
    }

    //Sapient generated method id: ${4dadb3cc-fde6-371c-b630-50667d54d0e7}
    @Test()
    public void upgradeToDeterministic1WhenKeyRotationTimeSecsNotGreaterThan0() throws DeterministicUpgradeRequiresPassword, UnreadableWalletException {
        /* Branches:
         * (keyRotationTimeSecs > 0) : false
         */
        //Arrange Statement(s)
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class, "M/44H/0H/0H");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            byte[] byteArray = new byte[]{};
            AesKey aesKey = new AesKey(byteArray);
            doNothing().when(target).upgradeToDeterministic(ScriptType.P2PKH, keyChainGroupStructureMock, (Instant) null, aesKey);
            //Act Statement(s)
            target.upgradeToDeterministic(ScriptType.P2PKH, keyChainGroupStructureMock, -1L, aesKey);
            //Assert statement(s)
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).upgradeToDeterministic(ScriptType.P2PKH, keyChainGroupStructureMock, (Instant) null, aesKey);
        }
    }

    //Sapient generated method id: ${1aec66ef-617f-3def-92bf-9d31fa70becd}
    @Test()
    public void isDeterministicUpgradeRequiredWhenSupportsDeterministicChainsNot() throws UnreadableWalletException {
        /* Branches:
         * (!supportsDeterministicChains()) : true
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "Scrypt");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "BasicKeyChainFactory");
        Network networkMock = mock(Network.class, "MAINNET");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
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

    //Sapient generated method id: ${b44298f4-ab17-3541-8961-f2a45bc744c6}
    @Test()
    public void isDeterministicUpgradeRequiredWhenGetActiveKeyChainPreferredScriptTypeKeyRotationTimeIsNull() throws UnreadableWalletException {
        /* Branches:
         * (!supportsDeterministicChains()) : false
         * (getActiveKeyChain(preferredScriptType, keyRotationTime) == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
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
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).supportsDeterministicChains();
            verify(target).getActiveKeyChain(eq(ScriptType.P2PKH), (Instant) any());
        }
    }

    //Sapient generated method id: ${c4a03576-44ea-3099-a9e2-3f1a01957bfb}
    @Ignore()
    @Test()
    public void isDeterministicUpgradeRequiredWhenGetActiveKeyChainPreferredScriptTypeKeyRotationTimeIsNotNull() throws UnreadableWalletException {
        /* Branches:
         * (!supportsDeterministicChains()) : false
         * (getActiveKeyChain(preferredScriptType, keyRotationTime) == null) : false
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "AES");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "{}");
        Network networkMock = mock(Network.class, "MAINNET");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
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

    //Sapient generated method id: ${8af15477-3bab-3af5-8017-59042427cd41}
    @Ignore()
    @Test()
    public void isDeterministicUpgradeRequired1WhenIsDeterministicUpgradeRequiredPreferredScriptTypeKeyRotationTime() throws UnreadableWalletException {
        /* Branches:
         * (keyRotationTimeSecs > 0) : true
         * (isDeterministicUpgradeRequired(preferredScriptType, keyRotationTime)) : true
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "null");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "null");
        Network networkMock = mock(Network.class, "null");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(true).when(target).isDeterministicUpgradeRequired(eq(ScriptType.P2PKH), (Instant) any());
            //Act Statement(s)
            boolean result = target.isDeterministicUpgradeRequired(ScriptType.P2PKH, 10L);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).isDeterministicUpgradeRequired(eq(ScriptType.P2PKH), (Instant) any());
        }
    }

    //Sapient generated method id: ${218bb8cc-51d5-314c-affb-e54663443def}
    @Ignore()
    @Test()
    public void isDeterministicUpgradeRequired1WhenKeyRotationTimeSecsNotGreaterThan0AndIsDeterministicUpgradeRequiredNotPreferredScrip() throws UnreadableWalletException {
        /* Branches:
         * (keyRotationTimeSecs > 0) : false
         * (isDeterministicUpgradeRequired(preferredScriptType, keyRotationTime)) : false
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "AES");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "HDPath");
        Network networkMock = mock(Network.class, "MAINNET");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(false).when(target).isDeterministicUpgradeRequired(ScriptType.P2PKH, (Instant) null);
            //Act Statement(s)
            boolean result = target.isDeterministicUpgradeRequired(ScriptType.P2PKH, 0L);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(target).isDeterministicUpgradeRequired(ScriptType.P2PKH, (Instant) null);
        }
    }

    //Sapient generated method id: ${0664a535-91d3-3905-8623-3090432e4b44}
    @Ignore()
    @Test()
    public void toStringWhenChainsIsNotEmpty() throws UnreadableWalletException {
        /* Branches:
         * (basic != null) : true
         * (chains != null) : true
         * (for-each(chains)) : true
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "{}");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "{}");
        Network networkMock = mock(Network.class, "{}");
        try (MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class)) {
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            byte[] byteArray = new byte[]{};
            AesKey aesKey = new AesKey(byteArray);
            doReturn("String").when(deterministicKeyChain2Mock).toString(true, true, aesKey, networkMock);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock);
            //Act Statement(s)
            String result = target.toString(true, true, aesKey);
            //Assert statement(s)
            assertThat(result, equalTo("String\n"));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(deterministicKeyChain2Mock).toString(true, true, aesKey, networkMock);
        }
    }

    //Sapient generated method id: ${8d1f030f-dc42-3180-a4da-fb08c8194b69}
    @Ignore()
    @Test()
    public void getDeterministicKeyChainsTest() throws UnreadableWalletException {
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(false).when(target).supportsDeterministicChains();
            //Act Statement(s)
            List<DeterministicKeyChain> result = target.getDeterministicKeyChains();
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
            verify(target).supportsDeterministicChains();
        }
    }

    //Sapient generated method id: ${0f2c5a70-b1bb-37b2-b323-4a86fe0b6f58}
    @Test()
    public void getCombinedKeyLookaheadEpochsWhenChainsIsNotEmpty() throws UnreadableWalletException {
        /* Branches:
         * (for-each(chains)) : true
         */
        //Arrange Statement(s)
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "KeyCrypter");
        KeyChainFactory keyChainFactoryMock = mock(KeyChainFactory.class, "KeyChainFactory");
        Network networkMock = mock(Network.class, "Network");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<DeterministicKeyChain> deterministicKeyChain = mockStatic(DeterministicKeyChain.class);
             MockedStatic<BasicKeyChain> basicKeyChain = mockStatic(BasicKeyChain.class)) {
            basicKeyChain.when(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock))).thenReturn(null);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChain2Mock);
            deterministicKeyChain.when(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock))).thenReturn(deterministicKeyChainList);
            doReturn(0).when(deterministicKeyChain2Mock).getKeyLookaheadEpoch();
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Protos.Key key = Protos.Key.getDefaultInstance();
            List<Protos.Key> protosKeyList = new ArrayList<>();
            protosKeyList.add(key);
            KeyChainGroup target = spy(KeyChainGroup.fromProtobufEncrypted(networkMock, protosKeyList, keyCrypterMock, keyChainFactoryMock));
            doReturn(false).when(target).supportsDeterministicChains();
            //Act Statement(s)
            int result = target.getCombinedKeyLookaheadEpochs();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            basicKeyChain.verify(() -> BasicKeyChain.fromProtobufEncrypted(anyList(), eq(keyCrypterMock)));
            deterministicKeyChain.verify(() -> DeterministicKeyChain.fromProtobuf(anyList(), eq(keyCrypterMock), eq(keyChainFactoryMock)));
            verify(deterministicKeyChain2Mock).getKeyLookaheadEpoch();
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
            verify(target).supportsDeterministicChains();
        }
    }
}
