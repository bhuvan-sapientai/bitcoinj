package org.bitcoinj.base.utils;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.math.RoundingMode;

import org.bitcoinj.base.Monetary;

import java.util.Locale;

import org.bitcoinj.base.internal.Preconditions;
import org.bitcoinj.base.Coin;
import org.mockito.MockedStatic;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;

public class MonetaryFormatSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Monetary monetaryMock = mock(Monetary.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${82510699-208f-3216-b79d-d23ba54f97db}
    @Test()
    public void negativeSignWhenCharacterIsDigitNegativeSignThrowsIllegalArgumentException() {
        /* Branches:
         * (!Character.isDigit(negativeSign)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        MonetaryFormat target = new MonetaryFormat(false);
        thrown.expect(IllegalArgumentException.class);

        //Act Statement(s)
        target.negativeSign('A');
    }

    //Sapient generated method id: ${3229caf1-60c2-3c65-bfa2-fc45ca7e9159}
    @Test()
    public void negativeSignWhenNegativeSignNotGreaterThan0ThrowsIllegalArgumentException() {
        /* Branches:
         * (!Character.isDigit(negativeSign)) : true
         * (negativeSign > 0) : false
         */
        //Arrange Statement(s)
        MonetaryFormat target = new MonetaryFormat(true);
        thrown.expect(IllegalArgumentException.class);

        //Act Statement(s)
        target.negativeSign('\u0000');
    }

    //Sapient generated method id: ${7ed85d63-fded-32db-ab29-efe70276000d}
    @Test()
    public void negativeSignWhenNegativeSignEqualsThisNegativeSign() {
        /* Branches:
         * (!Character.isDigit(negativeSign)) : true
         * (negativeSign > 0) : true
         * (negativeSign == this.negativeSign) : true
         */
        //Arrange Statement(s)
        MonetaryFormat target = new MonetaryFormat(true);

        //Act Statement(s)
        MonetaryFormat result = target.negativeSign('-');

        //Assert statement(s)
        assertThat(result, equalTo(target));
    }

    //Sapient generated method id: ${9ec7ea02-1e86-342a-9733-d8b53a49beb7}
    @Test()
    public void negativeSignWhenNegativeSignNotEqualsThisNegativeSign() {
        /* Branches:
         * (!Character.isDigit(negativeSign)) : true
         * (negativeSign > 0) : true
         * (negativeSign == this.negativeSign) : false
         */
        //Arrange Statement(s)
        MonetaryFormat target = new MonetaryFormat(true);

        //Act Statement(s)
        MonetaryFormat result = target.negativeSign('\uD83F');

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${be5d81f5-c486-3ee2-bf04-9380b406bc8a}
    @Test()
    public void positiveSignWhenCharacterIsDigitPositiveSignThrowsIllegalArgumentException() {
        /* Branches:
         * (!Character.isDigit(positiveSign)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        MonetaryFormat target = new MonetaryFormat(false);
        thrown.expect(IllegalArgumentException.class);

        //Act Statement(s)
        target.positiveSign('A');
    }

    //Sapient generated method id: ${3082a4a2-3b1c-3cba-870f-9fe70a72e877}
    @Test()
    public void positiveSignWhenPositiveSignEqualsThisPositiveSign() {
        /* Branches:
         * (!Character.isDigit(positiveSign)) : true
         * (positiveSign == this.positiveSign) : true
         */
        //Arrange Statement(s)
        MonetaryFormat target = new MonetaryFormat(true);

        //Act Statement(s)
        MonetaryFormat result = target.positiveSign('\u0000');

        //Assert statement(s)
        assertThat(result, equalTo(target));
    }

    //Sapient generated method id: ${e50e351c-b8ae-3da4-b637-d9f0a98e77b4}
    @Test()
    public void positiveSignWhenPositiveSignNotEqualsThisPositiveSign() {
        /* Branches:
         * (!Character.isDigit(positiveSign)) : true
         * (positiveSign == this.positiveSign) : false
         */
        //Arrange Statement(s)
        MonetaryFormat target = new MonetaryFormat(true);

        //Act Statement(s)
        MonetaryFormat result = target.positiveSign('A');

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${5446d07c-8d1d-3205-ae25-e98db4cf900f}
    @Test()
    public void digitsWhenZeroDigitEqualsThisZeroDigit() {
        /* Branches:
         * (zeroDigit == this.zeroDigit) : true
         */
        //Arrange Statement(s)
        MonetaryFormat target = new MonetaryFormat(true);

        //Act Statement(s)
        MonetaryFormat result = target.digits('0');

        //Assert statement(s)
        assertThat(result, equalTo(target));
    }

    //Sapient generated method id: ${143eb855-4f63-30eb-9a6f-7142c5e1abb2}
    @Test()
    public void digitsWhenZeroDigitNotEqualsThisZeroDigit() {
        /* Branches:
         * (zeroDigit == this.zeroDigit) : false
         */
        //Arrange Statement(s)
        MonetaryFormat target = new MonetaryFormat(true);

        //Act Statement(s)
        MonetaryFormat result = target.digits('A');

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${5ddaf9a0-df81-3b76-9ead-5bf50894084c}
    @Test()
    public void decimalMarkWhenCharacterIsDigitDecimalMarkThrowsIllegalArgumentException() {
        /* Branches:
         * (!Character.isDigit(decimalMark)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        MonetaryFormat target = new MonetaryFormat(false);
        thrown.expect(IllegalArgumentException.class);

        //Act Statement(s)
        target.decimalMark('A');
    }

    //Sapient generated method id: ${dfa31e1b-7ef8-35e2-adc0-1bf19a02a45f}
    @Test()
    public void decimalMarkWhenDecimalMarkNotGreaterThan0ThrowsIllegalArgumentException() {
        /* Branches:
         * (!Character.isDigit(decimalMark)) : true
         * (decimalMark > 0) : false
         */
        //Arrange Statement(s)
        MonetaryFormat target = new MonetaryFormat(true);
        thrown.expect(IllegalArgumentException.class);

        //Act Statement(s)
        target.decimalMark('\u0000');
    }

    //Sapient generated method id: ${106fcdd4-331b-31bd-b4f9-8075b9082315}
    @Test()
    public void decimalMarkWhenDecimalMarkEqualsThisDecimalMark() {
        /* Branches:
         * (!Character.isDigit(decimalMark)) : true
         * (decimalMark > 0) : true
         * (decimalMark == this.decimalMark) : true
         */
        //Arrange Statement(s)
        MonetaryFormat target = new MonetaryFormat(true);

        //Act Statement(s)
        MonetaryFormat result = target.decimalMark('.');

        //Assert statement(s)
        assertThat(result, equalTo(target));
    }

    //Sapient generated method id: ${22c1f48a-0e87-3add-ab60-f4de673cd1f3}
    @Test()
    public void decimalMarkWhenDecimalMarkNotEqualsThisDecimalMark() {
        /* Branches:
         * (!Character.isDigit(decimalMark)) : true
         * (decimalMark > 0) : true
         * (decimalMark == this.decimalMark) : false
         */
        //Arrange Statement(s)
        MonetaryFormat target = new MonetaryFormat(true);

        //Act Statement(s)
        MonetaryFormat result = target.decimalMark('\uD83F');

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${3562bf3c-d3ea-3df3-8346-01c0a0a75fbe}
    @Test()
    public void minDecimalsWhenMinDecimalsEqualsThisMinDecimals() {
        /* Branches:
         * (minDecimals == this.minDecimals) : true
         */
        //Arrange Statement(s)
        MonetaryFormat target = new MonetaryFormat(true);

        //Act Statement(s)
        MonetaryFormat result = target.minDecimals(2);

        //Assert statement(s)
        assertThat(result, equalTo(target));
    }

    //Sapient generated method id: ${7f9025a4-fea9-3149-b580-7bc482325f51}
    @Test()
    public void minDecimalsWhenMinDecimalsNotEqualsThisMinDecimals() {
        /* Branches:
         * (minDecimals == this.minDecimals) : false
         */
        //Arrange Statement(s)
        MonetaryFormat target = new MonetaryFormat(true);

        //Act Statement(s)
        MonetaryFormat result = target.minDecimals(1);

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${92462d72-7597-386a-a33f-a83ee93c5b71}
    @Test()
    public void optionalDecimalsWhenGroupsIsNotEmpty() {
        /* Branches:
         * (for-each(groups)) : true
         */
        //Arrange Statement(s)
        MonetaryFormat target = new MonetaryFormat(true);
        int[] intArray = new int[]{1};

        //Act Statement(s)
        MonetaryFormat result = target.optionalDecimals(intArray);

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${d9eedd8b-a3a2-3070-952f-7ab6850262cf}
    @Test()
    public void repeatOptionalDecimalsWhenRepetitionsLessThan0ThrowsIllegalArgumentException() {
        /* Branches:
         * (repetitions >= 0) : false
         */
        //Arrange Statement(s)
        MonetaryFormat target = new MonetaryFormat(true);
        thrown.expect(IllegalArgumentException.class);

        //Act Statement(s)
        target.repeatOptionalDecimals(0, -1);
    }

    //Sapient generated method id: ${7e2882fb-08d8-36ce-8620-3ad9b74c6e58}
    @Test()
    public void repeatOptionalDecimalsWhenILessThanRepetitions() {
        /* Branches:
         * (repetitions >= 0) : true
         * (i < repetitions) : true
         */
        //Arrange Statement(s)
        MonetaryFormat target = new MonetaryFormat(true);

        //Act Statement(s)
        MonetaryFormat result = target.repeatOptionalDecimals(1, 1);

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${43e4e20a-2db3-3ef4-9353-7c215f6376cb}
    @Test()
    public void shiftWhenShiftEqualsThisShift() {
        /* Branches:
         * (shift == this.shift) : true
         */
        //Arrange Statement(s)
        MonetaryFormat target = new MonetaryFormat(true);

        //Act Statement(s)
        MonetaryFormat result = target.shift(0);

        //Assert statement(s)
        assertThat(result, equalTo(target));
    }

    //Sapient generated method id: ${8cfadf6f-8b56-3df8-a95e-3333caf39724}
    @Test()
    public void shiftWhenShiftNotEqualsThisShift() {
        /* Branches:
         * (shift == this.shift) : false
         */
        //Arrange Statement(s)
        MonetaryFormat target = new MonetaryFormat(true);

        //Act Statement(s)
        MonetaryFormat result = target.shift(1);

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${b4c9b158-e2dc-3e26-a9d7-a64c0451b549}
    @Test()
    public void roundingModeWhenRoundingModeEqualsThisRoundingMode() {
        /* Branches:
         * (roundingMode == this.roundingMode) : true
         */
        //Arrange Statement(s)
        MonetaryFormat target = new MonetaryFormat(true);

        //Act Statement(s)
        MonetaryFormat result = target.roundingMode(RoundingMode.HALF_UP);

        //Assert statement(s)
        assertThat(result, equalTo(target));
    }

    //Sapient generated method id: ${eae234ba-a3a1-30fc-96ae-dbc2f074d429}
    @Test()
    public void roundingModeWhenRoundingModeNotEqualsThisRoundingMode() {
        /* Branches:
         * (roundingMode == this.roundingMode) : false
         */
        //Arrange Statement(s)
        MonetaryFormat target = new MonetaryFormat(true);

        //Act Statement(s)
        MonetaryFormat result = target.roundingMode(RoundingMode.UNNECESSARY);

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${a5ca7d3b-e8e7-30fa-a852-68423de0564b}
    @Test()
    public void noCodeWhenCodesIsNotNull() {
        /* Branches:
         * (codes == null) : false
         */
        //Arrange Statement(s)
        MonetaryFormat target = new MonetaryFormat(true);

        //Act Statement(s)
        MonetaryFormat result = target.noCode();

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${01e29c09-a7e9-394e-9b1c-cf8d9c596442}
    @Test()
    public void codeWhenCodeShiftLessThan0ThrowsIllegalArgumentException() {
        /* Branches:
         * (codeShift >= 0) : false
         */
        //Arrange Statement(s)
        MonetaryFormat target = new MonetaryFormat(true);
        thrown.expect(IllegalArgumentException.class);

        //Act Statement(s)
        target.code(-1, "code1");
    }

    //Sapient generated method id: ${963e62ab-720c-3335-b337-b7a4608d8bc9}
    @Test()
    public void codeWhenThisCodesIsNull() {
        /* Branches:
         * (codeShift >= 0) : true
         * (null == this.codes) : true
         */
        //Arrange Statement(s)
        MonetaryFormat target = new MonetaryFormat(true);

        //Act Statement(s)
        MonetaryFormat result = target.code(1, "code1");

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${47fdf695-5162-3f40-8756-0cc1e6d87bba}
    @Test()
    public void codeWhenThisCodesIsNotNull() {
        /* Branches:
         * (codeShift >= 0) : true
         * (null == this.codes) : false
         */
        //Arrange Statement(s)
        MonetaryFormat target = new MonetaryFormat(true);

        //Act Statement(s)
        MonetaryFormat result = target.code(1, "code1");

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${1ff9fc3c-a15e-31d2-af83-29727ff221bf}
    @Test()
    public void codeSeparatorWhenCharacterIsDigitCodeSeparatorThrowsIllegalArgumentException() {
        /* Branches:
         * (!Character.isDigit(codeSeparator)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        MonetaryFormat target = new MonetaryFormat(false);
        thrown.expect(IllegalArgumentException.class);

        //Act Statement(s)
        target.codeSeparator('A');
    }

    //Sapient generated method id: ${923f2f24-0fb3-3237-883c-04ef6161edc4}
    @Test()
    public void codeSeparatorWhenCodeSeparatorNotGreaterThan0ThrowsIllegalArgumentException() {
        /* Branches:
         * (!Character.isDigit(codeSeparator)) : true
         * (codeSeparator > 0) : false
         */
        //Arrange Statement(s)
        MonetaryFormat target = new MonetaryFormat(true);
        thrown.expect(IllegalArgumentException.class);

        //Act Statement(s)
        target.codeSeparator('\u0000');
    }

    //Sapient generated method id: ${d9044eb9-49c1-3cb0-aa0b-f821ec5a4bf0}
    @Test()
    public void codeSeparatorWhenCodeSeparatorEqualsThisCodeSeparator() {
        /* Branches:
         * (!Character.isDigit(codeSeparator)) : true
         * (codeSeparator > 0) : true
         * (codeSeparator == this.codeSeparator) : true
         */
        //Arrange Statement(s)
        MonetaryFormat target = new MonetaryFormat(true);

        //Act Statement(s)
        MonetaryFormat result = target.codeSeparator(' ');

        //Assert statement(s)
        assertThat(result, equalTo(target));
    }

    //Sapient generated method id: ${9c03b39f-7b25-316b-81db-7affa0e97c56}
    @Test()
    public void codeSeparatorWhenCodeSeparatorNotEqualsThisCodeSeparator() {
        /* Branches:
         * (!Character.isDigit(codeSeparator)) : true
         * (codeSeparator > 0) : true
         * (codeSeparator == this.codeSeparator) : false
         */
        //Arrange Statement(s)
        MonetaryFormat target = new MonetaryFormat(true);

        //Act Statement(s)
        MonetaryFormat result = target.codeSeparator('\uD83F');

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${62fd373b-1dcb-3586-b942-5efbf95c23e7}
    @Test()
    public void prefixCodeWhenCodePrefixed() {
        /* Branches:
         * (codePrefixed) : true
         */
        //Arrange Statement(s)
        MonetaryFormat target = new MonetaryFormat(true);

        //Act Statement(s)
        MonetaryFormat result = target.prefixCode();

        //Assert statement(s)
        assertThat(result, equalTo(target));
    }

    //Sapient generated method id: ${ab14d391-049a-3b77-8af4-b2ad9dac2553}
    @Test()
    public void postfixCodeWhenCodePrefixed() {
        /* Branches:
         * (!codePrefixed) : false
         */
        //Arrange Statement(s)
        MonetaryFormat target = new MonetaryFormat(true);

        //Act Statement(s)
        MonetaryFormat result = target.postfixCode();

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${cc2f3863-72a1-35d9-a9af-cf9de1e08603}
    @Test()
    public void withLocaleTest() {
        //Arrange Statement(s)
        MonetaryFormat target = new MonetaryFormat(true);
        Locale locale = new Locale("language1");

        //Act Statement(s)
        MonetaryFormat result = target.withLocale(locale);

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${6a648dd6-5ded-38b1-8ffe-c69abe6c9e98}
    @Test()
    public void formatWhenMaxVisibleDecimalsGreaterThanSmallestUnitExponentThrowsIllegalStateException() {
        /* Branches:
         * (decimalGroups != null) : false
         * (maxVisibleDecimals <= smallestUnitExponent) : false
         */
        //Arrange Statement(s)
        doReturn(1).when(monetaryMock).smallestUnitExponent();
        MonetaryFormat target = new MonetaryFormat(true);
        thrown.expect(IllegalStateException.class);

        //Act Statement(s)
        target.format(monetaryMock);

        //Assert statement(s)
        verify(monetaryMock).smallestUnitExponent();
    }

    //Sapient generated method id: ${33b8a937-f370-31f2-a01f-3f5d962fcb03}
    @Test()
    public void formatWhenMonetaryGetValueLessThan0AndCodesIsNotNullAndCodePrefixedAndZeroDigitEquals_0_() {
        /* Branches:
         * (decimalGroups != null) : false
         * (maxVisibleDecimals <= smallestUnitExponent) : true
         * (decimalShift > 0) : false
         * (str.length() > minDecimals) : true
         * (str.charAt(str.length() - 1) == '0') : true
         * (decimalGroups != null) : false
         * (str.length() > 0) : true
         * (monetary.getValue() < 0) : true
         * (codes != null) : true
         * (codePrefixed) : true
         * (zeroDigit != '0') : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(0).when(monetaryMock).smallestUnitExponent();
        doReturn(0L).when(monetaryMock).getValue();
        MonetaryFormat target = spy(new MonetaryFormat(false));
        doReturn("return_of_code1").when(target).code();

        //Act Statement(s)
        CharSequence result = target.format(monetaryMock);

        //Assert statement(s)
        //TODO: Please implement equals method in StringBuilder for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
        verify(monetaryMock).smallestUnitExponent();
        verify(monetaryMock, times(2)).getValue();
        verify(target).code();
    }

    //Sapient generated method id: ${b66546f3-348b-344e-b792-4890a19950a3}
    @Test()
    public void formatWhenMonetaryGetValueNotLessThan0AndPositiveSignNotEquals0AndCodesIsNotNullAndCodePrefixedAndZeroDigitEquals_0_() {
        /* Branches:
         * (decimalGroups != null) : false
         * (maxVisibleDecimals <= smallestUnitExponent) : true
         * (decimalShift > 0) : true
         * (str.length() > minDecimals) : true
         * (str.charAt(str.length() - 1) == '0') : true
         * (decimalGroups != null) : false
         * (str.length() > 0) : true
         * (monetary.getValue() < 0) : false
         * (positiveSign != 0) : true
         * (codes != null) : true
         * (codePrefixed) : true
         * (zeroDigit != '0') : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Monetary monetaryMock = mock(Monetary.class, "123");
        doReturn(8).when(monetaryMock).smallestUnitExponent();
        doReturn(0L, 123L).when(monetaryMock).getValue();
        MonetaryFormat target = spy(new MonetaryFormat(true));
        doReturn("return_of_code1").when(target).code();

        //Act Statement(s)
        CharSequence result = target.format(monetaryMock);

        //Assert statement(s)
        //TODO: Please implement equals method in StringBuilder for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
        verify(monetaryMock).smallestUnitExponent();
        verify(monetaryMock, times(2)).getValue();
        verify(target).code();
    }

    //Sapient generated method id: ${a97e1e33-b1e5-394a-9a33-e33ffcd0ecfc}
    @Test()
    public void parseWhenStrIsEmptyThrowsNumberFormatException() throws NumberFormatException {
        /* Branches:
         * (DECIMALS_PADDING.length() >= smallestUnitExponent) : true  #  inside parseValue method
         * (str.isEmpty()) : true  #  inside parseValue method
         */
        //Arrange Statement(s)
        MonetaryFormat target = new MonetaryFormat(true);
        NumberFormatException numberFormatException = new NumberFormatException("empty string");
        thrown.expect(NumberFormatException.class);
        thrown.expectMessage(numberFormatException.getMessage());

        //Act Statement(s)
        target.parse("");
    }

    //Sapient generated method id: ${97e5be6a-76a3-32fc-8d21-dc45ed2ee22b}
    @Test()
    public void parseWhenDecimalMarkIndexNotEqualsMinus1AndDecimalsIndexOfDecimalMarkNotEqualsMinus1ThrowsNumberFormatException() throws NumberFormatException {
        /* Branches:
         * (DECIMALS_PADDING.length() >= smallestUnitExponent) : true  #  inside parseValue method
         * (str.isEmpty()) : false  #  inside parseValue method
         * (first == negativeSign) : false  #  inside parseValue method
         * (first == positiveSign) : true  #  inside parseValue method
         * (decimalMarkIndex != -1) : true  #  inside parseValue method
         * (decimals.indexOf(decimalMark) != -1) : true  #  inside parseValue method
         */
        //Arrange Statement(s)
        MonetaryFormat target = new MonetaryFormat(true);
        NumberFormatException numberFormatException = new NumberFormatException("more than one decimal mark");
        thrown.expect(NumberFormatException.class);
        thrown.expectMessage(numberFormatException.getMessage());

        //Act Statement(s)
        target.parse("\u0000..");
    }

    //Sapient generated method id: ${5500c2a6-7db2-33a5-ab0e-e165ed9ea4fb}
    @Test()
    public void parseWhenDecimalMarkIndexEqualsMinus1AndSatoshisToCharArrayIsNotEmptyAndCharacterNotIsDigitCThrowsNumberFormatException() throws NumberFormatException {
        /* Branches:
         * (DECIMALS_PADDING.length() >= smallestUnitExponent) : true  #  inside parseValue method
         * (str.isEmpty()) : false  #  inside parseValue method
         * (first == negativeSign) : false  #  inside parseValue method
         * (first == positiveSign) : true  #  inside parseValue method
         * (decimalMarkIndex != -1) : false  #  inside parseValue method
         * (for-each(satoshis.toCharArray())) : true  #  inside parseValue method
         * (!Character.isDigit(c)) : true  #  inside parseValue method
         */
        //Arrange Statement(s)
        MonetaryFormat target = new MonetaryFormat(true);
        NumberFormatException numberFormatException = new NumberFormatException("illegal character: A");
        thrown.expect(NumberFormatException.class);
        thrown.expectMessage(numberFormatException.getMessage());

        //Act Statement(s)
        target.parse("\u0000B");
    }

    //Sapient generated method id: ${0e40efad-9244-36a2-be08-bc9e10c95918}
    @Test()
    public void parseWhenFirstEqualsNegativeSign() throws NumberFormatException {
        /* Branches:
         * (DECIMALS_PADDING.length() >= smallestUnitExponent) : true  #  inside parseValue method
         * (str.isEmpty()) : false  #  inside parseValue method
         * (first == negativeSign) : false  #  inside parseValue method
         * (first == positiveSign) : true  #  inside parseValue method
         * (decimalMarkIndex != -1) : true  #  inside parseValue method
         * (decimals.indexOf(decimalMark) != -1) : false  #  inside parseValue method
         * (for-each(satoshis.toCharArray())) : true  #  inside parseValue method
         * (!Character.isDigit(c)) : false  #  inside parseValue method
         * (first == negativeSign) : true  #  inside parseValue method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin coinMock = mock(Coin.class);
        try (MockedStatic<Coin> coin = mockStatic(Coin.class)) {
            coin.when(() -> Coin.valueOf(0L)).thenReturn(coinMock);
            MonetaryFormat target = new MonetaryFormat(false);
            //Act Statement(s)
            Coin result = target.parse("str1");
            //Assert statement(s)
            assertThat(result, equalTo(coinMock));
            coin.verify(() -> Coin.valueOf(0L), atLeast(1));
        }
    }

    //Sapient generated method id: ${d5248d56-1615-3dad-bffe-b2f4dd851116}
    @Test()
    public void parseFiatWhenStrIsEmptyThrowsNumberFormatException() throws NumberFormatException {
        /* Branches:
         * (DECIMALS_PADDING.length() >= smallestUnitExponent) : true  #  inside parseValue method
         * (str.isEmpty()) : true  #  inside parseValue method
         */
        //Arrange Statement(s)
        MonetaryFormat target = new MonetaryFormat(true);
        NumberFormatException numberFormatException = new NumberFormatException("empty string");
        thrown.expect(NumberFormatException.class);
        thrown.expectMessage(numberFormatException.getMessage());

        //Act Statement(s)
        target.parseFiat("currencyCode1", "");
    }

    //Sapient generated method id: ${ec26d7be-5e1b-37f5-892f-423daded937d}
    @Test()
    public void parseFiatWhenDecimalMarkIndexNotEqualsMinus1AndDecimalsIndexOfDecimalMarkNotEqualsMinus1ThrowsNumberFormatException() throws NumberFormatException {
        /* Branches:
         * (DECIMALS_PADDING.length() >= smallestUnitExponent) : true  #  inside parseValue method
         * (str.isEmpty()) : false  #  inside parseValue method
         * (first == negativeSign) : false  #  inside parseValue method
         * (first == positiveSign) : true  #  inside parseValue method
         * (decimalMarkIndex != -1) : true  #  inside parseValue method
         * (decimals.indexOf(decimalMark) != -1) : true  #  inside parseValue method
         */
        //Arrange Statement(s)
        MonetaryFormat target = new MonetaryFormat(true);
        NumberFormatException numberFormatException = new NumberFormatException("more than one decimal mark");
        thrown.expect(NumberFormatException.class);
        thrown.expectMessage(numberFormatException.getMessage());

        //Act Statement(s)
        target.parseFiat("currencyCode1", "\u0000..");
    }

    //Sapient generated method id: ${757b17bb-79be-36e7-a389-402579ebfa2a}
    @Test()
    public void parseFiatWhenSatoshisToCharArrayIsNotEmptyAndCharacterNotIsDigitCThrowsNumberFormatException() throws NumberFormatException {
        /* Branches:
         * (DECIMALS_PADDING.length() >= smallestUnitExponent) : true  #  inside parseValue method
         * (str.isEmpty()) : false  #  inside parseValue method
         * (first == negativeSign) : false  #  inside parseValue method
         * (first == positiveSign) : true  #  inside parseValue method
         * (decimalMarkIndex != -1) : false  #  inside parseValue method
         * (for-each(satoshis.toCharArray())) : true  #  inside parseValue method
         * (!Character.isDigit(c)) : true  #  inside parseValue method
         */
        //Arrange Statement(s)
        MonetaryFormat target = new MonetaryFormat(true);
        NumberFormatException numberFormatException = new NumberFormatException("illegal character: A");
        thrown.expect(NumberFormatException.class);
        thrown.expectMessage(numberFormatException.getMessage());

        //Act Statement(s)
        target.parseFiat("currencyCode1", "\u0000B");
    }

    //Sapient generated method id: ${7006155f-dd51-396d-9384-65af1d2daa15}
    @Test()
    public void parseFiatWhenFirstEqualsNegativeSign() throws NumberFormatException {
        /* Branches:
         * (DECIMALS_PADDING.length() >= smallestUnitExponent) : true  #  inside parseValue method
         * (str.isEmpty()) : false  #  inside parseValue method
         * (first == negativeSign) : false  #  inside parseValue method
         * (first == positiveSign) : true  #  inside parseValue method
         * (decimalMarkIndex != -1) : true  #  inside parseValue method
         * (decimals.indexOf(decimalMark) != -1) : false  #  inside parseValue method
         * (for-each(satoshis.toCharArray())) : true  #  inside parseValue method
         * (!Character.isDigit(c)) : false  #  inside parseValue method
         * (first == negativeSign) : true  #  inside parseValue method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Fiat fiatMock = mock(Fiat.class);
        try (MockedStatic<Fiat> fiat = mockStatic(Fiat.class)) {
            fiat.when(() -> Fiat.valueOf("currencyCode1", 0L)).thenReturn(fiatMock);
            MonetaryFormat target = new MonetaryFormat(false);
            //Act Statement(s)
            Fiat result = target.parseFiat("currencyCode1", "str1");
            //Assert statement(s)
            assertThat(result, equalTo(fiatMock));
            fiat.verify(() -> Fiat.valueOf("currencyCode1", 0L), atLeast(1));
        }
    }

    //Sapient generated method id: ${2cd301d0-2498-3878-97bf-070e1fdb8e53}
    @Test()
    public void code1WhenShiftIndexOfCodesIsNotNull() {
        /* Branches:
         * (codes == null) : false
         * (codes[shift] == null) : false
         */
        //Arrange Statement(s)
        MonetaryFormat target = new MonetaryFormat(true);

        //Act Statement(s)
        String result = target.code();

        //Assert statement(s)
        assertThat(result, equalTo("\u20BF"));
    }
}
