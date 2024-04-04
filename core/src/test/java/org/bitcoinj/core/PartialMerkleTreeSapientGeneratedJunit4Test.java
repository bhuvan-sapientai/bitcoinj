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

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

public class PartialMerkleTreeSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Sha256Hash sha256Hash2Mock = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    private final VarInt varIntMock = mock(VarInt.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${4aa4bedf-c7b1-3c8b-9764-9ede7c68f03b}, hash: 2D7F54EAB278869E307D25E8C3BE2100
    @Test()
    public void readWhenILessThanNHashes() throws Throwable {
        /* Branches:
         * (i < nHashes) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Buffers> buffers = mockStatic(Buffers.class);
             MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(1L);
            varInt.when(() -> VarInt.read((ByteBuffer) any())).thenReturn(varIntMock);
            doReturn(false).when(varIntMock).fitsInt();
            doReturn(1).when(varIntMock).intValue();
            preconditions.when(() -> Preconditions.check(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            sha256Hash.when(() -> Sha256Hash.read((ByteBuffer) any())).thenReturn(sha256HashMock);
            byte[] byteArray = new byte[]{};
            buffers.when(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any())).thenReturn(byteArray);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            PartialMerkleTree result = PartialMerkleTree.read(byteBuffer);
            List<Sha256Hash> sha256HashList = new ArrayList<>(1);
            sha256HashList.add(sha256HashMock);
            PartialMerkleTree partialMerkleTree = new PartialMerkleTree(1, sha256HashList, byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(partialMerkleTree));
            byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()));
            varInt.verify(() -> VarInt.read((ByteBuffer) any()));
            verify(varIntMock).fitsInt();
            verify(varIntMock).intValue();
            preconditions.verify(() -> Preconditions.check(eq(false), (Supplier) any()));
            sha256Hash.verify(() -> Sha256Hash.read((ByteBuffer) any()));
            buffers.verify(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${561174ec-e4d3-3952-bafc-b3a0e4e3d1f1}, hash: EB7A8C3DB75E2699F133C9A28F2EF154
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
        byte[] byteArray = new byte[]{};
        List<Sha256Hash> sha256HashList = new ArrayList<>();
        //Act Statement(s)
        PartialMerkleTree result = PartialMerkleTree.buildFromLeaves(byteArray, sha256HashList);
        List<Sha256Hash> sha256HashList2 = new ArrayList<>();
        sha256HashList2.add(sha256HashMock);
        byte[] byteArray2 = new byte[]{(byte) 0};
        PartialMerkleTree partialMerkleTree = new PartialMerkleTree(0, sha256HashList2, byteArray2);
        //Assert statement(s)
        assertThat(result, equalTo(partialMerkleTree));
    }

    //Sapient generated method id: ${a97a8812-5dd8-38c4-b2de-feda59df7534}, hash: ACC1E181785BB12B6397AAE2396FF59F
    @Ignore()
    @Test()
    public void buildFromLeavesWhenBitListGetI() {
        /* Branches:
         * (getTreeWidth(allLeafHashes.size(), height) > 1) : true
         * (p < (pos + 1) << height) : true  #  inside traverseAndBuild method
         * (p < allLeafHashes.size()) : true  #  inside traverseAndBuild method
         * (ByteUtils.checkBitLE(includeBits, p)) : true  #  inside traverseAndBuild method
         * (height == 0) : false  #  inside traverseAndBuild method
         * (!parentOfMatch) : false  #  inside traverseAndBuild method
         * (p + 1 < getTreeWidth(allLeafHashes.size(), h)) : true  #  inside traverseAndBuild method
         * (i < bitList.size()) : true
         * (bitList.get(i)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            byteUtils.when(() -> ByteUtils.checkBitLE(byteArray, 0)).thenReturn(true);
            List<Sha256Hash> sha256HashList = new ArrayList<>();
            sha256HashList.add(sha256HashMock);
            //Act Statement(s)
            PartialMerkleTree result = PartialMerkleTree.buildFromLeaves(byteArray, sha256HashList);
            List<Sha256Hash> sha256HashList2 = new ArrayList<>();
            byte[] byteArray2 = new byte[]{(byte) 1};
            PartialMerkleTree partialMerkleTree = new PartialMerkleTree(1, sha256HashList2, byteArray2);
            //Assert statement(s)
            assertThat(result, equalTo(partialMerkleTree));
            byteUtils.verify(() -> ByteUtils.checkBitLE(byteArray, 0), atLeast(1));
        }
    }

    //Sapient generated method id: ${e08b6546-fdb0-38fa-8eff-a86502e46a7d}, hash: 0D629BD0B2F89B07C71B119A5C34026B
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
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class, CALLS_REAL_METHODS);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            byteUtils.when(() -> ByteUtils.checkBitLE(byteArray, 0)).thenReturn(false);
            byte[] byteArray2 = new byte[]{(byte) 93, (byte) -10, (byte) -32, (byte) -30, (byte) 118, (byte) 19, (byte) 89, (byte) -45, (byte) 10, (byte) -126, (byte) 117, (byte) 5, (byte) -114, (byte) 41, (byte) -97, (byte) -52, (byte) 3, (byte) -127, (byte) 83, (byte) 69, (byte) 69, (byte) -11, (byte) 92, (byte) -12, (byte) 62, (byte) 65, (byte) -104, (byte) 63, (byte) 93, (byte) 76, (byte) -108, (byte) 86};
            sha256Hash.when(() -> Sha256Hash.wrapReversed(byteArray2)).thenReturn(sha256HashMock);
            List<Sha256Hash> sha256HashList = new ArrayList<>();
            sha256HashList.add(sha256Hash2Mock);
            //Act Statement(s)
            PartialMerkleTree result = PartialMerkleTree.buildFromLeaves(byteArray, sha256HashList);
            List<Sha256Hash> sha256HashList2 = new ArrayList<>();
            sha256HashList2.add(sha256HashMock);
            byte[] byteArray3 = new byte[]{(byte) 0};
            PartialMerkleTree partialMerkleTree = new PartialMerkleTree(1, sha256HashList2, byteArray3);
            //Assert statement(s)
            assertThat(result, equalTo(partialMerkleTree));
            byteUtils.verify(() -> ByteUtils.checkBitLE(byteArray, 0), atLeast(1));
            sha256Hash.verify(() -> Sha256Hash.wrapReversed(byteArray2), atLeast(1));
        }
    }

    //Sapient generated method id: ${b1a03d93-32c0-37a3-8670-be1824d3db5a}, hash: 3DF627BA720CB5C6A020E14B6D437C7F
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
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class, CALLS_REAL_METHODS);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            byteUtils.when(() -> ByteUtils.checkBitLE(byteArray, 0)).thenReturn(false);
            byte[] byteArray2 = new byte[]{(byte) 93, (byte) -10, (byte) -32, (byte) -30, (byte) 118, (byte) 19, (byte) 89, (byte) -45, (byte) 10, (byte) -126, (byte) 117, (byte) 5, (byte) -114, (byte) 41, (byte) -97, (byte) -52, (byte) 3, (byte) -127, (byte) 83, (byte) 69, (byte) 69, (byte) -11, (byte) 92, (byte) -12, (byte) 62, (byte) 65, (byte) -104, (byte) 63, (byte) 93, (byte) 76, (byte) -108, (byte) 86};
            sha256Hash.when(() -> Sha256Hash.wrapReversed(byteArray2)).thenReturn(sha256HashMock);
            List<Sha256Hash> sha256HashList = new ArrayList<>();
            sha256HashList.add(sha256Hash2Mock);
            //Act Statement(s)
            PartialMerkleTree result = PartialMerkleTree.buildFromLeaves(byteArray, sha256HashList);
            List<Sha256Hash> sha256HashList2 = new ArrayList<>();
            sha256HashList2.add(sha256HashMock);
            byte[] byteArray3 = new byte[]{(byte) 0};
            PartialMerkleTree partialMerkleTree = new PartialMerkleTree(1, sha256HashList2, byteArray3);
            //Assert statement(s)
            assertThat(result, equalTo(partialMerkleTree));
            byteUtils.verify(() -> ByteUtils.checkBitLE(byteArray, 0), atLeast(1));
            sha256Hash.verify(() -> Sha256Hash.wrapReversed(byteArray2), atLeast(1));
        }
    }

    //Sapient generated method id: ${6af4be85-76ec-3b30-8035-df3d22289847}, hash: 81FA60F541DDE5335C7C0958AC3E2C84
    @Test()
    public void writeWhenHashesIsNotEmpty() throws BufferOverflowException {
        /* Branches:
         * (for-each(hashes)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Sha256Hash hashMock = mock(Sha256Hash.class);
        try (MockedStatic<Buffers> buffers = mockStatic(Buffers.class);
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            doReturn(byteBuffer).when(hashMock).write((ByteBuffer) any());
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(64);
            byteUtils.when(() -> ByteUtils.writeInt32LE(eq(0), (ByteBuffer) any())).thenReturn(byteBuffer2);
            varInt.when(() -> VarInt.of(1L)).thenReturn(varIntMock);
            ByteBuffer byteBuffer3 = ByteBuffer.allocateDirect(64);
            doReturn(byteBuffer3).when(varIntMock).write((ByteBuffer) any());
            ByteBuffer byteBuffer4 = ByteBuffer.allocateDirect(64);
            byte[] byteArray = new byte[]{};
            buffers.when(() -> Buffers.writeLengthPrefixedBytes((ByteBuffer) any(), eq(byteArray))).thenReturn(byteBuffer4);
            List<Sha256Hash> sha256HashList = new ArrayList<>();
            sha256HashList.add(hashMock);
            PartialMerkleTree target = new PartialMerkleTree(0, sha256HashList, byteArray);
            ByteBuffer byteBuffer5 = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            ByteBuffer result = target.write(byteBuffer5);
            //Assert statement(s)
            assertThat(result, equalTo(byteBuffer5));
            verify(hashMock).write((ByteBuffer) any());
            byteUtils.verify(() -> ByteUtils.writeInt32LE(eq(0), (ByteBuffer) any()));
            varInt.verify(() -> VarInt.of(1L), atLeast(1));
            verify(varIntMock).write((ByteBuffer) any());
            buffers.verify(() -> Buffers.writeLengthPrefixedBytes((ByteBuffer) any(), eq(byteArray)));
        }
    }

    //Sapient generated method id: ${9d328af1-2293-3544-bbbc-a0683c1f9fbe}, hash: 2A3558641C669F14D9E1A3BA2F8CD5D5
    @Ignore()
    @Test()
    public void serializeTest() throws BufferOverflowException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(64);
        Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
        ByteBuffer byteBuffer3 = ByteBuffer.allocateDirect(64);
        Sha256Hash sha256Hash3 = Sha256Hash.read(byteBuffer3);
        List<Sha256Hash> sha256HashList = new ArrayList<>();
        sha256HashList.add(sha256Hash);
        sha256HashList.add(sha256Hash2);
        sha256HashList.add(sha256Hash3);
        byte[] byteArray = new byte[]{(byte) 1, (byte) 0, (byte) 1};
        PartialMerkleTree target = spy(new PartialMerkleTree(10, sha256HashList, byteArray));
        ByteBuffer byteBuffer4 = ByteBuffer.allocateDirect(64);
        doReturn(byteBuffer4).when(target).write((ByteBuffer) any());
        //Act Statement(s)
        byte[] result = target.serialize();
        //Assert statement(s)
        assertThat(result.length, equalTo(0));
        verify(target).write((ByteBuffer) any());
    }

    //Sapient generated method id: ${c2057553-a090-359a-8f38-97b151dff7fd}, hash: 514780AEF9B650326D5EFA7FD24D433E
    @Test()
    public void messageSizeTest() {
        //Arrange Statement(s)
        List<Sha256Hash> sha256HashList = new ArrayList<>();
        byte[] byteArray = new byte[]{};
        PartialMerkleTree target = new PartialMerkleTree(0, sha256HashList, byteArray);
        //Act Statement(s)
        int result = target.messageSize();
        //Assert statement(s)
        assertThat(result, equalTo(6));
    }

    //Sapient generated method id: ${435d64f5-8fca-31bf-b014-13944bac4d4c}, hash: 616FD47ED1B53877B746BB9B8A0199AA
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

    //Sapient generated method id: ${6ec8093e-deb3-33db-8067-8038a95dda60}, hash: 6E1BCD43A7876A4499894BBDD7DAA160
    @Test()
    public void getTxnHashAndMerkleRootWhenTransactionCountEquals0ThrowsVerificationException() throws VerificationException {
        /* Branches:
         * (transactionCount == 0) : true
         */
        //Arrange Statement(s)
        List<Sha256Hash> sha256HashList = new ArrayList<>();
        byte[] byteArray = new byte[]{};
        PartialMerkleTree target = new PartialMerkleTree(0, sha256HashList, byteArray);
        thrown.expect(VerificationException.class);
        List<Sha256Hash> sha256HashList2 = new ArrayList<>();
        //Act Statement(s)
        target.getTxnHashAndMerkleRoot(sha256HashList2);
        //Assert statement(s)
        assertThat(sha256HashList2.size(), equalTo(0));
    }

    //Sapient generated method id: ${83329bcc-fba0-3edb-bbb3-97bc053a08b5}, hash: BD73088F64DBEA2612B89335237B6DF0
    @Test()
    public void getTxnHashAndMerkleRootWhenTransactionCountGreaterThanBlockMAX_BLOCK_SIZEDividedBy60ThrowsVerificationException() throws VerificationException {
        /* Branches:
         * (transactionCount == 0) : false
         * (transactionCount > Block.MAX_BLOCK_SIZE / 60) : true
         */
        //Arrange Statement(s)
        List<Sha256Hash> sha256HashList = new ArrayList<>();
        byte[] byteArray = new byte[]{};
        PartialMerkleTree target = new PartialMerkleTree(16667, sha256HashList, byteArray);
        thrown.expect(VerificationException.class);
        List<Sha256Hash> sha256HashList2 = new ArrayList<>();
        //Act Statement(s)
        target.getTxnHashAndMerkleRoot(sha256HashList2);
        //Assert statement(s)
        assertThat(sha256HashList2.size(), equalTo(0));
    }

    //Sapient generated method id: ${fbf598f7-b2d7-3dcb-8969-b883e69c9e21}, hash: E13A1E630E187F7539C4CC23F2228500
    @Test()
    public void getTxnHashAndMerkleRootWhenHashesSizeGreaterThanTransactionCountThrowsVerificationException() throws VerificationException {
        /* Branches:
         * (transactionCount == 0) : false
         * (transactionCount > Block.MAX_BLOCK_SIZE / 60) : false
         * (hashes.size() > transactionCount) : true
         */
        //Arrange Statement(s)
        List<Sha256Hash> sha256HashList = new ArrayList<>();
        byte[] byteArray = new byte[]{};
        PartialMerkleTree target = new PartialMerkleTree(-1, sha256HashList, byteArray);
        thrown.expect(VerificationException.class);
        List<Sha256Hash> sha256HashList2 = new ArrayList<>();
        //Act Statement(s)
        target.getTxnHashAndMerkleRoot(sha256HashList2);
        //Assert statement(s)
        assertThat(sha256HashList2.size(), equalTo(0));
    }

    //Sapient generated method id: ${3a4e2338-f7b9-3e90-a74f-57ab949ee896}, hash: 335109793CA9E2D3A22D139016F09067
    @Test()
    public void getTxnHashAndMerkleRootWhenMatchedChildBitsLengthMultipliedBy8LessThanHashesSizeThrowsVerificationException() throws VerificationException {
        /* Branches:
         * (transactionCount == 0) : false
         * (transactionCount > Block.MAX_BLOCK_SIZE / 60) : false
         * (hashes.size() > transactionCount) : false
         * (matchedChildBits.length * 8 < hashes.size()) : true
         */
        //Arrange Statement(s)
        List<Sha256Hash> sha256HashList = new ArrayList<>();
        sha256HashList.add(sha256HashMock);
        byte[] byteArray = new byte[]{};
        PartialMerkleTree target = new PartialMerkleTree(1, sha256HashList, byteArray);
        thrown.expect(VerificationException.class);
        List<Sha256Hash> sha256HashList2 = new ArrayList<>();
        //Act Statement(s)
        target.getTxnHashAndMerkleRoot(sha256HashList2);
        //Assert statement(s)
        assertThat(sha256HashList2.size(), equalTo(0));
    }

    //Sapient generated method id: ${ac5b8ced-47be-39cc-9583-6a22e65ed652}, hash: 346D6F20262AD640AA32C6BC85AB7ECF
    @Test()
    public void getTxnHashAndMerkleRootWhenUsedBitsUsedGreaterThanOrEqualsToMatchedChildBitsLengthMultipliedThrowsVerificationException() throws VerificationException {
        /* Branches:
         * (transactionCount == 0) : false
         * (transactionCount > Block.MAX_BLOCK_SIZE / 60) : false
         * (hashes.size() > transactionCount) : false
         * (matchedChildBits.length * 8 < hashes.size()) : false
         * (getTreeWidth(transactionCount, height) > 1) : true
         * (used.bitsUsed >= matchedChildBits.length * 8) : true  #  inside recursiveExtractHashes method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<Sha256Hash> sha256HashList = new ArrayList<>();
        byte[] byteArray = new byte[]{};
        PartialMerkleTree target = new PartialMerkleTree(1, sha256HashList, byteArray);
        thrown.expect(VerificationException.class);
        List<Sha256Hash> sha256HashList2 = new ArrayList<>();
        //Act Statement(s)
        target.getTxnHashAndMerkleRoot(sha256HashList2);
        //Assert statement(s)
        assertThat(sha256HashList2.size(), equalTo(0));
    }

    //Sapient generated method id: ${b64c1032-8292-36aa-adb1-83f8f1b9793c}, hash: B68268FBE2F0D72DEF8BD10655B655A9
    @Test()
    public void getTxnHashAndMerkleRootWhenNotParentOfMatchAndUsedHashesUsedGreaterThanOrEqualsToHashesSizeThrowsVerificationException() throws VerificationException {
        /* Branches:
         * (transactionCount == 0) : false
         * (transactionCount > Block.MAX_BLOCK_SIZE / 60) : false
         * (hashes.size() > transactionCount) : false
         * (matchedChildBits.length * 8 < hashes.size()) : false
         * (getTreeWidth(transactionCount, height) > 1) : true
         * (used.bitsUsed >= matchedChildBits.length * 8) : false  #  inside recursiveExtractHashes method
         * (height == 0) : false  #  inside recursiveExtractHashes method
         * (!parentOfMatch) : true  #  inside recursiveExtractHashes method
         * (used.hashesUsed >= hashes.size()) : true  #  inside recursiveExtractHashes method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byte[] byteArray = new byte[]{};
            byteUtils.when(() -> ByteUtils.checkBitLE(byteArray, 0)).thenReturn(false);
            List<Sha256Hash> sha256HashList = new ArrayList<>();
            PartialMerkleTree target = new PartialMerkleTree(1, sha256HashList, byteArray);
            thrown.expect(VerificationException.class);
            List<Sha256Hash> sha256HashList2 = new ArrayList<>();
            //Act Statement(s)
            target.getTxnHashAndMerkleRoot(sha256HashList2);
            //Assert statement(s)
            assertThat(sha256HashList2.size(), equalTo(0));
            byteUtils.verify(() -> ByteUtils.checkBitLE(byteArray, 0), atLeast(1));
        }
    }

    //Sapient generated method id: ${7461e740-da2f-387c-bc2b-05da5aa5cfd3}, hash: 524EDE8C37EE98A3401FF6702F8D9678
    @Test()
    public void getTxnHashAndMerkleRootWhenArraysEqualsRightLeftThrowsVerificationException() throws VerificationException {
        /* Branches:
         * (transactionCount == 0) : false
         * (transactionCount > Block.MAX_BLOCK_SIZE / 60) : false
         * (hashes.size() > transactionCount) : false
         * (matchedChildBits.length * 8 < hashes.size()) : false
         * (getTreeWidth(transactionCount, height) > 1) : true
         * (used.bitsUsed >= matchedChildBits.length * 8) : false  #  inside recursiveExtractHashes method
         * (height == 0) : false  #  inside recursiveExtractHashes method
         * (!parentOfMatch) : false  #  inside recursiveExtractHashes method
         * (pos * 2 + 1 < getTreeWidth(transactionCount, height - 1)) : true  #  inside recursiveExtractHashes method
         * (Arrays.equals(right, left)) : true  #  inside recursiveExtractHashes method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byte[] byteArray = new byte[]{};
            byteUtils.when(() -> ByteUtils.checkBitLE(byteArray, 0)).thenReturn(true);
            List<Sha256Hash> sha256HashList = new ArrayList<>();
            PartialMerkleTree target = new PartialMerkleTree(1, sha256HashList, byteArray);
            thrown.expect(VerificationException.class);
            List<Sha256Hash> sha256HashList2 = new ArrayList<>();
            //Act Statement(s)
            target.getTxnHashAndMerkleRoot(sha256HashList2);
            //Assert statement(s)
            assertThat(sha256HashList2.size(), equalTo(0));
            byteUtils.verify(() -> ByteUtils.checkBitLE(byteArray, 0), atLeast(1));
        }
    }

    //Sapient generated method id: ${25d53595-cf1a-3e4e-8e7a-8d03b986c5c9}, hash: 48AB3D9162C22EFE0251482384B340FD
    @Test()
    public void getTxnHashAndMerkleRootWhenUsedBitsUsedPlus7DividedBy8NotEqualsMatchedChildBitsLengthThrowsVerificationException() throws VerificationException {
        /* Branches:
         * (transactionCount == 0) : false
         * (transactionCount > Block.MAX_BLOCK_SIZE / 60) : false
         * (hashes.size() > transactionCount) : false
         * (matchedChildBits.length * 8 < hashes.size()) : false
         * (getTreeWidth(transactionCount, height) > 1) : true
         * (used.bitsUsed >= matchedChildBits.length * 8) : false  #  inside recursiveExtractHashes method
         * (height == 0) : false  #  inside recursiveExtractHashes method
         * (!parentOfMatch) : false  #  inside recursiveExtractHashes method
         * (pos * 2 + 1 < getTreeWidth(transactionCount, height - 1)) : false  #  inside recursiveExtractHashes method
         * ((used.bitsUsed + 7) / 8 != matchedChildBits.length) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class, CALLS_REAL_METHODS);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            byteUtils.when(() -> ByteUtils.checkBitLE(byteArray, 0)).thenReturn(true);
            byte[] byteArray2 = new byte[]{(byte) 93, (byte) -10, (byte) -32, (byte) -30, (byte) 118, (byte) 19, (byte) 89, (byte) -45, (byte) 10, (byte) -126, (byte) 117, (byte) 5, (byte) -114, (byte) 41, (byte) -97, (byte) -52, (byte) 3, (byte) -127, (byte) 83, (byte) 69, (byte) 69, (byte) -11, (byte) 92, (byte) -12, (byte) 62, (byte) 65, (byte) -104, (byte) 63, (byte) 93, (byte) 76, (byte) -108, (byte) 86};
            sha256Hash.when(() -> Sha256Hash.wrapReversed(byteArray2)).thenReturn(sha256HashMock);
            List<Sha256Hash> sha256HashList = new ArrayList<>();
            PartialMerkleTree target = new PartialMerkleTree(1, sha256HashList, byteArray);
            thrown.expect(VerificationException.class);
            List<Sha256Hash> sha256HashList2 = new ArrayList<>();
            //Act Statement(s)
            target.getTxnHashAndMerkleRoot(sha256HashList2);
            //Assert statement(s)
            assertThat(sha256HashList2.size(), equalTo(0));
            byteUtils.verify(() -> ByteUtils.checkBitLE(byteArray, 0), atLeast(1));
            sha256Hash.verify(() -> Sha256Hash.wrapReversed(byteArray2), atLeast(1));
        }
    }

    //Sapient generated method id: ${a767dcc7-a112-3379-a778-9c05ed79cb24}, hash: 598C5C61A1EAAD0E0A55ACA22E095767
    @Test()
    public void getTxnHashAndMerkleRootWhenArraysNotEqualsRightLeftAndUsedBitsUsedPlus7DividedBy8NotEqualsMaThrowsVerificationException() throws VerificationException {
        /* Branches:
         * (transactionCount == 0) : false
         * (transactionCount > Block.MAX_BLOCK_SIZE / 60) : false
         * (hashes.size() > transactionCount) : false
         * (matchedChildBits.length * 8 < hashes.size()) : false
         * (getTreeWidth(transactionCount, height) > 1) : true
         * (used.bitsUsed >= matchedChildBits.length * 8) : false  #  inside recursiveExtractHashes method
         * (height == 0) : false  #  inside recursiveExtractHashes method
         * (!parentOfMatch) : false  #  inside recursiveExtractHashes method
         * (pos * 2 + 1 < getTreeWidth(transactionCount, height - 1)) : true  #  inside recursiveExtractHashes method
         * (Arrays.equals(right, left)) : false  #  inside recursiveExtractHashes method
         * ((used.bitsUsed + 7) / 8 != matchedChildBits.length) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byte[] byteArray = new byte[]{};
            byteUtils.when(() -> ByteUtils.checkBitLE(byteArray, 0)).thenReturn(false);
            byte[] byteArray2 = new byte[]{};
            byte[] byteArray3 = new byte[]{};
            byteUtils.when(() -> ByteUtils.reverseBytes(byteArray3)).thenReturn(byteArray2);
            byte[] byteArray4 = new byte[]{};
            byte[] byteArray5 = new byte[]{};
            byteUtils.when(() -> ByteUtils.reverseBytes(byteArray5)).thenReturn(byteArray4);
            byte[] byteArray6 = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.hashTwice(byteArray2, byteArray4)).thenReturn(byteArray6);
            sha256Hash.when(() -> Sha256Hash.wrapReversed(byteArray6)).thenReturn(sha256HashMock);
            List<Sha256Hash> sha256HashList = new ArrayList<>();
            PartialMerkleTree target = new PartialMerkleTree(0, sha256HashList, byteArray);
            thrown.expect(VerificationException.class);
            List<Sha256Hash> sha256HashList2 = new ArrayList<>();
            //Act Statement(s)
            target.getTxnHashAndMerkleRoot(sha256HashList2);
            //Assert statement(s)
            assertThat(sha256HashList2.size(), equalTo(0));
            byteUtils.verify(() -> ByteUtils.checkBitLE(byteArray, 0), atLeast(1));
            byteUtils.verify(() -> ByteUtils.reverseBytes(byteArray3), atLeast(1));
            byteUtils.verify(() -> ByteUtils.reverseBytes(byteArray5), atLeast(1));
            sha256Hash.verify(() -> Sha256Hash.hashTwice(byteArray2, byteArray4), atLeast(1));
            sha256Hash.verify(() -> Sha256Hash.wrapReversed(byteArray6), atLeast(1));
        }
    }

    //Sapient generated method id: ${23427d43-9a70-3ccf-b5d0-d6ec7915e143}, hash: B0BF2BBE7C33932042E3419B38B40F5F
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
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            byteUtils.when(() -> ByteUtils.checkBitLE(byteArray, 0)).thenReturn(true);
            List<Sha256Hash> sha256HashList = new ArrayList<>();
            sha256HashList.add(sha256HashMock);
            PartialMerkleTree target = new PartialMerkleTree(1, sha256HashList, byteArray);
            List<Sha256Hash> sha256HashList2 = new ArrayList<>();
            //Act Statement(s)
            Sha256Hash result = target.getTxnHashAndMerkleRoot(sha256HashList2);
            //Assert statement(s)
            assertThat(result, equalTo(sha256HashMock));
            assertThat(sha256HashList2.size(), equalTo(1));
            assertThat(sha256HashList2.get(0), is(instanceOf(Sha256Hash.class)));
            byteUtils.verify(() -> ByteUtils.checkBitLE(byteArray, 0), atLeast(1));
        }
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: 99456C886EB8ADDB3128F3D3DE254F14
    @Test()
    public void toStringTest() {
        //Arrange Statement(s)
        List<Sha256Hash> sha256HashList = new ArrayList<>();
        byte[] byteArray = new byte[]{};
        PartialMerkleTree target = new PartialMerkleTree(8, sha256HashList, byteArray);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("PartialMerkleTree{transactionCount=8, matchedChildBits=[], hashes=[]}"));
    }
}
