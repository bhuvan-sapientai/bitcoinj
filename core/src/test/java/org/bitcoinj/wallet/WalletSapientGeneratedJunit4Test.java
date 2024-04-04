package org.bitcoinj.wallet;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.mockito.InjectMocks;
import org.junit.After;
import org.junit.Test;
import org.bitcoinj.base.exceptions.AddressFormatException;

import java.io.IOException;

import org.bitcoinj.crypto.KeyCrypterException;
import org.bitcoinj.wallet.Wallet.BadWalletEncryptionKeyException;
import org.bitcoinj.core.UTXOProviderException;
import org.bitcoinj.core.VerificationException;
import org.bitcoinj.script.ScriptException;
import org.bitcoinj.core.ProtocolException;
import org.junit.Ignore;
import org.bitcoinj.core.InsufficientMoneyException;
import org.bitcoinj.wallet.Wallet.CompletionException;

import java.nio.channels.NotYetConnectedException;

import org.bitcoinj.base.Network;
import org.bitcoinj.core.Context;
import org.bitcoinj.base.internal.PlatformUtils;

import java.io.ByteArrayInputStream;

import org.bitcoinj.core.Block;
import org.bitcoinj.crypto.ECKey;
import org.mockito.MockitoAnnotations;
import org.bitcoinj.core.TransactionConfidence;

import java.time.Duration;

import org.bitcoinj.core.TransactionBroadcaster;
import org.bitcoinj.core.FilteredBlock;

import java.util.HashMap;
import java.io.InputStream;

import org.bitcoinj.script.Script;
import org.bitcoinj.core.Peer;
import org.bitcoinj.wallet.listeners.KeyChainEventListener;
import org.bitcoinj.base.internal.FutureUtils;
import org.mockito.stubbing.Answer;
import org.bitcoinj.utils.ListenerRegistration;
import org.bitcoinj.signers.LocalTransactionSigner;
import org.bitcoinj.base.Sha256Hash;

import java.io.FileOutputStream;
import java.util.stream.Collector;
import java.util.concurrent.CompletableFuture;

import org.bitcoinj.core.listeners.TransactionConfidenceEventListener;
import org.bitcoinj.crypto.HDKeyDerivation;
import org.bitcoinj.core.AbstractBlockChain;
import org.bitcoinj.wallet.listeners.WalletCoinsReceivedEventListener;
import org.junit.rules.ExpectedException;

import java.util.List;

import org.bitcoinj.crypto.DeterministicKey;
import org.bitcoinj.protobuf.wallet.Protos;
import org.bitcoinj.core.Transaction;
import org.bitcoinj.core.TxConfidenceTable;
import org.bitcoinj.utils.ListenableCompletableFuture;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

import org.bitcoinj.core.UTXOProvider;
import org.bitcoinj.wallet.listeners.WalletChangeEventListener;
import org.bitcoinj.crypto.AesKey;
import org.bitcoinj.core.TransactionWitness;

import java.util.concurrent.Executor;
import java.nio.ByteBuffer;
import java.io.OutputStream;

import org.bitcoinj.base.internal.StreamUtils;
import org.bitcoinj.core.UTXO;
import com.google.protobuf.ByteString;

import java.util.Collection;

import org.bitcoinj.wallet.listeners.WalletReorganizeEventListener;

import java.util.concurrent.TimeUnit;

import org.bitcoinj.script.ScriptBuilder;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

import org.bitcoinj.utils.Threading;
import org.bitcoinj.core.MessageSerializer;
import org.bitcoinj.base.Base58;

import java.util.HashSet;
import java.math.BigInteger;

import org.bitcoinj.base.AddressParser;
import org.bitcoinj.base.Coin;
import org.bitcoinj.wallet.listeners.CurrentKeyChangeEventListener;
import org.bitcoinj.utils.ExchangeRate;
import org.bitcoinj.wallet.listeners.ScriptsChangeEventListener;

import java.util.ArrayList;

import org.bitcoinj.base.LegacyAddress;
import org.bitcoinj.crypto.KeyCrypter;

import java.io.FileInputStream;

import org.bitcoinj.base.Address;
import org.bitcoinj.base.internal.Preconditions;
import org.bitcoinj.core.TransactionOutPoint;
import org.bitcoinj.core.TransactionBroadcast;
import org.bitcoinj.core.BloomFilter;

import java.io.File;

import org.bitcoinj.core.StoredBlock;

import java.time.Instant;

import org.bitcoinj.base.ScriptType;
import org.bitcoinj.core.TransactionInput;
import org.bitcoinj.core.TransactionOutput;
import org.bitcoinj.script.ScriptPattern;
import org.bitcoinj.core.NetworkParameters;

import java.util.Optional;

import org.bitcoinj.crypto.DeterministicHierarchy;
import org.bitcoinj.wallet.listeners.WalletCoinsSentEventListener;
import org.bitcoinj.signers.TransactionSigner;

import java.util.EnumSet;
import java.io.FileNotFoundException;

import org.bitcoinj.base.internal.TimeUtils;

import java.util.Set;

import org.bitcoinj.crypto.ChildNumber;

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
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.core.IsInstanceOf.instanceOf;

public class WalletSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final AddressParser addressParserMock = mock(AddressParser.class, "addressParser");

    private final KeyChainGroup keyChainGroupMock = mock(KeyChainGroup.class, "keyChainGroup");

    private final NetworkParameters paramsMock = mock(NetworkParameters.class, "params");

    private final RiskAnalysis.Analyzer riskAnalyzerMock = mock(RiskAnalysis.Analyzer.class, "riskAnalyzer");

    private final Network networkMock = mock(Network.class, "mainnet");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private Wallet target;

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    @After()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${874ad150-35a1-343e-bfc9-14caa53d2c00}, hash: 1D9F2B15D0204D51F2B0781D58234A29
    @Test()
    public void createDeterministicTest() {
        //Arrange Statement(s)
        Wallet walletMock = mock(Wallet.class);
        Network networkMock2 = mock(Network.class);
        try (MockedStatic<Wallet> wallet = mockStatic(Wallet.class, CALLS_REAL_METHODS)) {
            KeyChainGroupStructure keyChainGroupStructure = KeyChainGroupStructure.BIP32;
            wallet.when(() -> Wallet.createDeterministic(networkMock2, ScriptType.P2PKH, keyChainGroupStructure)).thenReturn(walletMock);
            //Act Statement(s)
            Wallet result = Wallet.createDeterministic(networkMock2, ScriptType.P2PKH);
            //Assert statement(s)
            assertThat(result, equalTo(walletMock));
            wallet.verify(() -> Wallet.createDeterministic(networkMock2, ScriptType.P2PKH, keyChainGroupStructure), atLeast(1));
        }
    }

    //Sapient generated method id: ${74745993-f62b-3dcf-b5a8-0f2ac1d3ae65}, hash: 247198AC29EB09DC6429A0DD4D725CD5
    @Test()
    public void createDeterministic1Test() {
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        Network networkMock2 = mock(Network.class);
        Wallet walletMock = mock(Wallet.class);
        try (MockedStatic<Wallet> wallet = mockStatic(Wallet.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock2).when(paramsMock2).network();
            wallet.when(() -> Wallet.createDeterministic(networkMock2, ScriptType.P2PKH)).thenReturn(walletMock);
            //Act Statement(s)
            Wallet result = Wallet.createDeterministic(paramsMock2, ScriptType.P2PKH);
            //Assert statement(s)
            assertThat(result, equalTo(walletMock));
            verify(paramsMock2, atLeast(1)).network();
            wallet.verify(() -> Wallet.createDeterministic(networkMock2, ScriptType.P2PKH), atLeast(1));
        }
    }

    //Sapient generated method id: ${6eae7af5-1761-3e57-a8b7-32243662417e}, hash: DAF168D9636E378729ED9056ED721FE2
    @Test()
    public void createDeterministic2WhenSignerIsReady() {
        /* Branches:
         * (signer.isReady()) : true  #  inside addTransactionSigner method
         */
        //Arrange Statement(s)
        KeyChainGroup.Builder keyChainGroupBuilderMock = mock(KeyChainGroup.Builder.class);
        Network networkMock2 = mock(Network.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        KeyChainGroup.Builder keyChainGroupBuilderMock2 = mock(KeyChainGroup.Builder.class);
        KeyChainGroup keyChainGroupMock2 = mock(KeyChainGroup.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<KeyChainGroup> keyChainGroup = mockStatic(KeyChainGroup.class)) {
            keyChainGroup.when(() -> KeyChainGroup.builder(networkMock2, keyChainGroupStructureMock)).thenReturn(keyChainGroupBuilderMock);
            doReturn(keyChainGroupBuilderMock2).when(keyChainGroupBuilderMock).fromRandom(ScriptType.P2PKH);
            doReturn(keyChainGroupMock2).when(keyChainGroupBuilderMock2).build();
            networkParameters.when(() -> NetworkParameters.of(networkMock2)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock2)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock2)).thenReturn(coinSelectorMock);
            //Act Statement(s)
            Wallet result = Wallet.createDeterministic(networkMock2, ScriptType.P2PKH, keyChainGroupStructureMock);
            //Assert statement(s)
            //TODO: Please implement equals method in Wallet for verification of the entire object or you need to adjust respective assertion statements
            assertThat(result, is(notNullValue()));
            keyChainGroup.verify(() -> KeyChainGroup.builder(networkMock2, keyChainGroupStructureMock), atLeast(1));
            verify(keyChainGroupBuilderMock).fromRandom(ScriptType.P2PKH);
            verify(keyChainGroupBuilderMock2).build();
            networkParameters.verify(() -> NetworkParameters.of(networkMock2), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock2), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${fcae7d4b-69c3-37ec-bf98-41774bb5b049}, hash: 11D1181A3BC52F99253C3A6814F0F013
    @Test()
    public void createDeterministic3WhenSignerIsReady() {
        /* Branches:
         * (signer.isReady()) : true  #  inside addTransactionSigner method
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        Network networkMock2 = mock(Network.class);
        Network networkMock3 = mock(Network.class);
        KeyChainGroup.Builder keyChainGroupBuilderMock = mock(KeyChainGroup.Builder.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        KeyChainGroup.Builder keyChainGroupBuilderMock2 = mock(KeyChainGroup.Builder.class);
        KeyChainGroup keyChainGroupMock2 = mock(KeyChainGroup.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<KeyChainGroup> keyChainGroup = mockStatic(KeyChainGroup.class)) {
            doReturn(networkMock2, networkMock3).when(paramsMock2).network();
            keyChainGroup.when(() -> KeyChainGroup.builder(networkMock3, keyChainGroupStructureMock)).thenReturn(keyChainGroupBuilderMock);
            doReturn(keyChainGroupBuilderMock2).when(keyChainGroupBuilderMock).fromRandom(ScriptType.P2PKH);
            doReturn(keyChainGroupMock2).when(keyChainGroupBuilderMock2).build();
            networkParameters.when(() -> NetworkParameters.of(networkMock2)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock2)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock2)).thenReturn(coinSelectorMock);
            //Act Statement(s)
            Wallet result = Wallet.createDeterministic(paramsMock2, ScriptType.P2PKH, keyChainGroupStructureMock);
            //Assert statement(s)
            //TODO: Please implement equals method in Wallet for verification of the entire object or you need to adjust respective assertion statements
            assertThat(result, is(notNullValue()));
            verify(paramsMock2, times(2)).network();
            keyChainGroup.verify(() -> KeyChainGroup.builder(networkMock3, keyChainGroupStructureMock), atLeast(1));
            verify(keyChainGroupBuilderMock).fromRandom(ScriptType.P2PKH);
            verify(keyChainGroupBuilderMock2).build();
            networkParameters.verify(() -> NetworkParameters.of(networkMock2), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock2), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${70fb3574-2088-3500-865e-0e49a5caeec1}, hash: E4FF544E8E2B900B5D3FFE2211A4DEFF
    @Test()
    public void createBasicWhenSignerIsReady() {
        /* Branches:
         * (signer.isReady()) : true  #  inside addTransactionSigner method
         */
        //Arrange Statement(s)
        KeyChainGroup keyChainGroupMock2 = mock(KeyChainGroup.class);
        Network networkMock2 = mock(Network.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<KeyChainGroup> keyChainGroup = mockStatic(KeyChainGroup.class)) {
            keyChainGroup.when(() -> KeyChainGroup.createBasic(networkMock2)).thenReturn(keyChainGroupMock2);
            networkParameters.when(() -> NetworkParameters.of(networkMock2)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock2)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock2)).thenReturn(coinSelectorMock);
            //Act Statement(s)
            Wallet result = Wallet.createBasic(networkMock2);
            //Assert statement(s)
            //TODO: Please implement equals method in Wallet for verification of the entire object or you need to adjust respective assertion statements
            assertThat(result, is(notNullValue()));
            keyChainGroup.verify(() -> KeyChainGroup.createBasic(networkMock2), atLeast(1));
            networkParameters.verify(() -> NetworkParameters.of(networkMock2), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock2), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${21cdcafe-93b7-3d27-bab3-f06179abbdbf}, hash: 94D493C0A782DEAF3121E3B35A44F980
    @Test()
    public void createBasic1Test() {
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        Network networkMock2 = mock(Network.class);
        Wallet walletMock = mock(Wallet.class);
        try (MockedStatic<Wallet> wallet = mockStatic(Wallet.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock2).when(paramsMock2).network();
            wallet.when(() -> Wallet.createBasic(networkMock2)).thenReturn(walletMock);
            //Act Statement(s)
            Wallet result = Wallet.createBasic(paramsMock2);
            //Assert statement(s)
            assertThat(result, equalTo(walletMock));
            verify(paramsMock2, atLeast(1)).network();
            wallet.verify(() -> Wallet.createBasic(networkMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${610f6d7c-ee64-35be-be4a-9bccd359d519}, hash: EC2A3A82BA08BF4AC4151C63B7603D4F
    @Test()
    public void fromSeedTest() {
        //Arrange Statement(s)
        Wallet walletMock = mock(Wallet.class);
        Network networkMock2 = mock(Network.class);
        DeterministicSeed deterministicSeedMock = mock(DeterministicSeed.class);
        try (MockedStatic<Wallet> wallet = mockStatic(Wallet.class, CALLS_REAL_METHODS)) {
            KeyChainGroupStructure keyChainGroupStructure = KeyChainGroupStructure.BIP32;
            wallet.when(() -> Wallet.fromSeed(networkMock2, deterministicSeedMock, ScriptType.P2PKH, keyChainGroupStructure)).thenReturn(walletMock);
            //Act Statement(s)
            Wallet result = Wallet.fromSeed(networkMock2, deterministicSeedMock, ScriptType.P2PKH);
            //Assert statement(s)
            assertThat(result, equalTo(walletMock));
            wallet.verify(() -> Wallet.fromSeed(networkMock2, deterministicSeedMock, ScriptType.P2PKH, keyChainGroupStructure), atLeast(1));
        }
    }

    //Sapient generated method id: ${d378e10c-8293-3b0b-acd9-c28c5ddba694}, hash: 8C0754EA2FDAA0EF6FFBF85A9539063E
    @Test()
    public void fromSeed1Test() {
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        Network networkMock2 = mock(Network.class);
        Wallet walletMock = mock(Wallet.class);
        DeterministicSeed deterministicSeedMock = mock(DeterministicSeed.class);
        try (MockedStatic<Wallet> wallet = mockStatic(Wallet.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock2).when(paramsMock2).network();
            wallet.when(() -> Wallet.fromSeed(networkMock2, deterministicSeedMock, ScriptType.P2PKH)).thenReturn(walletMock);
            //Act Statement(s)
            Wallet result = Wallet.fromSeed(paramsMock2, deterministicSeedMock, ScriptType.P2PKH);
            //Assert statement(s)
            assertThat(result, equalTo(walletMock));
            verify(paramsMock2, atLeast(1)).network();
            wallet.verify(() -> Wallet.fromSeed(networkMock2, deterministicSeedMock, ScriptType.P2PKH), atLeast(1));
        }
    }

    //Sapient generated method id: ${b6edd48e-c913-356f-93b0-c1b9d87955b3}, hash: C852B1DBBC8CE652A3AFCDAD1B20EA57
    @Test()
    public void fromSeed2WhenSignerIsReady() {
        /* Branches:
         * (signer.isReady()) : true  #  inside addTransactionSigner method
         */
        //Arrange Statement(s)
        KeyChainGroup.Builder keyChainGroupBuilderMock = mock(KeyChainGroup.Builder.class);
        Network networkMock2 = mock(Network.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        KeyChainGroup.Builder keyChainGroupBuilderMock2 = mock(KeyChainGroup.Builder.class);
        DeterministicSeed deterministicSeedMock = mock(DeterministicSeed.class);
        KeyChainGroup keyChainGroupMock2 = mock(KeyChainGroup.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<KeyChainGroup> keyChainGroup = mockStatic(KeyChainGroup.class)) {
            keyChainGroup.when(() -> KeyChainGroup.builder(networkMock2, keyChainGroupStructureMock)).thenReturn(keyChainGroupBuilderMock);
            doReturn(keyChainGroupBuilderMock2).when(keyChainGroupBuilderMock).fromSeed(deterministicSeedMock, ScriptType.P2PKH);
            doReturn(keyChainGroupMock2).when(keyChainGroupBuilderMock2).build();
            networkParameters.when(() -> NetworkParameters.of(networkMock2)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock2)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock2)).thenReturn(coinSelectorMock);
            //Act Statement(s)
            Wallet result = Wallet.fromSeed(networkMock2, deterministicSeedMock, ScriptType.P2PKH, keyChainGroupStructureMock);
            //Assert statement(s)
            //TODO: Please implement equals method in Wallet for verification of the entire object or you need to adjust respective assertion statements
            assertThat(result, is(notNullValue()));
            keyChainGroup.verify(() -> KeyChainGroup.builder(networkMock2, keyChainGroupStructureMock), atLeast(1));
            verify(keyChainGroupBuilderMock).fromSeed(deterministicSeedMock, ScriptType.P2PKH);
            verify(keyChainGroupBuilderMock2).build();
            networkParameters.verify(() -> NetworkParameters.of(networkMock2), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock2), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${925c6b8e-9252-3704-9afe-cfd404dcb1cc}, hash: 6B0E691848687BB341564CC378557079
    @Test()
    public void fromSeed3Test() {
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        Network networkMock2 = mock(Network.class);
        Wallet walletMock = mock(Wallet.class);
        DeterministicSeed deterministicSeedMock = mock(DeterministicSeed.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<Wallet> wallet = mockStatic(Wallet.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock2).when(paramsMock2).network();
            wallet.when(() -> Wallet.fromSeed(networkMock2, deterministicSeedMock, ScriptType.P2PKH, keyChainGroupStructureMock)).thenReturn(walletMock);
            //Act Statement(s)
            Wallet result = Wallet.fromSeed(paramsMock2, deterministicSeedMock, ScriptType.P2PKH, keyChainGroupStructureMock);
            //Assert statement(s)
            assertThat(result, equalTo(walletMock));
            verify(paramsMock2, atLeast(1)).network();
            wallet.verify(() -> Wallet.fromSeed(networkMock2, deterministicSeedMock, ScriptType.P2PKH, keyChainGroupStructureMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${112a88bb-dec1-3ec3-93ea-e39c6083ee08}, hash: BF7ED4B8BEAC7C6D28A8436BAECAC371
    @Ignore()
    @Test()
    public void fromSeed4WhenSignerIsReady() {
        /* Branches:
         * (signer.isReady()) : true  #  inside addTransactionSigner method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        KeyChainGroup.Builder keyChainGroupBuilderMock = mock(KeyChainGroup.Builder.class);
        Network networkMock2 = mock(Network.class);
        KeyChainGroup.Builder keyChainGroupBuilderMock2 = mock(KeyChainGroup.Builder.class);
        DeterministicKeyChain deterministicKeyChainMock = mock(DeterministicKeyChain.class);
        KeyChainGroup keyChainGroupMock2 = mock(KeyChainGroup.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        DeterministicSeed deterministicSeedMock = mock(DeterministicSeed.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<KeyChainGroup> keyChainGroup = mockStatic(KeyChainGroup.class)) {
            keyChainGroup.when(() -> KeyChainGroup.builder(networkMock2)).thenReturn(keyChainGroupBuilderMock);
            doReturn(keyChainGroupBuilderMock2).when(keyChainGroupBuilderMock).addChain(deterministicKeyChainMock);
            doReturn(keyChainGroupMock2).when(keyChainGroupBuilderMock2).build();
            networkParameters.when(() -> NetworkParameters.of(networkMock2)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock2)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock2)).thenReturn(coinSelectorMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            //Act Statement(s)
            Wallet result = Wallet.fromSeed(networkMock2, deterministicSeedMock, ScriptType.P2PKH, childNumberList);
            //Assert statement(s)
            //TODO: Please implement equals method in Wallet for verification of the entire object or you need to adjust respective assertion statements
            assertThat(result, is(notNullValue()));
            keyChainGroup.verify(() -> KeyChainGroup.builder(networkMock2), atLeast(1));
            verify(keyChainGroupBuilderMock).addChain(deterministicKeyChainMock);
            verify(keyChainGroupBuilderMock2).build();
            networkParameters.verify(() -> NetworkParameters.of(networkMock2), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock2), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${e09e88b8-077d-363d-811f-0cff3f01fd8c}, hash: 3D3DB4A54A87B8F280CAC6579B5066F3
    @Test()
    public void fromSeed5Test() {
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        Network networkMock2 = mock(Network.class);
        Wallet walletMock = mock(Wallet.class);
        DeterministicSeed deterministicSeedMock = mock(DeterministicSeed.class);
        try (MockedStatic<Wallet> wallet = mockStatic(Wallet.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock2).when(paramsMock2).network();
            wallet.when(() -> Wallet.fromSeed(eq(networkMock2), eq(deterministicSeedMock), eq(ScriptType.P2PKH), anyList())).thenReturn(walletMock);
            List<ChildNumber> childNumberList = new ArrayList<>();
            //Act Statement(s)
            Wallet result = Wallet.fromSeed(paramsMock2, deterministicSeedMock, ScriptType.P2PKH, childNumberList);
            //Assert statement(s)
            assertThat(result, equalTo(walletMock));
            verify(paramsMock2, atLeast(1)).network();
            wallet.verify(() -> Wallet.fromSeed(eq(networkMock2), eq(deterministicSeedMock), eq(ScriptType.P2PKH), anyList()), atLeast(1));
        }
    }

    //Sapient generated method id: ${815f6d13-a193-345b-95c1-2f8718b65ce5}, hash: 16942AAFDB2C3302E9B09579501799DF
    @Ignore()
    @Test()
    public void fromWatchingKeyWhenSignerIsReady() {
        /* Branches:
         * (signer.isReady()) : true  #  inside addTransactionSigner method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        KeyChainGroup.Builder keyChainGroupBuilderMock = mock(KeyChainGroup.Builder.class);
        Network networkMock2 = mock(Network.class);
        KeyChainGroup.Builder keyChainGroupBuilderMock2 = mock(KeyChainGroup.Builder.class);
        DeterministicKeyChain deterministicKeyChainMock = mock(DeterministicKeyChain.class);
        KeyChainGroup keyChainGroupMock2 = mock(KeyChainGroup.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<KeyChainGroup> keyChainGroup = mockStatic(KeyChainGroup.class)) {
            keyChainGroup.when(() -> KeyChainGroup.builder(networkMock2)).thenReturn(keyChainGroupBuilderMock);
            doReturn(keyChainGroupBuilderMock2).when(keyChainGroupBuilderMock).addChain(deterministicKeyChainMock);
            doReturn(keyChainGroupMock2).when(keyChainGroupBuilderMock2).build();
            networkParameters.when(() -> NetworkParameters.of(networkMock2)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock2)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock2)).thenReturn(coinSelectorMock);
            //Act Statement(s)
            Wallet result = Wallet.fromWatchingKey(networkMock2, deterministicKeyMock, ScriptType.P2PKH);
            //Assert statement(s)
            //TODO: Please implement equals method in Wallet for verification of the entire object or you need to adjust respective assertion statements
            assertThat(result, is(notNullValue()));
            keyChainGroup.verify(() -> KeyChainGroup.builder(networkMock2), atLeast(1));
            verify(keyChainGroupBuilderMock).addChain(deterministicKeyChainMock);
            verify(keyChainGroupBuilderMock2).build();
            networkParameters.verify(() -> NetworkParameters.of(networkMock2), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock2), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${70b43874-fc6b-3a35-bc82-eebd5b750fb3}, hash: 1B22C02B7A161CE6601519339C16E85D
    @Test()
    public void fromWatchingKey1Test() {
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        Network networkMock2 = mock(Network.class);
        Wallet walletMock = mock(Wallet.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        try (MockedStatic<Wallet> wallet = mockStatic(Wallet.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock2).when(paramsMock2).network();
            wallet.when(() -> Wallet.fromWatchingKey(networkMock2, deterministicKeyMock, ScriptType.P2PKH)).thenReturn(walletMock);
            //Act Statement(s)
            Wallet result = Wallet.fromWatchingKey(paramsMock2, deterministicKeyMock, ScriptType.P2PKH);
            //Assert statement(s)
            assertThat(result, equalTo(walletMock));
            verify(paramsMock2, atLeast(1)).network();
            wallet.verify(() -> Wallet.fromWatchingKey(networkMock2, deterministicKeyMock, ScriptType.P2PKH), atLeast(1));
        }
    }

    //Sapient generated method id: ${f458f2bc-3675-3ec9-801e-5f0c1ec1327a}, hash: 6EB1D54AC3DB7452712AF18CF18C2F39
    @Ignore()
    @Test()
    public void fromWatchingKeyB58WhenHeaderEqualsParamsGetBip32HeaderP2PKHpriv() {
        /* Branches:
         * (header == params.getBip32HeaderP2PKHpub()) : false  #  inside outputScriptTypeFromB58 method
         * (header == params.getBip32HeaderP2PKHpriv()) : true  #  inside outputScriptTypeFromB58 method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: object of type ByteBuffer - Method: getInt
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        Network networkMock2 = mock(Network.class, "main");
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        Wallet walletMock = mock(Wallet.class);
        try (MockedStatic<Wallet> wallet = mockStatic(Wallet.class, CALLS_REAL_METHODS);
             MockedStatic<Base58> base58 = mockStatic(Base58.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<DeterministicKey> deterministicKey = mockStatic(DeterministicKey.class)) {
            deterministicKey.when(() -> DeterministicKey.deserializeB58(null, "L3JvT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3Jn", networkMock2)).thenReturn(deterministicKeyMock);
            doNothing().when(deterministicKeyMock).setCreationTime((Instant) any());
            networkParameters.when(() -> NetworkParameters.of(networkMock2)).thenReturn(networkParametersMock);
            doReturn(76067358).when(networkParametersMock).getBip32HeaderP2PKHpub();
            doReturn(76066276).when(networkParametersMock).getBip32HeaderP2PKHpriv();
            byte[] byteArray = new byte[]{};
            base58.when(() -> Base58.decodeChecked("L3JvT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3Jn")).thenReturn(byteArray);
            wallet.when(() -> Wallet.fromWatchingKey(networkMock2, deterministicKeyMock, ScriptType.P2PKH)).thenReturn(walletMock);
            Instant instant = Instant.now();
            //Act Statement(s)
            Wallet result = Wallet.fromWatchingKeyB58(networkMock2, "L3JvT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3Jn", instant);
            //Assert statement(s)
            assertThat(result, equalTo(walletMock));
            deterministicKey.verify(() -> DeterministicKey.deserializeB58(null, "L3JvT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3Jn", networkMock2), atLeast(1));
            verify(deterministicKeyMock, atLeast(1)).setCreationTime((Instant) any());
            networkParameters.verify(() -> NetworkParameters.of(networkMock2), atLeast(1));
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2PKHpub();
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2PKHpriv();
            base58.verify(() -> Base58.decodeChecked("L3JvT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3JnT3Jn"), atLeast(1));
            wallet.verify(() -> Wallet.fromWatchingKey(networkMock2, deterministicKeyMock, ScriptType.P2PKH), atLeast(1));
        }
    }

    //Sapient generated method id: ${e2972c51-b4ad-3a2e-8a60-043fb8f07f50}, hash: 8600574EF15D9441C1645305AAE363E5
    @Ignore()
    @Test()
    public void fromWatchingKeyB58WhenHeaderEqualsParamsGetBip32HeaderP2WPKHpriv() {
        /* Branches:
         * (header == params.getBip32HeaderP2PKHpub()) : false  #  inside outputScriptTypeFromB58 method
         * (header == params.getBip32HeaderP2PKHpriv()) : false  #  inside outputScriptTypeFromB58 method
         * (header == params.getBip32HeaderP2WPKHpub()) : false  #  inside outputScriptTypeFromB58 method
         * (header == params.getBip32HeaderP2WPKHpriv()) : true  #  inside outputScriptTypeFromB58 method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        Network networkMock2 = mock(Network.class, "main");
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        Wallet walletMock = mock(Wallet.class);
        try (MockedStatic<Wallet> wallet = mockStatic(Wallet.class, CALLS_REAL_METHODS);
             MockedStatic<Base58> base58 = mockStatic(Base58.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<DeterministicKey> deterministicKey = mockStatic(DeterministicKey.class)) {
            deterministicKey.when(() -> DeterministicKey.deserializeB58(null, "L3JvT3h6b2Z6ZzZ6QzJ6dWZ5aGJvZkx6Zk5vZzJ4ZzJ6ZzJ6ZzJ6ZzJ6ZzJ6ZzJ6ZzJ6ZzJ6ZzJ6ZzJ6ZzJ6QWJv", networkMock2)).thenReturn(deterministicKeyMock);
            doNothing().when(deterministicKeyMock).setCreationTime((Instant) any());
            networkParameters.when(() -> NetworkParameters.of(networkMock2)).thenReturn(networkParametersMock);
            doReturn(1).when(networkParametersMock).getBip32HeaderP2PKHpub();
            doReturn(1).when(networkParametersMock).getBip32HeaderP2PKHpriv();
            doReturn(1).when(networkParametersMock).getBip32HeaderP2WPKHpub();
            doReturn(2).when(networkParametersMock).getBip32HeaderP2WPKHpriv();
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("L3JvT3h6b2Z6ZzZ6QzJ6dWZ5aGJvZkx6Zk5vZzJ4ZzJ6ZzJ6ZzJ6ZzJ6ZzJ6ZzJ6ZzJ6ZzJ6ZzJ6ZzJ6ZzJ6QWJv")).thenReturn(byteArray);
            wallet.when(() -> Wallet.fromWatchingKey(networkMock2, deterministicKeyMock, ScriptType.P2WPKH)).thenReturn(walletMock);
            Instant instant = Instant.now();
            //Act Statement(s)
            Wallet result = Wallet.fromWatchingKeyB58(networkMock2, "L3JvT3h6b2Z6ZzZ6QzJ6dWZ5aGJvZkx6Zk5vZzJ4ZzJ6ZzJ6ZzJ6ZzJ6ZzJ6ZzJ6ZzJ6ZzJ6ZzJ6ZzJ6ZzJ6QWJv", instant);
            //Assert statement(s)
            assertThat(result, equalTo(walletMock));
            deterministicKey.verify(() -> DeterministicKey.deserializeB58(null, "L3JvT3h6b2Z6ZzZ6QzJ6dWZ5aGJvZkx6Zk5vZzJ4ZzJ6ZzJ6ZzJ6ZzJ6ZzJ6ZzJ6ZzJ6ZzJ6ZzJ6ZzJ6ZzJ6QWJv", networkMock2), atLeast(1));
            verify(deterministicKeyMock, atLeast(1)).setCreationTime((Instant) any());
            networkParameters.verify(() -> NetworkParameters.of(networkMock2), atLeast(1));
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2PKHpub();
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2PKHpriv();
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2WPKHpub();
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2WPKHpriv();
            base58.verify(() -> Base58.decodeChecked("L3JvT3h6b2Z6ZzZ6QzJ6dWZ5aGJvZkx6Zk5vZzJ4ZzJ6ZzJ6ZzJ6ZzJ6ZzJ6ZzJ6ZzJ6ZzJ6ZzJ6ZzJ6ZzJ6QWJv"), atLeast(1));
            wallet.verify(() -> Wallet.fromWatchingKey(networkMock2, deterministicKeyMock, ScriptType.P2WPKH), atLeast(1));
        }
    }

    //Sapient generated method id: ${7758dfe2-c910-3e63-a08d-b96b16f1f03d}, hash: 0B2B2E91C7C7B6DC632EBCB2B62A6BD6
    @Ignore()
    @Test()
    public void fromWatchingKeyB58WhenHeaderNotEqualsParamsGetBip32HeaderP2WPKHprivThrowsIllegalArgumentException() {
        /* Branches:
         * (header == params.getBip32HeaderP2PKHpub()) : false  #  inside outputScriptTypeFromB58 method
         * (header == params.getBip32HeaderP2PKHpriv()) : false  #  inside outputScriptTypeFromB58 method
         * (header == params.getBip32HeaderP2WPKHpub()) : false  #  inside outputScriptTypeFromB58 method
         * (header == params.getBip32HeaderP2WPKHpriv()) : false  #  inside outputScriptTypeFromB58 method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        Network networkMock2 = mock(Network.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<DeterministicKey> deterministicKey = mockStatic(DeterministicKey.class)) {
            deterministicKey.when(() -> DeterministicKey.deserializeB58(null, "<value>", networkMock2)).thenReturn(deterministicKeyMock);
            doNothing().when(deterministicKeyMock).setCreationTime((Instant) any());
            networkParameters.when(() -> NetworkParameters.of(networkMock2)).thenReturn(networkParametersMock);
            doReturn(1).when(networkParametersMock).getBip32HeaderP2PKHpub();
            doReturn(1).when(networkParametersMock).getBip32HeaderP2PKHpriv();
            doReturn(1).when(networkParametersMock).getBip32HeaderP2WPKHpub();
            doReturn(1).when(networkParametersMock).getBip32HeaderP2WPKHpriv();
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("<value>")).thenReturn(byteArray);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("<val");
            thrown.expect(IllegalArgumentException.class);
            thrown.expectMessage(illegalArgumentException.getMessage());
            Instant instant = Instant.now();
            //Act Statement(s)
            Wallet.fromWatchingKeyB58(networkMock2, "<value>", instant);
            //Assert statement(s)
            deterministicKey.verify(() -> DeterministicKey.deserializeB58(null, "<value>", networkMock2), atLeast(1));
            verify(deterministicKeyMock).setCreationTime((Instant) any());
            networkParameters.verify(() -> NetworkParameters.of(networkMock2), atLeast(1));
            verify(networkParametersMock).getBip32HeaderP2PKHpub();
            verify(networkParametersMock).getBip32HeaderP2PKHpriv();
            verify(networkParametersMock).getBip32HeaderP2WPKHpub();
            verify(networkParametersMock).getBip32HeaderP2WPKHpriv();
            base58.verify(() -> Base58.decodeChecked("<value>"), atLeast(1));
        }
    }

    //Sapient generated method id: ${b2d790f1-04f3-3169-b18b-f5041a6cfcee}, hash: 10CA9980374EAF711F47A403064C29CD
    @Test()
    public void fromWatchingKeyB581Test() {
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        Network networkMock2 = mock(Network.class);
        Wallet walletMock = mock(Wallet.class);
        try (MockedStatic<Wallet> wallet = mockStatic(Wallet.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock2).when(paramsMock2).network();
            wallet.when(() -> Wallet.fromWatchingKeyB58(eq(networkMock2), eq("watchKeyB58"), (Instant) any())).thenReturn(walletMock);
            Instant instant = Instant.ofEpochSecond(1700000000);
            //Act Statement(s)
            Wallet result = Wallet.fromWatchingKeyB58(paramsMock2, "watchKeyB58", instant);
            //Assert statement(s)
            assertThat(result, equalTo(walletMock));
            verify(paramsMock2, atLeast(1)).network();
            wallet.verify(() -> Wallet.fromWatchingKeyB58(eq(networkMock2), eq("watchKeyB58"), (Instant) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${5d885627-97ca-3f94-a22d-3aeed5d9217a}, hash: AD66014CCA5F796FB0F555E5AEC1935B
    @Test()
    public void fromWatchingKeyB582Test() {
        //Arrange Statement(s)
        Wallet walletMock = mock(Wallet.class);
        Network networkMock2 = mock(Network.class);
        try (MockedStatic<Wallet> wallet = mockStatic(Wallet.class, CALLS_REAL_METHODS)) {
            Instant instant = DeterministicHierarchy.BIP32_STANDARDISATION_TIME;
            wallet.when(() -> Wallet.fromWatchingKeyB58(networkMock2, "watchKeyB58", instant)).thenReturn(walletMock);
            //Act Statement(s)
            Wallet result = Wallet.fromWatchingKeyB58(networkMock2, "watchKeyB58");
            //Assert statement(s)
            assertThat(result, equalTo(walletMock));
            wallet.verify(() -> Wallet.fromWatchingKeyB58(networkMock2, "watchKeyB58", instant), atLeast(1));
        }
    }

    //Sapient generated method id: ${5b661751-602d-3fe7-adc2-ef4f9bf8a722}, hash: BDECEADDB66369E63C01404CC3504D86
    @Test()
    public void fromWatchingKeyB583Test() {
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        Network networkMock2 = mock(Network.class);
        Wallet walletMock = mock(Wallet.class);
        try (MockedStatic<Wallet> wallet = mockStatic(Wallet.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock2).when(paramsMock2).network();
            wallet.when(() -> Wallet.fromWatchingKeyB58(networkMock2, "watchKeyB58")).thenReturn(walletMock);
            //Act Statement(s)
            Wallet result = Wallet.fromWatchingKeyB58(paramsMock2, "watchKeyB58");
            //Assert statement(s)
            assertThat(result, equalTo(walletMock));
            verify(paramsMock2, atLeast(1)).network();
            wallet.verify(() -> Wallet.fromWatchingKeyB58(networkMock2, "watchKeyB58"), atLeast(1));
        }
    }

    //Sapient generated method id: ${9726dd6a-95b4-3836-a232-9dac9b8598cb}, hash: 41B71342B875A3E09CE17F9F957B94E1
    @Test()
    public void fromWatchingKeyB584WhenCreationTimeSecondsEquals0() {
        /* Branches:
         * (creationTimeSeconds == 0) : true
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        Network networkMock2 = mock(Network.class);
        Wallet walletMock = mock(Wallet.class);
        try (MockedStatic<Wallet> wallet = mockStatic(Wallet.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock2).when(paramsMock2).network();
            wallet.when(() -> Wallet.fromWatchingKeyB58(networkMock2, "watchKeyB58")).thenReturn(walletMock);
            //Act Statement(s)
            Wallet result = Wallet.fromWatchingKeyB58(paramsMock2, "watchKeyB58", 0L);
            //Assert statement(s)
            assertThat(result, equalTo(walletMock));
            verify(paramsMock2, atLeast(1)).network();
            wallet.verify(() -> Wallet.fromWatchingKeyB58(networkMock2, "watchKeyB58"), atLeast(1));
        }
    }

    //Sapient generated method id: ${d45aec0e-2c42-3b7a-b028-38fc805b5546}, hash: 423A834F90905ED9D7EC6D09D7BAFC13
    @Test()
    public void fromWatchingKeyB584WhenCreationTimeSecondsNotEquals0() {
        /* Branches:
         * (creationTimeSeconds == 0) : false
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        Network networkMock2 = mock(Network.class);
        Wallet walletMock = mock(Wallet.class);
        try (MockedStatic<Wallet> wallet = mockStatic(Wallet.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock2).when(paramsMock2).network();
            wallet.when(() -> Wallet.fromWatchingKeyB58(eq(networkMock2), eq("watchKeyB58"), (Instant) any())).thenReturn(walletMock);
            //Act Statement(s)
            Wallet result = Wallet.fromWatchingKeyB58(paramsMock2, "watchKeyB58", 1L);
            //Assert statement(s)
            assertThat(result, equalTo(walletMock));
            verify(paramsMock2, atLeast(1)).network();
            wallet.verify(() -> Wallet.fromWatchingKeyB58(eq(networkMock2), eq("watchKeyB58"), (Instant) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${39d47d9e-f252-3144-b9fe-909c289dd942}, hash: B2DD508D84DEAA4508BFB7815176BB1B
    @Ignore()
    @Test()
    public void fromSpendingKeyWhenSignerIsReady() {
        /* Branches:
         * (signer.isReady()) : true  #  inside addTransactionSigner method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        KeyChainGroup.Builder keyChainGroupBuilderMock = mock(KeyChainGroup.Builder.class);
        Network networkMock2 = mock(Network.class);
        KeyChainGroup.Builder keyChainGroupBuilderMock2 = mock(KeyChainGroup.Builder.class);
        DeterministicKeyChain deterministicKeyChainMock = mock(DeterministicKeyChain.class);
        KeyChainGroup keyChainGroupMock2 = mock(KeyChainGroup.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<KeyChainGroup> keyChainGroup = mockStatic(KeyChainGroup.class)) {
            keyChainGroup.when(() -> KeyChainGroup.builder(networkMock2)).thenReturn(keyChainGroupBuilderMock);
            doReturn(keyChainGroupBuilderMock2).when(keyChainGroupBuilderMock).addChain(deterministicKeyChainMock);
            doReturn(keyChainGroupMock2).when(keyChainGroupBuilderMock2).build();
            networkParameters.when(() -> NetworkParameters.of(networkMock2)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock2)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock2)).thenReturn(coinSelectorMock);
            //Act Statement(s)
            Wallet result = Wallet.fromSpendingKey(networkMock2, deterministicKeyMock, ScriptType.P2PKH);
            //Assert statement(s)
            //TODO: Please implement equals method in Wallet for verification of the entire object or you need to adjust respective assertion statements
            assertThat(result, is(notNullValue()));
            keyChainGroup.verify(() -> KeyChainGroup.builder(networkMock2), atLeast(1));
            verify(keyChainGroupBuilderMock).addChain(deterministicKeyChainMock);
            verify(keyChainGroupBuilderMock2).build();
            networkParameters.verify(() -> NetworkParameters.of(networkMock2), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock2), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${7b30bb33-b3b3-333c-bd10-21ea3ccc8e05}, hash: 10B720182C12E96F9FD21BB3408E2118
    @Ignore()
    @Test()
    public void fromSpendingKey1WhenSignerIsReady() {
        /* Branches:
         * (signer.isReady()) : true  #  inside addTransactionSigner method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        Network networkMock2 = mock(Network.class);
        Network networkMock3 = mock(Network.class);
        KeyChainGroup.Builder keyChainGroupBuilderMock = mock(KeyChainGroup.Builder.class);
        KeyChainGroup.Builder keyChainGroupBuilderMock2 = mock(KeyChainGroup.Builder.class);
        DeterministicKeyChain deterministicKeyChainMock = mock(DeterministicKeyChain.class);
        KeyChainGroup keyChainGroupMock2 = mock(KeyChainGroup.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<KeyChainGroup> keyChainGroup = mockStatic(KeyChainGroup.class)) {
            doReturn(networkMock2, networkMock3).when(paramsMock2).network();
            keyChainGroup.when(() -> KeyChainGroup.builder(networkMock3)).thenReturn(keyChainGroupBuilderMock);
            doReturn(keyChainGroupBuilderMock2).when(keyChainGroupBuilderMock).addChain(deterministicKeyChainMock);
            doReturn(keyChainGroupMock2).when(keyChainGroupBuilderMock2).build();
            networkParameters.when(() -> NetworkParameters.of(networkMock2)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock2)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock2)).thenReturn(coinSelectorMock);
            //Act Statement(s)
            Wallet result = Wallet.fromSpendingKey(paramsMock2, deterministicKeyMock, ScriptType.P2PKH);
            //Assert statement(s)
            //TODO: Please implement equals method in Wallet for verification of the entire object or you need to adjust respective assertion statements
            assertThat(result, is(notNullValue()));
            verify(paramsMock2, times(2)).network();
            keyChainGroup.verify(() -> KeyChainGroup.builder(networkMock3), atLeast(1));
            verify(keyChainGroupBuilderMock).addChain(deterministicKeyChainMock);
            verify(keyChainGroupBuilderMock2).build();
            networkParameters.verify(() -> NetworkParameters.of(networkMock2), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock2), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${494da1ac-7edf-3ac0-a303-96f3da859cc2}, hash: 6986922897299E83E3CBBB21BD32B8AC
    @Ignore()
    @Test()
    public void fromSpendingKeyB58WhenHeaderEqualsParamsGetBip32HeaderP2PKHpriv() {
        /* Branches:
         * (header == params.getBip32HeaderP2PKHpub()) : false  #  inside outputScriptTypeFromB58 method
         * (header == params.getBip32HeaderP2PKHpriv()) : true  #  inside outputScriptTypeFromB58 method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        Network networkMock2 = mock(Network.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        Wallet walletMock = mock(Wallet.class);
        try (MockedStatic<Wallet> wallet = mockStatic(Wallet.class, CALLS_REAL_METHODS);
             MockedStatic<Base58> base58 = mockStatic(Base58.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<DeterministicKey> deterministicKey = mockStatic(DeterministicKey.class)) {
            deterministicKey.when(() -> DeterministicKey.deserializeB58(null, "A", networkMock2)).thenReturn(deterministicKeyMock);
            doNothing().when(deterministicKeyMock).setCreationTime((Instant) any());
            networkParameters.when(() -> NetworkParameters.of(networkMock2)).thenReturn(networkParametersMock);
            doReturn(2).when(networkParametersMock).getBip32HeaderP2PKHpub();
            doReturn(1).when(networkParametersMock).getBip32HeaderP2PKHpriv();
            byte[] byteArray = new byte[]{};
            base58.when(() -> Base58.decodeChecked("A")).thenReturn(byteArray);
            wallet.when(() -> Wallet.fromSpendingKey(networkMock2, deterministicKeyMock, ScriptType.P2PKH)).thenReturn(walletMock);
            Instant instant = Instant.ofEpochSecond(1700000000);
            //Act Statement(s)
            Wallet result = Wallet.fromSpendingKeyB58(networkMock2, "A", instant);
            //Assert statement(s)
            assertThat(result, equalTo(walletMock));
            deterministicKey.verify(() -> DeterministicKey.deserializeB58(null, "A", networkMock2), atLeast(1));
            verify(deterministicKeyMock, atLeast(1)).setCreationTime((Instant) any());
            networkParameters.verify(() -> NetworkParameters.of(networkMock2), atLeast(1));
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2PKHpub();
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2PKHpriv();
            base58.verify(() -> Base58.decodeChecked("A"), atLeast(1));
            wallet.verify(() -> Wallet.fromSpendingKey(networkMock2, deterministicKeyMock, ScriptType.P2PKH), atLeast(1));
        }
    }

    //Sapient generated method id: ${347c5bf4-02fe-3272-9ba6-723d62eeccfd}, hash: D4B860C82A1DD5AB88EEA5BC630518DD
    @Ignore()
    @Test()
    public void fromSpendingKeyB58WhenHeaderEqualsParamsGetBip32HeaderP2WPKHpriv() {
        /* Branches:
         * (header == params.getBip32HeaderP2PKHpub()) : false  #  inside outputScriptTypeFromB58 method
         * (header == params.getBip32HeaderP2PKHpriv()) : false  #  inside outputScriptTypeFromB58 method
         * (header == params.getBip32HeaderP2WPKHpub()) : false  #  inside outputScriptTypeFromB58 method
         * (header == params.getBip32HeaderP2WPKHpriv()) : true  #  inside outputScriptTypeFromB58 method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        Network networkMock2 = mock(Network.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        Wallet walletMock = mock(Wallet.class);
        try (MockedStatic<Wallet> wallet = mockStatic(Wallet.class, CALLS_REAL_METHODS);
             MockedStatic<Base58> base58 = mockStatic(Base58.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<DeterministicKey> deterministicKey = mockStatic(DeterministicKey.class)) {
            deterministicKey.when(() -> DeterministicKey.deserializeB58(null, "<value>", networkMock2)).thenReturn(deterministicKeyMock);
            doNothing().when(deterministicKeyMock).setCreationTime((Instant) any());
            networkParameters.when(() -> NetworkParameters.of(networkMock2)).thenReturn(networkParametersMock);
            doReturn(1).when(networkParametersMock).getBip32HeaderP2PKHpub();
            doReturn(1).when(networkParametersMock).getBip32HeaderP2PKHpriv();
            doReturn(1).when(networkParametersMock).getBip32HeaderP2WPKHpub();
            doReturn(2).when(networkParametersMock).getBip32HeaderP2WPKHpriv();
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("<value>")).thenReturn(byteArray);
            wallet.when(() -> Wallet.fromSpendingKey(networkMock2, deterministicKeyMock, ScriptType.P2WPKH)).thenReturn(walletMock);
            Instant instant = Instant.now();
            //Act Statement(s)
            Wallet result = Wallet.fromSpendingKeyB58(networkMock2, "<value>", instant);
            //Assert statement(s)
            assertThat(result, equalTo(walletMock));
            deterministicKey.verify(() -> DeterministicKey.deserializeB58(null, "<value>", networkMock2), atLeast(1));
            verify(deterministicKeyMock, atLeast(1)).setCreationTime((Instant) any());
            networkParameters.verify(() -> NetworkParameters.of(networkMock2), atLeast(1));
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2PKHpub();
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2PKHpriv();
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2WPKHpub();
            verify(networkParametersMock, atLeast(1)).getBip32HeaderP2WPKHpriv();
            base58.verify(() -> Base58.decodeChecked("<value>"), atLeast(1));
            wallet.verify(() -> Wallet.fromSpendingKey(networkMock2, deterministicKeyMock, ScriptType.P2WPKH), atLeast(1));
        }
    }

    //Sapient generated method id: ${69559c9b-d4b0-3367-a5fc-7bf942c039ed}, hash: 858981CE673A57F84DC768E7766519E6
    @Ignore()
    @Test()
    public void fromSpendingKeyB58WhenHeaderNotEqualsParamsGetBip32HeaderP2WPKHprivThrowsIllegalArgumentException() {
        /* Branches:
         * (header == params.getBip32HeaderP2PKHpub()) : false  #  inside outputScriptTypeFromB58 method
         * (header == params.getBip32HeaderP2PKHpriv()) : false  #  inside outputScriptTypeFromB58 method
         * (header == params.getBip32HeaderP2WPKHpub()) : false  #  inside outputScriptTypeFromB58 method
         * (header == params.getBip32HeaderP2WPKHpriv()) : false  #  inside outputScriptTypeFromB58 method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        Network networkMock2 = mock(Network.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<DeterministicKey> deterministicKey = mockStatic(DeterministicKey.class)) {
            deterministicKey.when(() -> DeterministicKey.deserializeB58(null, "<value>", networkMock2)).thenReturn(deterministicKeyMock);
            doNothing().when(deterministicKeyMock).setCreationTime((Instant) any());
            networkParameters.when(() -> NetworkParameters.of(networkMock2)).thenReturn(networkParametersMock);
            doReturn(1).when(networkParametersMock).getBip32HeaderP2PKHpub();
            doReturn(1).when(networkParametersMock).getBip32HeaderP2PKHpriv();
            doReturn(1).when(networkParametersMock).getBip32HeaderP2WPKHpub();
            doReturn(1).when(networkParametersMock).getBip32HeaderP2WPKHpriv();
            byte[] byteArray = new byte[]{(byte) 0};
            base58.when(() -> Base58.decodeChecked("<value>")).thenReturn(byteArray);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("<val");
            thrown.expect(IllegalArgumentException.class);
            thrown.expectMessage(illegalArgumentException.getMessage());
            Instant instant = Instant.now();
            //Act Statement(s)
            Wallet.fromSpendingKeyB58(networkMock2, "<value>", instant);
            //Assert statement(s)
            deterministicKey.verify(() -> DeterministicKey.deserializeB58(null, "<value>", networkMock2), atLeast(1));
            verify(deterministicKeyMock).setCreationTime((Instant) any());
            networkParameters.verify(() -> NetworkParameters.of(networkMock2), atLeast(1));
            verify(networkParametersMock).getBip32HeaderP2PKHpub();
            verify(networkParametersMock).getBip32HeaderP2PKHpriv();
            verify(networkParametersMock).getBip32HeaderP2WPKHpub();
            verify(networkParametersMock).getBip32HeaderP2WPKHpriv();
            base58.verify(() -> Base58.decodeChecked("<value>"), atLeast(1));
        }
    }

    //Sapient generated method id: ${8ab7eeea-982b-354f-a34a-b30652ad6565}, hash: DB5B5075858DC8E45754A828C8314B99
    @Test()
    public void fromSpendingKeyB581Test() {
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        Network networkMock2 = mock(Network.class);
        Wallet walletMock = mock(Wallet.class);
        try (MockedStatic<Wallet> wallet = mockStatic(Wallet.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock2).when(paramsMock2).network();
            wallet.when(() -> Wallet.fromWatchingKeyB58(eq(networkMock2), eq("spendingKeyB58"), (Instant) any())).thenReturn(walletMock);
            Instant instant = Instant.ofEpochSecond(1700000000);
            //Act Statement(s)
            Wallet result = Wallet.fromSpendingKeyB58(paramsMock2, "spendingKeyB58", instant);
            //Assert statement(s)
            assertThat(result, equalTo(walletMock));
            verify(paramsMock2, atLeast(1)).network();
            wallet.verify(() -> Wallet.fromWatchingKeyB58(eq(networkMock2), eq("spendingKeyB58"), (Instant) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${aedfad3e-a736-323a-8bdd-99311f0613aa}, hash: 1AA561780EC4568F24D80EC2981B0132
    @Test()
    public void fromSpendingKeyB582Test() {
        //Arrange Statement(s)
        Wallet walletMock = mock(Wallet.class);
        Network networkMock2 = mock(Network.class);
        try (MockedStatic<Wallet> wallet = mockStatic(Wallet.class, CALLS_REAL_METHODS)) {
            Instant instant = DeterministicHierarchy.BIP32_STANDARDISATION_TIME;
            wallet.when(() -> Wallet.fromSpendingKeyB58(networkMock2, "spendingKeyB58", instant)).thenReturn(walletMock);
            //Act Statement(s)
            Wallet result = Wallet.fromSpendingKeyB58(networkMock2, "spendingKeyB58");
            //Assert statement(s)
            assertThat(result, equalTo(walletMock));
            wallet.verify(() -> Wallet.fromSpendingKeyB58(networkMock2, "spendingKeyB58", instant), atLeast(1));
        }
    }

    //Sapient generated method id: ${cfeb1a94-37e1-3199-b24c-c431c33c6f8b}, hash: C644352F23172B22911D2EB299DC3512
    @Test()
    public void fromSpendingKeyB583Test() {
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        Network networkMock2 = mock(Network.class);
        Wallet walletMock = mock(Wallet.class);
        try (MockedStatic<Wallet> wallet = mockStatic(Wallet.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock2).when(paramsMock2).network();
            wallet.when(() -> Wallet.fromSpendingKeyB58(networkMock2, "spendingKeyB58")).thenReturn(walletMock);
            //Act Statement(s)
            Wallet result = Wallet.fromSpendingKeyB58(paramsMock2, "spendingKeyB58");
            //Assert statement(s)
            assertThat(result, equalTo(walletMock));
            verify(paramsMock2, atLeast(1)).network();
            wallet.verify(() -> Wallet.fromSpendingKeyB58(networkMock2, "spendingKeyB58"), atLeast(1));
        }
    }

    //Sapient generated method id: ${11f237b5-6544-3c23-9298-0b04d3c45dac}, hash: 50F4F4FEF743642452036F48C9FADEF8
    @Test()
    public void fromSpendingKeyB584WhenCreationTimeSecondsEquals0() {
        /* Branches:
         * (creationTimeSeconds == 0) : true
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        Network networkMock2 = mock(Network.class);
        Wallet walletMock = mock(Wallet.class);
        try (MockedStatic<Wallet> wallet = mockStatic(Wallet.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock2).when(paramsMock2).network();
            wallet.when(() -> Wallet.fromSpendingKeyB58(networkMock2, "spendingKeyB58")).thenReturn(walletMock);
            //Act Statement(s)
            Wallet result = Wallet.fromSpendingKeyB58(paramsMock2, "spendingKeyB58", 0L);
            //Assert statement(s)
            assertThat(result, equalTo(walletMock));
            verify(paramsMock2, atLeast(1)).network();
            wallet.verify(() -> Wallet.fromSpendingKeyB58(networkMock2, "spendingKeyB58"), atLeast(1));
        }
    }

    //Sapient generated method id: ${1caf4cc2-fe83-31cd-90c6-2f95db6352ed}, hash: E34F58012AE079468A8EAD3312801E39
    @Test()
    public void fromSpendingKeyB584WhenCreationTimeSecondsNotEquals0() {
        /* Branches:
         * (creationTimeSeconds == 0) : false
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        Network networkMock2 = mock(Network.class);
        Wallet walletMock = mock(Wallet.class);
        try (MockedStatic<Wallet> wallet = mockStatic(Wallet.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock2).when(paramsMock2).network();
            wallet.when(() -> Wallet.fromSpendingKeyB58(eq(networkMock2), eq("spendingKeyB58"), (Instant) any())).thenReturn(walletMock);
            //Act Statement(s)
            Wallet result = Wallet.fromSpendingKeyB58(paramsMock2, "spendingKeyB58", 1L);
            //Assert statement(s)
            assertThat(result, equalTo(walletMock));
            verify(paramsMock2, atLeast(1)).network();
            wallet.verify(() -> Wallet.fromSpendingKeyB58(eq(networkMock2), eq("spendingKeyB58"), (Instant) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${11e373ee-caf9-3f4b-bfe7-f7057e6a8172}, hash: B27773224138B876E728929D0502999F
    @Ignore()
    @Test()
    public void fromMasterKeyWhenSignerIsReady() {
        /* Branches:
         * (creationTime.isPresent()) : true
         * (signer.isReady()) : true  #  inside addTransactionSigner method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey masterKeyMock = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        ChildNumber childNumberMock = mock(ChildNumber.class);
        DeterministicKey deterministicKeyMock2 = mock(DeterministicKey.class);
        KeyChainGroup.Builder keyChainGroupBuilderMock = mock(KeyChainGroup.Builder.class);
        Network networkMock2 = mock(Network.class);
        KeyChainGroup.Builder keyChainGroupBuilderMock2 = mock(KeyChainGroup.Builder.class);
        DeterministicKeyChain deterministicKeyChainMock = mock(DeterministicKeyChain.class);
        KeyChainGroup keyChainGroupMock2 = mock(KeyChainGroup.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<KeyChainGroup> keyChainGroup = mockStatic(KeyChainGroup.class);
             MockedStatic<HDKeyDerivation> hDKeyDerivation = mockStatic(HDKeyDerivation.class)) {
            Instant instant = (Instant) Instant.ofEpochSecond(1700000000);
            doReturn(Optional.of(instant)).when(masterKeyMock).creationTime();
            hDKeyDerivation.when(() -> HDKeyDerivation.deriveChildKey(masterKeyMock, childNumberMock)).thenReturn(deterministicKeyMock);
            doReturn(deterministicKeyMock2).when(deterministicKeyMock).dropParent();
            doNothing().when(deterministicKeyMock2).setCreationTime((Instant) any());
            keyChainGroup.when(() -> KeyChainGroup.builder(networkMock2)).thenReturn(keyChainGroupBuilderMock);
            doReturn(keyChainGroupBuilderMock2).when(keyChainGroupBuilderMock).addChain(deterministicKeyChainMock);
            doReturn(keyChainGroupMock2).when(keyChainGroupBuilderMock2).build();
            networkParameters.when(() -> NetworkParameters.of(networkMock2)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock2)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock2)).thenReturn(coinSelectorMock);
            //Act Statement(s)
            Wallet result = Wallet.fromMasterKey(networkMock2, masterKeyMock, ScriptType.P2PKH, childNumberMock);
            //Assert statement(s)
            //TODO: Please implement equals method in Wallet for verification of the entire object or you need to adjust respective assertion statements
            assertThat(result, is(notNullValue()));
            verify(masterKeyMock).creationTime();
            hDKeyDerivation.verify(() -> HDKeyDerivation.deriveChildKey(masterKeyMock, childNumberMock), atLeast(1));
            verify(deterministicKeyMock).dropParent();
            verify(deterministicKeyMock2).setCreationTime((Instant) any());
            keyChainGroup.verify(() -> KeyChainGroup.builder(networkMock2), atLeast(1));
            verify(keyChainGroupBuilderMock).addChain(deterministicKeyChainMock);
            verify(keyChainGroupBuilderMock2).build();
            networkParameters.verify(() -> NetworkParameters.of(networkMock2), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock2), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${874b35a0-6a0b-3a0e-83ef-ccfe7569c866}, hash: EB7732EA6E2CE8C78E907AA8FCC76DF2
    @Ignore()
    @Test()
    public void fromMasterKeyWhenCreationTimeNotIsPresentAndSignerIsReady() {
        /* Branches:
         * (creationTime.isPresent()) : false
         * (signer.isReady()) : true  #  inside addTransactionSigner method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeterministicKey masterKeyMock = mock(DeterministicKey.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        ChildNumber childNumberMock = mock(ChildNumber.class);
        DeterministicKey deterministicKeyMock2 = mock(DeterministicKey.class);
        KeyChainGroup.Builder keyChainGroupBuilderMock = mock(KeyChainGroup.Builder.class);
        Network networkMock2 = mock(Network.class);
        KeyChainGroup.Builder keyChainGroupBuilderMock2 = mock(KeyChainGroup.Builder.class);
        DeterministicKeyChain deterministicKeyChainMock = mock(DeterministicKeyChain.class);
        KeyChainGroup keyChainGroupMock2 = mock(KeyChainGroup.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<KeyChainGroup> keyChainGroup = mockStatic(KeyChainGroup.class);
             MockedStatic<HDKeyDerivation> hDKeyDerivation = mockStatic(HDKeyDerivation.class)) {
            doReturn(Optional.empty()).when(masterKeyMock).creationTime();
            hDKeyDerivation.when(() -> HDKeyDerivation.deriveChildKey(masterKeyMock, childNumberMock)).thenReturn(deterministicKeyMock);
            doReturn(deterministicKeyMock2).when(deterministicKeyMock).dropParent();
            doNothing().when(deterministicKeyMock2).clearCreationTime();
            keyChainGroup.when(() -> KeyChainGroup.builder(networkMock2)).thenReturn(keyChainGroupBuilderMock);
            doReturn(keyChainGroupBuilderMock2).when(keyChainGroupBuilderMock).addChain(deterministicKeyChainMock);
            doReturn(keyChainGroupMock2).when(keyChainGroupBuilderMock2).build();
            networkParameters.when(() -> NetworkParameters.of(networkMock2)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock2)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock2)).thenReturn(coinSelectorMock);
            //Act Statement(s)
            Wallet result = Wallet.fromMasterKey(networkMock2, masterKeyMock, ScriptType.P2PKH, childNumberMock);
            //Assert statement(s)
            //TODO: Please implement equals method in Wallet for verification of the entire object or you need to adjust respective assertion statements
            assertThat(result, is(notNullValue()));
            verify(masterKeyMock).creationTime();
            hDKeyDerivation.verify(() -> HDKeyDerivation.deriveChildKey(masterKeyMock, childNumberMock), atLeast(1));
            verify(deterministicKeyMock).dropParent();
            verify(deterministicKeyMock2).clearCreationTime();
            keyChainGroup.verify(() -> KeyChainGroup.builder(networkMock2), atLeast(1));
            verify(keyChainGroupBuilderMock).addChain(deterministicKeyChainMock);
            verify(keyChainGroupBuilderMock2).build();
            networkParameters.verify(() -> NetworkParameters.of(networkMock2), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock2), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${1cc29572-2075-3ed9-9097-89b9d18f6fee}, hash: 2D0EDC1940B740AAEF47FF79FE2ABC6D
    @Test()
    public void fromMasterKey1Test() {
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        Network networkMock2 = mock(Network.class);
        Wallet walletMock = mock(Wallet.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        ChildNumber childNumberMock = mock(ChildNumber.class);
        try (MockedStatic<Wallet> wallet = mockStatic(Wallet.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock2).when(paramsMock2).network();
            wallet.when(() -> Wallet.fromMasterKey(networkMock2, deterministicKeyMock, ScriptType.P2PKH, childNumberMock)).thenReturn(walletMock);
            //Act Statement(s)
            Wallet result = Wallet.fromMasterKey(paramsMock2, deterministicKeyMock, ScriptType.P2PKH, childNumberMock);
            //Assert statement(s)
            assertThat(result, equalTo(walletMock));
            verify(paramsMock2, atLeast(1)).network();
            wallet.verify(() -> Wallet.fromMasterKey(networkMock2, deterministicKeyMock, ScriptType.P2PKH, childNumberMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${b444423d-8062-3e94-803b-01f5c4c4e2cc}, hash: 56D8DD635E2933814DBECC45B34BEA05
    @Test()
    public void networkTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            Network result = target.network();
            //Assert statement(s)
            assertThat(result, equalTo(networkMock));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${956570db-fd33-3dfd-91c8-8279ea4caa8c}, hash: 4E997C96493C0958DFDD91FF00BAFCE5
    @Test()
    public void parseAddressTest() throws AddressFormatException {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Address addressMock = mock(Address.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(addressMock).when(addressParserMock).parseAddress("addressString1");
            //Act Statement(s)
            Address result = target.parseAddress("addressString1");
            //Assert statement(s)
            assertThat(result, equalTo(addressMock));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(addressParserMock).parseAddress("addressString1");
        }
    }

    //Sapient generated method id: ${3aaee867-98bd-3d37-b27b-8285cb29b4c1}, hash: 529E0B9F7C8A40D13D414C84F1458B63
    @Test()
    public void getActiveKeyChainsTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            doReturn(deterministicKeyChainList).when(keyChainGroupMock).getActiveKeyChains((Instant) null);
            //Act Statement(s)
            List<DeterministicKeyChain> result = target.getActiveKeyChains();
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyChainList));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).getActiveKeyChains((Instant) null);
        }
    }

    //Sapient generated method id: ${30b29ed1-c704-3981-a75a-3bb97d54af40}, hash: 41FC7C740814534C4A7762754B18E48B
    @Test()
    public void getActiveKeyChainTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        DeterministicKeyChain deterministicKeyChainMock = mock(DeterministicKeyChain.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(deterministicKeyChainMock).when(keyChainGroupMock).getActiveKeyChain();
            //Act Statement(s)
            DeterministicKeyChain result = target.getActiveKeyChain();
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyChainMock));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).getActiveKeyChain();
        }
    }

    //Sapient generated method id: ${7535c487-32ab-3c5f-aa4e-2e402cb30d3b}, hash: 019BC981955B97F4AAFCD635D12EBBC0
    @Test()
    public void addTransactionSignerWhenSignerIsReady() {
        /* Branches:
         * (signer.isReady()) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            LocalTransactionSigner localTransactionSigner = new LocalTransactionSigner();
            //Act Statement(s)
            target.addTransactionSigner(localTransactionSigner);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${ba62ea1b-892a-312d-877d-10e4412c3f11}, hash: 012651C810F982B63802FC40C2F650F0
    @Test()
    public void getTransactionSignersTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            List<TransactionSigner> result = target.getTransactionSigners();
            //Assert statement(s)
            //TODO: Please implement equals method in LocalTransactionSigner for verification of the entire object or you need to adjust respective assertion statements
            assertThat(result.size(), equalTo(1));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${a5846529-8a02-3ed8-949d-c4be8b18a341}, hash: 274182805C1D1827C0EF58300AB73BC9
    @Test()
    public void currentKeyTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(deterministicKeyMock).when(keyChainGroupMock).currentKey(KeyChain.KeyPurpose.RECEIVE_FUNDS);
            //Act Statement(s)
            DeterministicKey result = target.currentKey(KeyChain.KeyPurpose.RECEIVE_FUNDS);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyMock));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).currentKey(KeyChain.KeyPurpose.RECEIVE_FUNDS);
        }
    }

    //Sapient generated method id: ${33c7e7c6-6306-3511-af38-9485e62ed4f2}, hash: 15B8EBF9D7411D5D95F4CD1EAB7795A8
    @Test()
    public void currentReceiveKeyTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(deterministicKeyMock).when(keyChainGroupMock).currentKey(KeyChain.KeyPurpose.RECEIVE_FUNDS);
            //Act Statement(s)
            DeterministicKey result = target.currentReceiveKey();
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyMock));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).currentKey(KeyChain.KeyPurpose.RECEIVE_FUNDS);
        }
    }

    //Sapient generated method id: ${7ff36242-09f0-354e-b222-d4e2ca49acca}, hash: 052A041802158347FC5FD25BFF31C556
    @Test()
    public void currentAddressTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Address addressMock = mock(Address.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(addressMock).when(keyChainGroupMock).currentAddress(KeyChain.KeyPurpose.RECEIVE_FUNDS);
            //Act Statement(s)
            Address result = target.currentAddress(KeyChain.KeyPurpose.RECEIVE_FUNDS);
            //Assert statement(s)
            assertThat(result, equalTo(addressMock));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).currentAddress(KeyChain.KeyPurpose.RECEIVE_FUNDS);
        }
    }

    //Sapient generated method id: ${26d09994-bd8a-338a-b65e-b63517b70841}, hash: 02657CB20879AC778D5C5B92AD534934
    @Test()
    public void currentReceiveAddressTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Address addressMock = mock(Address.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(addressMock).when(keyChainGroupMock).currentAddress(KeyChain.KeyPurpose.RECEIVE_FUNDS);
            //Act Statement(s)
            Address result = target.currentReceiveAddress();
            //Assert statement(s)
            assertThat(result, equalTo(addressMock));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).currentAddress(KeyChain.KeyPurpose.RECEIVE_FUNDS);
        }
    }

    //Sapient generated method id: ${c7473f39-055c-3be2-a4d9-f5a3918f676a}, hash: E044D7CC5C12688CE97F0A8EE366BBDB
    @Test()
    public void freshKeyTest() throws IOException {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<DeterministicKey> deterministicKeyList = new ArrayList<>();
            deterministicKeyList.add(deterministicKeyMock);
            doReturn(deterministicKeyList).when(target).freshKeys(KeyChain.KeyPurpose.RECEIVE_FUNDS, 1);
            //Act Statement(s)
            DeterministicKey result = target.freshKey(KeyChain.KeyPurpose.RECEIVE_FUNDS);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyMock));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).freshKeys(KeyChain.KeyPurpose.RECEIVE_FUNDS, 1);
        }
    }

    //Sapient generated method id: ${b83c3305-ad57-368d-8ec5-b45ffefcdb25}, hash: 624CC26ECE190FCC700611333374CB48
    @Test()
    public void freshKeysTest() throws IOException {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<DeterministicKey> deterministicKeyList = new ArrayList<>();
            doReturn(deterministicKeyList).when(keyChainGroupMock).freshKeys(KeyChain.KeyPurpose.RECEIVE_FUNDS, 0);
            doNothing().when(target).saveNow();
            //Act Statement(s)
            List<DeterministicKey> result = target.freshKeys(KeyChain.KeyPurpose.RECEIVE_FUNDS, 0);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyList));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).freshKeys(KeyChain.KeyPurpose.RECEIVE_FUNDS, 0);
            verify(target).saveNow();
        }
    }

    //Sapient generated method id: ${da666772-c355-3594-a79c-a13035492a87}, hash: 615877C5F6EDE1835365E7F40B390ABF
    @Test()
    public void freshReceiveKeyTest() throws IOException {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(deterministicKeyMock).when(target).freshKey(KeyChain.KeyPurpose.RECEIVE_FUNDS);
            //Act Statement(s)
            DeterministicKey result = target.freshReceiveKey();
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyMock));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).freshKey(KeyChain.KeyPurpose.RECEIVE_FUNDS);
        }
    }

    //Sapient generated method id: ${1d849004-1ca3-370a-9412-0fe9e2e5254a}, hash: C55BC4C7006D22BB36BB261B4A46D26C
    @Test()
    public void freshAddressTest() throws IOException {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Address addressMock = mock(Address.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(addressMock).when(keyChainGroupMock).freshAddress(KeyChain.KeyPurpose.RECEIVE_FUNDS);
            doNothing().when(target).saveNow();
            //Act Statement(s)
            Address result = target.freshAddress(KeyChain.KeyPurpose.RECEIVE_FUNDS);
            //Assert statement(s)
            assertThat(result, equalTo(addressMock));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).freshAddress(KeyChain.KeyPurpose.RECEIVE_FUNDS);
            verify(target).saveNow();
        }
    }

    //Sapient generated method id: ${4964eb16-31ff-332f-b31d-b4d8f68e7ef6}, hash: 0929E078CE984997F28230DE0C8388FF
    @Test()
    public void freshReceiveAddressTest() throws IOException {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Address addressMock = mock(Address.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(addressMock).when(target).freshAddress(KeyChain.KeyPurpose.RECEIVE_FUNDS);
            //Act Statement(s)
            Address result = target.freshReceiveAddress();
            //Assert statement(s)
            assertThat(result, equalTo(addressMock));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).freshAddress(KeyChain.KeyPurpose.RECEIVE_FUNDS);
        }
    }

    //Sapient generated method id: ${80cbf9cc-7274-3d34-bf08-dc835e809b11}, hash: 93221C5C299C170387F30DFC4728A78C
    @Test()
    public void freshReceiveAddress1Test() throws IOException {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Address addressMock = mock(Address.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(addressMock).when(keyChainGroupMock).freshAddress(KeyChain.KeyPurpose.RECEIVE_FUNDS, ScriptType.P2PKH, (Instant) null);
            doNothing().when(target).saveNow();
            //Act Statement(s)
            Address result = target.freshReceiveAddress(ScriptType.P2PKH);
            //Assert statement(s)
            assertThat(result, equalTo(addressMock));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).freshAddress(KeyChain.KeyPurpose.RECEIVE_FUNDS, ScriptType.P2PKH, (Instant) null);
            verify(target).saveNow();
        }
    }

    //Sapient generated method id: ${2ea898dc-0dfd-3a2a-a2b1-78091c304873}, hash: EA0606903BEFE070ABF21FD2D179C2F8
    @Test()
    public void getIssuedReceiveKeysWhenKeyChainGroupGetActiveKeyChainsKeyRotationTimeIsNotEmpty() {
        /* Branches:
         * (for-each(keyChainGroup.getActiveKeyChains(keyRotationTime))) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        DeterministicKeyChain deterministicKeyChainMock = mock(DeterministicKeyChain.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChainMock);
            doReturn(deterministicKeyChainList).when(keyChainGroupMock).getActiveKeyChains((Instant) null);
            List<DeterministicKey> deterministicKeyList = new ArrayList<>();
            doReturn(deterministicKeyList).when(deterministicKeyChainMock).getIssuedReceiveKeys();
            //Act Statement(s)
            List<ECKey> result = target.getIssuedReceiveKeys();
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).getActiveKeyChains((Instant) null);
            verify(deterministicKeyChainMock).getIssuedReceiveKeys();
        }
    }

    //Sapient generated method id: ${3dd0c8d6-d44a-350b-b891-b4f277b1d590}, hash: 528619301A6AAB83531CBEDC02414369
    @Test()
    public void getIssuedReceiveAddressesWhenChainGetIssuedReceiveKeysIsNotEmpty() {
        /* Branches:
         * (for-each(keyChainGroup.getActiveKeyChains(keyRotationTime))) : true
         * (for-each(chain.getIssuedReceiveKeys())) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        DeterministicKeyChain deterministicKeyChainMock = mock(DeterministicKeyChain.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        Address addressMock = mock(Address.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<DeterministicKeyChain> deterministicKeyChainList = new ArrayList<>();
            deterministicKeyChainList.add(deterministicKeyChainMock);
            doReturn(deterministicKeyChainList).when(keyChainGroupMock).getActiveKeyChains((Instant) null);
            doReturn(ScriptType.P2PKH).when(deterministicKeyChainMock).getOutputScriptType();
            List<DeterministicKey> deterministicKeyList = new ArrayList<>();
            deterministicKeyList.add(deterministicKeyMock);
            doReturn(deterministicKeyList).when(deterministicKeyChainMock).getIssuedReceiveKeys();
            doReturn(addressMock).when(deterministicKeyMock).toAddress(ScriptType.P2PKH, networkMock);
            //Act Statement(s)
            List<Address> result = target.getIssuedReceiveAddresses();
            //Assert statement(s)
            assertThat(result.size(), equalTo(1));
            assertThat(result.get(0), is(instanceOf(Address.class)));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).getActiveKeyChains((Instant) null);
            verify(deterministicKeyChainMock).getOutputScriptType();
            verify(deterministicKeyChainMock).getIssuedReceiveKeys();
            verify(deterministicKeyMock).toAddress(ScriptType.P2PKH, networkMock);
        }
    }

    //Sapient generated method id: ${d32fd3c5-20d1-322b-960f-48b452c94d5f}, hash: 32658DA298FE2F6DAF43AE13EAF1194C
    @Test()
    public void upgradeToDeterministicTest() throws DeterministicUpgradeRequiresPassword {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        AesKey aesKeyMock = mock(AesKey.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            KeyChainGroupStructure keyChainGroupStructure = KeyChainGroupStructure.BIP32;
            doNothing().when(keyChainGroupMock).upgradeToDeterministic(ScriptType.P2PKH, keyChainGroupStructure, (Instant) null, aesKeyMock);
            //Act Statement(s)
            target.upgradeToDeterministic(ScriptType.P2PKH, aesKeyMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).upgradeToDeterministic(ScriptType.P2PKH, keyChainGroupStructure, (Instant) null, aesKeyMock);
        }
    }

    //Sapient generated method id: ${d71c859d-3fc7-3f68-8905-eb9c3a7201c4}, hash: 6589B8EAC702543937E53C0A4A8A98B2
    @Test()
    public void upgradeToDeterministic1Test() throws DeterministicUpgradeRequiresPassword {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        AesKey aesKeyMock = mock(AesKey.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(keyChainGroupMock).upgradeToDeterministic(ScriptType.P2PKH, keyChainGroupStructureMock, (Instant) null, aesKeyMock);
            //Act Statement(s)
            target.upgradeToDeterministic(ScriptType.P2PKH, keyChainGroupStructureMock, aesKeyMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).upgradeToDeterministic(ScriptType.P2PKH, keyChainGroupStructureMock, (Instant) null, aesKeyMock);
        }
    }

    //Sapient generated method id: ${0f72f16e-4202-39f4-a8fe-5acf5b5f292b}, hash: FF22AFD07D89AF7E24C0FD028FE0A438
    @Test()
    public void isDeterministicUpgradeRequiredWhenKeyChainGroupIsDeterministicUpgradeRequiredOutputScriptTypeKeyRotationTime() {
        /* Branches:
         * (keyChainGroup.isDeterministicUpgradeRequired(outputScriptType, keyRotationTime)) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(true).when(keyChainGroupMock).isDeterministicUpgradeRequired(ScriptType.P2PKH, (Instant) null);
            //Act Statement(s)
            boolean result = target.isDeterministicUpgradeRequired(ScriptType.P2PKH);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).isDeterministicUpgradeRequired(ScriptType.P2PKH, (Instant) null);
        }
    }

    //Sapient generated method id: ${ca531166-7d1d-3607-b3b4-bc5dbcb6f043}, hash: 6C1CCA6ACCD48CB0061DAAD7AB391CAB
    @Test()
    public void isDeterministicUpgradeRequiredWhenKeyChainGroupNotIsDeterministicUpgradeRequiredOutputScriptTypeKeyRotationTime() {
        /* Branches:
         * (keyChainGroup.isDeterministicUpgradeRequired(outputScriptType, keyRotationTime)) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(false).when(keyChainGroupMock).isDeterministicUpgradeRequired(ScriptType.P2PKH, (Instant) null);
            //Act Statement(s)
            boolean result = target.isDeterministicUpgradeRequired(ScriptType.P2PKH);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).isDeterministicUpgradeRequired(ScriptType.P2PKH, (Instant) null);
        }
    }

    //Sapient generated method id: ${08e9f49a-89e3-31e6-9504-0f530a0ffcea}, hash: B5236CB960E72215F758EF69F9500A61
    @Test()
    public void getWatchedScriptsTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            List<Script> result = target.getWatchedScripts();
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${e0392b55-8585-32d7-aed4-32f211b54329}, hash: 718BED42FF3FAEE65306B34BDE4CAF25
    @Test()
    public void removeKeyWhenKeyChainGroupRemoveImportedKeyKey() {
        /* Branches:
         * (keyChainGroup.removeImportedKey(key)) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        ECKey eCKeyMock = mock(ECKey.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(true).when(keyChainGroupMock).removeImportedKey(eCKeyMock);
            //Act Statement(s)
            boolean result = target.removeKey(eCKeyMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).removeImportedKey(eCKeyMock);
        }
    }

    //Sapient generated method id: ${b50fdd3e-4e19-3849-ae7e-9a9d3d750de2}, hash: 439F94FFAF413E2198C0B9FCFF91BA53
    @Test()
    public void removeKeyWhenKeyChainGroupNotRemoveImportedKeyKey() {
        /* Branches:
         * (keyChainGroup.removeImportedKey(key)) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        ECKey eCKeyMock = mock(ECKey.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(false).when(keyChainGroupMock).removeImportedKey(eCKeyMock);
            //Act Statement(s)
            boolean result = target.removeKey(eCKeyMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).removeImportedKey(eCKeyMock);
        }
    }

    //Sapient generated method id: ${b8b4df42-bfaf-390d-999c-787ff9b159aa}, hash: F833025D7B340EB4932C6BC14FAF9414
    @Test()
    public void getKeyChainGroupSizeTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(0).when(keyChainGroupMock).numKeys();
            //Act Statement(s)
            int result = target.getKeyChainGroupSize();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).numKeys();
        }
    }

    //Sapient generated method id: ${16a7e232-e8e2-3379-8079-69357e6decd7}, hash: 7E2A688163FE0B264188B95A8F3F4801
    @Test()
    public void getKeyChainGroupCombinedKeyLookaheadEpochsTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(0).when(keyChainGroupMock).getCombinedKeyLookaheadEpochs();
            //Act Statement(s)
            int result = target.getKeyChainGroupCombinedKeyLookaheadEpochs();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).getCombinedKeyLookaheadEpochs();
        }
    }

    //Sapient generated method id: ${b88d93ca-8962-3682-ab2e-c47b2e72b744}, hash: AC87F22FD2761B14353D81DE0A69D24D
    @Test()
    public void getImportedKeysTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<ECKey> eCKeyList = new ArrayList<>();
            doReturn(eCKeyList).when(keyChainGroupMock).getImportedKeys();
            //Act Statement(s)
            List<ECKey> result = target.getImportedKeys();
            //Assert statement(s)
            assertThat(result, equalTo(eCKeyList));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).getImportedKeys();
        }
    }

    //Sapient generated method id: ${d586bd99-a978-3115-bcaa-1fe4078e5a34}, hash: 4707BAFDE292BF61884FB190EBC166CB
    @Test()
    public void currentChangeAddressTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Address addressMock = mock(Address.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(addressMock).when(keyChainGroupMock).currentAddress(KeyChain.KeyPurpose.CHANGE);
            //Act Statement(s)
            Address result = target.currentChangeAddress();
            //Assert statement(s)
            assertThat(result, equalTo(addressMock));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).currentAddress(KeyChain.KeyPurpose.CHANGE);
        }
    }

    //Sapient generated method id: ${03b6b7c8-ee9b-3c13-a2c0-754b28e323e5}, hash: 47DA001F6CE6398A58339D2C7089D391
    @Test()
    public void importKeyWhenImportKeysCollectionsSingletonListKeyEquals1() throws IOException {
        /* Branches:
         * (importKeys(Collections.singletonList(key)) == 1) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        ECKey eCKeyMock = mock(ECKey.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<ECKey> eCKeyList = new ArrayList<>(Arrays.asList(eCKeyMock));
            doReturn(1).when(target).importKeys(eCKeyList);
            //Act Statement(s)
            boolean result = target.importKey(eCKeyMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).importKeys(eCKeyList);
        }
    }

    //Sapient generated method id: ${c8cb0b03-5b3e-3d83-ada3-5938ba52d165}, hash: 89E75004A369681D318168B78D5BD592
    @Test()
    public void importKeyWhenImportKeysCollectionsSingletonListKeyNotEquals1() throws IOException {
        /* Branches:
         * (importKeys(Collections.singletonList(key)) == 1) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        ECKey eCKeyMock = mock(ECKey.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<ECKey> eCKeyList = new ArrayList<>(Arrays.asList(eCKeyMock));
            doReturn(2).when(target).importKeys(eCKeyList);
            //Act Statement(s)
            boolean result = target.importKey(eCKeyMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).importKeys(eCKeyList);
        }
    }

    //Sapient generated method id: ${2c509167-f9ab-30d9-918a-970a644792c0}, hash: D5FA733147294D206469E8FB0E6BCCB0
    @Test()
    public void importKeysWhenKeyInstanceOfDeterministicKeyThrowsIllegalArgumentException() {
        /* Branches:
         * (for-each(keys)) : true  #  inside checkNoDeterministicKeys method
         * (key instanceof DeterministicKey) : true  #  inside checkNoDeterministicKeys method
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Cannot import HD keys back into the wallet");
            thrown.expect(IllegalArgumentException.class);
            thrown.expectMessage(illegalArgumentException.getMessage());
            List<ECKey> eCKeyList = new ArrayList<>();
            eCKeyList.add(deterministicKeyMock);
            //Act Statement(s)
            target.importKeys(eCKeyList);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${d74639dc-bf6a-3392-b5b6-d14d4b40cc24}, hash: 267576201E47B7EEE434C134C85D9DC4
    @Test()
    public void importKeysWhenKeyNotInstanceOfDeterministicKey() throws IOException {
        /* Branches:
         * (for-each(keys)) : true  #  inside checkNoDeterministicKeys method
         * (key instanceof DeterministicKey) : false  #  inside checkNoDeterministicKeys method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        ECKey eCKeyMock = mock(ECKey.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<ECKey> eCKeyList = new ArrayList<>();
            eCKeyList.add(eCKeyMock);
            doReturn(0).when(keyChainGroupMock).importKeys(eCKeyList);
            doNothing().when(target).saveNow();
            //Act Statement(s)
            int result = target.importKeys(eCKeyList);
            //Assert statement(s)
            assertThat(result, equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).importKeys(eCKeyList);
            verify(target).saveNow();
        }
    }

    //Sapient generated method id: ${92ad1dca-e3c7-3650-a26a-c40d78b3a556}, hash: 0CAD00EDA869143AE8BE20D4F0965EE0
    @Test()
    public void importKeysAndEncryptTest() throws KeyCrypterException {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class);
        AesKey aesKeyMock = mock(AesKey.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(keyCrypterMock).when(keyChainGroupMock).getKeyCrypter();
            doReturn(aesKeyMock).when(keyCrypterMock).deriveKey("importKeysAndEncrypt_charSequence1");
            List<ECKey> eCKeyList = new ArrayList<>();
            doReturn(0).when(target).importKeysAndEncrypt(eCKeyList, aesKeyMock);
            //Act Statement(s)
            int result = target.importKeysAndEncrypt(eCKeyList, "importKeysAndEncrypt_charSequence1");
            //Assert statement(s)
            assertThat(result, equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock, times(2)).getKeyCrypter();
            verify(keyCrypterMock).deriveKey("importKeysAndEncrypt_charSequence1");
            verify(target).importKeysAndEncrypt(eCKeyList, aesKeyMock);
        }
    }

    //Sapient generated method id: ${11c3dcf0-d653-31ea-9d8b-52e340815589}, hash: 2C6CAFD9716CDAE4327754D5DC57689D
    @Test()
    public void importKeysAndEncrypt1WhenKeyInstanceOfDeterministicKeyThrowsIllegalArgumentException() {
        /* Branches:
         * (for-each(keys)) : true  #  inside checkNoDeterministicKeys method
         * (key instanceof DeterministicKey) : true  #  inside checkNoDeterministicKeys method
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        AesKey aesKeyMock = mock(AesKey.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Cannot import HD keys back into the wallet");
            thrown.expect(IllegalArgumentException.class);
            thrown.expectMessage(illegalArgumentException.getMessage());
            List<ECKey> eCKeyList = new ArrayList<>();
            eCKeyList.add(deterministicKeyMock);
            //Act Statement(s)
            target.importKeysAndEncrypt(eCKeyList, aesKeyMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${3ee49f36-37de-3830-a195-efd988ff33ad}, hash: 6A869A5775CC89B299CFE2DE6B322C62
    @Test()
    public void importKeysAndEncrypt1WhenKeyNotInstanceOfDeterministicKey() {
        /* Branches:
         * (for-each(keys)) : true  #  inside checkNoDeterministicKeys method
         * (key instanceof DeterministicKey) : false  #  inside checkNoDeterministicKeys method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        ECKey eCKeyMock = mock(ECKey.class);
        AesKey aesKeyMock = mock(AesKey.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<ECKey> eCKeyList = new ArrayList<>();
            eCKeyList.add(eCKeyMock);
            doReturn(0).when(keyChainGroupMock).importKeysAndEncrypt(eCKeyList, aesKeyMock);
            //Act Statement(s)
            int result = target.importKeysAndEncrypt(eCKeyList, aesKeyMock);
            //Assert statement(s)
            assertThat(result, equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).importKeysAndEncrypt(eCKeyList, aesKeyMock);
        }
    }

    //Sapient generated method id: ${f16a5d9f-26e0-3519-a8da-eae5f7a6631c}, hash: 5CF4A0EEDE5C98B1455665829B78604D
    @Test()
    public void addAndActivateHDChainTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        DeterministicKeyChain deterministicKeyChainMock = mock(DeterministicKeyChain.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(keyChainGroupMock).addAndActivateHDChain(deterministicKeyChainMock);
            //Act Statement(s)
            target.addAndActivateHDChain(deterministicKeyChainMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).addAndActivateHDChain(deterministicKeyChainMock);
        }
    }

    //Sapient generated method id: ${632b5157-f285-3651-9232-99defe95001f}, hash: 99A3F538E6B428A080C127A99A1E24B2
    @Test()
    public void getKeyChainGroupLookaheadSizeTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(0).when(keyChainGroupMock).getLookaheadSize();
            //Act Statement(s)
            int result = target.getKeyChainGroupLookaheadSize();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).getLookaheadSize();
        }
    }

    //Sapient generated method id: ${d3ccd1c8-262c-393b-a166-d211a88a1caf}, hash: 5D90696DC4FA5A3EDBF2AC55D6832B1D
    @Test()
    public void getKeyChainGroupLookaheadThresholdTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(0).when(keyChainGroupMock).getLookaheadThreshold();
            //Act Statement(s)
            int result = target.getKeyChainGroupLookaheadThreshold();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).getLookaheadThreshold();
        }
    }

    //Sapient generated method id: ${6deda3ec-4706-3e3d-a330-d4ead20687c2}, hash: C9D348E42BA4360991953C797437624B
    @Test()
    public void getWatchingKeyTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        DeterministicKeyChain deterministicKeyChainMock = mock(DeterministicKeyChain.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(deterministicKeyChainMock).when(keyChainGroupMock).getActiveKeyChain();
            doReturn(deterministicKeyMock).when(deterministicKeyChainMock).getWatchingKey();
            //Act Statement(s)
            DeterministicKey result = target.getWatchingKey();
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyMock));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).getActiveKeyChain();
            verify(deterministicKeyChainMock).getWatchingKey();
        }
    }

    //Sapient generated method id: ${e7f68973-c295-3b6b-97ed-351d3487b0c4}, hash: 6AB2962AB32F6DAFAFEA3B6207495201
    @Test()
    public void isWatchingWhenKeyChainGroupIsWatching() {
        /* Branches:
         * (keyChainGroup.isWatching()) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(true).when(keyChainGroupMock).isWatching();
            //Act Statement(s)
            boolean result = target.isWatching();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).isWatching();
        }
    }

    //Sapient generated method id: ${326216fb-b957-3a24-a55d-fb70edf512dd}, hash: 016DE7C412E3B2B05E76F63664810B88
    @Test()
    public void isWatchingWhenKeyChainGroupNotIsWatching() {
        /* Branches:
         * (keyChainGroup.isWatching()) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(false).when(keyChainGroupMock).isWatching();
            //Act Statement(s)
            boolean result = target.isWatching();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).isWatching();
        }
    }

    //Sapient generated method id: ${60cd30de-ab97-314e-a6fa-888a99136431}, hash: D92FFBC30382300E42C704B388217C59
    @Test()
    public void isAddressWatchedWhenIsWatchedScriptScript() {
        /* Branches:
         * (isWatchedScript(script)) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Script scriptMock = mock(Script.class);
        Address addressMock = mock(Address.class);
        try (MockedStatic<ScriptBuilder> scriptBuilder = mockStatic(ScriptBuilder.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            scriptBuilder.when(() -> ScriptBuilder.createOutputScript(addressMock)).thenReturn(scriptMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(true).when(target).isWatchedScript(scriptMock);
            //Act Statement(s)
            boolean result = target.isAddressWatched(addressMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            scriptBuilder.verify(() -> ScriptBuilder.createOutputScript(addressMock), atLeast(1));
            verify(target).isWatchedScript(scriptMock);
        }
    }

    //Sapient generated method id: ${f9c99223-31cc-3cd4-bcda-27391d839c60}, hash: 06A07FAA6E0FEBD0EDD1D6F3D0BCD48E
    @Test()
    public void isAddressWatchedWhenIsWatchedScriptNotScript() {
        /* Branches:
         * (isWatchedScript(script)) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Script scriptMock = mock(Script.class);
        Address addressMock = mock(Address.class);
        try (MockedStatic<ScriptBuilder> scriptBuilder = mockStatic(ScriptBuilder.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            scriptBuilder.when(() -> ScriptBuilder.createOutputScript(addressMock)).thenReturn(scriptMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(false).when(target).isWatchedScript(scriptMock);
            //Act Statement(s)
            boolean result = target.isAddressWatched(addressMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            scriptBuilder.verify(() -> ScriptBuilder.createOutputScript(addressMock), atLeast(1));
            verify(target).isWatchedScript(scriptMock);
        }
    }

    //Sapient generated method id: ${58ee2633-a9ec-307f-a8c3-8b15e90997a0}, hash: 4D8BD4E2DCCA30B977597346117023B2
    @Test()
    public void addWatchedAddressWhenAddWatchedAddressesCollectionsSingletonListAddressNowEquals1() throws IOException {
        /* Branches:
         * (addWatchedAddresses(Collections.singletonList(address), now) == 1) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Address addressMock = mock(Address.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Address> addressList = new ArrayList<>(Arrays.asList(addressMock));
            doReturn(1).when(target).addWatchedAddresses(eq(addressList), (Instant) any());
            //Act Statement(s)
            boolean result = target.addWatchedAddress(addressMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).addWatchedAddresses(eq(addressList), (Instant) any());
        }
    }

    //Sapient generated method id: ${6cc4cce7-4b68-3189-8e9f-0874f53387a5}, hash: 60041006AFBEDCFF6665B2199E19422C
    @Test()
    public void addWatchedAddressWhenAddWatchedAddressesCollectionsSingletonListAddressNowNotEquals1() throws IOException {
        /* Branches:
         * (addWatchedAddresses(Collections.singletonList(address), now) == 1) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Address addressMock = mock(Address.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Address> addressList = new ArrayList<>(Arrays.asList(addressMock));
            doReturn(2).when(target).addWatchedAddresses(eq(addressList), (Instant) any());
            //Act Statement(s)
            boolean result = target.addWatchedAddress(addressMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).addWatchedAddresses(eq(addressList), (Instant) any());
        }
    }

    //Sapient generated method id: ${1ad87e32-1ecb-392c-aff3-faf11da8a67b}, hash: 32D10B0E79E9B9EBCE0B7C5511B15C65
    @Test()
    public void addWatchedAddress1WhenAddWatchedAddressesCollectionsSingletonListAddressCreationTimeEquals1() throws IOException {
        /* Branches:
         * (addWatchedAddresses(Collections.singletonList(address), creationTime) == 1) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Address addressMock = mock(Address.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Address> addressList = new ArrayList<>(Arrays.asList(addressMock));
            doReturn(1).when(target).addWatchedAddresses(eq(addressList), (Instant) any());
            Instant instant = Instant.ofEpochSecond(1700000000);
            //Act Statement(s)
            boolean result = target.addWatchedAddress(addressMock, instant);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).addWatchedAddresses(eq(addressList), (Instant) any());
        }
    }

    //Sapient generated method id: ${26e88e9d-2487-3ff1-af24-61b52993140d}, hash: D33C88B996FB9E8BCFBE07B3A8C4A848
    @Test()
    public void addWatchedAddress1WhenAddWatchedAddressesCollectionsSingletonListAddressCreationTimeNotEquals1() throws IOException {
        /* Branches:
         * (addWatchedAddresses(Collections.singletonList(address), creationTime) == 1) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Address addressMock = mock(Address.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Address> addressList = new ArrayList<>(Arrays.asList(addressMock));
            doReturn(2).when(target).addWatchedAddresses(eq(addressList), (Instant) any());
            Instant instant = Instant.ofEpochSecond(1700000000);
            //Act Statement(s)
            boolean result = target.addWatchedAddress(addressMock, instant);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).addWatchedAddresses(eq(addressList), (Instant) any());
        }
    }

    //Sapient generated method id: ${0ce4cfb5-8fe6-3f73-9b32-2cf35cb73e9d}, hash: 7362504AF4547FF4BC5FF08569E807BA
    @Test()
    public void addWatchedAddress2WhenCreationTimeGreaterThan0AddWatchedAddressAddressInstantOfEpochSecondCreationTime() throws IOException {
        /* Branches:
         * (creationTime > 0) : true
         * (creationTime > 0 ? addWatchedAddress(address, Instant.ofEpochSecond(creationTime)) : addWatchedAddress(address)) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Address addressMock = mock(Address.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(true).when(target).addWatchedAddress(eq(addressMock), (Instant) any());
            //Act Statement(s)
            boolean result = target.addWatchedAddress(addressMock, 1L);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).addWatchedAddress(eq(addressMock), (Instant) any());
        }
    }

    //Sapient generated method id: ${6334cc23-435d-3b36-8b37-d87ca3c1e48a}, hash: EBFA5B04AC313E161568196F738404CA
    @Test()
    public void addWatchedAddress2WhenCreationTimeNotGreaterThan0AndCreationTimeGreaterThan0AddWatchedAddressAddress() throws IOException {
        /* Branches:
         * (creationTime > 0) : false
         * (creationTime > 0 ? addWatchedAddress(address, Instant.ofEpochSecond(creationTime)) : addWatchedAddress(address)) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Address addressMock = mock(Address.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(false).when(target).addWatchedAddress(addressMock);
            //Act Statement(s)
            boolean result = target.addWatchedAddress(addressMock, 0L);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).addWatchedAddress(addressMock);
        }
    }

    //Sapient generated method id: ${e1e33a20-2ddf-3bff-af2a-51d5190da2af}, hash: 59250460A923055DC02FA05ED20B4C0B
    @Test()
    public void addWatchedAddressesWhenAddressesIsNotEmpty() throws IOException {
        /* Branches:
         * (for-each(addresses)) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Script scriptMock = mock(Script.class);
        Address addressMock = mock(Address.class);
        try (MockedStatic<ScriptBuilder> scriptBuilder = mockStatic(ScriptBuilder.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            scriptBuilder.when(() -> ScriptBuilder.createOutputScript(eq(addressMock), (Instant) any())).thenReturn(scriptMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Script> scriptList = new ArrayList<>();
            scriptList.add(scriptMock);
            doReturn(0).when(target).addWatchedScripts(scriptList);
            List<Address> addressList = new ArrayList<>();
            addressList.add(addressMock);
            Instant instant = Instant.ofEpochSecond(1700000000);
            //Act Statement(s)
            int result = target.addWatchedAddresses(addressList, instant);
            //Assert statement(s)
            assertThat(result, equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            scriptBuilder.verify(() -> ScriptBuilder.createOutputScript(eq(addressMock), (Instant) any()));
            verify(target).addWatchedScripts(scriptList);
        }
    }

    //Sapient generated method id: ${73bb5bc6-f118-35cd-a225-7767d531dc6f}, hash: 7E5C00359D9C8D3E8209941C62A89F2F
    @Test()
    public void addWatchedAddresses1WhenAddressesIsNotEmpty() throws IOException {
        /* Branches:
         * (for-each(addresses)) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Script scriptMock = mock(Script.class);
        Address addressMock = mock(Address.class);
        try (MockedStatic<ScriptBuilder> scriptBuilder = mockStatic(ScriptBuilder.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            scriptBuilder.when(() -> ScriptBuilder.createOutputScript(addressMock)).thenReturn(scriptMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Script> scriptList = new ArrayList<>();
            scriptList.add(scriptMock);
            doReturn(0).when(target).addWatchedScripts(scriptList);
            List<Address> addressList = new ArrayList<>();
            addressList.add(addressMock);
            //Act Statement(s)
            int result = target.addWatchedAddresses(addressList);
            //Assert statement(s)
            assertThat(result, equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            scriptBuilder.verify(() -> ScriptBuilder.createOutputScript(addressMock), atLeast(1));
            verify(target).addWatchedScripts(scriptList);
        }
    }

    //Sapient generated method id: ${77fd4fe0-b059-33a2-b117-1281d5426508}, hash: 785D9F513A3DCA32160E4197CE325C6A
    @Ignore()
    @Test()
    public void addWatchedAddresses2WhenCreationTimeGreaterThan0() throws IOException {
        /* Branches:
         * (creationTime > 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Address> addressList = new ArrayList<>();
            //Act Statement(s)
            int result = target.addWatchedAddresses(addressList, 1L);
            //Assert statement(s)
            assertThat(result, equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${e64019fc-e53c-3beb-ab4b-5c2cf735e5c1}, hash: 6D78176D54AF252AEA975C335C4C6808
    @Test()
    public void addWatchedAddresses2WhenCreationTimeNotGreaterThan0() throws IOException {
        /* Branches:
         * (creationTime > 0) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Address> addressList = new ArrayList<>();
            doReturn(0).when(target).addWatchedAddresses(addressList);
            //Act Statement(s)
            int result = target.addWatchedAddresses(addressList, 0L);
            //Assert statement(s)
            assertThat(result, equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).addWatchedAddresses(addressList);
        }
    }

    //Sapient generated method id: ${635a031b-5cb8-3d5d-8c69-05c44935b89d}, hash: F7E96E771D4C81480C23256C43EFA099
    @Test()
    public void addWatchedScriptsWhenAddedGreaterThan0() throws IOException {
        /* Branches:
         * (for-each(scripts)) : true
         * (watchedScripts.contains(script)) : false
         * (!script.creationTime().isPresent()) : true
         * (added > 0) : true
         */
        //Arrange Statement(s)
        Script scriptMock = mock(Script.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(Optional.empty()).when(scriptMock).creationTime();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Script> scriptList = new ArrayList<>();
            scriptList.add(scriptMock);
            doNothing().when(target).queueOnScriptsChanged(scriptList, true);
            doNothing().when(target).saveNow();
            //Act Statement(s)
            int result = target.addWatchedScripts(scriptList);
            //Assert statement(s)
            assertThat(result, equalTo(1));
            assertThat(scriptList.size(), equalTo(1));
            assertThat(scriptList.get(0), is(instanceOf(Script.class)));
            verify(scriptMock).creationTime();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).queueOnScriptsChanged(scriptList, true);
            verify(target).saveNow();
        }
    }

    //Sapient generated method id: ${9800dbdf-2a0d-314a-ab4f-d728834ce7e4}, hash: 9AE942EF76EE33E4FD43119E00EA59C1
    @Test()
    public void removeWatchedAddressWhenRemoveWatchedAddressesCollectionsSingletonListAddress() throws IOException {
        /* Branches:
         * (removeWatchedAddresses(Collections.singletonList(address))) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Address addressMock = mock(Address.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Address> addressList = new ArrayList<>(Arrays.asList(addressMock));
            doReturn(true).when(target).removeWatchedAddresses(addressList);
            //Act Statement(s)
            boolean result = target.removeWatchedAddress(addressMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).removeWatchedAddresses(addressList);
        }
    }

    //Sapient generated method id: ${8d8f4991-a9de-3fe3-aae7-fb1cbe6787fa}, hash: 1ECBE49C646279D836B7FF25DBAA9C84
    @Test()
    public void removeWatchedAddressWhenRemoveWatchedAddressesNotCollectionsSingletonListAddress() throws IOException {
        /* Branches:
         * (removeWatchedAddresses(Collections.singletonList(address))) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Address addressMock = mock(Address.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Address> addressList = new ArrayList<>(Arrays.asList(addressMock));
            doReturn(false).when(target).removeWatchedAddresses(addressList);
            //Act Statement(s)
            boolean result = target.removeWatchedAddress(addressMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).removeWatchedAddresses(addressList);
        }
    }

    //Sapient generated method id: ${72b848ab-f989-39ec-b108-36abd78085cd}, hash: 7F3B559D9A9E98B18FA1726B83C2A554
    @Test()
    public void removeWatchedAddressesWhenRemoveWatchedScriptsScripts() throws IOException {
        /* Branches:
         * (for-each(addresses)) : true
         * (removeWatchedScripts(scripts)) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Script scriptMock = mock(Script.class);
        Address addressMock = mock(Address.class);
        try (MockedStatic<ScriptBuilder> scriptBuilder = mockStatic(ScriptBuilder.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            scriptBuilder.when(() -> ScriptBuilder.createOutputScript(addressMock)).thenReturn(scriptMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Script> scriptList = new ArrayList<>();
            scriptList.add(scriptMock);
            doReturn(true).when(target).removeWatchedScripts(scriptList);
            List<Address> addressList = new ArrayList<>();
            addressList.add(addressMock);
            //Act Statement(s)
            boolean result = target.removeWatchedAddresses(addressList);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            scriptBuilder.verify(() -> ScriptBuilder.createOutputScript(addressMock), atLeast(1));
            verify(target).removeWatchedScripts(scriptList);
        }
    }

    //Sapient generated method id: ${ad9dfe54-eacc-37f1-a22a-e76abea00aa7}, hash: 213C6A4245A23272D781149C21BBF565
    @Test()
    public void removeWatchedAddressesWhenRemoveWatchedScriptsNotScripts() throws IOException {
        /* Branches:
         * (for-each(addresses)) : true
         * (removeWatchedScripts(scripts)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Script scriptMock = mock(Script.class);
        Address addressMock = mock(Address.class);
        try (MockedStatic<ScriptBuilder> scriptBuilder = mockStatic(ScriptBuilder.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            scriptBuilder.when(() -> ScriptBuilder.createOutputScript(addressMock)).thenReturn(scriptMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Script> scriptList = new ArrayList<>();
            scriptList.add(scriptMock);
            doReturn(false).when(target).removeWatchedScripts(scriptList);
            List<Address> addressList = new ArrayList<>();
            addressList.add(addressMock);
            //Act Statement(s)
            boolean result = target.removeWatchedAddresses(addressList);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            scriptBuilder.verify(() -> ScriptBuilder.createOutputScript(addressMock), atLeast(1));
            verify(target).removeWatchedScripts(scriptList);
        }
    }

    //Sapient generated method id: ${578763e7-5274-38f5-921c-0b13aa0791b7}, hash: CB0A5B6A58D80DF9324482920C59ED22
    @Test()
    public void removeWatchedScriptsWhenWatchedScriptsNotContainsScript() throws IOException {
        /* Branches:
         * (for-each(scripts)) : true
         * (!watchedScripts.contains(script)) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Script scriptMock = mock(Script.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Script> scriptList = new ArrayList<>();
            scriptList.add(scriptMock);
            doNothing().when(target).queueOnScriptsChanged(scriptList, false);
            doNothing().when(target).saveNow();
            //Act Statement(s)
            boolean result = target.removeWatchedScripts(scriptList);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).queueOnScriptsChanged(scriptList, false);
            verify(target).saveNow();
        }
    }

    //Sapient generated method id: ${5791389d-74e4-3e3a-86eb-d92f8420c5b3}, hash: 8A15C59657B3C5AF4FE29CD4BB7BA2F3
    @Test()
    public void getWatchedAddressesWhenWatchedScriptsIsEmpty() {
        /* Branches:
         * (for-each(watchedScripts)) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            List<Address> result = target.getWatchedAddresses();
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${b82cbdd5-5b57-3374-80d7-783fcd1ff6af}, hash: E158564BDFDB93874D998FFCC19C4B25
    @Test()
    public void findKeyFromPubKeyHashTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        ECKey eCKeyMock = mock(ECKey.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            byte[] byteArray = new byte[]{};
            doReturn(eCKeyMock).when(keyChainGroupMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2PKH);
            //Act Statement(s)
            ECKey result = target.findKeyFromPubKeyHash(byteArray, ScriptType.P2PKH);
            //Assert statement(s)
            assertThat(result, equalTo(eCKeyMock));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2PKH);
        }
    }

    //Sapient generated method id: ${2359407a-05ae-3534-8362-3aac4ed6bbd1}, hash: E4D091A3971D41881F022CB4CC890ED1
    @Test()
    public void hasKeyWhenKeyChainGroupHasKeyKey() {
        /* Branches:
         * (keyChainGroup.hasKey(key)) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        ECKey eCKeyMock = mock(ECKey.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(true).when(keyChainGroupMock).hasKey(eCKeyMock);
            //Act Statement(s)
            boolean result = target.hasKey(eCKeyMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).hasKey(eCKeyMock);
        }
    }

    //Sapient generated method id: ${f9d3316e-7b30-3091-850b-f7ab7bb7d38c}, hash: 094199300D89493880FD04F6723DB079
    @Test()
    public void hasKeyWhenKeyChainGroupNotHasKeyKey() {
        /* Branches:
         * (keyChainGroup.hasKey(key)) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        ECKey eCKeyMock = mock(ECKey.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(false).when(keyChainGroupMock).hasKey(eCKeyMock);
            //Act Statement(s)
            boolean result = target.hasKey(eCKeyMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).hasKey(eCKeyMock);
        }
    }

    //Sapient generated method id: ${0b535976-31bc-3521-9997-14e2a9b8fbb8}, hash: 758118F4A8F693A7C7E578E84A65BD2F
    @Test()
    public void isAddressMineWhenScriptTypeEqualsScriptTypeP2WPKHAndIsPubKeyHashMineAddressGetHashScriptType() {
        /* Branches:
         * (scriptType == ScriptType.P2PKH) : false
         * (scriptType == ScriptType.P2WPKH) : true
         * (isPubKeyHashMine(address.getHash(), scriptType)) : true
         */
        //Arrange Statement(s)
        Address addressMock = mock(Address.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(ScriptType.P2WPKH).when(addressMock).getOutputScriptType();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(addressMock).getHash();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(true).when(target).isPubKeyHashMine(byteArray, ScriptType.P2WPKH);
            //Act Statement(s)
            boolean result = target.isAddressMine(addressMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            verify(addressMock).getOutputScriptType();
            verify(addressMock).getHash();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).isPubKeyHashMine(byteArray, ScriptType.P2WPKH);
        }
    }

    //Sapient generated method id: ${f7f068b6-225d-3db5-b562-f625cc9a0889}, hash: 3ACD524ADFBA9D7BD8DA708C5F46C281
    @Test()
    public void isAddressMineWhenScriptTypeEqualsScriptTypeP2WPKHAndIsPubKeyHashMineNotAddressGetHashScriptType() {
        /* Branches:
         * (scriptType == ScriptType.P2PKH) : false
         * (scriptType == ScriptType.P2WPKH) : true
         * (isPubKeyHashMine(address.getHash(), scriptType)) : false
         */
        //Arrange Statement(s)
        Address addressMock = mock(Address.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(ScriptType.P2WPKH).when(addressMock).getOutputScriptType();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(addressMock).getHash();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(false).when(target).isPubKeyHashMine(byteArray, ScriptType.P2WPKH);
            //Act Statement(s)
            boolean result = target.isAddressMine(addressMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(addressMock).getOutputScriptType();
            verify(addressMock).getHash();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).isPubKeyHashMine(byteArray, ScriptType.P2WPKH);
        }
    }

    //Sapient generated method id: ${c3ff6d65-7f79-3c1a-9a30-94fd1225da72}, hash: EDDEE593EBEB97525ACEA2900E17888D
    @Test()
    public void isAddressMineWhenIsPayToScriptHashMineAddressGetHash() {
        /* Branches:
         * (scriptType == ScriptType.P2PKH) : false
         * (scriptType == ScriptType.P2WPKH) : false
         * (scriptType == ScriptType.P2SH) : true
         * (isPayToScriptHashMine(address.getHash())) : true
         */
        //Arrange Statement(s)
        Address addressMock = mock(Address.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(ScriptType.P2SH).when(addressMock).getOutputScriptType();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(addressMock).getHash();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(true).when(target).isPayToScriptHashMine(byteArray);
            //Act Statement(s)
            boolean result = target.isAddressMine(addressMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            verify(addressMock).getOutputScriptType();
            verify(addressMock).getHash();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).isPayToScriptHashMine(byteArray);
        }
    }

    //Sapient generated method id: ${034a7a51-6ca6-3098-b7f7-cfd05019221d}, hash: BF841AD03CE39080C6E45FB9D43DF1BD
    @Test()
    public void isAddressMineWhenIsPayToScriptHashMineNotAddressGetHash() {
        /* Branches:
         * (scriptType == ScriptType.P2PKH) : false
         * (scriptType == ScriptType.P2WPKH) : false
         * (scriptType == ScriptType.P2SH) : true
         * (isPayToScriptHashMine(address.getHash())) : false
         */
        //Arrange Statement(s)
        Address addressMock = mock(Address.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(ScriptType.P2SH).when(addressMock).getOutputScriptType();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(addressMock).getHash();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(false).when(target).isPayToScriptHashMine(byteArray);
            //Act Statement(s)
            boolean result = target.isAddressMine(addressMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(addressMock).getOutputScriptType();
            verify(addressMock).getHash();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).isPayToScriptHashMine(byteArray);
        }
    }

    //Sapient generated method id: ${e34eb972-88e0-37a0-b2c7-dd3f1e7696d9}, hash: 126E999D5EFDF61AAE0B0BCCCC626379
    @Test()
    public void isAddressMineWhenScriptTypeEqualsScriptTypeP2TR() {
        /* Branches:
         * (scriptType == ScriptType.P2PKH) : false
         * (scriptType == ScriptType.P2WPKH) : false
         * (scriptType == ScriptType.P2SH) : false
         * (scriptType == ScriptType.P2WSH) : false
         * (scriptType == ScriptType.P2TR) : true
         */
        //Arrange Statement(s)
        Address addressMock = mock(Address.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(ScriptType.P2TR).when(addressMock).getOutputScriptType();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.isAddressMine(addressMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(addressMock).getOutputScriptType();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${d5561695-8fd1-3b7d-82b1-a75b2b1dc295}, hash: D1886BAB8139E841595F28E2C0302C08
    @Test()
    public void isAddressMineWhenScriptTypeNotEqualsScriptTypeP2TRThrowsIllegalArgumentException() {
        /* Branches:
         * (scriptType == ScriptType.P2PKH) : false
         * (scriptType == ScriptType.P2WPKH) : false
         * (scriptType == ScriptType.P2SH) : false
         * (scriptType == ScriptType.P2WSH) : false
         * (scriptType == ScriptType.P2TR) : false
         */
        //Arrange Statement(s)
        Address addressMock = mock(Address.class, "isAddressMine_address1");
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(ScriptType.P2PK).when(addressMock).getOutputScriptType();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("isAddressMine_address1");
            thrown.expect(IllegalArgumentException.class);
            thrown.expectMessage(illegalArgumentException.getMessage());
            //Act Statement(s)
            target.isAddressMine(addressMock);
            //Assert statement(s)
            verify(addressMock).getOutputScriptType();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${801f4dad-cb95-3c5f-82ff-4bf550591b3e}, hash: C6FB47DE72CAA547AFE949A7D7BFD9B3
    @Test()
    public void isPubKeyHashMineWhenFindKeyFromPubKeyHashPubKeyHashScriptTypeIsNotNull() {
        /* Branches:
         * (findKeyFromPubKeyHash(pubKeyHash, scriptType) != null) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        ECKey eCKeyMock = mock(ECKey.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            byte[] byteArray = new byte[]{};
            doReturn(eCKeyMock).when(keyChainGroupMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2PKH);
            //Act Statement(s)
            boolean result = target.isPubKeyHashMine(byteArray, ScriptType.P2PKH);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2PKH);
        }
    }

    //Sapient generated method id: ${686b8425-8e23-31d1-85c4-84f989ad296e}, hash: 31D3855AB097752F123F51EFD852713A
    @Test()
    public void isPubKeyHashMineWhenFindKeyFromPubKeyHashPubKeyHashScriptTypeIsNull() {
        /* Branches:
         * (findKeyFromPubKeyHash(pubKeyHash, scriptType) != null) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            byte[] byteArray = new byte[]{};
            doReturn(null).when(keyChainGroupMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2PKH);
            //Act Statement(s)
            boolean result = target.isPubKeyHashMine(byteArray, ScriptType.P2PKH);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2PKH);
        }
    }

    //Sapient generated method id: ${5586b0d2-88b2-32ee-8641-e4b709523b78}, hash: 24A50425FE9807C5F2A407058646E0BD
    @Test()
    public void isWatchedScriptTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Script scriptMock = mock(Script.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.isWatchedScript(scriptMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${96d47c1b-1eb9-3cd2-ab53-fd6e1884a048}, hash: 03F9DB493D283CA78714AC76AC9205E9
    @Test()
    public void findKeyFromAddressWhenScriptTypeEqualsScriptTypeP2WPKH() {
        /* Branches:
         * (scriptType == ScriptType.P2PKH) : false
         * (scriptType == ScriptType.P2WPKH) : true
         */
        //Arrange Statement(s)
        Address addressMock = mock(Address.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        ECKey eCKeyMock = mock(ECKey.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(ScriptType.P2WPKH).when(addressMock).getOutputScriptType();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(addressMock).getHash();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(eCKeyMock).when(keyChainGroupMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2WPKH);
            //Act Statement(s)
            ECKey result = target.findKeyFromAddress(addressMock);
            //Assert statement(s)
            assertThat(result, equalTo(eCKeyMock));
            verify(addressMock).getOutputScriptType();
            verify(addressMock).getHash();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2WPKH);
        }
    }

    //Sapient generated method id: ${4d61792b-8b43-3aa1-8540-4c734796be23}, hash: 99F946C93A946D0158AF63B27A7DE994
    @Test()
    public void findKeyFromAddressWhenScriptTypeNotEqualsScriptTypeP2WPKH() {
        /* Branches:
         * (scriptType == ScriptType.P2PKH) : false
         * (scriptType == ScriptType.P2WPKH) : false
         */
        //Arrange Statement(s)
        Address addressMock = mock(Address.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(ScriptType.P2PK).when(addressMock).getOutputScriptType();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            ECKey result = target.findKeyFromAddress(addressMock);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            verify(addressMock).getOutputScriptType();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${f3262d68-f653-32db-9e91-cc2045869e94}, hash: 60C6CFC4B0F48178E986EC97551F598D
    @Test()
    public void findKeyFromPubKeyTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        ECKey eCKeyMock = mock(ECKey.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            byte[] byteArray = new byte[]{};
            doReturn(eCKeyMock).when(keyChainGroupMock).findKeyFromPubKey(byteArray);
            //Act Statement(s)
            ECKey result = target.findKeyFromPubKey(byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(eCKeyMock));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).findKeyFromPubKey(byteArray);
        }
    }

    //Sapient generated method id: ${00cf4323-1042-3cb4-8b88-4e29da2b7f86}, hash: 7D83F6A75ADF0253CB799AD143B49595
    @Test()
    public void isPubKeyMineWhenFindKeyFromPubKeyPubKeyIsNotNull() {
        /* Branches:
         * (findKeyFromPubKey(pubKey) != null) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        ECKey eCKeyMock = mock(ECKey.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            byte[] byteArray = new byte[]{};
            doReturn(eCKeyMock).when(keyChainGroupMock).findKeyFromPubKey(byteArray);
            //Act Statement(s)
            boolean result = target.isPubKeyMine(byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).findKeyFromPubKey(byteArray);
        }
    }

    //Sapient generated method id: ${b0b912ab-d732-3b4a-aea1-6b8c0b06c3a9}, hash: B557902FD5DE2901B9F245C67AF1DF72
    @Test()
    public void isPubKeyMineWhenFindKeyFromPubKeyPubKeyIsNull() {
        /* Branches:
         * (findKeyFromPubKey(pubKey) != null) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            byte[] byteArray = new byte[]{};
            doReturn(null).when(keyChainGroupMock).findKeyFromPubKey(byteArray);
            //Act Statement(s)
            boolean result = target.isPubKeyMine(byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).findKeyFromPubKey(byteArray);
        }
    }

    //Sapient generated method id: ${ec5d330d-6bd5-3135-b8e9-93225f40d2e9}, hash: B0798621E332244C50EA9A3F52762D01
    @Test()
    public void findRedeemDataFromScriptHashTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        RedeemData redeemDataMock = mock(RedeemData.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            byte[] byteArray = new byte[]{};
            doReturn(redeemDataMock).when(keyChainGroupMock).findRedeemDataFromScriptHash(byteArray);
            //Act Statement(s)
            RedeemData result = target.findRedeemDataFromScriptHash(byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(redeemDataMock));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).findRedeemDataFromScriptHash(byteArray);
        }
    }

    //Sapient generated method id: ${12dd23c4-cc42-3533-a4b2-f1f97746a987}, hash: EACD13D26A24E80412273302939A2001
    @Test()
    public void isPayToScriptHashMineWhenFindRedeemDataFromScriptHashPayToScriptHashIsNotNull() {
        /* Branches:
         * (findRedeemDataFromScriptHash(payToScriptHash) != null) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        RedeemData redeemDataMock = mock(RedeemData.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            byte[] byteArray = new byte[]{};
            doReturn(redeemDataMock).when(keyChainGroupMock).findRedeemDataFromScriptHash(byteArray);
            //Act Statement(s)
            boolean result = target.isPayToScriptHashMine(byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).findRedeemDataFromScriptHash(byteArray);
        }
    }

    //Sapient generated method id: ${76ddc0d2-2fff-3698-8ff8-965f8375453a}, hash: 854D412239388E9FBF8AAF4953DCFF22
    @Test()
    public void isPayToScriptHashMineWhenFindRedeemDataFromScriptHashPayToScriptHashIsNull() {
        /* Branches:
         * (findRedeemDataFromScriptHash(payToScriptHash) != null) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            byte[] byteArray = new byte[]{};
            doReturn(null).when(keyChainGroupMock).findRedeemDataFromScriptHash(byteArray);
            //Act Statement(s)
            boolean result = target.isPayToScriptHashMine(byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).findRedeemDataFromScriptHash(byteArray);
        }
    }

    //Sapient generated method id: ${6e5dcb9a-d039-34cf-80f6-d96c69468fb9}, hash: E7C0320DFB1DCCFB29DC1E844DA15AD1
    @Ignore()
    @Test()
    public void getKeyChainSeedWhenSeedIsNullThrowsECKeyMissingPrivateKeyException() {
        /* Branches:
         * (seed == null) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            DeterministicKeyChain deterministicKeyChain = DeterministicKeyChain.builder().seed((DeterministicSeed) null).build();
            doReturn(deterministicKeyChain).when(keyChainGroupMock).getActiveKeyChain();
            thrown.expect(ECKey.MissingPrivateKeyException.class);
            //Act Statement(s)
            target.getKeyChainSeed();
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).getActiveKeyChain();
        }
    }

    //Sapient generated method id: ${0dc72140-0ac2-3f4f-b1df-6b697a67dc7f}, hash: 76C7CAB3E275264C7B230D07EC7240B8
    @Ignore()
    @Test()
    public void getKeyChainSeedWhenSeedIsNotNull() {
        /* Branches:
         * (seed == null) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        DeterministicSeed deterministicSeedMock = mock(DeterministicSeed.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            DeterministicKeyChain deterministicKeyChain = DeterministicKeyChain.builder().seed(deterministicSeedMock).build();
            doReturn(deterministicKeyChain).when(keyChainGroupMock).getActiveKeyChain();
            //Act Statement(s)
            DeterministicSeed result = target.getKeyChainSeed();
            //Assert statement(s)
            assertThat(result, equalTo(deterministicSeedMock));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).getActiveKeyChain();
        }
    }

    //Sapient generated method id: ${7fa8385f-b24a-3256-a524-6c5be821ba0f}, hash: C8A54BF2E36B861730153E5CC1BBA17F
    @Test()
    public void getKeyByPathTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        DeterministicKeyChain deterministicKeyChainMock = mock(DeterministicKeyChain.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(deterministicKeyChainMock).when(keyChainGroupMock).getActiveKeyChain();
            List<ChildNumber> childNumberList = new ArrayList<>();
            doReturn(deterministicKeyMock).when(deterministicKeyChainMock).getKeyByPath(childNumberList, false);
            //Act Statement(s)
            DeterministicKey result = target.getKeyByPath(childNumberList);
            //Assert statement(s)
            assertThat(result, equalTo(deterministicKeyMock));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).getActiveKeyChain();
            verify(deterministicKeyChainMock).getKeyByPath(childNumberList, false);
        }
    }

    //Sapient generated method id: ${1b8819ab-29ce-3ea9-8d0c-17aec2d6595c}, hash: B879380113F7A52C4AEB31F38A322127
    @Test()
    public void encryptTest() throws KeyCrypterException, IOException {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(keyChainGroupMock).encrypt((KeyCrypter) any(), (AesKey) any());
            doNothing().when(target).saveNow();
            //Act Statement(s)
            target.encrypt((CharSequence) "encrypt_charSequence1");
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).encrypt((KeyCrypter) any(), (AesKey) any());
            verify(target).saveNow();
        }
    }

    //Sapient generated method id: ${4140c4be-54e8-37bb-b768-108c4f6ace7d}, hash: D140DE6E3BDBB1DF18F4BD4DFFA25B93
    @Test()
    public void encrypt1Test() throws IOException {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class);
        AesKey aesKeyMock = mock(AesKey.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(keyChainGroupMock).encrypt(keyCrypterMock, aesKeyMock);
            doNothing().when(target).saveNow();
            //Act Statement(s)
            target.encrypt(keyCrypterMock, aesKeyMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).encrypt(keyCrypterMock, aesKeyMock);
            verify(target).saveNow();
        }
    }

    //Sapient generated method id: ${7b958588-ead8-3acf-aca8-8c01cdf340be}, hash: 66F7A81E1645527BCA6A213A7687C5EB
    @Test()
    public void decryptWhenCrypterIsNotNull() throws BadWalletEncryptionKeyException, KeyCrypterException, IOException {
        /* Branches:
         * (crypter != null) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class);
        AesKey aesKeyMock = mock(AesKey.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(keyCrypterMock).when(keyChainGroupMock).getKeyCrypter();
            doReturn(aesKeyMock).when(keyCrypterMock).deriveKey("decrypt_charSequence1");
            doNothing().when(keyChainGroupMock).decrypt(aesKeyMock);
            doNothing().when(target).saveNow();
            //Act Statement(s)
            target.decrypt("decrypt_charSequence1");
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).getKeyCrypter();
            verify(keyCrypterMock).deriveKey("decrypt_charSequence1");
            verify(keyChainGroupMock).decrypt(aesKeyMock);
            verify(target).saveNow();
        }
    }

    //Sapient generated method id: ${39a547d1-6671-3486-bfa7-f691c12d23af}, hash: F6793D41376125DEF42A368E78471152
    @Test()
    public void decryptWhenCrypterIsNullThrowsIllegalStateException() throws BadWalletEncryptionKeyException {
        /* Branches:
         * (crypter != null) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(null).when(keyChainGroupMock).getKeyCrypter();
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.decrypt("decrypt_charSequence1");
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).getKeyCrypter();
        }
    }

    //Sapient generated method id: ${e6c3d614-f8c3-3f9e-9e51-cde296d4c982}, hash: 05CA01E7F583CCE0EB2AADBB50C80249
    @Test()
    public void decryptWhenCaughtKeyCrypterExceptionInvalidCipherTextOrKeyCrypterExceptionPuThrowsWalletBadWalletEncryptionKeyException() throws BadWalletEncryptionKeyException, KeyCrypterException {
        /* Branches:
         * (crypter != null) : true
         * (catch-exception (KeyCrypterException.InvalidCipherText | KeyCrypterException.PublicPrivateMismatch)) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class);
        AesKey aesKeyMock = mock(AesKey.class);
        KeyCrypterException.InvalidCipherText keyCrypterExceptionInvalidCipherTextMock = mock(KeyCrypterException.InvalidCipherText.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(keyCrypterMock).when(keyChainGroupMock).getKeyCrypter();
            doReturn(aesKeyMock).when(keyCrypterMock).deriveKey("decrypt_charSequence1");
            doThrow(keyCrypterExceptionInvalidCipherTextMock).when(keyChainGroupMock).decrypt(aesKeyMock);
            thrown.expect(Wallet.BadWalletEncryptionKeyException.class);
            //Act Statement(s)
            target.decrypt("decrypt_charSequence1");
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).getKeyCrypter();
            verify(keyCrypterMock).deriveKey("decrypt_charSequence1");
            verify(keyChainGroupMock).decrypt(aesKeyMock);
        }
    }

    //Sapient generated method id: ${f69ccd1b-5de2-3f21-a7c3-2f61642e3db9}, hash: 8BA06431407493040D1830EEA9B252F0
    @Test()
    public void decrypt1Test() throws BadWalletEncryptionKeyException, IOException {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        AesKey aesKeyMock = mock(AesKey.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(keyChainGroupMock).decrypt(aesKeyMock);
            doNothing().when(target).saveNow();
            //Act Statement(s)
            target.decrypt(aesKeyMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).decrypt(aesKeyMock);
            verify(target).saveNow();
        }
    }

    //Sapient generated method id: ${0cd497b8-0321-3e47-827f-1d35c5acc69a}, hash: 9CB38AF8768A78043C8BB8074135B2F4
    @Test()
    public void decrypt1WhenCaughtKeyCrypterExceptionInvalidCipherTextOrKeyCrypterExceptionPThrowsWalletBadWalletEncryptionKeyException() throws BadWalletEncryptionKeyException {
        /* Branches:
         * (catch-exception (KeyCrypterException.InvalidCipherText | KeyCrypterException.PublicPrivateMismatch)) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        KeyCrypterException.InvalidCipherText keyCrypterExceptionInvalidCipherTextMock = mock(KeyCrypterException.InvalidCipherText.class);
        AesKey aesKeyMock = mock(AesKey.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doThrow(keyCrypterExceptionInvalidCipherTextMock).when(keyChainGroupMock).decrypt(aesKeyMock);
            thrown.expect(Wallet.BadWalletEncryptionKeyException.class);
            //Act Statement(s)
            target.decrypt(aesKeyMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).decrypt(aesKeyMock);
        }
    }

    //Sapient generated method id: ${1dfa0dd9-ef33-3b57-9b67-8031d17578a0}, hash: 7D8535A4ABA0249CF63F88FFA363EA23
    @Test()
    public void checkPasswordWhenKeyChainGroupCheckPasswordPassword() {
        /* Branches:
         * (keyChainGroup.checkPassword(password)) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(true).when(keyChainGroupMock).checkPassword("checkPassword_charSequence1");
            //Act Statement(s)
            boolean result = target.checkPassword("checkPassword_charSequence1");
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).checkPassword("checkPassword_charSequence1");
        }
    }

    //Sapient generated method id: ${218f0f54-9851-3e69-8255-fb9e9b578f30}, hash: A06503E9F11B9C13CFE6177E42E1B3D3
    @Test()
    public void checkPasswordWhenKeyChainGroupNotCheckPasswordPassword() {
        /* Branches:
         * (keyChainGroup.checkPassword(password)) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(false).when(keyChainGroupMock).checkPassword("checkPassword_charSequence1");
            //Act Statement(s)
            boolean result = target.checkPassword("checkPassword_charSequence1");
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).checkPassword("checkPassword_charSequence1");
        }
    }

    //Sapient generated method id: ${335b7c20-47b6-3580-99be-64861c3c5acb}, hash: F05BE6E66F68D67AA3F5331FF172C901
    @Test()
    public void checkAESKeyWhenKeyChainGroupCheckAESKeyAesKey() {
        /* Branches:
         * (keyChainGroup.checkAESKey(aesKey)) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        AesKey aesKeyMock = mock(AesKey.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(true).when(keyChainGroupMock).checkAESKey(aesKeyMock);
            //Act Statement(s)
            boolean result = target.checkAESKey(aesKeyMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).checkAESKey(aesKeyMock);
        }
    }

    //Sapient generated method id: ${093b19df-1e71-385a-965b-b072cc3f5cad}, hash: 8BEB6193A6AD254C5BE33D161E6AAD40
    @Test()
    public void checkAESKeyWhenKeyChainGroupNotCheckAESKeyAesKey() {
        /* Branches:
         * (keyChainGroup.checkAESKey(aesKey)) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        AesKey aesKeyMock = mock(AesKey.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(false).when(keyChainGroupMock).checkAESKey(aesKeyMock);
            //Act Statement(s)
            boolean result = target.checkAESKey(aesKeyMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).checkAESKey(aesKeyMock);
        }
    }

    //Sapient generated method id: ${5263e1c8-6ee4-3528-9e17-7641d8067bcf}, hash: 5B2C3F89756BF542C93871624B332F2A
    @Test()
    public void getKeyCrypterTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(keyCrypterMock).when(keyChainGroupMock).getKeyCrypter();
            //Act Statement(s)
            KeyCrypter result = target.getKeyCrypter();
            //Assert statement(s)
            assertThat(result, equalTo(keyCrypterMock));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).getKeyCrypter();
        }
    }

    //Sapient generated method id: ${f575e4ba-c9ae-3c76-830c-e6c119fd41ee}, hash: F9467D11899D59BD2FC98098E0D77A96
    @Test()
    public void getEncryptionTypeWhenCrypterIsNotNull() {
        /* Branches:
         * (crypter != null) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(keyCrypterMock).when(keyChainGroupMock).getKeyCrypter();
            doReturn(Protos.Wallet.EncryptionType.UNENCRYPTED).when(keyCrypterMock).getUnderstoodEncryptionType();
            //Act Statement(s)
            Protos.Wallet.EncryptionType result = target.getEncryptionType();
            //Assert statement(s)
            assertThat(result, equalTo(Protos.Wallet.EncryptionType.UNENCRYPTED));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).getKeyCrypter();
            verify(keyCrypterMock).getUnderstoodEncryptionType();
        }
    }

    //Sapient generated method id: ${b3434f94-b066-3631-896c-8b47ffaae928}, hash: 73F26A2981D1BD877D76903B63A9FB74
    @Test()
    public void getEncryptionTypeWhenCrypterIsNull() {
        /* Branches:
         * (crypter != null) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(null).when(keyChainGroupMock).getKeyCrypter();
            //Act Statement(s)
            Protos.Wallet.EncryptionType result = target.getEncryptionType();
            //Assert statement(s)
            assertThat(result, equalTo(Protos.Wallet.EncryptionType.UNENCRYPTED));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).getKeyCrypter();
        }
    }

    //Sapient generated method id: ${f0a3e76a-01cf-35e1-8f33-3ddfaa9a0cbf}, hash: FC032837E3AD41A5D24C7DF8DF0019BF
    @Test()
    public void isEncryptedWhenGetEncryptionTypeNotEqualsEncryptionTypeUNENCRYPTED() {
        /* Branches:
         * (getEncryptionType() != EncryptionType.UNENCRYPTED) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(Protos.Wallet.EncryptionType.ENCRYPTED_SCRYPT_AES).when(target).getEncryptionType();
            //Act Statement(s)
            boolean result = target.isEncrypted();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).getEncryptionType();
        }
    }

    //Sapient generated method id: ${8cc544d6-598f-3b72-bdd8-c629144615f0}, hash: D9F3C6DDFAB0D692FF3376B290AAD060
    @Test()
    public void isEncryptedWhenGetEncryptionTypeEqualsEncryptionTypeUNENCRYPTED() {
        /* Branches:
         * (getEncryptionType() != EncryptionType.UNENCRYPTED) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(Protos.Wallet.EncryptionType.UNENCRYPTED).when(target).getEncryptionType();
            //Act Statement(s)
            boolean result = target.isEncrypted();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).getEncryptionType();
        }
    }

    //Sapient generated method id: ${3a9cb472-fe81-3961-b913-f55201eddcc3}, hash: 310DDCB0E80FD106B47DC91A99F9C081
    @Test()
    public void changeEncryptionPasswordTest() throws BadWalletEncryptionKeyException, IOException {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).decrypt("changeEncryptionPassword_charSequence1");
            doNothing().when(target).encrypt("changeEncryptionPassword_charSequence2");
            //Act Statement(s)
            target.changeEncryptionPassword("changeEncryptionPassword_charSequence1", "changeEncryptionPassword_charSequence2");
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).decrypt("changeEncryptionPassword_charSequence1");
            verify(target).encrypt("changeEncryptionPassword_charSequence2");
        }
    }

    //Sapient generated method id: ${e1f50b8f-33be-3d68-9ed9-76b4c8b88e20}, hash: 5BDA4F8850FE95180A67D3D3B33090FF
    @Test()
    public void changeEncryptionKeyTest() throws BadWalletEncryptionKeyException, IOException {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        AesKey aesKeyMock = mock(AesKey.class);
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class);
        AesKey aesKeyMock2 = mock(AesKey.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).decrypt(aesKeyMock);
            doNothing().when(target).encrypt(keyCrypterMock, aesKeyMock2);
            //Act Statement(s)
            target.changeEncryptionKey(keyCrypterMock, aesKeyMock, aesKeyMock2);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).decrypt(aesKeyMock);
            verify(target).encrypt(keyCrypterMock, aesKeyMock2);
        }
    }

    //Sapient generated method id: ${4e6869be-fd6b-3f42-912a-763969cb12d3}, hash: 6409DFBBADAE557A538E4DD15DB4FCF3
    @Test()
    public void serializeKeyChainGroupToProtobufTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            doReturn(protosKeyList).when(keyChainGroupMock).serializeToProtobuf();
            //Act Statement(s)
            List<Protos.Key> result = target.serializeKeyChainGroupToProtobuf();
            //Assert statement(s)
            assertThat(result, equalTo(protosKeyList));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).serializeToProtobuf();
        }
    }

    //Sapient generated method id: ${9195e82a-70a5-3558-99ef-fec993f54cec}, hash: E3D31DDD66436793D419A95619F25F76
    @Test()
    public void serializeKeyChainGroupToProtobufInternalTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Protos.Key> protosKeyList = new ArrayList<>();
            doReturn(protosKeyList).when(keyChainGroupMock).serializeToProtobuf();
            //Act Statement(s)
            List<Protos.Key> result = target.serializeKeyChainGroupToProtobufInternal();
            //Assert statement(s)
            assertThat(result, equalTo(protosKeyList));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).serializeToProtobuf();
        }
    }

    //Sapient generated method id: ${75183e59-4788-3632-8f8c-f74ae117e4b4}, hash: C61C53C6FE44ED49288B36EDD0624350
    @Ignore()
    @Test()
    public void saveToFileWhenTempParentFileNotExistsThrowsFileNotFoundException() throws IOException {
        /* Branches:
         * (!tempParentFile.exists()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            FileNotFoundException fileNotFoundException = new FileNotFoundException("A (wallet directory not found)");
            thrown.expect(FileNotFoundException.class);
            thrown.expectMessage(fileNotFoundException.getMessage());
            File file = new File("pathname1");
            File file2 = new File("pathname1");
            //Act Statement(s)
            target.saveToFile(file, file2);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${9dc740f5-1fbb-3ca5-bcf3-1d61da00e8cc}, hash: D6DDB457C5F4122D59F77F3190DB6A06
    @Ignore()
    @Test()
    public void saveToFileWhenTempFileNotRenameToDestFileThrowsIOException() throws IOException {
        /* Branches:
         * (!tempParentFile.exists()) : false
         * (!destParentFile.exists()) : false
         * (PlatformUtils.isWindows()) : false
         * (!tempFile.renameTo(destFile)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: stream, object of type FileDescriptor
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Network networkMock2 = mock(Network.class);
        try (MockedStatic<PlatformUtils> platformUtils = mockStatic(PlatformUtils.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class, CALLS_REAL_METHODS)) {
            ReentrantLock reentrantLock = Threading.lock("Wallet-KeyChainGroup lock");
            threading.when(() -> Threading.lock("Wallet-KeyChainGroup lock")).thenReturn(reentrantLock);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            platformUtils.when(() -> PlatformUtils.isWindows()).thenReturn(false);
            KeyChainGroup keyChainGroup = KeyChainGroup.createBasic(networkMock2);
            target = spy(new Wallet(networkMock, keyChainGroup));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).saveToFileStream((FileOutputStream) any());
            IOException iOException = new IOException("Failed to rename pathname1 to pathname1");
            thrown.expect(IOException.class);
            thrown.expectMessage(iOException.getMessage());
            File file = new File("pathname1");
            File file2 = new File("pathname1");
            //Act Statement(s)
            target.saveToFile(file, file2);
            //Assert statement(s)
            threading.verify(() -> Threading.lock("Wallet-KeyChainGroup lock"), atLeast(1));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            platformUtils.verify(() -> PlatformUtils.isWindows(), atLeast(1));
            verify(target, atLeast(1)).saveToFileStream((FileOutputStream) any());
        }
    }

    //Sapient generated method id: ${91efb0ad-10e2-3aab-98c0-398908e63f97}, hash: 207FD03E0B9CFFEB6DF992FF6ABDD3C5
    @Ignore()
    @Test()
    public void saveToFileWhenCaughtRuntimeExceptionThrowsRuntimeException() throws IOException {
        /* Branches:
         * (!tempParentFile.exists()) : false
         * (!destParentFile.exists()) : false
         * (PlatformUtils.isWindows()) : false
         * (catch-exception (RuntimeException)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: stream, object of type FileDescriptor
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Network networkMock2 = mock(Network.class);
        try (MockedStatic<PlatformUtils> platformUtils = mockStatic(PlatformUtils.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class, CALLS_REAL_METHODS)) {
            ReentrantLock reentrantLock = Threading.lock("Wallet-KeyChainGroup lock");
            threading.when(() -> Threading.lock("Wallet-KeyChainGroup lock")).thenReturn(reentrantLock);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            platformUtils.when(() -> PlatformUtils.isWindows()).thenReturn(false);
            KeyChainGroup keyChainGroup = KeyChainGroup.createBasic(networkMock2);
            target = spy(new Wallet(networkMock, keyChainGroup));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).saveToFileStream((FileOutputStream) any());
            thrown.expect(RuntimeException.class);
            File file = new File("pathname1");
            File file2 = new File("pathname1");
            //Act Statement(s)
            target.saveToFile(file, file2);
            //Assert statement(s)
            threading.verify(() -> Threading.lock("Wallet-KeyChainGroup lock"), atLeast(1));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            platformUtils.verify(() -> PlatformUtils.isWindows(), atLeast(1));
            verify(target, atLeast(1)).saveToFileStream((FileOutputStream) any());
        }
    }

    //Sapient generated method id: ${5cbe7a21-ac96-3c73-a212-7e322d7af657}, hash: F7D5168137BAF1B63054EE34E2C79983
    @Ignore()
    @Test()
    public void saveToFileWhenTempFileExists() throws IOException {
        /* Branches:
         * (!tempParentFile.exists()) : false
         * (!destParentFile.exists()) : false
         * (PlatformUtils.isWindows()) : false
         * (!tempFile.renameTo(destFile)) : false
         * (stream != null) : false
         * (tempFile.exists()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: stream
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).saveToFileStream((FileOutputStream) any());
            File file = new File("pathname1");
            File file2 = new File("pathname1");
            //Act Statement(s)
            target.saveToFile(file, file2);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).saveToFileStream((FileOutputStream) any());
        }
    }

    //Sapient generated method id: ${e9f33700-5478-3c76-92fa-6c288b562942}, hash: 195EA5873015D167AD36FB5D1B73B0BB
    @Ignore()
    @Test()
    public void saveToFile1WhenDirectoryNotExistsThrowsFileNotFoundException() throws IOException {
        /* Branches:
         * (!directory.exists()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class, "CoinSelector");
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class, CALLS_REAL_METHODS)) {
            ReentrantLock reentrantLock = Threading.lock("Wallet-KeyChainGroup lock");
            threading.when(() -> Threading.lock("Wallet-KeyChainGroup lock")).thenReturn(reentrantLock);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            FileNotFoundException fileNotFoundException = new FileNotFoundException("A (wallet directory not found)");
            thrown.expect(FileNotFoundException.class);
            thrown.expectMessage(fileNotFoundException.getMessage());
            File file = new File("pathname1");
            //Act Statement(s)
            target.saveToFile(file);
            //Assert statement(s)
            threading.verify(() -> Threading.lock("Wallet-KeyChainGroup lock"), atLeast(1));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${d333f9eb-6449-3c58-8a10-ce272dce72d6}, hash: 8DC182DE3AF7625B5067B8DFBFF20533
    @Ignore()
    @Test()
    public void saveToFile1WhenDirectoryExists() throws IOException {
        /* Branches:
         * (!directory.exists()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class, "DefaultCoinSelector");
        Network networkMock2 = mock(Network.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class, CALLS_REAL_METHODS)) {
            ReentrantLock reentrantLock = Threading.lock("Wallet-KeyChainGroup lock");
            threading.when(() -> Threading.lock("Wallet-KeyChainGroup lock")).thenReturn(reentrantLock);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            KeyChainGroup keyChainGroup = KeyChainGroup.createBasic(networkMock2);
            target = spy(new Wallet(networkMock, keyChainGroup));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            File file = new File("pathname1");
            File file2 = new File("pathname1");
            doNothing().when(target).saveToFile(file, file2);
            //Act Statement(s)
            target.saveToFile(file2);
            //Assert statement(s)
            threading.verify(() -> Threading.lock("Wallet-KeyChainGroup lock"), atLeast(1));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target, atLeast(1)).saveToFile(file, file2);
        }
    }

    //Sapient generated method id: ${8ab96e2d-636a-3889-8d6f-ed9937cada76}, hash: 60E0BB3C09A737DC8AD86E3D1E90B4BF
    @Test()
    public void setAcceptRiskyTransactionsTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.setAcceptRiskyTransactions(false);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${6d8e2a6b-90cf-3b3f-a038-ddc13490aaa9}, hash: C4C0278CD8F1690B7380F6FE756F5068
    @Test()
    public void isAcceptRiskyTransactionsTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.isAcceptRiskyTransactions();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${8c473d3a-8daa-31f0-8f1e-ac891c824c6d}, hash: 6521DBE9082F1B2CCB1B4E684994189E
    @Test()
    public void setRiskAnalyzerTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        RiskAnalysis.Analyzer riskAnalysisAnalyzerMock = mock(RiskAnalysis.Analyzer.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.setRiskAnalyzer(riskAnalysisAnalyzerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${f39d103d-5e90-31b0-a792-faf7050d25fa}, hash: 68DEE6B97EEE716CC623F24D79B232A7
    @Test()
    public void getRiskAnalyzerTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            RiskAnalysis.Analyzer result = target.getRiskAnalyzer();
            //Assert statement(s)
            assertThat(result, equalTo(riskAnalyzerMock));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${b285f83a-658d-34c2-b0f9-b8910d3b181e}, hash: E50F856D9F174A2086C0FD5763D68579
    @Test()
    public void autosaveToFileWhenEventListenerIsNotNull() {
        /* Branches:
         * (vFileManager == null) : true
         * (eventListener != null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: manager
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        WalletFiles.Listener walletFilesListenerMock = mock(WalletFiles.Listener.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            File file = new File("pathname1");
            Duration duration = Duration.ofDays(0L);
            //Act Statement(s)
            WalletFiles result = target.autosaveToFile(file, duration, walletFilesListenerMock);
            //Assert statement(s)
            //TODO: Please implement equals method in WalletFiles for verification of the entire object or you need to adjust respective assertion statements
            assertThat(result, is(notNullValue()));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${9085916a-a187-337f-8ea4-d894d92b73a3}, hash: 92A8E20A0EFA321B14905BC9B94877C0
    @Test()
    public void autosaveToFile1Test() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        WalletFiles walletFilesMock = mock(WalletFiles.class);
        WalletFiles.Listener walletFilesListenerMock = mock(WalletFiles.Listener.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            File file = new File("pathname1");
            doReturn(walletFilesMock).when(target).autosaveToFile(eq(file), (Duration) any(), eq(walletFilesListenerMock));
            //Act Statement(s)
            WalletFiles result = target.autosaveToFile(file, 0L, TimeUnit.NANOSECONDS, walletFilesListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(walletFilesMock));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).autosaveToFile(eq(file), (Duration) any(), eq(walletFilesListenerMock));
        }
    }

    //Sapient generated method id: ${9fe94360-cb3e-314b-b2ed-1b9dfd9df92e}, hash: BCA8612E3CBDA538D3B298A2F2048DFB
    @Test()
    public void shutdownAutosaveAndWaitWhenFilesIsNullThrowsIllegalStateException() {
        /* Branches:
         * (files != null) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.shutdownAutosaveAndWait();
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${5e489d6e-48b0-37d4-921e-850ac77e6461}, hash: F0BEF7FA472DDF72479AF06548DAF1CA
    @Test()
    public void saveLaterWhenFilesIsNull() {
        /* Branches:
         * (files != null) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.saveLater();
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${a44bb7dd-2fd0-378d-8b49-bc75e2357b06}, hash: 6B2AA913B469A325FFBE07D3C4CB32AE
    @Test()
    public void saveNowWhenFilesIsNull() throws IOException {
        /* Branches:
         * (files != null) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.saveNow();
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${5a90b31a-515a-391f-b9fd-0033d81f2d83}, hash: 131730DA0079D3CE4F38678E4D4E5A49
    @Ignore()
    @Test()
    public void saveToFileStreamTest() throws IOException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type WalletProtobufSerializer
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            //Act Statement(s)
            target.saveToFileStream(byteArrayOutputStream);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${b9a9751e-e0d1-388c-97a1-33a8c0975f08}, hash: 2742E8C59197CC855DB6441C3829C4BD
    @Test()
    public void loadFromFileTest() throws Throwable, IOException {
        //Arrange Statement(s)
        Wallet walletMock = mock(Wallet.class);
        try (MockedStatic<Wallet> wallet = mockStatic(Wallet.class, CALLS_REAL_METHODS)) {
            File file = new File("pathname1");
            WalletProtobufSerializer.WalletFactory walletFactory = WalletProtobufSerializer.WalletFactory.DEFAULT;
            WalletExtension[] walletExtensionArray = new WalletExtension[]{};
            wallet.when(() -> Wallet.loadFromFile(file, walletFactory, false, false, walletExtensionArray)).thenReturn(walletMock);
            //Act Statement(s)
            Wallet result = Wallet.loadFromFile(file, walletExtensionArray);
            //Assert statement(s)
            assertThat(result, equalTo(walletMock));
            wallet.verify(() -> Wallet.loadFromFile(file, walletFactory, false, false, walletExtensionArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${fb27b2b7-a579-3cff-8e95-024bf0d64f5c}, hash: AAFDCA88B9BDE3CE99D953D749AF7E6F
    @Ignore()
    @Test()
    public void loadFromFile1Test() throws Throwable, IOException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Wallet walletMock = mock(Wallet.class);
        WalletProtobufSerializer.WalletFactory walletProtobufSerializerWalletFactoryMock = mock(WalletProtobufSerializer.WalletFactory.class, "example_factory");
        try (MockedStatic<Wallet> wallet = mockStatic(Wallet.class, CALLS_REAL_METHODS)) {
            FileInputStream fileInputStream = mock(FileInputStream.class);
            WalletExtension[] walletExtensionArray = new WalletExtension[]{};
            wallet.when(() -> Wallet.loadFromFileStream(fileInputStream, walletProtobufSerializerWalletFactoryMock, true, false, walletExtensionArray)).thenReturn(walletMock);
            File file = new File("pathname1");
            //Act Statement(s)
            Wallet result = Wallet.loadFromFile(file, walletProtobufSerializerWalletFactoryMock, true, false, walletExtensionArray);
            //Assert statement(s)
            assertThat(result, equalTo(walletMock));
            wallet.verify(() -> Wallet.loadFromFileStream(fileInputStream, walletProtobufSerializerWalletFactoryMock, true, false, walletExtensionArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${6d266a62-2613-3a9c-98c4-36bec2e2a807}, hash: 62567F50746BF17424308A4588D1D93B
    @Test()
    public void loadFromFile1WhenDefaultBranchThrowsThrowable() throws UnreadableWalletException, IOException {
        /* Branches:
         * (branch expression (line 1960)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Wallet walletMock = mock(Wallet.class);
        WalletProtobufSerializer.WalletFactory walletProtobufSerializerWalletFactoryMock = mock(WalletProtobufSerializer.WalletFactory.class, "example_factory");
        try (MockedStatic<Wallet> wallet = mockStatic(Wallet.class, CALLS_REAL_METHODS)) {
            FileInputStream fileInputStream = mock(FileInputStream.class);
            WalletExtension[] walletExtensionArray = new WalletExtension[]{};
            wallet.when(() -> Wallet.loadFromFileStream(fileInputStream, walletProtobufSerializerWalletFactoryMock, true, false, walletExtensionArray)).thenReturn(walletMock);
            thrown.expect(Throwable.class);
            File file = new File("pathname1");
            //Act Statement(s)
            Wallet.loadFromFile(file, walletProtobufSerializerWalletFactoryMock, true, false, walletExtensionArray);
            //Assert statement(s)
            wallet.verify(() -> Wallet.loadFromFileStream(fileInputStream, walletProtobufSerializerWalletFactoryMock, true, false, walletExtensionArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${3a929731-7c94-3ad5-afb0-314ed02ab5b2}, hash: ED8E9E2A44C34AF2C7D98A733D8F86A7
    @Test()
    public void loadFromFile1WhenCaughtIOExceptionThrowsUnreadableWalletException() throws UnreadableWalletException, IOException {
        /* Branches:
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Wallet walletMock = mock(Wallet.class);
        WalletProtobufSerializer.WalletFactory walletProtobufSerializerWalletFactoryMock = mock(WalletProtobufSerializer.WalletFactory.class, "example_factory");
        try (MockedStatic<Wallet> wallet = mockStatic(Wallet.class, CALLS_REAL_METHODS)) {
            FileInputStream fileInputStream = mock(FileInputStream.class);
            WalletExtension[] walletExtensionArray = new WalletExtension[]{};
            wallet.when(() -> Wallet.loadFromFileStream(fileInputStream, walletProtobufSerializerWalletFactoryMock, true, false, walletExtensionArray)).thenReturn(walletMock);
            IOException iOException = new IOException();
            UnreadableWalletException unreadableWalletException = new UnreadableWalletException("Could not open file", iOException);
            thrown.expect(UnreadableWalletException.class);
            thrown.expectMessage(unreadableWalletException.getMessage());
            File file = new File("pathname1");
            //Act Statement(s)
            Wallet.loadFromFile(file, walletProtobufSerializerWalletFactoryMock, true, false, walletExtensionArray);
            //Assert statement(s)
            wallet.verify(() -> Wallet.loadFromFileStream(fileInputStream, walletProtobufSerializerWalletFactoryMock, true, false, walletExtensionArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${d914a226-9750-35f4-ad68-44ea8b61e5c2}, hash: 5E687AC6232C20BC6214E75FA9B0E3C0
    @Test()
    public void isConsistentTest() throws IllegalStateException, UTXOProviderException {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).isConsistentOrThrow();
            //Act Statement(s)
            boolean result = target.isConsistent();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).isConsistentOrThrow();
        }
    }

    //Sapient generated method id: ${09e39791-e868-3598-aa57-3703e6aed0b8}, hash: A627AC9F4202BBFB9652C74720CBB11C
    @Ignore()
    @Test()
    public void isConsistentWhenCaughtIllegalStateException() throws IllegalStateException, UTXOProviderException {
        /* Branches:
         * (catch-exception (IllegalStateException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).isConsistentOrThrow();
            //Act Statement(s)
            boolean result = target.isConsistent();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).isConsistentOrThrow();
        }
    }

    //Sapient generated method id: ${307ff5cf-5cb4-3354-bbe6-0ce0cec02802}, hash: 5EC4F8CB47A0A63536A112BEEA8D756C
    @Ignore()
    @Test()
    public void isConsistentOrThrowWhenSize1NotEqualsHashesSizeThrowsIllegalStateException() throws IllegalStateException {
        /* Branches:
         * (for-each(transactions)) : true
         * (size1 != hashes.size()) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Transaction transactionMock = mock(Transaction.class);
        Transaction transactionMock2 = mock(Transaction.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            Set<Transaction> transactionSet = new HashSet<>();
            transactionSet.add(transactionMock);
            transactionSet.add(transactionMock2);
            doReturn(transactionSet).when(target).getTransactions(true);
            doReturn(sha256HashMock).when(transactionMock).getTxId();
            IllegalStateException illegalStateException = new IllegalStateException("Two transactions with same hash");
            thrown.expect(IllegalStateException.class);
            thrown.expectMessage(illegalStateException.getMessage());
            //Act Statement(s)
            target.isConsistentOrThrow();
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).getTransactions(true);
            verify(transactionMock).getTxId();
        }
    }

    //Sapient generated method id: ${2574f4cb-2b1f-329a-b59f-077998761edf}, hash: CEA7B96D18DF7953350655A344C7CE40
    @Test()
    public void isConsistentOrThrowWhenSize1NotEqualsSize2ThrowsIllegalStateException() throws IllegalStateException {
        /* Branches:
         * (for-each(transactions)) : true
         * (size1 != hashes.size()) : false
         * (size1 != size2) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Transaction transactionMock = mock(Transaction.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            Set<Transaction> transactionSet = new HashSet<>();
            transactionSet.add(transactionMock);
            doReturn(transactionSet).when(target).getTransactions(true);
            doReturn(sha256HashMock).when(transactionMock).getTxId();
            IllegalStateException illegalStateException = new IllegalStateException("Inconsistent wallet sizes: 1, 0");
            thrown.expect(IllegalStateException.class);
            thrown.expectMessage(illegalStateException.getMessage());
            //Act Statement(s)
            target.isConsistentOrThrow();
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).getTransactions(true);
            verify(transactionMock).getTxId();
        }
    }

    //Sapient generated method id: ${8e3b98b6-ec45-31e7-90d6-bcb44952c090}, hash: 1A3490C6C05935B80ED737B846929B86
    @Test()
    public void isConsistentOrThrowWhenSpentValuesIsEmpty() throws IllegalStateException {
        /* Branches:
         * (for-each(transactions)) : false
         * (size1 != hashes.size()) : false
         * (size1 != size2) : false
         * (for-each(unspent.values())) : false
         * (for-each(spent.values())) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            Set<Transaction> transactionSet = new HashSet<>();
            doReturn(transactionSet).when(target).getTransactions(true);
            //Act Statement(s)
            target.isConsistentOrThrow();
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).getTransactions(true);
        }
    }

    //Sapient generated method id: ${7866c45e-3b11-3348-a8c3-3d8814f89f3f}, hash: 1AB6E0AC85ED05878D7227082FBC9036
    @Test()
    public void isTxConsistentWhenOGetSpentByIsNull() {
        /* Branches:
         * (for-each(tx.getOutputs())) : true
         * (o.isAvailableForSpending()) : false
         * (o.getSpentBy() == null) : true
         */
        //Arrange Statement(s)
        Transaction txMock = mock(Transaction.class);
        TransactionOutput transactionOutputMock = mock(TransactionOutput.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(transactionOutputMock);
            doReturn(transactionOutputList).when(txMock).getOutputs();
            doReturn(false).when(transactionOutputMock).isAvailableForSpending();
            doReturn(null).when(transactionOutputMock).getSpentBy();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.isTxConsistent(txMock, false);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(txMock).getOutputs();
            verify(transactionOutputMock).isAvailableForSpending();
            verify(transactionOutputMock).getSpentBy();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${ef7e0d09-8150-356e-9da5-ed7b006b0c81}, hash: 63F87F3856A04E2459B592E9FD24A0A0
    @Test()
    public void isTxConsistentWhenOGetSpentByIsNotNull() {
        /* Branches:
         * (for-each(tx.getOutputs())) : true
         * (o.isAvailableForSpending()) : true
         * (o.isMineOrWatched(this)) : true
         * (o.getSpentBy() != null) : true
         */
        //Arrange Statement(s)
        Transaction txMock = mock(Transaction.class);
        TransactionOutput transactionOutputMock = mock(TransactionOutput.class);
        TransactionInput transactionInputMock = mock(TransactionInput.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(transactionOutputMock);
            doReturn(transactionOutputList).when(txMock).getOutputs();
            doReturn(true).when(transactionOutputMock).isAvailableForSpending();
            doReturn(transactionInputMock).when(transactionOutputMock).getSpentBy();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(true).when(transactionOutputMock).isMineOrWatched(target);
            //Act Statement(s)
            boolean result = target.isTxConsistent(txMock, false);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(txMock).getOutputs();
            verify(transactionOutputMock).isAvailableForSpending();
            verify(transactionOutputMock).getSpentBy();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(transactionOutputMock).isMineOrWatched(target);
        }
    }

    //Sapient generated method id: ${99491568-19a0-3c78-b3dc-d7e0509bfd05}, hash: 0797071E4B36EE687A40AB31495BE525
    @Test()
    public void isTxConsistentWhenOGetSpentByIsNullAndIsActuallySpentEqualsIsSpent() {
        /* Branches:
         * (for-each(tx.getOutputs())) : true
         * (o.isAvailableForSpending()) : true
         * (o.isMineOrWatched(this)) : true
         * (o.getSpentBy() != null) : false
         * (isActuallySpent == isSpent) : true
         */
        //Arrange Statement(s)
        Transaction txMock = mock(Transaction.class);
        TransactionOutput transactionOutputMock = mock(TransactionOutput.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(transactionOutputMock);
            doReturn(transactionOutputList).when(txMock).getOutputs();
            doReturn(true).when(transactionOutputMock).isAvailableForSpending();
            doReturn(null).when(transactionOutputMock).getSpentBy();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(true).when(transactionOutputMock).isMineOrWatched(target);
            //Act Statement(s)
            boolean result = target.isTxConsistent(txMock, false);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            verify(txMock).getOutputs();
            verify(transactionOutputMock).isAvailableForSpending();
            verify(transactionOutputMock).getSpentBy();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(transactionOutputMock).isMineOrWatched(target);
        }
    }

    //Sapient generated method id: ${33139db3-0ffb-3b57-9c6b-37b7990666d9}, hash: 7341E0E95F1EE0A6DC68C94727A87A0F
    @Test()
    public void isTxConsistentWhenOGetSpentByIsNullAndIsActuallySpentNotEqualsIsSpent() {
        /* Branches:
         * (for-each(tx.getOutputs())) : true
         * (o.isAvailableForSpending()) : true
         * (o.isMineOrWatched(this)) : true
         * (o.getSpentBy() != null) : false
         * (isActuallySpent == isSpent) : false
         */
        //Arrange Statement(s)
        Transaction txMock = mock(Transaction.class);
        TransactionOutput transactionOutputMock = mock(TransactionOutput.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(transactionOutputMock);
            doReturn(transactionOutputList).when(txMock).getOutputs();
            doReturn(true).when(transactionOutputMock).isAvailableForSpending();
            doReturn(null).when(transactionOutputMock).getSpentBy();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(true).when(transactionOutputMock).isMineOrWatched(target);
            //Act Statement(s)
            boolean result = target.isTxConsistent(txMock, true);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(txMock).getOutputs();
            verify(transactionOutputMock).isAvailableForSpending();
            verify(transactionOutputMock).getSpentBy();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(transactionOutputMock).isMineOrWatched(target);
        }
    }

    //Sapient generated method id: ${93fc35a3-0e91-365a-9968-85bf9fa2bdd0}, hash: 0B3AA44EA71459CC9B73C963E0C665BF
    @Test()
    public void loadFromFileStreamTest() throws UnreadableWalletException {
        //Arrange Statement(s)
        Wallet walletMock = mock(Wallet.class);
        try (MockedStatic<Wallet> wallet = mockStatic(Wallet.class, CALLS_REAL_METHODS)) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            WalletProtobufSerializer.WalletFactory walletFactory = WalletProtobufSerializer.WalletFactory.DEFAULT;
            WalletExtension[] walletExtensionArray = new WalletExtension[]{};
            wallet.when(() -> Wallet.loadFromFileStream(inputStream, walletFactory, false, false, walletExtensionArray)).thenReturn(walletMock);
            //Act Statement(s)
            Wallet result = Wallet.loadFromFileStream(inputStream, walletExtensionArray);
            //Assert statement(s)
            assertThat(result, equalTo(walletMock));
            wallet.verify(() -> Wallet.loadFromFileStream(inputStream, walletFactory, false, false, walletExtensionArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${52d71b77-c9da-3dde-8335-9e4e6eff2f3a}, hash: 3769E7F20F6AA401691BBCD20E0BC1E5
    @Ignore()
    @Test()
    public void loadFromFileStream1WhenWalletNotIsConsistent() throws UnreadableWalletException {
        /* Branches:
         * (ignoreMandatoryExtensions) : true
         * (!wallet.isConsistent()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: wallet, loader
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        WalletProtobufSerializer.WalletFactory walletProtobufSerializerWalletFactoryMock = mock(WalletProtobufSerializer.WalletFactory.class);
        WalletExtension[] walletExtensionArray = new WalletExtension[]{};
        //Act Statement(s)
        Wallet result = Wallet.loadFromFileStream(inputStream, walletProtobufSerializerWalletFactoryMock, false, true, walletExtensionArray);
        //Assert statement(s)
        //TODO: Please implement equals method in Wallet for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${6f5ef394-9df9-3643-a6f1-d38dd2d0deeb}, hash: 0F748F29A04FA1B7A66F60383D0EE428
    @Ignore()
    @Test()
    public void notifyTransactionIsInBlockWhenTxIsNotNullThrowsIllegalStateException() throws VerificationException {
        /* Branches:
         * (tx == null) : true
         * (tx != null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: riskDropped
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        StoredBlock storedBlockMock = mock(StoredBlock.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.notifyTransactionIsInBlock(sha256HashMock, storedBlockMock, AbstractBlockChain.NewBlockType.BEST_CHAIN, 0);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${c7029de3-e868-38a0-9974-7281120ca658}, hash: FB03EBF37074408FAA61C50A99DE55EC
    @Test()
    public void notifyTransactionIsInBlockWhenTxIsNull() throws VerificationException, UTXOProviderException, IOException {
        /* Branches:
         * (tx == null) : true
         * (tx != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: riskDropped
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        StoredBlock storedBlockMock = mock(StoredBlock.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.notifyTransactionIsInBlock(sha256HashMock, storedBlockMock, AbstractBlockChain.NewBlockType.BEST_CHAIN, 0);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${23b99715-0cd8-3010-a516-c05129308de4}, hash: FF5C9C117B30472282D1E0B0D7CFD755
    @Ignore()
    @Test()
    public void receivePendingWhenContainingPoolsNotEqualsEnumSetNoneOfPool() throws VerificationException, UTXOProviderException, IOException {
        /* Branches:
         * (!containingPools.equals(EnumSet.noneOf(Pool.class))) : true
         */
        //Arrange Statement(s)
        Transaction txMock = mock(Transaction.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class, "receivePending_sha256Hash1");
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<Transaction> transaction = mockStatic(Transaction.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(sha256HashMock).when(txMock).getTxId();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            transaction.when(() -> Transaction.verify(networkMock, txMock)).thenAnswer((Answer<Void>) invocation -> null);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            EnumSet<WalletTransaction.Pool> walletTransactionPoolSet = EnumSet.noneOf(WalletTransaction.Pool.class);
            doReturn(walletTransactionPoolSet).when(target).getContainingPools(txMock);
            List<Transaction> transactionList = new ArrayList<>();
            //Act Statement(s)
            target.receivePending(txMock, transactionList, false);
            //Assert statement(s)
            verify(txMock).getTxId();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            transaction.verify(() -> Transaction.verify(networkMock, txMock), atLeast(1));
            verify(target).getContainingPools(txMock);
        }
    }

    //Sapient generated method id: ${34aa1770-9e74-3ce4-9815-8eecff4031e5}, hash: 5F5B082A08CE0953EB5E0C09636F9303
    @Test()
    public void receivePendingWhenIsPendingTransactionRelevantNotTx() throws VerificationException, ScriptException, UTXOProviderException, IOException {
        /* Branches:
         * (!containingPools.equals(EnumSet.noneOf(Pool.class))) : false
         * (!overrideIsRelevant) : true
         * (!isPendingTransactionRelevant(tx)) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Transaction transactionMock = mock(Transaction.class);
        try (MockedStatic<Transaction> transaction = mockStatic(Transaction.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            transaction.when(() -> Transaction.verify(networkMock, transactionMock)).thenAnswer((Answer<Void>) invocation -> null);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            EnumSet<WalletTransaction.Pool> walletTransactionPoolSet = EnumSet.noneOf(WalletTransaction.Pool.class);
            doReturn(walletTransactionPoolSet).when(target).getContainingPools(transactionMock);
            doReturn(false).when(target).isPendingTransactionRelevant(transactionMock);
            List<Transaction> transactionList = new ArrayList<>();
            //Act Statement(s)
            target.receivePending(transactionMock, transactionList, false);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            transaction.verify(() -> Transaction.verify(networkMock, transactionMock), atLeast(1));
            verify(target).getContainingPools(transactionMock);
            verify(target).isPendingTransactionRelevant(transactionMock);
        }
    }

    //Sapient generated method id: ${d9e86975-cccb-3617-957e-4b2b1cb70989}, hash: 58C78871A686CEA6B73AC03252A3744D
    @Test()
    public void receivePendingWhenNotAcceptRiskyTransactionsAndUpdateTimeIsPresent() throws VerificationException, ScriptException, ProtocolException, UnsupportedOperationException, UTXOProviderException, IOException {
        /* Branches:
         * (!containingPools.equals(EnumSet.noneOf(Pool.class))) : false
         * (!overrideIsRelevant) : true
         * (!isPendingTransactionRelevant(tx)) : false
         * (isTransactionRisky(tx, dependencies)) : true
         * (!acceptRiskyTransactions) : true
         * (updateTime.isPresent()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: riskDropped
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Transaction txMock = mock(Transaction.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Transaction transactionMock = mock(Transaction.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        try (MockedStatic<Transaction> transaction = mockStatic(Transaction.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(txMock).serialize();
            doReturn(Transaction.Purpose.UNKNOWN).when(txMock).getPurpose();
            Instant instant = (Instant) Instant.ofEpochSecond(1700000000);
            doReturn(Optional.of(instant)).when(txMock).updateTime();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            transaction.when(() -> Transaction.verify(networkMock, txMock)).thenAnswer((Answer<Void>) invocation -> null);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            EnumSet<WalletTransaction.Pool> walletTransactionPoolSet = EnumSet.noneOf(WalletTransaction.Pool.class);
            doReturn(walletTransactionPoolSet).when(target).getContainingPools(txMock);
            doReturn(true).when(target).isPendingTransactionRelevant(txMock);
            List<Transaction> transactionList = new ArrayList<>();
            doReturn(true).when(target).isTransactionRisky(txMock, transactionList);
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(transactionMock).when(messageSerializerMock).makeTransaction((ByteBuffer) any());
            doNothing().when(transactionMock).setPurpose(Transaction.Purpose.UNKNOWN);
            doNothing().when(transactionMock).setUpdateTime((Instant) any());
            doReturn(sha256HashMock).when(transactionMock).getTxId();
            //Act Statement(s)
            target.receivePending(txMock, transactionList, false);
            //Assert statement(s)
            verify(txMock).serialize();
            verify(txMock).getPurpose();
            verify(txMock).updateTime();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            transaction.verify(() -> Transaction.verify(networkMock, txMock), atLeast(1));
            verify(target).getContainingPools(txMock);
            verify(target).isPendingTransactionRelevant(txMock);
            verify(target).isTransactionRisky(txMock, transactionList);
            verify(paramsMock).getDefaultSerializer();
            verify(messageSerializerMock).makeTransaction((ByteBuffer) any());
            verify(transactionMock).setPurpose(Transaction.Purpose.UNKNOWN);
            verify(transactionMock).setUpdateTime((Instant) any());
            verify(transactionMock).getTxId();
        }
    }

    //Sapient generated method id: ${e00b3c40-3c3e-3f8a-9dcf-2b1a6eec0c50}, hash: B7919C805F6DBDB816D2D1E22DB1FDE5
    @Test()
    public void receivePendingWhenNotAcceptRiskyTransactionsAndUpdateTimeNotIsPresent() throws VerificationException, ScriptException, ProtocolException, UnsupportedOperationException, UTXOProviderException, IOException {
        /* Branches:
         * (!containingPools.equals(EnumSet.noneOf(Pool.class))) : false
         * (!overrideIsRelevant) : true
         * (!isPendingTransactionRelevant(tx)) : false
         * (isTransactionRisky(tx, dependencies)) : true
         * (!acceptRiskyTransactions) : true
         * (updateTime.isPresent()) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: riskDropped
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Transaction txMock = mock(Transaction.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Transaction transactionMock = mock(Transaction.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        try (MockedStatic<Transaction> transaction = mockStatic(Transaction.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(txMock).serialize();
            doReturn(Transaction.Purpose.UNKNOWN).when(txMock).getPurpose();
            doReturn(Optional.empty()).when(txMock).updateTime();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            transaction.when(() -> Transaction.verify(networkMock, txMock)).thenAnswer((Answer<Void>) invocation -> null);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            EnumSet<WalletTransaction.Pool> walletTransactionPoolSet = EnumSet.noneOf(WalletTransaction.Pool.class);
            doReturn(walletTransactionPoolSet).when(target).getContainingPools(txMock);
            doReturn(true).when(target).isPendingTransactionRelevant(txMock);
            List<Transaction> transactionList = new ArrayList<>();
            doReturn(true).when(target).isTransactionRisky(txMock, transactionList);
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(transactionMock).when(messageSerializerMock).makeTransaction((ByteBuffer) any());
            doNothing().when(transactionMock).setPurpose(Transaction.Purpose.UNKNOWN);
            doNothing().when(transactionMock).clearUpdateTime();
            doReturn(sha256HashMock).when(transactionMock).getTxId();
            //Act Statement(s)
            target.receivePending(txMock, transactionList, false);
            //Assert statement(s)
            verify(txMock).serialize();
            verify(txMock).getPurpose();
            verify(txMock).updateTime();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            transaction.verify(() -> Transaction.verify(networkMock, txMock), atLeast(1));
            verify(target).getContainingPools(txMock);
            verify(target).isPendingTransactionRelevant(txMock);
            verify(target).isTransactionRisky(txMock, transactionList);
            verify(paramsMock).getDefaultSerializer();
            verify(messageSerializerMock).makeTransaction((ByteBuffer) any());
            verify(transactionMock).setPurpose(Transaction.Purpose.UNKNOWN);
            verify(transactionMock).clearUpdateTime();
            verify(transactionMock).getTxId();
        }
    }

    //Sapient generated method id: ${e417e6bb-5b3e-3f74-9f7d-44657b3ad66b}, hash: 7A2B3202FF5F04A8C843E8222794CD87
    @Ignore()
    @Test()
    public void receivePendingWhenLogIsInfoEnabledAndGetConfidenceTxGetSourceEqualsTransactionConfidenceSourceUNKNOWNAndUpdateTimeIsPre() throws VerificationException, ScriptException, ProtocolException, UnsupportedOperationException, UTXOProviderException, IOException {
        /* Branches:
         * (!containingPools.equals(EnumSet.noneOf(Pool.class))) : false
         * (!overrideIsRelevant) : true
         * (!isPendingTransactionRelevant(tx)) : false
         * (isTransactionRisky(tx, dependencies)) : false
         * (log.isInfoEnabled()) : true
         * (getConfidence(tx).getSource().equals(TransactionConfidence.Source.UNKNOWN)) : true
         * (updateTime.isPresent()) : true
         */
        //Arrange Statement(s)
        Transaction txMock = mock(Transaction.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Context contextMock = mock(Context.class);
        TxConfidenceTable txConfidenceTableMock = mock(TxConfidenceTable.class);
        TransactionConfidence transactionConfidenceMock = mock(TransactionConfidence.class);
        Coin coinMock = mock(Coin.class);
        Coin coinMock2 = mock(Coin.class);
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Transaction transactionMock = mock(Transaction.class);
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Transaction> transaction = mockStatic(Transaction.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(sha256HashMock).when(txMock).getTxId();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(txMock).serialize();
            doReturn(Transaction.Purpose.UNKNOWN).when(txMock).getPurpose();
            Instant instant = (Instant) Instant.ofEpochSecond(1700000000);
            doReturn(Optional.of(instant)).when(txMock).updateTime();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            transaction.when(() -> Transaction.verify(networkMock, txMock)).thenAnswer((Answer<Void>) invocation -> null);
            context.when(() -> Context.get()).thenReturn(contextMock);
            doReturn(txConfidenceTableMock).when(contextMock).getConfidenceTable();
            doReturn(transactionConfidenceMock).when(txConfidenceTableMock).getConfidence(txMock);
            doReturn(TransactionConfidence.Source.UNKNOWN).when(transactionConfidenceMock).getSource();
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            EnumSet<WalletTransaction.Pool> walletTransactionPoolSet = EnumSet.noneOf(WalletTransaction.Pool.class);
            doReturn(walletTransactionPoolSet).when(target).getContainingPools(txMock);
            doReturn(coinMock).when(txMock).getValueSentToMe(target);
            doReturn("return_of_toFriendlyString1").when(coinMock).toFriendlyString();
            doReturn(coinMock2).when(txMock).getValueSentFromMe(target);
            doReturn("return_of_toFriendlyString1").when(coinMock2).toFriendlyString();
            doReturn(true).when(target).isPendingTransactionRelevant(txMock);
            List<Transaction> transactionList = new ArrayList<>();
            doReturn(false).when(target).isTransactionRisky(txMock, transactionList);
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(transactionMock).when(messageSerializerMock).makeTransaction((ByteBuffer) any());
            doNothing().when(transactionMock).setPurpose(Transaction.Purpose.UNKNOWN);
            doNothing().when(transactionMock).setUpdateTime((Instant) any());
            doNothing().when(target).commitTx(transactionMock);
            //Act Statement(s)
            target.receivePending(txMock, transactionList, false);
            //Assert statement(s)
            verify(txMock).getTxId();
            verify(txMock).serialize();
            verify(txMock).getPurpose();
            verify(txMock).updateTime();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            transaction.verify(() -> Transaction.verify(networkMock, txMock), atLeast(1));
            context.verify(() -> Context.get(), atLeast(1));
            verify(contextMock).getConfidenceTable();
            verify(txConfidenceTableMock).getConfidence(txMock);
            verify(transactionConfidenceMock).getSource();
            verify(target).getContainingPools(txMock);
            verify(txMock).getValueSentToMe(target);
            verify(coinMock).toFriendlyString();
            verify(txMock).getValueSentFromMe(target);
            verify(coinMock2).toFriendlyString();
            verify(target).isPendingTransactionRelevant(txMock);
            verify(target).isTransactionRisky(txMock, transactionList);
            verify(paramsMock).getDefaultSerializer();
            verify(messageSerializerMock).makeTransaction((ByteBuffer) any());
            verify(transactionMock).setPurpose(Transaction.Purpose.UNKNOWN);
            verify(transactionMock).setUpdateTime((Instant) any());
            verify(target).commitTx(transactionMock);
        }
    }

    //Sapient generated method id: ${339e33b3-d358-3660-9752-1e2c3973bc45}, hash: 464BACE76DD747370BC4EE5FD4FB81E9
    @Ignore()
    @Test()
    public void receivePendingWhenLogIsInfoEnabledAndGetConfidenceTxGetSourceEqualsTransactionConfidenceSourceUNKNOWNAndUpdateTimeNotIs() throws VerificationException, ScriptException, ProtocolException, UnsupportedOperationException, UTXOProviderException, IOException {
        /* Branches:
         * (!containingPools.equals(EnumSet.noneOf(Pool.class))) : false
         * (!overrideIsRelevant) : true
         * (!isPendingTransactionRelevant(tx)) : false
         * (isTransactionRisky(tx, dependencies)) : false
         * (log.isInfoEnabled()) : true
         * (getConfidence(tx).getSource().equals(TransactionConfidence.Source.UNKNOWN)) : true
         * (updateTime.isPresent()) : false
         */
        //Arrange Statement(s)
        Transaction txMock = mock(Transaction.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Context contextMock = mock(Context.class);
        TxConfidenceTable txConfidenceTableMock = mock(TxConfidenceTable.class);
        TransactionConfidence transactionConfidenceMock = mock(TransactionConfidence.class);
        Coin coinMock = mock(Coin.class);
        Coin coinMock2 = mock(Coin.class);
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Transaction transactionMock = mock(Transaction.class);
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Transaction> transaction = mockStatic(Transaction.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(sha256HashMock).when(txMock).getTxId();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(txMock).serialize();
            doReturn(Transaction.Purpose.UNKNOWN).when(txMock).getPurpose();
            doReturn(Optional.empty()).when(txMock).updateTime();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            transaction.when(() -> Transaction.verify(networkMock, txMock)).thenAnswer((Answer<Void>) invocation -> null);
            context.when(() -> Context.get()).thenReturn(contextMock);
            doReturn(txConfidenceTableMock).when(contextMock).getConfidenceTable();
            doReturn(transactionConfidenceMock).when(txConfidenceTableMock).getConfidence(txMock);
            doReturn(TransactionConfidence.Source.UNKNOWN).when(transactionConfidenceMock).getSource();
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            EnumSet<WalletTransaction.Pool> walletTransactionPoolSet = EnumSet.noneOf(WalletTransaction.Pool.class);
            doReturn(walletTransactionPoolSet).when(target).getContainingPools(txMock);
            doReturn(coinMock).when(txMock).getValueSentToMe(target);
            doReturn("return_of_toFriendlyString1").when(coinMock).toFriendlyString();
            doReturn(coinMock2).when(txMock).getValueSentFromMe(target);
            doReturn("return_of_toFriendlyString1").when(coinMock2).toFriendlyString();
            doReturn(true).when(target).isPendingTransactionRelevant(txMock);
            List<Transaction> transactionList = new ArrayList<>();
            doReturn(false).when(target).isTransactionRisky(txMock, transactionList);
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(transactionMock).when(messageSerializerMock).makeTransaction((ByteBuffer) any());
            doNothing().when(transactionMock).setPurpose(Transaction.Purpose.UNKNOWN);
            doNothing().when(transactionMock).clearUpdateTime();
            doNothing().when(target).commitTx(transactionMock);
            //Act Statement(s)
            target.receivePending(txMock, transactionList, false);
            //Assert statement(s)
            verify(txMock).getTxId();
            verify(txMock).serialize();
            verify(txMock).getPurpose();
            verify(txMock).updateTime();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            transaction.verify(() -> Transaction.verify(networkMock, txMock), atLeast(1));
            context.verify(() -> Context.get(), atLeast(1));
            verify(contextMock).getConfidenceTable();
            verify(txConfidenceTableMock).getConfidence(txMock);
            verify(transactionConfidenceMock).getSource();
            verify(target).getContainingPools(txMock);
            verify(txMock).getValueSentToMe(target);
            verify(coinMock).toFriendlyString();
            verify(txMock).getValueSentFromMe(target);
            verify(coinMock2).toFriendlyString();
            verify(target).isPendingTransactionRelevant(txMock);
            verify(target).isTransactionRisky(txMock, transactionList);
            verify(paramsMock).getDefaultSerializer();
            verify(messageSerializerMock).makeTransaction((ByteBuffer) any());
            verify(transactionMock).setPurpose(Transaction.Purpose.UNKNOWN);
            verify(transactionMock).clearUpdateTime();
            verify(target).commitTx(transactionMock);
        }
    }

    //Sapient generated method id: ${afc91f81-d35c-3aba-972f-431c4f75b409}, hash: 68D619A77EA921FEF828E594897A7A37
    @Test()
    public void isTransactionRiskyWhenResultNotEqualsRiskAnalysisResultOK() {
        /* Branches:
         * (dependencies == null) : true
         * (result != RiskAnalysis.Result.OK) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        RiskAnalysis riskAnalysisMock = mock(RiskAnalysis.class);
        Transaction transactionMock = mock(Transaction.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Transaction> transactionList = new ArrayList<>();
            doReturn(riskAnalysisMock).when(riskAnalyzerMock).create(target, transactionMock, transactionList);
            doReturn(RiskAnalysis.Result.NON_FINAL).when(riskAnalysisMock).analyze();
            List<Transaction> list = null;
            //Act Statement(s)
            boolean result = target.isTransactionRisky(transactionMock, list);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(riskAnalyzerMock).create(target, transactionMock, transactionList);
            verify(riskAnalysisMock).analyze();
        }
    }

    //Sapient generated method id: ${8cc51b8b-3d28-32ee-abf7-02ad548d7f93}, hash: 9195B3E8F01B58C4986DFBC3FE750EE2
    @Test()
    public void isTransactionRiskyWhenResultEqualsRiskAnalysisResultOK() {
        /* Branches:
         * (dependencies == null) : true
         * (result != RiskAnalysis.Result.OK) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        RiskAnalysis riskAnalysisMock = mock(RiskAnalysis.class);
        Transaction transactionMock = mock(Transaction.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Transaction> transactionList = new ArrayList<>();
            doReturn(riskAnalysisMock).when(riskAnalyzerMock).create(target, transactionMock, transactionList);
            doReturn(RiskAnalysis.Result.OK).when(riskAnalysisMock).analyze();
            List<Transaction> list = null;
            //Act Statement(s)
            boolean result = target.isTransactionRisky(transactionMock, list);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(riskAnalyzerMock).create(target, transactionMock, transactionList);
            verify(riskAnalysisMock).analyze();
        }
    }

    //Sapient generated method id: ${2ebd4f81-abfb-33ad-b1f5-b1e6db6a0864}, hash: 941ACC8B3BC99318D68D372B2D68D567
    @Test()
    public void receivePending1Test() throws VerificationException, UTXOProviderException, IOException {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Transaction transactionMock = mock(Transaction.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Transaction> transactionList = new ArrayList<>();
            doNothing().when(target).receivePending(transactionMock, transactionList, false);
            //Act Statement(s)
            target.receivePending(transactionMock, transactionList);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).receivePending(transactionMock, transactionList, false);
        }
    }

    //Sapient generated method id: ${d771281f-3b23-38ee-a83a-e5fb40b7afc4}, hash: 2CB4BB756471257CC0EB0D477430E835
    @Ignore()
    @Test()
    public void isPendingTransactionRelevantWhenContainingPoolsNotEqualsEnumSetNoneOfPool() throws ScriptException {
        /* Branches:
         * (!containingPools.equals(EnumSet.noneOf(Pool.class))) : true
         */
        //Arrange Statement(s)
        Transaction txMock = mock(Transaction.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class, "isPendingTransactionRelevant_sha256Hash1");
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(sha256HashMock).when(txMock).getTxId();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            EnumSet<WalletTransaction.Pool> walletTransactionPoolSet = EnumSet.noneOf(WalletTransaction.Pool.class);
            doReturn(walletTransactionPoolSet).when(target).getContainingPools(txMock);
            //Act Statement(s)
            boolean result = target.isPendingTransactionRelevant(txMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(txMock).getTxId();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).getContainingPools(txMock);
        }
    }

    //Sapient generated method id: ${9bbf3598-dcaf-3ed7-9f22-9098a9207cd9}, hash: 3DB60C3837CFE25C6689A66F7EEA3A68
    @Test()
    public void isPendingTransactionRelevantWhenIsTransactionRelevantNotTx() throws ScriptException {
        /* Branches:
         * (!containingPools.equals(EnumSet.noneOf(Pool.class))) : false
         * (!isTransactionRelevant(tx)) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Transaction transactionMock = mock(Transaction.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            EnumSet<WalletTransaction.Pool> walletTransactionPoolSet = EnumSet.noneOf(WalletTransaction.Pool.class);
            doReturn(walletTransactionPoolSet).when(target).getContainingPools(transactionMock);
            doReturn(false).when(target).isTransactionRelevant(transactionMock);
            //Act Statement(s)
            boolean result = target.isPendingTransactionRelevant(transactionMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).getContainingPools(transactionMock);
            verify(target).isTransactionRelevant(transactionMock);
        }
    }

    //Sapient generated method id: ${a89a4dc4-3c83-31db-b465-0d896838da92}, hash: 4728D6F45DFCF6329F72C2B04DB7127D
    @Test()
    public void isPendingTransactionRelevantWhenIsTransactionRelevantTx() throws ScriptException {
        /* Branches:
         * (!containingPools.equals(EnumSet.noneOf(Pool.class))) : false
         * (!isTransactionRelevant(tx)) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Transaction transactionMock = mock(Transaction.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            EnumSet<WalletTransaction.Pool> walletTransactionPoolSet = EnumSet.noneOf(WalletTransaction.Pool.class);
            doReturn(walletTransactionPoolSet).when(target).getContainingPools(transactionMock);
            doReturn(true).when(target).isTransactionRelevant(transactionMock);
            //Act Statement(s)
            boolean result = target.isPendingTransactionRelevant(transactionMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).getContainingPools(transactionMock);
            verify(target).isTransactionRelevant(transactionMock);
        }
    }

    //Sapient generated method id: ${291ea19b-4a51-36c9-8c9f-dedd4bbd4834}, hash: B7B1C1964350DF02F0D6589CBE3A08FA
    @Test()
    public void isTransactionRelevantWhenTxGetValueSentToMeThisSignumGreaterThan0() throws ScriptException {
        /* Branches:
         * (tx.getValueSentFromMe(this).signum() > 0) : false
         * (tx.getValueSentToMe(this).signum() > 0) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Transaction txMock = mock(Transaction.class);
        Coin coinMock = mock(Coin.class);
        Coin coinMock2 = mock(Coin.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(coinMock).when(txMock).getValueSentToMe(target);
            doReturn(1).when(coinMock).signum();
            doReturn(coinMock2).when(txMock).getValueSentFromMe(target);
            doReturn(0).when(coinMock2).signum();
            //Act Statement(s)
            boolean result = target.isTransactionRelevant(txMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(txMock).getValueSentToMe(target);
            verify(coinMock).signum();
            verify(txMock).getValueSentFromMe(target);
            verify(coinMock2).signum();
        }
    }

    //Sapient generated method id: ${1cb4d7f4-bff7-3e0a-8eb7-f284f0428bf5}, hash: C0D11E2BD17412088DDAD83DE4A855CB
    @Ignore()
    @Test()
    public void isTransactionRelevantWhenTxGetValueSentToMeThisSignumNotGreaterThan0ThrowsIllegalStateException() throws ScriptException {
        /* Branches:
         * (tx.getValueSentFromMe(this).signum() > 0) : false
         * (tx.getValueSentToMe(this).signum() > 0) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Transaction txMock = mock(Transaction.class);
        Coin coinMock = mock(Coin.class);
        Coin coinMock2 = mock(Coin.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(coinMock).when(txMock).getValueSentToMe(target);
            doReturn(0).when(coinMock).signum();
            doReturn(coinMock2).when(txMock).getValueSentFromMe(target);
            doReturn(0).when(coinMock2).signum();
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.isTransactionRelevant(txMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(txMock).getValueSentToMe(target);
            verify(coinMock).signum();
            verify(txMock).getValueSentFromMe(target);
            verify(coinMock2).signum();
        }
    }

    //Sapient generated method id: ${09b38b3b-9049-3491-b691-c0ab5fde0cd1}, hash: 53E0F358D51370DB40AFA30F76EF2EE2
    @Test()
    public void isTransactionMatureWhenGetConfidenceTxGetDepthInBlocksGreaterThanOrEqualsToParamsGetSpendableCoinbaseDepth() {
        /* Branches:
         * (!tx.isCoinBase()) : false
         * (getConfidence(tx).getDepthInBlocks() >= params.getSpendableCoinbaseDepth()) : true
         */
        //Arrange Statement(s)
        Transaction txMock = mock(Transaction.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Context contextMock = mock(Context.class);
        TxConfidenceTable txConfidenceTableMock = mock(TxConfidenceTable.class);
        TransactionConfidence transactionConfidenceMock = mock(TransactionConfidence.class);
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(true).when(txMock).isCoinBase();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            context.when(() -> Context.get()).thenReturn(contextMock);
            doReturn(txConfidenceTableMock).when(contextMock).getConfidenceTable();
            doReturn(transactionConfidenceMock).when(txConfidenceTableMock).getConfidence(txMock);
            doReturn(0).when(transactionConfidenceMock).getDepthInBlocks();
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(0).when(paramsMock).getSpendableCoinbaseDepth();
            //Act Statement(s)
            boolean result = target.isTransactionMature(txMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            verify(txMock).isCoinBase();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            context.verify(() -> Context.get(), atLeast(1));
            verify(contextMock).getConfidenceTable();
            verify(txConfidenceTableMock).getConfidence(txMock);
            verify(transactionConfidenceMock).getDepthInBlocks();
            verify(paramsMock).getSpendableCoinbaseDepth();
        }
    }

    //Sapient generated method id: ${4f15eafe-e443-3101-a4f2-1ea88fa4e0b8}, hash: 6B660FF1E1EDC88475F9A8355B577C67
    @Test()
    public void isTransactionMatureWhenGetConfidenceTxGetDepthInBlocksLessThanParamsGetSpendableCoinbaseDepth() {
        /* Branches:
         * (!tx.isCoinBase()) : false
         * (getConfidence(tx).getDepthInBlocks() >= params.getSpendableCoinbaseDepth()) : false
         */
        //Arrange Statement(s)
        Transaction txMock = mock(Transaction.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Context contextMock = mock(Context.class);
        TxConfidenceTable txConfidenceTableMock = mock(TxConfidenceTable.class);
        TransactionConfidence transactionConfidenceMock = mock(TransactionConfidence.class);
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(true).when(txMock).isCoinBase();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            context.when(() -> Context.get()).thenReturn(contextMock);
            doReturn(txConfidenceTableMock).when(contextMock).getConfidenceTable();
            doReturn(transactionConfidenceMock).when(txConfidenceTableMock).getConfidence(txMock);
            doReturn(0).when(transactionConfidenceMock).getDepthInBlocks();
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(1).when(paramsMock).getSpendableCoinbaseDepth();
            //Act Statement(s)
            boolean result = target.isTransactionMature(txMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(txMock).isCoinBase();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            context.verify(() -> Context.get(), atLeast(1));
            verify(contextMock).getConfidenceTable();
            verify(txConfidenceTableMock).getConfidence(txMock);
            verify(transactionConfidenceMock).getDepthInBlocks();
            verify(paramsMock).getSpendableCoinbaseDepth();
        }
    }

    //Sapient generated method id: ${eb0a9b74-ba4f-364e-9f33-391857c7e342}, hash: C889285F571F18A0D6444C03983625E6
    @Test()
    public void addTransactionsDependingOnWhenAnotherTxEqualsTxThrowsNullPointerException() {
        /* Branches:
         * (for-each(txSet)) : true
         * (!txQueue.isEmpty()) : true
         * (for-each(txPool)) : true
         * (anotherTx.equals(tx)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Transaction txMock = mock(Transaction.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(sha256HashMock).when(txMock).getTxId();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(NullPointerException.class);
            Set<Transaction> transactionSet = new HashSet<>();
            transactionSet.add(txMock);
            Set<Transaction> transactionSet2 = new HashSet<>();
            transactionSet2.add((Transaction) null);
            //Act Statement(s)
            target.addTransactionsDependingOn(transactionSet, transactionSet2);
            //Assert statement(s)
            verify(txMock).getTxId();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${6b020f0f-5a2c-3f42-a160-819c8f2c0bd1}, hash: 3C30FE45A545B140007EBAA9EB496B99
    @Ignore()
    @Test()
    public void addTransactionsDependingOnWhenAnotherTxGetInputsIsNotEmptyThrowsNullPointerException() {
        /* Branches:
         * (for-each(txSet)) : true
         * (!txQueue.isEmpty()) : true
         * (for-each(txPool)) : true
         * (anotherTx.equals(tx)) : false
         * (for-each(anotherTx.getInputs())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Transaction txMock = mock(Transaction.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Transaction anotherTxMock = mock(Transaction.class);
        Transaction transactionMock = mock(Transaction.class);
        TransactionOutPoint transactionOutPointMock = mock(TransactionOutPoint.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(sha256HashMock).when(txMock).getTxId();
            byte[] byteArray = new byte[]{};
            TransactionInput transactionInput = new TransactionInput(transactionMock, byteArray, transactionOutPointMock);
            List<TransactionInput> transactionInputList = new ArrayList<>();
            transactionInputList.add(transactionInput);
            doReturn(transactionInputList).when(anotherTxMock).getInputs();
            doReturn(sha256HashMock2).when(transactionOutPointMock).hash();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(NullPointerException.class);
            Set<Transaction> transactionSet = new HashSet<>();
            transactionSet.add(txMock);
            Set<Transaction> transactionSet2 = new HashSet<>();
            transactionSet2.add(anotherTxMock);
            //Act Statement(s)
            target.addTransactionsDependingOn(transactionSet, transactionSet2);
            //Assert statement(s)
            verify(txMock).getTxId();
            verify(anotherTxMock).getInputs();
            verify(transactionOutPointMock).hash();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${4a29e520-97cf-3d22-b071-6af5f37ec2cd}, hash: A283769FE0D131CE082F98E6FA9F1406
    @Test()
    public void addTransactionsDependingOnWhenAnotherTxGetInputsIsEmpty() {
        /* Branches:
         * (for-each(txSet)) : true
         * (!txQueue.isEmpty()) : true
         * (for-each(txPool)) : true
         * (anotherTx.equals(tx)) : false
         * (for-each(anotherTx.getInputs())) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Transaction txMock = mock(Transaction.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Transaction anotherTxMock = mock(Transaction.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(sha256HashMock).when(txMock).getTxId();
            List<TransactionInput> transactionInputList = new ArrayList<>();
            doReturn(transactionInputList).when(anotherTxMock).getInputs();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            Set<Transaction> transactionSet = new HashSet<>();
            transactionSet.add(txMock);
            Set<Transaction> transactionSet2 = new HashSet<>();
            transactionSet2.add(anotherTxMock);
            //Act Statement(s)
            target.addTransactionsDependingOn(transactionSet, transactionSet2);
            //Assert statement(s)
            verify(txMock).getTxId();
            verify(anotherTxMock).getInputs();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${b82d5d83-66f4-3ff1-add4-22e06ef2125c}, hash: 6719D3FF5A1C7BB6D791FD0E88920587
    @Test()
    public void receiveFromBlockWhenIsTransactionRelevantNotTx() throws VerificationException, ScriptException, UTXOProviderException, IOException {
        /* Branches:
         * (!isTransactionRelevant(tx)) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Transaction transactionMock = mock(Transaction.class);
        StoredBlock storedBlockMock = mock(StoredBlock.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(false).when(target).isTransactionRelevant(transactionMock);
            //Act Statement(s)
            target.receiveFromBlock(transactionMock, storedBlockMock, AbstractBlockChain.NewBlockType.BEST_CHAIN, 0);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).isTransactionRelevant(transactionMock);
        }
    }

    //Sapient generated method id: ${b985e055-b16a-34a8-9a19-1e0e638df3f6}, hash: 26111F2BF29DE96695458A781853B32F
    @Ignore()
    @Test()
    public void receiveFromBlockWhenIsTransactionRelevantTxThrowsIllegalStateException() throws VerificationException, ScriptException {
        /* Branches:
         * (!isTransactionRelevant(tx)) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Transaction transactionMock = mock(Transaction.class);
        StoredBlock storedBlockMock = mock(StoredBlock.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(true).when(target).isTransactionRelevant(transactionMock);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.receiveFromBlock(transactionMock, storedBlockMock, AbstractBlockChain.NewBlockType.BEST_CHAIN, 0);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).isTransactionRelevant(transactionMock);
        }
    }

    //Sapient generated method id: ${870cd27e-94f3-3787-96cd-b734d5a119a8}, hash: AF3BF3190F717FFAB21487E8D32F4379
    @Test()
    public void sortTxnsByDependencyWhenINotLessThanResultSizeMinus1() {
        /* Branches:
         * (i < result.size() - 1) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            Set<Transaction> transactionSet = new HashSet<>();
            //Act Statement(s)
            List<Transaction> result = target.sortTxnsByDependency(transactionSet);
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${becd6675-9e48-3d4c-84fe-e160d8a05734}, hash: D4E69B442C4EB8DB2622D72FC66B470B
    @Test()
    public void spendsWhenTxInputGetOutpointHashEqualsTxBGetTxId() {
        /* Branches:
         * (for-each(txA.getInputs())) : true
         * (txInput.getOutpoint().hash().equals(txB.getTxId())) : true
         */
        //Arrange Statement(s)
        Transaction txAMock = mock(Transaction.class);
        Transaction transactionMock = mock(Transaction.class);
        TransactionOutPoint transactionOutPointMock = mock(TransactionOutPoint.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Transaction txBMock = mock(Transaction.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            byte[] byteArray = new byte[]{};
            TransactionInput transactionInput = new TransactionInput(transactionMock, byteArray, transactionOutPointMock);
            List<TransactionInput> transactionInputList = new ArrayList<>();
            transactionInputList.add(transactionInput);
            doReturn(transactionInputList).when(txAMock).getInputs();
            doReturn(sha256HashMock).when(transactionOutPointMock).hash();
            doReturn(sha256HashMock).when(txBMock).getTxId();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.spends(txAMock, txBMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            verify(txAMock).getInputs();
            verify(transactionOutPointMock).hash();
            verify(txBMock).getTxId();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${7b619655-b8f1-3f47-bfc0-342279400b4a}, hash: A12E5215AB9B5FAF3A258253ABC361B0
    @Test()
    public void spendsWhenTxInputGetOutpointHashNotEqualsTxBGetTxId() {
        /* Branches:
         * (for-each(txA.getInputs())) : true
         * (txInput.getOutpoint().hash().equals(txB.getTxId())) : false
         */
        //Arrange Statement(s)
        Transaction txAMock = mock(Transaction.class);
        Transaction transactionMock = mock(Transaction.class);
        TransactionOutPoint transactionOutPointMock = mock(TransactionOutPoint.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Transaction txBMock = mock(Transaction.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            byte[] byteArray = new byte[]{};
            TransactionInput transactionInput = new TransactionInput(transactionMock, byteArray, transactionOutPointMock);
            List<TransactionInput> transactionInputList = new ArrayList<>();
            transactionInputList.add(transactionInput);
            doReturn(transactionInputList).when(txAMock).getInputs();
            doReturn(sha256HashMock).when(transactionOutPointMock).hash();
            doReturn(sha256HashMock2).when(txBMock).getTxId();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.spends(txAMock, txBMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(txAMock).getInputs();
            verify(transactionOutPointMock).hash();
            verify(txBMock).getTxId();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${fa330a93-2f91-3039-a945-ae54d43d1db7}, hash: 290E6D1E76E3A933860C087AC5449F48
    @Ignore()
    @Test()
    public void notifyNewBestBlockWhenNewBlockHashEqualsGetLastBlockSeenHash() throws VerificationException, IOException {
        /* Branches:
         * (newBlockHash.equals(getLastBlockSeenHash())) : true
         */
        //Arrange Statement(s)
        Block blockMock = mock(Block.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(null).when(blockMock).getHash();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 0);
            //Act Statement(s)
            target.notifyNewBestBlock(storedBlock);
            //Assert statement(s)
            verify(blockMock).getHash();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${e09bf664-bdcb-3d88-8d01-d3c26e86328e}, hash: CAA0A6184A51944608E3A390A06B0A36
    @Ignore()
    @Test()
    public void notifyNewBestBlockWhenConfidenceChangedEntrySetIsNotEmptyThrowsIllegalStateException() throws VerificationException {
        /* Branches:
         * (newBlockHash.equals(getLastBlockSeenHash())) : false
         * (for-each(transactions)) : true
         * (ignoreNextNewBlock.contains(tx.getTxId())) : false
         * (confidence.getConfidenceType() == ConfidenceType.BUILDING) : true
         * (confidence.incrementDepthInBlocks() > Context.getOrCreate().getEventHorizon()) : true
         * (insideReorg) : false  #  inside informConfidenceListenersIfNotReorganizing method
         * (for-each(confidenceChanged.entrySet())) : true  #  inside informConfidenceListenersIfNotReorganizing method
         */
        //Arrange Statement(s)
        Block blockMock = mock(Block.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Context contextMock = mock(Context.class);
        TxConfidenceTable txConfidenceTableMock = mock(TxConfidenceTable.class);
        TransactionConfidence transactionConfidenceMock = mock(TransactionConfidence.class);
        Transaction transactionMock = mock(Transaction.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        Context contextMock2 = mock(Context.class);
        TxConfidenceTable txConfidenceTableMock2 = mock(TxConfidenceTable.class);
        TransactionConfidence transactionConfidenceMock2 = mock(TransactionConfidence.class);
        try (MockedStatic<Context> context = mockStatic(Context.class, CALLS_REAL_METHODS);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(sha256HashMock).when(blockMock).getHash();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            doReturn(txConfidenceTableMock).when(contextMock).getConfidenceTable();
            doReturn(transactionConfidenceMock).when(txConfidenceTableMock).getConfidence(transactionMock);
            doReturn(TransactionConfidence.ConfidenceType.BUILDING).when(transactionConfidenceMock).getConfidenceType();
            doReturn(101).when(transactionConfidenceMock).incrementDepthInBlocks();
            doNothing().when(transactionConfidenceMock).clearBroadcastBy();
            doReturn(sha256HashMock2).when(transactionMock).getTxId();
            context.when(() -> Context.get()).thenReturn(contextMock).thenReturn(contextMock2);
            doReturn(txConfidenceTableMock2).when(contextMock2).getConfidenceTable();
            doReturn(transactionConfidenceMock2).when(txConfidenceTableMock2).getConfidence(transactionMock);
            doNothing().when(transactionConfidenceMock2).queueListeners(TransactionConfidence.Listener.ChangeReason.DEPTH);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            Set<Transaction> transactionSet = new HashSet<>();
            transactionSet.add(transactionMock);
            doReturn(transactionSet).when(target).getTransactions(true);
            thrown.expect(IllegalStateException.class);
            StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 0);
            //Act Statement(s)
            target.notifyNewBestBlock(storedBlock);
            //Assert statement(s)
            verify(blockMock, atLeast(1)).getHash();
            verify(blockMock, atLeast(1)).time();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            context.verify(() -> Context.get(), atLeast(2));
            verify(contextMock, atLeast(1)).getConfidenceTable();
            verify(txConfidenceTableMock, atLeast(1)).getConfidence(transactionMock);
            verify(transactionConfidenceMock, atLeast(1)).getConfidenceType();
            verify(transactionConfidenceMock, atLeast(1)).incrementDepthInBlocks();
            verify(transactionConfidenceMock, atLeast(1)).clearBroadcastBy();
            verify(transactionMock, atLeast(1)).getTxId();
            verify(contextMock2, atLeast(1)).getConfidenceTable();
            verify(txConfidenceTableMock2, atLeast(1)).getConfidence(transactionMock);
            verify(transactionConfidenceMock2, atLeast(1)).queueListeners(TransactionConfidence.Listener.ChangeReason.DEPTH);
            verify(target, atLeast(1)).getTransactions(true);
        }
    }

    //Sapient generated method id: ${d17eb89a-1405-3e3e-a70c-5c3c9260937c}, hash: 18EF5F93D8DE8DA2F4CAFA89DF268607
    @Test()
    public void notifyNewBestBlockWhenConfidenceChangedEntrySetIsEmptyAndNotHardSaveOnNextBlock() throws VerificationException, IOException {
        /* Branches:
         * (newBlockHash.equals(getLastBlockSeenHash())) : false
         * (for-each(transactions)) : true
         * (ignoreNextNewBlock.contains(tx.getTxId())) : false
         * (confidence.getConfidenceType() == ConfidenceType.BUILDING) : false
         * (insideReorg) : false  #  inside informConfidenceListenersIfNotReorganizing method
         * (for-each(confidenceChanged.entrySet())) : false  #  inside informConfidenceListenersIfNotReorganizing method
         * (hardSaveOnNextBlock) : false
         */
        //Arrange Statement(s)
        Block blockMock = mock(Block.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Context contextMock = mock(Context.class);
        TxConfidenceTable txConfidenceTableMock = mock(TxConfidenceTable.class);
        TransactionConfidence transactionConfidenceMock = mock(TransactionConfidence.class);
        Transaction transactionMock = mock(Transaction.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(sha256HashMock).when(blockMock).getHash();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            context.when(() -> Context.get()).thenReturn(contextMock);
            doReturn(txConfidenceTableMock).when(contextMock).getConfidenceTable();
            doReturn(transactionConfidenceMock).when(txConfidenceTableMock).getConfidence(transactionMock);
            doReturn(TransactionConfidence.ConfidenceType.IN_CONFLICT).when(transactionConfidenceMock).getConfidenceType();
            doReturn(sha256HashMock2).when(transactionMock).getTxId();
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            Set<Transaction> transactionSet = new HashSet<>();
            transactionSet.add(transactionMock);
            doReturn(transactionSet).when(target).getTransactions(true);
            doNothing().when(target).maybeQueueOnWalletChanged();
            doNothing().when(target).saveLater();
            StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 0);
            //Act Statement(s)
            target.notifyNewBestBlock(storedBlock);
            //Assert statement(s)
            verify(blockMock).getHash();
            verify(blockMock).time();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            context.verify(() -> Context.get(), atLeast(1));
            verify(contextMock).getConfidenceTable();
            verify(txConfidenceTableMock).getConfidence(transactionMock);
            verify(transactionConfidenceMock).getConfidenceType();
            verify(transactionMock).getTxId();
            verify(target).getTransactions(true);
            verify(target).maybeQueueOnWalletChanged();
            verify(target).saveLater();
        }
    }

    //Sapient generated method id: ${b7012034-db6b-3685-9504-911500abd017}, hash: 8F3EAFF4BCA42FECDCC62EDEB8A44351
    @Test()
    public void maybeCommitTxWhenONotIsMineOrWatchedThisThrowsIllegalStateException() throws VerificationException {
        /* Branches:
         * (pending.containsKey(tx.getTxId())) : false
         * (for-each(tx.getOutputs())) : true
         * (!o.isMineOrWatched(this)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: valueSentToMe
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Transaction txMock = mock(Transaction.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        TransactionOutput transactionOutputMock = mock(TransactionOutput.class);
        Coin coinMock = mock(Coin.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Coin coinMock2 = mock(Coin.class);
        try (MockedStatic<Transaction> transaction = mockStatic(Transaction.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(sha256HashMock, sha256HashMock2).when(txMock).getTxId();
            doNothing().when(txMock).setUpdateTime((Instant) any());
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(transactionOutputMock);
            doReturn(transactionOutputList).when(txMock).getOutputs();
            doReturn(coinMock).when(transactionOutputMock).getValue();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            transaction.when(() -> Transaction.verify(networkMock, txMock)).thenAnswer((Answer<Void>) invocation -> null);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(coinMock2).when(target).getBalance();
            doReturn(false).when(transactionOutputMock).isMineOrWatched(target);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.maybeCommitTx(txMock);
            //Assert statement(s)
            verify(txMock, times(2)).getTxId();
            verify(txMock).setUpdateTime((Instant) any());
            verify(txMock).getOutputs();
            verify(transactionOutputMock).getValue();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            transaction.verify(() -> Transaction.verify(networkMock, txMock), atLeast(1));
            verify(target).getBalance();
            verify(transactionOutputMock).isMineOrWatched(target);
        }
    }

    //Sapient generated method id: ${9910b474-6b4b-3ec5-b8b3-f9cb31153707}, hash: C019753FA7AC13F5A67027452BDB7657
    @Test()
    public void commitTxTest() throws VerificationException, UTXOProviderException, IOException {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Transaction transactionMock = mock(Transaction.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(false).when(target).maybeCommitTx(transactionMock);
            //Act Statement(s)
            target.commitTx(transactionMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            verify(target).maybeCommitTx(transactionMock);
        }
    }

    //Sapient generated method id: ${3c9d1d68-d1db-33a4-982d-f8a5c9520093}, hash: 913A822ED3D7AEB991437574341A60CC
    @Ignore()
    @Test()
    public void addChangeEventListenerTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Executor executorMock = mock(Executor.class);
        WalletChangeEventListener walletChangeEventListenerMock = mock(WalletChangeEventListener.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).addChangeEventListener(executorMock, walletChangeEventListenerMock);
            //Act Statement(s)
            target.addChangeEventListener(walletChangeEventListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).addChangeEventListener(executorMock, walletChangeEventListenerMock);
        }
    }

    //Sapient generated method id: ${50ff35e8-2bad-3dda-9edb-74e54504c3d8}, hash: FFCF8F4506B87DE694DDE764E11DF5FB
    @Test()
    public void addChangeEventListener1Test() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Executor executorMock = mock(Executor.class);
        WalletChangeEventListener walletChangeEventListenerMock = mock(WalletChangeEventListener.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.addChangeEventListener(executorMock, walletChangeEventListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${3f12a6b7-8318-30cf-ab7f-ebb7339fa343}, hash: CB63ECC4F7C1806845BE601DA0E877C2
    @Ignore()
    @Test()
    public void addCoinsReceivedEventListenerTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Executor executorMock = mock(Executor.class);
        WalletCoinsReceivedEventListener walletCoinsReceivedEventListenerMock = mock(WalletCoinsReceivedEventListener.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).addCoinsReceivedEventListener(executorMock, walletCoinsReceivedEventListenerMock);
            //Act Statement(s)
            target.addCoinsReceivedEventListener(walletCoinsReceivedEventListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).addCoinsReceivedEventListener(executorMock, walletCoinsReceivedEventListenerMock);
        }
    }

    //Sapient generated method id: ${7646a56a-8546-3880-92c7-9199b129ecc2}, hash: F937799EFD4F1FBE7BB15444C7CCAA7F
    @Test()
    public void addCoinsReceivedEventListener1Test() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Executor executorMock = mock(Executor.class);
        WalletCoinsReceivedEventListener walletCoinsReceivedEventListenerMock = mock(WalletCoinsReceivedEventListener.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.addCoinsReceivedEventListener(executorMock, walletCoinsReceivedEventListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${f7b88beb-140a-391b-a780-82b0a596fb9d}, hash: 410B5B70CA77EAD19EA95DAAED236A57
    @Ignore()
    @Test()
    public void addCoinsSentEventListenerTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Executor executorMock = mock(Executor.class);
        WalletCoinsSentEventListener walletCoinsSentEventListenerMock = mock(WalletCoinsSentEventListener.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).addCoinsSentEventListener(executorMock, walletCoinsSentEventListenerMock);
            //Act Statement(s)
            target.addCoinsSentEventListener(walletCoinsSentEventListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).addCoinsSentEventListener(executorMock, walletCoinsSentEventListenerMock);
        }
    }

    //Sapient generated method id: ${1f5c80ac-fde1-31e9-8603-d644ae038f9a}, hash: 98AB1B9DB38848CA80C036861CB34250
    @Test()
    public void addCoinsSentEventListener1Test() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Executor executorMock = mock(Executor.class);
        WalletCoinsSentEventListener walletCoinsSentEventListenerMock = mock(WalletCoinsSentEventListener.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.addCoinsSentEventListener(executorMock, walletCoinsSentEventListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${33f6bebb-a434-3b7d-a193-8d63b415b1d5}, hash: A37D7C1BC49E5F7CAEA837C2C2EF7632
    @Ignore()
    @Test()
    public void addKeyChainEventListenerTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        KeyChainEventListener keyChainEventListenerMock = mock(KeyChainEventListener.class);
        Executor executorMock = mock(Executor.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(keyChainGroupMock).addEventListener(keyChainEventListenerMock, executorMock);
            //Act Statement(s)
            target.addKeyChainEventListener(keyChainEventListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).addEventListener(keyChainEventListenerMock, executorMock);
        }
    }

    //Sapient generated method id: ${07f79e08-eab1-37d9-8bf2-430e020e1dd0}, hash: 08D214A013904B364D1981518C0FB9F4
    @Test()
    public void addKeyChainEventListener1Test() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        KeyChainEventListener keyChainEventListenerMock = mock(KeyChainEventListener.class);
        Executor executorMock = mock(Executor.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(keyChainGroupMock).addEventListener(keyChainEventListenerMock, executorMock);
            //Act Statement(s)
            target.addKeyChainEventListener(executorMock, keyChainEventListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).addEventListener(keyChainEventListenerMock, executorMock);
        }
    }

    //Sapient generated method id: ${9a3dcec5-b745-3460-bf55-204c7709e4a4}, hash: 8350226674DBF913018149AE7176F8D2
    @Test()
    public void addCurrentKeyChangeEventListenerTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        CurrentKeyChangeEventListener currentKeyChangeEventListenerMock = mock(CurrentKeyChangeEventListener.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(keyChainGroupMock).addCurrentKeyChangeEventListener(currentKeyChangeEventListenerMock);
            //Act Statement(s)
            target.addCurrentKeyChangeEventListener(currentKeyChangeEventListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).addCurrentKeyChangeEventListener(currentKeyChangeEventListenerMock);
        }
    }

    //Sapient generated method id: ${ba857baf-a904-38fa-9ed0-0c7fffc046c9}, hash: 4C53AA92FFBEED3B62B6CB45D5F799E9
    @Test()
    public void addCurrentKeyChangeEventListener1Test() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        CurrentKeyChangeEventListener currentKeyChangeEventListenerMock = mock(CurrentKeyChangeEventListener.class);
        Executor executorMock = mock(Executor.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(keyChainGroupMock).addCurrentKeyChangeEventListener(currentKeyChangeEventListenerMock, executorMock);
            //Act Statement(s)
            target.addCurrentKeyChangeEventListener(executorMock, currentKeyChangeEventListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).addCurrentKeyChangeEventListener(currentKeyChangeEventListenerMock, executorMock);
        }
    }

    //Sapient generated method id: ${32cc600b-df95-3fb4-a78a-ecd393899db2}, hash: 5F95DB2A4603A3F7D056FB119A87534C
    @Ignore()
    @Test()
    public void addReorganizeEventListenerTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Executor executorMock = mock(Executor.class);
        WalletReorganizeEventListener walletReorganizeEventListenerMock = mock(WalletReorganizeEventListener.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).addReorganizeEventListener(executorMock, walletReorganizeEventListenerMock);
            //Act Statement(s)
            target.addReorganizeEventListener(walletReorganizeEventListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).addReorganizeEventListener(executorMock, walletReorganizeEventListenerMock);
        }
    }

    //Sapient generated method id: ${16ddc939-a344-3ce9-ab5d-2ad9c6645d5b}, hash: 4263741110CCD8A5A13EB860FCF43096
    @Test()
    public void addReorganizeEventListener1Test() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Executor executorMock = mock(Executor.class);
        WalletReorganizeEventListener walletReorganizeEventListenerMock = mock(WalletReorganizeEventListener.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.addReorganizeEventListener(executorMock, walletReorganizeEventListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${a52f204f-af60-3292-b6dd-85c45d41e635}, hash: 6B1035DBD009BEF402FC0FAB5EA9A86D
    @Ignore()
    @Test()
    public void addScriptsChangeEventListenerTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Executor executorMock = mock(Executor.class);
        ScriptsChangeEventListener scriptsChangeEventListenerMock = mock(ScriptsChangeEventListener.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).addScriptsChangeEventListener(executorMock, scriptsChangeEventListenerMock);
            //Act Statement(s)
            target.addScriptsChangeEventListener(scriptsChangeEventListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).addScriptsChangeEventListener(executorMock, scriptsChangeEventListenerMock);
        }
    }

    //Sapient generated method id: ${91984c56-7e9c-308c-88c0-116f21050ce7}, hash: F6E47C5AF855C988010B5663CE40A256
    @Test()
    public void addScriptsChangeEventListener1Test() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Executor executorMock = mock(Executor.class);
        ScriptsChangeEventListener scriptsChangeEventListenerMock = mock(ScriptsChangeEventListener.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.addScriptsChangeEventListener(executorMock, scriptsChangeEventListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${e52ee466-fedd-3b95-a15f-a217188616e7}, hash: B837BCD8FE87B130DF0E7CB84A97BC8B
    @Ignore()
    @Test()
    public void addTransactionConfidenceEventListenerTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Executor executorMock = mock(Executor.class);
        TransactionConfidenceEventListener transactionConfidenceEventListenerMock = mock(TransactionConfidenceEventListener.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).addTransactionConfidenceEventListener(executorMock, transactionConfidenceEventListenerMock);
            //Act Statement(s)
            target.addTransactionConfidenceEventListener(transactionConfidenceEventListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).addTransactionConfidenceEventListener(executorMock, transactionConfidenceEventListenerMock);
        }
    }

    //Sapient generated method id: ${7b7af9a4-a063-3902-9a5c-b8c7dde47634}, hash: 753EA9DD5318BA52B6D52D062A0EC8D9
    @Test()
    public void addTransactionConfidenceEventListener1Test() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Executor executorMock = mock(Executor.class);
        TransactionConfidenceEventListener transactionConfidenceEventListenerMock = mock(TransactionConfidenceEventListener.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.addTransactionConfidenceEventListener(executorMock, transactionConfidenceEventListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${a0a75454-dc62-36ea-b4f8-6b11c786935f}, hash: 9999C17338AE6DBD45E00E2858BA22AF
    @Test()
    public void removeChangeEventListenerWhenListenerRegistrationRemoveFromListListenerChangeListeners() {
        /* Branches:
         * (ListenerRegistration.removeFromList(listener, changeListeners)) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        WalletChangeEventListener walletChangeEventListenerMock = mock(WalletChangeEventListener.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(walletChangeEventListenerMock), anyList())).thenReturn(true);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.removeChangeEventListener(walletChangeEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(walletChangeEventListenerMock), anyList()));
        }
    }

    //Sapient generated method id: ${ce4f1349-1094-3915-9804-d9e7975ffc94}, hash: 5A15F1DBF1EDE2E9AAD769A235856F21
    @Test()
    public void removeChangeEventListenerWhenListenerRegistrationNotRemoveFromListListenerChangeListeners() {
        /* Branches:
         * (ListenerRegistration.removeFromList(listener, changeListeners)) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        WalletChangeEventListener walletChangeEventListenerMock = mock(WalletChangeEventListener.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(walletChangeEventListenerMock), anyList())).thenReturn(false);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.removeChangeEventListener(walletChangeEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(walletChangeEventListenerMock), anyList()));
        }
    }

    //Sapient generated method id: ${b4f565dc-c9fa-3f28-bb29-132c13f6fc73}, hash: EE563886B9B18D2A334AE3E56F97EB36
    @Test()
    public void removeCoinsReceivedEventListenerWhenListenerRegistrationRemoveFromListListenerCoinsReceivedListeners() {
        /* Branches:
         * (ListenerRegistration.removeFromList(listener, coinsReceivedListeners)) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        WalletCoinsReceivedEventListener walletCoinsReceivedEventListenerMock = mock(WalletCoinsReceivedEventListener.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(walletCoinsReceivedEventListenerMock), anyList())).thenReturn(true);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.removeCoinsReceivedEventListener(walletCoinsReceivedEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(walletCoinsReceivedEventListenerMock), anyList()));
        }
    }

    //Sapient generated method id: ${99f04874-edae-3ce4-a863-fb1928a95c35}, hash: A5DC502011EAACEBABAFC46F785600B0
    @Test()
    public void removeCoinsReceivedEventListenerWhenListenerRegistrationNotRemoveFromListListenerCoinsReceivedListeners() {
        /* Branches:
         * (ListenerRegistration.removeFromList(listener, coinsReceivedListeners)) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        WalletCoinsReceivedEventListener walletCoinsReceivedEventListenerMock = mock(WalletCoinsReceivedEventListener.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(walletCoinsReceivedEventListenerMock), anyList())).thenReturn(false);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.removeCoinsReceivedEventListener(walletCoinsReceivedEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(walletCoinsReceivedEventListenerMock), anyList()));
        }
    }

    //Sapient generated method id: ${7007513d-6237-3825-961d-ffe3248c6fcb}, hash: 225DB96EF219480DFB52DA84F1C1BBF7
    @Test()
    public void removeCoinsSentEventListenerWhenListenerRegistrationRemoveFromListListenerCoinsSentListeners() {
        /* Branches:
         * (ListenerRegistration.removeFromList(listener, coinsSentListeners)) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        WalletCoinsSentEventListener walletCoinsSentEventListenerMock = mock(WalletCoinsSentEventListener.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(walletCoinsSentEventListenerMock), anyList())).thenReturn(true);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.removeCoinsSentEventListener(walletCoinsSentEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(walletCoinsSentEventListenerMock), anyList()));
        }
    }

    //Sapient generated method id: ${4bdffffb-b0cd-342a-a8fc-25f754748b41}, hash: F237B04E469FF164A14545E96E70ECDE
    @Test()
    public void removeCoinsSentEventListenerWhenListenerRegistrationNotRemoveFromListListenerCoinsSentListeners() {
        /* Branches:
         * (ListenerRegistration.removeFromList(listener, coinsSentListeners)) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        WalletCoinsSentEventListener walletCoinsSentEventListenerMock = mock(WalletCoinsSentEventListener.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(walletCoinsSentEventListenerMock), anyList())).thenReturn(false);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.removeCoinsSentEventListener(walletCoinsSentEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(walletCoinsSentEventListenerMock), anyList()));
        }
    }

    //Sapient generated method id: ${f74d0e53-67a4-3fda-873e-cc2253e1576c}, hash: 288D0C46DD4AEACA0E635FBBEC4BD25C
    @Test()
    public void removeKeyChainEventListenerWhenKeyChainGroupRemoveEventListenerListener() {
        /* Branches:
         * (keyChainGroup.removeEventListener(listener)) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        KeyChainEventListener keyChainEventListenerMock = mock(KeyChainEventListener.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(true).when(keyChainGroupMock).removeEventListener(keyChainEventListenerMock);
            //Act Statement(s)
            boolean result = target.removeKeyChainEventListener(keyChainEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).removeEventListener(keyChainEventListenerMock);
        }
    }

    //Sapient generated method id: ${5bf5b060-3a9c-3238-af65-1a8a57822b50}, hash: AA94FD4D074135A964E6C6BA65305345
    @Test()
    public void removeKeyChainEventListenerWhenKeyChainGroupNotRemoveEventListenerListener() {
        /* Branches:
         * (keyChainGroup.removeEventListener(listener)) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        KeyChainEventListener keyChainEventListenerMock = mock(KeyChainEventListener.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(false).when(keyChainGroupMock).removeEventListener(keyChainEventListenerMock);
            //Act Statement(s)
            boolean result = target.removeKeyChainEventListener(keyChainEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).removeEventListener(keyChainEventListenerMock);
        }
    }

    //Sapient generated method id: ${b29ff06d-467d-3b25-94b4-7ab65be81c8c}, hash: 1C353E459F123591BF528B10900A4A02
    @Test()
    public void removeCurrentKeyChangeEventListenerWhenKeyChainGroupRemoveCurrentKeyChangeEventListenerListener() {
        /* Branches:
         * (keyChainGroup.removeCurrentKeyChangeEventListener(listener)) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        CurrentKeyChangeEventListener currentKeyChangeEventListenerMock = mock(CurrentKeyChangeEventListener.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(true).when(keyChainGroupMock).removeCurrentKeyChangeEventListener(currentKeyChangeEventListenerMock);
            //Act Statement(s)
            boolean result = target.removeCurrentKeyChangeEventListener(currentKeyChangeEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).removeCurrentKeyChangeEventListener(currentKeyChangeEventListenerMock);
        }
    }

    //Sapient generated method id: ${ac10c067-7f5d-3915-aa94-ca115afada03}, hash: ED3D7FF9F79374D26476644940D31456
    @Test()
    public void removeCurrentKeyChangeEventListenerWhenKeyChainGroupNotRemoveCurrentKeyChangeEventListenerListener() {
        /* Branches:
         * (keyChainGroup.removeCurrentKeyChangeEventListener(listener)) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        CurrentKeyChangeEventListener currentKeyChangeEventListenerMock = mock(CurrentKeyChangeEventListener.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(false).when(keyChainGroupMock).removeCurrentKeyChangeEventListener(currentKeyChangeEventListenerMock);
            //Act Statement(s)
            boolean result = target.removeCurrentKeyChangeEventListener(currentKeyChangeEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).removeCurrentKeyChangeEventListener(currentKeyChangeEventListenerMock);
        }
    }

    //Sapient generated method id: ${5a7abd2c-4d4e-37d9-95d0-886af982b368}, hash: 638BDC615916A50BAE5B090F6BFF7884
    @Test()
    public void removeReorganizeEventListenerWhenListenerRegistrationRemoveFromListListenerReorganizeListeners() {
        /* Branches:
         * (ListenerRegistration.removeFromList(listener, reorganizeListeners)) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        WalletReorganizeEventListener walletReorganizeEventListenerMock = mock(WalletReorganizeEventListener.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(walletReorganizeEventListenerMock), anyList())).thenReturn(true);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.removeReorganizeEventListener(walletReorganizeEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(walletReorganizeEventListenerMock), anyList()));
        }
    }

    //Sapient generated method id: ${cb46e333-40ee-3825-9c87-bb6e4d221829}, hash: 2B544C3983726BD401AC9ABEE9919220
    @Test()
    public void removeReorganizeEventListenerWhenListenerRegistrationNotRemoveFromListListenerReorganizeListeners() {
        /* Branches:
         * (ListenerRegistration.removeFromList(listener, reorganizeListeners)) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        WalletReorganizeEventListener walletReorganizeEventListenerMock = mock(WalletReorganizeEventListener.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(walletReorganizeEventListenerMock), anyList())).thenReturn(false);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.removeReorganizeEventListener(walletReorganizeEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(walletReorganizeEventListenerMock), anyList()));
        }
    }

    //Sapient generated method id: ${f4730e82-b5aa-3b73-b385-3a5a62c13f42}, hash: F93CF40364E8FDC9C7918A72A6ADA315
    @Test()
    public void removeScriptsChangeEventListenerWhenListenerRegistrationRemoveFromListListenerScriptsChangeListeners() {
        /* Branches:
         * (ListenerRegistration.removeFromList(listener, scriptsChangeListeners)) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        ScriptsChangeEventListener scriptsChangeEventListenerMock = mock(ScriptsChangeEventListener.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(scriptsChangeEventListenerMock), anyList())).thenReturn(true);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.removeScriptsChangeEventListener(scriptsChangeEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(scriptsChangeEventListenerMock), anyList()));
        }
    }

    //Sapient generated method id: ${6fb2f203-4300-3bf8-bd10-fbb1ac8e9b52}, hash: 393194FA0DAA42E1D16895D3C2D6486B
    @Test()
    public void removeScriptsChangeEventListenerWhenListenerRegistrationNotRemoveFromListListenerScriptsChangeListeners() {
        /* Branches:
         * (ListenerRegistration.removeFromList(listener, scriptsChangeListeners)) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        ScriptsChangeEventListener scriptsChangeEventListenerMock = mock(ScriptsChangeEventListener.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(scriptsChangeEventListenerMock), anyList())).thenReturn(false);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.removeScriptsChangeEventListener(scriptsChangeEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(scriptsChangeEventListenerMock), anyList()));
        }
    }

    //Sapient generated method id: ${da722f92-2dbe-31bb-90ab-54bac52df054}, hash: 99EBA4D5C1832B928B78CC25F9275ACD
    @Test()
    public void removeTransactionConfidenceEventListenerWhenListenerRegistrationRemoveFromListListenerTransactionConfidenceListeners() {
        /* Branches:
         * (ListenerRegistration.removeFromList(listener, transactionConfidenceListeners)) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        TransactionConfidenceEventListener transactionConfidenceEventListenerMock = mock(TransactionConfidenceEventListener.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(transactionConfidenceEventListenerMock), anyList())).thenReturn(true);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.removeTransactionConfidenceEventListener(transactionConfidenceEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(transactionConfidenceEventListenerMock), anyList()));
        }
    }

    //Sapient generated method id: ${e4133145-9558-3a0d-a013-3f0f4185ef9f}, hash: 6B6E13D443461E6B3E15880F96FBDB5B
    @Test()
    public void removeTransactionConfidenceEventListenerWhenListenerRegistrationNotRemoveFromListListenerTransactionConfidenceListeners() {
        /* Branches:
         * (ListenerRegistration.removeFromList(listener, transactionConfidenceListeners)) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        TransactionConfidenceEventListener transactionConfidenceEventListenerMock = mock(TransactionConfidenceEventListener.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(transactionConfidenceEventListenerMock), anyList())).thenReturn(false);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.removeTransactionConfidenceEventListener(transactionConfidenceEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(transactionConfidenceEventListenerMock), anyList()));
        }
    }

    //Sapient generated method id: ${79503a13-1d2b-3c74-988a-8198408a0a5b}, hash: 516C6C559484D44E1F84849DCC64D52B
    @Test()
    public void maybeQueueOnWalletChangedThrowsIllegalStateException() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.maybeQueueOnWalletChanged();
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${33893bdd-710a-3ac1-8c81-6b0095212c4b}, hash: 46ECC8C97110615F0DAF96E86C906955
    @Test()
    public void queueOnCoinsReceivedThrowsIllegalStateException() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Transaction transactionMock = mock(Transaction.class);
        Coin coinMock = mock(Coin.class);
        Coin coinMock2 = mock(Coin.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.queueOnCoinsReceived(transactionMock, coinMock, coinMock2);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${af100864-0617-30d5-be78-46d1423f9d16}, hash: A306CBDD1137B704E7479E5E4D4E1ABE
    @Test()
    public void queueOnCoinsSentThrowsIllegalStateException() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Transaction transactionMock = mock(Transaction.class);
        Coin coinMock = mock(Coin.class);
        Coin coinMock2 = mock(Coin.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.queueOnCoinsSent(transactionMock, coinMock, coinMock2);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${e0b584fe-c3ac-3411-bc5a-08cb56a98de3}, hash: EFC8D34B81846A5DB1CB268D9568B959
    @Test()
    public void queueOnReorganizeThrowsIllegalStateException() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.queueOnReorganize();
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${fdcb1753-0dfd-3add-8b6a-0f4ce0638d26}, hash: B9C27C4733B24B9B66886ED1682750AF
    @Test()
    public void queueOnScriptsChangedWhenScriptsChangeListenersIsEmpty() {
        /* Branches:
         * (for-each(scriptsChangeListeners)) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Script> scriptList = new ArrayList<>();
            //Act Statement(s)
            target.queueOnScriptsChanged(scriptList, false);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${727ad034-7951-333e-9dfc-92793a7ca97c}, hash: 63FB536BBBA9855463A6D57C80D4FB3B
    @Test()
    public void getTransactionsWhenIncludeDead() {
        /* Branches:
         * (includeDead) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            Set<Transaction> result = target.getTransactions(true);
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${41f5bc73-59d8-3f46-a5cb-6a0cb962fdf6}, hash: EDA85ADD5220B40B350D737AB8642F27
    @Test()
    public void getWalletTransactionsWhenPoolIsEmpty() {
        /* Branches:
         * (for-each(pool)) : false  #  inside addWalletTransactionsToSet method
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            Iterable<WalletTransaction> result = target.getWalletTransactions();
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${31d4fd6b-31e7-3a83-8250-0279a417fc4e}, hash: 89D5C6C541EBD160165902C651FE28C6
    @Test()
    public void addWalletTransactionThrowsIllegalStateException() {
        //Arrange Statement(s)
        WalletTransaction wtxMock = mock(WalletTransaction.class);
        Transaction transactionMock = mock(Transaction.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(WalletTransaction.Pool.UNSPENT).when(wtxMock).getPool();
            doReturn(transactionMock).when(wtxMock).getTransaction();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.addWalletTransaction(wtxMock);
            //Assert statement(s)
            verify(wtxMock).getPool();
            verify(wtxMock).getTransaction();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${7187b82b-e2d9-39df-9083-1083d676af3a}, hash: A4AD5EF4BAAC7661C8F5DE7446982420
    @Test()
    public void getTransactionsByTimeTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Transaction> transactionList = new ArrayList<>();
            doReturn(transactionList).when(target).getRecentTransactions(0, false);
            //Act Statement(s)
            List<Transaction> result = target.getTransactionsByTime();
            //Assert statement(s)
            assertThat(result, equalTo(transactionList));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).getRecentTransactions(0, false);
        }
    }

    //Sapient generated method id: ${9ea42981-0afc-3e7e-a21b-d16be2c2c6f3}, hash: D53DAFCCBA8DA943DBE3FD390BEA01B4
    @Test()
    public void getRecentTransactionsWhenNumTransactionsLessThan0ThrowsIllegalArgumentException() {
        /* Branches:
         * (numTransactions >= 0) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.getRecentTransactions(-1, false);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${6cfddb8e-e810-3a11-bd18-3616c8760c59}, hash: A1876FA9CC35E166E3243B28621797F4
    @Test()
    public void getRecentTransactionsWhenNumTransactionsEquals0AndNumTransactionsEqualsAllSize() {
        /* Branches:
         * (numTransactions >= 0) : true
         * (numTransactions > size) : false
         * (numTransactions == 0) : true
         * (numTransactions == all.size()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock2 = mock(Network.class);
        try (MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class, CALLS_REAL_METHODS)) {
            ReentrantLock reentrantLock = Threading.lock("Wallet-KeyChainGroup lock");
            threading.when(() -> Threading.lock("Wallet-KeyChainGroup lock")).thenReturn(reentrantLock);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            KeyChainGroup keyChainGroup = KeyChainGroup.createBasic(networkMock2);
            target = spy(new Wallet(networkMock, keyChainGroup));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            Set<Transaction> transactionSet = new HashSet<>();
            doReturn(transactionSet).when(target).getTransactions(false);
            //Act Statement(s)
            List<Transaction> result = target.getRecentTransactions(0, false);
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            threading.verify(() -> Threading.lock("Wallet-KeyChainGroup lock"), atLeast(1));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            verify(target, atLeast(1)).getTransactions(false);
        }
    }

    //Sapient generated method id: ${952def72-e413-30c5-97f3-0716bcc04181}, hash: 55D1EFF0C9A5AC96DA828C7568C2FCE4
    @Test()
    public void getTransactionTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            Transaction result = target.getTransaction(sha256HashMock);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${7f5e6b4c-3de0-3eb4-8b0b-87663e2ea8f9}, hash: 11C30CF76F068158A29598D314700F27
    @Test()
    public void getTransactionPoolWhenSwitchPoolCaseDEAD() {
        /* Branches:
         * (switch(pool) = DEAD) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            Map<Sha256Hash, Transaction> result = target.getTransactionPool(WalletTransaction.Pool.DEAD);
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${97aa6206-0261-34ab-9bc1-6f91ee7108e6}, hash: 12D07147BFFF2EA23CC76392835A011D
    @Test()
    public void getTransactionPoolWhenSwitchPoolCasePENDING() {
        /* Branches:
         * (switch(pool) = PENDING) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            Map<Sha256Hash, Transaction> result = target.getTransactionPool(WalletTransaction.Pool.PENDING);
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${d9b51766-abdb-329c-91ed-a50a5d13f301}, hash: 198F2C6B3A3C7E0E0ECCCFD09BC48727
    @Test()
    public void getTransactionPoolWhenSwitchPoolCaseSPENT() {
        /* Branches:
         * (switch(pool) = SPENT) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            Map<Sha256Hash, Transaction> result = target.getTransactionPool(WalletTransaction.Pool.SPENT);
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${6eb8d61c-b934-338e-82fb-7b847396bd1d}, hash: E2BE4F6D5E169B1DB8A5D80B9F0E7389
    @Test()
    public void getTransactionPoolWhenSwitchPoolCaseUNSPENT() {
        /* Branches:
         * (switch(pool) = UNSPENT) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            Map<Sha256Hash, Transaction> result = target.getTransactionPool(WalletTransaction.Pool.UNSPENT);
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${96879448-f182-3d9e-8bcf-74c025b055b8}, hash: 020D1D80382157D69AD2DFA596F0905F
    @Ignore()
    @Test()
    public void getTransactionPoolWhenSwitchPoolCaseDefaultThrowsRuntimeException() {
        /* Branches:
         * (switch(pool) = default) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            RuntimeException runtimeException = new RuntimeException("Unknown wallet transaction type PENDING");
            thrown.expect(RuntimeException.class);
            thrown.expectMessage(runtimeException.getMessage());
            //Act Statement(s)
            target.getTransactionPool(WalletTransaction.Pool.PENDING);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${956fb832-abf7-3971-aedb-c516d557eacc}, hash: 39F681FF9EEC2C4BDA38E24E703DF03D
    @Test()
    public void resetTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).saveLater();
            doNothing().when(target).maybeQueueOnWalletChanged();
            //Act Statement(s)
            target.reset();
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).saveLater();
            verify(target).maybeQueueOnWalletChanged();
        }
    }

    //Sapient generated method id: ${e1faea79-f377-3594-8925-04bb667068ab}, hash: 61982430CC902BC7C6C27098FA552415
    @Test()
    public void clearTransactionsWhenFromHeightEquals0() {
        /* Branches:
         * (fromHeight == 0) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).saveLater();
            //Act Statement(s)
            target.clearTransactions(0);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).saveLater();
        }
    }

    //Sapient generated method id: ${47e84c8d-806d-3d2d-870a-4a14ccfd3cac}, hash: FF056E870CB3C8286052DBFE3F474601
    @Test()
    public void clearTransactionsWhenFromHeightNotEquals0ThrowsUnsupportedOperationException() {
        /* Branches:
         * (fromHeight == 0) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(UnsupportedOperationException.class);
            //Act Statement(s)
            target.clearTransactions(1);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${3a164fcd-9bbd-35d9-8af7-47070bd8cab2}, hash: D62A09897492A50E3DC94D44E1975E95
    @Ignore()
    @Test()
    public void getWatchedOutputsTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock2 = mock(Network.class);
        try (MockedStatic<StreamUtils> streamUtils = mockStatic(StreamUtils.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class, CALLS_REAL_METHODS)) {
            ReentrantLock reentrantLock = Threading.lock("Wallet-KeyChainGroup lock");
            threading.when(() -> Threading.lock("Wallet-KeyChainGroup lock")).thenReturn(reentrantLock);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            Collector collector = StreamUtils.toUnmodifiableList();
            streamUtils.when(() -> StreamUtils.toUnmodifiableList()).thenReturn(collector);
            KeyChainGroup keyChainGroup = KeyChainGroup.createBasic(networkMock2);
            target = new Wallet(networkMock, keyChainGroup);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            List<TransactionOutput> result = target.getWatchedOutputs(true);
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            threading.verify(() -> Threading.lock("Wallet-KeyChainGroup lock"), atLeast(1));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            streamUtils.verify(() -> StreamUtils.toUnmodifiableList(), atLeast(1));
        }
    }

    //Sapient generated method id: ${0e6af319-b0c3-3945-8f43-23461718ee00}, hash: FC4EFD0B8B83F5DDD7BBAA5E104468E6
    @Test()
    public void cleanupWhenNotDirty() throws UTXOProviderException {
        /* Branches:
         * (i.hasNext()) : false
         * (dirty) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.cleanup();
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${9bff0f8e-1f4f-3362-86d0-46c290c0245c}, hash: 961D9265AD16067596FE95ADCC4B5F93
    @Test()
    public void getContainingPoolsWhenDeadNotContainsKeyTxHash() {
        /* Branches:
         * (unspent.containsKey(txHash)) : false
         * (spent.containsKey(txHash)) : false
         * (pending.containsKey(txHash)) : false
         * (dead.containsKey(txHash)) : false
         */
        //Arrange Statement(s)
        Transaction txMock = mock(Transaction.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(sha256HashMock).when(txMock).getTxId();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            EnumSet<WalletTransaction.Pool> result = target.getContainingPools(txMock);
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            verify(txMock).getTxId();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${a944261c-9429-31b3-a12c-effae1b2555c}, hash: B9FBD683EFF5C5ECCB7715EF8DD2D38B
    @Test()
    public void getPoolSizeWhenSwitchPoolCaseDEAD() {
        /* Branches:
         * (switch(pool) = DEAD) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            int result = target.getPoolSize(WalletTransaction.Pool.DEAD);
            //Assert statement(s)
            assertThat(result, equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${712a6efe-eb80-3814-ab7d-5c1428d4f62f}, hash: C7453C563028E663492B1F573600527E
    @Test()
    public void getPoolSizeWhenSwitchPoolCasePENDING() {
        /* Branches:
         * (switch(pool) = PENDING) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            int result = target.getPoolSize(WalletTransaction.Pool.PENDING);
            //Assert statement(s)
            assertThat(result, equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${253a97ae-f864-3ed2-bc14-85e38b3540a8}, hash: F05537D7911AC3C338782A5F66A8D3CD
    @Test()
    public void getPoolSizeWhenSwitchPoolCaseSPENT() {
        /* Branches:
         * (switch(pool) = SPENT) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            int result = target.getPoolSize(WalletTransaction.Pool.SPENT);
            //Assert statement(s)
            assertThat(result, equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${d32b346c-7a56-3650-9758-12c533690f95}, hash: 9AF91C1DE0336FDE5F80A0957F620427
    @Test()
    public void getPoolSizeWhenSwitchPoolCaseUNSPENT() {
        /* Branches:
         * (switch(pool) = UNSPENT) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            int result = target.getPoolSize(WalletTransaction.Pool.UNSPENT);
            //Assert statement(s)
            assertThat(result, equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${262f5cba-f1c0-3aa2-b2d5-d2d5f50865ae}, hash: 965AF676AF10703456035ED4BDEB7816
    @Test()
    public void poolContainsTxHashWhenSwitchPoolCaseDEAD() {
        /* Branches:
         * (switch(pool) = DEAD) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.poolContainsTxHash(WalletTransaction.Pool.DEAD, sha256HashMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${d56bc267-2683-36c3-8113-c29fa6667992}, hash: 31EF8D0954BC2062D2EFADF88F26F6D2
    @Test()
    public void poolContainsTxHashWhenSwitchPoolCasePENDING() {
        /* Branches:
         * (switch(pool) = PENDING) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.poolContainsTxHash(WalletTransaction.Pool.PENDING, sha256HashMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${e281c8b9-1305-343f-ac98-e6092f27b2b9}, hash: B36C6CF659C53081E717FE4C8E6964C1
    @Test()
    public void poolContainsTxHashWhenSwitchPoolCaseSPENT() {
        /* Branches:
         * (switch(pool) = SPENT) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.poolContainsTxHash(WalletTransaction.Pool.SPENT, sha256HashMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${623d32c5-135b-368a-9274-2cd120915876}, hash: 5673A67B41DAB1EE1114887789DC059F
    @Test()
    public void poolContainsTxHashWhenSwitchPoolCaseUNSPENT() {
        /* Branches:
         * (switch(pool) = UNSPENT) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.poolContainsTxHash(WalletTransaction.Pool.UNSPENT, sha256HashMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${bd910da1-f513-3bcd-b1b7-b0c627054dc3}, hash: 9A6C288807FB0D41820E234E49F5E0DA
    @Test()
    public void getUnspentsTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            List<TransactionOutput> result = target.getUnspents();
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: 1BDF2215AFF1FF0968345BF9AAC1AA0B
    @Test()
    public void toStringTest() throws UTXOProviderException {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn("return_of_toString1").when(target).toString(false, false, (AesKey) null, true, true, (AbstractBlockChain) null);
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("return_of_toString1"));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).toString(false, false, (AesKey) null, true, true, (AbstractBlockChain) null);
        }
    }

    //Sapient generated method id: ${c3a87e8f-822b-37f7-88ae-5fe1fa894aa3}, hash: 577C4CBCEB7328515B1259D68EDB7EBD
    @Test()
    public void toString1WhenDeadSizeNotGreaterThan0AndIncludeExtensionsAndExtensionsSizeNotGreaterThan0() throws UTXOProviderException {
        /* Branches:
         * (includePrivateKeys) : true
         * (for-each(BalanceType.values())) : true
         * (crypter != null) : true
         * (isWatching()) : true
         * (keyRotationTime.isPresent()) : false
         * (!watchedScripts.isEmpty()) : false
         * (includeTransactions) : true
         * (pending.size() > 0) : false
         * (unspent.size() > 0) : false
         * (spent.size() > 0) : false
         * (dead.size() > 0) : false
         * (includeExtensions) : true
         * (extensions.size() > 0) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Coin coinMock = mock(Coin.class);
        Coin coinMock2 = mock(Coin.class);
        Coin coinMock3 = mock(Coin.class);
        Coin coinMock4 = mock(Coin.class);
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class, "toString_keyCrypter1");
        AesKey aesKeyMock = mock(AesKey.class);
        AbstractBlockChain abstractBlockChainMock = mock(AbstractBlockChain.class);
        try (MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            timeUtils.when(() -> TimeUtils.dateTimeFormat((Instant) any())).thenReturn("J");
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(coinMock).when(target).getBalance(Wallet.BalanceType.ESTIMATED);
            doReturn("Q").when(coinMock).toFriendlyString();
            doReturn(coinMock2).when(target).getBalance(Wallet.BalanceType.AVAILABLE);
            doReturn("F").when(coinMock2).toFriendlyString();
            doReturn(coinMock3).when(target).getBalance(Wallet.BalanceType.ESTIMATED_SPENDABLE);
            doReturn("U").when(coinMock3).toFriendlyString();
            doReturn(coinMock4).when(target).getBalance(Wallet.BalanceType.AVAILABLE_SPENDABLE);
            doReturn("H").when(coinMock4).toFriendlyString();
            doReturn(keyCrypterMock).when(keyChainGroupMock).getKeyCrypter();
            doReturn(true).when(target).isWatching();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(target).earliestKeyCreationTime();
            doReturn("O").when(keyChainGroupMock).toString(false, true, aesKeyMock);
            //Act Statement(s)
            String result = target.toString(false, true, aesKeyMock, true, true, abstractBlockChainMock);
            //Assert statement(s)
            assertThat(result, equalTo("Wallet\n  WARNING: includes private keys!\nBalances:\n  Q ESTIMATED\n  F AVAILABLE\n  U ESTIMATED_SPENDABLE\n  H AVAILABLE_SPENDABLE\nTransactions:\n  0 pending\n  0 unspent\n  0 spent\n  0 dead\nLast seen best block: 0 (time unknown): null\nEncryption: toString_keyCrypter1\nWallet is watching.\n\nKeys:\nEarliest creation time: J\nO"));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            timeUtils.verify(() -> TimeUtils.dateTimeFormat((Instant) any()));
            verify(target).getBalance(Wallet.BalanceType.ESTIMATED);
            verify(coinMock).toFriendlyString();
            verify(target).getBalance(Wallet.BalanceType.AVAILABLE);
            verify(coinMock2).toFriendlyString();
            verify(target).getBalance(Wallet.BalanceType.ESTIMATED_SPENDABLE);
            verify(coinMock3).toFriendlyString();
            verify(target).getBalance(Wallet.BalanceType.AVAILABLE_SPENDABLE);
            verify(coinMock4).toFriendlyString();
            verify(keyChainGroupMock).getKeyCrypter();
            verify(target).isWatching();
            verify(target).earliestKeyCreationTime();
            verify(keyChainGroupMock).toString(false, true, aesKeyMock);
        }
    }

    //Sapient generated method id: ${b2767b2b-b419-3e42-97b4-fa6f0445570f}, hash: 1F73481549A79BD3498C447396CCCE3D
    @Test()
    public void getPendingTransactionsTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            Collection<Transaction> result = target.getPendingTransactions();
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${a21183e9-65ed-39df-bd4e-1611a403ae9f}, hash: 407359E33EF8D71C9C5C9A1E7AFE2571
    @Test()
    public void earliestKeyCreationTimeWhenWatchedScriptsIsEmpty() {
        /* Branches:
         * (for-each(watchedScripts)) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(keyChainGroupMock).earliestKeyCreationTime();
            //Act Statement(s)
            Instant result = target.earliestKeyCreationTime();
            //Assert statement(s)
            assertThat(result, equalTo(instant));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).earliestKeyCreationTime();
        }
    }

    //Sapient generated method id: ${59992259-ba0e-3b89-ba80-dd9c348855b6}, hash: C09D02AA90C5DF16A9884FCA71B376DC
    @Test()
    public void getLastBlockSeenHashTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            Sha256Hash result = target.getLastBlockSeenHash();
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${32693c8f-0870-3b5f-a2a9-4d98823abe67}, hash: 0B3663E36A2B5714BF54E959D8EB35F2
    @Test()
    public void setLastBlockSeenHashTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.setLastBlockSeenHash(sha256HashMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${d31ff1b3-0d8c-3f94-8ea6-5297dc6763c1}, hash: CF3B5F74B36204F8DCBC95A9B87E1BC0
    @Test()
    public void setLastBlockSeenHeightTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.setLastBlockSeenHeight(0);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${10e0f0e6-7cb0-3873-872d-09280620069a}, hash: CCD09EB91F88342AA2A8B88DA177C92A
    @Test()
    public void setLastBlockSeenTimeTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            Instant instant = Instant.ofEpochSecond(1700000000);
            //Act Statement(s)
            target.setLastBlockSeenTime(instant);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${cac7c5f0-6871-3e42-a7f4-9f869469ffd7}, hash: B73867B4200C2E139B08EE134841D280
    @Test()
    public void clearLastBlockSeenTimeTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.clearLastBlockSeenTime();
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${391238f0-08a7-30e7-865b-066a0e8f9454}, hash: 694D55AECF8E3C57C3AF39D0A497262C
    @Test()
    public void setLastBlockSeenTimeSecsWhenTimeSecsGreaterThan0() {
        /* Branches:
         * (timeSecs > 0) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.setLastBlockSeenTimeSecs(1L);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${9ead7ce4-4256-32cd-89f0-6c670c02abe8}, hash: A5552A272389C6CBAA50480D72DC049C
    @Test()
    public void setLastBlockSeenTimeSecsWhenTimeSecsNotGreaterThan0ThrowsIllegalArgumentException() {
        /* Branches:
         * (timeSecs > 0) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.setLastBlockSeenTimeSecs(0L);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${4cbbf800-2aa4-333c-9d63-dd0afc52aedb}, hash: B0602BCD68700FFFE57880FDE2D01128
    @Test()
    public void lastBlockSeenTimeTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            Optional<Instant> result = target.lastBlockSeenTime();
            Optional<Instant> instantOptional = Optional.empty();
            //Assert statement(s)
            assertThat(result, equalTo(instantOptional));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${81c1ea4f-0f5c-367c-997a-bcd51f8cda84}, hash: F600163FC30D7E4297F9729CBF45183C
    @Test()
    public void getLastBlockSeenTimeSecsTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            long result = target.getLastBlockSeenTimeSecs();
            //Assert statement(s)
            assertThat(result, equalTo(0L));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${7265672e-9b37-3076-b504-7c05f2abc51d}, hash: 3A8E873A196394E1B31B3210641650EB
    @Test()
    public void getLastBlockSeenTimeTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            Date result = target.getLastBlockSeenTime();
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${4b227bb6-66aa-3dec-94d8-d0963baae91f}, hash: 14B945DDB4C03A1F9497B7602A33C6EC
    @Test()
    public void getLastBlockSeenHeightTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            int result = target.getLastBlockSeenHeight();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${d8723dbb-71ce-371f-a30a-ee7768fe3ee2}, hash: 3532C8147455DC468A95971E1D73EA15
    @Test()
    public void getBalanceTest() throws UTXOProviderException {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Coin coinMock = mock(Coin.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(coinMock).when(target).getBalance(Wallet.BalanceType.AVAILABLE);
            //Act Statement(s)
            Coin result = target.getBalance();
            //Assert statement(s)
            assertThat(result, equalTo(coinMock));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).getBalance(Wallet.BalanceType.AVAILABLE);
        }
    }

    //Sapient generated method id: ${906a9763-c67d-3ecc-8168-c298bccfae36}, hash: 03E45973A0AC3405ECACCB62C7D606A9
    @Test()
    public void getBalance2Test() throws UTXOProviderException {
        //Arrange Statement(s)
        CoinSelector selectorMock = mock(CoinSelector.class);
        CoinSelection coinSelectionMock = mock(CoinSelection.class);
        Coin coinMock = mock(Coin.class);
        Coin coinMock2 = mock(Coin.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            doReturn(coinSelectionMock).when(selectorMock).select(coinMock, transactionOutputList);
            doReturn(coinMock2).when(coinSelectionMock).totalValue();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(transactionOutputList).when(target).calculateAllSpendCandidates(true, false);
            doReturn(coinMock).when(networkMock).maxMoney();
            //Act Statement(s)
            Coin result = target.getBalance(selectorMock);
            //Assert statement(s)
            assertThat(result, equalTo(coinMock2));
            verify(selectorMock).select(coinMock, transactionOutputList);
            verify(coinSelectionMock).totalValue();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).calculateAllSpendCandidates(true, false);
            verify(networkMock).maxMoney();
        }
    }

    //Sapient generated method id: ${32d91755-d9d2-3503-9c76-fb30be54d5e6}, hash: F6D3940127F4C4143E735C60E1F9F21C
    @Ignore(value = "Potential harmful system call (CompletableFuture.complete) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void getBalanceFutureWhenCurrentCompareToValueGreaterThanOrEqualsTo0() throws UTXOProviderException {
        /* Branches:
         * (current.compareTo(value) >= 0) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (CompletableFuture.complete) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Coin coinMock = mock(Coin.class);
        Coin coinMock2 = mock(Coin.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(coinMock).when(target).getBalance(Wallet.BalanceType.ESTIMATED);
            doReturn(0).when(coinMock).compareTo(coinMock2);
            //Act Statement(s)
            ListenableCompletableFuture<Coin> result = target.getBalanceFuture(coinMock2, Wallet.BalanceType.ESTIMATED);
            //Assert statement(s)
            //TODO: Please implement equals method in ListenableCompletableFuture for verification of the entire object or you need to adjust respective assertion statements
            assertThat(result, is(notNullValue()));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).getBalance(Wallet.BalanceType.ESTIMATED);
            verify(coinMock).compareTo(coinMock2);
        }
    }

    //Sapient generated method id: ${48af92f1-0397-3eb1-a1d2-949a0435742c}, hash: EEBE60BBE45519913BECC86B3E3B720A
    @Test()
    public void getBalanceFutureWhenCurrentCompareToValueLessThan0() throws UTXOProviderException {
        /* Branches:
         * (current.compareTo(value) >= 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class, "CoinSelector");
        Network networkMock2 = mock(Network.class);
        Coin coinMock = mock(Coin.class);
        try (MockedStatic<ListenableCompletableFuture> listenableCompletableFuture = mockStatic(ListenableCompletableFuture.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class, CALLS_REAL_METHODS)) {
            ReentrantLock reentrantLock = Threading.lock("Wallet-KeyChainGroup lock");
            threading.when(() -> Threading.lock("Wallet-KeyChainGroup lock")).thenReturn(reentrantLock);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            CompletableFuture completableFuture = new CompletableFuture();
            ListenableCompletableFuture<Coin> listenableCompletableFuture2 = ListenableCompletableFuture.of(completableFuture);
            listenableCompletableFuture.when(() -> ListenableCompletableFuture.of((CompletableFuture) any())).thenReturn(listenableCompletableFuture2);
            KeyChainGroup keyChainGroup = KeyChainGroup.createBasic(networkMock2);
            target = spy(new Wallet(networkMock, keyChainGroup));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(coinMock).when(target).getBalance(Wallet.BalanceType.ESTIMATED);
            doReturn(-1).when(coinMock).compareTo((Coin) any());
            Coin coin = Coin.valueOf(0L);
            //Act Statement(s)
            ListenableCompletableFuture<Coin> result = target.getBalanceFuture(coin, Wallet.BalanceType.ESTIMATED);
            //Assert statement(s)
            assertThat(result, equalTo(listenableCompletableFuture2));
            threading.verify(() -> Threading.lock("Wallet-KeyChainGroup lock"), atLeast(1));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            listenableCompletableFuture.verify(() -> ListenableCompletableFuture.of((CompletableFuture) any()), atLeast(1));
            verify(target, atLeast(1)).getBalance(Wallet.BalanceType.ESTIMATED);
            verify(coinMock, atLeast(1)).compareTo((Coin) any());
        }
    }

    //Sapient generated method id: ${1bdba0df-b8bb-3c0d-8f36-070bda405a07}, hash: 1FB8F3E0F0E08E5E4BDF34ACEA916AB1
    @Test()
    public void getTotalReceivedWhenTransactionsValuesIsEmpty() {
        /* Branches:
         * (for-each(transactions.values())) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            Coin result = target.getTotalReceived();
            Coin coin = Coin.ZERO;
            //Assert statement(s)
            assertThat(result, equalTo(coin));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${9003fb58-c3b8-325f-b52e-ec098ee14298}, hash: A73DD56650E93744D370959FDAB12A94
    @Test()
    public void getTotalSentWhenTransactionsValuesIsEmpty() {
        /* Branches:
         * (for-each(transactions.values())) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            Coin result = target.getTotalSent();
            Coin coin = Coin.ZERO;
            //Assert statement(s)
            assertThat(result, equalTo(coin));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${cf3d8750-a709-3eea-bb91-020d37b1afe1}, hash: 620FB4311349EB585B7E5FF4E8D2EE50
    @Test()
    public void createSendTest() throws InsufficientMoneyException, CompletionException, UTXOProviderException {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Transaction transactionMock = mock(Transaction.class);
        Address addressMock = mock(Address.class);
        Coin coinMock = mock(Coin.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(transactionMock).when(target).createSend(addressMock, coinMock, false);
            //Act Statement(s)
            Transaction result = target.createSend(addressMock, coinMock);
            //Assert statement(s)
            assertThat(result, equalTo(transactionMock));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).createSend(addressMock, coinMock, false);
        }
    }

    //Sapient generated method id: ${d2787512-e3c0-3b5e-b9bb-361d45432e40}, hash: 6C00427A8FA3F90638522C9226DA240D
    @Test()
    public void createSend1WhenAllowUnconfirmed() throws InsufficientMoneyException, CompletionException, UTXOProviderException {
        /* Branches:
         * (allowUnconfirmed) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        SendRequest sendRequestMock = mock(SendRequest.class);
        Address addressMock = mock(Address.class);
        Coin coinMock = mock(Coin.class);
        try (MockedStatic<SendRequest> sendRequest = mockStatic(SendRequest.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            sendRequest.when(() -> SendRequest.to(addressMock, coinMock)).thenReturn(sendRequestMock);
            doNothing().when(sendRequestMock).allowUnconfirmed();
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).completeTx(sendRequestMock);
            //Act Statement(s)
            Transaction result = target.createSend(addressMock, coinMock, true);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            sendRequest.verify(() -> SendRequest.to(addressMock, coinMock), atLeast(1));
            verify(sendRequestMock).allowUnconfirmed();
            verify(target).completeTx(sendRequestMock);
        }
    }

    //Sapient generated method id: ${16d69601-c48b-3c7e-bbbb-88e870f92113}, hash: C99DE3385F9C357746BD79317B09AD37
    @Ignore()
    @Test()
    public void sendCoinsOfflineTest() throws InsufficientMoneyException, CompletionException, VerificationException, UTXOProviderException, IOException {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Transaction transactionMock = mock(Transaction.class);
        Transaction transactionMock2 = mock(Transaction.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).completeTx((SendRequest) any());
            doNothing().when(target).commitTx(transactionMock);
            SendRequest sendRequest = SendRequest.forTx(transactionMock2);
            //Act Statement(s)
            Transaction result = target.sendCoinsOffline(sendRequest);
            //Assert statement(s)
            assertThat(result, equalTo(transactionMock2));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).completeTx((SendRequest) any());
            verify(target).commitTx(transactionMock);
        }
    }

    //Sapient generated method id: ${15e9d6cc-7884-3d99-ac4b-c777ab1ef012}, hash: 73F7B77912377B67BF801272620095D8
    @Test()
    public void sendCoinsTest() throws InsufficientMoneyException, CompletionException, UTXOProviderException, IOException {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        SendRequest sendRequestMock = mock(SendRequest.class);
        Address addressMock = mock(Address.class);
        Coin coinMock = mock(Coin.class);
        Wallet.SendResult walletSendResultMock = mock(Wallet.SendResult.class);
        TransactionBroadcaster transactionBroadcasterMock = mock(TransactionBroadcaster.class);
        try (MockedStatic<SendRequest> sendRequest = mockStatic(SendRequest.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            sendRequest.when(() -> SendRequest.to(addressMock, coinMock)).thenReturn(sendRequestMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(walletSendResultMock).when(target).sendCoins(transactionBroadcasterMock, sendRequestMock);
            //Act Statement(s)
            Wallet.SendResult result = target.sendCoins(transactionBroadcasterMock, addressMock, coinMock);
            //Assert statement(s)
            assertThat(result, equalTo(walletSendResultMock));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            sendRequest.verify(() -> SendRequest.to(addressMock, coinMock), atLeast(1));
            verify(target).sendCoins(transactionBroadcasterMock, sendRequestMock);
        }
    }

    //Sapient generated method id: ${2a59110c-c25f-3285-9e47-7d417ddaf3f0}, hash: 9BC98A98B400183A6BD755573AEA25AE
    @Ignore()
    @Test()
    public void sendCoins1WhenLockNotIsHeldByCurrentThread() throws InsufficientMoneyException, CompletionException, UTXOProviderException, IOException {
        /* Branches:
         * (!lock.isHeldByCurrentThread()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.bitcoinj.wallet.Wallet$SendResult
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TransactionBroadcaster broadcasterMock = mock(TransactionBroadcaster.class);
        TransactionBroadcast transactionBroadcastMock = mock(TransactionBroadcast.class);
        Transaction transactionMock = mock(Transaction.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        SendRequest sendRequestMock = mock(SendRequest.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(transactionBroadcastMock).when(broadcasterMock).broadcastTransaction(transactionMock);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(transactionMock).when(target).sendCoinsOffline(sendRequestMock);
            //Act Statement(s)
            Wallet.SendResult result = target.sendCoins(broadcasterMock, sendRequestMock);
            //Assert statement(s)
            //TODO: Please implement equals method in SendResult for verification of the entire object or you need to adjust respective assertion statements
            assertThat(result, is(notNullValue()));
            verify(broadcasterMock).broadcastTransaction(transactionMock);
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).sendCoinsOffline(sendRequestMock);
        }
    }

    //Sapient generated method id: ${ea527b4e-82b6-35d8-94fa-ec9dc024c016}, hash: 06745DF68F34B526FC198C927D6C117F
    @Test()
    public void sendCoins2WhenBroadcasterIsNullThrowsIllegalStateException() throws InsufficientMoneyException, CompletionException {
        /* Branches:
         * (broadcaster != null) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        SendRequest sendRequestMock = mock(SendRequest.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.sendCoins(sendRequestMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${a1af4209-0c76-3d7a-aa73-d2da278440b8}, hash: 2C341088A3772F1DD2658F1EBA6A2F00
    @Test()
    public void sendCoins3Test() throws InsufficientMoneyException, CompletionException, NotYetConnectedException, UTXOProviderException, IOException {
        //Arrange Statement(s)
        Peer peerMock = mock(Peer.class);
        ListenableCompletableFuture<Void> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        Transaction transactionMock = mock(Transaction.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        SendRequest sendRequestMock = mock(SendRequest.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(listenableCompletableFutureMock).when(peerMock).sendMessage(transactionMock);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(transactionMock).when(target).sendCoinsOffline(sendRequestMock);
            //Act Statement(s)
            Transaction result = target.sendCoins(peerMock, sendRequestMock);
            //Assert statement(s)
            assertThat(result, equalTo(transactionMock));
            verify(peerMock).sendMessage(transactionMock);
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).sendCoinsOffline(sendRequestMock);
        }
    }

    //Sapient generated method id: ${82d296f3-3e8f-3dfa-913f-5a54f829ea1b}, hash: DD3E1775F0F0FD8CB0B8282FD3E687F4
    @Ignore()
    @Test()
    public void sendTransactionTest() throws InsufficientMoneyException, CompletionException, UTXOProviderException, IOException {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Wallet.SendResult walletSendResultMock = mock(Wallet.SendResult.class);
        SendRequest sendRequestMock = mock(SendRequest.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(walletSendResultMock).when(target).sendCoins(sendRequestMock);
            //Act Statement(s)
            CompletableFuture<TransactionBroadcast> result = target.sendTransaction(sendRequestMock);
            //Assert statement(s)
            //TODO: Please implement equals method in CompletableFuture for verification of the entire object or you need to adjust respective assertion statements
            assertThat(result, is(notNullValue()));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).sendCoins(sendRequestMock);
        }
    }

    //Sapient generated method id: ${37ff3223-f3bf-33fb-89e0-60a0c6e2efcc}, hash: 9A04176544BFB72649C2DAC3808EF1A5
    @Test()
    public void sendTransactionWhenCaughtKeyCrypterExceptionOrInsufficientMoneyException() throws InsufficientMoneyException, CompletionException, UTXOProviderException, IOException {
        /* Branches:
         * (catch-exception (KeyCrypterException | InsufficientMoneyException)) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        KeyCrypterException keyCrypterExceptionMock = mock(KeyCrypterException.class);
        SendRequest sendRequestMock = mock(SendRequest.class);
        try (MockedStatic<FutureUtils> futureUtils = mockStatic(FutureUtils.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            CompletableFuture<TransactionBroadcast> completableFuture = new CompletableFuture<>();
            futureUtils.when(() -> FutureUtils.failedFuture(keyCrypterExceptionMock)).thenReturn(completableFuture);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doThrow(keyCrypterExceptionMock).when(target).sendCoins(sendRequestMock);
            //Act Statement(s)
            CompletableFuture<TransactionBroadcast> result = target.sendTransaction(sendRequestMock);
            //Assert statement(s)
            assertThat(result, equalTo(completableFuture));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            futureUtils.verify(() -> FutureUtils.failedFuture(keyCrypterExceptionMock), atLeast(1));
            verify(target).sendCoins(sendRequestMock);
        }
    }

    //Sapient generated method id: ${d43f3fe7-857e-3660-a029-221914fd7fb1}, hash: 0E6DDB3D62692F8D776D6023B69EE104
    @Test()
    public void waitForConfirmationTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Transaction transactionMock = mock(Transaction.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            CompletableFuture<TransactionConfidence> completableFuture = new CompletableFuture<>();
            doReturn(completableFuture).when(target).waitForConfirmations(transactionMock, 1);
            //Act Statement(s)
            CompletableFuture<TransactionConfidence> result = target.waitForConfirmation(transactionMock);
            //Assert statement(s)
            assertThat(result, equalTo(completableFuture));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).waitForConfirmations(transactionMock, 1);
        }
    }

    //Sapient generated method id: ${eb7c9ad7-e023-33bb-9927-d036deb1c134}, hash: 9F289C4FEB2F12E1A3A638D49787708E
    @Test()
    public void waitForConfirmationsTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Context contextMock = mock(Context.class);
        TxConfidenceTable txConfidenceTableMock = mock(TxConfidenceTable.class);
        TransactionConfidence transactionConfidenceMock = mock(TransactionConfidence.class);
        Transaction transactionMock = mock(Transaction.class);
        ListenableCompletableFuture<TransactionConfidence> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            context.when(() -> Context.get()).thenReturn(contextMock);
            doReturn(txConfidenceTableMock).when(contextMock).getConfidenceTable();
            doReturn(transactionConfidenceMock).when(txConfidenceTableMock).getConfidence(transactionMock);
            doReturn(listenableCompletableFutureMock).when(transactionConfidenceMock).getDepthFuture(0);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            CompletableFuture<TransactionConfidence> result = target.waitForConfirmations(transactionMock, 0);
            //Assert statement(s)
            assertThat(result, equalTo(listenableCompletableFutureMock));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            context.verify(() -> Context.get(), atLeast(1));
            verify(contextMock).getConfidenceTable();
            verify(txConfidenceTableMock).getConfidence(transactionMock);
            verify(transactionConfidenceMock).getDepthFuture(0);
        }
    }

    //Sapient generated method id: ${e0f628a0-f995-3333-a61a-03a5a2a7ee43}, hash: 4DDC06B4232A1A4B368061840F9FE23D
    @Test()
    public void getConfidenceTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Context contextMock = mock(Context.class);
        TxConfidenceTable txConfidenceTableMock = mock(TxConfidenceTable.class);
        TransactionConfidence transactionConfidenceMock = mock(TransactionConfidence.class);
        Transaction transactionMock = mock(Transaction.class);
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            context.when(() -> Context.get()).thenReturn(contextMock);
            doReturn(txConfidenceTableMock).when(contextMock).getConfidenceTable();
            doReturn(transactionConfidenceMock).when(txConfidenceTableMock).getConfidence(transactionMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            TransactionConfidence result = target.getConfidence(transactionMock);
            //Assert statement(s)
            assertThat(result, equalTo(transactionConfidenceMock));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            context.verify(() -> Context.get(), atLeast(1));
            verify(contextMock).getConfidenceTable();
            verify(txConfidenceTableMock).getConfidence(transactionMock);
        }
    }

    //Sapient generated method id: ${61f82898-88e2-341e-81b6-caabc1bbc31b}, hash: CC5F506720253DCEA29E87914D3C7E2A
    @Ignore()
    @Test()
    public void completeTxWhenReqTxGetOutputsStreamIsEmptyFilterScriptPatternIsOpReturnOGetScriptPThrowsWalletMultipleOpReturnRequested() throws InsufficientMoneyException, CompletionException, ScriptException {
        /* Branches:
         * (!req.completed) : true
         * (req.missingSigsMode == MissingSigsMode.THROW) : true
         * (branch expression (line 4708)) : true
         * (req.tx.getInputs().stream().map(TransactionInput::getValue).anyMatch(Objects::isNull)) : false
         * (branch expression (line 4612)) : true
         * (req.tx.getOutputs().stream().filter(o -> ScriptPattern.isOpReturn(o.getScriptPubKey())).count() > 1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin coinMock = mock(Coin.class);
        Transaction transactionMock = mock(Transaction.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Script scriptMock = mock(Script.class);
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            SendRequest sendRequest = SendRequest.forTx(transactionMock);
            sendRequest.feePerKb = coinMock;
            doReturn("return_of_toFriendlyString1").when(coinMock).toFriendlyString();
            sendRequest.missingSigsMode = Wallet.MissingSigsMode.USE_OP_ZERO;
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            doReturn(transactionOutputList).when(transactionMock).getOutputs();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            scriptPattern.when(() -> ScriptPattern.isOpReturn(scriptMock)).thenReturn(true);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<TransactionOutput> transactionOutputList2 = new ArrayList<>();
            doReturn(transactionOutputList2).when(target).calculateAllSpendCandidates(true, true);
            thrown.expect(Wallet.MultipleOpReturnRequested.class);
            //Act Statement(s)
            target.completeTx(sendRequest);
            //Assert statement(s)
            verify(coinMock).toFriendlyString();
            verify(transactionMock).getOutputs();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isOpReturn(scriptMock), atLeast(1));
            verify(target).calculateAllSpendCandidates(true, true);
        }
    }

    //Sapient generated method id: ${1bb3ef6b-1fb7-3dad-92f0-3e516c284b38}, hash: B965E8984F9D7AFA8E9BDA781565CC88
    @Ignore()
    @Test()
    public void completeTxWhenReqTxGetOutputsSizeNotEquals1ThrowsIllegalStateException() throws InsufficientMoneyException, CompletionException, ScriptException {
        /* Branches:
         * (!req.completed) : true
         * (req.missingSigsMode == MissingSigsMode.THROW) : true
         * (branch expression (line 4708)) : true
         * (req.tx.getInputs().stream().map(TransactionInput::getValue).anyMatch(Objects::isNull)) : false
         * (branch expression (line 4612)) : true
         * (req.tx.getOutputs().stream().filter(o -> ScriptPattern.isOpReturn(o.getScriptPubKey())).count() > 1) : false
         * (req.ensureMinRequiredFee) : false
         * (inputs.stream().noneMatch(i -> i.getOutpoint().equals(output.getOutPointFor()))) : false
         * (!req.emptyWallet) : false
         * (req.tx.getOutputs().size() == 1) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin coinMock = mock(Coin.class);
        Transaction transactionMock = mock(Transaction.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Script scriptMock = mock(Script.class);
        TransactionOutput transactionOutputMock = mock(TransactionOutput.class);
        TransactionOutPoint transactionOutPointMock = mock(TransactionOutPoint.class);
        Transaction transactionMock2 = mock(Transaction.class);
        Script scriptMock2 = mock(Script.class);
        TransactionOutPoint transactionOutPointMock2 = mock(TransactionOutPoint.class);
        Coin coinMock2 = mock(Coin.class);
        TransactionOutPoint transactionOutPointMock3 = mock(TransactionOutPoint.class);
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            SendRequest sendRequest = SendRequest.forTx(transactionMock);
            sendRequest.feePerKb = coinMock;
            doReturn("return_of_toFriendlyString1").when(coinMock).toFriendlyString();
            sendRequest.missingSigsMode = Wallet.MissingSigsMode.THROW;
            sendRequest.ensureMinRequiredFee = false;
            sendRequest.emptyWallet = true;
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            doReturn(transactionOutputList).when(transactionMock).getOutputs();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            scriptPattern.when(() -> ScriptPattern.isOpReturn(scriptMock)).thenReturn(true);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<TransactionOutput> transactionOutputList2 = new ArrayList<>();
            transactionOutputList2.add(transactionOutputMock);
            doReturn(transactionOutputList2).when(target).calculateAllSpendCandidates(true, true);
            doReturn(transactionMock2).when(transactionOutputMock).getParentTransaction();
            doReturn(scriptMock2).when(transactionOutputMock).getScriptPubKey();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(scriptMock2).program();
            doReturn(coinMock2).when(transactionOutputMock).getValue();
            doReturn(transactionOutPointMock, transactionOutPointMock2, transactionOutPointMock3).when(transactionOutputMock).getOutPointFor();
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.completeTx(sendRequest);
            //Assert statement(s)
            verify(coinMock).toFriendlyString();
            verify(transactionMock).getOutputs();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isOpReturn(scriptMock), atLeast(1));
            verify(target).calculateAllSpendCandidates(true, true);
            verify(transactionOutputMock, times(3)).getOutPointFor();
            verify(transactionOutputMock).getParentTransaction();
            verify(transactionOutputMock).getScriptPubKey();
            verify(scriptMock2).program();
            verify(transactionOutputMock).getValue();
        }
    }

    //Sapient generated method id: ${6d37dba9-1791-35c2-b103-a30af9ad2965}, hash: 7F40CE7A36B17700A78ECDE103EB55E3
    @Ignore()
    @Test()
    public void completeTxWhenInputsStreamIsEmptyNoneMatchIGetOutpointEqualsOutputGetOutPointForIsEmptyAndReThrowsIllegalStateException() throws InsufficientMoneyException, CompletionException, ScriptException {
        /* Branches:
         * (!req.completed) : true
         * (req.missingSigsMode == MissingSigsMode.THROW) : true
         * (branch expression (line 4708)) : true
         * (req.tx.getInputs().stream().map(TransactionInput::getValue).anyMatch(Objects::isNull)) : false
         * (branch expression (line 4612)) : true
         * (req.tx.getOutputs().stream().filter(o -> ScriptPattern.isOpReturn(o.getScriptPubKey())).count() > 1) : false
         * (req.ensureMinRequiredFee) : true
         * (!req.emptyWallet) : true
         * (req.tx.getOutputs().stream().anyMatch(TransactionOutput::isDust)) : false
         * (inputs.stream().noneMatch(i -> i.getOutpoint().equals(output.getOutPointFor()))) : true
         * (!req.emptyWallet) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin coinMock = mock(Coin.class);
        Transaction transactionMock = mock(Transaction.class);
        Transaction transactionMock2 = mock(Transaction.class);
        TransactionOutPoint transactionOutPointMock = mock(TransactionOutPoint.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Script scriptMock = mock(Script.class);
        TransactionOutput transactionOutputMock = mock(TransactionOutput.class);
        TransactionOutPoint transactionOutPointMock2 = mock(TransactionOutPoint.class);
        Transaction transactionMock3 = mock(Transaction.class);
        Script scriptMock2 = mock(Script.class);
        TransactionOutPoint transactionOutPointMock3 = mock(TransactionOutPoint.class);
        Coin coinMock2 = mock(Coin.class);
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            SendRequest sendRequest = SendRequest.forTx(transactionMock);
            sendRequest.feePerKb = coinMock;
            doReturn("return_of_toFriendlyString1").when(coinMock).toFriendlyString();
            sendRequest.missingSigsMode = Wallet.MissingSigsMode.THROW;
            sendRequest.ensureMinRequiredFee = true;
            sendRequest.emptyWallet = false;
            byte[] byteArray = new byte[]{};
            TransactionInput transactionInput = new TransactionInput(transactionMock2, byteArray, transactionOutPointMock);
            List<TransactionInput> transactionInputList = new ArrayList<>();
            transactionInputList.add(transactionInput);
            doReturn(transactionInputList).when(transactionMock).getInputs();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            scriptPattern.when(() -> ScriptPattern.isOpReturn(scriptMock)).thenReturn(true);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(transactionOutputMock);
            doReturn(transactionOutputList).when(target).calculateAllSpendCandidates(true, true);
            doReturn(transactionMock3).when(transactionOutputMock).getParentTransaction();
            doReturn(scriptMock2).when(transactionOutputMock).getScriptPubKey();
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(scriptMock2).program();
            doReturn(coinMock2).when(transactionOutputMock).getValue();
            doReturn(transactionOutPointMock2, transactionOutPointMock3, transactionOutPointMock).when(transactionOutputMock).getOutPointFor();
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.completeTx(sendRequest);
            //Assert statement(s)
            verify(coinMock).toFriendlyString();
            verify(transactionMock).getInputs();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isOpReturn(scriptMock), atLeast(1));
            verify(target).calculateAllSpendCandidates(true, true);
            verify(transactionOutputMock, times(3)).getOutPointFor();
            verify(transactionOutputMock).getParentTransaction();
            verify(transactionOutputMock).getScriptPubKey();
            verify(scriptMock2).program();
            verify(transactionOutputMock).getValue();
        }
    }

    //Sapient generated method id: ${c775bca9-ab66-32e1-b265-e9a22bbbefc0}, hash: 05C3B9AA18AA11A59207533F93866ABD
    @Ignore()
    @Test()
    public void completeTxWhenAdjustOutputDownwardsForFeeNotReqTxBestCoinSelectionReqFeePerKbReqEnsu4ThrowsWalletCouldNotAdjustDownwards() throws InsufficientMoneyException, CompletionException, ScriptException {
        /* Branches:
         * (!req.completed) : true
         * (req.missingSigsMode == MissingSigsMode.THROW) : false
         * (branch expression (line 4708)) : false
         * (req.tx.getInputs().stream().map(TransactionInput::getValue).anyMatch(Objects::isNull)) : false
         * (branch expression (line 4612)) : false
         * (req.tx.getOutputs().stream().filter(o -> ScriptPattern.isOpReturn(o.getScriptPubKey())).count() > 1) : false
         * (req.ensureMinRequiredFee) : false
         * (inputs.stream().noneMatch(i -> i.getOutpoint().equals(output.getOutPointFor()))) : false
         * (!req.emptyWallet) : false
         * (req.tx.getOutputs().size() == 1) : true
         * (req.coinSelector == null) : false
         * (req.emptyWallet) : true
         * (ensureMinRequiredFee) : false  #  inside estimateFees method
         * (!output.isDust()) : false  #  inside adjustOutputDownwardsForFee method
         * (!adjustOutputDownwardsForFee(req.tx, bestCoinSelection, req.feePerKb, req.ensureMinRequiredFee)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin coinMock = mock(Coin.class);
        Transaction transactionMock = mock(Transaction.class);
        Coin coinMock2 = mock(Coin.class);
        Coin coinMock3 = mock(Coin.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        CoinSelection coinSelectionMock = mock(CoinSelection.class);
        Coin coinMock4 = mock(Coin.class);
        Coin coinMock5 = mock(Coin.class);
        Coin coinMock6 = mock(Coin.class);
        TransactionOutput transactionOutputMock = mock(TransactionOutput.class);
        TransactionOutput transactionOutputMock2 = mock(TransactionOutput.class);
        Script scriptMock = mock(Script.class);
        TransactionOutput transactionOutputMock3 = mock(TransactionOutput.class);
        Coin coinMock7 = mock(Coin.class);
        Coin coinMock8 = mock(Coin.class);
        CoinSelector coinSelectorMock2 = mock(CoinSelector.class);
        Script scriptMock2 = mock(Script.class);
        TransactionOutput transactionOutputMock4 = mock(TransactionOutput.class);
        TransactionOutPoint transactionOutPointMock = mock(TransactionOutPoint.class);
        TransactionOutPoint transactionOutPointMock2 = mock(TransactionOutPoint.class);
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            SendRequest sendRequest = SendRequest.forTx(transactionMock);
            sendRequest.feePerKb = coinMock;
            doReturn("return_of_toFriendlyString1").when(coinMock).toFriendlyString();
            doReturn(coinMock2).when(coinMock).multiply(0L);
            doReturn(coinMock3).when(coinMock2).divide(1000L);
            sendRequest.missingSigsMode = Wallet.MissingSigsMode.USE_OP_ZERO;
            sendRequest.ensureMinRequiredFee = false;
            sendRequest.emptyWallet = true;
            sendRequest.coinSelector = coinSelectorMock;
            List list = new ArrayList<>();
            doReturn(coinSelectionMock).when(coinSelectorMock).select(coinMock4, list);
            doReturn(coinMock5, coinMock6).when(coinSelectionMock).totalValue();
            doReturn("return_of_toFriendlyString1").when(coinMock6).toFriendlyString();
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(transactionOutputMock);
            List<TransactionOutput> transactionOutputList2 = new ArrayList<>();
            transactionOutputList2.add(transactionOutputMock2);
            doReturn(transactionOutputList, transactionOutputList2).when(coinSelectionMock).outputs();
            doReturn(scriptMock).when(transactionOutputMock2).getScriptPubKey();
            doReturn(0).when(transactionMock).getVsize();
            doReturn(transactionOutputMock3).when(transactionMock).getOutput(0L);
            doReturn(coinMock7).when(transactionOutputMock3).getValue();
            doReturn(coinMock8).when(coinMock7).subtract(coinMock3);
            doNothing().when(transactionOutputMock3).setValue(coinMock8);
            doReturn(true).when(transactionOutputMock3).isDust();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock2);
            scriptPattern.when(() -> ScriptPattern.isOpReturn(scriptMock2)).thenReturn(false);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<TransactionOutput> transactionOutputList3 = new ArrayList<>();
            transactionOutputList3.add(transactionOutputMock4);
            doReturn(transactionOutputList3).when(target).calculateAllSpendCandidates(true, false);
            doReturn(transactionOutPointMock, transactionOutPointMock2).when(transactionOutputMock4).getOutPointFor();
            doReturn(coinMock4).when(networkMock).maxMoney();
            thrown.expect(Wallet.CouldNotAdjustDownwards.class);
            //Act Statement(s)
            target.completeTx(sendRequest);
            //Assert statement(s)
            verify(coinMock).toFriendlyString();
            verify(coinMock).multiply(0L);
            verify(coinMock2).divide(1000L);
            verify(coinSelectorMock).select(coinMock4, list);
            verify(coinSelectionMock, times(2)).totalValue();
            verify(coinMock6).toFriendlyString();
            verify(coinSelectionMock, times(2)).outputs();
            verify(transactionOutputMock2).getScriptPubKey();
            verify(transactionMock).getVsize();
            verify(transactionMock).getOutput(0L);
            verify(transactionOutputMock3).getValue();
            verify(coinMock7).subtract(coinMock3);
            verify(transactionOutputMock3).setValue(coinMock8);
            verify(transactionOutputMock3).isDust();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isOpReturn(scriptMock2), atLeast(1));
            verify(target).calculateAllSpendCandidates(true, false);
            verify(transactionOutputMock4, times(2)).getOutPointFor();
            verify(networkMock).maxMoney();
        }
    }

    //Sapient generated method id: ${cd6db877-03a8-3fb5-b41c-4b6aee40e846}, hash: A3BA0E71B0DDAB9B2452F1488764F61D
    @Ignore()
    @Test()
    public void completeTxWhenSizeGreaterThanTransactionMAX_STANDARD_TX_SIZEThrowsWalletExceededMaxTransactionSize() throws InsufficientMoneyException, CompletionException, ScriptException, BadWalletEncryptionKeyException {
        /* Branches:
         * (!req.completed) : true
         * (req.missingSigsMode == MissingSigsMode.THROW) : true
         * (branch expression (line 4708)) : true
         * (req.tx.getInputs().stream().map(TransactionInput::getValue).anyMatch(Objects::isNull)) : false
         * (branch expression (line 4612)) : true
         * (req.tx.getOutputs().stream().filter(o -> ScriptPattern.isOpReturn(o.getScriptPubKey())).count() > 1) : false
         * (req.ensureMinRequiredFee) : false
         * (inputs.stream().noneMatch(i -> i.getOutpoint().equals(output.getOutPointFor()))) : false
         * (!req.emptyWallet) : false
         * (req.tx.getOutputs().size() == 1) : true
         * (req.coinSelector == null) : true
         * (req.emptyWallet) : true
         * (ensureMinRequiredFee) : false  #  inside estimateFees method
         * (!output.isDust()) : true  #  inside adjustOutputDownwardsForFee method
         * (!adjustOutputDownwardsForFee(req.tx, bestCoinSelection, req.feePerKb, req.ensureMinRequiredFee)) : false
         * (updatedOutputValues != null) : false
         * (bestChangeOutput != null) : false
         * (req.shuffleOutputs) : true
         * (req.signInputs) : true
         * (size > Transaction.MAX_STANDARD_TX_SIZE) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin coinMock = mock(Coin.class);
        Transaction transactionMock = mock(Transaction.class);
        Coin coinMock2 = mock(Coin.class);
        Coin coinMock3 = mock(Coin.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        CoinSelection coinSelectionMock = mock(CoinSelection.class);
        Coin coinMock4 = mock(Coin.class);
        Coin coinMock5 = mock(Coin.class);
        Coin coinMock6 = mock(Coin.class);
        TransactionOutput transactionOutputMock = mock(TransactionOutput.class);
        TransactionOutput transactionOutputMock2 = mock(TransactionOutput.class);
        Script scriptMock = mock(Script.class);
        Script scriptMock2 = mock(Script.class);
        TransactionOutput transactionOutputMock3 = mock(TransactionOutput.class);
        TransactionOutPoint transactionOutPointMock = mock(TransactionOutPoint.class);
        Transaction transactionMock2 = mock(Transaction.class);
        Script scriptMock3 = mock(Script.class);
        TransactionOutPoint transactionOutPointMock2 = mock(TransactionOutPoint.class);
        Coin coinMock7 = mock(Coin.class);
        TransactionOutPoint transactionOutPointMock3 = mock(TransactionOutPoint.class);
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            SendRequest sendRequest = SendRequest.forTx(transactionMock);
            sendRequest.feePerKb = coinMock;
            doReturn("return_of_toFriendlyString1").when(coinMock).toFriendlyString();
            doReturn(coinMock2).when(coinMock).multiply(0L);
            doReturn(coinMock3).when(coinMock2).divide(1000L);
            sendRequest.missingSigsMode = Wallet.MissingSigsMode.THROW;
            sendRequest.ensureMinRequiredFee = false;
            sendRequest.emptyWallet = true;
            sendRequest.coinSelector = null;
            sendRequest.shuffleOutputs = true;
            sendRequest.signInputs = true;
            doReturn(100001).when(transactionMock).messageSize();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            List list = new ArrayList<>();
            doReturn(coinSelectionMock).when(coinSelectorMock).select(coinMock4, list);
            doReturn(coinMock5, coinMock6).when(coinSelectionMock).totalValue();
            doReturn("return_of_toFriendlyString1").when(coinMock6).toFriendlyString();
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(transactionOutputMock);
            List<TransactionOutput> transactionOutputList2 = new ArrayList<>();
            transactionOutputList2.add(transactionOutputMock2);
            doReturn(transactionOutputList, transactionOutputList2).when(coinSelectionMock).outputs();
            doReturn(scriptMock).when(transactionOutputMock2).getScriptPubKey();
            scriptPattern.when(() -> ScriptPattern.isOpReturn(scriptMock2)).thenReturn(true);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<TransactionOutput> transactionOutputList3 = new ArrayList<>();
            transactionOutputList3.add(transactionOutputMock3);
            doReturn(transactionOutputList3).when(target).calculateAllSpendCandidates(true, true);
            doReturn(transactionMock2).when(transactionOutputMock3).getParentTransaction();
            doReturn(scriptMock3).when(transactionOutputMock3).getScriptPubKey();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(scriptMock3).program();
            doReturn(coinMock7).when(transactionOutputMock3).getValue();
            doReturn(transactionOutPointMock, transactionOutPointMock2, transactionOutPointMock3).when(transactionOutputMock3).getOutPointFor();
            doReturn(coinMock4).when(networkMock).maxMoney();
            doNothing().when(target).signTransaction((SendRequest) any());
            thrown.expect(Wallet.ExceededMaxTransactionSize.class);
            //Act Statement(s)
            target.completeTx(sendRequest);
            //Assert statement(s)
            verify(coinMock).toFriendlyString();
            verify(coinMock).multiply(0L);
            verify(coinMock2).divide(1000L);
            verify(transactionMock).messageSize();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(coinSelectorMock).select(coinMock4, list);
            verify(coinSelectionMock, times(2)).totalValue();
            verify(coinMock6).toFriendlyString();
            verify(coinSelectionMock, times(2)).outputs();
            verify(transactionOutputMock2).getScriptPubKey();
            scriptPattern.verify(() -> ScriptPattern.isOpReturn(scriptMock2), atLeast(1));
            verify(target).calculateAllSpendCandidates(true, true);
            verify(transactionOutputMock3, times(3)).getOutPointFor();
            verify(transactionOutputMock3).getParentTransaction();
            verify(transactionOutputMock3).getScriptPubKey();
            verify(scriptMock3).program();
            verify(transactionOutputMock3).getValue();
            verify(networkMock).maxMoney();
            verify(target).signTransaction((SendRequest) any());
        }
    }

    //Sapient generated method id: ${bed1c73d-646a-33b4-a10d-55dd990dcc41}, hash: 5F7CEBA42FEA65A558CD4988FBB6A69A
    @Ignore()
    @Test()
    public void completeTxWhenSizeNotGreaterThanTransactionMAX_STANDARD_TX_SIZE() throws InsufficientMoneyException, CompletionException, ScriptException, BadWalletEncryptionKeyException, UTXOProviderException {
        /* Branches:
         * (!req.completed) : true
         * (req.missingSigsMode == MissingSigsMode.THROW) : true
         * (branch expression (line 4708)) : true
         * (req.tx.getInputs().stream().map(TransactionInput::getValue).anyMatch(Objects::isNull)) : false
         * (branch expression (line 4612)) : true
         * (req.tx.getOutputs().stream().filter(o -> ScriptPattern.isOpReturn(o.getScriptPubKey())).count() > 1) : false
         * (req.ensureMinRequiredFee) : false
         * (inputs.stream().noneMatch(i -> i.getOutpoint().equals(output.getOutPointFor()))) : false
         * (!req.emptyWallet) : false
         * (req.tx.getOutputs().size() == 1) : true
         * (req.coinSelector == null) : true
         * (req.emptyWallet) : true
         * (ensureMinRequiredFee) : false  #  inside estimateFees method
         * (!output.isDust()) : true  #  inside adjustOutputDownwardsForFee method
         * (!adjustOutputDownwardsForFee(req.tx, bestCoinSelection, req.feePerKb, req.ensureMinRequiredFee)) : false
         * (updatedOutputValues != null) : false
         * (bestChangeOutput != null) : false
         * (req.shuffleOutputs) : true
         * (req.signInputs) : true
         * (size > Transaction.MAX_STANDARD_TX_SIZE) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin coinMock = mock(Coin.class);
        Transaction transactionMock = mock(Transaction.class);
        Coin coinMock2 = mock(Coin.class);
        Coin coinMock3 = mock(Coin.class);
        ExchangeRate exchangeRateMock = mock(ExchangeRate.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        CoinSelection coinSelectionMock = mock(CoinSelection.class);
        Coin coinMock4 = mock(Coin.class);
        Coin coinMock5 = mock(Coin.class);
        Coin coinMock6 = mock(Coin.class);
        TransactionOutput transactionOutputMock = mock(TransactionOutput.class);
        TransactionOutput transactionOutputMock2 = mock(TransactionOutput.class);
        Script scriptMock = mock(Script.class);
        Script scriptMock2 = mock(Script.class);
        Context contextMock = mock(Context.class);
        TxConfidenceTable txConfidenceTableMock = mock(TxConfidenceTable.class);
        TransactionConfidence transactionConfidenceMock = mock(TransactionConfidence.class);
        Transaction transactionMock2 = mock(Transaction.class);
        TransactionOutput transactionOutputMock3 = mock(TransactionOutput.class);
        TransactionOutPoint transactionOutPointMock = mock(TransactionOutPoint.class);
        Transaction transactionMock3 = mock(Transaction.class);
        Script scriptMock3 = mock(Script.class);
        TransactionOutPoint transactionOutPointMock2 = mock(TransactionOutPoint.class);
        Coin coinMock7 = mock(Coin.class);
        TransactionOutPoint transactionOutPointMock3 = mock(TransactionOutPoint.class);
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            SendRequest sendRequest = SendRequest.forTx(transactionMock);
            sendRequest.feePerKb = coinMock;
            doReturn("return_of_toFriendlyString1").when(coinMock).toFriendlyString();
            doReturn(coinMock2).when(coinMock).multiply(0L);
            doReturn(coinMock3).when(coinMock2).divide(1000L);
            sendRequest.missingSigsMode = Wallet.MissingSigsMode.THROW;
            sendRequest.ensureMinRequiredFee = false;
            sendRequest.emptyWallet = true;
            sendRequest.coinSelector = null;
            sendRequest.shuffleOutputs = true;
            sendRequest.signInputs = true;
            sendRequest.exchangeRate = exchangeRateMock;
            sendRequest.memo = "memo1";
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            List list = new ArrayList<>();
            doReturn(coinSelectionMock).when(coinSelectorMock).select(coinMock4, list);
            doReturn(coinMock5, coinMock6).when(coinSelectionMock).totalValue();
            doReturn("return_of_toFriendlyString1").when(coinMock6).toFriendlyString();
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(transactionOutputMock);
            List<TransactionOutput> transactionOutputList2 = new ArrayList<>();
            transactionOutputList2.add(transactionOutputMock2);
            doReturn(transactionOutputList, transactionOutputList2).when(coinSelectionMock).outputs();
            doReturn(scriptMock).when(transactionOutputMock2).getScriptPubKey();
            scriptPattern.when(() -> ScriptPattern.isOpReturn(scriptMock2)).thenReturn(true);
            context.when(() -> Context.get()).thenReturn(contextMock);
            doReturn(txConfidenceTableMock).when(contextMock).getConfidenceTable();
            doReturn(transactionConfidenceMock).when(txConfidenceTableMock).getConfidence(transactionMock2);
            doNothing().when(transactionConfidenceMock).setSource(TransactionConfidence.Source.SELF);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<TransactionOutput> transactionOutputList3 = new ArrayList<>();
            transactionOutputList3.add(transactionOutputMock3);
            doReturn(transactionOutputList3).when(target).calculateAllSpendCandidates(true, true);
            doReturn(transactionMock3).when(transactionOutputMock3).getParentTransaction();
            doReturn(scriptMock3).when(transactionOutputMock3).getScriptPubKey();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(scriptMock3).program();
            doReturn(coinMock7).when(transactionOutputMock3).getValue();
            doReturn(transactionOutPointMock, transactionOutPointMock2, transactionOutPointMock3).when(transactionOutputMock3).getOutPointFor();
            doReturn(coinMock4).when(networkMock).maxMoney();
            doNothing().when(target).signTransaction((SendRequest) any());
            //Act Statement(s)
            target.completeTx(sendRequest);
            //Assert statement(s)
            verify(coinMock).toFriendlyString();
            verify(coinMock).multiply(0L);
            verify(coinMock2).divide(1000L);
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(coinSelectorMock).select(coinMock4, list);
            verify(coinSelectionMock, times(2)).totalValue();
            verify(coinMock6).toFriendlyString();
            verify(coinSelectionMock, times(2)).outputs();
            verify(transactionOutputMock2).getScriptPubKey();
            scriptPattern.verify(() -> ScriptPattern.isOpReturn(scriptMock2), atLeast(1));
            context.verify(() -> Context.get(), atLeast(1));
            verify(contextMock).getConfidenceTable();
            verify(txConfidenceTableMock).getConfidence(transactionMock2);
            verify(transactionConfidenceMock).setSource(TransactionConfidence.Source.SELF);
            verify(target).calculateAllSpendCandidates(true, true);
            verify(transactionOutputMock3, times(3)).getOutPointFor();
            verify(transactionOutputMock3).getParentTransaction();
            verify(transactionOutputMock3).getScriptPubKey();
            verify(scriptMock3).program();
            verify(transactionOutputMock3).getValue();
            verify(networkMock).maxMoney();
            verify(target).signTransaction((SendRequest) any());
        }
    }

    //Sapient generated method id: ${548fd265-9fa4-39ce-ac69-9eaafe6909f8}, hash: 697337F0F35924FF0FD908714CF30323
    @Ignore()
    @Test()
    public void connectInputsWhenDefaultBranch() throws ScriptException {
        /* Branches:
         * (branch expression (line 4708)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TransactionOutput utxoMock = mock(TransactionOutput.class);
        TransactionOutPoint transactionOutPointMock = mock(TransactionOutPoint.class);
        Transaction transactionMock = mock(Transaction.class);
        doReturn(transactionMock).when(utxoMock).getParentTransaction();
        Script scriptMock = mock(Script.class);
        doReturn(scriptMock).when(utxoMock).getScriptPubKey();
        byte[] byteArray = new byte[]{};
        doReturn(byteArray).when(scriptMock).program();
        TransactionOutPoint transactionOutPointMock2 = mock(TransactionOutPoint.class);
        doReturn(transactionOutPointMock, transactionOutPointMock2).when(utxoMock).getOutPointFor();
        Coin coinMock = mock(Coin.class);
        doReturn(coinMock).when(utxoMock).getValue();
        List<TransactionOutput> transactionOutputList = new ArrayList<>();
        transactionOutputList.add(utxoMock);
        Transaction transactionMock2 = mock(Transaction.class);
        byte[] byteArray2 = new byte[]{};
        TransactionInput transactionInput = new TransactionInput(transactionMock2, byteArray2, transactionOutPointMock);
        List<TransactionInput> transactionInputList = new ArrayList<>();
        transactionInputList.add(transactionInput);
        //Act Statement(s)
        List<TransactionInput> result = Wallet.connectInputs(transactionOutputList, transactionInputList);
        //Assert statement(s)
        assertThat(result.size(), equalTo(0));
        verify(utxoMock, times(2)).getOutPointFor();
        verify(utxoMock).getParentTransaction();
        verify(utxoMock).getScriptPubKey();
        verify(scriptMock).program();
        verify(utxoMock).getValue();
    }

    //Sapient generated method id: ${f03d4c00-7f06-32c9-90eb-7889a8e9269d}, hash: 80711680A7252022CA2CB1E288800674
    @Ignore()
    @Test()
    public void connectInputsWhenDefaultBranch2() {
        /* Branches:
         * (branch expression (line 4708)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TransactionOutput utxoMock = mock(TransactionOutput.class);
        TransactionOutPoint transactionOutPointMock = mock(TransactionOutPoint.class);
        doReturn(transactionOutPointMock).when(utxoMock).getOutPointFor();
        List<TransactionOutput> transactionOutputList = new ArrayList<>();
        transactionOutputList.add(utxoMock);
        Transaction transactionMock = mock(Transaction.class);
        byte[] byteArray = new byte[]{};
        TransactionOutPoint transactionOutPointMock2 = mock(TransactionOutPoint.class);
        TransactionInput transactionInput = new TransactionInput(transactionMock, byteArray, transactionOutPointMock2);
        List<TransactionInput> transactionInputList = new ArrayList<>();
        transactionInputList.add(transactionInput);
        //Act Statement(s)
        List<TransactionInput> result = Wallet.connectInputs(transactionOutputList, transactionInputList);
        //Assert statement(s)
        assertThat(result.size(), equalTo(0));
        verify(utxoMock).getOutPointFor();
    }

    //Sapient generated method id: ${25ab0566-ae04-3642-a2cd-01f8318c3ab3}, hash: C28EC0506B6BD6C066E9B39BC104263D
    @Test()
    public void signTransactionWhenInputsSizeNotGreaterThan0ThrowsIllegalStateException() throws BadWalletEncryptionKeyException {
        /* Branches:
         * (inputs.size() > 0) : false
         */
        //Arrange Statement(s)
        Transaction txMock = mock(Transaction.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            List<TransactionInput> transactionInputList = new ArrayList<>();
            doReturn(transactionInputList).when(txMock).getInputs();
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            doReturn(transactionOutputList).when(txMock).getOutputs();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(IllegalStateException.class);
            SendRequest sendRequest = SendRequest.forTx(txMock);
            //Act Statement(s)
            target.signTransaction(sendRequest);
            //Assert statement(s)
            verify(txMock).getInputs();
            verify(txMock).getOutputs();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${4acf3fea-9193-300b-9a3e-e54a9cc436b5}, hash: C40E9B2C3AA3F9F1EC00A0B99142BA98
    @Test()
    public void signTransactionWhenOutputsSizeNotGreaterThan0ThrowsIllegalStateException() throws BadWalletEncryptionKeyException {
        /* Branches:
         * (inputs.size() > 0) : true
         * (outputs.size() > 0) : false
         */
        //Arrange Statement(s)
        Transaction txMock = mock(Transaction.class);
        TransactionInput transactionInputMock = mock(TransactionInput.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            List<TransactionInput> transactionInputList = new ArrayList<>();
            transactionInputList.add(transactionInputMock);
            doReturn(transactionInputList).when(txMock).getInputs();
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            doReturn(transactionOutputList).when(txMock).getOutputs();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(IllegalStateException.class);
            SendRequest sendRequest = SendRequest.forTx(txMock);
            //Act Statement(s)
            target.signTransaction(sendRequest);
            //Assert statement(s)
            verify(txMock).getInputs();
            verify(txMock).getOutputs();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${b83a4e9b-2dc1-3a6c-967b-09abd5b487dc}, hash: 6C2EDDC3F0EA874B3E5A2F1AEF329E86
    @Ignore()
    @Test()
    public void signTransactionWhenSignersIsNotEmptyAndSignerNotSignInputsProposalMaybeDecryptingKeyBag() throws BadWalletEncryptionKeyException {
        /* Branches:
         * (inputs.size() > 0) : true
         * (outputs.size() > 0) : true
         * (i < numInputs) : true
         * (connectedOutput == null) : true
         * (for-each(signers)) : true
         * (!signer.signInputs(proposal, maybeDecryptingKeyBag)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type MissingSigResolutionSigner, signer
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        AesKey aesKeyMock = mock(AesKey.class);
        Transaction transactionMock = mock(Transaction.class);
        TransactionInput transactionInputMock = mock(TransactionInput.class);
        TransactionOutput transactionOutputMock = mock(TransactionOutput.class);
        TransactionInput transactionInputMock2 = mock(TransactionInput.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            SendRequest sendRequest = SendRequest.forTx(transactionMock);
            sendRequest.aesKey = aesKeyMock;
            sendRequest.missingSigsMode = Wallet.MissingSigsMode.USE_OP_ZERO;
            List<TransactionInput> transactionInputList = new ArrayList<>();
            transactionInputList.add(transactionInputMock);
            doReturn(transactionInputList).when(transactionMock).getInputs();
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(transactionOutputMock);
            doReturn(transactionOutputList).when(transactionMock).getOutputs();
            doReturn(transactionInputMock2).when(transactionMock).getInput(0L);
            doReturn(null).when(transactionInputMock2).getConnectedOutput();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.signTransaction(sendRequest);
            //Assert statement(s)
            verify(transactionMock, times(2)).getInputs();
            verify(transactionMock).getOutputs();
            verify(transactionMock).getInput(0L);
            verify(transactionInputMock2).getConnectedOutput();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${2ba3f9e9-bea5-3201-8dff-24ca0551bde0}, hash: 952BCB5B1C1D951D7747C4FDC79F24BF
    @Ignore()
    @Test()
    public void signTransactionWhenConnectedOutputIsNotNullAndSignersIsNotEmptyAndSignerNotSignInputsProposalMaybeDecryptingKeyBag() throws BadWalletEncryptionKeyException, ScriptException {
        /* Branches:
         * (inputs.size() > 0) : true
         * (outputs.size() > 0) : true
         * (i < numInputs) : true
         * (connectedOutput == null) : false
         * (for-each(signers)) : true
         * (!signer.signInputs(proposal, maybeDecryptingKeyBag)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type MissingSigResolutionSigner, signer
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        AesKey aesKeyMock = mock(AesKey.class);
        Transaction transactionMock = mock(Transaction.class);
        TransactionInput transactionInputMock = mock(TransactionInput.class);
        TransactionOutput transactionOutputMock = mock(TransactionOutput.class);
        TransactionInput transactionInputMock2 = mock(TransactionInput.class);
        TransactionOutput transactionOutputMock2 = mock(TransactionOutput.class);
        Script scriptMock = mock(Script.class);
        Coin coinMock = mock(Coin.class);
        Script scriptMock2 = mock(Script.class);
        Script scriptMock3 = mock(Script.class);
        TransactionWitness transactionWitnessMock = mock(TransactionWitness.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            SendRequest sendRequest = SendRequest.forTx(transactionMock);
            sendRequest.aesKey = aesKeyMock;
            sendRequest.missingSigsMode = Wallet.MissingSigsMode.USE_OP_ZERO;
            List<TransactionInput> transactionInputList = new ArrayList<>();
            transactionInputList.add(transactionInputMock);
            doReturn(transactionInputList).when(transactionMock).getInputs();
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(transactionOutputMock);
            doReturn(transactionOutputList).when(transactionMock).getOutputs();
            doReturn(transactionInputMock2).when(transactionMock).getInput(0L);
            doReturn(transactionOutputMock2).when(transactionInputMock2).getConnectedOutput();
            doReturn(coinMock).when(transactionOutputMock2).getValue();
            doReturn(scriptMock, scriptMock2).when(transactionOutputMock2).getScriptPubKey();
            doReturn(scriptMock3).when(transactionInputMock2).getScriptSig();
            EnumSet<Script.VerifyFlag> scriptVerifyFlagSet = EnumSet.noneOf(Script.VerifyFlag.class);
            scriptVerifyFlagSet.add(Script.VerifyFlag.P2SH);
            scriptVerifyFlagSet.add(Script.VerifyFlag.STRICTENC);
            scriptVerifyFlagSet.add(Script.VerifyFlag.DERSIG);
            scriptVerifyFlagSet.add(Script.VerifyFlag.LOW_S);
            scriptVerifyFlagSet.add(Script.VerifyFlag.NULLDUMMY);
            scriptVerifyFlagSet.add(Script.VerifyFlag.SIGPUSHONLY);
            scriptVerifyFlagSet.add(Script.VerifyFlag.MINIMALDATA);
            scriptVerifyFlagSet.add(Script.VerifyFlag.DISCOURAGE_UPGRADABLE_NOPS);
            scriptVerifyFlagSet.add(Script.VerifyFlag.CLEANSTACK);
            scriptVerifyFlagSet.add(Script.VerifyFlag.CHECKLOCKTIMEVERIFY);
            scriptVerifyFlagSet.add(Script.VerifyFlag.CHECKSEQUENCEVERIFY);
            doNothing().when(scriptMock3).correctlySpends(transactionMock, 0, transactionWitnessMock, coinMock, scriptMock2, scriptVerifyFlagSet);
            doReturn(transactionWitnessMock).when(transactionInputMock2).getWitness();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.signTransaction(sendRequest);
            //Assert statement(s)
            verify(transactionMock, times(2)).getInputs();
            verify(transactionMock).getOutputs();
            verify(transactionMock).getInput(0L);
            verify(transactionInputMock2).getConnectedOutput();
            verify(transactionOutputMock2, times(2)).getScriptPubKey();
            verify(transactionOutputMock2).getValue();
            verify(transactionInputMock2).getScriptSig();
            verify(scriptMock3).correctlySpends(transactionMock, 0, transactionWitnessMock, coinMock, scriptMock2, scriptVerifyFlagSet);
            verify(transactionInputMock2).getWitness();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${8e0151f7-dd3f-31a2-806e-cd06dcfa8f4a}, hash: 438EC802EA78ED69C346847D1C67C605
    @Ignore()
    @Test()
    public void signTransactionWhenCaughtKeyCrypterExceptionInvalidCipherTextOrKeyCrypterExc2ThrowsWalletBadWalletEncryptionKeyException() throws BadWalletEncryptionKeyException {
        /* Branches:
         * (inputs.size() > 0) : true
         * (outputs.size() > 0) : true
         * (i < numInputs) : true
         * (connectedOutput == null) : true
         * (for-each(signers)) : true
         * (!signer.signInputs(proposal, maybeDecryptingKeyBag)) : true
         * (catch-exception (KeyCrypterException.InvalidCipherText | KeyCrypterException.PublicPrivateMismatch)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type MissingSigResolutionSigner, signer
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        AesKey aesKeyMock = mock(AesKey.class);
        Transaction transactionMock = mock(Transaction.class);
        TransactionInput transactionInputMock = mock(TransactionInput.class);
        TransactionOutput transactionOutputMock = mock(TransactionOutput.class);
        TransactionInput transactionInputMock2 = mock(TransactionInput.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            SendRequest sendRequest = SendRequest.forTx(transactionMock);
            sendRequest.aesKey = aesKeyMock;
            sendRequest.missingSigsMode = Wallet.MissingSigsMode.USE_OP_ZERO;
            List<TransactionInput> transactionInputList = new ArrayList<>();
            transactionInputList.add(transactionInputMock);
            doReturn(transactionInputList).when(transactionMock).getInputs();
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(transactionOutputMock);
            doReturn(transactionOutputList).when(transactionMock).getOutputs();
            doReturn(transactionInputMock2).when(transactionMock).getInput(0L);
            doReturn(null).when(transactionInputMock2).getConnectedOutput();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(Wallet.BadWalletEncryptionKeyException.class);
            //Act Statement(s)
            target.signTransaction(sendRequest);
            //Assert statement(s)
            verify(transactionMock, times(2)).getInputs();
            verify(transactionMock).getOutputs();
            verify(transactionMock).getInput(0L);
            verify(transactionInputMock2).getConnectedOutput();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${e2ecfa1a-5f1d-3ef1-a925-b1ce235138ba}, hash: FE966F2D823675F0D9D89A1D9CAC2A25
    @Ignore()
    @Test()
    public void signTransactionWhenConnectedOutputIsNotNullAndCaughtScriptExceptionAndSignersIsNotEmptyAndSignerNotSignInputsProposalMa() throws BadWalletEncryptionKeyException, ScriptException {
        /* Branches:
         * (inputs.size() > 0) : true
         * (outputs.size() > 0) : true
         * (i < numInputs) : true
         * (connectedOutput == null) : false
         * (catch-exception (ScriptException)) : true
         * (for-each(signers)) : true
         * (!signer.signInputs(proposal, maybeDecryptingKeyBag)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type MissingSigResolutionSigner, signer
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        AesKey aesKeyMock = mock(AesKey.class);
        Transaction transactionMock = mock(Transaction.class);
        TransactionInput transactionInputMock = mock(TransactionInput.class);
        TransactionOutput transactionOutputMock = mock(TransactionOutput.class);
        TransactionInput transactionInputMock2 = mock(TransactionInput.class);
        TransactionOutput transactionOutputMock2 = mock(TransactionOutput.class);
        Script scriptMock = mock(Script.class);
        Script scriptMock2 = mock(Script.class);
        ECKey eCKeyMock = mock(ECKey.class);
        Script scriptMock3 = mock(Script.class);
        Coin coinMock = mock(Coin.class);
        Script scriptMock4 = mock(Script.class);
        Script scriptMock5 = mock(Script.class);
        TransactionWitness transactionWitnessMock = mock(TransactionWitness.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            SendRequest sendRequest = SendRequest.forTx(transactionMock);
            sendRequest.aesKey = aesKeyMock;
            sendRequest.missingSigsMode = Wallet.MissingSigsMode.USE_OP_ZERO;
            List<TransactionInput> transactionInputList = new ArrayList<>();
            transactionInputList.add(transactionInputMock);
            doReturn(transactionInputList).when(transactionMock).getInputs();
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(transactionOutputMock);
            doReturn(transactionOutputList).when(transactionMock).getOutputs();
            doReturn(transactionInputMock2).when(transactionMock).getInput(0L);
            doReturn(transactionOutputMock2).when(transactionInputMock2).getConnectedOutput();
            doReturn(scriptMock2).when(scriptMock).createEmptyInputScript(eCKeyMock, scriptMock3);
            doReturn(coinMock).when(transactionOutputMock2).getValue();
            doReturn(scriptMock, scriptMock4).when(transactionOutputMock2).getScriptPubKey();
            doReturn(scriptMock5).when(transactionInputMock2).getScriptSig();
            EnumSet<Script.VerifyFlag> scriptVerifyFlagSet = EnumSet.noneOf(Script.VerifyFlag.class);
            scriptVerifyFlagSet.add(Script.VerifyFlag.P2SH);
            scriptVerifyFlagSet.add(Script.VerifyFlag.STRICTENC);
            scriptVerifyFlagSet.add(Script.VerifyFlag.DERSIG);
            scriptVerifyFlagSet.add(Script.VerifyFlag.LOW_S);
            scriptVerifyFlagSet.add(Script.VerifyFlag.NULLDUMMY);
            scriptVerifyFlagSet.add(Script.VerifyFlag.SIGPUSHONLY);
            scriptVerifyFlagSet.add(Script.VerifyFlag.MINIMALDATA);
            scriptVerifyFlagSet.add(Script.VerifyFlag.DISCOURAGE_UPGRADABLE_NOPS);
            scriptVerifyFlagSet.add(Script.VerifyFlag.CLEANSTACK);
            scriptVerifyFlagSet.add(Script.VerifyFlag.CHECKLOCKTIMEVERIFY);
            scriptVerifyFlagSet.add(Script.VerifyFlag.CHECKSEQUENCEVERIFY);
            doNothing().when(scriptMock5).correctlySpends(transactionMock, 0, transactionWitnessMock, coinMock, scriptMock4, scriptVerifyFlagSet);
            doReturn(transactionWitnessMock).when(transactionInputMock2).getWitness();
            List list = new ArrayList<>();
            list.add(eCKeyMock);
            RedeemData redeemData = RedeemData.of(list, scriptMock3);
            doReturn(redeemData).when(transactionInputMock2).getConnectedRedeemData((KeyBag) any());
            doNothing().when(transactionInputMock2).setScriptSig(scriptMock2);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.signTransaction(sendRequest);
            //Assert statement(s)
            verify(transactionMock, times(2)).getInputs();
            verify(transactionMock).getOutputs();
            verify(transactionMock).getInput(0L);
            verify(transactionInputMock2).getConnectedOutput();
            verify(transactionOutputMock2, times(2)).getScriptPubKey();
            verify(scriptMock).createEmptyInputScript(eCKeyMock, scriptMock3);
            verify(transactionOutputMock2).getValue();
            verify(transactionInputMock2).getScriptSig();
            verify(scriptMock5).correctlySpends(transactionMock, 0, transactionWitnessMock, coinMock, scriptMock4, scriptVerifyFlagSet);
            verify(transactionInputMock2).getWitness();
            verify(transactionInputMock2).getConnectedRedeemData((KeyBag) any());
            verify(transactionInputMock2).setScriptSig(scriptMock2);
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${c98197f4-73f2-399a-9e6f-bc1d7cbe3bcc}, hash: 9AA0ADEEA8A8FA956D98C16A4746B251
    @Ignore()
    @Test()
    public void signTransactionWhenCaughtKeyCrypterExceptionInvalidCipherTextOrKeyCrypterExc3ThrowsWalletBadWalletEncryptionKeyException() throws BadWalletEncryptionKeyException, ScriptException {
        /* Branches:
         * (inputs.size() > 0) : true
         * (outputs.size() > 0) : true
         * (i < numInputs) : true
         * (connectedOutput == null) : false
         * (for-each(signers)) : true
         * (!signer.signInputs(proposal, maybeDecryptingKeyBag)) : true
         * (catch-exception (KeyCrypterException.InvalidCipherText | KeyCrypterException.PublicPrivateMismatch)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type MissingSigResolutionSigner, signer
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        AesKey aesKeyMock = mock(AesKey.class);
        Transaction transactionMock = mock(Transaction.class);
        TransactionInput transactionInputMock = mock(TransactionInput.class);
        TransactionOutput transactionOutputMock = mock(TransactionOutput.class);
        TransactionInput transactionInputMock2 = mock(TransactionInput.class);
        TransactionOutput transactionOutputMock2 = mock(TransactionOutput.class);
        Script scriptMock = mock(Script.class);
        Coin coinMock = mock(Coin.class);
        Script scriptMock2 = mock(Script.class);
        Script scriptMock3 = mock(Script.class);
        TransactionWitness transactionWitnessMock = mock(TransactionWitness.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            SendRequest sendRequest = SendRequest.forTx(transactionMock);
            sendRequest.aesKey = aesKeyMock;
            sendRequest.missingSigsMode = Wallet.MissingSigsMode.USE_OP_ZERO;
            List<TransactionInput> transactionInputList = new ArrayList<>();
            transactionInputList.add(transactionInputMock);
            doReturn(transactionInputList).when(transactionMock).getInputs();
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(transactionOutputMock);
            doReturn(transactionOutputList).when(transactionMock).getOutputs();
            doReturn(transactionInputMock2).when(transactionMock).getInput(0L);
            doReturn(transactionOutputMock2).when(transactionInputMock2).getConnectedOutput();
            doReturn(coinMock).when(transactionOutputMock2).getValue();
            doReturn(scriptMock, scriptMock2).when(transactionOutputMock2).getScriptPubKey();
            doReturn(scriptMock3).when(transactionInputMock2).getScriptSig();
            EnumSet<Script.VerifyFlag> scriptVerifyFlagSet = EnumSet.noneOf(Script.VerifyFlag.class);
            scriptVerifyFlagSet.add(Script.VerifyFlag.P2SH);
            scriptVerifyFlagSet.add(Script.VerifyFlag.STRICTENC);
            scriptVerifyFlagSet.add(Script.VerifyFlag.DERSIG);
            scriptVerifyFlagSet.add(Script.VerifyFlag.LOW_S);
            scriptVerifyFlagSet.add(Script.VerifyFlag.NULLDUMMY);
            scriptVerifyFlagSet.add(Script.VerifyFlag.SIGPUSHONLY);
            scriptVerifyFlagSet.add(Script.VerifyFlag.MINIMALDATA);
            scriptVerifyFlagSet.add(Script.VerifyFlag.DISCOURAGE_UPGRADABLE_NOPS);
            scriptVerifyFlagSet.add(Script.VerifyFlag.CLEANSTACK);
            scriptVerifyFlagSet.add(Script.VerifyFlag.CHECKLOCKTIMEVERIFY);
            scriptVerifyFlagSet.add(Script.VerifyFlag.CHECKSEQUENCEVERIFY);
            doNothing().when(scriptMock3).correctlySpends(transactionMock, 0, transactionWitnessMock, coinMock, scriptMock2, scriptVerifyFlagSet);
            doReturn(transactionWitnessMock).when(transactionInputMock2).getWitness();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(Wallet.BadWalletEncryptionKeyException.class);
            //Act Statement(s)
            target.signTransaction(sendRequest);
            //Assert statement(s)
            verify(transactionMock, times(2)).getInputs();
            verify(transactionMock).getOutputs();
            verify(transactionMock).getInput(0L);
            verify(transactionInputMock2).getConnectedOutput();
            verify(transactionOutputMock2, times(2)).getScriptPubKey();
            verify(transactionOutputMock2).getValue();
            verify(transactionInputMock2).getScriptSig();
            verify(scriptMock3).correctlySpends(transactionMock, 0, transactionWitnessMock, coinMock, scriptMock2, scriptVerifyFlagSet);
            verify(transactionInputMock2).getWitness();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${ccaf7952-0c6f-3dd9-a805-d475706b922d}, hash: 57914DB6758379115FDF8BD955F1507F
    @Test()
    public void calculateAllSpendCandidatesTest() throws UTXOProviderException {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            doReturn(transactionOutputList).when(target).calculateAllSpendCandidates(true, true);
            //Act Statement(s)
            List<TransactionOutput> result = target.calculateAllSpendCandidates();
            //Assert statement(s)
            assertThat(result, equalTo(transactionOutputList));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).calculateAllSpendCandidates(true, true);
        }
    }

    //Sapient generated method id: ${c07d95b7-4ba1-319b-8f6e-2fd00dd5ae32}, hash: 886B181AA42A8EE731CFB8A97298BEE5
    @Ignore()
    @Test()
    public void calculateAllSpendCandidates1WhenVUTXOProviderIsNull() throws UTXOProviderException {
        /* Branches:
         * (vUTXOProvider == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock2 = mock(Network.class);
        try (MockedStatic<StreamUtils> streamUtils = mockStatic(StreamUtils.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class, CALLS_REAL_METHODS)) {
            ReentrantLock reentrantLock = Threading.lock("Wallet-KeyChainGroup lock");
            threading.when(() -> Threading.lock("Wallet-KeyChainGroup lock")).thenReturn(reentrantLock);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            Collector collector = StreamUtils.toUnmodifiableList();
            streamUtils.when(() -> StreamUtils.toUnmodifiableList()).thenReturn(collector);
            KeyChainGroup keyChainGroup = KeyChainGroup.createBasic(networkMock2);
            target = new Wallet(networkMock, keyChainGroup);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            List<TransactionOutput> result = target.calculateAllSpendCandidates(true, false);
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            threading.verify(() -> Threading.lock("Wallet-KeyChainGroup lock"), atLeast(1));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            streamUtils.verify(() -> StreamUtils.toUnmodifiableList(), atLeast(1));
        }
    }

    //Sapient generated method id: ${367d2d0b-3e8c-3150-91bd-3906789ac0e7}, hash: 230557D56F4D208522ACA588F63DA675
    @Test()
    public void canSignForWhenKeyHasPrivKey() {
        /* Branches:
         * (ScriptPattern.isP2PK(script)) : true
         * (key != null) : true
         * (key.isEncrypted()) : false
         * (key.hasPrivKey()) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Script scriptMock = mock(Script.class);
        ECKey eCKeyMock = mock(ECKey.class);
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(true);
            byte[] byteArray = new byte[]{};
            scriptPattern.when(() -> ScriptPattern.extractKeyFromP2PK(scriptMock)).thenReturn(byteArray);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(eCKeyMock).when(keyChainGroupMock).findKeyFromPubKey(byteArray);
            doReturn(false).when(eCKeyMock).isEncrypted();
            doReturn(true).when(eCKeyMock).hasPrivKey();
            //Act Statement(s)
            boolean result = target.canSignFor(scriptMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractKeyFromP2PK(scriptMock), atLeast(1));
            verify(keyChainGroupMock).findKeyFromPubKey(byteArray);
            verify(eCKeyMock).isEncrypted();
            verify(eCKeyMock).hasPrivKey();
        }
    }

    //Sapient generated method id: ${ca44c3d6-7207-3946-8ee6-01846505be1c}, hash: 1B53A5079B0442C8F1336DBA1F0E4F53
    @Test()
    public void canSignForWhenKeyNotHasPrivKey() {
        /* Branches:
         * (ScriptPattern.isP2PK(script)) : true
         * (key != null) : true
         * (key.isEncrypted()) : false
         * (key.hasPrivKey()) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Script scriptMock = mock(Script.class);
        ECKey eCKeyMock = mock(ECKey.class);
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(true);
            byte[] byteArray = new byte[]{};
            scriptPattern.when(() -> ScriptPattern.extractKeyFromP2PK(scriptMock)).thenReturn(byteArray);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(eCKeyMock).when(keyChainGroupMock).findKeyFromPubKey(byteArray);
            doReturn(false).when(eCKeyMock).isEncrypted();
            doReturn(false).when(eCKeyMock).hasPrivKey();
            //Act Statement(s)
            boolean result = target.canSignFor(scriptMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractKeyFromP2PK(scriptMock), atLeast(1));
            verify(keyChainGroupMock).findKeyFromPubKey(byteArray);
            verify(eCKeyMock).isEncrypted();
            verify(eCKeyMock).hasPrivKey();
        }
    }

    //Sapient generated method id: ${ba39619b-0f63-3b24-8e60-9dce8276c980}, hash: 85B9B4B9B88C2096507B976BC16AFCD3
    @Ignore()
    @Test()
    public void canSignForWhenCanSignForDataRedeemScript() {
        /* Branches:
         * (ScriptPattern.isP2PK(script)) : false
         * (ScriptPattern.isP2SH(script)) : true
         * (data != null) : true
         * (canSignFor(data.redeemScript)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Script scriptMock = mock(Script.class);
        Script scriptMock2 = mock(Script.class);
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(true);
            byte[] byteArray = new byte[]{};
            scriptPattern.when(() -> ScriptPattern.extractHashFromP2SH(scriptMock)).thenReturn(byteArray);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List list = new ArrayList<>();
            RedeemData redeemData = RedeemData.of(list, scriptMock2);
            doReturn(redeemData).when(keyChainGroupMock).findRedeemDataFromScriptHash(byteArray);
            //Act Statement(s)
            boolean result = target.canSignFor(scriptMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractHashFromP2SH(scriptMock), atLeast(1));
            verify(keyChainGroupMock).findRedeemDataFromScriptHash(byteArray);
        }
    }

    //Sapient generated method id: ${b19da24d-6cc7-3e6b-9972-3cba05e6312e}, hash: CB05780ADCE1A0D73B5945639EFA90B4
    @Test()
    public void canSignForWhenCanSignForNotDataRedeemScript() {
        /* Branches:
         * (ScriptPattern.isP2PK(script)) : false
         * (ScriptPattern.isP2SH(script)) : true
         * (data != null) : true
         * (canSignFor(data.redeemScript)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Script scriptMock = mock(Script.class);
        Script scriptMock2 = mock(Script.class);
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(true);
            byte[] byteArray = new byte[]{};
            scriptPattern.when(() -> ScriptPattern.extractHashFromP2SH(scriptMock)).thenReturn(byteArray);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List list = new ArrayList<>();
            RedeemData redeemData = RedeemData.of(list, scriptMock2);
            doReturn(redeemData).when(keyChainGroupMock).findRedeemDataFromScriptHash(byteArray);
            //Act Statement(s)
            boolean result = target.canSignFor(scriptMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractHashFromP2SH(scriptMock), atLeast(1));
            verify(keyChainGroupMock).findRedeemDataFromScriptHash(byteArray);
        }
    }

    //Sapient generated method id: ${0e3d0908-7ea4-3e38-ab16-31eac1840c83}, hash: CBF2C739F5344E9E310780CC06EF1CB8
    @Test()
    public void canSignForWhenKeyNotIsEncryptedAndKeyHasPrivKey() {
        /* Branches:
         * (ScriptPattern.isP2PK(script)) : false
         * (ScriptPattern.isP2SH(script)) : false
         * (ScriptPattern.isP2PKH(script)) : true
         * (key != null) : true
         * (key.isEncrypted()) : false
         * (key.hasPrivKey()) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Script scriptMock = mock(Script.class);
        ECKey eCKeyMock = mock(ECKey.class);
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(true);
            byte[] byteArray = new byte[]{};
            scriptPattern.when(() -> ScriptPattern.extractHashFromP2PKH(scriptMock)).thenReturn(byteArray);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(eCKeyMock).when(keyChainGroupMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2PKH);
            doReturn(false).when(eCKeyMock).isEncrypted();
            doReturn(true).when(eCKeyMock).hasPrivKey();
            //Act Statement(s)
            boolean result = target.canSignFor(scriptMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractHashFromP2PKH(scriptMock), atLeast(1));
            verify(keyChainGroupMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2PKH);
            verify(eCKeyMock).isEncrypted();
            verify(eCKeyMock).hasPrivKey();
        }
    }

    //Sapient generated method id: ${413a5807-b845-3bc6-b64d-f17502d80e6e}, hash: 2E70CAB76017517574A9055149014967
    @Test()
    public void canSignForWhenKeyNotIsEncryptedAndKeyNotHasPrivKey() {
        /* Branches:
         * (ScriptPattern.isP2PK(script)) : false
         * (ScriptPattern.isP2SH(script)) : false
         * (ScriptPattern.isP2PKH(script)) : true
         * (key != null) : true
         * (key.isEncrypted()) : false
         * (key.hasPrivKey()) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Script scriptMock = mock(Script.class);
        ECKey eCKeyMock = mock(ECKey.class);
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(true);
            byte[] byteArray = new byte[]{};
            scriptPattern.when(() -> ScriptPattern.extractHashFromP2PKH(scriptMock)).thenReturn(byteArray);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(eCKeyMock).when(keyChainGroupMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2PKH);
            doReturn(false).when(eCKeyMock).isEncrypted();
            doReturn(false).when(eCKeyMock).hasPrivKey();
            //Act Statement(s)
            boolean result = target.canSignFor(scriptMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractHashFromP2PKH(scriptMock), atLeast(1));
            verify(keyChainGroupMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2PKH);
            verify(eCKeyMock).isEncrypted();
            verify(eCKeyMock).hasPrivKey();
        }
    }

    //Sapient generated method id: ${c059674f-6c92-301a-b7ac-e77e5cce847d}, hash: F7A638106770D55BD63EBA6E41165B9A
    @Test()
    public void canSignForWhenKeyHasPrivKeyAndKeyIsCompressed() {
        /* Branches:
         * (ScriptPattern.isP2PK(script)) : false
         * (ScriptPattern.isP2SH(script)) : false
         * (ScriptPattern.isP2PKH(script)) : false
         * (ScriptPattern.isP2WPKH(script)) : true
         * (key != null) : true
         * (key.isEncrypted()) : false
         * (key.hasPrivKey()) : true
         * (key.isCompressed()) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Script scriptMock = mock(Script.class);
        ECKey eCKeyMock = mock(ECKey.class);
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(true);
            byte[] byteArray = new byte[]{};
            scriptPattern.when(() -> ScriptPattern.extractHashFromP2WH(scriptMock)).thenReturn(byteArray);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(eCKeyMock).when(keyChainGroupMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2WPKH);
            doReturn(false).when(eCKeyMock).isEncrypted();
            doReturn(true).when(eCKeyMock).hasPrivKey();
            doReturn(true).when(eCKeyMock).isCompressed();
            //Act Statement(s)
            boolean result = target.canSignFor(scriptMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractHashFromP2WH(scriptMock), atLeast(1));
            verify(keyChainGroupMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2WPKH);
            verify(eCKeyMock).isEncrypted();
            verify(eCKeyMock).hasPrivKey();
            verify(eCKeyMock).isCompressed();
        }
    }

    //Sapient generated method id: ${1490d6aa-347e-34d8-b940-70e2a0f515b0}, hash: 5263C3528A5CDD4DF8760E9C5419F8AC
    @Test()
    public void canSignForWhenKeyHasPrivKeyAndKeyNotIsCompressed() {
        /* Branches:
         * (ScriptPattern.isP2PK(script)) : false
         * (ScriptPattern.isP2SH(script)) : false
         * (ScriptPattern.isP2PKH(script)) : false
         * (ScriptPattern.isP2WPKH(script)) : true
         * (key != null) : true
         * (key.isEncrypted()) : false
         * (key.hasPrivKey()) : true
         * (key.isCompressed()) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Script scriptMock = mock(Script.class);
        ECKey eCKeyMock = mock(ECKey.class);
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(true);
            byte[] byteArray = new byte[]{};
            scriptPattern.when(() -> ScriptPattern.extractHashFromP2WH(scriptMock)).thenReturn(byteArray);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(eCKeyMock).when(keyChainGroupMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2WPKH);
            doReturn(false).when(eCKeyMock).isEncrypted();
            doReturn(true).when(eCKeyMock).hasPrivKey();
            doReturn(false).when(eCKeyMock).isCompressed();
            //Act Statement(s)
            boolean result = target.canSignFor(scriptMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractHashFromP2WH(scriptMock), atLeast(1));
            verify(keyChainGroupMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2WPKH);
            verify(eCKeyMock).isEncrypted();
            verify(eCKeyMock).hasPrivKey();
            verify(eCKeyMock).isCompressed();
        }
    }

    //Sapient generated method id: ${99f35616-6f89-3ea4-8577-412089c8cfe1}, hash: 285CB99FEDF0C9D01BBE29E0A2E7F7D0
    @Test()
    public void canSignForWhenKeyIsNotNullAndKeyNotIsEncryptedAndKeyHasPrivKey() {
        /* Branches:
         * (ScriptPattern.isP2PK(script)) : false
         * (ScriptPattern.isP2SH(script)) : false
         * (ScriptPattern.isP2PKH(script)) : false
         * (ScriptPattern.isP2WPKH(script)) : false
         * (ScriptPattern.isSentToMultisig(script)) : true
         * (for-each(script.getPubKeys())) : true
         * (key != null) : true
         * (key.isEncrypted()) : false
         * (key.hasPrivKey()) : true
         */
        //Arrange Statement(s)
        Script scriptMock = mock(Script.class);
        ECKey eCKeyMock = mock(ECKey.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        ECKey eCKeyMock2 = mock(ECKey.class);
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            List<ECKey> eCKeyList = new ArrayList<>();
            eCKeyList.add(eCKeyMock);
            doReturn(eCKeyList).when(scriptMock).getPubKeys();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(eCKeyMock).getPubKey();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isSentToMultisig(scriptMock)).thenReturn(true);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(eCKeyMock2).when(keyChainGroupMock).findKeyFromPubKey(byteArray);
            doReturn(false).when(eCKeyMock2).isEncrypted();
            doReturn(true).when(eCKeyMock2).hasPrivKey();
            //Act Statement(s)
            boolean result = target.canSignFor(scriptMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            verify(scriptMock).getPubKeys();
            verify(eCKeyMock).getPubKey();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isSentToMultisig(scriptMock), atLeast(1));
            verify(keyChainGroupMock).findKeyFromPubKey(byteArray);
            verify(eCKeyMock2).isEncrypted();
            verify(eCKeyMock2).hasPrivKey();
        }
    }

    //Sapient generated method id: ${b7833aee-3510-3ab6-b1f7-918a0f78efb9}, hash: 24CF85EC0CE0BA60DF915669BE4DC100
    @Test()
    public void canSignForWhenScriptGetPubKeysIsNotEmptyAndKeyIsNotNullAndKeyNotIsEncryptedAndKeyNotHasPrivKey() {
        /* Branches:
         * (ScriptPattern.isP2PK(script)) : false
         * (ScriptPattern.isP2SH(script)) : false
         * (ScriptPattern.isP2PKH(script)) : false
         * (ScriptPattern.isP2WPKH(script)) : false
         * (ScriptPattern.isSentToMultisig(script)) : true
         * (for-each(script.getPubKeys())) : true
         * (key != null) : true
         * (key.isEncrypted()) : false
         * (key.hasPrivKey()) : false
         */
        //Arrange Statement(s)
        Script scriptMock = mock(Script.class);
        ECKey eCKeyMock = mock(ECKey.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        ECKey eCKeyMock2 = mock(ECKey.class);
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            List<ECKey> eCKeyList = new ArrayList<>();
            eCKeyList.add(eCKeyMock);
            doReturn(eCKeyList).when(scriptMock).getPubKeys();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(eCKeyMock).getPubKey();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isSentToMultisig(scriptMock)).thenReturn(true);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(eCKeyMock2).when(keyChainGroupMock).findKeyFromPubKey(byteArray);
            doReturn(false).when(eCKeyMock2).isEncrypted();
            doReturn(false).when(eCKeyMock2).hasPrivKey();
            //Act Statement(s)
            boolean result = target.canSignFor(scriptMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(scriptMock).getPubKeys();
            verify(eCKeyMock).getPubKey();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isSentToMultisig(scriptMock), atLeast(1));
            verify(keyChainGroupMock).findKeyFromPubKey(byteArray);
            verify(eCKeyMock2).isEncrypted();
            verify(eCKeyMock2).hasPrivKey();
        }
    }

    //Sapient generated method id: ${9d622761-87cd-3b38-827a-6a180ffe9967}, hash: B343B0933DF59893B3513AC84F9910A5
    @Test()
    public void calculateAllSpendCandidatesFromUTXOProviderThrowsIllegalStateException() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.calculateAllSpendCandidatesFromUTXOProvider(false);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${4bd4b202-18a4-3971-9782-83493ac8f963}, hash: 73A80492588A6C1B7581F8F7E928FA24
    @Test()
    public void getStoredOutputsFromUTXOProviderThrowsNullPointerException() throws UTXOProviderException {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(NullPointerException.class);
            //Act Statement(s)
            target.getStoredOutputsFromUTXOProvider();
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${85aa21ba-6fcc-3e91-87a6-5d0a4e15c6b1}, hash: 2073DB97946C295A5655AFC569721B78
    @Test()
    public void getCoinSelectorTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            CoinSelector result = target.getCoinSelector();
            //Assert statement(s)
            assertThat(result, equalTo(coinSelectorMock));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${b84f9d8c-1699-327f-9c3f-6c579ffecaf4}, hash: 56C95E1F2A0E0B0A626939D3E6CFD466
    @Test()
    public void getUTXOProviderTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            UTXOProvider result = target.getUTXOProvider();
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${40361cca-9ff9-3856-92a1-70d38fa181a3}, hash: F01877F5EBA94DF537B2496C824A5E5E
    @Test()
    public void setUTXOProviderWhenProviderNetworkEqualsNetwork() {
        /* Branches:
         * (provider == null) : false
         * (provider.network() == network) : true
         */
        //Arrange Statement(s)
        UTXOProvider providerMock = mock(UTXOProvider.class);
        Network networkMock2 = mock(Network.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(networkMock2).when(providerMock).network();
            networkParameters.when(() -> NetworkParameters.of(networkMock2)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock2)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock2)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock2, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.setUTXOProvider(providerMock);
            //Assert statement(s)
            verify(providerMock).network();
            networkParameters.verify(() -> NetworkParameters.of(networkMock2), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock2), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${6b991fb5-8d36-3523-bda2-b21c6a7a0fe1}, hash: 0E5FA0E9EF643F6C62E866F2FE44A8A9
    @Test()
    public void setUTXOProviderWhenProviderNetworkNotEqualsNetworkThrowsIllegalArgumentException() {
        /* Branches:
         * (provider == null) : false
         * (provider.network() == network) : false
         */
        //Arrange Statement(s)
        UTXOProvider providerMock = mock(UTXOProvider.class);
        Network networkMock2 = mock(Network.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(networkMock2).when(providerMock).network();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.setUTXOProvider(providerMock);
            //Assert statement(s)
            verify(providerMock).network();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${18b5c8da-ed58-3d01-88e9-bf4b5976635a}, hash: 6B8C7C14CAAB5F4CAC12245EDAF98D19
    @Test()
    public void reorganizeWhenAppearsInIsNullThrowsNullPointerException() throws VerificationException {
        /* Branches:
         * (confidenceChanged.size() == 0) : true
         * (!insideReorg) : true
         * (onWalletChangedSuppressions == 0) : true
         * (for-each(getTransactions(true))) : true
         * (appearsIn == null) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Transaction transactionMock = mock(Transaction.class);
        StoredBlock storedBlockMock = mock(StoredBlock.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            Set<Transaction> transactionSet = new HashSet<>();
            transactionSet.add(transactionMock);
            doReturn(transactionSet).when(target).getTransactions(true);
            doReturn(null).when(transactionMock).getAppearsInHashes();
            thrown.expect(NullPointerException.class);
            List<StoredBlock> storedBlockList = new ArrayList<>();
            List<StoredBlock> storedBlockList2 = new ArrayList<>();
            //Act Statement(s)
            target.reorganize(storedBlockMock, storedBlockList, storedBlockList2);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).getTransactions(true);
            verify(transactionMock).getAppearsInHashes();
        }
    }

    //Sapient generated method id: ${f7e1c4ca-f2f6-33f7-869e-9c29243e7a01}, hash: 802926DCDC8420D0596A2A3BE6644D09
    @Test()
    public void reorganizeWhenNewBlocksIsNotEmptyAndOldBlockHashesIsNotEmptyAndMapBlockTxGetBlockHashIsNotEmpThrowsNullPointerException() throws VerificationException {
        /* Branches:
         * (confidenceChanged.size() == 0) : true
         * (!insideReorg) : true
         * (onWalletChangedSuppressions == 0) : true
         * (for-each(getTransactions(true))) : true
         * (appearsIn == null) : false
         * (for-each(appearsIn.entrySet())) : true
         * (for-each(mapBlockTx.keySet())) : false
         * (for-each(oldBlocks)) : true
         * (for-each(newBlocks)) : true
         * (for-each(oldBlockHashes)) : true
         * (for-each(mapBlockTx.get(blockHash))) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: mapBlockTx
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Block blockMock = mock(Block.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Block blockMock2 = mock(Block.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Transaction transactionMock = mock(Transaction.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        StoredBlock storedBlockMock = mock(StoredBlock.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn("return_of_getHashAsString1").when(blockMock).getHashAsString();
            doReturn(sha256HashMock).when(blockMock).getHash();
            doReturn("return_of_getHashAsString1").when(blockMock2).getHashAsString();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            Set<Transaction> transactionSet = new HashSet<>();
            transactionSet.add(transactionMock);
            doReturn(transactionSet).when(target).getTransactions(true);
            Map<Sha256Hash, Integer> sha256HashIntegerMap = new HashMap<>();
            sha256HashIntegerMap.put(sha256HashMock2, 1);
            doReturn(sha256HashIntegerMap).when(transactionMock).getAppearsInHashes();
            thrown.expect(NullPointerException.class);
            StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 0);
            List<StoredBlock> storedBlockList = new ArrayList<>();
            storedBlockList.add(storedBlock);
            StoredBlock storedBlock2 = new StoredBlock(blockMock2, new BigInteger("0"), 0);
            List<StoredBlock> storedBlockList2 = new ArrayList<>();
            storedBlockList2.add(storedBlock2);
            //Act Statement(s)
            target.reorganize(storedBlockMock, storedBlockList, storedBlockList2);
            //Assert statement(s)
            verify(blockMock).getHashAsString();
            verify(blockMock).getHash();
            verify(blockMock2).getHashAsString();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).getTransactions(true);
            verify(transactionMock).getAppearsInHashes();
        }
    }

    //Sapient generated method id: ${53441f5a-0b62-3b99-9949-a8d1c580ce4d}, hash: 53706697BED0FA27C32CEF706A51C160
    @Ignore()
    @Test()
    public void reorganizeWhenNewBlocksIsNotEmptyAndMapBlockTxGetBlockGetHeaderGetHashIsNotEmpty7ThrowsIllegalStateException() throws VerificationException {
        /* Branches:
         * (confidenceChanged.size() == 0) : true
         * (!insideReorg) : true
         * (onWalletChangedSuppressions == 0) : true
         * (for-each(getTransactions(true))) : true
         * (appearsIn == null) : false
         * (for-each(appearsIn.entrySet())) : true
         * (for-each(mapBlockTx.keySet())) : false
         * (for-each(oldBlocks)) : true
         * (for-each(newBlocks)) : true
         * (for-each(oldBlockHashes)) : true
         * (for-each(mapBlockTx.get(blockHash))) : false
         * (for-each(oldChainTxns)) : false
         * (for-each(transactions)) : false  #  inside subtractDepth method
         * (for-each(newBlocks)) : true
         * (for-each(mapBlockTx.get(block.getHeader().getHash()))) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: mapBlockTx
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Block blockMock = mock(Block.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(sha256HashMock).when(blockMock).getHash();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            Set<Transaction> transactionSet = new HashSet<>();
            doReturn(transactionSet).when(target).getTransactions(true);
            thrown.expect(IllegalStateException.class);
            StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 0);
            List<StoredBlock> storedBlockList = new ArrayList<>();
            List<StoredBlock> storedBlockList2 = new ArrayList<>();
            //Act Statement(s)
            target.reorganize(storedBlock, storedBlockList, storedBlockList2);
            //Assert statement(s)
            verify(blockMock).getHash();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).getTransactions(true);
        }
    }

    //Sapient generated method id: ${aa826473-5a87-36de-8840-c110459abfa3}, hash: D1C7B1ACAD5B402B4AC15A2C74CE5CA5
    @Ignore()
    @Test()
    public void reorganizeWhenNewBlocksIsNotEmptyAndMapBlockTxGetBlockGetHeaderGetHashIsEmpty8ThrowsIllegalStateException() throws VerificationException, IllegalStateException {
        /* Branches:
         * (confidenceChanged.size() == 0) : true
         * (!insideReorg) : true
         * (onWalletChangedSuppressions == 0) : true
         * (for-each(getTransactions(true))) : true
         * (appearsIn == null) : false
         * (for-each(appearsIn.entrySet())) : true
         * (for-each(mapBlockTx.keySet())) : false
         * (for-each(oldBlocks)) : true
         * (for-each(newBlocks)) : true
         * (for-each(oldBlockHashes)) : true
         * (for-each(mapBlockTx.get(blockHash))) : false
         * (for-each(oldChainTxns)) : false
         * (for-each(transactions)) : false  #  inside subtractDepth method
         * (for-each(newBlocks)) : true
         * (for-each(mapBlockTx.get(block.getHeader().getHash()))) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: mapBlockTx
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Block blockMock = mock(Block.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        Block blockMock2 = mock(Block.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        Coin coinMock = mock(Coin.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(sha256HashMock).when(blockMock).getHash();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            Set<Transaction> transactionSet = new HashSet<>();
            doReturn(transactionSet).when(target).getTransactions(true);
            StoredBlock storedBlock = new StoredBlock(blockMock2, new BigInteger("0"), 0);
            doNothing().when(target).notifyNewBestBlock(storedBlock);
            doReturn("return_of_getHashAsString1").when(blockMock2).getHashAsString();
            doReturn(sha256HashMock2).when(blockMock2).getHash();
            doNothing().when(target).isConsistentOrThrow();
            doReturn(coinMock).when(target).getBalance();
            doReturn("return_of_toFriendlyString1").when(coinMock).toFriendlyString();
            doNothing().when(target).queueOnReorganize();
            doNothing().when(target).maybeQueueOnWalletChanged();
            thrown.expect(IllegalStateException.class);
            StoredBlock storedBlock2 = new StoredBlock(blockMock, new BigInteger("0"), 0);
            List<StoredBlock> storedBlockList = new ArrayList<>();
            List<StoredBlock> storedBlockList2 = new ArrayList<>();
            //Act Statement(s)
            target.reorganize(storedBlock2, storedBlockList, storedBlockList2);
            //Assert statement(s)
            verify(blockMock).getHash();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).getTransactions(true);
            verify(target).notifyNewBestBlock(storedBlock);
            verify(blockMock2).getHashAsString();
            verify(blockMock2).getHash();
            verify(target).isConsistentOrThrow();
            verify(target).getBalance();
            verify(coinMock).toFriendlyString();
            verify(target).queueOnReorganize();
            verify(target).maybeQueueOnWalletChanged();
        }
    }

    //Sapient generated method id: ${6eead88f-e109-331c-8845-e308c3dcbac7}, hash: 3CC2ACE79AADF86A3DA4515F7CA7234C
    @Test()
    public void beginBloomFilterCalculationWhenBloomFilterGuardIncrementAndGetNotGreaterThan1() {
        /* Branches:
         * (bloomFilterGuard.incrementAndGet() > 1) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.beginBloomFilterCalculation();
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${4d404257-0b89-3b75-9df6-06bb62a838f9}, hash: 1BEC0F8D772B63B20685A949AD33FFFE
    @Ignore()
    @Test()
    public void endBloomFilterCalculationWhenBloomFilterGuardDecrementAndGetNotGreaterThan0() {
        /* Branches:
         * (bloomFilterGuard.decrementAndGet() > 0) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.endBloomFilterCalculation();
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${c5e52c50-de64-3285-b270-6e5d0d306944}, hash: C7DC84C4FC48390D186C18CD08A72382
    @Test()
    public void getBloomFilterElementCountTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).beginBloomFilterCalculation();
            doReturn(0).when(keyChainGroupMock).getBloomFilterElementCount();
            doNothing().when(target).endBloomFilterCalculation();
            //Act Statement(s)
            int result = target.getBloomFilterElementCount();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).beginBloomFilterCalculation();
            verify(keyChainGroupMock).getBloomFilterElementCount();
            verify(target).endBloomFilterCalculation();
        }
    }

    //Sapient generated method id: ${e7b56c6e-9d9c-3e39-96f0-fb25207028c6}, hash: 8B5F34C7093E9A9C803E8AC6FF174C27
    @Ignore()
    @Test()
    public void getBloomFilterTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Method java.util.Random::nextInt has a unrepeatable behavior
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        BloomFilter bloomFilterMock = mock(BloomFilter.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).beginBloomFilterCalculation();
            doReturn(0).when(target).getBloomFilterElementCount();
            doReturn(bloomFilterMock).when(target).getBloomFilter(0, Double.parseDouble("0.0"), 0);
            doNothing().when(target).endBloomFilterCalculation();
            //Act Statement(s)
            BloomFilter result = target.getBloomFilter(Double.parseDouble("0.0"));
            //Assert statement(s)
            assertThat(result, equalTo(bloomFilterMock));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).beginBloomFilterCalculation();
            verify(target).getBloomFilterElementCount();
            verify(target).getBloomFilter(0, Double.parseDouble("0.0"), 0);
            verify(target).endBloomFilterCalculation();
        }
    }

    //Sapient generated method id: ${fc69b898-d22b-394b-83a2-c2917668cc77}, hash: E43A6E836B54606F46592E9C9E7FEC05
    @Test()
    public void getBloomFilter1WhenBloomOutPointsIsEmpty() {
        /* Branches:
         * (for-each(watchedScripts)) : false
         * (for-each(bloomOutPoints)) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        BloomFilter bloomFilterMock = mock(BloomFilter.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).beginBloomFilterCalculation();
            doReturn(bloomFilterMock).when(keyChainGroupMock).getBloomFilter(0, Double.parseDouble("0.0"), 0);
            doNothing().when(target).endBloomFilterCalculation();
            //Act Statement(s)
            BloomFilter result = target.getBloomFilter(0, Double.parseDouble("0.0"), 0);
            //Assert statement(s)
            assertThat(result, equalTo(bloomFilterMock));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).beginBloomFilterCalculation();
            verify(keyChainGroupMock).getBloomFilter(0, Double.parseDouble("0.0"), 0);
            verify(target).endBloomFilterCalculation();
        }
    }

    //Sapient generated method id: ${c4234a11-79e0-3ada-8901-7def7d5179db}, hash: 9124856CEBE317051285A2E53A66A01B
    @Test()
    public void checkForFilterExhaustionWhenKeyChainGroupNotSupportsDeterministicChains() {
        /* Branches:
         * (!keyChainGroup.supportsDeterministicChains()) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        FilteredBlock filteredBlockMock = mock(FilteredBlock.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(false).when(keyChainGroupMock).supportsDeterministicChains();
            //Act Statement(s)
            boolean result = target.checkForFilterExhaustion(filteredBlockMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).supportsDeterministicChains();
        }
    }

    //Sapient generated method id: ${185feadd-342b-3a11-98c6-1877cee9f307}, hash: 66D3439181DEBC5B7BC1301D1CCB11DC
    @Ignore()
    @Test()
    public void checkForFilterExhaustionWhenCaughtScriptExceptionAndNewEpochLessThanEpochThrowsIllegalStateException() throws ScriptException {
        /* Branches:
         * (!keyChainGroup.supportsDeterministicChains()) : false
         * (for-each(block.getAssociatedTransactions().values())) : true
         * (for-each(tx.getOutputs())) : true  #  inside markKeysAsUsed method
         * (ScriptPattern.isP2PK(script)) : true  #  inside markKeysAsUsed method
         * (catch-exception (ScriptException)) : true  #  inside markKeysAsUsed method
         * (newEpoch >= epoch) : false
         */
        //Arrange Statement(s)
        FilteredBlock blockMock = mock(FilteredBlock.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Transaction transactionMock = mock(Transaction.class);
        TransactionOutput transactionOutputMock = mock(TransactionOutput.class);
        TransactionOutput transactionOutputMock2 = mock(TransactionOutput.class);
        ScriptException scriptExceptionMock = mock(ScriptException.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            Map<Sha256Hash, Transaction> sha256HashTransactionMap = new HashMap<>();
            sha256HashTransactionMap.put(sha256HashMock, transactionMock);
            doReturn(sha256HashTransactionMap).when(blockMock).getAssociatedTransactions();
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(transactionOutputMock);
            transactionOutputList.add(transactionOutputMock2);
            doReturn(transactionOutputList).when(transactionMock).getOutputs();
            doThrow(scriptExceptionMock).when(transactionOutputMock).getScriptPubKey();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(true).when(keyChainGroupMock).supportsDeterministicChains();
            doReturn(2, 1).when(keyChainGroupMock).getCombinedKeyLookaheadEpochs();
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.checkForFilterExhaustion(blockMock);
            //Assert statement(s)
            verify(blockMock).getAssociatedTransactions();
            verify(transactionMock).getOutputs();
            verify(transactionOutputMock).getScriptPubKey();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).supportsDeterministicChains();
            verify(keyChainGroupMock, times(2)).getCombinedKeyLookaheadEpochs();
        }
    }

    //Sapient generated method id: ${b40f4777-7d11-3936-a62e-236c458bcc68}, hash: A47142B29F83B43B58BEC731CEA9BE74
    @Test()
    public void checkForFilterExhaustionWhenNewEpochGreaterThanOrEqualsToEpochAndNewEpochGreaterThanEpoch() throws ScriptException {
        /* Branches:
         * (!keyChainGroup.supportsDeterministicChains()) : false
         * (for-each(block.getAssociatedTransactions().values())) : true
         * (for-each(tx.getOutputs())) : true  #  inside markKeysAsUsed method
         * (ScriptPattern.isP2PK(script)) : true  #  inside markKeysAsUsed method
         * (newEpoch >= epoch) : true
         * (newEpoch > epoch) : true
         */
        //Arrange Statement(s)
        FilteredBlock blockMock = mock(FilteredBlock.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Transaction transactionMock = mock(Transaction.class);
        TransactionOutput transactionOutputMock = mock(TransactionOutput.class);
        Script scriptMock = mock(Script.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            Map<Sha256Hash, Transaction> sha256HashTransactionMap = new HashMap<>();
            sha256HashTransactionMap.put(sha256HashMock, transactionMock);
            doReturn(sha256HashTransactionMap).when(blockMock).getAssociatedTransactions();
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(transactionOutputMock);
            doReturn(transactionOutputList).when(transactionMock).getOutputs();
            doReturn(scriptMock).when(transactionOutputMock).getScriptPubKey();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(true);
            byte[] byteArray = new byte[]{};
            scriptPattern.when(() -> ScriptPattern.extractKeyFromP2PK(scriptMock)).thenReturn(byteArray);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(true).when(keyChainGroupMock).supportsDeterministicChains();
            doNothing().when(keyChainGroupMock).markPubKeyAsUsed(byteArray);
            doReturn(1, 2).when(keyChainGroupMock).getCombinedKeyLookaheadEpochs();
            //Act Statement(s)
            boolean result = target.checkForFilterExhaustion(blockMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            verify(blockMock).getAssociatedTransactions();
            verify(transactionMock).getOutputs();
            verify(transactionOutputMock).getScriptPubKey();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractKeyFromP2PK(scriptMock), atLeast(1));
            verify(keyChainGroupMock).supportsDeterministicChains();
            verify(keyChainGroupMock, times(2)).getCombinedKeyLookaheadEpochs();
            verify(keyChainGroupMock).markPubKeyAsUsed(byteArray);
        }
    }

    //Sapient generated method id: ${d54c815e-6792-3203-b766-0b12f6a1ae27}, hash: 76C85BD184D6F5920094D93D85EE1A14
    @Test()
    public void checkForFilterExhaustionWhenNewEpochGreaterThanOrEqualsToEpochAndNewEpochNotGreaterThanEpoch() throws ScriptException {
        /* Branches:
         * (!keyChainGroup.supportsDeterministicChains()) : false
         * (for-each(block.getAssociatedTransactions().values())) : true
         * (for-each(tx.getOutputs())) : true  #  inside markKeysAsUsed method
         * (ScriptPattern.isP2PK(script)) : true  #  inside markKeysAsUsed method
         * (newEpoch >= epoch) : true
         * (newEpoch > epoch) : false
         */
        //Arrange Statement(s)
        FilteredBlock blockMock = mock(FilteredBlock.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Transaction transactionMock = mock(Transaction.class);
        TransactionOutput transactionOutputMock = mock(TransactionOutput.class);
        Script scriptMock = mock(Script.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            Map<Sha256Hash, Transaction> sha256HashTransactionMap = new HashMap<>();
            sha256HashTransactionMap.put(sha256HashMock, transactionMock);
            doReturn(sha256HashTransactionMap).when(blockMock).getAssociatedTransactions();
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(transactionOutputMock);
            doReturn(transactionOutputList).when(transactionMock).getOutputs();
            doReturn(scriptMock).when(transactionOutputMock).getScriptPubKey();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(true);
            byte[] byteArray = new byte[]{};
            scriptPattern.when(() -> ScriptPattern.extractKeyFromP2PK(scriptMock)).thenReturn(byteArray);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(true).when(keyChainGroupMock).supportsDeterministicChains();
            doReturn(1).when(keyChainGroupMock).getCombinedKeyLookaheadEpochs();
            doNothing().when(keyChainGroupMock).markPubKeyAsUsed(byteArray);
            //Act Statement(s)
            boolean result = target.checkForFilterExhaustion(blockMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(blockMock).getAssociatedTransactions();
            verify(transactionMock).getOutputs();
            verify(transactionOutputMock).getScriptPubKey();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractKeyFromP2PK(scriptMock), atLeast(1));
            verify(keyChainGroupMock).supportsDeterministicChains();
            verify(keyChainGroupMock, times(2)).getCombinedKeyLookaheadEpochs();
            verify(keyChainGroupMock).markPubKeyAsUsed(byteArray);
        }
    }

    //Sapient generated method id: ${7a95783a-8a43-3680-b8da-bf91aec2b0ba}, hash: A60BBDE59AF48E572EBC1FBA4F732182
    @Test()
    public void checkForFilterExhaustionWhenScriptPatternIsP2PKHScriptAndNewEpochLessThanEpochThrowsIllegalStateException() throws ScriptException {
        /* Branches:
         * (!keyChainGroup.supportsDeterministicChains()) : false
         * (for-each(block.getAssociatedTransactions().values())) : true
         * (for-each(tx.getOutputs())) : true  #  inside markKeysAsUsed method
         * (ScriptPattern.isP2PK(script)) : false  #  inside markKeysAsUsed method
         * (ScriptPattern.isP2PKH(script)) : true  #  inside markKeysAsUsed method
         * (newEpoch >= epoch) : false
         */
        //Arrange Statement(s)
        FilteredBlock blockMock = mock(FilteredBlock.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Transaction transactionMock = mock(Transaction.class);
        TransactionOutput transactionOutputMock = mock(TransactionOutput.class);
        Script scriptMock = mock(Script.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            Map<Sha256Hash, Transaction> sha256HashTransactionMap = new HashMap<>();
            sha256HashTransactionMap.put(sha256HashMock, transactionMock);
            doReturn(sha256HashTransactionMap).when(blockMock).getAssociatedTransactions();
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(transactionOutputMock);
            doReturn(transactionOutputList).when(transactionMock).getOutputs();
            doReturn(scriptMock).when(transactionOutputMock).getScriptPubKey();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(true);
            byte[] byteArray = new byte[]{};
            scriptPattern.when(() -> ScriptPattern.extractHashFromP2PKH(scriptMock)).thenReturn(byteArray);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(true).when(keyChainGroupMock).supportsDeterministicChains();
            doNothing().when(keyChainGroupMock).markPubKeyHashAsUsed(byteArray);
            doReturn(2, 1).when(keyChainGroupMock).getCombinedKeyLookaheadEpochs();
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.checkForFilterExhaustion(blockMock);
            //Assert statement(s)
            verify(blockMock).getAssociatedTransactions();
            verify(transactionMock).getOutputs();
            verify(transactionOutputMock).getScriptPubKey();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractHashFromP2PKH(scriptMock), atLeast(1));
            verify(keyChainGroupMock).supportsDeterministicChains();
            verify(keyChainGroupMock, times(2)).getCombinedKeyLookaheadEpochs();
            verify(keyChainGroupMock).markPubKeyHashAsUsed(byteArray);
        }
    }

    //Sapient generated method id: ${55dd63f1-97f0-3931-90c5-7af33388094d}, hash: 9E708F201CE4B4442B1360549518C5FD
    @Ignore()
    @Test()
    public void checkForFilterExhaustionWhenCaughtScriptExceptionAndNewEpochGreaterThanOrEqualsToEpochAndNewEpochGreaterThanEpoch() throws ScriptException {
        /* Branches:
         * (!keyChainGroup.supportsDeterministicChains()) : false
         * (for-each(block.getAssociatedTransactions().values())) : true
         * (for-each(tx.getOutputs())) : true  #  inside markKeysAsUsed method
         * (ScriptPattern.isP2PK(script)) : true  #  inside markKeysAsUsed method
         * (catch-exception (ScriptException)) : true  #  inside markKeysAsUsed method
         * (newEpoch >= epoch) : true
         * (newEpoch > epoch) : true
         */
        //Arrange Statement(s)
        FilteredBlock blockMock = mock(FilteredBlock.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Transaction transactionMock = mock(Transaction.class);
        TransactionOutput transactionOutputMock = mock(TransactionOutput.class);
        TransactionOutput transactionOutputMock2 = mock(TransactionOutput.class);
        ScriptException scriptExceptionMock = mock(ScriptException.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            Map<Sha256Hash, Transaction> sha256HashTransactionMap = new HashMap<>();
            sha256HashTransactionMap.put(sha256HashMock, transactionMock);
            doReturn(sha256HashTransactionMap).when(blockMock).getAssociatedTransactions();
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(transactionOutputMock);
            transactionOutputList.add(transactionOutputMock2);
            doReturn(transactionOutputList).when(transactionMock).getOutputs();
            doThrow(scriptExceptionMock).when(transactionOutputMock).getScriptPubKey();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(true).when(keyChainGroupMock).supportsDeterministicChains();
            doReturn(1, 2).when(keyChainGroupMock).getCombinedKeyLookaheadEpochs();
            //Act Statement(s)
            boolean result = target.checkForFilterExhaustion(blockMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            verify(blockMock).getAssociatedTransactions();
            verify(transactionMock).getOutputs();
            verify(transactionOutputMock).getScriptPubKey();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).supportsDeterministicChains();
            verify(keyChainGroupMock, times(2)).getCombinedKeyLookaheadEpochs();
        }
    }

    //Sapient generated method id: ${9a2f5ae5-061d-3ed2-8fca-478e38a79f92}, hash: 7E6FBF4BF22B8A724A36FE358B8C5CE9
    @Ignore()
    @Test()
    public void checkForFilterExhaustionWhenCaughtScriptExceptionAndNewEpochGreaterThanOrEqualsToEpochAndNewEpochNotGreaterThanEpoch() throws ScriptException {
        /* Branches:
         * (!keyChainGroup.supportsDeterministicChains()) : false
         * (for-each(block.getAssociatedTransactions().values())) : true
         * (for-each(tx.getOutputs())) : true  #  inside markKeysAsUsed method
         * (ScriptPattern.isP2PK(script)) : true  #  inside markKeysAsUsed method
         * (catch-exception (ScriptException)) : true  #  inside markKeysAsUsed method
         * (newEpoch >= epoch) : true
         * (newEpoch > epoch) : false
         */
        //Arrange Statement(s)
        FilteredBlock blockMock = mock(FilteredBlock.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Transaction transactionMock = mock(Transaction.class);
        TransactionOutput transactionOutputMock = mock(TransactionOutput.class);
        TransactionOutput transactionOutputMock2 = mock(TransactionOutput.class);
        ScriptException scriptExceptionMock = mock(ScriptException.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            Map<Sha256Hash, Transaction> sha256HashTransactionMap = new HashMap<>();
            sha256HashTransactionMap.put(sha256HashMock, transactionMock);
            doReturn(sha256HashTransactionMap).when(blockMock).getAssociatedTransactions();
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(transactionOutputMock);
            transactionOutputList.add(transactionOutputMock2);
            doReturn(transactionOutputList).when(transactionMock).getOutputs();
            doThrow(scriptExceptionMock).when(transactionOutputMock).getScriptPubKey();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(true).when(keyChainGroupMock).supportsDeterministicChains();
            doReturn(1).when(keyChainGroupMock).getCombinedKeyLookaheadEpochs();
            //Act Statement(s)
            boolean result = target.checkForFilterExhaustion(blockMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(blockMock).getAssociatedTransactions();
            verify(transactionMock).getOutputs();
            verify(transactionOutputMock).getScriptPubKey();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(keyChainGroupMock).supportsDeterministicChains();
            verify(keyChainGroupMock, times(2)).getCombinedKeyLookaheadEpochs();
        }
    }

    //Sapient generated method id: ${f220e942-8ae1-3211-95ac-e5353d0b70d8}, hash: 404B6434B6D0514018CAED9C0B550072
    @Test()
    public void checkForFilterExhaustionWhenScriptPatternIsP2SHScriptAndNewEpochLessThanEpochThrowsIllegalStateException() throws ScriptException {
        /* Branches:
         * (!keyChainGroup.supportsDeterministicChains()) : false
         * (for-each(block.getAssociatedTransactions().values())) : true
         * (for-each(tx.getOutputs())) : true  #  inside markKeysAsUsed method
         * (ScriptPattern.isP2PK(script)) : false  #  inside markKeysAsUsed method
         * (ScriptPattern.isP2PKH(script)) : false  #  inside markKeysAsUsed method
         * (ScriptPattern.isP2SH(script)) : true  #  inside markKeysAsUsed method
         * (newEpoch >= epoch) : false
         */
        //Arrange Statement(s)
        FilteredBlock blockMock = mock(FilteredBlock.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Transaction transactionMock = mock(Transaction.class);
        TransactionOutput transactionOutputMock = mock(TransactionOutput.class);
        Script scriptMock = mock(Script.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        LegacyAddress legacyAddressMock = mock(LegacyAddress.class);
        try (MockedStatic<LegacyAddress> legacyAddress = mockStatic(LegacyAddress.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            Map<Sha256Hash, Transaction> sha256HashTransactionMap = new HashMap<>();
            sha256HashTransactionMap.put(sha256HashMock, transactionMock);
            doReturn(sha256HashTransactionMap).when(blockMock).getAssociatedTransactions();
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(transactionOutputMock);
            doReturn(transactionOutputList).when(transactionMock).getOutputs();
            doReturn(scriptMock).when(transactionOutputMock).getScriptPubKey();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(true);
            byte[] byteArray = new byte[]{};
            scriptPattern.when(() -> ScriptPattern.extractHashFromP2SH(scriptMock)).thenReturn(byteArray);
            legacyAddress.when(() -> LegacyAddress.fromScriptHash(networkMock, byteArray)).thenReturn(legacyAddressMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(true).when(keyChainGroupMock).supportsDeterministicChains();
            doNothing().when(keyChainGroupMock).markP2SHAddressAsUsed(legacyAddressMock);
            doReturn(2, 1).when(keyChainGroupMock).getCombinedKeyLookaheadEpochs();
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.checkForFilterExhaustion(blockMock);
            //Assert statement(s)
            verify(blockMock).getAssociatedTransactions();
            verify(transactionMock).getOutputs();
            verify(transactionOutputMock).getScriptPubKey();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractHashFromP2SH(scriptMock), atLeast(1));
            legacyAddress.verify(() -> LegacyAddress.fromScriptHash(networkMock, byteArray), atLeast(1));
            verify(keyChainGroupMock).supportsDeterministicChains();
            verify(keyChainGroupMock, times(2)).getCombinedKeyLookaheadEpochs();
            verify(keyChainGroupMock).markP2SHAddressAsUsed(legacyAddressMock);
        }
    }

    //Sapient generated method id: ${5d061b3d-70b8-374d-bd8c-addc14dae3fc}, hash: EF3BCC736455AF04C4EBDE7B77011C95
    @Test()
    public void checkForFilterExhaustionWhenScriptPatternIsP2WHScriptAndNewEpochLessThanEpochThrowsIllegalStateException() throws ScriptException {
        /* Branches:
         * (!keyChainGroup.supportsDeterministicChains()) : false
         * (for-each(block.getAssociatedTransactions().values())) : true
         * (for-each(tx.getOutputs())) : true  #  inside markKeysAsUsed method
         * (ScriptPattern.isP2PK(script)) : false  #  inside markKeysAsUsed method
         * (ScriptPattern.isP2PKH(script)) : false  #  inside markKeysAsUsed method
         * (ScriptPattern.isP2SH(script)) : false  #  inside markKeysAsUsed method
         * (ScriptPattern.isP2WH(script)) : true  #  inside markKeysAsUsed method
         * (newEpoch >= epoch) : false
         */
        //Arrange Statement(s)
        FilteredBlock blockMock = mock(FilteredBlock.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Transaction transactionMock = mock(Transaction.class);
        TransactionOutput transactionOutputMock = mock(TransactionOutput.class);
        Script scriptMock = mock(Script.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            Map<Sha256Hash, Transaction> sha256HashTransactionMap = new HashMap<>();
            sha256HashTransactionMap.put(sha256HashMock, transactionMock);
            doReturn(sha256HashTransactionMap).when(blockMock).getAssociatedTransactions();
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(transactionOutputMock);
            doReturn(transactionOutputList).when(transactionMock).getOutputs();
            doReturn(scriptMock).when(transactionOutputMock).getScriptPubKey();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WH(scriptMock)).thenReturn(true);
            byte[] byteArray = new byte[]{};
            scriptPattern.when(() -> ScriptPattern.extractHashFromP2WH(scriptMock)).thenReturn(byteArray);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(true).when(keyChainGroupMock).supportsDeterministicChains();
            doNothing().when(keyChainGroupMock).markPubKeyHashAsUsed(byteArray);
            doReturn(2, 1).when(keyChainGroupMock).getCombinedKeyLookaheadEpochs();
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.checkForFilterExhaustion(blockMock);
            //Assert statement(s)
            verify(blockMock).getAssociatedTransactions();
            verify(transactionMock).getOutputs();
            verify(transactionOutputMock).getScriptPubKey();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractHashFromP2WH(scriptMock), atLeast(1));
            verify(keyChainGroupMock).supportsDeterministicChains();
            verify(keyChainGroupMock, times(2)).getCombinedKeyLookaheadEpochs();
            verify(keyChainGroupMock).markPubKeyHashAsUsed(byteArray);
        }
    }

    //Sapient generated method id: ${a64720a0-ff95-3da6-8a3c-22bffe08e993}, hash: F45EB8AD1FDCD5739B19D283385FB61E
    @Test()
    public void addExtensionWhenExtensionsNotContainsKeyId() throws IOException {
        /* Branches:
         * (extensions.containsKey(id)) : false
         */
        //Arrange Statement(s)
        WalletExtension walletExtensionMock = mock(WalletExtension.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn("return_of_getWalletExtensionID1").when(walletExtensionMock).getWalletExtensionID();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).saveNow();
            //Act Statement(s)
            target.addExtension(walletExtensionMock);
            //Assert statement(s)
            verify(walletExtensionMock).getWalletExtensionID();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).saveNow();
        }
    }

    //Sapient generated method id: ${3fef6a83-73b0-37cd-83d9-35c464f77d51}, hash: 6E541159486486F0CC2708DD0CC637CC
    @Test()
    public void addOrGetExistingExtensionWhenPreviousExtensionIsNull() throws IOException {
        /* Branches:
         * (previousExtension != null) : false
         */
        //Arrange Statement(s)
        WalletExtension walletExtensionMock = mock(WalletExtension.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn("return_of_getWalletExtensionID1").when(walletExtensionMock).getWalletExtensionID();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).saveNow();
            //Act Statement(s)
            WalletExtension result = target.addOrGetExistingExtension(walletExtensionMock);
            //Assert statement(s)
            assertThat(result, equalTo(walletExtensionMock));
            verify(walletExtensionMock, atLeast(1)).getWalletExtensionID();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).saveNow();
        }
    }

    //Sapient generated method id: ${03a91cc8-ed88-3f13-9711-362ee38c5639}, hash: 5C9366FAF863A574E92567E1CCCE41AB
    @Test()
    public void addOrUpdateExtensionTest() throws IOException {
        //Arrange Statement(s)
        WalletExtension walletExtensionMock = mock(WalletExtension.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn("return_of_getWalletExtensionID1").when(walletExtensionMock).getWalletExtensionID();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).saveNow();
            //Act Statement(s)
            target.addOrUpdateExtension(walletExtensionMock);
            //Assert statement(s)
            verify(walletExtensionMock).getWalletExtensionID();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).saveNow();
        }
    }

    //Sapient generated method id: ${11291d89-1a0b-3752-a9ad-9ed409cd505d}, hash: C8689792AAD44097C935DCF405AAF53D
    @Test()
    public void getExtensionsTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            Map<String, WalletExtension> result = target.getExtensions();
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${e71c1951-d6a5-3074-a03d-d35aa0194412}, hash: E9A3949050C91F528943E35CE043856B
    @Test()
    public void deserializeExtensionTest() throws Throwable {
        //Arrange Statement(s)
        WalletExtension extensionMock = mock(WalletExtension.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn("return_of_getWalletExtensionID1").when(extensionMock).getWalletExtensionID();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            byte[] byteArray = new byte[]{};
            doNothing().when(extensionMock).deserializeWalletExtension(target, byteArray);
            //Act Statement(s)
            target.deserializeExtension(extensionMock, byteArray);
            //Assert statement(s)
            verify(extensionMock).getWalletExtensionID();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(extensionMock).deserializeWalletExtension(target, byteArray);
        }
    }

    //Sapient generated method id: ${e49f0232-6cf2-33e0-a968-737e6fe0b15d}, hash: 9AC1F64309C143C617E9F52842A246E9
    @Test()
    public void deserializeExtensionWhenCaughtThrowableThrowsThrowable() throws Exception {
        /* Branches:
         * (catch-exception (Throwable)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        WalletExtension extensionMock = mock(WalletExtension.class);
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn("return_of_getWalletExtensionID1").when(extensionMock).getWalletExtensionID();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            byte[] byteArray = new byte[]{};
            doNothing().when(extensionMock).deserializeWalletExtension(target, byteArray);
            thrown.expect(Throwable.class);
            //Act Statement(s)
            target.deserializeExtension(extensionMock, byteArray);
            //Assert statement(s)
            verify(extensionMock, times(2)).getWalletExtensionID();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(extensionMock).deserializeWalletExtension(target, byteArray);
        }
    }

    //Sapient generated method id: ${d92a6414-d18c-3f09-b483-a17a3c92b04b}, hash: 712D7F7351F93477F60565F6E730A9E8
    @Test()
    public void setTagTest() throws IOException {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        ByteString byteStringMock = mock(ByteString.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).saveNow();
            //Act Statement(s)
            target.setTag("tag1", byteStringMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).saveNow();
        }
    }

    //Sapient generated method id: ${feda9470-0e8c-34b8-bad0-41fc680c58f6}, hash: 25F78CD98F5798980C38788BBDEDCA0E
    @Test()
    public void setTransactionBroadcasterWhenVTransactionBroadcasterEqualsBroadcaster() {
        /* Branches:
         * (vTransactionBroadcaster == broadcaster) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            TransactionBroadcaster transactionBroadcaster = null;
            //Act Statement(s)
            target.setTransactionBroadcaster(transactionBroadcaster);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${2b3d9530-b32b-3ab0-9415-bc5877db7feb}, hash: AFB73E5DD012052AC30BF1261BEFA71F
    @Test()
    public void setTransactionBroadcasterWhenBroadcasterIsNull() {
        /* Branches:
         * (vTransactionBroadcaster == broadcaster) : false
         * (broadcaster == null) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            TransactionBroadcaster transactionBroadcaster = null;
            //Act Statement(s)
            target.setTransactionBroadcaster(transactionBroadcaster);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${adc0ffd9-587d-3b0c-b6b0-257edebd9ad1}, hash: 1F0B5437C1814668EC5F6F66B2B58D7E
    @Test()
    public void setTransactionBroadcasterWhenToBroadcastIsEmpty() {
        /* Branches:
         * (vTransactionBroadcaster == broadcaster) : false
         * (broadcaster == null) : false
         * (for-each(toBroadcast)) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        TransactionBroadcaster transactionBroadcasterMock = mock(TransactionBroadcaster.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.setTransactionBroadcaster(transactionBroadcasterMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${3cf75ac9-d2d5-39e4-9c44-740e982df522}, hash: 35C412D727C75172994B94015437A1CB
    @Test()
    public void setKeyRotationTimeWhenKeyRotationTimeCompareToTimeUtilsCurrentTimeLessThanOrEqualsTo0() throws IOException {
        /* Branches:
         * (keyRotationTime == null) : false
         * (keyRotationTime.compareTo(TimeUtils.currentTime()) <= 0) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).saveNow();
            Instant instant = Instant.ofEpochSecond(1700000000);
            //Act Statement(s)
            target.setKeyRotationTime(instant);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).saveNow();
        }
    }

    //Sapient generated method id: ${3b14c606-e40a-30c7-8bac-9fe54d3b6b3d}, hash: 66CB1CB7034222D5CC7764B9F78175D4
    @Ignore()
    @Test()
    public void setKeyRotationTimeWhenKeyRotationTimeCompareToTimeUtilsCurrentTimeGreaterThan0ThrowsIllegalArgumentException() {
        /* Branches:
         * (keyRotationTime == null) : false
         * (keyRotationTime.compareTo(TimeUtils.currentTime()) <= 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(IllegalArgumentException.class);
            Instant instant = Instant.ofEpochSecond(1700000000);
            //Act Statement(s)
            target.setKeyRotationTime(instant);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${038af69b-791d-37bc-9c2d-4a695c79cfe7}, hash: 27611B4FFCDB4B89118991CF3BEAEE6C
    @Test()
    public void setKeyRotationTime1WhenTimeSecsEquals0() throws IOException {
        /* Branches:
         * (timeSecs == 0) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).setKeyRotationTime((Instant) null);
            //Act Statement(s)
            target.setKeyRotationTime(0L);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).setKeyRotationTime((Instant) null);
        }
    }

    //Sapient generated method id: ${6d1bf33b-d2e1-370e-9628-950fea2287b5}, hash: 4D6EC60C1C27BFE678F7173A2F62506A
    @Test()
    public void setKeyRotationTime1WhenTimeSecsNotEquals0() throws IOException {
        /* Branches:
         * (timeSecs == 0) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).setKeyRotationTime((Instant) any());
            //Act Statement(s)
            target.setKeyRotationTime(-1L);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).setKeyRotationTime((Instant) any());
        }
    }

    //Sapient generated method id: ${539a086c-9010-3cd1-84be-d599aea77080}, hash: 9DD6E834356A9C819ABA88C964CC8BC6
    @Test()
    public void setKeyRotationTime2WhenTimeIsNull() throws IOException {
        /* Branches:
         * (time == null) : true
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).setKeyRotationTime((Instant) null);
            Date date = null;
            //Act Statement(s)
            target.setKeyRotationTime(date);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).setKeyRotationTime((Instant) null);
        }
    }

    //Sapient generated method id: ${fb14096f-e584-3792-b13c-fa50336b3c3f}, hash: D8ABDED3FA521EAC99E4E6EBD9732403
    @Test()
    public void setKeyRotationTime2WhenTimeIsNotNull() throws IOException {
        /* Branches:
         * (time == null) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).setKeyRotationTime((Instant) any());
            Date date = new Date();
            //Act Statement(s)
            target.setKeyRotationTime(date);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).setKeyRotationTime((Instant) any());
        }
    }

    //Sapient generated method id: ${eb92ddb2-8b68-3c5f-bd98-57891b564285}, hash: CDEBD4BC1811C9D55E25872D6E3116A7
    @Test()
    public void keyRotationTimeTest() {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            Optional<Instant> result = target.keyRotationTime();
            Optional<Instant> instantOptional = Optional.empty();
            //Assert statement(s)
            assertThat(result, equalTo(instantOptional));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${8c6d1941-7b5c-3e85-b09f-17b2fb2e0529}, hash: A233EF4350CF604E38084F8EA80075B6
    @Test()
    public void getKeyRotationTimeWhenKeyRotationTimeIsNull() {
        /* Branches:
         * (keyRotationTime != null) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            Date result = target.getKeyRotationTime();
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${1c1891ae-bc31-37c7-812d-3e6d8ab6cd96}, hash: 1437DD2B2405EADA7BFE6E573697CAB3
    @Test()
    public void isKeyRotatingWhenKeyRotationTimeIsNull() {
        /* Branches:
         * (keyRotationTime != null) : false
         */
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        ECKey eCKeyMock = mock(ECKey.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.isKeyRotating(eCKeyMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${af42a9b6-3309-36a1-93c4-d708e1254423}, hash: 6A8A4D110B887D2CAE54543691EEE42C
    @Test()
    public void doMaintenanceTest() throws Exception {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        ListenableCompletableFuture<List<Transaction>> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        AesKey aesKeyMock = mock(AesKey.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = spy(new Wallet(networkMock, keyChainGroupMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            KeyChainGroupStructure keyChainGroupStructure = KeyChainGroupStructure.BIP32;
            doReturn(listenableCompletableFutureMock).when(target).doMaintenance(keyChainGroupStructure, aesKeyMock, false);
            //Act Statement(s)
            ListenableCompletableFuture<List<Transaction>> result = target.doMaintenance(aesKeyMock, false);
            //Assert statement(s)
            assertThat(result, equalTo(listenableCompletableFutureMock));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
            verify(target).doMaintenance(keyChainGroupStructure, aesKeyMock, false);
        }
    }

    //Sapient generated method id: ${33804160-a868-3a4b-82ca-faaba6338a15}, hash: E387487DB68CCB18298875DA792601B4
    @Ignore()
    @Test()
    public void doMaintenance1ThrowsIllegalStateException() throws DeterministicUpgradeRequiresPassword {
        //Arrange Statement(s)
        CoinSelector coinSelectorMock = mock(CoinSelector.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        AesKey aesKeyMock = mock(AesKey.class);
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class);
             MockedStatic<AddressParser> addressParser = mockStatic(AddressParser.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            addressParser.when(() -> AddressParser.getDefault(networkMock)).thenReturn(addressParserMock);
            defaultCoinSelector.when(() -> DefaultCoinSelector.get(networkMock)).thenReturn(coinSelectorMock);
            target = new Wallet(networkMock, keyChainGroupMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.doMaintenance(keyChainGroupStructureMock, aesKeyMock, false);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            addressParser.verify(() -> AddressParser.getDefault(networkMock), atLeast(1));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.get(networkMock), atLeast(1));
        }
    }
}
