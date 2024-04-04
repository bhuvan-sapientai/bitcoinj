package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;

import org.bitcoinj.store.BlockStoreException;
import org.junit.rules.ExpectedException;

import java.io.ByteArrayInputStream;

import org.bitcoinj.store.FullPrunedBlockStore;

import java.math.BigInteger;
import java.io.InputStream;

import org.mockito.stubbing.Answer;
import org.bitcoinj.base.internal.TimeUtils;

import java.nio.ByteBuffer;

import org.bitcoinj.base.internal.Preconditions;
import org.bitcoinj.store.BlockStore;
import org.bitcoinj.base.Sha256Hash;
import org.mockito.MockedStatic;

import java.time.Instant;
import java.io.ByteArrayOutputStream;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

public class CheckpointManagerSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final NetworkParameters paramsMock = mock(NetworkParameters.class, "params");

    private final Block blockMock = mock(Block.class);

    private final Block blockMock2 = mock(Block.class);

    private final Block blockMock3 = mock(Block.class);

    private final Block blockMock4 = mock(Block.class);

    private final BlockStore blockStoreMock = mock(BlockStore.class);

    private final NetworkParameters networkParametersMock = mock(NetworkParameters.class);

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${1357c875-a8e5-369a-b570-474f9b7f3e31}, hash: 670C854D38B36ABA26D751CA3440C772
    @Ignore()
    @Test()
    public void openStreamTest() {
        //Arrange Statement(s)
        NetworkParameters networkParameters = NetworkParameters.fromID("mainnet");
        //Act Statement(s)
        InputStream result = CheckpointManager.openStream(networkParameters);
        //Assert statement(s)
        assertThat(result, is(nullValue()));
    }

    //Sapient generated method id: ${0fe979c8-f2cf-36cf-b76b-50a9fc2d193f}, hash: 73B848385B37EE6A29C29882146EC2E1
    @Ignore()
    @Test()
    public void getCheckpointBeforeWhenEntryIsNotNull() throws IOException {
        /* Branches:
         * (entry != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS);
             MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class);
             MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class);
             MockedStatic<StoredBlock> storedBlock = mockStatic(StoredBlock.class)) {
            doReturn("").when(paramsMock).getId();
            StoredBlock storedBlock2 = new StoredBlock(blockMock, new BigInteger("0"), 0);
            storedBlock.when(() -> StoredBlock.deserializeCompact((ByteBuffer) any())).thenReturn(storedBlock2);
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            timeUtils.when(() -> TimeUtils.dateTimeFormat((Instant) any())).thenReturn("return_of_dateTimeFormat1");
            byte[] byteArray = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.wrap(byteArray)).thenReturn(sha256HashMock);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            CheckpointManager target = new CheckpointManager(paramsMock, (InputStream) null);
            doReturn(blockMock2).when(paramsMock).getGenesisBlock();
            Instant instant2 = Instant.ofEpochSecond(1700000000);
            doReturn(instant2).when(blockMock2).time();
            Instant instant3 = Instant.ofEpochSecond(1700000000);
            //Act Statement(s)
            StoredBlock result = target.getCheckpointBefore(instant3);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            verify(paramsMock, atLeast(1)).getId();
            storedBlock.verify(() -> StoredBlock.deserializeCompact((ByteBuffer) any()), atLeast(1));
            verify(blockMock, atLeast(1)).time();
            timeUtils.verify(() -> TimeUtils.dateTimeFormat((Instant) any()), atLeast(1));
            sha256Hash.verify(() -> Sha256Hash.wrap(byteArray), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            verify(paramsMock, atLeast(1)).getGenesisBlock();
            verify(blockMock2, atLeast(1)).time();
        }
    }

    //Sapient generated method id: ${9d890a48-63b3-38a9-a52a-bd9634be8341}, hash: 93ED67DC3B2570C92CB1C32245454092
    @Ignore()
    @Test()
    public void getCheckpointBeforeWhenEntryIsNull() throws VerificationException, IOException {
        /* Branches:
         * (entry != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS);
             MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class);
             MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class);
             MockedStatic<StoredBlock> storedBlock = mockStatic(StoredBlock.class)) {
            doReturn("").when(paramsMock).getId();
            StoredBlock storedBlock2 = new StoredBlock(blockMock, new BigInteger("0"), 0);
            storedBlock.when(() -> StoredBlock.deserializeCompact((ByteBuffer) any())).thenReturn(storedBlock2);
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            timeUtils.when(() -> TimeUtils.dateTimeFormat((Instant) any())).thenReturn("return_of_dateTimeFormat1");
            byte[] byteArray = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.wrap(byteArray)).thenReturn(sha256HashMock);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            CheckpointManager target = new CheckpointManager(paramsMock, (InputStream) null);
            Instant instant2 = Instant.ofEpochSecond(1700000000);
            doReturn(instant2).when(blockMock2).time();
            doReturn(blockMock2, blockMock3).when(paramsMock).getGenesisBlock();
            doReturn(blockMock4).when(blockMock3).cloneAsHeader();
            doReturn(new BigInteger("0")).when(blockMock4).getWork();
            Instant instant3 = Instant.ofEpochSecond(1700000000);
            //Act Statement(s)
            StoredBlock result = target.getCheckpointBefore(instant3);
            StoredBlock storedBlock3 = new StoredBlock(blockMock4, new BigInteger("0"), 0);
            //Assert statement(s)
            assertThat(result, equalTo(storedBlock3));
            verify(paramsMock, atLeast(1)).getId();
            storedBlock.verify(() -> StoredBlock.deserializeCompact((ByteBuffer) any()), atLeast(1));
            verify(blockMock, atLeast(1)).time();
            timeUtils.verify(() -> TimeUtils.dateTimeFormat((Instant) any()), atLeast(1));
            sha256Hash.verify(() -> Sha256Hash.wrap(byteArray), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            verify(paramsMock, times(2)).getGenesisBlock();
            verify(blockMock2, atLeast(1)).time();
            verify(blockMock3, atLeast(1)).cloneAsHeader();
            verify(blockMock4, atLeast(1)).getWork();
        }
    }

    //Sapient generated method id: ${3f40c0d0-507d-3f89-8efa-99f285ca7d5c}, hash: 9747DC100E4A98324BBFCBA91E4FAB98
    @Ignore()
    @Test()
    public void getCheckpointBeforeWhenCaughtVerificationExceptionThrowsRuntimeException() throws IOException {
        /* Branches:
         * (entry != null) : true
         * (catch-exception (VerificationException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS);
             MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class);
             MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class);
             MockedStatic<StoredBlock> storedBlock = mockStatic(StoredBlock.class)) {
            doReturn("").when(paramsMock).getId();
            StoredBlock storedBlock2 = new StoredBlock(blockMock, new BigInteger("0"), 0);
            storedBlock.when(() -> StoredBlock.deserializeCompact((ByteBuffer) any())).thenReturn(storedBlock2);
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            timeUtils.when(() -> TimeUtils.dateTimeFormat((Instant) any())).thenReturn("return_of_dateTimeFormat1");
            byte[] byteArray = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.wrap(byteArray)).thenReturn(sha256HashMock);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            CheckpointManager target = new CheckpointManager(paramsMock, (InputStream) null);
            doReturn(blockMock2).when(paramsMock).getGenesisBlock();
            Instant instant2 = Instant.ofEpochSecond(1700000000);
            doReturn(instant2).when(blockMock2).time();
            thrown.expect(RuntimeException.class);
            thrown.expectCause(is(instanceOf(VerificationException.class)));
            Instant instant3 = Instant.ofEpochSecond(1700000000);
            //Act Statement(s)
            target.getCheckpointBefore(instant3);
            //Assert statement(s)
            verify(paramsMock, atLeast(1)).getId();
            storedBlock.verify(() -> StoredBlock.deserializeCompact((ByteBuffer) any()), atLeast(1));
            verify(blockMock, atLeast(1)).time();
            timeUtils.verify(() -> TimeUtils.dateTimeFormat((Instant) any()), atLeast(1));
            sha256Hash.verify(() -> Sha256Hash.wrap(byteArray), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            verify(paramsMock, atLeast(1)).getGenesisBlock();
            verify(blockMock2, atLeast(1)).time();
        }
    }

    //Sapient generated method id: ${7fb8506f-ec3e-3aa0-8f64-9e09e66a9b0d}, hash: 0F7D096C771F65FD635502A0C870C104
    @Ignore()
    @Test()
    public void getCheckpointBeforeWhenEntryIsNullAndCaughtVerificationExceptionThrowsRuntimeException() throws VerificationException, IOException {
        /* Branches:
         * (entry != null) : false
         * (catch-exception (VerificationException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS);
             MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class);
             MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class);
             MockedStatic<StoredBlock> storedBlock = mockStatic(StoredBlock.class)) {
            doReturn("").when(paramsMock).getId();
            StoredBlock storedBlock2 = new StoredBlock(blockMock, new BigInteger("0"), 0);
            storedBlock.when(() -> StoredBlock.deserializeCompact((ByteBuffer) any())).thenReturn(storedBlock2);
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            timeUtils.when(() -> TimeUtils.dateTimeFormat((Instant) any())).thenReturn("return_of_dateTimeFormat1");
            byte[] byteArray = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.wrap(byteArray)).thenReturn(sha256HashMock);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            CheckpointManager target = new CheckpointManager(paramsMock, (InputStream) null);
            Instant instant2 = Instant.ofEpochSecond(1700000000);
            doReturn(instant2).when(blockMock2).time();
            doReturn(blockMock2, blockMock3).when(paramsMock).getGenesisBlock();
            doReturn(blockMock4).when(blockMock3).cloneAsHeader();
            doReturn(new BigInteger("0")).when(blockMock4).getWork();
            thrown.expect(RuntimeException.class);
            thrown.expectCause(is(instanceOf(VerificationException.class)));
            Instant instant3 = Instant.ofEpochSecond(1700000000);
            //Act Statement(s)
            target.getCheckpointBefore(instant3);
            //Assert statement(s)
            verify(paramsMock, atLeast(1)).getId();
            storedBlock.verify(() -> StoredBlock.deserializeCompact((ByteBuffer) any()), atLeast(1));
            verify(blockMock, atLeast(1)).time();
            timeUtils.verify(() -> TimeUtils.dateTimeFormat((Instant) any()), atLeast(1));
            sha256Hash.verify(() -> Sha256Hash.wrap(byteArray), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            verify(paramsMock, times(2)).getGenesisBlock();
            verify(blockMock2, atLeast(1)).time();
            verify(blockMock3, atLeast(1)).cloneAsHeader();
            verify(blockMock4, atLeast(1)).getWork();
        }
    }

    //Sapient generated method id: ${6f6250dc-6ac8-3030-a416-c656001ef4a6}, hash: E5EB59927A5FBBD6F487E2D95800973B
    @Ignore()
    @Test()
    public void getCheckpointBefore1Test() throws IOException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        StoredBlock storedBlockMock = mock(StoredBlock.class);
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class);
             MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class);
             MockedStatic<StoredBlock> storedBlock = mockStatic(StoredBlock.class)) {
            StoredBlock storedBlock2 = new StoredBlock(blockMock, new BigInteger("0"), 0);
            storedBlock.when(() -> StoredBlock.deserializeCompact((ByteBuffer) any())).thenReturn(storedBlock2);
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            timeUtils.when(() -> TimeUtils.dateTimeFormat((Instant) any())).thenReturn("return_of_dateTimeFormat1");
            byte[] byteArray = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.wrap(byteArray)).thenReturn(sha256HashMock);
            NetworkParameters networkParameters = NetworkParameters.fromID("");
            CheckpointManager target = spy(new CheckpointManager(networkParameters, (InputStream) null));
            doReturn(storedBlockMock).when(target).getCheckpointBefore((Instant) any());
            //Act Statement(s)
            StoredBlock result = target.getCheckpointBefore(1L);
            //Assert statement(s)
            assertThat(result, equalTo(storedBlockMock));
            storedBlock.verify(() -> StoredBlock.deserializeCompact((ByteBuffer) any()));
            verify(blockMock).time();
            timeUtils.verify(() -> TimeUtils.dateTimeFormat((Instant) any()));
            sha256Hash.verify(() -> Sha256Hash.wrap(byteArray), atLeast(1));
            verify(target).getCheckpointBefore((Instant) any());
        }
    }

    //Sapient generated method id: ${b34c1b6b-9796-3cbc-898b-b19e439950e0}, hash: FD4C7BCB935131198BF664A5B4B00876
    @Ignore()
    @Test()
    public void numCheckpointsTest() throws IOException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class);
             MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class);
             MockedStatic<StoredBlock> storedBlock = mockStatic(StoredBlock.class)) {
            StoredBlock storedBlock2 = new StoredBlock(blockMock, new BigInteger("0"), 0);
            storedBlock.when(() -> StoredBlock.deserializeCompact((ByteBuffer) any())).thenReturn(storedBlock2);
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            timeUtils.when(() -> TimeUtils.dateTimeFormat((Instant) any())).thenReturn("return_of_dateTimeFormat1");
            byte[] byteArray = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.wrap(byteArray)).thenReturn(sha256HashMock);
            NetworkParameters networkParameters = NetworkParameters.fromID("");
            CheckpointManager target = new CheckpointManager(networkParameters, (InputStream) null);
            //Act Statement(s)
            int result = target.numCheckpoints();
            //Assert statement(s)
            assertThat(result, equalTo(1));
            storedBlock.verify(() -> StoredBlock.deserializeCompact((ByteBuffer) any()));
            verify(blockMock).time();
            timeUtils.verify(() -> TimeUtils.dateTimeFormat((Instant) any()));
            sha256Hash.verify(() -> Sha256Hash.wrap(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${859b6fc3-b475-3878-8c6f-36f0c8a54d31}, hash: AE8E0826A5359C93C6FDF81661CF80F5
    @Test()
    public void checkpointWhenStoreInstanceOfFullPrunedBlockStoreThrowsIllegalArgumentException() throws IOException, BlockStoreException {
        /* Branches:
         * (!(store instanceof FullPrunedBlockStore)) : false
         */
        //Arrange Statement(s)
        thrown.expect(IllegalArgumentException.class);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        FullPrunedBlockStore fullPrunedBlockStoreMock = mock(FullPrunedBlockStore.class);
        Instant instant = Instant.ofEpochSecond(1700000000);
        //Act Statement(s)
        CheckpointManager.checkpoint(networkParametersMock, inputStream, (BlockStore) fullPrunedBlockStoreMock, instant);
    }

    //Sapient generated method id: ${30727be1-01da-3056-8cb2-52f1c6f8107f}, hash: 186D962B4761326BC5976AC23BEF89A6
    @Test()
    public void checkpointWhenDefaultBranchThrowsIOException() throws IOException, BlockStoreException {
        /* Branches:
         * (!(store instanceof FullPrunedBlockStore)) : true
         * (branch expression (line 101)) : false  #  inside <init> method
         * (branch expression (line 108)) : false  #  inside <init> method
         * (branch expression (line 110)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class)) {
            timeUtils.when(() -> TimeUtils.dateTimeFormat((Instant) any())).thenReturn("return_of_dateTimeFormat1");
            IOException iOException = new IOException("Unsupported format.");
            thrown.expect(IOException.class);
            thrown.expectMessage(iOException.getMessage());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            Instant instant = Instant.ofEpochSecond(1700000000);
            //Act Statement(s)
            CheckpointManager.checkpoint(networkParametersMock, inputStream, blockStoreMock, instant);
            //Assert statement(s)
            timeUtils.verify(() -> TimeUtils.dateTimeFormat((Instant) any()));
        }
    }

    //Sapient generated method id: ${074db5cd-ec19-335c-bbc6-afb8b0270ce1}, hash: 81E094A06C606060CA302286A173CCB4
    @Ignore()
    @Test()
    public void checkpointWhenArraysNotEqualsHeaderBINARY_MAGICGetBytesStandardCharsetsUS_ASCIIThrowsIOException() throws IOException, BlockStoreException {
        /* Branches:
         * (!(store instanceof FullPrunedBlockStore)) : true
         * (branch expression (line 101)) : false  #  inside <init> method
         * (branch expression (line 108)) : false  #  inside <init> method
         * (!Arrays.equals(header, BINARY_MAGIC.getBytes(StandardCharsets.US_ASCII))) : true  #  inside readBinary method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class)) {
            timeUtils.when(() -> TimeUtils.dateTimeFormat((Instant) any())).thenReturn("return_of_dateTimeFormat1");
            IOException iOException = new IOException("Header bytes did not match expected version");
            thrown.expect(IOException.class);
            thrown.expectMessage(iOException.getMessage());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            Instant instant = Instant.ofEpochSecond(1700000000);
            //Act Statement(s)
            CheckpointManager.checkpoint(networkParametersMock, inputStream, blockStoreMock, instant);
            //Assert statement(s)
            timeUtils.verify(() -> TimeUtils.dateTimeFormat((Instant) any()));
        }
    }

    //Sapient generated method id: ${9ec088d2-8183-3fc2-b875-fa137e005887}, hash: 3CD6B039212DA88F5A5B620C1FC156C8
    @Ignore()
    @Test()
    public void checkpointWhenTEXTUAL_MAGICNotEqualsMagicThrowsIOException() throws IOException, BlockStoreException {
        /* Branches:
         * (!(store instanceof FullPrunedBlockStore)) : true
         * (branch expression (line 101)) : false  #  inside <init> method
         * (branch expression (line 108)) : false  #  inside <init> method
         * (branch expression (line 110)) : false  #  inside <init> method
         * (!TEXTUAL_MAGIC.equals(magic)) : true  #  inside readTextual method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class)) {
            timeUtils.when(() -> TimeUtils.dateTimeFormat((Instant) any())).thenReturn("return_of_dateTimeFormat1");
            IOException iOException = new IOException("unexpected magic: ");
            thrown.expect(IOException.class);
            thrown.expectMessage(iOException.getMessage());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            Instant instant = Instant.ofEpochSecond(1700000000);
            //Act Statement(s)
            CheckpointManager.checkpoint(networkParametersMock, inputStream, blockStoreMock, instant);
            //Assert statement(s)
            timeUtils.verify(() -> TimeUtils.dateTimeFormat((Instant) any()));
        }
    }

    //Sapient generated method id: ${b7104d2c-7226-3a2e-a881-0b43e6957b1a}, hash: 07039C3E070C9D4DF2A5B2199EC4ABBD
    @Ignore()
    @Test()
    public void checkpointWhenTEXTUAL_MAGICNotEqualsMagicAndDefaultBranchThrowsIOException() throws IOException, BlockStoreException {
        /* Branches:
         * (!(store instanceof FullPrunedBlockStore)) : true
         * (branch expression (line 101)) : false  #  inside <init> method
         * (branch expression (line 108)) : false  #  inside <init> method
         * (branch expression (line 110)) : false  #  inside <init> method
         * (!TEXTUAL_MAGIC.equals(magic)) : true  #  inside readTextual method
         * (branch expression (line 166)) : true  #  inside readTextual method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class)) {
            timeUtils.when(() -> TimeUtils.dateTimeFormat((Instant) any())).thenReturn("return_of_dateTimeFormat1");
            IOException iOException = new IOException("unexpected magic: ");
            thrown.expect(IOException.class);
            thrown.expectMessage(iOException.getMessage());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            Instant instant = Instant.ofEpochSecond(1700000000);
            //Act Statement(s)
            CheckpointManager.checkpoint(networkParametersMock, inputStream, blockStoreMock, instant);
            //Assert statement(s)
            timeUtils.verify(() -> TimeUtils.dateTimeFormat((Instant) any()));
        }
    }

    //Sapient generated method id: ${e3a46af6-86fa-3a85-b424-e81a4fb05e10}, hash: 0F0E452AA6C6A1C3994DA22DCFFDCC7F
    @Ignore()
    @Test()
    public void checkpointWhenNumCheckpointsNotGreaterThan0ThrowsIOException() throws IOException, BlockStoreException {
        /* Branches:
         * (!(store instanceof FullPrunedBlockStore)) : true
         * (branch expression (line 101)) : false  #  inside <init> method
         * (branch expression (line 108)) : false  #  inside <init> method
         * (branch expression (line 110)) : false  #  inside <init> method
         * (!TEXTUAL_MAGIC.equals(magic)) : false  #  inside readTextual method
         * (i < numSigs) : true  #  inside readTextual method
         * (numCheckpoints > 0) : false  #  inside readTextual method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class)) {
            timeUtils.when(() -> TimeUtils.dateTimeFormat((Instant) any())).thenReturn("return_of_dateTimeFormat1");
            IOException iOException = new IOException("unexpected magic: ");
            thrown.expect(IOException.class);
            thrown.expectMessage(iOException.getMessage());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            Instant instant = Instant.ofEpochSecond(1700000000);
            //Act Statement(s)
            CheckpointManager.checkpoint(networkParametersMock, inputStream, blockStoreMock, instant);
            //Assert statement(s)
            timeUtils.verify(() -> TimeUtils.dateTimeFormat((Instant) any()));
        }
    }

    //Sapient generated method id: ${734bd72b-a3c1-32cd-93f2-3d0cbf55b4f4}, hash: 825E69FB989FF2AEB79AD7DFAD6EAFFA
    @Ignore()
    @Test()
    public void checkpointWhenILessThanNumCheckpoints() throws Throwable {
        /* Branches:
         * (!(store instanceof FullPrunedBlockStore)) : true
         * (branch expression (line 101)) : false  #  inside <init> method
         * (branch expression (line 108)) : false  #  inside <init> method
         * (branch expression (line 110)) : false  #  inside <init> method
         * (!TEXTUAL_MAGIC.equals(magic)) : false  #  inside readTextual method
         * (i < numSigs) : true  #  inside readTextual method
         * (numCheckpoints > 0) : true  #  inside readTextual method
         * (i < numCheckpoints) : true  #  inside readTextual method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: manager
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BlockStore storeMock = mock(BlockStore.class);
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class);
             MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class);
             MockedStatic<StoredBlock> storedBlock = mockStatic(StoredBlock.class)) {
            doNothing().when(storeMock).put((StoredBlock) any());
            doNothing().when(storeMock).setChainHead((StoredBlock) any());
            timeUtils.when(() -> TimeUtils.dateTimeFormat((Instant) any())).thenReturn("return_of_dateTimeFormat1");
            StoredBlock storedBlock2 = new StoredBlock(blockMock, new BigInteger("0"), 0);
            storedBlock.when(() -> StoredBlock.deserializeCompact((ByteBuffer) any())).thenReturn(storedBlock2);
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(blockMock).time();
            byte[] byteArray = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.wrap(byteArray)).thenReturn(sha256HashMock);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            Instant instant2 = Instant.ofEpochSecond(1700000000);
            //Act Statement(s)
            CheckpointManager.checkpoint(networkParametersMock, inputStream, storeMock, instant2);
            //Assert statement(s)
            verify(storeMock).put((StoredBlock) any());
            verify(storeMock).setChainHead((StoredBlock) any());
            timeUtils.verify(() -> TimeUtils.dateTimeFormat((Instant) any()), atLeast(2));
            storedBlock.verify(() -> StoredBlock.deserializeCompact((ByteBuffer) any()));
            verify(blockMock).time();
            sha256Hash.verify(() -> Sha256Hash.wrap(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${c2484d90-4e13-3062-b70b-8bcde46f78a7}, hash: 114E57160F93E10B645F36DBE32C06C4
    @Test()
    public void checkpoint1Test() throws Throwable {
        //Arrange Statement(s)
        try (MockedStatic<CheckpointManager> checkpointManager = mockStatic(CheckpointManager.class, CALLS_REAL_METHODS)) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            checkpointManager.when(() -> CheckpointManager.checkpoint(eq(networkParametersMock), eq(inputStream), eq(blockStoreMock), (Instant) any())).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            CheckpointManager.checkpoint(networkParametersMock, inputStream, blockStoreMock, 1L);
            //Assert statement(s)
            checkpointManager.verify(() -> CheckpointManager.checkpoint(eq(networkParametersMock), eq(inputStream), eq(blockStoreMock), (Instant) any()), atLeast(1));
        }
    }
}
