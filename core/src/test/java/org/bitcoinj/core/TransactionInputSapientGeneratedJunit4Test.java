package org.bitcoinj.core;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.nio.BufferUnderflowException;
import java.nio.BufferOverflowException;

import org.bitcoinj.script.ScriptException;
import org.junit.rules.ExpectedException;

import java.util.List;

import org.bitcoinj.wallet.KeyBag;
import org.bitcoinj.wallet.DefaultRiskAnalysis;
import org.bitcoinj.base.VarInt;
import org.bitcoinj.script.ScriptError;
import org.bitcoinj.base.Coin;

import java.util.Map;

import org.bitcoinj.base.internal.ByteUtils;

import java.util.HashMap;
import java.util.ArrayList;

import org.bitcoinj.script.Script;
import org.mockito.stubbing.Answer;

import java.util.EnumSet;
import java.nio.ByteBuffer;

import org.bitcoinj.base.internal.Preconditions;
import org.bitcoinj.base.Sha256Hash;
import org.bitcoinj.wallet.RedeemData;

import java.util.function.Supplier;

import org.mockito.MockedStatic;
import org.bitcoinj.base.internal.Buffers;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;
import org.bitcoinj.base.internal.InternalUtils;

public class TransactionInputSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final TransactionOutPoint outpointMock = mock(TransactionOutPoint.class, "<init>_transactionOutPoint1");

    private final Coin coinMock = mock(Coin.class);

    private final TransactionOutput outputMock = mock(TransactionOutput.class);

    private final Script scriptMock = mock(Script.class, "toString_script1");

    private final Script scriptMock2 = mock(Script.class);

    private final Sha256Hash sha256HashMock = mock(Sha256Hash.class);

    private final Transaction transactionMock = mock(Transaction.class);

    private final Transaction transactionMock2 = mock(Transaction.class);

    private final TransactionOutPoint transactionOutPointMock = mock(TransactionOutPoint.class);

    private final TransactionOutput transactionOutputMock = mock(TransactionOutput.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    private final Coin valueMock = mock(Coin.class);

    //Sapient generated method id: ${086d8d32-3798-3ce3-87ef-2066773d7acb}
    @Ignore()
    @Test()
    public void coinbaseInputWhenScriptBytesLengthLessThanOrEqualsTo100ThrowsIllegalArgumentException() {
        /* Branches:
         * (scriptBytes.length >= 2) : true
         * (scriptBytes.length <= 100) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            thrown.expect(IllegalArgumentException.class);
            byte[] byteArray = new byte[]{(byte) 0, (byte) 1};
            //Act Statement(s)
            TransactionInput.coinbaseInput(transactionMock, byteArray);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${40f12486-3699-36e2-aaba-be7af4a8b4c1}
    @Test()
    public void coinbaseInputWhenScriptBytesLengthGreaterThan100ThrowsIllegalArgumentException() {
        /* Branches:
         * (scriptBytes.length >= 2) : true
         * (scriptBytes.length <= 100) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            thrown.expect(IllegalArgumentException.class);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            TransactionInput.coinbaseInput(transactionMock, byteArray);
            //Assert statement(s)
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${d7d7c181-85f8-3d2b-b5a1-c1ddd262297c}
    @Test()
    public void readWhenDefaultBranch() throws BufferUnderflowException, ProtocolException {
        /* Branches:
         * (branch expression (line 133)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class);
             MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Buffers> buffers = mockStatic(Buffers.class);
             MockedStatic<TransactionOutPoint> transactionOutPoint = mockStatic(TransactionOutPoint.class)) {
            transactionOutPoint.when(() -> TransactionOutPoint.read((ByteBuffer) any())).thenReturn(transactionOutPointMock);
            byte[] byteArray = new byte[]{};
            buffers.when(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any())).thenReturn(byteArray);
            byteUtils.when(() -> ByteUtils.readUint32((ByteBuffer) any())).thenReturn(0L);
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            TransactionInput result = TransactionInput.read(byteBuffer, transactionMock);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            transactionOutPoint.verify(() -> TransactionOutPoint.read((ByteBuffer) any()));
            buffers.verify(() -> Buffers.readLengthPrefixedBytes((ByteBuffer) any()));
            byteUtils.verify(() -> ByteUtils.readUint32((ByteBuffer) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${92ec4297-962b-3285-b020-9fbd4aaa4b81}
    @Test()
    public void getIndexWhenMyIndexLessThan0ThrowsIllegalStateException() {
        /* Branches:
         * (myIndex < 0) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            List<TransactionInput> transactionInputList = new ArrayList<>();
            doReturn(transactionInputList).when(transactionMock).getInputs();
            doReturn(1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
            IllegalStateException illegalStateException = new IllegalStateException("Input linked to wrong parent transaction?");
            thrown.expect(IllegalStateException.class);
            thrown.expectMessage(illegalStateException.getMessage());
            //Act Statement(s)
            target.getIndex();
            //Assert statement(s)
            verify(transactionMock).getInputs();
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${74367ac6-67d1-3ba8-9bdd-4aafa43d4139}
    @Test()
    public void writeTest() throws BufferOverflowException {
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Buffers> buffers = mockStatic(Buffers.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            byte[] byteArray = new byte[]{};
            buffers.when(() -> Buffers.writeLengthPrefixedBytes((ByteBuffer) any(), eq(byteArray))).thenReturn(byteBuffer);
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
            byteUtils.when(() -> ByteUtils.writeInt32LE(eq(4294967295L), (ByteBuffer) any())).thenReturn(byteBuffer2);
            TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(outpointMock).serialize();
            ByteBuffer byteBuffer3 = ByteBuffer.allocateDirect(0);
            //Act Statement(s)
            ByteBuffer result = target.write(byteBuffer3);
            //Assert statement(s)
            assertThat(result, equalTo(byteBuffer3));
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            buffers.verify(() -> Buffers.writeLengthPrefixedBytes((ByteBuffer) any(), eq(byteArray)));
            byteUtils.verify(() -> ByteUtils.writeInt32LE(eq(4294967295L), (ByteBuffer) any()));
            verify(outpointMock).serialize();
        }
    }

    //Sapient generated method id: ${9d328af1-2293-3544-bbbc-a0683c1f9fbe}
    @Test()
    public void serializeTest() {
        //Arrange Statement(s)
        try (MockedStatic<ByteUtils> byteUtils = mockStatic(ByteUtils.class);
             MockedStatic<Buffers> buffers = mockStatic(Buffers.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(0).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
            byte[] byteArray = new byte[]{};
            buffers.when(() -> Buffers.writeLengthPrefixedBytes((ByteBuffer) any(), eq(byteArray))).thenReturn(byteBuffer);
            ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(0);
            byteUtils.when(() -> ByteUtils.writeInt32LE(eq(4294967295L), (ByteBuffer) any())).thenReturn(byteBuffer2);
            TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(outpointMock).serialize();
            //Act Statement(s)
            byte[] result = target.serialize();
            byte[] byteResultArray = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            //Assert statement(s)
            assertThat(result, equalTo(byteResultArray));
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            buffers.verify(() -> Buffers.writeLengthPrefixedBytes((ByteBuffer) any(), eq(byteArray)));
            byteUtils.verify(() -> ByteUtils.writeInt32LE(eq(4294967295L), (ByteBuffer) any()));
            verify(outpointMock).serialize();
        }
    }

    //Sapient generated method id: ${924fe7c3-f32b-3ad4-96ee-4ebf1903d243}
    @Test()
    public void bitcoinSerializeTest() {
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            TransactionInput target = spy(new TransactionInput(transactionMock, byteArray, outpointMock, valueMock));
            byte[] byteArray2 = new byte[]{};
            doReturn(byteArray2).when(target).serialize();
            //Act Statement(s)
            byte[] result = target.bitcoinSerialize();
            //Assert statement(s)
            assertThat(result, equalTo(byteArray2));
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(target).serialize();
        }
    }

    //Sapient generated method id: ${c2057553-a090-359a-8f38-97b151dff7fd}
    @Test()
    public void messageSizeTest() {
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(0).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
            //Act Statement(s)
            int result = target.messageSize();
            //Assert statement(s)
            assertThat(result, equalTo(41));
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${435d64f5-8fca-31bf-b014-13944bac4d4c}
    @Test()
    public void getMessageSizeTest() {
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(0).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
            //Act Statement(s)
            int result = target.getMessageSize();
            //Assert statement(s)
            assertThat(result, equalTo(41));
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${be0fa096-1684-3633-8eb3-6476d95e5285}
    @Ignore()
    @Test()
    public void isCoinBaseWhenOutpointIndexAnd0xFFFFFFFFLEquals0xFFFFFFFFL() {
        /* Branches:
         * (outpoint.hash().equals(Sha256Hash.ZERO_HASH)) : true
         * ((outpoint.index() & 0xFFFFFFFFL) == 0xFFFFFFFFL) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
            Sha256Hash sha256Hash = Sha256Hash.ZERO_HASH;
            doReturn(sha256Hash).when(outpointMock).hash();
            doReturn(0L).when(outpointMock).index();
            //Act Statement(s)
            boolean result = target.isCoinBase();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(outpointMock).hash();
            verify(outpointMock).index();
        }
    }

    //Sapient generated method id: ${6aa2fd7e-04c0-3d5f-81e9-f50072f71b6c}
    @Ignore()
    @Test()
    public void isCoinBaseWhenOutpointIndexAnd0xFFFFFFFFLNotEquals0xFFFFFFFFL() {
        /* Branches:
         * (outpoint.hash().equals(Sha256Hash.ZERO_HASH)) : true
         * ((outpoint.index() & 0xFFFFFFFFL) == 0xFFFFFFFFL) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
            Sha256Hash sha256Hash = Sha256Hash.ZERO_HASH;
            doReturn(sha256Hash).when(outpointMock).hash();
            doReturn(0L).when(outpointMock).index();
            //Act Statement(s)
            boolean result = target.isCoinBase();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(outpointMock).hash();
            verify(outpointMock).index();
        }
    }

    //Sapient generated method id: ${89c9d720-cbdf-39bc-a748-ded3adad5df4}
    @Test()
    public void getScriptSigWhenScriptIsNull() throws ScriptException {
        /* Branches:
         * (scriptSig == null) : true
         * (script == null) : true
         */
        //Arrange Statement(s)
        Script scriptMock = mock(Script.class);
        try (MockedStatic<Script> script = mockStatic(Script.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            script.when(() -> Script.parse(byteArray)).thenReturn(scriptMock);
            TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
            //Act Statement(s)
            Script result = target.getScriptSig();
            //Assert statement(s)
            assertThat(result, equalTo(scriptMock));
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            script.verify(() -> Script.parse(byteArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${59b5efe5-605f-3bb0-8f71-ee61e2f3edac}
    @Test()
    public void setScriptSigTest() {
        //Arrange Statement(s)
        Script scriptSigMock = mock(Script.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            byte[] byteArray = new byte[]{};
            doReturn(byteArray).when(scriptSigMock).program();
            doReturn(1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray2 = new byte[]{};
            TransactionInput target = new TransactionInput(transactionMock, byteArray2, outpointMock, valueMock);
            //Act Statement(s)
            target.setScriptSig(scriptSigMock);
            //Assert statement(s)
            verify(scriptSigMock).program();
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${be1784fd-76a1-3443-86aa-085c77de84d1}
    @Ignore()
    @Test()
    public void setSequenceNumberWhenSequenceLessThanOrEqualsToByteUtilsMAX_UNSIGNED_INTEGERThrowsIllegalArgumentException() {
        /* Branches:
         * (sequence >= 0) : true
         * (sequence <= ByteUtils.MAX_UNSIGNED_INTEGER) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            byte[] byteArray = new byte[]{};
            TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.setSequenceNumber(0L);
            //Assert statement(s)
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${1056188a-ff6c-3a2e-b712-b608128db79d}
    @Ignore()
    @Test()
    public void setSequenceNumberWhenSequenceGreaterThanByteUtilsMAX_UNSIGNED_INTEGERThrowsIllegalArgumentException() {
        /* Branches:
         * (sequence >= 0) : true
         * (sequence <= ByteUtils.MAX_UNSIGNED_INTEGER) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            preconditions.when(() -> Preconditions.checkArgument(eq(false), (Supplier) any())).thenThrow(illegalArgumentException);
            byte[] byteArray = new byte[]{};
            TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            target.setSequenceNumber(1L);
            //Assert statement(s)
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            preconditions.verify(() -> Preconditions.checkArgument(eq(false), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${a1dbfa94-6d62-35a9-b0ad-2eac49c6a888}
    @Test()
    public void clearScriptBytesTest() {
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
            //Act Statement(s)
            target.clearScriptBytes();
            //Assert statement(s)
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${ddffe4ea-c8c6-349e-a521-6f34d6e22f54}
    @Test()
    public void setScriptBytesTest() {
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
            byte[] byteArray2 = new byte[]{};
            //Act Statement(s)
            target.setScriptBytes(byteArray2);
            //Assert statement(s)
            assertThat(target.getScriptBytes(), equalTo(byteArray2));
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${2a1c2288-01af-3923-8d14-ce6954e371cd}
    @Test()
    public void getWitnessWhenWitnessIsNull() {
        /* Branches:
         * (witness != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
            //Act Statement(s)
            TransactionWitness result = target.getWitness();
            TransactionWitness transactionWitness = TransactionWitness.EMPTY;
            //Assert statement(s)
            assertThat(result, equalTo(transactionWitness));
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${ebafeb6a-4522-326e-bcab-1a61636af1c3}
    @Test()
    public void hasWitnessWhenWitnessIsNull() {
        /* Branches:
         * (witness != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
            //Act Statement(s)
            boolean result = target.hasWitness();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${12545608-6ee4-3b98-a547-7adcea97af66}
    @Test()
    public void getConnectedOutputWhenTxIsNull() {
        /* Branches:
         * (tx == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(0).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
            doReturn(sha256HashMock).when(outpointMock).hash();
            Map<Sha256Hash, Transaction> sha256HashTransactionMap = new HashMap<>();
            sha256HashTransactionMap.put(sha256HashMock, (Transaction) null);
            //Act Statement(s)
            TransactionOutput result = target.getConnectedOutput(sha256HashTransactionMap);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(outpointMock).hash();
        }
    }

    //Sapient generated method id: ${04a07209-acae-3dad-8ca2-c73721dc26cb}
    @Test()
    public void getConnectedOutputWhenTxIsNotNull() {
        /* Branches:
         * (tx == null) : false
         */
        //Arrange Statement(s)
        Transaction txMock = mock(Transaction.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(transactionOutputMock).when(txMock).getOutput(outpointMock);
            doReturn(0).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
            doReturn(sha256HashMock).when(outpointMock).hash();
            Map<Sha256Hash, Transaction> sha256HashTransactionMap = new HashMap<>();
            sha256HashTransactionMap.put(sha256HashMock, txMock);
            //Act Statement(s)
            TransactionOutput result = target.getConnectedOutput(sha256HashTransactionMap);
            //Assert statement(s)
            assertThat(result, equalTo(transactionOutputMock));
            verify(txMock).getOutput(outpointMock);
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(outpointMock).hash();
        }
    }

    //Sapient generated method id: ${1951ee9d-5aac-364d-9832-6d9fcf0df2d9}
    @Test()
    public void getConnectedRedeemDataTest() throws ScriptException {
        //Arrange Statement(s)
        RedeemData redeemDataMock = mock(RedeemData.class);
        KeyBag keyBagMock = mock(KeyBag.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(redeemDataMock).when(outpointMock).getConnectedRedeemData(keyBagMock);
            doReturn(1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
            //Act Statement(s)
            RedeemData result = target.getConnectedRedeemData(keyBagMock);
            //Assert statement(s)
            assertThat(result, equalTo(redeemDataMock));
            verify(outpointMock).getConnectedRedeemData(keyBagMock);
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${d85af97f-42e1-3b78-bf22-1c200f6e49a8}
    @Test()
    public void connect2Test() {
        //Arrange Statement(s)
        TransactionOutput outMock = mock(TransactionOutput.class);
        Coin coinMock = mock(Coin.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(transactionMock).when(outMock).getParentTransaction();
            doReturn(coinMock).when(outMock).getValue();
            doReturn(1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            TransactionInput target = new TransactionInput(transactionMock2, byteArray, outpointMock, valueMock);
            doReturn(transactionOutPointMock).when(outpointMock).connectTransaction(transactionMock);
            doNothing().when(outMock).markAsSpent(target);
            //Act Statement(s)
            target.connect(outMock);
            //Assert statement(s)
            assertThat(target.getValue(), is(notNullValue()));
            assertThat(target.getOutpoint(), is(notNullValue()));
            verify(outMock).getParentTransaction();
            verify(outMock).getValue();
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(outpointMock).connectTransaction(transactionMock);
            verify(outMock).markAsSpent(target);
        }
    }

    //Sapient generated method id: ${b66710e8-231c-3740-b476-35e7ae432317}
    @Test()
    public void disconnectWhenOutpointConnectedOutputIsNull() {
        /* Branches:
         * (outpoint.fromTx != null) : false
         * (outpoint.connectedOutput != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
            //Act Statement(s)
            boolean result = target.disconnect();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${6100632e-584c-3d6d-a0b6-c5dcfb3c50b0}
    @Ignore()
    @Test()
    public void disconnectWhenConnectedOutputGetSpentByEqualsThis() {
        /* Branches:
         * (outpoint.fromTx != null) : false
         * (outpoint.connectedOutput != null) : true
         * (connectedOutput != null) : true
         * (connectedOutput.getSpentBy() == this) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
            doReturn(transactionOutPointMock).when(outpointMock).disconnectOutput();
            //Act Statement(s)
            boolean result = target.disconnect();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            assertThat(target.getOutpoint(), is(notNullValue()));
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(outpointMock).disconnectOutput();
        }
    }

    //Sapient generated method id: ${02687221-b8db-3111-8e5d-ae568d65b884}
    @Ignore()
    @Test()
    public void disconnectWhenConnectedOutputGetSpentByNotEqualsThis() {
        /* Branches:
         * (outpoint.fromTx != null) : false
         * (outpoint.connectedOutput != null) : true
         * (connectedOutput != null) : true
         * (connectedOutput.getSpentBy() == this) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
            doReturn(transactionOutPointMock).when(outpointMock).disconnectOutput();
            //Act Statement(s)
            boolean result = target.disconnect();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            assertThat(target.getOutpoint(), is(notNullValue()));
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(outpointMock).disconnectOutput();
        }
    }

    //Sapient generated method id: ${80efc5b5-6205-3ad4-bf22-18c5b5c0ddc6}
    @Test()
    public void hasSequenceWhenSequenceEqualsNO_SEQUENCE() {
        /* Branches:
         * (sequence != NO_SEQUENCE) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
            //Act Statement(s)
            boolean result = target.hasSequence();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${8ad1aaa3-9d87-33a8-bc54-dc23e9cc0dc8}
    @Test()
    public void isOptInFullRBFWhenSequenceNotLessThanNO_SEQUENCEMinus1() {
        /* Branches:
         * (sequence < NO_SEQUENCE - 1) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
            //Act Statement(s)
            boolean result = target.isOptInFullRBF();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${f116c685-1fb4-3350-b96e-cec0b57c0305}
    @Test()
    public void hasRelativeLockTimeWhenSequenceAndSEQUENCE_LOCKTIME_DISABLE_FLAGNotEquals0() {
        /* Branches:
         * ((sequence & SEQUENCE_LOCKTIME_DISABLE_FLAG) == 0) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
            //Act Statement(s)
            boolean result = target.hasRelativeLockTime();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${643f20a7-23a0-3bf8-b652-405708f718e7}
    @Ignore()
    @Test()
    public void verifyThrowsNullPointerException() throws VerificationException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            TransactionOutPoint transactionOutPoint = new TransactionOutPoint(0L, sha256HashMock);
            TransactionInput target = new TransactionInput(transactionMock, byteArray, transactionOutPoint, valueMock);
            thrown.expect(NullPointerException.class);
            //Act Statement(s)
            target.verify();
            //Assert statement(s)
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${7086c2bb-1138-33d5-9d30-cdce3f151a4e}
    @Ignore()
    @Test()
    public void verify1WhenGetOutpointHashNotEqualsOutputGetParentTransactionGetTxIdThrowsVerificationException() throws VerificationException {
        /* Branches:
         * (output.parent != null) : true
         * (!getOutpoint().hash().equals(output.getParentTransaction().getTxId())) : true
         */
        //Arrange Statement(s)
        Sha256Hash sha256HashMock2 = mock(Sha256Hash.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(transactionMock).when(outputMock).getParentTransaction();
            doReturn(sha256HashMock).when(transactionMock).getTxId();
            doReturn(sha256HashMock2).when(outpointMock).hash();
            doReturn(1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            TransactionInput target = new TransactionInput(transactionMock2, byteArray, outpointMock, valueMock);
            thrown.expect(VerificationException.class);
            //Act Statement(s)
            target.verify(outputMock);
            //Assert statement(s)
            verify(outputMock).getParentTransaction();
            verify(transactionMock).getTxId();
            verify(outpointMock).hash();
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${e7be2fa7-ac34-3238-9556-19b995b089fa}
    @Ignore()
    @Test()
    public void verify1WhenGetOutpointIndexNotEqualsOutputGetIndexThrowsVerificationException() throws VerificationException {
        /* Branches:
         * (output.parent != null) : true
         * (!getOutpoint().hash().equals(output.getParentTransaction().getTxId())) : false
         * (getOutpoint().index() != output.getIndex()) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(transactionMock).when(outputMock).getParentTransaction();
            doReturn(sha256HashMock).when(transactionMock).getTxId();
            doReturn(2).when(outputMock).getIndex();
            doReturn(sha256HashMock).when(outpointMock).hash();
            doReturn(1L).when(outpointMock).index();
            doReturn(1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            TransactionInput target = new TransactionInput(transactionMock2, byteArray, outpointMock, valueMock);
            thrown.expect(VerificationException.class);
            //Act Statement(s)
            target.verify(outputMock);
            //Assert statement(s)
            verify(outputMock).getParentTransaction();
            verify(transactionMock).getTxId();
            verify(outputMock).getIndex();
            verify(outpointMock).hash();
            verify(outpointMock).index();
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${112e73a9-dd4b-38b8-81a5-fe6b3afad428}
    @Ignore()
    @Test()
    public void verify1WhenGetOutpointIndexEqualsOutputGetIndexAndWitnessIsNull() throws VerificationException, ScriptException {
        /* Branches:
         * (output.parent != null) : true
         * (!getOutpoint().hash().equals(output.getParentTransaction().getTxId())) : false
         * (getOutpoint().index() != output.getIndex()) : false
         * (witness != null) : false  #  inside getWitness method
         */
        //Arrange Statement(s)
        Script scriptMock = mock(Script.class);
        Script scriptMock2 = mock(Script.class);
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(transactionMock).when(outputMock).getParentTransaction();
            doReturn(sha256HashMock).when(transactionMock).getTxId();
            doReturn(1).when(outputMock).getIndex();
            doReturn(scriptMock).when(outputMock).getScriptPubKey();
            doReturn(sha256HashMock).when(outpointMock).hash();
            doReturn(1L).when(outpointMock).index();
            doReturn(1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            TransactionInput target = spy(new TransactionInput(transactionMock2, byteArray, outpointMock, valueMock));
            doReturn(scriptMock2).when(target).getScriptSig();
            TransactionWitness transactionWitness = TransactionWitness.EMPTY;
            EnumSet<Script.VerifyFlag> scriptVerifyFlagSet = EnumSet.noneOf(Script.VerifyFlag.class);
            scriptVerifyFlagSet.add(Script.VerifyFlag.P2SH);
            scriptVerifyFlagSet.add(Script.VerifyFlag.STRICTENC);
            scriptVerifyFlagSet.add(Script.VerifyFlag.DERSIG);
            scriptVerifyFlagSet.add(Script.VerifyFlag.LOW_S);
            scriptVerifyFlagSet.add(Script.VerifyFlag.NULLDUMMY);
            scriptVerifyFlagSet.add(Script.VerifyFlag.SIGPUSHONLY);
            scriptVerifyFlagSet.add(Script.VerifyFlag.MINIMALDATA);
            scriptVerifyFlagSet.add(Script.VerifyFlag.DISCOURAGE_UPGRADABLE_NOPS);
            scriptVerifyFlagSet.add(Script.VerifyFlag.CLEANSTACK);
            scriptVerifyFlagSet.add(Script.VerifyFlag.CHECKLOCKTIMEVERIFY);
            scriptVerifyFlagSet.add(Script.VerifyFlag.CHECKSEQUENCEVERIFY);
            doNothing().when(scriptMock2).correctlySpends(transactionMock2, 0, transactionWitness, valueMock, scriptMock, scriptVerifyFlagSet);
            doReturn(0).when(target).getIndex();
            //Act Statement(s)
            target.verify(outputMock);
            //Assert statement(s)
            verify(outputMock).getParentTransaction();
            verify(transactionMock).getTxId();
            verify(outputMock).getIndex();
            verify(outputMock).getScriptPubKey();
            verify(outpointMock).hash();
            verify(outpointMock).index();
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(target).getScriptSig();
            verify(scriptMock2).correctlySpends(transactionMock2, 0, transactionWitness, valueMock, scriptMock, scriptVerifyFlagSet);
            verify(target).getIndex();
        }
    }

    //Sapient generated method id: ${c85a4b56-cb78-3780-9c35-027971cb545f}
    @Test()
    public void getConnectedOutput1Test() {
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(transactionOutputMock).when(outpointMock).getConnectedOutput();
            doReturn(1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
            //Act Statement(s)
            TransactionOutput result = target.getConnectedOutput();
            //Assert statement(s)
            assertThat(result, equalTo(transactionOutputMock));
            verify(outpointMock).getConnectedOutput();
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${acc384a7-2442-3705-be56-a2d70a22b75d}
    @Ignore()
    @Test()
    public void getConnectedTransactionTest() {
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            TransactionOutPoint transactionOutPoint = new TransactionOutPoint(0L, sha256HashMock);
            TransactionInput target = new TransactionInput(transactionMock, byteArray, transactionOutPoint, valueMock);
            //Act Statement(s)
            Transaction result = target.getConnectedTransaction();
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
        }
    }

    //Sapient generated method id: ${d5320fa5-0772-317f-8c63-a48c3fa3a306}
    @Test()
    public void isStandardTest() {
        //Arrange Statement(s)
        try (MockedStatic<DefaultRiskAnalysis> defaultRiskAnalysis = mockStatic(DefaultRiskAnalysis.class);
             MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            TransactionInput target = new TransactionInput(transactionMock, byteArray, outpointMock, valueMock);
            defaultRiskAnalysis.when(() -> DefaultRiskAnalysis.isInputStandard(target)).thenReturn(DefaultRiskAnalysis.RuleViolation.NONE);
            //Act Statement(s)
            DefaultRiskAnalysis.RuleViolation result = target.isStandard();
            //Assert statement(s)
            assertThat(result, equalTo(DefaultRiskAnalysis.RuleViolation.NONE));
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            defaultRiskAnalysis.verify(() -> DefaultRiskAnalysis.isInputStandard(target), atLeast(1));
        }
    }

    //Sapient generated method id: ${ac12355c-5fa5-35ca-8cc8-d6fa6908ea94}
    @Test()
    public void toStringWhenIsCoinBase() {
        /* Branches:
         * (isCoinBase()) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            TransactionInput target = spy(new TransactionInput(transactionMock, byteArray, outpointMock, valueMock));
            doReturn(true).when(target).isCoinBase();
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("TxIn: COINBASE"));
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(target).isCoinBase();
        }
    }

    //Sapient generated method id: ${e24aff67-bfdf-303f-9d47-a79b8b5297ee}
    @Ignore()
    @Test()
    public void toStringWhenFlagsNotIsEmpty() throws ScriptException {
        /* Branches:
         * (isCoinBase()) : false
         * (hasWitness()) : true
         * (hasSequence()) : true
         * (isOptInFullRBF()) : true
         * (!flags.isEmpty()) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            TransactionInput target = spy(new TransactionInput(transactionMock, byteArray, outpointMock, valueMock));
            doReturn(false).when(target).isCoinBase();
            doReturn(scriptMock).when(target).getScriptSig();
            doReturn(true).when(target).hasWitness();
            doReturn(true).when(target).hasSequence();
            doReturn(true).when(target).isOptInFullRBF();
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("TxIn for [<init>_transactionOutPoint1]: toString_script1 (witness, sequence: ffffffff, opts into full RBF)"));
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(target).isCoinBase();
            verify(target).getScriptSig();
            verify(target).hasWitness();
            verify(target).hasSequence();
            verify(target).isOptInFullRBF();
        }
    }

    //Sapient generated method id: ${061b5247-9952-34cf-9a22-22438c844f30}
    @Ignore()
    @Test()
    public void toStringWhenFlagsIsEmpty() throws ScriptException {
        /* Branches:
         * (isCoinBase()) : false
         * (hasWitness()) : false
         * (hasSequence()) : false
         * (isOptInFullRBF()) : false
         * (!flags.isEmpty()) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(1).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            TransactionInput target = spy(new TransactionInput(transactionMock, byteArray, outpointMock, valueMock));
            doReturn(false).when(target).isCoinBase();
            doReturn(scriptMock).when(target).getScriptSig();
            doReturn(false).when(target).hasWitness();
            doReturn(false).when(target).hasSequence();
            doReturn(false).when(target).isOptInFullRBF();
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("TxIn for [<init>_transactionOutPoint1]: toString_script1"));
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(target).isCoinBase();
            verify(target).getScriptSig();
            verify(target).hasWitness();
            verify(target).hasSequence();
            verify(target).isOptInFullRBF();
        }
    }

    //Sapient generated method id: ${f95e4bba-ad57-3f8a-832e-0bb28c66f6d9}
    @Ignore()
    @Test()
    public void toStringWhenCaughtScriptException() throws ScriptException {
        /* Branches:
         * (isCoinBase()) : false
         * (hasWitness()) : true
         * (hasSequence()) : true
         * (isOptInFullRBF()) : true
         * (!flags.isEmpty()) : true
         * (catch-exception (ScriptException)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(0).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            TransactionInput target = spy(new TransactionInput(transactionMock, byteArray, outpointMock, valueMock));
            doReturn(false).when(target).isCoinBase();
            ScriptException scriptException = new ScriptException(ScriptError.SCRIPT_ERR_OK, "A");
            doThrow(scriptException).when(target).getScriptSig();
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("TxIn for [<init>_transactionOutPoint1]:  [exception: A]"));
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(target).isCoinBase();
            verify(target).getScriptSig();
        }
    }

    //Sapient generated method id: ${881d0539-e819-3463-a62e-0cb7f4940bfc}
    @Ignore()
    @Test()
    public void toStringWhenFlagsIsEmptyAndCaughtScriptException() throws ScriptException {
        /* Branches:
         * (isCoinBase()) : false
         * (hasWitness()) : false
         * (hasSequence()) : false
         * (isOptInFullRBF()) : false
         * (!flags.isEmpty()) : false
         * (catch-exception (ScriptException)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Preconditions> preconditions = mockStatic(Preconditions.class)) {
            doReturn(0).when(valueMock).signum();
            preconditions.when(() -> Preconditions.checkArgument(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            byte[] byteArray = new byte[]{};
            TransactionInput target = spy(new TransactionInput(transactionMock, byteArray, outpointMock, valueMock));
            doReturn(false).when(target).isCoinBase();
            ScriptException scriptException = new ScriptException(ScriptError.SCRIPT_ERR_OK, "A");
            doThrow(scriptException).when(target).getScriptSig();
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("TxIn for [<init>_transactionOutPoint1]:  [exception: A]"));
            verify(valueMock).signum();
            preconditions.verify(() -> Preconditions.checkArgument(eq(true), (Supplier) any()));
            verify(target).isCoinBase();
            verify(target).getScriptSig();
        }
    }
}
