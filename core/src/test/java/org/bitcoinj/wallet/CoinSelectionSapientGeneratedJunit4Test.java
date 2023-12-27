package org.bitcoinj.wallet;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;

import org.bitcoinj.base.Coin;

import java.util.Collection;

import org.bitcoinj.core.TransactionOutput;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;

public class CoinSelectionSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Coin coinMock = mock(Coin.class, "10");

    //Sapient generated method id: ${59671bab-6f05-338a-800c-34fb3c21b2b7}
    @Test()
    public void totalValueTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Collection<TransactionOutput> collection = new ArrayList<>();
        CoinSelection target = new CoinSelection(coinMock, collection);

        //Act Statement(s)
        Coin result = target.totalValue();

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${8a7db06b-a45c-39f7-9cee-fd18e03e9a46}
    @Test()
    public void outputsTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Collection<TransactionOutput> collection = new ArrayList<>();
        CoinSelection target = new CoinSelection(coinMock, collection);

        //Act Statement(s)
        List<TransactionOutput> result = target.outputs();

        //Assert statement(s)
        assertThat(result.size(), equalTo(0));
    }
}
