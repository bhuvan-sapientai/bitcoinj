package org.bitcoinj.script;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;

import org.mockito.MockedStatic;

import java.util.ArrayList;

import org.bitcoinj.base.Sha256Hash;

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

    private final ScriptChunk scriptChunk2Mock = mock(ScriptChunk.class);

    private final ScriptChunk scriptChunk2Mock2 = mock(ScriptChunk.class);

    private final ScriptChunk scriptChunk3Mock = mock(ScriptChunk.class);

    private final ScriptChunk scriptChunkMock = mock(ScriptChunk.class);

    private final ScriptChunk scriptChunkMock2 = mock(ScriptChunk.class);

    private final ScriptChunk scriptChunkMock3 = mock(ScriptChunk.class);

    private final ScriptChunk scriptChunkMock4 = mock(ScriptChunk.class);

    private final ScriptChunk scriptChunkMock5 = mock(ScriptChunk.class);

    private final Script scriptMock = mock(Script.class);

    //Sapient generated method id: ${483768e9-c908-3eb2-a4e0-d8dc11af49b2}, hash: F424E9FB16903F199A0483F5BDF46251
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

    //Sapient generated method id: ${82b777a6-acb6-30c0-afda-c64ee6c11643}, hash: EB2550B68B13B54A733CAB0BDFA45BCA
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

    //Sapient generated method id: ${2250ebfc-8893-3a6b-8070-fd4e128db93a}, hash: F58ABCB862224A199823F722AF020801
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

    //Sapient generated method id: ${ec0ac5a2-a731-3e8a-ade3-8b6bb6ad0db8}, hash: B668105BB050557D2EAAEB6EFA9C641A
    @Test()
    public void isP2PKHWhenChunk2dataIsNull() {
        /* Branches:
         * (chunks.size() != 5) : false
         * (!chunks.get(0).equalsOpCode(OP_DUP)) : false
         * (!chunks.get(1).equalsOpCode(OP_HASH160)) : false
         * (chunk2data == null) : true
         */
        //Arrange Statement(s)
        ScriptChunk scriptChunk = new ScriptChunk(0, (byte[]) null);
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        scriptChunkList.add(scriptChunkMock2);
        scriptChunkList.add(scriptChunk);
        scriptChunkList.add(scriptChunk2Mock);
        scriptChunkList.add(scriptChunk2Mock2);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        doReturn(true).when(scriptChunkMock).equalsOpCode(118);
        doReturn(true).when(scriptChunkMock2).equalsOpCode(169);
        //Act Statement(s)
        boolean result = ScriptPattern.isP2PKH(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(scriptMock).chunks();
        verify(scriptChunkMock).equalsOpCode(118);
        verify(scriptChunkMock2).equalsOpCode(169);
    }

    //Sapient generated method id: ${a6b676fc-517c-33b9-a3a8-040bd8dd57e7}, hash: BA0D2B158A0D350B5D176BD8DAC45C38
    @Test()
    public void isP2PKHWhenChunk2dataLengthNotEqualsLegacyAddressLENGTH() {
        /* Branches:
         * (chunks.size() != 5) : false
         * (!chunks.get(0).equalsOpCode(OP_DUP)) : false
         * (!chunks.get(1).equalsOpCode(OP_HASH160)) : false
         * (chunk2data == null) : false
         * (chunk2data.length != LegacyAddress.LENGTH) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0};
        ScriptChunk scriptChunk = new ScriptChunk(0, byteArray);
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        scriptChunkList.add(scriptChunkMock2);
        scriptChunkList.add(scriptChunk);
        scriptChunkList.add(scriptChunk2Mock);
        scriptChunkList.add(scriptChunk2Mock2);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        doReturn(true).when(scriptChunkMock).equalsOpCode(118);
        doReturn(true).when(scriptChunkMock2).equalsOpCode(169);
        //Act Statement(s)
        boolean result = ScriptPattern.isP2PKH(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(scriptMock).chunks();
        verify(scriptChunkMock).equalsOpCode(118);
        verify(scriptChunkMock2).equalsOpCode(169);
    }

    //Sapient generated method id: ${1df6780c-a963-3a9f-97b7-4d04bde0cfc8}, hash: 5A65F72DC34F960F39CE141A8BEA47B4
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
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19};
        ScriptChunk scriptChunk = new ScriptChunk(0, byteArray);
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        scriptChunkList.add(scriptChunkMock2);
        scriptChunkList.add(scriptChunk);
        scriptChunkList.add(scriptChunk2Mock);
        scriptChunkList.add(scriptChunk2Mock2);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        doReturn(true).when(scriptChunkMock).equalsOpCode(118);
        doReturn(true).when(scriptChunkMock2).equalsOpCode(169);
        doReturn(false).when(scriptChunk2Mock).equalsOpCode(136);
        //Act Statement(s)
        boolean result = ScriptPattern.isP2PKH(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(scriptMock).chunks();
        verify(scriptChunkMock).equalsOpCode(118);
        verify(scriptChunkMock2).equalsOpCode(169);
        verify(scriptChunk2Mock).equalsOpCode(136);
    }

    //Sapient generated method id: ${b5a06c68-ce89-3071-9e1a-be38f14a5b6e}, hash: C97BE774DE981D2709AE931729F05A32
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
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19};
        ScriptChunk scriptChunk = new ScriptChunk(0, byteArray);
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        scriptChunkList.add(scriptChunkMock2);
        scriptChunkList.add(scriptChunk);
        scriptChunkList.add(scriptChunk2Mock);
        scriptChunkList.add(scriptChunk2Mock2);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        doReturn(true).when(scriptChunkMock).equalsOpCode(118);
        doReturn(true).when(scriptChunkMock2).equalsOpCode(169);
        doReturn(true).when(scriptChunk2Mock).equalsOpCode(136);
        doReturn(false).when(scriptChunk2Mock2).equalsOpCode(172);
        //Act Statement(s)
        boolean result = ScriptPattern.isP2PKH(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(scriptMock).chunks();
        verify(scriptChunkMock).equalsOpCode(118);
        verify(scriptChunkMock2).equalsOpCode(169);
        verify(scriptChunk2Mock).equalsOpCode(136);
        verify(scriptChunk2Mock2).equalsOpCode(172);
    }

    //Sapient generated method id: ${0ab04191-aa62-3066-911a-9b020821212e}, hash: C2DDD23CD921839430B4DB4E72A8496A
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
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19};
        ScriptChunk scriptChunk = new ScriptChunk(0, byteArray);
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        scriptChunkList.add(scriptChunkMock2);
        scriptChunkList.add(scriptChunk);
        scriptChunkList.add(scriptChunk2Mock);
        scriptChunkList.add(scriptChunk2Mock2);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        doReturn(true).when(scriptChunkMock).equalsOpCode(118);
        doReturn(true).when(scriptChunkMock2).equalsOpCode(169);
        doReturn(true).when(scriptChunk2Mock).equalsOpCode(136);
        doReturn(true).when(scriptChunk2Mock2).equalsOpCode(172);
        //Act Statement(s)
        boolean result = ScriptPattern.isP2PKH(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(scriptMock).chunks();
        verify(scriptChunkMock).equalsOpCode(118);
        verify(scriptChunkMock2).equalsOpCode(169);
        verify(scriptChunk2Mock).equalsOpCode(136);
        verify(scriptChunk2Mock2).equalsOpCode(172);
    }

    //Sapient generated method id: ${d020ff75-b388-3ea7-b20c-f542f3569867}, hash: 050C885BC9871667D13B7DBF15725A7F
    @Test()
    public void extractHashFromP2PKHTest() {
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        ScriptChunk scriptChunk = new ScriptChunk(0, byteArray);
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        scriptChunkList.add(scriptChunkMock2);
        scriptChunkList.add(scriptChunk);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        //Act Statement(s)
        byte[] result = ScriptPattern.extractHashFromP2PKH(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(byteArray));
        verify(scriptMock).chunks();
    }

    //Sapient generated method id: ${18d102ed-5f62-3b80-bdec-34b15be95004}, hash: 7E68C8AEB099EC9D702B57CFBE7816CF
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

    //Sapient generated method id: ${643388ec-a4c9-30ad-846f-704fddee40b6}, hash: 3284E544556067D5285A37BC5EB4E6B2
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

    //Sapient generated method id: ${47140975-f74b-3228-911f-276c08ca6046}, hash: 890D9C3EA19690E130D00C1C6C9AA2C0
    @Test()
    public void isP2SHWhenChunk1OpcodeNotEquals20() {
        /* Branches:
         * (chunks.size() != 3) : false
         * (!chunks.get(0).equalsOpCode(OP_HASH160)) : false
         * (chunk1.opcode != 0x14) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        ScriptChunk scriptChunk = new ScriptChunk(0, byteArray);
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        scriptChunkList.add(scriptChunk);
        scriptChunkList.add(scriptChunk2Mock);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        doReturn(true).when(scriptChunkMock).equalsOpCode(169);
        //Act Statement(s)
        boolean result = ScriptPattern.isP2SH(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(scriptMock).chunks();
        verify(scriptChunkMock).equalsOpCode(169);
    }

    //Sapient generated method id: ${e1f3e9cd-370c-3de7-9fd3-6169fc564268}, hash: E1699AA78DCC486A2A9ECFF92E19CCCA
    @Test()
    public void isP2SHWhenChunk1dataIsNull() {
        /* Branches:
         * (chunks.size() != 3) : false
         * (!chunks.get(0).equalsOpCode(OP_HASH160)) : false
         * (chunk1.opcode != 0x14) : false
         * (chunk1data == null) : true
         */
        //Arrange Statement(s)
        ScriptChunk scriptChunk = new ScriptChunk(20, (byte[]) null);
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        scriptChunkList.add(scriptChunk);
        scriptChunkList.add(scriptChunk2Mock);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        doReturn(true).when(scriptChunkMock).equalsOpCode(169);
        //Act Statement(s)
        boolean result = ScriptPattern.isP2SH(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(scriptMock).chunks();
        verify(scriptChunkMock).equalsOpCode(169);
    }

    //Sapient generated method id: ${150945bd-c7f6-3f2e-a8ce-a5685f6dd181}, hash: CC2F8CF290E2F3A160A244493FF25C43
    @Test()
    public void isP2SHWhenChunk1dataLengthNotEqualsLegacyAddressLENGTH() {
        /* Branches:
         * (chunks.size() != 3) : false
         * (!chunks.get(0).equalsOpCode(OP_HASH160)) : false
         * (chunk1.opcode != 0x14) : false
         * (chunk1data == null) : false
         * (chunk1data.length != LegacyAddress.LENGTH) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0};
        ScriptChunk scriptChunk = new ScriptChunk(20, byteArray);
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        scriptChunkList.add(scriptChunk);
        scriptChunkList.add(scriptChunk2Mock);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        doReturn(true).when(scriptChunkMock).equalsOpCode(169);
        //Act Statement(s)
        boolean result = ScriptPattern.isP2SH(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(scriptMock).chunks();
        verify(scriptChunkMock).equalsOpCode(169);
    }

    //Sapient generated method id: ${2a4f15f3-9ae7-3c2d-83d7-40c8624ef8f2}, hash: 2D6EA9658D8576B371AF9A3F41931049
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
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19};
        ScriptChunk scriptChunk = new ScriptChunk(20, byteArray);
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        scriptChunkList.add(scriptChunk);
        scriptChunkList.add(scriptChunk2Mock);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        doReturn(true).when(scriptChunkMock).equalsOpCode(169);
        doReturn(false).when(scriptChunk2Mock).equalsOpCode(135);
        //Act Statement(s)
        boolean result = ScriptPattern.isP2SH(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(scriptMock).chunks();
        verify(scriptChunkMock).equalsOpCode(169);
        verify(scriptChunk2Mock).equalsOpCode(135);
    }

    //Sapient generated method id: ${3188903f-a86a-398c-b505-170ab8001405}, hash: 3305C64BCE1FEA7270C3D22805AD3504
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
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19};
        ScriptChunk scriptChunk = new ScriptChunk(20, byteArray);
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        scriptChunkList.add(scriptChunk);
        scriptChunkList.add(scriptChunk2Mock);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        doReturn(true).when(scriptChunkMock).equalsOpCode(169);
        doReturn(true).when(scriptChunk2Mock).equalsOpCode(135);
        //Act Statement(s)
        boolean result = ScriptPattern.isP2SH(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(scriptMock).chunks();
        verify(scriptChunkMock).equalsOpCode(169);
        verify(scriptChunk2Mock).equalsOpCode(135);
    }

    //Sapient generated method id: ${0caf4832-7d94-373a-b25d-c2d0ea2eb224}, hash: A39C7BB1703BB5E51FB6E2B673E4545E
    @Test()
    public void extractHashFromP2SHTest() {
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        ScriptChunk scriptChunk = new ScriptChunk(0, byteArray);
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        scriptChunkList.add(scriptChunk);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        //Act Statement(s)
        byte[] result = ScriptPattern.extractHashFromP2SH(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(byteArray));
        verify(scriptMock).chunks();
    }

    //Sapient generated method id: ${0c20955b-87ae-3adf-b232-fcf9ad518028}, hash: 84ABB215D5D2346AB290C06AB2FB63C7
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

    //Sapient generated method id: ${a0ada994-cc91-3bb5-b94d-6faf3a223628}, hash: 85A93BA65303372CB1B21E9CDF1F6AA4
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

    //Sapient generated method id: ${bf5ee95d-7a2d-3931-b67c-a1c336741d0f}, hash: 90B1A5CBC2E818B308A6BB55A3BE4FC8
    @Test()
    public void isP2PKWhenChunk0dataIsNull() {
        /* Branches:
         * (chunks.size() != 2) : false
         * (chunk0.isOpCode()) : false
         * (chunk0data == null) : true
         */
        //Arrange Statement(s)
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        scriptChunkList.add(scriptChunkMock2);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        doReturn(false).when(scriptChunkMock).isOpCode();
        //Act Statement(s)
        boolean result = ScriptPattern.isP2PK(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(scriptMock).chunks();
        verify(scriptChunkMock).isOpCode();
    }

    //Sapient generated method id: ${f6b02a19-efbd-32ad-a73a-58fcb08220be}, hash: A6828BDB0F7FF56A4F893819D9FDB05B
    @Test()
    public void extractKeyFromP2PKTest() {
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        ScriptChunk scriptChunk = new ScriptChunk(0, byteArray);
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunk);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        //Act Statement(s)
        byte[] result = ScriptPattern.extractKeyFromP2PK(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(byteArray));
        verify(scriptMock).chunks();
    }

    //Sapient generated method id: ${9d03f8bd-695f-3d1f-b738-fdd3bbb16bbf}, hash: 6EFD6A57B2413CC8176AADEA42409138
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

    //Sapient generated method id: ${a9679c85-8def-35a4-b7d2-70c60b223d0c}, hash: E3ABF17F677C5D0945E7FC1F88966F34
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

    //Sapient generated method id: ${36e5e0f8-4f75-3a0d-9751-7fc91ac3dd19}, hash: 63C6D26E75B4B2745DEF2AFA2E01520E
    @Test()
    public void isP2WHWhenChunk1dataIsNull() {
        /* Branches:
         * (chunks.size() != 2) : false
         * (!chunks.get(0).equalsOpCode(OP_0)) : false
         * (chunk1data == null) : true
         */
        //Arrange Statement(s)
        ScriptChunk scriptChunk = new ScriptChunk(0, (byte[]) null);
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        scriptChunkList.add(scriptChunk);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        doReturn(true).when(scriptChunkMock).equalsOpCode(0);
        //Act Statement(s)
        boolean result = ScriptPattern.isP2WH(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(scriptMock).chunks();
        verify(scriptChunkMock).equalsOpCode(0);
    }

    //Sapient generated method id: ${67ee3ba9-4c54-3be0-a899-354ace0c090a}, hash: CA62BD2402A79EDAC090B1A1A2CD92CC
    @Test()
    public void isP2WHWhenChunk1dataLengthNotEqualsSegwitAddressWITNESS_PROGRAM_LENGTH_SH() {
        /* Branches:
         * (chunks.size() != 2) : false
         * (!chunks.get(0).equalsOpCode(OP_0)) : false
         * (chunk1data == null) : false
         * (chunk1data.length != SegwitAddress.WITNESS_PROGRAM_LENGTH_PKH) : true
         * (chunk1data.length != SegwitAddress.WITNESS_PROGRAM_LENGTH_SH) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0};
        ScriptChunk scriptChunk = new ScriptChunk(0, byteArray);
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        scriptChunkList.add(scriptChunk);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        doReturn(true).when(scriptChunkMock).equalsOpCode(0);
        //Act Statement(s)
        boolean result = ScriptPattern.isP2WH(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(scriptMock).chunks();
        verify(scriptChunkMock).equalsOpCode(0);
    }

    //Sapient generated method id: ${b9cec8df-01db-33f7-bdf0-30cb1b64022d}, hash: E7C88DF47FF38000469A3185B4EA2579
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
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
        ScriptChunk scriptChunk = new ScriptChunk(0, byteArray);
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        scriptChunkList.add(scriptChunk);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        doReturn(true).when(scriptChunkMock).equalsOpCode(0);
        //Act Statement(s)
        boolean result = ScriptPattern.isP2WH(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(scriptMock).chunks();
        verify(scriptChunkMock).equalsOpCode(0);
    }

    //Sapient generated method id: ${fd4a5876-b937-30f1-a087-ce2e75c16635}, hash: 3CC3607740E69A8652E4C9B8BC8557F3
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

    //Sapient generated method id: ${30dafa8d-575e-3418-8c92-3cfa4ebe5d49}, hash: DFAF898AE9A68DEE2C06B8776EE40912
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

    //Sapient generated method id: ${1e02a67a-0b17-34e8-b2db-f718cd6e71ac}, hash: 7EF5D7D70CE1C66C0C895F83D00C55C5
    @Test()
    public void isP2WPKHWhenChunk1dataLengthEqualsSegwitAddressWITNESS_PROGRAM_LENGTH_PKH() {
        /* Branches:
         * (!isP2WH(script)) : false
         * (!chunks.get(0).equalsOpCode(OP_0)) : false
         * (chunk1data != null) : true
         * (chunk1data.length == SegwitAddress.WITNESS_PROGRAM_LENGTH_PKH) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19};
            ScriptChunk scriptChunk = new ScriptChunk(0, byteArray);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(scriptChunkMock);
            scriptChunkList.add(scriptChunk);
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

    //Sapient generated method id: ${3e5c299b-99c4-374a-836b-f2e4803ee06e}, hash: 1D62EC360A3E96858B37196FAF3813C1
    @Test()
    public void isP2WPKHWhenChunk1dataLengthNotEqualsSegwitAddressWITNESS_PROGRAM_LENGTH_PKH() {
        /* Branches:
         * (!isP2WH(script)) : false
         * (!chunks.get(0).equalsOpCode(OP_0)) : false
         * (chunk1data != null) : true
         * (chunk1data.length == SegwitAddress.WITNESS_PROGRAM_LENGTH_PKH) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{(byte) 0};
            ScriptChunk scriptChunk = new ScriptChunk(0, byteArray);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(scriptChunkMock);
            scriptChunkList.add(scriptChunk);
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

    //Sapient generated method id: ${deabcb36-a211-397d-95a0-9dc944747100}, hash: D91FFF0F8A2C5A2254F692D280D97C25
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

    //Sapient generated method id: ${1eb206be-06a8-3fda-92e4-8af327d2cc3f}, hash: 9670BF6E0DE19FF14312BF643A55C5B8
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

    //Sapient generated method id: ${f70e942b-c2ae-372f-8a39-f24c18216fff}, hash: 3962459231B860B0EEAD887E900FD1BD
    @Test()
    public void isP2WSHWhenChunk1dataLengthEqualsSegwitAddressWITNESS_PROGRAM_LENGTH_SH() {
        /* Branches:
         * (!isP2WH(script)) : false
         * (!chunks.get(0).equalsOpCode(OP_0)) : false
         * (chunk1data != null) : true
         * (chunk1data.length == SegwitAddress.WITNESS_PROGRAM_LENGTH_SH) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
            ScriptChunk scriptChunk = new ScriptChunk(0, byteArray);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(scriptChunkMock);
            scriptChunkList.add(scriptChunk);
            doReturn(scriptChunkList).when(scriptMock).chunks();
            doReturn(true).when(scriptChunkMock).equalsOpCode(0);
            scriptPattern.when(() -> ScriptPattern.isP2WH(scriptMock)).thenReturn(true);
            //Act Statement(s)
            boolean result = ScriptPattern.isP2WSH(scriptMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            verify(scriptMock, atLeast(1)).chunks();
            verify(scriptChunkMock, atLeast(1)).equalsOpCode(0);
            scriptPattern.verify(() -> ScriptPattern.isP2WH(scriptMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${32d23884-761a-34b6-895d-1176ff4d72b6}, hash: F86A547EB883EBB3A17F0562E6B30D9E
    @Test()
    public void isP2WSHWhenChunk1dataLengthNotEqualsSegwitAddressWITNESS_PROGRAM_LENGTH_SH() {
        /* Branches:
         * (!isP2WH(script)) : false
         * (!chunks.get(0).equalsOpCode(OP_0)) : false
         * (chunk1data != null) : true
         * (chunk1data.length == SegwitAddress.WITNESS_PROGRAM_LENGTH_SH) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{(byte) 0};
            ScriptChunk scriptChunk = new ScriptChunk(0, byteArray);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(scriptChunkMock);
            scriptChunkList.add(scriptChunk);
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

    //Sapient generated method id: ${88fb9251-2f7e-3834-a9b7-bda2d77823da}, hash: 8311B4FCF8F93F776EC5F807C19A25C2
    @Test()
    public void extractHashFromP2WHTest() {
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        ScriptChunk scriptChunk = new ScriptChunk(0, byteArray);
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        scriptChunkList.add(scriptChunk);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        //Act Statement(s)
        byte[] result = ScriptPattern.extractHashFromP2WH(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(byteArray));
        verify(scriptMock).chunks();
    }

    //Sapient generated method id: ${9854600d-612e-3f8d-8bb5-5963242fd5df}, hash: E417BD0CE5CA9E96102D09982794340C
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

    //Sapient generated method id: ${04d0250f-1b0a-37cf-ba55-7d6801f5986b}, hash: 159CE4001CC7F253344F7FD32CF66451
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

    //Sapient generated method id: ${8f9bff50-b751-3985-9294-1ca76d759154}, hash: 01B86A47F93E3A8D456AEC2BBE3FABBC
    @Test()
    public void isP2TRWhenChunk1dataIsNull() {
        /* Branches:
         * (chunks.size() != 2) : false
         * (!chunks.get(0).equalsOpCode(OP_1)) : false
         * (chunk1data == null) : true
         */
        //Arrange Statement(s)
        ScriptChunk scriptChunk = new ScriptChunk(0, (byte[]) null);
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        scriptChunkList.add(scriptChunk);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        doReturn(true).when(scriptChunkMock).equalsOpCode(81);
        //Act Statement(s)
        boolean result = ScriptPattern.isP2TR(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(scriptMock).chunks();
        verify(scriptChunkMock).equalsOpCode(81);
    }

    //Sapient generated method id: ${dfb47e7d-f7e4-3d78-b352-298717ee0dda}, hash: 641FC3D4E8CB9BF25635DC3DD7D49346
    @Test()
    public void isP2TRWhenChunk1dataLengthNotEqualsSegwitAddressWITNESS_PROGRAM_LENGTH_TR() {
        /* Branches:
         * (chunks.size() != 2) : false
         * (!chunks.get(0).equalsOpCode(OP_1)) : false
         * (chunk1data == null) : false
         * (chunk1data.length != SegwitAddress.WITNESS_PROGRAM_LENGTH_TR) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0};
        ScriptChunk scriptChunk = new ScriptChunk(0, byteArray);
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        scriptChunkList.add(scriptChunk);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        doReturn(true).when(scriptChunkMock).equalsOpCode(81);
        //Act Statement(s)
        boolean result = ScriptPattern.isP2TR(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(scriptMock).chunks();
        verify(scriptChunkMock).equalsOpCode(81);
    }

    //Sapient generated method id: ${708d8eaf-5422-3603-87fc-910f79ca39a7}, hash: E67B4F3315AFD0E967E51C56B44833A1
    @Test()
    public void isP2TRWhenChunk1dataLengthEqualsSegwitAddressWITNESS_PROGRAM_LENGTH_TR() {
        /* Branches:
         * (chunks.size() != 2) : false
         * (!chunks.get(0).equalsOpCode(OP_1)) : false
         * (chunk1data == null) : false
         * (chunk1data.length != SegwitAddress.WITNESS_PROGRAM_LENGTH_TR) : false
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31};
        ScriptChunk scriptChunk = new ScriptChunk(0, byteArray);
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        scriptChunkList.add(scriptChunk);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        doReturn(true).when(scriptChunkMock).equalsOpCode(81);
        //Act Statement(s)
        boolean result = ScriptPattern.isP2TR(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(scriptMock).chunks();
        verify(scriptChunkMock).equalsOpCode(81);
    }

    //Sapient generated method id: ${53a057bc-99d0-3e74-ba07-1e1843efbe34}, hash: 76CFCBAE280D9BBA4DA8199E0FCDD785
    @Test()
    public void extractOutputKeyFromP2TRTest() {
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        ScriptChunk scriptChunk = new ScriptChunk(0, byteArray);
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        scriptChunkList.add(scriptChunk);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        //Act Statement(s)
        byte[] result = ScriptPattern.extractOutputKeyFromP2TR(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(byteArray));
        verify(scriptMock).chunks();
    }

    //Sapient generated method id: ${d79f7b50-def1-3073-a1dd-a065c6b57396}, hash: F83B49E6E580CFECCB149F2C4A1D858F
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

    //Sapient generated method id: ${a01af115-9b8d-3dc9-ad72-fd674258386a}, hash: 96130D2C206322DADE750C2EDAF3F025
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

    //Sapient generated method id: ${ae40914e-8760-3f13-9274-9c4cef47ff8a}, hash: E6D05B7DF1681FB939F09007491BFA73
    @Test()
    public void isSentToMultisigWhenNOpCodeNotLessThanOP_1AndNOpCodeGreaterThanOP_16() {
        /* Branches:
         * (chunks.size() < 4) : false
         * (!(chunk.equalsOpCode(OP_CHECKMULTISIG) || chunk.equalsOpCode(OP_CHECKMULTISIGVERIFY))) : true
         * (chunk.equalsOpCode(OP_CHECKMULTISIG)) : true
         * (nOpCode < OP_1) : false
         * (nOpCode > OP_16) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        ScriptChunk scriptChunk = new ScriptChunk(97, byteArray);
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        scriptChunkList.add(scriptChunkMock2);
        scriptChunkList.add(scriptChunk);
        scriptChunkList.add(scriptChunk2Mock);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        doReturn(false).when(scriptChunk2Mock).equalsOpCode(174);
        doReturn(true).when(scriptChunk2Mock).equalsOpCode(175);
        //Act Statement(s)
        boolean result = ScriptPattern.isSentToMultisig(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(scriptMock).chunks();
        verify(scriptChunk2Mock).equalsOpCode(174);
        verify(scriptChunk2Mock).equalsOpCode(175);
    }

    //Sapient generated method id: ${28559f27-f82b-3539-af84-89fefb1596bf}, hash: 916C354B4AA9A19E9F3FB267038A3C15
    @Test()
    public void isSentToMultisigWhenNumKeysNotLessThan1AndChunksSizeNotEquals3PlusNumKeys() {
        /* Branches:
         * (chunks.size() < 4) : false
         * (!(chunk.equalsOpCode(OP_CHECKMULTISIG) || chunk.equalsOpCode(OP_CHECKMULTISIGVERIFY))) : true
         * (chunk.equalsOpCode(OP_CHECKMULTISIG)) : true
         * (nOpCode < OP_1) : false
         * (nOpCode > OP_16) : false
         * (numKeys < 1) : false
         * (chunks.size() != 3 + numKeys) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        ScriptChunk scriptChunk = new ScriptChunk(81, byteArray);
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        scriptChunkList.add(scriptChunkMock2);
        scriptChunkList.add(scriptChunkMock3);
        scriptChunkList.add(scriptChunkMock4);
        scriptChunkList.add(scriptChunk);
        scriptChunkList.add(scriptChunk2Mock);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        doReturn(false).when(scriptChunk2Mock).equalsOpCode(174);
        doReturn(true).when(scriptChunk2Mock).equalsOpCode(175);
        //Act Statement(s)
        boolean result = ScriptPattern.isSentToMultisig(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(scriptMock).chunks();
        verify(scriptChunk2Mock).equalsOpCode(174);
        verify(scriptChunk2Mock).equalsOpCode(175);
    }

    //Sapient generated method id: ${61d8789d-c034-3a26-82c8-6fb1cffa3630}, hash: 48540C1D56A56B243B574B99D90F993D
    @Test()
    public void isSentToMultisigWhenILessThanChunksSizeMinus2AndChunksGetIIsOpCode() {
        /* Branches:
         * (chunks.size() < 4) : false
         * (!(chunk.equalsOpCode(OP_CHECKMULTISIG) || chunk.equalsOpCode(OP_CHECKMULTISIGVERIFY))) : true
         * (chunk.equalsOpCode(OP_CHECKMULTISIG)) : true
         * (nOpCode < OP_1) : false
         * (nOpCode > OP_16) : false
         * (numKeys < 1) : false
         * (chunks.size() != 3 + numKeys) : false
         * (i < chunks.size() - 2) : true
         * (chunks.get(i).isOpCode()) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        ScriptChunk scriptChunk = new ScriptChunk(81, byteArray);
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        scriptChunkList.add(scriptChunkMock2);
        scriptChunkList.add(scriptChunk);
        scriptChunkList.add(scriptChunk2Mock);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        doReturn(true).when(scriptChunkMock2).isOpCode();
        doReturn(false).when(scriptChunk2Mock).equalsOpCode(174);
        doReturn(true).when(scriptChunk2Mock).equalsOpCode(175);
        //Act Statement(s)
        boolean result = ScriptPattern.isSentToMultisig(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(scriptMock).chunks();
        verify(scriptChunkMock2).isOpCode();
        verify(scriptChunk2Mock).equalsOpCode(174);
        verify(scriptChunk2Mock).equalsOpCode(175);
    }

    //Sapient generated method id: ${6caf107a-03f9-313a-9b61-475607dcd050}, hash: 8F551B5C7979EA3FEB6C54695DDCD743
    @Test()
    public void isSentToMultisigWhenILessThanChunksSizeMinus2AndChunksGetINotIsOpCodeAndMOpCodeGreaterThanOrEqualsToOP_1AndMOpCodeLessT() {
        /* Branches:
         * (chunks.size() < 4) : false
         * (!(chunk.equalsOpCode(OP_CHECKMULTISIG) || chunk.equalsOpCode(OP_CHECKMULTISIGVERIFY))) : true
         * (chunk.equalsOpCode(OP_CHECKMULTISIG)) : true
         * (nOpCode < OP_1) : false
         * (nOpCode > OP_16) : false
         * (numKeys < 1) : false
         * (chunks.size() != 3 + numKeys) : false
         * (i < chunks.size() - 2) : true
         * (chunks.get(i).isOpCode()) : false
         * (mOpCode >= OP_1) : true
         * (mOpCode <= OP_16) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        ScriptChunk scriptChunk = new ScriptChunk(81, byteArray);
        byte[] byteArray2 = new byte[]{};
        ScriptChunk scriptChunk2 = new ScriptChunk(81, byteArray2);
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunk);
        scriptChunkList.add(scriptChunk2Mock);
        scriptChunkList.add(scriptChunk2);
        scriptChunkList.add(scriptChunk3Mock);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        doReturn(false).when(scriptChunk2Mock).isOpCode();
        doReturn(false).when(scriptChunk3Mock).equalsOpCode(174);
        doReturn(true).when(scriptChunk3Mock).equalsOpCode(175);
        //Act Statement(s)
        boolean result = ScriptPattern.isSentToMultisig(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(scriptMock).chunks();
        verify(scriptChunk2Mock).isOpCode();
        verify(scriptChunk3Mock).equalsOpCode(174);
        verify(scriptChunk3Mock).equalsOpCode(175);
    }

    //Sapient generated method id: ${6633618f-753b-3f28-96ba-8c0047f6811a}, hash: 576CC1F0F8F49358195BB3F68E0ADA53
    @Test()
    public void isSentToMultisigWhenMOpCodeGreaterThanOrEqualsToOP_1AndMOpCodeGreaterThanOP_16() {
        /* Branches:
         * (chunks.size() < 4) : false
         * (!(chunk.equalsOpCode(OP_CHECKMULTISIG) || chunk.equalsOpCode(OP_CHECKMULTISIGVERIFY))) : true
         * (chunk.equalsOpCode(OP_CHECKMULTISIG)) : true
         * (nOpCode < OP_1) : false
         * (nOpCode > OP_16) : false
         * (numKeys < 1) : false
         * (chunks.size() != 3 + numKeys) : false
         * (i < chunks.size() - 2) : true
         * (chunks.get(i).isOpCode()) : false
         * (mOpCode >= OP_1) : true
         * (mOpCode <= OP_16) : false
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        ScriptChunk scriptChunk = new ScriptChunk(97, byteArray);
        byte[] byteArray2 = new byte[]{};
        ScriptChunk scriptChunk2 = new ScriptChunk(81, byteArray2);
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunk);
        scriptChunkList.add(scriptChunk2Mock);
        scriptChunkList.add(scriptChunk2);
        scriptChunkList.add(scriptChunk3Mock);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        doReturn(false).when(scriptChunk2Mock).isOpCode();
        doReturn(false).when(scriptChunk3Mock).equalsOpCode(174);
        doReturn(true).when(scriptChunk3Mock).equalsOpCode(175);
        //Act Statement(s)
        boolean result = ScriptPattern.isSentToMultisig(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(scriptMock).chunks();
        verify(scriptChunk2Mock).isOpCode();
        verify(scriptChunk3Mock).equalsOpCode(174);
        verify(scriptChunk3Mock).equalsOpCode(175);
    }

    //Sapient generated method id: ${0770acba-40dc-3ff0-8ae2-67ff3dcfb354}, hash: EC7EA908998701BB0F163D5C02C802B3
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

    //Sapient generated method id: ${bdf0912d-cf75-34be-97a9-a0b1444cba71}, hash: 1F0FFF410D54D65C735564D93B339565
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

    //Sapient generated method id: ${65b7b213-2829-37c2-86a7-f470c15d0466}, hash: E03FAED828F3286030190C29CD76E550
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

    //Sapient generated method id: ${cac7d3ee-8f05-37a5-8fe2-5fc72450da0a}, hash: 7DC7D0DF8ECF79C78F726AA9F9B09527
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

    //Sapient generated method id: ${c2d35954-33be-3d37-9195-2a8ac0892310}, hash: 35C751CE5E71B345287EA56845D3E89E
    @Test()
    public void isWitnessCommitmentWhenChunkDataLengthNotEquals36() {
        /* Branches:
         * (chunks.size() < 2) : false
         * (!chunks.get(0).equalsOpCode(ScriptOpCodes.OP_RETURN)) : false
         * (chunkData == null) : false
         * (chunkData.length != 36) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0};
        ScriptChunk scriptChunk = new ScriptChunk(0, byteArray);
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        scriptChunkList.add(scriptChunk);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        doReturn(true).when(scriptChunkMock).equalsOpCode(106);
        //Act Statement(s)
        boolean result = ScriptPattern.isWitnessCommitment(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(scriptMock).chunks();
        verify(scriptChunkMock).equalsOpCode(106);
    }

    //Sapient generated method id: ${878f4915-4525-33da-8a0b-6fa1a368d5e3}, hash: 722D4B2392900202CDA119C33F7BFCAD
    @Test()
    public void isWitnessCommitmentWhenArraysNotEqualsArraysCopyOfRangeChunkData04SEGWIT_COMMITMENT_HEADER() {
        /* Branches:
         * (chunks.size() < 2) : false
         * (!chunks.get(0).equalsOpCode(ScriptOpCodes.OP_RETURN)) : false
         * (chunkData == null) : false
         * (chunkData.length != 36) : false
         * (!Arrays.equals(Arrays.copyOfRange(chunkData, 0, 4), SEGWIT_COMMITMENT_HEADER)) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33, (byte) 34, (byte) 35};
        ScriptChunk scriptChunk = new ScriptChunk(0, byteArray);
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        scriptChunkList.add(scriptChunkMock);
        scriptChunkList.add(scriptChunk);
        doReturn(scriptChunkList).when(scriptMock).chunks();
        doReturn(true).when(scriptChunkMock).equalsOpCode(106);
        //Act Statement(s)
        boolean result = ScriptPattern.isWitnessCommitment(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(scriptMock).chunks();
        verify(scriptChunkMock).equalsOpCode(106);
    }

    //Sapient generated method id: ${a225fd2d-d579-3a60-bf1d-8afabf7efda1}, hash: 53EABBD4906BFCDA8D46C542AC4C608D
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
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        doReturn(scriptChunkList).when(scriptMock).chunks();
        //Act Statement(s)
        boolean result = ScriptPattern.isWitnessCommitment(scriptMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(scriptMock).chunks();
    }

    //Sapient generated method id: ${ce8c0d92-3e29-3ded-a756-fd8b19cfbe8a}, hash: C24331763665567CAAC985E0D21D2657
    @Ignore()
    @Test()
    public void extractWitnessCommitmentHashTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Script scriptMock = mock(Script.class, "1234567890");
        Sha256Hash sha256HashMock = mock(Sha256Hash.class, "0000000000000000000000000000000000000000000000000000000000000000");
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class)) {
            byte[] byteArray = new byte[]{};
            ScriptChunk scriptChunk = new ScriptChunk(0, byteArray);
            byte[] byteArray2 = new byte[]{};
            ScriptChunk scriptChunk2 = new ScriptChunk(0, byteArray2);
            byte[] byteArray3 = new byte[]{};
            ScriptChunk scriptChunk3 = new ScriptChunk(0, byteArray3);
            byte[] byteArray4 = new byte[]{};
            ScriptChunk scriptChunk4 = new ScriptChunk(0, byteArray4);
            byte[] byteArray5 = new byte[]{};
            ScriptChunk scriptChunk5 = new ScriptChunk(0, byteArray5);
            byte[] byteArray6 = new byte[]{};
            ScriptChunk scriptChunk6 = new ScriptChunk(0, byteArray6);
            byte[] byteArray7 = new byte[]{};
            ScriptChunk scriptChunk7 = new ScriptChunk(0, byteArray7);
            List<ScriptChunk> scriptChunkList = new ArrayList<>();
            scriptChunkList.add(scriptChunk);
            scriptChunkList.add(scriptChunk2);
            scriptChunkList.add(scriptChunk3);
            scriptChunkList.add(scriptChunk4);
            scriptChunkList.add(scriptChunk5);
            scriptChunkList.add(scriptChunk6);
            scriptChunkList.add(scriptChunk7);
            doReturn(scriptChunkList).when(scriptMock).chunks();
            byte[] byteArray8 = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.wrap(byteArray8)).thenReturn(sha256HashMock);
            //Act Statement(s)
            Sha256Hash result = ScriptPattern.extractWitnessCommitmentHash(scriptMock);
            //Assert statement(s)
            assertThat(result, equalTo(sha256HashMock));
            verify(scriptMock).chunks();
            sha256Hash.verify(() -> Sha256Hash.wrap(byteArray8), atLeast(1));
        }
    }
}
