package org.bitcoinj.base.utils;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.stubbing.Answer;

import java.util.function.Supplier;

import org.mockito.MockedStatic;
import org.bitcoinj.base.internal.Preconditions;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

public class FiatSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Fiat fiatMock = mock(Fiat.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${3aeb0092-1c55-3557-8de4-613a23e110b0}, hash: FEFF976E77B25451A7812D07BEC1B23B
    @Test()
    public void valueOfTest() {
        //Act Statement(s)
        Fiat result = Fiat.valueOf("currencyCode1", 0L);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${289b9396-36ac-3ecc-a969-f108cfcc8920}, hash: 5A46EB3DB34FD7F0BCDEE069F5C6CF51
    @Test()
    public void smallestUnitExponentTest() {
        //Arrange Statement(s)
        Fiat target = Fiat.valueOf("currencyCode1", 0L);
        //Act Statement(s)
        int result = target.smallestUnitExponent();
        //Assert statement(s)
        assertThat(result, equalTo(4));
    }

    //Sapient generated method id: ${3a29f388-fbb5-361e-bb99-089b671da624}, hash: 3E7EA34956957F5A11FC07B6EF159F54
    @Test()
    public void parseFiatTest() {
        //Arrange Statement(s)
        try (MockedStatic<Fiat> fiat = mockStatic(Fiat.class, CALLS_REAL_METHODS)) {
            fiat.when(() -> Fiat.valueOf("currencyCode1", 10000L)).thenReturn(fiatMock);
            //Act Statement(s)
            Fiat result = Fiat.parseFiat("currencyCode1", "1.0");
            //Assert statement(s)
            assertThat(result, equalTo(fiatMock));
            fiat.verify(() -> Fiat.valueOf("currencyCode1", 10000L), atLeast(1));
        }
    }

    //Sapient generated method id: ${7dec7cab-e382-33ae-b8a5-90e49107a5e0}, hash: 41C477BBC2B8884AA2FD35F48FA16FE1
    @Test()
    public void parseFiatWhenCaughtArithmeticExceptionThrowsIllegalArgumentException() {
        /* Branches:
         * (catch-exception (ArithmeticException)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Fiat> fiat = mockStatic(Fiat.class, CALLS_REAL_METHODS)) {
            ArithmeticException arithmeticException = new ArithmeticException();
            fiat.when(() -> Fiat.valueOf("currencyCode1", 10000L)).thenThrow(arithmeticException);
            thrown.expect(IllegalArgumentException.class);
            thrown.expectCause(is(instanceOf(ArithmeticException.class)));
            //Act Statement(s)
            Fiat.parseFiat("currencyCode1", "1.0");
            //Assert statement(s)
            fiat.verify(() -> Fiat.valueOf("currencyCode1", 10000L), atLeast(1));
        }
    }

    //Sapient generated method id: ${8d4cc770-1398-3f6f-bc16-f65e59403548}, hash: 1C9DB0080459ADD497E4B227C6E13E18
    @Test()
    public void parseFiatInexactTest() {
        //Arrange Statement(s)
        try (MockedStatic<Fiat> fiat = mockStatic(Fiat.class, CALLS_REAL_METHODS)) {
            fiat.when(() -> Fiat.valueOf("currencyCode1", 0L)).thenReturn(fiatMock);
            //Act Statement(s)
            Fiat result = Fiat.parseFiatInexact("currencyCode1", "0.0");
            //Assert statement(s)
            assertThat(result, equalTo(fiatMock));
            fiat.verify(() -> Fiat.valueOf("currencyCode1", 0L), atLeast(1));
        }
    }

    //Sapient generated method id: ${7562d76a-bbdc-346d-8087-9b764344f1fc}, hash: AA0771DCE58DB8BAFC6B8B46385C4F19
    @Test()
    public void parseFiatInexactWhenCaughtArithmeticExceptionThrowsIllegalArgumentException() {
        /* Branches:
         * (catch-exception (ArithmeticException)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Fiat> fiat = mockStatic(Fiat.class, CALLS_REAL_METHODS)) {
            ArithmeticException arithmeticException = new ArithmeticException();
            fiat.when(() -> Fiat.valueOf("currencyCode1", 0L)).thenThrow(arithmeticException);
            thrown.expect(IllegalArgumentException.class);
            thrown.expectCause(is(instanceOf(ArithmeticException.class)));
            //Act Statement(s)
            Fiat.parseFiatInexact("currencyCode1", "0.0");
            //Assert statement(s)
            fiat.verify(() -> Fiat.valueOf("currencyCode1", 0L), atLeast(1));
        }
    }

    //Sapient generated method id: ${2f52d914-224e-3cf8-a2e5-c61089a0f6f4}, hash: CDD86F3528A75C0DE9390D0EA2492C8F
    @Test()
    public void addTest() {
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Fiat target = Fiat.valueOf("B", 1L);
            Fiat fiat = Fiat.valueOf("A", 1L);
            //Act Statement(s)
            Fiat result = target.add(fiat);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${97b5e3b9-042a-36e9-ba00-8365659a5608}, hash: C699DE1609AC3067EC7881576F8079AC
    @Test()
    public void subtractTest() {
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Fiat target = Fiat.valueOf("", 1L);
            Fiat fiat = Fiat.valueOf("", 1L);
            //Act Statement(s)
            Fiat result = target.subtract(fiat);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${f2e2be9f-c5d7-3010-98aa-6831b8f18beb}, hash: 95F0F822E5EFDECC200FE8E1D13E9FFE
    @Test()
    public void multiplyTest() {
        //Arrange Statement(s)
        Fiat target = Fiat.valueOf("currencyCode1", 1L);
        //Act Statement(s)
        Fiat result = target.multiply(1L);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${2a79afae-dad2-39ac-b954-5ff63850d9d4}, hash: F8EEB423D119CD225441F25E76A6919D
    @Test()
    public void divideTest() {
        //Arrange Statement(s)
        Fiat target = Fiat.valueOf("currencyCode1", 1L);
        //Act Statement(s)
        Fiat result = target.divide(1L);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${0469b3a3-7fbb-3c2c-af69-4344a07bb011}, hash: 5B595EA3395E3BA3EAC3DC2BB9FF31CB
    @Test()
    public void divideAndRemainderTest() {
        //Arrange Statement(s)
        //Fiat target = Fiat.valueOf("currencyCode1", 1L);
        //Act Statement(s)
        //Fiat[] result = target.divideAndRemainder(1L);
        //TODO: Make this constructor public.
        //Fiat fiat = new Fiat("currencyCode1", 1L);
        //TODO: Make this constructor public.
        //Fiat fiat2 = new Fiat("currencyCode1", 0L);
        //Fiat[] fiatResultArray = new Fiat[] { fiat, fiat2 };
        //Assert statement(s)
        //assertThat(result, equalTo(fiatResultArray));
    }

    //Sapient generated method id: ${c70236b7-98f2-3ecd-942d-6cc0d5da7e85}, hash: A3598123752C026A14EDE19E353D34AA
    @Test()
    public void divide1Test() {
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Fiat target = Fiat.valueOf("B", 1L);
            Fiat fiat = Fiat.valueOf("A", 1L);
            //Act Statement(s)
            long result = target.divide(fiat);
            //Assert statement(s)
            assertThat(result, equalTo(1L));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${a5b85392-24c9-3398-b016-26328a323b02}, hash: 8A49BBC9677B77224CD18253636B9C8A
    @Test()
    public void isPositiveWhenSignumEquals1() {
        /* Branches:
         * (signum() == 1) : true
         */
        //Arrange Statement(s)
        Fiat target = spy(Fiat.valueOf("currencyCode1", 0L));
        doReturn(1).when(target).signum();
        //Act Statement(s)
        boolean result = target.isPositive();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(target).signum();
    }

    //Sapient generated method id: ${7a79a994-c529-3c20-ac79-6c430e11e309}, hash: 0D77B0A775D864DF34C0256D5C6F8D9E
    @Test()
    public void isPositiveWhenSignumNotEquals1() {
        /* Branches:
         * (signum() == 1) : false
         */
        //Arrange Statement(s)
        Fiat target = spy(Fiat.valueOf("currencyCode1", 0L));
        doReturn(2).when(target).signum();
        //Act Statement(s)
        boolean result = target.isPositive();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(target).signum();
    }

    //Sapient generated method id: ${2ddd0ea6-c6ef-3140-9d36-3be9902ec24e}, hash: 8AC35C8ED7B6D1CC3591A9F8C9905A91
    @Test()
    public void isNegativeWhenSignumEqualsMinus1() {
        /* Branches:
         * (signum() == -1) : true
         */
        //Arrange Statement(s)
        Fiat target = spy(Fiat.valueOf("currencyCode1", 0L));
        doReturn(-1).when(target).signum();
        //Act Statement(s)
        boolean result = target.isNegative();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(target).signum();
    }

    //Sapient generated method id: ${62743f7a-453a-38f7-896d-d35950a48d87}, hash: 4821CD27B6A59EAFAA263A2638C27E2D
    @Test()
    public void isNegativeWhenSignumNotEqualsMinus1() {
        /* Branches:
         * (signum() == -1) : false
         */
        //Arrange Statement(s)
        Fiat target = spy(Fiat.valueOf("currencyCode1", 0L));
        doReturn(1).when(target).signum();
        //Act Statement(s)
        boolean result = target.isNegative();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(target).signum();
    }

    //Sapient generated method id: ${4b1595e5-98c7-36a0-861b-1053e7e18765}, hash: 25F4039E50D6535CC933ACF1AF87363D
    @Test()
    public void isZeroWhenSignumEquals0() {
        /* Branches:
         * (signum() == 0) : true
         */
        //Arrange Statement(s)
        Fiat target = spy(Fiat.valueOf("currencyCode1", 0L));
        doReturn(0).when(target).signum();
        //Act Statement(s)
        boolean result = target.isZero();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(target).signum();
    }

    //Sapient generated method id: ${700203bf-6954-3416-be8d-2f53edd277f8}, hash: 97E97E9270F814C6BDD741C267978829
    @Test()
    public void isZeroWhenSignumNotEquals0() {
        /* Branches:
         * (signum() == 0) : false
         */
        //Arrange Statement(s)
        Fiat target = spy(Fiat.valueOf("currencyCode1", 0L));
        doReturn(-1).when(target).signum();
        //Act Statement(s)
        boolean result = target.isZero();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(target).signum();
    }

    //Sapient generated method id: ${c5a48165-aff9-3266-b899-29bba2dcf02f}, hash: 6254DE6C548ABC53A0E7CAF7FBB85C23
    @Test()
    public void isGreaterThanWhenCompareToOtherGreaterThan0() {
        /* Branches:
         * (compareTo(other) > 0) : true
         */
        //Arrange Statement(s)
        Fiat target = spy(Fiat.valueOf("currencyCode1", 0L));
        doReturn(1).when(target).compareTo(fiatMock);
        //Act Statement(s)
        boolean result = target.isGreaterThan(fiatMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(target).compareTo(fiatMock);
    }

    //Sapient generated method id: ${67fdcbb3-5647-397b-99af-2c502bea1599}, hash: 1E677A36521A570724F959F04558BA5C
    @Test()
    public void isGreaterThanWhenCompareToOtherNotGreaterThan0() {
        /* Branches:
         * (compareTo(other) > 0) : false
         */
        //Arrange Statement(s)
        Fiat target = spy(Fiat.valueOf("currencyCode1", 0L));
        doReturn(-1).when(target).compareTo(fiatMock);
        //Act Statement(s)
        boolean result = target.isGreaterThan(fiatMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(target).compareTo(fiatMock);
    }

    //Sapient generated method id: ${05d8619d-83ea-3101-bbc9-a1b8b0e4bc9c}, hash: ABE508DF95ECC4632EE57E7FD9B18C56
    @Test()
    public void isLessThanWhenCompareToOtherLessThan0() {
        /* Branches:
         * (compareTo(other) < 0) : true
         */
        //Arrange Statement(s)
        Fiat target = spy(Fiat.valueOf("currencyCode1", 0L));
        doReturn(-2147483648).when(target).compareTo(fiatMock);
        //Act Statement(s)
        boolean result = target.isLessThan(fiatMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(target).compareTo(fiatMock);
    }

    //Sapient generated method id: ${a3974211-4cb8-31ae-8d6e-e9b4f50f1614}, hash: E0CBB22C7FF00846FC5F000CF2AFD11E
    @Test()
    public void isLessThanWhenCompareToOtherNotLessThan0() {
        /* Branches:
         * (compareTo(other) < 0) : false
         */
        //Arrange Statement(s)
        Fiat target = spy(Fiat.valueOf("currencyCode1", 0L));
        doReturn(1).when(target).compareTo(fiatMock);
        //Act Statement(s)
        boolean result = target.isLessThan(fiatMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(target).compareTo(fiatMock);
    }

    //Sapient generated method id: ${487b5517-c901-34c8-972a-ebb7ca0fcd0b}, hash: DB8045F692150F616CB7527E662B5409
    @Test()
    public void signumWhenThisValueEquals0() {
        /* Branches:
         * (this.value == 0) : true
         */
        //Arrange Statement(s)
        Fiat target = Fiat.valueOf("currencyCode1", 0L);
        //Act Statement(s)
        int result = target.signum();
        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${5086e45c-5b83-3bd7-a18e-76f231fc5456}, hash: 11B6958E5C4530FD5107841C692793C4
    @Test()
    public void signumWhenThisValueLessThan0() {
        /* Branches:
         * (this.value == 0) : false
         * (this.value < 0) : true
         */
        //Arrange Statement(s)
        Fiat target = Fiat.valueOf("currencyCode1", -1L);
        //Act Statement(s)
        int result = target.signum();
        //Assert statement(s)
        assertThat(result, equalTo(-1));
    }

    //Sapient generated method id: ${62ad04f5-6d83-37e5-91d2-3a3293eae054}, hash: 37532C972AF969314ACBAEAF759DAB59
    @Test()
    public void signumWhenThisValueNotLessThan0() {
        /* Branches:
         * (this.value == 0) : false
         * (this.value < 0) : false
         */
        //Arrange Statement(s)
        Fiat target = Fiat.valueOf("currencyCode1", 1L);
        //Act Statement(s)
        int result = target.signum();
        //Assert statement(s)
        assertThat(result, equalTo(1));
    }

    //Sapient generated method id: ${00610e8a-308a-3060-9272-e6226990d3e8}, hash: 06E0FF9CAAC09731E92A08B6F591D6CA
    @Test()
    public void negateTest() {
        //Arrange Statement(s)
        Fiat target = Fiat.valueOf("currencyCode1", 1L);
        //Act Statement(s)
        Fiat result = target.negate();
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${9023386b-0a58-3cc3-912f-1a61aadf88ac}, hash: 9B54D7481A6B5F2BE65E27475662B50D
    @Test()
    public void longValueTest() {
        //Arrange Statement(s)
        Fiat target = Fiat.valueOf("currencyCode1", 0L);
        //Act Statement(s)
        long result = target.longValue();
        //Assert statement(s)
        assertThat(result, equalTo(0L));
    }

    //Sapient generated method id: ${f6218ce4-99b5-3766-9111-6c631ded6b5a}, hash: 02531A445F54CFF7002AA8CA4290F06A
    @Ignore()
    @Test()
    public void toFriendlyStringTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type MonetaryFormat, object of type CharSequence
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Fiat target = Fiat.valueOf("A", 0L);
        //Act Statement(s)
        String result = target.toFriendlyString();
        //Assert statement(s)
        assertThat(result, equalTo("result1"));
    }

    //Sapient generated method id: ${cfd14524-d2de-392f-ab18-9c1817ef92cc}, hash: 976D60E46C8BBE644EAE43E27FBED3F7
    @Ignore()
    @Test()
    public void toPlainStringTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type CharSequence
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Fiat target = Fiat.valueOf("currencyCode1", 0L);
        //Act Statement(s)
        String result = target.toPlainString();
        //Assert statement(s)
        assertThat(result, equalTo("result1"));
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: 0ED7B6B23A38B4F68FD5518FE40E5626
    @Test()
    public void toStringTest() {
        //Arrange Statement(s)
        Fiat target = Fiat.valueOf("currencyCode1", 2L);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("2"));
    }

    //Sapient generated method id: ${103eceb2-7695-3e7a-89fd-310a3f8e25f4}, hash: DB18FA28CAB4FAFB4C56CBD526172D14
    @Test()
    public void compareToWhenThisCurrencyCodeNotEqualsOtherCurrencyCode() {
        /* Branches:
         * (!this.currencyCode.equals(other.currencyCode)) : true
         */
        //Arrange Statement(s)
        Fiat target = Fiat.valueOf("A", 0L);
        Fiat fiat = Fiat.valueOf("B", 0L);
        //Act Statement(s)
        int result = target.compareTo(fiat);
        //Assert statement(s)
        assertThat(result, equalTo(-1));
    }

    //Sapient generated method id: ${0a89820b-44b9-376b-b893-a0b3267b42f2}, hash: 4A99C9FFF4FB15E509303E909735F5C6
    @Test()
    public void compareToWhenThisCurrencyCodeEqualsOtherCurrencyCode() {
        /* Branches:
         * (!this.currencyCode.equals(other.currencyCode)) : false
         */
        //Arrange Statement(s)
        Fiat target = Fiat.valueOf("A", 1L);
        Fiat fiat = Fiat.valueOf("A", 1L);
        //Act Statement(s)
        int result = target.compareTo(fiat);
        //Assert statement(s)
        assertThat(result, equalTo(0));
    }
}
