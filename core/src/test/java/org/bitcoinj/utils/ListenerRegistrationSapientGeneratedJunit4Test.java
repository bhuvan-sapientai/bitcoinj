package org.bitcoinj.utils;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.mock;

import org.junit.Ignore;

public class ListenerRegistrationSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${6e6e00e4-4c77-3886-a8b5-2711d0dd31a1}, hash: 1C7F2AD8116C5D64352F9A6602B53B68
    @Ignore()
    @Test()
    public void removeFromListWhenRListenerEqualsListener() {
        /* Branches:
         * (r.listener == listener) : true  #  inside lambda$removeFromList$0 method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        List<ListenerRegistration<Object>> anyList = new ArrayList<>();
        //Act Statement(s)
        boolean result = ListenerRegistration.removeFromList(object, anyList);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        assertThat(anyList.size(), equalTo(0));
    }

    //Sapient generated method id: ${469cd85c-3ae7-33de-9206-c5c253c2a4a2}, hash: 0973386FFCB6569C297F30B0CFE6E00B
    @Test()
    public void removeFromListWhenRListenerNotEqualsListener() {
        /* Branches:
         * (r.listener == listener) : false  #  inside lambda$removeFromList$0 method
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Executor executorMock = mock(Executor.class);
        ListenerRegistration listenerRegistration = new ListenerRegistration(object2, executorMock);
        List<ListenerRegistration<Object>> anyList = new ArrayList<>();
        anyList.add(listenerRegistration);
        //Act Statement(s)
        boolean result = ListenerRegistration.removeFromList(object, anyList);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }
}
