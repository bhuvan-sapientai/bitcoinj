package org.bitcoinj.script;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Ignore;

public class ScriptErrorSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${02f68c12-5a0e-3dca-af97-5694b8b4e8da}
    @Test()
    public void fromMnemonicWhenErrIsNullThrowsIllegalArgumentException() {
        /* Branches:
         * (err == null) : true
         */
        //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("<valid mnemonic> is not a valid name");
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(illegalArgumentException.getMessage());

        //Act Statement(s)
        ScriptError.fromMnemonic("<valid mnemonic>");
    }

    //Sapient generated method id: ${1917e9f8-0714-38f6-afb9-d52c8973b4ef}
    @Ignore()
    @Test()
    public void fromMnemonicWhenErrIsNotNull() {
        /* Branches:
         * (err == null) : false
         */

        //Act Statement(s)
        ScriptError result = ScriptError.fromMnemonic("OK");

        //Assert statement(s)
        assertThat(result, equalTo(ScriptError.SCRIPT_ERR_OK));
    }
}
