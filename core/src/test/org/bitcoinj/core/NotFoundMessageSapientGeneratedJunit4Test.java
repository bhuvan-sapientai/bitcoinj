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
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

public class NotFoundMessageSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${9a54749b-a2d6-3bfc-8884-2b564dca3b2f}
    @Test()
    public void read1Test() throws BufferUnderflowException, ProtocolException {
        //Arrange Statement(s)
        try (MockedStatic<ListMessage> listMessage = mockStatic(ListMessage.class)) {
            List<InventoryItem> inventoryItemList = new ArrayList<>();
            listMessage.when(() -> ListMessage.readItems((ByteBuffer) any())).thenReturn(inventoryItemList);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            NotFoundMessage result = NotFoundMessage.read(byteBuffer);
            NotFoundMessage notFoundMessage = new NotFoundMessage(inventoryItemList);
            //Assert statement(s)
            assertThat(result, equalTo(notFoundMessage));
            listMessage.verify(() -> ListMessage.readItems((ByteBuffer) any()));
        }
    }
}
