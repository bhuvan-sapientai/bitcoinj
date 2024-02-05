package org.bitcoinj.params;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.mockito.InjectMocks;
import org.junit.After;
import org.junit.Test;
import org.bitcoinj.core.VerificationException;
import org.bitcoinj.store.BlockStoreException;
import org.junit.rules.ExpectedException;

import java.util.List;

import org.bitcoinj.core.Block;
import org.mockito.MockitoAnnotations;

import java.math.BigInteger;

import org.bitcoinj.base.internal.ByteUtils;

import java.util.ArrayList;

import org.mockito.stubbing.Answer;
import org.bitcoinj.base.internal.Preconditions;
import org.bitcoinj.store.BlockStore;
import org.bitcoinj.base.Sha256Hash;
import org.bitcoinj.base.internal.Stopwatch;

import java.util.function.Supplier;

import org.mockito.MockedStatic;
import org.bitcoinj.core.StoredBlock;

import java.time.Instant;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

import org.junit.Ignore;

public class TestNet3ParamsSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Block genesisBlockMock = mock(Block.class, "genesisBlock");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private TestNet3Params target;

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    @After()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${32a8d14c-b4e9-37a4-9736-3367f8ecb089}
    @Test()
    public void getWhenInstanceIsNull() {
        /* Branches:
         * (instance == null) : true
         */
        //Act Statement(s)
        TestNet3Params result = TestNet3Params.get();
        TestNet3Params testNet3Params = new TestNet3Params();
        //Assert statement(s)
        assertThat(result, equalTo(testNet3Params));
    }

    //Sapient generated method id: ${6af115c8-0813-3ff3-9b71-4c6682fe756c}
    @Ignore()
    @Test()
    public void getGenesisBlockWhenGenesisBlockIsNull() {
        /* Branches:
         * (genesisBlock == null) : true
         */
        //Arrange Statement(s)
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<Block> block = mockStatic(Block.class)) {
            block.when(() -> Block.createGenesis((Instant) any(), eq(486604799L), eq(414098458L))).thenReturn(genesisBlockMock);
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = new TestNet3Params();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(sha256HashMock).when(genesisBlockMock).getHash();
            //Act Statement(s)
            Block result = target.getGenesisBlock();
            //Assert statement(s)
            assertThat(result, equalTo(genesisBlockMock));
            block.verify(() -> Block.createGenesis((Instant) any(), eq(486604799L), eq(414098458L)));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
            verify(genesisBlockMock).getHash();
        }
    }

    //Sapient generated method id: ${5018bc86-ab5b-396f-9b20-9e36225ba334}
    @Ignore()
    @Test()
    public void checkDifficultyTransitionsWhenNextBlockGetDifficultyTargetNotEqualsPrevGetDifficultyTargetThrowsVerificationException() throws VerificationException, BlockStoreException {
        /* Branches:
         * (!isDifficultyTransitionPoint(storedPrev.getHeight())) : true
         * (nextBlock.time().isAfter(testnetDiffDate)) : false
         * (!isDifficultyTransitionPoint(storedPrev.getHeight())) : true  #  inside checkDifficultyTransitions method
         * (nextBlock.getDifficultyTarget() != prev.getDifficultyTarget()) : true  #  inside checkDifficultyTransitions method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Block nextBlockMock = mock(Block.class);
        Instant instant = Instant.now();
        doReturn(instant).when(nextBlockMock).time();
        doReturn(2L).when(nextBlockMock).getDifficultyTarget();
        target = spy(new TestNet3Params());
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(false).when(target).isDifficultyTransitionPoint(2);
        thrown.expect(VerificationException.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        Instant instant2 = Instant.now();
        List list = new ArrayList<>();
        Block block = new Block(0L, sha256HashMock, sha256HashMock2, instant2, 0L, 3L, list);
        StoredBlock storedBlock = new StoredBlock(block, new BigInteger("0"), 2);
        BlockStore blockStoreMock = mock(BlockStore.class);
        //Act Statement(s)
        target.checkDifficultyTransitions(storedBlock, nextBlockMock, blockStoreMock);
        //Assert statement(s)
        verify(nextBlockMock).time();
        verify(nextBlockMock, times(2)).getDifficultyTarget();
        verify(target, times(2)).isDifficultyTransitionPoint(2);
    }

    //Sapient generated method id: ${ecc3e692-0795-3ff9-8f53-327f5e73c919}
    @Ignore()
    @Test()
    public void checkDifficultyTransitionsWhenNextBlockGetDifficultyTargetEqualsPrevGetDifficultyTarget() throws VerificationException, BlockStoreException {
        /* Branches:
         * (!isDifficultyTransitionPoint(storedPrev.getHeight())) : true
         * (nextBlock.time().isAfter(testnetDiffDate)) : false
         * (!isDifficultyTransitionPoint(storedPrev.getHeight())) : true  #  inside checkDifficultyTransitions method
         * (nextBlock.getDifficultyTarget() != prev.getDifficultyTarget()) : false  #  inside checkDifficultyTransitions method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Block nextBlockMock = mock(Block.class);
        Instant instant = Instant.now();
        doReturn(instant).when(nextBlockMock).time();
        doReturn(0L).when(nextBlockMock).getDifficultyTarget();
        target = spy(new TestNet3Params());
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(false).when(target).isDifficultyTransitionPoint(0);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        Instant instant2 = Instant.now();
        List list = new ArrayList<>();
        Block block = new Block(0L, sha256HashMock, sha256HashMock2, instant2, 0L, 0L, list);
        StoredBlock storedBlock = new StoredBlock(block, new BigInteger("0"), 0);
        BlockStore blockStoreMock = mock(BlockStore.class);
        //Act Statement(s)
        target.checkDifficultyTransitions(storedBlock, nextBlockMock, blockStoreMock);
        //Assert statement(s)
        verify(nextBlockMock).time();
        verify(nextBlockMock).getDifficultyTarget();
        verify(target, times(2)).isDifficultyTransitionPoint(0);
    }

    //Sapient generated method id: ${952eef50-ee64-3b33-9ad4-079023fe2ae4}
    @Ignore()
    @Test()
    public void checkDifficultyTransitionsWhenCursorIsNullThrowsVerificationException() throws VerificationException, BlockStoreException {
        /* Branches:
         * (!isDifficultyTransitionPoint(storedPrev.getHeight())) : true
         * (nextBlock.time().isAfter(testnetDiffDate)) : false
         * (!isDifficultyTransitionPoint(storedPrev.getHeight())) : false  #  inside checkDifficultyTransitions method
         * (i < interval) : true  #  inside checkDifficultyTransitions method
         * (cursor == null) : true  #  inside checkDifficultyTransitions method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Block prevMock = mock(Block.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class, "checkDifficultyTransitions_sha256Hash1");
        doReturn(sha256HashMock).when(prevMock).getHash();
        Block nextBlockMock = mock(Block.class);
        Instant instant = Instant.now();
        doReturn(instant).when(nextBlockMock).time();
        BlockStore blockStoreMock = mock(BlockStore.class);
        doReturn(null).when(blockStoreMock).get(sha256HashMock);
        target = spy(new TestNet3Params());
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(false, true).when(target).isDifficultyTransitionPoint(0);
        thrown.expect(VerificationException.class);
        StoredBlock storedBlock = new StoredBlock(prevMock, new BigInteger("0"), 0);
        //Act Statement(s)
        target.checkDifficultyTransitions(storedBlock, nextBlockMock, blockStoreMock);
        //Assert statement(s)
        verify(prevMock).getHash();
        verify(nextBlockMock).time();
        verify(blockStoreMock).get(sha256HashMock);
        verify(target, times(2)).isDifficultyTransitionPoint(0);
    }

    //Sapient generated method id: ${3109d0e8-c4c8-33b8-8ae3-1e8dc839286d}
    @Test()
    public void checkDifficultyTransitionsWhenCursorTargetNotEqualsNewTargetThrowsVerificationException() throws VerificationException, BlockStoreException {
        /* Branches:
         * (!isDifficultyTransitionPoint(storedPrev.getHeight())) : true
         * (nextBlock.time().isAfter(testnetDiffDate)) : true
         * (timeDelta >= 0) : true
         * (timeDelta <= NetworkParameters.TARGET_SPACING * 2) : true
         * (!cursor.getHeader().equals(getGenesisBlock())) : false
         * (!cursorTarget.equals(newTarget)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Block prevMock = mock(Block.class);
        doReturn(1L).when(prevMock).getTimeSeconds();
        doReturn(new BigInteger("1")).when(prevMock).getDifficultyTargetAsInteger();
        doReturn(1L).when(prevMock).getDifficultyTarget();
        Block nextBlockMock = mock(Block.class);
        Instant instant = Instant.now();
        doReturn(instant).when(nextBlockMock).time();
        doReturn(2L).when(nextBlockMock).getTimeSeconds();
        doReturn(new BigInteger("2")).when(nextBlockMock).getDifficultyTargetAsInteger();
        doReturn(1L).when(nextBlockMock).getDifficultyTarget();
        target = spy(new TestNet3Params());
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(false).when(target).isDifficultyTransitionPoint(0);
        doReturn(prevMock).when(target).getGenesisBlock();
        thrown.expect(VerificationException.class);
        StoredBlock storedBlock = new StoredBlock(prevMock, new BigInteger("0"), 0);
        BlockStore blockStoreMock = mock(BlockStore.class);
        //Act Statement(s)
        target.checkDifficultyTransitions(storedBlock, nextBlockMock, blockStoreMock);
        //Assert statement(s)
        verify(prevMock).getTimeSeconds();
        verify(prevMock).getDifficultyTargetAsInteger();
        verify(prevMock).getDifficultyTarget();
        verify(nextBlockMock).time();
        verify(nextBlockMock).getTimeSeconds();
        verify(nextBlockMock).getDifficultyTargetAsInteger();
        verify(nextBlockMock).getDifficultyTarget();
        verify(target).isDifficultyTransitionPoint(0);
        verify(target).getGenesisBlock();
    }

    //Sapient generated method id: ${730e18e0-2f12-35ce-b5ad-18fde63d06d9}
    @Test()
    public void checkDifficultyTransitionsWhenCursorTargetEqualsNewTarget() throws VerificationException, BlockStoreException {
        /* Branches:
         * (!isDifficultyTransitionPoint(storedPrev.getHeight())) : true
         * (nextBlock.time().isAfter(testnetDiffDate)) : true
         * (timeDelta >= 0) : true
         * (timeDelta <= NetworkParameters.TARGET_SPACING * 2) : true
         * (!cursor.getHeader().equals(getGenesisBlock())) : false
         * (!cursorTarget.equals(newTarget)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Block prevMock = mock(Block.class);
        doReturn(1L).when(prevMock).getTimeSeconds();
        doReturn(new BigInteger("1")).when(prevMock).getDifficultyTargetAsInteger();
        Block nextBlockMock = mock(Block.class);
        Instant instant = Instant.now();
        doReturn(instant).when(nextBlockMock).time();
        doReturn(1L).when(nextBlockMock).getTimeSeconds();
        doReturn(new BigInteger("1")).when(nextBlockMock).getDifficultyTargetAsInteger();
        target = spy(new TestNet3Params());
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(false).when(target).isDifficultyTransitionPoint(0);
        doReturn(prevMock).when(target).getGenesisBlock();
        StoredBlock storedBlock = new StoredBlock(prevMock, new BigInteger("0"), 0);
        BlockStore blockStoreMock = mock(BlockStore.class);
        //Act Statement(s)
        target.checkDifficultyTransitions(storedBlock, nextBlockMock, blockStoreMock);
        //Assert statement(s)
        verify(prevMock).getTimeSeconds();
        verify(prevMock).getDifficultyTargetAsInteger();
        verify(nextBlockMock).time();
        verify(nextBlockMock).getTimeSeconds();
        verify(nextBlockMock).getDifficultyTargetAsInteger();
        verify(target).isDifficultyTransitionPoint(0);
        verify(target).getGenesisBlock();
    }

    //Sapient generated method id: ${fd430343-bdbd-3383-b91f-4bd45feef605}
    @Ignore()
    @Test()
    public void checkDifficultyTransitionsWhenIsDifficultyTransitionPointCursorGetHeightMinus1ThrowsIllegalStateException() throws VerificationException, BlockStoreException {
        /* Branches:
         * (!isDifficultyTransitionPoint(storedPrev.getHeight())) : true
         * (nextBlock.time().isAfter(testnetDiffDate)) : false
         * (!isDifficultyTransitionPoint(storedPrev.getHeight())) : false  #  inside checkDifficultyTransitions method
         * (i < interval) : true  #  inside checkDifficultyTransitions method
         * (cursor == null) : false  #  inside checkDifficultyTransitions method
         * (cursor != null) : true  #  inside checkDifficultyTransitions method
         * (isDifficultyTransitionPoint(cursor.getHeight() - 1)) : true  #  inside checkDifficultyTransitions method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Block prevMock = mock(Block.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Block nextBlockMock = mock(Block.class);
        BlockStore blockStoreMock = mock(BlockStore.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock3 = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock4 = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock5 = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock6 = mock(Sha256Hash.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(sha256HashMock).when(prevMock).getHash();
            Instant instant = Instant.now();
            doReturn(instant).when(nextBlockMock).time();
            Instant instant2 = Instant.now();
            List list = new ArrayList<>();
            Block block = new Block(0L, sha256HashMock2, sha256HashMock3, instant2, 0L, 0L, list);
            StoredBlock storedBlock = new StoredBlock(block, new BigInteger("0"), 0);
            doReturn(storedBlock).when(blockStoreMock).get(sha256HashMock4);
            Instant instant3 = Instant.now();
            List list2 = new ArrayList<>();
            Block block2 = new Block(0L, sha256HashMock5, sha256HashMock6, instant3, 0L, 0L, list2);
            StoredBlock storedBlock2 = new StoredBlock(block2, new BigInteger("0"), 2);
            doReturn(storedBlock2).when(blockStoreMock).get(sha256HashMock3);
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenThrow(illegalStateException);
            target = spy(new TestNet3Params());
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(false, true).when(target).isDifficultyTransitionPoint(0);
            doReturn(true).when(target).isDifficultyTransitionPoint(1);
            thrown.expect(IllegalStateException.class);
            StoredBlock storedBlock3 = new StoredBlock(prevMock, new BigInteger("0"), 0);
            //Act Statement(s)
            target.checkDifficultyTransitions(storedBlock3, nextBlockMock, blockStoreMock);
            //Assert statement(s)
            verify(prevMock).getHash();
            verify(nextBlockMock).time();
            verify(blockStoreMock).get(sha256HashMock4);
            verify(blockStoreMock).get(sha256HashMock3);
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
            verify(target, times(2)).isDifficultyTransitionPoint(0);
            verify(target).isDifficultyTransitionPoint(1);
        }
    }

    //Sapient generated method id: ${a6998dc7-d93b-35fb-9000-69ed949b2e1f}
    @Ignore()
    @Test()
    public void checkDifficultyTransitionsWhenCursorIsNotNullAndIsDifficultyTransitionPointNotCursorGetHeighThrowsIllegalStateException() throws VerificationException, BlockStoreException {
        /* Branches:
         * (!isDifficultyTransitionPoint(storedPrev.getHeight())) : true
         * (nextBlock.time().isAfter(testnetDiffDate)) : false
         * (!isDifficultyTransitionPoint(storedPrev.getHeight())) : false  #  inside checkDifficultyTransitions method
         * (i < interval) : true  #  inside checkDifficultyTransitions method
         * (cursor == null) : false  #  inside checkDifficultyTransitions method
         * (cursor != null) : true  #  inside checkDifficultyTransitions method
         * (isDifficultyTransitionPoint(cursor.getHeight() - 1)) : false  #  inside checkDifficultyTransitions method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Block prevMock = mock(Block.class);
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Block nextBlockMock = mock(Block.class);
        BlockStore blockStoreMock = mock(BlockStore.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock3 = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock4 = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock5 = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock6 = mock(Sha256Hash.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(sha256HashMock).when(prevMock).getHash();
            Instant instant = Instant.now();
            doReturn(instant).when(nextBlockMock).time();
            Instant instant2 = Instant.now();
            List list = new ArrayList<>();
            Block block = new Block(0L, sha256HashMock2, sha256HashMock3, instant2, 0L, 0L, list);
            StoredBlock storedBlock = new StoredBlock(block, new BigInteger("0"), 0);
            doReturn(storedBlock).when(blockStoreMock).get(sha256HashMock4);
            Instant instant3 = Instant.now();
            List list2 = new ArrayList<>();
            Block block2 = new Block(0L, sha256HashMock5, sha256HashMock6, instant3, 0L, 0L, list2);
            StoredBlock storedBlock2 = new StoredBlock(block2, new BigInteger("0"), 2);
            doReturn(storedBlock2).when(blockStoreMock).get(sha256HashMock3);
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenThrow(illegalStateException);
            target = spy(new TestNet3Params());
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(false, true).when(target).isDifficultyTransitionPoint(0);
            doReturn(false).when(target).isDifficultyTransitionPoint(1);
            thrown.expect(IllegalStateException.class);
            StoredBlock storedBlock3 = new StoredBlock(prevMock, new BigInteger("0"), 0);
            //Act Statement(s)
            target.checkDifficultyTransitions(storedBlock3, nextBlockMock, blockStoreMock);
            //Assert statement(s)
            verify(prevMock).getHash();
            verify(nextBlockMock).time();
            verify(blockStoreMock).get(sha256HashMock4);
            verify(blockStoreMock).get(sha256HashMock3);
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
            verify(target, times(2)).isDifficultyTransitionPoint(0);
            verify(target).isDifficultyTransitionPoint(1);
        }
    }

    //Sapient generated method id: ${dd162f6d-781d-35bb-ab8e-e90c139a93f7}
    @Ignore()
    @Test()
    public void checkDifficultyTransitionsWhenCursorGetHeaderGetDifficultyTargetAsIntegerEqualsGetMaxTargetAThrowsVerificationException() throws VerificationException, BlockStoreException {
        /* Branches:
         * (!isDifficultyTransitionPoint(storedPrev.getHeight())) : true
         * (nextBlock.time().isAfter(testnetDiffDate)) : true
         * (timeDelta >= 0) : true
         * (timeDelta <= NetworkParameters.TARGET_SPACING * 2) : true
         * (!cursor.getHeader().equals(getGenesisBlock())) : true
         * (cursor.getHeight() % getInterval() != 0) : true
         * (cursor.getHeader().getDifficultyTargetAsInteger().equals(getMaxTarget())) : true
         * (!cursorTarget.equals(newTarget)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        StoredBlock storedPrevMock = mock(StoredBlock.class);
        doReturn(1).when(storedPrevMock).getHeight();
        Block blockMock = mock(Block.class);
        doReturn(blockMock).when(storedPrevMock).getHeader();
        doReturn(1L).when(blockMock).getTimeSeconds();
        doReturn(new BigInteger("26959535291011309493156476344723991336010898738574164086137773096960")).when(blockMock).getDifficultyTargetAsInteger();
        Block blockMock2 = mock(Block.class);
        StoredBlock storedBlock = new StoredBlock(blockMock2, new BigInteger("0"), 0);
        BlockStore blockStoreMock = mock(BlockStore.class);
        doReturn(storedBlock).when(storedPrevMock).getPrev(blockStoreMock);
        doReturn(new BigInteger("1")).when(blockMock2).getDifficultyTargetAsInteger();
        doReturn(1L).when(blockMock2).getDifficultyTarget();
        Block nextBlockMock = mock(Block.class);
        Instant instant = Instant.now();
        doReturn(instant).when(nextBlockMock).time();
        doReturn(2L).when(nextBlockMock).getTimeSeconds();
        doReturn(new BigInteger("2")).when(nextBlockMock).getDifficultyTargetAsInteger();
        doReturn(1L).when(nextBlockMock).getDifficultyTarget();
        target = spy(new TestNet3Params());
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(false).when(target).isDifficultyTransitionPoint(1);
        Block blockMock3 = mock(Block.class);
        doReturn(blockMock3).when(target).getGenesisBlock();
        thrown.expect(VerificationException.class);
        //Act Statement(s)
        target.checkDifficultyTransitions(storedPrevMock, nextBlockMock, blockStoreMock);
        //Assert statement(s)
        verify(storedPrevMock, times(2)).getHeight();
        verify(storedPrevMock).getHeader();
        verify(blockMock).getTimeSeconds();
        verify(blockMock).getDifficultyTargetAsInteger();
        verify(storedPrevMock).getPrev(blockStoreMock);
        verify(blockMock2).getDifficultyTargetAsInteger();
        verify(blockMock2).getDifficultyTarget();
        verify(nextBlockMock).time();
        verify(nextBlockMock).getTimeSeconds();
        verify(nextBlockMock).getDifficultyTargetAsInteger();
        verify(nextBlockMock).getDifficultyTarget();
        verify(target).isDifficultyTransitionPoint(1);
        verify(target).getGenesisBlock();
    }

    //Sapient generated method id: ${f7e5b438-9a95-3a95-9689-67f812196cdc}
    @Ignore()
    @Test()
    public void checkDifficultyTransitionsWhenCursorGetHeaderGetDifficultyTargetAsIntegerEqualsGetMaxTargetAndCursorTargetEqualsNewTarg() throws VerificationException, BlockStoreException {
        /* Branches:
         * (!isDifficultyTransitionPoint(storedPrev.getHeight())) : true
         * (nextBlock.time().isAfter(testnetDiffDate)) : true
         * (timeDelta >= 0) : true
         * (timeDelta <= NetworkParameters.TARGET_SPACING * 2) : true
         * (!cursor.getHeader().equals(getGenesisBlock())) : true
         * (cursor.getHeight() % getInterval() != 0) : true
         * (cursor.getHeader().getDifficultyTargetAsInteger().equals(getMaxTarget())) : true
         * (!cursorTarget.equals(newTarget)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        StoredBlock storedPrevMock = mock(StoredBlock.class);
        doReturn(-1).when(storedPrevMock).getHeight();
        Block blockMock = mock(Block.class);
        doReturn(blockMock).when(storedPrevMock).getHeader();
        doReturn(-1L).when(blockMock).getTimeSeconds();
        doReturn(new BigInteger("26959535291011309493156476344723991336010898738574164086137773096960")).when(blockMock).getDifficultyTargetAsInteger();
        Block blockMock2 = mock(Block.class);
        StoredBlock storedBlock = new StoredBlock(blockMock2, new BigInteger("0"), 0);
        BlockStore blockStoreMock = mock(BlockStore.class);
        doReturn(storedBlock).when(storedPrevMock).getPrev(blockStoreMock);
        doReturn(new BigInteger("-1")).when(blockMock2).getDifficultyTargetAsInteger();
        Block nextBlockMock = mock(Block.class);
        Instant instant = Instant.now();
        doReturn(instant).when(nextBlockMock).time();
        doReturn(0L).when(nextBlockMock).getTimeSeconds();
        doReturn(new BigInteger("-1")).when(nextBlockMock).getDifficultyTargetAsInteger();
        target = spy(new TestNet3Params());
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(false).when(target).isDifficultyTransitionPoint(-1);
        Block blockMock3 = mock(Block.class);
        Block blockMock4 = mock(Block.class);
        doReturn(blockMock3, blockMock4).when(target).getGenesisBlock();
        //Act Statement(s)
        target.checkDifficultyTransitions(storedPrevMock, nextBlockMock, blockStoreMock);
        //Assert statement(s)
        verify(storedPrevMock, times(2)).getHeight();
        verify(storedPrevMock, times(3)).getHeader();
        verify(blockMock).getTimeSeconds();
        verify(blockMock).getDifficultyTargetAsInteger();
        verify(storedPrevMock).getPrev(blockStoreMock);
        verify(blockMock2).getDifficultyTargetAsInteger();
        verify(nextBlockMock).time();
        verify(nextBlockMock).getTimeSeconds();
        verify(nextBlockMock).getDifficultyTargetAsInteger();
        verify(target).isDifficultyTransitionPoint(-1);
        verify(target, times(2)).getGenesisBlock();
    }
}
