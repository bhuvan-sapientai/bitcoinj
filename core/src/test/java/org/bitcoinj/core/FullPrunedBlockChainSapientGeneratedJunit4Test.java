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
import org.mockito.stubbing.Answer;

import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.is;

public class FullPrunedBlockChainSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final FullPrunedBlockStore blockStoreMock = mock(FullPrunedBlockStore.class, "{}");

    private final Block blockMock = mock(Block.class);

    private final Block blockMock2 = mock(Block.class);

    private final Block blockMock3 = mock(Block.class);

    private final Block blockMock4 = mock(Block.class);

    private final NetworkParameters networkParametersMock = mock(NetworkParameters.class);

    private final Sha256Hash sha256Hash2Mock = mock(Sha256Hash.class);

    private final Sha256Hash sha256Hash2Mock2 = mock(Sha256Hash.class);

    private final StoredBlock storedBlockMock = mock(StoredBlock.class);

    private final StoredBlock storedBlockMock2 = mock(StoredBlock.class);

    private final Wallet walletMock = mock(Wallet.class, "{}");

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    private final StoredBlock storedPrevMock = mock(StoredBlock.class);

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
            doReturn(null).when(blockStoreMock).getVerifiedChainHead();
            ReentrantLock reentrantLock = Threading.lock(AbstractBlockChain.class);
            threading.when(() -> Threading.lock(AbstractBlockChain.class)).thenReturn(reentrantLock);
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
            doReturn(null).when(blockStoreMock).getVerifiedChainHead();
            ReentrantLock reentrantLock = Threading.lock(AbstractBlockChain.class);
            threading.when(() -> Threading.lock(AbstractBlockChain.class)).thenReturn(reentrantLock);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            FullPrunedBlockChain target = new FullPrunedBlockChain(networkParameters, walletMock, blockStoreMock);
            //Act Statement(s)
            boolean result = target.shouldVerifyTransactions();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            verify(blockStoreMock).getChainHead();
            verify(blockStoreMock).getVerifiedChainHead();
            threading.verify(() -> Threading.lock(AbstractBlockChain.class), atLeast(1));
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
            StoredBlock storedBlock2 = new StoredBlock(blockMock2, new BigInteger("0"), 0);
            doReturn(storedBlock2).when(blockStoreMock).getVerifiedChainHead();
            ReentrantLock reentrantLock = new ReentrantLock();
            threading.when(() -> Threading.lock(AbstractBlockChain.class)).thenReturn(reentrantLock);
            preconditions.when(() -> Preconditions.checkState(false)).thenAnswer((Answer<Void>) invocation -> null);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            FullPrunedBlockChain target = new FullPrunedBlockChain(networkParameters, walletMock, blockStoreMock);
            doReturn(null).when(blockStoreMock).getOnceUndoableStoredBlock((Sha256Hash) any());
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            //Act Statement(s)
            StoredBlock result = target.getStoredBlockInCurrentScope(sha256Hash);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            verify(blockStoreMock).getChainHead();
            verify(blockStoreMock).getVerifiedChainHead();
            threading.verify(() -> Threading.lock(AbstractBlockChain.class), atLeast(1));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            verify(blockStoreMock).getOnceUndoableStoredBlock((Sha256Hash) any());
        }
    }
}
