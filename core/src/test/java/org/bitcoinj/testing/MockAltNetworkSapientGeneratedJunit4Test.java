package org.bitcoinj.testing;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.base.Coin;
import org.bitcoinj.base.Monetary;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.mock;

public class MockAltNetworkSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${d8f9d8d4-318b-3adc-81df-199235eeefbb}, hash: FFB220DBB8481D2E765504D5248DF433
    @Test()
    public void idTest() {
        //Arrange Statement(s)
        MockAltNetwork target = new MockAltNetwork();

        //Act Statement(s)
        String result = target.id();

        //Assert statement(s)
        assertThat(result, equalTo("mock.alt.network"));
    }

    //Sapient generated method id: ${bed29fb3-d28f-3aba-af01-87d8234b2f32}, hash: B6F828CBE7A060484D85A0DE6311F081
    @Test()
    public void legacyAddressHeaderTest() {
        //Arrange Statement(s)
        MockAltNetwork target = new MockAltNetwork();

        //Act Statement(s)
        int result = target.legacyAddressHeader();

        //Assert statement(s)
        assertThat(result, equalTo(48));
    }

    //Sapient generated method id: ${920daa2d-06d4-30bd-99f3-d6c5d6db14d5}, hash: 209838940365FB31FABC230AEF657203
    @Test()
    public void legacyP2SHHeaderTest() {
        //Arrange Statement(s)
        MockAltNetwork target = new MockAltNetwork();

        //Act Statement(s)
        int result = target.legacyP2SHHeader();

        //Assert statement(s)
        assertThat(result, equalTo(5));
    }

    //Sapient generated method id: ${8a6a2dc3-de80-3259-ab06-cbf475965b36}, hash: FB8D548B1CE279B56442ECB87AB19DF5
    @Test()
    public void segwitAddressHrpTest() {
        //Arrange Statement(s)
        MockAltNetwork target = new MockAltNetwork();

        //Act Statement(s)
        String result = target.segwitAddressHrp();

        //Assert statement(s)
        assertThat(result, equalTo("mock"));
    }

    //Sapient generated method id: ${00d238fa-3641-312b-81df-c13edf52dd9b}, hash: 9CFAE1429B3C32EE6B3741978B275A0B
    @Test()
    public void uriSchemeTest() {
        //Arrange Statement(s)
        MockAltNetwork target = new MockAltNetwork();

        //Act Statement(s)
        String result = target.uriScheme();

        //Assert statement(s)
        assertThat(result, equalTo("mockcoin"));
    }

    //Sapient generated method id: ${acf77967-ab44-395e-9113-4ce8808d0613}, hash: A7E434F520F45319F149064A74302131
    @Test()
    public void hasMaxMoneyTest() {
        //Arrange Statement(s)
        MockAltNetwork target = new MockAltNetwork();

        //Act Statement(s)
        boolean result = target.hasMaxMoney();

        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${d3428af3-0897-3925-8661-7b0f38766a24}, hash: 0B65F077A2F692C1A18947EE593FADFF
    @Test()
    public void maxMoneyTest() {
        //Arrange Statement(s)
        MockAltNetwork target = new MockAltNetwork();

        //Act Statement(s)
        Monetary result = target.maxMoney();
        Coin coin = Coin.valueOf(9223372036854775807L);

        //Assert statement(s)
        assertThat(result, equalTo(coin));
    }

    //Sapient generated method id: ${04715ef9-2ddf-34dd-a6f5-2823e6daa0e4}, hash: 969530FD774F3D489F49722EA6D09FDB
    @Test()
    public void exceedsMaxMoneyTest() {
        //Arrange Statement(s)
        MockAltNetwork target = new MockAltNetwork();
        Monetary monetaryMock = mock(Monetary.class);

        //Act Statement(s)
        boolean result = target.exceedsMaxMoney(monetaryMock);

        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }
}
