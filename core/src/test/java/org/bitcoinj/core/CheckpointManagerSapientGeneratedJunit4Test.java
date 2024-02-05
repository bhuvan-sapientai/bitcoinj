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

import static org.hamcrest.core.IsInstanceOf.instanceOf;

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
        NetworkParameters networkParameters = NetworkParameters.fromID("id1");
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
            doReturn("A").when(paramsMock).getId();
            StoredBlock storedBlock2 = new StoredBlock(blockMock, new BigInteger("0"), 0);
            storedBlock.when(() -> StoredBlock.deserializeCompact((ByteBuffer) any())).thenReturn(storedBlock2);
            timeUtils.when(() -> TimeUtils.dateTimeFormat((Instant) any())).thenReturn("return_of_dateTimeFormat1");
            byte[] byteArray = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.wrap(byteArray)).thenReturn(sha256HashMock);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            CheckpointManager target = new CheckpointManager(paramsMock, (InputStream) null);
            doReturn(blockMock2).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock2).time();
            Instant instant2 = Instant.now();
            //Act Statement(s)
            StoredBlock result = target.getCheckpointBefore(instant2);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            verify(paramsMock, atLeast(1)).getId();
            storedBlock.verify(() -> StoredBlock.deserializeCompact((ByteBuffer) any()), atLeast(1));
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
            doReturn("A").when(paramsMock).getId();
            StoredBlock storedBlock2 = new StoredBlock(blockMock, new BigInteger("0"), 0);
            storedBlock.when(() -> StoredBlock.deserializeCompact((ByteBuffer) any())).thenReturn(storedBlock2);
            timeUtils.when(() -> TimeUtils.dateTimeFormat((Instant) any())).thenReturn("return_of_dateTimeFormat1");
            byte[] byteArray = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.wrap(byteArray)).thenReturn(sha256HashMock);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            CheckpointManager target = new CheckpointManager(paramsMock, (InputStream) null);
            doReturn(blockMock2).when(paramsMock).getGenesisBlock();
            doReturn(blockMock3).when(blockMock2).cloneAsHeader();
            doReturn(new BigInteger("0")).when(blockMock3).getWork();
            Instant instant = Instant.now();
            //Act Statement(s)
            StoredBlock result = target.getCheckpointBefore(instant);
            StoredBlock storedBlock3 = new StoredBlock(blockMock3, new BigInteger("0"), 0);
            //Assert statement(s)
            assertThat(result, equalTo(storedBlock3));
            verify(paramsMock, atLeast(1)).getId();
            storedBlock.verify(() -> StoredBlock.deserializeCompact((ByteBuffer) any()), atLeast(1));
            timeUtils.verify(() -> TimeUtils.dateTimeFormat((Instant) any()), atLeast(1));
            sha256Hash.verify(() -> Sha256Hash.wrap(byteArray), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            verify(paramsMock, atLeast(1)).getGenesisBlock();
            verify(blockMock2, atLeast(1)).cloneAsHeader();
            verify(blockMock3, atLeast(1)).getWork();
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
            doReturn("A").when(paramsMock).getId();
            StoredBlock storedBlock2 = new StoredBlock(blockMock, new BigInteger("0"), 0);
            storedBlock.when(() -> StoredBlock.deserializeCompact((ByteBuffer) any())).thenReturn(storedBlock2);
            timeUtils.when(() -> TimeUtils.dateTimeFormat((Instant) any())).thenReturn("return_of_dateTimeFormat1");
            byte[] byteArray = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.wrap(byteArray)).thenReturn(sha256HashMock);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            CheckpointManager target = new CheckpointManager(paramsMock, (InputStream) null);
            doReturn(blockMock2).when(paramsMock).getGenesisBlock();
            Instant instant = Instant.now();
            doReturn(instant).when(blockMock2).time();
            thrown.expect(RuntimeException.class);
            thrown.expectCause(is(instanceOf(VerificationException.class)));
            Instant instant2 = Instant.now();
            //Act Statement(s)
            target.getCheckpointBefore(instant2);
            //Assert statement(s)
            verify(paramsMock, atLeast(1)).getId();
            storedBlock.verify(() -> StoredBlock.deserializeCompact((ByteBuffer) any()), atLeast(1));
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
            doReturn("A").when(paramsMock).getId();
            StoredBlock storedBlock2 = new StoredBlock(blockMock, new BigInteger("0"), 0);
            storedBlock.when(() -> StoredBlock.deserializeCompact((ByteBuffer) any())).thenReturn(storedBlock2);
            timeUtils.when(() -> TimeUtils.dateTimeFormat((Instant) any())).thenReturn("return_of_dateTimeFormat1");
            byte[] byteArray = new byte[]{};
            sha256Hash.when(() -> Sha256Hash.wrap(byteArray)).thenReturn(sha256HashMock);
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            CheckpointManager target = new CheckpointManager(paramsMock, (InputStream) null);
            doReturn(blockMock2).when(paramsMock).getGenesisBlock();
            doReturn(blockMock3).when(blockMock2).cloneAsHeader();
            doReturn(new BigInteger("0")).when(blockMock3).getWork();
            thrown.expect(RuntimeException.class);
            thrown.expectCause(is(instanceOf(VerificationException.class)));
            Instant instant = Instant.now();
            //Act Statement(s)
            target.getCheckpointBefore(instant);
            //Assert statement(s)
            verify(paramsMock, atLeast(1)).getId();
            storedBlock.verify(() -> StoredBlock.deserializeCompact((ByteBuffer) any()), atLeast(1));
            timeUtils.verify(() -> TimeUtils.dateTimeFormat((Instant) any()), atLeast(1));
            sha256Hash.verify(() -> Sha256Hash.wrap(byteArray), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            verify(paramsMock, atLeast(1)).getGenesisBlock();
            verify(blockMock2, atLeast(1)).cloneAsHeader();
            verify(blockMock3, atLeast(1)).getWork();
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
            NetworkParameters networkParameters = NetworkParameters.fromID("A");
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
            NetworkParameters networkParameters = NetworkParameters.fromID("A");
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

    //Sapient generated method id: ${80743552-f341-3c4d-b1ab-8fd557cd048c}
    @Ignore()
    @Test()
    public void checkpointWhenStoreNotInstanceOfFullPrunedBlockStoreThrowsIllegalArgumentException() throws IOException, BlockStoreException {
        /* Branches:
         * (!(store instanceof FullPrunedBlockStore)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            thrown.expect(IllegalArgumentException.class);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            Instant instant = Instant.now();
            //Act Statement(s)
            CheckpointManager.checkpoint(networkParametersMock, inputStream, blockStoreMock, instant);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${859b6fc3-b475-3878-8c6f-36f0c8a54d31}
    @Test()
    public void checkpointWhenStoreInstanceOfFullPrunedBlockStoreThrowsIllegalArgumentException() throws IOException, BlockStoreException {
        /* Branches:
         * (!(store instanceof FullPrunedBlockStore)) : false
         */
        //Arrange Statement(s)
        FullPrunedBlockStore fullPrunedBlockStoreMock = mock(FullPrunedBlockStore.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            thrown.expect(IllegalArgumentException.class);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            Instant instant = Instant.now();
            //Act Statement(s)
            CheckpointManager.checkpoint(networkParametersMock, inputStream, (BlockStore) fullPrunedBlockStoreMock, instant);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
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
