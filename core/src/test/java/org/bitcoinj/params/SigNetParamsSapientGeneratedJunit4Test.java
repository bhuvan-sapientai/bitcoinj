package org.bitcoinj.params;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.core.Block;

import java.time.Instant;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SigNetParamsSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${32a8d14c-b4e9-37a4-9736-3367f8ecb089}, hash: 1AEF64EC91390F3BD7CE0FD6A5ECBBCD
    @Test()
    public void getWhenInstanceIsNull() {
        /* Branches:
         * (instance == null) : true
         */

        //Act Statement(s)
        SigNetParams result = SigNetParams.get();
        SigNetParams sigNetParams = new SigNetParams();

        //Assert statement(s)
        assertThat(result, equalTo(sigNetParams));
    }

    //Sapient generated method id: ${6af115c8-0813-3ff3-9b71-4c6682fe756c}, hash: 31383C2AF14E65A02EC5547DE17C00A0
    @Test()
    public void getGenesisBlockWhenGenesisBlockIsNull() {
        /* Branches:
         * (genesisBlock == null) : true
         */
        //Arrange Statement(s)
        SigNetParams target = new SigNetParams();

        //Act Statement(s)
        Block result = target.getGenesisBlock();
        Instant instant = Instant.ofEpochSecond(1598918400L);
        Block block = Block.createGenesis(instant, 503543726L, 52613770L);

        //Assert statement(s)
        assertThat(result, equalTo(block));
    }
}
