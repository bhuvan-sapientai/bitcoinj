package org.bitcoinj.base.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.nio.BufferOverflowException;
import java.io.IOException;
import java.nio.BufferUnderflowException;

import org.junit.rules.ExpectedException;
import org.mockito.stubbing.Answer;

import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.io.OutputStream;
import java.nio.ByteOrder;
import java.math.BigInteger;
import java.util.function.Supplier;

import org.mockito.MockedStatic;

import java.io.InputStream;
import java.util.Comparator;
import java.io.ByteArrayOutputStream;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.isA;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

import static org.hamcrest.core.IsInstanceOf.instanceOf;

public class ByteUtilsSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${a1a42a93-2964-364e-ae5a-e96abe25ad1a}
    @Test()
    public void formatHexTest() {
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        String result = ByteUtils.formatHex(byteArray);
        //Assert statement(s)
        assertThat(result, equalTo(""));
    }

    //Sapient generated method id: ${580453a4-e184-3185-ab2c-e0f9f73edb9b}
    @Ignore()
    @Test()
    public void parseHexTest() {
        //Act Statement(s)
        //byte[] result = ByteUtils.parseHex("deadbeef");
        //byte[] byteResultArray = new byte[] { (byte) -34, (byte) -83, (byte) -66, (byte) -17 };
        //Assert statement(s)
        //assertThat(result, equalTo(byteResultArray));
    }

    //Sapient generated method id: ${51ea814b-c6b0-34f7-ae12-8aeea26d00d2}
    @Test()
    public void bigIntegerToBytesWhenBSignumGreaterThanOrEqualsTo0ThrowsIllegalArgumentException() {
        /* Branches:
         * (b.signum() >= 0) : true
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
    preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
    thrown.expect(IllegalArgumentException.class);
    //Act Statement(s)
    ByteUtils.bigIntegerToBytes(new BigInteger("1"), 0);
    //Assert statement(s)
    preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
}*/
    }

    //Sapient generated method id: ${240570e6-d6da-34fb-af38-5f281ff3979e}
    @Test()
    public void bigIntegerToBytesWhenBSignumLessThan0ThrowsIllegalArgumentException() {
        /* Branches:
         * (b.signum() >= 0) : false
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
    preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
    thrown.expect(IllegalArgumentException.class);
    //Act Statement(s)
    ByteUtils.bigIntegerToBytes(new BigInteger("-1"), 0);
    //Assert statement(s)
    preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
}*/
    }

    //Sapient generated method id: ${b3945d42-54f6-3164-8a3c-b71822b203ef}
    @Test()
    public void bytesToBigIntegerTest() {
        //Arrange Statement(s)
        //byte[] byteArray = new byte[] {};
        //Act Statement(s)
        //BigInteger result = ByteUtils.bytesToBigInteger(byteArray);
        //Assert statement(s)
        //assertThat(result, equalTo(new BigInteger("0")));
    }

    //Sapient generated method id: ${4a8bf076-7f76-36c0-a7db-e3adffe3cc7d}
    @Test()
    public void writeInt16LEWhenValLessThanOrEqualsToMAX_UNSIGNED_SHORTThrowsIllegalArgumentException() throws BufferOverflowException {
        /* Branches:
         * (val >= 0) : true
         * (val <= MAX_UNSIGNED_SHORT) : true
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
    preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
    thrown.expect(IllegalArgumentException.class);
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    //Act Statement(s)
    ByteUtils.writeInt16LE(1, byteBuffer);
    //Assert statement(s)
    preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
}*/
    }

    //Sapient generated method id: ${b6847f04-699f-390d-843f-59344108b58d}
    @Test()
    public void writeInt16LEWhenValGreaterThanMAX_UNSIGNED_SHORTThrowsIllegalArgumentException() throws BufferOverflowException {
        /* Branches:
         * (val >= 0) : true
         * (val <= MAX_UNSIGNED_SHORT) : false
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
    preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
    thrown.expect(IllegalArgumentException.class);
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    //Act Statement(s)
    ByteUtils.writeInt16LE(65536, byteBuffer);
    //Assert statement(s)
    preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
}*/
    }

    //Sapient generated method id: ${c02d957e-4378-387e-8ee4-f4630745dae2}
    @Ignore()
    @Test()
    public void writeInt16LE1WhenOffsetLessThanOrEqualsToOutLengthMinus2() throws Throwable {
        /* Branches:
         * (offset >= 0) : true
         * (offset <= out.length - 2) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.check(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            byteUtils.when(() -> ByteUtils.writeInt16LE(eq(0), (ByteBuffer) any())).thenReturn(byteBuffer);
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1};
            //Act Statement(s)
            ByteUtils.writeInt16LE(0, byteArray, 0);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.check(eq(false), (Supplier) any()), atLeast(1));
            byteUtils.verify(() -> ByteUtils.writeInt16LE(eq(0), (ByteBuffer) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${aa0ea5ad-5e38-3b74-b6fe-f5ce27986319}
    @Ignore()
    @Test()
    public void writeInt16LE1WhenOffsetGreaterThanOutLengthMinus2() throws Throwable {
        /* Branches:
         * (offset >= 0) : true
         * (offset <= out.length - 2) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS);
    MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
    preconditions.when(() -> Preconditions.check(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    byteUtils.when(() -> ByteUtils.writeInt16LE(eq(0), (ByteBuffer) any())).thenReturn(byteBuffer);
    byte[] byteArray = new byte[] {};
    //Act Statement(s)
    ByteUtils.writeInt16LE(0, byteArray, 1);
    //Assert statement(s)
    preconditions.verify(() -> Preconditions.check(eq(false), (Supplier) any()), atLeast(1));
    byteUtils.verify(() -> ByteUtils.writeInt16LE(eq(0), (ByteBuffer) any()), atLeast(1));
}*/
    }

    //Sapient generated method id: ${70e13fa2-2d5e-3fc2-83ad-128c1c82c703}
    @Ignore()
    @Test()
    public void writeInt16BEWhenValLessThanOrEqualsToMAX_UNSIGNED_SHORTThrowsIllegalArgumentException() throws BufferOverflowException {
        /* Branches:
         * (val >= 0) : true
         * (val <= MAX_UNSIGNED_SHORT) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            thrown.expect(IllegalArgumentException.class);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            ByteUtils.writeInt16BE(1, byteBuffer);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${fcbf0840-da87-3dba-98b3-43cba075b859}
    @Test()
    public void writeInt16BEWhenValGreaterThanMAX_UNSIGNED_SHORTThrowsIllegalArgumentException() throws BufferOverflowException {
        /* Branches:
         * (val >= 0) : true
         * (val <= MAX_UNSIGNED_SHORT) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            thrown.expect(IllegalArgumentException.class);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            ByteUtils.writeInt16BE(65536, byteBuffer);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${18eae58d-bd27-3ea7-aa78-94377150e7e1}
    @Ignore()
    @Test()
    public void writeInt16BE1WhenOffsetLessThanOrEqualsToOutLengthMinus2() throws Throwable {
        /* Branches:
         * (offset >= 0) : true
         * (offset <= out.length - 2) : true
         */
        //Arrange Statement(s)
        /*try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS);
    MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
    preconditions.when(() -> Preconditions.check(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    byteUtils.when(() -> ByteUtils.writeInt16BE(eq(0), (ByteBuffer) any())).thenReturn(byteBuffer);
    byte[] byteArray = new byte[] { (byte) 0, (byte) 1 };
    //Act Statement(s)
    ByteUtils.writeInt16BE(0, byteArray, 0);
    //Assert statement(s)
    preconditions.verify(() -> Preconditions.check(eq(false), (Supplier) any()), atLeast(1));
    byteUtils.verify(() -> ByteUtils.writeInt16BE(eq(0), (ByteBuffer) any()), atLeast(1));
}*/
    }

    //Sapient generated method id: ${9c3d8f1d-f27e-3934-ae4e-c36cea5fabef}
    @Ignore()
    @Test()
    public void writeInt16BE1WhenOffsetGreaterThanOutLengthMinus2() throws Throwable {
        /* Branches:
         * (offset >= 0) : true
         * (offset <= out.length - 2) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS);
    MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
    preconditions.when(() -> Preconditions.check(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    byteUtils.when(() -> ByteUtils.writeInt16BE(eq(0), (ByteBuffer) any())).thenReturn(byteBuffer);
    byte[] byteArray = new byte[] {};
    //Act Statement(s)
    ByteUtils.writeInt16BE(0, byteArray, 1);
    //Assert statement(s)
    preconditions.verify(() -> Preconditions.check(eq(false), (Supplier) any()), atLeast(1));
    byteUtils.verify(() -> ByteUtils.writeInt16BE(eq(0), (ByteBuffer) any()), atLeast(1));
}*/
    }

    //Sapient generated method id: ${90702ae5-78a1-3c18-a89a-f2fe95cea03b}
    @Ignore()
    @Test()
    public void writeInt32LETest() throws BufferOverflowException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        //Act Statement(s)
        //ByteBuffer result = ByteUtils.writeInt32LE(10, byteBuffer);
        //ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        //ByteBuffer byteBuffer2 = byteBuffer.order(byteOrder);
        //ByteBuffer byteBuffer3 = byteBuffer2.putInt(10);
        //Assert statement(s)
        //assertThat(result, equalTo(byteBuffer3));
    }

    //Sapient generated method id: ${16d60048-7661-3a24-9d35-f624095349aa}
    @Test()
    public void writeInt32LE1WhenValLessThanOrEqualsToMAX_UNSIGNED_INTEGERThrowsIllegalArgumentException() throws BufferOverflowException {
        /* Branches:
         * (val >= 0) : true
         * (val <= MAX_UNSIGNED_INTEGER) : true
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
    preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
    thrown.expect(IllegalArgumentException.class);
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    //Act Statement(s)
    ByteUtils.writeInt32LE(0L, byteBuffer);
    //Assert statement(s)
    preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
}*/
    }

    //Sapient generated method id: ${a0d96dd7-0bb0-3839-97d8-9b3e958d72fa}
    @Test()
    public void writeInt32LE1WhenValGreaterThanMAX_UNSIGNED_INTEGERThrowsIllegalArgumentException() throws BufferOverflowException {
        /* Branches:
         * (val >= 0) : true
         * (val <= MAX_UNSIGNED_INTEGER) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            thrown.expect(IllegalArgumentException.class);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            ByteUtils.writeInt32LE(4294967296L, byteBuffer);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${8d0de121-a99a-3cb5-adae-f003e053238f}
    @Ignore()
    @Test()
    public void writeInt32LE2WhenOffsetLessThanOrEqualsToOutLengthMinus4() throws Throwable {
        /* Branches:
         * (offset >= 0) : true
         * (offset <= out.length - 4) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.check(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            byteUtils.when(() -> ByteUtils.writeInt32LE(eq(0L), (ByteBuffer) any())).thenReturn(byteBuffer);
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3};
            //Act Statement(s)
            ByteUtils.writeInt32LE(0L, byteArray, 0);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.check(eq(false), (Supplier) any()), atLeast(1));
            byteUtils.verify(() -> ByteUtils.writeInt32LE(eq(0L), (ByteBuffer) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${cacad61e-673a-3b0b-9d8a-4b368e088624}
    @Ignore()
    @Test()
    public void writeInt32LE2WhenOffsetGreaterThanOutLengthMinus4() throws Throwable {
        /* Branches:
         * (offset >= 0) : true
         * (offset <= out.length - 4) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.check(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            byteUtils.when(() -> ByteUtils.writeInt32LE(eq(0L), (ByteBuffer) any())).thenReturn(byteBuffer);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            ByteUtils.writeInt32LE(0L, byteArray, 1);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.check(eq(false), (Supplier) any()), atLeast(1));
            byteUtils.verify(() -> ByteUtils.writeInt32LE(eq(0L), (ByteBuffer) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${75d5d07b-31f8-3d8a-8d93-794071375361}
    @Ignore()
    @Test()
    public void writeInt32BEWhenValLessThanOrEqualsToMAX_UNSIGNED_INTEGERThrowsIllegalArgumentException() throws BufferOverflowException {
        /* Branches:
         * (val >= 0) : true
         * (val <= MAX_UNSIGNED_INTEGER) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            thrown.expect(IllegalArgumentException.class);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            ByteUtils.writeInt32BE(0L, byteBuffer);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${2dddef9c-d42b-3aff-8f6e-99e5cd1eb33e}
    @Test()
    public void writeInt32BEWhenValGreaterThanMAX_UNSIGNED_INTEGERThrowsIllegalArgumentException() throws BufferOverflowException {
        /* Branches:
         * (val >= 0) : true
         * (val <= MAX_UNSIGNED_INTEGER) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            thrown.expect(IllegalArgumentException.class);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            ByteUtils.writeInt32BE(4294967296L, byteBuffer);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${ee8370c3-cdea-33f9-8aa7-acdcb9fa1983}
    @Ignore()
    @Test()
    public void writeInt32BE1Test() throws BufferOverflowException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        //Act Statement(s)
        //ByteBuffer result = ByteUtils.writeInt32BE(1, byteBuffer);
        //ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        //ByteBuffer byteBuffer2 = byteBuffer.order(byteOrder);
        //ByteBuffer byteBuffer3 = byteBuffer2.putInt(1);
        //Assert statement(s)
        //assertThat(result, equalTo(byteBuffer3));
    }

    //Sapient generated method id: ${c0f804ae-483d-346d-8589-c9bd2b80b514}
    @Ignore()
    @Test()
    public void writeInt32BE2WhenOffsetLessThanOrEqualsToOutLengthMinus4() throws Throwable {
        /* Branches:
         * (offset >= 0) : true
         * (offset <= out.length - 4) : true
         */
        //Arrange Statement(s)
        /*try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS);
    MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
    preconditions.when(() -> Preconditions.check(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    byteUtils.when(() -> ByteUtils.writeInt32BE(eq(0L), (ByteBuffer) any())).thenReturn(byteBuffer);
    byte[] byteArray = new byte[] { (byte) 0, (byte) 1, (byte) 2, (byte) 3 };
    //Act Statement(s)
    ByteUtils.writeInt32BE(0L, byteArray, 0);
    //Assert statement(s)
    preconditions.verify(() -> Preconditions.check(eq(false), (Supplier) any()), atLeast(1));
    byteUtils.verify(() -> ByteUtils.writeInt32BE(eq(0L), (ByteBuffer) any()), atLeast(1));
}*/
    }

    //Sapient generated method id: ${f0e02921-4b9e-3fc4-b9e1-926c311ff155}
    @Test()
    public void writeInt32BE2WhenOffsetGreaterThanOutLengthMinus4() throws Throwable {
        /* Branches:
         * (offset >= 0) : true
         * (offset <= out.length - 4) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS);
    MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
    preconditions.when(() -> Preconditions.check(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    //TODO: Needs to return real value
    byteUtils.when(() -> ByteUtils.writeInt32BE(eq(0L), (ByteBuffer) any())).thenReturn(null);
    byte[] byteArray = new byte[] { (byte) 0 };
    //Act Statement(s)
    ByteUtils.writeInt32BE(0L, byteArray, 0);
    //Assert statement(s)
    preconditions.verify(() -> Preconditions.check(eq(false), (Supplier) any()), atLeast(1));
    byteUtils.verify(() -> ByteUtils.writeInt32BE(eq(0L), (ByteBuffer) any()), atLeast(1));
}*/
    }

    //Sapient generated method id: ${c1337eb1-aa9f-3b62-b38a-b94cef7d7b46}
    @Ignore()
    @Test()
    public void writeInt32BE3Test() throws ArrayIndexOutOfBoundsException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //byte[] byteArray = new byte[] { (byte) 0 };
        //Act Statement(s)
        //ByteUtils.writeInt32BE(0, byteArray, 1);
    }

    //Sapient generated method id: ${3107c0d9-f616-3ee7-9a32-7c1e75e66a91}
    @Ignore()
    @Test()
    public void writeInt64LETest() throws BufferOverflowException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        //Act Statement(s)
        //ByteBuffer result = ByteUtils.writeInt64LE(123456789L, byteBuffer);
        //ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        //ByteBuffer byteBuffer2 = byteBuffer.order(byteOrder);
        //ByteBuffer byteBuffer3 = byteBuffer2.putLong(123456789L);
        //Assert statement(s)
        //assertThat(result, equalTo(byteBuffer3));
    }

    //Sapient generated method id: ${1739393c-9b23-32f9-948e-9907c0163c70}
    @Ignore()
    @Test()
    public void writeInt64LE1WhenOffsetLessThanOrEqualsToOutLengthPlus8() throws Throwable {
        /* Branches:
         * (offset >= 0) : true
         * (offset <= out.length + 8) : true
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
    preconditions.when(() -> Preconditions.check(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    byte[] byteArray = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
    //Act Statement(s)
    ByteUtils.writeInt64LE(1234567890L, byteArray, 2);
    //Assert statement(s)
    preconditions.verify(() -> Preconditions.check(eq(false), (Supplier) any()));
}*/
    }

    //Sapient generated method id: ${bce79d81-311d-3f17-b4f1-875e8e4a5123}
    @Ignore()
    @Test()
    public void writeInt64LE1WhenOffsetGreaterThanOutLengthPlus8() throws Throwable {
        /* Branches:
         * (offset >= 0) : true
         * (offset <= out.length + 8) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
    preconditions.when(() -> Preconditions.check(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    byte[] byteArray = new byte[] {};
    //Act Statement(s)
    ByteUtils.writeInt64LE(0L, byteArray, 9);
    //Assert statement(s)
    preconditions.verify(() -> Preconditions.check(eq(false), (Supplier) any()));
}*/
    }

    //Sapient generated method id: ${d75fde81-8ff1-3599-98ee-84c251f6efbc}
    @Test()
    public void writeInt16LE2Test() throws IOException {
        //Arrange Statement(s)
        /*try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS)) {
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    byteUtils.when(() -> ByteUtils.writeInt16LE(eq(0), (ByteBuffer) any())).thenReturn(byteBuffer);
    OutputStream outputStream = OutputStream.nullOutputStream();
    //Act Statement(s)
    ByteUtils.writeInt16LE(0, outputStream);
    //Assert statement(s)
    byteUtils.verify(() -> ByteUtils.writeInt16LE(eq(0), (ByteBuffer) any()), atLeast(1));
}*/
    }

    //Sapient generated method id: ${39e25293-72e5-3c5f-9a0e-bae1727d1fd3}
    @Test()
    public void writeInt16BE2Test() throws IOException {
        //Arrange Statement(s)
        /*try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS)) {
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    byteUtils.when(() -> ByteUtils.writeInt16BE(eq(0), (ByteBuffer) any())).thenReturn(byteBuffer);
    OutputStream outputStream = OutputStream.nullOutputStream();
    //Act Statement(s)
    ByteUtils.writeInt16BE(0, outputStream);
    //Assert statement(s)
    byteUtils.verify(() -> ByteUtils.writeInt16BE(eq(0), (ByteBuffer) any()), atLeast(1));
}*/
    }

    //Sapient generated method id: ${95dd964f-cb54-31d5-b569-fb08ab70904b}
    @Test()
    public void writeInt32LE3Test() throws IOException {
        //Arrange Statement(s)
        //OutputStream outputStream = OutputStream.nullOutputStream();
        //Act Statement(s)
        //ByteUtils.writeInt32LE(1, outputStream);
    }

    //Sapient generated method id: ${e9b49726-36b7-3788-9f5e-b898e0379b4d}
    @Test()
    public void writeInt32LE4Test() throws IOException {
        //Arrange Statement(s)
        /*try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS)) {
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    byteUtils.when(() -> ByteUtils.writeInt32LE(eq(0L), (ByteBuffer) any())).thenReturn(byteBuffer);
    OutputStream outputStream = OutputStream.nullOutputStream();
    //Act Statement(s)
    ByteUtils.writeInt32LE(0L, outputStream);
    //Assert statement(s)
    byteUtils.verify(() -> ByteUtils.writeInt32LE(eq(0L), (ByteBuffer) any()), atLeast(1));
}*/
    }

    //Sapient generated method id: ${5ee935e9-501e-3657-85b8-d539878c786a}
    @Test()
    public void writeInt32BE4Test() throws IOException {
        //Arrange Statement(s)
        /*try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS)) {
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    byteUtils.when(() -> ByteUtils.writeInt32BE(eq(0L), (ByteBuffer) any())).thenReturn(byteBuffer);
    OutputStream outputStream = OutputStream.nullOutputStream();
    //Act Statement(s)
    ByteUtils.writeInt32BE(0L, outputStream);
    //Assert statement(s)
    byteUtils.verify(() -> ByteUtils.writeInt32BE(eq(0L), (ByteBuffer) any()), atLeast(1));
}*/
    }

    //Sapient generated method id: ${5e8d42b3-f773-3d38-84b6-4048f7f402cc}
    @Test()
    public void writeInt32BE5Test() throws IOException {
        //Arrange Statement(s)
        //OutputStream outputStream = OutputStream.nullOutputStream();
        //Act Statement(s)
        //ByteUtils.writeInt32BE(1, outputStream);
    }

    //Sapient generated method id: ${f5b61329-69ee-36ab-a1bc-264adece512b}
    @Test()
    public void writeInt64LE2Test() throws IOException {
        //Arrange Statement(s)
        //OutputStream outputStream = OutputStream.nullOutputStream();
        //Act Statement(s)
        //ByteUtils.writeInt64LE(1L, outputStream);
    }

    //Sapient generated method id: ${4dd9db97-a518-3d76-99ae-1582afbb261b}
    @Test()
    public void writeInt64LE3WhenBytesLengthGreaterThan8ThrowsRuntimeException() throws IOException {
        /* Branches:
         * (bytes.length > 8) : true
         */
        //Arrange Statement(s)
        //RuntimeException runtimeException = new RuntimeException("Input too large to encode into a uint64");
        //thrown.expect(RuntimeException.class);
        //thrown.expectMessage(runtimeException.getMessage());
        //OutputStream outputStream = OutputStream.nullOutputStream();
        //Act Statement(s)
        //ByteUtils.writeInt64LE(new BigInteger("12345678901234567890"), outputStream);
    }

    //Sapient generated method id: ${1935ae8d-495c-323d-8fd7-ba7c5987ebd6}
    @Test()
    public void writeInt64LE3WhenBytesLengthNotLessThan8() throws IOException {
        /* Branches:
         * (bytes.length > 8) : false
         * (bytes.length < 8) : false
         */
        //Arrange Statement(s)
        /*try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS)) {
    byte[] byteArray = new byte[] { (byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7 };
    byte[] byteArray2 = new byte[] { (byte) 1 };
    byteUtils.when(() -> ByteUtils.reverseBytes(byteArray2)).thenReturn(byteArray);
    OutputStream outputStream = OutputStream.nullOutputStream();
    //Act Statement(s)
    ByteUtils.writeInt64LE(new BigInteger("1"), outputStream);
    //Assert statement(s)
    byteUtils.verify(() -> ByteUtils.reverseBytes(byteArray2), atLeast(1));
}*/
    }

    //Sapient generated method id: ${3d92ff90-4ee3-38a3-b721-e50953452e8a}
    @Test()
    public void writeInt64LE3WhenILessThan8MinusBytesLength() throws IOException {
        /* Branches:
         * (bytes.length > 8) : false
         * (bytes.length < 8) : true
         * (i < 8 - bytes.length) : true
         */
        //Arrange Statement(s)
        /*try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS)) {
    byte[] byteArray = new byte[] {};
    byte[] byteArray2 = new byte[] { (byte) 1 };
    byteUtils.when(() -> ByteUtils.reverseBytes(byteArray2)).thenReturn(byteArray);
    OutputStream outputStream = OutputStream.nullOutputStream();
    //Act Statement(s)
    ByteUtils.writeInt64LE(new BigInteger("1"), outputStream);
    //Assert statement(s)
    byteUtils.verify(() -> ByteUtils.reverseBytes(byteArray2), atLeast(1));
}*/
    }

    //Sapient generated method id: ${3ec59269-3494-3004-81e4-b34bd1d7f3fd}
    @Ignore()
    @Test()
    public void readUint16Test() throws BufferUnderflowException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        //Act Statement(s)
        //int result = ByteUtils.readUint16(byteBuffer);
        //Assert statement(s)
        //assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${e8435c57-3381-31d1-adb9-7ff62c01fc8e}
    @Ignore()
    @Test()
    public void readUint161WhenOffsetLessThanOrEqualsToBytesLengthMinus2() throws Throwable {
        /* Branches:
         * (offset >= 0) : true
         * (offset <= bytes.length - 2) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.check(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1};
            //Act Statement(s)
            int result = ByteUtils.readUint16(byteArray, 0);
            //Assert statement(s)
            assertThat(result, equalTo(256));
            preconditions.verify(() -> Preconditions.check(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${794ca94e-9e27-358a-8deb-fe3af4823023}
    @Ignore()
    @Test()
    public void readUint161WhenOffsetGreaterThanBytesLengthMinus2() throws Throwable {
        /* Branches:
         * (offset >= 0) : true
         * (offset <= bytes.length - 2) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.check(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3};
            //Act Statement(s)
            int result = ByteUtils.readUint16(byteArray, 3);
            //Assert statement(s)
            assertThat(result, equalTo(0));
            preconditions.verify(() -> Preconditions.check(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${691b85f3-56f5-39fd-95f0-d927974f594d}
    @Ignore()
    @Test()
    public void readUint16BETest() throws BufferUnderflowException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        //Act Statement(s)
        int result = ByteUtils.readUint16BE(byteBuffer);
        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${e1b5de29-f600-3beb-9827-0b3f41ee0ead}
    @Ignore()
    @Test()
    public void readUint16BE1WhenOffsetLessThanOrEqualsToBytesLengthMinus2() throws Throwable {
        /* Branches:
         * (offset >= 0) : true
         * (offset <= bytes.length - 2) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.check(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1};
            //Act Statement(s)
            int result = ByteUtils.readUint16BE(byteArray, 0);
            //Assert statement(s)
            assertThat(result, equalTo(1));
            preconditions.verify(() -> Preconditions.check(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${de78c0b2-00c3-3300-8638-e5cdcb4b9dde}
    @Ignore()
    @Test()
    public void readUint16BE1WhenOffsetGreaterThanBytesLengthMinus2() throws Throwable {
        /* Branches:
         * (offset >= 0) : true
         * (offset <= bytes.length - 2) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.check(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            int result = ByteUtils.readUint16BE(byteArray, 1);
            //Assert statement(s)
            assertThat(result, equalTo(0));
            preconditions.verify(() -> Preconditions.check(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${f56eca6f-00a7-31f7-a95d-12e0fc137e88}
    @Ignore()
    @Test()
    public void readUint32Test() throws BufferUnderflowException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        //Act Statement(s)
        long result = ByteUtils.readUint32(byteBuffer);
        //Assert statement(s)
        assertThat(result, equalTo(1L));
    }

    //Sapient generated method id: ${8ef5eed9-ce81-3fd7-9c78-c25a658d4861}
    @Ignore()
    @Test()
    public void readInt32Test() throws BufferUnderflowException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        //Act Statement(s)
        int result = ByteUtils.readInt32(byteBuffer);
        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${4ddd9ef0-e566-3119-a804-76a414b986ae}
    @Ignore()
    @Test()
    public void readUint321WhenOffsetLessThanOrEqualsToBytesLengthMinus4() throws Throwable {
        /* Branches:
         * (offset >= 0) : true
         * (offset <= bytes.length - 4) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.check(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3};
            //Act Statement(s)
            long result = ByteUtils.readUint32(byteArray, 0);
            //Assert statement(s)
            assertThat(result, equalTo(50462976L));
            preconditions.verify(() -> Preconditions.check(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${81ec20ce-de49-3f00-9302-c81ff3b2b9fc}
    @Ignore()
    @Test()
    public void readUint321WhenOffsetGreaterThanBytesLengthMinus4() throws Throwable {
        /* Branches:
         * (offset >= 0) : true
         * (offset <= bytes.length - 4) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.check(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            long result = ByteUtils.readUint32(byteArray, 1);
            //Assert statement(s)
            assertThat(result, equalTo(1L));
            preconditions.verify(() -> Preconditions.check(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${cf37385e-05ea-39bd-bacc-b5ce6021e72e}
    @Ignore()
    @Test()
    public void readUint32BETest() throws BufferUnderflowException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        //Act Statement(s)
        long result = ByteUtils.readUint32BE(byteBuffer);
        //Assert statement(s)
        assertThat(result, equalTo(1L));
    }

    //Sapient generated method id: ${ef8ec0c3-2c06-3937-8462-46a8b4d6e850}
    @Ignore()
    @Test()
    public void readUint32BE1WhenOffsetLessThanOrEqualsToBytesLengthMinus4() throws Throwable {
        /* Branches:
         * (offset >= 0) : true
         * (offset <= bytes.length - 4) : true
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
    preconditions.when(() -> Preconditions.check(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    byte[] byteArray = new byte[] { (byte) 0, (byte) 1, (byte) 2, (byte) 3 };
    //Act Statement(s)
    long result = ByteUtils.readUint32BE(byteArray, 0);
    //Assert statement(s)
    assertThat(result, equalTo(66051L));
    preconditions.verify(() -> Preconditions.check(eq(false), (Supplier) any()));
}*/
    }

    //Sapient generated method id: ${2f24b5ce-e688-39eb-8412-65b5729130d2}
    @Ignore()
    @Test()
    public void readUint32BE1WhenOffsetGreaterThanBytesLengthMinus4() throws Throwable {
        /* Branches:
         * (offset >= 0) : true
         * (offset <= bytes.length - 4) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
    preconditions.when(() -> Preconditions.check(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    byte[] byteArray = new byte[] { (byte) 0 };
    //Act Statement(s)
    long result = ByteUtils.readUint32BE(byteArray, 1);
    //Assert statement(s)
    assertThat(result, equalTo(1L));
    preconditions.verify(() -> Preconditions.check(eq(false), (Supplier) any()));
}*/
    }

    //Sapient generated method id: ${e37b82ea-430f-36d9-8f60-5437b3acf8b7}
    @Ignore()
    @Test()
    public void readInt64Test() throws BufferUnderflowException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        //Act Statement(s)
        //long result = ByteUtils.readInt64(byteBuffer);
        //Assert statement(s)
        //assertThat(result, equalTo(0L));
    }

    //Sapient generated method id: ${fc4c614b-4771-3f90-9c52-bcc3f7639382}
    @Ignore()
    @Test()
    public void readInt641WhenOffsetLessThanOrEqualsToBytesLengthMinus8() throws Throwable {
        /* Branches:
         * (offset >= 0) : true
         * (offset <= bytes.length - 8) : true
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
    preconditions.when(() -> Preconditions.check(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    byte[] byteArray = new byte[] { (byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7 };
    //Act Statement(s)
    long result = ByteUtils.readInt64(byteArray, 0);
    //Assert statement(s)
    assertThat(result, equalTo(506097522914230528L));
    preconditions.verify(() -> Preconditions.check(eq(false), (Supplier) any()));
}*/
    }

    //Sapient generated method id: ${53b7f491-557b-3a34-9c34-6677b1c27041}
    @Ignore()
    @Test()
    public void readInt641WhenOffsetGreaterThanBytesLengthMinus8() throws Throwable {
        /* Branches:
         * (offset >= 0) : true
         * (offset <= bytes.length - 8) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.check(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            long result = ByteUtils.readInt64(byteArray, 1);
            //Assert statement(s)
            assertThat(result, equalTo(0L));
            preconditions.verify(() -> Preconditions.check(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${09c51b4b-ce3f-3908-9360-464671ab2544}
    @Test()
    public void readUint162Test() throws IOException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        //Act Statement(s)
        int result = ByteUtils.readUint16(inputStream);
        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${bc2b736a-0a36-3d6d-8b87-fcffe948d9ff}
    @Ignore()
    @Test()
    public void readUint162WhenCaughtIOExceptionThrowsRuntimeException() throws IOException {
        /* Branches:
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        thrown.expect(RuntimeException.class);
        thrown.expectCause(is(instanceOf(IOException.class)));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        //Act Statement(s)
        ByteUtils.readUint16(inputStream);
    }

    //Sapient generated method id: ${02650c3a-6988-3d18-901c-b209a4b52952}
    @Test()
    public void readUint322Test() throws IOException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        //Act Statement(s)
        long result = ByteUtils.readUint32(inputStream);
        //Assert statement(s)
        assertThat(result, equalTo(0L));
    }

    //Sapient generated method id: ${cba7b769-6cfc-3964-a3b0-c0bcd9a3c544}
    @Ignore()
    @Test()
    public void readUint322WhenCaughtIOExceptionThrowsRuntimeException() throws IOException {
        /* Branches:
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        thrown.expect(RuntimeException.class);
        thrown.expectCause(is(instanceOf(IOException.class)));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        //Act Statement(s)
        ByteUtils.readUint32(inputStream);
    }

    //Sapient generated method id: ${17bba86a-c2dd-3542-8ba0-0d279fc6d499}
    @Test()
    public void reverseBytesWhenILessThanBytesLength() {
        /* Branches:
         * (i < bytes.length) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0};
        //Act Statement(s)
        byte[] result = ByteUtils.reverseBytes(byteArray);
        byte[] byteResultArray = new byte[]{(byte) 0};
        //Assert statement(s)
        assertThat(result, equalTo(byteResultArray));
    }

    //Sapient generated method id: ${21374b40-569d-3dec-92df-5a9b566df694}
    @Ignore()
    @Test()
    public void decodeMPIWhenBufLengthEquals0() {
        /* Branches:
         * (hasLength) : true
         * (buf.length == 0) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0};
            byteUtils.when(() -> ByteUtils.readUint32BE(byteArray, 0)).thenReturn(0L);
            //Act Statement(s)
            BigInteger result = ByteUtils.decodeMPI(byteArray, true);
            //Assert statement(s)
            assertThat(result, equalTo(new BigInteger("0")));
            byteUtils.verify(() -> ByteUtils.readUint32BE(byteArray, 0), atLeast(1));
        }
    }

    //Sapient generated method id: ${fea22f52-202e-3d9c-bc67-7e3b7d20b3c8}
    @Ignore()
    @Test()
    public void decodeMPIWhenNotIsNegative() {
        /* Branches:
         * (hasLength) : true
         * (buf.length == 0) : false
         * ((buf[0] & 0x80) == 0x80) : false
         * (isNegative) : false
         * (isNegative) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            byteUtils.when(() -> ByteUtils.readUint32BE(byteArray, 0)).thenReturn(1L);
            //Act Statement(s)
            BigInteger result = ByteUtils.decodeMPI(byteArray, true);
            //Assert statement(s)
            assertThat(result, equalTo(new BigInteger("0")));
            byteUtils.verify(() -> ByteUtils.readUint32BE(byteArray, 0), atLeast(1));
        }
    }

    //Sapient generated method id: ${249d2b72-be1c-34c4-834b-da1cc22db8c2}
    @Ignore()
    @Test()
    public void decodeMPIWhenIsNegative() {
        /* Branches:
         * (hasLength) : false
         * (buf.length == 0) : false
         * ((buf[0] & 0x80) == 0x80) : true
         * (isNegative) : true
         * (isNegative) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1};
        //Act Statement(s)
        BigInteger result = ByteUtils.decodeMPI(byteArray, false);
        byte[] byteByteArrayArray = new byte[]{(byte) -128, (byte) 1};
        //Assert statement(s)
        assertThat(result, equalTo(new BigInteger("-128")));
        assertThat(byteArray, equalTo(byteByteArrayArray));
    }

    //Sapient generated method id: ${337a9408-b301-362d-85c0-e73e50714290}
    @Test()
    public void encodeMPIWhenNotIncludeLength() {
        /* Branches:
         * (value.equals(BigInteger.ZERO)) : true
         * (!includeLength) : true
         */
        //Act Statement(s)
        byte[] result = ByteUtils.encodeMPI(new BigInteger("0"), false);
        byte[] byteResultArray = new byte[]{};
        //Assert statement(s)
        assertThat(result, equalTo(byteResultArray));
    }

    //Sapient generated method id: ${c2933f09-e5b8-3565-93d3-4fbb753a0857}
    @Test()
    public void encodeMPIWhenIncludeLength() {
        /* Branches:
         * (value.equals(BigInteger.ZERO)) : true
         * (!includeLength) : false
         */
        //Act Statement(s)
        byte[] result = ByteUtils.encodeMPI(new BigInteger("0"), true);
        byte[] byteResultArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0};
        //Assert statement(s)
        assertThat(result, equalTo(byteResultArray));
    }

    //Sapient generated method id: ${415464e0-893d-374c-a35c-3281425049c9}
    @Ignore()
    @Test()
    public void encodeMPIWhenIsNegative() {
        /* Branches:
         * (value.equals(BigInteger.ZERO)) : false
         * (value.signum() < 0) : true
         * (isNegative) : true
         * ((array[0] & 0x80) == 0x80) : true
         * (includeLength) : true
         * (isNegative) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) -128, (byte) 0};
            byteUtils.when(() -> ByteUtils.writeInt32BE(2, byteArray, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            byte[] result = ByteUtils.encodeMPI(new BigInteger("-1"), true);
            //Assert statement(s)
            assertThat(result, equalTo(byteArray));
            byteUtils.verify(() -> ByteUtils.writeInt32BE(2, byteArray, 0), atLeast(1));
        }
    }

    //Sapient generated method id: ${61d8133b-b091-3fc8-89a4-9819dc96bab4}
    @Test()
    public void encodeMPIWhenNotIsNegative() {
        /* Branches:
         * (value.equals(BigInteger.ZERO)) : false
         * (value.signum() < 0) : false
         * (isNegative) : false
         * ((array[0] & 0x80) == 0x80) : true
         * (includeLength) : true
         * (isNegative) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            byteUtils.when(() -> ByteUtils.writeInt32BE(0, byteArray, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            byte[] result = ByteUtils.encodeMPI(new BigInteger("0"), false);
            //Assert statement(s)
            assertThat(result, equalTo(byteArray));
            byteUtils.verify(() -> ByteUtils.writeInt32BE(0, byteArray, 0), atLeast(1));
        }
    }

    //Sapient generated method id: ${ebc50ae0-a1a9-3d67-bcf0-d60e1a7d47dd}
    @Ignore()
    @Test()
    public void encodeMPIWhenLengthNotEqualsArrayLengthAndIsNegative() {
        /* Branches:
         * (value.equals(BigInteger.ZERO)) : false
         * (value.signum() < 0) : true
         * (isNegative) : true
         * ((array[0] & 0x80) == 0x80) : true
         * (includeLength) : false
         * (length != array.length) : true
         * (isNegative) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        byte[] result = ByteUtils.encodeMPI(new BigInteger("-1"), false);
        byte[] byteResultArray = new byte[]{(byte) -128, (byte) 0};
        //Assert statement(s)
        assertThat(result, equalTo(byteResultArray));
    }

    //Sapient generated method id: ${d1211024-f057-3e3a-8fdb-189469427708}
    @Test()
    public void decodeCompactBitsWhenSizeGreaterThanOrEqualsTo3() {
        /* Branches:
         * (size >= 1) : true
         * (size >= 2) : true
         * (size >= 3) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 1, (byte) 1, (byte) 1};
            byteUtils.when(() -> ByteUtils.decodeMPI(byteArray, true)).thenReturn(new BigInteger("0"));
            //Act Statement(s)
            BigInteger result = ByteUtils.decodeCompactBits(0L);
            //Assert statement(s)
            assertThat(result, equalTo(new BigInteger("0")));
            byteUtils.verify(() -> ByteUtils.decodeMPI(byteArray, true), atLeast(1));
        }
    }

    //Sapient generated method id: ${9ead8753-5f56-3fad-be5d-97d9856b0c45}
    @Ignore()
    @Test()
    public void encodeCompactBitsWhenValueSignumEqualsMinus1() {
        /* Branches:
         * (size <= 3) : true
         * ((result & 0x00800000L) != 0) : true
         * (value.signum() == -1) : true
         */
        //Act Statement(s)
        long result = ByteUtils.encodeCompactBits(new BigInteger("-1"));
        //Assert statement(s)
        assertThat(result, equalTo(-256L));
    }

    //Sapient generated method id: ${5b50e0c0-488e-38fd-8b63-2f582fc2486e}
    @Test()
    public void encodeCompactBitsWhenValueSignumNotEqualsMinus1() {
        /* Branches:
         * (size <= 3) : true
         * ((result & 0x00800000L) != 0) : true
         * (value.signum() == -1) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        //long result = ByteUtils.encodeCompactBits(new BigInteger("0"));
        //Assert statement(s)
        //assertThat(result, equalTo(0L));
    }

    //Sapient generated method id: ${efd59b64-c5a3-319c-894f-2e7183cb991f}
    @Test()
    public void encodeCompactBitsWhenResultAnd0x00800000LNotEquals0AndValueSignumEqualsMinus1() {
        /* Branches:
         * (size <= 3) : false
         * ((result & 0x00800000L) != 0) : true
         * (value.signum() == -1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        //long result = ByteUtils.encodeCompactBits(new BigInteger("0"));
        //Assert statement(s)
        //assertThat(result, equalTo(0L));
    }

    //Sapient generated method id: ${80cb4cde-6010-3fdd-a0dc-b8a5d81fbf72}
    @Test()
    public void checkBitLEWhenIndex3IndexOfDataAnd7AndIndexIndexOfBitMaskNotEquals0() {
        /* Branches:
         * ((data[index >>> 3] & bitMask[7 & index]) != 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //byte[] byteArray = new byte[] { (byte) 0, (byte) 0 };
        //Act Statement(s)
        //boolean result = ByteUtils.checkBitLE(byteArray, 0);
        //Assert statement(s)
        //assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${417027ad-86bb-3172-a358-ef0f12e589c1}
    @Test()
    public void checkBitLEWhenIndex3IndexOfDataAnd7AndIndexIndexOfBitMaskEquals0() {
        /* Branches:
         * ((data[index >>> 3] & bitMask[7 & index]) != 0) : false
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0};
        //Act Statement(s)
        boolean result = ByteUtils.checkBitLE(byteArray, 0);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${3241271f-49d6-33e9-aab5-dce105274111}
    @Test()
    public void setBitLETest() {
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0};
        //Act Statement(s)
        ByteUtils.setBitLE(byteArray, 0);
        byte[] byteByteArrayArray = new byte[]{(byte) 1};
        //Assert statement(s)
        assertThat(byteArray, equalTo(byteByteArrayArray));
    }

    //Sapient generated method id: ${bedd6451-15e9-38f4-b9f1-a927c8a0ead5}
    @Test()
    public void arrayUnsignedComparatorTest() {
        //Act Statement(s)
        Comparator<byte[]> result = ByteUtils.arrayUnsignedComparator();
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${996e430c-5427-3120-9c38-aed6c3d6325b}
    @Test()
    public void concatTest() {
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        byte[] byteArray2 = new byte[]{};
        //Act Statement(s)
        byte[] result = ByteUtils.concat(byteArray, byteArray2);
        byte[] byteResultArray = new byte[]{};
        //Assert statement(s)
        assertThat(result, equalTo(byteResultArray));
    }
}
