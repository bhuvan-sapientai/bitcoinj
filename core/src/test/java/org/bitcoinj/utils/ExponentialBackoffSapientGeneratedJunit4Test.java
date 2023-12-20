package org.bitcoinj.utils;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.bitcoinj.base.internal.TimeUtils;
import org.mockito.MockedStatic;

import java.time.Instant;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

public class ExponentialBackoffSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final ExponentialBackoff.Params exponentialBackoffParamsMock = mock(ExponentialBackoff.Params.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${b77d6e2a-af77-32b7-8a05-30ba4c7b60e5}
    @Test()
    public void trackSuccessTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class)) {
            Instant instant2 = null;
            Instant instant = TimeUtils.currentTime();
            //TODO: Needs to return real value
            timeUtils.when(() -> TimeUtils.currentTime()).thenReturn(instant).thenReturn(instant2);
            ExponentialBackoff target = new ExponentialBackoff(exponentialBackoffParamsMock);
            //Act Statement(s)
            target.trackSuccess();
            //Assert statement(s)
            timeUtils.verify(() -> TimeUtils.currentTime(), atLeast(2));
        }
    }

    //Sapient generated method id: ${812e1600-1008-3380-8ccb-18e4f7bb25fb}
    @Test()
    public void trackFailureWhenBackoffCompareToParamsMaximumIntervalGreaterThan0() {
        /* Branches:
         * (backoff.compareTo(params.maximumInterval) > 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class)) {
            Instant instant2 = null;
            Instant instant = TimeUtils.currentTime();
            //TODO: Needs to return real value
            timeUtils.when(() -> TimeUtils.currentTime()).thenReturn(instant).thenReturn(instant2);
            ExponentialBackoff target = new ExponentialBackoff(exponentialBackoffParamsMock);
            thrown.expect(NullPointerException.class);
            //Act Statement(s)
            target.trackFailure();
            //Assert statement(s)
            timeUtils.verify(() -> TimeUtils.currentTime(), atLeast(2));
        }
    }

    //Sapient generated method id: ${ccd040e4-311d-30d2-8f98-78ba3d2f5437}
    @Test()
    public void retryTimeTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class)) {
            Instant instant = TimeUtils.currentTime();
            timeUtils.when(() -> TimeUtils.currentTime()).thenReturn(instant);
            ExponentialBackoff target = new ExponentialBackoff(exponentialBackoffParamsMock);
            //Act Statement(s)
            Instant result = target.retryTime();
            //Assert statement(s)
            assertThat(result, equalTo(instant));
            timeUtils.verify(() -> TimeUtils.currentTime(), atLeast(1));
        }
    }

    //Sapient generated method id: ${1841a798-331a-3eb9-b2cd-d7600dfa9716}
    @Ignore()
    @Test()
    public void getRetryTimeTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class)) {
            Instant instant = TimeUtils.currentTime();
            timeUtils.when(() -> TimeUtils.currentTime()).thenReturn(instant);
            ExponentialBackoff target = new ExponentialBackoff(exponentialBackoffParamsMock);
            //Act Statement(s)
            long result = target.getRetryTime();
            //Assert statement(s)
            assertThat(result, equalTo(1703050988830L));
            timeUtils.verify(() -> TimeUtils.currentTime(), atLeast(1));
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
        ExponentialBackoff.Params exponentialBackoffParamsMock2 = mock(ExponentialBackoff.Params.class);
        try (MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class)) {
            Instant instant = TimeUtils.currentTime();
            timeUtils.when(() -> TimeUtils.currentTime()).thenReturn(instant);
            ExponentialBackoff target = new ExponentialBackoff(exponentialBackoffParamsMock);
            ExponentialBackoff exponentialBackoff = new ExponentialBackoff(exponentialBackoffParamsMock2);
            //Act Statement(s)
            int result = target.compareTo(exponentialBackoff);
            //Assert statement(s)
            assertThat(result, equalTo(0));
            timeUtils.verify(() -> TimeUtils.currentTime(), atLeast(1));
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
        try (MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class)) {
            //TODO: Needs to return real value
            timeUtils.when(() -> TimeUtils.currentTime()).thenReturn(null);
            ExponentialBackoff target = new ExponentialBackoff(exponentialBackoffParamsMock);
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("ExponentialBackoff retry=null backoff=2 ms"));
            timeUtils.verify(() -> TimeUtils.currentTime(), atLeast(1));
        }
    }
}
