package org.bitcoinj.base.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collector;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class StreamUtilsSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${6554c080-8d36-310b-b636-e7447d914541}
    @Ignore()
    @Test()
    public void toUnmodifiableListTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        Collector<Object, ?, List<Object>> result = StreamUtils.toUnmodifiableList();

        //Assert statement(s)
        assertThat(result, is(nullValue()));
    }
}
