package org.bitcoinj.utils;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.stubbing.Answer;

import java.math.BigInteger;

import org.mockito.MockedStatic;
import org.bitcoinj.base.internal.Preconditions;

import java.util.Locale;
import java.text.DecimalFormat;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

public class BtcAutoFormatSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${25558c3d-aa04-3bbe-8934-01044c4a6207}
    @Test()
    public void scaleWhenInCoinsRemainderONECompareToZEROEquals0() {
        /* Branches:
         * (inCoins.remainder(ONE).compareTo(ZERO) == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BtcFormat> btcFormat = mockStatic(BtcFormat.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkState(false)).thenAnswer((Answer<Void>) invocation -> null);
            btcFormat.when(() -> BtcFormat.prefixUnitsIndicator((DecimalFormat) any(), eq(0))).thenAnswer((Answer<Void>) invocation -> null);
            Locale locale = new Locale("language1");
            BtcAutoFormat target = new BtcAutoFormat(locale, BtcAutoFormat.Style.CODE, 0);
            //Act Statement(s)
            int result = target.scale(new BigInteger("0"), 0);
            //Assert statement(s)
            assertThat(result, equalTo(0));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            btcFormat.verify(() -> BtcFormat.prefixUnitsIndicator((DecimalFormat) any(), eq(0)), atLeast(1));
        }
    }

    //Sapient generated method id: ${0584d934-2ad4-3e0e-90b2-b3a1032e9676}
    @Test()
    public void scaleWhenInMillisRemainderONECompareToZEROEquals0() {
        /* Branches:
         * (inCoins.remainder(ONE).compareTo(ZERO) == 0) : false
         * (inMillis.remainder(ONE).compareTo(ZERO) == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BtcFormat> btcFormat = mockStatic(BtcFormat.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkState(false)).thenAnswer((Answer<Void>) invocation -> null);
            btcFormat.when(() -> BtcFormat.prefixUnitsIndicator((DecimalFormat) any(), eq(3))).thenAnswer((Answer<Void>) invocation -> null);
            Locale locale = new Locale("language1");
            BtcAutoFormat target = new BtcAutoFormat(locale, BtcAutoFormat.Style.CODE, 0);
            //Act Statement(s)
            int result = target.scale(new BigInteger("0"), 0);
            //Assert statement(s)
            assertThat(result, equalTo(3));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            btcFormat.verify(() -> BtcFormat.prefixUnitsIndicator((DecimalFormat) any(), eq(3)), atLeast(1));
        }
    }

    //Sapient generated method id: ${99afa0ac-8d38-3d5c-9f51-cdcd642225c3}
    @Test()
    public void scaleWhenInMicrosRemainderONECompareToZEROEquals0() {
        /* Branches:
         * (inCoins.remainder(ONE).compareTo(ZERO) == 0) : false
         * (inMillis.remainder(ONE).compareTo(ZERO) == 0) : false
         * (inMicros.remainder(ONE).compareTo(ZERO) == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BtcFormat> btcFormat = mockStatic(BtcFormat.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkState(false)).thenAnswer((Answer<Void>) invocation -> null);
            btcFormat.when(() -> BtcFormat.prefixUnitsIndicator((DecimalFormat) any(), eq(6))).thenAnswer((Answer<Void>) invocation -> null);
            Locale locale = new Locale("language1");
            BtcAutoFormat target = new BtcAutoFormat(locale, BtcAutoFormat.Style.CODE, 0);
            //Act Statement(s)
            int result = target.scale(new BigInteger("0"), 0);
            //Assert statement(s)
            assertThat(result, equalTo(6));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            btcFormat.verify(() -> BtcFormat.prefixUnitsIndicator((DecimalFormat) any(), eq(6)), atLeast(1));
        }
    }

    //Sapient generated method id: ${83f5728d-60ec-3807-8924-8687984b7da5}
    @Test()
    public void scaleWhenACompareToCLessThan0() {
        /* Branches:
         * (inCoins.remainder(ONE).compareTo(ZERO) == 0) : false
         * (inMillis.remainder(ONE).compareTo(ZERO) == 0) : false
         * (inMicros.remainder(ONE).compareTo(ZERO) == 0) : false
         * (a.compareTo(b) < 0) : true
         * (a.compareTo(c) < 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BtcFormat> btcFormat = mockStatic(BtcFormat.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkState(false)).thenAnswer((Answer<Void>) invocation -> null);
            DecimalFormat decimalFormat = new DecimalFormat();
            btcFormat.when(() -> BtcFormat.prefixUnitsIndicator(decimalFormat, 0)).thenAnswer((Answer<Void>) invocation -> null);
            Locale locale = new Locale("language1");
            BtcAutoFormat target = new BtcAutoFormat(locale, BtcAutoFormat.Style.CODE, 0);
            //Act Statement(s)
            int result = target.scale(new BigInteger("0"), 0);
            //Assert statement(s)
            assertThat(result, equalTo(0));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            btcFormat.verify(() -> BtcFormat.prefixUnitsIndicator(decimalFormat, 0), atLeast(1));
        }
    }

    //Sapient generated method id: ${43a84968-3632-381d-bbce-43469a39b92b}
    @Test()
    public void scaleWhenACompareToCNotLessThan0() {
        /* Branches:
         * (inCoins.remainder(ONE).compareTo(ZERO) == 0) : false
         * (inMillis.remainder(ONE).compareTo(ZERO) == 0) : false
         * (inMicros.remainder(ONE).compareTo(ZERO) == 0) : false
         * (a.compareTo(b) < 0) : true
         * (a.compareTo(c) < 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BtcFormat> btcFormat = mockStatic(BtcFormat.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkState(false)).thenAnswer((Answer<Void>) invocation -> null);
            btcFormat.when(() -> BtcFormat.prefixUnitsIndicator((DecimalFormat) any(), eq(6))).thenAnswer((Answer<Void>) invocation -> null);
            Locale locale = new Locale("language1");
            BtcAutoFormat target = new BtcAutoFormat(locale, BtcAutoFormat.Style.CODE, 0);
            //Act Statement(s)
            int result = target.scale(new BigInteger("0"), 0);
            //Assert statement(s)
            assertThat(result, equalTo(6));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            btcFormat.verify(() -> BtcFormat.prefixUnitsIndicator((DecimalFormat) any(), eq(6)), atLeast(1));
        }
    }

    //Sapient generated method id: ${957b8eb2-a667-3b5a-b03c-28ae51761b52}
    @Test()
    public void scaleWhenBCompareToCLessThan0() {
        /* Branches:
         * (inCoins.remainder(ONE).compareTo(ZERO) == 0) : false
         * (inMillis.remainder(ONE).compareTo(ZERO) == 0) : false
         * (inMicros.remainder(ONE).compareTo(ZERO) == 0) : false
         * (a.compareTo(b) < 0) : false
         * (b.compareTo(c) < 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BtcFormat> btcFormat = mockStatic(BtcFormat.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkState(false)).thenAnswer((Answer<Void>) invocation -> null);
            btcFormat.when(() -> BtcFormat.prefixUnitsIndicator((DecimalFormat) any(), eq(3))).thenAnswer((Answer<Void>) invocation -> null);
            Locale locale = new Locale("language1");
            BtcAutoFormat target = new BtcAutoFormat(locale, BtcAutoFormat.Style.CODE, 0);
            //Act Statement(s)
            int result = target.scale(new BigInteger("0"), 0);
            //Assert statement(s)
            assertThat(result, equalTo(3));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            btcFormat.verify(() -> BtcFormat.prefixUnitsIndicator((DecimalFormat) any(), eq(3)), atLeast(1));
        }
    }

    //Sapient generated method id: ${034db038-3d0f-3f3e-91ee-291ef4cf2b7b}
    @Test()
    public void scale1Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Locale locale = new Locale("language1");
        BtcAutoFormat target = new BtcAutoFormat(locale, BtcAutoFormat.Style.CODE, 2);

        //Act Statement(s)
        int result = target.scale();

        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${3cc79711-79d6-37a1-bbad-147886aad9f5}
    @Test()
    public void fractionPlacesTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Locale locale = new Locale("language1");
        BtcAutoFormat target = new BtcAutoFormat(locale, BtcAutoFormat.Style.CODE, 2);

        //Act Statement(s)
        int result = target.fractionPlaces();

        //Assert statement(s)
        assertThat(result, equalTo(2));
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}
    @Test()
    public void toStringTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkState(false)).thenAnswer((Answer<Void>) invocation -> null);
            Locale locale = new Locale("language1");
            BtcAutoFormat target = spy(new BtcAutoFormat(locale, BtcAutoFormat.Style.CODE, 0));
            doReturn("return_of_pattern1").when(target).pattern();
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("result1"));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            verify(target, atLeast(1)).pattern();
        }
    }
}
