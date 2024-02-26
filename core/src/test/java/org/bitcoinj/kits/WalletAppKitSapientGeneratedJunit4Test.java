package org.bitcoinj.kits;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.mockito.InjectMocks;
import org.junit.After;
import org.junit.Test;

import java.io.IOException;

import org.bitcoinj.wallet.UnreadableWalletException;
import org.bitcoinj.store.BlockStoreException;
import org.bitcoinj.base.Network;
import org.bitcoinj.base.internal.PlatformUtils;

import java.io.ByteArrayInputStream;

import org.mockito.MockitoAnnotations;

import java.util.function.BiConsumer;
import java.time.Duration;

import org.bitcoinj.wallet.KeyChainGroupStructure;

import java.io.InputStream;

import org.bitcoinj.wallet.KeyChainGroup;
import org.mockito.stubbing.Answer;
import com.google.common.util.concurrent.Service;
import org.bitcoinj.wallet.WalletProtobufSerializer;
import org.bitcoinj.base.internal.Preconditions;
import org.bitcoinj.store.BlockStore;
import org.bitcoinj.wallet.DeterministicSeed;
import org.bitcoinj.core.PeerGroup;
import org.bitcoinj.store.SPVBlockStore;

import java.io.File;
import java.util.concurrent.CompletableFuture;
import java.time.Instant;

import org.bitcoinj.net.discovery.DnsDiscovery;
import org.junit.rules.ExpectedException;

import java.util.List;

import org.bitcoinj.wallet.Wallet;
import org.bitcoinj.base.ScriptType;
import org.bitcoinj.wallet.WalletExtension;
import org.bitcoinj.crypto.DeterministicKey;
import org.bitcoinj.utils.ListenableCompletableFuture;
import org.bitcoinj.core.PeerAddress;
import org.bitcoinj.core.NetworkParameters;

import java.util.function.Consumer;

import org.bitcoinj.core.BlockChain;
import org.bitcoinj.base.BitcoinNetwork;
import org.bitcoinj.core.CheckpointManager;
import org.bitcoinj.wallet.WalletFiles;
import org.bitcoinj.net.discovery.PeerDiscovery;
import org.mockito.MockedStatic;
import org.bitcoinj.core.listeners.DownloadProgressTracker;

import java.io.ByteArrayOutputStream;

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
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;

