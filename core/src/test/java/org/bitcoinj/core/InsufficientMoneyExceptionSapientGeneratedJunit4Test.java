package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.base.Coin;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class InsufficientMoneyExceptionSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${d2023724-fb02-31bf-8f56-c852070520c4}
    @Ignore()
    @Test()
    public void formatTest() {
        //Arrange Statement(s)
        Coin coin = Coin.valueOf(0L);
        Coin coin2 = Coin.valueOf(0L);
        Coin coin3 = Coin.valueOf(0L);
        Coin coin4 = Coin.valueOf(0L);
        //Act Statement(s)
        String result = InsufficientMoneyException.format(coin, coin2, coin3, coin4);
        //Assert statement(s)
        assertThat(result, equalTo("Insufficient money, missing 0.00 BTC (available: 0.00 BTC, total outputs: 0.00 BTC, fee: A)"));
    }
}
