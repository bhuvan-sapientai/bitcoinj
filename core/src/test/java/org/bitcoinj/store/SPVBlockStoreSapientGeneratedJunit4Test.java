package org.bitcoinj.store;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.mockito.InjectMocks;
import org.junit.After;
import org.junit.Test;
import org.bitcoinj.core.VerificationException;

import java.io.IOException;

import org.junit.rules.ExpectedException;
import org.bitcoinj.core.Block;
import org.bitcoinj.utils.Threading;
import org.mockito.MockitoAnnotations;

import java.nio.channels.FileLock;
import java.math.BigInteger;

import org.bitcoinj.core.NetworkParameters;

import java.util.concurrent.locks.ReentrantLock;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;

import org.bitcoinj.base.internal.Preconditions;
import org.bitcoinj.base.Sha256Hash;
import org.mockito.MockedStatic;

import java.io.File;

import org.bitcoinj.core.StoredBlock;
import org.bitcoinj.core.ProtocolException;

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

import org.junit.Ignore;

public class SPVBlockStoreSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final FileLock fileLockMock = mock(FileLock.class, "fileLock");

    private final RandomAccessFile randomAccessFileMock = mock(RandomAccessFile.class, "randomAccessFile");

    private final NetworkParameters paramsMock = mock(NetworkParameters.class, "params");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private SPVBlockStore target;

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    @After()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${79eb62f2-07c9-3fb5-94b5-4bb37657ef6d}, hash: A4B02B087CC35E9E874F3181D608349F
    @Test()
    public void getFileSizeTest() {
        //Act Statement(s)
        int result = SPVBlockStore.getFileSize(1);
        //Assert statement(s)
        assertThat(result, equalTo(1152));
    }

    //Sapient generated method id: ${f0397447-faf2-3e98-9e22-33dbd60dac48}, hash: 573625E8D1E3DBF60326FE2413A4E55B
    @Ignore()
    @Test()
    public void putWhenBufferIsNullThrowsBlockStoreException() throws BlockStoreException {
        /* Branches:
         * (buffer == null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: randomAccessFile
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParameters = NetworkParameters.fromID("id1");
        File file = new File("pathname1");
        target = new SPVBlockStore(networkParameters, file, 0, false);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        BlockStoreException blockStoreException = new BlockStoreException("Store closed");
        thrown.expect(BlockStoreException.class);
        thrown.expectMessage(blockStoreException.getMessage());
        Block block = networkParameters.getGenesisBlock();
        Block block2 = block.cloneAsHeader();
        StoredBlock storedBlock = new StoredBlock(block2, new BigInteger("0"), 0);
        //Act Statement(s)
        target.put(storedBlock);
    }

    //Sapient generated method id: ${172d3d24-b510-397f-9306-18a10531aecb}, hash: B4474CC5E04A390EAA99E50FD9296849
    @Ignore()
    @Test()
    public void putWhenCLessThanFILE_PROLOGUE_BYTESThrowsIllegalStateException() throws BlockStoreException {
        /* Branches:
         * (buffer == null) : false
         * (c >= FILE_PROLOGUE_BYTES) : false  #  inside getRingCursor method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: randomAccessFile
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParameters = NetworkParameters.fromID("id1");
        File file = new File("pathname1");
        target = new SPVBlockStore(networkParameters, file, 0, false);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        thrown.expect(IllegalStateException.class);
        Block block = networkParameters.getGenesisBlock();
        Block block2 = block.cloneAsHeader();
        StoredBlock storedBlock = new StoredBlock(block2, new BigInteger("0"), 0);
        //Act Statement(s)
        target.put(storedBlock);
    }

    //Sapient generated method id: ${84a34c77-f02a-3e0a-9372-cba07333576d}, hash: 52130FC98A3708B15E72846EB03C22B9
    @Ignore()
    @Test()
    public void putWhenNewCursorGreaterThanOrEqualsTo0() throws BlockStoreException {
        /* Branches:
         * (buffer == null) : false
         * (c >= FILE_PROLOGUE_BYTES) : true  #  inside getRingCursor method
         * (cursor == fileLength) : true
         * (newCursor >= 0) : true  #  inside setRingCursor method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: randomAccessFile, object of type Block, block, buffer, hash
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParameters = NetworkParameters.fromID("id1");
        File file = new File("pathname1");
        target = new SPVBlockStore(networkParameters, file, 0, false);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Block block = networkParameters.getGenesisBlock();
        Block block2 = block.cloneAsHeader();
        StoredBlock storedBlock = new StoredBlock(block2, new BigInteger("0"), 0);
        //Act Statement(s)
        target.put(storedBlock);
    }

    //Sapient generated method id: ${59cf5436-8def-390c-bb7d-5fc9b520b6bf}, hash: F13EF35055D6382F6AE9FAA5A9F31EDB
    @Ignore()
    @Test()
    public void putWhenNewCursorLessThan0ThrowsIllegalArgumentException() throws BlockStoreException {
        /* Branches:
         * (buffer == null) : false
         * (c >= FILE_PROLOGUE_BYTES) : true  #  inside getRingCursor method
         * (cursor == fileLength) : true
         * (newCursor >= 0) : false  #  inside setRingCursor method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: randomAccessFile, object of type Block, block, buffer, hash
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParameters = NetworkParameters.fromID("id1");
        File file = new File("pathname1");
        target = new SPVBlockStore(networkParameters, file, 0, false);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        thrown.expect(IllegalArgumentException.class);
        Block block = networkParameters.getGenesisBlock();
        Block block2 = block.cloneAsHeader();
        StoredBlock storedBlock = new StoredBlock(block2, new BigInteger("0"), 0);
        //Act Statement(s)
        target.put(storedBlock);
    }

    //Sapient generated method id: ${b00d9f88-dc43-36b6-936d-a4dd716ec484}, hash: AF3050C1EF052DE4A90689B397510ACF
    @Ignore()
    @Test()
    public void getWhenBufferIsNullThrowsBlockStoreException() throws BlockStoreException {
        /* Branches:
         * (buffer == null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: randomAccessFile
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParameters = NetworkParameters.fromID("id1");
        File file = new File("pathname1");
        target = new SPVBlockStore(networkParameters, file, 0, false);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        BlockStoreException blockStoreException = new BlockStoreException("Store closed");
        thrown.expect(BlockStoreException.class);
        thrown.expectMessage(blockStoreException.getMessage());
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        //Act Statement(s)
        target.get(sha256Hash);
    }

    //Sapient generated method id: ${4a7e0d64-7401-3ca3-8d48-3317c249958e}, hash: 6B6630A9CABBC3B583A7F4193F630578
    @Ignore()
    @Test()
    public void getWhenCacheHitIsNotNull() throws BlockStoreException {
        /* Branches:
         * (buffer == null) : false
         * (cacheHit != null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: randomAccessFile
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParameters = NetworkParameters.fromID("id1");
        File file = new File("pathname1");
        target = new SPVBlockStore(networkParameters, file, 20000, true);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        //Act Statement(s)
        StoredBlock result = target.get(sha256Hash);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${ec046266-fef8-3b99-9be0-e02884c5eddb}, hash: 460B869DB1594FFFBFBC65EF43013AA6
    @Ignore()
    @Test()
    public void getWhenCaughtProtocolExceptionThrowsRuntimeException() throws BlockStoreException, VerificationException {
        /* Branches:
         * (buffer == null) : false
         * (cacheHit != null) : true
         * (catch-exception (ProtocolException)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: randomAccessFile
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            ReentrantLock reentrantLock = Threading.lock(SPVBlockStore.class);
            threading.when(() -> Threading.lock(SPVBlockStore.class)).thenReturn(reentrantLock);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            File file = new File("pathname1");
            target = new SPVBlockStore(networkParameters, file, 10001, true);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(RuntimeException.class);
            thrown.expectCause(is(instanceOf(ProtocolException.class)));
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            //Act Statement(s)
            target.get(sha256Hash);
            //Assert statement(s)
            threading.verify(() -> Threading.lock(SPVBlockStore.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${9e4b929b-017e-365e-b90f-fdb5f76a88a0}, hash: A8AC04340216A1A38637203D9AE34821
    @Ignore()
    @Test()
    public void getWhenNotFoundCacheGetHashIsNotNull() throws BlockStoreException {
        /* Branches:
         * (buffer == null) : false
         * (cacheHit != null) : false
         * (notFoundCache.get(hash) != null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: randomAccessFile
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParameters = NetworkParameters.fromID("id1");
        File file = new File("pathname1");
        target = new SPVBlockStore(networkParameters, file, 0, false);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        //Act Statement(s)
        StoredBlock result = target.get(sha256Hash);
        //Assert statement(s)
        assertThat(result, is(nullValue()));
    }

    //Sapient generated method id: ${2e1c8329-57d5-3da3-ab2a-1345f9b1d106}, hash: 3CC7833D5A60A44F1B7DA2FA82569C4F
    @Ignore()
    @Test()
    public void getWhenCLessThanFILE_PROLOGUE_BYTESThrowsIllegalStateException() throws BlockStoreException {
        /* Branches:
         * (buffer == null) : false
         * (cacheHit != null) : false
         * (notFoundCache.get(hash) != null) : false
         * (c >= FILE_PROLOGUE_BYTES) : false  #  inside getRingCursor method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: randomAccessFile
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParameters = NetworkParameters.fromID("id1");
        File file = new File("pathname1");
        target = new SPVBlockStore(networkParameters, file, 0, false);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        thrown.expect(IllegalStateException.class);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        //Act Statement(s)
        target.get(sha256Hash);
    }

    //Sapient generated method id: ${14a317c1-2209-3fa2-b375-7faa6d16b383}, hash: 49CC2D5555CB8BE76AC2D655D3568BE9
    @Ignore()
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
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: randomAccessFile, buffer
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        StoredBlock storedBlockMock = mock(StoredBlock.class);
        try (MockedStatic<StoredBlock> storedBlock = mockStatic(StoredBlock.class)) {
            storedBlock.when(() -> StoredBlock.deserializeCompact((ByteBuffer) any())).thenReturn(storedBlockMock);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            File file = new File("pathname1");
            target = new SPVBlockStore(networkParameters, file, 0, false);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            //Act Statement(s)
            StoredBlock result = target.get(sha256Hash);
            //Assert statement(s)
            assertThat(result, equalTo(storedBlockMock));
            storedBlock.verify(() -> StoredBlock.deserializeCompact((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${a1f113d6-4400-3808-857b-965ff9bf12b0}, hash: 9ACAD570897F60546313987CBFF04966
    @Ignore()
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
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: randomAccessFile, buffer
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        StoredBlock storedBlockMock = mock(StoredBlock.class);
        try (MockedStatic<StoredBlock> storedBlock = mockStatic(StoredBlock.class)) {
            storedBlock.when(() -> StoredBlock.deserializeCompact((ByteBuffer) any())).thenReturn(storedBlockMock);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            File file = new File("pathname1");
            target = new SPVBlockStore(networkParameters, file, 0, false);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(RuntimeException.class);
            thrown.expectCause(is(instanceOf(ProtocolException.class)));
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
            //Act Statement(s)
            target.get(sha256Hash);
            //Assert statement(s)
            storedBlock.verify(() -> StoredBlock.deserializeCompact((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${3a8e940e-a7e2-3583-960a-79a834747bd5}, hash: E08E500B9E6E0470D3A8888626334728
    @Ignore()
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
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: randomAccessFile, buffer
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParameters = NetworkParameters.fromID("id1");
        File file = new File("pathname1");
        target = new SPVBlockStore(networkParameters, file, 0, false);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        //Act Statement(s)
        StoredBlock result = target.get(sha256Hash);
        //Assert statement(s)
        assertThat(result, is(nullValue()));
    }

    //Sapient generated method id: ${0b76fefc-4c6b-37b8-bebf-d70bef044ce2}, hash: 62CA02C96B3C1D8BD4D1CA029E3C6D9F
    @Ignore()
    @Test()
    public void getChainHeadWhenBufferIsNullThrowsBlockStoreException() throws BlockStoreException {
        /* Branches:
         * (buffer == null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: randomAccessFile
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParameters = NetworkParameters.fromID("id1");
        File file = new File("pathname1");
        target = new SPVBlockStore(networkParameters, file, 0, false);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        BlockStoreException blockStoreException = new BlockStoreException("Store closed");
        thrown.expect(BlockStoreException.class);
        thrown.expectMessage(blockStoreException.getMessage());
        //Act Statement(s)
        target.getChainHead();
    }

    //Sapient generated method id: ${e89a43a8-cd84-37c9-b753-86071fb254c2}, hash: 72DEB004A980A9D524A3B65EF795E994
    @Ignore()
    @Test()
    public void getChainHeadWhenBlockIsNullThrowsBlockStoreException() throws BlockStoreException {
        /* Branches:
         * (buffer == null) : false
         * (lastChainHead == null) : true
         * (block == null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: randomAccessFile, buffer
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            Sha256Hash sha256Hash2 = Sha256Hash.wrap(byteArray);
            sha256Hash.when(() -> Sha256Hash.wrap(byteArray)).thenReturn(sha256Hash2);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            File file = new File("pathname1");
            target = spy(new SPVBlockStore(networkParameters, file, 0, false));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
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

    //Sapient generated method id: ${e4aa7cfd-7f36-36e9-be2a-82622c1d638f}, hash: 980B69F196E8B0C45A9A20C44FAC4624
    @Ignore()
    @Test()
    public void getChainHeadWhenBlockIsNotNull() throws BlockStoreException, VerificationException {
        /* Branches:
         * (buffer == null) : false
         * (lastChainHead == null) : true
         * (block == null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: randomAccessFile
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Block blockMock = mock(Block.class);
        doReturn(blockMock).when(paramsMock).getGenesisBlock();
        Block blockMock2 = mock(Block.class);
        doReturn(blockMock2).when(blockMock).cloneAsHeader();
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        doReturn(sha256HashMock).when(blockMock2).getHash();
        byte[] byteArray = new byte[]{};
        doReturn(byteArray).when(sha256HashMock).getBytes();
        doReturn(new BigInteger("0")).when(blockMock).getWork();
        File file = new File("pathname1");
        target = spy(new SPVBlockStore(paramsMock, file, 1, false));
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        StoredBlock storedBlockMock = mock(StoredBlock.class);
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

    //Sapient generated method id: ${df3f5737-d066-350f-9b2d-e156f76ebbde}, hash: 805CCE2492892FE918EB0348A39C3BF7
    @Ignore()
    @Test()
    public void setChainHeadWhenBufferIsNullThrowsBlockStoreException() throws BlockStoreException {
        /* Branches:
         * (buffer == null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: randomAccessFile
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParameters = NetworkParameters.fromID("id1");
        File file = new File("pathname1");
        target = new SPVBlockStore(networkParameters, file, 0, false);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        BlockStoreException blockStoreException = new BlockStoreException("Store closed");
        thrown.expect(BlockStoreException.class);
        thrown.expectMessage(blockStoreException.getMessage());
        Block blockMock = mock(Block.class, "Block");
        StoredBlock storedBlock = new StoredBlock(blockMock, (BigInteger) null, 0);
        //Act Statement(s)
        target.setChainHead(storedBlock);
    }

    //Sapient generated method id: ${4f05edba-7a8f-3e5a-8be9-5904c177544b}, hash: 5F9ABB4FE99FD7AB32F69C65E6D87323
    @Ignore()
    @Test()
    public void setChainHeadWhenBufferIsNotNull() throws BlockStoreException {
        /* Branches:
         * (buffer == null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: randomAccessFile
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Block blockMock = mock(Block.class, "Block");
        doReturn(null).when(blockMock).getHash();
        NetworkParameters networkParameters = NetworkParameters.fromID("id1");
        File file = new File("pathname1");
        target = new SPVBlockStore(networkParameters, file, 0, false);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        thrown.expect(NullPointerException.class);
        StoredBlock storedBlock = new StoredBlock(blockMock, (BigInteger) null, 0);
        //Act Statement(s)
        target.setChainHead(storedBlock);
        //Assert statement(s)
        verify(blockMock).getHash();
    }

    //Sapient generated method id: ${4338ea80-df41-3c09-b3eb-b0476a460c1f}, hash: 2C5EDF85CD382BA6A89CBC69B0A26291
    @Ignore()
    @Test()
    public void closeTest() throws BlockStoreException, IOException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: randomAccessFile
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParameters = NetworkParameters.fromID("id1");
        File file = new File("pathname1");
        target = new SPVBlockStore(networkParameters, file, 0, false);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        target.close();
    }

    //Sapient generated method id: ${21e5fedc-2c77-3849-9c9a-a8d6a7034b13}, hash: F80ADA697CFFE4F4F44E0E4E38C4A4C3
    @Ignore()
    @Test()
    public void closeWhenCaughtIOExceptionThrowsBlockStoreException() throws BlockStoreException, VerificationException, IOException {
        /* Branches:
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: randomAccessFile, channel
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Threading> threading = mockStatic(Threading.class)) {
            ReentrantLock reentrantLock = Threading.lock(SPVBlockStore.class);
            threading.when(() -> Threading.lock(SPVBlockStore.class)).thenReturn(reentrantLock);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            File file = new File("pathname1");
            target = new SPVBlockStore(networkParameters, file, 1, false);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(fileLockMock).release();
            doNothing().when(randomAccessFileMock).close();
            thrown.expect(BlockStoreException.class);
            //Act Statement(s)
            target.close();
            //Assert statement(s)
            threading.verify(() -> Threading.lock(SPVBlockStore.class), atLeast(1));
            verify(fileLockMock).release();
            verify(randomAccessFileMock).close();
        }
    }

    //Sapient generated method id: ${408fcabb-71db-3e6f-a075-8be533a65138}, hash: 57B33AAA826BEB625FB56E47A40A2AFB
    @Ignore()
    @Test()
    public void clearWhenNewCursorGreaterThanOrEqualsTo0() throws Exception, VerificationException, BlockStoreException {
        /* Branches:
         * (i < fileLength) : true
         * (newCursor >= 0) : true  #  inside setRingCursor method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: randomAccessFile
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Block blockMock = mock(Block.class);
        Block blockMock2 = mock(Block.class);
        doReturn(blockMock2).when(blockMock).cloneAsHeader();
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        doReturn(sha256HashMock).when(blockMock2).getHash();
        byte[] byteArray = new byte[]{};
        doReturn(byteArray).when(sha256HashMock).getBytes();
        doReturn(new BigInteger("0")).when(blockMock).getWork();
        File file = new File("pathname1");
        target = spy(new SPVBlockStore(paramsMock, file, 1, false));
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
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
