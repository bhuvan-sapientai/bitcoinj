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
import static org.mockito.Mockito.CALLS_REAL_METHODS;

import org.junit.Ignore;
import org.bitcoinj.base.VarInt;

import static org.mockito.Mockito.spy;

public class RejectMessageSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Sha256Hash rejectedMessageHashMock = mock(Sha256Hash.class, "rejectedMessageHash");

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

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
        /*try (MockedStatic<Sha256Hash> sha256Hash = mockStatic(Sha256Hash.class);
    MockedStatic<Buffers> buffers = mockStatic(Buffers.class);
    MockedStatic<RejectMessage.RejectCode> rejectMessageRejectCode = mockStatic(RejectMessage.RejectCode.class, CALLS_REAL_METHODS)) {
    rejectMessageRejectCode.when(() -> RejectMessage.RejectCode.fromCode((byte) 1)).thenReturn(RejectMessage.RejectCode.MALFORMED);
    buffers.when(() -> Buffers.readLengthPrefixedString((ByteBuffer) any())).thenReturn("tx").thenReturn("String");
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    Sha256Hash sha256Hash2 = Sha256Hash.read(byteBuffer);
    sha256Hash.when(() -> Sha256Hash.read((ByteBuffer) any())).thenReturn(sha256Hash2);
    ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
    //Act Statement(s)
    RejectMessage result = RejectMessage.read(byteBuffer2);
    RejectMessage rejectMessage = new RejectMessage(RejectMessage.RejectCode.MALFORMED, sha256Hash2, "tx", "String");
    //Assert statement(s)
    assertThat(result, equalTo(rejectMessage));
    buffers.verify(() -> Buffers.readLengthPrefixedString((ByteBuffer) any()), atLeast(2));
    rejectMessageRejectCode.verify(() -> RejectMessage.RejectCode.fromCode((byte) 1), atLeast(1));
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
    rejectMessageRejectCode.when(() -> RejectMessage.RejectCode.fromCode((byte) 1)).thenReturn(RejectMessage.RejectCode.MALFORMED);
    buffers.when(() -> Buffers.readLengthPrefixedString((ByteBuffer) any())).thenReturn("").thenReturn("Block Reason reason");
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    //Act Statement(s)
    RejectMessage result = RejectMessage.read(byteBuffer);
    RejectMessage rejectMessage = new RejectMessage(RejectMessage.RejectCode.MALFORMED, (Sha256Hash) null, "", "Block Reason reason");
    //Assert statement(s)
    assertThat(result, equalTo(rejectMessage));
    buffers.verify(() -> Buffers.readLengthPrefixedString((ByteBuffer) any()), atLeast(2));
    rejectMessageRejectCode.verify(() -> RejectMessage.RejectCode.fromCode((byte) 1), atLeast(1));
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
        //VarInt varIntMock = mock(VarInt.class);
        /*try (MockedStatic<VarInt> varInt = mockStatic(VarInt.class)) {
    VarInt varInt2 = VarInt.of(5L);
    varInt.when(() -> VarInt.of(5L)).thenReturn(varInt2);
    varInt.when(() -> VarInt.of(13L)).thenReturn(varIntMock);
    byte[] byteArray = new byte[] {};
    doReturn(byteArray).when(varIntMock).serialize();
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
    Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
    RejectMessage target = new RejectMessage(RejectMessage.RejectCode.OTHER, sha256Hash, "block", "invalid block");
    OutputStream outputStream = OutputStream.nullOutputStream();
    //Act Statement(s)
    target.bitcoinSerializeToStream(outputStream);
    //Assert statement(s)
    varInt.verify(() -> VarInt.of(5L), atLeast(1));
    varInt.verify(() -> VarInt.of(13L), atLeast(1));
    verify(varIntMock).serialize();
}*/
    }

    //Sapient generated method id: ${a0a40d6a-fa19-3b92-884d-99287d87346f}
    @Test()
    public void rejectedMessageTest() {
        //Arrange Statement(s)
        //ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        //Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        //RejectMessage target = new RejectMessage(RejectMessage.RejectCode.MALFORMED, sha256Hash, "This is a rejected message.", "Invalid transaction data.");
        //Act Statement(s)
        //String result = target.rejectedMessage();
        //Assert statement(s)
        //assertThat(result, equalTo("This is a rejected message."));
    }

    //Sapient generated method id: ${9b79bcba-eedc-3879-b064-f1932b444c3d}
    @Ignore()
    @Test()
    public void getRejectedMessageTest() {
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        RejectMessage target = new RejectMessage(RejectMessage.RejectCode.MALFORMED, sha256Hash, "Test message", "Test reason");
        //Act Statement(s)
        String result = target.getRejectedMessage();
        //Assert statement(s)
        assertThat(result, equalTo("Test message"));
    }

    //Sapient generated method id: ${de6cf383-7f9b-378c-8a29-766fcb0c49a9}
    @Ignore()
    @Test()
    public void rejectedMessageHashTest() {
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        RejectMessage target = new RejectMessage(RejectMessage.RejectCode.INVALID, sha256Hash, "test message", "Invalid message");
        //Act Statement(s)
        Sha256Hash result = target.rejectedMessageHash();
        //Assert statement(s)
        assertThat(result, equalTo(sha256Hash));
    }

    //Sapient generated method id: ${de2d0bf5-a7af-316d-9508-d4f58480c1ed}
    @Ignore()
    @Test()
    public void getRejectedObjectHashTest() {
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        RejectMessage target = spy(new RejectMessage(RejectMessage.RejectCode.MALFORMED, sha256Hash, "This is a rejected message.", "Invalid transaction."));
        doReturn(sha256HashMock).when(target).rejectedMessageHash();
        //Act Statement(s)
        Sha256Hash result = target.getRejectedObjectHash();
        //Assert statement(s)
        assertThat(result, equalTo(sha256HashMock));
        verify(target).rejectedMessageHash();
    }

    //Sapient generated method id: ${d056b304-7a03-36ec-808e-bfed4857464d}
    @Ignore()
    @Test()
    public void codeTest() {
        //Arrange Statement(s)
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        RejectMessage target = new RejectMessage(RejectMessage.RejectCode.MALFORMED, sha256Hash, "message", "reason");
        //Act Statement(s)
        RejectMessage.RejectCode result = target.code();
        //Assert statement(s)
        assertThat(result, equalTo(RejectMessage.RejectCode.MALFORMED));
    }

    //Sapient generated method id: ${273e527c-5d07-3902-9d7c-d1a9fc22feaa}
    @Test()
    public void reasonTest() {
        //Arrange Statement(s)
        RejectMessage target = new RejectMessage(RejectMessage.RejectCode.MALFORMED, sha256HashMock, "rejectedMessage1", "reason1");
        //Act Statement(s)
        String result = target.reason();
        //Assert statement(s)
        assertThat(result, equalTo("reason1"));
    }

    //Sapient generated method id: ${7336d466-458b-35aa-a3c0-1f92511c376c}
    @Test()
    public void getReasonStringTest() {
        //Arrange Statement(s)
        //ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        //Sha256Hash sha256Hash = Sha256Hash.read(byteBuffer);
        //RejectMessage target = new RejectMessage(RejectMessage.RejectCode.MALFORMED, sha256Hash, "This is a rejected message", "Invalid transaction");
        //Act Statement(s)
        //String result = target.getReasonString();
        //Assert statement(s)
        //assertThat(result, equalTo("Invalid transaction"));
    }
}
