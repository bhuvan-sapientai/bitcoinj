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

    //Sapient generated method id: ${e036bddf-937a-3650-9e04-f9db4fc7f5f6}
    @Ignore()
    @Test()
    public void getWhenLastConstructedIsNullThrowsIllegalStateException() {
        /* Branches:
         * (tls == null) : true
         * (isStrictMode) : false
         * (lastConstructed == null) : true
         */
        //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("You must construct a Context object before using bitcoinj!");
        thrown.expect(IllegalStateException.class);
        thrown.expectMessage(illegalStateException.getMessage());

        //Act Statement(s)
        Context.get();
    }

    //Sapient generated method id: ${75314fee-fe7b-30a2-87e6-72443018f845}
    @Test()
    public void enableStrictModeTest() {

        //Act Statement(s)
        Context.enableStrictMode();
    }

    //Sapient generated method id: ${7ebba1ee-4173-3b5d-87a3-e5c7afab1a1f}
    @Test()
    public void getOrCreateTest() {
        //Arrange Statement(s)
        try (MockedStatic<Context> context = mockStatic(Context.class, CALLS_REAL_METHODS)) {
            context.when(() -> Context.get()).thenReturn(contextMock);
            //Act Statement(s)
            Context result = Context.getOrCreate();
            //Assert statement(s)
            assertThat(result, equalTo(contextMock));
            context.verify(() -> Context.get(), atLeast(1));
        }
    }

    //Sapient generated method id: ${0f5f9a71-516e-3093-8f88-8bf0d4c77f02}
    @Ignore()
    @Test()
    public void getOrCreateWhenCaughtIllegalStateException() {
        /* Branches:
         * (catch-exception (IllegalStateException)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Context> context = mockStatic(Context.class, CALLS_REAL_METHODS)) {
            IllegalStateException illegalStateException = new IllegalStateException();
            context.when(() -> Context.get()).thenThrow(illegalStateException);
            //Act Statement(s)
            Context result = Context.getOrCreate();
            Context context2 = new Context();
            //Assert statement(s)
            //TODO: Please implement equals method in Context for verification to succeed or you need to adjust respective assertion statements
            assertThat(result, equalTo(context2));
            context.verify(() -> Context.get(), atLeast(1));
        }
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
