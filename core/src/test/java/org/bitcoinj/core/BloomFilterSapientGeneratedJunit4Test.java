package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.nio.BufferUnderflowException;
import java.io.IOException;

import org.bitcoinj.script.ScriptException;
import org.junit.rules.ExpectedException;

import java.util.List;

import org.bitcoinj.script.ScriptChunk;
import org.bitcoinj.crypto.ECKey;
import org.bitcoinj.base.VarInt;
import org.bitcoinj.script.ScriptPattern;
import org.bitcoinj.base.internal.ByteUtils;

import java.util.ArrayList;

import org.bitcoinj.script.Script;
import org.mockito.stubbing.Answer;

import java.nio.ByteBuffer;
import java.io.OutputStream;

import org.bitcoinj.base.Sha256Hash;
import org.mockito.MockedStatic;
import org.bitcoinj.base.internal.Buffers;

import java.time.Instant;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.anyList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.closeTo;

import org.junit.Ignore;

public class BloomFilterSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final BloomFilter filterMock = mock(BloomFilter.class);

    private final ScriptChunk scriptChunkMock = mock(ScriptChunk.class);

    private final Script scriptMock = mock(Script.class);

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    private final TransactionOutput transactionOutputMock = mock(TransactionOutput.class);

    private final TransactionOutput transactionOutputMock2 = mock(TransactionOutput.class);

    private final TransactionOutput transactionOutputMock3 = mock(TransactionOutput.class);

    private final Transaction txMock = mock(Transaction.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${bddfa077-0a3a-3ca0-a934-e3589dff1897}
    @Test()
    public void readWhenDataLengthGreaterThanMAX_FILTER_SIZEThrowsProtocolException() throws BufferUnderflowException, ProtocolException {
        /* Branches:
         * (data.length > MAX_FILTER_SIZE) : true
         */
        //Arrange Statement(s)
        /*try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
    MockedStatic<Buffers> buffers = mockStatic(Buffers.class)) {
    byte[] byteArray = new byte[] {};
    buffers.when(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any())).thenReturn(byteArray);
    byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(51L);
    thrown.expect(ProtocolException.class);
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    //Act Statement(s)
    BloomFilter.read(byteBuffer);
    //Assert statement(s)
    buffers.verify(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any()));
    byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()));
}*/
    }

    //Sapient generated method id: ${7e4b1b24-0bf8-3763-9516-08a0e44e0181}
    @Test()
    public void readWhenHashFuncsGreaterThanMAX_HASH_FUNCSThrowsProtocolException() throws BufferUnderflowException, ProtocolException {
        /* Branches:
         * (data.length > MAX_FILTER_SIZE) : false
         * (hashFuncs > MAX_HASH_FUNCS) : true
         */
        //Arrange Statement(s)
        /*try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
    MockedStatic<Buffers> buffers = mockStatic(Buffers.class)) {
    byte[] byteArray = new byte[] { (byte) 0 };
    buffers.when(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any())).thenReturn(byteArray);
    byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(51L);
    thrown.expect(ProtocolException.class);
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    //Act Statement(s)
    BloomFilter.read(byteBuffer);
    //Assert statement(s)
    buffers.verify(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any()));
    byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()));
}*/
    }

    //Sapient generated method id: ${ffcb9ff3-e459-3d14-911d-34712252fd02}
    @Test()
    public void readWhenHashFuncsNotGreaterThanMAX_HASH_FUNCS() throws BufferUnderflowException, ProtocolException {
        /* Branches:
         * (data.length > MAX_FILTER_SIZE) : false
         * (hashFuncs > MAX_HASH_FUNCS) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
    MockedStatic<Buffers> buffers = mockStatic(Buffers.class)) {
    byte[] byteArray = new byte[] { (byte) 0 };
    buffers.when(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any())).thenReturn(byteArray);
    byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(0L);
    byteUtils.when(() -> ByteUtils.readInt32((ByteBuffer) any())).thenReturn(0);
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    //Act Statement(s)
    BloomFilter result = BloomFilter.read(byteBuffer);
    //Assert statement(s)
    assertThat(result, is(notNullValue()));
    buffers.verify(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any()));
    byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()));
    byteUtils.verify(() -> ByteUtils.readInt32((ByteBuffer) any()));
}*/
    }

    //Sapient generated method id: ${8beff290-1967-3d70-8eb2-25eb26e5d406}
    @Test()
    public void getFalsePositiveRateTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //BloomFilter target = new BloomFilter(0, Double.parseDouble("0.0"), 0, BloomFilter.BloomUpdate.UPDATE_NONE);
        //Act Statement(s)
        //double result = target.getFalsePositiveRate(0);
        //Assert statement(s)
        //assertThat(result, closeTo(Double.parseDouble("0.0"), 0.00001));
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}
    @Ignore()
    @Test()
    public void toStringTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BloomFilter target = spy(new BloomFilter(0, Double.parseDouble("0.0"), 0, BloomFilter.BloomUpdate.UPDATE_NONE));
        doReturn(BloomFilter.BloomUpdate.UPDATE_NONE).when(target).getUpdateFlag();
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("result1"));
        verify(target).getUpdateFlag();
    }

    //Sapient generated method id: ${db734794-4476-3b9d-94dd-477a1a1aec91}
    @Test()
    public void bitcoinSerializeToStreamTest() throws IOException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //VarInt varIntMock = mock(VarInt.class);
        /*try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
    MockedStatic<VarInt> varInt = mockStatic(VarInt.class)) {
    varInt.when(() -> VarInt.of(0L)).thenReturn(varIntMock);
    byte[] byteArray = new byte[] {};
    doReturn(byteArray).when(varIntMock).serialize();
    byteUtils.when(() -> ByteUtils.writeInt32LE(eq(0L), (OutputStream) any())).thenAnswer((Answer<Void>) invocation -> null);
    byteUtils.when(() -> ByteUtils.writeInt32LE(eq(0), (OutputStream) any())).thenAnswer((Answer<Void>) invocation -> null);
    BloomFilter target = new BloomFilter(0, Double.parseDouble("0.0"), 0, BloomFilter.BloomUpdate.UPDATE_NONE);
    OutputStream outputStream = OutputStream.nullOutputStream();
    //Act Statement(s)
    target.bitcoinSerializeToStream(outputStream);
    //Assert statement(s)
    varInt.verify(() -> VarInt.of(0L), atLeast(1));
    verify(varIntMock).serialize();
    byteUtils.verify(() -> ByteUtils.writeInt32LE(eq(0L), (OutputStream) any()));
    byteUtils.verify(() -> ByteUtils.writeInt32LE(eq(0), (OutputStream) any()));
}*/
    }

    //Sapient generated method id: ${a8e3eef8-e76d-390e-afb6-94b6b4bf5ba4}
    @Ignore()
    @Test()
    public void murmurHash3WhenSwitchObjectLengthAnd3Case1() {
        /* Branches:
         * (i < numBlocks) : true
         * (switch(object.length & 3) = 1) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6};
        //Act Statement(s)
        int result = BloomFilter.murmurHash3(byteArray, -1L, 0, byteArray2);
        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${19e96409-cbbe-3953-a17c-3d04afaf1b89}
    @Ignore()
    @Test()
    public void containsWhenByteUtilsNotCheckBitLEDataMurmurHash3DataNTweakIObject() {
        /* Branches:
         * (i < hashFuncs) : true
         * (!ByteUtils.checkBitLE(data, murmurHash3(data, nTweak, i, object))) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<BloomFilter> bloomFilter = mockStatic(BloomFilter.class)) {
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{(byte) 0};
            bloomFilter.when(() -> BloomFilter.murmurHash3(byteArray, 0L, 0, byteArray2)).thenReturn(0);
            byteUtils.when(() -> ByteUtils.checkBitLE(byteArray, 0)).thenReturn(false);
            BloomFilter target = new BloomFilter(0, Double.parseDouble("0.0"), 0, BloomFilter.BloomUpdate.UPDATE_NONE);
            //Act Statement(s)
            boolean result = target.contains(byteArray2);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            bloomFilter.verify(() -> BloomFilter.murmurHash3(byteArray, 0L, 0, byteArray2), atLeast(1));
            byteUtils.verify(() -> ByteUtils.checkBitLE(byteArray, 0), atLeast(1));
        }
    }

    //Sapient generated method id: ${fbee803c-35b9-3ee1-9a32-195911c1d7e1}
    @Test()
    public void containsWhenByteUtilsCheckBitLEDataMurmurHash3DataNTweakIObject() {
        /* Branches:
         * (i < hashFuncs) : true
         * (!ByteUtils.checkBitLE(data, murmurHash3(data, nTweak, i, object))) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
    MockedStatic<BloomFilter> bloomFilter = mockStatic(BloomFilter.class)) {
    byte[] byteArray = new byte[] {};
    byte[] byteArray2 = new byte[] { (byte) 0 };
    bloomFilter.when(() -> BloomFilter.murmurHash3(byteArray, 0L, 0, byteArray2)).thenReturn(0);
    byteUtils.when(() -> ByteUtils.checkBitLE(byteArray, 0)).thenReturn(false);
    BloomFilter target = new BloomFilter(0, Double.parseDouble("0.0"), 0, BloomFilter.BloomUpdate.UPDATE_NONE);
    //Act Statement(s)
    boolean result = target.contains(byteArray2);
    //Assert statement(s)
    assertThat(result, equalTo(Boolean.FALSE));
    bloomFilter.verify(() -> BloomFilter.murmurHash3(byteArray, 0L, 0, byteArray2), atLeast(1));
    byteUtils.verify(() -> ByteUtils.checkBitLE(byteArray, 0), atLeast(1));
}*/
    }

    //Sapient generated method id: ${66a624f5-ecc0-3991-9904-a60485827aa5}
    @Test()
    public void insertWhenILessThanHashFuncs() {
        /* Branches:
         * (i < hashFuncs) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
    MockedStatic<BloomFilter> bloomFilter = mockStatic(BloomFilter.class)) {
    byte[] byteArray = new byte[] {};
    byte[] byteArray2 = new byte[] { (byte) 0 };
    bloomFilter.when(() -> BloomFilter.murmurHash3(byteArray, 0L, 0, byteArray2)).thenReturn(0);
    byteUtils.when(() -> ByteUtils.setBitLE(byteArray, 0)).thenAnswer((Answer<Void>) invocation -> null);
    BloomFilter target = new BloomFilter(0, Double.parseDouble("0.0"), 0, BloomFilter.BloomUpdate.UPDATE_NONE);
    //Act Statement(s)
    target.insert(byteArray2);
    //Assert statement(s)
    bloomFilter.verify(() -> BloomFilter.murmurHash3(byteArray, 0L, 0, byteArray2), atLeast(1));
    byteUtils.verify(() -> ByteUtils.setBitLE(byteArray, 0), atLeast(1));
}*/
    }

    //Sapient generated method id: ${61bf4c20-f004-3085-ae9b-51b371f7b521}
    @Ignore()
    @Test()
    public void insert1Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ECKey keyMock = mock(ECKey.class);
        byte[] byteArray = new byte[]{};
        doReturn(byteArray).when(keyMock).getPubKey();
        byte[] byteArray2 = new byte[]{};
        doReturn(byteArray2).when(keyMock).getPubKeyHash();
        BloomFilter target = spy(new BloomFilter(0, Double.parseDouble("0.0"), 0, BloomFilter.BloomUpdate.UPDATE_NONE));
        doNothing().when(target).insert(byteArray);
        doNothing().when(target).insert(byteArray2);
        //Act Statement(s)
        target.insert(keyMock);
        //Assert statement(s)
        verify(keyMock).getPubKey();
        verify(keyMock).getPubKeyHash();
        verify(target).insert(byteArray);
        verify(target).insert(byteArray2);
    }

    //Sapient generated method id: ${52d7c7e4-da26-323e-9e0d-9c512b4329f2}
    @Test()
    public void insert2Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TransactionOutPoint outpointMock = mock(TransactionOutPoint.class);
        byte[] byteArray = new byte[]{};
        doReturn(byteArray).when(outpointMock).serialize();
        BloomFilter target = spy(new BloomFilter(0, Double.parseDouble("0.0"), 0, BloomFilter.BloomUpdate.UPDATE_NONE));
        doNothing().when(target).insert(byteArray);
        //Act Statement(s)
        target.insert(outpointMock);
        //Assert statement(s)
        verify(outpointMock).serialize();
        verify(target).insert(byteArray);
    }

    //Sapient generated method id: ${6c75f6d7-f407-3832-9c78-dfb18bca24b2}
    @Test()
    public void setMatchAllTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BloomFilter target = new BloomFilter(0, Double.parseDouble("0.0"), 0, BloomFilter.BloomUpdate.UPDATE_NONE);
        //Act Statement(s)
        target.setMatchAll();
    }

    //Sapient generated method id: ${ec5909fb-ee38-3a7a-8676-2dbaa026d153}
    @Ignore()
    @Test()
    public void mergeWhenFilterMatchesAll() {
        /* Branches:
         * (!this.matchesAll()) : true
         * (!filter.matchesAll()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(false).when(filterMock).matchesAll();
        BloomFilter target = spy(new BloomFilter(0, Double.parseDouble("0.0"), 0, BloomFilter.BloomUpdate.UPDATE_NONE));
        doReturn(false).when(target).matchesAll();
        //Act Statement(s)
        target.merge(filterMock);
        //Assert statement(s)
        verify(filterMock).matchesAll();
        verify(target).matchesAll();
    }

    //Sapient generated method id: ${8a3df2e4-b883-36cf-af3e-61b12af626fc}
    @Ignore()
    @Test()
    public void mergeWhenILessThanDataLength() {
        /* Branches:
         * (!this.matchesAll()) : true
         * (!filter.matchesAll()) : true
         * (filter.data.length == this.data.length) : true
         * (filter.hashFuncs == this.hashFuncs) : true
         * (filter.nTweak == this.nTweak) : true
         * (i < data.length) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(false).when(filterMock).matchesAll();
        BloomFilter target = spy(new BloomFilter(0, Double.parseDouble("0.0"), 0, BloomFilter.BloomUpdate.UPDATE_NONE));
        doReturn(false).when(target).matchesAll();
        //Act Statement(s)
        target.merge(filterMock);
        //Assert statement(s)
        verify(filterMock).matchesAll();
        verify(target).matchesAll();
    }

    //Sapient generated method id: ${9bb7d0ac-a32c-33c1-a032-3af33f14dfcd}
    @Ignore()
    @Test()
    public void mergeWhenFilterNTweakNotEqualsThisNTweakAndILessThanDataLength() {
        /* Branches:
         * (!this.matchesAll()) : true
         * (!filter.matchesAll()) : true
         * (filter.data.length == this.data.length) : true
         * (filter.hashFuncs == this.hashFuncs) : true
         * (filter.nTweak == this.nTweak) : false
         * (i < data.length) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(false).when(filterMock).matchesAll();
        BloomFilter target = spy(new BloomFilter(0, Double.parseDouble("0.0"), 0, BloomFilter.BloomUpdate.UPDATE_NONE));
        doReturn(false).when(target).matchesAll();
        //Act Statement(s)
        target.merge(filterMock);
        //Assert statement(s)
        verify(filterMock).matchesAll();
        verify(target).matchesAll();
    }

    //Sapient generated method id: ${0e23bcea-7d85-3ee6-9347-9cb117c6a368}
    @Ignore()
    @Test()
    public void matchesAllWhenDataIsEmpty() {
        /* Branches:
         * (for-each(data)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BloomFilter target = new BloomFilter(0, Double.parseDouble("0.0"), 0, BloomFilter.BloomUpdate.UPDATE_NONE);
        //Act Statement(s)
        boolean result = target.matchesAll();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${6c885b50-6ad6-3e9b-9553-2728684df18a}
    @Test()
    public void matchesAllWhenBNotEquals255() {
        /* Branches:
         * (for-each(data)) : true
         * (b != (byte) 0xff) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BloomFilter target = new BloomFilter(0, Double.parseDouble("0.0"), 0, BloomFilter.BloomUpdate.UPDATE_NONE);
        //Act Statement(s)
        boolean result = target.matchesAll();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${68c0bd97-1e7e-31ef-8680-f5f199997578}
    @Test()
    public void getUpdateFlagWhenNFlagsEquals0() {
        /* Branches:
         * (nFlags == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BloomFilter target = new BloomFilter(0, Double.parseDouble("0.0"), 0, BloomFilter.BloomUpdate.UPDATE_NONE);
        //Act Statement(s)
        BloomFilter.BloomUpdate result = target.getUpdateFlag();
        //Assert statement(s)
        assertThat(result, equalTo(BloomFilter.BloomUpdate.UPDATE_NONE));
    }

    //Sapient generated method id: ${0df49703-9d6a-389e-af9b-9402e61b02db}
    @Ignore()
    @Test()
    public void getUpdateFlagWhenNFlagsEquals1() {
        /* Branches:
         * (nFlags == 0) : false
         * (nFlags == 1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BloomFilter target = new BloomFilter(0, Double.parseDouble("0.0"), 0, BloomFilter.BloomUpdate.UPDATE_NONE);
        //Act Statement(s)
        BloomFilter.BloomUpdate result = target.getUpdateFlag();
        //Assert statement(s)
        assertThat(result, equalTo(BloomFilter.BloomUpdate.UPDATE_ALL));
    }

    //Sapient generated method id: ${fd61bac2-b5a0-3f8e-bffd-2ada6cf4ad07}
    @Test()
    public void applyAndUpdateWhenMatchedIsNotEmpty() {
        /* Branches:
         * (i < txns.size()) : true
         * (applyAndUpdate(tx)) : true
         * (for-each(matched)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Block blockMock = mock(Block.class);
        Block blockMock2 = mock(Block.class);
        PartialMerkleTree partialMerkleTreeMock = mock(PartialMerkleTree.class);
        try (MockedStatic<PartialMerkleTree> partialMerkleTree = mockStatic(PartialMerkleTree.class)) {
            List<Transaction> transactionList = new ArrayList<>();
            doReturn(transactionList).when(blockMock).getTransactions();
            doReturn(blockMock2).when(blockMock).cloneAsHeader();
            byte[] byteArray = new byte[]{};
            partialMerkleTree.when(() -> PartialMerkleTree.buildFromLeaves(eq(byteArray), anyList())).thenReturn(partialMerkleTreeMock);
            BloomFilter target = new BloomFilter(0, Double.parseDouble("0.0"), 0, BloomFilter.BloomUpdate.UPDATE_NONE);
            //Act Statement(s)
            FilteredBlock result = target.applyAndUpdate(blockMock);
            FilteredBlock filteredBlock = new FilteredBlock(blockMock2, partialMerkleTreeMock);
            //Assert statement(s)
            assertThat(result, equalTo(filteredBlock));
            verify(blockMock).getTransactions();
            verify(blockMock).cloneAsHeader();
            partialMerkleTree.verify(() -> PartialMerkleTree.buildFromLeaves(eq(byteArray), anyList()));
        }
    }

    //Sapient generated method id: ${6c07e1c1-c7b0-3022-8601-5eafa4aa086b}
    @Ignore()
    @Test()
    public void applyAndUpdate1WhenContainsTxGetTxIdGetBytes() {
        /* Branches:
         * (contains(tx.getTxId().getBytes())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(sha256HashMock).when(txMock).getTxId();
        byte[] byteArray = new byte[]{};
        doReturn(byteArray).when(sha256HashMock).getBytes();
        BloomFilter target = spy(new BloomFilter(0, Double.parseDouble("0.0"), 0, BloomFilter.BloomUpdate.UPDATE_NONE));
        doReturn(false).when(target).contains(byteArray);
        //Act Statement(s)
        boolean result = target.applyAndUpdate(txMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(txMock).getTxId();
        verify(sha256HashMock).getBytes();
        verify(target).contains(byteArray);
    }

    //Sapient generated method id: ${ce271f5c-d8f2-361d-96ca-3e31cdae8907}
    @Test()
    public void applyAndUpdate1WhenNotFoundAndTxGetInputsIsNotEmptyAndContainsInputGetOutpointSerialize() {
        /* Branches:
         * (contains(tx.getTxId().getBytes())) : false
         * (for-each(tx.getOutputs())) : true
         * (for-each(script.chunks())) : true
         * (!chunk.isPushData()) : true
         * (found) : false
         * (for-each(tx.getInputs())) : true
         * (contains(input.getOutpoint().serialize())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(sha256HashMock).when(txMock).getTxId();
        byte[] byteArray = new byte[]{};
        doReturn(byteArray).when(sha256HashMock).getBytes();
        List<TransactionOutput> transactionOutputList = new ArrayList<>();
        doReturn(transactionOutputList).when(txMock).getOutputs();
        List<ScriptChunk> scriptChunkList = new ArrayList<>();
        doReturn(scriptChunkList).when(txMock).getInputs();
        BloomFilter target = spy(new BloomFilter(0, Double.parseDouble("0.0"), 0, BloomFilter.BloomUpdate.UPDATE_NONE));
        doReturn(false).when(target).contains(byteArray);
        doReturn(BloomFilter.BloomUpdate.UPDATE_NONE).when(target).getUpdateFlag();
        //Act Statement(s)
        boolean result = target.applyAndUpdate(txMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(txMock).getTxId();
        verify(sha256HashMock).getBytes();
        verify(txMock).getOutputs();
        verify(txMock).getInputs();
        verify(target).contains(byteArray);
        verify(target).getUpdateFlag();
    }

    //Sapient generated method id: ${3723cafd-b3f7-304b-ab21-6f31f2974836}
    @Test()
    public void applyAndUpdate1WhenInputGetScriptSigChunksIsNotEmptyAndChunkIsPushDataAndContainsChunkData() {
        /* Branches:
         * (contains(tx.getTxId().getBytes())) : false
         * (for-each(tx.getOutputs())) : true
         * (for-each(script.chunks())) : true
         * (!chunk.isPushData()) : true
         * (found) : false
         * (for-each(tx.getInputs())) : true
         * (contains(input.getOutpoint().serialize())) : false
         * (for-each(input.getScriptSig().chunks())) : true
         * (chunk.isPushData()) : true
         * (contains(chunk.data)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //doReturn(sha256HashMock).when(txMock).getTxId();
        //byte[] byteArray = new byte[] {};
        //doReturn(byteArray).when(sha256HashMock).getBytes();
        //List<TransactionOutput> transactionOutputList = new ArrayList<>();
        //doReturn(transactionOutputList).when(txMock).getOutputs();
        //List<TransactionInput> transactionInputList = new ArrayList<>();
        //doReturn(transactionInputList).when(txMock).getInputs();
        //BloomFilter target = spy(new BloomFilter(0, Double.parseDouble("0.0"), 0, BloomFilter.BloomUpdate.UPDATE_NONE));
        //doReturn(false).when(target).contains(byteArray);
        //doReturn(BloomFilter.BloomUpdate.UPDATE_NONE).when(target).getUpdateFlag();
        //byte[] byteArray2 = new byte[] {};
        //doReturn(false).when(target).contains(byteArray2);
        //Act Statement(s)
        //boolean result = target.applyAndUpdate(txMock);
        //Assert statement(s)
        //assertThat(result, equalTo(Boolean.TRUE));
        //verify(txMock).getTxId();
        //verify(sha256HashMock).getBytes();
        //verify(txMock).getOutputs();
        //verify(txMock).getInputs();
        //verify(target).contains(byteArray);
        //verify(target).getUpdateFlag();
        //verify(target).contains(byteArray2);
    }

    //Sapient generated method id: ${813f340a-a3ad-3976-8bb8-7b8a3dc4c82d}
    @Test()
    public void applyAndUpdate1WhenIsSendingToPubKeysAndFound() {
        /* Branches:
         * (contains(tx.getTxId().getBytes())) : false
         * (for-each(tx.getOutputs())) : true
         * (for-each(script.chunks())) : true
         * (!chunk.isPushData()) : false
         * (contains(chunk.data)) : true
         * (ScriptPattern.isP2PK(script)) : false
         * (ScriptPattern.isSentToMultisig(script)) : true
         * (flag == BloomUpdate.UPDATE_ALL) : false
         * (flag == BloomUpdate.UPDATE_P2PUBKEY_ONLY) : true
         * (isSendingToPubKeys) : true
         * (found) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //doReturn(sha256HashMock).when(txMock).getTxId();
        //byte[] byteArray = new byte[] {};
        //doReturn(byteArray).when(sha256HashMock).getBytes();
        //List<TransactionOutput> transactionOutputList = new ArrayList<>();
        //doReturn(transactionOutputList).when(txMock).getOutputs();
        //List<ScriptChunk> scriptChunkList = new ArrayList<>();
        //doReturn(scriptChunkList).when(txMock).getInputs();
        //BloomFilter target = spy(new BloomFilter(0, Double.parseDouble("0.0"), 0, BloomFilter.BloomUpdate.UPDATE_NONE));
        //doReturn(false).when(target).contains(byteArray);
        //doReturn(BloomFilter.BloomUpdate.UPDATE_NONE).when(target).getUpdateFlag();
        //Act Statement(s)
        //boolean result = target.applyAndUpdate(txMock);
        //Assert statement(s)
        //assertThat(result, equalTo(Boolean.FALSE));
        //verify(txMock).getTxId();
        //verify(sha256HashMock).getBytes();
        //verify(txMock).getOutputs();
        //verify(txMock).getInputs();
        //verify(target).contains(byteArray);
        //verify(target).getUpdateFlag();
    }

    //Sapient generated method id: ${72cf3893-256c-3386-ad1d-8ea066eb93e9}
    @Test()
    public void applyAndUpdate1WhenNotIsSendingToPubKeysAndFound() {
        /* Branches:
         * (contains(tx.getTxId().getBytes())) : false
         * (for-each(tx.getOutputs())) : true
         * (for-each(script.chunks())) : true
         * (!chunk.isPushData()) : false
         * (contains(chunk.data)) : true
         * (ScriptPattern.isP2PK(script)) : false
         * (ScriptPattern.isSentToMultisig(script)) : false
         * (flag == BloomUpdate.UPDATE_ALL) : false
         * (flag == BloomUpdate.UPDATE_P2PUBKEY_ONLY) : true
         * (isSendingToPubKeys) : false
         * (found) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //doReturn(sha256HashMock).when(txMock).getTxId();
        //byte[] byteArray = new byte[] {};
        //doReturn(byteArray).when(sha256HashMock).getBytes();
        //List<TransactionOutput> transactionOutputList = new ArrayList<>();
        //doReturn(transactionOutputList).when(txMock).getOutputs();
        //List<ScriptChunk> scriptChunkList = new ArrayList<>();
        //doReturn(scriptChunkList).when(txMock).getInputs();
        //BloomFilter target = spy(new BloomFilter(0, Double.parseDouble("0.0"), 0, BloomFilter.BloomUpdate.UPDATE_NONE));
        //doReturn(false).when(target).contains(byteArray);
        //doReturn(BloomFilter.BloomUpdate.UPDATE_NONE).when(target).getUpdateFlag();
        //Act Statement(s)
        //boolean result = target.applyAndUpdate(txMock);
        //Assert statement(s)
        //assertThat(result, equalTo(Boolean.FALSE));
        //verify(txMock).getTxId();
        //verify(sha256HashMock).getBytes();
        //verify(txMock).getOutputs();
        //verify(txMock).getInputs();
        //verify(target).contains(byteArray);
        //verify(target).getUpdateFlag();
    }

    //Sapient generated method id: ${af2d87aa-8f70-31f5-a842-5790801f56a5}
    @Ignore()
    @Test()
    public void applyAndUpdate1WhenInputGetScriptSigChunksIsNotEmptyAndChunkIsPushDataAndContainsNotChunkData2() {
        /* Branches:
         * (contains(tx.getTxId().getBytes())) : false
         * (for-each(tx.getOutputs())) : true
         * (for-each(script.chunks())) : true
         * (!chunk.isPushData()) : false
         * (contains(chunk.data)) : false
         * (found) : false
         * (for-each(tx.getInputs())) : true
         * (contains(input.getOutpoint().serialize())) : false
         * (for-each(input.getScriptSig().chunks())) : true
         * (chunk.isPushData()) : true
         * (contains(chunk.data)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(sha256HashMock).when(txMock).getTxId();
        byte[] byteArray = new byte[]{};
        doReturn(byteArray).when(sha256HashMock).getBytes();
        List<TransactionOutput> transactionOutputList = new ArrayList<>();
        doReturn(transactionOutputList).when(txMock).getOutputs();
        List<TransactionInput> transactionInputList = new ArrayList<>();
        doReturn(transactionInputList).when(txMock).getInputs();
        BloomFilter target = spy(new BloomFilter(0, Double.parseDouble("0.0"), 0, BloomFilter.BloomUpdate.UPDATE_NONE));
        doReturn(false).when(target).contains(byteArray);
        doReturn(BloomFilter.BloomUpdate.UPDATE_NONE).when(target).getUpdateFlag();
        byte[] byteArray2 = new byte[]{};
        doReturn(false).when(target).contains(byteArray2);
        //Act Statement(s)
        boolean result = target.applyAndUpdate(txMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(txMock).getTxId();
        verify(sha256HashMock).getBytes();
        verify(txMock).getOutputs();
        verify(txMock).getInputs();
        verify(target).contains(byteArray);
        verify(target).getUpdateFlag();
        verify(target).contains(byteArray2);
    }
}
