package org.bitcoinj.crypto;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.crypto.MnemonicException.MnemonicLengthException;
import org.bitcoinj.crypto.MnemonicException.MnemonicWordException;
import org.bitcoinj.crypto.MnemonicException.MnemonicChecksumException;

import java.io.IOException;

import org.junit.rules.ExpectedException;

import java.util.List;

import org.mockito.stubbing.Answer;

import java.io.ByteArrayInputStream;

import org.bitcoinj.base.internal.Preconditions;
import org.bitcoinj.base.Sha256Hash;
import org.bitcoinj.base.internal.StreamUtils;
import org.bitcoinj.base.internal.Stopwatch;
import org.bitcoinj.base.internal.ByteUtils;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

import java.util.ArrayList;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInRelativeOrder;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

public class MnemonicCodeSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${bbc7e52c-9056-3edb-af4e-83f69b845157}
    @Test()
    public void toSeedTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //byte[] byteMock = mock(byte[].class);
        /*try (MockedStatic<PBKDF2SHA512> pBKDF2SHA512 = mockStatic(PBKDF2SHA512.class);
    MockedStatic<Stopwatch> stopwatch = mockStatic(Stopwatch.class)) {
    Stopwatch stopwatch2 = Stopwatch.start();
    stopwatch.when(() -> Stopwatch.start()).thenReturn(stopwatch2);
    pBKDF2SHA512.when(() -> PBKDF2SHA512.derive("B", "mnemonicA", 2048, 64)).thenThrow(byteMock);
    thrown.expect(byte[].class);
    List<String> stringList = new ArrayList<>();
    //Act Statement(s)
    MnemonicCode.toSeed(stringList, "A");
    //Assert statement(s)
    stopwatch.verify(() -> Stopwatch.start(), atLeast(1));
    pBKDF2SHA512.verify(() -> PBKDF2SHA512.derive("B", "mnemonicA", 2048, 64), atLeast(1));
}*/
    }

    //Sapient generated method id: ${cd6664c3-b205-317a-8c07-54f8cb1633ba}
    @Test()
    public void toEntropyWhenWordsSizeModulus3GreaterThan0ThrowsMnemonicExceptionMnemonicLengthException() throws MnemonicLengthException, MnemonicWordException, MnemonicChecksumException, IOException, IllegalArgumentException {
        /* Branches:
         * (words.size() % 3 > 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        //InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        //MnemonicCode target = new MnemonicCode(inputStream, "wordListDigest1");
        //thrown.expect(MnemonicException.MnemonicLengthException.class);
        //List<String> stringList = new ArrayList<>();
        //Act Statement(s)
        //target.toEntropy(stringList);
    }

    //Sapient generated method id: ${973fbebd-53b7-3c6e-a1fd-f480f251ddc2}
    @Test()
    public void toEntropyWhenWordsSizeEquals0ThrowsMnemonicExceptionMnemonicLengthException() throws MnemonicLengthException, MnemonicWordException, MnemonicChecksumException, IOException, IllegalArgumentException {
        /* Branches:
         * (words.size() % 3 > 0) : false
         * (words.size() == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        //InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        //MnemonicCode target = new MnemonicCode(inputStream, "wordListDigest1");
        //thrown.expect(MnemonicException.MnemonicLengthException.class);
        //List<String> stringList = new ArrayList<>();
        //Act Statement(s)
        //target.toEntropy(stringList);
    }

    //Sapient generated method id: ${217e12af-132b-3155-8355-f57077b628c3}
    @Test()
    public void toEntropyWhenNdxLessThan0ThrowsMnemonicExceptionMnemonicWordException() throws MnemonicLengthException, MnemonicWordException, MnemonicChecksumException, IOException, IllegalArgumentException {
        /* Branches:
         * (words.size() % 3 > 0) : false
         * (words.size() == 0) : false
         * (for-each(words)) : true
         * (ndx < 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        //InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        //MnemonicCode target = new MnemonicCode(inputStream, "wordListDigest1");
        //thrown.expect(MnemonicException.MnemonicWordException.class);
        //List<String> stringList = new ArrayList<>();
        //Act Statement(s)
        //target.toEntropy(stringList);
    }

    //Sapient generated method id: ${8796868f-bc14-312a-8177-3b0f021a7660}
    @Test()
    public void toEntropyWhenINotLessThanChecksumLengthBits() throws MnemonicLengthException, MnemonicWordException, MnemonicChecksumException, IOException, IllegalArgumentException {
        /* Branches:
         * (words.size() % 3 > 0) : false
         * (words.size() == 0) : false
         * (for-each(words)) : true
         * (ndx < 0) : false
         * (ii < 11) : true
         * ((wordindex * 11) + ii) : true
         * (ii < entropy.length) : true
         * (jj < 8) : true
         * (concatBits[(ii * 8) + jj]) : true
         * (i < data.length) : true  #  inside bytesToBits method
         * (j < 8) : true  #  inside bytesToBits method
         * ((i * 8) + j) : true  #  inside bytesToBits method
         * (i < checksumLengthBits) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class, CALLS_REAL_METHODS)) {
    byte[] byteArray = new byte[] {};
    byte[] byteArray2 = new byte[] {};
    sha256Hash.when(() -> Sha256Hash.hash(byteArray2)).thenReturn(byteArray);
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
    MnemonicCode target = new MnemonicCode(inputStream, "wordListDigest1");
    List<String> stringList = new ArrayList<>();
    //Act Statement(s)
    byte[] result = target.toEntropy(stringList);
    //Assert statement(s)
    assertThat(result, equalTo(byteArray2));
    sha256Hash.verify(() -> Sha256Hash.hash(byteArray2), atLeast(1));
}*/
    }

    //Sapient generated method id: ${0a62abab-0505-343f-b42e-33f2aaec19a1}
    @Test()
    public void toEntropyWhenEntropyLengthBitsPlusIIndexOfConcatBitsNotEqualsIIndexOfHaThrowsMnemonicExceptionMnemonicChecksumException() throws MnemonicLengthException, MnemonicWordException, MnemonicChecksumException, IOException, IllegalArgumentException {
        /* Branches:
         * (words.size() % 3 > 0) : false
         * (words.size() == 0) : false
         * (for-each(words)) : true
         * (ndx < 0) : false
         * (ii < 11) : true
         * ((wordindex * 11) + ii) : true
         * (ii < entropy.length) : true
         * (jj < 8) : true
         * (concatBits[(ii * 8) + jj]) : true
         * (i < data.length) : true  #  inside bytesToBits method
         * (j < 8) : true  #  inside bytesToBits method
         * ((i * 8) + j) : true  #  inside bytesToBits method
         * (i < checksumLengthBits) : true
         * (concatBits[entropyLengthBits + i] != hashBits[i]) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class, CALLS_REAL_METHODS)) {
    byte[] byteArray = new byte[] {};
    byte[] byteArray2 = new byte[] {};
    sha256Hash.when(() -> Sha256Hash.hash(byteArray2)).thenReturn(byteArray);
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
    MnemonicCode target = new MnemonicCode(inputStream, "wordListDigest1");
    thrown.expect(MnemonicException.MnemonicChecksumException.class);
    List<String> stringList = new ArrayList<>();
    //Act Statement(s)
    target.toEntropy(stringList);
    //Assert statement(s)
    sha256Hash.verify(() -> Sha256Hash.hash(byteArray2), atLeast(1));
}*/
    }

    //Sapient generated method id: ${a116309e-a6de-3f0d-b2d6-cdb2dc854864}
    @Test()
    public void toMnemonicWhenIMultipliedBy11PlusJNotIndexOfConcatBits() throws IOException, IllegalArgumentException {
        /* Branches:
         * (entropy.length % 4 == 0) : true
         * (entropy.length > 0) : true
         * (i < data.length) : true  #  inside bytesToBits method
         * (j < 8) : true  #  inside bytesToBits method
         * ((i * 8) + j) : true  #  inside bytesToBits method
         * (i < nwords) : true
         * (j < 11) : true
         * (concatBits[(i * 11) + j]) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class, CALLS_REAL_METHODS);
    MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
    preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    byte[] byteArray = new byte[] {};
    byte[] byteArray2 = new byte[] {};
    sha256Hash.when(() -> Sha256Hash.hash(byteArray2)).thenReturn(byteArray);
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
    MnemonicCode target = new MnemonicCode(inputStream, "wordListDigest1");
    //Act Statement(s)
    List<String> result = target.toMnemonic(byteArray2);
    List<String> stringResultList = new ArrayList<>();
    stringResultList.add("resultItem1");
    //Assert statement(s)
    assertThat(result.size(), equalTo(stringResultList.size()));
    assertThat(result, containsInRelativeOrder(stringResultList.toArray()));
    preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(2));
    sha256Hash.verify(() -> Sha256Hash.hash(byteArray2), atLeast(1));
}*/
    }

    //Sapient generated method id: ${f9cae5fb-7a74-3290-b15f-1bbc915cb180}
    @Test()
    public void checkTest() throws MnemonicException, MnemonicLengthException, MnemonicWordException, MnemonicChecksumException, IOException, IllegalArgumentException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        //InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        //MnemonicCode target = spy(new MnemonicCode(inputStream, "wordListDigest1"));
        //byte[] byteArray = new byte[] {};
        //List<String> stringList = new ArrayList<>();
        //doReturn(byteArray).when(target).toEntropy(stringList);
        //Act Statement(s)
        //target.check(stringList);
        //Assert statement(s)
        //verify(target).toEntropy(stringList);
    }
}
