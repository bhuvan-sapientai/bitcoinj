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
import java.io.ByteArrayOutputStream;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

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
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(0L);
            varInt.when(() -> VarInt.read((ByteBuffer) any())).thenReturn(varIntMock);
            doReturn(false).when(varIntMock).fitsInt();
            doReturn(2004).when(varIntMock).intValue();
            preconditions.when(() -> Preconditions.check(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            thrown.expect(ProtocolException.class);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            GetBlocksMessage.read(byteBuffer);
            //Assert statement(s)
            byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()));
            varInt.verify(() -> VarInt.read((ByteBuffer) any()));
            verify(varIntMock).fitsInt();
            verify(varIntMock).intValue();
            preconditions.verify(() -> Preconditions.check(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${37745e70-550f-33e7-8fc9-443b8f67bf95}
    @Test()
    public void readWhenILessThanStartCount() throws Throwable {
        /* Branches:
         * (startCount > 500) : false
         * (i < startCount) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class)) {
            byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(0L);
            varInt.when(() -> VarInt.read((ByteBuffer) any())).thenReturn(varIntMock);
            doReturn(false).when(varIntMock).fitsInt();
            doReturn(1).when(varIntMock).intValue();
            preconditions.when(() -> Preconditions.check(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            sha256Hash.when(() -> Sha256Hash.read((ByteBuffer) any())).thenReturn(sha256HashMock).thenReturn(sha256HashMock2);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            GetBlocksMessage result = GetBlocksMessage.read(byteBuffer);
            List<Sha256Hash> sha256HashList = new ArrayList<>();
            sha256HashList.add(sha256HashMock);
            BlockLocator blockLocator = new BlockLocator(sha256HashList);
            GetBlocksMessage getBlocksMessage = new GetBlocksMessage(0L, blockLocator, sha256HashMock2);
            //Assert statement(s)
            assertThat(result, equalTo(getBlocksMessage));
            byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()));
            varInt.verify(() -> VarInt.read((ByteBuffer) any()));
            verify(varIntMock).fitsInt();
            verify(varIntMock).intValue();
            preconditions.verify(() -> Preconditions.check(eq(false), (Supplier) any()));
            sha256Hash.verify(() -> Sha256Hash.read((ByteBuffer) any()), atLeast(2));
        }
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}
    @Test()
    public void toStringTest() {
        //Arrange Statement(s)
        GetBlocksMessage target = new GetBlocksMessage(0L, locatorMock, stopHashMock);

        //Act Statement(s)
        String result = target.toString();

        //Assert statement(s)
        assertThat(result, equalTo("getblocks: <init>_blockLocator1"));
    }

    //Sapient generated method id: ${0ccb75ab-17b5-3aac-90b2-7f0d34c4faed}
    @Test()
    public void bitcoinSerializeToStreamWhenLocatorGetHashesIsNotEmpty() throws IOException {
        /* Branches:
         * (for-each(locator.getHashes())) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<VarInt> varInt = mockStatic(VarInt.class)) {
            varInt.when(() -> VarInt.of(1L)).thenReturn(varIntMock);
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(varIntMock).serialize();
            GetBlocksMessage target = new GetBlocksMessage(0L, locatorMock, stopHashMock);
            doReturn(1).when(locatorMock).size();
            List<Sha256Hash> sha256HashList = new ArrayList<>();
            sha256HashList.add(sha256HashMock);
            doReturn(sha256HashList).when(locatorMock).getHashes();
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(sha256HashMock).serialize();
            byte[] byteArray3 = new byte[]{};
            doReturn(byteArray3).when(stopHashMock).serialize();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            //Act Statement(s)
            target.bitcoinSerializeToStream(byteArrayOutputStream);
            //Assert statement(s)
            varInt.verify(() -> VarInt.of(1L), atLeast(1));
            verify(varIntMock).serialize();
            verify(locatorMock).size();
            verify(locatorMock).getHashes();
            verify(sha256HashMock).serialize();
            verify(stopHashMock).serialize();
        }
    }
}
