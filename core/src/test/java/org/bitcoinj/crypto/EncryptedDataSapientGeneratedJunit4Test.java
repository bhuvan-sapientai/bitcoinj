package org.bitcoinj.crypto;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class EncryptedDataSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}
    @Test()
    public void toStringTest() {
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3};
        byte[] byteArray2 = new byte[]{(byte) 4, (byte) 5, (byte) 6, (byte) 7};
        EncryptedData target = new EncryptedData(byteArray, byteArray2);

        //Act Statement(s)
        String result = target.toString();

        //Assert statement(s)
        assertThat(result, equalTo("EncryptedData [initialisationVector=[0, 1, 2, 3], encryptedPrivateKey=[4, 5, 6, 7]]"));
    }
}
