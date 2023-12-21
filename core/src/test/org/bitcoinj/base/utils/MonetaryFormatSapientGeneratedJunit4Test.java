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

    //Sapient generated method id: ${9ec7ea02-1e86-342a-9733-d8b53a49beb7}
    @Ignore()
    @Test()
    public void negativeSignWhenNegativeSignNotEqualsThisNegativeSign() {
        /* Branches:
         * (!Character.isDigit(negativeSign)) : true
         * (negativeSign > 0) : true
         * (negativeSign == this.negativeSign) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            MonetaryFormat target = new MonetaryFormat(true);
            //Act Statement(s)
            MonetaryFormat result = target.negativeSign('\uD83F');
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(2));
        }
    }

    //Sapient generated method id: ${968d5cad-febe-36e0-a15e-ec998c66eec7}
    @Ignore()
    @Test()
    public void negativeSignWhenNegativeSignNotGreaterThan0AndNegativeSignNotEqualsThisNegativeSign() {
        /* Branches:
         * (!Character.isDigit(negativeSign)) : true
         * (negativeSign > 0) : false
         * (negativeSign == this.negativeSign) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            MonetaryFormat target = new MonetaryFormat(true);
            //Act Statement(s)
            MonetaryFormat result = target.negativeSign('\u0000');
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(2));
        }
    }

    //Sapient generated method id: ${abb2957d-2fc8-3c18-8545-fe5f578003da}
    @Ignore()
    @Test()
    public void negativeSignWhenNegativeSignGreaterThan0AndNegativeSignEqualsThisNegativeSign() {
        /* Branches:
         * (!Character.isDigit(negativeSign)) : false
         * (negativeSign > 0) : true
         * (negativeSign == this.negativeSign) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            MonetaryFormat target = new MonetaryFormat(false);
            //Act Statement(s)
            MonetaryFormat result = target.negativeSign('A');
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(2));
        }
    }

    //Sapient generated method id: ${e50e351c-b8ae-3da4-b637-d9f0a98e77b4}
    @Ignore()
    @Test()
    public void positiveSignWhenPositiveSignNotEqualsThisPositiveSign() {
        /* Branches:
         * (!Character.isDigit(positiveSign)) : true
         * (positiveSign == this.positiveSign) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            MonetaryFormat target = new MonetaryFormat(true);
            //Act Statement(s)
            MonetaryFormat result = target.positiveSign('A');
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${fc6a10e3-518c-3989-8a18-49894fe983b8}
    @Ignore()
    @Test()
    public void positiveSignWhenCharacterIsDigitPositiveSignAndPositiveSignEqualsThisPositiveSign() {
        /* Branches:
         * (!Character.isDigit(positiveSign)) : false
         * (positiveSign == this.positiveSign) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            MonetaryFormat target = new MonetaryFormat(false);
            //Act Statement(s)
            MonetaryFormat result = target.positiveSign('A');
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
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

    //Sapient generated method id: ${22c1f48a-0e87-3add-ab60-f4de673cd1f3}
    @Ignore()
    @Test()
    public void decimalMarkWhenDecimalMarkNotEqualsThisDecimalMark() {
        /* Branches:
         * (!Character.isDigit(decimalMark)) : true
         * (decimalMark > 0) : true
         * (decimalMark == this.decimalMark) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            MonetaryFormat target = new MonetaryFormat(true);
            //Act Statement(s)
            MonetaryFormat result = target.decimalMark('\uD83F');
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(2));
        }
    }

    //Sapient generated method id: ${565633aa-d902-397b-b2b7-a3bdf639a4bf}
    @Ignore()
    @Test()
    public void decimalMarkWhenDecimalMarkNotGreaterThan0AndDecimalMarkNotEqualsThisDecimalMark() {
        /* Branches:
         * (!Character.isDigit(decimalMark)) : true
         * (decimalMark > 0) : false
         * (decimalMark == this.decimalMark) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            MonetaryFormat target = new MonetaryFormat(true);
            //Act Statement(s)
            MonetaryFormat result = target.decimalMark('\u0000');
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(2));
        }
    }

    //Sapient generated method id: ${8fd7fce3-46b9-3c46-b098-90645e1ab1dc}
    @Ignore()
    @Test()
    public void decimalMarkWhenDecimalMarkGreaterThan0AndDecimalMarkEqualsThisDecimalMark() {
        /* Branches:
         * (!Character.isDigit(decimalMark)) : false
         * (decimalMark > 0) : true
         * (decimalMark == this.decimalMark) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            MonetaryFormat target = new MonetaryFormat(false);
            //Act Statement(s)
            MonetaryFormat result = target.decimalMark('A');
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(2));
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

    //Sapient generated method id: ${7e2882fb-08d8-36ce-8620-3ad9b74c6e58}
    @Ignore()
    @Test()
    public void repeatOptionalDecimalsWhenILessThanRepetitions() {
        /* Branches:
         * (repetitions >= 0) : true
         * (i < repetitions) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            MonetaryFormat target = new MonetaryFormat(true);
            //Act Statement(s)
            MonetaryFormat result = target.repeatOptionalDecimals(1, 1);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${bcfdbac0-9191-3e5b-a2ee-5b6de14c4e73}
    @Ignore()
    @Test()
    public void repeatOptionalDecimalsWhenRepetitionsLessThan0AndINotLessThanRepetitions() {
        /* Branches:
         * (repetitions >= 0) : false
         * (i < repetitions) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            MonetaryFormat target = new MonetaryFormat(true);
            //Act Statement(s)
            MonetaryFormat result = target.repeatOptionalDecimals(0, -1);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
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

    //Sapient generated method id: ${47fdf695-5162-3f40-8756-0cc1e6d87bba}
    @Ignore()
    @Test()
    public void codeWhenThisCodesIsNotNull() {
        /* Branches:
         * (codeShift >= 0) : true
         * (null == this.codes) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            MonetaryFormat target = new MonetaryFormat(true);
            //Act Statement(s)
            MonetaryFormat result = target.code(1, "code1");
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${38bc8407-2b3e-3065-b034-3ce7247d4bc6}
    @Ignore()
    @Test()
    public void codeWhenCodeShiftLessThan0AndThisCodesIsNull() {
        /* Branches:
         * (codeShift >= 0) : false
         * (null == this.codes) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            MonetaryFormat target = new MonetaryFormat(false);
            //Act Statement(s)
            MonetaryFormat result = target.code(0, "code1");
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${9c03b39f-7b25-316b-81db-7affa0e97c56}
    @Ignore()
    @Test()
    public void codeSeparatorWhenCodeSeparatorNotEqualsThisCodeSeparator() {
        /* Branches:
         * (!Character.isDigit(codeSeparator)) : true
         * (codeSeparator > 0) : true
         * (codeSeparator == this.codeSeparator) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            MonetaryFormat target = new MonetaryFormat(true);
            //Act Statement(s)
            MonetaryFormat result = target.codeSeparator('\uD83F');
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(2));
        }
    }

    //Sapient generated method id: ${9e00b82f-3a63-3c35-bd9e-e50876b333fd}
    @Ignore()
    @Test()
    public void codeSeparatorWhenCodeSeparatorNotGreaterThan0AndCodeSeparatorNotEqualsThisCodeSeparator() {
        /* Branches:
         * (!Character.isDigit(codeSeparator)) : true
         * (codeSeparator > 0) : false
         * (codeSeparator == this.codeSeparator) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            MonetaryFormat target = new MonetaryFormat(true);
            //Act Statement(s)
            MonetaryFormat result = target.codeSeparator('\u0000');
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(2));
        }
    }

    //Sapient generated method id: ${50ee4e14-0df4-36aa-aac0-30a4e6e3b57f}
    @Ignore()
    @Test()
    public void codeSeparatorWhenCodeSeparatorGreaterThan0AndCodeSeparatorEqualsThisCodeSeparator() {
        /* Branches:
         * (!Character.isDigit(codeSeparator)) : false
         * (codeSeparator > 0) : true
         * (codeSeparator == this.codeSeparator) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            MonetaryFormat target = new MonetaryFormat(false);
            //Act Statement(s)
            MonetaryFormat result = target.codeSeparator('A');
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(2));
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
