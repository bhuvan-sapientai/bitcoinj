package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.nio.BufferUnderflowException;
import java.util.List;

import org.mockito.MockedStatic;

import java.nio.ByteBuffer;
import java.util.ArrayList;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;

public class InventoryMessageSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final InventoryMessage inventoryMessageMock = mock(InventoryMessage.class);

    //Sapient generated method id: ${db344e3b-696d-3b02-8e35-1aaa5300bde6}, hash: 81AA9924867CBE044F66AB16E4DE28FC
    @Test()
    public void readTest() throws BufferUnderflowException, ProtocolException {
        //Arrange Statement(s)
        try (MockedStatic<ListMessage> listMessage = mockStatic(ListMessage.class)) {
            List<InventoryItem> inventoryItemList = new ArrayList<>();
            listMessage.when(() -> ListMessage.readItems((ByteBuffer) any())).thenReturn(inventoryItemList);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            InventoryMessage result = InventoryMessage.read(byteBuffer);
            InventoryMessage inventoryMessage = new InventoryMessage(inventoryItemList);
            //Assert statement(s)
            assertThat(result, equalTo(inventoryMessage));
            listMessage.verify(() -> ListMessage.readItems((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${0583fd9b-2306-3b91-8cf8-7e5df3e1748f}, hash: FF0116B7A092541ED0EFD136DDF10C03
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

    //Sapient generated method id: ${25f1b851-d259-32de-9021-8efa8340a556}, hash: 4E1EE96393EE18CFA0CEFC49A2AC2D5D
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

    //Sapient generated method id: ${40262172-b837-302c-8e81-d600e36bbd21}, hash: BB31F6731F1FA34EBAE1DD39E8F14DC1
    @Test()
    public void addBlockTest() {
        //Arrange Statement(s)
        Block blockMock = mock(Block.class);
        InventoryItem inventoryItem = new InventoryItem(blockMock);
        List<InventoryItem> inventoryItemList = new ArrayList<>();
        inventoryItemList.add(inventoryItem);
        InventoryMessage target = new InventoryMessage(inventoryItemList);

        //Act Statement(s)
        target.addBlock(blockMock);
    }

    //Sapient generated method id: ${7792ad1e-81d3-3ebb-862c-c536da819bb1}, hash: 27B083CE0A666493E77512A5B50252AD
    @Test()
    public void addTransactionTest() {
        //Arrange Statement(s)
        Transaction transactionMock = mock(Transaction.class);
        InventoryItem inventoryItem = new InventoryItem(transactionMock);
        List<InventoryItem> inventoryItemList = new ArrayList<>();
        inventoryItemList.add(inventoryItem);
        InventoryMessage target = new InventoryMessage(inventoryItemList);

        //Act Statement(s)
        target.addTransaction(transactionMock);
    }

    //Sapient generated method id: ${1007f368-7da2-3cb9-b820-1c034659e2c7}, hash: 7F31E074985D4F4B87D7353801EE4855
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