public class WalletAppKitSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final NetworkParameters paramsMock = mock(NetworkParameters.class, "params");

    private final PeerGroup vPeerGroupMock = mock(PeerGroup.class, "vPeerGroup");

    private final BlockChain vChainMock = mock(BlockChain.class, "vChain");

    private final DownloadProgressTracker downloadListenerMock = mock(DownloadProgressTracker.class, "downloadListener");

    private final Wallet vWalletMock = mock(Wallet.class, "vWallet");

    private final WalletProtobufSerializer.WalletFactory walletFactoryMock = mock(WalletProtobufSerializer.WalletFactory.class, "walletFactory");

    private final SPVBlockStore vStoreMock = mock(SPVBlockStore.class, "vStore");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private WalletAppKit target;

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    @After()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${9eefe250-7eec-36d5-b6ba-7dacfd4b5b90}
    @Test()
    public void launchTest() {
        //Arrange Statement(s)
        WalletAppKit walletAppKitMock = mock(WalletAppKit.class);
        try (MockedStatic<WalletAppKit> walletAppKit = mockStatic(WalletAppKit.class, CALLS_REAL_METHODS)) {
            File file = new File("pathname1");
            walletAppKit.when(() -> WalletAppKit.launch(BitcoinNetwork.MAINNET, file, "filePrefix1", 0)).thenReturn(walletAppKitMock);
            //Act Statement(s)
            WalletAppKit result = WalletAppKit.launch(BitcoinNetwork.MAINNET, file, "filePrefix1");
            //Assert statement(s)
            assertThat(result, equalTo(walletAppKitMock));
            walletAppKit.verify(() -> WalletAppKit.launch(BitcoinNetwork.MAINNET, file, "filePrefix1", 0), atLeast(1));
        }
    }

    //Sapient generated method id: ${366756c9-a66c-3984-84be-12a2e1c252bf}
    @Test()
    public void launch1Test() {
        //Arrange Statement(s)
        WalletAppKit walletAppKitMock = mock(WalletAppKit.class);
        Consumer consumerMock = mock(Consumer.class);
        try (MockedStatic<WalletAppKit> walletAppKit = mockStatic(WalletAppKit.class, CALLS_REAL_METHODS)) {
            File file = new File("pathname1");
            walletAppKit.when(() -> WalletAppKit.launch(BitcoinNetwork.MAINNET, file, "filePrefix1", consumerMock, 0)).thenReturn(walletAppKitMock);
            //Act Statement(s)
            WalletAppKit result = WalletAppKit.launch(BitcoinNetwork.MAINNET, file, "filePrefix1", consumerMock);
            //Assert statement(s)
            assertThat(result, equalTo(walletAppKitMock));
            walletAppKit.verify(() -> WalletAppKit.launch(BitcoinNetwork.MAINNET, file, "filePrefix1", consumerMock, 0), atLeast(1));
        }
    }

    //Sapient generated method id: ${e5b004ca-d3aa-3dd2-b3e6-07a5267d5abc}
    @Test()
    public void launch2Test() {
        //Arrange Statement(s)
        WalletAppKit walletAppKitMock = mock(WalletAppKit.class);
        try (MockedStatic<WalletAppKit> walletAppKit = mockStatic(WalletAppKit.class, CALLS_REAL_METHODS)) {
            File file = new File("pathname1");
            walletAppKit.when(() -> WalletAppKit.launch(eq(BitcoinNetwork.MAINNET), eq(file), eq("filePrefix1"), (Consumer) any(), eq(0))).thenReturn(walletAppKitMock);
            //Act Statement(s)
            WalletAppKit result = WalletAppKit.launch(BitcoinNetwork.MAINNET, file, "filePrefix1", 0);
            //Assert statement(s)
            assertThat(result, equalTo(walletAppKitMock));
            walletAppKit.verify(() -> WalletAppKit.launch(eq(BitcoinNetwork.MAINNET), eq(file), eq("filePrefix1"), (Consumer) any(), eq(0)), atLeast(1));
        }
    }

    //Sapient generated method id: ${f0959fc6-83d8-3415-ae1f-bcc8352678f6}
    @Test()
    public void launch3WhenMaxConnectionsGreaterThan0() {
        /* Branches:
         * (network == BitcoinNetwork.REGTEST) : true
         * (maxConnections > 0) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: kit
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        Consumer consumerMock = mock(Consumer.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.REGTEST)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            //Act Statement(s)
            WalletAppKit result = WalletAppKit.launch(BitcoinNetwork.REGTEST, file, "filePrefix1", consumerMock, 1);
            //Assert statement(s)
            //TODO: Please implement equals method in WalletAppKit for verification of the entire object or you need to adjust respective assertion statements
            assertThat(result, is(notNullValue()));
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.REGTEST), atLeast(1));
        }
    }

    //Sapient generated method id: ${95c203a9-5f3a-3173-ad7e-308c6d121c5a}
    @Test()
    public void setPeerNodesWhenStateEqualsStateNEW() {
        /* Branches:
         * (state() == State.NEW) : true
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock2).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = spy(new WalletAppKit(paramsMock2, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(Service.State.NEW).when(target).state();
            PeerAddress[] peerAddressArray = new PeerAddress[]{};
            //Act Statement(s)
            WalletAppKit result = target.setPeerNodes(peerAddressArray);
            //Assert statement(s)
            assertThat(result, equalTo(target));
            verify(paramsMock2).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
            verify(target).state();
        }
    }

    //Sapient generated method id: ${ca932129-6290-34d4-89ae-e65900f0bf1a}
    @Test()
    public void setPeerNodesWhenStateNotEqualsStateNEWThrowsIllegalStateException() {
        /* Branches:
         * (state() == State.NEW) : false
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock2).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = spy(new WalletAppKit(paramsMock2, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(Service.State.RUNNING).when(target).state();
            thrown.expect(IllegalStateException.class);
            PeerAddress[] peerAddressArray = new PeerAddress[]{};
            //Act Statement(s)
            target.setPeerNodes(peerAddressArray);
            //Assert statement(s)
            verify(paramsMock2).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
            verify(target).state();
        }
    }

    //Sapient generated method id: ${c842249d-095e-37ed-9870-47f67538ad7c}
    @Test()
    public void connectToLocalHostTest() {
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        WalletAppKit walletAppKitMock = mock(WalletAppKit.class);
        try (MockedStatic<PeerAddress> peerAddress = mockStatic(PeerAddress.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock2).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            peerAddress.when(() -> PeerAddress.localhost(networkParametersMock)).thenReturn(peerAddressMock);
            File file = new File("pathname1");
            target = spy(new WalletAppKit(paramsMock2, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            PeerAddress[] peerAddressArray = new PeerAddress[]{peerAddressMock};
            doReturn(walletAppKitMock).when(target).setPeerNodes(peerAddressArray);
            //Act Statement(s)
            WalletAppKit result = target.connectToLocalHost();
            //Assert statement(s)
            assertThat(result, equalTo(walletAppKitMock));
            verify(paramsMock2).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
            peerAddress.verify(() -> PeerAddress.localhost(networkParametersMock), atLeast(1));
            verify(target).setPeerNodes(peerAddressArray);
        }
    }

    //Sapient generated method id: ${04d2aa81-abdf-372f-ac7e-e576adfaa166}
    @Test()
    public void setAutoSaveWhenStateEqualsStateNEW() {
        /* Branches:
         * (state() == State.NEW) : true
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock2).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = spy(new WalletAppKit(paramsMock2, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(Service.State.NEW).when(target).state();
            //Act Statement(s)
            WalletAppKit result = target.setAutoSave(false);
            //Assert statement(s)
            assertThat(result, equalTo(target));
            verify(paramsMock2).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
            verify(target).state();
        }
    }

    //Sapient generated method id: ${f89f9051-61a8-3ca8-81d0-c35a95594ddc}
    @Test()
    public void setAutoSaveWhenStateNotEqualsStateNEWThrowsIllegalStateException() {
        /* Branches:
         * (state() == State.NEW) : false
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock2).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = spy(new WalletAppKit(paramsMock2, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(Service.State.RUNNING).when(target).state();
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.setAutoSave(false);
            //Assert statement(s)
            verify(paramsMock2).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
            verify(target).state();
        }
    }

    //Sapient generated method id: ${1cf90bb2-fb2c-3f39-98b9-5d6c5ee0727b}
    @Test()
    public void setDownloadListenerTest() {
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        DownloadProgressTracker downloadProgressTrackerMock = mock(DownloadProgressTracker.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock2).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = new WalletAppKit(paramsMock2, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            WalletAppKit result = target.setDownloadListener(downloadProgressTrackerMock);
            //Assert statement(s)
            assertThat(result, equalTo(target));
            verify(paramsMock2).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
        }
    }

    //Sapient generated method id: ${af986e31-30ae-3078-8125-a8b7a08ee774}
    @Test()
    public void setAutoStopTest() {
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock2).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = new WalletAppKit(paramsMock2, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            WalletAppKit result = target.setAutoStop(false);
            //Assert statement(s)
            assertThat(result, equalTo(target));
            verify(paramsMock2).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
        }
    }

    //Sapient generated method id: ${5c8f94de-8136-324c-bb24-e3714ebaca1f}
    @Test()
    public void setCheckpointsWhenThisCheckpointsIsNull() {
        /* Branches:
         * (this.checkpoints != null) : false
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock2).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = new WalletAppKit(paramsMock2, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            //Act Statement(s)
            WalletAppKit result = target.setCheckpoints(inputStream);
            //Assert statement(s)
            assertThat(result, equalTo(target));
            verify(paramsMock2).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
        }
    }

    //Sapient generated method id: ${b9f177cf-1459-3f78-8b87-b13d8054e86e}
    @Test()
    public void setBlockingStartupTest() {
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock2).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = new WalletAppKit(paramsMock2, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            WalletAppKit result = target.setBlockingStartup(false);
            //Assert statement(s)
            assertThat(result, equalTo(target));
            verify(paramsMock2).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
        }
    }

    //Sapient generated method id: ${22830135-a3d3-30ef-b7ef-b066728b738a}
    @Test()
    public void setUserAgentTest() {
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock2).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = new WalletAppKit(paramsMock2, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            WalletAppKit result = target.setUserAgent("userAgent1", "version1");
            //Assert statement(s)
            assertThat(result, equalTo(target));
            verify(paramsMock2).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
        }
    }

    //Sapient generated method id: ${25f38753-bba6-3d8c-a396-67a94d422f15}
    @Test()
    public void setWalletFactoryTest() {
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        WalletProtobufSerializer.WalletFactory walletProtobufSerializerWalletFactoryMock = mock(WalletProtobufSerializer.WalletFactory.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock2).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = new WalletAppKit(paramsMock2, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            WalletAppKit result = target.setWalletFactory(walletProtobufSerializerWalletFactoryMock);
            //Assert statement(s)
            assertThat(result, equalTo(target));
            verify(paramsMock2).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
        }
    }

    //Sapient generated method id: ${93f7d66f-c329-3263-97e6-01603d4eaa2f}
    @Test()
    public void restoreWalletFromSeedTest() {
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        DeterministicSeed deterministicSeedMock = mock(DeterministicSeed.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock2).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = new WalletAppKit(paramsMock2, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            WalletAppKit result = target.restoreWalletFromSeed(deterministicSeedMock);
            //Assert statement(s)
            assertThat(result, equalTo(target));
            verify(paramsMock2).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
        }
    }

    //Sapient generated method id: ${6d67e434-7075-3f80-bcb9-83af1b53c2aa}
    @Test()
    public void restoreWalletFromKeyTest() {
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock2).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = new WalletAppKit(paramsMock2, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            WalletAppKit result = target.restoreWalletFromKey(deterministicKeyMock);
            //Assert statement(s)
            assertThat(result, equalTo(target));
            verify(paramsMock2).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
        }
    }

    //Sapient generated method id: ${480b0f0e-c1ed-312f-a8ed-8924117c7cb8}
    @Test()
    public void setDiscoveryTest() {
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        PeerDiscovery peerDiscoveryMock = mock(PeerDiscovery.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock2).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = new WalletAppKit(paramsMock2, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            WalletAppKit result = target.setDiscovery(peerDiscoveryMock);
            //Assert statement(s)
            assertThat(result, equalTo(target));
            verify(paramsMock2).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
        }
    }

    //Sapient generated method id: ${8e6399c5-490e-39a2-a5c0-f94d5a4047d5}
    @Test()
    public void provideWalletExtensionsTest() throws Exception {
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock2).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = new WalletAppKit(paramsMock2, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            List<WalletExtension> result = target.provideWalletExtensions();
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            verify(paramsMock2).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
        }
    }

    //Sapient generated method id: ${94af6f25-fc5a-3461-b59e-adfac34be271}
    @Test()
    public void isChainFileLockedWhenFile2IsNull() throws IOException {
        /* Branches:
         * (!file.exists()) : true
         * (file2 != null) : false
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock2).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = new WalletAppKit(paramsMock2, ScriptType.P2PKH, keyChainGroupStructureMock, file, "");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.isChainFileLocked();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(paramsMock2).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
        }
    }

    //Sapient generated method id: ${ae1083be-f001-3aac-9717-9a1695bc5a89}
    @Test()
    public void isChainFileLockedWhenFile2IsNotNull() throws IOException {
        /* Branches:
         * (!file.exists()) : false
         * (file.isDirectory()) : false
         * (lock == null) : true
         * (file2 != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock2).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = new WalletAppKit(paramsMock2, ScriptType.P2PKH, keyChainGroupStructureMock, file, "");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.isChainFileLocked();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            verify(paramsMock2).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
        }
    }

    //Sapient generated method id: ${62361cbe-d942-37df-ba8f-95285db6c253}
    @Test()
    public void startUpWhenDirectoryNotMkdirsThrowsIOException() throws Exception {
        /* Branches:
         * (!directory.exists()) : true
         * (!directory.mkdirs()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParameters = NetworkParameters.fromID("id1");
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class, "KeyChainGroupStructure");
        File file = new File("pathname1");
        target = new WalletAppKit(networkParameters, ScriptType.P2PKH, keyChainGroupStructureMock, file, "String");
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        IOException iOException = new IOException("Could not create directory A");
        thrown.expect(IOException.class);
        thrown.expectMessage(iOException.getMessage());

        //Act Statement(s)
        target.startUp();
    }

    //Sapient generated method id: ${55c79d12-da48-3683-ab5a-7e38cb21a509}
    @Test()
    public void startUpWhenDiscoveryIsNullAndAutoStopAndBlockingStartup() throws Exception, InterruptedException, UnreadableWalletException {
        /* Branches:
         * (!directory.exists()) : true
         * (!directory.mkdirs()) : false
         * (vWalletFile.exists()) : true
         * (!chainFileExists) : false
         * (restoreFromSeed != null) : false
         * (restoreFromKey != null) : false
         * (restoreFromSeed == null) : true  #  inside maybeMoveOldWalletOutOfTheWay method
         * (restoreFromKey == null) : true  #  inside maybeMoveOldWalletOutOfTheWay method
         * (vWalletFile.exists()) : true  #  inside createOrLoadWallet method
         * (useAutoSave) : true  #  inside createOrLoadWallet method
         * (!chainFileExists) : false
         * (restoreFromSeed != null) : false
         * (restoreFromKey != null) : false
         * (this.userAgent != null) : false
         * (peerAddresses != null) : false
         * (params.network() != BitcoinNetwork.REGTEST) : true
         * (discovery != null) : false
         * (autoStop) : true  #  inside installShutdownHook method
         * (blockingStartup) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Wallet wallet2Mock = mock(Wallet.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class, "structure");
        Network networkMock = mock(Network.class, "Network");
        ListenableCompletableFuture<Void> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        try (MockedStatic<Wallet> wallet = mockStatic(Wallet.class)) {
            WalletProtobufSerializer.WalletFactory walletFactory = WalletProtobufSerializer.WalletFactory.DEFAULT;
            WalletExtension[] walletExtensionArray = new WalletExtension[]{};
            wallet.when(() -> Wallet.loadFromFile((File) any(), eq(walletFactory), eq(false), eq(false), eq(walletExtensionArray))).thenReturn(vWalletMock);
            File file = new File("pathname1");
            Duration duration = Duration.ofDays(0L);
            WalletFiles walletFiles = new WalletFiles(wallet2Mock, file, duration);
            doReturn(walletFiles).when(vWalletMock).autosaveToFile((File) any(), (Duration) any(), eq(null));
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            File file2 = new File("pathname1");
            target = spy(new WalletAppKit(networkParameters, ScriptType.P2PKH, keyChainGroupStructureMock, file2, "filePrefix"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(vPeerGroupMock).when(target).createPeerGroup();
            doReturn(networkMock).when(paramsMock).network();
            doNothing().when(vPeerGroupMock).addPeerDiscovery((DnsDiscovery) any());
            doNothing().when(vChainMock).addWallet(vWalletMock);
            doNothing().when(vPeerGroupMock).addWallet(vWalletMock);
            doReturn(listenableCompletableFutureMock).when(vPeerGroupMock).startAsync();
            CompletableFuture completableFuture = new CompletableFuture();
            doReturn(completableFuture).when(listenableCompletableFutureMock).whenComplete((BiConsumer) any());
            doNothing().when(downloadListenerMock).await();
            //Act Statement(s)
            target.startUp();
            //Assert statement(s)
            wallet.verify(() -> Wallet.loadFromFile((File) any(), eq(walletFactory), eq(false), eq(false), eq(walletExtensionArray)));
            verify(vWalletMock).autosaveToFile((File) any(), (Duration) any(), eq(null));
            verify(target).createPeerGroup();
            verify(paramsMock).network();
            verify(vPeerGroupMock).addPeerDiscovery((DnsDiscovery) any());
            verify(vChainMock).addWallet(vWalletMock);
            verify(vPeerGroupMock).addWallet(vWalletMock);
            verify(vPeerGroupMock).startAsync();
            verify(listenableCompletableFutureMock).whenComplete((BiConsumer) any());
            verify(downloadListenerMock).await();
        }
    }

    //Sapient generated method id: ${0e00a561-e76f-310c-9c4f-e40b6e72e96d}
    @Test()
    public void startUpWhenParamsNetworkNotEqualsBitcoinNetworkREGTESTAndDiscoveryIsNullAndAutoStopAndBlockingStartup2() throws Exception, IOException, InterruptedException, UnreadableWalletException {
        /* Branches:
         * (!directory.exists()) : true
         * (!directory.mkdirs()) : false
         * (vWalletFile.exists()) : true
         * (!chainFileExists) : true
         * (restoreFromSeed == null) : true  #  inside maybeMoveOldWalletOutOfTheWay method
         * (restoreFromKey == null) : true  #  inside maybeMoveOldWalletOutOfTheWay method
         * (vWalletFile.exists()) : false  #  inside createOrLoadWallet method
         * (for-each(provideWalletExtensions())) : false  #  inside createOrLoadWallet method
         * (useAutoSave) : true  #  inside createOrLoadWallet method
         * (!chainFileExists) : true
         * (checkpoints == null) : true
         * (!PlatformUtils.isAndroidRuntime()) : true
         * (checkpoints != null) : false
         * (chainFileExists) : false
         * (this.userAgent != null) : false
         * (peerAddresses != null) : false
         * (params.network() != BitcoinNetwork.REGTEST) : true
         * (discovery != null) : false
         * (autoStop) : true  #  inside installShutdownHook method
         * (blockingStartup) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Wallet wallet2Mock = mock(Wallet.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class, "KeyChainGroupStructure");
        Wallet walletMock = mock(Wallet.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class, "DeterministicKey");
        Network networkMock = mock(Network.class, "Network");
        ListenableCompletableFuture<Void> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        try (MockedStatic<CheckpointManager> checkpointManager = mockStatic(CheckpointManager.class);
             MockedStatic<PlatformUtils> platformUtils = mockStatic(PlatformUtils.class);
             MockedStatic<Wallet> wallet = mockStatic(Wallet.class)) {
            WalletProtobufSerializer.WalletFactory walletFactory = WalletProtobufSerializer.WalletFactory.DEFAULT;
            WalletExtension[] walletExtensionArray = new WalletExtension[]{};
            wallet.when(() -> Wallet.loadFromFile((File) any(), eq(walletFactory), eq(false), eq(false), eq(walletExtensionArray))).thenReturn(vWalletMock);
            File file = new File("pathname1");
            Duration duration = Duration.ofDays(0L);
            WalletFiles walletFiles = new WalletFiles(wallet2Mock, file, duration);
            doReturn(walletFiles).when(vWalletMock).autosaveToFile((File) any(), (Duration) any(), eq(null));
            platformUtils.when(() -> PlatformUtils.isAndroidRuntime()).thenReturn(false);
            checkpointManager.when(() -> CheckpointManager.openStream(paramsMock)).thenReturn(null);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            File file2 = new File("pathname1");
            target = spy(new WalletAppKit(networkParameters, ScriptType.P2PKH, keyChainGroupStructureMock, file2, "String"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(walletMock).when(target).createWallet();
            doReturn(deterministicKeyMock).when(walletMock).freshReceiveKey();
            doNothing().when(walletMock).saveToFile((File) any());
            doReturn(vPeerGroupMock).when(target).createPeerGroup();
            doReturn(networkMock).when(paramsMock).network();
            doNothing().when(vPeerGroupMock).addPeerDiscovery((DnsDiscovery) any());
            doNothing().when(vChainMock).addWallet(vWalletMock);
            doNothing().when(vPeerGroupMock).addWallet(vWalletMock);
            doReturn(listenableCompletableFutureMock).when(vPeerGroupMock).startAsync();
            CompletableFuture completableFuture = new CompletableFuture();
            doReturn(completableFuture).when(listenableCompletableFutureMock).whenComplete((BiConsumer) any());
            doNothing().when(downloadListenerMock).await();
            //Act Statement(s)
            target.startUp();
            //Assert statement(s)
            wallet.verify(() -> Wallet.loadFromFile((File) any(), eq(walletFactory), eq(false), eq(false), eq(walletExtensionArray)));
            verify(vWalletMock).autosaveToFile((File) any(), (Duration) any(), eq(null));
            platformUtils.verify(() -> PlatformUtils.isAndroidRuntime(), atLeast(1));
            checkpointManager.verify(() -> CheckpointManager.openStream(paramsMock), atLeast(1));
            verify(target).createWallet();
            verify(walletMock).freshReceiveKey();
            verify(walletMock).saveToFile((File) any());
            verify(target).createPeerGroup();
            verify(paramsMock).network();
            verify(vPeerGroupMock).addPeerDiscovery((DnsDiscovery) any());
            verify(vChainMock).addWallet(vWalletMock);
            verify(vPeerGroupMock).addWallet(vWalletMock);
            verify(vPeerGroupMock).startAsync();
            verify(listenableCompletableFutureMock).whenComplete((BiConsumer) any());
            verify(downloadListenerMock).await();
        }
    }

    //Sapient generated method id: ${08c43ef7-36a6-300c-be2d-92b0505d4bc8}
    @Test()
    public void startUpWhenParamsNetworkNotEqualsBitcoinNetworkREGTESTAndDiscoveryIsNullAndAutoStopAndBlockingStartup8() throws Exception, IOException, InterruptedException, UnreadableWalletException {
        /* Branches:
         * (!directory.exists()) : true
         * (!directory.mkdirs()) : false
         * (vWalletFile.exists()) : true
         * (!chainFileExists) : true
         * (restoreFromSeed == null) : true  #  inside maybeMoveOldWalletOutOfTheWay method
         * (restoreFromKey == null) : true  #  inside maybeMoveOldWalletOutOfTheWay method
         * (vWalletFile.exists()) : false  #  inside createOrLoadWallet method
         * (for-each(provideWalletExtensions())) : false  #  inside createOrLoadWallet method
         * (useAutoSave) : true  #  inside createOrLoadWallet method
         * (!chainFileExists) : true
         * (checkpoints == null) : true
         * (!PlatformUtils.isAndroidRuntime()) : true
         * (checkpoints != null) : true
         * (restoreFromSeed != null) : false
         * (restoreFromKey != null) : false
         * (time.isAfter(Instant.EPOCH)) : false
         * (this.userAgent != null) : false
         * (peerAddresses != null) : false
         * (params.network() != BitcoinNetwork.REGTEST) : true
         * (discovery != null) : false
         * (autoStop) : true  #  inside installShutdownHook method
         * (blockingStartup) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Wallet wallet2Mock = mock(Wallet.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class, "KeyChainGroupStructure");
        Wallet walletMock = mock(Wallet.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class, "DeterministicKey");
        Network networkMock = mock(Network.class, "Network");
        ListenableCompletableFuture<Void> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        try (MockedStatic<CheckpointManager> checkpointManager = mockStatic(CheckpointManager.class);
             MockedStatic<PlatformUtils> platformUtils = mockStatic(PlatformUtils.class);
             MockedStatic<Wallet> wallet = mockStatic(Wallet.class)) {
            File file = new File("pathname1");
            Duration duration = Duration.ofDays(0L);
            WalletFiles walletFiles = new WalletFiles(wallet2Mock, file, duration);
            doReturn(walletFiles).when(vWalletMock).autosaveToFile((File) any(), (Duration) any(), eq(null));
            WalletProtobufSerializer.WalletFactory walletFactory = WalletProtobufSerializer.WalletFactory.DEFAULT;
            WalletExtension[] walletExtensionArray = new WalletExtension[]{};
            wallet.when(() -> Wallet.loadFromFile((File) any(), eq(walletFactory), eq(false), eq(false), eq(walletExtensionArray))).thenReturn(vWalletMock);
            platformUtils.when(() -> PlatformUtils.isAndroidRuntime()).thenReturn(false);
            checkpointManager.when(() -> CheckpointManager.openStream(paramsMock)).thenReturn(null);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            File file2 = new File("pathname1");
            target = spy(new WalletAppKit(networkParameters, ScriptType.P2PKH, keyChainGroupStructureMock, file2, "String"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(walletMock).when(target).createWallet();
            doReturn(deterministicKeyMock).when(walletMock).freshReceiveKey();
            doNothing().when(walletMock).saveToFile((File) any());
            Instant instant = Instant.now();
            doReturn(instant).when(vWalletMock).earliestKeyCreationTime();
            doReturn(vPeerGroupMock).when(target).createPeerGroup();
            doReturn(networkMock).when(paramsMock).network();
            doNothing().when(vPeerGroupMock).addPeerDiscovery((DnsDiscovery) any());
            doNothing().when(vChainMock).addWallet(vWalletMock);
            doNothing().when(vPeerGroupMock).addWallet(vWalletMock);
            doReturn(listenableCompletableFutureMock).when(vPeerGroupMock).startAsync();
            CompletableFuture completableFuture = new CompletableFuture();
            doReturn(completableFuture).when(listenableCompletableFutureMock).whenComplete((BiConsumer) any());
            doNothing().when(downloadListenerMock).await();
            //Act Statement(s)
            target.startUp();
            //Assert statement(s)
            verify(vWalletMock).autosaveToFile((File) any(), (Duration) any(), eq(null));
            wallet.verify(() -> Wallet.loadFromFile((File) any(), eq(walletFactory), eq(false), eq(false), eq(walletExtensionArray)));
            platformUtils.verify(() -> PlatformUtils.isAndroidRuntime(), atLeast(1));
            checkpointManager.verify(() -> CheckpointManager.openStream(paramsMock), atLeast(1));
            verify(target).createWallet();
            verify(walletMock).freshReceiveKey();
            verify(walletMock).saveToFile((File) any());
            verify(vWalletMock).earliestKeyCreationTime();
            verify(target).createPeerGroup();
            verify(paramsMock).network();
            verify(vPeerGroupMock).addPeerDiscovery((DnsDiscovery) any());
            verify(vChainMock).addWallet(vWalletMock);
            verify(vPeerGroupMock).addWallet(vWalletMock);
            verify(vPeerGroupMock).startAsync();
            verify(listenableCompletableFutureMock).whenComplete((BiConsumer) any());
            verify(downloadListenerMock).await();
        }
    }

    //Sapient generated method id: ${5815d27e-b1db-3b6f-a589-65af113e94ed}
    @Test()
    public void startUpWhenParamsNetworkNotEqualsBitcoinNetworkREGTESTAndDiscoveryIsNullAndAutoStopAndBlockingStartup11() throws Exception, IOException, InterruptedException, BlockStoreException, UnreadableWalletException {
        /* Branches:
         * (!directory.exists()) : true
         * (!directory.mkdirs()) : false
         * (vWalletFile.exists()) : false
         * (restoreFromSeed != null) : false
         * (restoreFromKey != null) : false
         * (restoreFromSeed == null) : true  #  inside maybeMoveOldWalletOutOfTheWay method
         * (restoreFromKey == null) : true  #  inside maybeMoveOldWalletOutOfTheWay method
         * (vWalletFile.exists()) : false  #  inside createOrLoadWallet method
         * (for-each(provideWalletExtensions())) : false  #  inside createOrLoadWallet method
         * (useAutoSave) : true  #  inside createOrLoadWallet method
         * (!chainFileExists) : true
         * (checkpoints == null) : true
         * (!PlatformUtils.isAndroidRuntime()) : true
         * (checkpoints != null) : true
         * (restoreFromSeed != null) : false
         * (restoreFromKey != null) : false
         * (time.isAfter(Instant.EPOCH)) : true
         * (this.userAgent != null) : false
         * (peerAddresses != null) : false
         * (params.network() != BitcoinNetwork.REGTEST) : true
         * (discovery != null) : false
         * (autoStop) : true  #  inside installShutdownHook method
         * (blockingStartup) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Wallet wallet2Mock = mock(Wallet.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class, "KeyChainGroupStructure");
        Wallet walletMock = mock(Wallet.class);
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class, "DeterministicKey");
        Network networkMock = mock(Network.class, "Network");
        ListenableCompletableFuture<Void> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        try (MockedStatic<CheckpointManager> checkpointManager = mockStatic(CheckpointManager.class);
             MockedStatic<PlatformUtils> platformUtils = mockStatic(PlatformUtils.class);
             MockedStatic<Wallet> wallet = mockStatic(Wallet.class)) {
            File file = new File("pathname1");
            Duration duration = Duration.ofDays(0L);
            WalletFiles walletFiles = new WalletFiles(wallet2Mock, file, duration);
            doReturn(walletFiles).when(vWalletMock).autosaveToFile((File) any(), (Duration) any(), eq(null));
            WalletProtobufSerializer.WalletFactory walletFactory = WalletProtobufSerializer.WalletFactory.DEFAULT;
            WalletExtension[] walletExtensionArray = new WalletExtension[]{};
            wallet.when(() -> Wallet.loadFromFile((File) any(), eq(walletFactory), eq(false), eq(false), eq(walletExtensionArray))).thenReturn(vWalletMock);
            platformUtils.when(() -> PlatformUtils.isAndroidRuntime()).thenReturn(false);
            checkpointManager.when(() -> CheckpointManager.openStream(paramsMock)).thenReturn(null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            checkpointManager.when(() -> CheckpointManager.checkpoint(eq(paramsMock), eq(inputStream), (SPVBlockStore) any(), (Instant) any())).thenAnswer((Answer<Void>) invocation -> null);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            File file2 = new File("pathname1");
            target = spy(new WalletAppKit(networkParameters, ScriptType.P2PKH, keyChainGroupStructureMock, file2, "String"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(walletMock).when(target).createWallet();
            doReturn(deterministicKeyMock).when(walletMock).freshReceiveKey();
            doNothing().when(walletMock).saveToFile((File) any());
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(vWalletMock).earliestKeyCreationTime();
            doReturn(vPeerGroupMock).when(target).createPeerGroup();
            doReturn(networkMock).when(paramsMock).network();
            doNothing().when(vPeerGroupMock).addPeerDiscovery((DnsDiscovery) any());
            doNothing().when(vChainMock).addWallet(vWalletMock);
            doNothing().when(vPeerGroupMock).addWallet(vWalletMock);
            doReturn(listenableCompletableFutureMock).when(vPeerGroupMock).startAsync();
            CompletableFuture completableFuture = new CompletableFuture();
            doReturn(completableFuture).when(listenableCompletableFutureMock).whenComplete((BiConsumer) any());
            doNothing().when(downloadListenerMock).await();
            //Act Statement(s)
            target.startUp();
            //Assert statement(s)
            verify(vWalletMock).autosaveToFile((File) any(), (Duration) any(), eq(null));
            wallet.verify(() -> Wallet.loadFromFile((File) any(), eq(walletFactory), eq(false), eq(false), eq(walletExtensionArray)));
            platformUtils.verify(() -> PlatformUtils.isAndroidRuntime(), atLeast(1));
            checkpointManager.verify(() -> CheckpointManager.openStream(paramsMock), atLeast(1));
            checkpointManager.verify(() -> CheckpointManager.checkpoint(eq(paramsMock), eq(inputStream), (SPVBlockStore) any(), (Instant) any()));
            verify(target).createWallet();
            verify(walletMock).freshReceiveKey();
            verify(walletMock).saveToFile((File) any());
            verify(vWalletMock).earliestKeyCreationTime();
            verify(target).createPeerGroup();
            verify(paramsMock).network();
            verify(vPeerGroupMock).addPeerDiscovery((DnsDiscovery) any());
            verify(vChainMock).addWallet(vWalletMock);
            verify(vPeerGroupMock).addWallet(vWalletMock);
            verify(vPeerGroupMock).startAsync();
            verify(listenableCompletableFutureMock).whenComplete((BiConsumer) any());
            verify(downloadListenerMock).await();
        }
    }

    //Sapient generated method id: ${e630cc8a-1b89-39f7-8328-3d77e5a61b67}
    @Test()
    public void setupAutoSaveTest() {
        //Arrange Statement(s)
        Wallet walletMock = mock(Wallet.class);
        WalletFiles walletFilesMock = mock(WalletFiles.class);
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(walletFilesMock).when(walletMock).autosaveToFile(eq((File) null), (Duration) any(), eq(null));
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock2).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = new WalletAppKit(paramsMock2, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.setupAutoSave(walletMock);
            //Assert statement(s)
            verify(walletMock).autosaveToFile(eq((File) null), (Duration) any(), eq(null));
            verify(paramsMock2).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
        }
    }

    //Sapient generated method id: ${d8ba868e-af88-3f47-b72d-10ef1bdfa832}
    @Test()
    public void createWalletWhenRestoreFromKeyIsNull() {
        /* Branches:
         * (restoreFromSeed != null) : false
         * (restoreFromKey != null) : false
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroup.Builder keyChainGroupBuilderMock = mock(KeyChainGroup.Builder.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        KeyChainGroup.Builder keyChainGroupBuilderMock2 = mock(KeyChainGroup.Builder.class);
        KeyChainGroup keyChainGroupMock = mock(KeyChainGroup.class);
        try (MockedStatic<KeyChainGroup> keyChainGroup = mockStatic(KeyChainGroup.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock2).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            keyChainGroup.when(() -> KeyChainGroup.builder(BitcoinNetwork.MAINNET, keyChainGroupStructureMock)).thenReturn(keyChainGroupBuilderMock);
            doReturn(keyChainGroupBuilderMock2).when(keyChainGroupBuilderMock).fromRandom(ScriptType.P2PKH);
            doReturn(keyChainGroupMock).when(keyChainGroupBuilderMock).build();
            File file = new File("pathname1");
            target = new WalletAppKit(paramsMock2, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            Wallet wallet = walletFactoryMock.create(BitcoinNetwork.MAINNET, keyChainGroupMock);
            doReturn(wallet).when(walletFactoryMock).create(BitcoinNetwork.MAINNET, keyChainGroupMock);
            //Act Statement(s)
            Wallet result = target.createWallet();
            //Assert statement(s)
            assertThat(result, equalTo(wallet));
            verify(paramsMock2).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
            keyChainGroup.verify(() -> KeyChainGroup.builder(BitcoinNetwork.MAINNET, keyChainGroupStructureMock), atLeast(1));
            verify(keyChainGroupBuilderMock).fromRandom(ScriptType.P2PKH);
            verify(keyChainGroupBuilderMock).build();
            verify(walletFactoryMock).create(BitcoinNetwork.MAINNET, keyChainGroupMock);
        }
    }

    //Sapient generated method id: ${af519e4e-683c-3c51-a5fc-838bc39982be}
    @Test()
    public void createPeerGroupTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock2).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = new WalletAppKit(paramsMock2, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            PeerGroup result = target.createPeerGroup();
            //Assert statement(s)
            //TODO: Please implement equals method in PeerGroup for verification of the entire object or you need to adjust respective assertion statements
            assertThat(result, is(notNullValue()));
            verify(paramsMock2).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
        }
    }

    //Sapient generated method id: ${a2a8a624-69f6-3bc6-9a6d-bb9e5c14dc6c}
    @Test()
    public void shutDownTest() throws Exception, IOException, BlockStoreException {
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        PeerGroup vPeerGroupMock2 = mock(PeerGroup.class);
        Wallet vWalletMock2 = mock(Wallet.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock2).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = new WalletAppKit(paramsMock2, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(vPeerGroupMock2).stop();
            doNothing().when(vWalletMock2).saveToFile((File) null);
            doNothing().when(vStoreMock).close();
            //Act Statement(s)
            target.shutDown();
            //Assert statement(s)
            verify(paramsMock2).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
            verify(vPeerGroupMock2).stop();
            verify(vWalletMock2).saveToFile((File) null);
            verify(vStoreMock).close();
        }
    }

    //Sapient generated method id: ${2b739f2b-4be0-3ba9-a8c7-bd5aa44d2e19}
    @Test()
    public void shutDownWhenCaughtBlockStoreExceptionThrowsIOException() throws Exception, IOException, BlockStoreException {
        /* Branches:
         * (catch-exception (BlockStoreException)) : true
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        PeerGroup vPeerGroupMock2 = mock(PeerGroup.class);
        Wallet vWalletMock2 = mock(Wallet.class);
        BlockStoreException blockStoreExceptionMock = mock(BlockStoreException.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock2).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = new WalletAppKit(paramsMock2, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(vPeerGroupMock2).stop();
            doNothing().when(vWalletMock2).saveToFile((File) null);
            doThrow(blockStoreExceptionMock).when(vStoreMock).close();
            thrown.expect(IOException.class);
            thrown.expectCause(is(instanceOf(BlockStoreException.class)));
            //Act Statement(s)
            target.shutDown();
            //Assert statement(s)
            verify(paramsMock2).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
            verify(vPeerGroupMock2).stop();
            verify(vWalletMock2).saveToFile((File) null);
            verify(vStoreMock).close();
        }
    }

    //Sapient generated method id: ${4338ea80-df41-3c09-b3eb-b0476a460c1f}
    @Test()
    public void closeTest() {
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        Service serviceMock = mock(Service.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock2).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = spy(new WalletAppKit(paramsMock2, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(serviceMock).when(target).stopAsync();
            doNothing().when(target).awaitTerminated();
            //Act Statement(s)
            target.close();
            //Assert statement(s)
            verify(paramsMock2).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
            verify(target).stopAsync();
            verify(target).awaitTerminated();
        }
    }

    //Sapient generated method id: ${b444423d-8062-3e94-803b-01f5c4c4e2cc}
    @Test()
    public void networkTest() {
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock2).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = new WalletAppKit(paramsMock2, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            BitcoinNetwork result = target.network();
            //Assert statement(s)
            assertThat(result, equalTo(BitcoinNetwork.MAINNET));
            verify(paramsMock2).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
        }
    }

    //Sapient generated method id: ${0735713f-fd5a-33d2-acae-23ec4e096dfa}
    @Test()
    public void paramsTest() {
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock2).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = new WalletAppKit(paramsMock2, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            NetworkParameters result = target.params();
            //Assert statement(s)
            assertThat(result, equalTo(networkParametersMock));
            verify(paramsMock2).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
        }
    }

    //Sapient generated method id: ${f46545d4-5cc8-3449-9e38-f5f5f878314a}
    @Test()
    public void chainWhenStateEqualsStateRUNNING() {
        /* Branches:
         * (state() == State.STARTING) : false
         * (state() == State.RUNNING) : true
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock2).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = spy(new WalletAppKit(paramsMock2, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(Service.State.RUNNING).when(target).state();
            //Act Statement(s)
            BlockChain result = target.chain();
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            verify(paramsMock2).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
            verify(target, times(2)).state();
        }
    }

    //Sapient generated method id: ${74c78a50-0822-36ac-a20d-01874f796479}
    @Test()
    public void chainWhenStateNotEqualsStateRUNNINGThrowsIllegalStateException() {
        /* Branches:
         * (state() == State.STARTING) : false
         * (state() == State.RUNNING) : false
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock2).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = spy(new WalletAppKit(paramsMock2, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(Service.State.STOPPING, Service.State.NEW).when(target).state();
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.chain();
            //Assert statement(s)
            verify(paramsMock2).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
            verify(target, times(2)).state();
        }
    }

    //Sapient generated method id: ${2f4dbfd9-2358-396e-bbb3-656ddf7ebb3a}
    @Test()
    public void storeWhenStateEqualsStateRUNNING() {
        /* Branches:
         * (state() == State.STARTING) : false
         * (state() == State.RUNNING) : true
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock2).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = spy(new WalletAppKit(paramsMock2, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(Service.State.RUNNING).when(target).state();
            //Act Statement(s)
            BlockStore result = target.store();
            //Assert statement(s)
            assertThat(result, equalTo(vStoreMock));
            verify(paramsMock2).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
            verify(target, times(2)).state();
        }
    }

    //Sapient generated method id: ${612bc927-6c0c-3368-8775-374ab275a0aa}
    @Test()
    public void storeWhenStateNotEqualsStateRUNNINGThrowsIllegalStateException() {
        /* Branches:
         * (state() == State.STARTING) : false
         * (state() == State.RUNNING) : false
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock2).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = spy(new WalletAppKit(paramsMock2, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(Service.State.STOPPING, Service.State.NEW).when(target).state();
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.store();
            //Assert statement(s)
            verify(paramsMock2).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
            verify(target, times(2)).state();
        }
    }

    //Sapient generated method id: ${9597b8ae-dab5-3eb7-99cb-bc4535d74965}
    @Test()
    public void walletWhenStateEqualsStateRUNNING() {
        /* Branches:
         * (state() == State.STARTING) : false
         * (state() == State.RUNNING) : true
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock2).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = spy(new WalletAppKit(paramsMock2, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(Service.State.RUNNING).when(target).state();
            //Act Statement(s)
            Wallet result = target.wallet();
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            verify(paramsMock2).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
            verify(target, times(2)).state();
        }
    }

    //Sapient generated method id: ${701be498-7e55-30f1-8d6c-fcfdc978c2a3}
    @Test()
    public void walletWhenStateNotEqualsStateRUNNINGThrowsIllegalStateException() {
        /* Branches:
         * (state() == State.STARTING) : false
         * (state() == State.RUNNING) : false
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock2).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = spy(new WalletAppKit(paramsMock2, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(Service.State.STOPPING, Service.State.NEW).when(target).state();
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.wallet();
            //Assert statement(s)
            verify(paramsMock2).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
            verify(target, times(2)).state();
        }
    }

    //Sapient generated method id: ${d514f927-78b3-3710-b93e-e1ca1a36d4fd}
    @Test()
    public void peerGroupWhenStateEqualsStateRUNNING() {
        /* Branches:
         * (state() == State.STARTING) : false
         * (state() == State.RUNNING) : true
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock2).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = spy(new WalletAppKit(paramsMock2, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(Service.State.RUNNING).when(target).state();
            //Act Statement(s)
            PeerGroup result = target.peerGroup();
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            verify(paramsMock2).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
            verify(target, times(2)).state();
        }
    }

    //Sapient generated method id: ${7af8afe1-9081-3bc4-abb7-97a150e3f5e2}
    @Test()
    public void peerGroupWhenStateNotEqualsStateRUNNINGThrowsIllegalStateException() {
        /* Branches:
         * (state() == State.STARTING) : false
         * (state() == State.RUNNING) : false
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock2).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = spy(new WalletAppKit(paramsMock2, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(Service.State.STOPPING, Service.State.NEW).when(target).state();
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.peerGroup();
            //Assert statement(s)
            verify(paramsMock2).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
            verify(target, times(2)).state();
        }
    }

    //Sapient generated method id: ${bddb3b89-8f73-33aa-a8dc-cceb760d4f54}
    @Test()
    public void directoryTest() {
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock2).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = new WalletAppKit(paramsMock2, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            File result = target.directory();
            //Assert statement(s)
            assertThat(result, equalTo(file));
            verify(paramsMock2).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
        }
    }
}
