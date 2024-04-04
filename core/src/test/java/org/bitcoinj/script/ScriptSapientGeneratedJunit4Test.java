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

import java.io.ByteArrayInputStream;

import org.bitcoinj.core.Transaction;

import java.util.LinkedList;

import org.bitcoinj.crypto.ECKey;
import org.bitcoinj.crypto.TransactionSignature;
import org.bitcoinj.base.VarInt;

import java.util.HashSet;
import java.math.BigInteger;

import org.bitcoinj.base.Coin;
import org.bitcoinj.base.internal.ByteUtils;
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

import java.io.OutputStream;
import java.util.Set;

import org.bitcoinj.base.Sha256Hash;
import org.mockito.MockedStatic;
import org.bitcoinj.base.SegwitAddress;
import org.bitcoinj.core.ProtocolException;

import java.time.Instant;
import java.io.ByteArrayOutputStream;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.ArgumentMatchers.anySet;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

public class ScriptSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Address addressMock = mock(Address.class);

    private final ScriptChunk chunkMock = mock(ScriptChunk.class);

    private final Coin coinMock = mock(Coin.class);

    private final ECKey eCKeyMock = mock(ECKey.class);

    private final ECKey eCKeyMock2 = mock(ECKey.class);

    private final ECKey eCKeyMock3 = mock(ECKey.class);

    private final ECKey keyMock = mock(ECKey.class);

    private final LegacyAddress legacyAddressMock = mock(LegacyAddress.class);

    private final Network networkMock = mock(Network.class);

    private final NetworkParameters paramsMock = mock(NetworkParameters.class);

    private final ECKey pubKeyMock = mock(ECKey.class);

    private final ScriptChunk scriptChunkMock = mock(ScriptChunk.class);

    private final Script scriptMock = mock(Script.class);

    private final Script scriptMock2 = mock(Script.class);

    private final Script scriptPubKeyMock = mock(Script.class);

    private final SegwitAddress segwitAddressMock = mock(SegwitAddress.class);

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    private final SignatureDecodeException signatureDecodeExceptionMock = mock(SignatureDecodeException.class);

    private final Transaction transactionMock = mock(Transaction.class);

    private final TransactionSignature transactionSignatureMock = mock(TransactionSignature.class);

    private final TransactionWitness transactionWitnessMock = mock(TransactionWitness.class);

    private final Transaction txContainingThisMock = mock(Transaction.class);

    private final TransactionWitness witnessMock = mock(TransactionWitness.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${3155f475-158f-3510-8516-db6562387204}, hash: F380E741E0DFCB4D977573B04F81E885
    @Test()
    public void ofTest() {
        //Arrange Statement(s)
        try (MockedStatic<Script> script = mockStatic(Script.class, CALLS_REAL_METHODS)) {
            script.when(() -> Script.of(anyList(), (Instant) any())).thenReturn(scriptMock);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            //Act Statement(s)
            Script result = Script.of(scriptChunkList);
            //Assert statement(s)
            assertThat(result, equalTo(scriptMock));
            script.verify(() -> Script.of(anyList(), (Instant) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${2d9e451b-59ca-3da9-a6c7-f80da9bfa12e}, hash: 48ECFFBE8D54A48BE5A05B31052776D0
    @Test()
    public void of1Test() {
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(null);
        Instant instant = Instant.ofEpochSecond(1700000000);
        //Act Statement(s)
        Script result = Script.of(scriptChunkList, instant);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${3a1fa216-77d7-3552-a886-5cb34f671ab0}, hash: 1212A34B1AAB859C90BE241136B12258
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

    //Sapient generated method id: ${8fe35b44-ead9-3555-b4a7-279a7d806356}, hash: 6EA993D2571B2060707619BDF2072FAC
    @Ignore()
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
        thrown.expect(ScriptException.class);
        byte[] byteArray = new byte[]{};
        Instant instant = Instant.ofEpochSecond(1700000000);
        //Act Statement(s)
        Script.parse(byteArray, instant);
    }

    //Sapient generated method id: ${213fe935-cd2c-32e6-881a-e24bd86062f0}, hash: 3B1DC6B026B2690DA6414759F718FC20
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
        thrown.expect(IllegalStateException.class);
        byte[] byteArray = new byte[]{(byte) 0};
        Instant instant = Instant.now();
        //Act Statement(s)
        Script.parse(byteArray, instant);
    }

    //Sapient generated method id: ${2c87dacb-e1b0-33ce-94b8-56f6ac90ec70}, hash: EE154C05EE6C5D3D9E55F25B270F5861
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
        byte[] byteArray = new byte[]{};
        Instant instant = Instant.ofEpochSecond(1700000000);
        //Act Statement(s)
        Script result = Script.parse(byteArray, instant);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${68715065-76bf-3409-ba1b-8a56e5375fad}, hash: C5B7664CA524824DE2D0A1B0252BEB16
    @Ignore()
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
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            ByteArrayInputStream byteArrayInputStream = mock(ByteArrayInputStream.class);
            byteUtils.when(() -> ByteUtils.readUint16(byteArrayInputStream)).thenReturn(2);
            thrown.expect(ScriptException.class);
            byte[] byteArray = new byte[]{(byte) 0};
            Instant instant = Instant.now();
            //Act Statement(s)
            Script.parse(byteArray, instant);
            //Assert statement(s)
            byteUtils.verify(() -> ByteUtils.readUint16(byteArrayInputStream), atLeast(1));
        }
    }

    //Sapient generated method id: ${0dafa2bc-71ac-3d34-8c2e-1c0572c2df66}, hash: 1017AF53CE170C515C28D751C1366DCA
    @Ignore()
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
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            ByteArrayInputStream byteArrayInputStream = mock(ByteArrayInputStream.class);
            byteUtils.when(() -> ByteUtils.readUint32(byteArrayInputStream)).thenReturn(1L);
            byte[] byteArray = new byte[]{(byte) 0};
            Instant instant = Instant.now();
            //Act Statement(s)
            Script result = Script.parse(byteArray, instant);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            byteUtils.verify(() -> ByteUtils.readUint32(byteArrayInputStream), atLeast(1));
        }
    }

    //Sapient generated method id: ${88e08422-4f3c-3a0c-9cdf-0dd6eb55c00e}, hash: 7E91CA286C6B5451101CA716542699F6
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
        Instant instant = Instant.ofEpochSecond(1700000000);
        Script target = Script.of(scriptChunkList, instant);
        //Act Statement(s)
        byte[] result = target.program();
        //Assert statement(s)
        assertThat(result.length, equalTo(0));
    }

    //Sapient generated method id: ${c7a5cd7e-a09a-3d82-ac26-87ced9926d54}, hash: CC2044D0DF9A90B444CEE3BFB79C7E12
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
        Instant instant = Instant.ofEpochSecond(1700000000);
        Script target = Script.of(scriptChunkList, instant);
        thrown.expect(RuntimeException.class);
        thrown.expectCause(is(instanceOf(IOException.class)));
        //Act Statement(s)
        target.program();
    }

    //Sapient generated method id: ${f1ade6ca-1ad0-3ba1-ae05-87b4e6f688db}, hash: 52C2452EDBD51FBDC3C65EC6EA33ADB4
    @Test()
    public void getProgramTest() throws IOException {
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(null);
        Instant instant = Instant.ofEpochSecond(1700000000);
        Script target = spy(Script.of(scriptChunkList, instant));
        byte[] byteArray = new byte[]{};
        doReturn(byteArray).when(target).program();
        //Act Statement(s)
        byte[] result = target.getProgram();
        //Assert statement(s)
        assertThat(result, equalTo(byteArray));
        verify(target).program();
    }

    //Sapient generated method id: ${b4981825-1442-3f0d-904c-7bce6d45c5de}, hash: B2CC348706464DE3229E892975386F76
    @Test()
    public void chunksTest() {
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        Instant instant = Instant.ofEpochSecond(1700000000);
        Script target = Script.of(scriptChunkList, instant);
        //Act Statement(s)
        List<ScriptChunk> result = target.chunks();
        //Assert statement(s)
        assertThat(result.size(), equalTo(1));
        assertThat(result.get(0), is(instanceOf(ScriptChunk.class)));
    }

    //Sapient generated method id: ${c68be88f-5305-3de5-b55d-74a9af12eabc}, hash: A2AEFA42209CBC5D569120CC2AA16ABD
    @Test()
    public void getChunksTest() {
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        Instant instant = Instant.ofEpochSecond(1700000000);
        Script target = Script.of(scriptChunkList, instant);
        //Act Statement(s)
        List<ScriptChunk> result = target.getChunks();
        //Assert statement(s)
        assertThat(result.size(), equalTo(1));
        assertThat(result.get(0), is(instanceOf(ScriptChunk.class)));
    }

    //Sapient generated method id: ${e7ca91d8-c1cc-3fb0-bbfc-9b9ce2ba701e}, hash: B4559DA651C2496F15E341B3EDA50ED9
    @Test()
    public void creationTimeTest() {
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(null);
        Instant instant = Instant.ofEpochSecond(1700000000);
        Script target = Script.of(scriptChunkList, instant);
        //Act Statement(s)
        Optional<Instant> result = target.creationTime();
        Optional<Instant> instantOptional = Optional.of(instant);
        //Assert statement(s)
        assertThat(result, equalTo(instantOptional));
    }

    //Sapient generated method id: ${59599f06-b2e1-33b8-847a-1ad84ccad6b6}, hash: DBC04F39EE0672CFFC97A60E14B184AA
    @Test()
    public void getCreationTimeSecondsTest() {
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(null);
        Instant instant = Instant.ofEpochSecond(1700000000);
        Script target = Script.of(scriptChunkList, instant);
        //Act Statement(s)
        long result = target.getCreationTimeSeconds();
        //Assert statement(s)
        assertThat(result, equalTo(1700000000L));
    }

    //Sapient generated method id: ${bef8a8c7-3d0d-3446-966d-df436c067332}, hash: C640EB485C6E48CD9C115A42A731071A
    @Ignore()
    @Test()
    public void toStringWhenChunksNotIsEmpty() {
        /* Branches:
         * (!chunks.isEmpty()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: SPACE_JOINER
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(null);
        Instant instant = Instant.ofEpochSecond(1700000000);
        Script target = Script.of(scriptChunkList, instant);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("return_of_join1"));
    }

    //Sapient generated method id: ${5ebbd07f-5dc8-36be-8a31-cc9d32d7ad59}, hash: 7A5BEED9FF8DDE0C1F2B2DF900D25354
    @Test()
    public void toStringWhenChunksIsEmpty() {
        /* Branches:
         * (!chunks.isEmpty()) : false
         */
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        Instant instant = Instant.ofEpochSecond(1700000000);
        Script target = Script.of(scriptChunkList, instant);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("<empty>"));
    }

    //Sapient generated method id: ${27ba3387-bd2f-316f-a591-a519d1a888d3}, hash: D5755897878645D768969BDDF711C657
    @Test()
    public void getPubKeyHashWhenScriptPatternIsP2PKHThis() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(this)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.ofEpochSecond(1700000000);
            Script target = Script.of(scriptChunkList, instant);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(target)).thenReturn(true);
            byte[] byteArray = new byte[]{};
            scriptPattern.when(() -> ScriptPattern.extractHashFromP2PKH(target)).thenReturn(byteArray);
            //Act Statement(s)
            byte[] result = target.getPubKeyHash();
            //Assert statement(s)
            assertThat(result, equalTo(byteArray));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractHashFromP2PKH(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${620bcba7-7af7-374f-a383-fd793588c5f1}, hash: 4F98A6E213B33847432D8BEF04C21FFD
    @Test()
    public void getPubKeyHashWhenScriptPatternIsP2SHThis() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(this)) : false
         * (ScriptPattern.isP2SH(this)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.ofEpochSecond(1700000000);
            Script target = Script.of(scriptChunkList, instant);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(target)).thenReturn(true);
            byte[] byteArray = new byte[]{};
            scriptPattern.when(() -> ScriptPattern.extractHashFromP2SH(target)).thenReturn(byteArray);
            //Act Statement(s)
            byte[] result = target.getPubKeyHash();
            //Assert statement(s)
            assertThat(result, equalTo(byteArray));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractHashFromP2SH(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${b3334e19-de30-3c00-a41c-8241cafdb359}, hash: F1D548070C79FF8B0BF6F1F8AF2C9A83
    @Test()
    public void getPubKeyHashWhenScriptPatternIsP2WHThis() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(this)) : false
         * (ScriptPattern.isP2SH(this)) : false
         * (ScriptPattern.isP2WH(this)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.ofEpochSecond(1700000000);
            Script target = Script.of(scriptChunkList, instant);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WH(target)).thenReturn(true);
            byte[] byteArray = new byte[]{};
            scriptPattern.when(() -> ScriptPattern.extractHashFromP2WH(target)).thenReturn(byteArray);
            //Act Statement(s)
            byte[] result = target.getPubKeyHash();
            //Assert statement(s)
            assertThat(result, equalTo(byteArray));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.extractHashFromP2WH(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${b688c3cd-12b7-302e-96f6-6d88208348ac}, hash: 28839AB4BC7F64E27DAAB88B147CAAD2
    @Test()
    public void getPubKeyHashWhenScriptPatternNotIsP2WHThisThrowsScriptException() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(this)) : false
         * (ScriptPattern.isP2SH(this)) : false
         * (ScriptPattern.isP2WH(this)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.ofEpochSecond(1700000000);
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
        }
    }

    //Sapient generated method id: ${c66148e0-bf25-3c41-b5a8-81f17b412acc}, hash: 29AD36A56A6745E5B3C80C8CD3886323
    @Test()
    public void getToAddressTest() throws ScriptException {
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(null);
        Instant instant = Instant.ofEpochSecond(1700000000);
        Script target = spy(Script.of(scriptChunkList, instant));
        doReturn(addressMock).when(target).getToAddress(networkMock, false);
        //Act Statement(s)
        Address result = target.getToAddress(networkMock);
        //Assert statement(s)
        assertThat(result, equalTo(addressMock));
        verify(target).getToAddress(networkMock, false);
    }

    //Sapient generated method id: ${5886d52e-7151-38cf-97c1-d535c816dbba}, hash: 13B99E29F3946C44A89CEAC3227AF8CF
    @Test()
    public void getToAddress1Test() throws ScriptException {
        //Arrange Statement(s)
        doReturn(networkMock).when(paramsMock).network();
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(null);
        Instant instant = Instant.ofEpochSecond(1700000000);
        Script target = spy(Script.of(scriptChunkList, instant));
        doReturn(addressMock).when(target).getToAddress(networkMock, false);
        //Act Statement(s)
        Address result = target.getToAddress(paramsMock);
        //Assert statement(s)
        assertThat(result, equalTo(addressMock));
        verify(paramsMock).network();
        verify(target).getToAddress(networkMock, false);
    }

    //Sapient generated method id: ${21e8d88a-7a71-3b47-abf2-ad17a8f9710b}, hash: 654EA618D56F517866A3C53C2DF28D90
    @Test()
    public void getToAddress2WhenScriptPatternIsP2PKHThis() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(this)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<LegacyAddress> legacyAddress = mockStatic(LegacyAddress.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            byte[] byteArray = new byte[]{};
            legacyAddress.when(() -> LegacyAddress.fromPubKeyHash(networkMock, byteArray)).thenReturn(legacyAddressMock);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.ofEpochSecond(1700000000);
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
        }
    }

    //Sapient generated method id: ${f5beb495-0358-39d0-98f4-b822e1e333a3}, hash: A26981F69635EEFE6ABDDF2194032636
    @Test()
    public void getToAddress2WhenScriptPatternIsP2SHThis() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(this)) : false
         * (ScriptPattern.isP2SH(this)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<LegacyAddress> legacyAddress = mockStatic(LegacyAddress.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            byte[] byteArray = new byte[]{};
            legacyAddress.when(() -> LegacyAddress.fromScriptHash(networkMock, byteArray)).thenReturn(legacyAddressMock);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.ofEpochSecond(1700000000);
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
        }
    }

    //Sapient generated method id: ${6c419781-20bc-301f-9f01-c4b73348177f}, hash: F3CBAEC907C00C678ADF57823EF319DC
    @Test()
    public void getToAddress2WhenScriptPatternIsP2PKThis() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2PKH(this)) : false
         * (ScriptPattern.isP2SH(this)) : false
         * (forcePayToPubKey) : true
         * (ScriptPattern.isP2PK(this)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ECKey> eCKey = mockStatic(ECKey.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            byte[] byteArray = new byte[]{};
            eCKey.when(() -> ECKey.fromPublicOnly(byteArray)).thenReturn(eCKeyMock);
            doReturn(addressMock).when(eCKeyMock).toAddress(ScriptType.P2PKH, networkMock);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.ofEpochSecond(1700000000);
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
        }
    }

    //Sapient generated method id: ${66b93e1f-6799-3c30-a98c-f138c2cdaa5c}, hash: 8716D162F746086D1A2A096DA64B1057
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
            Instant instant = Instant.ofEpochSecond(1700000000);
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

    //Sapient generated method id: ${e8020848-ae94-326f-b760-b3b0f25b8d21}, hash: 7F8DEEC1E8858A9C06B0CC555F958951
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
            Instant instant = Instant.ofEpochSecond(1700000000);
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

    //Sapient generated method id: ${8bb4aab9-c370-3a00-8cbe-2023f23f1007}, hash: 6CAAD712386464C5EBA0E6865A8A396A
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
            Instant instant = Instant.ofEpochSecond(1700000000);
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

    //Sapient generated method id: ${47bc576c-7a08-3c6f-adc2-2f431f3f171a}, hash: D0136F3084133DA6A8D8FE435FEBBD03
    @Test()
    public void getToAddress3Test() throws ScriptException {
        //Arrange Statement(s)
        doReturn(networkMock).when(paramsMock).network();
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(null);
        Instant instant = Instant.ofEpochSecond(1700000000);
        Script target = spy(Script.of(scriptChunkList, instant));
        doReturn(addressMock).when(target).getToAddress(networkMock, false);
        //Act Statement(s)
        Address result = target.getToAddress(paramsMock, false);
        //Assert statement(s)
        assertThat(result, equalTo(addressMock));
        verify(paramsMock).network();
        verify(target).getToAddress(networkMock, false);
    }

    //Sapient generated method id: ${7fc3654a-a66c-321b-aa94-8ba1b6cfb9ec}, hash: 50577BC16AE528601CE05F931A8B2FA5
    @Test()
    public void writeBytesWhenBufLengthLessThanOP_PUSHDATA1() throws IOException {
        /* Branches:
         * (buf.length < OP_PUSHDATA1) : true
         */
        //Arrange Statement(s)
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] byteArray = new byte[]{(byte) 0};
        //Act Statement(s)
        Script.writeBytes(byteArrayOutputStream, byteArray);
    }

    //Sapient generated method id: ${9d7e490f-9bf6-3245-8484-829a2940a9d9}, hash: 5B8DA5A33DDDE24303EABD9A7E949938
    @Test()
    public void writeBytesWhenBufLengthLessThan256() throws IOException {
        /* Branches:
         * (buf.length < OP_PUSHDATA1) : false
         * (buf.length < 256) : true
         */
        //Arrange Statement(s)
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 37, (byte) 38, (byte) 39, (byte) 40, (byte) 41, (byte) 42, (byte) 43, (byte) 44, (byte) 45, (byte) 46, (byte) 47, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 58, (byte) 59, (byte) 60, (byte) 61, (byte) 62, (byte) 63, (byte) 64, (byte) 65, (byte) 66, (byte) 67, (byte) 68, (byte) 69, (byte) 70, (byte) 71, (byte) 72, (byte) 73, (byte) 74, (byte) 75};
        //Act Statement(s)
        Script.writeBytes(byteArrayOutputStream, byteArray);
    }

    //Sapient generated method id: ${48daa7b9-bbf5-367c-8450-27b667139681}, hash: 4D8776C604B30D76580E930986A054D6
    @Ignore()
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
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteUtils.when(() -> ByteUtils.writeInt16LE(0, byteArrayOutputStream)).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            Script.writeBytes(byteArrayOutputStream, byteArray);
            //Assert statement(s)
            byteUtils.verify(() -> ByteUtils.writeInt16LE(0, byteArrayOutputStream), atLeast(1));
        }
    }

    //Sapient generated method id: ${fe4b95f7-8e1e-3e18-82ee-c0391f26e6fd}, hash: 009E242ECFEC1321B5E0373F2C3D5554
    @Ignore()
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
        RuntimeException runtimeException = new RuntimeException("Unimplemented");
        thrown.expect(RuntimeException.class);
        thrown.expectMessage(runtimeException.getMessage());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        Script.writeBytes(byteArrayOutputStream, byteArray);
    }

    //Sapient generated method id: ${29b303f4-bca9-389e-a119-a1a726e27680}, hash: 89DD4086881B99DDD20F714B7FBC362F
    @Test()
    public void createMultiSigOutputScriptWhenThresholdNotGreaterThan0ThrowsIllegalArgumentException() {
        /* Branches:
         * (threshold > 0) : false
         */
        //Arrange Statement(s)
        thrown.expect(IllegalArgumentException.class);
        List<ECKey> eCKeyList = new ArrayList<>();
        //Act Statement(s)
        Script.createMultiSigOutputScript(-1, eCKeyList);
    }

    //Sapient generated method id: ${2e473006-9436-365c-9b06-465578b217e3}, hash: 1142FA41BD0D85BBBBE2382DD2006A05
    @Test()
    public void createMultiSigOutputScriptWhenThresholdGreaterThanPubkeysSizeThrowsIllegalArgumentException() {
        /* Branches:
         * (threshold > 0) : true
         * (threshold <= pubkeys.size()) : false
         */
        //Arrange Statement(s)
        thrown.expect(IllegalArgumentException.class);
        List<ECKey> eCKeyList = new ArrayList<>();
        //Act Statement(s)
        Script.createMultiSigOutputScript(1, eCKeyList);
    }

    //Sapient generated method id: ${038f8db5-df0f-3f72-be0d-dee0936bf069}, hash: 64FBA62E3DAD045BBB287A9D1CEDBB54
    @Test()
    public void createMultiSigOutputScriptWhenPubkeysSizeGreaterThan16ThrowsIllegalArgumentException() {
        /* Branches:
         * (threshold > 0) : true
         * (threshold <= pubkeys.size()) : true
         * (pubkeys.size() <= 16) : false
         */
        //Arrange Statement(s)
        thrown.expect(IllegalArgumentException.class);
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
    }

    //Sapient generated method id: ${44cfdb7b-07c1-3c79-a6f1-b8241b68ed03}, hash: 3DB894338D92BE7877B9FFC542C275F7
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
            script.when(() -> Script.writeBytes((OutputStream) any(), eq(byteArray))).thenAnswer((Answer<Void>) invocation -> null);
            script.when(() -> Script.writeBytes((OutputStream) any(), eq(byteArray2))).thenAnswer((Answer<Void>) invocation -> null);
            script.when(() -> Script.writeBytes((OutputStream) any(), eq(byteArray3))).thenAnswer((Answer<Void>) invocation -> null);
            script.when(() -> Script.writeBytes((OutputStream) any(), eq(byteArray4))).thenAnswer((Answer<Void>) invocation -> null);
            script.when(() -> Script.encodeToOpN(4)).thenReturn(1);
            List<ECKey> eCKeyList = new ArrayList<>();
            eCKeyList.add(keyMock);
            eCKeyList.add(keyMock2);
            eCKeyList.add(keyMock3);
            eCKeyList.add(keyMock4);
            //Act Statement(s)
            byte[] result = Script.createMultiSigOutputScript(1, eCKeyList);
            byte[] byteResultArray = new byte[]{(byte) 1, (byte) 1, (byte) -82};
            //Assert statement(s)
            assertThat(result, equalTo(byteResultArray));
            assertThat(eCKeyList.size(), equalTo(4));
            assertThat(eCKeyList.get(0), is(instanceOf(ECKey.class)));
            verify(keyMock, atLeast(1)).getPubKey();
            verify(keyMock2, atLeast(1)).getPubKey();
            verify(keyMock3, atLeast(1)).getPubKey();
            verify(keyMock4, atLeast(1)).getPubKey();
            script.verify(() -> Script.encodeToOpN(1), atLeast(1));
            script.verify(() -> Script.writeBytes((OutputStream) any(), eq(byteArray)), atLeast(1));
            script.verify(() -> Script.writeBytes((OutputStream) any(), eq(byteArray2)), atLeast(1));
            script.verify(() -> Script.writeBytes((OutputStream) any(), eq(byteArray3)), atLeast(1));
            script.verify(() -> Script.writeBytes((OutputStream) any(), eq(byteArray4)), atLeast(1));
            script.verify(() -> Script.encodeToOpN(4), atLeast(1));
        }
    }

    //Sapient generated method id: ${b1f7e05f-63c8-311a-a2aa-56e6f4d1a251}, hash: 3C98FC5CD53EE8D2C9A025E7BD9C4005
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
        try (MockedStatic<Script> script = mockStatic(Script.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(keyMock).getPubKey();
            script.when(() -> Script.encodeToOpN(1)).thenReturn(1);
            script.when(() -> Script.writeBytes((OutputStream) any(), eq(byteArray))).thenAnswer((Answer<Void>) invocation -> null);
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
            script.verify(() -> Script.encodeToOpN(1), atLeast(1));
            script.verify(() -> Script.writeBytes((OutputStream) any(), eq(byteArray)), atLeast(1));
            script.verify(() -> Script.encodeToOpN(4), atLeast(1));
        }
    }

    //Sapient generated method id: ${e32a1106-be72-33a1-be1d-d304f21c5a8a}, hash: 42A0B87DBA4D0F747357F977C6716835
    @Ignore()
    @Test()
    public void createInputScriptTest() throws IOException {
        //Arrange Statement(s)
        try (MockedStatic<Script> script = mockStatic(Script.class, CALLS_REAL_METHODS)) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] byteArray = new byte[]{};
            script.when(() -> Script.writeBytes(byteArrayOutputStream, byteArray)).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray2 = new byte[]{};
            script.when(() -> Script.writeBytes(byteArrayOutputStream, byteArray2)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            byte[] result = Script.createInputScript(byteArray, byteArray2);
            //Assert statement(s)
            assertThat(result.length, equalTo(0));
            script.verify(() -> Script.writeBytes(byteArrayOutputStream, byteArray), atLeast(1));
            script.verify(() -> Script.writeBytes(byteArrayOutputStream, byteArray2), atLeast(1));
        }
    }

    //Sapient generated method id: ${5f84f9a3-8bec-3033-9284-98c000a93ba4}, hash: 7455E28CE5785846525E56E41ADAF903
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
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] byteArray = new byte[]{};
            script.when(() -> Script.writeBytes(byteArrayOutputStream, byteArray)).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray2 = new byte[]{};
            script.when(() -> Script.writeBytes(byteArrayOutputStream, byteArray2)).thenAnswer((Answer<Void>) invocation -> null);
            thrown.expect(RuntimeException.class);
            thrown.expectCause(is(instanceOf(IOException.class)));
            //Act Statement(s)
            Script.createInputScript(byteArray, byteArray2);
            //Assert statement(s)
            script.verify(() -> Script.writeBytes(byteArrayOutputStream, byteArray), atLeast(1));
            script.verify(() -> Script.writeBytes(byteArrayOutputStream, byteArray2), atLeast(1));
        }
    }

    //Sapient generated method id: ${44cd43bc-ae4c-3a5d-9c6f-bf73a429f3a7}, hash: 7D2BE7CC98D16C36349CF4D6FCC806B0
    @Ignore()
    @Test()
    public void createInputScript1Test() throws IOException {
        //Arrange Statement(s)
        try (MockedStatic<Script> script = mockStatic(Script.class, CALLS_REAL_METHODS)) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] byteArray = new byte[]{};
            script.when(() -> Script.writeBytes(byteArrayOutputStream, byteArray)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            byte[] result = Script.createInputScript(byteArray);
            //Assert statement(s)
            assertThat(result.length, equalTo(0));
            script.verify(() -> Script.writeBytes(byteArrayOutputStream, byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${0bc67822-12c5-3090-bab9-8159c556acf1}, hash: 44B44B087281DC326C59A8FFC99A8E03
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
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] byteArray = new byte[]{};
            script.when(() -> Script.writeBytes(byteArrayOutputStream, byteArray)).thenAnswer((Answer<Void>) invocation -> null);
            thrown.expect(RuntimeException.class);
            thrown.expectCause(is(instanceOf(IOException.class)));
            //Act Statement(s)
            Script.createInputScript(byteArray);
            //Assert statement(s)
            script.verify(() -> Script.writeBytes(byteArrayOutputStream, byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${0a1dbbc0-dd3e-379c-ac6d-31dbef7eb81d}, hash: CC0786E780FF0AAA682EC98E3FFD3A75
    @Test()
    public void createEmptyInputScriptWhenKeyIsNotNull() {
        /* Branches:
         * (ScriptPattern.isP2PKH(this)) : true
         * (key != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptBuilder> scriptBuilder = mockStatic(ScriptBuilder.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            scriptBuilder.when(() -> ScriptBuilder.createInputScript(null, eCKeyMock)).thenReturn(scriptMock);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.ofEpochSecond(1700000000);
            Script target = Script.of(scriptChunkList, instant);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(target)).thenReturn(true);
            //Act Statement(s)
            Script result = target.createEmptyInputScript(eCKeyMock, scriptMock2);
            //Assert statement(s)
            assertThat(result, equalTo(scriptMock));
            scriptBuilder.verify(() -> ScriptBuilder.createInputScript(null, eCKeyMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${305f45e9-cb87-3fa2-9cc7-8bec0be72044}, hash: CAE9969C3FD71E226F3FD88BE80E161B
    @Test()
    public void createEmptyInputScriptWhenKeyIsNullThrowsIllegalArgumentException() {
        /* Branches:
         * (ScriptPattern.isP2PKH(this)) : true
         * (key != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.ofEpochSecond(1700000000);
            Script target = Script.of(scriptChunkList, instant);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(target)).thenReturn(true);
            thrown.expect(IllegalArgumentException.class);
            ECKey eCKey = null;
            //Act Statement(s)
            target.createEmptyInputScript(eCKey, scriptMock);
            //Assert statement(s)
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${7d3b5116-97e0-30ae-92c3-06760033f8c7}, hash: B1D825B0AC5C3A2AC8033E7E663E787F
    @Test()
    public void createEmptyInputScriptWhenScriptPatternIsP2WPKHThis() {
        /* Branches:
         * (ScriptPattern.isP2PKH(this)) : false
         * (ScriptPattern.isP2WPKH(this)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.ofEpochSecond(1700000000);
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
        }
    }

    //Sapient generated method id: ${522baaee-5e06-3518-a757-5f87ea08cf27}, hash: C6EF100A79ED89F26293FAB015671DF5
    @Test()
    public void createEmptyInputScriptWhenScriptPatternIsP2PKThis() {
        /* Branches:
         * (ScriptPattern.isP2PKH(this)) : false
         * (ScriptPattern.isP2WPKH(this)) : false
         * (ScriptPattern.isP2PK(this)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptBuilder> scriptBuilder = mockStatic(ScriptBuilder.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            scriptBuilder.when(() -> ScriptBuilder.createInputScript(null)).thenReturn(scriptMock);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.ofEpochSecond(1700000000);
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
        }
    }

    //Sapient generated method id: ${93dfce7d-d8dd-30c1-9d7e-cdbc01bd4c3c}, hash: B0209A799A300F81A3C4380F16776E1E
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
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.ofEpochSecond(1700000000);
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
        }
    }

    //Sapient generated method id: ${bb7a82c4-c964-34b6-901d-796a83c3f52c}, hash: A816FC39251FF6EAB79BAA2652463FE2
    @Test()
    public void createEmptyInputScriptWhenRedeemScriptIsNotNull() {
        /* Branches:
         * (ScriptPattern.isP2PKH(this)) : false
         * (ScriptPattern.isP2WPKH(this)) : false
         * (ScriptPattern.isP2PK(this)) : false
         * (ScriptPattern.isP2SH(this)) : true
         * (redeemScript != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptBuilder> scriptBuilder = mockStatic(ScriptBuilder.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            scriptBuilder.when(() -> ScriptBuilder.createP2SHMultiSigInputScript(null, scriptMock2)).thenReturn(scriptMock);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.ofEpochSecond(1700000000);
            Script target = Script.of(scriptChunkList, instant);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PK(target)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2SH(target)).thenReturn(true);
            //Act Statement(s)
            Script result = target.createEmptyInputScript(eCKeyMock, scriptMock2);
            //Assert statement(s)
            assertThat(result, equalTo(scriptMock));
            scriptBuilder.verify(() -> ScriptBuilder.createP2SHMultiSigInputScript(null, scriptMock2), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${924fc5b1-0025-3f08-95c9-1f00a927b4d8}, hash: 2F87A7ACF8D8EE06114CE05023B0A0CF
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
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.ofEpochSecond(1700000000);
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
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(target), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2SH(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${5cb4bb66-7a8a-3202-8e10-d6b59cb5c09f}, hash: 96EEF6C2837E4D2B817C6ADA046A78C8
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
            Instant instant = Instant.ofEpochSecond(1700000000);
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

    //Sapient generated method id: ${68ffe24d-6883-320f-a154-65115f2ffd79}, hash: A7B27D9A0CF635FA60A69FAC5D9BBF8A
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
            Instant instant = Instant.ofEpochSecond(1700000000);
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

    //Sapient generated method id: ${f5b06c53-f8fb-3741-8992-9d40d13f1d25}, hash: A16BDFCAADE4CD281DF87EF7101CDBCA
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
            Instant instant = Instant.ofEpochSecond(1700000000);
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

    //Sapient generated method id: ${7015688f-681e-3c03-8d15-ac0677ed4d9f}, hash: 7FEF9A6C6922E374FF58C22EAC73328C
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
        //Instant instant = Instant.ofEpochSecond(1700000000);
        //Script target = Script.of(scriptChunkList, instant);
        //int result = target.getSigInsertionIndex(sha256HashMock, eCKeyMock);
        //assertThat(result, equalTo(0));
        //script.verify(() -> Script.parse(byteArray), atLeast(1));
    }

    //Sapient generated method id: ${46de80ed-d047-3ed9-beb3-614a4a9347a2}, hash: DA012E22529F18F81F4038293BEE4292
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
        //Instant instant = Instant.ofEpochSecond(1700000000);
        //Script target = Script.of(scriptChunkList, instant);
        //int result = target.getSigInsertionIndex(sha256HashMock, eCKeyMock);
        //assertThat(result, equalTo(0));
        //script.verify(() -> Script.parse(byteArray), atLeast(1));
    }

    //Sapient generated method id: ${f5d75a3e-1991-370e-ade5-c52b591841dd}, hash: FD0F980663E8B3AC98CF19270B759259
    @Test()
    public void getSigInsertionIndexWhenMyIndexNotLessThanRedeemScriptFindSigInRedeemChunkDataHash() throws SignatureDecodeException {
        //TODO: Please change the modifier of findKeyInRedeem from private to default to isolate the test case scenario
        //TODO: Please change the modifier of findSigInRedeem from private to default to isolate the test case scenario
        //Act Statement(s)
        //Assert statement(s)
        //byte[] byteArray = new byte[] {};
        //script.when(() -> Script.parse(byteArray)).thenReturn(scriptMock);
        //doReturn(-1).when(scriptMock).findKeyInRedeem(eCKeyMock);
        //byte[] byteArray2 = new byte[] {};
        //doReturn(-1).when(scriptMock).findSigInRedeem(byteArray2, sha256HashMock);
        //List<ScriptChunk> scriptChunkList = new ArrayList<>();
        //scriptChunkList.add(null);
        //scriptChunkList.add(null);
        //scriptChunkList.add(null);
        //Instant instant = Instant.ofEpochSecond(1700000000);
        //Script target = Script.of(scriptChunkList, instant);
        //int result = target.getSigInsertionIndex(sha256HashMock, eCKeyMock);
        //assertThat(result, equalTo(1));
        //script.verify(() -> Script.parse(byteArray), atLeast(1));
    }

    //Sapient generated method id: ${b21c161a-0385-32f9-a887-cf73a1becd5d}, hash: 50CE3E56DE396F6857A6C109F888F18F
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
        //Instant instant = Instant.ofEpochSecond(1700000000);
        //Script target = Script.of(scriptChunkList, instant);
        //int result = target.getSigInsertionIndex(sha256HashMock, eCKeyMock);
        //assertThat(result, equalTo(1));
        //script.verify(() -> Script.parse(byteArray), atLeast(1));
    }

    //Sapient generated method id: ${84b05029-5716-3172-96d4-7291310a0091}, hash: 7A40F38DEE31675182931020535FE6C3
    @Test()
    public void getPubKeysWhenScriptPatternNotIsSentToMultisigThisThrowsScriptException() {
        /* Branches:
         * (!ScriptPattern.isSentToMultisig(this)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.ofEpochSecond(1700000000);
            Script target = Script.of(scriptChunkList, instant);
            scriptPattern.when(() -> ScriptPattern.isSentToMultisig(target)).thenReturn(false);
            thrown.expect(ScriptException.class);
            //Act Statement(s)
            target.getPubKeys();
            //Assert statement(s)
            scriptPattern.verify(() -> ScriptPattern.isSentToMultisig(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${ee2983eb-318a-3054-82c2-344d10bcf0fa}, hash: AAD45F1EFCBEA89D5BF1777252978EB2
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
            Instant instant = Instant.ofEpochSecond(1700000000);
            Script target = Script.of(scriptChunkList, instant);
            scriptPattern.when(() -> ScriptPattern.isSentToMultisig(target)).thenReturn(true);
            //Act Statement(s)
            List<ECKey> result = target.getPubKeys();
            //Assert statement(s)
            assertThat(result.size(), equalTo(1));
            assertThat(result.get(0), is(instanceOf(ECKey.class)));
            script.verify(() -> Script.decodeFromOpN(0), atLeast(1));
            eCKey.verify(() -> ECKey.fromPublicOnly(byteArray), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isSentToMultisig(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${c3b95ecd-71b8-3a4d-8e8f-7ac0f35f31a4}, hash: 42D5AD4FF341CE535B42317D9B008484
    @Test()
    public void decodeFromOpNWhenOpcodeEqualsOP_0() {
        /* Branches:
         * (opcode == OP_0) : true
         * (opcode == OP_0) : true
         */
        //Act Statement(s)
        int result = Script.decodeFromOpN(0);
        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${ec5245aa-7914-3611-8041-606aeb9f04ce}, hash: 5EF328A0F33F83890F7FEF442160CEC6
    @Test()
    public void decodeFromOpNWhenOpcodeEqualsOP_1NEGATE() {
        /* Branches:
         * (opcode == OP_0) : false
         * (opcode == OP_1NEGATE) : true
         * (opcode == OP_0) : false
         * (opcode == OP_1NEGATE) : true
         */
        //Act Statement(s)
        int result = Script.decodeFromOpN(79);
        //Assert statement(s)
        assertThat(result, equalTo(-1));
    }

    //Sapient generated method id: ${18a19c7e-97b7-3ac3-8022-d3568bffd4fc}, hash: 11DCA3156088C22AC21E424219B50A6B
    @Test()
    public void decodeFromOpNWhenOpcodeGreaterThanOP_16ThrowsIllegalArgumentException() {
        /* Branches:
         * (opcode == OP_0) : false
         * (opcode == OP_1NEGATE) : false
         * (opcode >= OP_1) : true
         * (opcode <= OP_16) : false
         */
        //Arrange Statement(s)
        thrown.expect(IllegalArgumentException.class);
        //Act Statement(s)
        Script.decodeFromOpN(97);
    }

    //Sapient generated method id: ${55525088-83be-30ba-841c-1e45a45a5425}, hash: 4F5644542B0C66257B7C2F781FAABDAD
    @Test()
    public void decodeFromOpNWhenOpcodeNotEqualsOP_1NEGATE() {
        /* Branches:
         * (opcode == OP_0) : false
         * (opcode == OP_1NEGATE) : false
         * (opcode >= OP_1) : true
         * (opcode <= OP_16) : true
         * (opcode == OP_0) : false
         * (opcode == OP_1NEGATE) : false
         */
        //Act Statement(s)
        int result = Script.decodeFromOpN(81);
        //Assert statement(s)
        assertThat(result, equalTo(1));
    }

    //Sapient generated method id: ${c5500575-186e-389b-a247-c6ea3b5e042d}, hash: 47502F1422EB3FE29AD6396AA20DA0FF
    @Test()
    public void encodeToOpNWhenValueGreaterThan16ThrowsIllegalArgumentException() {
        /* Branches:
         * (value >= -1) : true
         * (value <= 16) : false
         */
        //Arrange Statement(s)
        thrown.expect(IllegalArgumentException.class);
        //Act Statement(s)
        Script.encodeToOpN(17);
    }

    //Sapient generated method id: ${1a49cfc1-aae6-3c3e-bc48-4cae655fa793}, hash: 066FD5B4721EE1B7F0AD28D7ADC58961
    @Test()
    public void encodeToOpNWhenValueEquals0() {
        /* Branches:
         * (value >= -1) : true
         * (value <= 16) : true
         * (value == 0) : true
         */
        //Act Statement(s)
        int result = Script.encodeToOpN(0);
        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${ddcd1068-35c7-35a3-ba97-831030f31d41}, hash: C53C11010D505F70D0B85312DC6288E4
    @Test()
    public void encodeToOpNWhenValueEqualsMinus1() {
        /* Branches:
         * (value >= -1) : true
         * (value <= 16) : true
         * (value == 0) : false
         * (value == -1) : true
         */
        //Act Statement(s)
        int result = Script.encodeToOpN(-1);
        //Assert statement(s)
        assertThat(result, equalTo(79));
    }

    //Sapient generated method id: ${380ea87f-6d87-3091-8945-631788c2d317}, hash: 55B3DEECCBE638EFDA7FF9F4597E81C7
    @Test()
    public void encodeToOpNWhenValueNotEqualsMinus1() {
        /* Branches:
         * (value >= -1) : true
         * (value <= 16) : true
         * (value == 0) : false
         * (value == -1) : false
         */
        //Act Statement(s)
        int result = Script.encodeToOpN(1);
        //Assert statement(s)
        assertThat(result, equalTo(81));
    }

    //Sapient generated method id: ${8f0652b0-7fb8-3a5b-a1dc-2bc683ea34a7}, hash: A3E175A76907C4FC674887BEF48495C7
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
        byte[] byteArray = new byte[]{(byte) 0};
        //Act Statement(s)
        int result = Script.getSigOpCount(byteArray);
        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${1ad27a40-0648-31df-8c5a-c31cf9435eac}, hash: 65613B1AE55C8B79F9DB79A2A3DCEC50
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
        thrown.expect(IllegalStateException.class);
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        Script.getSigOpCount(byteArray);
    }

    //Sapient generated method id: ${84f5adfc-d16a-32c0-9b4c-f436a2d081b5}, hash: 2A7307A888AE082EE0712418F3B95D32
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

    //Sapient generated method id: ${0386d0ab-b974-35ed-9bb6-4a7c1e48f0fb}, hash: 00CABECA2C791F36F4C61E67D3635B4D
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
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        int result = Script.getSigOpCount(byteArray);
        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${8beb9089-d098-3c39-a498-0d613e64f383}, hash: 00695B805BD75534434105355F556BD6
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
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            int result = Script.getSigOpCount(byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(0));
            byteUtils.verify(() -> ByteUtils.readUint32(byteArrayInputStream), atLeast(1));
        }
    }

    //Sapient generated method id: ${4b7f0f99-5f90-3b45-8025-9819d3b570a4}, hash: 0E56EA7988D43E1205B21E7E14427682
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

    //Sapient generated method id: ${38a9fc63-8f65-36ad-9d8f-647403c3e5f0}, hash: 6F387FA92FCED7B65DCBFC9445F37010
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
        thrown.expect(IllegalStateException.class);
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        Script.getP2SHSigOpCount(byteArray);
    }

    //Sapient generated method id: ${92c71f12-d65a-3104-bf0c-0c9bea3b2918}, hash: 4064782F13A967294EFAF0E716F8FB47
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

    //Sapient generated method id: ${b10c2b5e-b84b-3c2a-ab7c-e899cafa27fd}, hash: 49617AF010FFC68B4C314A9D03B13050
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
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        long result = Script.getP2SHSigOpCount(byteArray);
        //Assert statement(s)
        assertThat(result, equalTo(0L));
    }

    //Sapient generated method id: ${94e245a5-9c7d-37c8-8276-9a2cab2f17fd}, hash: E1E00B725412E72252EA5D286ACD081A
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
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: chunk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Script> script = mockStatic(Script.class, CALLS_REAL_METHODS)) {
            List list = new ArrayList<>();
            Script script2 = Script.of(list);
            script.when(() -> Script.parse((byte[]) null)).thenReturn(script2);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            long result = Script.getP2SHSigOpCount(byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(0L));
            script.verify(() -> Script.parse((byte[]) null), atLeast(1));
        }
    }

    //Sapient generated method id: ${c251917c-4144-3f6f-a093-ed6757da6760}, hash: DCE0B18BE253E5E57C24C558F9727404
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
            byte[] byteArray = new byte[]{(byte) 0};
            //Act Statement(s)
            long result = Script.getP2SHSigOpCount(byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(0L));
            byteUtils.verify(() -> ByteUtils.readUint32(byteArrayInputStream), atLeast(1));
        }
    }

    //Sapient generated method id: ${01067141-33e9-36f2-ba2c-0fe86b4aa4aa}, hash: 3453495A78A92BA9EC0BD38723C6A1DA
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
            Instant instant = Instant.ofEpochSecond(1700000000);
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

    //Sapient generated method id: ${3525cb7f-a2a0-3a3f-b2c8-dc9f0cdb2710}, hash: 76399D6B086AB08D8B513754DF4EC2AA
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
            Instant instant = Instant.ofEpochSecond(1700000000);
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

    //Sapient generated method id: ${5a42fd2e-6d90-364e-8a23-697eee8d4187}, hash: F31188B162237681BEBAFBC9EB05C46D
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
            Instant instant = Instant.ofEpochSecond(1700000000);
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

    //Sapient generated method id: ${89f1a64f-a232-3534-867f-d0bc9adf20a8}, hash: DE4AE08159FE7C141ACC9AC087396019
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
            Instant instant = Instant.ofEpochSecond(1700000000);
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

    //Sapient generated method id: ${3a1c2807-4eaa-375f-88da-40cf3c91b607}, hash: 4BE9F5086A16B78A37CDC1138EBD955C
    @Test()
    public void getNumberOfBytesRequiredToSpendWhenRedeemScriptIsNotNull() {
        /* Branches:
         * (ScriptPattern.isP2SH(this)) : true
         * (redeemScript != null) : true
         */
        //Arrange Statement(s)
        Script redeemScriptMock = mock(Script.class);
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            doReturn(0).when(redeemScriptMock).getNumberOfSignaturesRequiredToSpend();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(redeemScriptMock).program();
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.ofEpochSecond(1700000000);
            Script target = Script.of(scriptChunkList, instant);
            scriptPattern.when(() -> ScriptPattern.isP2SH(target)).thenReturn(true);
            //Act Statement(s)
            int result = target.getNumberOfBytesRequiredToSpend(eCKeyMock, redeemScriptMock);
            //Assert statement(s)
            assertThat(result, equalTo(0));
            verify(redeemScriptMock).getNumberOfSignaturesRequiredToSpend();
            verify(redeemScriptMock).program();
            scriptPattern.verify(() -> ScriptPattern.isP2SH(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${0544cf39-d05a-3da7-b27a-a9f207c9eb80}, hash: 084751C8EFD8A60AAA9B361EE3ABE795
    @Test()
    public void getNumberOfBytesRequiredToSpendWhenRedeemScriptIsNullThrowsIllegalArgumentException() {
        /* Branches:
         * (ScriptPattern.isP2SH(this)) : true
         * (redeemScript != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.ofEpochSecond(1700000000);
            Script target = Script.of(scriptChunkList, instant);
            scriptPattern.when(() -> ScriptPattern.isP2SH(target)).thenReturn(true);
            thrown.expect(IllegalArgumentException.class);
            Script script = null;
            //Act Statement(s)
            target.getNumberOfBytesRequiredToSpend(eCKeyMock, script);
            //Assert statement(s)
            scriptPattern.verify(() -> ScriptPattern.isP2SH(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${94a311ab-0d45-3a6e-90f8-7260d0fde17b}, hash: 2AA2506788210D47E432E56E9975B410
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
            Instant instant = Instant.ofEpochSecond(1700000000);
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

    //Sapient generated method id: ${65ca4651-ab8e-3f2b-82f3-c130262c2436}, hash: 6184D17B859D40D83AC784C62770EA2E
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
            Instant instant = Instant.ofEpochSecond(1700000000);
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

    //Sapient generated method id: ${d6435ab1-1c23-35c4-af08-a32346c2826d}, hash: D7784E8617C60995431C22C216150F2E
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
            Instant instant = Instant.ofEpochSecond(1700000000);
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

    //Sapient generated method id: ${f683bcf3-d467-3e10-b159-137b3b999899}, hash: 780DD1FCD84CA79872657A0F3DA12F63
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
            Instant instant = Instant.ofEpochSecond(1700000000);
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

    //Sapient generated method id: ${ce02983f-4173-385a-af7d-6b9ae71a0655}, hash: D45989DC9492E7C0C556768EDFE5C8F8
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
            Instant instant = Instant.ofEpochSecond(1700000000);
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

    //Sapient generated method id: ${7ec182a8-70c1-3aba-83a8-5ff87f2acb7e}, hash: FC10CEDA0549C6CD7E11D63DA636F926
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
            Instant instant = Instant.ofEpochSecond(1700000000);
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

    //Sapient generated method id: ${d63ca971-340d-3ff4-bd29-ca64bc75c232}, hash: D80938A3E1AF8F1208F753AD4C7CD114
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
            Instant instant = Instant.ofEpochSecond(1700000000);
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

    //Sapient generated method id: ${ce7c6b22-ac86-3da9-8d2c-b356eccc19ea}, hash: 3019FBC89DE08E6CCB35ADF06C0FB345
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

    //Sapient generated method id: ${91ba9cff-72f0-35c6-8c59-71e8992bfed4}, hash: 29E8FC9A74E3655C72D093D01178B872
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
        byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5};
        byte[] byteArray2 = new byte[]{(byte) 2, (byte) 3};
        //Act Statement(s)
        Script.removeAllInstancesOf(byteArray, byteArray2);
    }

    //Sapient generated method id: ${60f4dfb7-cde0-3ee2-95eb-ef1ebd20c773}, hash: 8D879A437B3DBD9045A47DFB4432F149
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
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1};
        byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2};
        //Act Statement(s)
        byte[] result = Script.removeAllInstancesOf(byteArray, byteArray2);
        byte[] byteResultArray = new byte[]{(byte) 76};
        //Assert statement(s)
        assertThat(result, equalTo(byteResultArray));
    }

    //Sapient generated method id: ${a8997744-a55f-3636-adbd-80bd6a914138}, hash: 196FD7CE4EF3B880CA5F1E2628C9828D
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
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1};
        byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2};
        //Act Statement(s)
        Script.removeAllInstancesOf(byteArray, byteArray2);
    }

    //Sapient generated method id: ${aaa22c19-109f-3f71-9415-fea07ee55dd2}, hash: EAB30B6E0E4704AD47DFBF052768BD88
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
            byte[] byteResultArray = new byte[]{(byte) 77};
            //Assert statement(s)
            assertThat(result, equalTo(byteResultArray));
            byteUtils.verify(() -> ByteUtils.readUint16(byteArray, 1), atLeast(1));
        }
    }

    //Sapient generated method id: ${3f993896-5b79-398f-8191-1d3305ae6087}, hash: BC545282D4D4FB08EC700D72ABAAB6B8
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
        byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5};
        byte[] byteArray2 = new byte[]{(byte) 3, (byte) 4};
        //Act Statement(s)
        Script.removeAllInstancesOf(byteArray, byteArray2);
    }

    //Sapient generated method id: ${767e4e99-2879-3710-893a-108556d1cc56}, hash: 2EC6A7E2CE187F81F775A92432DAC371
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
            byte[] byteResultArray = new byte[]{(byte) 78};
            //Assert statement(s)
            assertThat(result, equalTo(byteResultArray));
            byteUtils.verify(() -> ByteUtils.readUint32(byteArray, 1), atLeast(1));
        }
    }

    //Sapient generated method id: ${68e875cf-91d9-3f96-8bf1-84eb1dd62cc2}, hash: 8FDE19E5C9B3886D424ABA0F3CF8621B
    @Test()
    public void removeAllInstancesOfWhenOpcodeNotEqualsOP_PUSHDATA1AndOpcodeNotEqualsOP_PUSHDATA2AndOpcodeNotEqualsOP_PUSHDATA4AndSkipI() throws IOException {
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
        byte[] byteResultArray = new byte[]{(byte) -1};
        //Assert statement(s)
        assertThat(result, equalTo(byteResultArray));
    }

    //Sapient generated method id: ${fd786d48-7a0b-3594-8fc4-b6092c4f4d16}, hash: EA479B914CE770FF5B6576B75B3B916A
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
        //Assert statement(s)
        assertThat(result.length, equalTo(0));
    }

    //Sapient generated method id: ${251486ef-6d8b-39bd-a22d-32eced7474d7}, hash: 30E23CD5C43B2FBED243C89B421987EA
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
        byte[] byteArray = new byte[]{(byte) -1};
        byte[] byteArray2 = new byte[]{(byte) 0};
        //Act Statement(s)
        Script.removeAllInstancesOf(byteArray, byteArray2);
    }

    //Sapient generated method id: ${27ece1d8-7279-370d-8e3a-a2ee6061d884}, hash: 9F41D1BD1D2AA1F7A45729327F2BD06E
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

    //Sapient generated method id: ${4070f01a-a5eb-371d-806d-89fab1a50679}, hash: D7F5B5A2426A7026A63274281F29883E
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

    //Sapient generated method id: ${f3456604-5e24-3b28-a194-1e6e1e3aef5c}, hash: 795FCBB99438F9CDFACD5D68C244CD7B
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

    //Sapient generated method id: ${f70d2eb6-c018-3352-9aa6-d0a803f76ba9}, hash: 9A9CAEB90F1A7D14703911CDC13FA9E8
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

    //Sapient generated method id: ${275bb89f-caa8-3344-a60a-fe2eac5b20b2}, hash: FC5D05E18B6EFBF4153771D1F35D86AF
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

    //Sapient generated method id: ${afc61e45-6cfa-3885-adf7-6a10f906f502}, hash: 8190DA6D814B6C632125336C124F678E
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

    //Sapient generated method id: ${df6d4581-535d-3be2-b97b-46b1888ba8d2}, hash: E530F4C0FEC58CB47B47AB6B52AF2040
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

    //Sapient generated method id: ${dcb2ba22-9860-3083-a91e-a6a99d0f9a62}, hash: A92952940CB8EECA354002B6E4364A28
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

    //Sapient generated method id: ${04e72f68-64e3-315e-b7b9-16d4e1a79527}, hash: 87E6543E60E75C73FF844B2D3467EC0F
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

    //Sapient generated method id: ${12ce1d91-e426-3c1c-aaef-ab6bbe7b1efd}, hash: B52F4C37E6BAEC08AE5E7E017825D66E
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

    //Sapient generated method id: ${467f4667-191a-3a63-b6d2-be30d5402b76}, hash: 83712676856F2CDDE74E8067E85D780D
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

    //Sapient generated method id: ${1a3e0781-f170-318d-b5ba-129ef042641e}, hash: 8257362AC6CE3AAC3C91EDCCA49380E3
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

    //Sapient generated method id: ${adefb7fa-adfd-3952-b2d5-33cda09f4372}, hash: 9398387171A2AA154CB8BDE10D527B6C
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

    //Sapient generated method id: ${9f62b1ec-1b6a-38f6-85e3-258e84ebb633}, hash: DEDFBD237ADD48343992A73B2CB945B8
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

    //Sapient generated method id: ${7345c63f-9c86-328d-84b2-8f6fea08459d}, hash: DC38720BC84EC4F79455A33474E2699A
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

    //Sapient generated method id: ${323d254d-ce69-360b-94e8-11aed03fa29b}, hash: 0CF592578A504FF04FD8DA6AE68321EE
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

    //Sapient generated method id: ${b202bb72-fb04-304f-b072-c00817e50596}, hash: 74928FA5EFA3D44550E3AC01ABEBD142
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

    //Sapient generated method id: ${15846579-25e7-3c00-9953-e49cfbb40f4c}, hash: 26F7DAFA1E969C8B8C6DC52FE8C38998
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

    //Sapient generated method id: ${e71d306b-b7f9-32b1-8f09-97d7c4c6c45c}, hash: 994F13095E780F669D12CE742A274DCC
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

    //Sapient generated method id: ${272947a1-318a-34a5-a7a6-44af4a10f96c}, hash: 16748CFE2CE876BA894D041427C7E93F
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

    //Sapient generated method id: ${7e703d29-dadf-34e8-8c8b-d240cbc3421e}, hash: 9C69D3E7E6A7D408E7DCBFBC09AD0187
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
        //Assert statement(s)
        assertThat(byteList.size(), equalTo(6));
        assertThat(byteList.get(0), is(instanceOf(byte[].class)));
        verify(chunkMock).size();
    }

    //Sapient generated method id: ${9fde61e9-71d3-39fb-ac2b-5b7a4673036a}, hash: D608B08CD80093980258C1F8A7150653
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
        //Assert statement(s)
        assertThat(byteList.size(), equalTo(6));
        assertThat(byteList.get(0), is(instanceOf(byte[].class)));
        verify(chunkMock).size();
    }

    //Sapient generated method id: ${27364871-59e5-3b1b-b5e9-f0df4fa0bd7d}, hash: A1695649A181D3D3C47D3A32C066575B
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
        Transaction transaction = new Transaction();
        List list = new ArrayList<>();
        Script script = Script.of(list);
        byte[] byteArray = new byte[]{(byte) 0};
        LinkedList<byte[]> byteList = new LinkedList<>();
        byteList.add(byteArray);
        Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
        //Act Statement(s)
        Script.executeScript(transaction, 0L, script, byteList, scriptVerifyFlagSet);
    }

    //Sapient generated method id: ${9effe6dd-840a-3f63-af80-eec306414d85}, hash: E49A52E2E804DE7A902C1977CD4BEC8C
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
        thrown.expect(ScriptException.class);
        Transaction transaction = new Transaction();
        List list = new ArrayList<>();
        Script script = Script.of(list);
        byte[] byteArray = new byte[]{(byte) 0};
        LinkedList<byte[]> byteList = new LinkedList<>();
        byteList.add(byteArray);
        Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
        //Act Statement(s)
        Script.executeScript(transaction, 0L, script, byteList, scriptVerifyFlagSet);
    }

    //Sapient generated method id: ${38b34eaf-66c8-3cb4-86e1-650a271986f8}, hash: DC5A1643168C1D4D68D521FEEA4061F8
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
        thrown.expect(ScriptException.class);
        Transaction transaction = new Transaction();
        List list = new ArrayList<>();
        Script script = Script.of(list);
        byte[] byteArray = new byte[]{(byte) 0};
        LinkedList<byte[]> byteList = new LinkedList<>();
        byteList.add(byteArray);
        Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
        scriptVerifyFlagSet.add(Script.VerifyFlag.P2SH);
        scriptVerifyFlagSet.add(Script.VerifyFlag.STRICTENC);
        scriptVerifyFlagSet.add(Script.VerifyFlag.DERSIG);
        scriptVerifyFlagSet.add(Script.VerifyFlag.LOW_S);
        scriptVerifyFlagSet.add(Script.VerifyFlag.NULLDUMMY);
        scriptVerifyFlagSet.add(Script.VerifyFlag.SIGPUSHONLY);
        scriptVerifyFlagSet.add(Script.VerifyFlag.MINIMALDATA);
        scriptVerifyFlagSet.add(Script.VerifyFlag.DISCOURAGE_UPGRADABLE_NOPS);
        scriptVerifyFlagSet.add(Script.VerifyFlag.CLEANSTACK);
        scriptVerifyFlagSet.add(Script.VerifyFlag.CHECKLOCKTIMEVERIFY);
        scriptVerifyFlagSet.add(Script.VerifyFlag.CHECKSEQUENCEVERIFY);
        //Act Statement(s)
        Script.executeScript(transaction, 0L, script, byteList, scriptVerifyFlagSet);
    }

    //Sapient generated method id: ${2075f36e-8890-3407-8631-6f8b2bf738fd}, hash: 8F321CEE1049D6C38D64B6AFABDFF832
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
        thrown.expect(ScriptException.class);
        Transaction transaction = new Transaction();
        List list = new ArrayList<>();
        Script script = Script.of(list);
        byte[] byteArray = new byte[]{(byte) 0};
        LinkedList<byte[]> byteList = new LinkedList<>();
        byteList.add(byteArray);
        Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
        //Act Statement(s)
        Script.executeScript(transaction, 0L, script, byteList, scriptVerifyFlagSet);
    }

    //Sapient generated method id: ${b6562af7-e7c9-3b53-98d1-b412d9ff2b1c}, hash: 362A319ACABCA57A62437FCF03093195
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
        thrown.expect(ScriptException.class);
        Transaction transaction = new Transaction();
        List list = new ArrayList<>();
        Script script = Script.of(list);
        byte[] byteArray = new byte[]{(byte) 0};
        LinkedList<byte[]> byteList = new LinkedList<>();
        byteList.add(byteArray);
        Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
        //Act Statement(s)
        Script.executeScript(transaction, 0L, script, byteList, scriptVerifyFlagSet);
    }

    //Sapient generated method id: ${92e092ec-bbe9-39f2-a95e-34da91c4a1d9}, hash: 9A5466E44AF807CC3873164FBFCAA042
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
        thrown.expect(ScriptException.class);
        Transaction transaction = new Transaction();
        List list = new ArrayList<>();
        Script script = Script.of(list);
        byte[] byteArray = new byte[]{(byte) 0};
        LinkedList<byte[]> byteList = new LinkedList<>();
        byteList.add(byteArray);
        Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
        //Act Statement(s)
        Script.executeScript(transaction, 0L, script, byteList, scriptVerifyFlagSet);
    }

    //Sapient generated method id: ${bebf502f-ad9a-3074-bad4-f2c64b1ec8ba}, hash: B71DD7B78EA84650574247F55E6B3633
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
        thrown.expect(ScriptException.class);
        Transaction transaction = new Transaction();
        List list = new ArrayList<>();
        Script script = Script.of(list);
        byte[] byteArray = new byte[]{(byte) 0};
        LinkedList<byte[]> byteList = new LinkedList<>();
        byteList.add(byteArray);
        Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
        //Act Statement(s)
        Script.executeScript(transaction, 0L, script, byteList, scriptVerifyFlagSet);
    }

    //Sapient generated method id: ${4ee67693-79a6-3aab-a329-e9971fb02c9d}, hash: 485EC2FF01698679D93976CDF5D4A834
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
        thrown.expect(ScriptException.class);
        Transaction transaction = new Transaction();
        List list = new ArrayList<>();
        Script script = Script.of(list);
        byte[] byteArray = new byte[]{(byte) 0};
        LinkedList<byte[]> byteList = new LinkedList<>();
        byteList.add(byteArray);
        Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
        //Act Statement(s)
        Script.executeScript(transaction, 0L, script, byteList, scriptVerifyFlagSet);
    }

    //Sapient generated method id: ${7d7b92d7-762d-39b9-a2ac-a3d0b1bf80d6}, hash: 5501C1A114648930C18D9F3D945176AB
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
        thrown.expect(ScriptException.class);
        Transaction transaction = new Transaction();
        List list = new ArrayList<>();
        Script script = Script.of(list);
        byte[] byteArray = new byte[]{(byte) 0};
        LinkedList<byte[]> byteList = new LinkedList<>();
        byteList.add(byteArray);
        Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
        scriptVerifyFlagSet.add(Script.VerifyFlag.P2SH);
        scriptVerifyFlagSet.add(Script.VerifyFlag.STRICTENC);
        scriptVerifyFlagSet.add(Script.VerifyFlag.DERSIG);
        scriptVerifyFlagSet.add(Script.VerifyFlag.LOW_S);
        scriptVerifyFlagSet.add(Script.VerifyFlag.NULLDUMMY);
        scriptVerifyFlagSet.add(Script.VerifyFlag.SIGPUSHONLY);
        scriptVerifyFlagSet.add(Script.VerifyFlag.MINIMALDATA);
        scriptVerifyFlagSet.add(Script.VerifyFlag.DISCOURAGE_UPGRADABLE_NOPS);
        scriptVerifyFlagSet.add(Script.VerifyFlag.CLEANSTACK);
        scriptVerifyFlagSet.add(Script.VerifyFlag.CHECKLOCKTIMEVERIFY);
        scriptVerifyFlagSet.add(Script.VerifyFlag.CHECKSEQUENCEVERIFY);
        //Act Statement(s)
        Script.executeScript(transaction, 0L, script, byteList, scriptVerifyFlagSet);
    }

    //Sapient generated method id: ${23c57e33-960b-3396-a758-d881fe08ca66}, hash: FDA9CB5D318138DDA72AF75E850F186A
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
        Transaction transaction = new Transaction();
        List list = new ArrayList<>();
        Script script = Script.of(list);
        byte[] byteArray = new byte[]{(byte) 0};
        LinkedList<byte[]> byteList = new LinkedList<>();
        byteList.add(byteArray);
        Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
        //Act Statement(s)
        Script.executeScript(transaction, 0L, script, byteList, scriptVerifyFlagSet);
    }

    //Sapient generated method id: ${170827e9-331f-3690-9b0b-47dbbcfbd6a5}, hash: A52B2A5A39500926202146EC65270F66
    @Test()
    public void correctlySpendsWhenWitnessGetPushCountLessThan2ThrowsScriptException() throws ScriptException {
        /* Branches:
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : true
         * (witness.getPushCount() < 2) : true
         */
        //Arrange Statement(s)
        TransactionWitness witnessMock = mock(TransactionWitness.class, "correctlySpends_transactionWitness1");
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            doReturn(0).when(witnessMock).getPushCount();
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(true);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.ofEpochSecond(1700000000);
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

    //Sapient generated method id: ${64e3c818-3224-3275-8b99-9f151ab48c57}, hash: 4C70DA9FA54232B498AFB7AE6FFBCCC9
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
            Instant instant = Instant.ofEpochSecond(1700000000);
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

    //Sapient generated method id: ${85f69abd-893f-39e4-9fa6-647ca1278504}, hash: E88BD99F6B4FFA4687ABB5EC85A56D2F
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
            Instant instant = Instant.ofEpochSecond(1700000000);
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

    //Sapient generated method id: ${7e128ac6-f9d4-379a-bada-fe641589b17f}, hash: 6D7698B94C3DE676A076159499F62E34
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
            Instant instant = Instant.ofEpochSecond(1700000000);
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

    //Sapient generated method id: ${b246e1cc-eb52-34c1-9a71-cd8e92f97433}, hash: 5E5416C6B500118CFFEAA148548F6013
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
            Instant instant = Instant.ofEpochSecond(1700000000);
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

    //Sapient generated method id: ${54f4b76a-979f-35ac-8d36-5718825dc44c}, hash: 02D264598DC3D4EE19D17DA88CEEFAA0
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
            Instant instant = Instant.ofEpochSecond(1700000000);
            Script target = spy(Script.of(scriptChunkList, instant));
            Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
            doNothing().when(target).correctlySpends(transactionMock, 0L, scriptMock, scriptVerifyFlagSet);
            //Act Statement(s)
            target.correctlySpends(transactionMock, 0, transactionWitnessMock, coinMock, scriptMock, scriptVerifyFlagSet);
            //Assert statement(s)
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
            verify(target).correctlySpends(transactionMock, 0L, scriptMock, scriptVerifyFlagSet);
        }
    }

    //Sapient generated method id: ${02f097ae-9119-3dfd-bfc6-e0fb5c3fea7f}, hash: ADE76E39150B41869DCD33FB0B485320
    @Ignore()
    @Test()
    public void correctlySpendsWhenChunksSizeEquals2AndCaughtSignatureDecodeExceptionThrowsScriptException() throws ScriptException, SignatureDecodeException {
        /* Branches:
         * (ScriptPattern.isP2WPKH(scriptPubKey)) : false
         * (ScriptPattern.isP2PKH(scriptPubKey)) : true
         * (chunks.size() != 2) : false
         * (catch-exception (SignatureDecodeException)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<TransactionSignature> transactionSignature = mockStatic(TransactionSignature.class);
             MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            scriptPattern.when(() -> ScriptPattern.isP2WPKH(scriptMock)).thenReturn(false);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(scriptMock)).thenReturn(true);
            byte[] byteArray = new byte[]{};
            transactionSignature.when(() -> TransactionSignature.decodeFromBitcoin(byteArray, true, true)).thenThrow(signatureDecodeExceptionMock);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            scriptChunkList.add(null);
            Instant instant = Instant.ofEpochSecond(1700000000);
            Script target = Script.of(scriptChunkList, instant);
            thrown.expect(ScriptException.class);
            Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
            //Act Statement(s)
            target.correctlySpends(transactionMock, 0, transactionWitnessMock, coinMock, scriptMock, scriptVerifyFlagSet);
            //Assert statement(s)
            scriptPattern.verify(() -> ScriptPattern.isP2WPKH(scriptMock), atLeast(1));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(scriptMock), atLeast(1));
            transactionSignature.verify(() -> TransactionSignature.decodeFromBitcoin(byteArray, true, true), atLeast(1));
        }
    }

    //Sapient generated method id: ${c7fa24fa-b555-3280-a8e9-57968e873b95}, hash: 14368131DC2DAA115DAA8EA77F09FBF2
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
            Instant instant = Instant.ofEpochSecond(1700000000);
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

    //Sapient generated method id: ${7acb6b7f-9cad-368c-aeb5-761a2bf47370}, hash: 0F1415FC302C6CFCF9B66E58F85D9775
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
            Instant instant = Instant.ofEpochSecond(1700000000);
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

    //Sapient generated method id: ${d1e5c62b-a175-3302-9734-ef5106092257}, hash: 71654996E6ACCF0CFD716E95DCF5C164
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
            Instant instant = Instant.ofEpochSecond(1700000000);
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

    //Sapient generated method id: ${f843a135-f664-3df4-916a-cc31e711fbed}, hash: 3A78E3FE12992CA1F70D714193E25BCF
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
            Instant instant = Instant.ofEpochSecond(1700000000);
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

    //Sapient generated method id: ${0771d460-42e4-3a59-af06-1311256dc847}, hash: 6B09DED92BD98395582A7FB07B6F3CA0
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
            Instant instant = Instant.ofEpochSecond(1700000000);
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

    //Sapient generated method id: ${3d6d203e-bbac-3e1e-8227-6012eb857e76}, hash: DB8F89038598FD8D99757C9976F8C58D
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
            Instant instant = Instant.ofEpochSecond(1700000000);
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

    //Sapient generated method id: ${9d989a42-a6bb-3f2c-b403-02856dbc9ce3}, hash: 5D4C6EF25CB046B209FF2FF3F4BD8DAF
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
            Instant instant = Instant.ofEpochSecond(1700000000);
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

    //Sapient generated method id: ${f2e4986c-e391-324f-882b-2519821abe50}, hash: F54A36A8F49C3F090945CBB6E0C30713
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
            eCKey.when(() -> ECKey.fromPublicOnly(byteArray2)).thenReturn(eCKeyMock);
            doReturn(true).when(eCKeyMock).verify(sha256HashMock, transactionSignatureMock);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.ofEpochSecond(1700000000);
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

    //Sapient generated method id: ${92be093d-aa68-36cd-8b20-31645a432b73}, hash: CED607CB45010427D7D970C8EAAC2E82
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
            eCKey.when(() -> ECKey.fromPublicOnly(byteArray2)).thenReturn(eCKeyMock);
            doReturn(false).when(eCKeyMock).verify(sha256HashMock, transactionSignatureMock);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.ofEpochSecond(1700000000);
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

    //Sapient generated method id: ${c112409d-fd30-3a3f-8020-18e180f6e671}, hash: DCA4CB39AC1D667BA977F2EDD545541C
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
            Instant instant = Instant.ofEpochSecond(1700000000);
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

    //Sapient generated method id: ${2543c01b-a456-3f7e-9520-7563673f1732}, hash: 974453B916F602AED4C865190BE05310
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
            Instant instant = Instant.ofEpochSecond(1700000000);
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

    //Sapient generated method id: ${a09b3905-5632-3add-ac41-a8ab5c553a0e}, hash: ED305CD9128214486F4CDC70469B01CC
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
            Instant instant = Instant.ofEpochSecond(1700000000);
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

    //Sapient generated method id: ${b791c0cb-4f26-3c60-9382-95481459ce7e}, hash: 9739183C7613EDAAD3EA271C38841045
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
            script.when(() -> Script.executeScript(eq(transactionMock), eq(0L), eq(scriptPubKeyMock), (LinkedList) any(), anySet())).thenAnswer((Answer<Void>) invocation -> null);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.ofEpochSecond(1700000000);
            Script target = spy(Script.of(scriptChunkList, instant));
            byte[] byteArray3 = new byte[]{};
            doReturn(byteArray3).when(target).program();
            script.when(() -> Script.executeScript(eq(transactionMock), eq(0L), eq(target), (LinkedList) any(), anySet())).thenAnswer((Answer<Void>) invocation -> null);
            thrown.expect(ScriptException.class);
            Set<Script.VerifyFlag> scriptVerifyFlagSet = new HashSet<>();
            scriptVerifyFlagSet.add(Script.VerifyFlag.P2SH);
            //Act Statement(s)
            target.correctlySpends(txContainingThisMock, 0L, scriptPubKeyMock, scriptVerifyFlagSet);
            //Assert statement(s)
            verify(txContainingThisMock).serialize();
            verify(scriptPubKeyMock).program();
            transaction.verify(() -> Transaction.read((ByteBuffer) any()));
            script.verify(() -> Script.executeScript(eq(transactionMock), eq(0L), eq(scriptPubKeyMock), (LinkedList) any(), anySet()));
            verify(target).program();
            script.verify(() -> Script.executeScript(eq(transactionMock), eq(0L), eq(target), (LinkedList) any(), anySet()));
        }
    }

    //Sapient generated method id: ${55a01526-c114-32fa-a69d-240006a2d764}, hash: BC1E560448BB92C810E993E979ACA35B
    @Test()
    public void getScriptTypeWhenScriptPatternIsP2PKHThis() {
        /* Branches:
         * (ScriptPattern.isP2PKH(this)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(null);
            Instant instant = Instant.ofEpochSecond(1700000000);
            Script target = Script.of(scriptChunkList, instant);
            scriptPattern.when(() -> ScriptPattern.isP2PKH(target)).thenReturn(true);
            //Act Statement(s)
            ScriptType result = target.getScriptType();
            //Assert statement(s)
            assertThat(result, equalTo(ScriptType.P2PKH));
            scriptPattern.verify(() -> ScriptPattern.isP2PKH(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${86299939-93cf-3ea2-b17c-7c5d4450a16c}, hash: 1688E694DA541645EC3A18D8699D1802
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
            Instant instant = Instant.ofEpochSecond(1700000000);
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

    //Sapient generated method id: ${c951742d-1949-3239-ba1e-03c466721d36}, hash: D4E0A2BB5DBA59EF2B027D39E8204E84
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
            Instant instant = Instant.ofEpochSecond(1700000000);
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

    //Sapient generated method id: ${ebc2da31-9044-3764-b3c6-300b99d93976}, hash: F943475660DFC8913ED8F870CB16962D
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
            Instant instant = Instant.ofEpochSecond(1700000000);
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

    //Sapient generated method id: ${27df9d66-a6ee-3d81-a108-59cf4105ba0b}, hash: BF7872E7004C67C5CE5C9A6D5CC994C3
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
            Instant instant = Instant.ofEpochSecond(1700000000);
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

    //Sapient generated method id: ${d2b999e4-660a-3d0b-92ef-0eae116cd0bd}, hash: 634A28681A96621EDD5FA6CFA3CCAEDB
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
            Instant instant = Instant.ofEpochSecond(1700000000);
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

    //Sapient generated method id: ${15e7ac2f-b44e-355c-976c-c1c633749b87}, hash: 7930350A5C7A212EFECE2E1A76DD016E
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
            Instant instant = Instant.ofEpochSecond(1700000000);
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
