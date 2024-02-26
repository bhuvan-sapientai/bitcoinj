package org.bitcoinj.wallet;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;

import org.bitcoinj.core.Transaction;
import org.bitcoinj.core.TransactionOutput;
import org.bitcoinj.core.TransactionOutPoint;
import org.bitcoinj.base.internal.StreamUtils;
import org.bitcoinj.base.Sha256Hash;
import org.bitcoinj.base.Coin;

import java.util.stream.Collector;

import org.mockito.MockedStatic;

import java.util.ArrayList;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

public class FilteringCoinSelectorSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final CoinSelector delegateMock = mock(CoinSelector.class, "<CoinSelector>");

    //Sapient generated method id: ${9e2ce5b6-94bc-30f3-943d-762a6bc97ad7}
    @Test()
    public void selectWhenSpentNotContainsOutputGetOutPointFor() {
        /* Branches:
         * (!spent.contains(output.getOutPointFor())) : true  #  inside lambda$select$0 method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Collector collectorMock = mock(Collector.class, "<Collector>");
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Transaction transactionMock = mock(Transaction.class);
        Coin coin2Mock = mock(Coin.class);
        try (MockedStatic<StreamUtils> streamUtils = mockStatic(StreamUtils.class)) {
            streamUtils.when(() -> StreamUtils.toUnmodifiableList()).thenReturn(collectorMock);
            TransactionOutPoint transactionOutPoint = new TransactionOutPoint(0L, sha256HashMock);
            List<TransactionOutPoint> transactionOutPointList = new ArrayList<>();
            transactionOutPointList.add(transactionOutPoint);
            FilteringCoinSelector target = new FilteringCoinSelector(delegateMock, transactionOutPointList);
            List list = new ArrayList<>();
            CoinSelection coinSelection = new CoinSelection(list);
            List list2 = new ArrayList<>();
            doReturn(coinSelection).when(delegateMock).select((Coin) any(), eq(list2));
            Coin coin = Coin.valueOf(0L);
            byte[] byteArray = new byte[]{};
            TransactionOutput transactionOutput = new TransactionOutput(transactionMock, coin2Mock, byteArray);
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(transactionOutput);
            //Act Statement(s)
            CoinSelection result = target.select(coin, transactionOutputList);
            //Assert statement(s)
            assertThat(result, equalTo(coinSelection));
            streamUtils.verify(() -> StreamUtils.toUnmodifiableList(), atLeast(1));
            verify(delegateMock).select((Coin) any(), eq(list2));
        }
    }
}
