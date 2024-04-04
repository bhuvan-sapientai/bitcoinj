package org.bitcoinj.base;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.base.exceptions.AddressFormatException;
import org.junit.rules.ExpectedException;

import java.math.BigInteger;

import org.bitcoinj.base.internal.ByteUtils;
import org.mockito.MockedStatic;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

public class Base58SapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${35249b84-fbfc-3973-b41c-80dcbf08fff1}, hash: 2DBB58E5CF041C44102B7EDD5AA992B8
    @Test()
    public void encodeWhenInputLengthEquals0() {
        /* Branches:
         * (input.length == 0) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        String result = Base58.encode(byteArray);
        //Assert statement(s)
        assertThat(result, equalTo(""));
    }

    //Sapient generated method id: ${9ffe52a2-f6c8-31e4-a06f-316354bb76db}, hash: 94538E85EB72E30E0AF6EF8652DFE87C
    @Ignore()
    @Test()
    public void encodeWhenOutputStartIndexOfEncodedEqualsENCODED_ZEROAndZerosGreaterThanOrEqualsTo0() {
        /* Branches:
         * (input.length == 0) : false
         * (zeros < input.length) : true
         * (input[zeros] == 0) : true
         * (inputStart < input.length) : true
         * (i < number.length) : true  #  inside divmod method
         * (input[inputStart] == 0) : true
         * (outputStart < encoded.length) : true
         * (encoded[outputStart] == ENCODED_ZERO) : true
         * (--zeros >= 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0};
        //Act Statement(s)
        String result = Base58.encode(byteArray);
        //Assert statement(s)
        assertThat(result, equalTo("result1"));
    }

    //Sapient generated method id: ${d6c64f95-dfe3-361a-9629-53d0620784ff}, hash: 473C2BFCCB4871D8562E9C02D4462870
    @Test()
    public void encodeCheckedWhenVersionGreaterThan255ThrowsIllegalArgumentException() {
        /* Branches:
         * (version < 0) : false
         * (version > 255) : true
         */
        //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Version not in range.");
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(illegalArgumentException.getMessage());
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        Base58.encodeChecked(256, byteArray);
    }

    //Sapient generated method id: ${d2931715-ecaa-3ff6-ba6d-b16bac9265ab}, hash: E3872CA25AAF68D9E679EAEE0B0C078E
    @Test()
    public void encodeCheckedWhenVersionNotGreaterThan255() {
        /* Branches:
         * (version < 0) : false
         * (version > 255) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 20, (byte) 6, (byte) -32, (byte) 88};
            base58.when(() -> Base58.encode(byteArray)).thenReturn("return_of_encode1");
            byte[] byteArray2 = new byte[]{};
            //Act Statement(s)
            String result = Base58.encodeChecked(0, byteArray2);
            //Assert statement(s)
            assertThat(result, equalTo("return_of_encode1"));
            base58.verify(() -> Base58.encode(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${3ff6cf1c-73aa-3557-b401-4d92b129657a}, hash: E30BDBF5FCEEAB799222BBD9B15A24C4
    @Test()
    public void decodeWhenInputLengthEquals0() throws AddressFormatException {
        /* Branches:
         * (input.length() == 0) : true
         */
        //Act Statement(s)
        byte[] result = Base58.decode("");
        //Assert statement(s)
        assertThat(result.length, equalTo(0));
    }

    //Sapient generated method id: ${3b46bdbd-16c4-3445-9690-b660a76f1610}, hash: 730BAF5C6EC411B056EA9DE16EBF9017
    @Test()
    public void decodeWhenCNotLessThan128AndDigitLessThan0ThrowsAddressFormatExceptionInvalidCharacter() throws AddressFormatException {
        /* Branches:
         * (input.length() == 0) : false
         * (i < input.length()) : true
         * (c < 128) : false
         * (digit < 0) : true
         */
        //Arrange Statement(s)
        thrown.expect(AddressFormatException.InvalidCharacter.class);
        //Act Statement(s)
        Base58.decode("\uFFFF");
    }

    //Sapient generated method id: ${6132aca1-469e-3b26-86e7-fd52897896b4}, hash: CC436B1492411522F109C2BE1DD5F624
    @Ignore()
    @Test()
    public void decodeWhenInputStartIndexOfInput58NotEquals0AndOutputStartLessThanDecodedLengthAndOutputStartIndexOfDecodedNotEquals0() throws AddressFormatException {
        /* Branches:
         * (input.length() == 0) : false
         * (i < input.length()) : true
         * (c < 128) : true
         * (digit < 0) : false
         * (zeros < input58.length) : true
         * (input58[zeros] == 0) : true
         * (inputStart < input58.length) : true
         * (i < number.length) : true  #  inside divmod method
         * (input58[inputStart] == 0) : false
         * (outputStart < decoded.length) : true
         * (decoded[outputStart] == 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        byte[] result = Base58.decode("1A");
        byte[] byteResultArray = new byte[]{(byte) 0, (byte) 0};
        //Assert statement(s)
        assertThat(result, equalTo(byteResultArray));
    }

    //Sapient generated method id: ${7d7d8b16-f133-3e8e-8d2c-e1dc068400dc}, hash: D005BFDE56AF2C1F4A2222096575B027
    @Ignore()
    @Test()
    public void decodeWhenOutputStartIndexOfDecodedEquals0() throws AddressFormatException {
        /* Branches:
         * (input.length() == 0) : false
         * (i < input.length()) : true
         * (c < 128) : true
         * (digit < 0) : false
         * (zeros < input58.length) : true
         * (input58[zeros] == 0) : false
         * (inputStart < input58.length) : true
         * (i < number.length) : true  #  inside divmod method
         * (input58[inputStart] == 0) : true
         * (outputStart < decoded.length) : true
         * (decoded[outputStart] == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        byte[] result = Base58.decode("P");
        //Assert statement(s)
        assertThat(result.length, equalTo(0));
    }

    //Sapient generated method id: ${2c0ddf72-634c-3949-9500-9866e6936082}, hash: B0E053C5FD56B2B8222FF0D1AAC6CA71
    @Test()
    public void decodeToBigIntegerTest() throws AddressFormatException {
        //Arrange Statement(s)
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            base58.when(() -> Base58.decode("input1")).thenReturn(byteArray);
            //Act Statement(s)
            BigInteger result = Base58.decodeToBigInteger("input1");
            //Assert statement(s)
            assertThat(result, equalTo(new BigInteger("0")));
            base58.verify(() -> Base58.decode("input1"), atLeast(1));
        }
    }

    //Sapient generated method id: ${edc37915-e216-3595-a3da-43fddac80ec9}, hash: DC3F792D9C6D70C2BD8E89449A5DC5A8
    @Test()
    public void decodeCheckedWhenDecodedLengthLessThan4ThrowsAddressFormatExceptionInvalidDataLength() throws AddressFormatException {
        /* Branches:
         * (decoded.length < 4) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            base58.when(() -> Base58.decode("input1")).thenReturn(byteArray);
            AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Input too short: 0");
            thrown.expect(AddressFormatException.InvalidDataLength.class);
            thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
            //Act Statement(s)
            Base58.decodeChecked("input1");
            //Assert statement(s)
            base58.verify(() -> Base58.decode("input1"), atLeast(1));
        }
    }

    //Sapient generated method id: ${7ba6406e-4337-3cdd-9a10-b5c27697367d}, hash: 87A5983B0C7CC943F6A1C97EDD6A983D
    @Test()
    public void decodeCheckedWhenArraysNotEqualsChecksumActualChecksumThrowsAddressFormatExceptionInvalidChecksum() throws AddressFormatException {
        /* Branches:
         * (decoded.length < 4) : false
         * (!Arrays.equals(checksum, actualChecksum)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3};
            base58.when(() -> Base58.decode("input1")).thenReturn(byteArray);
            thrown.expect(AddressFormatException.InvalidChecksum.class);
            //Act Statement(s)
            Base58.decodeChecked("input1");
            //Assert statement(s)
            base58.verify(() -> Base58.decode("input1"), atLeast(1));
        }
    }

    //Sapient generated method id: ${ab7cc08b-23ae-3052-b5d1-7c4401f7ae8e}, hash: B9468B0FDC4DAA02D2BFA6A7B1A9F568
    @Ignore()
    @Test()
    public void decodeCheckedWhenArraysEqualsChecksumActualChecksum() throws AddressFormatException {
        /* Branches:
         * (decoded.length < 4) : false
         * (!Arrays.equals(checksum, actualChecksum)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3};
            base58.when(() -> Base58.decode("input1")).thenReturn(byteArray);
            //Act Statement(s)
            byte[] result = Base58.decodeChecked("input1");
            //Assert statement(s)
            assertThat(result.length, equalTo(0));
            base58.verify(() -> Base58.decode("input1"), atLeast(1));
        }
    }
}
