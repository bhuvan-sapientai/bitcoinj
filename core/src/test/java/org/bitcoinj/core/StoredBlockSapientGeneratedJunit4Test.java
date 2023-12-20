package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.store.BlockStoreException;
import org.junit.rules.ExpectedException;

import java.util.List;
import java.nio.ByteBuffer;

import org.bitcoinj.base.internal.Preconditions;
import org.bitcoinj.store.BlockStore;
import org.bitcoinj.base.Sha256Hash;

import java.math.BigInteger;

import org.bitcoinj.base.internal.ByteUtils;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

import java.util.ArrayList;
import java.time.Instant;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

import org.junit.Ignore;

public class StoredBlockSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Block blockMock = mock(Block.class);

    private final Block blockMock2 = mock(Block.class);

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);

    private final StoredBlock storedBlockMock = mock(StoredBlock.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${1895f326-80dd-3b71-8d06-214d95cf3335}
    @Test()
    public void moreWorkThanWhenChainWorkCompareToOtherChainWorkGreaterThan0() {
        /* Branches:
         * (chainWork.compareTo(other.chainWork) > 0) : true
         */
        //Arrange Statement(s)
        StoredBlock target = new StoredBlock(blockMock, new BigInteger("2"), 0);
        StoredBlock storedBlock = new StoredBlock(blockMock2, new BigInteger("1"), 0);
        //Act Statement(s)
        boolean result = target.moreWorkThan(storedBlock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${c59b26e4-e91f-3e2d-8de6-a8f2d75c0bfc}
    @Test()
    public void moreWorkThanWhenChainWorkCompareToOtherChainWorkNotGreaterThan0() {
        /* Branches:
         * (chainWork.compareTo(other.chainWork) > 0) : false
         */
        //Arrange Statement(s)
        StoredBlock target = new StoredBlock(blockMock, new BigInteger("0"), 0);
        StoredBlock storedBlock = new StoredBlock(blockMock2, new BigInteger("0"), 0);
        //Act Statement(s)
        boolean result = target.moreWorkThan(storedBlock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${c319ea97-f8d0-37c4-a5dd-88e142a90c6d}
    @Test()
    public void buildTest() throws VerificationException {
        //Arrange Statement(s)
        doReturn(new BigInteger("1")).when(blockMock).getWork();
        StoredBlock target = new StoredBlock(blockMock2, new BigInteger("1"), 1);
        //Act Statement(s)
        StoredBlock result = target.build(blockMock);
        StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("2"), 2);
        //Assert statement(s)
        assertThat(result, equalTo(storedBlock));
        verify(blockMock).getWork();
    }

    //Sapient generated method id: ${2aed458e-cc71-3e23-bca0-59021b817f3e}
    @Ignore()
    @Test()
    public void getPrevTest() throws BlockStoreException {
        //Arrange Statement(s)
        BlockStore storeMock = mock(BlockStore.class);
        doReturn(storedBlockMock).when(storeMock).get(sha256HashMock);
        Instant instant = Instant.now();
        List list = new ArrayList<>();
        Block block = new Block(0L, sha256HashMock2, sha256HashMock, instant, 0L, 0L, list);
        StoredBlock target = new StoredBlock(block, new BigInteger("0"), 0);
        //Act Statement(s)
        StoredBlock result = target.getPrev(storeMock);
        //Assert statement(s)
        assertThat(result, equalTo(storedBlockMock));
        verify(storeMock).get(sha256HashMock);
    }

    //Sapient generated method id: ${35a13cc0-ea02-3b06-8245-df97532dc68e}
    @Ignore()
    @Test()
    public void serializeCompactWhenChainWorkBytesLengthLessThanOrEqualsToCHAIN_WORK_BYTESThrowsIllegalStateException() {
        /* Branches:
         * (chainWorkBytes.length <= CHAIN_WORK_BYTES) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenThrow(illegalStateException);
            StoredBlock target = new StoredBlock(blockMock, new BigInteger("1"), 0);
            thrown.expect(IllegalStateException.class);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            target.serializeCompact(byteBuffer);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${cc28ebf7-9302-350f-a1ed-0f2c86e30da6}
    @Ignore()
    @Test()
    public void deserializeCompactTest() throws ProtocolException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Block> block = mockStatic(Block.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            byteUtils.when(() -> ByteUtils.bytesToBigInteger(byteArray)).thenReturn(new BigInteger("0"));
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray2);
            Block block2 = Block.read(byteBuffer);
            block.when(() -> Block.read((ByteBuffer) any())).thenReturn(block2);
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            StoredBlock result = StoredBlock.deserializeCompact(byteBuffer2);
            StoredBlock storedBlock = new StoredBlock(block2, new BigInteger("0"), 0);
            //Assert statement(s)
            assertThat(result, equalTo(storedBlock));
            byteUtils.verify(() -> ByteUtils.bytesToBigInteger(byteArray), atLeast(1));
            block.verify(() -> Block.read((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${6c2d1366-1370-3259-91d2-4247d0acb395}
    @Test()
    public void deserializeCompact1Test() throws ProtocolException {
        //Arrange Statement(s)
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        try (MockedStatic<StoredBlock> storedBlock = mockStatic(StoredBlock.class, CALLS_REAL_METHODS)) {
            storedBlock.when(() -> StoredBlock.deserializeCompact((ByteBuffer) any())).thenReturn(storedBlockMock);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            StoredBlock result = StoredBlock.deserializeCompact(messageSerializerMock, byteBuffer);
            //Assert statement(s)
            assertThat(result, equalTo(storedBlockMock));
            storedBlock.verify(() -> StoredBlock.deserializeCompact((ByteBuffer) any()), atLeast(1));
        }
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
        Instant instant = Instant.now();
        List list = new ArrayList<>();
        Block block = new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, list);
        StoredBlock target = spy(new StoredBlock(block, new BigInteger("0"), 1));
        doReturn("<hash>").when(blockMock).getHashAsString();
        Block blockMock2 = mock(Block.class, "toString_block2");
        doReturn(blockMock, blockMock2).when(target).getHeader();
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("result1"));
        verify(target, times(2)).getHeader();
        verify(blockMock).getHashAsString();
    }
}
