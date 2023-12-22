package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;

import org.bitcoinj.base.Coin;

import java.nio.ByteBuffer;
import java.util.ArrayList;

import org.bitcoinj.script.Script;
import org.bitcoinj.base.Sha256Hash;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Ignore;

public class UTXOSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}
    @Ignore()
    @Test()
    public void toStringTest() {
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        Coin coin = Coin.valueOf(0L);
        List list = new ArrayList<>();
        Script script = Script.of(list);
        UTXO target = new UTXO(sha256Hash, 1234567890L, coin, 1000, true, script, "1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa");
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("Stored TxOut of null (null:null)"));
    }
}
