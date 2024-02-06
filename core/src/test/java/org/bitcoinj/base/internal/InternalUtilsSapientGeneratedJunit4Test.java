package org.bitcoinj.base.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.Ignore;

import java.util.concurrent.ExecutionException;

import org.junit.rules.ExpectedException;

import java.util.concurrent.Future;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.is;

public class InternalUtilsSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${abb80eac-c61c-3008-8fe8-b9821f89b953}
    @Test()
    public void joinerTest() {

        //Act Statement(s)
        InternalUtils.Joiner result = InternalUtils.joiner(" ");

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${6236fe84-81c2-3f91-8913-2139fbdb401a}
    @Test()
    public void splitterTest() {

        //Act Statement(s)
        InternalUtils.Splitter result = InternalUtils.splitter("\\s+");

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${b7e6f87d-48be-3a82-928e-72b874eeef4d}
    @Test()
    public void commaJoinTest() {
        //Arrange Statement(s)
        String[] stringArray = new String[]{};

        //Act Statement(s)
        String result = InternalUtils.commaJoin(stringArray);

        //Assert statement(s)
        assertThat(result, equalTo(""));
    }

    //Sapient generated method id: ${1fe4e064-512b-388e-988b-9eae0e617966}
    @Ignore(value = "Potential harmful system call (Future.get) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void getUninterruptiblyWhenNotInterrupted() throws ExecutionException, InterruptedException {
        /* Branches:
         * (interrupted) : false
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Future future = null;

        //Act Statement(s)
        Object result = InternalUtils.getUninterruptibly(future);
        Object object = new Object();

        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
        assertThat(result, equalTo(object));
    }

    //Sapient generated method id: ${a67de9d2-5d40-3245-aa13-b71d01084a76}
    @Ignore(value = "Potential harmful system call (Future.get, Thread.interrupt) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void getUninterruptiblyWhenInterruptedThrowsThrowable() throws ExecutionException {
        /* Branches:
         * (catch-exception (InterruptedException)) : true
         * (interrupted) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        thrown.expect(Throwable.class);
        //TODO: Needs initialization with real value
        Future future = null;

        //Act Statement(s)
        InternalUtils.getUninterruptibly(future);
    }
}
