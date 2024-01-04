package org.bitcoinj.store;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.core.VerificationException;

import java.util.List;
import java.math.BigInteger;

import org.bitcoinj.core.Block;

import java.nio.ByteBuffer;
import java.util.ArrayList;

import org.bitcoinj.core.StoredBlock;

import java.time.Instant;

import org.bitcoinj.base.Sha256Hash;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class MemoryBlockStoreSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Block genesisBlockMock = mock(Block.class);

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    private final Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);

    private final Block blockMock = mock(Block.class);

    private final Block genesisHeaderMock = mock(Block.class);

    //Sapient generated method id: ${93d4fa60-3e07-39db-9a2c-52b04a00e8b8}
    @Test()
    public void putWhenBlockMapIsNotNull() throws BlockStoreException, VerificationException {
        /* Branches:
         * (blockMap == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(new BigInteger("0")).when(genesisHeaderMock).getWork();
        doReturn(sha256HashMock, sha256HashMock2).when(genesisHeaderMock).getHash();
        doReturn(genesisHeaderMock).when(genesisBlockMock).cloneAsHeader();
        MemoryBlockStore target = new MemoryBlockStore(genesisBlockMock);
        StoredBlock storedBlock = new StoredBlock(genesisHeaderMock, new BigInteger("0"), 0);

        //Act Statement(s)
        target.put(storedBlock);

        //Assert statement(s)
        verify(genesisHeaderMock).getWork();
        verify(genesisHeaderMock, times(2)).getHash();
        verify(genesisBlockMock).cloneAsHeader();
    }

    //Sapient generated method id: ${bdad3ce5-9bf5-3345-b74d-b0512e0208b6}
    @Ignore()
    @Test()
    public void getWhenBlockMapIsNotNull() throws BlockStoreException, VerificationException {
        /* Branches:
         * (blockMap == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(blockMock).when(genesisBlockMock).cloneAsHeader();
        doReturn(new BigInteger("0")).when(blockMock).getWork();
        doReturn(sha256HashMock).when(blockMock).getHash();
        MemoryBlockStore target = new MemoryBlockStore(genesisBlockMock);

        //Act Statement(s)
        StoredBlock result = target.get(sha256HashMock2);

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
        verify(genesisBlockMock).cloneAsHeader();
        verify(blockMock).getWork();
        verify(blockMock).getHash();
    }

    //Sapient generated method id: ${21ed6da0-f82f-3eac-84ef-f7da4d646f7c}
    @Ignore()
    @Test()
    public void getChainHeadWhenBlockMapIsNotNull() throws BlockStoreException, VerificationException {
        /* Branches:
         * (blockMap == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(blockMock).when(genesisBlockMock).cloneAsHeader();
        doReturn(new BigInteger("0")).when(blockMock).getWork();
        doReturn(sha256HashMock).when(blockMock).getHash();
        MemoryBlockStore target = new MemoryBlockStore(genesisBlockMock);

        //Act Statement(s)
        StoredBlock result = target.getChainHead();
        StoredBlock storedBlock = new StoredBlock(blockMock, new BigInteger("0"), 0);

        //Assert statement(s)
        assertThat(result, equalTo(storedBlock));
        verify(genesisBlockMock).cloneAsHeader();
        verify(blockMock).getWork();
        verify(blockMock).getHash();
    }

    //Sapient generated method id: ${7f46c20f-91a7-37c9-a337-f1d1de82a194}
    @Ignore()
    @Test()
    public void setChainHeadWhenBlockMapIsNotNull() throws BlockStoreException, VerificationException {
        /* Branches:
         * (blockMap == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(new BigInteger("0")).when(genesisHeaderMock).getWork();
        doReturn(sha256HashMock).when(genesisHeaderMock).getHash();
        doReturn(genesisHeaderMock).when(genesisBlockMock).cloneAsHeader();
        MemoryBlockStore target = new MemoryBlockStore(genesisBlockMock);
        StoredBlock storedBlock = new StoredBlock(genesisHeaderMock, new BigInteger("0"), 0);

        //Act Statement(s)
        target.setChainHead(storedBlock);

        //Assert statement(s)
        verify(genesisHeaderMock).getWork();
        verify(genesisHeaderMock).getHash();
        verify(genesisBlockMock).cloneAsHeader();
    }

    //Sapient generated method id: ${4338ea80-df41-3c09-b3eb-b0476a460c1f}
    @Ignore()
    @Test()
    public void closeTest() throws VerificationException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(blockMock).when(genesisBlockMock).cloneAsHeader();
        doReturn(new BigInteger("0")).when(blockMock).getWork();
        doReturn(sha256HashMock).when(blockMock).getHash();
        MemoryBlockStore target = new MemoryBlockStore(genesisBlockMock);

        //Act Statement(s)
        target.close();

        //Assert statement(s)
        verify(genesisBlockMock).cloneAsHeader();
        verify(blockMock).getWork();
        verify(blockMock).getHash();
    }
}
