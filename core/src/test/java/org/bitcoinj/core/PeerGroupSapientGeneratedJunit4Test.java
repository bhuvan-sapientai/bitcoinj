package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.mockito.InjectMocks;
import org.junit.After;
import org.junit.Ignore;
import org.junit.Test;
import org.bitcoinj.net.discovery.PeerDiscoveryException;
import org.bitcoinj.script.ScriptException;

import java.util.concurrent.ExecutionException;

import org.bitcoinj.base.Network;
import org.bitcoinj.core.listeners.ChainDownloadStartedEventListener;

import java.util.concurrent.ScheduledThreadPoolExecutor;

import org.bitcoinj.utils.Threading;
import org.mockito.MockitoAnnotations;

import java.time.Duration;

import org.bitcoinj.wallet.listeners.ScriptsChangeEventListener;

import java.net.InetSocketAddress;
import java.util.ArrayList;

import org.bitcoinj.wallet.listeners.KeyChainEventListener;
import org.bitcoinj.script.Script;

import java.net.NoRouteToHostException;
import java.util.concurrent.ScheduledExecutorService;

import org.bitcoinj.base.internal.Preconditions;
import org.bitcoinj.utils.ListenerRegistration;
import org.bitcoinj.base.Sha256Hash;

import java.net.InetAddress;

import org.bitcoinj.core.listeners.PreMessageReceivedEventListener;

import java.util.concurrent.CompletableFuture;
import java.time.Instant;

import org.bitcoinj.wallet.listeners.WalletCoinsReceivedEventListener;
import org.junit.rules.ExpectedException;

import java.util.List;

import org.bitcoinj.wallet.Wallet;
import org.bitcoinj.core.listeners.PeerDisconnectedEventListener;
import org.bitcoinj.core.listeners.BlocksDownloadedEventListener;
import org.bitcoinj.core.listeners.PeerDiscoveredEventListener;

import java.net.Inet6Address;

import org.bitcoinj.utils.ListenableCompletableFuture;
import org.bitcoinj.script.ScriptPattern;
import org.bitcoinj.core.listeners.OnTransactionBroadcastListener;
import org.bitcoinj.wallet.listeners.WalletCoinsSentEventListener;
import com.google.common.util.concurrent.Service;

import java.util.concurrent.Executor;

import org.bitcoinj.core.listeners.BlockchainDownloadEventListener;

import java.util.concurrent.CopyOnWriteArrayList;

import org.bitcoinj.base.internal.Stopwatch;
import org.bitcoinj.net.discovery.PeerDiscovery;
import org.mockito.MockedStatic;
import org.bitcoinj.net.discovery.MultiplexingDiscovery;
import org.bitcoinj.core.listeners.DownloadProgressTracker;
import org.bitcoinj.net.ClientConnectionManager;
import org.bitcoinj.core.listeners.GetDataEventListener;
import org.bitcoinj.core.listeners.PeerConnectedEventListener;

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
import static org.hamcrest.Matchers.containsInRelativeOrder;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.core.IsInstanceOf.instanceOf;

