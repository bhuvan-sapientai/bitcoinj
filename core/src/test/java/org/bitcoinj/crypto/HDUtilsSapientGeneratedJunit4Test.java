package org.bitcoinj.crypto;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.MockedStatic;
import org.bouncycastle.crypto.macs.HMac;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class HDUtilsSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${8faf91aa-7c6c-3bc7-a13a-ca42c0bf871a}, hash: C0D31F1BB8852C768A856920085FF5FD
    @Test()
    public void createHmacSha512DigestTest() {
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        HMac result = HDUtils.createHmacSha512Digest(byteArray);
        //Assert statement(s)
        //TODO: Please implement equals method in HMac for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${bac6218d-7b79-3e48-bc24-04bb672bf17b}, hash: D5FB03D7DAB1749239DEA89B7DBADC35
    @Test()
    public void hmacSha512Test() {
        //Arrange Statement(s)
        HMac hmacSha512Mock = mock(HMac.class);
        doNothing().when(hmacSha512Mock).reset();
        byte[] byteArray = new byte[]{};
        doNothing().when(hmacSha512Mock).update(byteArray, 0, 0);
        byte[] byteArray2 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        doReturn(0).when(hmacSha512Mock).doFinal(byteArray2, 0);
        //Act Statement(s)
        byte[] result = HDUtils.hmacSha512(hmacSha512Mock, byteArray);
        //Assert statement(s)
        assertThat(result, equalTo(byteArray2));
        verify(hmacSha512Mock).reset();
        verify(hmacSha512Mock).update(byteArray, 0, 0);
        verify(hmacSha512Mock).doFinal(byteArray2, 0);
    }

    //Sapient generated method id: ${5cd9db12-e5cf-32f8-8f1b-b5d8521a9c1d}, hash: 9D1FD48EE23AA25D9DE917BFD00A95B1
    @Test()
    public void hmacSha5121Test() {
        //Arrange Statement(s)
        HMac hMacMock = mock(HMac.class);
        try (MockedStatic<HDUtils> hDUtils = mockStatic(HDUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            hDUtils.when(() -> HDUtils.createHmacSha512Digest(byteArray)).thenReturn(hMacMock);
            doNothing().when(hMacMock).reset();
            byte[] byteArray2 = new byte[]{};
            doNothing().when(hMacMock).update(byteArray2, 0, 0);
            byte[] byteArray3 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            doReturn(0).when(hMacMock).doFinal(byteArray3, 0);
            //Act Statement(s)
            byte[] result = HDUtils.hmacSha512(byteArray, byteArray2);
            //Assert statement(s)
            assertThat(result, equalTo(byteArray3));
            hDUtils.verify(() -> HDUtils.createHmacSha512Digest(byteArray), atLeast(1));
            verify(hMacMock, atLeast(1)).reset();
            verify(hMacMock, atLeast(1)).update(byteArray2, 0, 0);
            verify(hMacMock, atLeast(1)).doFinal(byteArray3, 0);
        }
    }

    //Sapient generated method id: ${800d4d39-847f-3e52-9865-6ed6ef6b6ee8}, hash: 5A34CD8766800E18F30325A1C39DDA30
    @Ignore()
    @Test()
    public void toCompressedTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        byte[] result = HDUtils.toCompressed(byteArray);
        //Assert statement(s)
        assertThat(result.length, equalTo(0));
    }

    //Sapient generated method id: ${af314e7f-0c5e-38a1-91e6-a2d565ac2f7d}, hash: 871AA4288DB7FEA58DD8061C68E741F9
    @Test()
    public void longTo4ByteArrayWhenBytesLengthEquals4ThrowsAssertionError() {
        /* Branches:
         * (bytes.length == 4) : true
         */
        //Act Statement(s)
        byte[] result = HDUtils.longTo4ByteArray(0L);
        byte[] byteResultArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0};
        //Assert statement(s)
        assertThat(result, equalTo(byteResultArray));
    }

    //Sapient generated method id: ${1e091176-10ae-37fd-82c6-c52bb741e6af}, hash: 70E08C9A9834A0894F381330D80143D0
    @Ignore()
    @Test()
    public void longTo4ByteArrayWhenBytesLengthEquals4() {
        /* Branches:
         * (bytes.length == 4) : true
         */
        //Act Statement(s)
        byte[] result = HDUtils.longTo4ByteArray(1L);
        byte[] byteResultArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3};
        //Assert statement(s)
        assertThat(result, equalTo(byteResultArray));
    }
}
