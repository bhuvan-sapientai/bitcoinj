package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.bitcoinj.base.Coin;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

public class InsufficientMoneyExceptionSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${d2023724-fb02-31bf-8f56-c852070520c4}
    @Test()
    public void formatTest() {
        //Arrange Statement(s)
        Coin missingMock = mock(Coin.class);
        doReturn("A").when(missingMock).toFriendlyString();
        Coin availableMock = mock(Coin.class);
        doReturn("B").when(availableMock).toFriendlyString();
        Coin outputsMock = mock(Coin.class);
        doReturn("C").when(outputsMock).toFriendlyString();
        Coin feeMock = mock(Coin.class);
        doReturn("D").when(feeMock).toFriendlyString();

        //Act Statement(s)
        String result = InsufficientMoneyException.format(missingMock, availableMock, outputsMock, feeMock);

        //Assert statement(s)
        assertThat(result, equalTo("Insufficient money, missing A (available: B, total outputs: C, fee: D)"));
        verify(missingMock).toFriendlyString();
        verify(availableMock).toFriendlyString();
        verify(outputsMock).toFriendlyString();
        verify(feeMock).toFriendlyString();
    }
}
