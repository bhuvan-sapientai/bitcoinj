package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;
import java.util.Arrays;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.time.Instant;

import org.bitcoinj.base.Sha256Hash;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class BlockLocatorSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    //Sapient generated method id: ${742d8741-5165-3f5f-b4ca-97d8134588a6}
    @Ignore()
    @Test()
    public void ofBlocksTest() {
        /**
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: org.bitcoinj.core.Block
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        Instant instant = Instant.now();
        List list = new ArrayList<>();
        Block block = new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, list);
        Block block2 = new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, list);
        Block block3 = new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, list);
        Block[] blockArray = new Block[]{block, block2, block3};
        //Act Statement(s)
        BlockLocator result = BlockLocator.ofBlocks(blockArray);
        Block block4 = new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, list);
        Sha256Hash sha256Hash = block4.getHash();
        Block block5 = new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, list);
        Sha256Hash sha256Hash2 = block5.getHash();
        Block block6 = new Block(0L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, list);
        Sha256Hash sha256Hash3 = block6.getHash();
        List<Sha256Hash> sha256HashList = new ArrayList<>(Arrays.asList(sha256Hash, sha256Hash2, sha256Hash3));
        BlockLocator blockLocator = new BlockLocator(sha256HashList);
        //Assert statement(s)
        assertThat(result, equalTo(blockLocator));
    }

    //Sapient generated method id: ${2f52d914-224e-3cf8-a2e5-c61089a0f6f4}
    @Test()
    public void addTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<Sha256Hash> sha256HashList = new ArrayList<>();
        BlockLocator target = new BlockLocator(sha256HashList);
        //Act Statement(s)
        BlockLocator result = target.add(sha256HashMock);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${0a253188-e32a-3fb1-a265-54df02efeff0}
    @Test()
    public void sizeTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<Sha256Hash> sha256HashList = new ArrayList<>();
        BlockLocator target = new BlockLocator(sha256HashList);
        //Act Statement(s)
        int result = target.size();
        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${9c25887d-767d-38e9-b5ae-c2e4012c49be}
    @Ignore()
    @Test()
    public void getTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<Sha256Hash> sha256HashList = new ArrayList<>();
        BlockLocator target = new BlockLocator(sha256HashList);
        //Act Statement(s)
        Sha256Hash result = target.get(0);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}
    @Ignore()
    @Test()
    public void toStringTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
        ByteBuffer byteBuffer3 = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash3 = Sha256Hash.read(byteBuffer3);
        List<Sha256Hash> sha256HashList = new ArrayList<>();
        sha256HashList.add(sha256Hash);
        sha256HashList.add(sha256Hash2);
        sha256HashList.add(sha256Hash3);
        BlockLocator target = new BlockLocator(sha256HashList);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("Block locator with 0 blocks\n A"));
    }
}