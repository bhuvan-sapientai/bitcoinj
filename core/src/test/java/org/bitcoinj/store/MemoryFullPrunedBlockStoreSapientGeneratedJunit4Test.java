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

import org.bitcoinj.core.Transaction;
import org.bitcoinj.core.Block;
import org.bitcoinj.core.StoredUndoableBlock;

import java.util.LinkedList;

import org.mockito.MockitoAnnotations;
import org.bitcoinj.crypto.ECKey;

import java.math.BigInteger;

import org.bitcoinj.core.NetworkParameters;

import java.util.ArrayList;

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
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;

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
    @Test()
    public void putTest() throws BlockStoreException, VerificationException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Block blockMock = mock(Block.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        doReturn(sha256HashMock).when(blockMock).getHash();
        Block blockMock2 = mock(Block.class);
        Block blockMock3 = mock(Block.class);
        doReturn(blockMock3).when(blockMock2).cloneAsHeader();
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        doReturn(sha256HashMock2).when(blockMock3).getHash();
        Block blockMock4 = mock(Block.class);
        doReturn(new BigInteger("0")).when(blockMock4).getWork();
        Block blockMock5 = mock(Block.class);
        doReturn(blockMock2, blockMock4, blockMock5).when(paramsMock).getGenesisBlock();
        Sha256Hash sha256HashMock3 = mock(Sha256Hash.class);
        doReturn(sha256HashMock3).when(blockMock5).getHash();
        target = new MemoryFullPrunedBlockStore(paramsMock, 1);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doNothing().when(blockMapMock).put(eq(sha256HashMock2), (MemoryFullPrunedBlockStore.StoredBlockAndWasUndoableFlag) any());
        doNothing().when(blockMapMock).put(eq(sha256HashMock), (MemoryFullPrunedBlockStore.StoredBlockAndWasUndoableFlag) any());
        StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 0);

        //Act Statement(s)
        target.put(storedBlock);

        //Assert statement(s)
        verify(blockMock).getHash();
        verify(paramsMock, times(3)).getGenesisBlock();
        verify(blockMock2).cloneAsHeader();
        verify(blockMock3).getHash();
        verify(blockMock4).getWork();
        verify(blockMock5).getHash();
        verify(blockMapMock).put(eq(sha256HashMock2), (MemoryFullPrunedBlockStore.StoredBlockAndWasUndoableFlag) any());
        verify(blockMapMock).put(eq(sha256HashMock), (MemoryFullPrunedBlockStore.StoredBlockAndWasUndoableFlag) any());
    }

    //Sapient generated method id: ${7436b751-59ae-33bc-8c63-64de023baa27}
    @Test()
    public void put1Test() throws BlockStoreException, VerificationException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Block blockMock = mock(Block.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        doReturn(sha256HashMock).when(blockMock).getHash();
        Block blockMock2 = mock(Block.class);
        doReturn(blockMock).when(blockMock2).cloneAsHeader();
        Block blockMock3 = mock(Block.class);
        doReturn(new BigInteger("0")).when(blockMock3).getWork();
        Block blockMock4 = mock(Block.class);
        doReturn(blockMock2, blockMock3, blockMock4).when(paramsMock).getGenesisBlock();
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        doReturn(sha256HashMock2).when(blockMock4).getHash();
        target = new MemoryFullPrunedBlockStore(paramsMock, 1);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doNothing().when(fullBlockMapMock).put(eq(sha256HashMock), eq(0), (StoredUndoableBlock) any());
        doNothing().when(blockMapMock).put(eq(sha256HashMock), (MemoryFullPrunedBlockStore.StoredBlockAndWasUndoableFlag) any());
        doNothing().when(fullBlockMapMock).removeByMultiKey(-1);
        StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 0);
        List<Transaction> transactionList = new LinkedList<>();
        StoredUndoableBlock storedUndoableBlock = new StoredUndoableBlock(sha256HashMock2, transactionList);

        //Act Statement(s)
        target.put(storedBlock, storedUndoableBlock);

        //Assert statement(s)
        verify(blockMock, times(2)).getHash();
        verify(paramsMock, times(3)).getGenesisBlock();
        verify(blockMock2).cloneAsHeader();
        verify(blockMock3).getWork();
        verify(blockMock4).getHash();
        verify(fullBlockMapMock, atLeast(2)).put(eq(sha256HashMock), eq(0), (StoredUndoableBlock) any());
        verify(blockMapMock, atLeast(2)).put(eq(sha256HashMock), (MemoryFullPrunedBlockStore.StoredBlockAndWasUndoableFlag) any());
        verify(fullBlockMapMock).removeByMultiKey(-1);
    }

    //Sapient generated method id: ${03ba4252-2c4a-386e-a2f7-5702f422fe9b}
    @Test()
    public void getWhenStoredBlockIsNull() throws BlockStoreException, VerificationException {
        /* Branches:
         * (storedBlock == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Block blockMock = mock(Block.class);
        Block blockMock2 = mock(Block.class);
        doReturn(blockMock2).when(blockMock).cloneAsHeader();
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        doReturn(sha256HashMock).when(blockMock2).getHash();
        Block blockMock3 = mock(Block.class);
        doReturn(new BigInteger("0")).when(blockMock3).getWork();
        Block blockMock4 = mock(Block.class);
        doReturn(blockMock, blockMock3, blockMock4).when(paramsMock).getGenesisBlock();
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        doReturn(sha256HashMock2).when(blockMock4).getHash();
        target = new MemoryFullPrunedBlockStore(paramsMock, 1);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doNothing().when(blockMapMock).put(eq(sha256HashMock), (MemoryFullPrunedBlockStore.StoredBlockAndWasUndoableFlag) any());
        Sha256Hash sha256HashMock3 = mock(Sha256Hash.class);
        doReturn(null).when(blockMapMock).get(sha256HashMock3);

        //Act Statement(s)
        StoredBlock result = target.get(sha256HashMock3);

        //Assert statement(s)
        assertThat(result, is(nullValue()));
        verify(paramsMock, times(3)).getGenesisBlock();
        verify(blockMock).cloneAsHeader();
        verify(blockMock2).getHash();
        verify(blockMock3).getWork();
        verify(blockMock4).getHash();
        verify(blockMapMock).put(eq(sha256HashMock), (MemoryFullPrunedBlockStore.StoredBlockAndWasUndoableFlag) any());
        verify(blockMapMock).get(sha256HashMock3);
    }

    //Sapient generated method id: ${0b0f7add-a55d-320b-8097-6ec6ca57477b}
    @Test()
    public void getWhenStoredBlockIsNotNull() throws BlockStoreException, VerificationException {
        /* Branches:
         * (storedBlock == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Block blockMock = mock(Block.class);
        Block blockMock2 = mock(Block.class);
        doReturn(blockMock2).when(blockMock).cloneAsHeader();
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        doReturn(sha256HashMock).when(blockMock2).getHash();
        Block blockMock3 = mock(Block.class);
        doReturn(new BigInteger("0")).when(blockMock3).getWork();
        Block blockMock4 = mock(Block.class);
        doReturn(blockMock, blockMock3, blockMock4).when(paramsMock).getGenesisBlock();
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        doReturn(sha256HashMock2).when(blockMock4).getHash();
        target = new MemoryFullPrunedBlockStore(paramsMock, 1);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doNothing().when(blockMapMock).put(eq(sha256HashMock), (MemoryFullPrunedBlockStore.StoredBlockAndWasUndoableFlag) any());
        Sha256Hash sha256HashMock3 = mock(Sha256Hash.class);
        MemoryFullPrunedBlockStore.StoredBlockAndWasUndoableFlag storedBlockAndWasUndoableFlag = (MemoryFullPrunedBlockStore.StoredBlockAndWasUndoableFlag) blockMapMock.get(sha256HashMock3);
        doReturn(storedBlockAndWasUndoableFlag).when(blockMapMock).get(sha256HashMock3);

        //Act Statement(s)
        StoredBlock result = target.get(sha256HashMock3);

        //Assert statement(s)
        assertThat(result, is(nullValue()));
        verify(paramsMock, times(3)).getGenesisBlock();
        verify(blockMock).cloneAsHeader();
        verify(blockMock2).getHash();
        verify(blockMock3).getWork();
        verify(blockMock4).getHash();
        verify(blockMapMock).put(eq(sha256HashMock), (MemoryFullPrunedBlockStore.StoredBlockAndWasUndoableFlag) any());
        verify(blockMapMock).get(sha256HashMock3);
    }

    //Sapient generated method id: ${15828e36-626d-3dc9-916c-08292d146e2b}
    @Test()
    public void getOnceUndoableStoredBlockWhenStoredBlockNotWasUndoable() throws BlockStoreException, VerificationException {
        /* Branches:
         * (storedBlock != null) : true
         * (storedBlock.wasUndoable) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Block blockMock = mock(Block.class);
        Block blockMock2 = mock(Block.class);
        doReturn(blockMock2).when(blockMock).cloneAsHeader();
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        doReturn(sha256HashMock).when(blockMock2).getHash();
        Block blockMock3 = mock(Block.class);
        doReturn(new BigInteger("0")).when(blockMock3).getWork();
        Block blockMock4 = mock(Block.class);
        doReturn(blockMock, blockMock3, blockMock4).when(paramsMock).getGenesisBlock();
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        doReturn(sha256HashMock2).when(blockMock4).getHash();
        target = new MemoryFullPrunedBlockStore(paramsMock, 1);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doNothing().when(blockMapMock).put(eq(sha256HashMock), (MemoryFullPrunedBlockStore.StoredBlockAndWasUndoableFlag) any());
        Sha256Hash sha256HashMock3 = mock(Sha256Hash.class);
        MemoryFullPrunedBlockStore.StoredBlockAndWasUndoableFlag storedBlockAndWasUndoableFlag = (MemoryFullPrunedBlockStore.StoredBlockAndWasUndoableFlag) blockMapMock.get(sha256HashMock3);
        doReturn(storedBlockAndWasUndoableFlag).when(blockMapMock).get(sha256HashMock3);

        //Act Statement(s)
        StoredBlock result = target.getOnceUndoableStoredBlock(sha256HashMock3);

        //Assert statement(s)
        assertThat(result, is(nullValue()));
        verify(paramsMock, times(3)).getGenesisBlock();
        verify(blockMock).cloneAsHeader();
        verify(blockMock2).getHash();
        verify(blockMock3).getWork();
        verify(blockMock4).getHash();
        verify(blockMapMock).put(eq(sha256HashMock), (MemoryFullPrunedBlockStore.StoredBlockAndWasUndoableFlag) any());
        verify(blockMapMock).get(sha256HashMock3);
    }

    //Sapient generated method id: ${9d97f007-cb27-32f1-9498-70190e47b03f}
    @Test()
    public void getUndoBlockTest() throws BlockStoreException, VerificationException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Block blockMock = mock(Block.class);
        Block blockMock2 = mock(Block.class);
        doReturn(blockMock2).when(blockMock).cloneAsHeader();
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        doReturn(sha256HashMock).when(blockMock2).getHash();
        Block blockMock3 = mock(Block.class);
        doReturn(new BigInteger("0")).when(blockMock3).getWork();
        Block blockMock4 = mock(Block.class);
        doReturn(blockMock, blockMock3, blockMock4).when(paramsMock).getGenesisBlock();
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        doReturn(sha256HashMock2).when(blockMock4).getHash();
        target = new MemoryFullPrunedBlockStore(paramsMock, 1);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doNothing().when(fullBlockMapMock).put(eq(sha256HashMock), eq(0), (StoredUndoableBlock) any());
        doNothing().when(fullBlockMapMock).removeByMultiKey(-1);
        StoredUndoableBlock storedUndoableBlockMock = mock(StoredUndoableBlock.class);
        Sha256Hash sha256HashMock3 = mock(Sha256Hash.class);
        doReturn(storedUndoableBlockMock).when(fullBlockMapMock).get(sha256HashMock3);

        //Act Statement(s)
        StoredUndoableBlock result = target.getUndoBlock(sha256HashMock3);

        //Assert statement(s)
        assertThat(result, equalTo(storedUndoableBlockMock));
        verify(paramsMock, times(3)).getGenesisBlock();
        verify(blockMock).cloneAsHeader();
        verify(blockMock2).getHash();
        verify(blockMock3).getWork();
        verify(blockMock4).getHash();
        verify(fullBlockMapMock).put(eq(sha256HashMock), eq(0), (StoredUndoableBlock) any());
        verify(fullBlockMapMock).removeByMultiKey(-1);
        verify(fullBlockMapMock).get(sha256HashMock3);
    }

    //Sapient generated method id: ${5bcf99c3-253c-36a4-a43f-4c7faaa5f46e}
    @Test()
    public void getChainHeadTest() throws BlockStoreException, VerificationException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Block blockMock = mock(Block.class);
        Block blockMock2 = mock(Block.class);
        doReturn(blockMock2).when(blockMock).cloneAsHeader();
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        doReturn(sha256HashMock).when(blockMock2).getHash();
        Block blockMock3 = mock(Block.class);
        doReturn(new BigInteger("0")).when(blockMock3).getWork();
        Block blockMock4 = mock(Block.class);
        doReturn(blockMock, blockMock3, blockMock4).when(paramsMock).getGenesisBlock();
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        doReturn(sha256HashMock2).when(blockMock4).getHash();
        target = new MemoryFullPrunedBlockStore(paramsMock, 1);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);

        //Act Statement(s)
        StoredBlock result = target.getChainHead();
        StoredBlock storedBlock = new StoredBlock(blockMock2, new BigInteger("0"), 0);

        //Assert statement(s)
        assertThat(result, equalTo(storedBlock));
        verify(paramsMock, times(3)).getGenesisBlock();
        verify(blockMock).cloneAsHeader();
        verify(blockMock2).getHash();
        verify(blockMock3).getWork();
        verify(blockMock4).getHash();
    }

    //Sapient generated method id: ${56524823-4654-36ac-b950-899d8270ea6b}
    @Test()
    public void setChainHeadTest() throws BlockStoreException, VerificationException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Block blockMock = mock(Block.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        doReturn(sha256HashMock).when(blockMock).getHash();
        Block blockMock2 = mock(Block.class);
        doReturn(blockMock).when(blockMock2).cloneAsHeader();
        Block blockMock3 = mock(Block.class);
        doReturn(new BigInteger("0")).when(blockMock3).getWork();
        Block blockMock4 = mock(Block.class);
        doReturn(blockMock2, blockMock3, blockMock4).when(paramsMock).getGenesisBlock();
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        doReturn(sha256HashMock2).when(blockMock4).getHash();
        target = new MemoryFullPrunedBlockStore(paramsMock, 1);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 0);

        //Act Statement(s)
        target.setChainHead(storedBlock);

        //Assert statement(s)
        verify(blockMock).getHash();
        verify(paramsMock, times(3)).getGenesisBlock();
        verify(blockMock2).cloneAsHeader();
        verify(blockMock3).getWork();
        verify(blockMock4).getHash();
    }

    //Sapient generated method id: ${2dbd9de2-a481-3b92-8352-2399069d4bcf}
    @Test()
    public void getVerifiedChainHeadTest() throws BlockStoreException, VerificationException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Block blockMock = mock(Block.class);
        Block blockMock2 = mock(Block.class);
        doReturn(blockMock2).when(blockMock).cloneAsHeader();
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        doReturn(sha256HashMock).when(blockMock2).getHash();
        Block blockMock3 = mock(Block.class);
        doReturn(new BigInteger("0")).when(blockMock3).getWork();
        Block blockMock4 = mock(Block.class);
        doReturn(blockMock, blockMock3, blockMock4).when(paramsMock).getGenesisBlock();
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        doReturn(sha256HashMock2).when(blockMock4).getHash();
        target = new MemoryFullPrunedBlockStore(paramsMock, 1);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);

        //Act Statement(s)
        StoredBlock result = target.getVerifiedChainHead();
        StoredBlock storedBlock = new StoredBlock(blockMock2, new BigInteger("0"), 0);

        //Assert statement(s)
        assertThat(result, equalTo(storedBlock));
        verify(paramsMock, times(3)).getGenesisBlock();
        verify(blockMock).cloneAsHeader();
        verify(blockMock2).getHash();
        verify(blockMock3).getWork();
        verify(blockMock4).getHash();
    }

    //Sapient generated method id: ${ca96ce46-44d6-395a-a2ab-c43a2aecf10a}
    @Test()
    public void setVerifiedChainHeadWhenThisChainHeadGetHeightNotLessThanChainHeadGetHeight() throws BlockStoreException, VerificationException {
        /* Branches:
         * (this.chainHead.getHeight() < chainHead.getHeight()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Block blockMock = mock(Block.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        doReturn(sha256HashMock).when(blockMock).getHash();
        Block blockMock2 = mock(Block.class);
        doReturn(blockMock).when(blockMock2).cloneAsHeader();
        Block blockMock3 = mock(Block.class);
        doReturn(new BigInteger("0")).when(blockMock3).getWork();
        Block blockMock4 = mock(Block.class);
        doReturn(blockMock2, blockMock3, blockMock4).when(paramsMock).getGenesisBlock();
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        doReturn(sha256HashMock2).when(blockMock4).getHash();
        target = new MemoryFullPrunedBlockStore(paramsMock, 1);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 0);

        //Act Statement(s)
        target.setVerifiedChainHead(storedBlock);

        //Assert statement(s)
        verify(blockMock).getHash();
        verify(paramsMock, times(3)).getGenesisBlock();
        verify(blockMock2).cloneAsHeader();
        verify(blockMock3).getWork();
        verify(blockMock4).getHash();
    }

    //Sapient generated method id: ${4338ea80-df41-3c09-b3eb-b0476a460c1f}
    @Test()
    public void closeTest() throws VerificationException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Block blockMock = mock(Block.class);
        Block blockMock2 = mock(Block.class);
        doReturn(blockMock2).when(blockMock).cloneAsHeader();
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        doReturn(sha256HashMock).when(blockMock2).getHash();
        Block blockMock3 = mock(Block.class);
        doReturn(new BigInteger("0")).when(blockMock3).getWork();
        Block blockMock4 = mock(Block.class);
        doReturn(blockMock, blockMock3, blockMock4).when(paramsMock).getGenesisBlock();
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        doReturn(sha256HashMock2).when(blockMock4).getHash();
        target = new MemoryFullPrunedBlockStore(paramsMock, 1);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);

        //Act Statement(s)
        target.close();

        //Assert statement(s)
        verify(paramsMock, times(3)).getGenesisBlock();
        verify(blockMock).cloneAsHeader();
        verify(blockMock2).getHash();
        verify(blockMock3).getWork();
        verify(blockMock4).getHash();
    }

    //Sapient generated method id: ${a71d3a46-2bc0-3d43-9c90-cbad75804657}
    @Test()
    public void getTransactionOutputTest() throws BlockStoreException, VerificationException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Block blockMock = mock(Block.class);
        Block blockMock2 = mock(Block.class);
        doReturn(blockMock2).when(blockMock).cloneAsHeader();
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        doReturn(sha256HashMock).when(blockMock2).getHash();
        Block blockMock3 = mock(Block.class);
        doReturn(new BigInteger("0")).when(blockMock3).getWork();
        Block blockMock4 = mock(Block.class);
        doReturn(blockMock, blockMock3, blockMock4).when(paramsMock).getGenesisBlock();
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        doReturn(sha256HashMock2).when(blockMock4).getHash();
        target = new MemoryFullPrunedBlockStore(paramsMock, 1);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Sha256Hash sha256HashMock3 = mock(Sha256Hash.class);
        StoredTransactionOutPoint storedTransactionOutPoint = new StoredTransactionOutPoint(sha256HashMock3, 0L);
        UTXO uTXO = (UTXO) transactionOutputMapMock.get(storedTransactionOutPoint);
        doReturn(uTXO).when(transactionOutputMapMock).get((StoredTransactionOutPoint) any());

        //Act Statement(s)
        UTXO result = target.getTransactionOutput(sha256HashMock3, 0L);

        //Assert statement(s)
        assertThat(result, equalTo(uTXO));
        verify(paramsMock, times(3)).getGenesisBlock();
        verify(blockMock).cloneAsHeader();
        verify(blockMock2).getHash();
        verify(blockMock3).getWork();
        verify(blockMock4).getHash();
        verify(transactionOutputMapMock).get((StoredTransactionOutPoint) any());
    }

    //Sapient generated method id: ${c543da65-20dc-37d1-9685-f0658125d1df}
    @Test()
    public void addUnspentTransactionOutputTest() throws BlockStoreException, VerificationException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Block blockMock = mock(Block.class);
        Block blockMock2 = mock(Block.class);
        doReturn(blockMock2).when(blockMock).cloneAsHeader();
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        doReturn(sha256HashMock).when(blockMock2).getHash();
        Block blockMock3 = mock(Block.class);
        doReturn(new BigInteger("0")).when(blockMock3).getWork();
        Block blockMock4 = mock(Block.class);
        doReturn(blockMock, blockMock3, blockMock4).when(paramsMock).getGenesisBlock();
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        doReturn(sha256HashMock2).when(blockMock4).getHash();
        target = new MemoryFullPrunedBlockStore(paramsMock, 1);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        UTXO uTXOMock = mock(UTXO.class);
        doNothing().when(transactionOutputMapMock).put((StoredTransactionOutPoint) any(), eq(uTXOMock));

        //Act Statement(s)
        target.addUnspentTransactionOutput(uTXOMock);

        //Assert statement(s)
        verify(paramsMock, times(3)).getGenesisBlock();
        verify(blockMock).cloneAsHeader();
        verify(blockMock2).getHash();
        verify(blockMock3).getWork();
        verify(blockMock4).getHash();
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
        Block blockMock = mock(Block.class);
        Block blockMock2 = mock(Block.class);
        doReturn(blockMock2).when(blockMock).cloneAsHeader();
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        doReturn(sha256HashMock).when(blockMock2).getHash();
        Block blockMock3 = mock(Block.class);
        doReturn(new BigInteger("0")).when(blockMock3).getWork();
        Block blockMock4 = mock(Block.class);
        doReturn(blockMock, blockMock3, blockMock4).when(paramsMock).getGenesisBlock();
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        doReturn(sha256HashMock2).when(blockMock4).getHash();
        target = new MemoryFullPrunedBlockStore(paramsMock, 1);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //TODO: Needs to return real value
        doReturn(null).when(transactionOutputMapMock).remove((StoredTransactionOutPoint) any());
        BlockStoreException blockStoreException = new BlockStoreException("Tried to remove a UTXO from MemoryFullPrunedBlockStore that it didn't have!");
        thrown.expect(BlockStoreException.class);
        thrown.expectMessage(blockStoreException.getMessage());
        UTXO uTXOMock = mock(UTXO.class);

        //Act Statement(s)
        target.removeUnspentTransactionOutput(uTXOMock);

        //Assert statement(s)
        verify(paramsMock, times(3)).getGenesisBlock();
        verify(blockMock).cloneAsHeader();
        verify(blockMock2).getHash();
        verify(blockMock3).getWork();
        verify(blockMock4).getHash();
        verify(transactionOutputMapMock).remove((StoredTransactionOutPoint) any());
    }

    //Sapient generated method id: ${12010d29-0e03-3fc5-9dea-cf159f904964}
    @Test()
    public void removeUnspentTransactionOutputWhenTransactionOutputMapRemoveNewStoredTransactionOutPointOutIsNotNull() throws BlockStoreException, VerificationException {
        /* Branches:
         * (transactionOutputMap.remove(new StoredTransactionOutPoint(out)) == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Block blockMock = mock(Block.class);
        Block blockMock2 = mock(Block.class);
        doReturn(blockMock2).when(blockMock).cloneAsHeader();
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        doReturn(sha256HashMock).when(blockMock2).getHash();
        Block blockMock3 = mock(Block.class);
        doReturn(new BigInteger("0")).when(blockMock3).getWork();
        Block blockMock4 = mock(Block.class);
        doReturn(blockMock, blockMock3, blockMock4).when(paramsMock).getGenesisBlock();
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        doReturn(sha256HashMock2).when(blockMock4).getHash();
        target = new MemoryFullPrunedBlockStore(paramsMock, 1);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        UTXO uTXOMock = mock(UTXO.class);
        StoredTransactionOutPoint storedTransactionOutPoint = new StoredTransactionOutPoint(uTXOMock);
        Object object = transactionOutputMapMock.remove(storedTransactionOutPoint);
        doReturn(object).when(transactionOutputMapMock).remove((StoredTransactionOutPoint) any());

        //Act Statement(s)
        target.removeUnspentTransactionOutput(uTXOMock);

        //Assert statement(s)
        verify(paramsMock, times(3)).getGenesisBlock();
        verify(blockMock).cloneAsHeader();
        verify(blockMock2).getHash();
        verify(blockMock3).getWork();
        verify(blockMock4).getHash();
        verify(transactionOutputMapMock).remove((StoredTransactionOutPoint) any());
    }

    //Sapient generated method id: ${b04b432f-9970-393b-8e0a-3f02a386d3be}
    @Test()
    public void beginDatabaseBatchWriteTest() throws BlockStoreException, VerificationException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Block blockMock = mock(Block.class);
        Block blockMock2 = mock(Block.class);
        doReturn(blockMock2).when(blockMock).cloneAsHeader();
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        doReturn(sha256HashMock).when(blockMock2).getHash();
        Block blockMock3 = mock(Block.class);
        doReturn(new BigInteger("0")).when(blockMock3).getWork();
        Block blockMock4 = mock(Block.class);
        doReturn(blockMock, blockMock3, blockMock4).when(paramsMock).getGenesisBlock();
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        doReturn(sha256HashMock2).when(blockMock4).getHash();
        target = new MemoryFullPrunedBlockStore(paramsMock, 1);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);

        //Act Statement(s)
        target.beginDatabaseBatchWrite();

        //Assert statement(s)
        verify(paramsMock, times(3)).getGenesisBlock();
        verify(blockMock).cloneAsHeader();
        verify(blockMock2).getHash();
        verify(blockMock3).getWork();
        verify(blockMock4).getHash();
    }

    //Sapient generated method id: ${b231b0bc-887b-3bee-a006-95b7b893337a}
    @Test()
    public void commitDatabaseBatchWriteTest() throws BlockStoreException, VerificationException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Block blockMock = mock(Block.class);
        Block blockMock2 = mock(Block.class);
        doReturn(blockMock2).when(blockMock).cloneAsHeader();
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        doReturn(sha256HashMock).when(blockMock2).getHash();
        Block blockMock3 = mock(Block.class);
        doReturn(new BigInteger("0")).when(blockMock3).getWork();
        Block blockMock4 = mock(Block.class);
        doReturn(blockMock, blockMock3, blockMock4).when(paramsMock).getGenesisBlock();
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        doReturn(sha256HashMock2).when(blockMock4).getHash();
        target = new MemoryFullPrunedBlockStore(paramsMock, 1);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);

        //Act Statement(s)
        target.commitDatabaseBatchWrite();

        //Assert statement(s)
        verify(paramsMock, times(3)).getGenesisBlock();
        verify(blockMock).cloneAsHeader();
        verify(blockMock2).getHash();
        verify(blockMock3).getWork();
        verify(blockMock4).getHash();
    }

    //Sapient generated method id: ${bb5143f8-c902-349e-b57f-69694a4394f7}
    @Test()
    public void abortDatabaseBatchWriteTest() throws BlockStoreException, VerificationException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Block blockMock = mock(Block.class);
        Block blockMock2 = mock(Block.class);
        doReturn(blockMock2).when(blockMock).cloneAsHeader();
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        doReturn(sha256HashMock).when(blockMock2).getHash();
        Block blockMock3 = mock(Block.class);
        doReturn(new BigInteger("0")).when(blockMock3).getWork();
        Block blockMock4 = mock(Block.class);
        doReturn(blockMock, blockMock3, blockMock4).when(paramsMock).getGenesisBlock();
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        doReturn(sha256HashMock2).when(blockMock4).getHash();
        target = new MemoryFullPrunedBlockStore(paramsMock, 1);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);

        //Act Statement(s)
        target.abortDatabaseBatchWrite();

        //Assert statement(s)
        verify(paramsMock, times(3)).getGenesisBlock();
        verify(blockMock).cloneAsHeader();
        verify(blockMock2).getHash();
        verify(blockMock3).getWork();
        verify(blockMock4).getHash();
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
        Block blockMock = mock(Block.class);
        Block blockMock2 = mock(Block.class);
        doReturn(blockMock2).when(blockMock).cloneAsHeader();
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        doReturn(sha256HashMock).when(blockMock2).getHash();
        Block blockMock3 = mock(Block.class);
        doReturn(new BigInteger("0")).when(blockMock3).getWork();
        Block blockMock4 = mock(Block.class);
        doReturn(blockMock, blockMock3, blockMock4).when(paramsMock).getGenesisBlock();
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        doReturn(sha256HashMock2).when(blockMock4).getHash();
        target = spy(new MemoryFullPrunedBlockStore(paramsMock, 1));
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        UTXO uTXOMock = mock(UTXO.class);
        Sha256Hash sha256HashMock3 = mock(Sha256Hash.class);
        doReturn(uTXOMock).when(target).getTransactionOutput(sha256HashMock3, 0L);

        //Act Statement(s)
        boolean result = target.hasUnspentOutputs(sha256HashMock3, 1);

        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(paramsMock, times(3)).getGenesisBlock();
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
        Block blockMock = mock(Block.class);
        Block blockMock2 = mock(Block.class);
        doReturn(blockMock2).when(blockMock).cloneAsHeader();
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        doReturn(sha256HashMock).when(blockMock2).getHash();
        Block blockMock3 = mock(Block.class);
        doReturn(new BigInteger("0")).when(blockMock3).getWork();
        Block blockMock4 = mock(Block.class);
        doReturn(blockMock, blockMock3, blockMock4).when(paramsMock).getGenesisBlock();
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        doReturn(sha256HashMock2).when(blockMock4).getHash();
        target = spy(new MemoryFullPrunedBlockStore(paramsMock, 1));
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Sha256Hash sha256HashMock3 = mock(Sha256Hash.class);
        doReturn(null).when(target).getTransactionOutput(sha256HashMock3, 0L);

        //Act Statement(s)
        boolean result = target.hasUnspentOutputs(sha256HashMock3, 1);

        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(paramsMock, times(3)).getGenesisBlock();
        verify(blockMock).cloneAsHeader();
        verify(blockMock2).getHash();
        verify(blockMock3).getWork();
        verify(blockMock4).getHash();
        verify(target).getTransactionOutput(sha256HashMock3, 0L);
    }

    //Sapient generated method id: ${b444423d-8062-3e94-803b-01f5c4c4e2cc}
    @Test()
    public void networkTest() throws VerificationException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Block blockMock = mock(Block.class);
        Block blockMock2 = mock(Block.class);
        doReturn(blockMock2).when(blockMock).cloneAsHeader();
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        doReturn(sha256HashMock).when(blockMock2).getHash();
        Block blockMock3 = mock(Block.class);
        doReturn(new BigInteger("0")).when(blockMock3).getWork();
        Block blockMock4 = mock(Block.class);
        doReturn(blockMock, blockMock3, blockMock4).when(paramsMock).getGenesisBlock();
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        doReturn(sha256HashMock2).when(blockMock4).getHash();
        target = new MemoryFullPrunedBlockStore(paramsMock, 1);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Network networkMock = mock(Network.class);
        doReturn(networkMock).when(paramsMock).network();

        //Act Statement(s)
        Network result = target.network();

        //Assert statement(s)
        assertThat(result, equalTo(networkMock));
        verify(paramsMock, times(3)).getGenesisBlock();
        verify(blockMock).cloneAsHeader();
        verify(blockMock2).getHash();
        verify(blockMock3).getWork();
        verify(blockMock4).getHash();
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
        Block blockMock = mock(Block.class);
        Block blockMock2 = mock(Block.class);
        doReturn(blockMock2).when(blockMock).cloneAsHeader();
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        doReturn(sha256HashMock).when(blockMock2).getHash();
        Block blockMock3 = mock(Block.class);
        doReturn(new BigInteger("0")).when(blockMock3).getWork();
        Block blockMock4 = mock(Block.class);
        doReturn(blockMock, blockMock3, blockMock4).when(paramsMock).getGenesisBlock();
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        doReturn(sha256HashMock2).when(blockMock4).getHash();
        target = spy(new MemoryFullPrunedBlockStore(paramsMock, 1));
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Block blockMock5 = mock(Block.class);
        StoredBlock storedBlock = new StoredBlock(blockMock5, new BigInteger("0"), 0);
        doReturn(storedBlock).when(target).getVerifiedChainHead();

        //Act Statement(s)
        int result = target.getChainHeadHeight();

        //Assert statement(s)
        assertThat(result, equalTo(0));
        verify(paramsMock, times(3)).getGenesisBlock();
        verify(blockMock).cloneAsHeader();
        verify(blockMock2).getHash();
        verify(blockMock3).getWork();
        verify(blockMock4).getHash();
        verify(target).getVerifiedChainHead();
    }

    //Sapient generated method id: ${d1191563-4036-3daf-a378-006d53de7d1c}
    @Test()
    public void getChainHeadHeightWhenCaughtBlockStoreExceptionThrowsUTXOProviderException() throws UTXOProviderException, VerificationException, BlockStoreException {
        /* Branches:
         * (catch-exception (BlockStoreException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Block blockMock = mock(Block.class);
        Block blockMock2 = mock(Block.class);
        doReturn(blockMock2).when(blockMock).cloneAsHeader();
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        doReturn(sha256HashMock).when(blockMock2).getHash();
        Block blockMock3 = mock(Block.class);
        doReturn(new BigInteger("0")).when(blockMock3).getWork();
        Block blockMock4 = mock(Block.class);
        doReturn(blockMock, blockMock3, blockMock4).when(paramsMock).getGenesisBlock();
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        doReturn(sha256HashMock2).when(blockMock4).getHash();
        target = spy(new MemoryFullPrunedBlockStore(paramsMock, 1));
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Block blockMock5 = mock(Block.class);
        StoredBlock storedBlock = new StoredBlock(blockMock5, new BigInteger("0"), 0);
        doReturn(storedBlock).when(target).getVerifiedChainHead();
        thrown.expect(UTXOProviderException.class);
        thrown.expectCause(is(instanceOf(BlockStoreException.class)));

        //Act Statement(s)
        target.getChainHeadHeight();

        //Assert statement(s)
        verify(paramsMock, times(3)).getGenesisBlock();
        verify(blockMock).cloneAsHeader();
        verify(blockMock2).getHash();
        verify(blockMock3).getWork();
        verify(blockMock4).getHash();
        verify(target).getVerifiedChainHead();
    }

    //Sapient generated method id: ${f9b297ce-f846-365a-8980-986b12302ea0}
    @Test()
    public void getOpenTransactionOutputsWhenOutputsListIsEmpty() throws UTXOProviderException, VerificationException {
        /* Branches:
         * (for-each(outputsList)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Block blockMock = mock(Block.class);
        Block blockMock2 = mock(Block.class);
        doReturn(blockMock2).when(blockMock).cloneAsHeader();
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        doReturn(sha256HashMock).when(blockMock2).getHash();
        Block blockMock3 = mock(Block.class);
        doReturn(new BigInteger("0")).when(blockMock3).getWork();
        Block blockMock4 = mock(Block.class);
        doReturn(blockMock, blockMock3, blockMock4).when(paramsMock).getGenesisBlock();
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        doReturn(sha256HashMock2).when(blockMock4).getHash();
        target = new MemoryFullPrunedBlockStore(paramsMock, 1);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        List<ECKey> eCKeyList = new ArrayList<>();

        //Act Statement(s)
        List<UTXO> result = target.getOpenTransactionOutputs(eCKeyList);

        //Assert statement(s)
        assertThat(result.size(), equalTo(0));
        verify(paramsMock, times(3)).getGenesisBlock();
        verify(blockMock).cloneAsHeader();
        verify(blockMock2).getHash();
        verify(blockMock3).getWork();
        verify(blockMock4).getHash();
    }
}
