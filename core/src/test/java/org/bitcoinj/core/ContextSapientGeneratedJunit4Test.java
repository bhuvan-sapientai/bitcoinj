package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.MockedStatic;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

public class ContextSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Context contextMock = mock(Context.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${75314fee-fe7b-30a2-87e6-72443018f845}
    @Test()
    public void enableStrictModeTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        Context.enableStrictMode();
    }

    //Sapient generated method id: ${5efa0cff-0919-3077-ab23-22ccdc20b3b8}
    @Test()
    public void getOrCreate1Test() {
        //Arrange Statement(s)
        NetworkParameters networkParametersMock = mock(NetworkParameters.class);
        try (MockedStatic<Context> context = mockStatic(Context.class, CALLS_REAL_METHODS)) {
            context.when(() -> Context.getOrCreate()).thenReturn(contextMock);
            //Act Statement(s)
            Context result = Context.getOrCreate(networkParametersMock);
            //Assert statement(s)
            assertThat(result, equalTo(contextMock));
            context.verify(() -> Context.getOrCreate(), atLeast(1));
        }
    }

    //Sapient generated method id: ${0d42f23a-6f1c-3106-a642-f13b9e1c45f3}
    @Test()
    public void propagateTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        Context.propagate(contextMock);
    }
}
