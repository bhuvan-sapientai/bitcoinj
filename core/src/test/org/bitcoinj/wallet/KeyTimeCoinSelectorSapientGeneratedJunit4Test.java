package org.bitcoinj.wallet;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.script.ScriptException;
import org.junit.rules.ExpectedException;

import java.util.List;

import org.bitcoinj.base.ScriptType;
import org.bitcoinj.core.Transaction;
import org.bitcoinj.core.TransactionOutput;
import org.bitcoinj.crypto.ECKey;
import org.bitcoinj.script.ScriptPattern;
import org.bitcoinj.base.Coin;
import org.bitcoinj.core.TransactionConfidence;

import java.util.ArrayList;
import java.util.Optional;

import org.bitcoinj.script.Script;
import org.bitcoinj.base.internal.StreamUtils;
import org.bitcoinj.base.Sha256Hash;

import java.util.stream.Collector;

import org.mockito.MockedStatic;

import java.time.Instant;

import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.isA;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class KeyTimeCoinSelectorSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Wallet walletMock = mock(Wallet.class, "wallet");

    private final Coin coinMock = mock(Coin.class);

    private final ECKey eCKeyMock = mock(ECKey.class);

    private final TransactionOutput outputMock = mock(TransactionOutput.class);

    private final Script scriptMock = mock(Script.class);

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    private final Transaction transactionMock = mock(Transaction.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${fa31a4db-4004-3faf-aef3-12f7d05b4a53}
    @Ignore()
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
        try (MockedStatic<StreamUtils> streamUtils = mockStatic(StreamUtils.class)) {
            doReturn(transactionMock).when(outputMock).getParentTransaction();
            Collector collector = StreamUtils.toUnmodifiableList();
            streamUtils.when(() -> StreamUtils.toUnmodifiableList()).thenReturn(collector);
            Instant instant = Instant.now();
            KeyTimeCoinSelector target = new KeyTimeCoinSelector(walletMock, instant, true);
            TransactionConfidence transactionConfidence = new TransactionConfidence(sha256HashMock);
            doReturn(transactionConfidence).when(walletMock).getConfidence(transactionMock);
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(outputMock);
            //Act Statement(s)
            CoinSelection result = target.select(coinMock, transactionOutputList);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            verify(outputMock).getParentTransaction();
            streamUtils.verify(() -> StreamUtils.toUnmodifiableList(), atLeast(1));
            verify(walletMock).getConfidence(transactionMock);
        }
    }

    //Sapient generated method id: ${25125d06-df3a-3cec-b8d4-665654193cdf}
    @Ignore()
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
        TransactionOutput outputMock2 = mock(TransactionOutput.class);
        Script scriptMock2 = mock(Script.class);
        TransactionOutput outputMock3 = mock(TransactionOutput.class);
        Script scriptMock3 = mock(Script.class);
        try (MockedStatic<StreamUtils> streamUtils = mockStatic(StreamUtils.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            doReturn(scriptMock).when(outputMock).getScriptPubKey();
            doReturn(scriptMock2).when(outputMock2).getScriptPubKey();
            doReturn(scriptMock3).when(outputMock3).getScriptPubKey();
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock2)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock2)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock2)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock3)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock3)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock3)).thenReturn(false);
            Collector collector = StreamUtils.toUnmodifiableList();
            streamUtils.when(() -> StreamUtils.toUnmodifiableList()).thenReturn(collector);
            Instant instant = Instant.now();
            KeyTimeCoinSelector target = new KeyTimeCoinSelector(walletMock, instant, false);
            thrown.expect(RuntimeException.class);
            thrown.expectCause(isA(TransactionConfidence.class));
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(outputMock);
            transactionOutputList.add(outputMock2);
            transactionOutputList.add(outputMock3);
            //Act Statement(s)
            target.select(coinMock, transactionOutputList);
            //Assert statement(s)
            verify(outputMock).getScriptPubKey();
            verify(outputMock2).getScriptPubKey();
            verify(outputMock3).getScriptPubKey();
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock2), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock2), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock2), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock3), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock3), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock3), atLeast(1));
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
            thrown.expectCause(isA(Script.class));
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
    public void selectWhenOptKeyGetCreationTimeOrElseInstantEPOCHIsBeforeTime() throws ScriptException {
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
        try (MockedStatic<StreamUtils> streamUtils = mockStatic(StreamUtils.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            doReturn(scriptMock).when(outputMock).getScriptPubKey();
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(true);
            byte[] byteArray = new byte[]{};
            scriptPattern.when(() -> ScriptPattern.extractHashFromP2PKH(scriptMock)).thenReturn(byteArray);
            Collector collector = StreamUtils.toUnmodifiableList();
            streamUtils.when(() -> StreamUtils.toUnmodifiableList()).thenReturn(collector);
            Instant instant = Instant.now();
            KeyTimeCoinSelector target = new KeyTimeCoinSelector(walletMock, instant, false);
            doReturn(eCKeyMock).when(walletMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2PKH);
            Instant instant2 = Instant.now();
            doReturn(Optional.of(instant2)).when(eCKeyMock).creationTime();
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(outputMock);
            //Act Statement(s)
            CoinSelection result = target.select(coinMock, transactionOutputList);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            verify(outputMock).getScriptPubKey();
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractHashFromP2PKH(scriptMock), atLeast(1));
            streamUtils.verify(() -> StreamUtils.toUnmodifiableList(), atLeast(1));
            verify(walletMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2PKH);
            verify(eCKeyMock).creationTime();
        }
    }

    //Sapient generated method id: ${5b780c6d-d345-3cf8-93a2-d50910c76755}
    @Ignore()
    @Test()
    public void selectWhenOptKeyIsPresentAndOptKeyGetCreationTimeOrElseInstantEPOCHNotIsBeforeTime() throws ScriptException {
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
        try (MockedStatic<StreamUtils> streamUtils = mockStatic(StreamUtils.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class, CALLS_REAL_METHODS)) {
            List list = new ArrayList<>();
            Script script = Script.of(list);
            doReturn(script).when(outputMock).getScriptPubKey();
            scriptPattern.when(() -> ScriptPattern.isP2PK((Script) any())).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH((Script) any())).thenReturn(false);
            //TODO: Needs to return real value
            streamUtils.when(() -> StreamUtils.toUnmodifiableList()).thenReturn(null);
            Instant instant = Instant.now();
            KeyTimeCoinSelector target = new KeyTimeCoinSelector(walletMock, instant, false);
            Coin coin = Coin.valueOf(0L);
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(outputMock);
            //Act Statement(s)
            CoinSelection result = target.select(coin, transactionOutputList);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            verify(outputMock, atLeast(1)).getScriptPubKey();
            scriptPattern.verify(() -> ScriptPattern.isP2PK((Script) any()), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH((Script) any()), atLeast(1));
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
    @Ignore()
    @Test()
    public void selectWhenScriptPatternIsP2WPKHScriptPubKeyAndOptKeyIsPresentAndOptKeyGetCreationTimeOrElseInstantEPOCHNotIsBeforeTime() throws ScriptException {
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
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            doReturn(transactionMock).when(outputMock).getParentTransaction();
            doReturn(scriptMock).when(outputMock).getScriptPubKey();
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(true);
            byte[] byteArray = new byte[]{};
            scriptPattern.when(() -> ScriptPattern.extractHashFromP2WH(scriptMock)).thenReturn(byteArray);
            Instant instant = Instant.now();
            KeyTimeCoinSelector target = new KeyTimeCoinSelector(walletMock, instant, true);
            TransactionConfidence transactionConfidence = new TransactionConfidence(sha256HashMock);
            transactionConfidence.setConfidenceType(TransactionConfidence.ConfidenceType.BUILDING);
            doReturn(transactionConfidence).when(walletMock).getConfidence(transactionMock);
            doReturn(eCKeyMock).when(walletMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2WPKH);
            doReturn(Optional.empty()).when(eCKeyMock).creationTime();
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
            scriptPattern.verify(() -> ScriptPattern.extractHashFromP2WH(scriptMock), atLeast(1));
            verify(walletMock).getConfidence(transactionMock);
            verify(walletMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2WPKH);
            verify(eCKeyMock).creationTime();
        }
    }
}
