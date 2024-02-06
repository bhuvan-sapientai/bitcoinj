package org.bitcoinj.utils;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;

import org.mockito.stubbing.Answer;
import org.bitcoinj.base.internal.Preconditions;

import java.util.Locale;
import java.math.BigInteger;
import java.util.function.Supplier;

import org.mockito.MockedStatic;

import java.util.ArrayList;
import java.text.DecimalFormat;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class BtcFixedFormatSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${717c1c94-99e8-3815-82de-f28f531421af}
    @Ignore()
    @Test()
    public void scaleTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BtcFormat> btcFormat = mockStatic(BtcFormat.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            btcFormat.when(() -> BtcFormat.prefixUnitsIndicator((DecimalFormat) null, 0)).thenAnswer((Answer<Void>) invocation -> null);
            Locale locale = new Locale("language1");
            List<Integer> integerList = new ArrayList<>();
            BtcFixedFormat target = new BtcFixedFormat(locale, 0, 0, integerList);
            //Act Statement(s)
            int result = target.scale(new BigInteger("0"), 0);
            //Assert statement(s)
            assertThat(result, equalTo(0));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            btcFormat.verify(() -> BtcFormat.prefixUnitsIndicator((DecimalFormat) null, 0), atLeast(1));
        }
    }

    //Sapient generated method id: ${034db038-3d0f-3f3e-91ee-291ef4cf2b7b}
    @Ignore()
    @Test()
    public void scale1Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            Locale locale = new Locale("language1");
            List<Integer> integerList = new ArrayList<>();
            BtcFixedFormat target = new BtcFixedFormat(locale, 0, 0, integerList);
            //Act Statement(s)
            int result = target.scale();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${d056b304-7a03-36ec-808e-bfed4857464d}
    @Ignore()
    @Test()
    public void codeTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BtcFormat> btcFormat = mockStatic(BtcFormat.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            btcFormat.when(() -> BtcFormat.prefixCode("code1", 0)).thenReturn("return_of_prefixCode1");
            Locale locale = new Locale("language1");
            List<Integer> integerList = new ArrayList<>();
            BtcFixedFormat target = new BtcFixedFormat(locale, 0, 0, integerList);
            //Act Statement(s)
            String result = target.code();
            //Assert statement(s)
            assertThat(result, equalTo("return_of_prefixCode1"));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            btcFormat.verify(() -> BtcFormat.prefixCode("code1", 0), atLeast(1));
        }
    }

    //Sapient generated method id: ${d63a41ac-97d2-3f49-8af7-d8404a9a837c}
    @Ignore()
    @Test()
    public void symbolTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BtcFormat> btcFormat = mockStatic(BtcFormat.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            btcFormat.when(() -> BtcFormat.prefixSymbol("symbol1", 0)).thenReturn("return_of_prefixSymbol1");
            Locale locale = new Locale("language1");
            List<Integer> integerList = new ArrayList<>();
            BtcFixedFormat target = new BtcFixedFormat(locale, 0, 0, integerList);
            //Act Statement(s)
            String result = target.symbol();
            //Assert statement(s)
            assertThat(result, equalTo("return_of_prefixSymbol1"));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            btcFormat.verify(() -> BtcFormat.prefixSymbol("symbol1", 0), atLeast(1));
        }
    }

    //Sapient generated method id: ${e323ac7c-cef1-36ab-8044-3ebd0ba2bb46}
    @Ignore()
    @Test()
    public void fractionPlaceGroupsWhenILessThanLen() {
        /* Branches:
         * (i < len) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            Locale locale = new Locale("language1");
            List<Integer> integerList = new ArrayList<>();
            BtcFixedFormat target = new BtcFixedFormat(locale, 0, 0, integerList);
            //Act Statement(s)
            int[] result = target.fractionPlaceGroups();
            int[] intResultArray = new int[]{0, 1};
            //Assert statement(s)
            assertThat(result, equalTo(intResultArray));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${c3e4e312-8c11-3027-b829-d73423000503}
    @Ignore()
    @Test()
    public void toStringWhenSwitchScaleCaseMICROCOIN_SCALE() {
        /* Branches:
         * (switch(scale) = MICROCOIN_SCALE) : true  #  inside prefixLabel method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            Locale locale = new Locale("language1");
            List<Integer> integerList = new ArrayList<>();
            BtcFixedFormat target = spy(new BtcFixedFormat(locale, 0, 0, integerList));
            doReturn("A").when(target).pattern();
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("Coin-format A"));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            verify(target).pattern();
        }
    }
}
