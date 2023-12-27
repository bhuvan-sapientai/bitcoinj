package org.bitcoinj.signers;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.script.ScriptException;
import org.junit.rules.ExpectedException;
import org.bitcoinj.wallet.KeyBag;
import org.bitcoinj.crypto.ECKey;
import org.bitcoinj.crypto.TransactionSignature;
import org.bitcoinj.script.ScriptPattern;
import org.mockito.MockedStatic;
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
import org.bitcoinj.core.Transaction;

public class LocalTransactionSignerSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final KeyBag keyBagMock = mock(KeyBag.class, "{}");

    private final Script redeemScriptMock = mock(Script.class);

    private final Script scriptMock = mock(Script.class);

    private final Script scriptMock2 = mock(Script.class);

    private final TransactionSigner.ProposedTransaction transactionSignerProposedTransactionMock = mock(TransactionSigner.ProposedTransaction.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${f340c579-9bbd-36cd-bf14-09059bcfa900}
    @Test()
    public void isReadyTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        LocalTransactionSigner target = new LocalTransactionSigner();

        //Act Statement(s)
        boolean result = target.isReady();

        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${1b022935-e04a-3b4a-b1f6-fa90644b20ac}
    @Ignore()
    @Test()
    public void signInputsWhenConnectedOutputIsNull() {
        /* Branches:
         * (i < numInputs) : true
         * (connectedOutput == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        LocalTransactionSigner target = new LocalTransactionSigner();
        TransactionSigner.ProposedTransaction transactionSignerProposedTransaction = new TransactionSigner.ProposedTransaction(transactionMock);

        //Act Statement(s)
        boolean result = target.signInputs(transactionSignerProposedTransaction, keyBagMock);

        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${c9bbd892-5ddb-3341-ab1c-477df6616bcd}
    @Ignore()
    @Test()
    public void signInputsWhenConnectedOutputIsNotNull() throws ScriptException {
        /* Branches:
         * (i < numInputs) : true
         * (connectedOutput == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        LocalTransactionSigner target = new LocalTransactionSigner();
        Transaction transaction = new Transaction();
        TransactionSigner.ProposedTransaction transactionSignerProposedTransaction = new TransactionSigner.ProposedTransaction(transaction);

        //Act Statement(s)
        boolean result = target.signInputs(transactionSignerProposedTransaction, keyBagMock);

        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
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
        LocalTransactionSigner target = new LocalTransactionSigner();
        Transaction transaction = new Transaction();
        TransactionSigner.ProposedTransaction transactionSignerProposedTransaction = new TransactionSigner.ProposedTransaction(transaction);

        //Act Statement(s)
        boolean result = target.signInputs(transactionSignerProposedTransaction, keyBagMock);

        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${ef77f6cd-b714-3885-b2dc-3c994d24c03f}
    @Ignore()
    @Test()
    public void signInputsWhenKeyIsNull() throws ScriptException {
        /* Branches:
         * (i < numInputs) : true
         * (connectedOutput == null) : false
         * (catch-exception (ScriptException)) : true
         * (pubKey instanceof DeterministicKey) : true
         * (key == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        LocalTransactionSigner target = new LocalTransactionSigner();
        Transaction transaction = new Transaction();
        TransactionSigner.ProposedTransaction transactionSignerProposedTransaction = new TransactionSigner.ProposedTransaction(transaction);

        //Act Statement(s)
        boolean result = target.signInputs(transactionSignerProposedTransaction, keyBagMock);

        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }
}
