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
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;

public class ListenableCompletableFutureSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${0af4f151-a206-3e1e-99f2-c51543cfcb15}
    @Ignore(value = "Potential harmful system call (ListenableCompletableFuture.complete) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void completedFutureTest() {
        //Arrange Statement(s)
        Object object = new Object();

        //Act Statement(s)
        ListenableCompletableFuture result = ListenableCompletableFuture.completedFuture(object);
        ListenableCompletableFuture<Object> listenableCompletableFuture = new ListenableCompletableFuture<>();

        //Assert statement(s)
        //TODO: Please implement equals method in ListenableCompletableFuture for verification to succeed or you need to adjust respective assertion statements
        assertThat(result, equalTo(listenableCompletableFuture));
    }

    //Sapient generated method id: ${7b6d3857-4849-3516-91fa-a7394d7a23c0}
    @Test()
    public void failedFutureTest() {
        //Arrange Statement(s)
        try (MockedStatic<ListenableCompletableFuture> listenableCompletableFuture = mockStatic(ListenableCompletableFuture.class, CALLS_REAL_METHODS);
             MockedStatic<FutureUtils> futureUtils = mockStatic(FutureUtils.class)) {
            CompletableFuture completableFuture = new CompletableFuture();
            StackTraceElement stackTraceElement = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
            StackTraceElement stackTraceElement2 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
            StackTraceElement stackTraceElement3 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
            StackTraceElement stackTraceElement4 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
            StackTraceElement stackTraceElement5 = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
            StackTraceElement[] stackTraceElementArray = new StackTraceElement[]{stackTraceElement, stackTraceElement2, stackTraceElement3, stackTraceElement4, stackTraceElement5};
            Throwable throwable = new Throwable();
            throwable.setStackTrace(stackTraceElementArray);
            futureUtils.when(() -> FutureUtils.failedFuture(throwable)).thenReturn(completableFuture);
            ListenableCompletableFuture listenableCompletableFuture2 = new ListenableCompletableFuture();
            listenableCompletableFuture.when(() -> ListenableCompletableFuture.of(completableFuture)).thenReturn(listenableCompletableFuture2);
            //Act Statement(s)
            ListenableCompletableFuture result = ListenableCompletableFuture.failedFuture(throwable);
            //Assert statement(s)
            assertThat(result, equalTo(listenableCompletableFuture2));
            futureUtils.verify(() -> FutureUtils.failedFuture(throwable), atLeast(1));
            listenableCompletableFuture.verify(() -> ListenableCompletableFuture.of(completableFuture), atLeast(1));
        }
    }

    //Sapient generated method id: ${9594db61-8963-3141-b97a-d932414a39db}
    @Test()
    public void ofWhenFutureInstanceOfListenableCompletableFuture() {
        /* Branches:
         * (future instanceof ListenableCompletableFuture) : true
         */
        //Arrange Statement(s)
        ListenableCompletableFuture<Object> listenableCompletableFuture = new ListenableCompletableFuture<>();

        //Act Statement(s)
        ListenableCompletableFuture result = ListenableCompletableFuture.of(listenableCompletableFuture);

        //Assert statement(s)
        assertThat(result, equalTo(listenableCompletableFuture));
    }

    //Sapient generated method id: ${35a4cd9d-f207-3e44-ba1a-909ba8fe1555}
    @Ignore(value = "Potential harmful system call (CompletableFuture.whenComplete) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void ofWhenFutureNotInstanceOfListenableCompletableFuture() {
        /* Branches:
         * (future instanceof ListenableCompletableFuture) : false
         */
        //Arrange Statement(s)
        CompletableFuture<Object> completableFuture = new CompletableFuture<>();

        //Act Statement(s)
        ListenableCompletableFuture result = ListenableCompletableFuture.of(completableFuture);
        ListenableCompletableFuture<Object> listenableCompletableFuture = new ListenableCompletableFuture<>();

        //Assert statement(s)
        //TODO: Please implement equals method in ListenableCompletableFuture for verification to succeed or you need to adjust respective assertion statements
        assertThat(result, equalTo(listenableCompletableFuture));
    }
}
