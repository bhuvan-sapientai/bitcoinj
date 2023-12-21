package org.bitcoinj.base;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.nio.BufferUnderflowException;
import java.nio.BufferOverflowException;

import org.junit.rules.ExpectedException;
import org.mockito.stubbing.Answer;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

import java.nio.ByteBuffer;

import org.bitcoinj.base.internal.Preconditions;

import java.math.BigDecimal;

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
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.isA;

import org.junit.Ignore;

public class CoinSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Coin CENTMock = mock(Coin.class, "CENT");

    private final Coin coinMock = mock(Coin.class);

    private final Coin coinMock2 = mock(Coin.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${5ea5a577-e5ba-3b6a-a291-7463b128c1f2}
    @Test()
    public void valueOfWhenSatoshisNotEquals0() {
        /* Branches:
         * (satoshis == 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Coin result = Coin.valueOf(-1L);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${db344e3b-696d-3b02-8e35-1aaa5300bde6}
    @Ignore()
    @Test()
    public void readTest() throws BufferUnderflowException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Coin> coin = mockStatic(Coin.class, CALLS_REAL_METHODS)) {
            Coin coin2 = Coin.valueOf(0L);
            coin.when(() -> Coin.valueOf(0L)).thenReturn(coin2);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            Coin result = Coin.read(byteBuffer);
            //Assert statement(s)
            assertThat(result, equalTo(coin2));
            coin.verify(() -> Coin.valueOf(0L), atLeast(1));
        }
    }

    //Sapient generated method id: ${289b9396-36ac-3ecc-a969-f108cfcc8920}
    @Ignore()
    @Test()
    public void smallestUnitExponentTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Coin target = Coin.valueOf(10, 100);
            Coin coin = Coin.valueOf(0L);
            doReturn(coin).when(CENTMock).multiply(100L);
            //Act Statement(s)
            int result = target.smallestUnitExponent();
            //Assert statement(s)
            assertThat(result, equalTo(8));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(3));
            verify(CENTMock).multiply(100L);
        }
    }

    //Sapient generated method id: ${62b8f85a-55b2-31df-bcfb-4f1a4e686de5}
    @Ignore()
    @Test()
    public void valueOf1WhenCoinsGreaterThanOrEqualsTo0() {
        /* Branches:
         * (cents < 100) : true
         * (cents >= 0) : true
         * (coins >= 0) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: COIN
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Coin coin = Coin.valueOf(0L);
            doReturn(coin).when(CENTMock).multiply(50L);
            //Act Statement(s)
            Coin result = Coin.valueOf(5, 50);
            Coin coin2 = Coin.valueOf(0L);
            //Assert statement(s)
            assertThat(result, equalTo(coin2));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(3));
            verify(CENTMock).multiply(50L);
        }
    }

    //Sapient generated method id: ${7c0c6568-97a9-3d25-9c1f-67e150510bba}
    @Ignore()
    @Test()
    public void valueOf1WhenCentsLessThan0AndCoinsLessThan0() {
        /* Branches:
         * (cents < 100) : true
         * (cents >= 0) : false
         * (coins >= 0) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: COIN
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Coin coin = Coin.valueOf(0L);
            doReturn(coin).when(CENTMock).multiply(50L);
            //Act Statement(s)
            Coin result = Coin.valueOf(5, 50);
            Coin coin2 = Coin.valueOf(0L);
            //Assert statement(s)
            assertThat(result, equalTo(coin2));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(3));
            verify(CENTMock).multiply(50L);
        }
    }

    //Sapient generated method id: ${179c3f36-b7bd-3f8e-b64e-188224572b53}
    @Ignore()
    @Test()
    public void valueOf1WhenCentsGreaterThanOrEqualsTo0AndCoinsGreaterThanOrEqualsTo0() {
        /* Branches:
         * (cents < 100) : false
         * (cents >= 0) : true
         * (coins >= 0) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: COIN
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Coin coin = Coin.valueOf(0L);
            doReturn(coin).when(CENTMock).multiply(50L);
            //Act Statement(s)
            Coin result = Coin.valueOf(5, 50);
            Coin coin2 = Coin.valueOf(0L);
            //Assert statement(s)
            assertThat(result, equalTo(coin2));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(3));
            verify(CENTMock).multiply(50L);
        }
    }

    //Sapient generated method id: ${269e54e0-9262-3a73-972c-c74301f44098}
    @Test()
    public void btcToSatoshiTest() throws ArithmeticException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        long result = Coin.btcToSatoshi(new BigDecimal("1.0E-8"));
        //Assert statement(s)
        assertThat(result, equalTo(1L));
    }

    //Sapient generated method id: ${cee20860-ba60-3360-81d3-3b82489d7b0d}
    @Ignore()
    @Test()
    public void satoshiToBtcTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        BigDecimal result = Coin.satoshiToBtc(1000000000L);
        //Assert statement(s)
        assertThat(result.stripTrailingZeros(), equalTo(new BigDecimal("0").stripTrailingZeros()));
    }

    //Sapient generated method id: ${7cbc8d3a-aa7f-39b7-a15a-48dc3915045c}
    @Test()
    public void ofBtcTest() throws ArithmeticException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Coin> coin = mockStatic(Coin.class, CALLS_REAL_METHODS)) {
            Coin coin2 = Coin.valueOf(0L);
            coin.when(() -> Coin.valueOf(15000000000000000L)).thenReturn(coin2);
            //Act Statement(s)
            Coin result = Coin.ofBtc(new BigDecimal("150000000"));
            //Assert statement(s)
            assertThat(result, equalTo(coin2));
            coin.verify(() -> Coin.valueOf(15000000000000000L), atLeast(1));
        }
    }

    //Sapient generated method id: ${f28897a9-a963-34eb-8b06-8a69f38291f2}
    @Test()
    public void ofSatTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Coin> coin = mockStatic(Coin.class, CALLS_REAL_METHODS)) {
            Coin coin2 = Coin.valueOf(0L);
            coin.when(() -> Coin.valueOf(1000L)).thenReturn(coin2);
            //Act Statement(s)
            Coin result = Coin.ofSat(1000L);
            //Assert statement(s)
            assertThat(result, equalTo(coin2));
            coin.verify(() -> Coin.valueOf(1000L), atLeast(1));
        }
    }

    //Sapient generated method id: ${4b40353b-e5c4-3978-a099-7ab0d78f7cb7}
    @Ignore()
    @Test()
    public void parseCoinTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Coin> coin = mockStatic(Coin.class, CALLS_REAL_METHODS)) {
            Coin coin2 = Coin.valueOf(0L);
            coin.when(() -> Coin.valueOf(0L)).thenReturn(coin2);
            //Act Statement(s)
            Coin result = Coin.parseCoin("0.001");
            //Assert statement(s)
            assertThat(result, equalTo(coin2));
            coin.verify(() -> Coin.valueOf(0L), atLeast(1));
        }
    }

    //Sapient generated method id: ${9ae0c0c7-4a60-3c79-b600-b4b95f04c023}
    @Ignore()
    @Test()
    public void parseCoinWhenCaughtArithmeticExceptionThrowsIllegalArgumentException() {
        /* Branches:
         * (catch-exception (ArithmeticException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Coin> coin = mockStatic(Coin.class, CALLS_REAL_METHODS)) {
            Coin coin2 = Coin.valueOf(0L);
            coin.when(() -> Coin.valueOf(0L)).thenReturn(coin2);
            thrown.expect(IllegalArgumentException.class);
            thrown.expectCause(isA(Coin.class));
            //Act Statement(s)
            Coin.parseCoin("0.01");
            //Assert statement(s)
            coin.verify(() -> Coin.valueOf(0L), atLeast(1));
        }
    }

    //Sapient generated method id: ${08043c8d-384a-393c-8111-ca9fd0ac79ed}
    @Ignore()
    @Test()
    public void parseCoinInexactTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Coin> coin = mockStatic(Coin.class, CALLS_REAL_METHODS)) {
            Coin coin2 = Coin.valueOf(0L);
            coin.when(() -> Coin.valueOf(0L)).thenReturn(coin2);
            //Act Statement(s)
            Coin result = Coin.parseCoinInexact("0.00000001");
            //Assert statement(s)
            assertThat(result, equalTo(coin2));
            coin.verify(() -> Coin.valueOf(0L), atLeast(1));
        }
    }

    //Sapient generated method id: ${c68f05aa-dfd6-30e8-814c-d8744df894dc}
    @Ignore()
    @Test()
    public void parseCoinInexactWhenCaughtArithmeticExceptionThrowsIllegalArgumentException() {
        /* Branches:
         * (catch-exception (ArithmeticException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Coin> coin = mockStatic(Coin.class, CALLS_REAL_METHODS)) {
            Coin coin2 = Coin.valueOf(0L);
            coin.when(() -> Coin.valueOf(0L)).thenReturn(coin2);
            thrown.expect(IllegalArgumentException.class);
            thrown.expectCause(isA(Coin.class));
            //Act Statement(s)
            Coin.parseCoinInexact("0.12345678");
            //Assert statement(s)
            coin.verify(() -> Coin.valueOf(0L), atLeast(1));
        }
    }

    //Sapient generated method id: ${2f52d914-224e-3cf8-a2e5-c61089a0f6f4}
    @Ignore()
    @Test()
    public void addTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Coin> coin = mockStatic(Coin.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Coin coin2 = Coin.valueOf(0L);
            coin.when(() -> Coin.valueOf(1L)).thenReturn(coin2);
            Coin target = Coin.valueOf(0, 15);
            Coin coin3 = Coin.valueOf(0L);
            doReturn(coin3).when(CENTMock).multiply(15L);
            //Act Statement(s)
            Coin result = target.add(coinMock);
            //Assert statement(s)
            assertThat(result, equalTo(coin2));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(3));
            coin.verify(() -> Coin.valueOf(1L), atLeast(1));
            verify(CENTMock).multiply(15L);
        }
    }

    //Sapient generated method id: ${78050452-8b22-36c4-bfb5-cd72a1e27f14}
    @Ignore()
    @Test()
    public void plusTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Coin target = spy(Coin.valueOf(0, 0));
            doReturn(coinMock).when(CENTMock).multiply(0L);
            doReturn(coinMock2).when(target).add((Coin) any());
            Coin coin = Coin.valueOf(0L);
            //Act Statement(s)
            Coin result = target.plus(coin);
            //Assert statement(s)
            assertThat(result, equalTo(coinMock2));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(3));
            verify(CENTMock).multiply(0L);
            verify(target).add((Coin) any());
        }
    }

    //Sapient generated method id: ${97b5e3b9-042a-36e9-ba00-8365659a5608}
    @Ignore()
    @Test()
    public void subtractTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Coin> coin = mockStatic(Coin.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            coin.when(() -> Coin.valueOf(0L)).thenReturn(coinMock);
            Coin target = Coin.valueOf(0, 0);
            doReturn(coinMock2).when(CENTMock).multiply(0L);
            Coin coin2 = Coin.valueOf(0L);
            //Act Statement(s)
            Coin result = target.subtract(coin2);
            //Assert statement(s)
            assertThat(result, equalTo(coinMock));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(3));
            coin.verify(() -> Coin.valueOf(0L), atLeast(1));
            verify(CENTMock).multiply(0L);
        }
    }

    //Sapient generated method id: ${3439d342-7c84-3d8b-b7db-9a114169ae0c}
    @Ignore()
    @Test()
    public void minusTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Coin target = spy(Coin.valueOf(0, 0));
            doReturn(coinMock).when(CENTMock).multiply(0L);
            doReturn(coinMock2).when(target).subtract((Coin) any());
            Coin coin = Coin.valueOf(0L);
            //Act Statement(s)
            Coin result = target.minus(coin);
            //Assert statement(s)
            assertThat(result, equalTo(coinMock2));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(3));
            verify(CENTMock).multiply(0L);
            verify(target).subtract((Coin) any());
        }
    }

    //Sapient generated method id: ${f2e2be9f-c5d7-3010-98aa-6831b8f18beb}
    @Ignore()
    @Test()
    public void multiplyTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Coin> coin = mockStatic(Coin.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Coin coin2 = Coin.valueOf(0L);
            coin.when(() -> Coin.valueOf(0L)).thenReturn(coin2);
            Coin target = Coin.valueOf(10, 50);
            Coin coin3 = Coin.valueOf(0L);
            doReturn(coin3).when(CENTMock).multiply(50L);
            //Act Statement(s)
            Coin result = target.multiply(2L);
            //Assert statement(s)
            assertThat(result, equalTo(coin2));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(3));
            coin.verify(() -> Coin.valueOf(0L), atLeast(1));
            verify(CENTMock).multiply(50L);
        }
    }

    //Sapient generated method id: ${159afb51-d55b-3014-ba81-f836d1e821eb}
    @Ignore()
    @Test()
    public void timesTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Coin target = spy(Coin.valueOf(10, 50));
            Coin coin = Coin.valueOf(0L);
            doReturn(coin).when(CENTMock).multiply(50L);
            doReturn(coinMock).when(target).multiply(2L);
            //Act Statement(s)
            Coin result = target.times(2L);
            //Assert statement(s)
            assertThat(result, equalTo(coinMock));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(3));
            verify(CENTMock).multiply(50L);
            verify(target).multiply(2L);
        }
    }

    //Sapient generated method id: ${4cf16d98-2adc-377a-b92a-fe197780e001}
    @Ignore()
    @Test()
    public void times1Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Coin target = spy(Coin.valueOf(10, 50));
            Coin coin = Coin.valueOf(0L);
            doReturn(coin).when(CENTMock).multiply(50L);
            doReturn(coinMock).when(target).multiply(2L);
            //Act Statement(s)
            Coin result = target.times(2);
            //Assert statement(s)
            assertThat(result, equalTo(coinMock));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(3));
            verify(CENTMock).multiply(50L);
            verify(target).multiply(2L);
        }
    }

    //Sapient generated method id: ${2a79afae-dad2-39ac-b954-5ff63850d9d4}
    @Ignore()
    @Test()
    public void divideTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Coin> coin = mockStatic(Coin.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            coin.when(() -> Coin.valueOf(0L)).thenReturn(coinMock);
            Coin target = Coin.valueOf(0, 0);
            doReturn(coinMock2).when(CENTMock).multiply(0L);
            //Act Statement(s)
            Coin result = target.divide(-1L);
            //Assert statement(s)
            assertThat(result, equalTo(coinMock));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(3));
            coin.verify(() -> Coin.valueOf(0L), atLeast(1));
            verify(CENTMock).multiply(0L);
        }
    }

    //Sapient generated method id: ${7b1e0df4-96e8-3701-b46d-fb039371b3ee}
    @Ignore()
    @Test()
    public void divTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Coin target = spy(Coin.valueOf(1, 1));
            doReturn(coinMock).when(CENTMock).multiply(1L);
            doReturn(coinMock2).when(target).divide(0L);
            //Act Statement(s)
            Coin result = target.div(0L);
            //Assert statement(s)
            assertThat(result, equalTo(coinMock2));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(3));
            verify(CENTMock).multiply(1L);
            verify(target).divide(0L);
        }
    }

    //Sapient generated method id: ${e4368072-6833-30a1-a1e0-8443efe92454}
    @Ignore()
    @Test()
    public void div1Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Coin target = spy(Coin.valueOf(1, 1));
            doReturn(coinMock).when(CENTMock).multiply(1L);
            doReturn(coinMock2).when(target).divide(1L);
            //Act Statement(s)
            Coin result = target.div(1);
            //Assert statement(s)
            assertThat(result, equalTo(coinMock2));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(3));
            verify(CENTMock).multiply(1L);
            verify(target).divide(1L);
        }
    }

    //Sapient generated method id: ${0469b3a3-7fbb-3c2c-af69-4344a07bb011}
    @Ignore()
    @Test()
    public void divideAndRemainderTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Coin> coin = mockStatic(Coin.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Coin coin2 = Coin.valueOf(0L);
            coin.when(() -> Coin.valueOf(0L)).thenReturn(coinMock).thenReturn(coin2);
            Coin target = Coin.valueOf(10, 100);
            Coin coin3 = Coin.valueOf(0L);
            doReturn(coin3).when(CENTMock).multiply(100L);
            //Act Statement(s)
            Coin[] result = target.divideAndRemainder(2L);
            Coin[] coinResultArray = new Coin[]{coinMock, coin2};
            //Assert statement(s)
            assertThat(result, equalTo(coinResultArray));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(3));
            coin.verify(() -> Coin.valueOf(0L), atLeast(2));
            verify(CENTMock).multiply(100L);
        }
    }

    //Sapient generated method id: ${c70236b7-98f2-3ecd-942d-6cc0d5da7e85}
    @Ignore()
    @Test()
    public void divide1Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Coin target = Coin.valueOf(0, 0);
            doReturn(coinMock).when(CENTMock).multiply(0L);
            Coin coin = Coin.valueOf(0L);
            //Act Statement(s)
            long result = target.divide(coin);
            //Assert statement(s)
            assertThat(result, equalTo(0L));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(3));
            verify(CENTMock).multiply(0L);
        }
    }

    //Sapient generated method id: ${a5b85392-24c9-3398-b016-26328a323b02}
    @Ignore()
    @Test()
    public void isPositiveWhenSignumEquals1() {
        /* Branches:
         * (signum() == 1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Coin target = spy(Coin.valueOf(0, 0));
            Coin coin = Coin.valueOf(0L);
            doReturn(coin).when(CENTMock).multiply(0L);
            doReturn(1).when(target).signum();
            //Act Statement(s)
            boolean result = target.isPositive();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(3));
            verify(CENTMock).multiply(0L);
            verify(target).signum();
        }
    }

    //Sapient generated method id: ${7a79a994-c529-3c20-ac79-6c430e11e309}
    @Ignore()
    @Test()
    public void isPositiveWhenSignumNotEquals1() {
        /* Branches:
         * (signum() == 1) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Coin target = spy(Coin.valueOf(0, 0));
            Coin coin = Coin.valueOf(0L);
            doReturn(coin).when(CENTMock).multiply(0L);
            doReturn(2).when(target).signum();
            //Act Statement(s)
            boolean result = target.isPositive();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(3));
            verify(CENTMock).multiply(0L);
            verify(target).signum();
        }
    }

    //Sapient generated method id: ${2ddd0ea6-c6ef-3140-9d36-3be9902ec24e}
    @Ignore()
    @Test()
    public void isNegativeWhenSignumEqualsMinus1() {
        /* Branches:
         * (signum() == -1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Coin target = spy(Coin.valueOf(0, 0));
            Coin coin = Coin.valueOf(0L);
            doReturn(coin).when(CENTMock).multiply(0L);
            doReturn(-1).when(target).signum();
            //Act Statement(s)
            boolean result = target.isNegative();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(3));
            verify(CENTMock).multiply(0L);
            verify(target).signum();
        }
    }

    //Sapient generated method id: ${62743f7a-453a-38f7-896d-d35950a48d87}
    @Ignore()
    @Test()
    public void isNegativeWhenSignumNotEqualsMinus1() {
        /* Branches:
         * (signum() == -1) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Coin target = spy(Coin.valueOf(0, -1));
            Coin coin = Coin.valueOf(0L);
            doReturn(coin).when(CENTMock).multiply(-1L);
            doReturn(1).when(target).signum();
            //Act Statement(s)
            boolean result = target.isNegative();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(3));
            verify(CENTMock).multiply(-1L);
            verify(target).signum();
        }
    }

    //Sapient generated method id: ${4b1595e5-98c7-36a0-861b-1053e7e18765}
    @Ignore()
    @Test()
    public void isZeroWhenSignumEquals0() {
        /* Branches:
         * (signum() == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Coin target = spy(Coin.valueOf(0, 0));
            doReturn(coinMock).when(CENTMock).multiply(0L);
            doReturn(0).when(target).signum();
            //Act Statement(s)
            boolean result = target.isZero();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(3));
            verify(CENTMock).multiply(0L);
            verify(target).signum();
        }
    }

    //Sapient generated method id: ${700203bf-6954-3416-be8d-2f53edd277f8}
    @Ignore()
    @Test()
    public void isZeroWhenSignumNotEquals0() {
        /* Branches:
         * (signum() == 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Coin target = spy(Coin.valueOf(0, 0));
            Coin coin = Coin.valueOf(0L);
            doReturn(coin).when(CENTMock).multiply(0L);
            doReturn(1).when(target).signum();
            //Act Statement(s)
            boolean result = target.isZero();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(3));
            verify(CENTMock).multiply(0L);
            verify(target).signum();
        }
    }

    //Sapient generated method id: ${67fdcbb3-5647-397b-99af-2c502bea1599}
    @Ignore()
    @Test()
    public void isGreaterThanWhenCompareToOtherNotGreaterThan0() {
        /* Branches:
         * (compareTo(other) > 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Coin target = Coin.valueOf(0, 0);
            Coin coin = Coin.valueOf(0L);
            doReturn(coin).when(CENTMock).multiply(0L);
            Coin coin2 = Coin.valueOf(0L);
            //Act Statement(s)
            boolean result = target.isGreaterThan(coin2);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(3));
            verify(CENTMock).multiply(0L);
        }
    }

    //Sapient generated method id: ${a3974211-4cb8-31ae-8d6e-e9b4f50f1614}
    @Ignore()
    @Test()
    public void isLessThanWhenCompareToOtherNotLessThan0() {
        /* Branches:
         * (compareTo(other) < 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Coin target = Coin.valueOf(0, 0);
            Coin coin = Coin.valueOf(0L);
            doReturn(coin).when(CENTMock).multiply(0L);
            Coin coin2 = Coin.valueOf(0L);
            //Act Statement(s)
            boolean result = target.isLessThan(coin2);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(3));
            verify(CENTMock).multiply(0L);
        }
    }

    //Sapient generated method id: ${55d82805-4add-3298-af96-848731e9eab5}
    @Ignore()
    @Test()
    public void shiftLeftTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Coin> coin = mockStatic(Coin.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Coin coin2 = Coin.valueOf(0L);
            coin.when(() -> Coin.valueOf(0L)).thenReturn(coin2);
            Coin target = Coin.valueOf(10, 50);
            Coin coin3 = Coin.valueOf(0L);
            doReturn(coin3).when(CENTMock).multiply(50L);
            //Act Statement(s)
            Coin result = target.shiftLeft(2);
            //Assert statement(s)
            assertThat(result, equalTo(coin2));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(3));
            coin.verify(() -> Coin.valueOf(0L), atLeast(1));
            verify(CENTMock).multiply(50L);
        }
    }

    //Sapient generated method id: ${140cd397-c5b1-3523-9110-7d072c525ae7}
    @Ignore()
    @Test()
    public void shiftRightTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Coin> coin = mockStatic(Coin.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Coin coin2 = Coin.valueOf(0L);
            coin.when(() -> Coin.valueOf(0L)).thenReturn(coin2);
            Coin target = Coin.valueOf(10, 50);
            Coin coin3 = Coin.valueOf(0L);
            doReturn(coin3).when(CENTMock).multiply(50L);
            //Act Statement(s)
            Coin result = target.shiftRight(2);
            //Assert statement(s)
            assertThat(result, equalTo(coin2));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(3));
            coin.verify(() -> Coin.valueOf(0L), atLeast(1));
            verify(CENTMock).multiply(50L);
        }
    }

    //Sapient generated method id: ${487b5517-c901-34c8-972a-ebb7ca0fcd0b}
    @Ignore()
    @Test()
    public void signumWhenThisValueEquals0() {
        /* Branches:
         * (this.value == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Coin target = Coin.valueOf(0, 0);
            Coin coin = Coin.valueOf(0L);
            doReturn(coin).when(CENTMock).multiply(0L);
            //Act Statement(s)
            int result = target.signum();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(3));
            verify(CENTMock).multiply(0L);
        }
    }

    //Sapient generated method id: ${00610e8a-308a-3060-9272-e6226990d3e8}
    @Ignore()
    @Test()
    public void negateTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Coin> coin = mockStatic(Coin.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Coin coin2 = Coin.valueOf(0L);
            coin.when(() -> Coin.valueOf(0L)).thenReturn(coin2);
            Coin target = Coin.valueOf(0, 0);
            Coin coin3 = Coin.valueOf(0L);
            doReturn(coin3).when(CENTMock).multiply(0L);
            //Act Statement(s)
            Coin result = target.negate();
            //Assert statement(s)
            assertThat(result, equalTo(coin2));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(3));
            coin.verify(() -> Coin.valueOf(0L), atLeast(1));
            verify(CENTMock).multiply(0L);
        }
    }

    //Sapient generated method id: ${9023386b-0a58-3cc3-912f-1a61aadf88ac}
    @Ignore()
    @Test()
    public void longValueTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Coin target = Coin.valueOf(10, 50);
            Coin coin = Coin.valueOf(0L);
            doReturn(coin).when(CENTMock).multiply(50L);
            //Act Statement(s)
            long result = target.longValue();
            //Assert statement(s)
            assertThat(result, equalTo(0L));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(3));
            verify(CENTMock).multiply(50L);
        }
    }

    //Sapient generated method id: ${f770eee8-261b-3e4b-92e4-0511ddd7e614}
    @Ignore()
    @Test()
    public void toSatTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Coin target = Coin.valueOf(10, 50);
            Coin coin = Coin.valueOf(0L);
            doReturn(coin).when(CENTMock).multiply(50L);
            //Act Statement(s)
            long result = target.toSat();
            //Assert statement(s)
            assertThat(result, equalTo(0L));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(3));
            verify(CENTMock).multiply(50L);
        }
    }

    //Sapient generated method id: ${cf4cdd36-c38f-3416-9f14-c201fc6efeec}
    @Ignore()
    @Test()
    public void toBtcTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Coin> coin = mockStatic(Coin.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            coin.when(() -> Coin.satoshiToBtc(0L)).thenReturn(new BigDecimal("0"));
            Coin target = Coin.valueOf(10, 50);
            Coin coin2 = Coin.valueOf(0L);
            doReturn(coin2).when(CENTMock).multiply(50L);
            //Act Statement(s)
            BigDecimal result = target.toBtc();
            //Assert statement(s)
            assertThat(result.stripTrailingZeros(), equalTo(new BigDecimal("0").stripTrailingZeros()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(3));
            coin.verify(() -> Coin.satoshiToBtc(0L), atLeast(1));
            verify(CENTMock).multiply(50L);
        }
    }

    //Sapient generated method id: ${74367ac6-67d1-3ba8-9bdd-4aafa43d4139}
    @Ignore()
    @Test()
    public void writeTest() throws BufferOverflowException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Coin target = Coin.valueOf(0, 0);
            doReturn(coinMock).when(CENTMock).multiply(0L);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            ByteBuffer result = target.write(byteBuffer);
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
            //Assert statement(s)
            assertThat(result, equalTo(byteBuffer2));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(3));
            verify(CENTMock).multiply(0L);
        }
    }

    //Sapient generated method id: ${9d328af1-2293-3544-bbbc-a0683c1f9fbe}
    @Ignore()
    @Test()
    public void serializeTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Coin target = Coin.valueOf(10, 50);
            Coin coin = Coin.valueOf(0L);
            doReturn(coin).when(CENTMock).multiply(50L);
            //Act Statement(s)
            byte[] result = target.serialize();
            byte[] byteResultArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            //Assert statement(s)
            assertThat(result, equalTo(byteResultArray));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(3));
            verify(CENTMock).multiply(50L);
        }
    }

    //Sapient generated method id: ${f6218ce4-99b5-3766-9111-6c631ded6b5a}
    @Ignore()
    @Test()
    public void toFriendlyStringTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Coin target = Coin.valueOf(0, 0);
            Coin coin = Coin.valueOf(0L);
            doReturn(coin).when(CENTMock).multiply(0L);
            //Act Statement(s)
            String result = target.toFriendlyString();
            //Assert statement(s)
            assertThat(result, equalTo("toFriendlyString_charSequence1"));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(3));
            verify(CENTMock).multiply(0L);
        }
    }

    //Sapient generated method id: ${cfd14524-d2de-392f-ab18-9c1817ef92cc}
    @Ignore()
    @Test()
    public void toPlainStringTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Coin target = Coin.valueOf(10, 50);
            Coin coin = Coin.valueOf(0L);
            doReturn(coin).when(CENTMock).multiply(50L);
            //Act Statement(s)
            String result = target.toPlainString();
            //Assert statement(s)
            assertThat(result, equalTo("toPlainString_charSequence1"));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(3));
            verify(CENTMock).multiply(50L);
        }
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}
    @Ignore()
    @Test()
    public void toStringTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Coin target = Coin.valueOf(0, 0);
            Coin coin = Coin.valueOf(0L);
            doReturn(coin).when(CENTMock).multiply(0L);
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("0"));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(3));
            verify(CENTMock).multiply(0L);
        }
    }

    //Sapient generated method id: ${af5f6332-26a2-3749-8f9a-ac87ce6fe7cf}
    @Ignore()
    @Test()
    public void compareToTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Coin target = Coin.valueOf(0, 0);
            Coin coin = Coin.valueOf(0L);
            doReturn(coin).when(CENTMock).multiply(0L);
            Coin coin2 = Coin.valueOf(0L);
            //Act Statement(s)
            int result = target.compareTo(coin2);
            //Assert statement(s)
            assertThat(result, equalTo(0));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(3));
            verify(CENTMock).multiply(0L);
        }
    }
}
