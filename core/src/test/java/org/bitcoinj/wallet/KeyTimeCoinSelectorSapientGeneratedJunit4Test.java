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

import org.junit.Ignore;
import org.bitcoinj.base.ScriptType;
import org.bitcoinj.crypto.ECKey;

import java.util.Optional;

public class KeyTimeCoinSelectorSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Wallet walletMock = mock(Wallet.class, "{}");

    private final Coin coinMock = mock(Coin.class, "1000");

    private final TransactionOutput outputMock = mock(TransactionOutput.class, "true");

    private final Script scriptMock = mock(Script.class);

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    private final Transaction transactionMock = mock(Transaction.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    private final ECKey eCKeyMock = mock(ECKey.class);

    //Sapient generated method id: ${25125d06-df3a-3cec-b8d4-665654193cdf}
    @Ignore()
    @Test()
    public void selectWhenCaughtScriptExceptionThrowsRuntimeException() {
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
        Coin coinMock = mock(Coin.class, "1000000");
        try (MockedStatic<StreamUtils> streamUtils = mockStatic(StreamUtils.class)) {
            //TODO: Needs to return real value
            streamUtils.when(() -> StreamUtils.toUnmodifiableList()).thenReturn(null);
            Instant instant = Instant.now();
            KeyTimeCoinSelector target = new KeyTimeCoinSelector(walletMock, instant, true);
            thrown.expect(RuntimeException.class);
            thrown.expectCause(isA(ScriptException.class));
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            //Act Statement(s)
            target.select(coinMock, transactionOutputList);
            //Assert statement(s)
            streamUtils.verify(() -> StreamUtils.toUnmodifiableList(), atLeast(1));
        }
    }

    //Sapient generated method id: ${68c2ddd4-b561-3665-8a65-333199173ea5}
    @Ignore()
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
        Coin coinMock = mock(Coin.class, "1000000");
        try (MockedStatic<StreamUtils> streamUtils = mockStatic(StreamUtils.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            List list = new ArrayList<>();
            Script script = Script.of(list);
            doReturn(script).when(outputMock).getScriptPubKey();
            scriptPattern.when(() -> ScriptPattern.isP2PK((Script) any())).thenReturn(true);
            byte[] byteArray = new byte[]{};
            scriptPattern.when(() -> ScriptPattern.extractKeyFromP2PK((Script) any())).thenReturn(byteArray);
            //TODO: Needs to return real value
            streamUtils.when(() -> StreamUtils.toUnmodifiableList()).thenReturn(null);
            Instant instant = Instant.now();
            KeyTimeCoinSelector target = new KeyTimeCoinSelector(walletMock, instant, false);
            doReturn(eCKeyMock).when(walletMock).findKeyFromPubKey(byteArray);
            doReturn(Optional.empty()).when(eCKeyMock).creationTime();
            thrown.expect(RuntimeException.class);
            thrown.expectCause(isA(ScriptException.class));
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(outputMock);
            //Act Statement(s)
            target.select(coinMock, transactionOutputList);
            //Assert statement(s)
            verify(outputMock).getScriptPubKey();
            scriptPattern.verify(() -> ScriptPattern.isP2PK((Script) any()));
            scriptPattern.verify(() -> ScriptPattern.extractKeyFromP2PK((Script) any()));
            streamUtils.verify(() -> StreamUtils.toUnmodifiableList(), atLeast(1));
            verify(walletMock).findKeyFromPubKey(byteArray);
            verify(eCKeyMock).creationTime();
        }
    }

    //Sapient generated method id: ${bd86ae90-dc2a-39a5-97db-a58b7c1e1f2c}
    @Ignore()
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
        TransactionOutput outputMock = mock(TransactionOutput.class, "[1, 2, 3]");
        Transaction transaction = new Transaction();
        doReturn(transaction).when(outputMock).getParentTransaction();
        TransactionOutput outputMock2 = mock(TransactionOutput.class, "[4, 5, 6]");
        doReturn(null).when(outputMock2).getParentTransaction();
        Instant instant = Instant.now();
        KeyTimeCoinSelector target = new KeyTimeCoinSelector(walletMock, instant, true);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        TransactionConfidence transactionConfidence = new TransactionConfidence(sha256HashMock);
        doReturn(transactionConfidence).when(walletMock).getConfidence((Transaction) any());
        thrown.expect(NullPointerException.class);
        List<TransactionOutput> transactionOutputList = new ArrayList<>();
        transactionOutputList.add(outputMock);
        transactionOutputList.add(outputMock2);

        //Act Statement(s)
        target.select(coinMock, transactionOutputList);

        //Assert statement(s)
        verify(outputMock).getParentTransaction();
        verify(outputMock2).getParentTransaction();
        verify(walletMock).getConfidence((Transaction) any());
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
        Coin coinMock = mock(Coin.class, "1000000");
        try (MockedStatic<StreamUtils> streamUtils = mockStatic(StreamUtils.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            doReturn(null).when(outputMock).getScriptPubKey();
            scriptPattern.when(() -> ScriptPattern.isP2PK((Script) null)).thenReturn(true);
            byte[] byteArray = new byte[]{};
            scriptPattern.when(() -> ScriptPattern.extractKeyFromP2PK((Script) null)).thenReturn(byteArray);
            Collector collector = StreamUtils.toUnmodifiableList();
            streamUtils.when(() -> StreamUtils.toUnmodifiableList()).thenReturn(collector);
            Instant instant = Instant.now();
            KeyTimeCoinSelector target = new KeyTimeCoinSelector(walletMock, instant, false);
            doReturn(eCKeyMock).when(walletMock).findKeyFromPubKey(byteArray);
            doReturn(Optional.empty()).when(eCKeyMock).creationTime();
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(outputMock);
            //Act Statement(s)
            CoinSelection result = target.select(coinMock, transactionOutputList);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            verify(outputMock).getScriptPubKey();
            scriptPattern.verify(() -> ScriptPattern.isP2PK((Script) null), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractKeyFromP2PK((Script) null), atLeast(1));
            streamUtils.verify(() -> StreamUtils.toUnmodifiableList(), atLeast(1));
            verify(walletMock).findKeyFromPubKey(byteArray);
            verify(eCKeyMock).creationTime();
        }
    }

    //Sapient generated method id: ${a43d325a-a264-3cea-81fc-34c0d9836073}
    @Ignore()
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
        TransactionOutput outputMock = mock(TransactionOutput.class, "false");
        doReturn(null).when(outputMock).getParentTransaction();
        TransactionOutput outputMock2 = mock(TransactionOutput.class, "false");
        doReturn(null).when(outputMock2).getParentTransaction();
        Instant instant = Instant.now();
        KeyTimeCoinSelector target = new KeyTimeCoinSelector(walletMock, instant, true);
        thrown.expect(NullPointerException.class);
        List<TransactionOutput> transactionOutputList = new ArrayList<>();
        transactionOutputList.add(outputMock);
        transactionOutputList.add(outputMock2);

        //Act Statement(s)
        target.select(coinMock, transactionOutputList);

        //Assert statement(s)
        verify(outputMock).getParentTransaction();
        verify(outputMock2).getParentTransaction();
    }
}
