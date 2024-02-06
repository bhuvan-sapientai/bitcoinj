package org.bitcoinj.wallet;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;

import org.bitcoinj.core.TransactionOutput;
import org.bitcoinj.core.TransactionOutPoint;
import org.bitcoinj.base.internal.StreamUtils;
import org.bitcoinj.base.Sha256Hash;

import java.util.stream.Collector;

import org.bitcoinj.base.Coin;
import org.mockito.MockedStatic;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;
import org.bitcoinj.core.Transaction;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

public class FilteringCoinSelectorSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final CoinSelector delegateMock = mock(CoinSelector.class, "delegate");

    //Sapient generated method id: ${9e2ce5b6-94bc-30f3-943d-762a6bc97ad7}
    @Ignore()
    @Test()
    public void selectWhenSpentNotContainsOutputGetOutPointFor() {
        /* Branches:
         * (!spent.contains(output.getOutPointFor())) : true  #  inside lambda$select$0 method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TransactionOutput outputMock = mock(TransactionOutput.class);
        TransactionOutPoint transactionOutPointMock = mock(TransactionOutPoint.class);
        doReturn(transactionOutPointMock).when(outputMock).getOutPointFor();
        List<TransactionOutPoint> transactionOutPointList = new ArrayList<>();
        FilteringCoinSelector target = new FilteringCoinSelector(delegateMock, transactionOutPointList);
        CoinSelection coinSelectionMock = mock(CoinSelection.class);
        Coin coinMock = mock(Coin.class);
        List list = new ArrayList<>();
        doReturn(coinSelectionMock).when(delegateMock).select(coinMock, list);
        List<TransactionOutput> transactionOutputList = new ArrayList<>();
        transactionOutputList.add(outputMock);

        //Act Statement(s)
        CoinSelection result = target.select(coinMock, transactionOutputList);

        //Assert statement(s)
        assertThat(result, equalTo(coinSelectionMock));
        verify(outputMock).getOutPointFor();
        verify(delegateMock).select(coinMock, list);
    }
}
