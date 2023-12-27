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

    //Sapient generated method id: ${35249b84-fbfc-3973-b41c-80dcbf08fff1}
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

    //Sapient generated method id: ${d6c64f95-dfe3-361a-9629-53d0620784ff}
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
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3};
        //Act Statement(s)
        Base58.encodeChecked(300, byteArray);
    }

    //Sapient generated method id: ${d2931715-ecaa-3ff6-ba6d-b16bac9265ab}
    @Ignore()
    @Test()
    public void encodeCheckedWhenVersionNotGreaterThan255() {
        /* Branches:
         * (version < 0) : false
         * (version > 255) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class, CALLS_REAL_METHODS);
             MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class)) {
            byte[] byteArray = new byte[]{(byte) 0};
            byte[] byteArray2 = new byte[]{(byte) 100, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            sha256Hash.when(() -> Sha256Hash.hashTwice(byteArray2, 0, 11)).thenReturn(byteArray);
            base58.when(() -> Base58.encode(byteArray2)).thenReturn("<String value>");
            byte[] byteArray3 = new byte[]{(byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10};
            //Act Statement(s)
            String result = Base58.encodeChecked(100, byteArray3);
            //Assert statement(s)
            assertThat(result, equalTo("<String value>"));
            sha256Hash.verify(() -> Sha256Hash.hashTwice(byteArray2, 0, 11), atLeast(1));
            base58.verify(() -> Base58.encode(byteArray2), atLeast(1));
        }
    }

    //Sapient generated method id: ${3ff6cf1c-73aa-3557-b401-4d92b129657a}
    @Test()
    public void decodeWhenInputLengthEquals0() throws AddressFormatException {
        /* Branches:
         * (input.length() == 0) : true
         */
        //Act Statement(s)
        byte[] result = Base58.decode("");
        byte[] byteResultArray = new byte[]{};
        //Assert statement(s)
        assertThat(result, equalTo(byteResultArray));
    }

    //Sapient generated method id: ${3b46bdbd-16c4-3445-9690-b660a76f1610}
    @Ignore()
    @Test()
    public void decodeWhenCNotLessThan128AndDigitLessThan0ThrowsAddressFormatExceptionInvalidCharacter() throws AddressFormatException {
        /* Branches:
         * (input.length() == 0) : false
         * (i < input.length()) : true
         * (c < 128) : false
         * (digit < 0) : true
         */
        //Arrange Statement(s)
        thrown.expect(ArrayIndexOutOfBoundsException.class);
        //Act Statement(s)
        Base58.decode("abc123");
    }

    //Sapient generated method id: ${6132aca1-469e-3b26-86e7-fd52897896b4}
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
         */
        //Arrange Statement(s)
        thrown.expect(ArrayIndexOutOfBoundsException.class);
        //Act Statement(s)
        Base58.decode("5Q7");
    }

    //Sapient generated method id: ${7d7d8b16-f133-3e8e-8d2c-e1dc068400dc}
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
         */
        //Arrange Statement(s)
        thrown.expect(ArrayIndexOutOfBoundsException.class);
        //Act Statement(s)
        Base58.decode("1HhnLW9WnKc9K7UToZzqZQg9tZz");
    }

    //Sapient generated method id: ${2c0ddf72-634c-3949-9500-9866e6936082}
    @Test()
    public void decodeToBigIntegerTest() throws AddressFormatException {
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Base58> base58 = mockStatic(Base58.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            base58.when(() -> Base58.decode("Hello World!")).thenReturn(byteArray);
            byteUtils.when(() -> ByteUtils.bytesToBigInteger(byteArray)).thenReturn(new BigInteger("696096962927383696875982887557939128174"));
            //Act Statement(s)
            BigInteger result = Base58.decodeToBigInteger("Hello World!");
            //Assert statement(s)
            assertThat(result, equalTo(new BigInteger("696096962927383696875982887557939128174")));
            base58.verify(() -> Base58.decode("Hello World!"), atLeast(1));
            byteUtils.verify(() -> ByteUtils.bytesToBigInteger(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${edc37915-e216-3595-a3da-43fddac80ec9}
    @Test()
    public void decodeCheckedWhenDecodedLengthLessThan4ThrowsAddressFormatExceptionInvalidDataLength() throws AddressFormatException {
        /* Branches:
         * (decoded.length < 4) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Base58> base58 = mockStatic(Base58.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0};
            base58.when(() -> Base58.decode("1234")).thenReturn(byteArray);
            AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Input too short: 2");
            thrown.expect(AddressFormatException.InvalidDataLength.class);
            thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
            //Act Statement(s)
            Base58.decodeChecked("1234");
            //Assert statement(s)
            base58.verify(() -> Base58.decode("1234"), atLeast(1));
        }
    }
}
