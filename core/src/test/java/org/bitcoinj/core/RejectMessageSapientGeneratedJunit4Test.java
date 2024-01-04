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

import org.bitcoinj.base.Sha256Hash;

import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

import static org.mockito.Mockito.CALLS_REAL_METHODS;

public class RejectMessageSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Sha256Hash rejectedMessageHashMock = mock(Sha256Hash.class, "rejectedMessageHash");

    //Sapient generated method id: ${2d6649f8-c557-3067-98c4-0d6fc7f7c485}
    @Ignore()
    @Test()
    public void readWhenMessageEqualsTx() throws BufferUnderflowException, ProtocolException {
        /* Branches:
         * (message.equals("block")) : false
         * (message.equals("tx")) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //Sha256Hash sha256HashMock = mock(Sha256Hash.class);
        /*try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class);
    MockedStatic<Buffers> buffers = mockStatic(Buffers.class);
    MockedStatic<RejectMessage.RejectCode> rejectMessageRejectCode = mockStatic(RejectMessage.RejectCode.class, CALLS_REAL_METHODS)) {
    rejectMessageRejectCode.when(() -> RejectMessage.RejectCode.fromCode((byte) 0)).thenReturn(RejectMessage.RejectCode.MALFORMED);
    buffers.when(() -> Buffers.readLengthPrefixedString((ByteBuffer) any())).thenReturn("tx").thenReturn("return_of_readLengthPrefixedString1");
    sha256Hash.when(() -> Sha256Hash.read((ByteBuffer) any())).thenReturn(sha256HashMock);
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    //Act Statement(s)
    RejectMessage result = RejectMessage.read(byteBuffer);
    RejectMessage rejectMessage = new RejectMessage(RejectMessage.RejectCode.MALFORMED, sha256HashMock, "tx", "return_of_readLengthPrefixedString1");
    //Assert statement(s)
    assertThat(result, equalTo(rejectMessage));
    buffers.verify(() -> Buffers.readLengthPrefixedString((ByteBuffer) any()), atLeast(2));
    rejectMessageRejectCode.verify(() -> RejectMessage.RejectCode.fromCode((byte) 0), atLeast(1));
    sha256Hash.verify(() -> Sha256Hash.read((ByteBuffer) any()), atLeast(1));
}*/
    }

    //Sapient generated method id: ${331e14b9-8aba-3d2e-9e2b-46463b7cf0d3}
    @Test()
    public void readWhenMessageNotEqualsTx() throws BufferUnderflowException, ProtocolException {
        /* Branches:
         * (message.equals("block")) : false
         * (message.equals("tx")) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<Buffers> buffers = mockStatic(Buffers.class);
    MockedStatic<RejectMessage.RejectCode> rejectMessageRejectCode = mockStatic(RejectMessage.RejectCode.class, CALLS_REAL_METHODS)) {
    rejectMessageRejectCode.when(() -> RejectMessage.RejectCode.fromCode((byte) 0)).thenReturn(RejectMessage.RejectCode.MALFORMED);
    buffers.when(() -> Buffers.readLengthPrefixedString((ByteBuffer) any())).thenReturn("A").thenReturn("return_of_readLengthPrefixedString1");
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    //Act Statement(s)
    RejectMessage result = RejectMessage.read(byteBuffer);
    RejectMessage rejectMessage = new RejectMessage(RejectMessage.RejectCode.MALFORMED, (Sha256Hash) null, "A", "return_of_readLengthPrefixedString1");
    //Assert statement(s)
    assertThat(result, equalTo(rejectMessage));
    buffers.verify(() -> Buffers.readLengthPrefixedString((ByteBuffer) any()), atLeast(2));
    rejectMessageRejectCode.verify(() -> RejectMessage.RejectCode.fromCode((byte) 0), atLeast(1));
}*/
    }

    //Sapient generated method id: ${37e1b398-87dc-30b8-9f81-7e1ab7a10ced}
    @Test()
    public void bitcoinSerializeToStreamWhenTxEqualsRejectedMessage() throws IOException {
        /* Branches:
         * ("block".equals(rejectedMessage)) : false
         * ("tx".equals(rejectedMessage)) : true
         */
        //Arrange Statement(s)
        //RejectMessage target = new RejectMessage(RejectMessage.RejectCode.INVALID, rejectedMessageHashMock, "tx", "reason1");
        //byte[] byteArray = new byte[] {};
        //doReturn(byteArray).when(rejectedMessageHashMock).serialize();
        //OutputStream outputStream = OutputStream.nullOutputStream();
        //Act Statement(s)
        //target.bitcoinSerializeToStream(outputStream);
        //Assert statement(s)
        //verify(rejectedMessageHashMock).serialize();
    }

    //Sapient generated method id: ${a0a40d6a-fa19-3b92-884d-99287d87346f}
    @Test()
    public void rejectedMessageTest() {
        //Arrange Statement(s)
        //RejectMessage target = new RejectMessage(RejectMessage.RejectCode.MALFORMED, rejectedMessageHashMock, "rejectedMessage1", "reason1");
        //Act Statement(s)
        //String result = target.rejectedMessage();
        //Assert statement(s)
        //assertThat(result, equalTo("rejectedMessage1"));
    }

    //Sapient generated method id: ${9b79bcba-eedc-3879-b064-f1932b444c3d}
    @Test()
    public void getRejectedMessageTest() {
        //Arrange Statement(s)
        //RejectMessage target = new RejectMessage(RejectMessage.RejectCode.MALFORMED, rejectedMessageHashMock, "rejectedMessage1", "reason1");
        //Act Statement(s)
        //String result = target.getRejectedMessage();
        //Assert statement(s)
        //assertThat(result, equalTo("rejectedMessage1"));
    }

    //Sapient generated method id: ${de6cf383-7f9b-378c-8a29-766fcb0c49a9}
    @Test()
    public void rejectedMessageHashTest() {
        //Arrange Statement(s)
        RejectMessage target = new RejectMessage(RejectMessage.RejectCode.MALFORMED, rejectedMessageHashMock, "rejectedMessage1", "reason1");
        //Act Statement(s)
        Sha256Hash result = target.rejectedMessageHash();
        //Assert statement(s)
        assertThat(result, equalTo(rejectedMessageHashMock));
    }

    //Sapient generated method id: ${de2d0bf5-a7af-316d-9508-d4f58480c1ed}
    @Test()
    public void getRejectedObjectHashTest() {
        //Arrange Statement(s)
        //RejectMessage target = new RejectMessage(RejectMessage.RejectCode.MALFORMED, rejectedMessageHashMock, "rejectedMessage1", "reason1");
        //Act Statement(s)
        //Sha256Hash result = target.getRejectedObjectHash();
        //Assert statement(s)
        //assertThat(result, equalTo(rejectedMessageHashMock));
    }

    //Sapient generated method id: ${d056b304-7a03-36ec-808e-bfed4857464d}
    @Test()
    public void codeTest() {
        //Arrange Statement(s)
        RejectMessage target = new RejectMessage(RejectMessage.RejectCode.MALFORMED, rejectedMessageHashMock, "rejectedMessage1", "reason1");
        //Act Statement(s)
        RejectMessage.RejectCode result = target.code();
        //Assert statement(s)
        assertThat(result, equalTo(RejectMessage.RejectCode.MALFORMED));
    }

    //Sapient generated method id: ${186b03ba-31cd-3d7e-bcee-8b0f1bba0b9b}
    @Test()
    public void getReasonCodeTest() {
        //Arrange Statement(s)
        RejectMessage target = new RejectMessage(RejectMessage.RejectCode.MALFORMED, rejectedMessageHashMock, "rejectedMessage1", "reason1");
        //Act Statement(s)
        RejectMessage.RejectCode result = target.getReasonCode();
        //Assert statement(s)
        assertThat(result, equalTo(RejectMessage.RejectCode.MALFORMED));
    }

    //Sapient generated method id: ${273e527c-5d07-3902-9d7c-d1a9fc22feaa}
    @Test()
    public void reasonTest() {
        //Arrange Statement(s)
        //RejectMessage target = new RejectMessage(RejectMessage.RejectCode.MALFORMED, rejectedMessageHashMock, "rejectedMessage1", "reason1");
        //Act Statement(s)
        //String result = target.reason();
        //Assert statement(s)
        //assertThat(result, equalTo("reason1"));
    }

    //Sapient generated method id: ${7336d466-458b-35aa-a3c0-1f92511c376c}
    @Test()
    public void getReasonStringTest() {
        //Arrange Statement(s)
        RejectMessage target = new RejectMessage(RejectMessage.RejectCode.MALFORMED, rejectedMessageHashMock, "rejectedMessage1", "reason1");
        //Act Statement(s)
        String result = target.getReasonString();
        //Assert statement(s)
        assertThat(result, equalTo("reason1"));
    }

    //Sapient generated method id: ${3c2a2659-1610-37fb-a611-5e70478e1ca0}
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
        RejectMessage target = new RejectMessage(RejectMessage.RejectCode.OTHER, rejectedMessageHashMock, "rejectedMessage1", "reason1");
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("result1"));
    }
}
