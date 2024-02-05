package org.bitcoinj.signers;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.script.ScriptException;
import org.junit.rules.ExpectedException;

import java.util.List;

import org.bitcoinj.wallet.KeyBag;
import org.bitcoinj.core.Transaction;
import org.bitcoinj.crypto.ECKey;
import org.bitcoinj.script.ScriptPattern;
import org.mockito.MockedStatic;

import java.util.ArrayList;

import org.bitcoinj.script.ScriptBuilder;
import org.bitcoinj.script.Script;
import org.bitcoinj.core.TransactionWitness;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

import org.bitcoinj.core.TransactionInput;
import org.bitcoinj.crypto.DeterministicKey;

import java.util.EnumSet;

import org.bitcoinj.core.TransactionOutput;
import org.bitcoinj.crypto.HDPath;
import org.bitcoinj.wallet.RedeemData;
import org.bitcoinj.base.Coin;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.times;

public class LocalTransactionSignerSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final KeyBag keyBagMock = mock(KeyBag.class);

    private final Script redeemScriptMock = mock(Script.class);

    private final Script scriptMock = mock(Script.class);

    private final Transaction transactionMock = mock(Transaction.class);

    private final TransactionSigner.ProposedTransaction transactionSignerProposedTransactionMock = mock(TransactionSigner.ProposedTransaction.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    private final Coin coinMock = mock(Coin.class);

    private final Script scriptMock2 = mock(Script.class);

    private final Script scriptMock3 = mock(Script.class);

    private final TransactionInput transactionInputMock = mock(TransactionInput.class);

    private final TransactionInput transactionInputMock2 = mock(TransactionInput.class);

    private final TransactionOutput transactionOutputMock = mock(TransactionOutput.class);

    private final TransactionWitness transactionWitnessMock = mock(TransactionWitness.class);

    private final Transaction txMock = mock(Transaction.class);

    //Sapient generated method id: ${f340c579-9bbd-36cd-bf14-09059bcfa900}
    @Test()
    public void isReadyTest() {
        //Arrange Statement(s)
        LocalTransactionSigner target = new LocalTransactionSigner();
        //Act Statement(s)
        boolean result = target.isReady();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${1b022935-e04a-3b4a-b1f6-fa90644b20ac}
    @Test()
    public void signInputsWhenConnectedOutputIsNull() {
        /* Branches:
         * (i < numInputs) : true
         * (connectedOutput == null) : true
         */
        //Arrange Statement(s)
        List<TransactionInput> transactionInputList = new ArrayList<>();
        transactionInputList.add(transactionInputMock);
        doReturn(transactionInputList).when(txMock).getInputs();
        doReturn(transactionInputMock2).when(txMock).getInput(0L);
        doReturn(null).when(transactionInputMock2).getConnectedOutput();
        LocalTransactionSigner target = new LocalTransactionSigner();
        TransactionSigner.ProposedTransaction transactionSignerProposedTransaction = new TransactionSigner.ProposedTransaction(txMock);
        //Act Statement(s)
        boolean result = target.signInputs(transactionSignerProposedTransaction, keyBagMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(txMock).getInputs();
        verify(txMock).getInput(0L);
        verify(transactionInputMock2).getConnectedOutput();
    }

    //Sapient generated method id: ${c9bbd892-5ddb-3341-ab1c-477df6616bcd}
    @Test()
    public void signInputsWhenConnectedOutputIsNotNull() throws ScriptException {
        /* Branches:
         * (i < numInputs) : true
         * (connectedOutput == null) : false
         */
        //Arrange Statement(s)
        List<TransactionInput> transactionInputList = new ArrayList<>();
        transactionInputList.add(transactionInputMock);
        doReturn(transactionInputList).when(txMock).getInputs();
        doReturn(transactionInputMock2).when(txMock).getInput(0L);
        doReturn(transactionOutputMock).when(transactionInputMock2).getConnectedOutput();
        doReturn(coinMock).when(transactionOutputMock).getValue();
        doReturn(scriptMock, scriptMock2).when(transactionOutputMock).getScriptPubKey();
        doReturn(scriptMock3).when(transactionInputMock2).getScriptSig();
        EnumSet<Script.VerifyFlag> scriptVerifyFlagSet = EnumSet.noneOf(Script.VerifyFlag.class);
        scriptVerifyFlagSet.add(Script.VerifyFlag.P2SH);
        scriptVerifyFlagSet.add(Script.VerifyFlag.NULLDUMMY);
        doNothing().when(scriptMock3).correctlySpends(txMock, 0, transactionWitnessMock, coinMock, scriptMock2, scriptVerifyFlagSet);
        doReturn(transactionWitnessMock).when(transactionInputMock2).getWitness();
        LocalTransactionSigner target = new LocalTransactionSigner();
        TransactionSigner.ProposedTransaction transactionSignerProposedTransaction = new TransactionSigner.ProposedTransaction(txMock);
        //Act Statement(s)
        boolean result = target.signInputs(transactionSignerProposedTransaction, keyBagMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(txMock).getInputs();
        verify(txMock).getInput(0L);
        verify(transactionInputMock2).getConnectedOutput();
        verify(transactionOutputMock, times(2)).getScriptPubKey();
        verify(transactionOutputMock).getValue();
        verify(transactionInputMock2).getScriptSig();
        verify(scriptMock3).correctlySpends(txMock, 0, transactionWitnessMock, coinMock, scriptMock2, scriptVerifyFlagSet);
        verify(transactionInputMock2).getWitness();
    }

    //Sapient generated method id: ${f485cbe3-0d04-3897-958b-a72978891214}
    @Ignore()
    @Test()
    public void signInputsWhenCaughtECKeyKeyIsEncryptedException() throws ScriptException {
        /* Branches:
         * (i < numInputs) : true
         * (connectedOutput == null) : false
         * (catch-exception (ECKey.KeyIsEncryptedException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<TransactionInput> transactionInputList = new ArrayList<>();
        transactionInputList.add(transactionInputMock);
        doReturn(transactionInputList).when(txMock).getInputs();
        doReturn(transactionInputMock2).when(txMock).getInput(0L);
        doReturn(transactionOutputMock).when(transactionInputMock2).getConnectedOutput();
        doReturn(coinMock).when(transactionOutputMock).getValue();
        doReturn(scriptMock, scriptMock2).when(transactionOutputMock).getScriptPubKey();
        doReturn(scriptMock3).when(transactionInputMock2).getScriptSig();
        EnumSet<Script.VerifyFlag> scriptVerifyFlagSet = EnumSet.noneOf(Script.VerifyFlag.class);
        scriptVerifyFlagSet.add(Script.VerifyFlag.P2SH);
        scriptVerifyFlagSet.add(Script.VerifyFlag.NULLDUMMY);
        doNothing().when(scriptMock3).correctlySpends(txMock, 0, transactionWitnessMock, coinMock, scriptMock2, scriptVerifyFlagSet);
        doReturn(transactionWitnessMock).when(transactionInputMock2).getWitness();
        LocalTransactionSigner target = new LocalTransactionSigner();
        TransactionSigner.ProposedTransaction transactionSignerProposedTransaction = new TransactionSigner.ProposedTransaction(txMock);
        //Act Statement(s)
        boolean result = target.signInputs(transactionSignerProposedTransaction, keyBagMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(txMock).getInputs();
        verify(txMock).getInput(0L);
        verify(transactionInputMock2).getConnectedOutput();
        verify(transactionOutputMock, times(2)).getScriptPubKey();
        verify(transactionOutputMock).getValue();
        verify(transactionInputMock2).getScriptSig();
        verify(scriptMock3).correctlySpends(txMock, 0, transactionWitnessMock, coinMock, scriptMock2, scriptVerifyFlagSet);
        verify(transactionInputMock2).getWitness();
    }

    //Sapient generated method id: ${70a6f544-4f41-3f2b-887a-fc1fdedcef09}
    @Test()
    public void signInputsWhenCaughtECKeyMissingPrivateKeyException() throws ScriptException {
        /* Branches:
         * (i < numInputs) : true
         * (connectedOutput == null) : false
         * (catch-exception (ECKey.MissingPrivateKeyException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<TransactionInput> transactionInputList = new ArrayList<>();
        transactionInputList.add(transactionInputMock);
        doReturn(transactionInputList).when(txMock).getInputs();
        doReturn(transactionInputMock2).when(txMock).getInput(0L);
        doReturn(transactionOutputMock).when(transactionInputMock2).getConnectedOutput();
        doReturn(coinMock).when(transactionOutputMock).getValue();
        doReturn(scriptMock, scriptMock2).when(transactionOutputMock).getScriptPubKey();
        doReturn(scriptMock3).when(transactionInputMock2).getScriptSig();
        EnumSet<Script.VerifyFlag> scriptVerifyFlagSet = EnumSet.noneOf(Script.VerifyFlag.class);
        scriptVerifyFlagSet.add(Script.VerifyFlag.P2SH);
        scriptVerifyFlagSet.add(Script.VerifyFlag.NULLDUMMY);
        doNothing().when(scriptMock3).correctlySpends(txMock, 0, transactionWitnessMock, coinMock, scriptMock2, scriptVerifyFlagSet);
        doReturn(transactionWitnessMock).when(transactionInputMock2).getWitness();
        LocalTransactionSigner target = new LocalTransactionSigner();
        TransactionSigner.ProposedTransaction transactionSignerProposedTransaction = new TransactionSigner.ProposedTransaction(txMock);
        //Act Statement(s)
        boolean result = target.signInputs(transactionSignerProposedTransaction, keyBagMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(txMock).getInputs();
        verify(txMock).getInput(0L);
        verify(transactionInputMock2).getConnectedOutput();
        verify(transactionOutputMock, times(2)).getScriptPubKey();
        verify(transactionOutputMock).getValue();
        verify(transactionInputMock2).getScriptSig();
        verify(scriptMock3).correctlySpends(txMock, 0, transactionWitnessMock, coinMock, scriptMock2, scriptVerifyFlagSet);
        verify(transactionInputMock2).getWitness();
    }

    //Sapient generated method id: ${61cdcef6-7c25-3914-85c8-4fcb9cc24a24}
    @Ignore()
    @Test()
    public void signInputsWhenPubKeyInstanceOfDeterministicKeyThrowsNullPointerException() throws ScriptException {
        /* Branches:
         * (i < numInputs) : true
         * (connectedOutput == null) : false
         * (catch-exception (ScriptException)) : true
         * (pubKey instanceof DeterministicKey) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<TransactionInput> transactionInputList = new ArrayList<>();
        transactionInputList.add(transactionInputMock);
        doReturn(transactionInputList).when(txMock).getInputs();
        doReturn(transactionInputMock2).when(txMock).getInput(0L);
        doReturn(transactionOutputMock).when(transactionInputMock2).getConnectedOutput();
        doReturn(coinMock).when(transactionOutputMock).getValue();
        doReturn(scriptMock, scriptMock2).when(transactionOutputMock).getScriptPubKey();
        doReturn(scriptMock3).when(transactionInputMock2).getScriptSig();
        EnumSet<Script.VerifyFlag> scriptVerifyFlagSet = EnumSet.noneOf(Script.VerifyFlag.class);
        scriptVerifyFlagSet.add(Script.VerifyFlag.P2SH);
        scriptVerifyFlagSet.add(Script.VerifyFlag.NULLDUMMY);
        doNothing().when(scriptMock3).correctlySpends(txMock, 0, transactionWitnessMock, coinMock, scriptMock2, scriptVerifyFlagSet);
        doReturn(transactionWitnessMock).when(transactionInputMock2).getWitness();
        DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);
        List list = new ArrayList<>();
        list.add(deterministicKeyMock);
        Script scriptMock4 = mock(Script.class);
        RedeemData redeemData = RedeemData.of(list, scriptMock4);
        doReturn(redeemData).when(transactionInputMock2).getConnectedRedeemData(keyBagMock);
        HDPath hDPathMock = mock(HDPath.class);
        doReturn(hDPathMock).when(deterministicKeyMock).getPath();
        LocalTransactionSigner target = new LocalTransactionSigner();
        thrown.expect(NullPointerException.class);
        TransactionSigner.ProposedTransaction transactionSignerProposedTransaction = new TransactionSigner.ProposedTransaction(txMock);
        //Act Statement(s)
        target.signInputs(transactionSignerProposedTransaction, keyBagMock);
        //Assert statement(s)
        verify(txMock).getInputs();
        verify(txMock).getInput(0L);
        verify(transactionInputMock2).getConnectedOutput();
        verify(transactionOutputMock, times(2)).getScriptPubKey();
        verify(transactionOutputMock).getValue();
        verify(transactionInputMock2).getScriptSig();
        verify(scriptMock3).correctlySpends(txMock, 0, transactionWitnessMock, coinMock, scriptMock2, scriptVerifyFlagSet);
        verify(transactionInputMock2).getWitness();
        verify(transactionInputMock2).getConnectedRedeemData(keyBagMock);
        verify(deterministicKeyMock).getPath();
    }

    //Sapient generated method id: ${ef77f6cd-b714-3885-b2dc-3c994d24c03f}
    @Ignore()
    @Test()
    public void signInputsWhenKeyIsNull() throws ScriptException {
        /* Branches:
         * (i < numInputs) : true
         * (connectedOutput == null) : false
         * (catch-exception (ScriptException)) : true
         * (pubKey instanceof DeterministicKey) : false
         * (key == null) : true
         */
        //Arrange Statement(s)
        List<TransactionInput> transactionInputList = new ArrayList<>();
        transactionInputList.add(transactionInputMock);
        doReturn(transactionInputList).when(txMock).getInputs();
        doReturn(transactionInputMock2).when(txMock).getInput(0L);
        doReturn(transactionOutputMock).when(transactionInputMock2).getConnectedOutput();
        doReturn(scriptMock).when(transactionOutputMock).getScriptPubKey();
        ScriptException scriptExceptionMock = mock(ScriptException.class);
        doThrow(scriptExceptionMock).when(transactionInputMock2).getScriptSig();
        RedeemData redeemDataMock = mock(RedeemData.class);
        doReturn(redeemDataMock).when(transactionInputMock2).getConnectedRedeemData(keyBagMock);
        doReturn(null).when(redeemDataMock).getFullKey();
        LocalTransactionSigner target = new LocalTransactionSigner();
        TransactionSigner.ProposedTransaction transactionSignerProposedTransaction = new TransactionSigner.ProposedTransaction(txMock);
        //Act Statement(s)
        boolean result = target.signInputs(transactionSignerProposedTransaction, keyBagMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(txMock).getInputs();
        verify(txMock).getInput(0L);
        verify(transactionInputMock2).getConnectedOutput();
        verify(transactionOutputMock).getScriptPubKey();
        verify(transactionInputMock2).getScriptSig();
        verify(transactionInputMock2).getConnectedRedeemData(keyBagMock);
        verify(redeemDataMock).getFullKey();
    }

    //Sapient generated method id: ${ac5d79e2-2dd0-3edc-9691-fb3f44893388}
    @Ignore()
    @Test()
    public void signInputsWhenKeyIsNotNullThrowsNullPointerException() throws ScriptException {
        /* Branches:
         * (i < numInputs) : true
         * (connectedOutput == null) : false
         * (catch-exception (ScriptException)) : true
         * (pubKey instanceof DeterministicKey) : false
         * (key == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        LocalTransactionSigner target = new LocalTransactionSigner();
        thrown.expect(NullPointerException.class);
        Transaction transactionMock = mock(Transaction.class);
        TransactionSigner.ProposedTransaction transactionSignerProposedTransaction = new TransactionSigner.ProposedTransaction(transactionMock);
        //Act Statement(s)
        target.signInputs(transactionSignerProposedTransaction, keyBagMock);
    }
}
