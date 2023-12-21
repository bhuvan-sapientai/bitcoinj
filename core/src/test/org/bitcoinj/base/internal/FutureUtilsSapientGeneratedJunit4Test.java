package org.bitcoinj.base.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.rules.ExpectedException;

import java.util.List;
import java.util.function.IntFunction;
import java.util.concurrent.CompletionStage;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.is;

public class FutureUtilsSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${33a97d4c-0fd8-33da-ab65-fa4a8e25a2ec}
    @Test()
    public void allAsListTest() {
        //Arrange Statement(s)
        thrown.expect(NullPointerException.class);
        List<CompletionStage<Object>> anyList = new ArrayList<>();
        anyList.add((CompletionStage) null);

        //Act Statement(s)
        FutureUtils.allAsList(anyList);
    }

    //Sapient generated method id: ${9e2f111f-9abd-3b28-a20a-678cdc496bfe}
    @Test()
    public void successfulAsListTest() {
        //Arrange Statement(s)
        thrown.expect(NullPointerException.class);
        List<CompletionStage<Object>> anyList = new ArrayList<>();
        anyList.add((CompletionStage) null);

        //Act Statement(s)
        FutureUtils.successfulAsList(anyList);
    }

    //Sapient generated method id: ${7b6d3857-4849-3516-91fa-a7394d7a23c0}
    @Ignore(value = "Potential harmful system call (CompletableFuture.completeExceptionally) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void failedFutureTest() {
        //Arrange Statement(s)
        Throwable throwable = new Throwable();

        //Act Statement(s)
        CompletableFuture result = FutureUtils.failedFuture(throwable);
        CompletableFuture<Object> completableFuture = new CompletableFuture<>();

        //Assert statement(s)
        //TODO: Please implement equals method in CompletableFuture for verification to succeed or you need to adjust respective assertion statements
        assertThat(result, equalTo(completableFuture));
    }

    //Sapient generated method id: ${4eced493-4c1c-39bc-8d4c-2475c19eb72e}
    @Test()
    public void genericArrayTest() {
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        IntFunction intFunction = null;

        //Act Statement(s)
        IntFunction<IntFunction[]> result = FutureUtils.genericArray(intFunction);

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }
}
