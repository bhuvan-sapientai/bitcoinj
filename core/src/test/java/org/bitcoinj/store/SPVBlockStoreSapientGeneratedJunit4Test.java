package org.bitcoinj.store;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;

import org.bitcoinj.core.VerificationException;
import org.junit.rules.ExpectedException;

import java.util.List;

import org.bitcoinj.core.Block;
import org.bitcoinj.utils.Threading;

import java.nio.ByteBuffer;

import org.bitcoinj.base.internal.Preconditions;
import org.bitcoinj.base.Sha256Hash;

import java.math.BigInteger;
import java.util.function.Supplier;

import org.mockito.MockedStatic;
import org.bitcoinj.core.NetworkParameters;

import java.util.concurrent.locks.ReentrantLock;
import java.io.File;
import java.util.ArrayList;

import org.bitcoinj.core.StoredBlock;

import java.time.Instant;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.isA;

import org.junit.Ignore;

public class SPVBlockStoreSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final NetworkParameters paramsMock = mock(NetworkParameters.class, "params");

    private final Block blockMock = mock(Block.class);

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
    @Ignore()
    @Test()
    public void putWhenBufferIsNullThrowsBlockStoreException() throws BlockStoreException {
        /* Branches:
         * (buffer == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        SPVBlockStore target = new SPVBlockStore(paramsMock, (File) null, 100, true);
        BlockStoreException blockStoreException = new BlockStoreException("Store closed");
        thrown.expect(BlockStoreException.class);
        thrown.expectMessage(blockStoreException.getMessage());
        //Act Statement(s)
        target.put(storedBlockMock);
    }

    //Sapient generated method id: ${198eefad-e2f8-349f-a7a8-605b26309b95}
    @Ignore()
    @Test()
    public void putWhenCGreaterThanOrEqualsToFILE_PROLOGUE_BYTESThrowsIllegalStateException() throws BlockStoreException {
        /* Branches:
         * (buffer == null) : false
         * (c >= FILE_PROLOGUE_BYTES) : true  #  inside getRingCursor method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS);
             MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            ReentrantLock reentrantLock = Threading.lock(SPVBlockStore.class);
            threading.when(() -> Threading.lock(SPVBlockStore.class)).thenReturn(reentrantLock);
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenThrow(illegalStateException);
            File file = new File("pathname1");
            SPVBlockStore target = new SPVBlockStore(paramsMock, file, 0, false);
            thrown.expect(IllegalStateException.class);
            StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 0);
            //Act Statement(s)
            target.put(storedBlock);
            //Assert statement(s)
            threading.verify(() -> Threading.lock(SPVBlockStore.class), atLeast(1));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${b00d9f88-dc43-36b6-936d-a4dd716ec484}
    @Ignore()
    @Test()
    public void getWhenBufferIsNullThrowsBlockStoreException() throws BlockStoreException {
        /* Branches:
         * (buffer == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        File file = new File("pathname1");
        SPVBlockStore target = new SPVBlockStore(paramsMock, file, 1024, true);
        BlockStoreException blockStoreException = new BlockStoreException("Store closed");
        thrown.expect(BlockStoreException.class);
        thrown.expectMessage(blockStoreException.getMessage());
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        //Act Statement(s)
        target.get(sha256Hash);
    }

    //Sapient generated method id: ${4a7e0d64-7401-3ca3-8d48-3317c249958e}
    @Ignore()
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
        SPVBlockStore target = new SPVBlockStore(networkParameters, file, 1024, true);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        //Act Statement(s)
        StoredBlock result = target.get(sha256Hash);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${ec046266-fef8-3b99-9be0-e02884c5eddb}
    @Ignore()
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
        File file = new File("pathname1");
        SPVBlockStore target = new SPVBlockStore(paramsMock, file, 100, true);
        thrown.expect(RuntimeException.class);
        thrown.expectCause(isA(ReentrantLock.class));
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        //Act Statement(s)
        target.get(sha256Hash);
    }

    //Sapient generated method id: ${9e4b929b-017e-365e-b90f-fdb5f76a88a0}
    @Ignore()
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
        File file = new File("pathname1");
        SPVBlockStore target = new SPVBlockStore(paramsMock, file, 1024, true);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        //Act Statement(s)
        StoredBlock result = target.get(sha256Hash);
        //Assert statement(s)
        assertThat(result, is(nullValue()));
    }

    //Sapient generated method id: ${cb37a539-e0e4-3863-8075-51136df05933}
    @Ignore()
    @Test()
    public void getWhenCGreaterThanOrEqualsToFILE_PROLOGUE_BYTESThrowsIllegalStateException() throws BlockStoreException {
        /* Branches:
         * (buffer == null) : false
         * (cacheHit != null) : false
         * (notFoundCache.get(hash) != null) : false
         * (c >= FILE_PROLOGUE_BYTES) : true  #  inside getRingCursor method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenThrow(illegalStateException);
            File file = new File("pathname1");
            SPVBlockStore target = new SPVBlockStore(paramsMock, file, 0, false);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.get(sha256HashMock);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${0b76fefc-4c6b-37b8-bebf-d70bef044ce2}
    @Ignore()
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
        SPVBlockStore target = new SPVBlockStore(networkParameters, file, 1000000, true);
        BlockStoreException blockStoreException = new BlockStoreException("Store closed");
        thrown.expect(BlockStoreException.class);
        thrown.expectMessage(blockStoreException.getMessage());
        //Act Statement(s)
        target.getChainHead();
    }

    //Sapient generated method id: ${e89a43a8-cd84-37c9-b753-86071fb254c2}
    @Ignore()
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
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer);
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            sha256Hash.when(() -> Sha256Hash.wrap(byteArray)).thenReturn(sha256Hash2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            File file = new File("pathname1");
            SPVBlockStore target = spy(new SPVBlockStore(networkParameters, file, 1024, true));
            doReturn(null).when(target).get((Sha256Hash) any());
            BlockStoreException blockStoreException = new BlockStoreException("Corrupted block store: could not find chain head: ");
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
    @Ignore()
    @Test()
    public void getChainHeadWhenBlockIsNotNull() throws BlockStoreException {
        /* Branches:
         * (buffer == null) : false
         * (lastChainHead == null) : true
         * (block == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        File file = new File("pathname1");
        SPVBlockStore target = spy(new SPVBlockStore(paramsMock, file, 0, false));
        doReturn(storedBlockMock).when(target).get((Sha256Hash) any());
        //Act Statement(s)
        StoredBlock result = target.getChainHead();
        //Assert statement(s)
        assertThat(result, equalTo(storedBlockMock));
        verify(target).get((Sha256Hash) any());
    }

    //Sapient generated method id: ${df3f5737-d066-350f-9b2d-e156f76ebbde}
    @Ignore()
    @Test()
    public void setChainHeadWhenBufferIsNullThrowsBlockStoreException() throws BlockStoreException {
        /* Branches:
         * (buffer == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        SPVBlockStore target = new SPVBlockStore(paramsMock, (File) null, 100, true);
        BlockStoreException blockStoreException = new BlockStoreException("Store closed");
        thrown.expect(BlockStoreException.class);
        thrown.expectMessage(blockStoreException.getMessage());
        StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("100010001"), 0);
        //Act Statement(s)
        target.setChainHead(storedBlock);
    }

    //Sapient generated method id: ${4f05edba-7a8f-3e5a-8be9-5904c177544b}
    @Ignore()
    @Test()
    public void setChainHeadWhenBufferIsNotNull() throws BlockStoreException {
        /* Branches:
         * (buffer == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParameters = NetworkParameters.fromID("id1");
        File file = new File("pathname1");
        SPVBlockStore target = new SPVBlockStore(networkParameters, file, 1, false);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        Instant instant = Instant.now();
        List list = new ArrayList<>();
        Block block = new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, list);
        StoredBlock storedBlock = new StoredBlock(block, new BigInteger("0"), 0);
        //Act Statement(s)
        target.setChainHead(storedBlock);
    }

    //Sapient generated method id: ${4338ea80-df41-3c09-b3eb-b0476a460c1f}
    @Ignore()
    @Test()
    public void closeTest() throws BlockStoreException, IOException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        File file = new File("pathname1");
        SPVBlockStore target = new SPVBlockStore(paramsMock, file, 0, false);
        //Act Statement(s)
        target.close();
    }

    //Sapient generated method id: ${21e5fedc-2c77-3849-9c9a-a8d6a7034b13}
    @Ignore()
    @Test()
    public void closeWhenCaughtIOExceptionThrowsBlockStoreException() throws BlockStoreException, IOException {
        /* Branches:
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        File file = new File("pathname1");
        SPVBlockStore target = new SPVBlockStore(paramsMock, file, 0, false);
        thrown.expect(BlockStoreException.class);
        //Act Statement(s)
        target.close();
    }

    //Sapient generated method id: ${408fcabb-71db-3e6f-a075-8be533a65138}
    @Ignore()
    @Test()
    public void clearWhenNewCursorGreaterThanOrEqualsTo0() throws Exception, VerificationException, BlockStoreException {
        /* Branches:
         * (i < fileLength) : true
         * (newCursor >= 0) : true  #  inside setRingCursor method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        File file = new File("pathname1");
        SPVBlockStore target = spy(new SPVBlockStore(paramsMock, file, 0, false));
        doReturn(blockMock).when(paramsMock).getGenesisBlock();
        Block blockMock2 = mock(Block.class);
        doReturn(blockMock2).when(blockMock).cloneAsHeader();
        doReturn(new BigInteger("0")).when(blockMock).getWork();
        doNothing().when(target).put((StoredBlock) any());
        doNothing().when(target).setChainHead((StoredBlock) any());
        //Act Statement(s)
        target.clear();
        //Assert statement(s)
        verify(paramsMock).getGenesisBlock();
        verify(blockMock).cloneAsHeader();
        verify(blockMock).getWork();
        verify(target).put((StoredBlock) any());
        verify(target).setChainHead((StoredBlock) any());
    }
}
