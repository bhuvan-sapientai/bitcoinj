package org.bitcoinj.net.discovery;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.mockito.InjectMocks;
import org.junit.After;
import org.junit.Test;
import org.junit.Ignore;

import java.util.concurrent.ExecutionException;

import org.junit.rules.ExpectedException;
import org.bitcoinj.base.Network;

import java.util.List;

import org.mockito.MockitoAnnotations;

import java.util.concurrent.Callable;
import java.time.Duration;

import org.bitcoinj.core.NetworkParameters;

import java.net.InetSocketAddress;
import java.util.ArrayList;

import org.bitcoinj.base.internal.Preconditions;
import org.bitcoinj.base.BitcoinNetwork;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.mockito.MockedStatic;

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

    private final ExecutorService vThreadPoolMock = mock(ExecutorService.class, "vThreadPool");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private MultiplexingDiscovery target;

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    @After()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${bf6499da-0a80-393c-ae42-5f5d2ea9d6f4}, hash: 7315930686ED809B9D0BC52C53B54721
    @Test()
    public void forServicesTest() {
        //Arrange Statement(s)
        MultiplexingDiscovery multiplexingDiscoveryMock = mock(MultiplexingDiscovery.class);
        Network networkMock = mock(Network.class);
        try (MockedStatic<MultiplexingDiscovery> multiplexingDiscovery = mockStatic(MultiplexingDiscovery.class, CALLS_REAL_METHODS)) {
            multiplexingDiscovery.when(() -> MultiplexingDiscovery.forServices(networkMock, 0L, true, true)).thenReturn(multiplexingDiscoveryMock);
            //Act Statement(s)
            MultiplexingDiscovery result = MultiplexingDiscovery.forServices(networkMock, 0L);
            //Assert statement(s)
            assertThat(result, equalTo(multiplexingDiscoveryMock));
            multiplexingDiscovery.verify(() -> MultiplexingDiscovery.forServices(networkMock, 0L, true, true), atLeast(1));
        }
    }

    //Sapient generated method id: ${898aacca-031f-3e9c-bf3d-68650c274db7}, hash: A6137F8E1696654D5A57CD7AE4001FC2
    @Test()
    public void forServices1WhenDefaultBranch() {
        /* Branches:
         * (dnsSeeds != null) : true
         * (for-each(dnsSeeds)) : true
         * (branch expression (line 123)) : false  #  inside <init> method
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.bitcoinj.net.discovery.DnsDiscovery$DnsSeedDiscovery
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        Network networkMock = mock(Network.class);
        NetworkParameters networkParametersMock2 = mock(NetworkParameters.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            String[] stringArray = new String[]{"return_of_getDnsSeedsItem1"};
            doReturn(stringArray).when(networkParametersMock).getDnsSeeds();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock).thenReturn(networkParametersMock2);
            //Act Statement(s)
            MultiplexingDiscovery result = MultiplexingDiscovery.forServices(networkMock, 0L, false, false);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(2));
            verify(networkParametersMock).getDnsSeeds();
        }
    }

    //Sapient generated method id: ${38163baf-b63c-3b9b-b185-05ec350b48a6}, hash: 11554BABB58D23645AC6E852E8DEF68A
    @Test()
    public void forServices1WhenDnsSeedsIsEmptyAndDefaultBranchThrowsIllegalArgumentException() {
        /* Branches:
         * (dnsSeeds != null) : true
         * (for-each(dnsSeeds)) : false
         * (branch expression (line 123)) : true  #  inside <init> method
         */
        //Arrange Statement(s)
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        Network networkMock = mock(Network.class);
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            String[] stringArray = new String[]{};
            doReturn(stringArray).when(networkParametersMock).getDnsSeeds();
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            MultiplexingDiscovery.forServices(networkMock, 0L, false, false);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(networkParametersMock).getDnsSeeds();
        }
    }

    //Sapient generated method id: ${a3d5d6ee-30fd-3760-8c05-1d94aced277c}, hash: CE475CCDF4EB6D31BD97108DF14FD02F
    @Test()
    public void forServices2Test() {
        //Arrange Statement(s)
        NetworkParameters paramsMock = mock(NetworkParameters.class);
        Network networkMock = mock(Network.class);
        MultiplexingDiscovery multiplexingDiscoveryMock = mock(MultiplexingDiscovery.class);
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

    //Sapient generated method id: ${aaaf9c80-1d2a-3386-bace-38f2052d5259}, hash: A7CE0B6154DB56550CD1623650DA634B
    @Test()
    public void forServices3Test() {
        //Arrange Statement(s)
        NetworkParameters paramsMock = mock(NetworkParameters.class);
        Network networkMock = mock(Network.class);
        MultiplexingDiscovery multiplexingDiscoveryMock = mock(MultiplexingDiscovery.class);
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

    //Sapient generated method id: ${51d29f99-c2a3-3857-ad64-2975622c153d}, hash: 8F41913BCB039CA30620E9D869F87DF0
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
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Future.isCancelled, ExecutorService.invokeAll) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<PeerDiscovery> peerDiscoveryList = new ArrayList<>();
        target = spy(new MultiplexingDiscovery(BitcoinNetwork.REGTEST, peerDiscoveryList));
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(vThreadPoolMock).when(target).createExecutor();
        PeerDiscoveryException peerDiscoveryException = new PeerDiscoveryException("message1");
        thrown.expect(PeerDiscoveryException.class);
        thrown.expectMessage(peerDiscoveryException.getMessage());
        Duration duration = Duration.ofDays(0L);
        //Act Statement(s)
        target.getPeers(0L, duration);
        //Assert statement(s)
        verify(target).createExecutor();
    }

    //Sapient generated method id: ${281eaeaf-48ef-3350-b942-88718ed432fd}, hash: A794FAC3A2F3ED3B9973F4A3C87878FF
    @Ignore(value = "Potential harmful system call (Future.isCancelled, Future.get, ExecutorService.shutdown, ExecutorService.invokeAll, ExecutorService.shutdownNow) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void getPeersWhenShufflePeers() throws PeerDiscoveryException, ExecutionException, InterruptedException {
        /* Branches:
         * (parallelQueries) : true
         * (for-each(seeds)) : true
         * (i < futures.size()) : true
         * (future.isCancelled()) : false
         * (addrs.size() == 0) : false
         * (shufflePeers) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Future.isCancelled, Future.get, ExecutorService.shutdown, ExecutorService.invokeAll, ExecutorService.shutdownNow) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<PeerDiscovery> peerDiscoveryList = new ArrayList<>();
        target = spy(new MultiplexingDiscovery(BitcoinNetwork.REGTEST, peerDiscoveryList));
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(vThreadPoolMock).when(target).createExecutor();
        Duration duration = Duration.ofDays(0L);
        //Act Statement(s)
        List<InetSocketAddress> result = target.getPeers(0L, duration);
        //Assert statement(s)
        assertThat(result.size(), equalTo(0));
        verify(target).createExecutor();
    }

    //Sapient generated method id: ${bedae1ab-56a9-386a-af42-c9a753de6250}, hash: 76E3FB73DA3A89729F33331C314D5AC3
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
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.of(BitcoinNetwork.REGTEST);
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.REGTEST)).thenReturn(networkParameters2);
            List<PeerDiscovery> peerDiscoveryList = new ArrayList<>();
            target = spy(new MultiplexingDiscovery(BitcoinNetwork.REGTEST, peerDiscoveryList));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(vThreadPoolMock).when(target).createExecutor();
            List<Future<List<InetSocketAddress>>> futureListInetSocketAddressList = new ArrayList<>();
            List<Callable<List<InetSocketAddress>>> callableListInetSocketAddressList = new ArrayList<>();
            doReturn(futureListInetSocketAddressList).when(vThreadPoolMock).invokeAll(callableListInetSocketAddressList, 0L, TimeUnit.MILLISECONDS);
            PeerDiscoveryException peerDiscoveryException = new PeerDiscoveryException("No peer discovery returned any results in 0 ms. Check internet connection?");
            thrown.expect(PeerDiscoveryException.class);
            thrown.expectMessage(peerDiscoveryException.getMessage());
            Duration duration = Duration.ofDays(0L);
            //Act Statement(s)
            target.getPeers(1L, duration);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.REGTEST), atLeast(1));
            verify(target).createExecutor();
            verify(vThreadPoolMock).invokeAll(callableListInetSocketAddressList, 0L, TimeUnit.MILLISECONDS);
        }
    }

    //Sapient generated method id: ${465ee7d3-758b-3ef4-b38b-1eb319998f3d}, hash: 399B06468173AAF93A39B56E35D82D0C
    @Test()
    public void getPeersWhenCaughtExecutionExceptionAndParallelQueriesAndAddrsSizeEquals0ThrowsPeerDiscoveryException() throws PeerDiscoveryException, InterruptedException {
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
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.of(BitcoinNetwork.REGTEST);
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.REGTEST)).thenReturn(networkParameters2);
            List<PeerDiscovery> peerDiscoveryList = new ArrayList<>();
            target = spy(new MultiplexingDiscovery(BitcoinNetwork.REGTEST, peerDiscoveryList));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(vThreadPoolMock).when(target).createExecutor();
            List<Future<List<InetSocketAddress>>> futureListInetSocketAddressList = new ArrayList<>();
            List<Callable<List<InetSocketAddress>>> callableListInetSocketAddressList = new ArrayList<>();
            doReturn(futureListInetSocketAddressList).when(vThreadPoolMock).invokeAll(callableListInetSocketAddressList, 0L, TimeUnit.MILLISECONDS);
            PeerDiscoveryException peerDiscoveryException = new PeerDiscoveryException("No peer discovery returned any results in 0 ms. Check internet connection?");
            thrown.expect(PeerDiscoveryException.class);
            thrown.expectMessage(peerDiscoveryException.getMessage());
            Duration duration = Duration.ofDays(0L);
            //Act Statement(s)
            target.getPeers(123456789L, duration);
            //Assert statement(s)
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.REGTEST), atLeast(1));
            verify(target).createExecutor();
            verify(vThreadPoolMock).invokeAll(callableListInetSocketAddressList, 0L, TimeUnit.MILLISECONDS);
        }
    }

    //Sapient generated method id: ${a263ff40-06a2-368a-ab74-26894b1388f1}, hash: B0AF80BD5F686E8461610B2D6136907E
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
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Future.isCancelled, Future.get, ExecutorService.invokeAll, ExecutorService.shutdownNow) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<PeerDiscovery> peerDiscoveryList = new ArrayList<>();
        target = spy(new MultiplexingDiscovery(BitcoinNetwork.REGTEST, peerDiscoveryList));
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(vThreadPoolMock).when(target).createExecutor();
        List<Future<List<InetSocketAddress>>> futureListInetSocketAddressList = new ArrayList<>();
        List<Callable<List<InetSocketAddress>>> callableListInetSocketAddressList = new ArrayList<>();
        callableListInetSocketAddressList.add(null);
        doReturn(futureListInetSocketAddressList).when(vThreadPoolMock).invokeAll(callableListInetSocketAddressList, 0L, TimeUnit.MILLISECONDS);
        thrown.expect(PeerDiscoveryException.class);
        Duration duration = Duration.ofDays(0L);
        //Act Statement(s)
        target.getPeers(0L, duration);
        //Assert statement(s)
        verify(target).createExecutor();
        verify(vThreadPoolMock).invokeAll(callableListInetSocketAddressList, 0L, TimeUnit.MILLISECONDS);
    }

    //Sapient generated method id: ${57e52633-2497-3d26-a12d-63324ebc60fe}, hash: 2A4429039D29A544198C2DE5EAC91ABE
    @Ignore()
    @Test()
    public void createExecutorTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            NetworkParameters networkParameters2 = NetworkParameters.of(BitcoinNetwork.REGTEST);
            networkParameters.when(() -> NetworkParameters.of(BitcoinNetwork.REGTEST)).thenReturn(networkParameters2);
            List<PeerDiscovery> peerDiscoveryList = new ArrayList<>();
            target = new MultiplexingDiscovery(BitcoinNetwork.REGTEST, peerDiscoveryList);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            ExecutorService result = target.createExecutor();
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            networkParameters.verify(() -> NetworkParameters.of(BitcoinNetwork.REGTEST), atLeast(1));
        }
    }

    //Sapient generated method id: ${a73e8e99-f065-3aff-99c3-19a7c22917cd}, hash: D7387FA20384A125CC25BF36B5A5071C
    @Test()
    public void shutdownWhenTpIsNull() {
        /* Branches:
         * (tp != null) : false
         */
        //Arrange Statement(s)
        List<PeerDiscovery> peerDiscoveryList = new ArrayList<>();
        target = new MultiplexingDiscovery(BitcoinNetwork.REGTEST, peerDiscoveryList);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        target.shutdown();
    }
}
