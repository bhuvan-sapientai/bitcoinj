package org.bitcoinj.base;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.mockito.MockedStatic;

import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

public class ScriptTypeSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${7e0a4b56-52c1-313d-ae3a-e4995514865b}
    @Test()
    public void findWhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 77)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ScriptType> scriptType = mockStatic(ScriptType.class, CALLS_REAL_METHODS)) {
            ScriptType[] scriptTypeArray = new ScriptType[]{ScriptType.P2PKH, ScriptType.P2PK, ScriptType.P2SH, ScriptType.P2WPKH, ScriptType.P2WSH, ScriptType.P2TR};
            scriptType.when(() -> ScriptType.values()).thenReturn(scriptTypeArray);
            //Act Statement(s)
            Optional<ScriptType> result = ScriptType.find("pkh");
            Optional<ScriptType> scriptTypeOptional = Optional.of(ScriptType.P2PKH);
            //Assert statement(s)
            assertThat(result, equalTo(scriptTypeOptional));
            scriptType.verify(() -> ScriptType.values(), atLeast(1));
        }
    }
}
