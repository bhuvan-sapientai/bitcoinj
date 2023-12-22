package org.bitcoinj.script;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;

import org.mockito.MockedStatic;

import java.util.ArrayList;

import org.bitcoinj.base.Sha256Hash;

import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class ScriptPatternSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final ScriptChunk scriptChunkMock = mock(ScriptChunk.class);

    private final ScriptChunk scriptChunkMock2 = mock(ScriptChunk.class);

    private final ScriptChunk scriptChunkMock3 = mock(ScriptChunk.class);

    private final ScriptChunk scriptChunkMock4 = mock(ScriptChunk.class);

    private final ScriptChunk scriptChunkMock5 = mock(ScriptChunk.class);

    private final Script scriptMock = mock(Script.class);

    //Sapient generated method id: ${483768e9-c908-3eb2-a4e0-d8dc11af49b2}
    @Test()
    public void isP2PKHWhenChunksSizeNotEquals5() {
        /* Branches:
         * (chunks.size() != 5) : true
         */
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        //Act Statement(s)
        boolean result = ScriptPattern.isP2PKH(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(scriptMock).chunks();
    }

    //Sapient generated method id: ${82b777a6-acb6-30c0-afda-c64ee6c11643}
    @Test()
    public void isP2PKHWhenChunksGet0NotEqualsOpCodeOP_DUP() {
        /* Branches:
         * (chunks.size() != 5) : false
         * (!chunks.get(0).equalsOpCode(OP_DUP)) : true
         */
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        scriptChunkList.add(scriptChunkMock2);
        scriptChunkList.add(scriptChunkMock3);
        scriptChunkList.add(scriptChunkMock4);
        scriptChunkList.add(scriptChunkMock5);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        doReturn(false).when(scriptChunkMock).equalsOpCode(118);
        //Act Statement(s)
        boolean result = ScriptPattern.isP2PKH(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(scriptMock).chunks();
        verify(scriptChunkMock).equalsOpCode(118);
    }

    //Sapient generated method id: ${2250ebfc-8893-3a6b-8070-fd4e128db93a}
    @Test()
    public void isP2PKHWhenChunksGet1NotEqualsOpCodeOP_HASH160() {
        /* Branches:
         * (chunks.size() != 5) : false
         * (!chunks.get(0).equalsOpCode(OP_DUP)) : false
         * (!chunks.get(1).equalsOpCode(OP_HASH160)) : true
         */
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        scriptChunkList.add(scriptChunkMock2);
        scriptChunkList.add(scriptChunkMock3);
        scriptChunkList.add(scriptChunkMock4);
        scriptChunkList.add(scriptChunkMock5);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        doReturn(true).when(scriptChunkMock).equalsOpCode(118);
        doReturn(false).when(scriptChunkMock2).equalsOpCode(169);
        //Act Statement(s)
        boolean result = ScriptPattern.isP2PKH(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(scriptMock).chunks();
        verify(scriptChunkMock).equalsOpCode(118);
        verify(scriptChunkMock2).equalsOpCode(169);
    }

    //Sapient generated method id: ${ec0ac5a2-a731-3e8a-ade3-8b6bb6ad0db8}
    @Test()
    public void isP2PKHWhenChunk2dataIsNull() {
        /* Branches:
         * (chunks.size() != 5) : false
         * (!chunks.get(0).equalsOpCode(OP_DUP)) : false
         * (!chunks.get(1).equalsOpCode(OP_HASH160)) : false
         * (chunk2data == null) : true
         */
        //Arrange Statement(s)
        List list = new ArrayList<>();
        Script script = Script.of(list);
        //Act Statement(s)
        boolean result = ScriptPattern.isP2PKH(script);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${1df6780c-a963-3a9f-97b7-4d04bde0cfc8}
    @Test()
    public void isP2PKHWhenChunksGet3NotEqualsOpCodeOP_EQUALVERIFY() {
        /* Branches:
         * (chunks.size() != 5) : false
         * (!chunks.get(0).equalsOpCode(OP_DUP)) : false
         * (!chunks.get(1).equalsOpCode(OP_HASH160)) : false
         * (chunk2data == null) : false
         * (chunk2data.length != LegacyAddress.LENGTH) : false
         * (!chunks.get(3).equalsOpCode(OP_EQUALVERIFY)) : true
         */
        //Arrange Statement(s)
        List list = new ArrayList<>();
        Script script = Script.of(list);
        //Act Statement(s)
        boolean result = ScriptPattern.isP2PKH(script);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${b5a06c68-ce89-3071-9e1a-be38f14a5b6e}
    @Test()
    public void isP2PKHWhenChunksGet4NotEqualsOpCodeOP_CHECKSIG() {
        /* Branches:
         * (chunks.size() != 5) : false
         * (!chunks.get(0).equalsOpCode(OP_DUP)) : false
         * (!chunks.get(1).equalsOpCode(OP_HASH160)) : false
         * (chunk2data == null) : false
         * (chunk2data.length != LegacyAddress.LENGTH) : false
         * (!chunks.get(3).equalsOpCode(OP_EQUALVERIFY)) : false
         * (!chunks.get(4).equalsOpCode(OP_CHECKSIG)) : true
         */
        //Arrange Statement(s)
        List list = new ArrayList<>();
        Script script = Script.of(list);
        //Act Statement(s)
        boolean result = ScriptPattern.isP2PKH(script);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${0ab04191-aa62-3066-911a-9b020821212e}
    @Test()
    public void isP2PKHWhenChunksGet4EqualsOpCodeOP_CHECKSIG() {
        /* Branches:
         * (chunks.size() != 5) : false
         * (!chunks.get(0).equalsOpCode(OP_DUP)) : false
         * (!chunks.get(1).equalsOpCode(OP_HASH160)) : false
         * (chunk2data == null) : false
         * (chunk2data.length != LegacyAddress.LENGTH) : false
         * (!chunks.get(3).equalsOpCode(OP_EQUALVERIFY)) : false
         * (!chunks.get(4).equalsOpCode(OP_CHECKSIG)) : false
         */
        //Arrange Statement(s)
        List list = new ArrayList<>();
        Script script = Script.of(list);
        //Act Statement(s)
        boolean result = ScriptPattern.isP2PKH(script);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${d020ff75-b388-3ea7-b20c-f542f3569867}
    @Ignore()
    @Test()
    public void extractHashFromP2PKHTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ScriptChunk scriptChunkMock6 = mock(ScriptChunk.class);
        ScriptChunk scriptChunkMock7 = mock(ScriptChunk.class);
        ScriptChunk scriptChunkMock8 = mock(ScriptChunk.class);
        ScriptChunk scriptChunkMock9 = mock(ScriptChunk.class);
        ScriptChunk scriptChunkMock10 = mock(ScriptChunk.class);
        ScriptChunk scriptChunkMock11 = mock(ScriptChunk.class);
        ScriptChunk scriptChunkMock12 = mock(ScriptChunk.class);
        ScriptChunk scriptChunkMock13 = mock(ScriptChunk.class);
        ScriptChunk scriptChunkMock14 = mock(ScriptChunk.class);
        ScriptChunk scriptChunkMock15 = mock(ScriptChunk.class);
        ScriptChunk scriptChunkMock16 = mock(ScriptChunk.class);
        ScriptChunk scriptChunkMock17 = mock(ScriptChunk.class);
        ScriptChunk scriptChunkMock18 = mock(ScriptChunk.class);
        ScriptChunk scriptChunkMock19 = mock(ScriptChunk.class);
        ScriptChunk scriptChunkMock20 = mock(ScriptChunk.class);
        ScriptChunk scriptChunkMock21 = mock(ScriptChunk.class);
        ScriptChunk scriptChunkMock22 = mock(ScriptChunk.class);
        ScriptChunk scriptChunkMock23 = mock(ScriptChunk.class);
        ScriptChunk scriptChunkMock24 = mock(ScriptChunk.class);
        ScriptChunk scriptChunkMock25 = mock(ScriptChunk.class);
        ScriptChunk scriptChunkMock26 = mock(ScriptChunk.class);
        ScriptChunk scriptChunkMock27 = mock(ScriptChunk.class);
        ScriptChunk scriptChunkMock28 = mock(ScriptChunk.class);
        ScriptChunk scriptChunkMock29 = mock(ScriptChunk.class);
        ScriptChunk scriptChunkMock30 = mock(ScriptChunk.class);
        ScriptChunk scriptChunkMock31 = mock(ScriptChunk.class);
        ScriptChunk scriptChunkMock32 = mock(ScriptChunk.class);
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        scriptChunkList.add(scriptChunkMock2);
        scriptChunkList.add(scriptChunkMock3);
        scriptChunkList.add(scriptChunkMock4);
        scriptChunkList.add(scriptChunkMock5);
        scriptChunkList.add(scriptChunkMock6);
        scriptChunkList.add(scriptChunkMock7);
        scriptChunkList.add(scriptChunkMock8);
        scriptChunkList.add(scriptChunkMock9);
        scriptChunkList.add(scriptChunkMock10);
        scriptChunkList.add(scriptChunkMock11);
        scriptChunkList.add(scriptChunkMock12);
        scriptChunkList.add(scriptChunkMock13);
        scriptChunkList.add(scriptChunkMock14);
        scriptChunkList.add(scriptChunkMock15);
        scriptChunkList.add(scriptChunkMock16);
        scriptChunkList.add(scriptChunkMock17);
        scriptChunkList.add(scriptChunkMock18);
        scriptChunkList.add(scriptChunkMock19);
        scriptChunkList.add(scriptChunkMock20);
        scriptChunkList.add(scriptChunkMock21);
        scriptChunkList.add(scriptChunkMock22);
        scriptChunkList.add(scriptChunkMock23);
        scriptChunkList.add(scriptChunkMock24);
        scriptChunkList.add(scriptChunkMock25);
        scriptChunkList.add(scriptChunkMock26);
        scriptChunkList.add(scriptChunkMock27);
        scriptChunkList.add(scriptChunkMock28);
        scriptChunkList.add(scriptChunkMock29);
        scriptChunkList.add(scriptChunkMock30);
        scriptChunkList.add(scriptChunkMock31);
        scriptChunkList.add(scriptChunkMock32);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        //Act Statement(s)
        byte[] result = ScriptPattern.extractHashFromP2PKH(scriptMock);
        byte[] byteResultArray = new byte[]{};
        //Assert statement(s)
        assertThat(result, equalTo(byteResultArray));
        verify(scriptMock).chunks();
    }

    //Sapient generated method id: ${18d102ed-5f62-3b80-bdec-34b15be95004}
    @Test()
    public void isP2SHWhenChunksSizeNotEquals3() {
        /* Branches:
         * (chunks.size() != 3) : true
         */
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        //Act Statement(s)
        boolean result = ScriptPattern.isP2SH(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(scriptMock).chunks();
    }

    //Sapient generated method id: ${643388ec-a4c9-30ad-846f-704fddee40b6}
    @Test()
    public void isP2SHWhenChunksGet0NotEqualsOpCodeOP_HASH160() {
        /* Branches:
         * (chunks.size() != 3) : false
         * (!chunks.get(0).equalsOpCode(OP_HASH160)) : true
         */
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        scriptChunkList.add(scriptChunkMock2);
        scriptChunkList.add(scriptChunkMock3);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        doReturn(false).when(scriptChunkMock).equalsOpCode(169);
        //Act Statement(s)
        boolean result = ScriptPattern.isP2SH(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(scriptMock).chunks();
        verify(scriptChunkMock).equalsOpCode(169);
    }

    //Sapient generated method id: ${47140975-f74b-3228-911f-276c08ca6046}
    @Test()
    public void isP2SHWhenChunk1OpcodeNotEquals20() {
        /* Branches:
         * (chunks.size() != 3) : false
         * (!chunks.get(0).equalsOpCode(OP_HASH160)) : false
         * (chunk1.opcode != 0x14) : true
         */
        //Arrange Statement(s)
        List list = new ArrayList<>();
        Script script = Script.of(list);
        //Act Statement(s)
        boolean result = ScriptPattern.isP2SH(script);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${2a4f15f3-9ae7-3c2d-83d7-40c8624ef8f2}
    @Test()
    public void isP2SHWhenChunksGet2NotEqualsOpCodeOP_EQUAL() {
        /* Branches:
         * (chunks.size() != 3) : false
         * (!chunks.get(0).equalsOpCode(OP_HASH160)) : false
         * (chunk1.opcode != 0x14) : false
         * (chunk1data == null) : false
         * (chunk1data.length != LegacyAddress.LENGTH) : false
         * (!chunks.get(2).equalsOpCode(OP_EQUAL)) : true
         */
        //Arrange Statement(s)
        List list = new ArrayList<>();
        Script script = Script.of(list);
        //Act Statement(s)
        boolean result = ScriptPattern.isP2SH(script);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${3188903f-a86a-398c-b505-170ab8001405}
    @Test()
    public void isP2SHWhenChunksGet2EqualsOpCodeOP_EQUAL() {
        /* Branches:
         * (chunks.size() != 3) : false
         * (!chunks.get(0).equalsOpCode(OP_HASH160)) : false
         * (chunk1.opcode != 0x14) : false
         * (chunk1data == null) : false
         * (chunk1data.length != LegacyAddress.LENGTH) : false
         * (!chunks.get(2).equalsOpCode(OP_EQUAL)) : false
         */
        //Arrange Statement(s)
        List list = new ArrayList<>();
        Script script = Script.of(list);
        //Act Statement(s)
        boolean result = ScriptPattern.isP2SH(script);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${0caf4832-7d94-373a-b25d-c2d0ea2eb224}
    @Ignore()
    @Test()
    public void extractHashFromP2SHTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List list = new ArrayList<>();
        Script script = Script.of(list);
        //Act Statement(s)
        byte[] result = ScriptPattern.extractHashFromP2SH(script);
        byte[] byteResultArray = new byte[]{};
        //Assert statement(s)
        assertThat(result, equalTo(byteResultArray));
    }

    //Sapient generated method id: ${0c20955b-87ae-3adf-b232-fcf9ad518028}
    @Test()
    public void isP2PKWhenChunksSizeNotEquals2() {
        /* Branches:
         * (chunks.size() != 2) : true
         */
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        //Act Statement(s)
        boolean result = ScriptPattern.isP2PK(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(scriptMock).chunks();
    }

    //Sapient generated method id: ${a0ada994-cc91-3bb5-b94d-6faf3a223628}
    @Test()
    public void isP2PKWhenChunk0IsOpCode() {
        /* Branches:
         * (chunks.size() != 2) : false
         * (chunk0.isOpCode()) : true
         */
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        scriptChunkList.add(scriptChunkMock2);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        doReturn(true).when(scriptChunkMock).isOpCode();
        //Act Statement(s)
        boolean result = ScriptPattern.isP2PK(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(scriptMock).chunks();
        verify(scriptChunkMock).isOpCode();
    }

    //Sapient generated method id: ${bf5ee95d-7a2d-3931-b67c-a1c336741d0f}
    @Test()
    public void isP2PKWhenChunk0dataIsNull() {
        /* Branches:
         * (chunks.size() != 2) : false
         * (chunk0.isOpCode()) : false
         * (chunk0data == null) : true
         */
        //Arrange Statement(s)
        List list = new ArrayList<>();
        Script script = Script.of(list);
        //Act Statement(s)
        boolean result = ScriptPattern.isP2PK(script);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${5849cda2-7350-3934-bbc3-7027ee019347}
    @Test()
    public void isP2PKWhenChunksGet1NotEqualsOpCodeOP_CHECKSIG() {
        /* Branches:
         * (chunks.size() != 2) : false
         * (chunk0.isOpCode()) : false
         * (chunk0data == null) : false
         * (chunk0data.length <= 1) : false
         * (!chunks.get(1).equalsOpCode(OP_CHECKSIG)) : true
         */
        //Arrange Statement(s)
        List list = new ArrayList<>();
        Script script = Script.of(list);
        //Act Statement(s)
        boolean result = ScriptPattern.isP2PK(script);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${d5f59902-faa8-3538-99b2-f50af5a61f3e}
    @Test()
    public void isP2PKWhenChunksGet1EqualsOpCodeOP_CHECKSIG() {
        /* Branches:
         * (chunks.size() != 2) : false
         * (chunk0.isOpCode()) : false
         * (chunk0data == null) : false
         * (chunk0data.length <= 1) : false
         * (!chunks.get(1).equalsOpCode(OP_CHECKSIG)) : false
         */
        //Arrange Statement(s)
        List list = new ArrayList<>();
        Script script = Script.of(list);
        //Act Statement(s)
        boolean result = ScriptPattern.isP2PK(script);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${f6b02a19-efbd-32ad-a73a-58fcb08220be}
    @Ignore()
    @Test()
    public void extractKeyFromP2PKTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        //Act Statement(s)
        byte[] result = ScriptPattern.extractKeyFromP2PK(scriptMock);
        byte[] byteResultArray = new byte[]{};
        //Assert statement(s)
        assertThat(result, equalTo(byteResultArray));
        verify(scriptMock).chunks();
    }

    //Sapient generated method id: ${9d03f8bd-695f-3d1f-b738-fdd3bbb16bbf}
    @Test()
    public void isP2WHWhenChunksSizeNotEquals2() {
        /* Branches:
         * (chunks.size() != 2) : true
         */
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        //Act Statement(s)
        boolean result = ScriptPattern.isP2WH(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(scriptMock).chunks();
    }

    //Sapient generated method id: ${a9679c85-8def-35a4-b7d2-70c60b223d0c}
    @Test()
    public void isP2WHWhenChunksGet0NotEqualsOpCodeOP_0() {
        /* Branches:
         * (chunks.size() != 2) : false
         * (!chunks.get(0).equalsOpCode(OP_0)) : true
         */
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        scriptChunkList.add(scriptChunkMock2);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        doReturn(false).when(scriptChunkMock).equalsOpCode(0);
        //Act Statement(s)
        boolean result = ScriptPattern.isP2WH(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(scriptMock).chunks();
        verify(scriptChunkMock).equalsOpCode(0);
    }

    //Sapient generated method id: ${36e5e0f8-4f75-3a0d-9751-7fc91ac3dd19}
    @Test()
    public void isP2WHWhenChunk1dataIsNull() {
        /* Branches:
         * (chunks.size() != 2) : false
         * (!chunks.get(0).equalsOpCode(OP_0)) : false
         * (chunk1data == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List list = new ArrayList<>();
        Script script = Script.of(list);
        //Act Statement(s)
        boolean result = ScriptPattern.isP2WH(script);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${b9cec8df-01db-33f7-bdf0-30cb1b64022d}
    @Test()
    public void isP2WHWhenChunk1dataLengthEqualsSegwitAddressWITNESS_PROGRAM_LENGTH_SH() {
        /* Branches:
         * (chunks.size() != 2) : false
         * (!chunks.get(0).equalsOpCode(OP_0)) : false
         * (chunk1data == null) : false
         * (chunk1data.length != SegwitAddress.WITNESS_PROGRAM_LENGTH_PKH) : true
         * (chunk1data.length != SegwitAddress.WITNESS_PROGRAM_LENGTH_SH) : false
         */
        //Arrange Statement(s)
        List list = new ArrayList<>();
        Script script = Script.of(list);
        //Act Statement(s)
        boolean result = ScriptPattern.isP2WH(script);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${fd4a5876-b937-30f1-a087-ce2e75c16635}
    @Test()
    public void isP2WPKHWhenIsP2WHNotScript() {
        /* Branches:
         * (!isP2WH(script)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class, CALLS_REAL_METHODS)) {
            scriptPattern.when(() -> ScriptPattern.isP2WH(scriptMock)).thenReturn(false);
            //Act Statement(s)
            boolean result = ScriptPattern.isP2WPKH(scriptMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            scriptPattern.verify(() -> ScriptPattern.isP2WH(scriptMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${30dafa8d-575e-3418-8c92-3cfa4ebe5d49}
    @Test()
    public void isP2WPKHWhenChunksGet0NotEqualsOpCodeOP_0() {
        /* Branches:
         * (!isP2WH(script)) : false
         * (!chunks.get(0).equalsOpCode(OP_0)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class, CALLS_REAL_METHODS)) {
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(scriptChunkMock);
            doReturn(scriptChunkList).when(scriptMock).chunks();
            doReturn(false).when(scriptChunkMock).equalsOpCode(0);
            scriptPattern.when(() -> ScriptPattern.isP2WH(scriptMock)).thenReturn(true);
            //Act Statement(s)
            boolean result = ScriptPattern.isP2WPKH(scriptMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(scriptMock, atLeast(1)).chunks();
            verify(scriptChunkMock, atLeast(1)).equalsOpCode(0);
            scriptPattern.verify(() -> ScriptPattern.isP2WH(scriptMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${1e02a67a-0b17-34e8-b2db-f718cd6e71ac}
    @Ignore()
    @Test()
    public void isP2WPKHWhenChunk1dataLengthEqualsSegwitAddressWITNESS_PROGRAM_LENGTH_PKH() {
        /* Branches:
         * (!isP2WH(script)) : false
         * (!chunks.get(0).equalsOpCode(OP_0)) : false
         * (chunk1data != null) : true
         * (chunk1data.length == SegwitAddress.WITNESS_PROGRAM_LENGTH_PKH) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class, CALLS_REAL_METHODS)) {
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(scriptChunkMock);
            scriptChunkList.add(scriptChunkMock2);
            doReturn(scriptChunkList).when(scriptMock).chunks();
            doReturn(true).when(scriptChunkMock).equalsOpCode(0);
            scriptPattern.when(() -> ScriptPattern.isP2WH(scriptMock)).thenReturn(true);
            //Act Statement(s)
            boolean result = ScriptPattern.isP2WPKH(scriptMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            verify(scriptMock, atLeast(1)).chunks();
            verify(scriptChunkMock, atLeast(1)).equalsOpCode(0);
            scriptPattern.verify(() -> ScriptPattern.isP2WH(scriptMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${3e5c299b-99c4-374a-836b-f2e4803ee06e}
    @Test()
    public void isP2WPKHWhenChunk1dataLengthNotEqualsSegwitAddressWITNESS_PROGRAM_LENGTH_PKH() {
        /* Branches:
         * (!isP2WH(script)) : false
         * (!chunks.get(0).equalsOpCode(OP_0)) : false
         * (chunk1data != null) : true
         * (chunk1data.length == SegwitAddress.WITNESS_PROGRAM_LENGTH_PKH) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class, CALLS_REAL_METHODS)) {
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(scriptChunkMock);
            scriptChunkList.add(scriptChunkMock2);
            doReturn(scriptChunkList).when(scriptMock).chunks();
            doReturn(true).when(scriptChunkMock).equalsOpCode(0);
            scriptPattern.when(() -> ScriptPattern.isP2WH(scriptMock)).thenReturn(true);
            //Act Statement(s)
            boolean result = ScriptPattern.isP2WPKH(scriptMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(scriptMock, atLeast(1)).chunks();
            verify(scriptChunkMock, atLeast(1)).equalsOpCode(0);
            scriptPattern.verify(() -> ScriptPattern.isP2WH(scriptMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${deabcb36-a211-397d-95a0-9dc944747100}
    @Test()
    public void isP2WSHWhenIsP2WHNotScript() {
        /* Branches:
         * (!isP2WH(script)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class, CALLS_REAL_METHODS)) {
            scriptPattern.when(() -> ScriptPattern.isP2WH(scriptMock)).thenReturn(false);
            //Act Statement(s)
            boolean result = ScriptPattern.isP2WSH(scriptMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            scriptPattern.verify(() -> ScriptPattern.isP2WH(scriptMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${1eb206be-06a8-3fda-92e4-8af327d2cc3f}
    @Test()
    public void isP2WSHWhenChunksGet0NotEqualsOpCodeOP_0() {
        /* Branches:
         * (!isP2WH(script)) : false
         * (!chunks.get(0).equalsOpCode(OP_0)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class, CALLS_REAL_METHODS)) {
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(scriptChunkMock);
            doReturn(scriptChunkList).when(scriptMock).chunks();
            doReturn(false).when(scriptChunkMock).equalsOpCode(0);
            scriptPattern.when(() -> ScriptPattern.isP2WH(scriptMock)).thenReturn(true);
            //Act Statement(s)
            boolean result = ScriptPattern.isP2WSH(scriptMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(scriptMock, atLeast(1)).chunks();
            verify(scriptChunkMock, atLeast(1)).equalsOpCode(0);
            scriptPattern.verify(() -> ScriptPattern.isP2WH(scriptMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${f70e942b-c2ae-372f-8a39-f24c18216fff}
    @Ignore()
    @Test()
    public void isP2WSHWhenChunk1dataLengthEqualsSegwitAddressWITNESS_PROGRAM_LENGTH_SH() {
        /* Branches:
         * (!isP2WH(script)) : false
         * (!chunks.get(0).equalsOpCode(OP_0)) : false
         * (chunk1data != null) : true
         * (chunk1data.length == SegwitAddress.WITNESS_PROGRAM_LENGTH_SH) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class, CALLS_REAL_METHODS)) {
            scriptPattern.when(() -> ScriptPattern.isP2WH((Script) any())).thenReturn(true);
            List list = new ArrayList<>();
            Script script = Script.of(list);
            //Act Statement(s)
            boolean result = ScriptPattern.isP2WSH(script);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            scriptPattern.verify(() -> ScriptPattern.isP2WH((Script) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${32d23884-761a-34b6-895d-1176ff4d72b6}
    @Test()
    public void isP2WSHWhenChunk1dataLengthNotEqualsSegwitAddressWITNESS_PROGRAM_LENGTH_SH() {
        /* Branches:
         * (!isP2WH(script)) : false
         * (!chunks.get(0).equalsOpCode(OP_0)) : false
         * (chunk1data != null) : true
         * (chunk1data.length == SegwitAddress.WITNESS_PROGRAM_LENGTH_SH) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class, CALLS_REAL_METHODS)) {
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(scriptChunkMock);
            scriptChunkList.add(scriptChunkMock2);
            doReturn(scriptChunkList).when(scriptMock).chunks();
            doReturn(true).when(scriptChunkMock).equalsOpCode(0);
            scriptPattern.when(() -> ScriptPattern.isP2WH(scriptMock)).thenReturn(true);
            //Act Statement(s)
            boolean result = ScriptPattern.isP2WSH(scriptMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(scriptMock, atLeast(1)).chunks();
            verify(scriptChunkMock, atLeast(1)).equalsOpCode(0);
            scriptPattern.verify(() -> ScriptPattern.isP2WH(scriptMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${88fb9251-2f7e-3834-a9b7-bda2d77823da}
    @Ignore()
    @Test()
    public void extractHashFromP2WHTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        scriptChunkList.add(scriptChunkMock2);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        //Act Statement(s)
        byte[] result = ScriptPattern.extractHashFromP2WH(scriptMock);
        byte[] byteResultArray = new byte[]{};
        //Assert statement(s)
        assertThat(result, equalTo(byteResultArray));
        verify(scriptMock).chunks();
    }

    //Sapient generated method id: ${9854600d-612e-3f8d-8bb5-5963242fd5df}
    @Test()
    public void isP2TRWhenChunksSizeNotEquals2() {
        /* Branches:
         * (chunks.size() != 2) : true
         */
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        //Act Statement(s)
        boolean result = ScriptPattern.isP2TR(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(scriptMock).chunks();
    }

    //Sapient generated method id: ${04d0250f-1b0a-37cf-ba55-7d6801f5986b}
    @Test()
    public void isP2TRWhenChunksGet0NotEqualsOpCodeOP_1() {
        /* Branches:
         * (chunks.size() != 2) : false
         * (!chunks.get(0).equalsOpCode(OP_1)) : true
         */
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        scriptChunkList.add(scriptChunkMock2);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        doReturn(false).when(scriptChunkMock).equalsOpCode(81);
        //Act Statement(s)
        boolean result = ScriptPattern.isP2TR(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(scriptMock).chunks();
        verify(scriptChunkMock).equalsOpCode(81);
    }

    //Sapient generated method id: ${8f9bff50-b751-3985-9294-1ca76d759154}
    @Test()
    public void isP2TRWhenChunk1dataIsNull() {
        /* Branches:
         * (chunks.size() != 2) : false
         * (!chunks.get(0).equalsOpCode(OP_1)) : false
         * (chunk1data == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        scriptChunkList.add(scriptChunkMock2);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        doReturn(true).when(scriptChunkMock).equalsOpCode(81);
        //Act Statement(s)
        boolean result = ScriptPattern.isP2TR(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(scriptMock).chunks();
        verify(scriptChunkMock).equalsOpCode(81);
    }

    //Sapient generated method id: ${708d8eaf-5422-3603-87fc-910f79ca39a7}
    @Ignore()
    @Test()
    public void isP2TRWhenChunk1dataLengthEqualsSegwitAddressWITNESS_PROGRAM_LENGTH_TR() {
        /* Branches:
         * (chunks.size() != 2) : false
         * (!chunks.get(0).equalsOpCode(OP_1)) : false
         * (chunk1data == null) : false
         * (chunk1data.length != SegwitAddress.WITNESS_PROGRAM_LENGTH_TR) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        scriptChunkList.add(scriptChunkMock2);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        doReturn(true).when(scriptChunkMock).equalsOpCode(81);
        //Act Statement(s)
        boolean result = ScriptPattern.isP2TR(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(scriptMock).chunks();
        verify(scriptChunkMock).equalsOpCode(81);
    }

    //Sapient generated method id: ${53a057bc-99d0-3e74-ba07-1e1843efbe34}
    @Ignore()
    @Test()
    public void extractOutputKeyFromP2TRTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        scriptChunkList.add(scriptChunkMock2);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        //Act Statement(s)
        byte[] result = ScriptPattern.extractOutputKeyFromP2TR(scriptMock);
        byte[] byteResultArray = new byte[]{};
        //Assert statement(s)
        assertThat(result, equalTo(byteResultArray));
        verify(scriptMock).chunks();
    }

    //Sapient generated method id: ${d79f7b50-def1-3073-a1dd-a065c6b57396}
    @Test()
    public void isSentToMultisigWhenChunksSizeLessThan4() {
        /* Branches:
         * (chunks.size() < 4) : true
         */
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        //Act Statement(s)
        boolean result = ScriptPattern.isSentToMultisig(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(scriptMock).chunks();
    }

    //Sapient generated method id: ${a01af115-9b8d-3dc9-ad72-fd674258386a}
    @Test()
    public void isSentToMultisigWhenChunkNotEqualsOpCodeOP_CHECKMULTISIG() {
        /* Branches:
         * (chunks.size() < 4) : false
         * (!(chunk.equalsOpCode(OP_CHECKMULTISIG) || chunk.equalsOpCode(OP_CHECKMULTISIGVERIFY))) : true
         * (chunk.equalsOpCode(OP_CHECKMULTISIG)) : false
         */
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        scriptChunkList.add(scriptChunkMock2);
        scriptChunkList.add(scriptChunkMock3);
        scriptChunkList.add(scriptChunkMock4);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        doReturn(false).when(scriptChunkMock4).equalsOpCode(174);
        doReturn(false).when(scriptChunkMock4).equalsOpCode(175);
        //Act Statement(s)
        boolean result = ScriptPattern.isSentToMultisig(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(scriptMock).chunks();
        verify(scriptChunkMock4).equalsOpCode(174);
        verify(scriptChunkMock4).equalsOpCode(175);
    }

    //Sapient generated method id: ${1dc2c56d-e914-3a29-934e-75061964eb5f}
    @Test()
    public void isSentToMultisigWhenChunkEqualsOpCodeOP_CHECKMULTISIGAndNOpCodeLessThanOP_1() {
        /* Branches:
         * (chunks.size() < 4) : false
         * (!(chunk.equalsOpCode(OP_CHECKMULTISIG) || chunk.equalsOpCode(OP_CHECKMULTISIGVERIFY))) : true
         * (chunk.equalsOpCode(OP_CHECKMULTISIG)) : true
         * (nOpCode < OP_1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List list = new ArrayList<>();
        Script script = Script.of(list);
        //Act Statement(s)
        boolean result = ScriptPattern.isSentToMultisig(script);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${0770acba-40dc-3ff0-8ae2-67ff3dcfb354}
    @Test()
    public void isOpReturnWhenChunksGet0EqualsOpCodeScriptOpCodesOP_RETURN() {
        /* Branches:
         * (chunks.size() > 0) : true
         * (chunks.get(0).equalsOpCode(ScriptOpCodes.OP_RETURN)) : true
         */
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        doReturn(true).when(scriptChunkMock).equalsOpCode(106);
        //Act Statement(s)
        boolean result = ScriptPattern.isOpReturn(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(scriptMock).chunks();
        verify(scriptChunkMock).equalsOpCode(106);
    }

    //Sapient generated method id: ${bdf0912d-cf75-34be-97a9-a0b1444cba71}
    @Test()
    public void isOpReturnWhenChunksGet0NotEqualsOpCodeScriptOpCodesOP_RETURN() {
        /* Branches:
         * (chunks.size() > 0) : true
         * (chunks.get(0).equalsOpCode(ScriptOpCodes.OP_RETURN)) : false
         */
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        doReturn(false).when(scriptChunkMock).equalsOpCode(106);
        //Act Statement(s)
        boolean result = ScriptPattern.isOpReturn(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(scriptMock).chunks();
        verify(scriptChunkMock).equalsOpCode(106);
    }

    //Sapient generated method id: ${65b7b213-2829-37c2-86a7-f470c15d0466}
    @Test()
    public void isWitnessCommitmentWhenChunksSizeLessThan2() {
        /* Branches:
         * (chunks.size() < 2) : true
         */
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        //Act Statement(s)
        boolean result = ScriptPattern.isWitnessCommitment(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(scriptMock).chunks();
    }

    //Sapient generated method id: ${cac7d3ee-8f05-37a5-8fe2-5fc72450da0a}
    @Test()
    public void isWitnessCommitmentWhenChunksGet0NotEqualsOpCodeScriptOpCodesOP_RETURN() {
        /* Branches:
         * (chunks.size() < 2) : false
         * (!chunks.get(0).equalsOpCode(ScriptOpCodes.OP_RETURN)) : true
         */
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        scriptChunkList.add(scriptChunkMock2);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        doReturn(false).when(scriptChunkMock).equalsOpCode(106);
        //Act Statement(s)
        boolean result = ScriptPattern.isWitnessCommitment(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(scriptMock).chunks();
        verify(scriptChunkMock).equalsOpCode(106);
    }

    //Sapient generated method id: ${c2d35954-33be-3d37-9195-2a8ac0892310}
    @Test()
    public void isWitnessCommitmentWhenChunkDataLengthNotEquals36() {
        /* Branches:
         * (chunks.size() < 2) : false
         * (!chunks.get(0).equalsOpCode(ScriptOpCodes.OP_RETURN)) : false
         * (chunkData == null) : false
         * (chunkData.length != 36) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        scriptChunkList.add(scriptChunkMock2);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        doReturn(true).when(scriptChunkMock).equalsOpCode(106);
        //Act Statement(s)
        boolean result = ScriptPattern.isWitnessCommitment(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(scriptMock).chunks();
        verify(scriptChunkMock).equalsOpCode(106);
    }

    //Sapient generated method id: ${a225fd2d-d579-3a60-bf1d-8afabf7efda1}
    @Ignore()
    @Test()
    public void isWitnessCommitmentWhenArraysEqualsArraysCopyOfRangeChunkData04SEGWIT_COMMITMENT_HEADER() {
        /* Branches:
         * (chunks.size() < 2) : false
         * (!chunks.get(0).equalsOpCode(ScriptOpCodes.OP_RETURN)) : false
         * (chunkData == null) : false
         * (chunkData.length != 36) : false
         * (!Arrays.equals(Arrays.copyOfRange(chunkData, 0, 4), SEGWIT_COMMITMENT_HEADER)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List list = new ArrayList<>();
        Script script = Script.of(list);
        //Act Statement(s)
        boolean result = ScriptPattern.isWitnessCommitment(script);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${ce8c0d92-3e29-3ded-a756-fd8b19cfbe8a}
    @Ignore()
    @Test()
    public void extractWitnessCommitmentHashTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class)) {
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(scriptChunkMock);
            scriptChunkList.add(scriptChunkMock2);
            doReturn(scriptChunkList).when(scriptMock).chunks();
            byte[] byteArray = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.wrap(byteArray)).thenReturn(sha256HashMock);
            //Act Statement(s)
            Sha256Hash result = ScriptPattern.extractWitnessCommitmentHash(scriptMock);
            //Assert statement(s)
            assertThat(result, equalTo(sha256HashMock));
            verify(scriptMock).chunks();
            sha256Hash.verify(() -> Sha256Hash.wrap(byteArray), atLeast(1));
        }
    }
}
