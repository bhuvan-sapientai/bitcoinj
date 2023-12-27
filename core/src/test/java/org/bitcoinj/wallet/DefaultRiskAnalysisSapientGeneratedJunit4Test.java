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

import java.math.BigInteger;

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

    private final Transaction txMock = mock(Transaction.class, "1");

    //Sapient generated method id: ${9af24d98-62f2-362b-99e1-4dc5ba4e62cd}
    @Test()
    public void isStandardWhenTxGetVersionLessThan1() throws SignatureDecodeException {
        /* Branches:
         * (tx.getVersion() > 2) : false
         * (tx.getVersion() < 1) : true
         */
        //Arrange Statement(s)
        Transaction txMock = mock(Transaction.class, "2");
        doReturn(2L, 0L, 0L).when(txMock).getVersion();

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
        doReturn(1L, 0L, 0L).when(txMock).getVersion();

        //Act Statement(s)
        DefaultRiskAnalysis.RuleViolation result = DefaultRiskAnalysis.isStandard(txMock);

        //Assert statement(s)
        assertThat(result, equalTo(DefaultRiskAnalysis.RuleViolation.VERSION));
        verify(txMock, times(3)).getVersion();
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
        doReturn(1L, 0L, 0L).when(txMock).getVersion();

        //Act Statement(s)
        DefaultRiskAnalysis.RuleViolation result = DefaultRiskAnalysis.isStandard(txMock);

        //Assert statement(s)
        assertThat(result, equalTo(DefaultRiskAnalysis.RuleViolation.VERSION));
        verify(txMock, times(3)).getVersion();
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
        doReturn(1L, 0L, 0L).when(txMock).getVersion();

        //Act Statement(s)
        DefaultRiskAnalysis.RuleViolation result = DefaultRiskAnalysis.isStandard(txMock);

        //Assert statement(s)
        assertThat(result, equalTo(DefaultRiskAnalysis.RuleViolation.VERSION));
        verify(txMock, times(3)).getVersion();
    }

    //Sapient generated method id: ${24bc5b25-14fd-387a-ab8f-978c4a272f0c}
    @Test()
    public void isOutputStandardWhenOutputIsDust() {
        /* Branches:
         * (output.isDust()) : true
         */
        //Arrange Statement(s)
        TransactionOutput outputMock = mock(TransactionOutput.class, "true");
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
        TransactionOutput outputMock = mock(TransactionOutput.class, "[{isPushData={value=true}, isShortestPossiblePushData={value=false}}]");
        doReturn(false).when(outputMock).isDust();
        List list = new ArrayList<>();
        Script script = Script.of(list);
        doReturn(script).when(outputMock).getScriptPubKey();

        //Act Statement(s)
        DefaultRiskAnalysis.RuleViolation result = DefaultRiskAnalysis.isOutputStandard(outputMock);

        //Assert statement(s)
        assertThat(result, equalTo(DefaultRiskAnalysis.RuleViolation.SHORTEST_POSSIBLE_PUSHDATA));
        verify(outputMock).isDust();
        verify(outputMock).getScriptPubKey();
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
        TransactionOutput outputMock = mock(TransactionOutput.class, "[{isPushData={value=true}, isShortestPossiblePushData={value=true}}, {isPushData={value=true}, isShortestPossiblePushData={value=true}}]");
        doReturn(false).when(outputMock).isDust();
        List list = new ArrayList<>();
        Script script = Script.of(list);
        doReturn(script).when(outputMock).getScriptPubKey();

        //Act Statement(s)
        DefaultRiskAnalysis.RuleViolation result = DefaultRiskAnalysis.isOutputStandard(outputMock);

        //Assert statement(s)
        assertThat(result, equalTo(DefaultRiskAnalysis.RuleViolation.NONE));
        verify(outputMock).isDust();
        verify(outputMock).getScriptPubKey();
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
        TransactionInput inputMock = mock(TransactionInput.class, "[{data={resultList=[1]}, isShortestPossiblePushData={value=true}}, {data={resultList=[2]}, isShortestPossiblePushData={value=true}}, {data={resultList=[3]}, isShortestPossiblePushData={value=false}}]");
        List list = new ArrayList<>();
        Script script = Script.of(list);
        doReturn(script).when(inputMock).getScriptSig();

        //Act Statement(s)
        DefaultRiskAnalysis.RuleViolation result = DefaultRiskAnalysis.isInputStandard(inputMock);

        //Assert statement(s)
        assertThat(result, equalTo(DefaultRiskAnalysis.RuleViolation.SHORTEST_POSSIBLE_PUSHDATA));
        verify(inputMock).getScriptSig();
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
        TransactionInput inputMock = mock(TransactionInput.class, "[{decodeFromDER={value=3045022100...}, data={resultList=[1, 2, 3]}, isEncodingCanonical={value=false}, isPushData={value=true}, isShortestPossiblePushData={value=false}}]");
        List list = new ArrayList<>();
        Script script = Script.of(list);
        doReturn(script).when(inputMock).getScriptSig();

        //Act Statement(s)
        DefaultRiskAnalysis.RuleViolation result = DefaultRiskAnalysis.isInputStandard(inputMock);

        //Assert statement(s)
        assertThat(result, equalTo(DefaultRiskAnalysis.RuleViolation.SHORTEST_POSSIBLE_PUSHDATA));
        verify(inputMock).getScriptSig();
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
        TransactionInput inputMock = mock(TransactionInput.class, "[{decodeFromDER={}, data={resultList=[1]}, isEncodingCanonical={value=true}, isPushData={value=true}, isCanonical={value=true}, isShortestPossiblePushData={value=true}}]");
        try (MockedStatic<TransactionSignature> transactionSignature = mockStatic(TransactionSignature.class);
             MockedStatic<ECKey.ECDSASignature> eCKeyECDSASignature = mockStatic(ECKey.ECDSASignature.class)) {
            List list = new ArrayList<>();
            Script script = Script.of(list);
            doReturn(script).when(inputMock).getScriptSig();
            ECKey.ECDSASignature eCKeyECDSASignature2 = new ECKey.ECDSASignature(new BigInteger("0"), new BigInteger("0"));
            byte[] byteArray = new byte[]{};
            eCKeyECDSASignature.when(() -> ECKey.ECDSASignature.decodeFromDER(byteArray)).thenReturn(eCKeyECDSASignature2);
            transactionSignature.when(() -> TransactionSignature.isEncodingCanonical(byteArray)).thenReturn(true);
            //Act Statement(s)
            DefaultRiskAnalysis.RuleViolation result = DefaultRiskAnalysis.isInputStandard(inputMock);
            //Assert statement(s)
            assertThat(result, equalTo(DefaultRiskAnalysis.RuleViolation.SHORTEST_POSSIBLE_PUSHDATA));
            verify(inputMock).getScriptSig();
            eCKeyECDSASignature.verify(() -> ECKey.ECDSASignature.decodeFromDER(byteArray), atLeast(1));
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
        TransactionInput inputMock = mock(TransactionInput.class, "[{decodeFromDER={value=null}, data={resultList=[1, 2, 3]}, isEncodingCanonical={value=true}, isPushData={value=true}, isCanonical={value=true}, isShortestPossiblePushData={value=true}}, {decodeFromDER={value=null}, data={resultList=[4, 5, 6]}, isEncodingCanonical={value=true}, isPushData={value=true}, isCanonical={value=true}, isShortestPossiblePushData={value=true}}]");
        ECKey.ECDSASignature eCKeyECDSASignatureMock = mock(ECKey.ECDSASignature.class);
        try (MockedStatic<TransactionSignature> transactionSignature = mockStatic(TransactionSignature.class);
             MockedStatic<ECKey.ECDSASignature> eCKeyECDSASignature = mockStatic(ECKey.ECDSASignature.class)) {
            List list = new ArrayList<>();
            Script script = Script.of(list);
            doReturn(script).when(inputMock).getScriptSig();
            byte[] byteArray = new byte[]{};
            eCKeyECDSASignature.when(() -> ECKey.ECDSASignature.decodeFromDER(byteArray)).thenReturn(eCKeyECDSASignatureMock);
            doReturn(true).when(eCKeyECDSASignatureMock).isCanonical();
            transactionSignature.when(() -> TransactionSignature.isEncodingCanonical(byteArray)).thenReturn(true);
            //Act Statement(s)
            DefaultRiskAnalysis.RuleViolation result = DefaultRiskAnalysis.isInputStandard(inputMock);
            //Assert statement(s)
            assertThat(result, equalTo(DefaultRiskAnalysis.RuleViolation.SHORTEST_POSSIBLE_PUSHDATA));
            verify(inputMock).getScriptSig();
            eCKeyECDSASignature.verify(() -> ECKey.ECDSASignature.decodeFromDER(byteArray), atLeast(1));
            verify(eCKeyECDSASignatureMock).isCanonical();
            transactionSignature.verify(() -> TransactionSignature.isEncodingCanonical(byteArray), atLeast(1));
        }
    }
}
