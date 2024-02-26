package org.bitcoinj.base;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class BitcoinNetworkSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${0f6367f9-7e25-30f0-bb4c-ae86787a4506}
    @Test()
    public void fromStringTest() {

        //Act Statement(s)
        Optional<BitcoinNetwork> result = BitcoinNetwork.fromString("nameString1");
        Optional<BitcoinNetwork> bitcoinNetworkOptional = Optional.of(BitcoinNetwork.MAINNET);

        //Assert statement(s)
        assertThat(result, equalTo(bitcoinNetworkOptional));
    }

    //Sapient generated method id: ${8157ae39-31ae-3777-b5d7-838999087430}
    @Test()
    public void fromIdStringWhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 201)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        Optional<BitcoinNetwork> result = BitcoinNetwork.fromIdString("idString1");
        Optional<BitcoinNetwork> bitcoinNetworkOptional = Optional.of(BitcoinNetwork.MAINNET);

        //Assert statement(s)
        assertThat(result, equalTo(bitcoinNetworkOptional));
    }
}
