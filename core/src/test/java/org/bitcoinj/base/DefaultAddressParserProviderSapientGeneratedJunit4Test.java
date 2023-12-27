package org.bitcoinj.base;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;
import java.util.Set;

import org.bitcoinj.base.internal.StreamUtils;

import java.util.HashSet;

import org.mockito.MockedStatic;
import org.bitcoinj.core.NetworkParameters;

import java.util.ArrayList;

import org.bitcoinj.params.Networks;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class DefaultAddressParserProviderSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Network networkMock = mock(Network.class);

    //Sapient generated method id: ${e87f8b02-7a25-3d4e-941a-232079c0f0fb}
    @Test()
    public void forKnownNetworksTest() {
        //Arrange Statement(s)
        List<Network> networkList = new ArrayList<>();
        List<Network> networkList2 = new ArrayList<>();
        DefaultAddressParserProvider target = new DefaultAddressParserProvider(networkList, networkList2);

        //Act Statement(s)
        AddressParser result = target.forKnownNetworks();

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${5179ed00-a049-390f-bfaf-11b6120eb4d8}
    @Test()
    public void forNetworkTest() {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class, "MAINNET");
        Network networkMock2 = mock(Network.class, "TESTNET");
        List<Network> networkList = new ArrayList<>();
        networkList.add(networkMock);
        networkList.add(networkMock2);
        Network networkMock3 = mock(Network.class, "MAINNET");
        Network networkMock4 = mock(Network.class, "TESTNET");
        List<Network> networkList2 = new ArrayList<>();
        networkList2.add(networkMock3);
        networkList2.add(networkMock4);
        DefaultAddressParserProvider target = new DefaultAddressParserProvider(networkList, networkList2);
        Network networkMock5 = mock(Network.class, "MAINNET");

        //Act Statement(s)
        AddressParser result = target.forNetwork(networkMock5);

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }
}
