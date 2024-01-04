package org.bitcoinj.utils;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.store.BlockStoreException;

import java.util.List;

import org.bitcoinj.core.Block;
import org.bitcoinj.store.BlockStore;
import org.bitcoinj.base.Sha256Hash;

import java.math.BigInteger;

import org.bitcoinj.core.NetworkParameters;
import org.bitcoinj.core.StoredBlock;

import java.util.ArrayList;
import java.time.Instant;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;
import org.junit.rules.ExpectedException;

public class VersionTallySapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final BlockStore blockStoreMock = mock(BlockStore.class);

    private final NetworkParameters paramsMock = mock(NetworkParameters.class);

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);

    private final StoredBlock versionBlockMock = mock(StoredBlock.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${a7db2f47-9b73-3a8d-a89d-4c6c9d13f9dd}
    @Ignore()
    @Test()
    public void addWhenVersionWriteHeadEqualsVersionWindowLength() {
        /* Branches:
         * (versionWriteHead == versionWindow.length) : true
         */
        //Arrange Statement(s)
        doReturn(0).when(paramsMock).getMajorityWindow();
        VersionTally target = new VersionTally(paramsMock);
        thrown.expect(ArrayIndexOutOfBoundsException.class);

        //Assert statement(s)
        verify(paramsMock).getMajorityWindow();
    }

    //Sapient generated method id: ${72afaac6-6b8d-3140-a393-129d3ab94b70}
    @Test()
    public void getCountAtOrAboveWhenVersionsStoredLessThanVersionWindowLength() {
        /* Branches:
         * (versionsStored < versionWindow.length) : true
         */
        //Arrange Statement(s)
        doReturn(1).when(paramsMock).getMajorityWindow();
        VersionTally target = new VersionTally(paramsMock);

        //Act Statement(s)
        Integer result = target.getCountAtOrAbove(0L);

        //Assert statement(s)
        assertThat(result, is(nullValue()));
        verify(paramsMock).getMajorityWindow();
    }

    //Sapient generated method id: ${be311949-3aac-3c21-9d70-15573dd3de6a}
    @Ignore()
    @Test()
    public void getCountAtOrAboveWhenLGreaterThanOrEqualsToVersion() {
        /* Branches:
         * (versionsStored < versionWindow.length) : false
         * (for-each(versionWindow)) : true
         * (l >= version) : true
         */
        //Arrange Statement(s)
        doReturn(0).when(paramsMock).getMajorityWindow();
        VersionTally target = new VersionTally(paramsMock);

        //Act Statement(s)
        Integer result = target.getCountAtOrAbove(0L);

        //Assert statement(s)
        assertThat(result, equalTo(0));
        verify(paramsMock).getMajorityWindow();
    }

    //Sapient generated method id: ${7abf920a-ee3d-3750-9987-43dd0f85013a}
    @Test()
    public void initializeWhenVersionBlockIsNullAndVersionsNotIsEmpty() throws BlockStoreException {
        /* Branches:
         * (headOffset < versionWindow.length) : true
         * (null == versionBlock) : true
         * (!versions.isEmpty()) : true
         */
        //Arrange Statement(s)
        Instant instant = Instant.now();
        List list = new ArrayList<>();
        Block block = new Block(1L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, list);
        doReturn(block).when(versionBlockMock).getHeader();
        doReturn(null).when(versionBlockMock).getPrev(blockStoreMock);
        doReturn(1).when(paramsMock).getMajorityWindow();
        VersionTally target = spy(new VersionTally(paramsMock));
        doNothing().when(target).add(1L);

        //Act Statement(s)
        target.initialize(blockStoreMock, versionBlockMock);

        //Assert statement(s)
        verify(versionBlockMock).getHeader();
        verify(versionBlockMock).getPrev(blockStoreMock);
        verify(paramsMock).getMajorityWindow();
        verify(target).add(1L);
    }

    //Sapient generated method id: ${90774a0d-9888-3368-afc7-9818d032960b}
    @Ignore()
    @Test()
    public void initializeWhenVersionBlockIsNotNullAndVersionsNotIsEmpty() throws BlockStoreException {
        /* Branches:
         * (headOffset < versionWindow.length) : true
         * (null == versionBlock) : false
         * (!versions.isEmpty()) : true
         */
        //Arrange Statement(s)
        Instant instant = Instant.now();
        List list = new ArrayList<>();
        Block block = new Block(1L, sha256HashMock, sha256HashMock2, instant, 0L, 0L, list);
        doReturn(block).when(versionBlockMock).getHeader();
        Sha256Hash sha256HashMock3 = mock(Sha256Hash.class);
        Sha256Hash sha256HashMock4 = mock(Sha256Hash.class);
        Instant instant2 = Instant.now();
        List list2 = new ArrayList<>();
        Block block2 = new Block(1L, sha256HashMock3, sha256HashMock4, instant2, 0L, 0L, list2);
        StoredBlock storedBlock = new StoredBlock(block2, new BigInteger("0"), 0);
        doReturn(storedBlock).when(versionBlockMock).getPrev(blockStoreMock);
        doReturn(1).when(paramsMock).getMajorityWindow();
        VersionTally target = spy(new VersionTally(paramsMock));
        doNothing().when(target).add(1L);

        //Act Statement(s)
        target.initialize(blockStoreMock, versionBlockMock);

        //Assert statement(s)
        verify(versionBlockMock).getHeader();
        verify(versionBlockMock).getPrev(blockStoreMock);
        verify(paramsMock).getMajorityWindow();
        verify(target).add(1L);
    }

    //Sapient generated method id: ${0a253188-e32a-3fb1-a265-54df02efeff0}
    @Test()
    public void sizeTest() {
        //Arrange Statement(s)
        doReturn(0).when(paramsMock).getMajorityWindow();
        VersionTally target = new VersionTally(paramsMock);

        //Act Statement(s)
        int result = target.size();

        //Assert statement(s)
        assertThat(result, equalTo(0));
        verify(paramsMock).getMajorityWindow();
    }
}
