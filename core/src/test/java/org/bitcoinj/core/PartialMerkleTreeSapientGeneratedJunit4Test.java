package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.nio.BufferOverflowException;

import org.junit.rules.ExpectedException;

import java.util.List;

import org.mockito.stubbing.Answer;

import java.nio.ByteBuffer;

import org.bitcoinj.base.internal.Preconditions;
import org.bitcoinj.base.VarInt;
import org.bitcoinj.base.Sha256Hash;
import org.bitcoinj.base.internal.ByteUtils;

import java.util.function.Supplier;

import org.mockito.MockedStatic;
import org.bitcoinj.base.internal.Buffers;

import java.util.ArrayList;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInRelativeOrder;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class PartialMerkleTreeSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Sha256Hash sha256Hash2Mock = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    private final VarInt varIntMock = mock(VarInt.class);

    //Sapient generated method id: ${4aa4bedf-c7b1-3c8b-9764-9ede7c68f03b}
    @Ignore()
    @Test()
    public void readWhenILessThanNHashes() throws Throwable {
        /* Branches:
         * (i < nHashes) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Buffers> buffers = mockStatic(Buffers.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(1L);
            VarInt varInt2 = new VarInt(0L);
            varInt.when(() -> VarInt.read((ByteBuffer) any())).thenReturn(varInt2);
            preconditions.when(() -> Preconditions.check(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            buffers.when(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any())).thenReturn(byteArray);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            PartialMerkleTree result = PartialMerkleTree.read(byteBuffer);
            List<Sha256Hash> sha256HashList = new ArrayList<>(0);
            PartialMerkleTree partialMerkleTree = new PartialMerkleTree(1, sha256HashList, byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(partialMerkleTree));
            byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()));
            varInt.verify(() -> VarInt.read((ByteBuffer) any()));
            preconditions.verify(() -> Preconditions.check(eq(true), (Supplier) any()));
            buffers.verify(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${561174ec-e4d3-3952-bafc-b3a0e4e3d1f1}
    @Ignore()
    @Test()
    public void buildFromLeavesWhenBitListNotGetI() {
        /* Branches:
         * (getTreeWidth(allLeafHashes.size(), height) > 1) : false
         * (p < (pos + 1) << height) : true  #  inside traverseAndBuild method
         * (p < allLeafHashes.size()) : false  #  inside traverseAndBuild method
         * (height == 0) : true  #  inside traverseAndBuild method
         * (height == 0) : true  #  inside calcHash method
         * (i < bitList.size()) : true
         * (bitList.get(i)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 85};
            byteUtils.when(() -> ByteUtils.checkBitLE(byteArray, 0)).thenReturn(true);
            byteUtils.when(() -> ByteUtils.checkBitLE(byteArray, 1)).thenReturn(true);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
            ByteBuffer byteBuffer3 = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash3 = Sha256Hash.read(byteBuffer3);
            ByteBuffer byteBuffer4 = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash4 = Sha256Hash.read(byteBuffer4);
            List<Sha256Hash> sha256HashList = new ArrayList<>();
            sha256HashList.add(sha256Hash);
            sha256HashList.add(sha256Hash2);
            sha256HashList.add(sha256Hash3);
            sha256HashList.add(sha256Hash4);
            //Act Statement(s)
            PartialMerkleTree result = PartialMerkleTree.buildFromLeaves(byteArray, sha256HashList);
            List<Sha256Hash> sha256HashList2 = new ArrayList<>();
            sha256HashList2.add(sha256Hash2);
            byte[] byteArray2 = new byte[]{(byte) 7};
            PartialMerkleTree partialMerkleTree = new PartialMerkleTree(4, sha256HashList2, byteArray2);
            //Assert statement(s)
            assertThat(result, equalTo(partialMerkleTree));
            byteUtils.verify(() -> ByteUtils.checkBitLE(byteArray, 0), atLeast(2));
            byteUtils.verify(() -> ByteUtils.checkBitLE(byteArray, 1), atLeast(1));
        }
    }

    //Sapient generated method id: ${e08b6546-fdb0-38fa-8eff-a86502e46a7d}
    @Ignore()
    @Test()
    public void buildFromLeavesWhenPPlus1LessThanGetTreeWidthHashesSizeHAndILessThanBitListSizeAndBitListNotGetI() {
        /* Branches:
         * (getTreeWidth(allLeafHashes.size(), height) > 1) : true
         * (p < (pos + 1) << height) : true  #  inside traverseAndBuild method
         * (p < allLeafHashes.size()) : true  #  inside traverseAndBuild method
         * (ByteUtils.checkBitLE(includeBits, p)) : false  #  inside traverseAndBuild method
         * (height == 0) : false  #  inside traverseAndBuild method
         * (!parentOfMatch) : true  #  inside traverseAndBuild method
         * (height == 0) : false  #  inside calcHash method
         * (p + 1 < getTreeWidth(hashes.size(), h)) : true  #  inside calcHash method
         * (i < bitList.size()) : true
         * (bitList.get(i)) : false
         */
        //Arrange Statement(s)
        Sha256Hash sha256HashMock = mock(Sha256Hash.class, "c5d2460186f7233c927e7db2dcc703c0e500b653ca82273b7bfad8045d85a470");
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            byteUtils.when(() -> ByteUtils.checkBitLE(byteArray, 0)).thenReturn(false);
            List<Sha256Hash> sha256HashList = new ArrayList<>();
            sha256HashList.add(sha256HashMock);
            //Act Statement(s)
            PartialMerkleTree result = PartialMerkleTree.buildFromLeaves(byteArray, sha256HashList);
            List<Sha256Hash> sha256HashList2 = new ArrayList<>();
            sha256HashList2.add(sha256HashMock2);
            byte[] byteArray2 = new byte[]{(byte) 0};
            PartialMerkleTree partialMerkleTree = new PartialMerkleTree(1, sha256HashList2, byteArray2);
            //Assert statement(s)
            assertThat(result, equalTo(partialMerkleTree));
            byteUtils.verify(() -> ByteUtils.checkBitLE(byteArray, 0), atLeast(1));
        }
    }

    //Sapient generated method id: ${b1a03d93-32c0-37a3-8670-be1824d3db5a}
    @Ignore()
    @Test()
    public void buildFromLeavesWhenPPlus1NotLessThanGetTreeWidthHashesSizeHAndILessThanBitListSizeAndBitListNotGetI() {
        /* Branches:
         * (getTreeWidth(allLeafHashes.size(), height) > 1) : true
         * (p < (pos + 1) << height) : true  #  inside traverseAndBuild method
         * (p < allLeafHashes.size()) : true  #  inside traverseAndBuild method
         * (ByteUtils.checkBitLE(includeBits, p)) : false  #  inside traverseAndBuild method
         * (height == 0) : false  #  inside traverseAndBuild method
         * (!parentOfMatch) : true  #  inside traverseAndBuild method
         * (height == 0) : false  #  inside calcHash method
         * (p + 1 < getTreeWidth(hashes.size(), h)) : false  #  inside calcHash method
         * (i < bitList.size()) : true
         * (bitList.get(i)) : false
         */
        //Arrange Statement(s)
        Sha256Hash sha256Hash3Mock = mock(Sha256Hash.class, "[247, 95, 7, 47, 47, 128, 218, 29, 82, 181, 16, 214, 77, 129, 78, 56, 19, 107, 239, 80, 47, 27, 38, 68, 96, 57, 105, 233, 60, 82, 50, 98]");
        Sha256Hash sha256Hash3Mock2 = mock(Sha256Hash.class, "[247, 95, 7, 47, 47, 128, 218, 29, 82, 181, 16, 214, 77, 129, 78, 56, 19, 107, 239, 80, 47, 27, 38, 68, 96, 57, 105, 233, 60, 82, 50, 98]");
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            byteUtils.when(() -> ByteUtils.checkBitLE(byteArray, 0)).thenReturn(false);
            byteUtils.when(() -> ByteUtils.checkBitLE(byteArray, 1)).thenReturn(false);
            byte[] byteArray2 = new byte[]{};
            byte[] byteArray3 = new byte[]{};
            byteUtils.when(() -> ByteUtils.reverseBytes(byteArray3)).thenReturn(byteArray2);
            byte[] byteArray4 = new byte[]{};
            byteUtils.when(() -> ByteUtils.reverseBytes((byte[]) null)).thenReturn(byteArray4);
            byte[] byteArray5 = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.hashTwice(byteArray2, byteArray4)).thenReturn(byteArray5);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer);
            sha256Hash.when(() -> Sha256Hash.wrapReversed(byteArray5)).thenReturn(sha256Hash2);
            List<Sha256Hash> sha256HashList = new ArrayList<>();
            sha256HashList.add(sha256Hash3Mock);
            sha256HashList.add(sha256Hash3Mock2);
            //Act Statement(s)
            PartialMerkleTree result = PartialMerkleTree.buildFromLeaves(byteArray, sha256HashList);
            List<Sha256Hash> sha256HashList2 = new ArrayList<>();
            sha256HashList2.add(sha256Hash2);
            byte[] byteArray6 = new byte[]{(byte) 0};
            PartialMerkleTree partialMerkleTree = new PartialMerkleTree(2, sha256HashList2, byteArray6);
            //Assert statement(s)
            assertThat(result, equalTo(partialMerkleTree));
            byteUtils.verify(() -> ByteUtils.checkBitLE(byteArray, 0), atLeast(1));
            byteUtils.verify(() -> ByteUtils.checkBitLE(byteArray, 1), atLeast(1));
            byteUtils.verify(() -> ByteUtils.reverseBytes(byteArray3), atLeast(1));
            byteUtils.verify(() -> ByteUtils.reverseBytes((byte[]) null), atLeast(1));
            sha256Hash.verify(() -> Sha256Hash.hashTwice(byteArray2, byteArray4), atLeast(1));
            sha256Hash.verify(() -> Sha256Hash.wrapReversed(byteArray5), atLeast(1));
        }
    }

    //Sapient generated method id: ${6af4be85-76ec-3b30-8035-df3d22289847}
    @Ignore()
    @Test()
    public void writeWhenHashesIsNotEmpty() throws BufferOverflowException {
        /* Branches:
         * (for-each(hashes)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: org.bitcoinj.base.VarInt
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Buffers> buffers = mockStatic(Buffers.class);
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            byteUtils.when(() -> ByteUtils.writeInt32LE(eq(1), (ByteBuffer) any())).thenReturn(byteBuffer);
            VarInt varInt2 = new VarInt(0L);
            varInt.when(() -> VarInt.of(1L)).thenReturn(varInt2);
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
            byte[] byteArray = new byte[]{(byte) 0};
            buffers.when(() -> Buffers.writeLengthPrefixedBytes((ByteBuffer) any(), eq(byteArray))).thenReturn(byteBuffer2);
            ByteBuffer byteBuffer3 = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer3);
            List<Sha256Hash> sha256HashList = new ArrayList<>();
            sha256HashList.add(sha256Hash);
            byte[] byteArray2 = new byte[]{(byte) 0};
            PartialMerkleTree target = new PartialMerkleTree(1, sha256HashList, byteArray2);
            ByteBuffer byteBuffer4 = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            ByteBuffer result = target.write(byteBuffer4);
            //Assert statement(s)
            assertThat(result, equalTo(byteBuffer4));
            byteUtils.verify(() -> ByteUtils.writeInt32LE(eq(1), (ByteBuffer) any()));
            varInt.verify(() -> VarInt.of(1L), atLeast(1));
            buffers.verify(() -> Buffers.writeLengthPrefixedBytes((ByteBuffer) any(), eq(byteArray)));
        }
    }

    //Sapient generated method id: ${9d328af1-2293-3544-bbbc-a0683c1f9fbe}
    @Ignore()
    @Test()
    public void serializeTest() throws BufferOverflowException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
        List<Sha256Hash> sha256HashList = new ArrayList<>();
        sha256HashList.add(sha256Hash);
        sha256HashList.add(sha256Hash2);
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 0, (byte) 1};
        PartialMerkleTree target = spy(new PartialMerkleTree(10, sha256HashList, byteArray));
        ByteBuffer byteBuffer3 = ByteBuffer.allocateDirect(0);
        doReturn(byteBuffer3).when(target).write((ByteBuffer) any());
        //Act Statement(s)
        byte[] result = target.serialize();
        byte[] byteResultArray = new byte[]{};
        //Assert statement(s)
        assertThat(result, equalTo(byteResultArray));
        verify(target).write((ByteBuffer) any());
    }

    //Sapient generated method id: ${c2057553-a090-359a-8f38-97b151dff7fd}
    @Ignore()
    @Test()
    public void messageSizeTest() {
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
        ByteBuffer byteBuffer3 = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash3 = Sha256Hash.read(byteBuffer3);
        List<Sha256Hash> sha256HashList = new ArrayList<>();
        sha256HashList.add(sha256Hash);
        sha256HashList.add(sha256Hash2);
        sha256HashList.add(sha256Hash3);
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 0};
        PartialMerkleTree target = new PartialMerkleTree(10, sha256HashList, byteArray);
        //Act Statement(s)
        int result = target.messageSize();
        //Assert statement(s)
        assertThat(result, equalTo(110));
    }

    //Sapient generated method id: ${435d64f5-8fca-31bf-b014-13944bac4d4c}
    @Test()
    public void getMessageSizeTest() {
        //Arrange Statement(s)
        List<Sha256Hash> sha256HashList = new ArrayList<>();
        byte[] byteArray = new byte[]{};
        PartialMerkleTree target = new PartialMerkleTree(0, sha256HashList, byteArray);
        //Act Statement(s)
        int result = target.getMessageSize();
        //Assert statement(s)
        assertThat(result, equalTo(6));
    }

    //Sapient generated method id: ${6ec8093e-deb3-33db-8067-8038a95dda60}
    @Ignore()
    @Test()
    public void getTxnHashAndMerkleRootWhenTransactionCountEquals0ThrowsVerificationException() throws VerificationException {
        /* Branches:
         * (transactionCount == 0) : true
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
        ByteBuffer byteBuffer3 = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash3 = Sha256Hash.read(byteBuffer3);
        List<Sha256Hash> sha256HashList = new ArrayList<>();
        sha256HashList.add(sha256Hash);
        sha256HashList.add(sha256Hash2);
        sha256HashList.add(sha256Hash3);
        byte[] byteArray = new byte[]{(byte) 1, (byte) 0, (byte) 1};
        PartialMerkleTree target = new PartialMerkleTree(0, sha256HashList, byteArray);
        thrown.expect(VerificationException.class);
        List<Sha256Hash> sha256HashList2 = new ArrayList<>();
        //Act Statement(s)
        target.getTxnHashAndMerkleRoot(sha256HashList2);
    }

    //Sapient generated method id: ${83329bcc-fba0-3edb-bbb3-97bc053a08b5}
    @Ignore()
    @Test()
    public void getTxnHashAndMerkleRootWhenTransactionCountGreaterThanBlockMAX_BLOCK_SIZEDividedBy60ThrowsVerificationException() throws VerificationException {
        /* Branches:
         * (transactionCount == 0) : false
         * (transactionCount > Block.MAX_BLOCK_SIZE / 60) : true
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
        ByteBuffer byteBuffer3 = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash3 = Sha256Hash.read(byteBuffer3);
        List<Sha256Hash> sha256HashList = new ArrayList<>();
        sha256HashList.add(sha256Hash);
        sha256HashList.add(sha256Hash2);
        sha256HashList.add(sha256Hash3);
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 0};
        PartialMerkleTree target = new PartialMerkleTree(100, sha256HashList, byteArray);
        thrown.expect(VerificationException.class);
        ByteBuffer byteBuffer4 = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash4 = Sha256Hash.read(byteBuffer4);
        ByteBuffer byteBuffer5 = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash5 = Sha256Hash.read(byteBuffer5);
        List<Sha256Hash> sha256HashList2 = new ArrayList<>();
        sha256HashList2.add(sha256Hash4);
        sha256HashList2.add(sha256Hash5);
        //Act Statement(s)
        target.getTxnHashAndMerkleRoot(sha256HashList2);
        //Assert statement(s)
        assertThat(sha256HashList2.size(), equalTo(0));
    }

    //Sapient generated method id: ${fbf598f7-b2d7-3dcb-8969-b883e69c9e21}
    @Ignore()
    @Test()
    public void getTxnHashAndMerkleRootWhenHashesSizeGreaterThanTransactionCountThrowsVerificationException() throws VerificationException {
        /* Branches:
         * (transactionCount == 0) : false
         * (transactionCount > Block.MAX_BLOCK_SIZE / 60) : false
         * (hashes.size() > transactionCount) : true
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
        ByteBuffer byteBuffer3 = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash3 = Sha256Hash.read(byteBuffer3);
        List<Sha256Hash> sha256HashList = new ArrayList<>();
        sha256HashList.add(sha256Hash);
        sha256HashList.add(sha256Hash2);
        sha256HashList.add(sha256Hash3);
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 0};
        PartialMerkleTree target = new PartialMerkleTree(10, sha256HashList, byteArray);
        thrown.expect(VerificationException.class);
        List<Sha256Hash> sha256HashList2 = new ArrayList<>();
        //Act Statement(s)
        target.getTxnHashAndMerkleRoot(sha256HashList2);
    }

    //Sapient generated method id: ${23427d43-9a70-3ccf-b5d0-d6ec7915e143}
    @Ignore()
    @Test()
    public void getTxnHashAndMerkleRootWhenUsedBitsUsedPlus7DividedBy8EqualsMatchedChildBitsLengthAndUsedHashesUsedEqualsHashesSize() throws VerificationException {
        /* Branches:
         * (transactionCount == 0) : false
         * (transactionCount > Block.MAX_BLOCK_SIZE / 60) : false
         * (hashes.size() > transactionCount) : false
         * (matchedChildBits.length * 8 < hashes.size()) : false
         * (getTreeWidth(transactionCount, height) > 1) : false
         * (used.bitsUsed >= matchedChildBits.length * 8) : false  #  inside recursiveExtractHashes method
         * (height == 0) : true  #  inside recursiveExtractHashes method
         * (used.hashesUsed >= hashes.size()) : false  #  inside recursiveExtractHashes method
         * (height == 0) : true  #  inside recursiveExtractHashes method
         * (parentOfMatch) : true  #  inside recursiveExtractHashes method
         * ((used.bitsUsed + 7) / 8 != matchedChildBits.length) : false
         * (used.hashesUsed != hashes.size()) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            byteUtils.when(() -> ByteUtils.checkBitLE(byteArray, 1)).thenReturn(true);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            List<Sha256Hash> sha256HashList = new ArrayList<>();
            sha256HashList.add(sha256Hash);
            byte[] byteArray2 = new byte[]{(byte) 0};
            PartialMerkleTree target = new PartialMerkleTree(1, sha256HashList, byteArray2);
            List<Sha256Hash> sha256HashList2 = new ArrayList<>();
            //Act Statement(s)
            Sha256Hash result = target.getTxnHashAndMerkleRoot(sha256HashList2);
            List<Sha256Hash> sha256HashSha256HashList2List = new ArrayList<>();
            sha256HashSha256HashList2List.add(sha256Hash);
            //Assert statement(s)
            assertThat(result, equalTo(sha256Hash));
            assertThat(sha256HashList2.size(), equalTo(sha256HashSha256HashList2List.size()));
            assertThat(sha256HashList2, containsInRelativeOrder(sha256HashSha256HashList2List.toArray()));
            byteUtils.verify(() -> ByteUtils.checkBitLE(byteArray, 1), atLeast(1));
        }
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}
    @Ignore()
    @Test()
    public void toStringTest() {
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
        List<Sha256Hash> sha256HashList = new ArrayList<>();
        sha256HashList.add(sha256Hash);
        sha256HashList.add(sha256Hash2);
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 0, (byte) 1};
        PartialMerkleTree target = new PartialMerkleTree(10, sha256HashList, byteArray);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("PartialMerkleTree{transactionCount=10, matchedChildBits=[0, 1, 0, 1], hashes=[]}"));
    }
}
