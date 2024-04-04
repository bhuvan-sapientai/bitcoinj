package org.bitcoinj.utils;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
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

    //Sapient generated method id: ${b77d6e2a-af77-32b7-8a05-30ba4c7b60e5}, hash: 3970176826506840D64EF55886B5947E
    @Test()
    public void trackSuccessTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ExponentialBackoff target = new ExponentialBackoff(exponentialBackoffParamsMock);
        //Act Statement(s)
        target.trackSuccess();
    }

    //Sapient generated method id: ${812e1600-1008-3380-8ccb-18e4f7bb25fb}, hash: 309DCC992428CA1057F7D86FA4A80481
    @Ignore()
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
            Instant instant = TimeUtils.currentTime();
            Instant instant2 = Instant.ofEpochSecond(1700000000);
            timeUtils.when(() -> TimeUtils.currentTime()).thenReturn(instant).thenReturn(instant2);
            ExponentialBackoff target = new ExponentialBackoff(exponentialBackoffParamsMock);
            //Act Statement(s)
            target.trackFailure();
            //Assert statement(s)
            timeUtils.verify(() -> TimeUtils.currentTime(), atLeast(2));
        }
    }

    //Sapient generated method id: ${ccd040e4-311d-30d2-8f98-78ba3d2f5437}, hash: 6FB78AE897D739430882A0A1FEFC6854
    @Test()
    public void retryTimeTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ExponentialBackoff target = new ExponentialBackoff(exponentialBackoffParamsMock);
        //Act Statement(s)
        Instant result = target.retryTime();
        Instant instant = TimeUtils.currentTime();
        //Assert statement(s)
        assertThat(result, equalTo(instant));
    }

    //Sapient generated method id: ${1841a798-331a-3eb9-b2cd-d7600dfa9716}, hash: 9C6D4AF5F52E321D5742B529256F3CBD
    @Ignore()
    @Test()
    public void getRetryTimeTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ExponentialBackoff target = new ExponentialBackoff(exponentialBackoffParamsMock);
        //Act Statement(s)
        long result = target.getRetryTime();
        //Assert statement(s)
        assertThat(result, equalTo(1712214258590L));
    }

    //Sapient generated method id: ${af5f6332-26a2-3749-8f9a-ac87ce6fe7cf}, hash: BA959B91400AB6EAD5B0DED61BFC9233
    @Test()
    public void compareToTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ExponentialBackoff.Params exponentialBackoffParamsMock2 = mock(ExponentialBackoff.Params.class);
        try (MockedStatic<TimeUtils> timeUtils = mockStatic(TimeUtils.class)) {
            Instant instant = Instant.ofEpochSecond(1700000000);
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

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: 9320D5CAB4CA3F78880D832291B71D2C
    @Ignore()
    @Test()
    public void toStringTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ExponentialBackoff target = new ExponentialBackoff(exponentialBackoffParamsMock);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("ExponentialBackoff retry=2024-04-04T07:04:18.844334Z backoff=2 ms"));
    }
}
