package org.bitcoinj.base.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import java.util.function.IntFunction;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;

public class FutureUtilsSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final CompletionStage completionStageMock = mock(CompletionStage.class);

    //Sapient generated method id: ${33a97d4c-0fd8-33da-ab65-fa4a8e25a2ec}
    @Ignore(value = "Potential harmful system call (CompletableFuture.thenApply) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void allAsListTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<CompletionStage<Object>> anyList = new ArrayList<>();
        anyList.add(completionStageMock);

        //Act Statement(s)
        CompletableFuture<List<Object>> result = FutureUtils.allAsList(anyList);

        //Assert statement(s)
        //TODO: Please implement equals method in CompletableFuture for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${9e2f111f-9abd-3b28-a20a-678cdc496bfe}
    @Ignore(value = "Potential harmful system call (CompletableFuture.thenApply) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void successfulAsListTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<CompletionStage<Object>> anyList = new ArrayList<>();
        anyList.add(completionStageMock);

        //Act Statement(s)
        CompletableFuture<List<Object>> result = FutureUtils.successfulAsList(anyList);

        //Assert statement(s)
        //TODO: Please implement equals method in CompletableFuture for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${7b6d3857-4849-3516-91fa-a7394d7a23c0}
    @Ignore(value = "Potential harmful system call (CompletableFuture.completeExceptionally) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void failedFutureTest() {
        //Arrange Statement(s)
        Throwable throwable = new Throwable();

        //Act Statement(s)
        CompletableFuture result = FutureUtils.failedFuture(throwable);

        //Assert statement(s)
        //TODO: Please implement equals method in CompletableFuture for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${4eced493-4c1c-39bc-8d4c-2475c19eb72e}
    @Test()
    public void genericArrayTest() {
        //Arrange Statement(s)
        IntFunction intFunctionMock = mock(IntFunction.class);

        //Act Statement(s)
        IntFunction<IntFunction[]> result = FutureUtils.genericArray(intFunctionMock);

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }
}
