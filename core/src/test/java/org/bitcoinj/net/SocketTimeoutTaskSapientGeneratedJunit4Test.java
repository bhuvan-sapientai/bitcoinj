package org.bitcoinj.net;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.time.Duration;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.spy;

public class SocketTimeoutTaskSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${77b314ea-b21c-37bc-b6dc-bf233ba77742}
    @Test()
    public void setTimeoutEnabledTest() {
        //Arrange Statement(s)
        SocketTimeoutTask target = spy(new SocketTimeoutTask((Runnable) null));
        doNothing().when(target).resetTimeout();

        //Act Statement(s)
        target.setTimeoutEnabled(true);

        //Assert statement(s)
        verify(target).resetTimeout();
    }

    //Sapient generated method id: ${a7313250-fdfb-332b-ae42-053f6e853110}
    @Test()
    public void setSocketTimeoutTest() {
        //Arrange Statement(s)
        SocketTimeoutTask target = spy(new SocketTimeoutTask((Runnable) null));
        doNothing().when(target).resetTimeout();
        Duration duration = Duration.ofDays(0L);

        //Act Statement(s)
        target.setSocketTimeout(duration);

        //Assert statement(s)
        verify(target).resetTimeout();
    }

    //Sapient generated method id: ${b3fc7963-d98c-3067-aa03-4073444d06f1}
    @Test()
    public void resetTimeoutWhenTimeoutIsZero() {
        /* Branches:
         * (timeoutTask != null) : false
         * (timeout.isZero()) : true
         */
        //Arrange Statement(s)
        SocketTimeoutTask target = new SocketTimeoutTask((Runnable) null);

        //Act Statement(s)
        target.resetTimeout();
    }
}