public class PeerGroupSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final ClientConnectionManager channelsMock = mock(ClientConnectionManager.class, "channels");

    private final NetworkParameters paramsMock = mock(NetworkParameters.class, "params");

    private final Peer downloadPeerMock = mock(Peer.class, "downloadPeer");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private PeerGroup target;

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    @After()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${cb33b91b-16f1-327e-b146-dfad5ae870f6}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void createPrivateExecutorTest() {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            ScheduledExecutorService result = target.createPrivateExecutor();
            //Assert statement(s)
            //TODO: Please implement equals method in ScheduledThreadPoolExecutor for verification of the entire object or you need to adjust respective assertion statements
            assertThat(result, is(notNullValue()));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
        }
    }

    //Sapient generated method id: ${efa8b7ba-547d-3487-81c0-78589231666c}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void setPeerDiscoveryTimeoutMillisTest() {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.setPeerDiscoveryTimeoutMillis(0L);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
        }
    }

    //Sapient generated method id: ${11ae18ce-e011-3c9f-9e7d-f093d92515b6}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void setMaxConnectionsWhenIsRunningNot() {
        /* Branches:
         * (!isRunning()) : true
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(false).when(target).isRunning();
            //Act Statement(s)
            target.setMaxConnections(0);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            verify(target).isRunning();
        }
    }

    //Sapient generated method id: ${5bc962aa-3150-3e70-b479-8a99b45ae95d}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void setMaxConnectionsWhenAdjustmentLessThan0() {
        /* Branches:
         * (!isRunning()) : false
         * (adjustment > 0) : false
         * (adjustment < 0) : true
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(true).when(target).isRunning();
            doReturn(2).when(channelsMock).getConnectedClientCount();
            doNothing().when(channelsMock).closeConnections(1);
            //Act Statement(s)
            target.setMaxConnections(1);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            verify(target).isRunning();
            verify(channelsMock).getConnectedClientCount();
            verify(channelsMock).closeConnections(1);
        }
    }

    //Sapient generated method id: ${4cbcc229-a395-314e-bd56-2db2898b78b3}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void setMaxConnectionsWhenExecutorNotIsShutdownAndAdjustmentNotLessThan0() {
        /* Branches:
         * (!isRunning()) : false
         * (adjustment > 0) : true
         * (!executor.isShutdown()) : true  #  inside triggerConnections method
         * (adjustment < 0) : false
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(true).when(target).isRunning();
            doReturn(1).when(channelsMock).getConnectedClientCount();
            //Act Statement(s)
            target.setMaxConnections(2);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            verify(target).isRunning();
            verify(channelsMock).getConnectedClientCount();
        }
    }

    //Sapient generated method id: ${9c517028-2356-3ca8-828b-5a010f60b4ca}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void setDownloadTxDependenciesTest() {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.setDownloadTxDependencies(0);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
        }
    }

    //Sapient generated method id: ${45136a99-8f6c-3d89-857e-67b9abc5e077}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void getMaxConnectionsTest() {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            int result = target.getMaxConnections();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
        }
    }

    //Sapient generated method id: ${ec5e3d76-0e27-3024-a795-17953482547e}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void setVersionMessageTest() {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.setVersionMessage(versionMessageMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
        }
    }

    //Sapient generated method id: ${a678031a-49c7-33a2-9dc7-68eee3991e1b}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void getVersionMessageTest() {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            VersionMessage result = target.getVersionMessage();
            VersionMessage versionMessage = new VersionMessage(paramsMock, 0);
            //Assert statement(s)
            assertThat(result, equalTo(versionMessage));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
        }
    }

    //Sapient generated method id: ${35b39a80-30c8-31c4-b53e-c4666c9ab85d}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void setUserAgentWhenNotWillSendFilter() {
        /* Branches:
         * (chain == null) : true
         * (chain != null) : false  #  inside updateVersionMessageRelayTxesBeforeFilter method
         * (spvMode) : false  #  inside updateVersionMessageRelayTxesBeforeFilter method
         * (!willSendFilter) : true  #  inside updateVersionMessageRelayTxesBeforeFilter method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: ver
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.setUserAgent("name1", "version1", "comments1");
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
        }
    }

    //Sapient generated method id: ${25705440-7d99-3519-a66f-c6fc8a45b160}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void setUserAgent1Test() {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).setUserAgent("name1", "version1", (String) null);
            //Act Statement(s)
            target.setUserAgent("name1", "version1");
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            verify(target).setUserAgent("name1", "version1", (String) null);
        }
    }

    //Sapient generated method id: ${00c52a61-8e62-37ad-8f02-af5ff7dff678}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void addBlocksDownloadedEventListenerTest() {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        Executor executorMock = mock(Executor.class);
        BlocksDownloadedEventListener blocksDownloadedEventListenerMock = mock(BlocksDownloadedEventListener.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).addBlocksDownloadedEventListener(executorMock, blocksDownloadedEventListenerMock);
            //Act Statement(s)
            target.addBlocksDownloadedEventListener(blocksDownloadedEventListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            verify(target).addBlocksDownloadedEventListener(executorMock, blocksDownloadedEventListenerMock);
        }
    }

    //Sapient generated method id: ${5435a88a-afa5-34ec-bf1f-95244c0f487e}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void addBlocksDownloadedEventListener1WhenGetPendingPeersIsNotEmpty() {
        /* Branches:
         * (for-each(getConnectedPeers())) : true
         * (for-each(getPendingPeers())) : true
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        Peer peerMock = mock(Peer.class);
        Executor executorMock = mock(Executor.class);
        BlocksDownloadedEventListener blocksDownloadedEventListenerMock = mock(BlocksDownloadedEventListener.class);
        Peer peerMock2 = mock(Peer.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Peer> peerList = new ArrayList<>();
            peerList.add(peerMock);
            doReturn(peerList).when(target).getConnectedPeers();
            doNothing().when(peerMock).addBlocksDownloadedEventListener(executorMock, blocksDownloadedEventListenerMock);
            List<Peer> peerList2 = new ArrayList<>();
            peerList2.add(peerMock2);
            doReturn(peerList2).when(target).getPendingPeers();
            doNothing().when(peerMock2).addBlocksDownloadedEventListener(executorMock, blocksDownloadedEventListenerMock);
            //Act Statement(s)
            target.addBlocksDownloadedEventListener(executorMock, blocksDownloadedEventListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            verify(target).getConnectedPeers();
            verify(peerMock).addBlocksDownloadedEventListener(executorMock, blocksDownloadedEventListenerMock);
            verify(target).getPendingPeers();
            verify(peerMock2).addBlocksDownloadedEventListener(executorMock, blocksDownloadedEventListenerMock);
        }
    }

    //Sapient generated method id: ${c11d7f2e-8338-3fd7-b80d-222bef42da68}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void addChainDownloadStartedEventListenerTest() {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        Executor executorMock = mock(Executor.class);
        ChainDownloadStartedEventListener chainDownloadStartedEventListenerMock = mock(ChainDownloadStartedEventListener.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).addChainDownloadStartedEventListener(executorMock, chainDownloadStartedEventListenerMock);
            //Act Statement(s)
            target.addChainDownloadStartedEventListener(chainDownloadStartedEventListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            verify(target).addChainDownloadStartedEventListener(executorMock, chainDownloadStartedEventListenerMock);
        }
    }

    //Sapient generated method id: ${5827ffa3-910a-3344-b3c1-185c12bd5c8e}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void addChainDownloadStartedEventListener1WhenGetPendingPeersIsNotEmpty() {
        /* Branches:
         * (for-each(getConnectedPeers())) : true
         * (for-each(getPendingPeers())) : true
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        Peer peerMock = mock(Peer.class);
        Executor executorMock = mock(Executor.class);
        ChainDownloadStartedEventListener chainDownloadStartedEventListenerMock = mock(ChainDownloadStartedEventListener.class);
        Peer peerMock2 = mock(Peer.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Peer> peerList = new ArrayList<>();
            peerList.add(peerMock);
            doReturn(peerList).when(target).getConnectedPeers();
            doNothing().when(peerMock).addChainDownloadStartedEventListener(executorMock, chainDownloadStartedEventListenerMock);
            List<Peer> peerList2 = new ArrayList<>();
            peerList2.add(peerMock2);
            doReturn(peerList2).when(target).getPendingPeers();
            doNothing().when(peerMock2).addChainDownloadStartedEventListener(executorMock, chainDownloadStartedEventListenerMock);
            //Act Statement(s)
            target.addChainDownloadStartedEventListener(executorMock, chainDownloadStartedEventListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            verify(target).getConnectedPeers();
            verify(peerMock).addChainDownloadStartedEventListener(executorMock, chainDownloadStartedEventListenerMock);
            verify(target).getPendingPeers();
            verify(peerMock2).addChainDownloadStartedEventListener(executorMock, chainDownloadStartedEventListenerMock);
        }
    }

    //Sapient generated method id: ${551c84dc-3cfa-36cf-9cd9-0a39cdbeebcb}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void addConnectedEventListenerTest() {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        Executor executorMock = mock(Executor.class);
        PeerConnectedEventListener peerConnectedEventListenerMock = mock(PeerConnectedEventListener.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).addConnectedEventListener(executorMock, peerConnectedEventListenerMock);
            //Act Statement(s)
            target.addConnectedEventListener(peerConnectedEventListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            verify(target).addConnectedEventListener(executorMock, peerConnectedEventListenerMock);
        }
    }

    //Sapient generated method id: ${67f363d7-fd5a-331b-981b-a0674315fbf6}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void addConnectedEventListener1WhenGetPendingPeersIsNotEmpty() {
        /* Branches:
         * (for-each(getConnectedPeers())) : true
         * (for-each(getPendingPeers())) : true
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        Peer peerMock = mock(Peer.class);
        Executor executorMock = mock(Executor.class);
        PeerConnectedEventListener peerConnectedEventListenerMock = mock(PeerConnectedEventListener.class);
        Peer peerMock2 = mock(Peer.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Peer> peerList = new ArrayList<>();
            peerList.add(peerMock);
            doReturn(peerList).when(target).getConnectedPeers();
            doNothing().when(peerMock).addConnectedEventListener(executorMock, peerConnectedEventListenerMock);
            List<Peer> peerList2 = new ArrayList<>();
            peerList2.add(peerMock2);
            doReturn(peerList2).when(target).getPendingPeers();
            doNothing().when(peerMock2).addConnectedEventListener(executorMock, peerConnectedEventListenerMock);
            //Act Statement(s)
            target.addConnectedEventListener(executorMock, peerConnectedEventListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            verify(target).getConnectedPeers();
            verify(peerMock).addConnectedEventListener(executorMock, peerConnectedEventListenerMock);
            verify(target).getPendingPeers();
            verify(peerMock2).addConnectedEventListener(executorMock, peerConnectedEventListenerMock);
        }
    }

    //Sapient generated method id: ${559dc831-c890-3f1d-ad16-2e8e52a4ee44}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void addDisconnectedEventListenerTest() {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        Executor executorMock = mock(Executor.class);
        PeerDisconnectedEventListener peerDisconnectedEventListenerMock = mock(PeerDisconnectedEventListener.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).addDisconnectedEventListener(executorMock, peerDisconnectedEventListenerMock);
            //Act Statement(s)
            target.addDisconnectedEventListener(peerDisconnectedEventListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            verify(target).addDisconnectedEventListener(executorMock, peerDisconnectedEventListenerMock);
        }
    }

    //Sapient generated method id: ${72082d6c-f76a-38e0-952a-0dde856f6d1a}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void addDisconnectedEventListener1WhenGetPendingPeersIsNotEmpty() {
        /* Branches:
         * (for-each(getConnectedPeers())) : true
         * (for-each(getPendingPeers())) : true
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        Peer peerMock = mock(Peer.class);
        Executor executorMock = mock(Executor.class);
        PeerDisconnectedEventListener peerDisconnectedEventListenerMock = mock(PeerDisconnectedEventListener.class);
        Peer peerMock2 = mock(Peer.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Peer> peerList = new ArrayList<>();
            peerList.add(peerMock);
            doReturn(peerList).when(target).getConnectedPeers();
            doNothing().when(peerMock).addDisconnectedEventListener(executorMock, peerDisconnectedEventListenerMock);
            List<Peer> peerList2 = new ArrayList<>();
            peerList2.add(peerMock2);
            doReturn(peerList2).when(target).getPendingPeers();
            doNothing().when(peerMock2).addDisconnectedEventListener(executorMock, peerDisconnectedEventListenerMock);
            //Act Statement(s)
            target.addDisconnectedEventListener(executorMock, peerDisconnectedEventListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            verify(target).getConnectedPeers();
            verify(peerMock).addDisconnectedEventListener(executorMock, peerDisconnectedEventListenerMock);
            verify(target).getPendingPeers();
            verify(peerMock2).addDisconnectedEventListener(executorMock, peerDisconnectedEventListenerMock);
        }
    }

    //Sapient generated method id: ${36cf38b3-d373-3673-bb85-18cfb8797309}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void addDiscoveredEventListenerTest() {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        Executor executorMock = mock(Executor.class);
        PeerDiscoveredEventListener peerDiscoveredEventListenerMock = mock(PeerDiscoveredEventListener.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).addDiscoveredEventListener(executorMock, peerDiscoveredEventListenerMock);
            //Act Statement(s)
            target.addDiscoveredEventListener(peerDiscoveredEventListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            verify(target).addDiscoveredEventListener(executorMock, peerDiscoveredEventListenerMock);
        }
    }

    //Sapient generated method id: ${d4bf8154-d870-32ff-82ab-6903dc65d173}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void addDiscoveredEventListener1Test() {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        Executor executorMock = mock(Executor.class);
        PeerDiscoveredEventListener peerDiscoveredEventListenerMock = mock(PeerDiscoveredEventListener.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.addDiscoveredEventListener(executorMock, peerDiscoveredEventListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
        }
    }

    //Sapient generated method id: ${4cd1dec5-33aa-3127-a1c4-c5d7aa3f1524}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void addGetDataEventListenerTest() {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        Executor executorMock = mock(Executor.class);
        GetDataEventListener getDataEventListenerMock = mock(GetDataEventListener.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).addGetDataEventListener(executorMock, getDataEventListenerMock);
            //Act Statement(s)
            target.addGetDataEventListener(getDataEventListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            verify(target).addGetDataEventListener(executorMock, getDataEventListenerMock);
        }
    }

    //Sapient generated method id: ${80bbf267-e8d5-3730-9b98-e9a8bbf44e9d}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void addGetDataEventListener1WhenGetPendingPeersIsNotEmpty() {
        /* Branches:
         * (for-each(getConnectedPeers())) : true
         * (for-each(getPendingPeers())) : true
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        Peer peerMock = mock(Peer.class);
        Executor executorMock = mock(Executor.class);
        GetDataEventListener getDataEventListenerMock = mock(GetDataEventListener.class);
        Peer peerMock2 = mock(Peer.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Peer> peerList = new ArrayList<>();
            peerList.add(peerMock);
            doReturn(peerList).when(target).getConnectedPeers();
            doNothing().when(peerMock).addGetDataEventListener(executorMock, getDataEventListenerMock);
            List<Peer> peerList2 = new ArrayList<>();
            peerList2.add(peerMock2);
            doReturn(peerList2).when(target).getPendingPeers();
            doNothing().when(peerMock2).addGetDataEventListener(executorMock, getDataEventListenerMock);
            //Act Statement(s)
            target.addGetDataEventListener(executorMock, getDataEventListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            verify(target).getConnectedPeers();
            verify(peerMock).addGetDataEventListener(executorMock, getDataEventListenerMock);
            verify(target).getPendingPeers();
            verify(peerMock2).addGetDataEventListener(executorMock, getDataEventListenerMock);
        }
    }

    //Sapient generated method id: ${fa4a053c-3288-3757-bf2a-9bd35587f295}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void addOnTransactionBroadcastListenerTest() {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        Executor executorMock = mock(Executor.class);
        OnTransactionBroadcastListener onTransactionBroadcastListenerMock = mock(OnTransactionBroadcastListener.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).addOnTransactionBroadcastListener(executorMock, onTransactionBroadcastListenerMock);
            //Act Statement(s)
            target.addOnTransactionBroadcastListener(onTransactionBroadcastListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            verify(target).addOnTransactionBroadcastListener(executorMock, onTransactionBroadcastListenerMock);
        }
    }

    //Sapient generated method id: ${f1254035-251b-3540-bb40-b89df80b34b9}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void addOnTransactionBroadcastListener1WhenGetPendingPeersIsNotEmpty() {
        /* Branches:
         * (for-each(getConnectedPeers())) : true
         * (for-each(getPendingPeers())) : true
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        Peer peerMock = mock(Peer.class);
        Executor executorMock = mock(Executor.class);
        OnTransactionBroadcastListener onTransactionBroadcastListenerMock = mock(OnTransactionBroadcastListener.class);
        Peer peerMock2 = mock(Peer.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Peer> peerList = new ArrayList<>();
            peerList.add(peerMock);
            doReturn(peerList).when(target).getConnectedPeers();
            doNothing().when(peerMock).addOnTransactionBroadcastListener(executorMock, onTransactionBroadcastListenerMock);
            List<Peer> peerList2 = new ArrayList<>();
            peerList2.add(peerMock2);
            doReturn(peerList2).when(target).getPendingPeers();
            doNothing().when(peerMock2).addOnTransactionBroadcastListener(executorMock, onTransactionBroadcastListenerMock);
            //Act Statement(s)
            target.addOnTransactionBroadcastListener(executorMock, onTransactionBroadcastListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            verify(target).getConnectedPeers();
            verify(peerMock).addOnTransactionBroadcastListener(executorMock, onTransactionBroadcastListenerMock);
            verify(target).getPendingPeers();
            verify(peerMock2).addOnTransactionBroadcastListener(executorMock, onTransactionBroadcastListenerMock);
        }
    }

    //Sapient generated method id: ${d6c619a0-0eb3-3165-9522-25eb00b3cf25}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void addPreMessageReceivedEventListenerTest() {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        Executor executorMock = mock(Executor.class);
        PreMessageReceivedEventListener preMessageReceivedEventListenerMock = mock(PreMessageReceivedEventListener.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).addPreMessageReceivedEventListener(executorMock, preMessageReceivedEventListenerMock);
            //Act Statement(s)
            target.addPreMessageReceivedEventListener(preMessageReceivedEventListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            verify(target).addPreMessageReceivedEventListener(executorMock, preMessageReceivedEventListenerMock);
        }
    }

    //Sapient generated method id: ${e27a5a36-5597-3d29-90bb-7406d45bc035}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void addPreMessageReceivedEventListener1WhenGetPendingPeersIsNotEmpty() {
        /* Branches:
         * (for-each(getConnectedPeers())) : true
         * (for-each(getPendingPeers())) : true
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        Peer peerMock = mock(Peer.class);
        Executor executorMock = mock(Executor.class);
        PreMessageReceivedEventListener preMessageReceivedEventListenerMock = mock(PreMessageReceivedEventListener.class);
        Peer peerMock2 = mock(Peer.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Peer> peerList = new ArrayList<>();
            peerList.add(peerMock);
            doReturn(peerList).when(target).getConnectedPeers();
            doNothing().when(peerMock).addPreMessageReceivedEventListener(executorMock, preMessageReceivedEventListenerMock);
            List<Peer> peerList2 = new ArrayList<>();
            peerList2.add(peerMock2);
            doReturn(peerList2).when(target).getPendingPeers();
            doNothing().when(peerMock2).addPreMessageReceivedEventListener(executorMock, preMessageReceivedEventListenerMock);
            //Act Statement(s)
            target.addPreMessageReceivedEventListener(executorMock, preMessageReceivedEventListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            verify(target).getConnectedPeers();
            verify(peerMock).addPreMessageReceivedEventListener(executorMock, preMessageReceivedEventListenerMock);
            verify(target).getPendingPeers();
            verify(peerMock2).addPreMessageReceivedEventListener(executorMock, preMessageReceivedEventListenerMock);
        }
    }

    //Sapient generated method id: ${863c2c9f-1e4a-3af4-adf0-09e324146bb0}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void removeBlocksDownloadedEventListenerWhenResult() {
        /* Branches:
         * (for-each(getConnectedPeers())) : true
         * (for-each(getPendingPeers())) : true
         * (result) : true
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        BlocksDownloadedEventListener blocksDownloadedEventListenerMock = mock(BlocksDownloadedEventListener.class);
        Peer peerMock = mock(Peer.class);
        Peer peerMock2 = mock(Peer.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(blocksDownloadedEventListenerMock), any())).thenReturn(true);
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Peer> peerList = new ArrayList<>();
            peerList.add(peerMock);
            doReturn(peerList).when(target).getConnectedPeers();
            doReturn(false).when(peerMock).removeBlocksDownloadedEventListener(blocksDownloadedEventListenerMock);
            List<Peer> peerList2 = new ArrayList<>();
            peerList2.add(peerMock2);
            doReturn(peerList2).when(target).getPendingPeers();
            doReturn(false).when(peerMock2).removeBlocksDownloadedEventListener(blocksDownloadedEventListenerMock);
            //Act Statement(s)
            boolean result = target.removeBlocksDownloadedEventListener(blocksDownloadedEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(blocksDownloadedEventListenerMock), any()));
            verify(target).getConnectedPeers();
            verify(peerMock).removeBlocksDownloadedEventListener(blocksDownloadedEventListenerMock);
            verify(target).getPendingPeers();
            verify(peerMock2).removeBlocksDownloadedEventListener(blocksDownloadedEventListenerMock);
        }
    }

    //Sapient generated method id: ${1f4269cd-8504-3847-828c-56a88d825f72}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void removeBlocksDownloadedEventListenerWhenNotResult() {
        /* Branches:
         * (for-each(getConnectedPeers())) : true
         * (for-each(getPendingPeers())) : true
         * (result) : false
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        BlocksDownloadedEventListener blocksDownloadedEventListenerMock = mock(BlocksDownloadedEventListener.class);
        Peer peerMock = mock(Peer.class);
        Peer peerMock2 = mock(Peer.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(blocksDownloadedEventListenerMock), any())).thenReturn(false);
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Peer> peerList = new ArrayList<>();
            peerList.add(peerMock);
            doReturn(peerList).when(target).getConnectedPeers();
            doReturn(false).when(peerMock).removeBlocksDownloadedEventListener(blocksDownloadedEventListenerMock);
            List<Peer> peerList2 = new ArrayList<>();
            peerList2.add(peerMock2);
            doReturn(peerList2).when(target).getPendingPeers();
            doReturn(false).when(peerMock2).removeBlocksDownloadedEventListener(blocksDownloadedEventListenerMock);
            //Act Statement(s)
            boolean result = target.removeBlocksDownloadedEventListener(blocksDownloadedEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(blocksDownloadedEventListenerMock), any()));
            verify(target).getConnectedPeers();
            verify(peerMock).removeBlocksDownloadedEventListener(blocksDownloadedEventListenerMock);
            verify(target).getPendingPeers();
            verify(peerMock2).removeBlocksDownloadedEventListener(blocksDownloadedEventListenerMock);
        }
    }

    //Sapient generated method id: ${661e71ae-b95a-32e0-be72-a0992d64b79e}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void removeChainDownloadStartedEventListenerWhenResult() {
        /* Branches:
         * (for-each(getConnectedPeers())) : true
         * (for-each(getPendingPeers())) : true
         * (result) : true
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        ChainDownloadStartedEventListener chainDownloadStartedEventListenerMock = mock(ChainDownloadStartedEventListener.class);
        Peer peerMock = mock(Peer.class);
        Peer peerMock2 = mock(Peer.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(chainDownloadStartedEventListenerMock), any())).thenReturn(true);
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Peer> peerList = new ArrayList<>();
            peerList.add(peerMock);
            doReturn(peerList).when(target).getConnectedPeers();
            doReturn(false).when(peerMock).removeChainDownloadStartedEventListener(chainDownloadStartedEventListenerMock);
            List<Peer> peerList2 = new ArrayList<>();
            peerList2.add(peerMock2);
            doReturn(peerList2).when(target).getPendingPeers();
            doReturn(false).when(peerMock2).removeChainDownloadStartedEventListener(chainDownloadStartedEventListenerMock);
            //Act Statement(s)
            boolean result = target.removeChainDownloadStartedEventListener(chainDownloadStartedEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(chainDownloadStartedEventListenerMock), any()));
            verify(target).getConnectedPeers();
            verify(peerMock).removeChainDownloadStartedEventListener(chainDownloadStartedEventListenerMock);
            verify(target).getPendingPeers();
            verify(peerMock2).removeChainDownloadStartedEventListener(chainDownloadStartedEventListenerMock);
        }
    }

    //Sapient generated method id: ${4fa3699b-1b8d-32e7-8bce-d2cc70485096}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void removeChainDownloadStartedEventListenerWhenNotResult() {
        /* Branches:
         * (for-each(getConnectedPeers())) : true
         * (for-each(getPendingPeers())) : true
         * (result) : false
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        ChainDownloadStartedEventListener chainDownloadStartedEventListenerMock = mock(ChainDownloadStartedEventListener.class);
        Peer peerMock = mock(Peer.class);
        Peer peerMock2 = mock(Peer.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(chainDownloadStartedEventListenerMock), any())).thenReturn(false);
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Peer> peerList = new ArrayList<>();
            peerList.add(peerMock);
            doReturn(peerList).when(target).getConnectedPeers();
            doReturn(false).when(peerMock).removeChainDownloadStartedEventListener(chainDownloadStartedEventListenerMock);
            List<Peer> peerList2 = new ArrayList<>();
            peerList2.add(peerMock2);
            doReturn(peerList2).when(target).getPendingPeers();
            doReturn(false).when(peerMock2).removeChainDownloadStartedEventListener(chainDownloadStartedEventListenerMock);
            //Act Statement(s)
            boolean result = target.removeChainDownloadStartedEventListener(chainDownloadStartedEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(chainDownloadStartedEventListenerMock), any()));
            verify(target).getConnectedPeers();
            verify(peerMock).removeChainDownloadStartedEventListener(chainDownloadStartedEventListenerMock);
            verify(target).getPendingPeers();
            verify(peerMock2).removeChainDownloadStartedEventListener(chainDownloadStartedEventListenerMock);
        }
    }

    //Sapient generated method id: ${2555eef3-cc1d-3b14-99ca-4f9bd99af158}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void removeConnectedEventListenerWhenResult() {
        /* Branches:
         * (for-each(getConnectedPeers())) : true
         * (for-each(getPendingPeers())) : true
         * (result) : true
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        PeerConnectedEventListener peerConnectedEventListenerMock = mock(PeerConnectedEventListener.class);
        Peer peerMock = mock(Peer.class);
        Peer peerMock2 = mock(Peer.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(peerConnectedEventListenerMock), any())).thenReturn(true);
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Peer> peerList = new ArrayList<>();
            peerList.add(peerMock);
            doReturn(peerList).when(target).getConnectedPeers();
            doReturn(false).when(peerMock).removeConnectedEventListener(peerConnectedEventListenerMock);
            List<Peer> peerList2 = new ArrayList<>();
            peerList2.add(peerMock2);
            doReturn(peerList2).when(target).getPendingPeers();
            doReturn(false).when(peerMock2).removeConnectedEventListener(peerConnectedEventListenerMock);
            //Act Statement(s)
            boolean result = target.removeConnectedEventListener(peerConnectedEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(peerConnectedEventListenerMock), any()));
            verify(target).getConnectedPeers();
            verify(peerMock).removeConnectedEventListener(peerConnectedEventListenerMock);
            verify(target).getPendingPeers();
            verify(peerMock2).removeConnectedEventListener(peerConnectedEventListenerMock);
        }
    }

    //Sapient generated method id: ${b4e66288-0940-3018-a8fb-a326fc0c2770}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void removeConnectedEventListenerWhenNotResult() {
        /* Branches:
         * (for-each(getConnectedPeers())) : true
         * (for-each(getPendingPeers())) : true
         * (result) : false
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        PeerConnectedEventListener peerConnectedEventListenerMock = mock(PeerConnectedEventListener.class);
        Peer peerMock = mock(Peer.class);
        Peer peerMock2 = mock(Peer.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(peerConnectedEventListenerMock), any())).thenReturn(false);
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Peer> peerList = new ArrayList<>();
            peerList.add(peerMock);
            doReturn(peerList).when(target).getConnectedPeers();
            doReturn(false).when(peerMock).removeConnectedEventListener(peerConnectedEventListenerMock);
            List<Peer> peerList2 = new ArrayList<>();
            peerList2.add(peerMock2);
            doReturn(peerList2).when(target).getPendingPeers();
            doReturn(false).when(peerMock2).removeConnectedEventListener(peerConnectedEventListenerMock);
            //Act Statement(s)
            boolean result = target.removeConnectedEventListener(peerConnectedEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(peerConnectedEventListenerMock), any()));
            verify(target).getConnectedPeers();
            verify(peerMock).removeConnectedEventListener(peerConnectedEventListenerMock);
            verify(target).getPendingPeers();
            verify(peerMock2).removeConnectedEventListener(peerConnectedEventListenerMock);
        }
    }

    //Sapient generated method id: ${093a1a63-e865-36b6-9f87-44997902164a}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void removeDisconnectedEventListenerWhenResult() {
        /* Branches:
         * (for-each(getConnectedPeers())) : true
         * (for-each(getPendingPeers())) : true
         * (result) : true
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        PeerDisconnectedEventListener peerDisconnectedEventListenerMock = mock(PeerDisconnectedEventListener.class);
        Peer peerMock = mock(Peer.class);
        Peer peerMock2 = mock(Peer.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(peerDisconnectedEventListenerMock), any())).thenReturn(true);
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Peer> peerList = new ArrayList<>();
            peerList.add(peerMock);
            doReturn(peerList).when(target).getConnectedPeers();
            doReturn(false).when(peerMock).removeDisconnectedEventListener(peerDisconnectedEventListenerMock);
            List<Peer> peerList2 = new ArrayList<>();
            peerList2.add(peerMock2);
            doReturn(peerList2).when(target).getPendingPeers();
            doReturn(false).when(peerMock2).removeDisconnectedEventListener(peerDisconnectedEventListenerMock);
            //Act Statement(s)
            boolean result = target.removeDisconnectedEventListener(peerDisconnectedEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(peerDisconnectedEventListenerMock), any()));
            verify(target).getConnectedPeers();
            verify(peerMock).removeDisconnectedEventListener(peerDisconnectedEventListenerMock);
            verify(target).getPendingPeers();
            verify(peerMock2).removeDisconnectedEventListener(peerDisconnectedEventListenerMock);
        }
    }

    //Sapient generated method id: ${1ad12ef9-fde0-3d76-b5e2-d757fe5be5e8}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void removeDisconnectedEventListenerWhenNotResult() {
        /* Branches:
         * (for-each(getConnectedPeers())) : true
         * (for-each(getPendingPeers())) : true
         * (result) : false
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        PeerDisconnectedEventListener peerDisconnectedEventListenerMock = mock(PeerDisconnectedEventListener.class);
        Peer peerMock = mock(Peer.class);
        Peer peerMock2 = mock(Peer.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(peerDisconnectedEventListenerMock), any())).thenReturn(false);
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Peer> peerList = new ArrayList<>();
            peerList.add(peerMock);
            doReturn(peerList).when(target).getConnectedPeers();
            doReturn(false).when(peerMock).removeDisconnectedEventListener(peerDisconnectedEventListenerMock);
            List<Peer> peerList2 = new ArrayList<>();
            peerList2.add(peerMock2);
            doReturn(peerList2).when(target).getPendingPeers();
            doReturn(false).when(peerMock2).removeDisconnectedEventListener(peerDisconnectedEventListenerMock);
            //Act Statement(s)
            boolean result = target.removeDisconnectedEventListener(peerDisconnectedEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(peerDisconnectedEventListenerMock), any()));
            verify(target).getConnectedPeers();
            verify(peerMock).removeDisconnectedEventListener(peerDisconnectedEventListenerMock);
            verify(target).getPendingPeers();
            verify(peerMock2).removeDisconnectedEventListener(peerDisconnectedEventListenerMock);
        }
    }

    //Sapient generated method id: ${e45ff909-c466-3ad4-b84f-99cc3029de5f}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void removeDiscoveredEventListenerWhenResult() {
        /* Branches:
         * (result) : true
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        PeerDiscoveredEventListener peerDiscoveredEventListenerMock = mock(PeerDiscoveredEventListener.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(peerDiscoveredEventListenerMock), any())).thenReturn(true);
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.removeDiscoveredEventListener(peerDiscoveredEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(peerDiscoveredEventListenerMock), any()));
        }
    }

    //Sapient generated method id: ${da275b73-6b81-34f4-9095-589d225f881e}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void removeDiscoveredEventListenerWhenNotResult() {
        /* Branches:
         * (result) : false
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        PeerDiscoveredEventListener peerDiscoveredEventListenerMock = mock(PeerDiscoveredEventListener.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(peerDiscoveredEventListenerMock), any())).thenReturn(false);
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.removeDiscoveredEventListener(peerDiscoveredEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(peerDiscoveredEventListenerMock), any()));
        }
    }

    //Sapient generated method id: ${8b63a6f0-138b-37b0-b42c-76a5d72330f2}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void removeGetDataEventListenerWhenResult() {
        /* Branches:
         * (for-each(getConnectedPeers())) : true
         * (for-each(getPendingPeers())) : true
         * (result) : true
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        GetDataEventListener getDataEventListenerMock = mock(GetDataEventListener.class);
        Peer peerMock = mock(Peer.class);
        Peer peerMock2 = mock(Peer.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(getDataEventListenerMock), any())).thenReturn(true);
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Peer> peerList = new ArrayList<>();
            peerList.add(peerMock);
            doReturn(peerList).when(target).getConnectedPeers();
            doReturn(false).when(peerMock).removeGetDataEventListener(getDataEventListenerMock);
            List<Peer> peerList2 = new ArrayList<>();
            peerList2.add(peerMock2);
            doReturn(peerList2).when(target).getPendingPeers();
            doReturn(false).when(peerMock2).removeGetDataEventListener(getDataEventListenerMock);
            //Act Statement(s)
            boolean result = target.removeGetDataEventListener(getDataEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(getDataEventListenerMock), any()));
            verify(target).getConnectedPeers();
            verify(peerMock).removeGetDataEventListener(getDataEventListenerMock);
            verify(target).getPendingPeers();
            verify(peerMock2).removeGetDataEventListener(getDataEventListenerMock);
        }
    }

    //Sapient generated method id: ${04157772-a19f-30ff-a5d4-afc2f3fc9932}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void removeGetDataEventListenerWhenNotResult() {
        /* Branches:
         * (for-each(getConnectedPeers())) : true
         * (for-each(getPendingPeers())) : true
         * (result) : false
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        GetDataEventListener getDataEventListenerMock = mock(GetDataEventListener.class);
        Peer peerMock = mock(Peer.class);
        Peer peerMock2 = mock(Peer.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(getDataEventListenerMock), any())).thenReturn(false);
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Peer> peerList = new ArrayList<>();
            peerList.add(peerMock);
            doReturn(peerList).when(target).getConnectedPeers();
            doReturn(false).when(peerMock).removeGetDataEventListener(getDataEventListenerMock);
            List<Peer> peerList2 = new ArrayList<>();
            peerList2.add(peerMock2);
            doReturn(peerList2).when(target).getPendingPeers();
            doReturn(false).when(peerMock2).removeGetDataEventListener(getDataEventListenerMock);
            //Act Statement(s)
            boolean result = target.removeGetDataEventListener(getDataEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(getDataEventListenerMock), any()));
            verify(target).getConnectedPeers();
            verify(peerMock).removeGetDataEventListener(getDataEventListenerMock);
            verify(target).getPendingPeers();
            verify(peerMock2).removeGetDataEventListener(getDataEventListenerMock);
        }
    }

    //Sapient generated method id: ${66c8b409-ad71-32f3-9cd9-eb5e57edca68}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void removeOnTransactionBroadcastListenerWhenResult() {
        /* Branches:
         * (for-each(getConnectedPeers())) : true
         * (for-each(getPendingPeers())) : true
         * (result) : true
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        OnTransactionBroadcastListener onTransactionBroadcastListenerMock = mock(OnTransactionBroadcastListener.class);
        Peer peerMock = mock(Peer.class);
        Peer peerMock2 = mock(Peer.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(onTransactionBroadcastListenerMock), any())).thenReturn(true);
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Peer> peerList = new ArrayList<>();
            peerList.add(peerMock);
            doReturn(peerList).when(target).getConnectedPeers();
            doReturn(false).when(peerMock).removeOnTransactionBroadcastListener(onTransactionBroadcastListenerMock);
            List<Peer> peerList2 = new ArrayList<>();
            peerList2.add(peerMock2);
            doReturn(peerList2).when(target).getPendingPeers();
            doReturn(false).when(peerMock2).removeOnTransactionBroadcastListener(onTransactionBroadcastListenerMock);
            //Act Statement(s)
            boolean result = target.removeOnTransactionBroadcastListener(onTransactionBroadcastListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(onTransactionBroadcastListenerMock), any()));
            verify(target).getConnectedPeers();
            verify(peerMock).removeOnTransactionBroadcastListener(onTransactionBroadcastListenerMock);
            verify(target).getPendingPeers();
            verify(peerMock2).removeOnTransactionBroadcastListener(onTransactionBroadcastListenerMock);
        }
    }

    //Sapient generated method id: ${01c3fcae-8bb5-34bc-bd03-c6919fed771b}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void removeOnTransactionBroadcastListenerWhenNotResult() {
        /* Branches:
         * (for-each(getConnectedPeers())) : true
         * (for-each(getPendingPeers())) : true
         * (result) : false
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        OnTransactionBroadcastListener onTransactionBroadcastListenerMock = mock(OnTransactionBroadcastListener.class);
        Peer peerMock = mock(Peer.class);
        Peer peerMock2 = mock(Peer.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(onTransactionBroadcastListenerMock), any())).thenReturn(false);
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Peer> peerList = new ArrayList<>();
            peerList.add(peerMock);
            doReturn(peerList).when(target).getConnectedPeers();
            doReturn(false).when(peerMock).removeOnTransactionBroadcastListener(onTransactionBroadcastListenerMock);
            List<Peer> peerList2 = new ArrayList<>();
            peerList2.add(peerMock2);
            doReturn(peerList2).when(target).getPendingPeers();
            doReturn(false).when(peerMock2).removeOnTransactionBroadcastListener(onTransactionBroadcastListenerMock);
            //Act Statement(s)
            boolean result = target.removeOnTransactionBroadcastListener(onTransactionBroadcastListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(onTransactionBroadcastListenerMock), any()));
            verify(target).getConnectedPeers();
            verify(peerMock).removeOnTransactionBroadcastListener(onTransactionBroadcastListenerMock);
            verify(target).getPendingPeers();
            verify(peerMock2).removeOnTransactionBroadcastListener(onTransactionBroadcastListenerMock);
        }
    }

    //Sapient generated method id: ${fbff221f-de10-3218-9c1f-4f533ddb7a88}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void removePreMessageReceivedEventListenerWhenResult() {
        /* Branches:
         * (for-each(getConnectedPeers())) : true
         * (for-each(getPendingPeers())) : true
         * (result) : true
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        PreMessageReceivedEventListener preMessageReceivedEventListenerMock = mock(PreMessageReceivedEventListener.class);
        Peer peerMock = mock(Peer.class);
        Peer peerMock2 = mock(Peer.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(preMessageReceivedEventListenerMock), any())).thenReturn(true);
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Peer> peerList = new ArrayList<>();
            peerList.add(peerMock);
            doReturn(peerList).when(target).getConnectedPeers();
            doReturn(false).when(peerMock).removePreMessageReceivedEventListener(preMessageReceivedEventListenerMock);
            List<Peer> peerList2 = new ArrayList<>();
            peerList2.add(peerMock2);
            doReturn(peerList2).when(target).getPendingPeers();
            doReturn(false).when(peerMock2).removePreMessageReceivedEventListener(preMessageReceivedEventListenerMock);
            //Act Statement(s)
            boolean result = target.removePreMessageReceivedEventListener(preMessageReceivedEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(preMessageReceivedEventListenerMock), any()));
            verify(target).getConnectedPeers();
            verify(peerMock).removePreMessageReceivedEventListener(preMessageReceivedEventListenerMock);
            verify(target).getPendingPeers();
            verify(peerMock2).removePreMessageReceivedEventListener(preMessageReceivedEventListenerMock);
        }
    }

    //Sapient generated method id: ${81be7049-f565-373e-ae13-57ec5050adcd}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void removePreMessageReceivedEventListenerWhenNotResult() {
        /* Branches:
         * (for-each(getConnectedPeers())) : true
         * (for-each(getPendingPeers())) : true
         * (result) : false
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        PreMessageReceivedEventListener preMessageReceivedEventListenerMock = mock(PreMessageReceivedEventListener.class);
        Peer peerMock = mock(Peer.class);
        Peer peerMock2 = mock(Peer.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(preMessageReceivedEventListenerMock), any())).thenReturn(false);
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Peer> peerList = new ArrayList<>();
            peerList.add(peerMock);
            doReturn(peerList).when(target).getConnectedPeers();
            doReturn(false).when(peerMock).removePreMessageReceivedEventListener(preMessageReceivedEventListenerMock);
            List<Peer> peerList2 = new ArrayList<>();
            peerList2.add(peerMock2);
            doReturn(peerList2).when(target).getPendingPeers();
            doReturn(false).when(peerMock2).removePreMessageReceivedEventListener(preMessageReceivedEventListenerMock);
            //Act Statement(s)
            boolean result = target.removePreMessageReceivedEventListener(preMessageReceivedEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(preMessageReceivedEventListenerMock), any()));
            verify(target).getConnectedPeers();
            verify(peerMock).removePreMessageReceivedEventListener(preMessageReceivedEventListenerMock);
            verify(target).getPendingPeers();
            verify(peerMock2).removePreMessageReceivedEventListener(preMessageReceivedEventListenerMock);
        }
    }

    //Sapient generated method id: ${593e590c-e3b6-3c14-a6bc-0cdd9702383f}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void getConnectedPeersTest() {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            List<Peer> result = target.getConnectedPeers();
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
        }
    }

    //Sapient generated method id: ${2701ecc1-cf90-3fa4-a8e3-77ac82267edf}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void getPendingPeersTest() {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            List<Peer> result = target.getPendingPeers();
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
        }
    }

    //Sapient generated method id: ${5b004286-994d-3a7c-8b07-af8074a341ed}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void addAddressTest() {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).addAddress(peerAddressMock, 0);
            //Act Statement(s)
            target.addAddress(peerAddressMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            verify(target).addAddress(peerAddressMock, 0);
        }
    }

    //Sapient generated method id: ${959a0c86-6271-303a-aaf2-9f314b4cfdd2}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void addAddress1WhenIsRunningNot() {
        /* Branches:
         * (backoffMap.containsKey(peerAddress)) : false  #  inside addInactive method
         * (priority != 0) : true  #  inside addInactive method
         * (addInactive(peerAddress, priority)) : true
         * (!isRunning()) : true  #  inside setMaxConnections method
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(false).when(target).isRunning();
            //Act Statement(s)
            target.addAddress(peerAddressMock, 1);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            verify(target).isRunning();
        }
    }

    //Sapient generated method id: ${d6bb3378-ef23-3781-88a4-267eb2e99eff}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void addAddress1WhenAdjustmentLessThan0() {
        /* Branches:
         * (backoffMap.containsKey(peerAddress)) : false  #  inside addInactive method
         * (priority != 0) : true  #  inside addInactive method
         * (addInactive(peerAddress, priority)) : true
         * (!isRunning()) : false  #  inside setMaxConnections method
         * (adjustment > 0) : false  #  inside setMaxConnections method
         * (adjustment < 0) : true  #  inside setMaxConnections method
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(true).when(target).isRunning();
            doReturn(2).when(channelsMock).getConnectedClientCount();
            doNothing().when(channelsMock).closeConnections(1);
            //Act Statement(s)
            target.addAddress(peerAddressMock, 1);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            verify(target).isRunning();
            verify(channelsMock).getConnectedClientCount();
            verify(channelsMock).closeConnections(1);
        }
    }

    //Sapient generated method id: ${36f6bec6-1c3d-364e-bd52-6dfa7bc9b24a}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void addAddress1WhenExecutorNotIsShutdownAndAdjustmentNotLessThan0() {
        /* Branches:
         * (backoffMap.containsKey(peerAddress)) : false  #  inside addInactive method
         * (priority != 0) : true  #  inside addInactive method
         * (addInactive(peerAddress, priority)) : true
         * (!isRunning()) : false  #  inside setMaxConnections method
         * (adjustment > 0) : true  #  inside setMaxConnections method
         * (!executor.isShutdown()) : true  #  inside triggerConnections method
         * (adjustment < 0) : false  #  inside setMaxConnections method
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(true).when(target).isRunning();
            doReturn(0).when(channelsMock).getConnectedClientCount();
            //Act Statement(s)
            target.addAddress(peerAddressMock, 1);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            verify(target).isRunning();
            verify(channelsMock).getConnectedClientCount();
        }
    }

    //Sapient generated method id: ${3817319b-a907-3403-b1f2-9940cac786cf}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void setRequiredServicesTest() {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        MultiplexingDiscovery multiplexingDiscoveryMock = mock(MultiplexingDiscovery.class);
        Network networkMock2 = mock(Network.class);
        try (MockedStatic<MultiplexingDiscovery> multiplexingDiscovery = mockStatic(MultiplexingDiscovery.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            multiplexingDiscovery.when(() -> MultiplexingDiscovery.forServices(networkMock2, 0L)).thenReturn(multiplexingDiscoveryMock);
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(networkMock2).when(paramsMock).network();
            doNothing().when(target).addPeerDiscovery(multiplexingDiscoveryMock);
            //Act Statement(s)
            target.setRequiredServices(0L);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            multiplexingDiscovery.verify(() -> MultiplexingDiscovery.forServices(networkMock2, 0L), atLeast(1));
            verify(paramsMock).network();
            verify(target).addPeerDiscovery(multiplexingDiscoveryMock);
        }
    }

    //Sapient generated method id: ${5b8244f7-7b3c-3fb7-b1df-1c1505a4f5f6}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void addAddress2Test() {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<PeerAddress> peerAddress = mockStatic(PeerAddress.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            peerAddress.when(() -> PeerAddress.simple((InetAddress) any(), eq(0))).thenReturn(peerAddressMock);
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(0).when(paramsMock).getPort();
            doNothing().when(target).addAddress(peerAddressMock);
            InetAddress inetAddress = InetAddress.getLoopbackAddress();
            //Act Statement(s)
            target.addAddress(inetAddress);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            peerAddress.verify(() -> PeerAddress.simple((InetAddress) any(), eq(0)));
            verify(paramsMock).getPort();
            verify(target).addAddress(peerAddressMock);
        }
    }

    //Sapient generated method id: ${bc3cea22-a509-3943-8b44-c50782fa3a13}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void addAddress3Test() {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<PeerAddress> peerAddress = mockStatic(PeerAddress.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            peerAddress.when(() -> PeerAddress.simple((InetAddress) any(), eq(0))).thenReturn(peerAddressMock);
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(0).when(paramsMock).getPort();
            doNothing().when(target).addAddress(peerAddressMock, 0);
            InetAddress inetAddress = InetAddress.getLoopbackAddress();
            //Act Statement(s)
            target.addAddress(inetAddress, 0);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            peerAddress.verify(() -> PeerAddress.simple((InetAddress) any(), eq(0)));
            verify(paramsMock).getPort();
            verify(target).addAddress(peerAddressMock, 0);
        }
    }

    //Sapient generated method id: ${3a292049-25e1-3349-ad5e-5bf2d6ed42cb}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void addPeerDiscoveryWhenIsRunningNot() {
        /* Branches:
         * (getMaxConnections() == 0) : true
         * (!isRunning()) : true  #  inside setMaxConnections method
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        PeerDiscovery peerDiscoveryMock = mock(PeerDiscovery.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(false).when(target).isRunning();
            //Act Statement(s)
            target.addPeerDiscovery(peerDiscoveryMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            verify(target).isRunning();
        }
    }

    //Sapient generated method id: ${8561113e-3599-331f-b510-78dc0182c3e4}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void addPeerDiscoveryWhenAdjustmentLessThan0() {
        /* Branches:
         * (getMaxConnections() == 0) : true
         * (!isRunning()) : false  #  inside setMaxConnections method
         * (adjustment > 0) : false  #  inside setMaxConnections method
         * (adjustment < 0) : true  #  inside setMaxConnections method
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        PeerDiscovery peerDiscoveryMock = mock(PeerDiscovery.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(true).when(target).isRunning();
            doReturn(13).when(channelsMock).getConnectedClientCount();
            doNothing().when(channelsMock).closeConnections(1);
            //Act Statement(s)
            target.addPeerDiscovery(peerDiscoveryMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            verify(target).isRunning();
            verify(channelsMock).getConnectedClientCount();
            verify(channelsMock).closeConnections(1);
        }
    }

    //Sapient generated method id: ${c4d02601-611d-31f4-be23-1d6ba35e05e1}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void addPeerDiscoveryWhenExecutorNotIsShutdownAndAdjustmentNotLessThan0() {
        /* Branches:
         * (getMaxConnections() == 0) : true
         * (!isRunning()) : false  #  inside setMaxConnections method
         * (adjustment > 0) : true  #  inside setMaxConnections method
         * (!executor.isShutdown()) : true  #  inside triggerConnections method
         * (adjustment < 0) : false  #  inside setMaxConnections method
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        PeerDiscovery peerDiscoveryMock = mock(PeerDiscovery.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(true).when(target).isRunning();
            doReturn(0).when(channelsMock).getConnectedClientCount();
            //Act Statement(s)
            target.addPeerDiscovery(peerDiscoveryMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            verify(target).isRunning();
            verify(channelsMock).getConnectedClientCount();
        }
    }

    //Sapient generated method id: ${af6a6b4e-98ae-32a0-a236-769bbdb816a4}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void discoverPeersWhenAddressListIsEmpty() throws PeerDiscoveryException {
        /* Branches:
         * (!lock.isHeldByCurrentThread()) : true
         * (for-each(peerDiscoverers)) : false
         * (!addressList.isEmpty()) : false
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            int result = target.discoverPeers();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
        }
    }

    //Sapient generated method id: ${851f0409-c19e-3014-8295-a9d6526b6e01}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.submit, ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void waitForJobQueueTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.waitForJobQueue();
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
        }
    }

    //Sapient generated method id: ${2528cf16-6d67-3155-a614-85cd2b0af347}
    @Ignore(value = "Potential harmful system call (CountDownLatch.countDown, ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void startAsyncWhenGetPingIntervalMsecGreaterThan0() {
        /* Branches:
         * (chain == null) : true
         * (!vUsedUp) : true
         * (!executor.isShutdown()) : true  #  inside triggerConnections method
         * (getPingIntervalMsec() <= 0) : false  #  inside setupPinging method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        ListenableCompletableFuture<Void> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        Service serviceMock = mock(Service.class);
        try (MockedStatic<ListenableCompletableFuture> listenableCompletableFuture = mockStatic(ListenableCompletableFuture.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            CompletableFuture<Void> completableFuture = new CompletableFuture<>();
            listenableCompletableFuture.when(() -> ListenableCompletableFuture.of(completableFuture)).thenReturn(listenableCompletableFutureMock);
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(serviceMock).when(channelsMock).startAsync();
            doNothing().when(channelsMock).awaitRunning();
            //Act Statement(s)
            ListenableCompletableFuture<Void> result = target.startAsync();
            //Assert statement(s)
            assertThat(result, equalTo(listenableCompletableFutureMock));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            listenableCompletableFuture.verify(() -> ListenableCompletableFuture.of(completableFuture), atLeast(1));
            verify(channelsMock).startAsync();
            verify(channelsMock).awaitRunning();
        }
    }

    //Sapient generated method id: ${83b91df7-919b-3644-9b8d-4f4cbf3c8d95}
    @Ignore(value = "Potential harmful system call (CountDownLatch.countDown, ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void startAsyncWhenCaughtThrowable() {
        /* Branches:
         * (chain == null) : true
         * (!vUsedUp) : true
         * (!executor.isShutdown()) : true  #  inside triggerConnections method
         * (getPingIntervalMsec() <= 0) : false  #  inside setupPinging method
         * (catch-exception (Throwable)) : true  #  inside lambda$startAsync$7 method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        ListenableCompletableFuture<Void> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        Service serviceMock = mock(Service.class);
        try (MockedStatic<ListenableCompletableFuture> listenableCompletableFuture = mockStatic(ListenableCompletableFuture.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            CompletableFuture<Void> completableFuture = new CompletableFuture<>();
            listenableCompletableFuture.when(() -> ListenableCompletableFuture.of(completableFuture)).thenReturn(listenableCompletableFutureMock);
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(serviceMock).when(channelsMock).startAsync();
            doNothing().when(channelsMock).awaitRunning();
            //Act Statement(s)
            ListenableCompletableFuture<Void> result = target.startAsync();
            //Assert statement(s)
            assertThat(result, equalTo(listenableCompletableFutureMock));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            listenableCompletableFuture.verify(() -> ListenableCompletableFuture.of(completableFuture), atLeast(1));
            verify(channelsMock).startAsync();
            verify(channelsMock).awaitRunning();
        }
    }

    //Sapient generated method id: ${a9331398-240e-36aa-9522-b3dc4bcf14ad}
    @Ignore(value = "Potential harmful system call (ListenableCompletableFuture.join, ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void startTest() {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        ListenableCompletableFuture<Void> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(listenableCompletableFutureMock).when(target).startAsync();
            Object object = new Object();
            doReturn(object).when(listenableCompletableFutureMock).join();
            //Act Statement(s)
            target.start();
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            verify(target).startAsync();
            verify(listenableCompletableFutureMock).join();
        }
    }

    //Sapient generated method id: ${739e774b-f2c5-310f-a1cf-6995d2e5e577}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void stopAsyncThrowsIllegalStateException() {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.stopAsync();
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
        }
    }

    //Sapient generated method id: ${f2e2eee3-1366-3a78-9f85-41e952f2e39f}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void stopThrowsIllegalStateException() {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.stop();
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
        }
    }

    //Sapient generated method id: ${acca24c9-50bb-32da-8bdb-b2142755eacf}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void dropAllPeersWhenPeersIsEmpty() {
        /* Branches:
         * (for-each(peers)) : false
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.dropAllPeers();
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
        }
    }

    //Sapient generated method id: ${8918cf59-8088-3d05-b5e8-f71c63906723}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void addWalletWhenScriptPatternIsP2WPKHScriptPubKeyAndOutputNotIsMineWalletAndPeersIsEmpty() throws ScriptException {
        /* Branches:
         * (!wallets.contains(wallet)) : true
         * (for-each(tx.getOutputs())) : true  #  inside onCoinsReceivedOrSent method
         * (ScriptPattern.isP2PK(scriptPubKey)) : false  #  inside onCoinsReceivedOrSent method
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : true  #  inside onCoinsReceivedOrSent method
         * (output.isMine(wallet)) : false  #  inside onCoinsReceivedOrSent method
         * (for-each(peers)) : false
         */
        //Arrange Statement(s)
        Wallet walletMock = mock(Wallet.class);
        WalletCoinsReceivedEventListener walletCoinsReceivedEventListenerMock = mock(WalletCoinsReceivedEventListener.class);
        WalletCoinsSentEventListener walletCoinsSentEventListenerMock = mock(WalletCoinsSentEventListener.class);
        KeyChainEventListener keyChainEventListenerMock = mock(KeyChainEventListener.class);
        ScriptsChangeEventListener scriptsChangeEventListenerMock = mock(ScriptsChangeEventListener.class);
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        Script scriptMock = mock(Script.class);
        ListenableCompletableFuture<BloomFilter> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        ListenableCompletableFuture<BloomFilter> listenableCompletableFutureMock2 = mock(ListenableCompletableFuture.class);
        ListenableCompletableFuture<BloomFilter> listenableCompletableFutureMock3 = mock(ListenableCompletableFuture.class);
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            Executor executor = Threading.SAME_THREAD;
            doNothing().when(walletMock).addCoinsReceivedEventListener(executor, walletCoinsReceivedEventListenerMock);
            doNothing().when(walletMock).addCoinsSentEventListener(executor, walletCoinsSentEventListenerMock);
            doNothing().when(walletMock).addKeyChainEventListener(executor, keyChainEventListenerMock);
            doNothing().when(walletMock).addScriptsChangeEventListener(executor, scriptsChangeEventListenerMock);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(true);
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(listenableCompletableFutureMock, listenableCompletableFutureMock2).when(target).recalculateFastCatchupAndFilter(PeerGroup.FilterRecalculateMode.SEND_IF_CHANGED);
            doReturn(listenableCompletableFutureMock3).when(target).addPeerFilterProvider(walletMock);
            doNothing().when(walletMock).setTransactionBroadcaster(target);
            //Act Statement(s)
            target.addWallet(walletMock);
            //Assert statement(s)
            verify(walletMock).addCoinsReceivedEventListener(executor, walletCoinsReceivedEventListenerMock);
            verify(walletMock).addCoinsSentEventListener(executor, walletCoinsSentEventListenerMock);
            verify(walletMock).addKeyChainEventListener(executor, keyChainEventListenerMock);
            verify(walletMock).addScriptsChangeEventListener(executor, scriptsChangeEventListenerMock);
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            verify(target, times(2)).recalculateFastCatchupAndFilter(PeerGroup.FilterRecalculateMode.SEND_IF_CHANGED);
            verify(target).addPeerFilterProvider(walletMock);
            verify(walletMock).setTransactionBroadcaster(target);
        }
    }

    //Sapient generated method id: ${5b77f7ac-eb69-3ee7-bdcf-9f92758d749c}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void addWalletWhenOutputIsMineWalletAndTxGetConfidenceGetConfidenceTypeEqualsTransactionConfidenceConfidenceTypeBUILDINGAndP() throws ScriptException {
        /* Branches:
         * (!wallets.contains(wallet)) : true
         * (for-each(tx.getOutputs())) : true  #  inside onCoinsReceivedOrSent method
         * (ScriptPattern.isP2PK(scriptPubKey)) : false  #  inside onCoinsReceivedOrSent method
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : true  #  inside onCoinsReceivedOrSent method
         * (output.isMine(wallet)) : true  #  inside onCoinsReceivedOrSent method
         * (tx.getConfidence().getConfidenceType() == TransactionConfidence.ConfidenceType.BUILDING) : true  #  inside onCoinsReceivedOrSent method
         * (for-each(peers)) : false
         */
        //Arrange Statement(s)
        Wallet walletMock = mock(Wallet.class);
        WalletCoinsReceivedEventListener walletCoinsReceivedEventListenerMock = mock(WalletCoinsReceivedEventListener.class);
        WalletCoinsSentEventListener walletCoinsSentEventListenerMock = mock(WalletCoinsSentEventListener.class);
        KeyChainEventListener keyChainEventListenerMock = mock(KeyChainEventListener.class);
        ScriptsChangeEventListener scriptsChangeEventListenerMock = mock(ScriptsChangeEventListener.class);
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        Script scriptMock = mock(Script.class);
        Script scriptMock2 = mock(Script.class);
        ListenableCompletableFuture<BloomFilter> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        ListenableCompletableFuture<BloomFilter> listenableCompletableFutureMock2 = mock(ListenableCompletableFuture.class);
        ListenableCompletableFuture<BloomFilter> listenableCompletableFutureMock3 = mock(ListenableCompletableFuture.class);
        ListenableCompletableFuture<BloomFilter> listenableCompletableFutureMock4 = mock(ListenableCompletableFuture.class);
        ListenableCompletableFuture<BloomFilter> listenableCompletableFutureMock5 = mock(ListenableCompletableFuture.class);
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            Executor executor = Threading.SAME_THREAD;
            doNothing().when(walletMock).addCoinsReceivedEventListener(executor, walletCoinsReceivedEventListenerMock);
            doNothing().when(walletMock).addCoinsSentEventListener(executor, walletCoinsSentEventListenerMock);
            doNothing().when(walletMock).addKeyChainEventListener(executor, keyChainEventListenerMock);
            doNothing().when(walletMock).addScriptsChangeEventListener(executor, scriptsChangeEventListenerMock);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(true);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock2)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock2)).thenReturn(true);
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(listenableCompletableFutureMock, listenableCompletableFutureMock2, listenableCompletableFutureMock3, listenableCompletableFutureMock4).when(target).recalculateFastCatchupAndFilter(PeerGroup.FilterRecalculateMode.SEND_IF_CHANGED);
            doReturn(listenableCompletableFutureMock5).when(target).addPeerFilterProvider(walletMock);
            doNothing().when(walletMock).setTransactionBroadcaster(target);
            //Act Statement(s)
            target.addWallet(walletMock);
            //Assert statement(s)
            verify(walletMock).addCoinsReceivedEventListener(executor, walletCoinsReceivedEventListenerMock);
            verify(walletMock).addCoinsSentEventListener(executor, walletCoinsSentEventListenerMock);
            verify(walletMock).addKeyChainEventListener(executor, keyChainEventListenerMock);
            verify(walletMock).addScriptsChangeEventListener(executor, scriptsChangeEventListenerMock);
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock2), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock2), atLeast(1));
            verify(target, times(4)).recalculateFastCatchupAndFilter(PeerGroup.FilterRecalculateMode.SEND_IF_CHANGED);
            verify(target).addPeerFilterProvider(walletMock);
            verify(walletMock).setTransactionBroadcaster(target);
        }
    }

    //Sapient generated method id: ${e0eac798-1b35-354b-8c9b-73f1d65dcee1}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void addWalletWhenTxGetConfidenceGetConfidenceTypeEqualsTransactionConfidenceConfidenceTypeBUILDINGAndPeersIsEmpty4() throws ScriptException {
        /* Branches:
         * (!wallets.contains(wallet)) : true
         * (for-each(tx.getOutputs())) : true  #  inside onCoinsReceivedOrSent method
         * (ScriptPattern.isP2PK(scriptPubKey)) : false  #  inside onCoinsReceivedOrSent method
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : true  #  inside onCoinsReceivedOrSent method
         * (output.isMine(wallet)) : true  #  inside onCoinsReceivedOrSent method
         * (tx.getConfidence().getConfidenceType() == TransactionConfidence.ConfidenceType.BUILDING) : true  #  inside onCoinsReceivedOrSent method
         * (for-each(peers)) : false
         */
        //Arrange Statement(s)
        Wallet walletMock = mock(Wallet.class);
        WalletCoinsReceivedEventListener walletCoinsReceivedEventListenerMock = mock(WalletCoinsReceivedEventListener.class);
        WalletCoinsSentEventListener walletCoinsSentEventListenerMock = mock(WalletCoinsSentEventListener.class);
        KeyChainEventListener keyChainEventListenerMock = mock(KeyChainEventListener.class);
        ScriptsChangeEventListener scriptsChangeEventListenerMock = mock(ScriptsChangeEventListener.class);
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        Script scriptMock = mock(Script.class);
        Script scriptMock2 = mock(Script.class);
        ListenableCompletableFuture<BloomFilter> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        ListenableCompletableFuture<BloomFilter> listenableCompletableFutureMock2 = mock(ListenableCompletableFuture.class);
        ListenableCompletableFuture<BloomFilter> listenableCompletableFutureMock3 = mock(ListenableCompletableFuture.class);
        ListenableCompletableFuture<BloomFilter> listenableCompletableFutureMock4 = mock(ListenableCompletableFuture.class);
        ListenableCompletableFuture<BloomFilter> listenableCompletableFutureMock5 = mock(ListenableCompletableFuture.class);
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            Executor executor = Threading.SAME_THREAD;
            doNothing().when(walletMock).addCoinsReceivedEventListener(executor, walletCoinsReceivedEventListenerMock);
            doNothing().when(walletMock).addCoinsSentEventListener(executor, walletCoinsSentEventListenerMock);
            doNothing().when(walletMock).addKeyChainEventListener(executor, keyChainEventListenerMock);
            doNothing().when(walletMock).addScriptsChangeEventListener(executor, scriptsChangeEventListenerMock);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(true);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock2)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock2)).thenReturn(true);
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(listenableCompletableFutureMock2).when(target).recalculateFastCatchupAndFilter(PeerGroup.FilterRecalculateMode.DONT_SEND);
            doReturn(listenableCompletableFutureMock, listenableCompletableFutureMock3, listenableCompletableFutureMock4).when(target).recalculateFastCatchupAndFilter(PeerGroup.FilterRecalculateMode.SEND_IF_CHANGED);
            doReturn(listenableCompletableFutureMock5).when(target).addPeerFilterProvider(walletMock);
            doNothing().when(walletMock).setTransactionBroadcaster(target);
            //Act Statement(s)
            target.addWallet(walletMock);
            //Assert statement(s)
            verify(walletMock).addCoinsReceivedEventListener(executor, walletCoinsReceivedEventListenerMock);
            verify(walletMock).addCoinsSentEventListener(executor, walletCoinsSentEventListenerMock);
            verify(walletMock).addKeyChainEventListener(executor, keyChainEventListenerMock);
            verify(walletMock).addScriptsChangeEventListener(executor, scriptsChangeEventListenerMock);
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock2), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock2), atLeast(1));
            verify(target, times(3)).recalculateFastCatchupAndFilter(PeerGroup.FilterRecalculateMode.SEND_IF_CHANGED);
            verify(target).recalculateFastCatchupAndFilter(PeerGroup.FilterRecalculateMode.DONT_SEND);
            verify(target).addPeerFilterProvider(walletMock);
            verify(walletMock).setTransactionBroadcaster(target);
        }
    }

    //Sapient generated method id: ${532aac8d-8711-3082-a1cc-b8701d7a5927}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void addWalletWhenTxGetConfidenceGetConfidenceTypeEqualsTransactionConfidenceConfidenceTypeBUILDINGAndPeersIsEmpty6() throws ScriptException {
        /* Branches:
         * (!wallets.contains(wallet)) : true
         * (for-each(tx.getOutputs())) : true  #  inside onCoinsReceivedOrSent method
         * (ScriptPattern.isP2PK(scriptPubKey)) : false  #  inside onCoinsReceivedOrSent method
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : true  #  inside onCoinsReceivedOrSent method
         * (output.isMine(wallet)) : true  #  inside onCoinsReceivedOrSent method
         * (tx.getConfidence().getConfidenceType() == TransactionConfidence.ConfidenceType.BUILDING) : true  #  inside onCoinsReceivedOrSent method
         * (for-each(peers)) : false
         */
        //Arrange Statement(s)
        Wallet walletMock = mock(Wallet.class);
        WalletCoinsReceivedEventListener walletCoinsReceivedEventListenerMock = mock(WalletCoinsReceivedEventListener.class);
        WalletCoinsSentEventListener walletCoinsSentEventListenerMock = mock(WalletCoinsSentEventListener.class);
        KeyChainEventListener keyChainEventListenerMock = mock(KeyChainEventListener.class);
        ScriptsChangeEventListener scriptsChangeEventListenerMock = mock(ScriptsChangeEventListener.class);
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        Script scriptMock = mock(Script.class);
        Script scriptMock2 = mock(Script.class);
        ListenableCompletableFuture<BloomFilter> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        ListenableCompletableFuture<BloomFilter> listenableCompletableFutureMock2 = mock(ListenableCompletableFuture.class);
        ListenableCompletableFuture<BloomFilter> listenableCompletableFutureMock3 = mock(ListenableCompletableFuture.class);
        ListenableCompletableFuture<BloomFilter> listenableCompletableFutureMock4 = mock(ListenableCompletableFuture.class);
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            Executor executor = Threading.SAME_THREAD;
            doNothing().when(walletMock).addCoinsReceivedEventListener(executor, walletCoinsReceivedEventListenerMock);
            doNothing().when(walletMock).addCoinsSentEventListener(executor, walletCoinsSentEventListenerMock);
            doNothing().when(walletMock).addKeyChainEventListener(executor, keyChainEventListenerMock);
            doNothing().when(walletMock).addScriptsChangeEventListener(executor, scriptsChangeEventListenerMock);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(true);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock2)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock2)).thenReturn(true);
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(listenableCompletableFutureMock, listenableCompletableFutureMock2, listenableCompletableFutureMock3).when(target).recalculateFastCatchupAndFilter(PeerGroup.FilterRecalculateMode.SEND_IF_CHANGED);
            doReturn(listenableCompletableFutureMock4).when(target).addPeerFilterProvider(walletMock);
            doNothing().when(walletMock).setTransactionBroadcaster(target);
            //Act Statement(s)
            target.addWallet(walletMock);
            //Assert statement(s)
            verify(walletMock).addCoinsReceivedEventListener(executor, walletCoinsReceivedEventListenerMock);
            verify(walletMock).addCoinsSentEventListener(executor, walletCoinsSentEventListenerMock);
            verify(walletMock).addKeyChainEventListener(executor, keyChainEventListenerMock);
            verify(walletMock).addScriptsChangeEventListener(executor, scriptsChangeEventListenerMock);
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock2), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock2), atLeast(1));
            verify(target, times(3)).recalculateFastCatchupAndFilter(PeerGroup.FilterRecalculateMode.SEND_IF_CHANGED);
            verify(target).addPeerFilterProvider(walletMock);
            verify(walletMock).setTransactionBroadcaster(target);
        }
    }

    //Sapient generated method id: ${4030b86d-5b76-330e-9423-7991a43291ff}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void addWalletWhenOutputIsMineWalletAndTxGetConfidenceGetConfidenceTypeNotEqualsTransactionConfidenceConfidenceTypeBUILDINGA() throws ScriptException {
        /* Branches:
         * (!wallets.contains(wallet)) : true
         * (for-each(tx.getOutputs())) : true  #  inside onCoinsReceivedOrSent method
         * (ScriptPattern.isP2PK(scriptPubKey)) : false  #  inside onCoinsReceivedOrSent method
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : true  #  inside onCoinsReceivedOrSent method
         * (output.isMine(wallet)) : true  #  inside onCoinsReceivedOrSent method
         * (tx.getConfidence().getConfidenceType() == TransactionConfidence.ConfidenceType.BUILDING) : false  #  inside onCoinsReceivedOrSent method
         * (for-each(peers)) : false
         */
        //Arrange Statement(s)
        Wallet walletMock = mock(Wallet.class);
        WalletCoinsReceivedEventListener walletCoinsReceivedEventListenerMock = mock(WalletCoinsReceivedEventListener.class);
        WalletCoinsSentEventListener walletCoinsSentEventListenerMock = mock(WalletCoinsSentEventListener.class);
        KeyChainEventListener keyChainEventListenerMock = mock(KeyChainEventListener.class);
        ScriptsChangeEventListener scriptsChangeEventListenerMock = mock(ScriptsChangeEventListener.class);
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        Script scriptMock = mock(Script.class);
        ListenableCompletableFuture<BloomFilter> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        ListenableCompletableFuture<BloomFilter> listenableCompletableFutureMock2 = mock(ListenableCompletableFuture.class);
        ListenableCompletableFuture<BloomFilter> listenableCompletableFutureMock3 = mock(ListenableCompletableFuture.class);
        ListenableCompletableFuture<BloomFilter> listenableCompletableFutureMock4 = mock(ListenableCompletableFuture.class);
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            Executor executor = Threading.SAME_THREAD;
            doNothing().when(walletMock).addCoinsReceivedEventListener(executor, walletCoinsReceivedEventListenerMock);
            doNothing().when(walletMock).addCoinsSentEventListener(executor, walletCoinsSentEventListenerMock);
            doNothing().when(walletMock).addKeyChainEventListener(executor, keyChainEventListenerMock);
            doNothing().when(walletMock).addScriptsChangeEventListener(executor, scriptsChangeEventListenerMock);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(true);
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(listenableCompletableFutureMock).when(target).recalculateFastCatchupAndFilter(PeerGroup.FilterRecalculateMode.DONT_SEND);
            doReturn(listenableCompletableFutureMock2, listenableCompletableFutureMock3).when(target).recalculateFastCatchupAndFilter(PeerGroup.FilterRecalculateMode.SEND_IF_CHANGED);
            doReturn(listenableCompletableFutureMock4).when(target).addPeerFilterProvider(walletMock);
            doNothing().when(walletMock).setTransactionBroadcaster(target);
            //Act Statement(s)
            target.addWallet(walletMock);
            //Assert statement(s)
            verify(walletMock).addCoinsReceivedEventListener(executor, walletCoinsReceivedEventListenerMock);
            verify(walletMock).addCoinsSentEventListener(executor, walletCoinsSentEventListenerMock);
            verify(walletMock).addKeyChainEventListener(executor, keyChainEventListenerMock);
            verify(walletMock).addScriptsChangeEventListener(executor, scriptsChangeEventListenerMock);
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            verify(target).recalculateFastCatchupAndFilter(PeerGroup.FilterRecalculateMode.DONT_SEND);
            verify(target, times(2)).recalculateFastCatchupAndFilter(PeerGroup.FilterRecalculateMode.SEND_IF_CHANGED);
            verify(target).addPeerFilterProvider(walletMock);
            verify(walletMock).setTransactionBroadcaster(target);
        }
    }

    //Sapient generated method id: ${9bc49572-d0fa-3120-b991-9b5bff44324b}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void addPeerFilterProviderWhenNotWillSendFilter() {
        /* Branches:
         * (!peerFilterProviders.contains(provider)) : true
         * (chain != null) : false  #  inside updateVersionMessageRelayTxesBeforeFilter method
         * (spvMode) : false  #  inside updateVersionMessageRelayTxesBeforeFilter method
         * (!willSendFilter) : true  #  inside updateVersionMessageRelayTxesBeforeFilter method
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        ListenableCompletableFuture<BloomFilter> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        PeerFilterProvider peerFilterProviderMock = mock(PeerFilterProvider.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(listenableCompletableFutureMock).when(target).recalculateFastCatchupAndFilter(PeerGroup.FilterRecalculateMode.SEND_IF_CHANGED);
            //Act Statement(s)
            ListenableCompletableFuture<BloomFilter> result = target.addPeerFilterProvider(peerFilterProviderMock);
            //Assert statement(s)
            assertThat(result, equalTo(listenableCompletableFutureMock));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            verify(target).recalculateFastCatchupAndFilter(PeerGroup.FilterRecalculateMode.SEND_IF_CHANGED);
        }
    }

    //Sapient generated method id: ${a012b2c6-6c8f-3240-b260-26b57e1fd97d}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void removePeerFilterProviderThrowsIllegalArgumentException() {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        PeerFilterProvider peerFilterProviderMock = mock(PeerFilterProvider.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.removePeerFilterProvider(peerFilterProviderMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
        }
    }

    //Sapient generated method id: ${57c42480-bc92-3ca8-a15e-47edbd762034}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void removeWalletWhenScriptPatternIsP2WPKHScriptPubKeyAndOutputNotIsMineWalletAndPeersIsEmpty() throws ScriptException {
        /* Branches:
         * (for-each(tx.getOutputs())) : true  #  inside onCoinsReceivedOrSent method
         * (ScriptPattern.isP2PK(scriptPubKey)) : false  #  inside onCoinsReceivedOrSent method
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : true  #  inside onCoinsReceivedOrSent method
         * (output.isMine(wallet)) : false  #  inside onCoinsReceivedOrSent method
         * (for-each(peers)) : false
         */
        //Arrange Statement(s)
        Wallet walletMock = mock(Wallet.class);
        WalletCoinsReceivedEventListener walletCoinsReceivedEventListenerMock = mock(WalletCoinsReceivedEventListener.class);
        WalletCoinsSentEventListener walletCoinsSentEventListenerMock = mock(WalletCoinsSentEventListener.class);
        KeyChainEventListener keyChainEventListenerMock = mock(KeyChainEventListener.class);
        ScriptsChangeEventListener scriptsChangeEventListenerMock = mock(ScriptsChangeEventListener.class);
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        Script scriptMock = mock(Script.class);
        ListenableCompletableFuture<BloomFilter> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        ListenableCompletableFuture<BloomFilter> listenableCompletableFutureMock2 = mock(ListenableCompletableFuture.class);
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(false).when(walletMock).removeCoinsReceivedEventListener(walletCoinsReceivedEventListenerMock);
            doReturn(false).when(walletMock).removeCoinsSentEventListener(walletCoinsSentEventListenerMock);
            doReturn(false).when(walletMock).removeKeyChainEventListener(keyChainEventListenerMock);
            doReturn(false).when(walletMock).removeScriptsChangeEventListener(scriptsChangeEventListenerMock);
            doNothing().when(walletMock).setTransactionBroadcaster(null);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(true);
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(listenableCompletableFutureMock, listenableCompletableFutureMock2).when(target).recalculateFastCatchupAndFilter(PeerGroup.FilterRecalculateMode.SEND_IF_CHANGED);
            //Act Statement(s)
            target.removeWallet(walletMock);
            //Assert statement(s)
            verify(walletMock).removeCoinsReceivedEventListener(walletCoinsReceivedEventListenerMock);
            verify(walletMock).removeCoinsSentEventListener(walletCoinsSentEventListenerMock);
            verify(walletMock).removeKeyChainEventListener(keyChainEventListenerMock);
            verify(walletMock).removeScriptsChangeEventListener(scriptsChangeEventListenerMock);
            verify(walletMock).setTransactionBroadcaster(null);
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            verify(target, times(2)).recalculateFastCatchupAndFilter(PeerGroup.FilterRecalculateMode.SEND_IF_CHANGED);
        }
    }

    //Sapient generated method id: ${b153339e-9692-3bc9-8999-eb8bd5f019e9}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void removeWalletWhenOutputIsMineWalletAndTxGetConfidenceGetConfidenceTypeEqualsTransactionConfidenceConfidenceTypeBUILDINGA() throws ScriptException {
        /* Branches:
         * (for-each(tx.getOutputs())) : true  #  inside onCoinsReceivedOrSent method
         * (ScriptPattern.isP2PK(scriptPubKey)) : false  #  inside onCoinsReceivedOrSent method
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : true  #  inside onCoinsReceivedOrSent method
         * (output.isMine(wallet)) : true  #  inside onCoinsReceivedOrSent method
         * (tx.getConfidence().getConfidenceType() == TransactionConfidence.ConfidenceType.BUILDING) : true  #  inside onCoinsReceivedOrSent method
         * (for-each(peers)) : false
         */
        //Arrange Statement(s)
        Wallet walletMock = mock(Wallet.class);
        WalletCoinsReceivedEventListener walletCoinsReceivedEventListenerMock = mock(WalletCoinsReceivedEventListener.class);
        WalletCoinsSentEventListener walletCoinsSentEventListenerMock = mock(WalletCoinsSentEventListener.class);
        KeyChainEventListener keyChainEventListenerMock = mock(KeyChainEventListener.class);
        ScriptsChangeEventListener scriptsChangeEventListenerMock = mock(ScriptsChangeEventListener.class);
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        Script scriptMock = mock(Script.class);
        Script scriptMock2 = mock(Script.class);
        ListenableCompletableFuture<BloomFilter> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        ListenableCompletableFuture<BloomFilter> listenableCompletableFutureMock2 = mock(ListenableCompletableFuture.class);
        ListenableCompletableFuture<BloomFilter> listenableCompletableFutureMock3 = mock(ListenableCompletableFuture.class);
        ListenableCompletableFuture<BloomFilter> listenableCompletableFutureMock4 = mock(ListenableCompletableFuture.class);
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(false).when(walletMock).removeCoinsReceivedEventListener(walletCoinsReceivedEventListenerMock);
            doReturn(false).when(walletMock).removeCoinsSentEventListener(walletCoinsSentEventListenerMock);
            doReturn(false).when(walletMock).removeKeyChainEventListener(keyChainEventListenerMock);
            doReturn(false).when(walletMock).removeScriptsChangeEventListener(scriptsChangeEventListenerMock);
            doNothing().when(walletMock).setTransactionBroadcaster(null);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(true);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock2)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock2)).thenReturn(true);
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(listenableCompletableFutureMock, listenableCompletableFutureMock2, listenableCompletableFutureMock3, listenableCompletableFutureMock4).when(target).recalculateFastCatchupAndFilter(PeerGroup.FilterRecalculateMode.SEND_IF_CHANGED);
            //Act Statement(s)
            target.removeWallet(walletMock);
            //Assert statement(s)
            verify(walletMock).removeCoinsReceivedEventListener(walletCoinsReceivedEventListenerMock);
            verify(walletMock).removeCoinsSentEventListener(walletCoinsSentEventListenerMock);
            verify(walletMock).removeKeyChainEventListener(keyChainEventListenerMock);
            verify(walletMock).removeScriptsChangeEventListener(scriptsChangeEventListenerMock);
            verify(walletMock).setTransactionBroadcaster(null);
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock2), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock2), atLeast(1));
            verify(target, times(4)).recalculateFastCatchupAndFilter(PeerGroup.FilterRecalculateMode.SEND_IF_CHANGED);
        }
    }

    //Sapient generated method id: ${6e7254b8-2e12-3416-87e1-026a4774f243}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void removeWalletWhenTxGetConfidenceGetConfidenceTypeEqualsTransactionConfidenceConfidenceTypeBUILDINGAndPeersIsEmpty4() throws ScriptException {
        /* Branches:
         * (for-each(tx.getOutputs())) : true  #  inside onCoinsReceivedOrSent method
         * (ScriptPattern.isP2PK(scriptPubKey)) : false  #  inside onCoinsReceivedOrSent method
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : true  #  inside onCoinsReceivedOrSent method
         * (output.isMine(wallet)) : true  #  inside onCoinsReceivedOrSent method
         * (tx.getConfidence().getConfidenceType() == TransactionConfidence.ConfidenceType.BUILDING) : true  #  inside onCoinsReceivedOrSent method
         * (for-each(peers)) : false
         */
        //Arrange Statement(s)
        Wallet walletMock = mock(Wallet.class);
        WalletCoinsReceivedEventListener walletCoinsReceivedEventListenerMock = mock(WalletCoinsReceivedEventListener.class);
        WalletCoinsSentEventListener walletCoinsSentEventListenerMock = mock(WalletCoinsSentEventListener.class);
        KeyChainEventListener keyChainEventListenerMock = mock(KeyChainEventListener.class);
        ScriptsChangeEventListener scriptsChangeEventListenerMock = mock(ScriptsChangeEventListener.class);
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        Script scriptMock = mock(Script.class);
        Script scriptMock2 = mock(Script.class);
        ListenableCompletableFuture<BloomFilter> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        ListenableCompletableFuture<BloomFilter> listenableCompletableFutureMock2 = mock(ListenableCompletableFuture.class);
        ListenableCompletableFuture<BloomFilter> listenableCompletableFutureMock3 = mock(ListenableCompletableFuture.class);
        ListenableCompletableFuture<BloomFilter> listenableCompletableFutureMock4 = mock(ListenableCompletableFuture.class);
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(false).when(walletMock).removeCoinsReceivedEventListener(walletCoinsReceivedEventListenerMock);
            doReturn(false).when(walletMock).removeCoinsSentEventListener(walletCoinsSentEventListenerMock);
            doReturn(false).when(walletMock).removeKeyChainEventListener(keyChainEventListenerMock);
            doReturn(false).when(walletMock).removeScriptsChangeEventListener(scriptsChangeEventListenerMock);
            doNothing().when(walletMock).setTransactionBroadcaster(null);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(true);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock2)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock2)).thenReturn(true);
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(listenableCompletableFutureMock2).when(target).recalculateFastCatchupAndFilter(PeerGroup.FilterRecalculateMode.DONT_SEND);
            doReturn(listenableCompletableFutureMock, listenableCompletableFutureMock3, listenableCompletableFutureMock4).when(target).recalculateFastCatchupAndFilter(PeerGroup.FilterRecalculateMode.SEND_IF_CHANGED);
            //Act Statement(s)
            target.removeWallet(walletMock);
            //Assert statement(s)
            verify(walletMock).removeCoinsReceivedEventListener(walletCoinsReceivedEventListenerMock);
            verify(walletMock).removeCoinsSentEventListener(walletCoinsSentEventListenerMock);
            verify(walletMock).removeKeyChainEventListener(keyChainEventListenerMock);
            verify(walletMock).removeScriptsChangeEventListener(scriptsChangeEventListenerMock);
            verify(walletMock).setTransactionBroadcaster(null);
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock2), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock2), atLeast(1));
            verify(target, times(3)).recalculateFastCatchupAndFilter(PeerGroup.FilterRecalculateMode.SEND_IF_CHANGED);
            verify(target).recalculateFastCatchupAndFilter(PeerGroup.FilterRecalculateMode.DONT_SEND);
        }
    }

    //Sapient generated method id: ${06899502-87c9-39ff-919c-ce91d91ea16d}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void removeWalletWhenTxGetConfidenceGetConfidenceTypeEqualsTransactionConfidenceConfidenceTypeBUILDINGAndPeersIsEmpty6() throws ScriptException {
        /* Branches:
         * (for-each(tx.getOutputs())) : true  #  inside onCoinsReceivedOrSent method
         * (ScriptPattern.isP2PK(scriptPubKey)) : false  #  inside onCoinsReceivedOrSent method
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : true  #  inside onCoinsReceivedOrSent method
         * (output.isMine(wallet)) : true  #  inside onCoinsReceivedOrSent method
         * (tx.getConfidence().getConfidenceType() == TransactionConfidence.ConfidenceType.BUILDING) : true  #  inside onCoinsReceivedOrSent method
         * (for-each(peers)) : false
         */
        //Arrange Statement(s)
        Wallet walletMock = mock(Wallet.class);
        WalletCoinsReceivedEventListener walletCoinsReceivedEventListenerMock = mock(WalletCoinsReceivedEventListener.class);
        WalletCoinsSentEventListener walletCoinsSentEventListenerMock = mock(WalletCoinsSentEventListener.class);
        KeyChainEventListener keyChainEventListenerMock = mock(KeyChainEventListener.class);
        ScriptsChangeEventListener scriptsChangeEventListenerMock = mock(ScriptsChangeEventListener.class);
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        Script scriptMock = mock(Script.class);
        Script scriptMock2 = mock(Script.class);
        ListenableCompletableFuture<BloomFilter> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        ListenableCompletableFuture<BloomFilter> listenableCompletableFutureMock2 = mock(ListenableCompletableFuture.class);
        ListenableCompletableFuture<BloomFilter> listenableCompletableFutureMock3 = mock(ListenableCompletableFuture.class);
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(false).when(walletMock).removeCoinsReceivedEventListener(walletCoinsReceivedEventListenerMock);
            doReturn(false).when(walletMock).removeCoinsSentEventListener(walletCoinsSentEventListenerMock);
            doReturn(false).when(walletMock).removeKeyChainEventListener(keyChainEventListenerMock);
            doReturn(false).when(walletMock).removeScriptsChangeEventListener(scriptsChangeEventListenerMock);
            doNothing().when(walletMock).setTransactionBroadcaster(null);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(true);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock2)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock2)).thenReturn(true);
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(listenableCompletableFutureMock, listenableCompletableFutureMock2, listenableCompletableFutureMock3).when(target).recalculateFastCatchupAndFilter(PeerGroup.FilterRecalculateMode.SEND_IF_CHANGED);
            //Act Statement(s)
            target.removeWallet(walletMock);
            //Assert statement(s)
            verify(walletMock).removeCoinsReceivedEventListener(walletCoinsReceivedEventListenerMock);
            verify(walletMock).removeCoinsSentEventListener(walletCoinsSentEventListenerMock);
            verify(walletMock).removeKeyChainEventListener(keyChainEventListenerMock);
            verify(walletMock).removeScriptsChangeEventListener(scriptsChangeEventListenerMock);
            verify(walletMock).setTransactionBroadcaster(null);
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock2), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock2), atLeast(1));
            verify(target, times(3)).recalculateFastCatchupAndFilter(PeerGroup.FilterRecalculateMode.SEND_IF_CHANGED);
        }
    }

    //Sapient generated method id: ${af382a03-00c8-3930-b438-2c852c34a45d}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void removeWalletWhenOutputIsMineWalletAndTxGetConfidenceGetConfidenceTypeNotEqualsTransactionConfidenceConfidenceTypeBUILDI() throws ScriptException {
        /* Branches:
         * (for-each(tx.getOutputs())) : true  #  inside onCoinsReceivedOrSent method
         * (ScriptPattern.isP2PK(scriptPubKey)) : false  #  inside onCoinsReceivedOrSent method
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : true  #  inside onCoinsReceivedOrSent method
         * (output.isMine(wallet)) : true  #  inside onCoinsReceivedOrSent method
         * (tx.getConfidence().getConfidenceType() == TransactionConfidence.ConfidenceType.BUILDING) : false  #  inside onCoinsReceivedOrSent method
         * (for-each(peers)) : false
         */
        //Arrange Statement(s)
        Wallet walletMock = mock(Wallet.class);
        WalletCoinsReceivedEventListener walletCoinsReceivedEventListenerMock = mock(WalletCoinsReceivedEventListener.class);
        WalletCoinsSentEventListener walletCoinsSentEventListenerMock = mock(WalletCoinsSentEventListener.class);
        KeyChainEventListener keyChainEventListenerMock = mock(KeyChainEventListener.class);
        ScriptsChangeEventListener scriptsChangeEventListenerMock = mock(ScriptsChangeEventListener.class);
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        Script scriptMock = mock(Script.class);
        ListenableCompletableFuture<BloomFilter> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        ListenableCompletableFuture<BloomFilter> listenableCompletableFutureMock2 = mock(ListenableCompletableFuture.class);
        ListenableCompletableFuture<BloomFilter> listenableCompletableFutureMock3 = mock(ListenableCompletableFuture.class);
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(false).when(walletMock).removeCoinsReceivedEventListener(walletCoinsReceivedEventListenerMock);
            doReturn(false).when(walletMock).removeCoinsSentEventListener(walletCoinsSentEventListenerMock);
            doReturn(false).when(walletMock).removeKeyChainEventListener(keyChainEventListenerMock);
            doReturn(false).when(walletMock).removeScriptsChangeEventListener(scriptsChangeEventListenerMock);
            doNothing().when(walletMock).setTransactionBroadcaster(null);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(true);
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(listenableCompletableFutureMock).when(target).recalculateFastCatchupAndFilter(PeerGroup.FilterRecalculateMode.DONT_SEND);
            doReturn(listenableCompletableFutureMock2, listenableCompletableFutureMock3).when(target).recalculateFastCatchupAndFilter(PeerGroup.FilterRecalculateMode.SEND_IF_CHANGED);
            //Act Statement(s)
            target.removeWallet(walletMock);
            //Assert statement(s)
            verify(walletMock).removeCoinsReceivedEventListener(walletCoinsReceivedEventListenerMock);
            verify(walletMock).removeCoinsSentEventListener(walletCoinsSentEventListenerMock);
            verify(walletMock).removeKeyChainEventListener(keyChainEventListenerMock);
            verify(walletMock).removeScriptsChangeEventListener(scriptsChangeEventListenerMock);
            verify(walletMock).setTransactionBroadcaster(null);
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            verify(target).recalculateFastCatchupAndFilter(PeerGroup.FilterRecalculateMode.DONT_SEND);
            verify(target, times(2)).recalculateFastCatchupAndFilter(PeerGroup.FilterRecalculateMode.SEND_IF_CHANGED);
        }
    }

    //Sapient generated method id: ${14b7056e-65cb-31f2-9245-c6b952c41c89}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void recalculateFastCatchupAndFilterWhenInFlightRecalculationsGetModeIsNull() {
        /* Branches:
         * (inFlightRecalculations.get(mode) != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            ListenableCompletableFuture<BloomFilter> result = target.recalculateFastCatchupAndFilter(PeerGroup.FilterRecalculateMode.SEND_IF_CHANGED);
            //Assert statement(s)
            //TODO: Please implement equals method in ListenableCompletableFuture for verification of the entire object or you need to adjust respective assertion statements
            assertThat(result, is(notNullValue()));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
        }
    }

    //Sapient generated method id: ${470c6f5a-4452-382d-adca-dee0823e4468}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void setBloomFilterFalsePositiveRateTest() {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        ListenableCompletableFuture<BloomFilter> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(listenableCompletableFutureMock).when(target).recalculateFastCatchupAndFilter(PeerGroup.FilterRecalculateMode.SEND_IF_CHANGED);
            //Act Statement(s)
            target.setBloomFilterFalsePositiveRate(Double.parseDouble("0.0"));
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            verify(target).recalculateFastCatchupAndFilter(PeerGroup.FilterRecalculateMode.SEND_IF_CHANGED);
        }
    }

    //Sapient generated method id: ${b8a23ffc-8480-34f9-ae94-600ef7e0d400}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void numConnectedPeersTest() {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            int result = target.numConnectedPeers();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
        }
    }

    //Sapient generated method id: ${6bbab6d1-8996-3584-b49d-de1da580891a}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void connectToTest() throws ExecutionException {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        Peer peerMock = mock(Peer.class);
        try (MockedStatic<PeerAddress> peerAddress = mockStatic(PeerAddress.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
            peerAddress.when(() -> PeerAddress.simple(inetSocketAddress)).thenReturn(peerAddressMock);
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(peerMock).when(target).connectTo(eq(peerAddressMock), eq(true), (Duration) any());
            //Act Statement(s)
            Peer result = target.connectTo(inetSocketAddress);
            //Assert statement(s)
            assertThat(result, equalTo(peerMock));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            peerAddress.verify(() -> PeerAddress.simple(inetSocketAddress), atLeast(1));
            verify(target).connectTo(eq(peerAddressMock), eq(true), (Duration) any());
        }
    }

    //Sapient generated method id: ${c842249d-095e-37ed-9870-47f67538ad7c}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void connectToLocalHostTest() throws ExecutionException {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        Peer peerMock = mock(Peer.class);
        try (MockedStatic<PeerAddress> peerAddress = mockStatic(PeerAddress.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            peerAddress.when(() -> PeerAddress.localhost(paramsMock)).thenReturn(peerAddressMock);
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(peerMock).when(target).connectTo(eq(peerAddressMock), eq(true), (Duration) any());
            //Act Statement(s)
            Peer result = target.connectToLocalHost();
            //Assert statement(s)
            assertThat(result, equalTo(peerMock));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            peerAddress.verify(() -> PeerAddress.localhost(paramsMock), atLeast(1));
            verify(target).connectTo(eq(peerAddressMock), eq(true), (Duration) any());
        }
    }

    //Sapient generated method id: ${e2fb8b90-59c7-3e32-ac65-8e0a50d0fcf5}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void connectTo1ThrowsIllegalStateException() {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(IllegalStateException.class);
            Duration duration = Duration.ofDays(0L);
            //Act Statement(s)
            target.connectTo(peerAddressMock, false, duration);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
        }
    }

    //Sapient generated method id: ${46fc33a4-a9d2-3bdd-8bc3-3f92a7cf1d8b}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void createPeerTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            Peer result = target.createPeer(peerAddressMock, versionMessageMock);
            //Assert statement(s)
            //TODO: Please implement equals method in Peer for verification of the entire object or you need to adjust respective assertion statements
            assertThat(result, is(notNullValue()));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
        }
    }

    //Sapient generated method id: ${8117fc59-e007-3a51-9f07-287c570ddca2}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void setConnectTimeoutMillisTest() {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.setConnectTimeoutMillis(0);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
        }
    }

    //Sapient generated method id: ${c34e20eb-d0e4-3e51-891a-dd196bcdecb3}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void startBlockChainDownloadWhenDownloadPeerIsNull() {
        /* Branches:
         * (downloadPeer != null) : false
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        BlockchainDownloadEventListener blockchainDownloadEventListenerMock = mock(BlockchainDownloadEventListener.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.startBlockChainDownload(blockchainDownloadEventListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
        }
    }

    //Sapient generated method id: ${4980eb77-d888-3fae-bc99-a7e89e5b6b0b}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void downloadBlockChainTest() throws InterruptedException {
        /**
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: listener
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).startBlockChainDownload((DownloadProgressTracker) any());
            //Act Statement(s)
            target.downloadBlockChain();
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            verify(target).startBlockChainDownload((DownloadProgressTracker) any());
        }
    }

    //Sapient generated method id: ${fc161a7b-d8cd-3f0c-bcc7-a818268a94a9}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void downloadBlockChainWhenCaughtInterruptedExceptionThrowsRuntimeException() throws InterruptedException {
        /* Branches:
         * (catch-exception (InterruptedException)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: listener
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).startBlockChainDownload((DownloadProgressTracker) any());
            thrown.expect(RuntimeException.class);
            thrown.expectCause(is(instanceOf(InterruptedException.class)));
            //Act Statement(s)
            target.downloadBlockChain();
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            verify(target).startBlockChainDownload((DownloadProgressTracker) any());
        }
    }

    //Sapient generated method id: ${c8decc02-a8e1-3b7f-99f0-e22bbe754386}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void handleNewPeerThrowsNullPointerException() {
        //Arrange Statement(s)
        Peer peerMock = mock(Peer.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(peerAddressMock).when(peerMock).getAddress();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(NullPointerException.class);
            //Act Statement(s)
            target.handleNewPeer(peerMock);
            //Assert statement(s)
            verify(peerMock).getAddress();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
        }
    }

    //Sapient generated method id: ${2ed98721-0de7-35b8-b558-b80cd0c5e7f4}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void getMemoryPoolTest() {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            TxConfidenceTable result = target.getMemoryPool();
            //Assert statement(s)
            //TODO: Please implement equals method in TxConfidenceTable for verification of the entire object or you need to adjust respective assertion statements
            assertThat(result, is(notNullValue()));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
        }
    }

    //Sapient generated method id: ${e8616d9c-f2ad-314d-9c3d-0c2d6b69c233}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void setFastCatchupTimeWhenDownloadPeerIsNull() {
        /* Branches:
         * (chain == null) : true
         * (downloadPeer != null) : false
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            Instant instant2 = Instant.ofEpochSecond(1700000000);
            //Act Statement(s)
            target.setFastCatchupTime(instant2);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
        }
    }

    //Sapient generated method id: ${c1ce17e3-6fb9-3f9f-b1d1-d5d877238bee}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void setFastCatchupTimeSecsTest() {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).setFastCatchupTime((Instant) any());
            //Act Statement(s)
            target.setFastCatchupTimeSecs(0L);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            verify(target).setFastCatchupTime((Instant) any());
        }
    }

    //Sapient generated method id: ${2ad7c380-aba4-361b-83f8-7f38088d1245}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void fastCatchupTimeTest() {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            Instant result = target.fastCatchupTime();
            //Assert statement(s)
            assertThat(result, equalTo(instant));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
        }
    }

    //Sapient generated method id: ${4fdda27e-3386-34f1-b79c-ec9d2476c54f}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void getFastCatchupTimeSecsTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            long result = target.getFastCatchupTimeSecs();
            //Assert statement(s)
            assertThat(result, equalTo(0L));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
        }
    }

    //Sapient generated method id: ${9ab682bf-31f5-3abe-8dbe-9e8a330065dc}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void handlePeerDeathWhenIsRunningNot() {
        /* Branches:
         * (!isRunning()) : true
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        Peer peerMock = mock(Peer.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(false).when(target).isRunning();
            Throwable throwable = new Throwable();
            //Act Statement(s)
            target.handlePeerDeath(peerMock, throwable);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            verify(target).isRunning();
        }
    }

    //Sapient generated method id: ${f3957bff-5550-39f6-8816-9972dc0d67b3}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void handlePeerDeathWhenAddressGetAddrInstanceOfInet6AddressAndNotIpv6UnreachableAndNumPeersNotLesThrowsNullPointerException() {
        /* Branches:
         * (!isRunning()) : false
         * (peer == downloadPeer) : true
         * (downloadPeer == peer) : true  #  inside setDownloadPeer method
         * (newDownloadPeer != null) : true
         * (downloadListener != null) : false
         * (exception instanceof NoRouteToHostException) : true
         * (address.getAddr() instanceof Inet6Address) : true
         * (!ipv6Unreachable) : true
         * (numPeers < getMaxConnections()) : false
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(true).when(target).isRunning();
            CopyOnWriteArrayList<Peer> peerList = new CopyOnWriteArrayList<>();
            doReturn(null).when(target).selectDownloadPeer(peerList);
            thrown.expect(NullPointerException.class);
            Peer peer = null;
            NoRouteToHostException noRouteToHostException = new NoRouteToHostException();
            //Act Statement(s)
            target.handlePeerDeath(peer, noRouteToHostException);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            verify(target).isRunning();
            verify(target).selectDownloadPeer(peerList);
        }
    }

    //Sapient generated method id: ${ec5a0800-9152-302f-8ab6-9bb88f250e51}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void handlePeerDeathWhenChainIsNullAndDownloadListenerIsNullAndExceptionNotInstanceOfNoRouteToHostThrowsNullPointerException() {
        /* Branches:
         * (!isRunning()) : false
         * (peer == downloadPeer) : true
         * (downloadPeer == peer) : true  #  inside setDownloadPeer method
         * (newDownloadPeer != null) : true
         * (downloadPeer != null) : false  #  inside setDownloadPeer method
         * (downloadPeer != null) : true  #  inside setDownloadPeer method
         * (downloadListener != null) : false  #  inside setDownloadPeer method
         * (chain != null) : false  #  inside setDownloadPeer method
         * (downloadListener != null) : false
         * (exception instanceof NoRouteToHostException) : false
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(true).when(target).isRunning();
            CopyOnWriteArrayList<Peer> peerList = new CopyOnWriteArrayList<>();
            doReturn(downloadPeerMock).when(target).selectDownloadPeer(peerList);
            doNothing().when(downloadPeerMock).setDownloadData(true);
            thrown.expect(NullPointerException.class);
            Peer peer = null;
            Throwable throwable = new Throwable();
            //Act Statement(s)
            target.handlePeerDeath(peer, throwable);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            verify(target).isRunning();
            verify(target).selectDownloadPeer(peerList);
            verify(downloadPeerMock).setDownloadData(true);
        }
    }

    //Sapient generated method id: ${3563b55f-6006-3104-8445-7dbb92587c40}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void handlePeerDeathWhenPeersTransactionBroadastEventListenersIsEmptyAndPeerDisconnectedEventListenersIsEmpty() {
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //Act Statement(s)
        //Assert statement(s)
        /* Branches:
         * (!isRunning()) : false
         * (peer == downloadPeer) : false
         * (exception instanceof NoRouteToHostException) : true
         * (address.getAddr() instanceof Inet6Address) : true
         * (!ipv6Unreachable) : true
         * (numPeers < getMaxConnections()) : false
         * (for-each(wallets)) : false
         * (for-each(peersBlocksDownloadedEventListeners)) : false
         * (for-each(peersChainDownloadStartedEventListeners)) : false
         * (for-each(peerGetDataEventListeners)) : false
         * (for-each(peersPreMessageReceivedEventListeners)) : false
         * (for-each(peersTransactionBroadastEventListeners)) : false
         * (for-each(peerDisconnectedEventListeners)) : false
         */
        //Arrange Statement(s)
        //Peer peerMock = mock(Peer.class);
        //Inet6Address inet6AddressMock = mock(Inet6Address.class);
        //Network networkMock = mock(Network.class);
        //Block blockMock = mock(Block.class);
        //PeerAddress peerAddress = PeerAddress.simple(inet6AddressMock, 0);
        //doReturn(peerAddress).when(peerMock).getAddress();
        //doReturn(false).when(peerMock).removeAddressEventListener((PeerGroup.PeerListener) any());
        //doReturn(false).when(peerMock).removeBlocksDownloadedEventListener((PeerGroup.PeerListener) any());
        //doReturn(false).when(peerMock).removeGetDataEventListener((PeerGroup.PeerListener) any());
        //networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
        //doReturn(blockMock).when(paramsMock).getGenesisBlock();
        //Instant instant = Instant.ofEpochSecond(1700000000);
        //doReturn(instant).when(blockMock).time();
        //target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
        //autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //doReturn(true).when(target).isRunning();
        //NoRouteToHostException noRouteToHostException = new NoRouteToHostException();
        //target.handlePeerDeath(peerMock, noRouteToHostException);
        //verify(peerMock).getAddress();
        //verify(peerMock).removeAddressEventListener((PeerGroup.PeerListener) any());
        //verify(peerMock).removeBlocksDownloadedEventListener((PeerGroup.PeerListener) any());
        //verify(peerMock).removeGetDataEventListener((PeerGroup.PeerListener) any());
        //networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
        //verify(paramsMock).getGenesisBlock();
        //verify(blockMock).time();
        //verify(target).isRunning();
    }

    //Sapient generated method id: ${88590d65-c1a6-3069-916f-c1571ef3b9dd}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void setStallThresholdTest() {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.setStallThreshold(0, 0);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
        }
    }

    //Sapient generated method id: ${e519464e-6fb1-3259-93ed-6dba2cc595da}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void startBlockChainDownloadFromPeerWhenChainDownloadSpeedCalculatorIsNullThrowsNullPointerException() {
        /* Branches:
         * (downloadPeer == peer) : true  #  inside setDownloadPeer method
         * (chainDownloadSpeedCalculator == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(NullPointerException.class);
            Peer peer = null;
            //Act Statement(s)
            target.startBlockChainDownloadFromPeer(peer);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
        }
    }

    //Sapient generated method id: ${fda66e4f-4b25-35db-a3b4-51904d90593c}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void startBlockChainDownloadFromPeerWhenChainDownloadSpeedCalculatorIsNull() {
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //Act Statement(s)
        //Assert statement(s)
        /* Branches:
         * (downloadPeer == peer) : false  #  inside setDownloadPeer method
         * (downloadPeer != null) : false  #  inside setDownloadPeer method
         * (downloadPeer != null) : true  #  inside setDownloadPeer method
         * (downloadListener != null) : false  #  inside setDownloadPeer method
         * (chain != null) : false  #  inside setDownloadPeer method
         * (chainDownloadSpeedCalculator == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //Peer peerMock = mock(Peer.class);
        //Network networkMock = mock(Network.class);
        //Block blockMock = mock(Block.class);
        //Executor executor = Threading.SAME_THREAD;
        //doNothing().when(peerMock).addBlocksDownloadedEventListener(eq(executor), (PeerGroup.ChainDownloadSpeedCalculator) any());
        //doNothing().when(peerMock).startBlockChainDownload();
        //networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
        //doReturn(blockMock).when(paramsMock).getGenesisBlock();
        //Instant instant = Instant.ofEpochSecond(1700000000);
        //doReturn(instant).when(blockMock).time();
        //target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
        //autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //doNothing().when(peerMock).setDownloadData(true);
        //target.startBlockChainDownloadFromPeer(peerMock);
        //verify(peerMock).addBlocksDownloadedEventListener(eq(executor), (PeerGroup.ChainDownloadSpeedCalculator) any());
        //verify(peerMock).startBlockChainDownload();
        //networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
        //verify(paramsMock).getGenesisBlock();
        //verify(blockMock).time();
        //verify(peerMock).setDownloadData(true);
    }

    //Sapient generated method id: ${9353a977-8019-3f98-9288-a5878ea2dabe}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void waitForPeersTest() {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        ListenableCompletableFuture<List<Peer>> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(listenableCompletableFutureMock).when(target).waitForPeersOfVersion(0, 0L);
            //Act Statement(s)
            ListenableCompletableFuture<List<Peer>> result = target.waitForPeers(0);
            //Assert statement(s)
            assertThat(result, equalTo(listenableCompletableFutureMock));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            verify(target).waitForPeersOfVersion(0, 0L);
        }
    }

    //Sapient generated method id: ${aa7534fd-912b-375d-a796-9e9ccc9d6319}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute, ListenableCompletableFuture.complete) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void waitForPeersOfVersionWhenFoundPeersSizeGreaterThanOrEqualsToNumPeers() {
        /* Branches:
         * (foundPeers.size() >= numPeers) : true
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Peer> peerList = new ArrayList<>();
            doReturn(peerList).when(target).findPeersOfAtLeastVersion(0L);
            //Act Statement(s)
            ListenableCompletableFuture<List<Peer>> result = target.waitForPeersOfVersion(0, 0L);
            //Assert statement(s)
            //TODO: Please implement equals method in ListenableCompletableFuture for verification of the entire object or you need to adjust respective assertion statements
            assertThat(result, is(notNullValue()));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            verify(target).findPeersOfAtLeastVersion(0L);
        }
    }

    //Sapient generated method id: ${683bb07f-9146-3548-8dd9-41e82d519c7a}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void waitForPeersOfVersionWhenFoundPeersSizeLessThanNumPeers() {
        /* Branches:
         * (foundPeers.size() >= numPeers) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Peer> peerList = new ArrayList<>();
            doReturn(peerList).when(target).findPeersOfAtLeastVersion(0L);
            doNothing().when(target).addConnectedEventListener((PeerConnectedEventListener) any());
            //Act Statement(s)
            ListenableCompletableFuture<List<Peer>> result = target.waitForPeersOfVersion(1, 0L);
            //Assert statement(s)
            //TODO: Please implement equals method in ListenableCompletableFuture for verification of the entire object or you need to adjust respective assertion statements
            assertThat(result, is(notNullValue()));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            verify(target).findPeersOfAtLeastVersion(0L);
            verify(target).addConnectedEventListener((PeerConnectedEventListener) any());
        }
    }

    //Sapient generated method id: ${fe87eaa8-7ba3-36f3-9e37-8cb1bd0741dc}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void findPeersOfAtLeastVersionWhenPeersIsEmpty() {
        /* Branches:
         * (for-each(peers)) : false
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            List<Peer> result = target.findPeersOfAtLeastVersion(0L);
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
        }
    }

    //Sapient generated method id: ${b6dd6ac3-6fe2-360c-ad7c-4627061b70c0}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute, ListenableCompletableFuture.complete) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void waitForPeersWithServiceMaskWhenFoundPeersSizeGreaterThanOrEqualsToNumPeers() {
        /* Branches:
         * (foundPeers.size() >= numPeers) : true
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Peer> peerList = new ArrayList<>();
            doReturn(peerList).when(target).findPeersWithServiceMask(0);
            //Act Statement(s)
            ListenableCompletableFuture<List<Peer>> result = target.waitForPeersWithServiceMask(0, 0);
            //Assert statement(s)
            //TODO: Please implement equals method in ListenableCompletableFuture for verification of the entire object or you need to adjust respective assertion statements
            assertThat(result, is(notNullValue()));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            verify(target).findPeersWithServiceMask(0);
        }
    }

    //Sapient generated method id: ${a8c23ee9-3539-31e5-8bb8-29aa79cfe993}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void waitForPeersWithServiceMaskWhenFoundPeersSizeLessThanNumPeers() {
        /* Branches:
         * (foundPeers.size() >= numPeers) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Peer> peerList = new ArrayList<>();
            doReturn(peerList).when(target).findPeersWithServiceMask(0);
            doNothing().when(target).addConnectedEventListener((PeerConnectedEventListener) any());
            //Act Statement(s)
            ListenableCompletableFuture<List<Peer>> result = target.waitForPeersWithServiceMask(1, 0);
            //Assert statement(s)
            //TODO: Please implement equals method in ListenableCompletableFuture for verification of the entire object or you need to adjust respective assertion statements
            assertThat(result, is(notNullValue()));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            verify(target).findPeersWithServiceMask(0);
            verify(target).addConnectedEventListener((PeerConnectedEventListener) any());
        }
    }

    //Sapient generated method id: ${683af78c-a093-3a3b-a1bb-04ebdf299658}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void findPeersWithServiceMaskWhenPeersIsEmpty() {
        /* Branches:
         * (for-each(peers)) : false
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            List<Peer> result = target.findPeersWithServiceMask(0);
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
        }
    }

    //Sapient generated method id: ${9c1eb910-2aa2-3688-99a0-09d4ac5946e1}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void getMinBroadcastConnectionsWhenMaxLessThanOrEqualsTo1() {
        /* Branches:
         * (minBroadcastConnections == 0) : true
         * (max <= 1) : true
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            int result = target.getMinBroadcastConnections();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
        }
    }

    //Sapient generated method id: ${c236d1e6-452b-3991-bb5b-5d2519e76564}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void setMinBroadcastConnectionsTest() {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.setMinBroadcastConnections(0);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
        }
    }

    //Sapient generated method id: ${6f502fa7-8df1-3483-9a14-690c8634a0c8}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void broadcastTransactionWhenMaxLessThanOrEqualsTo1() {
        /* Branches:
         * (minBroadcastConnections == 0) : true  #  inside getMinBroadcastConnections method
         * (max <= 1) : true  #  inside getMinBroadcastConnections method
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        TransactionBroadcast transactionBroadcastMock = mock(TransactionBroadcast.class);
        Transaction transactionMock = mock(Transaction.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(transactionBroadcastMock).when(target).broadcastTransaction(transactionMock, 1, true);
            //Act Statement(s)
            TransactionBroadcast result = target.broadcastTransaction(transactionMock);
            //Assert statement(s)
            assertThat(result, equalTo(transactionBroadcastMock));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            verify(target).broadcastTransaction(transactionMock, 1, true);
        }
    }

    //Sapient generated method id: ${ec043fe9-8c6f-38a6-8ab1-e11b0b838720}
    @Ignore(value = "Potential harmful system call (CompletableFuture.whenComplete, ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void broadcastTransaction1WhenTxGetConfidenceNumBroadcastPeersEquals0() {
        /* Branches:
         * (tx.getConfidence().getSource().equals(TransactionConfidence.Source.UNKNOWN)) : true
         * (dropPeersAfterBroadcast) : true
         * (tx.getConfidence().numBroadcastPeers() == 0) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: broadcast
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Transaction txMock = mock(Transaction.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock3 = mock(Sha256Hash.class);
        TransactionConfidence transactionConfidenceMock = mock(TransactionConfidence.class);
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            TransactionConfidence transactionConfidence = new TransactionConfidence(sha256HashMock);
            transactionConfidence.setSource(TransactionConfidence.Source.UNKNOWN);
            doReturn(sha256HashMock2).when(txMock).getTxId();
            TransactionConfidence transactionConfidence2 = new TransactionConfidence(sha256HashMock3);
            transactionConfidence2.setSource(TransactionConfidence.Source.SELF);
            doReturn(transactionConfidence, transactionConfidence2, transactionConfidenceMock).when(txMock).getConfidence();
            doReturn(0).when(transactionConfidenceMock).numBroadcastPeers();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            TransactionBroadcast result = target.broadcastTransaction(txMock, 0, true);
            //Assert statement(s)
            //TODO: Please implement equals method in TransactionBroadcast for verification of the entire object or you need to adjust respective assertion statements
            assertThat(result, is(notNullValue()));
            verify(txMock, times(3)).getConfidence();
            verify(txMock).getTxId();
            verify(transactionConfidenceMock).numBroadcastPeers();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
        }
    }

    //Sapient generated method id: ${8e5e2ada-f040-325d-9d9a-b928ce19164b}
    @Ignore(value = "Potential harmful system call (CompletableFuture.whenComplete, ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void broadcastTransaction1WhenTxGetConfidenceNumBroadcastPeersNotEquals0() {
        /* Branches:
         * (tx.getConfidence().getSource().equals(TransactionConfidence.Source.UNKNOWN)) : true
         * (dropPeersAfterBroadcast) : true
         * (tx.getConfidence().numBroadcastPeers() == 0) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: broadcast
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Transaction txMock = mock(Transaction.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock3 = mock(Sha256Hash.class);
        TransactionConfidence transactionConfidenceMock = mock(TransactionConfidence.class);
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            TransactionConfidence transactionConfidence = new TransactionConfidence(sha256HashMock);
            transactionConfidence.setSource(TransactionConfidence.Source.UNKNOWN);
            doReturn(sha256HashMock2).when(txMock).getTxId();
            TransactionConfidence transactionConfidence2 = new TransactionConfidence(sha256HashMock3);
            transactionConfidence2.setSource(TransactionConfidence.Source.SELF);
            doReturn(transactionConfidence, transactionConfidence2, transactionConfidenceMock).when(txMock).getConfidence();
            doReturn(-1).when(transactionConfidenceMock).numBroadcastPeers();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            TransactionBroadcast result = target.broadcastTransaction(txMock, 0, true);
            //Assert statement(s)
            //TODO: Please implement equals method in TransactionBroadcast for verification of the entire object or you need to adjust respective assertion statements
            assertThat(result, is(notNullValue()));
            verify(txMock, times(3)).getConfidence();
            verify(txMock).getTxId();
            verify(transactionConfidenceMock).numBroadcastPeers();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
        }
    }

    //Sapient generated method id: ${7c0229a4-aba9-32bc-9ae0-56447cc5a725}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void getPingIntervalMsecTest() {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            long result = target.getPingIntervalMsec();
            //Assert statement(s)
            assertThat(result, equalTo(2000L));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
        }
    }

    //Sapient generated method id: ${56faa203-67d3-322e-998f-16db04d52f6d}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void setPingIntervalMsecWhenGetPingIntervalMsecLessThanOrEqualsTo0() {
        /* Branches:
         * (task != null) : false
         * (getPingIntervalMsec() <= 0) : true  #  inside setupPinging method
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.setPingIntervalMsec(0L);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
        }
    }

    //Sapient generated method id: ${f7fc36e2-61a6-39bf-8cd0-d07adb43b06f}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void setPingIntervalMsecWhenGetPingIntervalMsecGreaterThan0() {
        /* Branches:
         * (task != null) : false
         * (getPingIntervalMsec() <= 0) : false  #  inside setupPinging method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.setPingIntervalMsec(1L);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
        }
    }

    //Sapient generated method id: ${1fed8bf1-531c-3b91-8534-5a86d0975cb1}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void getMostCommonChainHeightTest() {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<PeerGroup> peerGroup = mockStatic(PeerGroup.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            peerGroup.when(() -> PeerGroup.getMostCommonChainHeight(any())).thenReturn(0);
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            int result = target.getMostCommonChainHeight();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            peerGroup.verify(() -> PeerGroup.getMostCommonChainHeight(any()));
        }
    }

    //Sapient generated method id: ${3e5b4f21-07c0-3992-9c80-3c77afd779ed}
    @Test()
    public void getMostCommonChainHeight1WhenPeersIsEmpty() {
        /* Branches:
         * (peers.isEmpty()) : true
         */
        //Arrange Statement(s)
        List<Peer> peerList = new ArrayList<>();

        //Act Statement(s)
        int result = PeerGroup.getMostCommonChainHeight(peerList);

        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${0f087146-11c7-3481-973f-17e28fa0a39d}
    @Test()
    public void getMostCommonChainHeight1WhenPeersIsNotEmpty() {
        /* Branches:
         * (peers.isEmpty()) : false
         * (for-each(peers)) : true
         */
        //Arrange Statement(s)
        Peer peerMock = mock(Peer.class);
        try (MockedStatic<PeerGroup> peerGroup = mockStatic(PeerGroup.class, CALLS_REAL_METHODS)) {
            doReturn(1L).when(peerMock).getBestHeight();
            peerGroup.when(() -> PeerGroup.maxOfMostFreq(anyList())).thenReturn(0);
            List<Peer> peerList = new ArrayList<>();
            peerList.add(peerMock);
            //Act Statement(s)
            int result = PeerGroup.getMostCommonChainHeight(peerList);
            List<Peer> peerPeerListList = new ArrayList<>();
            peerPeerListList.add(peerMock);
            //Assert statement(s)
            assertThat(result, equalTo(0));
            assertThat(peerList.size(), equalTo(peerPeerListList.size()));
            //TODO: Please implement equals method in Collection for verification to succeed or you need to adjust respective assertion statements
            assertThat(peerList, containsInRelativeOrder(peerPeerListList.toArray()));
            verify(peerMock, atLeast(1)).getBestHeight();
            peerGroup.verify(() -> PeerGroup.maxOfMostFreq(anyList()), atLeast(1));
        }
    }

    //Sapient generated method id: ${31c8d9fc-29b7-32ef-868c-f9b6d144c34f}
    @Test()
    public void maxOfMostFreqWhenItemsIsEmpty() {
        /* Branches:
         * (items.isEmpty()) : true
         */
        //Arrange Statement(s)
        List<Integer> integerList = new ArrayList<>();

        //Act Statement(s)
        int result = PeerGroup.maxOfMostFreq(integerList);

        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${10e90973-a3f2-3975-b14b-a0ecb2cde9a1}
    @Test()
    public void maxOfMostFreqWhenPairItemEqualsItemAndPairsSizeEquals1() {
        /* Branches:
         * (items.isEmpty()) : false
         * (for-each(items)) : true
         * (pair.item != item) : false
         * (pairs.size() == 1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<Integer> integerList = new ArrayList<>();

        //Act Statement(s)
        int result = PeerGroup.maxOfMostFreq(integerList);

        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${25125bd0-4f27-338f-ad64-74c314ab2403}
    @Test()
    public void maxOfMostFreqWhenFirstPairCountGreaterThanSecondPairCount() {
        /* Branches:
         * (items.isEmpty()) : false
         * (for-each(items)) : true
         * (pair.item != item) : true
         * (pairs.size() == 1) : false
         * (firstPair.count > secondPair.count) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<Integer> integerList = new ArrayList<>();
        integerList.add(42);

        //Act Statement(s)
        int result = PeerGroup.maxOfMostFreq(integerList);

        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${9941d46e-e9ac-3bd1-ad87-69bc7a484900}
    @Test()
    public void maxOfMostFreqWhenFirstPairCountEqualsSecondPairCount() {
        /* Branches:
         * (items.isEmpty()) : false
         * (for-each(items)) : true
         * (pair.item != item) : true
         * (pairs.size() == 1) : false
         * (firstPair.count > secondPair.count) : false
         * (firstPair.count == secondPair.count) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<Integer> integerList = new ArrayList<>();

        //Act Statement(s)
        int result = PeerGroup.maxOfMostFreq(integerList);

        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${ab0b920f-d78b-3f02-939c-f7dd5a9ae8bb}
    @Test()
    public void maxOfMostFreqWhenFirstPairCountNotEqualsSecondPairCountThrowsIllegalStateException() {
        /* Branches:
         * (items.isEmpty()) : false
         * (for-each(items)) : true
         * (pair.item != item) : true
         * (pairs.size() == 1) : false
         * (firstPair.count > secondPair.count) : false
         * (firstPair.count == secondPair.count) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        thrown.expect(IllegalStateException.class);
        List<Integer> integerList = new ArrayList<>();

        //Act Statement(s)
        PeerGroup.maxOfMostFreq(integerList);
    }

    //Sapient generated method id: ${3c962c46-a729-32ba-8921-bf4c756fddbc}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void selectDownloadPeerWhenPeersIsEmpty() {
        /* Branches:
         * (peers.isEmpty()) : true
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Peer> peerList = new ArrayList<>();
            //Act Statement(s)
            Peer result = target.selectDownloadPeer(peerList);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
        }
    }

    //Sapient generated method id: ${5df4348d-1612-3a0d-94ad-b5f29d3b5d1a}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void selectDownloadPeerWhenMostCommonChainHeightEquals0() {
        /* Branches:
         * (peers.isEmpty()) : false
         * (mostCommonChainHeight == 0) : true
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        Peer peerMock = mock(Peer.class);
        try (MockedStatic<PeerGroup> peerGroup = mockStatic(PeerGroup.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            peerGroup.when(() -> PeerGroup.getMostCommonChainHeight(anyList())).thenReturn(0);
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Peer> peerList = new ArrayList<>();
            peerList.add(peerMock);
            //Act Statement(s)
            Peer result = target.selectDownloadPeer(peerList);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            peerGroup.verify(() -> PeerGroup.getMostCommonChainHeight(anyList()));
        }
    }

    //Sapient generated method id: ${bcdaf7dc-99fa-3278-ade1-7f25a7fd3078}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void selectDownloadPeerWhenVersionMessageClientVersionLessThanMINIMUM_VERSIONAndCandidatesIsEmpty() {
        /* Branches:
         * (peers.isEmpty()) : false
         * (mostCommonChainHeight == 0) : false
         * (for-each(peers)) : true
         * (versionMessage.clientVersion < MINIMUM_VERSION) : true
         * (candidates.isEmpty()) : true
         */
        //Arrange Statement(s)
        Peer peerMock = mock(Peer.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<PeerGroup> peerGroup = mockStatic(PeerGroup.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(versionMessageMock).when(peerMock).getPeerVersionMessage();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            peerGroup.when(() -> PeerGroup.getMostCommonChainHeight(anyList())).thenReturn(1);
            versionMessageMock.clientVersion = 1;
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Peer> peerList = new ArrayList<>();
            peerList.add(peerMock);
            //Act Statement(s)
            Peer result = target.selectDownloadPeer(peerList);
            List<Peer> peerPeerListList = new ArrayList<>();
            peerPeerListList.add(peerMock);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            assertThat(peerList.size(), equalTo(peerPeerListList.size()));
            //TODO: Please implement equals method in Collection for verification to succeed or you need to adjust respective assertion statements
            assertThat(peerList, containsInRelativeOrder(peerPeerListList.toArray()));
            verify(peerMock).getPeerVersionMessage();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            peerGroup.verify(() -> PeerGroup.getMostCommonChainHeight(anyList()));
        }
    }

    //Sapient generated method id: ${b297a87a-1219-33f3-b732-dbcaaa56aabd}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void selectDownloadPeerWhenVersionMessageServicesNotHasServicesNODE_NETWORKAndCandidatesIsEmpty() {
        /* Branches:
         * (peers.isEmpty()) : false
         * (mostCommonChainHeight == 0) : false
         * (for-each(peers)) : true
         * (versionMessage.clientVersion < MINIMUM_VERSION) : false
         * (!versionMessage.services().has(Services.NODE_NETWORK)) : true
         * (candidates.isEmpty()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Peer peerMock = mock(Peer.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        Services servicesMock = mock(Services.class);
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<PeerGroup> peerGroup = mockStatic(PeerGroup.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(versionMessageMock).when(peerMock).getPeerVersionMessage();
            doReturn(servicesMock).when(versionMessageMock).services();
            doReturn(false).when(servicesMock).has(1L);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            peerGroup.when(() -> PeerGroup.getMostCommonChainHeight(anyList())).thenReturn(1);
            versionMessageMock.clientVersion = 70012;
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Peer> peerList = new ArrayList<>();
            peerList.add(peerMock);
            //Act Statement(s)
            Peer result = target.selectDownloadPeer(peerList);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            verify(peerMock).getPeerVersionMessage();
            verify(versionMessageMock).services();
            verify(servicesMock).has(1L);
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            peerGroup.verify(() -> PeerGroup.getMostCommonChainHeight(anyList()));
        }
    }

    //Sapient generated method id: ${f99a8d00-7d01-36f3-b05d-fa0e595508df}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void selectDownloadPeerWhenVersionMessageServicesNotHasServicesNODE_WITNESSAndCandidatesIsEmpty() {
        /* Branches:
         * (peers.isEmpty()) : false
         * (mostCommonChainHeight == 0) : false
         * (for-each(peers)) : true
         * (versionMessage.clientVersion < MINIMUM_VERSION) : false
         * (!versionMessage.services().has(Services.NODE_NETWORK)) : false
         * (!versionMessage.services().has(Services.NODE_WITNESS)) : true
         * (candidates.isEmpty()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Peer peerMock = mock(Peer.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        Services servicesMock = mock(Services.class);
        Services servicesMock2 = mock(Services.class);
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<PeerGroup> peerGroup = mockStatic(PeerGroup.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(versionMessageMock).when(peerMock).getPeerVersionMessage();
            doReturn(true).when(servicesMock).has(1L);
            doReturn(servicesMock, servicesMock2).when(versionMessageMock).services();
            doReturn(false).when(servicesMock2).has(8L);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            peerGroup.when(() -> PeerGroup.getMostCommonChainHeight(anyList())).thenReturn(1);
            versionMessageMock.clientVersion = 70012;
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Peer> peerList = new ArrayList<>();
            peerList.add(peerMock);
            //Act Statement(s)
            Peer result = target.selectDownloadPeer(peerList);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            verify(peerMock).getPeerVersionMessage();
            verify(versionMessageMock, times(2)).services();
            verify(servicesMock).has(1L);
            verify(servicesMock2).has(8L);
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            peerGroup.verify(() -> PeerGroup.getMostCommonChainHeight(anyList()));
        }
    }

    //Sapient generated method id: ${ba10b37a-913b-3e0e-94da-f49f55da4357}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void selectDownloadPeerWhenPeerHeightGreaterThanMostCommonChainHeightPlus1AndCandidatesIsEmpty() {
        /* Branches:
         * (peers.isEmpty()) : false
         * (mostCommonChainHeight == 0) : false
         * (for-each(peers)) : true
         * (versionMessage.clientVersion < MINIMUM_VERSION) : false
         * (!versionMessage.services().has(Services.NODE_NETWORK)) : false
         * (!versionMessage.services().has(Services.NODE_WITNESS)) : false
         * (peerHeight < mostCommonChainHeight) : false
         * (peerHeight > mostCommonChainHeight + 1) : true
         * (candidates.isEmpty()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Peer peerMock = mock(Peer.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        Services servicesMock = mock(Services.class);
        Services servicesMock2 = mock(Services.class);
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<PeerGroup> peerGroup = mockStatic(PeerGroup.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(versionMessageMock).when(peerMock).getPeerVersionMessage();
            doReturn(true).when(servicesMock).has(1L);
            doReturn(servicesMock, servicesMock2).when(versionMessageMock).services();
            doReturn(true).when(servicesMock2).has(8L);
            doReturn(1L).when(peerMock).getBestHeight();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            peerGroup.when(() -> PeerGroup.getMostCommonChainHeight(anyList())).thenReturn(-1);
            versionMessageMock.clientVersion = 70012;
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Peer> peerList = new ArrayList<>();
            peerList.add(peerMock);
            //Act Statement(s)
            Peer result = target.selectDownloadPeer(peerList);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            verify(peerMock).getPeerVersionMessage();
            verify(versionMessageMock, times(2)).services();
            verify(servicesMock).has(1L);
            verify(servicesMock2).has(8L);
            verify(peerMock).getBestHeight();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            peerGroup.verify(() -> PeerGroup.getMostCommonChainHeight(anyList()));
        }
    }

    //Sapient generated method id: ${a8fd5eb3-6142-3261-8c24-2eb39c6eaf6b}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void selectDownloadPeerWhenGetPriorityPeerPeerAddressNotLessThanHighestPriority() {
        /* Branches:
         * (peers.isEmpty()) : false
         * (mostCommonChainHeight == 0) : false
         * (for-each(peers)) : true
         * (versionMessage.clientVersion < MINIMUM_VERSION) : false
         * (!versionMessage.services().has(Services.NODE_NETWORK)) : false
         * (!versionMessage.services().has(Services.NODE_WITNESS)) : false
         * (peerHeight < mostCommonChainHeight) : false
         * (peerHeight > mostCommonChainHeight + 1) : false
         * (priority != null) : false  #  inside getPriority method
         * (candidates.isEmpty()) : false
         * (i.hasNext()) : true
         * (getPriority(peer.peerAddress) < highestPriority) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Peer peerMock = mock(Peer.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        Services servicesMock = mock(Services.class);
        Services servicesMock2 = mock(Services.class);
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<PeerGroup> peerGroup = mockStatic(PeerGroup.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(versionMessageMock).when(peerMock).getPeerVersionMessage();
            doReturn(true).when(servicesMock).has(1L);
            doReturn(servicesMock, servicesMock2).when(versionMessageMock).services();
            doReturn(true).when(servicesMock2).has(8L);
            doReturn(-1L).when(peerMock).getBestHeight();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            peerGroup.when(() -> PeerGroup.getMostCommonChainHeight(anyList())).thenReturn(-1);
            versionMessageMock.clientVersion = 70012;
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Peer> peerList = new ArrayList<>();
            peerList.add(peerMock);
            //Act Statement(s)
            Peer result = target.selectDownloadPeer(peerList);
            //Assert statement(s)
            assertThat(result, equalTo(peerMock));
            verify(peerMock).getPeerVersionMessage();
            verify(versionMessageMock, times(2)).services();
            verify(servicesMock).has(1L);
            verify(servicesMock2).has(8L);
            verify(peerMock).getBestHeight();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            peerGroup.verify(() -> PeerGroup.getMostCommonChainHeight(anyList()));
        }
    }

    //Sapient generated method id: ${cbbe2d00-e0df-318d-a10e-3489531594ff}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void getDownloadPeerTest() {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            Peer result = target.getDownloadPeer();
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
        }
    }

    //Sapient generated method id: ${503873fe-45c7-3515-a88e-c64f607c2975}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void getUseLocalhostPeerWhenPossibleTest() {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.getUseLocalhostPeerWhenPossible();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
        }
    }

    //Sapient generated method id: ${59976503-fc32-3fa3-a3b3-e7f83bc7b216}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void setUseLocalhostPeerWhenPossibleTest() {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        Block blockMock = mock(Block.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(paramsMock);
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.setUseLocalhostPeerWhenPossible(false);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
        }
    }
}
