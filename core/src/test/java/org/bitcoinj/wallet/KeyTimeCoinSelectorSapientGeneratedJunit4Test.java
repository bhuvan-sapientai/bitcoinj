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

import java.util.Optional;
import java.util.ArrayList;

import org.bitcoinj.script.Script;
import org.bitcoinj.base.internal.StreamUtils;
import org.bitcoinj.base.Sha256Hash;

import java.util.stream.Collector;

import org.mockito.MockedStatic;

import java.time.Instant;

import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
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

    //Sapient generated method id: ${fa31a4db-4004-3faf-aef3-12f7d05b4a53}, hash: CC52187DBAA1B7318821058C1F06CF0F
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
        Instant instant = Instant.ofEpochSecond(1700000000);
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

    //Sapient generated method id: ${25125d06-df3a-3cec-b8d4-665654193cdf}, hash: CD9F6C10FC3B34BCD5A6366D0820F4D2
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
        try (MockedStatic<StreamUtils> streamUtils = mockStatic(StreamUtils.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            Script script = outputMock.getScriptPubKey();
            doReturn(script).when(outputMock).getScriptPubKey();
            scriptPattern.when(() -> ScriptPattern.isP2PK((Script) any())).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH((Script) any())).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH((Script) any())).thenReturn(false);
            Collector collector = StreamUtils.toUnmodifiableList();
            streamUtils.when(() -> StreamUtils.toUnmodifiableList()).thenReturn(collector);
            Instant instant = Instant.now();
            KeyTimeCoinSelector target = new KeyTimeCoinSelector(walletMock, instant, false);
            thrown.expect(RuntimeException.class);
            thrown.expectCause(is(instanceOf(ScriptException.class)));
            Coin coin = Coin.valueOf(0L);
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(outputMock);
            //Act Statement(s)
            target.select(coin, transactionOutputList);
            //Assert statement(s)
            assertThat(transactionOutputList.size(), equalTo(1));
            assertThat(transactionOutputList.get(0), is(instanceOf(TransactionOutput.class)));
            verify(outputMock).getScriptPubKey();
            scriptPattern.verify(() -> ScriptPattern.isP2PK((Script) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH((Script) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH((Script) any()));
            streamUtils.verify(() -> StreamUtils.toUnmodifiableList(), atLeast(1));
        }
    }

    //Sapient generated method id: ${68c2ddd4-b561-3665-8a65-333199173ea5}, hash: 10B36CCFBCED6FAF07287E931E8E64C5
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
        Coin coin2Mock = mock(Coin.class);
        try (MockedStatic<StreamUtils> streamUtils = mockStatic(StreamUtils.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(false);
            Collector collector = StreamUtils.toUnmodifiableList();
            streamUtils.when(() -> StreamUtils.toUnmodifiableList()).thenReturn(collector);
            Instant instant = Instant.now();
            KeyTimeCoinSelector target = new KeyTimeCoinSelector(walletMock, instant, false);
            thrown.expect(RuntimeException.class);
            thrown.expectCause(is(instanceOf(ScriptException.class)));
            Coin coin = Coin.valueOf(0L);
            byte[] byteArray = new byte[]{};
            TransactionOutput transactionOutput = new TransactionOutput(transactionMock, coin2Mock, byteArray);
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(transactionOutput);
            //Act Statement(s)
            target.select(coin, transactionOutputList);
            //Assert statement(s)
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            streamUtils.verify(() -> StreamUtils.toUnmodifiableList(), atLeast(1));
        }
    }

    //Sapient generated method id: ${bd86ae90-dc2a-39a5-97db-a58b7c1e1f2c}, hash: BD75B3396DA03356A3CAC4796B99013A
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
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: object of type Instant - Method: isBefore
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            doReturn(transactionMock).when(outputMock).getParentTransaction();
            doReturn(scriptMock).when(outputMock).getScriptPubKey();
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(true);
            byte[] byteArray = new byte[]{};
            scriptPattern.when(() -> ScriptPattern.extractKeyFromP2PK(scriptMock)).thenReturn(byteArray);
            Instant instant = Instant.ofEpochSecond(1700000000);
            KeyTimeCoinSelector target = new KeyTimeCoinSelector(walletMock, instant, true);
            TransactionConfidence transactionConfidence = new TransactionConfidence(sha256HashMock);
            transactionConfidence.setConfidenceType(TransactionConfidence.ConfidenceType.BUILDING);
            doReturn(transactionConfidence).when(walletMock).getConfidence(transactionMock);
            doReturn(eCKeyMock).when(walletMock).findKeyFromPubKey(byteArray);
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
            scriptPattern.verify(() -> ScriptPattern.extractKeyFromP2PK(scriptMock), atLeast(1));
            verify(walletMock).getConfidence(transactionMock);
            verify(walletMock).findKeyFromPubKey(byteArray);
            verify(eCKeyMock).creationTime();
        }
    }

    //Sapient generated method id: ${5b780c6d-d345-3cf8-93a2-d50910c76755}, hash: 84578307179A66CCA2B56B6DE19848CA
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
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: object of type Instant - Method: isBefore
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            doReturn(transactionMock).when(outputMock).getParentTransaction();
            doReturn(scriptMock).when(outputMock).getScriptPubKey();
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(true);
            byte[] byteArray = new byte[]{};
            scriptPattern.when(() -> ScriptPattern.extractHashFromP2PKH(scriptMock)).thenReturn(byteArray);
            Instant instant = Instant.ofEpochSecond(1700000000);
            KeyTimeCoinSelector target = new KeyTimeCoinSelector(walletMock, instant, true);
            TransactionConfidence transactionConfidence = new TransactionConfidence(sha256HashMock);
            transactionConfidence.setConfidenceType(TransactionConfidence.ConfidenceType.BUILDING);
            doReturn(transactionConfidence).when(walletMock).getConfidence(transactionMock);
            doReturn(eCKeyMock).when(walletMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2PKH);
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
            scriptPattern.verify(() -> ScriptPattern.extractHashFromP2PKH(scriptMock), atLeast(1));
            verify(walletMock).getConfidence(transactionMock);
            verify(walletMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2PKH);
            verify(eCKeyMock).creationTime();
        }
    }

    //Sapient generated method id: ${b90004e6-e8bd-32c5-a4e1-3c177e862eae}, hash: 5E5FBAE337569737C91DBCB36B0BBF9A
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
            Instant instant = Instant.ofEpochSecond(1700000000);
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

    //Sapient generated method id: ${a43d325a-a264-3cea-81fc-34c0d9836073}, hash: 72F15D9CBE5D21E8754131E7CC723ABD
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
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: object of type Instant - Method: isBefore
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
            Instant instant = Instant.ofEpochSecond(1700000000);
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
