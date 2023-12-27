package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;

import org.bitcoinj.base.internal.ByteUtils;
import org.mockito.MockedStatic;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInRelativeOrder;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

public class UtilsSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${b4f8e8ae-065d-3a8b-8ceb-54d9c73bc4b3}
    @Ignore()
    @Test()
    public void toStringWhenStackIsNotEmpty() {
        /* Branches:
         * (for-each(stack)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byte[] byteArray = new byte[]{};
            byteUtils.when(() -> ByteUtils.formatHex(byteArray)).thenReturn("");
            byte[] byteArray2 = new byte[]{};
            List<byte[]> byteList = new ArrayList<>();
            byteList.add(byteArray2);
            //Act Statement(s)
            String result = Utils.toString(byteList);
            List<byte[]> byteByteListList = new ArrayList<>();
            byteByteListList.add(byteArray);
            //Assert statement(s)
            assertThat(result, equalTo("[]"));
            assertThat(byteList.size(), equalTo(byteByteListList.size()));
            assertThat(byteList, containsInRelativeOrder(byteByteListList.toArray()));
            byteUtils.verify(() -> ByteUtils.formatHex(byteArray), atLeast(1));
        }
    }
}
