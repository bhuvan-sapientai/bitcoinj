package org.bitcoinj.store;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.core.VerificationException;

import java.io.IOException;

import org.junit.rules.ExpectedException;
import org.bitcoinj.core.Block;
import org.bitcoinj.utils.Threading;

import java.nio.ByteBuffer;

import org.bitcoinj.base.internal.Preconditions;
import org.bitcoinj.base.Sha256Hash;

import java.math.BigInteger;

import org.mockito.MockedStatic;
import org.bitcoinj.core.NetworkParameters;

import java.io.File;

import org.bitcoinj.core.StoredBlock;
import org.bitcoinj.core.ProtocolException;

import java.nio.MappedByteBuffer;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;

public class SPVBlockStoreSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final NetworkParameters paramsMock = mock(NetworkParameters.class, "params");

    private final Block blockMock = mock(Block.class);

    private final Block blockMock2 = mock(Block.class);

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    private final StoredBlock storedBlockMock = mock(StoredBlock.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${79eb62f2-07c9-3fb5-94b5-4bb37657ef6d}
    @Test()
    public void getFileSizeTest() {

        //Act Statement(s)
        int result = SPVBlockStore.getFileSize(1);

        //Assert statement(s)
        assertThat(result, equalTo(1152));
    }

    //Sapient generated method id: ${f0397447-faf2-3e98-9e22-33dbd60dac48}
    @Test()
    public void putWhenBufferIsNullThrowsBlockStoreException() throws BlockStoreException {
        /* Branches:
         * (buffer == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParameters = NetworkParameters.fromID("id1");
        File file = new File("pathname1");
        SPVBlockStore target = new SPVBlockStore(networkParameters, file, 0, false);
        BlockStoreException blockStoreException = new BlockStoreException("Store closed");
        thrown.expect(BlockStoreException.class);
        thrown.expectMessage(blockStoreException.getMessage());

        //Act Statement(s)
        target.put(storedBlockMock);
    }

    //Sapient generated method id: ${172d3d24-b510-397f-9306-18a10531aecb}
    @Test()
    public void putWhenCLessThanFILE_PROLOGUE_BYTESThrowsIllegalStateException() throws BlockStoreException {
        /* Branches:
         * (buffer == null) : false
         * (c >= FILE_PROLOGUE_BYTES) : false  #  inside getRingCursor method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParameters = NetworkParameters.fromID("id1");
        File file = new File("pathname1");
        SPVBlockStore target = new SPVBlockStore(networkParameters, file, 0, false);
        thrown.expect(IllegalStateException.class);

        //Act Statement(s)
        target.put(storedBlockMock);
    }

    //Sapient generated method id: ${84a34c77-f02a-3e0a-9372-cba07333576d}
    @Test()
    public void putWhenNewCursorGreaterThanOrEqualsTo0() throws BlockStoreException {
        /* Branches:
         * (buffer == null) : false
         * (c >= FILE_PROLOGUE_BYTES) : true  #  inside getRingCursor method
         * (cursor == fileLength) : true
         * (newCursor >= 0) : true  #  inside setRingCursor method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        StoredBlock blockMock = mock(StoredBlock.class);
        doReturn(blockMock2).when(blockMock).getHeader();
        doReturn(sha256HashMock).when(blockMock2).getHash();
        byte[] byteArray = new byte[]{};
        doReturn(byteArray).when(sha256HashMock).getBytes();
        doNothing().when(blockMock).serializeCompact((MappedByteBuffer) any());
        NetworkParameters networkParameters = NetworkParameters.fromID("id1");
        File file = new File("pathname1");
        SPVBlockStore target = new SPVBlockStore(networkParameters, file, 0, false);

        //Act Statement(s)
        target.put(blockMock);

        //Assert statement(s)
        verify(blockMock).getHeader();
        verify(blockMock2).getHash();
        verify(sha256HashMock).getBytes();
        verify(blockMock).serializeCompact((MappedByteBuffer) any());
    }

    //Sapient generated method id: ${59cf5436-8def-390c-bb7d-5fc9b520b6bf}
    @Test()
    public void putWhenNewCursorLessThan0ThrowsIllegalArgumentException() throws BlockStoreException {
        /* Branches:
         * (buffer == null) : false
         * (c >= FILE_PROLOGUE_BYTES) : true  #  inside getRingCursor method
         * (cursor == fileLength) : true
         * (newCursor >= 0) : false  #  inside setRingCursor method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        StoredBlock blockMock = mock(StoredBlock.class);
        doReturn(blockMock2).when(blockMock).getHeader();
        doReturn(sha256HashMock).when(blockMock2).getHash();
        byte[] byteArray = new byte[]{};
        doReturn(byteArray).when(sha256HashMock).getBytes();
        doNothing().when(blockMock).serializeCompact((MappedByteBuffer) any());
        NetworkParameters networkParameters = NetworkParameters.fromID("id1");
        File file = new File("pathname1");
        SPVBlockStore target = new SPVBlockStore(networkParameters, file, 0, false);
        thrown.expect(IllegalArgumentException.class);

        //Act Statement(s)
        target.put(blockMock);

        //Assert statement(s)
        verify(blockMock).getHeader();
        verify(blockMock2).getHash();
        verify(sha256HashMock).getBytes();
        verify(blockMock).serializeCompact((MappedByteBuffer) any());
    }

    //Sapient generated method id: ${b00d9f88-dc43-36b6-936d-a4dd716ec484}
    @Test()
    public void getWhenBufferIsNullThrowsBlockStoreException() throws BlockStoreException {
        /* Branches:
         * (buffer == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParameters = NetworkParameters.fromID("id1");
        File file = new File("pathname1");
        SPVBlockStore target = new SPVBlockStore(networkParameters, file, 0, false);
        BlockStoreException blockStoreException = new BlockStoreException("Store closed");
        thrown.expect(BlockStoreException.class);
        thrown.expectMessage(blockStoreException.getMessage());
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);

        //Act Statement(s)
        target.get(sha256Hash);
    }

    //Sapient generated method id: ${4a7e0d64-7401-3ca3-8d48-3317c249958e}
    @Test()
    public void getWhenCacheHitIsNotNull() throws BlockStoreException {
        /* Branches:
         * (buffer == null) : false
         * (cacheHit != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParameters = NetworkParameters.fromID("id1");
        File file = new File("pathname1");
        SPVBlockStore target = new SPVBlockStore(networkParameters, file, 0, false);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);

        //Act Statement(s)
        StoredBlock result = target.get(sha256Hash);

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${ec046266-fef8-3b99-9be0-e02884c5eddb}
    @Test()
    public void getWhenCaughtProtocolExceptionThrowsRuntimeException() throws BlockStoreException {
        /* Branches:
         * (buffer == null) : false
         * (cacheHit != null) : true
         * (catch-exception (ProtocolException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParameters = NetworkParameters.fromID("id1");
        File file = new File("pathname1");
        SPVBlockStore target = new SPVBlockStore(networkParameters, file, 0, false);
        thrown.expect(RuntimeException.class);
        thrown.expectCause(is(instanceOf(ProtocolException.class)));
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);

        //Act Statement(s)
        target.get(sha256Hash);
    }

    //Sapient generated method id: ${9e4b929b-017e-365e-b90f-fdb5f76a88a0}
    @Test()
    public void getWhenNotFoundCacheGetHashIsNotNull() throws BlockStoreException {
        /* Branches:
         * (buffer == null) : false
         * (cacheHit != null) : false
         * (notFoundCache.get(hash) != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParameters = NetworkParameters.fromID("id1");
        File file = new File("pathname1");
        SPVBlockStore target = new SPVBlockStore(networkParameters, file, 0, false);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);

        //Act Statement(s)
        StoredBlock result = target.get(sha256Hash);

        //Assert statement(s)
        assertThat(result, is(nullValue()));
    }

    //Sapient generated method id: ${2e1c8329-57d5-3da3-ab2a-1345f9b1d106}
    @Test()
    public void getWhenCLessThanFILE_PROLOGUE_BYTESThrowsIllegalStateException() throws BlockStoreException {
        /* Branches:
         * (buffer == null) : false
         * (cacheHit != null) : false
         * (notFoundCache.get(hash) != null) : false
         * (c >= FILE_PROLOGUE_BYTES) : false  #  inside getRingCursor method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParameters = NetworkParameters.fromID("id1");
        File file = new File("pathname1");
        SPVBlockStore target = new SPVBlockStore(networkParameters, file, 0, false);
        thrown.expect(IllegalStateException.class);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);

        //Act Statement(s)
        target.get(sha256Hash);
    }

    //Sapient generated method id: ${14a317c1-2209-3fa2-b375-7faa6d16b383}
    @Test()
    public void getWhenArraysEqualsScratchTargetHashBytes() throws BlockStoreException {
        /* Branches:
         * (buffer == null) : false
         * (cacheHit != null) : false
         * (notFoundCache.get(hash) != null) : false
         * (c >= FILE_PROLOGUE_BYTES) : true  #  inside getRingCursor method
         * (cursor < FILE_PROLOGUE_BYTES) : true
         * (Arrays.equals(scratch, targetHashBytes)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<StoredBlock> storedBlock = mockStatic(StoredBlock.class)) {
            StoredBlock storedBlock2 = new StoredBlock(blockMock, new BigInteger("0"), 0);
            storedBlock.when(() -> StoredBlock.deserializeCompact((MappedByteBuffer) any())).thenReturn(storedBlock2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            File file = new File("pathname1");
            SPVBlockStore target = new SPVBlockStore(networkParameters, file, 0, false);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            //Act Statement(s)
            StoredBlock result = target.get(sha256Hash);
            //Assert statement(s)
            assertThat(result, equalTo(storedBlock2));
            storedBlock.verify(() -> StoredBlock.deserializeCompact((MappedByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${a1f113d6-4400-3808-857b-965ff9bf12b0}
    @Test()
    public void getWhenArraysEqualsScratchTargetHashBytesAndCaughtProtocolExceptionThrowsRuntimeException() throws BlockStoreException {
        /* Branches:
         * (buffer == null) : false
         * (cacheHit != null) : false
         * (notFoundCache.get(hash) != null) : false
         * (c >= FILE_PROLOGUE_BYTES) : true  #  inside getRingCursor method
         * (cursor < FILE_PROLOGUE_BYTES) : true
         * (Arrays.equals(scratch, targetHashBytes)) : true
         * (catch-exception (ProtocolException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<StoredBlock> storedBlock = mockStatic(StoredBlock.class)) {
            StoredBlock storedBlock2 = new StoredBlock(blockMock, new BigInteger("0"), 0);
            storedBlock.when(() -> StoredBlock.deserializeCompact((MappedByteBuffer) any())).thenReturn(storedBlock2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            File file = new File("pathname1");
            SPVBlockStore target = new SPVBlockStore(networkParameters, file, 0, false);
            thrown.expect(RuntimeException.class);
            thrown.expectCause(is(instanceOf(ProtocolException.class)));
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            //Act Statement(s)
            target.get(sha256Hash);
            //Assert statement(s)
            storedBlock.verify(() -> StoredBlock.deserializeCompact((MappedByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${3a8e940e-a7e2-3583-960a-79a834747bd5}
    @Test()
    public void getWhenCursorEqualsStartingPoint() throws BlockStoreException {
        /* Branches:
         * (buffer == null) : false
         * (cacheHit != null) : false
         * (notFoundCache.get(hash) != null) : false
         * (c >= FILE_PROLOGUE_BYTES) : true  #  inside getRingCursor method
         * (cursor < FILE_PROLOGUE_BYTES) : true
         * (Arrays.equals(scratch, targetHashBytes)) : false
         * (cursor != startingPoint) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParameters = NetworkParameters.fromID("id1");
        File file = new File("pathname1");
        SPVBlockStore target = new SPVBlockStore(networkParameters, file, 0, false);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);

        //Act Statement(s)
        StoredBlock result = target.get(sha256Hash);

        //Assert statement(s)
        assertThat(result, is(nullValue()));
    }

    //Sapient generated method id: ${0b76fefc-4c6b-37b8-bebf-d70bef044ce2}
    @Test()
    public void getChainHeadWhenBufferIsNullThrowsBlockStoreException() throws BlockStoreException {
        /* Branches:
         * (buffer == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParameters = NetworkParameters.fromID("id1");
        File file = new File("pathname1");
        SPVBlockStore target = new SPVBlockStore(networkParameters, file, 0, false);
        BlockStoreException blockStoreException = new BlockStoreException("Store closed");
        thrown.expect(BlockStoreException.class);
        thrown.expectMessage(blockStoreException.getMessage());

        //Act Statement(s)
        target.getChainHead();
    }

    //Sapient generated method id: ${e89a43a8-cd84-37c9-b753-86071fb254c2}
    @Test()
    public void getChainHeadWhenBlockIsNullThrowsBlockStoreException() throws BlockStoreException {
        /* Branches:
         * (buffer == null) : false
         * (lastChainHead == null) : true
         * (block == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            Sha256Hash sha256Hash2 = Sha256Hash.wrap(byteArray);
            sha256Hash.when(() -> Sha256Hash.wrap(byteArray)).thenReturn(sha256Hash2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            File file = new File("pathname1");
            SPVBlockStore target = spy(new SPVBlockStore(networkParameters, file, 0, false));
            doReturn(null).when(target).get((Sha256Hash) any());
            BlockStoreException blockStoreException = new BlockStoreException("Corrupted block store: could not find chain head: 0000000000000000000000000000000000000000000000000000000000000000");
            thrown.expect(BlockStoreException.class);
            thrown.expectMessage(blockStoreException.getMessage());
            //Act Statement(s)
            target.getChainHead();
            //Assert statement(s)
            sha256Hash.verify(() -> Sha256Hash.wrap(byteArray), atLeast(1));
            verify(target).get((Sha256Hash) any());
        }
    }

    //Sapient generated method id: ${e4aa7cfd-7f36-36e9-be2a-82622c1d638f}
    @Test()
    public void getChainHeadWhenBlockIsNotNull() throws BlockStoreException, VerificationException {
        /* Branches:
         * (buffer == null) : false
         * (lastChainHead == null) : true
         * (block == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(blockMock).when(paramsMock).getGenesisBlock();
        doReturn(blockMock2).when(blockMock).cloneAsHeader();
        doReturn(sha256HashMock).when(blockMock2).getHash();
        byte[] byteArray = new byte[]{};
        doReturn(byteArray).when(sha256HashMock).getBytes();
        doReturn(new BigInteger("0")).when(blockMock).getWork();
        File file = new File("pathname1");
        SPVBlockStore target = spy(new SPVBlockStore(paramsMock, file, 1, false));
        doReturn(storedBlockMock).when(target).get((Sha256Hash) any());

        //Act Statement(s)
        StoredBlock result = target.getChainHead();

        //Assert statement(s)
        assertThat(result, equalTo(storedBlockMock));
        verify(paramsMock).getGenesisBlock();
        verify(blockMock).cloneAsHeader();
        verify(blockMock2, times(2)).getHash();
        verify(sha256HashMock, times(2)).getBytes();
        verify(blockMock).getWork();
        verify(target).get((Sha256Hash) any());
    }

    //Sapient generated method id: ${df3f5737-d066-350f-9b2d-e156f76ebbde}
    @Test()
    public void setChainHeadWhenBufferIsNullThrowsBlockStoreException() throws BlockStoreException {
        /* Branches:
         * (buffer == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParameters = NetworkParameters.fromID("id1");
        File file = new File("pathname1");
        SPVBlockStore target = new SPVBlockStore(networkParameters, file, 0, false);
        BlockStoreException blockStoreException = new BlockStoreException("Store closed");
        thrown.expect(BlockStoreException.class);
        thrown.expectMessage(blockStoreException.getMessage());

        //Act Statement(s)
        target.setChainHead(storedBlockMock);
    }

    //Sapient generated method id: ${4f05edba-7a8f-3e5a-8be9-5904c177544b}
    @Test()
    public void setChainHeadWhenBufferIsNotNull() throws BlockStoreException {
        /* Branches:
         * (buffer == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(sha256HashMock).when(blockMock).getHash();
        byte[] byteArray = new byte[]{};
        doReturn(byteArray).when(sha256HashMock).getBytes();
        NetworkParameters networkParameters = NetworkParameters.fromID("id1");
        File file = new File("pathname1");
        SPVBlockStore target = new SPVBlockStore(networkParameters, file, 0, false);
        StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 0);

        //Act Statement(s)
        target.setChainHead(storedBlock);

        //Assert statement(s)
        verify(blockMock).getHash();
        verify(sha256HashMock).getBytes();
    }

    //Sapient generated method id: ${4338ea80-df41-3c09-b3eb-b0476a460c1f}
    @Test()
    public void closeTest() throws BlockStoreException, IOException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParameters = NetworkParameters.fromID("id1");
        File file = new File("pathname1");
        SPVBlockStore target = new SPVBlockStore(networkParameters, file, 0, false);

        //Act Statement(s)
        target.close();
    }

    //Sapient generated method id: ${21e5fedc-2c77-3849-9c9a-a8d6a7034b13}
    @Test()
    public void closeWhenCaughtIOExceptionThrowsBlockStoreException() throws BlockStoreException, IOException {
        /* Branches:
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParameters = NetworkParameters.fromID("id1");
        File file = new File("pathname1");
        SPVBlockStore target = new SPVBlockStore(networkParameters, file, 0, false);
        thrown.expect(BlockStoreException.class);

        //Act Statement(s)
        target.close();
    }

    //Sapient generated method id: ${408fcabb-71db-3e6f-a075-8be533a65138}
    @Test()
    public void clearWhenNewCursorGreaterThanOrEqualsTo0() throws Exception, VerificationException, BlockStoreException {
        /* Branches:
         * (i < fileLength) : true
         * (newCursor >= 0) : true  #  inside setRingCursor method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        doReturn(blockMock2).when(blockMock).cloneAsHeader();
        doReturn(sha256HashMock).when(blockMock2).getHash();
        byte[] byteArray = new byte[]{};
        doReturn(byteArray).when(sha256HashMock).getBytes();
        doReturn(new BigInteger("0")).when(blockMock).getWork();
        File file = new File("pathname1");
        SPVBlockStore target = spy(new SPVBlockStore(paramsMock, file, 1, false));
        Block blockMock3 = mock(Block.class);
        doReturn(blockMock, blockMock3).when(paramsMock).getGenesisBlock();
        Block blockMock4 = mock(Block.class);
        doReturn(blockMock4).when(blockMock3).cloneAsHeader();
        doReturn(new BigInteger("0")).when(blockMock3).getWork();
        doNothing().when(target).put((StoredBlock) any());
        doNothing().when(target).setChainHead((StoredBlock) any());

        //Act Statement(s)
        target.clear();

        //Assert statement(s)
        verify(paramsMock, times(2)).getGenesisBlock();
        verify(blockMock).cloneAsHeader();
        verify(blockMock2, times(2)).getHash();
        verify(sha256HashMock, times(2)).getBytes();
        verify(blockMock).getWork();
        verify(blockMock3).cloneAsHeader();
        verify(blockMock3).getWork();
        verify(target).put((StoredBlock) any());
        verify(target).setChainHead((StoredBlock) any());
    }
}
