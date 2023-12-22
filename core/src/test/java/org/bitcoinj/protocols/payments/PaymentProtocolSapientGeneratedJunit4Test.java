package org.bitcoinj.protocols.payments;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.security.cert.CertificateEncodingException;
import java.security.InvalidKeyException;
import java.security.SignatureException;
import java.security.NoSuchAlgorithmException;

import com.google.protobuf.InvalidProtocolBufferException;

import java.security.cert.CertificateException;
import java.security.KeyStoreException;
import java.security.cert.CertPathValidatorException;
import java.security.InvalidAlgorithmParameterException;

import org.bitcoinj.core.ProtocolException;
import org.bitcoinj.base.Network;
import org.bitcoinj.protobuf.payments.Protos;
import org.bitcoinj.core.MessageSerializer;

import java.security.cert.CertificateFactory;

import org.bitcoinj.base.Coin;

import java.security.cert.X509Certificate;
import java.util.ArrayList;

import org.bitcoinj.script.Script;
import org.bitcoinj.base.Address;
import org.bitcoinj.params.TestNet3Params;
import org.bitcoinj.crypto.X509Utils;
import org.bitcoinj.crypto.TrustStoreLoader;
import org.junit.rules.ExpectedException;

import java.util.List;

import org.bitcoinj.core.Transaction;
import org.bitcoinj.params.BitcoinNetworkParams;
import org.bitcoinj.params.UnitTestParams;

import java.security.KeyStore;

import org.bitcoinj.params.RegTestParams;
import org.bitcoinj.core.NetworkParameters;
import org.bitcoinj.base.internal.TimeUtils;

import java.security.PrivateKey;
import java.nio.ByteBuffer;
import java.security.cert.CertPathValidator;

import com.google.protobuf.ByteString;

import java.security.GeneralSecurityException;

import org.mockito.MockedStatic;

import java.security.Signature;

import org.bitcoinj.script.ScriptBuilder;
import org.bitcoinj.params.MainNetParams;
import org.bitcoinj.params.SigNetParams;

import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyList;
import static org.hamcrest.Matchers.containsInRelativeOrder;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.isA;

import org.junit.Ignore;

