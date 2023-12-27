package org.bitcoinj.script;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Ignore;

public class ScriptOpCodesSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${30d5902b-94ed-3293-b781-8d63e65c6e22}
    @Ignore()
    @Test()
    public void getOpCodeNameWhenOpCodeMapContainsKeyOpcode() {
        /* Branches:
         * (opCodeMap.containsKey(opcode)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        String result = ScriptOpCodes.getOpCodeName(1);

        //Assert statement(s)
        assertThat(result, equalTo("result1"));
    }

    //Sapient generated method id: ${2aa90f3b-f3a1-32db-9c54-b9d4fe395a83}
    @Test()
    public void getOpCodeNameWhenOpCodeMapNotContainsKeyOpcode() {
        /* Branches:
         * (opCodeMap.containsKey(opcode)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        String result = ScriptOpCodes.getOpCodeName(2);

        //Assert statement(s)
        assertThat(result, equalTo("NON_OP(2)"));
    }

    //Sapient generated method id: ${2085f4ca-53bf-3a20-bd24-b2d70ca47c0a}
    @Ignore()
    @Test()
    public void getPushDataNameWhenOpCodeMapContainsKeyOpcode() {
        /* Branches:
         * (opCodeMap.containsKey(opcode)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        String result = ScriptOpCodes.getPushDataName(1);

        //Assert statement(s)
        assertThat(result, equalTo("result1"));
    }

    //Sapient generated method id: ${85c350a7-2bb3-3cca-8669-ccbfa2236fd6}
    @Ignore()
    @Test()
    public void getPushDataNameWhenOpCodeMapNotContainsKeyOpcode() {
        /* Branches:
         * (opCodeMap.containsKey(opcode)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        String result = ScriptOpCodes.getPushDataName(2);

        //Assert statement(s)
        assertThat(result, equalTo("PUSHDATA(2)"));
    }

    //Sapient generated method id: ${98749a8d-84cf-3675-aca0-3f4fb869e089}
    @Test()
    public void getOpCodeWhenOpCodeNameMapContainsKeyOpCodeName() {
        /* Branches:
         * (opCodeNameMap.containsKey(opCodeName)) : true
         */

        //Act Statement(s)
        int result = ScriptOpCodes.getOpCode("NOP3");

        //Assert statement(s)
        assertThat(result, equalTo(178));
    }

    //Sapient generated method id: ${f3edb0c5-7f4d-37de-aff4-a880aaa93b92}
    @Test()
    public void getOpCodeWhenOpCodeNameMapNotContainsKeyOpCodeName() {
        /* Branches:
         * (opCodeNameMap.containsKey(opCodeName)) : false
         */

        //Act Statement(s)
        int result = ScriptOpCodes.getOpCode("B");

        //Assert statement(s)
        assertThat(result, equalTo(255));
    }
}
