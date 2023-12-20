package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.store.BlockStoreException;
import org.junit.rules.ExpectedException;

import java.util.List;

import org.bitcoinj.wallet.Wallet;
import org.bitcoinj.utils.Threading;
import org.bitcoinj.store.FullPrunedBlockStore;

import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.ArrayList;
import java.nio.ByteBuffer;

import org.bitcoinj.base.internal.Preconditions;
import org.bitcoinj.base.Sha256Hash;
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
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class FullPrunedBlockChainSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final FullPrunedBlockStore blockStoreMock = mock(FullPrunedBlockStore.class, "blockStore");

    private final Block blockMock = mock(Block.class);

    private final Block blockMock2 = mock(Block.class);

    private final Block blockMock3 = mock(Block.class);

    private final Block blockMock4 = mock(Block.class);

    private final NetworkParameters networkParametersMock = mock(NetworkParameters.class);

    private final Sha256Hash sha256Hash2Mock = mock(Sha256Hash.class);

    private final Sha256Hash sha256Hash2Mock2 = mock(Sha256Hash.class);

    private final StoredBlock storedBlockMock = mock(StoredBlock.class);

    private final StoredBlock storedBlockMock2 = mock(StoredBlock.class);

    private final Wallet walletMock = mock(Wallet.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${bc04315e-267a-3fb2-a511-9c50ca882015}
    @Ignore()
    @Test()
    public void addToBlockStore1Test() throws BlockStoreException, VerificationException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 0);
            doReturn(storedBlock).when(blockStoreMock).getChainHead();
            StoredBlock storedBlock2 = new StoredBlock(blockMock2, new BigInteger("0"), 0);
            doReturn(storedBlock2).when(blockStoreMock).getVerifiedChainHead();
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(AbstractBlockChain.class)).thenReturn(null);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            FullPrunedBlockChain target = new FullPrunedBlockChain(networkParameters, walletMock, blockStoreMock);
            StoredBlock storedBlock3 = new StoredBlock(blockMock3, new BigInteger("0"), 0);
            doNothing().when(blockStoreMock).put(eq(storedBlock3), (StoredUndoableBlock) any());
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            doReturn(sha256Hash).when(blockMock3).getHash();
            Instant instant = Instant.now();
            List list = new ArrayList<>();
            Block block = new Block(0L, sha256Hash2Mock, sha256Hash2Mock2, instant, 0L, 0L, list);
            StoredBlock storedBlock4 = new StoredBlock(block, new BigInteger("0"), 0);
            List list2 = new ArrayList<>();
            List list3 = new ArrayList<>();
            TransactionOutputChanges transactionOutputChanges = new TransactionOutputChanges(list2, list3);
            //Act Statement(s)
            StoredBlock result = target.addToBlockStore(storedBlock4, blockMock4, transactionOutputChanges);
            //Assert statement(s)
            assertThat(result, equalTo(storedBlock3));
            verify(blockStoreMock).getChainHead();
            verify(blockStoreMock).getVerifiedChainHead();
            threading.verify(() -> Threading.lock(AbstractBlockChain.class), atLeast(1));
            verify(blockStoreMock).put(eq(storedBlock3), (StoredUndoableBlock) any());
            verify(blockMock3).getHash();
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
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 0);
            doReturn(storedBlock).when(blockStoreMock).getChainHead();
            StoredBlock storedBlock2 = new StoredBlock(blockMock2, new BigInteger("0"), 0);
            doReturn(storedBlock2).when(blockStoreMock).getVerifiedChainHead();
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(AbstractBlockChain.class)).thenReturn(null);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            FullPrunedBlockChain target = new FullPrunedBlockChain(networkParameters, walletMock, blockStoreMock);
            StoredBlock storedBlock3 = new StoredBlock(blockMock3, new BigInteger("0"), 0);
            doNothing().when(blockStoreMock).put(eq(storedBlock3), (StoredUndoableBlock) any());
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            doReturn(sha256Hash).when(blockMock3).getHash();
            StoredBlock storedBlock4 = new StoredBlock(blockMock4, new BigInteger("0"), 0);
            Instant instant = Instant.now();
            List list = new ArrayList<>();
            Block block = new Block(0L, sha256Hash2Mock, sha256Hash2Mock2, instant, 0L, 0L, list);
            //Act Statement(s)
            StoredBlock result = target.addToBlockStore(storedBlock4, block);
            //Assert statement(s)
            assertThat(result, equalTo(storedBlock3));
            verify(blockStoreMock).getChainHead();
            verify(blockStoreMock).getVerifiedChainHead();
            threading.verify(() -> Threading.lock(AbstractBlockChain.class), atLeast(1));
            verify(blockStoreMock).put(eq(storedBlock3), (StoredUndoableBlock) any());
            verify(blockMock3).getHash();
        }
    }

    //Sapient generated method id: ${0314f88c-cb95-3155-932e-a792c3da7d80}
    @Ignore()
    @Test()
    public void rollbackBlockStoreThrowsBlockStoreException() throws BlockStoreException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 0);
            doReturn(storedBlock).when(blockStoreMock).getChainHead();
            StoredBlock storedBlock2 = new StoredBlock(blockMock2, new BigInteger("0"), 0);
            doReturn(storedBlock2).when(blockStoreMock).getVerifiedChainHead();
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(AbstractBlockChain.class)).thenReturn(null);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            FullPrunedBlockChain target = new FullPrunedBlockChain(networkParameters, walletMock, blockStoreMock);
            BlockStoreException blockStoreException = new BlockStoreException("Unsupported");
            thrown.expect(BlockStoreException.class);
            thrown.expectMessage(blockStoreException.getMessage());
            //Act Statement(s)
            target.rollbackBlockStore(10);
            //Assert statement(s)
            verify(blockStoreMock).getChainHead();
            verify(blockStoreMock).getVerifiedChainHead();
            threading.verify(() -> Threading.lock(AbstractBlockChain.class), atLeast(1));
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
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 0);
            doReturn(storedBlock).when(blockStoreMock).getChainHead();
            doReturn(storedBlockMock).when(blockStoreMock).getVerifiedChainHead();
            ReentrantLock reentrantLock = Threading.lock(AbstractBlockChain.class);
            threading.when(() -> Threading.lock(AbstractBlockChain.class)).thenReturn(reentrantLock);
            FullPrunedBlockChain target = new FullPrunedBlockChain(networkParametersMock, walletMock, blockStoreMock);
            //Act Statement(s)
            boolean result = target.shouldVerifyTransactions();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            verify(blockStoreMock).getChainHead();
            verify(blockStoreMock).getVerifiedChainHead();
            threading.verify(() -> Threading.lock(AbstractBlockChain.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${87377b6c-91ab-3b5e-9e8b-3da5ccf3d885}
    @Ignore()
    @Test()
    public void connectTransactionsThrowsIllegalStateException() throws VerificationException, BlockStoreException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 0);
            doReturn(storedBlock).when(blockStoreMock).getChainHead();
            doReturn(storedBlockMock).when(blockStoreMock).getVerifiedChainHead();
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(false)).thenThrow(illegalStateException);
            FullPrunedBlockChain target = new FullPrunedBlockChain(networkParametersMock, walletMock, blockStoreMock);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.connectTransactions(0, blockMock2);
            //Assert statement(s)
            verify(blockStoreMock).getChainHead();
            verify(blockStoreMock).getVerifiedChainHead();
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
        }
    }

    //Sapient generated method id: ${22cf706f-8f89-3b61-97a1-aa5a3a43b55e}
    @Ignore()
    @Test()
    public void connectTransactions1ThrowsIllegalStateException() throws VerificationException, BlockStoreException, PrunedException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 0);
            doReturn(storedBlock).when(blockStoreMock).getChainHead();
            doReturn(storedBlockMock).when(blockStoreMock).getVerifiedChainHead();
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(false)).thenThrow(illegalStateException);
            FullPrunedBlockChain target = new FullPrunedBlockChain(networkParametersMock, walletMock, blockStoreMock);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.connectTransactions(storedBlockMock2);
            //Assert statement(s)
            verify(blockStoreMock).getChainHead();
            verify(blockStoreMock).getVerifiedChainHead();
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
        }
    }

    //Sapient generated method id: ${7575ce80-af64-3f1a-a416-bf3dd71a0c59}
    @Ignore()
    @Test()
    public void disconnectTransactionsThrowsIllegalStateException() throws PrunedException, BlockStoreException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 0);
            doReturn(storedBlock).when(blockStoreMock).getChainHead();
            doReturn(storedBlockMock).when(blockStoreMock).getVerifiedChainHead();
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(false)).thenThrow(illegalStateException);
            FullPrunedBlockChain target = new FullPrunedBlockChain(networkParametersMock, walletMock, blockStoreMock);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.disconnectTransactions(storedBlockMock2);
            //Assert statement(s)
            verify(blockStoreMock).getChainHead();
            verify(blockStoreMock).getVerifiedChainHead();
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
        }
    }

    //Sapient generated method id: ${0cd72b46-568b-337c-a5a2-1cd6a2c943e5}
    @Ignore()
    @Test()
    public void doSetChainHeadThrowsIllegalStateException() throws BlockStoreException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 0);
            doReturn(storedBlock).when(blockStoreMock).getChainHead();
            doReturn(storedBlockMock).when(blockStoreMock).getVerifiedChainHead();
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(false)).thenThrow(illegalStateException);
            FullPrunedBlockChain target = new FullPrunedBlockChain(networkParametersMock, walletMock, blockStoreMock);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.doSetChainHead(storedBlockMock2);
            //Assert statement(s)
            verify(blockStoreMock).getChainHead();
            verify(blockStoreMock).getVerifiedChainHead();
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
        }
    }

    //Sapient generated method id: ${4e9a924b-73ec-3b80-9550-47e0d8e75ec4}
    @Ignore()
    @Test()
    public void notSettingChainHeadTest() throws BlockStoreException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 0);
            doReturn(storedBlock).when(blockStoreMock).getChainHead();
            StoredBlock storedBlock2 = new StoredBlock(blockMock2, new BigInteger("0"), 0);
            doReturn(storedBlock2).when(blockStoreMock).getVerifiedChainHead();
            //TODO: Needs to return real value
            threading.when(() -> Threading.lock(AbstractBlockChain.class)).thenReturn(null);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            FullPrunedBlockChain target = new FullPrunedBlockChain(networkParameters, walletMock, blockStoreMock);
            doNothing().when(blockStoreMock).abortDatabaseBatchWrite();
            //Act Statement(s)
            target.notSettingChainHead();
            //Assert statement(s)
            verify(blockStoreMock).getChainHead();
            verify(blockStoreMock).getVerifiedChainHead();
            threading.verify(() -> Threading.lock(AbstractBlockChain.class), atLeast(1));
            verify(blockStoreMock).abortDatabaseBatchWrite();
        }
    }

    //Sapient generated method id: ${97d5d617-14e6-36b9-86f0-ca42c3d6fcde}
    @Ignore()
    @Test()
    public void getStoredBlockInCurrentScopeThrowsIllegalStateException() throws BlockStoreException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 0);
            doReturn(storedBlock).when(blockStoreMock).getChainHead();
            doReturn(storedBlockMock).when(blockStoreMock).getVerifiedChainHead();
            ReentrantLock reentrantLock = Threading.lock(AbstractBlockChain.class);
            threading.when(() -> Threading.lock(AbstractBlockChain.class)).thenReturn(reentrantLock);
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(false)).thenThrow(illegalStateException);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            FullPrunedBlockChain target = new FullPrunedBlockChain(networkParameters, walletMock, blockStoreMock);
            thrown.expect(IllegalStateException.class);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            //Act Statement(s)
            target.getStoredBlockInCurrentScope(sha256Hash);
            //Assert statement(s)
            verify(blockStoreMock).getChainHead();
            verify(blockStoreMock).getVerifiedChainHead();
            threading.verify(() -> Threading.lock(AbstractBlockChain.class), atLeast(1));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
        }
    }
}
