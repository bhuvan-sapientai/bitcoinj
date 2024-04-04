package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.store.BlockStoreException;
import org.junit.rules.ExpectedException;

import java.util.List;

import org.bitcoinj.wallet.Wallet;
import org.bitcoinj.store.FullPrunedBlockStore;
import org.bitcoinj.base.Sha256Hash;

import java.math.BigInteger;
import java.util.ArrayList;
import java.time.Instant;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class FullPrunedBlockChainSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final FullPrunedBlockStore blockStoreMock = mock(FullPrunedBlockStore.class, "blockStore");

    private final Block blockMock = mock(Block.class);

    private final Block blockMock2 = mock(Block.class);

    private final NetworkParameters networkParametersMock = mock(NetworkParameters.class);

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    private final StoredBlock storedBlockMock = mock(StoredBlock.class);

    private final StoredBlock storedBlockMock2 = mock(StoredBlock.class);

    private final StoredBlock storedPrevMock = mock(StoredBlock.class);

    private final Wallet walletMock = mock(Wallet.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${bc04315e-267a-3fb2-a511-9c50ca882015}, hash: 96927F9449F3229988D47D12E13BDD8D
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
        StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 0);
        doReturn(storedBlock).when(storedPrevMock).build(blockMock2);
        doReturn(sha256HashMock).when(blockMock).getHash();
        Block blockMock3 = mock(Block.class);
        StoredBlock storedBlock2 = new StoredBlock(blockMock3, new BigInteger("0"), 1);
        doReturn(storedBlock2).when(blockStoreMock).getChainHead();
        doReturn(storedBlockMock).when(blockStoreMock).getVerifiedChainHead();
        FullPrunedBlockChain target = new FullPrunedBlockChain(networkParametersMock, walletMock, blockStoreMock);
        doNothing().when(blockStoreMock).put(eq(storedBlock), (StoredUndoableBlock) any());
        TransactionOutputChanges transactionOutputChangesMock = mock(TransactionOutputChanges.class);
        //Act Statement(s)
        StoredBlock result = target.addToBlockStore(storedPrevMock, blockMock2, transactionOutputChangesMock);
        //Assert statement(s)
        assertThat(result, equalTo(storedBlock));
        verify(storedPrevMock).build(blockMock2);
        verify(blockMock, atLeast(1)).getHash();
        verify(blockStoreMock).getChainHead();
        verify(blockStoreMock).getVerifiedChainHead();
        verify(blockStoreMock).put(eq(storedBlock), (StoredUndoableBlock) any());
    }

    //Sapient generated method id: ${35082fa7-0a80-32e3-be99-db25ad779ca9}, hash: 0243F8395374203078B60B5FBD7FF648
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
        StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 0);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        Instant instant = Instant.ofEpochSecond(1700000000);
        List<Transaction> transactionList = new ArrayList<>();
        Block block = new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, transactionList);
        doReturn(storedBlock).when(storedPrevMock).build(block);
        Sha256Hash sha256HashMock3 = mock(Sha256Hash.class);
        doReturn(sha256HashMock3).when(blockMock).getHash();
        Block block2Mock = mock(Block.class);
        StoredBlock storedBlock2 = new StoredBlock(block2Mock, new BigInteger("0"), 1);
        doReturn(storedBlock2).when(blockStoreMock).getChainHead();
        doReturn(storedBlockMock).when(blockStoreMock).getVerifiedChainHead();
        FullPrunedBlockChain target = new FullPrunedBlockChain(networkParametersMock, walletMock, blockStoreMock);
        doNothing().when(blockStoreMock).put(eq(storedBlock), (StoredUndoableBlock) any());
        //Act Statement(s)
        StoredBlock result = target.addToBlockStore(storedPrevMock, block);
        //Assert statement(s)
        assertThat(result, equalTo(storedBlock));
        verify(storedPrevMock).build(block);
        verify(blockMock, atLeast(1)).getHash();
        verify(blockStoreMock).getChainHead();
        verify(blockStoreMock).getVerifiedChainHead();
        verify(blockStoreMock).put(eq(storedBlock), (StoredUndoableBlock) any());
    }

    //Sapient generated method id: ${0314f88c-cb95-3155-932e-a792c3da7d80}, hash: DC68EC7D46A8203C05A3C0441ED45D4F
    @Ignore()
    @Test()
    public void rollbackBlockStoreThrowsBlockStoreException() throws BlockStoreException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: versionTally - Method: initialize
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 1);
        doReturn(storedBlock).when(blockStoreMock).getChainHead();
        doReturn(storedBlockMock).when(blockStoreMock).getVerifiedChainHead();
        FullPrunedBlockChain target = new FullPrunedBlockChain(networkParametersMock, walletMock, blockStoreMock);
        BlockStoreException blockStoreException = new BlockStoreException("Unsupported");
        thrown.expect(BlockStoreException.class);
        thrown.expectMessage(blockStoreException.getMessage());
        //Act Statement(s)
        target.rollbackBlockStore(0);
        //Assert statement(s)
        verify(blockStoreMock).getChainHead();
        verify(blockStoreMock).getVerifiedChainHead();
    }

    //Sapient generated method id: ${e67a2cba-47be-35d4-923a-1210950c3d42}, hash: EEBA147AC784596FB7AAD9DEF958B922
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
        StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 1);
        doReturn(storedBlock).when(blockStoreMock).getChainHead();
        doReturn(storedBlockMock).when(blockStoreMock).getVerifiedChainHead();
        FullPrunedBlockChain target = new FullPrunedBlockChain(networkParametersMock, walletMock, blockStoreMock);
        //Act Statement(s)
        boolean result = target.shouldVerifyTransactions();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(blockStoreMock).getChainHead();
        verify(blockStoreMock).getVerifiedChainHead();
    }

    //Sapient generated method id: ${87377b6c-91ab-3b5e-9e8b-3da5ccf3d885}, hash: A38557E65711867981E27C1ED782FAAF
    @Ignore()
    @Test()
    public void connectTransactionsThrowsIllegalStateException() throws VerificationException, BlockStoreException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: versionTally - Method: initialize
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 1);
        doReturn(storedBlock).when(blockStoreMock).getChainHead();
        doReturn(storedBlockMock).when(blockStoreMock).getVerifiedChainHead();
        FullPrunedBlockChain target = new FullPrunedBlockChain(networkParametersMock, walletMock, blockStoreMock);
        thrown.expect(IllegalStateException.class);
        //Act Statement(s)
        target.connectTransactions(0, blockMock2);
        //Assert statement(s)
        verify(blockStoreMock).getChainHead();
        verify(blockStoreMock).getVerifiedChainHead();
    }

    //Sapient generated method id: ${22cf706f-8f89-3b61-97a1-aa5a3a43b55e}, hash: 4A417275F54D158AD3233D3B7283E7E2
    @Ignore()
    @Test()
    public void connectTransactions1ThrowsIllegalStateException() throws VerificationException, BlockStoreException, PrunedException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: versionTally - Method: initialize
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 1);
        doReturn(storedBlock).when(blockStoreMock).getChainHead();
        doReturn(storedBlockMock).when(blockStoreMock).getVerifiedChainHead();
        FullPrunedBlockChain target = new FullPrunedBlockChain(networkParametersMock, walletMock, blockStoreMock);
        thrown.expect(IllegalStateException.class);
        //Act Statement(s)
        target.connectTransactions(storedBlockMock2);
        //Assert statement(s)
        verify(blockStoreMock).getChainHead();
        verify(blockStoreMock).getVerifiedChainHead();
    }

    //Sapient generated method id: ${7575ce80-af64-3f1a-a416-bf3dd71a0c59}, hash: C241EF1D5BE705A4C5E709BB135B5E8F
    @Ignore()
    @Test()
    public void disconnectTransactionsThrowsIllegalStateException() throws PrunedException, BlockStoreException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: versionTally - Method: initialize
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 1);
        doReturn(storedBlock).when(blockStoreMock).getChainHead();
        doReturn(storedBlockMock).when(blockStoreMock).getVerifiedChainHead();
        FullPrunedBlockChain target = new FullPrunedBlockChain(networkParametersMock, walletMock, blockStoreMock);
        thrown.expect(IllegalStateException.class);
        //Act Statement(s)
        target.disconnectTransactions(storedBlockMock2);
        //Assert statement(s)
        verify(blockStoreMock).getChainHead();
        verify(blockStoreMock).getVerifiedChainHead();
    }

    //Sapient generated method id: ${0cd72b46-568b-337c-a5a2-1cd6a2c943e5}, hash: 0855B8F4B2A3CEC55A8E201E12203CA8
    @Ignore()
    @Test()
    public void doSetChainHeadThrowsIllegalStateException() throws BlockStoreException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: versionTally - Method: initialize
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 1);
        doReturn(storedBlock).when(blockStoreMock).getChainHead();
        doReturn(storedBlockMock).when(blockStoreMock).getVerifiedChainHead();
        FullPrunedBlockChain target = new FullPrunedBlockChain(networkParametersMock, walletMock, blockStoreMock);
        thrown.expect(IllegalStateException.class);
        //Act Statement(s)
        target.doSetChainHead(storedBlockMock2);
        //Assert statement(s)
        verify(blockStoreMock).getChainHead();
        verify(blockStoreMock).getVerifiedChainHead();
    }

    //Sapient generated method id: ${4e9a924b-73ec-3b80-9550-47e0d8e75ec4}, hash: BFFA8B989FA1030A84106852D93F60AA
    @Ignore()
    @Test()
    public void notSettingChainHeadTest() throws BlockStoreException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: versionTally - Method: initialize
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 1);
        doReturn(storedBlock).when(blockStoreMock).getChainHead();
        doReturn(storedBlockMock).when(blockStoreMock).getVerifiedChainHead();
        FullPrunedBlockChain target = new FullPrunedBlockChain(networkParametersMock, walletMock, blockStoreMock);
        doNothing().when(blockStoreMock).abortDatabaseBatchWrite();
        //Act Statement(s)
        target.notSettingChainHead();
        //Assert statement(s)
        verify(blockStoreMock).getChainHead();
        verify(blockStoreMock).getVerifiedChainHead();
        verify(blockStoreMock).abortDatabaseBatchWrite();
    }

    //Sapient generated method id: ${97d5d617-14e6-36b9-86f0-ca42c3d6fcde}, hash: 2373B4CF0E8B5C3045EA8A1551A523C5
    @Ignore()
    @Test()
    public void getStoredBlockInCurrentScopeThrowsIllegalStateException() throws BlockStoreException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: versionTally - Method: initialize
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 1);
        doReturn(storedBlock).when(blockStoreMock).getChainHead();
        doReturn(storedBlockMock).when(blockStoreMock).getVerifiedChainHead();
        FullPrunedBlockChain target = new FullPrunedBlockChain(networkParametersMock, walletMock, blockStoreMock);
        thrown.expect(IllegalStateException.class);
        //Act Statement(s)
        target.getStoredBlockInCurrentScope(sha256HashMock);
        //Assert statement(s)
        verify(blockStoreMock).getChainHead();
        verify(blockStoreMock).getVerifiedChainHead();
    }
}
