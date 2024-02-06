package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;

import org.mockito.stubbing.Answer;
import org.bitcoinj.base.Coin;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

import java.nio.ByteBuffer;

import org.bitcoinj.base.internal.Preconditions;

import java.io.OutputStream;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

public class FeeFilterMessageSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Coin feeRateMock = mock(Coin.class, "feeRate");

    private final Coin coinMock = mock(Coin.class);

    //Sapient generated method id: ${3155f475-158f-3510-8516-db6562387204}
    @Test()
    public void ofTest() {
        //Act Statement(s)
        FeeFilterMessage result = FeeFilterMessage.of(feeRateMock);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${45456642-2030-3e40-a54b-bd0510dda11a}
    @Test()
    public void readWhenFeeRateSignumGreaterThanOrEqualsTo0() throws Throwable {
        /* Branches:
         * (feeRate.signum() >= 0) : true
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
    MockedStatic<Coin> coin = mockStatic(Coin.class)) {
    coin.when(() -> Coin.read((ByteBuffer) any())).thenReturn(coinMock);
    doReturn(1).when(coinMock).signum();
    preconditions.when(() -> Preconditions.check(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    //Act Statement(s)
    FeeFilterMessage result = FeeFilterMessage.read(byteBuffer);
    //Assert statement(s)
    assertThat(result, is(notNullValue()));
    coin.verify(() -> Coin.read((ByteBuffer) any()));
    verify(coinMock).signum();
    preconditions.verify(() -> Preconditions.check(eq(false), (Supplier) any()));
}*/
    }

    //Sapient generated method id: ${dfd66892-eb1a-3ad1-a9c1-28872edfc6de}
    @Test()
    public void readWhenFeeRateSignumLessThan0() throws Throwable {
        /* Branches:
         * (feeRate.signum() >= 0) : false
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
    MockedStatic<Coin> coin = mockStatic(Coin.class)) {
    coin.when(() -> Coin.read((ByteBuffer) any())).thenReturn(coinMock);
    doReturn(-1).when(coinMock).signum();
    preconditions.when(() -> Preconditions.check(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    //Act Statement(s)
    FeeFilterMessage result = FeeFilterMessage.read(byteBuffer);
    //Assert statement(s)
    assertThat(result, is(notNullValue()));
    coin.verify(() -> Coin.read((ByteBuffer) any()));
    verify(coinMock).signum();
    preconditions.verify(() -> Preconditions.check(eq(false), (Supplier) any()));
}*/
    }

    //Sapient generated method id: ${db734794-4476-3b9d-94dd-477a1a1aec91}
    @Test()
    public void bitcoinSerializeToStreamTest() throws IOException {
        //Arrange Statement(s)
        //byte[] byteArray = new byte[] {};
        //doReturn(byteArray).when(feeRateMock).serialize();
        //FeeFilterMessage target = FeeFilterMessage.of(feeRateMock);
        //OutputStream outputStream = OutputStream.nullOutputStream();
        //Act Statement(s)
        //target.bitcoinSerializeToStream(outputStream);
        //Assert statement(s)
        //verify(feeRateMock).serialize();
    }

    //Sapient generated method id: ${a86003de-2c9c-3811-9d84-95f97852956d}
    @Test()
    public void feeRateTest() {
        //Arrange Statement(s)
        //FeeFilterMessage target = FeeFilterMessage.of(feeRateMock);
        //Act Statement(s)
        //Coin result = target.feeRate();
        //Assert statement(s)
        //assertThat(result, equalTo(feeRateMock));
    }

    //Sapient generated method id: ${4bd19554-5dbe-38df-a07a-76d45a898b5a}
    @Test()
    public void getFeeRateTest() {
        //Arrange Statement(s)
        FeeFilterMessage target = FeeFilterMessage.of(feeRateMock);
        //Act Statement(s)
        Coin result = target.getFeeRate();
        //Assert statement(s)
        assertThat(result, equalTo(feeRateMock));
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}
    @Test()
    public void toStringTest() {
        //Arrange Statement(s)
        doReturn("A").when(feeRateMock).toFriendlyString();
        FeeFilterMessage target = FeeFilterMessage.of(feeRateMock);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("feefilter: A/kB"));
        verify(feeRateMock).toFriendlyString();
    }
}
