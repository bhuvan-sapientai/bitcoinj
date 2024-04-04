package org.bitcoinj.utils;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class ContextPropagatingThreadFactorySapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${581615ec-fb96-3fea-b947-52c6c3049d90}, hash: E8A0988F2DBE1A0BE89E2B8D4D57E82B
    @Ignore()
    @Test()
    public void newThreadWhenHandlerIsNotNull() {
        /* Branches:
         * (handler != null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: thread
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ContextPropagatingThreadFactory target = new ContextPropagatingThreadFactory("name1", 1);
        Runnable runnableMock = mock(Runnable.class);
        //Act Statement(s)
        Thread result = target.newThread(runnableMock);
        //Assert statement(s)
        //TODO: Please implement equals method in Thread for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }
}
