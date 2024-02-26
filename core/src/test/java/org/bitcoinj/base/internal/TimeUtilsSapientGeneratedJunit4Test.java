package org.bitcoinj.base.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.time.Duration;
import java.time.Instant;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class TimeUtilsSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${b07fefc0-4612-3b2e-b04f-06c71056b673}
    @Test()
    public void setMockClockTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        TimeUtils.setMockClock();
    }

    //Sapient generated method id: ${a4dae03e-6232-37d5-8ea5-3ef450e4d8bf}
    @Test()
    public void setMockClock1Test() {
        //Arrange Statement(s)
        Instant instant = Instant.now();

        //Act Statement(s)
        TimeUtils.setMockClock(instant);
    }

    //Sapient generated method id: ${9cc1c232-0e43-3602-bf30-98ba32ff48d4}
    @Test()
    public void rollMockClockWhenClockEqualsClockSystemUTCThrowsIllegalStateException() {
        /* Branches:
         * (clock.equals(Clock.systemUTC())) : true
         */
        //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("You need to use setMockClock() first.");
        thrown.expect(IllegalStateException.class);
        thrown.expectMessage(illegalStateException.getMessage());
        Duration duration = Duration.ofDays(0L);

        //Act Statement(s)
        TimeUtils.rollMockClock(duration);
    }

    //Sapient generated method id: ${0d541f49-3c59-374b-8b6b-f659640f0943}
    @Test()
    public void clearMockClockTest() {

        //Act Statement(s)
        TimeUtils.clearMockClock();
    }

    //Sapient generated method id: ${ad6048d6-082d-32ad-a3bf-ecc118184bdc}
    @Test()
    public void currentTimeTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        Instant result = TimeUtils.currentTime();
        Instant instant = Instant.ofEpochSecond(1700000000);

        //Assert statement(s)
        assertThat(result, equalTo(instant));
    }

    //Sapient generated method id: ${751f948e-1cd7-3b35-bafe-6fbce2e92955}
    @Test()
    public void elapsedTimeTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Instant instant = Instant.now();

        //Act Statement(s)
        Duration result = TimeUtils.elapsedTime(instant);
        Duration duration = Duration.ofDays(0L);

        //Assert statement(s)
        assertThat(result, equalTo(duration));
    }

    //Sapient generated method id: ${bd4f9ea2-32f7-3976-9bbb-0dca155e48d5}
    @Test()
    public void earlierWhenTime1IsBeforeTime2() {
        /* Branches:
         * (time1.isBefore(time2)) : true
         */
        //Arrange Statement(s)
        Instant instant = Instant.now();
        Instant instant2 = Instant.now();

        //Act Statement(s)
        Instant result = TimeUtils.earlier(instant, instant2);

        //Assert statement(s)
        assertThat(result, equalTo(instant));
    }

    //Sapient generated method id: ${58bf7731-4cf4-34d3-b4bc-3b02c4828fbb}
    @Test()
    public void earlierWhenTime1NotIsBeforeTime2() {
        /* Branches:
         * (time1.isBefore(time2)) : false
         */
        //Arrange Statement(s)
        Instant instant = Instant.ofEpochSecond(1700000000);
        Instant instant2 = Instant.ofEpochSecond(1700000000);

        //Act Statement(s)
        Instant result = TimeUtils.earlier(instant, instant2);

        //Assert statement(s)
        assertThat(result, equalTo(instant2));
    }

    //Sapient generated method id: ${6f6f90ff-0b94-3fc1-8feb-95d2c75b356c}
    @Test()
    public void laterWhenTime1IsAfterTime2() {
        /* Branches:
         * (time1.isAfter(time2)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Instant instant = Instant.ofEpochSecond(1700000000);
        Instant instant2 = Instant.ofEpochSecond(1700000000);

        //Act Statement(s)
        Instant result = TimeUtils.later(instant, instant2);

        //Assert statement(s)
        assertThat(result, equalTo(instant));
    }

    //Sapient generated method id: ${b92850a2-bba2-3efc-b033-b6bf8dca9ca5}
    @Test()
    public void laterWhenTime1NotIsAfterTime2() {
        /* Branches:
         * (time1.isAfter(time2)) : false
         */
        //Arrange Statement(s)
        Instant instant = Instant.ofEpochSecond(1700000000);
        Instant instant2 = Instant.ofEpochSecond(1700000000);

        //Act Statement(s)
        Instant result = TimeUtils.later(instant, instant2);

        //Assert statement(s)
        assertThat(result, equalTo(instant2));
    }

    //Sapient generated method id: ${a3e1c0b1-9bff-3c88-99c6-c84fb8652533}
    @Test()
    public void longestWhenDuration1CompareToDuration2GreaterThan0() {
        /* Branches:
         * (duration1.compareTo(duration2) > 0) : true
         */
        //Arrange Statement(s)
        Duration duration = Duration.ofDays(0L);
        Duration duration2 = Duration.ofDays(0L);

        //Act Statement(s)
        Duration result = TimeUtils.longest(duration, duration2);

        //Assert statement(s)
        assertThat(result, equalTo(duration));
    }

    //Sapient generated method id: ${0036fb62-43ba-3af3-a5c1-8bd23fee5bf9}
    @Test()
    public void longestWhenDuration1CompareToDuration2NotGreaterThan0() {
        /* Branches:
         * (duration1.compareTo(duration2) > 0) : false
         */
        //Arrange Statement(s)
        Duration duration = Duration.ofDays(0L);
        Duration duration2 = Duration.ofDays(0L);

        //Act Statement(s)
        Duration result = TimeUtils.longest(duration, duration2);

        //Assert statement(s)
        assertThat(result, equalTo(duration2));
    }

    //Sapient generated method id: ${0e415065-719f-3aec-8eb3-0ae748007c6f}
    @Test()
    public void dateTimeFormatTest() {
        //Arrange Statement(s)
        Instant instant = Instant.ofEpochSecond(1700000000);

        //Act Statement(s)
        String result = TimeUtils.dateTimeFormat(instant);

        //Assert statement(s)
        assertThat(result, equalTo("2023-11-14T22:13:20Z"));
    }
}
