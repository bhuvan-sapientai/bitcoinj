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
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

import org.bitcoinj.base.internal.Preconditions;
import org.bitcoinj.store.BlockStore;
import org.bitcoinj.base.Sha256Hash;
import org.mockito.MockedStatic;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;

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

    private final Sha256Hash sha256HashMock2 = mock(Sha256Hash.class, "add_sha256Hash2");

    private final StoredBlock storedBlockMock = mock(StoredBlock.class);

    private final StoredBlock storedPrevMock = mock(StoredBlock.class);

    private final Wallet walletMock = mock(Wallet.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${bc04315e-267a-3fb2-a511-9c50ca882015}, hash: 52C3C5B27C19FD729D9345007A023301
    @Ignore()
    @Test()
    public void addToBlockStore1Test() throws BlockStoreException, VerificationException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: versionTally - Method: initialize
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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

    //Sapient generated method id: ${35082fa7-0a80-32e3-be99-db25ad779ca9}, hash: 69D76EBD9EFAA51642FD88F0E09B1F52
    @Ignore()
    @Test()
    public void addToBlockStoreTest() throws BlockStoreException, VerificationException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: versionTally - Method: initialize
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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

    //Sapient generated method id: ${19f3e87d-98fe-36f9-8b92-1e25dba8ee3e}, hash: 73D77F43D92F541F44966EBCB931146E
    @Ignore()
    @Test()
    public void rollbackBlockStoreWhenHeightGreaterThanCurrentHeightThrowsIllegalArgumentException() throws BlockStoreException {
        /* Branches:
         * (height >= 0) : true
         * (height <= currentHeight) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: versionTally - Method: initialize
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 1);
            doReturn(storedBlock).when(blockStoreMock).getChainHead();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            BlockChain target = spy(new BlockChain(networkMock, walletMock, blockStoreMock));
            doReturn(1).when(target).getBestChainHeight();
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.rollbackBlockStore(2);
            //Assert statement(s)
            verify(blockStoreMock).getChainHead();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(target).getBestChainHeight();
        }
    }

    //Sapient generated method id: ${6ed28154-a75c-3043-807a-b41aff74066c}, hash: 265120D5851AEA08CED5631B69013F7A
    @Ignore()
    @Test()
    public void rollbackBlockStoreWhenHeightEqualsCurrentHeight() throws BlockStoreException {
        /* Branches:
         * (height >= 0) : true
         * (height <= currentHeight) : true
         * (height == currentHeight) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: versionTally - Method: initialize
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 1);
            doReturn(storedBlock).when(blockStoreMock).getChainHead();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            BlockChain target = spy(new BlockChain(networkMock, walletMock, blockStoreMock));
            doReturn(1).when(target).getBestChainHeight();
            //Act Statement(s)
            target.rollbackBlockStore(1);
            //Assert statement(s)
            verify(blockStoreMock).getChainHead();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(target).getBestChainHeight();
        }
    }

    //Sapient generated method id: ${77c59e2f-06ef-39b9-94ff-89a6b3ecce25}, hash: C4C99976F5C204774C2EFD920F91F96E
    @Ignore()
    @Test()
    public void rollbackBlockStoreWhenNewChainHeadGetHeightNotGreaterThanHeight() throws BlockStoreException {
        /* Branches:
         * (height >= 0) : true
         * (height <= currentHeight) : true
         * (height == currentHeight) : false
         * (newChainHead.getHeight() > height) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: versionTally - Method: initialize
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 1);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            BlockChain target = spy(new BlockChain(networkMock, walletMock, blockStoreMock));
            doReturn(2).when(target).getBestChainHeight();
            StoredBlock storedBlock2 = new StoredBlock(blockMock2, new BigInteger("0"), 1);
            doReturn(storedBlock, storedBlock2).when(blockStoreMock).getChainHead();
            doNothing().when(blockStoreMock).put(storedBlock2);
            doNothing().when(target).setChainHead(storedBlock2);
            //Act Statement(s)
            target.rollbackBlockStore(1);
            //Assert statement(s)
            verify(blockStoreMock, times(2)).getChainHead();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(target).getBestChainHeight();
            verify(blockStoreMock).put(storedBlock2);
            verify(target).setChainHead(storedBlock2);
        }
    }

    //Sapient generated method id: ${06560f57-68b5-38cf-a8d1-734726696122}, hash: 849D05D4CCA12628DF4814E97F7797FA
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
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: versionTally - Method: initialize
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        StoredBlock storedBlockMock2 = mock(StoredBlock.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 1);
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            BlockChain target = spy(new BlockChain(networkMock, walletMock, blockStoreMock));
            doReturn(2).when(target).getBestChainHeight();
            doReturn(storedBlock, storedBlockMock).when(blockStoreMock).getChainHead();
            doReturn(2).when(storedBlockMock).getHeight();
            doReturn(storedBlockMock2).when(storedBlockMock).getPrev(blockStoreMock);
            BlockStoreException blockStoreException = new BlockStoreException("Unreachable height");
            thrown.expect(BlockStoreException.class);
            thrown.expectMessage(blockStoreException.getMessage());
            //Act Statement(s)
            target.rollbackBlockStore(1);
            //Assert statement(s)
            verify(blockStoreMock, times(2)).getChainHead();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(target).getBestChainHeight();
            verify(storedBlockMock).getHeight();
            verify(storedBlockMock).getPrev(blockStoreMock);
        }
    }

    //Sapient generated method id: ${e67a2cba-47be-35d4-923a-1210950c3d42}, hash: 3F36980514E8B7B4E80508611FEA3BB3
    @Ignore()
    @Test()
    public void shouldVerifyTransactionsTest() throws BlockStoreException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: versionTally - Method: initialize
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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

    //Sapient generated method id: ${7f486874-04ba-32c6-b8e5-83d67c531dc7}, hash: B49C8E9EDCB7966F6A43C035CC646A53
    @Ignore()
    @Test()
    public void connectTransactionsThrowsUnsupportedOperationException() throws BlockStoreException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: versionTally - Method: initialize
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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

    //Sapient generated method id: ${12d11670-162a-3e56-bd2d-7c78da9492c4}, hash: 97F4785609A1E4EB71EDF9E6DAAD5654
    @Ignore()
    @Test()
    public void connectTransactions1ThrowsUnsupportedOperationException() throws BlockStoreException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: versionTally - Method: initialize
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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

    //Sapient generated method id: ${402cf2c3-5dcd-3d92-9a11-0dbd5296783c}, hash: 013E38499E0648833910F420601F702F
    @Ignore()
    @Test()
    public void disconnectTransactionsThrowsUnsupportedOperationException() throws BlockStoreException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: versionTally - Method: initialize
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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

    //Sapient generated method id: ${af42f18e-3b1a-3a62-bdc5-19fb8c4d64c8}, hash: AD905E8FF296D15134BE9B57CD883CF4
    @Ignore()
    @Test()
    public void doSetChainHeadTest() throws BlockStoreException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: versionTally - Method: initialize
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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

    //Sapient generated method id: ${326cd9cd-35c7-3898-b79d-073c4c9b8ae1}, hash: 8243F9E13BFA1A6D6C52646F920BFC61
    @Ignore()
    @Test()
    public void getStoredBlockInCurrentScopeTest() throws BlockStoreException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: versionTally - Method: initialize
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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

    //Sapient generated method id: ${1c33d6ee-bf19-3936-b61a-23cd45248a4b}, hash: EC917593F606B581283D1B262BAF4226
    @Ignore()
    @Test()
    public void add1WhenSuccess() throws VerificationException, PrunedException, BlockStoreException {
        /* Branches:
         * (block.equals(getChainHead().getHeader())) : true  #  inside add method
         * (success) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: versionTally - Method: initialize
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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

    //Sapient generated method id: ${57385201-103c-3106-8043-8e453c5dc535}, hash: 30B7B8B75C36EE86FCD30EDF2FFC7025
    @Ignore()
    @Test()
    public void add1WhenDefaultBranchThrowsRuntimeException() throws VerificationException, PrunedException, BlockStoreException {
        /* Branches:
         * (block.equals(getChainHead().getHeader())) : true  #  inside add method
         * (branch expression (line 435)) : true  #  inside add method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: versionTally - Method: initialize
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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

    //Sapient generated method id: ${034756bd-26cd-3140-9ed9-cd738a025b57}, hash: F4542F4BE5FF5D3758ADA00EC8646113
    @Ignore()
    @Test()
    public void add1WhenTargetSignumLessThanOrEqualsTo0ThrowsVerificationException() throws VerificationException, PrunedException, BlockStoreException {
        /* Branches:
         * (block.equals(getChainHead().getHeader())) : false  #  inside add method
         * (tryConnecting) : true  #  inside add method
         * (orphanBlocks.containsKey(block.getHash())) : false  #  inside add method
         * (target.signum() <= 0) : true  #  inside add method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: versionTally - Method: initialize
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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

    //Sapient generated method id: ${983cfd1c-b1a8-30ac-8498-acc23a4d8628}, hash: 9DD395A196B0D26B631092AD3C9BB0CD
    @Ignore()
    @Test()
    public void add1WhenTargetSignumGreaterThan0ThrowsNullPointerException() throws VerificationException, PrunedException, BlockStoreException {
        /* Branches:
         * (block.equals(getChainHead().getHeader())) : false  #  inside add method
         * (tryConnecting) : true  #  inside add method
         * (orphanBlocks.containsKey(block.getHash())) : false  #  inside add method
         * (target.signum() <= 0) : false  #  inside add method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: versionTally - Method: initialize
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        FilteredBlock blockMock = mock(FilteredBlock.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(blockMock2).when(blockMock).getBlockHeader();
            doReturn(sha256HashMock).when(blockMock2).getHash();
            doReturn(new BigInteger("1")).when(blockMock2).getDifficultyTargetAsInteger();
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

    //Sapient generated method id: ${a8dfcca3-ca19-3318-8d26-cfcc99eba2e4}, hash: 59637C75C105330F545481309C644408
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
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: versionTally - Method: initialize
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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

    //Sapient generated method id: ${01580886-8dfd-300c-b4f4-8c5d02e20498}, hash: D3BDC9CD7347022D1575E19FEFA77410
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
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: versionTally - Method: initialize
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
