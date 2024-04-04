package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.MockedStatic;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class ContextSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Context contextMock = mock(Context.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${e036bddf-937a-3650-9e04-f9db4fc7f5f6}, hash: 396B569A60632D36D6A2C8041A340F67
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

    //Sapient generated method id: ${75314fee-fe7b-30a2-87e6-72443018f845}, hash: 1611C92BB33FF7A3689DD29E1A30AC65
    @Test()
    public void enableStrictModeTest() {
        //Act Statement(s)
        Context.enableStrictMode();
    }

    //Sapient generated method id: ${7ebba1ee-4173-3b5d-87a3-e5c7afab1a1f}, hash: 8C53030BE3BB6D8E9918F822BED83B8B
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

    //Sapient generated method id: ${0f5f9a71-516e-3093-8f88-8bf0d4c77f02}, hash: A334BE284918185095825F843422B392
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
            //Assert statement(s)
            //TODO: Please implement equals method in Context for verification of the entire object or you need to adjust respective assertion statements
            assertThat(result, is(notNullValue()));
            context.verify(() -> Context.get(), atLeast(1));
        }
    }

    //Sapient generated method id: ${5efa0cff-0919-3077-ab23-22ccdc20b3b8}, hash: 323551EE8D8A999050ACBA05B3DFB900
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

    //Sapient generated method id: ${0d42f23a-6f1c-3106-a642-f13b9e1c45f3}, hash: DE1F4E400F2E3AB765BC54354D45BC6A
    @Test()
    public void propagateTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: slot
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Context.propagate(contextMock);
    }
}
