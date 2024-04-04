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

    private final Script scriptMock = mock(Script.class);

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    private final Transaction txMock = mock(Transaction.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${bddfa077-0a3a-3ca0-a934-e3589dff1897}, hash: C1AB1D3990237B239A841E80A7443D18
    @Ignore()
    @Test()
    public void readWhenDataLengthGreaterThanMAX_FILTER_SIZEThrowsProtocolException() throws BufferUnderflowException, ProtocolException {
        /* Branches:
         * (data.length > MAX_FILTER_SIZE) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Buffers> buffers = mockStatic(Buffers.class)) {
            byte[] byteArray = new byte[]{};
            buffers.when(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any())).thenReturn(byteArray);
            thrown.expect(ProtocolException.class);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            BloomFilter.read(byteBuffer);
            //Assert statement(s)
            buffers.verify(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${7e4b1b24-0bf8-3763-9516-08a0e44e0181}, hash: B377EACBF685D7270A272A897D55233D
    @Test()
    public void readWhenHashFuncsGreaterThanMAX_HASH_FUNCSThrowsProtocolException() throws BufferUnderflowException, ProtocolException {
        /* Branches:
         * (data.length > MAX_FILTER_SIZE) : false
         * (hashFuncs > MAX_HASH_FUNCS) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Buffers> buffers = mockStatic(Buffers.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            buffers.when(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any())).thenReturn(byteArray);
            byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(51L);
            thrown.expect(ProtocolException.class);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            BloomFilter.read(byteBuffer);
            //Assert statement(s)
            buffers.verify(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any()));
            byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${ffcb9ff3-e459-3d14-911d-34712252fd02}, hash: 96A25DBE4F552F7363F5A12BE13F2326
    @Test()
    public void readWhenHashFuncsNotGreaterThanMAX_HASH_FUNCS() throws BufferUnderflowException, ProtocolException {
        /* Branches:
         * (data.length > MAX_FILTER_SIZE) : false
         * (hashFuncs > MAX_HASH_FUNCS) : false
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        //Act Statement(s)
        BloomFilter result = BloomFilter.read(byteBuffer);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${8beff290-1967-3d70-8eb2-25eb26e5d406}, hash: D2C1C6075E0E83C6ABE6401583C81E6B
    @Test()
    public void getFalsePositiveRateTest() {
        //Arrange Statement(s)
        BloomFilter target = new BloomFilter(100, Double.parseDouble("0.001"), 123456, BloomFilter.BloomUpdate.UPDATE_ALL);
        //Act Statement(s)
        double result = target.getFalsePositiveRate(100);
        //Assert statement(s)
        assertThat(result, closeTo(Double.parseDouble("0.0010484268752443283"), 0.00001));
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: 6398B036249F2EABA1D5BE62025D4295
    @Test()
    public void toStringTest() {
        //Arrange Statement(s)
        BloomFilter target = spy(new BloomFilter(100, Double.parseDouble("0.01"), 123456, BloomFilter.BloomUpdate.UPDATE_ALL));
        doReturn(BloomFilter.BloomUpdate.UPDATE_P2PUBKEY_ONLY).when(target).getUpdateFlag();
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("BloomFilter{data length=119, hashFuncs=6, nFlags=UPDATE_P2PUBKEY_ONLY}"));
        verify(target).getUpdateFlag();
    }

    //Sapient generated method id: ${db734794-4476-3b9d-94dd-477a1a1aec91}, hash: 944D99BF5317CFB85C0C38B379501397
    @Test()
    public void bitcoinSerializeToStreamTest() throws IOException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //VarInt varIntMock = mock(VarInt.class, "someVarInt");
        /*try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
    MockedStatic<VarInt> varInt = mockStatic(VarInt.class)) {
    varInt.when(() -> VarInt.of(119L)).thenReturn(varIntMock);
    byte[] byteArray = new byte[] { (byte) 0 };
    doReturn(byteArray).when(varIntMock).serialize();
    byteUtils.when(() -> ByteUtils.writeInt32LE(eq(6L), (OutputStream) any())).thenAnswer((Answer<Void>) invocation -> null);
    byteUtils.when(() -> ByteUtils.writeInt32LE(eq(12345), (OutputStream) any())).thenAnswer((Answer<Void>) invocation -> null);
    BloomFilter target = new BloomFilter(100, Double.parseDouble("0.01"), 12345, BloomFilter.BloomUpdate.UPDATE_ALL);
    OutputStream outputStream = OutputStream.nullOutputStream();
    //Act Statement(s)
    target.bitcoinSerializeToStream(outputStream);
    //Assert statement(s)
    varInt.verify(() -> VarInt.of(119L), atLeast(1));
    verify(varIntMock).serialize();
    byteUtils.verify(() -> ByteUtils.writeInt32LE(eq(6L), (OutputStream) any()));
    byteUtils.verify(() -> ByteUtils.writeInt32LE(eq(12345), (OutputStream) any()));
}*/
    }

    //Sapient generated method id: ${a8e3eef8-e76d-390e-afb6-94b6b4bf5ba4}, hash: B2B325FA8257B9C41103A966C22252DB
    @Test()
    public void murmurHash3WhenSwitchObjectLengthAnd3Case1() {
        /* Branches:
         * (i < numBlocks) : true
         * (switch(object.length & 3) = 1) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0};
        byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6};
        //Act Statement(s)
        int result = BloomFilter.murmurHash3(byteArray, 8443760424L, -2, byteArray2);
        //Assert statement(s)
        assertThat(result, equalTo(5));
    }

    //Sapient generated method id: ${19e96409-cbbe-3953-a17c-3d04afaf1b89}, hash: B809316C5B97875F2A9B8B1E2EE05E59
    @Test()
    public void containsWhenByteUtilsNotCheckBitLEDataMurmurHash3DataNTweakIObject() {
        /* Branches:
         * (i < hashFuncs) : true
         * (!ByteUtils.checkBitLE(data, murmurHash3(data, nTweak, i, object))) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<BloomFilter> bloomFilter = mockStatic(BloomFilter.class)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            byte[] byteArray2 = new byte[]{(byte) 0};
            bloomFilter.when(() -> BloomFilter.murmurHash3(byteArray, 12345L, 0, byteArray2)).thenReturn(0);
            byteUtils.when(() -> ByteUtils.checkBitLE(byteArray, 0)).thenReturn(false);
            BloomFilter target = new BloomFilter(100, Double.parseDouble("0.01"), 12345, BloomFilter.BloomUpdate.UPDATE_ALL);
            //Act Statement(s)
            boolean result = target.contains(byteArray2);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            bloomFilter.verify(() -> BloomFilter.murmurHash3(byteArray, 12345L, 0, byteArray2), atLeast(1));
            byteUtils.verify(() -> ByteUtils.checkBitLE(byteArray, 0), atLeast(1));
        }
    }

    //Sapient generated method id: ${fbee803c-35b9-3ee1-9a32-195911c1d7e1}, hash: 0A824704BB354B664BEAEA0198148016
    @Test()
    public void containsWhenByteUtilsCheckBitLEDataMurmurHash3DataNTweakIObject() {
        /* Branches:
         * (i < hashFuncs) : true
         * (!ByteUtils.checkBitLE(data, murmurHash3(data, nTweak, i, object))) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<BloomFilter> bloomFilter = mockStatic(BloomFilter.class)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            byte[] byteArray2 = new byte[]{(byte) 0};
            bloomFilter.when(() -> BloomFilter.murmurHash3(byteArray, 123L, 0, byteArray2)).thenReturn(0);
            byteUtils.when(() -> ByteUtils.checkBitLE(byteArray, 0)).thenReturn(true);
            bloomFilter.when(() -> BloomFilter.murmurHash3(byteArray, 123L, 1, byteArray2)).thenReturn(1);
            byteUtils.when(() -> ByteUtils.checkBitLE(byteArray, 1)).thenReturn(false);
            BloomFilter target = new BloomFilter(10, Double.parseDouble("0.1"), 123, BloomFilter.BloomUpdate.UPDATE_ALL);
            //Act Statement(s)
            boolean result = target.contains(byteArray2);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            bloomFilter.verify(() -> BloomFilter.murmurHash3(byteArray, 123L, 0, byteArray2), atLeast(1));
            byteUtils.verify(() -> ByteUtils.checkBitLE(byteArray, 0), atLeast(1));
            bloomFilter.verify(() -> BloomFilter.murmurHash3(byteArray, 123L, 1, byteArray2), atLeast(1));
            byteUtils.verify(() -> ByteUtils.checkBitLE(byteArray, 1), atLeast(1));
        }
    }

    //Sapient generated method id: ${66a624f5-ecc0-3991-9904-a60485827aa5}, hash: 9977F4BA620B38BF6F3A2312068247C5
    @Ignore()
    @Test()
    public void insertWhenILessThanHashFuncs() {
        /* Branches:
         * (i < hashFuncs) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<BloomFilter> bloomFilter = mockStatic(BloomFilter.class)) {
            byte[] byteArray = new byte[]{(byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            byte[] byteArray2 = new byte[]{(byte) 0};
            bloomFilter.when(() -> BloomFilter.murmurHash3(byteArray, 123L, 0, byteArray2)).thenReturn(0);
            byteUtils.when(() -> ByteUtils.setBitLE(byteArray, 0)).thenAnswer((Answer<Void>) invocation -> null);
            bloomFilter.when(() -> BloomFilter.murmurHash3(byteArray, 123L, 1, byteArray2)).thenReturn(1);
            byteUtils.when(() -> ByteUtils.setBitLE(byteArray, 1)).thenAnswer((Answer<Void>) invocation -> null);
            BloomFilter target = new BloomFilter(10, Double.parseDouble("0.1"), 123, BloomFilter.BloomUpdate.UPDATE_ALL);
            //Act Statement(s)
            target.insert(byteArray2);
            //Assert statement(s)
            bloomFilter.verify(() -> BloomFilter.murmurHash3(byteArray, 123L, 0, byteArray2), atLeast(1));
            byteUtils.verify(() -> ByteUtils.setBitLE(byteArray, 0), atLeast(1));
            bloomFilter.verify(() -> BloomFilter.murmurHash3(byteArray, 123L, 1, byteArray2), atLeast(1));
            byteUtils.verify(() -> ByteUtils.setBitLE(byteArray, 1), atLeast(1));
        }
    }

    //Sapient generated method id: ${61bf4c20-f004-3085-ae9b-51b371f7b521}, hash: 6F78DD2E29B898A3E15021055E562287
    @Ignore()
    @Test()
    public void insert1Test() {
        //Arrange Statement(s)
        BloomFilter target = spy(new BloomFilter(100, Double.parseDouble("0.01"), 1234, BloomFilter.BloomUpdate.UPDATE_ALL));
        byte[] byteArray = new byte[]{};
        doNothing().when(target).insert(byteArray);
        byte[] byteArray2 = new byte[]{};
        doNothing().when(target).insert(byteArray2);
        ECKey eCKey = new ECKey();
        //Act Statement(s)
        target.insert(eCKey);
        //Assert statement(s)
        verify(target).insert(byteArray);
        verify(target).insert(byteArray2);
    }

    //Sapient generated method id: ${52d7c7e4-da26-323e-9e0d-9c512b4329f2}, hash: E6EA80AD72DE232D04B7391609721EE4
    @Ignore()
    @Test()
    public void insert2Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BloomFilter target = spy(new BloomFilter(0, Double.parseDouble("0.0"), 0, BloomFilter.BloomUpdate.UPDATE_NONE));
        byte[] byteArray = new byte[]{};
        doNothing().when(target).insert(byteArray);
        TransactionOutPoint transactionOutPoint = new TransactionOutPoint(0L, sha256HashMock);
        //Act Statement(s)
        target.insert(transactionOutPoint);
        //Assert statement(s)
        verify(target).insert(byteArray);
    }

    //Sapient generated method id: ${6c75f6d7-f407-3832-9c78-dfb18bca24b2}, hash: 625AA40DA0671AE27794D42E7957019D
    @Test()
    public void setMatchAllTest() {
        //Arrange Statement(s)
        BloomFilter target = new BloomFilter(100, Double.parseDouble("0.01"), 12345, BloomFilter.BloomUpdate.UPDATE_ALL);
        //Act Statement(s)
        target.setMatchAll();
    }

    //Sapient generated method id: ${ec5909fb-ee38-3a7a-8676-2dbaa026d153}, hash: 397CEB0F9B3A8D42434380E05AA1A5C1
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

    //Sapient generated method id: ${71bf90dc-775e-3a65-af10-2a62baad6a8c}, hash: 3DFA888D4295C573EDC85FA171C5FD82
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
        doReturn(false).when(filterMock).matchesAll();
        BloomFilter target = spy(new BloomFilter(0, Double.parseDouble("0.0"), 0, BloomFilter.BloomUpdate.UPDATE_NONE));
        doReturn(false).when(target).matchesAll();
        thrown.expect(IllegalArgumentException.class);
        //Act Statement(s)
        target.merge(filterMock);
        //Assert statement(s)
        verify(filterMock).matchesAll();
        verify(target).matchesAll();
    }

    //Sapient generated method id: ${8a3df2e4-b883-36cf-af3e-61b12af626fc}, hash: 692CB52A0471B8431279109DFE8A6B45
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
        BloomFilter target = spy(new BloomFilter(0, Double.parseDouble("0.0"), 0, BloomFilter.BloomUpdate.UPDATE_NONE));
        doReturn(false).when(target).matchesAll();
        BloomFilter bloomFilter = new BloomFilter(0, Double.parseDouble("0.0"), 0);
        //Act Statement(s)
        target.merge(bloomFilter);
        //Assert statement(s)
        verify(target).matchesAll();
    }

    //Sapient generated method id: ${0e23bcea-7d85-3ee6-9347-9cb117c6a368}, hash: 8B99DF6590E7291FC9F4E1DA4060884C
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

    //Sapient generated method id: ${6c885b50-6ad6-3e9b-9553-2728684df18a}, hash: 949E1875A6BD25BF51A6E5E392BF81C1
    @Test()
    public void matchesAllWhenBNotEquals255() {
        /* Branches:
         * (for-each(data)) : true
         * (b != (byte) 0xff) : true
         */
        //Arrange Statement(s)
        BloomFilter target = new BloomFilter(100, Double.parseDouble("0.01"), 123456, BloomFilter.BloomUpdate.UPDATE_ALL);
        //Act Statement(s)
        boolean result = target.matchesAll();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${68c0bd97-1e7e-31ef-8680-f5f199997578}, hash: 88ED0B7CE7B00A0586D90D579E9BB5E4
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

    //Sapient generated method id: ${0df49703-9d6a-389e-af9b-9402e61b02db}, hash: 4C43901FF8FB37125B7FC1A09D37995E
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

    //Sapient generated method id: ${fd61bac2-b5a0-3f8e-bffd-2ada6cf4ad07}, hash: A5F07C195FBE8BFE5714541433485F3D
    @Ignore()
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
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        PartialMerkleTree partialMerkleTreeMock = mock(PartialMerkleTree.class, "PartialMerkleTree");
        Transaction transactionMock = mock(Transaction.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class, "Sha256Hash");
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock3 = mock(Sha256Hash.class);
        Block block2Mock = mock(Block.class, "Block");
        try (MockedStatic<PartialMerkleTree> partialMerkleTree = mockStatic(PartialMerkleTree.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byte[] byteArray = new byte[]{};
            byteUtils.when(() -> ByteUtils.setBitLE(byteArray, 0)).thenAnswer((Answer<Void>) invocation -> null);
            partialMerkleTree.when(() -> PartialMerkleTree.buildFromLeaves(eq(byteArray), anyList())).thenReturn(partialMerkleTreeMock);
            BloomFilter target = spy(new BloomFilter(0, Double.parseDouble("0.0"), 0, BloomFilter.BloomUpdate.UPDATE_NONE));
            doReturn(false).when(target).applyAndUpdate(transactionMock);
            doReturn(sha256HashMock).when(transactionMock).getTxId();
            Instant instant = Instant.ofEpochSecond(1700000000);
            List list = new ArrayList<>();
            Block block = new Block(0L, sha256HashMock2, sha256HashMock3, instant, 0L, 0L, list);
            //Act Statement(s)
            FilteredBlock result = target.applyAndUpdate(block);
            FilteredBlock filteredBlock = new FilteredBlock(block2Mock, partialMerkleTreeMock);
            //Assert statement(s)
            assertThat(result, equalTo(filteredBlock));
            byteUtils.verify(() -> ByteUtils.setBitLE(byteArray, 0), atLeast(1));
            partialMerkleTree.verify(() -> PartialMerkleTree.buildFromLeaves(eq(byteArray), anyList()));
            verify(target).applyAndUpdate(transactionMock);
            verify(transactionMock).getTxId();
        }
    }

    //Sapient generated method id: ${6c07e1c1-c7b0-3022-8601-5eafa4aa086b}, hash: 6C9970E546CB8D33152105538A965E54
    @Ignore()
    @Test()
    public void applyAndUpdate1WhenContainsTxGetTxIdGetBytes() {
        /* Branches:
         * (contains(tx.getTxId().getBytes())) : true
         */
        //Arrange Statement(s)
        BloomFilter target = spy(new BloomFilter(100, Double.parseDouble("0.1"), 123456, BloomFilter.BloomUpdate.UPDATE_ALL));
        byte[] byteArray = new byte[]{};
        doReturn(true).when(target).contains(byteArray);
        Transaction transaction = new Transaction();
        //Act Statement(s)
        boolean result = target.applyAndUpdate(transaction);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(target).contains(byteArray);
    }

    //Sapient generated method id: ${ce271f5c-d8f2-361d-96ca-3e31cdae8907}, hash: 077264B909E47791A75B38B5EDFFBABD
    @Ignore()
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

    //Sapient generated method id: ${3723cafd-b3f7-304b-ab21-6f31f2974836}, hash: 0B1E55BC83AF89E57DF1CD1F8AB75A94
    @Ignore()
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
        doReturn(false).when(target).contains((byte[]) null);
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
        verify(target).contains((byte[]) null);
    }

    //Sapient generated method id: ${813f340a-a3ad-3976-8bb8-7b8a3dc4c82d}, hash: 3B698D223A3C3480EA951B8F38B9AC19
    @Ignore()
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
        TransactionOutPoint transactionOutPointMock = mock(TransactionOutPoint.class);
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            doReturn(sha256HashMock).when(txMock).getTxId();
            byte[] byteArray = new byte[]{};
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
        }
    }

    //Sapient generated method id: ${72cf3893-256c-3386-ad1d-8ea066eb93e9}, hash: BE584591591D83ACC0CBFDDB0449171C
    @Ignore()
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
        try (MockedStatic<ScriptPattern> scriptPattern = mockStatic(ScriptPattern.class)) {
            doReturn(sha256HashMock).when(txMock).getTxId();
            byte[] byteArray = new byte[]{};
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
        }
    }

    //Sapient generated method id: ${af2d87aa-8f70-31f5-a842-5790801f56a5}, hash: 818377B3903A4C13E1CE0F1F1CC25EDC
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
