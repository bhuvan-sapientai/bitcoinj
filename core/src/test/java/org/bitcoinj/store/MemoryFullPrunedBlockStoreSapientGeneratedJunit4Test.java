package org.bitcoinj.store;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.mockito.InjectMocks;
import org.junit.After;
import org.junit.Test;
import org.bitcoinj.core.VerificationException;
import org.bitcoinj.core.UTXOProviderException;
import org.junit.rules.ExpectedException;
import org.bitcoinj.base.Network;

import java.util.List;

import org.bitcoinj.base.ScriptType;
import org.bitcoinj.core.Transaction;
import org.bitcoinj.core.Block;
import org.bitcoinj.core.StoredUndoableBlock;

import java.util.LinkedList;

import org.bitcoinj.crypto.ECKey;
import org.mockito.MockitoAnnotations;

import java.math.BigInteger;

import org.bitcoinj.core.NetworkParameters;

import java.util.ArrayList;

import org.bitcoinj.base.Address;
import org.bitcoinj.base.Sha256Hash;
import org.bitcoinj.core.UTXO;
import org.bitcoinj.core.StoredBlock;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInRelativeOrder;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.Matchers.isA;

import org.junit.Ignore;

import static org.hamcrest.Matchers.notNullValue;

import org.bitcoinj.base.Coin;
import org.bitcoinj.script.Script;

import java.nio.ByteBuffer;

import org.bitcoinj.core.TransactionOutputChanges;

import java.time.Instant;

public class MemoryFullPrunedBlockStoreSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final TransactionalHashMap<Sha256Hash, MemoryFullPrunedBlockStore.StoredBlockAndWasUndoableFlag> blockMapMock = mock(TransactionalHashMap.class, "blockMap");

    private final TransactionalMultiKeyHashMap<Sha256Hash, Integer, StoredUndoableBlock> fullBlockMapMock = mock(TransactionalMultiKeyHashMap.class, "fullBlockMap");

    private final TransactionalHashMap<StoredTransactionOutPoint, UTXO> transactionOutputMapMock = mock(TransactionalHashMap.class, "transactionOutputMap");

    private final NetworkParameters paramsMock = mock(NetworkParameters.class, "params");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private MemoryFullPrunedBlockStore target;

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    @After()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${ff39932c-bae7-30e3-b342-800b85c0323e}
    @Ignore()
    @Test()
    public void putTest() throws BlockStoreException, VerificationException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        Block blockMock = mock(Block.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        Instant instant = Instant.now();
        List list = new ArrayList<>();
        Block block = new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, list);
        doReturn(block).when(blockMock).cloneAsHeader();
        Block blockMock2 = mock(Block.class);
        doReturn(new BigInteger("0")).when(blockMock2).getWork();
        Sha256Hash sha256HashMock3 = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock4 = mock(Sha256Hash.class);
        Instant instant2 = Instant.now();
        List list2 = new ArrayList<>();
        Block block2 = new Block(0L, sha256HashMock3, sha256HashMock4, instant2, 0L, 0L, list2);
        doReturn(blockMock, blockMock2, block2).when(paramsMock2).getGenesisBlock();
        target = new MemoryFullPrunedBlockStore(paramsMock2, 1);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doNothing().when(blockMapMock).put((Sha256Hash) any(), (MemoryFullPrunedBlockStore.StoredBlockAndWasUndoableFlag) any());
        Sha256Hash sha256HashMock5 = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock6 = mock(Sha256Hash.class);
        Instant instant3 = Instant.now();
        List list3 = new ArrayList<>();
        Block block3 = new Block(0L, sha256HashMock5, sha256HashMock6, instant3, 0L, 0L, list3);
        StoredBlock storedBlock = new StoredBlock(block3, new BigInteger("0"), 0);

        //Act Statement(s)
        target.put(storedBlock);

        //Assert statement(s)
        verify(paramsMock2, times(3)).getGenesisBlock();
        verify(blockMock).cloneAsHeader();
        verify(blockMock2).getWork();
        verify(blockMapMock, atLeast(2)).put((Sha256Hash) any(), (MemoryFullPrunedBlockStore.StoredBlockAndWasUndoableFlag) any());
    }

    //Sapient generated method id: ${7436b751-59ae-33bc-8c63-64de023baa27}
    @Ignore()
    @Test()
    public void put1Test() throws BlockStoreException, VerificationException {
        /**
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: org.bitcoinj.core.Block
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        Block blockMock = mock(Block.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        Instant instant = Instant.now();
        List list = new ArrayList<>();
        Block block = new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, list);
        doReturn(block).when(blockMock).cloneAsHeader();
        Block blockMock2 = mock(Block.class);
        doReturn(new BigInteger("0")).when(blockMock2).getWork();
        Sha256Hash sha256HashMock3 = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock4 = mock(Sha256Hash.class);
        Instant instant2 = Instant.now();
        List list2 = new ArrayList<>();
        Block block2 = new Block(0L, sha256HashMock3, sha256HashMock4, instant2, 0L, 0L, list2);
        doReturn(blockMock, blockMock2, block2).when(paramsMock2).getGenesisBlock();
        target = new MemoryFullPrunedBlockStore(paramsMock2, -1);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doNothing().when(fullBlockMapMock).put((Sha256Hash) any(), eq(0), (StoredUndoableBlock) any());
        doNothing().when(blockMapMock).put((Sha256Hash) any(), (MemoryFullPrunedBlockStore.StoredBlockAndWasUndoableFlag) any());
        doNothing().when(fullBlockMapMock).removeByMultiKey(-1);
        StoredBlock storedBlock = new StoredBlock(block, new BigInteger("0"), 0);
        Sha256Hash sha256Hash = block2.getHash();
        List<Transaction> transactionList = new LinkedList<>();
        StoredUndoableBlock storedUndoableBlock = new StoredUndoableBlock(sha256Hash, transactionList);

        //Act Statement(s)
        target.put(storedBlock, storedUndoableBlock);

        //Assert statement(s)
        verify(paramsMock2, times(3)).getGenesisBlock();
        verify(blockMock).cloneAsHeader();
        verify(blockMock2).getWork();
        verify(fullBlockMapMock, atLeast(2)).put((Sha256Hash) any(), eq(0), (StoredUndoableBlock) any());
        verify(blockMapMock, atLeast(2)).put((Sha256Hash) any(), (MemoryFullPrunedBlockStore.StoredBlockAndWasUndoableFlag) any());
        verify(fullBlockMapMock).removeByMultiKey(-1);
    }

    //Sapient generated method id: ${03ba4252-2c4a-386e-a2f7-5702f422fe9b}
    @Ignore()
    @Test()
    public void getWhenStoredBlockIsNull() throws BlockStoreException, VerificationException {
        /* Branches:
         * (storedBlock == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        Block blockMock = mock(Block.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        Instant instant = Instant.now();
        List list = new ArrayList<>();
        Block block = new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, list);
        doReturn(block).when(blockMock).cloneAsHeader();
        Block blockMock2 = mock(Block.class);
        doReturn(new BigInteger("0")).when(blockMock2).getWork();
        Sha256Hash sha256HashMock3 = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock4 = mock(Sha256Hash.class);
        Instant instant2 = Instant.now();
        List list2 = new ArrayList<>();
        Block block2 = new Block(0L, sha256HashMock3, sha256HashMock4, instant2, 0L, 0L, list2);
        doReturn(blockMock, blockMock2, block2).when(paramsMock2).getGenesisBlock();
        target = new MemoryFullPrunedBlockStore(paramsMock2, 0);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doNothing().when(blockMapMock).put((Sha256Hash) any(), (MemoryFullPrunedBlockStore.StoredBlockAndWasUndoableFlag) any());
        doReturn(null).when(blockMapMock).get((Sha256Hash) any());
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);

        //Act Statement(s)
        StoredBlock result = target.get(sha256Hash);

        //Assert statement(s)
        assertThat(result, is(nullValue()));
        verify(paramsMock2, times(3)).getGenesisBlock();
        verify(blockMock).cloneAsHeader();
        verify(blockMock2).getWork();
        verify(blockMapMock).put((Sha256Hash) any(), (MemoryFullPrunedBlockStore.StoredBlockAndWasUndoableFlag) any());
        verify(blockMapMock).get((Sha256Hash) any());
    }

    //Sapient generated method id: ${0b0f7add-a55d-320b-8097-6ec6ca57477b}
    @Ignore()
    @Test()
    public void getWhenStoredBlockIsNotNull() throws BlockStoreException, VerificationException {
        /* Branches:
         * (storedBlock == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        Block blockMock = mock(Block.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        Instant instant = Instant.now();
        List list = new ArrayList<>();
        Block block = new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, list);
        doReturn(block).when(blockMock).cloneAsHeader();
        Block blockMock2 = mock(Block.class);
        doReturn(new BigInteger("0")).when(blockMock2).getWork();
        Sha256Hash sha256HashMock3 = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock4 = mock(Sha256Hash.class);
        Instant instant2 = Instant.now();
        List list2 = new ArrayList<>();
        Block block2 = new Block(0L, sha256HashMock3, sha256HashMock4, instant2, 0L, 0L, list2);
        doReturn(blockMock, blockMock2, block2).when(paramsMock2).getGenesisBlock();
        target = new MemoryFullPrunedBlockStore(paramsMock2, -1);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);

        //Act Statement(s)
        StoredBlock result = target.get(sha256Hash);

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
        verify(paramsMock2, times(3)).getGenesisBlock();
        verify(blockMock).cloneAsHeader();
        verify(blockMock2).getWork();
    }

    //Sapient generated method id: ${6b80996b-befe-3d79-a976-4c7d91700855}
    @Ignore()
    @Test()
    public void getOnceUndoableStoredBlockWhenStoredBlockIsNotNull() throws BlockStoreException, VerificationException {
        /* Branches:
         * (storedBlock != null && storedBlock.wasUndoable) : true
         * (storedBlock != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        Block blockMock = mock(Block.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        Instant instant = Instant.now();
        List list = new ArrayList<>();
        Block block = new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, list);
        doReturn(block).when(blockMock).cloneAsHeader();
        Block blockMock2 = mock(Block.class);
        doReturn(new BigInteger("0")).when(blockMock2).getWork();
        Sha256Hash sha256HashMock3 = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock4 = mock(Sha256Hash.class);
        Instant instant2 = Instant.now();
        List list2 = new ArrayList<>();
        Block block2 = new Block(0L, sha256HashMock3, sha256HashMock4, instant2, 0L, 0L, list2);
        doReturn(blockMock, blockMock2, block2).when(paramsMock2).getGenesisBlock();
        target = new MemoryFullPrunedBlockStore(paramsMock2, 0);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);

        //Act Statement(s)
        StoredBlock result = target.getOnceUndoableStoredBlock(sha256Hash);

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
        verify(paramsMock2, times(3)).getGenesisBlock();
        verify(blockMock).cloneAsHeader();
        verify(blockMock2).getWork();
    }

    //Sapient generated method id: ${bc9a8220-48d1-3dfa-a8fb-e91f63c4a341}
    @Ignore()
    @Test()
    public void getOnceUndoableStoredBlockWhenStoredBlockIsNull() throws BlockStoreException, VerificationException {
        /* Branches:
         * (storedBlock != null && storedBlock.wasUndoable) : true
         * (storedBlock != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        Block blockMock = mock(Block.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        Instant instant = Instant.now();
        List list = new ArrayList<>();
        Block block = new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, list);
        doReturn(block).when(blockMock).cloneAsHeader();
        Block blockMock2 = mock(Block.class);
        doReturn(new BigInteger("0")).when(blockMock2).getWork();
        Sha256Hash sha256HashMock3 = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock4 = mock(Sha256Hash.class);
        Instant instant2 = Instant.now();
        List list2 = new ArrayList<>();
        Block block2 = new Block(0L, sha256HashMock3, sha256HashMock4, instant2, 0L, 0L, list2);
        doReturn(blockMock, blockMock2, block2).when(paramsMock2).getGenesisBlock();
        target = new MemoryFullPrunedBlockStore(paramsMock2, 0);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);

        //Act Statement(s)
        StoredBlock result = target.getOnceUndoableStoredBlock(sha256Hash);

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
        verify(paramsMock2, times(3)).getGenesisBlock();
        verify(blockMock).cloneAsHeader();
        verify(blockMock2).getWork();
    }

    //Sapient generated method id: ${9d97f007-cb27-32f1-9498-70190e47b03f}
    @Ignore()
    @Test()
    public void getUndoBlockTest() throws BlockStoreException, VerificationException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        Block blockMock = mock(Block.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        Instant instant = Instant.now();
        List list = new ArrayList<>();
        Block block = new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, list);
        doReturn(block).when(blockMock).cloneAsHeader();
        Block blockMock2 = mock(Block.class);
        doReturn(new BigInteger("0")).when(blockMock2).getWork();
        Sha256Hash sha256HashMock3 = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock4 = mock(Sha256Hash.class);
        Instant instant2 = Instant.now();
        List list2 = new ArrayList<>();
        Block block2 = new Block(0L, sha256HashMock3, sha256HashMock4, instant2, 0L, 0L, list2);
        doReturn(blockMock, blockMock2, block2).when(paramsMock2).getGenesisBlock();
        target = new MemoryFullPrunedBlockStore(paramsMock2, -1);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);

        //Act Statement(s)
        StoredUndoableBlock result = target.getUndoBlock(sha256Hash);
        Sha256Hash sha256Hash2Mock = mock(Sha256Hash.class);
        TransactionOutputChanges transactionOutputChangesMock = mock(TransactionOutputChanges.class);
        StoredUndoableBlock storedUndoableBlock = new StoredUndoableBlock(sha256Hash2Mock, transactionOutputChangesMock);

        //Assert statement(s)
        assertThat(result, equalTo(storedUndoableBlock));
        verify(paramsMock2, times(3)).getGenesisBlock();
        verify(blockMock).cloneAsHeader();
        verify(blockMock2).getWork();
    }

    //Sapient generated method id: ${5bcf99c3-253c-36a4-a43f-4c7faaa5f46e}
    @Test()
    public void getChainHeadTest() throws BlockStoreException, VerificationException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        Block blockMock = mock(Block.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        Instant instant = Instant.now();
        List list = new ArrayList<>();
        Block block = new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, list);
        doReturn(block).when(blockMock).cloneAsHeader();
        Block blockMock2 = mock(Block.class);
        doReturn(new BigInteger("0")).when(blockMock2).getWork();
        Sha256Hash sha256HashMock3 = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock4 = mock(Sha256Hash.class);
        Instant instant2 = Instant.now();
        List list2 = new ArrayList<>();
        Block block2 = new Block(0L, sha256HashMock3, sha256HashMock4, instant2, 0L, 0L, list2);
        doReturn(blockMock, blockMock2, block2).when(paramsMock2).getGenesisBlock();
        target = new MemoryFullPrunedBlockStore(paramsMock2, 0);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);

        //Act Statement(s)
        StoredBlock result = target.getChainHead();
        StoredBlock storedBlock = new StoredBlock(block, new BigInteger("0"), 0);

        //Assert statement(s)
        assertThat(result, equalTo(storedBlock));
        verify(paramsMock2, times(3)).getGenesisBlock();
        verify(blockMock).cloneAsHeader();
        verify(blockMock2).getWork();
    }

    //Sapient generated method id: ${56524823-4654-36ac-b950-899d8270ea6b}
    @Test()
    public void setChainHeadTest() throws BlockStoreException, VerificationException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class, "1000000");
        doReturn(null).when(paramsMock2).getGenesisBlock();
        target = new MemoryFullPrunedBlockStore(paramsMock2, 0);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        StoredBlock storedBlockMock = mock(StoredBlock.class);

        //Act Statement(s)
        target.setChainHead(storedBlockMock);

        //Assert statement(s)
        verify(paramsMock2, times(2)).getGenesisBlock();
    }

    //Sapient generated method id: ${2dbd9de2-a481-3b92-8352-2399069d4bcf}
    @Test()
    public void getVerifiedChainHeadTest() throws BlockStoreException, VerificationException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        Block blockMock = mock(Block.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        Instant instant = Instant.now();
        List list = new ArrayList<>();
        Block block = new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, list);
        doReturn(block).when(blockMock).cloneAsHeader();
        Block blockMock2 = mock(Block.class);
        doReturn(new BigInteger("1")).when(blockMock2).getWork();
        Sha256Hash sha256HashMock3 = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock4 = mock(Sha256Hash.class);
        Instant instant2 = Instant.now();
        List list2 = new ArrayList<>();
        Block block2 = new Block(0L, sha256HashMock3, sha256HashMock4, instant2, 0L, 0L, list2);
        doReturn(blockMock, blockMock2, block2).when(paramsMock2).getGenesisBlock();
        target = new MemoryFullPrunedBlockStore(paramsMock2, 0);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);

        //Act Statement(s)
        StoredBlock result = target.getVerifiedChainHead();
        StoredBlock storedBlock = new StoredBlock(block, new BigInteger("1"), 0);

        //Assert statement(s)
        assertThat(result, equalTo(storedBlock));
        verify(paramsMock2, times(3)).getGenesisBlock();
        verify(blockMock).cloneAsHeader();
        verify(blockMock2).getWork();
    }

    //Sapient generated method id: ${ca96ce46-44d6-395a-a2ab-c43a2aecf10a}
    @Ignore()
    @Test()
    public void setVerifiedChainHeadWhenThisChainHeadGetHeightNotLessThanChainHeadGetHeight() throws BlockStoreException, VerificationException {
        /* Branches:
         * (this.chainHead.getHeight() < chainHead.getHeight()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        Block blockMock = mock(Block.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        Instant instant = Instant.now();
        List list = new ArrayList<>();
        Block block = new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, list);
        doReturn(block).when(blockMock).cloneAsHeader();
        Block blockMock2 = mock(Block.class);
        doReturn(new BigInteger("0")).when(blockMock2).getWork();
        Sha256Hash sha256HashMock3 = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock4 = mock(Sha256Hash.class);
        Instant instant2 = Instant.now();
        List list2 = new ArrayList<>();
        Block block2 = new Block(0L, sha256HashMock3, sha256HashMock4, instant2, 0L, 0L, list2);
        doReturn(blockMock, blockMock2, block2).when(paramsMock2).getGenesisBlock();
        target = new MemoryFullPrunedBlockStore(paramsMock2, 0);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doNothing().when(fullBlockMapMock).put((Sha256Hash) any(), eq(0), (StoredUndoableBlock) any());
        doNothing().when(fullBlockMapMock).removeByMultiKey(-1);
        StoredBlock storedBlock = new StoredBlock(block, new BigInteger("0"), 0);

        //Act Statement(s)
        target.setVerifiedChainHead(storedBlock);

        //Assert statement(s)
        verify(paramsMock2, times(3)).getGenesisBlock();
        verify(blockMock).cloneAsHeader();
        verify(blockMock2).getWork();
        verify(fullBlockMapMock).put((Sha256Hash) any(), eq(0), (StoredUndoableBlock) any());
        verify(fullBlockMapMock, times(2)).removeByMultiKey(-1);
    }

    //Sapient generated method id: ${4338ea80-df41-3c09-b3eb-b0476a460c1f}
    @Test()
    public void closeTest() throws VerificationException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        Block blockMock = mock(Block.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        Instant instant = Instant.now();
        List list = new ArrayList<>();
        Block block = new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, list);
        doReturn(block).when(blockMock).cloneAsHeader();
        Block blockMock2 = mock(Block.class);
        doReturn(new BigInteger("0")).when(blockMock2).getWork();
        Sha256Hash sha256HashMock3 = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock4 = mock(Sha256Hash.class);
        Instant instant2 = Instant.now();
        List list2 = new ArrayList<>();
        Block block2 = new Block(0L, sha256HashMock3, sha256HashMock4, instant2, 0L, 0L, list2);
        doReturn(blockMock, blockMock2, block2).when(paramsMock2).getGenesisBlock();
        target = new MemoryFullPrunedBlockStore(paramsMock2, 0);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);

        //Act Statement(s)
        target.close();

        //Assert statement(s)
        verify(paramsMock2, times(3)).getGenesisBlock();
        verify(blockMock).cloneAsHeader();
        verify(blockMock2).getWork();
    }

    //Sapient generated method id: ${a71d3a46-2bc0-3d43-9c90-cbad75804657}
    @Test()
    public void getTransactionOutputTest() throws BlockStoreException, VerificationException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        Block blockMock = mock(Block.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        Instant instant = Instant.now();
        List list = new ArrayList<>();
        Block block = new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, list);
        doReturn(block).when(blockMock).cloneAsHeader();
        Block blockMock2 = mock(Block.class);
        doReturn(new BigInteger("0")).when(blockMock2).getWork();
        Sha256Hash sha256HashMock3 = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock4 = mock(Sha256Hash.class);
        Instant instant2 = Instant.now();
        List list2 = new ArrayList<>();
        Block block2 = new Block(0L, sha256HashMock3, sha256HashMock4, instant2, 0L, 0L, list2);
        doReturn(blockMock, blockMock2, block2).when(paramsMock2).getGenesisBlock();
        target = new MemoryFullPrunedBlockStore(paramsMock2, -1);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);

        //Act Statement(s)
        UTXO result = target.getTransactionOutput(sha256Hash, 0L);

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
        verify(paramsMock2, times(3)).getGenesisBlock();
        verify(blockMock).cloneAsHeader();
        verify(blockMock2).getWork();
    }

    //Sapient generated method id: ${c543da65-20dc-37d1-9685-f0658125d1df}
    @Test()
    public void addUnspentTransactionOutputTest() throws BlockStoreException, VerificationException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        Block blockMock = mock(Block.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        Instant instant = Instant.now();
        List list = new ArrayList<>();
        Block block = new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, list);
        doReturn(block).when(blockMock).cloneAsHeader();
        Block blockMock2 = mock(Block.class);
        doReturn(new BigInteger("0")).when(blockMock2).getWork();
        Sha256Hash sha256HashMock3 = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock4 = mock(Sha256Hash.class);
        Instant instant2 = Instant.now();
        List list2 = new ArrayList<>();
        Block block2 = new Block(0L, sha256HashMock3, sha256HashMock4, instant2, 0L, 0L, list2);
        doReturn(blockMock, blockMock2, block2).when(paramsMock2).getGenesisBlock();
        target = new MemoryFullPrunedBlockStore(paramsMock2, 1);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        UTXO uTXOMock = mock(UTXO.class, "BigInteger");
        doNothing().when(transactionOutputMapMock).put((StoredTransactionOutPoint) any(), eq(uTXOMock));

        //Act Statement(s)
        target.addUnspentTransactionOutput(uTXOMock);

        //Assert statement(s)
        verify(paramsMock2, times(3)).getGenesisBlock();
        verify(blockMock).cloneAsHeader();
        verify(blockMock2).getWork();
        verify(transactionOutputMapMock).put((StoredTransactionOutPoint) any(), eq(uTXOMock));
    }

    //Sapient generated method id: ${031358af-d8f6-39ae-bf57-22ca87304273}
    @Test()
    public void removeUnspentTransactionOutputWhenTransactionOutputMapRemoveNewStoredTransactionOutPointOutIsNThrowsBlockStoreException() throws BlockStoreException, VerificationException {
        /* Branches:
         * (transactionOutputMap.remove(new StoredTransactionOutPoint(out)) == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        Block blockMock = mock(Block.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        Instant instant = Instant.now();
        List list = new ArrayList<>();
        Block block = new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, list);
        doReturn(block).when(blockMock).cloneAsHeader();
        Block blockMock2 = mock(Block.class);
        doReturn(new BigInteger("0")).when(blockMock2).getWork();
        Sha256Hash sha256HashMock3 = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock4 = mock(Sha256Hash.class);
        Instant instant2 = Instant.now();
        List list2 = new ArrayList<>();
        Block block2 = new Block(0L, sha256HashMock3, sha256HashMock4, instant2, 0L, 0L, list2);
        doReturn(blockMock, blockMock2, block2).when(paramsMock2).getGenesisBlock();
        target = new MemoryFullPrunedBlockStore(paramsMock2, -1);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(transactionOutputMapMock).remove((StoredTransactionOutPoint) any());
        BlockStoreException blockStoreException = new BlockStoreException("Tried to remove a UTXO from MemoryFullPrunedBlockStore that it didn't have!");
        thrown.expect(BlockStoreException.class);
        thrown.expectMessage(blockStoreException.getMessage());
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        Coin coinMock = mock(Coin.class);
        Script scriptMock = mock(Script.class);
        UTXO uTXO = new UTXO(sha256Hash, 0L, coinMock, 0, false, scriptMock);

        //Act Statement(s)
        target.removeUnspentTransactionOutput(uTXO);

        //Assert statement(s)
        verify(paramsMock2, times(3)).getGenesisBlock();
        verify(blockMock).cloneAsHeader();
        verify(blockMock2).getWork();
        verify(transactionOutputMapMock).remove((StoredTransactionOutPoint) any());
    }

    //Sapient generated method id: ${12010d29-0e03-3fc5-9dea-cf159f904964}
    @Ignore()
    @Test()
    public void removeUnspentTransactionOutputWhenTransactionOutputMapRemoveNewStoredTransactionOutPointOutIsNotNull() throws BlockStoreException, VerificationException {
        /* Branches:
         * (transactionOutputMap.remove(new StoredTransactionOutPoint(out)) == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class, "1000000");
        doReturn(null).when(paramsMock2).getGenesisBlock();
        target = new MemoryFullPrunedBlockStore(paramsMock2, 0);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        UTXO uTXOMock = mock(UTXO.class, "0");

        //Act Statement(s)
        target.removeUnspentTransactionOutput(uTXOMock);

        //Assert statement(s)
        verify(paramsMock2, times(2)).getGenesisBlock();
    }

    //Sapient generated method id: ${b04b432f-9970-393b-8e0a-3f02a386d3be}
    @Ignore()
    @Test()
    public void beginDatabaseBatchWriteTest() throws BlockStoreException, VerificationException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        Block blockMock = mock(Block.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        Instant instant = Instant.now();
        List list = new ArrayList<>();
        Block block = new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, list);
        doReturn(block).when(blockMock).cloneAsHeader();
        Block blockMock2 = mock(Block.class);
        doReturn(new BigInteger("0")).when(blockMock2).getWork();
        Sha256Hash sha256HashMock3 = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock4 = mock(Sha256Hash.class);
        Instant instant2 = Instant.now();
        List list2 = new ArrayList<>();
        Block block2 = new Block(0L, sha256HashMock3, sha256HashMock4, instant2, 0L, 0L, list2);
        doReturn(blockMock, blockMock2, block2).when(paramsMock2).getGenesisBlock();
        target = new MemoryFullPrunedBlockStore(paramsMock2, 1);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doNothing().when(fullBlockMapMock).put((Sha256Hash) any(), eq(0), (StoredUndoableBlock) any());
        doNothing().when(blockMapMock).put((Sha256Hash) any(), (MemoryFullPrunedBlockStore.StoredBlockAndWasUndoableFlag) any());
        doNothing().when(fullBlockMapMock).removeByMultiKey(-1);
        doNothing().when(blockMapMock).beginDatabaseBatchWrite();
        doNothing().when(fullBlockMapMock).BeginTransaction();
        doNothing().when(transactionOutputMapMock).beginDatabaseBatchWrite();

        //Act Statement(s)
        target.beginDatabaseBatchWrite();

        //Assert statement(s)
        verify(paramsMock2, times(3)).getGenesisBlock();
        verify(blockMock).cloneAsHeader();
        verify(blockMock2).getWork();
        verify(fullBlockMapMock).put((Sha256Hash) any(), eq(0), (StoredUndoableBlock) any());
        verify(blockMapMock).put((Sha256Hash) any(), (MemoryFullPrunedBlockStore.StoredBlockAndWasUndoableFlag) any());
        verify(fullBlockMapMock).removeByMultiKey(-1);
        verify(blockMapMock).beginDatabaseBatchWrite();
        verify(fullBlockMapMock).BeginTransaction();
        verify(transactionOutputMapMock).beginDatabaseBatchWrite();
    }

    //Sapient generated method id: ${bb5143f8-c902-349e-b57f-69694a4394f7}
    @Ignore()
    @Test()
    public void abortDatabaseBatchWriteTest() throws BlockStoreException, VerificationException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        Block blockMock = mock(Block.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        Instant instant = Instant.now();
        List list = new ArrayList<>();
        Block block = new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, list);
        doReturn(block).when(blockMock).cloneAsHeader();
        Block blockMock2 = mock(Block.class);
        doReturn(new BigInteger("0")).when(blockMock2).getWork();
        Sha256Hash sha256HashMock3 = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock4 = mock(Sha256Hash.class);
        Instant instant2 = Instant.now();
        List list2 = new ArrayList<>();
        Block block2 = new Block(0L, sha256HashMock3, sha256HashMock4, instant2, 0L, 0L, list2);
        doReturn(blockMock, blockMock2, block2).when(paramsMock2).getGenesisBlock();
        target = new MemoryFullPrunedBlockStore(paramsMock2, -1);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doNothing().when(fullBlockMapMock).put((Sha256Hash) any(), eq(0), (StoredUndoableBlock) any());
        doNothing().when(blockMapMock).put((Sha256Hash) any(), (MemoryFullPrunedBlockStore.StoredBlockAndWasUndoableFlag) any());
        doNothing().when(fullBlockMapMock).removeByMultiKey(-1);
        doNothing().when(blockMapMock).abortDatabaseBatchWrite();
        doNothing().when(fullBlockMapMock).AbortTransaction();
        doNothing().when(transactionOutputMapMock).abortDatabaseBatchWrite();

        //Act Statement(s)
        target.abortDatabaseBatchWrite();

        //Assert statement(s)
        verify(paramsMock2, times(3)).getGenesisBlock();
        verify(blockMock).cloneAsHeader();
        verify(blockMock2).getWork();
        verify(fullBlockMapMock).put((Sha256Hash) any(), eq(0), (StoredUndoableBlock) any());
        verify(blockMapMock).put((Sha256Hash) any(), (MemoryFullPrunedBlockStore.StoredBlockAndWasUndoableFlag) any());
        verify(fullBlockMapMock).removeByMultiKey(-1);
        verify(blockMapMock).abortDatabaseBatchWrite();
        verify(fullBlockMapMock).AbortTransaction();
        verify(transactionOutputMapMock).abortDatabaseBatchWrite();
    }

    //Sapient generated method id: ${a1882c70-f754-3fee-9a2d-d0daf8ab55c2}
    @Test()
    public void hasUnspentOutputsWhenGetTransactionOutputHashIIsNotNull() throws BlockStoreException, VerificationException {
        /* Branches:
         * (i < numOutputs) : true
         * (getTransactionOutput(hash, i) != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        Block blockMock = mock(Block.class);
        Block blockMock2 = mock(Block.class);
        doReturn(blockMock2).when(blockMock).cloneAsHeader();
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        doReturn(sha256HashMock).when(blockMock2).getHash();
        Block blockMock3 = mock(Block.class);
        doReturn(new BigInteger("0")).when(blockMock3).getWork();
        Block blockMock4 = mock(Block.class);
        doReturn(blockMock, blockMock3, blockMock4).when(paramsMock2).getGenesisBlock();
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        doReturn(sha256HashMock2).when(blockMock4).getHash();
        target = spy(new MemoryFullPrunedBlockStore(paramsMock2, 1));
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        UTXO uTXOMock = mock(UTXO.class);
        Sha256Hash sha256HashMock3 = mock(Sha256Hash.class);
        doReturn(uTXOMock).when(target).getTransactionOutput(sha256HashMock3, 0L);

        //Act Statement(s)
        boolean result = target.hasUnspentOutputs(sha256HashMock3, 1);

        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(paramsMock2, times(3)).getGenesisBlock();
        verify(blockMock).cloneAsHeader();
        verify(blockMock2).getHash();
        verify(blockMock3).getWork();
        verify(blockMock4).getHash();
        verify(target).getTransactionOutput(sha256HashMock3, 0L);
    }

    //Sapient generated method id: ${2648eb0e-30ea-3a47-88e3-482c193a1f0c}
    @Test()
    public void hasUnspentOutputsWhenGetTransactionOutputHashIIsNull() throws BlockStoreException, VerificationException {
        /* Branches:
         * (i < numOutputs) : true
         * (getTransactionOutput(hash, i) != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        Block blockMock = mock(Block.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        Instant instant = Instant.now();
        List list = new ArrayList<>();
        Block block = new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, list);
        doReturn(block).when(blockMock).cloneAsHeader();
        Block blockMock2 = mock(Block.class);
        doReturn(new BigInteger("0")).when(blockMock2).getWork();
        Sha256Hash sha256HashMock3 = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock4 = mock(Sha256Hash.class);
        Instant instant2 = Instant.now();
        List list2 = new ArrayList<>();
        Block block2 = new Block(0L, sha256HashMock3, sha256HashMock4, instant2, 0L, 0L, list2);
        doReturn(blockMock, blockMock2, block2).when(paramsMock2).getGenesisBlock();
        target = spy(new MemoryFullPrunedBlockStore(paramsMock2, 0));
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        UTXO uTXOMock = mock(UTXO.class);
        doReturn(uTXOMock).when(target).getTransactionOutput((Sha256Hash) any(), eq(0L));
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);

        //Act Statement(s)
        boolean result = target.hasUnspentOutputs(sha256Hash, 1);

        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(paramsMock2, times(3)).getGenesisBlock();
        verify(blockMock).cloneAsHeader();
        verify(blockMock2).getWork();
        verify(target).getTransactionOutput((Sha256Hash) any(), eq(0L));
    }

    //Sapient generated method id: ${b444423d-8062-3e94-803b-01f5c4c4e2cc}
    @Test()
    public void networkTest() throws VerificationException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class, "{}");
        doReturn(null).when(paramsMock2).getGenesisBlock();
        target = new MemoryFullPrunedBlockStore(paramsMock2, 0);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Network networkMock = mock(Network.class, "UnknownObjectContent{target='org.bitcoinj.base.Network', onlyPojoFunctions=false, builderPattern=false}");
        doReturn(networkMock).when(paramsMock).network();

        //Act Statement(s)
        Network result = target.network();

        //Assert statement(s)
        assertThat(result, equalTo(networkMock));
        verify(paramsMock2, times(2)).getGenesisBlock();
        verify(paramsMock).network();
    }

    //Sapient generated method id: ${8c3664bf-bf1a-3a95-be3e-42d245f74c2e}
    @Test()
    public void getChainHeadHeightTest() throws UTXOProviderException, VerificationException, BlockStoreException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        Block blockMock = mock(Block.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        Instant instant = Instant.now();
        List list = new ArrayList<>();
        Block block = new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, list);
        doReturn(block).when(blockMock).cloneAsHeader();
        Block blockMock2 = mock(Block.class);
        doReturn(new BigInteger("0")).when(blockMock2).getWork();
        Sha256Hash sha256HashMock3 = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock4 = mock(Sha256Hash.class);
        Instant instant2 = Instant.now();
        List list2 = new ArrayList<>();
        Block block2 = new Block(0L, sha256HashMock3, sha256HashMock4, instant2, 0L, 0L, list2);
        doReturn(blockMock, blockMock2, block2).when(paramsMock2).getGenesisBlock();
        target = spy(new MemoryFullPrunedBlockStore(paramsMock2, -1));
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Block block3Mock = mock(Block.class);
        StoredBlock storedBlock = new StoredBlock(block3Mock, new BigInteger("0"), 0);
        doReturn(storedBlock).when(target).getVerifiedChainHead();

        //Act Statement(s)
        int result = target.getChainHeadHeight();

        //Assert statement(s)
        assertThat(result, equalTo(0));
        verify(paramsMock2, times(3)).getGenesisBlock();
        verify(blockMock).cloneAsHeader();
        verify(blockMock2).getWork();
        verify(target).getVerifiedChainHead();
    }

    //Sapient generated method id: ${d1191563-4036-3daf-a378-006d53de7d1c}
    @Ignore()
    @Test()
    public void getChainHeadHeightWhenCaughtBlockStoreExceptionThrowsUTXOProviderException() throws UTXOProviderException, VerificationException, BlockStoreException {
        /* Branches:
         * (catch-exception (BlockStoreException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        Block blockMock = mock(Block.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        Instant instant = Instant.now();
        List list = new ArrayList<>();
        Block block = new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, list);
        doReturn(block).when(blockMock).cloneAsHeader();
        Block blockMock2 = mock(Block.class);
        doReturn(new BigInteger("1")).when(blockMock2).getWork();
        Sha256Hash sha256HashMock3 = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock4 = mock(Sha256Hash.class);
        Instant instant2 = Instant.now();
        List list2 = new ArrayList<>();
        Block block2 = new Block(0L, sha256HashMock3, sha256HashMock4, instant2, 0L, 0L, list2);
        doReturn(blockMock, blockMock2, block2).when(paramsMock2).getGenesisBlock();
        target = spy(new MemoryFullPrunedBlockStore(paramsMock2, 0));
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Block block3Mock = mock(Block.class);
        StoredBlock storedBlock = new StoredBlock(block3Mock, new BigInteger("0"), 0);
        doReturn(storedBlock).when(target).getVerifiedChainHead();
        thrown.expect(UTXOProviderException.class);
        thrown.expectCause(isA(BlockStoreException.class));

        //Act Statement(s)
        target.getChainHeadHeight();

        //Assert statement(s)
        verify(paramsMock2, times(3)).getGenesisBlock();
        verify(blockMock).cloneAsHeader();
        verify(blockMock2).getWork();
        verify(target).getVerifiedChainHead();
    }

    //Sapient generated method id: ${a37136f9-5646-31a5-bd71-58a74058e7bc}
    @Ignore()
    @Test()
    public void getOpenTransactionOutputsWhenOutputGetAddressEqualsAddressToString() throws UTXOProviderException, VerificationException {
        /* Branches:
         * (for-each(outputsList)) : true
         * (for-each(keys)) : true
         * (output.getAddress().equals(address.toString())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECKey keyMock = mock(ECKey.class);
        Address addressMock = mock(Address.class, "getOpenTransactionOutputs_address1");
        Network networkMock = mock(Network.class);
        doReturn(addressMock).when(keyMock).toAddress(ScriptType.P2PKH, networkMock);
        NetworkParameters paramsMock2 = mock(NetworkParameters.class);
        Block blockMock = mock(Block.class);
        Block blockMock2 = mock(Block.class);
        doReturn(blockMock2).when(blockMock).cloneAsHeader();
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        doReturn(sha256HashMock).when(blockMock2).getHash();
        Block blockMock3 = mock(Block.class);
        doReturn(new BigInteger("0")).when(blockMock3).getWork();
        Block blockMock4 = mock(Block.class);
        doReturn(blockMock, blockMock3, blockMock4).when(paramsMock2).getGenesisBlock();
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        doReturn(sha256HashMock2).when(blockMock4).getHash();
        target = new MemoryFullPrunedBlockStore(paramsMock2, 1);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(networkMock).when(paramsMock2).network();
        List<ECKey> eCKeyList = new ArrayList<>();
        eCKeyList.add(keyMock);

        //Act Statement(s)
        List<UTXO> result = target.getOpenTransactionOutputs(eCKeyList);
        UTXO uTXOMock = mock(UTXO.class);
        List<UTXO> uTXOResultList = new ArrayList<>();
        uTXOResultList.add(uTXOMock);

        //Assert statement(s)
        assertThat(result.size(), equalTo(uTXOResultList.size()));
        assertThat(result, containsInRelativeOrder(uTXOResultList.toArray()));
        verify(keyMock).toAddress(ScriptType.P2PKH, networkMock);
        verify(paramsMock2, times(3)).getGenesisBlock();
        verify(blockMock).cloneAsHeader();
        verify(blockMock2).getHash();
        verify(blockMock3).getWork();
        verify(blockMock4).getHash();
        verify(paramsMock2).network();
    }
}
