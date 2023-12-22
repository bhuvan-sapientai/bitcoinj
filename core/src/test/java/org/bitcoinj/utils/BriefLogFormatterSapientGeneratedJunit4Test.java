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

import org.junit.Ignore;

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
    @Ignore()
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
        StackTraceElement stackTraceElement = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement2 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement3 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement4 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement5 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement6 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement7 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement8 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement9 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement10 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement11 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement12 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement13 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement14 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement15 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement16 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement17 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement18 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement19 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement20 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement21 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement22 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement23 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement24 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement25 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement26 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement27 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement28 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement29 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement30 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement31 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement32 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement33 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement34 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement35 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement36 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement37 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement38 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement39 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement40 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement41 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement42 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement43 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement44 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement45 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement46 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement47 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement48 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement49 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement50 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement51 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement52 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement53 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement54 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement55 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement56 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement57 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement58 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement59 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement60 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement61 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement62 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement63 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement64 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement65 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement66 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement67 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement68 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement69 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement70 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement71 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement72 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement73 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement74 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement75 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement76 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement77 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement78 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement79 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement80 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement81 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement82 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement83 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement84 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement85 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement86 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement87 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement88 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement89 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement90 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement91 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement92 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement93 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement94 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement95 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement96 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement97 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement98 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement99 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement100 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement101 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement102 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement103 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement104 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement105 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement106 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement107 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement108 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement109 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement110 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement111 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement112 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement113 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement114 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement stackTraceElement115 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement[] stackTraceElementArray = new StackTraceElement[]{stackTraceElement, stackTraceElement2, stackTraceElement3, stackTraceElement4, stackTraceElement5, stackTraceElement6, stackTraceElement7, stackTraceElement8, stackTraceElement9, stackTraceElement10, stackTraceElement11, stackTraceElement12, stackTraceElement13, stackTraceElement14, stackTraceElement15, stackTraceElement16, stackTraceElement17, stackTraceElement18, stackTraceElement19, stackTraceElement20, stackTraceElement21, stackTraceElement22, stackTraceElement23, stackTraceElement24, stackTraceElement25, stackTraceElement26, stackTraceElement27, stackTraceElement28, stackTraceElement29, stackTraceElement30, stackTraceElement31, stackTraceElement32, stackTraceElement33, stackTraceElement34, stackTraceElement35, stackTraceElement36, stackTraceElement37, stackTraceElement38, stackTraceElement39, stackTraceElement40, stackTraceElement41, stackTraceElement42, stackTraceElement43, stackTraceElement44, stackTraceElement45, stackTraceElement46, stackTraceElement47, stackTraceElement48, stackTraceElement49, stackTraceElement50, stackTraceElement51, stackTraceElement52, stackTraceElement53, stackTraceElement54, stackTraceElement55, stackTraceElement56, stackTraceElement57, stackTraceElement58, stackTraceElement59, stackTraceElement60, stackTraceElement61, stackTraceElement62, stackTraceElement63, stackTraceElement64, stackTraceElement65, stackTraceElement66, stackTraceElement67, stackTraceElement68, stackTraceElement69, stackTraceElement70, stackTraceElement71, stackTraceElement72, stackTraceElement73, stackTraceElement74, stackTraceElement75, stackTraceElement76, stackTraceElement77, stackTraceElement78, stackTraceElement79, stackTraceElement80, stackTraceElement81, stackTraceElement82, stackTraceElement83, stackTraceElement84, stackTraceElement85, stackTraceElement86, stackTraceElement87, stackTraceElement88, stackTraceElement89, stackTraceElement90, stackTraceElement91, stackTraceElement92, stackTraceElement93, stackTraceElement94, stackTraceElement95, stackTraceElement96, stackTraceElement97, stackTraceElement98, stackTraceElement99, stackTraceElement100, stackTraceElement101, stackTraceElement102, stackTraceElement103, stackTraceElement104, stackTraceElement105, stackTraceElement106, stackTraceElement107, stackTraceElement108, stackTraceElement109, stackTraceElement110, stackTraceElement111, stackTraceElement112, stackTraceElement113, stackTraceElement114, stackTraceElement115};
        Throwable throwable = new Throwable();
        throwable.setStackTrace(stackTraceElementArray);
        LogRecord logRecord = new LogRecord(level, "msg1");
        logRecord.setThreadID(1);
        logRecord.setThrown(throwable);
        logRecord.setMessage("Test message");
        logRecord.setLoggerName("");
        //Act Statement(s)
        String result = target.format(logRecord);
        //Assert statement(s)
        assertThat(result, equalTo("result1"));
    }

    //Sapient generated method id: ${ac8ff3d4-4f6a-3dff-8982-4e680415e084}
    @Ignore()
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
