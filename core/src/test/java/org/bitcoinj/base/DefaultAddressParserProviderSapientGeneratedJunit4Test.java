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
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

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
        List<Network> networkList = new ArrayList<>();
        List<Network> networkList2 = new ArrayList<>();
        DefaultAddressParserProvider target = new DefaultAddressParserProvider(networkList, networkList2);

        //Act Statement(s)
        AddressParser result = target.forNetwork(networkMock);

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${5d91f3cf-df8f-39bd-ae91-3cf293f7795c}
    @Test()
    public void fromNetworksTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        try (MockedStatic<Networks> networks = mockStatic(Networks.class)) {
            Set<NetworkParameters> networkParametersSet = new HashSet<>();
            networkParametersSet.add(networkParametersMock);
            networks.when(() -> Networks.get()).thenReturn(networkParametersSet);
            doReturn(networkMock).when(networkParametersMock).network();
            //Act Statement(s)
            DefaultAddressParserProvider result = DefaultAddressParserProvider.fromNetworks();
            //Assert statement(s)
            //TODO: Please implement equals method in DefaultAddressParserProvider for verification of the entire object or you need to adjust respective assertion statements
            assertThat(result, is(notNullValue()));
            networks.verify(() -> Networks.get(), atLeast(1));
            verify(networkParametersMock).network();
        }
    }
}
