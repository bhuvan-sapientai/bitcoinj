package org.bitcoinj.kits;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.mockito.InjectMocks;
import org.junit.After;
import org.junit.Test;

import java.io.IOException;

import org.bitcoinj.store.BlockStoreException;
import org.junit.rules.ExpectedException;

import java.util.List;

import org.bitcoinj.wallet.Wallet;
import org.bitcoinj.base.ScriptType;
import org.bitcoinj.wallet.WalletExtension;
import org.bitcoinj.crypto.DeterministicKey;

import java.io.ByteArrayInputStream;

import org.bitcoinj.wallet.KeyChainGroup;
import org.mockito.MockitoAnnotations;
import org.bitcoinj.core.PeerAddress;

import java.time.Duration;

import org.bitcoinj.core.NetworkParameters;
import org.bitcoinj.wallet.KeyChainGroupStructure;

import java.io.InputStream;
import java.util.function.Consumer;

import org.bitcoinj.core.BlockChain;
import org.mockito.stubbing.Answer;
import org.bitcoinj.wallet.WalletProtobufSerializer;
import org.bitcoinj.base.internal.Preconditions;
import org.bitcoinj.store.BlockStore;
import org.bitcoinj.base.BitcoinNetwork;
import org.bitcoinj.wallet.DeterministicSeed;

import java.net.InetAddress;

import org.bitcoinj.wallet.WalletFiles;
import org.bitcoinj.net.discovery.PeerDiscovery;

import java.util.function.Supplier;

import org.bitcoinj.core.PeerGroup;
import org.mockito.MockedStatic;
import org.bitcoinj.store.SPVBlockStore;

import java.io.File;

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
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.isA;

