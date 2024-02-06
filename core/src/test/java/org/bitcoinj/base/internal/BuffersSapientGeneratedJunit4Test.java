package org.bitcoinj.base.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;

import org.mockito.stubbing.Answer;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

import java.nio.ByteBuffer;

import org.bitcoinj.base.VarInt;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;
import org.junit.rules.ExpectedException;

public class BuffersSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final VarInt varIntMock = mock(VarInt.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${53004c16-0c3e-3d32-a417-c11d744f0919}
    @Ignore()
    @Test()
    public void readBytesWhenLengthLessThanOrEqualsToBufRemaining() throws Throwable {
        /* Branches:
         * (length <= buf.remaining()) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.check(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            byte[] result = Buffers.readBytes(byteBuffer, 0);
            byte[] byteResultArray = new byte[]{};
            //Assert statement(s)
            assertThat(result, equalTo(byteResultArray));
            preconditions.verify(() -> Preconditions.check(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${0f68867a-7aa1-31d5-8ecb-932e5fb5ed8f}
    @Test()
    public void readLengthPrefixedBytesTest() throws Throwable {
        //Arrange Statement(s)
        try (MockedStatic<Buffers> buffers = mockStatic(Buffers.class, CALLS_REAL_METHODS);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class)) {
            varInt.when(() -> VarInt.read((ByteBuffer) any())).thenReturn(varIntMock);
            doReturn(false).when(varIntMock).fitsInt();
            doReturn(0).when(varIntMock).intValue();
            preconditions.when(() -> Preconditions.check(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            buffers.when(() -> Buffers.readBytes((ByteBuffer) any(), eq(0))).thenReturn(byteArray);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            byte[] result = Buffers.readLengthPrefixedBytes(byteBuffer);
            //Assert statement(s)
            assertThat(result, equalTo(byteArray));
            varInt.verify(() -> VarInt.read((ByteBuffer) any()), atLeast(1));
            verify(varIntMock, atLeast(1)).fitsInt();
            verify(varIntMock, atLeast(1)).intValue();
            preconditions.verify(() -> Preconditions.check(eq(false), (Supplier) any()), atLeast(1));
            buffers.verify(() -> Buffers.readBytes((ByteBuffer) any(), eq(0)), atLeast(1));
        }
    }

    //Sapient generated method id: ${bc879499-2d9f-366e-baae-74eaef916ed6}
    @Ignore()
    @Test()
    public void writeLengthPrefixedBytesTest() throws BufferOverflowException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<VarInt> varInt = mockStatic(VarInt.class)) {
            varInt.when(() -> VarInt.of(0L)).thenReturn(varIntMock);
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(varIntMock).serialize();
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            byte[] byteArray2 = new byte[]{};
            //Act Statement(s)
            ByteBuffer result = Buffers.writeLengthPrefixedBytes(byteBuffer, byteArray2);
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
            //Assert statement(s)
            assertThat(result, equalTo(byteBuffer2));
            varInt.verify(() -> VarInt.of(0L), atLeast(1));
            verify(varIntMock).serialize();
        }
    }

    //Sapient generated method id: ${b4036d7b-18f3-389d-b547-a6d18fa86ef1}
    @Ignore()
    @Test()
    public void readLengthPrefixedStringTest() throws BufferUnderflowException {
        //Arrange Statement(s)
        try (MockedStatic<Buffers> buffers = mockStatic(Buffers.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            buffers.when(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any())).thenReturn(byteArray);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            String result = Buffers.readLengthPrefixedString(byteBuffer);
            //Assert statement(s)
            assertThat(result, equalTo("result1"));
            buffers.verify(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${6d4cf47f-6528-343a-bfcf-d3a90b02c138}
    @Ignore()
    @Test()
    public void writeLengthPrefixedStringTest() throws BufferOverflowException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<VarInt> varInt = mockStatic(VarInt.class)) {
            varInt.when(() -> VarInt.of(0L)).thenReturn(varIntMock);
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(varIntMock).serialize();
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            ByteBuffer result = Buffers.writeLengthPrefixedString(byteBuffer, "str1");
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
            //Assert statement(s)
            assertThat(result, equalTo(byteBuffer2));
            varInt.verify(() -> VarInt.of(0L), atLeast(1));
            verify(varIntMock).serialize();
        }
    }

    //Sapient generated method id: ${7c226d76-20c9-30bc-beb6-88b35eb2cf1c}
    @Test()
    public void skipBytesWhenNumBytesLessThan0ThrowsIllegalArgumentException() throws BufferUnderflowException {
        /* Branches:
         * (numBytes >= 0) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(false)).thenThrow(illegalArgumentException);
            thrown.expect(IllegalArgumentException.class);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            Buffers.skipBytes(byteBuffer, -1);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(false), atLeast(1));
        }
    }

    //Sapient generated method id: ${060e9511-4881-3c15-b4e2-affe91af837f}
    @Ignore()
    @Test()
    public void skipBytesWhenNumBytesLessThanOrEqualsToBufRemaining() throws Throwable {
        /* Branches:
         * (numBytes >= 0) : true
         * (numBytes <= buf.remaining()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.check(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            ByteBuffer result = Buffers.skipBytes(byteBuffer, 1);
            //Assert statement(s)
            assertThat(result, equalTo(byteBuffer));
            preconditions.verify(() -> Preconditions.check(eq(false), (Supplier) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${25ed4e01-3276-3c24-b610-e2d30616e1a7}
    @Ignore()
    @Test()
    public void skipBytesWhenNumBytesGreaterThanBufRemaining() throws Throwable {
        /* Branches:
         * (numBytes >= 0) : true
         * (numBytes <= buf.remaining()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.check(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            ByteBuffer result = Buffers.skipBytes(byteBuffer, 2);
            //Assert statement(s)
            assertThat(result, equalTo(byteBuffer));
            preconditions.verify(() -> Preconditions.check(eq(false), (Supplier) any()), atLeast(1));
        }
    }
}