public class PaymentProtocolSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Address addressMock = mock(Address.class);

    private final ByteString byteStringMock = mock(ByteString.class);

    private final ByteString byteStringMock2 = mock(ByteString.class);

    private final Coin coinMock = mock(Coin.class);

    private final Network networkMock = mock(Network.class);

    private final NetworkParameters networkParametersMock = mock(NetworkParameters.class);

    private final Protos.PaymentRequest paymentRequestMock = mock(Protos.PaymentRequest.class);

    private final Protos.Output.Builder protosOutputBuilderMock = mock(Protos.Output.Builder.class);

    private final Protos.Output.Builder protosOutputBuilderMock2 = mock(Protos.Output.Builder.class);

    private final Protos.Output protosOutputMock = mock(Protos.Output.class);

    private final Protos.Payment protosPaymentMock = mock(Protos.Payment.class);

    private final Protos.PaymentRequest.Builder protosPaymentRequestBuilderMock = mock(Protos.PaymentRequest.Builder.class);

    private final Protos.PaymentRequest.Builder protosPaymentRequestBuilderMock2 = mock(Protos.PaymentRequest.Builder.class);

    private final Protos.PaymentRequest protosPaymentRequestMock = mock(Protos.PaymentRequest.class);

    private final Protos.X509Certificates protosX509CertificatesMock = mock(Protos.X509Certificates.class);

    private final Transaction transactionMock = mock(Transaction.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${3d326811-bae6-330e-97be-cfc2283f207d}
    @Test()
    public void createPaymentRequestTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<PaymentProtocol> paymentProtocol = mockStatic(PaymentProtocol.class, CALLS_REAL_METHODS)) {
            Protos.Output output = Protos.Output.getDefaultInstance();
            paymentProtocol.when(() -> PaymentProtocol.createPayToAddressOutput(coinMock, addressMock)).thenReturn(output);
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2};
            paymentProtocol.when(() -> PaymentProtocol.createPaymentRequest((NetworkParameters) any(), anyList(), eq("Test Memo"), eq("https://testpaymenturl.com"), eq(byteArray))).thenReturn(protosPaymentRequestBuilderMock);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            //Act Statement(s)
            Protos.PaymentRequest.Builder result = PaymentProtocol.createPaymentRequest(networkParameters, coinMock, addressMock, "Test Memo", "https://testpaymenturl.com", byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(protosPaymentRequestBuilderMock));
            paymentProtocol.verify(() -> PaymentProtocol.createPayToAddressOutput(coinMock, addressMock), atLeast(1));
            paymentProtocol.verify(() -> PaymentProtocol.createPaymentRequest((NetworkParameters) any(), anyList(), eq("Test Memo"), eq("https://testpaymenturl.com"), eq(byteArray)), atLeast(1));
        }
    }

    //Sapient generated method id: ${facb57f4-41e0-34d7-987e-22c3347a27a8}
    @Ignore()
    @Test()
    public void createPaymentRequest1WhenMerchantDataIsNotNull() {
        /* Branches:
         * (for-each(outputs)) : true
         * (memo != null) : true
         * (paymentUrl != null) : true
         * (merchantData != null) : true
         */
        //Arrange Statement(s)
        Protos.PaymentDetails.Builder protosPaymentDetailsBuilderMock = mock(Protos.PaymentDetails.Builder.class);
        Protos.PaymentDetails.Builder protosPaymentDetailsBuilderMock2 = mock(Protos.PaymentDetails.Builder.class);
        Protos.PaymentDetails.Builder protosPaymentDetailsBuilderMock3 = mock(Protos.PaymentDetails.Builder.class);
        Protos.PaymentDetails.Builder protosPaymentDetailsBuilderMock4 = mock(Protos.PaymentDetails.Builder.class);
        Protos.PaymentDetails.Builder protosPaymentDetailsBuilderMock5 = mock(Protos.PaymentDetails.Builder.class);
        Protos.PaymentDetails.Builder protosPaymentDetailsBuilderMock6 = mock(Protos.PaymentDetails.Builder.class);
        Protos.PaymentDetails protosPaymentDetailsMock = mock(Protos.PaymentDetails.class);
        try (MockedStatic<Protos.PaymentRequest> protosPaymentRequest = mockStatic(Protos.PaymentRequest.class);
             MockedStatic<PaymentProtocol> paymentProtocol = mockStatic(PaymentProtocol.class, CALLS_REAL_METHODS);
             MockedStatic<Protos.PaymentDetails> protosPaymentDetails = mockStatic(Protos.PaymentDetails.class)) {
            protosPaymentDetails.when(() -> Protos.PaymentDetails.newBuilder()).thenReturn(protosPaymentDetailsBuilderMock);
            Protos.PaymentDetails.Builder builder = protosPaymentDetailsBuilderMock.setNetwork("A");
            doReturn(builder).when(protosPaymentDetailsBuilderMock).setNetwork("A");
            doReturn(protosPaymentDetailsBuilderMock2).when(protosPaymentDetailsBuilderMock).addOutputs(protosOutputMock);
            doReturn(protosPaymentDetailsBuilderMock3).when(protosPaymentDetailsBuilderMock).setMemo("memo1");
            doReturn(protosPaymentDetailsBuilderMock4).when(protosPaymentDetailsBuilderMock).setPaymentUrl("paymentUrl1");
            doReturn(protosPaymentDetailsBuilderMock5).when(protosPaymentDetailsBuilderMock).setMerchantData((ByteString) any());
            doReturn(protosPaymentDetailsBuilderMock6).when(protosPaymentDetailsBuilderMock).setTime(1703223106L);
            doReturn(protosPaymentDetailsMock).when(protosPaymentDetailsBuilderMock).build();
            doReturn(byteStringMock).when(protosPaymentDetailsMock).toByteString();
            paymentProtocol.when(() -> PaymentProtocol.protocolIdFromParams(networkParametersMock)).thenReturn("A");
            protosPaymentRequest.when(() -> Protos.PaymentRequest.newBuilder()).thenReturn(protosPaymentRequestBuilderMock);
            doReturn(protosPaymentRequestBuilderMock2).when(protosPaymentRequestBuilderMock).setSerializedPaymentDetails(byteStringMock);
            List<Protos.Output> protosOutputList = new ArrayList<>();
            protosOutputList.add(protosOutputMock);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            Protos.PaymentRequest.Builder result = PaymentProtocol.createPaymentRequest(networkParametersMock, protosOutputList, "memo1", "paymentUrl1", byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(protosPaymentRequestBuilderMock));
            protosPaymentDetails.verify(() -> Protos.PaymentDetails.newBuilder(), atLeast(1));
            verify(protosPaymentDetailsBuilderMock, atLeast(1)).setNetwork("A");
            verify(protosPaymentDetailsBuilderMock, atLeast(1)).addOutputs(protosOutputMock);
            verify(protosPaymentDetailsBuilderMock, atLeast(1)).setMemo("memo1");
            verify(protosPaymentDetailsBuilderMock, atLeast(1)).setPaymentUrl("paymentUrl1");
            verify(protosPaymentDetailsBuilderMock, atLeast(1)).setMerchantData((ByteString) any());
            verify(protosPaymentDetailsBuilderMock, atLeast(1)).setTime(1703223106L);
            verify(protosPaymentDetailsBuilderMock, atLeast(1)).build();
            verify(protosPaymentDetailsMock, atLeast(1)).toByteString();
            paymentProtocol.verify(() -> PaymentProtocol.protocolIdFromParams(networkParametersMock), atLeast(1));
            protosPaymentRequest.verify(() -> Protos.PaymentRequest.newBuilder(), atLeast(1));
            verify(protosPaymentRequestBuilderMock, atLeast(1)).setSerializedPaymentDetails(byteStringMock);
        }
    }

    //Sapient generated method id: ${2d93a84e-04b7-301b-a1cd-7f3dd583fd50}
    @Ignore()
    @Test()
    public void parsePaymentRequestTest() throws PaymentProtocolException {
        //Arrange Statement(s)
        Protos.PaymentRequest paymentRequest = Protos.PaymentRequest.getDefaultInstance();
        //Act Statement(s)
        PaymentSession result = PaymentProtocol.parsePaymentRequest(paymentRequest);
        PaymentSession paymentSession = new PaymentSession(paymentRequest, false, (TrustStoreLoader) null);
        //Assert statement(s)
        //TODO: Please implement equals method in PaymentSession for verification to succeed or you need to adjust respective assertion statements
        assertThat(result, equalTo(paymentSession));
    }

    //Sapient generated method id: ${57e48229-ddb6-3265-8c1e-1d72573d6b7c}
    @Test()
    public void signPaymentRequestWhenRSAEqualsIgnoreCasePrivateKeyGetAlgorithm() {
        /* Branches:
         * (for-each(certificateChain)) : true
         * ("RSA".equalsIgnoreCase(privateKey.getAlgorithm())) : true
         */
        //Arrange Statement(s)
        thrown.expect(NullPointerException.class);
        X509Certificate[] x509CertificateArray = new X509Certificate[]{(X509Certificate) null};
        PrivateKey privateKey = null;
        //Act Statement(s)
        PaymentProtocol.signPaymentRequest(protosPaymentRequestBuilderMock, x509CertificateArray, privateKey);
    }

    //Sapient generated method id: ${e26efa18-d160-36c5-b1a0-e100eef79062}
    @Test()
    public void signPaymentRequestWhenRSANotEqualsIgnoreCasePrivateKeyGetAlgorithmThrowsIllegalStateException() {
        /* Branches:
         * (for-each(certificateChain)) : true
         * ("RSA".equalsIgnoreCase(privateKey.getAlgorithm())) : false
         */
        //Arrange Statement(s)
        thrown.expect(NullPointerException.class);
        X509Certificate[] x509CertificateArray = new X509Certificate[]{(X509Certificate) null};
        PrivateKey privateKey = null;
        //Act Statement(s)
        PaymentProtocol.signPaymentRequest(protosPaymentRequestBuilderMock, x509CertificateArray, privateKey);
    }

    //Sapient generated method id: ${0c90fcb3-e444-33da-9220-8976c86d742b}
    @Ignore()
    @Test()
    public void signPaymentRequestWhenCaughtGeneralSecurityExceptionThrowsRuntimeException() throws CertificateEncodingException, InvalidKeyException, SignatureException, NoSuchAlgorithmException {
        /* Branches:
         * (for-each(certificateChain)) : true
         * ("RSA".equalsIgnoreCase(privateKey.getAlgorithm())) : true
         * (catch-exception (GeneralSecurityException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Protos.PaymentRequest.Builder paymentRequestMock = mock(Protos.PaymentRequest.Builder.class);
        Protos.PaymentRequest.Builder protosPaymentRequestBuilderMock3 = mock(Protos.PaymentRequest.Builder.class);
        Protos.PaymentRequest.Builder protosPaymentRequestBuilderMock4 = mock(Protos.PaymentRequest.Builder.class);
        Protos.X509Certificates.Builder protosX509CertificatesBuilderMock = mock(Protos.X509Certificates.Builder.class);
        Protos.X509Certificates.Builder protosX509CertificatesBuilderMock2 = mock(Protos.X509Certificates.Builder.class);
        try (MockedStatic<ByteString> byteString = mockStatic(ByteString.class);
             MockedStatic<Signature> signature = mockStatic(Signature.class);
             MockedStatic<Protos.X509Certificates> protosX509Certificates = mockStatic(Protos.X509Certificates.class)) {
            doReturn(protosPaymentRequestBuilderMock).when(paymentRequestMock).setPkiType("x509+sha256");
            doReturn(protosPaymentRequestBuilderMock2).when(paymentRequestMock).setPkiData((ByteString) any());
            ByteString byteString2 = ByteString.EMPTY;
            doReturn(protosPaymentRequestBuilderMock3).when(paymentRequestMock).setSignature(byteString2);
            doReturn(protosPaymentRequestMock).when(paymentRequestMock).build();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(protosPaymentRequestMock).toByteArray();
            doReturn(protosPaymentRequestBuilderMock4).when(paymentRequestMock).setSignature(byteStringMock);
            protosX509Certificates.when(() -> Protos.X509Certificates.newBuilder()).thenReturn(protosX509CertificatesBuilderMock);
            doReturn(protosX509CertificatesBuilderMock2).when(protosX509CertificatesBuilderMock).addCertificate(byteStringMock2);
            Protos.X509Certificates x509Certificates = (Protos.X509Certificates) protosX509CertificatesBuilderMock.build();
            doReturn(x509Certificates).when(protosX509CertificatesBuilderMock).build();
            byte[] byteArray2 = new byte[]{};
            byteString.when(() -> ByteString.copyFrom(byteArray2)).thenReturn(byteStringMock2);
            Signature signature2 = Signature.getInstance("SHA256withRSA");
            signature.when(() -> Signature.getInstance("SHA256withRSA")).thenReturn(signature2);
            byte[] byteArray3 = new byte[]{};
            byteString.when(() -> ByteString.copyFrom(byteArray3)).thenReturn(byteStringMock);
            thrown.expect(RuntimeException.class);
            thrown.expectCause(isA(GeneralSecurityException.class));
            X509Certificate[] x509CertificateArray = new X509Certificate[]{(X509Certificate) null};
            //TODO: Needs initialization with real value
            PrivateKey privateKey = null;
            //Act Statement(s)
            PaymentProtocol.signPaymentRequest(paymentRequestMock, x509CertificateArray, privateKey);
            //Assert statement(s)
            verify(paymentRequestMock).setPkiType("x509+sha256");
            verify(paymentRequestMock).setPkiData((ByteString) any());
            verify(paymentRequestMock).setSignature(byteString2);
            verify(paymentRequestMock).build();
            verify(protosPaymentRequestMock).toByteArray();
            verify(paymentRequestMock).setSignature(byteStringMock);
            protosX509Certificates.verify(() -> Protos.X509Certificates.newBuilder(), atLeast(1));
            verify(protosX509CertificatesBuilderMock).addCertificate(byteStringMock2);
            verify(protosX509CertificatesBuilderMock).build();
            byteString.verify(() -> ByteString.copyFrom(byteArray2), atLeast(1));
            signature.verify(() -> Signature.getInstance("SHA256withRSA"), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray3), atLeast(1));
        }
    }

    //Sapient generated method id: ${d88892d4-0bf9-3f3b-8639-5118cc7e9db7}
    @Test()
    public void verifyPaymentRequestPkiWhenNoneEqualsPkiType() throws PaymentProtocolException, InvalidProtocolBufferException, SignatureException, NoSuchAlgorithmException, InvalidKeyException, CertificateException, KeyStoreException, CertPathValidatorException, InvalidAlgorithmParameterException {
        /* Branches:
         * ("none".equals(pkiType)) : true
         */
        //Arrange Statement(s)
        doReturn("none").when(paymentRequestMock).getPkiType();
        //TODO: Needs initialization with real value
        KeyStore keyStore = null;
        //Act Statement(s)
        PaymentProtocol.PkiVerificationData result = PaymentProtocol.verifyPaymentRequestPki(paymentRequestMock, keyStore);
        //Assert statement(s)
        assertThat(result, is(nullValue()));
        verify(paymentRequestMock).getPkiType();
    }

    //Sapient generated method id: ${13c90664-adaa-3c87-906c-12e676c59af3}
    @Ignore()
    @Test()
    public void verifyPaymentRequestPkiWhenCaughtCertificateExceptionOrSignatureEThrowsPaymentProtocolExceptionPkiVerificationException() throws PaymentProtocolException {
        /* Branches:
         * ("none".equals(pkiType)) : true
         * (catch-exception (CertificateException | SignatureException | InvalidKeyException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        thrown.expect(PaymentProtocolException.PkiVerificationException.class);
        Protos.PaymentRequest paymentRequest = Protos.PaymentRequest.getDefaultInstance();
        //TODO: Needs initialization with real value
        KeyStore keyStore = null;
        //Act Statement(s)
        PaymentProtocol.verifyPaymentRequestPki(paymentRequest, keyStore);
    }

    //Sapient generated method id: ${b01f2889-7f3f-3725-a054-68e3897478fe}
    @Ignore()
    @Test()
    public void verifyPaymentRequestPkiWhenCaughtNoSuchAlgorithmExceptionOrKeyStoreExceptionOrInvalidAlgorithmParThrowsRuntimeException() throws PaymentProtocolException {
        /* Branches:
         * ("none".equals(pkiType)) : true
         * (catch-exception (NoSuchAlgorithmException | KeyStoreException | InvalidAlgorithmParameterException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        thrown.expect(RuntimeException.class);
        thrown.expectCause(isA(String.class));
        Protos.PaymentRequest paymentRequest = Protos.PaymentRequest.getDefaultInstance();
        //TODO: Needs initialization with real value
        KeyStore keyStore = null;
        //Act Statement(s)
        PaymentProtocol.verifyPaymentRequestPki(paymentRequest, keyStore);
    }

    //Sapient generated method id: ${f54cfa5e-ab54-36bb-8a7f-54177b959b36}
    @Test()
    public void verifyPaymentRequestPkiWhenProtoCertsGetCertificateCountEquals0ThrowsPaymentProtocolExceptionInvalidPkiData() throws PaymentProtocolException, InvalidProtocolBufferException {
        /* Branches:
         * ("none".equals(pkiType)) : false
         * ("x509+sha256".equals(pkiType)) : true
         * (protoCerts.getCertificateCount() == 0) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Protos.X509Certificates> protosX509Certificates = mockStatic(Protos.X509Certificates.class)) {
            doReturn("x509+sha256").when(paymentRequestMock).getPkiType();
            doReturn(byteStringMock).when(paymentRequestMock).getPkiData();
            protosX509Certificates.when(() -> Protos.X509Certificates.parseFrom(byteStringMock)).thenReturn(protosX509CertificatesMock);
            doReturn(0).when(protosX509CertificatesMock).getCertificateCount();
            thrown.expect(PaymentProtocolException.InvalidPkiData.class);
            //TODO: Needs initialization with real value
            KeyStore keyStore = null;
            //Act Statement(s)
            PaymentProtocol.verifyPaymentRequestPki(paymentRequestMock, keyStore);
            //Assert statement(s)
            verify(paymentRequestMock).getPkiType();
            verify(paymentRequestMock).getPkiData();
            protosX509Certificates.verify(() -> Protos.X509Certificates.parseFrom(byteStringMock), atLeast(1));
            verify(protosX509CertificatesMock).getCertificateCount();
        }
    }

    //Sapient generated method id: ${8a1b68a5-e7c6-3618-b0f0-6a740be54561}
    @Test()
    public void verifyPaymentRequestPkiWhenX509_sha1NotEqualsPkiTypeThrowsPaymentProtocolExceptionInvalidPkiType() throws PaymentProtocolException {
        /* Branches:
         * ("none".equals(pkiType)) : false
         * ("x509+sha256".equals(pkiType)) : false
         * ("x509+sha1".equals(pkiType)) : false
         */
        //Arrange Statement(s)
        doReturn("A").when(paymentRequestMock).getPkiType();
        thrown.expect(PaymentProtocolException.InvalidPkiType.class);
        //TODO: Needs initialization with real value
        KeyStore keyStore = null;
        //Act Statement(s)
        PaymentProtocol.verifyPaymentRequestPki(paymentRequestMock, keyStore);
        //Assert statement(s)
        verify(paymentRequestMock).getPkiType();
    }

    //Sapient generated method id: ${6b94a25c-1be9-369b-ba74-f5d47bb566fc}
    @Ignore()
    @Test()
    public void verifyPaymentRequestPkiWhenSignatureNotVerifyPaymentRequestGetSigThrowsPaymentProtocolExceptionPkiVerificationException() throws PaymentProtocolException, InvalidProtocolBufferException {
        /* Branches:
         * ("none".equals(pkiType)) : false
         * ("x509+sha256".equals(pkiType)) : true
         * (protoCerts.getCertificateCount() == 0) : false
         * (for-each(protoCerts.getCertificateList())) : true
         * (!signature.verify(paymentRequest.getSignature().toByteArray())) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Protos.X509Certificates> protosX509Certificates = mockStatic(Protos.X509Certificates.class)) {
            Protos.X509Certificates x509Certificates = Protos.X509Certificates.getDefaultInstance();
            protosX509Certificates.when(() -> Protos.X509Certificates.parseFrom((ByteString) any())).thenReturn(x509Certificates);
            thrown.expect(PaymentProtocolException.InvalidPkiData.class);
            Protos.PaymentRequest paymentRequest = Protos.PaymentRequest.getDefaultInstance();
            //TODO: Needs initialization with real value
            KeyStore keyStore = null;
            //Act Statement(s)
            PaymentProtocol.verifyPaymentRequestPki(paymentRequest, keyStore);
            //Assert statement(s)
            protosX509Certificates.verify(() -> Protos.X509Certificates.parseFrom((ByteString) any()));
        }
    }

    //Sapient generated method id: ${8f2d6f33-06b6-318b-b175-e01a4957d7d4}
    @Ignore()
    @Test()
    public void verifyPaymentRequestPkiWhenDisplayNameIsNullThrowsPaymentProtocolExceptionPkiVerificationException() throws PaymentProtocolException, InvalidProtocolBufferException {
        /* Branches:
         * ("none".equals(pkiType)) : false
         * ("x509+sha256".equals(pkiType)) : true
         * (protoCerts.getCertificateCount() == 0) : false
         * (for-each(protoCerts.getCertificateList())) : true
         * (!signature.verify(paymentRequest.getSignature().toByteArray())) : false
         * (displayName == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Protos.X509Certificates> protosX509Certificates = mockStatic(Protos.X509Certificates.class)) {
            Protos.X509Certificates x509Certificates = Protos.X509Certificates.getDefaultInstance();
            protosX509Certificates.when(() -> Protos.X509Certificates.parseFrom((ByteString) any())).thenReturn(x509Certificates);
            thrown.expect(PaymentProtocolException.PkiVerificationException.class);
            Protos.PaymentRequest paymentRequest = Protos.PaymentRequest.getDefaultInstance();
            //TODO: Needs initialization with real value
            KeyStore keyStore = null;
            //Act Statement(s)
            PaymentProtocol.verifyPaymentRequestPki(paymentRequest, keyStore);
            //Assert statement(s)
            protosX509Certificates.verify(() -> Protos.X509Certificates.parseFrom((ByteString) any()));
        }
    }

    //Sapient generated method id: ${85c163a3-c732-31c6-b407-e2178571cfa1}
    @Ignore()
    @Test()
    public void verifyPaymentRequestPkiWhenDisplayNameIsNotNullAndCaughtInvalidProtocolBuffThrowsPaymentProtocolExceptionInvalidPkiData() throws PaymentProtocolException, CertificateException, CertPathValidatorException, InvalidAlgorithmParameterException, InvalidKeyException, SignatureException, KeyStoreException, InvalidProtocolBufferException, NoSuchAlgorithmException {
        /* Branches:
         * ("none".equals(pkiType)) : false
         * ("x509+sha256".equals(pkiType)) : true
         * (protoCerts.getCertificateCount() == 0) : false
         * (for-each(protoCerts.getCertificateList())) : true
         * (!signature.verify(paymentRequest.getSignature().toByteArray())) : false
         * (displayName == null) : false
         * (catch-exception (InvalidProtocolBufferException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ByteString byteString2Mock = mock(ByteString.class);
        try (MockedStatic<X509Utils> x509Utils = mockStatic(X509Utils.class);
             MockedStatic<Signature> signature = mockStatic(Signature.class);
             MockedStatic<CertPathValidator> certPathValidator = mockStatic(CertPathValidator.class);
             MockedStatic<CertificateFactory> certificateFactory = mockStatic(CertificateFactory.class);
             MockedStatic<Protos.X509Certificates> protosX509Certificates = mockStatic(Protos.X509Certificates.class)) {
            doReturn("x509+sha256").when(paymentRequestMock).getPkiType();
            doReturn(byteStringMock).when(paymentRequestMock).getPkiData();
            doReturn(protosPaymentRequestBuilderMock).when(paymentRequestMock).toBuilder();
            ByteString byteString = ByteString.EMPTY;
            doReturn(protosPaymentRequestBuilderMock2).when(protosPaymentRequestBuilderMock).setSignature(byteString);
            doReturn(protosPaymentRequestMock).when(protosPaymentRequestBuilderMock).build();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(protosPaymentRequestMock).toByteArray();
            doReturn(byteStringMock2).when(paymentRequestMock).getSignature();
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(byteStringMock2).toByteArray();
            protosX509Certificates.when(() -> Protos.X509Certificates.parseFrom(byteStringMock)).thenReturn(protosX509CertificatesMock);
            doReturn(1).when(protosX509CertificatesMock).getCertificateCount();
            List<ByteString> byteStringList = new ArrayList<>();
            byteStringList.add(byteString2Mock);
            doReturn(byteStringList).when(protosX509CertificatesMock).getCertificateList();
            doReturn(null).when(byteString2Mock).newInput();
            CertificateFactory certificateFactory2 = CertificateFactory.getInstance("X.509");
            certificateFactory.when(() -> CertificateFactory.getInstance("X.509")).thenReturn(certificateFactory2);
            CertPathValidator certPathValidator2 = CertPathValidator.getInstance("PKIX");
            certPathValidator.when(() -> CertPathValidator.getInstance("PKIX")).thenReturn(certPathValidator2);
            Signature signature2 = Signature.getInstance("SHA256withRSA");
            signature.when(() -> Signature.getInstance("SHA256withRSA")).thenReturn(signature2);
            x509Utils.when(() -> X509Utils.getDisplayNameFromCertificate((X509Certificate) any(), eq(true))).thenReturn("return_of_getDisplayNameFromCertificate1");
            thrown.expect(PaymentProtocolException.InvalidPkiData.class);
            //TODO: Needs initialization with real value
            KeyStore keyStore = null;
            //Act Statement(s)
            PaymentProtocol.verifyPaymentRequestPki(paymentRequestMock, keyStore);
            //Assert statement(s)
            verify(paymentRequestMock).getPkiType();
            verify(paymentRequestMock).getPkiData();
            verify(paymentRequestMock).toBuilder();
            verify(protosPaymentRequestBuilderMock).setSignature(byteString);
            verify(protosPaymentRequestBuilderMock).build();
            verify(protosPaymentRequestMock).toByteArray();
            verify(paymentRequestMock).getSignature();
            verify(byteStringMock2).toByteArray();
            protosX509Certificates.verify(() -> Protos.X509Certificates.parseFrom(byteStringMock), atLeast(1));
            verify(protosX509CertificatesMock).getCertificateCount();
            verify(protosX509CertificatesMock).getCertificateList();
            verify(byteString2Mock).newInput();
            certificateFactory.verify(() -> CertificateFactory.getInstance("X.509"), atLeast(1));
            certPathValidator.verify(() -> CertPathValidator.getInstance("PKIX"), atLeast(1));
            signature.verify(() -> Signature.getInstance("SHA256withRSA"), atLeast(1));
            x509Utils.verify(() -> X509Utils.getDisplayNameFromCertificate((X509Certificate) any(), eq(true)));
        }
    }

    //Sapient generated method id: ${f0f7fadc-3bc3-3edd-85a1-9fbad1d24630}
    @Ignore()
    @Test()
    public void verifyPaymentRequestPkiWhenSignatureVerifyPaymentRequestGetSignatureToByteArrayAndDisplayNameIsNotNull() throws PaymentProtocolException, InvalidProtocolBufferException {
        /* Branches:
         * ("none".equals(pkiType)) : false
         * ("x509+sha256".equals(pkiType)) : false
         * ("x509+sha1".equals(pkiType)) : true
         * (protoCerts.getCertificateCount() == 0) : false
         * (for-each(protoCerts.getCertificateList())) : true
         * (!signature.verify(paymentRequest.getSignature().toByteArray())) : false
         * (displayName == null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Protos.X509Certificates> protosX509Certificates = mockStatic(Protos.X509Certificates.class)) {
            Protos.X509Certificates x509Certificates = Protos.X509Certificates.getDefaultInstance();
            protosX509Certificates.when(() -> Protos.X509Certificates.parseFrom((ByteString) any())).thenReturn(x509Certificates);
            thrown.expect(PaymentProtocolException.InvalidPkiData.class);
            Protos.PaymentRequest paymentRequest = Protos.PaymentRequest.getDefaultInstance();
            //TODO: Needs initialization with real value
            KeyStore keyStore = null;
            //Act Statement(s)
            PaymentProtocol.verifyPaymentRequestPki(paymentRequest, keyStore);
            //Assert statement(s)
            protosX509Certificates.verify(() -> Protos.X509Certificates.parseFrom((ByteString) any()));
        }
    }

    //Sapient generated method id: ${a5de3777-890b-3d0c-b7ae-77989f769566}
    @Test()
    public void createPaymentMessageWhenRefundAddressIsNull() {
        /* Branches:
         * (refundAddress != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<PaymentProtocol> paymentProtocol = mockStatic(PaymentProtocol.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            paymentProtocol.when(() -> PaymentProtocol.createPaymentMessage(anyList(), eq((List) null), eq("memo1"), eq(byteArray))).thenReturn(protosPaymentMock);
            List<Transaction> transactionList = new ArrayList<>();
            Address address = null;
            //Act Statement(s)
            Protos.Payment result = PaymentProtocol.createPaymentMessage(transactionList, coinMock, address, "memo1", byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(protosPaymentMock));
            paymentProtocol.verify(() -> PaymentProtocol.createPaymentMessage(anyList(), eq((List) null), eq("memo1"), eq(byteArray)), atLeast(1));
        }
    }

    //Sapient generated method id: ${1b129479-a34d-333f-b466-c80457f2d5cb}
    @Test()
    public void createPaymentMessageWhenRefundAmountIsNullThrowsIllegalArgumentException() {
        /* Branches:
         * (refundAddress != null) : true
         * (refundAmount == null) : true
         */
        //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Specify refund amount if refund address is specified.");
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(illegalArgumentException.getMessage());
        List<Transaction> transactionList = new ArrayList<>();
        Coin coin = null;
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        PaymentProtocol.createPaymentMessage(transactionList, coin, addressMock, "memo1", byteArray);
    }

    //Sapient generated method id: ${e9ee867d-053a-3dfc-a726-be1432f43f6c}
    @Test()
    public void createPaymentMessageWhenRefundAmountIsNotNull() {
        /* Branches:
         * (refundAddress != null) : true
         * (refundAmount == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<PaymentProtocol> paymentProtocol = mockStatic(PaymentProtocol.class, CALLS_REAL_METHODS)) {
            Protos.Output output = Protos.Output.getDefaultInstance();
            paymentProtocol.when(() -> PaymentProtocol.createPayToAddressOutput(coinMock, addressMock)).thenReturn(output);
            Protos.Payment payment = Protos.Payment.getDefaultInstance();
            byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3};
            paymentProtocol.when(() -> PaymentProtocol.createPaymentMessage(anyList(), anyList(), eq("Test Memo"), eq(byteArray))).thenReturn(payment);
            List<Transaction> transactionList = new ArrayList<>();
            transactionList.add(transactionMock);
            //Act Statement(s)
            Protos.Payment result = PaymentProtocol.createPaymentMessage(transactionList, coinMock, addressMock, "Test Memo", byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(payment));
            paymentProtocol.verify(() -> PaymentProtocol.createPayToAddressOutput(coinMock, addressMock), atLeast(1));
            paymentProtocol.verify(() -> PaymentProtocol.createPaymentMessage(anyList(), anyList(), eq("Test Memo"), eq(byteArray)), atLeast(1));
        }
    }

    //Sapient generated method id: ${e55007f8-66a1-3dfe-955b-77cffb0366ba}
    @Ignore()
    @Test()
    public void createPaymentMessage1WhenRefundOutputsIsNotEmptyAndMemoIsNotNullAndMerchantDataIsNotNull() {
        /* Branches:
         * (for-each(transactions)) : true
         * (refundOutputs != null) : true
         * (for-each(refundOutputs)) : true
         * (memo != null) : true
         * (merchantData != null) : true
         */
        //Arrange Statement(s)
        Protos.Payment.Builder protosPaymentBuilderMock = mock(Protos.Payment.Builder.class);
        Protos.Payment.Builder protosPaymentBuilderMock2 = mock(Protos.Payment.Builder.class);
        Protos.Payment.Builder protosPaymentBuilderMock3 = mock(Protos.Payment.Builder.class);
        try (MockedStatic<ByteString> byteString = mockStatic(ByteString.class);
             MockedStatic<Protos.Payment> protosPayment = mockStatic(Protos.Payment.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(transactionMock).serialize();
            protosPayment.when(() -> Protos.Payment.newBuilder()).thenReturn(protosPaymentBuilderMock);
            doReturn(protosPaymentBuilderMock2).when(protosPaymentBuilderMock).addTransactions(byteStringMock);
            doReturn(protosPaymentBuilderMock3).when(protosPaymentBuilderMock).addRefundTo(protosOutputMock);
            Protos.Payment.Builder builder = protosPaymentBuilderMock.setMemo("memo1");
            doReturn(builder).when(protosPaymentBuilderMock).setMemo("memo1");
            byte[] byteArray2 = new byte[]{};
            ByteString byteString2 = ByteString.copyFrom(byteArray2);
            Protos.Payment.Builder builder2 = protosPaymentBuilderMock.setMerchantData(byteString2);
            doReturn(builder2).when(protosPaymentBuilderMock).setMerchantData((ByteString) any());
            Protos.Payment payment = (Protos.Payment) protosPaymentBuilderMock.build();
            doReturn(payment).when(protosPaymentBuilderMock).build();
            byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteStringMock);
            byteString.when(() -> ByteString.copyFrom(byteArray2)).thenReturn(byteString2);
            List<Transaction> transactionList = new ArrayList<>();
            transactionList.add(transactionMock);
            List<Protos.Output> protosOutputList = new ArrayList<>();
            protosOutputList.add(protosOutputMock);
            //Act Statement(s)
            Protos.Payment result = PaymentProtocol.createPaymentMessage(transactionList, protosOutputList, "memo1", byteArray2);
            List<Transaction> transactionTransactionListList = new ArrayList<>();
            transactionTransactionListList.add(transactionMock);
            //Assert statement(s)
            assertThat(result, equalTo(payment));
            assertThat(transactionList.size(), equalTo(transactionTransactionListList.size()));
            assertThat(transactionList, containsInRelativeOrder(transactionTransactionListList.toArray()));
            verify(transactionMock).serialize();
            protosPayment.verify(() -> Protos.Payment.newBuilder(), atLeast(1));
            verify(protosPaymentBuilderMock).addTransactions(byteStringMock);
            verify(protosPaymentBuilderMock).addRefundTo(protosOutputMock);
            verify(protosPaymentBuilderMock).setMemo("memo1");
            verify(protosPaymentBuilderMock).setMerchantData((ByteString) any());
            verify(protosPaymentBuilderMock).build();
            byteString.verify(() -> ByteString.copyFrom(byteArray), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray2), atLeast(1));
        }
    }

    //Sapient generated method id: ${d59546f7-2ecd-3fc4-ba76-0186a14d37d1}
    @Test()
    public void parseTransactionsFromPaymentMessageWhenPaymentMessageGetTransactionsListIsNotEmpty() throws ProtocolException, UnsupportedOperationException {
        /* Branches:
         * (for-each(paymentMessage.getTransactionsList())) : true
         */
        //Arrange Statement(s)
        NetworkParameters paramsMock = mock(NetworkParameters.class);
        MessageSerializer messageSerializerMock = mock(MessageSerializer.class);
        doReturn(messageSerializerMock).when(paramsMock).getDefaultSerializer();
        doReturn(transactionMock).when(messageSerializerMock).makeTransaction((ByteBuffer) any());
        Protos.Payment paymentMessageMock = mock(Protos.Payment.class);
        doReturn(0).when(paymentMessageMock).getTransactionsCount();
        List<ByteString> byteStringList = new ArrayList<>();
        byteStringList.add(byteStringMock);
        doReturn(byteStringList).when(paymentMessageMock).getTransactionsList();
        byte[] byteArray = new byte[]{};
        doReturn(byteArray).when(byteStringMock).toByteArray();
        //Act Statement(s)
        List<Transaction> result = PaymentProtocol.parseTransactionsFromPaymentMessage(paramsMock, paymentMessageMock);
        List<Transaction> transactionResultList = new ArrayList<>(0);
        transactionResultList.add(transactionMock);
        //Assert statement(s)
        assertThat(result.size(), equalTo(transactionResultList.size()));
        assertThat(result, containsInRelativeOrder(transactionResultList.toArray()));
        verify(paramsMock).getDefaultSerializer();
        verify(messageSerializerMock).makeTransaction((ByteBuffer) any());
        verify(paymentMessageMock).getTransactionsCount();
        verify(paymentMessageMock).getTransactionsList();
        verify(byteStringMock).toByteArray();
    }

    //Sapient generated method id: ${26f627f9-b53f-3fad-b031-7a778af0d7c5}
    @Test()
    public void createPaymentAckWhenMemoIsNotNull() {
        /* Branches:
         * (memo != null) : true
         */
        //Arrange Statement(s)
        Protos.PaymentACK.Builder protosPaymentACKBuilderMock = mock(Protos.PaymentACK.Builder.class);
        Protos.PaymentACK.Builder protosPaymentACKBuilderMock2 = mock(Protos.PaymentACK.Builder.class);
        Protos.PaymentACK.Builder protosPaymentACKBuilderMock3 = mock(Protos.PaymentACK.Builder.class);
        Protos.PaymentACK protosPaymentACKMock = mock(Protos.PaymentACK.class);
        try (MockedStatic<Protos.PaymentACK> protosPaymentACK = mockStatic(Protos.PaymentACK.class)) {
            protosPaymentACK.when(() -> Protos.PaymentACK.newBuilder()).thenReturn(protosPaymentACKBuilderMock);
            doReturn(protosPaymentACKBuilderMock2).when(protosPaymentACKBuilderMock).setPayment(protosPaymentMock);
            doReturn(protosPaymentACKBuilderMock3).when(protosPaymentACKBuilderMock).setMemo("memo1");
            doReturn(protosPaymentACKMock).when(protosPaymentACKBuilderMock).build();
            //Act Statement(s)
            Protos.PaymentACK result = PaymentProtocol.createPaymentAck(protosPaymentMock, "memo1");
            //Assert statement(s)
            assertThat(result, equalTo(protosPaymentACKMock));
            protosPaymentACK.verify(() -> Protos.PaymentACK.newBuilder(), atLeast(1));
            verify(protosPaymentACKBuilderMock).setPayment(protosPaymentMock);
            verify(protosPaymentACKBuilderMock).setMemo("memo1");
            verify(protosPaymentACKBuilderMock).build();
        }
    }

    //Sapient generated method id: ${cf01a93f-900d-37d4-843c-9168b63ac7b1}
    @Ignore()
    @Test()
    public void parsePaymentAckWhenPaymentAckHasMemo() {
        /* Branches:
         * (paymentAck.hasMemo()) : true
         */
        //Arrange Statement(s)
        Protos.PaymentACK paymentACK = Protos.PaymentACK.getDefaultInstance();
        //Act Statement(s)
        PaymentProtocol.Ack result = PaymentProtocol.parsePaymentAck(paymentACK);
        PaymentProtocol.Ack paymentProtocolAck = new PaymentProtocol.Ack("Payment received");
        //Assert statement(s)
        //TODO: Please implement equals method in Ack for verification to succeed or you need to adjust respective assertion statements
        assertThat(result, equalTo(paymentProtocolAck));
    }

    //Sapient generated method id: ${67d6ef03-d28f-3150-9321-85ea810ac766}
    @Ignore()
    @Test()
    public void parsePaymentAckWhenPaymentAckNotHasMemo() {
        /* Branches:
         * (paymentAck.hasMemo()) : false
         */
        //Arrange Statement(s)
        Protos.PaymentACK paymentAckMock = mock(Protos.PaymentACK.class);
        doReturn(false).when(paymentAckMock).hasMemo();
        //Act Statement(s)
        PaymentProtocol.Ack result = PaymentProtocol.parsePaymentAck(paymentAckMock);
        PaymentProtocol.Ack paymentProtocolAck = new PaymentProtocol.Ack((String) null);
        //Assert statement(s)
        //TODO: Please implement equals method in Ack for verification to succeed or you need to adjust respective assertion statements
        assertThat(result, equalTo(paymentProtocolAck));
        verify(paymentAckMock).hasMemo();
    }

    //Sapient generated method id: ${3f2d4c49-693e-345a-a2f9-a97605644fed}
    @Ignore()
    @Test()
    public void createPayToAddressOutputWhenAmountIsNull() {
        /* Branches:
         * (amount != null) : false
         */
        //Arrange Statement(s)
        Script scriptMock = mock(Script.class);
        try (MockedStatic<ByteString> byteString = mockStatic(ByteString.class);
             MockedStatic<ScriptBuilder> scriptBuilder = mockStatic(ScriptBuilder.class);
             MockedStatic<Protos.Output> protosOutput = mockStatic(Protos.Output.class)) {
            protosOutput.when(() -> Protos.Output.newBuilder()).thenReturn(protosOutputBuilderMock);
            Protos.Output.Builder builder = protosOutputBuilderMock.setAmount(0L);
            doReturn(builder).when(protosOutputBuilderMock).setAmount(0L);
            doReturn(protosOutputBuilderMock2).when(protosOutputBuilderMock).setScript(byteStringMock);
            doReturn(protosOutputMock).when(protosOutputBuilderMock).build();
            scriptBuilder.when(() -> ScriptBuilder.createOutputScript(addressMock)).thenReturn(scriptMock);
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(scriptMock).program();
            byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteStringMock);
            Coin coin = null;
            //Act Statement(s)
            Protos.Output result = PaymentProtocol.createPayToAddressOutput(coin, addressMock);
            //Assert statement(s)
            assertThat(result, equalTo(protosOutputMock));
            protosOutput.verify(() -> Protos.Output.newBuilder(), atLeast(1));
            verify(protosOutputBuilderMock).setAmount(0L);
            verify(protosOutputBuilderMock).setScript(byteStringMock);
            verify(protosOutputBuilderMock).build();
            scriptBuilder.verify(() -> ScriptBuilder.createOutputScript(addressMock), atLeast(1));
            verify(scriptMock).program();
            byteString.verify(() -> ByteString.copyFrom(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${db8ac907-0629-37e3-b302-a7ed8f5c5daf}
    @Test()
    public void createPayToAddressOutputWhenParamsNetworkExceedsMaxMoneyAmountThrowsIllegalArgumentException() {
        /* Branches:
         * (amount != null) : true
         * (params.network().exceedsMaxMoney(amount)) : true
         */
        //Arrange Statement(s)
        Network networkMock2 = mock(Network.class);
        Coin coinMock = mock(Coin.class, "createPayToAddressOutput_coin1");
        try (MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class)) {
            doReturn(networkMock).when(addressMock).network();
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParametersMock);
            doReturn(networkMock2).when(networkParametersMock).network();
            doReturn(true).when(networkMock2).exceedsMaxMoney(coinMock);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Amount too big: createPayToAddressOutput_coin1");
            thrown.expect(IllegalArgumentException.class);
            thrown.expectMessage(illegalArgumentException.getMessage());
            //Act Statement(s)
            PaymentProtocol.createPayToAddressOutput(coinMock, addressMock);
            //Assert statement(s)
            verify(addressMock).network();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            verify(networkParametersMock).network();
            verify(networkMock2).exceedsMaxMoney(coinMock);
        }
    }

    //Sapient generated method id: ${f4a78796-6cec-3423-bb7b-e7d5127aefff}
    @Ignore()
    @Test()
    public void createPayToAddressOutputWhenParamsNetworkNotExceedsMaxMoneyAmount() {
        /* Branches:
         * (amount != null) : true
         * (params.network().exceedsMaxMoney(amount)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Protos.Output.Builder protosOutputBuilderMock3 = mock(Protos.Output.Builder.class);
        try (MockedStatic<ByteString> byteString = mockStatic(ByteString.class);
             MockedStatic<ScriptBuilder> scriptBuilder = mockStatic(ScriptBuilder.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<Protos.Output> protosOutput = mockStatic(Protos.Output.class)) {
            doReturn(networkMock).when(addressMock).network();
            protosOutput.when(() -> Protos.Output.newBuilder()).thenReturn(protosOutputBuilderMock);
            doReturn(protosOutputBuilderMock2).when(protosOutputBuilderMock).setAmount(0L);
            doReturn(protosOutputBuilderMock3).when(protosOutputBuilderMock).setScript((ByteString) any());
            Protos.Output output = (Protos.Output) Protos.Output.getDefaultInstance();
            doReturn(output).when(protosOutputBuilderMock).build();
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParameters2);
            List list = new ArrayList<>();
            Script script = Script.of(list);
            scriptBuilder.when(() -> ScriptBuilder.createOutputScript(addressMock)).thenReturn(script);
            ByteString byteString2 = ByteString.empty();
            byte[] byteArray = new byte[]{};
            byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteString2);
            //Act Statement(s)
            Protos.Output result = PaymentProtocol.createPayToAddressOutput(coinMock, addressMock);
            //Assert statement(s)
            assertThat(result, equalTo(output));
            verify(addressMock).network();
            protosOutput.verify(() -> Protos.Output.newBuilder(), atLeast(1));
            verify(protosOutputBuilderMock).setAmount(0L);
            verify(protosOutputBuilderMock).setScript((ByteString) any());
            verify(protosOutputBuilderMock).build();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            scriptBuilder.verify(() -> ScriptBuilder.createOutputScript(addressMock), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${f1234942-ea05-34aa-b30a-9a99c062f7b3}
    @Test()
    public void paramsFromPmtProtocolIDWhenPmtProtocolIdEqualsPAYMENT_PROTOCOL_ID_MAINNET() {
        /* Branches:
         * (pmtProtocolId.equals(PAYMENT_PROTOCOL_ID_MAINNET)) : true
         */
        //Act Statement(s)
        BitcoinNetworkParams result = PaymentProtocol.paramsFromPmtProtocolID("main");
        MainNetParams mainNetParams = MainNetParams.get();
        //Assert statement(s)
        assertThat(result, equalTo(mainNetParams));
    }

    //Sapient generated method id: ${2606a65e-f7c3-32d2-92cf-2c161781a5b2}
    @Test()
    public void paramsFromPmtProtocolIDWhenPmtProtocolIdEqualsPAYMENT_PROTOCOL_ID_TESTNET() {
        /* Branches:
         * (pmtProtocolId.equals(PAYMENT_PROTOCOL_ID_MAINNET)) : false
         * (pmtProtocolId.equals(PAYMENT_PROTOCOL_ID_TESTNET)) : true
         */
        //Act Statement(s)
        BitcoinNetworkParams result = PaymentProtocol.paramsFromPmtProtocolID("test");
        TestNet3Params testNet3Params = TestNet3Params.get();
        //Assert statement(s)
        assertThat(result, equalTo(testNet3Params));
    }

    //Sapient generated method id: ${f78b31b4-42a4-3c3b-9c35-ac423213adc4}
    @Test()
    public void paramsFromPmtProtocolIDWhenPmtProtocolIdEqualsPAYMENT_PROTOCOL_ID_SIGNET() {
        /* Branches:
         * (pmtProtocolId.equals(PAYMENT_PROTOCOL_ID_MAINNET)) : false
         * (pmtProtocolId.equals(PAYMENT_PROTOCOL_ID_TESTNET)) : false
         * (pmtProtocolId.equals(PAYMENT_PROTOCOL_ID_SIGNET)) : true
         */
        //Act Statement(s)
        BitcoinNetworkParams result = PaymentProtocol.paramsFromPmtProtocolID("signet");
        SigNetParams sigNetParams = SigNetParams.get();
        //Assert statement(s)
        assertThat(result, equalTo(sigNetParams));
    }

    //Sapient generated method id: ${681c8a63-31cf-3d13-8aeb-ab125766cd48}
    @Test()
    public void paramsFromPmtProtocolIDWhenPmtProtocolIdEqualsPAYMENT_PROTOCOL_ID_REGTEST() {
        /* Branches:
         * (pmtProtocolId.equals(PAYMENT_PROTOCOL_ID_MAINNET)) : false
         * (pmtProtocolId.equals(PAYMENT_PROTOCOL_ID_TESTNET)) : false
         * (pmtProtocolId.equals(PAYMENT_PROTOCOL_ID_SIGNET)) : false
         * (pmtProtocolId.equals(PAYMENT_PROTOCOL_ID_REGTEST)) : true
         */
        //Act Statement(s)
        BitcoinNetworkParams result = PaymentProtocol.paramsFromPmtProtocolID("regtest");
        RegTestParams regTestParams = RegTestParams.get();
        //Assert statement(s)
        assertThat(result, equalTo(regTestParams));
    }

    //Sapient generated method id: ${9af0dde0-2eec-3bc2-9f8e-cd63f124cd65}
    @Test()
    public void paramsFromPmtProtocolIDWhenPmtProtocolIdEqualsPAYMENT_PROTOCOL_ID_UNIT_TESTS() {
        /* Branches:
         * (pmtProtocolId.equals(PAYMENT_PROTOCOL_ID_MAINNET)) : false
         * (pmtProtocolId.equals(PAYMENT_PROTOCOL_ID_TESTNET)) : false
         * (pmtProtocolId.equals(PAYMENT_PROTOCOL_ID_SIGNET)) : false
         * (pmtProtocolId.equals(PAYMENT_PROTOCOL_ID_REGTEST)) : false
         * (pmtProtocolId.equals(PAYMENT_PROTOCOL_ID_UNIT_TESTS)) : true
         */
        //Act Statement(s)
        BitcoinNetworkParams result = PaymentProtocol.paramsFromPmtProtocolID("unittest");
        UnitTestParams unitTestParams = UnitTestParams.get();
        //Assert statement(s)
        assertThat(result, equalTo(unitTestParams));
    }

    //Sapient generated method id: ${15613578-db88-3ad7-adc8-5b3d7b23c730}
    @Test()
    public void paramsFromPmtProtocolIDWhenPmtProtocolIdNotEqualsPAYMENT_PROTOCOL_ID_UNIT_TESTS() {
        /* Branches:
         * (pmtProtocolId.equals(PAYMENT_PROTOCOL_ID_MAINNET)) : false
         * (pmtProtocolId.equals(PAYMENT_PROTOCOL_ID_TESTNET)) : false
         * (pmtProtocolId.equals(PAYMENT_PROTOCOL_ID_SIGNET)) : false
         * (pmtProtocolId.equals(PAYMENT_PROTOCOL_ID_REGTEST)) : false
         * (pmtProtocolId.equals(PAYMENT_PROTOCOL_ID_UNIT_TESTS)) : false
         */
        //Act Statement(s)
        BitcoinNetworkParams result = PaymentProtocol.paramsFromPmtProtocolID("A");
        //Assert statement(s)
        assertThat(result, is(nullValue()));
    }

    //Sapient generated method id: ${555df352-a2ec-356e-82a8-7fe1a4808e11}
    @Test()
    public void protocolIdFromParamsWhenParamsInstanceOfMainNetParams() {
        /* Branches:
         * (params instanceof MainNetParams) : true
         */
        //Arrange Statement(s)
        MainNetParams mainNetParamsMock = mock(MainNetParams.class);
        //Act Statement(s)
        String result = PaymentProtocol.protocolIdFromParams(mainNetParamsMock);
        //Assert statement(s)
        assertThat(result, equalTo("main"));
    }

    //Sapient generated method id: ${ebb21ed6-369a-3420-92d8-859a54a7e2f8}
    @Test()
    public void protocolIdFromParamsWhenParamsInstanceOfTestNet3Params() {
        /* Branches:
         * (params instanceof MainNetParams) : false
         * (params instanceof TestNet3Params) : true
         */
        //Arrange Statement(s)
        TestNet3Params testNet3ParamsMock = mock(TestNet3Params.class);
        //Act Statement(s)
        String result = PaymentProtocol.protocolIdFromParams(testNet3ParamsMock);
        //Assert statement(s)
        assertThat(result, equalTo("test"));
    }

    //Sapient generated method id: ${d60bdbba-1fe2-304f-8a23-957b71e6cf17}
    @Test()
    public void protocolIdFromParamsWhenParamsInstanceOfSigNetParams() {
        /* Branches:
         * (params instanceof MainNetParams) : false
         * (params instanceof TestNet3Params) : false
         * (params instanceof SigNetParams) : true
         */
        //Arrange Statement(s)
        SigNetParams sigNetParamsMock = mock(SigNetParams.class);
        //Act Statement(s)
        String result = PaymentProtocol.protocolIdFromParams(sigNetParamsMock);
        //Assert statement(s)
        assertThat(result, equalTo("signet"));
    }

    //Sapient generated method id: ${275153a5-d740-3f2f-b2de-89048f821c1f}
    @Test()
    public void protocolIdFromParamsWhenParamsInstanceOfRegTestParams() {
        /* Branches:
         * (params instanceof MainNetParams) : false
         * (params instanceof TestNet3Params) : false
         * (params instanceof SigNetParams) : false
         * (params instanceof RegTestParams) : true
         */
        //Arrange Statement(s)
        RegTestParams regTestParamsMock = mock(RegTestParams.class);
        //Act Statement(s)
        String result = PaymentProtocol.protocolIdFromParams(regTestParamsMock);
        //Assert statement(s)
        assertThat(result, equalTo("regtest"));
    }

    //Sapient generated method id: ${38455069-974e-314f-bac0-1ff72274eca9}
    @Test()
    public void protocolIdFromParamsWhenParamsInstanceOfUnitTestParams() {
        /* Branches:
         * (params instanceof MainNetParams) : false
         * (params instanceof TestNet3Params) : false
         * (params instanceof SigNetParams) : false
         * (params instanceof RegTestParams) : false
         * (params instanceof UnitTestParams) : true
         */
        //Arrange Statement(s)
        UnitTestParams unitTestParamsMock = mock(UnitTestParams.class);
        //Act Statement(s)
        String result = PaymentProtocol.protocolIdFromParams(unitTestParamsMock);
        //Assert statement(s)
        assertThat(result, equalTo("unittest"));
    }

    //Sapient generated method id: ${8dbd3968-1837-36b3-a216-82c842152e31}
    @Test()
    public void protocolIdFromParamsWhenParamsNotInstanceOfUnitTestParamsThrowsIllegalArgumentException() {
        /* Branches:
         * (params instanceof MainNetParams) : false
         * (params instanceof TestNet3Params) : false
         * (params instanceof SigNetParams) : false
         * (params instanceof RegTestParams) : false
         * (params instanceof UnitTestParams) : false
         */
        //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unknown network");
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(illegalArgumentException.getMessage());
        //Act Statement(s)
        PaymentProtocol.protocolIdFromParams(networkParametersMock);
    }
}
