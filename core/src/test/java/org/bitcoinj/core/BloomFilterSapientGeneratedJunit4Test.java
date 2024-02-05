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
import org.bitcoinj.base.internal.Preconditions;

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
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Buffers> buffers = mockStatic(Buffers.class)) {
    byte[] byteArray = new byte[] {};
    buffers.when(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any())).thenReturn(byteArray);
    thrown.expect(ProtocolException.class);
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    //Act Statement(s)
    BloomFilter.read(byteBuffer);
    //Assert statement(s)
    buffers.verify(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any()));
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
        //Arrange Statement(s)
        //BloomFilter target = new BloomFilter(1000, Double.parseDouble("0.01"), 12345, BloomFilter.BloomUpdate.UPDATE_ALL);
        //Act Statement(s)
        //double result = target.getFalsePositiveRate(1000);
        //Assert statement(s)
        //assertThat(result, closeTo(Double.parseDouble("0.008436209268438534"), 0.00001));
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}
    @Ignore()
    @Test()
    public void toStringTest() {
        //Arrange Statement(s)
        BloomFilter target = spy(new BloomFilter(1000, Double.parseDouble("0.01"), 12345, BloomFilter.BloomUpdate.UPDATE_ALL));
        doReturn(BloomFilter.BloomUpdate.UPDATE_P2PUBKEY_ONLY).when(target).getUpdateFlag();
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("BloomFilter{data length=1151, hashFuncs=6, nFlags=UPDATE_P2PUBKEY_ONLY}"));
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
    varInt.when(() -> VarInt.of(115L)).thenReturn(varIntMock);
    byte[] byteArray = new byte[] { (byte) 0 };
    doReturn(byteArray).when(varIntMock).serialize();
    byteUtils.when(() -> ByteUtils.writeInt32LE(eq(6L), (OutputStream) any())).thenAnswer((Answer<Void>) invocation -> null);
    byteUtils.when(() -> ByteUtils.writeInt32LE(eq(1234), (OutputStream) any())).thenAnswer((Answer<Void>) invocation -> null);
    BloomFilter target = new BloomFilter(100, Double.parseDouble("0.01"), 1234, BloomFilter.BloomUpdate.UPDATE_ALL);
    OutputStream outputStream = OutputStream.nullOutputStream();
    //Act Statement(s)
    target.bitcoinSerializeToStream(outputStream);
    //Assert statement(s)
    varInt.verify(() -> VarInt.of(115L), atLeast(1));
    verify(varIntMock).serialize();
    byteUtils.verify(() -> ByteUtils.writeInt32LE(eq(6L), (OutputStream) any()));
    byteUtils.verify(() -> ByteUtils.writeInt32LE(eq(1234), (OutputStream) any()));
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
            byte[] byteArray2 = new byte[]{};
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
         */
        //Arrange Statement(s)
        /*try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
    MockedStatic<BloomFilter> bloomFilter = mockStatic(BloomFilter.class)) {
    byte[] byteArray = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
    byte[] byteArray2 = new byte[] { (byte) 0 };
    bloomFilter.when(() -> BloomFilter.murmurHash3(byteArray, 12345L, 0, byteArray2)).thenReturn(0);
    byteUtils.when(() -> ByteUtils.checkBitLE(byteArray, 0)).thenReturn(true);
    bloomFilter.when(() -> BloomFilter.murmurHash3(byteArray, 12345L, 1, byteArray2)).thenReturn(1);
    byteUtils.when(() -> ByteUtils.checkBitLE(byteArray, 1)).thenReturn(false);
    BloomFilter target = new BloomFilter(1000, Double.parseDouble("0.01"), 12345, BloomFilter.BloomUpdate.UPDATE_ALL);
    //Act Statement(s)
    boolean result = target.contains(byteArray2);
    //Assert statement(s)
    assertThat(result, equalTo(Boolean.FALSE));
    bloomFilter.verify(() -> BloomFilter.murmurHash3(byteArray, 12345L, 0, byteArray2), atLeast(1));
    byteUtils.verify(() -> ByteUtils.checkBitLE(byteArray, 0), atLeast(1));
    bloomFilter.verify(() -> BloomFilter.murmurHash3(byteArray, 12345L, 1, byteArray2), atLeast(1));
    byteUtils.verify(() -> ByteUtils.checkBitLE(byteArray, 1), atLeast(1));
}*/
    }

    //Sapient generated method id: ${66a624f5-ecc0-3991-9904-a60485827aa5}
    @Test()
    public void insertWhenILessThanHashFuncs() {
        /* Branches:
         * (i < hashFuncs) : true
         */
        //Arrange Statement(s)
        /*try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
    MockedStatic<BloomFilter> bloomFilter = mockStatic(BloomFilter.class)) {
    byte[] byteArray = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
    byte[] byteArray2 = new byte[] { (byte) 1, (byte) 2, (byte) 3 };
    bloomFilter.when(() -> BloomFilter.murmurHash3(byteArray, 123L, 0, byteArray2)).thenReturn(1);
    byteUtils.when(() -> ByteUtils.setBitLE(byteArray, 1)).thenAnswer((Answer<Void>) invocation -> null);
    bloomFilter.when(() -> BloomFilter.murmurHash3(byteArray, 123L, 1, byteArray2)).thenReturn(1);
    bloomFilter.when(() -> BloomFilter.murmurHash3(byteArray, 123L, 2, byteArray2)).thenReturn(1);
    bloomFilter.when(() -> BloomFilter.murmurHash3(byteArray, 123L, 3, byteArray2)).thenReturn(1);
    bloomFilter.when(() -> BloomFilter.murmurHash3(byteArray, 123L, 4, byteArray2)).thenReturn(1);
    bloomFilter.when(() -> BloomFilter.murmurHash3(byteArray, 123L, 5, byteArray2)).thenReturn(1);
    BloomFilter target = new BloomFilter(100, Double.parseDouble("0.01"), 123, BloomFilter.BloomUpdate.UPDATE_ALL);
    //Act Statement(s)
    target.insert(byteArray2);
    //Assert statement(s)
    bloomFilter.verify(() -> BloomFilter.murmurHash3(byteArray, 123L, 0, byteArray2), atLeast(1));
    byteUtils.verify(() -> ByteUtils.setBitLE(byteArray, 1), atLeast(6));
    bloomFilter.verify(() -> BloomFilter.murmurHash3(byteArray, 123L, 1, byteArray2), atLeast(1));
    bloomFilter.verify(() -> BloomFilter.murmurHash3(byteArray, 123L, 2, byteArray2), atLeast(1));
    bloomFilter.verify(() -> BloomFilter.murmurHash3(byteArray, 123L, 3, byteArray2), atLeast(1));
    bloomFilter.verify(() -> BloomFilter.murmurHash3(byteArray, 123L, 4, byteArray2), atLeast(1));
    bloomFilter.verify(() -> BloomFilter.murmurHash3(byteArray, 123L, 5, byteArray2), atLeast(1));
}*/
    }

    //Sapient generated method id: ${61bf4c20-f004-3085-ae9b-51b371f7b521}
    @Ignore()
    @Test()
    public void insert1Test() {
        //Arrange Statement(s)
        //ECKey keyMock = mock(ECKey.class, "<byte[] value>");
        //byte[] byteArray = new byte[] {};
        //doReturn(byteArray).when(keyMock).getPubKey();
        //byte[] byteArray2 = new byte[] {};
        //doReturn(byteArray2).when(keyMock).getPubKeyHash();
        //BloomFilter target = spy(new BloomFilter(1000, Double.parseDouble("0.01"), 12345, BloomFilter.BloomUpdate.UPDATE_ALL));
        //doNothing().when(target).insert(byteArray);
        //doNothing().when(target).insert(byteArray2);
        //Act Statement(s)
        //target.insert(keyMock);
        //Assert statement(s)
        //verify(keyMock).getPubKey();
        //verify(keyMock).getPubKeyHash();
        //verify(target).insert(byteArray);
        //verify(target).insert(byteArray2);
    }

    //Sapient generated method id: ${52d7c7e4-da26-323e-9e0d-9c512b4329f2}
    @Ignore()
    @Test()
    public void insert2Test() {
        //Arrange Statement(s)
        BloomFilter target = spy(new BloomFilter(100, Double.parseDouble("0.01"), 12345, BloomFilter.BloomUpdate.UPDATE_ALL));
        byte[] byteArray = new byte[]{};
        doNothing().when(target).insert(byteArray);
        TransactionOutPoint transactionOutPoint = new TransactionOutPoint(0L, sha256HashMock);
        //Act Statement(s)
        target.insert(transactionOutPoint);
        //Assert statement(s)
        verify(target).insert(byteArray);
    }

    //Sapient generated method id: ${6c75f6d7-f407-3832-9c78-dfb18bca24b2}
    @Test()
    public void setMatchAllTest() {
        //Arrange Statement(s)
        BloomFilter target = new BloomFilter(100, Double.parseDouble("0.01"), 12345, BloomFilter.BloomUpdate.UPDATE_ALL);
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

    //Sapient generated method id: ${71bf90dc-775e-3a65-af10-2a62baad6a8c}
    @Ignore()
    @Test()
    public void mergeWhenFilterNTweakNotEqualsThisNTweakThrowsIllegalArgumentException() {
        /* Branches:
         * (!this.matchesAll()) : true
         * (!filter.matchesAll()) : true
         * (filter.data.length == this.data.length) : true
         * (filter.hashFuncs == this.hashFuncs) : true
         * (filter.nTweak == this.nTweak) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(filterMock).matchesAll();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(false)).thenThrow(illegalArgumentException);
            BloomFilter target = spy(new BloomFilter(0, Double.parseDouble("0.0"), 0, BloomFilter.BloomUpdate.UPDATE_NONE));
            doReturn(false).when(target).matchesAll();
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.merge(filterMock);
            //Assert statement(s)
            verify(filterMock).matchesAll();
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            verify(target).matchesAll();
        }
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
         */
        //Arrange Statement(s)
        BloomFilter target = new BloomFilter(100, Double.parseDouble("0.01"), 12345, BloomFilter.BloomUpdate.UPDATE_ALL);
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
        //BloomFilter target = new BloomFilter(0, Double.parseDouble("0.0"), 0, BloomFilter.BloomUpdate.UPDATE_NONE);
        //Act Statement(s)
        //BloomFilter.BloomUpdate result = target.getUpdateFlag();
        //Assert statement(s)
        //assertThat(result, equalTo(BloomFilter.BloomUpdate.UPDATE_NONE));
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
        //BloomFilter target = new BloomFilter(0, Double.parseDouble("0.0"), 0, BloomFilter.BloomUpdate.UPDATE_NONE);
        //Act Statement(s)
        //BloomFilter.BloomUpdate result = target.getUpdateFlag();
        //Assert statement(s)
        //assertThat(result, equalTo(BloomFilter.BloomUpdate.UPDATE_ALL));
    }

    //Sapient generated method id: ${fd61bac2-b5a0-3f8e-bffd-2ada6cf4ad07}
    @Test()
    public void applyAndUpdateWhenMatchedIsNotEmpty() throws VerificationException {
        /* Branches:
         * (i < txns.size()) : true
         * (applyAndUpdate(tx)) : true
         * (for-each(matched)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: filteredBlock
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        //Sha256Hash sha256HashMock3 = mock(Sha256Hash.class);
        //Sha256Hash sha256HashMock4 = mock(Sha256Hash.class);
        /*try (MockedStatic<PartialMerkleTree> partialMerkleTree = mockStatic(PartialMerkleTree.class)) {
    List list = new ArrayList<>();
    byte[] byteArray = new byte[] {};
    PartialMerkleTree partialMerkleTree2 = new PartialMerkleTree(0, list, byteArray);
    byte[] byteArray2 = new byte[] { (byte) 1 };
    partialMerkleTree.when(() -> PartialMerkleTree.buildFromLeaves(eq(byteArray2), anyList())).thenReturn(partialMerkleTree2);
    BloomFilter target = spy(new BloomFilter(0, Double.parseDouble("0.0"), 0, BloomFilter.BloomUpdate.UPDATE_NONE));
    Transaction transaction = new Transaction();
    doReturn(false).when(target).applyAndUpdate(transaction);
    Instant instant = Instant.now();
    List list2 = new ArrayList<>();
    Block block = new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, list2);
    //Act Statement(s)
    FilteredBlock result = target.applyAndUpdate(block);
    Instant instant2 = Instant.now();
    List list3 = new ArrayList<>();
    Block block2 = new Block(0L, sha256HashMock3, sha256HashMock4, instant2, 0L, 0L, list3);
    FilteredBlock filteredBlock = new FilteredBlock(block2, partialMerkleTree2);
    //Assert statement(s)
    assertThat(result, equalTo(filteredBlock));
    partialMerkleTree.verify(() -> PartialMerkleTree.buildFromLeaves(eq(byteArray2), anyList()));
    verify(target).applyAndUpdate(transaction);
}*/
    }

    //Sapient generated method id: ${6c07e1c1-c7b0-3022-8601-5eafa4aa086b}
    @Ignore()
    @Test()
    public void applyAndUpdate1WhenContainsTxGetTxIdGetBytes() {
        /* Branches:
         * (contains(tx.getTxId().getBytes())) : true
         */
        //Arrange Statement(s)
        //BloomFilter target = spy(new BloomFilter(100, Double.parseDouble("0.01"), 12345, BloomFilter.BloomUpdate.UPDATE_ALL));
        //byte[] byteArray = new byte[] {};
        //doReturn(true).when(target).contains(byteArray);
        //Transaction transaction = new Transaction();
        //Act Statement(s)
        //boolean result = target.applyAndUpdate(transaction);
        //Assert statement(s)
        //assertThat(result, equalTo(Boolean.TRUE));
        //verify(target).contains(byteArray);
    }

    //Sapient generated method id: ${ce271f5c-d8f2-361d-96ca-3e31cdae8907}
    @Test()
    public void applyAndUpdate1WhenNotFoundAndTxGetInputsIsNotEmptyAndContainsInputGetOutpointSerialize() throws ScriptException {
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

    //Sapient generated method id: ${3723cafd-b3f7-304b-ab21-6f31f2974836}
    @Test()
    public void applyAndUpdate1WhenInputGetScriptSigChunksIsNotEmptyAndChunkIsPushDataAndContainsChunkData() throws ScriptException {
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
        //doReturn(false).when(target).contains((byte[]) null);
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
        //verify(target).contains((byte[]) null);
    }

    //Sapient generated method id: ${813f340a-a3ad-3976-8bb8-7b8a3dc4c82d}
    @Test()
    public void applyAndUpdate1WhenIsSendingToPubKeysAndFound() throws ScriptException {
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
        //TransactionOutPoint transactionOutPointMock = mock(TransactionOutPoint.class);
        /*try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
    doReturn(sha256HashMock).when(txMock).getTxId();
    byte[] byteArray = new byte[] {};
    doReturn(byteArray).when(sha256HashMock).getBytes();
    List<TransactionOutput> transactionOutputList = new ArrayList<>();
    doReturn(transactionOutputList).when(txMock).getOutputs();
    scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
    List<ScriptChunk> scriptChunkList = new ArrayList<>();
    doReturn(scriptChunkList).when(scriptMock).chunks();
    scriptPattern.when(() -> ScriptPattern.isSentToMultisig(scriptMock)).thenReturn(false);
    BloomFilter target = spy(new BloomFilter(0, Double.parseDouble("0.0"), 0, BloomFilter.BloomUpdate.UPDATE_NONE));
    doReturn(false).when(target).contains(byteArray);
    doReturn(BloomFilter.BloomUpdate.UPDATE_NONE).when(target).getUpdateFlag();
    doReturn(false).when(target).contains((byte[]) null);
    doNothing().when(target).insert(transactionOutPointMock);
    //Act Statement(s)
    boolean result = target.applyAndUpdate(txMock);
    //Assert statement(s)
    assertThat(result, equalTo(Boolean.TRUE));
    verify(txMock).getTxId();
    verify(sha256HashMock).getBytes();
    verify(txMock).getOutputs();
    scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
    verify(scriptMock).chunks();
    scriptPattern.verify(() -> ScriptPattern.isSentToMultisig(scriptMock), atLeast(1));
    verify(target).contains(byteArray);
    verify(target).getUpdateFlag();
    verify(target).contains((byte[]) null);
    verify(target).insert(transactionOutPointMock);
}*/
    }

    //Sapient generated method id: ${72cf3893-256c-3386-ad1d-8ea066eb93e9}
    @Test()
    public void applyAndUpdate1WhenNotIsSendingToPubKeysAndFound() throws ScriptException {
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
        /*try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
    doReturn(sha256HashMock).when(txMock).getTxId();
    byte[] byteArray = new byte[] {};
    doReturn(byteArray).when(sha256HashMock).getBytes();
    List<TransactionOutput> transactionOutputList = new ArrayList<>();
    doReturn(transactionOutputList).when(txMock).getOutputs();
    scriptPattern.when(() -> ScriptPattern.isP2PK(scriptMock)).thenReturn(false);
    List<ScriptChunk> scriptChunkList = new ArrayList<>();
    doReturn(scriptChunkList).when(scriptMock).chunks();
    scriptPattern.when(() -> ScriptPattern.isSentToMultisig(scriptMock)).thenReturn(false);
    BloomFilter target = spy(new BloomFilter(0, Double.parseDouble("0.0"), 0, BloomFilter.BloomUpdate.UPDATE_NONE));
    doReturn(false).when(target).contains(byteArray);
    doReturn(BloomFilter.BloomUpdate.UPDATE_NONE).when(target).getUpdateFlag();
    doReturn(false).when(target).contains((byte[]) null);
    //Act Statement(s)
    boolean result = target.applyAndUpdate(txMock);
    //Assert statement(s)
    assertThat(result, equalTo(Boolean.TRUE));
    verify(txMock).getTxId();
    verify(sha256HashMock).getBytes();
    verify(txMock).getOutputs();
    scriptPattern.verify(() -> ScriptPattern.isP2PK(scriptMock), atLeast(1));
    verify(scriptMock).chunks();
    scriptPattern.verify(() -> ScriptPattern.isSentToMultisig(scriptMock), atLeast(1));
    verify(target).contains(byteArray);
    verify(target).getUpdateFlag();
    verify(target).contains((byte[]) null);
}*/
    }

    //Sapient generated method id: ${af2d87aa-8f70-31f5-a842-5790801f56a5}
    @Ignore()
    @Test()
    public void applyAndUpdate1WhenInputGetScriptSigChunksIsNotEmptyAndChunkIsPushDataAndContainsNotChunkData2() throws ScriptException {
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
        byte[] byteArray3 = new byte[]{};
        doReturn(false).when(target).contains(byteArray3);
        doReturn(false).when(target).contains((byte[]) null);
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
        verify(target).contains(byteArray2);
        verify(target).contains(byteArray3);
        verify(target).contains((byte[]) null);
    }
}
