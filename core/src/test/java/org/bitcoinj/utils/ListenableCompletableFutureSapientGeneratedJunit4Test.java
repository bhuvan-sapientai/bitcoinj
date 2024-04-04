package org.bitcoinj.utils;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Ignore;
import org.junit.Test;
import org.bitcoinj.base.internal.FutureUtils;
import org.mockito.MockedStatic;

import java.util.concurrent.CompletableFuture;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

public class ListenableCompletableFutureSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${0af4f151-a206-3e1e-99f2-c51543cfcb15}, hash: F81AF5AA26EA7CAC6408F4BC49B27144
    @Ignore(value = "Potential harmful system call (ListenableCompletableFuture.complete) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void completedFutureTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (ListenableCompletableFuture.complete) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();

        //Act Statement(s)
        ListenableCompletableFuture result = ListenableCompletableFuture.completedFuture(object);

        //Assert statement(s)
        //TODO: Please implement equals method in ListenableCompletableFuture for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${7b6d3857-4849-3516-91fa-a7394d7a23c0}, hash: 6B3A50E74527F54DAE177E949F62C838
    @Test()
    public void failedFutureTest() {
        //Arrange Statement(s)
        ListenableCompletableFuture listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);
        try (MockedStatic<ListenableCompletableFuture> listenableCompletableFuture = mockStatic(ListenableCompletableFuture.class, CALLS_REAL_METHODS);
             MockedStatic<FutureUtils> futureUtils = mockStatic(FutureUtils.class)) {
            CompletableFuture completableFuture = new CompletableFuture();
            Throwable throwable = new Throwable();
            futureUtils.when(() -> FutureUtils.failedFuture(throwable)).thenReturn(completableFuture);
            listenableCompletableFuture.when(() -> ListenableCompletableFuture.of(completableFuture)).thenReturn(listenableCompletableFutureMock);
            //Act Statement(s)
            ListenableCompletableFuture result = ListenableCompletableFuture.failedFuture(throwable);
            //Assert statement(s)
            assertThat(result, equalTo(listenableCompletableFutureMock));
            futureUtils.verify(() -> FutureUtils.failedFuture(throwable), atLeast(1));
            listenableCompletableFuture.verify(() -> ListenableCompletableFuture.of(completableFuture), atLeast(1));
        }
    }

    //Sapient generated method id: ${9594db61-8963-3141-b97a-d932414a39db}, hash: C4F0D8B244596FA8F897E6458B9EC2AD
    @Test()
    public void ofWhenFutureInstanceOfListenableCompletableFuture() {
        /* Branches:
         * (future instanceof ListenableCompletableFuture) : true
         */
        //Arrange Statement(s)
        ListenableCompletableFuture<Object> listenableCompletableFutureMock = mock(ListenableCompletableFuture.class);

        //Act Statement(s)
        ListenableCompletableFuture result = ListenableCompletableFuture.of(listenableCompletableFutureMock);

        //Assert statement(s)
        assertThat(result, equalTo(listenableCompletableFutureMock));
    }

    //Sapient generated method id: ${35a4cd9d-f207-3e44-ba1a-909ba8fe1555}, hash: 4334940B8BB2A874F6FE7CD44535A869
    @Ignore(value = "Potential harmful system call (CompletableFuture.whenComplete) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void ofWhenFutureNotInstanceOfListenableCompletableFuture() {
        /* Branches:
         * (future instanceof ListenableCompletableFuture) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (CompletableFuture.whenComplete) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        CompletableFuture<Object> completableFuture = new CompletableFuture<>();

        //Act Statement(s)
        ListenableCompletableFuture result = ListenableCompletableFuture.of(completableFuture);

        //Assert statement(s)
        //TODO: Please implement equals method in ListenableCompletableFuture for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }
}
