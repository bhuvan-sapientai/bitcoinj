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

import org.mockito.stubbing.Answer;
import org.bitcoinj.core.Block;
import org.bitcoinj.base.internal.Preconditions;
import org.mockito.MockitoAnnotations;
import org.bitcoinj.store.BlockStore;
import org.bitcoinj.base.Sha256Hash;

import java.math.BigInteger;

import org.bitcoinj.base.internal.ByteUtils;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

import java.util.ArrayList;

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
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
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
    @Test()
    public void checkDifficultyTransitionsWhenNextBlockGetDifficultyTargetNotEqualsPrevGetDifficultyTargetThrowsVerificationException() throws VerificationException, BlockStoreException {
        /* Branches:
         * (!isDifficultyTransitionPoint(storedPrev.getHeight())) : true
         * (nextBlock.time().isAfter(testnetDiffDate)) : false
         * (!isDifficultyTransitionPoint(storedPrev.getHeight())) : true  #  inside checkDifficultyTransitions method
         * (nextBlock.getDifficultyTarget() != prev.getDifficultyTarget()) : true  #  inside checkDifficultyTransitions method
         */
        //Arrange Statement(s)
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        BlockStore blockStoreMock = mock(BlockStore.class);
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byteUtils.when(() -> ByteUtils.decodeCompactBits(486604799L)).thenReturn(new BigInteger("1"));
            target = spy(new TestNet3Params());
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(false).when(target).isDifficultyTransitionPoint(100);
            thrown.expect(NullPointerException.class);
            Instant instant = Instant.now();
            List list = new ArrayList<>();
            Block block = new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, list);
            StoredBlock storedBlock = new StoredBlock(block, new BigInteger("0"), 100);
            Instant instant2 = Instant.now();
            Block block2 = Block.createGenesis(instant2, 1L);
            //Act Statement(s)
            target.checkDifficultyTransitions(storedBlock, block2, blockStoreMock);
            //Assert statement(s)
            byteUtils.verify(() -> ByteUtils.decodeCompactBits(486604799L), atLeast(1));
            verify(target).isDifficultyTransitionPoint(100);
        }
    }

    //Sapient generated method id: ${ecc3e692-0795-3ff9-8f53-327f5e73c919}
    @Test()
    public void checkDifficultyTransitionsWhenNextBlockGetDifficultyTargetEqualsPrevGetDifficultyTarget() throws VerificationException, BlockStoreException {
        /* Branches:
         * (!isDifficultyTransitionPoint(storedPrev.getHeight())) : true
         * (nextBlock.time().isAfter(testnetDiffDate)) : false
         * (!isDifficultyTransitionPoint(storedPrev.getHeight())) : true  #  inside checkDifficultyTransitions method
         * (nextBlock.getDifficultyTarget() != prev.getDifficultyTarget()) : false  #  inside checkDifficultyTransitions method
         */
        //Arrange Statement(s)
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        BlockStore blockStoreMock = mock(BlockStore.class);
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byteUtils.when(() -> ByteUtils.decodeCompactBits(486604799L)).thenReturn(new BigInteger("1"));
            target = spy(new TestNet3Params());
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(false).when(target).isDifficultyTransitionPoint(123456);
            thrown.expect(NullPointerException.class);
            Instant instant = Instant.now();
            List list = new ArrayList<>();
            Block block = new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, list);
            StoredBlock storedBlock = new StoredBlock(block, new BigInteger("0"), 123456);
            Instant instant2 = Instant.now();
            Block block2 = Block.createGenesis(instant2, 1L);
            //Act Statement(s)
            target.checkDifficultyTransitions(storedBlock, block2, blockStoreMock);
            //Assert statement(s)
            byteUtils.verify(() -> ByteUtils.decodeCompactBits(486604799L), atLeast(1));
            verify(target).isDifficultyTransitionPoint(123456);
        }
    }

    //Sapient generated method id: ${952eef50-ee64-3b33-9ad4-079023fe2ae4}
    @Test()
    public void checkDifficultyTransitionsWhenCursorIsNullThrowsVerificationException() throws VerificationException, BlockStoreException {
        /* Branches:
         * (!isDifficultyTransitionPoint(storedPrev.getHeight())) : true
         * (nextBlock.time().isAfter(testnetDiffDate)) : false
         * (!isDifficultyTransitionPoint(storedPrev.getHeight())) : false  #  inside checkDifficultyTransitions method
         * (i < interval) : true  #  inside checkDifficultyTransitions method
         * (cursor == null) : true  #  inside checkDifficultyTransitions method
         */
        //Arrange Statement(s)
        Block nextBlockMock = mock(Block.class);
        Block blockMock = mock(Block.class);
        BlockStore blockStoreMock = mock(BlockStore.class);
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            //TODO: Needs to return real value
            doReturn(null).when(nextBlockMock).time();
            byteUtils.when(() -> ByteUtils.decodeCompactBits(486604799L)).thenReturn(new BigInteger("1"));
            target = spy(new TestNet3Params());
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(false).when(target).isDifficultyTransitionPoint(100);
            thrown.expect(NullPointerException.class);
            StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 100);
            //Act Statement(s)
            target.checkDifficultyTransitions(storedBlock, nextBlockMock, blockStoreMock);
            //Assert statement(s)
            verify(nextBlockMock).time();
            byteUtils.verify(() -> ByteUtils.decodeCompactBits(486604799L), atLeast(1));
            verify(target).isDifficultyTransitionPoint(100);
        }
    }

    //Sapient generated method id: ${fd430343-bdbd-3383-b91f-4bd45feef605}
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
         */
        //Arrange Statement(s)
        Block nextBlockMock = mock(Block.class);
        Block blockMock = mock(Block.class);
        BlockStore blockStoreMock = mock(BlockStore.class);
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            //TODO: Needs to return real value
            doReturn(null).when(nextBlockMock).time();
            byteUtils.when(() -> ByteUtils.decodeCompactBits(486604799L)).thenReturn(new BigInteger("1"));
            target = spy(new TestNet3Params());
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(false).when(target).isDifficultyTransitionPoint(100);
            thrown.expect(NullPointerException.class);
            StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 100);
            //Act Statement(s)
            target.checkDifficultyTransitions(storedBlock, nextBlockMock, blockStoreMock);
            //Assert statement(s)
            verify(nextBlockMock).time();
            byteUtils.verify(() -> ByteUtils.decodeCompactBits(486604799L), atLeast(1));
            verify(target).isDifficultyTransitionPoint(100);
        }
    }

    //Sapient generated method id: ${a6998dc7-d93b-35fb-9000-69ed949b2e1f}
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
         */
        //Arrange Statement(s)
        Block nextBlockMock = mock(Block.class);
        Block blockMock = mock(Block.class);
        BlockStore blockStoreMock = mock(BlockStore.class);
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            //TODO: Needs to return real value
            doReturn(null).when(nextBlockMock).time();
            byteUtils.when(() -> ByteUtils.decodeCompactBits(486604799L)).thenReturn(new BigInteger("1"));
            target = spy(new TestNet3Params());
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(false).when(target).isDifficultyTransitionPoint(1);
            thrown.expect(NullPointerException.class);
            StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 1);
            //Act Statement(s)
            target.checkDifficultyTransitions(storedBlock, nextBlockMock, blockStoreMock);
            //Assert statement(s)
            verify(nextBlockMock).time();
            byteUtils.verify(() -> ByteUtils.decodeCompactBits(486604799L), atLeast(1));
            verify(target).isDifficultyTransitionPoint(1);
        }
    }

    //Sapient generated method id: ${dd162f6d-781d-35bb-ab8e-e90c139a93f7}
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
         */
        //Arrange Statement(s)
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        BlockStore blockStoreMock = mock(BlockStore.class);
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byteUtils.when(() -> ByteUtils.decodeCompactBits(486604799L)).thenReturn(new BigInteger("0"));
            target = spy(new TestNet3Params());
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(false).when(target).isDifficultyTransitionPoint(1000);
            thrown.expect(NullPointerException.class);
            Instant instant = Instant.now();
            List list = new ArrayList<>();
            Block block = new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, list);
            StoredBlock storedBlock = new StoredBlock(block, new BigInteger("0"), 1000);
            Instant instant2 = Instant.now();
            Block block2 = Block.createGenesis(instant2, 987654321L);
            //Act Statement(s)
            target.checkDifficultyTransitions(storedBlock, block2, blockStoreMock);
            //Assert statement(s)
            byteUtils.verify(() -> ByteUtils.decodeCompactBits(486604799L), atLeast(1));
            verify(target).isDifficultyTransitionPoint(1000);
        }
    }

    //Sapient generated method id: ${f7e5b438-9a95-3a95-9689-67f812196cdc}
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
         */
        //Arrange Statement(s)
        Block nextBlockMock = mock(Block.class);
        Block blockMock = mock(Block.class);
        BlockStore blockStoreMock = mock(BlockStore.class);
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            //TODO: Needs to return real value
            doReturn(null).when(nextBlockMock).time();
            byteUtils.when(() -> ByteUtils.decodeCompactBits(486604799L)).thenReturn(new BigInteger("486604799"));
            target = spy(new TestNet3Params());
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(false).when(target).isDifficultyTransitionPoint(0);
            thrown.expect(NullPointerException.class);
            StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 0);
            //Act Statement(s)
            target.checkDifficultyTransitions(storedBlock, nextBlockMock, blockStoreMock);
            //Assert statement(s)
            verify(nextBlockMock).time();
            byteUtils.verify(() -> ByteUtils.decodeCompactBits(486604799L), atLeast(1));
            verify(target).isDifficultyTransitionPoint(0);
        }
    }
}
