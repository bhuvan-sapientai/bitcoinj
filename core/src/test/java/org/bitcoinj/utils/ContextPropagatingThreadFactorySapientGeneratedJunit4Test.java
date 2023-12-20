package org.bitcoinj.utils;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.core.Context;
import org.mockito.MockedStatic;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

public class ContextPropagatingThreadFactorySapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${581615ec-fb96-3fea-b947-52c6c3049d90}
    @Test()
    public void newThreadWhenHandlerIsNotNull() {
        /* Branches:
         * (handler != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Context contextMock = mock(Context.class);
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            context.when(() -> Context.get()).thenReturn(contextMock);
            ContextPropagatingThreadFactory target = new ContextPropagatingThreadFactory("name1", 0);
            //TODO: Needs initialization with real value
            Runnable runnable = null;
            //Act Statement(s)
            Thread result = target.newThread(runnable);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            context.verify(() -> Context.get(), atLeast(1));
        }
    }
}
