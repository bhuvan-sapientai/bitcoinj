package org.bitcoinj.wallet;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.script.ScriptException;
import org.junit.rules.ExpectedException;

import java.util.List;

import org.bitcoinj.core.Transaction;
import org.bitcoinj.core.TransactionOutput;
import org.bitcoinj.base.internal.StreamUtils;
import org.bitcoinj.base.Sha256Hash;
import org.bitcoinj.script.ScriptPattern;
import org.bitcoinj.base.Coin;

import java.util.stream.Collector;

import org.bitcoinj.core.TransactionConfidence;
import org.mockito.MockedStatic;

import java.util.ArrayList;

import org.bitcoinj.script.Script;

import java.time.Instant;

import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.isA;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

public class KeyTimeCoinSelectorSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Wallet walletMock = mock(Wallet.class, "wallet");

    private final Coin coinMock = mock(Coin.class);

    private final TransactionOutput outputMock = mock(TransactionOutput.class);

    private final Script scriptMock = mock(Script.class);

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    private final Transaction transactionMock = mock(Transaction.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${fa31a4db-4004-3faf-aef3-12f7d05b4a53}
    @Test()
    public void selectWhenIsConfirmedNotOutput() {
        /* Branches:
         * (!ignorePending) : false  #  inside lambda$select$0 method
         * (wallet.getConfidence(parent).getConfidenceType().equals(TransactionConfidence.ConfidenceType.BUILDING)) : false  #  inside isConfirmed method
         * (isConfirmed(output)) : false  #  inside lambda$select$0 method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(transactionMock).when(outputMock).getParentTransaction();
        Instant instant = Instant.now();
        KeyTimeCoinSelector target = new KeyTimeCoinSelector(walletMock, instant, true);
        TransactionConfidence transactionConfidence = new TransactionConfidence(sha256HashMock);
        transactionConfidence.setConfidenceType(TransactionConfidence.ConfidenceType.UNKNOWN);
        doReturn(transactionConfidence).when(walletMock).getConfidence(transactionMock);
        List<TransactionOutput> transactionOutputList = new ArrayList<>();
        transactionOutputList.add(outputMock);

        //Act Statement(s)
        CoinSelection result = target.select(coinMock, transactionOutputList);

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
        verify(outputMock).getParentTransaction();
        verify(walletMock).getConfidence(transactionMock);
    }

    //Sapient generated method id: ${25125d06-df3a-3cec-b8d4-665654193cdf}
    @Test()
    public void selectWhenCaughtScriptExceptionThrowsRuntimeException() throws ScriptException {
        /* Branches:
         * (!ignorePending) : false  #  inside lambda$select$0 method
         * (wallet.getConfidence(parent).getConfidenceType().equals(TransactionConfidence.ConfidenceType.BUILDING)) : false  #  inside isConfirmed method
         * (isConfirmed(output)) : false  #  inside lambda$select$0 method
         * (catch-exception (ScriptException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<StreamUtils> streamUtils = mockStatic(StreamUtils.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            doReturn(scriptMock).when(outputMock).getScriptPubKey();
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(false);
            //TODO: Needs to return real value
            streamUtils.when(() -> StreamUtils.toUnmodifiableList()).thenReturn(null);
            Instant instant = Instant.now();
            KeyTimeCoinSelector target = new KeyTimeCoinSelector(walletMock, instant, false);
            thrown.expect(RuntimeException.class);
            thrown.expectCause(isA(Transaction.class));
            Coin coin = Coin.valueOf(0L);
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(outputMock);
            //Act Statement(s)
            target.select(coin, transactionOutputList);
            //Assert statement(s)
            verify(outputMock).getScriptPubKey();
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            streamUtils.verify(() -> StreamUtils.toUnmodifiableList(), atLeast(1));
        }
    }

    //Sapient generated method id: ${68c2ddd4-b561-3665-8a65-333199173ea5}
    @Test()
    public void selectWhenOptKeyNotIsPresentAndCaughtScriptExceptionThrowsRuntimeException() throws ScriptException {
        /* Branches:
         * (!ignorePending) : true  #  inside lambda$select$0 method
         * (ScriptPattern.isP2PK(scriptPubKey)) : false  #  inside findKey method
         * (ScriptPattern.isP2PKH(scriptPubKey)) : false  #  inside findKey method
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : false  #  inside findKey method
         * (optKey.isPresent()) : false  #  inside isKeyBeforeCutoff method
         * (catch-exception (ScriptException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<StreamUtils> streamUtils = mockStatic(StreamUtils.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            doReturn(scriptMock).when(outputMock).getScriptPubKey();
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(false);
            Collector collector = StreamUtils.toUnmodifiableList();
            streamUtils.when(() -> StreamUtils.toUnmodifiableList()).thenReturn(collector);
            Instant instant = Instant.now();
            KeyTimeCoinSelector target = new KeyTimeCoinSelector(walletMock, instant, false);
            thrown.expect(RuntimeException.class);
            thrown.expectCause(isA(boolean.class));
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(outputMock);
            //Act Statement(s)
            target.select(coinMock, transactionOutputList);
            //Assert statement(s)
            verify(outputMock).getScriptPubKey();
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            streamUtils.verify(() -> StreamUtils.toUnmodifiableList(), atLeast(1));
        }
    }

    //Sapient generated method id: ${bd86ae90-dc2a-39a5-97db-a58b7c1e1f2c}
    @Test()
    public void selectWhenOptKeyGetCreationTimeOrElseInstantEPOCHIsBeforeTime() {
        /* Branches:
         * (!ignorePending) : false  #  inside lambda$select$0 method
         * (wallet.getConfidence(parent).getConfidenceType().equals(TransactionConfidence.ConfidenceType.BUILDING)) : true  #  inside isConfirmed method
         * (isConfirmed(output)) : true  #  inside lambda$select$0 method
         * (ScriptPattern.isP2PK(scriptPubKey)) : true  #  inside findKey method
         * (optKey.isPresent()) : true  #  inside isKeyBeforeCutoff method
         * (optKey.get().creationTime().orElse(Instant.EPOCH).isBefore(time)) : true  #  inside isKeyBeforeCutoff method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<StreamUtils> streamUtils = mockStatic(StreamUtils.class)) {
            Collector collector = StreamUtils.toUnmodifiableList();
            streamUtils.when(() -> StreamUtils.toUnmodifiableList()).thenReturn(collector);
            Instant instant = Instant.now();
            KeyTimeCoinSelector target = new KeyTimeCoinSelector(walletMock, instant, true);
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            //Act Statement(s)
            CoinSelection result = target.select(coinMock, transactionOutputList);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            streamUtils.verify(() -> StreamUtils.toUnmodifiableList(), atLeast(1));
        }
    }

    //Sapient generated method id: ${5b780c6d-d345-3cf8-93a2-d50910c76755}
    @Test()
    public void selectWhenOptKeyIsPresentAndOptKeyGetCreationTimeOrElseInstantEPOCHNotIsBeforeTime() {
        /* Branches:
         * (!ignorePending) : false  #  inside lambda$select$0 method
         * (wallet.getConfidence(parent).getConfidenceType().equals(TransactionConfidence.ConfidenceType.BUILDING)) : true  #  inside isConfirmed method
         * (isConfirmed(output)) : true  #  inside lambda$select$0 method
         * (ScriptPattern.isP2PK(scriptPubKey)) : false  #  inside findKey method
         * (ScriptPattern.isP2PKH(scriptPubKey)) : true  #  inside findKey method
         * (optKey.isPresent()) : true  #  inside isKeyBeforeCutoff method
         * (optKey.get().creationTime().orElse(Instant.EPOCH).isBefore(time)) : false  #  inside isKeyBeforeCutoff method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<StreamUtils> streamUtils = mockStatic(StreamUtils.class)) {
            //TODO: Needs to return real value
            streamUtils.when(() -> StreamUtils.toUnmodifiableList()).thenReturn(null);
            Instant instant = Instant.now();
            KeyTimeCoinSelector target = new KeyTimeCoinSelector(walletMock, instant, true);
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            //Act Statement(s)
            CoinSelection result = target.select(coinMock, transactionOutputList);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            streamUtils.verify(() -> StreamUtils.toUnmodifiableList(), atLeast(1));
        }
    }

    //Sapient generated method id: ${b90004e6-e8bd-32c5-a4e1-3c177e862eae}
    @Test()
    public void selectWhenScriptPatternNotIsP2WPKHScriptPubKeyAndOptKeyNotIsPresent() throws ScriptException {
        /* Branches:
         * (!ignorePending) : false  #  inside lambda$select$0 method
         * (wallet.getConfidence(parent).getConfidenceType().equals(TransactionConfidence.ConfidenceType.BUILDING)) : true  #  inside isConfirmed method
         * (isConfirmed(output)) : true  #  inside lambda$select$0 method
         * (ScriptPattern.isP2PK(scriptPubKey)) : false  #  inside findKey method
         * (ScriptPattern.isP2PKH(scriptPubKey)) : false  #  inside findKey method
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : false  #  inside findKey method
         * (optKey.isPresent()) : false  #  inside isKeyBeforeCutoff method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            doReturn(transactionMock).when(outputMock).getParentTransaction();
            doReturn(scriptMock).when(outputMock).getScriptPubKey();
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(false);
            Instant instant = Instant.now();
            KeyTimeCoinSelector target = new KeyTimeCoinSelector(walletMock, instant, true);
            TransactionConfidence transactionConfidence = new TransactionConfidence(sha256HashMock);
            transactionConfidence.setConfidenceType(TransactionConfidence.ConfidenceType.BUILDING);
            doReturn(transactionConfidence).when(walletMock).getConfidence(transactionMock);
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(outputMock);
            //Act Statement(s)
            CoinSelection result = target.select(coinMock, transactionOutputList);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            verify(outputMock).getParentTransaction();
            verify(outputMock).getScriptPubKey();
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            verify(walletMock).getConfidence(transactionMock);
        }
    }

    //Sapient generated method id: ${a43d325a-a264-3cea-81fc-34c0d9836073}
    @Test()
    public void selectWhenScriptPatternIsP2WPKHScriptPubKeyAndOptKeyIsPresentAndOptKeyGetCreationTimeOrElseInstantEPOCHNotIsBeforeTime() {
        /* Branches:
         * (!ignorePending) : false  #  inside lambda$select$0 method
         * (wallet.getConfidence(parent).getConfidenceType().equals(TransactionConfidence.ConfidenceType.BUILDING)) : true  #  inside isConfirmed method
         * (isConfirmed(output)) : true  #  inside lambda$select$0 method
         * (ScriptPattern.isP2PK(scriptPubKey)) : false  #  inside findKey method
         * (ScriptPattern.isP2PKH(scriptPubKey)) : false  #  inside findKey method
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : true  #  inside findKey method
         * (optKey.isPresent()) : true  #  inside isKeyBeforeCutoff method
         * (optKey.get().creationTime().orElse(Instant.EPOCH).isBefore(time)) : false  #  inside isKeyBeforeCutoff method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<StreamUtils> streamUtils = mockStatic(StreamUtils.class)) {
            Transaction transaction = new Transaction();
            doReturn(transaction).when(outputMock).getParentTransaction();
            //TODO: Needs to return real value
            streamUtils.when(() -> StreamUtils.toUnmodifiableList()).thenReturn(null);
            Instant instant = Instant.now();
            KeyTimeCoinSelector target = new KeyTimeCoinSelector(walletMock, instant, true);
            TransactionConfidence transactionConfidence = new TransactionConfidence(sha256HashMock);
            doReturn(transactionConfidence).when(walletMock).getConfidence((Transaction) any());
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(outputMock);
            //Act Statement(s)
            CoinSelection result = target.select(coinMock, transactionOutputList);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            verify(outputMock).getParentTransaction();
            streamUtils.verify(() -> StreamUtils.toUnmodifiableList(), atLeast(1));
            verify(walletMock).getConfidence((Transaction) any());
        }
    }
}
