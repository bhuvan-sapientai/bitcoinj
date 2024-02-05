package org.bitcoinj.signers;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;

import org.bitcoinj.wallet.KeyBag;
import org.bitcoinj.core.TransactionInput;
import org.bitcoinj.wallet.Wallet;
import org.bitcoinj.core.Transaction;
import org.bitcoinj.crypto.TransactionSignature;

import java.math.BigInteger;

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
import org.bitcoinj.core.TransactionOutPoint;
import org.bitcoinj.script.ScriptException;
import org.junit.rules.ExpectedException;
import org.bitcoinj.base.ScriptType;
import org.bitcoinj.script.ScriptChunk;
import org.bitcoinj.core.TransactionOutput;
import org.bitcoinj.crypto.ECKey;
import org.bitcoinj.script.ScriptPattern;
import org.bitcoinj.script.Script;
import org.bitcoinj.core.TransactionWitness;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;

public class MissingSigResolutionSignerSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final KeyBag keyBagMock = mock(KeyBag.class);

    private final Transaction partialTxMock = mock(Transaction.class);

    private final TransactionInput transactionInputMock = mock(TransactionInput.class);

    private final TransactionInput transactionInputMock2 = mock(TransactionInput.class);

    private final Transaction transactionMock = mock(Transaction.class);

    private final TransactionSigner.ProposedTransaction transactionSignerProposedTransactionMock = mock(TransactionSigner.ProposedTransaction.class);

    private final TransactionOutPoint transactionOutPointMock = mock(TransactionOutPoint.class);

    private final ECKey eCKeyMock = mock(ECKey.class);

    private final Transaction partialTxMock2 = mock(Transaction.class);

    private final ScriptChunk scriptChunkMock = mock(ScriptChunk.class);

    private final ScriptChunk scriptChunkMock2 = mock(ScriptChunk.class);

    private final ScriptChunk scriptChunkMock3 = mock(ScriptChunk.class);

    private final ScriptChunk scriptChunkMock4 = mock(ScriptChunk.class);

    private final Script scriptMock = mock(Script.class);

    private final Script scriptMock2 = mock(Script.class);

    private final Script scriptMock3 = mock(Script.class);

    private final TransactionOutput transactionOutputMock = mock(TransactionOutput.class);

    private final TransactionOutput transactionOutputMock2 = mock(TransactionOutput.class);

    private final TransactionWitness transactionWitnessMock = mock(TransactionWitness.class);

    private final TransactionWitness transactionWitnessMock2 = mock(TransactionWitness.class);

    private final TransactionWitness transactionWitnessMock3 = mock(TransactionWitness.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${f340c579-9bbd-36cd-bf14-09059bcfa900}
    @Test()
    public void isReadyTest() {
        //Arrange Statement(s)
        MissingSigResolutionSigner target = new MissingSigResolutionSigner(Wallet.MissingSigsMode.USE_OP_ZERO);

        //Act Statement(s)
        boolean result = target.isReady();

        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${48e662be-97d5-3c97-a7b9-8572cbc66ecb}
    @Test()
    public void signInputsWhenMissingSigsModeEqualsWalletMissingSigsModeUSE_OP_ZERO() {
        /* Branches:
         * (missingSigsMode == Wallet.MissingSigsMode.USE_OP_ZERO) : true
         */
        //Arrange Statement(s)
        MissingSigResolutionSigner target = new MissingSigResolutionSigner(Wallet.MissingSigsMode.USE_OP_ZERO);
        TransactionSigner.ProposedTransaction transactionSignerProposedTransactionMock = mock(TransactionSigner.ProposedTransaction.class);

        //Act Statement(s)
        boolean result = target.signInputs(transactionSignerProposedTransactionMock, keyBagMock);

        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${e0a2942d-5f60-345b-b313-c040d85c4bd1}
    @Test()
    public void signInputsWhenINotLessThanNumInputs() {
        /* Branches:
         * (missingSigsMode == Wallet.MissingSigsMode.USE_OP_ZERO) : false
         * (i < numInputs) : false
         */
        //Arrange Statement(s)
        MissingSigResolutionSigner target = new MissingSigResolutionSigner(Wallet.MissingSigsMode.USE_DUMMY_SIG);
        List<TransactionInput> transactionInputList = new ArrayList<>();
        doReturn(transactionInputList).when(partialTxMock).getInputs();
        TransactionSigner.ProposedTransaction transactionSignerProposedTransaction = new TransactionSigner.ProposedTransaction(partialTxMock);

        //Act Statement(s)
        boolean result = target.signInputs(transactionSignerProposedTransaction, keyBagMock);

        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(partialTxMock).getInputs();
    }

    //Sapient generated method id: ${629f61eb-ce4b-38c3-b66e-727ae00974c2}
    @Ignore()
    @Test()
    public void signInputsWhenTxInGetConnectedOutputIsNull() {
        /* Branches:
         * (missingSigsMode == Wallet.MissingSigsMode.USE_OP_ZERO) : false
         * (i < numInputs) : true
         * (txIn.getConnectedOutput() == null) : true
         */
        //Arrange Statement(s)
        MissingSigResolutionSigner target = new MissingSigResolutionSigner(Wallet.MissingSigsMode.USE_DUMMY_SIG);
        List<TransactionInput> transactionInputList = new ArrayList<>();
        transactionInputList.add(transactionInputMock);
        doReturn(transactionInputList).when(partialTxMock).getInputs();
        doReturn(transactionInputMock2).when(partialTxMock).getInput(0L);
        doReturn(null).when(transactionInputMock2).getConnectedOutput();
        TransactionSigner.ProposedTransaction transactionSignerProposedTransaction = new TransactionSigner.ProposedTransaction(partialTxMock);

        //Act Statement(s)
        boolean result = target.signInputs(transactionSignerProposedTransaction, keyBagMock);

        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(partialTxMock).getInputs();
        verify(partialTxMock).getInput(0L);
        verify(transactionInputMock2).getConnectedOutput();
    }

    //Sapient generated method id: ${57dfe0d0-a68d-3b19-9505-f87241385032}
    @Test()
    public void signInputsWhenJNotLessThanInputScriptChunksSizeMinusSigSuffixCount() throws ScriptException {
        /* Branches:
         * (missingSigsMode == Wallet.MissingSigsMode.USE_OP_ZERO) : false
         * (i < numInputs) : true
         * (txIn.getConnectedOutput() == null) : false
         * (ScriptPattern.isP2SH(scriptPubKey)) : true
         * (ScriptPattern.isP2SH(scriptPubKey)) : true
         * (j < inputScript.chunks().size() - sigSuffixCount) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(true);
            MissingSigResolutionSigner target = new MissingSigResolutionSigner(Wallet.MissingSigsMode.USE_DUMMY_SIG);
            List<TransactionInput> transactionInputList = new ArrayList<>();
            transactionInputList.add(transactionInputMock);
            doReturn(transactionInputList).when(partialTxMock).getInputs();
            doReturn(transactionInputMock2).when(partialTxMock).getInput(0L);
            doReturn(transactionOutputMock, transactionOutputMock2).when(transactionInputMock2).getConnectedOutput();
            doReturn(scriptMock).when(transactionOutputMock2).getScriptPubKey();
            doReturn(scriptMock2).when(transactionInputMock2).getScriptSig();
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(scriptChunkMock);
            doReturn(scriptChunkList).when(scriptMock2).chunks();
            TransactionSigner.ProposedTransaction transactionSignerProposedTransaction = new TransactionSigner.ProposedTransaction(partialTxMock);
            //Act Statement(s)
            boolean result = target.signInputs(transactionSignerProposedTransaction, keyBagMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(2));
            verify(partialTxMock).getInputs();
            verify(partialTxMock).getInput(0L);
            verify(transactionInputMock2, times(2)).getConnectedOutput();
            verify(transactionOutputMock2).getScriptPubKey();
            verify(transactionInputMock2).getScriptSig();
            verify(scriptMock2).chunks();
        }
    }

    //Sapient generated method id: ${f6af168f-c110-38d5-a186-b493e669f0aa}
    @Test()
    public void signInputsWhenScriptPatternNotIsP2SHScriptPubKeyAndJNotLessThanInputScriptChunksSizeMinusSigSuffixCount() throws ScriptException {
        /* Branches:
         * (missingSigsMode == Wallet.MissingSigsMode.USE_OP_ZERO) : false
         * (i < numInputs) : true
         * (txIn.getConnectedOutput() == null) : false
         * (ScriptPattern.isP2SH(scriptPubKey)) : true
         * (ScriptPattern.isP2SH(scriptPubKey)) : false
         * (j < inputScript.chunks().size() - sigSuffixCount) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(true).thenReturn(false);
            MissingSigResolutionSigner target = new MissingSigResolutionSigner(Wallet.MissingSigsMode.USE_DUMMY_SIG);
            List<TransactionInput> transactionInputList = new ArrayList<>();
            transactionInputList.add(transactionInputMock);
            doReturn(transactionInputList).when(partialTxMock).getInputs();
            doReturn(transactionInputMock2).when(partialTxMock).getInput(0L);
            doReturn(transactionOutputMock, transactionOutputMock2).when(transactionInputMock2).getConnectedOutput();
            doReturn(scriptMock).when(transactionOutputMock2).getScriptPubKey();
            doReturn(scriptMock2).when(transactionInputMock2).getScriptSig();
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            doReturn(scriptChunkList).when(scriptMock2).chunks();
            TransactionSigner.ProposedTransaction transactionSignerProposedTransaction = new TransactionSigner.ProposedTransaction(partialTxMock);
            //Act Statement(s)
            boolean result = target.signInputs(transactionSignerProposedTransaction, keyBagMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(2));
            verify(partialTxMock).getInputs();
            verify(partialTxMock).getInput(0L);
            verify(transactionInputMock2, times(2)).getConnectedOutput();
            verify(transactionOutputMock2).getScriptPubKey();
            verify(transactionInputMock2).getScriptSig();
            verify(scriptMock2).chunks();
        }
    }

    //Sapient generated method id: ${cd2d0bdc-192e-34eb-aec7-cfd285c813e1}
    @Test()
    public void signInputsWhenScriptPatternIsP2SHScriptPubKeyAndJNotLessThanInputScriptChunksSizeMinusSigSuffixCount() throws ScriptException {
        /* Branches:
         * (missingSigsMode == Wallet.MissingSigsMode.USE_OP_ZERO) : false
         * (i < numInputs) : true
         * (txIn.getConnectedOutput() == null) : false
         * (ScriptPattern.isP2SH(scriptPubKey)) : false
         * (ScriptPattern.isSentToMultisig(scriptPubKey)) : true
         * (ScriptPattern.isP2SH(scriptPubKey)) : true
         * (j < inputScript.chunks().size() - sigSuffixCount) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            scriptPattern.when(() -> ScriptPattern.isSentToMultisig(scriptMock)).thenReturn(true);
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(false).thenReturn(true);
            MissingSigResolutionSigner target = new MissingSigResolutionSigner(Wallet.MissingSigsMode.USE_DUMMY_SIG);
            List<TransactionInput> transactionInputList = new ArrayList<>();
            transactionInputList.add(transactionInputMock);
            doReturn(transactionInputList).when(partialTxMock).getInputs();
            doReturn(transactionInputMock2).when(partialTxMock).getInput(0L);
            doReturn(transactionOutputMock, transactionOutputMock2).when(transactionInputMock2).getConnectedOutput();
            doReturn(scriptMock).when(transactionOutputMock2).getScriptPubKey();
            doReturn(scriptMock2).when(transactionInputMock2).getScriptSig();
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(scriptChunkMock);
            doReturn(scriptChunkList).when(scriptMock2).chunks();
            TransactionSigner.ProposedTransaction transactionSignerProposedTransaction = new TransactionSigner.ProposedTransaction(partialTxMock);
            //Act Statement(s)
            boolean result = target.signInputs(transactionSignerProposedTransaction, keyBagMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(2));
            scriptPattern.verify(() -> ScriptPattern.isSentToMultisig(scriptMock), atLeast(1));
            verify(partialTxMock).getInputs();
            verify(partialTxMock).getInput(0L);
            verify(transactionInputMock2, times(2)).getConnectedOutput();
            verify(transactionOutputMock2).getScriptPubKey();
            verify(transactionInputMock2).getScriptSig();
            verify(scriptMock2).chunks();
        }
    }

    //Sapient generated method id: ${50a6b179-2cb2-315d-82b7-4c781026abf7}
    @Ignore()
    @Test()
    public void signInputsWhenScriptPatternNotIsP2WPKHScriptPubKeyThrowsIllegalStateException() throws ScriptException {
        /* Branches:
         * (missingSigsMode == Wallet.MissingSigsMode.USE_OP_ZERO) : false
         * (i < numInputs) : true
         * (txIn.getConnectedOutput() == null) : false
         * (ScriptPattern.isP2SH(scriptPubKey)) : false
         * (ScriptPattern.isSentToMultisig(scriptPubKey)) : false
         * (ScriptPattern.isP2PK(scriptPubKey)) : false
         * (ScriptPattern.isP2PKH(scriptPubKey)) : false
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : false
         */
        //Arrange Statement(s)
        Script scriptMock = mock(Script.class, "signInputs_script1");
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isSentToMultisig(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(false);
            MissingSigResolutionSigner target = new MissingSigResolutionSigner(Wallet.MissingSigsMode.USE_DUMMY_SIG);
            List<TransactionInput> transactionInputList = new ArrayList<>();
            transactionInputList.add(transactionInputMock);
            doReturn(transactionInputList).when(partialTxMock).getInputs();
            doReturn(transactionInputMock2).when(partialTxMock2).getInput(0L);
            doReturn(transactionOutputMock, transactionOutputMock2).when(transactionInputMock2).getConnectedOutput();
            doReturn(scriptMock).when(transactionOutputMock2).getScriptPubKey();
            doReturn(scriptMock2).when(transactionInputMock2).getScriptSig();
            IllegalStateException illegalStateException = new IllegalStateException("cannot handle: signInputs_script1");
            thrown.expect(IllegalStateException.class);
            thrown.expectMessage(illegalStateException.getMessage());
            TransactionSigner.ProposedTransaction transactionSignerProposedTransaction = new TransactionSigner.ProposedTransaction(partialTxMock2);
            //Act Statement(s)
            target.signInputs(transactionSignerProposedTransaction, keyBagMock);
            //Assert statement(s)
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isSentToMultisig(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            verify(partialTxMock).getInputs();
            verify(partialTxMock2).getInput(0L);
            verify(transactionInputMock2, times(2)).getConnectedOutput();
            verify(transactionOutputMock2).getScriptPubKey();
            verify(transactionInputMock2).getScriptSig();
        }
    }

    //Sapient generated method id: ${71c92121-a44a-3eb6-9001-047798f780bb}
    @Ignore()
    @Test()
    public void signInputsWhenScriptChunkEqualsOpCode0AndMissingSigsModeEqualsWalletMis3ThrowsTransactionSignerMissingSignatureException() throws ScriptException {
        /* Branches:
         * (missingSigsMode == Wallet.MissingSigsMode.USE_OP_ZERO) : false
         * (i < numInputs) : true
         * (txIn.getConnectedOutput() == null) : false
         * (ScriptPattern.isP2SH(scriptPubKey)) : false
         * (ScriptPattern.isSentToMultisig(scriptPubKey)) : true
         * (ScriptPattern.isP2SH(scriptPubKey)) : false
         * (j < inputScript.chunks().size() - sigSuffixCount) : true
         * (scriptChunk.equalsOpCode(0)) : true
         * (missingSigsMode == Wallet.MissingSigsMode.THROW) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isSentToMultisig(scriptMock)).thenReturn(true);
            MissingSigResolutionSigner target = new MissingSigResolutionSigner(Wallet.MissingSigsMode.THROW);
            List<TransactionInput> transactionInputList = new ArrayList<>();
            transactionInputList.add(transactionInputMock);
            doReturn(transactionInputList).when(partialTxMock).getInputs();
            doReturn(transactionInputMock2).when(partialTxMock2).getInput(0L);
            doReturn(transactionOutputMock, transactionOutputMock2).when(transactionInputMock2).getConnectedOutput();
            doReturn(scriptMock).when(transactionOutputMock2).getScriptPubKey();
            doReturn(scriptMock2).when(transactionInputMock2).getScriptSig();
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(scriptChunkMock);
            scriptChunkList.add(scriptChunkMock2);
            List<ScriptChunk> scriptChunkList2 = new ArrayList<>();
            scriptChunkList2.add(scriptChunkMock3);
            scriptChunkList2.add(scriptChunkMock4);
            doReturn(scriptChunkList, scriptChunkList2).when(scriptMock2).chunks();
            doReturn(true).when(scriptChunkMock4).equalsOpCode(0);
            thrown.expect(TransactionSigner.MissingSignatureException.class);
            TransactionSigner.ProposedTransaction transactionSignerProposedTransaction = new TransactionSigner.ProposedTransaction(partialTxMock2);
            //Act Statement(s)
            target.signInputs(transactionSignerProposedTransaction, keyBagMock);
            //Assert statement(s)
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(2));
            scriptPattern.verify(() -> ScriptPattern.isSentToMultisig(scriptMock), atLeast(1));
            verify(partialTxMock).getInputs();
            verify(partialTxMock2).getInput(0L);
            verify(transactionInputMock2, times(2)).getConnectedOutput();
            verify(transactionOutputMock2).getScriptPubKey();
            verify(transactionInputMock2).getScriptSig();
            verify(scriptMock2, times(2)).chunks();
            verify(scriptChunkMock4).equalsOpCode(0);
        }
    }

    //Sapient generated method id: ${8905dab8-a6cc-3c0d-8eaa-074ef6a55557}
    @Ignore()
    @Test()
    public void signInputsWhenInputScriptChunksGet0EqualsOpCode0AndMissingSigsModeEqualsWalletMissThrowsECKeyMissingPrivateKeyException() throws ScriptException {
        /* Branches:
         * (missingSigsMode == Wallet.MissingSigsMode.USE_OP_ZERO) : false
         * (i < numInputs) : true
         * (txIn.getConnectedOutput() == null) : false
         * (ScriptPattern.isP2SH(scriptPubKey)) : false
         * (ScriptPattern.isSentToMultisig(scriptPubKey)) : false
         * (ScriptPattern.isP2PK(scriptPubKey)) : false
         * (ScriptPattern.isP2PKH(scriptPubKey)) : true
         * (inputScript.chunks().get(0).equalsOpCode(0)) : true
         * (missingSigsMode == Wallet.MissingSigsMode.THROW) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isSentToMultisig(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(true);
            MissingSigResolutionSigner target = new MissingSigResolutionSigner(Wallet.MissingSigsMode.THROW);
            List<TransactionInput> transactionInputList = new ArrayList<>();
            transactionInputList.add(transactionInputMock);
            doReturn(transactionInputList).when(partialTxMock).getInputs();
            doReturn(transactionInputMock2).when(partialTxMock2).getInput(0L);
            doReturn(transactionOutputMock, transactionOutputMock2).when(transactionInputMock2).getConnectedOutput();
            doReturn(scriptMock).when(transactionOutputMock2).getScriptPubKey();
            doReturn(scriptMock2).when(transactionInputMock2).getScriptSig();
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(scriptChunkMock);
            doReturn(scriptChunkList).when(scriptMock2).chunks();
            doReturn(true).when(scriptChunkMock).equalsOpCode(0);
            thrown.expect(ECKey.MissingPrivateKeyException.class);
            TransactionSigner.ProposedTransaction transactionSignerProposedTransaction = new TransactionSigner.ProposedTransaction(partialTxMock2);
            //Act Statement(s)
            target.signInputs(transactionSignerProposedTransaction, keyBagMock);
            //Assert statement(s)
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isSentToMultisig(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            verify(partialTxMock).getInputs();
            verify(partialTxMock2).getInput(0L);
            verify(transactionInputMock2, times(2)).getConnectedOutput();
            verify(transactionOutputMock2).getScriptPubKey();
            verify(transactionInputMock2).getScriptSig();
            verify(scriptMock2).chunks();
            verify(scriptChunkMock).equalsOpCode(0);
        }
    }

    //Sapient generated method id: ${b3b3a5ea-cfd6-3063-ba38-9d51bac03af4}
    @Ignore()
    @Test()
    public void signInputsWhenMissingSigsModeNotEqualsWalletMissingSigsModeTHROWAndMissingSigsModeEqualsWalletMissingSigsModeUSE_DUMMY_3() throws ScriptException {
        /* Branches:
         * (missingSigsMode == Wallet.MissingSigsMode.USE_OP_ZERO) : false
         * (i < numInputs) : true
         * (txIn.getConnectedOutput() == null) : false
         * (ScriptPattern.isP2SH(scriptPubKey)) : false
         * (ScriptPattern.isSentToMultisig(scriptPubKey)) : true
         * (ScriptPattern.isP2SH(scriptPubKey)) : true
         * (j < inputScript.chunks().size() - sigSuffixCount) : true
         * (scriptChunk.equalsOpCode(0)) : true
         * (missingSigsMode == Wallet.MissingSigsMode.THROW) : false
         * (missingSigsMode == Wallet.MissingSigsMode.USE_DUMMY_SIG) : true
         */
        //Arrange Statement(s)
        ScriptChunk scriptChunkMock5 = mock(ScriptChunk.class);
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            byte[] byteArray = new byte[]{(byte) 48, (byte) 68, (byte) 2, (byte) 32, (byte) 127, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) 93, (byte) 87, (byte) 110, (byte) 115, (byte) 87, (byte) -92, (byte) 80, (byte) 29, (byte) -33, (byte) -23, (byte) 47, (byte) 70, (byte) 104, (byte) 27, (byte) 32, (byte) -96, (byte) 2, (byte) 32, (byte) 127, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) 93, (byte) 87, (byte) 110, (byte) 115, (byte) 87, (byte) -92, (byte) 80, (byte) 29, (byte) -33, (byte) -23, (byte) 47, (byte) 70, (byte) 104, (byte) 27, (byte) 32, (byte) -96, (byte) 1};
            doReturn(scriptMock2).when(scriptMock).getScriptSigWithSignature(scriptMock3, byteArray, 0);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(scriptChunkMock);
            scriptChunkList.add(scriptChunkMock2);
            scriptChunkList.add(scriptChunkMock3);
            List<ScriptChunk> scriptChunkList2 = new ArrayList<>();
            scriptChunkList2.add(scriptChunkMock4);
            scriptChunkList2.add(scriptChunkMock5);
            doReturn(true).when(scriptChunkMock5).equalsOpCode(0);
            List<ScriptChunk> scriptChunkList3 = new ArrayList<>();
            doReturn(scriptChunkList, scriptChunkList2, scriptChunkList3).when(scriptMock3).chunks();
            scriptPattern.when(() -> ScriptPattern.isSentToMultisig(scriptMock)).thenReturn(true);
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(false).thenReturn(true);
            MissingSigResolutionSigner target = new MissingSigResolutionSigner(Wallet.MissingSigsMode.USE_DUMMY_SIG);
            List<TransactionInput> transactionInputList = new ArrayList<>();
            transactionInputList.add(transactionInputMock);
            doReturn(transactionInputList).when(partialTxMock).getInputs();
            doReturn(transactionInputMock2).when(partialTxMock).getInput(0L);
            doReturn(transactionOutputMock, transactionOutputMock2).when(transactionInputMock2).getConnectedOutput();
            doReturn(scriptMock).when(transactionOutputMock2).getScriptPubKey();
            doReturn(scriptMock3).when(transactionInputMock2).getScriptSig();
            doNothing().when(transactionInputMock2).setScriptSig(scriptMock2);
            TransactionSigner.ProposedTransaction transactionSignerProposedTransaction = new TransactionSigner.ProposedTransaction(partialTxMock);
            //Act Statement(s)
            boolean result = target.signInputs(transactionSignerProposedTransaction, keyBagMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(2));
            verify(scriptMock).getScriptSigWithSignature(scriptMock3, byteArray, 0);
            verify(scriptMock3, times(3)).chunks();
            verify(scriptChunkMock5).equalsOpCode(0);
            scriptPattern.verify(() -> ScriptPattern.isSentToMultisig(scriptMock), atLeast(1));
            verify(partialTxMock).getInputs();
            verify(partialTxMock).getInput(0L);
            verify(transactionInputMock2, times(2)).getConnectedOutput();
            verify(transactionOutputMock2).getScriptPubKey();
            verify(transactionInputMock2).getScriptSig();
            verify(transactionInputMock2).setScriptSig(scriptMock2);
        }
    }

    //Sapient generated method id: ${6ce799e7-c1f3-3a63-ace2-57e6e73eba22}
    @Ignore()
    @Test()
    public void signInputsWhenMissingSigsModeNotEqualsWalletMissingSigsModeTHROWAndMissingSigsModeEqualsWalletMissingSigsModeUSE_DUMMY_5() throws ScriptException {
        /* Branches:
         * (missingSigsMode == Wallet.MissingSigsMode.USE_OP_ZERO) : false
         * (i < numInputs) : true
         * (txIn.getConnectedOutput() == null) : false
         * (ScriptPattern.isP2SH(scriptPubKey)) : false
         * (ScriptPattern.isSentToMultisig(scriptPubKey)) : false
         * (ScriptPattern.isP2PK(scriptPubKey)) : false
         * (ScriptPattern.isP2PKH(scriptPubKey)) : true
         * (inputScript.chunks().get(0).equalsOpCode(0)) : true
         * (missingSigsMode == Wallet.MissingSigsMode.THROW) : false
         * (missingSigsMode == Wallet.MissingSigsMode.USE_DUMMY_SIG) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(false);
            byte[] byteArray = new byte[]{(byte) 48, (byte) 68, (byte) 2, (byte) 32, (byte) 127, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) 93, (byte) 87, (byte) 110, (byte) 115, (byte) 87, (byte) -92, (byte) 80, (byte) 29, (byte) -33, (byte) -23, (byte) 47, (byte) 70, (byte) 104, (byte) 27, (byte) 32, (byte) -96, (byte) 2, (byte) 32, (byte) 127, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) 93, (byte) 87, (byte) 110, (byte) 115, (byte) 87, (byte) -92, (byte) 80, (byte) 29, (byte) -33, (byte) -23, (byte) 47, (byte) 70, (byte) 104, (byte) 27, (byte) 32, (byte) -96, (byte) 1};
            doReturn(scriptMock2).when(scriptMock).getScriptSigWithSignature(scriptMock3, byteArray, 0);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(scriptChunkMock);
            doReturn(scriptChunkList).when(scriptMock3).chunks();
            doReturn(true).when(scriptChunkMock).equalsOpCode(0);
            scriptPattern.when(() -> ScriptPattern.isSentToMultisig(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(true);
            MissingSigResolutionSigner target = new MissingSigResolutionSigner(Wallet.MissingSigsMode.USE_DUMMY_SIG);
            List<TransactionInput> transactionInputList = new ArrayList<>();
            transactionInputList.add(transactionInputMock);
            doReturn(transactionInputList).when(partialTxMock).getInputs();
            doReturn(transactionInputMock2).when(partialTxMock).getInput(0L);
            doReturn(transactionOutputMock, transactionOutputMock2).when(transactionInputMock2).getConnectedOutput();
            doReturn(scriptMock).when(transactionOutputMock2).getScriptPubKey();
            doReturn(scriptMock3).when(transactionInputMock2).getScriptSig();
            doNothing().when(transactionInputMock2).setScriptSig(scriptMock2);
            TransactionSigner.ProposedTransaction transactionSignerProposedTransaction = new TransactionSigner.ProposedTransaction(partialTxMock);
            //Act Statement(s)
            boolean result = target.signInputs(transactionSignerProposedTransaction, keyBagMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(1));
            verify(scriptMock).getScriptSigWithSignature(scriptMock3, byteArray, 0);
            verify(scriptMock3).chunks();
            verify(scriptChunkMock).equalsOpCode(0);
            scriptPattern.verify(() -> ScriptPattern.isSentToMultisig(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            verify(partialTxMock).getInputs();
            verify(partialTxMock).getInput(0L);
            verify(transactionInputMock2, times(2)).getConnectedOutput();
            verify(transactionOutputMock2).getScriptPubKey();
            verify(transactionInputMock2).getScriptSig();
            verify(transactionInputMock2).setScriptSig(scriptMock2);
        }
    }

    //Sapient generated method id: ${8685b0d2-8912-3bd1-b967-feeacd565f6a}
    @Test()
    public void signInputsWhenMissingSigsModeNotEqualsWalletMissingSigsModeTHROWAndMissingSigsModeEqualsWalletMissingSigsModeUSE_DUMMY_6() throws ScriptException {
        /* Branches:
         * (missingSigsMode == Wallet.MissingSigsMode.USE_OP_ZERO) : false
         * (i < numInputs) : true
         * (txIn.getConnectedOutput() == null) : false
         * (ScriptPattern.isP2SH(scriptPubKey)) : false
         * (ScriptPattern.isSentToMultisig(scriptPubKey)) : false
         * (ScriptPattern.isP2PK(scriptPubKey)) : false
         * (ScriptPattern.isP2PKH(scriptPubKey)) : false
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : true
         * (txIn.getWitness() == null) : true
         * (missingSigsMode == Wallet.MissingSigsMode.THROW) : false
         * (missingSigsMode == Wallet.MissingSigsMode.USE_DUMMY_SIG) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<TransactionWitness> transactionWitness = mockStatic(TransactionWitness.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(eCKeyMock).when(keyBagMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2WPKH);
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isSentToMultisig(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(true);
            scriptPattern.when(() -> ScriptPattern.extractHashFromP2WH(scriptMock)).thenReturn(byteArray);
            transactionWitness.when(() -> TransactionWitness.redeemP2WPKH((TransactionSignature) any(), eq(eCKeyMock))).thenReturn(transactionWitnessMock);
            MissingSigResolutionSigner target = new MissingSigResolutionSigner(Wallet.MissingSigsMode.USE_DUMMY_SIG);
            List<TransactionInput> transactionInputList = new ArrayList<>();
            transactionInputList.add(transactionInputMock);
            doReturn(transactionInputList).when(partialTxMock).getInputs();
            doReturn(transactionInputMock2).when(partialTxMock).getInput(0L);
            doReturn(transactionOutputMock, transactionOutputMock2).when(transactionInputMock2).getConnectedOutput();
            doReturn(scriptMock).when(transactionOutputMock2).getScriptPubKey();
            doReturn(scriptMock2).when(transactionInputMock2).getScriptSig();
            doReturn(null).when(transactionInputMock2).getWitness();
            doNothing().when(transactionInputMock2).setWitness(transactionWitnessMock);
            TransactionSigner.ProposedTransaction transactionSignerProposedTransaction = new TransactionSigner.ProposedTransaction(partialTxMock);
            //Act Statement(s)
            boolean result = target.signInputs(transactionSignerProposedTransaction, keyBagMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            verify(keyBagMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2WPKH);
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isSentToMultisig(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractHashFromP2WH(scriptMock), atLeast(1));
            transactionWitness.verify(() -> TransactionWitness.redeemP2WPKH((TransactionSignature) any(), eq(eCKeyMock)));
            verify(partialTxMock).getInputs();
            verify(partialTxMock).getInput(0L);
            verify(transactionInputMock2, times(2)).getConnectedOutput();
            verify(transactionOutputMock2).getScriptPubKey();
            verify(transactionInputMock2).getScriptSig();
            verify(transactionInputMock2).getWitness();
            verify(transactionInputMock2).setWitness(transactionWitnessMock);
        }
    }

    //Sapient generated method id: ${21410d69-f718-3fd1-a97d-89e795aebfa4}
    @Test()
    public void signInputsWhenMissingSigsModeNotEqualsWalletMissingSigsModeTHROWAndMissingSigsModeEqualsWalletMissingSigsModeUSE_DUMMY_7() throws ScriptException {
        /* Branches:
         * (missingSigsMode == Wallet.MissingSigsMode.USE_OP_ZERO) : false
         * (i < numInputs) : true
         * (txIn.getConnectedOutput() == null) : false
         * (ScriptPattern.isP2SH(scriptPubKey)) : false
         * (ScriptPattern.isSentToMultisig(scriptPubKey)) : false
         * (ScriptPattern.isP2PK(scriptPubKey)) : false
         * (ScriptPattern.isP2PKH(scriptPubKey)) : false
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : true
         * (txIn.getWitness() == null) : false
         * (txIn.getWitness().equals(TransactionWitness.EMPTY)) : true
         * (missingSigsMode == Wallet.MissingSigsMode.THROW) : false
         * (missingSigsMode == Wallet.MissingSigsMode.USE_DUMMY_SIG) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<TransactionWitness> transactionWitness = mockStatic(TransactionWitness.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(eCKeyMock).when(keyBagMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2WPKH);
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isSentToMultisig(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(true);
            scriptPattern.when(() -> ScriptPattern.extractHashFromP2WH(scriptMock)).thenReturn(byteArray);
            transactionWitness.when(() -> TransactionWitness.redeemP2WPKH((TransactionSignature) any(), eq(eCKeyMock))).thenReturn(transactionWitnessMock);
            MissingSigResolutionSigner target = new MissingSigResolutionSigner(Wallet.MissingSigsMode.USE_DUMMY_SIG);
            List<TransactionInput> transactionInputList = new ArrayList<>();
            transactionInputList.add(transactionInputMock);
            doReturn(transactionInputList).when(partialTxMock).getInputs();
            doReturn(transactionInputMock2).when(partialTxMock).getInput(0L);
            doReturn(transactionOutputMock, transactionOutputMock2).when(transactionInputMock2).getConnectedOutput();
            doReturn(scriptMock).when(transactionOutputMock2).getScriptPubKey();
            doReturn(scriptMock2).when(transactionInputMock2).getScriptSig();
            TransactionWitness transactionWitness2 = TransactionWitness.EMPTY;
            doReturn(transactionWitnessMock2, transactionWitness2).when(transactionInputMock2).getWitness();
            doNothing().when(transactionInputMock2).setWitness(transactionWitnessMock);
            TransactionSigner.ProposedTransaction transactionSignerProposedTransaction = new TransactionSigner.ProposedTransaction(partialTxMock);
            //Act Statement(s)
            boolean result = target.signInputs(transactionSignerProposedTransaction, keyBagMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            verify(keyBagMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2WPKH);
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isSentToMultisig(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractHashFromP2WH(scriptMock), atLeast(1));
            transactionWitness.verify(() -> TransactionWitness.redeemP2WPKH((TransactionSignature) any(), eq(eCKeyMock)));
            verify(partialTxMock).getInputs();
            verify(partialTxMock).getInput(0L);
            verify(transactionInputMock2, times(2)).getConnectedOutput();
            verify(transactionOutputMock2).getScriptPubKey();
            verify(transactionInputMock2).getScriptSig();
            verify(transactionInputMock2, times(2)).getWitness();
            verify(transactionInputMock2).setWitness(transactionWitnessMock);
        }
    }

    //Sapient generated method id: ${d539a172-077b-3f91-a7a2-bc61068d5195}
    @Ignore()
    @Test()
    public void signInputsWhenTxInGetWitnessGetPush0LengthEquals0AndMissingSigsModeEqualsWalletMisThrowsECKeyMissingPrivateKeyException() throws ScriptException {
        /* Branches:
         * (missingSigsMode == Wallet.MissingSigsMode.USE_OP_ZERO) : false
         * (i < numInputs) : true
         * (txIn.getConnectedOutput() == null) : false
         * (ScriptPattern.isP2SH(scriptPubKey)) : false
         * (ScriptPattern.isSentToMultisig(scriptPubKey)) : false
         * (ScriptPattern.isP2PK(scriptPubKey)) : false
         * (ScriptPattern.isP2PKH(scriptPubKey)) : false
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : true
         * (txIn.getWitness() == null) : false
         * (txIn.getWitness().equals(TransactionWitness.EMPTY)) : false
         * (txIn.getWitness().getPush(0).length == 0) : true
         * (missingSigsMode == Wallet.MissingSigsMode.THROW) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isSentToMultisig(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(true);
            MissingSigResolutionSigner target = new MissingSigResolutionSigner(Wallet.MissingSigsMode.THROW);
            List<TransactionInput> transactionInputList = new ArrayList<>();
            transactionInputList.add(transactionInputMock);
            doReturn(transactionInputList).when(partialTxMock).getInputs();
            doReturn(transactionInputMock2).when(partialTxMock2).getInput(0L);
            doReturn(transactionOutputMock, transactionOutputMock2).when(transactionInputMock2).getConnectedOutput();
            doReturn(scriptMock).when(transactionOutputMock2).getScriptPubKey();
            doReturn(scriptMock2).when(transactionInputMock2).getScriptSig();
            doReturn(transactionWitnessMock, transactionWitnessMock2, transactionWitnessMock3).when(transactionInputMock2).getWitness();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(transactionWitnessMock3).getPush(0);
            thrown.expect(ECKey.MissingPrivateKeyException.class);
            TransactionSigner.ProposedTransaction transactionSignerProposedTransaction = new TransactionSigner.ProposedTransaction(partialTxMock2);
            //Act Statement(s)
            target.signInputs(transactionSignerProposedTransaction, keyBagMock);
            //Assert statement(s)
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isSentToMultisig(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            verify(partialTxMock).getInputs();
            verify(partialTxMock2).getInput(0L);
            verify(transactionInputMock2, times(2)).getConnectedOutput();
            verify(transactionOutputMock2).getScriptPubKey();
            verify(transactionInputMock2).getScriptSig();
            verify(transactionInputMock2, times(3)).getWitness();
            verify(transactionWitnessMock3).getPush(0);
        }
    }

    //Sapient generated method id: ${311e8ef9-ad4a-3577-be65-6c029b670d42}
    @Ignore()
    @Test()
    public void signInputsWhenMissingSigsModeNotEqualsWalletMissingSigsModeTHROWAndMissingSigsModeEqualsWalletMissingSigsModeUSE_DUMMY_8() throws ScriptException {
        /* Branches:
         * (missingSigsMode == Wallet.MissingSigsMode.USE_OP_ZERO) : false
         * (i < numInputs) : true
         * (txIn.getConnectedOutput() == null) : false
         * (ScriptPattern.isP2SH(scriptPubKey)) : false
         * (ScriptPattern.isSentToMultisig(scriptPubKey)) : false
         * (ScriptPattern.isP2PK(scriptPubKey)) : false
         * (ScriptPattern.isP2PKH(scriptPubKey)) : false
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : true
         * (txIn.getWitness() == null) : false
         * (txIn.getWitness().equals(TransactionWitness.EMPTY)) : false
         * (txIn.getWitness().getPush(0).length == 0) : true
         * (missingSigsMode == Wallet.MissingSigsMode.THROW) : false
         * (missingSigsMode == Wallet.MissingSigsMode.USE_DUMMY_SIG) : true
         */
        //Arrange Statement(s)
        TransactionWitness transactionWitnessMock4 = mock(TransactionWitness.class);
        try (MockedStatic<TransactionWitness> transactionWitness = mockStatic(TransactionWitness.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(eCKeyMock).when(keyBagMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2WPKH);
            scriptPattern.when(() -> ScriptPattern.isP2SH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isSentToMultisig(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(true);
            scriptPattern.when(() -> ScriptPattern.extractHashFromP2WH(scriptMock)).thenReturn(byteArray);
            transactionWitness.when(() -> TransactionWitness.redeemP2WPKH((TransactionSignature) any(), eq(eCKeyMock))).thenReturn(transactionWitnessMock);
            MissingSigResolutionSigner target = new MissingSigResolutionSigner(Wallet.MissingSigsMode.USE_DUMMY_SIG);
            List<TransactionInput> transactionInputList = new ArrayList<>();
            transactionInputList.add(transactionInputMock);
            doReturn(transactionInputList).when(partialTxMock).getInputs();
            doReturn(transactionInputMock2).when(partialTxMock).getInput(0L);
            doReturn(transactionOutputMock, transactionOutputMock2).when(transactionInputMock2).getConnectedOutput();
            doReturn(scriptMock).when(transactionOutputMock2).getScriptPubKey();
            doReturn(scriptMock2).when(transactionInputMock2).getScriptSig();
            doReturn(transactionWitnessMock2, transactionWitnessMock3, transactionWitnessMock4).when(transactionInputMock2).getWitness();
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(transactionWitnessMock4).getPush(0);
            doNothing().when(transactionInputMock2).setWitness(transactionWitnessMock);
            TransactionSigner.ProposedTransaction transactionSignerProposedTransaction = new TransactionSigner.ProposedTransaction(partialTxMock);
            //Act Statement(s)
            boolean result = target.signInputs(transactionSignerProposedTransaction, keyBagMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            verify(keyBagMock).findKeyFromPubKeyHash(byteArray, ScriptType.P2WPKH);
            scriptPattern.verify(() -> ScriptPattern.isP2SH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isSentToMultisig(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractHashFromP2WH(scriptMock), atLeast(1));
            transactionWitness.verify(() -> TransactionWitness.redeemP2WPKH((TransactionSignature) any(), eq(eCKeyMock)));
            verify(partialTxMock).getInputs();
            verify(partialTxMock).getInput(0L);
            verify(transactionInputMock2, times(2)).getConnectedOutput();
            verify(transactionOutputMock2).getScriptPubKey();
            verify(transactionInputMock2).getScriptSig();
            verify(transactionInputMock2, times(3)).getWitness();
            verify(transactionWitnessMock4).getPush(0);
            verify(transactionInputMock2).setWitness(transactionWitnessMock);
        }
    }
}
