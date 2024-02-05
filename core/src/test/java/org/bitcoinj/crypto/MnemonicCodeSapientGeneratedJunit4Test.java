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
import org.bitcoinj.base.internal.InternalUtils;
import org.bitcoinj.base.internal.StreamUtils;
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

import org.junit.Ignore;

public class MnemonicCodeSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${bbc7e52c-9056-3edb-af4e-83f69b845157}
    @Ignore()
    @Test()
    public void toSeedTest() {
        //Arrange Statement(s)
        InternalUtils.Joiner SPACE_JOINERMock = mock(InternalUtils.Joiner.class);
        List<String> stringList = new ArrayList<>();
        doReturn("B").when(SPACE_JOINERMock).join(stringList);
        //Act Statement(s)
        byte[] result = MnemonicCode.toSeed(stringList, "A");
        byte[] byteResultArray = new byte[]{(byte) 102, (byte) 64, (byte) -79, (byte) -70, (byte) -21, (byte) 103, (byte) -127, (byte) -29, (byte) -112, (byte) 37, (byte) -101, (byte) -50, (byte) 91, (byte) 82, (byte) 102, (byte) -52, (byte) -86, (byte) -57, (byte) 93, (byte) -29, (byte) 4, (byte) 15, (byte) 63, (byte) -57, (byte) -53, (byte) 114, (byte) -61, (byte) 64, (byte) 97, (byte) 58, (byte) 9, (byte) 60, (byte) -92, (byte) 38, (byte) 73, (byte) -21, (byte) 116, (byte) -4, (byte) 54, (byte) 10, (byte) -9, (byte) 26, (byte) -61, (byte) 58, (byte) 126, (byte) -56, (byte) -66, (byte) -91, (byte) -21, (byte) 127, (byte) 113, (byte) -120, (byte) -64, (byte) -85, (byte) 120, (byte) -1, (byte) -32, (byte) 24, (byte) 40, (byte) 20, (byte) 102, (byte) 66, (byte) -128, (byte) -95};
        //Assert statement(s)
        assertThat(result, equalTo(byteResultArray));
        verify(SPACE_JOINERMock).join(stringList);
    }

    //Sapient generated method id: ${cd6664c3-b205-317a-8c07-54f8cb1633ba}
    @Ignore()
    @Test()
    public void toEntropyWhenWordsSizeModulus3GreaterThan0ThrowsMnemonicExceptionMnemonicLengthException() throws MnemonicLengthException, MnemonicWordException, MnemonicChecksumException, IOException, IllegalArgumentException {
        /* Branches:
         * (words.size() % 3 > 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        MnemonicCode target = new MnemonicCode(inputStream, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        thrown.expect(MnemonicException.MnemonicLengthException.class);
        List<String> stringList = new ArrayList<>();
        stringList.add("wordsItem1");
        //Act Statement(s)
        target.toEntropy(stringList);
    }

    //Sapient generated method id: ${973fbebd-53b7-3c6e-a1fd-f480f251ddc2}
    @Ignore()
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
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        MnemonicCode target = new MnemonicCode(inputStream, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        thrown.expect(MnemonicException.MnemonicLengthException.class);
        List<String> stringList = new ArrayList<>();
        //Act Statement(s)
        target.toEntropy(stringList);
    }

    //Sapient generated method id: ${217e12af-132b-3155-8355-f57077b628c3}
    @Ignore()
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
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        MnemonicCode target = new MnemonicCode(inputStream, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        thrown.expect(MnemonicException.MnemonicWordException.class);
        List<String> stringList = new ArrayList<>();
        stringList.add("wordsItem1");
        stringList.add("wordsItem2");
        stringList.add("wordsItem3");
        //Act Statement(s)
        target.toEntropy(stringList);
    }

    //Sapient generated method id: ${8796868f-bc14-312a-8177-3b0f021a7660}
    @Ignore()
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
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{};
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
        }
    }

    //Sapient generated method id: ${0a62abab-0505-343f-b42e-33f2aaec19a1}
    @Ignore()
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
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{(byte) 80, (byte) -56, (byte) -70, (byte) 58, (byte) 97, (byte) 112, (byte) -16, (byte) -94, (byte) -5, (byte) 103, (byte) 54, (byte) -20, (byte) -24, (byte) -90, (byte) 3, (byte) 87, (byte) 110, (byte) -10, (byte) 48, (byte) -102, (byte) 53, (byte) -24, (byte) 16, (byte) -111, (byte) 21, (byte) -103, (byte) -68, (byte) 98, (byte) 17, (byte) -75, (byte) 84, (byte) -87};
            byte[] byteArray2 = new byte[]{(byte) -128, (byte) 0, (byte) 0, (byte) 0};
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
        }
    }

    //Sapient generated method id: ${c2bf30d3-4ec5-3094-b164-ca7c02ba598b}
    @Ignore()
    @Test()
    public void toMnemonicWhenEntropyLengthModulus4Equals0ThrowsIllegalArgumentException() throws IOException, IllegalArgumentException {
        /* Branches:
         * (entropy.length % 4 == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            MnemonicCode target = new MnemonicCode(inputStream, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
            thrown.expect(IllegalArgumentException.class);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            target.toMnemonic(byteArray);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${d3bb7104-47c3-3ac9-b102-8a8ca49085dc}
    @Ignore()
    @Test()
    public void toMnemonicWhenEntropyLengthModulus4NotEquals0ThrowsIllegalArgumentException() throws IOException, IllegalArgumentException {
        /* Branches:
         * (entropy.length % 4 == 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            MnemonicCode target = new MnemonicCode(inputStream, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
            thrown.expect(IllegalArgumentException.class);
            byte[] byteArray = new byte[]{(byte) 0};
            //Act Statement(s)
            target.toMnemonic(byteArray);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${f9cae5fb-7a74-3290-b15f-1bbc915cb180}
    @Ignore()
    @Test()
    public void checkTest() throws MnemonicException, MnemonicLengthException, MnemonicWordException, MnemonicChecksumException, IOException, IllegalArgumentException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        MnemonicCode target = spy(new MnemonicCode(inputStream, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855"));
        byte[] byteArray = new byte[]{};
        List<String> stringList = new ArrayList<>();
        doReturn(byteArray).when(target).toEntropy(stringList);
        //Act Statement(s)
        target.check(stringList);
        //Assert statement(s)
        verify(target).toEntropy(stringList);
    }
}
