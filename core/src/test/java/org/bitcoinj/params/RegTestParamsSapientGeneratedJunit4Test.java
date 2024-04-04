package org.bitcoinj.params;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.core.Block;

import java.time.Instant;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class RegTestParamsSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${079b693f-5544-3b1d-9700-7a66938df0f6}, hash: C253BA96CFC3F1859810D1BB7A0E2162
    @Test()
    public void allowEmptyPeerChainTest() {
        //Arrange Statement(s)
        RegTestParams target = new RegTestParams();

        //Act Statement(s)
        boolean result = target.allowEmptyPeerChain();

        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${32a8d14c-b4e9-37a4-9736-3367f8ecb089}, hash: F175D2AA6803997F280870F81B571668
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

    //Sapient generated method id: ${6af115c8-0813-3ff3-9b71-4c6682fe756c}, hash: 2A2E2E336CC34A69452D725B1D4CD5AE
    @Test()
    public void getGenesisBlockWhenGenesisBlockIsNull() {
        /* Branches:
         * (genesisBlock == null) : true
         */
        //Arrange Statement(s)
        RegTestParams target = new RegTestParams();

        //Act Statement(s)
        Block result = target.getGenesisBlock();
        Instant instant = Instant.ofEpochSecond(1296688602L);
        Block block = Block.createGenesis(instant, 545259519L, 2L);

        //Assert statement(s)
        assertThat(result, equalTo(block));
    }
}
