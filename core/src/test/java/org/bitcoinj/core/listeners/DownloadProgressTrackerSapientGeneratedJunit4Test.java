package org.bitcoinj.core.listeners;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Ignore;
import org.junit.Test;

import java.util.concurrent.ExecutionException;

import org.junit.rules.ExpectedException;

import java.util.List;

import org.bitcoinj.base.internal.TimeUtils;
import org.bitcoinj.core.Block;
import org.bitcoinj.utils.ListenableCompletableFuture;
import org.bitcoinj.base.Sha256Hash;
import org.bitcoinj.core.FilteredBlock;
import org.mockito.MockedStatic;
import org.bitcoinj.core.PartialMerkleTree;

import java.util.ArrayList;

import org.bitcoinj.core.Peer;

import java.time.Instant;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

public class DownloadProgressTrackerSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Peer peerMock = mock(Peer.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${c7705cdb-21b0-32b0-b24c-ddee486560ac}, hash: 8EB19C35F09C969C5C9CC06BA4735453
    @Ignore(value = "Potential harmful system call (CompletableFuture.complete) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void onChainDownloadStartedWhenBlocksLeftEquals0() {
        /* Branches:
         * (blocksLeft > 0) : false
         * (originalBlocksLeft == -1) : true
         * (blocksLeft == 0) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (CompletableFuture.complete) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(0L).when(peerMock).getBestHeight();
        DownloadProgressTracker target = new DownloadProgressTracker();
        //Act Statement(s)
        target.onChainDownloadStarted(peerMock, 0);
        //Assert statement(s)
        verify(peerMock).getBestHeight();
    }

    //Sapient generated method id: ${476ae901-11b1-3d40-9f94-29840d595e3f}, hash: 8EEE4AD795F080E4D12A0029E36EC51D
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
        doNothing().when(target).startDownload(1);
        //Act Statement(s)
        target.onChainDownloadStarted(peerMock, 1);
        //Assert statement(s)
        verify(target).startDownload(1);
    }

    //Sapient generated method id: ${29d1b1f7-4b93-38d0-b6dd-9025ee63d9b6}, hash: 52DFEC7CBBDFC7A644A6EAEAC7D9B2DB
    @Ignore(value = "Potential harmful system call (CompletableFuture.complete) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void onBlocksDownloadedWhenLastPercentNotEquals100() {
        /* Branches:
         * (caughtUp) : false
         * (blocksLeft == 0) : true
         * (lastPercent != 100) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (CompletableFuture.complete) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        Block block2Mock = mock(Block.class);
        PartialMerkleTree partialMerkleTreeMock = mock(PartialMerkleTree.class);
        try (MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class)) {
            doReturn(0L).when(peerMock).getBestHeight();
            timeUtils.when(() -> TimeUtils.dateTimeFormat((Instant) any())).thenReturn("<value>");
            DownloadProgressTracker target = new DownloadProgressTracker();
            Instant instant = Instant.ofEpochSecond(1700000000);
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

    //Sapient generated method id: ${dc7ddd0b-6f2f-3a20-b0c5-2d4b041ce9c1}, hash: 6E1B163747E69AE0D885D4BC38464F3F
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
        Block blockMock = mock(Block.class);
        FilteredBlock filteredBlockMock = mock(FilteredBlock.class);
        //Act Statement(s)
        target.onBlocksDownloaded(peerMock, blockMock, filteredBlockMock, 1);
    }

    //Sapient generated method id: ${6abfa57a-80ca-32dc-8cb0-ae502a5c49b8}, hash: A0A21AAE99B0E3EA47343AA36756B20F
    @Test()
    public void progressTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class)) {
            timeUtils.when(() -> TimeUtils.dateTimeFormat((Instant) any())).thenReturn("yyyy-MM-dd'T'HH:mm:ss'Z'");
            DownloadProgressTracker target = new DownloadProgressTracker();
            Instant instant = Instant.now();
            //Act Statement(s)
            target.progress(Double.parseDouble("50.0"), 100, instant);
            //Assert statement(s)
            timeUtils.verify(() -> TimeUtils.dateTimeFormat((Instant) any()));
        }
    }

    //Sapient generated method id: ${9c051ceb-b702-323e-a6de-0081d896b232}, hash: 8DDF8CEDFCE80FF17E14EA87C1F33701
    @Test()
    public void startDownloadWhenBlocksGreaterThan1000() {
        /* Branches:
         * (blocks > 1000) : true
         */
        //Arrange Statement(s)
        DownloadProgressTracker target = new DownloadProgressTracker();
        //Act Statement(s)
        target.startDownload(2220);
    }

    //Sapient generated method id: ${b0849069-5208-347e-96f0-2cf739676e65}, hash: 8CDA81FFFA6E0F252CCF645FE24202D0
    @Test()
    public void startDownloadWhenBlocksNotGreaterThan1000() {
        /* Branches:
         * (blocks > 1000) : false
         */
        //Arrange Statement(s)
        DownloadProgressTracker target = new DownloadProgressTracker();
        //Act Statement(s)
        target.startDownload(2);
    }

    //Sapient generated method id: ${84c68135-608b-3db7-853e-6d5129146bc8}, hash: 04726FC0AFCAC57579D9B4AD8D09EDA0
    @Ignore(value = "Potential harmful system call (CompletableFuture.get) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void awaitTest() throws InterruptedException, ExecutionException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (CompletableFuture.get) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DownloadProgressTracker target = new DownloadProgressTracker();
        //Act Statement(s)
        target.await();
    }

    //Sapient generated method id: ${a7012ca3-b62b-3882-bd5c-4541821c6dac}, hash: ECF6A3A84723A95AD158CDBDC266EA86
    @Ignore(value = "Potential harmful system call (CompletableFuture.get) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void awaitWhenCaughtExecutionExceptionThrowsRuntimeException() throws InterruptedException, ExecutionException {
        /* Branches:
         * (catch-exception (ExecutionException)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (CompletableFuture.get) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DownloadProgressTracker target = new DownloadProgressTracker();
        thrown.expect(RuntimeException.class);
        thrown.expectCause(is(instanceOf(ExecutionException.class)));
        //Act Statement(s)
        target.await();
    }

    //Sapient generated method id: ${5fd6d992-7311-370f-bf85-cc2f1c52273b}, hash: 5ED1BE57299E549CC046FB73B6E0C108
    @Test()
    public void getFutureTest() {
        //Arrange Statement(s)
        DownloadProgressTracker target = new DownloadProgressTracker();
        //Act Statement(s)
        ListenableCompletableFuture<Long> result = target.getFuture();
        //Assert statement(s)
        //TODO: Please implement equals method in ListenableCompletableFuture for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }
}
