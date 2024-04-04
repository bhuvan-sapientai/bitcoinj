package org.bitcoinj.params;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.base.internal.TimeUtils;
import org.bitcoinj.core.Block;

import java.time.Instant;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class UnitTestParamsSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${32a8d14c-b4e9-37a4-9736-3367f8ecb089}, hash: 2DADB802F4B6E30E1C0DDF596D55B544
    @Test()
    public void getWhenInstanceIsNull() {
        /* Branches:
         * (instance == null) : true
         */

        //Act Statement(s)
        UnitTestParams result = UnitTestParams.get();
        UnitTestParams unitTestParams = new UnitTestParams();

        //Assert statement(s)
        assertThat(result, equalTo(unitTestParams));
    }

    //Sapient generated method id: ${6af115c8-0813-3ff3-9b71-4c6682fe756c}, hash: 30C4932C0085CEE445A6337E842D243D
    @Test()
    public void getGenesisBlockWhenGenesisBlockIsNull() {
        /* Branches:
         * (genesisBlock == null) : true
         */
        //Arrange Statement(s)
        UnitTestParams target = new UnitTestParams();

        //Act Statement(s)
        Block result = target.getGenesisBlock();
        Instant instant = TimeUtils.currentTime();
        Block block = Block.createGenesis(instant, 545259519L);

        //Assert statement(s)
        assertThat(result, equalTo(block));
    }
}
