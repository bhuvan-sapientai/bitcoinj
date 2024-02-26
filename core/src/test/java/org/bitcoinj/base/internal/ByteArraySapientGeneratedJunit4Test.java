package org.bitcoinj.base.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ByteArraySapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${f230d68a-9413-3d49-ba72-f34d287d0a24}
    @Test()
    public void bytesTest() {
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        ByteArray target = new ByteArray(byteArray);

        //Act Statement(s)
        byte[] result = target.bytes();
        byte[] byteResultArray = new byte[]{};

        //Assert statement(s)
        assertThat(result, equalTo(byteResultArray));
    }

    //Sapient generated method id: ${a1a42a93-2964-364e-ae5a-e96abe25ad1a}
    @Test()
    public void formatHexTest() {
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        ByteArray target = new ByteArray(byteArray);

        //Act Statement(s)
        String result = target.formatHex();

        //Assert statement(s)
        assertThat(result, equalTo(""));
    }

    //Sapient generated method id: ${af5f6332-26a2-3749-8f9a-ac87ce6fe7cf}
    @Test()
    public void compareToTest() {
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        ByteArray target = new ByteArray(byteArray);
        byte[] byteArray2 = new byte[]{};
        ByteArray byteArray3 = new ByteArray(byteArray2);

        //Act Statement(s)
        int result = target.compareTo(byteArray3);

        //Assert statement(s)
        assertThat(result, equalTo(0));
    }
}
