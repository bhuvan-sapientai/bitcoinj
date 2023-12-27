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
import org.bitcoinj.utils.ContextPropagatingThreadFactory;

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

import org.mockito.stubbing.Answer;

import java.util.concurrent.ScheduledExecutorService;

import org.bitcoinj.base.internal.Preconditions;
import org.bitcoinj.utils.ListenerRegistration;
import org.bitcoinj.base.Sha256Hash;

import java.net.InetAddress;

import org.bitcoinj.core.listeners.PreMessageReceivedEventListener;

import java.time.Instant;

import org.bitcoinj.wallet.listeners.WalletCoinsReceivedEventListener;
import org.junit.rules.ExpectedException;

import java.util.List;

import org.bitcoinj.wallet.Wallet;
import org.bitcoinj.core.listeners.PeerDisconnectedEventListener;
import org.bitcoinj.core.listeners.BlocksDownloadedEventListener;
import org.bitcoinj.core.listeners.PeerDiscoveredEventListener;
import org.bitcoinj.utils.ListenableCompletableFuture;
import org.bitcoinj.script.ScriptPattern;

import java.util.concurrent.locks.ReentrantLock;

import org.bitcoinj.core.listeners.OnTransactionBroadcastListener;
import org.bitcoinj.wallet.listeners.WalletCoinsSentEventListener;

import java.util.concurrent.Executor;

import org.bitcoinj.core.listeners.BlockchainDownloadEventListener;

import java.util.concurrent.CopyOnWriteArrayList;

import org.bitcoinj.base.internal.Stopwatch;
import org.bitcoinj.net.discovery.PeerDiscovery;

import java.util.function.Supplier;

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
import static org.hamcrest.Matchers.isA;

import java.net.Inet6Address;

