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
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.isA;
import static org.mockito.Mockito.doReturn;

public class ScriptChunkSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${19b1583e-5d8a-3a8b-8d1e-315d763527ea}
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

    //Sapient generated method id: ${02eca3b4-fb24-3d9c-95bb-6149a1c0eb3b}
    @Test()
    public void equalsOpCodeWhenOpcodeNotEqualsThisOpcode() {
        /* Branches:
         * (opcode == this.opcode) : false
         */
        //Arrange Statement(s)
        //byte[] byteArray = new byte[] {};
        //ScriptChunk target = new ScriptChunk(2, byteArray);
        //Act Statement(s)
        //boolean result = target.equalsOpCode(1);
        //Assert statement(s)
        //assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${4bbf50a5-9a53-3c74-9a93-774fab844119}
    @Test()
    public void isOpCodeWhenOpcodeGreaterThanOP_PUSHDATA4() {
        /* Branches:
         * (opcode > OP_PUSHDATA4) : true
         */
        //Arrange Statement(s)
        //byte[] byteArray = new byte[] {};
        //ScriptChunk target = new ScriptChunk(79, byteArray);
        //Act Statement(s)
        //boolean result = target.isOpCode();
        //Assert statement(s)
        //assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${cc6b4916-4795-3db6-bbf0-fc260c5f8b4a}
    @Test()
    public void isOpCodeWhenOpcodeNotGreaterThanOP_PUSHDATA4() {
        /* Branches:
         * (opcode > OP_PUSHDATA4) : false
         */
        //Arrange Statement(s)
        //byte[] byteArray = new byte[] {};
        //ScriptChunk target = new ScriptChunk(1, byteArray);
        //Act Statement(s)
        //boolean result = target.isOpCode();
        //Assert statement(s)
        //assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${be2d34b8-6894-3632-8ecc-98daba821a11}
    @Test()
    public void isPushDataWhenOpcodeLessThanOrEqualsToOP_16() {
        /* Branches:
         * (opcode <= OP_16) : true
         */
        //Arrange Statement(s)
        //byte[] byteArray = new byte[] {};
        //ScriptChunk target = new ScriptChunk(1, byteArray);
        //Act Statement(s)
        //boolean result = target.isPushData();
        //Assert statement(s)
        //assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${73b2a42e-2907-3192-998b-33df795f7bb6}
    @Test()
    public void isPushDataWhenOpcodeGreaterThanOP_16() {
        /* Branches:
         * (opcode <= OP_16) : false
         */
        //Arrange Statement(s)
        //byte[] byteArray = new byte[] {};
        //ScriptChunk target = new ScriptChunk(97, byteArray);
        //Act Statement(s)
        //boolean result = target.isPushData();
        //Assert statement(s)
        //assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${93378df4-ca47-3bbf-bae3-79d9a458a4c2}
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

    //Sapient generated method id: ${4afcb746-7cea-3147-8661-9bcaf60084e9}
    @Test()
    public void isShortestPossiblePushDataWhenDataIsNull() {
        /* Branches:
         * (data == null) : true
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
    preconditions.when(() -> Preconditions.checkState(false)).thenAnswer((Answer<Void>) invocation -> null);
    ScriptChunk target = spy(new ScriptChunk(0, (byte[]) null));
    doReturn(false).when(target).isPushData();
    //Act Statement(s)
    boolean result = target.isShortestPossiblePushData();
    //Assert statement(s)
    assertThat(result, equalTo(Boolean.TRUE));
    preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
    verify(target).isPushData();
}*/
    }

    //Sapient generated method id: ${f089087f-7349-3bb7-be41-36d72aa27445}
    @Test()
    public void isShortestPossiblePushDataWhenOpcodeEqualsOP_0() {
        /* Branches:
         * (data == null) : false
         * (data.length == 0) : true
         * (opcode == OP_0) : true
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
    preconditions.when(() -> Preconditions.checkState(false)).thenAnswer((Answer<Void>) invocation -> null);
    byte[] byteArray = new byte[] {};
    ScriptChunk target = spy(new ScriptChunk(0, byteArray));
    doReturn(false).when(target).isPushData();
    //Act Statement(s)
    boolean result = target.isShortestPossiblePushData();
    //Assert statement(s)
    assertThat(result, equalTo(Boolean.TRUE));
    preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
    verify(target).isPushData();
}*/
    }

    //Sapient generated method id: ${89cc6cd3-84bb-3ba7-b875-dafda89341fc}
    @Test()
    public void isShortestPossiblePushDataWhenOpcodeNotEqualsOP_0() {
        /* Branches:
         * (data == null) : false
         * (data.length == 0) : true
         * (opcode == OP_0) : false
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
    preconditions.when(() -> Preconditions.checkState(false)).thenAnswer((Answer<Void>) invocation -> null);
    byte[] byteArray = new byte[] {};
    ScriptChunk target = spy(new ScriptChunk(-1, byteArray));
    doReturn(false).when(target).isPushData();
    //Act Statement(s)
    boolean result = target.isShortestPossiblePushData();
    //Assert statement(s)
    assertThat(result, equalTo(Boolean.FALSE));
    preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
    verify(target).isPushData();
}*/
    }

    //Sapient generated method id: ${15af05f6-c6ac-38f9-b3df-143147aaeed1}
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
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
    preconditions.when(() -> Preconditions.checkState(false)).thenAnswer((Answer<Void>) invocation -> null);
    byte[] byteArray = new byte[] { (byte) 1 };
    ScriptChunk target = spy(new ScriptChunk(81, byteArray));
    doReturn(false).when(target).isPushData();
    //Act Statement(s)
    boolean result = target.isShortestPossiblePushData();
    //Assert statement(s)
    assertThat(result, equalTo(Boolean.TRUE));
    preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
    verify(target).isPushData();
}*/
    }

    //Sapient generated method id: ${b4292f0c-ee87-3e5e-810e-a5331b385acf}
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
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
    preconditions.when(() -> Preconditions.checkState(false)).thenAnswer((Answer<Void>) invocation -> null);
    byte[] byteArray = new byte[] { (byte) 1 };
    ScriptChunk target = spy(new ScriptChunk(82, byteArray));
    doReturn(false).when(target).isPushData();
    //Act Statement(s)
    boolean result = target.isShortestPossiblePushData();
    //Assert statement(s)
    assertThat(result, equalTo(Boolean.FALSE));
    preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
    verify(target).isPushData();
}*/
    }

    //Sapient generated method id: ${c3051d07-4709-3bdd-8f03-27e0c780b317}
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
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
    preconditions.when(() -> Preconditions.checkState(false)).thenAnswer((Answer<Void>) invocation -> null);
    byte[] byteArray = new byte[] { (byte) 17 };
    ScriptChunk target = spy(new ScriptChunk(79, byteArray));
    doReturn(false).when(target).isPushData();
    //Act Statement(s)
    boolean result = target.isShortestPossiblePushData();
    //Assert statement(s)
    assertThat(result, equalTo(Boolean.FALSE));
    preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
    verify(target).isPushData();
}*/
    }

    //Sapient generated method id: ${f8a54b08-1297-3180-b054-6add2b234890}
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

    //Sapient generated method id: ${a6f294f9-121e-3317-8a8d-78b85ded76cb}
    @Test()
    public void isShortestPossiblePushDataWhenDataLengthLessThanOP_PUSHDATA1AndOpcodeNotEqualsDataLength() {
        /* Branches:
         * (data == null) : false
         * (data.length == 0) : false
         * (data.length == 1) : true
         * (b >= 0x01) : false
         * ((b & 0xFF) == 0x81) : false
         * (data.length < OP_PUSHDATA1) : true
         * (opcode == data.length) : false
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
    preconditions.when(() -> Preconditions.checkState(false)).thenAnswer((Answer<Void>) invocation -> null);
    byte[] byteArray = new byte[] { (byte) 0 };
    ScriptChunk target = spy(new ScriptChunk(2, byteArray));
    doReturn(false).when(target).isPushData();
    //Act Statement(s)
    boolean result = target.isShortestPossiblePushData();
    //Assert statement(s)
    assertThat(result, equalTo(Boolean.FALSE));
    preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
    verify(target).isPushData();
}*/
    }

    //Sapient generated method id: ${5f7de7e8-b85d-3094-9c7c-5413736fd222}
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

    //Sapient generated method id: ${e9682b32-4293-3338-b5b2-0a3bd6d47af9}
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

    //Sapient generated method id: ${ab9c3eae-de9e-398d-88b1-413fbdfe8410}
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
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
    preconditions.when(() -> Preconditions.checkState(false)).thenAnswer((Answer<Void>) invocation -> null);
    byte[] byteArray = new byte[] {};
    ScriptChunk target = spy(new ScriptChunk(0, byteArray));
    doReturn(false).when(target).isPushData();
    //Act Statement(s)
    boolean result = target.isShortestPossiblePushData();
    //Assert statement(s)
    assertThat(result, equalTo(Boolean.TRUE));
    preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
    verify(target).isPushData();
}*/
    }

    //Sapient generated method id: ${43034b8c-28b2-3d0d-b7be-2a50c2331f4a}
    @Test()
    public void writeWhenDataIsNull() throws IOException {
        /* Branches:
         * (isOpCode()) : true
         * (data == null) : true
         */
        //Arrange Statement(s)
        //ScriptChunk target = spy(new ScriptChunk(0, (byte[]) null));
        //doReturn(true).when(target).isOpCode();
        //OutputStream outputStream = OutputStream.nullOutputStream();
        //Act Statement(s)
        //target.write(outputStream);
        //Assert statement(s)
        //verify(target).isOpCode();
    }

    //Sapient generated method id: ${caee19ce-edd7-359b-8a52-22420e2e2b06}
    @Test()
    public void writeWhenDataIsNotNullThrowsIllegalStateException() throws IOException {
        /* Branches:
         * (isOpCode()) : true
         * (data == null) : false
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
    IllegalStateException illegalStateException = new IllegalStateException();
    preconditions.when(() -> Preconditions.checkState(false)).thenThrow(illegalStateException);
    byte[] byteArray = new byte[] {};
    ScriptChunk target = spy(new ScriptChunk(0, byteArray));
    doReturn(true).when(target).isOpCode();
    thrown.expect(IllegalStateException.class);
    OutputStream outputStream = OutputStream.nullOutputStream();
    //Act Statement(s)
    target.write(outputStream);
    //Assert statement(s)
    preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
    verify(target).isOpCode();
}*/
    }

    //Sapient generated method id: ${c19d6f6f-7c4f-3b80-88fe-1b9e05aaddff}
    @Test()
    public void writeWhenIsOpCodeNotAndDataIsNull() throws IOException {
        /* Branches:
         * (isOpCode()) : false
         * (data != null) : false
         */
        //Arrange Statement(s)
        //ScriptChunk target = spy(new ScriptChunk(0, (byte[]) null));
        //doReturn(false).when(target).isOpCode();
        //OutputStream outputStream = OutputStream.nullOutputStream();
        //Act Statement(s)
        //target.write(outputStream);
        //Assert statement(s)
        //verify(target).isOpCode();
    }

    //Sapient generated method id: ${65705f2c-223a-3278-baca-1e2d593a78ee}
    @Test()
    public void writeWhenDataLengthEqualsOpcode() throws IOException {
        /* Branches:
         * (isOpCode()) : false
         * (data != null) : true
         * (opcode < OP_PUSHDATA1) : true
         * (data.length == opcode) : true
         */
        //Arrange Statement(s)
        //byte[] byteArray = new byte[] {};
        //ScriptChunk target = spy(new ScriptChunk(0, byteArray));
        //doReturn(false).when(target).isOpCode();
        //OutputStream outputStream = OutputStream.nullOutputStream();
        //Act Statement(s)
        //target.write(outputStream);
        //Assert statement(s)
        //verify(target).isOpCode();
    }

    //Sapient generated method id: ${0427b6bd-9422-371e-8d4b-205321e345fa}
    @Test()
    public void writeWhenDataLengthNotEqualsOpcodeThrowsIllegalStateException() throws IOException {
        /* Branches:
         * (isOpCode()) : false
         * (data != null) : true
         * (opcode < OP_PUSHDATA1) : true
         * (data.length == opcode) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(false)).thenThrow(illegalStateException);
            byte[] byteArray = new byte[]{};
            ScriptChunk target = spy(new ScriptChunk(1, byteArray));
            doReturn(false).when(target).isOpCode();
            thrown.expect(IllegalStateException.class);
            OutputStream outputStream = OutputStream.nullOutputStream();
            //Act Statement(s)
            target.write(outputStream);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            verify(target).isOpCode();
        }
    }

    //Sapient generated method id: ${13d9a598-3cf4-3283-b18e-f3a5f7c45ddd}
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
        OutputStream outputStream = OutputStream.nullOutputStream();
        //Act Statement(s)
        target.write(outputStream);
        //Assert statement(s)
        verify(target).isOpCode();
    }

    //Sapient generated method id: ${f4502ae3-278b-35f0-a04e-565387b09b50}
    @Test()
    public void writeWhenDataLengthGreaterThan255ThrowsIllegalStateException() throws IOException {
        /* Branches:
         * (isOpCode()) : false
         * (data != null) : true
         * (opcode < OP_PUSHDATA1) : false
         * (opcode == OP_PUSHDATA1) : true
         * (data.length <= 0xFF) : false
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        ScriptChunk target = spy(new ScriptChunk(0, byteArray));
        doReturn(false).when(target).isOpCode();
        OutputStream outputStream = OutputStream.nullOutputStream();
        //Act Statement(s)
        target.write(outputStream);
        //Assert statement(s)
        verify(target).isOpCode();
    }

    //Sapient generated method id: ${3ffb167d-a5a9-3581-975d-d3a779d225c9}
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
        OutputStream outputStream = OutputStream.nullOutputStream();
        //Act Statement(s)
        target.write(outputStream);
        //Assert statement(s)
        verify(target).isOpCode();
    }

    //Sapient generated method id: ${02697ec5-56cf-3166-85bf-7a1f8886bf06}
    @Test()
    public void writeWhenDataLengthGreaterThan65535ThrowsIllegalStateException() throws IOException {
        /* Branches:
         * (isOpCode()) : false
         * (data != null) : true
         * (opcode < OP_PUSHDATA1) : false
         * (opcode == OP_PUSHDATA1) : false
         * (opcode == OP_PUSHDATA2) : true
         * (data.length <= 0xFFFF) : false
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        ScriptChunk target = spy(new ScriptChunk(0, byteArray));
        doReturn(false).when(target).isOpCode();
        OutputStream outputStream = OutputStream.nullOutputStream();
        //Act Statement(s)
        target.write(outputStream);
        //Assert statement(s)
        verify(target).isOpCode();
    }

    //Sapient generated method id: ${2a2c7ace-8de1-30e9-b7b5-b9497c541d78}
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
        OutputStream outputStream = OutputStream.nullOutputStream();
        //Act Statement(s)
        target.write(outputStream);
        //Assert statement(s)
        verify(target).isOpCode();
    }

    //Sapient generated method id: ${9332bc83-c2f4-34f5-be5a-e36c707b3620}
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
        OutputStream outputStream = OutputStream.nullOutputStream();
        //Act Statement(s)
        target.write(outputStream);
        //Assert statement(s)
        verify(target).isOpCode();
    }

    //Sapient generated method id: ${8d913b1d-b84c-378a-bd9f-97f3196ac376}
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
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        ScriptChunk target = spy(new ScriptChunk(0, byteArray));
        doReturn(false).when(target).isOpCode();
        OutputStream outputStream = OutputStream.nullOutputStream();
        //Act Statement(s)
        target.write(outputStream);
        //Assert statement(s)
        verify(target).isOpCode();
    }

    //Sapient generated method id: ${49437d84-80ef-3baa-99c8-2dac74bc4473}
    @Test()
    public void toByteArrayTest() throws IOException {
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        ScriptChunk target = spy(new ScriptChunk(0, byteArray));
        doNothing().when(target).write((ByteArrayOutputStream) any());
        //Act Statement(s)
        byte[] result = target.toByteArray();
        byte[] byteResultArray = new byte[]{};
        //Assert statement(s)
        assertThat(result, equalTo(byteResultArray));
        verify(target).write((ByteArrayOutputStream) any());
    }

    //Sapient generated method id: ${265595e9-6f4b-30f8-bdef-a1557f7c2212}
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
        thrown.expectCause(isA(IOException.class));
        //Act Statement(s)
        target.toByteArray();
        //Assert statement(s)
        verify(target).write((ByteArrayOutputStream) any());
    }

    //Sapient generated method id: ${f533181c-bc8c-3e85-9a61-84d911fb3ed0}
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

    //Sapient generated method id: ${90d5f10f-a379-3ef5-8552-91fd7872e200}
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

    //Sapient generated method id: ${816845ef-2d8b-3b85-9f12-a1326a9e60e9}
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

    //Sapient generated method id: ${a8be6a8c-aed6-3475-be8d-ee4c279186dd}
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

    //Sapient generated method id: ${f00df96f-bb05-3cb2-a6e2-26b27c36cfe5}
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
