package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.store.BlockStoreException;
import org.junit.rules.ExpectedException;
import org.bitcoinj.base.Network;

import java.util.List;

import org.bitcoinj.wallet.Wallet;
import org.bitcoinj.utils.Threading;

import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.ArrayList;

import org.mockito.stubbing.Answer;

import java.nio.ByteBuffer;

import org.bitcoinj.base.internal.Preconditions;
import org.bitcoinj.store.BlockStore;
import org.bitcoinj.base.Sha256Hash;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

import java.time.Instant;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

import org.junit.Ignore;

public class BlockChainSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final BlockStore blockStoreMock = mock(BlockStore.class, "blockStore");

    private final Block blockMock = mock(Block.class);

    private final Block blockMock2 = mock(Block.class);

    private final Block blockMock3 = mock(Block.class);

    private final Network networkMock = mock(Network.class);

    private final NetworkParameters networkParametersMock = mock(NetworkParameters.class);

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);

    private final StoredBlock storedBlockMock = mock(StoredBlock.class);

    private final Wallet walletMock = mock(Wallet.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    private final StoredBlock storedPrevMock = mock(StoredBlock.class);

    //Sapient generated method id: ${bc04315e-267a-3fb2-a511-9c50ca882015}
    @Ignore()
    @Test()
    public void addToBlockStore1Test() throws BlockStoreException, VerificationException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TransactionOutputChanges transactionOutputChangesMock = mock(TransactionOutputChanges.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(storedBlockMock).when(storedPrevMock).build(blockMock);
            StoredBlock storedBlock = new StoredBlock(blockMock2, new BigInteger("0"), 0);
            doReturn(storedBlock).when(blockStoreMock).getChainHead();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            BlockChain target = new BlockChain(networkMock, walletMock, blockStoreMock);
            doNothing().when(blockStoreMock).put(storedBlockMock);
            //Act Statement(s)
            StoredBlock result = target.addToBlockStore(storedPrevMock, blockMock, transactionOutputChangesMock);
            //Assert statement(s)
            assertThat(result, equalTo(storedBlockMock));
            verify(storedPrevMock).build(blockMock);
            verify(blockStoreMock).getChainHead();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(blockStoreMock).put(storedBlockMock);
        }
    }

    //Sapient generated method id: ${35082fa7-0a80-32e3-be99-db25ad779ca9}
    @Ignore()
    @Test()
    public void addToBlockStoreTest() throws BlockStoreException, VerificationException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(storedBlockMock).when(storedPrevMock).build(blockMock);
            StoredBlock storedBlock = new StoredBlock(blockMock2, new BigInteger("0"), 0);
            doReturn(storedBlock).when(blockStoreMock).getChainHead();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            ReentrantLock reentrantLock = Threading.lock(AbstractBlockChain.class);
            threading.when(() -> Threading.lock(AbstractBlockChain.class)).thenReturn(reentrantLock);
            BlockChain target = new BlockChain(networkMock, walletMock, blockStoreMock);
            doNothing().when(blockStoreMock).put(storedBlockMock);
            //Act Statement(s)
            StoredBlock result = target.addToBlockStore(storedPrevMock, blockMock);
            //Assert statement(s)
            assertThat(result, equalTo(storedBlockMock));
            verify(storedPrevMock).build(blockMock);
            verify(blockStoreMock).getChainHead();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            threading.verify(() -> Threading.lock(AbstractBlockChain.class), atLeast(1));
            verify(blockStoreMock).put(storedBlockMock);
        }
    }

    //Sapient generated method id: ${6ed28154-a75c-3043-807a-b41aff74066c}
    @Ignore()
    @Test()
    public void rollbackBlockStoreWhenHeightEqualsCurrentHeight() throws BlockStoreException {
        /* Branches:
         * (height >= 0) : true
         * (height <= currentHeight) : true
         * (height == currentHeight) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 0);
            doReturn(storedBlock).when(blockStoreMock).getChainHead();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            ReentrantLock reentrantLock = Threading.lock(AbstractBlockChain.class);
            threading.when(() -> Threading.lock(AbstractBlockChain.class)).thenReturn(reentrantLock);
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            BlockChain target = spy(new BlockChain(networkMock, walletMock, blockStoreMock));
            doReturn(0).when(target).getBestChainHeight();
            //Act Statement(s)
            target.rollbackBlockStore(0);
            //Assert statement(s)
            verify(blockStoreMock).getChainHead();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            threading.verify(() -> Threading.lock(AbstractBlockChain.class), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            verify(target).getBestChainHeight();
        }
    }

    //Sapient generated method id: ${77c59e2f-06ef-39b9-94ff-89a6b3ecce25}
    @Ignore()
    @Test()
    public void rollbackBlockStoreWhenNewChainHeadGetHeightNotGreaterThanHeight() throws BlockStoreException {
        /* Branches:
         * (height >= 0) : true
         * (height <= currentHeight) : true
         * (height == currentHeight) : false
         * (newChainHead.getHeight() > height) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 0);
            doReturn(storedBlock).when(blockStoreMock).getChainHead();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            ReentrantLock reentrantLock = Threading.lock(AbstractBlockChain.class);
            threading.when(() -> Threading.lock(AbstractBlockChain.class)).thenReturn(reentrantLock);
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            BlockChain target = spy(new BlockChain(networkMock, walletMock, blockStoreMock));
            doReturn(0).when(target).getBestChainHeight();
            //Act Statement(s)
            target.rollbackBlockStore(0);
            //Assert statement(s)
            verify(blockStoreMock).getChainHead();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            threading.verify(() -> Threading.lock(AbstractBlockChain.class), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            verify(target).getBestChainHeight();
        }
    }

    //Sapient generated method id: ${06560f57-68b5-38cf-a8d1-734726696122}
    @Ignore()
    @Test()
    public void rollbackBlockStoreWhenNewChainHeadIsNullThrowsBlockStoreException() throws BlockStoreException {
        /* Branches:
         * (height >= 0) : true
         * (height <= currentHeight) : true
         * (height == currentHeight) : false
         * (newChainHead.getHeight() > height) : true
         * (newChainHead == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 0);
            doReturn(storedBlock).when(blockStoreMock).getChainHead();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            ReentrantLock reentrantLock = Threading.lock(AbstractBlockChain.class);
            threading.when(() -> Threading.lock(AbstractBlockChain.class)).thenReturn(reentrantLock);
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            BlockChain target = spy(new BlockChain(networkMock, walletMock, blockStoreMock));
            doReturn(0).when(target).getBestChainHeight();
            //Act Statement(s)
            target.rollbackBlockStore(0);
            //Assert statement(s)
            verify(blockStoreMock).getChainHead();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            threading.verify(() -> Threading.lock(AbstractBlockChain.class), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            verify(target).getBestChainHeight();
        }
    }

    //Sapient generated method id: ${e67a2cba-47be-35d4-923a-1210950c3d42}
    @Ignore()
    @Test()
    public void shouldVerifyTransactionsTest() throws BlockStoreException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 0);
            doReturn(storedBlock).when(blockStoreMock).getChainHead();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            BlockChain target = new BlockChain(networkMock, walletMock, blockStoreMock);
            //Act Statement(s)
            boolean result = target.shouldVerifyTransactions();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(blockStoreMock).getChainHead();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${7f486874-04ba-32c6-b8e5-83d67c531dc7}
    @Ignore()
    @Test()
    public void connectTransactionsThrowsUnsupportedOperationException() throws BlockStoreException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 0);
            doReturn(storedBlock).when(blockStoreMock).getChainHead();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            BlockChain target = new BlockChain(networkMock, walletMock, blockStoreMock);
            thrown.expect(UnsupportedOperationException.class);
            //Act Statement(s)
            target.connectTransactions(0, blockMock2);
            //Assert statement(s)
            verify(blockStoreMock).getChainHead();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${12d11670-162a-3e56-bd2d-7c78da9492c4}
    @Ignore()
    @Test()
    public void connectTransactions1ThrowsUnsupportedOperationException() throws BlockStoreException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 0);
            doReturn(storedBlock).when(blockStoreMock).getChainHead();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            ReentrantLock reentrantLock = Threading.lock(AbstractBlockChain.class);
            threading.when(() -> Threading.lock(AbstractBlockChain.class)).thenReturn(reentrantLock);
            BlockChain target = new BlockChain(networkMock, walletMock, blockStoreMock);
            thrown.expect(UnsupportedOperationException.class);
            //Act Statement(s)
            target.connectTransactions(storedBlockMock);
            //Assert statement(s)
            verify(blockStoreMock).getChainHead();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            threading.verify(() -> Threading.lock(AbstractBlockChain.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${402cf2c3-5dcd-3d92-9a11-0dbd5296783c}
    @Ignore()
    @Test()
    public void disconnectTransactionsThrowsUnsupportedOperationException() throws BlockStoreException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 0);
            doReturn(storedBlock).when(blockStoreMock).getChainHead();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            ReentrantLock reentrantLock = Threading.lock(AbstractBlockChain.class);
            threading.when(() -> Threading.lock(AbstractBlockChain.class)).thenReturn(reentrantLock);
            BlockChain target = new BlockChain(networkMock, walletMock, blockStoreMock);
            thrown.expect(UnsupportedOperationException.class);
            //Act Statement(s)
            target.disconnectTransactions(storedBlockMock);
            //Assert statement(s)
            verify(blockStoreMock).getChainHead();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            threading.verify(() -> Threading.lock(AbstractBlockChain.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${af42f18e-3b1a-3a62-bdc5-19fb8c4d64c8}
    @Ignore()
    @Test()
    public void doSetChainHeadTest() throws BlockStoreException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 0);
            doReturn(storedBlock).when(blockStoreMock).getChainHead();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            ReentrantLock reentrantLock = Threading.lock(AbstractBlockChain.class);
            threading.when(() -> Threading.lock(AbstractBlockChain.class)).thenReturn(reentrantLock);
            BlockChain target = new BlockChain(networkMock, walletMock, blockStoreMock);
            doNothing().when(blockStoreMock).setChainHead(storedBlockMock);
            //Act Statement(s)
            target.doSetChainHead(storedBlockMock);
            //Assert statement(s)
            verify(blockStoreMock).getChainHead();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            threading.verify(() -> Threading.lock(AbstractBlockChain.class), atLeast(1));
            verify(blockStoreMock).setChainHead(storedBlockMock);
        }
    }

    //Sapient generated method id: ${326cd9cd-35c7-3898-b79d-073c4c9b8ae1}
    @Ignore()
    @Test()
    public void getStoredBlockInCurrentScopeTest() throws BlockStoreException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        try (MockedStatic<Threading> threading = mockStatic(Threading.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 0);
            doReturn(storedBlock).when(blockStoreMock).getChainHead();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            ReentrantLock reentrantLock = Threading.lock(AbstractBlockChain.class);
            threading.when(() -> Threading.lock(AbstractBlockChain.class)).thenReturn(reentrantLock);
            BlockChain target = new BlockChain(networkMock, walletMock, blockStoreMock);
            doReturn(storedBlockMock).when(blockStoreMock).get(sha256HashMock);
            //Act Statement(s)
            StoredBlock result = target.getStoredBlockInCurrentScope(sha256HashMock);
            //Assert statement(s)
            assertThat(result, equalTo(storedBlockMock));
            verify(blockStoreMock).getChainHead();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            threading.verify(() -> Threading.lock(AbstractBlockChain.class), atLeast(1));
            verify(blockStoreMock).get(sha256HashMock);
        }
    }
}
