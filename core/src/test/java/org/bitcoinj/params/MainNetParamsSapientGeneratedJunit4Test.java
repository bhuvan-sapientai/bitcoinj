package org.bitcoinj.params;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.core.Block;

import java.time.Instant;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class MainNetParamsSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${32a8d14c-b4e9-37a4-9736-3367f8ecb089}, hash: AB144B80CC2E72B74F5DBD1A5AC0CEF3
    @Test()
    public void getWhenInstanceIsNull() {
        /* Branches:
         * (instance == null) : true
         */

        //Act Statement(s)
        MainNetParams result = MainNetParams.get();
        MainNetParams mainNetParams = new MainNetParams();

        //Assert statement(s)
        assertThat(result, equalTo(mainNetParams));
    }

    //Sapient generated method id: ${6af115c8-0813-3ff3-9b71-4c6682fe756c}, hash: E428E0098CF17F537A2D82DE1E4EB299
    @Test()
    public void getGenesisBlockWhenGenesisBlockIsNull() {
        /* Branches:
         * (genesisBlock == null) : true
         */
        //Arrange Statement(s)
        MainNetParams target = new MainNetParams();

        //Act Statement(s)
        Block result = target.getGenesisBlock();
        Instant instant = Instant.ofEpochSecond(1231006505L);
        Block block = Block.createGenesis(instant, 486604799L, 2083236893L);

        //Assert statement(s)
        assertThat(result, equalTo(block));
    }
}
