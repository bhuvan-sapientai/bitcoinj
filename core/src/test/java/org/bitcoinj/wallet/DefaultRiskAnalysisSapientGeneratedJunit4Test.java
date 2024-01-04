package org.bitcoinj.wallet;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.crypto.SignatureDecodeException;
import org.bitcoinj.script.ScriptException;

import java.util.List;

import org.bitcoinj.core.TransactionInput;
import org.bitcoinj.script.ScriptChunk;
import org.bitcoinj.core.Transaction;
import org.bitcoinj.core.TransactionOutput;
import org.bitcoinj.crypto.TransactionSignature;
import org.bitcoinj.crypto.ECKey;
import org.mockito.MockedStatic;

import java.util.ArrayList;

import org.bitcoinj.script.Script;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

import org.junit.Ignore;

public class DefaultRiskAnalysisSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final ECKey.ECDSASignature eCKeyECDSASignatureMock = mock(ECKey.ECDSASignature.class);

    private final TransactionInput inputMock = mock(TransactionInput.class);

    private final TransactionOutput outputMock = mock(TransactionOutput.class);

    private final ScriptChunk scriptChunkMock = mock(ScriptChunk.class);

    private final Script scriptMock = mock(Script.class);

    private final TransactionInput transactionInputMock = mock(TransactionInput.class);

    private final TransactionOutput transactionOutputMock = mock(TransactionOutput.class);

    private final Transaction txMock = mock(Transaction.class);

    //Sapient generated method id: ${9af24d98-62f2-362b-99e1-4dc5ba4e62cd}
    @Test()
    public void isStandardWhenTxGetVersionLessThan1() throws SignatureDecodeException {
        /* Branches:
         * (tx.getVersion() > 2) : false
         * (tx.getVersion() < 1) : true
         */
        //Arrange Statement(s)
        doReturn(-1L).when(txMock).getVersion();

        //Act Statement(s)
        DefaultRiskAnalysis.RuleViolation result = DefaultRiskAnalysis.isStandard(txMock);

        //Assert statement(s)
        assertThat(result, equalTo(DefaultRiskAnalysis.RuleViolation.VERSION));
        verify(txMock, times(3)).getVersion();
    }

    //Sapient generated method id: ${5ea7d8c0-9c83-3814-824e-b7ae06c4dc14}
    @Test()
    public void isStandardWhenViolationNotEqualsRuleViolationNONE() throws SignatureDecodeException {
        /* Branches:
         * (tx.getVersion() > 2) : false
         * (tx.getVersion() < 1) : false
         * (i < outputs.size()) : true
         * (violation != RuleViolation.NONE) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<DefaultRiskAnalysis> defaultRiskAnalysis = mockStatic(DefaultRiskAnalysis.class, CALLS_REAL_METHODS)) {
            doReturn(1L).when(txMock).getVersion();
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(transactionOutputMock);
            doReturn(transactionOutputList).when(txMock).getOutputs();
            defaultRiskAnalysis.when(() -> DefaultRiskAnalysis.isOutputStandard(transactionOutputMock)).thenReturn(DefaultRiskAnalysis.RuleViolation.SIGNATURE_CANONICAL_ENCODING);
            //Act Statement(s)
            DefaultRiskAnalysis.RuleViolation result = DefaultRiskAnalysis.isStandard(txMock);
            //Assert statement(s)
            assertThat(result, equalTo(DefaultRiskAnalysis.RuleViolation.SIGNATURE_CANONICAL_ENCODING));
            verify(txMock, times(2)).getVersion();
            verify(txMock, atLeast(1)).getOutputs();
            defaultRiskAnalysis.verify(() -> DefaultRiskAnalysis.isOutputStandard(transactionOutputMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${1ed8aca5-73ee-345e-b243-1e7b79321eaf}
    @Test()
    public void isStandardWhenViolationEqualsRuleViolationNONEAndILessThanInputsSizeAndViolationNotEqualsRuleViolationNONE() throws SignatureDecodeException {
        /* Branches:
         * (tx.getVersion() > 2) : false
         * (tx.getVersion() < 1) : false
         * (i < outputs.size()) : true
         * (violation != RuleViolation.NONE) : false
         * (i < inputs.size()) : true
         * (violation != RuleViolation.NONE) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<DefaultRiskAnalysis> defaultRiskAnalysis = mockStatic(DefaultRiskAnalysis.class, CALLS_REAL_METHODS)) {
            doReturn(2L).when(txMock).getVersion();
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(transactionOutputMock);
            doReturn(transactionOutputList).when(txMock).getOutputs();
            List<TransactionInput> transactionInputList = new ArrayList<>();
            transactionInputList.add(transactionInputMock);
            doReturn(transactionInputList).when(txMock).getInputs();
            defaultRiskAnalysis.when(() -> DefaultRiskAnalysis.isOutputStandard(transactionOutputMock)).thenReturn(DefaultRiskAnalysis.RuleViolation.NONE);
            defaultRiskAnalysis.when(() -> DefaultRiskAnalysis.isInputStandard(transactionInputMock)).thenReturn(DefaultRiskAnalysis.RuleViolation.SHORTEST_POSSIBLE_PUSHDATA);
            //Act Statement(s)
            DefaultRiskAnalysis.RuleViolation result = DefaultRiskAnalysis.isStandard(txMock);
            //Assert statement(s)
            assertThat(result, equalTo(DefaultRiskAnalysis.RuleViolation.SHORTEST_POSSIBLE_PUSHDATA));
            verify(txMock, times(2)).getVersion();
            verify(txMock, atLeast(1)).getOutputs();
            verify(txMock, atLeast(1)).getInputs();
            defaultRiskAnalysis.verify(() -> DefaultRiskAnalysis.isOutputStandard(transactionOutputMock), atLeast(1));
            defaultRiskAnalysis.verify(() -> DefaultRiskAnalysis.isInputStandard(transactionInputMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${b01c5be9-353e-3c3c-b096-ec2da401f5c6}
    @Test()
    public void isStandardWhenILessThanInputsSizeAndViolationEqualsRuleViolationNONE() throws SignatureDecodeException {
        /* Branches:
         * (tx.getVersion() > 2) : false
         * (tx.getVersion() < 1) : false
         * (i < outputs.size()) : true
         * (violation != RuleViolation.NONE) : false
         * (i < inputs.size()) : true
         * (violation != RuleViolation.NONE) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<DefaultRiskAnalysis> defaultRiskAnalysis = mockStatic(DefaultRiskAnalysis.class, CALLS_REAL_METHODS)) {
            doReturn(1L).when(txMock).getVersion();
            List<TransactionOutput> transactionOutputList = new ArrayList<>();
            transactionOutputList.add(transactionOutputMock);
            doReturn(transactionOutputList).when(txMock).getOutputs();
            List<TransactionInput> transactionInputList = new ArrayList<>();
            transactionInputList.add(transactionInputMock);
            doReturn(transactionInputList).when(txMock).getInputs();
            defaultRiskAnalysis.when(() -> DefaultRiskAnalysis.isOutputStandard(transactionOutputMock)).thenReturn(DefaultRiskAnalysis.RuleViolation.NONE);
            defaultRiskAnalysis.when(() -> DefaultRiskAnalysis.isInputStandard(transactionInputMock)).thenReturn(DefaultRiskAnalysis.RuleViolation.NONE);
            //Act Statement(s)
            DefaultRiskAnalysis.RuleViolation result = DefaultRiskAnalysis.isStandard(txMock);
            //Assert statement(s)
            assertThat(result, equalTo(DefaultRiskAnalysis.RuleViolation.NONE));
            verify(txMock, times(2)).getVersion();
            verify(txMock, atLeast(1)).getOutputs();
            verify(txMock, atLeast(1)).getInputs();
            defaultRiskAnalysis.verify(() -> DefaultRiskAnalysis.isOutputStandard(transactionOutputMock), atLeast(1));
            defaultRiskAnalysis.verify(() -> DefaultRiskAnalysis.isInputStandard(transactionInputMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${24bc5b25-14fd-387a-ab8f-978c4a272f0c}
    @Test()
    public void isOutputStandardWhenOutputIsDust() {
        /* Branches:
         * (output.isDust()) : true
         */
        //Arrange Statement(s)
        doReturn(true).when(outputMock).isDust();

        //Act Statement(s)
        DefaultRiskAnalysis.RuleViolation result = DefaultRiskAnalysis.isOutputStandard(outputMock);

        //Assert statement(s)
        assertThat(result, equalTo(DefaultRiskAnalysis.RuleViolation.DUST));
        verify(outputMock).isDust();
    }

    //Sapient generated method id: ${178589c7-56e1-3f74-a83b-02e6d28aed62}
    @Test()
    public void isOutputStandardWhenChunkNotIsShortestPossiblePushData() throws ScriptException {
        /* Branches:
         * (output.isDust()) : false
         * (for-each(output.getScriptPubKey().chunks())) : true
         * (chunk.isPushData()) : true
         * (!chunk.isShortestPossiblePushData()) : true
         */
        //Arrange Statement(s)
        doReturn(false).when(outputMock).isDust();
        doReturn(scriptMock).when(outputMock).getScriptPubKey();
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        doReturn(true).when(scriptChunkMock).isPushData();
        doReturn(false).when(scriptChunkMock).isShortestPossiblePushData();

        //Act Statement(s)
        DefaultRiskAnalysis.RuleViolation result = DefaultRiskAnalysis.isOutputStandard(outputMock);

        //Assert statement(s)
        assertThat(result, equalTo(DefaultRiskAnalysis.RuleViolation.SHORTEST_POSSIBLE_PUSHDATA));
        verify(outputMock).isDust();
        verify(outputMock).getScriptPubKey();
        verify(scriptMock).chunks();
        verify(scriptChunkMock).isPushData();
        verify(scriptChunkMock).isShortestPossiblePushData();
    }

    //Sapient generated method id: ${cdba3550-c191-3600-8aee-00e987289d7b}
    @Test()
    public void isOutputStandardWhenChunkIsShortestPossiblePushData() throws ScriptException {
        /* Branches:
         * (output.isDust()) : false
         * (for-each(output.getScriptPubKey().chunks())) : true
         * (chunk.isPushData()) : true
         * (!chunk.isShortestPossiblePushData()) : false
         */
        //Arrange Statement(s)
        doReturn(false).when(outputMock).isDust();
        doReturn(scriptMock).when(outputMock).getScriptPubKey();
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        doReturn(true).when(scriptChunkMock).isPushData();
        doReturn(true).when(scriptChunkMock).isShortestPossiblePushData();

        //Act Statement(s)
        DefaultRiskAnalysis.RuleViolation result = DefaultRiskAnalysis.isOutputStandard(outputMock);

        //Assert statement(s)
        assertThat(result, equalTo(DefaultRiskAnalysis.RuleViolation.NONE));
        verify(outputMock).isDust();
        verify(outputMock).getScriptPubKey();
        verify(scriptMock).chunks();
        verify(scriptChunkMock).isPushData();
        verify(scriptChunkMock).isShortestPossiblePushData();
    }

    //Sapient generated method id: ${a0cee6c4-daed-338a-a3bc-a4820f05105c}
    @Ignore()
    @Test()
    public void isInputStandardWhenChunkNotIsShortestPossiblePushData() throws ScriptException, SignatureDecodeException {
        /* Branches:
         * (for-each(input.getScriptSig().chunks())) : true
         * (chunk.data != null) : true
         * (!chunk.isShortestPossiblePushData()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(scriptMock).when(inputMock).getScriptSig();
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        doReturn(false).when(scriptChunkMock).isShortestPossiblePushData();

        //Act Statement(s)
        DefaultRiskAnalysis.RuleViolation result = DefaultRiskAnalysis.isInputStandard(inputMock);

        //Assert statement(s)
        assertThat(result, equalTo(DefaultRiskAnalysis.RuleViolation.SHORTEST_POSSIBLE_PUSHDATA));
        verify(inputMock).getScriptSig();
        verify(scriptMock).chunks();
        verify(scriptChunkMock).isShortestPossiblePushData();
    }

    //Sapient generated method id: ${24a0f4c8-bfec-3c7b-9369-c8e61e2ccad4}
    @Ignore()
    @Test()
    public void isInputStandardWhenChunkIsPushDataAndCaughtSignatureDecodeExceptionAndSignatureIsNull() throws ScriptException, SignatureDecodeException {
        /* Branches:
         * (for-each(input.getScriptSig().chunks())) : true
         * (chunk.data != null) : true
         * (!chunk.isShortestPossiblePushData()) : false
         * (chunk.isPushData()) : true
         * (catch-exception (SignatureDecodeException)) : true
         * (signature != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey.ECDSASignature> eCKeyECDSASignature = mockStatic(ECKey.ECDSASignature.class)) {
            doReturn(scriptMock).when(inputMock).getScriptSig();
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(scriptChunkMock);
            doReturn(scriptChunkList).when(scriptMock).chunks();
            doReturn(true).when(scriptChunkMock).isShortestPossiblePushData();
            doReturn(true).when(scriptChunkMock).isPushData();
            byte[] byteArray = new byte[]{};
            eCKeyECDSASignature.when(() -> ECKey.ECDSASignature.decodeFromDER(byteArray)).thenReturn(eCKeyECDSASignatureMock);
            //Act Statement(s)
            DefaultRiskAnalysis.RuleViolation result = DefaultRiskAnalysis.isInputStandard(inputMock);
            //Assert statement(s)
            assertThat(result, equalTo(DefaultRiskAnalysis.RuleViolation.NONE));
            verify(inputMock).getScriptSig();
            verify(scriptMock).chunks();
            verify(scriptChunkMock).isShortestPossiblePushData();
            verify(scriptChunkMock).isPushData();
            eCKeyECDSASignature.verify(() -> ECKey.ECDSASignature.decodeFromDER(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${dd5e79fd-c0bd-3e4f-973b-f31885c77ded}
    @Ignore()
    @Test()
    public void isInputStandardWhenSignatureIsNotNullAndTransactionSignatureNotIsEncodingCanonicalChunkData() throws ScriptException, SignatureDecodeException {
        /* Branches:
         * (for-each(input.getScriptSig().chunks())) : true
         * (chunk.data != null) : true
         * (!chunk.isShortestPossiblePushData()) : false
         * (chunk.isPushData()) : true
         * (signature != null) : true
         * (!TransactionSignature.isEncodingCanonical(chunk.data)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<TransactionSignature> transactionSignature = mockStatic(TransactionSignature.class);
             MockedStatic<ECKey.ECDSASignature> eCKeyECDSASignature = mockStatic(ECKey.ECDSASignature.class)) {
            doReturn(scriptMock).when(inputMock).getScriptSig();
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(scriptChunkMock);
            doReturn(scriptChunkList).when(scriptMock).chunks();
            doReturn(true).when(scriptChunkMock).isShortestPossiblePushData();
            doReturn(true).when(scriptChunkMock).isPushData();
            byte[] byteArray = new byte[]{};
            eCKeyECDSASignature.when(() -> ECKey.ECDSASignature.decodeFromDER(byteArray)).thenReturn(eCKeyECDSASignatureMock);
            transactionSignature.when(() -> TransactionSignature.isEncodingCanonical(byteArray)).thenReturn(false);
            //Act Statement(s)
            DefaultRiskAnalysis.RuleViolation result = DefaultRiskAnalysis.isInputStandard(inputMock);
            //Assert statement(s)
            assertThat(result, equalTo(DefaultRiskAnalysis.RuleViolation.SIGNATURE_CANONICAL_ENCODING));
            verify(inputMock).getScriptSig();
            verify(scriptMock).chunks();
            verify(scriptChunkMock).isShortestPossiblePushData();
            verify(scriptChunkMock).isPushData();
            eCKeyECDSASignature.verify(() -> ECKey.ECDSASignature.decodeFromDER(byteArray), atLeast(1));
            transactionSignature.verify(() -> TransactionSignature.isEncodingCanonical(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${b89f4d12-9b97-3f14-b6b4-4d37fd5470f6}
    @Ignore()
    @Test()
    public void isInputStandardWhenTransactionSignatureIsEncodingCanonicalChunkDataAndSignatureNotIsCanonical() throws ScriptException, SignatureDecodeException {
        /* Branches:
         * (for-each(input.getScriptSig().chunks())) : true
         * (chunk.data != null) : true
         * (!chunk.isShortestPossiblePushData()) : false
         * (chunk.isPushData()) : true
         * (signature != null) : true
         * (!TransactionSignature.isEncodingCanonical(chunk.data)) : false
         * (!signature.isCanonical()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<TransactionSignature> transactionSignature = mockStatic(TransactionSignature.class);
             MockedStatic<ECKey.ECDSASignature> eCKeyECDSASignature = mockStatic(ECKey.ECDSASignature.class)) {
            doReturn(scriptMock).when(inputMock).getScriptSig();
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(scriptChunkMock);
            doReturn(scriptChunkList).when(scriptMock).chunks();
            doReturn(true).when(scriptChunkMock).isShortestPossiblePushData();
            doReturn(true).when(scriptChunkMock).isPushData();
            byte[] byteArray = new byte[]{};
            eCKeyECDSASignature.when(() -> ECKey.ECDSASignature.decodeFromDER(byteArray)).thenReturn(eCKeyECDSASignatureMock);
            doReturn(false).when(eCKeyECDSASignatureMock).isCanonical();
            transactionSignature.when(() -> TransactionSignature.isEncodingCanonical(byteArray)).thenReturn(true);
            //Act Statement(s)
            DefaultRiskAnalysis.RuleViolation result = DefaultRiskAnalysis.isInputStandard(inputMock);
            //Assert statement(s)
            assertThat(result, equalTo(DefaultRiskAnalysis.RuleViolation.SIGNATURE_CANONICAL_ENCODING));
            verify(inputMock).getScriptSig();
            verify(scriptMock).chunks();
            verify(scriptChunkMock).isShortestPossiblePushData();
            verify(scriptChunkMock).isPushData();
            eCKeyECDSASignature.verify(() -> ECKey.ECDSASignature.decodeFromDER(byteArray), atLeast(1));
            verify(eCKeyECDSASignatureMock).isCanonical();
            transactionSignature.verify(() -> TransactionSignature.isEncodingCanonical(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${cad28a8e-63ea-355d-bc48-48e6c688bf52}
    @Ignore()
    @Test()
    public void isInputStandardWhenTransactionSignatureIsEncodingCanonicalChunkDataAndSignatureIsCanonical() throws ScriptException, SignatureDecodeException {
        /* Branches:
         * (for-each(input.getScriptSig().chunks())) : true
         * (chunk.data != null) : true
         * (!chunk.isShortestPossiblePushData()) : false
         * (chunk.isPushData()) : true
         * (signature != null) : true
         * (!TransactionSignature.isEncodingCanonical(chunk.data)) : false
         * (!signature.isCanonical()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<TransactionSignature> transactionSignature = mockStatic(TransactionSignature.class);
             MockedStatic<ECKey.ECDSASignature> eCKeyECDSASignature = mockStatic(ECKey.ECDSASignature.class)) {
            doReturn(scriptMock).when(inputMock).getScriptSig();
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(scriptChunkMock);
            doReturn(scriptChunkList).when(scriptMock).chunks();
            doReturn(true).when(scriptChunkMock).isShortestPossiblePushData();
            doReturn(true).when(scriptChunkMock).isPushData();
            byte[] byteArray = new byte[]{};
            eCKeyECDSASignature.when(() -> ECKey.ECDSASignature.decodeFromDER(byteArray)).thenReturn(eCKeyECDSASignatureMock);
            doReturn(true).when(eCKeyECDSASignatureMock).isCanonical();
            transactionSignature.when(() -> TransactionSignature.isEncodingCanonical(byteArray)).thenReturn(true);
            //Act Statement(s)
            DefaultRiskAnalysis.RuleViolation result = DefaultRiskAnalysis.isInputStandard(inputMock);
            //Assert statement(s)
            assertThat(result, equalTo(DefaultRiskAnalysis.RuleViolation.NONE));
            verify(inputMock).getScriptSig();
            verify(scriptMock).chunks();
            verify(scriptChunkMock).isShortestPossiblePushData();
            verify(scriptChunkMock).isPushData();
            eCKeyECDSASignature.verify(() -> ECKey.ECDSASignature.decodeFromDER(byteArray), atLeast(1));
            verify(eCKeyECDSASignatureMock).isCanonical();
            transactionSignature.verify(() -> TransactionSignature.isEncodingCanonical(byteArray), atLeast(1));
        }
    }
}
