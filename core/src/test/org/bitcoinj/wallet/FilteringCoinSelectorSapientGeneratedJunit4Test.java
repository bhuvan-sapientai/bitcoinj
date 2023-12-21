package org.bitcoinj.wallet;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;

import org.bitcoinj.core.TransactionOutput;
import org.bitcoinj.core.TransactionOutPoint;
import org.bitcoinj.base.internal.StreamUtils;
import org.bitcoinj.base.Sha256Hash;
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
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        TransactionOutput outputMock2 = mock(TransactionOutput.class);
        TransactionOutPoint transactionOutPointMock = mock(TransactionOutPoint.class);
        TransactionOutPoint transactionOutPoint2Mock = mock(TransactionOutPoint.class);
        Coin coinMock = mock(Coin.class);
        try (MockedStatic<StreamUtils> streamUtils = mockStatic(StreamUtils.class)) {
            TransactionOutPoint transactionOutPoint = new TransactionOutPoint(0L, sha256HashMock);
            doReturn(transactionOutPoint).when(outputMock).getOutPointFor();
            doReturn(transactionOutPointMock).when(outputMock2).getOutPointFor();
            //TODO: Needs to return real value
            streamUtils.when(() -> StreamUtils.toUnmodifiableList()).thenReturn(null);
            List<TransactionOutPoint> transactionOutPointList = new ArrayList<>();
            transactionOutPointList.add(transactionOutPoint2Mock);
            FilteringCoinSelector target = new FilteringCoinSelector(delegateMock, transactionOutPointList);
            List list = new ArrayList<>();
            CoinSelection coinSelection = new CoinSelection(list);
            List list2 = new ArrayList<>();
            doReturn(coinSelection).when(delegateMock).select(coinMock, list2);
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(outputMock);
            transactionOutputList.add(outputMock2);
            //Act Statement(s)
            CoinSelection result = target.select(coinMock, transactionOutputList);
            //Assert statement(s)
            assertThat(result, equalTo(coinSelection));
            verify(outputMock).getOutPointFor();
            verify(outputMock2).getOutPointFor();
            streamUtils.verify(() -> StreamUtils.toUnmodifiableList(), atLeast(1));
            verify(delegateMock).select(coinMock, list2);
        }
    }
}
