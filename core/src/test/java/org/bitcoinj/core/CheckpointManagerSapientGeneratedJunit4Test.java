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

import java.util.function.Supplier;

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
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.isA;

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

    //Sapient generated method id: ${1357c875-a8e5-369a-b570-474f9b7f3e31}
    @Ignore()
    @Test()
    public void openStreamTest() {
        //Arrange Statement(s)
        NetworkParameters networkParameters = NetworkParameters.fromID("testnet");
        //Act Statement(s)
        InputStream result = CheckpointManager.openStream(networkParameters);
        //Assert statement(s)
        assertThat(result, is(nullValue()));
    }

    //Sapient generated method id: ${0fe979c8-f2cf-36cf-b76b-50a9fc2d193f}
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
            doReturn("F").when(paramsMock).getId();
            StoredBlock storedBlock2 = new StoredBlock(blockMock, new BigInteger("0"), 0);
            storedBlock.when(() -> StoredBlock.deserializeCompact((ByteBuffer) any())).thenReturn(storedBlock2);
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            timeUtils.when(() -> TimeUtils.dateTimeFormat((Instant) any())).thenReturn("return_of_dateTimeFormat1");
            byte[] byteArray = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.wrap(byteArray)).thenReturn(sha256HashMock);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            CheckpointManager target = new CheckpointManager(paramsMock, (InputStream) null);
            doReturn(blockMock2).when(paramsMock).getGenesisBlock();
            Instant instant2 = Instant.now();
            doReturn(instant2).when(blockMock2).time();
            Instant instant3 = Instant.now();
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

    //Sapient generated method id: ${9d890a48-63b3-38a9-a52a-bd9634be8341}
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
            doReturn("F").when(paramsMock).getId();
            StoredBlock storedBlock2 = new StoredBlock(blockMock, new BigInteger("0"), 0);
            storedBlock.when(() -> StoredBlock.deserializeCompact((ByteBuffer) any())).thenReturn(storedBlock2);
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            timeUtils.when(() -> TimeUtils.dateTimeFormat((Instant) any())).thenReturn("return_of_dateTimeFormat1");
            byte[] byteArray = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.wrap(byteArray)).thenReturn(sha256HashMock);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            CheckpointManager target = new CheckpointManager(paramsMock, (InputStream) null);
            Instant instant2 = Instant.now();
            doReturn(instant2).when(blockMock2).time();
            doReturn(blockMock2, blockMock3).when(paramsMock).getGenesisBlock();
            doReturn(blockMock4).when(blockMock3).cloneAsHeader();
            doReturn(new BigInteger("0")).when(blockMock4).getWork();
            Instant instant3 = Instant.now();
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

    //Sapient generated method id: ${3f40c0d0-507d-3f89-8efa-99f285ca7d5c}
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
            doReturn("F").when(paramsMock).getId();
            StoredBlock storedBlock2 = new StoredBlock(blockMock, new BigInteger("0"), 0);
            storedBlock.when(() -> StoredBlock.deserializeCompact((ByteBuffer) any())).thenReturn(storedBlock2);
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            timeUtils.when(() -> TimeUtils.dateTimeFormat((Instant) any())).thenReturn("return_of_dateTimeFormat1");
            byte[] byteArray = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.wrap(byteArray)).thenReturn(sha256HashMock);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            CheckpointManager target = new CheckpointManager(paramsMock, (InputStream) null);
            doReturn(blockMock2).when(paramsMock).getGenesisBlock();
            Instant instant2 = Instant.now();
            doReturn(instant2).when(blockMock2).time();
            thrown.expect(RuntimeException.class);
            thrown.expectCause(isA(VerificationException.class));
            Instant instant3 = Instant.now();
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

    //Sapient generated method id: ${7fb8506f-ec3e-3aa0-8f64-9e09e66a9b0d}
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
            doReturn("F").when(paramsMock).getId();
            StoredBlock storedBlock2 = new StoredBlock(blockMock, new BigInteger("0"), 0);
            storedBlock.when(() -> StoredBlock.deserializeCompact((ByteBuffer) any())).thenReturn(storedBlock2);
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            timeUtils.when(() -> TimeUtils.dateTimeFormat((Instant) any())).thenReturn("return_of_dateTimeFormat1");
            byte[] byteArray = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.wrap(byteArray)).thenReturn(sha256HashMock);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            CheckpointManager target = new CheckpointManager(paramsMock, (InputStream) null);
            Instant instant2 = Instant.now();
            doReturn(instant2).when(blockMock2).time();
            doReturn(blockMock2, blockMock3).when(paramsMock).getGenesisBlock();
            doReturn(blockMock4).when(blockMock3).cloneAsHeader();
            doReturn(new BigInteger("0")).when(blockMock4).getWork();
            thrown.expect(RuntimeException.class);
            thrown.expectCause(isA(VerificationException.class));
            Instant instant3 = Instant.now();
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

    //Sapient generated method id: ${6f6250dc-6ac8-3030-a416-c656001ef4a6}
    @Ignore()
    @Test()
    public void getCheckpointBefore1Test() throws IOException {
        /**
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
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            timeUtils.when(() -> TimeUtils.dateTimeFormat((Instant) any())).thenReturn("return_of_dateTimeFormat1");
            byte[] byteArray = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.wrap(byteArray)).thenReturn(sha256HashMock);
            NetworkParameters networkParameters = NetworkParameters.fromID("F");
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

    //Sapient generated method id: ${b34c1b6b-9796-3cbc-898b-b19e439950e0}
    @Ignore()
    @Test()
    public void numCheckpointsTest() throws IOException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class);
             MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class);
             MockedStatic<StoredBlock> storedBlock = mockStatic(StoredBlock.class)) {
            StoredBlock storedBlock2 = new StoredBlock(blockMock, new BigInteger("0"), 0);
            storedBlock.when(() -> StoredBlock.deserializeCompact((ByteBuffer) any())).thenReturn(storedBlock2);
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            timeUtils.when(() -> TimeUtils.dateTimeFormat((Instant) any())).thenReturn("return_of_dateTimeFormat1");
            byte[] byteArray = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.wrap(byteArray)).thenReturn(sha256HashMock);
            NetworkParameters networkParameters = NetworkParameters.fromID("F");
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

    //Sapient generated method id: ${074db5cd-ec19-335c-bbc6-afb8b0270ce1}
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
        try (MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            timeUtils.when(() -> TimeUtils.dateTimeFormat((Instant) any())).thenReturn("return_of_dateTimeFormat1");
            IOException iOException = new IOException("Header bytes did not match expected version");
            thrown.expect(IOException.class);
            thrown.expectMessage(iOException.getMessage());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            Instant instant = Instant.now();
            //Act Statement(s)
            CheckpointManager.checkpoint(networkParametersMock, inputStream, blockStoreMock, instant);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            timeUtils.verify(() -> TimeUtils.dateTimeFormat((Instant) any()));
        }
    }

    //Sapient generated method id: ${c47daa01-8e51-3417-9f67-d71e3c5af23a}
    @Test()
    public void checkpointWhenDefaultBranchAndDefaultBranchThrowsIOException() throws IOException, BlockStoreException {
        /* Branches:
         * (!(store instanceof FullPrunedBlockStore)) : false
         * (branch expression (line 101)) : false  #  inside <init> method
         * (branch expression (line 108)) : false  #  inside <init> method
         * (branch expression (line 110)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        FullPrunedBlockStore fullPrunedBlockStoreMock = mock(FullPrunedBlockStore.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            IOException iOException = new IOException("Unsupported format.");
            thrown.expect(IOException.class);
            thrown.expectMessage(iOException.getMessage());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            Instant instant = Instant.now();
            //Act Statement(s)
            CheckpointManager.checkpoint(networkParametersMock, inputStream, (BlockStore) fullPrunedBlockStoreMock, instant);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${9ec088d2-8183-3fc2-b875-fa137e005887}
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
        try (MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            timeUtils.when(() -> TimeUtils.dateTimeFormat((Instant) any())).thenReturn("return_of_dateTimeFormat1");
            IOException iOException = new IOException("unexpected magic: ");
            thrown.expect(IOException.class);
            thrown.expectMessage(iOException.getMessage());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            Instant instant = Instant.now();
            //Act Statement(s)
            CheckpointManager.checkpoint(networkParametersMock, inputStream, blockStoreMock, instant);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            timeUtils.verify(() -> TimeUtils.dateTimeFormat((Instant) any()));
        }
    }

    //Sapient generated method id: ${b7104d2c-7226-3a2e-a881-0b43e6957b1a}
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
        try (MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            timeUtils.when(() -> TimeUtils.dateTimeFormat((Instant) any())).thenReturn("return_of_dateTimeFormat1");
            IOException iOException = new IOException("unexpected magic: ");
            thrown.expect(IOException.class);
            thrown.expectMessage(iOException.getMessage());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            Instant instant = Instant.now();
            //Act Statement(s)
            CheckpointManager.checkpoint(networkParametersMock, inputStream, blockStoreMock, instant);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            timeUtils.verify(() -> TimeUtils.dateTimeFormat((Instant) any()));
        }
    }

    //Sapient generated method id: ${e3a46af6-86fa-3a85-b424-e81a4fb05e10}
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
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            timeUtils.when(() -> TimeUtils.dateTimeFormat((Instant) any())).thenReturn("return_of_dateTimeFormat1");
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(false)).thenThrow(illegalStateException);
            IOException iOException = new IOException("unexpected magic: ");
            thrown.expect(IOException.class);
            thrown.expectMessage(iOException.getMessage());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            Instant instant = Instant.now();
            //Act Statement(s)
            CheckpointManager.checkpoint(networkParametersMock, inputStream, blockStoreMock, instant);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            timeUtils.verify(() -> TimeUtils.dateTimeFormat((Instant) any()));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
        }
    }

    //Sapient generated method id: ${734bd72b-a3c1-32cd-93f2-3d0cbf55b4f4}
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
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BlockStore storeMock = mock(BlockStore.class);
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class);
             MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class);
             MockedStatic<StoredBlock> storedBlock = mockStatic(StoredBlock.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            doNothing().when(storeMock).put((StoredBlock) any());
            doNothing().when(storeMock).setChainHead((StoredBlock) any());
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            timeUtils.when(() -> TimeUtils.dateTimeFormat((Instant) any())).thenReturn("return_of_dateTimeFormat1");
            StoredBlock storedBlock2 = new StoredBlock(blockMock, new BigInteger("0"), 0);
            storedBlock.when(() -> StoredBlock.deserializeCompact((ByteBuffer) any())).thenReturn(storedBlock2);
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock).time();
            byte[] byteArray = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.wrap(byteArray)).thenReturn(sha256HashMock);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            Instant instant2 = Instant.now();
            //Act Statement(s)
            CheckpointManager.checkpoint(networkParametersMock, inputStream, storeMock, instant2);
            //Assert statement(s)
            verify(storeMock, atLeast(1)).put((StoredBlock) any());
            verify(storeMock, atLeast(1)).setChainHead((StoredBlock) any());
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            timeUtils.verify(() -> TimeUtils.dateTimeFormat((Instant) any()), atLeast(2));
            storedBlock.verify(() -> StoredBlock.deserializeCompact((ByteBuffer) any()), atLeast(1));
            verify(blockMock, atLeast(1)).time();
            sha256Hash.verify(() -> Sha256Hash.wrap(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${c2484d90-4e13-3062-b70b-8bcde46f78a7}
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
