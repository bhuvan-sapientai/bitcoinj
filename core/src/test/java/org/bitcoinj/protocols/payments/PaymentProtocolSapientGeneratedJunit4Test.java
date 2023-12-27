package org.bitcoinj.protocols.payments;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.security.GeneralSecurityException;
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

import java.security.cert.CertificateParsingException;

import org.junit.Ignore;

public class PaymentProtocolSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Address addressMock = mock(Address.class);

    private final ByteString byteString2Mock = mock(ByteString.class);

    private final ByteString byteStringMock = mock(ByteString.class);

    private final ByteString byteStringMock2 = mock(ByteString.class);

    private final Coin coinMock = mock(Coin.class);

    private final Network networkMock = mock(Network.class);

    private final Network networkMock2 = mock(Network.class);

    private final NetworkParameters networkParametersMock = mock(NetworkParameters.class);

    private final Protos.PaymentRequest paymentRequestMock = mock(Protos.PaymentRequest.class);

    private final Protos.Output.Builder protosOutputBuilderMock = mock(Protos.Output.Builder.class, "UnknownObjectContent{target='org.bitcoinj.protobuf.payments.Protos$Output$Builder', onlyPojoFunctions=false, builderPattern=false}");

    private final Protos.Output.Builder protosOutputBuilderMock2 = mock(Protos.Output.Builder.class);

    private final Protos.Output protosOutputMock = mock(Protos.Output.class);

    private final Protos.Payment protosPaymentMock = mock(Protos.Payment.class);

    private final Protos.PaymentRequest.Builder protosPaymentRequestBuilderMock = mock(Protos.PaymentRequest.Builder.class);

    private final Protos.PaymentRequest.Builder protosPaymentRequestBuilderMock2 = mock(Protos.PaymentRequest.Builder.class);

    private final Protos.PaymentRequest.Builder protosPaymentRequestBuilderMock3 = mock(Protos.PaymentRequest.Builder.class);

    private final Protos.PaymentRequest.Builder protosPaymentRequestBuilderMock4 = mock(Protos.PaymentRequest.Builder.class);

    private final Protos.PaymentRequest protosPaymentRequestMock = mock(Protos.PaymentRequest.class);

    private final Protos.X509Certificates.Builder protosX509CertificatesBuilderMock = mock(Protos.X509Certificates.Builder.class);

    private final Protos.X509Certificates.Builder protosX509CertificatesBuilderMock2 = mock(Protos.X509Certificates.Builder.class);

    private final Protos.X509Certificates protosX509CertificatesMock = mock(Protos.X509Certificates.class);

    private final Script scriptMock = mock(Script.class);

    private final Transaction transactionMock = mock(Transaction.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    private final Protos.PaymentACK paymentAckMock = mock(Protos.PaymentACK.class);

    //Sapient generated method id: ${3d326811-bae6-330e-97be-cfc2283f207d}
    @Test()
    public void createPaymentRequestTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin coinMock = mock(Coin.class, "1000");
        Address addressMock = mock(Address.class, "1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa");
        Protos.PaymentRequest.Builder protosPaymentRequestBuilderMock = mock(Protos.PaymentRequest.Builder.class, "UnknownObjectContent{target='org.bitcoinj.protobuf.payments.Protos$PaymentRequest$Builder', onlyPojoFunctions=false, builderPattern=false}");
        try (MockedStatic<PaymentProtocol> paymentProtocol = mockStatic(PaymentProtocol.class, CALLS_REAL_METHODS)) {
            Protos.Output output = Protos.Output.getDefaultInstance();
            paymentProtocol.when(() -> PaymentProtocol.createPayToAddressOutput(coinMock, addressMock)).thenReturn(output);
            byte[] byteArray = new byte[]{(byte) 0};
            paymentProtocol.when(() -> PaymentProtocol.createPaymentRequest((NetworkParameters) any(), anyList(), eq("Test Payment"), eq("https://example.com/payment"), eq(byteArray))).thenReturn(protosPaymentRequestBuilderMock);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            //Act Statement(s)
            Protos.PaymentRequest.Builder result = PaymentProtocol.createPaymentRequest(networkParameters, coinMock, addressMock, "Test Payment", "https://example.com/payment", byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(protosPaymentRequestBuilderMock));
            paymentProtocol.verify(() -> PaymentProtocol.createPayToAddressOutput(coinMock, addressMock), atLeast(1));
            paymentProtocol.verify(() -> PaymentProtocol.createPaymentRequest((NetworkParameters) any(), anyList(), eq("Test Payment"), eq("https://example.com/payment"), eq(byteArray)), atLeast(1));
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
        Protos.PaymentDetails.Builder protosPaymentDetailsBuilderMock = mock(Protos.PaymentDetails.Builder.class, "UnknownObjectContent{target='org.bitcoinj.protobuf.payments.Protos$PaymentDetails$Builder', onlyPojoFunctions=false, builderPattern=false}");
        Protos.PaymentDetails.Builder protosPaymentDetailsBuilderMock2 = mock(Protos.PaymentDetails.Builder.class, "Protos.PaymentRequest.Builder");
        Protos.PaymentDetails.Builder protosPaymentDetailsBuilderMock3 = mock(Protos.PaymentDetails.Builder.class, "Protos.PaymentDetails.Builder");
        Protos.PaymentDetails.Builder protosPaymentDetailsBuilderMock4 = mock(Protos.PaymentDetails.Builder.class, "Protos.PaymentDetails.Builder");
        Protos.PaymentDetails.Builder protosPaymentDetailsBuilderMock5 = mock(Protos.PaymentDetails.Builder.class, "Protos.PaymentDetails.Builder");
        try (MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class);
             MockedStatic<ByteString> byteString = mockStatic(ByteString.class);
             MockedStatic<PaymentProtocol> paymentProtocol = mockStatic(PaymentProtocol.class, CALLS_REAL_METHODS);
             MockedStatic<Protos.PaymentDetails> protosPaymentDetails = mockStatic(Protos.PaymentDetails.class)) {
            protosPaymentDetails.when(() -> Protos.PaymentDetails.newBuilder()).thenReturn(protosPaymentDetailsBuilderMock);
            doReturn(protosPaymentDetailsBuilderMock2).when(protosPaymentDetailsBuilderMock).setNetwork("String");
            doReturn(protosPaymentDetailsBuilderMock3).when(protosPaymentDetailsBuilderMock).addOutputs((Protos.Output) any());
            doReturn(protosPaymentDetailsBuilderMock4).when(protosPaymentDetailsBuilderMock).setMemo("String");
            doReturn(protosPaymentDetailsBuilderMock5).when(protosPaymentDetailsBuilderMock).setPaymentUrl("Protos.PaymentDetails.Builder");
            doReturn(null).when(protosPaymentDetailsBuilderMock).setMerchantData((ByteString) any());
            paymentProtocol.when(() -> PaymentProtocol.protocolIdFromParams((NetworkParameters) any())).thenReturn("String");
            ByteString byteString2 = ByteString.empty();
            byte[] byteArray = new byte[]{(byte) 0};
            byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteString2);
            //TODO: Needs to return real value
            timeUtils.when(() -> TimeUtils.currentTime()).thenReturn(null);
            thrown.expect(NullPointerException.class);
            NetworkParameters networkParameters = NetworkParameters.fromID("id1");
            Protos.Output output = Protos.Output.getDefaultInstance();
            List<Protos.Output> protosOutputList = new ArrayList<>();
            protosOutputList.add(output);
            //Act Statement(s)
            PaymentProtocol.createPaymentRequest(networkParameters, protosOutputList, "String", "Protos.PaymentDetails.Builder", byteArray);
            //Assert statement(s)
            protosPaymentDetails.verify(() -> Protos.PaymentDetails.newBuilder(), atLeast(1));
            verify(protosPaymentDetailsBuilderMock, atLeast(1)).setNetwork("String");
            verify(protosPaymentDetailsBuilderMock, atLeast(1)).addOutputs((Protos.Output) any());
            verify(protosPaymentDetailsBuilderMock, atLeast(1)).setMemo("String");
            verify(protosPaymentDetailsBuilderMock, atLeast(1)).setPaymentUrl("Protos.PaymentDetails.Builder");
            verify(protosPaymentDetailsBuilderMock, atLeast(1)).setMerchantData((ByteString) any());
            paymentProtocol.verify(() -> PaymentProtocol.protocolIdFromParams((NetworkParameters) any()), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray), atLeast(1));
            timeUtils.verify(() -> TimeUtils.currentTime(), atLeast(1));
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
    @Ignore()
    @Test()
    public void signPaymentRequestWhenRSAEqualsIgnoreCasePrivateKeyGetAlgorithm() {
        /* Branches:
         * (for-each(certificateChain)) : true
         * ("RSA".equalsIgnoreCase(privateKey.getAlgorithm())) : true
         */
        //Arrange Statement(s)
        Protos.X509Certificates.Builder protosX509CertificatesBuilderMock = mock(Protos.X509Certificates.Builder.class);
        Protos.PaymentRequest.Builder protosPaymentRequestBuilderMock = mock(Protos.PaymentRequest.Builder.class, "GeneratedMessageLite");
        try (MockedStatic<Protos.X509Certificates> protosX509Certificates = mockStatic(Protos.X509Certificates.class)) {
            protosX509Certificates.when(() -> Protos.X509Certificates.newBuilder()).thenReturn(protosX509CertificatesBuilderMock);
            thrown.expect(NullPointerException.class);
            X509Certificate[] x509CertificateArray = new X509Certificate[]{(X509Certificate) null};
            //TODO: Needs initialization with real value
            PrivateKey privateKey = null;
            //Act Statement(s)
            PaymentProtocol.signPaymentRequest(protosPaymentRequestBuilderMock, x509CertificateArray, privateKey);
            //Assert statement(s)
            protosX509Certificates.verify(() -> Protos.X509Certificates.newBuilder(), atLeast(1));
        }
    }

    //Sapient generated method id: ${e26efa18-d160-36c5-b1a0-e100eef79062}
    @Ignore()
    @Test()
    public void signPaymentRequestWhenRSANotEqualsIgnoreCasePrivateKeyGetAlgorithmThrowsIllegalStateException() {
        /* Branches:
         * (for-each(certificateChain)) : true
         * ("RSA".equalsIgnoreCase(privateKey.getAlgorithm())) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Protos.PaymentRequest.Builder paymentRequestMock = mock(Protos.PaymentRequest.Builder.class, "Protos.PaymentRequest.Builder");
        Protos.PaymentRequest.Builder protosPaymentRequestBuilderMock = mock(Protos.PaymentRequest.Builder.class, "Protos.PaymentRequest.Builder");
        Protos.X509Certificates.Builder protosX509CertificatesBuilderMock = mock(Protos.X509Certificates.Builder.class, "UnknownObjectContent{target='org.bitcoinj.protobuf.payments.Protos$X509Certificates$Builder', onlyPojoFunctions=false, builderPattern=false}");
        Protos.X509Certificates.Builder protosX509CertificatesBuilderMock2 = mock(Protos.X509Certificates.Builder.class, "Protos.X509Certificates.Builder");
        Protos.X509Certificates.Builder protosX509CertificatesBuilderMock3 = mock(Protos.X509Certificates.Builder.class);
        Protos.X509Certificates.Builder protosX509CertificatesBuilderMock4 = mock(Protos.X509Certificates.Builder.class);
        ByteString byteStringMock2 = mock(ByteString.class);
        try (MockedStatic<ByteString> byteString = mockStatic(ByteString.class);
             MockedStatic<Protos.X509Certificates> protosX509Certificates = mockStatic(Protos.X509Certificates.class)) {
            doReturn(protosPaymentRequestBuilderMock).when(paymentRequestMock).setPkiType("x509+sha256");
            protosX509Certificates.when(() -> Protos.X509Certificates.newBuilder()).thenReturn(protosX509CertificatesBuilderMock);
            doReturn(protosX509CertificatesBuilderMock2).when(protosX509CertificatesBuilderMock).addCertificate((ByteString) any());
            doReturn(protosX509CertificatesBuilderMock3).when(protosX509CertificatesBuilderMock).addCertificate(byteStringMock);
            doReturn(protosX509CertificatesBuilderMock4).when(protosX509CertificatesBuilderMock).addCertificate(byteStringMock2);
            doReturn(null).when(protosX509CertificatesBuilderMock).build();
            ByteString byteString2 = ByteString.empty();
            byte[] byteArray = new byte[]{};
            byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteString2);
            byte[] byteArray2 = new byte[]{};
            byteString.when(() -> ByteString.copyFrom(byteArray2)).thenReturn(byteStringMock);
            byte[] byteArray3 = new byte[]{};
            byteString.when(() -> ByteString.copyFrom(byteArray3)).thenReturn(byteStringMock2);
            thrown.expect(NullPointerException.class);
            X509Certificate[] x509CertificateArray2 = new X509Certificate[]{(X509Certificate) null};
            X509Certificate[] x509CertificateArray3 = new X509Certificate[]{(X509Certificate) null};
            X509Certificate[] x509CertificateArray4 = new X509Certificate[]{(X509Certificate) null};
            X509Certificate[] x509CertificateArray = new X509Certificate[]{x509CertificateArray2, x509CertificateArray3, x509CertificateArray4};
            //TODO: Needs initialization with real value
            PrivateKey privateKey = null;
            //Act Statement(s)
            PaymentProtocol.signPaymentRequest(paymentRequestMock, x509CertificateArray, privateKey);
            //Assert statement(s)
            verify(paymentRequestMock).setPkiType("x509+sha256");
            protosX509Certificates.verify(() -> Protos.X509Certificates.newBuilder(), atLeast(1));
            verify(protosX509CertificatesBuilderMock).addCertificate((ByteString) any());
            verify(protosX509CertificatesBuilderMock).addCertificate(byteStringMock);
            verify(protosX509CertificatesBuilderMock).addCertificate(byteStringMock2);
            verify(protosX509CertificatesBuilderMock).build();
            byteString.verify(() -> ByteString.copyFrom(byteArray), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray2), atLeast(1));
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
        Protos.PaymentRequest paymentRequest = Protos.PaymentRequest.getDefaultInstance();
        //TODO: Needs initialization with real value
        KeyStore keyStore = null;

        //Act Statement(s)
        PaymentProtocol.PkiVerificationData result = PaymentProtocol.verifyPaymentRequestPki(paymentRequest, keyStore);

        //Assert statement(s)
        assertThat(result, is(nullValue()));
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
        thrown.expectCause(isA(GeneralSecurityException.class));
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

    //Sapient generated method id: ${8a1b68a5-e7c6-3618-b0f0-6a740be54561}
    @Test()
    public void verifyPaymentRequestPkiWhenX509_sha1NotEqualsPkiTypeThrowsPaymentProtocolExceptionInvalidPkiType() throws PaymentProtocolException {
        /* Branches:
         * ("none".equals(pkiType)) : false
         * ("x509+sha256".equals(pkiType)) : false
         * ("x509+sha1".equals(pkiType)) : false
         */
        //Arrange Statement(s)
        thrown.expect(PaymentProtocolException.InvalidPkiType.class);
        Protos.PaymentRequest paymentRequest = Protos.PaymentRequest.getDefaultInstance();
        //TODO: Needs initialization with real value
        KeyStore keyStore = null;

        //Act Statement(s)
        PaymentProtocol.verifyPaymentRequestPki(paymentRequest, keyStore);
    }

    //Sapient generated method id: ${6b94a25c-1be9-369b-ba74-f5d47bb566fc}
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

    //Sapient generated method id: ${f0f7fadc-3bc3-3edd-85a1-9fbad1d24630}
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
            Protos.Payment payment = Protos.Payment.getDefaultInstance();
            byte[] byteArray = new byte[]{};
            paymentProtocol.when(() -> PaymentProtocol.createPaymentMessage(anyList(), eq((List) null), eq(""), eq(byteArray))).thenReturn(payment);
            List<Transaction> transactionList = new ArrayList<>();
            Coin coin = Coin.valueOf(0L);
            Address address = null;
            //Act Statement(s)
            Protos.Payment result = PaymentProtocol.createPaymentMessage(transactionList, coin, address, "", byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(payment));
            paymentProtocol.verify(() -> PaymentProtocol.createPaymentMessage(anyList(), eq((List) null), eq(""), eq(byteArray)), atLeast(1));
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
        Transaction transaction = new Transaction();
        List<Transaction> transactionList = new ArrayList<>();
        transactionList.add(transaction);
        Coin coin = null;
        Address addressMock = mock(Address.class, "address");
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2};

        //Act Statement(s)
        PaymentProtocol.createPaymentMessage(transactionList, coin, addressMock, "Dummy memo", byteArray);
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
        Protos.Payment protosPaymentMock = mock(Protos.Payment.class);
        try (MockedStatic<PaymentProtocol> paymentProtocol = mockStatic(PaymentProtocol.class, CALLS_REAL_METHODS)) {
            Protos.Output output = Protos.Output.getDefaultInstance();
            paymentProtocol.when(() -> PaymentProtocol.createPayToAddressOutput(coinMock, addressMock)).thenReturn(output);
            byte[] byteArray = new byte[]{};
            paymentProtocol.when(() -> PaymentProtocol.createPaymentMessage(anyList(), anyList(), eq("memo1"), eq(byteArray))).thenReturn(protosPaymentMock);
            List<Transaction> transactionList = new ArrayList<>();
            //Act Statement(s)
            Protos.Payment result = PaymentProtocol.createPaymentMessage(transactionList, coinMock, addressMock, "memo1", byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(protosPaymentMock));
            paymentProtocol.verify(() -> PaymentProtocol.createPayToAddressOutput(coinMock, addressMock), atLeast(1));
            paymentProtocol.verify(() -> PaymentProtocol.createPaymentMessage(anyList(), anyList(), eq("memo1"), eq(byteArray)), atLeast(1));
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
        Protos.Payment.Builder protosPaymentBuilderMock = mock(Protos.Payment.Builder.class, "UnknownObjectContent{target='org.bitcoinj.protobuf.payments.Protos$Payment$Builder', onlyPojoFunctions=false, builderPattern=false}");
        Protos.Payment.Builder protosPaymentBuilderMock2 = mock(Protos.Payment.Builder.class, "Protos.Payment.Builder");
        Protos.Payment.Builder protosPaymentBuilderMock3 = mock(Protos.Payment.Builder.class, "Protos.Payment.Builder");
        Protos.Payment.Builder protosPaymentBuilderMock4 = mock(Protos.Payment.Builder.class, "Protos.Payment.Builder");
        Protos.Payment.Builder protosPaymentBuilderMock5 = mock(Protos.Payment.Builder.class, "Protos.Payment.Builder");
        try (MockedStatic<ByteString> byteString = mockStatic(ByteString.class);
             MockedStatic<Protos.Payment> protosPayment = mockStatic(Protos.Payment.class)) {
            protosPayment.when(() -> Protos.Payment.newBuilder()).thenReturn(protosPaymentBuilderMock);
            doReturn(protosPaymentBuilderMock2).when(protosPaymentBuilderMock).addTransactions((ByteString) any());
            doReturn(protosPaymentBuilderMock3).when(protosPaymentBuilderMock).addRefundTo((Protos.Output) any());
            doReturn(protosPaymentBuilderMock4).when(protosPaymentBuilderMock).setMemo("Test Memo");
            doReturn(protosPaymentBuilderMock5).when(protosPaymentBuilderMock).setMerchantData((ByteString) any());
            Protos.Payment payment = (Protos.Payment) Protos.Payment.getDefaultInstance();
            doReturn(payment).when(protosPaymentBuilderMock).build();
            byte[] byteArray = new byte[]{};
            ByteString byteString2 = ByteString.copyFrom(byteArray);
            byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteString2);
            ByteString byteString3 = ByteString.empty();
            byte[] byteArray2 = new byte[]{(byte) 0};
            byteString.when(() -> ByteString.copyFrom(byteArray2)).thenReturn(byteString3);
            Transaction transaction = new Transaction();
            List<Transaction> transactionList = new ArrayList<>();
            transactionList.add(transaction);
            Protos.Output output = Protos.Output.getDefaultInstance();
            List<Protos.Output> protosOutputList = new ArrayList<>();
            protosOutputList.add(output);
            //Act Statement(s)
            Protos.Payment result = PaymentProtocol.createPaymentMessage(transactionList, protosOutputList, "Test Memo", byteArray2);
            //Assert statement(s)
            assertThat(result, equalTo(payment));
            protosPayment.verify(() -> Protos.Payment.newBuilder(), atLeast(1));
            verify(protosPaymentBuilderMock).addTransactions((ByteString) any());
            verify(protosPaymentBuilderMock).addRefundTo((Protos.Output) any());
            verify(protosPaymentBuilderMock).setMemo("Test Memo");
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
        NetworkParameters networkParameters = NetworkParameters.fromID("id1");
        Protos.Payment payment = Protos.Payment.getDefaultInstance();

        //Act Statement(s)
        List<Transaction> result = PaymentProtocol.parseTransactionsFromPaymentMessage(networkParameters, payment);
        Transaction transaction = new Transaction();
        List<Transaction> transactionResultList = new ArrayList<>(0);
        transactionResultList.add(transaction);

        //Assert statement(s)
        assertThat(result.size(), equalTo(transactionResultList.size()));
        assertThat(result, containsInRelativeOrder(transactionResultList.toArray()));
    }

    //Sapient generated method id: ${26f627f9-b53f-3fad-b031-7a778af0d7c5}
    @Test()
    public void createPaymentAckWhenMemoIsNotNull() {
        /* Branches:
         * (memo != null) : true
         */
        //Arrange Statement(s)
        Protos.PaymentACK.Builder protosPaymentACKBuilderMock = mock(Protos.PaymentACK.Builder.class, "UnknownObjectContent{target='org.bitcoinj.protobuf.payments.Protos$PaymentACK$Builder', onlyPojoFunctions=false, builderPattern=false}");
        Protos.PaymentACK.Builder protosPaymentACKBuilderMock2 = mock(Protos.PaymentACK.Builder.class, "Protos.PaymentACK.Builder");
        Protos.PaymentACK.Builder protosPaymentACKBuilderMock3 = mock(Protos.PaymentACK.Builder.class, "Protos.PaymentACK.Builder");
        try (MockedStatic<Protos.PaymentACK> protosPaymentACK = mockStatic(Protos.PaymentACK.class)) {
            protosPaymentACK.when(() -> Protos.PaymentACK.newBuilder()).thenReturn(protosPaymentACKBuilderMock);
            doReturn(protosPaymentACKBuilderMock2).when(protosPaymentACKBuilderMock).setPayment((Protos.Payment) any());
            doReturn(protosPaymentACKBuilderMock3).when(protosPaymentACKBuilderMock).setMemo("String");
            Protos.PaymentACK paymentACK = (Protos.PaymentACK) Protos.PaymentACK.getDefaultInstance();
            doReturn(paymentACK).when(protosPaymentACKBuilderMock).build();
            Protos.Payment payment = Protos.Payment.getDefaultInstance();
            //Act Statement(s)
            Protos.PaymentACK result = PaymentProtocol.createPaymentAck(payment, "String");
            //Assert statement(s)
            assertThat(result, equalTo(paymentACK));
            protosPaymentACK.verify(() -> Protos.PaymentACK.newBuilder(), atLeast(1));
            verify(protosPaymentACKBuilderMock).setPayment((Protos.Payment) any());
            verify(protosPaymentACKBuilderMock).setMemo("String");
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
        Protos.PaymentACK paymentACK = Protos.PaymentACK.getDefaultInstance();

        //Act Statement(s)
        PaymentProtocol.Ack result = PaymentProtocol.parsePaymentAck(paymentACK);
        PaymentProtocol.Ack paymentProtocolAck = new PaymentProtocol.Ack((String) null);

        //Assert statement(s)
        //TODO: Please implement equals method in Ack for verification to succeed or you need to adjust respective assertion statements
        assertThat(result, equalTo(paymentProtocolAck));
    }

    //Sapient generated method id: ${3f2d4c49-693e-345a-a2f9-a97605644fed}
    @Ignore()
    @Test()
    public void createPayToAddressOutputWhenAmountIsNull() {
        /* Branches:
         * (amount != null) : false
         */
        Address addressMock = mock(Address.class, "Address");
        try (MockedStatic<ByteString> byteString = mockStatic(ByteString.class);
             MockedStatic<ScriptBuilder> scriptBuilder = mockStatic(ScriptBuilder.class);
             MockedStatic<Protos.Output> protosOutput = mockStatic(Protos.Output.class)) {
            protosOutput.when(() -> Protos.Output.newBuilder()).thenReturn(protosOutputBuilderMock);
            doReturn(protosOutputBuilderMock2).when(protosOutputBuilderMock).setAmount(0L);
            doReturn(protosOutputBuilderMock3).when(protosOutputBuilderMock).setScript((ByteString) any());
            Protos.Output output = (Protos.Output) Protos.Output.getDefaultInstance();
            doReturn(output).when(protosOutputBuilderMock).build();
            List list = new ArrayList<>();
            Script script = Script.of(list);
            scriptBuilder.when(() -> ScriptBuilder.createOutputScript(addressMock)).thenReturn(script);
            ByteString byteString2 = ByteString.empty();
            byte[] byteArray = new byte[]{};
            byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteString2);
            Coin coin = null;
            //Act Statement(s)
            Protos.Output result = PaymentProtocol.createPayToAddressOutput(coin, addressMock);
            //Assert statement(s)
            assertThat(result, equalTo(output));
            protosOutput.verify(() -> Protos.Output.newBuilder(), atLeast(1));
            verify(protosOutputBuilderMock).setAmount(0L);
            verify(protosOutputBuilderMock).setScript((ByteString) any());
            verify(protosOutputBuilderMock).build();
            scriptBuilder.verify(() -> ScriptBuilder.createOutputScript(addressMock), atLeast(1));
            byteString.verify(() -> ByteString.copyFrom(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${db8ac907-0629-37e3-b302-a7ed8f5c5daf}
    @Test()
    public void createPayToAddressOutputWhenParamsNetworkExceedsMaxMoneyAmountThrowsIllegalArgumentException() {
        /* Branches:
         * (amount != null) : true
         * (params.network().exceedsMaxMoney(amount)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Protos.Output.Builder protosOutputBuilderMock = mock(Protos.Output.Builder.class, "{}");
        Protos.Output.Builder protosOutputBuilderMock2 = mock(Protos.Output.Builder.class);
        Protos.Output.Builder protosOutputBuilderMock3 = mock(Protos.Output.Builder.class);
        Script scriptMock = mock(Script.class);
        Coin coinMock = mock(Coin.class, "createPayToAddressOutput_coin1");
        try (MockedStatic<ByteString> byteString = mockStatic(ByteString.class);
             MockedStatic<ScriptBuilder> scriptBuilder = mockStatic(ScriptBuilder.class);
             MockedStatic<NetworkParameters> networkParameters = mockStatic(NetworkParameters.class);
             MockedStatic<Protos.Output> protosOutput = mockStatic(Protos.Output.class)) {
            doReturn(networkMock).when(addressMock).network();
            protosOutput.when(() -> Protos.Output.newBuilder()).thenReturn(protosOutputBuilderMock);
            doReturn(protosOutputBuilderMock2).when(protosOutputBuilderMock).setAmount(0L);
            doReturn(protosOutputBuilderMock3).when(protosOutputBuilderMock).setScript(byteStringMock);
            doReturn(null).when(protosOutputBuilderMock).build();
            NetworkParameters networkParameters2 = NetworkParameters.fromID("id1");
            networkParameters.when(() -> NetworkParameters.of(networkMock)).thenReturn(networkParameters2);
            scriptBuilder.when(() -> ScriptBuilder.createOutputScript(addressMock)).thenReturn(scriptMock);
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(scriptMock).program();
            byteString.when(() -> ByteString.copyFrom(byteArray)).thenReturn(byteStringMock);
            //Act Statement(s)
            Protos.Output result = PaymentProtocol.createPayToAddressOutput(coinMock, addressMock);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            verify(addressMock).network();
            protosOutput.verify(() -> Protos.Output.newBuilder(), atLeast(1));
            verify(protosOutputBuilderMock).setAmount(0L);
            verify(protosOutputBuilderMock).setScript(byteStringMock);
            verify(protosOutputBuilderMock).build();
            networkParameters.verify(() -> NetworkParameters.of(networkMock), atLeast(1));
            scriptBuilder.verify(() -> ScriptBuilder.createOutputScript(addressMock), atLeast(1));
            verify(scriptMock).program();
            byteString.verify(() -> ByteString.copyFrom(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${f4a78796-6cec-3423-bb7b-e7d5127aefff}
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
        Protos.Output.Builder protosOutputBuilderMock2 = mock(Protos.Output.Builder.class, "Protos.Output.Builder");
        Protos.Output.Builder protosOutputBuilderMock3 = mock(Protos.Output.Builder.class, "Protos.Output.Builder");
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
        //Arrange Statement(s)
        try (MockedStatic<MainNetParams> mainNetParams = mockStatic(MainNetParams.class)) {
            MainNetParams mainNetParams2 = new MainNetParams();
            mainNetParams.when(() -> MainNetParams.get()).thenReturn(mainNetParams2);
            //Act Statement(s)
            BitcoinNetworkParams result = PaymentProtocol.paramsFromPmtProtocolID("main");
            //Assert statement(s)
            assertThat(result, equalTo(mainNetParams2));
            mainNetParams.verify(() -> MainNetParams.get(), atLeast(1));
        }
    }

    //Sapient generated method id: ${2606a65e-f7c3-32d2-92cf-2c161781a5b2}
    @Test()
    public void paramsFromPmtProtocolIDWhenPmtProtocolIdEqualsPAYMENT_PROTOCOL_ID_TESTNET() {
        /* Branches:
         * (pmtProtocolId.equals(PAYMENT_PROTOCOL_ID_MAINNET)) : false
         * (pmtProtocolId.equals(PAYMENT_PROTOCOL_ID_TESTNET)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<TestNet3Params> testNet3Params = mockStatic(TestNet3Params.class)) {
            TestNet3Params testNet3Params2 = new TestNet3Params();
            testNet3Params.when(() -> TestNet3Params.get()).thenReturn(testNet3Params2);
            //Act Statement(s)
            BitcoinNetworkParams result = PaymentProtocol.paramsFromPmtProtocolID("test");
            //Assert statement(s)
            assertThat(result, equalTo(testNet3Params2));
            testNet3Params.verify(() -> TestNet3Params.get(), atLeast(1));
        }
    }

    //Sapient generated method id: ${f78b31b4-42a4-3c3b-9c35-ac423213adc4}
    @Test()
    public void paramsFromPmtProtocolIDWhenPmtProtocolIdEqualsPAYMENT_PROTOCOL_ID_SIGNET() {
        /* Branches:
         * (pmtProtocolId.equals(PAYMENT_PROTOCOL_ID_MAINNET)) : false
         * (pmtProtocolId.equals(PAYMENT_PROTOCOL_ID_TESTNET)) : false
         * (pmtProtocolId.equals(PAYMENT_PROTOCOL_ID_SIGNET)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<SigNetParams> sigNetParams = mockStatic(SigNetParams.class)) {
            SigNetParams sigNetParams2 = new SigNetParams();
            sigNetParams.when(() -> SigNetParams.get()).thenReturn(sigNetParams2);
            //Act Statement(s)
            BitcoinNetworkParams result = PaymentProtocol.paramsFromPmtProtocolID("signet");
            //Assert statement(s)
            assertThat(result, equalTo(sigNetParams2));
            sigNetParams.verify(() -> SigNetParams.get(), atLeast(1));
        }
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
        //Arrange Statement(s)
        try (MockedStatic<RegTestParams> regTestParams = mockStatic(RegTestParams.class)) {
            RegTestParams regTestParams2 = new RegTestParams();
            regTestParams.when(() -> RegTestParams.get()).thenReturn(regTestParams2);
            //Act Statement(s)
            BitcoinNetworkParams result = PaymentProtocol.paramsFromPmtProtocolID("regtest");
            //Assert statement(s)
            assertThat(result, equalTo(regTestParams2));
            regTestParams.verify(() -> RegTestParams.get(), atLeast(1));
        }
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
        //Arrange Statement(s)
        try (MockedStatic<UnitTestParams> unitTestParams = mockStatic(UnitTestParams.class)) {
            UnitTestParams unitTestParams2 = new UnitTestParams();
            unitTestParams.when(() -> UnitTestParams.get()).thenReturn(unitTestParams2);
            //Act Statement(s)
            BitcoinNetworkParams result = PaymentProtocol.paramsFromPmtProtocolID("unittest");
            //Assert statement(s)
            assertThat(result, equalTo(unitTestParams2));
            unitTestParams.verify(() -> UnitTestParams.get(), atLeast(1));
        }
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
        BitcoinNetworkParams result = PaymentProtocol.paramsFromPmtProtocolID("example");

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
        MainNetParams mainNetParams = new MainNetParams();

        //Act Statement(s)
        String result = PaymentProtocol.protocolIdFromParams(mainNetParams);

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
        TestNet3Params testNet3Params = new TestNet3Params();

        //Act Statement(s)
        String result = PaymentProtocol.protocolIdFromParams(testNet3Params);

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
        SigNetParams sigNetParams = new SigNetParams();

        //Act Statement(s)
        String result = PaymentProtocol.protocolIdFromParams(sigNetParams);

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
        RegTestParams regTestParams = new RegTestParams();

        //Act Statement(s)
        String result = PaymentProtocol.protocolIdFromParams(regTestParams);

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
        UnitTestParams unitTestParams = new UnitTestParams();

        //Act Statement(s)
        String result = PaymentProtocol.protocolIdFromParams(unitTestParams);

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
        NetworkParameters networkParameters = NetworkParameters.fromID("id1");

        //Act Statement(s)
        PaymentProtocol.protocolIdFromParams(networkParameters);
    }
}
