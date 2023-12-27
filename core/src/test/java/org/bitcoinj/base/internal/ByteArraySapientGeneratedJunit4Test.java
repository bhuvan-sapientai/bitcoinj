package org.bitcoinj.base.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.mock;

import org.junit.Ignore;
import org.junit.rules.ExpectedException;
import org.mockito.MockedStatic;

import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

public class ByteArraySapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${f230d68a-9413-3d49-ba72-f34d287d0a24}
    @Test()
    public void bytesTest() {
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3, (byte) 4};
        ByteArray target = new ByteArray(byteArray);

        //Act Statement(s)
        byte[] result = target.bytes();
        byte[] byteResultArray = new byte[]{(byte) 1, (byte) 2, (byte) 3, (byte) 4};

        //Assert statement(s)
        assertThat(result, equalTo(byteResultArray));
    }

    //Sapient generated method id: ${a1a42a93-2964-364e-ae5a-e96abe25ad1a}
    @Test()
    public void formatHexTest() {
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byte[] byteArray = new byte[]{(byte) 18, (byte) 52, (byte) 86, (byte) 120};
            byteUtils.when(() -> ByteUtils.formatHex(byteArray)).thenReturn("12345678");
            byte[] byteArray2 = new byte[]{(byte) 18, (byte) 52, (byte) 86, (byte) 120};
            ByteArray target = new ByteArray(byteArray2);
            //Act Statement(s)
            String result = target.formatHex();
            //Assert statement(s)
            assertThat(result, equalTo("12345678"));
            byteUtils.verify(() -> ByteUtils.formatHex(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${af5f6332-26a2-3749-8f9a-ac87ce6fe7cf}
    @Ignore()
    @Test()
    public void compareToTest() {
        //Arrange Statement(s)
        ByteArray byteArrayMock = mock(ByteArray.class, "null");
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            //TODO: Needs to return real value
            byteUtils.when(() -> ByteUtils.arrayUnsignedComparator()).thenReturn(null);
            byte[] byteArray = new byte[]{(byte) 0};
            ByteArray target = new ByteArray(byteArray);
            thrown.expect(NullPointerException.class);
            //Act Statement(s)
            target.compareTo(byteArrayMock);
            //Assert statement(s)
            byteUtils.verify(() -> ByteUtils.arrayUnsignedComparator(), atLeast(1));
        }
    }
}
