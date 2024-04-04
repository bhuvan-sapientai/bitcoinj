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
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class ByteUtilsSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${a1a42a93-2964-364e-ae5a-e96abe25ad1a}, hash: FF5DA0AEEB904CB30A01C05B2A9D5430
    @Test()
    public void formatHexTest() {
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        String result = ByteUtils.formatHex(byteArray);
        //Assert statement(s)
        assertThat(result, equalTo(""));
    }

    //Sapient generated method id: ${580453a4-e184-3185-ab2c-e0f9f73edb9b}, hash: 49A17B86ED6AD99633A97064719B9D39
    @Ignore()
    @Test()
    public void parseHexTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: hexFormat
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        byte[] result = ByteUtils.parseHex("<value>");
        //Assert statement(s)
        assertThat(result.length, equalTo(0));
    }

    //Sapient generated method id: ${240570e6-d6da-34fb-af38-5f281ff3979e}, hash: 097F044B4E5782D3BD9A9373C05F0074
    @Test()
    public void bigIntegerToBytesWhenBSignumLessThan0ThrowsIllegalArgumentException() {
        /* Branches:
         * (b.signum() >= 0) : false
         */
        //Arrange Statement(s)
        thrown.expect(IllegalArgumentException.class);
        //Act Statement(s)
        ByteUtils.bigIntegerToBytes(new BigInteger("-1"), 0);
    }

    //Sapient generated method id: ${b1d142fd-a92a-3171-b7de-043d077ef371}, hash: D5878D7243B0431AE0CC6E37AE715F89
    @Test()
    public void bigIntegerToBytesWhenNumBytesNotGreaterThan0ThrowsIllegalArgumentException() {
        /* Branches:
         * (b.signum() >= 0) : true
         * (numBytes > 0) : false
         */
        //Arrange Statement(s)
        thrown.expect(IllegalArgumentException.class);
        //Act Statement(s)
        ByteUtils.bigIntegerToBytes(new BigInteger("0"), 0);
    }

    //Sapient generated method id: ${3491d16b-7457-3ab8-b060-181819dcf0e9}, hash: 0B4D945C554D057ECA71AB10FCA32558
    @Test()
    public void bigIntegerToBytesWhenLengthGreaterThanNumBytesThrowsIllegalArgumentException() {
        /* Branches:
         * (b.signum() >= 0) : true
         * (numBytes > 0) : true
         * (src[0] == 0) : true
         * (isFirstByteOnlyForSign) : true
         * (length <= numBytes) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        thrown.expect(IllegalArgumentException.class);
        //Act Statement(s)
        ByteUtils.bigIntegerToBytes(new BigInteger("0"), 0);
    }

    //Sapient generated method id: ${5761d256-92f3-3355-bcfb-e093fc16ceef}, hash: 520F03C4CB8467A30292415194F35141
    @Test()
    public void bigIntegerToBytesWhenIsFirstByteOnlyForSign() {
        /* Branches:
         * (b.signum() >= 0) : true
         * (numBytes > 0) : true
         * (src[0] == 0) : true
         * (isFirstByteOnlyForSign) : true
         * (length <= numBytes) : true
         * (isFirstByteOnlyForSign) : true
         */
        //Act Statement(s)
        byte[] result = ByteUtils.bigIntegerToBytes(new BigInteger("0"), 1);
        byte[] byteResultArray = new byte[]{(byte) 0};
        //Assert statement(s)
        assertThat(result, equalTo(byteResultArray));
    }

    //Sapient generated method id: ${76be6984-79ef-35d2-8708-e35a66aef1e4}, hash: B97C585B6E2546A8012BDBF085D99C62
    @Ignore()
    @Test()
    public void bigIntegerToBytesWhenNotIsFirstByteOnlyForSign() {
        /* Branches:
         * (b.signum() >= 0) : true
         * (numBytes > 0) : true
         * (src[0] == 0) : false
         * (isFirstByteOnlyForSign) : false
         * (length <= numBytes) : true
         * (isFirstByteOnlyForSign) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        byte[] result = ByteUtils.bigIntegerToBytes(new BigInteger("0"), 0);
        //Assert statement(s)
        assertThat(result.length, equalTo(0));
    }

    //Sapient generated method id: ${b3945d42-54f6-3164-8a3c-b71822b203ef}, hash: 5587705D8230AC90415E04BA0223EB13
    @Test()
    public void bytesToBigIntegerTest() {
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        BigInteger result = ByteUtils.bytesToBigInteger(byteArray);
        //Assert statement(s)
        assertThat(result, equalTo(new BigInteger("0")));
    }

    //Sapient generated method id: ${6180367f-c6be-3ddd-a6ef-2cc45af52848}, hash: 765813849F9B75A6F3A9A2677A61A545
    @Test()
    public void writeInt16LEWhenValLessThanOrEqualsToMAX_UNSIGNED_SHORT() throws BufferOverflowException {
        /* Branches:
         * (val >= 0) : true
         * (val <= MAX_UNSIGNED_SHORT) : true
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        //Act Statement(s)
        ByteBuffer result = ByteUtils.writeInt16LE(0, byteBuffer);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        ByteBuffer byteBuffer2 = byteBuffer.order(byteOrder);
        ByteBuffer byteBuffer3 = byteBuffer2.putShort((short) 0);
        //Assert statement(s)
        assertThat(result, equalTo(byteBuffer3));
    }

    //Sapient generated method id: ${b6847f04-699f-390d-843f-59344108b58d}, hash: 3BF83302AA973FD6929292295A754B4B
    @Test()
    public void writeInt16LEWhenValGreaterThanMAX_UNSIGNED_SHORTThrowsIllegalArgumentException() throws BufferOverflowException {
        /* Branches:
         * (val >= 0) : true
         * (val <= MAX_UNSIGNED_SHORT) : false
         */
        //Arrange Statement(s)
        thrown.expect(IllegalArgumentException.class);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        //Act Statement(s)
        ByteUtils.writeInt16LE(65536, byteBuffer);
    }

    //Sapient generated method id: ${c02d957e-4378-387e-8ee4-f4630745dae2}, hash: 90BBF7DDB14E27B8C99447269A1B5A9A
    @Test()
    public void writeInt16LE1WhenOffsetLessThanOrEqualsToOutLengthMinus2() throws Throwable {
        /* Branches:
         * (offset >= 0) : true
         * (offset <= out.length - 2) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS)) {
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            byteUtils.when(() -> ByteUtils.writeInt16LE(eq(0), (ByteBuffer) any())).thenReturn(byteBuffer);
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1};
            //Act Statement(s)
            ByteUtils.writeInt16LE(0, byteArray, 0);
            //Assert statement(s)
            byteUtils.verify(() -> ByteUtils.writeInt16LE(eq(0), (ByteBuffer) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${ed7185a8-8f6b-34d9-9642-f9f512b8ddef}, hash: 5792809FE9A8CAA7B6C5C15E203FD5C5
    @Test()
    public void writeInt16LE1WhenOffsetGreaterThanOutLengthMinus2ThrowsArrayIndexOutOfBoundsException() throws Throwable {
        /* Branches:
         * (offset >= 0) : true
         * (offset <= out.length - 2) : false
         */
        //Arrange Statement(s)
        thrown.expect(ArrayIndexOutOfBoundsException.class);
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        ByteUtils.writeInt16LE(0, byteArray, 0);
    }

    //Sapient generated method id: ${21f675a6-ace6-3d53-a0bb-dd27f2a99d8f}, hash: 9F3C92F09AB31449A0F2C6836D6C3BD1
    @Test()
    public void writeInt16BEWhenValLessThanOrEqualsToMAX_UNSIGNED_SHORT() throws BufferOverflowException {
        /* Branches:
         * (val >= 0) : true
         * (val <= MAX_UNSIGNED_SHORT) : true
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        //Act Statement(s)
        ByteBuffer result = ByteUtils.writeInt16BE(0, byteBuffer);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        ByteBuffer byteBuffer2 = byteBuffer.order(byteOrder);
        ByteBuffer byteBuffer3 = byteBuffer2.putShort((short) 0);
        //Assert statement(s)
        assertThat(result, equalTo(byteBuffer3));
    }

    //Sapient generated method id: ${fcbf0840-da87-3dba-98b3-43cba075b859}, hash: 6CF0F8B4EA19AFF66560F89D8FB0AB46
    @Test()
    public void writeInt16BEWhenValGreaterThanMAX_UNSIGNED_SHORTThrowsIllegalArgumentException() throws BufferOverflowException {
        /* Branches:
         * (val >= 0) : true
         * (val <= MAX_UNSIGNED_SHORT) : false
         */
        //Arrange Statement(s)
        thrown.expect(IllegalArgumentException.class);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        //Act Statement(s)
        ByteUtils.writeInt16BE(65536, byteBuffer);
    }

    //Sapient generated method id: ${18eae58d-bd27-3ea7-aa78-94377150e7e1}, hash: E53650447A458647C0C05CA65F13D7D2
    @Test()
    public void writeInt16BE1WhenOffsetLessThanOrEqualsToOutLengthMinus2() throws Throwable {
        /* Branches:
         * (offset >= 0) : true
         * (offset <= out.length - 2) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS)) {
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            byteUtils.when(() -> ByteUtils.writeInt16BE(eq(0), (ByteBuffer) any())).thenReturn(byteBuffer);
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1};
            //Act Statement(s)
            ByteUtils.writeInt16BE(0, byteArray, 0);
            //Assert statement(s)
            byteUtils.verify(() -> ByteUtils.writeInt16BE(eq(0), (ByteBuffer) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${68d62cca-6f32-3cae-aa60-c0557763ecbc}, hash: FD994985043C83C2E7E798A99C22B7DA
    @Test()
    public void writeInt16BE1WhenOffsetGreaterThanOutLengthMinus2ThrowsArrayIndexOutOfBoundsException() throws Throwable {
        /* Branches:
         * (offset >= 0) : true
         * (offset <= out.length - 2) : false
         */
        //Arrange Statement(s)
        thrown.expect(ArrayIndexOutOfBoundsException.class);
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        ByteUtils.writeInt16BE(0, byteArray, 0);
    }

    //Sapient generated method id: ${90702ae5-78a1-3c18-a89a-f2fe95cea03b}, hash: BC3D2021A8CF443F3EA10AB5D82BF6C3
    @Test()
    public void writeInt32LETest() throws BufferOverflowException {
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        //Act Statement(s)
        ByteBuffer result = ByteUtils.writeInt32LE(0, byteBuffer);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        ByteBuffer byteBuffer2 = byteBuffer.order(byteOrder);
        ByteBuffer byteBuffer3 = byteBuffer2.putInt(0);
        //Assert statement(s)
        assertThat(result, equalTo(byteBuffer3));
    }

    //Sapient generated method id: ${393bc7c7-7a20-335c-a2d7-914bb56a66cb}, hash: B7AB24E9E2B5EFB46CC245AA8AFEB440
    @Test()
    public void writeInt32LE1WhenValLessThanOrEqualsToMAX_UNSIGNED_INTEGER() throws BufferOverflowException {
        /* Branches:
         * (val >= 0) : true
         * (val <= MAX_UNSIGNED_INTEGER) : true
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        //Act Statement(s)
        ByteBuffer result = ByteUtils.writeInt32LE(0L, byteBuffer);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        ByteBuffer byteBuffer2 = byteBuffer.order(byteOrder);
        ByteBuffer byteBuffer3 = byteBuffer2.putInt(0);
        //Assert statement(s)
        assertThat(result, equalTo(byteBuffer3));
    }

    //Sapient generated method id: ${a0d96dd7-0bb0-3839-97d8-9b3e958d72fa}, hash: D5544EF93A24FEC3CBB99C390C88A3A5
    @Test()
    public void writeInt32LE1WhenValGreaterThanMAX_UNSIGNED_INTEGERThrowsIllegalArgumentException() throws BufferOverflowException {
        /* Branches:
         * (val >= 0) : true
         * (val <= MAX_UNSIGNED_INTEGER) : false
         */
        //Arrange Statement(s)
        thrown.expect(IllegalArgumentException.class);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        //Act Statement(s)
        ByteUtils.writeInt32LE(4294967296L, byteBuffer);
    }

    //Sapient generated method id: ${8d0de121-a99a-3cb5-adae-f003e053238f}, hash: 57738BBC2DBA1BF3E63A50392383CEA9
    @Test()
    public void writeInt32LE2WhenOffsetLessThanOrEqualsToOutLengthMinus4() throws Throwable {
        /* Branches:
         * (offset >= 0) : true
         * (offset <= out.length - 4) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS)) {
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            byteUtils.when(() -> ByteUtils.writeInt32LE(eq(0L), (ByteBuffer) any())).thenReturn(byteBuffer);
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3};
            //Act Statement(s)
            ByteUtils.writeInt32LE(0L, byteArray, 0);
            //Assert statement(s)
            byteUtils.verify(() -> ByteUtils.writeInt32LE(eq(0L), (ByteBuffer) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${65f3d61f-edb1-3665-bd42-fa8ff8157c12}, hash: 90D065C8F6D265B5361E9F3DEBF900EB
    @Test()
    public void writeInt32LE2WhenOffsetGreaterThanOutLengthMinus4ThrowsArrayIndexOutOfBoundsException() throws Throwable {
        /* Branches:
         * (offset >= 0) : true
         * (offset <= out.length - 4) : false
         */
        //Arrange Statement(s)
        thrown.expect(ArrayIndexOutOfBoundsException.class);
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        ByteUtils.writeInt32LE(0L, byteArray, 0);
    }

    //Sapient generated method id: ${bb8c0d65-8667-3391-b0d7-a7521edee850}, hash: 4E25928D23747CDE1C33F9169B616ED2
    @Test()
    public void writeInt32BEWhenValLessThanOrEqualsToMAX_UNSIGNED_INTEGER() throws BufferOverflowException {
        /* Branches:
         * (val >= 0) : true
         * (val <= MAX_UNSIGNED_INTEGER) : true
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        //Act Statement(s)
        ByteBuffer result = ByteUtils.writeInt32BE(0L, byteBuffer);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        ByteBuffer byteBuffer2 = byteBuffer.order(byteOrder);
        ByteBuffer byteBuffer3 = byteBuffer2.putInt(0);
        //Assert statement(s)
        assertThat(result, equalTo(byteBuffer3));
    }

    //Sapient generated method id: ${2dddef9c-d42b-3aff-8f6e-99e5cd1eb33e}, hash: 4C2442E3592BBCA45E013D051CC56914
    @Test()
    public void writeInt32BEWhenValGreaterThanMAX_UNSIGNED_INTEGERThrowsIllegalArgumentException() throws BufferOverflowException {
        /* Branches:
         * (val >= 0) : true
         * (val <= MAX_UNSIGNED_INTEGER) : false
         */
        //Arrange Statement(s)
        thrown.expect(IllegalArgumentException.class);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        //Act Statement(s)
        ByteUtils.writeInt32BE(4294967296L, byteBuffer);
    }

    //Sapient generated method id: ${ee8370c3-cdea-33f9-8aa7-acdcb9fa1983}, hash: C55A910F5E2222409819AFD306723BB7
    @Test()
    public void writeInt32BE1Test() throws BufferOverflowException {
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        //Act Statement(s)
        ByteBuffer result = ByteUtils.writeInt32BE(0, byteBuffer);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        ByteBuffer byteBuffer2 = byteBuffer.order(byteOrder);
        ByteBuffer byteBuffer3 = byteBuffer2.putInt(0);
        //Assert statement(s)
        assertThat(result, equalTo(byteBuffer3));
    }

    //Sapient generated method id: ${c0f804ae-483d-346d-8589-c9bd2b80b514}, hash: 76C183214BC5695E6736F666C7C9FF1A
    @Test()
    public void writeInt32BE2WhenOffsetLessThanOrEqualsToOutLengthMinus4() throws Throwable {
        /* Branches:
         * (offset >= 0) : true
         * (offset <= out.length - 4) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS)) {
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            byteUtils.when(() -> ByteUtils.writeInt32BE(eq(0L), (ByteBuffer) any())).thenReturn(byteBuffer);
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3};
            //Act Statement(s)
            ByteUtils.writeInt32BE(0L, byteArray, 0);
            //Assert statement(s)
            byteUtils.verify(() -> ByteUtils.writeInt32BE(eq(0L), (ByteBuffer) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${c33ac7c5-61fc-3caa-9f51-88613de18bb0}, hash: 3845BD2F319F6B33C7427D26305017DC
    @Test()
    public void writeInt32BE2WhenOffsetGreaterThanOutLengthMinus4ThrowsArrayIndexOutOfBoundsException() throws Throwable {
        /* Branches:
         * (offset >= 0) : true
         * (offset <= out.length - 4) : false
         */
        //Arrange Statement(s)
        thrown.expect(ArrayIndexOutOfBoundsException.class);
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        ByteUtils.writeInt32BE(0L, byteArray, 0);
    }

    //Sapient generated method id: ${c1337eb1-aa9f-3b62-b38a-b94cef7d7b46}, hash: C09A3586485BFAF32758843584402633
    @Test()
    public void writeInt32BE3Test() throws ArrayIndexOutOfBoundsException {
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0};
        //Act Statement(s)
        ByteUtils.writeInt32BE(0, byteArray, 0);
    }

    //Sapient generated method id: ${3107c0d9-f616-3ee7-9a32-7c1e75e66a91}, hash: 718577EF719DBC247E747816D07E85C9
    @Test()
    public void writeInt64LETest() throws BufferOverflowException {
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        //Act Statement(s)
        ByteBuffer result = ByteUtils.writeInt64LE(0L, byteBuffer);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        ByteBuffer byteBuffer2 = byteBuffer.order(byteOrder);
        ByteBuffer byteBuffer3 = byteBuffer2.putLong(0L);
        //Assert statement(s)
        assertThat(result, equalTo(byteBuffer3));
    }

    //Sapient generated method id: ${1739393c-9b23-32f9-948e-9907c0163c70}, hash: F956CCDBF3C4961FC921167D05D338AE
    @Ignore()
    @Test()
    public void writeInt64LE1WhenOffsetLessThanOrEqualsToOutLengthPlus8() throws Throwable {
        /* Branches:
         * (offset >= 0) : true
         * (offset <= out.length + 8) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        ByteUtils.writeInt64LE(0L, byteArray, 0);
    }

    //Sapient generated method id: ${8d42a45c-b297-3855-be8b-3f8773d08a57}, hash: F0EA480A28BAA0C278230F81294D51E0
    @Test()
    public void writeInt64LE1WhenOffsetGreaterThanOutLengthPlus8ThrowsArrayIndexOutOfBoundsException() throws Throwable {
        /* Branches:
         * (offset >= 0) : true
         * (offset <= out.length + 8) : false
         */
        //Arrange Statement(s)
        thrown.expect(ArrayIndexOutOfBoundsException.class);
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        ByteUtils.writeInt64LE(0L, byteArray, 9);
    }

    //Sapient generated method id: ${d75fde81-8ff1-3599-98ee-84c251f6efbc}, hash: 1AE795D22334506F48951CA370720836
    @Test()
    public void writeInt16LE2Test() throws IOException {
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS)) {
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            byteUtils.when(() -> ByteUtils.writeInt16LE(eq(0), (ByteBuffer) any())).thenReturn(byteBuffer);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            //Act Statement(s)
            ByteUtils.writeInt16LE(0, byteArrayOutputStream);
            //Assert statement(s)
            byteUtils.verify(() -> ByteUtils.writeInt16LE(eq(0), (ByteBuffer) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${39e25293-72e5-3c5f-9a0e-bae1727d1fd3}, hash: 596E2F2049F1B69094B4FC2329E04984
    @Test()
    public void writeInt16BE2Test() throws IOException {
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS)) {
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            byteUtils.when(() -> ByteUtils.writeInt16BE(eq(0), (ByteBuffer) any())).thenReturn(byteBuffer);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            //Act Statement(s)
            ByteUtils.writeInt16BE(0, byteArrayOutputStream);
            //Assert statement(s)
            byteUtils.verify(() -> ByteUtils.writeInt16BE(eq(0), (ByteBuffer) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${95dd964f-cb54-31d5-b569-fb08ab70904b}, hash: 97EA4C4CBEFA2D4B9583E546C8058982
    @Test()
    public void writeInt32LE3Test() throws IOException {
        //Arrange Statement(s)
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        //Act Statement(s)
        ByteUtils.writeInt32LE(1, byteArrayOutputStream);
    }

    //Sapient generated method id: ${e9b49726-36b7-3788-9f5e-b898e0379b4d}, hash: DCE6394306A4A3574BF3AE687CD85AA1
    @Test()
    public void writeInt32LE4Test() throws IOException {
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS)) {
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            byteUtils.when(() -> ByteUtils.writeInt32LE(eq(0L), (ByteBuffer) any())).thenReturn(byteBuffer);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            //Act Statement(s)
            ByteUtils.writeInt32LE(0L, byteArrayOutputStream);
            //Assert statement(s)
            byteUtils.verify(() -> ByteUtils.writeInt32LE(eq(0L), (ByteBuffer) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${5ee935e9-501e-3657-85b8-d539878c786a}, hash: 93645B12111573252B71894DF96CC01A
    @Test()
    public void writeInt32BE4Test() throws IOException {
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS)) {
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            byteUtils.when(() -> ByteUtils.writeInt32BE(eq(0L), (ByteBuffer) any())).thenReturn(byteBuffer);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            //Act Statement(s)
            ByteUtils.writeInt32BE(0L, byteArrayOutputStream);
            //Assert statement(s)
            byteUtils.verify(() -> ByteUtils.writeInt32BE(eq(0L), (ByteBuffer) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${5e8d42b3-f773-3d38-84b6-4048f7f402cc}, hash: 929758F5DCCB864D94BC90C61AE92F86
    @Test()
    public void writeInt32BE5Test() throws IOException {
        //Arrange Statement(s)
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        //Act Statement(s)
        ByteUtils.writeInt32BE(1, byteArrayOutputStream);
    }

    //Sapient generated method id: ${f5b61329-69ee-36ab-a1bc-264adece512b}, hash: EB0884F6797C4B0AD8B85427A72CE0CB
    @Test()
    public void writeInt64LE2Test() throws IOException {
        //Arrange Statement(s)
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        //Act Statement(s)
        ByteUtils.writeInt64LE(1L, byteArrayOutputStream);
    }

    //Sapient generated method id: ${4dd9db97-a518-3d76-99ae-1582afbb261b}, hash: FA94BE8EF1BE9BC6292EA5985DB4CF0B
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

    //Sapient generated method id: ${3d92ff90-4ee3-38a3-b721-e50953452e8a}, hash: 098B72149A268E6FB8D1809E9DBCAB22
    @Test()
    public void writeInt64LE3WhenILessThan8MinusBytesLength() throws IOException {
        /* Branches:
         * (bytes.length > 8) : false
         * (bytes.length < 8) : true
         * (i < 8 - bytes.length) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{(byte) 1};
            byteUtils.when(() -> ByteUtils.reverseBytes(byteArray2)).thenReturn(byteArray);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            //Act Statement(s)
            ByteUtils.writeInt64LE(new BigInteger("1"), byteArrayOutputStream);
            //Assert statement(s)
            byteUtils.verify(() -> ByteUtils.reverseBytes(byteArray2), atLeast(1));
        }
    }

    //Sapient generated method id: ${3ec59269-3494-3004-81e4-b34bd1d7f3fd}, hash: C034258951FBC42BCD2D2E8F4046BAEF
    @Test()
    public void readUint16Test() throws BufferUnderflowException {
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        //Act Statement(s)
        int result = ByteUtils.readUint16(byteBuffer);
        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${e8435c57-3381-31d1-adb9-7ff62c01fc8e}, hash: 921E64490F41792CF1A1371B610B397F
    @Test()
    public void readUint161WhenOffsetLessThanOrEqualsToBytesLengthMinus2() throws Throwable {
        /* Branches:
         * (offset >= 0) : true
         * (offset <= bytes.length - 2) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1};
        //Act Statement(s)
        int result = ByteUtils.readUint16(byteArray, 0);
        //Assert statement(s)
        assertThat(result, equalTo(256));
    }

    //Sapient generated method id: ${0e80c83c-c76a-3576-bafe-bf52bf4114cc}, hash: D288EE7AD1D295AD962132B7F4F4BD41
    @Test()
    public void readUint161WhenOffsetGreaterThanBytesLengthMinus2ThrowsArrayIndexOutOfBoundsException() throws Throwable {
        /* Branches:
         * (offset >= 0) : true
         * (offset <= bytes.length - 2) : false
         */
        //Arrange Statement(s)
        thrown.expect(ArrayIndexOutOfBoundsException.class);
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        ByteUtils.readUint16(byteArray, 0);
    }

    //Sapient generated method id: ${691b85f3-56f5-39fd-95f0-d927974f594d}, hash: EC8A269E49EB5EE5DF17077183735390
    @Test()
    public void readUint16BETest() throws BufferUnderflowException {
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        //Act Statement(s)
        int result = ByteUtils.readUint16BE(byteBuffer);
        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${e1b5de29-f600-3beb-9827-0b3f41ee0ead}, hash: 998C85633C56154FFBA8AECF96B378B5
    @Test()
    public void readUint16BE1WhenOffsetLessThanOrEqualsToBytesLengthMinus2() throws Throwable {
        /* Branches:
         * (offset >= 0) : true
         * (offset <= bytes.length - 2) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1};
        //Act Statement(s)
        int result = ByteUtils.readUint16BE(byteArray, 0);
        //Assert statement(s)
        assertThat(result, equalTo(1));
    }

    //Sapient generated method id: ${ef3d5c2e-fbbe-357d-80a8-ef3b887409d4}, hash: 3B277DCBB4AE586A36224C41DB5A0CC4
    @Test()
    public void readUint16BE1WhenOffsetGreaterThanBytesLengthMinus2ThrowsArrayIndexOutOfBoundsException() throws Throwable {
        /* Branches:
         * (offset >= 0) : true
         * (offset <= bytes.length - 2) : false
         */
        //Arrange Statement(s)
        thrown.expect(ArrayIndexOutOfBoundsException.class);
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        ByteUtils.readUint16BE(byteArray, 0);
    }

    //Sapient generated method id: ${f56eca6f-00a7-31f7-a95d-12e0fc137e88}, hash: 636ECFB279D96C47B3C3E481E5D0C992
    @Test()
    public void readUint32Test() throws BufferUnderflowException {
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        //Act Statement(s)
        long result = ByteUtils.readUint32(byteBuffer);
        //Assert statement(s)
        assertThat(result, equalTo(0L));
    }

    //Sapient generated method id: ${8ef5eed9-ce81-3fd7-9c78-c25a658d4861}, hash: E22CD6C25814CA6C58F21253478E0FD3
    @Test()
    public void readInt32Test() throws BufferUnderflowException {
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        //Act Statement(s)
        int result = ByteUtils.readInt32(byteBuffer);
        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${4ddd9ef0-e566-3119-a804-76a414b986ae}, hash: 6853088C745BBC44961429EFC561DF7D
    @Test()
    public void readUint321WhenOffsetLessThanOrEqualsToBytesLengthMinus4() throws Throwable {
        /* Branches:
         * (offset >= 0) : true
         * (offset <= bytes.length - 4) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3};
        //Act Statement(s)
        long result = ByteUtils.readUint32(byteArray, 0);
        //Assert statement(s)
        assertThat(result, equalTo(50462976L));
    }

    //Sapient generated method id: ${dc89ed0a-3423-344a-bd7c-08b595812ee4}, hash: D7844FA34D739C1C742214C0B4EA95D7
    @Test()
    public void readUint321WhenOffsetGreaterThanBytesLengthMinus4ThrowsArrayIndexOutOfBoundsException() throws Throwable {
        /* Branches:
         * (offset >= 0) : true
         * (offset <= bytes.length - 4) : false
         */
        //Arrange Statement(s)
        thrown.expect(ArrayIndexOutOfBoundsException.class);
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        ByteUtils.readUint32(byteArray, 0);
    }

    //Sapient generated method id: ${cf37385e-05ea-39bd-bacc-b5ce6021e72e}, hash: 89621370D0175F56C95AC775B2A1E48B
    @Test()
    public void readUint32BETest() throws BufferUnderflowException {
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        //Act Statement(s)
        long result = ByteUtils.readUint32BE(byteBuffer);
        //Assert statement(s)
        assertThat(result, equalTo(0L));
    }

    //Sapient generated method id: ${ef8ec0c3-2c06-3937-8462-46a8b4d6e850}, hash: FC658CFAF6C99BDFB8456FB1212504B6
    @Test()
    public void readUint32BE1WhenOffsetLessThanOrEqualsToBytesLengthMinus4() throws Throwable {
        /* Branches:
         * (offset >= 0) : true
         * (offset <= bytes.length - 4) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3};
        //Act Statement(s)
        long result = ByteUtils.readUint32BE(byteArray, 0);
        //Assert statement(s)
        assertThat(result, equalTo(66051L));
    }

    //Sapient generated method id: ${d3a312b3-80a5-31ce-8bc5-8a0a9f4f29b2}, hash: 69AFBE262D75BACB5F6BDEF2CC00BAA2
    @Test()
    public void readUint32BE1WhenOffsetGreaterThanBytesLengthMinus4ThrowsArrayIndexOutOfBoundsException() throws Throwable {
        /* Branches:
         * (offset >= 0) : true
         * (offset <= bytes.length - 4) : false
         */
        //Arrange Statement(s)
        thrown.expect(ArrayIndexOutOfBoundsException.class);
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        ByteUtils.readUint32BE(byteArray, 0);
    }

    //Sapient generated method id: ${e37b82ea-430f-36d9-8f60-5437b3acf8b7}, hash: 4EB3C5CC7FD66A0296A471CF35894508
    @Test()
    public void readInt64Test() throws BufferUnderflowException {
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        //Act Statement(s)
        long result = ByteUtils.readInt64(byteBuffer);
        //Assert statement(s)
        assertThat(result, equalTo(0L));
    }

    //Sapient generated method id: ${fc4c614b-4771-3f90-9c52-bcc3f7639382}, hash: C2FEA35264E5FA38A5B3D0879EEF599F
    @Test()
    public void readInt641WhenOffsetLessThanOrEqualsToBytesLengthMinus8() throws Throwable {
        /* Branches:
         * (offset >= 0) : true
         * (offset <= bytes.length - 8) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7};
        //Act Statement(s)
        long result = ByteUtils.readInt64(byteArray, 0);
        //Assert statement(s)
        assertThat(result, equalTo(506097522914230528L));
    }

    //Sapient generated method id: ${93c6ba40-5672-3385-ab05-210232d72342}, hash: 07F7FC7B089BBBA62CF1D11921B8269D
    @Test()
    public void readInt641WhenOffsetGreaterThanBytesLengthMinus8ThrowsArrayIndexOutOfBoundsException() throws Throwable {
        /* Branches:
         * (offset >= 0) : true
         * (offset <= bytes.length - 8) : false
         */
        //Arrange Statement(s)
        thrown.expect(ArrayIndexOutOfBoundsException.class);
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        ByteUtils.readInt64(byteArray, 0);
    }

    //Sapient generated method id: ${09c51b4b-ce3f-3908-9360-464671ab2544}, hash: EAA40156BB9501AC3D458D37FFD0F01E
    @Test()
    public void readUint162Test() throws IOException {
        /*
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

    //Sapient generated method id: ${bc2b736a-0a36-3d6d-8b87-fcffe948d9ff}, hash: 911105C6B4BC49A504BF17B6887E5E4A
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

    //Sapient generated method id: ${02650c3a-6988-3d18-901c-b209a4b52952}, hash: 14E65BD8C76DCF54C9F346E5EBB99949
    @Test()
    public void readUint322Test() throws IOException {
        /*
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

    //Sapient generated method id: ${cba7b769-6cfc-3964-a3b0-c0bcd9a3c544}, hash: 105992CF47EDEED6F202B4BBA16B8850
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

    //Sapient generated method id: ${17bba86a-c2dd-3542-8ba0-0d279fc6d499}, hash: 7F3CAE9C0C76B621F92B1532E96C42AE
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

    //Sapient generated method id: ${21374b40-569d-3dec-92df-5a9b566df694}, hash: 11CE20047221F383DFFC89E2DD034593
    @Ignore()
    @Test()
    public void decodeMPIWhenBufLengthEquals0() {
        /* Branches:
         * (hasLength) : true
         * (buf.length == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            byteUtils.when(() -> ByteUtils.readUint32BE(byteArray, 0)).thenReturn(0L);
            //Act Statement(s)
            BigInteger result = ByteUtils.decodeMPI(byteArray, true);
            //Assert statement(s)
            assertThat(result, equalTo(new BigInteger("0")));
            byteUtils.verify(() -> ByteUtils.readUint32BE(byteArray, 0), atLeast(1));
        }
    }

    //Sapient generated method id: ${fea22f52-202e-3d9c-bc67-7e3b7d20b3c8}, hash: AFB51004E00DCD1ED0F625FEB7EDB2EA
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

    //Sapient generated method id: ${249d2b72-be1c-34c4-834b-da1cc22db8c2}, hash: 3953566169C03CAAB609BADFB8BF88F8
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
        byte[] byteArray = new byte[]{(byte) 0};
        //Act Statement(s)
        BigInteger result = ByteUtils.decodeMPI(byteArray, false);
        byte[] byteByteArrayArray = new byte[]{(byte) -128};
        //Assert statement(s)
        assertThat(result, equalTo(new BigInteger("-128")));
        assertThat(byteArray, equalTo(byteByteArrayArray));
    }

    //Sapient generated method id: ${337a9408-b301-362d-85c0-e73e50714290}, hash: EBA5ED1DEA5D334BAE7B7E8C222B7C7E
    @Test()
    public void encodeMPIWhenNotIncludeLength() {
        /* Branches:
         * (value.equals(BigInteger.ZERO)) : true
         * (!includeLength) : true
         */
        //Act Statement(s)
        byte[] result = ByteUtils.encodeMPI(new BigInteger("0"), false);
        //Assert statement(s)
        assertThat(result.length, equalTo(0));
    }

    //Sapient generated method id: ${c2933f09-e5b8-3565-93d3-4fbb753a0857}, hash: 9A677049DD02B69947D2984FF31F588B
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

    //Sapient generated method id: ${415464e0-893d-374c-a35c-3281425049c9}, hash: CF8E04390EFB88F3B3C0026EA393649B
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

    //Sapient generated method id: ${61d8133b-b091-3fc8-89a4-9819dc96bab4}, hash: 10C7E812BC9A2CAE6D0DB40B6A37EC90
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

    //Sapient generated method id: ${ebc50ae0-a1a9-3d67-bcf0-d60e1a7d47dd}, hash: 0ABA01DBCF80FC5A156F1E9A40E3E993
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

    //Sapient generated method id: ${f51a1696-bf83-3084-a801-ec0834290f4c}, hash: 4151D7C86B90C8E18E425521A1CC2142
    @Test()
    public void encodeMPIWhenLengthEqualsArrayLengthAndIsNegative() {
        /* Branches:
         * (value.equals(BigInteger.ZERO)) : false
         * (value.signum() < 0) : true
         * (isNegative) : true
         * ((array[0] & 0x80) == 0x80) : true
         * (includeLength) : false
         * (length != array.length) : false
         * (isNegative) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        byte[] result = ByteUtils.encodeMPI(new BigInteger("0"), false);
        //Assert statement(s)
        assertThat(result.length, equalTo(0));
    }

    //Sapient generated method id: ${d1211024-f057-3e3a-8fdb-189469427708}, hash: 42DDDC9984FC9F12B20FFBD9F7CA22A3
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

    //Sapient generated method id: ${9ead8753-5f56-3fad-be5d-97d9856b0c45}, hash: 44AA81BCB2515E595DA5526817FE1E27
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

    //Sapient generated method id: ${5b50e0c0-488e-38fd-8b63-2f582fc2486e}, hash: CFB5D464460896C9C3916269CB794857
    @Ignore()
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
        long result = ByteUtils.encodeCompactBits(new BigInteger("0"));
        //Assert statement(s)
        assertThat(result, equalTo(0L));
    }

    //Sapient generated method id: ${efd59b64-c5a3-319c-894f-2e7183cb991f}, hash: 22D5104B80EDDEED3444D93B9380605A
    @Test()
    public void encodeCompactBitsWhenResultAnd0x00800000LNotEquals0AndValueSignumEqualsMinus1() {
        /* Branches:
         * (size <= 3) : false
         * ((result & 0x00800000L) != 0) : true
         * (value.signum() == -1) : true
         */
        //Act Statement(s)
        long result = ByteUtils.encodeCompactBits(new BigInteger("-123456789"));
        //Assert statement(s)
        assertThat(result, equalTo(-1884L));
    }

    //Sapient generated method id: ${80cb4cde-6010-3fdd-a0dc-b8a5d81fbf72}, hash: AE7BFD22E9B3FF58301777AAC922B2B9
    @Ignore()
    @Test()
    public void checkBitLEWhenIndex3IndexOfDataAnd7AndIndexIndexOfBitMaskNotEquals0() {
        /* Branches:
         * ((data[index >>> 3] & bitMask[7 & index]) != 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0};
        //Act Statement(s)
        boolean result = ByteUtils.checkBitLE(byteArray, 0);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${417027ad-86bb-3172-a358-ef0f12e589c1}, hash: 6590BD98B72ABACA74BB210DE7426F2C
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

    //Sapient generated method id: ${3241271f-49d6-33e9-aab5-dce105274111}, hash: 44F552208D6C546D0B1DDAF17B20BA7B
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

    //Sapient generated method id: ${bedd6451-15e9-38f4-b9f1-a927c8a0ead5}, hash: 59E0280DA7887FA9696C18DCD55C8A9E
    @Test()
    public void arrayUnsignedComparatorTest() {
        //Act Statement(s)
        Comparator<byte[]> result = ByteUtils.arrayUnsignedComparator();
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${996e430c-5427-3120-9c38-aed6c3d6325b}, hash: C220AF40BBC9D433C167AE8A86F44E15
    @Test()
    public void concatTest() {
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        byte[] byteArray2 = new byte[]{};
        //Act Statement(s)
        byte[] result = ByteUtils.concat(byteArray, byteArray2);
        //Assert statement(s)
        assertThat(result.length, equalTo(0));
    }
}
