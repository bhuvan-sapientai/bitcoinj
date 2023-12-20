package org.bitcoinj.base;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

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
}
