package org.bitcoinj.utils;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.core.Context;
import org.mockito.MockedStatic;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
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
        try (MockedStatic<Context> context = mockStatic(Context.class)) {
            Context context2 = new Context();
            context.when(() -> Context.get()).thenReturn(context2);
            ContextPropagatingThreadFactory target = new ContextPropagatingThreadFactory("MyThread", 10);
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
