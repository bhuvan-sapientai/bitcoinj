package org.bitcoinj.net.discovery;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.base.Network;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.bitcoinj.utils.DaemonThreadFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.mock;

import org.junit.Ignore;

public class DnsDiscoverySapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${57e52633-2497-3d26-a12d-63324ebc60fe}
    @Ignore()
    @Test()
    public void createExecutorTest() {
        //Arrange Statement(s)
        String[] stringArray = new String[]{"seed1.example.com", "seed2.example.com"};
        Network networkMock = mock(Network.class, "MAINNET");
        DnsDiscovery target = new DnsDiscovery(stringArray, networkMock);

        //Act Statement(s)
        ExecutorService result = target.createExecutor();
        DaemonThreadFactory daemonThreadFactory = new DaemonThreadFactory("DNS seed lookups");
        ExecutorService executorService = Executors.newFixedThreadPool(2, daemonThreadFactory);

        //Assert statement(s)
        //TODO: Please implement equals method in ExecutorService for verification to succeed or you need to adjust respective assertion statements
        assertThat(result, equalTo(executorService));
    }
}
