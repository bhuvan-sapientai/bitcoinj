package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.nio.BufferUnderflowException;
import java.io.IOException;

import org.junit.rules.ExpectedException;

import java.util.List;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.io.OutputStream;

import org.bitcoinj.base.Sha256Hash;

import java.util.Map;
import java.util.HashMap;

import org.mockito.MockedStatic;
import org.bitcoinj.base.internal.Buffers;

import java.util.ArrayList;

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

import java.time.Instant;

import org.junit.Ignore;

public class FilteredBlockSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Block headerMock = mock(Block.class, "byte[]");

    private final PartialMerkleTree merkleTreeMock = mock(PartialMerkleTree.class, "PartialMerkleTree");

    private final Block blockMock = mock(Block.class);

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);

    private final Transaction txMock = mock(Transaction.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${db344e3b-696d-3b02-8e35-1aaa5300bde6}
    @Test()
    public void readTest() throws BufferUnderflowException, ProtocolException {
        //Arrange Statement(s)
        //Block blockMock = mock(Block.class);
        //PartialMerkleTree partialMerkleTreeMock = mock(PartialMerkleTree.class);
        /*try (MockedStatic<PartialMerkleTree> partialMerkleTree = mockStatic(PartialMerkleTree.class);
    MockedStatic<Block> block = mockStatic(Block.class);
    MockedStatic<Buffers> buffers = mockStatic(Buffers.class)) {
    byte[] byteArray = new byte[] {};
    buffers.when(() -> Buffers.readBytes((ByteBuffer) any(), eq(80))).thenReturn(byteArray);
    block.when(() -> Block.read((ByteBuffer) any())).thenReturn(blockMock);
    partialMerkleTree.when(() -> PartialMerkleTree.read((ByteBuffer) any())).thenReturn(partialMerkleTreeMock);
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    //Act Statement(s)
    FilteredBlock result = FilteredBlock.read(byteBuffer);
    FilteredBlock filteredBlock = new FilteredBlock(blockMock, partialMerkleTreeMock);
    //Assert statement(s)
    assertThat(result, equalTo(filteredBlock));
    buffers.verify(() -> Buffers.readBytes((ByteBuffer) any(), eq(80)));
    block.verify(() -> Block.read((ByteBuffer) any()));
    partialMerkleTree.verify(() -> PartialMerkleTree.read((ByteBuffer) any()));
}*/
    }

    //Sapient generated method id: ${5efadba4-ba6a-3361-b05c-1ea6639b6230}
    @Test()
    public void bitcoinSerializeToStreamWhenHeaderGetTransactionsIsNull() throws IOException {
        /* Branches:
         * (header.getTransactions() == null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: header
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //Instant instant = Instant.now();
        //List list = new ArrayList<>();
        //Block block = new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, list);
        //FilteredBlock target = new FilteredBlock(block, merkleTreeMock);
        //byte[] byteArray = new byte[] { (byte) 0 };
        //doReturn(byteArray).when(merkleTreeMock).serialize();
        //OutputStream outputStream = OutputStream.nullOutputStream();
        //Act Statement(s)
        //target.bitcoinSerializeToStream(outputStream);
        //Assert statement(s)
        //verify(merkleTreeMock).serialize();
    }

    //Sapient generated method id: ${0c639f25-97e3-3ec6-87ea-a4bb21f09a7e}
    @Test()
    public void bitcoinSerializeToStreamWhenHeaderGetTransactionsIsNotNull() throws IOException {
        /* Branches:
         * (header.getTransactions() == null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: org.bitcoinj.core.Block
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //FilteredBlock target = new FilteredBlock(headerMock, merkleTreeMock);
        //Transaction transaction = new Transaction();
        //List<Transaction> transactionList = new ArrayList<>();
        //transactionList.add(transaction);
        //doReturn(transactionList).when(headerMock).getTransactions();
        //Instant instant = Instant.now();
        //List list = new ArrayList<>();
        //Block block = new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, list);
        //doReturn(block).when(headerMock).cloneAsHeader();
        //byte[] byteArray = new byte[] { (byte) 0 };
        //doReturn(byteArray).when(merkleTreeMock).serialize();
        //OutputStream outputStream = OutputStream.nullOutputStream();
        //Act Statement(s)
        //target.bitcoinSerializeToStream(outputStream);
        //Assert statement(s)
        //verify(headerMock).getTransactions();
        //verify(headerMock).cloneAsHeader();
        //verify(merkleTreeMock).serialize();
    }

    //Sapient generated method id: ${57a966b8-9eb5-347d-8eb6-4456a30c15c5}
    @Test()
    public void getTransactionHashesWhenHeaderGetMerkleRootEqualsMerkleTreeGetTxnHashAndMerkleRootHashesMatched() throws VerificationException {
        /* Branches:
         * (cachedTransactionHashes != null) : false
         * (header.getMerkleRoot().equals(merkleTree.getTxnHashAndMerkleRoot(hashesMatched))) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //FilteredBlock target = new FilteredBlock(headerMock, merkleTreeMock);
        //ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        //Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        //doReturn(sha256Hash).when(headerMock).getMerkleRoot();
        //ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
        //Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
        //List<Sha256Hash> sha256HashList = new LinkedList<>();
        //doReturn(sha256Hash2).when(merkleTreeMock).getTxnHashAndMerkleRoot(sha256HashList);
        //Act Statement(s)
        //List<Sha256Hash> result = target.getTransactionHashes();
        //Assert statement(s)
        //assertThat(result.size(), equalTo(0));
        //verify(headerMock).getMerkleRoot();
        //verify(merkleTreeMock).getTxnHashAndMerkleRoot(sha256HashList);
    }

    //Sapient generated method id: ${4308c862-7aab-3179-9319-016d70190f4b}
    @Ignore()
    @Test()
    public void getTransactionHashesWhenHeaderGetMerkleRootNotEqualsMerkleTreeGetTxnHashAndMerkleRootHashesMThrowsVerificationException() throws VerificationException {
        /* Branches:
         * (cachedTransactionHashes != null) : false
         * (header.getMerkleRoot().equals(merkleTree.getTxnHashAndMerkleRoot(hashesMatched))) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        FilteredBlock target = new FilteredBlock(headerMock, merkleTreeMock);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        doReturn(sha256Hash).when(headerMock).getMerkleRoot();
        ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
        List<Sha256Hash> sha256HashList = new LinkedList<>();
        doReturn(sha256Hash2).when(merkleTreeMock).getTxnHashAndMerkleRoot(sha256HashList);
        thrown.expect(VerificationException.class);
        //Act Statement(s)
        target.getTransactionHashes();
        //Assert statement(s)
        verify(headerMock).getMerkleRoot();
        verify(merkleTreeMock).getTxnHashAndMerkleRoot(sha256HashList);
    }

    //Sapient generated method id: ${09a7c168-7d8a-3a87-8efd-e8276ce35b99}
    @Test()
    public void getBlockHeaderTest() {
        /**
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: header
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //Instant instant = Instant.now();
        //List list = new ArrayList<>();
        //Block block = new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, list);
        //FilteredBlock target = new FilteredBlock(block, merkleTreeMock);
        //Act Statement(s)
        //Block result = target.getBlockHeader();
        //Block block2 = block.cloneAsHeader();
        //Assert statement(s)
        //assertThat(result, equalTo(block2));
    }

    //Sapient generated method id: ${c152b292-9f41-3184-8d0c-c8dacb973313}
    @Ignore()
    @Test()
    public void getHashTest() {
        /**
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: header
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Instant instant = Instant.now();
        List list = new ArrayList<>();
        Block block = new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, list);
        FilteredBlock target = new FilteredBlock(block, merkleTreeMock);
        //Act Statement(s)
        Sha256Hash result = target.getHash();
        Sha256Hash sha256Hash = block.getHash();
        //Assert statement(s)
        assertThat(result, equalTo(sha256Hash));
    }

    //Sapient generated method id: ${be0ef020-8a2b-34f0-83de-35a732d3efb2}
    @Test()
    public void provideTransactionWhenGetTransactionHashesContainsHash() throws VerificationException {
        /* Branches:
         * (getTransactionHashes().contains(hash)) : true
         */
        //Arrange Statement(s)
        Instant instant = Instant.now();
        List list = new ArrayList<>();
        Block block = new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, list);
        FilteredBlock target = spy(new FilteredBlock(block, merkleTreeMock));
        Transaction transaction = new Transaction();
        Sha256Hash sha256Hash = transaction.getTxId();
        List<Sha256Hash> sha256HashList = new ArrayList<>();
        sha256HashList.add(sha256Hash);
        doReturn(sha256HashList).when(target).getTransactionHashes();
        //Act Statement(s)
        boolean result = target.provideTransaction(transaction);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(target).getTransactionHashes();
    }

    //Sapient generated method id: ${e7d2886d-8e78-3575-a335-5bcb36e19f6f}
    @Test()
    public void provideTransactionWhenGetTransactionHashesNotContainsHash() throws VerificationException {
        /* Branches:
         * (getTransactionHashes().contains(hash)) : false
         */
        //Arrange Statement(s)
        //Instant instant = Instant.now();
        //List list = new ArrayList<>();
        //Block block = new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, list);
        //FilteredBlock target = spy(new FilteredBlock(block, merkleTreeMock));
        //List<Sha256Hash> sha256HashList = new ArrayList<>();
        //doReturn(sha256HashList).when(target).getTransactionHashes();
        //Transaction transaction = new Transaction();
        //Act Statement(s)
        //boolean result = target.provideTransaction(transaction);
        //Assert statement(s)
        //assertThat(result, equalTo(Boolean.FALSE));
        //verify(target).getTransactionHashes();
    }

    //Sapient generated method id: ${b8c7d07f-19dc-34c1-a7c2-d0095d8b5cd5}
    @Test()
    public void getAssociatedTransactionsTest() {
        //Arrange Statement(s)
        //Instant instant = Instant.now();
        //List list = new ArrayList<>();
        //Block block = new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, list);
        //FilteredBlock target = new FilteredBlock(block, merkleTreeMock);
        //Act Statement(s)
        //Map<Sha256Hash, Transaction> result = target.getAssociatedTransactions();
        //Map<Sha256Hash, Transaction> sha256HashTransactionResultMap = new HashMap<>();
        //Assert statement(s)
        //assertThat(result, equalTo(sha256HashTransactionResultMap));
    }

    //Sapient generated method id: ${f1206cfa-ac32-350f-91f6-880147fc431c}
    @Test()
    public void getTransactionCountTest() {
        //Arrange Statement(s)
        Instant instant = Instant.now();
        List list = new ArrayList<>();
        Block block = new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, list);
        FilteredBlock target = new FilteredBlock(block, merkleTreeMock);
        doReturn(0).when(merkleTreeMock).getTransactionCount();
        //Act Statement(s)
        int result = target.getTransactionCount();
        //Assert statement(s)
        assertThat(result, equalTo(0));
        verify(merkleTreeMock).getTransactionCount();
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}
    @Ignore()
    @Test()
    public void toStringTest() {
        //Arrange Statement(s)
        FilteredBlock target = new FilteredBlock(headerMock, merkleTreeMock);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("FilteredBlock{merkleTree=<init>_partialMerkleTree1, header=<init>_block1}"));
    }
}
