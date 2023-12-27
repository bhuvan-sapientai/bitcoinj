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
         */
        //Arrange Statement(s)
        thrown.expect(NullPointerException.class);
        //TODO: Needs initialization with real value
        X509Certificate x509Certificate = null;

        //Act Statement(s)
        X509Utils.getDisplayNameFromCertificate(x509Certificate, true);
    }

    //Sapient generated method id: ${9b126afb-4ecf-320d-8ce7-bca2184ac8f1}
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

    //Sapient generated method id: ${fc7f4ba2-9d5c-3bbe-96dc-cc8f8cf9a49f}
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
        assertThat(result, equalTo("return_of_nextItem2"));
    }
}
