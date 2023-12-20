package org.bitcoinj.protocols.payments;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.mockito.InjectMocks;
import org.junit.After;
import org.junit.Test;

import java.net.URISyntaxException;

import com.google.protobuf.InvalidProtocolBufferException;

import java.io.FileNotFoundException;
import java.security.KeyStoreException;
import java.io.IOException;

import org.junit.rules.ExpectedException;

import java.util.List;

import org.bitcoinj.core.Transaction;
import org.bitcoinj.protobuf.payments.Protos;
import org.mockito.MockitoAnnotations;
import org.bitcoinj.params.BitcoinNetworkParams;
import org.bitcoinj.utils.ListenableCompletableFuture;
import org.bitcoinj.uri.BitcoinURI;

import java.util.Date;

import org.bitcoinj.base.Coin;

import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Optional;

import org.bitcoinj.base.Address;
import org.bitcoinj.base.internal.TimeUtils;
import org.bitcoinj.wallet.SendRequest;
import org.bitcoinj.base.BitcoinNetwork;
import com.google.protobuf.ByteString;

import java.net.URL;

import org.bitcoinj.crypto.TrustStoreLoader;
import org.mockito.MockedStatic;

import java.util.concurrent.CompletableFuture;

import org.bitcoinj.params.MainNetParams;

import java.time.Instant;

import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.containsInRelativeOrder;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

