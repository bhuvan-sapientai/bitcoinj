package org.bitcoinj.wallet;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.base.Network;

import java.util.List;

import org.bitcoinj.core.Transaction;
import org.bitcoinj.core.TransactionOutput;
import org.bitcoinj.core.TransactionConfidence;
import org.bitcoinj.base.Sha256Hash;
import org.bitcoinj.base.BitcoinNetwork;

import java.math.BigInteger;

import org.bitcoinj.base.Coin;
import org.mockito.MockedStatic;

import java.util.ArrayList;

import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInRelativeOrder;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

public class DefaultCoinSelectorSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final TransactionOutput aMock = mock(TransactionOutput.class);

    private final TransactionOutput bMock = mock(TransactionOutput.class);

    private final Coin coinMock = mock(Coin.class);

    private final Network networkMock = mock(Network.class);

    private final TransactionConfidence transactionConfidenceMock = mock(TransactionConfidence.class);

    private final Transaction transactionMock = mock(Transaction.class);

    private final Transaction txMock = mock(Transaction.class);

    //Sapient generated method id: ${6df8707e-9185-30b4-8c99-8abb00f110d8}
    @Test()
    public void selectWhenTotalGreaterThanOrEqualsToTargetValue() {
        /* Branches:
         * (!target.equals(BitcoinNetwork.MAX_MONEY)) : true
         * (for-each(sortedOutputs)) : true
         * (total >= target.value) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DefaultCoinSelector target = new DefaultCoinSelector();
        TransactionOutput transactionOutputMock = mock(TransactionOutput.class);
        List<TransactionOutput> transactionOutputList = new ArrayList<>();
        transactionOutputList.add(transactionOutputMock);

        //Act Statement(s)
        CoinSelection result = target.select(coinMock, transactionOutputList);

        //Assert statement(s)
        //TODO: Please implement equals method in CoinSelection for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${5eb292a3-c78e-36d5-94e6-2b0fb99d4b29}
    @Test()
    public void selectWhenShouldSelectNotOutputGetParentTransaction() {
        /* Branches:
         * (!target.equals(BitcoinNetwork.MAX_MONEY)) : false
         * (for-each(sortedOutputs)) : true
         * (total >= target.value) : false
         * (!shouldSelect(output.getParentTransaction())) : true
         */
        //Arrange Statement(s)
        TransactionOutput outputMock = mock(TransactionOutput.class);
        doReturn(transactionMock).when(outputMock).getParentTransaction();
        DefaultCoinSelector target = spy(new DefaultCoinSelector());
        doReturn(false).when(target).shouldSelect(transactionMock);
        Coin coin = BitcoinNetwork.MAX_MONEY;
        List<TransactionOutput> transactionOutputList = new ArrayList<>();
        transactionOutputList.add(outputMock);

        //Act Statement(s)
        CoinSelection result = target.select(coin, transactionOutputList);
        List<TransactionOutput> transactionOutputTransactionOutputListList = new ArrayList<>();
        transactionOutputTransactionOutputListList.add(outputMock);

        //Assert statement(s)
        //TODO: Please implement equals method in CoinSelection for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
        assertThat(transactionOutputList.size(), equalTo(transactionOutputTransactionOutputListList.size()));
        assertThat(transactionOutputList, containsInRelativeOrder(transactionOutputTransactionOutputListList.toArray()));
        verify(outputMock).getParentTransaction();
        verify(target).shouldSelect(transactionMock);
    }

    //Sapient generated method id: ${4e845f71-377a-3bf8-9408-a25f76e968ef}
    @Test()
    public void compareByDepthWhenC1NotEquals0() {
        /* Branches:
         * (c1 != 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(0).when(aMock).getParentTransactionDepthInBlocks();
        Coin coin = Coin.valueOf(0L);
        doReturn(coin).when(aMock).getValue();
        doReturn(0).when(bMock).getParentTransactionDepthInBlocks();
        Coin coin2 = Coin.valueOf(0L);
        doReturn(coin2).when(bMock).getValue();

        //Act Statement(s)
        int result = DefaultCoinSelector.compareByDepth(aMock, bMock);

        //Assert statement(s)
        assertThat(result, equalTo(0));
        verify(aMock).getParentTransactionDepthInBlocks();
        verify(aMock).getValue();
        verify(bMock).getParentTransactionDepthInBlocks();
        verify(bMock).getValue();
    }

    //Sapient generated method id: ${de65a6ec-5538-3b88-9a48-d1ca025f39ae}
    @Test()
    public void compareByDepthWhenC2NotEquals0() {
        /* Branches:
         * (c1 != 0) : false
         * (c2 != 0) : true
         */
        //Arrange Statement(s)
        doReturn(1).when(aMock).getParentTransactionDepthInBlocks();
        Coin coin = Coin.valueOf(0L);
        doReturn(coin).when(aMock).getValue();
        doReturn(1).when(bMock).getParentTransactionDepthInBlocks();
        doReturn(coinMock).when(bMock).getValue();
        doReturn(1).when(coinMock).compareTo((Coin) any());

        //Act Statement(s)
        int result = DefaultCoinSelector.compareByDepth(aMock, bMock);

        //Assert statement(s)
        assertThat(result, equalTo(1));
        verify(aMock).getParentTransactionDepthInBlocks();
        verify(aMock).getValue();
        verify(bMock).getParentTransactionDepthInBlocks();
        verify(bMock).getValue();
        verify(coinMock).compareTo((Coin) any());
    }

    //Sapient generated method id: ${dfe94ebd-a3a3-3a90-aaac-e58a4d884458}
    @Test()
    public void compareByDepthWhenC2Equals0() {
        /* Branches:
         * (c1 != 0) : false
         * (c2 != 0) : false
         */
        //Arrange Statement(s)
        doReturn(0).when(aMock).getParentTransactionDepthInBlocks();
        Coin coin = Coin.valueOf(0L);
        doReturn(coin).when(aMock).getValue();
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        doReturn(sha256HashMock).when(aMock).getParentTransactionHash();
        doReturn(new BigInteger("0")).when(sha256HashMock).toBigInteger();
        doReturn(0).when(bMock).getParentTransactionDepthInBlocks();
        doReturn(coinMock).when(bMock).getValue();
        doReturn(0).when(coinMock).compareTo((Coin) any());
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        doReturn(sha256HashMock2).when(bMock).getParentTransactionHash();
        doReturn(new BigInteger("0")).when(sha256HashMock2).toBigInteger();

        //Act Statement(s)
        int result = DefaultCoinSelector.compareByDepth(aMock, bMock);

        //Assert statement(s)
        assertThat(result, equalTo(0));
        verify(aMock).getParentTransactionDepthInBlocks();
        verify(aMock).getValue();
        verify(aMock).getParentTransactionHash();
        verify(sha256HashMock).toBigInteger();
        verify(bMock).getParentTransactionDepthInBlocks();
        verify(bMock).getValue();
        verify(coinMock).compareTo((Coin) any());
        verify(bMock).getParentTransactionHash();
        verify(sha256HashMock2).toBigInteger();
    }

    //Sapient generated method id: ${2d5f29f1-90e7-3f61-a9d7-f2281c1948cc}
    @Test()
    public void sortOutputsTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ArrayList<TransactionOutput> transactionOutputList = new ArrayList<>();

        //Act Statement(s)
        DefaultCoinSelector.sortOutputs(transactionOutputList);
    }

    //Sapient generated method id: ${127bc44c-a0ba-3224-9ca7-a5fa510f205a}
    @Test()
    public void shouldSelectWhenTxIsNull() {
        /* Branches:
         * (tx != null) : false
         */
        //Arrange Statement(s)
        DefaultCoinSelector target = new DefaultCoinSelector();
        Transaction transaction = null;

        //Act Statement(s)
        boolean result = target.shouldSelect(transaction);

        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${c1d3a393-7b69-3f73-8b6d-05007fead242}
    @Test()
    public void shouldSelectWhenIsSelectableTxNetwork() {
        /* Branches:
         * (tx != null) : true
         * (isSelectable(tx, network)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class)) {
            defaultCoinSelector.when(() -> DefaultCoinSelector.isSelectable(transactionMock, (Network) null)).thenReturn(true);
            DefaultCoinSelector target = new DefaultCoinSelector();
            //Act Statement(s)
            boolean result = target.shouldSelect(transactionMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.isSelectable(transactionMock, (Network) null), atLeast(1));
        }
    }

    //Sapient generated method id: ${a29b9276-8173-33bc-9caf-a3253699eeee}
    @Test()
    public void shouldSelectWhenIsSelectableNotTxNetwork() {
        /* Branches:
         * (tx != null) : true
         * (isSelectable(tx, network)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<DefaultCoinSelector> defaultCoinSelector = mockStatic(DefaultCoinSelector.class)) {
            defaultCoinSelector.when(() -> DefaultCoinSelector.isSelectable(transactionMock, (Network) null)).thenReturn(false);
            DefaultCoinSelector target = new DefaultCoinSelector();
            //Act Statement(s)
            boolean result = target.shouldSelect(transactionMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            defaultCoinSelector.verify(() -> DefaultCoinSelector.isSelectable(transactionMock, (Network) null), atLeast(1));
        }
    }

    //Sapient generated method id: ${fc65debb-8109-37a9-ad7b-dfecacf529af}
    @Test()
    public void isSelectableWhenNetworkEqualsBitcoinNetworkREGTEST() {
        /* Branches:
         * (type.equals(TransactionConfidence.ConfidenceType.BUILDING)) : false
         * (type.equals(TransactionConfidence.ConfidenceType.PENDING)) : true
         * (confidence.getSource().equals(TransactionConfidence.Source.SELF)) : true
         * (confidence.numBroadcastPeers() > 0) : false
         * (network == BitcoinNetwork.REGTEST) : true
         */
        //Arrange Statement(s)
        doReturn(transactionConfidenceMock).when(txMock).getConfidence();
        doReturn(TransactionConfidence.ConfidenceType.PENDING).when(transactionConfidenceMock).getConfidenceType();
        doReturn(TransactionConfidence.Source.SELF).when(transactionConfidenceMock).getSource();
        doReturn(-1).when(transactionConfidenceMock).numBroadcastPeers();

        //Act Statement(s)
        boolean result = DefaultCoinSelector.isSelectable(txMock, BitcoinNetwork.REGTEST);

        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(txMock).getConfidence();
        verify(transactionConfidenceMock).getConfidenceType();
        verify(transactionConfidenceMock).getSource();
        verify(transactionConfidenceMock).numBroadcastPeers();
    }

    //Sapient generated method id: ${921e8a4a-751f-3a9b-a224-63673436c9fa}
    @Test()
    public void isSelectableWhenNetworkNotEqualsBitcoinNetworkREGTEST() {
        /* Branches:
         * (type.equals(TransactionConfidence.ConfidenceType.BUILDING)) : false
         * (type.equals(TransactionConfidence.ConfidenceType.PENDING)) : true
         * (confidence.getSource().equals(TransactionConfidence.Source.SELF)) : true
         * (confidence.numBroadcastPeers() > 0) : false
         * (network == BitcoinNetwork.REGTEST) : false
         */
        //Arrange Statement(s)
        doReturn(transactionConfidenceMock).when(txMock).getConfidence();
        doReturn(TransactionConfidence.ConfidenceType.PENDING).when(transactionConfidenceMock).getConfidenceType();
        doReturn(TransactionConfidence.Source.SELF).when(transactionConfidenceMock).getSource();
        doReturn(-1).when(transactionConfidenceMock).numBroadcastPeers();

        //Act Statement(s)
        boolean result = DefaultCoinSelector.isSelectable(txMock, networkMock);

        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(txMock).getConfidence();
        verify(transactionConfidenceMock).getConfidenceType();
        verify(transactionConfidenceMock).getSource();
        verify(transactionConfidenceMock).numBroadcastPeers();
    }

    //Sapient generated method id: ${9c25887d-767d-38e9-b5ae-c2e4012c49be}
    @Test()
    public void getTest() {

        //Act Statement(s)
        CoinSelector result = DefaultCoinSelector.get(networkMock);

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }
}
