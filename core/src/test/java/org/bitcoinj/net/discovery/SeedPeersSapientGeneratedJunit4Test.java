package org.bitcoinj.net.discovery;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;
import java.time.Duration;

import org.bitcoinj.core.NetworkParameters;

import java.net.InetSocketAddress;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;

public class SeedPeersSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final NetworkParameters networkParametersMock = mock(NetworkParameters.class);

    //Sapient generated method id: ${29045a5a-75bd-3a9b-92fb-e6d2c2819094}
    @Test()
    public void getPeerWhenPnseedIndexGreaterThanOrEqualsToSeedAddrsSize() {
        /* Branches:
         * (pnseedIndex >= seedAddrs.size()) : true  #  inside nextPeer method
         */
        //Arrange Statement(s)
        SeedPeers target = new SeedPeers((int[]) null, networkParametersMock);

        //Act Statement(s)
        InetSocketAddress result = target.getPeer();

        //Assert statement(s)
        assertThat(result, is(nullValue()));
    }

    //Sapient generated method id: ${76a92274-e20a-3c7a-86ab-707999f7356a}
    @Test()
    public void getPeersWhenServicesNotEquals0() {
        /* Branches:
         * (services != 0) : true
         */
        //Arrange Statement(s)
        SeedPeers target = new SeedPeers((int[]) null, networkParametersMock);
        Duration duration = Duration.ofDays(0L);

        //Act Statement(s)
        List<InetSocketAddress> result = target.getPeers(1L, duration);

        //Assert statement(s)
        assertThat(result.size(), equalTo(0));
    }
}
