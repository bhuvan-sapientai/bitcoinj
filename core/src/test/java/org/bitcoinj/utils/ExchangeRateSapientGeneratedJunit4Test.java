package org.bitcoinj.utils;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.stubbing.Answer;
import org.bitcoinj.base.Coin;

import java.util.function.Supplier;

import org.mockito.MockedStatic;
import org.bitcoinj.base.internal.Preconditions;
import org.bitcoinj.base.utils.Fiat;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

public class ExchangeRateSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Coin coinMock = mock(Coin.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${04691d75-9585-35b0-899a-e9a92fea1c4c}
    @Test()
    public void coinToFiatWhenConvertedCompareToBigIntegerValueOfLongMIN_VALUELessThan0ThrowsArithmeticException() {
        /* Branches:
         * (converted.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0) : false
         * (converted.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) < 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin coinMock2 = mock(Coin.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(coinMock).isPositive();
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Fiat fiat = Fiat.valueOf("USD", 500L);
            ExchangeRate target = new ExchangeRate(coinMock, fiat);
            ArithmeticException arithmeticException = new ArithmeticException("Overflow");
            thrown.expect(ArithmeticException.class);
            thrown.expectMessage(arithmeticException.getMessage());
            //Act Statement(s)
            target.coinToFiat(coinMock2);
            //Assert statement(s)
            verify(coinMock).isPositive();
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${59ac1028-8ae4-3a1b-83b5-4831ab9452c9}
    @Test()
    public void coinToFiatWhenConvertedCompareToBigIntegerValueOfLongMIN_VALUENotLessThan0() {
        /* Branches:
         * (converted.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0) : false
         * (converted.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) < 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Fiat> fiat = mockStatic(Fiat.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Fiat fiat2 = Fiat.valueOf("currencyCode1", 0L);
            fiat.when(() -> Fiat.valueOf("currencyCode1", 1L)).thenReturn(fiat2);
            Coin coin = Coin.valueOf(0L);
            Fiat fiat3 = Fiat.valueOf("USD", 1000L);
            ExchangeRate target = new ExchangeRate(coin, fiat3);
            //Act Statement(s)
            Fiat result = target.coinToFiat(coinMock);
            //Assert statement(s)
            assertThat(result, equalTo(fiat2));
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            fiat.verify(() -> Fiat.valueOf("currencyCode1", 1L), atLeast(1));
        }
    }

    //Sapient generated method id: ${22f98e93-4e38-36f4-a6f1-5b10ca6e1d70}
    @Test()
    public void fiatToCoinWhenConvertedCompareToBigIntegerValueOfLongMIN_VALUELessThan0ThrowsArithmeticException() {
        /* Branches:
         * (converted.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0) : false
         * (converted.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) < 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(coinMock).isPositive();
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Fiat fiat = Fiat.valueOf("USD", 1000000000L);
            ExchangeRate target = new ExchangeRate(coinMock, fiat);
            ArithmeticException arithmeticException = new ArithmeticException("Overflow");
            thrown.expect(ArithmeticException.class);
            thrown.expectMessage(arithmeticException.getMessage());
            Fiat fiat2 = Fiat.valueOf("USD", 100L);
            //Act Statement(s)
            target.fiatToCoin(fiat2);
            //Assert statement(s)
            verify(coinMock).isPositive();
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(2));
        }
    }

    //Sapient generated method id: ${8dd092b2-aba2-323a-a09c-62efd5aa7709}
    @Test()
    public void fiatToCoinWhenConvertedCompareToBigIntegerValueOfLongMIN_VALUENotLessThan0() {
        /* Branches:
         * (converted.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0) : false
         * (converted.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) < 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Coin> coin = mockStatic(Coin.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(coinMock).isPositive();
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Coin coin2 = Coin.valueOf(0L);
            coin.when(() -> Coin.valueOf(0L)).thenReturn(coin2);
            Fiat fiat = Fiat.valueOf("USD", 20L);
            ExchangeRate target = new ExchangeRate(coinMock, fiat);
            Fiat fiat2 = Fiat.valueOf("USD", 100L);
            //Act Statement(s)
            Coin result = target.fiatToCoin(fiat2);
            //Assert statement(s)
            assertThat(result, equalTo(coin2));
            verify(coinMock).isPositive();
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(2));
            coin.verify(() -> Coin.valueOf(0L), atLeast(1));
        }
    }

    //Sapient generated method id: ${84ea7b22-74b9-3c90-98df-f4027aad1772}
    @Test()
    public void fiatToCoinWhenCaughtIllegalArgumentExceptionThrowsArithmeticException() {
        /* Branches:
         * (converted.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0) : false
         * (converted.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) < 0) : false
         * (catch-exception (IllegalArgumentException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Coin> coin = mockStatic(Coin.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(coinMock).isPositive();
            preconditions.when(() -> Preconditions.checkArgument(false)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(true)).thenAnswer((Answer<Void>) invocation -> null);
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Coin coin2 = Coin.valueOf(0L);
            coin.when(() -> Coin.valueOf(0L)).thenReturn(coin2);
            Fiat fiat = Fiat.valueOf("USD", 50L);
            ExchangeRate target = new ExchangeRate(coinMock, fiat);
            ArithmeticException arithmeticException = new ArithmeticException("Overflow: C");
            thrown.expect(ArithmeticException.class);
            thrown.expectMessage(arithmeticException.getMessage());
            Fiat fiat2 = Fiat.valueOf("USD", 100L);
            //Act Statement(s)
            target.fiatToCoin(fiat2);
            //Assert statement(s)
            verify(coinMock).isPositive();
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(true), atLeast(1));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(2));
            coin.verify(() -> Coin.valueOf(0L), atLeast(1));
        }
    }
}