package org.bitcoinj.base.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;

import org.junit.rules.ExpectedException;
import org.mockito.stubbing.Answer;

import java.nio.ByteBuffer;

import org.bitcoinj.base.VarInt;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

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

public class BuffersSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${53004c16-0c3e-3d32-a417-c11d744f0919}
    @Test()
    public void readBytesWhenLengthLessThanOrEqualsToBufRemaining() throws Throwable {
        /* Branches:
         * (length <= buf.remaining()) : true
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);

        //Act Statement(s)
        byte[] result = Buffers.readBytes(byteBuffer, 0);
        byte[] byteResultArray = new byte[]{};

        //Assert statement(s)
        assertThat(result, equalTo(byteResultArray));
    }

    //Sapient generated method id: ${191a8fa1-d7f6-3fa3-8f0d-e4b0e58af4fe}
    @Test()
    public void readBytesWhenLengthGreaterThanBufRemainingThrowsThrowable() throws Throwable {
        /* Branches:
         * (length <= buf.remaining()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        thrown.expect(Throwable.class);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);

        //Act Statement(s)
        Buffers.readBytes(byteBuffer, 2);
    }

    //Sapient generated method id: ${0f68867a-7aa1-31d5-8ecb-932e5fb5ed8f}
    @Test()
    public void readLengthPrefixedBytesTest() throws Throwable {
        //Arrange Statement(s)
        VarInt varIntMock = mock(VarInt.class);
        try (MockedStatic<Buffers> buffers = mockStatic(Buffers.class, CALLS_REAL_METHODS);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class)) {
            varInt.when(() -> VarInt.read((ByteBuffer) any())).thenReturn(varIntMock);
            doReturn(false).when(varIntMock).fitsInt();
            doReturn(0).when(varIntMock).intValue();
            preconditions.when(() -> Preconditions.check(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            buffers.when(() -> Buffers.readBytes((ByteBuffer) any(), eq(0))).thenReturn(byteArray);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
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
    @Test()
    public void writeLengthPrefixedBytesTest() throws BufferOverflowException {
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        byte[] byteArray = new byte[]{};

        //Act Statement(s)
        ByteBuffer result = Buffers.writeLengthPrefixedBytes(byteBuffer, byteArray);
        byte[] byteArray2 = new byte[]{(byte) 0};
        ByteBuffer byteBuffer2 = byteBuffer.put(byteArray2);
        ByteBuffer byteBuffer3 = byteBuffer2.put(byteArray);

        //Assert statement(s)
        assertThat(result, equalTo(byteBuffer3));
    }

    //Sapient generated method id: ${b4036d7b-18f3-389d-b547-a6d18fa86ef1}
    @Test()
    public void readLengthPrefixedStringTest() throws BufferUnderflowException {
        //Arrange Statement(s)
        try (MockedStatic<Buffers> buffers = mockStatic(Buffers.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            buffers.when(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any())).thenReturn(byteArray);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            String result = Buffers.readLengthPrefixedString(byteBuffer);
            //Assert statement(s)
            assertThat(result, equalTo("result1"));
            buffers.verify(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${6d4cf47f-6528-343a-bfcf-d3a90b02c138}
    @Test()
    public void writeLengthPrefixedStringTest() throws BufferOverflowException {
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);

        //Act Statement(s)
        ByteBuffer result = Buffers.writeLengthPrefixedString(byteBuffer, "str1");
        byte[] byteArray = new byte[]{(byte) 4};
        ByteBuffer byteBuffer2 = byteBuffer.put(byteArray);
        byte[] byteArray2 = new byte[]{(byte) 115, (byte) 116, (byte) 114, (byte) 49};
        ByteBuffer byteBuffer3 = byteBuffer2.put(byteArray2);

        //Assert statement(s)
        assertThat(result, equalTo(byteBuffer3));
    }

    //Sapient generated method id: ${7c226d76-20c9-30bc-beb6-88b35eb2cf1c}
    @Test()
    public void skipBytesWhenNumBytesLessThan0ThrowsIllegalArgumentException() throws BufferUnderflowException {
        /* Branches:
         * (numBytes >= 0) : false
         */
        //Arrange Statement(s)
        thrown.expect(IllegalArgumentException.class);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);

        //Act Statement(s)
        Buffers.skipBytes(byteBuffer, -1);
    }

    //Sapient generated method id: ${060e9511-4881-3c15-b4e2-affe91af837f}
    @Test()
    public void skipBytesWhenNumBytesLessThanOrEqualsToBufRemaining() throws Throwable {
        /* Branches:
         * (numBytes >= 0) : true
         * (numBytes <= buf.remaining()) : true
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);

        //Act Statement(s)
        ByteBuffer result = Buffers.skipBytes(byteBuffer, 1);

        //Assert statement(s)
        assertThat(result, equalTo(byteBuffer));
    }

    //Sapient generated method id: ${674324a2-b844-3aac-8410-15c1f738c154}
    @Test()
    public void skipBytesWhenNumBytesGreaterThanBufRemainingThrowsThrowable() throws Throwable {
        /* Branches:
         * (numBytes >= 0) : true
         * (numBytes <= buf.remaining()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        thrown.expect(Throwable.class);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);

        //Act Statement(s)
        Buffers.skipBytes(byteBuffer, 2);
    }
}