public class PeerGroupSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final ClientConnectionManager channelsMock = mock(ClientConnectionManager.class, "org.bitcoinj.net.DefaultClientConnectionManager");

    private final NetworkParameters paramsMock = mock(NetworkParameters.class, "params");

    private final Peer downloadPeerMock = mock(Peer.class, "downloadPeer");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private PeerGroup target;

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    private final Block blockMock = mock(Block.class);

    private final BlocksDownloadedEventListener blocksDownloadedEventListenerMock = mock(BlocksDownloadedEventListener.class, "BlocksDownloadedEventListener");

    private final ChainDownloadStartedEventListener chainDownloadStartedEventListenerMock = mock(ChainDownloadStartedEventListener.class, "ChainDownloadStartedEventListener");

    private final GetDataEventListener getDataEventListenerMock = mock(GetDataEventListener.class, "GetDataEventListener");

    private final KeyChainEventListener keyChainEventListenerMock = mock(KeyChainEventListener.class);

    private final ListenableCompletableFuture<BloomFilter> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);

    private final ListenableCompletableFuture<BloomFilter> listenableCompletableFutureMock2 = mock(ListenableCompletableFuture.class);

    private final ListenableCompletableFuture<BloomFilter> listenableCompletableFutureMock3 = mock(ListenableCompletableFuture.class);

    private final ListenableCompletableFuture<BloomFilter> listenableCompletableFutureMock4 = mock(ListenableCompletableFuture.class);

    private final Network networkMock = mock(Network.class, "NetworkParameters");

    private final NetworkParameters networkParameters2Mock = mock(NetworkParameters.class);

    private final NetworkParameters networkParametersMock = mock(NetworkParameters.class);

    private final OnTransactionBroadcastListener onTransactionBroadcastListenerMock = mock(OnTransactionBroadcastListener.class, "mock(OnTransactionBroadcastListener.class)");

    private final PeerAddress peerAddressMock = mock(PeerAddress.class, "127.0.0.1");

    private final PeerDisconnectedEventListener peerDisconnectedEventListenerMock = mock(PeerDisconnectedEventListener.class);

    private final PeerDiscoveredEventListener peerDiscoveredEventListenerMock = mock(PeerDiscoveredEventListener.class, "{}");

    private final PeerDiscovery peerDiscoveryMock = mock(PeerDiscovery.class, "{}");

    private final Peer peerMock = mock(Peer.class);

    private final Peer peerMock2 = mock(Peer.class);

    private final Script scriptMock = mock(Script.class);

    private final ScriptsChangeEventListener scriptsChangeEventListenerMock = mock(ScriptsChangeEventListener.class);

    private final WalletCoinsReceivedEventListener walletCoinsReceivedEventListenerMock = mock(WalletCoinsReceivedEventListener.class);

    private final WalletCoinsSentEventListener walletCoinsSentEventListenerMock = mock(WalletCoinsSentEventListener.class);

    private final Wallet walletMock = mock(Wallet.class, "{}");

    @After()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${cb33b91b-16f1-327e-b146-dfad5ae870f6}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.execute) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void createPrivateExecutorTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "org.bitcoinj.params.MainNetParams");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001"));
            //Act Statement(s)
            ScheduledExecutorService result = target.createPrivateExecutor();
            ContextPropagatingThreadFactory contextPropagatingThreadFactory = new ContextPropagatingThreadFactory("PeerGroup Thread");
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, contextPropagatingThreadFactory);
            //Assert statement(s)
            //TODO: Please implement equals method in ScheduledThreadPoolExecutor for verification to succeed or you need to adjust respective assertion statements
            assertThat(result, equalTo(scheduledThreadPoolExecutor));
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
        }
    }

    //Sapient generated method id: ${efa8b7ba-547d-3487-81c0-78589231666c}
    @Ignore()
    @Test()
    public void setPeerDiscoveryTimeoutMillisTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "2009-01-03T18:15:05Z");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.01"));
            //Act Statement(s)
            target.setPeerDiscoveryTimeoutMillis(5000L);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
        }
    }

    //Sapient generated method id: ${11ae18ce-e011-3c9f-9e7d-f093d92515b6}
    @Ignore()
    @Test()
    public void setMaxConnectionsWhenIsRunningNot() {
        /* Branches:
         * (!isRunning()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "{}");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001")));
            doReturn(false).when(target).isRunning();
            //Act Statement(s)
            target.setMaxConnections(10);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
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
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.5")));
            doReturn(true).when(target).isRunning();
            doReturn(0).when(channelsMock).getConnectedClientCount();
            //Act Statement(s)
            target.setMaxConnections(10);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            verify(target).isRunning();
            verify(channelsMock).getConnectedClientCount();
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
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "MainNetParams.get()");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.01")));
            doReturn(true).when(target).isRunning();
            doReturn(0).when(channelsMock).getConnectedClientCount();
            //Act Statement(s)
            target.setMaxConnections(10);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            verify(target).isRunning();
            verify(channelsMock).getConnectedClientCount();
        }
    }

    //Sapient generated method id: ${9c517028-2356-3ca8-828b-5a010f60b4ca}
    @Ignore()
    @Test()
    public void setDownloadTxDependenciesTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "null");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            //Act Statement(s)
            target.setDownloadTxDependencies(0);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
        }
    }

    //Sapient generated method id: ${45136a99-8f6c-3d89-857e-67b9abc5e077}
    @Ignore()
    @Test()
    public void getMaxConnectionsTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            //Act Statement(s)
            int result = target.getMaxConnections();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
        }
    }

    //Sapient generated method id: ${ec5e3d76-0e27-3024-a795-17953482547e}
    @Ignore()
    @Test()
    public void setVersionMessageTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "MAIN");
        NetworkParameters networkParameters3Mock = mock(NetworkParameters.class);
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.01"));
            VersionMessage versionMessage = new VersionMessage(networkParameters3Mock, 0);
            //Act Statement(s)
            target.setVersionMessage(versionMessage);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
        }
    }

    //Sapient generated method id: ${a678031a-49c7-33a2-9dc7-68eee3991e1b}
    @Ignore()
    @Test()
    public void getVersionMessageTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "{}");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001"));
            //Act Statement(s)
            VersionMessage result = target.getVersionMessage();
            VersionMessage versionMessage = new VersionMessage(networkParameters2, 0);
            //Assert statement(s)
            assertThat(result, equalTo(versionMessage));
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
        }
    }

    //Sapient generated method id: ${35b39a80-30c8-31c4-b53e-c4666c9ab85d}
    @Ignore()
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
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            doReturn(blockMock).when(networkParametersMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            ReentrantLock reentrantLock = Threading.lock(PeerGroup.class);
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = Context.getOrCreate();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            //Act Statement(s)
            target.setUserAgent("name1", "version1", "comments1");
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(networkParametersMock).getGenesisBlock();
            verify(blockMock).time();
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
        }
    }

    //Sapient generated method id: ${25705440-7d99-3519-a66f-c6fc8a45b160}
    @Ignore()
    @Test()
    public void setUserAgent1Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "null");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParametersMock);
            doReturn(blockMock).when(networkParametersMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            ReentrantLock reentrantLock = Threading.lock(PeerGroup.class);
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = Context.getOrCreate();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            doNothing().when(target).setUserAgent("MyPeerGroup", "1.0", (String) null);
            //Act Statement(s)
            target.setUserAgent("MyPeerGroup", "1.0");
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            verify(networkParametersMock).getGenesisBlock();
            verify(blockMock).time();
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            verify(target).setUserAgent("MyPeerGroup", "1.0", (String) null);
        }
    }

    //Sapient generated method id: ${00c52a61-8e62-37ad-8f02-af5ff7dff678}
    @Ignore()
    @Test()
    public void addBlocksDownloadedEventListenerTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BlocksDownloadedEventListener blocksDownloadedEventListenerMock = mock(BlocksDownloadedEventListener.class, "Block");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            doNothing().when(target).addBlocksDownloadedEventListener((Executor) null, blocksDownloadedEventListenerMock);
            //Act Statement(s)
            target.addBlocksDownloadedEventListener(blocksDownloadedEventListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            verify(target).addBlocksDownloadedEventListener((Executor) null, blocksDownloadedEventListenerMock);
        }
    }

    //Sapient generated method id: ${5435a88a-afa5-34ec-bf1f-95244c0f487e}
    @Ignore()
    @Test()
    public void addBlocksDownloadedEventListener1WhenGetPendingPeersIsNotEmpty() {
        /* Branches:
         * (for-each(getConnectedPeers())) : true
         * (for-each(getPendingPeers())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "void");
        BlocksDownloadedEventListener blocksDownloadedEventListenerMock = mock(BlocksDownloadedEventListener.class, "void");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            List<Peer> peerList = new ArrayList<>();
            peerList.add(peerMock);
            doReturn(peerList).when(target).getConnectedPeers();
            doNothing().when(peerMock).addBlocksDownloadedEventListener((Executor) null, blocksDownloadedEventListenerMock);
            List<Peer> peerList2 = new ArrayList<>();
            peerList2.add(peerMock2);
            doReturn(peerList2).when(target).getPendingPeers();
            doNothing().when(peerMock2).addBlocksDownloadedEventListener((Executor) null, blocksDownloadedEventListenerMock);
            //TODO: Needs initialization with real value
            Executor executor = null;
            //Act Statement(s)
            target.addBlocksDownloadedEventListener(executor, blocksDownloadedEventListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            verify(target).getConnectedPeers();
            verify(peerMock).addBlocksDownloadedEventListener((Executor) null, blocksDownloadedEventListenerMock);
            verify(target).getPendingPeers();
            verify(peerMock2).addBlocksDownloadedEventListener((Executor) null, blocksDownloadedEventListenerMock);
        }
    }

    //Sapient generated method id: ${c11d7f2e-8338-3fd7-b80d-222bef42da68}
    @Ignore()
    @Test()
    public void addChainDownloadStartedEventListenerTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            doNothing().when(target).addChainDownloadStartedEventListener((Executor) null, chainDownloadStartedEventListenerMock);
            //Act Statement(s)
            target.addChainDownloadStartedEventListener(chainDownloadStartedEventListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            verify(target).addChainDownloadStartedEventListener((Executor) null, chainDownloadStartedEventListenerMock);
        }
    }

    //Sapient generated method id: ${5827ffa3-910a-3344-b3c1-185c12bd5c8e}
    @Ignore()
    @Test()
    public void addChainDownloadStartedEventListener1WhenGetPendingPeersIsNotEmpty() {
        /* Branches:
         * (for-each(getConnectedPeers())) : true
         * (for-each(getPendingPeers())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        ChainDownloadStartedEventListener chainDownloadStartedEventListenerMock = mock(ChainDownloadStartedEventListener.class);
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            doReturn(blockMock).when(networkParametersMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            ReentrantLock reentrantLock = Threading.lock(PeerGroup.class);
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = Context.getOrCreate();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            List<Peer> peerList = new ArrayList<>();
            peerList.add(peerMock);
            doReturn(peerList).when(target).getConnectedPeers();
            doNothing().when(peerMock).addChainDownloadStartedEventListener((Executor) null, chainDownloadStartedEventListenerMock);
            List<Peer> peerList2 = new ArrayList<>();
            peerList2.add(peerMock2);
            doReturn(peerList2).when(target).getPendingPeers();
            doNothing().when(peerMock2).addChainDownloadStartedEventListener((Executor) null, chainDownloadStartedEventListenerMock);
            //TODO: Needs initialization with real value
            Executor executor = null;
            //Act Statement(s)
            target.addChainDownloadStartedEventListener(executor, chainDownloadStartedEventListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(networkParametersMock).getGenesisBlock();
            verify(blockMock).time();
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            verify(target).getConnectedPeers();
            verify(peerMock).addChainDownloadStartedEventListener((Executor) null, chainDownloadStartedEventListenerMock);
            verify(target).getPendingPeers();
            verify(peerMock2).addChainDownloadStartedEventListener((Executor) null, chainDownloadStartedEventListenerMock);
        }
    }

    //Sapient generated method id: ${551c84dc-3cfa-36cf-9cd9-0a39cdbeebcb}
    @Ignore()
    @Test()
    public void addConnectedEventListenerTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "null");
        PeerConnectedEventListener peerConnectedEventListenerMock = mock(PeerConnectedEventListener.class, "null");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            doNothing().when(target).addConnectedEventListener((Executor) null, peerConnectedEventListenerMock);
            //Act Statement(s)
            target.addConnectedEventListener(peerConnectedEventListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            verify(target).addConnectedEventListener((Executor) null, peerConnectedEventListenerMock);
        }
    }

    //Sapient generated method id: ${559dc831-c890-3f1d-ad16-2e8e52a4ee44}
    @Ignore()
    @Test()
    public void addDisconnectedEventListenerTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "Network");
        PeerDisconnectedEventListener peerDisconnectedEventListenerMock = mock(PeerDisconnectedEventListener.class, "PeerDisconnectedEventListener");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001")));
            doNothing().when(target).addDisconnectedEventListener((Executor) null, peerDisconnectedEventListenerMock);
            //Act Statement(s)
            target.addDisconnectedEventListener(peerDisconnectedEventListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            verify(target).addDisconnectedEventListener((Executor) null, peerDisconnectedEventListenerMock);
        }
    }

    //Sapient generated method id: ${72082d6c-f76a-38e0-952a-0dde856f6d1a}
    @Ignore()
    @Test()
    public void addDisconnectedEventListener1WhenGetPendingPeersIsNotEmpty() {
        /* Branches:
         * (for-each(getConnectedPeers())) : true
         * (for-each(getPendingPeers())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            doReturn(blockMock).when(networkParametersMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            ReentrantLock reentrantLock = Threading.lock(PeerGroup.class);
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = Context.getOrCreate();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            List<Peer> peerList = new ArrayList<>();
            peerList.add(peerMock);
            doReturn(peerList).when(target).getConnectedPeers();
            doNothing().when(peerMock).addDisconnectedEventListener((Executor) null, peerDisconnectedEventListenerMock);
            List<Peer> peerList2 = new ArrayList<>();
            peerList2.add(peerMock2);
            doReturn(peerList2).when(target).getPendingPeers();
            doNothing().when(peerMock2).addDisconnectedEventListener((Executor) null, peerDisconnectedEventListenerMock);
            //TODO: Needs initialization with real value
            Executor executor = null;
            //Act Statement(s)
            target.addDisconnectedEventListener(executor, peerDisconnectedEventListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(networkParametersMock).getGenesisBlock();
            verify(blockMock).time();
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            verify(target).getConnectedPeers();
            verify(peerMock).addDisconnectedEventListener((Executor) null, peerDisconnectedEventListenerMock);
            verify(target).getPendingPeers();
            verify(peerMock2).addDisconnectedEventListener((Executor) null, peerDisconnectedEventListenerMock);
        }
    }

    //Sapient generated method id: ${36cf38b3-d373-3673-bb85-18cfb8797309}
    @Ignore()
    @Test()
    public void addDiscoveredEventListenerTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "{}");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001")));
            doNothing().when(target).addDiscoveredEventListener((Executor) null, peerDiscoveredEventListenerMock);
            //Act Statement(s)
            target.addDiscoveredEventListener(peerDiscoveredEventListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            verify(target).addDiscoveredEventListener((Executor) null, peerDiscoveredEventListenerMock);
        }
    }

    //Sapient generated method id: ${d4bf8154-d870-32ff-82ab-6903dc65d173}
    @Ignore()
    @Test()
    public void addDiscoveredEventListener1Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "org.bitcoinj.params.MainNetParams");
        PeerDiscoveredEventListener peerDiscoveredEventListenerMock = mock(PeerDiscoveredEventListener.class, "com.example.PeerDiscoveredEventListener$1");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001"));
            //TODO: Needs initialization with real value
            Executor executor = null;
            //Act Statement(s)
            target.addDiscoveredEventListener(executor, peerDiscoveredEventListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
        }
    }

    //Sapient generated method id: ${4cd1dec5-33aa-3127-a1c4-c5d7aa3f1524}
    @Ignore()
    @Test()
    public void addGetDataEventListenerTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "null");
        GetDataEventListener getDataEventListenerMock = mock(GetDataEventListener.class, "null");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            doNothing().when(target).addGetDataEventListener((Executor) null, getDataEventListenerMock);
            //Act Statement(s)
            target.addGetDataEventListener(getDataEventListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            verify(target).addGetDataEventListener((Executor) null, getDataEventListenerMock);
        }
    }

    //Sapient generated method id: ${80bbf267-e8d5-3730-9b98-e9a8bbf44e9d}
    @Ignore()
    @Test()
    public void addGetDataEventListener1WhenGetPendingPeersIsNotEmpty() {
        /* Branches:
         * (for-each(getConnectedPeers())) : true
         * (for-each(getPendingPeers())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "1000000");
        GetDataEventListener getDataEventListenerMock = mock(GetDataEventListener.class, "{}");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            List<Peer> peerList = new ArrayList<>();
            peerList.add(peerMock);
            doReturn(peerList).when(target).getConnectedPeers();
            doNothing().when(peerMock).addGetDataEventListener((Executor) null, getDataEventListenerMock);
            List<Peer> peerList2 = new ArrayList<>();
            peerList2.add(peerMock2);
            doReturn(peerList2).when(target).getPendingPeers();
            doNothing().when(peerMock2).addGetDataEventListener((Executor) null, getDataEventListenerMock);
            //TODO: Needs initialization with real value
            Executor executor = null;
            //Act Statement(s)
            target.addGetDataEventListener(executor, getDataEventListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            verify(target).getConnectedPeers();
            verify(peerMock).addGetDataEventListener((Executor) null, getDataEventListenerMock);
            verify(target).getPendingPeers();
            verify(peerMock2).addGetDataEventListener((Executor) null, getDataEventListenerMock);
        }
    }

    //Sapient generated method id: ${fa4a053c-3288-3757-bf2a-9bd35587f295}
    @Ignore()
    @Test()
    public void addOnTransactionBroadcastListenerTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "null");
        OnTransactionBroadcastListener onTransactionBroadcastListenerMock = mock(OnTransactionBroadcastListener.class, "null");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            doNothing().when(target).addOnTransactionBroadcastListener((Executor) null, onTransactionBroadcastListenerMock);
            //Act Statement(s)
            target.addOnTransactionBroadcastListener(onTransactionBroadcastListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            verify(target).addOnTransactionBroadcastListener((Executor) null, onTransactionBroadcastListenerMock);
        }
    }

    //Sapient generated method id: ${f1254035-251b-3540-bb40-b89df80b34b9}
    @Ignore()
    @Test()
    public void addOnTransactionBroadcastListener1WhenGetPendingPeersIsNotEmpty() {
        /* Branches:
         * (for-each(getConnectedPeers())) : true
         * (for-each(getPendingPeers())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "org.bitcoinj.params.MainNetParams");
        OnTransactionBroadcastListener onTransactionBroadcastListenerMock = mock(OnTransactionBroadcastListener.class, "com.example.OnTransactionBroadcastListener");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.00010")));
            List<Peer> peerList = new ArrayList<>();
            peerList.add(peerMock);
            doReturn(peerList).when(target).getConnectedPeers();
            doNothing().when(peerMock).addOnTransactionBroadcastListener((Executor) null, onTransactionBroadcastListenerMock);
            List<Peer> peerList2 = new ArrayList<>();
            peerList2.add(peerMock2);
            doReturn(peerList2).when(target).getPendingPeers();
            doNothing().when(peerMock2).addOnTransactionBroadcastListener((Executor) null, onTransactionBroadcastListenerMock);
            //TODO: Needs initialization with real value
            Executor executor = null;
            //Act Statement(s)
            target.addOnTransactionBroadcastListener(executor, onTransactionBroadcastListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            verify(target).getConnectedPeers();
            verify(peerMock).addOnTransactionBroadcastListener((Executor) null, onTransactionBroadcastListenerMock);
            verify(target).getPendingPeers();
            verify(peerMock2).addOnTransactionBroadcastListener((Executor) null, onTransactionBroadcastListenerMock);
        }
    }

    //Sapient generated method id: ${d6c619a0-0eb3-3165-9522-25eb00b3cf25}
    @Ignore()
    @Test()
    public void addPreMessageReceivedEventListenerTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        PreMessageReceivedEventListener preMessageReceivedEventListenerMock = mock(PreMessageReceivedEventListener.class);
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            doNothing().when(target).addPreMessageReceivedEventListener((Executor) null, preMessageReceivedEventListenerMock);
            //Act Statement(s)
            target.addPreMessageReceivedEventListener(preMessageReceivedEventListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            verify(target).addPreMessageReceivedEventListener((Executor) null, preMessageReceivedEventListenerMock);
        }
    }

    //Sapient generated method id: ${863c2c9f-1e4a-3af4-adf0-09e324146bb0}
    @Ignore()
    @Test()
    public void removeBlocksDownloadedEventListenerWhenResult() {
        /* Branches:
         * (for-each(getConnectedPeers())) : true
         * (for-each(getPendingPeers())) : true
         * (result) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
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
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            verify(target).getConnectedPeers();
            verify(peerMock).removeBlocksDownloadedEventListener(blocksDownloadedEventListenerMock);
            verify(target).getPendingPeers();
            verify(peerMock2).removeBlocksDownloadedEventListener(blocksDownloadedEventListenerMock);
        }
    }

    //Sapient generated method id: ${1f4269cd-8504-3847-828c-56a88d825f72}
    @Ignore()
    @Test()
    public void removeBlocksDownloadedEventListenerWhenNotResult() {
        /* Branches:
         * (for-each(getConnectedPeers())) : true
         * (for-each(getPendingPeers())) : true
         * (result) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
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
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            verify(target).getConnectedPeers();
            verify(peerMock).removeBlocksDownloadedEventListener(blocksDownloadedEventListenerMock);
            verify(target).getPendingPeers();
            verify(peerMock2).removeBlocksDownloadedEventListener(blocksDownloadedEventListenerMock);
        }
    }

    //Sapient generated method id: ${661e71ae-b95a-32e0-be72-a0992d64b79e}
    @Ignore()
    @Test()
    public void removeChainDownloadStartedEventListenerWhenResult() {
        /* Branches:
         * (for-each(getConnectedPeers())) : true
         * (for-each(getPendingPeers())) : true
         * (result) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "NetworkParameters.MAIN_NET");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001")));
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
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            verify(target).getConnectedPeers();
            verify(peerMock).removeChainDownloadStartedEventListener(chainDownloadStartedEventListenerMock);
            verify(target).getPendingPeers();
            verify(peerMock2).removeChainDownloadStartedEventListener(chainDownloadStartedEventListenerMock);
        }
    }

    //Sapient generated method id: ${4fa3699b-1b8d-32e7-8bce-d2cc70485096}
    @Ignore()
    @Test()
    public void removeChainDownloadStartedEventListenerWhenNotResult() {
        /* Branches:
         * (for-each(getConnectedPeers())) : true
         * (for-each(getPendingPeers())) : true
         * (result) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001")));
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
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            verify(target).getConnectedPeers();
            verify(peerMock).removeChainDownloadStartedEventListener(chainDownloadStartedEventListenerMock);
            verify(target).getPendingPeers();
            verify(peerMock2).removeChainDownloadStartedEventListener(chainDownloadStartedEventListenerMock);
        }
    }

    //Sapient generated method id: ${2555eef3-cc1d-3b14-99ca-4f9bd99af158}
    @Ignore()
    @Test()
    public void removeConnectedEventListenerWhenResult() {
        /* Branches:
         * (for-each(getConnectedPeers())) : true
         * (for-each(getPendingPeers())) : true
         * (result) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "<new instance of Network>");
        PeerConnectedEventListener peerConnectedEventListenerMock = mock(PeerConnectedEventListener.class, "<mock object of PeerConnectedEventListener>");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001")));
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
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            verify(target).getConnectedPeers();
            verify(peerMock).removeConnectedEventListener(peerConnectedEventListenerMock);
            verify(target).getPendingPeers();
            verify(peerMock2).removeConnectedEventListener(peerConnectedEventListenerMock);
        }
    }

    //Sapient generated method id: ${b4e66288-0940-3018-a8fb-a326fc0c2770}
    @Ignore()
    @Test()
    public void removeConnectedEventListenerWhenNotResult() {
        /* Branches:
         * (for-each(getConnectedPeers())) : true
         * (for-each(getPendingPeers())) : true
         * (result) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "{}");
        PeerConnectedEventListener peerConnectedEventListenerMock = mock(PeerConnectedEventListener.class, "{}");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001")));
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
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            verify(target).getConnectedPeers();
            verify(peerMock).removeConnectedEventListener(peerConnectedEventListenerMock);
            verify(target).getPendingPeers();
            verify(peerMock2).removeConnectedEventListener(peerConnectedEventListenerMock);
        }
    }

    //Sapient generated method id: ${093a1a63-e865-36b6-9f87-44997902164a}
    @Ignore()
    @Test()
    public void removeDisconnectedEventListenerWhenResult() {
        /* Branches:
         * (for-each(getConnectedPeers())) : true
         * (for-each(getPendingPeers())) : true
         * (result) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            doReturn(blockMock).when(networkParametersMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            ReentrantLock reentrantLock = Threading.lock(PeerGroup.class);
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = Context.getOrCreate();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(peerDisconnectedEventListenerMock), any())).thenReturn(true);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
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
            verify(networkParametersMock).getGenesisBlock();
            verify(blockMock).time();
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(peerDisconnectedEventListenerMock), any()));
            verify(target).getConnectedPeers();
            verify(peerMock).removeDisconnectedEventListener(peerDisconnectedEventListenerMock);
            verify(target).getPendingPeers();
            verify(peerMock2).removeDisconnectedEventListener(peerDisconnectedEventListenerMock);
        }
    }

    //Sapient generated method id: ${1ad12ef9-fde0-3d76-b5e2-d757fe5be5e8}
    @Ignore()
    @Test()
    public void removeDisconnectedEventListenerWhenNotResult() {
        /* Branches:
         * (for-each(getConnectedPeers())) : true
         * (for-each(getPendingPeers())) : true
         * (result) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "{}");
        PeerDisconnectedEventListener peerDisconnectedEventListenerMock = mock(PeerDisconnectedEventListener.class, "{}");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001")));
            List<Peer> peerList = new ArrayList<>();
            peerList.add(peerMock);
            doReturn(peerList).when(target).getConnectedPeers();
            doReturn(false).when(peerMock).removeDisconnectedEventListener(peerDisconnectedEventListenerMock);
            List<Peer> peerList2 = new ArrayList<>();
            peerList2.add(peerMock2);
            doReturn(peerList2).when(target).getPendingPeers();
            doReturn(true).when(peerMock2).removeDisconnectedEventListener(peerDisconnectedEventListenerMock);
            //Act Statement(s)
            boolean result = target.removeDisconnectedEventListener(peerDisconnectedEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            verify(target).getConnectedPeers();
            verify(peerMock).removeDisconnectedEventListener(peerDisconnectedEventListenerMock);
            verify(target).getPendingPeers();
            verify(peerMock2).removeDisconnectedEventListener(peerDisconnectedEventListenerMock);
        }
    }

    //Sapient generated method id: ${e45ff909-c466-3ad4-b84f-99cc3029de5f}
    @Ignore()
    @Test()
    public void removeDiscoveredEventListenerWhenResult() {
        /* Branches:
         * (result) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.5"));
            //Act Statement(s)
            boolean result = target.removeDiscoveredEventListener(peerDiscoveredEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
        }
    }

    //Sapient generated method id: ${da275b73-6b81-34f4-9095-589d225f881e}
    @Ignore()
    @Test()
    public void removeDiscoveredEventListenerWhenNotResult() {
        /* Branches:
         * (result) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        PeerDiscoveredEventListener peerDiscoveredEventListenerMock = mock(PeerDiscoveredEventListener.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(peerDiscoveredEventListenerMock), any())).thenReturn(false);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            //Act Statement(s)
            boolean result = target.removeDiscoveredEventListener(peerDiscoveredEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(peerDiscoveredEventListenerMock), any()));
        }
    }

    //Sapient generated method id: ${8b63a6f0-138b-37b0-b42c-76a5d72330f2}
    @Ignore()
    @Test()
    public void removeGetDataEventListenerWhenResult() {
        /* Branches:
         * (for-each(getConnectedPeers())) : true
         * (for-each(getPendingPeers())) : true
         * (result) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001")));
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
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            verify(target).getConnectedPeers();
            verify(peerMock).removeGetDataEventListener(getDataEventListenerMock);
            verify(target).getPendingPeers();
            verify(peerMock2).removeGetDataEventListener(getDataEventListenerMock);
        }
    }

    //Sapient generated method id: ${04157772-a19f-30ff-a5d4-afc2f3fc9932}
    @Ignore()
    @Test()
    public void removeGetDataEventListenerWhenNotResult() {
        /* Branches:
         * (for-each(getConnectedPeers())) : true
         * (for-each(getPendingPeers())) : true
         * (result) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "MainNetParams");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001")));
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
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            verify(target).getConnectedPeers();
            verify(peerMock).removeGetDataEventListener(getDataEventListenerMock);
            verify(target).getPendingPeers();
            verify(peerMock2).removeGetDataEventListener(getDataEventListenerMock);
        }
    }

    //Sapient generated method id: ${66c8b409-ad71-32f3-9cd9-eb5e57edca68}
    @Ignore()
    @Test()
    public void removeOnTransactionBroadcastListenerWhenResult() {
        /* Branches:
         * (for-each(getConnectedPeers())) : true
         * (for-each(getPendingPeers())) : true
         * (result) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "MainNetParams.get()");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001")));
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
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            verify(target).getConnectedPeers();
            verify(peerMock).removeOnTransactionBroadcastListener(onTransactionBroadcastListenerMock);
            verify(target).getPendingPeers();
            verify(peerMock2).removeOnTransactionBroadcastListener(onTransactionBroadcastListenerMock);
        }
    }

    //Sapient generated method id: ${01c3fcae-8bb5-34bc-bd03-c6919fed771b}
    @Ignore()
    @Test()
    public void removeOnTransactionBroadcastListenerWhenNotResult() {
        /* Branches:
         * (for-each(getConnectedPeers())) : true
         * (for-each(getPendingPeers())) : true
         * (result) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "RegTestParams.get()");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001")));
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
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            verify(target).getConnectedPeers();
            verify(peerMock).removeOnTransactionBroadcastListener(onTransactionBroadcastListenerMock);
            verify(target).getPendingPeers();
            verify(peerMock2).removeOnTransactionBroadcastListener(onTransactionBroadcastListenerMock);
        }
    }

    //Sapient generated method id: ${fbff221f-de10-3218-9c1f-4f533ddb7a88}
    @Ignore()
    @Test()
    public void removePreMessageReceivedEventListenerWhenResult() {
        /* Branches:
         * (for-each(getConnectedPeers())) : true
         * (for-each(getPendingPeers())) : true
         * (result) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "true");
        PreMessageReceivedEventListener preMessageReceivedEventListenerMock = mock(PreMessageReceivedEventListener.class, "{}");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001")));
            List<Peer> peerList = new ArrayList<>();
            peerList.add(peerMock);
            doReturn(peerList).when(target).getConnectedPeers();
            doReturn(false).when(peerMock).removePreMessageReceivedEventListener(preMessageReceivedEventListenerMock);
            List<Peer> peerList2 = new ArrayList<>();
            peerList2.add(peerMock2);
            doReturn(peerList2).when(target).getPendingPeers();
            doReturn(true).when(peerMock2).removePreMessageReceivedEventListener(preMessageReceivedEventListenerMock);
            //Act Statement(s)
            boolean result = target.removePreMessageReceivedEventListener(preMessageReceivedEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            verify(target).getConnectedPeers();
            verify(peerMock).removePreMessageReceivedEventListener(preMessageReceivedEventListenerMock);
            verify(target).getPendingPeers();
            verify(peerMock2).removePreMessageReceivedEventListener(preMessageReceivedEventListenerMock);
        }
    }

    //Sapient generated method id: ${81be7049-f565-373e-ae13-57ec5050adcd}
    @Ignore()
    @Test()
    public void removePreMessageReceivedEventListenerWhenNotResult() {
        /* Branches:
         * (for-each(getConnectedPeers())) : true
         * (for-each(getPendingPeers())) : true
         * (result) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "mock Network object");
        PreMessageReceivedEventListener preMessageReceivedEventListenerMock = mock(PreMessageReceivedEventListener.class, "mock PreMessageReceivedEventListener object");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001")));
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
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            verify(target).getConnectedPeers();
            verify(peerMock).removePreMessageReceivedEventListener(preMessageReceivedEventListenerMock);
            verify(target).getPendingPeers();
            verify(peerMock2).removePreMessageReceivedEventListener(preMessageReceivedEventListenerMock);
        }
    }

    //Sapient generated method id: ${593e590c-e3b6-3c14-a6bc-0cdd9702383f}
    @Ignore()
    @Test()
    public void getConnectedPeersTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001"));
            //Act Statement(s)
            List<Peer> result = target.getConnectedPeers();
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
        }
    }

    //Sapient generated method id: ${2701ecc1-cf90-3fa4-a8e3-77ac82267edf}
    @Ignore()
    @Test()
    public void getPendingPeersTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001"));
            //Act Statement(s)
            List<Peer> result = target.getPendingPeers();
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
        }
    }

    //Sapient generated method id: ${959a0c86-6271-303a-aaf2-9f314b4cfdd2}
    @Ignore()
    @Test()
    public void addAddress1WhenIsRunningNot() {
        /* Branches:
         * (backoffMap.containsKey(peerAddress)) : false  #  inside addInactive method
         * (priority != 0) : true  #  inside addInactive method
         * (addInactive(peerAddress, priority)) : true
         * (!isRunning()) : true  #  inside setMaxConnections method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            doReturn(false).when(target).isRunning();
            //Act Statement(s)
            target.addAddress(peerAddressMock, 1);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            verify(target).isRunning();
        }
    }

    //Sapient generated method id: ${d6bb3378-ef23-3781-88a4-267eb2e99eff}
    @Ignore()
    @Test()
    public void addAddress1WhenAdjustmentLessThan0() {
        /* Branches:
         * (backoffMap.containsKey(peerAddress)) : false  #  inside addInactive method
         * (priority != 0) : true  #  inside addInactive method
         * (addInactive(peerAddress, priority)) : true
         * (!isRunning()) : false  #  inside setMaxConnections method
         * (adjustment > 0) : false  #  inside setMaxConnections method
         * (adjustment < 0) : true  #  inside setMaxConnections method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParametersMock);
            doReturn(blockMock).when(networkParametersMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            ReentrantLock reentrantLock = Threading.lock(PeerGroup.class);
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = Context.getOrCreate();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001")));
            doReturn(true).when(target).isRunning();
            doReturn(2).when(channelsMock).getConnectedClientCount();
            doNothing().when(channelsMock).closeConnections(1);
            //Act Statement(s)
            target.addAddress(peerAddressMock, 1);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            verify(networkParametersMock).getGenesisBlock();
            verify(blockMock).time();
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
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
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "org.bitcoinj.core.NetworkParameters");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            doReturn(true).when(target).isRunning();
            doReturn(0).when(channelsMock).getConnectedClientCount();
            InetAddress inetAddress = InetAddress.getLoopbackAddress();
            PeerAddress peerAddress = PeerAddress.simple(inetAddress, 8333);
            //Act Statement(s)
            target.addAddress(peerAddress, 1);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            verify(target).isRunning();
            verify(channelsMock).getConnectedClientCount();
        }
    }

    //Sapient generated method id: ${3817319b-a907-3403-b1f2-9940cac786cf}
    @Ignore()
    @Test()
    public void setRequiredServicesTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        MultiplexingDiscovery multiplexingDiscoveryMock = mock(MultiplexingDiscovery.class, "UnknownObjectContent{target='org.bitcoinj.net.discovery.MultiplexingDiscovery', onlyPojoFunctions=false, builderPattern=false}");
        Network networkMock = mock(Network.class, "UnknownObjectContent{target='org.bitcoinj.base.Network', onlyPojoFunctions=false, builderPattern=false}");
        Network networkMock2 = mock(Network.class, "{}");
        try (MockedStatic<MultiplexingDiscovery> multiplexingDiscovery = mockStatic(MultiplexingDiscovery.class);
             MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            multiplexingDiscovery.when(() -> MultiplexingDiscovery.forServices(networkMock, 1L)).thenReturn(multiplexingDiscoveryMock);
            PeerGroup target = spy(new PeerGroup(networkMock2, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001")));
            doNothing().when(target).addPeerDiscovery(multiplexingDiscoveryMock);
            //Act Statement(s)
            target.setRequiredServices(1L);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            multiplexingDiscovery.verify(() -> MultiplexingDiscovery.forServices(networkMock, 1L), atLeast(1));
            verify(target).addPeerDiscovery(multiplexingDiscoveryMock);
        }
    }

    //Sapient generated method id: ${5b8244f7-7b3c-3fb7-b1df-1c1505a4f5f6}
    @Ignore()
    @Test()
    public void addAddress2Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "MainNetParams");
        try (MockedStatic<PeerAddress> peerAddress = mockStatic(PeerAddress.class);
             MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            InetAddress inetAddress = InetAddress.getLoopbackAddress();
            PeerAddress peerAddress2 = PeerAddress.simple(inetAddress, 0);
            peerAddress.when(() -> PeerAddress.simple((InetAddress) any(), eq(0))).thenReturn(peerAddress2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001")));
            doNothing().when(target).addAddress((PeerAddress) any());
            InetAddress inetAddress2 = InetAddress.getLoopbackAddress();
            //Act Statement(s)
            target.addAddress(inetAddress2);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            peerAddress.verify(() -> PeerAddress.simple((InetAddress) any(), eq(0)));
            verify(target).addAddress((PeerAddress) any());
        }
    }

    //Sapient generated method id: ${bc3cea22-a509-3943-8b44-c50782fa3a13}
    @Ignore()
    @Test()
    public void addAddress3Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "NetworkParameters{[email protected]}");
        try (MockedStatic<PeerAddress> peerAddress = mockStatic(PeerAddress.class);
             MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            InetAddress inetAddress = InetAddress.getLoopbackAddress();
            PeerAddress peerAddress2 = PeerAddress.simple(inetAddress, 0);
            peerAddress.when(() -> PeerAddress.simple((InetAddress) any(), eq(8333))).thenReturn(peerAddress2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001")));
            doNothing().when(target).addAddress((PeerAddress) any(), eq(1));
            InetAddress inetAddress2 = InetAddress.getLoopbackAddress();
            //Act Statement(s)
            target.addAddress(inetAddress2, 1);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            peerAddress.verify(() -> PeerAddress.simple((InetAddress) any(), eq(8333)));
            verify(target).addAddress((PeerAddress) any(), eq(1));
        }
    }

    //Sapient generated method id: ${3a292049-25e1-3349-ad5e-5bf2d6ed42cb}
    @Ignore()
    @Test()
    public void addPeerDiscoveryWhenIsRunningNot() {
        /* Branches:
         * (getMaxConnections() == 0) : true
         * (!isRunning()) : true  #  inside setMaxConnections method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "{}");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.01")));
            doReturn(false).when(target).isRunning();
            //Act Statement(s)
            target.addPeerDiscovery(peerDiscoveryMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            verify(target).isRunning();
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
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "{}");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001")));
            doReturn(true).when(target).isRunning();
            doReturn(0).when(channelsMock).getConnectedClientCount();
            //Act Statement(s)
            target.addPeerDiscovery(peerDiscoveryMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            verify(target).isRunning();
            verify(channelsMock).getConnectedClientCount();
        }
    }

    //Sapient generated method id: ${af6a6b4e-98ae-32a0-a236-769bbdb816a4}
    @Ignore()
    @Test()
    public void discoverPeersWhenAddressListIsEmpty() throws PeerDiscoveryException {
        /* Branches:
         * (!lock.isHeldByCurrentThread()) : true
         * (for-each(peerDiscoverers)) : false
         * (!addressList.isEmpty()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "Block");
        try (MockedStatic<Stopwatch> stopwatch = mockStatic(Stopwatch.class);
             MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            Stopwatch stopwatch2 = Stopwatch.start();
            stopwatch.when(() -> Stopwatch.start()).thenReturn(stopwatch2);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.00010"));
            //Act Statement(s)
            int result = target.discoverPeers();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            stopwatch.verify(() -> Stopwatch.start(), atLeast(1));
        }
    }

    //Sapient generated method id: ${851f0409-c19e-3014-8295-a9d6526b6e01}
    @Ignore(value = "Potential harmful system call (ScheduledExecutorService.submit) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void waitForJobQueueTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "org.bitcoinj.params.MainNetParams");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001"));
            //Act Statement(s)
            target.waitForJobQueue();
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
        }
    }

    //Sapient generated method id: ${a9331398-240e-36aa-9522-b3dc4bcf14ad}
    @Ignore()
    @Test()
    public void startTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "Network");
        ListenableCompletableFuture<Void> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001")));
            doReturn(listenableCompletableFutureMock).when(target).startAsync();
            Object object = new Object();
            doReturn(object).when(listenableCompletableFutureMock).join();
            //Act Statement(s)
            target.start();
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            verify(target).startAsync();
            verify(listenableCompletableFutureMock).join();
        }
    }

    //Sapient generated method id: ${f2e2eee3-1366-3a78-9f85-41e952f2e39f}
    @Ignore()
    @Test()
    public void stopThrowsIllegalStateException() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "Network");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<Stopwatch> stopwatch = mockStatic(Stopwatch.class);
             MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            Stopwatch stopwatch2 = Stopwatch.start();
            stopwatch.when(() -> Stopwatch.start()).thenReturn(stopwatch2);
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(false)).thenThrow(illegalStateException);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001"));
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.stop();
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            stopwatch.verify(() -> Stopwatch.start(), atLeast(1));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
        }
    }

    //Sapient generated method id: ${acca24c9-50bb-32da-8bdb-b2142755eacf}
    @Ignore()
    @Test()
    public void dropAllPeersWhenPeersIsEmpty() {
        /* Branches:
         * (for-each(peers)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "Network");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.01"));
            //Act Statement(s)
            target.dropAllPeers();
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
        }
    }

    //Sapient generated method id: ${8918cf59-8088-3d05-b5e8-f71c63906723}
    @Ignore()
    @Test()
    public void addWalletWhenScriptPatternIsP2WPKHScriptPubKeyAndOutputNotIsMineWalletAndPeersIsEmpty() throws ScriptException {
        /* Branches:
         * (!wallets.contains(wallet)) : true
         * (for-each(tx.getOutputs())) : true  #  inside onCoinsReceivedOrSent method
         * (ScriptPattern.isP2PK(scriptPubKey)) : false  #  inside onCoinsReceivedOrSent method
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : true  #  inside onCoinsReceivedOrSent method
         * (output.isMine(wallet)) : false  #  inside onCoinsReceivedOrSent method
         * (for-each(peers)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "{}");
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            Executor executor = Threading.SAME_THREAD;
            doNothing().when(walletMock).addCoinsReceivedEventListener(executor, walletCoinsReceivedEventListenerMock);
            doNothing().when(walletMock).addCoinsSentEventListener(executor, walletCoinsSentEventListenerMock);
            doNothing().when(walletMock).addKeyChainEventListener(executor, keyChainEventListenerMock);
            doNothing().when(walletMock).addScriptsChangeEventListener(executor, scriptsChangeEventListenerMock);
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            scriptPattern.when(() -> ScriptPattern.isP2PK((Script) any())).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH((Script) any())).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK((Script) null)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH((Script) null)).thenReturn(true);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001")));
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
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK((Script) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH((Script) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2PK((Script) null), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH((Script) null), atLeast(1));
            verify(target, times(3)).recalculateFastCatchupAndFilter(PeerGroup.FilterRecalculateMode.SEND_IF_CHANGED);
            verify(target).addPeerFilterProvider(walletMock);
            verify(walletMock).setTransactionBroadcaster(target);
        }
    }

    //Sapient generated method id: ${5b77f7ac-eb69-3ee7-bdcf-9f92758d749c}
    @Ignore()
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
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Wallet walletMock = mock(Wallet.class, "org.bitcoinj.wallet.Wallet");
        Network networkMock = mock(Network.class, "org.bitcoinj.params.MainNetParams");
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            Executor executor = Threading.SAME_THREAD;
            doNothing().when(walletMock).addCoinsReceivedEventListener(executor, walletCoinsReceivedEventListenerMock);
            doNothing().when(walletMock).addCoinsSentEventListener(executor, walletCoinsSentEventListenerMock);
            doNothing().when(walletMock).addKeyChainEventListener(executor, keyChainEventListenerMock);
            doNothing().when(walletMock).addScriptsChangeEventListener(executor, scriptsChangeEventListenerMock);
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(true);
            scriptPattern.when(() -> ScriptPattern.isP2PK((Script) any())).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH((Script) any())).thenReturn(false);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.00010")));
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
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK((Script) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH((Script) any()));
            verify(target, times(3)).recalculateFastCatchupAndFilter(PeerGroup.FilterRecalculateMode.SEND_IF_CHANGED);
            verify(target).addPeerFilterProvider(walletMock);
            verify(walletMock).setTransactionBroadcaster(target);
        }
    }

    //Sapient generated method id: ${e0eac798-1b35-354b-8c9b-73f1d65dcee1}
    @Ignore()
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
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "{}");
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            Executor executor = Threading.SAME_THREAD;
            doNothing().when(walletMock).addCoinsReceivedEventListener(executor, walletCoinsReceivedEventListenerMock);
            doNothing().when(walletMock).addCoinsSentEventListener(executor, walletCoinsSentEventListenerMock);
            doNothing().when(walletMock).addKeyChainEventListener(executor, keyChainEventListenerMock);
            doNothing().when(walletMock).addScriptsChangeEventListener(executor, scriptsChangeEventListenerMock);
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(true);
            scriptPattern.when(() -> ScriptPattern.isP2PK((Script) any())).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH((Script) any())).thenReturn(false);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001")));
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
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK((Script) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH((Script) any()));
            verify(target, times(3)).recalculateFastCatchupAndFilter(PeerGroup.FilterRecalculateMode.SEND_IF_CHANGED);
            verify(target).addPeerFilterProvider(walletMock);
            verify(walletMock).setTransactionBroadcaster(target);
        }
    }

    //Sapient generated method id: ${532aac8d-8711-3082-a1cc-b8701d7a5927}
    @Ignore()
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
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Wallet walletMock = mock(Wallet.class, "boolean");
        Network networkMock = mock(Network.class, "org.bitcoinj.params.NetworkParameters");
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            Executor executor = Threading.SAME_THREAD;
            doNothing().when(walletMock).addCoinsReceivedEventListener(executor, walletCoinsReceivedEventListenerMock);
            doNothing().when(walletMock).addCoinsSentEventListener(executor, walletCoinsSentEventListenerMock);
            doNothing().when(walletMock).addKeyChainEventListener(executor, keyChainEventListenerMock);
            doNothing().when(walletMock).addScriptsChangeEventListener(executor, scriptsChangeEventListenerMock);
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(true);
            scriptPattern.when(() -> ScriptPattern.isP2PK((Script) any())).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH((Script) any())).thenReturn(false);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
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
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK((Script) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH((Script) any()));
            verify(target).recalculateFastCatchupAndFilter(PeerGroup.FilterRecalculateMode.DONT_SEND);
            verify(target, times(2)).recalculateFastCatchupAndFilter(PeerGroup.FilterRecalculateMode.SEND_IF_CHANGED);
            verify(target).addPeerFilterProvider(walletMock);
            verify(walletMock).setTransactionBroadcaster(target);
        }
    }

    //Sapient generated method id: ${4030b86d-5b76-330e-9423-7991a43291ff}
    @Ignore()
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
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "{}");
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            Executor executor = Threading.SAME_THREAD;
            doNothing().when(walletMock).addCoinsReceivedEventListener(executor, walletCoinsReceivedEventListenerMock);
            doNothing().when(walletMock).addCoinsSentEventListener(executor, walletCoinsSentEventListenerMock);
            doNothing().when(walletMock).addKeyChainEventListener(executor, keyChainEventListenerMock);
            doNothing().when(walletMock).addScriptsChangeEventListener(executor, scriptsChangeEventListenerMock);
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            scriptPattern.when(() -> ScriptPattern.isP2PK((Script) any())).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH((Script) any())).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK((Script) null)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH((Script) null)).thenReturn(true);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001")));
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
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK((Script) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH((Script) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2PK((Script) null), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH((Script) null), atLeast(1));
            verify(target).recalculateFastCatchupAndFilter(PeerGroup.FilterRecalculateMode.DONT_SEND);
            verify(target, times(2)).recalculateFastCatchupAndFilter(PeerGroup.FilterRecalculateMode.SEND_IF_CHANGED);
            verify(target).addPeerFilterProvider(walletMock);
            verify(walletMock).setTransactionBroadcaster(target);
        }
    }

    //Sapient generated method id: ${9bc49572-d0fa-3120-b991-9b5bff44324b}
    @Ignore()
    @Test()
    public void addPeerFilterProviderWhenNotWillSendFilter() {
        /* Branches:
         * (!peerFilterProviders.contains(provider)) : true
         * (chain != null) : false  #  inside updateVersionMessageRelayTxesBeforeFilter method
         * (spvMode) : false  #  inside updateVersionMessageRelayTxesBeforeFilter method
         * (!willSendFilter) : true  #  inside updateVersionMessageRelayTxesBeforeFilter method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "MainNetParams");
        PeerFilterProvider peerFilterProviderMock = mock(PeerFilterProvider.class, "mockPeerFilterProvider");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.01")));
            doReturn(listenableCompletableFutureMock).when(target).recalculateFastCatchupAndFilter(PeerGroup.FilterRecalculateMode.SEND_IF_CHANGED);
            //Act Statement(s)
            ListenableCompletableFuture<BloomFilter> result = target.addPeerFilterProvider(peerFilterProviderMock);
            //Assert statement(s)
            assertThat(result, equalTo(listenableCompletableFutureMock));
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            verify(target).recalculateFastCatchupAndFilter(PeerGroup.FilterRecalculateMode.SEND_IF_CHANGED);
        }
    }

    //Sapient generated method id: ${123739ef-17cc-3240-a77c-17f290d0e4da}
    @Ignore()
    @Test()
    public void removePeerFilterProviderTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "Network");
        PeerFilterProvider peerFilterProviderMock = mock(PeerFilterProvider.class, "PeerFilterProvider");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.01"));
            //Act Statement(s)
            target.removePeerFilterProvider(peerFilterProviderMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
        }
    }

    //Sapient generated method id: ${57c42480-bc92-3ca8-a15e-47edbd762034}
    @Ignore()
    @Test()
    public void removeWalletWhenScriptPatternIsP2WPKHScriptPubKeyAndOutputNotIsMineWalletAndPeersIsEmpty() {
        /* Branches:
         * (for-each(tx.getOutputs())) : true  #  inside onCoinsReceivedOrSent method
         * (ScriptPattern.isP2PK(scriptPubKey)) : false  #  inside onCoinsReceivedOrSent method
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : true  #  inside onCoinsReceivedOrSent method
         * (output.isMine(wallet)) : false  #  inside onCoinsReceivedOrSent method
         * (for-each(peers)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Wallet walletMock = mock(Wallet.class);
        Network networkMock = mock(Network.class);
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(false).when(walletMock).removeCoinsReceivedEventListener(walletCoinsReceivedEventListenerMock);
            doReturn(false).when(walletMock).removeCoinsSentEventListener(walletCoinsSentEventListenerMock);
            doReturn(false).when(walletMock).removeKeyChainEventListener(keyChainEventListenerMock);
            doReturn(false).when(walletMock).removeScriptsChangeEventListener(scriptsChangeEventListenerMock);
            doNothing().when(walletMock).setTransactionBroadcaster(null);
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            //Act Statement(s)
            target.removeWallet(walletMock);
            //Assert statement(s)
            verify(walletMock).removeCoinsReceivedEventListener(walletCoinsReceivedEventListenerMock);
            verify(walletMock).removeCoinsSentEventListener(walletCoinsSentEventListenerMock);
            verify(walletMock).removeKeyChainEventListener(keyChainEventListenerMock);
            verify(walletMock).removeScriptsChangeEventListener(scriptsChangeEventListenerMock);
            verify(walletMock).setTransactionBroadcaster(null);
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
        }
    }

    //Sapient generated method id: ${b153339e-9692-3bc9-8999-eb8bd5f019e9}
    @Ignore()
    @Test()
    public void removeWalletWhenOutputIsMineWalletAndTxGetConfidenceGetConfidenceTypeEqualsTransactionConfidenceConfidenceTypeBUILDINGA() {
        /* Branches:
         * (for-each(tx.getOutputs())) : true  #  inside onCoinsReceivedOrSent method
         * (ScriptPattern.isP2PK(scriptPubKey)) : false  #  inside onCoinsReceivedOrSent method
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : true  #  inside onCoinsReceivedOrSent method
         * (output.isMine(wallet)) : true  #  inside onCoinsReceivedOrSent method
         * (tx.getConfidence().getConfidenceType() == TransactionConfidence.ConfidenceType.BUILDING) : true  #  inside onCoinsReceivedOrSent method
         * (for-each(peers)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Wallet walletMock = mock(Wallet.class, "boolean");
        Network networkMock = mock(Network.class, "boolean");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(false).when(walletMock).removeCoinsReceivedEventListener(walletCoinsReceivedEventListenerMock);
            doReturn(false).when(walletMock).removeCoinsSentEventListener(walletCoinsSentEventListenerMock);
            doReturn(false).when(walletMock).removeKeyChainEventListener(keyChainEventListenerMock);
            doReturn(false).when(walletMock).removeScriptsChangeEventListener(scriptsChangeEventListenerMock);
            doNothing().when(walletMock).setTransactionBroadcaster(null);
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            //Act Statement(s)
            target.removeWallet(walletMock);
            //Assert statement(s)
            verify(walletMock).removeCoinsReceivedEventListener(walletCoinsReceivedEventListenerMock);
            verify(walletMock).removeCoinsSentEventListener(walletCoinsSentEventListenerMock);
            verify(walletMock).removeKeyChainEventListener(keyChainEventListenerMock);
            verify(walletMock).removeScriptsChangeEventListener(scriptsChangeEventListenerMock);
            verify(walletMock).setTransactionBroadcaster(null);
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
        }
    }

    //Sapient generated method id: ${6e7254b8-2e12-3416-87e1-026a4774f243}
    @Ignore()
    @Test()
    public void removeWalletWhenTxGetConfidenceGetConfidenceTypeEqualsTransactionConfidenceConfidenceTypeBUILDINGAndPeersIsEmpty4() {
        /* Branches:
         * (for-each(tx.getOutputs())) : true  #  inside onCoinsReceivedOrSent method
         * (ScriptPattern.isP2PK(scriptPubKey)) : false  #  inside onCoinsReceivedOrSent method
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : true  #  inside onCoinsReceivedOrSent method
         * (output.isMine(wallet)) : true  #  inside onCoinsReceivedOrSent method
         * (tx.getConfidence().getConfidenceType() == TransactionConfidence.ConfidenceType.BUILDING) : true  #  inside onCoinsReceivedOrSent method
         * (for-each(peers)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Wallet walletMock = mock(Wallet.class, "Wallet");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(false).when(walletMock).removeCoinsReceivedEventListener(walletCoinsReceivedEventListenerMock);
            doReturn(false).when(walletMock).removeCoinsSentEventListener(walletCoinsSentEventListenerMock);
            doReturn(false).when(walletMock).removeKeyChainEventListener(keyChainEventListenerMock);
            doReturn(false).when(walletMock).removeScriptsChangeEventListener(scriptsChangeEventListenerMock);
            doNothing().when(walletMock).setTransactionBroadcaster(null);
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001"));
            //Act Statement(s)
            target.removeWallet(walletMock);
            //Assert statement(s)
            verify(walletMock).removeCoinsReceivedEventListener(walletCoinsReceivedEventListenerMock);
            verify(walletMock).removeCoinsSentEventListener(walletCoinsSentEventListenerMock);
            verify(walletMock).removeKeyChainEventListener(keyChainEventListenerMock);
            verify(walletMock).removeScriptsChangeEventListener(scriptsChangeEventListenerMock);
            verify(walletMock).setTransactionBroadcaster(null);
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
        }
    }

    //Sapient generated method id: ${06899502-87c9-39ff-919c-ce91d91ea16d}
    @Ignore()
    @Test()
    public void removeWalletWhenTxGetConfidenceGetConfidenceTypeEqualsTransactionConfidenceConfidenceTypeBUILDINGAndPeersIsEmpty6() {
        /* Branches:
         * (for-each(tx.getOutputs())) : true  #  inside onCoinsReceivedOrSent method
         * (ScriptPattern.isP2PK(scriptPubKey)) : false  #  inside onCoinsReceivedOrSent method
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : true  #  inside onCoinsReceivedOrSent method
         * (output.isMine(wallet)) : true  #  inside onCoinsReceivedOrSent method
         * (tx.getConfidence().getConfidenceType() == TransactionConfidence.ConfidenceType.BUILDING) : true  #  inside onCoinsReceivedOrSent method
         * (for-each(peers)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Wallet walletMock = mock(Wallet.class, "Wallet");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(false).when(walletMock).removeCoinsReceivedEventListener(walletCoinsReceivedEventListenerMock);
            doReturn(false).when(walletMock).removeCoinsSentEventListener(walletCoinsSentEventListenerMock);
            doReturn(false).when(walletMock).removeKeyChainEventListener(keyChainEventListenerMock);
            doReturn(false).when(walletMock).removeScriptsChangeEventListener(scriptsChangeEventListenerMock);
            doNothing().when(walletMock).setTransactionBroadcaster(null);
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.00010"));
            //Act Statement(s)
            target.removeWallet(walletMock);
            //Assert statement(s)
            verify(walletMock).removeCoinsReceivedEventListener(walletCoinsReceivedEventListenerMock);
            verify(walletMock).removeCoinsSentEventListener(walletCoinsSentEventListenerMock);
            verify(walletMock).removeKeyChainEventListener(keyChainEventListenerMock);
            verify(walletMock).removeScriptsChangeEventListener(scriptsChangeEventListenerMock);
            verify(walletMock).setTransactionBroadcaster(null);
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
        }
    }

    //Sapient generated method id: ${af382a03-00c8-3930-b438-2c852c34a45d}
    @Ignore()
    @Test()
    public void removeWalletWhenOutputIsMineWalletAndTxGetConfidenceGetConfidenceTypeNotEqualsTransactionConfidenceConfidenceTypeBUILDI() {
        /* Branches:
         * (for-each(tx.getOutputs())) : true  #  inside onCoinsReceivedOrSent method
         * (ScriptPattern.isP2PK(scriptPubKey)) : false  #  inside onCoinsReceivedOrSent method
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : true  #  inside onCoinsReceivedOrSent method
         * (output.isMine(wallet)) : true  #  inside onCoinsReceivedOrSent method
         * (tx.getConfidence().getConfidenceType() == TransactionConfidence.ConfidenceType.BUILDING) : false  #  inside onCoinsReceivedOrSent method
         * (for-each(peers)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Wallet walletMock = mock(Wallet.class, "Wallet@123456");
        Network networkMock = mock(Network.class, "MainNetParams@789012");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(false).when(walletMock).removeCoinsReceivedEventListener(walletCoinsReceivedEventListenerMock);
            doReturn(false).when(walletMock).removeCoinsSentEventListener(walletCoinsSentEventListenerMock);
            doReturn(false).when(walletMock).removeKeyChainEventListener(keyChainEventListenerMock);
            doReturn(false).when(walletMock).removeScriptsChangeEventListener(scriptsChangeEventListenerMock);
            doNothing().when(walletMock).setTransactionBroadcaster(null);
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001"));
            //Act Statement(s)
            target.removeWallet(walletMock);
            //Assert statement(s)
            verify(walletMock).removeCoinsReceivedEventListener(walletCoinsReceivedEventListenerMock);
            verify(walletMock).removeCoinsSentEventListener(walletCoinsSentEventListenerMock);
            verify(walletMock).removeKeyChainEventListener(keyChainEventListenerMock);
            verify(walletMock).removeScriptsChangeEventListener(scriptsChangeEventListenerMock);
            verify(walletMock).setTransactionBroadcaster(null);
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
        }
    }

    //Sapient generated method id: ${df01039e-c414-3b79-8f85-47ddd4891ff5}
    @Ignore()
    @Test()
    public void recalculateFastCatchupAndFilterWhenInFlightRecalculationsGetModeIsNotNull() {
        /* Branches:
         * (inFlightRecalculations.get(mode) != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001"));
            //Act Statement(s)
            ListenableCompletableFuture<BloomFilter> result = target.recalculateFastCatchupAndFilter(PeerGroup.FilterRecalculateMode.SEND_IF_CHANGED);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
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
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            //Act Statement(s)
            ListenableCompletableFuture<BloomFilter> result = target.recalculateFastCatchupAndFilter(PeerGroup.FilterRecalculateMode.SEND_IF_CHANGED);
            ListenableCompletableFuture<BloomFilter> listenableCompletableFuture = new ListenableCompletableFuture<>();
            //Assert statement(s)
            //TODO: Please implement equals method in ListenableCompletableFuture for verification to succeed or you need to adjust respective assertion statements
            assertThat(result, equalTo(listenableCompletableFuture));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
        }
    }

    //Sapient generated method id: ${470c6f5a-4452-382d-adca-dee0823e4468}
    @Ignore()
    @Test()
    public void setBloomFilterFalsePositiveRateTest() {
        /**
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: bloomFilterMerger
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "Block");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001")));
            doReturn(listenableCompletableFutureMock).when(target).recalculateFastCatchupAndFilter(PeerGroup.FilterRecalculateMode.SEND_IF_CHANGED);
            //Act Statement(s)
            target.setBloomFilterFalsePositiveRate(Double.parseDouble("0.001"));
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            verify(target).recalculateFastCatchupAndFilter(PeerGroup.FilterRecalculateMode.SEND_IF_CHANGED);
        }
    }

    //Sapient generated method id: ${b8a23ffc-8480-34f9-ae94-600ef7e0d400}
    @Ignore()
    @Test()
    public void numConnectedPeersTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "Network");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001"));
            //Act Statement(s)
            int result = target.numConnectedPeers();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
        }
    }

    //Sapient generated method id: ${6bbab6d1-8996-3584-b49d-de1da580891a}
    @Ignore()
    @Test()
    public void connectToTest() throws ExecutionException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "Network");
        try (MockedStatic<PeerAddress> peerAddress = mockStatic(PeerAddress.class);
             MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            InetAddress inetAddress = InetAddress.getLoopbackAddress();
            PeerAddress peerAddress2 = PeerAddress.simple(inetAddress, 0);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
            peerAddress.when(() -> PeerAddress.simple(inetSocketAddress)).thenReturn(peerAddress2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001")));
            doReturn(peerMock).when(target).connectTo((PeerAddress) any(), eq(true), (Duration) any());
            //Act Statement(s)
            Peer result = target.connectTo(inetSocketAddress);
            //Assert statement(s)
            assertThat(result, equalTo(peerMock));
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            peerAddress.verify(() -> PeerAddress.simple(inetSocketAddress), atLeast(1));
            verify(target).connectTo((PeerAddress) any(), eq(true), (Duration) any());
        }
    }

    //Sapient generated method id: ${c842249d-095e-37ed-9870-47f67538ad7c}
    @Ignore()
    @Test()
    public void connectToLocalHostTest() throws ExecutionException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "MainNetParams");
        try (MockedStatic<PeerAddress> peerAddress = mockStatic(PeerAddress.class);
             MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            InetAddress inetAddress = InetAddress.getLoopbackAddress();
            PeerAddress peerAddress2 = PeerAddress.simple(inetAddress, 0);
            peerAddress.when(() -> PeerAddress.localhost((NetworkParameters) any())).thenReturn(peerAddress2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001")));
            doReturn(peerMock).when(target).connectTo((PeerAddress) any(), eq(true), (Duration) any());
            //Act Statement(s)
            Peer result = target.connectToLocalHost();
            //Assert statement(s)
            assertThat(result, equalTo(peerMock));
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            peerAddress.verify(() -> PeerAddress.localhost((NetworkParameters) any()));
            verify(target).connectTo((PeerAddress) any(), eq(true), (Duration) any());
        }
    }

    //Sapient generated method id: ${46fc33a4-a9d2-3bdd-8bc3-3f92a7cf1d8b}
    @Ignore()
    @Test()
    public void createPeerTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            doReturn(blockMock).when(networkParametersMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            ReentrantLock reentrantLock = Threading.lock(PeerGroup.class);
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = Context.getOrCreate();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            //Act Statement(s)
            Peer result = target.createPeer(peerAddressMock, versionMessageMock);
            Peer peer = new Peer(networkParametersMock, versionMessageMock, peerAddressMock, (AbstractBlockChain) null, 0L, 2147483647);
            //Assert statement(s)
            //TODO: Please implement equals method in Peer for verification to succeed or you need to adjust respective assertion statements
            assertThat(result, equalTo(peer));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(networkParametersMock).getGenesisBlock();
            verify(blockMock).time();
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
        }
    }

    //Sapient generated method id: ${8117fc59-e007-3a51-9f07-287c570ddca2}
    @Ignore()
    @Test()
    public void setConnectTimeoutMillisTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "{}");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001"));
            //Act Statement(s)
            target.setConnectTimeoutMillis(5000);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
        }
    }

    //Sapient generated method id: ${c34e20eb-d0e4-3e51-891a-dd196bcdecb3}
    @Ignore()
    @Test()
    public void startBlockChainDownloadWhenDownloadPeerIsNull() {
        /* Branches:
         * (downloadPeer != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "{}");
        BlockchainDownloadEventListener blockchainDownloadEventListenerMock = mock(BlockchainDownloadEventListener.class, "{}");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.5"));
            //Act Statement(s)
            target.startBlockChainDownload(blockchainDownloadEventListenerMock);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
        }
    }

    //Sapient generated method id: ${4980eb77-d888-3fae-bc99-a7e89e5b6b0b}
    @Ignore()
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
        Network networkMock = mock(Network.class, "MainNetParams");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001")));
            doNothing().when(target).startBlockChainDownload((DownloadProgressTracker) any());
            //Act Statement(s)
            target.downloadBlockChain();
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            verify(target).startBlockChainDownload((DownloadProgressTracker) any());
        }
    }

    //Sapient generated method id: ${fc161a7b-d8cd-3f0c-bcc7-a818268a94a9}
    @Ignore()
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
        Network networkMock = mock(Network.class, "MainNetParams");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.01")));
            doNothing().when(target).startBlockChainDownload((DownloadProgressTracker) any());
            thrown.expect(RuntimeException.class);
            thrown.expectCause(isA(InterruptedException.class));
            //Act Statement(s)
            target.downloadBlockChain();
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            verify(target).startBlockChainDownload((DownloadProgressTracker) any());
        }
    }

    //Sapient generated method id: ${2ed98721-0de7-35b8-b558-b80cd0c5e7f4}
    @Ignore()
    @Test()
    public void getMemoryPoolTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "MainNetParams");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            Context context3 = new Context();
            context.when(() -> Context.get()).thenReturn(context3);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001"));
            //Act Statement(s)
            TxConfidenceTable result = target.getMemoryPool();
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            context.verify(() -> Context.get(), atLeast(1));
        }
    }

    //Sapient generated method id: ${e8616d9c-f2ad-314d-9c3d-0c2d6b69c233}
    @Ignore()
    @Test()
    public void setFastCatchupTimeWhenDownloadPeerIsNull() {
        /* Branches:
         * (chain == null) : true
         * (downloadPeer != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "MAINNET");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParametersMock);
            doReturn(blockMock).when(networkParametersMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            ReentrantLock reentrantLock = Threading.lock(PeerGroup.class);
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = Context.getOrCreate();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            preconditions.when(() -> Preconditions.checkState(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001"));
            Instant instant2 = Instant.now();
            //Act Statement(s)
            target.setFastCatchupTime(instant2);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            verify(networkParametersMock).getGenesisBlock();
            verify(blockMock).time();
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            preconditions.verify(() -> Preconditions.checkState(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${c1ce17e3-6fb9-3f9f-b1d1-d5d877238bee}
    @Ignore()
    @Test()
    public void setFastCatchupTimeSecsTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "org.bitcoinj.params.MainNetParams");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.00010")));
            doNothing().when(target).setFastCatchupTime((Instant) any());
            //Act Statement(s)
            target.setFastCatchupTimeSecs(1620000000L);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            verify(target).setFastCatchupTime((Instant) any());
        }
    }

    //Sapient generated method id: ${2ad7c380-aba4-361b-83f8-7f38088d1245}
    @Ignore()
    @Test()
    public void fastCatchupTimeTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001"));
            //Act Statement(s)
            Instant result = target.fastCatchupTime();
            Instant instant = Instant.now();
            //Assert statement(s)
            assertThat(result, equalTo(instant));
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
        }
    }

    //Sapient generated method id: ${4fdda27e-3386-34f1-b79c-ec9d2476c54f}
    @Ignore()
    @Test()
    public void getFastCatchupTimeSecsTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.000010"));
            //Act Statement(s)
            long result = target.getFastCatchupTimeSecs();
            //Assert statement(s)
            assertThat(result, equalTo(1703674889L));
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
        }
    }

    //Sapient generated method id: ${9ab682bf-31f5-3abe-8dbe-9e8a330065dc}
    @Ignore()
    @Test()
    public void handlePeerDeathWhenIsRunningNot() {
        /* Branches:
         * (!isRunning()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Peer peerMock = mock(Peer.class, "null");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            doReturn(false).when(target).isRunning();
            Throwable throwable = new Throwable();
            //Act Statement(s)
            target.handlePeerDeath(peerMock, throwable);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            verify(target).isRunning();
        }
    }

    //Sapient generated method id: ${3563b55f-6006-3104-8445-7dbb92587c40}
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
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //Network networkMock = mock(Network.class);
        //InetAddress inetAddress = InetAddress.getLoopbackAddress();
        //PeerAddress peerAddress = PeerAddress.simple(inetAddress, 0);
        //doReturn(peerAddress).when(peerMock).getAddress();
        //doReturn(false).when(peerMock).removeAddressEventListener((PeerGroup.PeerListener) any());
        //doReturn(false).when(peerMock).removeBlocksDownloadedEventListener((PeerGroup.PeerListener) any());
        //doReturn(false).when(peerMock).removeGetDataEventListener((PeerGroup.PeerListener) any());
        //NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
        //networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParameters2);
        //ReentrantLock reentrantLock = new ReentrantLock();
        //threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
        //Context context2 = new Context();
        //context.when(() -> Context.getOrCreate()).thenReturn(context2);
        //PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
        //doReturn(true).when(target).isRunning();
        //NoRouteToHostException noRouteToHostException = new NoRouteToHostException();
        //target.handlePeerDeath(peerMock, noRouteToHostException);
        //verify(peerMock).getAddress();
        //verify(peerMock).removeAddressEventListener((PeerGroup.PeerListener) any());
        //verify(peerMock).removeBlocksDownloadedEventListener((PeerGroup.PeerListener) any());
        //verify(peerMock).removeGetDataEventListener((PeerGroup.PeerListener) any());
        //networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
        //threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
        //context.verify(() -> Context.getOrCreate(), atLeast(1));
        //verify(target).isRunning();
    }

    //Sapient generated method id: ${88590d65-c1a6-3069-916f-c1571ef3b9dd}
    @Ignore()
    @Test()
    public void setStallThresholdTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001"));
            //Act Statement(s)
            target.setStallThreshold(10, 1024);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
        }
    }

    //Sapient generated method id: ${e519464e-6fb1-3259-93ed-6dba2cc595da}
    @Ignore()
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
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            thrown.expect(NullPointerException.class);
            Peer peer = null;
            //Act Statement(s)
            target.startBlockChainDownloadFromPeer(peer);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
        }
    }

    //Sapient generated method id: ${fda66e4f-4b25-35db-a3b4-51904d90593c}
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
        //Peer peerMock = mock(Peer.class, "{}");
        //Network networkMock = mock(Network.class, "{}");
        //Executor executor = Threading.SAME_THREAD;
        //doNothing().when(peerMock).addBlocksDownloadedEventListener(eq(executor), (PeerGroup.ChainDownloadSpeedCalculator) any());
        //doNothing().when(peerMock).startBlockChainDownload();
        //NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
        //networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
        //ReentrantLock reentrantLock = new ReentrantLock();
        //threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
        //Context context2 = new Context();
        //context.when(() -> Context.getOrCreate()).thenReturn(context2);
        //PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.00010"));
        //target.startBlockChainDownloadFromPeer(peerMock);
        //verify(peerMock).addBlocksDownloadedEventListener(eq(executor), (PeerGroup.ChainDownloadSpeedCalculator) any());
        //verify(peerMock).startBlockChainDownload();
        //networkParameters.verify(() -> NetworkParameters.of((Network) any()));
        //threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
        //context.verify(() -> Context.getOrCreate(), atLeast(1));
    }

    //Sapient generated method id: ${9353a977-8019-3f98-9288-a5878ea2dabe}
    @Ignore()
    @Test()
    public void waitForPeersTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "{}");
        ListenableCompletableFuture<List<Peer>> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001")));
            doReturn(listenableCompletableFutureMock).when(target).waitForPeersOfVersion(5, 0L);
            //Act Statement(s)
            ListenableCompletableFuture<List<Peer>> result = target.waitForPeers(5);
            //Assert statement(s)
            assertThat(result, equalTo(listenableCompletableFutureMock));
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            verify(target).waitForPeersOfVersion(5, 0L);
        }
    }

    //Sapient generated method id: ${aa7534fd-912b-375d-a796-9e9ccc9d6319}
    @Ignore(value = "Potential harmful system call (ListenableCompletableFuture.complete) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void waitForPeersOfVersionWhenFoundPeersSizeGreaterThanOrEqualsToNumPeers() {
        /* Branches:
         * (foundPeers.size() >= numPeers) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "{}");
        Peer peerMock3 = mock(Peer.class);
        Peer peerMock4 = mock(Peer.class);
        Peer peerMock5 = mock(Peer.class);
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001")));
            List<Peer> peerList = new ArrayList<>();
            peerList.add(peerMock);
            peerList.add(peerMock2);
            peerList.add(peerMock3);
            peerList.add(peerMock4);
            peerList.add(peerMock5);
            doReturn(peerList).when(target).findPeersOfAtLeastVersion(2L);
            //Act Statement(s)
            ListenableCompletableFuture<List<Peer>> result = target.waitForPeersOfVersion(5, 2L);
            ListenableCompletableFuture<List<Peer>> listenableCompletableFuture = new ListenableCompletableFuture<>();
            //Assert statement(s)
            //TODO: Please implement equals method in ListenableCompletableFuture for verification to succeed or you need to adjust respective assertion statements
            assertThat(result, equalTo(listenableCompletableFuture));
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            verify(target).findPeersOfAtLeastVersion(2L);
        }
    }

    //Sapient generated method id: ${683bb07f-9146-3548-8dd9-41e82d519c7a}
    @Ignore()
    @Test()
    public void waitForPeersOfVersionWhenFoundPeersSizeLessThanNumPeers() {
        /* Branches:
         * (foundPeers.size() >= numPeers) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "Block");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001")));
            List<Peer> peerList = new ArrayList<>();
            doReturn(peerList).when(target).findPeersOfAtLeastVersion(2L);
            doNothing().when(target).addConnectedEventListener((PeerConnectedEventListener) any());
            //Act Statement(s)
            ListenableCompletableFuture<List<Peer>> result = target.waitForPeersOfVersion(5, 2L);
            ListenableCompletableFuture<List<Peer>> listenableCompletableFuture = new ListenableCompletableFuture<>();
            //Assert statement(s)
            //TODO: Please implement equals method in ListenableCompletableFuture for verification to succeed or you need to adjust respective assertion statements
            assertThat(result, equalTo(listenableCompletableFuture));
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            verify(target).findPeersOfAtLeastVersion(2L);
            verify(target).addConnectedEventListener((PeerConnectedEventListener) any());
        }
    }

    //Sapient generated method id: ${fe87eaa8-7ba3-36f3-9e37-8cb1bd0741dc}
    @Ignore()
    @Test()
    public void findPeersOfAtLeastVersionWhenPeersIsEmpty() {
        /* Branches:
         * (for-each(peers)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "MainNetParams");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.00010"));
            //Act Statement(s)
            List<Peer> result = target.findPeersOfAtLeastVersion(70015L);
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
        }
    }

    //Sapient generated method id: ${683af78c-a093-3a3b-a1bb-04ebdf299658}
    @Ignore()
    @Test()
    public void findPeersWithServiceMaskWhenPeersIsEmpty() {
        /* Branches:
         * (for-each(peers)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "org.bitcoinj.params.MainNetParams");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.01"));
            //Act Statement(s)
            List<Peer> result = target.findPeersWithServiceMask(1);
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
        }
    }

    //Sapient generated method id: ${9c1eb910-2aa2-3688-99a0-09d4ac5946e1}
    @Ignore()
    @Test()
    public void getMinBroadcastConnectionsWhenMaxLessThanOrEqualsTo1() {
        /* Branches:
         * (minBroadcastConnections == 0) : true
         * (max <= 1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001"));
            //Act Statement(s)
            int result = target.getMinBroadcastConnections();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
        }
    }

    //Sapient generated method id: ${c236d1e6-452b-3991-bb5b-5d2519e76564}
    @Ignore()
    @Test()
    public void setMinBroadcastConnectionsTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.1"));
            //Act Statement(s)
            target.setMinBroadcastConnections(5);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
        }
    }

    //Sapient generated method id: ${6f502fa7-8df1-3483-9a14-690c8634a0c8}
    @Ignore()
    @Test()
    public void broadcastTransactionWhenMaxLessThanOrEqualsTo1() {
        /* Branches:
         * (minBroadcastConnections == 0) : true  #  inside getMinBroadcastConnections method
         * (max <= 1) : true  #  inside getMinBroadcastConnections method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "{}");
        TransactionBroadcast transactionBroadcastMock = mock(TransactionBroadcast.class);
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = spy(new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0")));
            Transaction transaction = new Transaction();
            doReturn(transactionBroadcastMock).when(target).broadcastTransaction(transaction, 1, true);
            //Act Statement(s)
            TransactionBroadcast result = target.broadcastTransaction(transaction);
            //Assert statement(s)
            assertThat(result, equalTo(transactionBroadcastMock));
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            verify(target).broadcastTransaction(transaction, 1, true);
        }
    }

    //Sapient generated method id: ${7c0229a4-aba9-32bc-9ae0-56447cc5a725}
    @Ignore()
    @Test()
    public void getPingIntervalMsecTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001"));
            //Act Statement(s)
            long result = target.getPingIntervalMsec();
            //Assert statement(s)
            assertThat(result, equalTo(2000L));
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
        }
    }

    //Sapient generated method id: ${56faa203-67d3-322e-998f-16db04d52f6d}
    @Ignore()
    @Test()
    public void setPingIntervalMsecWhenGetPingIntervalMsecLessThanOrEqualsTo0() {
        /* Branches:
         * (task != null) : false
         * (getPingIntervalMsec() <= 0) : true  #  inside setupPinging method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "org.bitcoinj.params.MainNetParams");
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.5"));
            //Act Statement(s)
            target.setPingIntervalMsec(1000L);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
        }
    }

    //Sapient generated method id: ${1fed8bf1-531c-3b91-8534-5a86d0975cb1}
    @Ignore()
    @Test()
    public void getMostCommonChainHeightTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "RegTestParams");
        try (MockedStatic<PeerGroup> peerGroup = mockStatic(PeerGroup.class);
             MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            peerGroup.when(() -> PeerGroup.getMostCommonChainHeight(any())).thenReturn(0);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001"));
            //Act Statement(s)
            int result = target.getMostCommonChainHeight();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
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
        Peer peerMock = mock(Peer.class, "10");
        try (MockedStatic<PeerGroup> peerGroup = mockStatic(PeerGroup.class, CALLS_REAL_METHODS)) {
            doReturn(10L).when(peerMock).getBestHeight();
            peerGroup.when(() -> PeerGroup.maxOfMostFreq(anyList())).thenReturn(1);
            List<Peer> peerList = new ArrayList<>();
            peerList.add(peerMock);
            //Act Statement(s)
            int result = PeerGroup.getMostCommonChainHeight(peerList);
            //Assert statement(s)
            assertThat(result, equalTo(1));
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
    @Ignore()
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
        integerList.add(1);
        integerList.add(2);
        integerList.add(2);
        integerList.add(3);
        integerList.add(3);
        integerList.add(3);
        //Act Statement(s)
        int result = PeerGroup.maxOfMostFreq(integerList);
        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${25125bd0-4f27-338f-ad64-74c314ab2403}
    @Ignore()
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
        integerList.add(3);
        integerList.add(3);
        integerList.add(2);
        integerList.add(2);
        integerList.add(1);
        integerList.add(1);
        //Act Statement(s)
        int result = PeerGroup.maxOfMostFreq(integerList);
        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${9941d46e-e9ac-3bd1-ad87-69bc7a484900}
    @Ignore()
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
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(3);
        integerList.add(2);
        integerList.add(2);
        //Act Statement(s)
        int result = PeerGroup.maxOfMostFreq(integerList);
        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${ab0b920f-d78b-3f02-939c-f7dd5a9ae8bb}
    @Ignore()
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
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        //Act Statement(s)
        int result = PeerGroup.maxOfMostFreq(integerList);
        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${3c962c46-a729-32ba-8921-bf4c756fddbc}
    @Ignore()
    @Test()
    public void selectDownloadPeerWhenPeersIsEmpty() {
        /* Branches:
         * (peers.isEmpty()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            List<Peer> peerList = new ArrayList<>();
            //Act Statement(s)
            Peer result = target.selectDownloadPeer(peerList);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
        }
    }

    //Sapient generated method id: ${5df4348d-1612-3a0d-94ad-b5f29d3b5d1a}
    @Ignore()
    @Test()
    public void selectDownloadPeerWhenMostCommonChainHeightEquals0() {
        /* Branches:
         * (peers.isEmpty()) : false
         * (mostCommonChainHeight == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "{}");
        Peer peerMock = mock(Peer.class, "0");
        try (MockedStatic<PeerGroup> peerGroup = mockStatic(PeerGroup.class);
             MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            peerGroup.when(() -> PeerGroup.getMostCommonChainHeight(anyList())).thenReturn(0);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.0"));
            List<Peer> peerList = new ArrayList<>();
            peerList.add(peerMock);
            //Act Statement(s)
            Peer result = target.selectDownloadPeer(peerList);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            peerGroup.verify(() -> PeerGroup.getMostCommonChainHeight(anyList()));
        }
    }

    //Sapient generated method id: ${b297a87a-1219-33f3-b732-dbcaaa56aabd}
    @Ignore()
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
        Peer peerMock = mock(Peer.class, "1000");
        Network networkMock = mock(Network.class, "{}");
        try (MockedStatic<PeerGroup> peerGroup = mockStatic(PeerGroup.class);
             MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            VersionMessage versionMessage = new VersionMessage(networkParameters2Mock, 0);
            doReturn(versionMessage).when(peerMock).getPeerVersionMessage();
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            peerGroup.when(() -> PeerGroup.getMostCommonChainHeight(anyList())).thenReturn(1000);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001"));
            List<Peer> peerList = new ArrayList<>();
            peerList.add(peerMock);
            //Act Statement(s)
            Peer result = target.selectDownloadPeer(peerList);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            verify(peerMock).getPeerVersionMessage();
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            peerGroup.verify(() -> PeerGroup.getMostCommonChainHeight(anyList()));
        }
    }

    //Sapient generated method id: ${ba10b37a-913b-3e0e-94da-f49f55da4357}
    @Ignore()
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
        Peer peerMock = mock(Peer.class, "100");
        Network networkMock = mock(Network.class, "MAINNET");
        try (MockedStatic<PeerGroup> peerGroup = mockStatic(PeerGroup.class);
             MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            VersionMessage versionMessage = new VersionMessage(networkParameters2Mock, 0);
            doReturn(versionMessage).when(peerMock).getPeerVersionMessage();
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            peerGroup.when(() -> PeerGroup.getMostCommonChainHeight(anyList())).thenReturn(100);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001"));
            thrown.expect(IndexOutOfBoundsException.class);
            List<Peer> peerList = new ArrayList<>();
            peerList.add(peerMock);
            //Act Statement(s)
            target.selectDownloadPeer(peerList);
            //Assert statement(s)
            verify(peerMock).getPeerVersionMessage();
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            peerGroup.verify(() -> PeerGroup.getMostCommonChainHeight(anyList()));
        }
    }

    //Sapient generated method id: ${a8fd5eb3-6142-3261-8c24-2eb39c6eaf6b}
    @Ignore()
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
        Network networkMock = mock(Network.class, "{}");
        Peer peerMock = mock(Peer.class, "0");
        try (MockedStatic<PeerGroup> peerGroup = mockStatic(PeerGroup.class);
             MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(null);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            peerGroup.when(() -> PeerGroup.getMostCommonChainHeight(anyList())).thenReturn(0);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001"));
            List<Peer> peerList = new ArrayList<>();
            peerList.add(peerMock);
            //Act Statement(s)
            Peer result = target.selectDownloadPeer(peerList);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
            peerGroup.verify(() -> PeerGroup.getMostCommonChainHeight(anyList()));
        }
    }

    //Sapient generated method id: ${cbbe2d00-e0df-318d-a10e-3489531594ff}
    @Ignore()
    @Test()
    public void getDownloadPeerTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001"));
            //Act Statement(s)
            Peer result = target.getDownloadPeer();
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
        }
    }

    //Sapient generated method id: ${503873fe-45c7-3515-a88e-c64f607c2975}
    @Ignore()
    @Test()
    public void getUseLocalhostPeerWhenPossibleTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001"));
            //Act Statement(s)
            boolean result = target.getUseLocalhostPeerWhenPossible();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
        }
    }

    //Sapient generated method id: ${59976503-fc32-3fa3-a3b3-e7f83bc7b216}
    @Ignore()
    @Test()
    public void setUseLocalhostPeerWhenPossibleTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of((Network) any())).thenReturn(networkParameters2);
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(PeerGroup.class)).thenReturn(reentrantLock);
            Context context2 = new Context();
            context.when(() -> Context.getOrCreate()).thenReturn(context2);
            PeerGroup target = new PeerGroup(networkMock, (AbstractBlockChain) null, channelsMock, Double.parseDouble("0.001"));
            //Act Statement(s)
            target.setUseLocalhostPeerWhenPossible(true);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of((Network) any()));
            threading.verify(() -> Threading.lock(PeerGroup.class), atLeast(1));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
        }
    }
}
