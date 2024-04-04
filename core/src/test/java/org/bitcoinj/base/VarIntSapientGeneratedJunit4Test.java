package org.bitcoinj.base;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.nio.BufferUnderflowException;
import java.nio.BufferOverflowException;

import org.junit.rules.ExpectedException;
import org.mockito.stubbing.Answer;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

import java.nio.ByteBuffer;

import org.bitcoinj.base.internal.Preconditions;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

public class VarIntSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${3155f475-158f-3510-8516-db6562387204}, hash: 8BBDA8D6521083D3AD2F1B8E7258FF48
    @Test()
    public void ofTest() {
        //Arrange Statement(s)
        try (MockedStatic<VarInt> varInt = mockStatic(VarInt.class, CALLS_REAL_METHODS)) {
            varInt.when(() -> VarInt.sizeOf(0L)).thenReturn(0);
            //Act Statement(s)
            VarInt result = VarInt.of(0L);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            varInt.verify(() -> VarInt.sizeOf(0L), atLeast(1));
        }
    }

    //Sapient generated method id: ${77fdd2f3-c858-37b9-96d4-3dad5c5812f6}, hash: 5EBC0EFA96A6E78856FBCAEB71E8DA4F
    @Test()
    public void ofBytesWhenOffsetLessThanBufLength() throws Throwable {
        /* Branches:
         * (offset >= 0) : true
         * (offset < buf.length) : true
         */
        //Arrange Statement(s)
        VarInt varIntMock = mock(VarInt.class);
        try (MockedStatic<VarInt> varInt = mockStatic(VarInt.class, CALLS_REAL_METHODS)) {
            varInt.when(() -> VarInt.read((ByteBuffer) any())).thenReturn(varIntMock);
            byte[] byteArray = new byte[]{(byte) 0};
            //Act Statement(s)
            VarInt result = VarInt.ofBytes(byteArray, 0);
            //Assert statement(s)
            assertThat(result, equalTo(varIntMock));
            varInt.verify(() -> VarInt.read((ByteBuffer) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${25886a06-09ae-3bbd-a9e5-6ee42f827ff6}, hash: FD3A9465D12D2A74C58630F3FC05EC19
    @Test()
    public void ofBytesWhenOffsetNotLessThanBufLengthThrowsArrayIndexOutOfBoundsException() throws Throwable {
        /* Branches:
         * (offset >= 0) : true
         * (offset < buf.length) : false
         */
        //Arrange Statement(s)
        thrown.expect(ArrayIndexOutOfBoundsException.class);
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        VarInt.ofBytes(byteArray, 0);
    }

    //Sapient generated method id: ${ac04b3a4-4857-3310-b963-f20b6d5d9261}, hash: 668542AD7F2D049E52ED6D96E6FE95B7
    @Test()
    public void readWhenFirstLessThan253() throws BufferUnderflowException {
        /* Branches:
         * (first < 253) : true
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        //Act Statement(s)
        VarInt result = VarInt.read(byteBuffer);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${ebb5d088-b684-338f-8fb3-22baca9ebbb7}, hash: E792F54E837072114D79F4CFC5756992
    @Ignore()
    @Test()
    public void readWhenFirstEquals253() throws BufferUnderflowException {
        /* Branches:
         * (first < 253) : false
         * (first == 253) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: buf
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        //Act Statement(s)
        VarInt result = VarInt.read(byteBuffer);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${12ca17ec-9748-3a74-880b-215949ca5fde}, hash: 2040D4CFDE0357C0483C7958D0CA9AFE
    @Ignore()
    @Test()
    public void readWhenFirstEquals254() throws BufferUnderflowException {
        /* Branches:
         * (first < 253) : false
         * (first == 253) : false
         * (first == 254) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: buf
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        //Act Statement(s)
        VarInt result = VarInt.read(byteBuffer);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${b8e7bb45-aa6e-35eb-b85e-cfe6ecaac014}, hash: 3DE8D642CFA40D5648CCD3B2E58D5AA9
    @Ignore()
    @Test()
    public void readWhenFirstNotEquals254() throws BufferUnderflowException {
        /* Branches:
         * (first < 253) : false
         * (first == 253) : false
         * (first == 254) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: buf
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        //Act Statement(s)
        VarInt result = VarInt.read(byteBuffer);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${9023386b-0a58-3cc3-912f-1a61aadf88ac}, hash: 59F95EFC38C1AC5F4F5104B982D52DC5
    @Ignore()
    @Test()
    public void longValueTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: buf - Method: get
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        VarInt target = new VarInt(byteArray, 0);
        //Act Statement(s)
        long result = target.longValue();
        //Assert statement(s)
        assertThat(result, equalTo(0L));
    }

    //Sapient generated method id: ${493c40bf-1ed6-364e-835f-bcca76595088}, hash: 957163AE18E4E7281DCBA21A4E8398FE
    @Ignore()
    @Test()
    public void fitsIntWhenValueLessThanOrEqualsToIntegerMAX_VALUE() {
        /* Branches:
         * (value >= 0) : true
         * (value <= Integer.MAX_VALUE) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: buf - Method: get
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        VarInt target = new VarInt(byteArray, 0);
        //Act Statement(s)
        boolean result = target.fitsInt();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${f6010e22-478c-374a-a335-d05e9596a316}, hash: 5C1A3E620AA40CE2D6B223D39948CF91
    @Ignore()
    @Test()
    public void fitsIntWhenValueGreaterThanIntegerMAX_VALUE() {
        /* Branches:
         * (value >= 0) : true
         * (value <= Integer.MAX_VALUE) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: buf - Method: get
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        VarInt target = new VarInt(byteArray, 0);
        //Act Statement(s)
        boolean result = target.fitsInt();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${767dc907-1074-3191-bfda-0a702630b7c3}, hash: FA9012477B22C73F876E1C63CF186E63
    @Ignore()
    @Test()
    public void intValueTest() throws Throwable {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: buf - Method: get
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            preconditions.when(() -> Preconditions.check(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            VarInt target = spy(new VarInt(byteArray, 0));
            doReturn(false).when(target).fitsInt();
            //Act Statement(s)
            int result = target.intValue();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            preconditions.verify(() -> Preconditions.check(eq(false), (Supplier) any()));
            verify(target).fitsInt();
        }
    }

    //Sapient generated method id: ${83c41c5a-8d13-311e-898b-40f6134ab41c}, hash: D91EB837FFF6438A10DF2CB3803C5434
    @Ignore()
    @Test()
    public void getSizeInBytesTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<VarInt> varInt = mockStatic(VarInt.class, CALLS_REAL_METHODS)) {
            varInt.when(() -> VarInt.sizeOf(1L)).thenReturn(0);
            byte[] byteArray = new byte[]{(byte) 0};
            VarInt target = new VarInt(byteArray, 1);
            //Act Statement(s)
            int result = target.getSizeInBytes();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            varInt.verify(() -> VarInt.sizeOf(1L), atLeast(1));
        }
    }

    //Sapient generated method id: ${21142e8b-ad0d-329c-8765-acf75573bb7d}, hash: 93443C0F5F44DB50FD313C5B98C22C00
    @Test()
    public void sizeOfWhenValueLessThan0() {
        /* Branches:
         * (value < 0) : true
         */
        //Act Statement(s)
        int result = VarInt.sizeOf(-1L);
        //Assert statement(s)
        assertThat(result, equalTo(9));
    }

    //Sapient generated method id: ${b851d538-4311-322e-a9b1-5254d799be65}, hash: 07A6D842C17A8E29B73DE2C0BA48BFAD
    @Test()
    public void sizeOfWhenValueLessThan253() {
        /* Branches:
         * (value < 0) : false
         * (value < 253) : true
         */
        //Act Statement(s)
        int result = VarInt.sizeOf(0L);
        //Assert statement(s)
        assertThat(result, equalTo(1));
    }

    //Sapient generated method id: ${7e16f52a-d742-36b2-a047-8a507103c30a}, hash: 50067B18AB929FE51BEA96F5095414FF
    @Test()
    public void sizeOfWhenValueLessThanOrEqualsTo0xFFFFL() {
        /* Branches:
         * (value < 0) : false
         * (value < 253) : false
         * (value <= 0xFFFFL) : true
         */
        //Act Statement(s)
        int result = VarInt.sizeOf(254L);
        //Assert statement(s)
        assertThat(result, equalTo(3));
    }

    //Sapient generated method id: ${5e3fc53e-4c70-3aa4-a007-4f63a9044803}, hash: 6F3C871AC56CCF7847910E8962EE4853
    @Test()
    public void sizeOfWhenValueLessThanOrEqualsTo0xFFFFFFFFL() {
        /* Branches:
         * (value < 0) : false
         * (value < 253) : false
         * (value <= 0xFFFFL) : false
         * (value <= 0xFFFFFFFFL) : true
         */
        //Act Statement(s)
        int result = VarInt.sizeOf(65536L);
        //Assert statement(s)
        assertThat(result, equalTo(5));
    }

    //Sapient generated method id: ${cba18068-6d25-3b9e-9d28-d80d2ef3667f}, hash: 94179B55A3EF12F5C3512B3FB54159BA
    @Test()
    public void sizeOfWhenValueGreaterThan0xFFFFFFFFL() {
        /* Branches:
         * (value < 0) : false
         * (value < 253) : false
         * (value <= 0xFFFFL) : false
         * (value <= 0xFFFFFFFFL) : false
         */
        //Act Statement(s)
        int result = VarInt.sizeOf(4294967296L);
        //Assert statement(s)
        assertThat(result, equalTo(9));
    }

    //Sapient generated method id: ${9d328af1-2293-3544-bbbc-a0683c1f9fbe}, hash: 7A0242D3D98B266DD2F80F48569B4A06
    @Ignore()
    @Test()
    public void serializeTest() throws BufferOverflowException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: buf - Method: get
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<VarInt> varInt = mockStatic(VarInt.class, CALLS_REAL_METHODS)) {
            varInt.when(() -> VarInt.sizeOf(1L)).thenReturn(1);
            byte[] byteArray = new byte[]{};
            VarInt target = spy(new VarInt(byteArray, 0));
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            doReturn(byteBuffer).when(target).write((ByteBuffer) any());
            //Act Statement(s)
            byte[] result = target.serialize();
            //Assert statement(s)
            assertThat(result.length, equalTo(0));
            varInt.verify(() -> VarInt.sizeOf(1L), atLeast(1));
            verify(target, atLeast(1)).write((ByteBuffer) any());
        }
    }

    //Sapient generated method id: ${8f1a5c6c-0848-3364-9e25-d47357b16f72}, hash: 6C53B254CCDE322C7733E52A0612ECFC
    @Ignore()
    @Test()
    public void writeWhenSwitchSizeOfValueCase1() throws BufferOverflowException {
        /* Branches:
         * (switch(sizeOf(value)) = 1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<VarInt> varInt = mockStatic(VarInt.class, CALLS_REAL_METHODS)) {
            varInt.when(() -> VarInt.sizeOf(1L)).thenReturn(1);
            byte[] byteArray = new byte[]{(byte) 0};
            VarInt target = new VarInt(byteArray, 1);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            ByteBuffer result = target.write(byteBuffer);
            //Assert statement(s)
            assertThat(result, equalTo(byteBuffer));
            varInt.verify(() -> VarInt.sizeOf(1L), atLeast(1));
        }
    }

    //Sapient generated method id: ${f28a0c5f-7246-35e3-a8df-bf67ff4cb87a}, hash: B53817062A0AC6D7B2BDBE95F838AC67
    @Ignore()
    @Test()
    public void writeWhenSwitchSizeOfValueCase3() throws BufferOverflowException {
        /* Branches:
         * (switch(sizeOf(value)) = 3) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<VarInt> varInt = mockStatic(VarInt.class, CALLS_REAL_METHODS)) {
            varInt.when(() -> VarInt.sizeOf(1L)).thenReturn(3);
            byte[] byteArray = new byte[]{};
            VarInt target = new VarInt(byteArray, 1);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            ByteBuffer result = target.write(byteBuffer);
            //Assert statement(s)
            assertThat(result, equalTo(byteBuffer));
            varInt.verify(() -> VarInt.sizeOf(1L), atLeast(1));
        }
    }

    //Sapient generated method id: ${540a739f-930d-3594-8da2-b27a7cc61ac3}, hash: 68319D2FD4D7EC44BFF91B3F713C3A45
    @Ignore()
    @Test()
    public void writeWhenSwitchSizeOfValueCase5() throws BufferOverflowException {
        /* Branches:
         * (switch(sizeOf(value)) = 5) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<VarInt> varInt = mockStatic(VarInt.class, CALLS_REAL_METHODS)) {
            varInt.when(() -> VarInt.sizeOf(1L)).thenReturn(5);
            byte[] byteArray = new byte[]{};
            VarInt target = new VarInt(byteArray, 1);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            ByteBuffer result = target.write(byteBuffer);
            //Assert statement(s)
            assertThat(result, equalTo(byteBuffer));
            varInt.verify(() -> VarInt.sizeOf(1L), atLeast(1));
        }
    }

    //Sapient generated method id: ${1e290f86-1871-328b-aa0c-bc733544f04b}, hash: 863DD2B1420B2830C420FEEC6EB0FB56
    @Ignore()
    @Test()
    public void writeWhenSwitchSizeOfValueCaseDefault() throws BufferOverflowException {
        /* Branches:
         * (switch(sizeOf(value)) = default) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<VarInt> varInt = mockStatic(VarInt.class, CALLS_REAL_METHODS)) {
            varInt.when(() -> VarInt.sizeOf(0L)).thenReturn(0);
            byte[] byteArray = new byte[]{};
            VarInt target = new VarInt(byteArray, -1);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            ByteBuffer result = target.write(byteBuffer);
            //Assert statement(s)
            assertThat(result, equalTo(byteBuffer));
            varInt.verify(() -> VarInt.sizeOf(0L), atLeast(1));
        }
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: F3C9B1B8F12E01AA31CA709F98CC39C6
    @Ignore()
    @Test()
    public void toStringTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: buf - Method: get
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        VarInt target = new VarInt(byteArray, 0);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("0"));
    }
}
