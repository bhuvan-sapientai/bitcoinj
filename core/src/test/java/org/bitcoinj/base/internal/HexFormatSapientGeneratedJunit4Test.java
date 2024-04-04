package org.bitcoinj.base.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Ignore;

public class HexFormatSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${9f0bd176-2947-3835-8354-48a50fe9e80e}, hash: A5A61BD46F9B70576A62B3D6167115A4
    @Ignore()
    @Test()
    public void formatHexWhenBytesIsNotEmpty() {
        /* Branches:
         * (for-each(bytes)) : true
         */
        //Arrange Statement(s)
        HexFormat target = new HexFormat();
        byte[] byteArray = new byte[]{(byte) 0};
        //Act Statement(s)
        String result = target.formatHex(byteArray);
        //Assert statement(s)
        assertThat(result, equalTo("A"));
    }

    //Sapient generated method id: ${278d16a5-ccc4-393f-b870-848d7156f734}, hash: 611E2B689D47327AB3387AF944413FB9
    @Test()
    public void parseHexWhenHexStringLengthModulus2Equals1ThrowsIllegalArgumentException() {
        /* Branches:
         * (hexString.length() % 2 == 1) : true
         */
        //Arrange Statement(s)
        HexFormat target = new HexFormat();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid hexadecimal String supplied.");
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(illegalArgumentException.getMessage());
        //Act Statement(s)
        target.parseHex("A");
    }

    //Sapient generated method id: ${54602f71-0d40-36da-b499-ce62ba6f2488}, hash: E064AA29218B24C75C3A55F81CA9607E
    @Test()
    public void parseHexWhenDigitEqualsMinus1ThrowsIllegalArgumentException() {
        /* Branches:
         * (hexString.length() % 2 == 1) : false
         * (i < hexString.length()) : true
         * (digit == -1) : true  #  inside toDigit method
         */
        //Arrange Statement(s)
        HexFormat target = new HexFormat();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid Hexadecimal Character: h");
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(illegalArgumentException.getMessage());
        //Act Statement(s)
        target.parseHex("hexString1");
    }

    //Sapient generated method id: ${571b79cf-cc03-3c23-beb4-1c0eefab5867}, hash: 99ED6A6928A22EA5B95992C99D3306C2
    @Test()
    public void parseHexWhenDigitNotEqualsMinus1() {
        /* Branches:
         * (hexString.length() % 2 == 1) : false
         * (i < hexString.length()) : true
         * (digit == -1) : false  #  inside toDigit method
         */
        //Arrange Statement(s)
        HexFormat target = new HexFormat();
        //Act Statement(s)
        byte[] result = target.parseHex("BA");
        byte[] byteResultArray = new byte[]{(byte) -70};
        //Assert statement(s)
        assertThat(result, equalTo(byteResultArray));
    }

    //Sapient generated method id: ${9964fa33-e815-336b-82d2-f30602c027a5}, hash: F8DACD22D81C4F340FB6DF82389D970F
    @Ignore()
    @Test()
    public void parseHexWhenDigitNotEqualsMinus1ThrowsIllegalArgumentException() {
        /* Branches:
         * (hexString.length() % 2 == 1) : false
         * (i < hexString.length()) : true
         * (digit == -1) : false  #  inside toDigit method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HexFormat target = new HexFormat();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("s1");
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(illegalArgumentException.getMessage());
        //Act Statement(s)
        target.parseHex("hexString1");
    }
}
