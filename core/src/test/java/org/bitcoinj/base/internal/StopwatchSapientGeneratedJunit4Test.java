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

    //Sapient generated method id: ${a9331398-240e-36aa-9522-b3dc4bcf14ad}
    @Test()
    public void startTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Stopwatch result = Stopwatch.start();
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${8b691c45-8849-3865-a710-9f1938dc8fe1}
    @Test()
    public void stopWhenIsRunning() {
        /* Branches:
         * (isRunning()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Stopwatch target = spy(Stopwatch.start());
        doReturn(true).when(target).isRunning();
        //Act Statement(s)
        Stopwatch result = target.stop();
        //Assert statement(s)
        assertThat(result, equalTo(target));
        verify(target).isRunning();
    }

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

    //Sapient generated method id: ${e2f476bb-c28c-39a7-9a72-0b234e1920b6}
    @Ignore()
    @Test()
    public void elapsedWhenIsRunning() {
        /* Branches:
         * (isRunning()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Stopwatch target = spy(Stopwatch.start());
        doReturn(true).when(target).isRunning();
        //Act Statement(s)
        Duration result = target.elapsed();
        Duration duration = Duration.ofDays(0L);
        //Assert statement(s)
        assertThat(result, equalTo(duration));
        verify(target).isRunning();
    }

    //Sapient generated method id: ${458ce76a-62e3-30e0-bfd8-695a48193e46}
    @Ignore()
    @Test()
    public void elapsedWhenIsRunningNot() {
        /* Branches:
         * (isRunning()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Stopwatch target = spy(Stopwatch.start());
        doReturn(false).when(target).isRunning();
        //Act Statement(s)
        Duration result = target.elapsed();
        Duration duration = Duration.ofDays(0L);
        //Assert statement(s)
        assertThat(result, equalTo(duration));
        verify(target).isRunning();
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
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Stopwatch target = spy(Stopwatch.start());
            Duration duration = Duration.ofDays(0L);
            doReturn(duration).when(target).elapsed();
            //TODO: Needs initialization with real value
            TemporalUnit temporalUnit = null;
            //Act Statement(s)
            long result = target.get(temporalUnit);
            //Assert statement(s)
            assertThat(result, equalTo(0L));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            verify(target).elapsed();
        }
    }

    //Sapient generated method id: ${77dd7c1d-eacf-3f7b-8351-0eb312695635}
    @Test()
    public void getUnitsTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Stopwatch target = Stopwatch.start();
        //Act Statement(s)
        List<TemporalUnit> result = target.getUnits();
        List<TemporalUnit> temporalUnitResultList = new ArrayList<>(Arrays.asList(ChronoUnit.MILLIS));
        //Assert statement(s)
        assertThat(result.size(), equalTo(temporalUnitResultList.size()));
        //TODO: Please implement equals method in Collection for verification to succeed or you need to adjust respective assertion statements
        assertThat(result, containsInRelativeOrder(temporalUnitResultList.toArray()));
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
        //TODO: Needs initialization with real value
        Temporal temporal = null;
        //Act Statement(s)
        Temporal result = target.subtractFrom(temporal);
        //Assert statement(s)
        assertThat(result, is(nullValue()));
        verify(target).elapsed();
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
        Stopwatch target = spy(Stopwatch.start());
        Duration duration = Duration.ofDays(0L);
        doReturn(duration).when(target).elapsed();
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("2 ms"));
        verify(target).elapsed();
    }
}
