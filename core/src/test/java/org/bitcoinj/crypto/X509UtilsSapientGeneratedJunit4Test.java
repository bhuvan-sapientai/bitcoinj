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

import java.io.ByteArrayInputStream;
import java.security.KeyStore;

import org.mockito.MockedStatic;

import java.security.cert.X509Certificate;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.isA;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class X509UtilsSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${b66ac6a5-4982-36ef-9d06-ea8aa43be4dd}
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
         */
        //Arrange Statement(s)
        thrown.expect(NullPointerException.class);
        //TODO: Needs initialization with real value
        X509Certificate x509Certificate = null;
        //Act Statement(s)
        X509Utils.getDisplayNameFromCertificate(x509Certificate, true);
    }

    //Sapient generated method id: ${722fb798-075e-33cc-a6ae-b5fa34045336}
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
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        X509Certificate x509Certificate = null;
        //Act Statement(s)
        String result = X509Utils.getDisplayNameFromCertificate(x509Certificate, false);
        //Assert statement(s)
        assertThat(result, equalTo("return_of_getString1"));
    }

    //Sapient generated method id: ${d8013215-cc85-3759-a685-56efad6e3827}
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
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        X509Certificate x509Certificate = null;
        //Act Statement(s)
        String result = X509Utils.getDisplayNameFromCertificate(x509Certificate, false);
        //Assert statement(s)
        assertThat(result, equalTo("return_of_getSubjectAlternativeNamesItem1Item2"));
    }

    //Sapient generated method id: ${9b126afb-4ecf-320d-8ce7-bca2184ac8f1}
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
         */
        //Arrange Statement(s)
        thrown.expect(NullPointerException.class);
        //TODO: Needs initialization with real value
        X509Certificate x509Certificate = null;
        //Act Statement(s)
        X509Utils.getDisplayNameFromCertificate(x509Certificate, true);
    }

    //Sapient generated method id: ${952fa8a8-3c02-3d6a-9923-08544e80f75a}
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
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        X509Certificate x509Certificate = null;
        //Act Statement(s)
        String result = X509Utils.getDisplayNameFromCertificate(x509Certificate, false);
        //Assert statement(s)
        assertThat(result, equalTo("return_of_getString1"));
    }

    //Sapient generated method id: ${7ef183af-fd44-3d97-9888-8c11c10023e6}
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
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        X509Certificate x509Certificate = null;
        //Act Statement(s)
        String result = X509Utils.getDisplayNameFromCertificate(x509Certificate, true);
        //Assert statement(s)
        assertThat(result, equalTo("result1"));
    }

    //Sapient generated method id: ${d6b0cd47-df61-3f50-a735-1d3c5c7e8b9f}
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
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        X509Certificate x509Certificate = null;
        //Act Statement(s)
        String result = X509Utils.getDisplayNameFromCertificate(x509Certificate, false);
        //Assert statement(s)
        assertThat(result, equalTo("return_of_getString1"));
    }

    //Sapient generated method id: ${fc7f4ba2-9d5c-3bbe-96dc-cc8f8cf9a49f}
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
         */
        //Arrange Statement(s)
        thrown.expect(NullPointerException.class);
        //TODO: Needs initialization with real value
        X509Certificate x509Certificate = null;
        //Act Statement(s)
        X509Utils.getDisplayNameFromCertificate(x509Certificate, true);
    }

    //Sapient generated method id: ${f04150a9-1b71-39de-a286-8cda15c1405b}
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
         */
        //Arrange Statement(s)
        thrown.expect(NullPointerException.class);
        //TODO: Needs initialization with real value
        X509Certificate x509Certificate = null;
        //Act Statement(s)
        X509Utils.getDisplayNameFromCertificate(x509Certificate, true);
    }

    //Sapient generated method id: ${35d016a0-3c7d-33f3-b548-d9fc0510bc0d}
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
        assertThat(result, is(nullValue()));
    }

    //Sapient generated method id: ${85a902d1-23ca-3d00-9a51-8b5328cf477b}
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
        assertThat(result, is(nullValue()));
    }

    //Sapient generated method id: ${8d373036-7da5-3e2e-b4d6-2bfe866fbd36}
    @Ignore()
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
            //TODO: Needs to return real value
            keyStore.when(() -> KeyStore.getInstance("A")).thenReturn(null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            //Act Statement(s)
            KeyStore result = X509Utils.loadKeyStore("A", "B", inputStream);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            keyStore.verify(() -> KeyStore.getInstance("A"), atLeast(1));
        }
    }

    //Sapient generated method id: ${420b4466-523a-3024-bb2d-6860e3e3e4e4}
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
            //TODO: Needs to return real value
            keyStore.when(() -> KeyStore.getInstance("A")).thenReturn(null);
            thrown.expect(KeyStoreException.class);
            thrown.expectCause(isA(Exception.class));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            //Act Statement(s)
            X509Utils.loadKeyStore("A", (String) null, inputStream);
            //Assert statement(s)
            keyStore.verify(() -> KeyStore.getInstance("A"), atLeast(1));
        }
    }
}
