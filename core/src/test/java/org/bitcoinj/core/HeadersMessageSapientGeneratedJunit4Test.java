package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;

import org.junit.rules.ExpectedException;
import org.mockito.stubbing.Answer;

import java.nio.ByteBuffer;

import org.bitcoinj.base.internal.Preconditions;

import java.io.OutputStream;

import org.bitcoinj.base.VarInt;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

import java.io.ByteArrayOutputStream;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

public class HeadersMessageSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Block blockMock = mock(Block.class);

    private final VarInt varIntMock = mock(VarInt.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${67840b8a-0d55-3035-9949-836b47503de0}, hash: FB0FDED429872C46DEBC1AF8AF6C91A2
    @Test()
    public void readWhenNumHeadersGreaterThanMAX_HEADERSThrowsProtocolException() throws Throwable {
        /* Branches:
         * (numHeaders > MAX_HEADERS) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class)) {
            varInt.when(() -> VarInt.read((ByteBuffer) any())).thenReturn(varIntMock);
            doReturn(false).when(varIntMock).fitsInt();
            doReturn(2824).when(varIntMock).intValue();
            preconditions.when(() -> Preconditions.check(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            thrown.expect(ProtocolException.class);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            HeadersMessage.read(byteBuffer);
            //Assert statement(s)
            varInt.verify(() -> VarInt.read((ByteBuffer) any()));
            verify(varIntMock).fitsInt();
            verify(varIntMock).intValue();
            preconditions.verify(() -> Preconditions.check(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${66cb7834-e819-3578-a687-361c00367b5d}, hash: E6B3D2BB1F208B75E516BB4352124594
    @Test()
    public void readWhenNewBlockHeaderHasTransactionsThrowsProtocolException() throws Throwable {
        /* Branches:
         * (numHeaders > MAX_HEADERS) : false
         * (i < numHeaders) : true
         * (newBlockHeader.hasTransactions()) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Block> block = mockStatic(Block.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class)) {
            varInt.when(() -> VarInt.read((ByteBuffer) any())).thenReturn(varIntMock);
            doReturn(false).when(varIntMock).fitsInt();
            doReturn(1).when(varIntMock).intValue();
            preconditions.when(() -> Preconditions.check(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            block.when(() -> Block.read((ByteBuffer) any())).thenReturn(blockMock);
            doReturn(true).when(blockMock).hasTransactions();
            thrown.expect(ProtocolException.class);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            HeadersMessage.read(byteBuffer);
            //Assert statement(s)
            varInt.verify(() -> VarInt.read((ByteBuffer) any()));
            verify(varIntMock).fitsInt();
            verify(varIntMock).intValue();
            preconditions.verify(() -> Preconditions.check(eq(false), (Supplier) any()));
            block.verify(() -> Block.read((ByteBuffer) any()));
            verify(blockMock).hasTransactions();
        }
    }

    //Sapient generated method id: ${5b34c013-fbae-3454-bc40-86c57d85b47d}, hash: 5D46164435B3DE45E113D31F428AFFFE
    @Test()
    public void readWhenILessThanNumHeaders() throws Throwable {
        /* Branches:
         * (numHeaders > MAX_HEADERS) : false
         * (i < numHeaders) : true
         * (newBlockHeader.hasTransactions()) : false
         * (log.isDebugEnabled()) : true
         * (i < numHeaders) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Block blockMock = mock(Block.class, "read_block1");
        try (MockedStatic<Block> block = mockStatic(Block.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class)) {
            varInt.when(() -> VarInt.read((ByteBuffer) any())).thenReturn(varIntMock);
            doReturn(false).when(varIntMock).fitsInt();
            doReturn(1).when(varIntMock).intValue();
            preconditions.when(() -> Preconditions.check(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            block.when(() -> Block.read((ByteBuffer) any())).thenReturn(blockMock);
            doReturn(false).when(blockMock).hasTransactions();
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            HeadersMessage result = HeadersMessage.read(byteBuffer);
            //Assert statement(s)
            //TODO: Please implement equals method in HeadersMessage for verification of the entire object or you need to adjust respective assertion statements
            assertThat(result, is(notNullValue()));
            varInt.verify(() -> VarInt.read((ByteBuffer) any()));
            verify(varIntMock).fitsInt();
            verify(varIntMock).intValue();
            preconditions.verify(() -> Preconditions.check(eq(false), (Supplier) any()));
            block.verify(() -> Block.read((ByteBuffer) any()));
            verify(blockMock, atLeast(1)).hasTransactions();
        }
    }

    //Sapient generated method id: ${3bb8dd7c-6f47-30ac-a65d-e06077da8f51}, hash: A98A30150D9EEB63FFFDB0F09428D263
    @Test()
    public void bitcoinSerializeToStreamWhenBlockHeadersIsNotEmpty() throws IOException, ProtocolException {
        /* Branches:
         * (for-each(blockHeaders)) : true
         */
        //Arrange Statement(s)
        Block headerMock = mock(Block.class);
        doReturn(blockMock).when(headerMock).cloneAsHeader();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        doNothing().when(blockMock).bitcoinSerializeToStream(byteArrayOutputStream);
        Block[] blockArray = new Block[]{headerMock};
        HeadersMessage target = new HeadersMessage(blockArray);
        //Act Statement(s)
        target.bitcoinSerializeToStream(byteArrayOutputStream);
        //Assert statement(s)
        verify(headerMock).cloneAsHeader();
        verify(blockMock).bitcoinSerializeToStream(byteArrayOutputStream);
    }
}
