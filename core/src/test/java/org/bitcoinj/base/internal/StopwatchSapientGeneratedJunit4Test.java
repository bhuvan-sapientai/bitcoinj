package org.bitcoinj.base.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;
import java.util.Arrays;
import java.time.temporal.TemporalUnit;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInRelativeOrder;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;
import org.mockito.stubbing.Answer;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

import static org.hamcrest.Matchers.nullValue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

public class StopwatchSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${0ad2b469-3c49-34f9-8a63-6bb6b74df584}
    @Test()
    public void isRunningWhenStopTimeIsNull() {
        /* Branches:
         * (stopTime == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Stopwatch target = Stopwatch.start();

        //Act Statement(s)
        boolean result = target.isRunning();

        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${9c25887d-767d-38e9-b5ae-c2e4012c49be}
    @Ignore()
    @Test()
    public void getTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Stopwatch target = Stopwatch.start();
        thrown.expect(NullPointerException.class);
        //TODO: Needs initialization with real value
        TemporalUnit temporalUnit = null;

        //Act Statement(s)
        target.get(temporalUnit);
    }

    //Sapient generated method id: ${37fda9a0-27b1-39d9-844c-155c12172b76}
    @Ignore()
    @Test()
    public void addToTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Stopwatch target = spy(Stopwatch.start());
        Duration duration = Duration.ofDays(0L);
        doReturn(duration).when(target).elapsed();
        //TODO: Needs initialization with real value
        Temporal temporal = null;

        //Act Statement(s)
        Temporal result = target.addTo(temporal);

        //Assert statement(s)
        assertThat(result, is(nullValue()));
        verify(target).elapsed();
    }

    //Sapient generated method id: ${5b4caf68-30d0-34d6-8e4d-e081a7ee3fdb}
    @Ignore()
    @Test()
    public void subtractFromTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Stopwatch target = spy(Stopwatch.start());
        Duration duration = Duration.ofDays(0L);
        doReturn(duration).when(target).elapsed();
        thrown.expect(NullPointerException.class);
        //TODO: Needs initialization with real value
        Temporal temporal = null;

        //Act Statement(s)
        target.subtractFrom(temporal);

        //Assert statement(s)
        verify(target).elapsed();
    }
}
