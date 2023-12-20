package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.nio.BufferOverflowException;

import org.junit.rules.ExpectedException;

import java.util.List;

import org.mockito.stubbing.Answer;

import java.nio.ByteBuffer;

import org.bitcoinj.base.internal.Preconditions;
import org.bitcoinj.crypto.ECKey;
import org.bitcoinj.crypto.TransactionSignature;
import org.bitcoinj.base.VarInt;

import java.util.function.Supplier;

import org.mockito.MockedStatic;
import org.bitcoinj.base.internal.Buffers;

import java.util.ArrayList;

import org.bitcoinj.script.Script;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.anyList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

public class TransactionWitnessSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final ECKey pubKeyMock = mock(ECKey.class);

    private final TransactionSignature signatureMock = mock(TransactionSignature.class);

    private final TransactionWitness transactionWitnessMock = mock(TransactionWitness.class);

    private final VarInt varIntMock = mock(VarInt.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${848b5418-f65f-3400-a9e9-12dec4a0a36f}
    @Test()
    public void redeemP2WPKHWhenSignatureIsNotNull() {
        /* Branches:
         * (signature != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<TransactionWitness> transactionWitness = mockStatic(TransactionWitness.class, CALLS_REAL_METHODS);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(signatureMock).encodeToBitcoin();
            doReturn(false).when(pubKeyMock).isCompressed();
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(pubKeyMock).getPubKey();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            transactionWitness.when(() -> TransactionWitness.of(anyList())).thenReturn(transactionWitnessMock);
            //Act Statement(s)
            TransactionWitness result = TransactionWitness.redeemP2WPKH(signatureMock, pubKeyMock);
            //Assert statement(s)
            assertThat(result, equalTo(transactionWitnessMock));
            verify(signatureMock, atLeast(1)).encodeToBitcoin();
            verify(pubKeyMock, atLeast(1)).isCompressed();
            verify(pubKeyMock, atLeast(1)).getPubKey();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            transactionWitness.verify(() -> TransactionWitness.of(anyList()), atLeast(1));
        }
    }

    //Sapient generated method id: ${fe971f55-5e80-3116-bec7-96642e064bb6}
    @Test()
    public void redeemP2WPKHWhenSignatureIsNull() {
        /* Branches:
         * (signature != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<TransactionWitness> transactionWitness = mockStatic(TransactionWitness.class, CALLS_REAL_METHODS);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(false).when(pubKeyMock).isCompressed();
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(pubKeyMock).getPubKey();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            transactionWitness.when(() -> TransactionWitness.of(anyList())).thenReturn(transactionWitnessMock);
            TransactionSignature transactionSignature = null;
            //Act Statement(s)
            TransactionWitness result = TransactionWitness.redeemP2WPKH(transactionSignature, pubKeyMock);
            //Assert statement(s)
            assertThat(result, equalTo(transactionWitnessMock));
            verify(pubKeyMock, atLeast(1)).isCompressed();
            verify(pubKeyMock, atLeast(1)).getPubKey();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()), atLeast(1));
            transactionWitness.verify(() -> TransactionWitness.of(anyList()), atLeast(1));
        }
    }

    //Sapient generated method id: ${d46e6454-f8cb-3644-a826-e4429686af60}
    @Test()
    public void redeemP2WSHWhenSignaturesIsNotEmpty() {
        /* Branches:
         * (for-each(signatures)) : true
         */
        //Arrange Statement(s)
        Script witnessScriptMock = mock(Script.class);
        try (MockedStatic<TransactionWitness> transactionWitness = mockStatic(TransactionWitness.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(witnessScriptMock).program();
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(signatureMock).encodeToBitcoin();
            transactionWitness.when(() -> TransactionWitness.of(anyList())).thenReturn(transactionWitnessMock);
            TransactionSignature[] transactionSignatureArray = new TransactionSignature[]{signatureMock};
            //Act Statement(s)
            TransactionWitness result = TransactionWitness.redeemP2WSH(witnessScriptMock, transactionSignatureArray);
            TransactionSignature[] transactionSignatureTransactionSignatureArrayArray = new TransactionSignature[]{signatureMock};
            //Assert statement(s)
            assertThat(result, equalTo(transactionWitnessMock));
            assertThat(transactionSignatureArray, equalTo(transactionSignatureTransactionSignatureArrayArray));
            verify(witnessScriptMock, atLeast(1)).program();
            verify(signatureMock, atLeast(1)).encodeToBitcoin();
            transactionWitness.verify(() -> TransactionWitness.of(anyList()), atLeast(1));
        }
    }

    //Sapient generated method id: ${946fac9c-df07-3dcd-9b8a-4a56705e4fba}
    @Test()
    public void ofThrowsNullPointerException() {
        //Arrange Statement(s)
        thrown.expect(NullPointerException.class);
        //TODO: Needs initialization with real value
        List<byte[]> list = null;
        //Act Statement(s)
        TransactionWitness.of(list);
    }

    //Sapient generated method id: ${2d9e451b-59ca-3da9-a6c7-f80da9bfa12e}
    @Test()
    public void of1Test() {
        //Arrange Statement(s)
        try (MockedStatic<TransactionWitness> transactionWitness = mockStatic(TransactionWitness.class, CALLS_REAL_METHODS)) {
            transactionWitness.when(() -> TransactionWitness.of(anyList())).thenReturn(transactionWitnessMock);
            byte[][] byteArray = new byte[][]{};
            //Act Statement(s)
            TransactionWitness result = TransactionWitness.of(byteArray);
            //Assert statement(s)
            assertThat(result, equalTo(transactionWitnessMock));
            transactionWitness.verify(() -> TransactionWitness.of(anyList()), atLeast(1));
        }
    }

    //Sapient generated method id: ${d7d7c181-85f8-3d2b-b5a1-c1ddd262297c}
    @Test()
    public void readWhenDefaultBranch() throws Throwable {
        /* Branches:
         * (y < pushCount) : true
         * (branch expression (line 108)) : true  #  inside <init> method
         */
        //Arrange Statement(s)
        try (MockedStatic<Buffers> buffers = mockStatic(Buffers.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<VarInt> varInt = mockStatic(VarInt.class)) {
            varInt.when(() -> VarInt.read((ByteBuffer) any())).thenReturn(varIntMock);
            doReturn(false).when(varIntMock).fitsInt();
            doReturn(1).when(varIntMock).intValue();
            preconditions.when(() -> Preconditions.check(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            buffers.when(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any())).thenReturn(byteArray);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            TransactionWitness result = TransactionWitness.read(byteBuffer);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            varInt.verify(() -> VarInt.read((ByteBuffer) any()));
            verify(varIntMock).fitsInt();
            verify(varIntMock).intValue();
            preconditions.verify(() -> Preconditions.check(eq(false), (Supplier) any()));
            buffers.verify(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any()));
        }
    }

    //Sapient generated method id: ${0638e125-c093-35a7-84b6-d0e54de8f380}
    @Ignore()
    @Test()
    public void getPushThrowsIndexOutOfBoundsException() {
        //Arrange Statement(s)
        try (MockedStatic<TransactionWitness> transactionWitness = mockStatic(TransactionWitness.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(signatureMock).encodeToBitcoin();
            doReturn(false).when(pubKeyMock).isCompressed();
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(pubKeyMock).getPubKey();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            transactionWitness.when(() -> TransactionWitness.of(anyList())).thenReturn(transactionWitnessMock);
            TransactionWitness target = TransactionWitness.redeemP2WPKH(signatureMock, pubKeyMock);
            thrown.expect(IndexOutOfBoundsException.class);
            //Act Statement(s)
            target.getPush(0);
            //Assert statement(s)
            verify(signatureMock).encodeToBitcoin();
            verify(pubKeyMock).isCompressed();
            verify(pubKeyMock).getPubKey();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            transactionWitness.verify(() -> TransactionWitness.of(anyList()));
        }
    }

    //Sapient generated method id: ${a2bf3b9b-c78f-381f-a368-c4049790a3f0}
    @Ignore()
    @Test()
    public void getPushCountTest() {
        //Arrange Statement(s)
        try (MockedStatic<TransactionWitness> transactionWitness = mockStatic(TransactionWitness.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(signatureMock).encodeToBitcoin();
            doReturn(false).when(pubKeyMock).isCompressed();
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(pubKeyMock).getPubKey();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            transactionWitness.when(() -> TransactionWitness.of(anyList())).thenReturn(transactionWitnessMock);
            TransactionWitness target = TransactionWitness.redeemP2WPKH(signatureMock, pubKeyMock);
            //Act Statement(s)
            int result = target.getPushCount();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            verify(signatureMock).encodeToBitcoin();
            verify(pubKeyMock).isCompressed();
            verify(pubKeyMock).getPubKey();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            transactionWitness.verify(() -> TransactionWitness.of(anyList()));
        }
    }

    //Sapient generated method id: ${77eab095-a4c8-34d9-9e51-066a5f4001e1}
    @Ignore()
    @Test()
    public void writeWhenPushesIsEmpty() throws BufferOverflowException {
        /* Branches:
         * (for-each(pushes)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<VarInt> varInt = mockStatic(VarInt.class);
             MockedStatic<TransactionWitness> transactionWitness = mockStatic(TransactionWitness.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(signatureMock).encodeToBitcoin();
            doReturn(false).when(pubKeyMock).isCompressed();
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(pubKeyMock).getPubKey();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            transactionWitness.when(() -> TransactionWitness.of(anyList())).thenReturn(transactionWitnessMock);
            varInt.when(() -> VarInt.of(0L)).thenReturn(varIntMock);
            doReturn(null).when(varIntMock).write((ByteBuffer) any());
            TransactionWitness target = TransactionWitness.redeemP2WPKH(signatureMock, pubKeyMock);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            ByteBuffer result = target.write(byteBuffer);
            //Assert statement(s)
            assertThat(result, equalTo(byteBuffer));
            verify(signatureMock).encodeToBitcoin();
            verify(pubKeyMock).isCompressed();
            verify(pubKeyMock).getPubKey();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            transactionWitness.verify(() -> TransactionWitness.of(anyList()));
            varInt.verify(() -> VarInt.of(0L), atLeast(1));
            verify(varIntMock).write((ByteBuffer) any());
        }
    }

    //Sapient generated method id: ${9d328af1-2293-3544-bbbc-a0683c1f9fbe}
    @Ignore()
    @Test()
    public void serializeTest() throws BufferOverflowException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<TransactionWitness> transactionWitness = mockStatic(TransactionWitness.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(signatureMock).encodeToBitcoin();
            doReturn(false).when(pubKeyMock).isCompressed();
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(pubKeyMock).getPubKey();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            List list = new ArrayList<>();
            TransactionWitness transactionWitness2 = TransactionWitness.of(list);
            transactionWitness.when(() -> TransactionWitness.of(anyList())).thenReturn(transactionWitness2);
            TransactionWitness target = spy(TransactionWitness.redeemP2WPKH(signatureMock, pubKeyMock));
            doReturn(1).when(target).messageSize();
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            doReturn(byteBuffer).when(target).write((ByteBuffer) any());
            //Act Statement(s)
            byte[] result = target.serialize();
            byte[] byteResultArray = new byte[]{};
            //Assert statement(s)
            assertThat(result, equalTo(byteResultArray));
            verify(signatureMock).encodeToBitcoin();
            verify(pubKeyMock).isCompressed();
            verify(pubKeyMock).getPubKey();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            transactionWitness.verify(() -> TransactionWitness.of(anyList()));
            verify(target).messageSize();
            verify(target).write((ByteBuffer) any());
        }
    }

    //Sapient generated method id: ${e09fc3d2-21a1-396e-a8d9-14d666298824}
    @Ignore()
    @Test()
    public void messageSizeWhenPushesIsEmpty() {
        /* Branches:
         * (for-each(pushes)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<TransactionWitness> transactionWitness = mockStatic(TransactionWitness.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(signatureMock).encodeToBitcoin();
            doReturn(false).when(pubKeyMock).isCompressed();
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(pubKeyMock).getPubKey();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            transactionWitness.when(() -> TransactionWitness.of(anyList())).thenReturn(transactionWitnessMock);
            TransactionWitness target = TransactionWitness.redeemP2WPKH(signatureMock, pubKeyMock);
            //Act Statement(s)
            int result = target.messageSize();
            //Assert statement(s)
            assertThat(result, equalTo(1));
            verify(signatureMock).encodeToBitcoin();
            verify(pubKeyMock).isCompressed();
            verify(pubKeyMock).getPubKey();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            transactionWitness.verify(() -> TransactionWitness.of(anyList()));
        }
    }

    //Sapient generated method id: ${435d64f5-8fca-31bf-b014-13944bac4d4c}
    @Ignore()
    @Test()
    public void getMessageSizeTest() {
        //Arrange Statement(s)
        try (MockedStatic<TransactionWitness> transactionWitness = mockStatic(TransactionWitness.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(signatureMock).encodeToBitcoin();
            doReturn(false).when(pubKeyMock).isCompressed();
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(pubKeyMock).getPubKey();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            transactionWitness.when(() -> TransactionWitness.of(anyList())).thenReturn(transactionWitnessMock);
            TransactionWitness target = spy(TransactionWitness.redeemP2WPKH(signatureMock, pubKeyMock));
            doReturn(0).when(target).messageSize();
            //Act Statement(s)
            int result = target.getMessageSize();
            //Assert statement(s)
            assertThat(result, equalTo(0));
            verify(signatureMock).encodeToBitcoin();
            verify(pubKeyMock).isCompressed();
            verify(pubKeyMock).getPubKey();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            transactionWitness.verify(() -> TransactionWitness.of(anyList()));
            verify(target).messageSize();
        }
    }

    //Sapient generated method id: ${e6355e02-ffe7-36cf-882f-9b4527452410}
    @Ignore()
    @Test()
    public void toStringWhenPushesIsEmpty() {
        /* Branches:
         * (for-each(pushes)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<TransactionWitness> transactionWitness = mockStatic(TransactionWitness.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(signatureMock).encodeToBitcoin();
            doReturn(false).when(pubKeyMock).isCompressed();
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(pubKeyMock).getPubKey();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            transactionWitness.when(() -> TransactionWitness.of(anyList())).thenReturn(transactionWitnessMock);
            TransactionWitness target = TransactionWitness.redeemP2WPKH(signatureMock, pubKeyMock);
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo(""));
            verify(signatureMock).encodeToBitcoin();
            verify(pubKeyMock).isCompressed();
            verify(pubKeyMock).getPubKey();
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
            transactionWitness.verify(() -> TransactionWitness.of(anyList()));
        }
    }
}