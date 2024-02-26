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
import static org.mockito.Mockito.doThrow;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;

public class InternalUtilsSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Future futureMock = mock(Future.class);

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

        //Act Statement(s)
        Object result = InternalUtils.getUninterruptibly(futureMock);

        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${a67de9d2-5d40-3245-aa13-b71d01084a76}
    @Ignore(value = "Potential harmful system call (Future.get, Thread.interrupt) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    public void getUninterruptiblyWhenInterruptedThrowsThrowable() throws ExecutionException, InterruptedException {
        /* Branches:
         * (catch-exception (InterruptedException)) : true
         * (interrupted) : true
         */
        //Arrange Statement(s)
        InterruptedException interruptedException = new InterruptedException();
        doThrow(interruptedException).when(futureMock).get();
        Object object = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        Object object4 = new Object();
        Object object5 = new Object();
        Object object6 = new Object();
        Object object7 = new Object();
        Object object8 = new Object();
        Object object9 = new Object();
        Object object10 = new Object();
        Object object11 = new Object();
        Object object12 = new Object();
        Object object13 = new Object();
        Object object14 = new Object();
        Object object15 = new Object();
        Object object16 = new Object();
        Object object17 = new Object();
        Object object18 = new Object();
        Object object19 = new Object();
        Object object20 = new Object();
        Object object21 = new Object();
        Object object22 = new Object();
        Object object23 = new Object();
        Object object24 = new Object();
        Object object25 = new Object();
        Object object26 = new Object();
        Object object27 = new Object();
        Object object28 = new Object();
        Object object29 = new Object();
        Object object30 = new Object();
        Object object31 = new Object();
        Object object32 = new Object();
        Object object33 = new Object();
        Object object34 = new Object();
        Object object35 = new Object();
        Object object36 = new Object();
        Object object37 = new Object();
        Object object38 = new Object();
        Object object39 = new Object();
        Object object40 = new Object();
        Object object41 = new Object();
        Object object42 = new Object();
        Object object43 = new Object();
        Object object44 = new Object();
        Object object45 = new Object();
        Object object46 = new Object();
        Object object47 = new Object();
        Object object48 = new Object();
        Object object49 = new Object();
        Object object50 = new Object();
        Object object51 = new Object();
        Object object52 = new Object();
        Object object53 = new Object();
        Object object54 = new Object();
        Object object55 = new Object();
        Object object56 = new Object();
        Object object57 = new Object();
        Object object58 = new Object();
        Object object59 = new Object();
        Object object60 = new Object();
        Object object61 = new Object();
        Object object62 = new Object();
        Object object63 = new Object();
        Object object64 = new Object();
        Object object65 = new Object();
        Object object66 = new Object();
        Object object67 = new Object();
        Object object68 = new Object();
        Object object69 = new Object();
        Object object70 = new Object();
        Object object71 = new Object();
        Object object72 = new Object();
        Object object73 = new Object();
        Object object74 = new Object();
        Object object75 = new Object();
        Object object76 = new Object();
        Object object77 = new Object();
        Object object78 = new Object();
        Object object79 = new Object();
        Object object80 = new Object();
        Object object81 = new Object();
        Object object82 = new Object();
        Object object83 = new Object();
        Object object84 = new Object();
        Object object85 = new Object();
        Object object86 = new Object();
        Object object87 = new Object();
        Object object88 = new Object();
        Object object89 = new Object();
        Object object90 = new Object();
        Object object91 = new Object();
        Object object92 = new Object();
        Object object93 = new Object();
        Object object94 = new Object();
        Object object95 = new Object();
        Object object96 = new Object();
        Object object97 = new Object();
        Object object98 = new Object();
        Object object99 = new Object();
        Object object100 = new Object();
        doReturn(interruptedException, object, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, object17, object18, object19, object20, object21, object22, object23, object24, object25, object26, object27, object28, object29, object30, object31, object32, object33, object34, object35, object36, object37, object38, object39, object40, object41, object42, object43, object44, object45, object46, object47, object48, object49, object50, object51, object52, object53, object54, object55, object56, object57, object58, object59, object60, object61, object62, object63, object64, object65, object66, object67, object68, object69, object70, object71, object72, object73, object74, object75, object76, object77, object78, object79, object80, object81, object82, object83, object84, object85, object86, object87, object88, object89, object90, object91, object92, object93, object94, object95, object96, object97, object98, object99, object100).when(futureMock).get();
        thrown.expect(Throwable.class);

        //Act Statement(s)
        InternalUtils.getUninterruptibly(futureMock);

        //Assert statement(s)
        verify(futureMock, times(101)).get();
    }
}
