package org.bitcoinj.script;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;

import org.bitcoinj.crypto.SignatureDecodeException;
import org.bitcoinj.base.Network;
import org.junit.rules.ExpectedException;

import java.util.List;

import org.bitcoinj.base.ScriptType;
import org.bitcoinj.core.Transaction;

import java.util.LinkedList;

import org.bitcoinj.crypto.ECKey;
import org.bitcoinj.crypto.TransactionSignature;
import org.bitcoinj.base.VarInt;

import java.util.HashSet;
import java.math.BigInteger;

import org.bitcoinj.base.Coin;
import org.bitcoinj.core.NetworkParameters;

import java.util.ArrayList;
import java.util.Optional;

import org.bitcoinj.base.LegacyAddress;
import org.bitcoinj.core.TransactionWitness;
import org.bitcoinj.base.Address;
import org.mockito.stubbing.Answer;
import org.bitcoinj.base.internal.TimeUtils;

import java.nio.ByteBuffer;

import org.bitcoinj.base.internal.Preconditions;

import java.util.Set;
import java.io.OutputStream;

import org.bitcoinj.base.Sha256Hash;

import java.util.function.Supplier;

import org.mockito.MockedStatic;
import org.bitcoinj.base.SegwitAddress;
import org.bitcoinj.core.ProtocolException;

import java.time.Instant;
import java.io.ByteArrayOutputStream;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyList;
import static org.hamcrest.Matchers.containsInRelativeOrder;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.ArgumentMatchers.anySet;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.isA;

import org.junit.Ignore;

import java.io.ByteArrayInputStream;

import org.bitcoinj.base.internal.ByteUtils;

import static org.mockito.Mockito.doThrow;
import static org.hamcrest.core.IsInstanceOf.instanceOf;

