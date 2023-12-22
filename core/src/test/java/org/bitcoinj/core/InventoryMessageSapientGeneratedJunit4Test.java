package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.nio.BufferUnderflowException;
import java.util.List;

import org.mockito.stubbing.Answer;

import java.nio.ByteBuffer;

import org.bitcoinj.base.internal.Preconditions;
import org.mockito.MockedStatic;

import java.util.ArrayList;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

public class InventoryMessageSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Block blockMock = mock(Block.class);

    private final InventoryMessage inventoryMessageMock = mock(InventoryMessage.class);

    private final Transaction transactionMock = mock(Transaction.class);

    //Sapient generated method id: ${db344e3b-696d-3b02-8e35-1aaa5300bde6}
    @Test()
    public void readTest() throws BufferUnderflowException, ProtocolException {
        //Arrange Statement(s)
        try (MockedStatic<ListMessage> listMessage = mockStatic(ListMessage.class)) {
            List<InventoryItem> inventoryItemList = new ArrayList<>();
            listMessage.when(() -> ListMessage.readItems((ByteBuffer) any())).thenReturn(inventoryItemList);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            InventoryMessage result = InventoryMessage.read(byteBuffer);
            InventoryMessage inventoryMessage = new InventoryMessage(inventoryItemList);
            //Assert statement(s)
            assertThat(result, equalTo(inventoryMessage));
            listMessage.verify(() -> ListMessage.readItems((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${e24ccd1f-d0b9-3b6a-b9e2-c5f5294929ec}
    @Ignore()
    @Test()
    public void ofBlocksWhenBlocksNotIsEmpty() {
        /* Branches:
         * (!blocks.isEmpty()) : true
         */
        //Arrange Statement(s)
        List<Block> blockList = new ArrayList<>();
        blockList.add(blockMock);
        //Act Statement(s)
        InventoryMessage result = InventoryMessage.ofBlocks(blockList);
        List<InventoryItem> inventoryItemList = new ArrayList<>();
        InventoryMessage inventoryMessage = new InventoryMessage(inventoryItemList);
        //Assert statement(s)
        assertThat(result, equalTo(inventoryMessage));
    }

    //Sapient generated method id: ${af723908-3817-381c-9864-e259f833d0f4}
    @Test()
    public void ofBlocksWhenBlocksIsEmpty() {
        /* Branches:
         * (!blocks.isEmpty()) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            List<Block> blockList = new ArrayList<>();
            //Act Statement(s)
            InventoryMessage result = InventoryMessage.ofBlocks(blockList);
            List<InventoryItem> inventoryItemList = new ArrayList<>();
            InventoryMessage inventoryMessage = new InventoryMessage(inventoryItemList);
            //Assert statement(s)
            assertThat(result, equalTo(inventoryMessage));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
        }
    }

    //Sapient generated method id: ${0583fd9b-2306-3b91-8cf8-7e5df3e1748f}
    @Test()
    public void ofBlocks1Test() {
        //Arrange Statement(s)
        try (MockedStatic<InventoryMessage> inventoryMessage = mockStatic(InventoryMessage.class, CALLS_REAL_METHODS)) {
            inventoryMessage.when(() -> InventoryMessage.ofBlocks(anyList())).thenReturn(inventoryMessageMock);
            Block[] blockArray = new Block[]{};
            //Act Statement(s)
            InventoryMessage result = InventoryMessage.ofBlocks(blockArray);
            //Assert statement(s)
            assertThat(result, equalTo(inventoryMessageMock));
            inventoryMessage.verify(() -> InventoryMessage.ofBlocks(anyList()), atLeast(1));
        }
    }

    //Sapient generated method id: ${3552a4a0-a65d-306c-b70f-58832c831556}
    @Ignore()
    @Test()
    public void ofTransactionsWhenTransactionsNotIsEmpty() {
        /* Branches:
         * (!transactions.isEmpty()) : true
         */
        //Arrange Statement(s)
        List<Transaction> transactionList = new ArrayList<>();
        transactionList.add(transactionMock);
        //Act Statement(s)
        InventoryMessage result = InventoryMessage.ofTransactions(transactionList);
        List<InventoryItem> inventoryItemList = new ArrayList<>();
        InventoryMessage inventoryMessage = new InventoryMessage(inventoryItemList);
        //Assert statement(s)
        assertThat(result, equalTo(inventoryMessage));
    }

    //Sapient generated method id: ${288d6813-c336-3dec-82bd-9bf533c08c79}
    @Test()
    public void ofTransactionsWhenTransactionsIsEmpty() {
        /* Branches:
         * (!transactions.isEmpty()) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            List<Transaction> transactionList = new ArrayList<>();
            //Act Statement(s)
            InventoryMessage result = InventoryMessage.ofTransactions(transactionList);
            List<InventoryItem> inventoryItemList = new ArrayList<>();
            InventoryMessage inventoryMessage = new InventoryMessage(inventoryItemList);
            //Assert statement(s)
            assertThat(result, equalTo(inventoryMessage));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
        }
    }

    //Sapient generated method id: ${25f1b851-d259-32de-9021-8efa8340a556}
    @Test()
    public void ofTransactions1Test() {
        //Arrange Statement(s)
        try (MockedStatic<InventoryMessage> inventoryMessage = mockStatic(InventoryMessage.class, CALLS_REAL_METHODS)) {
            inventoryMessage.when(() -> InventoryMessage.ofTransactions(anyList())).thenReturn(inventoryMessageMock);
            Transaction[] transactionArray = new Transaction[]{};
            //Act Statement(s)
            InventoryMessage result = InventoryMessage.ofTransactions(transactionArray);
            //Assert statement(s)
            assertThat(result, equalTo(inventoryMessageMock));
            inventoryMessage.verify(() -> InventoryMessage.ofTransactions(anyList()), atLeast(1));
        }
    }

    //Sapient generated method id: ${40262172-b837-302c-8e81-d600e36bbd21}
    @Test()
    public void addBlockTest() {
        //Arrange Statement(s)
        InventoryItem inventoryItem = new InventoryItem(blockMock);
        List<InventoryItem> inventoryItemList = new ArrayList<>();
        inventoryItemList.add(inventoryItem);
        InventoryMessage target = new InventoryMessage(inventoryItemList);
        //Act Statement(s)
        target.addBlock(blockMock);
    }

    //Sapient generated method id: ${7792ad1e-81d3-3ebb-862c-c536da819bb1}
    @Test()
    public void addTransactionTest() {
        //Arrange Statement(s)
        InventoryItem inventoryItem = new InventoryItem(transactionMock);
        List<InventoryItem> inventoryItemList = new ArrayList<>();
        inventoryItemList.add(inventoryItem);
        InventoryMessage target = new InventoryMessage(inventoryItemList);
        //Act Statement(s)
        target.addTransaction(transactionMock);
    }

    //Sapient generated method id: ${1007f368-7da2-3cb9-b820-1c034659e2c7}
    @Test()
    public void withTest() {
        //Arrange Statement(s)
        try (MockedStatic<InventoryMessage> inventoryMessage = mockStatic(InventoryMessage.class, CALLS_REAL_METHODS)) {
            Transaction[] transactionArray = new Transaction[]{};
            inventoryMessage.when(() -> InventoryMessage.ofTransactions(transactionArray)).thenReturn(inventoryMessageMock);
            //Act Statement(s)
            InventoryMessage result = InventoryMessage.with(transactionArray);
            //Assert statement(s)
            assertThat(result, equalTo(inventoryMessageMock));
            inventoryMessage.verify(() -> InventoryMessage.ofTransactions(transactionArray), atLeast(1));
        }
    }
}
