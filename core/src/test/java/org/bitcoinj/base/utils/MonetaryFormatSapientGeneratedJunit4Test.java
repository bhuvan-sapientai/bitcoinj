package org.bitcoinj.base.utils;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.math.RoundingMode;

import org.mockito.stubbing.Answer;
import org.bitcoinj.base.Monetary;
import org.bitcoinj.base.internal.Preconditions;

import java.util.Locale;
import java.util.function.Supplier;

import org.mockito.MockedStatic;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class MonetaryFormatSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Monetary monetaryMock = mock(Monetary.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${444f0862-e09d-380c-aa36-5078b542a394}
    @Ignore()
    @Test()
    public void negativeSignWhenCharacterNotIsDigitNegativeSignThrowsIllegalArgumentException() {
        /* Branches:
         * (!Character.isDigit(negativeSign)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            MonetaryFormat target = new MonetaryFormat(true);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.negativeSign('A');
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${82510699-208f-3216-b79d-d23ba54f97db}
    @Ignore()
    @Test()
    public void negativeSignWhenCharacterIsDigitNegativeSignThrowsIllegalArgumentException() {
        /* Branches:
         * (!Character.isDigit(negativeSign)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            MonetaryFormat target = new MonetaryFormat(false);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.negativeSign('A');
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${0c421713-8e02-371f-b0f0-c4c68e495b27}
    @Ignore()
    @Test()
    public void positiveSignWhenCharacterNotIsDigitPositiveSignThrowsIllegalArgumentException() {
        /* Branches:
         * (!Character.isDigit(positiveSign)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            MonetaryFormat target = new MonetaryFormat(true);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.positiveSign('A');
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${be5d81f5-c486-3ee2-bf04-9380b406bc8a}
    @Ignore()
    @Test()
    public void positiveSignWhenCharacterIsDigitPositiveSignThrowsIllegalArgumentException() {
        /* Branches:
         * (!Character.isDigit(positiveSign)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            MonetaryFormat target = new MonetaryFormat(false);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.positiveSign('A');
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
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

    //Sapient generated method id: ${b23fa074-9e12-36d6-a178-dcbba9818bd8}
    @Ignore()
    @Test()
    public void decimalMarkWhenCharacterNotIsDigitDecimalMarkThrowsIllegalArgumentException() {
        /* Branches:
         * (!Character.isDigit(decimalMark)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            MonetaryFormat target = new MonetaryFormat(true);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.decimalMark('A');
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${5ddaf9a0-df81-3b76-9ead-5bf50894084c}
    @Ignore()
    @Test()
    public void decimalMarkWhenCharacterIsDigitDecimalMarkThrowsIllegalArgumentException() {
        /* Branches:
         * (!Character.isDigit(decimalMark)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            MonetaryFormat target = new MonetaryFormat(false);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.decimalMark('A');
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
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

    //Sapient generated method id: ${e2bf9808-8943-3038-8589-f4022e068bc3}
    @Ignore()
    @Test()
    public void repeatOptionalDecimalsWhenRepetitionsGreaterThanOrEqualsTo0ThrowsIllegalArgumentException() {
        /* Branches:
         * (repetitions >= 0) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            MonetaryFormat target = new MonetaryFormat(true);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.repeatOptionalDecimals(0, 1);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${d9eedd8b-a3a2-3070-952f-7ab6850262cf}
    @Test()
    public void repeatOptionalDecimalsWhenRepetitionsLessThan0ThrowsIllegalArgumentException() {
        /* Branches:
         * (repetitions >= 0) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            MonetaryFormat target = new MonetaryFormat(true);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.repeatOptionalDecimals(0, -1);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
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

    //Sapient generated method id: ${3779f917-7f05-3e1d-a075-74d55ca3fac9}
    @Ignore()
    @Test()
    public void codeWhenCodeShiftGreaterThanOrEqualsTo0ThrowsIllegalArgumentException() {
        /* Branches:
         * (codeShift >= 0) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            MonetaryFormat target = new MonetaryFormat(true);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.code(1, "code1");
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${01e29c09-a7e9-394e-9b1c-cf8d9c596442}
    @Test()
    public void codeWhenCodeShiftLessThan0ThrowsIllegalArgumentException() {
        /* Branches:
         * (codeShift >= 0) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            MonetaryFormat target = new MonetaryFormat(true);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.code(-1, "code1");
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${aa19d1ad-818c-3f30-abaf-5c707cfb852a}
    @Ignore()
    @Test()
    public void codeSeparatorWhenCharacterNotIsDigitCodeSeparatorThrowsIllegalArgumentException() {
        /* Branches:
         * (!Character.isDigit(codeSeparator)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            MonetaryFormat target = new MonetaryFormat(true);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.codeSeparator('A');
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${1ff9fc3c-a15e-31d2-af83-29727ff221bf}
    @Ignore()
    @Test()
    public void codeSeparatorWhenCharacterIsDigitCodeSeparatorThrowsIllegalArgumentException() {
        /* Branches:
         * (!Character.isDigit(codeSeparator)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            MonetaryFormat target = new MonetaryFormat(false);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.codeSeparator('A');
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
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

    //Sapient generated method id: ${93ef893b-c9d5-3a85-9f7e-7bb1fd8e643f}
    @Ignore()
    @Test()
    public void formatWhenMaxVisibleDecimalsLessThanOrEqualsToSmallestUnitExponentThrowsIllegalStateException() {
        /* Branches:
         * (decimalGroups != null) : false
         * (maxVisibleDecimals <= smallestUnitExponent) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(2).when(monetaryMock).smallestUnitExponent();
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenThrow(illegalStateException);
            MonetaryFormat target = new MonetaryFormat(true);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.format(monetaryMock);
            //Assert statement(s)
            verify(monetaryMock).smallestUnitExponent();
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${6a648dd6-5ded-38b1-8ffe-c69abe6c9e98}
    @Test()
    public void formatWhenMaxVisibleDecimalsGreaterThanSmallestUnitExponentThrowsIllegalStateException() {
        /* Branches:
         * (decimalGroups != null) : false
         * (maxVisibleDecimals <= smallestUnitExponent) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(1).when(monetaryMock).smallestUnitExponent();
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenThrow(illegalStateException);
            MonetaryFormat target = new MonetaryFormat(true);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.format(monetaryMock);
            //Assert statement(s)
            verify(monetaryMock).smallestUnitExponent();
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${07a9f07d-6825-3bb7-807f-438d0659ea5f}
    @Ignore()
    @Test()
    public void parseWhenDECIMALS_PADDINGLengthGreaterThanOrEqualsToSmallestUnitExponentThrowsIllegalStateException() throws NumberFormatException {
        /* Branches:
         * (DECIMALS_PADDING.length() >= smallestUnitExponent) : true  #  inside parseValue method
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenThrow(illegalStateException);
            MonetaryFormat target = new MonetaryFormat(true);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.parse("str1");
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${b9eee9ff-59f0-3ba3-85c4-6a295192363a}
    @Ignore()
    @Test()
    public void parseFiatWhenDECIMALS_PADDINGLengthGreaterThanOrEqualsToSmallestUnitExponentThrowsIllegalStateException() throws NumberFormatException {
        /* Branches:
         * (DECIMALS_PADDING.length() >= smallestUnitExponent) : true  #  inside parseValue method
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalStateException illegalStateException = new IllegalStateException();
            preconditions.when(() -> Preconditions.checkState(eq(false), (Supplier) any())).thenThrow(illegalStateException);
            MonetaryFormat target = new MonetaryFormat(true);
            thrown.expect(IllegalStateException.class);
            //Act Statement(s)
            target.parseFiat("currencyCode1", "str1");
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkState(eq(false), (Supplier) any()));
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
