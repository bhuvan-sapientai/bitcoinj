package org.bitcoinj.wallet;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;

import org.bitcoinj.base.Coin;

import java.util.Collection;

import org.bitcoinj.core.Transaction;
import org.bitcoinj.core.TransactionOutput;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class CoinSelectionSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Coin coin2Mock = mock(Coin.class);

    private final Transaction transactionMock = mock(Transaction.class);

    //Sapient generated method id: ${59671bab-6f05-338a-800c-34fb3c21b2b7}, hash: 97C2BB1D13C007F616674CE7F1199B73
    @Test()
    public void totalValueTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin coin = Coin.valueOf(0L);
        byte[] byteArray = new byte[]{};
        TransactionOutput transactionOutput = new TransactionOutput(transactionMock, coin2Mock, byteArray);
        Collection<TransactionOutput> collection = new ArrayList<>();
        collection.add(transactionOutput);
        CoinSelection target = new CoinSelection(coin, collection);
        //Act Statement(s)
        Coin result = target.totalValue();
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${8a7db06b-a45c-39f7-9cee-fd18e03e9a46}, hash: 65321C41F21556797CFE7928A8BD5B74
    @Ignore()
    @Test()
    public void outputsTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin coin = Coin.valueOf(0L);
        byte[] byteArray = new byte[]{};
        TransactionOutput transactionOutput = new TransactionOutput(transactionMock, coin2Mock, byteArray);
        Collection<TransactionOutput> collection = new ArrayList<>();
        collection.add(transactionOutput);
        CoinSelection target = new CoinSelection(coin, collection);
        //Act Statement(s)
        List<TransactionOutput> result = target.outputs();
        //Assert statement(s)
        assertThat(result.size(), equalTo(0));
    }
}