public class PaymentSessionSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Protos.PaymentDetails paymentDetailsMock = mock(Protos.PaymentDetails.class, "paymentDetails");

    private final BitcoinNetworkParams paramsMock = mock(BitcoinNetworkParams.class, "params");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private PaymentSession target;

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    @After()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${21a9d610-1142-33e9-bacd-86685e4cbd4a}
    @Test()
    public void createFromBitcoinUriTest() throws PaymentProtocolException, URISyntaxException {
        //Arrange Statement(s)
        //ListenableCompletableFuture<PaymentSession> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        //BitcoinURI bitcoinURIMock = mock(BitcoinURI.class);
        /*try (MockedStatic<PaymentSession> paymentSession = mockStatic(PaymentSession.class, CALLS_REAL_METHODS)) {
    paymentSession.when(() -> PaymentSession.createFromBitcoinUri(bitcoinURIMock, true, (TrustStoreLoader) null)).thenReturn(listenableCompletableFutureMock);
    //Act Statement(s)
    ListenableCompletableFuture<PaymentSession> result = PaymentSession.createFromBitcoinUri(bitcoinURIMock);
    //Assert statement(s)
    assertThat(result, equalTo(listenableCompletableFutureMock));
    paymentSession.verify(() -> PaymentSession.createFromBitcoinUri(bitcoinURIMock, true, (TrustStoreLoader) null), atLeast(1));
}*/
    }

    //Sapient generated method id: ${70feade1-ca5e-3d52-b7c0-632ee89e2b7b}
    @Test()
    public void createFromBitcoinUri1Test() throws PaymentProtocolException, URISyntaxException {
        //Arrange Statement(s)
        //ListenableCompletableFuture<PaymentSession> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        //BitcoinURI bitcoinURIMock = mock(BitcoinURI.class);
        /*try (MockedStatic<PaymentSession> paymentSession = mockStatic(PaymentSession.class, CALLS_REAL_METHODS)) {
    paymentSession.when(() -> PaymentSession.createFromBitcoinUri(bitcoinURIMock, false, (TrustStoreLoader) null)).thenReturn(listenableCompletableFutureMock);
    //Act Statement(s)
    ListenableCompletableFuture<PaymentSession> result = PaymentSession.createFromBitcoinUri(bitcoinURIMock, false);
    //Assert statement(s)
    assertThat(result, equalTo(listenableCompletableFutureMock));
    paymentSession.verify(() -> PaymentSession.createFromBitcoinUri(bitcoinURIMock, false, (TrustStoreLoader) null), atLeast(1));
}*/
    }

    //Sapient generated method id: ${58b05531-62cb-370d-88d1-f80781a705b0}
    @Test()
    public void createFromBitcoinUri2WhenUrlIsNullThrowsPaymentProtocolExceptionInvalidPaymentRequestURL() throws PaymentProtocolException {
        /* Branches:
         * (url == null) : true
         */
        //Arrange Statement(s)
        //BitcoinURI uriMock = mock(BitcoinURI.class, "createFromBitcoinUri_bitcoinURI1");
        //doReturn(null).when(uriMock).getPaymentRequestUrl();
        //thrown.expect(PaymentProtocolException.InvalidPaymentRequestURL.class);
        //TrustStoreLoader trustStoreLoaderMock = mock(TrustStoreLoader.class);
        //Act Statement(s)
        //PaymentSession.createFromBitcoinUri(uriMock, false, trustStoreLoaderMock);
        //Assert statement(s)
        //verify(uriMock).getPaymentRequestUrl();
    }

    //Sapient generated method id: ${eaa2318e-9079-36f2-af7e-3bcffcb576f9}
    @Test()
    public void createFromBitcoinUri2WhenUrlIsNotNull() throws PaymentProtocolException, URISyntaxException {
        /* Branches:
         * (url == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //BitcoinURI uriMock = mock(BitcoinURI.class);
        //ListenableCompletableFuture<PaymentSession> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        //TrustStoreLoader trustStoreLoaderMock = mock(TrustStoreLoader.class);
        /*try (MockedStatic<ListenableCompletableFuture> listenableCompletableFuture = mockStatic(ListenableCompletableFuture.class)) {
    doReturn("return_of_getPaymentRequestUrl1").when(uriMock).getPaymentRequestUrl();
    CompletableFuture<PaymentSession> completableFuture = new CompletableFuture<>();
    listenableCompletableFuture.when(() -> ListenableCompletableFuture.of(completableFuture)).thenReturn(listenableCompletableFutureMock);
    //Act Statement(s)
    ListenableCompletableFuture<PaymentSession> result = PaymentSession.createFromBitcoinUri(uriMock, false, trustStoreLoaderMock);
    //Assert statement(s)
    assertThat(result, equalTo(listenableCompletableFutureMock));
    verify(uriMock).getPaymentRequestUrl();
    listenableCompletableFuture.verify(() -> ListenableCompletableFuture.of(completableFuture), atLeast(1));
}*/
    }

    //Sapient generated method id: ${c2b166ba-b05a-347b-97e8-8c349564654b}
    @Test()
    public void createFromBitcoinUri2WhenCaughtURISyntaxExceptionThrowsPaymentProtocolExceptionInvalidPaymentRequestURL() throws PaymentProtocolException {
        /* Branches:
         * (url == null) : false
         * (catch-exception (URISyntaxException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitcoinURI uriMock = mock(BitcoinURI.class);
        ListenableCompletableFuture listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        TrustStoreLoader trustStoreLoaderMock = mock(TrustStoreLoader.class);
        try (MockedStatic<ListenableCompletableFuture> listenableCompletableFuture = mockStatic(ListenableCompletableFuture.class)) {
            doReturn("return_of_getPaymentRequestUrl1").when(uriMock).getPaymentRequestUrl();
            CompletableFuture<PaymentSession> completableFuture = new CompletableFuture<>();
            listenableCompletableFuture.when(() -> ListenableCompletableFuture.of(completableFuture)).thenReturn(listenableCompletableFutureMock);
            thrown.expect(PaymentProtocolException.InvalidPaymentRequestURL.class);
            //Act Statement(s)
            PaymentSession.createFromBitcoinUri(uriMock, false, trustStoreLoaderMock);
            //Assert statement(s)
            verify(uriMock).getPaymentRequestUrl();
            listenableCompletableFuture.verify(() -> ListenableCompletableFuture.of(completableFuture), atLeast(1));
        }
    }

    //Sapient generated method id: ${ce6126b2-85fc-308f-bbdb-97a791504bef}
    @Test()
    public void createFromUrlTest() throws PaymentProtocolException, URISyntaxException {
        //Arrange Statement(s)
        ListenableCompletableFuture<PaymentSession> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        try (MockedStatic<PaymentSession> paymentSession = mockStatic(PaymentSession.class, CALLS_REAL_METHODS)) {
            paymentSession.when(() -> PaymentSession.createFromUrl("url1", true, (TrustStoreLoader) null)).thenReturn(listenableCompletableFutureMock);
            //Act Statement(s)
            ListenableCompletableFuture<PaymentSession> result = PaymentSession.createFromUrl("url1");
            //Assert statement(s)
            assertThat(result, equalTo(listenableCompletableFutureMock));
            paymentSession.verify(() -> PaymentSession.createFromUrl("url1", true, (TrustStoreLoader) null), atLeast(1));
        }
    }

    //Sapient generated method id: ${1933f8d5-1b54-33d0-8ea9-ce91b85749b5}
    @Test()
    public void createFromUrl1Test() throws PaymentProtocolException, URISyntaxException {
        //Arrange Statement(s)
        //ListenableCompletableFuture<PaymentSession> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        /*try (MockedStatic<PaymentSession> paymentSession = mockStatic(PaymentSession.class, CALLS_REAL_METHODS)) {
    paymentSession.when(() -> PaymentSession.createFromUrl("url1", false, (TrustStoreLoader) null)).thenReturn(listenableCompletableFutureMock);
    //Act Statement(s)
    ListenableCompletableFuture<PaymentSession> result = PaymentSession.createFromUrl("url1", false);
    //Assert statement(s)
    assertThat(result, equalTo(listenableCompletableFutureMock));
    paymentSession.verify(() -> PaymentSession.createFromUrl("url1", false, (TrustStoreLoader) null), atLeast(1));
}*/
    }

    //Sapient generated method id: ${ba5dbdec-2330-371e-8776-d1496383e459}
    @Test()
    public void createFromUrl2WhenUrlIsNullThrowsPaymentProtocolExceptionInvalidPaymentRequestURL() throws PaymentProtocolException {
        /* Branches:
         * (url == null) : true
         */
        //Arrange Statement(s)
        thrown.expect(PaymentProtocolException.InvalidPaymentRequestURL.class);
        TrustStoreLoader trustStoreLoaderMock = mock(TrustStoreLoader.class);
        //Act Statement(s)
        PaymentSession.createFromUrl((String) null, false, trustStoreLoaderMock);
    }

    //Sapient generated method id: ${a76c01da-8846-33b5-ae32-615e74c1d904}
    @Test()
    public void createFromUrl2WhenUrlIsNotNull() throws PaymentProtocolException, URISyntaxException {
        /* Branches:
         * (url == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //ListenableCompletableFuture<PaymentSession> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        //TrustStoreLoader trustStoreLoaderMock = mock(TrustStoreLoader.class);
        /*try (MockedStatic<ListenableCompletableFuture> listenableCompletableFuture = mockStatic(ListenableCompletableFuture.class)) {
    CompletableFuture<PaymentSession> completableFuture = new CompletableFuture<>();
    listenableCompletableFuture.when(() -> ListenableCompletableFuture.of(completableFuture)).thenReturn(listenableCompletableFutureMock);
    //Act Statement(s)
    ListenableCompletableFuture<PaymentSession> result = PaymentSession.createFromUrl("url1", false, trustStoreLoaderMock);
    //Assert statement(s)
    assertThat(result, equalTo(listenableCompletableFutureMock));
    listenableCompletableFuture.verify(() -> ListenableCompletableFuture.of(completableFuture), atLeast(1));
}*/
    }

    //Sapient generated method id: ${4cc14021-3391-334c-a091-aeba3194a876}
    @Test()
    public void createFromUrl2WhenCaughtURISyntaxExceptionThrowsPaymentProtocolExceptionInvalidPaymentRequestURL() throws PaymentProtocolException {
        /* Branches:
         * (url == null) : false
         * (catch-exception (URISyntaxException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //ListenableCompletableFuture listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        //TrustStoreLoader trustStoreLoaderMock = mock(TrustStoreLoader.class);
        /*try (MockedStatic<ListenableCompletableFuture> listenableCompletableFuture = mockStatic(ListenableCompletableFuture.class)) {
    CompletableFuture<PaymentSession> completableFuture = new CompletableFuture<>();
    listenableCompletableFuture.when(() -> ListenableCompletableFuture.of(completableFuture)).thenReturn(listenableCompletableFutureMock);
    thrown.expect(PaymentProtocolException.InvalidPaymentRequestURL.class);
    //Act Statement(s)
    PaymentSession.createFromUrl("url1", false, trustStoreLoaderMock);
    //Assert statement(s)
    listenableCompletableFuture.verify(() -> ListenableCompletableFuture.of(completableFuture), atLeast(1));
}*/
    }

    //Sapient generated method id: ${d2082401-9468-39f9-abf0-0d99df1ebb04}
    @Test()
    public void getOutputsWhenOutputHasAmount() throws InvalidProtocolBufferException, FileNotFoundException, KeyStoreException, PaymentProtocolException {
        /* Branches:
         * (for-each(paymentDetails.getOutputsList())) : true
         * (output.hasAmount()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //Protos.PaymentRequest requestMock = mock(Protos.PaymentRequest.class);
        //ByteString byteStringMock = mock(ByteString.class);
        //Protos.PaymentDetails.Builder protosPaymentDetailsBuilderMock = mock(Protos.PaymentDetails.Builder.class);
        //Protos.PaymentDetails.Builder protosPaymentDetailsBuilderMock2 = mock(Protos.PaymentDetails.Builder.class);
        //PaymentProtocol.PkiVerificationData paymentProtocolPkiVerificationDataMock = mock(PaymentProtocol.PkiVerificationData.class);
        /*try (MockedStatic<PaymentProtocol> paymentProtocol = mockStatic(PaymentProtocol.class);
    MockedStatic<Protos.PaymentDetails> protosPaymentDetails = mockStatic(Protos.PaymentDetails.class)) {
    doReturn(1).when(requestMock).getPaymentDetailsVersion();
    doReturn(true).when(requestMock).hasSerializedPaymentDetails();
    doReturn(byteStringMock).when(requestMock).getSerializedPaymentDetails();
    protosPaymentDetails.when(() -> Protos.PaymentDetails.newBuilder()).thenReturn(protosPaymentDetailsBuilderMock);
    doReturn(protosPaymentDetailsBuilderMock2).when(protosPaymentDetailsBuilderMock).mergeFrom(byteStringMock);
    doReturn(paymentDetailsMock).when(protosPaymentDetailsBuilderMock2).build();
    paymentProtocol.when(() -> PaymentProtocol.paramsFromPmtProtocolID("return_of_getNetwork1")).thenReturn(paramsMock);
    paymentProtocol.when(() -> PaymentProtocol.verifyPaymentRequestPki(eq(requestMock), (KeyStore) any())).thenReturn(paymentProtocolPkiVerificationDataMock);
    target = new PaymentSession(requestMock, true, (TrustStoreLoader) null);
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    doReturn(true).when(paymentDetailsMock).hasNetwork();
    doReturn("return_of_getNetwork1").when(paymentDetailsMock).getNetwork();
    List<Protos.Output> protosOutputList = new ArrayList<>();
    doReturn(BitcoinNetwork.MAINNET).when(paramsMock).network();
    doReturn(1, 0).when(paymentDetailsMock).getOutputsCount();
    Protos.Output output = Protos.Output.getDefaultInstance();
    List<Protos.Output> protosOutputList2 = new ArrayList<>();
    protosOutputList2.add(output);
    doReturn(protosOutputList, protosOutputList2).when(paymentDetailsMock).getOutputsList();
    //Act Statement(s)
    List<PaymentProtocol.Output> result = target.getOutputs();
    byte[] byteArray = new byte[] {};
    PaymentProtocol.Output paymentProtocolOutput = new PaymentProtocol.Output((Coin) null, byteArray);
    List<PaymentProtocol.Output> paymentProtocolOutputResultList = new ArrayList<>(0);
    paymentProtocolOutputResultList.add(paymentProtocolOutput);
    //Assert statement(s)
    assertThat(result.size(), equalTo(paymentProtocolOutputResultList.size()));
    //TODO: Please implement equals method in PaymentProtocol.Output for verification to succeed or you need to adjust respective assertion statements
    assertThat(result, containsInRelativeOrder(paymentProtocolOutputResultList.toArray()));
    verify(requestMock).getPaymentDetailsVersion();
    verify(requestMock).hasSerializedPaymentDetails();
    verify(requestMock).getSerializedPaymentDetails();
    protosPaymentDetails.verify(() -> Protos.PaymentDetails.newBuilder(), atLeast(1));
    verify(protosPaymentDetailsBuilderMock).mergeFrom(byteStringMock);
    verify(protosPaymentDetailsBuilderMock2).build();
    paymentProtocol.verify(() -> PaymentProtocol.paramsFromPmtProtocolID("return_of_getNetwork1"), atLeast(1));
    paymentProtocol.verify(() -> PaymentProtocol.verifyPaymentRequestPki(eq(requestMock), (KeyStore) any()));
    verify(paymentDetailsMock).hasNetwork();
    verify(paymentDetailsMock).getNetwork();
    verify(paymentDetailsMock, times(2)).getOutputsCount();
    verify(paymentDetailsMock, times(2)).getOutputsList();
    verify(paramsMock).network();
}*/
    }

    //Sapient generated method id: ${c82bf0a8-32b6-387a-89ed-588eaa3e041a}
    @Test()
    public void getOutputsWhenOutputNotHasAmount() throws PaymentProtocolException {
        /* Branches:
         * (for-each(paymentDetails.getOutputsList())) : true
         * (output.hasAmount()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //Protos.PaymentRequest paymentRequest = Protos.PaymentRequest.getDefaultInstance();
        //TrustStoreLoader trustStoreLoaderMock = mock(TrustStoreLoader.class);
        //target = new PaymentSession(paymentRequest, false, trustStoreLoaderMock);
        //autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Protos.PaymentDetails paymentDetailsMock2 = mock(Protos.PaymentDetails.class);
        //doReturn(0).when(paymentDetailsMock2).getOutputsCount();
        //Protos.Output output = Protos.Output.getDefaultInstance();
        //List<Protos.Output> protosOutputList = new ArrayList<>();
        //protosOutputList.add(output);
        //doReturn(protosOutputList).when(paymentDetailsMock2).getOutputsList();
        //Act Statement(s)
        //List<PaymentProtocol.Output> result = target.getOutputs();
        //byte[] byteArray = new byte[] {};
        //PaymentProtocol.Output paymentProtocolOutput = new PaymentProtocol.Output((Coin) null, byteArray);
        //List<PaymentProtocol.Output> paymentProtocolOutputResultList = new ArrayList<>(0);
        //paymentProtocolOutputResultList.add(paymentProtocolOutput);
        //Assert statement(s)
        //assertThat(result.size(), equalTo(paymentProtocolOutputResultList.size()));
        //TODO: Please implement equals method in PaymentProtocol.Output for verification to succeed or you need to adjust respective assertion statements
        //assertThat(result, containsInRelativeOrder(paymentProtocolOutputResultList.toArray()));
        //verify(paymentDetailsMock2).getOutputsCount();
        //verify(paymentDetailsMock2).getOutputsList();
    }

    //Sapient generated method id: ${c35b3640-8b1c-3b99-ae2a-582891843e3b}
    @Test()
    public void getMemoWhenPaymentDetailsHasMemo() throws PaymentProtocolException {
        /* Branches:
         * (paymentDetails.hasMemo()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //Protos.PaymentRequest paymentRequest = Protos.PaymentRequest.getDefaultInstance();
        //TrustStoreLoader trustStoreLoaderMock = mock(TrustStoreLoader.class);
        //target = new PaymentSession(paymentRequest, true, trustStoreLoaderMock);
        //autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Protos.PaymentDetails paymentDetailsMock2 = mock(Protos.PaymentDetails.class);
        //doReturn(false).when(paymentDetailsMock2).hasMemo();
        //Act Statement(s)
        //String result = target.getMemo();
        //Assert statement(s)
        //assertThat(result, is(nullValue()));
        //verify(paymentDetailsMock2).hasMemo();
    }

    //Sapient generated method id: ${1659e20e-cd61-3ee3-8e34-38ba781dbdbd}
    @Test()
    public void getMemoWhenPaymentDetailsNotHasMemo() throws PaymentProtocolException {
        /* Branches:
         * (paymentDetails.hasMemo()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //Protos.PaymentRequest paymentRequest = Protos.PaymentRequest.getDefaultInstance();
        //TrustStoreLoader trustStoreLoaderMock = mock(TrustStoreLoader.class);
        //target = new PaymentSession(paymentRequest, true, trustStoreLoaderMock);
        //autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Protos.PaymentDetails paymentDetailsMock2 = mock(Protos.PaymentDetails.class);
        //doReturn(false).when(paymentDetailsMock2).hasMemo();
        //Act Statement(s)
        //String result = target.getMemo();
        //Assert statement(s)
        //assertThat(result, is(nullValue()));
        //verify(paymentDetailsMock2).hasMemo();
    }

    //Sapient generated method id: ${042a07c6-415f-3feb-9b50-b06f1fcd4b38}
    @Test()
    public void timeTest() throws PaymentProtocolException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Protos.PaymentRequest paymentRequest = Protos.PaymentRequest.getDefaultInstance();
        TrustStoreLoader trustStoreLoaderMock = mock(TrustStoreLoader.class);
        target = new PaymentSession(paymentRequest, true, trustStoreLoaderMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Protos.PaymentDetails paymentDetailsMock2 = mock(Protos.PaymentDetails.class);
        doReturn(0L).when(paymentDetailsMock2).getTime();
        //Act Statement(s)
        Instant result = target.time();
        Instant instant = Instant.ofEpochSecond(0L);
        //Assert statement(s)
        assertThat(result, equalTo(instant));
        verify(paymentDetailsMock2).getTime();
    }

    //Sapient generated method id: ${32a264d3-e4bd-353f-a2bf-fe1cf1c16d84}
    @Test()
    public void getDateTest() throws PaymentProtocolException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //Protos.PaymentRequest paymentRequest = Protos.PaymentRequest.getDefaultInstance();
        //TrustStoreLoader trustStoreLoaderMock = mock(TrustStoreLoader.class);
        //target = new PaymentSession(paymentRequest, false, trustStoreLoaderMock);
        //autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Protos.PaymentDetails paymentDetailsMock2 = mock(Protos.PaymentDetails.class);
        //doReturn(1L).when(paymentDetailsMock2).getTime();
        //Act Statement(s)
        //Date result = target.getDate();
        //Date date = new Date();
        //Assert statement(s)
        //assertThat(result, equalTo(date));
        //verify(paymentDetailsMock2).getTime();
    }

    //Sapient generated method id: ${49cad766-1ae4-3a20-9843-309c4205e5e0}
    @Test()
    public void expiresWhenPaymentDetailsHasExpires() throws PaymentProtocolException {
        /* Branches:
         * (paymentDetails.hasExpires()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //Protos.PaymentRequest paymentRequest = Protos.PaymentRequest.getDefaultInstance();
        //TrustStoreLoader trustStoreLoaderMock = mock(TrustStoreLoader.class);
        //target = new PaymentSession(paymentRequest, true, trustStoreLoaderMock);
        //autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Protos.PaymentDetails paymentDetailsMock2 = mock(Protos.PaymentDetails.class);
        //doReturn(false).when(paymentDetailsMock2).hasExpires();
        //Act Statement(s)
        //Optional<Instant> result = target.expires();
        //Optional<Instant> instantOptional = Optional.empty();
        //Assert statement(s)
        //assertThat(result, equalTo(instantOptional));
        //verify(paymentDetailsMock2).hasExpires();
    }

    //Sapient generated method id: ${09bd9b1a-6122-3513-81fe-00c0d2fc317d}
    @Test()
    public void expiresWhenPaymentDetailsNotHasExpires() throws InvalidProtocolBufferException, FileNotFoundException, KeyStoreException, PaymentProtocolException {
        /* Branches:
         * (paymentDetails.hasExpires()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //Protos.PaymentRequest requestMock = mock(Protos.PaymentRequest.class);
        //ByteString byteStringMock = mock(ByteString.class);
        //TrustStoreLoader nonNullTrustStoreLoaderMock = mock(TrustStoreLoader.class);
        //Protos.PaymentDetails.Builder protosPaymentDetailsBuilderMock = mock(Protos.PaymentDetails.Builder.class);
        //Protos.PaymentDetails.Builder protosPaymentDetailsBuilderMock2 = mock(Protos.PaymentDetails.Builder.class);
        //Protos.PaymentDetails protosPaymentDetailsMock = mock(Protos.PaymentDetails.class);
        //PaymentProtocol.PkiVerificationData paymentProtocolPkiVerificationDataMock = mock(PaymentProtocol.PkiVerificationData.class);
        //Protos.Output outputMock = mock(Protos.Output.class);
        /*try (MockedStatic<PaymentProtocol> paymentProtocol = mockStatic(PaymentProtocol.class);
    MockedStatic<MainNetParams> mainNetParams = mockStatic(MainNetParams.class);
    MockedStatic<Protos.PaymentDetails> protosPaymentDetails = mockStatic(Protos.PaymentDetails.class)) {
    doReturn(1).when(requestMock).getPaymentDetailsVersion();
    doReturn(true).when(requestMock).hasSerializedPaymentDetails();
    doReturn(byteStringMock).when(requestMock).getSerializedPaymentDetails();
    //TODO: Needs to return real value
    doReturn(null).when(nonNullTrustStoreLoaderMock).getKeyStore();
    protosPaymentDetails.when(() -> Protos.PaymentDetails.newBuilder()).thenReturn(protosPaymentDetailsBuilderMock);
    doReturn(protosPaymentDetailsBuilderMock2).when(protosPaymentDetailsBuilderMock).mergeFrom(byteStringMock);
    doReturn(protosPaymentDetailsMock).when(protosPaymentDetailsBuilderMock2).build();
    MainNetParams mainNetParams2 = MainNetParams.get();
    mainNetParams.when(() -> MainNetParams.get()).thenReturn(mainNetParams2);
    paymentProtocol.when(() -> PaymentProtocol.verifyPaymentRequestPki(requestMock, (KeyStore) null)).thenReturn(paymentProtocolPkiVerificationDataMock);
    target = new PaymentSession(requestMock, true, nonNullTrustStoreLoaderMock);
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    doReturn(false).when(protosPaymentDetailsMock).hasNetwork();
    doReturn(1).when(protosPaymentDetailsMock).getOutputsCount();
    List<Protos.Output> protosOutputList = new ArrayList<>();
    protosOutputList.add(outputMock);
    doReturn(protosOutputList).when(protosPaymentDetailsMock).getOutputsList();
    doReturn(true).when(outputMock).hasAmount();
    doReturn(0L).when(outputMock).getAmount();
    doReturn(false).when(protosPaymentDetailsMock).hasExpires();
    //Act Statement(s)
    Optional<Instant> result = target.expires();
    Optional<Instant> instantOptional = Optional.empty();
    //Assert statement(s)
    assertThat(result, equalTo(instantOptional));
    verify(requestMock).getPaymentDetailsVersion();
    verify(requestMock).hasSerializedPaymentDetails();
    verify(requestMock).getSerializedPaymentDetails();
    verify(nonNullTrustStoreLoaderMock).getKeyStore();
    protosPaymentDetails.verify(() -> Protos.PaymentDetails.newBuilder(), atLeast(1));
    verify(protosPaymentDetailsBuilderMock).mergeFrom(byteStringMock);
    verify(protosPaymentDetailsBuilderMock2).build();
    mainNetParams.verify(() -> MainNetParams.get(), atLeast(1));
    paymentProtocol.verify(() -> PaymentProtocol.verifyPaymentRequestPki(requestMock, (KeyStore) null), atLeast(1));
    verify(protosPaymentDetailsMock).hasNetwork();
    verify(protosPaymentDetailsMock).getOutputsCount();
    verify(protosPaymentDetailsMock).getOutputsList();
    verify(outputMock).hasAmount();
    verify(outputMock).getAmount();
    verify(protosPaymentDetailsMock).hasExpires();
}*/
    }

    //Sapient generated method id: ${b59526a4-3e3d-333a-98ad-bf2a33c3b484}
    @Test()
    public void getExpiresTest() throws PaymentProtocolException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //Protos.PaymentRequest paymentRequest = Protos.PaymentRequest.getDefaultInstance();
        //TrustStoreLoader trustStoreLoaderMock = mock(TrustStoreLoader.class);
        //target = spy(new PaymentSession(paymentRequest, false, trustStoreLoaderMock));
        //autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Instant instant = Instant.now();
        //doReturn(Optional.of(instant)).when(target).expires();
        //Act Statement(s)
        //Date result = target.getExpires();
        //Date date = new Date();
        //Assert statement(s)
        //assertThat(result, equalTo(date));
        //verify(target).expires();
    }

    //Sapient generated method id: ${17995948-c48b-3508-848e-559f0c32880c}
    @Test()
    public void isExpiredWhenExpiresMapTimeUtilsCurrentTimeIsAfterTimeOrElseFalse() throws InvalidProtocolBufferException, FileNotFoundException, KeyStoreException, PaymentProtocolException {
        /* Branches:
         * (expires().map(time -> TimeUtils.currentTime().isAfter(time)).orElse(false)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //Protos.PaymentRequest requestMock = mock(Protos.PaymentRequest.class);
        //ByteString byteStringMock = mock(ByteString.class);
        //Protos.PaymentDetails.Builder protosPaymentDetailsBuilderMock = mock(Protos.PaymentDetails.Builder.class);
        //Protos.PaymentDetails.Builder protosPaymentDetailsBuilderMock2 = mock(Protos.PaymentDetails.Builder.class);
        //Protos.PaymentDetails protosPaymentDetailsMock = mock(Protos.PaymentDetails.class);
        //BitcoinNetworkParams bitcoinNetworkParamsMock = mock(BitcoinNetworkParams.class);
        //PaymentProtocol.PkiVerificationData paymentProtocolPkiVerificationDataMock = mock(PaymentProtocol.PkiVerificationData.class);
        /*try (MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class);
    MockedStatic<PaymentProtocol> paymentProtocol = mockStatic(PaymentProtocol.class);
    MockedStatic<Protos.PaymentDetails> protosPaymentDetails = mockStatic(Protos.PaymentDetails.class)) {
    doReturn(0).when(requestMock).getPaymentDetailsVersion();
    doReturn(false).when(requestMock).hasSerializedPaymentDetails();
    doReturn(byteStringMock).when(requestMock).getSerializedPaymentDetails();
    protosPaymentDetails.when(() -> Protos.PaymentDetails.newBuilder()).thenReturn(protosPaymentDetailsBuilderMock);
    doReturn(protosPaymentDetailsBuilderMock2).when(protosPaymentDetailsBuilderMock).mergeFrom(byteStringMock);
    doReturn(protosPaymentDetailsMock).when(protosPaymentDetailsBuilderMock2).build();
    paymentProtocol.when(() -> PaymentProtocol.paramsFromPmtProtocolID("return_of_getNetwork1")).thenReturn(bitcoinNetworkParamsMock);
    paymentProtocol.when(() -> PaymentProtocol.verifyPaymentRequestPki(requestMock, (KeyStore) null)).thenReturn(paymentProtocolPkiVerificationDataMock);
    Instant instant = TimeUtils.currentTime();
    timeUtils.when(() -> TimeUtils.currentTime()).thenReturn(instant);
    target = spy(new PaymentSession(requestMock, false, (TrustStoreLoader) null));
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    doReturn(false).when(protosPaymentDetailsMock).hasNetwork();
    doReturn("return_of_getNetwork1").when(protosPaymentDetailsMock).getNetwork();
    doReturn(0).when(protosPaymentDetailsMock).getOutputsCount();
    List<Protos.Output> protosOutputList = new ArrayList<>();
    doReturn(protosOutputList).when(protosPaymentDetailsMock).getOutputsList();
    doReturn(BitcoinNetwork.MAINNET).when(bitcoinNetworkParamsMock).network();
    Instant instant2 = Instant.now();
    doReturn(Optional.of(instant2)).when(target).expires();
    //Act Statement(s)
    boolean result = target.isExpired();
    //Assert statement(s)
    assertThat(result, equalTo(Boolean.TRUE));
    verify(requestMock).getPaymentDetailsVersion();
    verify(requestMock).hasSerializedPaymentDetails();
    verify(requestMock).getSerializedPaymentDetails();
    protosPaymentDetails.verify(() -> Protos.PaymentDetails.newBuilder(), atLeast(1));
    verify(protosPaymentDetailsBuilderMock).mergeFrom(byteStringMock);
    verify(protosPaymentDetailsBuilderMock2).build();
    paymentProtocol.verify(() -> PaymentProtocol.paramsFromPmtProtocolID("return_of_getNetwork1"), atLeast(1));
    paymentProtocol.verify(() -> PaymentProtocol.verifyPaymentRequestPki(requestMock, (KeyStore) null), atLeast(1));
    timeUtils.verify(() -> TimeUtils.currentTime(), atLeast(1));
    verify(protosPaymentDetailsMock).hasNetwork();
    verify(protosPaymentDetailsMock).getNetwork();
    verify(protosPaymentDetailsMock).getOutputsCount();
    verify(protosPaymentDetailsMock).getOutputsList();
    verify(bitcoinNetworkParamsMock).network();
    verify(target).expires();
}*/
    }

    //Sapient generated method id: ${9d0e3047-98b8-3eb0-9f2f-154bf4b1fe26}
    @Test()
    public void isExpiredWhenExpiresMapTimeUtilsCurrentTimeIsAfterTimeNotOrElseFalse() throws PaymentProtocolException {
        /* Branches:
         * (expires().map(time -> TimeUtils.currentTime().isAfter(time)).orElse(false)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TrustStoreLoader trustStoreLoaderMock = mock(TrustStoreLoader.class);
        /*try (MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class)) {
    //TODO: Needs to return real value
    timeUtils.when(() -> TimeUtils.currentTime()).thenReturn(null);
    Protos.PaymentRequest paymentRequest = Protos.PaymentRequest.getDefaultInstance();
    target = spy(new PaymentSession(paymentRequest, true, trustStoreLoaderMock));
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    Instant instant = Instant.now();
    doReturn(Optional.of(instant)).when(target).expires();
    thrown.expect(NullPointerException.class);
    //Act Statement(s)
    target.isExpired();
    //Assert statement(s)
    timeUtils.verify(() -> TimeUtils.currentTime(), atLeast(1));
    verify(target).expires();
}*/
    }

    //Sapient generated method id: ${d05d52b3-90c7-3f41-8757-f1b20c8392e7}
    @Test()
    public void getPaymentUrlWhenPaymentDetailsHasPaymentUrl() throws PaymentProtocolException {
        /* Branches:
         * (paymentDetails.hasPaymentUrl()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //Protos.PaymentRequest paymentRequest = Protos.PaymentRequest.getDefaultInstance();
        //TrustStoreLoader trustStoreLoaderMock = mock(TrustStoreLoader.class);
        //target = new PaymentSession(paymentRequest, true, trustStoreLoaderMock);
        //autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Protos.PaymentDetails paymentDetailsMock2 = mock(Protos.PaymentDetails.class);
        //doReturn(false).when(paymentDetailsMock2).hasPaymentUrl();
        //Act Statement(s)
        //String result = target.getPaymentUrl();
        //Assert statement(s)
        //assertThat(result, is(nullValue()));
        //verify(paymentDetailsMock2).hasPaymentUrl();
    }

    //Sapient generated method id: ${c1c60ade-30ae-32fc-8306-294b6bd2cf93}
    @Test()
    public void getPaymentUrlWhenPaymentDetailsNotHasPaymentUrl() throws PaymentProtocolException {
        /* Branches:
         * (paymentDetails.hasPaymentUrl()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //Protos.PaymentRequest paymentRequest = Protos.PaymentRequest.getDefaultInstance();
        //TrustStoreLoader trustStoreLoaderMock = mock(TrustStoreLoader.class);
        //target = new PaymentSession(paymentRequest, false, trustStoreLoaderMock);
        //autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Protos.PaymentDetails paymentDetailsMock2 = mock(Protos.PaymentDetails.class);
        //doReturn(false).when(paymentDetailsMock2).hasPaymentUrl();
        //Act Statement(s)
        //String result = target.getPaymentUrl();
        //Assert statement(s)
        //assertThat(result, is(nullValue()));
        //verify(paymentDetailsMock2).hasPaymentUrl();
    }

    //Sapient generated method id: ${f10f1d54-4f47-3aa1-9eff-55b655a06e3a}
    @Test()
    public void getMerchantDataWhenPaymentDetailsHasMerchantData() throws PaymentProtocolException {
        /* Branches:
         * (paymentDetails.hasMerchantData()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //Protos.PaymentRequest paymentRequest = Protos.PaymentRequest.getDefaultInstance();
        //TrustStoreLoader trustStoreLoaderMock = mock(TrustStoreLoader.class);
        //target = new PaymentSession(paymentRequest, false, trustStoreLoaderMock);
        //autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Protos.PaymentDetails paymentDetailsMock2 = mock(Protos.PaymentDetails.class);
        //doReturn(false).when(paymentDetailsMock2).hasMerchantData();
        //Act Statement(s)
        //byte[] result = target.getMerchantData();
        //Assert statement(s)
        //assertThat(result, is(nullValue()));
        //verify(paymentDetailsMock2).hasMerchantData();
    }

    //Sapient generated method id: ${3291c934-55d8-377b-8a08-c01a1cdd650b}
    @Test()
    public void getMerchantDataWhenPaymentDetailsNotHasMerchantData() throws PaymentProtocolException {
        /* Branches:
         * (paymentDetails.hasMerchantData()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Protos.PaymentRequest paymentRequest = Protos.PaymentRequest.getDefaultInstance();
        TrustStoreLoader trustStoreLoaderMock = mock(TrustStoreLoader.class);
        target = new PaymentSession(paymentRequest, false, trustStoreLoaderMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Protos.PaymentDetails paymentDetailsMock2 = mock(Protos.PaymentDetails.class);
        doReturn(false).when(paymentDetailsMock2).hasMerchantData();
        //Act Statement(s)
        byte[] result = target.getMerchantData();
        //Assert statement(s)
        assertThat(result, is(nullValue()));
        verify(paymentDetailsMock2).hasMerchantData();
    }

    //Sapient generated method id: ${5946532e-1e5a-32ac-b1a1-0b6f757bb020}
    @Test()
    public void getSendRequestWhenPaymentDetailsGetOutputsListIsNotEmpty() throws InvalidProtocolBufferException, FileNotFoundException, KeyStoreException, PaymentProtocolException {
        /* Branches:
         * (for-each(paymentDetails.getOutputsList())) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: tx
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Protos.PaymentRequest requestMock = mock(Protos.PaymentRequest.class);
        ByteString byteStringMock = mock(ByteString.class);
        Protos.PaymentDetails.Builder protosPaymentDetailsBuilderMock = mock(Protos.PaymentDetails.Builder.class);
        Protos.PaymentDetails.Builder protosPaymentDetailsBuilderMock2 = mock(Protos.PaymentDetails.Builder.class);
        Protos.PaymentDetails protosPaymentDetailsMock = mock(Protos.PaymentDetails.class);
        BitcoinNetworkParams bitcoinNetworkParamsMock = mock(BitcoinNetworkParams.class);
        PaymentProtocol.PkiVerificationData paymentProtocolPkiVerificationDataMock = mock(PaymentProtocol.PkiVerificationData.class);
        SendRequest sendRequestMock = mock(SendRequest.class);
        SendRequest sendRequestMock2 = mock(SendRequest.class);
        try (MockedStatic<SendRequest> sendRequest = mockStatic(SendRequest.class);
             MockedStatic<Coin> coin = mockStatic(Coin.class);
             MockedStatic<PaymentProtocol> paymentProtocol = mockStatic(PaymentProtocol.class);
             MockedStatic<Protos.PaymentDetails> protosPaymentDetails = mockStatic(Protos.PaymentDetails.class)) {
            doReturn(1).when(requestMock).getPaymentDetailsVersion();
            doReturn(true).when(requestMock).hasSerializedPaymentDetails();
            doReturn(byteStringMock).when(requestMock).getSerializedPaymentDetails();
            protosPaymentDetails.when(() -> Protos.PaymentDetails.newBuilder()).thenReturn(protosPaymentDetailsBuilderMock);
            doReturn(protosPaymentDetailsBuilderMock2).when(protosPaymentDetailsBuilderMock).mergeFrom(byteStringMock);
            doReturn(protosPaymentDetailsMock).when(protosPaymentDetailsBuilderMock2).build();
            paymentProtocol.when(() -> PaymentProtocol.paramsFromPmtProtocolID("return_of_getNetwork1")).thenReturn(bitcoinNetworkParamsMock);
            paymentProtocol.when(() -> PaymentProtocol.verifyPaymentRequestPki(requestMock, (KeyStore) null)).thenReturn(paymentProtocolPkiVerificationDataMock);
            Coin coin2 = Coin.valueOf(0L);
            coin.when(() -> Coin.valueOf(0L)).thenReturn(coin2);
            sendRequest.when(() -> SendRequest.forTx((Transaction) any())).thenReturn(sendRequestMock);
            doReturn(sendRequestMock2).when(sendRequestMock).fromPaymentDetails(protosPaymentDetailsMock);
            target = new PaymentSession(requestMock, true, (TrustStoreLoader) null);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(true).when(protosPaymentDetailsMock).hasNetwork();
            doReturn("return_of_getNetwork1").when(protosPaymentDetailsMock).getNetwork();
            doReturn(1).when(protosPaymentDetailsMock).getOutputsCount();
            List<Protos.Output> protosOutputList = new ArrayList<>();
            doReturn(BitcoinNetwork.MAINNET).when(bitcoinNetworkParamsMock).network();
            Protos.Output output = Protos.Output.getDefaultInstance();
            List<Protos.Output> protosOutputList2 = new ArrayList<>();
            protosOutputList2.add(output);
            doReturn(protosOutputList, protosOutputList2).when(protosPaymentDetailsMock).getOutputsList();
            //Act Statement(s)
            SendRequest result = target.getSendRequest();
            //Assert statement(s)
            assertThat(result, equalTo(sendRequestMock2));
            verify(requestMock).getPaymentDetailsVersion();
            verify(requestMock).hasSerializedPaymentDetails();
            verify(requestMock).getSerializedPaymentDetails();
            protosPaymentDetails.verify(() -> Protos.PaymentDetails.newBuilder(), atLeast(1));
            verify(protosPaymentDetailsBuilderMock).mergeFrom(byteStringMock);
            verify(protosPaymentDetailsBuilderMock2).build();
            paymentProtocol.verify(() -> PaymentProtocol.paramsFromPmtProtocolID("return_of_getNetwork1"), atLeast(1));
            paymentProtocol.verify(() -> PaymentProtocol.verifyPaymentRequestPki(requestMock, (KeyStore) null), atLeast(1));
            coin.verify(() -> Coin.valueOf(0L), atLeast(1));
            sendRequest.verify(() -> SendRequest.forTx((Transaction) any()));
            verify(sendRequestMock).fromPaymentDetails(protosPaymentDetailsMock);
            verify(protosPaymentDetailsMock).hasNetwork();
            verify(protosPaymentDetailsMock).getNetwork();
            verify(protosPaymentDetailsMock).getOutputsCount();
            verify(protosPaymentDetailsMock, times(2)).getOutputsList();
            verify(bitcoinNetworkParamsMock).network();
        }
    }

    //Sapient generated method id: ${adc869a8-739d-3da6-9f2b-e2fe07a2be41}
    @Test()
    public void sendPaymentWhenCaughtIOException() throws IOException, PaymentProtocolException {
        /* Branches:
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //ListenableCompletableFuture<PaymentProtocol.Ack> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        //TrustStoreLoader trustStoreLoaderMock = mock(TrustStoreLoader.class);
        //Protos.Payment protosPaymentMock = mock(Protos.Payment.class);
        //Transaction transactionMock = mock(Transaction.class);
        //Address addressMock = mock(Address.class);
        /*try (MockedStatic<ListenableCompletableFuture> listenableCompletableFuture = mockStatic(ListenableCompletableFuture.class)) {
    listenableCompletableFuture.when(() -> ListenableCompletableFuture.failedFuture(1)).thenReturn(listenableCompletableFutureMock);
    Protos.PaymentRequest paymentRequest = Protos.PaymentRequest.getDefaultInstance();
    target = spy(new PaymentSession(paymentRequest, true, trustStoreLoaderMock));
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    List<Transaction> transactionList = new ArrayList<>();
    transactionList.add(transactionMock);
    doReturn(protosPaymentMock).when(target).getPayment(transactionList, addressMock, "some_string_value");
    //Act Statement(s)
    ListenableCompletableFuture<PaymentProtocol.Ack> result = target.sendPayment(transactionList, addressMock, "some_string_value");
    //Assert statement(s)
    assertThat(result, equalTo(listenableCompletableFutureMock));
    listenableCompletableFuture.verify(() -> ListenableCompletableFuture.failedFuture(1), atLeast(1));
    verify(target).getPayment(transactionList, addressMock, "some_string_value");
}*/
    }

    //Sapient generated method id: ${360ef9a4-fbb2-34fa-b8d7-91ebefdabdf0}
    @Test()
    public void sendPaymentWhenPaymentIsNull() throws IOException, PaymentProtocolException {
        /* Branches:
         * (payment == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TrustStoreLoader trustStoreLoaderMock = mock(TrustStoreLoader.class);
        //Transaction transactionMock = mock(Transaction.class);
        //Address addressMock = mock(Address.class);
        /*try (MockedStatic<ListenableCompletableFuture> listenableCompletableFuture = mockStatic(ListenableCompletableFuture.class)) {
    ListenableCompletableFuture<PaymentProtocol.Ack> listenableCompletableFuture2 = new ListenableCompletableFuture<>();
    listenableCompletableFuture.when(() -> ListenableCompletableFuture.failedFuture((PaymentProtocolException.InvalidPaymentRequestURL) any())).thenReturn(listenableCompletableFuture2);
    Protos.PaymentRequest paymentRequest = Protos.PaymentRequest.getDefaultInstance();
    target = spy(new PaymentSession(paymentRequest, true, trustStoreLoaderMock));
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    List<Transaction> transactionList = new ArrayList<>();
    transactionList.add(transactionMock);
    doReturn(null).when(target).getPayment(transactionList, addressMock, "dummy memo");
    //Act Statement(s)
    ListenableCompletableFuture<PaymentProtocol.Ack> result = target.sendPayment(transactionList, addressMock, "dummy memo");
    //Assert statement(s)
    assertThat(result, equalTo(listenableCompletableFuture2));
    listenableCompletableFuture.verify(() -> ListenableCompletableFuture.failedFuture((PaymentProtocolException.InvalidPaymentRequestURL) any()));
    verify(target).getPayment(transactionList, addressMock, "dummy memo");
}*/
    }

    //Sapient generated method id: ${1ea7441c-6b59-37a7-b69b-8e89eb86028f}
    @Test()
    public void sendPaymentWhenIsExpired() throws IOException, PaymentProtocolException {
        /* Branches:
         * (payment == null) : false
         * (isExpired()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TrustStoreLoader trustStoreLoaderMock = mock(TrustStoreLoader.class);
        //Protos.Payment protosPaymentMock = mock(Protos.Payment.class);
        //Address addressMock = mock(Address.class);
        /*try (MockedStatic<ListenableCompletableFuture> listenableCompletableFuture = mockStatic(ListenableCompletableFuture.class)) {
    PaymentProtocolException.Expired paymentProtocolExceptionExpired = new PaymentProtocolException.Expired("PaymentRequest is expired");
    ListenableCompletableFuture<PaymentProtocol.Ack> listenableCompletableFuture2 = ListenableCompletableFuture.failedFuture(paymentProtocolExceptionExpired);
    listenableCompletableFuture.when(() -> ListenableCompletableFuture.failedFuture((PaymentProtocolException.Expired) any())).thenReturn(listenableCompletableFuture2);
    Protos.PaymentRequest paymentRequest = Protos.PaymentRequest.getDefaultInstance();
    target = spy(new PaymentSession(paymentRequest, true, trustStoreLoaderMock));
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    Transaction transaction = new Transaction();
    List<Transaction> transactionList = new ArrayList<>();
    transactionList.add(transaction);
    doReturn(protosPaymentMock).when(target).getPayment(transactionList, addressMock, "Test Memo");
    doReturn(true).when(target).isExpired();
    //Act Statement(s)
    ListenableCompletableFuture<PaymentProtocol.Ack> result = target.sendPayment(transactionList, addressMock, "Test Memo");
    //Assert statement(s)
    assertThat(result, equalTo(listenableCompletableFuture2));
    listenableCompletableFuture.verify(() -> ListenableCompletableFuture.failedFuture((PaymentProtocolException.Expired) any()));
    verify(target).getPayment(transactionList, addressMock, "Test Memo");
    verify(target).isExpired();
}*/
    }

    //Sapient generated method id: ${e7f16d00-0f8b-38c3-ae83-47077ec3f99a}
    @Test()
    public void sendPaymentWhenIsExpiredNot() throws KeyStoreException, IOException, PaymentProtocolException {
        /* Branches:
         * (payment == null) : false
         * (isExpired()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //Protos.PaymentRequest requestMock = mock(Protos.PaymentRequest.class);
        //ByteString byteStringMock = mock(ByteString.class);
        //Protos.PaymentDetails.Builder protosPaymentDetailsBuilderMock = mock(Protos.PaymentDetails.Builder.class);
        //Protos.PaymentDetails.Builder protosPaymentDetailsBuilderMock2 = mock(Protos.PaymentDetails.Builder.class);
        //Protos.PaymentDetails protosPaymentDetailsMock = mock(Protos.PaymentDetails.class);
        //BitcoinNetworkParams bitcoinNetworkParamsMock = mock(BitcoinNetworkParams.class);
        //PaymentProtocol.PkiVerificationData paymentProtocolPkiVerificationDataMock = mock(PaymentProtocol.PkiVerificationData.class);
        //Protos.Payment protosPaymentMock = mock(Protos.Payment.class);
        //Address addressMock = mock(Address.class);
        /*try (MockedStatic<ListenableCompletableFuture> listenableCompletableFuture = mockStatic(ListenableCompletableFuture.class);
    MockedStatic<PaymentProtocol> paymentProtocol = mockStatic(PaymentProtocol.class);
    MockedStatic<Protos.PaymentDetails> protosPaymentDetails = mockStatic(Protos.PaymentDetails.class)) {
    doReturn(1).when(requestMock).getPaymentDetailsVersion();
    doReturn(true).when(requestMock).hasSerializedPaymentDetails();
    doReturn(byteStringMock).when(requestMock).getSerializedPaymentDetails();
    protosPaymentDetails.when(() -> Protos.PaymentDetails.newBuilder()).thenReturn(protosPaymentDetailsBuilderMock);
    doReturn(protosPaymentDetailsBuilderMock2).when(protosPaymentDetailsBuilderMock).mergeFrom(byteStringMock);
    doReturn(protosPaymentDetailsMock).when(protosPaymentDetailsBuilderMock2).build();
    paymentProtocol.when(() -> PaymentProtocol.paramsFromPmtProtocolID("return_of_getNetwork1")).thenReturn(bitcoinNetworkParamsMock);
    paymentProtocol.when(() -> PaymentProtocol.verifyPaymentRequestPki(requestMock, (KeyStore) null)).thenReturn(paymentProtocolPkiVerificationDataMock);
    ListenableCompletableFuture<PaymentProtocol.Ack> listenableCompletableFuture2 = new ListenableCompletableFuture<>();
    CompletableFuture<PaymentProtocol.Ack> completableFuture = new CompletableFuture<>();
    listenableCompletableFuture.when(() -> ListenableCompletableFuture.of(completableFuture)).thenReturn(listenableCompletableFuture2);
    target = spy(new PaymentSession(requestMock, true, (TrustStoreLoader) null));
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    doReturn(true).when(protosPaymentDetailsMock).hasNetwork();
    doReturn("return_of_getNetwork1").when(protosPaymentDetailsMock).getNetwork();
    doReturn(1).when(protosPaymentDetailsMock).getOutputsCount();
    List<Protos.Output> protosOutputList = new ArrayList<>();
    doReturn(protosOutputList).when(protosPaymentDetailsMock).getOutputsList();
    doReturn(BitcoinNetwork.MAINNET).when(bitcoinNetworkParamsMock).network();
    List<Transaction> transactionList = new ArrayList<>();
    doReturn(protosPaymentMock).when(target).getPayment(transactionList, addressMock, "memo1");
    doReturn(false).when(target).isExpired();
    doReturn("String").when(protosPaymentDetailsMock).getPaymentUrl();
    //Act Statement(s)
    ListenableCompletableFuture<PaymentProtocol.Ack> result = target.sendPayment(transactionList, addressMock, "memo1");
    //Assert statement(s)
    assertThat(result, equalTo(listenableCompletableFuture2));
    verify(requestMock).getPaymentDetailsVersion();
    verify(requestMock).hasSerializedPaymentDetails();
    verify(requestMock).getSerializedPaymentDetails();
    protosPaymentDetails.verify(() -> Protos.PaymentDetails.newBuilder(), atLeast(1));
    verify(protosPaymentDetailsBuilderMock).mergeFrom(byteStringMock);
    verify(protosPaymentDetailsBuilderMock2).build();
    paymentProtocol.verify(() -> PaymentProtocol.paramsFromPmtProtocolID("return_of_getNetwork1"), atLeast(1));
    paymentProtocol.verify(() -> PaymentProtocol.verifyPaymentRequestPki(requestMock, (KeyStore) null), atLeast(1));
    listenableCompletableFuture.verify(() -> ListenableCompletableFuture.of(completableFuture), atLeast(1));
    verify(protosPaymentDetailsMock).hasNetwork();
    verify(protosPaymentDetailsMock).getNetwork();
    verify(protosPaymentDetailsMock).getOutputsCount();
    verify(protosPaymentDetailsMock).getOutputsList();
    verify(bitcoinNetworkParamsMock).network();
    verify(target).getPayment(transactionList, addressMock, "memo1");
    verify(target).isExpired();
    verify(protosPaymentDetailsMock).getPaymentUrl();
}*/
    }

    //Sapient generated method id: ${985cc91a-64db-3100-877e-f0beb1d102f0}
    @Test()
    public void sendPaymentWhenCaughtMalformedURLException() throws KeyStoreException, IOException, PaymentProtocolException {
        /* Branches:
         * (payment == null) : false
         * (isExpired()) : false
         * (catch-exception (MalformedURLException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Protos.PaymentRequest requestMock = mock(Protos.PaymentRequest.class);
        ByteString byteStringMock = mock(ByteString.class);
        TrustStoreLoader nonNullTrustStoreLoaderMock = mock(TrustStoreLoader.class);
        Protos.PaymentDetails.Builder protosPaymentDetailsBuilderMock = mock(Protos.PaymentDetails.Builder.class);
        Protos.PaymentDetails.Builder protosPaymentDetailsBuilderMock2 = mock(Protos.PaymentDetails.Builder.class);
        Protos.PaymentDetails protosPaymentDetailsMock = mock(Protos.PaymentDetails.class);
        PaymentProtocol.PkiVerificationData paymentProtocolPkiVerificationDataMock = mock(PaymentProtocol.PkiVerificationData.class);
        ListenableCompletableFuture<PaymentProtocol.Ack> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        Protos.Output outputMock = mock(Protos.Output.class);
        Protos.Payment protosPaymentMock = mock(Protos.Payment.class);
        Address addressMock = mock(Address.class);
        try (MockedStatic<ListenableCompletableFuture> listenableCompletableFuture = mockStatic(ListenableCompletableFuture.class);
             MockedStatic<PaymentProtocol> paymentProtocol = mockStatic(PaymentProtocol.class);
             MockedStatic<MainNetParams> mainNetParams = mockStatic(MainNetParams.class);
             MockedStatic<Protos.PaymentDetails> protosPaymentDetails = mockStatic(Protos.PaymentDetails.class)) {
            doReturn(1).when(requestMock).getPaymentDetailsVersion();
            doReturn(true).when(requestMock).hasSerializedPaymentDetails();
            doReturn(byteStringMock).when(requestMock).getSerializedPaymentDetails();
            //TODO: Needs to return real value
            doReturn(null).when(nonNullTrustStoreLoaderMock).getKeyStore();
            protosPaymentDetails.when(() -> Protos.PaymentDetails.newBuilder()).thenReturn(protosPaymentDetailsBuilderMock);
            doReturn(protosPaymentDetailsBuilderMock2).when(protosPaymentDetailsBuilderMock).mergeFrom(byteStringMock);
            doReturn(protosPaymentDetailsMock).when(protosPaymentDetailsBuilderMock2).build();
            MainNetParams mainNetParams2 = MainNetParams.get();
            mainNetParams.when(() -> MainNetParams.get()).thenReturn(mainNetParams2);
            paymentProtocol.when(() -> PaymentProtocol.verifyPaymentRequestPki(requestMock, (KeyStore) null)).thenReturn(paymentProtocolPkiVerificationDataMock);
            listenableCompletableFuture.when(() -> ListenableCompletableFuture.failedFuture((PaymentProtocolException.InvalidPaymentURL) any())).thenReturn(listenableCompletableFutureMock);
            target = spy(new PaymentSession(requestMock, true, nonNullTrustStoreLoaderMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(false).when(protosPaymentDetailsMock).hasNetwork();
            doReturn(1).when(protosPaymentDetailsMock).getOutputsCount();
            List<Protos.Output> protosOutputList = new ArrayList<>();
            protosOutputList.add(outputMock);
            doReturn(protosOutputList).when(protosPaymentDetailsMock).getOutputsList();
            doReturn(true).when(outputMock).hasAmount();
            doReturn(0L).when(outputMock).getAmount();
            List<Transaction> transactionList = new ArrayList<>();
            doReturn(protosPaymentMock).when(target).getPayment(transactionList, addressMock, "memo1");
            doReturn(false).when(target).isExpired();
            doReturn("return_of_getPaymentUrl1").when(protosPaymentDetailsMock).getPaymentUrl();
            //Act Statement(s)
            ListenableCompletableFuture<PaymentProtocol.Ack> result = target.sendPayment(transactionList, addressMock, "memo1");
            //Assert statement(s)
            assertThat(result, equalTo(listenableCompletableFutureMock));
            verify(requestMock).getPaymentDetailsVersion();
            verify(requestMock).hasSerializedPaymentDetails();
            verify(requestMock).getSerializedPaymentDetails();
            verify(nonNullTrustStoreLoaderMock).getKeyStore();
            protosPaymentDetails.verify(() -> Protos.PaymentDetails.newBuilder(), atLeast(1));
            verify(protosPaymentDetailsBuilderMock).mergeFrom(byteStringMock);
            verify(protosPaymentDetailsBuilderMock2).build();
            mainNetParams.verify(() -> MainNetParams.get(), atLeast(1));
            paymentProtocol.verify(() -> PaymentProtocol.verifyPaymentRequestPki(requestMock, (KeyStore) null), atLeast(1));
            listenableCompletableFuture.verify(() -> ListenableCompletableFuture.failedFuture((PaymentProtocolException.InvalidPaymentURL) any()));
            verify(protosPaymentDetailsMock).hasNetwork();
            verify(protosPaymentDetailsMock).getOutputsCount();
            verify(protosPaymentDetailsMock).getOutputsList();
            verify(outputMock).hasAmount();
            verify(outputMock).getAmount();
            verify(target).getPayment(transactionList, addressMock, "memo1");
            verify(target).isExpired();
            verify(protosPaymentDetailsMock).getPaymentUrl();
        }
    }

    //Sapient generated method id: ${930f4048-fc28-3365-a150-d97ef12c998c}
    @Test()
    public void getPaymentWhenPaymentDetailsHasPaymentUrl() throws IOException, PaymentProtocolException {
        /* Branches:
         * (paymentDetails.hasPaymentUrl()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Protos.PaymentRequest paymentRequest = Protos.PaymentRequest.getDefaultInstance();
        TrustStoreLoader trustStoreLoaderMock = mock(TrustStoreLoader.class);
        target = new PaymentSession(paymentRequest, false, trustStoreLoaderMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Protos.PaymentDetails paymentDetailsMock2 = mock(Protos.PaymentDetails.class);
        doReturn(false).when(paymentDetailsMock2).hasPaymentUrl();
        List<Transaction> transactionList = new ArrayList<>();
        Address addressMock = mock(Address.class);
        //Act Statement(s)
        Protos.Payment result = target.getPayment(transactionList, addressMock, "");
        //Assert statement(s)
        assertThat(result, is(nullValue()));
        verify(paymentDetailsMock2).hasPaymentUrl();
    }

    //Sapient generated method id: ${abe912d9-7c90-3a67-8ed8-350bc3c0a1ab}
    @Test()
    public void getPaymentWhenPaymentDetailsNotHasPaymentUrl() throws IOException, PaymentProtocolException {
        /* Branches:
         * (paymentDetails.hasPaymentUrl()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Protos.PaymentRequest paymentRequest = Protos.PaymentRequest.getDefaultInstance();
        TrustStoreLoader trustStoreLoaderMock = mock(TrustStoreLoader.class);
        target = new PaymentSession(paymentRequest, true, trustStoreLoaderMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Protos.PaymentDetails paymentDetailsMock2 = mock(Protos.PaymentDetails.class);
        doReturn(false).when(paymentDetailsMock2).hasPaymentUrl();
        List<Transaction> transactionList = new ArrayList<>();
        Address addressMock = mock(Address.class);
        //Act Statement(s)
        Protos.Payment result = target.getPayment(transactionList, addressMock, "Test Memo");
        //Assert statement(s)
        assertThat(result, is(nullValue()));
        verify(paymentDetailsMock2).hasPaymentUrl();
    }

    //Sapient generated method id: ${da14b862-c9da-3d73-a403-287f39476292}
    @Test()
    public void sendPayment1Test() throws PaymentProtocolException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Protos.PaymentRequest paymentRequest = Protos.PaymentRequest.getDefaultInstance();
        TrustStoreLoader trustStoreLoaderMock = mock(TrustStoreLoader.class);
        target = new PaymentSession(paymentRequest, true, trustStoreLoaderMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //TODO: Needs initialization with real value
        URL uRL = null;
        Protos.Payment payment = Protos.Payment.getDefaultInstance();
        //Act Statement(s)
        CompletableFuture<PaymentProtocol.Ack> result = target.sendPayment(uRL, payment);
        CompletableFuture<PaymentProtocol.Ack> completableFuture = new CompletableFuture<>();
        //Assert statement(s)
        //TODO: Please implement equals method in CompletableFuture for verification to succeed or you need to adjust respective assertion statements
        assertThat(result, equalTo(completableFuture));
    }

    //Sapient generated method id: ${b7d95427-d79a-3b0f-b536-fd30dfedd992}
    @Test()
    public void verifyPkiTest() throws PaymentProtocolException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Protos.PaymentRequest paymentRequest = Protos.PaymentRequest.getDefaultInstance();
        TrustStoreLoader trustStoreLoaderMock = mock(TrustStoreLoader.class);
        target = new PaymentSession(paymentRequest, true, trustStoreLoaderMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        PaymentProtocol.PkiVerificationData result = target.verifyPki();
        //Assert statement(s)
        assertThat(result, is(nullValue()));
    }
}
