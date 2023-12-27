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

public class BuffersSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final VarInt varIntMock = mock(VarInt.class);

    //Sapient generated method id: ${53004c16-0c3e-3d32-a417-c11d744f0919}
    @Ignore()
    @Test()
    public void readBytesWhenLengthLessThanOrEqualsToBufRemaining() throws Throwable {
        /* Branches:
         * (length <= buf.remaining()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.check(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            byte[] result = Buffers.readBytes(byteBuffer, 5);
            byte[] byteResultArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            //Assert statement(s)
            assertThat(result, equalTo(byteResultArray));
            preconditions.verify(() -> Preconditions.check(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${98e545b5-a182-3aec-814c-7205d01c4c38}
    @Test()
    public void readBytesWhenLengthGreaterThanBufRemaining() throws Throwable {
        /* Branches:
         * (length <= buf.remaining()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
    preconditions.when(() -> Preconditions.check(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    //Act Statement(s)
    byte[] result = Buffers.readBytes(byteBuffer, 5);
    byte[] byteResultArray = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
    //Assert statement(s)
    assertThat(result, equalTo(byteResultArray));
    preconditions.verify(() -> Preconditions.check(eq(false), (Supplier) any()));
}*/
    }

    //Sapient generated method id: ${0f68867a-7aa1-31d5-8ecb-932e5fb5ed8f}
    @Test()
    public void readLengthPrefixedBytesTest() throws Throwable {
        //Arrange Statement(s)
        /*try (MockedStatic<Buffers> buffers = mockStatic(Buffers.class, CALLS_REAL_METHODS);
    MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
    MockedStatic<VarInt> varInt = mockStatic(VarInt.class)) {
    VarInt varInt2 = new VarInt(0L);
    varInt.when(() -> VarInt.read((ByteBuffer) any())).thenReturn(varInt2);
    preconditions.when(() -> Preconditions.check(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    byte[] byteArray = new byte[] {};
    buffers.when(() -> Buffers.readBytes((ByteBuffer) any(), eq(5))).thenReturn(byteArray);
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    //Act Statement(s)
    byte[] result = Buffers.readLengthPrefixedBytes(byteBuffer);
    //Assert statement(s)
    assertThat(result, equalTo(byteArray));
    varInt.verify(() -> VarInt.read((ByteBuffer) any()), atLeast(1));
    preconditions.verify(() -> Preconditions.check(eq(true), (Supplier) any()), atLeast(1));
    buffers.verify(() -> Buffers.readBytes((ByteBuffer) any(), eq(5)), atLeast(1));
}*/
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
        /*try (MockedStatic<VarInt> varInt = mockStatic(VarInt.class)) {
    VarInt varInt2 = new VarInt(0L);
    varInt.when(() -> VarInt.of(2L)).thenReturn(varInt2);
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    byte[] byteArray2 = new byte[] { (byte) 72, (byte) 101, (byte) 108, (byte) 108, (byte) 111, (byte) 44, (byte) 32, (byte) 87, (byte) 111, (byte) 114, (byte) 108, (byte) 100, (byte) 33 };
    byte[][] byteArray4 = new byte[][] { (byte) 13 };
    byte[] byteArray3 = new byte[] { byteArray4 };
    byte[] byteArray = new byte[] { byteArray2, byteArray3 };
    //Act Statement(s)
    ByteBuffer result = Buffers.writeLengthPrefixedBytes(byteBuffer, byteArray);
    byte[] byteArray5 = new byte[] {};
    ByteBuffer byteBuffer2 = byteBuffer.put(byteArray5);
    ByteBuffer byteBuffer3 = byteBuffer2.put(byteArray);
    //Assert statement(s)
    assertThat(result, equalTo(byteBuffer3));
    varInt.verify(() -> VarInt.of(2L), atLeast(1));
}*/
    }

    //Sapient generated method id: ${b4036d7b-18f3-389d-b547-a6d18fa86ef1}
    @Ignore()
    @Test()
    public void readLengthPrefixedStringTest() throws BufferUnderflowException {
        //Arrange Statement(s)
        /*try (MockedStatic<Buffers> buffers = mockStatic(Buffers.class, CALLS_REAL_METHODS)) {
    byte[] byteArray = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
    buffers.when(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any())).thenReturn(byteArray);
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    //Act Statement(s)
    String result = Buffers.readLengthPrefixedString(byteBuffer);
    //Assert statement(s)
    assertThat(result, equalTo("result1"));
    buffers.verify(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any()), atLeast(1));
}*/
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
        /*try (MockedStatic<VarInt> varInt = mockStatic(VarInt.class)) {
    VarInt varInt2 = new VarInt(0L);
    varInt.when(() -> VarInt.of(13L)).thenReturn(varInt2);
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    //Act Statement(s)
    ByteBuffer result = Buffers.writeLengthPrefixedString(byteBuffer, "Hello, World!");
    byte[] byteArray = new byte[] {};
    ByteBuffer byteBuffer2 = byteBuffer.put(byteArray);
    byte[] byteArray2 = new byte[] { (byte) 72, (byte) 101, (byte) 108, (byte) 108, (byte) 111, (byte) 44, (byte) 32, (byte) 87, (byte) 111, (byte) 114, (byte) 108, (byte) 100, (byte) 33 };
    ByteBuffer byteBuffer3 = byteBuffer2.put(byteArray2);
    //Assert statement(s)
    assertThat(result, equalTo(byteBuffer3));
    varInt.verify(() -> VarInt.of(13L), atLeast(1));
}*/
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
            ByteBuffer result = Buffers.skipBytes(byteBuffer, 5);
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
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
    preconditions.when(() -> Preconditions.check(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    //Act Statement(s)
    ByteBuffer result = Buffers.skipBytes(byteBuffer, 10);
    //Assert statement(s)
    assertThat(result, equalTo(byteBuffer));
    preconditions.verify(() -> Preconditions.check(eq(false), (Supplier) any()), atLeast(1));
}*/
    }

    //Sapient generated method id: ${a5f8ff13-6648-3d39-98c9-43357403209b}
    @Ignore()
    @Test()
    public void skipBytesWhenNumBytesLessThan0AndNumBytesLessThanOrEqualsToBufRemaining() throws Throwable {
        /* Branches:
         * (numBytes >= 0) : false
         * (numBytes <= buf.remaining()) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class, CALLS_REAL_METHODS)) {
            preconditions.when(() -> Preconditions.check(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            ByteBuffer result = Buffers.skipBytes(byteBuffer, 0);
            //Assert statement(s)
            assertThat(result, equalTo(byteBuffer));
            preconditions.verify(() -> Preconditions.check(eq(false), (Supplier) any()), atLeast(1));
        }
    }
}
