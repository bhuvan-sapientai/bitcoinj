package org.bitcoinj.crypto;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bouncycastle.crypto.params.KeyParameter;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class AesKeySapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${a377c75a-5e17-3222-adbe-6e7d38993c02}
    @Test()
    public void getKeyTest() {
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5};
        AesKey target = new AesKey(byteArray);

        //Act Statement(s)
        byte[] result = target.getKey();
        byte[] byteResultArray = new byte[]{(byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5};

        //Assert statement(s)
        assertThat(result, equalTo(byteResultArray));
    }

    //Sapient generated method id: ${dde6de4e-171b-3da0-b9ff-16f15325dc4e}
    @Test()
    public void ofKeyParameterTest() {
        //Arrange Statement(s)
        KeyParameter keyParameterMock = mock(KeyParameter.class, "[1, 2, 3, 4]");
        byte[] byteArray = new byte[]{};
        doReturn(byteArray).when(keyParameterMock).getKey();

        //Act Statement(s)
        AesKey result = AesKey.ofKeyParameter(keyParameterMock);
        AesKey aesKey = new AesKey(byteArray);

        //Assert statement(s)
        assertThat(result, equalTo(aesKey));
        verify(keyParameterMock).getKey();
    }

    //Sapient generated method id: ${d5ae54bb-2aaf-35d2-abea-0467ce30800f}
    @Ignore()
    @Test()
    public void toKeyParameterTest() {
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16};
        AesKey target = new AesKey(byteArray);

        //Act Statement(s)
        KeyParameter result = target.toKeyParameter();
        byte[] byteArray2 = new byte[]{(byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16};
        KeyParameter keyParameter = new KeyParameter(byteArray2);

        //Assert statement(s)
        //TODO: Please implement equals method in KeyParameter for verification to succeed or you need to adjust respective assertion statements
        assertThat(result, equalTo(keyParameter));
    }
}
