package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;
import java.nio.ByteBuffer;
import java.util.ArrayList;

import org.bitcoinj.base.Sha256Hash;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;

public class BlockLocatorSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${742d8741-5165-3f5f-b4ca-97d8134588a6}, hash: D57E5FBB5A97060E858DE862DFDD197E
    @Test()
    public void ofBlocksTest() {
        //Arrange Statement(s)
        Block[] blockArray = new Block[]{};
        //Act Statement(s)
        BlockLocator result = BlockLocator.ofBlocks(blockArray);
        List<Sha256Hash> sha256HashList = new ArrayList<>();
        BlockLocator blockLocator = new BlockLocator(sha256HashList);
        //Assert statement(s)
        assertThat(result, equalTo(blockLocator));
    }

    //Sapient generated method id: ${2f52d914-224e-3cf8-a2e5-c61089a0f6f4}, hash: 8F13804C5DE198A040048585BB131D30
    @Test()
    public void addTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(64);
        Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer2);
        ByteBuffer byteBuffer3 = ByteBuffer.allocateDirect(64);
        Sha256Hash sha256Hash3 = Sha256Hash.read(byteBuffer3);
        List<Sha256Hash> sha256HashList = new ArrayList<>();
        sha256HashList.add(sha256Hash);
        sha256HashList.add(sha256Hash2);
        sha256HashList.add(sha256Hash3);
        BlockLocator target = new BlockLocator(sha256HashList);
        ByteBuffer byteBuffer4 = ByteBuffer.allocateDirect(64);
        Sha256Hash sha256Hash4 = Sha256Hash.read(byteBuffer4);
        //Act Statement(s)
        BlockLocator result = target.add(sha256Hash4);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${0a253188-e32a-3fb1-a265-54df02efeff0}, hash: 8FDAC7676CC8A65EAD08F188FC6AED48
    @Test()
    public void sizeTest() {
        //Arrange Statement(s)
        List<Sha256Hash> sha256HashList = new ArrayList<>();
        BlockLocator target = new BlockLocator(sha256HashList);
        //Act Statement(s)
        int result = target.size();
        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${9c25887d-767d-38e9-b5ae-c2e4012c49be}, hash: 05DF7F1B061FE337C5E79CAACC49878D
    @Test()
    public void getTest() {
        //Arrange Statement(s)
        Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        List<Sha256Hash> sha256HashList = new ArrayList<>();
        sha256HashList.add(sha256HashMock);
        BlockLocator target = new BlockLocator(sha256HashList);
        //Act Statement(s)
        Sha256Hash result = target.get(0);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: 8138B85E4BE0F568B7936371F822BBFD
    @Test()
    public void toStringTest() {
        //Arrange Statement(s)
        List<Sha256Hash> sha256HashList = new ArrayList<>();
        BlockLocator target = new BlockLocator(sha256HashList);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("Block locator with 0 blocks\n "));
    }
}
