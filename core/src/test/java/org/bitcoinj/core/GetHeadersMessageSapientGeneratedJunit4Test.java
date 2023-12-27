package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

import org.mockito.stubbing.Answer;

import java.nio.ByteBuffer;

import org.bitcoinj.base.internal.Preconditions;
import org.bitcoinj.base.VarInt;
import org.bitcoinj.base.Sha256Hash;
import org.bitcoinj.base.internal.ByteUtils;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

import java.util.ArrayList;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class GetHeadersMessageSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    private final VarInt varIntMock = mock(VarInt.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${86e0d287-5510-3b35-b2bc-a4afd75ec5c7}
    @Ignore()
    @Test()
    public void read1WhenStartCountGreaterThan500ThrowsProtocolException() throws Throwable {
        /* Branches:
         * (startCount > 500) : true
         */
        //Arrange Statement(s)
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(1L);
            VarInt varInt2 = new VarInt(0L);
            varInt.when(() -> VarInt.read((ByteBuffer) any())).thenReturn(varInt2);
            preconditions.when(() -> Preconditions.check(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            sha256Hash.when(() -> Sha256Hash.read((ByteBuffer) any())).thenReturn(sha256HashMock).thenReturn(sha256HashMock2);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            GetHeadersMessage result = GetHeadersMessage.read(byteBuffer);
            List<Sha256Hash> sha256HashList = new ArrayList<>();
            sha256HashList.add(sha256HashMock);
            BlockLocator blockLocator = new BlockLocator(sha256HashList);
            GetHeadersMessage getHeadersMessage = new GetHeadersMessage(1L, blockLocator, sha256HashMock2);
            //Assert statement(s)
            assertThat(result, equalTo(getHeadersMessage));
            byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()));
            varInt.verify(() -> VarInt.read((ByteBuffer) any()));
            preconditions.verify(() -> Preconditions.check(eq(true), (Supplier) any()));
            sha256Hash.verify(() -> Sha256Hash.read((ByteBuffer) any()), atLeast(2));
        }
    }

    //Sapient generated method id: ${d661fd02-25e3-3539-a62f-d00e938c58b4}
    @Ignore()
    @Test()
    public void read1WhenILessThanStartCount() throws Throwable {
        /* Branches:
         * (startCount > 500) : false
         * (i < startCount) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(0L);
            VarInt varInt2 = new VarInt(0L);
            varInt.when(() -> VarInt.read((ByteBuffer) any())).thenReturn(varInt2);
            preconditions.when(() -> Preconditions.check(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            sha256Hash.when(() -> Sha256Hash.read((ByteBuffer) any())).thenReturn(sha256HashMock);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            GetHeadersMessage result = GetHeadersMessage.read(byteBuffer);
            List<Sha256Hash> sha256HashList = new ArrayList<>();
            BlockLocator blockLocator = new BlockLocator(sha256HashList);
            GetHeadersMessage getHeadersMessage = new GetHeadersMessage(0L, blockLocator, sha256HashMock);
            //Assert statement(s)
            assertThat(result, equalTo(getHeadersMessage));
            byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()));
            varInt.verify(() -> VarInt.read((ByteBuffer) any()));
            preconditions.verify(() -> Preconditions.check(eq(false), (Supplier) any()));
            sha256Hash.verify(() -> Sha256Hash.read((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}
    @Ignore()
    @Test()
    public void toStringTest() {
        //Arrange Statement(s)
        BlockLocator blockLocator = new BlockLocator();
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        GetHeadersMessage target = new GetHeadersMessage(1L, blockLocator, sha256Hash);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("getheaders: Block locator with 0 blocks\n "));
    }
}
