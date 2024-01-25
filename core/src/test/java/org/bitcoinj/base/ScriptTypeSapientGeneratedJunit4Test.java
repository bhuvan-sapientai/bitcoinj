package org.bitcoinj.base;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class ScriptTypeSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${2e242bfc-9175-3742-b63c-1cb781c17d38}
    @Test()
    public void ofWhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 77)) : true
         */
        //Act Statement(s)
        ScriptType result = ScriptType.of("pkh");
        //Assert statement(s)
        assertThat(result, equalTo(ScriptType.P2PKH));
    }

    //Sapient generated method id: ${7e0a4b56-52c1-313d-ae3a-e4995514865b}
    @Test()
    public void findWhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 77)) : true
         */
        //Act Statement(s)
        Optional<ScriptType> result = ScriptType.find("pkh");
        Optional<ScriptType> scriptTypeOptional = Optional.of(ScriptType.P2PKH);
        //Assert statement(s)
        assertThat(result, equalTo(scriptTypeOptional));
    }

    //Sapient generated method id: ${d8f9d8d4-318b-3adc-81df-199235eeefbb}
    @Ignore()
    @Test()
    public void idTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ScriptType target = ScriptType.valueOf("pkh");
        //Act Statement(s)
        String result = target.id();
        //Assert statement(s)
        assertThat(result, is(nullValue()));
    }

    //Sapient generated method id: ${e0901684-2fd9-3ad9-b643-28dff52ade90}
    @Ignore()
    @Test()
    public void numericIdTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ScriptType target = ScriptType.valueOf("P2PKH");
        //Act Statement(s)
        int result = target.numericId();
        //Assert statement(s)
        assertThat(result, equalTo(0));
    }
}
