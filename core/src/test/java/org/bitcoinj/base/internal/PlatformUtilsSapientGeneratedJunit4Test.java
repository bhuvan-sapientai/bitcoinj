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

    //Sapient generated method id: ${5e70c558-f70a-3753-8dac-4e5ca185902b}, hash: E8AC44D23D98DC727BB8C7C786AFB8F6
    @Test()
    public void isAndroidRuntimeWhenRuntimeNotEqualsRuntimeANDROID() {
        /* Branches:
         * (runtime == Runtime.ANDROID) : false
         */
        //Act Statement(s)
        boolean result = PlatformUtils.isAndroidRuntime();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${6e0d1141-ab92-38a6-a33b-6c0e2f4d19de}, hash: A5ABD969AB40BA95986D313E9EF01E5F
    @Ignore()
    @Test()
    public void isOpenJDKRuntimeWhenRuntimeNotEqualsRuntimeOPENJDK() {
        /* Branches:
         * (runtime == Runtime.OPENJDK) : false
         */
        //Act Statement(s)
        boolean result = PlatformUtils.isOpenJDKRuntime();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${fa96fdfd-e026-3f6a-bbfb-dd1bd7c5a7ee}, hash: A7A3D387D191CE13626609DD4867A364
    @Test()
    public void isOracleJavaRuntimeWhenRuntimeNotEqualsRuntimeORACLE_JAVA() {
        /* Branches:
         * (runtime == Runtime.ORACLE_JAVA) : false
         */
        //Act Statement(s)
        boolean result = PlatformUtils.isOracleJavaRuntime();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${ffae1a42-277e-3941-a13d-7e3f16e59dff}, hash: 5A2A9755B1022E43170CC33CC54A9CAB
    @Test()
    public void isLinuxWhenOsNotEqualsOSLINUX() {
        /* Branches:
         * (os == OS.LINUX) : false
         */
        //Act Statement(s)
        boolean result = PlatformUtils.isLinux();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${8e674e8d-c4b9-3363-bbc3-a52d9b6e9076}, hash: BF705BD6A3F3FB10238242C0BA3AFCC2
    @Test()
    public void isWindowsWhenOsNotEqualsOSWINDOWS() {
        /* Branches:
         * (os == OS.WINDOWS) : false
         */
        //Act Statement(s)
        boolean result = PlatformUtils.isWindows();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${98684704-b526-398e-9af0-7d2e095ac9cd}, hash: C8563DBDDE5C34AAB2D4D986DC0D65B8
    @Ignore()
    @Test()
    public void isMacWhenOsNotEqualsOSMAC_OS() {
        /* Branches:
         * (os == OS.MAC_OS) : false
         */
        //Act Statement(s)
        boolean result = PlatformUtils.isMac();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }
}
