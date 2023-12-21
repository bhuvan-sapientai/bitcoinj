package org.bitcoinj.base.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Ignore;

public class PlatformUtilsSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${5e70c558-f70a-3753-8dac-4e5ca185902b}
    @Test()
    public void isAndroidRuntimeWhenRuntimeNotEqualsRuntimeANDROID() {
        /* Branches:
         * (runtime == Runtime.ANDROID) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = PlatformUtils.isAndroidRuntime();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${6e0d1141-ab92-38a6-a33b-6c0e2f4d19de}
    @Ignore()
    @Test()
    public void isOpenJDKRuntimeWhenRuntimeNotEqualsRuntimeOPENJDK() {
        /* Branches:
         * (runtime == Runtime.OPENJDK) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = PlatformUtils.isOpenJDKRuntime();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${fa96fdfd-e026-3f6a-bbfb-dd1bd7c5a7ee}
    @Test()
    public void isOracleJavaRuntimeWhenRuntimeNotEqualsRuntimeORACLE_JAVA() {
        /* Branches:
         * (runtime == Runtime.ORACLE_JAVA) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = PlatformUtils.isOracleJavaRuntime();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${ffae1a42-277e-3941-a13d-7e3f16e59dff}
    @Test()
    public void isLinuxWhenOsNotEqualsOSLINUX() {
        /* Branches:
         * (os == OS.LINUX) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = PlatformUtils.isLinux();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${8e674e8d-c4b9-3363-bbc3-a52d9b6e9076}
    @Test()
    public void isWindowsWhenOsNotEqualsOSWINDOWS() {
        /* Branches:
         * (os == OS.WINDOWS) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = PlatformUtils.isWindows();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${98684704-b526-398e-9af0-7d2e095ac9cd}
    @Ignore()
    @Test()
    public void isMacWhenOsNotEqualsOSMAC_OS() {
        /* Branches:
         * (os == OS.MAC_OS) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = PlatformUtils.isMac();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }
}
