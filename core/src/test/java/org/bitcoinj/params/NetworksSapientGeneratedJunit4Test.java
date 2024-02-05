package org.bitcoinj.params;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.base.Network;
import org.mockito.stubbing.Answer;

import java.util.Collection;

import org.mockito.MockedStatic;
import org.bitcoinj.core.NetworkParameters;

import java.util.Optional;
import java.util.ArrayList;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.ArgumentMatchers.anySet;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

public class NetworksSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final NetworkParameters networkParametersMock = mock(NetworkParameters.class);

    //Sapient generated method id: ${9c25887d-767d-38e9-b5ae-c2e4012c49be}
    @Ignore()
    @Test()
    public void getTest() {

        //Act Statement(s)
        Set<NetworkParameters> result = Networks.get();

        //Assert statement(s)
        assertThat(result.size(), equalTo(0));
    }

    //Sapient generated method id: ${2065002a-9c1f-335e-ba7c-3ceed12bc7e9}
    @Ignore()
    @Test()
    public void findTest() {
        //Arrange Statement(s)
        Network networkMock = mock(Network.class);

        //Act Statement(s)
        Optional<NetworkParameters> result = Networks.find(networkMock);
        Optional<NetworkParameters> networkParametersOptional = Optional.empty();

        //Assert statement(s)
        assertThat(result, equalTo(networkParametersOptional));
    }

    //Sapient generated method id: ${853913a6-18ed-366c-8d01-10d393fd970e}
    @Test()
    public void registerTest() {
        //Arrange Statement(s)
        try (MockedStatic<Networks> networks = mockStatic(Networks.class, CALLS_REAL_METHODS)) {
            networks.when(() -> Networks.register(anySet())).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            Networks.register(networkParametersMock);
            //Assert statement(s)
            networks.verify(() -> Networks.register(anySet()), atLeast(1));
        }
    }

    //Sapient generated method id: ${d036466a-5481-3f16-a70d-5c58cf6e4044}
    @Test()
    public void register1Test() {
        //Arrange Statement(s)
        Collection<NetworkParameters> collection = new ArrayList<>();

        //Act Statement(s)
        Networks.register(collection);
    }

    //Sapient generated method id: ${220cfd37-bc9b-3cdd-89af-f28e72691dcb}
    @Test()
    public void unregisterTest() {

        //Act Statement(s)
        Networks.unregister(networkParametersMock);
    }
}
