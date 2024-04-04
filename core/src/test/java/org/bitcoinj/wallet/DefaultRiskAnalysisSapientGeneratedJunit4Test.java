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

    //Sapient generated method id: ${9af24d98-62f2-362b-99e1-4dc5ba4e62cd}, hash: 838916E9C87B4FFF253F89B1EEEDC0B7
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

    //Sapient generated method id: ${5ea7d8c0-9c83-3814-824e-b7ae06c4dc14}, hash: 8CF732AACCB05F7EAB6E9F4043DFDE5A
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
            defaultRiskAnalysis.when(() -> DefaultRiskAnalysis.isOutputStandard(transactionOutputMock)).thenReturn(DefaultRiskAnalysis.RuleViolation.NONEMPTY_STACK);
            //Act Statement(s)
            DefaultRiskAnalysis.RuleViolation result = DefaultRiskAnalysis.isStandard(txMock);
            //Assert statement(s)
            assertThat(result, equalTo(DefaultRiskAnalysis.RuleViolation.NONEMPTY_STACK));
            verify(txMock, times(2)).getVersion();
            verify(txMock, atLeast(1)).getOutputs();
            defaultRiskAnalysis.verify(() -> DefaultRiskAnalysis.isOutputStandard(transactionOutputMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${1ed8aca5-73ee-345e-b243-1e7b79321eaf}, hash: CB73FB73907497B1A94C3DF3B9F9F251
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

    //Sapient generated method id: ${b01c5be9-353e-3c3c-b096-ec2da401f5c6}, hash: 982100DF74411B089C83A17F5E9D8FD9
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

    //Sapient generated method id: ${24bc5b25-14fd-387a-ab8f-978c4a272f0c}, hash: 2FEF6D9F030CC084387F7E4A8E9131F4
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

    //Sapient generated method id: ${178589c7-56e1-3f74-a83b-02e6d28aed62}, hash: 024372DC7A5A714E9EEE01B2E2CE963F
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

    //Sapient generated method id: ${cdba3550-c191-3600-8aee-00e987289d7b}, hash: 6ADDCDB7ADD61632478A7E0E899285DD
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

    //Sapient generated method id: ${a0cee6c4-daed-338a-a3bc-a4820f05105c}, hash: 806A554D2B323FE7D82B1C40D21DCBB1
    @Ignore()
    @Test()
    public void isInputStandardWhenChunkNotIsShortestPossiblePushData() throws ScriptException, SignatureDecodeException {
        /* Branches:
         * (for-each(input.getScriptSig().chunks())) : true
         * (chunk.data != null) : true
         * (!chunk.isShortestPossiblePushData()) : true
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

    //Sapient generated method id: ${24a0f4c8-bfec-3c7b-9369-c8e61e2ccad4}, hash: 155D1D865962FE8F48AC86BB721EEC80
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
         */
        //Arrange Statement(s)
        SignatureDecodeException signatureDecodeExceptionMock = mock(SignatureDecodeException.class);
        try (MockedStatic<ECKey.ECDSASignature> eCKeyECDSASignature = mockStatic(ECKey.ECDSASignature.class)) {
            doReturn(scriptMock).when(inputMock).getScriptSig();
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(scriptChunkMock);
            doReturn(scriptChunkList).when(scriptMock).chunks();
            doReturn(true).when(scriptChunkMock).isShortestPossiblePushData();
            doReturn(true).when(scriptChunkMock).isPushData();
            eCKeyECDSASignature.when(() -> ECKey.ECDSASignature.decodeFromDER((byte[]) null)).thenThrow(signatureDecodeExceptionMock);
            //Act Statement(s)
            DefaultRiskAnalysis.RuleViolation result = DefaultRiskAnalysis.isInputStandard(inputMock);
            //Assert statement(s)
            assertThat(result, equalTo(DefaultRiskAnalysis.RuleViolation.NONE));
            verify(inputMock).getScriptSig();
            verify(scriptMock).chunks();
            verify(scriptChunkMock).isShortestPossiblePushData();
            verify(scriptChunkMock).isPushData();
            eCKeyECDSASignature.verify(() -> ECKey.ECDSASignature.decodeFromDER((byte[]) null), atLeast(1));
        }
    }

    //Sapient generated method id: ${dd5e79fd-c0bd-3e4f-973b-f31885c77ded}, hash: 1FA9E1EC625DE9093880CF9614E95302
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
            transactionSignature.when(() -> TransactionSignature.isEncodingCanonical((byte[]) null)).thenReturn(false);
            //Act Statement(s)
            DefaultRiskAnalysis.RuleViolation result = DefaultRiskAnalysis.isInputStandard(inputMock);
            //Assert statement(s)
            assertThat(result, equalTo(DefaultRiskAnalysis.RuleViolation.SIGNATURE_CANONICAL_ENCODING));
            verify(inputMock).getScriptSig();
            verify(scriptMock).chunks();
            verify(scriptChunkMock).isShortestPossiblePushData();
            verify(scriptChunkMock).isPushData();
            eCKeyECDSASignature.verify(() -> ECKey.ECDSASignature.decodeFromDER(byteArray), atLeast(1));
            transactionSignature.verify(() -> TransactionSignature.isEncodingCanonical((byte[]) null), atLeast(1));
        }
    }

    //Sapient generated method id: ${b89f4d12-9b97-3f14-b6b4-4d37fd5470f6}, hash: 0A319F3BDC563E6A7FAD0D765D088F39
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
            transactionSignature.when(() -> TransactionSignature.isEncodingCanonical((byte[]) null)).thenReturn(true);
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
            transactionSignature.verify(() -> TransactionSignature.isEncodingCanonical((byte[]) null), atLeast(1));
        }
    }

    //Sapient generated method id: ${cad28a8e-63ea-355d-bc48-48e6c688bf52}, hash: FB6E992E35F48D44C7BC994DDF3593F9
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
            transactionSignature.when(() -> TransactionSignature.isEncodingCanonical((byte[]) null)).thenReturn(true);
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
            transactionSignature.verify(() -> TransactionSignature.isEncodingCanonical((byte[]) null), atLeast(1));
        }
    }
}
