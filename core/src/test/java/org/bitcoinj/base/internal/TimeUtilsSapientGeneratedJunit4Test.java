package org.bitcoinj.base.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.time.Clock;
import java.time.Duration;

import org.mockito.MockedStatic;

import java.time.Instant;

import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

public class TimeUtilsSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${b07fefc0-4612-3b2e-b04f-06c71056b673}, hash: 7F2132D0B7C261EAFA0EFF393B969FDE
    @Ignore()
    @Test()
    public void setMockClockTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Instant> instant = mockStatic(Instant.class)) {
            Instant instant2 = Instant.now();
            instant.when(() -> Instant.now()).thenReturn(instant2);
            //Act Statement(s)
            TimeUtils.setMockClock();
            //Assert statement(s)
            instant.verify(() -> Instant.now(), atLeast(1));
        }
    }

    //Sapient generated method id: ${a4dae03e-6232-37d5-8ea5-3ef450e4d8bf}, hash: 63F9D08D2D7047AA9524CA254FE0A99C
    @Test()
    public void setMockClock1Test() {
        //Arrange Statement(s)
        Instant instant = Instant.now();
        //Act Statement(s)
        TimeUtils.setMockClock(instant);
    }

    //Sapient generated method id: ${9cc1c232-0e43-3602-bf30-98ba32ff48d4}, hash: DF66957B73B72CC5F7AB5C11A2000972
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

    //Sapient generated method id: ${0d541f49-3c59-374b-8b6b-f659640f0943}, hash: A653C06CE3BCFB90F831BA92B89A2261
    @Test()
    public void clearMockClockTest() {
        //Act Statement(s)
        TimeUtils.clearMockClock();
    }

    //Sapient generated method id: ${ad6048d6-082d-32ad-a3bf-ecc118184bdc}, hash: 50CD0D9EEC277B40DDCAC9B39C38CE7B
    @Test()
    public void currentTimeTest() {
        //Arrange Statement(s)
        try (MockedStatic<Instant> instant = mockStatic(Instant.class)) {
            Instant instant2 = Instant.ofEpochSecond(1700000000);
            instant.when(() -> Instant.now((Clock) any())).thenReturn(instant2);
            //Act Statement(s)
            Instant result = TimeUtils.currentTime();
            //Assert statement(s)
            assertThat(result, equalTo(instant2));
            instant.verify(() -> Instant.now((Clock) any()));
        }
    }

    //Sapient generated method id: ${751f948e-1cd7-3b35-bafe-6fbce2e92955}, hash: BBCEBE3FAEF0D2CFFAE77B1FBC050067
    @Ignore()
    @Test()
    public void elapsedTimeTest() {
        //Arrange Statement(s)
        Instant instant = Instant.now();
        //Act Statement(s)
        Duration result = TimeUtils.elapsedTime(instant);
        Instant instant2 = Instant.now();
        Duration duration = Duration.between(instant, instant2);
        //Assert statement(s)
        assertThat(result, equalTo(duration));
    }

    //Sapient generated method id: ${bd4f9ea2-32f7-3976-9bbb-0dca155e48d5}, hash: 89C5348FEF22830B0BEF91A4CF367516
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

    //Sapient generated method id: ${58bf7731-4cf4-34d3-b4bc-3b02c4828fbb}, hash: F829B510B10BEF0E2C5C631FA51E7C41
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

    //Sapient generated method id: ${6f6f90ff-0b94-3fc1-8feb-95d2c75b356c}, hash: 8EDCDCD210FD18F2DAD8B3B60B02B4F4
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

    //Sapient generated method id: ${b92850a2-bba2-3efc-b033-b6bf8dca9ca5}, hash: B7D3B0B61566C5B41C0FD60976B21092
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

    //Sapient generated method id: ${a3e1c0b1-9bff-3c88-99c6-c84fb8652533}, hash: 5832CE2F55E39C03EC8C2AD587FF9BA8
    @Test()
    public void longestWhenDuration1CompareToDuration2GreaterThan0() {
        /* Branches:
         * (duration1.compareTo(duration2) > 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Duration duration = Duration.ofDays(0L);
        Duration duration2 = Duration.ofDays(0L);
        //Act Statement(s)
        Duration result = TimeUtils.longest(duration, duration2);
        //Assert statement(s)
        assertThat(result, equalTo(duration));
    }

    //Sapient generated method id: ${0036fb62-43ba-3af3-a5c1-8bd23fee5bf9}, hash: 9EC547789C88CDABB4735D5284C2EBFA
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

    //Sapient generated method id: ${0e415065-719f-3aec-8eb3-0ae748007c6f}, hash: C95D958515AD75D566CC7BFFA23A2741
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
