package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;

import org.junit.rules.ExpectedException;
import org.bitcoinj.base.Coin;
import org.mockito.MockedStatic;

import java.nio.ByteBuffer;

import org.bitcoinj.base.internal.Preconditions;

import java.io.OutputStream;
import java.io.ByteArrayOutputStream;

import static org.mockito.ArgumentMatchers.any;
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

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${3155f475-158f-3510-8516-db6562387204}, hash: 0F306C91ECB91B4EE6ED147CC25AA477
    @Test()
    public void ofTest() {

        //Act Statement(s)
        FeeFilterMessage result = FeeFilterMessage.of(feeRateMock);

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${45456642-2030-3e40-a54b-bd0510dda11a}, hash: 455CCB109C18CB67BACAD41E5A713C31
    @Test()
    public void readWhenFeeRateSignumGreaterThanOrEqualsTo0() throws Throwable {
        /* Branches:
         * (feeRate.signum() >= 0) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Coin> coin = mockStatic(Coin.class)) {
            coin.when(() -> Coin.read((ByteBuffer) any())).thenReturn(coinMock);
            doReturn(1).when(coinMock).signum();
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            FeeFilterMessage result = FeeFilterMessage.read(byteBuffer);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            coin.verify(() -> Coin.read((ByteBuffer) any()));
            verify(coinMock, atLeast(1)).signum();
        }
    }

    //Sapient generated method id: ${330bfd35-3715-32a7-bd31-72d2bd663d9c}, hash: 3CFB63B4A96780D7003B5D436AE517FE
    @Test()
    public void readWhenFeeRateSignumLessThan0ThrowsProtocolException() throws Throwable {
        /* Branches:
         * (feeRate.signum() >= 0) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Coin> coin = mockStatic(Coin.class)) {
            coin.when(() -> Coin.read((ByteBuffer) any())).thenReturn(coinMock);
            doReturn(-1).when(coinMock).signum();
            thrown.expect(ProtocolException.class);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            FeeFilterMessage.read(byteBuffer);
            //Assert statement(s)
            coin.verify(() -> Coin.read((ByteBuffer) any()));
            verify(coinMock).signum();
        }
    }

    //Sapient generated method id: ${db734794-4476-3b9d-94dd-477a1a1aec91}, hash: 391A3C4E874F8AE0EA82C3ACD446636B
    @Test()
    public void bitcoinSerializeToStreamTest() throws IOException {
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        doReturn(byteArray).when(feeRateMock).serialize();
        FeeFilterMessage target = FeeFilterMessage.of(feeRateMock);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        //Act Statement(s)
        target.bitcoinSerializeToStream(byteArrayOutputStream);

        //Assert statement(s)
        verify(feeRateMock).serialize();
    }

    //Sapient generated method id: ${a86003de-2c9c-3811-9d84-95f97852956d}, hash: 6AC7B46A5B3144E366E8009A0BDE7C93
    @Test()
    public void feeRateTest() {
        //Arrange Statement(s)
        FeeFilterMessage target = FeeFilterMessage.of(feeRateMock);

        //Act Statement(s)
        Coin result = target.feeRate();

        //Assert statement(s)
        assertThat(result, equalTo(feeRateMock));
    }

    //Sapient generated method id: ${4bd19554-5dbe-38df-a07a-76d45a898b5a}, hash: 6EF760D292E84BFE7C85A94BE365D9AE
    @Test()
    public void getFeeRateTest() {
        //Arrange Statement(s)
        FeeFilterMessage target = FeeFilterMessage.of(feeRateMock);

        //Act Statement(s)
        Coin result = target.getFeeRate();

        //Assert statement(s)
        assertThat(result, equalTo(feeRateMock));
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: B2892B6F0E73520AA8456936C24E5D55
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
