package org.bitcoinj.params;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.core.VerificationException;
import org.bitcoinj.store.BlockStoreException;
import org.junit.rules.ExpectedException;

import java.util.List;

import org.bitcoinj.core.Block;
import org.bitcoinj.base.internal.Preconditions;
import org.bitcoinj.store.BlockStore;
import org.bitcoinj.base.Sha256Hash;
import org.bitcoinj.base.internal.Stopwatch;

import java.math.BigInteger;

import org.bitcoinj.base.internal.ByteUtils;
import org.mockito.MockedStatic;

import java.util.ArrayList;

import org.bitcoinj.core.StoredBlock;

import java.time.Instant;

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

public class TestNet3ParamsSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Block block101Mock = mock(Block.class);

    private final Block blockMock = mock(Block.class);

    private final Block blockMock2 = mock(Block.class);

    private final BlockStore blockStoreMock = mock(BlockStore.class);

    private final Block nextBlockMock = mock(Block.class);

    private final Block prevMock = mock(Block.class);

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock10 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock100 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock101 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock102 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock103 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock104 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock105 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock106 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock107 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock108 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock109 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock11 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock110 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock111 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock112 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock113 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock114 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock115 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock116 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock117 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock118 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock119 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock12 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock120 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock121 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock122 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock123 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock124 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock125 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock126 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock127 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock128 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock129 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock13 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock130 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock131 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock132 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock133 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock134 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock135 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock136 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock137 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock138 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock139 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock14 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock140 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock141 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock142 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock143 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock144 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock145 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock146 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock147 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock148 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock149 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock15 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock150 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock151 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock152 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock153 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock154 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock155 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock156 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock157 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock158 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock159 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock16 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock160 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock161 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock162 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock163 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock164 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock165 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock166 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock167 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock168 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock169 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock17 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock170 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock171 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock172 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock173 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock174 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock175 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock176 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock177 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock178 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock179 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock18 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock180 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock181 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock182 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock183 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock184 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock185 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock186 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock187 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock188 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock189 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock19 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock190 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock191 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock192 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock193 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock194 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock195 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock196 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock197 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock198 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock199 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock20 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock200 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock201 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock202 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock21 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock22 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock23 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock24 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock25 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock26 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock27 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock28 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock29 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock3 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock30 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock31 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock32 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock33 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock34 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock35 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock36 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock37 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock38 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock39 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock4 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock40 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock41 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock42 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock43 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock44 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock45 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock46 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock47 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock48 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock49 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock5 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock50 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock51 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock52 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock53 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock54 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock55 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock56 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock57 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock58 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock59 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock6 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock60 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock61 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock62 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock63 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock64 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock65 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock66 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock67 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock68 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock69 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock7 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock70 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock71 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock72 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock73 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock74 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock75 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock76 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock77 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock78 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock79 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock8 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock80 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock81 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock82 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock83 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock84 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock85 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock86 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock87 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock88 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock89 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock9 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock90 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock91 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock92 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock93 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock94 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock95 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock96 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock97 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock98 = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock99 = mock(Sha256Hash.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${32a8d14c-b4e9-37a4-9736-3367f8ecb089}, hash: 14C39B59742A1666B46A4082A3376278
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

    //Sapient generated method id: ${6af115c8-0813-3ff3-9b71-4c6682fe756c}, hash: 14FA9A1381D0E7CB758AC57B014F0707
    @Test()
    public void getGenesisBlockWhenGenesisBlockIsNull() {
        /* Branches:
         * (genesisBlock == null) : true
         */
        //Arrange Statement(s)
        TestNet3Params target = new TestNet3Params();
        //Act Statement(s)
        Block result = target.getGenesisBlock();
        Instant instant = Instant.ofEpochSecond(1296688602L);
        Block block = Block.createGenesis(instant, 486604799L, 414098458L);
        //Assert statement(s)
        assertThat(result, equalTo(block));
    }

    //Sapient generated method id: ${5018bc86-ab5b-396f-9b20-9e36225ba334}, hash: 261B7018D969F8F1AE29436A4DA86C4F
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
        Instant instant = Instant.ofEpochSecond(1700000000);
        doReturn(instant).when(nextBlockMock).time();
        doReturn(1L).when(nextBlockMock).getDifficultyTarget();
        TestNet3Params target = spy(new TestNet3Params());
        doReturn(false).when(target).isDifficultyTransitionPoint(2);
        thrown.expect(VerificationException.class);
        Instant instant2 = Instant.ofEpochSecond(1700000000);
        List list = new ArrayList<>();
        Block block = new Block(0L, sha256HashMock, sha256HashMock2, instant2, 2L, 0L, list);
        StoredBlock storedBlock = new StoredBlock(block, new BigInteger("0"), 2);
        //Act Statement(s)
        target.checkDifficultyTransitions(storedBlock, nextBlockMock, blockStoreMock);
        //Assert statement(s)
        verify(nextBlockMock).time();
        verify(nextBlockMock, times(2)).getDifficultyTarget();
        verify(target, times(2)).isDifficultyTransitionPoint(2);
    }

    //Sapient generated method id: ${ecc3e692-0795-3ff9-8f53-327f5e73c919}, hash: 09F7D06E7A93FA50C2C959840C5AB8ED
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
        Instant instant = Instant.ofEpochSecond(1700000000);
        doReturn(instant).when(nextBlockMock).time();
        doReturn(1L).when(nextBlockMock).getDifficultyTarget();
        TestNet3Params target = spy(new TestNet3Params());
        doReturn(false).when(target).isDifficultyTransitionPoint(0);
        Instant instant2 = Instant.ofEpochSecond(1700000000);
        List list = new ArrayList<>();
        Block block = new Block(0L, sha256HashMock, sha256HashMock2, instant2, 1L, 0L, list);
        StoredBlock storedBlock = new StoredBlock(block, new BigInteger("0"), 0);
        //Act Statement(s)
        target.checkDifficultyTransitions(storedBlock, nextBlockMock, blockStoreMock);
        //Assert statement(s)
        verify(nextBlockMock).time();
        verify(nextBlockMock).getDifficultyTarget();
        verify(target, times(2)).isDifficultyTransitionPoint(0);
    }

    //Sapient generated method id: ${952eef50-ee64-3b33-9ad4-079023fe2ae4}, hash: 0EF92C87267CE00979A1A427BFA2070F
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
        Sha256Hash sha256HashMock = mock(Sha256Hash.class, "checkDifficultyTransitions_sha256Hash1");
        doReturn(sha256HashMock).when(prevMock).getHash();
        Instant instant = Instant.ofEpochSecond(1700000000);
        doReturn(instant).when(nextBlockMock).time();
        doReturn(null).when(blockStoreMock).get(sha256HashMock);
        TestNet3Params target = spy(new TestNet3Params());
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

    //Sapient generated method id: ${a6998dc7-d93b-35fb-9000-69ed949b2e1f}, hash: EA9BD5D1CACD073B357A5B113F89D127
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
        doReturn(sha256HashMock).when(prevMock).getHash();
        Instant instant = Instant.ofEpochSecond(1700000000);
        doReturn(instant).when(nextBlockMock).time();
        Instant instant2 = Instant.ofEpochSecond(1700000000);
        List list = new ArrayList<>();
        Block block = new Block(0L, sha256HashMock2, sha256HashMock3, instant2, 0L, 0L, list);
        StoredBlock storedBlock = new StoredBlock(block, new BigInteger("0"), 0);
        doReturn(storedBlock).when(blockStoreMock).get(sha256HashMock);
        Instant instant3 = Instant.ofEpochSecond(1700000000);
        List list2 = new ArrayList<>();
        Block block2 = new Block(0L, sha256HashMock4, sha256HashMock5, instant3, 0L, 0L, list2);
        StoredBlock storedBlock2 = new StoredBlock(block2, new BigInteger("0"), 0);
        doReturn(storedBlock2).when(blockStoreMock).get(sha256HashMock2);
        Instant instant4 = Instant.ofEpochSecond(1700000000);
        List list3 = new ArrayList<>();
        Block block3 = new Block(0L, sha256HashMock6, sha256HashMock7, instant4, 0L, 0L, list3);
        StoredBlock storedBlock3 = new StoredBlock(block3, new BigInteger("0"), 0);
        doReturn(storedBlock3).when(blockStoreMock).get(sha256HashMock4);
        Instant instant5 = Instant.ofEpochSecond(1700000000);
        List list4 = new ArrayList<>();
        Block block4 = new Block(0L, sha256HashMock8, sha256HashMock9, instant5, 0L, 0L, list4);
        StoredBlock storedBlock4 = new StoredBlock(block4, new BigInteger("0"), 0);
        doReturn(storedBlock4).when(blockStoreMock).get(sha256HashMock6);
        Instant instant6 = Instant.ofEpochSecond(1700000000);
        List list5 = new ArrayList<>();
        Block block5 = new Block(0L, sha256HashMock10, sha256HashMock11, instant6, 0L, 0L, list5);
        StoredBlock storedBlock5 = new StoredBlock(block5, new BigInteger("0"), 0);
        doReturn(storedBlock5).when(blockStoreMock).get(sha256HashMock8);
        Instant instant7 = Instant.ofEpochSecond(1700000000);
        List list6 = new ArrayList<>();
        Block block6 = new Block(0L, sha256HashMock12, sha256HashMock13, instant7, 0L, 0L, list6);
        StoredBlock storedBlock6 = new StoredBlock(block6, new BigInteger("0"), 0);
        doReturn(storedBlock6).when(blockStoreMock).get(sha256HashMock10);
        Instant instant8 = Instant.ofEpochSecond(1700000000);
        List list7 = new ArrayList<>();
        Block block7 = new Block(0L, sha256HashMock14, sha256HashMock15, instant8, 0L, 0L, list7);
        StoredBlock storedBlock7 = new StoredBlock(block7, new BigInteger("0"), 0);
        doReturn(storedBlock7).when(blockStoreMock).get(sha256HashMock12);
        Instant instant9 = Instant.ofEpochSecond(1700000000);
        List list8 = new ArrayList<>();
        Block block8 = new Block(0L, sha256HashMock16, sha256HashMock17, instant9, 0L, 0L, list8);
        StoredBlock storedBlock8 = new StoredBlock(block8, new BigInteger("0"), 0);
        doReturn(storedBlock8).when(blockStoreMock).get(sha256HashMock14);
        Instant instant10 = Instant.ofEpochSecond(1700000000);
        List list9 = new ArrayList<>();
        Block block9 = new Block(0L, sha256HashMock18, sha256HashMock19, instant10, 0L, 0L, list9);
        StoredBlock storedBlock9 = new StoredBlock(block9, new BigInteger("0"), 0);
        doReturn(storedBlock9).when(blockStoreMock).get(sha256HashMock16);
        Instant instant11 = Instant.ofEpochSecond(1700000000);
        List list10 = new ArrayList<>();
        Block block10 = new Block(0L, sha256HashMock20, sha256HashMock21, instant11, 0L, 0L, list10);
        StoredBlock storedBlock10 = new StoredBlock(block10, new BigInteger("0"), 0);
        doReturn(storedBlock10).when(blockStoreMock).get(sha256HashMock18);
        Instant instant12 = Instant.ofEpochSecond(1700000000);
        List list11 = new ArrayList<>();
        Block block11 = new Block(0L, sha256HashMock22, sha256HashMock23, instant12, 0L, 0L, list11);
        StoredBlock storedBlock11 = new StoredBlock(block11, new BigInteger("0"), 0);
        doReturn(storedBlock11).when(blockStoreMock).get(sha256HashMock20);
        Instant instant13 = Instant.ofEpochSecond(1700000000);
        List list12 = new ArrayList<>();
        Block block12 = new Block(0L, sha256HashMock24, sha256HashMock25, instant13, 0L, 0L, list12);
        StoredBlock storedBlock12 = new StoredBlock(block12, new BigInteger("0"), 0);
        doReturn(storedBlock12).when(blockStoreMock).get(sha256HashMock22);
        Instant instant14 = Instant.ofEpochSecond(1700000000);
        List list13 = new ArrayList<>();
        Block block13 = new Block(0L, sha256HashMock26, sha256HashMock27, instant14, 0L, 0L, list13);
        StoredBlock storedBlock13 = new StoredBlock(block13, new BigInteger("0"), 0);
        doReturn(storedBlock13).when(blockStoreMock).get(sha256HashMock24);
        Instant instant15 = Instant.ofEpochSecond(1700000000);
        List list14 = new ArrayList<>();
        Block block14 = new Block(0L, sha256HashMock28, sha256HashMock29, instant15, 0L, 0L, list14);
        StoredBlock storedBlock14 = new StoredBlock(block14, new BigInteger("0"), 0);
        doReturn(storedBlock14).when(blockStoreMock).get(sha256HashMock26);
        Instant instant16 = Instant.ofEpochSecond(1700000000);
        List list15 = new ArrayList<>();
        Block block15 = new Block(0L, sha256HashMock30, sha256HashMock31, instant16, 0L, 0L, list15);
        StoredBlock storedBlock15 = new StoredBlock(block15, new BigInteger("0"), 0);
        doReturn(storedBlock15).when(blockStoreMock).get(sha256HashMock28);
        Instant instant17 = Instant.ofEpochSecond(1700000000);
        List list16 = new ArrayList<>();
        Block block16 = new Block(0L, sha256HashMock32, sha256HashMock33, instant17, 0L, 0L, list16);
        StoredBlock storedBlock16 = new StoredBlock(block16, new BigInteger("0"), 0);
        doReturn(storedBlock16).when(blockStoreMock).get(sha256HashMock30);
        Instant instant18 = Instant.ofEpochSecond(1700000000);
        List list17 = new ArrayList<>();
        Block block17 = new Block(0L, sha256HashMock34, sha256HashMock35, instant18, 0L, 0L, list17);
        StoredBlock storedBlock17 = new StoredBlock(block17, new BigInteger("0"), 0);
        doReturn(storedBlock17).when(blockStoreMock).get(sha256HashMock32);
        Instant instant19 = Instant.ofEpochSecond(1700000000);
        List list18 = new ArrayList<>();
        Block block18 = new Block(0L, sha256HashMock36, sha256HashMock37, instant19, 0L, 0L, list18);
        StoredBlock storedBlock18 = new StoredBlock(block18, new BigInteger("0"), 0);
        doReturn(storedBlock18).when(blockStoreMock).get(sha256HashMock34);
        Instant instant20 = Instant.ofEpochSecond(1700000000);
        List list19 = new ArrayList<>();
        Block block19 = new Block(0L, sha256HashMock38, sha256HashMock39, instant20, 0L, 0L, list19);
        StoredBlock storedBlock19 = new StoredBlock(block19, new BigInteger("0"), 0);
        doReturn(storedBlock19).when(blockStoreMock).get(sha256HashMock36);
        Instant instant21 = Instant.ofEpochSecond(1700000000);
        List list20 = new ArrayList<>();
        Block block20 = new Block(0L, sha256HashMock40, sha256HashMock41, instant21, 0L, 0L, list20);
        StoredBlock storedBlock20 = new StoredBlock(block20, new BigInteger("0"), 0);
        doReturn(storedBlock20).when(blockStoreMock).get(sha256HashMock38);
        Instant instant22 = Instant.ofEpochSecond(1700000000);
        List list21 = new ArrayList<>();
        Block block21 = new Block(0L, sha256HashMock42, sha256HashMock43, instant22, 0L, 0L, list21);
        StoredBlock storedBlock21 = new StoredBlock(block21, new BigInteger("0"), 0);
        doReturn(storedBlock21).when(blockStoreMock).get(sha256HashMock40);
        Instant instant23 = Instant.ofEpochSecond(1700000000);
        List list22 = new ArrayList<>();
        Block block22 = new Block(0L, sha256HashMock44, sha256HashMock45, instant23, 0L, 0L, list22);
        StoredBlock storedBlock22 = new StoredBlock(block22, new BigInteger("0"), 0);
        doReturn(storedBlock22).when(blockStoreMock).get(sha256HashMock42);
        Instant instant24 = Instant.ofEpochSecond(1700000000);
        List list23 = new ArrayList<>();
        Block block23 = new Block(0L, sha256HashMock46, sha256HashMock47, instant24, 0L, 0L, list23);
        StoredBlock storedBlock23 = new StoredBlock(block23, new BigInteger("0"), 0);
        doReturn(storedBlock23).when(blockStoreMock).get(sha256HashMock44);
        Instant instant25 = Instant.ofEpochSecond(1700000000);
        List list24 = new ArrayList<>();
        Block block24 = new Block(0L, sha256HashMock48, sha256HashMock49, instant25, 0L, 0L, list24);
        StoredBlock storedBlock24 = new StoredBlock(block24, new BigInteger("0"), 0);
        doReturn(storedBlock24).when(blockStoreMock).get(sha256HashMock46);
        Instant instant26 = Instant.ofEpochSecond(1700000000);
        List list25 = new ArrayList<>();
        Block block25 = new Block(0L, sha256HashMock50, sha256HashMock51, instant26, 0L, 0L, list25);
        StoredBlock storedBlock25 = new StoredBlock(block25, new BigInteger("0"), 0);
        doReturn(storedBlock25).when(blockStoreMock).get(sha256HashMock48);
        Instant instant27 = Instant.ofEpochSecond(1700000000);
        List list26 = new ArrayList<>();
        Block block26 = new Block(0L, sha256HashMock52, sha256HashMock53, instant27, 0L, 0L, list26);
        StoredBlock storedBlock26 = new StoredBlock(block26, new BigInteger("0"), 0);
        doReturn(storedBlock26).when(blockStoreMock).get(sha256HashMock50);
        Instant instant28 = Instant.ofEpochSecond(1700000000);
        List list27 = new ArrayList<>();
        Block block27 = new Block(0L, sha256HashMock54, sha256HashMock55, instant28, 0L, 0L, list27);
        StoredBlock storedBlock27 = new StoredBlock(block27, new BigInteger("0"), 0);
        doReturn(storedBlock27).when(blockStoreMock).get(sha256HashMock52);
        Instant instant29 = Instant.ofEpochSecond(1700000000);
        List list28 = new ArrayList<>();
        Block block28 = new Block(0L, sha256HashMock56, sha256HashMock57, instant29, 0L, 0L, list28);
        StoredBlock storedBlock28 = new StoredBlock(block28, new BigInteger("0"), 0);
        doReturn(storedBlock28).when(blockStoreMock).get(sha256HashMock54);
        Instant instant30 = Instant.ofEpochSecond(1700000000);
        List list29 = new ArrayList<>();
        Block block29 = new Block(0L, sha256HashMock58, sha256HashMock59, instant30, 0L, 0L, list29);
        StoredBlock storedBlock29 = new StoredBlock(block29, new BigInteger("0"), 0);
        doReturn(storedBlock29).when(blockStoreMock).get(sha256HashMock56);
        Instant instant31 = Instant.ofEpochSecond(1700000000);
        List list30 = new ArrayList<>();
        Block block30 = new Block(0L, sha256HashMock60, sha256HashMock61, instant31, 0L, 0L, list30);
        StoredBlock storedBlock30 = new StoredBlock(block30, new BigInteger("0"), 0);
        doReturn(storedBlock30).when(blockStoreMock).get(sha256HashMock58);
        Instant instant32 = Instant.ofEpochSecond(1700000000);
        List list31 = new ArrayList<>();
        Block block31 = new Block(0L, sha256HashMock62, sha256HashMock63, instant32, 0L, 0L, list31);
        StoredBlock storedBlock31 = new StoredBlock(block31, new BigInteger("0"), 0);
        doReturn(storedBlock31).when(blockStoreMock).get(sha256HashMock60);
        Instant instant33 = Instant.ofEpochSecond(1700000000);
        List list32 = new ArrayList<>();
        Block block32 = new Block(0L, sha256HashMock64, sha256HashMock65, instant33, 0L, 0L, list32);
        StoredBlock storedBlock32 = new StoredBlock(block32, new BigInteger("0"), 0);
        doReturn(storedBlock32).when(blockStoreMock).get(sha256HashMock62);
        Instant instant34 = Instant.ofEpochSecond(1700000000);
        List list33 = new ArrayList<>();
        Block block33 = new Block(0L, sha256HashMock66, sha256HashMock67, instant34, 0L, 0L, list33);
        StoredBlock storedBlock33 = new StoredBlock(block33, new BigInteger("0"), 0);
        doReturn(storedBlock33).when(blockStoreMock).get(sha256HashMock64);
        Instant instant35 = Instant.ofEpochSecond(1700000000);
        List list34 = new ArrayList<>();
        Block block34 = new Block(0L, sha256HashMock68, sha256HashMock69, instant35, 0L, 0L, list34);
        StoredBlock storedBlock34 = new StoredBlock(block34, new BigInteger("0"), 0);
        doReturn(storedBlock34).when(blockStoreMock).get(sha256HashMock66);
        Instant instant36 = Instant.ofEpochSecond(1700000000);
        List list35 = new ArrayList<>();
        Block block35 = new Block(0L, sha256HashMock70, sha256HashMock71, instant36, 0L, 0L, list35);
        StoredBlock storedBlock35 = new StoredBlock(block35, new BigInteger("0"), 0);
        doReturn(storedBlock35).when(blockStoreMock).get(sha256HashMock68);
        Instant instant37 = Instant.ofEpochSecond(1700000000);
        List list36 = new ArrayList<>();
        Block block36 = new Block(0L, sha256HashMock72, sha256HashMock73, instant37, 0L, 0L, list36);
        StoredBlock storedBlock36 = new StoredBlock(block36, new BigInteger("0"), 0);
        doReturn(storedBlock36).when(blockStoreMock).get(sha256HashMock70);
        Instant instant38 = Instant.ofEpochSecond(1700000000);
        List list37 = new ArrayList<>();
        Block block37 = new Block(0L, sha256HashMock74, sha256HashMock75, instant38, 0L, 0L, list37);
        StoredBlock storedBlock37 = new StoredBlock(block37, new BigInteger("0"), 0);
        doReturn(storedBlock37).when(blockStoreMock).get(sha256HashMock72);
        Instant instant39 = Instant.ofEpochSecond(1700000000);
        List list38 = new ArrayList<>();
        Block block38 = new Block(0L, sha256HashMock76, sha256HashMock77, instant39, 0L, 0L, list38);
        StoredBlock storedBlock38 = new StoredBlock(block38, new BigInteger("0"), 0);
        doReturn(storedBlock38).when(blockStoreMock).get(sha256HashMock74);
        Instant instant40 = Instant.ofEpochSecond(1700000000);
        List list39 = new ArrayList<>();
        Block block39 = new Block(0L, sha256HashMock78, sha256HashMock79, instant40, 0L, 0L, list39);
        StoredBlock storedBlock39 = new StoredBlock(block39, new BigInteger("0"), 0);
        doReturn(storedBlock39).when(blockStoreMock).get(sha256HashMock76);
        Instant instant41 = Instant.ofEpochSecond(1700000000);
        List list40 = new ArrayList<>();
        Block block40 = new Block(0L, sha256HashMock80, sha256HashMock81, instant41, 0L, 0L, list40);
        StoredBlock storedBlock40 = new StoredBlock(block40, new BigInteger("0"), 0);
        doReturn(storedBlock40).when(blockStoreMock).get(sha256HashMock78);
        Instant instant42 = Instant.ofEpochSecond(1700000000);
        List list41 = new ArrayList<>();
        Block block41 = new Block(0L, sha256HashMock82, sha256HashMock83, instant42, 0L, 0L, list41);
        StoredBlock storedBlock41 = new StoredBlock(block41, new BigInteger("0"), 0);
        doReturn(storedBlock41).when(blockStoreMock).get(sha256HashMock80);
        Instant instant43 = Instant.ofEpochSecond(1700000000);
        List list42 = new ArrayList<>();
        Block block42 = new Block(0L, sha256HashMock84, sha256HashMock85, instant43, 0L, 0L, list42);
        StoredBlock storedBlock42 = new StoredBlock(block42, new BigInteger("0"), 0);
        doReturn(storedBlock42).when(blockStoreMock).get(sha256HashMock82);
        Instant instant44 = Instant.ofEpochSecond(1700000000);
        List list43 = new ArrayList<>();
        Block block43 = new Block(0L, sha256HashMock86, sha256HashMock87, instant44, 0L, 0L, list43);
        StoredBlock storedBlock43 = new StoredBlock(block43, new BigInteger("0"), 0);
        doReturn(storedBlock43).when(blockStoreMock).get(sha256HashMock84);
        Instant instant45 = Instant.ofEpochSecond(1700000000);
        List list44 = new ArrayList<>();
        Block block44 = new Block(0L, sha256HashMock88, sha256HashMock89, instant45, 0L, 0L, list44);
        StoredBlock storedBlock44 = new StoredBlock(block44, new BigInteger("0"), 0);
        doReturn(storedBlock44).when(blockStoreMock).get(sha256HashMock86);
        Instant instant46 = Instant.ofEpochSecond(1700000000);
        List list45 = new ArrayList<>();
        Block block45 = new Block(0L, sha256HashMock90, sha256HashMock91, instant46, 0L, 0L, list45);
        StoredBlock storedBlock45 = new StoredBlock(block45, new BigInteger("0"), 0);
        doReturn(storedBlock45).when(blockStoreMock).get(sha256HashMock88);
        Instant instant47 = Instant.ofEpochSecond(1700000000);
        List list46 = new ArrayList<>();
        Block block46 = new Block(0L, sha256HashMock92, sha256HashMock93, instant47, 0L, 0L, list46);
        StoredBlock storedBlock46 = new StoredBlock(block46, new BigInteger("0"), 0);
        doReturn(storedBlock46).when(blockStoreMock).get(sha256HashMock90);
        Instant instant48 = Instant.ofEpochSecond(1700000000);
        List list47 = new ArrayList<>();
        Block block47 = new Block(0L, sha256HashMock94, sha256HashMock95, instant48, 0L, 0L, list47);
        StoredBlock storedBlock47 = new StoredBlock(block47, new BigInteger("0"), 0);
        doReturn(storedBlock47).when(blockStoreMock).get(sha256HashMock92);
        Instant instant49 = Instant.ofEpochSecond(1700000000);
        List list48 = new ArrayList<>();
        Block block48 = new Block(0L, sha256HashMock96, sha256HashMock97, instant49, 0L, 0L, list48);
        StoredBlock storedBlock48 = new StoredBlock(block48, new BigInteger("0"), 0);
        doReturn(storedBlock48).when(blockStoreMock).get(sha256HashMock94);
        Instant instant50 = Instant.ofEpochSecond(1700000000);
        List list49 = new ArrayList<>();
        Block block49 = new Block(0L, sha256HashMock98, sha256HashMock99, instant50, 0L, 0L, list49);
        StoredBlock storedBlock49 = new StoredBlock(block49, new BigInteger("0"), 0);
        doReturn(storedBlock49).when(blockStoreMock).get(sha256HashMock96);
        Instant instant51 = Instant.ofEpochSecond(1700000000);
        List list50 = new ArrayList<>();
        Block block50 = new Block(0L, sha256HashMock100, sha256HashMock101, instant51, 0L, 0L, list50);
        StoredBlock storedBlock50 = new StoredBlock(block50, new BigInteger("0"), 0);
        doReturn(storedBlock50).when(blockStoreMock).get(sha256HashMock98);
        Instant instant52 = Instant.ofEpochSecond(1700000000);
        List list51 = new ArrayList<>();
        Block block51 = new Block(0L, sha256HashMock102, sha256HashMock103, instant52, 0L, 0L, list51);
        StoredBlock storedBlock51 = new StoredBlock(block51, new BigInteger("0"), 0);
        doReturn(storedBlock51).when(blockStoreMock).get(sha256HashMock100);
        Instant instant53 = Instant.ofEpochSecond(1700000000);
        List list52 = new ArrayList<>();
        Block block52 = new Block(0L, sha256HashMock104, sha256HashMock105, instant53, 0L, 0L, list52);
        StoredBlock storedBlock52 = new StoredBlock(block52, new BigInteger("0"), 0);
        doReturn(storedBlock52).when(blockStoreMock).get(sha256HashMock102);
        Instant instant54 = Instant.ofEpochSecond(1700000000);
        List list53 = new ArrayList<>();
        Block block53 = new Block(0L, sha256HashMock106, sha256HashMock107, instant54, 0L, 0L, list53);
        StoredBlock storedBlock53 = new StoredBlock(block53, new BigInteger("0"), 0);
        doReturn(storedBlock53).when(blockStoreMock).get(sha256HashMock104);
        Instant instant55 = Instant.ofEpochSecond(1700000000);
        List list54 = new ArrayList<>();
        Block block54 = new Block(0L, sha256HashMock108, sha256HashMock109, instant55, 0L, 0L, list54);
        StoredBlock storedBlock54 = new StoredBlock(block54, new BigInteger("0"), 0);
        doReturn(storedBlock54).when(blockStoreMock).get(sha256HashMock106);
        Instant instant56 = Instant.ofEpochSecond(1700000000);
        List list55 = new ArrayList<>();
        Block block55 = new Block(0L, sha256HashMock110, sha256HashMock111, instant56, 0L, 0L, list55);
        StoredBlock storedBlock55 = new StoredBlock(block55, new BigInteger("0"), 0);
        doReturn(storedBlock55).when(blockStoreMock).get(sha256HashMock108);
        Instant instant57 = Instant.ofEpochSecond(1700000000);
        List list56 = new ArrayList<>();
        Block block56 = new Block(0L, sha256HashMock112, sha256HashMock113, instant57, 0L, 0L, list56);
        StoredBlock storedBlock56 = new StoredBlock(block56, new BigInteger("0"), 0);
        doReturn(storedBlock56).when(blockStoreMock).get(sha256HashMock110);
        Instant instant58 = Instant.ofEpochSecond(1700000000);
        List list57 = new ArrayList<>();
        Block block57 = new Block(0L, sha256HashMock114, sha256HashMock115, instant58, 0L, 0L, list57);
        StoredBlock storedBlock57 = new StoredBlock(block57, new BigInteger("0"), 0);
        doReturn(storedBlock57).when(blockStoreMock).get(sha256HashMock112);
        Instant instant59 = Instant.ofEpochSecond(1700000000);
        List list58 = new ArrayList<>();
        Block block58 = new Block(0L, sha256HashMock116, sha256HashMock117, instant59, 0L, 0L, list58);
        StoredBlock storedBlock58 = new StoredBlock(block58, new BigInteger("0"), 0);
        doReturn(storedBlock58).when(blockStoreMock).get(sha256HashMock114);
        Instant instant60 = Instant.ofEpochSecond(1700000000);
        List list59 = new ArrayList<>();
        Block block59 = new Block(0L, sha256HashMock118, sha256HashMock119, instant60, 0L, 0L, list59);
        StoredBlock storedBlock59 = new StoredBlock(block59, new BigInteger("0"), 0);
        doReturn(storedBlock59).when(blockStoreMock).get(sha256HashMock116);
        Instant instant61 = Instant.ofEpochSecond(1700000000);
        List list60 = new ArrayList<>();
        Block block60 = new Block(0L, sha256HashMock120, sha256HashMock121, instant61, 0L, 0L, list60);
        StoredBlock storedBlock60 = new StoredBlock(block60, new BigInteger("0"), 0);
        doReturn(storedBlock60).when(blockStoreMock).get(sha256HashMock118);
        Instant instant62 = Instant.ofEpochSecond(1700000000);
        List list61 = new ArrayList<>();
        Block block61 = new Block(0L, sha256HashMock122, sha256HashMock123, instant62, 0L, 0L, list61);
        StoredBlock storedBlock61 = new StoredBlock(block61, new BigInteger("0"), 0);
        doReturn(storedBlock61).when(blockStoreMock).get(sha256HashMock120);
        Instant instant63 = Instant.ofEpochSecond(1700000000);
        List list62 = new ArrayList<>();
        Block block62 = new Block(0L, sha256HashMock124, sha256HashMock125, instant63, 0L, 0L, list62);
        StoredBlock storedBlock62 = new StoredBlock(block62, new BigInteger("0"), 0);
        doReturn(storedBlock62).when(blockStoreMock).get(sha256HashMock122);
        Instant instant64 = Instant.ofEpochSecond(1700000000);
        List list63 = new ArrayList<>();
        Block block63 = new Block(0L, sha256HashMock126, sha256HashMock127, instant64, 0L, 0L, list63);
        StoredBlock storedBlock63 = new StoredBlock(block63, new BigInteger("0"), 0);
        doReturn(storedBlock63).when(blockStoreMock).get(sha256HashMock124);
        Instant instant65 = Instant.ofEpochSecond(1700000000);
        List list64 = new ArrayList<>();
        Block block64 = new Block(0L, sha256HashMock128, sha256HashMock129, instant65, 0L, 0L, list64);
        StoredBlock storedBlock64 = new StoredBlock(block64, new BigInteger("0"), 0);
        doReturn(storedBlock64).when(blockStoreMock).get(sha256HashMock126);
        Instant instant66 = Instant.ofEpochSecond(1700000000);
        List list65 = new ArrayList<>();
        Block block65 = new Block(0L, sha256HashMock130, sha256HashMock131, instant66, 0L, 0L, list65);
        StoredBlock storedBlock65 = new StoredBlock(block65, new BigInteger("0"), 0);
        doReturn(storedBlock65).when(blockStoreMock).get(sha256HashMock128);
        Instant instant67 = Instant.ofEpochSecond(1700000000);
        List list66 = new ArrayList<>();
        Block block66 = new Block(0L, sha256HashMock132, sha256HashMock133, instant67, 0L, 0L, list66);
        StoredBlock storedBlock66 = new StoredBlock(block66, new BigInteger("0"), 0);
        doReturn(storedBlock66).when(blockStoreMock).get(sha256HashMock130);
        Instant instant68 = Instant.ofEpochSecond(1700000000);
        List list67 = new ArrayList<>();
        Block block67 = new Block(0L, sha256HashMock134, sha256HashMock135, instant68, 0L, 0L, list67);
        StoredBlock storedBlock67 = new StoredBlock(block67, new BigInteger("0"), 0);
        doReturn(storedBlock67).when(blockStoreMock).get(sha256HashMock132);
        Instant instant69 = Instant.ofEpochSecond(1700000000);
        List list68 = new ArrayList<>();
        Block block68 = new Block(0L, sha256HashMock136, sha256HashMock137, instant69, 0L, 0L, list68);
        StoredBlock storedBlock68 = new StoredBlock(block68, new BigInteger("0"), 0);
        doReturn(storedBlock68).when(blockStoreMock).get(sha256HashMock134);
        Instant instant70 = Instant.ofEpochSecond(1700000000);
        List list69 = new ArrayList<>();
        Block block69 = new Block(0L, sha256HashMock138, sha256HashMock139, instant70, 0L, 0L, list69);
        StoredBlock storedBlock69 = new StoredBlock(block69, new BigInteger("0"), 0);
        doReturn(storedBlock69).when(blockStoreMock).get(sha256HashMock136);
        Instant instant71 = Instant.ofEpochSecond(1700000000);
        List list70 = new ArrayList<>();
        Block block70 = new Block(0L, sha256HashMock140, sha256HashMock141, instant71, 0L, 0L, list70);
        StoredBlock storedBlock70 = new StoredBlock(block70, new BigInteger("0"), 0);
        doReturn(storedBlock70).when(blockStoreMock).get(sha256HashMock138);
        Instant instant72 = Instant.ofEpochSecond(1700000000);
        List list71 = new ArrayList<>();
        Block block71 = new Block(0L, sha256HashMock142, sha256HashMock143, instant72, 0L, 0L, list71);
        StoredBlock storedBlock71 = new StoredBlock(block71, new BigInteger("0"), 0);
        doReturn(storedBlock71).when(blockStoreMock).get(sha256HashMock140);
        Instant instant73 = Instant.ofEpochSecond(1700000000);
        List list72 = new ArrayList<>();
        Block block72 = new Block(0L, sha256HashMock144, sha256HashMock145, instant73, 0L, 0L, list72);
        StoredBlock storedBlock72 = new StoredBlock(block72, new BigInteger("0"), 0);
        doReturn(storedBlock72).when(blockStoreMock).get(sha256HashMock142);
        Instant instant74 = Instant.ofEpochSecond(1700000000);
        List list73 = new ArrayList<>();
        Block block73 = new Block(0L, sha256HashMock146, sha256HashMock147, instant74, 0L, 0L, list73);
        StoredBlock storedBlock73 = new StoredBlock(block73, new BigInteger("0"), 0);
        doReturn(storedBlock73).when(blockStoreMock).get(sha256HashMock144);
        Instant instant75 = Instant.ofEpochSecond(1700000000);
        List list74 = new ArrayList<>();
        Block block74 = new Block(0L, sha256HashMock148, sha256HashMock149, instant75, 0L, 0L, list74);
        StoredBlock storedBlock74 = new StoredBlock(block74, new BigInteger("0"), 0);
        doReturn(storedBlock74).when(blockStoreMock).get(sha256HashMock146);
        Instant instant76 = Instant.ofEpochSecond(1700000000);
        List list75 = new ArrayList<>();
        Block block75 = new Block(0L, sha256HashMock150, sha256HashMock151, instant76, 0L, 0L, list75);
        StoredBlock storedBlock75 = new StoredBlock(block75, new BigInteger("0"), 0);
        doReturn(storedBlock75).when(blockStoreMock).get(sha256HashMock148);
        Instant instant77 = Instant.ofEpochSecond(1700000000);
        List list76 = new ArrayList<>();
        Block block76 = new Block(0L, sha256HashMock152, sha256HashMock153, instant77, 0L, 0L, list76);
        StoredBlock storedBlock76 = new StoredBlock(block76, new BigInteger("0"), 0);
        doReturn(storedBlock76).when(blockStoreMock).get(sha256HashMock150);
        Instant instant78 = Instant.ofEpochSecond(1700000000);
        List list77 = new ArrayList<>();
        Block block77 = new Block(0L, sha256HashMock154, sha256HashMock155, instant78, 0L, 0L, list77);
        StoredBlock storedBlock77 = new StoredBlock(block77, new BigInteger("0"), 0);
        doReturn(storedBlock77).when(blockStoreMock).get(sha256HashMock152);
        Instant instant79 = Instant.ofEpochSecond(1700000000);
        List list78 = new ArrayList<>();
        Block block78 = new Block(0L, sha256HashMock156, sha256HashMock157, instant79, 0L, 0L, list78);
        StoredBlock storedBlock78 = new StoredBlock(block78, new BigInteger("0"), 0);
        doReturn(storedBlock78).when(blockStoreMock).get(sha256HashMock154);
        Instant instant80 = Instant.ofEpochSecond(1700000000);
        List list79 = new ArrayList<>();
        Block block79 = new Block(0L, sha256HashMock158, sha256HashMock159, instant80, 0L, 0L, list79);
        StoredBlock storedBlock79 = new StoredBlock(block79, new BigInteger("0"), 0);
        doReturn(storedBlock79).when(blockStoreMock).get(sha256HashMock156);
        Instant instant81 = Instant.ofEpochSecond(1700000000);
        List list80 = new ArrayList<>();
        Block block80 = new Block(0L, sha256HashMock160, sha256HashMock161, instant81, 0L, 0L, list80);
        StoredBlock storedBlock80 = new StoredBlock(block80, new BigInteger("0"), 0);
        doReturn(storedBlock80).when(blockStoreMock).get(sha256HashMock158);
        Instant instant82 = Instant.ofEpochSecond(1700000000);
        List list81 = new ArrayList<>();
        Block block81 = new Block(0L, sha256HashMock162, sha256HashMock163, instant82, 0L, 0L, list81);
        StoredBlock storedBlock81 = new StoredBlock(block81, new BigInteger("0"), 0);
        doReturn(storedBlock81).when(blockStoreMock).get(sha256HashMock160);
        Instant instant83 = Instant.ofEpochSecond(1700000000);
        List list82 = new ArrayList<>();
        Block block82 = new Block(0L, sha256HashMock164, sha256HashMock165, instant83, 0L, 0L, list82);
        StoredBlock storedBlock82 = new StoredBlock(block82, new BigInteger("0"), 0);
        doReturn(storedBlock82).when(blockStoreMock).get(sha256HashMock162);
        Instant instant84 = Instant.ofEpochSecond(1700000000);
        List list83 = new ArrayList<>();
        Block block83 = new Block(0L, sha256HashMock166, sha256HashMock167, instant84, 0L, 0L, list83);
        StoredBlock storedBlock83 = new StoredBlock(block83, new BigInteger("0"), 0);
        doReturn(storedBlock83).when(blockStoreMock).get(sha256HashMock164);
        Instant instant85 = Instant.ofEpochSecond(1700000000);
        List list84 = new ArrayList<>();
        Block block84 = new Block(0L, sha256HashMock168, sha256HashMock169, instant85, 0L, 0L, list84);
        StoredBlock storedBlock84 = new StoredBlock(block84, new BigInteger("0"), 0);
        doReturn(storedBlock84).when(blockStoreMock).get(sha256HashMock166);
        Instant instant86 = Instant.ofEpochSecond(1700000000);
        List list85 = new ArrayList<>();
        Block block85 = new Block(0L, sha256HashMock170, sha256HashMock171, instant86, 0L, 0L, list85);
        StoredBlock storedBlock85 = new StoredBlock(block85, new BigInteger("0"), 0);
        doReturn(storedBlock85).when(blockStoreMock).get(sha256HashMock168);
        Instant instant87 = Instant.ofEpochSecond(1700000000);
        List list86 = new ArrayList<>();
        Block block86 = new Block(0L, sha256HashMock172, sha256HashMock173, instant87, 0L, 0L, list86);
        StoredBlock storedBlock86 = new StoredBlock(block86, new BigInteger("0"), 0);
        doReturn(storedBlock86).when(blockStoreMock).get(sha256HashMock170);
        Instant instant88 = Instant.ofEpochSecond(1700000000);
        List list87 = new ArrayList<>();
        Block block87 = new Block(0L, sha256HashMock174, sha256HashMock175, instant88, 0L, 0L, list87);
        StoredBlock storedBlock87 = new StoredBlock(block87, new BigInteger("0"), 0);
        doReturn(storedBlock87).when(blockStoreMock).get(sha256HashMock172);
        Instant instant89 = Instant.ofEpochSecond(1700000000);
        List list88 = new ArrayList<>();
        Block block88 = new Block(0L, sha256HashMock176, sha256HashMock177, instant89, 0L, 0L, list88);
        StoredBlock storedBlock88 = new StoredBlock(block88, new BigInteger("0"), 0);
        doReturn(storedBlock88).when(blockStoreMock).get(sha256HashMock174);
        Instant instant90 = Instant.ofEpochSecond(1700000000);
        List list89 = new ArrayList<>();
        Block block89 = new Block(0L, sha256HashMock178, sha256HashMock179, instant90, 0L, 0L, list89);
        StoredBlock storedBlock89 = new StoredBlock(block89, new BigInteger("0"), 0);
        doReturn(storedBlock89).when(blockStoreMock).get(sha256HashMock176);
        Instant instant91 = Instant.ofEpochSecond(1700000000);
        List list90 = new ArrayList<>();
        Block block90 = new Block(0L, sha256HashMock180, sha256HashMock181, instant91, 0L, 0L, list90);
        StoredBlock storedBlock90 = new StoredBlock(block90, new BigInteger("0"), 0);
        doReturn(storedBlock90).when(blockStoreMock).get(sha256HashMock178);
        Instant instant92 = Instant.ofEpochSecond(1700000000);
        List list91 = new ArrayList<>();
        Block block91 = new Block(0L, sha256HashMock182, sha256HashMock183, instant92, 0L, 0L, list91);
        StoredBlock storedBlock91 = new StoredBlock(block91, new BigInteger("0"), 0);
        doReturn(storedBlock91).when(blockStoreMock).get(sha256HashMock180);
        Instant instant93 = Instant.ofEpochSecond(1700000000);
        List list92 = new ArrayList<>();
        Block block92 = new Block(0L, sha256HashMock184, sha256HashMock185, instant93, 0L, 0L, list92);
        StoredBlock storedBlock92 = new StoredBlock(block92, new BigInteger("0"), 0);
        doReturn(storedBlock92).when(blockStoreMock).get(sha256HashMock182);
        Instant instant94 = Instant.ofEpochSecond(1700000000);
        List list93 = new ArrayList<>();
        Block block93 = new Block(0L, sha256HashMock186, sha256HashMock187, instant94, 0L, 0L, list93);
        StoredBlock storedBlock93 = new StoredBlock(block93, new BigInteger("0"), 0);
        doReturn(storedBlock93).when(blockStoreMock).get(sha256HashMock184);
        Instant instant95 = Instant.ofEpochSecond(1700000000);
        List list94 = new ArrayList<>();
        Block block94 = new Block(0L, sha256HashMock188, sha256HashMock189, instant95, 0L, 0L, list94);
        StoredBlock storedBlock94 = new StoredBlock(block94, new BigInteger("0"), 0);
        doReturn(storedBlock94).when(blockStoreMock).get(sha256HashMock186);
        Instant instant96 = Instant.ofEpochSecond(1700000000);
        List list95 = new ArrayList<>();
        Block block95 = new Block(0L, sha256HashMock190, sha256HashMock191, instant96, 0L, 0L, list95);
        StoredBlock storedBlock95 = new StoredBlock(block95, new BigInteger("0"), 0);
        doReturn(storedBlock95).when(blockStoreMock).get(sha256HashMock188);
        Instant instant97 = Instant.ofEpochSecond(1700000000);
        List list96 = new ArrayList<>();
        Block block96 = new Block(0L, sha256HashMock192, sha256HashMock193, instant97, 0L, 0L, list96);
        StoredBlock storedBlock96 = new StoredBlock(block96, new BigInteger("0"), 0);
        doReturn(storedBlock96).when(blockStoreMock).get(sha256HashMock190);
        Instant instant98 = Instant.ofEpochSecond(1700000000);
        List list97 = new ArrayList<>();
        Block block97 = new Block(0L, sha256HashMock194, sha256HashMock195, instant98, 0L, 0L, list97);
        StoredBlock storedBlock97 = new StoredBlock(block97, new BigInteger("0"), 0);
        doReturn(storedBlock97).when(blockStoreMock).get(sha256HashMock192);
        Instant instant99 = Instant.ofEpochSecond(1700000000);
        List list98 = new ArrayList<>();
        Block block98 = new Block(0L, sha256HashMock196, sha256HashMock197, instant99, 0L, 0L, list98);
        StoredBlock storedBlock98 = new StoredBlock(block98, new BigInteger("0"), 0);
        doReturn(storedBlock98).when(blockStoreMock).get(sha256HashMock194);
        Instant instant100 = Instant.ofEpochSecond(1700000000);
        List list99 = new ArrayList<>();
        Block block99 = new Block(0L, sha256HashMock198, sha256HashMock199, instant100, 0L, 0L, list99);
        StoredBlock storedBlock99 = new StoredBlock(block99, new BigInteger("0"), 0);
        doReturn(storedBlock99).when(blockStoreMock).get(sha256HashMock196);
        Instant instant101 = Instant.ofEpochSecond(1700000000);
        List list100 = new ArrayList<>();
        Block block100 = new Block(0L, sha256HashMock200, sha256HashMock201, instant101, 0L, 0L, list100);
        StoredBlock storedBlock100 = new StoredBlock(block100, new BigInteger("0"), 0);
        doReturn(storedBlock100).when(blockStoreMock).get(sha256HashMock198);
        Sha256Hash sha256HashMock203 = mock(Sha256Hash.class);
        Instant instant102 = Instant.ofEpochSecond(1700000000);
        List list101 = new ArrayList<>();
        Block block101 = new Block(0L, sha256HashMock202, sha256HashMock203, instant102, 0L, 0L, list101);
        StoredBlock storedBlock101 = new StoredBlock(block101, new BigInteger("0"), 1);
        doReturn(storedBlock101).when(blockStoreMock).get(sha256HashMock200);
        TestNet3Params target = spy(new TestNet3Params());
        doReturn(false, true, false).when(target).isDifficultyTransitionPoint(0);
        thrown.expect(IllegalStateException.class);
        StoredBlock storedBlock102 = new StoredBlock(prevMock, new BigInteger("0"), 0);
        //Act Statement(s)
        target.checkDifficultyTransitions(storedBlock102, nextBlockMock, blockStoreMock);
        //Assert statement(s)
        verify(prevMock).getHash();
        verify(nextBlockMock).time();
        verify(blockStoreMock).get(sha256HashMock);
        verify(blockStoreMock).get(sha256HashMock2);
        verify(blockStoreMock).get(sha256HashMock4);
        verify(blockStoreMock).get(sha256HashMock6);
        verify(blockStoreMock).get(sha256HashMock8);
        verify(blockStoreMock).get(sha256HashMock10);
        verify(blockStoreMock).get(sha256HashMock12);
        verify(blockStoreMock).get(sha256HashMock14);
        verify(blockStoreMock).get(sha256HashMock16);
        verify(blockStoreMock).get(sha256HashMock18);
        verify(blockStoreMock).get(sha256HashMock20);
        verify(blockStoreMock).get(sha256HashMock22);
        verify(blockStoreMock).get(sha256HashMock24);
        verify(blockStoreMock).get(sha256HashMock26);
        verify(blockStoreMock).get(sha256HashMock28);
        verify(blockStoreMock).get(sha256HashMock30);
        verify(blockStoreMock).get(sha256HashMock32);
        verify(blockStoreMock).get(sha256HashMock34);
        verify(blockStoreMock).get(sha256HashMock36);
        verify(blockStoreMock).get(sha256HashMock38);
        verify(blockStoreMock).get(sha256HashMock40);
        verify(blockStoreMock).get(sha256HashMock42);
        verify(blockStoreMock).get(sha256HashMock44);
        verify(blockStoreMock).get(sha256HashMock46);
        verify(blockStoreMock).get(sha256HashMock48);
        verify(blockStoreMock).get(sha256HashMock50);
        verify(blockStoreMock).get(sha256HashMock52);
        verify(blockStoreMock).get(sha256HashMock54);
        verify(blockStoreMock).get(sha256HashMock56);
        verify(blockStoreMock).get(sha256HashMock58);
        verify(blockStoreMock).get(sha256HashMock60);
        verify(blockStoreMock).get(sha256HashMock62);
        verify(blockStoreMock).get(sha256HashMock64);
        verify(blockStoreMock).get(sha256HashMock66);
        verify(blockStoreMock).get(sha256HashMock68);
        verify(blockStoreMock).get(sha256HashMock70);
        verify(blockStoreMock).get(sha256HashMock72);
        verify(blockStoreMock).get(sha256HashMock74);
        verify(blockStoreMock).get(sha256HashMock76);
        verify(blockStoreMock).get(sha256HashMock78);
        verify(blockStoreMock).get(sha256HashMock80);
        verify(blockStoreMock).get(sha256HashMock82);
        verify(blockStoreMock).get(sha256HashMock84);
        verify(blockStoreMock).get(sha256HashMock86);
        verify(blockStoreMock).get(sha256HashMock88);
        verify(blockStoreMock).get(sha256HashMock90);
        verify(blockStoreMock).get(sha256HashMock92);
        verify(blockStoreMock).get(sha256HashMock94);
        verify(blockStoreMock).get(sha256HashMock96);
        verify(blockStoreMock).get(sha256HashMock98);
        verify(blockStoreMock).get(sha256HashMock100);
        verify(blockStoreMock).get(sha256HashMock102);
        verify(blockStoreMock).get(sha256HashMock104);
        verify(blockStoreMock).get(sha256HashMock106);
        verify(blockStoreMock).get(sha256HashMock108);
        verify(blockStoreMock).get(sha256HashMock110);
        verify(blockStoreMock).get(sha256HashMock112);
        verify(blockStoreMock).get(sha256HashMock114);
        verify(blockStoreMock).get(sha256HashMock116);
        verify(blockStoreMock).get(sha256HashMock118);
        verify(blockStoreMock).get(sha256HashMock120);
        verify(blockStoreMock).get(sha256HashMock122);
        verify(blockStoreMock).get(sha256HashMock124);
        verify(blockStoreMock).get(sha256HashMock126);
        verify(blockStoreMock).get(sha256HashMock128);
        verify(blockStoreMock).get(sha256HashMock130);
        verify(blockStoreMock).get(sha256HashMock132);
        verify(blockStoreMock).get(sha256HashMock134);
        verify(blockStoreMock).get(sha256HashMock136);
        verify(blockStoreMock).get(sha256HashMock138);
        verify(blockStoreMock).get(sha256HashMock140);
        verify(blockStoreMock).get(sha256HashMock142);
        verify(blockStoreMock).get(sha256HashMock144);
        verify(blockStoreMock).get(sha256HashMock146);
        verify(blockStoreMock).get(sha256HashMock148);
        verify(blockStoreMock).get(sha256HashMock150);
        verify(blockStoreMock).get(sha256HashMock152);
        verify(blockStoreMock).get(sha256HashMock154);
        verify(blockStoreMock).get(sha256HashMock156);
        verify(blockStoreMock).get(sha256HashMock158);
        verify(blockStoreMock).get(sha256HashMock160);
        verify(blockStoreMock).get(sha256HashMock162);
        verify(blockStoreMock).get(sha256HashMock164);
        verify(blockStoreMock).get(sha256HashMock166);
        verify(blockStoreMock).get(sha256HashMock168);
        verify(blockStoreMock).get(sha256HashMock170);
        verify(blockStoreMock).get(sha256HashMock172);
        verify(blockStoreMock).get(sha256HashMock174);
        verify(blockStoreMock).get(sha256HashMock176);
        verify(blockStoreMock).get(sha256HashMock178);
        verify(blockStoreMock).get(sha256HashMock180);
        verify(blockStoreMock).get(sha256HashMock182);
        verify(blockStoreMock).get(sha256HashMock184);
        verify(blockStoreMock).get(sha256HashMock186);
        verify(blockStoreMock).get(sha256HashMock188);
        verify(blockStoreMock).get(sha256HashMock190);
        verify(blockStoreMock).get(sha256HashMock192);
        verify(blockStoreMock).get(sha256HashMock194);
        verify(blockStoreMock).get(sha256HashMock196);
        verify(blockStoreMock).get(sha256HashMock198);
        verify(blockStoreMock).get(sha256HashMock200);
        verify(target, times(3)).isDifficultyTransitionPoint(0);
    }

    //Sapient generated method id: ${dd162f6d-781d-35bb-ab8e-e90c139a93f7}, hash: 56BB28520EA3EF9E1FB3B6A55D6B65D9
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
        doReturn(1699999999L).when(prevMock).getTimeSeconds();
        doReturn(new BigInteger("26959535291011309493156476344723991336010898738574164086137773096960")).when(prevMock).getDifficultyTargetAsInteger();
        TestNet3Params target = spy(new TestNet3Params());
        doReturn(false).when(target).isDifficultyTransitionPoint(1);
        doReturn(blockMock, blockMock2).when(target).getGenesisBlock();
        thrown.expect(VerificationException.class);
        StoredBlock storedBlock = new StoredBlock(prevMock, new BigInteger("0"), 0);
        Instant instant = Instant.ofEpochSecond(1700000000);
        List list = new ArrayList<>();
        Block block = new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, list);
        //Act Statement(s)
        target.checkDifficultyTransitions(storedBlock, block, blockStoreMock);
        //Assert statement(s)
        verify(prevMock).getTimeSeconds();
        verify(prevMock).getDifficultyTargetAsInteger();
        verify(target).isDifficultyTransitionPoint(1);
        verify(target, times(2)).getGenesisBlock();
    }

    //Sapient generated method id: ${f7e5b438-9a95-3a95-9689-67f812196cdc}, hash: AF7936E869D2CE985EEAF5B3519BEC46
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
        doReturn(1).when(storedPrevMock).getHeight();
        doReturn(blockMock).when(storedPrevMock).getHeader();
        doReturn(1L).when(blockMock).getTimeSeconds();
        doReturn(new BigInteger("26959535291011309493156476344723991336010898738574164086137773096960")).when(blockMock).getDifficultyTargetAsInteger();
        StoredBlock storedBlock = new StoredBlock(blockMock2, new BigInteger("0"), 0);
        doReturn(storedBlock).when(storedPrevMock).getPrev(blockStoreMock);
        doReturn(new BigInteger("1")).when(blockMock2).getDifficultyTargetAsInteger();
        Instant instant = Instant.ofEpochSecond(1700000000);
        doReturn(instant).when(nextBlockMock).time();
        doReturn(2L).when(nextBlockMock).getTimeSeconds();
        doReturn(new BigInteger("1")).when(nextBlockMock).getDifficultyTargetAsInteger();
        TestNet3Params target = spy(new TestNet3Params());
        doReturn(false).when(target).isDifficultyTransitionPoint(1);
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
        verify(target).isDifficultyTransitionPoint(1);
        verify(target, times(2)).getGenesisBlock();
    }

    //Sapient generated method id: ${f9d6a442-7d9d-3507-9385-97139422d195}, hash: DCC875B6722E36DF85C31B45E09A0161
    @Ignore()
    @Test()
    public void checkDifficultyTransitionsWhenNewTargetCompactNotEqualsReceivedTargetCompactThrowsVerificationException() throws VerificationException, BlockStoreException {
        /* Branches:
         * (!isDifficultyTransitionPoint(storedPrev.getHeight())) : true
         * (nextBlock.time().isAfter(testnetDiffDate)) : false
         * (!isDifficultyTransitionPoint(storedPrev.getHeight())) : false  #  inside checkDifficultyTransitions method
         * (i < interval) : true  #  inside checkDifficultyTransitions method
         * (cursor == null) : false  #  inside checkDifficultyTransitions method
         * (cursor != null) : true  #  inside checkDifficultyTransitions method
         * (isDifficultyTransitionPoint(cursor.getHeight() - 1)) : true  #  inside checkDifficultyTransitions method
         * (watch.elapsed().toMillis() > 50) : true  #  inside checkDifficultyTransitions method
         * (timespan < targetTimespan / 4) : true  #  inside checkDifficultyTransitions method
         * (timespan > targetTimespan * 4) : false  #  inside checkDifficultyTransitions method
         * (newTarget.compareTo(maxTarget) > 0) : true  #  inside checkDifficultyTransitions method
         * (newTargetCompact != receivedTargetCompact) : true  #  inside checkDifficultyTransitions method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS)) {
            doReturn(sha256HashMock).when(prevMock).getHash();
            doReturn(0L).when(prevMock).getTimeSeconds();
            doReturn(0L).when(prevMock).getDifficultyTarget();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(nextBlockMock).time();
            doReturn(0L).when(nextBlockMock).getDifficultyTarget();
            Instant instant2 = Instant.ofEpochSecond(1700000000);
            List list = new ArrayList<>();
            Block block = new Block(0L, sha256HashMock2, sha256HashMock3, instant2, 0L, 0L, list);
            StoredBlock storedBlock = new StoredBlock(block, new BigInteger("0"), 0);
            doReturn(storedBlock).when(blockStoreMock).get(sha256HashMock);
            Instant instant3 = Instant.ofEpochSecond(1700000000);
            List list2 = new ArrayList<>();
            Block block2 = new Block(0L, sha256HashMock4, sha256HashMock5, instant3, 0L, 0L, list2);
            StoredBlock storedBlock2 = new StoredBlock(block2, new BigInteger("0"), 0);
            doReturn(storedBlock2).when(blockStoreMock).get(sha256HashMock2);
            Instant instant4 = Instant.ofEpochSecond(1700000000);
            List list3 = new ArrayList<>();
            Block block3 = new Block(0L, sha256HashMock6, sha256HashMock7, instant4, 0L, 0L, list3);
            StoredBlock storedBlock3 = new StoredBlock(block3, new BigInteger("0"), 0);
            doReturn(storedBlock3).when(blockStoreMock).get(sha256HashMock4);
            Instant instant5 = Instant.ofEpochSecond(1700000000);
            List list4 = new ArrayList<>();
            Block block4 = new Block(0L, sha256HashMock8, sha256HashMock9, instant5, 0L, 0L, list4);
            StoredBlock storedBlock4 = new StoredBlock(block4, new BigInteger("0"), 0);
            doReturn(storedBlock4).when(blockStoreMock).get(sha256HashMock6);
            Instant instant6 = Instant.ofEpochSecond(1700000000);
            List list5 = new ArrayList<>();
            Block block5 = new Block(0L, sha256HashMock10, sha256HashMock11, instant6, 0L, 0L, list5);
            StoredBlock storedBlock5 = new StoredBlock(block5, new BigInteger("0"), 0);
            doReturn(storedBlock5).when(blockStoreMock).get(sha256HashMock8);
            Instant instant7 = Instant.ofEpochSecond(1700000000);
            List list6 = new ArrayList<>();
            Block block6 = new Block(0L, sha256HashMock12, sha256HashMock13, instant7, 0L, 0L, list6);
            StoredBlock storedBlock6 = new StoredBlock(block6, new BigInteger("0"), 0);
            doReturn(storedBlock6).when(blockStoreMock).get(sha256HashMock10);
            Instant instant8 = Instant.ofEpochSecond(1700000000);
            List list7 = new ArrayList<>();
            Block block7 = new Block(0L, sha256HashMock14, sha256HashMock15, instant8, 0L, 0L, list7);
            StoredBlock storedBlock7 = new StoredBlock(block7, new BigInteger("0"), 0);
            doReturn(storedBlock7).when(blockStoreMock).get(sha256HashMock12);
            Instant instant9 = Instant.ofEpochSecond(1700000000);
            List list8 = new ArrayList<>();
            Block block8 = new Block(0L, sha256HashMock16, sha256HashMock17, instant9, 0L, 0L, list8);
            StoredBlock storedBlock8 = new StoredBlock(block8, new BigInteger("0"), 0);
            doReturn(storedBlock8).when(blockStoreMock).get(sha256HashMock14);
            Instant instant10 = Instant.ofEpochSecond(1700000000);
            List list9 = new ArrayList<>();
            Block block9 = new Block(0L, sha256HashMock18, sha256HashMock19, instant10, 0L, 0L, list9);
            StoredBlock storedBlock9 = new StoredBlock(block9, new BigInteger("0"), 0);
            doReturn(storedBlock9).when(blockStoreMock).get(sha256HashMock16);
            Instant instant11 = Instant.ofEpochSecond(1700000000);
            List list10 = new ArrayList<>();
            Block block10 = new Block(0L, sha256HashMock20, sha256HashMock21, instant11, 0L, 0L, list10);
            StoredBlock storedBlock10 = new StoredBlock(block10, new BigInteger("0"), 0);
            doReturn(storedBlock10).when(blockStoreMock).get(sha256HashMock18);
            Instant instant12 = Instant.ofEpochSecond(1700000000);
            List list11 = new ArrayList<>();
            Block block11 = new Block(0L, sha256HashMock22, sha256HashMock23, instant12, 0L, 0L, list11);
            StoredBlock storedBlock11 = new StoredBlock(block11, new BigInteger("0"), 0);
            doReturn(storedBlock11).when(blockStoreMock).get(sha256HashMock20);
            Instant instant13 = Instant.ofEpochSecond(1700000000);
            List list12 = new ArrayList<>();
            Block block12 = new Block(0L, sha256HashMock24, sha256HashMock25, instant13, 0L, 0L, list12);
            StoredBlock storedBlock12 = new StoredBlock(block12, new BigInteger("0"), 0);
            doReturn(storedBlock12).when(blockStoreMock).get(sha256HashMock22);
            Instant instant14 = Instant.ofEpochSecond(1700000000);
            List list13 = new ArrayList<>();
            Block block13 = new Block(0L, sha256HashMock26, sha256HashMock27, instant14, 0L, 0L, list13);
            StoredBlock storedBlock13 = new StoredBlock(block13, new BigInteger("0"), 0);
            doReturn(storedBlock13).when(blockStoreMock).get(sha256HashMock24);
            Instant instant15 = Instant.ofEpochSecond(1700000000);
            List list14 = new ArrayList<>();
            Block block14 = new Block(0L, sha256HashMock28, sha256HashMock29, instant15, 0L, 0L, list14);
            StoredBlock storedBlock14 = new StoredBlock(block14, new BigInteger("0"), 0);
            doReturn(storedBlock14).when(blockStoreMock).get(sha256HashMock26);
            Instant instant16 = Instant.ofEpochSecond(1700000000);
            List list15 = new ArrayList<>();
            Block block15 = new Block(0L, sha256HashMock30, sha256HashMock31, instant16, 0L, 0L, list15);
            StoredBlock storedBlock15 = new StoredBlock(block15, new BigInteger("0"), 0);
            doReturn(storedBlock15).when(blockStoreMock).get(sha256HashMock28);
            Instant instant17 = Instant.ofEpochSecond(1700000000);
            List list16 = new ArrayList<>();
            Block block16 = new Block(0L, sha256HashMock32, sha256HashMock33, instant17, 0L, 0L, list16);
            StoredBlock storedBlock16 = new StoredBlock(block16, new BigInteger("0"), 0);
            doReturn(storedBlock16).when(blockStoreMock).get(sha256HashMock30);
            Instant instant18 = Instant.ofEpochSecond(1700000000);
            List list17 = new ArrayList<>();
            Block block17 = new Block(0L, sha256HashMock34, sha256HashMock35, instant18, 0L, 0L, list17);
            StoredBlock storedBlock17 = new StoredBlock(block17, new BigInteger("0"), 0);
            doReturn(storedBlock17).when(blockStoreMock).get(sha256HashMock32);
            Instant instant19 = Instant.ofEpochSecond(1700000000);
            List list18 = new ArrayList<>();
            Block block18 = new Block(0L, sha256HashMock36, sha256HashMock37, instant19, 0L, 0L, list18);
            StoredBlock storedBlock18 = new StoredBlock(block18, new BigInteger("0"), 0);
            doReturn(storedBlock18).when(blockStoreMock).get(sha256HashMock34);
            Instant instant20 = Instant.ofEpochSecond(1700000000);
            List list19 = new ArrayList<>();
            Block block19 = new Block(0L, sha256HashMock38, sha256HashMock39, instant20, 0L, 0L, list19);
            StoredBlock storedBlock19 = new StoredBlock(block19, new BigInteger("0"), 0);
            doReturn(storedBlock19).when(blockStoreMock).get(sha256HashMock36);
            Instant instant21 = Instant.ofEpochSecond(1700000000);
            List list20 = new ArrayList<>();
            Block block20 = new Block(0L, sha256HashMock40, sha256HashMock41, instant21, 0L, 0L, list20);
            StoredBlock storedBlock20 = new StoredBlock(block20, new BigInteger("0"), 0);
            doReturn(storedBlock20).when(blockStoreMock).get(sha256HashMock38);
            Instant instant22 = Instant.ofEpochSecond(1700000000);
            List list21 = new ArrayList<>();
            Block block21 = new Block(0L, sha256HashMock42, sha256HashMock43, instant22, 0L, 0L, list21);
            StoredBlock storedBlock21 = new StoredBlock(block21, new BigInteger("0"), 0);
            doReturn(storedBlock21).when(blockStoreMock).get(sha256HashMock40);
            Instant instant23 = Instant.ofEpochSecond(1700000000);
            List list22 = new ArrayList<>();
            Block block22 = new Block(0L, sha256HashMock44, sha256HashMock45, instant23, 0L, 0L, list22);
            StoredBlock storedBlock22 = new StoredBlock(block22, new BigInteger("0"), 0);
            doReturn(storedBlock22).when(blockStoreMock).get(sha256HashMock42);
            Instant instant24 = Instant.ofEpochSecond(1700000000);
            List list23 = new ArrayList<>();
            Block block23 = new Block(0L, sha256HashMock46, sha256HashMock47, instant24, 0L, 0L, list23);
            StoredBlock storedBlock23 = new StoredBlock(block23, new BigInteger("0"), 0);
            doReturn(storedBlock23).when(blockStoreMock).get(sha256HashMock44);
            Instant instant25 = Instant.ofEpochSecond(1700000000);
            List list24 = new ArrayList<>();
            Block block24 = new Block(0L, sha256HashMock48, sha256HashMock49, instant25, 0L, 0L, list24);
            StoredBlock storedBlock24 = new StoredBlock(block24, new BigInteger("0"), 0);
            doReturn(storedBlock24).when(blockStoreMock).get(sha256HashMock46);
            Instant instant26 = Instant.ofEpochSecond(1700000000);
            List list25 = new ArrayList<>();
            Block block25 = new Block(0L, sha256HashMock50, sha256HashMock51, instant26, 0L, 0L, list25);
            StoredBlock storedBlock25 = new StoredBlock(block25, new BigInteger("0"), 0);
            doReturn(storedBlock25).when(blockStoreMock).get(sha256HashMock48);
            Instant instant27 = Instant.ofEpochSecond(1700000000);
            List list26 = new ArrayList<>();
            Block block26 = new Block(0L, sha256HashMock52, sha256HashMock53, instant27, 0L, 0L, list26);
            StoredBlock storedBlock26 = new StoredBlock(block26, new BigInteger("0"), 0);
            doReturn(storedBlock26).when(blockStoreMock).get(sha256HashMock50);
            Instant instant28 = Instant.ofEpochSecond(1700000000);
            List list27 = new ArrayList<>();
            Block block27 = new Block(0L, sha256HashMock54, sha256HashMock55, instant28, 0L, 0L, list27);
            StoredBlock storedBlock27 = new StoredBlock(block27, new BigInteger("0"), 0);
            doReturn(storedBlock27).when(blockStoreMock).get(sha256HashMock52);
            Instant instant29 = Instant.ofEpochSecond(1700000000);
            List list28 = new ArrayList<>();
            Block block28 = new Block(0L, sha256HashMock56, sha256HashMock57, instant29, 0L, 0L, list28);
            StoredBlock storedBlock28 = new StoredBlock(block28, new BigInteger("0"), 0);
            doReturn(storedBlock28).when(blockStoreMock).get(sha256HashMock54);
            Instant instant30 = Instant.ofEpochSecond(1700000000);
            List list29 = new ArrayList<>();
            Block block29 = new Block(0L, sha256HashMock58, sha256HashMock59, instant30, 0L, 0L, list29);
            StoredBlock storedBlock29 = new StoredBlock(block29, new BigInteger("0"), 0);
            doReturn(storedBlock29).when(blockStoreMock).get(sha256HashMock56);
            Instant instant31 = Instant.ofEpochSecond(1700000000);
            List list30 = new ArrayList<>();
            Block block30 = new Block(0L, sha256HashMock60, sha256HashMock61, instant31, 0L, 0L, list30);
            StoredBlock storedBlock30 = new StoredBlock(block30, new BigInteger("0"), 0);
            doReturn(storedBlock30).when(blockStoreMock).get(sha256HashMock58);
            Instant instant32 = Instant.ofEpochSecond(1700000000);
            List list31 = new ArrayList<>();
            Block block31 = new Block(0L, sha256HashMock62, sha256HashMock63, instant32, 0L, 0L, list31);
            StoredBlock storedBlock31 = new StoredBlock(block31, new BigInteger("0"), 0);
            doReturn(storedBlock31).when(blockStoreMock).get(sha256HashMock60);
            Instant instant33 = Instant.ofEpochSecond(1700000000);
            List list32 = new ArrayList<>();
            Block block32 = new Block(0L, sha256HashMock64, sha256HashMock65, instant33, 0L, 0L, list32);
            StoredBlock storedBlock32 = new StoredBlock(block32, new BigInteger("0"), 0);
            doReturn(storedBlock32).when(blockStoreMock).get(sha256HashMock62);
            Instant instant34 = Instant.ofEpochSecond(1700000000);
            List list33 = new ArrayList<>();
            Block block33 = new Block(0L, sha256HashMock66, sha256HashMock67, instant34, 0L, 0L, list33);
            StoredBlock storedBlock33 = new StoredBlock(block33, new BigInteger("0"), 0);
            doReturn(storedBlock33).when(blockStoreMock).get(sha256HashMock64);
            Instant instant35 = Instant.ofEpochSecond(1700000000);
            List list34 = new ArrayList<>();
            Block block34 = new Block(0L, sha256HashMock68, sha256HashMock69, instant35, 0L, 0L, list34);
            StoredBlock storedBlock34 = new StoredBlock(block34, new BigInteger("0"), 0);
            doReturn(storedBlock34).when(blockStoreMock).get(sha256HashMock66);
            Instant instant36 = Instant.ofEpochSecond(1700000000);
            List list35 = new ArrayList<>();
            Block block35 = new Block(0L, sha256HashMock70, sha256HashMock71, instant36, 0L, 0L, list35);
            StoredBlock storedBlock35 = new StoredBlock(block35, new BigInteger("0"), 0);
            doReturn(storedBlock35).when(blockStoreMock).get(sha256HashMock68);
            Instant instant37 = Instant.ofEpochSecond(1700000000);
            List list36 = new ArrayList<>();
            Block block36 = new Block(0L, sha256HashMock72, sha256HashMock73, instant37, 0L, 0L, list36);
            StoredBlock storedBlock36 = new StoredBlock(block36, new BigInteger("0"), 0);
            doReturn(storedBlock36).when(blockStoreMock).get(sha256HashMock70);
            Instant instant38 = Instant.ofEpochSecond(1700000000);
            List list37 = new ArrayList<>();
            Block block37 = new Block(0L, sha256HashMock74, sha256HashMock75, instant38, 0L, 0L, list37);
            StoredBlock storedBlock37 = new StoredBlock(block37, new BigInteger("0"), 0);
            doReturn(storedBlock37).when(blockStoreMock).get(sha256HashMock72);
            Instant instant39 = Instant.ofEpochSecond(1700000000);
            List list38 = new ArrayList<>();
            Block block38 = new Block(0L, sha256HashMock76, sha256HashMock77, instant39, 0L, 0L, list38);
            StoredBlock storedBlock38 = new StoredBlock(block38, new BigInteger("0"), 0);
            doReturn(storedBlock38).when(blockStoreMock).get(sha256HashMock74);
            Instant instant40 = Instant.ofEpochSecond(1700000000);
            List list39 = new ArrayList<>();
            Block block39 = new Block(0L, sha256HashMock78, sha256HashMock79, instant40, 0L, 0L, list39);
            StoredBlock storedBlock39 = new StoredBlock(block39, new BigInteger("0"), 0);
            doReturn(storedBlock39).when(blockStoreMock).get(sha256HashMock76);
            Instant instant41 = Instant.ofEpochSecond(1700000000);
            List list40 = new ArrayList<>();
            Block block40 = new Block(0L, sha256HashMock80, sha256HashMock81, instant41, 0L, 0L, list40);
            StoredBlock storedBlock40 = new StoredBlock(block40, new BigInteger("0"), 0);
            doReturn(storedBlock40).when(blockStoreMock).get(sha256HashMock78);
            Instant instant42 = Instant.ofEpochSecond(1700000000);
            List list41 = new ArrayList<>();
            Block block41 = new Block(0L, sha256HashMock82, sha256HashMock83, instant42, 0L, 0L, list41);
            StoredBlock storedBlock41 = new StoredBlock(block41, new BigInteger("0"), 0);
            doReturn(storedBlock41).when(blockStoreMock).get(sha256HashMock80);
            Instant instant43 = Instant.ofEpochSecond(1700000000);
            List list42 = new ArrayList<>();
            Block block42 = new Block(0L, sha256HashMock84, sha256HashMock85, instant43, 0L, 0L, list42);
            StoredBlock storedBlock42 = new StoredBlock(block42, new BigInteger("0"), 0);
            doReturn(storedBlock42).when(blockStoreMock).get(sha256HashMock82);
            Instant instant44 = Instant.ofEpochSecond(1700000000);
            List list43 = new ArrayList<>();
            Block block43 = new Block(0L, sha256HashMock86, sha256HashMock87, instant44, 0L, 0L, list43);
            StoredBlock storedBlock43 = new StoredBlock(block43, new BigInteger("0"), 0);
            doReturn(storedBlock43).when(blockStoreMock).get(sha256HashMock84);
            Instant instant45 = Instant.ofEpochSecond(1700000000);
            List list44 = new ArrayList<>();
            Block block44 = new Block(0L, sha256HashMock88, sha256HashMock89, instant45, 0L, 0L, list44);
            StoredBlock storedBlock44 = new StoredBlock(block44, new BigInteger("0"), 0);
            doReturn(storedBlock44).when(blockStoreMock).get(sha256HashMock86);
            Instant instant46 = Instant.ofEpochSecond(1700000000);
            List list45 = new ArrayList<>();
            Block block45 = new Block(0L, sha256HashMock90, sha256HashMock91, instant46, 0L, 0L, list45);
            StoredBlock storedBlock45 = new StoredBlock(block45, new BigInteger("0"), 0);
            doReturn(storedBlock45).when(blockStoreMock).get(sha256HashMock88);
            Instant instant47 = Instant.ofEpochSecond(1700000000);
            List list46 = new ArrayList<>();
            Block block46 = new Block(0L, sha256HashMock92, sha256HashMock93, instant47, 0L, 0L, list46);
            StoredBlock storedBlock46 = new StoredBlock(block46, new BigInteger("0"), 0);
            doReturn(storedBlock46).when(blockStoreMock).get(sha256HashMock90);
            Instant instant48 = Instant.ofEpochSecond(1700000000);
            List list47 = new ArrayList<>();
            Block block47 = new Block(0L, sha256HashMock94, sha256HashMock95, instant48, 0L, 0L, list47);
            StoredBlock storedBlock47 = new StoredBlock(block47, new BigInteger("0"), 0);
            doReturn(storedBlock47).when(blockStoreMock).get(sha256HashMock92);
            Instant instant49 = Instant.ofEpochSecond(1700000000);
            List list48 = new ArrayList<>();
            Block block48 = new Block(0L, sha256HashMock96, sha256HashMock97, instant49, 0L, 0L, list48);
            StoredBlock storedBlock48 = new StoredBlock(block48, new BigInteger("0"), 0);
            doReturn(storedBlock48).when(blockStoreMock).get(sha256HashMock94);
            Instant instant50 = Instant.ofEpochSecond(1700000000);
            List list49 = new ArrayList<>();
            Block block49 = new Block(0L, sha256HashMock98, sha256HashMock99, instant50, 0L, 0L, list49);
            StoredBlock storedBlock49 = new StoredBlock(block49, new BigInteger("0"), 0);
            doReturn(storedBlock49).when(blockStoreMock).get(sha256HashMock96);
            Instant instant51 = Instant.ofEpochSecond(1700000000);
            List list50 = new ArrayList<>();
            Block block50 = new Block(0L, sha256HashMock100, sha256HashMock101, instant51, 0L, 0L, list50);
            StoredBlock storedBlock50 = new StoredBlock(block50, new BigInteger("0"), 0);
            doReturn(storedBlock50).when(blockStoreMock).get(sha256HashMock98);
            Instant instant52 = Instant.ofEpochSecond(1700000000);
            List list51 = new ArrayList<>();
            Block block51 = new Block(0L, sha256HashMock102, sha256HashMock103, instant52, 0L, 0L, list51);
            StoredBlock storedBlock51 = new StoredBlock(block51, new BigInteger("0"), 0);
            doReturn(storedBlock51).when(blockStoreMock).get(sha256HashMock100);
            Instant instant53 = Instant.ofEpochSecond(1700000000);
            List list52 = new ArrayList<>();
            Block block52 = new Block(0L, sha256HashMock104, sha256HashMock105, instant53, 0L, 0L, list52);
            StoredBlock storedBlock52 = new StoredBlock(block52, new BigInteger("0"), 0);
            doReturn(storedBlock52).when(blockStoreMock).get(sha256HashMock102);
            Instant instant54 = Instant.ofEpochSecond(1700000000);
            List list53 = new ArrayList<>();
            Block block53 = new Block(0L, sha256HashMock106, sha256HashMock107, instant54, 0L, 0L, list53);
            StoredBlock storedBlock53 = new StoredBlock(block53, new BigInteger("0"), 0);
            doReturn(storedBlock53).when(blockStoreMock).get(sha256HashMock104);
            Instant instant55 = Instant.ofEpochSecond(1700000000);
            List list54 = new ArrayList<>();
            Block block54 = new Block(0L, sha256HashMock108, sha256HashMock109, instant55, 0L, 0L, list54);
            StoredBlock storedBlock54 = new StoredBlock(block54, new BigInteger("0"), 0);
            doReturn(storedBlock54).when(blockStoreMock).get(sha256HashMock106);
            Instant instant56 = Instant.ofEpochSecond(1700000000);
            List list55 = new ArrayList<>();
            Block block55 = new Block(0L, sha256HashMock110, sha256HashMock111, instant56, 0L, 0L, list55);
            StoredBlock storedBlock55 = new StoredBlock(block55, new BigInteger("0"), 0);
            doReturn(storedBlock55).when(blockStoreMock).get(sha256HashMock108);
            Instant instant57 = Instant.ofEpochSecond(1700000000);
            List list56 = new ArrayList<>();
            Block block56 = new Block(0L, sha256HashMock112, sha256HashMock113, instant57, 0L, 0L, list56);
            StoredBlock storedBlock56 = new StoredBlock(block56, new BigInteger("0"), 0);
            doReturn(storedBlock56).when(blockStoreMock).get(sha256HashMock110);
            Instant instant58 = Instant.ofEpochSecond(1700000000);
            List list57 = new ArrayList<>();
            Block block57 = new Block(0L, sha256HashMock114, sha256HashMock115, instant58, 0L, 0L, list57);
            StoredBlock storedBlock57 = new StoredBlock(block57, new BigInteger("0"), 0);
            doReturn(storedBlock57).when(blockStoreMock).get(sha256HashMock112);
            Instant instant59 = Instant.ofEpochSecond(1700000000);
            List list58 = new ArrayList<>();
            Block block58 = new Block(0L, sha256HashMock116, sha256HashMock117, instant59, 0L, 0L, list58);
            StoredBlock storedBlock58 = new StoredBlock(block58, new BigInteger("0"), 0);
            doReturn(storedBlock58).when(blockStoreMock).get(sha256HashMock114);
            Instant instant60 = Instant.ofEpochSecond(1700000000);
            List list59 = new ArrayList<>();
            Block block59 = new Block(0L, sha256HashMock118, sha256HashMock119, instant60, 0L, 0L, list59);
            StoredBlock storedBlock59 = new StoredBlock(block59, new BigInteger("0"), 0);
            doReturn(storedBlock59).when(blockStoreMock).get(sha256HashMock116);
            Instant instant61 = Instant.ofEpochSecond(1700000000);
            List list60 = new ArrayList<>();
            Block block60 = new Block(0L, sha256HashMock120, sha256HashMock121, instant61, 0L, 0L, list60);
            StoredBlock storedBlock60 = new StoredBlock(block60, new BigInteger("0"), 0);
            doReturn(storedBlock60).when(blockStoreMock).get(sha256HashMock118);
            Instant instant62 = Instant.ofEpochSecond(1700000000);
            List list61 = new ArrayList<>();
            Block block61 = new Block(0L, sha256HashMock122, sha256HashMock123, instant62, 0L, 0L, list61);
            StoredBlock storedBlock61 = new StoredBlock(block61, new BigInteger("0"), 0);
            doReturn(storedBlock61).when(blockStoreMock).get(sha256HashMock120);
            Instant instant63 = Instant.ofEpochSecond(1700000000);
            List list62 = new ArrayList<>();
            Block block62 = new Block(0L, sha256HashMock124, sha256HashMock125, instant63, 0L, 0L, list62);
            StoredBlock storedBlock62 = new StoredBlock(block62, new BigInteger("0"), 0);
            doReturn(storedBlock62).when(blockStoreMock).get(sha256HashMock122);
            Instant instant64 = Instant.ofEpochSecond(1700000000);
            List list63 = new ArrayList<>();
            Block block63 = new Block(0L, sha256HashMock126, sha256HashMock127, instant64, 0L, 0L, list63);
            StoredBlock storedBlock63 = new StoredBlock(block63, new BigInteger("0"), 0);
            doReturn(storedBlock63).when(blockStoreMock).get(sha256HashMock124);
            Instant instant65 = Instant.ofEpochSecond(1700000000);
            List list64 = new ArrayList<>();
            Block block64 = new Block(0L, sha256HashMock128, sha256HashMock129, instant65, 0L, 0L, list64);
            StoredBlock storedBlock64 = new StoredBlock(block64, new BigInteger("0"), 0);
            doReturn(storedBlock64).when(blockStoreMock).get(sha256HashMock126);
            Instant instant66 = Instant.ofEpochSecond(1700000000);
            List list65 = new ArrayList<>();
            Block block65 = new Block(0L, sha256HashMock130, sha256HashMock131, instant66, 0L, 0L, list65);
            StoredBlock storedBlock65 = new StoredBlock(block65, new BigInteger("0"), 0);
            doReturn(storedBlock65).when(blockStoreMock).get(sha256HashMock128);
            Instant instant67 = Instant.ofEpochSecond(1700000000);
            List list66 = new ArrayList<>();
            Block block66 = new Block(0L, sha256HashMock132, sha256HashMock133, instant67, 0L, 0L, list66);
            StoredBlock storedBlock66 = new StoredBlock(block66, new BigInteger("0"), 0);
            doReturn(storedBlock66).when(blockStoreMock).get(sha256HashMock130);
            Instant instant68 = Instant.ofEpochSecond(1700000000);
            List list67 = new ArrayList<>();
            Block block67 = new Block(0L, sha256HashMock134, sha256HashMock135, instant68, 0L, 0L, list67);
            StoredBlock storedBlock67 = new StoredBlock(block67, new BigInteger("0"), 0);
            doReturn(storedBlock67).when(blockStoreMock).get(sha256HashMock132);
            Instant instant69 = Instant.ofEpochSecond(1700000000);
            List list68 = new ArrayList<>();
            Block block68 = new Block(0L, sha256HashMock136, sha256HashMock137, instant69, 0L, 0L, list68);
            StoredBlock storedBlock68 = new StoredBlock(block68, new BigInteger("0"), 0);
            doReturn(storedBlock68).when(blockStoreMock).get(sha256HashMock134);
            Instant instant70 = Instant.ofEpochSecond(1700000000);
            List list69 = new ArrayList<>();
            Block block69 = new Block(0L, sha256HashMock138, sha256HashMock139, instant70, 0L, 0L, list69);
            StoredBlock storedBlock69 = new StoredBlock(block69, new BigInteger("0"), 0);
            doReturn(storedBlock69).when(blockStoreMock).get(sha256HashMock136);
            Instant instant71 = Instant.ofEpochSecond(1700000000);
            List list70 = new ArrayList<>();
            Block block70 = new Block(0L, sha256HashMock140, sha256HashMock141, instant71, 0L, 0L, list70);
            StoredBlock storedBlock70 = new StoredBlock(block70, new BigInteger("0"), 0);
            doReturn(storedBlock70).when(blockStoreMock).get(sha256HashMock138);
            Instant instant72 = Instant.ofEpochSecond(1700000000);
            List list71 = new ArrayList<>();
            Block block71 = new Block(0L, sha256HashMock142, sha256HashMock143, instant72, 0L, 0L, list71);
            StoredBlock storedBlock71 = new StoredBlock(block71, new BigInteger("0"), 0);
            doReturn(storedBlock71).when(blockStoreMock).get(sha256HashMock140);
            Instant instant73 = Instant.ofEpochSecond(1700000000);
            List list72 = new ArrayList<>();
            Block block72 = new Block(0L, sha256HashMock144, sha256HashMock145, instant73, 0L, 0L, list72);
            StoredBlock storedBlock72 = new StoredBlock(block72, new BigInteger("0"), 0);
            doReturn(storedBlock72).when(blockStoreMock).get(sha256HashMock142);
            Instant instant74 = Instant.ofEpochSecond(1700000000);
            List list73 = new ArrayList<>();
            Block block73 = new Block(0L, sha256HashMock146, sha256HashMock147, instant74, 0L, 0L, list73);
            StoredBlock storedBlock73 = new StoredBlock(block73, new BigInteger("0"), 0);
            doReturn(storedBlock73).when(blockStoreMock).get(sha256HashMock144);
            Instant instant75 = Instant.ofEpochSecond(1700000000);
            List list74 = new ArrayList<>();
            Block block74 = new Block(0L, sha256HashMock148, sha256HashMock149, instant75, 0L, 0L, list74);
            StoredBlock storedBlock74 = new StoredBlock(block74, new BigInteger("0"), 0);
            doReturn(storedBlock74).when(blockStoreMock).get(sha256HashMock146);
            Instant instant76 = Instant.ofEpochSecond(1700000000);
            List list75 = new ArrayList<>();
            Block block75 = new Block(0L, sha256HashMock150, sha256HashMock151, instant76, 0L, 0L, list75);
            StoredBlock storedBlock75 = new StoredBlock(block75, new BigInteger("0"), 0);
            doReturn(storedBlock75).when(blockStoreMock).get(sha256HashMock148);
            Instant instant77 = Instant.ofEpochSecond(1700000000);
            List list76 = new ArrayList<>();
            Block block76 = new Block(0L, sha256HashMock152, sha256HashMock153, instant77, 0L, 0L, list76);
            StoredBlock storedBlock76 = new StoredBlock(block76, new BigInteger("0"), 0);
            doReturn(storedBlock76).when(blockStoreMock).get(sha256HashMock150);
            Instant instant78 = Instant.ofEpochSecond(1700000000);
            List list77 = new ArrayList<>();
            Block block77 = new Block(0L, sha256HashMock154, sha256HashMock155, instant78, 0L, 0L, list77);
            StoredBlock storedBlock77 = new StoredBlock(block77, new BigInteger("0"), 0);
            doReturn(storedBlock77).when(blockStoreMock).get(sha256HashMock152);
            Instant instant79 = Instant.ofEpochSecond(1700000000);
            List list78 = new ArrayList<>();
            Block block78 = new Block(0L, sha256HashMock156, sha256HashMock157, instant79, 0L, 0L, list78);
            StoredBlock storedBlock78 = new StoredBlock(block78, new BigInteger("0"), 0);
            doReturn(storedBlock78).when(blockStoreMock).get(sha256HashMock154);
            Instant instant80 = Instant.ofEpochSecond(1700000000);
            List list79 = new ArrayList<>();
            Block block79 = new Block(0L, sha256HashMock158, sha256HashMock159, instant80, 0L, 0L, list79);
            StoredBlock storedBlock79 = new StoredBlock(block79, new BigInteger("0"), 0);
            doReturn(storedBlock79).when(blockStoreMock).get(sha256HashMock156);
            Instant instant81 = Instant.ofEpochSecond(1700000000);
            List list80 = new ArrayList<>();
            Block block80 = new Block(0L, sha256HashMock160, sha256HashMock161, instant81, 0L, 0L, list80);
            StoredBlock storedBlock80 = new StoredBlock(block80, new BigInteger("0"), 0);
            doReturn(storedBlock80).when(blockStoreMock).get(sha256HashMock158);
            Instant instant82 = Instant.ofEpochSecond(1700000000);
            List list81 = new ArrayList<>();
            Block block81 = new Block(0L, sha256HashMock162, sha256HashMock163, instant82, 0L, 0L, list81);
            StoredBlock storedBlock81 = new StoredBlock(block81, new BigInteger("0"), 0);
            doReturn(storedBlock81).when(blockStoreMock).get(sha256HashMock160);
            Instant instant83 = Instant.ofEpochSecond(1700000000);
            List list82 = new ArrayList<>();
            Block block82 = new Block(0L, sha256HashMock164, sha256HashMock165, instant83, 0L, 0L, list82);
            StoredBlock storedBlock82 = new StoredBlock(block82, new BigInteger("0"), 0);
            doReturn(storedBlock82).when(blockStoreMock).get(sha256HashMock162);
            Instant instant84 = Instant.ofEpochSecond(1700000000);
            List list83 = new ArrayList<>();
            Block block83 = new Block(0L, sha256HashMock166, sha256HashMock167, instant84, 0L, 0L, list83);
            StoredBlock storedBlock83 = new StoredBlock(block83, new BigInteger("0"), 0);
            doReturn(storedBlock83).when(blockStoreMock).get(sha256HashMock164);
            Instant instant85 = Instant.ofEpochSecond(1700000000);
            List list84 = new ArrayList<>();
            Block block84 = new Block(0L, sha256HashMock168, sha256HashMock169, instant85, 0L, 0L, list84);
            StoredBlock storedBlock84 = new StoredBlock(block84, new BigInteger("0"), 0);
            doReturn(storedBlock84).when(blockStoreMock).get(sha256HashMock166);
            Instant instant86 = Instant.ofEpochSecond(1700000000);
            List list85 = new ArrayList<>();
            Block block85 = new Block(0L, sha256HashMock170, sha256HashMock171, instant86, 0L, 0L, list85);
            StoredBlock storedBlock85 = new StoredBlock(block85, new BigInteger("0"), 0);
            doReturn(storedBlock85).when(blockStoreMock).get(sha256HashMock168);
            Instant instant87 = Instant.ofEpochSecond(1700000000);
            List list86 = new ArrayList<>();
            Block block86 = new Block(0L, sha256HashMock172, sha256HashMock173, instant87, 0L, 0L, list86);
            StoredBlock storedBlock86 = new StoredBlock(block86, new BigInteger("0"), 0);
            doReturn(storedBlock86).when(blockStoreMock).get(sha256HashMock170);
            Instant instant88 = Instant.ofEpochSecond(1700000000);
            List list87 = new ArrayList<>();
            Block block87 = new Block(0L, sha256HashMock174, sha256HashMock175, instant88, 0L, 0L, list87);
            StoredBlock storedBlock87 = new StoredBlock(block87, new BigInteger("0"), 0);
            doReturn(storedBlock87).when(blockStoreMock).get(sha256HashMock172);
            Instant instant89 = Instant.ofEpochSecond(1700000000);
            List list88 = new ArrayList<>();
            Block block88 = new Block(0L, sha256HashMock176, sha256HashMock177, instant89, 0L, 0L, list88);
            StoredBlock storedBlock88 = new StoredBlock(block88, new BigInteger("0"), 0);
            doReturn(storedBlock88).when(blockStoreMock).get(sha256HashMock174);
            Instant instant90 = Instant.ofEpochSecond(1700000000);
            List list89 = new ArrayList<>();
            Block block89 = new Block(0L, sha256HashMock178, sha256HashMock179, instant90, 0L, 0L, list89);
            StoredBlock storedBlock89 = new StoredBlock(block89, new BigInteger("0"), 0);
            doReturn(storedBlock89).when(blockStoreMock).get(sha256HashMock176);
            Instant instant91 = Instant.ofEpochSecond(1700000000);
            List list90 = new ArrayList<>();
            Block block90 = new Block(0L, sha256HashMock180, sha256HashMock181, instant91, 0L, 0L, list90);
            StoredBlock storedBlock90 = new StoredBlock(block90, new BigInteger("0"), 0);
            doReturn(storedBlock90).when(blockStoreMock).get(sha256HashMock178);
            Instant instant92 = Instant.ofEpochSecond(1700000000);
            List list91 = new ArrayList<>();
            Block block91 = new Block(0L, sha256HashMock182, sha256HashMock183, instant92, 0L, 0L, list91);
            StoredBlock storedBlock91 = new StoredBlock(block91, new BigInteger("0"), 0);
            doReturn(storedBlock91).when(blockStoreMock).get(sha256HashMock180);
            Instant instant93 = Instant.ofEpochSecond(1700000000);
            List list92 = new ArrayList<>();
            Block block92 = new Block(0L, sha256HashMock184, sha256HashMock185, instant93, 0L, 0L, list92);
            StoredBlock storedBlock92 = new StoredBlock(block92, new BigInteger("0"), 0);
            doReturn(storedBlock92).when(blockStoreMock).get(sha256HashMock182);
            Instant instant94 = Instant.ofEpochSecond(1700000000);
            List list93 = new ArrayList<>();
            Block block93 = new Block(0L, sha256HashMock186, sha256HashMock187, instant94, 0L, 0L, list93);
            StoredBlock storedBlock93 = new StoredBlock(block93, new BigInteger("0"), 0);
            doReturn(storedBlock93).when(blockStoreMock).get(sha256HashMock184);
            Instant instant95 = Instant.ofEpochSecond(1700000000);
            List list94 = new ArrayList<>();
            Block block94 = new Block(0L, sha256HashMock188, sha256HashMock189, instant95, 0L, 0L, list94);
            StoredBlock storedBlock94 = new StoredBlock(block94, new BigInteger("0"), 0);
            doReturn(storedBlock94).when(blockStoreMock).get(sha256HashMock186);
            Instant instant96 = Instant.ofEpochSecond(1700000000);
            List list95 = new ArrayList<>();
            Block block95 = new Block(0L, sha256HashMock190, sha256HashMock191, instant96, 0L, 0L, list95);
            StoredBlock storedBlock95 = new StoredBlock(block95, new BigInteger("0"), 0);
            doReturn(storedBlock95).when(blockStoreMock).get(sha256HashMock188);
            Instant instant97 = Instant.ofEpochSecond(1700000000);
            List list96 = new ArrayList<>();
            Block block96 = new Block(0L, sha256HashMock192, sha256HashMock193, instant97, 0L, 0L, list96);
            StoredBlock storedBlock96 = new StoredBlock(block96, new BigInteger("0"), 0);
            doReturn(storedBlock96).when(blockStoreMock).get(sha256HashMock190);
            Instant instant98 = Instant.ofEpochSecond(1700000000);
            List list97 = new ArrayList<>();
            Block block97 = new Block(0L, sha256HashMock194, sha256HashMock195, instant98, 0L, 0L, list97);
            StoredBlock storedBlock97 = new StoredBlock(block97, new BigInteger("0"), 0);
            doReturn(storedBlock97).when(blockStoreMock).get(sha256HashMock192);
            Instant instant99 = Instant.ofEpochSecond(1700000000);
            List list98 = new ArrayList<>();
            Block block98 = new Block(0L, sha256HashMock196, sha256HashMock197, instant99, 0L, 0L, list98);
            StoredBlock storedBlock98 = new StoredBlock(block98, new BigInteger("0"), 0);
            doReturn(storedBlock98).when(blockStoreMock).get(sha256HashMock194);
            Instant instant100 = Instant.ofEpochSecond(1700000000);
            List list99 = new ArrayList<>();
            Block block99 = new Block(0L, sha256HashMock198, sha256HashMock199, instant100, 0L, 0L, list99);
            StoredBlock storedBlock99 = new StoredBlock(block99, new BigInteger("0"), 0);
            doReturn(storedBlock99).when(blockStoreMock).get(sha256HashMock196);
            Instant instant101 = Instant.ofEpochSecond(1700000000);
            List list100 = new ArrayList<>();
            Block block100 = new Block(0L, sha256HashMock200, sha256HashMock201, instant101, 0L, 0L, list100);
            StoredBlock storedBlock100 = new StoredBlock(block100, new BigInteger("0"), 0);
            doReturn(storedBlock100).when(blockStoreMock).get(sha256HashMock198);
            StoredBlock storedBlock101 = new StoredBlock(block101Mock, new BigInteger("0"), 0);
            doReturn(storedBlock101).when(blockStoreMock).get(sha256HashMock200);
            doReturn(sha256HashMock202).when(block101Mock).getPrevBlockHash();
            doReturn(0L).when(block101Mock).getTimeSeconds();
            byteUtils.when(() -> ByteUtils.decodeCompactBits(486604799L)).thenReturn(new BigInteger("26959535291011309493156476344723991336010898738574164086137773096960"));
            byteUtils.when(() -> ByteUtils.decodeCompactBits(0L)).thenReturn(new BigInteger("107838141164045237972625905378895965344043594954296656344551092387844"));
            TestNet3Params target = spy(new TestNet3Params());
            doReturn(false, true).when(target).isDifficultyTransitionPoint(0);
            doReturn(true).when(target).isDifficultyTransitionPoint(-1);
            thrown.expect(VerificationException.class);
            StoredBlock storedBlock102 = new StoredBlock(prevMock, new BigInteger("0"), 0);
            //Act Statement(s)
            target.checkDifficultyTransitions(storedBlock102, nextBlockMock, blockStoreMock);
            //Assert statement(s)
            verify(prevMock, atLeast(1)).getHash();
            verify(prevMock, atLeast(1)).getTimeSeconds();
            verify(prevMock, atLeast(1)).getDifficultyTarget();
            verify(nextBlockMock, atLeast(1)).time();
            verify(nextBlockMock, times(2)).getDifficultyTarget();
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock2);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock4);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock6);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock8);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock10);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock12);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock14);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock16);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock18);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock20);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock22);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock24);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock26);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock28);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock30);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock32);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock34);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock36);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock38);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock40);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock42);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock44);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock46);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock48);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock50);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock52);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock54);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock56);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock58);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock60);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock62);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock64);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock66);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock68);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock70);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock72);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock74);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock76);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock78);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock80);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock82);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock84);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock86);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock88);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock90);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock92);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock94);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock96);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock98);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock100);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock102);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock104);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock106);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock108);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock110);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock112);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock114);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock116);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock118);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock120);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock122);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock124);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock126);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock128);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock130);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock132);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock134);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock136);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock138);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock140);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock142);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock144);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock146);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock148);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock150);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock152);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock154);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock156);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock158);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock160);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock162);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock164);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock166);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock168);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock170);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock172);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock174);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock176);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock178);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock180);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock182);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock184);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock186);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock188);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock190);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock192);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock194);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock196);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock198);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock200);
            verify(block101Mock, atLeast(1)).getPrevBlockHash();
            verify(block101Mock, atLeast(1)).getTimeSeconds();
            byteUtils.verify(() -> ByteUtils.decodeCompactBits(486604799L), atLeast(1));
            byteUtils.verify(() -> ByteUtils.decodeCompactBits(0L), atLeast(1));
            verify(target, times(2)).isDifficultyTransitionPoint(0);
            verify(target, atLeast(1)).isDifficultyTransitionPoint(-1);
        }
    }

    //Sapient generated method id: ${92b12ee4-ac9e-3fec-83e3-335d54a318bf}, hash: 4E420FB788DF0DDB33955BB5F2FE9CB0
    @Ignore()
    @Test()
    public void checkDifficultyTransitionsWhenNewTargetCompareToMaxTargetGreaterThan0AndNewTargetCompactEqualsReceivedTargetCompact() throws VerificationException, BlockStoreException {
        /* Branches:
         * (!isDifficultyTransitionPoint(storedPrev.getHeight())) : true
         * (nextBlock.time().isAfter(testnetDiffDate)) : false
         * (!isDifficultyTransitionPoint(storedPrev.getHeight())) : false  #  inside checkDifficultyTransitions method
         * (i < interval) : true  #  inside checkDifficultyTransitions method
         * (cursor == null) : false  #  inside checkDifficultyTransitions method
         * (cursor != null) : true  #  inside checkDifficultyTransitions method
         * (isDifficultyTransitionPoint(cursor.getHeight() - 1)) : true  #  inside checkDifficultyTransitions method
         * (watch.elapsed().toMillis() > 50) : true  #  inside checkDifficultyTransitions method
         * (timespan < targetTimespan / 4) : false  #  inside checkDifficultyTransitions method
         * (timespan > targetTimespan * 4) : true  #  inside checkDifficultyTransitions method
         * (newTarget.compareTo(maxTarget) > 0) : true  #  inside checkDifficultyTransitions method
         * (newTargetCompact != receivedTargetCompact) : false  #  inside checkDifficultyTransitions method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS)) {
            doReturn(sha256HashMock).when(prevMock).getHash();
            doReturn(2147483647L).when(prevMock).getTimeSeconds();
            doReturn(1L).when(prevMock).getDifficultyTarget();
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(nextBlockMock).time();
            doReturn(0L, 16777216L).when(nextBlockMock).getDifficultyTarget();
            Instant instant2 = Instant.ofEpochSecond(1700000000);
            List list = new ArrayList<>();
            Block block = new Block(0L, sha256HashMock2, sha256HashMock3, instant2, 0L, 0L, list);
            StoredBlock storedBlock = new StoredBlock(block, new BigInteger("0"), 0);
            doReturn(storedBlock).when(blockStoreMock).get(sha256HashMock);
            Instant instant3 = Instant.ofEpochSecond(1700000000);
            List list2 = new ArrayList<>();
            Block block2 = new Block(0L, sha256HashMock4, sha256HashMock5, instant3, 0L, 0L, list2);
            StoredBlock storedBlock2 = new StoredBlock(block2, new BigInteger("0"), 0);
            doReturn(storedBlock2).when(blockStoreMock).get(sha256HashMock2);
            Instant instant4 = Instant.ofEpochSecond(1700000000);
            List list3 = new ArrayList<>();
            Block block3 = new Block(0L, sha256HashMock6, sha256HashMock7, instant4, 0L, 0L, list3);
            StoredBlock storedBlock3 = new StoredBlock(block3, new BigInteger("0"), 0);
            doReturn(storedBlock3).when(blockStoreMock).get(sha256HashMock4);
            Instant instant5 = Instant.ofEpochSecond(1700000000);
            List list4 = new ArrayList<>();
            Block block4 = new Block(0L, sha256HashMock8, sha256HashMock9, instant5, 0L, 0L, list4);
            StoredBlock storedBlock4 = new StoredBlock(block4, new BigInteger("0"), 0);
            doReturn(storedBlock4).when(blockStoreMock).get(sha256HashMock6);
            Instant instant6 = Instant.ofEpochSecond(1700000000);
            List list5 = new ArrayList<>();
            Block block5 = new Block(0L, sha256HashMock10, sha256HashMock11, instant6, 0L, 0L, list5);
            StoredBlock storedBlock5 = new StoredBlock(block5, new BigInteger("0"), 0);
            doReturn(storedBlock5).when(blockStoreMock).get(sha256HashMock8);
            Instant instant7 = Instant.ofEpochSecond(1700000000);
            List list6 = new ArrayList<>();
            Block block6 = new Block(0L, sha256HashMock12, sha256HashMock13, instant7, 0L, 0L, list6);
            StoredBlock storedBlock6 = new StoredBlock(block6, new BigInteger("0"), 0);
            doReturn(storedBlock6).when(blockStoreMock).get(sha256HashMock10);
            Instant instant8 = Instant.ofEpochSecond(1700000000);
            List list7 = new ArrayList<>();
            Block block7 = new Block(0L, sha256HashMock14, sha256HashMock15, instant8, 0L, 0L, list7);
            StoredBlock storedBlock7 = new StoredBlock(block7, new BigInteger("0"), 0);
            doReturn(storedBlock7).when(blockStoreMock).get(sha256HashMock12);
            Instant instant9 = Instant.ofEpochSecond(1700000000);
            List list8 = new ArrayList<>();
            Block block8 = new Block(0L, sha256HashMock16, sha256HashMock17, instant9, 0L, 0L, list8);
            StoredBlock storedBlock8 = new StoredBlock(block8, new BigInteger("0"), 0);
            doReturn(storedBlock8).when(blockStoreMock).get(sha256HashMock14);
            Instant instant10 = Instant.ofEpochSecond(1700000000);
            List list9 = new ArrayList<>();
            Block block9 = new Block(0L, sha256HashMock18, sha256HashMock19, instant10, 0L, 0L, list9);
            StoredBlock storedBlock9 = new StoredBlock(block9, new BigInteger("0"), 0);
            doReturn(storedBlock9).when(blockStoreMock).get(sha256HashMock16);
            Instant instant11 = Instant.ofEpochSecond(1700000000);
            List list10 = new ArrayList<>();
            Block block10 = new Block(0L, sha256HashMock20, sha256HashMock21, instant11, 0L, 0L, list10);
            StoredBlock storedBlock10 = new StoredBlock(block10, new BigInteger("0"), 0);
            doReturn(storedBlock10).when(blockStoreMock).get(sha256HashMock18);
            Instant instant12 = Instant.ofEpochSecond(1700000000);
            List list11 = new ArrayList<>();
            Block block11 = new Block(0L, sha256HashMock22, sha256HashMock23, instant12, 0L, 0L, list11);
            StoredBlock storedBlock11 = new StoredBlock(block11, new BigInteger("0"), 0);
            doReturn(storedBlock11).when(blockStoreMock).get(sha256HashMock20);
            Instant instant13 = Instant.ofEpochSecond(1700000000);
            List list12 = new ArrayList<>();
            Block block12 = new Block(0L, sha256HashMock24, sha256HashMock25, instant13, 0L, 0L, list12);
            StoredBlock storedBlock12 = new StoredBlock(block12, new BigInteger("0"), 0);
            doReturn(storedBlock12).when(blockStoreMock).get(sha256HashMock22);
            Instant instant14 = Instant.ofEpochSecond(1700000000);
            List list13 = new ArrayList<>();
            Block block13 = new Block(0L, sha256HashMock26, sha256HashMock27, instant14, 0L, 0L, list13);
            StoredBlock storedBlock13 = new StoredBlock(block13, new BigInteger("0"), 0);
            doReturn(storedBlock13).when(blockStoreMock).get(sha256HashMock24);
            Instant instant15 = Instant.ofEpochSecond(1700000000);
            List list14 = new ArrayList<>();
            Block block14 = new Block(0L, sha256HashMock28, sha256HashMock29, instant15, 0L, 0L, list14);
            StoredBlock storedBlock14 = new StoredBlock(block14, new BigInteger("0"), 0);
            doReturn(storedBlock14).when(blockStoreMock).get(sha256HashMock26);
            Instant instant16 = Instant.ofEpochSecond(1700000000);
            List list15 = new ArrayList<>();
            Block block15 = new Block(0L, sha256HashMock30, sha256HashMock31, instant16, 0L, 0L, list15);
            StoredBlock storedBlock15 = new StoredBlock(block15, new BigInteger("0"), 0);
            doReturn(storedBlock15).when(blockStoreMock).get(sha256HashMock28);
            Instant instant17 = Instant.ofEpochSecond(1700000000);
            List list16 = new ArrayList<>();
            Block block16 = new Block(0L, sha256HashMock32, sha256HashMock33, instant17, 0L, 0L, list16);
            StoredBlock storedBlock16 = new StoredBlock(block16, new BigInteger("0"), 0);
            doReturn(storedBlock16).when(blockStoreMock).get(sha256HashMock30);
            Instant instant18 = Instant.ofEpochSecond(1700000000);
            List list17 = new ArrayList<>();
            Block block17 = new Block(0L, sha256HashMock34, sha256HashMock35, instant18, 0L, 0L, list17);
            StoredBlock storedBlock17 = new StoredBlock(block17, new BigInteger("0"), 0);
            doReturn(storedBlock17).when(blockStoreMock).get(sha256HashMock32);
            Instant instant19 = Instant.ofEpochSecond(1700000000);
            List list18 = new ArrayList<>();
            Block block18 = new Block(0L, sha256HashMock36, sha256HashMock37, instant19, 0L, 0L, list18);
            StoredBlock storedBlock18 = new StoredBlock(block18, new BigInteger("0"), 0);
            doReturn(storedBlock18).when(blockStoreMock).get(sha256HashMock34);
            Instant instant20 = Instant.ofEpochSecond(1700000000);
            List list19 = new ArrayList<>();
            Block block19 = new Block(0L, sha256HashMock38, sha256HashMock39, instant20, 0L, 0L, list19);
            StoredBlock storedBlock19 = new StoredBlock(block19, new BigInteger("0"), 0);
            doReturn(storedBlock19).when(blockStoreMock).get(sha256HashMock36);
            Instant instant21 = Instant.ofEpochSecond(1700000000);
            List list20 = new ArrayList<>();
            Block block20 = new Block(0L, sha256HashMock40, sha256HashMock41, instant21, 0L, 0L, list20);
            StoredBlock storedBlock20 = new StoredBlock(block20, new BigInteger("0"), 0);
            doReturn(storedBlock20).when(blockStoreMock).get(sha256HashMock38);
            Instant instant22 = Instant.ofEpochSecond(1700000000);
            List list21 = new ArrayList<>();
            Block block21 = new Block(0L, sha256HashMock42, sha256HashMock43, instant22, 0L, 0L, list21);
            StoredBlock storedBlock21 = new StoredBlock(block21, new BigInteger("0"), 0);
            doReturn(storedBlock21).when(blockStoreMock).get(sha256HashMock40);
            Instant instant23 = Instant.ofEpochSecond(1700000000);
            List list22 = new ArrayList<>();
            Block block22 = new Block(0L, sha256HashMock44, sha256HashMock45, instant23, 0L, 0L, list22);
            StoredBlock storedBlock22 = new StoredBlock(block22, new BigInteger("0"), 0);
            doReturn(storedBlock22).when(blockStoreMock).get(sha256HashMock42);
            Instant instant24 = Instant.ofEpochSecond(1700000000);
            List list23 = new ArrayList<>();
            Block block23 = new Block(0L, sha256HashMock46, sha256HashMock47, instant24, 0L, 0L, list23);
            StoredBlock storedBlock23 = new StoredBlock(block23, new BigInteger("0"), 0);
            doReturn(storedBlock23).when(blockStoreMock).get(sha256HashMock44);
            Instant instant25 = Instant.ofEpochSecond(1700000000);
            List list24 = new ArrayList<>();
            Block block24 = new Block(0L, sha256HashMock48, sha256HashMock49, instant25, 0L, 0L, list24);
            StoredBlock storedBlock24 = new StoredBlock(block24, new BigInteger("0"), 0);
            doReturn(storedBlock24).when(blockStoreMock).get(sha256HashMock46);
            Instant instant26 = Instant.ofEpochSecond(1700000000);
            List list25 = new ArrayList<>();
            Block block25 = new Block(0L, sha256HashMock50, sha256HashMock51, instant26, 0L, 0L, list25);
            StoredBlock storedBlock25 = new StoredBlock(block25, new BigInteger("0"), 0);
            doReturn(storedBlock25).when(blockStoreMock).get(sha256HashMock48);
            Instant instant27 = Instant.ofEpochSecond(1700000000);
            List list26 = new ArrayList<>();
            Block block26 = new Block(0L, sha256HashMock52, sha256HashMock53, instant27, 0L, 0L, list26);
            StoredBlock storedBlock26 = new StoredBlock(block26, new BigInteger("0"), 0);
            doReturn(storedBlock26).when(blockStoreMock).get(sha256HashMock50);
            Instant instant28 = Instant.ofEpochSecond(1700000000);
            List list27 = new ArrayList<>();
            Block block27 = new Block(0L, sha256HashMock54, sha256HashMock55, instant28, 0L, 0L, list27);
            StoredBlock storedBlock27 = new StoredBlock(block27, new BigInteger("0"), 0);
            doReturn(storedBlock27).when(blockStoreMock).get(sha256HashMock52);
            Instant instant29 = Instant.ofEpochSecond(1700000000);
            List list28 = new ArrayList<>();
            Block block28 = new Block(0L, sha256HashMock56, sha256HashMock57, instant29, 0L, 0L, list28);
            StoredBlock storedBlock28 = new StoredBlock(block28, new BigInteger("0"), 0);
            doReturn(storedBlock28).when(blockStoreMock).get(sha256HashMock54);
            Instant instant30 = Instant.ofEpochSecond(1700000000);
            List list29 = new ArrayList<>();
            Block block29 = new Block(0L, sha256HashMock58, sha256HashMock59, instant30, 0L, 0L, list29);
            StoredBlock storedBlock29 = new StoredBlock(block29, new BigInteger("0"), 0);
            doReturn(storedBlock29).when(blockStoreMock).get(sha256HashMock56);
            Instant instant31 = Instant.ofEpochSecond(1700000000);
            List list30 = new ArrayList<>();
            Block block30 = new Block(0L, sha256HashMock60, sha256HashMock61, instant31, 0L, 0L, list30);
            StoredBlock storedBlock30 = new StoredBlock(block30, new BigInteger("0"), 0);
            doReturn(storedBlock30).when(blockStoreMock).get(sha256HashMock58);
            Instant instant32 = Instant.ofEpochSecond(1700000000);
            List list31 = new ArrayList<>();
            Block block31 = new Block(0L, sha256HashMock62, sha256HashMock63, instant32, 0L, 0L, list31);
            StoredBlock storedBlock31 = new StoredBlock(block31, new BigInteger("0"), 0);
            doReturn(storedBlock31).when(blockStoreMock).get(sha256HashMock60);
            Instant instant33 = Instant.ofEpochSecond(1700000000);
            List list32 = new ArrayList<>();
            Block block32 = new Block(0L, sha256HashMock64, sha256HashMock65, instant33, 0L, 0L, list32);
            StoredBlock storedBlock32 = new StoredBlock(block32, new BigInteger("0"), 0);
            doReturn(storedBlock32).when(blockStoreMock).get(sha256HashMock62);
            Instant instant34 = Instant.ofEpochSecond(1700000000);
            List list33 = new ArrayList<>();
            Block block33 = new Block(0L, sha256HashMock66, sha256HashMock67, instant34, 0L, 0L, list33);
            StoredBlock storedBlock33 = new StoredBlock(block33, new BigInteger("0"), 0);
            doReturn(storedBlock33).when(blockStoreMock).get(sha256HashMock64);
            Instant instant35 = Instant.ofEpochSecond(1700000000);
            List list34 = new ArrayList<>();
            Block block34 = new Block(0L, sha256HashMock68, sha256HashMock69, instant35, 0L, 0L, list34);
            StoredBlock storedBlock34 = new StoredBlock(block34, new BigInteger("0"), 0);
            doReturn(storedBlock34).when(blockStoreMock).get(sha256HashMock66);
            Instant instant36 = Instant.ofEpochSecond(1700000000);
            List list35 = new ArrayList<>();
            Block block35 = new Block(0L, sha256HashMock70, sha256HashMock71, instant36, 0L, 0L, list35);
            StoredBlock storedBlock35 = new StoredBlock(block35, new BigInteger("0"), 0);
            doReturn(storedBlock35).when(blockStoreMock).get(sha256HashMock68);
            Instant instant37 = Instant.ofEpochSecond(1700000000);
            List list36 = new ArrayList<>();
            Block block36 = new Block(0L, sha256HashMock72, sha256HashMock73, instant37, 0L, 0L, list36);
            StoredBlock storedBlock36 = new StoredBlock(block36, new BigInteger("0"), 0);
            doReturn(storedBlock36).when(blockStoreMock).get(sha256HashMock70);
            Instant instant38 = Instant.ofEpochSecond(1700000000);
            List list37 = new ArrayList<>();
            Block block37 = new Block(0L, sha256HashMock74, sha256HashMock75, instant38, 0L, 0L, list37);
            StoredBlock storedBlock37 = new StoredBlock(block37, new BigInteger("0"), 0);
            doReturn(storedBlock37).when(blockStoreMock).get(sha256HashMock72);
            Instant instant39 = Instant.ofEpochSecond(1700000000);
            List list38 = new ArrayList<>();
            Block block38 = new Block(0L, sha256HashMock76, sha256HashMock77, instant39, 0L, 0L, list38);
            StoredBlock storedBlock38 = new StoredBlock(block38, new BigInteger("0"), 0);
            doReturn(storedBlock38).when(blockStoreMock).get(sha256HashMock74);
            Instant instant40 = Instant.ofEpochSecond(1700000000);
            List list39 = new ArrayList<>();
            Block block39 = new Block(0L, sha256HashMock78, sha256HashMock79, instant40, 0L, 0L, list39);
            StoredBlock storedBlock39 = new StoredBlock(block39, new BigInteger("0"), 0);
            doReturn(storedBlock39).when(blockStoreMock).get(sha256HashMock76);
            Instant instant41 = Instant.ofEpochSecond(1700000000);
            List list40 = new ArrayList<>();
            Block block40 = new Block(0L, sha256HashMock80, sha256HashMock81, instant41, 0L, 0L, list40);
            StoredBlock storedBlock40 = new StoredBlock(block40, new BigInteger("0"), 0);
            doReturn(storedBlock40).when(blockStoreMock).get(sha256HashMock78);
            Instant instant42 = Instant.ofEpochSecond(1700000000);
            List list41 = new ArrayList<>();
            Block block41 = new Block(0L, sha256HashMock82, sha256HashMock83, instant42, 0L, 0L, list41);
            StoredBlock storedBlock41 = new StoredBlock(block41, new BigInteger("0"), 0);
            doReturn(storedBlock41).when(blockStoreMock).get(sha256HashMock80);
            Instant instant43 = Instant.ofEpochSecond(1700000000);
            List list42 = new ArrayList<>();
            Block block42 = new Block(0L, sha256HashMock84, sha256HashMock85, instant43, 0L, 0L, list42);
            StoredBlock storedBlock42 = new StoredBlock(block42, new BigInteger("0"), 0);
            doReturn(storedBlock42).when(blockStoreMock).get(sha256HashMock82);
            Instant instant44 = Instant.ofEpochSecond(1700000000);
            List list43 = new ArrayList<>();
            Block block43 = new Block(0L, sha256HashMock86, sha256HashMock87, instant44, 0L, 0L, list43);
            StoredBlock storedBlock43 = new StoredBlock(block43, new BigInteger("0"), 0);
            doReturn(storedBlock43).when(blockStoreMock).get(sha256HashMock84);
            Instant instant45 = Instant.ofEpochSecond(1700000000);
            List list44 = new ArrayList<>();
            Block block44 = new Block(0L, sha256HashMock88, sha256HashMock89, instant45, 0L, 0L, list44);
            StoredBlock storedBlock44 = new StoredBlock(block44, new BigInteger("0"), 0);
            doReturn(storedBlock44).when(blockStoreMock).get(sha256HashMock86);
            Instant instant46 = Instant.ofEpochSecond(1700000000);
            List list45 = new ArrayList<>();
            Block block45 = new Block(0L, sha256HashMock90, sha256HashMock91, instant46, 0L, 0L, list45);
            StoredBlock storedBlock45 = new StoredBlock(block45, new BigInteger("0"), 0);
            doReturn(storedBlock45).when(blockStoreMock).get(sha256HashMock88);
            Instant instant47 = Instant.ofEpochSecond(1700000000);
            List list46 = new ArrayList<>();
            Block block46 = new Block(0L, sha256HashMock92, sha256HashMock93, instant47, 0L, 0L, list46);
            StoredBlock storedBlock46 = new StoredBlock(block46, new BigInteger("0"), 0);
            doReturn(storedBlock46).when(blockStoreMock).get(sha256HashMock90);
            Instant instant48 = Instant.ofEpochSecond(1700000000);
            List list47 = new ArrayList<>();
            Block block47 = new Block(0L, sha256HashMock94, sha256HashMock95, instant48, 0L, 0L, list47);
            StoredBlock storedBlock47 = new StoredBlock(block47, new BigInteger("0"), 0);
            doReturn(storedBlock47).when(blockStoreMock).get(sha256HashMock92);
            Instant instant49 = Instant.ofEpochSecond(1700000000);
            List list48 = new ArrayList<>();
            Block block48 = new Block(0L, sha256HashMock96, sha256HashMock97, instant49, 0L, 0L, list48);
            StoredBlock storedBlock48 = new StoredBlock(block48, new BigInteger("0"), 0);
            doReturn(storedBlock48).when(blockStoreMock).get(sha256HashMock94);
            Instant instant50 = Instant.ofEpochSecond(1700000000);
            List list49 = new ArrayList<>();
            Block block49 = new Block(0L, sha256HashMock98, sha256HashMock99, instant50, 0L, 0L, list49);
            StoredBlock storedBlock49 = new StoredBlock(block49, new BigInteger("0"), 0);
            doReturn(storedBlock49).when(blockStoreMock).get(sha256HashMock96);
            Instant instant51 = Instant.ofEpochSecond(1700000000);
            List list50 = new ArrayList<>();
            Block block50 = new Block(0L, sha256HashMock100, sha256HashMock101, instant51, 0L, 0L, list50);
            StoredBlock storedBlock50 = new StoredBlock(block50, new BigInteger("0"), 0);
            doReturn(storedBlock50).when(blockStoreMock).get(sha256HashMock98);
            Instant instant52 = Instant.ofEpochSecond(1700000000);
            List list51 = new ArrayList<>();
            Block block51 = new Block(0L, sha256HashMock102, sha256HashMock103, instant52, 0L, 0L, list51);
            StoredBlock storedBlock51 = new StoredBlock(block51, new BigInteger("0"), 0);
            doReturn(storedBlock51).when(blockStoreMock).get(sha256HashMock100);
            Instant instant53 = Instant.ofEpochSecond(1700000000);
            List list52 = new ArrayList<>();
            Block block52 = new Block(0L, sha256HashMock104, sha256HashMock105, instant53, 0L, 0L, list52);
            StoredBlock storedBlock52 = new StoredBlock(block52, new BigInteger("0"), 0);
            doReturn(storedBlock52).when(blockStoreMock).get(sha256HashMock102);
            Instant instant54 = Instant.ofEpochSecond(1700000000);
            List list53 = new ArrayList<>();
            Block block53 = new Block(0L, sha256HashMock106, sha256HashMock107, instant54, 0L, 0L, list53);
            StoredBlock storedBlock53 = new StoredBlock(block53, new BigInteger("0"), 0);
            doReturn(storedBlock53).when(blockStoreMock).get(sha256HashMock104);
            Instant instant55 = Instant.ofEpochSecond(1700000000);
            List list54 = new ArrayList<>();
            Block block54 = new Block(0L, sha256HashMock108, sha256HashMock109, instant55, 0L, 0L, list54);
            StoredBlock storedBlock54 = new StoredBlock(block54, new BigInteger("0"), 0);
            doReturn(storedBlock54).when(blockStoreMock).get(sha256HashMock106);
            Instant instant56 = Instant.ofEpochSecond(1700000000);
            List list55 = new ArrayList<>();
            Block block55 = new Block(0L, sha256HashMock110, sha256HashMock111, instant56, 0L, 0L, list55);
            StoredBlock storedBlock55 = new StoredBlock(block55, new BigInteger("0"), 0);
            doReturn(storedBlock55).when(blockStoreMock).get(sha256HashMock108);
            Instant instant57 = Instant.ofEpochSecond(1700000000);
            List list56 = new ArrayList<>();
            Block block56 = new Block(0L, sha256HashMock112, sha256HashMock113, instant57, 0L, 0L, list56);
            StoredBlock storedBlock56 = new StoredBlock(block56, new BigInteger("0"), 0);
            doReturn(storedBlock56).when(blockStoreMock).get(sha256HashMock110);
            Instant instant58 = Instant.ofEpochSecond(1700000000);
            List list57 = new ArrayList<>();
            Block block57 = new Block(0L, sha256HashMock114, sha256HashMock115, instant58, 0L, 0L, list57);
            StoredBlock storedBlock57 = new StoredBlock(block57, new BigInteger("0"), 0);
            doReturn(storedBlock57).when(blockStoreMock).get(sha256HashMock112);
            Instant instant59 = Instant.ofEpochSecond(1700000000);
            List list58 = new ArrayList<>();
            Block block58 = new Block(0L, sha256HashMock116, sha256HashMock117, instant59, 0L, 0L, list58);
            StoredBlock storedBlock58 = new StoredBlock(block58, new BigInteger("0"), 0);
            doReturn(storedBlock58).when(blockStoreMock).get(sha256HashMock114);
            Instant instant60 = Instant.ofEpochSecond(1700000000);
            List list59 = new ArrayList<>();
            Block block59 = new Block(0L, sha256HashMock118, sha256HashMock119, instant60, 0L, 0L, list59);
            StoredBlock storedBlock59 = new StoredBlock(block59, new BigInteger("0"), 0);
            doReturn(storedBlock59).when(blockStoreMock).get(sha256HashMock116);
            Instant instant61 = Instant.ofEpochSecond(1700000000);
            List list60 = new ArrayList<>();
            Block block60 = new Block(0L, sha256HashMock120, sha256HashMock121, instant61, 0L, 0L, list60);
            StoredBlock storedBlock60 = new StoredBlock(block60, new BigInteger("0"), 0);
            doReturn(storedBlock60).when(blockStoreMock).get(sha256HashMock118);
            Instant instant62 = Instant.ofEpochSecond(1700000000);
            List list61 = new ArrayList<>();
            Block block61 = new Block(0L, sha256HashMock122, sha256HashMock123, instant62, 0L, 0L, list61);
            StoredBlock storedBlock61 = new StoredBlock(block61, new BigInteger("0"), 0);
            doReturn(storedBlock61).when(blockStoreMock).get(sha256HashMock120);
            Instant instant63 = Instant.ofEpochSecond(1700000000);
            List list62 = new ArrayList<>();
            Block block62 = new Block(0L, sha256HashMock124, sha256HashMock125, instant63, 0L, 0L, list62);
            StoredBlock storedBlock62 = new StoredBlock(block62, new BigInteger("0"), 0);
            doReturn(storedBlock62).when(blockStoreMock).get(sha256HashMock122);
            Instant instant64 = Instant.ofEpochSecond(1700000000);
            List list63 = new ArrayList<>();
            Block block63 = new Block(0L, sha256HashMock126, sha256HashMock127, instant64, 0L, 0L, list63);
            StoredBlock storedBlock63 = new StoredBlock(block63, new BigInteger("0"), 0);
            doReturn(storedBlock63).when(blockStoreMock).get(sha256HashMock124);
            Instant instant65 = Instant.ofEpochSecond(1700000000);
            List list64 = new ArrayList<>();
            Block block64 = new Block(0L, sha256HashMock128, sha256HashMock129, instant65, 0L, 0L, list64);
            StoredBlock storedBlock64 = new StoredBlock(block64, new BigInteger("0"), 0);
            doReturn(storedBlock64).when(blockStoreMock).get(sha256HashMock126);
            Instant instant66 = Instant.ofEpochSecond(1700000000);
            List list65 = new ArrayList<>();
            Block block65 = new Block(0L, sha256HashMock130, sha256HashMock131, instant66, 0L, 0L, list65);
            StoredBlock storedBlock65 = new StoredBlock(block65, new BigInteger("0"), 0);
            doReturn(storedBlock65).when(blockStoreMock).get(sha256HashMock128);
            Instant instant67 = Instant.ofEpochSecond(1700000000);
            List list66 = new ArrayList<>();
            Block block66 = new Block(0L, sha256HashMock132, sha256HashMock133, instant67, 0L, 0L, list66);
            StoredBlock storedBlock66 = new StoredBlock(block66, new BigInteger("0"), 0);
            doReturn(storedBlock66).when(blockStoreMock).get(sha256HashMock130);
            Instant instant68 = Instant.ofEpochSecond(1700000000);
            List list67 = new ArrayList<>();
            Block block67 = new Block(0L, sha256HashMock134, sha256HashMock135, instant68, 0L, 0L, list67);
            StoredBlock storedBlock67 = new StoredBlock(block67, new BigInteger("0"), 0);
            doReturn(storedBlock67).when(blockStoreMock).get(sha256HashMock132);
            Instant instant69 = Instant.ofEpochSecond(1700000000);
            List list68 = new ArrayList<>();
            Block block68 = new Block(0L, sha256HashMock136, sha256HashMock137, instant69, 0L, 0L, list68);
            StoredBlock storedBlock68 = new StoredBlock(block68, new BigInteger("0"), 0);
            doReturn(storedBlock68).when(blockStoreMock).get(sha256HashMock134);
            Instant instant70 = Instant.ofEpochSecond(1700000000);
            List list69 = new ArrayList<>();
            Block block69 = new Block(0L, sha256HashMock138, sha256HashMock139, instant70, 0L, 0L, list69);
            StoredBlock storedBlock69 = new StoredBlock(block69, new BigInteger("0"), 0);
            doReturn(storedBlock69).when(blockStoreMock).get(sha256HashMock136);
            Instant instant71 = Instant.ofEpochSecond(1700000000);
            List list70 = new ArrayList<>();
            Block block70 = new Block(0L, sha256HashMock140, sha256HashMock141, instant71, 0L, 0L, list70);
            StoredBlock storedBlock70 = new StoredBlock(block70, new BigInteger("0"), 0);
            doReturn(storedBlock70).when(blockStoreMock).get(sha256HashMock138);
            Instant instant72 = Instant.ofEpochSecond(1700000000);
            List list71 = new ArrayList<>();
            Block block71 = new Block(0L, sha256HashMock142, sha256HashMock143, instant72, 0L, 0L, list71);
            StoredBlock storedBlock71 = new StoredBlock(block71, new BigInteger("0"), 0);
            doReturn(storedBlock71).when(blockStoreMock).get(sha256HashMock140);
            Instant instant73 = Instant.ofEpochSecond(1700000000);
            List list72 = new ArrayList<>();
            Block block72 = new Block(0L, sha256HashMock144, sha256HashMock145, instant73, 0L, 0L, list72);
            StoredBlock storedBlock72 = new StoredBlock(block72, new BigInteger("0"), 0);
            doReturn(storedBlock72).when(blockStoreMock).get(sha256HashMock142);
            Instant instant74 = Instant.ofEpochSecond(1700000000);
            List list73 = new ArrayList<>();
            Block block73 = new Block(0L, sha256HashMock146, sha256HashMock147, instant74, 0L, 0L, list73);
            StoredBlock storedBlock73 = new StoredBlock(block73, new BigInteger("0"), 0);
            doReturn(storedBlock73).when(blockStoreMock).get(sha256HashMock144);
            Instant instant75 = Instant.ofEpochSecond(1700000000);
            List list74 = new ArrayList<>();
            Block block74 = new Block(0L, sha256HashMock148, sha256HashMock149, instant75, 0L, 0L, list74);
            StoredBlock storedBlock74 = new StoredBlock(block74, new BigInteger("0"), 0);
            doReturn(storedBlock74).when(blockStoreMock).get(sha256HashMock146);
            Instant instant76 = Instant.ofEpochSecond(1700000000);
            List list75 = new ArrayList<>();
            Block block75 = new Block(0L, sha256HashMock150, sha256HashMock151, instant76, 0L, 0L, list75);
            StoredBlock storedBlock75 = new StoredBlock(block75, new BigInteger("0"), 0);
            doReturn(storedBlock75).when(blockStoreMock).get(sha256HashMock148);
            Instant instant77 = Instant.ofEpochSecond(1700000000);
            List list76 = new ArrayList<>();
            Block block76 = new Block(0L, sha256HashMock152, sha256HashMock153, instant77, 0L, 0L, list76);
            StoredBlock storedBlock76 = new StoredBlock(block76, new BigInteger("0"), 0);
            doReturn(storedBlock76).when(blockStoreMock).get(sha256HashMock150);
            Instant instant78 = Instant.ofEpochSecond(1700000000);
            List list77 = new ArrayList<>();
            Block block77 = new Block(0L, sha256HashMock154, sha256HashMock155, instant78, 0L, 0L, list77);
            StoredBlock storedBlock77 = new StoredBlock(block77, new BigInteger("0"), 0);
            doReturn(storedBlock77).when(blockStoreMock).get(sha256HashMock152);
            Instant instant79 = Instant.ofEpochSecond(1700000000);
            List list78 = new ArrayList<>();
            Block block78 = new Block(0L, sha256HashMock156, sha256HashMock157, instant79, 0L, 0L, list78);
            StoredBlock storedBlock78 = new StoredBlock(block78, new BigInteger("0"), 0);
            doReturn(storedBlock78).when(blockStoreMock).get(sha256HashMock154);
            Instant instant80 = Instant.ofEpochSecond(1700000000);
            List list79 = new ArrayList<>();
            Block block79 = new Block(0L, sha256HashMock158, sha256HashMock159, instant80, 0L, 0L, list79);
            StoredBlock storedBlock79 = new StoredBlock(block79, new BigInteger("0"), 0);
            doReturn(storedBlock79).when(blockStoreMock).get(sha256HashMock156);
            Instant instant81 = Instant.ofEpochSecond(1700000000);
            List list80 = new ArrayList<>();
            Block block80 = new Block(0L, sha256HashMock160, sha256HashMock161, instant81, 0L, 0L, list80);
            StoredBlock storedBlock80 = new StoredBlock(block80, new BigInteger("0"), 0);
            doReturn(storedBlock80).when(blockStoreMock).get(sha256HashMock158);
            Instant instant82 = Instant.ofEpochSecond(1700000000);
            List list81 = new ArrayList<>();
            Block block81 = new Block(0L, sha256HashMock162, sha256HashMock163, instant82, 0L, 0L, list81);
            StoredBlock storedBlock81 = new StoredBlock(block81, new BigInteger("0"), 0);
            doReturn(storedBlock81).when(blockStoreMock).get(sha256HashMock160);
            Instant instant83 = Instant.ofEpochSecond(1700000000);
            List list82 = new ArrayList<>();
            Block block82 = new Block(0L, sha256HashMock164, sha256HashMock165, instant83, 0L, 0L, list82);
            StoredBlock storedBlock82 = new StoredBlock(block82, new BigInteger("0"), 0);
            doReturn(storedBlock82).when(blockStoreMock).get(sha256HashMock162);
            Instant instant84 = Instant.ofEpochSecond(1700000000);
            List list83 = new ArrayList<>();
            Block block83 = new Block(0L, sha256HashMock166, sha256HashMock167, instant84, 0L, 0L, list83);
            StoredBlock storedBlock83 = new StoredBlock(block83, new BigInteger("0"), 0);
            doReturn(storedBlock83).when(blockStoreMock).get(sha256HashMock164);
            Instant instant85 = Instant.ofEpochSecond(1700000000);
            List list84 = new ArrayList<>();
            Block block84 = new Block(0L, sha256HashMock168, sha256HashMock169, instant85, 0L, 0L, list84);
            StoredBlock storedBlock84 = new StoredBlock(block84, new BigInteger("0"), 0);
            doReturn(storedBlock84).when(blockStoreMock).get(sha256HashMock166);
            Instant instant86 = Instant.ofEpochSecond(1700000000);
            List list85 = new ArrayList<>();
            Block block85 = new Block(0L, sha256HashMock170, sha256HashMock171, instant86, 0L, 0L, list85);
            StoredBlock storedBlock85 = new StoredBlock(block85, new BigInteger("0"), 0);
            doReturn(storedBlock85).when(blockStoreMock).get(sha256HashMock168);
            Instant instant87 = Instant.ofEpochSecond(1700000000);
            List list86 = new ArrayList<>();
            Block block86 = new Block(0L, sha256HashMock172, sha256HashMock173, instant87, 0L, 0L, list86);
            StoredBlock storedBlock86 = new StoredBlock(block86, new BigInteger("0"), 0);
            doReturn(storedBlock86).when(blockStoreMock).get(sha256HashMock170);
            Instant instant88 = Instant.ofEpochSecond(1700000000);
            List list87 = new ArrayList<>();
            Block block87 = new Block(0L, sha256HashMock174, sha256HashMock175, instant88, 0L, 0L, list87);
            StoredBlock storedBlock87 = new StoredBlock(block87, new BigInteger("0"), 0);
            doReturn(storedBlock87).when(blockStoreMock).get(sha256HashMock172);
            Instant instant89 = Instant.ofEpochSecond(1700000000);
            List list88 = new ArrayList<>();
            Block block88 = new Block(0L, sha256HashMock176, sha256HashMock177, instant89, 0L, 0L, list88);
            StoredBlock storedBlock88 = new StoredBlock(block88, new BigInteger("0"), 0);
            doReturn(storedBlock88).when(blockStoreMock).get(sha256HashMock174);
            Instant instant90 = Instant.ofEpochSecond(1700000000);
            List list89 = new ArrayList<>();
            Block block89 = new Block(0L, sha256HashMock178, sha256HashMock179, instant90, 0L, 0L, list89);
            StoredBlock storedBlock89 = new StoredBlock(block89, new BigInteger("0"), 0);
            doReturn(storedBlock89).when(blockStoreMock).get(sha256HashMock176);
            Instant instant91 = Instant.ofEpochSecond(1700000000);
            List list90 = new ArrayList<>();
            Block block90 = new Block(0L, sha256HashMock180, sha256HashMock181, instant91, 0L, 0L, list90);
            StoredBlock storedBlock90 = new StoredBlock(block90, new BigInteger("0"), 0);
            doReturn(storedBlock90).when(blockStoreMock).get(sha256HashMock178);
            Instant instant92 = Instant.ofEpochSecond(1700000000);
            List list91 = new ArrayList<>();
            Block block91 = new Block(0L, sha256HashMock182, sha256HashMock183, instant92, 0L, 0L, list91);
            StoredBlock storedBlock91 = new StoredBlock(block91, new BigInteger("0"), 0);
            doReturn(storedBlock91).when(blockStoreMock).get(sha256HashMock180);
            Instant instant93 = Instant.ofEpochSecond(1700000000);
            List list92 = new ArrayList<>();
            Block block92 = new Block(0L, sha256HashMock184, sha256HashMock185, instant93, 0L, 0L, list92);
            StoredBlock storedBlock92 = new StoredBlock(block92, new BigInteger("0"), 0);
            doReturn(storedBlock92).when(blockStoreMock).get(sha256HashMock182);
            Instant instant94 = Instant.ofEpochSecond(1700000000);
            List list93 = new ArrayList<>();
            Block block93 = new Block(0L, sha256HashMock186, sha256HashMock187, instant94, 0L, 0L, list93);
            StoredBlock storedBlock93 = new StoredBlock(block93, new BigInteger("0"), 0);
            doReturn(storedBlock93).when(blockStoreMock).get(sha256HashMock184);
            Instant instant95 = Instant.ofEpochSecond(1700000000);
            List list94 = new ArrayList<>();
            Block block94 = new Block(0L, sha256HashMock188, sha256HashMock189, instant95, 0L, 0L, list94);
            StoredBlock storedBlock94 = new StoredBlock(block94, new BigInteger("0"), 0);
            doReturn(storedBlock94).when(blockStoreMock).get(sha256HashMock186);
            Instant instant96 = Instant.ofEpochSecond(1700000000);
            List list95 = new ArrayList<>();
            Block block95 = new Block(0L, sha256HashMock190, sha256HashMock191, instant96, 0L, 0L, list95);
            StoredBlock storedBlock95 = new StoredBlock(block95, new BigInteger("0"), 0);
            doReturn(storedBlock95).when(blockStoreMock).get(sha256HashMock188);
            Instant instant97 = Instant.ofEpochSecond(1700000000);
            List list96 = new ArrayList<>();
            Block block96 = new Block(0L, sha256HashMock192, sha256HashMock193, instant97, 0L, 0L, list96);
            StoredBlock storedBlock96 = new StoredBlock(block96, new BigInteger("0"), 0);
            doReturn(storedBlock96).when(blockStoreMock).get(sha256HashMock190);
            Instant instant98 = Instant.ofEpochSecond(1700000000);
            List list97 = new ArrayList<>();
            Block block97 = new Block(0L, sha256HashMock194, sha256HashMock195, instant98, 0L, 0L, list97);
            StoredBlock storedBlock97 = new StoredBlock(block97, new BigInteger("0"), 0);
            doReturn(storedBlock97).when(blockStoreMock).get(sha256HashMock192);
            Instant instant99 = Instant.ofEpochSecond(1700000000);
            List list98 = new ArrayList<>();
            Block block98 = new Block(0L, sha256HashMock196, sha256HashMock197, instant99, 0L, 0L, list98);
            StoredBlock storedBlock98 = new StoredBlock(block98, new BigInteger("0"), 0);
            doReturn(storedBlock98).when(blockStoreMock).get(sha256HashMock194);
            Instant instant100 = Instant.ofEpochSecond(1700000000);
            List list99 = new ArrayList<>();
            Block block99 = new Block(0L, sha256HashMock198, sha256HashMock199, instant100, 0L, 0L, list99);
            StoredBlock storedBlock99 = new StoredBlock(block99, new BigInteger("0"), 0);
            doReturn(storedBlock99).when(blockStoreMock).get(sha256HashMock196);
            Instant instant101 = Instant.ofEpochSecond(1700000000);
            List list100 = new ArrayList<>();
            Block block100 = new Block(0L, sha256HashMock200, sha256HashMock201, instant101, 0L, 0L, list100);
            StoredBlock storedBlock100 = new StoredBlock(block100, new BigInteger("0"), 0);
            doReturn(storedBlock100).when(blockStoreMock).get(sha256HashMock198);
            StoredBlock storedBlock101 = new StoredBlock(block101Mock, new BigInteger("0"), 0);
            doReturn(storedBlock101).when(blockStoreMock).get(sha256HashMock200);
            doReturn(sha256HashMock202).when(block101Mock).getPrevBlockHash();
            doReturn(0L).when(block101Mock).getTimeSeconds();
            byteUtils.when(() -> ByteUtils.decodeCompactBits(486604799L)).thenReturn(new BigInteger("26959535291011309493156476344723991336010898738574164086137773096960"));
            byteUtils.when(() -> ByteUtils.decodeCompactBits(1L)).thenReturn(new BigInteger("6739883822752827373289119086180997834002724684643541021534443274241"));
            TestNet3Params target = spy(new TestNet3Params());
            doReturn(false, true).when(target).isDifficultyTransitionPoint(0);
            doReturn(true).when(target).isDifficultyTransitionPoint(-1);
            StoredBlock storedBlock102 = new StoredBlock(prevMock, new BigInteger("0"), 0);
            //Act Statement(s)
            target.checkDifficultyTransitions(storedBlock102, nextBlockMock, blockStoreMock);
            //Assert statement(s)
            verify(prevMock, atLeast(1)).getHash();
            verify(prevMock, atLeast(1)).getTimeSeconds();
            verify(prevMock, atLeast(1)).getDifficultyTarget();
            verify(nextBlockMock, atLeast(1)).time();
            verify(nextBlockMock, times(2)).getDifficultyTarget();
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock2);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock4);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock6);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock8);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock10);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock12);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock14);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock16);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock18);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock20);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock22);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock24);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock26);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock28);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock30);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock32);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock34);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock36);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock38);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock40);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock42);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock44);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock46);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock48);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock50);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock52);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock54);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock56);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock58);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock60);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock62);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock64);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock66);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock68);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock70);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock72);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock74);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock76);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock78);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock80);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock82);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock84);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock86);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock88);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock90);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock92);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock94);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock96);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock98);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock100);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock102);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock104);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock106);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock108);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock110);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock112);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock114);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock116);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock118);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock120);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock122);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock124);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock126);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock128);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock130);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock132);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock134);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock136);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock138);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock140);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock142);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock144);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock146);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock148);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock150);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock152);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock154);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock156);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock158);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock160);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock162);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock164);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock166);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock168);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock170);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock172);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock174);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock176);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock178);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock180);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock182);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock184);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock186);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock188);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock190);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock192);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock194);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock196);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock198);
            verify(blockStoreMock, atLeast(1)).get(sha256HashMock200);
            verify(block101Mock, atLeast(1)).getPrevBlockHash();
            verify(block101Mock, atLeast(1)).getTimeSeconds();
            byteUtils.verify(() -> ByteUtils.decodeCompactBits(486604799L), atLeast(1));
            byteUtils.verify(() -> ByteUtils.decodeCompactBits(1L), atLeast(1));
            verify(target, times(2)).isDifficultyTransitionPoint(0);
            verify(target, atLeast(1)).isDifficultyTransitionPoint(-1);
        }
    }
}
