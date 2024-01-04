package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.mockito.InjectMocks;
import org.junit.After;
import org.junit.Test;
import org.junit.Ignore;

import java.nio.channels.NotYetConnectedException;
import java.io.IOException;

import org.bitcoinj.store.BlockStoreException;
import org.bitcoinj.base.Network;
import org.bitcoinj.core.listeners.ChainDownloadStartedEventListener;
import org.bitcoinj.utils.Threading;
import org.mockito.MockitoAnnotations;

import java.time.Duration;
import java.math.BigInteger;

import org.bitcoinj.base.Coin;

import java.net.InetSocketAddress;
import java.util.ArrayList;

import org.bitcoinj.base.internal.FutureUtils;
import org.mockito.stubbing.Answer;
import org.bitcoinj.base.internal.Preconditions;
import org.bitcoinj.utils.ListenerRegistration;
import org.bitcoinj.base.Sha256Hash;

import java.net.InetAddress;

import org.bitcoinj.core.listeners.PreMessageReceivedEventListener;

import java.util.concurrent.CompletableFuture;
import java.time.Instant;

import org.junit.rules.ExpectedException;

import java.util.List;

import org.bitcoinj.wallet.Wallet;
import org.bitcoinj.core.listeners.PeerDisconnectedEventListener;
import org.bitcoinj.core.listeners.BlocksDownloadedEventListener;
import org.bitcoinj.utils.ListenableCompletableFuture;

import java.util.concurrent.locks.ReentrantLock;
import java.util.Optional;

import org.bitcoinj.core.listeners.OnTransactionBroadcastListener;

import java.util.concurrent.Executor;

import org.bitcoinj.base.internal.TimeUtils;

import java.nio.ByteBuffer;

import org.bitcoinj.core.listeners.AddressEventListener;

import java.util.function.Supplier;

import org.mockito.MockedStatic;
import org.bitcoinj.core.listeners.GetDataEventListener;
import org.bitcoinj.core.listeners.PeerConnectedEventListener;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.isA;

