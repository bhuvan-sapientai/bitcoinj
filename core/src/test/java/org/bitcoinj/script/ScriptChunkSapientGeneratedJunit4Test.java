package org.bitcoinj.script;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;

import org.junit.rules.ExpectedException;
import org.mockito.stubbing.Answer;
import org.bitcoinj.base.internal.Preconditions;

import java.io.OutputStream;

import org.mockito.MockedStatic;

import java.io.ByteArrayOutputStream;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.spy;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class ScriptChunkSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${19b1583e-5d8a-3a8b-8d1e-315d763527ea}, hash: EDEE6F8F7BDD2B5DFC850E37DEC8D213
    @Test()
    public void equalsOpCodeWhenOpcodeEqualsThisOpcode() {
        /* Branches:
         * (opcode == this.opcode) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        ScriptChunk target = new ScriptChunk(1, byteArray);
        //Act Statement(s)
        boolean result = target.equalsOpCode(1);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${02eca3b4-fb24-3d9c-95bb-6149a1c0eb3b}, hash: C9A33E364174528590ACBFBAD627FAAE
    @Test()
    public void equalsOpCodeWhenOpcodeNotEqualsThisOpcode() {
        /* Branches:
         * (opcode == this.opcode) : false
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        ScriptChunk target = new ScriptChunk(2, byteArray);
        //Act Statement(s)
        boolean result = target.equalsOpCode(1);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${4bbf50a5-9a53-3c74-9a93-774fab844119}, hash: 5B271E842C67AB3408DB6EEE5AEF9B6E
    @Test()
    public void isOpCodeWhenOpcodeGreaterThanOP_PUSHDATA4() {
        /* Branches:
         * (opcode > OP_PUSHDATA4) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        ScriptChunk target = new ScriptChunk(79, byteArray);
        //Act Statement(s)
        boolean result = target.isOpCode();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${cc6b4916-4795-3db6-bbf0-fc260c5f8b4a}, hash: B84C1507E2111756029EC7147085D736
    @Test()
    public void isOpCodeWhenOpcodeNotGreaterThanOP_PUSHDATA4() {
        /* Branches:
         * (opcode > OP_PUSHDATA4) : false
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        ScriptChunk target = new ScriptChunk(1, byteArray);
        //Act Statement(s)
        boolean result = target.isOpCode();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${be2d34b8-6894-3632-8ecc-98daba821a11}, hash: B3CB1C6048D356300CDEC08D0CD24F70
    @Test()
    public void isPushDataWhenOpcodeLessThanOrEqualsToOP_16() {
        /* Branches:
         * (opcode <= OP_16) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        ScriptChunk target = new ScriptChunk(1, byteArray);
        //Act Statement(s)
        boolean result = target.isPushData();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${73b2a42e-2907-3192-998b-33df795f7bb6}, hash: A6C8EA183879C6D4C2BAB6CF8064D6B8
    @Test()
    public void isPushDataWhenOpcodeGreaterThanOP_16() {
        /* Branches:
         * (opcode <= OP_16) : false
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        ScriptChunk target = new ScriptChunk(97, byteArray);
        //Act Statement(s)
        boolean result = target.isPushData();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${93378df4-ca47-3bbf-bae3-79d9a458a4c2}, hash: AFD47FCE82EB1A4101D59FFED9E7D4F0
    @Test()
    public void decodeOpNTest() {
        //Arrange Statement(s)
        try (MockedStatic<Script> script = mockStatic(Script.class)) {
            script.when(() -> Script.decodeFromOpN(1)).thenReturn(0);
            byte[] byteArray = new byte[]{};
            ScriptChunk target = new ScriptChunk(1, byteArray);
            //Act Statement(s)
            int result = target.decodeOpN();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            script.verify(() -> Script.decodeFromOpN(1), atLeast(1));
        }
    }

    //Sapient generated method id: ${4afcb746-7cea-3147-8661-9bcaf60084e9}, hash: FFFB138345883F85DD8F09116198DE49
    @Test()
    public void isShortestPossiblePushDataWhenDataIsNull() {
        /* Branches:
         * (data == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkState(false)).thenAnswer((Answer<Void>) invocation -> null);
            ScriptChunk target = spy(new ScriptChunk(0, (byte[]) null));
            doReturn(false).when(target).isPushData();
            //Act Statement(s)
            boolean result = target.isShortestPossiblePushData();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            verify(target).isPushData();
        }
    }

    //Sapient generated method id: ${f089087f-7349-3bb7-be41-36d72aa27445}, hash: 9F763C9032A4DFE78C163E3D3B836469
    @Test()
    public void isShortestPossiblePushDataWhenOpcodeEqualsOP_0() {
        /* Branches:
         * (data == null) : false
         * (data.length == 0) : true
         * (opcode == OP_0) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkState(false)).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            ScriptChunk target = spy(new ScriptChunk(0, byteArray));
            doReturn(false).when(target).isPushData();
            //Act Statement(s)
            boolean result = target.isShortestPossiblePushData();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            verify(target).isPushData();
        }
    }

    //Sapient generated method id: ${89cc6cd3-84bb-3ba7-b875-dafda89341fc}, hash: B7BAF09AF960F53921057AA1D193EA66
    @Test()
    public void isShortestPossiblePushDataWhenOpcodeNotEqualsOP_0() {
        /* Branches:
         * (data == null) : false
         * (data.length == 0) : true
         * (opcode == OP_0) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkState(false)).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            ScriptChunk target = spy(new ScriptChunk(-1, byteArray));
            doReturn(false).when(target).isPushData();
            //Act Statement(s)
            boolean result = target.isShortestPossiblePushData();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            verify(target).isPushData();
        }
    }

    //Sapient generated method id: ${15af05f6-c6ac-38f9-b3df-143147aaeed1}, hash: 4D7EA0205C92CBBE2572A4B996DCB5B5
    @Test()
    public void isShortestPossiblePushDataWhenOpcodeEqualsOP_1PlusBMinus1() {
        /* Branches:
         * (data == null) : false
         * (data.length == 0) : false
         * (data.length == 1) : true
         * (b >= 0x01) : true
         * (b <= 0x10) : true
         * (opcode == OP_1 + b - 1) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkState(false)).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{(byte) 1};
            ScriptChunk target = spy(new ScriptChunk(81, byteArray));
            doReturn(false).when(target).isPushData();
            //Act Statement(s)
            boolean result = target.isShortestPossiblePushData();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            verify(target).isPushData();
        }
    }

    //Sapient generated method id: ${b4292f0c-ee87-3e5e-810e-a5331b385acf}, hash: B78EFFBE21E3A390F1A258B4ACB8DD7C
    @Test()
    public void isShortestPossiblePushDataWhenOpcodeNotEqualsOP_1PlusBMinus1() {
        /* Branches:
         * (data == null) : false
         * (data.length == 0) : false
         * (data.length == 1) : true
         * (b >= 0x01) : true
         * (b <= 0x10) : true
         * (opcode == OP_1 + b - 1) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkState(false)).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{(byte) 1};
            ScriptChunk target = spy(new ScriptChunk(82, byteArray));
            doReturn(false).when(target).isPushData();
            //Act Statement(s)
            boolean result = target.isShortestPossiblePushData();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            verify(target).isPushData();
        }
    }

    //Sapient generated method id: ${c3051d07-4709-3bdd-8f03-27e0c780b317}, hash: CA967BEA22EEFE8F043A191931516659
    @Ignore()
    @Test()
    public void isShortestPossiblePushDataWhenBAnd255Equals129AndOpcodeEqualsOP_1NEGATE() {
        /* Branches:
         * (data == null) : false
         * (data.length == 0) : false
         * (data.length == 1) : true
         * (b >= 0x01) : true
         * (b <= 0x10) : false
         * ((b & 0xFF) == 0x81) : true
         * (opcode == OP_1NEGATE) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkState(false)).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{(byte) 17};
            ScriptChunk target = spy(new ScriptChunk(79, byteArray));
            doReturn(false).when(target).isPushData();
            //Act Statement(s)
            boolean result = target.isShortestPossiblePushData();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            verify(target).isPushData();
        }
    }

    //Sapient generated method id: ${f8a54b08-1297-3180-b054-6add2b234890}, hash: 6CC073B4AF312FF555CA09A9DE4BBCBA
    @Ignore()
    @Test()
    public void isShortestPossiblePushDataWhenBAnd255Equals129AndOpcodeNotEqualsOP_1NEGATE() {
        /* Branches:
         * (data == null) : false
         * (data.length == 0) : false
         * (data.length == 1) : true
         * (b >= 0x01) : true
         * (b <= 0x10) : false
         * ((b & 0xFF) == 0x81) : true
         * (opcode == OP_1NEGATE) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkState(false)).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{(byte) 17};
            ScriptChunk target = spy(new ScriptChunk(1, byteArray));
            doReturn(false).when(target).isPushData();
            //Act Statement(s)
            boolean result = target.isShortestPossiblePushData();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            verify(target).isPushData();
        }
    }

    //Sapient generated method id: ${5f7de7e8-b85d-3094-9c7c-5413736fd222}, hash: 4F49E84CCB2623BB1B7371F351963690
    @Test()
    public void isShortestPossiblePushDataWhenBAnd255NotEquals129AndDataLengthLessThanOP_PUSHDATA1AndOpcodeEqualsDataLength() {
        /* Branches:
         * (data == null) : false
         * (data.length == 0) : false
         * (data.length == 1) : true
         * (b >= 0x01) : true
         * (b <= 0x10) : false
         * ((b & 0xFF) == 0x81) : false
         * (data.length < OP_PUSHDATA1) : true
         * (opcode == data.length) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkState(false)).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{(byte) 17};
            ScriptChunk target = spy(new ScriptChunk(1, byteArray));
            doReturn(false).when(target).isPushData();
            //Act Statement(s)
            boolean result = target.isShortestPossiblePushData();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            verify(target).isPushData();
        }
    }

    //Sapient generated method id: ${1c5f8f31-1cc4-3af8-8fa7-d139073710bf}, hash: 4EE471734FC3AE16ADD2D15023A9FD55
    @Test()
    public void isShortestPossiblePushDataWhenBAnd255NotEquals129AndDataLengthLessThanOP_PUSHDATA1AndOpcodeNotEqualsDataLength() {
        /* Branches:
         * (data == null) : false
         * (data.length == 0) : false
         * (data.length == 1) : true
         * (b >= 0x01) : true
         * (b <= 0x10) : false
         * ((b & 0xFF) == 0x81) : false
         * (data.length < OP_PUSHDATA1) : true
         * (opcode == data.length) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkState(false)).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{(byte) 17};
            ScriptChunk target = spy(new ScriptChunk(0, byteArray));
            doReturn(false).when(target).isPushData();
            //Act Statement(s)
            boolean result = target.isShortestPossiblePushData();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            verify(target).isPushData();
        }
    }

    //Sapient generated method id: ${e9682b32-4293-3338-b5b2-0a3bd6d47af9}, hash: 4B11CB0FAE9B8390ACE7E38D842C87BD
    @Test()
    public void isShortestPossiblePushDataWhenDataLengthLessThan256AndOpcodeEqualsOP_PUSHDATA1() {
        /* Branches:
         * (data == null) : false
         * (data.length == 0) : false
         * (data.length == 1) : true
         * (b >= 0x01) : true
         * (b <= 0x10) : false
         * ((b & 0xFF) == 0x81) : false
         * (data.length < OP_PUSHDATA1) : false
         * (data.length < 256) : true
         * (opcode == OP_PUSHDATA1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkState(false)).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            ScriptChunk target = spy(new ScriptChunk(0, byteArray));
            doReturn(false).when(target).isPushData();
            //Act Statement(s)
            boolean result = target.isShortestPossiblePushData();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            verify(target).isPushData();
        }
    }

    //Sapient generated method id: ${ab9c3eae-de9e-398d-88b1-413fbdfe8410}, hash: C15C995BA668DF9EA5FBF5D2D9A2E9CE
    @Ignore()
    @Test()
    public void isShortestPossiblePushDataWhenDataLengthLessThan256AndOpcodeNotEqualsOP_PUSHDATA1() {
        /* Branches:
         * (data == null) : false
         * (data.length == 0) : false
         * (data.length == 1) : true
         * (b >= 0x01) : true
         * (b <= 0x10) : false
         * ((b & 0xFF) == 0x81) : false
         * (data.length < OP_PUSHDATA1) : false
         * (data.length < 256) : true
         * (opcode == OP_PUSHDATA1) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkState(false)).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            ScriptChunk target = spy(new ScriptChunk(0, byteArray));
            doReturn(false).when(target).isPushData();
            //Act Statement(s)
            boolean result = target.isShortestPossiblePushData();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            verify(target).isPushData();
        }
    }

    //Sapient generated method id: ${43034b8c-28b2-3d0d-b7be-2a50c2331f4a}, hash: 3D1B6B458D40ADCAEEB65666F9B3455A
    @Test()
    public void writeWhenDataIsNull() throws IOException {
        /* Branches:
         * (isOpCode()) : true
         * (data == null) : true
         */
        //Arrange Statement(s)
        ScriptChunk target = spy(new ScriptChunk(0, (byte[]) null));
        doReturn(true).when(target).isOpCode();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        //Act Statement(s)
        target.write(byteArrayOutputStream);
        //Assert statement(s)
        verify(target).isOpCode();
    }

    //Sapient generated method id: ${caee19ce-edd7-359b-8a52-22420e2e2b06}, hash: 08EFDF8A0EB433F0F61373128E393115
    @Test()
    public void writeWhenDataIsNotNullThrowsIllegalStateException() throws IOException {
        /* Branches:
         * (isOpCode()) : true
         * (data == null) : false
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        ScriptChunk target = spy(new ScriptChunk(0, byteArray));
        doReturn(true).when(target).isOpCode();
        thrown.expect(IllegalStateException.class);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        //Act Statement(s)
        target.write(byteArrayOutputStream);
        //Assert statement(s)
        verify(target).isOpCode();
    }

    //Sapient generated method id: ${c19d6f6f-7c4f-3b80-88fe-1b9e05aaddff}, hash: 37A0278018C4144DB590797197A0028E
    @Test()
    public void writeWhenIsOpCodeNotAndDataIsNull() throws IOException {
        /* Branches:
         * (isOpCode()) : false
         * (data != null) : false
         */
        //Arrange Statement(s)
        ScriptChunk target = spy(new ScriptChunk(0, (byte[]) null));
        doReturn(false).when(target).isOpCode();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        //Act Statement(s)
        target.write(byteArrayOutputStream);
        //Assert statement(s)
        verify(target).isOpCode();
    }

    //Sapient generated method id: ${65705f2c-223a-3278-baca-1e2d593a78ee}, hash: CB05AF7BDA27927D5BB3C4F3C7F6A062
    @Test()
    public void writeWhenDataLengthEqualsOpcode() throws IOException {
        /* Branches:
         * (isOpCode()) : false
         * (data != null) : true
         * (opcode < OP_PUSHDATA1) : true
         * (data.length == opcode) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        ScriptChunk target = spy(new ScriptChunk(0, byteArray));
        doReturn(false).when(target).isOpCode();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        //Act Statement(s)
        target.write(byteArrayOutputStream);
        //Assert statement(s)
        verify(target).isOpCode();
    }

    //Sapient generated method id: ${0427b6bd-9422-371e-8d4b-205321e345fa}, hash: 3515DFE3F2D6200A927CE1B9105FE7E3
    @Test()
    public void writeWhenDataLengthNotEqualsOpcodeThrowsIllegalStateException() throws IOException {
        /* Branches:
         * (isOpCode()) : false
         * (data != null) : true
         * (opcode < OP_PUSHDATA1) : true
         * (data.length == opcode) : false
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        ScriptChunk target = spy(new ScriptChunk(1, byteArray));
        doReturn(false).when(target).isOpCode();
        thrown.expect(IllegalStateException.class);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        //Act Statement(s)
        target.write(byteArrayOutputStream);
        //Assert statement(s)
        verify(target).isOpCode();
    }

    //Sapient generated method id: ${13d9a598-3cf4-3283-b18e-f3a5f7c45ddd}, hash: 5EAB0644D1AA8250C27371A91782D176
    @Test()
    public void writeWhenDataLengthLessThanOrEqualsTo255() throws IOException {
        /* Branches:
         * (isOpCode()) : false
         * (data != null) : true
         * (opcode < OP_PUSHDATA1) : false
         * (opcode == OP_PUSHDATA1) : true
         * (data.length <= 0xFF) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        ScriptChunk target = spy(new ScriptChunk(76, byteArray));
        doReturn(false).when(target).isOpCode();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        //Act Statement(s)
        target.write(byteArrayOutputStream);
        //Assert statement(s)
        verify(target).isOpCode();
    }

    //Sapient generated method id: ${f4502ae3-278b-35f0-a04e-565387b09b50}, hash: 9C770D98A017796060807CB709C02FF1
    @Ignore()
    @Test()
    public void writeWhenDataLengthGreaterThan255ThrowsIllegalStateException() throws IOException {
        /* Branches:
         * (isOpCode()) : false
         * (data != null) : true
         * (opcode < OP_PUSHDATA1) : false
         * (opcode == OP_PUSHDATA1) : true
         * (data.length <= 0xFF) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        ScriptChunk target = spy(new ScriptChunk(0, byteArray));
        doReturn(false).when(target).isOpCode();
        thrown.expect(IllegalStateException.class);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        //Act Statement(s)
        target.write(byteArrayOutputStream);
        //Assert statement(s)
        verify(target).isOpCode();
    }

    //Sapient generated method id: ${3ffb167d-a5a9-3581-975d-d3a779d225c9}, hash: B4CB1E5709C7D26657FA7F179C900A86
    @Test()
    public void writeWhenDataLengthLessThanOrEqualsTo65535() throws IOException {
        /* Branches:
         * (isOpCode()) : false
         * (data != null) : true
         * (opcode < OP_PUSHDATA1) : false
         * (opcode == OP_PUSHDATA1) : false
         * (opcode == OP_PUSHDATA2) : true
         * (data.length <= 0xFFFF) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        ScriptChunk target = spy(new ScriptChunk(77, byteArray));
        doReturn(false).when(target).isOpCode();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        //Act Statement(s)
        target.write(byteArrayOutputStream);
        //Assert statement(s)
        verify(target).isOpCode();
    }

    //Sapient generated method id: ${02697ec5-56cf-3166-85bf-7a1f8886bf06}, hash: 9A280A057942C022F356F538E7661677
    @Ignore()
    @Test()
    public void writeWhenDataLengthGreaterThan65535ThrowsIllegalStateException() throws IOException {
        /* Branches:
         * (isOpCode()) : false
         * (data != null) : true
         * (opcode < OP_PUSHDATA1) : false
         * (opcode == OP_PUSHDATA1) : false
         * (opcode == OP_PUSHDATA2) : true
         * (data.length <= 0xFFFF) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        ScriptChunk target = spy(new ScriptChunk(0, byteArray));
        doReturn(false).when(target).isOpCode();
        thrown.expect(IllegalStateException.class);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        //Act Statement(s)
        target.write(byteArrayOutputStream);
        //Assert statement(s)
        verify(target).isOpCode();
    }

    //Sapient generated method id: ${2a2c7ace-8de1-30e9-b7b5-b9497c541d78}, hash: 26A74FCDC60AA72B508801DBA7B69095
    @Test()
    public void writeWhenOpcodeNotEqualsOP_PUSHDATA4ThrowsRuntimeException() throws IOException {
        /* Branches:
         * (isOpCode()) : false
         * (data != null) : true
         * (opcode < OP_PUSHDATA1) : false
         * (opcode == OP_PUSHDATA1) : false
         * (opcode == OP_PUSHDATA2) : false
         * (opcode == OP_PUSHDATA4) : false
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        ScriptChunk target = spy(new ScriptChunk(79, byteArray));
        doReturn(false).when(target).isOpCode();
        RuntimeException runtimeException = new RuntimeException("Unimplemented");
        thrown.expect(RuntimeException.class);
        thrown.expectMessage(runtimeException.getMessage());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        //Act Statement(s)
        target.write(byteArrayOutputStream);
        //Assert statement(s)
        verify(target).isOpCode();
    }

    //Sapient generated method id: ${9332bc83-c2f4-34f5-be5a-e36c707b3620}, hash: 2D495838AB60B6D2E1E8A9037600BBCA
    @Test()
    public void writeWhenDataLengthLessThanOrEqualsToScriptMAX_SCRIPT_ELEMENT_SIZE() throws IOException {
        /* Branches:
         * (isOpCode()) : false
         * (data != null) : true
         * (opcode < OP_PUSHDATA1) : false
         * (opcode == OP_PUSHDATA1) : false
         * (opcode == OP_PUSHDATA2) : false
         * (opcode == OP_PUSHDATA4) : true
         * (data.length <= Script.MAX_SCRIPT_ELEMENT_SIZE) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        ScriptChunk target = spy(new ScriptChunk(78, byteArray));
        doReturn(false).when(target).isOpCode();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        //Act Statement(s)
        target.write(byteArrayOutputStream);
        //Assert statement(s)
        verify(target).isOpCode();
    }

    //Sapient generated method id: ${8d913b1d-b84c-378a-bd9f-97f3196ac376}, hash: 4912F1C8C6FCAA21B10E696D6047F49B
    @Ignore()
    @Test()
    public void writeWhenDataLengthGreaterThanScriptMAX_SCRIPT_ELEMENT_SIZEThrowsIllegalStateException() throws IOException {
        /* Branches:
         * (isOpCode()) : false
         * (data != null) : true
         * (opcode < OP_PUSHDATA1) : false
         * (opcode == OP_PUSHDATA1) : false
         * (opcode == OP_PUSHDATA2) : false
         * (opcode == OP_PUSHDATA4) : true
         * (data.length <= Script.MAX_SCRIPT_ELEMENT_SIZE) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        ScriptChunk target = spy(new ScriptChunk(0, byteArray));
        doReturn(false).when(target).isOpCode();
        thrown.expect(IllegalStateException.class);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        //Act Statement(s)
        target.write(byteArrayOutputStream);
        //Assert statement(s)
        verify(target).isOpCode();
    }

    //Sapient generated method id: ${49437d84-80ef-3baa-99c8-2dac74bc4473}, hash: DB5A7EBF30583E9559C473009DD5818E
    @Test()
    public void toByteArrayTest() throws IOException {
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        ScriptChunk target = spy(new ScriptChunk(0, byteArray));
        doNothing().when(target).write((ByteArrayOutputStream) any());
        //Act Statement(s)
        byte[] result = target.toByteArray();
        //Assert statement(s)
        assertThat(result.length, equalTo(0));
        verify(target).write((ByteArrayOutputStream) any());
    }

    //Sapient generated method id: ${265595e9-6f4b-30f8-bdef-a1557f7c2212}, hash: 00E2A43FA14BA8E09BD18FEC56E3202C
    @Test()
    public void toByteArrayWhenCaughtIOExceptionThrowsRuntimeException() throws IOException {
        /* Branches:
         * (catch-exception (IOException)) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        ScriptChunk target = spy(new ScriptChunk(0, byteArray));
        IOException iOException = new IOException();
        doThrow(iOException).when(target).write((ByteArrayOutputStream) any());
        thrown.expect(RuntimeException.class);
        thrown.expectCause(is(instanceOf(IOException.class)));
        //Act Statement(s)
        target.toByteArray();
        //Assert statement(s)
        verify(target).write((ByteArrayOutputStream) any());
    }

    //Sapient generated method id: ${f533181c-bc8c-3e85-9a61-84d911fb3ed0}, hash: 5DBC242043FF4C925E2C221A5C6CE55B
    @Test()
    public void sizeWhenDataIsNull() {
        /* Branches:
         * (opcode == OP_PUSHDATA1) : true
         * (data == null) : true
         */
        //Arrange Statement(s)
        ScriptChunk target = new ScriptChunk(76, (byte[]) null);
        //Act Statement(s)
        int result = target.size();
        //Assert statement(s)
        assertThat(result, equalTo(2));
    }

    //Sapient generated method id: ${90d5f10f-a379-3ef5-8552-91fd7872e200}, hash: 52C914AB447642C581FA95EA9FFEAAA9
    @Test()
    public void sizeWhenOpcodeEqualsOP_PUSHDATA2AndDataIsNull() {
        /* Branches:
         * (opcode == OP_PUSHDATA1) : false
         * (opcode == OP_PUSHDATA2) : true
         * (data == null) : true
         */
        //Arrange Statement(s)
        ScriptChunk target = new ScriptChunk(77, (byte[]) null);
        //Act Statement(s)
        int result = target.size();
        //Assert statement(s)
        assertThat(result, equalTo(3));
    }

    //Sapient generated method id: ${816845ef-2d8b-3b85-9f12-a1326a9e60e9}, hash: 185E59EF7AA88118258D624675F95A52
    @Test()
    public void sizeWhenOpcodeEqualsOP_PUSHDATA4AndDataIsNotNull() {
        /* Branches:
         * (opcode == OP_PUSHDATA1) : false
         * (opcode == OP_PUSHDATA2) : false
         * (opcode == OP_PUSHDATA4) : true
         * (data == null) : false
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        ScriptChunk target = new ScriptChunk(78, byteArray);
        //Act Statement(s)
        int result = target.size();
        //Assert statement(s)
        assertThat(result, equalTo(5));
    }

    //Sapient generated method id: ${a8be6a8c-aed6-3475-be8d-ee4c279186dd}, hash: 3F116034E8C45E51AB4475EEAB5CB3D8
    @Test()
    public void toStringWhenDataIsNull() {
        /* Branches:
         * (data == null) : true
         */
        //Arrange Statement(s)
        ScriptChunk target = new ScriptChunk(1, (byte[]) null);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("NON_OP(1)"));
    }

    //Sapient generated method id: ${f00df96f-bb05-3cb2-a6e2-26b27c36cfe5}, hash: 30D708F18ABEB20BA2C654616879FD0E
    @Test()
    public void toStringWhenDataIsNotNull() {
        /* Branches:
         * (data == null) : false
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        ScriptChunk target = new ScriptChunk(1, byteArray);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("PUSHDATA(1)[]"));
    }
}
