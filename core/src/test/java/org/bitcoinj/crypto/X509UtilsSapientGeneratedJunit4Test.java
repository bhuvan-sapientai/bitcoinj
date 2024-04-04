package org.bitcoinj.crypto;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.security.cert.CertificateParsingException;
import java.security.GeneralSecurityException;
import java.io.IOException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

import org.junit.rules.ExpectedException;

import java.util.List;
import javax.security.auth.x500.X500Principal;
import java.io.ByteArrayInputStream;
import java.security.KeyStore;
import java.util.Collection;

import org.mockito.MockedStatic;

import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class X509UtilsSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final X509Certificate certificateMock = mock(X509Certificate.class);

    private final KeyStore keyStoreMock = mock(KeyStore.class);

    private final X509Certificate x509CertificateMock = mock(X509Certificate.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${b66ac6a5-4982-36ef-9d06-ea8aa43be4dd}, hash: 4933BA20CA8245E85A1A39177B787E5F
    @Ignore()
    @Test()
    public void getDisplayNameFromCertificateWhenSubjectAlternativeNameGet0Equals1AndOrgIsNullAndCommonNameIsNotNull() throws CertificateParsingException {
        /* Branches:
         * (for-each(name.getRDNs())) : true
         * (type.equals(RFC4519Style.cn)) : true
         * (subjectAlternativeNames != null) : true
         * (for-each(subjectAlternativeNames)) : true
         * ((Integer) subjectAlternativeName.get(0) == 1) : true
         * (org != null) : false
         * (commonName != null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: name
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        String result = X509Utils.getDisplayNameFromCertificate(x509CertificateMock, false);
        //Assert statement(s)
        assertThat(result, equalTo("return_of_getString1"));
    }

    //Sapient generated method id: ${722fb798-075e-33cc-a6ae-b5fa34045336}, hash: B7A5E10676FC3F4CB2099DA87955066B
    @Ignore()
    @Test()
    public void getDisplayNameFromCertificateWhenSubjectAlternativeNameGet0Equals1AndCaughtCertificateParsingExceptionAndOrgIsNullAndCo() throws CertificateParsingException {
        /* Branches:
         * (for-each(name.getRDNs())) : true
         * (type.equals(RFC4519Style.cn)) : true
         * (subjectAlternativeNames != null) : true
         * (for-each(subjectAlternativeNames)) : true
         * ((Integer) subjectAlternativeName.get(0) == 1) : true
         * (catch-exception (CertificateParsingException)) : true
         * (org != null) : false
         * (commonName != null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: name
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        X500Principal x500Principal = new X500Principal("name1");
        doReturn(x500Principal).when(certificateMock).getSubjectX500Principal();
        Object object = new Object();
        List<Object> anyList = new ArrayList<>();
        anyList.add(object);
        Collection<List<?>> collection = new ArrayList<>();
        collection.add(anyList);
        doReturn(collection).when(certificateMock).getSubjectAlternativeNames();
        //Act Statement(s)
        String result = X509Utils.getDisplayNameFromCertificate(certificateMock, false);
        //Assert statement(s)
        assertThat(result, equalTo("return_of_getString1"));
        verify(certificateMock).getSubjectX500Principal();
        verify(certificateMock).getSubjectAlternativeNames();
    }

    //Sapient generated method id: ${d8013215-cc85-3759-a685-56efad6e3827}, hash: EDC9748A0CEAFD4E0D825ADECED9C550
    @Ignore()
    @Test()
    public void getDisplayNameFromCertificateWhenCaughtCertificateParsingExceptionAndOrgIsNullAndCommonNameIsNull3() throws CertificateParsingException {
        /* Branches:
         * (for-each(name.getRDNs())) : true
         * (type.equals(RFC4519Style.cn)) : true
         * (subjectAlternativeNames != null) : true
         * (for-each(subjectAlternativeNames)) : true
         * ((Integer) subjectAlternativeName.get(0) == 1) : true
         * (catch-exception (CertificateParsingException)) : true
         * (org != null) : false
         * (commonName != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: name
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        X500Principal x500Principal = new X500Principal("name1");
        doReturn(x500Principal).when(certificateMock).getSubjectX500Principal();
        Object object = new Object();
        List<Object> anyList = new ArrayList<>();
        anyList.add(object);
        Collection<List<?>> collection = new ArrayList<>();
        collection.add(anyList);
        doReturn(collection).when(certificateMock).getSubjectAlternativeNames();
        //Act Statement(s)
        String result = X509Utils.getDisplayNameFromCertificate(certificateMock, false);
        //Assert statement(s)
        assertThat(result, equalTo("return_of_getString1"));
        verify(certificateMock).getSubjectX500Principal();
        verify(certificateMock).getSubjectAlternativeNames();
    }

    //Sapient generated method id: ${9b126afb-4ecf-320d-8ce7-bca2184ac8f1}, hash: 1838E2A62831F8DC6DB9F4A50CE74411
    @Ignore()
    @Test()
    public void getDisplayNameFromCertificateWhenSubjectAlternativeNameGet0Equals1AndOrgIsNotNullAndWithLocation() throws CertificateParsingException {
        /* Branches:
         * (for-each(name.getRDNs())) : true
         * (type.equals(RFC4519Style.cn)) : false
         * (type.equals(RFC4519Style.o)) : true
         * (subjectAlternativeNames != null) : true
         * (for-each(subjectAlternativeNames)) : true
         * ((Integer) subjectAlternativeName.get(0) == 1) : true
         * (org != null) : true
         * (withLocation) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: name
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        String result = X509Utils.getDisplayNameFromCertificate(x509CertificateMock, true);
        //Assert statement(s)
        assertThat(result, equalTo("A"));
    }

    //Sapient generated method id: ${952fa8a8-3c02-3d6a-9923-08544e80f75a}, hash: C363893EA3559E13A35475B499C1D71C
    @Ignore()
    @Test()
    public void getDisplayNameFromCertificateWhenSubjectAlternativeNameGet0Equals1AndOrgIsNotNullAndNotWithLocation() throws CertificateParsingException {
        /* Branches:
         * (for-each(name.getRDNs())) : true
         * (type.equals(RFC4519Style.cn)) : false
         * (type.equals(RFC4519Style.o)) : true
         * (subjectAlternativeNames != null) : true
         * (for-each(subjectAlternativeNames)) : true
         * ((Integer) subjectAlternativeName.get(0) == 1) : true
         * (org != null) : true
         * (withLocation) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: name
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        String result = X509Utils.getDisplayNameFromCertificate(x509CertificateMock, false);
        //Assert statement(s)
        assertThat(result, equalTo("return_of_getString1"));
    }

    //Sapient generated method id: ${7ef183af-fd44-3d97-9888-8c11c10023e6}, hash: B399AC40764BDD19C5F152255B1094B2
    @Ignore()
    @Test()
    public void getDisplayNameFromCertificateWhenCaughtCertificateParsingExceptionAndOrgIsNotNullAndWithLocation() throws CertificateParsingException {
        /* Branches:
         * (for-each(name.getRDNs())) : true
         * (type.equals(RFC4519Style.cn)) : false
         * (type.equals(RFC4519Style.o)) : true
         * (subjectAlternativeNames != null) : true
         * (for-each(subjectAlternativeNames)) : true
         * ((Integer) subjectAlternativeName.get(0) == 1) : true
         * (catch-exception (CertificateParsingException)) : true
         * (org != null) : true
         * (withLocation) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: name
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        X500Principal x500Principal = new X500Principal("name1");
        doReturn(x500Principal).when(certificateMock).getSubjectX500Principal();
        Object object = new Object();
        List<Object> anyList = new ArrayList<>();
        anyList.add(object);
        Collection<List<?>> collection = new ArrayList<>();
        collection.add(anyList);
        doReturn(collection).when(certificateMock).getSubjectAlternativeNames();
        //Act Statement(s)
        String result = X509Utils.getDisplayNameFromCertificate(certificateMock, false);
        //Assert statement(s)
        assertThat(result, equalTo("<String value>"));
        verify(certificateMock).getSubjectX500Principal();
        verify(certificateMock).getSubjectAlternativeNames();
    }

    //Sapient generated method id: ${d6b0cd47-df61-3f50-a735-1d3c5c7e8b9f}, hash: 6A06DDC39DA954F319D58F3F34D5209B
    @Ignore()
    @Test()
    public void getDisplayNameFromCertificateWhenCaughtCertificateParsingExceptionAndOrgIsNotNullAndNotWithLocation() throws CertificateParsingException {
        /* Branches:
         * (for-each(name.getRDNs())) : true
         * (type.equals(RFC4519Style.cn)) : false
         * (type.equals(RFC4519Style.o)) : true
         * (subjectAlternativeNames != null) : true
         * (for-each(subjectAlternativeNames)) : true
         * ((Integer) subjectAlternativeName.get(0) == 1) : true
         * (catch-exception (CertificateParsingException)) : true
         * (org != null) : true
         * (withLocation) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: name
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        X500Principal x500Principal = new X500Principal("name1");
        doReturn(x500Principal).when(certificateMock).getSubjectX500Principal();
        Object object = new Object();
        List<Object> anyList = new ArrayList<>();
        anyList.add(object);
        Collection<List<?>> collection = new ArrayList<>();
        collection.add(anyList);
        doReturn(collection).when(certificateMock).getSubjectAlternativeNames();
        //Act Statement(s)
        String result = X509Utils.getDisplayNameFromCertificate(certificateMock, false);
        //Assert statement(s)
        assertThat(result, equalTo("return_of_getString1"));
        verify(certificateMock).getSubjectX500Principal();
        verify(certificateMock).getSubjectAlternativeNames();
    }

    //Sapient generated method id: ${fc7f4ba2-9d5c-3bbe-96dc-cc8f8cf9a49f}, hash: 769C4A698FFEA551AC43AC4D9CC5185D
    @Ignore()
    @Test()
    public void getDisplayNameFromCertificateWhenSubjectAlternativeNameGet0Equals1AndOrgIsNullAndCommonNameIsNull3() throws CertificateParsingException {
        /* Branches:
         * (for-each(name.getRDNs())) : true
         * (type.equals(RFC4519Style.cn)) : false
         * (type.equals(RFC4519Style.o)) : false
         * (type.equals(RFC4519Style.l)) : true
         * (subjectAlternativeNames != null) : true
         * (for-each(subjectAlternativeNames)) : true
         * ((Integer) subjectAlternativeName.get(0) == 1) : true
         * (org != null) : false
         * (commonName != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: name
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        String result = X509Utils.getDisplayNameFromCertificate(x509CertificateMock, false);
        //Assert statement(s)
        assertThat(result, equalTo("var9ItemItem1Item2"));
    }

    //Sapient generated method id: ${f04150a9-1b71-39de-a286-8cda15c1405b}, hash: BE57EE56FD501CF5E0BF9AECEEB86123
    @Ignore()
    @Test()
    public void getDisplayNameFromCertificateWhenSubjectAlternativeNameGet0Equals1AndOrgIsNullAndCommonNameIsNull4() throws CertificateParsingException {
        /* Branches:
         * (for-each(name.getRDNs())) : true
         * (type.equals(RFC4519Style.cn)) : false
         * (type.equals(RFC4519Style.o)) : false
         * (type.equals(RFC4519Style.l)) : false
         * (type.equals(RFC4519Style.c)) : true
         * (subjectAlternativeNames != null) : true
         * (for-each(subjectAlternativeNames)) : true
         * ((Integer) subjectAlternativeName.get(0) == 1) : true
         * (org != null) : false
         * (commonName != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: name
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        String result = X509Utils.getDisplayNameFromCertificate(x509CertificateMock, false);
        //Assert statement(s)
        assertThat(result, equalTo("var9ItemItem1Item2"));
    }

    //Sapient generated method id: ${35d016a0-3c7d-33f3-b548-d9fc0510bc0d}, hash: 6834C6601D6EEA383F864819F1AC38D0
    @Ignore()
    @Test()
    public void loadKeyStoreWhenKeystorePasswordIsNotNull() throws GeneralSecurityException, IOException {
        /* Branches:
         * (keystorePassword != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        //Act Statement(s)
        KeyStore result = X509Utils.loadKeyStore("A", "B", inputStream);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${85a902d1-23ca-3d00-9a51-8b5328cf477b}, hash: F450F2F6CBED84707FC426556E4C367E
    @Ignore()
    @Test()
    public void loadKeyStoreWhenKeystorePasswordIsNull() throws GeneralSecurityException, IOException {
        /* Branches:
         * (keystorePassword != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        //Act Statement(s)
        KeyStore result = X509Utils.loadKeyStore("A", (String) null, inputStream);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${8d373036-7da5-3e2e-b4d6-2bfe866fbd36}, hash: 5913CB5D2EBD7D9421FB5300A6535A64
    @Test()
    public void loadKeyStoreWhenCaughtIOException() throws IOException, GeneralSecurityException {
        /* Branches:
         * (keystorePassword != null) : true
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<KeyStore> keyStore = mockStatic(KeyStore.class)) {
            keyStore.when(() -> KeyStore.getInstance("A")).thenReturn(keyStoreMock);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            char[] charArray = new char[]{'B'};
            doNothing().when(keyStoreMock).load(inputStream, charArray);
            //Act Statement(s)
            KeyStore result = X509Utils.loadKeyStore("A", "B", inputStream);
            //Assert statement(s)
            assertThat(result, equalTo(keyStoreMock));
            keyStore.verify(() -> KeyStore.getInstance("A"), atLeast(1));
            verify(keyStoreMock, atLeast(1)).load(inputStream, charArray);
        }
    }

    //Sapient generated method id: ${420b4466-523a-3024-bb2d-6860e3e3e4e4}, hash: 193852C76C112277553A90FE1EE6E3E1
    @Ignore()
    @Test()
    public void loadKeyStoreWhenKeystorePasswordIsNullAndCaughtIOExceptionOrGeneralSecurityExceptionThrowsKeyStoreException() throws KeyStoreException, IOException, NoSuchAlgorithmException, CertificateException {
        /* Branches:
         * (keystorePassword != null) : false
         * (catch-exception (IOException | GeneralSecurityException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<KeyStore> keyStore = mockStatic(KeyStore.class)) {
            keyStore.when(() -> KeyStore.getInstance("A")).thenReturn(keyStoreMock);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            doNothing().when(keyStoreMock).load(inputStream, null);
            thrown.expect(KeyStoreException.class);
            thrown.expectCause(is(instanceOf(Exception.class)));
            //Act Statement(s)
            X509Utils.loadKeyStore("A", (String) null, inputStream);
            //Assert statement(s)
            keyStore.verify(() -> KeyStore.getInstance("A"), atLeast(1));
            verify(keyStoreMock).load(inputStream, null);
        }
    }
}
