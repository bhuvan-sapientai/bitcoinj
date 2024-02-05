package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.store.BlockStoreException;
import org.junit.rules.ExpectedException;

import java.util.List;

import org.bitcoinj.base.Network;
import org.bitcoinj.wallet.Wallet;
import org.bitcoinj.utils.Threading;

import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.ArrayList;

import org.mockito.stubbing.Answer;
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

import org.junit.Ignore;

import java.util.Map;
import java.util.HashMap;
import java.nio.ByteBuffer;

import static org.hamcrest.Matchers.isA;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsInstanceOf.instanceOf;

public class BlockChainSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final BlockStore blockStoreMock = mock(BlockStore.class, "blockStore");

    private final Block blockMock = mock(Block.class);

    private final Block blockMock2 = mock(Block.class);

    private final Network networkMock = mock(Network.class);

    private final NetworkParameters networkParametersMock = mock(NetworkParameters.class);

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock2 = mock(Sha256Hash.class, "add_sha256Hash2");

    private final Wallet walletMock = mock(Wallet.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    private final StoredBlock storedBlockMock = mock(StoredBlock.class);

    private final StoredBlock storedPrevMock = mock(StoredBlock.class);

    private final Block blockMock3 = mock(Block.class);

    private final PartialMerkleTree partialMerkleTreeMock = mock(PartialMerkleTree.class);

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
            StoredBlock storedBlock = new StoredBlock(blockMock2, new BigInteger("0"), 1);
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
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(storedBlockMock).when(storedPrevMock).build(blockMock);
            StoredBlock storedBlock = new StoredBlock(blockMock2, new BigInteger("0"), 1);
            doReturn(storedBlock).when(blockStoreMock).getChainHead();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            BlockChain target = new BlockChain(networkMock, walletMock, blockStoreMock);
            doNothing().when(blockStoreMock).put(storedBlockMock);
            //Act Statement(s)
            StoredBlock result = target.addToBlockStore(storedPrevMock, blockMock);
            //Assert statement(s)
            assertThat(result, equalTo(storedBlockMock));
            verify(storedPrevMock).build(blockMock);
            verify(blockStoreMock).getChainHead();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(blockStoreMock).put(storedBlockMock);
        }
    }

    //Sapient generated method id: ${86b85864-54ef-3bde-b9e6-1827988cc0bf}
    @Ignore()
    @Test()
    public void rollbackBlockStoreWhenHeightLessThan0ThrowsIllegalArgumentException() throws BlockStoreException {
        /* Branches:
         * (height >= 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), -1);
            doReturn(storedBlock).when(blockStoreMock).getChainHead();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            BlockChain target = spy(new BlockChain(networkMock, walletMock, blockStoreMock));
            doReturn(0).when(target).getBestChainHeight();
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.rollbackBlockStore(-1);
            //Assert statement(s)
            verify(blockStoreMock).getChainHead();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            verify(target).getBestChainHeight();
        }
    }

    //Sapient generated method id: ${1c0ebbf4-3510-3785-b5d3-8a5f306034af}
    @Ignore()
    @Test()
    public void rollbackBlockStoreWhenHeightLessThanOrEqualsToCurrentHeightThrowsIllegalArgumentException() throws BlockStoreException {
        /* Branches:
         * (height >= 0) : true
         * (height <= currentHeight) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 1);
            doReturn(storedBlock).when(blockStoreMock).getChainHead();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            BlockChain target = spy(new BlockChain(networkMock, walletMock, blockStoreMock));
            doReturn(1).when(target).getBestChainHeight();
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.rollbackBlockStore(1);
            //Assert statement(s)
            verify(blockStoreMock).getChainHead();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            verify(target).getBestChainHeight();
        }
    }

    //Sapient generated method id: ${19f3e87d-98fe-36f9-8b92-1e25dba8ee3e}
    @Ignore()
    @Test()
    public void rollbackBlockStoreWhenHeightGreaterThanCurrentHeightThrowsIllegalArgumentException() throws BlockStoreException {
        /* Branches:
         * (height >= 0) : true
         * (height <= currentHeight) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 1);
            doReturn(storedBlock).when(blockStoreMock).getChainHead();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            BlockChain target = spy(new BlockChain(networkMock, walletMock, blockStoreMock));
            doReturn(1).when(target).getBestChainHeight();
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.rollbackBlockStore(2);
            //Assert statement(s)
            verify(blockStoreMock).getChainHead();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
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
            StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 1);
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
            StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 1);
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
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 1);
            doReturn(storedBlock).when(blockStoreMock).getChainHead();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            BlockChain target = new BlockChain(networkMock, walletMock, blockStoreMock);
            thrown.expect(UnsupportedOperationException.class);
            //Act Statement(s)
            target.connectTransactions(storedBlockMock);
            //Assert statement(s)
            verify(blockStoreMock).getChainHead();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
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
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 1);
            doReturn(storedBlock).when(blockStoreMock).getChainHead();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            BlockChain target = new BlockChain(networkMock, walletMock, blockStoreMock);
            thrown.expect(UnsupportedOperationException.class);
            //Act Statement(s)
            target.disconnectTransactions(storedBlockMock);
            //Assert statement(s)
            verify(blockStoreMock).getChainHead();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
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
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 1);
            doReturn(storedBlock).when(blockStoreMock).getChainHead();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            BlockChain target = new BlockChain(networkMock, walletMock, blockStoreMock);
            doNothing().when(blockStoreMock).setChainHead(storedBlockMock);
            //Act Statement(s)
            target.doSetChainHead(storedBlockMock);
            //Assert statement(s)
            verify(blockStoreMock).getChainHead();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
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
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 1);
            doReturn(storedBlock).when(blockStoreMock).getChainHead();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            BlockChain target = new BlockChain(networkMock, walletMock, blockStoreMock);
            doReturn(storedBlockMock).when(blockStoreMock).get(sha256HashMock);
            //Act Statement(s)
            StoredBlock result = target.getStoredBlockInCurrentScope(sha256HashMock);
            //Assert statement(s)
            assertThat(result, equalTo(storedBlockMock));
            verify(blockStoreMock).getChainHead();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(blockStoreMock).get(sha256HashMock);
        }
    }

    //Sapient generated method id: ${1c33d6ee-bf19-3936-b61a-23cd45248a4b}
    @Ignore()
    @Test()
    public void add1WhenSuccess() throws VerificationException, PrunedException, BlockStoreException {
        /* Branches:
         * (block.equals(getChainHead().getHeader())) : true  #  inside add method
         * (success) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        FilteredBlock blockMock = mock(FilteredBlock.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(blockMock2).when(blockMock).getBlockHeader();
            List<Sha256Hash> sha256HashList = new ArrayList<>();
            doReturn(sha256HashList).when(blockMock).getTransactionHashes();
            Map<Sha256Hash, Transaction> sha256HashTransactionMap = new HashMap<>();
            doReturn(sha256HashTransactionMap).when(blockMock).getAssociatedTransactions();
            doReturn(-68).when(blockMock).getTransactionCount();
            StoredBlock storedBlock = new StoredBlock(blockMock2, new BigInteger("0"), -68);
            doReturn(storedBlock).when(blockStoreMock).getChainHead();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            BlockChain target = new BlockChain(networkMock, walletMock, blockStoreMock);
            //Act Statement(s)
            boolean result = target.add(blockMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            verify(blockMock).getBlockHeader();
            verify(blockMock).getTransactionHashes();
            verify(blockMock).getAssociatedTransactions();
            verify(blockMock).getTransactionCount();
            verify(blockStoreMock).getChainHead();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${57385201-103c-3106-8043-8e453c5dc535}
    @Ignore()
    @Test()
    public void add1WhenDefaultBranchThrowsRuntimeException() throws VerificationException, PrunedException, BlockStoreException {
        /* Branches:
         * (block.equals(getChainHead().getHeader())) : true  #  inside add method
         * (branch expression (line 435)) : true  #  inside add method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        FilteredBlock blockMock = mock(FilteredBlock.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(blockMock2).when(blockMock).getBlockHeader();
            List<Sha256Hash> sha256HashList = new ArrayList<>();
            doReturn(sha256HashList).when(blockMock).getTransactionHashes();
            Map<Sha256Hash, Transaction> sha256HashTransactionMap = new HashMap<>();
            doReturn(sha256HashTransactionMap).when(blockMock).getAssociatedTransactions();
            StoredBlock storedBlock = new StoredBlock(blockMock2, new BigInteger("0"), 1);
            doReturn(storedBlock).when(blockStoreMock).getChainHead();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            BlockChain target = new BlockChain(networkMock, walletMock, blockStoreMock);
            thrown.expect(RuntimeException.class);
            thrown.expectCause(is(instanceOf(BlockStoreException.class)));
            //Act Statement(s)
            target.add(blockMock);
            //Assert statement(s)
            verify(blockMock).getBlockHeader();
            verify(blockMock).getTransactionHashes();
            verify(blockMock).getAssociatedTransactions();
            verify(blockStoreMock).getChainHead();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${034756bd-26cd-3140-9ed9-cd738a025b57}
    @Ignore()
    @Test()
    public void add1WhenTargetSignumLessThanOrEqualsTo0ThrowsVerificationException() throws VerificationException, PrunedException, BlockStoreException {
        /* Branches:
         * (block.equals(getChainHead().getHeader())) : false  #  inside add method
         * (tryConnecting) : true  #  inside add method
         * (orphanBlocks.containsKey(block.getHash())) : false  #  inside add method
         * (target.signum() <= 0) : true  #  inside add method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        FilteredBlock blockMock = mock(FilteredBlock.class, "add_filteredBlock1");
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(blockMock2).when(blockMock).getBlockHeader();
            doReturn(sha256HashMock).when(blockMock2).getHash();
            doReturn(new BigInteger("0")).when(blockMock2).getDifficultyTargetAsInteger();
            List<Sha256Hash> sha256HashList = new ArrayList<>();
            doReturn(sha256HashList).when(blockMock).getTransactionHashes();
            Map<Sha256Hash, Transaction> sha256HashTransactionMap = new HashMap<>();
            doReturn(sha256HashTransactionMap).when(blockMock).getAssociatedTransactions();
            doReturn(sha256HashMock2).when(blockMock).getHash();
            StoredBlock storedBlock = new StoredBlock(blockMock3, new BigInteger("0"), 0);
            doReturn(storedBlock).when(blockStoreMock).getChainHead();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            BlockChain target = new BlockChain(networkMock, walletMock, blockStoreMock);
            thrown.expect(VerificationException.class);
            //Act Statement(s)
            target.add(blockMock);
            //Assert statement(s)
            verify(blockMock).getBlockHeader();
            verify(blockMock2).getHash();
            verify(blockMock2).getDifficultyTargetAsInteger();
            verify(blockMock).getTransactionHashes();
            verify(blockMock).getAssociatedTransactions();
            verify(blockMock).getHash();
            verify(blockStoreMock).getChainHead();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${983cfd1c-b1a8-30ac-8498-acc23a4d8628}
    @Ignore()
    @Test()
    public void add1WhenTargetSignumGreaterThan0ThrowsNullPointerException() throws VerificationException, PrunedException, BlockStoreException {
        /* Branches:
         * (block.equals(getChainHead().getHeader())) : false  #  inside add method
         * (tryConnecting) : true  #  inside add method
         * (orphanBlocks.containsKey(block.getHash())) : false  #  inside add method
         * (target.signum() <= 0) : false  #  inside add method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        FilteredBlock blockMock = mock(FilteredBlock.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(blockMock2).when(blockMock).getBlockHeader();
            doReturn(sha256HashMock).when(blockMock2).getHash();
            doReturn(new BigInteger("2147483647")).when(blockMock2).getDifficultyTargetAsInteger();
            List<Sha256Hash> sha256HashList = new ArrayList<>();
            doReturn(sha256HashList).when(blockMock).getTransactionHashes();
            Map<Sha256Hash, Transaction> sha256HashTransactionMap = new HashMap<>();
            doReturn(sha256HashTransactionMap).when(blockMock).getAssociatedTransactions();
            StoredBlock storedBlock = new StoredBlock(blockMock3, new BigInteger("0"), 1);
            doReturn(storedBlock).when(blockStoreMock).getChainHead();
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParameters2);
            BlockChain target = new BlockChain(networkMock, walletMock, blockStoreMock);
            thrown.expect(NullPointerException.class);
            //Act Statement(s)
            target.add(blockMock);
            //Assert statement(s)
            verify(blockMock).getBlockHeader();
            verify(blockMock2).getHash();
            verify(blockMock2).getDifficultyTargetAsInteger();
            verify(blockMock).getTransactionHashes();
            verify(blockMock).getAssociatedTransactions();
            verify(blockStoreMock).getChainHead();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${a8dfcca3-ca19-3318-8d26-cfcc99eba2e4}
    @Ignore()
    @Test()
    public void add1WhenDefaultBranchThrowsVerificationException() throws VerificationException, PrunedException, BlockStoreException {
        /* Branches:
         * (block.equals(getChainHead().getHeader())) : false  #  inside add method
         * (tryConnecting) : true  #  inside add method
         * (orphanBlocks.containsKey(block.getHash())) : false  #  inside add method
         * (target.signum() <= 0) : true  #  inside add method
         * (branch expression (line 435)) : true  #  inside add method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        FilteredBlock blockMock = mock(FilteredBlock.class, "add_filteredBlock1");
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(blockMock2).when(blockMock).getBlockHeader();
            doReturn(sha256HashMock).when(blockMock2).getHash();
            doReturn(new BigInteger("0")).when(blockMock2).getDifficultyTargetAsInteger();
            List<Sha256Hash> sha256HashList = new ArrayList<>();
            doReturn(sha256HashList).when(blockMock).getTransactionHashes();
            Map<Sha256Hash, Transaction> sha256HashTransactionMap = new HashMap<>();
            doReturn(sha256HashTransactionMap).when(blockMock).getAssociatedTransactions();
            doReturn(sha256HashMock2).when(blockMock).getHash();
            StoredBlock storedBlock = new StoredBlock(blockMock3, new BigInteger("0"), 0);
            doReturn(storedBlock).when(blockStoreMock).getChainHead();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            BlockChain target = new BlockChain(networkMock, walletMock, blockStoreMock);
            thrown.expect(VerificationException.class);
            //Act Statement(s)
            target.add(blockMock);
            //Assert statement(s)
            verify(blockMock).getBlockHeader();
            verify(blockMock2).getHash();
            verify(blockMock2).getDifficultyTargetAsInteger();
            verify(blockMock).getTransactionHashes();
            verify(blockMock).getAssociatedTransactions();
            verify(blockMock).getHash();
            verify(blockStoreMock).getChainHead();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${01580886-8dfd-300c-b4f4-8c5d02e20498}
    @Ignore()
    @Test()
    public void add1WhenTargetSignumLessThanOrEqualsTo0AndDefaultBranchThrowsRuntimeException() throws VerificationException, PrunedException, BlockStoreException {
        /* Branches:
         * (block.equals(getChainHead().getHeader())) : false  #  inside add method
         * (tryConnecting) : true  #  inside add method
         * (orphanBlocks.containsKey(block.getHash())) : false  #  inside add method
         * (target.signum() <= 0) : true  #  inside add method
         * (branch expression (line 441)) : true  #  inside add method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        FilteredBlock blockMock = mock(FilteredBlock.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(blockMock2).when(blockMock).getBlockHeader();
            doReturn(sha256HashMock).when(blockMock2).getHash();
            doReturn(new BigInteger("0")).when(blockMock2).getDifficultyTargetAsInteger();
            List<Sha256Hash> sha256HashList = new ArrayList<>();
            doReturn(sha256HashList).when(blockMock).getTransactionHashes();
            Map<Sha256Hash, Transaction> sha256HashTransactionMap = new HashMap<>();
            doReturn(sha256HashTransactionMap).when(blockMock).getAssociatedTransactions();
            StoredBlock storedBlock = new StoredBlock(blockMock3, new BigInteger("0"), 0);
            doReturn(storedBlock).when(blockStoreMock).getChainHead();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            BlockChain target = new BlockChain(networkMock, walletMock, blockStoreMock);
            thrown.expect(RuntimeException.class);
            thrown.expectCause(is(instanceOf(BlockStoreException.class)));
            //Act Statement(s)
            target.add(blockMock);
            //Assert statement(s)
            verify(blockMock).getBlockHeader();
            verify(blockMock2).getHash();
            verify(blockMock2).getDifficultyTargetAsInteger();
            verify(blockMock).getTransactionHashes();
            verify(blockMock).getAssociatedTransactions();
            verify(blockStoreMock).getChainHead();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
        }
    }
}
