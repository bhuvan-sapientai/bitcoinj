package org.bitcoinj.script;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

import org.bitcoinj.base.Address;
import org.mockito.stubbing.Answer;
import org.bitcoinj.crypto.internal.CryptoUtils;
import org.bitcoinj.base.internal.TimeUtils;
import org.bitcoinj.base.internal.Preconditions;
import org.bitcoinj.crypto.ECKey;
import org.bitcoinj.crypto.TransactionSignature;
import org.bitcoinj.base.Sha256Hash;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

import java.util.ArrayList;
import java.time.Instant;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.anyList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInRelativeOrder;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

public class ScriptBuilderSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Address addressMock = mock(Address.class);

    private final ECKey keyMock = mock(ECKey.class);

    private final Script multisigProgramMock = mock(Script.class);

    private final ECKey pubKeyMock = mock(ECKey.class);

    private final Script redeemScriptMock = mock(Script.class);

    private final ScriptBuilder scriptBuilderMock = mock(ScriptBuilder.class);

    private final ScriptChunk scriptChunkMock = mock(ScriptChunk.class);

    private final ScriptChunk scriptChunkMock2 = mock(ScriptChunk.class);

    private final ScriptChunk scriptChunkMock3 = mock(ScriptChunk.class);

    private final ScriptChunk scriptChunkMock4 = mock(ScriptChunk.class);

    private final Script scriptMock = mock(Script.class);

    private final Script scriptSigMock = mock(Script.class);

    private final TransactionSignature signatureMock = mock(TransactionSignature.class);

    private final Script templateMock = mock(Script.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${e7ca91d8-c1cc-3fb0-bbfc-9b9ce2ba701e}
    @Test()
    public void creationTimeTest() {
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        doReturn(scriptChunkList).when(templateMock).chunks();
        ScriptBuilder target = new ScriptBuilder(templateMock);
        Instant instant = Instant.now();

        //Act Statement(s)
        ScriptBuilder result = target.creationTime(instant);

        //Assert statement(s)
        assertThat(result, equalTo(target));
        verify(templateMock).chunks();
    }

    //Sapient generated method id: ${ec4bc8f0-5fbd-3419-abc4-81a4be059ceb}
    @Test()
    public void addChunkTest() {
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        doReturn(scriptChunkList).when(templateMock).chunks();
        ScriptBuilder target = new ScriptBuilder(templateMock);

        //Act Statement(s)
        ScriptBuilder result = target.addChunk(scriptChunkMock);

        //Assert statement(s)
        assertThat(result, equalTo(target));
        verify(templateMock).chunks();
    }

    //Sapient generated method id: ${5a87a30d-0312-3a45-b2ed-2aa838f91824}
    @Test()
    public void addChunk1Test() {
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        doReturn(scriptChunkList).when(templateMock).chunks();
        ScriptBuilder target = new ScriptBuilder(templateMock);

        //Act Statement(s)
        ScriptBuilder result = target.addChunk(0, scriptChunkMock);

        //Assert statement(s)
        assertThat(result, equalTo(target));
        verify(templateMock).chunks();
    }

    //Sapient generated method id: ${e4c0d6e5-5725-3904-b893-60f633b9448f}
    @Test()
    public void opTest() {
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        doReturn(scriptChunkList).when(templateMock).chunks();
        ScriptBuilder target = spy(new ScriptBuilder(templateMock));
        doReturn(scriptBuilderMock).when(target).op(0, 0);

        //Act Statement(s)
        ScriptBuilder result = target.op(0);

        //Assert statement(s)
        assertThat(result, equalTo(scriptBuilderMock));
        verify(templateMock).chunks();
        verify(target).op(0, 0);
    }

    //Sapient generated method id: ${61d365cc-c477-3371-a269-3bdc5d0c73d9}
    @Test()
    public void op1WhenOpcodeGreaterThanOP_PUSHDATA4() {
        /* Branches:
         * (opcode > OP_PUSHDATA4) : true
         */
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        doReturn(scriptChunkList).when(templateMock).chunks();
        ScriptBuilder target = new ScriptBuilder(templateMock);

        //Act Statement(s)
        ScriptBuilder result = target.op(0, 79);

        //Assert statement(s)
        assertThat(result, equalTo(target));
        verify(templateMock).chunks();
    }

    //Sapient generated method id: ${0ccdadd9-fb21-3ad9-b01f-2a80b4c04cd9}
    @Test()
    public void op1WhenOpcodeNotGreaterThanOP_PUSHDATA4() {
        /* Branches:
         * (opcode > OP_PUSHDATA4) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            doReturn(scriptChunkList).when(templateMock).chunks();
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            ScriptBuilder target = new ScriptBuilder(templateMock);
            //Act Statement(s)
            ScriptBuilder result = target.op(0, 0);
            //Assert statement(s)
            assertThat(result, equalTo(target));
            verify(templateMock).chunks();
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
        }
    }

    //Sapient generated method id: ${4363f061-5102-3e80-a440-fed327b0a0b7}
    @Test()
    public void dataWhenDataLengthEquals0() {
        /* Branches:
         * (data.length == 0) : true
         */
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        doReturn(scriptChunkList).when(templateMock).chunks();
        ScriptBuilder target = spy(new ScriptBuilder(templateMock));
        doReturn(scriptBuilderMock).when(target).smallNum(0);
        byte[] byteArray = new byte[]{};

        //Act Statement(s)
        ScriptBuilder result = target.data(byteArray);

        //Assert statement(s)
        assertThat(result, equalTo(scriptBuilderMock));
        verify(templateMock).chunks();
        verify(target).smallNum(0);
    }

    //Sapient generated method id: ${8b84ff41-c011-39f9-b1a9-83fe50456430}
    @Test()
    public void dataWhenDataLengthNotEquals0() {
        /* Branches:
         * (data.length == 0) : false
         */
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        doReturn(scriptChunkList).when(templateMock).chunks();
        ScriptBuilder target = spy(new ScriptBuilder(templateMock));
        byte[] byteArray = new byte[]{(byte) 0};
        doReturn(scriptBuilderMock).when(target).data(0, byteArray);

        //Act Statement(s)
        ScriptBuilder result = target.data(byteArray);

        //Assert statement(s)
        assertThat(result, equalTo(scriptBuilderMock));
        verify(templateMock).chunks();
        verify(target).data(0, byteArray);
    }

    //Sapient generated method id: ${525c16e0-9bf5-3465-aff5-2a10b9473d7f}
    @Test()
    public void data1WhenDataLengthEquals0() {
        /* Branches:
         * (data.length == 0) : true
         */
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        doReturn(scriptChunkList).when(templateMock).chunks();
        ScriptBuilder target = new ScriptBuilder(templateMock);
        byte[] byteArray = new byte[]{};

        //Act Statement(s)
        ScriptBuilder result = target.data(0, byteArray);

        //Assert statement(s)
        assertThat(result, equalTo(target));
        verify(templateMock).chunks();
    }

    //Sapient generated method id: ${13a906f7-3aac-32c2-a428-de14a625810c}
    @Test()
    public void data1WhenDataLengthLessThanOP_PUSHDATA1() {
        /* Branches:
         * (data.length == 0) : false
         * (data.length == 1) : false
         * (data.length < OP_PUSHDATA1) : true
         */
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        doReturn(scriptChunkList).when(templateMock).chunks();
        ScriptBuilder target = new ScriptBuilder(templateMock);
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1};

        //Act Statement(s)
        ScriptBuilder result = target.data(0, byteArray);

        //Assert statement(s)
        assertThat(result, equalTo(target));
        verify(templateMock).chunks();
    }

    //Sapient generated method id: ${ba7a7621-031e-39d6-9795-a506cdd8ba16}
    @Test()
    public void data1WhenBLessThanOrEqualsTo16() {
        /* Branches:
         * (data.length == 0) : false
         * (data.length == 1) : true
         * (b >= 1) : true
         * (b <= 16) : true
         */
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        doReturn(scriptChunkList).when(templateMock).chunks();
        ScriptBuilder target = new ScriptBuilder(templateMock);
        byte[] byteArray = new byte[]{(byte) 1};

        //Act Statement(s)
        ScriptBuilder result = target.data(0, byteArray);

        //Assert statement(s)
        assertThat(result, equalTo(target));
        verify(templateMock).chunks();
    }

    //Sapient generated method id: ${677bdba3-e7dd-34dc-9766-92c278d58212}
    @Test()
    public void data1WhenBGreaterThan16() {
        /* Branches:
         * (data.length == 0) : false
         * (data.length == 1) : true
         * (b >= 1) : true
         * (b <= 16) : false
         */
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        doReturn(scriptChunkList).when(templateMock).chunks();
        ScriptBuilder target = new ScriptBuilder(templateMock);
        byte[] byteArray = new byte[]{(byte) 17};

        //Act Statement(s)
        ScriptBuilder result = target.data(0, byteArray);

        //Assert statement(s)
        assertThat(result, equalTo(target));
        verify(templateMock).chunks();
    }

    //Sapient generated method id: ${f5640d26-358c-3bc0-98d7-b571a51dee58}
    @Test()
    public void data1WhenDataLengthLessThan256() {
        /* Branches:
         * (data.length == 0) : false
         * (data.length == 1) : false
         * (data.length < OP_PUSHDATA1) : false
         * (data.length < 256) : true
         */
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        doReturn(scriptChunkList).when(templateMock).chunks();
        ScriptBuilder target = new ScriptBuilder(templateMock);
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 37, (byte) 38, (byte) 39, (byte) 40, (byte) 41, (byte) 42, (byte) 43, (byte) 44, (byte) 45, (byte) 46, (byte) 47, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 58, (byte) 59, (byte) 60, (byte) 61, (byte) 62, (byte) 63, (byte) 64, (byte) 65, (byte) 66, (byte) 67, (byte) 68, (byte) 69, (byte) 70, (byte) 71, (byte) 72, (byte) 73, (byte) 74, (byte) 75};

        //Act Statement(s)
        ScriptBuilder result = target.data(0, byteArray);

        //Assert statement(s)
        assertThat(result, equalTo(target));
        verify(templateMock).chunks();
    }

    //Sapient generated method id: ${f5e9a5c9-9778-35d3-9a5d-d7b4b604aced}
    @Test()
    public void data1WhenDataLengthLessThan65536() {
        /* Branches:
         * (data.length == 0) : false
         * (data.length == 1) : false
         * (data.length < OP_PUSHDATA1) : false
         * (data.length < 256) : false
         * (data.length < 65536) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class)) {
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            doReturn(scriptChunkList).when(templateMock).chunks();
            //TODO: Needs to return real value
            timeUtils.when(() -> TimeUtils.currentTime()).thenReturn(null);
            ScriptBuilder target = new ScriptBuilder(templateMock);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            ScriptBuilder result = target.data(0, byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(target));
            verify(templateMock).chunks();
            timeUtils.verify(() -> TimeUtils.currentTime(), atLeast(1));
        }
    }

    //Sapient generated method id: ${080cad56-3838-34be-ad35-86f8a3ef6b63}
    @Test()
    public void data1WhenDataLengthNotLessThan65536ThrowsRuntimeException() {
        /* Branches:
         * (data.length == 0) : false
         * (data.length == 1) : false
         * (data.length < OP_PUSHDATA1) : false
         * (data.length < 256) : false
         * (data.length < 65536) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class)) {
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            doReturn(scriptChunkList).when(templateMock).chunks();
            Instant instant = TimeUtils.currentTime();
            timeUtils.when(() -> TimeUtils.currentTime()).thenReturn(instant);
            ScriptBuilder target = new ScriptBuilder(templateMock);
            RuntimeException runtimeException = new RuntimeException("Unimplemented");
            thrown.expect(RuntimeException.class);
            thrown.expectMessage(runtimeException.getMessage());
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            target.data(0, byteArray);
            //Assert statement(s)
            verify(templateMock).chunks();
            timeUtils.verify(() -> TimeUtils.currentTime(), atLeast(1));
        }
    }

    //Sapient generated method id: ${15af010b-eb21-384b-8101-d4bbd5fb8766}
    @Test()
    public void numberTest() {
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        doReturn(scriptChunkList).when(templateMock).chunks();
        ScriptBuilder target = spy(new ScriptBuilder(templateMock));
        doReturn(scriptBuilderMock).when(target).number(0, 0L);

        //Act Statement(s)
        ScriptBuilder result = target.number(0L);

        //Assert statement(s)
        assertThat(result, equalTo(scriptBuilderMock));
        verify(templateMock).chunks();
        verify(target).number(0, 0L);
    }

    //Sapient generated method id: ${a38d7496-7289-3c33-8baa-759f5b5f207e}
    @Test()
    public void number1WhenNumEqualsMinus1() {
        /* Branches:
         * (num == -1) : true
         */
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        doReturn(scriptChunkList).when(templateMock).chunks();
        ScriptBuilder target = spy(new ScriptBuilder(templateMock));
        doReturn(scriptBuilderMock).when(target).op(0, 79);

        //Act Statement(s)
        ScriptBuilder result = target.number(0, -1L);

        //Assert statement(s)
        assertThat(result, equalTo(scriptBuilderMock));
        verify(templateMock).chunks();
        verify(target).op(0, 79);
    }

    //Sapient generated method id: ${e651de5d-9143-39d7-a78a-7d21f8d00920}
    @Test()
    public void number1WhenNumLessThanOrEqualsTo16() {
        /* Branches:
         * (num == -1) : false
         * (num >= 0) : true
         * (num <= 16) : true
         */
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        doReturn(scriptChunkList).when(templateMock).chunks();
        ScriptBuilder target = spy(new ScriptBuilder(templateMock));
        doReturn(scriptBuilderMock).when(target).smallNum(0, 1);

        //Act Statement(s)
        ScriptBuilder result = target.number(0, 1L);

        //Assert statement(s)
        assertThat(result, equalTo(scriptBuilderMock));
        verify(templateMock).chunks();
        verify(target).smallNum(0, 1);
    }

    //Sapient generated method id: ${c5d3469f-ad3e-318c-bf3e-792e7803e403}
    @Test()
    public void number1WhenNumGreaterThan16() {
        /* Branches:
         * (num == -1) : false
         * (num >= 0) : true
         * (num <= 16) : false
         */
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        doReturn(scriptChunkList).when(templateMock).chunks();
        ScriptBuilder target = spy(new ScriptBuilder(templateMock));
        doReturn(scriptBuilderMock).when(target).bigNum(0, 17L);

        //Act Statement(s)
        ScriptBuilder result = target.number(0, 17L);

        //Assert statement(s)
        assertThat(result, equalTo(scriptBuilderMock));
        verify(templateMock).chunks();
        verify(target).bigNum(0, 17L);
    }

    //Sapient generated method id: ${e9906f5a-b861-39ba-964f-eb14182e9d38}
    @Test()
    public void smallNumTest() {
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        doReturn(scriptChunkList).when(templateMock).chunks();
        ScriptBuilder target = spy(new ScriptBuilder(templateMock));
        doReturn(scriptBuilderMock).when(target).smallNum(0, 0);

        //Act Statement(s)
        ScriptBuilder result = target.smallNum(0);

        //Assert statement(s)
        assertThat(result, equalTo(scriptBuilderMock));
        verify(templateMock).chunks();
        verify(target).smallNum(0, 0);
    }

    //Sapient generated method id: ${736ab897-404b-34f7-ad35-025bec6632f5}
    @Test()
    public void bigNumTest() {
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        doReturn(scriptChunkList).when(templateMock).chunks();
        ScriptBuilder target = spy(new ScriptBuilder(templateMock));
        doReturn(scriptBuilderMock).when(target).bigNum(0, 0L);

        //Act Statement(s)
        ScriptBuilder result = target.bigNum(0L);

        //Assert statement(s)
        assertThat(result, equalTo(scriptBuilderMock));
        verify(templateMock).chunks();
        verify(target).bigNum(0, 0L);
    }

    //Sapient generated method id: ${2e3755ed-e56b-3fa0-bd4e-492e72f2f9f0}
    @Test()
    public void smallNum1WhenNumLessThanOrEqualsTo16() {
        /* Branches:
         * (num >= 0) : true
         * (num <= 16) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            doReturn(scriptChunkList).when(templateMock).chunks();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ScriptBuilder target = new ScriptBuilder(templateMock);
            //Act Statement(s)
            ScriptBuilder result = target.smallNum(0, 0);
            //Assert statement(s)
            assertThat(result, equalTo(target));
            verify(templateMock).chunks();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(2));
        }
    }

    //Sapient generated method id: ${b951a25a-02c5-37c8-b10d-0688bec1a920}
    @Test()
    public void smallNum1WhenNumGreaterThan16() {
        /* Branches:
         * (num >= 0) : true
         * (num <= 16) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Script> script = mockStatic(Script.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            doReturn(scriptChunkList).when(templateMock).chunks();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            script.when(() -> Script.encodeToOpN(17)).thenReturn(0);
            ScriptBuilder target = new ScriptBuilder(templateMock);
            //Act Statement(s)
            ScriptBuilder result = target.smallNum(0, 17);
            //Assert statement(s)
            assertThat(result, equalTo(target));
            verify(templateMock).chunks();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(2));
            script.verify(() -> Script.encodeToOpN(17), atLeast(1));
        }
    }

    //Sapient generated method id: ${45857533-0ca1-3545-b396-ec784914c464}
    @Test()
    public void smallNum1WhenNumLessThan0AndNumLessThanOrEqualsTo16() {
        /* Branches:
         * (num >= 0) : false
         * (num <= 16) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            doReturn(scriptChunkList).when(templateMock).chunks();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ScriptBuilder target = new ScriptBuilder(templateMock);
            //Act Statement(s)
            ScriptBuilder result = target.smallNum(0, -1);
            //Assert statement(s)
            assertThat(result, equalTo(target));
            verify(templateMock).chunks();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(2));
        }
    }

    //Sapient generated method id: ${d7d97793-e039-347f-bacd-19c035a71506}
    @Test()
    public void bigNum1WhenNumEquals0() {
        /* Branches:
         * (num == 0) : true
         */
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        doReturn(scriptChunkList).when(templateMock).chunks();
        ScriptBuilder target = new ScriptBuilder(templateMock);

        //Act Statement(s)
        ScriptBuilder result = target.bigNum(0, 0L);

        //Assert statement(s)
        assertThat(result, equalTo(target));
        verify(templateMock).chunks();
    }

    //Sapient generated method id: ${5c0f2262-6b98-318c-a6e6-3a2993c04528}
    @Test()
    public void bigNum1WhenByteIdxLessThanDataLength() {
        /* Branches:
         * (num == 0) : false
         * (num < 0) : true
         * (absvalue != 0) : true
         * ((result.peek() & 0x80) != 0) : true
         * (neg) : true
         * (byteIdx < data.length) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        doReturn(scriptChunkList).when(templateMock).chunks();
        ScriptBuilder target = new ScriptBuilder(templateMock);

        //Act Statement(s)
        ScriptBuilder result = target.bigNum(0, -1L);

        //Assert statement(s)
        assertThat(result, equalTo(target));
        verify(templateMock).chunks();
    }

    //Sapient generated method id: ${58acef08-017d-3c16-b25f-291052e1397d}
    @Test()
    public void bigNum1WhenNegAndByteIdxLessThanDataLength() {
        /* Branches:
         * (num == 0) : false
         * (num < 0) : true
         * (absvalue != 0) : true
         * ((result.peek() & 0x80) != 0) : false
         * (neg) : true
         * (byteIdx < data.length) : true
         */
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        doReturn(scriptChunkList).when(templateMock).chunks();
        ScriptBuilder target = new ScriptBuilder(templateMock);

        //Act Statement(s)
        ScriptBuilder result = target.bigNum(0, -1L);

        //Assert statement(s)
        assertThat(result, equalTo(target));
        verify(templateMock).chunks();
    }

    //Sapient generated method id: ${a72b081f-226f-3a1e-b20c-d0332a2cb7df}
    @Test()
    public void bigNum1WhenNotNegAndByteIdxLessThanDataLength() {
        /* Branches:
         * (num == 0) : false
         * (num < 0) : false
         * (absvalue != 0) : true
         * ((result.peek() & 0x80) != 0) : true
         * (neg) : false
         * (byteIdx < data.length) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        doReturn(scriptChunkList).when(templateMock).chunks();
        ScriptBuilder target = new ScriptBuilder(templateMock);

        //Act Statement(s)
        ScriptBuilder result = target.bigNum(0, 1L);

        //Assert statement(s)
        assertThat(result, equalTo(target));
        verify(templateMock).chunks();
    }

    //Sapient generated method id: ${e67f115e-e5a2-39e9-833d-52d96810b04f}
    @Test()
    public void opTrueTest() {
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        doReturn(scriptChunkList).when(templateMock).chunks();
        ScriptBuilder target = spy(new ScriptBuilder(templateMock));
        doReturn(scriptBuilderMock).when(target).number(1L);

        //Act Statement(s)
        ScriptBuilder result = target.opTrue();

        //Assert statement(s)
        assertThat(result, equalTo(scriptBuilderMock));
        verify(templateMock).chunks();
        verify(target).number(1L);
    }

    //Sapient generated method id: ${b6cf091f-949c-36aa-af64-0e67439e895c}
    @Test()
    public void opTrue1Test() {
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        doReturn(scriptChunkList).when(templateMock).chunks();
        ScriptBuilder target = spy(new ScriptBuilder(templateMock));
        doReturn(scriptBuilderMock).when(target).number(0, 1L);

        //Act Statement(s)
        ScriptBuilder result = target.opTrue(0);

        //Assert statement(s)
        assertThat(result, equalTo(scriptBuilderMock));
        verify(templateMock).chunks();
        verify(target).number(0, 1L);
    }

    //Sapient generated method id: ${781fb142-adfa-3168-b8c6-1e95e0f8b564}
    @Test()
    public void opFalseTest() {
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        doReturn(scriptChunkList).when(templateMock).chunks();
        ScriptBuilder target = spy(new ScriptBuilder(templateMock));
        doReturn(scriptBuilderMock).when(target).number(0L);

        //Act Statement(s)
        ScriptBuilder result = target.opFalse();

        //Assert statement(s)
        assertThat(result, equalTo(scriptBuilderMock));
        verify(templateMock).chunks();
        verify(target).number(0L);
    }

    //Sapient generated method id: ${72c6f3a1-9053-39f8-b047-a9b6e054095e}
    @Test()
    public void opFalse1Test() {
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        doReturn(scriptChunkList).when(templateMock).chunks();
        ScriptBuilder target = spy(new ScriptBuilder(templateMock));
        doReturn(scriptBuilderMock).when(target).number(0, 0L);

        //Act Statement(s)
        ScriptBuilder result = target.opFalse(0);

        //Assert statement(s)
        assertThat(result, equalTo(scriptBuilderMock));
        verify(templateMock).chunks();
        verify(target).number(0, 0L);
    }

    //Sapient generated method id: ${c319ea97-f8d0-37c4-a5dd-88e142a90c6d}
    @Test()
    public void buildTest() {
        //Arrange Statement(s)
        try (MockedStatic<Script> script = mockStatic(Script.class)) {
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            doReturn(scriptChunkList).when(templateMock).chunks();
            script.when(() -> Script.of(any(), (Instant) any())).thenReturn(scriptMock);
            ScriptBuilder target = new ScriptBuilder(templateMock);
            //Act Statement(s)
            Script result = target.build();
            //Assert statement(s)
            assertThat(result, equalTo(scriptMock));
            verify(templateMock).chunks();
            script.verify(() -> Script.of(any(), (Instant) any()));
        }
    }

    //Sapient generated method id: ${e882d384-697e-36fa-b92b-76223718d4c1}
    @Test()
    public void createEmptyTest() {

        //Act Statement(s)
        Script result = ScriptBuilder.createEmpty();
        ScriptBuilder scriptBuilder = new ScriptBuilder();
        Script script = scriptBuilder.build();

        //Assert statement(s)
        assertThat(result, equalTo(script));
    }

    //Sapient generated method id: ${a2a7d47e-89bd-3d76-9e6d-59d7579b49b0}
    @Test()
    public void createOutputScriptTest() {
        /**
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: org.bitcoinj.script.ScriptBuilder
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Instant instant = Instant.now();

        //Act Statement(s)
        Script result = ScriptBuilder.createOutputScript(addressMock, instant);

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${9b066c43-ef44-3b99-b63c-3d1e464a04d6}
    @Test()
    public void createOutputScript1Test() {
        /**
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: org.bitcoinj.script.ScriptBuilder
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        Script result = ScriptBuilder.createOutputScript(addressMock);

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${c1b538cc-ae80-3fd8-839d-75fbcbfbe3d4}
    @Test()
    public void createInputScriptWhenSignatureIsNotNull() {
        /* Branches:
         * (signature != null) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        doReturn(byteArray).when(signatureMock).encodeToBitcoin();
        byte[] byteArray2 = new byte[]{};
        doReturn(byteArray2).when(pubKeyMock).getPubKey();

        //Act Statement(s)
        Script result = ScriptBuilder.createInputScript(signatureMock, pubKeyMock);
        ScriptBuilder scriptBuilder = new ScriptBuilder();
        ScriptBuilder scriptBuilder2 = scriptBuilder.data(byteArray);
        ScriptBuilder scriptBuilder3 = scriptBuilder2.data(byteArray2);
        Script script = scriptBuilder3.build();

        //Assert statement(s)
        assertThat(result, equalTo(script));
        verify(signatureMock).encodeToBitcoin();
        verify(pubKeyMock).getPubKey();
    }

    //Sapient generated method id: ${effd4e56-6358-3eb4-bc30-8806e17a5b72}
    @Test()
    public void createInputScriptWhenSignatureIsNull() {
        /* Branches:
         * (signature != null) : false
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        doReturn(byteArray).when(pubKeyMock).getPubKey();
        TransactionSignature transactionSignature = null;

        //Act Statement(s)
        Script result = ScriptBuilder.createInputScript(transactionSignature, pubKeyMock);
        ScriptBuilder scriptBuilder = new ScriptBuilder();
        byte[] byteArray2 = new byte[]{};
        ScriptBuilder scriptBuilder2 = scriptBuilder.data(byteArray2);
        ScriptBuilder scriptBuilder3 = scriptBuilder2.data(byteArray);
        Script script = scriptBuilder3.build();

        //Assert statement(s)
        assertThat(result, equalTo(script));
        verify(pubKeyMock).getPubKey();
    }

    //Sapient generated method id: ${5630f6d4-234a-32f4-acfe-f50574627148}
    @Test()
    public void createInputScript1WhenSignatureIsNotNull() {
        /* Branches:
         * (signature != null) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        doReturn(byteArray).when(signatureMock).encodeToBitcoin();

        //Act Statement(s)
        Script result = ScriptBuilder.createInputScript(signatureMock);
        ScriptBuilder scriptBuilder = new ScriptBuilder();
        ScriptBuilder scriptBuilder2 = scriptBuilder.data(byteArray);
        Script script = scriptBuilder2.build();

        //Assert statement(s)
        assertThat(result, equalTo(script));
        verify(signatureMock).encodeToBitcoin();
    }

    //Sapient generated method id: ${95968e94-b8d8-3194-ab26-d4df85d850b5}
    @Test()
    public void createInputScript1WhenSignatureIsNull() {
        /* Branches:
         * (signature != null) : false
         */
        //Arrange Statement(s)
        TransactionSignature transactionSignature = null;

        //Act Statement(s)
        Script result = ScriptBuilder.createInputScript(transactionSignature);
        ScriptBuilder scriptBuilder = new ScriptBuilder();
        byte[] byteArray = new byte[]{};
        ScriptBuilder scriptBuilder2 = scriptBuilder.data(byteArray);
        Script script = scriptBuilder2.build();

        //Assert statement(s)
        assertThat(result, equalTo(script));
    }

    //Sapient generated method id: ${44cfdb7b-07c1-3c79-a6f1-b8241b68ed03}
    @Test()
    public void createMultiSigOutputScriptWhenPubkeysIsNotEmpty() {
        /* Branches:
         * (threshold > 0) : true
         * (threshold <= pubkeys.size()) : true
         * (pubkeys.size() <= 16) : true
         * (for-each(pubkeys)) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        doReturn(byteArray).when(keyMock).getPubKey();
        List<ECKey> eCKeyList = new ArrayList<>();
        eCKeyList.add(keyMock);

        //Act Statement(s)
        Script result = ScriptBuilder.createMultiSigOutputScript(1, eCKeyList);
        ScriptBuilder scriptBuilder = new ScriptBuilder();
        Script script = scriptBuilder.build();
        List<ECKey> eCKeyECKeyListList = new ArrayList<>();
        eCKeyECKeyListList.add(keyMock);

        //Assert statement(s)
        assertThat(result, equalTo(script));
        assertThat(eCKeyList.size(), equalTo(eCKeyECKeyListList.size()));
        assertThat(eCKeyList, containsInRelativeOrder(eCKeyECKeyListList.toArray()));
        verify(keyMock).getPubKey();
    }

    //Sapient generated method id: ${9e705cfb-4e2d-307d-a258-d07ca34f96e1}
    @Test()
    public void createMultiSigOutputScriptWhenThresholdGreaterThanPubkeysSizeAndPubkeysSizeGreaterThan16AndPubkeysIsNotEmpty() {
        /* Branches:
         * (threshold > 0) : true
         * (threshold <= pubkeys.size()) : false
         * (pubkeys.size() <= 16) : false
         * (for-each(pubkeys)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECKey eCKeyMock = mock(ECKey.class);
        ECKey eCKeyMock2 = mock(ECKey.class);
        ECKey eCKeyMock3 = mock(ECKey.class);
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
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(keyMock).getPubKey();
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            List<ECKey> eCKeyList = new ArrayList<>();
            eCKeyList.add(keyMock);
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
            //Act Statement(s)
            Script result = ScriptBuilder.createMultiSigOutputScript(18, eCKeyList);
            ScriptBuilder scriptBuilder = new ScriptBuilder();
            Script script = scriptBuilder.build();
            //Assert statement(s)
            assertThat(result, equalTo(script));
            verify(keyMock).getPubKey();
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(2));
        }
    }

    //Sapient generated method id: ${7ab754f7-b3e6-37b3-a54e-97db9487942a}
    @Test()
    public void createMultiSigOutputScriptWhenThresholdLessThanOrEqualsToPubkeysSizeAndPubkeysSizeLessThanOrEqualsTo16AndPubkeysIsNotEm() {
        /* Branches:
         * (threshold > 0) : false
         * (threshold <= pubkeys.size()) : true
         * (pubkeys.size() <= 16) : true
         * (for-each(pubkeys)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(keyMock).getPubKey();
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            List<ECKey> eCKeyList = new ArrayList<>();
            eCKeyList.add(keyMock);
            //Act Statement(s)
            Script result = ScriptBuilder.createMultiSigOutputScript(0, eCKeyList);
            ScriptBuilder scriptBuilder = new ScriptBuilder();
            Script script = scriptBuilder.build();
            List<ECKey> eCKeyECKeyListList = new ArrayList<>();
            eCKeyECKeyListList.add(keyMock);
            //Assert statement(s)
            assertThat(result, equalTo(script));
            assertThat(eCKeyList.size(), equalTo(eCKeyECKeyListList.size()));
            assertThat(eCKeyList, containsInRelativeOrder(eCKeyECKeyListList.toArray()));
            verify(keyMock).getPubKey();
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(2));
        }
    }

    //Sapient generated method id: ${140c5cac-90e5-3ad6-a469-54b443cdcc92}
    @Test()
    public void createMultiSigInputScriptWhenSignaturesIsNotEmpty() {
        /* Branches:
         * (for-each(signatures)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptBuilder> scriptBuilder = mockStatic(ScriptBuilder.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(signatureMock).encodeToBitcoin();
            scriptBuilder.when(() -> ScriptBuilder.createMultiSigInputScriptBytes(anyList(), eq((byte[]) null))).thenReturn(scriptMock);
            List<TransactionSignature> transactionSignatureList = new ArrayList<>();
            transactionSignatureList.add(signatureMock);
            //Act Statement(s)
            Script result = ScriptBuilder.createMultiSigInputScript(transactionSignatureList);
            List<TransactionSignature> transactionSignatureTransactionSignatureListList = new ArrayList<>();
            transactionSignatureTransactionSignatureListList.add(signatureMock);
            //Assert statement(s)
            assertThat(result, equalTo(scriptMock));
            assertThat(transactionSignatureList.size(), equalTo(transactionSignatureTransactionSignatureListList.size()));
            assertThat(transactionSignatureList, containsInRelativeOrder(transactionSignatureTransactionSignatureListList.toArray()));
            verify(signatureMock, atLeast(1)).encodeToBitcoin();
            scriptBuilder.verify(() -> ScriptBuilder.createMultiSigInputScriptBytes(anyList(), eq((byte[]) null)), atLeast(1));
        }
    }

    //Sapient generated method id: ${9d1e7618-1bfb-3d1d-874b-9fbb00b891bb}
    @Test()
    public void createMultiSigInputScript1Test() {
        //Arrange Statement(s)
        try (MockedStatic<ScriptBuilder> scriptBuilder = mockStatic(ScriptBuilder.class, CALLS_REAL_METHODS)) {
            scriptBuilder.when(() -> ScriptBuilder.createMultiSigInputScript(anyList())).thenReturn(scriptMock);
            TransactionSignature[] transactionSignatureArray = new TransactionSignature[]{};
            //Act Statement(s)
            Script result = ScriptBuilder.createMultiSigInputScript(transactionSignatureArray);
            //Assert statement(s)
            assertThat(result, equalTo(scriptMock));
            scriptBuilder.verify(() -> ScriptBuilder.createMultiSigInputScript(anyList()), atLeast(1));
        }
    }

    //Sapient generated method id: ${713db326-fae1-3177-9ce2-b0f9c0e48f06}
    @Test()
    public void createMultiSigInputScriptBytesTest() {
        //Arrange Statement(s)
        try (MockedStatic<ScriptBuilder> scriptBuilder = mockStatic(ScriptBuilder.class, CALLS_REAL_METHODS)) {
            scriptBuilder.when(() -> ScriptBuilder.createMultiSigInputScriptBytes(anyList(), eq((byte[]) null))).thenReturn(scriptMock);
            List<byte[]> byteList = new ArrayList<>();
            //Act Statement(s)
            Script result = ScriptBuilder.createMultiSigInputScriptBytes(byteList);
            //Assert statement(s)
            assertThat(result, equalTo(scriptMock));
            scriptBuilder.verify(() -> ScriptBuilder.createMultiSigInputScriptBytes(anyList(), eq((byte[]) null)), atLeast(1));
        }
    }

    //Sapient generated method id: ${18f8a1d7-a9fe-35f1-8c03-4b583dbc3809}
    @Test()
    public void createP2SHMultiSigInputScriptWhenILessThanNumSigs() {
        /* Branches:
         * (signatures == null) : true
         * (i < numSigs) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptBuilder> scriptBuilder = mockStatic(ScriptBuilder.class, CALLS_REAL_METHODS)) {
            doReturn(1).when(multisigProgramMock).getNumberOfSignaturesRequiredToSpend();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(multisigProgramMock).program();
            scriptBuilder.when(() -> ScriptBuilder.createMultiSigInputScriptBytes(anyList(), eq(byteArray))).thenReturn(scriptMock);
            List<TransactionSignature> list = null;
            //Act Statement(s)
            Script result = ScriptBuilder.createP2SHMultiSigInputScript(list, multisigProgramMock);
            //Assert statement(s)
            assertThat(result, equalTo(scriptMock));
            verify(multisigProgramMock, atLeast(1)).getNumberOfSignaturesRequiredToSpend();
            verify(multisigProgramMock, atLeast(1)).program();
            scriptBuilder.verify(() -> ScriptBuilder.createMultiSigInputScriptBytes(anyList(), eq(byteArray)), atLeast(1));
        }
    }

    //Sapient generated method id: ${a0b09bc5-1326-3d54-b3d8-29e031db9f27}
    @Test()
    public void createP2SHMultiSigInputScriptWhenSignaturesIsNotEmpty() {
        /* Branches:
         * (signatures == null) : false
         * (for-each(signatures)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptBuilder> scriptBuilder = mockStatic(ScriptBuilder.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(signatureMock).encodeToBitcoin();
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(multisigProgramMock).program();
            scriptBuilder.when(() -> ScriptBuilder.createMultiSigInputScriptBytes(anyList(), eq(byteArray2))).thenReturn(scriptMock);
            List<TransactionSignature> transactionSignatureList = new ArrayList<>();
            transactionSignatureList.add(signatureMock);
            //Act Statement(s)
            Script result = ScriptBuilder.createP2SHMultiSigInputScript(transactionSignatureList, multisigProgramMock);
            List<TransactionSignature> transactionSignatureTransactionSignatureListList = new ArrayList<>();
            transactionSignatureTransactionSignatureListList.add(signatureMock);
            //Assert statement(s)
            assertThat(result, equalTo(scriptMock));
            assertThat(transactionSignatureList.size(), equalTo(transactionSignatureTransactionSignatureListList.size()));
            assertThat(transactionSignatureList, containsInRelativeOrder(transactionSignatureTransactionSignatureListList.toArray()));
            verify(signatureMock, atLeast(1)).encodeToBitcoin();
            verify(multisigProgramMock, atLeast(1)).program();
            scriptBuilder.verify(() -> ScriptBuilder.createMultiSigInputScriptBytes(anyList(), eq(byteArray2)), atLeast(1));
        }
    }

    //Sapient generated method id: ${3c369cde-d42f-3197-bfa8-a03d8dcadff1}
    @Test()
    public void createMultiSigInputScriptBytes1WhenMultisigProgramBytesIsNotNull() {
        /* Branches:
         * (signatures.size() <= 16) : true
         * (for-each(signatures)) : true
         * (multisigProgramBytes != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        List<byte[]> byteList = new ArrayList<>();
        byteList.add(byteArray);
        byte[] byteArray2 = new byte[]{};

        //Act Statement(s)
        Script result = ScriptBuilder.createMultiSigInputScriptBytes(byteList, byteArray2);
        ScriptBuilder scriptBuilder = new ScriptBuilder();
        Script script = scriptBuilder.build();

        //Assert statement(s)
        assertThat(result, equalTo(script));
    }

    //Sapient generated method id: ${78084a7c-25a2-3fe6-925b-d33c879f9e5a}
    @Test()
    public void createMultiSigInputScriptBytes1WhenSignaturesIsNotEmptyAndMultisigProgramBytesIsNotNull() {
        /* Branches:
         * (signatures.size() <= 16) : false
         * (for-each(signatures)) : true
         * (multisigProgramBytes != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{};
            byte[] byteArray3 = new byte[]{};
            byte[] byteArray4 = new byte[]{};
            byte[] byteArray5 = new byte[]{};
            byte[] byteArray6 = new byte[]{};
            byte[] byteArray7 = new byte[]{};
            byte[] byteArray8 = new byte[]{};
            byte[] byteArray9 = new byte[]{};
            byte[] byteArray10 = new byte[]{};
            byte[] byteArray11 = new byte[]{};
            byte[] byteArray12 = new byte[]{};
            byte[] byteArray13 = new byte[]{};
            byte[] byteArray14 = new byte[]{};
            byte[] byteArray15 = new byte[]{};
            byte[] byteArray16 = new byte[]{};
            byte[] byteArray17 = new byte[]{};
            List<byte[]> byteList = new ArrayList<>();
            byteList.add(byteArray);
            byteList.add(byteArray2);
            byteList.add(byteArray3);
            byteList.add(byteArray4);
            byteList.add(byteArray5);
            byteList.add(byteArray6);
            byteList.add(byteArray7);
            byteList.add(byteArray8);
            byteList.add(byteArray9);
            byteList.add(byteArray10);
            byteList.add(byteArray11);
            byteList.add(byteArray12);
            byteList.add(byteArray13);
            byteList.add(byteArray14);
            byteList.add(byteArray15);
            byteList.add(byteArray16);
            byteList.add(byteArray17);
            byte[] byteArray18 = new byte[]{};
            //Act Statement(s)
            Script result = ScriptBuilder.createMultiSigInputScriptBytes(byteList, byteArray18);
            ScriptBuilder scriptBuilder = new ScriptBuilder();
            Script script = scriptBuilder.build();
            //Assert statement(s)
            assertThat(result, equalTo(script));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
        }
    }

    //Sapient generated method id: ${5b45bdf9-a746-3f32-a852-fc16d691d06c}
    @Test()
    public void updateScriptWithSignatureWhenPosNotEqualsTargetIndexAndInputChunksSubListTotalChunksMinusSigsSuffixCountTotalChunksIsNo() {
        /* Branches:
         * (for-each(inputChunks.subList(0, sigsPrefixCount))) : true
         * (for-each(inputChunks.subList(sigsPrefixCount, totalChunks - sigsSuffixCount))) : true
         * (pos == targetIndex) : true
         * (!chunk.equalsOpCode(OP_0)) : true
         * (pos < totalChunks - sigsPrefixCount - sigsSuffixCount) : true
         * (pos == targetIndex) : false
         * (for-each(inputChunks.subList(totalChunks - sigsSuffixCount, totalChunks))) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: builder
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ScriptChunk scriptChunkMock5 = mock(ScriptChunk.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(scriptChunkMock);
            scriptChunkList.add(scriptChunkMock2);
            scriptChunkList.add(scriptChunkMock3);
            scriptChunkList.add(scriptChunkMock4);
            scriptChunkList.add(scriptChunkMock5);
            doReturn(scriptChunkList).when(scriptSigMock).chunks();
            doReturn(false).when(scriptChunkMock2).equalsOpCode(0);
            doReturn(false).when(scriptChunkMock4).equalsOpCode(0);
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            Script result = ScriptBuilder.updateScriptWithSignature(scriptSigMock, byteArray, 0, 1, 1);
            ScriptBuilder scriptBuilder = new ScriptBuilder();
            Script script = scriptBuilder.build();
            //Assert statement(s)
            assertThat(result, equalTo(script));
            verify(scriptSigMock, atLeast(1)).chunks();
            verify(scriptChunkMock2, atLeast(1)).equalsOpCode(0);
            verify(scriptChunkMock4, atLeast(1)).equalsOpCode(0);
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${9a99b4bd-1af8-3853-8552-9c015a81c166}
    @Test()
    public void updateScriptWithSignatureWhenPosEqualsTargetIndexAndInputChunksSubListTotalChunksMinusSigsSuffixCountTotalChunksIsNotEm2() {
        /* Branches:
         * (for-each(inputChunks.subList(0, sigsPrefixCount))) : true
         * (for-each(inputChunks.subList(sigsPrefixCount, totalChunks - sigsSuffixCount))) : true
         * (pos == targetIndex) : false
         * (!chunk.equalsOpCode(OP_0)) : true
         * (pos < totalChunks - sigsPrefixCount - sigsSuffixCount) : true
         * (pos == targetIndex) : true
         * (for-each(inputChunks.subList(totalChunks - sigsSuffixCount, totalChunks))) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: builder
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(scriptChunkMock);
            scriptChunkList.add(scriptChunkMock2);
            scriptChunkList.add(scriptChunkMock3);
            scriptChunkList.add(scriptChunkMock4);
            doReturn(scriptChunkList).when(scriptSigMock).chunks();
            doReturn(false).when(scriptChunkMock2).equalsOpCode(0);
            doReturn(false).when(scriptChunkMock3).equalsOpCode(0);
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            Script result = ScriptBuilder.updateScriptWithSignature(scriptSigMock, byteArray, 1, 1, 1);
            ScriptBuilder scriptBuilder = new ScriptBuilder();
            Script script = scriptBuilder.build();
            //Assert statement(s)
            assertThat(result, equalTo(script));
            verify(scriptSigMock, atLeast(1)).chunks();
            verify(scriptChunkMock2, atLeast(1)).equalsOpCode(0);
            verify(scriptChunkMock3, atLeast(1)).equalsOpCode(0);
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${25116bc5-ede1-3a56-803d-7713c004bb38}
    @Test()
    public void createP2PKOutputScriptTest() {
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};

        //Act Statement(s)
        Script result = ScriptBuilder.createP2PKOutputScript(byteArray);
        ScriptBuilder scriptBuilder = new ScriptBuilder();
        ScriptBuilder scriptBuilder2 = scriptBuilder.data(byteArray);
        ScriptBuilder scriptBuilder3 = scriptBuilder2.op(172);
        Script script = scriptBuilder3.build();

        //Assert statement(s)
        assertThat(result, equalTo(script));
    }

    //Sapient generated method id: ${848ee256-f28f-37d3-8989-1a9c1f61191d}
    @Test()
    public void createP2PKOutputScript1Test() {
        //Arrange Statement(s)
        try (MockedStatic<ScriptBuilder> scriptBuilder = mockStatic(ScriptBuilder.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(pubKeyMock).getPubKey();
            scriptBuilder.when(() -> ScriptBuilder.createP2PKOutputScript(byteArray)).thenReturn(scriptMock);
            //Act Statement(s)
            Script result = ScriptBuilder.createP2PKOutputScript(pubKeyMock);
            //Assert statement(s)
            assertThat(result, equalTo(scriptMock));
            verify(pubKeyMock, atLeast(1)).getPubKey();
            scriptBuilder.verify(() -> ScriptBuilder.createP2PKOutputScript(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${8f991b99-523f-367e-93e9-33314c8a12e1}
    @Test()
    public void createP2PKHOutputScriptTest() {
        /**
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: org.bitcoinj.script.ScriptBuilder
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class)) {
            Instant instant = TimeUtils.currentTime();
            timeUtils.when(() -> TimeUtils.currentTime()).thenReturn(instant);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            Script result = ScriptBuilder.createP2PKHOutputScript(byteArray);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            timeUtils.verify(() -> TimeUtils.currentTime(), atLeast(1));
        }
    }

    //Sapient generated method id: ${ebe4b4b9-3487-3f06-b93f-913963a53d04}
    @Test()
    public void createP2PKHOutputScript1Test() {
        //Arrange Statement(s)
        try (MockedStatic<ScriptBuilder> scriptBuilder = mockStatic(ScriptBuilder.class, CALLS_REAL_METHODS);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isCompressed();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(keyMock).getPubKeyHash();
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            scriptBuilder.when(() -> ScriptBuilder.createP2PKHOutputScript(byteArray)).thenReturn(scriptMock);
            //Act Statement(s)
            Script result = ScriptBuilder.createP2PKHOutputScript(keyMock);
            //Assert statement(s)
            assertThat(result, equalTo(scriptMock));
            verify(keyMock, atLeast(1)).isCompressed();
            verify(keyMock, atLeast(1)).getPubKeyHash();
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            scriptBuilder.verify(() -> ScriptBuilder.createP2PKHOutputScript(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${7a697563-7013-373e-98e8-69803263165a}
    @Test()
    public void createP2WPKHOutputScriptWhenHashLengthEqualsSegwitAddressWITNESS_PROGRAM_LENGTH_PKH() {
        /* Branches:
         * (hash.length == SegwitAddress.WITNESS_PROGRAM_LENGTH_PKH) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19};

        //Act Statement(s)
        Script result = ScriptBuilder.createP2WPKHOutputScript(byteArray);
        ScriptBuilder scriptBuilder = new ScriptBuilder();
        ScriptBuilder scriptBuilder2 = scriptBuilder.smallNum(0);
        ScriptBuilder scriptBuilder3 = scriptBuilder2.data(byteArray);
        Script script = scriptBuilder3.build();

        //Assert statement(s)
        assertThat(result, equalTo(script));
    }

    //Sapient generated method id: ${a258e274-37c6-3365-a30c-15cd36f59271}
    @Test()
    public void createP2WPKHOutputScriptWhenHashLengthNotEqualsSegwitAddressWITNESS_PROGRAM_LENGTH_PKH() {
        /* Branches:
         * (hash.length == SegwitAddress.WITNESS_PROGRAM_LENGTH_PKH) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            Script result = ScriptBuilder.createP2WPKHOutputScript(byteArray);
            ScriptBuilder scriptBuilder = new ScriptBuilder();
            ScriptBuilder scriptBuilder2 = scriptBuilder.smallNum(0);
            ScriptBuilder scriptBuilder3 = scriptBuilder2.data(byteArray);
            Script script = scriptBuilder3.build();
            //Assert statement(s)
            assertThat(result, equalTo(script));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
        }
    }

    //Sapient generated method id: ${81b4c99a-d6d8-3063-802d-2412397dee24}
    @Test()
    public void createP2WPKHOutputScript1Test() {
        //Arrange Statement(s)
        try (MockedStatic<ScriptBuilder> scriptBuilder = mockStatic(ScriptBuilder.class, CALLS_REAL_METHODS);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(keyMock).isCompressed();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(keyMock).getPubKeyHash();
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            scriptBuilder.when(() -> ScriptBuilder.createP2WPKHOutputScript(byteArray)).thenReturn(scriptMock);
            //Act Statement(s)
            Script result = ScriptBuilder.createP2WPKHOutputScript(keyMock);
            //Assert statement(s)
            assertThat(result, equalTo(scriptMock));
            verify(keyMock, atLeast(1)).isCompressed();
            verify(keyMock, atLeast(1)).getPubKeyHash();
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            scriptBuilder.verify(() -> ScriptBuilder.createP2WPKHOutputScript(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${8f0a728e-d7f7-3dda-88ab-32cb9d57ef72}
    @Test()
    public void createP2SHOutputScriptTest() {
        /**
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: org.bitcoinj.script.ScriptBuilder
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class)) {
            Instant instant = TimeUtils.currentTime();
            timeUtils.when(() -> TimeUtils.currentTime()).thenReturn(instant);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            Script result = ScriptBuilder.createP2SHOutputScript(byteArray);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            timeUtils.verify(() -> TimeUtils.currentTime(), atLeast(1));
        }
    }

    //Sapient generated method id: ${133762ac-56be-38b2-ace6-da8f0fe42388}
    @Test()
    public void createP2SHOutputScript1Test() {
        //Arrange Statement(s)
        try (MockedStatic<ScriptBuilder> scriptBuilder = mockStatic(ScriptBuilder.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(redeemScriptMock).program();
            byte[] byteArray2 = new byte[]{(byte) -76, (byte) 114, (byte) -94, (byte) 102, (byte) -48, (byte) -67, (byte) -119, (byte) -63, (byte) 55, (byte) 6, (byte) -92, (byte) 19, (byte) 44, (byte) -49, (byte) -79, (byte) 111, (byte) 124, (byte) 59, (byte) -97, (byte) -53};
            scriptBuilder.when(() -> ScriptBuilder.createP2SHOutputScript(byteArray2)).thenReturn(scriptMock);
            //Act Statement(s)
            Script result = ScriptBuilder.createP2SHOutputScript(redeemScriptMock);
            //Assert statement(s)
            assertThat(result, equalTo(scriptMock));
            verify(redeemScriptMock, atLeast(1)).program();
            scriptBuilder.verify(() -> ScriptBuilder.createP2SHOutputScript(byteArray2), atLeast(1));
        }
    }

    //Sapient generated method id: ${e4426e94-9b71-3fe4-89e3-9f5f44d4dae6}
    @Test()
    public void createP2WSHOutputScriptWhenHashLengthEqualsSegwitAddressWITNESS_PROGRAM_LENGTH_SH() {
        /* Branches:
         * (hash.length == SegwitAddress.WITNESS_PROGRAM_LENGTH_SH) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};

        //Act Statement(s)
        Script result = ScriptBuilder.createP2WSHOutputScript(byteArray);
        ScriptBuilder scriptBuilder = new ScriptBuilder();
        ScriptBuilder scriptBuilder2 = scriptBuilder.smallNum(0);
        ScriptBuilder scriptBuilder3 = scriptBuilder2.data(byteArray);
        Script script = scriptBuilder3.build();

        //Assert statement(s)
        assertThat(result, equalTo(script));
    }

    //Sapient generated method id: ${f6cf0b64-e4d4-3d7c-8cd8-765676bfd768}
    @Test()
    public void createP2WSHOutputScriptWhenHashLengthNotEqualsSegwitAddressWITNESS_PROGRAM_LENGTH_SH() {
        /* Branches:
         * (hash.length == SegwitAddress.WITNESS_PROGRAM_LENGTH_SH) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            Script result = ScriptBuilder.createP2WSHOutputScript(byteArray);
            ScriptBuilder scriptBuilder = new ScriptBuilder();
            ScriptBuilder scriptBuilder2 = scriptBuilder.smallNum(0);
            ScriptBuilder scriptBuilder3 = scriptBuilder2.data(byteArray);
            Script script = scriptBuilder3.build();
            //Assert statement(s)
            assertThat(result, equalTo(script));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
        }
    }

    //Sapient generated method id: ${1c478875-e665-3697-8ef3-a3a682bab7f7}
    @Test()
    public void createP2WSHOutputScript1Test() {
        //Arrange Statement(s)
        try (MockedStatic<ScriptBuilder> scriptBuilder = mockStatic(ScriptBuilder.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(redeemScriptMock).program();
            byte[] byteArray2 = new byte[]{(byte) -29, (byte) -80, (byte) -60, (byte) 66, (byte) -104, (byte) -4, (byte) 28, (byte) 20, (byte) -102, (byte) -5, (byte) -12, (byte) -56, (byte) -103, (byte) 111, (byte) -71, (byte) 36, (byte) 39, (byte) -82, (byte) 65, (byte) -28, (byte) 100, (byte) -101, (byte) -109, (byte) 76, (byte) -92, (byte) -107, (byte) -103, (byte) 27, (byte) 120, (byte) 82, (byte) -72, (byte) 85};
            scriptBuilder.when(() -> ScriptBuilder.createP2WSHOutputScript(byteArray2)).thenReturn(scriptMock);
            //Act Statement(s)
            Script result = ScriptBuilder.createP2WSHOutputScript(redeemScriptMock);
            //Assert statement(s)
            assertThat(result, equalTo(scriptMock));
            verify(redeemScriptMock, atLeast(1)).program();
            scriptBuilder.verify(() -> ScriptBuilder.createP2WSHOutputScript(byteArray2), atLeast(1));
        }
    }

    //Sapient generated method id: ${f7c47eab-eaac-3170-b164-a96cd82ae597}
    @Test()
    public void createP2SHOutputScript2Test() {
        //Arrange Statement(s)
        Script scriptMock2 = mock(Script.class);
        try (MockedStatic<ScriptBuilder> scriptBuilder = mockStatic(ScriptBuilder.class, CALLS_REAL_METHODS)) {
            scriptBuilder.when(() -> ScriptBuilder.createRedeemScript(eq(0), anyList())).thenReturn(scriptMock);
            scriptBuilder.when(() -> ScriptBuilder.createP2SHOutputScript(scriptMock)).thenReturn(scriptMock2);
            List<ECKey> eCKeyList = new ArrayList<>();
            //Act Statement(s)
            Script result = ScriptBuilder.createP2SHOutputScript(0, eCKeyList);
            //Assert statement(s)
            assertThat(result, equalTo(scriptMock2));
            scriptBuilder.verify(() -> ScriptBuilder.createRedeemScript(eq(0), anyList()), atLeast(1));
            scriptBuilder.verify(() -> ScriptBuilder.createP2SHOutputScript(scriptMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${90d6bb72-6555-345c-b090-90604c678a87}
    @Test()
    public void createRedeemScriptTest() {
        //Arrange Statement(s)
        try (MockedStatic<ScriptBuilder> scriptBuilder = mockStatic(ScriptBuilder.class, CALLS_REAL_METHODS)) {
            scriptBuilder.when(() -> ScriptBuilder.createMultiSigOutputScript(eq(0), anyList())).thenReturn(scriptMock);
            List<ECKey> eCKeyList = new ArrayList<>();
            //Act Statement(s)
            Script result = ScriptBuilder.createRedeemScript(0, eCKeyList);
            //Assert statement(s)
            assertThat(result, equalTo(scriptMock));
            scriptBuilder.verify(() -> ScriptBuilder.createMultiSigOutputScript(eq(0), anyList()), atLeast(1));
        }
    }

    //Sapient generated method id: ${de4209a8-2a2f-3516-bb1a-9c0d83060be0}
    @Test()
    public void createOpReturnScriptWhenDataLengthLessThanOrEqualsTo80() {
        /* Branches:
         * (data.length <= 80) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};

        //Act Statement(s)
        Script result = ScriptBuilder.createOpReturnScript(byteArray);
        ScriptBuilder scriptBuilder = new ScriptBuilder();
        ScriptBuilder scriptBuilder2 = scriptBuilder.op(106);
        ScriptBuilder scriptBuilder3 = scriptBuilder2.data(byteArray);
        Script script = scriptBuilder3.build();

        //Assert statement(s)
        assertThat(result, equalTo(script));
    }

    //Sapient generated method id: ${e48f3bac-9dea-3c4a-bea7-a392e13fb0c2}
    @Test()
    public void createOpReturnScriptWhenDataLengthGreaterThan80() {
        /* Branches:
         * (data.length <= 80) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 37, (byte) 38, (byte) 39, (byte) 40, (byte) 41, (byte) 42, (byte) 43, (byte) 44, (byte) 45, (byte) 46, (byte) 47, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 58, (byte) 59, (byte) 60, (byte) 61, (byte) 62, (byte) 63, (byte) 64, (byte) 65, (byte) 66, (byte) 67, (byte) 68, (byte) 69, (byte) 70, (byte) 71, (byte) 72, (byte) 73, (byte) 74, (byte) 75, (byte) 76, (byte) 77, (byte) 78, (byte) 79, (byte) 80};
            //Act Statement(s)
            Script result = ScriptBuilder.createOpReturnScript(byteArray);
            ScriptBuilder scriptBuilder = new ScriptBuilder();
            ScriptBuilder scriptBuilder2 = scriptBuilder.op(106);
            ScriptBuilder scriptBuilder3 = scriptBuilder2.data(byteArray);
            Script script = scriptBuilder3.build();
            //Assert statement(s)
            assertThat(result, equalTo(script));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
        }
    }
}