public class WalletAppKitSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final WalletProtobufSerializer.WalletFactory walletFactoryMock = mock(WalletProtobufSerializer.WalletFactory.class, "walletFactory");

    private final PeerGroup vPeerGroupMock = mock(PeerGroup.class, "vPeerGroup");

    private final Wallet vWalletMock = mock(Wallet.class, "vWallet");

    private final SPVBlockStore vStoreMock = mock(SPVBlockStore.class, "vStore");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private WalletAppKit target;

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    @After()
    public void afterTest() throws Exception {
        /*if (autoCloseableMocks != null)
    autoCloseableMocks.close();*/
    }

    //Sapient generated method id: ${9eefe250-7eec-36d5-b6ba-7dacfd4b5b90}
    @Test()
    public void launchTest() {
        //Arrange Statement(s)
        //WalletAppKit walletAppKitMock = mock(WalletAppKit.class);
        /*try (MockedStatic<WalletAppKit> walletAppKit = mockStatic(WalletAppKit.class, CALLS_REAL_METHODS)) {
    File file = new File("pathname1");
    walletAppKit.when(() -> WalletAppKit.launch(BitcoinNetwork.MAINNET, file, "filePrefix1", 0)).thenReturn(walletAppKitMock);
    //Act Statement(s)
    WalletAppKit result = WalletAppKit.launch(BitcoinNetwork.MAINNET, file, "filePrefix1");
    //Assert statement(s)
    assertThat(result, equalTo(walletAppKitMock));
    walletAppKit.verify(() -> WalletAppKit.launch(BitcoinNetwork.MAINNET, file, "filePrefix1", 0), atLeast(1));
}*/
    }

    //Sapient generated method id: ${366756c9-a66c-3984-84be-12a2e1c252bf}
    @Test()
    public void launch1Test() {
        //Arrange Statement(s)
        //WalletAppKit walletAppKitMock = mock(WalletAppKit.class);
        /*try (MockedStatic<WalletAppKit> walletAppKit = mockStatic(WalletAppKit.class, CALLS_REAL_METHODS)) {
    File file = new File("pathname1");
    walletAppKit.when(() -> WalletAppKit.launch(BitcoinNetwork.MAINNET, file, "filePrefix1", (Consumer) null, 0)).thenReturn(walletAppKitMock);
    //TODO: Needs initialization with real value
    Consumer consumer = null;
    //Act Statement(s)
    WalletAppKit result = WalletAppKit.launch(BitcoinNetwork.MAINNET, file, "filePrefix1", consumer);
    //Assert statement(s)
    assertThat(result, equalTo(walletAppKitMock));
    walletAppKit.verify(() -> WalletAppKit.launch(BitcoinNetwork.MAINNET, file, "filePrefix1", (Consumer) null, 0), atLeast(1));
}*/
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
         */
        //Arrange Statement(s)
        //thrown.expect(NullPointerException.class);
        //File file = new File("pathname1");
        //Consumer consumer = null;
        //Act Statement(s)
        //WalletAppKit.launch(BitcoinNetwork.REGTEST, file, "filePrefix1", consumer, 1);
    }

    //Sapient generated method id: ${dbf7e57d-25b2-3b5c-a0aa-2edbecc71a75}
    @Test()
    public void setPeerNodesWhenStateEqualsStateNEWThrowsIllegalStateException() {
        /* Branches:
         * (state() == State.NEW) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
    IllegalStateException illegalStateException = new IllegalStateException();
    preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenThrow(illegalStateException);
    NetworkParameters networkParameters = NetworkParameters.fromID("id1");
    File file = new File("pathname1");
    target = new WalletAppKit(networkParameters, ScriptType.P2PKH, keyChainGroupStructureMock, file, "prefix");
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    thrown.expect(IllegalStateException.class);
    InetAddress inetAddress = InetAddress.getLoopbackAddress();
    PeerAddress peerAddress = PeerAddress.simple(inetAddress, 0);
    PeerAddress[][] peerAddressArray3 = new PeerAddress[][] { peerAddress };
    PeerAddress peerAddress2 = PeerAddress.simple(inetAddress, 0);
    PeerAddress[][] peerAddressArray4 = new PeerAddress[][] { peerAddress2 };
    PeerAddress[] peerAddressArray2 = new PeerAddress[] { peerAddressArray3, peerAddressArray4 };
    PeerAddress[] peerAddressArray = new PeerAddress[] { peerAddressArray2 };
    //Act Statement(s)
    target.setPeerNodes(peerAddressArray);
    //Assert statement(s)
    preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
}*/
    }

    //Sapient generated method id: ${ca932129-6290-34d4-89ae-e65900f0bf1a}
    @Test()
    public void setPeerNodesWhenStateNotEqualsStateNEWThrowsIllegalStateException() {
        /* Branches:
         * (state() == State.NEW) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //NetworkParameters paramsMock = mock(NetworkParameters.class);
        //KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
    MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
    doReturn(BitcoinNetwork.MAINNET).when(paramsMock).network();
    NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
    networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParameters2);
    IllegalStateException illegalStateException = new IllegalStateException();
    preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenThrow(illegalStateException);
    File file = new File("pathname1");
    target = new WalletAppKit(paramsMock, ScriptType.P2PKH, keyChainGroupStructureMock, file, "wallet");
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    thrown.expect(IllegalStateException.class);
    InetAddress inetAddress = InetAddress.getLoopbackAddress();
    PeerAddress peerAddress = PeerAddress.simple(inetAddress, 0);
    PeerAddress[][] peerAddressArray3 = new PeerAddress[][] { peerAddress };
    PeerAddress peerAddress2 = PeerAddress.simple(inetAddress, 0);
    PeerAddress[][] peerAddressArray4 = new PeerAddress[][] { peerAddress2 };
    PeerAddress[] peerAddressArray2 = new PeerAddress[] { peerAddressArray3, peerAddressArray4 };
    PeerAddress[] peerAddressArray = new PeerAddress[] { peerAddressArray2 };
    //Act Statement(s)
    target.setPeerNodes(peerAddressArray);
    //Assert statement(s)
    verify(paramsMock).network();
    networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
    preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
}*/
    }

    //Sapient generated method id: ${c842249d-095e-37ed-9870-47f67538ad7c}
    @Test()
    public void connectToLocalHostTest() {
        //Arrange Statement(s)
        //NetworkParameters paramsMock = mock(NetworkParameters.class);
        //NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        //PeerAddress peerAddressMock = mock(PeerAddress.class);
        //KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        //WalletAppKit walletAppKitMock = mock(WalletAppKit.class);
        /*try (MockedStatic<PeerAddress> peerAddress = mockStatic(PeerAddress.class);
    MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
    doReturn(BitcoinNetwork.MAINNET).when(paramsMock).network();
    networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
    peerAddress.when(() -> PeerAddress.localhost(networkParametersMock)).thenReturn(peerAddressMock);
    File file = new File("pathname1");
    target = spy(new WalletAppKit(paramsMock, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1"));
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    PeerAddress[] peerAddressArray = new PeerAddress[] { peerAddressMock };
    doReturn(walletAppKitMock).when(target).setPeerNodes(peerAddressArray);
    //Act Statement(s)
    WalletAppKit result = target.connectToLocalHost();
    //Assert statement(s)
    assertThat(result, equalTo(walletAppKitMock));
    verify(paramsMock).network();
    networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
    peerAddress.verify(() -> PeerAddress.localhost(networkParametersMock), atLeast(1));
    verify(target).setPeerNodes(peerAddressArray);
}*/
    }

    //Sapient generated method id: ${c091d87f-8785-3269-8907-22306d33428e}
    @Test()
    public void setAutoSaveWhenStateEqualsStateNEWThrowsIllegalStateException() {
        /* Branches:
         * (state() == State.NEW) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
    IllegalStateException illegalStateException = new IllegalStateException();
    preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenThrow(illegalStateException);
    NetworkParameters networkParameters = NetworkParameters.fromID("id1");
    File file = new File("pathname1");
    target = new WalletAppKit(networkParameters, ScriptType.P2PKH, keyChainGroupStructureMock, file, "test");
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    thrown.expect(IllegalStateException.class);
    //Act Statement(s)
    target.setAutoSave(true);
    //Assert statement(s)
    preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
}*/
    }

    //Sapient generated method id: ${f89f9051-61a8-3ca8-81d0-c35a95594ddc}
    @Test()
    public void setAutoSaveWhenStateNotEqualsStateNEWThrowsIllegalStateException() {
        /* Branches:
         * (state() == State.NEW) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenThrow(illegalStateException);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            File file = new File("pathname1");
            target = new WalletAppKit(networkParameters, ScriptType.P2PKH, keyChainGroupStructureMock, file, "");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.setAutoSave(true);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${1cf90bb2-fb2c-3f39-98b9-5d6c5ee0727b}
    @Test()
    public void setDownloadListenerTest() {
        //Arrange Statement(s)
        NetworkParameters paramsMock = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        DownloadProgressTracker downloadProgressTrackerMock = mock(DownloadProgressTracker.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = new WalletAppKit(paramsMock, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            WalletAppKit result = target.setDownloadListener(downloadProgressTrackerMock);
            //Assert statement(s)
            assertThat(result, equalTo(target));
            verify(paramsMock).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
        }
    }

    //Sapient generated method id: ${af986e31-30ae-3078-8125-a8b7a08ee774}
    @Test()
    public void setAutoStopTest() {
        //Arrange Statement(s)
        //NetworkParameters paramsMock = mock(NetworkParameters.class);
        //NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        //KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        /*try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
    doReturn(BitcoinNetwork.MAINNET).when(paramsMock).network();
    networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
    File file = new File("pathname1");
    target = new WalletAppKit(paramsMock, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1");
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    //Act Statement(s)
    WalletAppKit result = target.setAutoStop(false);
    //Assert statement(s)
    assertThat(result, equalTo(target));
    verify(paramsMock).network();
    networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
}*/
    }

    //Sapient generated method id: ${5c8f94de-8136-324c-bb24-e3714ebaca1f}
    @Test()
    public void setCheckpointsWhenThisCheckpointsIsNull() {
        /* Branches:
         * (this.checkpoints != null) : false
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = new WalletAppKit(paramsMock, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            //Act Statement(s)
            WalletAppKit result = target.setCheckpoints(inputStream);
            //Assert statement(s)
            assertThat(result, equalTo(target));
            verify(paramsMock).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
        }
    }

    //Sapient generated method id: ${b9f177cf-1459-3f78-8b87-b13d8054e86e}
    @Test()
    public void setBlockingStartupTest() {
        //Arrange Statement(s)
        NetworkParameters paramsMock = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = new WalletAppKit(paramsMock, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            WalletAppKit result = target.setBlockingStartup(false);
            //Assert statement(s)
            assertThat(result, equalTo(target));
            verify(paramsMock).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
        }
    }

    //Sapient generated method id: ${22830135-a3d3-30ef-b7ef-b066728b738a}
    @Test()
    public void setUserAgentTest() {
        //Arrange Statement(s)
        //NetworkParameters paramsMock = mock(NetworkParameters.class);
        //NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        //KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        /*try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
    doReturn(BitcoinNetwork.MAINNET).when(paramsMock).network();
    networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
    File file = new File("pathname1");
    target = new WalletAppKit(paramsMock, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1");
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    //Act Statement(s)
    WalletAppKit result = target.setUserAgent("userAgent1", "version1");
    //Assert statement(s)
    assertThat(result, equalTo(target));
    verify(paramsMock).network();
    networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
}*/
    }

    //Sapient generated method id: ${25f38753-bba6-3d8c-a396-67a94d422f15}
    @Test()
    public void setWalletFactoryTest() {
        //Arrange Statement(s)
        //NetworkParameters paramsMock = mock(NetworkParameters.class);
        //NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        //KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        //WalletProtobufSerializer.WalletFactory walletProtobufSerializerWalletFactoryMock = mock(WalletProtobufSerializer.WalletFactory.class);
        /*try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
    doReturn(BitcoinNetwork.MAINNET).when(paramsMock).network();
    networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
    File file = new File("pathname1");
    target = new WalletAppKit(paramsMock, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1");
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    //Act Statement(s)
    WalletAppKit result = target.setWalletFactory(walletProtobufSerializerWalletFactoryMock);
    //Assert statement(s)
    assertThat(result, equalTo(target));
    verify(paramsMock).network();
    networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
}*/
    }

    //Sapient generated method id: ${93f7d66f-c329-3263-97e6-01603d4eaa2f}
    @Test()
    public void restoreWalletFromSeedTest() {
        //Arrange Statement(s)
        //NetworkParameters paramsMock = mock(NetworkParameters.class);
        //NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        //KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        //DeterministicSeed deterministicSeedMock = mock(DeterministicSeed.class);
        /*try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
    doReturn(BitcoinNetwork.MAINNET).when(paramsMock).network();
    networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
    File file = new File("pathname1");
    target = new WalletAppKit(paramsMock, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1");
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    //Act Statement(s)
    WalletAppKit result = target.restoreWalletFromSeed(deterministicSeedMock);
    //Assert statement(s)
    assertThat(result, equalTo(target));
    verify(paramsMock).network();
    networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
}*/
    }

    //Sapient generated method id: ${6d67e434-7075-3f80-bcb9-83af1b53c2aa}
    @Test()
    public void restoreWalletFromKeyTest() {
        //Arrange Statement(s)
        //NetworkParameters paramsMock = mock(NetworkParameters.class);
        //NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        //KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        //DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        /*try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
    doReturn(BitcoinNetwork.MAINNET).when(paramsMock).network();
    networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
    File file = new File("pathname1");
    target = new WalletAppKit(paramsMock, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1");
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    //Act Statement(s)
    WalletAppKit result = target.restoreWalletFromKey(deterministicKeyMock);
    //Assert statement(s)
    assertThat(result, equalTo(target));
    verify(paramsMock).network();
    networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
}*/
    }

    //Sapient generated method id: ${480b0f0e-c1ed-312f-a8ed-8924117c7cb8}
    @Test()
    public void setDiscoveryTest() {
        //Arrange Statement(s)
        //NetworkParameters paramsMock = mock(NetworkParameters.class);
        //NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        //KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        //PeerDiscovery peerDiscoveryMock = mock(PeerDiscovery.class);
        /*try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
    doReturn(BitcoinNetwork.MAINNET).when(paramsMock).network();
    networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
    File file = new File("pathname1");
    target = new WalletAppKit(paramsMock, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1");
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    //Act Statement(s)
    WalletAppKit result = target.setDiscovery(peerDiscoveryMock);
    //Assert statement(s)
    assertThat(result, equalTo(target));
    verify(paramsMock).network();
    networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
}*/
    }

    //Sapient generated method id: ${8e6399c5-490e-39a2-a5c0-f94d5a4047d5}
    @Test()
    public void provideWalletExtensionsTest() throws Exception {
        //Arrange Statement(s)
        NetworkParameters paramsMock = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = new WalletAppKit(paramsMock, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            List<WalletExtension> result = target.provideWalletExtensions();
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            verify(paramsMock).network();
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
        NetworkParameters paramsMock = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = new WalletAppKit(paramsMock, ScriptType.P2PKH, keyChainGroupStructureMock, file, "");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.isChainFileLocked();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(paramsMock).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
        }
    }

    //Sapient generated method id: ${70f0950b-9983-3d04-aa0c-446eb10e624b}
    @Test()
    public void isChainFileLockedWhenDefaultBranch() throws IOException {
        /* Branches:
         * (!file.exists()) : false
         * (file.isDirectory()) : false
         * (lock == null) : true
         * (branch expression (line 380)) : false
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = new WalletAppKit(paramsMock, ScriptType.P2PKH, keyChainGroupStructureMock, file, "");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.isChainFileLocked();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(paramsMock).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
        }
    }

    //Sapient generated method id: ${62361cbe-d942-37df-ba8f-95285db6c253}
    @Test()
    public void startUpWhenDirectoryNotMkdirsThrowsIOException() throws Exception {
        /* Branches:
         * (!directory.exists()) : true
         * (!directory.mkdirs()) : true
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = new WalletAppKit(paramsMock, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            IOException iOException = new IOException("Could not create directory /pathname1");
            thrown.expect(IOException.class);
            thrown.expectMessage(iOException.getMessage());
            //Act Statement(s)
            target.startUp();
            //Assert statement(s)
            verify(paramsMock).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
        }
    }

    //Sapient generated method id: ${55c79d12-da48-3683-ab5a-7e38cb21a509}
    @Test()
    public void startUpWhenDiscoveryIsNullAndAutoStopAndBlockingStartup() throws Exception {
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
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = new WalletAppKit(paramsMock, ScriptType.P2PKH, keyChainGroupStructureMock, file, "");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            IOException iOException = new IOException("Could not create directory /pathname1");
            thrown.expect(IOException.class);
            thrown.expectMessage(iOException.getMessage());
            //Act Statement(s)
            target.startUp();
            //Assert statement(s)
            verify(paramsMock).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
        }
    }

    //Sapient generated method id: ${0e00a561-e76f-310c-9c4f-e40b6e72e96d}
    @Test()
    public void startUpWhenParamsNetworkNotEqualsBitcoinNetworkREGTESTAndDiscoveryIsNullAndAutoStopAndBlockingStartup2() throws Exception {
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
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = new WalletAppKit(paramsMock, ScriptType.P2PKH, keyChainGroupStructureMock, file, "");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            IOException iOException = new IOException("Could not create directory /pathname1");
            thrown.expect(IOException.class);
            thrown.expectMessage(iOException.getMessage());
            //Act Statement(s)
            target.startUp();
            //Assert statement(s)
            verify(paramsMock).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
        }
    }

    //Sapient generated method id: ${08c43ef7-36a6-300c-be2d-92b0505d4bc8}
    @Test()
    public void startUpWhenParamsNetworkNotEqualsBitcoinNetworkREGTESTAndDiscoveryIsNullAndAutoStopAndBlockingStartup8() throws Exception {
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
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = new WalletAppKit(paramsMock, ScriptType.P2PKH, keyChainGroupStructureMock, file, "");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            IOException iOException = new IOException("Could not create directory /pathname1");
            thrown.expect(IOException.class);
            thrown.expectMessage(iOException.getMessage());
            //Act Statement(s)
            target.startUp();
            //Assert statement(s)
            verify(paramsMock).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
        }
    }

    //Sapient generated method id: ${5815d27e-b1db-3b6f-a589-65af113e94ed}
    @Test()
    public void startUpWhenParamsNetworkNotEqualsBitcoinNetworkREGTESTAndDiscoveryIsNullAndAutoStopAndBlockingStartup11() throws Exception {
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
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = new WalletAppKit(paramsMock, ScriptType.P2PKH, keyChainGroupStructureMock, file, "");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            IOException iOException = new IOException("Could not create directory /pathname1");
            thrown.expect(IOException.class);
            thrown.expectMessage(iOException.getMessage());
            //Act Statement(s)
            target.startUp();
            //Assert statement(s)
            verify(paramsMock).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
        }
    }

    //Sapient generated method id: ${e630cc8a-1b89-39f7-8328-3d77e5a61b67}
    @Test()
    public void setupAutoSaveTest() {
        //Arrange Statement(s)
        Wallet walletMock = mock(Wallet.class);
        WalletFiles walletFilesMock = mock(WalletFiles.class);
        NetworkParameters paramsMock = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(walletFilesMock).when(walletMock).autosaveToFile(eq((File) null), (Duration) any(), eq(null));
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = new WalletAppKit(paramsMock, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.setupAutoSave(walletMock);
            //Assert statement(s)
            verify(walletMock).autosaveToFile(eq((File) null), (Duration) any(), eq(null));
            verify(paramsMock).network();
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
        //NetworkParameters paramsMock = mock(NetworkParameters.class);
        //NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        //KeyChainGroup.Builder keyChainGroupBuilderMock = mock(KeyChainGroup.Builder.class);
        //KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        //KeyChainGroup.Builder keyChainGroupBuilderMock2 = mock(KeyChainGroup.Builder.class);
        //KeyChainGroup keyChainGroupMock = mock(KeyChainGroup.class);
        /*try (MockedStatic<KeyChainGroup> keyChainGroup = mockStatic(KeyChainGroup.class);
    MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
    doReturn(BitcoinNetwork.MAINNET).when(paramsMock).network();
    networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
    keyChainGroup.when(() -> KeyChainGroup.builder(BitcoinNetwork.MAINNET, keyChainGroupStructureMock)).thenReturn(keyChainGroupBuilderMock);
    doReturn(keyChainGroupBuilderMock2).when(keyChainGroupBuilderMock).fromRandom(ScriptType.P2PKH);
    doReturn(keyChainGroupMock).when(keyChainGroupBuilderMock).build();
    File file = new File("pathname1");
    target = new WalletAppKit(paramsMock, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1");
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    Wallet wallet = walletFactoryMock.create(BitcoinNetwork.MAINNET, keyChainGroupMock);
    doReturn(wallet).when(walletFactoryMock).create(BitcoinNetwork.MAINNET, keyChainGroupMock);
    //Act Statement(s)
    Wallet result = target.createWallet();
    //Assert statement(s)
    assertThat(result, equalTo(wallet));
    verify(paramsMock).network();
    networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
    keyChainGroup.verify(() -> KeyChainGroup.builder(BitcoinNetwork.MAINNET, keyChainGroupStructureMock), atLeast(1));
    verify(keyChainGroupBuilderMock).fromRandom(ScriptType.P2PKH);
    verify(keyChainGroupBuilderMock).build();
    verify(walletFactoryMock).create(BitcoinNetwork.MAINNET, keyChainGroupMock);
}*/
    }

    //Sapient generated method id: ${af519e4e-683c-3c51-a5fc-838bc39982be}
    @Test()
    public void createPeerGroupTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = new WalletAppKit(paramsMock, ScriptType.P2PKH, keyChainGroupStructureMock, file, "walletappkit");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            PeerGroup result = target.createPeerGroup();
            PeerGroup peerGroup = new PeerGroup(BitcoinNetwork.MAINNET, (BlockChain) null);
            //Assert statement(s)
            //TODO: Please implement equals method in PeerGroup for verification to succeed or you need to adjust respective assertion statements
            assertThat(result, equalTo(peerGroup));
            verify(paramsMock).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
        }
    }

    //Sapient generated method id: ${a2a8a624-69f6-3bc6-9a6d-bb9e5c14dc6c}
    @Test()
    public void shutDownTest() throws Exception, IOException, BlockStoreException {
        //Arrange Statement(s)
        NetworkParameters paramsMock = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = new WalletAppKit(paramsMock, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(vPeerGroupMock).stop();
            doNothing().when(vWalletMock).saveToFile((File) null);
            doNothing().when(vStoreMock).close();
            //Act Statement(s)
            target.shutDown();
            //Assert statement(s)
            verify(paramsMock).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
            verify(vPeerGroupMock).stop();
            verify(vWalletMock).saveToFile((File) null);
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
        NetworkParameters paramsMock = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        BlockStoreException blockStoreExceptionMock = mock(BlockStoreException.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = new WalletAppKit(paramsMock, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(vPeerGroupMock).stop();
            doNothing().when(vWalletMock).saveToFile((File) null);
            doThrow(blockStoreExceptionMock).when(vStoreMock).close();
            thrown.expect(IOException.class);
            thrown.expectCause(isA(BlockStoreException.class));
            //Act Statement(s)
            target.shutDown();
            //Assert statement(s)
            verify(paramsMock).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
            verify(vPeerGroupMock).stop();
            verify(vWalletMock).saveToFile((File) null);
            verify(vStoreMock).close();
        }
    }

    //Sapient generated method id: ${4338ea80-df41-3c09-b3eb-b0476a460c1f}
    @Test()
    public void closeTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParameters = NetworkParameters.fromID("id1");
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        File file = new File("pathname1");
        target = new WalletAppKit(networkParameters, ScriptType.P2PKH, keyChainGroupStructureMock, file, "String");
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        target.close();
    }

    //Sapient generated method id: ${b444423d-8062-3e94-803b-01f5c4c4e2cc}
    @Test()
    public void networkTest() {
        //Arrange Statement(s)
        NetworkParameters paramsMock = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = new WalletAppKit(paramsMock, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            BitcoinNetwork result = target.network();
            //Assert statement(s)
            assertThat(result, equalTo(BitcoinNetwork.MAINNET));
            verify(paramsMock).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
        }
    }

    //Sapient generated method id: ${0735713f-fd5a-33d2-acae-23ec4e096dfa}
    @Test()
    public void paramsTest() {
        //Arrange Statement(s)
        NetworkParameters paramsMock = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = new WalletAppKit(paramsMock, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            NetworkParameters result = target.params();
            //Assert statement(s)
            assertThat(result, equalTo(networkParametersMock));
            verify(paramsMock).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
        }
    }

    //Sapient generated method id: ${f46545d4-5cc8-3449-9e38-f5f5f878314a}
    @Test()
    public void chainWhenStateEqualsStateRUNNING() {
        /* Branches:
         * (state() == State.STARTING) : false
         * (state() == State.RUNNING) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkState(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            File file = new File("pathname1");
            target = new WalletAppKit(networkParameters, ScriptType.P2PKH, keyChainGroupStructureMock, file, "prefix");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            BlockChain result = target.chain();
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            preconditions.verify(() -> Preconditions.checkState(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${bec5959f-213f-3aaf-b912-25ede77a2cac}
    @Test()
    public void chainWhenStateNotEqualsStateRUNNING() {
        /* Branches:
         * (state() == State.STARTING) : false
         * (state() == State.RUNNING) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParameters2);
            preconditions.when(() -> Preconditions.checkState(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            NetworkParameters networkParameters3 = NetworkParameters.fromID("id1");
            File file = new File("pathname1");
            target = new WalletAppKit(networkParameters3, ScriptType.P2PKH, keyChainGroupStructureMock, file, "String");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            BlockChain result = target.chain();
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
            preconditions.verify(() -> Preconditions.checkState(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${2f4dbfd9-2358-396e-bbb3-656ddf7ebb3a}
    @Test()
    public void storeWhenStateEqualsStateRUNNING() {
        /* Branches:
         * (state() == State.STARTING) : false
         * (state() == State.RUNNING) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkState(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            File file = new File("pathname1");
            target = new WalletAppKit(networkParameters, ScriptType.P2PKH, keyChainGroupStructureMock, file, "");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            BlockStore result = target.store();
            //Assert statement(s)
            assertThat(result, equalTo(vStoreMock));
            preconditions.verify(() -> Preconditions.checkState(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${fda5beec-a5ee-37bf-b746-800ccafe9fd5}
    @Test()
    public void storeWhenStateNotEqualsStateRUNNING() {
        /* Branches:
         * (state() == State.STARTING) : false
         * (state() == State.RUNNING) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkState(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            File file = new File("pathname1");
            target = new WalletAppKit(networkParameters, ScriptType.P2PKH, keyChainGroupStructureMock, file, "\"wallet\"");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            BlockStore result = target.store();
            //Assert statement(s)
            assertThat(result, equalTo(vStoreMock));
            preconditions.verify(() -> Preconditions.checkState(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${9597b8ae-dab5-3eb7-99cb-bc4535d74965}
    @Test()
    public void walletWhenStateEqualsStateRUNNING() {
        /* Branches:
         * (state() == State.STARTING) : false
         * (state() == State.RUNNING) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParameters2);
            preconditions.when(() -> Preconditions.checkState(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            NetworkParameters networkParameters3 = NetworkParameters.fromID("id1");
            File file = new File("pathname1");
            target = new WalletAppKit(networkParameters3, ScriptType.P2PKH, keyChainGroupStructureMock, file, "test");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            Wallet result = target.wallet();
            //Assert statement(s)
            assertThat(result, equalTo(vWalletMock));
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
            preconditions.verify(() -> Preconditions.checkState(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${2787b600-c171-3985-bca6-c70336375b6e}
    @Test()
    public void walletWhenStateNotEqualsStateRUNNING() {
        /* Branches:
         * (state() == State.STARTING) : false
         * (state() == State.RUNNING) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParameters2);
            preconditions.when(() -> Preconditions.checkState(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            NetworkParameters networkParameters3 = NetworkParameters.fromID("id1");
            File file = new File("pathname1");
            target = new WalletAppKit(networkParameters3, ScriptType.P2PKH, keyChainGroupStructureMock, file, "\"test\"");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            Wallet result = target.wallet();
            //Assert statement(s)
            assertThat(result, equalTo(vWalletMock));
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
            preconditions.verify(() -> Preconditions.checkState(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${d514f927-78b3-3710-b93e-e1ca1a36d4fd}
    @Test()
    public void peerGroupWhenStateEqualsStateRUNNING() {
        /* Branches:
         * (state() == State.STARTING) : false
         * (state() == State.RUNNING) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            preconditions.when(() -> Preconditions.checkState(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            File file = new File("pathname1");
            target = new WalletAppKit(paramsMock, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            PeerGroup result = target.peerGroup();
            //Assert statement(s)
            assertThat(result, equalTo(vPeerGroupMock));
            verify(paramsMock).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
            preconditions.verify(() -> Preconditions.checkState(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${70ed703e-b1c0-38e2-b3b0-b1b6f92e9409}
    @Test()
    public void peerGroupWhenStateNotEqualsStateRUNNING() {
        /* Branches:
         * (state() == State.STARTING) : false
         * (state() == State.RUNNING) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock).network();
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParameters2);
            preconditions.when(() -> Preconditions.checkState(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            File file = new File("pathname1");
            target = new WalletAppKit(paramsMock, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            PeerGroup result = target.peerGroup();
            //Assert statement(s)
            assertThat(result, equalTo(vPeerGroupMock));
            verify(paramsMock).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
            preconditions.verify(() -> Preconditions.checkState(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${bddb3b89-8f73-33aa-a8dc-cceb760d4f54}
    @Test()
    public void directoryTest() {
        //Arrange Statement(s)
        NetworkParameters paramsMock = mock(NetworkParameters.class);
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        KeyChainGroupStructure keyChainGroupStructureMock = mock(KeyChainGroupStructure.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(BitcoinNetwork.MAINNET).when(paramsMock).network();
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.MAINNET)).thenReturn(networkParametersMock);
            File file = new File("pathname1");
            target = new WalletAppKit(paramsMock, ScriptType.P2PKH, keyChainGroupStructureMock, file, "filePrefix1");
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            File result = target.directory();
            //Assert statement(s)
            assertThat(result, equalTo(file));
            verify(paramsMock).network();
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.MAINNET), atLeast(1));
        }
    }
}
