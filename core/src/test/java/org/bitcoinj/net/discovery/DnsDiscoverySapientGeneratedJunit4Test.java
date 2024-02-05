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
import org.mockito.MockedStatic;
import org.bitcoinj.core.NetworkParameters;
import org.bitcoinj.base.internal.Preconditions;

import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

public class DnsDiscoverySapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${57e52633-2497-3d26-a12d-63324ebc60fe}
    @Ignore()
    @Test()
    public void createExecutorTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        Network networkMock = mock(Network.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            String[] stringArray = new String[]{"dnsSeedsItem1"};
            DnsDiscovery target = new DnsDiscovery(stringArray, networkMock);
            //Act Statement(s)
            ExecutorService result = target.createExecutor();
            DaemonThreadFactory daemonThreadFactory = new DaemonThreadFactory("DNS seed lookups");
            ExecutorService executorService = Executors.newFixedThreadPool(1, daemonThreadFactory);
            //Assert statement(s)
            //TODO: Please implement equals method in ExecutorService for verification to succeed or you need to adjust respective assertion statements
            assertThat(result, equalTo(executorService));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
        }
    }
}
