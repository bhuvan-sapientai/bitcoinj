package org.bitcoinj.store;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.base.Sha256Hash;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.mock;

public class StoredTransactionOutPointSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}
    @Test()
    public void toStringTest() {
        //Arrange Statement(s)
        Sha256Hash sha256HashMock = mock(Sha256Hash.class, "<init>_sha256Hash1");
        StoredTransactionOutPoint target = new StoredTransactionOutPoint(sha256HashMock, 2L);

        //Act Statement(s)
        String result = target.toString();

        //Assert statement(s)
        assertThat(result, equalTo("Stored transaction out point: <init>_sha256Hash1:2"));
    }
}
