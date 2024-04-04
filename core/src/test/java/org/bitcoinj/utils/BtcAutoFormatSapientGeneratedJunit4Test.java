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

import org.junit.Ignore;

public class BtcAutoFormatSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${25558c3d-aa04-3bbe-8934-01044c4a6207}, hash: 0703AC306CD75BB7B9325FB7F5311AA1
    @Ignore()
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

    //Sapient generated method id: ${0584d934-2ad4-3e0e-90b2-b3a1032e9676}, hash: F100DDCBCE27E496185289CA65FD3D6B
    @Ignore()
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
            DecimalFormat decimalFormat = new DecimalFormat();
            btcFormat.when(() -> BtcFormat.prefixUnitsIndicator(decimalFormat, 3)).thenAnswer((Answer<Void>) invocation -> null);
            Locale locale = new Locale("language1");
            BtcAutoFormat target = new BtcAutoFormat(locale, BtcAutoFormat.Style.CODE, 0);
            //Act Statement(s)
            int result = target.scale(new BigInteger("0"), 0);
            //Assert statement(s)
            assertThat(result, equalTo(3));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            btcFormat.verify(() -> BtcFormat.prefixUnitsIndicator(decimalFormat, 3), atLeast(1));
        }
    }

    //Sapient generated method id: ${99afa0ac-8d38-3d5c-9f51-cdcd642225c3}, hash: 3D5ADE33FC9EF7B816ABF8634BE8645D
    @Ignore()
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
            DecimalFormat decimalFormat = new DecimalFormat();
            btcFormat.when(() -> BtcFormat.prefixUnitsIndicator(decimalFormat, 6)).thenAnswer((Answer<Void>) invocation -> null);
            Locale locale = new Locale("language1");
            BtcAutoFormat target = new BtcAutoFormat(locale, BtcAutoFormat.Style.CODE, 0);
            //Act Statement(s)
            int result = target.scale(new BigInteger("0"), 0);
            //Assert statement(s)
            assertThat(result, equalTo(6));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            btcFormat.verify(() -> BtcFormat.prefixUnitsIndicator(decimalFormat, 6), atLeast(1));
        }
    }

    //Sapient generated method id: ${83f5728d-60ec-3807-8924-8687984b7da5}, hash: 2A4476AF7CC02B68ECC5CFF5DD4665CD
    @Ignore()
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

    //Sapient generated method id: ${43a84968-3632-381d-bbce-43469a39b92b}, hash: 0F3AF5F0719EB8AD3B8EF2E52DD81D10
    @Ignore()
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
            DecimalFormat decimalFormat = new DecimalFormat();
            btcFormat.when(() -> BtcFormat.prefixUnitsIndicator(decimalFormat, 6)).thenAnswer((Answer<Void>) invocation -> null);
            Locale locale = new Locale("language1");
            BtcAutoFormat target = new BtcAutoFormat(locale, BtcAutoFormat.Style.CODE, 0);
            //Act Statement(s)
            int result = target.scale(new BigInteger("0"), 0);
            //Assert statement(s)
            assertThat(result, equalTo(6));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            btcFormat.verify(() -> BtcFormat.prefixUnitsIndicator(decimalFormat, 6), atLeast(1));
        }
    }

    //Sapient generated method id: ${957b8eb2-a667-3b5a-b03c-28ae51761b52}, hash: 18B1962673D225575E047D3A63634D21
    @Ignore()
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
            DecimalFormat decimalFormat = new DecimalFormat();
            btcFormat.when(() -> BtcFormat.prefixUnitsIndicator(decimalFormat, 3)).thenAnswer((Answer<Void>) invocation -> null);
            Locale locale = new Locale("language1");
            BtcAutoFormat target = new BtcAutoFormat(locale, BtcAutoFormat.Style.CODE, 0);
            //Act Statement(s)
            int result = target.scale(new BigInteger("0"), 0);
            //Assert statement(s)
            assertThat(result, equalTo(3));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            btcFormat.verify(() -> BtcFormat.prefixUnitsIndicator(decimalFormat, 3), atLeast(1));
        }
    }

    //Sapient generated method id: ${034db038-3d0f-3f3e-91ee-291ef4cf2b7b}, hash: D8FE51AA81A8E1FE9C7FE4C4AC681622
    @Test()
    public void scale1Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Locale locale = new Locale("language1");
        BtcAutoFormat target = new BtcAutoFormat(locale, BtcAutoFormat.Style.SYMBOL, 2);
        //Act Statement(s)
        int result = target.scale();
        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${3cc79711-79d6-37a1-bbad-147886aad9f5}, hash: C0FEA316D9B67DDC1C9159BAD51AC820
    @Test()
    public void fractionPlacesTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Locale locale = new Locale("language1");
        BtcAutoFormat target = new BtcAutoFormat(locale, BtcAutoFormat.Style.SYMBOL, 2);
        //Act Statement(s)
        int result = target.fractionPlaces();
        //Assert statement(s)
        assertThat(result, equalTo(2));
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: F0889281D0E80596055273F4B6D3B9AD
    @Test()
    public void toStringTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Locale locale = new Locale("language1");
        BtcAutoFormat target = spy(new BtcAutoFormat(locale, BtcAutoFormat.Style.SYMBOL, 2));
        doReturn("A").when(target).pattern();
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("Auto-format A"));
        verify(target).pattern();
    }
}
