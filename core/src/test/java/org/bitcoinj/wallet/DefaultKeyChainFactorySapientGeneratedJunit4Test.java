package org.bitcoinj.wallet;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;

import org.bitcoinj.base.ScriptType;
import org.bitcoinj.crypto.DeterministicKey;

import java.util.ArrayList;

import org.bitcoinj.crypto.KeyCrypter;
import org.bitcoinj.crypto.ChildNumber;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;

public class DefaultKeyChainFactorySapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final DeterministicKey deterministicKeyMock = mock(DeterministicKey.class);

    //Sapient generated method id: ${6b7e2ac9-05c9-36dd-96dd-7b84572202cd}
    @Test()
    public void makeKeyChainTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DefaultKeyChainFactory target = new DefaultKeyChainFactory();
        DeterministicSeed deterministicSeedMock = mock(DeterministicSeed.class);
        KeyCrypter keyCrypterMock = mock(KeyCrypter.class);
        List<ChildNumber> childNumberList = new ArrayList<>();

        //Act Statement(s)
        DeterministicKeyChain result = target.makeKeyChain(deterministicSeedMock, keyCrypterMock, ScriptType.P2PKH, childNumberList);

        //Assert statement(s)
        //TODO: Please implement equals method in DeterministicKeyChain for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${2f9277e5-88d1-3f0a-bd59-43bc0e17ceda}
    @Test()
    public void makeWatchingKeyChainTest() throws UnreadableWalletException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DefaultKeyChainFactory target = new DefaultKeyChainFactory();

        //Act Statement(s)
        DeterministicKeyChain result = target.makeWatchingKeyChain(deterministicKeyMock, ScriptType.P2PKH);

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${41593bf9-76fa-3d22-b0d1-ebe2f4bf9ac3}
    @Test()
    public void makeSpendingKeyChainTest() throws UnreadableWalletException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DefaultKeyChainFactory target = new DefaultKeyChainFactory();

        //Act Statement(s)
        DeterministicKeyChain result = target.makeSpendingKeyChain(deterministicKeyMock, ScriptType.P2PKH);

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }
}
