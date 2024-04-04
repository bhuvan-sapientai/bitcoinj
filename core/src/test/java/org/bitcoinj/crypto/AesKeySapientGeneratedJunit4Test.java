package org.bitcoinj.crypto;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bouncycastle.crypto.params.KeyParameter;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

public class AesKeySapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${a377c75a-5e17-3222-adbe-6e7d38993c02}, hash: 18599C94D7F2D8013CD806FBABA03465
    @Test()
    public void getKeyTest() {
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        AesKey target = new AesKey(byteArray);

        //Act Statement(s)
        byte[] result = target.getKey();

        //Assert statement(s)
        assertThat(result.length, equalTo(0));
    }

    //Sapient generated method id: ${dde6de4e-171b-3da0-b9ff-16f15325dc4e}, hash: 70C1AA9733AE48D693EC756C6CCAD832
    @Test()
    public void ofKeyParameterTest() {
        //Arrange Statement(s)
        KeyParameter keyParameterMock = mock(KeyParameter.class);
        byte[] byteArray = new byte[]{};
        doReturn(byteArray).when(keyParameterMock).getKey();

        //Act Statement(s)
        AesKey result = AesKey.ofKeyParameter(keyParameterMock);
        AesKey aesKey = new AesKey(byteArray);

        //Assert statement(s)
        assertThat(result, equalTo(aesKey));
        verify(keyParameterMock).getKey();
    }

    //Sapient generated method id: ${d5ae54bb-2aaf-35d2-abea-0467ce30800f}, hash: 3BCDDF0F5F489277E951FFC91BA497A3
    @Test()
    public void toKeyParameterTest() {
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        AesKey target = new AesKey(byteArray);

        //Act Statement(s)
        KeyParameter result = target.toKeyParameter();

        //Assert statement(s)
        //TODO: Please implement equals method in KeyParameter for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }
}
