package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.base.Sha256Hash;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.mock;

public class InventoryItemSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: A9A39902D2B8179126CC10886BBC1A62
    @Test()
    public void toStringTest() {
        //Arrange Statement(s)
        Sha256Hash sha256HashMock = mock(Sha256Hash.class, "<init>_sha256Hash1");
        InventoryItem target = new InventoryItem(InventoryItem.Type.WITNESS_FILTERED_BLOCK, sha256HashMock);

        //Act Statement(s)
        String result = target.toString();

        //Assert statement(s)
        assertThat(result, equalTo("WITNESS_FILTERED_BLOCK: <init>_sha256Hash1"));
    }
}
