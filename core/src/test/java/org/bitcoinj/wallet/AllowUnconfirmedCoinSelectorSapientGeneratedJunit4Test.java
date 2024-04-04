package org.bitcoinj.wallet;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.core.Transaction;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;

public class AllowUnconfirmedCoinSelectorSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${4999963e-647c-3078-88e1-6dd71b887d11}, hash: CA1F728828CF51411BE6ECEEE249802E
    @Test()
    public void shouldSelectTest() {
        //Arrange Statement(s)
        AllowUnconfirmedCoinSelector target = new AllowUnconfirmedCoinSelector();
        Transaction transactionMock = mock(Transaction.class);

        //Act Statement(s)
        boolean result = target.shouldSelect(transactionMock);

        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${fa77ec73-5d5e-3732-b683-af7decc28622}, hash: 351AC7C13705490DC10007078A581A0D
    @Test()
    public void get1Test() {

        //Act Statement(s)
        CoinSelector result = AllowUnconfirmedCoinSelector.get();

        //Assert statement(s)
        //TODO: Please implement equals method in AllowUnconfirmedCoinSelector for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }
}
