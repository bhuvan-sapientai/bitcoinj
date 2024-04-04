package org.bitcoinj.base.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.stubbing.Answer;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;

public class PreconditionsSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Supplier supplierMock = mock(Supplier.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${2ead23af-5259-31e8-8a5e-7c2f88d02218}, hash: AE6873EC04D3201B3B599BEFB4851FED
    @Test()
    public void checkArgumentTest() {
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.check(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            Preconditions.checkArgument(false);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.check(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${d4b3af31-e399-3bd7-9e52-b3d7961c6890}, hash: 551DCD1F00EA59E5E4B03580725F1255
    @Test()
    public void checkArgument1Test() {
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.check(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            Preconditions.checkArgument(false, supplierMock);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.check(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${aeb415f5-6ced-3024-84b1-2c94b049cab0}, hash: 6947B3C64255C8031E6255209695879E
    @Test()
    public void checkStateTest() {
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.check(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            Preconditions.checkState(false);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.check(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${41b1270c-6fd2-3399-b508-a0ee60fbca09}, hash: D70B4C774D8DD89E0528D1C615012E5F
    @Test()
    public void checkState1Test() {
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.check(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            Preconditions.checkState(false, supplierMock);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.check(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${348a338f-59f9-3400-8dd3-e26b2666f6c7}, hash: 74BCC8583D110412826B1AE331B75247
    @Test()
    public void checkWhenNotExpressionThrowsThrowable() throws Throwable {
        /* Branches:
         * (!expression) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        thrown.expect(Throwable.class);
        //Act Statement(s)
        Preconditions.check(false, supplierMock);
    }

    //Sapient generated method id: ${f3f17171-7bcc-3d21-a21d-8b48f084c96d}, hash: 0F8A9ED90720780AF55B84C4F94C716A
    @Test()
    public void checkWhenExpression() throws Throwable {
        /* Branches:
         * (!expression) : false
         */
        //Act Statement(s)
        Preconditions.check(true, supplierMock);
    }
}
