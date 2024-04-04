package org.bitcoinj.utils;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;

import java.util.logging.LogRecord;
import java.util.logging.Level;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

import org.junit.Ignore;

public class BriefLogFormatterSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final LogRecord logRecordMock = mock(LogRecord.class);

    //Sapient generated method id: ${e991d51a-89a1-3fbd-8961-0087bc961914}, hash: A0037E3AF4FD0E769B29934D4B4518F2
    @Test()
    public void initTest() {
        //Arrange Statement(s)
        try (MockedStatic<BriefLogFormatter> briefLogFormatter = mockStatic(BriefLogFormatter.class, CALLS_REAL_METHODS)) {
            Level level = Level.INFO;
            briefLogFormatter.when(() -> BriefLogFormatter.init(level)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            BriefLogFormatter.init();
            //Assert statement(s)
            briefLogFormatter.verify(() -> BriefLogFormatter.init(level), atLeast(1));
        }
    }

    //Sapient generated method id: ${77d9580d-0a0c-3794-aeb1-13da2a5e4954}, hash: 7AE13893869A22BE311F80FCD588ED75
    @Ignore()
    @Test()
    public void init1WhenHandlersLengthGreaterThan0() {
        /* Branches:
         * (handlers.length > 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Level level = Level.parse("x1");
        //Act Statement(s)
        BriefLogFormatter.init(level);
    }

    //Sapient generated method id: ${3a6e416d-0a41-3b1a-be46-3cb72a3f10ca}, hash: B00124237CF5EA976B172FBEB73B6C37
    @Test()
    public void initVerboseTest() {
        //Arrange Statement(s)
        try (MockedStatic<BriefLogFormatter> briefLogFormatter = mockStatic(BriefLogFormatter.class, CALLS_REAL_METHODS)) {
            Level level = Level.ALL;
            briefLogFormatter.when(() -> BriefLogFormatter.init(level)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            BriefLogFormatter.initVerbose();
            //Assert statement(s)
            briefLogFormatter.verify(() -> BriefLogFormatter.init(level), atLeast(1));
        }
    }

    //Sapient generated method id: ${dea246d0-4e1d-3d3e-b66a-74b9c8e925ed}, hash: DF5C079A94CA23ACE62D1FBCAEA0B47F
    @Test()
    public void initWithSilentBitcoinJTest() {
        //Arrange Statement(s)
        try (MockedStatic<BriefLogFormatter> briefLogFormatter = mockStatic(BriefLogFormatter.class, CALLS_REAL_METHODS)) {
            briefLogFormatter.when(() -> BriefLogFormatter.init()).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            BriefLogFormatter.initWithSilentBitcoinJ();
            //Assert statement(s)
            briefLogFormatter.verify(() -> BriefLogFormatter.init(), atLeast(1));
        }
    }

    //Sapient generated method id: ${5378ac91-7deb-341c-89c9-a5f9224b65ce}, hash: 3859C7AF6B0B8622D674176632102424
    @Ignore()
    @Test()
    public void formatWhenLogRecordGetThrownIsNotNull() {
        /* Branches:
         * (logRecord.getThrown() != null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: ISO_LOCAL_TIME, messageFormat
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(-1).when(logRecordMock).getThreadID();
        doReturn("A").when(logRecordMock).getSourceClassName();
        doReturn("return_of_getSourceMethodName1").when(logRecordMock).getSourceMethodName();
        doReturn(-1L).when(logRecordMock).getMillis();
        doReturn("return_of_getMessage1").when(logRecordMock).getMessage();
        Throwable throwable = new Throwable();
        Throwable throwable2 = new Throwable();
        doReturn(throwable, throwable2).when(logRecordMock).getThrown();
        BriefLogFormatter target = new BriefLogFormatter();
        //Act Statement(s)
        String result = target.format(logRecordMock);
        //Assert statement(s)
        assertThat(result, equalTo("result1"));
        verify(logRecordMock).getThreadID();
        verify(logRecordMock).getSourceClassName();
        verify(logRecordMock).getSourceMethodName();
        verify(logRecordMock).getMillis();
        verify(logRecordMock).getMessage();
        verify(logRecordMock, times(2)).getThrown();
    }

    //Sapient generated method id: ${ac8ff3d4-4f6a-3dff-8982-4e680415e084}, hash: 1C56E3C5511AB1652EB796457A7E5A7F
    @Ignore()
    @Test()
    public void formatWhenLogRecordGetThrownIsNull() {
        /* Branches:
         * (logRecord.getThrown() != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: ISO_LOCAL_TIME, messageFormat
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(-1).when(logRecordMock).getThreadID();
        doReturn("A").when(logRecordMock).getSourceClassName();
        doReturn("return_of_getSourceMethodName1").when(logRecordMock).getSourceMethodName();
        doReturn(-1L).when(logRecordMock).getMillis();
        doReturn("return_of_getMessage1").when(logRecordMock).getMessage();
        doReturn(null).when(logRecordMock).getThrown();
        BriefLogFormatter target = new BriefLogFormatter();
        //Act Statement(s)
        String result = target.format(logRecordMock);
        //Assert statement(s)
        assertThat(result, equalTo("result1"));
        verify(logRecordMock).getThreadID();
        verify(logRecordMock).getSourceClassName();
        verify(logRecordMock).getSourceMethodName();
        verify(logRecordMock).getMillis();
        verify(logRecordMock).getMessage();
        verify(logRecordMock).getThrown();
    }
}
