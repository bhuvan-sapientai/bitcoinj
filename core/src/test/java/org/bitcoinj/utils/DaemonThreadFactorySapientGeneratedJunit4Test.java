package org.bitcoinj.utils;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;

public class DaemonThreadFactorySapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${c9c9f9bd-5803-3ebe-a7ea-facc30c0b334}
    @Test()
    public void newThreadWhenNameIsNotNull() {
        /* Branches:
         * (name != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DaemonThreadFactory target = new DaemonThreadFactory("valid_value");
        Runnable runnableMock = mock(Runnable.class, "valid_value");

        //Act Statement(s)
        Thread result = target.newThread(runnableMock);

        //Assert statement(s)
        //TODO: Please implement equals method in Thread for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }
}
