package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;
import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class UtilsSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${b4f8e8ae-065d-3a8b-8ceb-54d9c73bc4b3}
    @Test()
    public void toStringWhenStackIsNotEmpty() {
        /* Branches:
         * (for-each(stack)) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        List<byte[]> byteList = new ArrayList<>();
        byteList.add(byteArray);

        //Act Statement(s)
        String result = Utils.toString(byteList);

        //Assert statement(s)
        assertThat(result, equalTo("[]"));
    }
}
