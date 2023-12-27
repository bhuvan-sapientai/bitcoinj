package org.bitcoinj.base;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.base.exceptions.AddressFormatException;
import org.junit.rules.ExpectedException;
import org.mockito.stubbing.Answer;
import org.bitcoinj.base.internal.Preconditions;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

public class Bech32SapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Bech32.Bech32Data bech32Bech32DataMock = mock(Bech32.Bech32Data.class);

    private final Bech32.Bech32Bytes valuesMock = mock(Bech32.Bech32Bytes.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${fbbeaf74-231e-3c65-8cbd-93982294bb04}
    @Test()
    public void encodeBytesTest() {
        //Arrange Statement(s)
        Bech32.Bech32Bytes bech32Bech32BytesMock = mock(Bech32.Bech32Bytes.class, "UnknownObjectContent{target='org.bitcoinj.base.Bech32$Bech32Bytes', onlyPojoFunctions=false, builderPattern=false}");
        try (MockedStatic<Bech32> bech32 = mockStatic(Bech32.class, CALLS_REAL_METHODS);
             MockedStatic<Bech32.Bech32Bytes> bech32Bech32Bytes = mockStatic(Bech32.Bech32Bytes.class)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5};
            bech32Bech32Bytes.when(() -> Bech32.Bech32Bytes.ofBytes(byteArray)).thenReturn(bech32Bech32BytesMock);
            bech32.when(() -> Bech32.encode(Bech32.Encoding.BECH32, "test", bech32Bech32BytesMock)).thenReturn("String");
            //Act Statement(s)
            String result = Bech32.encodeBytes(Bech32.Encoding.BECH32, "test", byteArray);
            //Assert statement(s)
            assertThat(result, equalTo("String"));
            bech32Bech32Bytes.verify(() -> Bech32.Bech32Bytes.ofBytes(byteArray), atLeast(1));
            bech32.verify(() -> Bech32.encode(Bech32.Encoding.BECH32, "test", bech32Bech32BytesMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${7d42dd02-a07c-33bf-b536-f0188bc26a83}
    @Ignore()
    @Test()
    public void decodeBytesWhenDecodedEncodingNotEqualsExpectedEncodingThrowsAddressFormatException() {
        /* Branches:
         * (!decoded.hrp.equals(expectedHrp)) : false
         * (decoded.encoding != expectedEncoding) : true
         */
        try (MockedStatic<Bech32> bech32 = mockStatic(Bech32.class, CALLS_REAL_METHODS)) {
            bech32.when(() -> Bech32.decode("tb1qw508d6qejxtdg4y5r3zarvary0c5xw7kv8f3t4")).thenReturn(bech32Bech32DataMock);
            AddressFormatException addressFormatException = new AddressFormatException("unexpected hrp or encoding");
            thrown.expect(AddressFormatException.class);
            thrown.expectMessage(addressFormatException.getMessage());
            //Act Statement(s)
            Bech32.decodeBytes("tb1qw508d6qejxtdg4y5r3zarvary0c5xw7kv8f3t4", "tb", Bech32.Encoding.BECH32);
            //Assert statement(s)
            bech32.verify(() -> Bech32.decode("tb1qw508d6qejxtdg4y5r3zarvary0c5xw7kv8f3t4"), atLeast(1));
        }
    }

    //Sapient generated method id: ${fafc308c-c2cf-3f58-97a4-997140e0ac23}
    @Ignore()
    @Test()
    public void encodeTest() {
        //Arrange Statement(s)
        Bech32.Bech32Data bech32Bech32DataMock = mock(Bech32.Bech32Data.class, "string");
        try (MockedStatic<Bech32> bech32 = mockStatic(Bech32.class, CALLS_REAL_METHODS)) {
            bech32.when(() -> Bech32.encode(Bech32.Encoding.BECH32, "hrp1", bech32Bech32DataMock)).thenReturn("string");
            //Act Statement(s)
            String result = Bech32.encode(bech32Bech32DataMock);
            //Assert statement(s)
            assertThat(result, equalTo("string"));
            bech32.verify(() -> Bech32.encode(Bech32.Encoding.BECH32, "hrp1", bech32Bech32DataMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${de8b9fa0-b2fd-39f3-b03e-d9eae989c305}
    @Ignore()
    @Test()
    public void encode1WhenCombinedIsNotEmpty() {
        /* Branches:
         * (hrp.length() >= 1) : true
         * (hrp.length() <= 83) : true
         * (i < hrpLength) : true  #  inside expandHrp method
         * (for-each(values)) : true  #  inside polymod method
         * ((c0 & 1) != 0) : false  #  inside polymod method
         * ((c0 & 2) != 0) : false  #  inside polymod method
         * ((c0 & 4) != 0) : false  #  inside polymod method
         * ((c0 & 8) != 0) : false  #  inside polymod method
         * ((c0 & 16) != 0) : false  #  inside polymod method
         * (encoding == Encoding.BECH32) : true  #  inside createChecksum method
         * (i < 6) : true  #  inside createChecksum method
         * (for-each(combined)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Bech32.Bech32Bytes valuesMock = mock(Bech32.Bech32Bytes.class, "[0, 1, 2, 3, 4, 5]");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            byte[] _byte = null;
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            doReturn(null, _byte, _byte, _byte, byteArray).when(valuesMock).bytes();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            String result = Bech32.encode(Bech32.Encoding.BECH32, "bc", valuesMock);
            //Assert statement(s)
            assertThat(result, equalTo("bc1q"));
            verify(valuesMock, times(5)).bytes();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(2));
        }
    }

    //Sapient generated method id: ${a9050d6a-16a6-3523-938f-67f081d71b1d}
    @Ignore()
    @Test()
    public void encode1WhenEncodingNotEqualsEncodingBECH32AndILessThan6AndCombinedIsEmpty() {
        /* Branches:
         * (hrp.length() >= 1) : true
         * (hrp.length() <= 83) : true
         * (i < hrpLength) : true  #  inside expandHrp method
         * (for-each(values)) : true  #  inside polymod method
         * ((c0 & 1) != 0) : false  #  inside polymod method
         * ((c0 & 2) != 0) : false  #  inside polymod method
         * ((c0 & 4) != 0) : false  #  inside polymod method
         * ((c0 & 8) != 0) : false  #  inside polymod method
         * ((c0 & 16) != 0) : false  #  inside polymod method
         * (encoding == Encoding.BECH32) : false  #  inside createChecksum method
         * (i < 6) : true  #  inside createChecksum method
         * (for-each(combined)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Bech32.Bech32Bytes valuesMock = mock(Bech32.Bech32Bytes.class, "[0, 1, 2]");
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            byte[] _byte = null;
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0};
            doReturn(null, _byte, _byte, _byte, byteArray).when(valuesMock).bytes();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            String result = Bech32.encode(Bech32.Encoding.BECH32M, "bc", valuesMock);
            //Assert statement(s)
            assertThat(result, equalTo("bc1q"));
            verify(valuesMock, times(5)).bytes();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(2));
        }
    }

    //Sapient generated method id: ${ec59ef02-8050-39ff-89f3-56b2cd5df128}
    @Test()
    public void decodeWhenStrLengthLessThan8ThrowsAddressFormatExceptionInvalidDataLength() throws AddressFormatException {
        /* Branches:
         * (str.length() < 8) : true
         */
        //Arrange Statement(s)
        AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Input too short: 7");
        thrown.expect(AddressFormatException.InvalidDataLength.class);
        thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
        //Act Statement(s)
        Bech32.decode("1234567");
    }

    //Sapient generated method id: ${372800e1-1165-3aaa-b15a-40f82815668d}
    @Test()
    public void decodeWhenStrLengthGreaterThan90ThrowsAddressFormatExceptionInvalidDataLength() throws AddressFormatException {
        /* Branches:
         * (str.length() < 8) : false
         * (str.length() > 90) : true
         */
        //Arrange Statement(s)
        AddressFormatException.InvalidPrefix addressFormatExceptionInvalidPrefix = new AddressFormatException.InvalidPrefix("Missing human-readable part");
        thrown.expect(AddressFormatException.InvalidPrefix.class);
        thrown.expectMessage(addressFormatExceptionInvalidPrefix.getMessage());
        //Act Statement(s)
        Bech32.decode("1234567890");
    }

    //Sapient generated method id: ${03c4c3e6-d8a2-36e7-81a6-0d62fe650353}
    @Test()
    public void decodeWhenCGreaterThan126ThrowsAddressFormatExceptionInvalidCharacter() throws AddressFormatException {
        /* Branches:
         * (str.length() < 8) : false
         * (str.length() > 90) : false
         * (i < str.length()) : true
         * (c < 33) : false
         * (c > 126) : true
         */
        //Arrange Statement(s)
        thrown.expect(AddressFormatException.InvalidCharacter.class);
        //Act Statement(s)
        Bech32.decode("HelloWorld!");
    }

    //Sapient generated method id: ${db0bfc4f-291b-3dd2-a7ba-bed317905439}
    @Ignore()
    @Test()
    public void decodeWhenILessThanDataPartLengthAndCIndexOfCHARSET_REVEqualsMinus1ThrowsAddressFormatExceptionInvalidCharacter() throws AddressFormatException {
        /* Branches:
         * (str.length() < 8) : false
         * (str.length() > 90) : false
         * (i < str.length()) : true
         * (c < 33) : false
         * (c > 126) : false
         * (c >= 'a') : true
         * (c <= 'z') : true
         * (upper) : false
         * (c >= 'A') : true
         * (c <= 'Z') : false
         * (pos < 1) : false
         * (dataPartLength < 6) : false
         * (i < dataPartLength) : true
         * (CHARSET_REV[c] == -1) : true
         */
        //Arrange Statement(s)
        AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Input too long: 261");
        thrown.expect(AddressFormatException.InvalidDataLength.class);
        thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());
        //Act Statement(s)
        Bech32.decode("abcde1fghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz");
    }

    //Sapient generated method id: ${1b9dfcb0-c453-326a-89a1-9c524713b9c7}
    @Ignore()
    @Test()
    public void decodeWhenEncodingIsNotNull() throws AddressFormatException {
        /* Branches:
         * (str.length() < 8) : false
         * (str.length() > 90) : false
         * (i < str.length()) : true
         * (c < 33) : false
         * (c > 126) : false
         * (c >= 'a') : true
         * (c <= 'z') : true
         * (upper) : false
         * (c >= 'A') : true
         * (c <= 'Z') : false
         * (pos < 1) : false
         * (dataPartLength < 6) : false
         * (i < dataPartLength) : true
         * (CHARSET_REV[c] == -1) : false
         * (i < hrpLength) : true  #  inside expandHrp method
         * (for-each(values)) : false  #  inside polymod method
         * (check == BECH32_CONST) : true  #  inside verifyChecksum method
         * (encoding == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        thrown.expect(AddressFormatException.InvalidChecksum.class);
        //Act Statement(s)
        Bech32.decode("tb1qw508d6qejxtdg4y5r3zarvary0c5xw7kv8f3t4");
    }

    //Sapient generated method id: ${e6706136-4ef7-3bce-9137-b6ab29e180db}
    @Ignore()
    @Test()
    public void decodeWhenEncodingIsNullThrowsAddressFormatExceptionInvalidChecksum() throws AddressFormatException {
        /* Branches:
         * (str.length() < 8) : false
         * (str.length() > 90) : false
         * (i < str.length()) : true
         * (c < 33) : false
         * (c > 126) : false
         * (c >= 'a') : true
         * (c <= 'z') : true
         * (upper) : false
         * (c >= 'A') : true
         * (c <= 'Z') : false
         * (pos < 1) : false
         * (dataPartLength < 6) : false
         * (i < dataPartLength) : true
         * (CHARSET_REV[c] == -1) : false
         * (i < hrpLength) : true  #  inside expandHrp method
         * (for-each(values)) : true  #  inside polymod method
         * ((c0 & 1) != 0) : false  #  inside polymod method
         * ((c0 & 2) != 0) : false  #  inside polymod method
         * ((c0 & 4) != 0) : false  #  inside polymod method
         * ((c0 & 8) != 0) : false  #  inside polymod method
         * ((c0 & 16) != 0) : false  #  inside polymod method
         * (check == BECH32_CONST) : false  #  inside verifyChecksum method
         * (check == BECH32M_CONST) : false  #  inside verifyChecksum method
         * (encoding == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        thrown.expect(AddressFormatException.InvalidChecksum.class);
        //Act Statement(s)
        Bech32.decode("tb1qw508d6qejxtdg4y5r3zarvary0c5xw7kv8f3t4");
    }
}
