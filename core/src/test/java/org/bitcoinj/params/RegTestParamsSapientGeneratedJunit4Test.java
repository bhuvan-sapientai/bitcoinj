package org.bitcoinj.params;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.mockito.InjectMocks;
import org.junit.After;
import org.junit.Test;
import org.mockito.stubbing.Answer;
import org.bitcoinj.core.Block;
import org.bitcoinj.base.internal.Preconditions;
import org.mockito.MockitoAnnotations;
import org.bitcoinj.base.Sha256Hash;
import org.bitcoinj.base.internal.ByteUtils;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

import java.time.Instant;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class RegTestParamsSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Block genesisBlockMock = mock(Block.class, "genesisBlock");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private RegTestParams target;

    @After()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${079b693f-5544-3b1d-9700-7a66938df0f6}
    @Test()
    public void allowEmptyPeerChainTest() {
        //Arrange Statement(s)
        target = new RegTestParams();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        boolean result = target.allowEmptyPeerChain();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${32a8d14c-b4e9-37a4-9736-3367f8ecb089}
    @Test()
    public void getWhenInstanceIsNull() {
        /* Branches:
         * (instance == null) : true
         */
        //Act Statement(s)
        RegTestParams result = RegTestParams.get();
        RegTestParams regTestParams = new RegTestParams();
        //Assert statement(s)
        assertThat(result, equalTo(regTestParams));
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
            block.when(() -> Block.createGenesis((Instant) any(), eq(545259519L), eq(2L))).thenReturn(genesisBlockMock);
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            target = new RegTestParams();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(sha256HashMock).when(genesisBlockMock).getHash();
            //Act Statement(s)
            Block result = target.getGenesisBlock();
            //Assert statement(s)
            assertThat(result, equalTo(genesisBlockMock));
            block.verify(() -> Block.createGenesis((Instant) any(), eq(545259519L), eq(2L)));
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
            verify(genesisBlockMock).getHash();
        }
    }
}