public class ScriptSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Address addressMock = mock(Address.class);

    private final ScriptChunk chunkMock = mock(ScriptChunk.class);

    private final Coin coinMock = mock(Coin.class);

    private final ECKey eCKeyMock = mock(ECKey.class);

    private final ECKey keyMock = mock(ECKey.class);

    private final ECKey keyMock2 = mock(ECKey.class);

    private final ECKey keyMock3 = mock(ECKey.class);

    private final ECKey keyMock4 = mock(ECKey.class);

    private final LegacyAddress legacyAddressMock = mock(LegacyAddress.class);

    private final Network networkMock = mock(Network.class);

    private final NetworkParameters paramsMock = mock(NetworkParameters.class);

    private final ECKey pubKeyMock = mock(ECKey.class);

    private final ScriptChunk scriptChunkMock = mock(ScriptChunk.class);

    private final ScriptChunk scriptChunkMock2 = mock(ScriptChunk.class);

    private final Script scriptMock = mock(Script.class);

    private final Script scriptMock2 = mock(Script.class);

    private final SegwitAddress segwitAddressMock = mock(SegwitAddress.class);

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    private final Transaction transactionMock = mock(Transaction.class);

    private final TransactionSignature transactionSignatureMock = mock(TransactionSignature.class);

    private final TransactionWitness transactionWitnessMock = mock(TransactionWitness.class);

    private final Transaction txContainingThisMock = mock(Transaction.class);

    private final TransactionWitness witnessMock = mock(TransactionWitness.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    private final ECKey eCKeyMock2 = mock(ECKey.class);

    private final ECKey eCKeyMock3 = mock(ECKey.class);

    private final Script scriptPubKeyMock = mock(Script.class);

    private final SignatureDecodeException signatureDecodeExceptionMock = mock(SignatureDecodeException.class);

    //Sapient generated method id: ${3155f475-158f-3510-8516-db6562387204}
    @Test()
    public void ofTest() {
        //Arrange Statement(s)
        /*try (MockedStatic<Script> script = mockStatic(Script.class, CALLS_REAL_METHODS)) {
    script.when(() -> Script.of(anyList(), (Instant) any())).thenReturn(scriptMock);
    List<ScriptChunk> scriptChunkList = new ArrayList<>();
    //Act Statement(s)
    Script result = Script.of(scriptChunkList);
    //Assert statement(s)
    assertThat(result, equalTo(scriptMock));
    script.verify(() -> Script.of(anyList(), (Instant) any()), atLeast(1));
}*/
    }

    //Sapient generated method id: ${2d9e451b-59ca-3da9-a6c7-f80da9bfa12e}
    @Test()
    public void of1Test() {
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(null);
        Instant instant = Instant.now();
        //Act Statement(s)
        Script result = Script.of(scriptChunkList, instant);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${3a1fa216-77d7-3552-a886-5cb34f671ab0}
    @Test()
    public void parseTest() throws ScriptException {
        //Arrange Statement(s)
        try (MockedStatic<Script> script = mockStatic(Script.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            script.when(() -> Script.parse(eq(byteArray), (Instant) any())).thenReturn(scriptMock);
            //Act Statement(s)
            Script result = Script.parse(byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(scriptMock));
            script.verify(() -> Script.parse(eq(byteArray), (Instant) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${8fe35b44-ead9-3555-b4a7-279a7d806356}
    @Test()
    public void parse1WhenBisAvailableLessThan1ThrowsScriptException() throws ScriptException {
        /* Branches:
         * (bis.available() > 0) : true  #  inside parseIntoChunks method
         * (opcode >= 0) : true  #  inside parseIntoChunks method
         * (opcode < OP_PUSHDATA1) : false  #  inside parseIntoChunks method
         * (opcode == OP_PUSHDATA1) : true  #  inside parseIntoChunks method
         * (bis.available() < 1) : true  #  inside parseIntoChunks method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //thrown.expect(ScriptException.class);
        //byte[] byteArray = new byte[] { (byte) 0 };
        //Instant instant = Instant.now();
        //Act Statement(s)
        //Script.parse(byteArray, instant);
    }

    //Sapient generated method id: ${213fe935-cd2c-32e6-881a-e24bd86062f0}
    @Ignore()
    @Test()
    public void parse1WhenBisReadData0DataToReadNotEqualsDataToReadThrowsIllegalStateException() throws ScriptException {
        /* Branches:
         * (bis.available() > 0) : true  #  inside parseIntoChunks method
         * (opcode >= 0) : true  #  inside parseIntoChunks method
         * (opcode < OP_PUSHDATA1) : true  #  inside parseIntoChunks method
         * (dataToRead == -1) : false  #  inside parseIntoChunks method
         * (dataToRead > bis.available()) : false  #  inside parseIntoChunks method
         * (dataToRead == 0) : false  #  inside parseIntoChunks method
         * (bis.read(data, 0, (int) dataToRead) == dataToRead) : false  #  inside parseIntoChunks method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(false)).thenThrow(illegalStateException);
            thrown.expect(IllegalStateException.class);
            byte[] byteArray = new byte[]{};
            Instant instant = Instant.now();
            //Act Statement(s)
            Script.parse(byteArray, instant);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
        }
    }

    //Sapient generated method id: ${2c87dacb-e1b0-33ce-94b8-56f6ac90ec70}
    @Test()
    public void parse1WhenSTANDARD_TRANSACTION_SCRIPT_CHUNKSIsNotEmptyAndCEqualsChunk() throws ScriptException {
        /* Branches:
         * (bis.available() > 0) : true  #  inside parseIntoChunks method
         * (opcode >= 0) : true  #  inside parseIntoChunks method
         * (opcode < OP_PUSHDATA1) : false  #  inside parseIntoChunks method
         * (opcode == OP_PUSHDATA1) : true  #  inside parseIntoChunks method
         * (bis.available() < 1) : false  #  inside parseIntoChunks method
         * (dataToRead == -1) : true  #  inside parseIntoChunks method
         * (for-each(STANDARD_TRANSACTION_SCRIPT_CHUNKS)) : true  #  inside parseIntoChunks method
         * (c.equals(chunk)) : true  #  inside parseIntoChunks method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //byte[] byteArray = new byte[] { (byte) 0 };
        //Instant instant = Instant.now();
        //Act Statement(s)
        //Script result = Script.parse(byteArray, instant);
        //Assert statement(s)
        //assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${68715065-76bf-3409-ba1b-8a56e5375fad}
    @Test()
    public void parse1WhenDataToReadNotEqualsMinus1AndDataToReadGreaterThanBisAvailableThrowsScriptException() throws ScriptException {
        /* Branches:
         * (bis.available() > 0) : true  #  inside parseIntoChunks method
         * (opcode >= 0) : true  #  inside parseIntoChunks method
         * (opcode < OP_PUSHDATA1) : false  #  inside parseIntoChunks method
         * (opcode == OP_PUSHDATA1) : false  #  inside parseIntoChunks method
         * (opcode == OP_PUSHDATA2) : true  #  inside parseIntoChunks method
         * (bis.available() < 2) : false  #  inside parseIntoChunks method
         * (dataToRead == -1) : false  #  inside parseIntoChunks method
         * (dataToRead > bis.available()) : true  #  inside parseIntoChunks method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
    ByteArrayInputStream byteArrayInputStream = mock(ByteArrayInputStream.class);
    byteUtils.when(() -> ByteUtils.readUint16(byteArrayInputStream)).thenReturn(2);
    thrown.expect(ScriptException.class);
    byte[] byteArray = new byte[] { (byte) 0 };
    Instant instant = Instant.now();
    //Act Statement(s)
    Script.parse(byteArray, instant);
    //Assert statement(s)
    byteUtils.verify(() -> ByteUtils.readUint16(byteArrayInputStream), atLeast(1));
}*/
    }

    //Sapient generated method id: ${0dafa2bc-71ac-3d34-8c2e-1c0572c2df66}
    @Test()
    public void parse1WhenBisReadData0DataToReadEqualsDataToReadAndSTANDARD_TRANSACTION_SCRIPT_CHUNKSIsNotEmptyAndCEqualsChunk3() throws ScriptException {
        /* Branches:
         * (bis.available() > 0) : true  #  inside parseIntoChunks method
         * (opcode >= 0) : true  #  inside parseIntoChunks method
         * (opcode < OP_PUSHDATA1) : false  #  inside parseIntoChunks method
         * (opcode == OP_PUSHDATA1) : false  #  inside parseIntoChunks method
         * (opcode == OP_PUSHDATA2) : false  #  inside parseIntoChunks method
         * (opcode == OP_PUSHDATA4) : true  #  inside parseIntoChunks method
         * (bis.available() < 4) : false  #  inside parseIntoChunks method
         * (dataToRead == -1) : false  #  inside parseIntoChunks method
         * (dataToRead > bis.available()) : false  #  inside parseIntoChunks method
         * (dataToRead == 0) : false  #  inside parseIntoChunks method
         * (bis.read(data, 0, (int) dataToRead) == dataToRead) : true  #  inside parseIntoChunks method
         * (for-each(STANDARD_TRANSACTION_SCRIPT_CHUNKS)) : true  #  inside parseIntoChunks method
         * (c.equals(chunk)) : true  #  inside parseIntoChunks method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
    ByteArrayInputStream byteArrayInputStream = mock(ByteArrayInputStream.class);
    byteUtils.when(() -> ByteUtils.readUint32(byteArrayInputStream)).thenReturn(1L);
    byte[] byteArray = new byte[] {};
    Instant instant = Instant.now();
    //Act Statement(s)
    Script result = Script.parse(byteArray, instant);
    //Assert statement(s)
    assertThat(result, is(notNullValue()));
    byteUtils.verify(() -> ByteUtils.readUint32(byteArrayInputStream), atLeast(1));
}*/
    }

    //Sapient generated method id: ${88e08422-4f3c-3a0c-9cdf-0dd6eb55c00e}
    @Ignore()
    @Test()
    public void programWhenChunksIsNotEmpty() throws IOException {
        /* Branches:
         * (program != null) : false
         * (for-each(chunks)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(null);
        Instant instant = Instant.now();
        Script target = Script.of(scriptChunkList, instant);
        //Act Statement(s)
        byte[] result = target.program();
        byte[] byteResultArray = new byte[]{};
        //Assert statement(s)
        assertThat(result, equalTo(byteResultArray));
    }

    //Sapient generated method id: ${c7a5cd7e-a09a-3d82-ac26-87ced9926d54}
    @Ignore()
    @Test()
    public void programWhenCaughtIOExceptionThrowsRuntimeException() {
        /* Branches:
         * (program != null) : false
         * (for-each(chunks)) : true
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(null);
        Instant instant = Instant.now();
        Script target = Script.of(scriptChunkList, instant);
        thrown.expect(RuntimeException.class);
        thrown.expectCause(is(instanceOf(IOException.class)));
        //Act Statement(s)
        target.program();
    }

    //Sapient generated method id: ${f1ade6ca-1ad0-3ba1-ae05-87b4e6f688db}
    @Test()
    public void getProgramTest() throws IOException {
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(null);
        Instant instant = Instant.now();
        Script target = spy(Script.of(scriptChunkList, instant));
        byte[] byteArray = new byte[]{};
        doReturn(byteArray).when(target).program();
        //Act Statement(s)
        byte[] result = target.getProgram();
        //Assert statement(s)
        assertThat(result, equalTo(byteArray));
        verify(target).program();
    }

    //Sapient generated method id: ${b4981825-1442-3f0d-904c-7bce6d45c5de}
    @Ignore()
    @Test()
    public void chunksTest() {
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        Instant instant = Instant.now();
        Script target = Script.of(scriptChunkList, instant);
        //Act Statement(s)
        List<ScriptChunk> result = target.chunks();
        List<ScriptChunk> scriptChunkResultList = new ArrayList<>();
        scriptChunkResultList.add(scriptChunkMock);
        //Assert statement(s)
        assertThat(result.size(), equalTo(scriptChunkResultList.size()));
        assertThat(result, containsInRelativeOrder(scriptChunkResultList.toArray()));
    }

    //Sapient generated method id: ${c68be88f-5305-3de5-b55d-74a9af12eabc}
    @Test()
    public void getChunksTest() {
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        Instant instant = Instant.now();
        Script target = Script.of(scriptChunkList, instant);
        //Act Statement(s)
        List<ScriptChunk> result = target.getChunks();
        List<ScriptChunk> scriptChunkResultList = new ArrayList<>();
        scriptChunkResultList.add(scriptChunkMock);
        //Assert statement(s)
        assertThat(result.size(), equalTo(scriptChunkResultList.size()));
        assertThat(result, containsInRelativeOrder(scriptChunkResultList.toArray()));
    }

    //Sapient generated method id: ${e7ca91d8-c1cc-3fb0-bbfc-9b9ce2ba701e}
    @Test()
    public void creationTimeTest() {
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(null);
        Instant instant = Instant.now();
        Script target = Script.of(scriptChunkList, instant);
        //Act Statement(s)
        Optional<Instant> result = target.creationTime();
        Optional<Instant> instantOptional = Optional.of(instant);
        //Assert statement(s)
        assertThat(result, equalTo(instantOptional));
    }

    //Sapient generated method id: ${59599f06-b2e1-33b8-847a-1ad84ccad6b6}
    @Ignore()
    @Test()
    public void getCreationTimeSecondsTest() {
        //Arrange Statement(s)
        //List<ScriptChunk> scriptChunkList = new ArrayList<>();
        //scriptChunkList.add(null);
        //Instant instant = Instant.now();
        //Script target = Script.of(scriptChunkList, instant);
        //Act Statement(s)
        //long result = target.getCreationTimeSeconds();
        //Assert statement(s)
        //assertThat(result, equalTo(1707139051L));
    }

    //Sapient generated method id: ${bef8a8c7-3d0d-3446-966d-df436c067332}
    @Ignore()
    @Test()
    public void toStringWhenChunksNotIsEmpty() {
        /* Branches:
         * (!chunks.isEmpty()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: SPACE_JOINER
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //List<ScriptChunk> scriptChunkList = new ArrayList<>();
        //scriptChunkList.add(null);
        //Instant instant = Instant.now();
        //Script target = Script.of(scriptChunkList, instant);
        //Act Statement(s)
        //String result = target.toString();
        //Assert statement(s)
        //assertThat(result, equalTo("return_of_join1"));
    }

    //Sapient generated method id: ${5ebbd07f-5dc8-36be-8a31-cc9d32d7ad59}
    @Test()
    public void toStringWhenChunksIsEmpty() {
        /* Branches:
         * (!chunks.isEmpty()) : false
         */
        //Arrange Statement(s)
        //List<ScriptChunk> scriptChunkList = new ArrayList<>();
        //Instant instant = Instant.now();
        //Script target = Script.of(scriptChunkList, instant);
        //Act Statement(s)
        //String result = target.toString();
        //Assert statement(s)
        //assertThat(result, equalTo("<empty>"));
    }

    //Sapient generated method id: ${27ba3387-bd2f-316f-a591-a519d1a888d3}
    @Test()
    public void getPubKeyHashWhenScriptPatternIsP2PKHThis() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(this)) : true
         */
        //Arrange Statement(s)
        /*try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
    List<ScriptChunk> scriptChunkList = new ArrayList<>();
    scriptChunkList.add(null);
    Instant instant = Instant.now();
    Script target = Script.of(scriptChunkList, instant);
    scriptPattern.when(() -> ScriptPattern.isP2PKH(target)).thenReturn(true);
    byte[] byteArray = new byte[] {};
    scriptPattern.when(() -> ScriptPattern.extractHashFromP2PKH(target)).thenReturn(byteArray);
    //Act Statement(s)
    byte[] result = target.getPubKeyHash();
    //Assert statement(s)
    assertThat(result, equalTo(byteArray));
    scriptPattern.verify(() -> ScriptPattern.isP2PKH(target), atLeast(1));
    scriptPattern.verify(() -> ScriptPattern.extractHashFromP2PKH(target), atLeast(1));
}*/
    }

    //Sapient generated method id: ${620bcba7-7af7-374f-a383-fd793588c5f1}
    @Test()
    public void getPubKeyHashWhenScriptPatternIsP2SHThis() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(this)) : false
         * (ScriptPattern.isP2SH(this)) : true
         */
        //Arrange Statement(s)
        /*try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
    List<ScriptChunk> scriptChunkList = new ArrayList<>();
    scriptChunkList.add(null);
    Instant instant = Instant.now();
    Script target = Script.of(scriptChunkList, instant);
    scriptPattern.when(() -> ScriptPattern.isP2PKH(target)).thenReturn(false);
    scriptPattern.when(() -> ScriptPattern.isP2SH(target)).thenReturn(true);
    byte[] byteArray = new byte[] {};
    scriptPattern.when(() -> ScriptPattern.extractHashFromP2SH(target)).thenReturn(byteArray);
    //Act Statement(s)
    byte[] result = target.getPubKeyHash();
    //Assert statement(s)
    assertThat(result, equalTo(byteArray));
    scriptPattern.verify(() -> ScriptPattern.isP2PKH(target), atLeast(1));
    scriptPattern.verify(() -> ScriptPattern.isP2SH(target), atLeast(1));
    scriptPattern.verify(() -> ScriptPattern.extractHashFromP2SH(target), atLeast(1));
}*/
    }

    //Sapient generated method id: ${b3334e19-de30-3c00-a41c-8241cafdb359}
    @Test()
    public void getPubKeyHashWhenScriptPatternIsP2WHThis() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(this)) : false
         * (ScriptPattern.isP2SH(this)) : false
         * (ScriptPattern.isP2WH(this)) : true
         */
        //Arrange Statement(s)
        /*try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
    List<ScriptChunk> scriptChunkList = new ArrayList<>();
    scriptChunkList.add(null);
    Instant instant = Instant.now();
    Script target = Script.of(scriptChunkList, instant);
    scriptPattern.when(() -> ScriptPattern.isP2PKH(target)).thenReturn(false);
    scriptPattern.when(() -> ScriptPattern.isP2SH(target)).thenReturn(false);
    scriptPattern.when(() -> ScriptPattern.isP2WH(target)).thenReturn(true);
    byte[] byteArray = new byte[] {};
    scriptPattern.when(() -> ScriptPattern.extractHashFromP2WH(target)).thenReturn(byteArray);
    //Act Statement(s)
    byte[] result = target.getPubKeyHash();
    //Assert statement(s)
    assertThat(result, equalTo(byteArray));
    scriptPattern.verify(() -> ScriptPattern.isP2PKH(target), atLeast(1));
    scriptPattern.verify(() -> ScriptPattern.isP2SH(target), atLeast(1));
    scriptPattern.verify(() -> ScriptPattern.isP2WH(target), atLeast(1));
    scriptPattern.verify(() -> ScriptPattern.extractHashFromP2WH(target), atLeast(1));
}*/
    }

    //Sapient generated method id: ${b688c3cd-12b7-302e-96f6-6d88208348ac}
    @Test()
    public void getPubKeyHashWhenScriptPatternNotIsP2WHThisThrowsScriptException() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(this)) : false
         * (ScriptPattern.isP2SH(this)) : false
         * (ScriptPattern.isP2WH(this)) : false
         */
        //Arrange Statement(s)
        /*try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
    List<ScriptChunk> scriptChunkList = new ArrayList<>();
    scriptChunkList.add(null);
    Instant instant = Instant.now();
    Script target = Script.of(scriptChunkList, instant);
    scriptPattern.when(() -> ScriptPattern.isP2PKH(target)).thenReturn(false);
    scriptPattern.when(() -> ScriptPattern.isP2SH(target)).thenReturn(false);
    scriptPattern.when(() -> ScriptPattern.isP2WH(target)).thenReturn(false);
    thrown.expect(ScriptException.class);
    //Act Statement(s)
    target.getPubKeyHash();
    //Assert statement(s)
    scriptPattern.verify(() -> ScriptPattern.isP2PKH(target), atLeast(1));
    scriptPattern.verify(() -> ScriptPattern.isP2SH(target), atLeast(1));
    scriptPattern.verify(() -> ScriptPattern.isP2WH(target), atLeast(1));
}*/
    }

    //Sapient generated method id: ${c66148e0-bf25-3c41-b5a8-81f17b412acc}
    @Test()
    public void getToAddressTest() throws ScriptException {
        //Arrange Statement(s)
        //List<ScriptChunk> scriptChunkList = new ArrayList<>();
        //scriptChunkList.add(null);
        //Instant instant = Instant.now();
        //Script target = spy(Script.of(scriptChunkList, instant));
        //doReturn(addressMock).when(target).getToAddress(networkMock, false);
        //Act Statement(s)
        //Address result = target.getToAddress(networkMock);
        //Assert statement(s)
        //assertThat(result, equalTo(addressMock));
        //verify(target).getToAddress(networkMock, false);
    }

    //Sapient generated method id: ${5886d52e-7151-38cf-97c1-d535c816dbba}
    @Test()
    public void getToAddress1Test() throws ScriptException {
        //Arrange Statement(s)
        //doReturn(networkMock).when(paramsMock).network();
        //List<ScriptChunk> scriptChunkList = new ArrayList<>();
        //scriptChunkList.add(null);
        //Instant instant = Instant.now();
        //Script target = spy(Script.of(scriptChunkList, instant));
        //doReturn(addressMock).when(target).getToAddress(networkMock, false);
        //Act Statement(s)
        //Address result = target.getToAddress(paramsMock);
        //Assert statement(s)
        //assertThat(result, equalTo(addressMock));
        //verify(paramsMock).network();
        //verify(target).getToAddress(networkMock, false);
    }

    //Sapient generated method id: ${21e8d88a-7a71-3b47-abf2-ad17a8f9710b}
    @Test()
    public void getToAddress2WhenScriptPatternIsP2PKHThis() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(this)) : true
         */
        //Arrange Statement(s)
        /*try (MockedStatic<LegacyAddress> legacyAddress = mockStatic(LegacyAddress.class);
    MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
    byte[] byteArray = new byte[] {};
    legacyAddress.when(() -> LegacyAddress.fromPubKeyHash(networkMock, byteArray)).thenReturn(legacyAddressMock);
    List<ScriptChunk> scriptChunkList = new ArrayList<>();
    scriptChunkList.add(null);
    Instant instant = Instant.now();
    Script target = Script.of(scriptChunkList, instant);
    scriptPattern.when(() -> ScriptPattern.isP2PKH(target)).thenReturn(true);
    scriptPattern.when(() -> ScriptPattern.extractHashFromP2PKH(target)).thenReturn(byteArray);
    //Act Statement(s)
    Address result = target.getToAddress(networkMock, false);
    //Assert statement(s)
    assertThat(result, equalTo(legacyAddressMock));
    legacyAddress.verify(() -> LegacyAddress.fromPubKeyHash(networkMock, byteArray), atLeast(1));
    scriptPattern.verify(() -> ScriptPattern.isP2PKH(target), atLeast(1));
    scriptPattern.verify(() -> ScriptPattern.extractHashFromP2PKH(target), atLeast(1));
}*/
    }

    //Sapient generated method id: ${f5beb495-0358-39d0-98f4-b822e1e333a3}
    @Test()
    public void getToAddress2WhenScriptPatternIsP2SHThis() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(this)) : false
         * (ScriptPattern.isP2SH(this)) : true
         */
        //Arrange Statement(s)
        /*try (MockedStatic<LegacyAddress> legacyAddress = mockStatic(LegacyAddress.class);
    MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
    byte[] byteArray = new byte[] {};
    legacyAddress.when(() -> LegacyAddress.fromScriptHash(networkMock, byteArray)).thenReturn(legacyAddressMock);
    List<ScriptChunk> scriptChunkList = new ArrayList<>();
    scriptChunkList.add(null);
    Instant instant = Instant.now();
    Script target = Script.of(scriptChunkList, instant);
    scriptPattern.when(() -> ScriptPattern.isP2PKH(target)).thenReturn(false);
    scriptPattern.when(() -> ScriptPattern.isP2SH(target)).thenReturn(true);
    scriptPattern.when(() -> ScriptPattern.extractHashFromP2SH(target)).thenReturn(byteArray);
    //Act Statement(s)
    Address result = target.getToAddress(networkMock, false);
    //Assert statement(s)
    assertThat(result, equalTo(legacyAddressMock));
    legacyAddress.verify(() -> LegacyAddress.fromScriptHash(networkMock, byteArray), atLeast(1));
    scriptPattern.verify(() -> ScriptPattern.isP2PKH(target), atLeast(1));
    scriptPattern.verify(() -> ScriptPattern.isP2SH(target), atLeast(1));
    scriptPattern.verify(() -> ScriptPattern.extractHashFromP2SH(target), atLeast(1));
}*/
    }

    //Sapient generated method id: ${6c419781-20bc-301f-9f01-c4b73348177f}
    @Test()
    public void getToAddress2WhenScriptPatternIsP2PKThis() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(this)) : false
         * (ScriptPattern.isP2SH(this)) : false
         * (forcePayToPubKey) : true
         * (ScriptPattern.isP2PK(this)) : true
         */
        //Arrange Statement(s)
        /*try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
    MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
    byte[] byteArray = new byte[] {};
    eCKey.when(() -> ECKey.fromPublicOnly(byteArray)).thenReturn(eCKeyMock);
    doReturn(addressMock).when(eCKeyMock).toAddress(ScriptType.P2PKH, networkMock);
    List<ScriptChunk> scriptChunkList = new ArrayList<>();
    scriptChunkList.add(null);
    Instant instant = Instant.now();
    Script target = Script.of(scriptChunkList, instant);
    scriptPattern.when(() -> ScriptPattern.isP2PKH(target)).thenReturn(false);
    scriptPattern.when(() -> ScriptPattern.isP2SH(target)).thenReturn(false);
    scriptPattern.when(() -> ScriptPattern.isP2PK(target)).thenReturn(true);
    scriptPattern.when(() -> ScriptPattern.extractKeyFromP2PK(target)).thenReturn(byteArray);
    //Act Statement(s)
    Address result = target.getToAddress(networkMock, true);
    //Assert statement(s)
    assertThat(result, equalTo(addressMock));
    eCKey.verify(() -> ECKey.fromPublicOnly(byteArray), atLeast(1));
    verify(eCKeyMock).toAddress(ScriptType.P2PKH, networkMock);
    scriptPattern.verify(() -> ScriptPattern.isP2PKH(target), atLeast(1));
    scriptPattern.verify(() -> ScriptPattern.isP2SH(target), atLeast(1));
    scriptPattern.verify(() -> ScriptPattern.isP2PK(target), atLeast(1));
    scriptPattern.verify(() -> ScriptPattern.extractKeyFromP2PK(target), atLeast(1));
}*/
    }

    //Sapient generated method id: ${98efc77d-0493-37b6-bd1e-e00fba3dc603}
    @Test()
    public void getToAddress2WhenScriptPatternIsP2WHThis() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(this)) : false
         * (ScriptPattern.isP2SH(this)) : false
         * (forcePayToPubKey) : false
         * (ScriptPattern.isP2WH(this)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<SegwitAddress> segwitAddress = mockStatic(SegwitAddress.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            byte[] byteArray = new byte[]{};
            segwitAddress.when(() -> SegwitAddress.fromHash(networkMock, byteArray)).thenReturn(segwitAddressMock);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WH(target)).thenReturn(true);
            scriptPattern.when(() -> ScriptPattern.extractHashFromP2WH(target)).thenReturn(byteArray);
            //Act Statement(s)
            Address result = target.getToAddress(networkMock, false);
            //Assert statement(s)
            assertThat(result, equalTo(segwitAddressMock));
            segwitAddress.verify(() -> SegwitAddress.fromHash(networkMock, byteArray), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractHashFromP2WH(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${66b93e1f-6799-3c30-a98c-f138c2cdaa5c}
    @Test()
    public void getToAddress2WhenScriptPatternNotIsP2PKThisAndScriptPatternIsP2WHThis() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(this)) : false
         * (ScriptPattern.isP2SH(this)) : false
         * (forcePayToPubKey) : true
         * (ScriptPattern.isP2PK(this)) : false
         * (ScriptPattern.isP2WH(this)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<SegwitAddress> segwitAddress = mockStatic(SegwitAddress.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            byte[] byteArray = new byte[]{};
            segwitAddress.when(() -> SegwitAddress.fromHash(networkMock, byteArray)).thenReturn(segwitAddressMock);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WH(target)).thenReturn(true);
            scriptPattern.when(() -> ScriptPattern.extractHashFromP2WH(target)).thenReturn(byteArray);
            //Act Statement(s)
            Address result = target.getToAddress(networkMock, true);
            //Assert statement(s)
            assertThat(result, equalTo(segwitAddressMock));
            segwitAddress.verify(() -> SegwitAddress.fromHash(networkMock, byteArray), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractHashFromP2WH(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${b637e820-2b7d-3085-8ddf-958ff2dfbdd5}
    @Test()
    public void getToAddress2WhenScriptPatternIsP2TRThis() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(this)) : false
         * (ScriptPattern.isP2SH(this)) : false
         * (forcePayToPubKey) : false
         * (ScriptPattern.isP2WH(this)) : false
         * (ScriptPattern.isP2TR(this)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<SegwitAddress> segwitAddress = mockStatic(SegwitAddress.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            byte[] byteArray = new byte[]{};
            segwitAddress.when(() -> SegwitAddress.fromProgram(networkMock, 1, byteArray)).thenReturn(segwitAddressMock);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2TR(target)).thenReturn(true);
            scriptPattern.when(() -> ScriptPattern.extractOutputKeyFromP2TR(target)).thenReturn(byteArray);
            //Act Statement(s)
            Address result = target.getToAddress(networkMock, false);
            //Assert statement(s)
            assertThat(result, equalTo(segwitAddressMock));
            segwitAddress.verify(() -> SegwitAddress.fromProgram(networkMock, 1, byteArray), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2TR(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractOutputKeyFromP2TR(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${e8020848-ae94-326f-b760-b3b0f25b8d21}
    @Test()
    public void getToAddress2WhenScriptPatternNotIsP2WHThisAndScriptPatternIsP2TRThis() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(this)) : false
         * (ScriptPattern.isP2SH(this)) : false
         * (forcePayToPubKey) : true
         * (ScriptPattern.isP2PK(this)) : false
         * (ScriptPattern.isP2WH(this)) : false
         * (ScriptPattern.isP2TR(this)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<SegwitAddress> segwitAddress = mockStatic(SegwitAddress.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            byte[] byteArray = new byte[]{};
            segwitAddress.when(() -> SegwitAddress.fromProgram(networkMock, 1, byteArray)).thenReturn(segwitAddressMock);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2TR(target)).thenReturn(true);
            scriptPattern.when(() -> ScriptPattern.extractOutputKeyFromP2TR(target)).thenReturn(byteArray);
            //Act Statement(s)
            Address result = target.getToAddress(networkMock, true);
            //Assert statement(s)
            assertThat(result, equalTo(segwitAddressMock));
            segwitAddress.verify(() -> SegwitAddress.fromProgram(networkMock, 1, byteArray), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2TR(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractOutputKeyFromP2TR(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${8bb4aab9-c370-3a00-8cbe-2023f23f1007}
    @Test()
    public void getToAddress2WhenScriptPatternNotIsP2WHThisAndScriptPatternNotIsP2TRThisThrowsScriptException() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(this)) : false
         * (ScriptPattern.isP2SH(this)) : false
         * (forcePayToPubKey) : true
         * (ScriptPattern.isP2PK(this)) : false
         * (ScriptPattern.isP2WH(this)) : false
         * (ScriptPattern.isP2TR(this)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2TR(target)).thenReturn(false);
            thrown.expect(ScriptException.class);
            //Act Statement(s)
            target.getToAddress(networkMock, true);
            //Assert statement(s)
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2TR(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${47bc576c-7a08-3c6f-adc2-2f431f3f171a}
    @Test()
    public void getToAddress3Test() throws ScriptException {
        //Arrange Statement(s)
        doReturn(networkMock).when(paramsMock).network();
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(null);
        Instant instant = Instant.now();
        Script target = spy(Script.of(scriptChunkList, instant));
        doReturn(addressMock).when(target).getToAddress(networkMock, false);
        //Act Statement(s)
        Address result = target.getToAddress(paramsMock, false);
        //Assert statement(s)
        assertThat(result, equalTo(addressMock));
        verify(paramsMock).network();
        verify(target).getToAddress(networkMock, false);
    }

    //Sapient generated method id: ${7fc3654a-a66c-321b-aa94-8ba1b6cfb9ec}
    @Test()
    public void writeBytesWhenBufLengthLessThanOP_PUSHDATA1() throws IOException {
        /* Branches:
         * (buf.length < OP_PUSHDATA1) : true
         */
        //Arrange Statement(s)
        //OutputStream outputStream = OutputStream.nullOutputStream();
        //byte[] byteArray = new byte[] { (byte) 0 };
        //Act Statement(s)
        //Script.writeBytes(outputStream, byteArray);
    }

    //Sapient generated method id: ${9d7e490f-9bf6-3245-8484-829a2940a9d9}
    @Test()
    public void writeBytesWhenBufLengthLessThan256() throws IOException {
        /* Branches:
         * (buf.length < OP_PUSHDATA1) : false
         * (buf.length < 256) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //OutputStream outputStream = OutputStream.nullOutputStream();
        //byte[] byteArray = new byte[] {};
        //Act Statement(s)
        //Script.writeBytes(outputStream, byteArray);
    }

    //Sapient generated method id: ${48daa7b9-bbf5-367c-8450-27b667139681}
    @Test()
    public void writeBytesWhenBufLengthLessThan65536() throws IOException {
        /* Branches:
         * (buf.length < OP_PUSHDATA1) : false
         * (buf.length < 256) : false
         * (buf.length < 65536) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
    byteUtils.when(() -> ByteUtils.writeInt16LE(eq(0), (OutputStream) any())).thenAnswer((Answer<Void>) invocation -> null);
    OutputStream outputStream = OutputStream.nullOutputStream();
    byte[] byteArray = new byte[] {};
    //Act Statement(s)
    Script.writeBytes(outputStream, byteArray);
    //Assert statement(s)
    byteUtils.verify(() -> ByteUtils.writeInt16LE(eq(0), (OutputStream) any()));
}*/
    }

    //Sapient generated method id: ${fe4b95f7-8e1e-3e18-82ee-c0391f26e6fd}
    @Test()
    public void writeBytesWhenBufLengthNotLessThan65536ThrowsRuntimeException() throws IOException {
        /* Branches:
         * (buf.length < OP_PUSHDATA1) : false
         * (buf.length < 256) : false
         * (buf.length < 65536) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //RuntimeException runtimeException = new RuntimeException("Unimplemented");
        //thrown.expect(RuntimeException.class);
        //thrown.expectMessage(runtimeException.getMessage());
        //OutputStream outputStream = OutputStream.nullOutputStream();
        //byte[] byteArray = new byte[] {};
        //Act Statement(s)
        //Script.writeBytes(outputStream, byteArray);
    }

    //Sapient generated method id: ${29b303f4-bca9-389e-a119-a1a726e27680}
    @Test()
    public void createMultiSigOutputScriptWhenThresholdNotGreaterThan0ThrowsIllegalArgumentException() {
        /* Branches:
         * (threshold > 0) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(false)).thenThrow(illegalArgumentException);
            thrown.expect(IllegalArgumentException.class);
            List<ECKey> eCKeyList = new ArrayList<>();
            //Act Statement(s)
            Script.createMultiSigOutputScript(-1, eCKeyList);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
        }
    }

    //Sapient generated method id: ${2e473006-9436-365c-9b06-465578b217e3}
    @Test()
    public void createMultiSigOutputScriptWhenThresholdGreaterThanPubkeysSizeThrowsIllegalArgumentException() {
        /* Branches:
         * (threshold > 0) : true
         * (threshold <= pubkeys.size()) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(false)).thenThrow(illegalArgumentException);
            thrown.expect(IllegalArgumentException.class);
            List<ECKey> eCKeyList = new ArrayList<>();
            //Act Statement(s)
            Script.createMultiSigOutputScript(1, eCKeyList);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
        }
    }

    //Sapient generated method id: ${038f8db5-df0f-3f72-be0d-dee0936bf069}
    @Test()
    public void createMultiSigOutputScriptWhenPubkeysSizeGreaterThan16ThrowsIllegalArgumentException() {
        /* Branches:
         * (threshold > 0) : true
         * (threshold <= pubkeys.size()) : true
         * (pubkeys.size() <= 16) : false
         */
        //Arrange Statement(s)
        ECKey eCKeyMock4 = mock(ECKey.class);
        ECKey eCKeyMock5 = mock(ECKey.class);
        ECKey eCKeyMock6 = mock(ECKey.class);
        ECKey eCKeyMock7 = mock(ECKey.class);
        ECKey eCKeyMock8 = mock(ECKey.class);
        ECKey eCKeyMock9 = mock(ECKey.class);
        ECKey eCKeyMock10 = mock(ECKey.class);
        ECKey eCKeyMock11 = mock(ECKey.class);
        ECKey eCKeyMock12 = mock(ECKey.class);
        ECKey eCKeyMock13 = mock(ECKey.class);
        ECKey eCKeyMock14 = mock(ECKey.class);
        ECKey eCKeyMock15 = mock(ECKey.class);
        ECKey eCKeyMock16 = mock(ECKey.class);
        ECKey eCKeyMock17 = mock(ECKey.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(false)).thenThrow(illegalArgumentException);
            thrown.expect(IllegalArgumentException.class);
            List<ECKey> eCKeyList = new ArrayList<>();
            eCKeyList.add(eCKeyMock);
            eCKeyList.add(eCKeyMock2);
            eCKeyList.add(eCKeyMock3);
            eCKeyList.add(eCKeyMock4);
            eCKeyList.add(eCKeyMock5);
            eCKeyList.add(eCKeyMock6);
            eCKeyList.add(eCKeyMock7);
            eCKeyList.add(eCKeyMock8);
            eCKeyList.add(eCKeyMock9);
            eCKeyList.add(eCKeyMock10);
            eCKeyList.add(eCKeyMock11);
            eCKeyList.add(eCKeyMock12);
            eCKeyList.add(eCKeyMock13);
            eCKeyList.add(eCKeyMock14);
            eCKeyList.add(eCKeyMock15);
            eCKeyList.add(eCKeyMock16);
            eCKeyList.add(eCKeyMock17);
            //Act Statement(s)
            Script.createMultiSigOutputScript(1, eCKeyList);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
        }
    }

    //Sapient generated method id: ${44cfdb7b-07c1-3c79-a6f1-b8241b68ed03}
    @Test()
    public void createMultiSigOutputScriptWhenPubkeysIsNotEmpty() throws IOException {
        /* Branches:
         * (threshold > 0) : true
         * (threshold <= pubkeys.size()) : true
         * (pubkeys.size() <= 16) : true
         * (pubkeys.size() > 3) : true
         * (for-each(pubkeys)) : true
         */
        //Arrange Statement(s)
        ECKey keyMock2 = mock(ECKey.class);
        ECKey keyMock3 = mock(ECKey.class);
        ECKey keyMock4 = mock(ECKey.class);
        try (MockedStatic<Script> script = mockStatic(Script.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(keyMock).getPubKey();
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(keyMock2).getPubKey();
            byte[] byteArray3 = new byte[]{};
            doReturn(byteArray3).when(keyMock3).getPubKey();
            byte[] byteArray4 = new byte[]{};
            doReturn(byteArray4).when(keyMock4).getPubKey();
            script.when(() -> Script.encodeToOpN(1)).thenReturn(1);
            script.when(() -> Script.writeBytes((ByteArrayOutputStream) any(), eq(byteArray))).thenAnswer((Answer<Void>) invocation -> null);
            script.when(() -> Script.writeBytes((ByteArrayOutputStream) any(), eq(byteArray2))).thenAnswer((Answer<Void>) invocation -> null);
            script.when(() -> Script.writeBytes((ByteArrayOutputStream) any(), eq(byteArray3))).thenAnswer((Answer<Void>) invocation -> null);
            script.when(() -> Script.writeBytes((ByteArrayOutputStream) any(), eq(byteArray4))).thenAnswer((Answer<Void>) invocation -> null);
            script.when(() -> Script.encodeToOpN(4)).thenReturn(1);
            List<ECKey> eCKeyList = new ArrayList<>();
            eCKeyList.add(keyMock);
            eCKeyList.add(keyMock2);
            eCKeyList.add(keyMock3);
            eCKeyList.add(keyMock4);
            //Act Statement(s)
            byte[] result = Script.createMultiSigOutputScript(1, eCKeyList);
            byte[] byteResultArray = new byte[]{(byte) 1, (byte) 1, (byte) -82};
            List<ECKey> eCKeyECKeyListList = new ArrayList<>();
            eCKeyECKeyListList.add(keyMock);
            eCKeyECKeyListList.add(keyMock2);
            eCKeyECKeyListList.add(keyMock3);
            eCKeyECKeyListList.add(keyMock4);
            //Assert statement(s)
            assertThat(result, equalTo(byteResultArray));
            assertThat(eCKeyList.size(), equalTo(eCKeyECKeyListList.size()));
            assertThat(eCKeyList, containsInRelativeOrder(eCKeyECKeyListList.toArray()));
            verify(keyMock, atLeast(1)).getPubKey();
            verify(keyMock2, atLeast(1)).getPubKey();
            verify(keyMock3, atLeast(1)).getPubKey();
            verify(keyMock4, atLeast(1)).getPubKey();
            script.verify(() -> Script.encodeToOpN(1), atLeast(1));
            script.verify(() -> Script.writeBytes((ByteArrayOutputStream) any(), eq(byteArray)), atLeast(1));
            script.verify(() -> Script.writeBytes((ByteArrayOutputStream) any(), eq(byteArray2)), atLeast(1));
            script.verify(() -> Script.writeBytes((ByteArrayOutputStream) any(), eq(byteArray3)), atLeast(1));
            script.verify(() -> Script.writeBytes((ByteArrayOutputStream) any(), eq(byteArray4)), atLeast(1));
            script.verify(() -> Script.encodeToOpN(4), atLeast(1));
        }
    }

    //Sapient generated method id: ${b1f7e05f-63c8-311a-a2aa-56e6f4d1a251}
    @Ignore()
    @Test()
    public void createMultiSigOutputScriptWhenCaughtIOExceptionThrowsRuntimeException() {
        /* Branches:
         * (threshold > 0) : true
         * (threshold <= pubkeys.size()) : true
         * (pubkeys.size() <= 16) : true
         * (pubkeys.size() > 3) : true
         * (for-each(pubkeys)) : true
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Script> script = mockStatic(Script.class, CALLS_REAL_METHODS);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(keyMock).getPubKey();
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            script.when(() -> Script.encodeToOpN(1)).thenReturn(1);
            script.when(() -> Script.writeBytes((ByteArrayOutputStream) any(), eq(byteArray))).thenAnswer((Answer<Void>) invocation -> null);
            script.when(() -> Script.encodeToOpN(4)).thenReturn(1);
            thrown.expect(RuntimeException.class);
            thrown.expectCause(is(instanceOf(IOException.class)));
            List<ECKey> eCKeyList = new ArrayList<>();
            eCKeyList.add(keyMock);
            eCKeyList.add(eCKeyMock);
            eCKeyList.add(eCKeyMock2);
            eCKeyList.add(eCKeyMock3);
            //Act Statement(s)
            Script.createMultiSigOutputScript(1, eCKeyList);
            //Assert statement(s)
            verify(keyMock, atLeast(1)).getPubKey();
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(1));
            script.verify(() -> Script.encodeToOpN(1), atLeast(1));
            script.verify(() -> Script.writeBytes((ByteArrayOutputStream) any(), eq(byteArray)), atLeast(1));
            script.verify(() -> Script.encodeToOpN(4), atLeast(1));
        }
    }

    //Sapient generated method id: ${e32a1106-be72-33a1-be1d-d304f21c5a8a}
    @Test()
    public void createInputScriptTest() throws IOException {
        //Arrange Statement(s)
        try (MockedStatic<Script> script = mockStatic(Script.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            script.when(() -> Script.writeBytes((ByteArrayOutputStream) any(), eq(byteArray))).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray2 = new byte[]{};
            script.when(() -> Script.writeBytes((ByteArrayOutputStream) any(), eq(byteArray2))).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            byte[] result = Script.createInputScript(byteArray, byteArray2);
            byte[] byteResultArray = new byte[]{};
            //Assert statement(s)
            assertThat(result, equalTo(byteResultArray));
            script.verify(() -> Script.writeBytes((ByteArrayOutputStream) any(), eq(byteArray)), atLeast(1));
            script.verify(() -> Script.writeBytes((ByteArrayOutputStream) any(), eq(byteArray2)), atLeast(1));
        }
    }

    //Sapient generated method id: ${5f84f9a3-8bec-3033-9284-98c000a93ba4}
    @Ignore()
    @Test()
    public void createInputScriptWhenCaughtIOExceptionThrowsRuntimeException() {
        /* Branches:
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Script> script = mockStatic(Script.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{(byte) 0};
            script.when(() -> Script.writeBytes((ByteArrayOutputStream) any(), eq(byteArray))).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray2 = new byte[]{(byte) 0};
            script.when(() -> Script.writeBytes((ByteArrayOutputStream) any(), eq(byteArray2))).thenAnswer((Answer<Void>) invocation -> null);
            thrown.expect(RuntimeException.class);
            thrown.expectCause(is(instanceOf(IOException.class)));
            //Act Statement(s)
            Script.createInputScript(byteArray, byteArray2);
            //Assert statement(s)
            script.verify(() -> Script.writeBytes((ByteArrayOutputStream) any(), eq(byteArray)), atLeast(1));
            script.verify(() -> Script.writeBytes((ByteArrayOutputStream) any(), eq(byteArray2)), atLeast(1));
        }
    }

    //Sapient generated method id: ${44cd43bc-ae4c-3a5d-9c6f-bf73a429f3a7}
    @Test()
    public void createInputScript1Test() throws IOException {
        //Arrange Statement(s)
        try (MockedStatic<Script> script = mockStatic(Script.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            script.when(() -> Script.writeBytes((ByteArrayOutputStream) any(), eq(byteArray))).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            byte[] result = Script.createInputScript(byteArray);
            byte[] byteResultArray = new byte[]{};
            //Assert statement(s)
            assertThat(result, equalTo(byteResultArray));
            script.verify(() -> Script.writeBytes((ByteArrayOutputStream) any(), eq(byteArray)), atLeast(1));
        }
    }

    //Sapient generated method id: ${0bc67822-12c5-3090-bab9-8159c556acf1}
    @Ignore()
    @Test()
    public void createInputScript1WhenCaughtIOExceptionThrowsRuntimeException() {
        /* Branches:
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Script> script = mockStatic(Script.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            script.when(() -> Script.writeBytes((ByteArrayOutputStream) any(), eq(byteArray))).thenAnswer((Answer<Void>) invocation -> null);
            thrown.expect(RuntimeException.class);
            thrown.expectCause(is(instanceOf(IOException.class)));
            //Act Statement(s)
            Script.createInputScript(byteArray);
            //Assert statement(s)
            script.verify(() -> Script.writeBytes((ByteArrayOutputStream) any(), eq(byteArray)), atLeast(1));
        }
    }

    //Sapient generated method id: ${76598bb1-89f8-3932-b473-6fa8d2627a50}
    @Ignore()
    @Test()
    public void createEmptyInputScriptWhenKeyIsNotNullThrowsIllegalArgumentException() {
        /* Branches:
         * (ScriptPattern.isP2PKH(this)) : true
         * (key != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(target)).thenReturn(true);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.createEmptyInputScript(eCKeyMock, scriptMock);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${305f45e9-cb87-3fa2-9cc7-8bec0be72044}
    @Test()
    public void createEmptyInputScriptWhenKeyIsNullThrowsIllegalArgumentException() {
        /* Branches:
         * (ScriptPattern.isP2PKH(this)) : true
         * (key != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(target)).thenReturn(true);
            thrown.expect(IllegalArgumentException.class);
            ECKey eCKey = null;
            //Act Statement(s)
            target.createEmptyInputScript(eCKey, scriptMock);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${7d3b5116-97e0-30ae-92c3-06760033f8c7}
    @Test()
    public void createEmptyInputScriptWhenScriptPatternIsP2WPKHThis() {
        /* Branches:
         * (ScriptPattern.isP2PKH(this)) : false
         * (ScriptPattern.isP2WPKH(this)) : true
         */
        //Arrange Statement(s)
        /*try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
    List<ScriptChunk> scriptChunkList = new ArrayList<>();
    scriptChunkList.add(null);
    Instant instant = Instant.now();
    Script target = Script.of(scriptChunkList, instant);
    scriptPattern.when(() -> ScriptPattern.isP2PKH(target)).thenReturn(false);
    scriptPattern.when(() -> ScriptPattern.isP2WPKH(target)).thenReturn(true);
    //Act Statement(s)
    Script result = target.createEmptyInputScript(eCKeyMock, scriptMock);
    Script script = ScriptBuilder.createEmpty();
    //Assert statement(s)
    assertThat(result, equalTo(script));
    scriptPattern.verify(() -> ScriptPattern.isP2PKH(target), atLeast(1));
    scriptPattern.verify(() -> ScriptPattern.isP2WPKH(target), atLeast(1));
}*/
    }

    //Sapient generated method id: ${522baaee-5e06-3518-a757-5f87ea08cf27}
    @Test()
    public void createEmptyInputScriptWhenScriptPatternIsP2PKThis() {
        /* Branches:
         * (ScriptPattern.isP2PKH(this)) : false
         * (ScriptPattern.isP2WPKH(this)) : false
         * (ScriptPattern.isP2PK(this)) : true
         */
        //Arrange Statement(s)
        /*try (MockedStatic<ScriptBuilder> scriptBuilder = mockStatic(ScriptBuilder.class);
    MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
    scriptBuilder.when(() -> ScriptBuilder.createInputScript(null)).thenReturn(scriptMock);
    List<ScriptChunk> scriptChunkList = new ArrayList<>();
    scriptChunkList.add(null);
    Instant instant = Instant.now();
    Script target = Script.of(scriptChunkList, instant);
    scriptPattern.when(() -> ScriptPattern.isP2PKH(target)).thenReturn(false);
    scriptPattern.when(() -> ScriptPattern.isP2WPKH(target)).thenReturn(false);
    scriptPattern.when(() -> ScriptPattern.isP2PK(target)).thenReturn(true);
    //Act Statement(s)
    Script result = target.createEmptyInputScript(eCKeyMock, scriptMock2);
    //Assert statement(s)
    assertThat(result, equalTo(scriptMock));
    scriptBuilder.verify(() -> ScriptBuilder.createInputScript(null), atLeast(1));
    scriptPattern.verify(() -> ScriptPattern.isP2PKH(target), atLeast(1));
    scriptPattern.verify(() -> ScriptPattern.isP2WPKH(target), atLeast(1));
    scriptPattern.verify(() -> ScriptPattern.isP2PK(target), atLeast(1));
}*/
    }

    //Sapient generated method id: ${93dfce7d-d8dd-30c1-9d7e-cdbc01bd4c3c}
    @Ignore()
    @Test()
    public void createEmptyInputScriptWhenScriptPatternNotIsP2SHThisThrowsScriptException() {
        /* Branches:
         * (ScriptPattern.isP2PKH(this)) : false
         * (ScriptPattern.isP2WPKH(this)) : false
         * (ScriptPattern.isP2PK(this)) : false
         * (ScriptPattern.isP2SH(this)) : false
         */
        //Arrange Statement(s)
        /*try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
    List<ScriptChunk> scriptChunkList = new ArrayList<>();
    scriptChunkList.add(null);
    Instant instant = Instant.now();
    Script target = Script.of(scriptChunkList, instant);
    scriptPattern.when(() -> ScriptPattern.isP2PKH(target)).thenReturn(false);
    scriptPattern.when(() -> ScriptPattern.isP2WPKH(target)).thenReturn(false);
    scriptPattern.when(() -> ScriptPattern.isP2PK(target)).thenReturn(false);
    scriptPattern.when(() -> ScriptPattern.isP2SH(target)).thenReturn(false);
    thrown.expect(ScriptException.class);
    //Act Statement(s)
    target.createEmptyInputScript(eCKeyMock, scriptMock);
    //Assert statement(s)
    scriptPattern.verify(() -> ScriptPattern.isP2PKH(target), atLeast(1));
    scriptPattern.verify(() -> ScriptPattern.isP2WPKH(target), atLeast(1));
    scriptPattern.verify(() -> ScriptPattern.isP2PK(target), atLeast(1));
    scriptPattern.verify(() -> ScriptPattern.isP2SH(target), atLeast(1));
}*/
    }

    //Sapient generated method id: ${b703edc8-18e1-38f9-bb3f-dca8142f6b5a}
    @Ignore()
    @Test()
    public void createEmptyInputScriptWhenRedeemScriptIsNotNullThrowsIllegalArgumentException() {
        /* Branches:
         * (ScriptPattern.isP2PKH(this)) : false
         * (ScriptPattern.isP2WPKH(this)) : false
         * (ScriptPattern.isP2PK(this)) : false
         * (ScriptPattern.isP2SH(this)) : true
         * (redeemScript != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(target)).thenReturn(true);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.createEmptyInputScript(eCKeyMock, scriptMock);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${924fc5b1-0025-3f08-95c9-1f00a927b4d8}
    @Test()
    public void createEmptyInputScriptWhenRedeemScriptIsNullThrowsIllegalArgumentException() {
        /* Branches:
         * (ScriptPattern.isP2PKH(this)) : false
         * (ScriptPattern.isP2WPKH(this)) : false
         * (ScriptPattern.isP2PK(this)) : false
         * (ScriptPattern.isP2SH(this)) : true
         * (redeemScript != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(target)).thenReturn(true);
            thrown.expect(IllegalArgumentException.class);
            Script script = null;
            //Act Statement(s)
            target.createEmptyInputScript(eCKeyMock, script);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${5cb4bb66-7a8a-3202-8e10-d6b59cb5c09f}
    @Test()
    public void getScriptSigWithSignatureWhenScriptPatternIsP2SHThis() {
        /* Branches:
         * (ScriptPattern.isP2SH(this)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptBuilder> scriptBuilder = mockStatic(ScriptBuilder.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            byte[] byteArray = new byte[]{};
            scriptBuilder.when(() -> ScriptBuilder.updateScriptWithSignature(scriptMock2, byteArray, 0, 1, 1)).thenReturn(scriptMock);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            scriptPattern.when(() -> ScriptPattern.isP2SH(target)).thenReturn(true);
            //Act Statement(s)
            Script result = target.getScriptSigWithSignature(scriptMock2, byteArray, 0);
            //Assert statement(s)
            assertThat(result, equalTo(scriptMock));
            scriptBuilder.verify(() -> ScriptBuilder.updateScriptWithSignature(scriptMock2, byteArray, 0, 1, 1), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${68ffe24d-6883-320f-a154-65115f2ffd79}
    @Test()
    public void getScriptSigWithSignatureWhenScriptPatternIsSentToMultisigThis() {
        /* Branches:
         * (ScriptPattern.isP2SH(this)) : false
         * (ScriptPattern.isSentToMultisig(this)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptBuilder> scriptBuilder = mockStatic(ScriptBuilder.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            byte[] byteArray = new byte[]{};
            scriptBuilder.when(() -> ScriptBuilder.updateScriptWithSignature(scriptMock2, byteArray, 0, 1, 0)).thenReturn(scriptMock);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            scriptPattern.when(() -> ScriptPattern.isP2SH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isSentToMultisig(target)).thenReturn(true);
            //Act Statement(s)
            Script result = target.getScriptSigWithSignature(scriptMock2, byteArray, 0);
            //Assert statement(s)
            assertThat(result, equalTo(scriptMock));
            scriptBuilder.verify(() -> ScriptBuilder.updateScriptWithSignature(scriptMock2, byteArray, 0, 1, 0), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isSentToMultisig(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${f5b06c53-f8fb-3741-8992-9d40d13f1d25}
    @Test()
    public void getScriptSigWithSignatureWhenScriptPatternIsP2PKHThis() {
        /* Branches:
         * (ScriptPattern.isP2SH(this)) : false
         * (ScriptPattern.isSentToMultisig(this)) : false
         * (ScriptPattern.isP2PKH(this)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptBuilder> scriptBuilder = mockStatic(ScriptBuilder.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            byte[] byteArray = new byte[]{};
            scriptBuilder.when(() -> ScriptBuilder.updateScriptWithSignature(scriptMock2, byteArray, 0, 0, 1)).thenReturn(scriptMock);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            scriptPattern.when(() -> ScriptPattern.isP2SH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isSentToMultisig(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(target)).thenReturn(true);
            //Act Statement(s)
            Script result = target.getScriptSigWithSignature(scriptMock2, byteArray, 0);
            //Assert statement(s)
            assertThat(result, equalTo(scriptMock));
            scriptBuilder.verify(() -> ScriptBuilder.updateScriptWithSignature(scriptMock2, byteArray, 0, 0, 1), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isSentToMultisig(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${ebb40f4a-a05f-3741-8e58-85e3bf1aced0}
    @Test()
    public void getSigInsertionIndexWhenExistingChunksIsEmpty() throws SignatureDecodeException {
        //TODO: Please change the modifier of findKeyInRedeem from private to default to isolate the test case scenario
        //Act Statement(s)
        //Assert statement(s)
        //byte[] byteArray = new byte[] {};
        //script.when(() -> Script.parse(byteArray)).thenReturn(scriptMock);
        //doReturn(0).when(scriptMock).findKeyInRedeem(eCKeyMock);
        //List<ScriptChunk> scriptChunkList = new ArrayList<>();
        //scriptChunkList.add(null);
        //scriptChunkList.add(null);
        //Instant instant = Instant.now();
        //Script target = Script.of(scriptChunkList, instant);
        //int result = target.getSigInsertionIndex(sha256HashMock, eCKeyMock);
        //assertThat(result, equalTo(0));
        //script.verify(() -> Script.parse(byteArray), atLeast(1));
    }

    //Sapient generated method id: ${7015688f-681e-3c03-8d15-ac0677ed4d9f}
    @Ignore()
    @Test()
    public void getSigInsertionIndexWhenChunkOpcodeEqualsOP_0() throws SignatureDecodeException {
        //TODO: Please change the modifier of findKeyInRedeem from private to default to isolate the test case scenario
        //Act Statement(s)
        //Assert statement(s)
        //byte[] byteArray = new byte[] {};
        //script.when(() -> Script.parse(byteArray)).thenReturn(scriptMock);
        //doReturn(0).when(scriptMock).findKeyInRedeem(eCKeyMock);
        //List<ScriptChunk> scriptChunkList = new ArrayList<>();
        //scriptChunkList.add(null);
        //scriptChunkList.add(null);
        //scriptChunkList.add(null);
        //Instant instant = Instant.now();
        //Script target = Script.of(scriptChunkList, instant);
        //int result = target.getSigInsertionIndex(sha256HashMock, eCKeyMock);
        //assertThat(result, equalTo(0));
        //script.verify(() -> Script.parse(byteArray), atLeast(1));
    }

    //Sapient generated method id: ${46de80ed-d047-3ed9-beb3-614a4a9347a2}
    @Ignore()
    @Test()
    public void getSigInsertionIndexWhenMyIndexLessThanRedeemScriptFindSigInRedeemChunkDataHash() throws SignatureDecodeException {
        //TODO: Please change the modifier of findKeyInRedeem from private to default to isolate the test case scenario
        //TODO: Please change the modifier of findSigInRedeem from private to default to isolate the test case scenario
        //Act Statement(s)
        //Assert statement(s)
        //byte[] byteArray = new byte[] {};
        //script.when(() -> Script.parse(byteArray)).thenReturn(scriptMock);
        //doReturn(-1).when(scriptMock).findKeyInRedeem(eCKeyMock);
        //byte[] byteArray2 = new byte[] {};
        //doReturn(0).when(scriptMock).findSigInRedeem(byteArray2, sha256HashMock);
        //List<ScriptChunk> scriptChunkList = new ArrayList<>();
        //scriptChunkList.add(null);
        //scriptChunkList.add(null);
        //scriptChunkList.add(null);
        //Instant instant = Instant.now();
        //Script target = Script.of(scriptChunkList, instant);
        //int result = target.getSigInsertionIndex(sha256HashMock, eCKeyMock);
        //assertThat(result, equalTo(0));
        //script.verify(() -> Script.parse(byteArray), atLeast(1));
    }

    //Sapient generated method id: ${f5d75a3e-1991-370e-ade5-c52b591841dd}
    @Ignore()
    @Test()
    public void getSigInsertionIndexWhenMyIndexNotLessThanRedeemScriptFindSigInRedeemChunkDataHash() throws SignatureDecodeException {
        //TODO: Please change the modifier of findKeyInRedeem from private to default to isolate the test case scenario
        //TODO: Please change the modifier of findSigInRedeem from private to default to isolate the test case scenario
        //Act Statement(s)
        //Assert statement(s)
        //byte[] byteArray = new byte[] {};
        //script.when(() -> Script.parse(byteArray)).thenReturn(scriptMock);
        //doReturn(0).when(scriptMock).findKeyInRedeem(eCKeyMock);
        //byte[] byteArray2 = new byte[] {};
        //doReturn(0).when(scriptMock).findSigInRedeem(byteArray2, sha256HashMock);
        //List<ScriptChunk> scriptChunkList = new ArrayList<>();
        //scriptChunkList.add(null);
        //scriptChunkList.add(null);
        //scriptChunkList.add(null);
        //Instant instant = Instant.now();
        //Script target = Script.of(scriptChunkList, instant);
        //int result = target.getSigInsertionIndex(sha256HashMock, eCKeyMock);
        //assertThat(result, equalTo(1));
        //script.verify(() -> Script.parse(byteArray), atLeast(1));
    }

    //Sapient generated method id: ${b21c161a-0385-32f9-a887-cf73a1becd5d}
    @Test()
    public void getSigInsertionIndexWhenCaughtSignatureDecodeException() throws SignatureDecodeException {
        //TODO: Please change the modifier of findKeyInRedeem from private to default to isolate the test case scenario
        //TODO: Please change the modifier of findSigInRedeem from private to default to isolate the test case scenario
        //Act Statement(s)
        //Assert statement(s)
        //byte[] byteArray = new byte[] {};
        //script.when(() -> Script.parse(byteArray)).thenReturn(scriptMock);
        //doReturn(-1).when(scriptMock).findKeyInRedeem(eCKeyMock);
        //byte[] byteArray2 = new byte[] {};
        //doThrow(signatureDecodeExceptionMock).when(scriptMock).findSigInRedeem(byteArray2, sha256HashMock);
        //List<ScriptChunk> scriptChunkList = new ArrayList<>();
        //scriptChunkList.add(null);
        //scriptChunkList.add(null);
        //scriptChunkList.add(null);
        //Instant instant = Instant.now();
        //Script target = Script.of(scriptChunkList, instant);
        //int result = target.getSigInsertionIndex(sha256HashMock, eCKeyMock);
        //assertThat(result, equalTo(1));
        //script.verify(() -> Script.parse(byteArray), atLeast(1));
    }

    //Sapient generated method id: ${84b05029-5716-3172-96d4-7291310a0091}
    @Test()
    public void getPubKeysWhenScriptPatternNotIsSentToMultisigThisThrowsScriptException() {
        /* Branches:
         * (!ScriptPattern.isSentToMultisig(this)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            scriptPattern.when(() -> ScriptPattern.isSentToMultisig(target)).thenReturn(false);
            thrown.expect(ScriptException.class);
            //Act Statement(s)
            target.getPubKeys();
            //Assert statement(s)
            scriptPattern.verify(() -> ScriptPattern.isSentToMultisig(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${ee2983eb-318a-3054-82c2-344d10bcf0fa}
    @Ignore()
    @Test()
    public void getPubKeysWhenILessThanNumKeys() {
        /* Branches:
         * (!ScriptPattern.isSentToMultisig(this)) : false
         * (i < numKeys) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<Script> script = mockStatic(Script.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            script.when(() -> Script.decodeFromOpN(0)).thenReturn(1);
            byte[] byteArray = new byte[]{};
            eCKey.when(() -> ECKey.fromPublicOnly(byteArray)).thenReturn(eCKeyMock);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            scriptPattern.when(() -> ScriptPattern.isSentToMultisig(target)).thenReturn(true);
            //Act Statement(s)
            List<ECKey> result = target.getPubKeys();
            List<ECKey> eCKeyResultList = new ArrayList<>();
            eCKeyResultList.add(eCKeyMock);
            //Assert statement(s)
            assertThat(result.size(), equalTo(eCKeyResultList.size()));
            assertThat(result, containsInRelativeOrder(eCKeyResultList.toArray()));
            script.verify(() -> Script.decodeFromOpN(0), atLeast(1));
            eCKey.verify(() -> ECKey.fromPublicOnly(byteArray), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isSentToMultisig(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${c3b95ecd-71b8-3a4d-8e8f-7ac0f35f31a4}
    @Test()
    public void decodeFromOpNWhenOpcodeEqualsOP_0() {
        /* Branches:
         * (opcode == OP_0) : true
         * (opcode == OP_0) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            int result = Script.decodeFromOpN(0);
            //Assert statement(s)
            assertThat(result, equalTo(0));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${ec5245aa-7914-3611-8041-606aeb9f04ce}
    @Test()
    public void decodeFromOpNWhenOpcodeEqualsOP_1NEGATE() {
        /* Branches:
         * (opcode == OP_0) : false
         * (opcode == OP_1NEGATE) : true
         * (opcode == OP_0) : false
         * (opcode == OP_1NEGATE) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            int result = Script.decodeFromOpN(79);
            //Assert statement(s)
            assertThat(result, equalTo(-1));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${463ee326-1028-39f7-89dd-cac37acd3acb}
    @Test()
    public void decodeFromOpNWhenOpcodeNotEqualsOP_0AndOpcodeNotEqualsOP_1NEGATE() {
        /* Branches:
         * (opcode == OP_0) : false
         * (opcode == OP_1NEGATE) : false
         * (opcode >= OP_1) : true
         * (opcode <= OP_16) : true
         * (opcode == OP_0) : false
         * (opcode == OP_1NEGATE) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            int result = Script.decodeFromOpN(81);
            //Assert statement(s)
            assertThat(result, equalTo(1));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${f915efb3-f61f-3e14-8d92-dd5e251bfd09}
    @Ignore()
    @Test()
    public void decodeFromOpNWhenOpcodeGreaterThanOP_16AndOpcodeNotEqualsOP_0AndOpcodeNotEqualsOP_1NEGATE() {
        /* Branches:
         * (opcode == OP_0) : false
         * (opcode == OP_1NEGATE) : false
         * (opcode >= OP_1) : true
         * (opcode <= OP_16) : false
         * (opcode == OP_0) : false
         * (opcode == OP_1NEGATE) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            int result = Script.decodeFromOpN(97);
            //Assert statement(s)
            assertThat(result, equalTo(17));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${0e522684-7ccf-3284-9a38-3963039d0c5e}
    @Ignore()
    @Test()
    public void encodeToOpNWhenValueLessThanOrEqualsTo16ThrowsIllegalArgumentException() {
        /* Branches:
         * (value >= -1) : true
         * (value <= 16) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            Script.encodeToOpN(1);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${c5500575-186e-389b-a247-c6ea3b5e042d}
    @Test()
    public void encodeToOpNWhenValueGreaterThan16ThrowsIllegalArgumentException() {
        /* Branches:
         * (value >= -1) : true
         * (value <= 16) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            Script.encodeToOpN(17);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${8f0652b0-7fb8-3a5b-a1dc-2bc683ea34a7}
    @Test()
    public void getSigOpCount1WhenBisAvailableLessThan1AndChunksIsEmpty() throws ScriptException {
        /* Branches:
         * (bis.available() > 0) : true  #  inside parseIntoChunks method
         * (opcode >= 0) : true  #  inside parseIntoChunks method
         * (opcode < OP_PUSHDATA1) : false  #  inside parseIntoChunks method
         * (opcode == OP_PUSHDATA1) : true  #  inside parseIntoChunks method
         * (bis.available() < 1) : true  #  inside parseIntoChunks method
         * (for-each(chunks)) : false  #  inside getSigOpCount method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        int result = Script.getSigOpCount(byteArray);
        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${1ad27a40-0648-31df-8c5a-c31cf9435eac}
    @Ignore()
    @Test()
    public void getSigOpCount1WhenBisReadData0DataToReadNotEqualsDataToReadThrowsIllegalStateException() throws ScriptException {
        /* Branches:
         * (bis.available() > 0) : true  #  inside parseIntoChunks method
         * (opcode >= 0) : true  #  inside parseIntoChunks method
         * (opcode < OP_PUSHDATA1) : true  #  inside parseIntoChunks method
         * (dataToRead == -1) : false  #  inside parseIntoChunks method
         * (dataToRead > bis.available()) : false  #  inside parseIntoChunks method
         * (dataToRead == 0) : false  #  inside parseIntoChunks method
         * (bis.read(data, 0, (int) dataToRead) == dataToRead) : false  #  inside parseIntoChunks method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(false)).thenThrow(illegalStateException);
            thrown.expect(IllegalStateException.class);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            Script.getSigOpCount(byteArray);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
        }
    }

    //Sapient generated method id: ${84f5adfc-d16a-32c0-9b4c-f436a2d081b5}
    @Ignore()
    @Test()
    public void getSigOpCount1WhenDataToReadNotEqualsMinus1AndDataToReadGreaterThanBisAvailableAndChunksIsEmpty() throws ScriptException {
        /* Branches:
         * (bis.available() > 0) : true  #  inside parseIntoChunks method
         * (opcode >= 0) : true  #  inside parseIntoChunks method
         * (opcode < OP_PUSHDATA1) : false  #  inside parseIntoChunks method
         * (opcode == OP_PUSHDATA1) : false  #  inside parseIntoChunks method
         * (opcode == OP_PUSHDATA2) : true  #  inside parseIntoChunks method
         * (bis.available() < 2) : false  #  inside parseIntoChunks method
         * (dataToRead == -1) : false  #  inside parseIntoChunks method
         * (dataToRead > bis.available()) : true  #  inside parseIntoChunks method
         * (for-each(chunks)) : false  #  inside getSigOpCount method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            ByteArrayInputStream byteArrayInputStream = mock(ByteArrayInputStream.class);
            byteUtils.when(() -> ByteUtils.readUint16(byteArrayInputStream)).thenReturn(2);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            int result = Script.getSigOpCount(byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(0));
            byteUtils.verify(() -> ByteUtils.readUint16(byteArrayInputStream), atLeast(1));
        }
    }

    //Sapient generated method id: ${0386d0ab-b974-35ed-9bb6-4a7c1e48f0fb}
    @Test()
    public void getSigOpCount1WhenChunksIsNotEmptyAndChunkNotIsOpCode() throws ScriptException {
        /* Branches:
         * (bis.available() > 0) : true  #  inside parseIntoChunks method
         * (opcode >= 0) : true  #  inside parseIntoChunks method
         * (opcode < OP_PUSHDATA1) : false  #  inside parseIntoChunks method
         * (opcode == OP_PUSHDATA1) : true  #  inside parseIntoChunks method
         * (bis.available() < 1) : false  #  inside parseIntoChunks method
         * (dataToRead == -1) : true  #  inside parseIntoChunks method
         * (for-each(STANDARD_TRANSACTION_SCRIPT_CHUNKS)) : true  #  inside parseIntoChunks method
         * (c.equals(chunk)) : false  #  inside parseIntoChunks method
         * (for-each(chunks)) : true  #  inside getSigOpCount method
         * (chunk.isOpCode()) : false  #  inside getSigOpCount method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 118, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        //Act Statement(s)
        int result = Script.getSigOpCount(byteArray);
        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${8beb9089-d098-3c39-a498-0d613e64f383}
    @Ignore()
    @Test()
    public void getSigOpCount1WhenCEqualsChunkAndChunksIsNotEmptyAndChunkIsOpCodeAndSwitchChunkOpcodeCaseDefault5() throws ScriptException {
        /* Branches:
         * (bis.available() > 0) : true  #  inside parseIntoChunks method
         * (opcode >= 0) : true  #  inside parseIntoChunks method
         * (opcode < OP_PUSHDATA1) : false  #  inside parseIntoChunks method
         * (opcode == OP_PUSHDATA1) : false  #  inside parseIntoChunks method
         * (opcode == OP_PUSHDATA2) : false  #  inside parseIntoChunks method
         * (opcode == OP_PUSHDATA4) : true  #  inside parseIntoChunks method
         * (bis.available() < 4) : false  #  inside parseIntoChunks method
         * (dataToRead == -1) : false  #  inside parseIntoChunks method
         * (dataToRead > bis.available()) : false  #  inside parseIntoChunks method
         * (dataToRead == 0) : false  #  inside parseIntoChunks method
         * (bis.read(data, 0, (int) dataToRead) == dataToRead) : true  #  inside parseIntoChunks method
         * (for-each(STANDARD_TRANSACTION_SCRIPT_CHUNKS)) : true  #  inside parseIntoChunks method
         * (c.equals(chunk)) : true  #  inside parseIntoChunks method
         * (for-each(chunks)) : true  #  inside getSigOpCount method
         * (chunk.isOpCode()) : true  #  inside getSigOpCount method
         * (switch(chunk.opcode) = default) : true  #  inside getSigOpCount method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            ByteArrayInputStream byteArrayInputStream = mock(ByteArrayInputStream.class);
            byteUtils.when(() -> ByteUtils.readUint32(byteArrayInputStream)).thenReturn(1L);
            byte[] byteArray = new byte[]{(byte) 0};
            //Act Statement(s)
            int result = Script.getSigOpCount(byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(0));
            byteUtils.verify(() -> ByteUtils.readUint32(byteArrayInputStream), atLeast(1));
        }
    }

    //Sapient generated method id: ${4b7f0f99-5f90-3b45-8025-9819d3b570a4}
    @Test()
    public void getP2SHSigOpCountWhenBisAvailableLessThan1AndChunksIsEmpty() throws ScriptException {
        /* Branches:
         * (bis.available() > 0) : true  #  inside parseIntoChunks method
         * (opcode >= 0) : true  #  inside parseIntoChunks method
         * (opcode < OP_PUSHDATA1) : false  #  inside parseIntoChunks method
         * (opcode == OP_PUSHDATA1) : true  #  inside parseIntoChunks method
         * (bis.available() < 1) : true  #  inside parseIntoChunks method
         * (for-each(chunks)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0};
        //Act Statement(s)
        long result = Script.getP2SHSigOpCount(byteArray);
        //Assert statement(s)
        assertThat(result, equalTo(0L));
    }

    //Sapient generated method id: ${38a9fc63-8f65-36ad-9d8f-647403c3e5f0}
    @Ignore()
    @Test()
    public void getP2SHSigOpCountWhenBisReadData0DataToReadNotEqualsDataToReadThrowsIllegalStateException() throws ScriptException {
        /* Branches:
         * (bis.available() > 0) : true  #  inside parseIntoChunks method
         * (opcode >= 0) : true  #  inside parseIntoChunks method
         * (opcode < OP_PUSHDATA1) : true  #  inside parseIntoChunks method
         * (dataToRead == -1) : false  #  inside parseIntoChunks method
         * (dataToRead > bis.available()) : false  #  inside parseIntoChunks method
         * (dataToRead == 0) : false  #  inside parseIntoChunks method
         * (bis.read(data, 0, (int) dataToRead) == dataToRead) : false  #  inside parseIntoChunks method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(false)).thenThrow(illegalStateException);
            thrown.expect(IllegalStateException.class);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            Script.getP2SHSigOpCount(byteArray);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
        }
    }

    //Sapient generated method id: ${92c71f12-d65a-3104-bf0c-0c9bea3b2918}
    @Ignore()
    @Test()
    public void getP2SHSigOpCountWhenDataToReadNotEqualsMinus1AndDataToReadGreaterThanBisAvailableAndChunksIsEmpty() throws ScriptException {
        /* Branches:
         * (bis.available() > 0) : true  #  inside parseIntoChunks method
         * (opcode >= 0) : true  #  inside parseIntoChunks method
         * (opcode < OP_PUSHDATA1) : false  #  inside parseIntoChunks method
         * (opcode == OP_PUSHDATA1) : false  #  inside parseIntoChunks method
         * (opcode == OP_PUSHDATA2) : true  #  inside parseIntoChunks method
         * (bis.available() < 2) : false  #  inside parseIntoChunks method
         * (dataToRead == -1) : false  #  inside parseIntoChunks method
         * (dataToRead > bis.available()) : true  #  inside parseIntoChunks method
         * (for-each(chunks)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            ByteArrayInputStream byteArrayInputStream = mock(ByteArrayInputStream.class);
            byteUtils.when(() -> ByteUtils.readUint16(byteArrayInputStream)).thenReturn(0);
            byte[] byteArray = new byte[]{(byte) 0};
            //Act Statement(s)
            long result = Script.getP2SHSigOpCount(byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(0L));
            byteUtils.verify(() -> ByteUtils.readUint16(byteArrayInputStream), atLeast(1));
        }
    }

    //Sapient generated method id: ${b10c2b5e-b84b-3c2a-ab7c-e899cafa27fd}
    @Test()
    public void getP2SHSigOpCountWhenSTANDARD_TRANSACTION_SCRIPT_CHUNKSIsNotEmptyAndCNotEqualsChunkAndChunksIsNotEmptyAndChunkIsOpCode() throws ScriptException {
        /* Branches:
         * (bis.available() > 0) : true  #  inside parseIntoChunks method
         * (opcode >= 0) : true  #  inside parseIntoChunks method
         * (opcode < OP_PUSHDATA1) : false  #  inside parseIntoChunks method
         * (opcode == OP_PUSHDATA1) : true  #  inside parseIntoChunks method
         * (bis.available() < 1) : false  #  inside parseIntoChunks method
         * (dataToRead == -1) : true  #  inside parseIntoChunks method
         * (for-each(STANDARD_TRANSACTION_SCRIPT_CHUNKS)) : true  #  inside parseIntoChunks method
         * (c.equals(chunk)) : false  #  inside parseIntoChunks method
         * (for-each(chunks)) : true
         * (!chunk.isOpCode()) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: chunk
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        long result = Script.getP2SHSigOpCount(byteArray);
        //Assert statement(s)
        assertThat(result, equalTo(0L));
    }

    //Sapient generated method id: ${94e245a5-9c7d-37c8-8276-9a2cab2f17fd}
    @Test()
    public void getP2SHSigOpCountWhenSwitchChunkOpcodeCaseDefault() throws ScriptException {
        /* Branches:
         * (bis.available() > 0) : true  #  inside parseIntoChunks method
         * (opcode >= 0) : true  #  inside parseIntoChunks method
         * (opcode < OP_PUSHDATA1) : true  #  inside parseIntoChunks method
         * (dataToRead == -1) : true  #  inside parseIntoChunks method
         * (for-each(STANDARD_TRANSACTION_SCRIPT_CHUNKS)) : true  #  inside parseIntoChunks method
         * (c.equals(chunk)) : false  #  inside parseIntoChunks method
         * (for-each(chunks)) : true
         * (!chunk.isOpCode()) : true
         * (for-each(chunks)) : true  #  inside getSigOpCount method
         * (chunk.isOpCode()) : true  #  inside getSigOpCount method
         * (switch(chunk.opcode) = default) : true  #  inside getSigOpCount method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Script> script = mockStatic(Script.class, CALLS_REAL_METHODS)) {
    List list = new ArrayList<>();
    Script script2 = Script.of(list);
    script.when(() -> Script.parse((byte[]) null)).thenReturn(script2);
    byte[][] byteArray3 = new byte[][] { (byte) 0 };
    byte[][] byteArray4 = new byte[][] { (byte) 0 };
    byte[][] byteArray5 = new byte[][] { (byte) 0 };
    byte[][] byteArray6 = new byte[][] {};
    byte[] byteArray2 = new byte[] { byteArray3, byteArray4, byteArray5, byteArray6 };
    byte[] byteArray = new byte[] { byteArray2 };
    //Act Statement(s)
    long result = Script.getP2SHSigOpCount(byteArray);
    //Assert statement(s)
    assertThat(result, equalTo(0L));
    script.verify(() -> Script.parse((byte[]) null), atLeast(1));
}*/
    }

    //Sapient generated method id: ${c251917c-4144-3f6f-a093-ed6757da6760}
    @Ignore()
    @Test()
    public void getP2SHSigOpCountWhenSTANDARD_TRANSACTION_SCRIPT_CHUNKSIsNotEmptyAndCEqualsChunkAndChunksIsNotEmptyAndChunkIsOpCode3() throws ScriptException {
        /* Branches:
         * (bis.available() > 0) : true  #  inside parseIntoChunks method
         * (opcode >= 0) : true  #  inside parseIntoChunks method
         * (opcode < OP_PUSHDATA1) : false  #  inside parseIntoChunks method
         * (opcode == OP_PUSHDATA1) : false  #  inside parseIntoChunks method
         * (opcode == OP_PUSHDATA2) : false  #  inside parseIntoChunks method
         * (opcode == OP_PUSHDATA4) : true  #  inside parseIntoChunks method
         * (bis.available() < 4) : false  #  inside parseIntoChunks method
         * (dataToRead == -1) : false  #  inside parseIntoChunks method
         * (dataToRead > bis.available()) : false  #  inside parseIntoChunks method
         * (dataToRead == 0) : false  #  inside parseIntoChunks method
         * (bis.read(data, 0, (int) dataToRead) == dataToRead) : true  #  inside parseIntoChunks method
         * (for-each(STANDARD_TRANSACTION_SCRIPT_CHUNKS)) : true  #  inside parseIntoChunks method
         * (c.equals(chunk)) : true  #  inside parseIntoChunks method
         * (for-each(chunks)) : true
         * (!chunk.isOpCode()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            ByteArrayInputStream byteArrayInputStream = mock(ByteArrayInputStream.class);
            byteUtils.when(() -> ByteUtils.readUint32(byteArrayInputStream)).thenReturn(1L);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            long result = Script.getP2SHSigOpCount(byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(0L));
            byteUtils.verify(() -> ByteUtils.readUint32(byteArrayInputStream), atLeast(1));
        }
    }

    //Sapient generated method id: ${01067141-33e9-36f2-ba2c-0fe86b4aa4aa}
    @Ignore()
    @Test()
    public void getNumberOfSignaturesRequiredToSpendWhenScriptPatternIsSentToMultisigThis() {
        /* Branches:
         * (ScriptPattern.isSentToMultisig(this)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Script> script = mockStatic(Script.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            script.when(() -> Script.decodeFromOpN(0)).thenReturn(0);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            scriptPattern.when(() -> ScriptPattern.isSentToMultisig(target)).thenReturn(true);
            //Act Statement(s)
            int result = target.getNumberOfSignaturesRequiredToSpend();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            script.verify(() -> Script.decodeFromOpN(0), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isSentToMultisig(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${ec6bafdb-7f5c-3aea-af0e-a90178266b39}
    @Test()
    public void getNumberOfSignaturesRequiredToSpendWhenScriptPatternIsP2PKHThis() {
        /* Branches:
         * (ScriptPattern.isSentToMultisig(this)) : false
         * (ScriptPattern.isP2PKH(this)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            scriptPattern.when(() -> ScriptPattern.isSentToMultisig(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(target)).thenReturn(true);
            //Act Statement(s)
            int result = target.getNumberOfSignaturesRequiredToSpend();
            //Assert statement(s)
            assertThat(result, equalTo(1));
            scriptPattern.verify(() -> ScriptPattern.isSentToMultisig(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${3525cb7f-a2a0-3a3f-b2c8-dc9f0cdb2710}
    @Test()
    public void getNumberOfSignaturesRequiredToSpendWhenScriptPatternIsP2PKThis() {
        /* Branches:
         * (ScriptPattern.isSentToMultisig(this)) : false
         * (ScriptPattern.isP2PKH(this)) : false
         * (ScriptPattern.isP2PK(this)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            scriptPattern.when(() -> ScriptPattern.isSentToMultisig(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(target)).thenReturn(true);
            //Act Statement(s)
            int result = target.getNumberOfSignaturesRequiredToSpend();
            //Assert statement(s)
            assertThat(result, equalTo(1));
            scriptPattern.verify(() -> ScriptPattern.isSentToMultisig(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${5a42fd2e-6d90-364e-8a23-697eee8d4187}
    @Test()
    public void getNumberOfSignaturesRequiredToSpendWhenScriptPatternIsP2SHThisThrowsIllegalStateException() {
        /* Branches:
         * (ScriptPattern.isSentToMultisig(this)) : false
         * (ScriptPattern.isP2PKH(this)) : false
         * (ScriptPattern.isP2PK(this)) : false
         * (ScriptPattern.isP2SH(this)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            scriptPattern.when(() -> ScriptPattern.isSentToMultisig(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(target)).thenReturn(true);
            IllegalStateException illegalStateException = new IllegalStateException("For P2SH number of signatures depends on redeem script");
            thrown.expect(IllegalStateException.class);
            thrown.expectMessage(illegalStateException.getMessage());
            //Act Statement(s)
            target.getNumberOfSignaturesRequiredToSpend();
            //Assert statement(s)
            scriptPattern.verify(() -> ScriptPattern.isSentToMultisig(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${89f1a64f-a232-3534-867f-d0bc9adf20a8}
    @Test()
    public void getNumberOfSignaturesRequiredToSpendWhenScriptPatternNotIsP2SHThisThrowsIllegalStateException() {
        /* Branches:
         * (ScriptPattern.isSentToMultisig(this)) : false
         * (ScriptPattern.isP2PKH(this)) : false
         * (ScriptPattern.isP2PK(this)) : false
         * (ScriptPattern.isP2SH(this)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            scriptPattern.when(() -> ScriptPattern.isSentToMultisig(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(target)).thenReturn(false);
            IllegalStateException illegalStateException = new IllegalStateException("Unsupported script type");
            thrown.expect(IllegalStateException.class);
            thrown.expectMessage(illegalStateException.getMessage());
            //Act Statement(s)
            target.getNumberOfSignaturesRequiredToSpend();
            //Assert statement(s)
            scriptPattern.verify(() -> ScriptPattern.isSentToMultisig(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${5a8802da-24bc-32b8-87c2-9cecaa914728}
    @Ignore()
    @Test()
    public void getNumberOfBytesRequiredToSpendWhenRedeemScriptIsNotNullThrowsIllegalArgumentException() {
        /* Branches:
         * (ScriptPattern.isP2SH(this)) : true
         * (redeemScript != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            scriptPattern.when(() -> ScriptPattern.isP2SH(target)).thenReturn(true);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.getNumberOfBytesRequiredToSpend(eCKeyMock, scriptMock);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${0544cf39-d05a-3da7-b27a-a9f207c9eb80}
    @Test()
    public void getNumberOfBytesRequiredToSpendWhenRedeemScriptIsNullThrowsIllegalArgumentException() {
        /* Branches:
         * (ScriptPattern.isP2SH(this)) : true
         * (redeemScript != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            scriptPattern.when(() -> ScriptPattern.isP2SH(target)).thenReturn(true);
            thrown.expect(IllegalArgumentException.class);
            Script script = null;
            //Act Statement(s)
            target.getNumberOfBytesRequiredToSpend(eCKeyMock, script);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${94a311ab-0d45-3a6e-90f8-7260d0fde17b}
    @Test()
    public void getNumberOfBytesRequiredToSpendWhenScriptPatternIsSentToMultisigThis() {
        /* Branches:
         * (ScriptPattern.isP2SH(this)) : false
         * (ScriptPattern.isSentToMultisig(this)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = spy(Script.of(scriptChunkList, instant));
            scriptPattern.when(() -> ScriptPattern.isP2SH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isSentToMultisig(target)).thenReturn(true);
            doReturn(0).when(target).getNumberOfSignaturesRequiredToSpend();
            //Act Statement(s)
            int result = target.getNumberOfBytesRequiredToSpend(eCKeyMock, scriptMock);
            //Assert statement(s)
            assertThat(result, equalTo(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isSentToMultisig(target), atLeast(1));
            verify(target).getNumberOfSignaturesRequiredToSpend();
        }
    }

    //Sapient generated method id: ${65ca4651-ab8e-3f2b-82f3-c130262c2436}
    @Test()
    public void getNumberOfBytesRequiredToSpendWhenScriptPatternIsP2PKThis() {
        /* Branches:
         * (ScriptPattern.isP2SH(this)) : false
         * (ScriptPattern.isSentToMultisig(this)) : false
         * (ScriptPattern.isP2PK(this)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            scriptPattern.when(() -> ScriptPattern.isP2SH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isSentToMultisig(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(target)).thenReturn(true);
            //Act Statement(s)
            int result = target.getNumberOfBytesRequiredToSpend(eCKeyMock, scriptMock);
            //Assert statement(s)
            assertThat(result, equalTo(75));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isSentToMultisig(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${d6435ab1-1c23-35c4-af08-a32346c2826d}
    @Test()
    public void getNumberOfBytesRequiredToSpendWhenPubKeyIsNotNull() {
        /* Branches:
         * (ScriptPattern.isP2SH(this)) : false
         * (ScriptPattern.isSentToMultisig(this)) : false
         * (ScriptPattern.isP2PK(this)) : false
         * (ScriptPattern.isP2PKH(this)) : true
         * (pubKey != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(pubKeyMock).getPubKey();
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            scriptPattern.when(() -> ScriptPattern.isP2SH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isSentToMultisig(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(target)).thenReturn(true);
            //Act Statement(s)
            int result = target.getNumberOfBytesRequiredToSpend(pubKeyMock, scriptMock);
            //Assert statement(s)
            assertThat(result, equalTo(75));
            verify(pubKeyMock).getPubKey();
            scriptPattern.verify(() -> ScriptPattern.isP2SH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isSentToMultisig(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${f683bcf3-d467-3e10-b159-137b3b999899}
    @Test()
    public void getNumberOfBytesRequiredToSpendWhenPubKeyIsNull() {
        /* Branches:
         * (ScriptPattern.isP2SH(this)) : false
         * (ScriptPattern.isSentToMultisig(this)) : false
         * (ScriptPattern.isP2PK(this)) : false
         * (ScriptPattern.isP2PKH(this)) : true
         * (pubKey != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            scriptPattern.when(() -> ScriptPattern.isP2SH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isSentToMultisig(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(target)).thenReturn(true);
            ECKey eCKey = null;
            //Act Statement(s)
            int result = target.getNumberOfBytesRequiredToSpend(eCKey, scriptMock);
            //Assert statement(s)
            assertThat(result, equalTo(140));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isSentToMultisig(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${ce02983f-4173-385a-af7d-6b9ae71a0655}
    @Test()
    public void getNumberOfBytesRequiredToSpendWhenScriptPatternNotIsP2WPKHThisThrowsIllegalStateException() {
        /* Branches:
         * (ScriptPattern.isP2SH(this)) : false
         * (ScriptPattern.isSentToMultisig(this)) : false
         * (ScriptPattern.isP2PK(this)) : false
         * (ScriptPattern.isP2PKH(this)) : false
         * (ScriptPattern.isP2WPKH(this)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            scriptPattern.when(() -> ScriptPattern.isP2SH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isSentToMultisig(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(target)).thenReturn(false);
            IllegalStateException illegalStateException = new IllegalStateException("Unsupported script type");
            thrown.expect(IllegalStateException.class);
            thrown.expectMessage(illegalStateException.getMessage());
            //Act Statement(s)
            target.getNumberOfBytesRequiredToSpend(eCKeyMock, scriptMock);
            //Assert statement(s)
            scriptPattern.verify(() -> ScriptPattern.isP2SH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isSentToMultisig(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${7ec182a8-70c1-3aba-83a8-5ff87f2acb7e}
    @Test()
    public void getNumberOfBytesRequiredToSpendWhenScriptPatternIsP2WPKHThisAndPubKeyIsNotNull() {
        /* Branches:
         * (ScriptPattern.isP2SH(this)) : false
         * (ScriptPattern.isSentToMultisig(this)) : false
         * (ScriptPattern.isP2PK(this)) : false
         * (ScriptPattern.isP2PKH(this)) : false
         * (ScriptPattern.isP2WPKH(this)) : true
         * (pubKey != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(pubKeyMock).getPubKey();
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            scriptPattern.when(() -> ScriptPattern.isP2SH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isSentToMultisig(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(target)).thenReturn(true);
            //Act Statement(s)
            int result = target.getNumberOfBytesRequiredToSpend(pubKeyMock, scriptMock);
            //Assert statement(s)
            assertThat(result, equalTo(78));
            verify(pubKeyMock).getPubKey();
            scriptPattern.verify(() -> ScriptPattern.isP2SH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isSentToMultisig(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${d63ca971-340d-3ff4-bd29-ca64bc75c232}
    @Test()
    public void getNumberOfBytesRequiredToSpendWhenScriptPatternIsP2WPKHThisAndPubKeyIsNull() {
        /* Branches:
         * (ScriptPattern.isP2SH(this)) : false
         * (ScriptPattern.isSentToMultisig(this)) : false
         * (ScriptPattern.isP2PK(this)) : false
         * (ScriptPattern.isP2PKH(this)) : false
         * (ScriptPattern.isP2WPKH(this)) : true
         * (pubKey != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            scriptPattern.when(() -> ScriptPattern.isP2SH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isSentToMultisig(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(target)).thenReturn(true);
            ECKey eCKey = null;
            //Act Statement(s)
            int result = target.getNumberOfBytesRequiredToSpend(eCKey, scriptMock);
            //Assert statement(s)
            assertThat(result, equalTo(111));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isSentToMultisig(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${ce7c6b22-ac86-3da9-8d2c-b356eccc19ea}
    @Test()
    public void removeAllInstancesOfWhenSkipIsEmpty() throws IOException {
        /* Branches:
         * (cursor < inputScript.length) : true
         * (start + b.length > a.length) : true  #  inside equalsRange method
         * (opcode >= 0) : true
         * (opcode < OP_PUSHDATA1) : true
         * (!skip) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0};
        byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1};
        //Act Statement(s)
        byte[] result = Script.removeAllInstancesOf(byteArray, byteArray2);
        byte[] byteResultArray = new byte[]{(byte) 0};
        //Assert statement(s)
        assertThat(result, equalTo(byteResultArray));
    }

    //Sapient generated method id: ${91ba9cff-72f0-35c6-8c59-71e8992bfed4}
    @Ignore()
    @Test()
    public void removeAllInstancesOfWhenCaughtIOExceptionThrowsRuntimeException() throws IOException {
        /* Branches:
         * (cursor < inputScript.length) : true
         * (start + b.length > a.length) : true  #  inside equalsRange method
         * (opcode >= 0) : true
         * (opcode < OP_PUSHDATA1) : true
         * (!skip) : true
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        thrown.expect(RuntimeException.class);
        thrown.expectCause(is(instanceOf(IOException.class)));
        byte[] byteArray = new byte[]{(byte) 0, (byte) 74, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8};
        byte[] byteArray2 = new byte[]{(byte) 9, (byte) 9};
        //Act Statement(s)
        Script.removeAllInstancesOf(byteArray, byteArray2);
    }

    //Sapient generated method id: ${60f4dfb7-cde0-3ee2-95eb-ef1ebd20c773}
    @Ignore()
    @Test()
    public void removeAllInstancesOfWhenOpcodeEqualsOP_PUSHDATA1AndSkipIsEmpty() throws IOException {
        /* Branches:
         * (cursor < inputScript.length) : true
         * (start + b.length > a.length) : true  #  inside equalsRange method
         * (opcode >= 0) : true
         * (opcode < OP_PUSHDATA1) : false
         * (opcode == OP_PUSHDATA1) : true
         * (!skip) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2};
        byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3};
        //Act Statement(s)
        byte[] result = Script.removeAllInstancesOf(byteArray, byteArray2);
        byte[] byteResultArray = new byte[]{};
        //Assert statement(s)
        assertThat(result, equalTo(byteResultArray));
    }

    //Sapient generated method id: ${a8997744-a55f-3636-adbd-80bd6a914138}
    @Ignore()
    @Test()
    public void removeAllInstancesOfWhenSkipIsEmptyAndCaughtIOExceptionThrowsRuntimeException() throws IOException {
        /* Branches:
         * (cursor < inputScript.length) : true
         * (start + b.length > a.length) : true  #  inside equalsRange method
         * (opcode >= 0) : true
         * (opcode < OP_PUSHDATA1) : false
         * (opcode == OP_PUSHDATA1) : true
         * (!skip) : true
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        thrown.expect(RuntimeException.class);
        thrown.expectCause(is(instanceOf(IOException.class)));
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2};
        byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3};
        //Act Statement(s)
        Script.removeAllInstancesOf(byteArray, byteArray2);
    }

    //Sapient generated method id: ${aaa22c19-109f-3f71-9415-fea07ee55dd2}
    @Ignore()
    @Test()
    public void removeAllInstancesOfWhenOpcodeEqualsOP_PUSHDATA2AndSkipIsEmpty() throws IOException {
        /* Branches:
         * (cursor < inputScript.length) : true
         * (start + b.length > a.length) : true  #  inside equalsRange method
         * (opcode >= 0) : true
         * (opcode < OP_PUSHDATA1) : false
         * (opcode == OP_PUSHDATA1) : false
         * (opcode == OP_PUSHDATA2) : true
         * (!skip) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            byteUtils.when(() -> ByteUtils.readUint16(byteArray, 1)).thenReturn(-2);
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1};
            //Act Statement(s)
            byte[] result = Script.removeAllInstancesOf(byteArray, byteArray2);
            byte[] byteResultArray = new byte[]{};
            //Assert statement(s)
            assertThat(result, equalTo(byteResultArray));
            byteUtils.verify(() -> ByteUtils.readUint16(byteArray, 1), atLeast(1));
        }
    }

    //Sapient generated method id: ${3f993896-5b79-398f-8191-1d3305ae6087}
    @Ignore()
    @Test()
    public void removeAllInstancesOfWhenOpcodeEqualsOP_PUSHDATA2AndSkipIsEmptyAndCaughtIOExceptionThrowsRuntimeException() throws IOException {
        /* Branches:
         * (cursor < inputScript.length) : true
         * (start + b.length > a.length) : true  #  inside equalsRange method
         * (opcode >= 0) : true
         * (opcode < OP_PUSHDATA1) : false
         * (opcode == OP_PUSHDATA1) : false
         * (opcode == OP_PUSHDATA2) : true
         * (!skip) : true
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        thrown.expect(RuntimeException.class);
        thrown.expectCause(is(instanceOf(IOException.class)));
        byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3, (byte) 2, (byte) 4};
        byte[] byteArray2 = new byte[]{(byte) 2, (byte) 3};
        //Act Statement(s)
        Script.removeAllInstancesOf(byteArray, byteArray2);
    }

    //Sapient generated method id: ${767e4e99-2879-3710-893a-108556d1cc56}
    @Ignore()
    @Test()
    public void removeAllInstancesOfWhenOpcodeEqualsOP_PUSHDATA4AndSkipIsEmpty() throws IOException {
        /* Branches:
         * (cursor < inputScript.length) : true
         * (start + b.length > a.length) : true  #  inside equalsRange method
         * (opcode >= 0) : true
         * (opcode < OP_PUSHDATA1) : false
         * (opcode == OP_PUSHDATA1) : false
         * (opcode == OP_PUSHDATA2) : false
         * (opcode == OP_PUSHDATA4) : true
         * (!skip) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            byteUtils.when(() -> ByteUtils.readUint32(byteArray, 1)).thenReturn(0L);
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1};
            //Act Statement(s)
            byte[] result = Script.removeAllInstancesOf(byteArray, byteArray2);
            byte[] byteResultArray = new byte[]{};
            //Assert statement(s)
            assertThat(result, equalTo(byteResultArray));
            byteUtils.verify(() -> ByteUtils.readUint32(byteArray, 1), atLeast(1));
        }
    }

    //Sapient generated method id: ${dc00ddc6-ca47-3486-8d53-5f65d814ed7a}
    @Ignore()
    @Test()
    public void removeAllInstancesOfWhenOpcodeNotEqualsOP_PUSHDATA4AndSkipIsEmpty() throws IOException {
        /* Branches:
         * (cursor < inputScript.length) : true
         * (start + b.length > a.length) : false  #  inside equalsRange method
         * (i < b.length) : true  #  inside equalsRange method
         * (a[i + start] != b[i]) : true  #  inside equalsRange method
         * (opcode >= 0) : false
         * (opcode == OP_PUSHDATA1) : false
         * (opcode == OP_PUSHDATA2) : false
         * (opcode == OP_PUSHDATA4) : false
         * (!skip) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) -1};
        byte[] byteArray2 = new byte[]{(byte) 0};
        //Act Statement(s)
        byte[] result = Script.removeAllInstancesOf(byteArray, byteArray2);
        byte[] byteResultArray = new byte[]{};
        //Assert statement(s)
        assertThat(result, equalTo(byteResultArray));
    }

    //Sapient generated method id: ${fd786d48-7a0b-3594-8fc4-b6092c4f4d16}
    @Test()
    public void removeAllInstancesOfWhenOpcodeNotEqualsOP_PUSHDATA4AndSkip() throws IOException {
        /* Branches:
         * (cursor < inputScript.length) : true
         * (start + b.length > a.length) : false  #  inside equalsRange method
         * (i < b.length) : true  #  inside equalsRange method
         * (a[i + start] != b[i]) : false  #  inside equalsRange method
         * (opcode >= 0) : false
         * (opcode == OP_PUSHDATA1) : false
         * (opcode == OP_PUSHDATA2) : false
         * (opcode == OP_PUSHDATA4) : false
         * (!skip) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) -1};
        byte[] byteArray2 = new byte[]{(byte) -1};
        //Act Statement(s)
        byte[] result = Script.removeAllInstancesOf(byteArray, byteArray2);
        byte[] byteResultArray = new byte[]{};
        //Assert statement(s)
        assertThat(result, equalTo(byteResultArray));
    }

    //Sapient generated method id: ${251486ef-6d8b-39bd-a22d-32eced7474d7}
    @Ignore()
    @Test()
    public void removeAllInstancesOfWhenOpcodeNotEqualsOP_PUSHDATA4AndSkipIsEmptyAndCaughtIOExceptionThrowsRuntimeException() throws IOException {
        /* Branches:
         * (cursor < inputScript.length) : true
         * (start + b.length > a.length) : false  #  inside equalsRange method
         * (i < b.length) : true  #  inside equalsRange method
         * (a[i + start] != b[i]) : true  #  inside equalsRange method
         * (opcode >= 0) : false
         * (opcode == OP_PUSHDATA1) : false
         * (opcode == OP_PUSHDATA2) : false
         * (opcode == OP_PUSHDATA4) : false
         * (!skip) : true
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        thrown.expect(RuntimeException.class);
        thrown.expectCause(is(instanceOf(IOException.class)));
        byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 3, (byte) 4, (byte) 6, (byte) 7};
        byte[] byteArray2 = new byte[]{(byte) 3, (byte) 4};
        //Act Statement(s)
        Script.removeAllInstancesOf(byteArray, byteArray2);
    }

    //Sapient generated method id: ${27ece1d8-7279-370d-8e3a-a2ee6061d884}
    @Test()
    public void removeAllInstancesOfOpTest() throws IOException {
        //Arrange Statement(s)
        try (MockedStatic<Script> script = mockStatic(Script.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{};
            byte[] byteArray3 = new byte[]{(byte) 1};
            script.when(() -> Script.removeAllInstancesOf(byteArray2, byteArray3)).thenReturn(byteArray);
            //Act Statement(s)
            byte[] result = Script.removeAllInstancesOfOp(byteArray2, 1);
            //Assert statement(s)
            assertThat(result, equalTo(byteArray));
            script.verify(() -> Script.removeAllInstancesOf(byteArray2, byteArray3), atLeast(1));
        }
    }

    //Sapient generated method id: ${4070f01a-a5eb-371d-806d-89fab1a50679}
    @Test()
    public void castToBigInteger1WhenChunkLengthGreaterThanMaxLengthThrowsScriptException() throws ScriptException {
        /* Branches:
         * (chunk.length > maxLength) : true
         */
        //Arrange Statement(s)
        thrown.expect(ScriptException.class);
        byte[] byteArray = new byte[]{(byte) 0};
        //Act Statement(s)
        Script.castToBigInteger(byteArray, 0, false);
    }

    //Sapient generated method id: ${f3456604-5e24-3b28-a194-1e6e1e3aef5c}
    @Ignore()
    @Test()
    public void castToBigInteger1WhenChunkLengthMinus2IndexOfChunkAnd128Equals0ThrowsScriptException() throws ScriptException {
        /* Branches:
         * (chunk.length > maxLength) : false
         * (requireMinimal) : true
         * (chunk.length > 0) : true
         * ((chunk[chunk.length - 1] & 0x7f) == 0) : true
         * (chunk.length <= 1) : false
         * ((chunk[chunk.length - 2] & 0x80) == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        thrown.expect(ScriptException.class);
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1};
        //Act Statement(s)
        Script.castToBigInteger(byteArray, 2, true);
    }

    //Sapient generated method id: ${f70d2eb6-c018-3352-9aa6-d0a803f76ba9}
    @Test()
    public void castToBigInteger1WhenChunkLengthMinus2IndexOfChunkAnd128NotEquals0() throws ScriptException {
        /* Branches:
         * (chunk.length > maxLength) : false
         * (requireMinimal) : true
         * (chunk.length > 0) : true
         * ((chunk[chunk.length - 1] & 0x7f) == 0) : true
         * (chunk.length <= 1) : false
         * ((chunk[chunk.length - 2] & 0x80) == 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1};
            byteUtils.when(() -> ByteUtils.reverseBytes(byteArray2)).thenReturn(byteArray);
            //Act Statement(s)
            BigInteger result = Script.castToBigInteger(byteArray2, 2, true);
            //Assert statement(s)
            assertThat(result, equalTo(new BigInteger("0")));
            byteUtils.verify(() -> ByteUtils.reverseBytes(byteArray2), atLeast(1));
        }
    }

    //Sapient generated method id: ${275bb89f-caa8-3344-a60a-fe2eac5b20b2}
    @Ignore()
    @Test()
    public void executeScriptWhenOpcodeEqualsOP_RSHIFTThrowsScriptException() throws ScriptException {
        /* Branches:
         * (for-each(script.chunks)) : true
         * (!ifStack.contains(false)) : true
         * (chunk.data != null) : false
         * (opcode > OP_16) : true
         * (opCount > MAX_OPS_PER_SCRIPT) : false
         * (opcode == OP_CAT) : false
         * (opcode == OP_SUBSTR) : false
         * (opcode == OP_LEFT) : false
         * (opcode == OP_RIGHT) : false
         * (opcode == OP_INVERT) : false
         * (opcode == OP_AND) : false
         * (opcode == OP_OR) : false
         * (opcode == OP_XOR) : false
         * (opcode == OP_2MUL) : false
         * (opcode == OP_2DIV) : false
         * (opcode == OP_MUL) : false
         * (opcode == OP_DIV) : false
         * (opcode == OP_MOD) : false
         * (opcode == OP_LSHIFT) : false
         * (opcode == OP_RSHIFT) : true
         */
        //Arrange Statement(s)
        doReturn(1).when(chunkMock).size();
        thrown.expect(ScriptException.class);
        List list = new ArrayList<>();
        list.add(chunkMock);
        Script script = Script.of(list);
        LinkedList<byte[]> byteList = new LinkedList<>();
        Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
        //Act Statement(s)
        Script.executeScript(transactionMock, 0L, script, byteList, scriptVerifyFlagSet);
        //Assert statement(s)
        verify(chunkMock).size();
    }

    //Sapient generated method id: ${afc61e45-6cfa-3885-adf7-6a10f906f502}
    @Ignore()
    @Test()
    public void executeScriptWhenSwitchOpcodeCaseOP_RETURNThrowsScriptException() throws ScriptException {
        /* Branches:
         * (for-each(script.chunks)) : true
         * (!ifStack.contains(false)) : true
         * (chunk.data != null) : false
         * (opcode > OP_16) : true
         * (opCount > MAX_OPS_PER_SCRIPT) : false
         * (opcode == OP_CAT) : false
         * (opcode == OP_SUBSTR) : false
         * (opcode == OP_LEFT) : false
         * (opcode == OP_RIGHT) : false
         * (opcode == OP_INVERT) : false
         * (opcode == OP_AND) : false
         * (opcode == OP_OR) : false
         * (opcode == OP_XOR) : false
         * (opcode == OP_2MUL) : false
         * (opcode == OP_2DIV) : false
         * (opcode == OP_MUL) : false
         * (opcode == OP_DIV) : false
         * (opcode == OP_MOD) : false
         * (opcode == OP_LSHIFT) : false
         * (opcode == OP_RSHIFT) : false
         * (shouldExecute) : true
         * (OP_0 <= opcode) : true
         * (opcode <= OP_PUSHDATA4) : false
         * (shouldExecute) : true
         * (switch(opcode) = OP_RETURN) : true
         */
        //Arrange Statement(s)
        doReturn(1).when(chunkMock).size();
        thrown.expect(ScriptException.class);
        List list = new ArrayList<>();
        list.add(chunkMock);
        Script script = Script.of(list);
        LinkedList<byte[]> byteList = new LinkedList<>();
        Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
        //Act Statement(s)
        Script.executeScript(transactionMock, 0L, script, byteList, scriptVerifyFlagSet);
        //Assert statement(s)
        verify(chunkMock).size();
    }

    //Sapient generated method id: ${df6d4581-535d-3be2-b97b-46b1888ba8d2}
    @Ignore()
    @Test()
    public void executeScriptWhenIfStackIsEmptyThrowsScriptException() throws ScriptException {
        /* Branches:
         * (for-each(script.chunks)) : true
         * (!ifStack.contains(false)) : true
         * (chunk.data != null) : false
         * (opcode > OP_16) : true
         * (opCount > MAX_OPS_PER_SCRIPT) : false
         * (opcode == OP_CAT) : false
         * (opcode == OP_SUBSTR) : false
         * (opcode == OP_LEFT) : false
         * (opcode == OP_RIGHT) : false
         * (opcode == OP_INVERT) : false
         * (opcode == OP_AND) : false
         * (opcode == OP_OR) : false
         * (opcode == OP_XOR) : false
         * (opcode == OP_2MUL) : false
         * (opcode == OP_2DIV) : false
         * (opcode == OP_MUL) : false
         * (opcode == OP_DIV) : false
         * (opcode == OP_MOD) : false
         * (opcode == OP_LSHIFT) : false
         * (opcode == OP_RSHIFT) : false
         * (shouldExecute) : true
         * (OP_0 <= opcode) : true
         * (opcode <= OP_PUSHDATA4) : false
         * (shouldExecute) : true
         * (switch(opcode) = OP_1 or switch(opcode) = OP_2 or switch(opcode) = OP_3 or switch(opcode) = OP_4 or switch(opcode) = OP_5 or switch(opcode) = OP_6 or switch(opcode) = OP_7 or switch(opcode) = OP_8 or switch(opcode) = OP_9 or switch(opcode) = OP_10 or switch(opcode) = OP_11 or switch(opcode) = OP_12 or switch(opcode) = OP_13 or switch(opcode) = OP_14 or switch(opcode) = OP_15 or switch(opcode) = OP_16) : true
         * (ifStack.isEmpty()) : true
         */
        //Arrange Statement(s)
        doReturn(1).when(chunkMock).size();
        thrown.expect(ScriptException.class);
        List list = new ArrayList<>();
        list.add(chunkMock);
        Script script = Script.of(list);
        LinkedList<byte[]> byteList = new LinkedList<>();
        Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
        //Act Statement(s)
        Script.executeScript(transactionMock, 0L, script, byteList, scriptVerifyFlagSet);
        //Assert statement(s)
        verify(chunkMock).size();
    }

    //Sapient generated method id: ${dcb2ba22-9860-3083-a91e-a6a99d0f9a62}
    @Ignore()
    @Test()
    public void executeScriptWhenStackSizeLessThan2ThrowsScriptException() throws ScriptException {
        /* Branches:
         * (for-each(script.chunks)) : true
         * (!ifStack.contains(false)) : true
         * (chunk.data != null) : false
         * (opcode > OP_16) : true
         * (opCount > MAX_OPS_PER_SCRIPT) : false
         * (opcode == OP_CAT) : false
         * (opcode == OP_SUBSTR) : false
         * (opcode == OP_LEFT) : false
         * (opcode == OP_RIGHT) : false
         * (opcode == OP_INVERT) : false
         * (opcode == OP_AND) : false
         * (opcode == OP_OR) : false
         * (opcode == OP_XOR) : false
         * (opcode == OP_2MUL) : false
         * (opcode == OP_2DIV) : false
         * (opcode == OP_MUL) : false
         * (opcode == OP_DIV) : false
         * (opcode == OP_MOD) : false
         * (opcode == OP_LSHIFT) : false
         * (opcode == OP_RSHIFT) : false
         * (shouldExecute) : true
         * (OP_0 <= opcode) : true
         * (opcode <= OP_PUSHDATA4) : false
         * (shouldExecute) : true
         * (switch(opcode) = OP_2DROP) : true
         * (stack.size() < 2) : true
         */
        //Arrange Statement(s)
        doReturn(1).when(chunkMock).size();
        thrown.expect(ScriptException.class);
        List list = new ArrayList<>();
        list.add(chunkMock);
        Script script = Script.of(list);
        LinkedList<byte[]> byteList = new LinkedList<>();
        Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
        //Act Statement(s)
        Script.executeScript(transactionMock, 0L, script, byteList, scriptVerifyFlagSet);
        //Assert statement(s)
        verify(chunkMock).size();
    }

    //Sapient generated method id: ${04e72f68-64e3-315e-b7b9-16d4e1a79527}
    @Ignore()
    @Test()
    public void executeScriptWhenSwitchOpcodeCaseOP_2DUPAndStackSizeLessThan2ThrowsScriptException() throws ScriptException {
        /* Branches:
         * (for-each(script.chunks)) : true
         * (!ifStack.contains(false)) : true
         * (chunk.data != null) : false
         * (opcode > OP_16) : true
         * (opCount > MAX_OPS_PER_SCRIPT) : false
         * (opcode == OP_CAT) : false
         * (opcode == OP_SUBSTR) : false
         * (opcode == OP_LEFT) : false
         * (opcode == OP_RIGHT) : false
         * (opcode == OP_INVERT) : false
         * (opcode == OP_AND) : false
         * (opcode == OP_OR) : false
         * (opcode == OP_XOR) : false
         * (opcode == OP_2MUL) : false
         * (opcode == OP_2DIV) : false
         * (opcode == OP_MUL) : false
         * (opcode == OP_DIV) : false
         * (opcode == OP_MOD) : false
         * (opcode == OP_LSHIFT) : false
         * (opcode == OP_RSHIFT) : false
         * (shouldExecute) : true
         * (OP_0 <= opcode) : true
         * (opcode <= OP_PUSHDATA4) : false
         * (shouldExecute) : true
         * (switch(opcode) = OP_2DUP) : true
         * (stack.size() < 2) : true
         */
        //Arrange Statement(s)
        doReturn(1).when(chunkMock).size();
        thrown.expect(ScriptException.class);
        List list = new ArrayList<>();
        list.add(chunkMock);
        Script script = Script.of(list);
        LinkedList<byte[]> byteList = new LinkedList<>();
        Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
        //Act Statement(s)
        Script.executeScript(transactionMock, 0L, script, byteList, scriptVerifyFlagSet);
        //Assert statement(s)
        verify(chunkMock).size();
    }

    //Sapient generated method id: ${12ce1d91-e426-3c1c-aaef-ab6bbe7b1efd}
    @Ignore()
    @Test()
    public void executeScriptWhenStackSizeLessThan4ThrowsScriptException() throws ScriptException {
        /* Branches:
         * (for-each(script.chunks)) : true
         * (!ifStack.contains(false)) : true
         * (chunk.data != null) : false
         * (opcode > OP_16) : true
         * (opCount > MAX_OPS_PER_SCRIPT) : false
         * (opcode == OP_CAT) : false
         * (opcode == OP_SUBSTR) : false
         * (opcode == OP_LEFT) : false
         * (opcode == OP_RIGHT) : false
         * (opcode == OP_INVERT) : false
         * (opcode == OP_AND) : false
         * (opcode == OP_OR) : false
         * (opcode == OP_XOR) : false
         * (opcode == OP_2MUL) : false
         * (opcode == OP_2DIV) : false
         * (opcode == OP_MUL) : false
         * (opcode == OP_DIV) : false
         * (opcode == OP_MOD) : false
         * (opcode == OP_LSHIFT) : false
         * (opcode == OP_RSHIFT) : false
         * (shouldExecute) : true
         * (OP_0 <= opcode) : true
         * (opcode <= OP_PUSHDATA4) : false
         * (shouldExecute) : true
         * (switch(opcode) = OP_2OVER) : true
         * (stack.size() < 4) : true
         */
        //Arrange Statement(s)
        doReturn(1).when(chunkMock).size();
        thrown.expect(ScriptException.class);
        List list = new ArrayList<>();
        list.add(chunkMock);
        Script script = Script.of(list);
        LinkedList<byte[]> byteList = new LinkedList<>();
        Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
        //Act Statement(s)
        Script.executeScript(transactionMock, 0L, script, byteList, scriptVerifyFlagSet);
        //Assert statement(s)
        verify(chunkMock).size();
    }

    //Sapient generated method id: ${467f4667-191a-3a63-b6d2-be30d5402b76}
    @Ignore()
    @Test()
    public void executeScriptWhenStackSizeLessThan6ThrowsScriptException() throws ScriptException {
        /* Branches:
         * (for-each(script.chunks)) : true
         * (!ifStack.contains(false)) : true
         * (chunk.data != null) : false
         * (opcode > OP_16) : true
         * (opCount > MAX_OPS_PER_SCRIPT) : false
         * (opcode == OP_CAT) : false
         * (opcode == OP_SUBSTR) : false
         * (opcode == OP_LEFT) : false
         * (opcode == OP_RIGHT) : false
         * (opcode == OP_INVERT) : false
         * (opcode == OP_AND) : false
         * (opcode == OP_OR) : false
         * (opcode == OP_XOR) : false
         * (opcode == OP_2MUL) : false
         * (opcode == OP_2DIV) : false
         * (opcode == OP_MUL) : false
         * (opcode == OP_DIV) : false
         * (opcode == OP_MOD) : false
         * (opcode == OP_LSHIFT) : false
         * (opcode == OP_RSHIFT) : false
         * (shouldExecute) : true
         * (OP_0 <= opcode) : true
         * (opcode <= OP_PUSHDATA4) : false
         * (shouldExecute) : true
         * (switch(opcode) = OP_2ROT) : true
         * (stack.size() < 6) : true
         */
        //Arrange Statement(s)
        doReturn(1).when(chunkMock).size();
        thrown.expect(ScriptException.class);
        List list = new ArrayList<>();
        list.add(chunkMock);
        Script script = Script.of(list);
        LinkedList<byte[]> byteList = new LinkedList<>();
        Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
        //Act Statement(s)
        Script.executeScript(transactionMock, 0L, script, byteList, scriptVerifyFlagSet);
        //Assert statement(s)
        verify(chunkMock).size();
    }

    //Sapient generated method id: ${1a3e0781-f170-318d-b5ba-129ef042641e}
    @Ignore()
    @Test()
    public void executeScriptWhenStackSizeLessThan3ThrowsScriptException() throws ScriptException {
        /* Branches:
         * (for-each(script.chunks)) : true
         * (!ifStack.contains(false)) : true
         * (chunk.data != null) : false
         * (opcode > OP_16) : true
         * (opCount > MAX_OPS_PER_SCRIPT) : false
         * (opcode == OP_CAT) : false
         * (opcode == OP_SUBSTR) : false
         * (opcode == OP_LEFT) : false
         * (opcode == OP_RIGHT) : false
         * (opcode == OP_INVERT) : false
         * (opcode == OP_AND) : false
         * (opcode == OP_OR) : false
         * (opcode == OP_XOR) : false
         * (opcode == OP_2MUL) : false
         * (opcode == OP_2DIV) : false
         * (opcode == OP_MUL) : false
         * (opcode == OP_DIV) : false
         * (opcode == OP_MOD) : false
         * (opcode == OP_LSHIFT) : false
         * (opcode == OP_RSHIFT) : false
         * (shouldExecute) : true
         * (OP_0 <= opcode) : true
         * (opcode <= OP_PUSHDATA4) : false
         * (shouldExecute) : true
         * (switch(opcode) = OP_3DUP) : true
         * (stack.size() < 3) : true
         */
        //Arrange Statement(s)
        doReturn(1).when(chunkMock).size();
        thrown.expect(ScriptException.class);
        List list = new ArrayList<>();
        list.add(chunkMock);
        Script script = Script.of(list);
        LinkedList<byte[]> byteList = new LinkedList<>();
        Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
        //Act Statement(s)
        Script.executeScript(transactionMock, 0L, script, byteList, scriptVerifyFlagSet);
        //Assert statement(s)
        verify(chunkMock).size();
    }

    //Sapient generated method id: ${adefb7fa-adfd-3952-b2d5-33cda09f4372}
    @Ignore()
    @Test()
    public void executeScriptWhenAltstackSizeLessThan1ThrowsScriptException() throws ScriptException {
        /* Branches:
         * (for-each(script.chunks)) : true
         * (!ifStack.contains(false)) : true
         * (chunk.data != null) : false
         * (opcode > OP_16) : true
         * (opCount > MAX_OPS_PER_SCRIPT) : false
         * (opcode == OP_CAT) : false
         * (opcode == OP_SUBSTR) : false
         * (opcode == OP_LEFT) : false
         * (opcode == OP_RIGHT) : false
         * (opcode == OP_INVERT) : false
         * (opcode == OP_AND) : false
         * (opcode == OP_OR) : false
         * (opcode == OP_XOR) : false
         * (opcode == OP_2MUL) : false
         * (opcode == OP_2DIV) : false
         * (opcode == OP_MUL) : false
         * (opcode == OP_DIV) : false
         * (opcode == OP_MOD) : false
         * (opcode == OP_LSHIFT) : false
         * (opcode == OP_RSHIFT) : false
         * (shouldExecute) : true
         * (OP_0 <= opcode) : true
         * (opcode <= OP_PUSHDATA4) : false
         * (shouldExecute) : true
         * (switch(opcode) = OP_FROMALTSTACK) : true
         * (altstack.size() < 1) : true
         */
        //Arrange Statement(s)
        doReturn(1).when(chunkMock).size();
        thrown.expect(ScriptException.class);
        List list = new ArrayList<>();
        list.add(chunkMock);
        Script script = Script.of(list);
        LinkedList<byte[]> byteList = new LinkedList<>();
        Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
        //Act Statement(s)
        Script.executeScript(transactionMock, 0L, script, byteList, scriptVerifyFlagSet);
        //Assert statement(s)
        verify(chunkMock).size();
    }

    //Sapient generated method id: ${9f62b1ec-1b6a-38f6-85e3-258e84ebb633}
    @Ignore()
    @Test()
    public void executeScriptWhenSwitchOpcodeCaseOP_NOPAndIfStackIsEmptyThrowsScriptException() throws ScriptException {
        /* Branches:
         * (for-each(script.chunks)) : true
         * (!ifStack.contains(false)) : true
         * (chunk.data != null) : false
         * (opcode > OP_16) : true
         * (opCount > MAX_OPS_PER_SCRIPT) : false
         * (opcode == OP_CAT) : false
         * (opcode == OP_SUBSTR) : false
         * (opcode == OP_LEFT) : false
         * (opcode == OP_RIGHT) : false
         * (opcode == OP_INVERT) : false
         * (opcode == OP_AND) : false
         * (opcode == OP_OR) : false
         * (opcode == OP_XOR) : false
         * (opcode == OP_2MUL) : false
         * (opcode == OP_2DIV) : false
         * (opcode == OP_MUL) : false
         * (opcode == OP_DIV) : false
         * (opcode == OP_MOD) : false
         * (opcode == OP_LSHIFT) : false
         * (opcode == OP_RSHIFT) : false
         * (shouldExecute) : true
         * (OP_0 <= opcode) : true
         * (opcode <= OP_PUSHDATA4) : false
         * (shouldExecute) : true
         * (switch(opcode) = OP_NOP) : true
         * (ifStack.isEmpty()) : true
         */
        //Arrange Statement(s)
        doReturn(1).when(chunkMock).size();
        thrown.expect(ScriptException.class);
        List list = new ArrayList<>();
        list.add(chunkMock);
        Script script = Script.of(list);
        LinkedList<byte[]> byteList = new LinkedList<>();
        Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
        //Act Statement(s)
        Script.executeScript(transactionMock, 0L, script, byteList, scriptVerifyFlagSet);
        //Assert statement(s)
        verify(chunkMock).size();
    }

    //Sapient generated method id: ${7345c63f-9c86-328d-84b2-8f6fea08459d}
    @Ignore()
    @Test()
    public void executeScriptWhenStackSizeLessThan1ThrowsScriptException() throws ScriptException {
        /* Branches:
         * (for-each(script.chunks)) : true
         * (!ifStack.contains(false)) : true
         * (chunk.data != null) : false
         * (opcode > OP_16) : true
         * (opCount > MAX_OPS_PER_SCRIPT) : false
         * (opcode == OP_CAT) : false
         * (opcode == OP_SUBSTR) : false
         * (opcode == OP_LEFT) : false
         * (opcode == OP_RIGHT) : false
         * (opcode == OP_INVERT) : false
         * (opcode == OP_AND) : false
         * (opcode == OP_OR) : false
         * (opcode == OP_XOR) : false
         * (opcode == OP_2MUL) : false
         * (opcode == OP_2DIV) : false
         * (opcode == OP_MUL) : false
         * (opcode == OP_DIV) : false
         * (opcode == OP_MOD) : false
         * (opcode == OP_LSHIFT) : false
         * (opcode == OP_RSHIFT) : false
         * (shouldExecute) : true
         * (OP_0 <= opcode) : true
         * (opcode <= OP_PUSHDATA4) : false
         * (shouldExecute) : true
         * (switch(opcode) = OP_TOALTSTACK) : true
         * (stack.size() < 1) : true
         */
        //Arrange Statement(s)
        doReturn(1).when(chunkMock).size();
        thrown.expect(ScriptException.class);
        List list = new ArrayList<>();
        list.add(chunkMock);
        Script script = Script.of(list);
        LinkedList<byte[]> byteList = new LinkedList<>();
        Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
        //Act Statement(s)
        Script.executeScript(transactionMock, 0L, script, byteList, scriptVerifyFlagSet);
        //Assert statement(s)
        verify(chunkMock).size();
    }

    //Sapient generated method id: ${323d254d-ce69-360b-94e8-11aed03fa29b}
    @Ignore()
    @Test()
    public void executeScriptWhenSwitchOpcodeCaseOP_VERIFYAndStackSizeLessThan1ThrowsScriptException() throws ScriptException {
        /* Branches:
         * (for-each(script.chunks)) : true
         * (!ifStack.contains(false)) : true
         * (chunk.data != null) : false
         * (opcode > OP_16) : true
         * (opCount > MAX_OPS_PER_SCRIPT) : false
         * (opcode == OP_CAT) : false
         * (opcode == OP_SUBSTR) : false
         * (opcode == OP_LEFT) : false
         * (opcode == OP_RIGHT) : false
         * (opcode == OP_INVERT) : false
         * (opcode == OP_AND) : false
         * (opcode == OP_OR) : false
         * (opcode == OP_XOR) : false
         * (opcode == OP_2MUL) : false
         * (opcode == OP_2DIV) : false
         * (opcode == OP_MUL) : false
         * (opcode == OP_DIV) : false
         * (opcode == OP_MOD) : false
         * (opcode == OP_LSHIFT) : false
         * (opcode == OP_RSHIFT) : false
         * (shouldExecute) : true
         * (OP_0 <= opcode) : true
         * (opcode <= OP_PUSHDATA4) : false
         * (shouldExecute) : true
         * (switch(opcode) = OP_VERIFY) : true
         * (stack.size() < 1) : true
         */
        //Arrange Statement(s)
        doReturn(1).when(chunkMock).size();
        thrown.expect(ScriptException.class);
        List list = new ArrayList<>();
        list.add(chunkMock);
        Script script = Script.of(list);
        LinkedList<byte[]> byteList = new LinkedList<>();
        Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
        //Act Statement(s)
        Script.executeScript(transactionMock, 0L, script, byteList, scriptVerifyFlagSet);
        //Assert statement(s)
        verify(chunkMock).size();
    }

    //Sapient generated method id: ${b202bb72-fb04-304f-b072-c00817e50596}
    @Ignore()
    @Test()
    public void executeScriptWhenShouldExecuteAndStackSizeLessThan1ThrowsScriptException() throws ScriptException {
        /* Branches:
         * (for-each(script.chunks)) : true
         * (!ifStack.contains(false)) : true
         * (chunk.data != null) : false
         * (opcode > OP_16) : true
         * (opCount > MAX_OPS_PER_SCRIPT) : false
         * (opcode == OP_CAT) : false
         * (opcode == OP_SUBSTR) : false
         * (opcode == OP_LEFT) : false
         * (opcode == OP_RIGHT) : false
         * (opcode == OP_INVERT) : false
         * (opcode == OP_AND) : false
         * (opcode == OP_OR) : false
         * (opcode == OP_XOR) : false
         * (opcode == OP_2MUL) : false
         * (opcode == OP_2DIV) : false
         * (opcode == OP_MUL) : false
         * (opcode == OP_DIV) : false
         * (opcode == OP_MOD) : false
         * (opcode == OP_LSHIFT) : false
         * (opcode == OP_RSHIFT) : false
         * (shouldExecute) : true
         * (OP_0 <= opcode) : true
         * (opcode <= OP_PUSHDATA4) : false
         * (shouldExecute) : true
         * (switch(opcode) = OP_1 or switch(opcode) = OP_2 or switch(opcode) = OP_3 or switch(opcode) = OP_4 or switch(opcode) = OP_5 or switch(opcode) = OP_6 or switch(opcode) = OP_7 or switch(opcode) = OP_8 or switch(opcode) = OP_9 or switch(opcode) = OP_10 or switch(opcode) = OP_11 or switch(opcode) = OP_12 or switch(opcode) = OP_13 or switch(opcode) = OP_14 or switch(opcode) = OP_15 or switch(opcode) = OP_16) : true
         * (!shouldExecute) : false
         * (stack.size() < 1) : true
         */
        //Arrange Statement(s)
        doReturn(1).when(chunkMock).size();
        thrown.expect(ScriptException.class);
        List list = new ArrayList<>();
        list.add(chunkMock);
        Script script = Script.of(list);
        LinkedList<byte[]> byteList = new LinkedList<>();
        Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
        //Act Statement(s)
        Script.executeScript(transactionMock, 0L, script, byteList, scriptVerifyFlagSet);
        //Assert statement(s)
        verify(chunkMock).size();
    }

    //Sapient generated method id: ${15846579-25e7-3c00-9953-e49cfbb40f4c}
    @Ignore()
    @Test()
    public void executeScriptWhenSwitchOpcodeCaseOP_1AndShouldExecuteAndStackSizeLessThan1ThrowsScriptException() throws ScriptException {
        /* Branches:
         * (for-each(script.chunks)) : true
         * (!ifStack.contains(false)) : true
         * (chunk.data != null) : false
         * (opcode > OP_16) : true
         * (opCount > MAX_OPS_PER_SCRIPT) : false
         * (opcode == OP_CAT) : false
         * (opcode == OP_SUBSTR) : false
         * (opcode == OP_LEFT) : false
         * (opcode == OP_RIGHT) : false
         * (opcode == OP_INVERT) : false
         * (opcode == OP_AND) : false
         * (opcode == OP_OR) : false
         * (opcode == OP_XOR) : false
         * (opcode == OP_2MUL) : false
         * (opcode == OP_2DIV) : false
         * (opcode == OP_MUL) : false
         * (opcode == OP_DIV) : false
         * (opcode == OP_MOD) : false
         * (opcode == OP_LSHIFT) : false
         * (opcode == OP_RSHIFT) : false
         * (shouldExecute) : true
         * (OP_0 <= opcode) : true
         * (opcode <= OP_PUSHDATA4) : false
         * (shouldExecute) : true
         * (switch(opcode) = OP_1 or switch(opcode) = OP_2 or switch(opcode) = OP_3 or switch(opcode) = OP_4 or switch(opcode) = OP_5 or switch(opcode) = OP_6 or switch(opcode) = OP_7 or switch(opcode) = OP_8 or switch(opcode) = OP_9 or switch(opcode) = OP_10 or switch(opcode) = OP_11 or switch(opcode) = OP_12 or switch(opcode) = OP_13 or switch(opcode) = OP_14 or switch(opcode) = OP_15 or switch(opcode) = OP_16) : true
         * (!shouldExecute) : false
         * (stack.size() < 1) : true
         */
        //Arrange Statement(s)
        doReturn(1).when(chunkMock).size();
        thrown.expect(ScriptException.class);
        List list = new ArrayList<>();
        list.add(chunkMock);
        Script script = Script.of(list);
        LinkedList<byte[]> byteList = new LinkedList<>();
        Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
        //Act Statement(s)
        Script.executeScript(transactionMock, 0L, script, byteList, scriptVerifyFlagSet);
        //Assert statement(s)
        verify(chunkMock).size();
    }

    //Sapient generated method id: ${e71d306b-b7f9-32b1-8f09-97d7c4c6c45c}
    @Ignore()
    @Test()
    public void executeScriptWhenStackSizePlusAltstackSizeLessThan0ThrowsScriptException() throws ScriptException {
        /* Branches:
         * (for-each(script.chunks)) : true
         * (!ifStack.contains(false)) : true
         * (chunk.data != null) : false
         * (opcode > OP_16) : true
         * (opCount > MAX_OPS_PER_SCRIPT) : false
         * (opcode == OP_CAT) : false
         * (opcode == OP_SUBSTR) : false
         * (opcode == OP_LEFT) : false
         * (opcode == OP_RIGHT) : false
         * (opcode == OP_INVERT) : false
         * (opcode == OP_AND) : false
         * (opcode == OP_OR) : false
         * (opcode == OP_XOR) : false
         * (opcode == OP_2MUL) : false
         * (opcode == OP_2DIV) : false
         * (opcode == OP_MUL) : false
         * (opcode == OP_DIV) : false
         * (opcode == OP_MOD) : false
         * (opcode == OP_LSHIFT) : false
         * (opcode == OP_RSHIFT) : false
         * (shouldExecute) : true
         * (OP_0 <= opcode) : true
         * (opcode <= OP_PUSHDATA4) : false
         * (shouldExecute) : true
         * (switch(opcode) = OP_1 or switch(opcode) = OP_2 or switch(opcode) = OP_3 or switch(opcode) = OP_4 or switch(opcode) = OP_5 or switch(opcode) = OP_6 or switch(opcode) = OP_7 or switch(opcode) = OP_8 or switch(opcode) = OP_9 or switch(opcode) = OP_10 or switch(opcode) = OP_11 or switch(opcode) = OP_12 or switch(opcode) = OP_13 or switch(opcode) = OP_14 or switch(opcode) = OP_15 or switch(opcode) = OP_16) : true
         * (stack.size() + altstack.size() > MAX_STACK_SIZE) : false
         * (stack.size() + altstack.size() < 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        thrown.expect(ScriptException.class);
        List list = new ArrayList<>();
        Script script = Script.of(list);
        LinkedList<byte[]> byteList = new LinkedList<>();
        Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
        //Act Statement(s)
        Script.executeScript(transactionMock, 0L, script, byteList, scriptVerifyFlagSet);
    }

    //Sapient generated method id: ${272947a1-318a-34a5-a7a6-44af4a10f96c}
    @Ignore()
    @Test()
    public void executeScriptWhenStackSizePlusAltstackSizeNotLessThan0AndIfStackIsEmpty() throws Exception {
        /* Branches:
         * (for-each(script.chunks)) : true
         * (!ifStack.contains(false)) : true
         * (chunk.data != null) : false
         * (opcode > OP_16) : true
         * (opCount > MAX_OPS_PER_SCRIPT) : false
         * (opcode == OP_CAT) : false
         * (opcode == OP_SUBSTR) : false
         * (opcode == OP_LEFT) : false
         * (opcode == OP_RIGHT) : false
         * (opcode == OP_INVERT) : false
         * (opcode == OP_AND) : false
         * (opcode == OP_OR) : false
         * (opcode == OP_XOR) : false
         * (opcode == OP_2MUL) : false
         * (opcode == OP_2DIV) : false
         * (opcode == OP_MUL) : false
         * (opcode == OP_DIV) : false
         * (opcode == OP_MOD) : false
         * (opcode == OP_LSHIFT) : false
         * (opcode == OP_RSHIFT) : false
         * (shouldExecute) : true
         * (OP_0 <= opcode) : true
         * (opcode <= OP_PUSHDATA4) : false
         * (shouldExecute) : true
         * (switch(opcode) = OP_2DROP) : true
         * (stack.size() < 2) : false
         * (stack.size() + altstack.size() > MAX_STACK_SIZE) : false
         * (stack.size() + altstack.size() < 0) : false
         * (!ifStack.isEmpty()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(1).when(chunkMock).size();
        List list = new ArrayList<>();
        list.add(chunkMock);
        Script script = Script.of(list);
        byte[] byteArray = new byte[]{};
        byte[] byteArray2 = new byte[]{};
        LinkedList<byte[]> byteList = new LinkedList<>();
        byteList.add(byteArray);
        byteList.add(byteArray2);
        Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
        //Act Statement(s)
        Script.executeScript(transactionMock, 0L, script, byteList, scriptVerifyFlagSet);
        //Assert statement(s)
        verify(chunkMock).size();
    }

    //Sapient generated method id: ${7e703d29-dadf-34e8-8c8b-d240cbc3421e}
    @Ignore()
    @Test()
    public void executeScriptWhenStackSizePlusAltstackSizeNotGreaterThanMAX_STACK_SIZEAndStackSizePlusAltstackSizeNotLessThan0AndIfStac() throws Exception {
        /* Branches:
         * (for-each(script.chunks)) : true
         * (!ifStack.contains(false)) : true
         * (chunk.data != null) : false
         * (opcode > OP_16) : true
         * (opCount > MAX_OPS_PER_SCRIPT) : false
         * (opcode == OP_CAT) : false
         * (opcode == OP_SUBSTR) : false
         * (opcode == OP_LEFT) : false
         * (opcode == OP_RIGHT) : false
         * (opcode == OP_INVERT) : false
         * (opcode == OP_AND) : false
         * (opcode == OP_OR) : false
         * (opcode == OP_XOR) : false
         * (opcode == OP_2MUL) : false
         * (opcode == OP_2DIV) : false
         * (opcode == OP_MUL) : false
         * (opcode == OP_DIV) : false
         * (opcode == OP_MOD) : false
         * (opcode == OP_LSHIFT) : false
         * (opcode == OP_RSHIFT) : false
         * (shouldExecute) : true
         * (OP_0 <= opcode) : true
         * (opcode <= OP_PUSHDATA4) : false
         * (shouldExecute) : true
         * (switch(opcode) = OP_2OVER) : true
         * (stack.size() < 4) : false
         * (stack.size() + altstack.size() > MAX_STACK_SIZE) : false
         * (stack.size() + altstack.size() < 0) : false
         * (!ifStack.isEmpty()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(1).when(chunkMock).size();
        List list = new ArrayList<>();
        list.add(chunkMock);
        Script script = Script.of(list);
        byte[] byteArray = new byte[]{};
        byte[] byteArray2 = new byte[]{};
        byte[] byteArray3 = new byte[]{};
        byte[] byteArray4 = new byte[]{};
        LinkedList<byte[]> byteList = new LinkedList<>();
        byteList.add(byteArray);
        byteList.add(byteArray2);
        byteList.add(byteArray3);
        byteList.add(byteArray4);
        Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
        //Act Statement(s)
        Script.executeScript(transactionMock, 0L, script, byteList, scriptVerifyFlagSet);
        byte[] byteArray5 = new byte[]{};
        byte[] byteArray6 = new byte[]{};
        LinkedList<byte[]> byteByteListList = new LinkedList<>();
        byteByteListList.add(byteArray);
        byteByteListList.add(byteArray2);
        byteByteListList.add(byteArray3);
        byteByteListList.add(byteArray4);
        byteByteListList.add(byteArray5);
        byteByteListList.add(byteArray6);
        //Assert statement(s)
        assertThat(byteList.size(), equalTo(byteByteListList.size()));
        assertThat(byteList, containsInRelativeOrder(byteByteListList.toArray()));
        verify(chunkMock).size();
    }

    //Sapient generated method id: ${9fde61e9-71d3-39fb-ac2b-5b7a4673036a}
    @Ignore()
    @Test()
    public void executeScriptWhenStackSizePlusAltstackSizeNotLessThan0AndIfStackIsEmpty2() throws Exception {
        /* Branches:
         * (for-each(script.chunks)) : true
         * (!ifStack.contains(false)) : true
         * (chunk.data != null) : false
         * (opcode > OP_16) : true
         * (opCount > MAX_OPS_PER_SCRIPT) : false
         * (opcode == OP_CAT) : false
         * (opcode == OP_SUBSTR) : false
         * (opcode == OP_LEFT) : false
         * (opcode == OP_RIGHT) : false
         * (opcode == OP_INVERT) : false
         * (opcode == OP_AND) : false
         * (opcode == OP_OR) : false
         * (opcode == OP_XOR) : false
         * (opcode == OP_2MUL) : false
         * (opcode == OP_2DIV) : false
         * (opcode == OP_MUL) : false
         * (opcode == OP_DIV) : false
         * (opcode == OP_MOD) : false
         * (opcode == OP_LSHIFT) : false
         * (opcode == OP_RSHIFT) : false
         * (shouldExecute) : true
         * (OP_0 <= opcode) : true
         * (opcode <= OP_PUSHDATA4) : false
         * (shouldExecute) : true
         * (switch(opcode) = OP_3DUP) : true
         * (stack.size() < 3) : false
         * (stack.size() + altstack.size() > MAX_STACK_SIZE) : false
         * (stack.size() + altstack.size() < 0) : false
         * (!ifStack.isEmpty()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(1).when(chunkMock).size();
        List list = new ArrayList<>();
        list.add(chunkMock);
        Script script = Script.of(list);
        byte[] byteArray = new byte[]{};
        byte[] byteArray2 = new byte[]{};
        byte[] byteArray3 = new byte[]{};
        LinkedList<byte[]> byteList = new LinkedList<>();
        byteList.add(byteArray);
        byteList.add(byteArray2);
        byteList.add(byteArray3);
        Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
        //Act Statement(s)
        Script.executeScript(transactionMock, 0L, script, byteList, scriptVerifyFlagSet);
        byte[] byteArray4 = new byte[]{};
        byte[] byteArray5 = new byte[]{};
        byte[] byteArray6 = new byte[]{};
        LinkedList<byte[]> byteByteListList = new LinkedList<>();
        byteByteListList.add(byteArray);
        byteByteListList.add(byteArray2);
        byteByteListList.add(byteArray3);
        byteByteListList.add(byteArray4);
        byteByteListList.add(byteArray5);
        byteByteListList.add(byteArray6);
        //Assert statement(s)
        assertThat(byteList.size(), equalTo(byteByteListList.size()));
        assertThat(byteList, containsInRelativeOrder(byteByteListList.toArray()));
        verify(chunkMock).size();
    }

    //Sapient generated method id: ${27364871-59e5-3b1b-b5e9-f0df4fa0bd7d}
    @Ignore()
    @Test()
    public void executeScriptWhenStackSizePlusAltstackSizeNotLessThan0AndIfStackIsEmpty3() throws Exception {
        /* Branches:
         * (for-each(script.chunks)) : true
         * (!ifStack.contains(false)) : true
         * (chunk.data != null) : false
         * (opcode > OP_16) : true
         * (opCount > MAX_OPS_PER_SCRIPT) : false
         * (opcode == OP_CAT) : false
         * (opcode == OP_SUBSTR) : false
         * (opcode == OP_LEFT) : false
         * (opcode == OP_RIGHT) : false
         * (opcode == OP_INVERT) : false
         * (opcode == OP_AND) : false
         * (opcode == OP_OR) : false
         * (opcode == OP_XOR) : false
         * (opcode == OP_2MUL) : false
         * (opcode == OP_2DIV) : false
         * (opcode == OP_MUL) : false
         * (opcode == OP_DIV) : false
         * (opcode == OP_MOD) : false
         * (opcode == OP_LSHIFT) : false
         * (opcode == OP_RSHIFT) : false
         * (shouldExecute) : true
         * (OP_0 <= opcode) : true
         * (opcode <= OP_PUSHDATA4) : false
         * (shouldExecute) : true
         * (switch(opcode) = OP_TOALTSTACK) : true
         * (stack.size() < 1) : false
         * (stack.size() + altstack.size() > MAX_STACK_SIZE) : false
         * (stack.size() + altstack.size() < 0) : false
         * (!ifStack.isEmpty()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(1).when(chunkMock).size();
        List list = new ArrayList<>();
        list.add(chunkMock);
        Script script = Script.of(list);
        byte[] byteArray = new byte[]{};
        LinkedList<byte[]> byteList = new LinkedList<>();
        byteList.add(byteArray);
        Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
        //Act Statement(s)
        Script.executeScript(transactionMock, 0L, script, byteList, scriptVerifyFlagSet);
        //Assert statement(s)
        verify(chunkMock).size();
    }

    //Sapient generated method id: ${9effe6dd-840a-3f63-af80-eec306414d85}
    @Ignore()
    @Test()
    public void executeScriptWhenIIndexOfDataEquals0AndCastToBoolNotStackPollLastThrowsScriptException() throws ScriptException {
        /* Branches:
         * (for-each(script.chunks)) : true
         * (!ifStack.contains(false)) : true
         * (chunk.data != null) : false
         * (opcode > OP_16) : true
         * (opCount > MAX_OPS_PER_SCRIPT) : false
         * (opcode == OP_CAT) : false
         * (opcode == OP_SUBSTR) : false
         * (opcode == OP_LEFT) : false
         * (opcode == OP_RIGHT) : false
         * (opcode == OP_INVERT) : false
         * (opcode == OP_AND) : false
         * (opcode == OP_OR) : false
         * (opcode == OP_XOR) : false
         * (opcode == OP_2MUL) : false
         * (opcode == OP_2DIV) : false
         * (opcode == OP_MUL) : false
         * (opcode == OP_DIV) : false
         * (opcode == OP_MOD) : false
         * (opcode == OP_LSHIFT) : false
         * (opcode == OP_RSHIFT) : false
         * (shouldExecute) : true
         * (OP_0 <= opcode) : true
         * (opcode <= OP_PUSHDATA4) : false
         * (shouldExecute) : true
         * (switch(opcode) = OP_VERIFY) : true
         * (stack.size() < 1) : false
         * (i < data.length) : true  #  inside castToBool method
         * (data[i] != 0) : false  #  inside castToBool method
         * (!castToBool(stack.pollLast())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(0).when(chunkMock).size();
        thrown.expect(ScriptException.class);
        List list = new ArrayList<>();
        list.add(chunkMock);
        Script script = Script.of(list);
        byte[] byteArray = new byte[]{};
        LinkedList<byte[]> byteList = new LinkedList<>();
        byteList.add(byteArray);
        Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
        //Act Statement(s)
        Script.executeScript(transactionMock, 0L, script, byteList, scriptVerifyFlagSet);
        //Assert statement(s)
        verify(chunkMock).size();
    }

    //Sapient generated method id: ${38b34eaf-66c8-3cb4-86e1-650a271986f8}
    @Ignore()
    @Test()
    public void executeScriptWhenIIndexOfDataEquals0AndIfStackNotIsEmptyThrowsScriptException() throws ScriptException {
        /* Branches:
         * (for-each(script.chunks)) : true
         * (!ifStack.contains(false)) : true
         * (chunk.data != null) : false
         * (opcode > OP_16) : true
         * (opCount > MAX_OPS_PER_SCRIPT) : false
         * (opcode == OP_CAT) : false
         * (opcode == OP_SUBSTR) : false
         * (opcode == OP_LEFT) : false
         * (opcode == OP_RIGHT) : false
         * (opcode == OP_INVERT) : false
         * (opcode == OP_AND) : false
         * (opcode == OP_OR) : false
         * (opcode == OP_XOR) : false
         * (opcode == OP_2MUL) : false
         * (opcode == OP_2DIV) : false
         * (opcode == OP_MUL) : false
         * (opcode == OP_DIV) : false
         * (opcode == OP_MOD) : false
         * (opcode == OP_LSHIFT) : false
         * (opcode == OP_RSHIFT) : false
         * (shouldExecute) : true
         * (OP_0 <= opcode) : true
         * (opcode <= OP_PUSHDATA4) : false
         * (shouldExecute) : true
         * (switch(opcode) = OP_1 or switch(opcode) = OP_2 or switch(opcode) = OP_3 or switch(opcode) = OP_4 or switch(opcode) = OP_5 or switch(opcode) = OP_6 or switch(opcode) = OP_7 or switch(opcode) = OP_8 or switch(opcode) = OP_9 or switch(opcode) = OP_10 or switch(opcode) = OP_11 or switch(opcode) = OP_12 or switch(opcode) = OP_13 or switch(opcode) = OP_14 or switch(opcode) = OP_15 or switch(opcode) = OP_16) : true
         * (!shouldExecute) : false
         * (stack.size() < 1) : false
         * (i < data.length) : true  #  inside castToBool method
         * (data[i] != 0) : false  #  inside castToBool method
         * (!ifStack.isEmpty()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(0).when(chunkMock).size();
        thrown.expect(ScriptException.class);
        List list = new ArrayList<>();
        list.add(chunkMock);
        Script script = Script.of(list);
        byte[] byteArray = new byte[]{};
        LinkedList<byte[]> byteList = new LinkedList<>();
        byteList.add(byteArray);
        Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
        //Act Statement(s)
        Script.executeScript(transactionMock, 0L, script, byteList, scriptVerifyFlagSet);
        //Assert statement(s)
        verify(chunkMock).size();
    }

    //Sapient generated method id: ${2075f36e-8890-3407-8631-6f8b2bf738fd}
    @Ignore()
    @Test()
    public void executeScriptWhenIIndexOfDataEquals0AndCastToBoolNotStackPollLastAndIfStackNotIsEmptyThrowsScriptException() throws ScriptException {
        /* Branches:
         * (for-each(script.chunks)) : true
         * (!ifStack.contains(false)) : true
         * (chunk.data != null) : false
         * (opcode > OP_16) : true
         * (opCount > MAX_OPS_PER_SCRIPT) : false
         * (opcode == OP_CAT) : false
         * (opcode == OP_SUBSTR) : false
         * (opcode == OP_LEFT) : false
         * (opcode == OP_RIGHT) : false
         * (opcode == OP_INVERT) : false
         * (opcode == OP_AND) : false
         * (opcode == OP_OR) : false
         * (opcode == OP_XOR) : false
         * (opcode == OP_2MUL) : false
         * (opcode == OP_2DIV) : false
         * (opcode == OP_MUL) : false
         * (opcode == OP_DIV) : false
         * (opcode == OP_MOD) : false
         * (opcode == OP_LSHIFT) : false
         * (opcode == OP_RSHIFT) : false
         * (shouldExecute) : true
         * (OP_0 <= opcode) : true
         * (opcode <= OP_PUSHDATA4) : false
         * (shouldExecute) : true
         * (switch(opcode) = OP_1 or switch(opcode) = OP_2 or switch(opcode) = OP_3 or switch(opcode) = OP_4 or switch(opcode) = OP_5 or switch(opcode) = OP_6 or switch(opcode) = OP_7 or switch(opcode) = OP_8 or switch(opcode) = OP_9 or switch(opcode) = OP_10 or switch(opcode) = OP_11 or switch(opcode) = OP_12 or switch(opcode) = OP_13 or switch(opcode) = OP_14 or switch(opcode) = OP_15 or switch(opcode) = OP_16) : true
         * (!shouldExecute) : false
         * (stack.size() < 1) : false
         * (i < data.length) : true  #  inside castToBool method
         * (data[i] != 0) : false  #  inside castToBool method
         * (!castToBool(stack.pollLast())) : true
         * (!ifStack.isEmpty()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(0).when(chunkMock).size();
        thrown.expect(ScriptException.class);
        List list = new ArrayList<>();
        list.add(chunkMock);
        Script script = Script.of(list);
        byte[] byteArray = new byte[]{};
        LinkedList<byte[]> byteList = new LinkedList<>();
        byteList.add(byteArray);
        Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
        //Act Statement(s)
        Script.executeScript(transactionMock, 0L, script, byteList, scriptVerifyFlagSet);
        //Assert statement(s)
        verify(chunkMock).size();
    }

    //Sapient generated method id: ${b6562af7-e7c9-3b53-98d1-b412d9ff2b1c}
    @Ignore()
    @Test()
    public void executeScriptWhenIIndexOfDataAnd255Equals128AndCastToBoolNotStackPollLastThrowsScriptException() throws ScriptException {
        /* Branches:
         * (for-each(script.chunks)) : true
         * (!ifStack.contains(false)) : true
         * (chunk.data != null) : false
         * (opcode > OP_16) : true
         * (opCount > MAX_OPS_PER_SCRIPT) : false
         * (opcode == OP_CAT) : false
         * (opcode == OP_SUBSTR) : false
         * (opcode == OP_LEFT) : false
         * (opcode == OP_RIGHT) : false
         * (opcode == OP_INVERT) : false
         * (opcode == OP_AND) : false
         * (opcode == OP_OR) : false
         * (opcode == OP_XOR) : false
         * (opcode == OP_2MUL) : false
         * (opcode == OP_2DIV) : false
         * (opcode == OP_MUL) : false
         * (opcode == OP_DIV) : false
         * (opcode == OP_MOD) : false
         * (opcode == OP_LSHIFT) : false
         * (opcode == OP_RSHIFT) : false
         * (shouldExecute) : true
         * (OP_0 <= opcode) : true
         * (opcode <= OP_PUSHDATA4) : false
         * (shouldExecute) : true
         * (switch(opcode) = OP_VERIFY) : true
         * (stack.size() < 1) : false
         * (i < data.length) : true  #  inside castToBool method
         * (data[i] != 0) : true  #  inside castToBool method
         * (i == data.length - 1) : true  #  inside castToBool method
         * ((data[i] & 0xFF) == 0x80) : true  #  inside castToBool method
         * (!castToBool(stack.pollLast())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(-1).when(chunkMock).size();
        thrown.expect(ScriptException.class);
        List list = new ArrayList<>();
        list.add(chunkMock);
        Script script = Script.of(list);
        byte[] byteArray = new byte[]{};
        LinkedList<byte[]> byteList = new LinkedList<>();
        byteList.add(byteArray);
        Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
        //Act Statement(s)
        Script.executeScript(transactionMock, 0L, script, byteList, scriptVerifyFlagSet);
        //Assert statement(s)
        verify(chunkMock).size();
    }

    //Sapient generated method id: ${92e092ec-bbe9-39f2-a95e-34da91c4a1d9}
    @Ignore()
    @Test()
    public void executeScriptWhenIIndexOfDataAnd255Equals128AndIfStackNotIsEmptyThrowsScriptException() throws ScriptException {
        /* Branches:
         * (for-each(script.chunks)) : true
         * (!ifStack.contains(false)) : true
         * (chunk.data != null) : false
         * (opcode > OP_16) : true
         * (opCount > MAX_OPS_PER_SCRIPT) : false
         * (opcode == OP_CAT) : false
         * (opcode == OP_SUBSTR) : false
         * (opcode == OP_LEFT) : false
         * (opcode == OP_RIGHT) : false
         * (opcode == OP_INVERT) : false
         * (opcode == OP_AND) : false
         * (opcode == OP_OR) : false
         * (opcode == OP_XOR) : false
         * (opcode == OP_2MUL) : false
         * (opcode == OP_2DIV) : false
         * (opcode == OP_MUL) : false
         * (opcode == OP_DIV) : false
         * (opcode == OP_MOD) : false
         * (opcode == OP_LSHIFT) : false
         * (opcode == OP_RSHIFT) : false
         * (shouldExecute) : true
         * (OP_0 <= opcode) : true
         * (opcode <= OP_PUSHDATA4) : false
         * (shouldExecute) : true
         * (switch(opcode) = OP_1 or switch(opcode) = OP_2 or switch(opcode) = OP_3 or switch(opcode) = OP_4 or switch(opcode) = OP_5 or switch(opcode) = OP_6 or switch(opcode) = OP_7 or switch(opcode) = OP_8 or switch(opcode) = OP_9 or switch(opcode) = OP_10 or switch(opcode) = OP_11 or switch(opcode) = OP_12 or switch(opcode) = OP_13 or switch(opcode) = OP_14 or switch(opcode) = OP_15 or switch(opcode) = OP_16) : true
         * (!shouldExecute) : false
         * (stack.size() < 1) : false
         * (i < data.length) : true  #  inside castToBool method
         * (data[i] != 0) : true  #  inside castToBool method
         * (i == data.length - 1) : true  #  inside castToBool method
         * ((data[i] & 0xFF) == 0x80) : true  #  inside castToBool method
         * (!ifStack.isEmpty()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(-1).when(chunkMock).size();
        thrown.expect(ScriptException.class);
        List list = new ArrayList<>();
        list.add(chunkMock);
        Script script = Script.of(list);
        byte[] byteArray = new byte[]{};
        LinkedList<byte[]> byteList = new LinkedList<>();
        byteList.add(byteArray);
        Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
        //Act Statement(s)
        Script.executeScript(transactionMock, 0L, script, byteList, scriptVerifyFlagSet);
        //Assert statement(s)
        verify(chunkMock).size();
    }

    //Sapient generated method id: ${bebf502f-ad9a-3074-bad4-f2c64b1ec8ba}
    @Ignore()
    @Test()
    public void executeScriptWhenIIndexOfDataAnd255NotEquals128AndIfStackNotIsEmptyThrowsScriptException() throws ScriptException {
        /* Branches:
         * (for-each(script.chunks)) : true
         * (!ifStack.contains(false)) : true
         * (chunk.data != null) : false
         * (opcode > OP_16) : true
         * (opCount > MAX_OPS_PER_SCRIPT) : false
         * (opcode == OP_CAT) : false
         * (opcode == OP_SUBSTR) : false
         * (opcode == OP_LEFT) : false
         * (opcode == OP_RIGHT) : false
         * (opcode == OP_INVERT) : false
         * (opcode == OP_AND) : false
         * (opcode == OP_OR) : false
         * (opcode == OP_XOR) : false
         * (opcode == OP_2MUL) : false
         * (opcode == OP_2DIV) : false
         * (opcode == OP_MUL) : false
         * (opcode == OP_DIV) : false
         * (opcode == OP_MOD) : false
         * (opcode == OP_LSHIFT) : false
         * (opcode == OP_RSHIFT) : false
         * (shouldExecute) : true
         * (OP_0 <= opcode) : true
         * (opcode <= OP_PUSHDATA4) : false
         * (shouldExecute) : true
         * (switch(opcode) = OP_1 or switch(opcode) = OP_2 or switch(opcode) = OP_3 or switch(opcode) = OP_4 or switch(opcode) = OP_5 or switch(opcode) = OP_6 or switch(opcode) = OP_7 or switch(opcode) = OP_8 or switch(opcode) = OP_9 or switch(opcode) = OP_10 or switch(opcode) = OP_11 or switch(opcode) = OP_12 or switch(opcode) = OP_13 or switch(opcode) = OP_14 or switch(opcode) = OP_15 or switch(opcode) = OP_16) : true
         * (!shouldExecute) : false
         * (stack.size() < 1) : false
         * (i < data.length) : true  #  inside castToBool method
         * (data[i] != 0) : true  #  inside castToBool method
         * (i == data.length - 1) : true  #  inside castToBool method
         * ((data[i] & 0xFF) == 0x80) : false  #  inside castToBool method
         * (!ifStack.isEmpty()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(-1).when(chunkMock).size();
        thrown.expect(ScriptException.class);
        List list = new ArrayList<>();
        list.add(chunkMock);
        Script script = Script.of(list);
        byte[] byteArray = new byte[]{};
        LinkedList<byte[]> byteList = new LinkedList<>();
        byteList.add(byteArray);
        Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
        //Act Statement(s)
        Script.executeScript(transactionMock, 0L, script, byteList, scriptVerifyFlagSet);
        //Assert statement(s)
        verify(chunkMock).size();
    }

    //Sapient generated method id: ${4ee67693-79a6-3aab-a329-e9971fb02c9d}
    @Ignore()
    @Test()
    public void executeScriptWhenIIndexOfDataAnd255Equals128AndCastToBoolNotStackPollLastAndIfStackNotIsEmptyThrowsScriptException() throws ScriptException {
        /* Branches:
         * (for-each(script.chunks)) : true
         * (!ifStack.contains(false)) : true
         * (chunk.data != null) : false
         * (opcode > OP_16) : true
         * (opCount > MAX_OPS_PER_SCRIPT) : false
         * (opcode == OP_CAT) : false
         * (opcode == OP_SUBSTR) : false
         * (opcode == OP_LEFT) : false
         * (opcode == OP_RIGHT) : false
         * (opcode == OP_INVERT) : false
         * (opcode == OP_AND) : false
         * (opcode == OP_OR) : false
         * (opcode == OP_XOR) : false
         * (opcode == OP_2MUL) : false
         * (opcode == OP_2DIV) : false
         * (opcode == OP_MUL) : false
         * (opcode == OP_DIV) : false
         * (opcode == OP_MOD) : false
         * (opcode == OP_LSHIFT) : false
         * (opcode == OP_RSHIFT) : false
         * (shouldExecute) : true
         * (OP_0 <= opcode) : true
         * (opcode <= OP_PUSHDATA4) : false
         * (shouldExecute) : true
         * (switch(opcode) = OP_1 or switch(opcode) = OP_2 or switch(opcode) = OP_3 or switch(opcode) = OP_4 or switch(opcode) = OP_5 or switch(opcode) = OP_6 or switch(opcode) = OP_7 or switch(opcode) = OP_8 or switch(opcode) = OP_9 or switch(opcode) = OP_10 or switch(opcode) = OP_11 or switch(opcode) = OP_12 or switch(opcode) = OP_13 or switch(opcode) = OP_14 or switch(opcode) = OP_15 or switch(opcode) = OP_16) : true
         * (!shouldExecute) : false
         * (stack.size() < 1) : false
         * (i < data.length) : true  #  inside castToBool method
         * (data[i] != 0) : true  #  inside castToBool method
         * (i == data.length - 1) : true  #  inside castToBool method
         * ((data[i] & 0xFF) == 0x80) : true  #  inside castToBool method
         * (!castToBool(stack.pollLast())) : true
         * (!ifStack.isEmpty()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(-1).when(chunkMock).size();
        thrown.expect(ScriptException.class);
        List list = new ArrayList<>();
        list.add(chunkMock);
        Script script = Script.of(list);
        byte[] byteArray = new byte[]{};
        LinkedList<byte[]> byteList = new LinkedList<>();
        byteList.add(byteArray);
        Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
        //Act Statement(s)
        Script.executeScript(transactionMock, 0L, script, byteList, scriptVerifyFlagSet);
        //Assert statement(s)
        verify(chunkMock).size();
    }

    //Sapient generated method id: ${7d7b92d7-762d-39b9-a2ac-a3d0b1bf80d6}
    @Ignore()
    @Test()
    public void executeScriptWhenIIndexOfDataAnd255NotEquals128AndCastToBoolStackPollLastAndIfStackNotIsEmptyThrowsScriptException() throws ScriptException {
        /* Branches:
         * (for-each(script.chunks)) : true
         * (!ifStack.contains(false)) : true
         * (chunk.data != null) : false
         * (opcode > OP_16) : true
         * (opCount > MAX_OPS_PER_SCRIPT) : false
         * (opcode == OP_CAT) : false
         * (opcode == OP_SUBSTR) : false
         * (opcode == OP_LEFT) : false
         * (opcode == OP_RIGHT) : false
         * (opcode == OP_INVERT) : false
         * (opcode == OP_AND) : false
         * (opcode == OP_OR) : false
         * (opcode == OP_XOR) : false
         * (opcode == OP_2MUL) : false
         * (opcode == OP_2DIV) : false
         * (opcode == OP_MUL) : false
         * (opcode == OP_DIV) : false
         * (opcode == OP_MOD) : false
         * (opcode == OP_LSHIFT) : false
         * (opcode == OP_RSHIFT) : false
         * (shouldExecute) : true
         * (OP_0 <= opcode) : true
         * (opcode <= OP_PUSHDATA4) : false
         * (shouldExecute) : true
         * (switch(opcode) = OP_1 or switch(opcode) = OP_2 or switch(opcode) = OP_3 or switch(opcode) = OP_4 or switch(opcode) = OP_5 or switch(opcode) = OP_6 or switch(opcode) = OP_7 or switch(opcode) = OP_8 or switch(opcode) = OP_9 or switch(opcode) = OP_10 or switch(opcode) = OP_11 or switch(opcode) = OP_12 or switch(opcode) = OP_13 or switch(opcode) = OP_14 or switch(opcode) = OP_15 or switch(opcode) = OP_16) : true
         * (!shouldExecute) : false
         * (stack.size() < 1) : false
         * (i < data.length) : true  #  inside castToBool method
         * (data[i] != 0) : true  #  inside castToBool method
         * (i == data.length - 1) : true  #  inside castToBool method
         * ((data[i] & 0xFF) == 0x80) : false  #  inside castToBool method
         * (!castToBool(stack.pollLast())) : false
         * (!ifStack.isEmpty()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(-1).when(chunkMock).size();
        thrown.expect(ScriptException.class);
        List list = new ArrayList<>();
        list.add(chunkMock);
        Script script = Script.of(list);
        byte[] byteArray = new byte[]{};
        LinkedList<byte[]> byteList = new LinkedList<>();
        byteList.add(byteArray);
        Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
        //Act Statement(s)
        Script.executeScript(transactionMock, 0L, script, byteList, scriptVerifyFlagSet);
        //Assert statement(s)
        verify(chunkMock).size();
    }

    //Sapient generated method id: ${23c57e33-960b-3396-a758-d881fe08ca66}
    @Ignore()
    @Test()
    public void executeScriptWhenStackSizePlusAltstackSizeNotLessThan0AndIfStackIsEmpty4() throws Exception {
        /* Branches:
         * (for-each(script.chunks)) : true
         * (!ifStack.contains(false)) : true
         * (chunk.data != null) : false
         * (opcode > OP_16) : true
         * (opCount > MAX_OPS_PER_SCRIPT) : false
         * (opcode == OP_CAT) : false
         * (opcode == OP_SUBSTR) : false
         * (opcode == OP_LEFT) : false
         * (opcode == OP_RIGHT) : false
         * (opcode == OP_INVERT) : false
         * (opcode == OP_AND) : false
         * (opcode == OP_OR) : false
         * (opcode == OP_XOR) : false
         * (opcode == OP_2MUL) : false
         * (opcode == OP_2DIV) : false
         * (opcode == OP_MUL) : false
         * (opcode == OP_DIV) : false
         * (opcode == OP_MOD) : false
         * (opcode == OP_LSHIFT) : false
         * (opcode == OP_RSHIFT) : false
         * (shouldExecute) : true
         * (OP_0 <= opcode) : true
         * (opcode <= OP_PUSHDATA4) : false
         * (shouldExecute) : true
         * (switch(opcode) = OP_VERIFY) : true
         * (stack.size() < 1) : false
         * (i < data.length) : true  #  inside castToBool method
         * (data[i] != 0) : true  #  inside castToBool method
         * (i == data.length - 1) : true  #  inside castToBool method
         * ((data[i] & 0xFF) == 0x80) : false  #  inside castToBool method
         * (!castToBool(stack.pollLast())) : false
         * (stack.size() + altstack.size() > MAX_STACK_SIZE) : false
         * (stack.size() + altstack.size() < 0) : false
         * (!ifStack.isEmpty()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(-1).when(chunkMock).size();
        List list = new ArrayList<>();
        list.add(chunkMock);
        Script script = Script.of(list);
        byte[] byteArray = new byte[]{};
        LinkedList<byte[]> byteList = new LinkedList<>();
        byteList.add(byteArray);
        Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
        //Act Statement(s)
        Script.executeScript(transactionMock, 0L, script, byteList, scriptVerifyFlagSet);
        //Assert statement(s)
        verify(chunkMock).size();
    }

    //Sapient generated method id: ${170827e9-331f-3690-9b0b-47dbbcfbd6a5}
    @Test()
    public void correctlySpendsWhenWitnessGetPushCountLessThan2ThrowsScriptException() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : true
         * (witness.getPushCount() < 2) : true
         */
        //Arrange Statement(s)
        TransactionWitness witnessMock = mock(TransactionWitness.class, "correctlySpends_transactionWitness1");
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            doReturn(1).when(witnessMock).getPushCount();
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(true);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            thrown.expect(ScriptException.class);
            Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
            //Act Statement(s)
            target.correctlySpends(transactionMock, 0, witnessMock, coinMock, scriptMock, scriptVerifyFlagSet);
            //Assert statement(s)
            verify(witnessMock).getPushCount();
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${64e3c818-3224-3275-8b99-9f151ab48c57}
    @Test()
    public void correctlySpendsWhenCaughtSignatureDecodeExceptionThrowsScriptException() throws ScriptException, SignatureDecodeException {
        /* Branches:
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : true
         * (witness.getPushCount() < 2) : false
         * (catch-exception (SignatureDecodeException)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<TransactionSignature> transactionSignature = mockStatic(TransactionSignature.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            doReturn(2).when(witnessMock).getPushCount();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(witnessMock).getPush(0);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(true);
            transactionSignature.when(() -> TransactionSignature.decodeFromBitcoin(byteArray, true, true)).thenThrow(signatureDecodeExceptionMock);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            thrown.expect(ScriptException.class);
            Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
            //Act Statement(s)
            target.correctlySpends(transactionMock, 0, witnessMock, coinMock, scriptMock, scriptVerifyFlagSet);
            //Assert statement(s)
            verify(witnessMock).getPushCount();
            verify(witnessMock).getPush(0);
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            transactionSignature.verify(() -> TransactionSignature.decodeFromBitcoin(byteArray, true, true), atLeast(1));
        }
    }

    //Sapient generated method id: ${85f69abd-893f-39e4-9fa6-647ca1278504}
    @Test()
    public void correctlySpendsWhenNotValidSigThrowsScriptException() throws ScriptException, SignatureDecodeException {
        /* Branches:
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : true
         * (witness.getPushCount() < 2) : false
         * (!validSig) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptBuilder> scriptBuilder = mockStatic(ScriptBuilder.class);
             MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<TransactionSignature> transactionSignature = mockStatic(TransactionSignature.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            doReturn(sha256HashMock).when(txContainingThisMock).hashForWitnessSignature(0, scriptMock, coinMock, Transaction.SigHash.ALL, false);
            doReturn(2).when(witnessMock).getPushCount();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(witnessMock).getPush(0);
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(witnessMock).getPush(1);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock2)).thenReturn(true);
            transactionSignature.when(() -> TransactionSignature.decodeFromBitcoin(byteArray, true, true)).thenReturn(transactionSignatureMock);
            doReturn(Transaction.SigHash.ALL).when(transactionSignatureMock).sigHashMode();
            eCKey.when(() -> ECKey.fromPublicOnly(byteArray2)).thenReturn(eCKeyMock);
            doReturn(false).when(eCKeyMock).verify(sha256HashMock, transactionSignatureMock);
            scriptBuilder.when(() -> ScriptBuilder.createP2PKHOutputScript(eCKeyMock)).thenReturn(scriptMock);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            thrown.expect(ScriptException.class);
            Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
            //Act Statement(s)
            target.correctlySpends(txContainingThisMock, 0, witnessMock, coinMock, scriptMock2, scriptVerifyFlagSet);
            //Assert statement(s)
            verify(txContainingThisMock).hashForWitnessSignature(0, scriptMock, coinMock, Transaction.SigHash.ALL, false);
            verify(witnessMock).getPushCount();
            verify(witnessMock).getPush(0);
            verify(witnessMock).getPush(1);
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock2), atLeast(1));
            transactionSignature.verify(() -> TransactionSignature.decodeFromBitcoin(byteArray, true, true), atLeast(1));
            verify(transactionSignatureMock).sigHashMode();
            eCKey.verify(() -> ECKey.fromPublicOnly(byteArray2), atLeast(1));
            verify(eCKeyMock).verify(sha256HashMock, transactionSignatureMock);
            scriptBuilder.verify(() -> ScriptBuilder.createP2PKHOutputScript(eCKeyMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${7e128ac6-f9d4-379a-bada-fe641589b17f}
    @Test()
    public void correctlySpendsWhenValidSig() throws Exception {
        /* Branches:
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : true
         * (witness.getPushCount() < 2) : false
         * (!validSig) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptBuilder> scriptBuilder = mockStatic(ScriptBuilder.class);
             MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<TransactionSignature> transactionSignature = mockStatic(TransactionSignature.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            doReturn(sha256HashMock).when(txContainingThisMock).hashForWitnessSignature(0, scriptMock, coinMock, Transaction.SigHash.ALL, false);
            doReturn(2).when(witnessMock).getPushCount();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(witnessMock).getPush(0);
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(witnessMock).getPush(1);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock2)).thenReturn(true);
            transactionSignature.when(() -> TransactionSignature.decodeFromBitcoin(byteArray, true, true)).thenReturn(transactionSignatureMock);
            doReturn(Transaction.SigHash.ALL).when(transactionSignatureMock).sigHashMode();
            eCKey.when(() -> ECKey.fromPublicOnly(byteArray2)).thenReturn(eCKeyMock);
            doReturn(true).when(eCKeyMock).verify(sha256HashMock, transactionSignatureMock);
            scriptBuilder.when(() -> ScriptBuilder.createP2PKHOutputScript(eCKeyMock)).thenReturn(scriptMock);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
            //Act Statement(s)
            target.correctlySpends(txContainingThisMock, 0, witnessMock, coinMock, scriptMock2, scriptVerifyFlagSet);
            //Assert statement(s)
            verify(txContainingThisMock).hashForWitnessSignature(0, scriptMock, coinMock, Transaction.SigHash.ALL, false);
            verify(witnessMock).getPushCount();
            verify(witnessMock).getPush(0);
            verify(witnessMock).getPush(1);
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock2), atLeast(1));
            transactionSignature.verify(() -> TransactionSignature.decodeFromBitcoin(byteArray, true, true), atLeast(1));
            verify(transactionSignatureMock).sigHashMode();
            eCKey.verify(() -> ECKey.fromPublicOnly(byteArray2), atLeast(1));
            verify(eCKeyMock).verify(sha256HashMock, transactionSignatureMock);
            scriptBuilder.verify(() -> ScriptBuilder.createP2PKHOutputScript(eCKeyMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${b246e1cc-eb52-34c1-9a71-cd8e92f97433}
    @Test()
    public void correctlySpendsWhenChunksSizeNotEquals2ThrowsScriptException() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : false
         * (ScriptPattern.isP2PKH(scriptPubKey)) : true
         * (chunks.size() != 2) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(true);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            thrown.expect(ScriptException.class);
            Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
            //Act Statement(s)
            target.correctlySpends(transactionMock, 0, transactionWitnessMock, coinMock, scriptMock, scriptVerifyFlagSet);
            //Assert statement(s)
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${54f4b76a-979f-35ac-8d36-5718825dc44c}
    @Test()
    public void correctlySpendsWhenScriptPatternNotIsP2PKScriptPubKey() throws Exception {
        /* Branches:
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : false
         * (ScriptPattern.isP2PKH(scriptPubKey)) : false
         * (ScriptPattern.isP2PK(scriptPubKey)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = spy(Script.of(scriptChunkList, instant));
            Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
            doNothing().when(target).correctlySpends(transactionMock, 1L, scriptMock, scriptVerifyFlagSet);
            //Act Statement(s)
            target.correctlySpends(transactionMock, 1, transactionWitnessMock, coinMock, scriptMock, scriptVerifyFlagSet);
            //Assert statement(s)
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            verify(target).correctlySpends(transactionMock, 1L, scriptMock, scriptVerifyFlagSet);
        }
    }

    //Sapient generated method id: ${52371eae-9cb0-35f9-aae9-a9f98e85f8a7}
    @Ignore()
    @Test()
    public void correctlySpendsWhenCaughtSignatureDecodeException() throws Exception {
        /* Branches:
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : true
         * (witness.getPushCount() < 2) : false
         * (!validSig) : false
         * (catch-exception (SignatureDecodeException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptBuilder> scriptBuilder = mockStatic(ScriptBuilder.class);
             MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<TransactionSignature> transactionSignature = mockStatic(TransactionSignature.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            doReturn(sha256HashMock).when(txContainingThisMock).hashForWitnessSignature(0, scriptMock, coinMock, Transaction.SigHash.ALL, false);
            doReturn(2).when(witnessMock).getPushCount();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(witnessMock).getPush(0);
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(witnessMock).getPush(1);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock2)).thenReturn(true);
            transactionSignature.when(() -> TransactionSignature.decodeFromBitcoin(byteArray, true, true)).thenReturn(transactionSignatureMock);
            doReturn(Transaction.SigHash.ALL).when(transactionSignatureMock).sigHashMode();
            eCKey.when(() -> ECKey.fromPublicOnly(byteArray2)).thenReturn(eCKeyMock);
            doReturn(true).when(eCKeyMock).verify(sha256HashMock, transactionSignatureMock);
            scriptBuilder.when(() -> ScriptBuilder.createP2PKHOutputScript(eCKeyMock)).thenReturn(scriptMock);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
            //Act Statement(s)
            target.correctlySpends(txContainingThisMock, 0, witnessMock, coinMock, scriptMock2, scriptVerifyFlagSet);
            //Assert statement(s)
            verify(txContainingThisMock).hashForWitnessSignature(0, scriptMock, coinMock, Transaction.SigHash.ALL, false);
            verify(witnessMock).getPushCount();
            verify(witnessMock).getPush(0);
            verify(witnessMock).getPush(1);
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock2), atLeast(1));
            transactionSignature.verify(() -> TransactionSignature.decodeFromBitcoin(byteArray, true, true), atLeast(1));
            verify(transactionSignatureMock).sigHashMode();
            eCKey.verify(() -> ECKey.fromPublicOnly(byteArray2), atLeast(1));
            verify(eCKeyMock).verify(sha256HashMock, transactionSignatureMock);
            scriptBuilder.verify(() -> ScriptBuilder.createP2PKHOutputScript(eCKeyMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${edb723f5-a0d1-3f40-b760-5ab5fc6af269}
    @Test()
    public void correctlySpendsWhenValidSigAndCaughtSignatureDecodeException() throws Exception {
        /* Branches:
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : true
         * (witness.getPushCount() < 2) : false
         * (!validSig) : false
         * (catch-exception (SignatureDecodeException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptBuilder> scriptBuilder = mockStatic(ScriptBuilder.class);
             MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<TransactionSignature> transactionSignature = mockStatic(TransactionSignature.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            doReturn(sha256HashMock).when(txContainingThisMock).hashForWitnessSignature(0, scriptMock, coinMock, Transaction.SigHash.ALL, false);
            doReturn(2).when(witnessMock).getPushCount();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(witnessMock).getPush(0);
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(witnessMock).getPush(1);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock2)).thenReturn(true);
            transactionSignature.when(() -> TransactionSignature.decodeFromBitcoin(byteArray, true, true)).thenReturn(transactionSignatureMock);
            doReturn(Transaction.SigHash.ALL).when(transactionSignatureMock).sigHashMode();
            eCKey.when(() -> ECKey.fromPublicOnly(byteArray2)).thenReturn(eCKeyMock);
            doReturn(true).when(eCKeyMock).verify(sha256HashMock, transactionSignatureMock);
            scriptBuilder.when(() -> ScriptBuilder.createP2PKHOutputScript(eCKeyMock)).thenReturn(scriptMock);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
            //Act Statement(s)
            target.correctlySpends(txContainingThisMock, 0, witnessMock, coinMock, scriptMock2, scriptVerifyFlagSet);
            //Assert statement(s)
            verify(txContainingThisMock).hashForWitnessSignature(0, scriptMock, coinMock, Transaction.SigHash.ALL, false);
            verify(witnessMock).getPushCount();
            verify(witnessMock).getPush(0);
            verify(witnessMock).getPush(1);
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock2), atLeast(1));
            transactionSignature.verify(() -> TransactionSignature.decodeFromBitcoin(byteArray, true, true), atLeast(1));
            verify(transactionSignatureMock).sigHashMode();
            eCKey.verify(() -> ECKey.fromPublicOnly(byteArray2), atLeast(1));
            verify(eCKeyMock).verify(sha256HashMock, transactionSignatureMock);
            scriptBuilder.verify(() -> ScriptBuilder.createP2PKHOutputScript(eCKeyMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${02f097ae-9119-3dfd-bfc6-e0fb5c3fea7f}
    @Test()
    public void correctlySpendsWhenChunksSizeEquals2AndCaughtSignatureDecodeExceptionThrowsScriptException() throws ScriptException, SignatureDecodeException {
        /* Branches:
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : false
         * (ScriptPattern.isP2PKH(scriptPubKey)) : true
         * (chunks.size() != 2) : false
         * (catch-exception (SignatureDecodeException)) : true
         */
        //Arrange Statement(s)
        /*try (MockedStatic<TransactionSignature> transactionSignature = mockStatic(TransactionSignature.class);
    MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
    scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(false);
    scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(true);
    byte[] byteArray = new byte[] {};
    transactionSignature.when(() -> TransactionSignature.decodeFromBitcoin(byteArray, true, true)).thenThrow(signatureDecodeExceptionMock);
    List<ScriptChunk> scriptChunkList = new ArrayList<>();
    scriptChunkList.add(null);
    scriptChunkList.add(null);
    Instant instant = Instant.now();
    Script target = Script.of(scriptChunkList, instant);
    thrown.expect(ScriptException.class);
    Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
    //Act Statement(s)
    target.correctlySpends(transactionMock, 0, transactionWitnessMock, coinMock, scriptMock, scriptVerifyFlagSet);
    //Assert statement(s)
    scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
    scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
    transactionSignature.verify(() -> TransactionSignature.decodeFromBitcoin(byteArray, true, true), atLeast(1));
}*/
    }

    //Sapient generated method id: ${c7fa24fa-b555-3280-a8e9-57968e873b95}
    @Ignore()
    @Test()
    public void correctlySpendsWhenChunksSizeEquals2AndNotValidSigThrowsScriptException() throws ScriptException, SignatureDecodeException {
        /* Branches:
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : false
         * (ScriptPattern.isP2PKH(scriptPubKey)) : true
         * (chunks.size() != 2) : false
         * (!validSig) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<TransactionSignature> transactionSignature = mockStatic(TransactionSignature.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            doReturn(sha256HashMock).when(txContainingThisMock).hashForSignature(0, scriptMock, Transaction.SigHash.ALL, false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(true);
            byte[] byteArray = new byte[]{};
            transactionSignature.when(() -> TransactionSignature.decodeFromBitcoin(byteArray, true, true)).thenReturn(transactionSignatureMock);
            doReturn(Transaction.SigHash.ALL).when(transactionSignatureMock).sigHashMode();
            byte[] byteArray2 = new byte[]{};
            eCKey.when(() -> ECKey.fromPublicOnly(byteArray2)).thenReturn(eCKeyMock);
            doReturn(false).when(eCKeyMock).verify(sha256HashMock, transactionSignatureMock);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            thrown.expect(ScriptException.class);
            Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
            //Act Statement(s)
            target.correctlySpends(txContainingThisMock, 0, transactionWitnessMock, coinMock, scriptMock, scriptVerifyFlagSet);
            //Assert statement(s)
            verify(txContainingThisMock).hashForSignature(0, scriptMock, Transaction.SigHash.ALL, false);
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            transactionSignature.verify(() -> TransactionSignature.decodeFromBitcoin(byteArray, true, true), atLeast(1));
            verify(transactionSignatureMock).sigHashMode();
            eCKey.verify(() -> ECKey.fromPublicOnly(byteArray2), atLeast(1));
            verify(eCKeyMock).verify(sha256HashMock, transactionSignatureMock);
        }
    }

    //Sapient generated method id: ${7acb6b7f-9cad-368c-aeb5-761a2bf47370}
    @Ignore()
    @Test()
    public void correctlySpendsWhenChunksSizeEquals2AndValidSig() throws Exception {
        /* Branches:
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : false
         * (ScriptPattern.isP2PKH(scriptPubKey)) : true
         * (chunks.size() != 2) : false
         * (!validSig) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<TransactionSignature> transactionSignature = mockStatic(TransactionSignature.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            doReturn(sha256HashMock).when(txContainingThisMock).hashForSignature(0, scriptMock, Transaction.SigHash.ALL, false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(true);
            byte[] byteArray = new byte[]{};
            transactionSignature.when(() -> TransactionSignature.decodeFromBitcoin(byteArray, true, true)).thenReturn(transactionSignatureMock);
            doReturn(Transaction.SigHash.ALL).when(transactionSignatureMock).sigHashMode();
            byte[] byteArray2 = new byte[]{};
            eCKey.when(() -> ECKey.fromPublicOnly(byteArray2)).thenReturn(eCKeyMock);
            doReturn(true).when(eCKeyMock).verify(sha256HashMock, transactionSignatureMock);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
            //Act Statement(s)
            target.correctlySpends(txContainingThisMock, 0, transactionWitnessMock, coinMock, scriptMock, scriptVerifyFlagSet);
            //Assert statement(s)
            verify(txContainingThisMock).hashForSignature(0, scriptMock, Transaction.SigHash.ALL, false);
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            transactionSignature.verify(() -> TransactionSignature.decodeFromBitcoin(byteArray, true, true), atLeast(1));
            verify(transactionSignatureMock).sigHashMode();
            eCKey.verify(() -> ECKey.fromPublicOnly(byteArray2), atLeast(1));
            verify(eCKeyMock).verify(sha256HashMock, transactionSignatureMock);
        }
    }

    //Sapient generated method id: ${d1e5c62b-a175-3302-9734-ef5106092257}
    @Ignore()
    @Test()
    public void correctlySpendsWhenChunksSizeNotEquals1ThrowsScriptException() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : false
         * (ScriptPattern.isP2PKH(scriptPubKey)) : false
         * (ScriptPattern.isP2PK(scriptPubKey)) : true
         * (chunks.size() != 1) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(true);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            thrown.expect(ScriptException.class);
            Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
            //Act Statement(s)
            target.correctlySpends(transactionMock, 0, transactionWitnessMock, coinMock, scriptMock, scriptVerifyFlagSet);
            //Assert statement(s)
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${f843a135-f664-3df4-916a-cc31e711fbed}
    @Ignore()
    @Test()
    public void correctlySpendsWhenScriptPatternIsP2PKHScriptPubKeyAndChunksSizeEquals2AndNotValidSigThrowsScriptException() throws ScriptException, SignatureDecodeException {
        /* Branches:
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : false
         * (catch-exception (SignatureDecodeException)) : true
         * (ScriptPattern.isP2PKH(scriptPubKey)) : true
         * (chunks.size() != 2) : false
         * (!validSig) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<TransactionSignature> transactionSignature = mockStatic(TransactionSignature.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            doReturn(sha256HashMock).when(txContainingThisMock).hashForSignature(0, scriptMock, Transaction.SigHash.ALL, false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(true);
            byte[] byteArray = new byte[]{};
            transactionSignature.when(() -> TransactionSignature.decodeFromBitcoin(byteArray, true, true)).thenReturn(transactionSignatureMock);
            doReturn(Transaction.SigHash.ALL).when(transactionSignatureMock).sigHashMode();
            byte[] byteArray2 = new byte[]{};
            eCKey.when(() -> ECKey.fromPublicOnly(byteArray2)).thenReturn(eCKeyMock);
            doReturn(false).when(eCKeyMock).verify(sha256HashMock, transactionSignatureMock);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            thrown.expect(ScriptException.class);
            Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
            //Act Statement(s)
            target.correctlySpends(txContainingThisMock, 0, transactionWitnessMock, coinMock, scriptMock, scriptVerifyFlagSet);
            //Assert statement(s)
            verify(txContainingThisMock).hashForSignature(0, scriptMock, Transaction.SigHash.ALL, false);
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            transactionSignature.verify(() -> TransactionSignature.decodeFromBitcoin(byteArray, true, true), atLeast(1));
            verify(transactionSignatureMock).sigHashMode();
            eCKey.verify(() -> ECKey.fromPublicOnly(byteArray2), atLeast(1));
            verify(eCKeyMock).verify(sha256HashMock, transactionSignatureMock);
        }
    }

    //Sapient generated method id: ${0771d460-42e4-3a59-af06-1311256dc847}
    @Ignore()
    @Test()
    public void correctlySpendsWhenScriptPatternIsP2PKHScriptPubKeyAndChunksSizeEquals2AndValidSig() throws Exception {
        /* Branches:
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : false
         * (catch-exception (SignatureDecodeException)) : true
         * (ScriptPattern.isP2PKH(scriptPubKey)) : true
         * (chunks.size() != 2) : false
         * (!validSig) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<TransactionSignature> transactionSignature = mockStatic(TransactionSignature.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            doReturn(sha256HashMock).when(txContainingThisMock).hashForSignature(0, scriptMock, Transaction.SigHash.ALL, false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(true);
            byte[] byteArray = new byte[]{};
            transactionSignature.when(() -> TransactionSignature.decodeFromBitcoin(byteArray, true, true)).thenReturn(transactionSignatureMock);
            doReturn(Transaction.SigHash.ALL).when(transactionSignatureMock).sigHashMode();
            byte[] byteArray2 = new byte[]{};
            eCKey.when(() -> ECKey.fromPublicOnly(byteArray2)).thenReturn(eCKeyMock);
            doReturn(true).when(eCKeyMock).verify(sha256HashMock, transactionSignatureMock);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
            //Act Statement(s)
            target.correctlySpends(txContainingThisMock, 0, transactionWitnessMock, coinMock, scriptMock, scriptVerifyFlagSet);
            //Assert statement(s)
            verify(txContainingThisMock).hashForSignature(0, scriptMock, Transaction.SigHash.ALL, false);
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            transactionSignature.verify(() -> TransactionSignature.decodeFromBitcoin(byteArray, true, true), atLeast(1));
            verify(transactionSignatureMock).sigHashMode();
            eCKey.verify(() -> ECKey.fromPublicOnly(byteArray2), atLeast(1));
            verify(eCKeyMock).verify(sha256HashMock, transactionSignatureMock);
        }
    }

    //Sapient generated method id: ${5abac50c-64a8-30bb-853a-0e8e26f75c1f}
    @Ignore()
    @Test()
    public void correctlySpendsWhenChunksSizeEquals2AndValidSigAndCaughtSignatureDecodeException() throws Exception {
        /* Branches:
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : false
         * (ScriptPattern.isP2PKH(scriptPubKey)) : true
         * (chunks.size() != 2) : false
         * (!validSig) : false
         * (catch-exception (SignatureDecodeException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<TransactionSignature> transactionSignature = mockStatic(TransactionSignature.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            doReturn(sha256HashMock).when(txContainingThisMock).hashForSignature(0, scriptMock, Transaction.SigHash.ALL, false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(true);
            byte[] byteArray = new byte[]{};
            transactionSignature.when(() -> TransactionSignature.decodeFromBitcoin(byteArray, true, true)).thenReturn(transactionSignatureMock);
            doReturn(Transaction.SigHash.ALL).when(transactionSignatureMock).sigHashMode();
            byte[] byteArray2 = new byte[]{};
            eCKey.when(() -> ECKey.fromPublicOnly(byteArray2)).thenReturn(eCKeyMock);
            doReturn(true).when(eCKeyMock).verify(sha256HashMock, transactionSignatureMock);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
            //Act Statement(s)
            target.correctlySpends(txContainingThisMock, 0, transactionWitnessMock, coinMock, scriptMock, scriptVerifyFlagSet);
            //Assert statement(s)
            verify(txContainingThisMock).hashForSignature(0, scriptMock, Transaction.SigHash.ALL, false);
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            transactionSignature.verify(() -> TransactionSignature.decodeFromBitcoin(byteArray, true, true), atLeast(1));
            verify(transactionSignatureMock).sigHashMode();
            eCKey.verify(() -> ECKey.fromPublicOnly(byteArray2), atLeast(1));
            verify(eCKeyMock).verify(sha256HashMock, transactionSignatureMock);
        }
    }

    //Sapient generated method id: ${3d6d203e-bbac-3e1e-8227-6012eb857e76}
    @Ignore()
    @Test()
    public void correctlySpendsWhenChunksSizeEquals1AndCaughtSignatureDecodeExceptionThrowsScriptException() throws ScriptException, SignatureDecodeException {
        /* Branches:
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : false
         * (ScriptPattern.isP2PKH(scriptPubKey)) : false
         * (ScriptPattern.isP2PK(scriptPubKey)) : true
         * (chunks.size() != 1) : false
         * (catch-exception (SignatureDecodeException)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<TransactionSignature> transactionSignature = mockStatic(TransactionSignature.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(true);
            byte[] byteArray = new byte[]{};
            transactionSignature.when(() -> TransactionSignature.decodeFromBitcoin(byteArray, false, false)).thenThrow(signatureDecodeExceptionMock);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            thrown.expect(ScriptException.class);
            Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
            //Act Statement(s)
            target.correctlySpends(transactionMock, 0, transactionWitnessMock, coinMock, scriptMock, scriptVerifyFlagSet);
            //Assert statement(s)
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            transactionSignature.verify(() -> TransactionSignature.decodeFromBitcoin(byteArray, false, false), atLeast(1));
        }
    }

    //Sapient generated method id: ${9d989a42-a6bb-3f2c-b403-02856dbc9ce3}
    @Ignore()
    @Test()
    public void correctlySpendsWhenChunksSizeEquals1AndNotValidSigThrowsScriptException() throws ScriptException, SignatureDecodeException {
        /* Branches:
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : false
         * (ScriptPattern.isP2PKH(scriptPubKey)) : false
         * (ScriptPattern.isP2PK(scriptPubKey)) : true
         * (chunks.size() != 1) : false
         * (!validSig) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<TransactionSignature> transactionSignature = mockStatic(TransactionSignature.class)) {
            doReturn(sha256HashMock).when(txContainingThisMock).hashForSignature(0, scriptMock, Transaction.SigHash.ALL, false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(true);
            byte[] byteArray = new byte[]{};
            transactionSignature.when(() -> TransactionSignature.decodeFromBitcoin(byteArray, false, false)).thenReturn(transactionSignatureMock);
            doReturn(Transaction.SigHash.ALL).when(transactionSignatureMock).sigHashMode();
            byte[] byteArray2 = new byte[]{};
            scriptPattern.when(() -> ScriptPattern.extractKeyFromP2PK(scriptMock)).thenReturn(byteArray2);
            eCKey.when(() -> ECKey.fromPublicOnly(byteArray2)).thenReturn(eCKeyMock);
            doReturn(false).when(eCKeyMock).verify(sha256HashMock, transactionSignatureMock);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            thrown.expect(ScriptException.class);
            Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
            //Act Statement(s)
            target.correctlySpends(txContainingThisMock, 0, transactionWitnessMock, coinMock, scriptMock, scriptVerifyFlagSet);
            //Assert statement(s)
            verify(txContainingThisMock).hashForSignature(0, scriptMock, Transaction.SigHash.ALL, false);
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            transactionSignature.verify(() -> TransactionSignature.decodeFromBitcoin(byteArray, false, false), atLeast(1));
            verify(transactionSignatureMock).sigHashMode();
            scriptPattern.verify(() -> ScriptPattern.extractKeyFromP2PK(scriptMock), atLeast(1));
            eCKey.verify(() -> ECKey.fromPublicOnly(byteArray2), atLeast(1));
            verify(eCKeyMock).verify(sha256HashMock, transactionSignatureMock);
        }
    }

    //Sapient generated method id: ${f2e4986c-e391-324f-882b-2519821abe50}
    @Ignore()
    @Test()
    public void correctlySpendsWhenChunksSizeEquals1AndValidSig() throws Exception {
        /* Branches:
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : false
         * (ScriptPattern.isP2PKH(scriptPubKey)) : false
         * (ScriptPattern.isP2PK(scriptPubKey)) : true
         * (chunks.size() != 1) : false
         * (!validSig) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<TransactionSignature> transactionSignature = mockStatic(TransactionSignature.class)) {
            doReturn(sha256HashMock).when(txContainingThisMock).hashForSignature(0, scriptMock, Transaction.SigHash.ALL, false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(true);
            byte[] byteArray = new byte[]{};
            transactionSignature.when(() -> TransactionSignature.decodeFromBitcoin(byteArray, false, false)).thenReturn(transactionSignatureMock);
            doReturn(Transaction.SigHash.ALL).when(transactionSignatureMock).sigHashMode();
            byte[] byteArray2 = new byte[]{};
            scriptPattern.when(() -> ScriptPattern.extractKeyFromP2PK(scriptMock)).thenReturn(byteArray2);
            eCKey.when(() -> ECKey.fromPublicOnly(byteArray)).thenReturn(eCKeyMock);
            doReturn(true).when(eCKeyMock).verify(sha256HashMock, transactionSignatureMock);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
            //Act Statement(s)
            target.correctlySpends(txContainingThisMock, 0, transactionWitnessMock, coinMock, scriptMock, scriptVerifyFlagSet);
            //Assert statement(s)
            verify(txContainingThisMock).hashForSignature(0, scriptMock, Transaction.SigHash.ALL, false);
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            transactionSignature.verify(() -> TransactionSignature.decodeFromBitcoin(byteArray, false, false), atLeast(1));
            verify(transactionSignatureMock).sigHashMode();
            scriptPattern.verify(() -> ScriptPattern.extractKeyFromP2PK(scriptMock), atLeast(1));
            eCKey.verify(() -> ECKey.fromPublicOnly(byteArray), atLeast(1));
            verify(eCKeyMock).verify(sha256HashMock, transactionSignatureMock);
        }
    }

    //Sapient generated method id: ${92be093d-aa68-36cd-8b20-31645a432b73}
    @Ignore()
    @Test()
    public void correctlySpendsWhenScriptPatternIsP2PKScriptPubKeyAndChunksSizeEquals1AndNotValidSigThrowsScriptException() throws ScriptException, SignatureDecodeException {
        /* Branches:
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : false
         * (catch-exception (SignatureDecodeException)) : true
         * (ScriptPattern.isP2PKH(scriptPubKey)) : false
         * (ScriptPattern.isP2PK(scriptPubKey)) : true
         * (chunks.size() != 1) : false
         * (!validSig) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<TransactionSignature> transactionSignature = mockStatic(TransactionSignature.class)) {
            doReturn(sha256HashMock).when(txContainingThisMock).hashForSignature(0, scriptMock, Transaction.SigHash.ALL, false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(true);
            byte[] byteArray = new byte[]{};
            transactionSignature.when(() -> TransactionSignature.decodeFromBitcoin(byteArray, false, false)).thenReturn(transactionSignatureMock);
            doReturn(Transaction.SigHash.ALL).when(transactionSignatureMock).sigHashMode();
            byte[] byteArray2 = new byte[]{};
            scriptPattern.when(() -> ScriptPattern.extractKeyFromP2PK(scriptMock)).thenReturn(byteArray2);
            eCKey.when(() -> ECKey.fromPublicOnly(byteArray)).thenReturn(eCKeyMock);
            doReturn(false).when(eCKeyMock).verify(sha256HashMock, transactionSignatureMock);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            thrown.expect(ScriptException.class);
            Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
            //Act Statement(s)
            target.correctlySpends(txContainingThisMock, 0, transactionWitnessMock, coinMock, scriptMock, scriptVerifyFlagSet);
            //Assert statement(s)
            verify(txContainingThisMock).hashForSignature(0, scriptMock, Transaction.SigHash.ALL, false);
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            transactionSignature.verify(() -> TransactionSignature.decodeFromBitcoin(byteArray, false, false), atLeast(1));
            verify(transactionSignatureMock).sigHashMode();
            scriptPattern.verify(() -> ScriptPattern.extractKeyFromP2PK(scriptMock), atLeast(1));
            eCKey.verify(() -> ECKey.fromPublicOnly(byteArray), atLeast(1));
            verify(eCKeyMock).verify(sha256HashMock, transactionSignatureMock);
        }
    }

    //Sapient generated method id: ${c112409d-fd30-3a3f-8020-18e180f6e671}
    @Ignore()
    @Test()
    public void correctlySpendsWhenScriptPatternIsP2PKScriptPubKeyAndChunksSizeEquals1AndValidSig() throws Exception {
        /* Branches:
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : false
         * (catch-exception (SignatureDecodeException)) : true
         * (ScriptPattern.isP2PKH(scriptPubKey)) : false
         * (ScriptPattern.isP2PK(scriptPubKey)) : true
         * (chunks.size() != 1) : false
         * (!validSig) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<TransactionSignature> transactionSignature = mockStatic(TransactionSignature.class)) {
            doReturn(sha256HashMock).when(txContainingThisMock).hashForSignature(0, scriptMock, Transaction.SigHash.ALL, false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(true);
            byte[] byteArray = new byte[]{};
            transactionSignature.when(() -> TransactionSignature.decodeFromBitcoin(byteArray, false, false)).thenReturn(transactionSignatureMock);
            doReturn(Transaction.SigHash.ALL).when(transactionSignatureMock).sigHashMode();
            byte[] byteArray2 = new byte[]{};
            scriptPattern.when(() -> ScriptPattern.extractKeyFromP2PK(scriptMock)).thenReturn(byteArray2);
            eCKey.when(() -> ECKey.fromPublicOnly(byteArray2)).thenReturn(eCKeyMock);
            doReturn(true).when(eCKeyMock).verify(sha256HashMock, transactionSignatureMock);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
            //Act Statement(s)
            target.correctlySpends(txContainingThisMock, 0, transactionWitnessMock, coinMock, scriptMock, scriptVerifyFlagSet);
            //Assert statement(s)
            verify(txContainingThisMock).hashForSignature(0, scriptMock, Transaction.SigHash.ALL, false);
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            transactionSignature.verify(() -> TransactionSignature.decodeFromBitcoin(byteArray, false, false), atLeast(1));
            verify(transactionSignatureMock).sigHashMode();
            scriptPattern.verify(() -> ScriptPattern.extractKeyFromP2PK(scriptMock), atLeast(1));
            eCKey.verify(() -> ECKey.fromPublicOnly(byteArray2), atLeast(1));
            verify(eCKeyMock).verify(sha256HashMock, transactionSignatureMock);
        }
    }

    //Sapient generated method id: ${f6676f8f-6523-3815-aa9f-8dea34a412ba}
    @Ignore()
    @Test()
    public void correctlySpendsWhenCaughtSignatureDecodeExceptionAndScriptPatternIsP2PKScriptPubKeyAndChunksSizeEqThrowsScriptException() throws ScriptException, SignatureDecodeException {
        /* Branches:
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : false
         * (ScriptPattern.isP2PKH(scriptPubKey)) : false
         * (catch-exception (SignatureDecodeException)) : true
         * (ScriptPattern.isP2PK(scriptPubKey)) : true
         * (chunks.size() != 1) : false
         * (!validSig) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<TransactionSignature> transactionSignature = mockStatic(TransactionSignature.class)) {
            doReturn(sha256HashMock).when(txContainingThisMock).hashForSignature(0, scriptMock, Transaction.SigHash.ALL, false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(true);
            byte[] byteArray = new byte[]{};
            transactionSignature.when(() -> TransactionSignature.decodeFromBitcoin(byteArray, false, false)).thenReturn(transactionSignatureMock);
            doReturn(Transaction.SigHash.ALL).when(transactionSignatureMock).sigHashMode();
            byte[] byteArray2 = new byte[]{};
            scriptPattern.when(() -> ScriptPattern.extractKeyFromP2PK(scriptMock)).thenReturn(byteArray2);
            eCKey.when(() -> ECKey.fromPublicOnly(byteArray2)).thenReturn(eCKeyMock);
            doReturn(false).when(eCKeyMock).verify(sha256HashMock, transactionSignatureMock);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            thrown.expect(ScriptException.class);
            Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
            //Act Statement(s)
            target.correctlySpends(txContainingThisMock, 0, transactionWitnessMock, coinMock, scriptMock, scriptVerifyFlagSet);
            //Assert statement(s)
            verify(txContainingThisMock).hashForSignature(0, scriptMock, Transaction.SigHash.ALL, false);
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            transactionSignature.verify(() -> TransactionSignature.decodeFromBitcoin(byteArray, false, false), atLeast(1));
            verify(transactionSignatureMock).sigHashMode();
            scriptPattern.verify(() -> ScriptPattern.extractKeyFromP2PK(scriptMock), atLeast(1));
            eCKey.verify(() -> ECKey.fromPublicOnly(byteArray2), atLeast(1));
            verify(eCKeyMock).verify(sha256HashMock, transactionSignatureMock);
        }
    }

    //Sapient generated method id: ${94ac2698-1dc3-37e1-a80a-38a9eea1a826}
    @Ignore()
    @Test()
    public void correctlySpendsWhenCaughtSignatureDecodeExceptionAndScriptPatternIsP2PKScriptPubKeyAndChunksSizeEquals1AndValidSig() throws Exception {
        /* Branches:
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : false
         * (ScriptPattern.isP2PKH(scriptPubKey)) : false
         * (catch-exception (SignatureDecodeException)) : true
         * (ScriptPattern.isP2PK(scriptPubKey)) : true
         * (chunks.size() != 1) : false
         * (!validSig) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class);
             MockedStatic<TransactionSignature> transactionSignature = mockStatic(TransactionSignature.class)) {
            doReturn(sha256HashMock).when(txContainingThisMock).hashForSignature(0, scriptMock, Transaction.SigHash.ALL, false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(true);
            byte[] byteArray = new byte[]{};
            transactionSignature.when(() -> TransactionSignature.decodeFromBitcoin(byteArray, false, false)).thenReturn(transactionSignatureMock);
            doReturn(Transaction.SigHash.ALL).when(transactionSignatureMock).sigHashMode();
            byte[] byteArray2 = new byte[]{};
            scriptPattern.when(() -> ScriptPattern.extractKeyFromP2PK(scriptMock)).thenReturn(byteArray2);
            eCKey.when(() -> ECKey.fromPublicOnly(byteArray2)).thenReturn(eCKeyMock);
            doReturn(true).when(eCKeyMock).verify(sha256HashMock, transactionSignatureMock);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
            //Act Statement(s)
            target.correctlySpends(txContainingThisMock, 0, transactionWitnessMock, coinMock, scriptMock, scriptVerifyFlagSet);
            //Assert statement(s)
            verify(txContainingThisMock).hashForSignature(0, scriptMock, Transaction.SigHash.ALL, false);
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            transactionSignature.verify(() -> TransactionSignature.decodeFromBitcoin(byteArray, false, false), atLeast(1));
            verify(transactionSignatureMock).sigHashMode();
            scriptPattern.verify(() -> ScriptPattern.extractKeyFromP2PK(scriptMock), atLeast(1));
            eCKey.verify(() -> ECKey.fromPublicOnly(byteArray2), atLeast(1));
            verify(eCKeyMock).verify(sha256HashMock, transactionSignatureMock);
        }
    }

    //Sapient generated method id: ${2543c01b-a456-3f7e-9520-7563673f1732}
    @Ignore()
    @Test()
    public void correctlySpends1WhenCaughtProtocolExceptionThrowsRuntimeException() throws ScriptException {
        /* Branches:
         * (catch-exception (ProtocolException)) : true
         */
        //Arrange Statement(s)
        ProtocolException protocolExceptionMock = mock(ProtocolException.class);
        try (MockedStatic<Transaction> transaction = mockStatic(Transaction.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(txContainingThisMock).serialize();
            transaction.when(() -> Transaction.read((ByteBuffer) any())).thenThrow(protocolExceptionMock);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            thrown.expect(RuntimeException.class);
            thrown.expectCause(is(instanceOf(ProtocolException.class)));
            Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
            //Act Statement(s)
            target.correctlySpends(txContainingThisMock, 0L, scriptMock, scriptVerifyFlagSet);
            //Assert statement(s)
            verify(txContainingThisMock).serialize();
            transaction.verify(() -> Transaction.read((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${a09b3905-5632-3add-ac41-a8ab5c553a0e}
    @Ignore()
    @Test()
    public void correctlySpends1WhenScriptPubKeyProgramLengthGreaterThanMAX_SCRIPT_SIZEThrowsScriptException() throws ScriptException {
        /* Branches:
         * (program().length > MAX_SCRIPT_SIZE) : false
         * (scriptPubKey.program().length > MAX_SCRIPT_SIZE) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Transaction> transaction = mockStatic(Transaction.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(txContainingThisMock).serialize();
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(scriptPubKeyMock).program();
            transaction.when(() -> Transaction.read((ByteBuffer) any())).thenReturn(transactionMock);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            Instant instant = Instant.now();
            Script target = spy(Script.of(scriptChunkList, instant));
            byte[] byteArray3 = new byte[]{};
            doReturn(byteArray3).when(target).program();
            thrown.expect(ScriptException.class);
            Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
            //Act Statement(s)
            target.correctlySpends(txContainingThisMock, 0L, scriptPubKeyMock, scriptVerifyFlagSet);
            //Assert statement(s)
            verify(txContainingThisMock).serialize();
            verify(scriptPubKeyMock).program();
            transaction.verify(() -> Transaction.read((ByteBuffer) any()));
            verify(target).program();
        }
    }

    //Sapient generated method id: ${b791c0cb-4f26-3c60-9382-95481459ce7e}
    @Ignore()
    @Test()
    public void correctlySpends1WhenStackSizeEquals0ThrowsScriptException() throws ScriptException {
        /* Branches:
         * (program().length > MAX_SCRIPT_SIZE) : false
         * (scriptPubKey.program().length > MAX_SCRIPT_SIZE) : false
         * (verifyFlags.contains(VerifyFlag.P2SH)) : true
         * (stack.size() == 0) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Script> script = mockStatic(Script.class);
             MockedStatic<Transaction> transaction = mockStatic(Transaction.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(txContainingThisMock).serialize();
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(scriptPubKeyMock).program();
            transaction.when(() -> Transaction.read((ByteBuffer) any())).thenReturn(transactionMock);
            script.when(() -> Script.executeScript(eq(transactionMock), eq(0L), eq(scriptPubKeyMock), any(), anySet())).thenAnswer((Answer<Void>) invocation -> null);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = spy(Script.of(scriptChunkList, instant));
            byte[] byteArray3 = new byte[]{};
            doReturn(byteArray3).when(target).program();
            script.when(() -> Script.executeScript(eq(transactionMock), eq(0L), eq(target), any(), anySet())).thenAnswer((Answer<Void>) invocation -> null);
            thrown.expect(ScriptException.class);
            Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
            scriptVerifyFlagSet.add(Script.VerifyFlag.P2SH);
            //Act Statement(s)
            target.correctlySpends(txContainingThisMock, 0L, scriptPubKeyMock, scriptVerifyFlagSet);
            //Assert statement(s)
            verify(txContainingThisMock).serialize();
            verify(scriptPubKeyMock).program();
            transaction.verify(() -> Transaction.read((ByteBuffer) any()));
            script.verify(() -> Script.executeScript(eq(transactionMock), eq(0L), eq(scriptPubKeyMock), any(), anySet()));
            verify(target).program();
            script.verify(() -> Script.executeScript(eq(transactionMock), eq(0L), eq(target), any(), anySet()));
        }
    }

    //Sapient generated method id: ${3a2f9211-e9e1-3c1c-8042-43ae658c1e4d}
    @Ignore()
    @Test()
    public void correctlySpends1WhenVerifyFlagsNotContainsVerifyFlagP2SHAndStackSizeEquals0ThrowsScriptException() throws ScriptException {
        /* Branches:
         * (program().length > MAX_SCRIPT_SIZE) : false
         * (scriptPubKey.program().length > MAX_SCRIPT_SIZE) : false
         * (verifyFlags.contains(VerifyFlag.P2SH)) : false
         * (stack.size() == 0) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Script> script = mockStatic(Script.class);
             MockedStatic<Transaction> transaction = mockStatic(Transaction.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(txContainingThisMock).serialize();
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(scriptPubKeyMock).program();
            transaction.when(() -> Transaction.read((ByteBuffer) any())).thenReturn(transactionMock);
            script.when(() -> Script.executeScript(eq(transactionMock), eq(0L), eq(scriptPubKeyMock), any(), anySet())).thenAnswer((Answer<Void>) invocation -> null);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = spy(Script.of(scriptChunkList, instant));
            byte[] byteArray3 = new byte[]{};
            doReturn(byteArray3).when(target).program();
            script.when(() -> Script.executeScript(eq(transactionMock), eq(0L), eq(target), any(), anySet())).thenAnswer((Answer<Void>) invocation -> null);
            thrown.expect(ScriptException.class);
            Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
            //Act Statement(s)
            target.correctlySpends(txContainingThisMock, 0L, scriptPubKeyMock, scriptVerifyFlagSet);
            //Assert statement(s)
            verify(txContainingThisMock).serialize();
            verify(scriptPubKeyMock).program();
            transaction.verify(() -> Transaction.read((ByteBuffer) any()));
            script.verify(() -> Script.executeScript(eq(transactionMock), eq(0L), eq(scriptPubKeyMock), any(), anySet()));
            verify(target).program();
            script.verify(() -> Script.executeScript(eq(transactionMock), eq(0L), eq(target), any(), anySet()));
        }
    }

    //Sapient generated method id: ${55a01526-c114-32fa-a69d-240006a2d764}
    @Test()
    public void getScriptTypeWhenScriptPatternIsP2PKHThis() {
        /* Branches:
         * (ScriptPattern.isP2PKH(this)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(target)).thenReturn(true);
            //Act Statement(s)
            ScriptType result = target.getScriptType();
            //Assert statement(s)
            assertThat(result, equalTo(ScriptType.P2PKH));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${86299939-93cf-3ea2-b17c-7c5d4450a16c}
    @Test()
    public void getScriptTypeWhenScriptPatternIsP2PKThis() {
        /* Branches:
         * (ScriptPattern.isP2PKH(this)) : false
         * (ScriptPattern.isP2PK(this)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(target)).thenReturn(true);
            //Act Statement(s)
            ScriptType result = target.getScriptType();
            //Assert statement(s)
            assertThat(result, equalTo(ScriptType.P2PK));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${c951742d-1949-3239-ba1e-03c466721d36}
    @Test()
    public void getScriptTypeWhenScriptPatternIsP2SHThis() {
        /* Branches:
         * (ScriptPattern.isP2PKH(this)) : false
         * (ScriptPattern.isP2PK(this)) : false
         * (ScriptPattern.isP2SH(this)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(target)).thenReturn(true);
            //Act Statement(s)
            ScriptType result = target.getScriptType();
            //Assert statement(s)
            assertThat(result, equalTo(ScriptType.P2SH));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${ebc2da31-9044-3764-b3c6-300b99d93976}
    @Test()
    public void getScriptTypeWhenScriptPatternIsP2WPKHThis() {
        /* Branches:
         * (ScriptPattern.isP2PKH(this)) : false
         * (ScriptPattern.isP2PK(this)) : false
         * (ScriptPattern.isP2SH(this)) : false
         * (ScriptPattern.isP2WPKH(this)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(target)).thenReturn(true);
            //Act Statement(s)
            ScriptType result = target.getScriptType();
            //Assert statement(s)
            assertThat(result, equalTo(ScriptType.P2WPKH));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${27df9d66-a6ee-3d81-a108-59cf4105ba0b}
    @Test()
    public void getScriptTypeWhenScriptPatternIsP2WSHThis() {
        /* Branches:
         * (ScriptPattern.isP2PKH(this)) : false
         * (ScriptPattern.isP2PK(this)) : false
         * (ScriptPattern.isP2SH(this)) : false
         * (ScriptPattern.isP2WPKH(this)) : false
         * (ScriptPattern.isP2WSH(this)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WSH(target)).thenReturn(true);
            //Act Statement(s)
            ScriptType result = target.getScriptType();
            //Assert statement(s)
            assertThat(result, equalTo(ScriptType.P2WSH));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WSH(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${d2b999e4-660a-3d0b-92ef-0eae116cd0bd}
    @Test()
    public void getScriptTypeWhenScriptPatternIsP2TRThis() {
        /* Branches:
         * (ScriptPattern.isP2PKH(this)) : false
         * (ScriptPattern.isP2PK(this)) : false
         * (ScriptPattern.isP2SH(this)) : false
         * (ScriptPattern.isP2WPKH(this)) : false
         * (ScriptPattern.isP2WSH(this)) : false
         * (ScriptPattern.isP2TR(this)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WSH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2TR(target)).thenReturn(true);
            //Act Statement(s)
            ScriptType result = target.getScriptType();
            //Assert statement(s)
            assertThat(result, equalTo(ScriptType.P2TR));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WSH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2TR(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${15e7ac2f-b44e-355c-976c-c1c633749b87}
    @Test()
    public void getScriptTypeWhenScriptPatternNotIsP2TRThis() {
        /* Branches:
         * (ScriptPattern.isP2PKH(this)) : false
         * (ScriptPattern.isP2PK(this)) : false
         * (ScriptPattern.isP2SH(this)) : false
         * (ScriptPattern.isP2WPKH(this)) : false
         * (ScriptPattern.isP2WSH(this)) : false
         * (ScriptPattern.isP2TR(this)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.now();
            Script target = Script.of(scriptChunkList, instant);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WSH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2TR(target)).thenReturn(false);
            //Act Statement(s)
            ScriptType result = target.getScriptType();
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WSH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2TR(target), atLeast(1));
        }
    }
}
