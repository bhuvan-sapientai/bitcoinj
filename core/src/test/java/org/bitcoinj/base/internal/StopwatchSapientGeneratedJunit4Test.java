package org.bitcoinj.base.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;
import java.time.Duration;

import org.mockito.MockedStatic;

import java.time.temporal.Temporal;
import java.time.Instant;

import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class StopwatchSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Temporal temporalMock = mock(Temporal.class);

    private final Temporal temporalMock2 = mock(Temporal.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${a9331398-240e-36aa-9522-b3dc4bcf14ad}, hash: CE4EF9D3CD59696DFAAD7F58D9773FB1
    @Test()
    public void startTest() {
        //Arrange Statement(s)
        try (MockedStatic<Instant> instant = mockStatic(Instant.class)) {
            Instant instant2 = Instant.ofEpochSecond(1700000000);
            instant.when(() -> Instant.now()).thenReturn(instant2);
            //Act Statement(s)
            Stopwatch result = Stopwatch.start();
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            instant.verify(() -> Instant.now(), atLeast(1));
        }
    }

    //Sapient generated method id: ${8b691c45-8849-3865-a710-9f1938dc8fe1}, hash: 61ACEE8784357D1175B03B2BD939AD8A
    @Test()
    public void stopWhenIsRunning() {
        /* Branches:
         * (isRunning()) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Instant> instant = mockStatic(Instant.class)) {
            Instant instant3 = Instant.ofEpochSecond(1700000000);
            Instant instant4 = Instant.ofEpochSecond(1700000000);
            instant.when(() -> Instant.now()).thenReturn(instant3).thenReturn(instant4);
            Stopwatch target = spy(Stopwatch.start());
            doReturn(true).when(target).isRunning();
            //Act Statement(s)
            Stopwatch result = target.stop();
            //Assert statement(s)
            assertThat(result, equalTo(target));
            instant.verify(() -> Instant.now(), atLeast(2));
            verify(target).isRunning();
        }
    }

    //Sapient generated method id: ${0ad2b469-3c49-34f9-8a63-6bb6b74df584}, hash: 2A322154865B04260D8F22BF62598721
    @Test()
    public void isRunningWhenStopTimeIsNull() {
        /* Branches:
         * (stopTime == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Instant> instant = mockStatic(Instant.class)) {
            Instant instant2 = Instant.ofEpochSecond(1700000000);
            instant.when(() -> Instant.now()).thenReturn(instant2);
            Stopwatch target = Stopwatch.start();
            //Act Statement(s)
            boolean result = target.isRunning();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            instant.verify(() -> Instant.now(), atLeast(1));
        }
    }

    //Sapient generated method id: ${e2f476bb-c28c-39a7-9a72-0b234e1920b6}, hash: BABE8E9CDE84A4AEFD19D45FBF7ADECB
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
        try (MockedStatic<Instant> instant = mockStatic(Instant.class)) {
            Instant instant3 = Instant.now();
            Instant instant4 = Instant.now();
            instant.when(() -> Instant.now()).thenReturn(instant3).thenReturn(instant4);
            Stopwatch target = spy(Stopwatch.start());
            doReturn(true).when(target).isRunning();
            //Act Statement(s)
            Duration result = target.elapsed();
            Duration duration = Duration.ofDays(0L);
            //Assert statement(s)
            assertThat(result, equalTo(duration));
            instant.verify(() -> Instant.now(), atLeast(2));
            verify(target).isRunning();
        }
    }

    //Sapient generated method id: ${458ce76a-62e3-30e0-bfd8-695a48193e46}, hash: 61D3194F5BDC9014DB8436D11034C67B
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
        try (MockedStatic<Instant> instant = mockStatic(Instant.class)) {
            Instant instant2 = Instant.now();
            instant.when(() -> Instant.now()).thenReturn(instant2);
            Stopwatch target = spy(Stopwatch.start());
            doReturn(false).when(target).isRunning();
            //Act Statement(s)
            Duration result = target.elapsed();
            Duration duration = Duration.ofDays(0L);
            //Assert statement(s)
            assertThat(result, equalTo(duration));
            instant.verify(() -> Instant.now(), atLeast(1));
            verify(target).isRunning();
        }
    }

    //Sapient generated method id: ${9c25887d-767d-38e9-b5ae-c2e4012c49be}, hash: 3E0FD9F65F8CAA36F3A6AD872038CA62
    @Test()
    public void getTest() {
        //Arrange Statement(s)
        Stopwatch target = Stopwatch.start();
        thrown.expect(IllegalArgumentException.class);
        TemporalUnit temporalUnitMock = mock(TemporalUnit.class);
        //Act Statement(s)
        target.get(temporalUnitMock);
    }

    //Sapient generated method id: ${77dd7c1d-eacf-3f7b-8351-0eb312695635}, hash: 21613933542E5A13CEA6DB70A05010B1
    @Test()
    public void getUnitsTest() {
        //Arrange Statement(s)
        try (MockedStatic<Instant> instant = mockStatic(Instant.class)) {
            Instant instant2 = Instant.ofEpochSecond(1700000000);
            instant.when(() -> Instant.now()).thenReturn(instant2);
            Stopwatch target = Stopwatch.start();
            //Act Statement(s)
            List<TemporalUnit> result = target.getUnits();
            //Assert statement(s)
            assertThat(result.size(), equalTo(1));
            assertThat(result.get(0), is(instanceOf(TemporalUnit.class)));
            instant.verify(() -> Instant.now(), atLeast(1));
        }
    }

    //Sapient generated method id: ${37fda9a0-27b1-39d9-844c-155c12172b76}, hash: 08750378A930A72DCDCBEA2AC0CE5258
    @Test()
    public void addToTest() {
        //Arrange Statement(s)
        doReturn(temporalMock2).when(temporalMock).plus((TemporalAmount) any());
        Stopwatch target = spy(Stopwatch.start());
        Duration duration = Duration.ofDays(0L);
        doReturn(duration).when(target).elapsed();
        //Act Statement(s)
        Temporal result = target.addTo(temporalMock);
        //Assert statement(s)
        assertThat(result, equalTo(temporalMock2));
        verify(temporalMock).plus((TemporalAmount) any());
        verify(target).elapsed();
    }

    //Sapient generated method id: ${5b4caf68-30d0-34d6-8e4d-e081a7ee3fdb}, hash: 7014B07542646AB2E02B19AE3AA44BCC
    @Test()
    public void subtractFromTest() {
        //Arrange Statement(s)
        doReturn(temporalMock2).when(temporalMock).minus((TemporalAmount) any());
        Stopwatch target = spy(Stopwatch.start());
        Duration duration = Duration.ofDays(0L);
        doReturn(duration).when(target).elapsed();
        //Act Statement(s)
        Temporal result = target.subtractFrom(temporalMock);
        //Assert statement(s)
        assertThat(result, equalTo(temporalMock2));
        verify(temporalMock).minus((TemporalAmount) any());
        verify(target).elapsed();
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: 9E071BA9BD4D2F332F4C4064DEC1930D
    @Ignore()
    @Test()
    public void toStringTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Instant> instant = mockStatic(Instant.class)) {
            Instant instant2 = Instant.ofEpochSecond(1700000000);
            instant.when(() -> Instant.now()).thenReturn(instant2);
            Stopwatch target = spy(Stopwatch.start());
            Duration duration = Duration.ofDays(0L);
            doReturn(duration).when(target).elapsed();
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("2 ms"));
            instant.verify(() -> Instant.now(), atLeast(1));
            verify(target).elapsed();
        }
    }
}
