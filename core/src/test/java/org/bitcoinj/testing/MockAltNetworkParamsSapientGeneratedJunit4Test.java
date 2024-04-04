package org.bitcoinj.testing;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.base.utils.MonetaryFormat;
import org.bitcoinj.base.Coin;
import org.bitcoinj.core.Block;
import org.bitcoinj.core.BitcoinSerializer;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.is;

public class MockAltNetworkParamsSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${ea3e5383-6b88-3286-a893-340b435eee04}, hash: D069175341334007B344B884D52A03A7
    @Test()
    public void getPaymentProtocolIdTest() {
        //Arrange Statement(s)
        MockAltNetworkParams target = new MockAltNetworkParams();

        //Act Statement(s)
        String result = target.getPaymentProtocolId();

        //Assert statement(s)
        assertThat(result, is(nullValue()));
    }

    //Sapient generated method id: ${48efb277-67fd-3766-ba01-7ac5beacdee1}, hash: 563AF43589021E4FC5ADE8A8CEBDB29F
    @Test()
    public void getGenesisBlockTest() {
        //Arrange Statement(s)
        MockAltNetworkParams target = new MockAltNetworkParams();

        //Act Statement(s)
        Block result = target.getGenesisBlock();

        //Assert statement(s)
        assertThat(result, is(nullValue()));
    }

    //Sapient generated method id: ${417ee926-70c7-32d1-8d4b-27e23cc6c6fc}, hash: 7878777C7A65C52AD45310D307E3BE5C
    @Test()
    public void getMaxMoneyTest() {
        //Arrange Statement(s)
        MockAltNetworkParams target = new MockAltNetworkParams();

        //Act Statement(s)
        Coin result = target.getMaxMoney();
        MockAltNetwork mockAltNetwork = new MockAltNetwork();
        Coin coin = (Coin) mockAltNetwork.maxMoney();

        //Assert statement(s)
        assertThat(result, equalTo(coin));
    }

    //Sapient generated method id: ${44b0a5d5-40c6-34a5-b3f5-4656a6593207}, hash: 8F30E5AA08213485CD7118EDC828730A
    @Test()
    public void getMonetaryFormatTest() {
        //Arrange Statement(s)
        MockAltNetworkParams target = new MockAltNetworkParams();

        //Act Statement(s)
        MonetaryFormat result = target.getMonetaryFormat();

        //Assert statement(s)
        assertThat(result, is(nullValue()));
    }

    //Sapient generated method id: ${d7a93d1f-e116-30ad-a248-5f06628be860}, hash: 5B3B7885045F7DED3D909A5E0BAF45EB
    @Test()
    public void getUriSchemeTest() {
        //Arrange Statement(s)
        MockAltNetworkParams target = new MockAltNetworkParams();

        //Act Statement(s)
        String result = target.getUriScheme();

        //Assert statement(s)
        assertThat(result, equalTo("mockcoin"));
    }

    //Sapient generated method id: ${acf77967-ab44-395e-9113-4ce8808d0613}, hash: 6A9E799778746D3CF61FCBEFD43428AE
    @Test()
    public void hasMaxMoneyTest() {
        //Arrange Statement(s)
        MockAltNetworkParams target = new MockAltNetworkParams();

        //Act Statement(s)
        boolean result = target.hasMaxMoney();

        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${d1954e54-08e5-3cb6-8f79-2412c8d3937d}, hash: 2D740541B3D59FE084E8E5C33B60C2F9
    @Test()
    public void getSerializerTest() {
        //Arrange Statement(s)
        MockAltNetworkParams target = new MockAltNetworkParams();

        //Act Statement(s)
        BitcoinSerializer result = target.getSerializer();

        //Assert statement(s)
        assertThat(result, is(nullValue()));
    }
}