public class PeerSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final NetworkParameters paramsMock = mock(NetworkParameters.class, "params");

    private final VersionMessage vPeerVersionMessageMock = mock(VersionMessage.class, "vPeerVersionMessage");

    private final AbstractBlockChain blockChainMock = mock(AbstractBlockChain.class, "blockChain");

    private final Context contextMock = mock(Context.class, "context");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private Peer target;

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    @After()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${00c52a61-8e62-37ad-8f02-af5ff7dff678}
    @Ignore()
    @Test()
    public void addBlocksDownloadedEventListenerTest() {
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        BlocksDownloadedEventListener blocksDownloadedEventListenerMock = mock(BlocksDownloadedEventListener.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = spy(new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).addBlocksDownloadedEventListener((Executor) null, blocksDownloadedEventListenerMock);
            //Act Statement(s)
            target.addBlocksDownloadedEventListener(blocksDownloadedEventListenerMock);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            verify(target).addBlocksDownloadedEventListener((Executor) null, blocksDownloadedEventListenerMock);
        }
    }

    //Sapient generated method id: ${97c71366-c1db-3ce7-9814-769dc1642163}
    @Ignore()
    @Test()
    public void addBlocksDownloadedEventListener1Test() {
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        BlocksDownloadedEventListener blocksDownloadedEventListenerMock = mock(BlocksDownloadedEventListener.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //TODO: Needs initialization with real value
            Executor executor = null;
            //Act Statement(s)
            target.addBlocksDownloadedEventListener(executor, blocksDownloadedEventListenerMock);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
        }
    }

    //Sapient generated method id: ${c11d7f2e-8338-3fd7-b80d-222bef42da68}
    @Ignore()
    @Test()
    public void addChainDownloadStartedEventListenerTest() {
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        ChainDownloadStartedEventListener chainDownloadStartedEventListenerMock = mock(ChainDownloadStartedEventListener.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = spy(new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).addChainDownloadStartedEventListener((Executor) null, chainDownloadStartedEventListenerMock);
            //Act Statement(s)
            target.addChainDownloadStartedEventListener(chainDownloadStartedEventListenerMock);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            verify(target).addChainDownloadStartedEventListener((Executor) null, chainDownloadStartedEventListenerMock);
        }
    }

    //Sapient generated method id: ${092ee437-e448-38ad-8be0-688d55976fe0}
    @Ignore()
    @Test()
    public void addChainDownloadStartedEventListener1Test() {
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        ChainDownloadStartedEventListener chainDownloadStartedEventListenerMock = mock(ChainDownloadStartedEventListener.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //TODO: Needs initialization with real value
            Executor executor = null;
            //Act Statement(s)
            target.addChainDownloadStartedEventListener(executor, chainDownloadStartedEventListenerMock);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
        }
    }

    //Sapient generated method id: ${551c84dc-3cfa-36cf-9cd9-0a39cdbeebcb}
    @Ignore()
    @Test()
    public void addConnectedEventListenerTest() {
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        PeerConnectedEventListener peerConnectedEventListenerMock = mock(PeerConnectedEventListener.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = spy(new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).addConnectedEventListener((Executor) null, peerConnectedEventListenerMock);
            //Act Statement(s)
            target.addConnectedEventListener(peerConnectedEventListenerMock);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            verify(target).addConnectedEventListener((Executor) null, peerConnectedEventListenerMock);
        }
    }

    //Sapient generated method id: ${ea194ea1-a7a4-3311-9f90-586207598415}
    @Ignore()
    @Test()
    public void addConnectedEventListener1Test() {
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        PeerConnectedEventListener peerConnectedEventListenerMock = mock(PeerConnectedEventListener.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //TODO: Needs initialization with real value
            Executor executor = null;
            //Act Statement(s)
            target.addConnectedEventListener(executor, peerConnectedEventListenerMock);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
        }
    }

    //Sapient generated method id: ${559dc831-c890-3f1d-ad16-2e8e52a4ee44}
    @Ignore()
    @Test()
    public void addDisconnectedEventListenerTest() {
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        PeerDisconnectedEventListener peerDisconnectedEventListenerMock = mock(PeerDisconnectedEventListener.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = spy(new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).addDisconnectedEventListener((Executor) null, peerDisconnectedEventListenerMock);
            //Act Statement(s)
            target.addDisconnectedEventListener(peerDisconnectedEventListenerMock);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            verify(target).addDisconnectedEventListener((Executor) null, peerDisconnectedEventListenerMock);
        }
    }

    //Sapient generated method id: ${19bb2ab7-7876-38e9-976a-04483f499dfa}
    @Ignore()
    @Test()
    public void addDisconnectedEventListener1Test() {
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        PeerDisconnectedEventListener peerDisconnectedEventListenerMock = mock(PeerDisconnectedEventListener.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //TODO: Needs initialization with real value
            Executor executor = null;
            //Act Statement(s)
            target.addDisconnectedEventListener(executor, peerDisconnectedEventListenerMock);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
        }
    }

    //Sapient generated method id: ${4cd1dec5-33aa-3127-a1c4-c5d7aa3f1524}
    @Ignore()
    @Test()
    public void addGetDataEventListenerTest() {
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        GetDataEventListener getDataEventListenerMock = mock(GetDataEventListener.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = spy(new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).addGetDataEventListener((Executor) null, getDataEventListenerMock);
            //Act Statement(s)
            target.addGetDataEventListener(getDataEventListenerMock);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            verify(target).addGetDataEventListener((Executor) null, getDataEventListenerMock);
        }
    }

    //Sapient generated method id: ${35974df2-9357-3492-9cd6-ce43fda472d2}
    @Ignore()
    @Test()
    public void addGetDataEventListener1Test() {
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        GetDataEventListener getDataEventListenerMock = mock(GetDataEventListener.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //TODO: Needs initialization with real value
            Executor executor = null;
            //Act Statement(s)
            target.addGetDataEventListener(executor, getDataEventListenerMock);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
        }
    }

    //Sapient generated method id: ${fa4a053c-3288-3757-bf2a-9bd35587f295}
    @Ignore()
    @Test()
    public void addOnTransactionBroadcastListenerTest() {
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        OnTransactionBroadcastListener onTransactionBroadcastListenerMock = mock(OnTransactionBroadcastListener.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = spy(new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).addOnTransactionBroadcastListener((Executor) null, onTransactionBroadcastListenerMock);
            //Act Statement(s)
            target.addOnTransactionBroadcastListener(onTransactionBroadcastListenerMock);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            verify(target).addOnTransactionBroadcastListener((Executor) null, onTransactionBroadcastListenerMock);
        }
    }

    //Sapient generated method id: ${32ca1a14-325b-39fb-abaa-274d6255ff42}
    @Ignore()
    @Test()
    public void addOnTransactionBroadcastListener1Test() {
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        OnTransactionBroadcastListener onTransactionBroadcastListenerMock = mock(OnTransactionBroadcastListener.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //TODO: Needs initialization with real value
            Executor executor = null;
            //Act Statement(s)
            target.addOnTransactionBroadcastListener(executor, onTransactionBroadcastListenerMock);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
        }
    }

    //Sapient generated method id: ${d6c619a0-0eb3-3165-9522-25eb00b3cf25}
    @Ignore()
    @Test()
    public void addPreMessageReceivedEventListenerTest() {
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        PreMessageReceivedEventListener preMessageReceivedEventListenerMock = mock(PreMessageReceivedEventListener.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = spy(new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).addPreMessageReceivedEventListener((Executor) null, preMessageReceivedEventListenerMock);
            //Act Statement(s)
            target.addPreMessageReceivedEventListener(preMessageReceivedEventListenerMock);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            verify(target).addPreMessageReceivedEventListener((Executor) null, preMessageReceivedEventListenerMock);
        }
    }

    //Sapient generated method id: ${4f51806c-fbd9-3401-ac7f-e9e77594c4c6}
    @Ignore()
    @Test()
    public void addPreMessageReceivedEventListener1Test() {
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        PreMessageReceivedEventListener preMessageReceivedEventListenerMock = mock(PreMessageReceivedEventListener.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //TODO: Needs initialization with real value
            Executor executor = null;
            //Act Statement(s)
            target.addPreMessageReceivedEventListener(executor, preMessageReceivedEventListenerMock);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
        }
    }

    //Sapient generated method id: ${3b9cca88-5ab9-3be3-86a1-9343eeee7504}
    @Ignore()
    @Test()
    public void addAddressEventListenerTest() {
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        AddressEventListener addressEventListenerMock = mock(AddressEventListener.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = spy(new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).addAddressEventListener((Executor) null, addressEventListenerMock);
            //Act Statement(s)
            target.addAddressEventListener(addressEventListenerMock);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            verify(target).addAddressEventListener((Executor) null, addressEventListenerMock);
        }
    }

    //Sapient generated method id: ${cdd439cb-7633-3e44-8437-9ff4d49bde8e}
    @Ignore()
    @Test()
    public void addAddressEventListener1Test() {
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        AddressEventListener addressEventListenerMock = mock(AddressEventListener.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //TODO: Needs initialization with real value
            Executor executor = null;
            //Act Statement(s)
            target.addAddressEventListener(executor, addressEventListenerMock);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
        }
    }

    //Sapient generated method id: ${5f0fdca8-4345-3cd0-99a7-8498ae08c0e5}
    @Test()
    public void removeBlocksDownloadedEventListenerWhenListenerRegistrationRemoveFromListListenerBlocksDownloadedEventListeners() {
        /* Branches:
         * (ListenerRegistration.removeFromList(listener, blocksDownloadedEventListeners)) : true
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        BlocksDownloadedEventListener blocksDownloadedEventListenerMock = mock(BlocksDownloadedEventListener.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(blocksDownloadedEventListenerMock), any())).thenReturn(true);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.removeBlocksDownloadedEventListener(blocksDownloadedEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(blocksDownloadedEventListenerMock), any()));
        }
    }

    //Sapient generated method id: ${5985ba37-d992-3f94-92fc-4d416fd75fbf}
    @Test()
    public void removeBlocksDownloadedEventListenerWhenListenerRegistrationNotRemoveFromListListenerBlocksDownloadedEventListeners() {
        /* Branches:
         * (ListenerRegistration.removeFromList(listener, blocksDownloadedEventListeners)) : false
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        BlocksDownloadedEventListener blocksDownloadedEventListenerMock = mock(BlocksDownloadedEventListener.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(blocksDownloadedEventListenerMock), any())).thenReturn(false);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.removeBlocksDownloadedEventListener(blocksDownloadedEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(blocksDownloadedEventListenerMock), any()));
        }
    }

    //Sapient generated method id: ${8d0b5707-27f5-3f86-aca2-ccadad33283e}
    @Test()
    public void removeChainDownloadStartedEventListenerWhenListenerRegistrationRemoveFromListListenerChainDownloadStartedEventListeners() {
        /* Branches:
         * (ListenerRegistration.removeFromList(listener, chainDownloadStartedEventListeners)) : true
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        ChainDownloadStartedEventListener chainDownloadStartedEventListenerMock = mock(ChainDownloadStartedEventListener.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(chainDownloadStartedEventListenerMock), any())).thenReturn(true);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.removeChainDownloadStartedEventListener(chainDownloadStartedEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(chainDownloadStartedEventListenerMock), any()));
        }
    }

    //Sapient generated method id: ${8a4bc1ea-889a-34a0-b8fb-30f50c7329c8}
    @Test()
    public void removeChainDownloadStartedEventListenerWhenListenerRegistrationNotRemoveFromListListenerChainDownloadStartedEventListen() {
        /* Branches:
         * (ListenerRegistration.removeFromList(listener, chainDownloadStartedEventListeners)) : false
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        ChainDownloadStartedEventListener chainDownloadStartedEventListenerMock = mock(ChainDownloadStartedEventListener.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(chainDownloadStartedEventListenerMock), any())).thenReturn(false);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.removeChainDownloadStartedEventListener(chainDownloadStartedEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(chainDownloadStartedEventListenerMock), any()));
        }
    }

    //Sapient generated method id: ${f36be306-62cf-3bee-9d31-80907b91d80e}
    @Test()
    public void removeConnectedEventListenerWhenListenerRegistrationRemoveFromListListenerConnectedEventListeners() {
        /* Branches:
         * (ListenerRegistration.removeFromList(listener, connectedEventListeners)) : true
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        PeerConnectedEventListener peerConnectedEventListenerMock = mock(PeerConnectedEventListener.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(peerConnectedEventListenerMock), any())).thenReturn(true);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.removeConnectedEventListener(peerConnectedEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(peerConnectedEventListenerMock), any()));
        }
    }

    //Sapient generated method id: ${4bdc761b-4605-3d87-896f-c6f547334f5f}
    @Test()
    public void removeConnectedEventListenerWhenListenerRegistrationNotRemoveFromListListenerConnectedEventListeners() {
        /* Branches:
         * (ListenerRegistration.removeFromList(listener, connectedEventListeners)) : false
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        PeerConnectedEventListener peerConnectedEventListenerMock = mock(PeerConnectedEventListener.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(peerConnectedEventListenerMock), any())).thenReturn(false);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.removeConnectedEventListener(peerConnectedEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(peerConnectedEventListenerMock), any()));
        }
    }

    //Sapient generated method id: ${44127078-f982-3884-95a9-49a51e2b47c4}
    @Test()
    public void removeDisconnectedEventListenerWhenListenerRegistrationRemoveFromListListenerDisconnectedEventListeners() {
        /* Branches:
         * (ListenerRegistration.removeFromList(listener, disconnectedEventListeners)) : true
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        PeerDisconnectedEventListener peerDisconnectedEventListenerMock = mock(PeerDisconnectedEventListener.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(peerDisconnectedEventListenerMock), any())).thenReturn(true);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.removeDisconnectedEventListener(peerDisconnectedEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(peerDisconnectedEventListenerMock), any()));
        }
    }

    //Sapient generated method id: ${8d349d48-ed3a-34df-bc44-3655fbf49585}
    @Test()
    public void removeDisconnectedEventListenerWhenListenerRegistrationNotRemoveFromListListenerDisconnectedEventListeners() {
        /* Branches:
         * (ListenerRegistration.removeFromList(listener, disconnectedEventListeners)) : false
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        PeerDisconnectedEventListener peerDisconnectedEventListenerMock = mock(PeerDisconnectedEventListener.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(peerDisconnectedEventListenerMock), any())).thenReturn(false);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.removeDisconnectedEventListener(peerDisconnectedEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(peerDisconnectedEventListenerMock), any()));
        }
    }

    //Sapient generated method id: ${7ee66f14-a241-3c41-a0d9-02089cbf7dcd}
    @Test()
    public void removeGetDataEventListenerWhenListenerRegistrationRemoveFromListListenerGetDataEventListeners() {
        /* Branches:
         * (ListenerRegistration.removeFromList(listener, getDataEventListeners)) : true
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        GetDataEventListener getDataEventListenerMock = mock(GetDataEventListener.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(getDataEventListenerMock), any())).thenReturn(true);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.removeGetDataEventListener(getDataEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(getDataEventListenerMock), any()));
        }
    }

    //Sapient generated method id: ${b347aab4-9a10-3ae5-abac-bfc1984aade5}
    @Test()
    public void removeGetDataEventListenerWhenListenerRegistrationNotRemoveFromListListenerGetDataEventListeners() {
        /* Branches:
         * (ListenerRegistration.removeFromList(listener, getDataEventListeners)) : false
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        GetDataEventListener getDataEventListenerMock = mock(GetDataEventListener.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(getDataEventListenerMock), any())).thenReturn(false);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.removeGetDataEventListener(getDataEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(getDataEventListenerMock), any()));
        }
    }

    //Sapient generated method id: ${b33a0065-afae-34b6-9d70-705b9355eee9}
    @Test()
    public void removeOnTransactionBroadcastListenerWhenListenerRegistrationRemoveFromListListenerOnTransactionEventListeners() {
        /* Branches:
         * (ListenerRegistration.removeFromList(listener, onTransactionEventListeners)) : true
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        OnTransactionBroadcastListener onTransactionBroadcastListenerMock = mock(OnTransactionBroadcastListener.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(onTransactionBroadcastListenerMock), any())).thenReturn(true);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.removeOnTransactionBroadcastListener(onTransactionBroadcastListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(onTransactionBroadcastListenerMock), any()));
        }
    }

    //Sapient generated method id: ${dcb8cb2c-d317-30ef-a389-659cb056b60b}
    @Test()
    public void removeOnTransactionBroadcastListenerWhenListenerRegistrationNotRemoveFromListListenerOnTransactionEventListeners() {
        /* Branches:
         * (ListenerRegistration.removeFromList(listener, onTransactionEventListeners)) : false
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        OnTransactionBroadcastListener onTransactionBroadcastListenerMock = mock(OnTransactionBroadcastListener.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(onTransactionBroadcastListenerMock), any())).thenReturn(false);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.removeOnTransactionBroadcastListener(onTransactionBroadcastListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(onTransactionBroadcastListenerMock), any()));
        }
    }

    //Sapient generated method id: ${8ab243fc-8b67-3a30-b3fc-7ded5143d8ad}
    @Test()
    public void removePreMessageReceivedEventListenerWhenListenerRegistrationRemoveFromListListenerPreMessageReceivedEventListeners() {
        /* Branches:
         * (ListenerRegistration.removeFromList(listener, preMessageReceivedEventListeners)) : true
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        PreMessageReceivedEventListener preMessageReceivedEventListenerMock = mock(PreMessageReceivedEventListener.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(preMessageReceivedEventListenerMock), any())).thenReturn(true);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.removePreMessageReceivedEventListener(preMessageReceivedEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(preMessageReceivedEventListenerMock), any()));
        }
    }

    //Sapient generated method id: ${6cc4e8a3-46f9-3ca3-887f-c19654342c72}
    @Test()
    public void removePreMessageReceivedEventListenerWhenListenerRegistrationNotRemoveFromListListenerPreMessageReceivedEventListeners() {
        /* Branches:
         * (ListenerRegistration.removeFromList(listener, preMessageReceivedEventListeners)) : false
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        PreMessageReceivedEventListener preMessageReceivedEventListenerMock = mock(PreMessageReceivedEventListener.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(preMessageReceivedEventListenerMock), any())).thenReturn(false);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.removePreMessageReceivedEventListener(preMessageReceivedEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(preMessageReceivedEventListenerMock), any()));
        }
    }

    //Sapient generated method id: ${63a8b9de-60bb-3e17-8199-73cfcf1926aa}
    @Test()
    public void removeAddressEventListenerWhenListenerRegistrationRemoveFromListListenerAddressEventListeners() {
        /* Branches:
         * (ListenerRegistration.removeFromList(listener, addressEventListeners)) : true
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        AddressEventListener addressEventListenerMock = mock(AddressEventListener.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(addressEventListenerMock), any())).thenReturn(true);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.removeAddressEventListener(addressEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(addressEventListenerMock), any()));
        }
    }

    //Sapient generated method id: ${91521948-2692-30b7-a864-c2dbec47ec93}
    @Test()
    public void removeAddressEventListenerWhenListenerRegistrationNotRemoveFromListListenerAddressEventListeners() {
        /* Branches:
         * (ListenerRegistration.removeFromList(listener, addressEventListeners)) : false
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        AddressEventListener addressEventListenerMock = mock(AddressEventListener.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<ListenerRegistration> listenerRegistration = mockStatic(ListenerRegistration.class);
             MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            listenerRegistration.when(() -> ListenerRegistration.removeFromList(eq(addressEventListenerMock), any())).thenReturn(false);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.removeAddressEventListener(addressEventListenerMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            listenerRegistration.verify(() -> ListenerRegistration.removeFromList(eq(addressEventListenerMock), any()));
        }
    }

    //Sapient generated method id: ${b3b94152-5234-3201-9a50-4bf966a1b50e}
    @Ignore()
    @Test()
    public void toStringWhenVPeerVersionMessageLocalServicesHasAny() {
        /* Branches:
         * (vPeerVersionMessage.localServices.hasAny()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        Services localServicesMock = mock(Services.class, "toString_services1");
        try (MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class);
             MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            ReentrantLock reentrantLock = Threading.lock(PeerSocketHandler.class);
            threading.when(() -> Threading.lock(PeerSocketHandler.class)).thenReturn(reentrantLock);
            ReentrantLock reentrantLock2 = Threading.lock(Peer.class);
            threading.when(() -> Threading.lock(Peer.class)).thenReturn(reentrantLock2);
            context.when(() -> Context.get()).thenReturn(contextMock);
            timeUtils.when(() -> TimeUtils.dateTimeFormat((Instant) any())).thenReturn("return_of_dateTimeFormat1");
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(true).when(localServicesMock).hasAny();
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("toString_moreObjects.ToStringHelper2"));
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            threading.verify(() -> Threading.lock(PeerSocketHandler.class), atLeast(1));
            threading.verify(() -> Threading.lock(Peer.class), atLeast(1));
            context.verify(() -> Context.get(), atLeast(1));
            timeUtils.verify(() -> TimeUtils.dateTimeFormat((Instant) any()));
            verify(localServicesMock).hasAny();
        }
    }

    //Sapient generated method id: ${075b4de8-0b4b-3bbb-b496-437778c9ad15}
    @Ignore(value = "Potential harmful system call (CompletableFuture.isDone) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void timeoutOccurredWhenConnectionOpenFutureNotIsDone() {
        /* Branches:
         * (!connectionOpenFuture.isDone()) : true
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = spy(new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).close();
            doNothing().when(target).connectionClosed();
            //Act Statement(s)
            target.timeoutOccurred();
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            verify(target).close();
            verify(target).connectionClosed();
        }
    }

    //Sapient generated method id: ${25db16a0-a3f4-3437-9876-07fba4305f4a}
    @Test()
    public void connectionClosedWhenDisconnectedEventListenersIsEmpty() {
        /* Branches:
         * (for-each(disconnectedEventListeners)) : false
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.connectionClosed();
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
        }
    }

    //Sapient generated method id: ${c38ef2f2-0fad-3a8a-87e4-77a73dc4ec5a}
    @Ignore(value = "Potential harmful system call (CompletableFuture.complete) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void connectionOpenedWhenAddressIsNull() throws NotYetConnectedException, IOException {
        /* Branches:
         * (address == null) : true
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        ListenableCompletableFuture<Void> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            versionMessageMock.subVer = "subVer1";
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = spy(new Peer(paramsMock, versionMessageMock, (PeerAddress) null, blockChainMock, 0L, 0));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(listenableCompletableFutureMock).when(target).sendMessage(versionMessageMock);
            //Act Statement(s)
            target.connectionOpened();
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            verify(target).sendMessage(versionMessageMock);
        }
    }

    //Sapient generated method id: ${f071099f-7d9a-3d0e-bb42-8e6331942294}
    @Ignore(value = "Potential harmful system call (CompletableFuture.complete) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void connectionOpenedWhenAddressIsNotNull() throws NotYetConnectedException, IOException {
        /* Branches:
         * (address == null) : false
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress addressMock = mock(PeerAddress.class);
        ListenableCompletableFuture<Void> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            versionMessageMock.subVer = "subVer1";
            InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
            doReturn(inetSocketAddress).when(addressMock).toSocketAddress();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = spy(new Peer(paramsMock, versionMessageMock, addressMock, blockChainMock, 0L, 0));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(listenableCompletableFutureMock).when(target).sendMessage(versionMessageMock);
            //Act Statement(s)
            target.connectionOpened();
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            verify(addressMock).toSocketAddress();
            context.verify(() -> Context.get(), atLeast(1));
            verify(target).sendMessage(versionMessageMock);
        }
    }

    //Sapient generated method id: ${1e620967-3b40-3037-b0f2-d8bb27520f92}
    @Ignore()
    @Test()
    public void getConnectionOpenFutureTest() {
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            ListenableCompletableFuture<Peer> result = target.getConnectionOpenFuture();
            CompletableFuture completableFuture = new CompletableFuture();
            ListenableCompletableFuture<Peer> listenableCompletableFuture = ListenableCompletableFuture.of(completableFuture);
            //Assert statement(s)
            //TODO: Please implement equals method in ListenableCompletableFuture for verification to succeed or you need to adjust respective assertion statements
            assertThat(result, equalTo(listenableCompletableFuture));
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
        }
    }

    //Sapient generated method id: ${aaf609d0-f824-340e-afa2-e3b63a96d694}
    @Test()
    public void getVersionHandshakeFutureTest() {
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        ListenableCompletableFuture<Peer> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<ListenableCompletableFuture> listenableCompletableFuture = mockStatic(ListenableCompletableFuture.class);
             MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            listenableCompletableFuture.when(() -> ListenableCompletableFuture.of((CompletableFuture) any())).thenReturn(listenableCompletableFutureMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            ListenableCompletableFuture<Peer> result = target.getVersionHandshakeFuture();
            //Assert statement(s)
            assertThat(result, equalTo(listenableCompletableFutureMock));
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            listenableCompletableFuture.verify(() -> ListenableCompletableFuture.of((CompletableFuture) any()));
        }
    }

    //Sapient generated method id: ${cbd10551-604a-3b40-ad3a-8d98cf217fc3}
    @Test()
    public void processMessageWhenMIsNull() throws Exception {
        /* Branches:
         * (for-each(preMessageReceivedEventListeners)) : false
         * (m == null) : true
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            Message message = null;
            //Act Statement(s)
            target.processMessage(message);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
        }
    }

    //Sapient generated method id: ${2ab5bc7c-1c03-301c-9b51-8165e7679936}
    @Ignore(value = "Potential harmful system call (CompletableFuture.isCancelled, CompletableFuture.isDone) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void processMessageWhenVersionHandshakeFutureIsCancelledThrowsProtocolException() throws Exception {
        /* Branches:
         * (for-each(preMessageReceivedEventListeners)) : false
         * (m == null) : false
         * (currentFilteredBlock != null) : false
         * (!(m instanceof VersionMessage || m instanceof VersionAck || m instanceof SendAddrV2Message || (versionHandshakeFuture.isDone() && !versionHandshakeFuture.isCancelled()))) : true
         * (m instanceof VersionMessage) : false
         * (m instanceof VersionAck) : false
         * (versionHandshakeFuture.isDone()) : true
         * (!versionHandshakeFuture.isCancelled()) : false
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        Message messageMock = mock(Message.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(ProtocolException.class);
            //Act Statement(s)
            target.processMessage(messageMock);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
        }
    }

    //Sapient generated method id: ${eb75229e-2dbb-305d-a3fb-817b84b1d4a4}
    @Ignore(value = "Potential harmful system call (CompletableFuture.isCancelled, CompletableFuture.isDone) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void processMessageWhenMInstanceOfPing() throws Exception {
        /* Branches:
         * (for-each(preMessageReceivedEventListeners)) : false
         * (m == null) : false
         * (currentFilteredBlock != null) : false
         * (!(m instanceof VersionMessage || m instanceof VersionAck || m instanceof SendAddrV2Message || (versionHandshakeFuture.isDone() && !versionHandshakeFuture.isCancelled()))) : true
         * (m instanceof VersionMessage) : false
         * (m instanceof VersionAck) : false
         * (versionHandshakeFuture.isDone()) : true
         * (!versionHandshakeFuture.isCancelled()) : true
         * (m instanceof Ping) : true
         */
        //Arrange Statement(s)
        Ping mMock = mock(Ping.class);
        Pong pongMock = mock(Pong.class);
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        ListenableCompletableFuture<Void> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(pongMock).when(mMock).pong();
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = spy(new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(listenableCompletableFutureMock).when(target).sendMessage(pongMock);
            //Act Statement(s)
            target.processMessage(mMock);
            //Assert statement(s)
            verify(mMock).pong();
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            verify(target).sendMessage(pongMock);
        }
    }

    //Sapient generated method id: ${78d2e1ad-1f99-3549-9d1e-828c4fd852c1}
    @Ignore(value = "Potential harmful system call (CompletableFuture.isCancelled, CompletableFuture.isDone) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void processMessageWhenMInstanceOfPong() throws Exception {
        /* Branches:
         * (for-each(preMessageReceivedEventListeners)) : false
         * (m == null) : false
         * (currentFilteredBlock != null) : false
         * (!(m instanceof VersionMessage || m instanceof VersionAck || m instanceof SendAddrV2Message || (versionHandshakeFuture.isDone() && !versionHandshakeFuture.isCancelled()))) : true
         * (m instanceof VersionMessage) : false
         * (m instanceof VersionAck) : false
         * (versionHandshakeFuture.isDone()) : true
         * (!versionHandshakeFuture.isCancelled()) : true
         * (m instanceof Ping) : false
         * (m instanceof Pong) : true
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        Pong pongMock = mock(Pong.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = spy(new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).processPong(pongMock);
            //Act Statement(s)
            target.processMessage(pongMock);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            verify(target).processPong(pongMock);
        }
    }

    //Sapient generated method id: ${e5941969-8a06-336b-bcc6-20c4ef4b128b}
    @Ignore(value = "Potential harmful system call (CompletableFuture.isCancelled, CompletableFuture.isDone) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void processMessageWhenMInstanceOfNotFoundMessage() throws Exception {
        /* Branches:
         * (for-each(preMessageReceivedEventListeners)) : false
         * (m == null) : false
         * (currentFilteredBlock != null) : false
         * (!(m instanceof VersionMessage || m instanceof VersionAck || m instanceof SendAddrV2Message || (versionHandshakeFuture.isDone() && !versionHandshakeFuture.isCancelled()))) : true
         * (m instanceof VersionMessage) : false
         * (m instanceof VersionAck) : false
         * (versionHandshakeFuture.isDone()) : true
         * (!versionHandshakeFuture.isCancelled()) : true
         * (m instanceof Ping) : false
         * (m instanceof Pong) : false
         * (m instanceof NotFoundMessage) : true
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        NotFoundMessage notFoundMessageMock = mock(NotFoundMessage.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = spy(new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).processNotFoundMessage(notFoundMessageMock);
            //Act Statement(s)
            target.processMessage(notFoundMessageMock);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            verify(target).processNotFoundMessage(notFoundMessageMock);
        }
    }

    //Sapient generated method id: ${000d08b8-f87f-395c-9b09-f5feef6a73fc}
    @Ignore(value = "Potential harmful system call (CompletableFuture.isCancelled, CompletableFuture.isDone) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void processMessageWhenMInstanceOfInventoryMessage() throws Exception {
        /* Branches:
         * (for-each(preMessageReceivedEventListeners)) : false
         * (m == null) : false
         * (currentFilteredBlock != null) : false
         * (!(m instanceof VersionMessage || m instanceof VersionAck || m instanceof SendAddrV2Message || (versionHandshakeFuture.isDone() && !versionHandshakeFuture.isCancelled()))) : true
         * (m instanceof VersionMessage) : false
         * (m instanceof VersionAck) : false
         * (versionHandshakeFuture.isDone()) : true
         * (!versionHandshakeFuture.isCancelled()) : true
         * (m instanceof Ping) : false
         * (m instanceof Pong) : false
         * (m instanceof NotFoundMessage) : false
         * (m instanceof InventoryMessage) : true
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        InventoryMessage inventoryMessageMock = mock(InventoryMessage.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = spy(new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).processInv(inventoryMessageMock);
            //Act Statement(s)
            target.processMessage(inventoryMessageMock);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            verify(target).processInv(inventoryMessageMock);
        }
    }

    //Sapient generated method id: ${dbbbfc68-faf1-31a0-affb-b7fd21f3570f}
    @Ignore(value = "Potential harmful system call (CompletableFuture.isCancelled, CompletableFuture.isDone) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void processMessageWhenMInstanceOfBlock() throws Exception {
        /* Branches:
         * (for-each(preMessageReceivedEventListeners)) : false
         * (m == null) : false
         * (currentFilteredBlock != null) : false
         * (!(m instanceof VersionMessage || m instanceof VersionAck || m instanceof SendAddrV2Message || (versionHandshakeFuture.isDone() && !versionHandshakeFuture.isCancelled()))) : true
         * (m instanceof VersionMessage) : false
         * (m instanceof VersionAck) : false
         * (versionHandshakeFuture.isDone()) : true
         * (!versionHandshakeFuture.isCancelled()) : true
         * (m instanceof Ping) : false
         * (m instanceof Pong) : false
         * (m instanceof NotFoundMessage) : false
         * (m instanceof InventoryMessage) : false
         * (m instanceof Block) : true
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        Block blockMock2 = mock(Block.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = spy(new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).processBlock(blockMock2);
            //Act Statement(s)
            target.processMessage(blockMock2);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            verify(target).processBlock(blockMock2);
        }
    }

    //Sapient generated method id: ${0ffc7938-4f70-3f65-9cdf-42685787b6ea}
    @Ignore(value = "Potential harmful system call (CompletableFuture.isCancelled, CompletableFuture.isDone) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void processMessageWhenMInstanceOfFilteredBlock() throws Exception {
        /* Branches:
         * (for-each(preMessageReceivedEventListeners)) : false
         * (m == null) : false
         * (currentFilteredBlock != null) : false
         * (!(m instanceof VersionMessage || m instanceof VersionAck || m instanceof SendAddrV2Message || (versionHandshakeFuture.isDone() && !versionHandshakeFuture.isCancelled()))) : true
         * (m instanceof VersionMessage) : false
         * (m instanceof VersionAck) : false
         * (versionHandshakeFuture.isDone()) : true
         * (!versionHandshakeFuture.isCancelled()) : true
         * (m instanceof Ping) : false
         * (m instanceof Pong) : false
         * (m instanceof NotFoundMessage) : false
         * (m instanceof InventoryMessage) : false
         * (m instanceof Block) : false
         * (m instanceof FilteredBlock) : true
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        FilteredBlock filteredBlockMock = mock(FilteredBlock.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.processMessage(filteredBlockMock);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
        }
    }

    //Sapient generated method id: ${3410398e-5455-331d-8b91-000e67c7b375}
    @Ignore(value = "Potential harmful system call (CompletableFuture.isCancelled, CompletableFuture.isDone) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void processMessageWhenMInstanceOfTransaction() throws Exception {
        /* Branches:
         * (for-each(preMessageReceivedEventListeners)) : false
         * (m == null) : false
         * (currentFilteredBlock != null) : false
         * (!(m instanceof VersionMessage || m instanceof VersionAck || m instanceof SendAddrV2Message || (versionHandshakeFuture.isDone() && !versionHandshakeFuture.isCancelled()))) : true
         * (m instanceof VersionMessage) : false
         * (m instanceof VersionAck) : false
         * (versionHandshakeFuture.isDone()) : true
         * (!versionHandshakeFuture.isCancelled()) : true
         * (m instanceof Ping) : false
         * (m instanceof Pong) : false
         * (m instanceof NotFoundMessage) : false
         * (m instanceof InventoryMessage) : false
         * (m instanceof Block) : false
         * (m instanceof FilteredBlock) : false
         * (m instanceof Transaction) : true
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        Transaction transactionMock = mock(Transaction.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = spy(new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).processTransaction(transactionMock);
            //Act Statement(s)
            target.processMessage(transactionMock);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            verify(target).processTransaction(transactionMock);
        }
    }

    //Sapient generated method id: ${cd9611a4-78b3-3a31-955d-9b17d75b56d4}
    @Ignore(value = "Potential harmful system call (CompletableFuture.isCancelled, CompletableFuture.isDone) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void processMessageWhenMInstanceOfGetDataMessage() throws Exception {
        /* Branches:
         * (for-each(preMessageReceivedEventListeners)) : false
         * (m == null) : false
         * (currentFilteredBlock != null) : false
         * (!(m instanceof VersionMessage || m instanceof VersionAck || m instanceof SendAddrV2Message || (versionHandshakeFuture.isDone() && !versionHandshakeFuture.isCancelled()))) : true
         * (m instanceof VersionMessage) : false
         * (m instanceof VersionAck) : false
         * (versionHandshakeFuture.isDone()) : true
         * (!versionHandshakeFuture.isCancelled()) : true
         * (m instanceof Ping) : false
         * (m instanceof Pong) : false
         * (m instanceof NotFoundMessage) : false
         * (m instanceof InventoryMessage) : false
         * (m instanceof Block) : false
         * (m instanceof FilteredBlock) : false
         * (m instanceof Transaction) : false
         * (m instanceof GetDataMessage) : true
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        GetDataMessage getDataMessageMock = mock(GetDataMessage.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = spy(new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).processGetData(getDataMessageMock);
            //Act Statement(s)
            target.processMessage(getDataMessageMock);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            verify(target).processGetData(getDataMessageMock);
        }
    }

    //Sapient generated method id: ${8a11c469-fb55-3373-8584-5dbcd8ebe50e}
    @Ignore(value = "Potential harmful system call (CompletableFuture.isCancelled, CompletableFuture.isDone) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void processMessageWhenMInstanceOfHeadersMessage() throws Exception {
        /* Branches:
         * (for-each(preMessageReceivedEventListeners)) : false
         * (m == null) : false
         * (currentFilteredBlock != null) : false
         * (!(m instanceof VersionMessage || m instanceof VersionAck || m instanceof SendAddrV2Message || (versionHandshakeFuture.isDone() && !versionHandshakeFuture.isCancelled()))) : true
         * (m instanceof VersionMessage) : false
         * (m instanceof VersionAck) : false
         * (versionHandshakeFuture.isDone()) : true
         * (!versionHandshakeFuture.isCancelled()) : true
         * (m instanceof Ping) : false
         * (m instanceof Pong) : false
         * (m instanceof NotFoundMessage) : false
         * (m instanceof InventoryMessage) : false
         * (m instanceof Block) : false
         * (m instanceof FilteredBlock) : false
         * (m instanceof Transaction) : false
         * (m instanceof GetDataMessage) : false
         * (m instanceof AddressMessage) : false
         * (m instanceof HeadersMessage) : true
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        HeadersMessage headersMessageMock = mock(HeadersMessage.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = spy(new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).processHeaders(headersMessageMock);
            //Act Statement(s)
            target.processMessage(headersMessageMock);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            verify(target).processHeaders(headersMessageMock);
        }
    }

    //Sapient generated method id: ${a859b22b-9da0-3cc6-b12d-1788d893c30b}
    @Ignore(value = "Potential harmful system call (CompletableFuture.isCancelled, CompletableFuture.isDone) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void processMessageWhenFutureIsNull() throws Exception {
        /* Branches:
         * (for-each(preMessageReceivedEventListeners)) : false
         * (m == null) : false
         * (currentFilteredBlock != null) : false
         * (!(m instanceof VersionMessage || m instanceof VersionAck || m instanceof SendAddrV2Message || (versionHandshakeFuture.isDone() && !versionHandshakeFuture.isCancelled()))) : true
         * (m instanceof VersionMessage) : false
         * (m instanceof VersionAck) : false
         * (versionHandshakeFuture.isDone()) : true
         * (!versionHandshakeFuture.isCancelled()) : true
         * (m instanceof Ping) : false
         * (m instanceof Pong) : false
         * (m instanceof NotFoundMessage) : false
         * (m instanceof InventoryMessage) : false
         * (m instanceof Block) : false
         * (m instanceof FilteredBlock) : false
         * (m instanceof Transaction) : false
         * (m instanceof GetDataMessage) : false
         * (m instanceof AddressMessage) : true
         * (for-each(addressEventListeners)) : false  #  inside processAddressMessage method
         * (future == null) : true  #  inside processAddressMessage method
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        AddressMessage addressMessageMock = mock(AddressMessage.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.processMessage(addressMessageMock);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
        }
    }

    //Sapient generated method id: ${acb98b80-a2e6-3cc8-8ac7-371c25e83906}
    @Ignore(value = "Potential harmful system call (CompletableFuture.isCancelled, CompletableFuture.isDone) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void processMessageWhenVPeerVersionMessageIsNullThrowsProtocolException() throws Exception {
        /* Branches:
         * (for-each(preMessageReceivedEventListeners)) : false
         * (m == null) : false
         * (currentFilteredBlock != null) : false
         * (!(m instanceof VersionMessage || m instanceof VersionAck || m instanceof SendAddrV2Message || (versionHandshakeFuture.isDone() && !versionHandshakeFuture.isCancelled()))) : true
         * (m instanceof VersionMessage) : false
         * (m instanceof VersionAck) : false
         * (versionHandshakeFuture.isDone()) : true
         * (!versionHandshakeFuture.isCancelled()) : true
         * (m instanceof Ping) : false
         * (m instanceof Pong) : false
         * (m instanceof NotFoundMessage) : false
         * (m instanceof InventoryMessage) : false
         * (m instanceof Block) : false
         * (m instanceof FilteredBlock) : false
         * (m instanceof Transaction) : false
         * (m instanceof GetDataMessage) : false
         * (m instanceof AddressMessage) : false
         * (m instanceof HeadersMessage) : false
         * (m instanceof VersionMessage) : false
         * (m instanceof VersionAck) : true
         * (vPeerVersionMessage == null) : true  #  inside processVersionAck method
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        VersionAck versionAckMock = mock(VersionAck.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(ProtocolException.class);
            //Act Statement(s)
            target.processMessage(versionAckMock);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
        }
    }

    //Sapient generated method id: ${7a3efe82-0049-3c6c-bee9-6b2c2ffc184f}
    @Ignore(value = "Potential harmful system call (CompletableFuture.isCancelled, CompletableFuture.isDone) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void processMessageWhenMInstanceOfRejectMessage() throws Exception {
        /* Branches:
         * (for-each(preMessageReceivedEventListeners)) : false
         * (m == null) : false
         * (currentFilteredBlock != null) : false
         * (!(m instanceof VersionMessage || m instanceof VersionAck || m instanceof SendAddrV2Message || (versionHandshakeFuture.isDone() && !versionHandshakeFuture.isCancelled()))) : true
         * (m instanceof VersionMessage) : false
         * (m instanceof VersionAck) : false
         * (versionHandshakeFuture.isDone()) : true
         * (!versionHandshakeFuture.isCancelled()) : true
         * (m instanceof Ping) : false
         * (m instanceof Pong) : false
         * (m instanceof NotFoundMessage) : false
         * (m instanceof InventoryMessage) : false
         * (m instanceof Block) : false
         * (m instanceof FilteredBlock) : false
         * (m instanceof Transaction) : false
         * (m instanceof GetDataMessage) : false
         * (m instanceof AddressMessage) : false
         * (m instanceof HeadersMessage) : false
         * (m instanceof VersionMessage) : false
         * (m instanceof VersionAck) : false
         * (m instanceof RejectMessage) : true
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        RejectMessage rejectMessageMock = mock(RejectMessage.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.processMessage(rejectMessageMock);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
        }
    }

    //Sapient generated method id: ${ece6878e-afc0-3ce8-abef-70e1206fb9ae}
    @Ignore()
    @Test()
    public void processMessageWhenParamsNotAllowEmptyPeerChain() throws Exception {
        /* Branches:
         * (for-each(preMessageReceivedEventListeners)) : false
         * (m == null) : false
         * (currentFilteredBlock != null) : false
         * (!(m instanceof VersionMessage || m instanceof VersionAck || m instanceof SendAddrV2Message || (versionHandshakeFuture.isDone() && !versionHandshakeFuture.isCancelled()))) : true
         * (m instanceof VersionMessage) : false
         * (m instanceof VersionAck) : false
         * (versionHandshakeFuture.isDone()) : true
         * (!versionHandshakeFuture.isCancelled()) : true
         * (m instanceof Ping) : false
         * (m instanceof Pong) : false
         * (m instanceof NotFoundMessage) : false
         * (m instanceof InventoryMessage) : false
         * (m instanceof Block) : false
         * (m instanceof FilteredBlock) : false
         * (m instanceof Transaction) : false
         * (m instanceof GetDataMessage) : false
         * (m instanceof AddressMessage) : false
         * (m instanceof HeadersMessage) : false
         * (m instanceof VersionMessage) : true
         * (vPeerVersionMessage != null) : false  #  inside processVersionMessage method
         * (!services.anyOf(Services.NODE_NETWORK | Services.NODE_NETWORK_LIMITED)) : false  #  inside processVersionMessage method
         * (!params.allowEmptyPeerChain()) : true  #  inside processVersionMessage method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        VersionMessage peerVersionMessageMock = mock(VersionMessage.class);
        Services servicesMock = mock(Services.class);
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            doReturn(servicesMock).when(peerVersionMessageMock).services();
            doReturn(true).when(servicesMock).anyOf(1025L);
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            ReentrantLock reentrantLock = Threading.lock(PeerSocketHandler.class);
            threading.when(() -> Threading.lock(PeerSocketHandler.class)).thenReturn(reentrantLock);
            ReentrantLock reentrantLock2 = Threading.lock(Peer.class);
            threading.when(() -> Threading.lock(Peer.class)).thenReturn(reentrantLock2);
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = spy(new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(false).when(paramsMock).allowEmptyPeerChain();
            doNothing().when(target).close();
            //Act Statement(s)
            target.processMessage(peerVersionMessageMock);
            //Assert statement(s)
            verify(peerVersionMessageMock).services();
            verify(servicesMock).anyOf(1025L);
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            threading.verify(() -> Threading.lock(PeerSocketHandler.class), atLeast(1));
            threading.verify(() -> Threading.lock(Peer.class), atLeast(1));
            context.verify(() -> Context.get(), atLeast(1));
            verify(paramsMock).allowEmptyPeerChain();
            verify(target).close();
        }
    }

    //Sapient generated method id: ${f923da74-3dd1-3893-b8ba-3da25272e325}
    @Ignore(value = "Potential harmful system call (CompletableFuture.isCancelled, CompletableFuture.isDone) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void processMessageWhenMInstanceOfSendHeadersMessage() throws Exception {
        /* Branches:
         * (for-each(preMessageReceivedEventListeners)) : false
         * (m == null) : false
         * (currentFilteredBlock != null) : false
         * (!(m instanceof VersionMessage || m instanceof VersionAck || m instanceof SendAddrV2Message || (versionHandshakeFuture.isDone() && !versionHandshakeFuture.isCancelled()))) : true
         * (m instanceof VersionMessage) : false
         * (m instanceof VersionAck) : false
         * (versionHandshakeFuture.isDone()) : true
         * (!versionHandshakeFuture.isCancelled()) : true
         * (m instanceof Ping) : false
         * (m instanceof Pong) : false
         * (m instanceof NotFoundMessage) : false
         * (m instanceof InventoryMessage) : false
         * (m instanceof Block) : false
         * (m instanceof FilteredBlock) : false
         * (m instanceof Transaction) : false
         * (m instanceof GetDataMessage) : false
         * (m instanceof AddressMessage) : false
         * (m instanceof HeadersMessage) : false
         * (m instanceof VersionMessage) : false
         * (m instanceof VersionAck) : false
         * (m instanceof RejectMessage) : false
         * (m instanceof SendHeadersMessage) : true
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        SendHeadersMessage sendHeadersMessageMock = mock(SendHeadersMessage.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.processMessage(sendHeadersMessageMock);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
        }
    }

    //Sapient generated method id: ${5b3aea89-2bee-3358-bb5d-604b04151159}
    @Ignore()
    @Test()
    public void processMessageWhenServicesNotHasRequiredServices() throws Exception {
        /* Branches:
         * (for-each(preMessageReceivedEventListeners)) : false
         * (m == null) : false
         * (currentFilteredBlock != null) : false
         * (!(m instanceof VersionMessage || m instanceof VersionAck || m instanceof SendAddrV2Message || (versionHandshakeFuture.isDone() && !versionHandshakeFuture.isCancelled()))) : true
         * (m instanceof VersionMessage) : false
         * (m instanceof VersionAck) : false
         * (versionHandshakeFuture.isDone()) : true
         * (!versionHandshakeFuture.isCancelled()) : true
         * (m instanceof Ping) : false
         * (m instanceof Pong) : false
         * (m instanceof NotFoundMessage) : false
         * (m instanceof InventoryMessage) : false
         * (m instanceof Block) : false
         * (m instanceof FilteredBlock) : false
         * (m instanceof Transaction) : false
         * (m instanceof GetDataMessage) : false
         * (m instanceof AddressMessage) : false
         * (m instanceof HeadersMessage) : false
         * (m instanceof VersionMessage) : true
         * (vPeerVersionMessage != null) : false  #  inside processVersionMessage method
         * (!services.anyOf(Services.NODE_NETWORK | Services.NODE_NETWORK_LIMITED)) : false  #  inside processVersionMessage method
         * (!params.allowEmptyPeerChain()) : false  #  inside processVersionMessage method
         * (!services.has(requiredServices)) : true  #  inside processVersionMessage method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        VersionMessage peerVersionMessageMock = mock(VersionMessage.class);
        Services servicesMock = mock(Services.class);
        Services servicesMock2 = mock(Services.class);
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        Services servicesMock3 = mock(Services.class, "processVersionMessage_services3");
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<Services> services = mockStatic(Services.class);
             MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            doReturn(servicesMock).when(peerVersionMessageMock).services();
            doReturn(true).when(servicesMock).anyOf(1025L);
            doReturn(false).when(servicesMock).has(0L);
            peerVersionMessageMock.localServices = servicesMock2;
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            ReentrantLock reentrantLock = Threading.lock(PeerSocketHandler.class);
            threading.when(() -> Threading.lock(PeerSocketHandler.class)).thenReturn(reentrantLock);
            ReentrantLock reentrantLock2 = Threading.lock(Peer.class);
            threading.when(() -> Threading.lock(Peer.class)).thenReturn(reentrantLock2);
            context.when(() -> Context.get()).thenReturn(contextMock);
            services.when(() -> Services.of(0L)).thenReturn(servicesMock3);
            target = spy(new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(true).when(paramsMock).allowEmptyPeerChain();
            doReturn(0L).when(servicesMock2).bits();
            doNothing().when(target).close();
            //Act Statement(s)
            target.processMessage(peerVersionMessageMock);
            //Assert statement(s)
            verify(peerVersionMessageMock).services();
            verify(servicesMock).anyOf(1025L);
            verify(servicesMock).has(0L);
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            threading.verify(() -> Threading.lock(PeerSocketHandler.class), atLeast(1));
            threading.verify(() -> Threading.lock(Peer.class), atLeast(1));
            context.verify(() -> Context.get(), atLeast(1));
            services.verify(() -> Services.of(0L), atLeast(1));
            verify(paramsMock).allowEmptyPeerChain();
            verify(servicesMock2).bits();
            verify(target).close();
        }
    }

    //Sapient generated method id: ${fa7012ae-8e98-3004-b023-67cfc7dadebf}
    @Ignore(value = "Potential harmful system call (CompletableFuture.isCancelled, CompletableFuture.isDone) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void processMessageWhenMInstanceOfFeeFilterMessage() throws Exception {
        /* Branches:
         * (for-each(preMessageReceivedEventListeners)) : false
         * (m == null) : false
         * (currentFilteredBlock != null) : false
         * (!(m instanceof VersionMessage || m instanceof VersionAck || m instanceof SendAddrV2Message || (versionHandshakeFuture.isDone() && !versionHandshakeFuture.isCancelled()))) : true
         * (m instanceof VersionMessage) : false
         * (m instanceof VersionAck) : false
         * (versionHandshakeFuture.isDone()) : true
         * (!versionHandshakeFuture.isCancelled()) : true
         * (m instanceof Ping) : false
         * (m instanceof Pong) : false
         * (m instanceof NotFoundMessage) : false
         * (m instanceof InventoryMessage) : false
         * (m instanceof Block) : false
         * (m instanceof FilteredBlock) : false
         * (m instanceof Transaction) : false
         * (m instanceof GetDataMessage) : false
         * (m instanceof AddressMessage) : false
         * (m instanceof HeadersMessage) : false
         * (m instanceof VersionMessage) : false
         * (m instanceof VersionAck) : false
         * (m instanceof RejectMessage) : false
         * (m instanceof SendHeadersMessage) : false
         * (m instanceof FeeFilterMessage) : true
         */
        //Arrange Statement(s)
        FeeFilterMessage mMock = mock(FeeFilterMessage.class);
        Coin coinMock = mock(Coin.class);
        Coin coinMock2 = mock(Coin.class);
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn("return_of_toFriendlyString1").when(coinMock).toFriendlyString();
            doReturn(coinMock, coinMock2).when(mMock).feeRate();
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.processMessage(mMock);
            //Assert statement(s)
            verify(mMock, times(2)).feeRate();
            verify(coinMock).toFriendlyString();
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
        }
    }

    //Sapient generated method id: ${3b44e5c1-4f31-3cc7-9f6c-c295dcce1b1c}
    @Ignore(value = "Potential harmful system call (CompletableFuture.isCancelled, CompletableFuture.isDone) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void processMessageWhenMNotInstanceOfSendHeadersMessageAndMNotInstanceOfFeeFilterMessage() throws Exception {
        /* Branches:
         * (for-each(preMessageReceivedEventListeners)) : false
         * (m == null) : false
         * (currentFilteredBlock != null) : false
         * (!(m instanceof VersionMessage || m instanceof VersionAck || m instanceof SendAddrV2Message || (versionHandshakeFuture.isDone() && !versionHandshakeFuture.isCancelled()))) : true
         * (m instanceof VersionMessage) : false
         * (m instanceof VersionAck) : false
         * (versionHandshakeFuture.isDone()) : true
         * (!versionHandshakeFuture.isCancelled()) : true
         * (m instanceof Ping) : false
         * (m instanceof Pong) : false
         * (m instanceof NotFoundMessage) : false
         * (m instanceof InventoryMessage) : false
         * (m instanceof Block) : false
         * (m instanceof FilteredBlock) : false
         * (m instanceof Transaction) : false
         * (m instanceof GetDataMessage) : false
         * (m instanceof AddressMessage) : false
         * (m instanceof HeadersMessage) : false
         * (m instanceof VersionMessage) : false
         * (m instanceof VersionAck) : false
         * (m instanceof RejectMessage) : false
         * (m instanceof SendHeadersMessage) : false
         * (m instanceof FeeFilterMessage) : false
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        Message messageMock = mock(Message.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.processMessage(messageMock);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
        }
    }

    //Sapient generated method id: ${cd9615b4-d7ff-30bc-89a6-21f7ac1d1f80}
    @Ignore()
    @Test()
    public void processMessageWhenServicesHasServicesNODE_BITCOIN_CASH() throws Exception {
        /* Branches:
         * (for-each(preMessageReceivedEventListeners)) : false
         * (m == null) : false
         * (currentFilteredBlock != null) : false
         * (!(m instanceof VersionMessage || m instanceof VersionAck || m instanceof SendAddrV2Message || (versionHandshakeFuture.isDone() && !versionHandshakeFuture.isCancelled()))) : true
         * (m instanceof VersionMessage) : false
         * (m instanceof VersionAck) : false
         * (versionHandshakeFuture.isDone()) : true
         * (!versionHandshakeFuture.isCancelled()) : true
         * (m instanceof Ping) : false
         * (m instanceof Pong) : false
         * (m instanceof NotFoundMessage) : false
         * (m instanceof InventoryMessage) : false
         * (m instanceof Block) : false
         * (m instanceof FilteredBlock) : false
         * (m instanceof Transaction) : false
         * (m instanceof GetDataMessage) : false
         * (m instanceof AddressMessage) : false
         * (m instanceof HeadersMessage) : false
         * (m instanceof VersionMessage) : true
         * (vPeerVersionMessage != null) : false  #  inside processVersionMessage method
         * (!services.anyOf(Services.NODE_NETWORK | Services.NODE_NETWORK_LIMITED)) : false  #  inside processVersionMessage method
         * (!params.allowEmptyPeerChain()) : false  #  inside processVersionMessage method
         * (!services.has(requiredServices)) : false  #  inside processVersionMessage method
         * (services.has(Services.NODE_BITCOIN_CASH)) : true  #  inside processVersionMessage method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        VersionMessage peerVersionMessageMock = mock(VersionMessage.class);
        Services servicesMock = mock(Services.class);
        Services servicesMock2 = mock(Services.class);
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        Services servicesMock3 = mock(Services.class, "processVersionMessage_services3");
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<Services> services = mockStatic(Services.class);
             MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            doReturn(servicesMock).when(peerVersionMessageMock).services();
            doReturn(true).when(servicesMock).anyOf(1025L);
            doReturn(false).when(servicesMock).has(0L);
            peerVersionMessageMock.localServices = servicesMock2;
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            ReentrantLock reentrantLock = Threading.lock(PeerSocketHandler.class);
            threading.when(() -> Threading.lock(PeerSocketHandler.class)).thenReturn(reentrantLock);
            ReentrantLock reentrantLock2 = Threading.lock(Peer.class);
            threading.when(() -> Threading.lock(Peer.class)).thenReturn(reentrantLock2);
            context.when(() -> Context.get()).thenReturn(contextMock);
            services.when(() -> Services.of(0L)).thenReturn(servicesMock3);
            target = spy(new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(true).when(paramsMock).allowEmptyPeerChain();
            doReturn(0L).when(servicesMock2).bits();
            doNothing().when(target).close();
            //Act Statement(s)
            target.processMessage(peerVersionMessageMock);
            //Assert statement(s)
            verify(peerVersionMessageMock).services();
            verify(servicesMock).anyOf(1025L);
            verify(servicesMock).has(0L);
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            threading.verify(() -> Threading.lock(PeerSocketHandler.class), atLeast(1));
            threading.verify(() -> Threading.lock(Peer.class), atLeast(1));
            context.verify(() -> Context.get(), atLeast(1));
            services.verify(() -> Services.of(0L), atLeast(1));
            verify(paramsMock).allowEmptyPeerChain();
            verify(servicesMock2).bits();
            verify(target).close();
        }
    }

    //Sapient generated method id: ${8ad35063-b1b2-3417-bead-2683c1e71970}
    @Ignore()
    @Test()
    public void processMessageWhenPeerVersionMessageBestHeightLessThan0ThrowsProtocolException() throws Exception {
        /* Branches:
         * (for-each(preMessageReceivedEventListeners)) : false
         * (m == null) : false
         * (currentFilteredBlock != null) : false
         * (!(m instanceof VersionMessage || m instanceof VersionAck || m instanceof SendAddrV2Message || (versionHandshakeFuture.isDone() && !versionHandshakeFuture.isCancelled()))) : true
         * (m instanceof VersionMessage) : false
         * (m instanceof VersionAck) : false
         * (versionHandshakeFuture.isDone()) : true
         * (!versionHandshakeFuture.isCancelled()) : true
         * (m instanceof Ping) : false
         * (m instanceof Pong) : false
         * (m instanceof NotFoundMessage) : false
         * (m instanceof InventoryMessage) : false
         * (m instanceof Block) : false
         * (m instanceof FilteredBlock) : false
         * (m instanceof Transaction) : false
         * (m instanceof GetDataMessage) : false
         * (m instanceof AddressMessage) : false
         * (m instanceof HeadersMessage) : false
         * (m instanceof VersionMessage) : true
         * (vPeerVersionMessage != null) : false  #  inside processVersionMessage method
         * (!services.anyOf(Services.NODE_NETWORK | Services.NODE_NETWORK_LIMITED)) : false  #  inside processVersionMessage method
         * (!params.allowEmptyPeerChain()) : false  #  inside processVersionMessage method
         * (!services.has(requiredServices)) : false  #  inside processVersionMessage method
         * (services.has(Services.NODE_BITCOIN_CASH)) : false  #  inside processVersionMessage method
         * (peerVersionMessage.bestHeight < 0) : true  #  inside processVersionMessage method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        VersionMessage peerVersionMessageMock = mock(VersionMessage.class);
        Services servicesMock = mock(Services.class);
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            doReturn(servicesMock).when(peerVersionMessageMock).services();
            doReturn(false).when(servicesMock).anyOf(1025L);
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            ReentrantLock reentrantLock = Threading.lock(PeerSocketHandler.class);
            threading.when(() -> Threading.lock(PeerSocketHandler.class)).thenReturn(reentrantLock);
            ReentrantLock reentrantLock2 = Threading.lock(Peer.class);
            threading.when(() -> Threading.lock(Peer.class)).thenReturn(reentrantLock2);
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = spy(new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).close();
            //Act Statement(s)
            target.processMessage(peerVersionMessageMock);
            //Assert statement(s)
            verify(peerVersionMessageMock).services();
            verify(servicesMock).anyOf(1025L);
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            threading.verify(() -> Threading.lock(PeerSocketHandler.class), atLeast(1));
            threading.verify(() -> Threading.lock(Peer.class), atLeast(1));
            context.verify(() -> Context.get(), atLeast(1));
            verify(target).close();
        }
    }

    //Sapient generated method id: ${7f102a0b-567e-3678-a40e-b0b5121edb2b}
    @Ignore()
    @Test()
    public void processMessageWhenLogIsDebugEnabled() throws Exception {
        /* Branches:
         * (for-each(preMessageReceivedEventListeners)) : false
         * (m == null) : false
         * (currentFilteredBlock != null) : false
         * (!(m instanceof VersionMessage || m instanceof VersionAck || m instanceof SendAddrV2Message || (versionHandshakeFuture.isDone() && !versionHandshakeFuture.isCancelled()))) : true
         * (m instanceof VersionMessage) : false
         * (m instanceof VersionAck) : false
         * (versionHandshakeFuture.isDone()) : true
         * (!versionHandshakeFuture.isCancelled()) : true
         * (m instanceof Ping) : false
         * (m instanceof Pong) : false
         * (m instanceof NotFoundMessage) : false
         * (m instanceof InventoryMessage) : false
         * (m instanceof Block) : false
         * (m instanceof FilteredBlock) : false
         * (m instanceof Transaction) : false
         * (m instanceof GetDataMessage) : false
         * (m instanceof AddressMessage) : false
         * (m instanceof HeadersMessage) : false
         * (m instanceof VersionMessage) : true
         * (vPeerVersionMessage != null) : false  #  inside processVersionMessage method
         * (!services.anyOf(Services.NODE_NETWORK | Services.NODE_NETWORK_LIMITED)) : false  #  inside processVersionMessage method
         * (!params.allowEmptyPeerChain()) : false  #  inside processVersionMessage method
         * (!services.has(requiredServices)) : false  #  inside processVersionMessage method
         * (services.has(Services.NODE_BITCOIN_CASH)) : false  #  inside processVersionMessage method
         * (peerVersionMessage.bestHeight < 0) : false  #  inside processVersionMessage method
         * (log.isDebugEnabled()) : true  #  inside processVersionMessage method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        VersionMessage peerVersionMessageMock = mock(VersionMessage.class);
        Services servicesMock = mock(Services.class);
        Services servicesMock2 = mock(Services.class);
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        Services servicesMock3 = mock(Services.class, "processVersionMessage_services3");
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<Services> services = mockStatic(Services.class);
             MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            doReturn(servicesMock).when(peerVersionMessageMock).services();
            doReturn(true).when(servicesMock).anyOf(1025L);
            doReturn(false).when(servicesMock).has(0L);
            peerVersionMessageMock.localServices = servicesMock2;
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            ReentrantLock reentrantLock = Threading.lock(PeerSocketHandler.class);
            threading.when(() -> Threading.lock(PeerSocketHandler.class)).thenReturn(reentrantLock);
            ReentrantLock reentrantLock2 = Threading.lock(Peer.class);
            threading.when(() -> Threading.lock(Peer.class)).thenReturn(reentrantLock2);
            context.when(() -> Context.get()).thenReturn(contextMock);
            services.when(() -> Services.of(0L)).thenReturn(servicesMock3);
            target = spy(new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(true).when(paramsMock).allowEmptyPeerChain();
            doReturn(0L).when(servicesMock2).bits();
            doNothing().when(target).close();
            //Act Statement(s)
            target.processMessage(peerVersionMessageMock);
            //Assert statement(s)
            verify(peerVersionMessageMock).services();
            verify(servicesMock).anyOf(1025L);
            verify(servicesMock).has(0L);
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            threading.verify(() -> Threading.lock(PeerSocketHandler.class), atLeast(1));
            threading.verify(() -> Threading.lock(Peer.class), atLeast(1));
            context.verify(() -> Context.get(), atLeast(1));
            services.verify(() -> Services.of(0L), atLeast(1));
            verify(paramsMock).allowEmptyPeerChain();
            verify(servicesMock2).bits();
            verify(target).close();
        }
    }

    //Sapient generated method id: ${fe357471-6f8f-37f7-9d70-27700f6ea893}
    @Test()
    public void startFilteredBlockTest() {
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        FilteredBlock filteredBlockMock = mock(FilteredBlock.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.startFilteredBlock(filteredBlockMock);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
        }
    }

    //Sapient generated method id: ${ee0235a4-4479-3ae1-ba22-5332d44fb457}
    @Test()
    public void processNotFoundMessageWhenGetDataFuturesIsEmpty() {
        /* Branches:
         * (for-each(getDataFutures)) : false
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        NotFoundMessage notFoundMessageMock = mock(NotFoundMessage.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.processNotFoundMessage(notFoundMessageMock);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
        }
    }

    //Sapient generated method id: ${467c7d49-c2b5-3a36-a37e-91aad7e4ea98}
    @Test()
    public void processHeadersWhenBlockChainIsNull() throws ProtocolException, PrunedException, BlockStoreException, IOException {
        /* Branches:
         * (blockChain == null) : true
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        HeadersMessage headersMessageMock = mock(HeadersMessage.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, (AbstractBlockChain) null, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.processHeaders(headersMessageMock);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
        }
    }

    //Sapient generated method id: ${7ae6aec2-edb5-3ad2-abc8-81494eccbf35}
    @Test()
    public void processHeadersWhenDownloadBlockBodiesThrowsIllegalStateException() throws ProtocolException {
        /* Branches:
         * (blockChain == null) : false
         * (!downloadBlockBodies) : false
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        HeadersMessage headersMessageMock = mock(HeadersMessage.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenThrow(illegalStateException);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.processHeaders(headersMessageMock);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${d123eed9-d8fb-3086-a4fd-cfa4fc21aed5}
    @Test()
    public void processGetDataWhenItemsIsEmpty() throws IOException {
        /* Branches:
         * (for-each(getDataEventListeners)) : false
         * (items.isEmpty()) : true
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        GetDataMessage getDataMessageMock = mock(GetDataMessage.class, "processGetData_getDataMessage1");
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.processGetData(getDataMessageMock);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
        }
    }

    //Sapient generated method id: ${2bb0c661-78b6-3341-8fe6-f0a77f75ccdd}
    @Ignore()
    @Test()
    public void processTransactionWhenOnTransactionEventListenersIsEmpty() throws Exception {
        /* Branches:
         * (log.isDebugEnabled()) : true
         * (for-each(getDataFutures)) : false  #  inside maybeHandleRequestedData method
         * (maybeHandleRequestedData(tx, tx.getTxId())) : false
         * (currentFilteredBlock != null) : false
         * (for-each(wallets)) : false
         * (for-each(onTransactionEventListeners)) : false
         */
        //Arrange Statement(s)
        Transaction txMock = mock(Transaction.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        TransactionConfidence transactionConfidenceMock = mock(TransactionConfidence.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        Network networkMock = mock(Network.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<Transaction> transaction = mockStatic(Transaction.class);
             MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(transactionConfidenceMock).when(txMock).getConfidence();
            doNothing().when(transactionConfidenceMock).maybeSetSourceToNetwork();
            doReturn(sha256HashMock, sha256HashMock2).when(txMock).getTxId();
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            transaction.when(() -> Transaction.verify(networkMock, txMock)).thenAnswer((Answer<Void>) invocation -> null);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(networkMock).when(paramsMock).network();
            //Act Statement(s)
            target.processTransaction(txMock);
            //Assert statement(s)
            verify(txMock, times(2)).getTxId();
            verify(txMock).getConfidence();
            verify(transactionConfidenceMock).maybeSetSourceToNetwork();
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            transaction.verify(() -> Transaction.verify(networkMock, txMock), atLeast(1));
            verify(paramsMock).network();
        }
    }

    //Sapient generated method id: ${fe0aa846-ab6b-3e08-8aa2-3f33ae7da6fd}
    @Ignore()
    @Test()
    public void processTransactionWhenCaughtVerificationExceptionAndOnTransactionEventListenersIsEmpty() throws Exception {
        /* Branches:
         * (log.isDebugEnabled()) : true
         * (for-each(getDataFutures)) : false  #  inside maybeHandleRequestedData method
         * (maybeHandleRequestedData(tx, tx.getTxId())) : false
         * (currentFilteredBlock != null) : false
         * (for-each(wallets)) : false
         * (catch-exception (VerificationException)) : true
         * (for-each(onTransactionEventListeners)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Transaction txMock = mock(Transaction.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        TransactionConfidence transactionConfidenceMock = mock(TransactionConfidence.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        Network networkMock = mock(Network.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<Transaction> transaction = mockStatic(Transaction.class);
             MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            doReturn(transactionConfidenceMock).when(txMock).getConfidence();
            doNothing().when(transactionConfidenceMock).maybeSetSourceToNetwork();
            doReturn(sha256HashMock, sha256HashMock2).when(txMock).getTxId();
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            ReentrantLock reentrantLock = Threading.lock(PeerSocketHandler.class);
            threading.when(() -> Threading.lock(PeerSocketHandler.class)).thenReturn(reentrantLock);
            ReentrantLock reentrantLock2 = Threading.lock(Peer.class);
            threading.when(() -> Threading.lock(Peer.class)).thenReturn(reentrantLock2);
            context.when(() -> Context.get()).thenReturn(contextMock);
            transaction.when(() -> Transaction.verify(networkMock, txMock)).thenAnswer((Answer<Void>) invocation -> null);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(networkMock).when(paramsMock).network();
            //Act Statement(s)
            target.processTransaction(txMock);
            //Assert statement(s)
            verify(txMock, times(2)).getTxId();
            verify(txMock).getConfidence();
            verify(transactionConfidenceMock).maybeSetSourceToNetwork();
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            threading.verify(() -> Threading.lock(PeerSocketHandler.class), atLeast(1));
            threading.verify(() -> Threading.lock(Peer.class), atLeast(1));
            context.verify(() -> Context.get(), atLeast(1));
            transaction.verify(() -> Transaction.verify(networkMock, txMock), atLeast(1));
            verify(paramsMock).network();
        }
    }

    //Sapient generated method id: ${96fa7fc5-e96f-3e3e-bb59-41cbedbb68c5}
    @Test()
    public void downloadDependenciesWhenTxConfidenceNotEqualsTransactionConfidenceConfidenceTypeBUILDING() throws Exception {
        /* Branches:
         * (txConfidence != TransactionConfidence.ConfidenceType.BUILDING) : true
         */
        //Arrange Statement(s)
        Transaction txMock = mock(Transaction.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        ListenableCompletableFuture<List<Transaction>> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<ListenableCompletableFuture> listenableCompletableFuture = mockStatic(ListenableCompletableFuture.class);
             MockedStatic<Context> context = mockStatic(Context.class)) {
            TransactionConfidence transactionConfidence = new TransactionConfidence(sha256HashMock);
            transactionConfidence.setConfidenceType(TransactionConfidence.ConfidenceType.PENDING);
            doReturn(transactionConfidence).when(txMock).getConfidence();
            doReturn(sha256HashMock2).when(txMock).getTxId();
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            CompletableFuture<List<Transaction>> completableFuture = new CompletableFuture<>();
            listenableCompletableFuture.when(() -> ListenableCompletableFuture.of(completableFuture)).thenReturn(listenableCompletableFutureMock);
            target = spy(new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(completableFuture).when(target).downloadDependenciesInternal(txMock, 0, 0);
            //Act Statement(s)
            ListenableCompletableFuture<List<Transaction>> result = target.downloadDependencies(txMock);
            //Assert statement(s)
            assertThat(result, equalTo(listenableCompletableFutureMock));
            verify(txMock).getConfidence();
            verify(txMock).getTxId();
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            listenableCompletableFuture.verify(() -> ListenableCompletableFuture.of(completableFuture), atLeast(1));
            verify(target).downloadDependenciesInternal(txMock, 0, 0);
        }
    }

    //Sapient generated method id: ${90deb3d7-6fef-32ba-aafd-bc0962cb2e02}
    @Test()
    public void downloadDependenciesWhenTxConfidenceEqualsTransactionConfidenceConfidenceTypeBUILDING() throws Exception {
        /* Branches:
         * (txConfidence != TransactionConfidence.ConfidenceType.BUILDING) : false
         */
        //Arrange Statement(s)
        Transaction txMock = mock(Transaction.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        ListenableCompletableFuture<List<Transaction>> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<ListenableCompletableFuture> listenableCompletableFuture = mockStatic(ListenableCompletableFuture.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<Context> context = mockStatic(Context.class)) {
            TransactionConfidence transactionConfidence = new TransactionConfidence(sha256HashMock);
            transactionConfidence.setConfidenceType(TransactionConfidence.ConfidenceType.BUILDING);
            doReturn(transactionConfidence).when(txMock).getConfidence();
            doReturn(sha256HashMock2).when(txMock).getTxId();
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            CompletableFuture<List<Transaction>> completableFuture = new CompletableFuture<>();
            listenableCompletableFuture.when(() -> ListenableCompletableFuture.of(completableFuture)).thenReturn(listenableCompletableFutureMock);
            target = spy(new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(completableFuture).when(target).downloadDependenciesInternal(txMock, 0, 0);
            //Act Statement(s)
            ListenableCompletableFuture<List<Transaction>> result = target.downloadDependencies(txMock);
            //Assert statement(s)
            assertThat(result, equalTo(listenableCompletableFutureMock));
            verify(txMock).getConfidence();
            verify(txMock).getTxId();
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            listenableCompletableFuture.verify(() -> ListenableCompletableFuture.of(completableFuture), atLeast(1));
            verify(target).downloadDependenciesInternal(txMock, 0, 0);
        }
    }

    //Sapient generated method id: ${c9689c91-bdf0-3a30-9d94-3ac5df6b36c9}
    @Ignore(value = "Potential harmful system call (CompletableFuture.whenComplete) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void downloadDependenciesInternalWhenVPeerVersionMessageServicesHasServicesNODE_WITNESS() throws Exception {
        /* Branches:
         * (txIdsToRequest.size() > 1) : false
         * (vPeerVersionMessage.services().has(Services.NODE_WITNESS)) : true  #  inside buildMultiTransactionDataMessage method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Transaction rootTxMock = mock(Transaction.class);
        TransactionInput transactionInputMock = mock(TransactionInput.class);
        TransactionOutPoint transactionOutPointMock = mock(TransactionOutPoint.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        Services servicesMock = mock(Services.class);
        ListenableCompletableFuture<Void> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        try (MockedStatic<FutureUtils> futureUtils = mockStatic(FutureUtils.class);
             MockedStatic<Context> context = mockStatic(Context.class)) {
            List<TransactionInput> transactionInputList = new ArrayList<>();
            transactionInputList.add(transactionInputMock);
            doReturn(transactionInputList).when(rootTxMock).getInputs();
            doReturn(transactionOutPointMock).when(transactionInputMock).getOutpoint();
            doReturn(sha256HashMock).when(transactionOutPointMock).hash();
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            CompletableFuture<List<?>> completableFuture = new CompletableFuture<>();
            futureUtils.when(() -> FutureUtils.successfulAsList(anyList())).thenReturn(completableFuture);
            target = spy(new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(servicesMock).when(vPeerVersionMessageMock).services();
            doReturn(true).when(servicesMock).has(8L);
            doReturn(listenableCompletableFutureMock).when(target).sendMessage((GetDataMessage) any());
            //Act Statement(s)
            CompletableFuture<List<Transaction>> result = target.downloadDependenciesInternal(rootTxMock, 0, 0);
            CompletableFuture<List<Transaction>> completableFuture2 = new CompletableFuture<>();
            //Assert statement(s)
            //TODO: Please implement equals method in CompletableFuture for verification to succeed or you need to adjust respective assertion statements
            assertThat(result, equalTo(completableFuture2));
            verify(rootTxMock).getInputs();
            verify(transactionInputMock).getOutpoint();
            verify(transactionOutPointMock).hash();
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            futureUtils.verify(() -> FutureUtils.successfulAsList(anyList()));
            verify(vPeerVersionMessageMock).services();
            verify(servicesMock).has(8L);
            verify(target).sendMessage((GetDataMessage) any());
        }
    }

    //Sapient generated method id: ${3732ba94-c80a-3f25-8c8f-9fc5c12f37f5}
    @Ignore(value = "Potential harmful system call (CompletableFuture.whenComplete) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void downloadDependenciesInternalWhenVPeerVersionMessageServicesNotHasServicesNODE_WITNESS() throws Exception {
        /* Branches:
         * (txIdsToRequest.size() > 1) : false
         * (vPeerVersionMessage.services().has(Services.NODE_WITNESS)) : false  #  inside buildMultiTransactionDataMessage method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Transaction rootTxMock = mock(Transaction.class);
        TransactionInput transactionInputMock = mock(TransactionInput.class);
        TransactionOutPoint transactionOutPointMock = mock(TransactionOutPoint.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        Services servicesMock = mock(Services.class);
        ListenableCompletableFuture<Void> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        try (MockedStatic<FutureUtils> futureUtils = mockStatic(FutureUtils.class);
             MockedStatic<Context> context = mockStatic(Context.class)) {
            List<TransactionInput> transactionInputList = new ArrayList<>();
            transactionInputList.add(transactionInputMock);
            doReturn(transactionInputList).when(rootTxMock).getInputs();
            doReturn(transactionOutPointMock).when(transactionInputMock).getOutpoint();
            doReturn(sha256HashMock).when(transactionOutPointMock).hash();
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            CompletableFuture<List<?>> completableFuture = new CompletableFuture<>();
            futureUtils.when(() -> FutureUtils.successfulAsList(anyList())).thenReturn(completableFuture);
            target = spy(new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(servicesMock).when(vPeerVersionMessageMock).services();
            doReturn(false).when(servicesMock).has(8L);
            doReturn(listenableCompletableFutureMock).when(target).sendMessage((GetDataMessage) any());
            //Act Statement(s)
            CompletableFuture<List<Transaction>> result = target.downloadDependenciesInternal(rootTxMock, 0, 0);
            CompletableFuture<List<Transaction>> completableFuture2 = new CompletableFuture<>();
            //Assert statement(s)
            //TODO: Please implement equals method in CompletableFuture for verification to succeed or you need to adjust respective assertion statements
            assertThat(result, equalTo(completableFuture2));
            verify(rootTxMock).getInputs();
            verify(transactionInputMock).getOutpoint();
            verify(transactionOutPointMock).hash();
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            futureUtils.verify(() -> FutureUtils.successfulAsList(anyList()));
            verify(vPeerVersionMessageMock).services();
            verify(servicesMock).has(8L);
            verify(target).sendMessage((GetDataMessage) any());
        }
    }

    //Sapient generated method id: ${52997afd-af05-3d11-a949-cea569236ab8}
    @Ignore(value = "Potential harmful system call (CompletableFuture.completeExceptionally, CompletableFuture.whenComplete) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void downloadDependenciesInternalWhenCaughtException() throws Exception {
        /* Branches:
         * (txIdsToRequest.size() > 1) : false
         * (vPeerVersionMessage.services().has(Services.NODE_WITNESS)) : true  #  inside buildMultiTransactionDataMessage method
         * (catch-exception (Exception)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Transaction rootTxMock = mock(Transaction.class);
        TransactionInput transactionInputMock = mock(TransactionInput.class);
        TransactionOutPoint transactionOutPointMock = mock(TransactionOutPoint.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        Services servicesMock = mock(Services.class);
        ListenableCompletableFuture<Void> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        try (MockedStatic<FutureUtils> futureUtils = mockStatic(FutureUtils.class);
             MockedStatic<Context> context = mockStatic(Context.class)) {
            List<TransactionInput> transactionInputList = new ArrayList<>();
            transactionInputList.add(transactionInputMock);
            doReturn(transactionInputList).when(rootTxMock).getInputs();
            doReturn(transactionOutPointMock).when(transactionInputMock).getOutpoint();
            doReturn(sha256HashMock).when(transactionOutPointMock).hash();
            doReturn(sha256HashMock2).when(rootTxMock).getTxId();
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            CompletableFuture<List<?>> completableFuture = new CompletableFuture<>();
            futureUtils.when(() -> FutureUtils.successfulAsList(anyList())).thenReturn(completableFuture);
            target = spy(new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(servicesMock).when(vPeerVersionMessageMock).services();
            doReturn(true).when(servicesMock).has(8L);
            doReturn(listenableCompletableFutureMock).when(target).sendMessage((GetDataMessage) any());
            //Act Statement(s)
            CompletableFuture<List<Transaction>> result = target.downloadDependenciesInternal(rootTxMock, 0, 0);
            CompletableFuture<List<Transaction>> completableFuture2 = new CompletableFuture<>();
            //Assert statement(s)
            //TODO: Please implement equals method in CompletableFuture for verification to succeed or you need to adjust respective assertion statements
            assertThat(result, equalTo(completableFuture2));
            verify(rootTxMock).getInputs();
            verify(transactionInputMock).getOutpoint();
            verify(transactionOutPointMock).hash();
            verify(rootTxMock).getTxId();
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            futureUtils.verify(() -> FutureUtils.successfulAsList(anyList()));
            verify(vPeerVersionMessageMock).services();
            verify(servicesMock).has(8L);
            verify(target).sendMessage((GetDataMessage) any());
        }
    }

    //Sapient generated method id: ${752c6d56-aa6a-3db0-b387-9bcc4dea2815}
    @Ignore()
    @Test()
    public void processBlockWhenLogIsDebugEnabled() throws PrunedException, BlockStoreException, IOException {
        /* Branches:
         * (log.isDebugEnabled()) : true
         * (m.getTransactions() != null) : true
         * (for-each(getDataFutures)) : false  #  inside maybeHandleRequestedData method
         * (maybeHandleRequestedData(m, m.getHash())) : false
         * (blockChain == null) : true
         * (log.isDebugEnabled()) : true
         */
        //Arrange Statement(s)
        Block mMock = mock(Block.class);
        Transaction transactionMock = mock(Transaction.class);
        TransactionConfidence transactionConfidenceMock = mock(TransactionConfidence.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn("return_of_getHashAsString1").when(mMock).getHashAsString();
            List<Transaction> transactionList = new ArrayList<>();
            List<Transaction> transactionList2 = new ArrayList<>();
            transactionList2.add(transactionMock);
            doReturn(transactionList, transactionList2).when(mMock).getTransactions();
            doReturn(transactionConfidenceMock).when(transactionMock).getConfidence();
            doNothing().when(transactionConfidenceMock).maybeSetSourceToNetwork();
            doReturn(sha256HashMock).when(mMock).getHash();
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, (AbstractBlockChain) null, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.processBlock(mMock);
            //Assert statement(s)
            verify(mMock).getHashAsString();
            verify(mMock, times(2)).getTransactions();
            verify(transactionMock).getConfidence();
            verify(transactionConfidenceMock).maybeSetSourceToNetwork();
            verify(mMock).getHash();
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
        }
    }

    //Sapient generated method id: ${2201ccf4-6b7b-3b39-962d-a1f705cc450c}
    @Ignore()
    @Test()
    public void processBlockWhenBlocksDownloadedEventListenersIsEmpty() throws VerificationException, PrunedException, BlockStoreException, IOException {
        /* Branches:
         * (log.isDebugEnabled()) : true
         * (m.getTransactions() != null) : true
         * (for-each(getDataFutures)) : false  #  inside maybeHandleRequestedData method
         * (maybeHandleRequestedData(m, m.getHash())) : false
         * (blockChain == null) : false
         * (!vDownloadData) : false
         * (blockChain.add(m)) : true
         * (for-each(blocksDownloadedEventListeners)) : false  #  inside invokeOnBlocksDownloaded method
         */
        //Arrange Statement(s)
        Block mMock = mock(Block.class);
        Transaction transactionMock = mock(Transaction.class);
        TransactionConfidence transactionConfidenceMock = mock(TransactionConfidence.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn("return_of_getHashAsString1").when(mMock).getHashAsString();
            List<Transaction> transactionList = new ArrayList<>();
            List<Transaction> transactionList2 = new ArrayList<>();
            transactionList2.add(transactionMock);
            doReturn(transactionList, transactionList2).when(mMock).getTransactions();
            doReturn(transactionConfidenceMock).when(transactionMock).getConfidence();
            doNothing().when(transactionConfidenceMock).maybeSetSourceToNetwork();
            doReturn(sha256HashMock, sha256HashMock2).when(mMock).getHash();
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            doReturn(0).when(blockChainMock).getBestChainHeight();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(true).when(blockChainMock).add(mMock);
            //Act Statement(s)
            target.processBlock(mMock);
            //Assert statement(s)
            verify(mMock).getHashAsString();
            verify(mMock, times(2)).getTransactions();
            verify(transactionMock).getConfidence();
            verify(transactionConfidenceMock).maybeSetSourceToNetwork();
            verify(mMock, times(2)).getHash();
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            verify(blockChainMock).getBestChainHeight();
            context.verify(() -> Context.get(), atLeast(1));
            verify(blockChainMock).add(mMock);
        }
    }

    //Sapient generated method id: ${22f8596e-064f-3f9f-b185-4cf4cb73bf04}
    @Ignore()
    @Test()
    public void processBlockWhenDownloadBlockBodiesThrowsIllegalStateException() throws VerificationException, PrunedException {
        /* Branches:
         * (log.isDebugEnabled()) : true
         * (m.getTransactions() != null) : true
         * (for-each(getDataFutures)) : false  #  inside maybeHandleRequestedData method
         * (maybeHandleRequestedData(m, m.getHash())) : false
         * (blockChain == null) : false
         * (!vDownloadData) : false
         * (blockChain.add(m)) : false
         * (downloadBlockBodies) : true
         */
        //Arrange Statement(s)
        Block mMock = mock(Block.class);
        Transaction transactionMock = mock(Transaction.class);
        TransactionConfidence transactionConfidenceMock = mock(TransactionConfidence.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock3 = mock(Sha256Hash.class);
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        Block blockMock2 = mock(Block.class);
        Sha256Hash sha256HashMock4 = mock(Sha256Hash.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn("return_of_getHashAsString1").when(mMock).getHashAsString();
            List<Transaction> transactionList = new ArrayList<>();
            List<Transaction> transactionList2 = new ArrayList<>();
            transactionList2.add(transactionMock);
            doReturn(transactionList, transactionList2).when(mMock).getTransactions();
            doReturn(transactionConfidenceMock).when(transactionMock).getConfidence();
            doNothing().when(transactionConfidenceMock).maybeSetSourceToNetwork();
            doReturn(sha256HashMock, sha256HashMock2, sha256HashMock3).when(mMock).getHash();
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(false)).thenThrow(illegalStateException);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(false).when(blockChainMock).add(mMock);
            doReturn(blockMock2).when(blockChainMock).getOrphanRoot(sha256HashMock3);
            doReturn(sha256HashMock4).when(blockMock2).getHash();
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.processBlock(mMock);
            //Assert statement(s)
            verify(mMock).getHashAsString();
            verify(mMock, times(2)).getTransactions();
            verify(transactionMock).getConfidence();
            verify(transactionConfidenceMock).maybeSetSourceToNetwork();
            verify(mMock, times(3)).getHash();
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            verify(blockChainMock).add(mMock);
            verify(blockChainMock).getOrphanRoot(sha256HashMock3);
            verify(blockMock2).getHash();
        }
    }

    //Sapient generated method id: ${70c560e7-6d15-360f-a761-fba9a9bbed04}
    @Ignore()
    @Test()
    public void processBlockWhenCaughtVerificationException() throws VerificationException, PrunedException, BlockStoreException, IOException {
        /* Branches:
         * (log.isDebugEnabled()) : true
         * (m.getTransactions() != null) : true
         * (for-each(getDataFutures)) : false  #  inside maybeHandleRequestedData method
         * (maybeHandleRequestedData(m, m.getHash())) : false
         * (blockChain == null) : false
         * (!vDownloadData) : false
         * (blockChain.add(m)) : true
         * (for-each(blocksDownloadedEventListeners)) : false  #  inside invokeOnBlocksDownloaded method
         * (catch-exception (VerificationException)) : true
         */
        //Arrange Statement(s)
        Block mMock = mock(Block.class);
        Transaction transactionMock = mock(Transaction.class);
        TransactionConfidence transactionConfidenceMock = mock(TransactionConfidence.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        VerificationException verificationExceptionMock = mock(VerificationException.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn("return_of_getHashAsString1").when(mMock).getHashAsString();
            List<Transaction> transactionList = new ArrayList<>();
            List<Transaction> transactionList2 = new ArrayList<>();
            transactionList2.add(transactionMock);
            doReturn(transactionList, transactionList2).when(mMock).getTransactions();
            doReturn(transactionConfidenceMock).when(transactionMock).getConfidence();
            doNothing().when(transactionConfidenceMock).maybeSetSourceToNetwork();
            doReturn(sha256HashMock, sha256HashMock2).when(mMock).getHash();
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doThrow(verificationExceptionMock).when(blockChainMock).add(mMock);
            //Act Statement(s)
            target.processBlock(mMock);
            //Assert statement(s)
            verify(mMock).getHashAsString();
            verify(mMock, times(2)).getTransactions();
            verify(transactionMock).getConfidence();
            verify(transactionConfidenceMock).maybeSetSourceToNetwork();
            verify(mMock, times(2)).getHash();
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            verify(blockChainMock).add(mMock);
        }
    }

    //Sapient generated method id: ${ec6c5e23-df31-342c-a708-7a0b861a9f12}
    @Test()
    public void processBlockWhenCaughtPrunedExceptionThrowsRuntimeException() throws VerificationException, PrunedException {
        /* Branches:
         * (log.isDebugEnabled()) : true
         * (m.getTransactions() != null) : true
         * (for-each(getDataFutures)) : false  #  inside maybeHandleRequestedData method
         * (maybeHandleRequestedData(m, m.getHash())) : false
         * (blockChain == null) : false
         * (!vDownloadData) : false
         * (blockChain.add(m)) : true
         * (for-each(blocksDownloadedEventListeners)) : false  #  inside invokeOnBlocksDownloaded method
         * (catch-exception (PrunedException)) : true
         */
        //Arrange Statement(s)
        Block mMock = mock(Block.class);
        Transaction transactionMock = mock(Transaction.class);
        TransactionConfidence transactionConfidenceMock = mock(TransactionConfidence.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        PrunedException prunedExceptionMock = mock(PrunedException.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn("return_of_getHashAsString1").when(mMock).getHashAsString();
            List<Transaction> transactionList = new ArrayList<>();
            List<Transaction> transactionList2 = new ArrayList<>();
            transactionList2.add(transactionMock);
            doReturn(transactionList, transactionList2).when(mMock).getTransactions();
            doReturn(transactionConfidenceMock).when(transactionMock).getConfidence();
            doNothing().when(transactionConfidenceMock).maybeSetSourceToNetwork();
            doReturn(sha256HashMock, sha256HashMock2).when(mMock).getHash();
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doThrow(prunedExceptionMock).when(blockChainMock).add(mMock);
            thrown.expect(RuntimeException.class);
            thrown.expectCause(isA(PrunedException.class));
            //Act Statement(s)
            target.processBlock(mMock);
            //Assert statement(s)
            verify(mMock).getHashAsString();
            verify(mMock, times(2)).getTransactions();
            verify(transactionMock).getConfidence();
            verify(transactionConfidenceMock).maybeSetSourceToNetwork();
            verify(mMock, times(2)).getHash();
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            verify(blockChainMock).add(mMock);
        }
    }

    //Sapient generated method id: ${162f37f4-03ef-3dcc-a702-87452013e911}
    @Ignore()
    @Test()
    public void endFilteredBlockWhenLogIsDebugEnabled() throws PrunedException, BlockStoreException, IOException {
        /* Branches:
         * (log.isDebugEnabled()) : true
         * (!vDownloadData) : false
         * (blockChain == null) : true
         * (log.isDebugEnabled()) : true
         */
        //Arrange Statement(s)
        FilteredBlock mMock = mock(FilteredBlock.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class, "endFilteredBlock_sha256Hash1");
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(sha256HashMock).when(mMock).getHash();
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, (AbstractBlockChain) null, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.endFilteredBlock(mMock);
            //Assert statement(s)
            verify(mMock).getHash();
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
        }
    }

    //Sapient generated method id: ${157042f7-d8ce-3ff6-a940-a9dec42eceda}
    @Ignore()
    @Test()
    public void endFilteredBlockWhenCaughtPrunedExceptionThrowsRuntimeException() {
        /* Branches:
         * (log.isDebugEnabled()) : true
         * (!vDownloadData) : false
         * (blockChain == null) : false
         * (awaitingFreshFilter != null) : false
         * (catch-exception (PrunedException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        FilteredBlock mMock = mock(FilteredBlock.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class, "endFilteredBlock_sha256Hash1");
        Block blockMock = mock(Block.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock2 = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            doReturn(sha256HashMock).when(mMock).getHash();
            doReturn(blockMock).when(mMock).getBlockHeader();
            doReturn(sha256HashMock2).when(blockMock).getHash();
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock2).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock2).time();
            ReentrantLock reentrantLock = Threading.lock(PeerSocketHandler.class);
            threading.when(() -> Threading.lock(PeerSocketHandler.class)).thenReturn(reentrantLock);
            ReentrantLock reentrantLock2 = Threading.lock(Peer.class);
            threading.when(() -> Threading.lock(Peer.class)).thenReturn(reentrantLock2);
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(RuntimeException.class);
            thrown.expectCause(isA(PrunedException.class));
            //Act Statement(s)
            target.endFilteredBlock(mMock);
            //Assert statement(s)
            verify(mMock).getHash();
            verify(mMock).getBlockHeader();
            verify(blockMock).getHash();
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock2).time();
            threading.verify(() -> Threading.lock(PeerSocketHandler.class), atLeast(1));
            threading.verify(() -> Threading.lock(Peer.class), atLeast(1));
            context.verify(() -> Context.get(), atLeast(1));
        }
    }

    //Sapient generated method id: ${0505e779-a72a-3b25-a34a-dd86550e28c9}
    @Ignore()
    @Test()
    public void endFilteredBlockWhenBlockChainNotAddMThrowsIllegalStateException() throws VerificationException, PrunedException {
        /* Branches:
         * (log.isDebugEnabled()) : true
         * (!vDownloadData) : false
         * (blockChain == null) : false
         * (awaitingFreshFilter != null) : false
         * (for-each(wallets)) : false  #  inside checkForFilterExhaustion method
         * (checkForFilterExhaustion(m)) : false
         * (blockChain.add(m)) : false
         */
        //Arrange Statement(s)
        FilteredBlock mMock = mock(FilteredBlock.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class, "endFilteredBlock_sha256Hash1");
        Block blockMock = mock(Block.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock3 = mock(Sha256Hash.class);
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock2 = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        Block blockMock3 = mock(Block.class);
        Sha256Hash sha256HashMock4 = mock(Sha256Hash.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(blockMock).when(mMock).getBlockHeader();
            doReturn(sha256HashMock2).when(blockMock).getHash();
            doReturn(sha256HashMock, sha256HashMock3).when(mMock).getHash();
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock2).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock2).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(false)).thenThrow(illegalStateException);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(false).when(blockChainMock).add(mMock);
            doReturn(blockMock3).when(blockChainMock).getOrphanRoot(sha256HashMock3);
            doReturn(sha256HashMock4).when(blockMock3).getHash();
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.endFilteredBlock(mMock);
            //Assert statement(s)
            verify(mMock, times(2)).getHash();
            verify(mMock).getBlockHeader();
            verify(blockMock).getHash();
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock2).time();
            context.verify(() -> Context.get(), atLeast(1));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            verify(blockChainMock).add(mMock);
            verify(blockChainMock).getOrphanRoot(sha256HashMock3);
            verify(blockMock3).getHash();
        }
    }

    //Sapient generated method id: ${c8268dc6-27bb-3ae1-85f6-21db48e9b473}
    @Ignore()
    @Test()
    public void endFilteredBlockWhenBlocksDownloadedEventListenersIsEmpty() throws VerificationException, PrunedException, BlockStoreException, IOException {
        /* Branches:
         * (log.isDebugEnabled()) : true
         * (!vDownloadData) : false
         * (blockChain == null) : false
         * (awaitingFreshFilter != null) : false
         * (for-each(wallets)) : false  #  inside checkForFilterExhaustion method
         * (checkForFilterExhaustion(m)) : false
         * (blockChain.add(m)) : true
         * (for-each(blocksDownloadedEventListeners)) : false  #  inside invokeOnBlocksDownloaded method
         */
        //Arrange Statement(s)
        FilteredBlock mMock = mock(FilteredBlock.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class, "endFilteredBlock_sha256Hash1");
        Block blockMock = mock(Block.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        Block blockMock2 = mock(Block.class);
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock3 = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(sha256HashMock).when(mMock).getHash();
            doReturn(sha256HashMock2).when(blockMock).getHash();
            doReturn(blockMock, blockMock2).when(mMock).getBlockHeader();
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock3).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock3).time();
            doReturn(0).when(blockChainMock).getBestChainHeight();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(true).when(blockChainMock).add(mMock);
            //Act Statement(s)
            target.endFilteredBlock(mMock);
            //Assert statement(s)
            verify(mMock).getHash();
            verify(mMock, times(2)).getBlockHeader();
            verify(blockMock).getHash();
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock3).time();
            verify(blockChainMock).getBestChainHeight();
            context.verify(() -> Context.get(), atLeast(1));
            verify(blockChainMock).add(mMock);
        }
    }

    //Sapient generated method id: ${6296d640-7ccb-366e-9b5a-4bdda9e6d78b}
    @Ignore()
    @Test()
    public void endFilteredBlockWhenBlocksDownloadedEventListenersIsEmptyAndCaughtVerificationException() throws VerificationException, PrunedException, BlockStoreException, IOException {
        /* Branches:
         * (log.isDebugEnabled()) : true
         * (!vDownloadData) : false
         * (blockChain == null) : false
         * (awaitingFreshFilter != null) : false
         * (for-each(wallets)) : false  #  inside checkForFilterExhaustion method
         * (checkForFilterExhaustion(m)) : false
         * (blockChain.add(m)) : true
         * (for-each(blocksDownloadedEventListeners)) : false  #  inside invokeOnBlocksDownloaded method
         * (catch-exception (VerificationException)) : true
         */
        //Arrange Statement(s)
        FilteredBlock mMock = mock(FilteredBlock.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class, "endFilteredBlock_sha256Hash1");
        Block blockMock = mock(Block.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock2 = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        VerificationException verificationExceptionMock = mock(VerificationException.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(sha256HashMock).when(mMock).getHash();
            doReturn(blockMock).when(mMock).getBlockHeader();
            doReturn(sha256HashMock2).when(blockMock).getHash();
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock2).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock2).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doThrow(verificationExceptionMock).when(blockChainMock).add(mMock);
            //Act Statement(s)
            target.endFilteredBlock(mMock);
            //Assert statement(s)
            verify(mMock).getHash();
            verify(mMock).getBlockHeader();
            verify(blockMock).getHash();
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock2).time();
            context.verify(() -> Context.get(), atLeast(1));
            verify(blockChainMock).add(mMock);
        }
    }

    //Sapient generated method id: ${5896ca6d-c10c-3cbb-8641-9d05c47a64c2}
    @Ignore()
    @Test()
    public void processInvWhenSwitchItemTypeCaseDefaultThrowsIllegalStateException() throws BlockStoreException, IOException {
        /* Branches:
         * (for-each(items)) : true
         * (switch(item.type) = default) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InventoryMessage invMock = mock(InventoryMessage.class);
        InventoryItem inventoryItemMock = mock(InventoryItem.class);
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        Services servicesMock = mock(Services.class);
        TxConfidenceTable txConfidenceTableMock = mock(TxConfidenceTable.class);
        TransactionConfidence transactionConfidenceMock = mock(TransactionConfidence.class);
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            List<InventoryItem> inventoryItemList = new ArrayList<>();
            inventoryItemList.add(inventoryItemMock);
            doReturn(inventoryItemList).when(invMock).getItems();
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            ReentrantLock reentrantLock = Threading.lock(PeerSocketHandler.class);
            threading.when(() -> Threading.lock(PeerSocketHandler.class)).thenReturn(reentrantLock);
            ReentrantLock reentrantLock2 = Threading.lock(Peer.class);
            threading.when(() -> Threading.lock(Peer.class)).thenReturn(reentrantLock2);
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(servicesMock).when(vPeerVersionMessageMock).services();
            doReturn(true).when(servicesMock).has(8L);
            doReturn(txConfidenceTableMock).when(contextMock).getConfidenceTable();
            doReturn(transactionConfidenceMock).when(txConfidenceTableMock).seen((Sha256Hash) null, peerAddressMock);
            doReturn(2).when(transactionConfidenceMock).numBroadcastPeers();
            //Act Statement(s)
            target.processInv(invMock);
            //Assert statement(s)
            verify(invMock).getItems();
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            threading.verify(() -> Threading.lock(PeerSocketHandler.class), atLeast(1));
            threading.verify(() -> Threading.lock(Peer.class), atLeast(1));
            context.verify(() -> Context.get(), atLeast(1));
            verify(vPeerVersionMessageMock).services();
            verify(servicesMock).has(8L);
            verify(contextMock).getConfidenceTable();
            verify(txConfidenceTableMock).seen((Sha256Hash) null, peerAddressMock);
            verify(transactionConfidenceMock).numBroadcastPeers();
        }
    }

    //Sapient generated method id: ${3e3d16b0-cc67-3410-aea5-4f524403adb9}
    @Ignore()
    @Test()
    public void processInvWhenBlocksSizeNotGreaterThan0AndGetDataItemsIsEmptyAndNotPingAfterGetData() throws BlockStoreException, IOException {
        /* Branches:
         * (for-each(items)) : true
         * (switch(item.type) = TRANSACTION) : true
         * (log.isDebugEnabled()) : true
         * (transactions.isEmpty()) : false
         * (vPeerVersionMessage.services().has(Services.NODE_WITNESS)) : true
         * (it.hasNext()) : true
         * (conf.numBroadcastPeers() > 1) : true
         * (blocks.size() > 0) : false
         * (!getDataItems.isEmpty()) : false
         * (pingAfterGetData) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InventoryMessage invMock = mock(InventoryMessage.class);
        InventoryItem inventoryItemMock = mock(InventoryItem.class);
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        Services servicesMock = mock(Services.class);
        TxConfidenceTable txConfidenceTableMock = mock(TxConfidenceTable.class);
        TransactionConfidence transactionConfidenceMock = mock(TransactionConfidence.class);
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            List<InventoryItem> inventoryItemList = new ArrayList<>();
            inventoryItemList.add(inventoryItemMock);
            doReturn(inventoryItemList).when(invMock).getItems();
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            ReentrantLock reentrantLock = Threading.lock(PeerSocketHandler.class);
            threading.when(() -> Threading.lock(PeerSocketHandler.class)).thenReturn(reentrantLock);
            ReentrantLock reentrantLock2 = Threading.lock(Peer.class);
            threading.when(() -> Threading.lock(Peer.class)).thenReturn(reentrantLock2);
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(servicesMock).when(vPeerVersionMessageMock).services();
            doReturn(true).when(servicesMock).has(8L);
            doReturn(txConfidenceTableMock).when(contextMock).getConfidenceTable();
            doReturn(transactionConfidenceMock).when(txConfidenceTableMock).seen((Sha256Hash) null, peerAddressMock);
            doReturn(2).when(transactionConfidenceMock).numBroadcastPeers();
            //Act Statement(s)
            target.processInv(invMock);
            //Assert statement(s)
            verify(invMock).getItems();
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            threading.verify(() -> Threading.lock(PeerSocketHandler.class), atLeast(1));
            threading.verify(() -> Threading.lock(Peer.class), atLeast(1));
            context.verify(() -> Context.get(), atLeast(1));
            verify(vPeerVersionMessageMock).services();
            verify(servicesMock).has(8L);
            verify(contextMock).getConfidenceTable();
            verify(txConfidenceTableMock).seen((Sha256Hash) null, peerAddressMock);
            verify(transactionConfidenceMock).numBroadcastPeers();
        }
    }

    //Sapient generated method id: ${fec0364a-3545-36ab-b68d-d0338e76a49b}
    @Ignore()
    @Test()
    public void processInvWhenConfGetSourceEqualsTransactionConfidenceSourceSELFAndBlocksSizeNotGreaterThan0AndGetDataItemsIsEmptyAndNo() throws BlockStoreException, IOException {
        /* Branches:
         * (for-each(items)) : true
         * (switch(item.type) = TRANSACTION) : true
         * (log.isDebugEnabled()) : true
         * (transactions.isEmpty()) : false
         * (vPeerVersionMessage.services().has(Services.NODE_WITNESS)) : true
         * (it.hasNext()) : true
         * (conf.numBroadcastPeers() > 1) : false
         * (conf.getSource().equals(TransactionConfidence.Source.SELF)) : true
         * (blocks.size() > 0) : false
         * (!getDataItems.isEmpty()) : false
         * (pingAfterGetData) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InventoryMessage invMock = mock(InventoryMessage.class);
        InventoryItem inventoryItemMock = mock(InventoryItem.class);
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        Services servicesMock = mock(Services.class);
        TxConfidenceTable txConfidenceTableMock = mock(TxConfidenceTable.class);
        TransactionConfidence transactionConfidenceMock = mock(TransactionConfidence.class);
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            List<InventoryItem> inventoryItemList = new ArrayList<>();
            inventoryItemList.add(inventoryItemMock);
            doReturn(inventoryItemList).when(invMock).getItems();
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            ReentrantLock reentrantLock = Threading.lock(PeerSocketHandler.class);
            threading.when(() -> Threading.lock(PeerSocketHandler.class)).thenReturn(reentrantLock);
            ReentrantLock reentrantLock2 = Threading.lock(Peer.class);
            threading.when(() -> Threading.lock(Peer.class)).thenReturn(reentrantLock2);
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(servicesMock).when(vPeerVersionMessageMock).services();
            doReturn(true).when(servicesMock).has(8L);
            doReturn(txConfidenceTableMock).when(contextMock).getConfidenceTable();
            doReturn(transactionConfidenceMock).when(txConfidenceTableMock).seen((Sha256Hash) null, peerAddressMock);
            doReturn(1).when(transactionConfidenceMock).numBroadcastPeers();
            doReturn(TransactionConfidence.Source.SELF).when(transactionConfidenceMock).getSource();
            //Act Statement(s)
            target.processInv(invMock);
            //Assert statement(s)
            verify(invMock).getItems();
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            threading.verify(() -> Threading.lock(PeerSocketHandler.class), atLeast(1));
            threading.verify(() -> Threading.lock(Peer.class), atLeast(1));
            context.verify(() -> Context.get(), atLeast(1));
            verify(vPeerVersionMessageMock).services();
            verify(servicesMock).has(8L);
            verify(contextMock).getConfidenceTable();
            verify(txConfidenceTableMock).seen((Sha256Hash) null, peerAddressMock);
            verify(transactionConfidenceMock).numBroadcastPeers();
            verify(transactionConfidenceMock).getSource();
        }
    }

    //Sapient generated method id: ${2148040e-f6a8-3756-b8dd-49d4a0357a31}
    @Ignore()
    @Test()
    public void processInvWhenPendingTxDownloadsSizeNotGreaterThanPENDING_TX_DOWNLOADS_LIMITAndBlocksSizeNotGreaterThan0AndGetDataItems() throws NotYetConnectedException, BlockStoreException, IOException {
        /* Branches:
         * (for-each(items)) : true
         * (switch(item.type) = TRANSACTION) : true
         * (log.isDebugEnabled()) : true
         * (transactions.isEmpty()) : false
         * (vPeerVersionMessage.services().has(Services.NODE_WITNESS)) : false
         * (it.hasNext()) : true
         * (conf.numBroadcastPeers() > 1) : false
         * (conf.getSource().equals(TransactionConfidence.Source.SELF)) : false
         * (log.isDebugEnabled()) : true
         * (pendingTxDownloads.size() > PENDING_TX_DOWNLOADS_LIMIT) : false
         * (blocks.size() > 0) : false
         * (!getDataItems.isEmpty()) : true
         * (pingAfterGetData) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InventoryMessage invMock = mock(InventoryMessage.class);
        InventoryItem inventoryItemMock = mock(InventoryItem.class);
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        Services servicesMock = mock(Services.class);
        TxConfidenceTable txConfidenceTableMock = mock(TxConfidenceTable.class);
        TransactionConfidence transactionConfidenceMock = mock(TransactionConfidence.class);
        ListenableCompletableFuture<Void> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            List<InventoryItem> inventoryItemList = new ArrayList<>();
            inventoryItemList.add(inventoryItemMock);
            doReturn(inventoryItemList).when(invMock).getItems();
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            ReentrantLock reentrantLock = Threading.lock(PeerSocketHandler.class);
            threading.when(() -> Threading.lock(PeerSocketHandler.class)).thenReturn(reentrantLock);
            ReentrantLock reentrantLock2 = Threading.lock(Peer.class);
            threading.when(() -> Threading.lock(Peer.class)).thenReturn(reentrantLock2);
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = spy(new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(servicesMock).when(vPeerVersionMessageMock).services();
            doReturn(false).when(servicesMock).has(8L);
            doReturn(txConfidenceTableMock).when(contextMock).getConfidenceTable();
            doReturn(transactionConfidenceMock).when(txConfidenceTableMock).seen((Sha256Hash) null, peerAddressMock);
            doReturn(1).when(transactionConfidenceMock).numBroadcastPeers();
            doReturn(TransactionConfidence.Source.UNKNOWN).when(transactionConfidenceMock).getSource();
            doReturn(listenableCompletableFutureMock).when(target).sendMessage((GetDataMessage) any());
            //Act Statement(s)
            target.processInv(invMock);
            //Assert statement(s)
            verify(invMock).getItems();
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            threading.verify(() -> Threading.lock(PeerSocketHandler.class), atLeast(1));
            threading.verify(() -> Threading.lock(Peer.class), atLeast(1));
            context.verify(() -> Context.get(), atLeast(1));
            verify(vPeerVersionMessageMock).services();
            verify(servicesMock).has(8L);
            verify(contextMock).getConfidenceTable();
            verify(txConfidenceTableMock).seen((Sha256Hash) null, peerAddressMock);
            verify(transactionConfidenceMock).numBroadcastPeers();
            verify(transactionConfidenceMock).getSource();
            verify(target).sendMessage((GetDataMessage) any());
        }
    }

    //Sapient generated method id: ${c54c455f-3ca4-305e-84fb-95d7b4e6030f}
    @Ignore()
    @Test()
    public void processInvWhenBlockChainIsNullAndGetDataItemsIsEmptyAndNotPingAfterGetData() throws BlockStoreException, IOException {
        /* Branches:
         * (for-each(items)) : true
         * (switch(item.type) = BLOCK) : true
         * (log.isDebugEnabled()) : true
         * (transactions.isEmpty()) : true
         * (blocks.size() == 1) : true
         * (downloadData) : true
         * (blockChain != null) : false
         * (vPeerVersionMessage.services().has(Services.NODE_WITNESS)) : true
         * (it.hasNext()) : false
         * (blocks.size() > 0) : true
         * (downloadData) : true
         * (blockChain != null) : false
         * (!getDataItems.isEmpty()) : false
         * (pingAfterGetData) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InventoryMessage invMock = mock(InventoryMessage.class);
        InventoryItem inventoryItemMock = mock(InventoryItem.class);
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        Services servicesMock = mock(Services.class);
        TxConfidenceTable txConfidenceTableMock = mock(TxConfidenceTable.class);
        TransactionConfidence transactionConfidenceMock = mock(TransactionConfidence.class);
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            List<InventoryItem> inventoryItemList = new ArrayList<>();
            inventoryItemList.add(inventoryItemMock);
            doReturn(inventoryItemList).when(invMock).getItems();
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            ReentrantLock reentrantLock = Threading.lock(PeerSocketHandler.class);
            threading.when(() -> Threading.lock(PeerSocketHandler.class)).thenReturn(reentrantLock);
            ReentrantLock reentrantLock2 = Threading.lock(Peer.class);
            threading.when(() -> Threading.lock(Peer.class)).thenReturn(reentrantLock2);
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, (AbstractBlockChain) null, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(servicesMock).when(vPeerVersionMessageMock).services();
            doReturn(true).when(servicesMock).has(8L);
            doReturn(txConfidenceTableMock).when(contextMock).getConfidenceTable();
            doReturn(transactionConfidenceMock).when(txConfidenceTableMock).seen((Sha256Hash) null, peerAddressMock);
            doReturn(2).when(transactionConfidenceMock).numBroadcastPeers();
            //Act Statement(s)
            target.processInv(invMock);
            //Assert statement(s)
            verify(invMock).getItems();
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            threading.verify(() -> Threading.lock(PeerSocketHandler.class), atLeast(1));
            threading.verify(() -> Threading.lock(Peer.class), atLeast(1));
            context.verify(() -> Context.get(), atLeast(1));
            verify(vPeerVersionMessageMock).services();
            verify(servicesMock).has(8L);
            verify(contextMock).getConfidenceTable();
            verify(txConfidenceTableMock).seen((Sha256Hash) null, peerAddressMock);
            verify(transactionConfidenceMock).numBroadcastPeers();
        }
    }

    //Sapient generated method id: ${c81f2afe-9841-3fd7-bc71-073b8d941ac1}
    @Ignore()
    @Test()
    public void processInvWhenDownloadBlockBodiesThrowsIllegalStateException() {
        /* Branches:
         * (for-each(items)) : true
         * (switch(item.type) = BLOCK) : true
         * (log.isDebugEnabled()) : true
         * (transactions.isEmpty()) : true
         * (blocks.size() == 1) : true
         * (downloadData) : true
         * (blockChain != null) : true
         * (!blockChain.isOrphan(blocks.get(0))) : true
         * (vPeerVersionMessage.services().has(Services.NODE_WITNESS)) : true
         * (it.hasNext()) : false
         * (blocks.size() > 0) : true
         * (downloadData) : true
         * (blockChain != null) : true
         * (for-each(blocks)) : true
         * (blockChain.isOrphan(item)) : true
         * (downloadBlockBodies) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InventoryMessage invMock = mock(InventoryMessage.class);
        InventoryItem inventoryItemMock = mock(InventoryItem.class);
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Services servicesMock = mock(Services.class);
        Block blockMock2 = mock(Block.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<Context> context = mockStatic(Context.class)) {
            List<InventoryItem> inventoryItemList = new ArrayList<>();
            inventoryItemList.add(inventoryItemMock);
            doReturn(inventoryItemList).when(invMock).getItems();
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(false)).thenThrow(illegalStateException);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(servicesMock).when(vPeerVersionMessageMock).services();
            doReturn(true).when(servicesMock).has(8L);
            doReturn(false, true).when(blockChainMock).isOrphan(sha256HashMock);
            doReturn(blockMock2).when(blockChainMock).getOrphanRoot(sha256HashMock);
            doReturn(sha256HashMock2).when(blockMock2).getHash();
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.processInv(invMock);
            //Assert statement(s)
            verify(invMock).getItems();
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            verify(blockChainMock, times(2)).isOrphan(sha256HashMock);
            verify(vPeerVersionMessageMock).services();
            verify(servicesMock).has(8L);
            verify(blockChainMock).getOrphanRoot(sha256HashMock);
            verify(blockMock2).getHash();
        }
    }

    //Sapient generated method id: ${06044dc8-999c-3e4b-9664-d01cc9e188e5}
    @Ignore()
    @Test()
    public void processInvWhenNotUseFilteredBlocksAndGetDataItemsNotIsEmptyAndNotPingAfterGetData() throws BlockStoreException, IOException {
        /* Branches:
         * (for-each(items)) : true
         * (switch(item.type) = BLOCK) : true
         * (log.isDebugEnabled()) : true
         * (transactions.isEmpty()) : true
         * (blocks.size() == 1) : true
         * (downloadData) : true
         * (blockChain != null) : true
         * (!blockChain.isOrphan(blocks.get(0))) : true
         * (vPeerVersionMessage.services().has(Services.NODE_WITNESS)) : true
         * (it.hasNext()) : false
         * (blocks.size() > 0) : true
         * (downloadData) : true
         * (blockChain != null) : true
         * (for-each(blocks)) : true
         * (blockChain.isOrphan(item)) : false
         * (!pendingBlockDownloads.contains(item)) : true
         * (clientVersion >= ProtocolVersion.BLOOM_FILTER.intValue()) : true  #  inside isBloomFilteringSupported method
         * (clientVersion < ProtocolVersion.BLOOM_FILTER_BIP111.intValue()) : true  #  inside isBloomFilteringSupported method
         * (isBloomFilteringSupported(vPeerVersionMessage)) : true
         * (useFilteredBlocks) : false
         * (!getDataItems.isEmpty()) : true
         * (pingAfterGetData) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InventoryMessage invMock = mock(InventoryMessage.class);
        InventoryItem inventoryItemMock = mock(InventoryItem.class);
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        Services servicesMock = mock(Services.class);
        TxConfidenceTable txConfidenceTableMock = mock(TxConfidenceTable.class);
        TransactionConfidence transactionConfidenceMock = mock(TransactionConfidence.class);
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            List<InventoryItem> inventoryItemList = new ArrayList<>();
            inventoryItemList.add(inventoryItemMock);
            doReturn(inventoryItemList).when(invMock).getItems();
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            ReentrantLock reentrantLock = Threading.lock(PeerSocketHandler.class);
            threading.when(() -> Threading.lock(PeerSocketHandler.class)).thenReturn(reentrantLock);
            ReentrantLock reentrantLock2 = Threading.lock(Peer.class);
            threading.when(() -> Threading.lock(Peer.class)).thenReturn(reentrantLock2);
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(servicesMock).when(vPeerVersionMessageMock).services();
            doReturn(true).when(servicesMock).has(8L);
            doReturn(txConfidenceTableMock).when(contextMock).getConfidenceTable();
            doReturn(transactionConfidenceMock).when(txConfidenceTableMock).seen((Sha256Hash) null, peerAddressMock);
            doReturn(2).when(transactionConfidenceMock).numBroadcastPeers();
            //Act Statement(s)
            target.processInv(invMock);
            //Assert statement(s)
            verify(invMock).getItems();
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            threading.verify(() -> Threading.lock(PeerSocketHandler.class), atLeast(1));
            threading.verify(() -> Threading.lock(Peer.class), atLeast(1));
            context.verify(() -> Context.get(), atLeast(1));
            verify(vPeerVersionMessageMock).services();
            verify(servicesMock).has(8L);
            verify(contextMock).getConfidenceTable();
            verify(txConfidenceTableMock).seen((Sha256Hash) null, peerAddressMock);
            verify(transactionConfidenceMock).numBroadcastPeers();
        }
    }

    //Sapient generated method id: ${fc2449ac-d890-3384-8f69-1b444a0f7f91}
    @Ignore()
    @Test()
    public void processInvWhenIsBloomFilteringSupportedNotVPeerVersionMessageAndGetDataItemsNotIsEmptyAndNotPingAfterGetData4() throws BlockStoreException, IOException {
        /* Branches:
         * (for-each(items)) : true
         * (switch(item.type) = BLOCK) : true
         * (log.isDebugEnabled()) : true
         * (transactions.isEmpty()) : true
         * (blocks.size() == 1) : true
         * (downloadData) : true
         * (blockChain != null) : true
         * (!blockChain.isOrphan(blocks.get(0))) : true
         * (vPeerVersionMessage.services().has(Services.NODE_WITNESS)) : true
         * (it.hasNext()) : false
         * (blocks.size() > 0) : true
         * (downloadData) : true
         * (blockChain != null) : true
         * (for-each(blocks)) : true
         * (blockChain.isOrphan(item)) : false
         * (!pendingBlockDownloads.contains(item)) : true
         * (clientVersion >= ProtocolVersion.BLOOM_FILTER.intValue()) : true  #  inside isBloomFilteringSupported method
         * (clientVersion < ProtocolVersion.BLOOM_FILTER_BIP111.intValue()) : false  #  inside isBloomFilteringSupported method
         * (version.services().has(Services.NODE_BLOOM)) : false  #  inside isBloomFilteringSupported method
         * (isBloomFilteringSupported(vPeerVersionMessage)) : false
         * (!getDataItems.isEmpty()) : true
         * (pingAfterGetData) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InventoryMessage invMock = mock(InventoryMessage.class);
        InventoryItem inventoryItemMock = mock(InventoryItem.class);
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        Services servicesMock = mock(Services.class);
        TxConfidenceTable txConfidenceTableMock = mock(TxConfidenceTable.class);
        TransactionConfidence transactionConfidenceMock = mock(TransactionConfidence.class);
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            List<InventoryItem> inventoryItemList = new ArrayList<>();
            inventoryItemList.add(inventoryItemMock);
            doReturn(inventoryItemList).when(invMock).getItems();
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            ReentrantLock reentrantLock = Threading.lock(PeerSocketHandler.class);
            threading.when(() -> Threading.lock(PeerSocketHandler.class)).thenReturn(reentrantLock);
            ReentrantLock reentrantLock2 = Threading.lock(Peer.class);
            threading.when(() -> Threading.lock(Peer.class)).thenReturn(reentrantLock2);
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(servicesMock).when(vPeerVersionMessageMock).services();
            doReturn(true).when(servicesMock).has(8L);
            doReturn(txConfidenceTableMock).when(contextMock).getConfidenceTable();
            doReturn(transactionConfidenceMock).when(txConfidenceTableMock).seen((Sha256Hash) null, peerAddressMock);
            doReturn(2).when(transactionConfidenceMock).numBroadcastPeers();
            //Act Statement(s)
            target.processInv(invMock);
            //Assert statement(s)
            verify(invMock).getItems();
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            threading.verify(() -> Threading.lock(PeerSocketHandler.class), atLeast(1));
            threading.verify(() -> Threading.lock(Peer.class), atLeast(1));
            context.verify(() -> Context.get(), atLeast(1));
            verify(vPeerVersionMessageMock).services();
            verify(servicesMock).has(8L);
            verify(contextMock).getConfidenceTable();
            verify(txConfidenceTableMock).seen((Sha256Hash) null, peerAddressMock);
            verify(transactionConfidenceMock).numBroadcastPeers();
        }
    }

    //Sapient generated method id: ${59bbd185-6b35-3a42-8a43-f31fa3b5611b}
    @Ignore()
    @Test()
    public void processInvWhenNotUseFilteredBlocksAndGetDataItemsNotIsEmptyAndNotPingAfterGetData2() throws BlockStoreException, IOException {
        /* Branches:
         * (for-each(items)) : true
         * (switch(item.type) = BLOCK) : true
         * (log.isDebugEnabled()) : true
         * (transactions.isEmpty()) : true
         * (blocks.size() == 1) : true
         * (downloadData) : true
         * (blockChain != null) : true
         * (!blockChain.isOrphan(blocks.get(0))) : true
         * (vPeerVersionMessage.services().has(Services.NODE_WITNESS)) : true
         * (it.hasNext()) : false
         * (blocks.size() > 0) : true
         * (downloadData) : true
         * (blockChain != null) : true
         * (for-each(blocks)) : true
         * (blockChain.isOrphan(item)) : false
         * (!pendingBlockDownloads.contains(item)) : true
         * (clientVersion >= ProtocolVersion.BLOOM_FILTER.intValue()) : true  #  inside isBloomFilteringSupported method
         * (clientVersion < ProtocolVersion.BLOOM_FILTER_BIP111.intValue()) : false  #  inside isBloomFilteringSupported method
         * (version.services().has(Services.NODE_BLOOM)) : true  #  inside isBloomFilteringSupported method
         * (isBloomFilteringSupported(vPeerVersionMessage)) : true
         * (useFilteredBlocks) : false
         * (!getDataItems.isEmpty()) : true
         * (pingAfterGetData) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InventoryMessage invMock = mock(InventoryMessage.class);
        InventoryItem inventoryItemMock = mock(InventoryItem.class);
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        Services servicesMock = mock(Services.class);
        TxConfidenceTable txConfidenceTableMock = mock(TxConfidenceTable.class);
        TransactionConfidence transactionConfidenceMock = mock(TransactionConfidence.class);
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            List<InventoryItem> inventoryItemList = new ArrayList<>();
            inventoryItemList.add(inventoryItemMock);
            doReturn(inventoryItemList).when(invMock).getItems();
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            ReentrantLock reentrantLock = Threading.lock(PeerSocketHandler.class);
            threading.when(() -> Threading.lock(PeerSocketHandler.class)).thenReturn(reentrantLock);
            ReentrantLock reentrantLock2 = Threading.lock(Peer.class);
            threading.when(() -> Threading.lock(Peer.class)).thenReturn(reentrantLock2);
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(servicesMock).when(vPeerVersionMessageMock).services();
            doReturn(true).when(servicesMock).has(8L);
            doReturn(txConfidenceTableMock).when(contextMock).getConfidenceTable();
            doReturn(transactionConfidenceMock).when(txConfidenceTableMock).seen((Sha256Hash) null, peerAddressMock);
            doReturn(2).when(transactionConfidenceMock).numBroadcastPeers();
            //Act Statement(s)
            target.processInv(invMock);
            //Assert statement(s)
            verify(invMock).getItems();
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            threading.verify(() -> Threading.lock(PeerSocketHandler.class), atLeast(1));
            threading.verify(() -> Threading.lock(Peer.class), atLeast(1));
            context.verify(() -> Context.get(), atLeast(1));
            verify(vPeerVersionMessageMock).services();
            verify(servicesMock).has(8L);
            verify(contextMock).getConfidenceTable();
            verify(txConfidenceTableMock).seen((Sha256Hash) null, peerAddressMock);
            verify(transactionConfidenceMock).numBroadcastPeers();
        }
    }

    //Sapient generated method id: ${5378fc3b-d92c-3a5e-9f2c-0e310632a5e7}
    @Ignore()
    @Test()
    public void getBlockWhenGetdataGetItemsSizeEquals1() throws NotYetConnectedException, IOException {
        /* Branches:
         * (getdata.getItems().size() == 1) : true  #  inside sendSingleGetData method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        GetDataMessage getDataMessageMock = mock(GetDataMessage.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        InventoryItem inventoryItemMock = mock(InventoryItem.class);
        ListenableCompletableFuture<Block> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        ListenableCompletableFuture<Void> listenableCompletableFutureMock2 = mock(ListenableCompletableFuture.class);
        try (MockedStatic<ListenableCompletableFuture> listenableCompletableFuture = mockStatic(ListenableCompletableFuture.class);
             MockedStatic<GetDataMessage> getDataMessage = mockStatic(GetDataMessage.class);
             MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            ReentrantLock reentrantLock = Threading.lock(PeerSocketHandler.class);
            threading.when(() -> Threading.lock(PeerSocketHandler.class)).thenReturn(reentrantLock);
            ReentrantLock reentrantLock2 = Threading.lock(Peer.class);
            threading.when(() -> Threading.lock(Peer.class)).thenReturn(reentrantLock2);
            context.when(() -> Context.get()).thenReturn(contextMock);
            getDataMessage.when(() -> GetDataMessage.ofBlock(sha256HashMock, true)).thenReturn(getDataMessageMock);
            List<InventoryItem> inventoryItemList = new ArrayList<>();
            inventoryItemList.add(inventoryItemMock);
            List<InventoryItem> inventoryItemList2 = new ArrayList<>();
            inventoryItemList2.add(inventoryItemMock);
            doReturn(inventoryItemList, inventoryItemList2).when(getDataMessageMock).getItems();
            listenableCompletableFuture.when(() -> ListenableCompletableFuture.of((CompletableFuture) any())).thenReturn(listenableCompletableFutureMock);
            target = spy(new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(listenableCompletableFutureMock2).when(target).sendMessage(getDataMessageMock);
            //Act Statement(s)
            ListenableCompletableFuture<Block> result = target.getBlock(sha256HashMock);
            //Assert statement(s)
            assertThat(result, equalTo(listenableCompletableFutureMock));
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            threading.verify(() -> Threading.lock(PeerSocketHandler.class), atLeast(1));
            threading.verify(() -> Threading.lock(Peer.class), atLeast(1));
            context.verify(() -> Context.get(), atLeast(1));
            getDataMessage.verify(() -> GetDataMessage.ofBlock(sha256HashMock, true), atLeast(1));
            verify(getDataMessageMock, times(2)).getItems();
            listenableCompletableFuture.verify(() -> ListenableCompletableFuture.of((CompletableFuture) any()));
            verify(target).sendMessage(getDataMessageMock);
        }
    }

    //Sapient generated method id: ${92838a02-06e9-39a5-a9db-58ff1b83a1a6}
    @Ignore()
    @Test()
    public void getBlockWhenGetdataGetItemsSizeNotEquals1() throws NotYetConnectedException, IOException {
        /* Branches:
         * (getdata.getItems().size() == 1) : false  #  inside sendSingleGetData method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        GetDataMessage getDataMessageMock = mock(GetDataMessage.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        InventoryItem inventoryItemMock = mock(InventoryItem.class);
        InventoryItem inventoryItemMock2 = mock(InventoryItem.class);
        ListenableCompletableFuture<Block> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        ListenableCompletableFuture<Void> listenableCompletableFutureMock2 = mock(ListenableCompletableFuture.class);
        try (MockedStatic<ListenableCompletableFuture> listenableCompletableFuture = mockStatic(ListenableCompletableFuture.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<GetDataMessage> getDataMessage = mockStatic(GetDataMessage.class);
             MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            ReentrantLock reentrantLock = Threading.lock(PeerSocketHandler.class);
            threading.when(() -> Threading.lock(PeerSocketHandler.class)).thenReturn(reentrantLock);
            ReentrantLock reentrantLock2 = Threading.lock(Peer.class);
            threading.when(() -> Threading.lock(Peer.class)).thenReturn(reentrantLock2);
            context.when(() -> Context.get()).thenReturn(contextMock);
            getDataMessage.when(() -> GetDataMessage.ofBlock(sha256HashMock, true)).thenReturn(getDataMessageMock);
            List<InventoryItem> inventoryItemList = new ArrayList<>();
            inventoryItemList.add(inventoryItemMock);
            inventoryItemList.add(inventoryItemMock2);
            List<InventoryItem> inventoryItemList2 = new ArrayList<>();
            inventoryItemList2.add(inventoryItemMock);
            doReturn(inventoryItemList, inventoryItemList2).when(getDataMessageMock).getItems();
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            listenableCompletableFuture.when(() -> ListenableCompletableFuture.of((CompletableFuture) any())).thenReturn(listenableCompletableFutureMock);
            target = spy(new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(listenableCompletableFutureMock2).when(target).sendMessage(getDataMessageMock);
            //Act Statement(s)
            ListenableCompletableFuture<Block> result = target.getBlock(sha256HashMock);
            //Assert statement(s)
            assertThat(result, equalTo(listenableCompletableFutureMock));
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            threading.verify(() -> Threading.lock(PeerSocketHandler.class), atLeast(1));
            threading.verify(() -> Threading.lock(Peer.class), atLeast(1));
            context.verify(() -> Context.get(), atLeast(1));
            getDataMessage.verify(() -> GetDataMessage.ofBlock(sha256HashMock, true), atLeast(1));
            verify(getDataMessageMock, times(2)).getItems();
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            listenableCompletableFuture.verify(() -> ListenableCompletableFuture.of((CompletableFuture) any()));
            verify(target).sendMessage(getDataMessageMock);
        }
    }

    //Sapient generated method id: ${a1a82b28-bd80-3a94-897f-cf7d5aee5a00}
    @Ignore()
    @Test()
    public void getPeerMempoolTransactionWhenGetdataGetItemsSizeEquals1() throws NotYetConnectedException, IOException {
        /* Branches:
         * (getdata.getItems().size() == 1) : true  #  inside sendSingleGetData method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        GetDataMessage getDataMessageMock = mock(GetDataMessage.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        InventoryItem inventoryItemMock = mock(InventoryItem.class);
        ListenableCompletableFuture<Transaction> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        Services servicesMock = mock(Services.class);
        ListenableCompletableFuture<Void> listenableCompletableFutureMock2 = mock(ListenableCompletableFuture.class);
        try (MockedStatic<ListenableCompletableFuture> listenableCompletableFuture = mockStatic(ListenableCompletableFuture.class);
             MockedStatic<GetDataMessage> getDataMessage = mockStatic(GetDataMessage.class);
             MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            ReentrantLock reentrantLock = Threading.lock(PeerSocketHandler.class);
            threading.when(() -> Threading.lock(PeerSocketHandler.class)).thenReturn(reentrantLock);
            ReentrantLock reentrantLock2 = Threading.lock(Peer.class);
            threading.when(() -> Threading.lock(Peer.class)).thenReturn(reentrantLock2);
            context.when(() -> Context.get()).thenReturn(contextMock);
            getDataMessage.when(() -> GetDataMessage.ofTransaction(sha256HashMock, false)).thenReturn(getDataMessageMock);
            List<InventoryItem> inventoryItemList = new ArrayList<>();
            inventoryItemList.add(inventoryItemMock);
            List<InventoryItem> inventoryItemList2 = new ArrayList<>();
            inventoryItemList2.add(inventoryItemMock);
            doReturn(inventoryItemList, inventoryItemList2).when(getDataMessageMock).getItems();
            listenableCompletableFuture.when(() -> ListenableCompletableFuture.of((CompletableFuture) any())).thenReturn(listenableCompletableFutureMock);
            target = spy(new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(servicesMock).when(vPeerVersionMessageMock).services();
            doReturn(false).when(servicesMock).has(8L);
            doReturn(listenableCompletableFutureMock2).when(target).sendMessage(getDataMessageMock);
            //Act Statement(s)
            ListenableCompletableFuture<Transaction> result = target.getPeerMempoolTransaction(sha256HashMock);
            //Assert statement(s)
            assertThat(result, equalTo(listenableCompletableFutureMock));
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            threading.verify(() -> Threading.lock(PeerSocketHandler.class), atLeast(1));
            threading.verify(() -> Threading.lock(Peer.class), atLeast(1));
            context.verify(() -> Context.get(), atLeast(1));
            getDataMessage.verify(() -> GetDataMessage.ofTransaction(sha256HashMock, false), atLeast(1));
            verify(getDataMessageMock, times(2)).getItems();
            listenableCompletableFuture.verify(() -> ListenableCompletableFuture.of((CompletableFuture) any()));
            verify(vPeerVersionMessageMock).services();
            verify(servicesMock).has(8L);
            verify(target).sendMessage(getDataMessageMock);
        }
    }

    //Sapient generated method id: ${981e6ca1-47a3-3e0e-95ad-ef08ab7f3140}
    @Ignore()
    @Test()
    public void getPeerMempoolTransactionWhenGetdataGetItemsSizeNotEquals1() throws NotYetConnectedException, IOException {
        /* Branches:
         * (getdata.getItems().size() == 1) : false  #  inside sendSingleGetData method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        GetDataMessage getDataMessageMock = mock(GetDataMessage.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        InventoryItem inventoryItemMock = mock(InventoryItem.class);
        InventoryItem inventoryItemMock2 = mock(InventoryItem.class);
        ListenableCompletableFuture<Transaction> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        Services servicesMock = mock(Services.class);
        ListenableCompletableFuture<Void> listenableCompletableFutureMock2 = mock(ListenableCompletableFuture.class);
        try (MockedStatic<ListenableCompletableFuture> listenableCompletableFuture = mockStatic(ListenableCompletableFuture.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<GetDataMessage> getDataMessage = mockStatic(GetDataMessage.class);
             MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            ReentrantLock reentrantLock = Threading.lock(PeerSocketHandler.class);
            threading.when(() -> Threading.lock(PeerSocketHandler.class)).thenReturn(reentrantLock);
            ReentrantLock reentrantLock2 = Threading.lock(Peer.class);
            threading.when(() -> Threading.lock(Peer.class)).thenReturn(reentrantLock2);
            context.when(() -> Context.get()).thenReturn(contextMock);
            getDataMessage.when(() -> GetDataMessage.ofTransaction(sha256HashMock, false)).thenReturn(getDataMessageMock);
            List<InventoryItem> inventoryItemList = new ArrayList<>();
            inventoryItemList.add(inventoryItemMock);
            inventoryItemList.add(inventoryItemMock2);
            List<InventoryItem> inventoryItemList2 = new ArrayList<>();
            inventoryItemList2.add(inventoryItemMock);
            doReturn(inventoryItemList, inventoryItemList2).when(getDataMessageMock).getItems();
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            listenableCompletableFuture.when(() -> ListenableCompletableFuture.of((CompletableFuture) any())).thenReturn(listenableCompletableFutureMock);
            target = spy(new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(servicesMock).when(vPeerVersionMessageMock).services();
            doReturn(false).when(servicesMock).has(8L);
            doReturn(listenableCompletableFutureMock2).when(target).sendMessage(getDataMessageMock);
            //Act Statement(s)
            ListenableCompletableFuture<Transaction> result = target.getPeerMempoolTransaction(sha256HashMock);
            //Assert statement(s)
            assertThat(result, equalTo(listenableCompletableFutureMock));
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            threading.verify(() -> Threading.lock(PeerSocketHandler.class), atLeast(1));
            threading.verify(() -> Threading.lock(Peer.class), atLeast(1));
            context.verify(() -> Context.get(), atLeast(1));
            getDataMessage.verify(() -> GetDataMessage.ofTransaction(sha256HashMock, false), atLeast(1));
            verify(getDataMessageMock, times(2)).getItems();
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            listenableCompletableFuture.verify(() -> ListenableCompletableFuture.of((CompletableFuture) any()));
            verify(vPeerVersionMessageMock).services();
            verify(servicesMock).has(8L);
            verify(target).sendMessage(getDataMessageMock);
        }
    }

    //Sapient generated method id: ${3e8fee0e-d42c-3bd2-95c7-2be928eeccbd}
    @Ignore()
    @Test()
    public void getAddrTest() throws NotYetConnectedException, IOException {
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        ListenableCompletableFuture<Void> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = spy(new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(listenableCompletableFutureMock).when(target).sendMessage((GetAddrMessage) any());
            //Act Statement(s)
            ListenableCompletableFuture<AddressMessage> result = target.getAddr();
            ListenableCompletableFuture<AddressMessage> listenableCompletableFuture = new ListenableCompletableFuture<>();
            //Assert statement(s)
            //TODO: Please implement equals method in ListenableCompletableFuture for verification to succeed or you need to adjust respective assertion statements
            assertThat(result, equalTo(listenableCompletableFuture));
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            verify(target).sendMessage((GetAddrMessage) any());
        }
    }

    //Sapient generated method id: ${9ed5e31a-69c9-3826-8ad1-dc2a3e75bbf0}
    @Ignore()
    @Test()
    public void setFastDownloadParametersWhenThisFastCatchupTimeIsAfterBlockChainGetChainHeadGetHeaderTime() {
        /* Branches:
         * (blockChain != null) : true
         * (this.fastCatchupTime.isAfter(blockChain.getChainHead().getHeader().time())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        Block blockMock2 = mock(Block.class);
        try (MockedStatic<Context> context = mockStatic(Context.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            ReentrantLock reentrantLock = Threading.lock(PeerSocketHandler.class);
            threading.when(() -> Threading.lock(PeerSocketHandler.class)).thenReturn(reentrantLock);
            ReentrantLock reentrantLock2 = Threading.lock(Peer.class);
            threading.when(() -> Threading.lock(Peer.class)).thenReturn(reentrantLock2);
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            StoredBlock storedBlock = new StoredBlock(blockMock2, new BigInteger("0"), 0);
            doReturn(storedBlock).when(blockChainMock).getChainHead();
            Instant instant2 = Instant.now();
            doReturn(instant2).when(blockMock2).time();
            Instant instant3 = Instant.now();
            //Act Statement(s)
            target.setFastDownloadParameters(false, instant3);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            threading.verify(() -> Threading.lock(PeerSocketHandler.class), atLeast(1));
            threading.verify(() -> Threading.lock(Peer.class), atLeast(1));
            context.verify(() -> Context.get(), atLeast(1));
            verify(blockChainMock).getChainHead();
            verify(blockMock2).time();
        }
    }

    //Sapient generated method id: ${d63cb059-3d8f-392a-900a-68aee158e762}
    @Ignore()
    @Test()
    public void setDownloadParametersTest() {
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        Block blockMock2 = mock(Block.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(blockMock, blockMock2).when(paramsMock).getGenesisBlock();
            Instant instant2 = Instant.now();
            doReturn(instant2).when(blockMock2).time();
            //Act Statement(s)
            target.setDownloadParameters(false);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock, times(2)).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            verify(blockMock2).time();
        }
    }

    //Sapient generated method id: ${a05d8487-dc4b-39d9-9feb-ab42c9a4a566}
    @Test()
    public void setDownloadParameters1WhenFastCatchupTimeSecsGreaterThan0() {
        /* Branches:
         * (fastCatchupTimeSecs > 0) : true
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = spy(new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).setFastDownloadParameters(eq(false), (Instant) any());
            //Act Statement(s)
            target.setDownloadParameters(1L, false);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            verify(target).setFastDownloadParameters(eq(false), (Instant) any());
        }
    }

    //Sapient generated method id: ${a0a8ddd3-4374-348c-bbfb-0d3c8324fd62}
    @Ignore()
    @Test()
    public void setDownloadParameters1WhenFastCatchupTimeSecsNotGreaterThan0() {
        /* Branches:
         * (fastCatchupTimeSecs > 0) : false
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        Block blockMock2 = mock(Block.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(blockMock, blockMock2).when(paramsMock).getGenesisBlock();
            Instant instant2 = Instant.now();
            doReturn(instant2).when(blockMock2).time();
            //Act Statement(s)
            target.setDownloadParameters(0L, false);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock, times(2)).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            verify(blockMock2).time();
        }
    }

    //Sapient generated method id: ${3832fc87-b89b-3daf-9520-76cdb8c3fb5a}
    @Test()
    public void addWalletTest() {
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        Wallet walletMock = mock(Wallet.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.addWallet(walletMock);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
        }
    }

    //Sapient generated method id: ${bed2c0d2-5371-364c-99cf-0a2273e29d50}
    @Test()
    public void removeWalletTest() {
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        Wallet walletMock = mock(Wallet.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.removeWallet(walletMock);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
        }
    }

    //Sapient generated method id: ${3241502b-0594-3cd8-a482-1d386990b1b6}
    @Test()
    public void startBlockChainDownloadWhenBlocksLeftLessThan0() throws BlockStoreException, IOException {
        /* Branches:
         * (blocksLeft >= 0) : false
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = spy(new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(-1).when(target).getPeerBlockHeightDifference();
            //Act Statement(s)
            target.startBlockChainDownload();
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            verify(target).getPeerBlockHeightDifference();
        }
    }

    //Sapient generated method id: ${044214ab-4589-3ce3-a699-496823636a85}
    @Ignore()
    @Test()
    public void startBlockChainDownloadWhenChainDownloadStartedEventListenersIsEmptyThrowsIllegalStateException() {
        /* Branches:
         * (blocksLeft >= 0) : true
         * (for-each(chainDownloadStartedEventListeners)) : false
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(false)).thenThrow(illegalStateException);
            target = spy(new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(1).when(target).getPeerBlockHeightDifference();
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.startBlockChainDownload();
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            verify(target).getPeerBlockHeightDifference();
        }
    }

    //Sapient generated method id: ${3492584e-4d6f-33ce-b68c-c542605bbe8e}
    @Ignore()
    @Test()
    public void sendPingTest() throws IOException {
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = spy(new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            CompletableFuture<Duration> completableFuture = new CompletableFuture<>();
            doReturn(completableFuture).when(target).sendPing(9085018369579877376L);
            //Act Statement(s)
            CompletableFuture<Duration> result = target.sendPing();
            //Assert statement(s)
            assertThat(result, equalTo(completableFuture));
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            verify(target).sendPing(9085018369579877376L);
        }
    }

    //Sapient generated method id: ${815294bc-51c2-3550-9d3f-33d3c35739a6}
    @Ignore()
    @Test()
    public void sendPing1WhenPendingPingsSizeNotGreaterThanPENDING_PINGS_LIMIT() throws NotYetConnectedException, IOException {
        /* Branches:
         * (pendingPings.size() > PENDING_PINGS_LIMIT) : false
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        Ping pingMock = mock(Ping.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        ListenableCompletableFuture<Void> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        try (MockedStatic<Ping> ping = mockStatic(Ping.class);
             MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            ping.when(() -> Ping.of(0L)).thenReturn(pingMock);
            target = spy(new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(listenableCompletableFutureMock).when(target).sendMessage(pingMock);
            //Act Statement(s)
            CompletableFuture<Duration> result = target.sendPing(0L);
            CompletableFuture<Duration> completableFuture = new CompletableFuture<>();
            //Assert statement(s)
            //TODO: Please implement equals method in CompletableFuture for verification to succeed or you need to adjust respective assertion statements
            assertThat(result, equalTo(completableFuture));
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            ping.verify(() -> Ping.of(0L), atLeast(1));
            verify(target).sendMessage(pingMock);
        }
    }

    //Sapient generated method id: ${6b7e7cd3-441c-3b79-a979-dcd2e33a3e5f}
    @Ignore(value = "Potential harmful system call (CompletableFuture.thenApply) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void pingTest() throws IOException {
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        ListenableCompletableFuture<Long> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<ListenableCompletableFuture> listenableCompletableFuture = mockStatic(ListenableCompletableFuture.class);
             MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            CompletableFuture completableFuture = new CompletableFuture();
            listenableCompletableFuture.when(() -> ListenableCompletableFuture.of(completableFuture)).thenReturn(listenableCompletableFutureMock);
            target = spy(new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            CompletableFuture<Duration> completableFuture2 = new CompletableFuture<>();
            doReturn(completableFuture2).when(target).sendPing();
            //Act Statement(s)
            ListenableCompletableFuture<Long> result = target.ping();
            //Assert statement(s)
            assertThat(result, equalTo(listenableCompletableFutureMock));
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            listenableCompletableFuture.verify(() -> ListenableCompletableFuture.of(completableFuture), atLeast(1));
            verify(target).sendPing();
        }
    }

    //Sapient generated method id: ${55e569af-d56c-3275-9bc3-75719524e213}
    @Test()
    public void lastPingIntervalTest() {
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            Optional<Duration> result = target.lastPingInterval();
            Optional<Duration> durationOptional = Optional.empty();
            //Assert statement(s)
            assertThat(result, equalTo(durationOptional));
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
        }
    }

    //Sapient generated method id: ${d58d1cc7-1963-3884-9c10-e01bb1943056}
    @Test()
    public void getLastPingTimeTest() {
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            long result = target.getLastPingTime();
            //Assert statement(s)
            assertThat(result, equalTo(9223372036854775807L));
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
        }
    }

    //Sapient generated method id: ${b5fc716f-2cdc-37a4-84d0-d95e30da1df0}
    @Test()
    public void pingIntervalTest() {
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            Optional<Duration> result = target.pingInterval();
            Optional<Duration> durationOptional = Optional.empty();
            //Assert statement(s)
            assertThat(result, equalTo(durationOptional));
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
        }
    }

    //Sapient generated method id: ${1f9b698c-221c-315b-b2bc-0d108bbd4832}
    @Test()
    public void getPingTimeTest() {
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            long result = target.getPingTime();
            //Assert statement(s)
            assertThat(result, equalTo(9223372036854775807L));
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
        }
    }

    //Sapient generated method id: ${9d6e8bc7-d2f2-3955-b48e-f27678894dcf}
    @Test()
    public void processPongWhenPendingPingsIsEmpty() {
        /* Branches:
         * (for-each(pendingPings)) : false
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        Pong pongMock = mock(Pong.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.processPong(pongMock);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
        }
    }

    //Sapient generated method id: ${6f6d690e-6b6a-388f-88d5-e0841d17fa39}
    @Ignore()
    @Test()
    public void getPeerBlockHeightDifferenceWhenChainHeightGreaterThan0() {
        /* Branches:
         * (params.allowEmptyPeerChain()) : false
         * (chainHeight > 0) : true
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            preconditions.when(() -> Preconditions.checkState(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(false).when(paramsMock).allowEmptyPeerChain();
            doReturn(1).when(blockChainMock).getBestChainHeight();
            //Act Statement(s)
            int result = target.getPeerBlockHeightDifference();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            preconditions.verify(() -> Preconditions.checkState(eq(true), (Supplier) any()));
            verify(paramsMock).allowEmptyPeerChain();
            verify(blockChainMock).getBestChainHeight();
        }
    }

    //Sapient generated method id: ${70e3847a-49d7-3e8c-9cf3-f303d670b2f8}
    @Ignore()
    @Test()
    public void getPeerBlockHeightDifferenceWhenChainHeightNotGreaterThan0() {
        /* Branches:
         * (params.allowEmptyPeerChain()) : false
         * (chainHeight > 0) : false
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            preconditions.when(() -> Preconditions.checkState(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(false).when(paramsMock).allowEmptyPeerChain();
            doReturn(0).when(blockChainMock).getBestChainHeight();
            //Act Statement(s)
            int result = target.getPeerBlockHeightDifference();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            preconditions.verify(() -> Preconditions.checkState(eq(true), (Supplier) any()));
            verify(paramsMock).allowEmptyPeerChain();
            verify(blockChainMock).getBestChainHeight();
        }
    }

    //Sapient generated method id: ${618a24a1-42da-37c6-8670-a6aacf816b02}
    @Ignore()
    @Test()
    public void getBestHeightTest() {
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            long result = target.getBestHeight();
            //Assert statement(s)
            assertThat(result, equalTo(1L));
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
        }
    }

    //Sapient generated method id: ${1739afb2-3f32-3db8-8d54-6c57a67cb6e8}
    @Test()
    public void setMinProtocolVersionWhenVerIsNull() {
        /* Branches:
         * (ver != null) : false
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.setMinProtocolVersion(0);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
        }
    }

    //Sapient generated method id: ${030a978e-88d0-3f3c-adb5-3d78357065f5}
    @Test()
    public void setBloomFilterTest() throws IOException {
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        BloomFilter bloomFilterMock = mock(BloomFilter.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = spy(new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).setBloomFilter(bloomFilterMock, true);
            //Act Statement(s)
            target.setBloomFilter(bloomFilterMock);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
            verify(target).setBloomFilter(bloomFilterMock, true);
        }
    }

    //Sapient generated method id: ${017d64c7-0311-399f-a8f4-2e6d6bef4f94}
    @Test()
    public void setBloomFilter1ThrowsNullPointerException() {
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        BloomFilter bloomFilterMock = mock(BloomFilter.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(NullPointerException.class);
            //Act Statement(s)
            target.setBloomFilter(bloomFilterMock, false);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
        }
    }

    //Sapient generated method id: ${0ccdc4b8-9b81-3368-a748-916c7b991515}
    @Test()
    public void isDownloadTxDependenciesWhenVDownloadTxDependencyDepthGreaterThan0() {
        /* Branches:
         * (vDownloadTxDependencyDepth > 0) : true
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 1);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.isDownloadTxDependencies();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
        }
    }

    //Sapient generated method id: ${c9c32abc-12b0-37d6-bee7-ba525c1db23f}
    @Test()
    public void isDownloadTxDependenciesWhenVDownloadTxDependencyDepthNotGreaterThan0() {
        /* Branches:
         * (vDownloadTxDependencyDepth > 0) : false
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.isDownloadTxDependencies();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
        }
    }

    //Sapient generated method id: ${554264d0-0030-31c5-8201-402939ab2652}
    @Test()
    public void setDownloadTxDependenciesWhenEnable() {
        /* Branches:
         * (enable) : true
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.setDownloadTxDependencies(true);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
        }
    }

    //Sapient generated method id: ${8a932ad4-a65d-35ae-8dd4-42c15f75ddb3}
    @Test()
    public void setDownloadTxDependenciesWhenNotEnable() {
        /* Branches:
         * (enable) : false
         */
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        Block blockMock = mock(Block.class);
        VersionMessage versionMessageMock = mock(VersionMessage.class);
        PeerAddress peerAddressMock = mock(PeerAddress.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
            doReturn(blockMock).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            context.when(() -> Context.get()).thenReturn(contextMock);
            target = new Peer(paramsMock, versionMessageMock, peerAddressMock, blockChainMock, 0L, 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.setDownloadTxDependencies(false);
            //Assert statement(s)
            verify(paramsMock).getDefaultSerializer();
            verify(paramsMock).getGenesisBlock();
            verify(blockMock).time();
            context.verify(() -> Context.get(), atLeast(1));
        }
    }
}
