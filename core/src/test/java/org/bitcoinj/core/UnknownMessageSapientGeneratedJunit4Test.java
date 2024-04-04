package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class UnknownMessageSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: B325A103A539F7D4D6D1719826B41683
    @Test()
    public void toStringTest() throws ProtocolException {
        //Arrange Statement(s)
        UnknownMessage target = new UnknownMessage("A");

        //Act Statement(s)
        String result = target.toString();

        //Assert statement(s)
        assertThat(result, equalTo("Unknown message [A]"));
    }
}
