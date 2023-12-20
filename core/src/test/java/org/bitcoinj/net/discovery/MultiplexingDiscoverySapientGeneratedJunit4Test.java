package org.bitcoinj.net.discovery;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.Ignore;

import java.util.concurrent.ExecutionException;

import org.junit.rules.ExpectedException;
import org.bitcoinj.base.Network;

import java.util.List;

import org.bitcoinj.utils.ContextPropagatingThreadFactory;
import org.bitcoinj.base.BitcoinNetwork;

import java.time.Duration;
import java.util.concurrent.ExecutorService;

import org.mockito.MockedStatic;
import org.bitcoinj.core.NetworkParameters;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.concurrent.Executors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

public class MultiplexingDiscoverySapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final MultiplexingDiscovery multiplexingDiscoveryMock = mock(MultiplexingDiscovery.class);

    private final Network networkMock = mock(Network.class);

    private final NetworkParameters networkParametersMock = mock(NetworkParameters.class);

    private final NetworkParameters paramsMock = mock(NetworkParameters.class);

    private final PeerDiscovery peerDiscoveryMock = mock(PeerDiscovery.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${bf6499da-0a80-393c-ae42-5f5d2ea9d6f4}
    @Test()
    public void forServicesTest() {
        //Arrange Statement(s)
        try (MockedStatic<MultiplexingDiscovery> multiplexingDiscovery = mockStatic(MultiplexingDiscovery.class, CALLS_REAL_METHODS)) {
            multiplexingDiscovery.when(() -> MultiplexingDiscovery.forServices(networkMock, 0L, true, true)).thenReturn(multiplexingDiscoveryMock);
            //Act Statement(s)
            MultiplexingDiscovery result = MultiplexingDiscovery.forServices(networkMock, 0L);
            //Assert statement(s)
            assertThat(result, equalTo(multiplexingDiscoveryMock));
            multiplexingDiscovery.verify(() -> MultiplexingDiscovery.forServices(networkMock, 0L, true, true), atLeast(1));
        }
    }

    //Sapient generated method id: ${efc9ee8b-d129-3c97-98e7-504c3ff8d345}
    @Test()
    public void forServices1WhenDnsSeedsIsNotEmptyAndDefaultBranch() {
        /* Branches:
         * (dnsSeeds != null) : true
         * (for-each(dnsSeeds)) : true
         * (branch expression (line 123)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            String[] stringArray = new String[]{"return_of_getDnsSeedsItem1"};
            doReturn(stringArray).when(networkParametersMock).getDnsSeeds();
            //Act Statement(s)
            MultiplexingDiscovery result = MultiplexingDiscovery.forServices(networkMock, 0L, false, false);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(networkParametersMock).getDnsSeeds();
        }
    }

    //Sapient generated method id: ${d777278a-7102-3890-a0ba-d871dcc80ae1}
    @Ignore()
    @Test()
    public void forServices1WhenDnsSeedsIsEmptyAndDefaultBranch() {
        /* Branches:
         * (dnsSeeds != null) : true
         * (for-each(dnsSeeds)) : false
         * (branch expression (line 123)) : true  #  inside <init> method
         */
        //Arrange Statement(s)
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            String[] stringArray = new String[]{};
            doReturn(stringArray).when(networkParametersMock).getDnsSeeds();
            //Act Statement(s)
            MultiplexingDiscovery result = MultiplexingDiscovery.forServices(networkMock, 0L, false, false);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(networkParametersMock).getDnsSeeds();
        }
    }

    //Sapient generated method id: ${a3d5d6ee-30fd-3760-8c05-1d94aced277c}
    @Test()
    public void forServices2Test() {
        //Arrange Statement(s)
        try (MockedStatic<MultiplexingDiscovery> multiplexingDiscovery = mockStatic(MultiplexingDiscovery.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock).when(paramsMock).network();
            multiplexingDiscovery.when(() -> MultiplexingDiscovery.forServices(networkMock, 0L)).thenReturn(multiplexingDiscoveryMock);
            //Act Statement(s)
            MultiplexingDiscovery result = MultiplexingDiscovery.forServices(paramsMock, 0L);
            //Assert statement(s)
            assertThat(result, equalTo(multiplexingDiscoveryMock));
            verify(paramsMock, atLeast(1)).network();
            multiplexingDiscovery.verify(() -> MultiplexingDiscovery.forServices(networkMock, 0L), atLeast(1));
        }
    }

    //Sapient generated method id: ${aaaf9c80-1d2a-3386-bace-38f2052d5259}
    @Test()
    public void forServices3Test() {
        //Arrange Statement(s)
        try (MockedStatic<MultiplexingDiscovery> multiplexingDiscovery = mockStatic(MultiplexingDiscovery.class, CALLS_REAL_METHODS)) {
            doReturn(networkMock).when(paramsMock).network();
            multiplexingDiscovery.when(() -> MultiplexingDiscovery.forServices(networkMock, 0L, false, false)).thenReturn(multiplexingDiscoveryMock);
            //Act Statement(s)
            MultiplexingDiscovery result = MultiplexingDiscovery.forServices(paramsMock, 0L, false, false);
            //Assert statement(s)
            assertThat(result, equalTo(multiplexingDiscoveryMock));
            verify(paramsMock, atLeast(1)).network();
            multiplexingDiscovery.verify(() -> MultiplexingDiscovery.forServices(networkMock, 0L, false, false), atLeast(1));
        }
    }

    //Sapient generated method id: ${51d29f99-c2a3-3857-ad64-2975622c153d}
    @Ignore(value = "Potential harmful system call (Future.isCancelled, ExecutorService.invokeAll) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void getPeersWhenParallelQueriesAndAddrsSizeEquals0ThrowsPeerDiscoveryException() throws PeerDiscoveryException {
        /* Branches:
         * (parallelQueries) : true
         * (for-each(seeds)) : true
         * (i < futures.size()) : true
         * (future.isCancelled()) : true
         * (parallelQueries) : true
         * (addrs.size() == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<PeerDiscovery> peerDiscoveryList = new ArrayList<>();
        peerDiscoveryList.add(peerDiscoveryMock);
        MultiplexingDiscovery target = spy(new MultiplexingDiscovery(networkMock, peerDiscoveryList));
        //TODO: Needs to return real value
        doReturn(null).when(target).createExecutor();
        PeerDiscoveryException peerDiscoveryException = new PeerDiscoveryException("No peer discovery returned any results in 2 ms. Check internet connection?");
        thrown.expect(PeerDiscoveryException.class);
        thrown.expectMessage(peerDiscoveryException.getMessage());
        Duration duration = Duration.ofDays(0L);
        //Act Statement(s)
        target.getPeers(1L, duration);
        //Assert statement(s)
        verify(target).createExecutor();
    }

    //Sapient generated method id: ${281eaeaf-48ef-3350-b942-88718ed432fd}
    @Ignore(value = "Potential harmful system call (Future.isCancelled, ExecutorService.invokeAll) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void getPeersWhenShufflePeers() throws PeerDiscoveryException {
        /* Branches:
         * (parallelQueries) : true
         * (for-each(seeds)) : true
         * (i < futures.size()) : true
         * (future.isCancelled()) : false
         * (addrs.size() == 0) : false
         * (shufflePeers) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<PeerDiscovery> peerDiscoveryList = new ArrayList<>();
        peerDiscoveryList.add(peerDiscoveryMock);
        MultiplexingDiscovery target = spy(new MultiplexingDiscovery(networkMock, peerDiscoveryList));
        //TODO: Needs to return real value
        doReturn(null).when(target).createExecutor();
        PeerDiscoveryException peerDiscoveryException = new PeerDiscoveryException("No peer discovery returned any results in 2 ms. Check internet connection?");
        thrown.expect(PeerDiscoveryException.class);
        thrown.expectMessage(peerDiscoveryException.getMessage());
        Duration duration = Duration.ofDays(0L);
        //Act Statement(s)
        target.getPeers(1L, duration);
        //Assert statement(s)
        verify(target).createExecutor();
    }

    //Sapient generated method id: ${bedae1ab-56a9-386a-af42-c9a753de6250}
    @Ignore(value = "Potential harmful system call (Future.isCancelled, ExecutorService.invokeAll) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void getPeersWhenParallelQueriesAndCaughtExecutionExceptionAndAddrsSizeEquals0ThrowsPeerDiscoveryException() throws PeerDiscoveryException, InterruptedException {
        /* Branches:
         * (parallelQueries) : true
         * (for-each(seeds)) : true
         * (i < futures.size()) : true
         * (future.isCancelled()) : true
         * (parallelQueries) : true
         * (catch-exception (ExecutionException)) : true
         * (addrs.size() == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<PeerDiscovery> peerDiscoveryList = new ArrayList<>();
        MultiplexingDiscovery target = spy(new MultiplexingDiscovery(BitcoinNetwork.REGTEST, peerDiscoveryList));
        //TODO: Needs to return real value
        doReturn(null).when(target).createExecutor();
        PeerDiscoveryException peerDiscoveryException = new PeerDiscoveryException("message1");
        thrown.expect(PeerDiscoveryException.class);
        thrown.expectMessage(peerDiscoveryException.getMessage());
        Duration duration = Duration.ofDays(0L);
        //Act Statement(s)
        target.getPeers(0L, duration);
        //Assert statement(s)
        verify(target).createExecutor();
    }

    //Sapient generated method id: ${465ee7d3-758b-3ef4-b38b-1eb319998f3d}
    @Ignore(value = "Potential harmful system call (Future.isCancelled, Future.get, ExecutorService.invokeAll) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void getPeersWhenCaughtExecutionExceptionAndParallelQueriesAndAddrsSizeEquals0ThrowsPeerDiscoveryException() throws PeerDiscoveryException, InterruptedException, ExecutionException {
        /* Branches:
         * (parallelQueries) : true
         * (for-each(seeds)) : true
         * (i < futures.size()) : true
         * (future.isCancelled()) : false
         * (catch-exception (ExecutionException)) : true
         * (parallelQueries) : true
         * (addrs.size() == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<PeerDiscovery> peerDiscoveryList = new ArrayList<>();
        MultiplexingDiscovery target = spy(new MultiplexingDiscovery(BitcoinNetwork.REGTEST, peerDiscoveryList));
        //TODO: Needs to return real value
        doReturn(null).when(target).createExecutor();
        PeerDiscoveryException peerDiscoveryException = new PeerDiscoveryException("message1");
        thrown.expect(PeerDiscoveryException.class);
        thrown.expectMessage(peerDiscoveryException.getMessage());
        Duration duration = Duration.ofDays(0L);
        //Act Statement(s)
        target.getPeers(0L, duration);
        //Assert statement(s)
        verify(target).createExecutor();
    }

    //Sapient generated method id: ${a263ff40-06a2-368a-ab74-26894b1388f1}
    @Ignore(value = "Potential harmful system call (Future.isCancelled, Future.get, ExecutorService.invokeAll, ExecutorService.shutdownNow) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void getPeersWhenCaughtInterruptedExceptionThrowsPeerDiscoveryException() throws PeerDiscoveryException, InterruptedException, ExecutionException {
        /* Branches:
         * (parallelQueries) : true
         * (for-each(seeds)) : true
         * (i < futures.size()) : true
         * (future.isCancelled()) : false
         * (addrs.size() == 0) : false
         * (shufflePeers) : true
         * (catch-exception (InterruptedException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<PeerDiscovery> peerDiscoveryList = new ArrayList<>();
        MultiplexingDiscovery target = spy(new MultiplexingDiscovery(BitcoinNetwork.REGTEST, peerDiscoveryList));
        //TODO: Needs to return real value
        doReturn(null).when(target).createExecutor();
        thrown.expect(PeerDiscoveryException.class);
        Duration duration = Duration.ofDays(0L);
        //Act Statement(s)
        target.getPeers(0L, duration);
        //Assert statement(s)
        verify(target).createExecutor();
    }

    //Sapient generated method id: ${57e52633-2497-3d26-a12d-63324ebc60fe}
    @Ignore()
    @Test()
    public void createExecutorTest() {
        //Arrange Statement(s)
        List<PeerDiscovery> peerDiscoveryList = new ArrayList<>();
        peerDiscoveryList.add(peerDiscoveryMock);
        MultiplexingDiscovery target = new MultiplexingDiscovery(networkMock, peerDiscoveryList);
        //Act Statement(s)
        ExecutorService result = target.createExecutor();
        ContextPropagatingThreadFactory contextPropagatingThreadFactory = new ContextPropagatingThreadFactory("Multiplexing discovery");
        ExecutorService executorService = Executors.newFixedThreadPool(1, contextPropagatingThreadFactory);
        //Assert statement(s)
        //TODO: Please implement equals method in ExecutorService for verification to succeed or you need to adjust respective assertion statements
        assertThat(result, equalTo(executorService));
    }

    //Sapient generated method id: ${a73e8e99-f065-3aff-99c3-19a7c22917cd}
    @Test()
    public void shutdownWhenTpIsNull() {
        /* Branches:
         * (tp != null) : false
         */
        //Arrange Statement(s)
        List<PeerDiscovery> peerDiscoveryList = new ArrayList<>();
        MultiplexingDiscovery target = new MultiplexingDiscovery(BitcoinNetwork.REGTEST, peerDiscoveryList);
        //Act Statement(s)
        target.shutdown();
    }
}
