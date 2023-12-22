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
    @Test()
    public void signInputsWhenConnectedOutputIsNotNull() {
        /* Branches:
         * (i < numInputs) : true
         * (connectedOutput == null) : false
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
        //Act Statement(s)
        boolean result = target.signInputs(transactionSignerProposedTransactionMock, keyBagMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${ef77f6cd-b714-3885-b2dc-3c994d24c03f}
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
        TransactionSigner.ProposedTransaction transactionSignerProposedTransaction = new TransactionSigner.ProposedTransaction(transactionMock);
        //Act Statement(s)
        boolean result = target.signInputs(transactionSignerProposedTransaction, keyBagMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${951ea5e3-3861-3283-8f62-4545c29a363c}
    @Ignore()
    @Test()
    public void signInputsWhenScriptPatternIsP2SHScriptPubKey() throws ScriptException {
        /* Branches:
         * (i < numInputs) : true
         * (connectedOutput == null) : false
         * (catch-exception (ScriptException)) : true
         * (pubKey instanceof DeterministicKey) : true
         * (key == null) : false
         * (ScriptPattern.isP2PK(scriptPubKey)) : false
         * (ScriptPattern.isP2PKH(scriptPubKey)) : false
         * (ScriptPattern.isP2SH(scriptPubKey)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptBuilder> scriptBuilder = mockStatic(ScriptBuilder.class, CALLS_REAL_METHODS);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(true);
            List list = new ArrayList<>();
            Script script = Script.of(list);
            ECKey eCKey = new ECKey();
            scriptBuilder.when(() -> ScriptBuilder.createP2PKHOutputScript(eCKey)).thenReturn(script);
            LocalTransactionSigner target = new LocalTransactionSigner();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(redeemScriptMock).program();
            //Act Statement(s)
            boolean result = target.signInputs(transactionSignerProposedTransactionMock, keyBagMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptBuilder.verify(() -> ScriptBuilder.createP2PKHOutputScript(eCKey), atLeast(1));
            verify(redeemScriptMock, atLeast(1)).program();
        }
    }

    //Sapient generated method id: ${39ebdb8f-3c95-380c-bed7-3e2b9f53ac26}
    @Ignore()
    @Test()
    public void signInputsWhenScriptPatternIsP2WPKHScriptPubKey() throws ScriptException {
        /* Branches:
         * (i < numInputs) : true
         * (connectedOutput == null) : false
         * (catch-exception (ScriptException)) : true
         * (pubKey instanceof DeterministicKey) : true
         * (key == null) : false
         * (ScriptPattern.isP2PK(scriptPubKey)) : false
         * (ScriptPattern.isP2PKH(scriptPubKey)) : false
         * (ScriptPattern.isP2SH(scriptPubKey)) : false
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(false);
            LocalTransactionSigner target = new LocalTransactionSigner();
            byte[] byteArray = new byte[]{(byte) 0};
            doReturn(byteArray).when(redeemScriptMock).program();
            IllegalStateException illegalStateException = new IllegalStateException("[-]");
            thrown.expect(IllegalStateException.class);
            thrown.expectMessage(illegalStateException.getMessage());
            //Act Statement(s)
            target.signInputs(transactionSignerProposedTransactionMock, keyBagMock);
            //Assert statement(s)
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            verify(redeemScriptMock).program();
        }
    }

    //Sapient generated method id: ${50a6b179-2cb2-315d-82b7-4c781026abf7}
    @Test()
    public void signInputsWhenScriptPatternNotIsP2WPKHScriptPubKeyThrowsIllegalStateException() {
        /* Branches:
         * (i < numInputs) : true
         * (connectedOutput == null) : false
         * (catch-exception (ScriptException)) : true
         * (pubKey instanceof DeterministicKey) : true
         * (key == null) : false
         * (ScriptPattern.isP2PK(scriptPubKey)) : false
         * (ScriptPattern.isP2PKH(scriptPubKey)) : false
         * (ScriptPattern.isP2SH(scriptPubKey)) : false
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : false
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
}
