package org.bitcoinj.base;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.nio.BufferUnderflowException;
import java.nio.BufferOverflowException;

import org.junit.rules.ExpectedException;
import org.mockito.MockedStatic;

import java.nio.ByteBuffer;

import org.bitcoinj.base.internal.Preconditions;

import java.math.BigDecimal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class CoinSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Coin coinMock = mock(Coin.class);

    private final Coin coinMock2 = mock(Coin.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${5ea5a577-e5ba-3b6a-a291-7463b128c1f2}, hash: 0F919465F4D9235DFF33E622F6682574
    @Test()
    public void valueOfWhenSatoshisNotEquals0() {
        /* Branches:
         * (satoshis == 0) : false
         */
        //Act Statement(s)
        Coin result = Coin.valueOf(-1L);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${db344e3b-696d-3b02-8e35-1aaa5300bde6}, hash: EAD0BBDD48BA63E7FE6F471CCFDF9DE0
    @Test()
    public void readTest() throws BufferUnderflowException {
        //Arrange Statement(s)
        try (MockedStatic<Coin> coin = mockStatic(Coin.class, CALLS_REAL_METHODS)) {
            coin.when(() -> Coin.valueOf(0L)).thenReturn(coinMock);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            Coin result = Coin.read(byteBuffer);
            //Assert statement(s)
            assertThat(result, equalTo(coinMock));
            coin.verify(() -> Coin.valueOf(0L), atLeast(1));
        }
    }

    //Sapient generated method id: ${289b9396-36ac-3ecc-a969-f108cfcc8920}, hash: 3D0E4AB511CA727D5B6DB312CA4D6EC5
    @Test()
    public void smallestUnitExponentTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: COIN
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin target = Coin.valueOf(0, 0);
        //Act Statement(s)
        int result = target.smallestUnitExponent();
        //Assert statement(s)
        assertThat(result, equalTo(8));
    }

    //Sapient generated method id: ${0aca1339-091d-38fe-bfd3-e38f02ae9632}, hash: 19A7B4143E9A614A3E89B4B00149A650
    @Test()
    public void valueOf1WhenCentsNotLessThan100ThrowsIllegalArgumentException() {
        /* Branches:
         * (cents < 100) : false
         */
        //Arrange Statement(s)
        thrown.expect(IllegalArgumentException.class);
        //Act Statement(s)
        Coin.valueOf(0, 100);
    }

    //Sapient generated method id: ${553f616d-071c-379d-9a29-cdbf5b6deb0c}, hash: B53CD3AA12E7FA3F96523E91D0EFFAF9
    @Test()
    public void valueOf1WhenCentsLessThan0ThrowsIllegalArgumentException() {
        /* Branches:
         * (cents < 100) : true
         * (cents >= 0) : false
         */
        //Arrange Statement(s)
        thrown.expect(IllegalArgumentException.class);
        //Act Statement(s)
        Coin.valueOf(0, -1);
    }

    //Sapient generated method id: ${62b8f85a-55b2-31df-bcfb-4f1a4e686de5}, hash: 8F4E2BE929F8AE42B22D1DA420E6CDB8
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
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Coin result = Coin.valueOf(0, 0);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${4881a9cb-3775-37f0-8707-a4d86a4882d5}, hash: 22BEF78022524291C7841A7F391BABE3
    @Test()
    public void valueOf1WhenCoinsLessThan0ThrowsIllegalArgumentException() {
        /* Branches:
         * (cents < 100) : true
         * (cents >= 0) : true
         * (coins >= 0) : false
         */
        //Arrange Statement(s)
        thrown.expect(IllegalArgumentException.class);
        //Act Statement(s)
        Coin.valueOf(-1, 0);
    }

    //Sapient generated method id: ${269e54e0-9262-3a73-972c-c74301f44098}, hash: BF539F576A24C5E21C2575C11C5991BE
    @Test()
    public void btcToSatoshiTest() throws ArithmeticException {
        //Act Statement(s)
        long result = Coin.btcToSatoshi(new BigDecimal("1.0"));
        //Assert statement(s)
        assertThat(result, equalTo(100000000L));
    }

    //Sapient generated method id: ${cee20860-ba60-3360-81d3-3b82489d7b0d}, hash: 4793792E18570E03AF6A4F49DC543198
    @Test()
    public void satoshiToBtcTest() {
        //Act Statement(s)
        BigDecimal result = Coin.satoshiToBtc(0L);
        //Assert statement(s)
        assertThat(result.stripTrailingZeros(), equalTo(new BigDecimal("0.0").stripTrailingZeros()));
    }

    //Sapient generated method id: ${7cbc8d3a-aa7f-39b7-a15a-48dc3915045c}, hash: 5E3F74CD72820ABE779015A6FFD71396
    @Test()
    public void ofBtcTest() throws ArithmeticException {
        //Arrange Statement(s)
        try (MockedStatic<Coin> coin = mockStatic(Coin.class, CALLS_REAL_METHODS)) {
            coin.when(() -> Coin.valueOf(100000000L)).thenReturn(coinMock);
            //Act Statement(s)
            Coin result = Coin.ofBtc(new BigDecimal("1.0"));
            //Assert statement(s)
            assertThat(result, equalTo(coinMock));
            coin.verify(() -> Coin.valueOf(100000000L), atLeast(1));
        }
    }

    //Sapient generated method id: ${f28897a9-a963-34eb-8b06-8a69f38291f2}, hash: EEBF7F7DF9D959D4F7F76B8A09E900F7
    @Test()
    public void ofSatTest() {
        //Arrange Statement(s)
        try (MockedStatic<Coin> coin = mockStatic(Coin.class, CALLS_REAL_METHODS)) {
            coin.when(() -> Coin.valueOf(0L)).thenReturn(coinMock);
            //Act Statement(s)
            Coin result = Coin.ofSat(0L);
            //Assert statement(s)
            assertThat(result, equalTo(coinMock));
            coin.verify(() -> Coin.valueOf(0L), atLeast(1));
        }
    }

    //Sapient generated method id: ${4b40353b-e5c4-3978-a099-7ab0d78f7cb7}, hash: A08E3363FDFC95876A5AF46B71C9D3A5
    @Test()
    public void parseCoinTest() {
        //Arrange Statement(s)
        try (MockedStatic<Coin> coin = mockStatic(Coin.class, CALLS_REAL_METHODS)) {
            coin.when(() -> Coin.valueOf(100000000L)).thenReturn(coinMock);
            //Act Statement(s)
            Coin result = Coin.parseCoin("1.0");
            //Assert statement(s)
            assertThat(result, equalTo(coinMock));
            coin.verify(() -> Coin.valueOf(100000000L), atLeast(1));
        }
    }

    //Sapient generated method id: ${9ae0c0c7-4a60-3c79-b600-b4b95f04c023}, hash: 480C4679006C69F7954942911794DAA3
    @Test()
    public void parseCoinWhenCaughtArithmeticExceptionThrowsIllegalArgumentException() {
        /* Branches:
         * (catch-exception (ArithmeticException)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Coin> coin = mockStatic(Coin.class, CALLS_REAL_METHODS)) {
            ArithmeticException arithmeticException = new ArithmeticException();
            coin.when(() -> Coin.valueOf(100000000L)).thenThrow(arithmeticException);
            thrown.expect(IllegalArgumentException.class);
            thrown.expectCause(is(instanceOf(ArithmeticException.class)));
            //Act Statement(s)
            Coin.parseCoin("1.0");
            //Assert statement(s)
            coin.verify(() -> Coin.valueOf(100000000L), atLeast(1));
        }
    }

    //Sapient generated method id: ${08043c8d-384a-393c-8111-ca9fd0ac79ed}, hash: 4A16621CE6466C8F63DD1FEB25F0CAC1
    @Test()
    public void parseCoinInexactTest() {
        //Arrange Statement(s)
        try (MockedStatic<Coin> coin = mockStatic(Coin.class, CALLS_REAL_METHODS)) {
            coin.when(() -> Coin.valueOf(0L)).thenReturn(coinMock);
            //Act Statement(s)
            Coin result = Coin.parseCoinInexact("0.0");
            //Assert statement(s)
            assertThat(result, equalTo(coinMock));
            coin.verify(() -> Coin.valueOf(0L), atLeast(1));
        }
    }

    //Sapient generated method id: ${c68f05aa-dfd6-30e8-814c-d8744df894dc}, hash: F47D9B9E1B696BE611433981E6E0A9A6
    @Test()
    public void parseCoinInexactWhenCaughtArithmeticExceptionThrowsIllegalArgumentException() {
        /* Branches:
         * (catch-exception (ArithmeticException)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Coin> coin = mockStatic(Coin.class, CALLS_REAL_METHODS)) {
            ArithmeticException arithmeticException = new ArithmeticException();
            coin.when(() -> Coin.valueOf(0L)).thenThrow(arithmeticException);
            thrown.expect(IllegalArgumentException.class);
            thrown.expectCause(is(instanceOf(ArithmeticException.class)));
            //Act Statement(s)
            Coin.parseCoinInexact("0.0");
            //Assert statement(s)
            coin.verify(() -> Coin.valueOf(0L), atLeast(1));
        }
    }

    //Sapient generated method id: ${2f52d914-224e-3cf8-a2e5-c61089a0f6f4}, hash: F4AF75C6331649B48F7DE2FEE4A30D3A
    @Ignore()
    @Test()
    public void addTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: COIN
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Coin> coin = mockStatic(Coin.class)) {
            coin.when(() -> Coin.valueOf(0L)).thenReturn(coinMock);
            Coin target = Coin.valueOf(0, 0);
            Coin coin2 = Coin.valueOf(0L);
            //Act Statement(s)
            Coin result = target.add(coin2);
            //Assert statement(s)
            assertThat(result, equalTo(coinMock));
            coin.verify(() -> Coin.valueOf(0L), atLeast(1));
        }
    }

    //Sapient generated method id: ${78050452-8b22-36c4-bfb5-cd72a1e27f14}, hash: B86983963F362ADED4AC727219CC8237
    @Test()
    public void plusTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: COIN
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin target = spy(Coin.valueOf(0, 0));
        doReturn(coinMock).when(target).add(coinMock2);
        //Act Statement(s)
        Coin result = target.plus(coinMock2);
        //Assert statement(s)
        assertThat(result, equalTo(coinMock));
        verify(target).add(coinMock2);
    }

    //Sapient generated method id: ${97b5e3b9-042a-36e9-ba00-8365659a5608}, hash: 4EA5E2CE8E21634CFE8500A112432A1C
    @Ignore()
    @Test()
    public void subtractTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: COIN
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Coin> coin = mockStatic(Coin.class)) {
            coin.when(() -> Coin.valueOf(0L)).thenReturn(coinMock);
            Coin target = Coin.valueOf(0, 0);
            Coin coin2 = Coin.valueOf(0L);
            //Act Statement(s)
            Coin result = target.subtract(coin2);
            //Assert statement(s)
            assertThat(result, equalTo(coinMock));
            coin.verify(() -> Coin.valueOf(0L), atLeast(1));
        }
    }

    //Sapient generated method id: ${3439d342-7c84-3d8b-b7db-9a114169ae0c}, hash: 83C2A08345DD16DB7699FA7D3A80C7FC
    @Test()
    public void minusTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: COIN
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin target = spy(Coin.valueOf(0, 0));
        doReturn(coinMock).when(target).subtract(coinMock2);
        //Act Statement(s)
        Coin result = target.minus(coinMock2);
        //Assert statement(s)
        assertThat(result, equalTo(coinMock));
        verify(target).subtract(coinMock2);
    }

    //Sapient generated method id: ${f2e2be9f-c5d7-3010-98aa-6831b8f18beb}, hash: D667672239537F3EAE99FD5CEDD8151C
    @Ignore()
    @Test()
    public void multiplyTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: COIN
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Coin> coin = mockStatic(Coin.class)) {
            coin.when(() -> Coin.valueOf(0L)).thenReturn(coinMock);
            Coin target = Coin.valueOf(0, 0);
            //Act Statement(s)
            Coin result = target.multiply(0L);
            //Assert statement(s)
            assertThat(result, equalTo(coinMock));
            coin.verify(() -> Coin.valueOf(0L), atLeast(1));
        }
    }

    //Sapient generated method id: ${159afb51-d55b-3014-ba81-f836d1e821eb}, hash: 2C390BD28E9DDB199BD8EEB1BA5E7223
    @Test()
    public void timesTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: COIN
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin target = spy(Coin.valueOf(0, 0));
        doReturn(coinMock).when(target).multiply(0L);
        //Act Statement(s)
        Coin result = target.times(0L);
        //Assert statement(s)
        assertThat(result, equalTo(coinMock));
        verify(target).multiply(0L);
    }

    //Sapient generated method id: ${4cf16d98-2adc-377a-b92a-fe197780e001}, hash: 61C74D3903C9C6D8A5C786F07D074014
    @Test()
    public void times1Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: COIN
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin target = spy(Coin.valueOf(0, 0));
        doReturn(coinMock).when(target).multiply(0L);
        //Act Statement(s)
        Coin result = target.times(0);
        //Assert statement(s)
        assertThat(result, equalTo(coinMock));
        verify(target).multiply(0L);
    }

    //Sapient generated method id: ${2a79afae-dad2-39ac-b954-5ff63850d9d4}, hash: B71754D35EB2CFCC3FA168E2DA6E2A33
    @Ignore()
    @Test()
    public void divideTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: COIN
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Coin> coin = mockStatic(Coin.class)) {
            coin.when(() -> Coin.valueOf(0L)).thenReturn(coinMock);
            Coin target = Coin.valueOf(0, 0);
            //Act Statement(s)
            Coin result = target.divide(-1L);
            //Assert statement(s)
            assertThat(result, equalTo(coinMock));
            coin.verify(() -> Coin.valueOf(0L), atLeast(1));
        }
    }

    //Sapient generated method id: ${7b1e0df4-96e8-3701-b46d-fb039371b3ee}, hash: F8475883BA2785EEB9F9CFBEF3E1AEC2
    @Test()
    public void divTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: COIN
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin target = spy(Coin.valueOf(0, 0));
        doReturn(coinMock).when(target).divide(0L);
        //Act Statement(s)
        Coin result = target.div(0L);
        //Assert statement(s)
        assertThat(result, equalTo(coinMock));
        verify(target).divide(0L);
    }

    //Sapient generated method id: ${e4368072-6833-30a1-a1e0-8443efe92454}, hash: CBC4846A6BC24F2186EF820907C517B7
    @Test()
    public void div1Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: COIN
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin target = spy(Coin.valueOf(0, 0));
        doReturn(coinMock).when(target).divide(0L);
        //Act Statement(s)
        Coin result = target.div(0);
        //Assert statement(s)
        assertThat(result, equalTo(coinMock));
        verify(target).divide(0L);
    }

    //Sapient generated method id: ${0469b3a3-7fbb-3c2c-af69-4344a07bb011}, hash: 6611E696368A07571B7485805B35C54F
    @Ignore()
    @Test()
    public void divideAndRemainderTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: COIN
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Coin> coin = mockStatic(Coin.class)) {
            coin.when(() -> Coin.valueOf(0L)).thenReturn(coinMock).thenReturn(coinMock2);
            Coin target = Coin.valueOf(0, 0);
            //Act Statement(s)
            Coin[] result = target.divideAndRemainder(-1L);
            Coin[] coinResultArray = new Coin[]{coinMock, coinMock2};
            //Assert statement(s)
            assertThat(result, equalTo(coinResultArray));
            coin.verify(() -> Coin.valueOf(0L), atLeast(2));
        }
    }

    //Sapient generated method id: ${c70236b7-98f2-3ecd-942d-6cc0d5da7e85}, hash: 0967BAB38405E4E294CC423C694D2F22
    @Ignore()
    @Test()
    public void divide1Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: COIN
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin target = Coin.valueOf(0, 0);
        Coin coin = Coin.valueOf(0L);
        //Act Statement(s)
        long result = target.divide(coin);
        //Assert statement(s)
        assertThat(result, equalTo(0L));
    }

    //Sapient generated method id: ${a5b85392-24c9-3398-b016-26328a323b02}, hash: 9BF233E712DB5D822E58BDAB4E939FF5
    @Test()
    public void isPositiveWhenSignumEquals1() {
        /* Branches:
         * (signum() == 1) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: COIN
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin target = spy(Coin.valueOf(0, 0));
        doReturn(1).when(target).signum();
        //Act Statement(s)
        boolean result = target.isPositive();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(target).signum();
    }

    //Sapient generated method id: ${7a79a994-c529-3c20-ac79-6c430e11e309}, hash: FBDE6314EE2C5CA40A96B4909266371B
    @Test()
    public void isPositiveWhenSignumNotEquals1() {
        /* Branches:
         * (signum() == 1) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: COIN
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin target = spy(Coin.valueOf(0, 0));
        doReturn(0).when(target).signum();
        //Act Statement(s)
        boolean result = target.isPositive();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(target).signum();
    }

    //Sapient generated method id: ${2ddd0ea6-c6ef-3140-9d36-3be9902ec24e}, hash: 4D5CB2FA5A12C8A6F8EB637A3B46FFF0
    @Test()
    public void isNegativeWhenSignumEqualsMinus1() {
        /* Branches:
         * (signum() == -1) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: COIN
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin target = spy(Coin.valueOf(0, 0));
        doReturn(-1).when(target).signum();
        //Act Statement(s)
        boolean result = target.isNegative();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(target).signum();
    }

    //Sapient generated method id: ${62743f7a-453a-38f7-896d-d35950a48d87}, hash: DDE07E803790AE3B1E6093CBCE02E171
    @Test()
    public void isNegativeWhenSignumNotEqualsMinus1() {
        /* Branches:
         * (signum() == -1) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: COIN
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin target = spy(Coin.valueOf(0, 0));
        doReturn(-2).when(target).signum();
        //Act Statement(s)
        boolean result = target.isNegative();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(target).signum();
    }

    //Sapient generated method id: ${4b1595e5-98c7-36a0-861b-1053e7e18765}, hash: 6D249DE8379D599A2B2451A460D7BE83
    @Test()
    public void isZeroWhenSignumEquals0() {
        /* Branches:
         * (signum() == 0) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: COIN
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin target = spy(Coin.valueOf(0, 0));
        doReturn(0).when(target).signum();
        //Act Statement(s)
        boolean result = target.isZero();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(target).signum();
    }

    //Sapient generated method id: ${700203bf-6954-3416-be8d-2f53edd277f8}, hash: 1F2FE549E28C82F05B4D4DE977547557
    @Test()
    public void isZeroWhenSignumNotEquals0() {
        /* Branches:
         * (signum() == 0) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: COIN
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin target = spy(Coin.valueOf(0, 0));
        doReturn(-1).when(target).signum();
        //Act Statement(s)
        boolean result = target.isZero();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(target).signum();
    }

    //Sapient generated method id: ${67fdcbb3-5647-397b-99af-2c502bea1599}, hash: C05C57709A1E10E45B68021940D51ADC
    @Test()
    public void isGreaterThanWhenCompareToOtherNotGreaterThan0() {
        /* Branches:
         * (compareTo(other) > 0) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: COIN
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin target = Coin.valueOf(0, 0);
        Coin coin = Coin.valueOf(0L);
        //Act Statement(s)
        boolean result = target.isGreaterThan(coin);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${a3974211-4cb8-31ae-8d6e-e9b4f50f1614}, hash: 8982D5C8475BEC5EDF6158A3DF0AB7EB
    @Test()
    public void isLessThanWhenCompareToOtherNotLessThan0() {
        /* Branches:
         * (compareTo(other) < 0) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: COIN
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin target = Coin.valueOf(0, 0);
        Coin coin = Coin.valueOf(0L);
        //Act Statement(s)
        boolean result = target.isLessThan(coin);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${55d82805-4add-3298-af96-848731e9eab5}, hash: 1FAF1FB0B26653876796F97728E94136
    @Ignore()
    @Test()
    public void shiftLeftTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: COIN
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Coin> coin = mockStatic(Coin.class)) {
            coin.when(() -> Coin.valueOf(0L)).thenReturn(coinMock);
            Coin target = Coin.valueOf(0, 0);
            //Act Statement(s)
            Coin result = target.shiftLeft(0);
            //Assert statement(s)
            assertThat(result, equalTo(coinMock));
            coin.verify(() -> Coin.valueOf(0L), atLeast(1));
        }
    }

    //Sapient generated method id: ${140cd397-c5b1-3523-9110-7d072c525ae7}, hash: FD47CA281CDDA70D4D5C0CE2B104FBD6
    @Ignore()
    @Test()
    public void shiftRightTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: COIN
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Coin> coin = mockStatic(Coin.class)) {
            coin.when(() -> Coin.valueOf(0L)).thenReturn(coinMock);
            Coin target = Coin.valueOf(0, 0);
            //Act Statement(s)
            Coin result = target.shiftRight(0);
            //Assert statement(s)
            assertThat(result, equalTo(coinMock));
            coin.verify(() -> Coin.valueOf(0L), atLeast(1));
        }
    }

    //Sapient generated method id: ${487b5517-c901-34c8-972a-ebb7ca0fcd0b}, hash: CEA30B7EF4333ADE41E3367FA687208E
    @Test()
    public void signumWhenThisValueEquals0() {
        /* Branches:
         * (this.value == 0) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: COIN
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin target = Coin.valueOf(0, 0);
        //Act Statement(s)
        int result = target.signum();
        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${00610e8a-308a-3060-9272-e6226990d3e8}, hash: 1349496450D81BD89AC2DEDAB6E5DE54
    @Ignore()
    @Test()
    public void negateTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: COIN
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Coin> coin = mockStatic(Coin.class)) {
            coin.when(() -> Coin.valueOf(0L)).thenReturn(coinMock);
            Coin target = Coin.valueOf(0, 0);
            //Act Statement(s)
            Coin result = target.negate();
            //Assert statement(s)
            assertThat(result, equalTo(coinMock));
            coin.verify(() -> Coin.valueOf(0L), atLeast(1));
        }
    }

    //Sapient generated method id: ${9023386b-0a58-3cc3-912f-1a61aadf88ac}, hash: 20712E63A60B90275E7D7101427D20B8
    @Test()
    public void longValueTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: COIN
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin target = Coin.valueOf(0, 0);
        //Act Statement(s)
        long result = target.longValue();
        //Assert statement(s)
        assertThat(result, equalTo(0L));
    }

    //Sapient generated method id: ${f770eee8-261b-3e4b-92e4-0511ddd7e614}, hash: 760CFB6DE359C3DD2674F1FA7AEC4CC5
    @Test()
    public void toSatTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: COIN
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin target = Coin.valueOf(0, 0);
        //Act Statement(s)
        long result = target.toSat();
        //Assert statement(s)
        assertThat(result, equalTo(0L));
    }

    //Sapient generated method id: ${cf4cdd36-c38f-3416-9f14-c201fc6efeec}, hash: DE867E1D0F31D09FFA4B0B736A63D7DB
    @Ignore()
    @Test()
    public void toBtcTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: COIN
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Coin> coin = mockStatic(Coin.class)) {
            coin.when(() -> Coin.satoshiToBtc(0L)).thenReturn(new BigDecimal("0"));
            Coin target = Coin.valueOf(0, 0);
            //Act Statement(s)
            BigDecimal result = target.toBtc();
            //Assert statement(s)
            assertThat(result.stripTrailingZeros(), equalTo(new BigDecimal("0").stripTrailingZeros()));
            coin.verify(() -> Coin.satoshiToBtc(0L), atLeast(1));
        }
    }

    //Sapient generated method id: ${74367ac6-67d1-3ba8-9bdd-4aafa43d4139}, hash: AB9397F27359FC12F61F4661B447324F
    @Ignore()
    @Test()
    public void writeTest() throws BufferOverflowException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: COIN
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin target = Coin.valueOf(0, 0);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        //Act Statement(s)
        ByteBuffer result = target.write(byteBuffer);
        ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(64);
        //Assert statement(s)
        assertThat(result, equalTo(byteBuffer2));
    }

    //Sapient generated method id: ${9d328af1-2293-3544-bbbc-a0683c1f9fbe}, hash: E9F5F273313E94FCCB4C020B1EBFE0E5
    @Test()
    public void serializeTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: COIN
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin target = Coin.valueOf(0, 0);
        //Act Statement(s)
        byte[] result = target.serialize();
        byte[] byteResultArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        //Assert statement(s)
        assertThat(result, equalTo(byteResultArray));
    }

    //Sapient generated method id: ${f6218ce4-99b5-3766-9111-6c631ded6b5a}, hash: 8F8EB690A6F37A36849DB7538B8BD8B4
    @Ignore()
    @Test()
    public void toFriendlyStringTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type CharSequence, COIN
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin target = Coin.valueOf(0, 0);
        //Act Statement(s)
        String result = target.toFriendlyString();
        //Assert statement(s)
        assertThat(result, equalTo("result1"));
    }

    //Sapient generated method id: ${cfd14524-d2de-392f-ab18-9c1817ef92cc}, hash: 64D33A9AD2A2BADE60EA77CF5CD168F4
    @Ignore()
    @Test()
    public void toPlainStringTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type CharSequence, COIN
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin target = Coin.valueOf(0, 0);
        //Act Statement(s)
        String result = target.toPlainString();
        //Assert statement(s)
        assertThat(result, equalTo("result1"));
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: 38A61C209BE6F9FFE2996557D07781DD
    @Test()
    public void toStringTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: COIN
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin target = Coin.valueOf(0, 0);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("0"));
    }

    //Sapient generated method id: ${af5f6332-26a2-3749-8f9a-ac87ce6fe7cf}, hash: EE5C51399A4169659356B0014B30C186
    @Test()
    public void compareToTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: COIN
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Coin target = Coin.valueOf(0, 0);
        Coin coin = Coin.valueOf(0L);
        //Act Statement(s)
        int result = target.compareTo(coin);
        //Assert statement(s)
        assertThat(result, equalTo(0));
    }
}
