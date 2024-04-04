package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.nio.BufferUnderflowException;
import java.io.IOException;

import org.mockito.MockedStatic;

import java.nio.ByteBuffer;

import org.bitcoinj.base.internal.Buffers;

import java.io.OutputStream;
import java.io.ByteArrayOutputStream;

import org.bitcoinj.base.Sha256Hash;

import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class RejectMessageSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Sha256Hash rejectedMessageHashMock = mock(Sha256Hash.class, "rejectedMessageHash");

    //Sapient generated method id: ${2d6649f8-c557-3067-98c4-0d6fc7f7c485}, hash: BE6E05412A522526E3A08DAE3D4DA94D
    @Ignore()
    @Test()
    public void readWhenMessageEqualsTx() throws BufferUnderflowException, ProtocolException {
        /* Branches:
         * (message.equals("block")) : false
         * (message.equals("tx")) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: payload
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Sha256Hash sha256HashMock = mock(Sha256Hash.class, "Sha256Hash");
        try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class);
             MockedStatic<Buffers> buffers = mockStatic(Buffers.class);
             MockedStatic<RejectMessage.RejectCode> rejectMessageRejectCode = mockStatic(RejectMessage.RejectCode.class, CALLS_REAL_METHODS)) {
            rejectMessageRejectCode.when(() -> RejectMessage.RejectCode.fromCode((byte) 1)).thenReturn(RejectMessage.RejectCode.MALFORMED);
            buffers.when(() -> Buffers.readLengthPrefixedString((ByteBuffer) any())).thenReturn("tx").thenReturn("return_of_readLengthPrefixedString1");
            sha256Hash.when(() -> Sha256Hash.read((ByteBuffer) any())).thenReturn(sha256HashMock);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            RejectMessage result = RejectMessage.read(byteBuffer);
            RejectMessage rejectMessage = new RejectMessage(RejectMessage.RejectCode.MALFORMED, sha256HashMock, "tx", "return_of_readLengthPrefixedString1");
            //Assert statement(s)
            assertThat(result, equalTo(rejectMessage));
            buffers.verify(() -> Buffers.readLengthPrefixedString((ByteBuffer) any()), atLeast(2));
            rejectMessageRejectCode.verify(() -> RejectMessage.RejectCode.fromCode((byte) 1), atLeast(1));
            sha256Hash.verify(() -> Sha256Hash.read((ByteBuffer) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${331e14b9-8aba-3d2e-9e2b-46463b7cf0d3}, hash: E514CF49AB0164E264B77BFBD5203BD2
    @Ignore()
    @Test()
    public void readWhenMessageNotEqualsTx() throws BufferUnderflowException, ProtocolException {
        /* Branches:
         * (message.equals("block")) : false
         * (message.equals("tx")) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: payload
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Buffers> buffers = mockStatic(Buffers.class);
             MockedStatic<RejectMessage.RejectCode> rejectMessageRejectCode = mockStatic(RejectMessage.RejectCode.class, CALLS_REAL_METHODS)) {
            rejectMessageRejectCode.when(() -> RejectMessage.RejectCode.fromCode((byte) 1)).thenReturn(RejectMessage.RejectCode.MALFORMED);
            buffers.when(() -> Buffers.readLengthPrefixedString((ByteBuffer) any())).thenReturn("").thenReturn("return_of_readLengthPrefixedString1");
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            RejectMessage result = RejectMessage.read(byteBuffer);
            RejectMessage rejectMessage = new RejectMessage(RejectMessage.RejectCode.MALFORMED, (Sha256Hash) null, "", "return_of_readLengthPrefixedString1");
            //Assert statement(s)
            assertThat(result, equalTo(rejectMessage));
            buffers.verify(() -> Buffers.readLengthPrefixedString((ByteBuffer) any()), atLeast(2));
            rejectMessageRejectCode.verify(() -> RejectMessage.RejectCode.fromCode((byte) 1), atLeast(1));
        }
    }

    //Sapient generated method id: ${37e1b398-87dc-30b8-9f81-7e1ab7a10ced}, hash: C1980B241B6E6E0777C90F7436264EFE
    @Test()
    public void bitcoinSerializeToStreamWhenTxEqualsRejectedMessage() throws IOException {
        /* Branches:
         * ("block".equals(rejectedMessage)) : false
         * ("tx".equals(rejectedMessage)) : true
         */
        //Arrange Statement(s)
        RejectMessage target = new RejectMessage(RejectMessage.RejectCode.INVALID, rejectedMessageHashMock, "tx", "reason1");
        byte[] byteArray = new byte[]{};
        doReturn(byteArray).when(rejectedMessageHashMock).serialize();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        //Act Statement(s)
        target.bitcoinSerializeToStream(byteArrayOutputStream);
        //Assert statement(s)
        verify(rejectedMessageHashMock).serialize();
    }

    //Sapient generated method id: ${a0a40d6a-fa19-3b92-884d-99287d87346f}, hash: 96B90DA50965D5C016D13875BF94689B
    @Test()
    public void rejectedMessageTest() {
        //Arrange Statement(s)
        RejectMessage target = new RejectMessage(RejectMessage.RejectCode.MALFORMED, rejectedMessageHashMock, "rejectedMessage1", "reason1");
        //Act Statement(s)
        String result = target.rejectedMessage();
        //Assert statement(s)
        assertThat(result, equalTo("rejectedMessage1"));
    }

    //Sapient generated method id: ${9b79bcba-eedc-3879-b064-f1932b444c3d}, hash: 94621C46841E79A75F7284F85042DABF
    @Test()
    public void getRejectedMessageTest() {
        //Arrange Statement(s)
        RejectMessage target = new RejectMessage(RejectMessage.RejectCode.MALFORMED, rejectedMessageHashMock, "rejectedMessage1", "reason1");
        //Act Statement(s)
        String result = target.getRejectedMessage();
        //Assert statement(s)
        assertThat(result, equalTo("rejectedMessage1"));
    }

    //Sapient generated method id: ${de6cf383-7f9b-378c-8a29-766fcb0c49a9}, hash: 7C4E8E811E24F66798B6D7DE95686E87
    @Test()
    public void rejectedMessageHashTest() {
        //Arrange Statement(s)
        RejectMessage target = new RejectMessage(RejectMessage.RejectCode.MALFORMED, rejectedMessageHashMock, "rejectedMessage1", "reason1");
        //Act Statement(s)
        Sha256Hash result = target.rejectedMessageHash();
        //Assert statement(s)
        assertThat(result, equalTo(rejectedMessageHashMock));
    }

    //Sapient generated method id: ${de2d0bf5-a7af-316d-9508-d4f58480c1ed}, hash: A08E11BEA0A7FAC550698EE80EC6D4B5
    @Test()
    public void getRejectedObjectHashTest() {
        //Arrange Statement(s)
        RejectMessage target = new RejectMessage(RejectMessage.RejectCode.MALFORMED, rejectedMessageHashMock, "rejectedMessage1", "reason1");
        //Act Statement(s)
        Sha256Hash result = target.getRejectedObjectHash();
        //Assert statement(s)
        assertThat(result, equalTo(rejectedMessageHashMock));
    }

    //Sapient generated method id: ${d056b304-7a03-36ec-808e-bfed4857464d}, hash: 6EF47D31D0F9974DB9114836455371A6
    @Test()
    public void codeTest() {
        //Arrange Statement(s)
        RejectMessage target = new RejectMessage(RejectMessage.RejectCode.MALFORMED, rejectedMessageHashMock, "rejectedMessage1", "reason1");
        //Act Statement(s)
        RejectMessage.RejectCode result = target.code();
        //Assert statement(s)
        assertThat(result, equalTo(RejectMessage.RejectCode.MALFORMED));
    }

    //Sapient generated method id: ${186b03ba-31cd-3d7e-bcee-8b0f1bba0b9b}, hash: 2440C6D44550D75CBF38EB48FAA78442
    @Test()
    public void getReasonCodeTest() {
        //Arrange Statement(s)
        RejectMessage target = new RejectMessage(RejectMessage.RejectCode.MALFORMED, rejectedMessageHashMock, "rejectedMessage1", "reason1");
        //Act Statement(s)
        RejectMessage.RejectCode result = target.getReasonCode();
        //Assert statement(s)
        assertThat(result, equalTo(RejectMessage.RejectCode.MALFORMED));
    }

    //Sapient generated method id: ${273e527c-5d07-3902-9d7c-d1a9fc22feaa}, hash: BE7C63002F04F371D48252D6AA1A61D8
    @Test()
    public void reasonTest() {
        //Arrange Statement(s)
        RejectMessage target = new RejectMessage(RejectMessage.RejectCode.MALFORMED, rejectedMessageHashMock, "rejectedMessage1", "reason1");
        //Act Statement(s)
        String result = target.reason();
        //Assert statement(s)
        assertThat(result, equalTo("reason1"));
    }

    //Sapient generated method id: ${7336d466-458b-35aa-a3c0-1f92511c376c}, hash: 05389A213752FE36C6C268F42744327C
    @Test()
    public void getReasonStringTest() {
        //Arrange Statement(s)
        RejectMessage target = new RejectMessage(RejectMessage.RejectCode.MALFORMED, rejectedMessageHashMock, "rejectedMessage1", "reason1");
        //Act Statement(s)
        String result = target.getReasonString();
        //Assert statement(s)
        assertThat(result, equalTo("reason1"));
    }

    //Sapient generated method id: ${3c2a2659-1610-37fb-a611-5e70478e1ca0}, hash: C72DC85D95A58279137545954D79FFDC
    @Ignore()
    @Test()
    public void toStringWhenRejectedMessageHashIsNotNull() {
        /* Branches:
         * (rejectedMessageHash != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        RejectMessage target = new RejectMessage(RejectMessage.RejectCode.OTHER, sha256Hash, "test message", "invalid message");
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("result1"));
    }
}
