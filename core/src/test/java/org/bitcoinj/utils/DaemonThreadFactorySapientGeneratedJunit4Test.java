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

    //Sapient generated method id: ${c9c9f9bd-5803-3ebe-a7ea-facc30c0b334}, hash: E07AF2A2526C7673F10B638203507074
    @Test()
    public void newThreadWhenNameIsNotNull() {
        /* Branches:
         * (name != null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type ThreadFactory
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DaemonThreadFactory target = new DaemonThreadFactory("A");
        Runnable runnableMock = mock(Runnable.class);
        //Act Statement(s)
        Thread result = target.newThread(runnableMock);
        //Assert statement(s)
        //TODO: Please implement equals method in Thread for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }
}
