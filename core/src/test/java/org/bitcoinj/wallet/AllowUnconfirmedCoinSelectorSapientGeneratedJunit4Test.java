package org.bitcoinj.wallet;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.core.Transaction;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.mock;

import org.junit.Ignore;

public class AllowUnconfirmedCoinSelectorSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${4999963e-647c-3078-88e1-6dd71b887d11}
    @Test()
    public void shouldSelectTest() {
        //Arrange Statement(s)
        AllowUnconfirmedCoinSelector target = new AllowUnconfirmedCoinSelector();
        Transaction transaction = new Transaction();

        //Act Statement(s)
        boolean result = target.shouldSelect(transaction);

        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }
}
