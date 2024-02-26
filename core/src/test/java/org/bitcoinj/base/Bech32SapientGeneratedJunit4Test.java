package org.bitcoinj.base;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.base.exceptions.AddressFormatException;
import org.junit.rules.ExpectedException;
import org.mockito.MockedStatic;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;

public class Bech32SapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Bech32.Bech32Bytes bech32Bech32BytesMock = mock(Bech32.Bech32Bytes.class);

    private final Bech32.Bech32Data bech32Bech32DataMock = mock(Bech32.Bech32Data.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${fbbeaf74-231e-3c65-8cbd-93982294bb04}
    @Test()
    public void encodeBytesTest() {
        //Arrange Statement(s)
        try (MockedStatic<Bech32> bech32 = mockStatic(Bech32.class, CALLS_REAL_METHODS);
             MockedStatic<Bech32.Bech32Bytes> bech32Bech32Bytes = mockStatic(Bech32.Bech32Bytes.class)) {
            byte[] byteArray = new byte[]{};
            bech32Bech32Bytes.when(() -> Bech32.Bech32Bytes.ofBytes(byteArray)).thenReturn(bech32Bech32BytesMock);
            bech32.when(() -> Bech32.encode(Bech32.Encoding.BECH32, "hrp1", bech32Bech32BytesMock)).thenReturn("return_of_encode1");
            //Act Statement(s)
            String result = Bech32.encodeBytes(Bech32.Encoding.BECH32, "hrp1", byteArray);
            //Assert statement(s)
            assertThat(result, equalTo("return_of_encode1"));
            bech32Bech32Bytes.verify(() -> Bech32.Bech32Bytes.ofBytes(byteArray), atLeast(1));
            bech32.verify(() -> Bech32.encode(Bech32.Encoding.BECH32, "hrp1", bech32Bech32BytesMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${98c4caa4-8b1b-3bc8-9c65-e79326141287}
    @Test()
    public void decodeBytesThrowsNullPointerException() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Bech32> bech32 = mockStatic(Bech32.class, CALLS_REAL_METHODS)) {
            bech32.when(() -> Bech32.decode("bech32")).thenReturn(bech32Bech32DataMock);
            thrown.expect(NullPointerException.class);
            //Act Statement(s)
            Bech32.decodeBytes("bech32", "expectedHrp1", Bech32.Encoding.BECH32);
            //Assert statement(s)
            bech32.verify(() -> Bech32.decode("bech32"), atLeast(1));
        }
    }

    //Sapient generated method id: ${fafc308c-c2cf-3f58-97a4-997140e0ac23}
    @Test()
    public void encodeTest() {
        //Arrange Statement(s)
        try (MockedStatic<Bech32> bech32 = mockStatic(Bech32.class, CALLS_REAL_METHODS)) {
            bech32.when(() -> Bech32.encode((Bech32.Encoding) null, (String) null, bech32Bech32DataMock)).thenReturn("return_of_encode1");
            //Act Statement(s)
            String result = Bech32.encode(bech32Bech32DataMock);
            //Assert statement(s)
            assertThat(result, equalTo("return_of_encode1"));
            bech32.verify(() -> Bech32.encode((Bech32.Encoding) null, (String) null, bech32Bech32DataMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${72b0a6a7-fe76-3cf5-8eba-13ea4d053b82}
    @Test()
    public void encode1WhenHrpLengthLessThan1ThrowsIllegalArgumentException() {
        /* Branches:
         * (hrp.length() >= 1) : false
         */
        //Arrange Statement(s)
        thrown.expect(IllegalArgumentException.class);

        //Act Statement(s)
        Bech32.encode(Bech32.Encoding.BECH32, "", bech32Bech32BytesMock);
    }

    //Sapient generated method id: ${af907430-4492-391e-bd9c-18ae9ac0869a}
    @Test()
    public void encode1WhenHrpLengthGreaterThan83ThrowsIllegalArgumentException() {
        /* Branches:
         * (hrp.length() >= 1) : true
         * (hrp.length() <= 83) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        thrown.expect(IllegalArgumentException.class);

        //Act Statement(s)
        Bech32.encode(Bech32.Encoding.BECH32, "hrp1", bech32Bech32BytesMock);
    }

    //Sapient generated method id: ${de8b9fa0-b2fd-39f3-b03e-d9eae989c305}
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
        byte[] _byte = null;
        //Arrange Statement(s)
        Bech32.Bech32Bytes valuesMock = mock(Bech32.Bech32Bytes.class, "byte[] value");
        byte[] byteArray = new byte[]{(byte) 0};
        doReturn(null, _byte, _byte, _byte, byteArray).when(valuesMock).bytes();

        //Act Statement(s)
        String result = Bech32.encode(Bech32.Encoding.BECH32, "exampleHrp", valuesMock);

        //Assert statement(s)
        assertThat(result, equalTo("examplehrp1q"));
        verify(valuesMock, times(5)).bytes();
    }

    //Sapient generated method id: ${a9050d6a-16a6-3523-938f-67f081d71b1d}
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
        Bech32.Bech32Bytes valuesMock = mock(Bech32.Bech32Bytes.class);
        byte[] byteArray = new byte[]{};
        byte[] byteArray2 = new byte[]{};
        byte[] byteArray3 = new byte[]{};
        byte[] byteArray4 = new byte[]{};
        byte[] byteArray5 = new byte[]{};
        doReturn(byteArray, byteArray2, byteArray3, byteArray4, byteArray5).when(valuesMock).bytes();

        //Act Statement(s)
        String result = Bech32.encode(Bech32.Encoding.BECH32, "hrp1", valuesMock);

        //Assert statement(s)
        assertThat(result, equalTo("result1"));
        verify(valuesMock, times(5)).bytes();
    }

    //Sapient generated method id: ${ec59ef02-8050-39ff-89f3-56b2cd5df128}
    @Test()
    public void decodeWhenStrLengthLessThan8ThrowsAddressFormatExceptionInvalidDataLength() throws AddressFormatException {
        /* Branches:
         * (str.length() < 8) : true
         */
        //Arrange Statement(s)
        AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("Input too short: 1");
        thrown.expect(AddressFormatException.InvalidDataLength.class);
        thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());

        //Act Statement(s)
        Bech32.decode("A");
    }

    //Sapient generated method id: ${372800e1-1165-3aaa-b15a-40f82815668d}
    @Test()
    public void decodeWhenStrLengthGreaterThan90ThrowsAddressFormatExceptionInvalidDataLength() throws AddressFormatException {
        /* Branches:
         * (str.length() < 8) : false
         * (str.length() > 90) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        AddressFormatException.InvalidDataLength addressFormatExceptionInvalidDataLength = new AddressFormatException.InvalidDataLength("message1");
        thrown.expect(AddressFormatException.InvalidDataLength.class);
        thrown.expectMessage(addressFormatExceptionInvalidDataLength.getMessage());

        //Act Statement(s)
        Bech32.decode("str1");
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
        Bech32.decode("\uFFFFBCDEFGH");
    }

    //Sapient generated method id: ${02a9e6ce-6cb4-36ff-a28a-4e29f4a08a57}
    @Test()
    public void decodeWhenNotLowerAndPosLessThan1ThrowsAddressFormatExceptionInvalidPrefix() throws AddressFormatException {
        /* Branches:
         * (str.length() < 8) : false
         * (str.length() > 90) : false
         * (i < str.length()) : true
         * (c < 33) : false
         * (c > 126) : false
         * (c >= 'a') : false
         * (c >= 'A') : true
         * (c <= 'Z') : true
         * (lower) : false
         * (pos < 1) : true
         */
        //Arrange Statement(s)
        AddressFormatException.InvalidPrefix addressFormatExceptionInvalidPrefix = new AddressFormatException.InvalidPrefix("Missing human-readable part");
        thrown.expect(AddressFormatException.InvalidPrefix.class);
        thrown.expectMessage(addressFormatExceptionInvalidPrefix.getMessage());

        //Act Statement(s)
        Bech32.decode("WBCDEFGH");
    }

    //Sapient generated method id: ${db0bfc4f-291b-3dd2-a7ba-bed317905439}
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
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        thrown.expect(AddressFormatException.InvalidCharacter.class);

        //Act Statement(s)
        Bech32.decode("str1");
    }

    //Sapient generated method id: ${1b9dfcb0-c453-326a-89a1-9c524713b9c7}
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

        //Act Statement(s)
        Bech32.Bech32Data result = Bech32.decode("str1");

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${e6706136-4ef7-3bce-9137-b6ab29e180db}
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
        Bech32.decode("str1");
    }
}
