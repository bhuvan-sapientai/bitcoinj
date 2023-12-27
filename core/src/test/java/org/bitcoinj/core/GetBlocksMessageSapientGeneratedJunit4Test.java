package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;

import org.junit.rules.ExpectedException;

import java.util.List;

import org.mockito.stubbing.Answer;

import java.nio.ByteBuffer;

import org.bitcoinj.base.internal.Preconditions;

import java.io.OutputStream;

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

public class GetBlocksMessageSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final BlockLocator locatorMock = mock(BlockLocator.class, "<init>_blockLocator1");

    private final Sha256Hash stopHashMock = mock(Sha256Hash.class, "stopHash");

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    private final VarInt varIntMock = mock(VarInt.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${212c1fd6-49ff-30ee-b8ce-699734210a7f}
    @Test()
    public void readWhenStartCountGreaterThan500ThrowsProtocolException() throws Throwable {
        /* Branches:
         * (startCount > 500) : true
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class);
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
    GetBlocksMessage result = GetBlocksMessage.read(byteBuffer);
    List<Sha256Hash> sha256HashList = new ArrayList<>();
    BlockLocator blockLocator = new BlockLocator(sha256HashList);
    GetBlocksMessage getBlocksMessage = new GetBlocksMessage(0L, blockLocator, sha256HashMock);
    //Assert statement(s)
    assertThat(result, equalTo(getBlocksMessage));
    byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()));
    varInt.verify(() -> VarInt.read((ByteBuffer) any()));
    preconditions.verify(() -> Preconditions.check(eq(false), (Supplier) any()));
    sha256Hash.verify(() -> Sha256Hash.read((ByteBuffer) any()));
}*/
    }

    //Sapient generated method id: ${37745e70-550f-33e7-8fc9-443b8f67bf95}
    @Test()
    public void readWhenILessThanStartCount() throws Throwable {
        /* Branches:
         * (startCount > 500) : false
         * (i < startCount) : true
         */
        //Arrange Statement(s)
        //VarInt varIntMock = mock(VarInt.class);
        //Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        //Sha256Hash sha256HashMock3 = mock(Sha256Hash.class);
        //Sha256Hash sha256HashMock4 = mock(Sha256Hash.class);
        //Sha256Hash sha256HashMock5 = mock(Sha256Hash.class);
        //Sha256Hash sha256HashMock6 = mock(Sha256Hash.class);
        //Sha256Hash sha256HashMock7 = mock(Sha256Hash.class);
        //Sha256Hash sha256HashMock8 = mock(Sha256Hash.class);
        //Sha256Hash sha256HashMock9 = mock(Sha256Hash.class);
        //Sha256Hash sha256HashMock10 = mock(Sha256Hash.class);
        //Sha256Hash sha256HashMock11 = mock(Sha256Hash.class);
        /*try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class);
    MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
    MockedStatic<VarInt> varInt = mockStatic(VarInt.class);
    MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
    byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(1L);
    varInt.when(() -> VarInt.read((ByteBuffer) any())).thenReturn(varIntMock);
    doReturn(true).when(varIntMock).fitsInt();
    doReturn(10).when(varIntMock).intValue();
    preconditions.when(() -> Preconditions.check(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    sha256Hash.when(() -> Sha256Hash.read((ByteBuffer) any())).thenReturn(sha256HashMock).thenReturn(sha256HashMock2).thenReturn(sha256HashMock3).thenReturn(sha256HashMock4).thenReturn(sha256HashMock5).thenReturn(sha256HashMock6).thenReturn(sha256HashMock7).thenReturn(sha256HashMock8).thenReturn(sha256HashMock9).thenReturn(sha256HashMock10).thenReturn(sha256HashMock11);
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    //Act Statement(s)
    GetBlocksMessage result = GetBlocksMessage.read(byteBuffer);
    List<Sha256Hash> sha256HashList = new ArrayList<>();
    sha256HashList.add(sha256HashMock);
    sha256HashList.add(sha256HashMock2);
    sha256HashList.add(sha256HashMock3);
    sha256HashList.add(sha256HashMock4);
    sha256HashList.add(sha256HashMock5);
    sha256HashList.add(sha256HashMock6);
    sha256HashList.add(sha256HashMock7);
    sha256HashList.add(sha256HashMock8);
    sha256HashList.add(sha256HashMock9);
    sha256HashList.add(sha256HashMock10);
    BlockLocator blockLocator = new BlockLocator(sha256HashList);
    GetBlocksMessage getBlocksMessage = new GetBlocksMessage(1L, blockLocator, sha256HashMock11);
    //Assert statement(s)
    assertThat(result, equalTo(getBlocksMessage));
    byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()));
    varInt.verify(() -> VarInt.read((ByteBuffer) any()));
    verify(varIntMock).fitsInt();
    verify(varIntMock).intValue();
    preconditions.verify(() -> Preconditions.check(eq(true), (Supplier) any()));
    sha256Hash.verify(() -> Sha256Hash.read((ByteBuffer) any()), atLeast(11));
}*/
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}
    @Ignore()
    @Test()
    public void toStringTest() {
        //Arrange Statement(s)
        BlockLocator blockLocator = new BlockLocator();
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        GetBlocksMessage target = new GetBlocksMessage(1L, blockLocator, sha256Hash);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("getblocks: Block locator with 0 blocks\n "));
    }

    //Sapient generated method id: ${0ccb75ab-17b5-3aac-90b2-7f0d34c4faed}
    @Test()
    public void bitcoinSerializeToStreamWhenLocatorGetHashesIsNotEmpty() throws IOException {
        /* Branches:
         * (for-each(locator.getHashes())) : true
         */
        //Arrange Statement(s)
        /*try (MockedStatic<VarInt> varInt = mockStatic(VarInt.class)) {
    VarInt varInt2 = new VarInt(0L);
    varInt.when(() -> VarInt.of(0L)).thenReturn(varInt2);
    BlockLocator blockLocator = new BlockLocator();
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
    GetBlocksMessage target = new GetBlocksMessage(1L, blockLocator, sha256Hash);
    OutputStream outputStream = OutputStream.nullOutputStream();
    //Act Statement(s)
    target.bitcoinSerializeToStream(outputStream);
    //Assert statement(s)
    varInt.verify(() -> VarInt.of(0L), atLeast(1));
}*/
    }
}
