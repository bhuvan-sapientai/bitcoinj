package org.bitcoinj.core.listeners;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Ignore;
import org.junit.Test;

import java.util.concurrent.ExecutionException;

import org.junit.rules.ExpectedException;
import org.bitcoinj.base.internal.TimeUtils;
import org.bitcoinj.core.Block;
import org.bitcoinj.utils.ListenableCompletableFuture;
import org.bitcoinj.core.FilteredBlock;
import org.mockito.MockedStatic;

import java.util.concurrent.CompletableFuture;

import org.bitcoinj.core.Peer;

import java.time.Instant;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.isA;
import static org.mockito.Mockito.doReturn;

import java.util.List;

import org.bitcoinj.base.Sha256Hash;
import org.bitcoinj.core.PartialMerkleTree;

import java.util.ArrayList;

public class DownloadProgressTrackerSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Block blockMock = mock(Block.class);

    private final FilteredBlock filteredBlockMock = mock(FilteredBlock.class);

    private final Peer peerMock = mock(Peer.class, "{}");

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    private final Block block2Mock = mock(Block.class);

    private final PartialMerkleTree partialMerkleTreeMock = mock(PartialMerkleTree.class);

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);

    //Sapient generated method id: ${c7705cdb-21b0-32b0-b24c-ddee486560ac}
    @Ignore(value = "Potential harmful system call (CompletableFuture.complete) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void onChainDownloadStartedWhenBlocksLeftEquals0() {
        /* Branches:
         * (blocksLeft > 0) : false
         * (originalBlocksLeft == -1) : true
         * (blocksLeft == 0) : true
         */
        //Arrange Statement(s)
        doReturn(0L).when(peerMock).getBestHeight();
        DownloadProgressTracker target = new DownloadProgressTracker();

        //Act Statement(s)
        target.onChainDownloadStarted(peerMock, 0);

        //Assert statement(s)
        verify(peerMock).getBestHeight();
    }

    //Sapient generated method id: ${476ae901-11b1-3d40-9f94-29840d595e3f}
    @Test()
    public void onChainDownloadStartedWhenOriginalBlocksLeftEqualsMinus1AndBlocksLeftNotEquals0() {
        /* Branches:
         * (blocksLeft > 0) : true
         * (originalBlocksLeft == -1) : true
         * (originalBlocksLeft == -1) : true
         * (blocksLeft == 0) : false
         */
        //Arrange Statement(s)
        DownloadProgressTracker target = spy(new DownloadProgressTracker());
        doNothing().when(target).startDownload(10);
        Peer peerMock = mock(Peer.class, "8080");

        //Act Statement(s)
        target.onChainDownloadStarted(peerMock, 10);

        //Assert statement(s)
        verify(target).startDownload(10);
    }

    //Sapient generated method id: ${29d1b1f7-4b93-38d0-b6dd-9025ee63d9b6}
    @Ignore(value = "Potential harmful system call (CompletableFuture.complete) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void onBlocksDownloadedWhenLastPercentNotEquals100() {
        /* Branches:
         * (caughtUp) : false
         * (blocksLeft == 0) : true
         * (lastPercent != 100) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class)) {
            doReturn(0L).when(peerMock).getBestHeight();
            timeUtils.when(() -> TimeUtils.dateTimeFormat((Instant) any())).thenReturn("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            DownloadProgressTracker target = new DownloadProgressTracker();
            Instant instant = Instant.now();
            List list = new ArrayList<>();
            Block block = new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, list);
            FilteredBlock filteredBlock = new FilteredBlock(block2Mock, partialMerkleTreeMock);
            //Act Statement(s)
            target.onBlocksDownloaded(peerMock, block, filteredBlock, 0);
            //Assert statement(s)
            verify(peerMock).getBestHeight();
            timeUtils.verify(() -> TimeUtils.dateTimeFormat((Instant) any()));
        }
    }

    //Sapient generated method id: ${dc7ddd0b-6f2f-3a20-b0c5-2d4b041ce9c1}
    @Test()
    public void onBlocksDownloadedWhenOriginalBlocksLeftLessThanOrEqualsTo0() {
        /* Branches:
         * (caughtUp) : false
         * (blocksLeft == 0) : false
         * (blocksLeft < 0) : false
         * (originalBlocksLeft <= 0) : true
         */
        //Arrange Statement(s)
        DownloadProgressTracker target = new DownloadProgressTracker();
        Instant instant = Instant.now();
        List list = new ArrayList<>();
        Block block = new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, list);
        FilteredBlock filteredBlock = new FilteredBlock(block2Mock, partialMerkleTreeMock);

        //Act Statement(s)
        target.onBlocksDownloaded(peerMock, block, filteredBlock, 5);
    }

    //Sapient generated method id: ${6abfa57a-80ca-32dc-8cb0-ae502a5c49b8}
    @Test()
    public void progressTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class)) {
            timeUtils.when(() -> TimeUtils.dateTimeFormat((Instant) any())).thenReturn("return_of_dateTimeFormat1");
            DownloadProgressTracker target = new DownloadProgressTracker();
            Instant instant = Instant.now();
            //Act Statement(s)
            target.progress(Double.parseDouble("1.0"), 1, instant);
            //Assert statement(s)
            timeUtils.verify(() -> TimeUtils.dateTimeFormat((Instant) any()));
        }
    }

    //Sapient generated method id: ${9c051ceb-b702-323e-a6de-0081d896b232}
    @Test()
    public void startDownloadWhenBlocksGreaterThan1000() {
        /* Branches:
         * (blocks > 1000) : true
         */
        //Arrange Statement(s)
        DownloadProgressTracker target = new DownloadProgressTracker();

        //Act Statement(s)
        target.startDownload(2000);
    }

    //Sapient generated method id: ${b0849069-5208-347e-96f0-2cf739676e65}
    @Test()
    public void startDownloadWhenBlocksNotGreaterThan1000() {
        /* Branches:
         * (blocks > 1000) : false
         */
        //Arrange Statement(s)
        DownloadProgressTracker target = new DownloadProgressTracker();

        //Act Statement(s)
        target.startDownload(500);
    }

    //Sapient generated method id: ${84c68135-608b-3db7-853e-6d5129146bc8}
    @Ignore(value = "Potential harmful system call (CompletableFuture.get) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void awaitTest() throws InterruptedException, ExecutionException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DownloadProgressTracker target = new DownloadProgressTracker();

        //Act Statement(s)
        target.await();
    }
}
