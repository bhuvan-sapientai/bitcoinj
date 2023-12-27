package org.bitcoinj.base;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.MockedStatic;

import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

public class BitcoinNetworkSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${8157ae39-31ae-3777-b5d7-838999087430}
    @Ignore()
    @Test()
    public void fromIdStringWhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 201)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BitcoinNetwork> bitcoinNetwork = mockStatic(BitcoinNetwork.class, CALLS_REAL_METHODS)) {
            BitcoinNetwork[] bitcoinNetworkArray = new BitcoinNetwork[]{BitcoinNetwork.MAINNET, BitcoinNetwork.MAINNET, BitcoinNetwork.MAINNET, BitcoinNetwork.MAINNET, BitcoinNetwork.MAINNET, BitcoinNetwork.MAINNET, BitcoinNetwork.MAINNET, BitcoinNetwork.MAINNET, BitcoinNetwork.MAINNET, BitcoinNetwork.MAINNET, BitcoinNetwork.MAINNET, BitcoinNetwork.MAINNET, BitcoinNetwork.MAINNET, BitcoinNetwork.MAINNET, BitcoinNetwork.MAINNET, BitcoinNetwork.MAINNET};
            bitcoinNetwork.when(() -> BitcoinNetwork.values()).thenReturn(bitcoinNetworkArray);
            //Act Statement(s)
            Optional<BitcoinNetwork> result = BitcoinNetwork.fromIdString("prod");
            Optional<BitcoinNetwork> bitcoinNetworkOptional = Optional.of(BitcoinNetwork.MAINNET);
            //Assert statement(s)
            assertThat(result, equalTo(bitcoinNetworkOptional));
            bitcoinNetwork.verify(() -> BitcoinNetwork.values(), atLeast(1));
        }
    }
}
