package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.nio.BufferUnderflowException;
import java.util.List;

import org.mockito.MockedStatic;

import java.nio.ByteBuffer;
import java.util.ArrayList;

import org.bitcoinj.base.Sha256Hash;

import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class GetDataMessageSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    //Sapient generated method id: ${db344e3b-696d-3b02-8e35-1aaa5300bde6}
    @Test()
    public void readTest() throws BufferUnderflowException, ProtocolException {
        //Arrange Statement(s)
        try (MockedStatic<ListMessage> listMessage = mockStatic(ListMessage.class)) {
            List<InventoryItem> inventoryItemList = new ArrayList<>();
            listMessage.when(() -> ListMessage.readItems((ByteBuffer) any())).thenReturn(inventoryItemList);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            GetDataMessage result = GetDataMessage.read(byteBuffer);
            GetDataMessage getDataMessage = new GetDataMessage(inventoryItemList);
            //Assert statement(s)
            assertThat(result, equalTo(getDataMessage));
            listMessage.verify(() -> ListMessage.readItems((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${96db79a1-bd81-3a07-883c-face0f2082fc}
    @Ignore()
    @Test()
    public void ofBlockWhenIncludeWitness() {
        /* Branches:
         * (includeWitness) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        //Act Statement(s)
        GetDataMessage result = GetDataMessage.ofBlock(sha256Hash, true);
        List<InventoryItem> inventoryItemList = new ArrayList<>();
        GetDataMessage getDataMessage = new GetDataMessage(inventoryItemList);
        //Assert statement(s)
        assertThat(result, equalTo(getDataMessage));
    }

    //Sapient generated method id: ${f0b3b1a2-5515-3aec-9c71-414b46e5274d}
    @Ignore()
    @Test()
    public void ofBlockWhenNotIncludeWitness() {
        /* Branches:
         * (includeWitness) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        //Act Statement(s)
        GetDataMessage result = GetDataMessage.ofBlock(sha256Hash, false);
        List<InventoryItem> inventoryItemList = new ArrayList<>();
        GetDataMessage getDataMessage = new GetDataMessage(inventoryItemList);
        //Assert statement(s)
        assertThat(result, equalTo(getDataMessage));
    }

    //Sapient generated method id: ${12dc8b9a-b8c4-312d-a3ab-935cdccfc337}
    @Ignore()
    @Test()
    public void ofTransactionWhenIncludeWitness() {
        /* Branches:
         * (includeWitness) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        //Act Statement(s)
        GetDataMessage result = GetDataMessage.ofTransaction(sha256Hash, true);
        List<InventoryItem> inventoryItemList = new ArrayList<>();
        GetDataMessage getDataMessage = new GetDataMessage(inventoryItemList);
        //Assert statement(s)
        assertThat(result, equalTo(getDataMessage));
    }

    //Sapient generated method id: ${eb9b7c03-bee0-3759-84bd-b7339040fea4}
    @Ignore()
    @Test()
    public void ofTransactionWhenNotIncludeWitness() {
        /* Branches:
         * (includeWitness) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        //Act Statement(s)
        GetDataMessage result = GetDataMessage.ofTransaction(sha256Hash, false);
        List<InventoryItem> inventoryItemList = new ArrayList<>();
        GetDataMessage getDataMessage = new GetDataMessage(inventoryItemList);
        //Assert statement(s)
        assertThat(result, equalTo(getDataMessage));
    }

    //Sapient generated method id: ${52c7a0c2-0855-3fe3-9ac3-cd00f998d24c}
    @Test()
    public void addTransactionWhenIncludeWitness() {
        /* Branches:
         * (includeWitness) : true
         */
        //Arrange Statement(s)
        InventoryItem inventoryItem = new InventoryItem(InventoryItem.Type.ERROR, sha256HashMock);
        List<InventoryItem> inventoryItemList = new ArrayList<>();
        inventoryItemList.add(inventoryItem);
        GetDataMessage target = new GetDataMessage(inventoryItemList);
        //Act Statement(s)
        target.addTransaction(sha256HashMock, true);
    }

    //Sapient generated method id: ${b35789c3-87aa-36a7-9dea-e94d9f46cc20}
    @Test()
    public void addTransactionWhenNotIncludeWitness() {
        /* Branches:
         * (includeWitness) : false
         */
        //Arrange Statement(s)
        InventoryItem inventoryItem = new InventoryItem(InventoryItem.Type.TRANSACTION, sha256HashMock);
        List<InventoryItem> inventoryItemList = new ArrayList<>();
        inventoryItemList.add(inventoryItem);
        GetDataMessage target = new GetDataMessage(inventoryItemList);
        //Act Statement(s)
        target.addTransaction(sha256HashMock, false);
    }

    //Sapient generated method id: ${95ed973f-49a4-3282-ad9a-d786d1eb528f}
    @Test()
    public void addBlockWhenIncludeWitness() {
        /* Branches:
         * (includeWitness) : true
         */
        //Arrange Statement(s)
        InventoryItem inventoryItem = new InventoryItem(InventoryItem.Type.ERROR, sha256HashMock);
        List<InventoryItem> inventoryItemList = new ArrayList<>();
        inventoryItemList.add(inventoryItem);
        GetDataMessage target = new GetDataMessage(inventoryItemList);
        //Act Statement(s)
        target.addBlock(sha256HashMock, true);
    }

    //Sapient generated method id: ${766d3443-3aa7-3e6e-8f53-a27b29c0f9a2}
    @Test()
    public void addBlockWhenNotIncludeWitness() {
        /* Branches:
         * (includeWitness) : false
         */
        //Arrange Statement(s)
        InventoryItem inventoryItem = new InventoryItem(InventoryItem.Type.BLOCK, sha256HashMock);
        List<InventoryItem> inventoryItemList = new ArrayList<>();
        inventoryItemList.add(inventoryItem);
        GetDataMessage target = new GetDataMessage(inventoryItemList);
        //Act Statement(s)
        target.addBlock(sha256HashMock, false);
    }

    //Sapient generated method id: ${4fcf2a34-347c-315e-85cb-619d2e61fdb7}
    @Test()
    public void addFilteredBlockTest() {
        //Arrange Statement(s)
        InventoryItem inventoryItem = new InventoryItem(InventoryItem.Type.FILTERED_BLOCK, sha256HashMock);
        List<InventoryItem> inventoryItemList = new ArrayList<>();
        inventoryItemList.add(inventoryItem);
        GetDataMessage target = new GetDataMessage(inventoryItemList);
        //Act Statement(s)
        target.addFilteredBlock(sha256HashMock);
    }

    //Sapient generated method id: ${bc6b0301-4361-3b72-a541-5d984562aa59}
    @Ignore()
    @Test()
    public void getHashOfTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        InventoryItem inventoryItem = new InventoryItem(InventoryItem.Type.ERROR, sha256Hash);
        ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
        InventoryItem inventoryItem2 = new InventoryItem(InventoryItem.Type.ERROR, sha256Hash2);
        List<InventoryItem> inventoryItemList = new ArrayList<>();
        inventoryItemList.add(inventoryItem);
        inventoryItemList.add(inventoryItem2);
        GetDataMessage target = new GetDataMessage(inventoryItemList);
        //Act Statement(s)
        Sha256Hash result = target.getHashOf(1);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }
}
