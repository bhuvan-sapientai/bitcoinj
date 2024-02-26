package org.bitcoinj.utils;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;

import org.mockito.stubbing.Answer;
import org.bitcoinj.base.internal.Preconditions;

import java.util.Locale;
import java.math.BigInteger;

import org.mockito.MockedStatic;

import java.util.ArrayList;
import java.text.DecimalFormat;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

public class BtcFixedFormatSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${717c1c94-99e8-3815-82de-f28f531421af}
    @Test()
    public void scaleTest() {
        /**
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
            List<Integer> integerList = new ArrayList<>();
            BtcFixedFormat target = new BtcFixedFormat(locale, 0, 0, integerList);
            //Act Statement(s)
            int result = target.scale(new BigInteger("0"), 0);
            //Assert statement(s)
            assertThat(result, equalTo(0));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            btcFormat.verify(() -> BtcFormat.prefixUnitsIndicator(decimalFormat, 0), atLeast(1));
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
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkState(false)).thenAnswer((Answer<Void>) invocation -> null);
            Locale locale = new Locale("language1");
            List<Integer> integerList = new ArrayList<>();
            BtcFixedFormat target = new BtcFixedFormat(locale, 0, 0, integerList);
            //Act Statement(s)
            int result = target.scale();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
        }
    }

    //Sapient generated method id: ${d056b304-7a03-36ec-808e-bfed4857464d}
    @Test()
    public void codeTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BtcFormat> btcFormat = mockStatic(BtcFormat.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkState(false)).thenAnswer((Answer<Void>) invocation -> null);
            btcFormat.when(() -> BtcFormat.prefixCode("code1", 0)).thenReturn("return_of_prefixCode1");
            Locale locale = new Locale("language1");
            List<Integer> integerList = new ArrayList<>();
            BtcFixedFormat target = new BtcFixedFormat(locale, 0, 0, integerList);
            //Act Statement(s)
            String result = target.code();
            //Assert statement(s)
            assertThat(result, equalTo("return_of_prefixCode1"));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            btcFormat.verify(() -> BtcFormat.prefixCode("code1", 0), atLeast(1));
        }
    }

    //Sapient generated method id: ${d63a41ac-97d2-3f49-8af7-d8404a9a837c}
    @Test()
    public void symbolTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BtcFormat> btcFormat = mockStatic(BtcFormat.class)) {
            btcFormat.when(() -> BtcFormat.prefixSymbol("\u00A4", 0)).thenReturn("return_of_prefixSymbol1");
            Locale locale = new Locale("language1");
            List<Integer> integerList = new ArrayList<>();
            integerList.add(1);
            integerList.add(2);
            integerList.add(3);
            BtcFixedFormat target = new BtcFixedFormat(locale, 0, 2, integerList);
            //Act Statement(s)
            String result = target.symbol();
            //Assert statement(s)
            assertThat(result, equalTo("return_of_prefixSymbol1"));
            btcFormat.verify(() -> BtcFormat.prefixSymbol("\u00A4", 0), atLeast(1));
        }
    }

    //Sapient generated method id: ${e323ac7c-cef1-36ab-8044-3ebd0ba2bb46}
    @Test()
    public void fractionPlaceGroupsWhenILessThanLen() {
        /* Branches:
         * (i < len) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkState(false)).thenAnswer((Answer<Void>) invocation -> null);
            Locale locale = new Locale("language1");
            List<Integer> integerList = new ArrayList<>();
            BtcFixedFormat target = new BtcFixedFormat(locale, 0, 0, integerList);
            //Act Statement(s)
            int[] result = target.fractionPlaceGroups();
            int[] intResultArray = new int[]{};
            //Assert statement(s)
            assertThat(result, equalTo(intResultArray));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
        }
    }

    //Sapient generated method id: ${bce69e1e-6a07-38e9-acfb-2444b980e249}
    @Test()
    public void toStringWhenSwitchScaleCaseMinus1() {
        /* Branches:
         * (switch(scale) = -1) : true  #  inside prefixLabel method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkState(false)).thenAnswer((Answer<Void>) invocation -> null);
            Locale locale = new Locale("language1");
            List<Integer> integerList = new ArrayList<>();
            BtcFixedFormat target = spy(new BtcFixedFormat(locale, 0, 0, integerList));
            doReturn("return_of_pattern1").when(target).pattern();
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("result1"));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            verify(target, atLeast(1)).pattern();
        }
    }

    //Sapient generated method id: ${7f0d120c-f56d-30af-87e1-cc491bd9a017}
    @Test()
    public void toStringWhenSwitchScaleCaseMinus2() {
        /* Branches:
         * (switch(scale) = -2) : true  #  inside prefixLabel method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkState(false)).thenAnswer((Answer<Void>) invocation -> null);
            Locale locale = new Locale("language1");
            List<Integer> integerList = new ArrayList<>();
            BtcFixedFormat target = spy(new BtcFixedFormat(locale, 0, 0, integerList));
            doReturn("return_of_pattern1").when(target).pattern();
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("result1"));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            verify(target, atLeast(1)).pattern();
        }
    }

    //Sapient generated method id: ${fad52055-9caa-354d-b263-109b8af80617}
    @Test()
    public void toStringWhenSwitchScaleCaseMinus3() {
        /* Branches:
         * (switch(scale) = -3) : true  #  inside prefixLabel method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkState(false)).thenAnswer((Answer<Void>) invocation -> null);
            Locale locale = new Locale("language1");
            List<Integer> integerList = new ArrayList<>();
            BtcFixedFormat target = spy(new BtcFixedFormat(locale, 0, 0, integerList));
            doReturn("return_of_pattern1").when(target).pattern();
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("result1"));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            verify(target, atLeast(1)).pattern();
        }
    }

    //Sapient generated method id: ${915fb82a-ce39-3b58-a6fc-ce52cadad169}
    @Test()
    public void toStringWhenSwitchScaleCaseMinus6() {
        /* Branches:
         * (switch(scale) = -6) : true  #  inside prefixLabel method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkState(false)).thenAnswer((Answer<Void>) invocation -> null);
            Locale locale = new Locale("language1");
            List<Integer> integerList = new ArrayList<>();
            BtcFixedFormat target = spy(new BtcFixedFormat(locale, 0, 0, integerList));
            doReturn("return_of_pattern1").when(target).pattern();
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("result1"));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            verify(target, atLeast(1)).pattern();
        }
    }

    //Sapient generated method id: ${dc91410a-5348-3109-9863-e1c491abb865}
    @Test()
    public void toStringWhenSwitchScaleCase1() {
        /* Branches:
         * (switch(scale) = 1) : true  #  inside prefixLabel method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkState(false)).thenAnswer((Answer<Void>) invocation -> null);
            Locale locale = new Locale("language1");
            List<Integer> integerList = new ArrayList<>();
            BtcFixedFormat target = spy(new BtcFixedFormat(locale, 0, 0, integerList));
            doReturn("return_of_pattern1").when(target).pattern();
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("result1"));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            verify(target, atLeast(1)).pattern();
        }
    }

    //Sapient generated method id: ${7ae1ab14-a06b-3a0f-8e38-e353c69a38ff}
    @Test()
    public void toStringWhenSwitchScaleCase2() {
        /* Branches:
         * (switch(scale) = 2) : true  #  inside prefixLabel method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkState(false)).thenAnswer((Answer<Void>) invocation -> null);
            Locale locale = new Locale("language1");
            List<Integer> integerList = new ArrayList<>();
            BtcFixedFormat target = spy(new BtcFixedFormat(locale, 0, 0, integerList));
            doReturn("return_of_pattern1").when(target).pattern();
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("result1"));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            verify(target, atLeast(1)).pattern();
        }
    }

    //Sapient generated method id: ${b59cf20c-5b54-3288-a5f6-be6bffdc1c12}
    @Test()
    public void toStringWhenSwitchScaleCaseCOIN_SCALE() {
        /* Branches:
         * (switch(scale) = COIN_SCALE) : true  #  inside prefixLabel method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkState(false)).thenAnswer((Answer<Void>) invocation -> null);
            Locale locale = new Locale("language1");
            List<Integer> integerList = new ArrayList<>();
            BtcFixedFormat target = spy(new BtcFixedFormat(locale, 0, 0, integerList));
            doReturn("return_of_pattern1").when(target).pattern();
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("result1"));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            verify(target, atLeast(1)).pattern();
        }
    }

    //Sapient generated method id: ${c3e4e312-8c11-3027-b829-d73423000503}
    @Test()
    public void toStringWhenSwitchScaleCaseMICROCOIN_SCALE() {
        /* Branches:
         * (switch(scale) = MICROCOIN_SCALE) : true  #  inside prefixLabel method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkState(false)).thenAnswer((Answer<Void>) invocation -> null);
            Locale locale = new Locale("language1");
            List<Integer> integerList = new ArrayList<>();
            BtcFixedFormat target = spy(new BtcFixedFormat(locale, 0, 0, integerList));
            doReturn("return_of_pattern1").when(target).pattern();
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("result1"));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            verify(target, atLeast(1)).pattern();
        }
    }

    //Sapient generated method id: ${abf0ec22-c9da-3a83-bdd9-ac3deb3ca7bf}
    @Test()
    public void toStringWhenSwitchScaleCaseMILLICOIN_SCALE() {
        /* Branches:
         * (switch(scale) = MILLICOIN_SCALE) : true  #  inside prefixLabel method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkState(false)).thenAnswer((Answer<Void>) invocation -> null);
            Locale locale = new Locale("language1");
            List<Integer> integerList = new ArrayList<>();
            BtcFixedFormat target = spy(new BtcFixedFormat(locale, 0, 0, integerList));
            doReturn("return_of_pattern1").when(target).pattern();
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("result1"));
            preconditions.verify(() -> Preconditions.checkState(false), atLeast(1));
            verify(target, atLeast(1)).pattern();
        }
    }

    //Sapient generated method id: ${5ebf920b-84ff-3bd6-a39f-a1c11d0db3c9}
    @Test()
    public void toStringWhenSwitchScaleCaseDefault() {
        /* Branches:
         * (switch(scale) = default) : true  #  inside prefixLabel method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.checkState(false)).thenAnswer((Answer<Void>) invocation -> null);
            Locale locale = new Locale("language1");
            List<Integer> integerList = new ArrayList<>();
            BtcFixedFormat target = spy(new BtcFixedFormat(locale, 0, 0, integerList));
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
