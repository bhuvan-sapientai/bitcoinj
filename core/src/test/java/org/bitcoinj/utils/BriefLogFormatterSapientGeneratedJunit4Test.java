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
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

public class BriefLogFormatterSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${e991d51a-89a1-3fbd-8961-0087bc961914}
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

    //Sapient generated method id: ${77d9580d-0a0c-3794-aeb1-13da2a5e4954}
    @Test()
    public void init1WhenHandlersLengthGreaterThan0() {
        /* Branches:
         * (handlers.length > 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Level level = Level.parse("name1");

        //Act Statement(s)
        BriefLogFormatter.init(level);
    }

    //Sapient generated method id: ${3a6e416d-0a41-3b1a-be46-3cb72a3f10ca}
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

    //Sapient generated method id: ${dea246d0-4e1d-3d3e-b66a-74b9c8e925ed}
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

    //Sapient generated method id: ${5378ac91-7deb-341c-89c9-a5f9224b65ce}
    @Test()
    public void formatWhenLogRecordGetThrownIsNotNull() {
        /* Branches:
         * (logRecord.getThrown() != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BriefLogFormatter target = new BriefLogFormatter();
        Level level = Level.parse("name1");
        LogRecord logRecord = new LogRecord(level, "msg1");

        //Act Statement(s)
        String result = target.format(logRecord);

        //Assert statement(s)
        assertThat(result, equalTo("result1"));
    }

    //Sapient generated method id: ${ac8ff3d4-4f6a-3dff-8982-4e680415e084}
    @Test()
    public void formatWhenLogRecordGetThrownIsNull() {
        /* Branches:
         * (logRecord.getThrown() != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BriefLogFormatter target = new BriefLogFormatter();
        Level level = Level.parse("name1");
        LogRecord logRecord = new LogRecord(level, "msg1");

        //Act Statement(s)
        String result = target.format(logRecord);

        //Assert statement(s)
        assertThat(result, equalTo("result1"));
    }
}
